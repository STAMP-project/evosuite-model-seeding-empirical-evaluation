/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 29 18:29:15 GMT 2019
 */

package visu.handball.moves.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.event.ActionEvent;
import javax.swing.plaf.synth.SynthSpinnerUI;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import visu.handball.moves.actions.StartAnimationAction;
import visu.handball.moves.model.HandballModel;
import visu.handball.moves.model.MoveEvent;
import visu.handball.moves.model.player.Player;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StartAnimationAction_ESTest extends StartAnimationAction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      MoveEvent moveEvent0 = mock(MoveEvent.class, new ViolatedAssumptionAnswer());
      doReturn((Player) null, (Player) null).when(moveEvent0).getPlayer();
      doReturn(0, 0, 0, 0).when(moveEvent0).getSequenceNr();
      doReturn(false, false).when(moveEvent0).isDestinationPointSet();
      handballModel0.setActualMoveEvent(moveEvent0);
      StartAnimationAction startAnimationAction0 = new StartAnimationAction(handballModel0);
      Object object0 = new Object();
      ActionEvent actionEvent0 = new ActionEvent(object0, 170, "Add", 170);
      startAnimationAction0.actionPerformed(actionEvent0);
      assertEquals("Add", actionEvent0.getActionCommand());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      StartAnimationAction startAnimationAction0 = new StartAnimationAction(handballModel0);
      SynthSpinnerUI synthSpinnerUI0 = new SynthSpinnerUI();
      startAnimationAction0.addPropertyChangeListener(synthSpinnerUI0);
      // Undeclared exception!
      try { 
        startAnimationAction0.modelChanged();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // visu.handball.moves.actions.StartAnimationAction cannot be cast to javax.swing.JSpinner
         //
         verifyException("javax.swing.plaf.synth.SynthSpinnerUI", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      StartAnimationAction startAnimationAction0 = null;
      try {
        startAnimationAction0 = new StartAnimationAction((HandballModel) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("visu.handball.moves.actions.StartAnimationAction", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      StartAnimationAction startAnimationAction0 = new StartAnimationAction(handballModel0);
      startAnimationAction0.modelChanged();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      StartAnimationAction startAnimationAction0 = new StartAnimationAction(handballModel0);
      HandballModel.State handballModel_State0 = HandballModel.State.FULL_ANIMATION_ENDED;
      handballModel0.setState(handballModel_State0);
      assertEquals("", handballModel0.getMoveName());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      StartAnimationAction startAnimationAction0 = new StartAnimationAction(handballModel0);
      handballModel0.stopAnimation();
      assertEquals(HandballModel.State.ANIMATION, handballModel0.getState());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      StartAnimationAction startAnimationAction0 = new StartAnimationAction(handballModel0);
      HandballModel.State handballModel_State0 = HandballModel.State.ANIMATION_RUNNING;
      handballModel0.setState(handballModel_State0);
      // Undeclared exception!
      try { 
        startAnimationAction0.actionPerformed((ActionEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("visu.handball.moves.model.HandballModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      StartAnimationAction startAnimationAction0 = new StartAnimationAction(handballModel0);
      // Undeclared exception!
      try { 
        startAnimationAction0.actionPerformed((ActionEvent) null);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }
}