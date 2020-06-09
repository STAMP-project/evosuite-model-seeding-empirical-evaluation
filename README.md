# EvoSuite Runner
This tool is designed for running an empirical evaluation for EvoSuite model seeding. It can execute EvoSuite in three different modes:
- __no-seeding:__ Run EvoSuite without any call-sequence seeding.
- __test_seeding:__ Run EvoSuite with seeding call-sequences which are derived from the execution tests.
- __model_seeding:__ Run EvoSuite with seeding call sequences from the models inferring from the static analysis on the source code of software under test and dynamic analysis on the existing test cases.

## Required inputs
This tool needs three inputs:

- __binary files:__ the compiled packages of the software under test should be located in `bins/[Project_name]`.
- __models for model_seeding:__ the generated models by botsing model generation. They should all be located in directory `analysis-result/[Project_name]/models`.

- __related test list for test_seeding:__ the generated xml files containing  the related tests. These xml files are generated by botsin model generation as well. They should all be located in directory `analysis-result/[Project_name]/carvedTests`.
- __classes.csv file:__ This CSV file contains the list of the classes in the target projects that we want to generate unit tests for them. The first column of this CSV file is the name of the target class, and the second one indicates the project name.


## Run EvoSuite in no_seeding mode
With docker:

```
. docker-run.sh <Rounds> <Maximum_java_processes>
```

Without docker:
```
. main.sh <Rounds> <List_of_classes> <Maximum_java_processes> <search_budget> <population> <seeding_probabilities>
```


## Run EvoSuite in test_seeding mode
With docker:

```
. docker-run.sh -t <Rounds> <Maximum_java_processes>
```

Without docker:
```
. main.sh -t <Rounds> <List_of_classes> <Maximum_java_processes> <search_budget> <population> <seeding_probabilities>
```


## Run EvoSuite in model_seeding mode
With docker:

```
. docker-run.sh -m [-r] <Rounds> <Maximum_java_processes> <object_pool_usage_probabilities> <seeding_probabilities>
```

Without docker:
```
. main.sh -m [-r] <Rounds> <List_of_classes> <Maximum_java_processes> <search_budget> <population> <object_pool_usage_probabilities> <seeding_probabilities>
```

## parameters
__<Rounds>__ indicates the number of times that we want to repeat each experiment. The minimum value for the empirical evaluation should be 10. __<List_of_classes>__ points to `classes.csv` file. __<Maximum_java_processes>__ Limits the number of parallel java processes. __<search_budget>__ is the number of seconds that EvoSuite has for each test generation execution. __<population>__ is the number of test individuals in each generation of the search process. Finally, __<seeding_probabilities>__ is comma separated probabilities for seed_clone.

**Note #1:** Each EvoSuite execution launches two java processes (Master & Client). So, the number of parallel evosuite instances will be half of `<Maximum_java_processes>`.

## Output
The valuable data about the result of the execution save in `results/` directory csv files. The generated tests will be stored in `generated_tests/<no_seeding | test_seeding | model_seeding>/<project_name>-<target_class>-<clone_seed_probability>-<id_of_round>`.


## Run PIT on the generated tests

After generating tests, you just need to run `run_pitest.sh` file in the root directory. This script, first, finds all of the existing generated test cases. Then, it removes all of the flaky tests from the generated tests (it runs each of the test cases 5 times. If any test fails even one time, it will be ignored). Finally, it applies PIT on the existing test cases. 

The PIT report is saved in the following directory:

```
pitest/out/<no_seeding | test_seeding | model_seeding>/<project_name>-<target_class>-<clone_seed_probability>-<id_of_round>
```