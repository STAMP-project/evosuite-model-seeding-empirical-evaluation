/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 29 17:23:45 GMT 2019
 */

package visu.handball.moves.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.event.ActionEvent;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import visu.handball.moves.actions.PauseAnimationAction;
import visu.handball.moves.model.HandballModel;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PauseAnimationAction_ESTest extends PauseAnimationAction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HandballModel handballModel0 = mock(HandballModel.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(handballModel0).addListener(any(visu.handball.moves.model.HandballModelListener.class));
      PauseAnimationAction pauseAnimationAction0 = new PauseAnimationAction(handballModel0);
      ActionEvent actionEvent0 = new ActionEvent(pauseAnimationAction0, 0, (String) null, (-1));
      pauseAnimationAction0.actionPerformed(actionEvent0);
      assertNull(actionEvent0.getActionCommand());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PauseAnimationAction pauseAnimationAction0 = null;
      try {
        pauseAnimationAction0 = new PauseAnimationAction((HandballModel) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("visu.handball.moves.actions.PauseAnimationAction", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      PauseAnimationAction pauseAnimationAction0 = new PauseAnimationAction(handballModel0);
      HandballModel.State handballModel_State0 = HandballModel.State.ANIMATION_RUNNING;
      handballModel0.setState(handballModel_State0);
      assertEquals(0, handballModel0.getAcutalSequenceNr());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      PauseAnimationAction pauseAnimationAction0 = new PauseAnimationAction(handballModel0);
      pauseAnimationAction0.modelChanged();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      PauseAnimationAction pauseAnimationAction0 = new PauseAnimationAction(handballModel0);
      ActionEvent actionEvent0 = new ActionEvent(handballModel0, (-1287), "");
      // Undeclared exception!
      try { 
        pauseAnimationAction0.actionPerformed(actionEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("visu.handball.moves.model.HandballModel", e);
      }
  }
}
