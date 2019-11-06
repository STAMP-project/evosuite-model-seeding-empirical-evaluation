/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 06 13:08:34 GMT 2019
 */

package Newzgrabber;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import Newzgrabber.SortFilterModel;
import java.awt.event.MouseEvent;
import java.util.Stack;
import java.util.Vector;
import javax.swing.JLayeredPane;
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
      Object[] objectArray0 = new Object[2];
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(objectArray0, 3);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      Integer integer0 = JLayeredPane.DRAG_LAYER;
      // Undeclared exception!
      try { 
        sortFilterModel0.setValueAt(integer0, 1, 19);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 19 >= 2
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel((Vector) null, 2439);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      Object object0 = sortFilterModel0.getValueAt(951, (-346));
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(1163, 1163);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      sortFilterModel0.setValueAt("ART", 528, 528);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>();
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(vector0, vector0);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      Stack<String> stack0 = new Stack<String>();
      JTable jTable0 = new JTable(stack0, stack0);
      sortFilterModel0.setTable(jTable0);
      assertFalse(jTable0.isFocusCycleRoot());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Object[] objectArray0 = new Object[8];
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(objectArray0, 30);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      Object object0 = sortFilterModel0.getValueAt(0, 0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel((Vector) null, 2439);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      boolean boolean0 = sortFilterModel0.isCellEditable(951, 990);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      Stack<Object> stack0 = new Stack<Object>();
      defaultTableModel0.addRow((Vector) stack0);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      int int0 = sortFilterModel0.getRowCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel((Vector) null, 0);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      String string0 = sortFilterModel0.getColumnName(0);
      assertEquals("A", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      String string0 = sortFilterModel0.getColumnName((-1842));
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      int int0 = sortFilterModel0.getColumnCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      Stack<Integer> stack0 = new Stack<Integer>();
      Stack<Object> stack1 = new Stack<Object>();
      defaultTableModel0.addColumn((Object) stack0, (Vector) stack1);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      int int0 = sortFilterModel0.getColumnCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(1139, 1139);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      // Undeclared exception!
      try { 
        sortFilterModel0.sort(1139);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1139 >= 1139
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
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
  public void test13()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      sortFilterModel0.mouseClicked((MouseEvent) null);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(1163, 1163);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      sortFilterModel0.sortTable((-1838));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(1163, 1163);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      sortFilterModel0.sort(290);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      Class class0 = sortFilterModel0.getColumnClass((-1));
      assertFalse(class0.isPrimitive());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      sortFilterModel0.mousePressed((MouseEvent) null);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      sortFilterModel0.mouseReleased((MouseEvent) null);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      sortFilterModel0.mouseEntered((MouseEvent) null);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      sortFilterModel0.setSort(false);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      // Undeclared exception!
      try { 
        sortFilterModel0.isCellEditable((-3579), (-3579));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3579
         //
         verifyException("Newzgrabber.SortFilterModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      sortFilterModel0.mouseExited((MouseEvent) null);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
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
  public void test24()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      sortFilterModel0.updateTable();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      int int0 = sortFilterModel0.getRowCount();
      assertEquals(0, int0);
  }
}
