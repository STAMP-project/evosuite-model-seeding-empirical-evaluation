/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 25 11:04:24 GMT 2019
 */

package module;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashSet;
import java.util.LinkedHashSet;
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
  public void test0()  throws Throwable  {
      Kernel kernel0 = new Kernel();
      Message message0 = new Message();
      Message message1 = new Message();
      message1.consume();
      message1.toString();
      message1.toString();
      try { 
        kernel0.sendMessage(message1);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // java.lang.NullPointerException
         //
         verifyException("module.Kernel", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Kernel kernel0 = new Kernel();
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) "_BATTLE_MESSAGE";
      Message message0 = MessageFactory.createErrorMessage("_BATTLE_MESSAGE", objectArray0);
      message0.setHeader("_BATTLE_MESSAGE");
      try { 
        kernel0.sendMessage(message0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: modnull,msg=Message[id=0,session=0,head=_BATTLE_MESSAGE,recip=*,sender=null,state=1,ttl=3000,time=1392409281320,body=Reading string from locale failed: key=_BATTLE_MESSAGE
         // This probably means that you have an old or otherwise
         // inaccurate locale file (maybe it's missing altogether)
         // or that the classpath does not contain the directory.]
         //
         verifyException("module.Kernel", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Kernel kernel0 = new Kernel();
      String string0 = "";
      Kernel kernel1 = new Kernel();
      kernel1.unsubscribe((Module) kernel0, "");
      kernel1.info();
      try { 
        kernel0.unregister(kernel1);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // mod=module.Kernel@4: Not registered!
         //
         verifyException("module.Kernel", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
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
  public void test4()  throws Throwable  {
      Kernel kernel0 = new Kernel();
      kernel0.start();
      LinkedHashSet<GameModule> linkedHashSet0 = new LinkedHashSet<GameModule>();
      HashSet<Module> hashSet0 = new HashSet<Module>(linkedHashSet0);
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) "_BATTLE_MESSAGE";
      Message message0 = MessageFactory.createErrorMessage("_BATTLE_MESSAGE", objectArray0);
      message0.setHeader("_BATTLE_MESSAGE");
      kernel0.sendMessageNotify(hashSet0, message0);
      try { 
        kernel0.request("", "");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Requests are not implemented
         //
         verifyException("module.Kernel", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Kernel kernel0 = new Kernel();
      Kernel kernel1 = new Kernel();
      kernel1.info();
      kernel0.register(kernel1);
      try { 
        kernel0.request(":+n3N", ":+n3N");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Requests are not implemented
         //
         verifyException("module.Kernel", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Kernel kernel0 = new Kernel();
      String string0 = "UNLOAD ";
      try { 
        kernel0.loadModule("UNLOAD ");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // java.lang.ClassNotFoundException: Class 'UNLOAD .class' should be in target project, but could not be found!
         //
         verifyException("module.Kernel", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Kernel kernel0 = new Kernel();
      try { 
        kernel0.loadModule("module.ModuleSubscriptionException");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // java.lang.InstantiationException: module.ModuleSubscriptionException
         //
         verifyException("module.Kernel", e);
      }
  }
}