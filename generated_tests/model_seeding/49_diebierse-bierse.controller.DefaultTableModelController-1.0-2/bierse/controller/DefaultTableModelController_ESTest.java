/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 25 16:28:52 GMT 2019
 */

package bierse.controller;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import bierse.controller.DefaultTableModelController;
import bierse.model.Model;
import bierse.view.IDrinkSellView;
import java.util.Stack;
import javax.swing.event.TableModelEvent;
import javax.swing.table.DefaultTableModel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DefaultTableModelController_ESTest extends DefaultTableModelController_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      TableModelEvent tableModelEvent0 = new TableModelEvent(defaultTableModel0, 1842, 1842);
      DefaultTableModelController defaultTableModelController0 = new DefaultTableModelController((Model) null, (IDrinkSellView) null);
      // Undeclared exception!
      try { 
        defaultTableModelController0.tableChanged(tableModelEvent0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1842 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DefaultTableModelController defaultTableModelController0 = new DefaultTableModelController((Model) null, (IDrinkSellView) null);
      Stack<DefaultTableModel> stack0 = new Stack<DefaultTableModel>();
      stack0.add((DefaultTableModel) null);
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(stack0, stack0);
      TableModelEvent tableModelEvent0 = new TableModelEvent(defaultTableModel0, 0, 0);
      // Undeclared exception!
      try { 
        defaultTableModelController0.tableChanged(tableModelEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("bierse.controller.DefaultTableModelController", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DefaultTableModelController defaultTableModelController0 = new DefaultTableModelController((Model) null, (IDrinkSellView) null);
      Stack<DefaultTableModel> stack0 = new Stack<DefaultTableModel>();
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(stack0, stack0);
      stack0.add(defaultTableModel0);
      TableModelEvent tableModelEvent0 = new TableModelEvent(defaultTableModel0, 0, 0);
      // Undeclared exception!
      try { 
        defaultTableModelController0.tableChanged(tableModelEvent0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // javax.swing.table.DefaultTableModel cannot be cast to java.util.Vector
         //
         verifyException("javax.swing.table.DefaultTableModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      TableModelEvent tableModelEvent0 = new TableModelEvent(defaultTableModel0, (-1046), (-1046));
      DefaultTableModelController defaultTableModelController0 = new DefaultTableModelController((Model) null, (IDrinkSellView) null);
      defaultTableModelController0.tableChanged(tableModelEvent0);
  }
}