/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 19 15:57:27 GMT 2019
 */

package org.ow2.proactive.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.PrintStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;
import org.ow2.proactive.utils.BoundedStringWriter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BoundedStringWriter_ESTest extends BoundedStringWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BoundedStringWriter boundedStringWriter0 = new BoundedStringWriter((PrintStream) null, 1459);
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        boundedStringWriter0.write(charArray0, 1437, 2001);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BoundedStringWriter boundedStringWriter0 = new BoundedStringWriter((PrintStream) null, 0);
      StringBuilder stringBuilder0 = boundedStringWriter0.getBuilder();
      stringBuilder0.append((Object) null);
      // Undeclared exception!
      try { 
        boundedStringWriter0.append('d');
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.ow2.proactive.utils.BoundedStringWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PrintStream printStream0 = mock(PrintStream.class, new ViolatedAssumptionAnswer());
      BoundedStringWriter boundedStringWriter0 = new BoundedStringWriter(printStream0, 2);
      boundedStringWriter0.append('>');
      boundedStringWriter0.append('w');
      boundedStringWriter0.append('');
      assertEquals("w", boundedStringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PrintStream printStream0 = mock(PrintStream.class, new ViolatedAssumptionAnswer());
      BoundedStringWriter boundedStringWriter0 = new BoundedStringWriter(printStream0, 1);
      boundedStringWriter0.write(",LWs59s1v!N,O=pA#", 1, 1);
      boundedStringWriter0.toString();
      assertEquals("L", boundedStringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PrintStream printStream0 = mock(PrintStream.class, new ViolatedAssumptionAnswer());
      BoundedStringWriter boundedStringWriter0 = new BoundedStringWriter(printStream0, 1);
      boundedStringWriter0.setContentBuffer((StringBuilder) null);
      StringBuilder stringBuilder0 = boundedStringWriter0.getBuilder();
      assertNull(stringBuilder0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BoundedStringWriter boundedStringWriter0 = new BoundedStringWriter((PrintStream) null, (-1916));
      // Undeclared exception!
      try { 
        boundedStringWriter0.write((char[]) null, 2189, 2189);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PrintStream printStream0 = mock(PrintStream.class, new ViolatedAssumptionAnswer());
      BoundedStringWriter boundedStringWriter0 = new BoundedStringWriter(printStream0, 1);
      boundedStringWriter0.setContentBuffer((StringBuilder) null);
      char[] charArray0 = new char[9];
      // Undeclared exception!
      try { 
        boundedStringWriter0.write(charArray0, (-1), 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.ow2.proactive.utils.BoundedStringWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("uQd,TCasLrb%`R,!/C");
      BoundedStringWriter boundedStringWriter0 = new BoundedStringWriter(mockPrintStream0, 0);
      char[] charArray0 = new char[9];
      boundedStringWriter0.write(charArray0, 1, 1);
      assertEquals("", boundedStringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PrintStream printStream0 = mock(PrintStream.class, new ViolatedAssumptionAnswer());
      BoundedStringWriter boundedStringWriter0 = new BoundedStringWriter(printStream0, 1);
      boundedStringWriter0.write(",LWs59s1v!N,O=pA#", 1, 1);
      boundedStringWriter0.append('D');
      assertEquals("D", boundedStringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BoundedStringWriter boundedStringWriter0 = new BoundedStringWriter((PrintStream) null, 181);
      boundedStringWriter0.close();
      assertEquals("", boundedStringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BoundedStringWriter boundedStringWriter0 = new BoundedStringWriter((PrintStream) null, 0);
      boundedStringWriter0.flush();
      assertEquals("", boundedStringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BoundedStringWriter boundedStringWriter0 = new BoundedStringWriter((PrintStream) null, (-776));
      boundedStringWriter0.setContentBuffer((StringBuilder) null);
      // Undeclared exception!
      try { 
        boundedStringWriter0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.ow2.proactive.utils.BoundedStringWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BoundedStringWriter boundedStringWriter0 = new BoundedStringWriter((PrintStream) null, (-776));
      String string0 = boundedStringWriter0.toString();
      assertEquals("", string0);
  }
}