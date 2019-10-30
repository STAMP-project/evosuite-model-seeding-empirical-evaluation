/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 29 11:52:10 GMT 2019
 */

package jahuwaldt.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jahuwaldt.plot.BoxLLSymbol;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BoxLLSymbol_ESTest extends BoxLLSymbol_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BoxLLSymbol boxLLSymbol0 = new BoxLLSymbol();
      int[] intArray0 = new int[2];
      boxLLSymbol0.xPoints = intArray0;
      // Undeclared exception!
      try { 
        boxLLSymbol0.generatePoints(12, 1493);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.BoxLLSymbol", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BoxLLSymbol boxLLSymbol0 = new BoxLLSymbol();
      boxLLSymbol0.generatePoints(0, (-2625));
      int[] intArray0 = new int[2];
      boxLLSymbol0.yPoints = intArray0;
      // Undeclared exception!
      try { 
        boxLLSymbol0.generatePoints(3473, 2210);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("jahuwaldt.plot.BoxLLSymbol", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BoxLLSymbol boxLLSymbol0 = new BoxLLSymbol();
      boxLLSymbol0.generatePoints(5, 5);
      boxLLSymbol0.generatePoints(5, 5);
      assertEquals(8, boxLLSymbol0.getSize());
  }
}