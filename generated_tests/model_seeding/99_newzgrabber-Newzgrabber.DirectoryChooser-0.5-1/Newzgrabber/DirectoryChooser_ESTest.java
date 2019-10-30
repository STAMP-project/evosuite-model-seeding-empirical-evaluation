/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 29 09:05:10 GMT 2019
 */

package Newzgrabber;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import Newzgrabber.DirectoryChooser;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DirectoryChooser_ESTest extends DirectoryChooser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DirectoryChooser directoryChooser0 = new DirectoryChooser();
      Object object0 = new Object();
      ActionEvent actionEvent0 = new ActionEvent(object0, 948, "'QMdA5I2e@sFJ", 948, (-1));
      directoryChooser0.actionPerformed(actionEvent0);
      assertTrue(directoryChooser0.getFocusTraversalKeysEnabled());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DirectoryChooser directoryChooser0 = new DirectoryChooser();
      // Undeclared exception!
      try { 
        directoryChooser0.getSelectedDirectory();
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }
}