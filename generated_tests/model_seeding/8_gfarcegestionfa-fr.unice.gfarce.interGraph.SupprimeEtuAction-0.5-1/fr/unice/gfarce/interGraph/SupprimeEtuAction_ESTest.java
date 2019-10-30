/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 29 08:12:32 GMT 2019
 */

package fr.unice.gfarce.interGraph;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import fr.unice.gfarce.interGraph.FenetrePrincipale;
import fr.unice.gfarce.interGraph.SupprimeEtuAction;
import fr.unice.gfarce.main.Controler;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.time.temporal.ChronoField;
import java.util.Stack;
import java.util.Vector;
import javax.swing.JTable;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SupprimeEtuAction_ESTest extends SupprimeEtuAction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SupprimeEtuAction supprimeEtuAction0 = new SupprimeEtuAction((FenetrePrincipale) null, "fr.unice.gfarce.interGraph.SupprimeEtuAction", (Controler) null);
      Vector<Image> vector0 = new Vector<Image>();
      Stack<ChronoField> stack0 = new Stack<ChronoField>();
      JTable jTable0 = new JTable(vector0, stack0);
      FenetrePrincipale.tableEtu = jTable0;
      // Undeclared exception!
      try { 
        supprimeEtuAction0.actionPerformed((ActionEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fr.unice.gfarce.interGraph.SupprimeEtuAction", e);
      }
  }
}
