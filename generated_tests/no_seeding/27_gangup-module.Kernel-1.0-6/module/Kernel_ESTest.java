/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 28 19:33:43 GMT 2019
 */

package module;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.MissingResourceException;
import module.GameModule;
import module.Kernel;
import module.Message;
import module.Module;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Kernel_ESTest extends Kernel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Kernel kernel0 = new Kernel();
      kernel0.getKernel();
      try { 
        kernel0.unloadModule((Module) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // mod=null
         //
         verifyException("module.Kernel", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Kernel kernel0 = new Kernel();
      kernel0.start();
      try { 
        kernel0.request("", "kS>SPYY>f#Up");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Requests are not implemented
         //
         verifyException("module.Kernel", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Kernel kernel0 = new Kernel();
      kernel0.getKernel();
      kernel0.unsubscribe((Module) null);
      GameModule gameModule0 = null;
      try {
        gameModule0 = new GameModule();
        fail("Expecting exception: MissingResourceException");
      
      } catch(MissingResourceException e) {
         //
         // Can't find bundle for base name gangup, locale en
         //
         verifyException("java.util.ResourceBundle", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Kernel kernel0 = new Kernel();
      try { 
        kernel0.unloadModule("");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // mod=
         //
         verifyException("module.Kernel", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Kernel kernel0 = new Kernel();
      try { 
        kernel0.sendMessage((Message) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // java.lang.NullPointerException
         //
         verifyException("module.Kernel", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Kernel kernel0 = new Kernel();
      kernel0.getKernel();
      String string0 = "";
      try { 
        kernel0.unloadModule("");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // mod=
         //
         verifyException("module.Kernel", e);
      }
  }
}