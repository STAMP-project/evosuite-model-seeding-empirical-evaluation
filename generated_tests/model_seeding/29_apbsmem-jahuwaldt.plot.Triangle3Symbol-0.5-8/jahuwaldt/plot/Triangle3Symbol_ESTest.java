/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 29 16:07:59 GMT 2019
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
      triangle3Symbol0.generatePoints(1127, 1127);
      triangle3Symbol0.yPoints = null;
      // Undeclared exception!
      try { 
        triangle3Symbol0.generatePoints(0, 2026);
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
      triangle3Symbol0.generatePoints((-3219), (-1554));
      triangle3Symbol0.generatePoints(3, 1339);
      assertEquals(8, triangle3Symbol0.getSize());
  }
}