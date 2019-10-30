/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 25 21:08:13 GMT 2019
 */

package module;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.MissingResourceException;
import java.util.PriorityQueue;
import java.util.TreeSet;
import module.ClientNetworkModule;
import module.ConfigModule;
import module.IRCProxyModule;
import module.Kernel;
import module.Logger;
import module.Message;
import module.MessageFactory;
import module.Module;
import module.ServerNetworkModule;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Kernel_ESTest extends Kernel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Kernel kernel0 = new Kernel();
      Module module0 = null;
      String string0 = "kw$DK`J~N:(jLj,p$EZ";
      kernel0.subscribe((Module) null, "kw$DK`J~N:(jLj,p$EZ");
      Message message0 = MessageFactory.createMessage((String) null, (String) null, (Object) null);
      message0.header = "kw$DK`J~N:(jLj,p$EZ";
      try { 
        message0.send();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // modnull,msg=Message[id=0,session=0,head=kw$DK`J~N:(jLj,p$EZ,recip=null,sender=null,state=1,ttl=3000,time=1392409281320,body=null]: no source module
         //
         verifyException("module.Message", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Kernel kernel0 = new Kernel();
      try { 
        kernel0.register((Module) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // mod=null
         //
         verifyException("module.Kernel", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Kernel kernel0 = new Kernel();
      kernel0.unsubscribe((Module) null);
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) null;
      objectArray0[1] = (Object) null;
      objectArray0[2] = (Object) null;
      objectArray0[3] = (Object) null;
      Message message0 = MessageFactory.createWarningMessage((String) null, objectArray0);
      try { 
        message0.sendFrom(kernel0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: modnull,msg=Message[id=0,session=0,head=WARNING,recip=*,sender=null,state=1,ttl=3000,time=1392409281320,body=Reading string from locale failed: key=null
         // This probably means that you have an old or otherwise
         // inaccurate locale file (maybe it's missing altogether)
         // or that the classpath does not contain the directory.]
         //
         verifyException("module.Kernel", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Kernel kernel0 = new Kernel();
      String string0 = "_GUI_WARNING_SKINLF_EXCEPTION";
      Message message0 = new Message();
      kernel0.receiveMessage(message0);
      try { 
        kernel0.loadModule("_GUI_WARNING_SKINLF_EXCEPTION");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // java.lang.ClassNotFoundException: Class '_GUI_WARNING_SKINLF_EXCEPTION.class' should be in target project, but could not be found!
         //
         verifyException("module.Kernel", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Kernel kernel0 = new Kernel();
      String string0 = "";
      TreeSet<ConfigModule> treeSet0 = new TreeSet<ConfigModule>();
      PriorityQueue<Module> priorityQueue0 = new PriorityQueue<Module>((Collection<? extends Module>) treeSet0);
      Kernel kernel1 = new Kernel();
      kernel1.getKernel();
      ClientNetworkModule clientNetworkModule0 = null;
      try {
        clientNetworkModule0 = new ClientNetworkModule((Kernel) null);
        fail("Expecting exception: MissingResourceException");
      
      } catch(MissingResourceException e) {
         //
         // Can't find bundle for base name gangup, locale en
         //
         verifyException("java.util.ResourceBundle", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Kernel kernel0 = new Kernel();
      kernel0.getThread();
      IRCProxyModule iRCProxyModule0 = null;
      try {
        iRCProxyModule0 = new IRCProxyModule();
        fail("Expecting exception: MissingResourceException");
      
      } catch(MissingResourceException e) {
         //
         // Can't find bundle for base name gangup, locale en
         //
         verifyException("java.util.ResourceBundle", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Kernel kernel0 = new Kernel();
      try { 
        kernel0.loadModule("REGISTERED");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // java.lang.ClassNotFoundException: Class 'REGISTERED.class' should be in target project, but could not be found!
         //
         verifyException("module.Kernel", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Kernel kernel0 = new Kernel();
      Message message0 = new Message();
      Message message1 = new Message();
      try { 
        kernel0.request(message1);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Sorry, requests are not implemented in Kernel
         //
         verifyException("module.Kernel", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Kernel kernel0 = new Kernel();
      String string0 = "Not registered!";
      try { 
        kernel0.unloadModule("Not registered!");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // mod=Not registered!
         //
         verifyException("module.Kernel", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Kernel kernel0 = new Kernel();
      Object[] objectArray0 = new Object[3];
      objectArray0[0] = (Object) "Not registered!";
      objectArray0[1] = (Object) "Not registered!";
      objectArray0[2] = (Object) "Not registered!";
      Message message0 = MessageFactory.createErrorMessage("Not registered!", objectArray0);
      message0.reply(objectArray0[2]);
      Logger logger0 = null;
      try {
        logger0 = new Logger();
        fail("Expecting exception: MissingResourceException");
      
      } catch(MissingResourceException e) {
         //
         // Can't find bundle for base name gangup, locale en
         //
         verifyException("java.util.ResourceBundle", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Kernel kernel0 = new Kernel();
      Kernel kernel1 = new Kernel();
      kernel1.getKernel();
      ClientNetworkModule clientNetworkModule0 = null;
      try {
        clientNetworkModule0 = new ClientNetworkModule((Kernel) null);
        fail("Expecting exception: MissingResourceException");
      
      } catch(MissingResourceException e) {
         //
         // Can't find bundle for base name gangup, locale en
         //
         verifyException("java.util.ResourceBundle", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Kernel kernel0 = new Kernel();
      kernel0.start();
      ServerNetworkModule serverNetworkModule0 = null;
      try {
        serverNetworkModule0 = new ServerNetworkModule();
        fail("Expecting exception: MissingResourceException");
      
      } catch(MissingResourceException e) {
         //
         // Can't find bundle for base name gangup, locale en
         //
         verifyException("java.util.ResourceBundle", e);
      }
  }
}