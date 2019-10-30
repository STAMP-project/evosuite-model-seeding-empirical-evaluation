/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 29 15:14:37 GMT 2019
 */

package visu.handball.moves.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.print.Book;
import java.awt.print.PageFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import visu.handball.moves.actions.PrintActualSequenzAction;
import visu.handball.moves.model.HandballModel;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PrintActualSequenzAction_ESTest extends PrintActualSequenzAction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      PrintActualSequenzAction printActualSequenzAction0 = new PrintActualSequenzAction(handballModel0);
      Book book0 = mock(Book.class, new ViolatedAssumptionAnswer());
      PageFormat pageFormat0 = mock(PageFormat.class, new ViolatedAssumptionAnswer());
      printActualSequenzAction0.fillBook(book0, pageFormat0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PrintActualSequenzAction printActualSequenzAction0 = new PrintActualSequenzAction((HandballModel) null);
      Book book0 = new Book();
      PageFormat pageFormat0 = new PageFormat();
      // Undeclared exception!
      try { 
        printActualSequenzAction0.fillBook(book0, pageFormat0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("visu.handball.moves.actions.PrintActualSequenzAction", e);
      }
  }
}
