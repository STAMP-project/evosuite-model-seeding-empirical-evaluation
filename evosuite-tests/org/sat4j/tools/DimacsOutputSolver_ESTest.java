/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 19 15:44:32 GMT 2019
 */

package org.sat4j.tools;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.PrintWriter;
import java.io.Writer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.junit.runner.RunWith;
import org.sat4j.core.VecInt;
import org.sat4j.specs.IConstr;
import org.sat4j.specs.IVecInt;
import org.sat4j.tools.AbstractMinimalModel;
import org.sat4j.tools.DimacsOutputSolver;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DimacsOutputSolver_ESTest extends DimacsOutputSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      dimacsOutputSolver0.setExpectedNumberOfClauses(2654);
      int int0 = dimacsOutputSolver0.nextFreeVarId(false);
      assertEquals(2654, dimacsOutputSolver0.nConstraints());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      VecInt vecInt0 = new VecInt();
      dimacsOutputSolver0.setExpectedNumberOfClauses(266);
      dimacsOutputSolver0.addExactly(vecInt0, 1);
      assertEquals(266, dimacsOutputSolver0.nConstraints());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      dimacsOutputSolver0.newVar(9);
      int int0 = dimacsOutputSolver0.realNumberOfVariables();
      assertEquals(9, dimacsOutputSolver0.nVars());
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      dimacsOutputSolver0.nbvars = (-1);
      int int0 = dimacsOutputSolver0.realNumberOfVariables();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      dimacsOutputSolver0.newVar((-1));
      int int0 = dimacsOutputSolver0.nextFreeVarId(true);
      assertEquals(0, dimacsOutputSolver0.nVars());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      dimacsOutputSolver0.nbvars = (-795);
      int int0 = dimacsOutputSolver0.nVars();
      assertEquals((-795), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      PrintWriter printWriter0 = new PrintWriter(writer0);
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver(printWriter0);
      dimacsOutputSolver0.nbclauses = 909;
      int int0 = dimacsOutputSolver0.nConstraints();
      assertEquals(909, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      dimacsOutputSolver0.setExpectedNumberOfClauses((-242));
      int int0 = dimacsOutputSolver0.nConstraints();
      assertEquals((-242), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver((PrintWriter) null);
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.newVar((-1171));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.DimacsOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      VecInt vecInt0 = new VecInt();
      vecInt0.growTo(1973, (-520));
      // Undeclared exception!
      dimacsOutputSolver0.addExactly(vecInt0, 1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.addExactly((IVecInt) null, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.addClause((IVecInt) null, (-4056));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.DimacsOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      VecInt vecInt0 = new VecInt(683, (-1));
      // Undeclared exception!
      dimacsOutputSolver0.addAtMost(vecInt0, 1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.addAtMost((IVecInt) null, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      VecInt vecInt0 = new VecInt();
      vecInt0.shrinkTo(3585);
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.addAtMost(vecInt0, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.addAtLeast((IVecInt) null, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.DimacsOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      VecInt vecInt0 = new VecInt();
      IConstr iConstr0 = dimacsOutputSolver0.addAtLeast(vecInt0, 1);
      assertNull(iConstr0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      VecInt vecInt0 = new VecInt(1, 1250);
      vecInt0.insertFirst(1);
      IConstr iConstr0 = dimacsOutputSolver0.addAtMost(vecInt0, 1);
      assertNull(iConstr0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      VecInt vecInt0 = new VecInt();
      dimacsOutputSolver0.addAtMost(vecInt0, 1);
      IConstr iConstr0 = dimacsOutputSolver0.addAtMost(vecInt0, 1);
      assertNull(iConstr0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      VecInt vecInt0 = new VecInt();
      vecInt0.unsafePush((-417));
      IConstr iConstr0 = dimacsOutputSolver0.addClause((IVecInt) vecInt0);
      assertNull(iConstr0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      VecInt vecInt0 = new VecInt();
      dimacsOutputSolver0.addAtMost(vecInt0, 1);
      IConstr iConstr0 = dimacsOutputSolver0.addClause((IVecInt) vecInt0);
      assertNull(iConstr0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      VecInt vecInt0 = new VecInt();
      vecInt0.shrink((-764));
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.addClause((IVecInt) vecInt0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      VecInt vecInt0 = new VecInt();
      IConstr iConstr0 = dimacsOutputSolver0.addClause((IVecInt) vecInt0, 2657);
      assertNull(iConstr0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      dimacsOutputSolver0.nextFreeVarId(true);
      int int0 = dimacsOutputSolver0.nVars();
      assertEquals(1, dimacsOutputSolver0.realNumberOfVariables());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.addExactly((IVecInt) null, (-2686));
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.addExactly((IVecInt) null, 57);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not a clausal problem! degree 57
         //
         verifyException("org.sat4j.tools.DimacsOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      VecInt vecInt0 = new VecInt(1, 1250);
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.addAtLeast(vecInt0, (-1100));
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      IVecInt iVecInt0 = AbstractMinimalModel.negativeLiterals(dimacsOutputSolver0);
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.addAtLeast(iVecInt0, 2467);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not a clausal problem! degree 2467
         //
         verifyException("org.sat4j.tools.DimacsOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      VecInt vecInt0 = new VecInt();
      vecInt0.shrinkTo(1175);
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.addExactly(vecInt0, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      VecInt vecInt0 = new VecInt();
      dimacsOutputSolver0.setExpectedNumberOfClauses(406);
      dimacsOutputSolver0.addAtMost(vecInt0, 1);
      assertEquals(406, dimacsOutputSolver0.nConstraints());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      VecInt vecInt0 = new VecInt();
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.addAtMost(vecInt0, (-2297));
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      IVecInt iVecInt0 = AbstractMinimalModel.positiveLiterals(dimacsOutputSolver0);
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.addAtMost(iVecInt0, 2638);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not a clausal problem! degree 2638
         //
         verifyException("org.sat4j.tools.DimacsOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      dimacsOutputSolver0.setExpectedNumberOfClauses((-1964));
      VecInt vecInt0 = new VecInt();
      dimacsOutputSolver0.addClause((IVecInt) vecInt0);
      assertEquals((-1964), dimacsOutputSolver0.nConstraints());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(writer0, true);
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver(mockPrintWriter0);
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.addClause((IVecInt) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.DimacsOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.printStat((PrintWriter) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.DimacsOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      int int0 = dimacsOutputSolver0.nVars();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.getAddedVars();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.tools.DimacsOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.registerLiteral(353);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.DimacsOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      String string0 = dimacsOutputSolver0.toString("0FU^ak");
      assertEquals("Dimacs output solver", string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      int int0 = dimacsOutputSolver0.nConstraints();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      dimacsOutputSolver0.newVar((-120));
      int int0 = dimacsOutputSolver0.nextFreeVarId(true);
      assertEquals((-119), dimacsOutputSolver0.realNumberOfVariables());
      assertEquals((-119), int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      VecInt vecInt0 = new VecInt();
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.addParity(vecInt0, false);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.tools.DimacsOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      int int0 = dimacsOutputSolver0.realNumberOfVariables();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      dimacsOutputSolver0.reset();
      assertEquals(0, dimacsOutputSolver0.nConstraints());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      int int0 = dimacsOutputSolver0.newVar();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.modelWithInternalVariables();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.DimacsOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver((PrintWriter) null);
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.printInfos((PrintWriter) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.DimacsOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.primeImplicant((-795));
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.DimacsOutputSolver", e);
      }
  }
}