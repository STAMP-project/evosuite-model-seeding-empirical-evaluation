/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 29 14:08:01 GMT 2019
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
import visu.handball.moves.model.MoveEvent;
import visu.handball.moves.model.player.Player;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PauseAnimationAction_ESTest extends PauseAnimationAction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      HandballModel handballModel1 = new HandballModel();
      MoveEvent moveEvent0 = mock(MoveEvent.class, new ViolatedAssumptionAnswer());
      doReturn((Player) null, (Player) null, (Player) null).when(moveEvent0).getPlayer();
      doReturn(0, 0, 0, 0, 0).when(moveEvent0).getSequenceNr();
      doReturn(false, false, false).when(moveEvent0).isDestinationPointSet();
      handballModel1.setActualMoveEvent(moveEvent0);
      handballModel0.initWithLoadedModel(handballModel1);
      handballModel0.startAnimation(false);
      PauseAnimationAction pauseAnimationAction0 = new PauseAnimationAction(handballModel0);
      pauseAnimationAction0.actionPerformed((ActionEvent) null);
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
  public void test3()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      PauseAnimationAction pauseAnimationAction0 = new PauseAnimationAction(handballModel0);
      pauseAnimationAction0.modelChanged();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      PauseAnimationAction pauseAnimationAction0 = new PauseAnimationAction(handballModel0);
      // Undeclared exception!
      try { 
        pauseAnimationAction0.actionPerformed((ActionEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("visu.handball.moves.model.HandballModel", e);
      }
  }
}
