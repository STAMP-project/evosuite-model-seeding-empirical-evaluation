/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 19 15:37:34 GMT 2019
 */

package org.sat4j;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.PipedOutputStream;
import java.io.PrintWriter;
import java.io.Writer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.junit.runner.RunWith;
import org.sat4j.ExitCode;
import org.sat4j.ILauncherMode;
import org.sat4j.MUSLauncher;
import org.sat4j.OptimizationMode;
import org.sat4j.core.VecInt;
import org.sat4j.opt.MinOneDecorator;
import org.sat4j.reader.DimacsReader;
import org.sat4j.reader.InstanceReader;
import org.sat4j.reader.Reader;
import org.sat4j.specs.ILogAble;
import org.sat4j.specs.IProblem;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVecInt;
import org.sat4j.tools.DimacsOutputSolver;
import org.sat4j.tools.DimacsStringSolver;
import org.sat4j.tools.LexicoDecorator;
import org.sat4j.tools.Minimal4CardinalityModel;
import org.sat4j.tools.SubModelIterator;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class OptimizationMode_ESTest extends OptimizationMode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      OptimizationMode optimizationMode0 = new OptimizationMode();
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver(13);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("c ");
      MinOneDecorator minOneDecorator0 = new MinOneDecorator(dimacsStringSolver0);
      InstanceReader instanceReader0 = new InstanceReader(minOneDecorator0);
      // Undeclared exception!
      try { 
        optimizationMode0.solve(minOneDecorator0, instanceReader0, (ILogAble) null, mockPrintWriter0, (-1473L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.OptimizationMode", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OptimizationMode optimizationMode0 = new OptimizationMode();
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver(47);
      MUSLauncher mUSLauncher0 = new MUSLauncher();
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      PrintWriter printWriter0 = new PrintWriter(writer0);
      Reader reader0 = mUSLauncher0.createReader(dimacsStringSolver0, "Hh");
      optimizationMode0.displayResult(dimacsStringSolver0, dimacsStringSolver0, mUSLauncher0, printWriter0, reader0, 47, true);
      assertFalse(dimacsStringSolver0.isDBSimplificationAllowed());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OptimizationMode optimizationMode0 = new OptimizationMode();
      ExitCode exitCode0 = optimizationMode0.getCurrentExitCode();
      assertEquals("UNKNOWN", exitCode0.toString());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      OptimizationMode optimizationMode0 = new OptimizationMode();
      File file0 = MockFile.createTempFile("m E", "S@=U[,");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(file0);
      MinOneDecorator minOneDecorator0 = mock(MinOneDecorator.class, new ViolatedAssumptionAnswer());
      doReturn((int[]) null).when(minOneDecorator0).model();
      doReturn((int[]) null).when(minOneDecorator0).modelWithInternalVariables();
      doReturn(true).when(minOneDecorator0).isSatisfiable(any(org.sat4j.specs.IVecInt.class) , anyBoolean());
      doReturn(false, false, false, false, false).when(minOneDecorator0).model(anyInt());
      doReturn(112, 112, 112, 112, 112).when(minOneDecorator0).nVars();
      LexicoDecorator<MinOneDecorator> lexicoDecorator0 = new LexicoDecorator<MinOneDecorator>(minOneDecorator0);
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(lexicoDecorator0);
      VecInt vecInt0 = new VecInt(112);
      SubModelIterator subModelIterator0 = new SubModelIterator(minimal4CardinalityModel0, vecInt0, 112);
      InstanceReader instanceReader0 = new InstanceReader(subModelIterator0);
      // Undeclared exception!
      try { 
        optimizationMode0.solve(lexicoDecorator0, instanceReader0, (ILogAble) null, mockPrintWriter0, 112);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OptimizationMode optimizationMode0 = new OptimizationMode();
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      InstanceReader instanceReader0 = new InstanceReader(iSolver0);
      ILogAble iLogAble0 = ILogAble.CONSOLE;
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      PrintWriter printWriter0 = new PrintWriter(writer0);
      // Undeclared exception!
      try { 
        optimizationMode0.solve(iSolver0, instanceReader0, iLogAble0, printWriter0, 0L);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.sat4j.specs.ISolver$MockitoMock$1712113205 cannot be cast to org.sat4j.specs.IOptimizationProblem
         //
         verifyException("org.sat4j.OptimizationMode", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OptimizationMode optimizationMode0 = new OptimizationMode();
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(pipedOutputStream0, false);
      DimacsReader dimacsReader0 = new DimacsReader(dimacsOutputSolver0, "Total wall clock time (in seconds): ");
      // Undeclared exception!
      try { 
        optimizationMode0.displayResult(dimacsOutputSolver0, dimacsOutputSolver0, (ILogAble) null, mockPrintWriter0, dimacsReader0, 0L, false);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.DimacsOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OptimizationMode optimizationMode0 = new OptimizationMode();
      File file0 = MockFile.createTempFile("m E", "S@=U[,");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(file0);
      MinOneDecorator minOneDecorator0 = mock(MinOneDecorator.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(minOneDecorator0).isSatisfiable(any(org.sat4j.specs.IVecInt.class) , anyBoolean());
      doReturn(112, 112, 112, 112, 112).when(minOneDecorator0).nVars();
      LexicoDecorator<MinOneDecorator> lexicoDecorator0 = new LexicoDecorator<MinOneDecorator>(minOneDecorator0);
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(lexicoDecorator0);
      VecInt vecInt0 = new VecInt(112);
      SubModelIterator subModelIterator0 = new SubModelIterator(minimal4CardinalityModel0, vecInt0, (-678L));
      InstanceReader instanceReader0 = new InstanceReader(subModelIterator0);
      optimizationMode0.solve(lexicoDecorator0, instanceReader0, (ILogAble) null, mockPrintWriter0, 112);
      int[] intArray0 = new int[7];
      optimizationMode0.onSolutionFound(intArray0);
      assertEquals(ExitCode.UNSATISFIABLE, optimizationMode0.getCurrentExitCode());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OptimizationMode optimizationMode0 = new OptimizationMode();
      File file0 = MockFile.createTempFile("pa49", "S@=U[,");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(file0);
      MinOneDecorator minOneDecorator0 = mock(MinOneDecorator.class, new ViolatedAssumptionAnswer());
      doReturn(112, (-824)).when(minOneDecorator0).nVars();
      LexicoDecorator<MinOneDecorator> lexicoDecorator0 = new LexicoDecorator<MinOneDecorator>(minOneDecorator0);
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(lexicoDecorator0);
      VecInt vecInt0 = new VecInt(0);
      SubModelIterator subModelIterator0 = new SubModelIterator(minimal4CardinalityModel0, vecInt0, (-678L));
      MinOneDecorator minOneDecorator1 = new MinOneDecorator(subModelIterator0);
      InstanceReader instanceReader0 = new InstanceReader(minimal4CardinalityModel0);
      // Undeclared exception!
      try { 
        optimizationMode0.displayResult(lexicoDecorator0, minOneDecorator1, (ILogAble) null, mockPrintWriter0, instanceReader0, (-4715L), false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.OptimizationMode", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      File file0 = MockFile.createTempFile("m E", "S@=U[,");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(file0);
      MinOneDecorator minOneDecorator0 = mock(MinOneDecorator.class, new ViolatedAssumptionAnswer());
      doReturn(112, 112, 112, 112, 112).when(minOneDecorator0).nVars();
      LexicoDecorator<MinOneDecorator> lexicoDecorator0 = new LexicoDecorator<MinOneDecorator>(minOneDecorator0);
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(lexicoDecorator0);
      VecInt vecInt0 = new VecInt(112);
      SubModelIterator subModelIterator0 = new SubModelIterator(minimal4CardinalityModel0, vecInt0, (-678L));
      MinOneDecorator minOneDecorator1 = new MinOneDecorator(subModelIterator0);
      InstanceReader instanceReader0 = new InstanceReader(subModelIterator0);
      OptimizationMode optimizationMode0 = (OptimizationMode)ILauncherMode.OPTIMIZATION;
      // Undeclared exception!
      try { 
        optimizationMode0.displayResult(minOneDecorator1, subModelIterator0, (ILogAble) null, mockPrintWriter0, instanceReader0, 1L, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.OptimizationMode", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      OptimizationMode optimizationMode0 = new OptimizationMode();
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      MUSLauncher mUSLauncher0 = new MUSLauncher();
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      PrintWriter printWriter0 = new PrintWriter(writer0);
      ExitCode exitCode0 = ExitCode.SATISFIABLE;
      optimizationMode0.setExitCode(exitCode0);
      Reader reader0 = mUSLauncher0.createReader(dimacsStringSolver0, "c ");
      // Undeclared exception!
      try { 
        optimizationMode0.displayResult(dimacsStringSolver0, dimacsStringSolver0, mUSLauncher0, printWriter0, reader0, 13, true);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      PrintWriter printWriter0 = new PrintWriter(writer0);
      OptimizationMode optimizationMode0 = new OptimizationMode();
      MUSLauncher mUSLauncher0 = new MUSLauncher();
      optimizationMode0.displayResult((ISolver) null, (IProblem) null, mUSLauncher0, printWriter0, (Reader) null, 1L, true);
      assertEquals(0L, mUSLauncher0.getBeginTime());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      OptimizationMode optimizationMode0 = (OptimizationMode)ILauncherMode.OPTIMIZATION;
      ExitCode exitCode0 = optimizationMode0.getCurrentExitCode();
      assertEquals("UNKNOWN", exitCode0.toString());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      OptimizationMode optimizationMode0 = new OptimizationMode();
      optimizationMode0.onUnsatTermination();
      assertEquals(ExitCode.UNKNOWN, optimizationMode0.getCurrentExitCode());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      OptimizationMode optimizationMode0 = new OptimizationMode();
      optimizationMode0.setIncomplete(true);
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver(13);
      MUSLauncher mUSLauncher0 = new MUSLauncher();
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      PrintWriter printWriter0 = new PrintWriter(writer0);
      Reader reader0 = mUSLauncher0.createReader(dimacsStringSolver0, "c ");
      ExitCode exitCode0 = ExitCode.UPPER_BOUND;
      optimizationMode0.setExitCode(exitCode0);
      // Undeclared exception!
      try { 
        optimizationMode0.displayResult(dimacsStringSolver0, dimacsStringSolver0, mUSLauncher0, printWriter0, reader0, 1L, false);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      OptimizationMode optimizationMode0 = new OptimizationMode();
      VecInt vecInt0 = new VecInt();
      // Undeclared exception!
      try { 
        optimizationMode0.onSolutionFound((IVecInt) vecInt0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.OptimizationMode", e);
      }
  }
}