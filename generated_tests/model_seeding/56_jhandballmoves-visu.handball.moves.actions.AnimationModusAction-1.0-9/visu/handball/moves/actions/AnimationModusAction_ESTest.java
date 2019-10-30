/*
 * This file was automatically generated by EvoSuite
 * Sat Oct 26 00:50:01 GMT 2019
 */

package visu.handball.moves.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.event.ActionEvent;
import javax.swing.plaf.synth.SynthSpinnerUI;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import visu.handball.moves.actions.AnimationModusAction;
import visu.handball.moves.model.HandballModel;
import visu.handball.moves.model.MoveEvent;
import visu.handball.moves.model.player.Offender;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AnimationModusAction_ESTest extends AnimationModusAction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      AnimationModusAction animationModusAction0 = new AnimationModusAction(handballModel0);
      SynthSpinnerUI synthSpinnerUI0 = new SynthSpinnerUI();
      animationModusAction0.addPropertyChangeListener(synthSpinnerUI0);
      // Undeclared exception!
      try { 
        animationModusAction0.modelChanged();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // visu.handball.moves.actions.AnimationModusAction cannot be cast to javax.swing.JSpinner
         //
         verifyException("javax.swing.plaf.synth.SynthSpinnerUI", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AnimationModusAction animationModusAction0 = null;
      try {
        animationModusAction0 = new AnimationModusAction((HandballModel) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("visu.handball.moves.actions.AnimationModusAction", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      AnimationModusAction animationModusAction0 = new AnimationModusAction(handballModel0);
      animationModusAction0.modelChanged();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      Offender offender0 = new Offender(298, (-997));
      MoveEvent moveEvent0 = new MoveEvent(offender0, (-1));
      handballModel0.addMoveEvent(moveEvent0);
      AnimationModusAction animationModusAction0 = new AnimationModusAction(handballModel0);
      animationModusAction0.modelChanged();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      Offender offender0 = new Offender((-1), (-1));
      MoveEvent moveEvent0 = new MoveEvent(offender0, (-1));
      handballModel0.addMoveEvent(moveEvent0);
      AnimationModusAction animationModusAction0 = new AnimationModusAction(handballModel0);
      // Undeclared exception!
      try { 
        handballModel0.startAnimation(false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("visu.handball.moves.model.MoveEvent", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      AnimationModusAction animationModusAction0 = new AnimationModusAction(handballModel0);
      animationModusAction0.actionPerformed((ActionEvent) null);
  }
}