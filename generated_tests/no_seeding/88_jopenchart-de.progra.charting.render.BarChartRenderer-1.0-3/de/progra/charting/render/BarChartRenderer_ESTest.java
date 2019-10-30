/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 28 16:19:57 GMT 2019
 */

package de.progra.charting.render;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import de.progra.charting.CoordSystem;
import de.progra.charting.model.ChartDataModelConstraints;
import de.progra.charting.model.DataSet;
import de.progra.charting.model.DefaultChartDataModel;
import de.progra.charting.model.EditableChartDataModel;
import de.progra.charting.model.EditableDataSet;
import de.progra.charting.model.ObjectChartDataModel;
import de.progra.charting.model.StackedChartDataModelConstraints;
import de.progra.charting.render.BarChartRenderer;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.text.DecimalFormat;
import java.util.NoSuchElementException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BarChartRenderer_ESTest extends BarChartRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      CoordSystem coordSystem0 = new CoordSystem(objectChartDataModel0);
      BarChartRenderer barChartRenderer0 = new BarChartRenderer(coordSystem0, objectChartDataModel0);
      AffineTransform affineTransform0 = AffineTransform.getTranslateInstance(0, 20);
      barChartRenderer0.boxWidth = (float) 15;
      coordSystem0.setTransform(affineTransform0, 0);
      barChartRenderer0.renderChart((Graphics2D) null);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      CoordSystem coordSystem0 = new CoordSystem(objectChartDataModel0);
      BarChartRenderer barChartRenderer0 = new BarChartRenderer(coordSystem0, objectChartDataModel0);
      AffineTransform affineTransform0 = new AffineTransform(2323.0F, (-2980.0F), (float) 1, 2323.0F, Float.NEGATIVE_INFINITY, 2323.0F);
      coordSystem0.setTransform(affineTransform0, 0);
      barChartRenderer0.renderChart((Graphics2D) null);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      CoordSystem coordSystem0 = new CoordSystem(objectChartDataModel0);
      BarChartRenderer barChartRenderer0 = new BarChartRenderer(coordSystem0, objectChartDataModel0);
      StackedChartDataModelConstraints stackedChartDataModelConstraints0 = new StackedChartDataModelConstraints(objectChartDataModel0, 20);
      objectChartDataModel0.setChartDataModelConstraints(0, stackedChartDataModelConstraints0);
      // Undeclared exception!
      barChartRenderer0.renderChart((Graphics2D) null);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      CoordSystem coordSystem0 = new CoordSystem(objectChartDataModel0);
      BarChartRenderer barChartRenderer0 = new BarChartRenderer(coordSystem0, objectChartDataModel0);
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      ChartDataModelConstraints chartDataModelConstraints0 = editableChartDataModel0.getChartDataModelConstraints(0);
      objectChartDataModel0.setChartDataModelConstraints(0, chartDataModelConstraints0);
      // Undeclared exception!
      try { 
        barChartRenderer0.renderChart((Graphics2D) null);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      EditableDataSet editableDataSet0 = new EditableDataSet();
      DataSet[] dataSetArray0 = new DataSet[1];
      dataSetArray0[0] = (DataSet) editableDataSet0;
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel(dataSetArray0, dataSetArray0);
      CoordSystem coordSystem0 = new CoordSystem(objectChartDataModel0);
      BarChartRenderer barChartRenderer0 = new BarChartRenderer(coordSystem0, objectChartDataModel0);
      AffineTransform affineTransform0 = coordSystem0.getDefaultTransform(0);
      coordSystem0.setTransform(affineTransform0, 0);
      // Undeclared exception!
      try { 
        barChartRenderer0.renderChart((Graphics2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.render.BarChartRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      CoordSystem coordSystem0 = new CoordSystem(objectChartDataModel0);
      BarChartRenderer barChartRenderer0 = new BarChartRenderer(coordSystem0, objectChartDataModel0);
      AffineTransform affineTransform0 = AffineTransform.getTranslateInstance(0, 20);
      DecimalFormat decimalFormat0 = new DecimalFormat();
      barChartRenderer0.barTopFormat = decimalFormat0;
      coordSystem0.setTransform(affineTransform0, 0);
      // Undeclared exception!
      try { 
        barChartRenderer0.renderChart((Graphics2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.render.BarChartRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel();
      CoordSystem coordSystem0 = new CoordSystem(defaultChartDataModel0);
      BarChartRenderer barChartRenderer0 = new BarChartRenderer(coordSystem0, defaultChartDataModel0);
      barChartRenderer0.renderChart((Graphics2D) null);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      CoordSystem coordSystem0 = new CoordSystem(objectChartDataModel0);
      DecimalFormat decimalFormat0 = new DecimalFormat();
      Font font0 = coordSystem0.getFont();
      BarChartRenderer barChartRenderer0 = new BarChartRenderer(coordSystem0, objectChartDataModel0, decimalFormat0, font0, 0);
  }
}