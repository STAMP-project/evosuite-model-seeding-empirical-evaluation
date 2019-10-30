/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 28 19:28:33 GMT 2019
 */

package jahuwaldt.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jahuwaldt.plot.Triangle4Symbol;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Triangle4Symbol_ESTest extends Triangle4Symbol_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Triangle4Symbol triangle4Symbol0 = new Triangle4Symbol();
      triangle4Symbol0.generatePoints(27, 0);
      assertEquals(8, triangle4Symbol0.getSize());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Triangle4Symbol triangle4Symbol0 = new Triangle4Symbol();
      int[] intArray0 = new int[1];
      triangle4Symbol0.xPoints = intArray0;
      // Undeclared exception!
      try { 
        triangle4Symbol0.generatePoints(0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.Triangle4Symbol", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Triangle4Symbol triangle4Symbol0 = new Triangle4Symbol();
      int[] intArray0 = new int[7];
      triangle4Symbol0.yPoints = intArray0;
      int[] intArray1 = new int[1];
      triangle4Symbol0.xPoints = intArray1;
      // Undeclared exception!
      try { 
        triangle4Symbol0.generatePoints((-2166), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("jahuwaldt.plot.Triangle4Symbol", e);
      }
  }
}