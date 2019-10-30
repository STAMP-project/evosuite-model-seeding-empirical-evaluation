/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 29 15:14:48 GMT 2019
 */

package visu.handball.moves.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.print.Book;
import java.awt.print.PageFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import visu.handball.moves.actions.PrintMoveAction;
import visu.handball.moves.model.HandballModel;
import visu.handball.moves.model.MoveEvent;
import visu.handball.moves.model.player.Defender;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PrintMoveAction_ESTest extends PrintMoveAction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      Defender defender0 = new Defender(720, 720);
      MoveEvent moveEvent0 = new MoveEvent(defender0, 1);
      handballModel0.addMoveEvent(moveEvent0);
      PrintMoveAction printMoveAction0 = new PrintMoveAction(handballModel0);
      Book book0 = new Book();
      PageFormat pageFormat0 = new PageFormat();
      printMoveAction0.fillBook(book0, pageFormat0);
      assertEquals(2, book0.getNumberOfPages());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PageFormat pageFormat0 = new PageFormat();
      HandballModel handballModel0 = new HandballModel();
      PrintMoveAction printMoveAction0 = new PrintMoveAction(handballModel0);
      // Undeclared exception!
      try { 
        printMoveAction0.fillBook((Book) null, pageFormat0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("visu.handball.moves.actions.PrintMoveAction", e);
      }
  }
}
