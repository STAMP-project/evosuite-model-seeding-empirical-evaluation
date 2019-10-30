/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 29 18:17:37 GMT 2019
 */

package jahuwaldt.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jahuwaldt.plot.SquareSymbol;
import java.awt.Color;
import java.awt.Graphics;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SquareSymbol_ESTest extends SquareSymbol_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SquareSymbol squareSymbol0 = new SquareSymbol();
      Color color0 = new Color((-2324));
      Graphics graphics0 = mock(Graphics.class, new ViolatedAssumptionAnswer());
      doReturn(color0).when(graphics0).getColor();
      squareSymbol0.setFillColor(color0);
      squareSymbol0.draw(graphics0, 1229, 3);
      assertEquals(8, squareSymbol0.getSize());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SquareSymbol squareSymbol0 = new SquareSymbol();
      Color color0 = new Color((-2324));
      Graphics graphics0 = mock(Graphics.class, new ViolatedAssumptionAnswer());
      doReturn(color0).when(graphics0).getColor();
      Color color1 = Color.BLACK;
      squareSymbol0.setFillColor(color1);
      squareSymbol0.draw(graphics0, (-2338), (-2338));
      assertEquals(8, squareSymbol0.getSize());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SquareSymbol squareSymbol0 = new SquareSymbol();
      // Undeclared exception!
      try { 
        squareSymbol0.draw((Graphics) null, (-3451), (-3451));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.SquareSymbol", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SquareSymbol squareSymbol0 = new SquareSymbol();
      Graphics graphics0 = mock(Graphics.class, new ViolatedAssumptionAnswer());
      doReturn((Color) null).when(graphics0).getColor();
      squareSymbol0.setBorderColor((Color) null);
      squareSymbol0.draw(graphics0, 1229, 3);
      assertEquals(8, squareSymbol0.getSize());
  }
}
