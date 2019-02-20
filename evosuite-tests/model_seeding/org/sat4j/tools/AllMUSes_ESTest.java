/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 19 17:20:44 GMT 2019
 */

package org.sat4j.tools;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.util.Collection;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.junit.runner.RunWith;
import org.sat4j.core.ASolverFactory;
import org.sat4j.core.VecInt;
import org.sat4j.opt.MaxSatDecorator;
import org.sat4j.specs.IConstr;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVecInt;
import org.sat4j.tools.AbstractClauseSelectorSolver;
import org.sat4j.tools.AbstractMinimalModel;
import org.sat4j.tools.AllMUSes;
import org.sat4j.tools.CheckMUSSolutionListener;
import org.sat4j.tools.DimacsOutputSolver;
import org.sat4j.tools.DimacsStringSolver;
import org.sat4j.tools.FullClauseSelectorSolver;
import org.sat4j.tools.Minimal4CardinalityModel;
import org.sat4j.tools.Minimal4InclusionModel;
import org.sat4j.tools.OptToSatAdapter;
import org.sat4j.tools.SingleSolutionDetector;
import org.sat4j.tools.SolutionCounter;
import org.sat4j.tools.SolutionFoundListener;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AllMUSes_ESTest extends AllMUSes_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(iSolver0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn(false).when(iSolver0).isSatisfiable(anyBoolean());
      doReturn(0).when(iSolver0).nVars();
      doReturn((IConstr) null).when(iSolver0).addClause(any(org.sat4j.specs.IVecInt.class));
      doReturn(false, false).when(iSolver0).isVerbose();
      SolutionCounter solutionCounter0 = new SolutionCounter(iSolver0);
      assertNotNull(solutionCounter0);
      assertEquals(0, solutionCounter0.lowerBound());
      
      IVecInt iVecInt0 = mock(IVecInt.class, new ViolatedAssumptionAnswer());
      IConstr iConstr0 = solutionCounter0.addClause(iVecInt0);
      assertNull(iConstr0);
      assertEquals(0, solutionCounter0.lowerBound());
      
      solutionCounter0.setTimeout(4278);
      assertEquals(0, solutionCounter0.lowerBound());
      
      long long0 = solutionCounter0.countSolutions();
      assertEquals(0L, long0);
      assertEquals(0, solutionCounter0.lowerBound());
      
      ASolverFactory<SolutionCounter> aSolverFactory0 = (ASolverFactory<SolutionCounter>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      doReturn(solutionCounter0, (ISolver) null).when(aSolverFactory0).defaultSolver();
      AllMUSes allMUSes0 = new AllMUSes(aSolverFactory0);
      assertNotNull(allMUSes0);
      assertEquals(0, solutionCounter0.lowerBound());
      
      SolutionFoundListener solutionFoundListener0 = SolutionFoundListener.VOID;
      assertNotNull(solutionFoundListener0);
      
      // Undeclared exception!
      try { 
        allMUSes0.computeAllMUSesOrdered(solutionFoundListener0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.AbstractMinimalModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(iSolver0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn(false).when(iSolver0).isSatisfiable(anyBoolean());
      doReturn(0).when(iSolver0).nVars();
      doReturn((IConstr) null).when(iSolver0).addClause(any(org.sat4j.specs.IVecInt.class));
      doReturn(false, false).when(iSolver0).isVerbose();
      SolutionCounter solutionCounter0 = new SolutionCounter(iSolver0);
      assertNotNull(solutionCounter0);
      assertEquals(0, solutionCounter0.lowerBound());
      
      IVecInt iVecInt0 = mock(IVecInt.class, new ViolatedAssumptionAnswer());
      IConstr iConstr0 = solutionCounter0.addClause(iVecInt0);
      assertNull(iConstr0);
      assertEquals(0, solutionCounter0.lowerBound());
      
      solutionCounter0.setTimeout(398);
      assertEquals(0, solutionCounter0.lowerBound());
      
      long long0 = solutionCounter0.countSolutions();
      assertEquals(0L, long0);
      assertEquals(0, solutionCounter0.lowerBound());
      
      ASolverFactory<SolutionCounter> aSolverFactory0 = (ASolverFactory<SolutionCounter>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      doReturn(solutionCounter0, (ISolver) null).when(aSolverFactory0).defaultSolver();
      AllMUSes allMUSes0 = new AllMUSes(aSolverFactory0);
      assertNotNull(allMUSes0);
      assertEquals(0, solutionCounter0.lowerBound());
      
      SolutionFoundListener solutionFoundListener0 = SolutionFoundListener.VOID;
      assertNotNull(solutionFoundListener0);
      
      int[] intArray0 = new int[5];
      intArray0[0] = 1070;
      intArray0[1] = 0;
      intArray0[2] = 1;
      intArray0[3] = 0;
      intArray0[4] = 0;
      VecInt vecInt0 = new VecInt(intArray0);
      assertNotNull(vecInt0);
      assertEquals(5, intArray0.length);
      assertArrayEquals(new int[] {1070, 0, 1, 0, 0}, intArray0);
      assertEquals(5, vecInt0.size());
      assertFalse(vecInt0.isEmpty());
      assertEquals(0, vecInt0.last());
      
      VecInt vecInt1 = new VecInt(0, 467);
      assertNotNull(vecInt1);
      assertEquals(0, vecInt1.size());
      assertTrue(vecInt1.isEmpty());
      assertFalse(vecInt1.equals((Object)vecInt0));
      
      solutionFoundListener0.onSolutionFound((IVecInt) vecInt0);
      assertEquals(5, intArray0.length);
      assertArrayEquals(new int[] {1070, 0, 1, 0, 0}, intArray0);
      assertNotSame(vecInt0, vecInt1);
      assertEquals(5, vecInt0.size());
      assertFalse(vecInt0.isEmpty());
      assertEquals(0, vecInt0.last());
      assertFalse(vecInt0.equals((Object)vecInt1));
      
      // Undeclared exception!
      try { 
        allMUSes0.computeAllMUSes(solutionFoundListener0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.AbstractMinimalModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(iSolver0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn(0).when(iSolver0).nVars();
      doReturn(false, false).when(iSolver0).isVerbose();
      SolutionCounter solutionCounter0 = new SolutionCounter(iSolver0);
      assertNotNull(solutionCounter0);
      assertEquals(0, solutionCounter0.lowerBound());
      
      ASolverFactory<SolutionCounter> aSolverFactory0 = (ASolverFactory<SolutionCounter>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      doReturn(solutionCounter0).when(aSolverFactory0).defaultSolver();
      AllMUSes allMUSes0 = new AllMUSes(aSolverFactory0);
      assertNotNull(allMUSes0);
      assertEquals(0, solutionCounter0.lowerBound());
      
      SolutionFoundListener solutionFoundListener0 = SolutionFoundListener.VOID;
      assertNotNull(solutionFoundListener0);
      
      int[] intArray0 = new int[5];
      VecInt vecInt0 = new VecInt(intArray0);
      assertNotNull(vecInt0);
      assertEquals(5, intArray0.length);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0}, intArray0);
      assertEquals(0, vecInt0.last());
      assertFalse(vecInt0.isEmpty());
      assertEquals(5, vecInt0.size());
      
      List<IVecInt> list0 = allMUSes0.computeAllMSSOrdered(vecInt0, solutionFoundListener0);
      assertNotNull(list0);
      assertEquals(5, intArray0.length);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0}, intArray0);
      assertEquals(0, solutionCounter0.lowerBound());
      assertEquals(0, vecInt0.last());
      assertFalse(vecInt0.isEmpty());
      assertEquals(5, vecInt0.size());
      assertEquals(0, list0.size());
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(iSolver0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn(0).when(iSolver0).nVars();
      doReturn(false, false).when(iSolver0).isVerbose();
      SolutionCounter solutionCounter0 = new SolutionCounter(iSolver0);
      assertNotNull(solutionCounter0);
      assertEquals(0, solutionCounter0.lowerBound());
      
      ASolverFactory<SolutionCounter> aSolverFactory0 = (ASolverFactory<SolutionCounter>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      doReturn(solutionCounter0).when(aSolverFactory0).defaultSolver();
      AllMUSes allMUSes0 = new AllMUSes(aSolverFactory0);
      assertNotNull(allMUSes0);
      assertEquals(0, solutionCounter0.lowerBound());
      
      SolutionFoundListener solutionFoundListener0 = SolutionFoundListener.VOID;
      assertNotNull(solutionFoundListener0);
      
      int[] intArray0 = new int[5];
      VecInt vecInt0 = new VecInt(intArray0);
      assertNotNull(vecInt0);
      assertEquals(5, intArray0.length);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0}, intArray0);
      assertEquals(0, vecInt0.last());
      assertEquals(5, vecInt0.size());
      assertFalse(vecInt0.isEmpty());
      
      List<IVecInt> list0 = allMUSes0.computeAllMSS((IVecInt) vecInt0, solutionFoundListener0);
      assertNotNull(list0);
      assertEquals(5, intArray0.length);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0}, intArray0);
      assertEquals(0, solutionCounter0.lowerBound());
      assertEquals(0, vecInt0.last());
      assertEquals(5, vecInt0.size());
      assertFalse(vecInt0.isEmpty());
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(iSolver0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn(0).when(iSolver0).nVars();
      doReturn(false, false).when(iSolver0).isVerbose();
      SolutionCounter solutionCounter0 = new SolutionCounter(iSolver0);
      assertNotNull(solutionCounter0);
      assertEquals(0, solutionCounter0.lowerBound());
      
      ASolverFactory<SolutionCounter> aSolverFactory0 = (ASolverFactory<SolutionCounter>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      doReturn(solutionCounter0).when(aSolverFactory0).defaultSolver();
      AllMUSes allMUSes0 = new AllMUSes(aSolverFactory0);
      assertNotNull(allMUSes0);
      assertEquals(0, solutionCounter0.lowerBound());
      
      int[] intArray0 = new int[5];
      VecInt vecInt0 = new VecInt(intArray0);
      assertNotNull(vecInt0);
      assertEquals(5, intArray0.length);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0}, intArray0);
      assertEquals(0, vecInt0.last());
      assertFalse(vecInt0.isEmpty());
      assertEquals(5, vecInt0.size());
      
      List<IVecInt> list0 = allMUSes0.computeAllMSS((IVecInt) vecInt0);
      assertNotNull(list0);
      assertEquals(5, intArray0.length);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0}, intArray0);
      assertEquals(0, solutionCounter0.lowerBound());
      assertEquals(0, vecInt0.last());
      assertFalse(vecInt0.isEmpty());
      assertEquals(5, vecInt0.size());
      assertEquals(0, list0.size());
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      File file0 = MockFile.createTempFile("vDbk@5", "");
      assertNotNull(file0);
      assertFalse(file0.isDirectory());
      assertTrue(file0.canWrite());
      assertEquals("/tmp", file0.getParent());
      assertFalse(file0.isHidden());
      assertEquals(0L, file0.getUsableSpace());
      assertEquals(1392409281320L, file0.lastModified());
      assertTrue(file0.isAbsolute());
      assertEquals(0L, file0.getFreeSpace());
      assertTrue(file0.canRead());
      assertTrue(file0.exists());
      assertTrue(file0.isFile());
      assertEquals(0L, file0.length());
      assertEquals(0L, file0.getTotalSpace());
      assertTrue(file0.canExecute());
      
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(file0);
      assertNotNull(mockPrintWriter0);
      
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver(mockPrintWriter0);
      assertNotNull(dimacsOutputSolver0);
      assertFalse(file0.isDirectory());
      assertTrue(file0.canWrite());
      assertEquals("/tmp", file0.getParent());
      assertFalse(file0.isHidden());
      assertEquals(0L, file0.getUsableSpace());
      assertEquals(1392409281320L, file0.lastModified());
      assertTrue(file0.isAbsolute());
      assertEquals(0L, file0.getFreeSpace());
      assertTrue(file0.canRead());
      assertTrue(file0.exists());
      assertTrue(file0.isFile());
      assertEquals(0L, file0.length());
      assertEquals(0L, file0.getTotalSpace());
      assertTrue(file0.canExecute());
      assertEquals("", dimacsOutputSolver0.getLogPrefix());
      assertEquals(0, dimacsOutputSolver0.nVars());
      assertEquals(0L, dimacsOutputSolver0.getTimeoutMs());
      assertFalse(dimacsOutputSolver0.isSolverKeptHot());
      assertEquals(0, dimacsOutputSolver0.newVar());
      assertFalse(dimacsOutputSolver0.isDBSimplificationAllowed());
      assertEquals(0, dimacsOutputSolver0.nConstraints());
      assertEquals(0, dimacsOutputSolver0.getTimeout());
      assertFalse(dimacsOutputSolver0.isVerbose());
      assertEquals(0, dimacsOutputSolver0.realNumberOfVariables());
      
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(dimacsOutputSolver0, false);
      assertNotNull(maxSatDecorator0);
      assertFalse(file0.isDirectory());
      assertTrue(file0.canWrite());
      assertEquals("/tmp", file0.getParent());
      assertFalse(file0.isHidden());
      assertEquals(0L, file0.getUsableSpace());
      assertEquals(1392409281320L, file0.lastModified());
      assertTrue(file0.isAbsolute());
      assertEquals(0L, file0.getFreeSpace());
      assertTrue(file0.canRead());
      assertTrue(file0.exists());
      assertTrue(file0.isFile());
      assertEquals(0L, file0.length());
      assertEquals(0L, file0.getTotalSpace());
      assertTrue(file0.canExecute());
      assertEquals("", dimacsOutputSolver0.getLogPrefix());
      assertEquals(0, dimacsOutputSolver0.nVars());
      assertEquals(0L, dimacsOutputSolver0.getTimeoutMs());
      assertFalse(dimacsOutputSolver0.isSolverKeptHot());
      assertEquals(0, dimacsOutputSolver0.newVar());
      assertFalse(dimacsOutputSolver0.isDBSimplificationAllowed());
      assertEquals(0, dimacsOutputSolver0.nConstraints());
      assertEquals(0, dimacsOutputSolver0.getTimeout());
      assertFalse(dimacsOutputSolver0.isVerbose());
      assertEquals(0, dimacsOutputSolver0.realNumberOfVariables());
      assertFalse(maxSatDecorator0.isOptimal());
      assertFalse(maxSatDecorator0.isSolutionOptimal());
      assertFalse(maxSatDecorator0.hasNoObjectiveFunction());
      assertEquals(0, maxSatDecorator0.getNbexpectedclauses());
      assertFalse(maxSatDecorator0.nonOptimalMeansSatisfiable());
      assertEquals(0, maxSatDecorator0.getExpectedNumberOfClauses());
      
      ASolverFactory<MaxSatDecorator> aSolverFactory0 = (ASolverFactory<MaxSatDecorator>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      doReturn(maxSatDecorator0).when(aSolverFactory0).defaultSolver();
      AllMUSes allMUSes0 = new AllMUSes(true, aSolverFactory0);
      assertNotNull(allMUSes0);
      assertFalse(file0.isDirectory());
      assertTrue(file0.canWrite());
      assertEquals("/tmp", file0.getParent());
      assertFalse(file0.isHidden());
      assertEquals(0L, file0.getUsableSpace());
      assertEquals(1392409281320L, file0.lastModified());
      assertTrue(file0.isAbsolute());
      assertEquals(0L, file0.getFreeSpace());
      assertTrue(file0.canRead());
      assertTrue(file0.exists());
      assertTrue(file0.isFile());
      assertEquals(0L, file0.length());
      assertEquals(0L, file0.getTotalSpace());
      assertTrue(file0.canExecute());
      assertEquals("", dimacsOutputSolver0.getLogPrefix());
      assertEquals(0, dimacsOutputSolver0.nVars());
      assertEquals(0L, dimacsOutputSolver0.getTimeoutMs());
      assertFalse(dimacsOutputSolver0.isSolverKeptHot());
      assertEquals(0, dimacsOutputSolver0.newVar());
      assertFalse(dimacsOutputSolver0.isDBSimplificationAllowed());
      assertEquals(0, dimacsOutputSolver0.nConstraints());
      assertEquals(0, dimacsOutputSolver0.getTimeout());
      assertFalse(dimacsOutputSolver0.isVerbose());
      assertEquals(0, dimacsOutputSolver0.realNumberOfVariables());
      assertFalse(maxSatDecorator0.isOptimal());
      assertFalse(maxSatDecorator0.isSolutionOptimal());
      assertFalse(maxSatDecorator0.hasNoObjectiveFunction());
      assertEquals(0, maxSatDecorator0.getNbexpectedclauses());
      assertFalse(maxSatDecorator0.nonOptimalMeansSatisfiable());
      assertEquals(0, maxSatDecorator0.getExpectedNumberOfClauses());
      
      List<IVecInt> list0 = allMUSes0.computeAllMSS();
      assertNotNull(list0);
      assertFalse(file0.isDirectory());
      assertTrue(file0.canWrite());
      assertEquals("/tmp", file0.getParent());
      assertFalse(file0.isHidden());
      assertEquals(0L, file0.getUsableSpace());
      assertEquals(1392409281320L, file0.lastModified());
      assertTrue(file0.isAbsolute());
      assertEquals(0L, file0.getFreeSpace());
      assertTrue(file0.canRead());
      assertTrue(file0.exists());
      assertTrue(file0.isFile());
      assertEquals(0L, file0.length());
      assertEquals(0L, file0.getTotalSpace());
      assertTrue(file0.canExecute());
      assertEquals("", dimacsOutputSolver0.getLogPrefix());
      assertEquals(0, dimacsOutputSolver0.nVars());
      assertEquals(0L, dimacsOutputSolver0.getTimeoutMs());
      assertFalse(dimacsOutputSolver0.isSolverKeptHot());
      assertEquals(0, dimacsOutputSolver0.newVar());
      assertFalse(dimacsOutputSolver0.isDBSimplificationAllowed());
      assertEquals(0, dimacsOutputSolver0.nConstraints());
      assertEquals(0, dimacsOutputSolver0.getTimeout());
      assertFalse(dimacsOutputSolver0.isVerbose());
      assertEquals(0, dimacsOutputSolver0.realNumberOfVariables());
      assertFalse(maxSatDecorator0.isOptimal());
      assertFalse(maxSatDecorator0.isSolutionOptimal());
      assertFalse(maxSatDecorator0.hasNoObjectiveFunction());
      assertEquals(0, maxSatDecorator0.getNbexpectedclauses());
      assertFalse(maxSatDecorator0.nonOptimalMeansSatisfiable());
      assertEquals(0, maxSatDecorator0.getExpectedNumberOfClauses());
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      boolean boolean0 = true;
      int[] intArray0 = new int[0];
      AbstractMinimalModel abstractMinimalModel0 = mock(AbstractMinimalModel.class, new ViolatedAssumptionAnswer());
      doReturn((IConstr) null, (IConstr) null).when(abstractMinimalModel0).addBlockingClause(any(org.sat4j.specs.IVecInt.class));
      doReturn("> ").when(abstractMinimalModel0).getLogPrefix();
      doReturn(true, false, false).when(abstractMinimalModel0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn(true, false).when(abstractMinimalModel0).isVerbose();
      doReturn((Object) intArray0, (Object) intArray0).when(abstractMinimalModel0).modelWithInternalVariables();
      doReturn(2147483645).when(abstractMinimalModel0).nVars();
      ASolverFactory<AbstractMinimalModel> aSolverFactory0 = (ASolverFactory<AbstractMinimalModel>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      doReturn(abstractMinimalModel0, (ISolver) null).when(aSolverFactory0).defaultSolver();
      AllMUSes allMUSes0 = new AllMUSes(true, aSolverFactory0);
      assertNotNull(allMUSes0);
      assertEquals(0, intArray0.length);
      assertArrayEquals(new int[] {}, intArray0);
      
      // Undeclared exception!
      try { 
        allMUSes0.computeAllMUSes();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.AllMUSes", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AllMUSes allMUSes0 = null;
      try {
        allMUSes0 = new AllMUSes(true, (ASolverFactory<? extends ISolver>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.AllMUSes", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AllMUSes allMUSes0 = null;
      try {
        allMUSes0 = new AllMUSes((ASolverFactory<? extends ISolver>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.AllMUSes", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ASolverFactory<AbstractMinimalModel> aSolverFactory0 = (ASolverFactory<AbstractMinimalModel>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      doReturn((ISolver) null).when(aSolverFactory0).defaultSolver();
      AllMUSes allMUSes0 = new AllMUSes(aSolverFactory0);
      assertNotNull(allMUSes0);
      
      VecInt vecInt0 = new VecInt(1598, 1);
      assertNotNull(vecInt0);
      assertEquals(1598, vecInt0.size());
      assertEquals(1, vecInt0.last());
      assertFalse(vecInt0.isEmpty());
      
      SolutionFoundListener solutionFoundListener0 = SolutionFoundListener.VOID;
      assertNotNull(solutionFoundListener0);
      
      // Undeclared exception!
      try { 
        allMUSes0.computeAllMSS((IVecInt) vecInt0, solutionFoundListener0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.SolverDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ASolverFactory<Minimal4InclusionModel> aSolverFactory0 = (ASolverFactory<Minimal4InclusionModel>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      doReturn((ISolver) null).when(aSolverFactory0).defaultSolver();
      AllMUSes allMUSes0 = new AllMUSes(true, aSolverFactory0);
      assertNotNull(allMUSes0);
      
      // Undeclared exception!
      try { 
        allMUSes0.computeAllMUSes((IVecInt) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.SolverDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      VecInt vecInt0 = new VecInt(0, 0);
      assertNotNull(vecInt0);
      assertTrue(vecInt0.isEmpty());
      assertEquals(0, vecInt0.size());
      
      ASolverFactory<Minimal4CardinalityModel> aSolverFactory0 = (ASolverFactory<Minimal4CardinalityModel>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      doReturn((ISolver) null).when(aSolverFactory0).defaultSolver();
      AllMUSes allMUSes0 = new AllMUSes(aSolverFactory0);
      assertNotNull(allMUSes0);
      
      // Undeclared exception!
      try { 
        allMUSes0.computeAllMSS((IVecInt) vecInt0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.SolverDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      doReturn(false, false, false).when(iSolver0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn(0, 0, 0, (-1455), (-1455)).when(iSolver0).nVars();
      doReturn((String) null, (String) null).when(iSolver0).getLogPrefix();
      doReturn(false, false, false, false, true).when(iSolver0).isVerbose();
      SolutionCounter solutionCounter0 = new SolutionCounter(iSolver0);
      assertNotNull(solutionCounter0);
      assertEquals(0, solutionCounter0.lowerBound());
      
      ASolverFactory<SolutionCounter> aSolverFactory0 = (ASolverFactory<SolutionCounter>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      doReturn(solutionCounter0, solutionCounter0, solutionCounter0).when(aSolverFactory0).defaultSolver();
      AllMUSes allMUSes0 = new AllMUSes(aSolverFactory0);
      assertNotNull(allMUSes0);
      assertEquals(0, solutionCounter0.lowerBound());
      
      SolutionFoundListener solutionFoundListener0 = SolutionFoundListener.VOID;
      assertNotNull(solutionFoundListener0);
      
      VecInt vecInt0 = new VecInt();
      assertNotNull(vecInt0);
      assertEquals(0, vecInt0.size());
      assertTrue(vecInt0.isEmpty());
      
      List<IVecInt> list0 = allMUSes0.computeAllMUSesOrdered((IVecInt) vecInt0, solutionFoundListener0);
      assertNotNull(list0);
      assertEquals(0, solutionCounter0.lowerBound());
      assertEquals(0, vecInt0.size());
      assertTrue(vecInt0.isEmpty());
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
      
      // Undeclared exception!
      try { 
        allMUSes0.computeAllMUSes(solutionFoundListener0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.core.VecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AbstractMinimalModel abstractMinimalModel0 = mock(AbstractMinimalModel.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(abstractMinimalModel0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn(false, false).when(abstractMinimalModel0).isVerbose();
      doReturn(2147483645).when(abstractMinimalModel0).nVars();
      ASolverFactory<AbstractMinimalModel> aSolverFactory0 = (ASolverFactory<AbstractMinimalModel>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      doReturn(abstractMinimalModel0, (ISolver) null).when(aSolverFactory0).defaultSolver();
      AllMUSes allMUSes0 = new AllMUSes(true, aSolverFactory0);
      // Undeclared exception!
      try { 
        allMUSes0.computeAllMUSes();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.AbstractMinimalModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ASolverFactory<MaxSatDecorator> aSolverFactory0 = (ASolverFactory<MaxSatDecorator>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      doReturn((ISolver) null).when(aSolverFactory0).defaultSolver();
      AllMUSes allMUSes0 = new AllMUSes(aSolverFactory0);
      ASolverFactory<Minimal4CardinalityModel> aSolverFactory1 = (ASolverFactory<Minimal4CardinalityModel>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      CheckMUSSolutionListener checkMUSSolutionListener0 = new CheckMUSSolutionListener(aSolverFactory1);
      VecInt vecInt0 = new VecInt(1598, 1);
      // Undeclared exception!
      try { 
        allMUSes0.computeAllMSSOrdered(vecInt0, checkMUSSolutionListener0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.SolverDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver(100);
      ASolverFactory<DimacsStringSolver> aSolverFactory0 = (ASolverFactory<DimacsStringSolver>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      doReturn(dimacsStringSolver0, (ISolver) null).when(aSolverFactory0).defaultSolver();
      AllMUSes allMUSes0 = new AllMUSes(aSolverFactory0);
      // Undeclared exception!
      try { 
        allMUSes0.computeAllMUSes();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.AbstractMinimalModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ASolverFactory<Minimal4InclusionModel> aSolverFactory0 = (ASolverFactory<Minimal4InclusionModel>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      doReturn((ISolver) null).when(aSolverFactory0).defaultSolver();
      AllMUSes allMUSes0 = new AllMUSes(false, aSolverFactory0);
      FullClauseSelectorSolver fullClauseSelectorSolver0 = (FullClauseSelectorSolver)allMUSes0.getSolverInstance();
      assertFalse(fullClauseSelectorSolver0.isSkipDuplicatedEntries());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ASolverFactory<OptToSatAdapter> aSolverFactory0 = (ASolverFactory<OptToSatAdapter>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      doReturn((ISolver) null).when(aSolverFactory0).defaultSolver();
      AllMUSes allMUSes0 = new AllMUSes(false, aSolverFactory0);
      allMUSes0.reset();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ASolverFactory<SolutionCounter> aSolverFactory0 = (ASolverFactory<SolutionCounter>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      doReturn((ISolver) null).when(aSolverFactory0).defaultSolver();
      AllMUSes allMUSes0 = new AllMUSes(aSolverFactory0);
      List<IVecInt> list0 = allMUSes0.getMssList();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      AbstractClauseSelectorSolver<SingleSolutionDetector> abstractClauseSelectorSolver0 = (AbstractClauseSelectorSolver<SingleSolutionDetector>) mock(AbstractClauseSelectorSolver.class, new ViolatedAssumptionAnswer());
      doReturn((Collection<Integer>) null).when(abstractClauseSelectorSolver0).getAddedVars();
      ASolverFactory<Minimal4InclusionModel> aSolverFactory0 = (ASolverFactory<Minimal4InclusionModel>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      AllMUSes allMUSes0 = new AllMUSes(abstractClauseSelectorSolver0, aSolverFactory0);
      // Undeclared exception!
      try { 
        allMUSes0.computeAllMSS();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.AllMUSes", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ASolverFactory<AbstractMinimalModel> aSolverFactory0 = (ASolverFactory<AbstractMinimalModel>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      doReturn((ISolver) null).when(aSolverFactory0).defaultSolver();
      AllMUSes allMUSes0 = new AllMUSes(aSolverFactory0);
      // Undeclared exception!
      try { 
        allMUSes0.computeAllMSS((SolutionFoundListener) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.SolverDecorator", e);
      }
  }
}