/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 29 15:38:17 GMT 2019
 */

package de.progra.charting;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import de.progra.charting.ChartUtilities;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ChartUtilities_ESTest extends ChartUtilities_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[1];
      Number[] numberArray0 = ChartUtilities.transformArray(intArray0);
      assertEquals(1, intArray0.length);
      assertEquals(1, numberArray0.length);
      assertArrayEquals(new int[] {0}, intArray0);
      assertNotNull(numberArray0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      double double0 = (-617.252);
      double double1 = ChartUtilities.interpolate(doubleArray0, doubleArray0, (-617.252));
      assertEquals(0, doubleArray0.length);
      assertArrayEquals(new double[] {}, doubleArray0, 0.01);
      assertNotEquals(double1, double0, 0.01);
      assertEquals(Double.NaN, double1, 0.01);
      
      double[] doubleArray1 = new double[1];
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      
      doubleArray1[0] = (-617.252);
      double double2 = 1615.418;
      double double3 = ChartUtilities.interpolate(doubleArray1, doubleArray0, 1615.418);
      assertEquals(0, doubleArray0.length);
      assertEquals(1, doubleArray1.length);
      assertArrayEquals(new double[] {}, doubleArray0, 0.01);
      assertArrayEquals(new double[] {(-617.252)}, doubleArray1, 0.01);
      assertFalse(doubleArray0.equals((Object)doubleArray1));
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      assertNotEquals(double3, double2, 0.01);
      assertEquals(double3, double1, 0.01);
      assertNotEquals(double3, double0, 0.01);
      assertEquals(Double.NaN, double3, 0.01);
      assertNotSame(doubleArray0, doubleArray1);
      assertNotSame(doubleArray1, doubleArray0);
      
      // Undeclared exception!
      ChartUtilities.calculateTickSpacing((-617.252), (-617.252));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        ChartUtilities.transformArray((double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.ChartUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int int0 = 1400;
      double double0 = ChartUtilities.floor(0.0, 1400);
      assertEquals(Double.NaN, double0, 0.01);
      
      double double1 = ChartUtilities.calculateTickSpacing(0.0, (-1.0));
      assertNotEquals(double1, double0, 0.01);
      assertEquals(0.05, double1, 0.01);
      
      int[] intArray0 = new int[8];
      intArray0[0] = 1400;
      intArray0[1] = 1400;
      intArray0[2] = 1400;
      intArray0[3] = 1400;
      intArray0[4] = 1400;
      intArray0[5] = 1400;
      intArray0[6] = 1400;
      intArray0[7] = 1400;
      Number[] numberArray0 = ChartUtilities.transformArray(intArray0);
      assertEquals(8, intArray0.length);
      assertEquals(8, numberArray0.length);
      assertArrayEquals(new int[] {1400, 1400, 1400, 1400, 1400, 1400, 1400, 1400}, intArray0);
      assertNotNull(numberArray0);
      
      ChartUtilities chartUtilities0 = new ChartUtilities();
      assertNotNull(chartUtilities0);
      
      double[][] doubleArray0 = new double[8][7];
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = 0.0;
      doubleArray1[1] = (double) 1400;
      doubleArray1[2] = (double) 1400;
      doubleArray1[3] = 0.0;
      doubleArray1[4] = (double) 1400;
      doubleArray1[5] = Double.NaN;
      doubleArray1[6] = 0.05;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[8];
      assertFalse(doubleArray2.equals((Object)doubleArray1));
      
      doubleArray2[0] = 0.05;
      doubleArray2[1] = Double.NaN;
      doubleArray2[2] = (double) 1400;
      doubleArray2[3] = (double) 1400;
      doubleArray2[4] = 0.0;
      doubleArray2[5] = (double) 1400;
      doubleArray2[6] = (double) 1400;
      doubleArray2[7] = (double) 1400;
      doubleArray0[1] = doubleArray2;
      double[] doubleArray3 = new double[2];
      assertFalse(doubleArray3.equals((Object)doubleArray2));
      assertFalse(doubleArray3.equals((Object)doubleArray1));
      
      doubleArray3[0] = (double) 1400;
      doubleArray3[1] = 0.0;
      doubleArray0[2] = doubleArray3;
      double[] doubleArray4 = new double[3];
      assertFalse(doubleArray4.equals((Object)doubleArray1));
      assertFalse(doubleArray4.equals((Object)doubleArray3));
      assertFalse(doubleArray4.equals((Object)doubleArray2));
      
      doubleArray4[0] = (double) 1400;
      doubleArray4[1] = (-1.0);
      doubleArray4[2] = 0.0;
      doubleArray0[3] = doubleArray4;
      double[] doubleArray5 = new double[4];
      assertFalse(doubleArray5.equals((Object)doubleArray1));
      assertFalse(doubleArray5.equals((Object)doubleArray2));
      assertFalse(doubleArray5.equals((Object)doubleArray4));
      assertFalse(doubleArray5.equals((Object)doubleArray3));
      
      doubleArray5[0] = (double) 1400;
      doubleArray5[1] = (double) 1400;
      doubleArray5[2] = 0.0;
      doubleArray5[3] = (double) 1400;
      doubleArray0[4] = doubleArray5;
      double[] doubleArray6 = new double[6];
      assertFalse(doubleArray6.equals((Object)doubleArray5));
      assertFalse(doubleArray6.equals((Object)doubleArray1));
      assertFalse(doubleArray6.equals((Object)doubleArray4));
      assertFalse(doubleArray6.equals((Object)doubleArray2));
      assertFalse(doubleArray6.equals((Object)doubleArray3));
      
      doubleArray6[0] = 1034.2599;
      doubleArray6[1] = (double) 1400;
      doubleArray6[2] = 1.0;
      doubleArray6[3] = (double) 1400;
      doubleArray6[4] = (double) 1400;
      doubleArray6[5] = Double.NaN;
      doubleArray0[5] = doubleArray6;
      double[] doubleArray7 = new double[1];
      assertFalse(doubleArray7.equals((Object)doubleArray3));
      assertFalse(doubleArray7.equals((Object)doubleArray2));
      assertFalse(doubleArray7.equals((Object)doubleArray1));
      assertFalse(doubleArray7.equals((Object)doubleArray6));
      assertFalse(doubleArray7.equals((Object)doubleArray4));
      assertFalse(doubleArray7.equals((Object)doubleArray5));
      
      doubleArray7[0] = 1058.13598008;
      doubleArray0[6] = doubleArray7;
      double[] doubleArray8 = new double[1];
      assertFalse(doubleArray8.equals((Object)doubleArray5));
      assertFalse(doubleArray8.equals((Object)doubleArray1));
      assertFalse(doubleArray8.equals((Object)doubleArray6));
      assertFalse(doubleArray8.equals((Object)doubleArray4));
      assertFalse(doubleArray8.equals((Object)doubleArray2));
      assertFalse(doubleArray8.equals((Object)doubleArray3));
      assertFalse(doubleArray8.equals((Object)doubleArray7));
      
      doubleArray8[0] = 0.0;
      doubleArray0[7] = doubleArray8;
      // Undeclared exception!
      try { 
        ChartUtilities.transformArray(doubleArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("de.progra.charting.ChartUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int int0 = ChartUtilities.exp((-1972.3641884059718));
      assertEquals(3, int0);
  }
}