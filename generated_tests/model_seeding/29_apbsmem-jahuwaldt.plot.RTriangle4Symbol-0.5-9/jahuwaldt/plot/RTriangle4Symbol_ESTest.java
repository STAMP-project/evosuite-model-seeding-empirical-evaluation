/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 29 17:12:41 GMT 2019
 */

package jahuwaldt.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jahuwaldt.plot.RTriangle4Symbol;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RTriangle4Symbol_ESTest extends RTriangle4Symbol_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RTriangle4Symbol rTriangle4Symbol0 = new RTriangle4Symbol();
      rTriangle4Symbol0.setSize(2628);
      rTriangle4Symbol0.generatePoints(33, (-638));
      assertEquals(2628, rTriangle4Symbol0.getSize());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RTriangle4Symbol rTriangle4Symbol0 = new RTriangle4Symbol();
      rTriangle4Symbol0.generatePoints(0, 349);
      rTriangle4Symbol0.yPoints = null;
      // Undeclared exception!
      try { 
        rTriangle4Symbol0.generatePoints(0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.RTriangle4Symbol", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RTriangle4Symbol rTriangle4Symbol0 = new RTriangle4Symbol();
      rTriangle4Symbol0.generatePoints(33, 33);
      int[] intArray0 = new int[1];
      rTriangle4Symbol0.xPoints = intArray0;
      // Undeclared exception!
      try { 
        rTriangle4Symbol0.generatePoints(33, (-638));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("jahuwaldt.plot.RTriangle4Symbol", e);
      }
  }
}