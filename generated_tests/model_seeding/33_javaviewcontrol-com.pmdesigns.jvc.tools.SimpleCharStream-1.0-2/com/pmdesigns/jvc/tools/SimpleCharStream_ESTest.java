/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 25 16:26:25 GMT 2019
 */

package com.pmdesigns.jvc.tools;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.pmdesigns.jvc.tools.SimpleCharStream;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PushbackInputStream;
import java.io.Reader;
import java.io.SequenceInputStream;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.util.Enumeration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SimpleCharStream_ESTest extends SimpleCharStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-8);
      byteArray0[1] = (byte) (-24);
      byteArray0[2] = (byte)11;
      byteArray0[3] = (byte) (-4);
      byteArray0[4] = (byte) (-2);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, (byte)11, (-409));
      simpleCharStream0.maxNextCharInd = (int) (byte)11;
      simpleCharStream0.getBeginLine();
      simpleCharStream0.BeginToken();
      SimpleCharStream simpleCharStream1 = null;
      try {
        simpleCharStream1 = new SimpleCharStream(byteArrayInputStream0, "", (byte)11, 0, (-2945));
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(Throwable e) {
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleCharStream simpleCharStream0 = new SimpleCharStream((Reader) null, 585, 0, 0);
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-2);
      byteArray0[1] = (byte) (-2);
      byteArray0[2] = (byte) (-2);
      byteArray0[3] = (byte) (-2);
      byteArray0[4] = (byte) (-2);
      byteArray0[5] = (byte) (-2);
      byteArray0[6] = (byte) (-2);
      byteArray0[7] = (byte) (-2);
      byteArray0[8] = (byte) (-2);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream1 = new SimpleCharStream(byteArrayInputStream0, (byte) (-2), (byte) (-2));
      // Undeclared exception!
      try { 
        simpleCharStream0.getBeginLine();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.pmdesigns.jvc.tools.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleCharStream simpleCharStream0 = new SimpleCharStream((Reader) null, 585, 0, 0);
      SimpleCharStream simpleCharStream1 = new SimpleCharStream((Reader) null);
      // Undeclared exception!
      try { 
        simpleCharStream0.BeginToken();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.pmdesigns.jvc.tools.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte)10;
      byteArray0[2] = (byte)10;
      byteArray0[3] = (byte) (-30);
      byteArray0[4] = (byte)91;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(bufferedInputStream0, (byte)10, (byte)91);
      simpleCharStream0.getBeginLine();
      simpleCharStream0.BeginToken();
      simpleCharStream0.readChar();
      bufferedInputStream0.markSupported();
      simpleCharStream0.getBeginColumn();
      simpleCharStream0.getLine();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-8);
      byteArray0[1] = (byte) (-8);
      byteArray0[2] = (byte)11;
      byteArray0[3] = (byte) (-4);
      byteArray0[4] = (byte) (-2);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, (byte)11, (-409));
      simpleCharStream0.maxNextCharInd = (int) (byte)11;
      simpleCharStream0.getBeginLine();
      simpleCharStream0.BeginToken();
      simpleCharStream0.readChar();
      simpleCharStream0.getEndColumn();
      simpleCharStream0.ExpandBuff(true);
      simpleCharStream0.getColumn();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleCharStream simpleCharStream0 = new SimpleCharStream((Reader) null, 585, 585, 585);
      // Undeclared exception!
      try { 
        simpleCharStream0.FillBuff();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.pmdesigns.jvc.tools.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-8);
      byteArray0[1] = (byte) (-8);
      byteArray0[2] = (byte)11;
      byteArray0[3] = (byte) (-4);
      byteArray0[4] = (byte) (-2);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, (byte)11, (-409));
      simpleCharStream0.maxNextCharInd = (int) (byte)11;
      simpleCharStream0.getBeginLine();
      simpleCharStream0.BeginToken();
      simpleCharStream0.UpdateLineColumn('\u0000');
      simpleCharStream0.getColumn();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(4096);
      SimpleCharStream simpleCharStream0 = null;
      try {
        simpleCharStream0 = new SimpleCharStream(pipedInputStream0, (String) null, (-132), (-132), (-9));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.pmdesigns.jvc.tools.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Reader reader0 = null;
      SimpleCharStream simpleCharStream0 = null;
      try {
        simpleCharStream0 = new SimpleCharStream((Reader) null, 585, (-47), (-47));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.pmdesigns.jvc.tools.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0);
      bufferedInputStream0.mark((-1084));
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(bufferedInputStream0, (-1084), (-1084), 0);
      simpleCharStream0.getTabSize((-2));
      // Undeclared exception!
      try { 
        simpleCharStream0.FillBuff();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte)10;
      byteArray0[2] = (byte)10;
      byteArray0[3] = (byte) (-30);
      byteArray0[4] = (byte)91;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(bufferedInputStream0, (byte)10, (byte)91);
      simpleCharStream0.getBeginLine();
      simpleCharStream0.BeginToken();
      simpleCharStream0.readChar();
      simpleCharStream0.getBeginColumn();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int int0 = 1;
      SimpleCharStream simpleCharStream0 = null;
      try {
        simpleCharStream0 = new SimpleCharStream((InputStream) null, 1, 1, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      SimpleCharStream simpleCharStream0 = null;
      try {
        simpleCharStream0 = new SimpleCharStream(pipedInputStream0, ";G{hTri;xKa+rb&m", 404, 404);
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(Throwable e) {
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      int int0 = 1;
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pipedInputStream0, 2, 1);
      simpleCharStream0.ReInit((InputStream) pipedInputStream0);
      simpleCharStream0.backup(1);
      simpleCharStream0.ExpandBuff(false);
      Reader reader0 = null;
      simpleCharStream0.ReInit((Reader) null);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      simpleCharStream0.ReInit((InputStream) pipedInputStream0);
      simpleCharStream0.backup(4096);
      char[] charArray0 = simpleCharStream0.buffer;
      pipedInputStream0.skip(0L);
      simpleCharStream0.GetSuffix(4077);
      simpleCharStream0.BeginToken();
      simpleCharStream0.adjustBeginLineColumn(4077, 4096);
      int int1 = 4086;
      PushbackInputStream pushbackInputStream0 = null;
      try {
        pushbackInputStream0 = new PushbackInputStream(pipedInputStream0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // size <= 0
         //
         verifyException("java.io.PushbackInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(4096);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pipedInputStream0, (-9), 1);
      simpleCharStream0.ReInit((InputStream) pipedInputStream0);
      simpleCharStream0.backup(4096);
      simpleCharStream0.ExpandBuff(false);
      simpleCharStream0.ReInit((InputStream) pipedInputStream0);
      simpleCharStream0.backup(758);
      simpleCharStream0.GetSuffix(4096);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, false);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, (byte) (-8), (byte) (-4));
      simpleCharStream0.getBeginLine();
      simpleCharStream0.BeginToken();
      simpleCharStream0.readChar();
      simpleCharStream0.getBeginColumn();
      simpleCharStream0.adjustBeginLineColumn(9, 2455);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)1;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte) (-98);
      byteArray0[4] = (byte) (-68);
      byteArray0[5] = (byte) (-11);
      byteArray0[6] = (byte)0;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(dataInputStream0);
      simpleCharStream0.getBeginColumn();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(4121);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pipedInputStream0, (-9), 1);
      // Undeclared exception!
      try { 
        simpleCharStream0.ReInit((InputStream) pipedInputStream0, (-1050), 4121, (-1656));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.pmdesigns.jvc.tools.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pipedInputStream0, (-991), (-991));
      try { 
        simpleCharStream0.ReInit((InputStream) pipedInputStream0, "", (-991), 4066);
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(UnsupportedEncodingException e) {
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(4096);
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pipedInputStream0, (String) null);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-4);
      byteArray0[1] = (byte)11;
      byteArray0[2] = (byte) (-4);
      byteArray0[3] = (byte) (-30);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, (-2730), 1, 1728);
      simpleCharStream0.FillBuff();
      StringReader stringReader0 = null;
      try {
        stringReader0 = new StringReader((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(4096);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pipedInputStream0, 4096, 1);
      simpleCharStream0.backup(4096);
      simpleCharStream0.ReInit((InputStream) pipedInputStream0, 4096, (-2522));
      simpleCharStream0.adjustBeginLineColumn(11, 1);
      // Undeclared exception!
      try { 
        simpleCharStream0.UpdateLineColumn('K');
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.pmdesigns.jvc.tools.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pipedInputStream0, (-991), (-991));
      simpleCharStream0.prevCharIsLF = true;
      // Undeclared exception!
      try { 
        simpleCharStream0.UpdateLineColumn('W');
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.pmdesigns.jvc.tools.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pipedInputStream0, 1, 4065);
      simpleCharStream0.ReInit((InputStream) pipedInputStream0);
      PipedInputStream pipedInputStream1 = new PipedInputStream();
      simpleCharStream0.ReInit((InputStream) pipedInputStream0);
      simpleCharStream0.backup((-5511));
      // Undeclared exception!
      try { 
        simpleCharStream0.GetSuffix(4056);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SimpleCharStream simpleCharStream0 = new SimpleCharStream((Reader) null, (-913), (-1));
      simpleCharStream0.backup((-1));
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-913), (-913));
      SimpleCharStream simpleCharStream1 = new SimpleCharStream(byteArrayInputStream0, (String) null, (-913), 10, 8);
      byteArrayInputStream0.markSupported();
      simpleCharStream1.ReInit((Reader) null, 2710, (-1), 8);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SimpleCharStream simpleCharStream0 = new SimpleCharStream((Reader) null, 4096, (-9));
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      simpleCharStream0.ReInit((InputStream) mockFileInputStream0);
      simpleCharStream0.backup(1600);
      simpleCharStream0.getLine();
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(4096);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pipedInputStream0, 2, 1);
      simpleCharStream0.ReInit((InputStream) pipedInputStream0);
      simpleCharStream0.backup(1);
      simpleCharStream0.ExpandBuff(false);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      simpleCharStream0.ReInit((InputStream) pipedInputStream0);
      simpleCharStream0.backup(2);
      char[] charArray0 = simpleCharStream0.buffer;
      simpleCharStream0.GetSuffix(4086);
      simpleCharStream0.BeginToken();
      simpleCharStream0.adjustBeginLineColumn(4096, 95);
      simpleCharStream0.ReInit((InputStream) pipedInputStream0, 0, (-2786), 4085);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pipedInputStream0, (-991), 1050);
      simpleCharStream0.GetImage();
      // Undeclared exception!
      try { 
        simpleCharStream0.getEndColumn();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.pmdesigns.jvc.tools.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SimpleCharStream simpleCharStream0 = new SimpleCharStream((Reader) null, 585, 0, 0);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "-hUPa8l+L%hK'{($");
      simpleCharStream0.Done();
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)50;
      byteArray0[1] = (byte)31;
      byteArray0[2] = (byte) (-56);
      byteArray0[4] = (byte)1;
      // Undeclared exception!
      try { 
        simpleCharStream0.adjustBeginLineColumn((-1535), 946);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.pmdesigns.jvc.tools.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SimpleCharStream simpleCharStream0 = new SimpleCharStream((Reader) null, 585, 0, 0);
      // Undeclared exception!
      try { 
        simpleCharStream0.FillBuff();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.pmdesigns.jvc.tools.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SimpleCharStream simpleCharStream0 = null;
      try {
        simpleCharStream0 = new SimpleCharStream((InputStream) null, "", 0, 2077, (-132));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      int int0 = 585;
      SimpleCharStream simpleCharStream0 = new SimpleCharStream((Reader) null, 585, 0, 0);
      byte[] byteArray0 = new byte[9];
      byte byte0 = (byte)50;
      byteArray0[0] = (byte)50;
      byteArray0[1] = (byte)31;
      byteArray0[2] = (byte) (-56);
      byteArray0[3] = (byte)1;
      byteArray0[4] = (byte)1;
      byteArray0[5] = (byte) (-32);
      simpleCharStream0.Done();
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      byteArrayInputStream0.close();
      // Undeclared exception!
      try { 
        simpleCharStream0.UpdateLineColumn('@');
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.pmdesigns.jvc.tools.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, (byte) (-8), (byte) (-4));
      simpleCharStream0.getBeginLine();
      simpleCharStream0.BeginToken();
      simpleCharStream0.readChar();
      simpleCharStream0.getBeginColumn();
      simpleCharStream0.adjustBeginLineColumn((-4), 4058);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SimpleCharStream simpleCharStream0 = new SimpleCharStream((Reader) null, 585, 0, 0);
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)50;
      byteArray0[1] = (byte)31;
      byte byte0 = (byte) (-56);
      byteArray0[2] = (byte) (-56);
      byteArray0[3] = (byte)1;
      byteArray0[4] = (byte)1;
      PipedInputStream pipedInputStream0 = new PipedInputStream(2141);
      simpleCharStream0.ReInit((InputStream) pipedInputStream0, (int) (byte)50, (int) (byte) (-56));
      try { 
        simpleCharStream0.FillBuff();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(4096);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pipedInputStream0, 4096, 1);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "x<)<::p 6<BFr~8");
      simpleCharStream0.backup(4096);
      simpleCharStream0.ReInit((InputStream) pipedInputStream0, 4096, (-2522));
      simpleCharStream0.backup((-442));
      // Undeclared exception!
      try { 
        simpleCharStream0.ReInit((InputStream) pipedInputStream0, 0, (-2522), (-1));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.pmdesigns.jvc.tools.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(4096);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pipedInputStream0, 2, 1);
      simpleCharStream0.ReInit((InputStream) pipedInputStream0);
      simpleCharStream0.backup(1);
      PipedInputStream pipedInputStream1 = new PipedInputStream();
      simpleCharStream0.setTabSize(1);
      pipedInputStream1.mark(1);
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      SimpleCharStream simpleCharStream1 = new SimpleCharStream(sequenceInputStream0);
      simpleCharStream0.BeginToken();
      pipedInputStream1.close();
      simpleCharStream0.GetImage();
      SimpleCharStream simpleCharStream2 = null;
      try {
        simpleCharStream2 = new SimpleCharStream(pipedInputStream1, "com.pmdesigns.jvc.tools.SimpleCharStream", (-262), 2492, (-1847));
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(Throwable e) {
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SimpleCharStream simpleCharStream0 = new SimpleCharStream((Reader) null, 585, 0, 0);
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)50;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0);
      SimpleCharStream simpleCharStream1 = new SimpleCharStream(pushbackInputStream0, (-1), (byte)50);
      simpleCharStream1.ExpandBuff(false);
      simpleCharStream0.ReInit((InputStream) pushbackInputStream0);
      simpleCharStream1.backup((byte)50);
      simpleCharStream1.GetSuffix(0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(4096);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pipedInputStream0, 4096, (-3366));
      simpleCharStream0.adjustBeginLineColumn(0, (-3366));
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
  public void test38()  throws Throwable  {
      SimpleCharStream simpleCharStream0 = new SimpleCharStream((Reader) null, 585, 0, 0);
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)50;
      byteArray0[1] = (byte)31;
      byteArray0[2] = (byte) (-56);
      byteArray0[3] = (byte)1;
      byteArray0[4] = (byte)1;
      byteArray0[5] = (byte) (-32);
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte) (-1);
      byteArray0[8] = (byte)10;
      byte[] byteArray1 = new byte[3];
      byteArray1[0] = (byte)50;
      byteArray1[1] = (byte)10;
      byteArray1[2] = (byte)0;
      // Undeclared exception!
      try { 
        simpleCharStream0.getBeginColumn();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.pmdesigns.jvc.tools.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Reader reader0 = null;
      int int0 = (-913);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream((Reader) null, (-913), (-1));
      simpleCharStream0.backup((-1));
      SimpleCharStream simpleCharStream1 = null;
      try {
        simpleCharStream1 = new SimpleCharStream((InputStream) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pipedInputStream0, (-991), 0);
      simpleCharStream0.GetImage();
      simpleCharStream0.getTabSize((-991));
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(4096);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pipedInputStream0, (-9), 1);
      simpleCharStream0.ReInit((InputStream) pipedInputStream0);
      simpleCharStream0.backup(4096);
      simpleCharStream0.ExpandBuff(false);
      simpleCharStream0.ReInit((InputStream) pipedInputStream0);
      simpleCharStream0.backup(4096);
      simpleCharStream0.GetSuffix(4096);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      SimpleCharStream simpleCharStream0 = null;
      try {
        simpleCharStream0 = new SimpleCharStream((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pipedInputStream0, (-991), (-991));
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(bufferedInputStream0);
      simpleCharStream0.ReInit((InputStream) pushbackInputStream0, (-2881), (-991));
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
  public void test44()  throws Throwable  {
      SimpleCharStream simpleCharStream0 = new SimpleCharStream((Reader) null, 585, 0, 0);
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)50;
      byteArray0[1] = (byte)31;
      byteArray0[2] = (byte) (-56);
      byteArray0[3] = (byte)1;
      byteArray0[4] = (byte)1;
      byteArray0[5] = (byte) (-32);
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte) (-1);
      byteArray0[8] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 262, (byte)0);
      byte[] byteArray1 = new byte[3];
      byteArray1[0] = (byte)50;
      byteArray1[1] = (byte)10;
      byteArray1[2] = (byte)0;
      byteArrayInputStream0.read(byteArray1);
      try { 
        simpleCharStream0.ReInit((InputStream) byteArrayInputStream0, "", (-1), 0, (int) (byte)1);
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(UnsupportedEncodingException e) {
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)0;
      byte byte0 = (byte)69;
      byteArray0[1] = (byte)69;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0);
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
  public void test46()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pipedInputStream0);
      simpleCharStream0.prevCharIsCR = false;
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      SimpleCharStream simpleCharStream0 = new SimpleCharStream((Reader) null, (-2751), 0);
      int[] intArray0 = new int[0];
      simpleCharStream0.bufline = intArray0;
      simpleCharStream0.ReInit((Reader) null);
      SequenceInputStream sequenceInputStream0 = null;
      try {
        sequenceInputStream0 = new SequenceInputStream((Enumeration<? extends InputStream>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.SequenceInputStream", e);
      }
  }
}