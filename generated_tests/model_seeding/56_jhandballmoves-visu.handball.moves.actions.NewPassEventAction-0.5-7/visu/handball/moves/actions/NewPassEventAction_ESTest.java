/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 29 15:17:17 GMT 2019
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
import visu.handball.moves.model.player.Player;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NewPassEventAction_ESTest extends NewPassEventAction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      NewPassEventAction newPassEventAction0 = new NewPassEventAction(handballModel0);
      newPassEventAction0.modelChanged();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
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
  public void test2()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      NewPassEventAction newPassEventAction0 = new NewPassEventAction(handballModel0);
      Defender defender0 = new Defender(0, 0);
      MoveEvent moveEvent0 = new MoveEvent(defender0, 1);
      moveEvent0.setDestinationPoint((byte) (-39), (byte)0, false);
      handballModel0.setActualMoveEvent(moveEvent0);
      assertTrue(moveEvent0.isMarked());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      NewPassEventAction newPassEventAction0 = new NewPassEventAction(handballModel0);
      Player player0 = mock(Player.class, new ViolatedAssumptionAnswer());
      doReturn((int)(byte)0, 0).when(player0).getCurrent_x();
      doReturn((int)(byte)0, 1).when(player0).getCurrent_y();
      doReturn((-1), 0).when(player0).getPlayerNumber();
      doReturn(true, true, false, true).when(player0).hasBall();
      MoveEvent moveEvent0 = new MoveEvent(player0, (byte)0);
      moveEvent0.setDestinationPoint((-3880), (byte)5, false);
      moveEvent0.setSequenceNr((-1));
      handballModel0.setActualMoveEvent(moveEvent0);
      ActionEvent actionEvent0 = new ActionEvent(newPassEventAction0, 1, "Laufweg zu Position (-3880,5)", (byte)0);
      newPassEventAction0.actionPerformed(actionEvent0);
      handballModel0.setActualMoveEvent(moveEvent0);
      assertFalse(handballModel0.isBallSet());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      NewPassEventAction newPassEventAction0 = new NewPassEventAction(handballModel0);
      Player player0 = mock(Player.class, new ViolatedAssumptionAnswer());
      doReturn((int)(byte)0, 0).when(player0).getCurrent_x();
      doReturn((int)(byte)0, 1).when(player0).getCurrent_y();
      doReturn((-1), 0).when(player0).getPlayerNumber();
      doReturn(true, true, false, true).when(player0).hasBall();
      MoveEvent moveEvent0 = new MoveEvent(player0, (byte)0);
      moveEvent0.setDestinationPoint((-3880), (byte)5, false);
      handballModel0.setActualMoveEvent(moveEvent0);
      ActionEvent actionEvent0 = new ActionEvent(newPassEventAction0, 1, "Laufweg zu Position (-3880,5)", (byte)0);
      newPassEventAction0.actionPerformed(actionEvent0);
      assertEquals(HandballModel.State.EDIT_EVENT, handballModel0.getState());
      assertEquals(1, handballModel0.getAcutalSequenceNr());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      NewPassEventAction newPassEventAction0 = new NewPassEventAction(handballModel0);
      Defender defender0 = new Defender(0, 0);
      MoveEvent moveEvent0 = new MoveEvent(defender0, 0);
      moveEvent0.setPlayer((Player) null);
      moveEvent0.setDestinationPoint(0, 0, false);
      handballModel0.setActualMoveEvent(moveEvent0);
      assertFalse(handballModel0.isBallSet());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      NewPassEventAction newPassEventAction0 = new NewPassEventAction(handballModel0);
      Defender defender0 = new Defender(738, 738);
      MoveEvent moveEvent0 = new MoveEvent(defender0, 1);
      handballModel0.setActualMoveEvent(moveEvent0);
      ActionEvent actionEvent0 = new ActionEvent(handballModel0, 738, "LongDescription");
      newPassEventAction0.actionPerformed(actionEvent0);
      assertEquals(738, actionEvent0.getID());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      NewPassEventAction newPassEventAction0 = new NewPassEventAction(handballModel0);
      newPassEventAction0.actionPerformed((ActionEvent) null);
  }
}
