/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 19 17:18:41 GMT 2019
 */

package org.sat4j.tools;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.sat4j.minisat.constraints.CardinalityDataStructure;
import org.sat4j.minisat.core.SearchParams;
import org.sat4j.minisat.core.Solver;
import org.sat4j.minisat.learning.ClauseOnlyLearning;
import org.sat4j.minisat.learning.FixedLengthLearning;
import org.sat4j.minisat.orders.LevelBasedVarOrderHeap;
import org.sat4j.minisat.restarts.ArminRestarts;
import org.sat4j.opt.MinOneDecorator;
import org.sat4j.specs.IConstr;
import org.sat4j.specs.ILogAble;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.SearchListener;
import org.sat4j.tools.ClausalCardinalitiesDecorator;
import org.sat4j.tools.DimacsStringSolver;
import org.sat4j.tools.LexicoDecorator;
import org.sat4j.tools.ManyCore;
import org.sat4j.tools.MultiTracing;
import org.sat4j.tools.SolutionCounter;
import org.sat4j.tools.encoding.EncodingStrategyAdapter;
import org.sat4j.tools.encoding.Ladder;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SolutionCounter_ESTest extends SolutionCounter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[1];
      intArray0[0] = 1;
      LinkedList<SearchListener<Solver<CardinalityDataStructure>>> linkedList0 = new LinkedList<SearchListener<Solver<CardinalityDataStructure>>>();
      MultiTracing<Solver<CardinalityDataStructure>> multiTracing0 = new MultiTracing<Solver<CardinalityDataStructure>>(linkedList0);
      MinOneDecorator minOneDecorator0 = mock(MinOneDecorator.class, new ViolatedAssumptionAnswer());
      doReturn(intArray0).when(minOneDecorator0).model();
      doReturn((IConstr) null).when(minOneDecorator0).addClause(any(org.sat4j.specs.IVecInt.class));
      doReturn(true, false).when(minOneDecorator0).isSatisfiable(anyBoolean());
      ClausalCardinalitiesDecorator<MinOneDecorator> clausalCardinalitiesDecorator0 = new ClausalCardinalitiesDecorator<MinOneDecorator>(minOneDecorator0, (EncodingStrategyAdapter) null);
      SolutionCounter solutionCounter0 = new SolutionCounter(clausalCardinalitiesDecorator0);
      long long0 = solutionCounter0.countSolutions();
      assertEquals(1, solutionCounter0.lowerBound());
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String[] stringArray0 = new String[1];
      DimacsStringSolver[] dimacsStringSolverArray0 = new DimacsStringSolver[4];
      DimacsStringSolver dimacsStringSolver0 = mock(DimacsStringSolver.class, new ViolatedAssumptionAnswer());
      dimacsStringSolverArray0[0] = dimacsStringSolver0;
      dimacsStringSolverArray0[1] = dimacsStringSolver0;
      dimacsStringSolverArray0[2] = dimacsStringSolver0;
      dimacsStringSolverArray0[3] = dimacsStringSolver0;
      ManyCore<DimacsStringSolver> manyCore0 = new ManyCore<DimacsStringSolver>(stringArray0, dimacsStringSolverArray0);
      MinOneDecorator minOneDecorator0 = new MinOneDecorator(manyCore0);
      Ladder ladder0 = new Ladder();
      ClausalCardinalitiesDecorator<MinOneDecorator> clausalCardinalitiesDecorator0 = new ClausalCardinalitiesDecorator<MinOneDecorator>(minOneDecorator0, ladder0);
      SolutionCounter solutionCounter0 = new SolutionCounter(clausalCardinalitiesDecorator0);
      // Undeclared exception!
      try { 
        solutionCounter0.countSolutions();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.ManyCore", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SolutionCounter solutionCounter0 = new SolutionCounter((ISolver) null);
      // Undeclared exception!
      try { 
        solutionCounter0.countSolutions();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.SolverDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      SearchParams searchParams0 = new SearchParams();
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      ArminRestarts arminRestarts0 = new ArminRestarts();
      ILogAble iLogAble0 = ILogAble.CONSOLE;
      ClauseOnlyLearning<CardinalityDataStructure> clauseOnlyLearning0 = new ClauseOnlyLearning<CardinalityDataStructure>();
      Solver<CardinalityDataStructure> solver0 = new Solver<CardinalityDataStructure>(clauseOnlyLearning0, cardinalityDataStructure0, searchParams0, levelBasedVarOrderHeap0, arminRestarts0, iLogAble0);
      solver0.registerLiteral(209);
      SolutionCounter solutionCounter0 = new SolutionCounter(solver0);
      long long0 = solutionCounter0.countSolutions();
      assertEquals(2, solutionCounter0.lowerBound());
      assertEquals(2L, long0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MinOneDecorator minOneDecorator0 = mock(MinOneDecorator.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(minOneDecorator0).isSatisfiable(anyBoolean());
      LexicoDecorator<MinOneDecorator> lexicoDecorator0 = new LexicoDecorator<MinOneDecorator>(minOneDecorator0);
      SolutionCounter solutionCounter0 = new SolutionCounter(lexicoDecorator0);
      long long0 = solutionCounter0.countSolutions();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FixedLengthLearning<CardinalityDataStructure> fixedLengthLearning0 = new FixedLengthLearning<CardinalityDataStructure>();
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      SearchParams searchParams0 = new SearchParams();
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      ArminRestarts arminRestarts0 = new ArminRestarts();
      ILogAble iLogAble0 = ILogAble.CONSOLE;
      Solver<CardinalityDataStructure> solver0 = new Solver<CardinalityDataStructure>(fixedLengthLearning0, cardinalityDataStructure0, searchParams0, levelBasedVarOrderHeap0, arminRestarts0, iLogAble0);
      SolutionCounter solutionCounter0 = new SolutionCounter(solver0);
      solutionCounter0.countSolutions();
      int int0 = solutionCounter0.lowerBound();
      assertEquals(100L, arminRestarts0.nextRestartNumberOfConflict());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      FixedLengthLearning<CardinalityDataStructure> fixedLengthLearning0 = new FixedLengthLearning<CardinalityDataStructure>();
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      SearchParams searchParams0 = new SearchParams();
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      ArminRestarts arminRestarts0 = new ArminRestarts();
      ILogAble iLogAble0 = ILogAble.CONSOLE;
      Solver<CardinalityDataStructure> solver0 = new Solver<CardinalityDataStructure>(fixedLengthLearning0, cardinalityDataStructure0, searchParams0, levelBasedVarOrderHeap0, arminRestarts0, iLogAble0);
      SolutionCounter solutionCounter0 = new SolutionCounter(solver0);
      int int0 = solutionCounter0.lowerBound();
      assertEquals(0, int0);
  }
}