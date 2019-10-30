/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 29 11:52:09 GMT 2019
 */

package jahuwaldt.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jahuwaldt.plot.TabUpSymbol;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TabUpSymbol_ESTest extends TabUpSymbol_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TabUpSymbol tabUpSymbol0 = new TabUpSymbol();
      int[] intArray0 = new int[2];
      tabUpSymbol0.xPoints = intArray0;
      // Undeclared exception!
      try { 
        tabUpSymbol0.generatePoints(0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.TabUpSymbol", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TabUpSymbol tabUpSymbol0 = new TabUpSymbol();
      tabUpSymbol0.generatePoints((-1258), (-1258));
      int[] intArray0 = new int[2];
      tabUpSymbol0.yPoints = intArray0;
      // Undeclared exception!
      try { 
        tabUpSymbol0.generatePoints(0, (-1258));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("jahuwaldt.plot.TabUpSymbol", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TabUpSymbol tabUpSymbol0 = new TabUpSymbol();
      tabUpSymbol0.generatePoints((-366), 0);
      tabUpSymbol0.generatePoints((-366), 0);
      assertEquals(8, tabUpSymbol0.getSize());
  }
}