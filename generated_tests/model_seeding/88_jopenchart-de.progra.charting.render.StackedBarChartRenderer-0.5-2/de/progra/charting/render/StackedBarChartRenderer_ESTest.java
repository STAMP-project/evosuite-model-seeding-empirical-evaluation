/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 29 10:09:37 GMT 2019
 */

package de.progra.charting.render;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import de.progra.charting.CoordSystem;
import de.progra.charting.model.EditableChartDataModel;
import de.progra.charting.model.ObjectChartDataModel;
import de.progra.charting.render.StackedBarChartRenderer;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.text.DecimalFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StackedBarChartRenderer_ESTest extends StackedBarChartRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[][] intArray0 = new int[1][3];
      String[] stringArray0 = new String[1];
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel(intArray0, intArray0, stringArray0);
      DecimalFormat decimalFormat0 = new DecimalFormat("Q");
      CoordSystem coordSystem0 = new CoordSystem(objectChartDataModel0, decimalFormat0, true, true, true);
      StackedBarChartRenderer stackedBarChartRenderer0 = new StackedBarChartRenderer(coordSystem0, objectChartDataModel0, 0.0F);
      // Undeclared exception!
      try { 
        stackedBarChartRenderer0.renderChart((Graphics2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.render.StackedBarChartRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      CoordSystem coordSystem0 = new CoordSystem(objectChartDataModel0);
      Rectangle rectangle0 = new Rectangle();
      coordSystem0.setBounds(rectangle0);
      Number[][] numberArray0 = new Number[1][8];
      Number[] numberArray1 = new Number[4];
      numberArray1[0] = (Number) 0;
      numberArray1[1] = (Number) 15;
      numberArray1[2] = (Number) 0;
      numberArray1[3] = (Number) 0;
      numberArray0[0] = numberArray1;
      String[] stringArray0 = new String[9];
      ObjectChartDataModel objectChartDataModel1 = new ObjectChartDataModel(numberArray0, numberArray1, stringArray0);
      StackedBarChartRenderer stackedBarChartRenderer0 = new StackedBarChartRenderer(coordSystem0, objectChartDataModel1, 0);
      // Undeclared exception!
      try { 
        stackedBarChartRenderer0.renderChart((Graphics2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.render.StackedBarChartRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      CoordSystem coordSystem0 = new CoordSystem(objectChartDataModel0);
      Rectangle rectangle0 = new Rectangle();
      coordSystem0.setBounds(rectangle0);
      Number[][] numberArray0 = new Number[2][7];
      Number[] numberArray1 = new Number[2];
      numberArray1[0] = (Number) (-1190);
      numberArray1[1] = (Number) 15;
      numberArray0[0] = numberArray1;
      numberArray0[1] = numberArray1;
      String[] stringArray0 = new String[6];
      ObjectChartDataModel objectChartDataModel1 = new ObjectChartDataModel(numberArray0, numberArray1, stringArray0);
      StackedBarChartRenderer stackedBarChartRenderer0 = new StackedBarChartRenderer(coordSystem0, objectChartDataModel1, 845.4575F);
      // Undeclared exception!
      try { 
        stackedBarChartRenderer0.renderChart((Graphics2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.render.StackedBarChartRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      CoordSystem coordSystem0 = new CoordSystem(objectChartDataModel0);
      Rectangle rectangle0 = new Rectangle();
      coordSystem0.setBounds(rectangle0);
      StackedBarChartRenderer stackedBarChartRenderer0 = new StackedBarChartRenderer(coordSystem0, objectChartDataModel0);
      stackedBarChartRenderer0.renderChart((Graphics2D) null);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int[][] intArray0 = new int[1][3];
      int[] intArray1 = new int[1];
      intArray1[0] = (-24);
      intArray0[0] = intArray1;
      String[] stringArray0 = new String[1];
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel(intArray0, intArray0, stringArray0);
      CoordSystem coordSystem0 = new CoordSystem(objectChartDataModel0, (String) null, (String) null);
      StackedBarChartRenderer stackedBarChartRenderer0 = new StackedBarChartRenderer(coordSystem0, objectChartDataModel0, (-24));
      // Undeclared exception!
      try { 
        stackedBarChartRenderer0.renderChart((Graphics2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.render.StackedBarChartRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      CoordSystem coordSystem0 = new CoordSystem(objectChartDataModel0);
      Number[][] numberArray0 = new Number[2][8];
      Number[] numberArray1 = new Number[0];
      numberArray0[0] = numberArray1;
      Number[] numberArray2 = new Number[4];
      numberArray2[0] = (Number) 1;
      numberArray2[1] = (Number) coordSystem0.SECOND_YAXIS;
      numberArray2[2] = (Number) 20;
      numberArray2[3] = (Number) 20;
      numberArray0[1] = numberArray2;
      String[] stringArray0 = new String[2];
      ObjectChartDataModel objectChartDataModel1 = new ObjectChartDataModel(numberArray0, numberArray2, stringArray0);
      StackedBarChartRenderer stackedBarChartRenderer0 = new StackedBarChartRenderer(coordSystem0, objectChartDataModel1, 0.0F);
      // Undeclared exception!
      try { 
        stackedBarChartRenderer0.renderChart((Graphics2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.render.StackedBarChartRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      StackedBarChartRenderer stackedBarChartRenderer0 = new StackedBarChartRenderer((CoordSystem) null, editableChartDataModel0);
      stackedBarChartRenderer0.renderChart((Graphics2D) null);
  }
}
