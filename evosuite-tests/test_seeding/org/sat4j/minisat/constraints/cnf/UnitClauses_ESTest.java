/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 17 08:06:00 GMT 2019
 */

package org.sat4j.minisat.constraints.cnf;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.constraints.MixedDataStructureDanielHT;
import org.sat4j.minisat.constraints.cnf.UnitClauses;
import org.sat4j.minisat.core.Solver;
import org.sat4j.minisat.learning.NoLearningNoHeuristics;
import org.sat4j.minisat.learning.PercentLengthLearning;
import org.sat4j.minisat.orders.LevelBasedVarOrderHeap;
import org.sat4j.minisat.orders.VarOrderHeap;
import org.sat4j.minisat.restarts.LubyRestarts;
import org.sat4j.opt.MaxSatDecorator;
import org.sat4j.opt.MinOneDecorator;
import org.sat4j.specs.IConstr;
import org.sat4j.specs.IVecInt;
import org.sat4j.specs.MandatoryLiteralListener;
import org.sat4j.specs.UnitPropagationListener;
import org.sat4j.specs.VarMapper;
import org.sat4j.tools.AbstractMinimalModel;
import org.sat4j.tools.FullClauseSelectorSolver;
import org.sat4j.tools.ManyCore;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UnitClauses_ESTest extends UnitClauses_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MinOneDecorator[] minOneDecoratorArray0 = new MinOneDecorator[9];
      MinOneDecorator minOneDecorator0 = mock(MinOneDecorator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(minOneDecorator0).nVars();
      minOneDecoratorArray0[0] = minOneDecorator0;
      minOneDecoratorArray0[1] = minOneDecorator0;
      minOneDecoratorArray0[2] = minOneDecorator0;
      minOneDecoratorArray0[3] = minOneDecorator0;
      minOneDecoratorArray0[4] = minOneDecorator0;
      minOneDecoratorArray0[5] = minOneDecorator0;
      minOneDecoratorArray0[6] = minOneDecorator0;
      minOneDecoratorArray0[7] = minOneDecorator0;
      minOneDecoratorArray0[8] = minOneDecorator0;
      ManyCore<MinOneDecorator> manyCore0 = new ManyCore<MinOneDecorator>(false, minOneDecoratorArray0);
      IVecInt iVecInt0 = AbstractMinimalModel.negativeLiterals(manyCore0);
      UnitClauses unitClauses0 = new UnitClauses(iVecInt0);
      FullClauseSelectorSolver<MinOneDecorator> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<MinOneDecorator>(minOneDecoratorArray0[1], true);
      IVecInt iVecInt1 = fullClauseSelectorSolver0.getLastClause();
      // Undeclared exception!
      try { 
        unitClauses0.calcReasonOnTheFly(0, iVecInt1, iVecInt0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.UnitClauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      NoLearningNoHeuristics<MixedDataStructureDanielHT> noLearningNoHeuristics0 = new NoLearningNoHeuristics<MixedDataStructureDanielHT>();
      MixedDataStructureDanielHT mixedDataStructureDanielHT0 = new MixedDataStructureDanielHT();
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      LubyRestarts lubyRestarts0 = new LubyRestarts();
      Solver<MixedDataStructureDanielHT> solver0 = new Solver<MixedDataStructureDanielHT>(noLearningNoHeuristics0, mixedDataStructureDanielHT0, varOrderHeap0, lubyRestarts0);
      MinOneDecorator minOneDecorator0 = mock(MinOneDecorator.class, new ViolatedAssumptionAnswer());
      doReturn((IConstr) null).when(minOneDecorator0).addClause(any(org.sat4j.specs.IVecInt.class));
      doReturn(0, 0, 0).when(minOneDecorator0).nextFreeVarId(anyBoolean());
      FullClauseSelectorSolver<MinOneDecorator> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<MinOneDecorator>(minOneDecorator0, false);
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(fullClauseSelectorSolver0);
      MinOneDecorator minOneDecorator1 = new MinOneDecorator(maxSatDecorator0);
      minOneDecorator1.addClause(vecInt0);
      UnitClauses unitClauses0 = new UnitClauses(vecInt0);
      unitClauses0.remove(solver0);
      assertFalse(solver0.isDBSimplificationAllowed());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MinOneDecorator minOneDecorator0 = mock(MinOneDecorator.class, new ViolatedAssumptionAnswer());
      FullClauseSelectorSolver<MinOneDecorator> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<MinOneDecorator>(minOneDecorator0, true);
      IVecInt iVecInt0 = fullClauseSelectorSolver0.getLastClause();
      UnitClauses unitClauses0 = new UnitClauses(iVecInt0);
      unitClauses0.incActivity((-1));
      assertFalse(unitClauses0.simplify());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      UnitClauses unitClauses0 = new UnitClauses(vecInt0);
      // Undeclared exception!
      try { 
        unitClauses0.remove((UnitPropagationListener) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.UnitClauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      VecInt vecInt0 = new VecInt(0, (-1));
      NoLearningNoHeuristics<MixedDataStructureDanielHT> noLearningNoHeuristics0 = new NoLearningNoHeuristics<MixedDataStructureDanielHT>();
      MixedDataStructureDanielHT mixedDataStructureDanielHT0 = new MixedDataStructureDanielHT();
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      LubyRestarts lubyRestarts0 = new LubyRestarts();
      Solver<MixedDataStructureDanielHT> solver0 = new Solver<MixedDataStructureDanielHT>(noLearningNoHeuristics0, mixedDataStructureDanielHT0, varOrderHeap0, lubyRestarts0);
      IVecInt iVecInt0 = vecInt0.push((-1));
      UnitClauses unitClauses0 = new UnitClauses(iVecInt0);
      // Undeclared exception!
      try { 
        unitClauses0.remove(solver0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      UnitClauses unitClauses0 = new UnitClauses(vecInt0);
      // Undeclared exception!
      try { 
        unitClauses0.getActivity();
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
      VecInt vecInt0 = new VecInt();
      NoLearningNoHeuristics<MixedDataStructureDanielHT> noLearningNoHeuristics0 = new NoLearningNoHeuristics<MixedDataStructureDanielHT>();
      MixedDataStructureDanielHT mixedDataStructureDanielHT0 = new MixedDataStructureDanielHT();
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      LubyRestarts lubyRestarts0 = new LubyRestarts();
      Solver<MixedDataStructureDanielHT> solver0 = new Solver<MixedDataStructureDanielHT>(noLearningNoHeuristics0, mixedDataStructureDanielHT0, varOrderHeap0, lubyRestarts0);
      vecInt0.push(32);
      UnitClauses unitClauses0 = new UnitClauses(vecInt0);
      // Undeclared exception!
      try { 
        unitClauses0.assertConstraintIfNeeded(solver0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.UnitClauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      vecInt0.push(18);
      UnitClauses unitClauses0 = new UnitClauses(vecInt0);
      // Undeclared exception!
      try { 
        unitClauses0.assertConstraintIfNeeded((UnitPropagationListener) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.UnitClauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      VecInt vecInt0 = new VecInt(0, (-1));
      NoLearningNoHeuristics<MixedDataStructureDanielHT> noLearningNoHeuristics0 = new NoLearningNoHeuristics<MixedDataStructureDanielHT>();
      MixedDataStructureDanielHT mixedDataStructureDanielHT0 = new MixedDataStructureDanielHT();
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      LubyRestarts lubyRestarts0 = new LubyRestarts();
      Solver<MixedDataStructureDanielHT> solver0 = new Solver<MixedDataStructureDanielHT>(noLearningNoHeuristics0, mixedDataStructureDanielHT0, varOrderHeap0, lubyRestarts0);
      vecInt0.push(315);
      UnitClauses unitClauses0 = new UnitClauses(vecInt0);
      // Undeclared exception!
      try { 
        unitClauses0.assertConstraintIfNeeded(solver0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 314
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Lits", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      vecInt0.insertFirst(111);
      UnitClauses unitClauses0 = new UnitClauses(vecInt0);
      // Undeclared exception!
      try { 
        unitClauses0.assertConstraint((UnitPropagationListener) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.UnitClauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      vecInt0.unsafePush(1928);
      UnitClauses unitClauses0 = new UnitClauses(vecInt0);
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      LubyRestarts lubyRestarts0 = new LubyRestarts();
      PercentLengthLearning<MixedDataStructureDanielHT> percentLengthLearning0 = new PercentLengthLearning<MixedDataStructureDanielHT>(32);
      MixedDataStructureDanielHT mixedDataStructureDanielHT0 = new MixedDataStructureDanielHT();
      Solver<MixedDataStructureDanielHT> solver0 = new Solver<MixedDataStructureDanielHT>(percentLengthLearning0, mixedDataStructureDanielHT0, levelBasedVarOrderHeap0, lubyRestarts0);
      // Undeclared exception!
      try { 
        unitClauses0.assertConstraint(solver0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1929
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Lits", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UnitClauses unitClauses0 = null;
      try {
        unitClauses0 = new UnitClauses((IVecInt) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.UnitClauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int[] intArray0 = new int[0];
      VecInt vecInt0 = new VecInt(intArray0);
      vecInt0.pop();
      UnitClauses unitClauses0 = null;
      try {
        unitClauses0 = new UnitClauses(vecInt0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.UnitClauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      vecInt0.shrinkTo(9);
      UnitClauses unitClauses0 = null;
      try {
        unitClauses0 = new UnitClauses(vecInt0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      UnitClauses unitClauses0 = new UnitClauses(vecInt0);
      unitClauses0.assertConstraint((UnitPropagationListener) null);
      assertTrue(unitClauses0.isSatisfied());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      UnitClauses unitClauses0 = new UnitClauses(vecInt0);
      // Undeclared exception!
      try { 
        unitClauses0.calcReason((-81), vecInt0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.UnitClauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      UnitClauses unitClauses0 = new UnitClauses(vecInt0);
      // Undeclared exception!
      try { 
        unitClauses0.learnt();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.UnitClauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      UnitClauses unitClauses0 = new UnitClauses(vecInt0);
      NoLearningNoHeuristics<MixedDataStructureDanielHT> noLearningNoHeuristics0 = new NoLearningNoHeuristics<MixedDataStructureDanielHT>();
      MixedDataStructureDanielHT mixedDataStructureDanielHT0 = new MixedDataStructureDanielHT();
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      LubyRestarts lubyRestarts0 = new LubyRestarts();
      Solver<MixedDataStructureDanielHT> solver0 = new Solver<MixedDataStructureDanielHT>(noLearningNoHeuristics0, mixedDataStructureDanielHT0, varOrderHeap0, lubyRestarts0);
      unitClauses0.remove(solver0);
      assertEquals(0, solver0.nVars());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      UnitClauses unitClauses0 = new UnitClauses(vecInt0);
      boolean boolean0 = unitClauses0.isSatisfied();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      UnitClauses unitClauses0 = new UnitClauses(vecInt0);
      // Undeclared exception!
      try { 
        unitClauses0.rescaleBy(0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.UnitClauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      UnitClauses unitClauses0 = new UnitClauses(vecInt0);
      // Undeclared exception!
      try { 
        unitClauses0.requiredNumberOfSatisfiedLiterals();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.minisat.constraints.cnf.UnitClauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      UnitClauses unitClauses0 = new UnitClauses(vecInt0);
      // Undeclared exception!
      try { 
        unitClauses0.size();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.UnitClauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      UnitClauses unitClauses0 = new UnitClauses(vecInt0);
      // Undeclared exception!
      try { 
        unitClauses0.register();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.UnitClauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      UnitClauses unitClauses0 = new UnitClauses(vecInt0);
      NoLearningNoHeuristics<MixedDataStructureDanielHT> noLearningNoHeuristics0 = new NoLearningNoHeuristics<MixedDataStructureDanielHT>();
      MixedDataStructureDanielHT mixedDataStructureDanielHT0 = new MixedDataStructureDanielHT();
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      LubyRestarts lubyRestarts0 = new LubyRestarts();
      Solver<MixedDataStructureDanielHT> solver0 = new Solver<MixedDataStructureDanielHT>(noLearningNoHeuristics0, mixedDataStructureDanielHT0, varOrderHeap0, lubyRestarts0);
      unitClauses0.assertConstraintIfNeeded(solver0);
      assertEquals(0, solver0.getPropagationLevel());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      UnitClauses unitClauses0 = new UnitClauses(vecInt0);
      // Undeclared exception!
      try { 
        unitClauses0.setLearnt();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.UnitClauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      UnitClauses unitClauses0 = new UnitClauses(vecInt0);
      // Undeclared exception!
      try { 
        unitClauses0.propagate((UnitPropagationListener) null, 1144);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.UnitClauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      UnitClauses unitClauses0 = new UnitClauses(vecInt0);
      // Undeclared exception!
      try { 
        unitClauses0.getAssertionLevel(vecInt0, 1508);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.minisat.constraints.cnf.UnitClauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MinOneDecorator minOneDecorator0 = mock(MinOneDecorator.class, new ViolatedAssumptionAnswer());
      FullClauseSelectorSolver<MinOneDecorator> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<MinOneDecorator>(minOneDecorator0, true);
      IVecInt iVecInt0 = fullClauseSelectorSolver0.getLastClause();
      UnitClauses unitClauses0 = new UnitClauses(iVecInt0);
      unitClauses0.forwardActivity(0);
      assertTrue(unitClauses0.isSatisfied());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      NoLearningNoHeuristics<MixedDataStructureDanielHT> noLearningNoHeuristics0 = new NoLearningNoHeuristics<MixedDataStructureDanielHT>();
      MixedDataStructureDanielHT mixedDataStructureDanielHT0 = new MixedDataStructureDanielHT();
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      LubyRestarts lubyRestarts0 = new LubyRestarts();
      Solver<MixedDataStructureDanielHT> solver0 = new Solver<MixedDataStructureDanielHT>(noLearningNoHeuristics0, mixedDataStructureDanielHT0, varOrderHeap0, lubyRestarts0);
      vecInt0.insertFirst(189);
      UnitClauses unitClauses0 = new UnitClauses(vecInt0);
      // Undeclared exception!
      try { 
        unitClauses0.assertConstraint(solver0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.UnitClauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      UnitClauses unitClauses0 = new UnitClauses(vecInt0);
      // Undeclared exception!
      try { 
        unitClauses0.canBeSatisfiedByCountingLiterals();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.minisat.constraints.cnf.UnitClauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      UnitClauses unitClauses0 = new UnitClauses(vecInt0);
      boolean boolean0 = unitClauses0.simplify();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      UnitClauses unitClauses0 = new UnitClauses(vecInt0);
      // Undeclared exception!
      try { 
        unitClauses0.toString((VarMapper) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.minisat.constraints.cnf.UnitClauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      UnitClauses unitClauses0 = new UnitClauses(vecInt0);
      boolean boolean0 = unitClauses0.canBePropagatedMultipleTimes();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      MinOneDecorator[] minOneDecoratorArray0 = new MinOneDecorator[9];
      MinOneDecorator minOneDecorator0 = mock(MinOneDecorator.class, new ViolatedAssumptionAnswer());
      doReturn(171, 171, 0).when(minOneDecorator0).nVars();
      minOneDecoratorArray0[0] = minOneDecorator0;
      minOneDecoratorArray0[1] = minOneDecorator0;
      minOneDecoratorArray0[2] = minOneDecorator0;
      minOneDecoratorArray0[3] = minOneDecorator0;
      minOneDecoratorArray0[4] = minOneDecorator0;
      minOneDecoratorArray0[5] = minOneDecorator0;
      minOneDecoratorArray0[6] = minOneDecorator0;
      minOneDecoratorArray0[7] = minOneDecorator0;
      minOneDecoratorArray0[8] = minOneDecorator0;
      ManyCore<MinOneDecorator> manyCore0 = new ManyCore<MinOneDecorator>(false, minOneDecoratorArray0);
      IVecInt iVecInt0 = AbstractMinimalModel.negativeLiterals(manyCore0);
      UnitClauses unitClauses0 = new UnitClauses(iVecInt0);
      unitClauses0.setActivity(0.999);
      assertTrue(unitClauses0.isSatisfied());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      UnitClauses unitClauses0 = new UnitClauses(vecInt0);
      // Undeclared exception!
      try { 
        unitClauses0.locked();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.UnitClauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      UnitClauses unitClauses0 = new UnitClauses(vecInt0);
      // Undeclared exception!
      try { 
        unitClauses0.get((-2));
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.UnitClauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      UnitClauses unitClauses0 = new UnitClauses(vecInt0);
      // Undeclared exception!
      try { 
        unitClauses0.propagatePi((MandatoryLiteralListener) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.minisat.constraints.cnf.UnitClauses", e);
      }
  }
}