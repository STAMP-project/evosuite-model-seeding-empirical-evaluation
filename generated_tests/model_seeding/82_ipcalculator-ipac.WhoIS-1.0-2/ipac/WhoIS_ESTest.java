/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 06 12:56:09 GMT 2019
 */

package ipac;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ipac.WhoIS;
import java.awt.event.ActionEvent;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class WhoIS_ESTest extends WhoIS_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      WhoIS whoIS0 = new WhoIS();
      whoIS0.lowercaseD = null;
      // Undeclared exception!
      try { 
        whoIS0.reset();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ipac.WhoIS", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      WhoIS whoIS0 = new WhoIS();
      // Undeclared exception!
      try { 
        whoIS0.actionPerformed((ActionEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ipac.WhoIS", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      WhoIS whoIS0 = new WhoIS();
      ActionEvent actionEvent0 = new ActionEvent(whoIS0, 0, "", 0, 0);
      whoIS0.actionPerformed(actionEvent0);
      assertFalse(whoIS0.isFocusTraversalPolicySet());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      WhoIS whoIS0 = new WhoIS();
      whoIS0.reset();
      assertFalse(whoIS0.getIgnoreRepaint());
  }
}
