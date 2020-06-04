/*
 * This file was automatically generated by EvoSuite
 * Wed Jun 03 20:55:31 GMT 2020
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
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.beginArray();
      jsonWriter0.name("");
      // Undeclared exception!
      try { 
        jsonWriter1.jsonValue("");
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
      jsonWriter0.value("b\"]P}K3Rttud\"K?>}Es");
      assertEquals("\"b\\\"]P}K3Rttud\\\"K?>}Es\"", stringWriter0.toString());
      assertTrue(jsonWriter0.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
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
      JsonWriter jsonWriter1 = jsonWriter0.value(true);
      assertTrue(jsonWriter1.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.beginArray();
      JsonWriter jsonWriter1 = jsonWriter0.beginObject();
      jsonWriter1.setHtmlSafe(true);
      JsonWriter jsonWriter2 = jsonWriter1.endObject();
      jsonWriter2.value(false);
      assertTrue(jsonWriter1.isHtmlSafe());
      assertEquals("[{},false", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
      jsonWriter0.setSerializeNulls(false);
      JsonWriter jsonWriter1 = jsonWriter0.value(false);
      assertFalse(jsonWriter1.isHtmlSafe());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
      jsonWriter0.setSerializeNulls(false);
      JsonWriter jsonWriter1 = jsonWriter0.value("");
      assertSame(jsonWriter0, jsonWriter1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      doReturn((Writer) null).when(writer0).append(any(java.lang.CharSequence.class));
      doReturn((Writer) null).when(writer0).append(anyChar());
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
      jsonWriter0.beginArray();
      JsonWriter jsonWriter1 = jsonWriter0.beginObject();
      jsonWriter1.setHtmlSafe(true);
      JsonWriter jsonWriter2 = jsonWriter1.endObject();
      Float float0 = new Float(0.0);
      jsonWriter2.value((Number) float0);
      assertTrue(jsonWriter1.isHtmlSafe());
      assertTrue(jsonWriter0.isHtmlSafe());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      doReturn((Writer) null).when(writer0).append(any(java.lang.CharSequence.class));
      doReturn((Writer) null).when(writer0).append(anyChar());
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
      JsonWriter jsonWriter1 = jsonWriter0.beginArray();
      JsonWriter jsonWriter2 = jsonWriter0.beginObject();
      jsonWriter1.setSerializeNulls(false);
      JsonWriter jsonWriter3 = jsonWriter2.endObject();
      Float float0 = new Float(0.0);
      JsonWriter jsonWriter4 = jsonWriter3.value((Number) float0);
      assertSame(jsonWriter0, jsonWriter4);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      doReturn((Writer) null).when(writer0).append(anyChar());
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
      jsonWriter0.beginArray();
      JsonWriter jsonWriter1 = jsonWriter0.beginObject();
      jsonWriter1.setHtmlSafe(true);
      jsonWriter1.endObject();
      Boolean boolean0 = Boolean.valueOf("`YxBF#V{Q 4/?V[d1");
      jsonWriter0.value(boolean0);
      assertTrue(jsonWriter0.isHtmlSafe());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
      JsonWriter jsonWriter1 = jsonWriter0.beginObject();
      jsonWriter0.setLenient(true);
      JsonWriter jsonWriter2 = jsonWriter1.endObject();
      jsonWriter0.setSerializeNulls(false);
      JsonWriter jsonWriter3 = jsonWriter2.value((Boolean) true);
      assertSame(jsonWriter3, jsonWriter1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
      jsonWriter0.setLenient(true);
      JsonWriter jsonWriter1 = jsonWriter0.value((-630L));
      assertTrue(jsonWriter1.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setHtmlSafe(true);
      jsonWriter0.value(0L);
      assertTrue(jsonWriter0.isHtmlSafe());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
      jsonWriter0.setSerializeNulls(false);
      JsonWriter jsonWriter1 = jsonWriter0.value((-1L));
      assertFalse(jsonWriter1.isLenient());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setHtmlSafe(true);
      jsonWriter0.value(321.4431636413541);
      assertEquals("321.4431636413541", stringWriter0.toString());
      assertTrue(jsonWriter0.isHtmlSafe());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      doReturn((Writer) null).when(writer0).append(any(java.lang.CharSequence.class));
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
      jsonWriter0.setSerializeNulls(false);
      JsonWriter jsonWriter1 = jsonWriter0.value((-5544.53889));
      assertFalse(jsonWriter1.isHtmlSafe());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
      jsonWriter0.setLenient(true);
      JsonWriter jsonWriter1 = jsonWriter0.nullValue();
      assertTrue(jsonWriter1.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
      jsonWriter0.setHtmlSafe(true);
      jsonWriter0.nullValue();
      assertTrue(jsonWriter0.isHtmlSafe());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setLenient(true);
      JsonWriter jsonWriter1 = jsonWriter0.name("java.lang.Integer@0000000002");
      assertTrue(jsonWriter1.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setSerializeNulls(false);
      JsonWriter jsonWriter1 = jsonWriter0.name("e]D`VS:^");
      assertFalse(jsonWriter1.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      doReturn((Writer) null).when(writer0).append(any(java.lang.CharSequence.class));
      doReturn((Writer) null).when(writer0).append(anyChar());
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
      jsonWriter0.beginArray();
      JsonWriter jsonWriter1 = jsonWriter0.beginObject();
      jsonWriter1.setHtmlSafe(true);
      JsonWriter jsonWriter2 = jsonWriter1.endObject();
      jsonWriter2.jsonValue("`YxBF#V{Q 4/?V[d1");
      assertTrue(jsonWriter1.isHtmlSafe());
      assertTrue(jsonWriter0.isHtmlSafe());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      doReturn((Writer) null).when(writer0).append(any(java.lang.CharSequence.class));
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
      jsonWriter0.setSerializeNulls(false);
      JsonWriter jsonWriter1 = jsonWriter0.jsonValue("");
      assertFalse(jsonWriter1.isHtmlSafe());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
      jsonWriter0.setLenient(true);
      jsonWriter0.isLenient();
      assertTrue(jsonWriter0.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
      jsonWriter0.setHtmlSafe(true);
      boolean boolean0 = jsonWriter0.isHtmlSafe();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
      jsonWriter0.setSerializeNulls(false);
      boolean boolean0 = jsonWriter0.getSerializeNulls();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.beginArray();
      JsonWriter jsonWriter2 = jsonWriter0.beginObject();
      jsonWriter1.setLenient(true);
      jsonWriter2.endObject();
      jsonWriter0.endArray();
      assertEquals("[{}]", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.beginArray();
      JsonWriter jsonWriter1 = jsonWriter0.beginObject();
      jsonWriter1.setHtmlSafe(true);
      jsonWriter1.endObject();
      jsonWriter0.endArray();
      assertTrue(jsonWriter0.isHtmlSafe());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.beginArray();
      jsonWriter1.setSerializeNulls(false);
      jsonWriter1.endArray();
      assertEquals("[]", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setLenient(true);
      jsonWriter0.beginObject();
      assertEquals("{", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.beginObject();
      jsonWriter1.setHtmlSafe(true);
      jsonWriter1.name("java.lang.Integer@0000000002");
      assertEquals("{", stringWriter0.toString());
      
      jsonWriter0.beginObject();
      assertTrue(jsonWriter0.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      doReturn((Writer) null).when(writer0).append(anyChar());
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
      JsonWriter jsonWriter1 = jsonWriter0.beginArray();
      JsonWriter jsonWriter2 = jsonWriter0.beginObject();
      jsonWriter1.setSerializeNulls(false);
      JsonWriter jsonWriter3 = jsonWriter2.endObject();
      JsonWriter jsonWriter4 = jsonWriter3.beginObject();
      assertSame(jsonWriter2, jsonWriter4);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
      JsonWriter jsonWriter1 = jsonWriter0.beginObject();
      jsonWriter0.setLenient(true);
      JsonWriter jsonWriter2 = jsonWriter1.endObject();
      JsonWriter jsonWriter3 = jsonWriter2.beginArray();
      assertTrue(jsonWriter3.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      doReturn((Writer) null).when(writer0).append(anyChar());
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
      jsonWriter0.beginArray();
      JsonWriter jsonWriter1 = jsonWriter0.beginObject();
      jsonWriter1.setHtmlSafe(true);
      JsonWriter jsonWriter2 = jsonWriter1.endObject();
      jsonWriter2.beginArray();
      assertTrue(jsonWriter1.isHtmlSafe());
      assertTrue(jsonWriter0.isHtmlSafe());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      doReturn((Writer) null).when(writer0).append(anyChar());
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
      JsonWriter jsonWriter1 = jsonWriter0.beginArray();
      JsonWriter jsonWriter2 = jsonWriter0.beginObject();
      jsonWriter1.setSerializeNulls(false);
      JsonWriter jsonWriter3 = jsonWriter2.endObject();
      JsonWriter jsonWriter4 = jsonWriter3.beginArray();
      assertSame(jsonWriter3, jsonWriter4);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
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
  public void test35()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.beginObject();
      // Undeclared exception!
      try { 
        jsonWriter0.value("l81_c*+S+bAhy'V\"D");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Nesting problem.
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
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
  public void test37()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.beginObject();
      // Undeclared exception!
      try { 
        jsonWriter1.value((Boolean) null);
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
      JsonWriter jsonWriter1 = jsonWriter0.beginObject();
      // Undeclared exception!
      try { 
        jsonWriter1.value(659L);
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
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.value(0.3587805786124823);
      // Undeclared exception!
      try { 
        jsonWriter0.value(0.3587805786124823);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // JSON must have only one top-level value.
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
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
  public void test41()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      doReturn((Writer) null).when(writer0).append(any(java.lang.CharSequence.class));
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
      JsonWriter jsonWriter1 = jsonWriter0.beginObject();
      JsonWriter jsonWriter2 = jsonWriter1.name("1sd[LW[[7ZL@");
      JsonWriter jsonWriter3 = jsonWriter2.value("java.lang.Float@0000000002");
      // Undeclared exception!
      try { 
        jsonWriter3.beginObject();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Nesting problem.
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
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
  public void test43()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.beginArray();
      JsonWriter jsonWriter2 = jsonWriter0.beginArray();
      JsonWriter jsonWriter3 = jsonWriter2.beginArray();
      JsonWriter jsonWriter4 = jsonWriter1.beginArray();
      jsonWriter2.beginArray();
      JsonWriter jsonWriter5 = jsonWriter0.beginArray();
      JsonWriter jsonWriter6 = jsonWriter0.beginArray();
      JsonWriter jsonWriter7 = jsonWriter5.beginArray();
      jsonWriter3.beginArray();
      jsonWriter2.beginArray();
      JsonWriter jsonWriter8 = jsonWriter0.beginArray();
      JsonWriter jsonWriter9 = jsonWriter1.beginArray();
      JsonWriter jsonWriter10 = jsonWriter7.beginArray();
      JsonWriter jsonWriter11 = jsonWriter3.beginArray();
      jsonWriter10.beginArray();
      jsonWriter4.beginArray();
      JsonWriter jsonWriter12 = jsonWriter6.beginArray();
      JsonWriter jsonWriter13 = jsonWriter8.beginArray();
      jsonWriter5.beginArray();
      jsonWriter2.beginArray();
      jsonWriter1.beginArray();
      jsonWriter13.beginArray();
      jsonWriter12.beginArray();
      JsonWriter jsonWriter14 = jsonWriter4.beginArray();
      jsonWriter14.beginArray();
      jsonWriter8.beginArray();
      jsonWriter1.beginArray();
      JsonWriter jsonWriter15 = jsonWriter5.beginArray();
      jsonWriter15.beginArray();
      JsonWriter jsonWriter16 = jsonWriter9.beginArray();
      jsonWriter16.beginArray();
      jsonWriter11.beginArray();
      assertEquals("[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setLenient(true);
      JsonWriter jsonWriter1 = jsonWriter0.value("");
      jsonWriter1.jsonValue("");
      assertEquals("\"\"", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      doReturn((Writer) null, (Writer) null, (Writer) null, (Writer) null).when(writer0).append(any(java.lang.CharSequence.class));
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
      JsonWriter jsonWriter1 = jsonWriter0.beginObject();
      JsonWriter jsonWriter2 = jsonWriter1.name("Infinity");
      JsonWriter jsonWriter3 = jsonWriter2.value((double) 91);
      jsonWriter3.name("Infinity");
      JsonWriter jsonWriter4 = jsonWriter3.jsonValue("");
      assertSame(jsonWriter4, jsonWriter3);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.beginArray();
      jsonWriter1.setIndent("*sP=-}");
      jsonWriter1.beginObject();
      assertEquals("[\n*sP=-}{", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.value("\u2029");
      assertEquals("\"\\u2029\"", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
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
  public void test49()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.nullValue();
      jsonWriter0.close();
      jsonWriter0.close();
      assertEquals("null", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
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
  public void test51()  throws Throwable  {
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
  public void test52()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
      jsonWriter0.flush();
      assertTrue(jsonWriter0.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setLenient(true);
      Long long0 = new Long(0L);
      jsonWriter0.value((Number) long0);
      assertTrue(jsonWriter0.isLenient());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setLenient(true);
      jsonWriter0.value(0.6559465408);
      assertEquals("0.6559465408", stringWriter0.toString());
      assertTrue(jsonWriter0.isLenient());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.name("JsonWriter is closed.");
      assertTrue(jsonWriter1.getSerializeNulls());
      
      jsonWriter1.setSerializeNulls(false);
      assertFalse(jsonWriter0.getSerializeNulls());
      
      jsonWriter1.nullValue();
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.name("c`v3wWAj)Xn>L]kqh");
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
  public void test57()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.jsonValue((String) null);
      assertEquals("null", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.value((String) null);
      assertEquals("null", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.nullValue();
      jsonWriter1.close();
      // Undeclared exception!
      try { 
        jsonWriter0.name("~U");
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
      JsonWriter jsonWriter1 = jsonWriter0.name("L^tkeQ36p4]/ \"('|q0Q");
      // Undeclared exception!
      try { 
        jsonWriter1.name("L^tkeQ36p4]/ \"('|q0Q");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
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
  public void test62()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.nullValue();
      jsonWriter1.close();
      // Undeclared exception!
      try { 
        jsonWriter1.beginObject();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // JsonWriter is closed.
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.beginArray();
      jsonWriter0.name("Infinity");
      // Undeclared exception!
      try { 
        jsonWriter0.endArray();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Dangling name: Infinity
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setIndent("");
      assertTrue(jsonWriter0.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
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
  public void test66()  throws Throwable  {
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
  public void test67()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.beginObject();
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
  public void test68()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      JsonWriter jsonWriter0 = new JsonWriter(writer0);
      boolean boolean0 = jsonWriter0.getSerializeNulls();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.isLenient();
      assertTrue(jsonWriter0.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.isHtmlSafe();
      assertTrue(jsonWriter0.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setHtmlSafe(true);
      jsonWriter0.value("");
      assertEquals("\"\"", stringWriter0.toString());
  }
}
