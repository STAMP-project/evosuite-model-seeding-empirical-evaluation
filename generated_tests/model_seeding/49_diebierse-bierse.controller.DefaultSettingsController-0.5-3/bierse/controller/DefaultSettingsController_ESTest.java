/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 29 10:49:07 GMT 2019
 */

package bierse.controller;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import bierse.controller.DefaultSettingsController;
import bierse.model.Model;
import bierse.view.IDrinkSettingsView;
import bierse.view.ISettingsView;
import java.awt.event.ActionEvent;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DefaultSettingsController_ESTest extends DefaultSettingsController_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultSettingsController defaultSettingsController0 = new DefaultSettingsController((Model) null, (ISettingsView) null, (IDrinkSettingsView) null);
      ActionEvent actionEvent0 = new ActionEvent(defaultSettingsController0, (-2078209932), "0>)<0");
      defaultSettingsController0.actionPerformed(actionEvent0);
      assertEquals("0>)<0", actionEvent0.getActionCommand());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DefaultSettingsController defaultSettingsController0 = new DefaultSettingsController((Model) null, (ISettingsView) null, (IDrinkSettingsView) null);
      Vector<String> vector0 = new Vector<String>();
      ActionEvent actionEvent0 = new ActionEvent(vector0, 70, "SETTINGS_ACTION_DRINK_SELECTED");
      // Undeclared exception!
      try { 
        defaultSettingsController0.actionPerformed(actionEvent0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.Vector cannot be cast to javax.swing.JComboBox
         //
         verifyException("bierse.controller.DefaultSettingsController", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DefaultSettingsController defaultSettingsController0 = new DefaultSettingsController((Model) null, (ISettingsView) null, (IDrinkSettingsView) null);
      Object[][] objectArray0 = new Object[0][5];
      Object[] objectArray1 = new Object[5];
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(objectArray0, objectArray1);
      ActionEvent actionEvent0 = new ActionEvent(defaultTableModel0, 0, "SETTINGS_ACTION_CANCEL");
      // Undeclared exception!
      try { 
        defaultSettingsController0.actionPerformed(actionEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("bierse.controller.DefaultSettingsController", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DefaultSettingsController defaultSettingsController0 = new DefaultSettingsController((Model) null, (ISettingsView) null, (IDrinkSettingsView) null);
      ActionEvent actionEvent0 = new ActionEvent(defaultSettingsController0, 2147483645, "SETTINGS_ACTION_OK");
      // Undeclared exception!
      try { 
        defaultSettingsController0.actionPerformed(actionEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("bierse.controller.DefaultSettingsController", e);
      }
  }
}
