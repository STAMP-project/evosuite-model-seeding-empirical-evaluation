/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 06 13:12:38 GMT 2019
 */

package jaw.gui.templates;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.HeadlessException;
import jaw.gui.templates.CriarModeloDeAplicacao;
import jaw.template.ModeloDeAplicacao;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CriarModeloDeAplicacao_ESTest extends CriarModeloDeAplicacao_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CriarModeloDeAplicacao criarModeloDeAplicacao0 = null;
      try {
        criarModeloDeAplicacao0 = new CriarModeloDeAplicacao();
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ModeloDeAplicacao modeloDeAplicacao0 = new ModeloDeAplicacao();
      CriarModeloDeAplicacao criarModeloDeAplicacao0 = null;
      try {
        criarModeloDeAplicacao0 = new CriarModeloDeAplicacao(modeloDeAplicacao0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }
}
