/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 29 13:15:48 GMT 2019
 */

package fr.pingtimeout.jtail.gui.controller;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import fr.pingtimeout.jtail.gui.controller.SelectIndexTypeListener;
import fr.pingtimeout.jtail.gui.model.OpenFileModel;
import fr.pingtimeout.jtail.io.index.FileIndex;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SelectIndexTypeListener_ESTest extends SelectIndexTypeListener_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      OpenFileModel openFileModel0 = new OpenFileModel();
      SelectIndexTypeListener selectIndexTypeListener0 = new SelectIndexTypeListener(openFileModel0);
      // Undeclared exception!
      try { 
        selectIndexTypeListener0.actionPerformed((ActionEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fr.pingtimeout.jtail.gui.controller.SelectIndexTypeListener", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      OpenFileModel openFileModel0 = new OpenFileModel();
      String[] stringArray0 = new String[11];
      stringArray0[0] = "The user selected '{}' as index type";
      JComboBox<String> jComboBox0 = new JComboBox<String>(stringArray0);
      SelectIndexTypeListener selectIndexTypeListener0 = new SelectIndexTypeListener(openFileModel0);
      ActionEvent actionEvent0 = new ActionEvent(jComboBox0, (-461), stringArray0[1], (-461));
      selectIndexTypeListener0.actionPerformed(actionEvent0);
      assertEquals(FileIndex.Type.MEMORY_BASED, openFileModel0.getIndexType());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      OpenFileModel openFileModel0 = new OpenFileModel();
      SelectIndexTypeListener selectIndexTypeListener0 = new SelectIndexTypeListener(openFileModel0);
      ActionEvent actionEvent0 = new ActionEvent(selectIndexTypeListener0, 0, "VhE_2\"T3");
      // Undeclared exception!
      try { 
        selectIndexTypeListener0.actionPerformed(actionEvent0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // fr.pingtimeout.jtail.gui.controller.SelectIndexTypeListener cannot be cast to javax.swing.JComboBox
         //
         verifyException("fr.pingtimeout.jtail.gui.controller.SelectIndexTypeListener", e);
      }
  }
}
