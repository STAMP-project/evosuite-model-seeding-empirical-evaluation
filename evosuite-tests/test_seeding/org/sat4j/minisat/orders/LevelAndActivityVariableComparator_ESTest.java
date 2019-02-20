/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 18 16:00:27 GMT 2019
 */

package org.sat4j.minisat.orders;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.sat4j.minisat.orders.LevelAndActivityVariableComparator;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LevelAndActivityVariableComparator_ESTest extends LevelAndActivityVariableComparator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-1133.74081);
      int[] intArray0 = new int[2];
      LevelAndActivityVariableComparator levelAndActivityVariableComparator0 = new LevelAndActivityVariableComparator(doubleArray0, intArray0);
      boolean boolean0 = levelAndActivityVariableComparator0.preferredTo(0, 1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      LevelAndActivityVariableComparator levelAndActivityVariableComparator0 = new LevelAndActivityVariableComparator(doubleArray0, (int[]) null);
      // Undeclared exception!
      try { 
        levelAndActivityVariableComparator0.preferredTo((-1189), (-1189));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.LevelAndActivityVariableComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      int[] intArray0 = new int[2];
      LevelAndActivityVariableComparator levelAndActivityVariableComparator0 = new LevelAndActivityVariableComparator(doubleArray0, intArray0);
      // Undeclared exception!
      try { 
        levelAndActivityVariableComparator0.preferredTo((-2369), 26);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2369
         //
         verifyException("org.sat4j.minisat.orders.LevelAndActivityVariableComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (-3496.952077521655);
      int[] intArray0 = new int[4];
      LevelAndActivityVariableComparator levelAndActivityVariableComparator0 = new LevelAndActivityVariableComparator(doubleArray0, intArray0);
      boolean boolean0 = levelAndActivityVariableComparator0.preferredTo(1, 0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[0] = 1;
      LevelAndActivityVariableComparator levelAndActivityVariableComparator0 = new LevelAndActivityVariableComparator((double[]) null, intArray0);
      boolean boolean0 = levelAndActivityVariableComparator0.preferredTo(0, 1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      int[] intArray0 = new int[2];
      LevelAndActivityVariableComparator levelAndActivityVariableComparator0 = new LevelAndActivityVariableComparator(doubleArray0, intArray0);
      boolean boolean0 = levelAndActivityVariableComparator0.preferredTo(0, 1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[1] = 1;
      LevelAndActivityVariableComparator levelAndActivityVariableComparator0 = new LevelAndActivityVariableComparator((double[]) null, intArray0);
      boolean boolean0 = levelAndActivityVariableComparator0.preferredTo(0, 1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      int[] intArray0 = new int[2];
      LevelAndActivityVariableComparator levelAndActivityVariableComparator0 = new LevelAndActivityVariableComparator(doubleArray0, intArray0);
      String string0 = levelAndActivityVariableComparator0.toString();
      assertEquals("Level and activity based variable heuristic", string0);
  }
}