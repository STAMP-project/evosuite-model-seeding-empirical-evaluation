/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 29 09:24:09 GMT 2019
 */

package fr.unice.gfarce.interGraph;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import fr.unice.gfarce.interGraph.EnvoiAcceptBourseAction;
import fr.unice.gfarce.interGraph.FenetrePrincipale;
import fr.unice.gfarce.main.Controler;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EnvoiAcceptBourseAction_ESTest extends EnvoiAcceptBourseAction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EnvoiAcceptBourseAction envoiAcceptBourseAction0 = new EnvoiAcceptBourseAction((FenetrePrincipale) null, "I", (Controler) null);
      // Undeclared exception!
      try { 
        envoiAcceptBourseAction0.actionPerformed((ActionEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fr.unice.gfarce.interGraph.EnvoiAcceptBourseAction", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EnvoiAcceptBourseAction envoiAcceptBourseAction0 = new EnvoiAcceptBourseAction((FenetrePrincipale) null, "M)b}L)4(yo#u", (Controler) null);
      Object[][] objectArray0 = new Object[1][0];
      Object[] objectArray1 = new Object[9];
      objectArray1[0] = (Object) objectArray1;
      objectArray1[1] = objectArray1[0];
      objectArray1[2] = objectArray1[1];
      objectArray1[3] = objectArray1[2];
      objectArray1[4] = objectArray1[3];
      objectArray1[5] = objectArray1[4];
      objectArray1[6] = objectArray1[5];
      objectArray1[7] = objectArray1[6];
      objectArray1[8] = objectArray1[7];
      JTable jTable0 = new JTable(objectArray0, objectArray1);
      FenetrePrincipale.tableEtu = jTable0;
      // Undeclared exception!
      try { 
        envoiAcceptBourseAction0.actionPerformed((ActionEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fr.unice.gfarce.interGraph.EnvoiAcceptBourseAction", e);
      }
  }
}
