/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 29 08:35:12 GMT 2019
 */

package nu.staldal.lagoon.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.util.Enumeration;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import nu.staldal.lagoon.core.LagoonException;
import nu.staldal.lagoon.core.LagoonProcessor;
import nu.staldal.lagoon.core.OutputEntry;
import nu.staldal.lagoon.core.PartEntry;
import nu.staldal.lagoon.core.Sitemap;
import nu.staldal.lagoon.core.SitemapEntry;
import nu.staldal.xtree.Element;
import nu.staldal.xtree.Text;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Sitemap_ESTest extends Sitemap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          MockFile mockFile0 = new MockFile("proeess");
          Element element0 = new Element("proeess", "sitemap");
          Sitemap sitemap0 = new Sitemap((LagoonProcessor) null, element0, mockFile0);
          OutputEntry outputEntry0 = sitemap0.lookupOutput("sitemap");
          assertNull(outputEntry0);
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockFile mockFile0 = new MockFile("proeess");
      Element element0 = new Element("proeess", "sitemap");
      Sitemap sitemap0 = new Sitemap((LagoonProcessor) null, element0, mockFile0);
      // Undeclared exception!
      try { 
        sitemap0.lookupPart((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockFile mockFile0 = new MockFile("proeess");
      Element element0 = new Element("proeess", "sitemap");
      Sitemap sitemap0 = new Sitemap((LagoonProcessor) null, element0, mockFile0);
      // Undeclared exception!
      try { 
        sitemap0.lookupEntry((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockFile mockFile0 = new MockFile("proeess");
      Element element0 = new Element("proeess", "sitemap");
      Sitemap sitemap0 = new Sitemap((LagoonProcessor) null, element0, mockFile0);
      sitemap0.init();
      // Undeclared exception!
      try { 
        sitemap0.init();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("nu.staldal.lagoon.core.Sitemap", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockFile mockFile0 = new MockFile("proeess");
      Element element0 = new Element("proeess", "sitemap");
      Sitemap sitemap0 = new Sitemap((LagoonProcessor) null, element0, mockFile0);
      // Undeclared exception!
      try { 
        sitemap0.getProperty((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Sitemap sitemap0 = null;
      try {
        sitemap0 = new Sitemap((LagoonProcessor) null, (Element) null, (File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("nu.staldal.lagoon.core.Sitemap", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockFile mockFile0 = new MockFile("proeess");
      Element element0 = new Element("proeess", "sitemap", 93);
      Sitemap sitemap0 = new Sitemap((LagoonProcessor) null, element0, mockFile0);
      Enumeration enumeration0 = sitemap0.getEntries();
      assertNotNull(enumeration0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockFile mockFile0 = new MockFile("proeess", "proeess");
      Element element0 = new Element("sitemap", "sitemap");
      Text text0 = new Text("proeess");
      element0.addChild(text0);
      Sitemap sitemap0 = new Sitemap((LagoonProcessor) null, element0, mockFile0);
      sitemap0.init();
      assertNull(sitemap0.getSiteName());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockFile mockFile0 = new MockFile("pPoeess");
      Element element0 = new Element("pPoeess", "sitemap", 68);
      Sitemap sitemap0 = new Sitemap((LagoonProcessor) null, element0, mockFile0);
      element0.addChild(element0);
      try { 
        sitemap0.init();
        fail("Expecting exception: LagoonException");
      
      } catch(LagoonException e) {
         //
         // Unknown entry in sitemap: sitemap
         //
         verifyException("nu.staldal.lagoon.core.Sitemap", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Element element0 = new Element("", "");
      MockFile mockFile0 = new MockFile("http://www.w3.org/XML/1998/namespace", "http://www.w3.org/XML/1998/namespace");
      Sitemap sitemap0 = null;
      try {
        sitemap0 = new Sitemap((LagoonProcessor) null, element0, mockFile0);
        fail("Expecting exception: LagoonException");
      
      } catch(Throwable e) {
         //
         // root element must be <sitemap>
         //
         verifyException("nu.staldal.lagoon.core.Sitemap", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockFile mockFile0 = new MockFile("proeess");
      Element element0 = new Element("proeess", "sitemap");
      Sitemap sitemap0 = new Sitemap((LagoonProcessor) null, element0, mockFile0);
      SitemapEntry sitemapEntry0 = sitemap0.lookupEntry("http://www.w3.org/XML/1998/namespace");
      assertNull(sitemapEntry0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockFile mockFile0 = new MockFile("proeess");
      Element element0 = new Element("proeess", "sitemap", 93);
      Sitemap sitemap0 = new Sitemap((LagoonProcessor) null, element0, mockFile0);
      // Undeclared exception!
      try { 
        sitemap0.lookupOutput((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockFile mockFile0 = new MockFile("proeess");
      Element element0 = new Element("proeess", "sitemap", 93);
      Sitemap sitemap0 = new Sitemap((LagoonProcessor) null, element0, mockFile0);
      PartEntry partEntry0 = sitemap0.lookupPart("");
      assertNull(partEntry0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockFile mockFile0 = new MockFile("proeess");
      Element element0 = new Element("proeess", "sitemap");
      Sitemap sitemap0 = new Sitemap((LagoonProcessor) null, element0, mockFile0);
      Enumeration enumeration0 = sitemap0.getTargets();
      assertNotNull(enumeration0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockFile mockFile0 = new MockFile("proeess");
      Element element0 = new Element("proeess", "sitemap");
      Sitemap sitemap0 = new Sitemap((LagoonProcessor) null, element0, mockFile0);
      String string0 = sitemap0.getProperty("_2IDa<zW5qr8]<SZ/g");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MockFile mockFile0 = new MockFile("proeess");
      Element element0 = new Element("proeess", "sitemap", 93);
      Sitemap sitemap0 = new Sitemap((LagoonProcessor) null, element0, mockFile0);
      sitemap0.destroy();
      assertNull(sitemap0.getSiteName());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockFile mockFile0 = new MockFile("proeess");
      Element element0 = new Element("proeess", "sitemap", 93);
      Sitemap sitemap0 = new Sitemap((LagoonProcessor) null, element0, mockFile0);
      String string0 = sitemap0.getSiteName();
      assertNull(string0);
  }
}
