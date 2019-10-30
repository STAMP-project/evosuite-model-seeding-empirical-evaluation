/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 25 16:19:59 GMT 2019
 */

package jahuwaldt.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jahuwaldt.plot.BoxURSymbol;
import jahuwaldt.plot.RTriangle4Symbol;
import jahuwaldt.plot.TabDSymbol;
import jahuwaldt.plot.TabLSymbol;
import jahuwaldt.plot.ThinRect2Symbol;
import jahuwaldt.plot.Triangle2Symbol;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.DebugGraphics;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PlotSymbol_ESTest extends PlotSymbol_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ThinRect2Symbol thinRect2Symbol0 = new ThinRect2Symbol();
      int int0 = thinRect2Symbol0.getSize();
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TabLSymbol tabLSymbol0 = new TabLSymbol();
      tabLSymbol0.setSize((-333));
      int int0 = tabLSymbol0.getSize();
      assertEquals((-333), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BoxURSymbol boxURSymbol0 = new BoxURSymbol();
      Color color0 = new Color(0);
      boxURSymbol0.setFillColor(color0);
      boxURSymbol0.getFillColor();
      assertEquals(8, boxURSymbol0.getSize());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BoxURSymbol boxURSymbol0 = new BoxURSymbol();
      Color color0 = DebugGraphics.flashColor();
      boxURSymbol0.setFillColor(color0);
      boxURSymbol0.getFillColor();
      assertEquals(8, boxURSymbol0.getSize());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Triangle2Symbol triangle2Symbol0 = new Triangle2Symbol();
      triangle2Symbol0.setBorderColor((Color) null);
      triangle2Symbol0.getBorderColor();
      assertEquals(8, triangle2Symbol0.getSize());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Triangle2Symbol triangle2Symbol0 = new Triangle2Symbol();
      Color color0 = Color.orange;
      triangle2Symbol0.setBorderColor(color0);
      triangle2Symbol0.getBorderColor();
      assertEquals(8, triangle2Symbol0.getSize());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Triangle2Symbol triangle2Symbol0 = new Triangle2Symbol();
      // Undeclared exception!
      try { 
        triangle2Symbol0.draw((Graphics) null, (-3195), (-3195));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.PolygonSymbol", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TabDSymbol tabDSymbol0 = new TabDSymbol();
      tabDSymbol0.getFillColor();
      assertEquals(8, tabDSymbol0.getSize());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TabDSymbol tabDSymbol0 = new TabDSymbol();
      tabDSymbol0.getBorderColor();
      assertEquals(8, tabDSymbol0.getSize());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Triangle2Symbol triangle2Symbol0 = new Triangle2Symbol();
      Color color0 = new Color(1);
      triangle2Symbol0.setBorderColor(color0);
      triangle2Symbol0.getBorderColor();
      assertEquals(8, triangle2Symbol0.getSize());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TabDSymbol tabDSymbol0 = new TabDSymbol();
      TabDSymbol tabDSymbol1 = (TabDSymbol)tabDSymbol0.clone();
      assertNotSame(tabDSymbol1, tabDSymbol0);
      assertEquals(8, tabDSymbol1.getSize());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RTriangle4Symbol rTriangle4Symbol0 = new RTriangle4Symbol();
      assertEquals(8, rTriangle4Symbol0.getSize());
      
      rTriangle4Symbol0.setSize(0);
      int int0 = rTriangle4Symbol0.getSize();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TabDSymbol tabDSymbol0 = new TabDSymbol();
      Color color0 = new Color((-1258));
      tabDSymbol0.setFillColor(color0);
      tabDSymbol0.getFillColor();
      assertEquals(8, tabDSymbol0.getSize());
  }
}