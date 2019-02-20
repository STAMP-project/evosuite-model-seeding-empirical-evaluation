/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 19 17:20:13 GMT 2019
 */

package org.sat4j.tools.encoding;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.sat4j.core.VecInt;
import org.sat4j.specs.IConstr;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVecInt;
import org.sat4j.tools.DimacsOutputSolver;
import org.sat4j.tools.FullClauseSelectorSolver;
import org.sat4j.tools.NegationDecorator;
import org.sat4j.tools.StatisticsSolver;
import org.sat4j.tools.encoding.Sequential;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Sequential_ESTest extends Sequential_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      DimacsOutputSolver dimacsOutputSolver0 = mock(DimacsOutputSolver.class, new ViolatedAssumptionAnswer());
      doReturn((IConstr) null).when(dimacsOutputSolver0).addClause(any(org.sat4j.specs.IVecInt.class));
      doReturn(0).when(dimacsOutputSolver0).nextFreeVarId(anyBoolean());
      FullClauseSelectorSolver<DimacsOutputSolver> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<DimacsOutputSolver>(dimacsOutputSolver0, false);
      IVecInt iVecInt0 = fullClauseSelectorSolver0.getLastClause();
      sequential0.addExactlyOne(fullClauseSelectorSolver0, iVecInt0);
      sequential0.addExactly(fullClauseSelectorSolver0, iVecInt0, 1580);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      DimacsOutputSolver dimacsOutputSolver0 = mock(DimacsOutputSolver.class, new ViolatedAssumptionAnswer());
      doReturn((IConstr) null, (IConstr) null, (IConstr) null, (IConstr) null, (IConstr) null).when(dimacsOutputSolver0).addClause(any(org.sat4j.specs.IVecInt.class));
      doReturn(0, 0, 0, 0, 0).when(dimacsOutputSolver0).nextFreeVarId(anyBoolean());
      FullClauseSelectorSolver<DimacsOutputSolver> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<DimacsOutputSolver>(dimacsOutputSolver0, false);
      VecInt vecInt0 = new VecInt(19);
      vecInt0.shrinkTo(19);
      sequential0.addAtMostOne(fullClauseSelectorSolver0, vecInt0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      // Undeclared exception!
      try { 
        sequential0.addExactlyOne((ISolver) null, (IVecInt) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.encoding.EncodingStrategyAdapter", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      VecInt vecInt0 = new VecInt();
      // Undeclared exception!
      try { 
        sequential0.addExactlyOne(dimacsOutputSolver0, vecInt0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.encoding.Sequential", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      DimacsOutputSolver dimacsOutputSolver0 = mock(DimacsOutputSolver.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(dimacsOutputSolver0).nextFreeVarId(anyBoolean());
      FullClauseSelectorSolver<DimacsOutputSolver> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<DimacsOutputSolver>(dimacsOutputSolver0, false);
      IVecInt iVecInt0 = fullClauseSelectorSolver0.getLastClause();
      iVecInt0.unsafePush(32);
      // Undeclared exception!
      try { 
        sequential0.addExactlyOne(fullClauseSelectorSolver0, iVecInt0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Please call newVar(int) before adding constraints!!!
         //
         verifyException("org.sat4j.tools.AbstractClauseSelectorSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      VecInt vecInt0 = new VecInt();
      vecInt0.shrink((-2492));
      // Undeclared exception!
      try { 
        sequential0.addExactlyOne(dimacsOutputSolver0, vecInt0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      FullClauseSelectorSolver<DimacsOutputSolver> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<DimacsOutputSolver>(dimacsOutputSolver0, true);
      VecInt vecInt0 = new VecInt(19);
      vecInt0.shrinkTo(19);
      // Undeclared exception!
      sequential0.addExactly(fullClauseSelectorSolver0, vecInt0, (-2385));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      StatisticsSolver statisticsSolver0 = new StatisticsSolver();
      VecInt vecInt0 = new VecInt(19);
      vecInt0.shrinkTo(19);
      // Undeclared exception!
      try { 
        sequential0.addExactly(statisticsSolver0, vecInt0, (-574));
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.tools.StatisticsSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      // Undeclared exception!
      try { 
        sequential0.addExactly((ISolver) null, (IVecInt) null, (-3542));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.encoding.EncodingStrategyAdapter", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      VecInt vecInt0 = new VecInt();
      vecInt0.shrink((-2492));
      // Undeclared exception!
      try { 
        sequential0.addExactly(dimacsOutputSolver0, vecInt0, (-1351));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      DimacsOutputSolver dimacsOutputSolver0 = mock(DimacsOutputSolver.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(dimacsOutputSolver0).nextFreeVarId(anyBoolean());
      FullClauseSelectorSolver<DimacsOutputSolver> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<DimacsOutputSolver>(dimacsOutputSolver0, false);
      IVecInt iVecInt0 = fullClauseSelectorSolver0.getLastClause();
      iVecInt0.shrinkTo(65535);
      // Undeclared exception!
      sequential0.addAtMostOne(fullClauseSelectorSolver0, iVecInt0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      StatisticsSolver statisticsSolver0 = new StatisticsSolver();
      VecInt vecInt0 = new VecInt(19);
      vecInt0.shrink((-62));
      // Undeclared exception!
      try { 
        sequential0.addAtMostOne(statisticsSolver0, vecInt0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.tools.StatisticsSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      // Undeclared exception!
      try { 
        sequential0.addAtMostOne((ISolver) null, (IVecInt) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      DimacsOutputSolver dimacsOutputSolver0 = mock(DimacsOutputSolver.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(dimacsOutputSolver0).nextFreeVarId(anyBoolean());
      FullClauseSelectorSolver<DimacsOutputSolver> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<DimacsOutputSolver>(dimacsOutputSolver0, false);
      VecInt vecInt0 = new VecInt(19, 19);
      // Undeclared exception!
      try { 
        sequential0.addAtMostOne(fullClauseSelectorSolver0, vecInt0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Please call newVar(int) before adding constraints!!!
         //
         verifyException("org.sat4j.tools.AbstractClauseSelectorSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      VecInt vecInt0 = new VecInt();
      vecInt0.shrink((-2492));
      // Undeclared exception!
      try { 
        sequential0.addAtMostOne(dimacsOutputSolver0, vecInt0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      FullClauseSelectorSolver<DimacsOutputSolver> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<DimacsOutputSolver>(dimacsOutputSolver0, true);
      IVecInt iVecInt0 = fullClauseSelectorSolver0.getLastClause();
      iVecInt0.shrink((-1511));
      // Undeclared exception!
      sequential0.addAtMost(dimacsOutputSolver0, iVecInt0, 1451);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      StatisticsSolver statisticsSolver0 = new StatisticsSolver();
      VecInt vecInt0 = new VecInt(19);
      vecInt0.shrinkTo(19);
      // Undeclared exception!
      try { 
        sequential0.addAtMost(statisticsSolver0, vecInt0, 2621);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.tools.StatisticsSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      // Undeclared exception!
      try { 
        sequential0.addAtMost((ISolver) null, (IVecInt) null, 18);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      VecInt vecInt0 = new VecInt();
      Sequential sequential0 = new Sequential();
      // Undeclared exception!
      try { 
        sequential0.addAtMost(dimacsOutputSolver0, vecInt0, 1484);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.encoding.Sequential", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      DimacsOutputSolver dimacsOutputSolver0 = mock(DimacsOutputSolver.class, new ViolatedAssumptionAnswer());
      FullClauseSelectorSolver<DimacsOutputSolver> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<DimacsOutputSolver>(dimacsOutputSolver0, false);
      IVecInt iVecInt0 = fullClauseSelectorSolver0.getLastClause();
      iVecInt0.shrinkTo(5);
      DimacsOutputSolver dimacsOutputSolver1 = mock(DimacsOutputSolver.class, new ViolatedAssumptionAnswer());
      doReturn((IConstr) null).when(dimacsOutputSolver1).addClause(any(org.sat4j.specs.IVecInt.class));
      doReturn(0, 0, 0, 0, 0).when(dimacsOutputSolver1).nextFreeVarId(anyBoolean());
      NegationDecorator<DimacsOutputSolver> negationDecorator0 = new NegationDecorator<DimacsOutputSolver>(dimacsOutputSolver1);
      // Undeclared exception!
      try { 
        sequential0.addAtMost(negationDecorator0, iVecInt0, 5);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The constraint you entered cannot be removed from the solver.
         //
         verifyException("org.sat4j.core.ConstrGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      DimacsOutputSolver dimacsOutputSolver0 = mock(DimacsOutputSolver.class, new ViolatedAssumptionAnswer());
      FullClauseSelectorSolver<DimacsOutputSolver> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<DimacsOutputSolver>(dimacsOutputSolver0, false);
      VecInt vecInt0 = new VecInt(19);
      // Undeclared exception!
      try { 
        sequential0.addAtMostOne(fullClauseSelectorSolver0, vecInt0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.encoding.Sequential", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      DimacsOutputSolver dimacsOutputSolver0 = mock(DimacsOutputSolver.class, new ViolatedAssumptionAnswer());
      doReturn((IConstr) null, (IConstr) null, (IConstr) null, (IConstr) null, (IConstr) null).when(dimacsOutputSolver0).addClause(any(org.sat4j.specs.IVecInt.class));
      doReturn(0, 0, 0, 0, 0).when(dimacsOutputSolver0).nextFreeVarId(anyBoolean());
      FullClauseSelectorSolver<DimacsOutputSolver> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<DimacsOutputSolver>(dimacsOutputSolver0, false);
      VecInt vecInt0 = new VecInt(19);
      vecInt0.shrinkTo(19);
      IConstr iConstr0 = sequential0.addAtMost(fullClauseSelectorSolver0, vecInt0, 19);
      assertEquals(19, vecInt0.size());
      assertEquals(683, iConstr0.size());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      DimacsOutputSolver dimacsOutputSolver0 = mock(DimacsOutputSolver.class, new ViolatedAssumptionAnswer());
      doReturn((IConstr) null, (IConstr) null, (IConstr) null, (IConstr) null).when(dimacsOutputSolver0).addClause(any(org.sat4j.specs.IVecInt.class));
      doReturn(0, 0, 0, 0, 0).when(dimacsOutputSolver0).nextFreeVarId(anyBoolean());
      FullClauseSelectorSolver<DimacsOutputSolver> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<DimacsOutputSolver>(dimacsOutputSolver0, false);
      IVecInt iVecInt0 = fullClauseSelectorSolver0.getLastClause();
      sequential0.addExactlyOne(fullClauseSelectorSolver0, iVecInt0);
      sequential0.addExactlyOne(fullClauseSelectorSolver0, iVecInt0);
      // Undeclared exception!
      try { 
        sequential0.addAtMost(fullClauseSelectorSolver0, iVecInt0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      DimacsOutputSolver dimacsOutputSolver0 = mock(DimacsOutputSolver.class, new ViolatedAssumptionAnswer());
      doReturn((IConstr) null).when(dimacsOutputSolver0).addClause(any(org.sat4j.specs.IVecInt.class));
      doReturn(0).when(dimacsOutputSolver0).nextFreeVarId(anyBoolean());
      FullClauseSelectorSolver<DimacsOutputSolver> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<DimacsOutputSolver>(dimacsOutputSolver0, false);
      IVecInt iVecInt0 = fullClauseSelectorSolver0.getLastClause();
      IConstr iConstr0 = sequential0.addExactlyOne(fullClauseSelectorSolver0, iVecInt0);
      IConstr iConstr1 = sequential0.addAtMost(fullClauseSelectorSolver0, iVecInt0, 0);
      assertFalse(iConstr1.equals((Object)iConstr0));
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      FullClauseSelectorSolver<DimacsOutputSolver> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<DimacsOutputSolver>(dimacsOutputSolver0, true);
      VecInt vecInt0 = new VecInt(19);
      // Undeclared exception!
      try { 
        sequential0.addExactly(fullClauseSelectorSolver0, vecInt0, (-2385));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.encoding.Sequential", e);
      }
  }
}