/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 18 01:25:37 GMT 2019
 */

package org.sat4j.reader;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PrintWriter;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.junit.runner.RunWith;
import org.sat4j.reader.AAGReader;
import org.sat4j.specs.ISolver;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AAGReader_ESTest extends AAGReader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AAGReader aAGReader0 = new AAGReader((ISolver) null);
      Enumeration<ByteArrayInputStream> enumeration0 = (Enumeration<ByteArrayInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      // Undeclared exception!
      aAGReader0.parseInstance((InputStream) sequenceInputStream0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AAGReader aAGReader0 = new AAGReader((ISolver) null);
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(dataInputStream0, 1);
      // Undeclared exception!
      try { 
        aAGReader0.parseInstance((InputStream) pushbackInputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AAGReader aAGReader0 = new AAGReader((ISolver) null);
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-554), 1166);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0);
      // Undeclared exception!
      try { 
        aAGReader0.parseInstance((InputStream) bufferedInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AAGReader aAGReader0 = new AAGReader((ISolver) null);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      try { 
        aAGReader0.parseInstance((InputStream) pipedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      AAGReader aAGReader0 = new AAGReader((ISolver) null);
      byte[] byteArray0 = new byte[7];
      byteArray0[1] = (byte)32;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      try { 
        aAGReader0.parseInstance((InputStream) byteArrayInputStream0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parsing ErrorAAG format only!
         //
         verifyException("org.sat4j.reader.AAGReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      AAGReader aAGReader0 = new AAGReader((ISolver) null);
      MockFile mockFile0 = new MockFile("Q6&=", "");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFile0);
      aAGReader0.decode((int[]) null, (PrintWriter) mockPrintWriter0);
      assertFalse(aAGReader0.isVerbose());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      AAGReader aAGReader0 = new AAGReader((ISolver) null);
      int[] intArray0 = new int[7];
      String string0 = aAGReader0.decode(intArray0);
      assertEquals("", string0);
  }
}