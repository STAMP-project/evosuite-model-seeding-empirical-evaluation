/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 06 13:24:41 GMT 2019
 */

package src.feudalismGUI;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import src.feudalismGUI.EditFiefdom;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EditFiefdom_ESTest extends EditFiefdom_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EditFiefdom editFiefdom0 = null;
      try {
        editFiefdom0 = new EditFiefdom();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class src.Map
         //
         verifyException("src.feudalismGUI.EditFiefdom", e);
      }
  }
}
