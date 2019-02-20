/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 18 01:32:53 GMT 2019
 */

package org.sat4j.minisat.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.sat4j.core.Vec;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.constraints.CardinalityDataStructure;
import org.sat4j.minisat.constraints.CardinalityDataStructureYanMax;
import org.sat4j.minisat.constraints.ClausalDataStructureWL;
import org.sat4j.minisat.constraints.MixedDataStructureDanielHT;
import org.sat4j.minisat.constraints.MixedDataStructureDanielWL;
import org.sat4j.minisat.constraints.MixedDataStructureDanielWLConciseBinary;
import org.sat4j.minisat.constraints.MixedDataStructureSingleWL;
import org.sat4j.minisat.constraints.card.AtLeast;
import org.sat4j.minisat.constraints.cnf.BinaryClauses;
import org.sat4j.minisat.constraints.cnf.CBClause;
import org.sat4j.minisat.constraints.cnf.Lits;
import org.sat4j.minisat.constraints.cnf.UnitClauses;
import org.sat4j.minisat.core.ActivityLCDS;
import org.sat4j.minisat.core.ConflictTimer;
import org.sat4j.minisat.core.DataStructureFactory;
import org.sat4j.minisat.core.ILits;
import org.sat4j.minisat.core.RestartStrategy;
import org.sat4j.minisat.core.SearchParams;
import org.sat4j.minisat.core.Solver;
import org.sat4j.minisat.learning.ActiveLearning;
import org.sat4j.minisat.learning.ClauseOnlyLearning;
import org.sat4j.minisat.learning.FixedLengthLearning;
import org.sat4j.minisat.learning.NoLearningButHeuristics;
import org.sat4j.minisat.learning.NoLearningNoHeuristics;
import org.sat4j.minisat.learning.PercentLengthLearning;
import org.sat4j.minisat.orders.LevelBasedVarOrderHeap;
import org.sat4j.minisat.orders.NaturalStaticOrder;
import org.sat4j.minisat.orders.PureOrder;
import org.sat4j.minisat.orders.RandomLiteralSelectionStrategy;
import org.sat4j.minisat.orders.SubsetVarOrder;
import org.sat4j.minisat.orders.TabuListDecorator;
import org.sat4j.minisat.orders.VarOrderHeap;
import org.sat4j.minisat.restarts.ArminRestarts;
import org.sat4j.minisat.restarts.EMARestarts;
import org.sat4j.minisat.restarts.FixedPeriodRestarts;
import org.sat4j.minisat.restarts.Glucose21Restarts;
import org.sat4j.minisat.restarts.LubyRestarts;
import org.sat4j.minisat.restarts.MiniSATRestarts;
import org.sat4j.specs.Constr;
import org.sat4j.specs.ILogAble;
import org.sat4j.specs.IVec;
import org.sat4j.specs.IVecInt;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ActivityLCDS_ESTest extends ActivityLCDS_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClausalDataStructureWL clausalDataStructureWL0 = new ClausalDataStructureWL();
      NoLearningNoHeuristics<ClausalDataStructureWL> noLearningNoHeuristics0 = new NoLearningNoHeuristics<ClausalDataStructureWL>();
      NaturalStaticOrder naturalStaticOrder0 = new NaturalStaticOrder();
      Glucose21Restarts glucose21Restarts0 = new Glucose21Restarts();
      Solver<ClausalDataStructureWL> solver0 = new Solver<ClausalDataStructureWL>(noLearningNoHeuristics0, clausalDataStructureWL0, naturalStaticOrder0, glucose21Restarts0);
      Vec<Constr> vec0 = new Vec<Constr>();
      ActivityLCDS activityLCDS0 = new ActivityLCDS(solver0, glucose21Restarts0);
      Constr constr0 = Constr.TAUTOLOGY;
      clausalDataStructureWL0.learnConstraint(constr0);
      clausalDataStructureWL0.learnConstraint(constr0);
      clausalDataStructureWL0.learnConstraint(constr0);
      clausalDataStructureWL0.learnConstraint(constr0);
      activityLCDS0.reduce(vec0);
      assertEquals(0, vec0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ActiveLearning<MixedDataStructureDanielWLConciseBinary> activeLearning0 = new ActiveLearning<MixedDataStructureDanielWLConciseBinary>(1.0);
      MixedDataStructureDanielWLConciseBinary mixedDataStructureDanielWLConciseBinary0 = new MixedDataStructureDanielWLConciseBinary();
      SearchParams searchParams0 = new SearchParams(2142.848767064934, 320);
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      ILogAble iLogAble0 = ILogAble.CONSOLE;
      Solver<MixedDataStructureDanielWLConciseBinary> solver0 = new Solver<MixedDataStructureDanielWLConciseBinary>(activeLearning0, mixedDataStructureDanielWLConciseBinary0, searchParams0, varOrderHeap0, (RestartStrategy) null, iLogAble0);
      ActivityLCDS activityLCDS0 = new ActivityLCDS(solver0, (ConflictTimer) null);
      ConflictTimer conflictTimer0 = activityLCDS0.getTimer();
      assertNull(conflictTimer0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClausalDataStructureWL clausalDataStructureWL0 = new ClausalDataStructureWL();
      NoLearningNoHeuristics<ClausalDataStructureWL> noLearningNoHeuristics0 = new NoLearningNoHeuristics<ClausalDataStructureWL>();
      NaturalStaticOrder naturalStaticOrder0 = new NaturalStaticOrder();
      Glucose21Restarts glucose21Restarts0 = new Glucose21Restarts();
      Solver<ClausalDataStructureWL> solver0 = new Solver<ClausalDataStructureWL>(noLearningNoHeuristics0, clausalDataStructureWL0, naturalStaticOrder0, glucose21Restarts0);
      Vec<Constr> vec0 = new Vec<Constr>();
      Constr constr0 = Constr.TAUTOLOGY;
      BinaryClauses binaryClauses0 = new BinaryClauses((ILits) null, (-1));
      clausalDataStructureWL0.learnConstraint(binaryClauses0);
      clausalDataStructureWL0.learnConstraint(constr0);
      ActivityLCDS activityLCDS0 = new ActivityLCDS(solver0, glucose21Restarts0);
      // Undeclared exception!
      try { 
        activityLCDS0.reduce(vec0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot remove all the binary clauses at once!
         //
         verifyException("org.sat4j.minisat.constraints.cnf.BinaryClauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FixedPeriodRestarts fixedPeriodRestarts0 = new FixedPeriodRestarts();
      ActivityLCDS activityLCDS0 = new ActivityLCDS((Solver<? extends DataStructureFactory>) null, fixedPeriodRestarts0);
      Vec<Constr> vec0 = new Vec<Constr>();
      // Undeclared exception!
      try { 
        activityLCDS0.reduce(vec0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.core.ActivityLCDS", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClausalDataStructureWL clausalDataStructureWL0 = new ClausalDataStructureWL();
      NoLearningNoHeuristics<ClausalDataStructureWL> noLearningNoHeuristics0 = new NoLearningNoHeuristics<ClausalDataStructureWL>();
      NaturalStaticOrder naturalStaticOrder0 = new NaturalStaticOrder();
      Glucose21Restarts glucose21Restarts0 = new Glucose21Restarts();
      Solver<ClausalDataStructureWL> solver0 = new Solver<ClausalDataStructureWL>(noLearningNoHeuristics0, clausalDataStructureWL0, naturalStaticOrder0, glucose21Restarts0);
      Vec<Constr> vec0 = new Vec<Constr>();
      ActivityLCDS activityLCDS0 = new ActivityLCDS(solver0, glucose21Restarts0);
      VecInt vecInt0 = new VecInt();
      Lits lits0 = new Lits();
      CBClause cBClause0 = new CBClause(vecInt0, lits0);
      clausalDataStructureWL0.learnConstraint(cBClause0);
      clausalDataStructureWL0.learnConstraint(cBClause0);
      // Undeclared exception!
      try { 
        activityLCDS0.reduce(vec0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.sat4j.minisat.constraints.cnf.CBClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClausalDataStructureWL clausalDataStructureWL0 = new ClausalDataStructureWL();
      NoLearningNoHeuristics<ClausalDataStructureWL> noLearningNoHeuristics0 = new NoLearningNoHeuristics<ClausalDataStructureWL>();
      NaturalStaticOrder naturalStaticOrder0 = new NaturalStaticOrder();
      Glucose21Restarts glucose21Restarts0 = new Glucose21Restarts();
      Solver<ClausalDataStructureWL> solver0 = new Solver<ClausalDataStructureWL>(noLearningNoHeuristics0, clausalDataStructureWL0, naturalStaticOrder0, glucose21Restarts0);
      ActivityLCDS activityLCDS0 = new ActivityLCDS(solver0, glucose21Restarts0);
      FixedLengthLearning<MixedDataStructureDanielWL> fixedLengthLearning0 = new FixedLengthLearning<MixedDataStructureDanielWL>();
      MixedDataStructureDanielWL mixedDataStructureDanielWL0 = new MixedDataStructureDanielWL();
      Solver<MixedDataStructureDanielWL> solver1 = new Solver<MixedDataStructureDanielWL>(fixedLengthLearning0, mixedDataStructureDanielWL0, naturalStaticOrder0, glucose21Restarts0);
      VecInt vecInt0 = (VecInt)solver1.decisions;
      UnitClauses unitClauses0 = new UnitClauses(vecInt0);
      // Undeclared exception!
      try { 
        activityLCDS0.onConflictAnalysis(unitClauses0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.UnitClauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NoLearningNoHeuristics<MixedDataStructureSingleWL> noLearningNoHeuristics0 = new NoLearningNoHeuristics<MixedDataStructureSingleWL>();
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      ArminRestarts arminRestarts0 = new ArminRestarts();
      Solver<MixedDataStructureSingleWL> solver0 = new Solver<MixedDataStructureSingleWL>(noLearningNoHeuristics0, mixedDataStructureSingleWL0, varOrderHeap0, arminRestarts0);
      ActivityLCDS activityLCDS0 = new ActivityLCDS(solver0, arminRestarts0);
      // Undeclared exception!
      try { 
        activityLCDS0.onConflictAnalysis((Constr) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.core.ActivityLCDS", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NoLearningNoHeuristics<CardinalityDataStructureYanMax> noLearningNoHeuristics0 = new NoLearningNoHeuristics<CardinalityDataStructureYanMax>();
      CardinalityDataStructureYanMax cardinalityDataStructureYanMax0 = new CardinalityDataStructureYanMax();
      SearchParams searchParams0 = new SearchParams(3621);
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      MiniSATRestarts miniSATRestarts0 = new MiniSATRestarts();
      NoLearningNoHeuristics<MixedDataStructureSingleWL> noLearningNoHeuristics1 = new NoLearningNoHeuristics<MixedDataStructureSingleWL>();
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      Solver<MixedDataStructureSingleWL> solver0 = new Solver<MixedDataStructureSingleWL>(noLearningNoHeuristics1, mixedDataStructureSingleWL0, searchParams0, varOrderHeap0, miniSATRestarts0);
      VecInt vecInt0 = (VecInt)solver0.trailLim;
      Constr constr0 = cardinalityDataStructureYanMax0.createUnregisteredClause(vecInt0);
      ClauseOnlyLearning<MixedDataStructureDanielHT> clauseOnlyLearning0 = new ClauseOnlyLearning<MixedDataStructureDanielHT>();
      MixedDataStructureDanielHT mixedDataStructureDanielHT0 = new MixedDataStructureDanielHT();
      Solver<MixedDataStructureDanielHT> solver1 = new Solver<MixedDataStructureDanielHT>(clauseOnlyLearning0, mixedDataStructureDanielHT0, searchParams0, varOrderHeap0, miniSATRestarts0);
      ILogAble iLogAble0 = solver1.getLogger();
      Solver<CardinalityDataStructureYanMax> solver2 = new Solver<CardinalityDataStructureYanMax>(noLearningNoHeuristics0, cardinalityDataStructureYanMax0, searchParams0, varOrderHeap0, miniSATRestarts0, iLogAble0);
      LubyRestarts lubyRestarts0 = new LubyRestarts();
      ActivityLCDS activityLCDS0 = new ActivityLCDS(solver2, lubyRestarts0);
      activityLCDS0.onConflictAnalysis(constr0);
      assertEquals(1.0, constr0.getActivity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClausalDataStructureWL clausalDataStructureWL0 = new ClausalDataStructureWL();
      NoLearningNoHeuristics<ClausalDataStructureWL> noLearningNoHeuristics0 = new NoLearningNoHeuristics<ClausalDataStructureWL>();
      NaturalStaticOrder naturalStaticOrder0 = new NaturalStaticOrder();
      Glucose21Restarts glucose21Restarts0 = new Glucose21Restarts();
      Solver<ClausalDataStructureWL> solver0 = new Solver<ClausalDataStructureWL>(noLearningNoHeuristics0, clausalDataStructureWL0, naturalStaticOrder0, glucose21Restarts0);
      ActivityLCDS activityLCDS0 = new ActivityLCDS(solver0, glucose21Restarts0);
      Constr constr0 = Constr.TAUTOLOGY;
      activityLCDS0.onConflictAnalysis(constr0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      ArminRestarts arminRestarts0 = new ArminRestarts();
      MiniSATRestarts miniSATRestarts0 = new MiniSATRestarts();
      NoLearningButHeuristics<MixedDataStructureDanielWL> noLearningButHeuristics0 = new NoLearningButHeuristics<MixedDataStructureDanielWL>();
      MixedDataStructureDanielWL mixedDataStructureDanielWL0 = new MixedDataStructureDanielWL();
      PercentLengthLearning<CardinalityDataStructure> percentLengthLearning0 = new PercentLengthLearning<CardinalityDataStructure>(2);
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      Solver<CardinalityDataStructure> solver0 = new Solver<CardinalityDataStructure>(percentLengthLearning0, cardinalityDataStructure0, varOrderHeap0, arminRestarts0);
      SearchParams searchParams0 = solver0.getSearchParams();
      Solver<MixedDataStructureDanielWL> solver1 = new Solver<MixedDataStructureDanielWL>(noLearningButHeuristics0, mixedDataStructureDanielWL0, searchParams0, varOrderHeap0, arminRestarts0);
      solver1.verbose = true;
      ActivityLCDS activityLCDS0 = new ActivityLCDS(solver1, miniSATRestarts0);
      IVec<Constr> iVec0 = solver0.constrs;
      activityLCDS0.reduce(iVec0);
      assertTrue(iVec0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClauseOnlyLearning<MixedDataStructureDanielWLConciseBinary> clauseOnlyLearning0 = new ClauseOnlyLearning<MixedDataStructureDanielWLConciseBinary>();
      MixedDataStructureDanielWLConciseBinary mixedDataStructureDanielWLConciseBinary0 = new MixedDataStructureDanielWLConciseBinary();
      PureOrder pureOrder0 = new PureOrder((-1520));
      LubyRestarts lubyRestarts0 = new LubyRestarts();
      Solver<MixedDataStructureDanielWLConciseBinary> solver0 = new Solver<MixedDataStructureDanielWLConciseBinary>(clauseOnlyLearning0, mixedDataStructureDanielWLConciseBinary0, pureOrder0, lubyRestarts0);
      ActivityLCDS activityLCDS0 = new ActivityLCDS(solver0, lubyRestarts0);
      activityLCDS0.init();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ArminRestarts arminRestarts0 = new ArminRestarts();
      ActivityLCDS activityLCDS0 = new ActivityLCDS((Solver<? extends DataStructureFactory>) null, arminRestarts0);
      String string0 = activityLCDS0.toString();
      assertEquals("Activity based learned constraints deletion strategy with timer Armin Biere (Picosat) restarts strategy", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ActiveLearning<ClausalDataStructureWL> activeLearning0 = new ActiveLearning<ClausalDataStructureWL>();
      ClausalDataStructureWL clausalDataStructureWL0 = new ClausalDataStructureWL();
      RandomLiteralSelectionStrategy randomLiteralSelectionStrategy0 = new RandomLiteralSelectionStrategy();
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap(randomLiteralSelectionStrategy0);
      FixedPeriodRestarts fixedPeriodRestarts0 = new FixedPeriodRestarts();
      Solver<ClausalDataStructureWL> solver0 = new Solver<ClausalDataStructureWL>(activeLearning0, clausalDataStructureWL0, levelBasedVarOrderHeap0, fixedPeriodRestarts0);
      ActivityLCDS activityLCDS0 = new ActivityLCDS(solver0, fixedPeriodRestarts0);
      ILits iLits0 = solver0.getVocabulary();
      IVecInt iVecInt0 = VecInt.EMPTY;
      AtLeast atLeast0 = new AtLeast(iLits0, iVecInt0, (-671));
      activityLCDS0.onPropagation(atLeast0);
      assertFalse(atLeast0.canBePropagatedMultipleTimes());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NoLearningNoHeuristics<MixedDataStructureSingleWL> noLearningNoHeuristics0 = new NoLearningNoHeuristics<MixedDataStructureSingleWL>();
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      ArminRestarts arminRestarts0 = new ArminRestarts();
      Solver<MixedDataStructureSingleWL> solver0 = new Solver<MixedDataStructureSingleWL>(noLearningNoHeuristics0, mixedDataStructureSingleWL0, varOrderHeap0, arminRestarts0);
      ActivityLCDS activityLCDS0 = new ActivityLCDS(solver0, arminRestarts0);
      ConflictTimer conflictTimer0 = activityLCDS0.getTimer();
      assertSame(arminRestarts0, conflictTimer0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ActiveLearning<CardinalityDataStructure> activeLearning0 = new ActiveLearning<CardinalityDataStructure>(0.0);
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      int[] intArray0 = new int[2];
      SubsetVarOrder subsetVarOrder0 = new SubsetVarOrder(intArray0);
      TabuListDecorator tabuListDecorator0 = new TabuListDecorator(subsetVarOrder0, (-319));
      EMARestarts eMARestarts0 = new EMARestarts();
      Solver<CardinalityDataStructure> solver0 = new Solver<CardinalityDataStructure>(activeLearning0, cardinalityDataStructure0, tabuListDecorator0, eMARestarts0);
      ActivityLCDS activityLCDS0 = new ActivityLCDS(solver0, eMARestarts0);
      activityLCDS0.onClauseLearning((Constr) null);
  }
}