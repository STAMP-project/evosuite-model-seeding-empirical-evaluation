/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 29 14:05:19 GMT 2019
 */

package module;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.MissingResourceException;
import java.util.TreeSet;
import java.util.Vector;
import module.GameModule;
import module.Kernel;
import module.Message;
import module.MessageFactory;
import module.Module;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Kernel_ESTest extends Kernel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Kernel kernel0 = new Kernel();
      Module module0 = null;
      String string0 = null;
      try { 
        kernel0.unsubscribe((Module) null, (String) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // java.lang.NullPointerException
         //
         verifyException("module.Kernel", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Kernel kernel0 = new Kernel();
      String string0 = "DUMP";
      try { 
        kernel0.loadModule("DUMP");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // java.lang.ClassNotFoundException: Class 'DUMP.class' should be in target project, but could not be found!
         //
         verifyException("module.Kernel", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Kernel kernel0 = new Kernel();
      Vector<Module> vector0 = new Vector<Module>();
      String string0 = null;
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) null;
      Message message0 = MessageFactory.createErrorMessage((String) null, objectArray0);
      message0.sender = "+<sZPceT";
      message0.state = (-1610);
      message0.set((String) null, "+<sZPceT", objectArray0[0]);
      kernel0.sendMessageNotify(vector0, message0);
      String string1 = "usage: send HEAD BODY";
      try { 
        kernel0.loadModule("usage: send HEAD BODY");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // java.lang.ClassNotFoundException: Class 'usage: send HEAD BODY.class' should be in target project, but could not be found!
         //
         verifyException("module.Kernel", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Kernel kernel0 = new Kernel();
      kernel0.getThread();
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
  public void test04()  throws Throwable  {
      Kernel kernel0 = new Kernel();
      try { 
        kernel0.processMessage((Message) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("module.Kernel", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Kernel kernel0 = new Kernel();
      try { 
        kernel0.unregister((Module) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // mod=null
         //
         verifyException("module.Kernel", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Kernel kernel0 = new Kernel();
      kernel0.start();
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
  public void test07()  throws Throwable  {
      Kernel kernel0 = new Kernel();
      String string0 = null;
      TreeSet<Module> treeSet0 = new TreeSet<Module>();
      try { 
        kernel0.request((String) null, "file.separator");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Requests are not implemented
         //
         verifyException("module.Kernel", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Kernel kernel0 = new Kernel();
      String string0 = "R|K)r6a7K\"a";
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
  public void test09()  throws Throwable  {
      Kernel kernel0 = new Kernel();
      try { 
        kernel0.request((String) null, (String) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Requests are not implemented
         //
         verifyException("module.Kernel", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Kernel kernel0 = new Kernel();
      kernel0.getKernel();
      Kernel kernel1 = new Kernel();
      try { 
        kernel1.unloadModule("topics=");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // mod=topics=
         //
         verifyException("module.Kernel", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Kernel kernel0 = new Kernel();
      try { 
        kernel0.loadModule("C6-N@QT_M@hQr");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // java.lang.ClassNotFoundException: Class 'C6-N@QT_M@hQr.class' should be in target project, but could not be found!
         //
         verifyException("module.Kernel", e);
      }
  }
}
