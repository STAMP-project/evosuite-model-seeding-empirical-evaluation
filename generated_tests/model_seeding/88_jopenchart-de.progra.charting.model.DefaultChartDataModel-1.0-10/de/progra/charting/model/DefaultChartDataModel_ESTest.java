/*
 * This file was automatically generated by EvoSuite
 * Sat Oct 26 02:23:58 GMT 2019
 */

package de.progra.charting.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import de.progra.charting.model.ChartDataModelConstraints;
import de.progra.charting.model.DataSet;
import de.progra.charting.model.DefaultChartDataModel;
import de.progra.charting.model.DefaultDataSet;
import de.progra.charting.model.EditableChartDataModel;
import de.progra.charting.model.EditableDataSet;
import de.progra.charting.model.StackedChartDataModelConstraints;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.TreeSet;
import javax.swing.JLayeredPane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DefaultChartDataModel_ESTest extends DefaultChartDataModel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel();
      ChartDataModelConstraints chartDataModelConstraints0 = defaultChartDataModel0.getChartDataModelConstraints(0);
      defaultChartDataModel0.setChartDataModelConstraints(0, chartDataModelConstraints0);
      assertFalse(defaultChartDataModel0.isManualScale());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[][] doubleArray1 = new double[3][4];
      String[] stringArray0 = new String[9];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(doubleArray1, doubleArray0, stringArray0);
      StackedChartDataModelConstraints stackedChartDataModelConstraints0 = new StackedChartDataModelConstraints(defaultChartDataModel0, (-1081));
      defaultChartDataModel0.setChartDataModelConstraints((-1956), stackedChartDataModelConstraints0);
      assertEquals(3, defaultChartDataModel0.getDataSetNumber());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[][] doubleArray1 = new double[3][4];
      String[] stringArray0 = new String[9];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(doubleArray1, doubleArray0, stringArray0);
      ChartDataModelConstraints chartDataModelConstraints0 = defaultChartDataModel0.getChartDataModelConstraints((-2298));
      assertNotNull(chartDataModelConstraints0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EditableDataSet editableDataSet0 = new EditableDataSet();
      EditableDataSet[] editableDataSetArray0 = new EditableDataSet[4];
      editableDataSetArray0[0] = editableDataSet0;
      editableDataSetArray0[1] = editableDataSet0;
      editableDataSetArray0[2] = editableDataSet0;
      editableDataSetArray0[3] = editableDataSet0;
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel(editableDataSetArray0);
      // Undeclared exception!
      try { 
        editableChartDataModel0.getColumnValueAt(1, (-1869));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DataSet[] dataSetArray0 = new DataSet[2];
      DataSet dataSet0 = mock(DataSet.class, new ViolatedAssumptionAnswer());
      doReturn((-1), (-1), (-1)).when(dataSet0).getDataSetLength();
      doReturn(4, 1).when(dataSet0).getYAxis();
      dataSetArray0[0] = dataSet0;
      dataSetArray0[1] = dataSet0;
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(dataSetArray0);
      Object object0 = defaultChartDataModel0.getColumnValueAt(0, 0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[][] doubleArray0 = new double[1][6];
      double[] doubleArray1 = new double[4];
      String[] stringArray0 = new String[21];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(doubleArray0, doubleArray1, stringArray0);
      TreeSet<Long> treeSet0 = new TreeSet<Long>();
      Long long0 = new Long((-1L));
      treeSet0.add(long0);
      defaultChartDataModel0.trimSet(treeSet0);
      assertTrue(treeSet0.contains((-1L)));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[][] doubleArray0 = new double[1][4];
      double[] doubleArray1 = new double[4];
      String[] stringArray0 = new String[1];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(doubleArray0, doubleArray1, stringArray0);
      Number number0 = defaultChartDataModel0.getValueAt(0, 0);
      assertEquals(0.0, number0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      String[] stringArray0 = new String[9];
      int[][] intArray0 = new int[1][7];
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel(intArray0, doubleArray0, stringArray0);
      TreeSet treeSet0 = editableChartDataModel0.getOrderedValues(992);
      assertNull(treeSet0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      String[] stringArray0 = new String[4];
      int[][] intArray0 = new int[2][0];
      int[] intArray1 = new int[1];
      intArray0[0] = intArray1;
      intArray0[1] = intArray0[0];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(intArray0, doubleArray0, stringArray0);
      TreeSet treeSet0 = defaultChartDataModel0.getOrderedValues(1);
      assertNotNull(treeSet0);
      assertEquals(2, defaultChartDataModel0.getDataSetNumber());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[][] doubleArray0 = new double[4][2];
      double[] doubleArray1 = new double[4];
      doubleArray1[3] = Double.POSITIVE_INFINITY;
      String[] stringArray0 = new String[9];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(doubleArray0, doubleArray1, stringArray0);
      double double0 = defaultChartDataModel0.getLastColumnValue();
      assertEquals(4, defaultChartDataModel0.getDataSetNumber());
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      Number[][] numberArray0 = new Number[1][6];
      Number[] numberArray1 = new Number[3];
      Integer integer0 = JLayeredPane.PALETTE_LAYER;
      numberArray1[0] = (Number) integer0;
      numberArray1[1] = (Number) integer0;
      numberArray1[2] = (Number) integer0;
      numberArray0[0] = numberArray1;
      String[] stringArray0 = new String[5];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(numberArray0, doubleArray0, stringArray0);
      double double0 = defaultChartDataModel0.getFirstColumnValue();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Number[] numberArray0 = new Number[3];
      Integer integer0 = JLayeredPane.PALETTE_LAYER;
      numberArray0[0] = (Number) integer0;
      numberArray0[1] = (Number) integer0;
      numberArray0[2] = (Number) integer0;
      EditableDataSet[] editableDataSetArray0 = new EditableDataSet[3];
      EditableDataSet editableDataSet0 = new EditableDataSet(0);
      editableDataSetArray0[0] = editableDataSet0;
      EditableDataSet editableDataSet1 = new EditableDataSet(numberArray0, numberArray0, 0);
      editableDataSetArray0[1] = editableDataSet1;
      editableDataSetArray0[2] = editableDataSet1;
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel(editableDataSetArray0);
      double double0 = editableChartDataModel0.getFirstColumnValue();
      assertEquals(100.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[][] doubleArray0 = new double[1][4];
      double[] doubleArray1 = new double[9];
      doubleArray1[2] = (-720.3699358766812);
      String[] stringArray0 = new String[7];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(doubleArray0, doubleArray1, stringArray0);
      defaultChartDataModel0.getFirstColumnValue();
      assertEquals(1, defaultChartDataModel0.getDataSetNumber());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel();
      int int0 = defaultChartDataModel0.getDataSetNumber();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[][] doubleArray0 = new double[4][2];
      double[] doubleArray1 = new double[4];
      String[] stringArray0 = new String[9];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(doubleArray0, doubleArray1, stringArray0);
      int int0 = defaultChartDataModel0.getDataSetNumber();
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int[][] intArray0 = new int[1][9];
      double[] doubleArray0 = new double[1];
      String[] stringArray0 = new String[7];
      stringArray0[0] = "6T";
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(intArray0, doubleArray0, stringArray0);
      String string0 = defaultChartDataModel0.getDataSetName(0);
      assertEquals("6T", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EditableDataSet[] editableDataSetArray0 = new EditableDataSet[1];
      EditableDataSet editableDataSet0 = new EditableDataSet(editableDataSetArray0, editableDataSetArray0, 0);
      editableDataSetArray0[0] = editableDataSet0;
      ArrayList<EditableDataSet> arrayList0 = new ArrayList<EditableDataSet>();
      editableDataSet0.data = arrayList0;
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel(editableDataSetArray0);
      String string0 = editableChartDataModel0.getDataSetName(0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EditableDataSet[] editableDataSetArray0 = new EditableDataSet[1];
      EditableDataSet editableDataSet0 = new EditableDataSet(editableDataSetArray0, editableDataSetArray0, 0);
      editableDataSetArray0[0] = editableDataSet0;
      ArrayList<EditableDataSet> arrayList0 = new ArrayList<EditableDataSet>();
      editableDataSet0.data = arrayList0;
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel(editableDataSetArray0);
      int int0 = editableChartDataModel0.getDataSetLength(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[][] doubleArray0 = new double[4][2];
      double[] doubleArray1 = new double[4];
      String[] stringArray0 = new String[9];
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel(doubleArray0, doubleArray1, stringArray0);
      int int0 = editableChartDataModel0.getDataSetLength(1);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      EditableDataSet[] editableDataSetArray0 = new EditableDataSet[1];
      EditableDataSet editableDataSet0 = new EditableDataSet(editableDataSetArray0, editableDataSetArray0, 0);
      editableDataSetArray0[0] = editableDataSet0;
      ArrayList<EditableDataSet> arrayList0 = new ArrayList<EditableDataSet>();
      editableDataSet0.data = arrayList0;
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel(editableDataSetArray0);
      int int0 = editableChartDataModel0.getAxisBinding(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      TreeSet<Float> treeSet0 = new TreeSet<Float>();
      // Undeclared exception!
      try { 
        editableChartDataModel0.trimSet(treeSet0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EditableDataSet[] editableDataSetArray0 = new EditableDataSet[1];
      EditableDataSet editableDataSet0 = new EditableDataSet();
      editableDataSetArray0[0] = editableDataSet0;
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel(editableDataSetArray0);
      // Undeclared exception!
      try { 
        editableChartDataModel0.trimSet((TreeSet) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.model.DefaultChartDataModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[][] doubleArray0 = new double[1][6];
      double[] doubleArray1 = new double[4];
      String[] stringArray0 = new String[21];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(doubleArray0, doubleArray1, stringArray0);
      // Undeclared exception!
      try { 
        defaultChartDataModel0.getValueAt(1000, 16);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1000, Size: 1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      EditableDataSet[] editableDataSetArray0 = new EditableDataSet[1];
      EditableDataSet editableDataSet0 = new EditableDataSet();
      editableDataSetArray0[0] = editableDataSet0;
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel(editableDataSetArray0);
      Double double0 = new Double(0);
      editableDataSet0.insertValue(editableChartDataModel0, double0);
      // Undeclared exception!
      try { 
        editableChartDataModel0.getValueAt(0, 0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // de.progra.charting.model.EditableChartDataModel cannot be cast to java.lang.Number
         //
         verifyException("de.progra.charting.model.DefaultChartDataModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      // Undeclared exception!
      try { 
        editableChartDataModel0.getValueAt((-3204), (-3204));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel();
      // Undeclared exception!
      try { 
        defaultChartDataModel0.getLastColumnValue();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel();
      defaultChartDataModel0.data = null;
      // Undeclared exception!
      try { 
        defaultChartDataModel0.getDataSetNumber();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      String[] stringArray0 = new String[4];
      int[][] intArray0 = new int[2][0];
      int[] intArray1 = new int[1];
      intArray0[0] = intArray1;
      intArray0[1] = intArray0[0];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(intArray0, doubleArray0, stringArray0);
      // Undeclared exception!
      try { 
        defaultChartDataModel0.getDataSetName(1228);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1228, Size: 2
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double[][] doubleArray0 = new double[1][4];
      String[] stringArray0 = new String[5];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(doubleArray0, doubleArray0[0], stringArray0);
      // Undeclared exception!
      try { 
        defaultChartDataModel0.getDataSetName((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      // Undeclared exception!
      try { 
        editableChartDataModel0.getDataSetLength(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      // Undeclared exception!
      try { 
        editableChartDataModel0.getDataSetLength((-751));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -751
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      EditableDataSet[] editableDataSetArray0 = new EditableDataSet[3];
      EditableDataSet editableDataSet0 = new EditableDataSet();
      editableDataSetArray0[0] = editableDataSet0;
      editableDataSetArray0[1] = editableDataSetArray0[0];
      editableDataSetArray0[2] = editableDataSetArray0[0];
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel(editableDataSetArray0);
      // Undeclared exception!
      try { 
        editableChartDataModel0.getColumnValueAt(5, (-1911));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 5, Size: 3
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel();
      // Undeclared exception!
      try { 
        defaultChartDataModel0.getAxisBinding((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      double[] doubleArray0 = new double[14];
      String[] stringArray0 = new String[5];
      Number[][] numberArray0 = new Number[0][7];
      DefaultChartDataModel defaultChartDataModel0 = null;
      try {
        defaultChartDataModel0 = new DefaultChartDataModel(numberArray0, doubleArray0, stringArray0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      double[] doubleArray0 = new double[14];
      String[] stringArray0 = new String[5];
      DefaultChartDataModel defaultChartDataModel0 = null;
      try {
        defaultChartDataModel0 = new DefaultChartDataModel((Number[][]) null, doubleArray0, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.ChartUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Number[][] numberArray0 = new Number[1][4];
      Number[] numberArray1 = new Number[2];
      Float float0 = new Float(4871.01F);
      numberArray1[0] = (Number) float0;
      BigInteger bigInteger0 = BigInteger.ONE;
      numberArray1[1] = (Number) bigInteger0;
      numberArray0[0] = numberArray1;
      double[] doubleArray0 = new double[6];
      String[] stringArray0 = new String[0];
      DefaultChartDataModel defaultChartDataModel0 = null;
      try {
        defaultChartDataModel0 = new DefaultChartDataModel(numberArray0, doubleArray0, stringArray0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Float cannot be cast to java.math.BigInteger
         //
         verifyException("java.math.BigInteger", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      Number[][] numberArray0 = new Number[1][6];
      Number[] numberArray1 = new Number[3];
      Integer integer0 = JLayeredPane.DRAG_LAYER;
      numberArray1[0] = (Number) integer0;
      numberArray1[1] = (Number) integer0;
      numberArray1[2] = (Number) integer0;
      numberArray0[0] = numberArray1;
      String[] stringArray0 = new String[0];
      DefaultChartDataModel defaultChartDataModel0 = null;
      try {
        defaultChartDataModel0 = new DefaultChartDataModel(numberArray0, doubleArray0, stringArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("de.progra.charting.model.DefaultChartDataModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      double[] doubleArray0 = new double[14];
      String[] stringArray0 = new String[5];
      int[][] intArray0 = new int[2][0];
      DefaultChartDataModel defaultChartDataModel0 = null;
      try {
        defaultChartDataModel0 = new DefaultChartDataModel(intArray0, doubleArray0, stringArray0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      DefaultChartDataModel defaultChartDataModel0 = null;
      try {
        defaultChartDataModel0 = new DefaultChartDataModel((int[][]) null, doubleArray0, (String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.ChartUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      String[] stringArray0 = new String[4];
      int[][] intArray0 = new int[0][7];
      DefaultChartDataModel defaultChartDataModel0 = null;
      try {
        defaultChartDataModel0 = new DefaultChartDataModel(intArray0, doubleArray0, stringArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("de.progra.charting.ChartUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      double[][] doubleArray0 = new double[1][0];
      DefaultChartDataModel defaultChartDataModel0 = null;
      try {
        defaultChartDataModel0 = new DefaultChartDataModel(doubleArray0, doubleArray0[0], (String[]) null);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      double[][] doubleArray0 = new double[4][2];
      double[] doubleArray1 = new double[4];
      DefaultChartDataModel defaultChartDataModel0 = null;
      try {
        defaultChartDataModel0 = new DefaultChartDataModel(doubleArray0, doubleArray1, (String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.model.DefaultChartDataModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      EditableDataSet[] editableDataSetArray0 = new EditableDataSet[1];
      DefaultChartDataModel defaultChartDataModel0 = null;
      try {
        defaultChartDataModel0 = new DefaultChartDataModel(editableDataSetArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.model.DefaultChartDataModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DataSet[] dataSetArray0 = new DataSet[2];
      DefaultDataSet defaultDataSet0 = new DefaultDataSet((-2192));
      DataSet dataSet0 = mock(DataSet.class, new ViolatedAssumptionAnswer());
      doReturn((-2192), 0).when(dataSet0).getDataSetLength();
      doReturn(1853, 0).when(dataSet0).getYAxis();
      dataSetArray0[0] = dataSet0;
      dataSetArray0[1] = dataSet0;
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(dataSetArray0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      double[][] doubleArray0 = new double[20][6];
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = Double.POSITIVE_INFINITY;
      doubleArray0[0] = doubleArray1;
      String[] stringArray0 = new String[23];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(doubleArray0, doubleArray1, stringArray0);
      assertEquals(20, defaultChartDataModel0.getDataSetNumber());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      double[][] doubleArray0 = new double[20][6];
      double[] doubleArray1 = new double[5];
      doubleArray1[2] = Double.NEGATIVE_INFINITY;
      doubleArray0[0] = doubleArray1;
      String[] stringArray0 = new String[16];
      DefaultChartDataModel defaultChartDataModel0 = null;
      try {
        defaultChartDataModel0 = new DefaultChartDataModel(doubleArray0, doubleArray1, stringArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 16
         //
         verifyException("de.progra.charting.model.DefaultChartDataModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      double[][] doubleArray0 = new double[1][4];
      String[] stringArray0 = new String[5];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(doubleArray0, doubleArray0[0], stringArray0);
      defaultChartDataModel0.setChartDataModelConstraints(2, (ChartDataModelConstraints) null);
      assertEquals(1, defaultChartDataModel0.getDataSetNumber());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      String[] stringArray0 = new String[4];
      int[][] intArray0 = new int[2][0];
      int[] intArray1 = new int[1];
      intArray0[0] = intArray1;
      intArray0[1] = intArray1;
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(intArray0, doubleArray0, stringArray0);
      ChartDataModelConstraints chartDataModelConstraints0 = defaultChartDataModel0.getChartDataModelConstraints(1228);
      defaultChartDataModel0.setChartDataModelConstraints(0, chartDataModelConstraints0);
      assertEquals(2, defaultChartDataModel0.getDataSetNumber());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      EditableDataSet[] editableDataSetArray0 = new EditableDataSet[1];
      EditableDataSet editableDataSet0 = new EditableDataSet();
      editableDataSetArray0[0] = editableDataSet0;
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel(editableDataSetArray0);
      Object object0 = editableChartDataModel0.getColumnValueAt(0, 0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      double[] doubleArray0 = new double[14];
      String[] stringArray0 = new String[5];
      int[][] intArray0 = new int[2][0];
      int[] intArray1 = new int[4];
      intArray0[0] = intArray1;
      intArray0[1] = intArray1;
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(intArray0, doubleArray0, stringArray0);
      TreeSet<String> treeSet0 = new TreeSet<String>();
      treeSet0.add("~UWmq2s");
      // Undeclared exception!
      try { 
        defaultChartDataModel0.trimSet(treeSet0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to java.lang.Number
         //
         verifyException("de.progra.charting.model.DefaultChartDataModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      double[][] doubleArray0 = new double[9][4];
      String[] stringArray0 = new String[9];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(doubleArray0, doubleArray0[0], stringArray0);
      // Undeclared exception!
      try { 
        defaultChartDataModel0.getAxisBinding(9);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 9, Size: 9
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      EditableDataSet[] editableDataSetArray0 = new EditableDataSet[3];
      EditableDataSet editableDataSet0 = new EditableDataSet(0);
      editableDataSetArray0[0] = editableDataSet0;
      editableDataSetArray0[1] = editableDataSet0;
      editableDataSetArray0[2] = editableDataSet0;
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel(editableDataSetArray0);
      // Undeclared exception!
      try { 
        editableChartDataModel0.getFirstColumnValue();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      Number[][] numberArray0 = new Number[1][6];
      Number[] numberArray1 = new Number[3];
      Integer integer0 = JLayeredPane.PALETTE_LAYER;
      numberArray1[0] = (Number) integer0;
      numberArray1[1] = (Number) integer0;
      numberArray1[2] = (Number) integer0;
      numberArray0[0] = numberArray1;
      String[] stringArray0 = new String[5];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(numberArray0, doubleArray0, stringArray0);
      String string0 = defaultChartDataModel0.getDataSetName(0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      double[][] doubleArray0 = new double[4][2];
      double[] doubleArray1 = new double[4];
      String[] stringArray0 = new String[9];
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel(doubleArray0, doubleArray1, stringArray0);
      boolean boolean0 = editableChartDataModel0.isColumnNumeric();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      double[][] doubleArray0 = new double[1][4];
      String[] stringArray0 = new String[5];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(doubleArray0, doubleArray0[0], stringArray0);
      defaultChartDataModel0.getLastColumnValue();
      assertEquals(1, defaultChartDataModel0.getDataSetNumber());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      double[][] doubleArray0 = new double[1][4];
      double[] doubleArray1 = new double[4];
      String[] stringArray0 = new String[1];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(doubleArray0, doubleArray1, stringArray0);
      defaultChartDataModel0.getColumnClass();
      assertEquals(1, defaultChartDataModel0.getDataSetNumber());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[][] doubleArray1 = new double[3][4];
      String[] stringArray0 = new String[9];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(doubleArray1, doubleArray0, stringArray0);
      StackedChartDataModelConstraints stackedChartDataModelConstraints0 = new StackedChartDataModelConstraints(defaultChartDataModel0, (-1081));
      stackedChartDataModelConstraints0.getMinimumValue();
      assertEquals(3, defaultChartDataModel0.getDataSetNumber());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel();
      Object object0 = defaultChartDataModel0.getColumnValueAt(46);
      assertNull(object0);
  }
}