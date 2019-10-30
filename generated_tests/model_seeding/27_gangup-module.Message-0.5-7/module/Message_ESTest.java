/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 29 15:04:41 GMT 2019
 */

package module;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import module.Kernel;
import module.Message;
import module.MessageFactory;
import module.Module;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import state.Action;
import state.ActionFactory;
import util.ObjectManager;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Message_ESTest extends Message_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Message message0 = MessageFactory.createConnectionDroppedMessage(77, ",head=");
      message0.sessionID = 10L;
      try { 
        message0.send();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // modnull,msg=Message[id=0,session=10,head=DROPPED,recip=*,sender=null,state=1,ttl=3000,time=1392409281320,body=ID: 77 IP: ,head=]: no source module
         //
         verifyException("module.Message", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Message message0 = MessageFactory.createErrorMessage("K#aGxi+,\"n-4#V&bNX", (Object[]) null);
      boolean boolean0 = message0.received();
      assertEquals("ERROR", message0.getHeader());
      assertEquals("*", message0.getRecipient());
      assertFalse(boolean0);
      assertEquals(0L, message0.getSID());
      assertEquals(3000L, message0.getTTL());
      assertEquals(1, message0.getState());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Message message0 = MessageFactory.createConnectionDroppedMessage(0, "ICv$dR+eG+vH.uU]o]M");
      Message message1 = message0.reply("ICv$dR+eG+vH.uU]o]M");
      message1.reply(message0);
      assertEquals(2, message0.getRefCount());
      assertEquals(1, message1.getState());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Message message0 = new Message("", (String) null, (Object) null);
      message0.setDelivered(false);
      assertEquals(1, message0.getState());
      assertEquals(3000L, message0.getTTL());
      assertEquals(0L, message0.getSID());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Message message0 = MessageFactory.createMessage("file.separator", (Object) "file.separator");
      message0.setDelivered(true);
      message0.setDelivered(true);
      assertTrue(message0.delivered());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Message message0 = new Message();
      message0.setHeader("\"TC[]f$,ucV:l");
      assertEquals("\"TC[]f$,ucV:l", message0.getHeader());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Message message0 = new Message("", (String) null, (Object) null);
      message0.set("", (String) null, "");
      assertEquals(1L, message0.getID());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Message message0 = new Message();
      Object[] objectArray0 = new Object[6];
      Message message1 = MessageFactory.createWarningMessage(",head=", objectArray0);
      message1.consume();
      MessageFactory.createMessage("", "XBz@%XTx5yGDzuG~", (Object) message0);
      message1.reply(objectArray0[5]);
      assertEquals(1L, message1.getID());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Message message0 = new Message();
      long long0 = message0.getTimeStamp();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Message message0 = MessageFactory.createMessage("71Uhh[Hd}", "?q[v1|wGk2)!l_g\u0003l", (Object) "?q[v1|wGk2)!l_g\u0003l");
      assertEquals(3000L, message0.getTTL());
      
      message0.timetolive = 0L;
      long long0 = message0.getTTL();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Message message0 = MessageFactory.createMessage("71Uhh[Hd}", "?q[v1|wGk2)!l_g\u0003l", (Object) "?q[v1|wGk2)!l_g\u0003l");
      assertEquals(1, message0.getState());
      
      message0.state = 0;
      int int0 = message0.getState();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Message message0 = new Message("", "");
      message0.state = (-861);
      int int0 = message0.getState();
      assertEquals((-861), int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Message message0 = MessageFactory.createMessage("file.separator", (Object) "file.separator");
      message0.sessionID = (-2413L);
      long long0 = message0.getSID();
      assertEquals((-2413L), long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Message message0 = new Message();
      String string0 = message0.getRecipient();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Message message0 = MessageFactory.createConnectionDroppedMessage(0, "ICv$dR+eG+vH.uU]o]M");
      Message message1 = message0.reply("ICv$dR+eG+vH.uU]o]M");
      long long0 = message1.getID();
      assertEquals(0L, message1.getSID());
      assertEquals(1, message1.getState());
      assertEquals("DROPPED", message1.getHeader());
      assertEquals(3000L, message1.getTTL());
      assertEquals(1, message0.getState());
      assertEquals(3000L, message0.getTTL());
      assertEquals("*", message0.getRecipient());
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      Message message0 = MessageFactory.createErrorMessage("B.I8j|$R|^gqHdux", objectArray0);
      message0.clone();
      assertEquals("ERROR", message0.getHeader());
      assertEquals(3000L, message0.getTTL());
      assertEquals(0L, message0.getSID());
      assertEquals(1, message0.getState());
      assertEquals("*", message0.getRecipient());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Message message0 = new Message();
      Message message1 = message0.clone();
      assertEquals(0, Message.UNDEFINED);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Message message0 = new Message();
      // Undeclared exception!
      try { 
        message0.sendTo((Module) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("module.Message", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Message message0 = new Message();
      Kernel kernel0 = new Kernel();
      try { 
        message0.send((Module) kernel0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // java.lang.NullPointerException
         //
         verifyException("module.Kernel", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ActionFactory actionFactory0 = ActionFactory.getInstance();
      Message message0 = new Message(actionFactory0);
      Action action0 = actionFactory0.createObject();
      message0.setBody(action0);
      assertEquals(2, action0.getRefCount());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Message message0 = new Message();
      Object object0 = new Object();
      message0.setBody(object0);
      assertEquals(0, message0.getState());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Message message0 = new Message();
      String string0 = message0.toString();
      assertEquals("Message[id=0,session=0,head=null,recip=null,sender=null,state=0,ttl=0,time=0,body=null]", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Message message0 = MessageFactory.createMessage("", (String) null, (Object) "");
      Message message1 = new Message("state.ActionFactory", "8=w %2ftJ", message0);
      message1.ref();
      assertEquals(2, message0.getRefCount());
      
      message1.unref();
      assertEquals("state.ActionFactory", message1.getHeader());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Message message0 = new Message();
      boolean boolean0 = message0.received();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Message message0 = MessageFactory.createMessage("file.separator", (Object) "file.separator");
      message0.setDelivered(true);
      boolean boolean0 = message0.delivered();
      assertEquals(5, message0.getState());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Message message0 = new Message();
      boolean boolean0 = message0.delivered();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Message message0 = new Message();
      message0.setDelivered(false);
      assertEquals(0, message0.getState());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Message message0 = new Message();
      Object object0 = message0.getBody();
      assertEquals("", object0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      Message message0 = MessageFactory.createWarningMessage(",head=", objectArray0);
      Object object0 = message0.getBody();
      assertEquals(0L, message0.getSID());
      assertEquals(1, message0.getState());
      assertEquals("*", message0.getRecipient());
      assertEquals(3000L, message0.getTTL());
      assertEquals("WARNING", message0.getHeader());
      assertEquals("Reading string from locale failed: key=,head=\nThis probably means that you have an old or otherwise\ninaccurate locale file (maybe it's missing altogether)\nor that the classpath does not contain the directory.", object0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Message message0 = new Message();
      String string0 = message0.getHeader();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Object object0 = new Object();
      Message message0 = MessageFactory.createMessage("1", "sort", object0);
      String string0 = message0.getHeader();
      assertEquals(3000L, message0.getTTL());
      assertEquals(0L, message0.getSID());
      assertEquals(1, message0.getState());
      assertNotNull(string0);
      assertEquals("sort", message0.getRecipient());
      assertEquals("1", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      Message message0 = MessageFactory.createErrorMessage("", objectArray0);
      long long0 = message0.getTTL();
      assertEquals(3000L, long0);
      assertEquals(0L, message0.getSID());
      assertEquals(1, message0.getState());
      assertEquals("*", message0.getRecipient());
      assertEquals("ERROR", message0.getHeader());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      Message message0 = MessageFactory.createErrorMessage("", objectArray0);
      assertEquals("*", message0.getRecipient());
      
      message0.setRecipient("xw\":.XVg");
      assertEquals("xw\":.XVg", message0.getRecipient());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Message message0 = MessageFactory.createMessage((String) null, (Object) null);
      String string0 = message0.getRecipient();
      assertEquals(3000L, message0.getTTL());
      assertNotNull(string0);
      assertEquals(0L, message0.getSID());
      assertEquals(1, message0.getState());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Message message0 = new Message((ObjectManager) null);
      // Undeclared exception!
      try { 
        message0.send((Module) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("module.Message", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Message message0 = new Message();
      long long0 = message0.getID();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Message message0 = new Message();
      message0.setSender("pf6)lOlC=f\"3WT[>?");
      assertFalse(message0.received());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      Message message0 = MessageFactory.createErrorMessage("B.I8j|$R|^gqHdux", objectArray0);
      Kernel kernel0 = new Kernel();
      message0.sendTo(kernel0);
      assertEquals("ERROR", message0.getHeader());
      assertEquals(3000L, message0.getTTL());
      assertEquals(0L, message0.getSID());
      assertEquals(1, message0.getState());
      assertEquals("*", message0.getRecipient());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      Message message0 = MessageFactory.createErrorMessage("B.I8j|$R|^gqHdux", objectArray0);
      long long0 = message0.getSID();
      assertEquals("ERROR", message0.getHeader());
      assertEquals(0L, long0);
      assertEquals("*", message0.getRecipient());
      assertEquals(1, message0.getState());
      assertEquals(3000L, message0.getTTL());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Message message0 = MessageFactory.createConnectionDroppedMessage(0, "");
      int int0 = message0.getState();
      assertEquals(0L, message0.getSID());
      assertEquals(3000L, message0.getTTL());
      assertEquals("DROPPED", message0.getHeader());
      assertEquals(1, int0);
      assertEquals("*", message0.getRecipient());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      Message message0 = MessageFactory.createErrorMessage("B.I8j|$R|^gqHdux", objectArray0);
      String string0 = message0.getSender();
      assertEquals("*", message0.getRecipient());
      assertEquals(3000L, message0.getTTL());
      assertEquals(0L, message0.getSID());
      assertEquals(1, message0.getState());
      assertNull(string0);
      assertEquals("ERROR", message0.getHeader());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      Message message0 = MessageFactory.createErrorMessage("B.I8j|$R|^gqHdux", objectArray0);
      long long0 = message0.getTimeStamp();
      assertEquals(1392409281320L, long0);
      assertEquals(3000L, message0.getTTL());
      assertEquals("*", message0.getRecipient());
      assertEquals(0L, message0.getSID());
      assertEquals(1, message0.getState());
      assertEquals("ERROR", message0.getHeader());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Message message0 = new Message();
      message0.reply(message0);
      assertFalse(message0.getIsConsumed());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Message message0 = new Message();
      // Undeclared exception!
      try { 
        message0.sendFrom((Module) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("module.Message", e);
      }
  }
}
