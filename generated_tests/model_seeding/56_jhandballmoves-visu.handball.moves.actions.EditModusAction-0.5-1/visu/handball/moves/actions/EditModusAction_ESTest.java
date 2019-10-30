/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 29 08:33:33 GMT 2019
 */

package visu.handball.moves.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.event.ActionEvent;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import visu.handball.moves.actions.EditModusAction;
import visu.handball.moves.model.HandballModel;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EditModusAction_ESTest extends EditModusAction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EditModusAction editModusAction0 = null;
      try {
        editModusAction0 = new EditModusAction((HandballModel) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("visu.handball.moves.actions.EditModusAction", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      EditModusAction editModusAction0 = new EditModusAction(handballModel0);
      editModusAction0.modelChanged();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      EditModusAction editModusAction0 = new EditModusAction(handballModel0);
      HandballModel.State handballModel_State0 = HandballModel.State.EDIT_EVENT;
      handballModel0.setState(handballModel_State0);
      assertEquals(HandballModel.State.EDIT_EVENT, handballModel0.getState());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      EditModusAction editModusAction0 = new EditModusAction(handballModel0);
      // Undeclared exception!
      try { 
        handballModel0.startAnimation(false);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      HandballModel.State handballModel_State0 = handballModel0.getState();
      EditModusAction editModusAction0 = new EditModusAction(handballModel0);
      ActionEvent actionEvent0 = new ActionEvent(handballModel_State0, 0, "o", 1069L, 0);
      editModusAction0.actionPerformed(actionEvent0);
      assertEquals(1069L, actionEvent0.getWhen());
  }
}
