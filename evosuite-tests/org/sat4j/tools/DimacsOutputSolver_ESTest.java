/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 19 17:18:43 GMT 2019
 */

package org.sat4j.tools;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.PrintWriter;
import java.io.StringWriter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.constraints.MixedDataStructureDanielWLConciseBinary;
import org.sat4j.minisat.core.Solver;
import org.sat4j.minisat.learning.FixedLengthLearning;
import org.sat4j.minisat.orders.LevelBasedVarOrderHeap;
import org.sat4j.minisat.restarts.MiniSATRestarts;
import org.sat4j.specs.IConstr;
import org.sat4j.specs.IVecInt;
import org.sat4j.tools.DimacsOutputSolver;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DimacsOutputSolver_ESTest extends DimacsOutputSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      dimacsOutputSolver0.nbclauses = 13;
      int int0 = dimacsOutputSolver0.nextFreeVarId(false);
      assertEquals(1, int0);
      assertEquals(0, dimacsOutputSolver0.nVars());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      VecInt vecInt0 = new VecInt();
      vecInt0.insertFirst((-1205));
      vecInt0.unsafePush(4);
      vecInt0.unsafePush((-3358));
      IConstr iConstr0 = dimacsOutputSolver0.addExactly(vecInt0, 1);
      assertNull(iConstr0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      dimacsOutputSolver0.nbvars = 1088;
      int int0 = dimacsOutputSolver0.realNumberOfVariables();
      assertEquals(1088, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      dimacsOutputSolver0.newVar((-1686));
      int int0 = dimacsOutputSolver0.realNumberOfVariables();
      assertEquals((-1686), dimacsOutputSolver0.nVars());
      assertEquals((-1686), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      dimacsOutputSolver0.newVar((-71));
      int int0 = dimacsOutputSolver0.nextFreeVarId(true);
      assertEquals((-70), dimacsOutputSolver0.nVars());
      assertEquals((-70), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      dimacsOutputSolver0.newVar(1623);
      int int0 = dimacsOutputSolver0.nVars();
      assertEquals(1623, dimacsOutputSolver0.realNumberOfVariables());
      assertEquals(1623, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      dimacsOutputSolver0.setExpectedNumberOfClauses(3429);
      int int0 = dimacsOutputSolver0.nConstraints();
      assertEquals(3429, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      PrintWriter printWriter0 = new PrintWriter(stringWriter0);
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver(printWriter0);
      dimacsOutputSolver0.setExpectedNumberOfClauses((-704));
      int int0 = dimacsOutputSolver0.nConstraints();
      assertEquals((-704), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      VecInt vecInt0 = new VecInt();
      IConstr iConstr0 = dimacsOutputSolver0.addAtLeast(vecInt0, 1);
      assertNull(iConstr0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver((PrintWriter) null);
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.setExpectedNumberOfClauses((-2677));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.DimacsOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver((PrintWriter) null);
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.newVar((-5));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.DimacsOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
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
  public void test12()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      VecInt vecInt0 = new VecInt();
      vecInt0.shrinkTo(275);
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
  public void test13()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.addClause((IVecInt) null, (-87));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.DimacsOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
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
  public void test15()  throws Throwable  {
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
  public void test16()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver((PrintWriter) null);
      VecInt vecInt0 = new VecInt();
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.addAtLeast(vecInt0, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.DimacsOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      PrintWriter printWriter0 = new PrintWriter(stringWriter0);
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver(printWriter0);
      VecInt vecInt0 = new VecInt();
      dimacsOutputSolver0.setExpectedNumberOfClauses((-704));
      dimacsOutputSolver0.addAtMost(vecInt0, 1);
      assertEquals((-704), dimacsOutputSolver0.nConstraints());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      FixedLengthLearning<MixedDataStructureDanielWLConciseBinary> fixedLengthLearning0 = new FixedLengthLearning<MixedDataStructureDanielWLConciseBinary>(Integer.MAX_VALUE);
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      MiniSATRestarts miniSATRestarts0 = new MiniSATRestarts();
      MixedDataStructureDanielWLConciseBinary mixedDataStructureDanielWLConciseBinary0 = new MixedDataStructureDanielWLConciseBinary();
      Solver<MixedDataStructureDanielWLConciseBinary> solver0 = new Solver<MixedDataStructureDanielWLConciseBinary>(fixedLengthLearning0, mixedDataStructureDanielWLConciseBinary0, levelBasedVarOrderHeap0, miniSATRestarts0);
      IVecInt iVecInt0 = solver0.getOutLearnt();
      dimacsOutputSolver0.addClause(iVecInt0);
      IConstr iConstr0 = dimacsOutputSolver0.addClause(iVecInt0);
      assertNull(iConstr0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      VecInt vecInt0 = new VecInt();
      vecInt0.unsafePush(1);
      IConstr iConstr0 = dimacsOutputSolver0.addClause((IVecInt) vecInt0, (-4109));
      assertNull(iConstr0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      VecInt vecInt0 = new VecInt();
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.addExactly(vecInt0, (-862));
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      VecInt vecInt0 = new VecInt();
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.addExactly(vecInt0, 1261);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not a clausal problem! degree 1261
         //
         verifyException("org.sat4j.tools.DimacsOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      VecInt vecInt0 = new VecInt();
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.addAtLeast(vecInt0, (-46));
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.addAtLeast((IVecInt) null, 128);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not a clausal problem! degree 128
         //
         verifyException("org.sat4j.tools.DimacsOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      VecInt vecInt0 = new VecInt();
      vecInt0.shrinkTo(70);
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
  public void test25()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      VecInt vecInt0 = new VecInt();
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.addAtMost(vecInt0, 0);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      VecInt vecInt0 = new VecInt();
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.addAtMost(vecInt0, 640);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not a clausal problem! degree 640
         //
         verifyException("org.sat4j.tools.DimacsOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      VecInt vecInt0 = new VecInt();
      vecInt0.shrinkTo(1995);
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.addClause((IVecInt) vecInt0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("org.sat4j.core.VecInt$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      dimacsOutputSolver0.fixedNbClauses = true;
      VecInt vecInt0 = new VecInt();
      IConstr iConstr0 = dimacsOutputSolver0.addClause((IVecInt) vecInt0);
      assertNull(iConstr0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      VecInt vecInt0 = new VecInt();
      dimacsOutputSolver0.addClause((IVecInt) vecInt0);
      IConstr iConstr0 = dimacsOutputSolver0.addAtMost(vecInt0, 1);
      assertNull(iConstr0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
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
  public void test31()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      int int0 = dimacsOutputSolver0.nVars();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
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
  public void test33()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.registerLiteral((-1));
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.DimacsOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      String string0 = dimacsOutputSolver0.toString("d ~U1:Z={_xs");
      assertEquals("Dimacs output solver", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      dimacsOutputSolver0.setExpectedNumberOfClauses((-1545));
      VecInt vecInt0 = new VecInt();
      dimacsOutputSolver0.addExactly(vecInt0, 1);
      assertEquals((-1545), dimacsOutputSolver0.nConstraints());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      int int0 = dimacsOutputSolver0.nConstraints();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      VecInt vecInt0 = new VecInt();
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.addParity(vecInt0, true);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.tools.DimacsOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      int int0 = dimacsOutputSolver0.realNumberOfVariables();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      dimacsOutputSolver0.reset();
      assertEquals(0, dimacsOutputSolver0.nVars());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      int int0 = dimacsOutputSolver0.newVar();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
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
  public void test42()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
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
  public void test43()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.primeImplicant(3411);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.DimacsOutputSolver", e);
      }
  }
}
