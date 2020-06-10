/*
 * This file was automatically generated by EvoSuite
 * Tue Jun 09 13:21:33 GMT 2020
 */

package com.google.gson.internal.bind;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializer;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapterRuntimeTypeWrapper;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.evosuite.runtime.mock.java.util.MockUUID;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TypeAdapters_ESTest extends TypeAdapters_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Excluder excluder0 = new Excluder();
      Class<Object> class0 = Object.class;
      TypeToken<Object> typeToken0 = TypeToken.get(class0);
      JsonDeserializer<Object> jsonDeserializer0 = (JsonDeserializer<Object>) mock(JsonDeserializer.class, new ViolatedAssumptionAnswer());
      TreeTypeAdapter<Object> treeTypeAdapter0 = new TreeTypeAdapter<Object>((JsonSerializer<Object>) null, jsonDeserializer0, (Gson) null, typeToken0, excluder0);
      Class<Short> class1 = Short.class;
      TypeAdapterFactory typeAdapterFactory0 = TypeAdapters.newFactoryForMultipleTypes(class0, (Class<?>) class1, (TypeAdapter<? super Object>) treeTypeAdapter0);
      assertNotNull(typeAdapterFactory0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Gson gson0 = new Gson();
      AtomicInteger atomicInteger0 = new AtomicInteger(1692);
      JsonElement jsonElement0 = gson0.toJsonTree((Object) atomicInteger0);
      assertFalse(jsonElement0.isJsonObject());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("wn.n$");
      Class<Short> class0 = Short.class;
      try { 
        gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.NumberFormatException: For input string: \"wn.n$\"
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$6", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("H@(*P|#h%0");
      Class<Byte> class0 = Byte.class;
      try { 
        gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.NumberFormatException: For input string: \"H@(*P|#h%0\"
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$5", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Gson gson0 = new Gson();
      UUID uUID0 = MockUUID.randomUUID();
      StringBuffer stringBuffer0 = new StringBuffer();
      gson0.toJson((Object) uUID0, (Appendable) stringBuffer0);
      assertEquals("\"00000000-0100-4000-8200-000003000000\"", stringBuffer0.toString());
      assertEquals(38, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("}Z?1s");
      Class<URI> class0 = URI.class;
      // Undeclared exception!
      try { 
        gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.net.URISyntaxException: Illegal character in path at index 0: }Z?1s
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$22", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Long> class0 = Long.class;
      try { 
        gson0.fromJson("Ev!D.d\\Y~b2", class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.NumberFormatException: For input string: \"Ev!D.d\"
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$11", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonArray jsonArray0 = new JsonArray();
      Integer integer0 = new Integer(2208);
      jsonArray0.add((Number) integer0);
      Class<AtomicIntegerArray> class0 = AtomicIntegerArray.class;
      Object object0 = gson0.fromJson((JsonElement) jsonArray0, (Class<?>) class0);
      assertEquals("[2208]", object0.toString());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Gson gson0 = new Gson();
      ObjectTypeAdapter objectTypeAdapter0 = new ObjectTypeAdapter(gson0);
      Class<Byte> class0 = Byte.class;
      TypeAdapterFactory typeAdapterFactory0 = TypeAdapters.newFactory(class0, class0, (TypeAdapter<? super Byte>) objectTypeAdapter0);
      assertNotNull(typeAdapterFactory0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<GregorianCalendar> class0 = GregorianCalendar.class;
      ArrayTypeAdapter<GregorianCalendar> arrayTypeAdapter0 = new ArrayTypeAdapter<GregorianCalendar>(gson0, (TypeAdapter<GregorianCalendar>) null, class0);
      Class<Object> class1 = Object.class;
      TypeAdapterFactory typeAdapterFactory0 = TypeAdapters.newFactory(class1, (TypeAdapter<Object>) arrayTypeAdapter0);
      assertNotNull(typeAdapterFactory0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonDeserializer<Short> jsonDeserializer0 = (JsonDeserializer<Short>) mock(JsonDeserializer.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(jsonDeserializer0).deserialize(any(com.google.gson.JsonElement.class) , any(java.lang.reflect.Type.class) , any(com.google.gson.JsonDeserializationContext.class));
      Class<Short> class0 = Short.TYPE;
      TypeToken<Short> typeToken0 = TypeToken.get(class0);
      TypeAdapterFactory typeAdapterFactory0 = TypeAdapters.SHORT_FACTORY;
      TreeTypeAdapter<Short> treeTypeAdapter0 = new TreeTypeAdapter<Short>((JsonSerializer<Short>) null, jsonDeserializer0, gson0, typeToken0, typeAdapterFactory0);
      AtomicInteger atomicInteger0 = new AtomicInteger(3);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(atomicInteger0);
      Short short0 = treeTypeAdapter0.fromJsonTree(jsonPrimitive0);
      assertNull(short0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Gson gson0 = new Gson();
      Boolean boolean0 = Boolean.FALSE;
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(boolean0);
      Class<JsonObject> class0 = JsonObject.class;
      try { 
        gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected a com.google.gson.JsonObject but was com.google.gson.JsonPrimitive
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$35$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<JsonArray> class0 = JsonArray.class;
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      try { 
        gson0.fromJson((JsonElement) jsonNull0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected a com.google.gson.JsonArray but was com.google.gson.JsonNull
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$35$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonArray jsonArray0 = new JsonArray();
      Class<JsonObject> class0 = JsonObject.class;
      try { 
        gson0.fromJson((JsonElement) jsonArray0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected a com.google.gson.JsonObject but was com.google.gson.JsonArray
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$35$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("fr_FR");
      Class<JsonArray> class0 = JsonArray.class;
      try { 
        gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected a com.google.gson.JsonArray but was com.google.gson.JsonPrimitive
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$35$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Gson gson0 = new Gson();
      URL uRL0 = MockURL.getHttpExample();
      StringBuilder stringBuilder0 = new StringBuilder();
      gson0.toJson((Object) uRL0, (Appendable) stringBuilder0);
      assertEquals("\"http://www.someFakeButWellFormedURL.org/fooExample\"", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) gson0);
      Class<JsonArray> class0 = JsonArray.class;
      try { 
        gson0.fromJson(jsonElement0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected a com.google.gson.JsonArray but was com.google.gson.JsonObject
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$35$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonElement jsonElement0 = mock(JsonElement.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(jsonElement0).isJsonArray();
      doReturn(false).when(jsonElement0).isJsonNull();
      doReturn(false).when(jsonElement0).isJsonObject();
      doReturn(false).when(jsonElement0).isJsonPrimitive();
      // Undeclared exception!
      try { 
        gson0.toJson(jsonElement0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Couldn't write class com.google.gson.JsonElement$MockitoMock$1182855838
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$29", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) gson0);
      String string0 = gson0.toJson(jsonElement0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("fr_FR");
      JsonPrimitive jsonPrimitive1 = (JsonPrimitive)gson0.toJsonTree((Object) jsonPrimitive0);
      assertTrue(jsonPrimitive1.isString());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Gson gson0 = new Gson();
      // Undeclared exception!
      try { 
        gson0.toJson((Object) null, (Appendable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Gson gson0 = new Gson();
      AtomicIntegerArray atomicIntegerArray0 = new AtomicIntegerArray(2840);
      JsonElement jsonElement0 = gson0.toJsonTree((Object) atomicIntegerArray0);
      JsonArray jsonArray0 = (JsonArray)gson0.toJsonTree((Object) jsonElement0);
      assertEquals(2840, jsonArray0.size());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Gson gson0 = new Gson();
      // Undeclared exception!
      try { 
        gson0.toJson((JsonElement) null, (Appendable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) gson0);
      Class<JsonObject> class0 = JsonObject.class;
      JsonObject jsonObject0 = (JsonObject)gson0.fromJson(jsonElement0, (Class<?>) class0);
      assertFalse(jsonObject0.isJsonNull());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("fr_FR");
      Class<Locale> class0 = Locale.class;
      Object object0 = gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
      assertEquals("fr_FR", object0.toString());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("AgQ[/'4} MVnG$l=w");
      Class<Locale> class0 = Locale.class;
      Locale locale0 = (Locale)gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
      assertEquals("", locale0.getISO3Country());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      Class<Locale> class0 = Locale.class;
      Object object0 = gson0.fromJson((JsonElement) jsonNull0, (Class<?>) class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<URL> class0 = URL.class;
      TypeAdapterRuntimeTypeWrapper<Double> typeAdapterRuntimeTypeWrapper0 = new TypeAdapterRuntimeTypeWrapper<Double>(gson0, (TypeAdapter<Double>) null, class0);
      Class<Double> class1 = Double.class;
      ArrayTypeAdapter<Double> arrayTypeAdapter0 = new ArrayTypeAdapter<Double>(gson0, typeAdapterRuntimeTypeWrapper0, class1);
      JsonElement jsonElement0 = arrayTypeAdapter0.toJsonTree((Object) null);
      Class<Calendar> class2 = Calendar.class;
      Object object0 = gson0.fromJson(jsonElement0, (Class<?>) class2);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<UUID> class0 = UUID.class;
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      Object object0 = gson0.fromJson((JsonElement) jsonNull0, (Class<?>) class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonArray jsonArray0 = new JsonArray();
      Class<UUID> class0 = UUID.class;
      try { 
        gson0.fromJson((JsonElement) jsonArray0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected STRING but was BEGIN_ARRAY at path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) null);
      Class<InetAddress> class0 = InetAddress.class;
      InetAddress inetAddress0 = gson0.fromJson(jsonElement0, class0);
      assertNull(inetAddress0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Gson gson0 = new Gson();
      URI uRI0 = MockURI.aFTPURI;
      String string0 = gson0.toJson((Object) uRI0);
      assertEquals("\"ftp://foo.bar\"", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      Class<URL> class0 = URL.class;
      Object object0 = gson0.fromJson((JsonElement) jsonNull0, (Class<?>) class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("fr_FR");
      Class<URL> class0 = URL.class;
      try { 
        gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.net.MalformedURLException: no protocol: fr_FR
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<StringBuffer> class0 = StringBuffer.class;
      String string0 = gson0.toJson((Object) null, (Type) class0);
      assertEquals("null", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Gson gson0 = new Gson();
      StringBuffer stringBuffer0 = new StringBuffer();
      gson0.toJson((Object) stringBuffer0, (Appendable) stringBuffer0);
      assertEquals("\"\"", stringBuffer0.toString());
      assertEquals(2, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) null);
      Class<StringBuffer> class0 = StringBuffer.class;
      Object object0 = gson0.fromJson(jsonElement0, (Class<?>) class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("");
      Class<StringBuffer> class0 = StringBuffer.class;
      Object object0 = gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
      assertEquals("", object0.toString());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Gson gson0 = new Gson();
      StringBuilder stringBuilder0 = new StringBuilder();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) stringBuilder0);
      Class<Locale> class0 = Locale.class;
      // Undeclared exception!
      try { 
        gson0.fromJson(jsonElement0, (Class<?>) class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Locale", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("de_DE");
      Class<StringBuilder> class0 = StringBuilder.class;
      Object object0 = gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
      assertEquals("de_DE", object0.toString());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Gson gson0 = new Gson();
      Locale locale0 = Locale.KOREAN;
      JsonElement jsonElement0 = gson0.toJsonTree((Object) locale0);
      Class<String> class0 = String.class;
      Object object0 = gson0.fromJson(jsonElement0, (Class<?>) class0);
      assertEquals("ko", object0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      Class<String> class0 = String.class;
      Object object0 = gson0.fromJson((JsonElement) jsonNull0, (Class<?>) class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Boolean boolean0 = new Boolean("ko");
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(boolean0);
      Gson gson0 = new Gson();
      Class<String> class0 = String.class;
      Object object0 = gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
      assertEquals("false", object0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Character> class0 = Character.TYPE;
      JsonElement jsonElement0 = gson0.toJsonTree((Object) null, (Type) class0);
      assertFalse(jsonElement0.isJsonPrimitive());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Gson gson0 = new Gson();
      ObjectTypeAdapter objectTypeAdapter0 = new ObjectTypeAdapter(gson0);
      Character character0 = Character.valueOf('@');
      String string0 = objectTypeAdapter0.toJson((Object) character0);
      assertEquals("\"@\"", string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("duplicate key: ");
      Class<Character> class0 = Character.class;
      try { 
        gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expecting character, got: duplicate key: 
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$15", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Character> class0 = Character.class;
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      Object object0 = gson0.fromJson((JsonElement) jsonNull0, (Class<?>) class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("g");
      Class<Character> class0 = Character.TYPE;
      Object object0 = gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
      assertEquals('g', object0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Long> class0 = Long.TYPE;
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      Object object0 = gson0.fromJson((JsonElement) jsonNull0, (Class<?>) class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      Class<Integer> class0 = Integer.class;
      Object object0 = gson0.fromJson((JsonElement) jsonNull0, (Class<?>) class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("-r|#zX-sJ/K");
      Class<Integer> class0 = Integer.class;
      try { 
        gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.NumberFormatException: For input string: \"-r|#zX-sJ/K\"
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$7", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) null);
      Class<Short> class0 = Short.class;
      Object object0 = gson0.fromJson(jsonElement0, (Class<?>) class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Byte> class0 = Byte.class;
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      Object object0 = gson0.fromJson((JsonElement) jsonNull0, (Class<?>) class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Byte> class0 = Byte.TYPE;
      Byte byte0 = new Byte((byte) (-54));
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(byte0);
      Object object0 = gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
      assertEquals((byte) (-54), object0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Boolean> class0 = Boolean.class;
      TypeAdapter<Boolean> typeAdapter0 = TypeAdapters.BOOLEAN_AS_STRING;
      TypeAdapterRuntimeTypeWrapper<Boolean> typeAdapterRuntimeTypeWrapper0 = new TypeAdapterRuntimeTypeWrapper<Boolean>(gson0, typeAdapter0, class0);
      StringReader stringReader0 = new StringReader("null");
      JsonReader jsonReader0 = new JsonReader(stringReader0);
      Boolean boolean0 = typeAdapterRuntimeTypeWrapper0.read(jsonReader0);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Boolean> class0 = Boolean.class;
      TypeAdapter<Boolean> typeAdapter0 = TypeAdapters.BOOLEAN_AS_STRING;
      TypeAdapterRuntimeTypeWrapper<Boolean> typeAdapterRuntimeTypeWrapper0 = new TypeAdapterRuntimeTypeWrapper<Boolean>(gson0, typeAdapter0, class0);
      StringReader stringReader0 = new StringReader("null");
      JsonReader jsonReader0 = new JsonReader(stringReader0);
      jsonReader0.nextNull();
      // Undeclared exception!
      try { 
        typeAdapterRuntimeTypeWrapper0.read(jsonReader0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Expected a string but was END_DOCUMENT at line 1 column 5 path $
         //
         verifyException("com.google.gson.stream.JsonReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(boolean0);
      Gson gson0 = new Gson();
      Class<Boolean> class0 = Boolean.class;
      Object object0 = gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
      assertEquals(false, object0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      Class<Boolean> class0 = Boolean.class;
      Object object0 = gson0.fromJson((JsonElement) jsonNull0, (Class<?>) class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("de_DE");
      Class<Boolean> class0 = Boolean.class;
      Object object0 = gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
      assertEquals(false, object0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Gson gson0 = new Gson();
      StringBuffer stringBuffer0 = new StringBuffer();
      BitSet bitSet0 = new BitSet(0);
      bitSet0.set(2773);
      gson0.toJson((Object) bitSet0, (Appendable) stringBuffer0);
      assertEquals(5549, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<BitSet> class0 = BitSet.class;
      JsonArray jsonArray0 = new JsonArray();
      Object object0 = gson0.fromJson((JsonElement) jsonArray0, (Class<?>) class0);
      assertEquals("{}", object0.toString());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Gson gson0 = new Gson();
      StringBuilder stringBuilder0 = new StringBuilder();
      Byte byte0 = new Byte((byte)6);
      gson0.toJson((Object) byte0, (Appendable) stringBuilder0);
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Gson gson0 = new Gson();
      StringBuffer stringBuffer0 = new StringBuffer();
      Short short0 = new Short((short)580);
      gson0.toJson((Object) short0, (Appendable) stringBuffer0);
      assertEquals(26, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonArray jsonArray0 = new JsonArray();
      Class<AtomicBoolean> class0 = AtomicBoolean.class;
      try { 
        gson0.fromJson((JsonElement) jsonArray0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected BOOLEAN but was BEGIN_ARRAY at path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Gson gson0 = new Gson();
      AtomicBoolean atomicBoolean0 = new AtomicBoolean();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) atomicBoolean0);
      Class<InetAddress> class0 = InetAddress.class;
      try { 
        gson0.fromJson(jsonElement0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected STRING but was BOOLEAN at path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("'aZ:L2<q$d~9Lhgge");
      Class<AtomicInteger> class0 = AtomicInteger.class;
      try { 
        gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.NumberFormatException: For input string: \"'aZ:L2<q$d~9Lhgge\"
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$8", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Gson gson0 = new Gson();
      InetAddress inetAddress0 = MockInetAddress.getByName("BEGIN_OBJECT");
      JsonElement jsonElement0 = gson0.toJsonTree((Object) inetAddress0);
      assertFalse(jsonElement0.isJsonArray());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Locale> class0 = Locale.class;
      // Undeclared exception!
      try { 
        gson0.toJsonTree((Object) class0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Attempted to serialize java.lang.Class: java.util.Locale. Forgot to register a type adapter?
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Gson gson0 = new Gson();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(350, (-1282), (-1282), 350, 65279, 4363);
      JsonElement jsonElement0 = gson0.toJsonTree((Object) mockGregorianCalendar0);
      Class<GregorianCalendar> class0 = GregorianCalendar.class;
      try { 
        gson0.fromJson(jsonElement0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected NUMBER but was BOOLEAN at path $.lenient
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Gson gson0 = new Gson();
      TypeAdapterFactory typeAdapterFactory0 = TypeAdapters.UUID_FACTORY;
      Class<Byte> class0 = Byte.class;
      TypeToken<Byte> typeToken0 = TypeToken.get(class0);
      TypeAdapter<Byte> typeAdapter0 = gson0.getDelegateAdapter(typeAdapterFactory0, typeToken0);
      TypeAdapterFactory typeAdapterFactory1 = TypeAdapters.newFactory(typeToken0, typeAdapter0);
      assertFalse(typeAdapterFactory1.equals((Object)typeAdapterFactory0));
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Class<Object> class0 = Object.class;
      TypeAdapterFactory typeAdapterFactory0 = TypeAdapters.newTypeHierarchyFactory(class0, (TypeAdapter<Object>) null);
      assertNotNull(typeAdapterFactory0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Gson gson0 = new Gson();
      String string0 = gson0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("q..MEXLJ;+,I;z");
      Class<Currency> class0 = Currency.class;
      // Undeclared exception!
      try { 
        gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Currency", e);
      }
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      Gson gson0 = new Gson();
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      Currency currency0 = Currency.getInstance(locale0);
      String string0 = gson0.toJson((Object) currency0);
      assertEquals("\"TWD\"", string0);
  }
}