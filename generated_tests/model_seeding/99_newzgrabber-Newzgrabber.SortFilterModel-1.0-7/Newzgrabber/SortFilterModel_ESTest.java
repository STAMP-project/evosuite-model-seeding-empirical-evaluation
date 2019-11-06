/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 06 13:25:53 GMT 2019
 */

package Newzgrabber;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import Newzgrabber.SortFilterModel;
import java.awt.event.MouseEvent;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SortFilterModel_ESTest extends SortFilterModel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Vector<Integer> vector0 = new Vector<Integer>(665);
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(665, 665);
      Object[] objectArray0 = new Object[8];
      objectArray0[1] = (Object) vector0;
      defaultTableModel0.addRow(objectArray0);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      sortFilterModel0.sort(1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      Object object0 = new Object();
      Object[] objectArray0 = new Object[7];
      defaultTableModel0.addColumn(object0, objectArray0);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      Object object1 = sortFilterModel0.getValueAt(0, 4);
      assertNull(object1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(665, 665);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      sortFilterModel0.setValueAt(defaultTableModel0, 3, 0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      Object object0 = new Object();
      Object[] objectArray0 = new Object[3];
      objectArray0[0] = (Object) "A";
      defaultTableModel0.addColumn(object0, objectArray0);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      Object object1 = sortFilterModel0.getValueAt(0, 0);
      assertEquals("A", object1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Vector<Integer> vector0 = new Vector<Integer>(665);
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(vector0, vector0);
      defaultTableModel0.addRow(vector0);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      int int0 = sortFilterModel0.getRowCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      String string0 = sortFilterModel0.getColumnName((-3664));
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      int int0 = sortFilterModel0.getColumnCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(665, 665);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      // Undeclared exception!
      try { 
        sortFilterModel0.sort(665);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 665 >= 665
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Vector<Integer> vector0 = new Vector<Integer>(665);
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(vector0, vector0);
      vector0.setSize(3171);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      // Undeclared exception!
      try { 
        sortFilterModel0.setValueAt(vector0, 1393, 665);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("javax.swing.table.DefaultTableModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      // Undeclared exception!
      try { 
        sortFilterModel0.setTable((JTable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Newzgrabber.SortFilterModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      // Undeclared exception!
      try { 
        sortFilterModel0.isCellEditable(547, 547);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 547
         //
         verifyException("Newzgrabber.SortFilterModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SortFilterModel sortFilterModel0 = null;
      try {
        sortFilterModel0 = new SortFilterModel((TableModel) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      JTable jTable0 = new JTable();
      sortFilterModel0.setTable(jTable0);
      // Undeclared exception!
      try { 
        sortFilterModel0.mouseClicked((MouseEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Newzgrabber.SortFilterModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      sortFilterModel0.mouseClicked((MouseEvent) null);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(665, 665);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      sortFilterModel0.sortTable((-1));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      Class class0 = sortFilterModel0.getColumnClass(0);
      assertFalse(class0.isPrimitive());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Vector<Integer> vector0 = new Vector<Integer>();
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(vector0, vector0);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      sortFilterModel0.mousePressed((MouseEvent) null);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      String string0 = sortFilterModel0.getColumnName(0);
      assertEquals("A", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Vector<Integer> vector0 = new Vector<Integer>(665);
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(vector0, vector0);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      sortFilterModel0.mouseReleased((MouseEvent) null);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(665, 665);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      int int0 = sortFilterModel0.getColumnCount();
      assertEquals(665, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      sortFilterModel0.mouseEntered((MouseEvent) null);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(665, 665);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      sortFilterModel0.setSort(false);
      sortFilterModel0.sort(1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(3, 3);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      boolean boolean0 = sortFilterModel0.isCellEditable(0, 5632);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Vector<Integer> vector0 = new Vector<Integer>(697);
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(vector0, vector0);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      sortFilterModel0.mouseExited((MouseEvent) null);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(665, 665);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      JTable jTable0 = new JTable();
      sortFilterModel0.setTable(jTable0);
      // Undeclared exception!
      try { 
        sortFilterModel0.sortTable((-736));
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class java.awt.event.MouseEvent
         //
         verifyException("Newzgrabber.SortFilterModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      sortFilterModel0.updateTable();
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(665, 665);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      // Undeclared exception!
      try { 
        sortFilterModel0.setValueAt(defaultTableModel0, (-1), 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("Newzgrabber.SortFilterModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Vector<Integer> vector0 = new Vector<Integer>(697);
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(vector0, vector0);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      int int0 = sortFilterModel0.getRowCount();
      assertEquals(0, int0);
  }
}
