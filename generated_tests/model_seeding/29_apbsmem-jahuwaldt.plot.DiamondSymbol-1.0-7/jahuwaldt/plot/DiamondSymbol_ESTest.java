/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 25 22:15:25 GMT 2019
 */

package jahuwaldt.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jahuwaldt.plot.DiamondSymbol;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DiamondSymbol_ESTest extends DiamondSymbol_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DiamondSymbol diamondSymbol0 = new DiamondSymbol();
      int[] intArray0 = new int[1];
      diamondSymbol0.xPoints = intArray0;
      // Undeclared exception!
      try { 
        diamondSymbol0.generatePoints(0, 10);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.DiamondSymbol", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DiamondSymbol diamondSymbol0 = new DiamondSymbol();
      int[] intArray0 = new int[3];
      diamondSymbol0.generatePoints(2437, (-2525));
      diamondSymbol0.yPoints = intArray0;
      // Undeclared exception!
      try { 
        diamondSymbol0.generatePoints(98, 98);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("jahuwaldt.plot.DiamondSymbol", e);
      }
  }
}