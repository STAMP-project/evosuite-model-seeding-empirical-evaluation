/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 29 10:52:52 GMT 2019
 */

package visu.handball.moves.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.print.PageFormat;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import javax.swing.DebugGraphics;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import visu.handball.moves.actions.AbstractPrintAction;
import visu.handball.moves.actions.PrintActualSequenzAction;
import visu.handball.moves.model.HandballModel;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractPrintAction_ESTest extends AbstractPrintAction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AbstractPrintAction abstractPrintAction0 = mock(AbstractPrintAction.class, CALLS_REAL_METHODS);
      AbstractPrintAction.SequencePagePrintable abstractPrintAction_SequencePagePrintable0 = abstractPrintAction0.new SequencePagePrintable((-753));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          HandballModel handballModel0 = new HandballModel();
          PrintActualSequenzAction printActualSequenzAction0 = new PrintActualSequenzAction(handballModel0);
          // Undeclared exception!
          try { 
            printActualSequenzAction0.doExport();
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.lang.RuntimePermission\" \"queuePrintJob\")
             // java.lang.Thread.getStackTrace(Thread.java:1559)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:434)
             // java.lang.SecurityManager.checkPrintJobAccess(SecurityManager.java:1378)
             // java.awt.print.PrinterJob.getPrinterJob(PrinterJob.java:75)
             // visu.handball.moves.actions.AbstractPrintAction.doExport(AbstractPrintAction.java:63)
             // sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
             // sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
             // sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
             // java.lang.reflect.Method.invoke(Method.java:498)
             // org.evosuite.testcase.statements.MethodStatement$1.execute(MethodStatement.java:257)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:169)
             // org.evosuite.testcase.statements.MethodStatement.execute(MethodStatement.java:220)
             // org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:307)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:213)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:55)
             // java.util.concurrent.FutureTask.run(FutureTask.java:266)
             // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
             // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
             // java.lang.Thread.run(Thread.java:748)
             //
             verifyException("org.evosuite.runtime.sandbox.MSecurityManager", e);
          }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PrintActualSequenzAction printActualSequenzAction0 = new PrintActualSequenzAction((HandballModel) null);
      AbstractPrintAction.SequencePagePrintable abstractPrintAction_SequencePagePrintable0 = printActualSequenzAction0.new SequencePagePrintable(0);
      DebugGraphics debugGraphics0 = new DebugGraphics();
      PageFormat pageFormat0 = new PageFormat();
      // Undeclared exception!
      try { 
        abstractPrintAction_SequencePagePrintable0.print(debugGraphics0, pageFormat0, 0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // javax.swing.DebugGraphics cannot be cast to java.awt.Graphics2D
         //
         verifyException("visu.handball.moves.actions.AbstractExportAction", e);
      }
  }
}
