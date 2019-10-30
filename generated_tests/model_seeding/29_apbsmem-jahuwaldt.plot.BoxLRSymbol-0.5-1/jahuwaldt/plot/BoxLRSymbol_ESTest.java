/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 29 08:22:09 GMT 2019
 */

package jahuwaldt.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jahuwaldt.plot.BoxLRSymbol;
import java.awt.Color;
import java.awt.Graphics;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BoxLRSymbol_ESTest extends BoxLRSymbol_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BoxLRSymbol boxLRSymbol0 = new BoxLRSymbol();
      int[] intArray0 = new int[3];
      boxLRSymbol0.xPoints = intArray0;
      // Undeclared exception!
      try { 
        boxLRSymbol0.generatePoints(5, (-822));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.BoxLRSymbol", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BoxLRSymbol boxLRSymbol0 = new BoxLRSymbol();
      boxLRSymbol0.generatePoints(172, 172);
      int[] intArray0 = new int[2];
      boxLRSymbol0.xPoints = intArray0;
      // Undeclared exception!
      try { 
        boxLRSymbol0.generatePoints(0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("jahuwaldt.plot.BoxLRSymbol", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BoxLRSymbol boxLRSymbol0 = new BoxLRSymbol();
      Graphics graphics0 = mock(Graphics.class, new ViolatedAssumptionAnswer());
      doReturn((Color) null).when(graphics0).getColor();
      boxLRSymbol0.draw(graphics0, 876, 0);
      boxLRSymbol0.generatePoints((-1), (-1));
      assertEquals(8, boxLRSymbol0.getSize());
  }
}
