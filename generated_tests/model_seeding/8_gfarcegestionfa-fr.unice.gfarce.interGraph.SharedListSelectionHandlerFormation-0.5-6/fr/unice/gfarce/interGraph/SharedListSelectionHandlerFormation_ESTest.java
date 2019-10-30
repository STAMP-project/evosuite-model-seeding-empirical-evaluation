/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 29 13:52:23 GMT 2019
 */

package fr.unice.gfarce.interGraph;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import fr.unice.gfarce.interGraph.FenetrePrincipale;
import fr.unice.gfarce.interGraph.SharedListSelectionHandlerFormation;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SharedListSelectionHandlerFormation_ESTest extends SharedListSelectionHandlerFormation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SharedListSelectionHandlerFormation sharedListSelectionHandlerFormation0 = new SharedListSelectionHandlerFormation();
      // Undeclared exception!
      try { 
        sharedListSelectionHandlerFormation0.valueChanged((ListSelectionEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fr.unice.gfarce.interGraph.SharedListSelectionHandlerFormation", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SharedListSelectionHandlerFormation sharedListSelectionHandlerFormation0 = new SharedListSelectionHandlerFormation();
      JTable jTable0 = new JTable();
      FenetrePrincipale.tableFormation = jTable0;
      sharedListSelectionHandlerFormation0.valueChanged((ListSelectionEvent) null);
  }
}