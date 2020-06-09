/*
 * This file was automatically generated by EvoSuite
 * Tue Jun 09 13:43:29 GMT 2020
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
      doReturn((Writer) null, (Writer) null, (Writer) null).when(writer0).append(any(java.lang.CharSequence.class));
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
      JsonWriter jsonWriter1 = jsonWriter0.beginObject();
      JsonWriter jsonWriter2 = jsonWriter1.name("");
      jsonWriter2.jsonValue("");
      JsonWriter jsonWriter3 = jsonWriter2.name("");
      jsonWriter3.beginArray();
      JsonWriter jsonWriter4 = jsonWriter3.name("2]3/NaS^pexZMC,GFn");
      // Undeclared exception!
      try { 
        jsonWriter4.nullValue();
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
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.value("Y\"e?Ejgp\"umV%@NO'");
      assertEquals("\"Y\\\"e?Ejgp\\\"umV%@NO'\"", stringWriter0.toString());
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
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
      jsonWriter0.setLenient(true);
      JsonWriter jsonWriter1 = jsonWriter0.value(false);
      assertTrue(jsonWriter1.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setHtmlSafe(true);
      jsonWriter0.value(true);
      assertEquals("true", stringWriter0.toString());
      assertTrue(jsonWriter0.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setSerializeNulls(false);
      jsonWriter0.beginObject();
      jsonWriter0.name("");
      jsonWriter0.jsonValue("");
      jsonWriter0.name("Infinity");
      jsonWriter0.value(false);
      assertFalse(jsonWriter0.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
      assertTrue(jsonWriter0.getSerializeNulls());
      
      jsonWriter0.setSerializeNulls(false);
      jsonWriter0.value((String) null);
      assertFalse(jsonWriter0.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      doReturn((Writer) null).when(writer0).append(any(java.lang.CharSequence.class));
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
      jsonWriter0.setHtmlSafe(true);
      Long long0 = new Long(0L);
      jsonWriter0.value((Number) long0);
      assertTrue(jsonWriter0.isHtmlSafe());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      assertTrue(jsonWriter0.getSerializeNulls());
      
      jsonWriter0.setSerializeNulls(false);
      Float float0 = new Float((-1.0F));
      jsonWriter0.value((Number) float0);
      assertFalse(jsonWriter0.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.beginObject();
      JsonWriter jsonWriter1 = jsonWriter0.name("[[{");
      jsonWriter0.jsonValue("[[{");
      jsonWriter0.name("[[{");
      jsonWriter1.setLenient(true);
      Boolean boolean0 = Boolean.valueOf("%<4wg");
      jsonWriter0.value(boolean0);
      assertEquals("{\"[[{\":[[{,\"[[{\":false", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setHtmlSafe(true);
      Boolean boolean0 = new Boolean("KxiKWl;W~");
      jsonWriter0.value(boolean0);
      assertEquals("false", stringWriter0.toString());
      assertTrue(jsonWriter0.isHtmlSafe());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setSerializeNulls(false);
      jsonWriter0.beginObject();
      jsonWriter0.name(")0");
      jsonWriter0.jsonValue(")0");
      jsonWriter0.name("Infinity");
      Boolean boolean0 = Boolean.valueOf("");
      jsonWriter0.value(boolean0);
      assertEquals("{\")0\":)0,\"Infinity\":false", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.beginObject();
      JsonWriter jsonWriter1 = jsonWriter0.name("[[{");
      jsonWriter0.jsonValue("[[{");
      jsonWriter0.name("[[{");
      jsonWriter1.setLenient(true);
      jsonWriter0.value((-1L));
      assertEquals("{\"[[{\":[[{,\"[[{\":-1", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setHtmlSafe(true);
      jsonWriter0.value((-1L));
      assertTrue(jsonWriter0.isHtmlSafe());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.beginObject();
      jsonWriter0.name("[[{");
      jsonWriter0.jsonValue("[[{");
      jsonWriter0.name("[[{");
      jsonWriter0.setSerializeNulls(false);
      jsonWriter1.beginObject();
      jsonWriter0.name("[[{");
      jsonWriter1.value((-2118L));
      assertFalse(jsonWriter1.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      doReturn((Writer) null, (Writer) null).when(writer0).append(any(java.lang.CharSequence.class));
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
      JsonWriter jsonWriter1 = jsonWriter0.beginObject();
      jsonWriter0.setHtmlSafe(true);
      JsonWriter jsonWriter2 = jsonWriter1.name("");
      JsonWriter jsonWriter3 = jsonWriter2.value(2876.81249);
      assertTrue(jsonWriter3.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setSerializeNulls(false);
      jsonWriter0.beginObject();
      jsonWriter0.name("");
      jsonWriter0.jsonValue("");
      jsonWriter0.name("Infinity");
      jsonWriter0.value(2275.856889436303);
      assertEquals("{\"\":,\"Infinity\":2275.856889436303", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      doReturn((Writer) null, (Writer) null, (Writer) null).when(writer0).append(any(java.lang.CharSequence.class));
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
      JsonWriter jsonWriter1 = jsonWriter0.beginObject();
      JsonWriter jsonWriter2 = jsonWriter1.name("");
      jsonWriter2.jsonValue("");
      JsonWriter jsonWriter3 = jsonWriter2.name("");
      jsonWriter3.beginArray();
      jsonWriter2.setLenient(true);
      JsonWriter jsonWriter4 = jsonWriter3.name("2]3/NaS^pexZMC,GFn");
      assertTrue(jsonWriter4.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setLenient(true);
      JsonWriter jsonWriter1 = jsonWriter0.jsonValue("");
      assertTrue(jsonWriter1.getSerializeNulls());
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setHtmlSafe(true);
      jsonWriter0.jsonValue("`?Udc:]LG");
      assertEquals("`?Udc:]LG", stringWriter0.toString());
      assertTrue(jsonWriter0.isHtmlSafe());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
      jsonWriter0.setLenient(true);
      jsonWriter0.isLenient();
      assertTrue(jsonWriter0.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setHtmlSafe(true);
      boolean boolean0 = jsonWriter0.isHtmlSafe();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
      assertTrue(jsonWriter0.getSerializeNulls());
      
      jsonWriter0.setSerializeNulls(false);
      boolean boolean0 = jsonWriter0.getSerializeNulls();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.beginObject();
      JsonWriter jsonWriter1 = jsonWriter0.name("\r");
      JsonWriter jsonWriter2 = jsonWriter1.jsonValue("");
      JsonWriter jsonWriter3 = jsonWriter0.name("I");
      jsonWriter1.setLenient(true);
      jsonWriter2.beginObject();
      jsonWriter3.endObject();
      assertEquals("{\"\\r\":,\"I\":{}", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setSerializeNulls(false);
      JsonWriter jsonWriter1 = jsonWriter0.beginObject();
      JsonWriter jsonWriter2 = jsonWriter0.name("\r");
      jsonWriter2.jsonValue("");
      jsonWriter1.name("\r");
      jsonWriter2.nullValue();
      jsonWriter2.endObject();
      assertEquals("{\"\\r\":}", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.beginObject();
      JsonWriter jsonWriter2 = jsonWriter0.name("\r");
      jsonWriter2.jsonValue("");
      jsonWriter0.name("I");
      JsonWriter jsonWriter3 = jsonWriter2.beginArray();
      jsonWriter3.setLenient(true);
      jsonWriter1.endArray();
      assertEquals("{\"\\r\":,\"I\":[]", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
      JsonWriter jsonWriter1 = jsonWriter0.beginArray();
      jsonWriter1.setHtmlSafe(true);
      jsonWriter1.endArray();
      assertTrue(jsonWriter1.isHtmlSafe());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.beginArray();
      jsonWriter1.setSerializeNulls(false);
      jsonWriter1.endArray();
      assertEquals("[]", stringWriter0.toString());
      assertFalse(jsonWriter0.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setHtmlSafe(true);
      jsonWriter0.beginObject();
      assertTrue(jsonWriter0.isHtmlSafe());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
      jsonWriter0.setLenient(true);
      JsonWriter jsonWriter1 = jsonWriter0.beginArray();
      assertTrue(jsonWriter1.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.beginArray();
      JsonWriter jsonWriter2 = jsonWriter0.beginObject();
      JsonWriter jsonWriter3 = jsonWriter1.name("\r");
      JsonWriter jsonWriter4 = jsonWriter3.jsonValue("");
      jsonWriter4.setHtmlSafe(true);
      jsonWriter2.name("\r");
      jsonWriter3.nullValue();
      jsonWriter3.endObject();
      jsonWriter3.beginArray();
      assertEquals("[{\"\\r\":,\"\\r\":null},[", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
      jsonWriter0.nullValue();
      // Undeclared exception!
      try { 
        jsonWriter0.value(false);
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
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
      JsonWriter jsonWriter1 = jsonWriter0.nullValue();
      // Undeclared exception!
      try { 
        jsonWriter1.value("%Vt%$]S");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // JSON must have only one top-level value.
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.nullValue();
      // Undeclared exception!
      try { 
        jsonWriter0.value((Number) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // JSON must have only one top-level value.
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
      jsonWriter0.value("/");
      Boolean boolean0 = new Boolean("/");
      // Undeclared exception!
      try { 
        jsonWriter0.value(boolean0);
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
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
      jsonWriter0.nullValue();
      // Undeclared exception!
      try { 
        jsonWriter0.value(0L);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // JSON must have only one top-level value.
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
      JsonWriter jsonWriter1 = jsonWriter0.beginObject();
      // Undeclared exception!
      try { 
        jsonWriter1.value(874.018911);
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
  public void test38()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      doReturn((Writer) null, (Writer) null).when(writer0).append(any(java.lang.CharSequence.class));
      doReturn((Writer) null).when(writer0).append(anyChar());
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
      JsonWriter jsonWriter1 = jsonWriter0.beginArray();
      jsonWriter1.jsonValue("`?Udc:]LG");
      jsonWriter0.beginObject();
      JsonWriter jsonWriter2 = jsonWriter0.name("KxiKWl;W~");
      jsonWriter0.value("");
      // Undeclared exception!
      try { 
        jsonWriter2.jsonValue("`?Udc:]LG");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Nesting problem.
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      doReturn((Writer) null).when(writer0).append(any(java.lang.CharSequence.class));
      doReturn((Writer) null).when(writer0).append(anyChar());
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
      jsonWriter0.beginArray();
      jsonWriter0.value((-5.0));
      JsonWriter jsonWriter1 = jsonWriter0.beginObject();
      assertTrue(jsonWriter1.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.beginArray();
      JsonWriter jsonWriter2 = jsonWriter0.beginArray();
      jsonWriter2.beginArray();
      JsonWriter jsonWriter3 = jsonWriter1.beginArray();
      JsonWriter jsonWriter4 = jsonWriter3.beginArray();
      jsonWriter0.beginObject();
      jsonWriter0.name("java.lang.Byte@0000000003");
      assertEquals("[[[[[{", stringWriter0.toString());
      
      JsonWriter jsonWriter5 = jsonWriter4.beginObject();
      JsonWriter jsonWriter6 = jsonWriter3.name("java.lang.Byte@0000000003");
      jsonWriter5.beginArray();
      jsonWriter4.beginArray();
      JsonWriter jsonWriter7 = jsonWriter5.beginArray();
      jsonWriter4.beginArray();
      JsonWriter jsonWriter8 = jsonWriter2.beginArray();
      JsonWriter jsonWriter9 = jsonWriter8.beginArray();
      JsonWriter jsonWriter10 = jsonWriter0.beginArray();
      jsonWriter2.beginArray();
      jsonWriter6.beginArray();
      jsonWriter9.beginArray();
      jsonWriter10.beginArray();
      jsonWriter1.beginArray();
      JsonWriter jsonWriter11 = jsonWriter10.beginArray();
      JsonWriter jsonWriter12 = jsonWriter10.beginArray();
      JsonWriter jsonWriter13 = jsonWriter7.beginArray();
      jsonWriter9.beginArray();
      JsonWriter jsonWriter14 = jsonWriter12.beginArray();
      jsonWriter9.beginArray();
      jsonWriter13.beginArray();
      JsonWriter jsonWriter15 = jsonWriter14.beginArray();
      jsonWriter15.beginArray();
      jsonWriter11.beginArray();
      jsonWriter4.beginArray();
      jsonWriter3.beginArray();
      jsonWriter1.beginArray();
      assertTrue(jsonWriter0.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
      jsonWriter0.setLenient(true);
      jsonWriter0.nullValue();
      assertTrue(jsonWriter0.isLenient());
      
      jsonWriter0.value("=");
      assertTrue(jsonWriter0.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.beginObject();
      // Undeclared exception!
      try { 
        jsonWriter0.beginArray();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Nesting problem.
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.beginObject();
      jsonWriter0.name("yo0;W1MgZmNF2FI(}G^");
      jsonWriter1.nullValue();
      jsonWriter0.name("yo0;W1MgZmNF2FI(}G^");
      jsonWriter0.beginObject();
      assertEquals("{\"yo0;W1MgZmNF2FI(}G^\":null,\"yo0;W1MgZmNF2FI(}G^\":{", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.beginArray();
      jsonWriter1.setIndent("java.lang.Long@0000000002");
      assertEquals("[", stringWriter0.toString());
      
      jsonWriter1.nullValue();
      assertTrue(jsonWriter0.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
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
  public void test46()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.nullValue();
      jsonWriter1.close();
      jsonWriter0.close();
      assertEquals("null", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
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
  public void test48()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.nullValue();
      jsonWriter1.close();
      // Undeclared exception!
      try { 
        jsonWriter0.flush();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // JsonWriter is closed.
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.flush();
      assertTrue(jsonWriter0.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setLenient(true);
      Long long0 = new Long(0L);
      jsonWriter0.value((Number) long0);
      assertTrue(jsonWriter0.isLenient());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
      Boolean boolean0 = Boolean.TRUE;
      JsonWriter jsonWriter1 = jsonWriter0.value(boolean0);
      assertTrue(jsonWriter1.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.value((Boolean) null);
      assertEquals("null", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.name("E");
      // Undeclared exception!
      try { 
        jsonWriter1.nullValue();
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
      jsonWriter0.nullValue();
      jsonWriter0.close();
      // Undeclared exception!
      try { 
        jsonWriter0.name("java.lang.Integer@0000000002");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // JsonWriter is closed.
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
      JsonWriter jsonWriter1 = jsonWriter0.name("");
      // Undeclared exception!
      try { 
        jsonWriter1.name("");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
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
  public void test58()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.nullValue();
      jsonWriter1.close();
      // Undeclared exception!
      try { 
        jsonWriter0.nullValue();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // JsonWriter is closed.
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.beginObject();
      jsonWriter1.name("ErmE'U*lef'Ov nR");
      // Undeclared exception!
      try { 
        jsonWriter0.endObject();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Dangling name: ErmE'U*lef'Ov nR
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setIndent("");
      assertTrue(jsonWriter0.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
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
  public void test62()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
      JsonWriter jsonWriter1 = jsonWriter0.beginObject();
      // Undeclared exception!
      try { 
        jsonWriter1.beginObject();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Nesting problem.
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
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
  public void test64()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
      // Undeclared exception!
      try { 
        jsonWriter0.endArray();
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
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
      jsonWriter0.isHtmlSafe();
      assertTrue(jsonWriter0.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setSerializeNulls(false);
      jsonWriter0.beginObject();
      jsonWriter0.name("");
      JsonWriter jsonWriter1 = jsonWriter0.jsonValue("");
      jsonWriter0.name("Infinity");
      jsonWriter1.beginArray();
      assertEquals("{\"\":,\"Infinity\":[", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setLenient(true);
      jsonWriter0.value(1.0);
      assertEquals("1.0", stringWriter0.toString());
      assertTrue(jsonWriter0.isLenient());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setHtmlSafe(true);
      jsonWriter0.value("y");
      assertEquals("\"y\"", stringWriter0.toString());
  }
}
