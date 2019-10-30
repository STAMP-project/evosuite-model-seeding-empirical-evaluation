/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 29 10:50:05 GMT 2019
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
import visu.handball.moves.actions.PlaceOffenderAction;
import visu.handball.moves.model.HandballModel;
import visu.handball.moves.model.MoveEvent;
import visu.handball.moves.model.player.Player;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PlaceOffenderAction_ESTest extends PlaceOffenderAction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HandballModel handballModel0 = mock(HandballModel.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(handballModel0).addListener(any(visu.handball.moves.model.HandballModelListener.class));
      doReturn((HandballModel.State) null).when(handballModel0).getState();
      PlaceOffenderAction placeOffenderAction0 = new PlaceOffenderAction(handballModel0);
      // Undeclared exception!
      try { 
        placeOffenderAction0.modelChanged();
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
  public void test2()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      PlaceOffenderAction placeOffenderAction0 = new PlaceOffenderAction(handballModel0);
      placeOffenderAction0.modelChanged();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      MoveEvent moveEvent0 = mock(MoveEvent.class, new ViolatedAssumptionAnswer());
      doReturn((Player) null).when(moveEvent0).getPlayer();
      doReturn(0).when(moveEvent0).getSequenceNr();
      doReturn(false).when(moveEvent0).isDestinationPointSet();
      handballModel0.setActualMoveEvent(moveEvent0);
      PlaceOffenderAction placeOffenderAction0 = new PlaceOffenderAction(handballModel0);
      placeOffenderAction0.modelChanged();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      PlaceOffenderAction placeOffenderAction0 = new PlaceOffenderAction(handballModel0);
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
  public void test5()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      PlaceOffenderAction placeOffenderAction0 = new PlaceOffenderAction(handballModel0);
      ActionEvent actionEvent0 = new ActionEvent(handballModel0, 0, "zMjVc", 0L, 689);
      placeOffenderAction0.actionPerformed(actionEvent0);
      assertEquals(0, actionEvent0.getID());
  }
}
