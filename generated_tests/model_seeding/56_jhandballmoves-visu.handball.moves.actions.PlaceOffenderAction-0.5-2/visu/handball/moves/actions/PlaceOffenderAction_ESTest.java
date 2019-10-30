/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 29 09:44:17 GMT 2019
 */

package visu.handball.moves.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.event.ActionEvent;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import visu.handball.moves.actions.PlaceOffenderAction;
import visu.handball.moves.model.HandballModel;
import visu.handball.moves.model.MoveEvent;
import visu.handball.moves.model.player.Defender;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PlaceOffenderAction_ESTest extends PlaceOffenderAction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PlaceOffenderAction placeOffenderAction0 = null;
      try {
        placeOffenderAction0 = new PlaceOffenderAction((HandballModel) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("visu.handball.moves.actions.PlaceOffenderAction", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      PlaceOffenderAction placeOffenderAction0 = new PlaceOffenderAction(handballModel0);
      placeOffenderAction0.modelChanged();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      Defender defender0 = new Defender(1, 1);
      MoveEvent moveEvent0 = new MoveEvent(defender0, 1, 1);
      handballModel0.setActualMoveEvent(moveEvent0);
      PlaceOffenderAction placeOffenderAction0 = new PlaceOffenderAction(handballModel0);
      placeOffenderAction0.modelChanged();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      PlaceOffenderAction placeOffenderAction0 = new PlaceOffenderAction(handballModel0);
      // Undeclared exception!
      try { 
        handballModel0.startAnimation(true);
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
      PlaceOffenderAction placeOffenderAction0 = new PlaceOffenderAction(handballModel0);
      ActionEvent actionEvent0 = new ActionEvent(placeOffenderAction0, 0, "kel<{z", 0L, 0);
      placeOffenderAction0.actionPerformed(actionEvent0);
      assertEquals(0L, actionEvent0.getWhen());
  }
}
