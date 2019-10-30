/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 28 22:02:07 GMT 2019
 */

package visu.handball.moves.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.event.ActionEvent;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import visu.handball.moves.actions.NewMoveEventAction;
import visu.handball.moves.model.HandballModel;
import visu.handball.moves.model.MoveEvent;
import visu.handball.moves.model.player.Defender;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NewMoveEventAction_ESTest extends NewMoveEventAction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      NewMoveEventAction newMoveEventAction0 = new NewMoveEventAction(handballModel0);
      Defender defender0 = new Defender(5, 5412);
      MoveEvent moveEvent0 = new MoveEvent(defender0, (-4223), 0);
      handballModel0.setActualMoveEvent(moveEvent0);
      newMoveEventAction0.actionPerformed((ActionEvent) null);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      NewMoveEventAction newMoveEventAction0 = new NewMoveEventAction(handballModel0);
      newMoveEventAction0.modelChanged();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NewMoveEventAction newMoveEventAction0 = null;
      try {
        newMoveEventAction0 = new NewMoveEventAction((HandballModel) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("visu.handball.moves.actions.NewMoveEventAction", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      NewMoveEventAction newMoveEventAction0 = new NewMoveEventAction(handballModel0);
      Defender defender0 = new Defender(5, 5412);
      MoveEvent moveEvent0 = new MoveEvent(defender0, 704);
      moveEvent0.setDestinationPoint(704, 704, false);
      handballModel0.setActualMoveEvent(moveEvent0);
      handballModel0.setActualMoveEvent((MoveEvent) null);
      assertEquals("", handballModel0.getMoveName());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      NewMoveEventAction newMoveEventAction0 = new NewMoveEventAction(handballModel0);
      Defender defender0 = new Defender(5, 5412);
      MoveEvent moveEvent0 = new MoveEvent(defender0, 704);
      moveEvent0.setDestinationPoint((-1305), (-4223), false);
      handballModel0.setActualMoveEvent(moveEvent0);
      newMoveEventAction0.actionPerformed((ActionEvent) null);
      handballModel0.setActualMoveEvent(moveEvent0);
      assertTrue(moveEvent0.isMarked());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      Defender defender0 = new Defender(5, 5412);
      ActionEvent actionEvent0 = new ActionEvent(handballModel0, (-4223), (String) null, (-4223));
      MoveEvent moveEvent0 = new MoveEvent(defender0, 0);
      handballModel0.setActualMoveEvent(moveEvent0);
      NewMoveEventAction newMoveEventAction0 = new NewMoveEventAction(handballModel0);
      newMoveEventAction0.actionPerformed(actionEvent0);
      assertNull(actionEvent0.getActionCommand());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      NewMoveEventAction newMoveEventAction0 = new NewMoveEventAction(handballModel0);
      ActionEvent actionEvent0 = new ActionEvent(newMoveEventAction0, 29, "HeW", 29);
      newMoveEventAction0.actionPerformed(actionEvent0);
      assertEquals(29, actionEvent0.getID());
  }
}