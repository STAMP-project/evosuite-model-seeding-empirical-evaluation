/*
 * This file was automatically generated by EvoSuite
 * Tue Jun 09 11:37:25 GMT 2020
 */

package com.google.gson.stream;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JsonWriter_ESTest extends JsonWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
      jsonWriter0.beginArray();
      JsonWriter jsonWriter1 = jsonWriter0.name("Infinity");
      // Undeclared exception!
      try { 
        jsonWriter1.beginArray();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Nesting problem.
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
      jsonWriter0.setHtmlSafe(true);
      JsonWriter jsonWriter1 = jsonWriter0.value("@7 TE^3+=l");
      assertFalse(jsonWriter1.isLenient());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
      JsonWriter jsonWriter1 = jsonWriter0.beginArray();
      // Undeclared exception!
      try { 
        jsonWriter1.endObject();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Nesting problem.
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(0);
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.beginObject();
      JsonWriter jsonWriter2 = jsonWriter0.name("MR[[`RUhme");
      jsonWriter2.value(0.0);
      jsonWriter1.setLenient(true);
      jsonWriter1.endObject();
      jsonWriter0.value(false);
      assertEquals("{\"MR[[`RUhme\":0.0}false", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
      jsonWriter0.setHtmlSafe(true);
      jsonWriter0.value(false);
      assertTrue(jsonWriter0.isHtmlSafe());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      doReturn((Writer) null, (Writer) null, (Writer) null).when(writer0).append(any(java.lang.CharSequence.class));
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
      jsonWriter0.setSerializeNulls(false);
      JsonWriter jsonWriter1 = jsonWriter0.beginObject();
      JsonWriter jsonWriter2 = jsonWriter0.name("oRw(lDPmpK'{wy5T?L");
      JsonWriter jsonWriter3 = jsonWriter2.value((-2564.9));
      jsonWriter1.name("oRw(lDPmpK'{wy5T?L");
      JsonWriter jsonWriter4 = jsonWriter3.value(false);
      assertSame(jsonWriter3, jsonWriter4);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setLenient(true);
      jsonWriter0.value("~bl9Qz,[J");
      assertEquals("\"~bl9Qz,[J\"", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setSerializeNulls(false);
      jsonWriter0.value("\"");
      assertEquals("\"\\\"\"", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      doReturn((Writer) null).when(writer0).append(any(java.lang.CharSequence.class));
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
      jsonWriter0.setHtmlSafe(true);
      Byte byte0 = Byte.valueOf((byte) (-77));
      jsonWriter0.value((Number) byte0);
      assertTrue(jsonWriter0.isHtmlSafe());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
      jsonWriter0.setSerializeNulls(false);
      JsonWriter jsonWriter1 = jsonWriter0.value((Number) null);
      assertFalse(jsonWriter1.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setLenient(true);
      Boolean boolean0 = new Boolean(false);
      jsonWriter0.value(boolean0);
      assertEquals("false", stringWriter0.toString());
      assertTrue(jsonWriter0.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setHtmlSafe(true);
      Boolean boolean0 = new Boolean(false);
      jsonWriter0.value(boolean0);
      assertEquals("false", stringWriter0.toString());
      assertTrue(jsonWriter0.isHtmlSafe());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
      jsonWriter0.setSerializeNulls(false);
      Boolean boolean0 = Boolean.valueOf("\"");
      JsonWriter jsonWriter1 = jsonWriter0.value(boolean0);
      assertFalse(jsonWriter1.isHtmlSafe());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
      jsonWriter0.setHtmlSafe(true);
      jsonWriter0.value(1565L);
      assertTrue(jsonWriter0.isHtmlSafe());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(0);
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.beginObject();
      JsonWriter jsonWriter2 = jsonWriter0.name("MR[[`RUhme");
      JsonWriter jsonWriter3 = jsonWriter2.value(0.0);
      jsonWriter1.setLenient(true);
      jsonWriter1.endObject();
      jsonWriter2.setSerializeNulls(false);
      jsonWriter3.value(805L);
      assertEquals("{\"MR[[`RUhme\":0.0}805", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      doReturn((Writer) null, (Writer) null).when(writer0).append(any(java.lang.CharSequence.class));
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
      jsonWriter0.setSerializeNulls(false);
      JsonWriter jsonWriter1 = jsonWriter0.beginObject();
      JsonWriter jsonWriter2 = jsonWriter1.name("\u2029");
      JsonWriter jsonWriter3 = jsonWriter2.value(0.0);
      assertFalse(jsonWriter3.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
      jsonWriter0.setHtmlSafe(true);
      jsonWriter0.nullValue();
      assertTrue(jsonWriter0.isHtmlSafe());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.beginObject();
      JsonWriter jsonWriter2 = jsonWriter0.name("MR[[`RUhme");
      jsonWriter2.value(0.0);
      jsonWriter1.setLenient(true);
      jsonWriter2.name("MR[[`RUhme");
      assertEquals("{\"MR[[`RUhme\":0.0", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      doReturn((Writer) null).when(writer0).append(any(java.lang.CharSequence.class));
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
      jsonWriter0.setLenient(true);
      JsonWriter jsonWriter1 = jsonWriter0.jsonValue("");
      assertTrue(jsonWriter1.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      doReturn((Writer) null).when(writer0).append(any(java.lang.CharSequence.class));
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
      jsonWriter0.setHtmlSafe(true);
      jsonWriter0.jsonValue("");
      assertTrue(jsonWriter0.isHtmlSafe());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      doReturn((Writer) null).when(writer0).append(any(java.lang.CharSequence.class));
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
      jsonWriter0.setSerializeNulls(false);
      JsonWriter jsonWriter1 = jsonWriter0.jsonValue("fZ");
      assertFalse(jsonWriter1.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
      jsonWriter0.setLenient(true);
      jsonWriter0.isLenient();
      assertTrue(jsonWriter0.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
      jsonWriter0.setHtmlSafe(true);
      boolean boolean0 = jsonWriter0.isHtmlSafe();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      doReturn((Writer) null, (Writer) null).when(writer0).append(any(java.lang.CharSequence.class));
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
      jsonWriter0.setHtmlSafe(true);
      JsonWriter jsonWriter1 = jsonWriter0.beginObject();
      JsonWriter jsonWriter2 = jsonWriter0.name("");
      jsonWriter2.value((-1110.5777996846));
      jsonWriter1.endObject();
      assertTrue(jsonWriter0.isHtmlSafe());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
      JsonWriter jsonWriter1 = jsonWriter0.beginArray();
      jsonWriter1.setLenient(true);
      JsonWriter jsonWriter2 = jsonWriter1.beginObject();
      jsonWriter0.endObject();
      JsonWriter jsonWriter3 = jsonWriter2.endArray();
      assertTrue(jsonWriter3.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
      JsonWriter jsonWriter1 = jsonWriter0.beginArray();
      jsonWriter0.setSerializeNulls(false);
      JsonWriter jsonWriter2 = jsonWriter1.beginObject();
      jsonWriter0.endObject();
      JsonWriter jsonWriter3 = jsonWriter2.endArray();
      assertFalse(jsonWriter3.isHtmlSafe());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
      jsonWriter0.setHtmlSafe(true);
      JsonWriter jsonWriter1 = jsonWriter0.beginArray();
      jsonWriter1.endArray();
      assertTrue(jsonWriter0.isHtmlSafe());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(0);
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.beginObject();
      JsonWriter jsonWriter2 = jsonWriter0.name("MR[[`RUhme");
      jsonWriter2.value(0.0);
      jsonWriter1.setLenient(true);
      jsonWriter1.endObject();
      jsonWriter2.setSerializeNulls(false);
      jsonWriter0.beginArray();
      assertEquals("{\"MR[[`RUhme\":0.0}[", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.beginObject();
      // Undeclared exception!
      try { 
        jsonWriter0.value(true);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Nesting problem.
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.nullValue();
      // Undeclared exception!
      try { 
        jsonWriter0.value("");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // JSON must have only one top-level value.
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.nullValue();
      // Undeclared exception!
      try { 
        jsonWriter1.value((Number) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // JSON must have only one top-level value.
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.nullValue();
      Boolean boolean0 = Boolean.TRUE;
      // Undeclared exception!
      try { 
        jsonWriter1.value(boolean0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // JSON must have only one top-level value.
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.beginObject();
      // Undeclared exception!
      try { 
        jsonWriter0.value(0.0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Nesting problem.
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      // Undeclared exception!
      try { 
        jsonWriter0.setIndent((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.nullValue();
      // Undeclared exception!
      try { 
        jsonWriter1.jsonValue("APUg&'MB}O");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // JSON must have only one top-level value.
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      doReturn((Writer) null).when(writer0).append(any(java.lang.CharSequence.class));
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
      jsonWriter0.beginObject();
      JsonWriter jsonWriter1 = jsonWriter0.name("oRw(lDPmpK'{wy5T?L");
      JsonWriter jsonWriter2 = jsonWriter1.beginObject();
      assertTrue(jsonWriter2.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.beginObject();
      JsonWriter jsonWriter1 = jsonWriter0.name("MR[[`RUhme");
      jsonWriter1.value(0.0);
      // Undeclared exception!
      try { 
        jsonWriter0.beginObject();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Nesting problem.
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
      jsonWriter0.beginObject();
      // Undeclared exception!
      try { 
        jsonWriter0.beginObject();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Nesting problem.
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setLenient(true);
      jsonWriter0.nullValue();
      jsonWriter0.nullValue();
      assertEquals("nullnull", stringWriter0.toString());
      assertTrue(jsonWriter0.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.beginObject();
      // Undeclared exception!
      try { 
        jsonWriter1.value(4492L);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Nesting problem.
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.beginArray();
      jsonWriter1.nullValue();
      jsonWriter1.beginObject();
      assertEquals("[null,{", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.beginArray();
      jsonWriter1.setIndent("u>j>2");
      jsonWriter1.nullValue();
      assertEquals("[\nu>j>2null", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      try { 
        jsonWriter0.close();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Incomplete document
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.nullValue();
      jsonWriter0.close();
      jsonWriter0.close();
      assertEquals("null", stringWriter0.toString());
      assertTrue(jsonWriter0.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.beginArray();
      try { 
        jsonWriter1.close();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Incomplete document
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.nullValue();
      jsonWriter1.close();
      // Undeclared exception!
      try { 
        jsonWriter1.flush();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // JsonWriter is closed.
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.flush();
      assertTrue(jsonWriter0.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setLenient(true);
      Byte byte0 = new Byte((byte) (-8));
      jsonWriter0.value((Number) byte0);
      assertTrue(jsonWriter0.isLenient());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setLenient(true);
      jsonWriter0.value(1283.29660969579);
      assertTrue(jsonWriter0.isLenient());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      Boolean boolean0 = Boolean.TRUE;
      jsonWriter0.value(boolean0);
      assertEquals("true", stringWriter0.toString());
      assertTrue(jsonWriter0.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.value((Boolean) null);
      assertEquals("null", stringWriter0.toString());
      assertTrue(jsonWriter0.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.value(true);
      assertEquals("true", stringWriter0.toString());
      assertTrue(jsonWriter0.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      assertTrue(jsonWriter0.getSerializeNulls());
      
      jsonWriter0.setSerializeNulls(false);
      jsonWriter0.name("");
      assertFalse(jsonWriter0.getSerializeNulls());
      
      jsonWriter0.nullValue();
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.name("Infinity");
      // Undeclared exception!
      try { 
        jsonWriter0.nullValue();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Nesting problem.
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.jsonValue((String) null);
      assertEquals("null", stringWriter0.toString());
      assertTrue(jsonWriter0.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.value((String) null);
      assertEquals("null", stringWriter0.toString());
      assertTrue(jsonWriter0.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.jsonValue("false");
      jsonWriter1.close();
      // Undeclared exception!
      try { 
        jsonWriter1.name("false");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // JsonWriter is closed.
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.name("\"Kpt9KUE\"wc");
      // Undeclared exception!
      try { 
        jsonWriter1.name("\"Kpt9KUE\"wc");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      // Undeclared exception!
      try { 
        jsonWriter0.name((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // name == null
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.nullValue();
      jsonWriter1.close();
      // Undeclared exception!
      try { 
        jsonWriter0.endArray();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // JsonWriter is closed.
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.beginArray();
      jsonWriter1.beginArray();
      JsonWriter jsonWriter2 = jsonWriter0.beginArray();
      JsonWriter jsonWriter3 = jsonWriter2.beginArray();
      JsonWriter jsonWriter4 = jsonWriter2.beginArray();
      jsonWriter0.beginArray();
      JsonWriter jsonWriter5 = jsonWriter0.beginArray();
      jsonWriter5.beginArray();
      JsonWriter jsonWriter6 = jsonWriter1.beginArray();
      JsonWriter jsonWriter7 = jsonWriter4.beginArray();
      jsonWriter4.beginArray();
      jsonWriter4.beginArray();
      JsonWriter jsonWriter8 = jsonWriter4.beginArray();
      jsonWriter5.beginArray();
      JsonWriter jsonWriter9 = jsonWriter8.beginArray();
      jsonWriter9.beginArray();
      jsonWriter7.beginArray();
      JsonWriter jsonWriter10 = jsonWriter7.beginArray();
      JsonWriter jsonWriter11 = jsonWriter10.beginArray();
      JsonWriter jsonWriter12 = jsonWriter0.beginArray();
      jsonWriter3.beginArray();
      jsonWriter7.beginArray();
      jsonWriter6.beginArray();
      jsonWriter4.beginArray();
      jsonWriter11.beginArray();
      JsonWriter jsonWriter13 = jsonWriter12.beginArray();
      jsonWriter7.beginArray();
      jsonWriter13.beginArray();
      jsonWriter7.beginArray();
      jsonWriter3.beginArray();
      jsonWriter12.beginArray();
      jsonWriter8.beginArray();
      assertEquals("[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.beginArray();
      jsonWriter0.name("[*MU'8=");
      // Undeclared exception!
      try { 
        jsonWriter0.endArray();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Dangling name: [*MU'8=
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setIndent("");
      assertTrue(jsonWriter0.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      JsonWriter jsonWriter0 = null;
      try {
        jsonWriter0 = new JsonWriter((Writer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // out == null
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      // Undeclared exception!
      try { 
        jsonWriter0.endObject();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Nesting problem.
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      boolean boolean0 = jsonWriter0.getSerializeNulls();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
      jsonWriter0.isLenient();
      assertTrue(jsonWriter0.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.isHtmlSafe();
      assertTrue(jsonWriter0.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
      assertTrue(jsonWriter0.getSerializeNulls());
      
      jsonWriter0.setSerializeNulls(false);
      boolean boolean0 = jsonWriter0.getSerializeNulls();
      assertFalse(boolean0);
  }
}