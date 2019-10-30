/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 25 16:21:25 GMT 2019
 */

package jahuwaldt.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import jahuwaldt.plot.BoxLLSymbol;
import jahuwaldt.plot.BoxURSymbol;
import jahuwaldt.plot.PlotDatum;
import jahuwaldt.plot.PlotSymbol;
import jahuwaldt.plot.SquareSymbol;
import jahuwaldt.plot.TabUpSymbol;
import java.awt.Color;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PlotDatum_ESTest extends PlotDatum_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PlotDatum plotDatum0 = new PlotDatum(1.0, 1.0, false);
      assertEquals(1.0, plotDatum0.y, 0.01);
      
      plotDatum0.setY(0.0);
      assertEquals(0.0, plotDatum0.y, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PlotDatum plotDatum0 = new PlotDatum(0.0, 0.0, false, (PlotSymbol) null);
      plotDatum0.setX((-2149.5981984575));
      plotDatum0.setY(0.0);
      assertEquals((-2149.5981984575), plotDatum0.x, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PlotDatum plotDatum0 = new PlotDatum(0.0, 0.0, false, (PlotSymbol) null);
      plotDatum0.setYError((-2149.5981984575));
      boolean boolean0 = plotDatum0.hasErrorBar();
      assertEquals((-2149.5981984575), plotDatum0.getYError(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PlotDatum plotDatum0 = new PlotDatum(1.0, 1.0, false);
      plotDatum0.setYError(10.0);
      double double0 = plotDatum0.getYError();
      assertEquals(10.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PlotDatum plotDatum0 = new PlotDatum(0.0, 0.0, true);
      double double0 = plotDatum0.getY();
      assertTrue(plotDatum0.connected());
      assertFalse(plotDatum0.hasErrorBar());
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, plotDatum0.x, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PlotDatum plotDatum0 = new PlotDatum(0.0, (-1658.585656), false);
      double double0 = plotDatum0.getY();
      assertEquals((-1658.585656), double0, 0.01);
      assertFalse(plotDatum0.connected());
      assertEquals(0.0, plotDatum0.x, 0.01);
      assertFalse(plotDatum0.hasErrorBar());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BoxLLSymbol boxLLSymbol0 = new BoxLLSymbol();
      PlotDatum plotDatum0 = new PlotDatum(0.0, 0.0, true, boxLLSymbol0);
      double double0 = plotDatum0.getX();
      assertEquals(0.0, double0, 0.01);
      assertTrue(plotDatum0.connected());
      assertEquals(0.0, plotDatum0.y, 0.01);
      assertFalse(plotDatum0.hasErrorBar());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PlotDatum plotDatum0 = new PlotDatum((-1.0), (-1.0), false);
      plotDatum0.getPlotSymbol();
      assertFalse(plotDatum0.connected());
      assertFalse(plotDatum0.hasErrorBar());
      assertEquals((-1.0), plotDatum0.x, 0.01);
      assertEquals((-1.0), plotDatum0.y, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TabUpSymbol tabUpSymbol0 = new TabUpSymbol();
      PlotDatum plotDatum0 = new PlotDatum((-1.0), 2570.0, true, tabUpSymbol0);
      BoxURSymbol boxURSymbol0 = new BoxURSymbol();
      boxURSymbol0.setSize(0);
      plotDatum0.setPlotSymbol(boxURSymbol0);
      plotDatum0.getPlotSymbol();
      assertEquals(2570.0, plotDatum0.y, 0.01);
      assertFalse(plotDatum0.hasErrorBar());
      assertTrue(plotDatum0.connected());
      assertEquals((-1.0), plotDatum0.x, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TabUpSymbol tabUpSymbol0 = new TabUpSymbol();
      tabUpSymbol0.setSize((-2372));
      PlotDatum plotDatum0 = new PlotDatum((-1180.7458938717), (-1180.7458938717), true, tabUpSymbol0);
      plotDatum0.getPlotSymbol();
      assertEquals((-1180.7458938717), plotDatum0.y, 0.01);
      assertEquals((-1180.7458938717), plotDatum0.x, 0.01);
      assertTrue(plotDatum0.connected());
      assertFalse(plotDatum0.hasErrorBar());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SquareSymbol squareSymbol0 = new SquareSymbol();
      PlotDatum plotDatum0 = new PlotDatum(3377.6, 3377.6, false, squareSymbol0);
      Color color0 = new Color((-250));
      plotDatum0.setLineColor(color0);
      Color color1 = plotDatum0.getLineColor();
      assertFalse(plotDatum0.connected());
      assertEquals(3377.6, plotDatum0.y, 0.01);
      assertEquals(3377.6, plotDatum0.x, 0.01);
      assertEquals(255, color1.getGreen());
      assertFalse(plotDatum0.hasErrorBar());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PlotDatum plotDatum0 = new PlotDatum((-1.0), (-1.0), false);
      boolean boolean0 = plotDatum0.connected();
      assertFalse(plotDatum0.hasErrorBar());
      assertEquals((-1.0), plotDatum0.y, 0.01);
      assertEquals((-1.0), plotDatum0.x, 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TabUpSymbol tabUpSymbol0 = new TabUpSymbol();
      PlotDatum plotDatum0 = new PlotDatum((-1180.7458938717), (-1180.7458938717), true, tabUpSymbol0);
      PlotDatum plotDatum1 = (PlotDatum)plotDatum0.clone();
      assertNotSame(plotDatum1, plotDatum0);
      assertTrue(plotDatum1.connected());
      assertFalse(plotDatum1.hasErrorBar());
      assertEquals((-1180.7458938717), plotDatum1.y, 0.01);
      assertEquals((-1180.7458938717), plotDatum1.x, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PlotDatum plotDatum0 = new PlotDatum(0.0, 0.0, false, (PlotSymbol) null);
      PlotDatum plotDatum1 = (PlotDatum)plotDatum0.clone();
      assertFalse(plotDatum1.hasErrorBar());
      assertFalse(plotDatum1.connected());
      assertEquals(0.0, plotDatum1.x, 0.01);
      assertEquals(0.0, plotDatum1.y, 0.01);
      assertNotSame(plotDatum1, plotDatum0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PlotDatum plotDatum0 = new PlotDatum((-1402.70952), (-20.0), false);
      plotDatum0.setLineColor((Color) null);
      assertFalse(plotDatum0.connected());
      assertEquals((-1402.70952), plotDatum0.x, 0.01);
      assertEquals((-20.0), plotDatum0.y, 0.01);
      assertFalse(plotDatum0.hasErrorBar());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PlotDatum plotDatum0 = new PlotDatum(1.0, 1.0, true);
      plotDatum0.setYError(0.0);
      assertTrue(plotDatum0.connected());
      assertEquals(1.0, plotDatum0.y, 0.01);
      assertEquals(1.0, plotDatum0.x, 0.01);
      assertFalse(plotDatum0.hasErrorBar());
      assertEquals(0.0, plotDatum0.getYError(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PlotDatum plotDatum0 = new PlotDatum(0.0, 0.0, false, (PlotSymbol) null);
      plotDatum0.setYError((-2149.5981984575));
      double double0 = plotDatum0.getYError();
      assertEquals((-2149.5981984575), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PlotDatum plotDatum0 = new PlotDatum(0.0, 0.0, false, (PlotSymbol) null);
      double double0 = plotDatum0.getYError();
      assertFalse(plotDatum0.connected());
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, plotDatum0.y, 0.01);
      assertEquals(0.0, plotDatum0.x, 0.01);
      assertFalse(plotDatum0.hasErrorBar());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TabUpSymbol tabUpSymbol0 = new TabUpSymbol();
      PlotDatum plotDatum0 = new PlotDatum((-1.0), 2570.0, true, tabUpSymbol0);
      boolean boolean0 = plotDatum0.connected();
      assertTrue(boolean0);
      assertFalse(plotDatum0.hasErrorBar());
      assertEquals(2570.0, plotDatum0.y, 0.01);
      assertEquals((-1.0), plotDatum0.x, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PlotDatum plotDatum0 = new PlotDatum(0.0, 0.0, false, (PlotSymbol) null);
      boolean boolean0 = plotDatum0.hasErrorBar();
      assertEquals(0.0, plotDatum0.x, 0.01);
      assertFalse(boolean0);
      assertEquals(0.0, plotDatum0.y, 0.01);
      assertFalse(plotDatum0.connected());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PlotDatum plotDatum0 = new PlotDatum(0.0, 0.0, false, (PlotSymbol) null);
      plotDatum0.setX((-2149.5981984575));
      double double0 = plotDatum0.getX();
      assertEquals((-2149.5981984575), plotDatum0.x, 0.01);
      assertEquals((-2149.5981984575), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TabUpSymbol tabUpSymbol0 = new TabUpSymbol();
      PlotDatum plotDatum0 = new PlotDatum((-1.0), 2570.0, true, tabUpSymbol0);
      plotDatum0.setConnected(true);
      assertEquals(2570.0, plotDatum0.y, 0.01);
      assertEquals((-1.0), plotDatum0.x, 0.01);
      assertFalse(plotDatum0.hasErrorBar());
      assertTrue(plotDatum0.connected());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TabUpSymbol tabUpSymbol0 = new TabUpSymbol();
      PlotDatum plotDatum0 = new PlotDatum((-1.0), 2570.0, true, tabUpSymbol0);
      plotDatum0.getPlotSymbol();
      assertTrue(plotDatum0.connected());
      assertFalse(plotDatum0.hasErrorBar());
      assertEquals((-1.0), plotDatum0.x, 0.01);
      assertEquals(2570.0, plotDatum0.y, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PlotDatum plotDatum0 = new PlotDatum(664.03609, 664.03609, false);
      double double0 = plotDatum0.getY();
      assertEquals(664.03609, double0, 0.01);
      assertFalse(plotDatum0.connected());
      assertEquals(664.03609, plotDatum0.x, 0.01);
      assertFalse(plotDatum0.hasErrorBar());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TabUpSymbol tabUpSymbol0 = new TabUpSymbol();
      PlotDatum plotDatum0 = new PlotDatum((-1.0), 2570.0, true, tabUpSymbol0);
      plotDatum0.getLineColor();
      assertTrue(plotDatum0.connected());
      assertEquals(2570.0, plotDatum0.y, 0.01);
      assertFalse(plotDatum0.hasErrorBar());
      assertEquals((-1.0), plotDatum0.x, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      PlotDatum plotDatum0 = new PlotDatum(1514.553531374, 1514.553531374, true);
      double double0 = plotDatum0.getX();
      assertEquals(1514.553531374, plotDatum0.y, 0.01);
      assertFalse(plotDatum0.hasErrorBar());
      assertEquals(1514.553531374, double0, 0.01);
      assertTrue(plotDatum0.connected());
  }
}