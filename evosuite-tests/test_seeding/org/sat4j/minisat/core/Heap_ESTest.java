/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 18 15:56:12 GMT 2019
 */

package org.sat4j.minisat.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.sat4j.minisat.core.Heap;
import org.sat4j.minisat.orders.ActivityBasedVariableComparator;
import org.sat4j.minisat.orders.LevelAndActivityVariableComparator;
import org.sat4j.minisat.orders.VariableComparator;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Heap_ESTest extends Heap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      ActivityBasedVariableComparator activityBasedVariableComparator0 = new ActivityBasedVariableComparator(doubleArray0);
      Heap heap0 = new Heap(activityBasedVariableComparator0);
      heap0.setBounds(0);
      assertTrue(heap0.heapProperty());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Heap heap0 = new Heap((VariableComparator) null);
      // Undeclared exception!
      try { 
        heap0.inHeap(0);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      int[] intArray0 = new int[0];
      LevelAndActivityVariableComparator levelAndActivityVariableComparator0 = new LevelAndActivityVariableComparator(doubleArray0, intArray0);
      Heap heap0 = new Heap(levelAndActivityVariableComparator0);
      heap0.setBounds(1026);
      heap0.insert(0);
      assertEquals(0, heap0.getmin());
      
      int int0 = heap0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      int[] intArray0 = new int[2];
      LevelAndActivityVariableComparator levelAndActivityVariableComparator0 = new LevelAndActivityVariableComparator(doubleArray0, intArray0);
      Heap heap0 = new Heap(levelAndActivityVariableComparator0);
      heap0.setBounds(2770);
      boolean boolean0 = heap0.ok(6);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      int[] intArray0 = new int[0];
      LevelAndActivityVariableComparator levelAndActivityVariableComparator0 = new LevelAndActivityVariableComparator(doubleArray0, intArray0);
      Heap heap0 = new Heap(levelAndActivityVariableComparator0);
      heap0.setBounds(1026);
      heap0.insert(0);
      heap0.getmin();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ActivityBasedVariableComparator activityBasedVariableComparator0 = new ActivityBasedVariableComparator((double[]) null);
      Heap heap0 = new Heap(activityBasedVariableComparator0);
      heap0.setBounds(1963);
      // Undeclared exception!
      try { 
        heap0.setBounds(1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Heap heap0 = new Heap((VariableComparator) null);
      // Undeclared exception!
      try { 
        heap0.percolateUp((-633));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -633
         //
         verifyException("org.sat4j.core.VecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Heap heap0 = new Heap((VariableComparator) null);
      // Undeclared exception!
      try { 
        heap0.percolateDown((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.sat4j.core.VecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      int[] intArray0 = new int[0];
      LevelAndActivityVariableComparator levelAndActivityVariableComparator0 = new LevelAndActivityVariableComparator(doubleArray0, intArray0);
      Heap heap0 = new Heap(levelAndActivityVariableComparator0);
      heap0.setBounds(1026);
      heap0.insert(1);
      //  // Unstable assertion: assertTrue(heap0.empty());
      //  // Unstable assertion: assertEquals(1, heap0.getmin());
      
      // Undeclared exception!
      try { 
        heap0.insert(0);
       //  fail("Expecting exception: ArrayIndexOutOfBoundsException");
       // Unstable assertion
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.sat4j.minisat.orders.LevelAndActivityVariableComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Heap heap0 = new Heap((VariableComparator) null);
      // Undeclared exception!
      try { 
        heap0.get(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      ActivityBasedVariableComparator activityBasedVariableComparator0 = new ActivityBasedVariableComparator(doubleArray0);
      Heap heap0 = new Heap(activityBasedVariableComparator0);
      boolean boolean0 = heap0.heapProperty(1230);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      int[] intArray0 = new int[0];
      LevelAndActivityVariableComparator levelAndActivityVariableComparator0 = new LevelAndActivityVariableComparator(doubleArray0, intArray0);
      Heap heap0 = new Heap(levelAndActivityVariableComparator0);
      heap0.setBounds(1026);
      heap0.insert(1);
      assertEquals(1, heap0.getmin());
      
      boolean boolean0 = heap0.heapProperty(1);
      assertTrue(boolean0);
      assertTrue(heap0.empty());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Heap heap0 = new Heap((VariableComparator) null);
      // Undeclared exception!
      try { 
        heap0.heapProperty((-125));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -125
         //
         verifyException("org.sat4j.core.VecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Heap heap0 = new Heap((VariableComparator) null);
      // Undeclared exception!
      try { 
        heap0.insert(2);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      ActivityBasedVariableComparator activityBasedVariableComparator0 = new ActivityBasedVariableComparator(doubleArray0);
      Heap heap0 = new Heap(activityBasedVariableComparator0);
      heap0.setBounds(1361);
      heap0.insert(428);
      heap0.getmin();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      ActivityBasedVariableComparator activityBasedVariableComparator0 = new ActivityBasedVariableComparator(doubleArray0);
      Heap heap0 = new Heap(activityBasedVariableComparator0);
      boolean boolean0 = heap0.empty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      int[] intArray0 = new int[0];
      LevelAndActivityVariableComparator levelAndActivityVariableComparator0 = new LevelAndActivityVariableComparator(doubleArray0, intArray0);
      Heap heap0 = new Heap(levelAndActivityVariableComparator0);
      heap0.setBounds(1026);
      heap0.insert(0);
      assertEquals(0, heap0.getmin());
      
      boolean boolean0 = heap0.empty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Heap heap0 = new Heap((VariableComparator) null);
      heap0.setBounds(3523);
      // Undeclared exception!
      try { 
        heap0.increase(2850);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Heap heap0 = new Heap((VariableComparator) null);
      // Undeclared exception!
      try { 
        heap0.increase(2850);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ActivityBasedVariableComparator activityBasedVariableComparator0 = new ActivityBasedVariableComparator((double[]) null);
      Heap heap0 = new Heap(activityBasedVariableComparator0);
      heap0.setBounds(1963);
      boolean boolean0 = heap0.inHeap(1521);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Heap heap0 = new Heap((VariableComparator) null);
      // Undeclared exception!
      try { 
        heap0.setBounds((-1));
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Heap heap0 = new Heap((VariableComparator) null);
      boolean boolean0 = heap0.ok((-125));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      int[] intArray0 = new int[5];
      LevelAndActivityVariableComparator levelAndActivityVariableComparator0 = new LevelAndActivityVariableComparator(doubleArray0, intArray0);
      Heap heap0 = new Heap(levelAndActivityVariableComparator0);
      heap0.percolateUp(2);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      LevelAndActivityVariableComparator levelAndActivityVariableComparator0 = new LevelAndActivityVariableComparator(doubleArray0, (int[]) null);
      Heap heap0 = new Heap(levelAndActivityVariableComparator0);
      // Undeclared exception!
      try { 
        heap0.percolateUp(2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.LevelAndActivityVariableComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      LevelAndActivityVariableComparator levelAndActivityVariableComparator0 = new LevelAndActivityVariableComparator(doubleArray0, (int[]) null);
      Heap heap0 = new Heap(levelAndActivityVariableComparator0);
      boolean boolean0 = heap0.heapProperty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      int[] intArray0 = new int[0];
      LevelAndActivityVariableComparator levelAndActivityVariableComparator0 = new LevelAndActivityVariableComparator(doubleArray0, intArray0);
      Heap heap0 = new Heap(levelAndActivityVariableComparator0);
      heap0.setBounds(1026);
      heap0.insert(0);
      assertEquals(0, heap0.getmin());
      
      boolean boolean0 = heap0.inHeap(0);
      assertTrue(heap0.empty());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ActivityBasedVariableComparator activityBasedVariableComparator0 = new ActivityBasedVariableComparator((double[]) null);
      Heap heap0 = new Heap(activityBasedVariableComparator0);
      // Undeclared exception!
      try { 
        heap0.percolateDown(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.ActivityBasedVariableComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      int[] intArray0 = new int[0];
      LevelAndActivityVariableComparator levelAndActivityVariableComparator0 = new LevelAndActivityVariableComparator(doubleArray0, intArray0);
      Heap heap0 = new Heap(levelAndActivityVariableComparator0);
      int int0 = heap0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Heap heap0 = new Heap((VariableComparator) null);
      // Undeclared exception!
      try { 
        heap0.getmin();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ActivityBasedVariableComparator activityBasedVariableComparator0 = new ActivityBasedVariableComparator((double[]) null);
      Heap heap0 = new Heap(activityBasedVariableComparator0);
      heap0.percolateDown(1);
  }
}