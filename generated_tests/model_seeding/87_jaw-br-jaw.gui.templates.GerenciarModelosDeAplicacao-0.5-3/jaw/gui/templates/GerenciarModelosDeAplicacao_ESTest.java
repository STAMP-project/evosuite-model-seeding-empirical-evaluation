/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 29 11:13:30 GMT 2019
 */

package jaw.gui.templates;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Frame;
import java.awt.HeadlessException;
import jaw.gui.templates.GerenciarModelosDeAplicacao;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GerenciarModelosDeAplicacao_ESTest extends GerenciarModelosDeAplicacao_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GerenciarModelosDeAplicacao gerenciarModelosDeAplicacao0 = null;
      try {
        gerenciarModelosDeAplicacao0 = new GerenciarModelosDeAplicacao((Frame) null, false);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }
}
