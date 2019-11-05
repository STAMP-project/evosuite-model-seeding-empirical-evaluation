/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 05 12:56:41 GMT 2019
 */

package Newzgrabber;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import Newzgrabber.MessageDialog;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MessageDialog_ESTest extends MessageDialog_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MessageDialog messageDialog0 = null;
      try {
        messageDialog0 = new MessageDialog((Frame) null, "/??/i$-rnkm*a7$", 0, 0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Frame frame0 = mock(Frame.class, new ViolatedAssumptionAnswer());
      doReturn((GraphicsConfiguration) null).when(frame0).getGraphicsConfiguration();
      MessageDialog messageDialog0 = null;
      try {
        messageDialog0 = new MessageDialog(frame0, "CREAT");
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MessageDialog messageDialog0 = null;
      try {
        messageDialog0 = new MessageDialog((Dialog) null, (String) null, 0, 0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MessageDialog messageDialog0 = null;
      try {
        messageDialog0 = new MessageDialog((Dialog) null, "");
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }
}
