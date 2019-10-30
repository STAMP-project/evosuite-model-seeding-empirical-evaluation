/*
 * This file was automatically generated by EvoSuite
 * Sat Oct 26 00:50:03 GMT 2019
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
import visu.handball.moves.actions.NewPassEventAction;
import visu.handball.moves.model.HandballModel;
import visu.handball.moves.model.MoveEvent;
import visu.handball.moves.model.player.Defender;
import visu.handball.moves.model.player.Offender;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NewPassEventAction_ESTest extends NewPassEventAction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NewPassEventAction newPassEventAction0 = null;
      try {
        newPassEventAction0 = new NewPassEventAction((HandballModel) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("visu.handball.moves.actions.NewPassEventAction", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      Defender defender0 = new Defender(1590, 1590);
      defender0.setHasBall(true);
      MoveEvent moveEvent0 = mock(MoveEvent.class, new ViolatedAssumptionAnswer());
      doReturn(defender0).when(moveEvent0).getPlayer();
      doReturn(1, 1).when(moveEvent0).getSequenceNr();
      doReturn(true).when(moveEvent0).isDestinationPointSet();
      handballModel0.setActualMoveEvent(moveEvent0);
      NewPassEventAction newPassEventAction0 = new NewPassEventAction(handballModel0);
      newPassEventAction0.actionPerformed((ActionEvent) null);
      assertEquals(HandballModel.State.EDIT_EVENT, handballModel0.getState());
      assertEquals(2, handballModel0.getAcutalSequenceNr());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      Defender defender0 = new Defender(1590, 1590);
      defender0.setHasBall(true);
      MoveEvent moveEvent0 = mock(MoveEvent.class, new ViolatedAssumptionAnswer());
      doReturn(defender0).when(moveEvent0).getPlayer();
      doReturn(1, 1, 0).when(moveEvent0).getSequenceNr();
      doReturn(true).when(moveEvent0).isDestinationPointSet();
      handballModel0.setActualMoveEvent(moveEvent0);
      NewPassEventAction newPassEventAction0 = new NewPassEventAction(handballModel0);
      newPassEventAction0.modelChanged();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      Defender defender0 = new Defender(1590, 1590);
      MoveEvent moveEvent0 = mock(MoveEvent.class, new ViolatedAssumptionAnswer());
      doReturn(defender0).when(moveEvent0).getPlayer();
      doReturn(1, 1).when(moveEvent0).getSequenceNr();
      doReturn(true).when(moveEvent0).isDestinationPointSet();
      handballModel0.setActualMoveEvent(moveEvent0);
      NewPassEventAction newPassEventAction0 = new NewPassEventAction(handballModel0);
      newPassEventAction0.modelChanged();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      MoveEvent moveEvent0 = mock(MoveEvent.class, new ViolatedAssumptionAnswer());
      doReturn((Offender) null).when(moveEvent0).getPlayer();
      doReturn(0).when(moveEvent0).getSequenceNr();
      doReturn(true).when(moveEvent0).isDestinationPointSet();
      handballModel0.setActualMoveEvent(moveEvent0);
      NewPassEventAction newPassEventAction0 = new NewPassEventAction(handballModel0);
      newPassEventAction0.modelChanged();
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      Defender defender0 = new Defender(1622, 1622);
      MoveEvent moveEvent0 = new MoveEvent(defender0, 1622);
      handballModel0.setActualMoveEvent(moveEvent0);
      NewPassEventAction newPassEventAction0 = new NewPassEventAction(handballModel0);
      newPassEventAction0.actionPerformed((ActionEvent) null);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      Offender offender0 = handballModel0.getNearestOffender((-820), 1532);
      NewPassEventAction newPassEventAction0 = new NewPassEventAction(handballModel0);
      ActionEvent actionEvent0 = new ActionEvent(offender0.counter, 0, "NewPassEventAction.name", 0, 0);
      newPassEventAction0.actionPerformed(actionEvent0);
      assertEquals(0, actionEvent0.getID());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      NewPassEventAction newPassEventAction0 = new NewPassEventAction(handballModel0);
      newPassEventAction0.modelChanged();
  }
}