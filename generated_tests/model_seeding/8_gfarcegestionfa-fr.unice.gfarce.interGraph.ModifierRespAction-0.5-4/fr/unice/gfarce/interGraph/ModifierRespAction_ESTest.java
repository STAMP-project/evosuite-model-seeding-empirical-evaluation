/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 29 11:40:39 GMT 2019
 */

package fr.unice.gfarce.interGraph;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import fr.unice.gfarce.interGraph.FenetrePrincipale;
import fr.unice.gfarce.interGraph.ModifierRespAction;
import fr.unice.gfarce.main.Controler;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ModifierRespAction_ESTest extends ModifierRespAction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ModifierRespAction modifierRespAction0 = new ModifierRespAction((FenetrePrincipale) null, "Creer responsable", (Controler) null);
      JPasswordField jPasswordField0 = new JPasswordField("");
      FenetrePrincipale.outputNomResp = (JTextField) jPasswordField0;
      FenetrePrincipale.outputPrenomResp = (JTextField) jPasswordField0;
      // Undeclared exception!
      try { 
        modifierRespAction0.actionPerformed((ActionEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fr.unice.gfarce.interGraph.ModifierRespAction", e);
      }
  }
}