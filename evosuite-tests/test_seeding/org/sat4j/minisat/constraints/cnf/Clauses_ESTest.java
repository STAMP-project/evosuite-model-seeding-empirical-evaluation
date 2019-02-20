/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 17 08:05:30 GMT 2019
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
import org.sat4j.minisat.constraints.MixedDataStructureDanielWLConciseBinary;
import org.sat4j.minisat.constraints.cnf.Clauses;
import org.sat4j.minisat.constraints.cnf.Lits;
import org.sat4j.minisat.core.Solver;
import org.sat4j.specs.IVecInt;
import org.sat4j.specs.UnitPropagationListener;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Clauses_ESTest extends Clauses_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Lits lits0 = new Lits();
      VecInt vecInt0 = new VecInt(0);
      vecInt0.shrinkTo((-2631));
      // Undeclared exception!
      try { 
        Clauses.sanityCheck(vecInt0, lits0, (UnitPropagationListener) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.sat4j.core.VecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      vecInt0.pop();
      boolean boolean0 = Clauses.propagationCheck(vecInt0, (UnitPropagationListener) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Lits lits0 = new Lits();
      VecInt vecInt0 = new VecInt(0);
      vecInt0.ensure(3024);
      vecInt0.shrinkTo(3024);
      // Undeclared exception!
      Clauses.sanityCheck(vecInt0, lits0, (UnitPropagationListener) null);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        Clauses.propagationCheck((IVecInt) null, (UnitPropagationListener) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Clauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      vecInt0.unsafePush(1676);
      Solver<MixedDataStructureDanielWLConciseBinary> solver0 = (Solver<MixedDataStructureDanielWLConciseBinary>) mock(Solver.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(solver0).enqueue(anyInt());
      try { 
        Clauses.propagationCheck(vecInt0, solver0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Contradictory Unit Clauses
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Clauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      vecInt0.unsafePush(1676);
      Solver<MixedDataStructureDanielWLConciseBinary> solver0 = (Solver<MixedDataStructureDanielWLConciseBinary>) mock(Solver.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(solver0).enqueue(anyInt());
      boolean boolean0 = Clauses.propagationCheck(vecInt0, solver0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Lits lits0 = new Lits();
      VecInt vecInt0 = new VecInt();
      vecInt0.insertFirst(0);
      vecInt0.unsafePush(158);
      IVecInt iVecInt0 = Clauses.sanityCheck(vecInt0, lits0, (UnitPropagationListener) null);
      assertEquals(2, iVecInt0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Lits lits0 = new Lits();
      VecInt vecInt0 = new VecInt();
      vecInt0.insertFirst(0);
      vecInt0.unsafePush(1);
      IVecInt iVecInt0 = Clauses.sanityCheck(vecInt0, lits0, (UnitPropagationListener) null);
      assertNull(iVecInt0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Lits lits0 = new Lits();
      VecInt vecInt0 = new VecInt();
      vecInt0.unsafePush(1);
      lits0.satisfies(1);
      IVecInt iVecInt0 = Clauses.sanityCheck(vecInt0, lits0, (UnitPropagationListener) null);
      assertNull(iVecInt0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Lits lits0 = new Lits();
      VecInt vecInt0 = new VecInt();
      vecInt0.insertFirst(0);
      lits0.satisfies(1);
      try { 
        Clauses.sanityCheck(vecInt0, lits0, (UnitPropagationListener) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Creating Empty clause ?
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Clauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Lits lits0 = new Lits();
      VecInt vecInt0 = new VecInt();
      vecInt0.insertFirst(0);
      // Undeclared exception!
      try { 
        Clauses.sanityCheck(vecInt0, lits0, (UnitPropagationListener) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Clauses", e);
      }
  }
}