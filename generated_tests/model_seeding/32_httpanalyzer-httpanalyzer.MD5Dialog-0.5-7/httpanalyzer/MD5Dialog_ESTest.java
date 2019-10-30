/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 29 15:08:05 GMT 2019
 */

package httpanalyzer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import httpanalyzer.MD5Dialog;
import java.awt.Frame;
import java.awt.HeadlessException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MD5Dialog_ESTest extends MD5Dialog_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[1];
      MD5Dialog.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MD5Dialog mD5Dialog0 = null;
      try {
        mD5Dialog0 = new MD5Dialog((Frame) null, true);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }
}
