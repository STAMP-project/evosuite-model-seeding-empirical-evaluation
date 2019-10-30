/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 29 15:36:30 GMT 2019
 */

package de.progra.charting.render;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import de.progra.charting.CoordSystem;
import de.progra.charting.model.DefaultChartDataModel;
import de.progra.charting.model.EditableChartDataModel;
import de.progra.charting.model.EditableDataSet;
import de.progra.charting.model.ObjectChartDataModel;
import de.progra.charting.render.InterpolationChartRenderer;
import java.awt.Graphics2D;
import java.util.NoSuchElementException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class InterpolationChartRenderer_ESTest extends InterpolationChartRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      CoordSystem coordSystem0 = new CoordSystem(editableChartDataModel0);
      int[][] intArray0 = new int[5][2];
      double[] doubleArray0 = new double[12];
      String[] stringArray0 = new String[6];
      EditableChartDataModel editableChartDataModel1 = new EditableChartDataModel(intArray0, doubleArray0, stringArray0);
      editableChartDataModel1.setAutoScale(true);
      InterpolationChartRenderer interpolationChartRenderer0 = new InterpolationChartRenderer(coordSystem0, editableChartDataModel1);
      // Undeclared exception!
      interpolationChartRenderer0.renderChart((Graphics2D) null);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      CoordSystem coordSystem0 = new CoordSystem(editableChartDataModel0);
      EditableDataSet[] editableDataSetArray0 = new EditableDataSet[1];
      EditableDataSet editableDataSet0 = new EditableDataSet(20);
      editableDataSetArray0[0] = editableDataSet0;
      EditableChartDataModel editableChartDataModel1 = new EditableChartDataModel(editableDataSetArray0);
      InterpolationChartRenderer interpolationChartRenderer0 = new InterpolationChartRenderer(coordSystem0, editableChartDataModel1);
      // Undeclared exception!
      try { 
        interpolationChartRenderer0.renderChart((Graphics2D) null);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel();
      CoordSystem coordSystem0 = new CoordSystem(defaultChartDataModel0);
      int[][] intArray0 = new int[5][2];
      double[] doubleArray0 = new double[1];
      String[] stringArray0 = new String[6];
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel(intArray0, doubleArray0, stringArray0);
      InterpolationChartRenderer interpolationChartRenderer0 = new InterpolationChartRenderer(coordSystem0, editableChartDataModel0);
      // Undeclared exception!
      try { 
        interpolationChartRenderer0.renderChart((Graphics2D) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel();
      CoordSystem coordSystem0 = new CoordSystem(defaultChartDataModel0);
      int[][] intArray0 = new int[5][2];
      double[] doubleArray0 = new double[2];
      String[] stringArray0 = new String[6];
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel(intArray0, doubleArray0, stringArray0);
      InterpolationChartRenderer interpolationChartRenderer0 = new InterpolationChartRenderer(coordSystem0, editableChartDataModel0);
      // Undeclared exception!
      try { 
        interpolationChartRenderer0.renderChart((Graphics2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.render.InterpolationChartRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      CoordSystem coordSystem0 = new CoordSystem(objectChartDataModel0);
      InterpolationChartRenderer interpolationChartRenderer0 = new InterpolationChartRenderer(coordSystem0, objectChartDataModel0);
      interpolationChartRenderer0.renderChart((Graphics2D) null);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel();
      CoordSystem coordSystem0 = new CoordSystem(defaultChartDataModel0);
      InterpolationChartRenderer interpolationChartRenderer0 = new InterpolationChartRenderer(coordSystem0, defaultChartDataModel0);
      interpolationChartRenderer0.renderChart((Graphics2D) null);
  }
}
