/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 19 15:50:55 GMT 2019
 */

package org.sat4j.minisat.constraints;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.sat4j.core.ReadOnlyVecInt;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.constraints.MixedDataStructureDanielWL;
import org.sat4j.minisat.constraints.MixedDataStructureSingleWL;
import org.sat4j.minisat.core.ILits;
import org.sat4j.minisat.core.SearchParams;
import org.sat4j.minisat.core.Solver;
import org.sat4j.minisat.learning.ActiveLearning;
import org.sat4j.minisat.learning.NoLearningNoHeuristics;
import org.sat4j.minisat.orders.NaturalStaticOrder;
import org.sat4j.minisat.orders.PureOrder;
import org.sat4j.minisat.restarts.LubyRestarts;
import org.sat4j.minisat.restarts.NoRestarts;
import org.sat4j.specs.Constr;
import org.sat4j.specs.IVecInt;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MixedDataStructureDanielWL_ESTest extends MixedDataStructureDanielWL_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MixedDataStructureDanielWL mixedDataStructureDanielWL0 = new MixedDataStructureDanielWL();
      ILits iLits0 = mixedDataStructureDanielWL0.createLits();
      assertEquals(0, iLits0.nVars());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MixedDataStructureDanielWL mixedDataStructureDanielWL0 = new MixedDataStructureDanielWL();
      ActiveLearning<MixedDataStructureSingleWL> activeLearning0 = new ActiveLearning<MixedDataStructureSingleWL>();
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      SearchParams searchParams0 = new SearchParams(1074.77912610818, 1074.77912610818, 1074.77912610818, 0);
      PureOrder pureOrder0 = new PureOrder(0);
      NoRestarts noRestarts0 = new NoRestarts();
      Solver<MixedDataStructureSingleWL> solver0 = new Solver<MixedDataStructureSingleWL>(activeLearning0, mixedDataStructureSingleWL0, searchParams0, pureOrder0, noRestarts0);
      IVecInt iVecInt0 = solver0.getOutLearnt();
      ReadOnlyVecInt readOnlyVecInt0 = new ReadOnlyVecInt(iVecInt0);
      // Undeclared exception!
      try { 
        mixedDataStructureDanielWL0.createUnregisteredClause(readOnlyVecInt0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.core.ReadOnlyVecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MixedDataStructureDanielWL mixedDataStructureDanielWL0 = new MixedDataStructureDanielWL();
      // Undeclared exception!
      try { 
        mixedDataStructureDanielWL0.createUnregisteredClause((IVecInt) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.MixedDataStructureDanielWL", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MixedDataStructureDanielWL mixedDataStructureDanielWL0 = new MixedDataStructureDanielWL();
      VecInt vecInt0 = new VecInt();
      vecInt0.shrinkTo((-285));
      // Undeclared exception!
      try { 
        mixedDataStructureDanielWL0.createUnregisteredClause(vecInt0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.WLClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MixedDataStructureDanielWL mixedDataStructureDanielWL0 = new MixedDataStructureDanielWL();
      VecInt vecInt0 = new VecInt();
      vecInt0.shrinkTo(16);
      // Undeclared exception!
      try { 
        mixedDataStructureDanielWL0.createUnregisteredClause(vecInt0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MixedDataStructureDanielWL mixedDataStructureDanielWL0 = new MixedDataStructureDanielWL();
      // Undeclared exception!
      try { 
        mixedDataStructureDanielWL0.createUnregisteredCardinalityConstraint((IVecInt) null, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.card.AtLeast", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MixedDataStructureDanielWL mixedDataStructureDanielWL0 = new MixedDataStructureDanielWL();
      VecInt vecInt0 = new VecInt();
      vecInt0.pop();
      // Undeclared exception!
      try { 
        mixedDataStructureDanielWL0.createUnregisteredCardinalityConstraint(vecInt0, 2167);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.card.AtLeast", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MixedDataStructureDanielWL mixedDataStructureDanielWL0 = new MixedDataStructureDanielWL();
      // Undeclared exception!
      try { 
        mixedDataStructureDanielWL0.createUnregisteredCardinalityConstraint((IVecInt) null, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cards with degree 1 are clauses!!!!
         //
         verifyException("org.sat4j.minisat.constraints.card.AtLeast", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MixedDataStructureDanielWL mixedDataStructureDanielWL0 = new MixedDataStructureDanielWL();
      VecInt vecInt0 = new VecInt();
      try { 
        mixedDataStructureDanielWL0.createClause(vecInt0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Creating Empty clause ?
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Clauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      VecInt vecInt0 = new VecInt(1570, 2);
      MixedDataStructureDanielWL mixedDataStructureDanielWL0 = new MixedDataStructureDanielWL();
      // Undeclared exception!
      mixedDataStructureDanielWL0.createClause(vecInt0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MixedDataStructureDanielWL mixedDataStructureDanielWL0 = new MixedDataStructureDanielWL();
      VecInt vecInt0 = new VecInt();
      ReadOnlyVecInt readOnlyVecInt0 = new ReadOnlyVecInt(vecInt0);
      // Undeclared exception!
      try { 
        mixedDataStructureDanielWL0.createClause(readOnlyVecInt0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.core.ReadOnlyVecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MixedDataStructureDanielWL mixedDataStructureDanielWL0 = new MixedDataStructureDanielWL();
      VecInt vecInt0 = new VecInt(2179, 2179);
      // Undeclared exception!
      try { 
        mixedDataStructureDanielWL0.createClause(vecInt0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MixedDataStructureDanielWL mixedDataStructureDanielWL0 = new MixedDataStructureDanielWL();
      VecInt vecInt0 = new VecInt();
      try { 
        mixedDataStructureDanielWL0.createCardinalityConstraint(vecInt0, 1387);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.card.AtLeast", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MixedDataStructureDanielWL mixedDataStructureDanielWL0 = new MixedDataStructureDanielWL();
      // Undeclared exception!
      try { 
        mixedDataStructureDanielWL0.createCardinalityConstraint((IVecInt) null, 1210);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.card.AtLeast", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MixedDataStructureDanielWL mixedDataStructureDanielWL0 = new MixedDataStructureDanielWL();
      VecInt vecInt0 = new VecInt(861, 861);
      // Undeclared exception!
      try { 
        mixedDataStructureDanielWL0.createCardinalityConstraint(vecInt0, 861);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MixedDataStructureDanielWL mixedDataStructureDanielWL0 = new MixedDataStructureDanielWL();
      VecInt vecInt0 = new VecInt();
      Constr constr0 = mixedDataStructureDanielWL0.createUnregisteredClause(vecInt0);
      assertFalse(constr0.isSatisfied());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MixedDataStructureDanielWL mixedDataStructureDanielWL0 = new MixedDataStructureDanielWL();
      VecInt vecInt0 = new VecInt();
      vecInt0.push(0);
      mixedDataStructureDanielWL0.createUnregisteredClause(vecInt0);
      assertFalse(vecInt0.isEmpty());
      assertEquals(1, vecInt0.size());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MixedDataStructureDanielWL mixedDataStructureDanielWL0 = new MixedDataStructureDanielWL();
      VecInt vecInt0 = new VecInt();
      IVecInt iVecInt0 = vecInt0.push(14);
      vecInt0.push(32);
      mixedDataStructureDanielWL0.createUnregisteredClause(iVecInt0);
      assertEquals(2, iVecInt0.size());
      assertEquals(2, vecInt0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      VecInt vecInt0 = new VecInt(32, 32);
      IVecInt iVecInt0 = vecInt0.push(43);
      iVecInt0.shrinkTo(50);
      MixedDataStructureDanielWL mixedDataStructureDanielWL0 = new MixedDataStructureDanielWL();
      // Undeclared exception!
      try { 
        mixedDataStructureDanielWL0.createClause(iVecInt0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Lits", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MixedDataStructureDanielWL mixedDataStructureDanielWL0 = new MixedDataStructureDanielWL();
      NoLearningNoHeuristics<MixedDataStructureSingleWL> noLearningNoHeuristics0 = new NoLearningNoHeuristics<MixedDataStructureSingleWL>();
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      NaturalStaticOrder naturalStaticOrder0 = new NaturalStaticOrder();
      LubyRestarts lubyRestarts0 = new LubyRestarts();
      Solver<MixedDataStructureSingleWL> solver0 = new Solver<MixedDataStructureSingleWL>(noLearningNoHeuristics0, mixedDataStructureSingleWL0, naturalStaticOrder0, lubyRestarts0);
      mixedDataStructureDanielWL0.setUnitPropagationListener(solver0);
      VecInt vecInt0 = new VecInt(32, 32);
      Constr constr0 = mixedDataStructureDanielWL0.createClause(vecInt0);
      assertEquals(0.0, constr0.getActivity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MixedDataStructureDanielWL mixedDataStructureDanielWL0 = new MixedDataStructureDanielWL();
      VecInt vecInt0 = new VecInt();
      IVecInt iVecInt0 = vecInt0.push(14);
      IVecInt iVecInt1 = iVecInt0.push(15);
      Constr constr0 = mixedDataStructureDanielWL0.createClause(iVecInt1);
      assertNull(constr0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      VecInt vecInt0 = new VecInt(32, 32);
      IVecInt iVecInt0 = vecInt0.push(27);
      MixedDataStructureDanielWL mixedDataStructureDanielWL0 = new MixedDataStructureDanielWL();
      // Undeclared exception!
      try { 
        mixedDataStructureDanielWL0.createClause(iVecInt0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Lits", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MixedDataStructureDanielWL mixedDataStructureDanielWL0 = new MixedDataStructureDanielWL();
      VecInt vecInt0 = new VecInt();
      Constr constr0 = mixedDataStructureDanielWL0.createUnregisteredCardinalityConstraint(vecInt0, 0);
      assertEquals(0, constr0.requiredNumberOfSatisfiedLiterals());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MixedDataStructureDanielWL mixedDataStructureDanielWL0 = new MixedDataStructureDanielWL();
      VecInt vecInt0 = new VecInt();
      Constr constr0 = mixedDataStructureDanielWL0.createCardinalityConstraint(vecInt0, 0);
      assertTrue(constr0.isSatisfied());
  }
}