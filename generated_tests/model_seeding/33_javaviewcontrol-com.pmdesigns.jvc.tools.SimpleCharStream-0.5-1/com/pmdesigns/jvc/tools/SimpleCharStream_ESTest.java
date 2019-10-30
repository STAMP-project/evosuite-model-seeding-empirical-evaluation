/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 29 08:30:11 GMT 2019
 */

package com.pmdesigns.jvc.tools;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.pmdesigns.jvc.tools.SimpleCharStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.Reader;
import java.io.SequenceInputStream;
import java.io.StringReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SimpleCharStream_ESTest extends SimpleCharStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimpleCharStream simpleCharStream0 = new SimpleCharStream((Reader) null, 706, (-1255));
      StringReader stringReader0 = new StringReader("V//gV}xi\"v#W/K1i`Rn");
      stringReader0.skip((-1255));
      SimpleCharStream simpleCharStream1 = new SimpleCharStream(stringReader0, 530, 530);
      simpleCharStream1.GetImage();
      char[] charArray0 = new char[3];
      charArray0[0] = 'R';
      charArray0[1] = ']';
      charArray0[2] = 's';
      simpleCharStream0.buffer = charArray0;
      simpleCharStream1.Done();
      simpleCharStream1.backup(10);
      // Undeclared exception!
      try { 
        simpleCharStream1.GetImage();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pipedInputStream0);
      pipedOutputStream0.flush();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(pipedInputStream0, pipedInputStream0);
      byte byte0 = (byte) (-30);
      int int0 = (-1312);
      // Undeclared exception!
      try { 
        simpleCharStream0.ReInit((InputStream) pipedInputStream0, 1, (-1312), (-1312));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.pmdesigns.jvc.tools.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 0, 0, 4096);
      char[] charArray0 = new char[7];
      charArray0[0] = 'F';
      charArray0[1] = '_';
      charArray0[2] = '3';
      charArray0[3] = ']';
      simpleCharStream0.buffer = charArray0;
      charArray0[4] = 'C';
      charArray0[5] = '.';
      charArray0[6] = 'K';
      simpleCharStream0.buffer = charArray0;
      // Undeclared exception!
      try { 
        simpleCharStream0.BeginToken();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringReader stringReader0 = new StringReader("V//gV}xi\"v#W/K1i`Rn");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 1322, 1322);
      simpleCharStream0.GetImage();
      simpleCharStream0.backup(10);
      simpleCharStream0.GetImage();
      simpleCharStream0.adjustBeginLineColumn(0, 4085);
      simpleCharStream0.BeginToken();
      simpleCharStream0.getLine();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringReader stringReader0 = new StringReader("hE");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 18, 18, 4096);
      simpleCharStream0.BeginToken();
      simpleCharStream0.adjustBeginLineColumn(0, (-310));
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      simpleCharStream0.adjustBeginLineColumn(64, (-310));
      simpleCharStream0.ReInit((Reader) stringReader0, 4071, 4075);
      // Undeclared exception!
      try { 
        simpleCharStream0.getColumn();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.pmdesigns.jvc.tools.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      int int0 = 0;
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 0, 0, 0);
      // Undeclared exception!
      try { 
        simpleCharStream0.BeginToken();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.pmdesigns.jvc.tools.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pipedInputStream0, 54, 54);
      simpleCharStream0.GetSuffix(3184);
      simpleCharStream0.GetImage();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)8;
      byteArray0[3] = (byte)1;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      byteArrayInputStream0.reset();
      byteArrayInputStream0.read();
      byteArrayInputStream0.read(byteArray0);
      byteArrayInputStream0.mark(2730);
      byteArrayInputStream0.markSupported();
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0);
      simpleCharStream0.ExpandBuff(false);
      // Undeclared exception!
      try { 
        simpleCharStream0.readChar();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      StringReader stringReader0 = new StringReader("]~MTB");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      // Undeclared exception!
      try { 
        simpleCharStream0.getEndLine();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.pmdesigns.jvc.tools.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      InputStream inputStream0 = null;
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      int int0 = 1383;
      SimpleCharStream simpleCharStream0 = null;
      try {
        simpleCharStream0 = new SimpleCharStream((InputStream) null, 1383, 1383, 1383);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      InputStream inputStream0 = null;
      int int0 = 1;
      SimpleCharStream simpleCharStream0 = null;
      try {
        simpleCharStream0 = new SimpleCharStream((InputStream) null, (-785), 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = "VW'8oGE3=:f`";
      StringReader stringReader0 = new StringReader("VW'8oGE3=:f`");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      simpleCharStream0.ReInit((Reader) stringReader0);
      simpleCharStream0.BeginToken();
      simpleCharStream0.UpdateLineColumn('l');
      try { 
        simpleCharStream0.FillBuff();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.pmdesigns.jvc.tools.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleCharStream simpleCharStream0 = new SimpleCharStream((Reader) null, 706, (-1255));
      // Undeclared exception!
      try { 
        simpleCharStream0.UpdateLineColumn('k');
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.pmdesigns.jvc.tools.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int int0 = 701;
      int int1 = (-1255);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream((Reader) null, 701, (-1255));
      // Undeclared exception!
      try { 
        simpleCharStream0.UpdateLineColumn('v');
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.pmdesigns.jvc.tools.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringReader stringReader0 = new StringReader("UW[1y K#OAEyXAAZ");
      stringReader0.read();
      stringReader0.close();
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 85, 85);
      simpleCharStream0.getTabSize(85);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 0, 0, 0);
      // Undeclared exception!
      try { 
        simpleCharStream0.BeginToken();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.pmdesigns.jvc.tools.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StringReader stringReader0 = new StringReader("VW'8oGE3=:f`");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      simpleCharStream0.ReInit((Reader) stringReader0);
      simpleCharStream0.backup(0);
      simpleCharStream0.getBeginColumn();
      // Undeclared exception!
      try { 
        simpleCharStream0.readChar();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4096
         //
         verifyException("com.pmdesigns.jvc.tools.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      StringReader stringReader0 = new StringReader("");
      stringReader0.mark(2223);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (-872), 10);
      simpleCharStream0.GetSuffix(2048);
      simpleCharStream0.GetImage();
  }
}