/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 29 09:37:14 GMT 2019
 */

package jahuwaldt.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jahuwaldt.plot.AxisLimitData;
import jahuwaldt.plot.LinearAxisScale;
import jahuwaldt.plot.PlotDatum;
import jahuwaldt.plot.TickMarkData;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LinearAxisScale_ESTest extends LinearAxisScale_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      assertNotNull(linearAxisScale0);
      assertEquals(1.0, linearAxisScale0.upperBounds(), 0.01);
      assertEquals((-1.0), linearAxisScale0.lowerBounds(), 0.01);
      
      PlotDatum plotDatum0 = new PlotDatum(2.0, 0.0, false);
      assertNotNull(plotDatum0);
      assertEquals(2.0, plotDatum0.x, 0.01);
      assertEquals(0.0, plotDatum0.y, 0.01);
      assertEquals(2.0, plotDatum0.getX(), 0.01);
      assertEquals(0.0, plotDatum0.getYError(), 0.01);
      assertEquals(0.0, plotDatum0.getY(), 0.01);
      assertFalse(plotDatum0.connected());
      assertFalse(plotDatum0.hasErrorBar());
      
      AxisLimitData axisLimitData0 = linearAxisScale0.findGoodLimits((-4637.2), 0.0);
      assertNotNull(axisLimitData0);
      assertEquals(1.0, linearAxisScale0.upperBounds(), 0.01);
      assertEquals((-1.0), linearAxisScale0.lowerBounds(), 0.01);
      
      plotDatum0.setYError((-670.0));
      assertEquals(2.0, plotDatum0.x, 0.01);
      assertEquals(0.0, plotDatum0.y, 0.01);
      assertEquals(2.0, plotDatum0.getX(), 0.01);
      assertEquals(0.0, plotDatum0.getY(), 0.01);
      assertFalse(plotDatum0.connected());
      assertTrue(plotDatum0.hasErrorBar());
      assertEquals((-670.0), plotDatum0.getYError(), 0.01);
      
      linearAxisScale0.adjustForErrorBars(plotDatum0, 1.0, (-202.786), axisLimitData0);
      assertEquals(2.0, plotDatum0.x, 0.01);
      assertEquals(0.0, plotDatum0.y, 0.01);
      assertEquals(1.0, linearAxisScale0.upperBounds(), 0.01);
      assertEquals((-1.0), linearAxisScale0.lowerBounds(), 0.01);
      assertEquals(2.0, plotDatum0.getX(), 0.01);
      assertEquals(0.0, plotDatum0.getY(), 0.01);
      assertFalse(plotDatum0.connected());
      assertTrue(plotDatum0.hasErrorBar());
      assertEquals((-670.0), plotDatum0.getYError(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      assertNotNull(linearAxisScale0);
      assertEquals((-1.0), linearAxisScale0.lowerBounds(), 0.01);
      assertEquals(1.0, linearAxisScale0.upperBounds(), 0.01);
      
      TickMarkData tickMarkData0 = linearAxisScale0.calcTickMarks(0.0, (-1.0), 2946.030185324, 2.0, 852.98245);
      assertNotNull(tickMarkData0);
      assertEquals((-1.0), linearAxisScale0.lowerBounds(), 0.01);
      assertEquals(1.0, linearAxisScale0.upperBounds(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      assertNotNull(linearAxisScale0);
      assertEquals(1.0, linearAxisScale0.upperBounds(), 0.01);
      assertEquals((-1.0), linearAxisScale0.lowerBounds(), 0.01);
      
      AxisLimitData axisLimitData0 = linearAxisScale0.findGoodLimits(5.0, 5.0);
      assertNotNull(axisLimitData0);
      assertEquals(1.0, linearAxisScale0.upperBounds(), 0.01);
      assertEquals((-1.0), linearAxisScale0.lowerBounds(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      assertNotNull(linearAxisScale0);
      assertEquals((-1.0), linearAxisScale0.lowerBounds(), 0.01);
      assertEquals(1.0, linearAxisScale0.upperBounds(), 0.01);
      
      AxisLimitData axisLimitData0 = linearAxisScale0.findGoodLimits(1.0E-6, 0.0);
      assertNotNull(axisLimitData0);
      assertEquals((-1.0), linearAxisScale0.lowerBounds(), 0.01);
      assertEquals(1.0, linearAxisScale0.upperBounds(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      assertNotNull(linearAxisScale0);
      assertEquals((-1.0), linearAxisScale0.lowerBounds(), 0.01);
      assertEquals(1.0, linearAxisScale0.upperBounds(), 0.01);
      
      double double0 = linearAxisScale0.func(1.0E-6);
      assertEquals(1.0E-6, double0, 0.01);
      assertEquals((-1.0), linearAxisScale0.lowerBounds(), 0.01);
      assertEquals(1.0, linearAxisScale0.upperBounds(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      assertNotNull(linearAxisScale0);
      assertEquals(1.0, linearAxisScale0.upperBounds(), 0.01);
      assertEquals((-1.0), linearAxisScale0.lowerBounds(), 0.01);
      
      double double0 = linearAxisScale0.func((-814.458589));
      assertEquals((-814.458589), double0, 0.01);
      assertEquals(1.0, linearAxisScale0.upperBounds(), 0.01);
      assertEquals((-1.0), linearAxisScale0.lowerBounds(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      assertNotNull(linearAxisScale0);
      assertEquals(1.0, linearAxisScale0.upperBounds(), 0.01);
      assertEquals((-1.0), linearAxisScale0.lowerBounds(), 0.01);
      
      // Undeclared exception!
      linearAxisScale0.findGoodLimits((-722.8884849), (-1727.3));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      assertNotNull(linearAxisScale0);
      assertEquals((-1.0), linearAxisScale0.lowerBounds(), 0.01);
      assertEquals(1.0, linearAxisScale0.upperBounds(), 0.01);
      
      // Undeclared exception!
      try { 
        linearAxisScale0.calcTickMarks(2901.0, 2901.0, (-1.0), 2901.0, (-1.0));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.LinearAxisScale", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      assertNotNull(linearAxisScale0);
      assertEquals((-1.0), linearAxisScale0.lowerBounds(), 0.01);
      assertEquals(1.0, linearAxisScale0.upperBounds(), 0.01);
      
      PlotDatum plotDatum0 = new PlotDatum(2901.0, 10.0, false);
      assertNotNull(plotDatum0);
      assertEquals(10.0, plotDatum0.y, 0.01);
      assertEquals(2901.0, plotDatum0.x, 0.01);
      assertEquals(0.0, plotDatum0.getYError(), 0.01);
      assertEquals(2901.0, plotDatum0.getX(), 0.01);
      assertFalse(plotDatum0.hasErrorBar());
      assertFalse(plotDatum0.connected());
      assertEquals(10.0, plotDatum0.getY(), 0.01);
      
      // Undeclared exception!
      try { 
        linearAxisScale0.adjustForErrorBars(plotDatum0, 0.001, (-1.0), (AxisLimitData) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.LinearAxisScale", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      assertNotNull(linearAxisScale0);
      assertEquals((-1.0), linearAxisScale0.lowerBounds(), 0.01);
      assertEquals(1.0, linearAxisScale0.upperBounds(), 0.01);
      
      double double0 = linearAxisScale0.lowerBounds();
      assertEquals((-1.0), double0, 0.01);
      assertEquals((-1.0), linearAxisScale0.lowerBounds(), 0.01);
      assertEquals(1.0, linearAxisScale0.upperBounds(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      assertNotNull(linearAxisScale0);
      assertEquals((-1.0), linearAxisScale0.lowerBounds(), 0.01);
      assertEquals(1.0, linearAxisScale0.upperBounds(), 0.01);
      
      double double0 = linearAxisScale0.upperBounds();
      assertEquals(1.0, double0, 0.01);
      assertEquals((-1.0), linearAxisScale0.lowerBounds(), 0.01);
      assertEquals(1.0, linearAxisScale0.upperBounds(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      assertNotNull(linearAxisScale0);
      assertEquals(1.0, linearAxisScale0.upperBounds(), 0.01);
      assertEquals((-1.0), linearAxisScale0.lowerBounds(), 0.01);
      
      // Undeclared exception!
      linearAxisScale0.calcTickMarks((-834.8543), (-2.4000000000000007E289), (-2.4000000000000007E289), 171.16, (-303.20122944496));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      assertNotNull(linearAxisScale0);
      assertEquals((-1.0), linearAxisScale0.lowerBounds(), 0.01);
      assertEquals(1.0, linearAxisScale0.upperBounds(), 0.01);
      
      // Undeclared exception!
      linearAxisScale0.calcTickMarks(1.0, 1.0, 2901.0, 2901.0, (-5.013200000000001E265));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      assertNotNull(linearAxisScale0);
      assertEquals(1.0, linearAxisScale0.upperBounds(), 0.01);
      assertEquals((-1.0), linearAxisScale0.lowerBounds(), 0.01);
      
      TickMarkData tickMarkData0 = linearAxisScale0.calcTickMarks((-2303.952451232754), (-1512.0850792100332), (-2303.952451232754), 0.1, 0.1);
      assertNotNull(tickMarkData0);
      assertEquals(1.0, linearAxisScale0.upperBounds(), 0.01);
      assertEquals((-1.0), linearAxisScale0.lowerBounds(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      assertNotNull(linearAxisScale0);
      assertEquals((-1.0), linearAxisScale0.lowerBounds(), 0.01);
      assertEquals(1.0, linearAxisScale0.upperBounds(), 0.01);
      
      TickMarkData tickMarkData0 = linearAxisScale0.calcTickMarks(84.13036471403127, (-1.0), 0.0, (-2636.8375132060655), (-2408.7351845502253));
      assertNotNull(tickMarkData0);
      assertEquals((-1.0), linearAxisScale0.lowerBounds(), 0.01);
      assertEquals(1.0, linearAxisScale0.upperBounds(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      assertNotNull(linearAxisScale0);
      assertEquals((-1.0), linearAxisScale0.lowerBounds(), 0.01);
      assertEquals(1.0, linearAxisScale0.upperBounds(), 0.01);
      
      AxisLimitData axisLimitData0 = linearAxisScale0.findGoodLimits((-2636.8375132060655), (-834.8543));
      assertNotNull(axisLimitData0);
      assertEquals((-1.0), linearAxisScale0.lowerBounds(), 0.01);
      assertEquals(1.0, linearAxisScale0.upperBounds(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      AxisLimitData axisLimitData0 = linearAxisScale0.findGoodLimits((-2408.7351845502253), (-1055.6));
      assertNotNull(axisLimitData0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      AxisLimitData axisLimitData0 = linearAxisScale0.findGoodLimits(1.0, 5.0);
      assertNotNull(axisLimitData0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      AxisLimitData axisLimitData0 = linearAxisScale0.findGoodLimits(1.0, 1.04);
      assertNotNull(axisLimitData0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      AxisLimitData axisLimitData0 = linearAxisScale0.findGoodLimits((-1570.397101744514), (-1570.397101744514));
      assertNotNull(axisLimitData0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      linearAxisScale0.findGoodLimits(0.0, 0.0);
      assertEquals((-1.0), linearAxisScale0.lowerBounds(), 0.01);
      assertEquals(1.0, linearAxisScale0.upperBounds(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      double double0 = linearAxisScale0.func(0.0);
      assertEquals(0.0, double0, 0.01);
  }
}
