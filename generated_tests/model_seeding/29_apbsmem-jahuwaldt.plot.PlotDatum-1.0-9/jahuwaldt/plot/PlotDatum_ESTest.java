/*
 * This file was automatically generated by EvoSuite
 * Sat Oct 26 00:39:12 GMT 2019
 */

package jahuwaldt.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import jahuwaldt.plot.PlotDatum;
import jahuwaldt.plot.PlotSymbol;
import jahuwaldt.plot.RTriangle4Symbol;
import java.awt.Color;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PlotDatum_ESTest extends PlotDatum_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PlotDatum plotDatum0 = new PlotDatum(2.0, 2.0, true);
      plotDatum0.setX((-2039.0));
      assertEquals((-2039.0), plotDatum0.x, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PlotDatum plotDatum0 = new PlotDatum(2.0, 2.0, true);
      plotDatum0.setY(200);
      double double0 = plotDatum0.getY();
      assertEquals(200.0, plotDatum0.y, 0.01);
      assertEquals(200.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PlotDatum plotDatum0 = new PlotDatum(2.0, 2.0, true);
      plotDatum0.setYError((-2039.0));
      boolean boolean0 = plotDatum0.hasErrorBar();
      assertEquals((-2039.0), plotDatum0.getYError(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PlotDatum plotDatum0 = new PlotDatum(993.30568321067, 1384.548, true);
      assertEquals(0.0, plotDatum0.getYError(), 0.01);
      
      plotDatum0.setYError(1384.548);
      double double0 = plotDatum0.getYError();
      assertEquals(1384.548, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PlotDatum plotDatum0 = new PlotDatum(0.0, 0.0, false);
      double double0 = plotDatum0.getY();
      assertFalse(plotDatum0.connected());
      assertFalse(plotDatum0.hasErrorBar());
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, plotDatum0.x, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PlotDatum plotDatum0 = new PlotDatum((-1.0), (-1.0), false, (PlotSymbol) null);
      double double0 = plotDatum0.getY();
      assertEquals((-1.0), plotDatum0.x, 0.01);
      assertEquals((-1.0), double0, 0.01);
      assertFalse(plotDatum0.connected());
      assertFalse(plotDatum0.hasErrorBar());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PlotDatum plotDatum0 = new PlotDatum(1769.387853812247, (-762.72740105896), true);
      double double0 = plotDatum0.getX();
      assertTrue(plotDatum0.connected());
      assertEquals(1769.387853812247, double0, 0.01);
      assertFalse(plotDatum0.hasErrorBar());
      assertEquals((-762.72740105896), plotDatum0.y, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PlotDatum plotDatum0 = new PlotDatum((-1.0), (-1.0), false, (PlotSymbol) null);
      double double0 = plotDatum0.getX();
      assertEquals((-1.0), plotDatum0.y, 0.01);
      assertEquals((-1.0), double0, 0.01);
      assertFalse(plotDatum0.hasErrorBar());
      assertFalse(plotDatum0.connected());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PlotDatum plotDatum0 = new PlotDatum(0.0, 0.0, true);
      plotDatum0.getPlotSymbol();
      assertFalse(plotDatum0.hasErrorBar());
      assertEquals(0.0, plotDatum0.y, 0.01);
      assertTrue(plotDatum0.connected());
      assertEquals(0.0, plotDatum0.x, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RTriangle4Symbol rTriangle4Symbol0 = new RTriangle4Symbol();
      rTriangle4Symbol0.setSize((-2145376482));
      PlotDatum plotDatum0 = new PlotDatum((-283.5907782), (-283.5907782), true, rTriangle4Symbol0);
      plotDatum0.getPlotSymbol();
      assertEquals((-283.5907782), plotDatum0.x, 0.01);
      assertEquals((-283.5907782), plotDatum0.y, 0.01);
      assertFalse(plotDatum0.hasErrorBar());
      assertTrue(plotDatum0.connected());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RTriangle4Symbol rTriangle4Symbol0 = new RTriangle4Symbol();
      PlotDatum plotDatum0 = new PlotDatum((-283.5907782), (-283.5907782), true, rTriangle4Symbol0);
      Color color0 = Color.MAGENTA;
      plotDatum0.setLineColor(color0);
      Color color1 = plotDatum0.getLineColor();
      assertFalse(plotDatum0.hasErrorBar());
      assertEquals((-283.5907782), plotDatum0.x, 0.01);
      assertEquals((-283.5907782), plotDatum0.y, 0.01);
      assertTrue(plotDatum0.connected());
      assertEquals((-65281), color1.getRGB());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PlotDatum plotDatum0 = new PlotDatum(1.0, 1.0, false);
      boolean boolean0 = plotDatum0.connected();
      assertEquals(1.0, plotDatum0.y, 0.01);
      assertEquals(1.0, plotDatum0.x, 0.01);
      assertFalse(boolean0);
      assertFalse(plotDatum0.hasErrorBar());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RTriangle4Symbol rTriangle4Symbol0 = new RTriangle4Symbol();
      PlotDatum plotDatum0 = new PlotDatum((-283.5907782), (-283.5907782), true, rTriangle4Symbol0);
      PlotDatum plotDatum1 = (PlotDatum)plotDatum0.clone();
      assertTrue(plotDatum1.connected());
      assertFalse(plotDatum1.hasErrorBar());
      assertEquals((-283.5907782), plotDatum1.y, 0.01);
      assertEquals((-283.5907782), plotDatum1.x, 0.01);
      assertNotSame(plotDatum1, plotDatum0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PlotDatum plotDatum0 = new PlotDatum(0.0, 0.0, true);
      PlotDatum plotDatum1 = (PlotDatum)plotDatum0.clone();
      assertFalse(plotDatum1.hasErrorBar());
      assertEquals(0.0, plotDatum1.x, 0.01);
      assertEquals(0.0, plotDatum1.y, 0.01);
      assertTrue(plotDatum1.connected());
      assertNotSame(plotDatum1, plotDatum0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RTriangle4Symbol rTriangle4Symbol0 = new RTriangle4Symbol();
      PlotDatum plotDatum0 = new PlotDatum((-283.5907782), (-283.5907782), true, rTriangle4Symbol0);
      Color color0 = Color.cyan;
      plotDatum0.setLineColor(color0);
      Color color1 = plotDatum0.getLineColor();
      assertEquals((-283.5907782), plotDatum0.y, 0.01);
      assertEquals((-283.5907782), plotDatum0.x, 0.01);
      assertTrue(plotDatum0.connected());
      assertFalse(plotDatum0.hasErrorBar());
      assertEquals((-16711681), color1.getRGB());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PlotDatum plotDatum0 = new PlotDatum(157.7206, 157.7206, false);
      plotDatum0.setLineColor((Color) null);
      assertFalse(plotDatum0.connected());
      assertFalse(plotDatum0.hasErrorBar());
      assertEquals(157.7206, plotDatum0.x, 0.01);
      assertEquals(157.7206, plotDatum0.y, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PlotDatum plotDatum0 = new PlotDatum(0.0, 0.0, true);
      plotDatum0.setYError(0.0);
      assertEquals(0.0, plotDatum0.x, 0.01);
      assertEquals(0.0, plotDatum0.y, 0.01);
      assertFalse(plotDatum0.hasErrorBar());
      assertEquals(0.0, plotDatum0.getYError(), 0.01);
      assertTrue(plotDatum0.connected());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PlotDatum plotDatum0 = new PlotDatum(2.0, 2.0, true);
      plotDatum0.setYError((-2039.0));
      double double0 = plotDatum0.getYError();
      assertEquals((-2039.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PlotDatum plotDatum0 = new PlotDatum(2.0, 2.0, true);
      double double0 = plotDatum0.getYError();
      assertEquals(0.0, double0, 0.01);
      assertFalse(plotDatum0.hasErrorBar());
      assertTrue(plotDatum0.connected());
      assertEquals(2.0, plotDatum0.x, 0.01);
      assertEquals(2.0, plotDatum0.y, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PlotDatum plotDatum0 = new PlotDatum(0.0, 0.0, true);
      boolean boolean0 = plotDatum0.connected();
      assertTrue(boolean0);
      assertEquals(0.0, plotDatum0.x, 0.01);
      assertEquals(0.0, plotDatum0.y, 0.01);
      assertFalse(plotDatum0.hasErrorBar());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PlotDatum plotDatum0 = new PlotDatum(2.0, 2.0, true);
      boolean boolean0 = plotDatum0.hasErrorBar();
      assertEquals(2.0, plotDatum0.y, 0.01);
      assertEquals(2.0, plotDatum0.x, 0.01);
      assertFalse(boolean0);
      assertTrue(plotDatum0.connected());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PlotDatum plotDatum0 = new PlotDatum(0.0, 0.0, false);
      plotDatum0.setConnected(false);
      assertFalse(plotDatum0.connected());
      assertFalse(plotDatum0.hasErrorBar());
      assertEquals(0.0, plotDatum0.y, 0.01);
      assertEquals(0.0, plotDatum0.x, 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RTriangle4Symbol rTriangle4Symbol0 = new RTriangle4Symbol();
      PlotDatum plotDatum0 = new PlotDatum((-283.5907782), (-283.5907782), true, rTriangle4Symbol0);
      plotDatum0.getPlotSymbol();
      assertTrue(plotDatum0.connected());
      assertEquals((-283.5907782), plotDatum0.x, 0.01);
      assertEquals((-283.5907782), plotDatum0.y, 0.01);
      assertFalse(plotDatum0.hasErrorBar());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PlotDatum plotDatum0 = new PlotDatum(488.9749558666, 488.9749558666, false);
      plotDatum0.setPlotSymbol((PlotSymbol) null);
      assertFalse(plotDatum0.hasErrorBar());
      assertFalse(plotDatum0.connected());
      assertEquals(488.9749558666, plotDatum0.y, 0.01);
      assertEquals(488.9749558666, plotDatum0.x, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RTriangle4Symbol rTriangle4Symbol0 = new RTriangle4Symbol();
      PlotDatum plotDatum0 = new PlotDatum((-283.5907782), (-283.5907782), true, rTriangle4Symbol0);
      plotDatum0.getLineColor();
      assertTrue(plotDatum0.connected());
      assertFalse(plotDatum0.hasErrorBar());
      assertEquals((-283.5907782), plotDatum0.y, 0.01);
      assertEquals((-283.5907782), plotDatum0.x, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      PlotDatum plotDatum0 = new PlotDatum(0.0, 0.0, true);
      double double0 = plotDatum0.getX();
      assertEquals(0.0, double0, 0.01);
      assertFalse(plotDatum0.hasErrorBar());
      assertEquals(0.0, plotDatum0.y, 0.01);
      assertTrue(plotDatum0.connected());
  }
}