/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 28 19:20:18 GMT 2019
 */

package org.databene.jdbacl.swing;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import org.databene.jdbacl.swing.TextFieldValueProvider;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TextFieldValueProvider_ESTest extends TextFieldValueProvider_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JPasswordField jPasswordField0 = new JPasswordField("OvAUi^rf:8]QEtLjU<m");
      TextFieldValueProvider textFieldValueProvider0 = new TextFieldValueProvider(jPasswordField0);
      String string0 = textFieldValueProvider0.getValue();
      assertEquals("OvAUi^rf:8]QEtLjU<m", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JTextField jTextField0 = new JTextField(570);
      TextFieldValueProvider textFieldValueProvider0 = new TextFieldValueProvider(jTextField0);
      String string0 = textFieldValueProvider0.getValue();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TextFieldValueProvider textFieldValueProvider0 = new TextFieldValueProvider((JTextField) null);
      // Undeclared exception!
      try { 
        textFieldValueProvider0.getValue();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.swing.TextFieldValueProvider", e);
      }
  }
}