/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 29 08:26:24 GMT 2019
 */

package httpanalyzer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import httpanalyzer.Base64Transformer;
import java.awt.Frame;
import java.awt.HeadlessException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Base64Transformer_ESTest extends Base64Transformer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Base64Transformer base64Transformer0 = null;
      try {
        base64Transformer0 = new Base64Transformer((Frame) null, false);
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
      String[] stringArray0 = new String[0];
      Base64Transformer.main(stringArray0);
      assertEquals(0, stringArray0.length);
  }
}
