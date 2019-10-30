/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 29 08:21:36 GMT 2019
 */

package jahuwaldt.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jahuwaldt.plot.TabRSymbol;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TabRSymbol_ESTest extends TabRSymbol_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TabRSymbol tabRSymbol0 = new TabRSymbol();
      int[] intArray0 = new int[4];
      tabRSymbol0.xPoints = intArray0;
      // Undeclared exception!
      try { 
        tabRSymbol0.generatePoints((-4852), 4);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.TabRSymbol", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TabRSymbol tabRSymbol0 = new TabRSymbol();
      int[] intArray0 = new int[0];
      tabRSymbol0.yPoints = intArray0;
      tabRSymbol0.generatePoints(0, 545);
      tabRSymbol0.yPoints = intArray0;
      // Undeclared exception!
      try { 
        tabRSymbol0.generatePoints(562, (-220));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("jahuwaldt.plot.TabRSymbol", e);
      }
  }
}