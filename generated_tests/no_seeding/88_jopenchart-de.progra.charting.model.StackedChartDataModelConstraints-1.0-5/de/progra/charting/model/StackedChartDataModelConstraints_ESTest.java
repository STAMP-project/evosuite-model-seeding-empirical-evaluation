/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 28 18:52:55 GMT 2019
 */

package de.progra.charting.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import de.progra.charting.model.AbstractChartDataModel;
import de.progra.charting.model.DataSet;
import de.progra.charting.model.DefaultChartDataModel;
import de.progra.charting.model.DefaultDataSet;
import de.progra.charting.model.EditableChartDataModel;
import de.progra.charting.model.EditableDataSet;
import de.progra.charting.model.ObjectChartDataModel;
import de.progra.charting.model.StackedChartDataModelConstraints;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StackedChartDataModelConstraints_ESTest extends StackedChartDataModelConstraints_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int[][] intArray0 = new int[2][5];
      int[] intArray1 = new int[3];
      intArray1[0] = (-1478);
      intArray0[0] = intArray1;
      intArray0[1] = intArray0[0];
      double[] doubleArray0 = new double[2];
      String[] stringArray0 = new String[4];
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel(intArray0, doubleArray0, stringArray0);
      StackedChartDataModelConstraints stackedChartDataModelConstraints0 = new StackedChartDataModelConstraints(editableChartDataModel0, 882);
      stackedChartDataModelConstraints0.getMinimumValue();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[][] doubleArray0 = new double[1][9];
      double[] doubleArray1 = new double[1];
      doubleArray1[0] = (-1654.3216);
      doubleArray0[0] = doubleArray1;
      String[] stringArray0 = new String[5];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(doubleArray0, doubleArray1, stringArray0);
      StackedChartDataModelConstraints stackedChartDataModelConstraints0 = new StackedChartDataModelConstraints(defaultChartDataModel0, Integer.MAX_VALUE);
      stackedChartDataModelConstraints0.getMaximumValue();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int[][] intArray0 = new int[2][5];
      int[] intArray1 = new int[3];
      intArray1[1] = (-2168);
      intArray0[0] = intArray1;
      double[] doubleArray0 = new double[2];
      String[] stringArray0 = new String[6];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(intArray0, doubleArray0, stringArray0);
      StackedChartDataModelConstraints stackedChartDataModelConstraints0 = new StackedChartDataModelConstraints(defaultChartDataModel0, Integer.MAX_VALUE);
      stackedChartDataModelConstraints0.getMaximumValue();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[4] = 1964.0;
      String[] stringArray0 = new String[7];
      double[][] doubleArray1 = new double[5][5];
      doubleArray1[1] = doubleArray0;
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(doubleArray1, doubleArray0, stringArray0);
      StackedChartDataModelConstraints stackedChartDataModelConstraints0 = new StackedChartDataModelConstraints(defaultChartDataModel0, 9957);
      stackedChartDataModelConstraints0.getMaximumValue();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int[][] intArray0 = new int[2][5];
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) 882;
      doubleArray0[1] = 56.54276920003;
      String[] stringArray0 = new String[6];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(intArray0, doubleArray0, stringArray0);
      StackedChartDataModelConstraints stackedChartDataModelConstraints0 = new StackedChartDataModelConstraints(defaultChartDataModel0, Integer.MAX_VALUE);
      stackedChartDataModelConstraints0.getMinimumColumnValue();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[][] doubleArray0 = new double[1][9];
      double[] doubleArray1 = new double[1];
      doubleArray1[0] = (-1654.3216);
      String[] stringArray0 = new String[5];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(doubleArray0, doubleArray1, stringArray0);
      StackedChartDataModelConstraints stackedChartDataModelConstraints0 = new StackedChartDataModelConstraints(defaultChartDataModel0, Integer.MAX_VALUE);
      stackedChartDataModelConstraints0.getMinimumColumnValue();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int[][] intArray0 = new int[4][3];
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) (-2168);
      String[] stringArray0 = new String[4];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(intArray0, doubleArray0, stringArray0);
      StackedChartDataModelConstraints stackedChartDataModelConstraints0 = new StackedChartDataModelConstraints(defaultChartDataModel0, (-1478));
      stackedChartDataModelConstraints0.getMaximumColumnValue();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      StackedChartDataModelConstraints stackedChartDataModelConstraints0 = new StackedChartDataModelConstraints(objectChartDataModel0, (-4));
      // Undeclared exception!
      stackedChartDataModelConstraints0.getMinimumValue();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[][] doubleArray0 = new double[1][9];
      double[] doubleArray1 = new double[1];
      String[] stringArray0 = new String[5];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(doubleArray0, doubleArray1, stringArray0);
      StackedChartDataModelConstraints stackedChartDataModelConstraints0 = new StackedChartDataModelConstraints(defaultChartDataModel0, 1003);
      ArrayList<String> arrayList0 = new ArrayList<String>();
      defaultChartDataModel0.data = arrayList0;
      arrayList0.add("");
      // Undeclared exception!
      try { 
        stackedChartDataModelConstraints0.getMinimumValue();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      StackedChartDataModelConstraints stackedChartDataModelConstraints0 = new StackedChartDataModelConstraints(editableChartDataModel0, 9989);
      // Undeclared exception!
      try { 
        stackedChartDataModelConstraints0.getMinimumColumnValue();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StackedChartDataModelConstraints stackedChartDataModelConstraints0 = new StackedChartDataModelConstraints((AbstractChartDataModel) null, 446, false);
      // Undeclared exception!
      try { 
        stackedChartDataModelConstraints0.getMinimumColumnValue();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.model.StackedChartDataModelConstraints", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[][] doubleArray0 = new double[1][9];
      String[] stringArray0 = new String[5];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(doubleArray0, doubleArray0[0], stringArray0);
      defaultChartDataModel0.setAutoScale(true);
      StackedChartDataModelConstraints stackedChartDataModelConstraints0 = new StackedChartDataModelConstraints(defaultChartDataModel0, Integer.MAX_VALUE);
      // Undeclared exception!
      stackedChartDataModelConstraints0.getMaximumColumnValue();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel();
      StackedChartDataModelConstraints stackedChartDataModelConstraints0 = new StackedChartDataModelConstraints(defaultChartDataModel0, 1);
      // Undeclared exception!
      try { 
        stackedChartDataModelConstraints0.getMaximumColumnValue();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StackedChartDataModelConstraints stackedChartDataModelConstraints0 = new StackedChartDataModelConstraints((AbstractChartDataModel) null, 2, true);
      // Undeclared exception!
      try { 
        stackedChartDataModelConstraints0.getMaximumColumnValue();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.model.StackedChartDataModelConstraints", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Number[][] numberArray0 = new Number[2][5];
      Number[] numberArray1 = new Number[0];
      numberArray0[0] = numberArray1;
      numberArray0[1] = numberArray0[0];
      String[] stringArray0 = new String[4];
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel(numberArray0, numberArray1, stringArray0);
      objectChartDataModel0.autoscale = true;
      StackedChartDataModelConstraints stackedChartDataModelConstraints0 = new StackedChartDataModelConstraints(objectChartDataModel0, 0, true);
      double double0 = stackedChartDataModelConstraints0.getMaximumColumnValue();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel();
      StackedChartDataModelConstraints stackedChartDataModelConstraints0 = new StackedChartDataModelConstraints(defaultChartDataModel0, 3527);
      defaultChartDataModel0.setManualScale(true);
      double double0 = stackedChartDataModelConstraints0.getMaximumColumnValue();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Number[][] numberArray0 = new Number[2][5];
      Number[] numberArray1 = new Number[0];
      numberArray0[0] = numberArray1;
      numberArray0[1] = numberArray0[0];
      String[] stringArray0 = new String[4];
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel(numberArray0, numberArray1, stringArray0);
      objectChartDataModel0.autoscale = true;
      StackedChartDataModelConstraints stackedChartDataModelConstraints0 = new StackedChartDataModelConstraints(objectChartDataModel0, 0, true);
      double double0 = stackedChartDataModelConstraints0.getMinimumColumnValue();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[][] doubleArray0 = new double[1][9];
      double[] doubleArray1 = new double[1];
      String[] stringArray0 = new String[5];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(doubleArray0, doubleArray1, stringArray0);
      StackedChartDataModelConstraints stackedChartDataModelConstraints0 = new StackedChartDataModelConstraints(defaultChartDataModel0, Integer.MAX_VALUE);
      stackedChartDataModelConstraints0.allowManualColScale = false;
      defaultChartDataModel0.setManualScale(true);
      double double0 = stackedChartDataModelConstraints0.getMinimumColumnValue();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[][] doubleArray0 = new double[1][9];
      double[] doubleArray1 = new double[1];
      String[] stringArray0 = new String[5];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(doubleArray0, doubleArray1, stringArray0);
      StackedChartDataModelConstraints stackedChartDataModelConstraints0 = new StackedChartDataModelConstraints(defaultChartDataModel0, Integer.MAX_VALUE);
      defaultChartDataModel0.setManualScale(true);
      double double0 = stackedChartDataModelConstraints0.getMinimumColumnValue();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[][] doubleArray0 = new double[1][9];
      double[] doubleArray1 = new double[1];
      doubleArray1[0] = (-1654.3216);
      doubleArray0[0] = doubleArray1;
      String[] stringArray0 = new String[5];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(doubleArray0, doubleArray1, stringArray0);
      StackedChartDataModelConstraints stackedChartDataModelConstraints0 = new StackedChartDataModelConstraints(defaultChartDataModel0, Integer.MAX_VALUE);
      defaultChartDataModel0.setManualScale(true);
      // Undeclared exception!
      try { 
        stackedChartDataModelConstraints0.getMinimumValue();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.model.StackedChartDataModelConstraints", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[4] = 1964.0;
      String[] stringArray0 = new String[7];
      double[][] doubleArray1 = new double[5][5];
      doubleArray1[1] = doubleArray0;
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(doubleArray1, doubleArray0, stringArray0);
      StackedChartDataModelConstraints stackedChartDataModelConstraints0 = new StackedChartDataModelConstraints(defaultChartDataModel0, 9957);
      Number number0 = stackedChartDataModelConstraints0.getMinimumValue();
      assertEquals(0.0, number0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DataSet[] dataSetArray0 = new DataSet[2];
      DefaultDataSet defaultDataSet0 = new DefaultDataSet();
      dataSetArray0[0] = (DataSet) defaultDataSet0;
      dataSetArray0[1] = (DataSet) defaultDataSet0;
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel(dataSetArray0, dataSetArray0);
      StackedChartDataModelConstraints stackedChartDataModelConstraints0 = new StackedChartDataModelConstraints(objectChartDataModel0, 3, true);
      Number number0 = stackedChartDataModelConstraints0.getMinimumValue();
      assertEquals(0, number0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      int[][] intArray0 = new int[2][5];
      double[] doubleArray0 = new double[2];
      String[] stringArray0 = new String[6];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(intArray0, doubleArray0, stringArray0);
      StackedChartDataModelConstraints stackedChartDataModelConstraints0 = new StackedChartDataModelConstraints(defaultChartDataModel0, Integer.MAX_VALUE);
      Number number0 = stackedChartDataModelConstraints0.getMinimumValue();
      assertEquals(0, number0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[][] doubleArray0 = new double[1][9];
      double[] doubleArray1 = new double[4];
      String[] stringArray0 = new String[1];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(doubleArray0, doubleArray1, stringArray0);
      StackedChartDataModelConstraints stackedChartDataModelConstraints0 = new StackedChartDataModelConstraints(defaultChartDataModel0, 9957);
      defaultChartDataModel0.setManualScale(true);
      // Undeclared exception!
      try { 
        stackedChartDataModelConstraints0.getMaximumValue();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Number[][] numberArray0 = new Number[2][5];
      Number[] numberArray1 = new Number[0];
      numberArray0[0] = numberArray1;
      Number[] numberArray2 = new Number[1];
      BigInteger bigInteger0 = BigInteger.TEN;
      numberArray2[0] = (Number) bigInteger0;
      numberArray0[1] = numberArray2;
      String[] stringArray0 = new String[4];
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel(numberArray0, numberArray1, stringArray0);
      StackedChartDataModelConstraints stackedChartDataModelConstraints0 = new StackedChartDataModelConstraints(objectChartDataModel0, 0, true);
      Number number0 = stackedChartDataModelConstraints0.getMaximumValue();
      assertEquals(1, number0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DataSet[] dataSetArray0 = new DataSet[2];
      EditableDataSet editableDataSet0 = new EditableDataSet();
      dataSetArray0[0] = (DataSet) editableDataSet0;
      dataSetArray0[1] = (DataSet) editableDataSet0;
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(dataSetArray0);
      StackedChartDataModelConstraints stackedChartDataModelConstraints0 = new StackedChartDataModelConstraints(defaultChartDataModel0, (-183), true);
      Number number0 = stackedChartDataModelConstraints0.getMaximumValue();
      assertEquals(1, number0);
  }
}