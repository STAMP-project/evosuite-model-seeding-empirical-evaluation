/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 29 18:27:59 GMT 2019
 */

package visu.handball.moves.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.event.ActionEvent;
import java.util.List;
import javax.swing.plaf.synth.SynthSpinnerUI;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import visu.handball.moves.actions.NewSequenceAction;
import visu.handball.moves.model.HandballModel;
import visu.handball.moves.model.MoveEvent;
import visu.handball.moves.model.player.Defender;
import visu.handball.moves.model.player.Player;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NewSequenceAction_ESTest extends NewSequenceAction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      NewSequenceAction newSequenceAction0 = new NewSequenceAction(handballModel0);
      SynthSpinnerUI synthSpinnerUI0 = new SynthSpinnerUI();
      newSequenceAction0.addPropertyChangeListener(synthSpinnerUI0);
      // Undeclared exception!
      try { 
        newSequenceAction0.modelChanged();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // visu.handball.moves.actions.NewSequenceAction cannot be cast to javax.swing.JSpinner
         //
         verifyException("javax.swing.plaf.synth.SynthSpinnerUI", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NewSequenceAction newSequenceAction0 = null;
      try {
        newSequenceAction0 = new NewSequenceAction((HandballModel) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("visu.handball.moves.actions.NewSequenceAction", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HandballModel.State handballModel_State0 = HandballModel.State.EDIT;
      Defender defender0 = new Defender(1, (-2190));
      HandballModel.State handballModel_State1 = HandballModel.State.ANIMATION_RUNNING;
      HandballModel handballModel0 = mock(HandballModel.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(handballModel0).addListener(any(visu.handball.moves.model.HandballModelListener.class));
      doReturn(true).when(handballModel0).eventDefinedAfter(anyInt());
      doReturn(1, 1, (-1389)).when(handballModel0).getAcutalSequenceNr();
      doReturn(defender0, defender0).when(handballModel0).getMarkedPlayer();
      doReturn(handballModel_State0, handballModel_State0, handballModel_State1).when(handballModel0).getState();
      doReturn(false, true).when(handballModel0).isGoalPassSet();
      doReturn(false, false).when(handballModel0).passEventDefined(anyInt());
      NewSequenceAction newSequenceAction0 = new NewSequenceAction(handballModel0);
      newSequenceAction0.modelChanged();
      newSequenceAction0.modelChanged();
      newSequenceAction0.modelChanged();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HandballModel.State handballModel_State0 = HandballModel.State.EDIT;
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "2LUq3B#w-]");
      Defender defender0 = new Defender(6, (-2190));
      HandballModel handballModel0 = mock(HandballModel.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(handballModel0).addListener(any(visu.handball.moves.model.HandballModelListener.class));
      doReturn(false).when(handballModel0).eventDefinedAfter(anyInt());
      doReturn(1, 1, 0).when(handballModel0).getAcutalSequenceNr();
      doReturn(defender0, defender0, (Player) null).when(handballModel0).getMarkedPlayer();
      doReturn(handballModel_State0, handballModel_State0, handballModel_State0).when(handballModel0).getState();
      doReturn(false).when(handballModel0).isGoalPassSet();
      doReturn(true, false).when(handballModel0).passEventDefined(anyInt());
      NewSequenceAction newSequenceAction0 = new NewSequenceAction(handballModel0);
      newSequenceAction0.modelChanged();
      newSequenceAction0.modelChanged();
      newSequenceAction0.modelChanged();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HandballModel.State handballModel_State0 = HandballModel.State.EDIT;
      Defender defender0 = new Defender(1, (-2190));
      HandballModel handballModel0 = mock(HandballModel.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(handballModel0).addListener(any(visu.handball.moves.model.HandballModelListener.class));
      doReturn(false).when(handballModel0).eventDefinedAfter(anyInt());
      doReturn(1, 100, 436).when(handballModel0).getAcutalSequenceNr();
      doReturn(defender0, defender0).when(handballModel0).getMarkedPlayer();
      doReturn(handballModel_State0, handballModel_State0).when(handballModel0).getState();
      doReturn(false).when(handballModel0).isGoalPassSet();
      doReturn(true, false).when(handballModel0).passEventDefined(anyInt());
      NewSequenceAction newSequenceAction0 = new NewSequenceAction(handballModel0);
      newSequenceAction0.modelChanged();
      newSequenceAction0.modelChanged();
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      NewSequenceAction newSequenceAction0 = new NewSequenceAction(handballModel0);
      newSequenceAction0.actionPerformed((ActionEvent) null);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      Defender defender0 = new Defender((-207), 1176);
      MoveEvent moveEvent0 = new MoveEvent(defender0, (-2391), (-2391));
      handballModel0.setActualMoveEvent(moveEvent0);
      List<MoveEvent> list0 = handballModel0.getMoveEvents(0);
      NewSequenceAction newSequenceAction0 = new NewSequenceAction(handballModel0);
      ActionEvent actionEvent0 = new ActionEvent(list0, (-2391), "");
      newSequenceAction0.actionPerformed(actionEvent0);
      assertEquals("", actionEvent0.getActionCommand());
  }
}
