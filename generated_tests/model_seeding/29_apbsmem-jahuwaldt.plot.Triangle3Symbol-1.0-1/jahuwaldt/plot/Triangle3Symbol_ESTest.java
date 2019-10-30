/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 25 10:57:04 GMT 2019
 */

package jahuwaldt.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jahuwaldt.plot.Triangle3Symbol;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Triangle3Symbol_ESTest extends Triangle3Symbol_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Triangle3Symbol triangle3Symbol0 = new Triangle3Symbol();
      int[] intArray0 = new int[1];
      triangle3Symbol0.xPoints = intArray0;
      // Undeclared exception!
      try { 
        triangle3Symbol0.generatePoints(2, 2032);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.Triangle3Symbol", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Triangle3Symbol triangle3Symbol0 = new Triangle3Symbol();
      triangle3Symbol0.generatePoints(2692, 2692);
      int[] intArray0 = new int[1];
      triangle3Symbol0.xPoints = intArray0;
      // Undeclared exception!
      try { 
        triangle3Symbol0.generatePoints(27, (-976));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("jahuwaldt.plot.Triangle3Symbol", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Triangle3Symbol triangle3Symbol0 = new Triangle3Symbol();
      triangle3Symbol0.generatePoints(1129, 3);
      triangle3Symbol0.generatePoints((-2812), (-2812));
      assertEquals(8, triangle3Symbol0.getSize());
  }
}