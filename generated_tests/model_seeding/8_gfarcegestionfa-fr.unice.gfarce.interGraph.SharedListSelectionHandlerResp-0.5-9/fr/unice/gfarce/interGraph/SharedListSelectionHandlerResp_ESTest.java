/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 29 17:03:03 GMT 2019
 */

package fr.unice.gfarce.interGraph;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import fr.unice.gfarce.interGraph.FenetrePrincipale;
import fr.unice.gfarce.interGraph.SharedListSelectionHandlerResp;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SharedListSelectionHandlerResp_ESTest extends SharedListSelectionHandlerResp_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SharedListSelectionHandlerResp sharedListSelectionHandlerResp0 = new SharedListSelectionHandlerResp();
      Object[][] objectArray0 = new Object[7][9];
      Object[] objectArray1 = new Object[4];
      objectArray1[0] = (Object) sharedListSelectionHandlerResp0;
      objectArray1[1] = (Object) sharedListSelectionHandlerResp0;
      objectArray1[2] = (Object) sharedListSelectionHandlerResp0;
      objectArray1[3] = (Object) sharedListSelectionHandlerResp0;
      objectArray0[1] = objectArray1;
      JTable jTable0 = new JTable(objectArray0, objectArray0[1]);
      FenetrePrincipale.tableResp = jTable0;
      ListSelectionEvent listSelectionEvent0 = new ListSelectionEvent(sharedListSelectionHandlerResp0, 54, (-1), false);
      sharedListSelectionHandlerResp0.valueChanged(listSelectionEvent0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SharedListSelectionHandlerResp sharedListSelectionHandlerResp0 = new SharedListSelectionHandlerResp();
      // Undeclared exception!
      try { 
        sharedListSelectionHandlerResp0.valueChanged((ListSelectionEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fr.unice.gfarce.interGraph.SharedListSelectionHandlerResp", e);
      }
  }
}
