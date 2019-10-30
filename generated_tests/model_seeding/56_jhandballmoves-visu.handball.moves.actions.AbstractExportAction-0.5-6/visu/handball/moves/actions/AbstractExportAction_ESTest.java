/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 29 14:09:49 GMT 2019
 */

package visu.handball.moves.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import javax.swing.DebugGraphics;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import visu.handball.moves.actions.CreateMovePdfAction;
import visu.handball.moves.actions.PrintActualSequenzAction;
import visu.handball.moves.actions.PrintMoveAction;
import visu.handball.moves.model.HandballModel;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractExportAction_ESTest extends AbstractExportAction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      PrintMoveAction printMoveAction0 = new PrintMoveAction(handballModel0);
      // Undeclared exception!
      try { 
        printMoveAction0.drawHeader((Graphics) null, 4545.0, 4545.0, 1.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("visu.handball.moves.actions.AbstractExportAction", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      PrintActualSequenzAction printActualSequenzAction0 = new PrintActualSequenzAction(handballModel0);
      // Undeclared exception!
      try { 
        printActualSequenzAction0.drawHeader((Graphics) null, 107, 0.0, 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("visu.handball.moves.actions.AbstractExportAction", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PrintMoveAction printMoveAction0 = new PrintMoveAction((HandballModel) null);
      printMoveAction0.createCopy();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      PrintMoveAction printMoveAction0 = new PrintMoveAction(handballModel0);
      DebugGraphics debugGraphics0 = new DebugGraphics();
      // Undeclared exception!
      try { 
        printMoveAction0.drawHeader(debugGraphics0, 476.8348861697175, 476.8348861697175, 476.8348861697175);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // javax.swing.DebugGraphics cannot be cast to java.awt.Graphics2D
         //
         verifyException("visu.handball.moves.actions.AbstractExportAction", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      PrintMoveAction printMoveAction0 = new PrintMoveAction(handballModel0);
      printMoveAction0.createCopy();
      // Undeclared exception!
      try { 
        printMoveAction0.drawSequence((Graphics2D) null, 2255);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("visu.handball.moves.actions.AbstractExportAction", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      CreateMovePdfAction createMovePdfAction0 = new CreateMovePdfAction(handballModel0);
      ActionEvent actionEvent0 = new ActionEvent(createMovePdfAction0, 0, "");
      // Undeclared exception!
      try { 
        createMovePdfAction0.actionPerformed(actionEvent0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }
}