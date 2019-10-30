/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 29 08:57:56 GMT 2019
 */

package de.progra.charting;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import de.progra.charting.Axis;
import de.progra.charting.model.ChartDataModelConstraints;
import de.progra.charting.model.DefaultChartDataModel;
import de.progra.charting.model.EditableChartDataModel;
import de.progra.charting.model.ObjectChartDataModel;
import de.progra.charting.model.StackedChartDataModelConstraints;
import java.util.NoSuchElementException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Axis_ESTest extends Axis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ChartDataModelConstraints chartDataModelConstraints0 = mock(ChartDataModelConstraints.class, new ViolatedAssumptionAnswer());
      doReturn((double)(-982)).when(chartDataModelConstraints0).getMaximumColumnValue();
      doReturn((double)(-982), (double)(-982)).when(chartDataModelConstraints0).getMinimumColumnValue();
      Axis axis0 = new Axis((-982), chartDataModelConstraints0);
      double double0 = axis0.getPixelForValue((-982));
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(Integer.MAX_VALUE, axis0.getLength());
      assertEquals(1, axis0.getAlignment());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ChartDataModelConstraints chartDataModelConstraints0 = mock(ChartDataModelConstraints.class, new ViolatedAssumptionAnswer());
      doReturn((double)(-982)).when(chartDataModelConstraints0).getMaximumColumnValue();
      doReturn((double)(-982)).when(chartDataModelConstraints0).getMinimumColumnValue();
      Axis axis0 = new Axis(4, chartDataModelConstraints0);
      double double0 = axis0.getPointToPixelRatio();
      assertEquals(Integer.MAX_VALUE, axis0.getLength());
      assertEquals(0.0, double0, 0.01);
      assertEquals(1, axis0.getAlignment());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ChartDataModelConstraints chartDataModelConstraints0 = mock(ChartDataModelConstraints.class, new ViolatedAssumptionAnswer());
      doReturn((double)(-982)).when(chartDataModelConstraints0).getMaximumColumnValue();
      doReturn((-868.015972903365)).when(chartDataModelConstraints0).getMinimumColumnValue();
      Axis axis0 = new Axis((-982), chartDataModelConstraints0);
      double double0 = axis0.getPointToPixelRatio();
      assertEquals((-5.307794881505565E-8), double0, 0.01);
      assertEquals(1, axis0.getAlignment());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      ChartDataModelConstraints chartDataModelConstraints0 = objectChartDataModel0.getChartDataModelConstraints(2);
      Axis axis0 = new Axis((-982), chartDataModelConstraints0);
      double double0 = axis0.getPixelForValue(0.0);
      assertEquals(1, axis0.getAlignment());
      assertEquals(0.0, double0, 0.01);
      assertEquals(Integer.MAX_VALUE, axis0.getLength());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      ChartDataModelConstraints chartDataModelConstraints0 = objectChartDataModel0.getChartDataModelConstraints((-512));
      Axis axis0 = new Axis((-172), chartDataModelConstraints0);
      assertEquals(Integer.MAX_VALUE, axis0.getLength());
      
      axis0.length = (-339);
      double double0 = axis0.getPixelForValue(1930.70857692362);
      assertEquals((-654510.2075771072), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Axis axis0 = new Axis(Integer.MIN_VALUE, (ChartDataModelConstraints) null);
      assertEquals(Integer.MAX_VALUE, axis0.getLength());
      
      axis0.setLength(0);
      int int0 = axis0.getLength();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      ChartDataModelConstraints chartDataModelConstraints0 = objectChartDataModel0.getChartDataModelConstraints((-512));
      Axis axis0 = new Axis((-172), chartDataModelConstraints0);
      axis0.setLength((-512));
      int int0 = axis0.getLength();
      assertEquals((-512), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      StackedChartDataModelConstraints stackedChartDataModelConstraints0 = new StackedChartDataModelConstraints(objectChartDataModel0, 2);
      Axis axis0 = new Axis(2, stackedChartDataModelConstraints0);
      // Undeclared exception!
      axis0.getPointToPixelRatio();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      ChartDataModelConstraints chartDataModelConstraints0 = editableChartDataModel0.getChartDataModelConstraints((-1377));
      Axis axis0 = new Axis((-1377), chartDataModelConstraints0);
      // Undeclared exception!
      try { 
        axis0.getPointToPixelRatio();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      StackedChartDataModelConstraints stackedChartDataModelConstraints0 = new StackedChartDataModelConstraints(objectChartDataModel0, 2);
      Axis axis0 = new Axis(2, stackedChartDataModelConstraints0);
      // Undeclared exception!
      axis0.getPixelForValue(2);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel();
      ChartDataModelConstraints chartDataModelConstraints0 = defaultChartDataModel0.getChartDataModelConstraints(5);
      Axis axis0 = new Axis(5, chartDataModelConstraints0);
      // Undeclared exception!
      try { 
        axis0.getPixelForValue(5);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Axis axis0 = new Axis(2, (ChartDataModelConstraints) null);
      // Undeclared exception!
      try { 
        axis0.getPixelForValue(2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Axis axis0 = new Axis(2, (ChartDataModelConstraints) null);
      // Undeclared exception!
      try { 
        axis0.getPointToPixelRatio();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      ChartDataModelConstraints chartDataModelConstraints0 = objectChartDataModel0.getChartDataModelConstraints(2);
      Axis axis0 = new Axis((-982), chartDataModelConstraints0);
      double double0 = axis0.getPointToPixelRatio();
      assertEquals(1, axis0.getAlignment());
      assertEquals(4.656612875245797E-10, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      ChartDataModelConstraints chartDataModelConstraints0 = objectChartDataModel0.getChartDataModelConstraints(2);
      Axis axis0 = new Axis((-982), chartDataModelConstraints0);
      int int0 = axis0.getAlignment();
      assertEquals(1, int0);
      assertEquals(Integer.MAX_VALUE, axis0.getLength());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      ChartDataModelConstraints chartDataModelConstraints0 = objectChartDataModel0.getChartDataModelConstraints((-512));
      Axis axis0 = new Axis(2, chartDataModelConstraints0);
      double double0 = axis0.getPixelForValue(2697.0);
      assertEquals(2, axis0.getAlignment());
      assertEquals(5.791763395959E12, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Axis axis0 = new Axis(1, (ChartDataModelConstraints) null);
      assertEquals(Integer.MAX_VALUE, axis0.getLength());
      assertEquals(1, axis0.getAlignment());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      ChartDataModelConstraints chartDataModelConstraints0 = objectChartDataModel0.getChartDataModelConstraints(2);
      Axis axis0 = new Axis((-982), chartDataModelConstraints0);
      int int0 = axis0.getLength();
      assertEquals(1, axis0.getAlignment());
      assertEquals(Integer.MAX_VALUE, int0);
  }
}