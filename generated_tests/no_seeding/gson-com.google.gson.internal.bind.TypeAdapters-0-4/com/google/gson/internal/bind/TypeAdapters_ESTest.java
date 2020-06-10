/*
 * This file was automatically generated by EvoSuite
 * Wed Jun 03 15:30:06 GMT 2020
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
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.reflect.TypeToken;
import java.io.Reader;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
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
import org.evosuite.runtime.mock.java.util.MockUUID;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class TypeAdapters_ESTest extends TypeAdapters_ESTest_scaffolding {

  @Test(timeout = 100000)
  public void test00()  throws Throwable  {
      Class<Calendar> class0 = Calendar.class;
      Class<GregorianCalendar> class1 = GregorianCalendar.class;
      TypeAdapterFactory typeAdapterFactory0 = TypeAdapters.newFactoryForMultipleTypes(class0, (Class<? extends Calendar>) class1, (TypeAdapter<? super Calendar>) null);
      assertNotNull(typeAdapterFactory0);
  }

  @Test(timeout = 100000)
  public void test01()  throws Throwable  {
      Class<Byte> class0 = Byte.TYPE;
      Gson gson0 = new Gson();
      try { 
        gson0.fromJson("4{Iu!T>=7!X{y", (Type) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 3 path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 100000)
  public void test02()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<AtomicIntegerArray> class0 = AtomicIntegerArray.class;
      try { 
        gson0.fromJson("15y[6A3&GF6YIR]sT\"", class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected BEGIN_ARRAY but was STRING at line 1 column 1 path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 100000)
  public void test03()  throws Throwable  {
      Class<AtomicIntegerArray> class0 = AtomicIntegerArray.class;
      ObjectConstructor<Object> objectConstructor0 = (ObjectConstructor<Object>) mock(ObjectConstructor.class, new ViolatedAssumptionAnswer());
      HashMap<String, ReflectiveTypeAdapterFactory.BoundField> hashMap0 = new HashMap<String, ReflectiveTypeAdapterFactory.BoundField>();
      ReflectiveTypeAdapterFactory.Adapter<Object> reflectiveTypeAdapterFactory_Adapter0 = new ReflectiveTypeAdapterFactory.Adapter<Object>(objectConstructor0, hashMap0);
      TypeAdapterFactory typeAdapterFactory0 = TypeAdapters.newFactory(class0, class0, (TypeAdapter<? super AtomicIntegerArray>) reflectiveTypeAdapterFactory_Adapter0);
      assertNotNull(typeAdapterFactory0);
  }

  @Test(timeout = 100000)
  public void test04()  throws Throwable  {
      Class<InetAddress> class0 = InetAddress.class;
      Gson gson0 = new Gson();
      Excluder excluder0 = gson0.excluder();
      TypeToken<InetAddress> typeToken0 = TypeToken.get(class0);
      TypeAdapter<InetAddress> typeAdapter0 = gson0.getDelegateAdapter((TypeAdapterFactory) excluder0, typeToken0);
      TypeAdapterFactory typeAdapterFactory0 = TypeAdapters.newFactory(class0, typeAdapter0);
      assertNotNull(typeAdapterFactory0);
  }

  @Test(timeout = 100000)
  public void test05()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Calendar> class0 = Calendar.class;
      TypeAdapter<Calendar> typeAdapter0 = gson0.getAdapter(class0);
      assertNotNull(typeAdapter0);
  }

  @Test(timeout = 100000)
  public void test06()  throws Throwable  {
      Gson gson0 = new Gson();
      Excluder excluder0 = Excluder.DEFAULT;
      JsonElement jsonElement0 = gson0.toJsonTree((Object) excluder0);
      String string0 = gson0.toJson(jsonElement0);
      assertNotNull(string0);
  }

  @Test(timeout = 100000)
  public void test07()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray(69);
      Gson gson0 = new Gson();
      String string0 = gson0.toJson((JsonElement) jsonArray0);
      assertEquals("[]", string0);
  }

  @Test(timeout = 100000)
  public void test08()  throws Throwable  {
      Gson gson0 = new Gson();
      Integer integer0 = new Integer(2137);
      JsonElement jsonElement0 = gson0.toJsonTree((Object) integer0);
      String string0 = gson0.toJson(jsonElement0);
      assertNotNull(string0);
  }

  @Test(timeout = 100000)
  public void test09()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      String string0 = gson0.toJson((JsonElement) jsonNull0);
      assertEquals("null", string0);
  }

  @Test(timeout = 100000)
  public void test10()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Long> class0 = Long.class;
      TypeToken<Long> typeToken0 = TypeToken.get(class0);
      JsonSerializer<Long> jsonSerializer0 = (JsonSerializer<Long>) mock(JsonSerializer.class, new ViolatedAssumptionAnswer());
      doReturn((JsonElement) null).when(jsonSerializer0).serialize(anyLong() , any(java.lang.reflect.Type.class) , any(com.google.gson.JsonSerializationContext.class));
      TypeAdapterFactory typeAdapterFactory0 = TypeAdapters.ENUM_FACTORY;
      TreeTypeAdapter<Long> treeTypeAdapter0 = new TreeTypeAdapter<Long>(jsonSerializer0, (JsonDeserializer<Long>) null, gson0, typeToken0, typeAdapterFactory0);
      Long long0 = new Long((-1510L));
      JsonElement jsonElement0 = treeTypeAdapter0.toJsonTree(long0);
      assertFalse(jsonElement0.isJsonObject());
  }

  @Test(timeout = 100000)
  public void test11()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonObject jsonObject0 = new JsonObject();
      ObjectTypeAdapter objectTypeAdapter0 = new ObjectTypeAdapter(gson0);
      Class<Long> class0 = Long.class;
      TypeToken<Long> typeToken0 = TypeToken.get(class0);
      JsonSerializer<Long> jsonSerializer0 = (JsonSerializer<Long>) mock(JsonSerializer.class, new ViolatedAssumptionAnswer());
      JsonDeserializer<Long> jsonDeserializer0 = (JsonDeserializer<Long>) mock(JsonDeserializer.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(jsonDeserializer0).deserialize(any(com.google.gson.JsonElement.class) , any(java.lang.reflect.Type.class) , any(com.google.gson.JsonDeserializationContext.class));
      TreeTypeAdapter<Long> treeTypeAdapter0 = new TreeTypeAdapter<Long>(jsonSerializer0, jsonDeserializer0, gson0, typeToken0, objectTypeAdapter0.FACTORY);
      Long long0 = treeTypeAdapter0.fromJsonTree(jsonObject0);
      assertNull(long0);
  }

  @Test(timeout = 100000)
  public void test12()  throws Throwable  {
      TypeAdapterFactory typeAdapterFactory0 = TypeAdapters.BOOLEAN_FACTORY;
      JsonArray jsonArray0 = new JsonArray(69);
      JsonSerializer<Long> jsonSerializer0 = (JsonSerializer<Long>) mock(JsonSerializer.class, new ViolatedAssumptionAnswer());
      JsonDeserializer<Long> jsonDeserializer0 = (JsonDeserializer<Long>) mock(JsonDeserializer.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(jsonDeserializer0).deserialize(any(com.google.gson.JsonElement.class) , any(java.lang.reflect.Type.class) , any(com.google.gson.JsonDeserializationContext.class));
      Gson gson0 = new Gson();
      Class<Long> class0 = Long.TYPE;
      TypeToken<Long> typeToken0 = TypeToken.get(class0);
      TreeTypeAdapter<Long> treeTypeAdapter0 = new TreeTypeAdapter<Long>(jsonSerializer0, jsonDeserializer0, gson0, typeToken0, typeAdapterFactory0);
      Long long0 = treeTypeAdapter0.fromJsonTree(jsonArray0);
      assertNull(long0);
  }

  @Test(timeout = 100000)
  public void test13()  throws Throwable  {
      Class<JsonNull> class0 = JsonNull.class;
      Gson gson0 = new Gson();
      try { 
        gson0.fromJson("Unterminated array", (Type) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected a com.google.gson.JsonNull but was com.google.gson.JsonPrimitive
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$35$1", e);
      }
  }

  @Test(timeout = 100000)
  public void test14()  throws Throwable  {
      Gson gson0 = new Gson();
      Boolean boolean0 = new Boolean(false);
      JsonElement jsonElement0 = gson0.toJsonTree((Object) boolean0);
      ObjectTypeAdapter objectTypeAdapter0 = new ObjectTypeAdapter(gson0);
      Class<Long> class0 = Long.class;
      TypeToken<Long> typeToken0 = TypeToken.get(class0);
      JsonSerializer<Long> jsonSerializer0 = (JsonSerializer<Long>) mock(JsonSerializer.class, new ViolatedAssumptionAnswer());
      JsonDeserializer<Long> jsonDeserializer0 = (JsonDeserializer<Long>) mock(JsonDeserializer.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(jsonDeserializer0).deserialize(any(com.google.gson.JsonElement.class) , any(java.lang.reflect.Type.class) , any(com.google.gson.JsonDeserializationContext.class));
      TreeTypeAdapter<Long> treeTypeAdapter0 = new TreeTypeAdapter<Long>(jsonSerializer0, jsonDeserializer0, gson0, typeToken0, objectTypeAdapter0.FACTORY);
      Long long0 = treeTypeAdapter0.fromJsonTree(jsonElement0);
      assertNull(long0);
  }

  @Test(timeout = 100000)
  public void test15()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Long> class0 = Long.class;
      TypeToken<Long> typeToken0 = TypeToken.get(class0);
      JsonSerializer<Long> jsonSerializer0 = (JsonSerializer<Long>) mock(JsonSerializer.class, new ViolatedAssumptionAnswer());
      JsonDeserializer<Long> jsonDeserializer0 = (JsonDeserializer<Long>) mock(JsonDeserializer.class, new ViolatedAssumptionAnswer());
      Excluder excluder0 = Excluder.DEFAULT;
      TreeTypeAdapter<Long> treeTypeAdapter0 = new TreeTypeAdapter<Long>(jsonSerializer0, jsonDeserializer0, gson0, typeToken0, excluder0);
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      Long long0 = treeTypeAdapter0.fromJsonTree(jsonNull0);
      assertNull(long0);
  }

  @Test(timeout = 100000)
  public void test16()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonSerializer<Long> jsonSerializer0 = (JsonSerializer<Long>) mock(JsonSerializer.class, new ViolatedAssumptionAnswer());
      JsonDeserializer<Long> jsonDeserializer0 = (JsonDeserializer<Long>) mock(JsonDeserializer.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(jsonDeserializer0).deserialize(any(com.google.gson.JsonElement.class) , any(java.lang.reflect.Type.class) , any(com.google.gson.JsonDeserializationContext.class));
      Class<Long> class0 = Long.class;
      TypeToken<Long> typeToken0 = TypeToken.get(class0);
      TypeAdapterFactory typeAdapterFactory0 = DateTypeAdapter.FACTORY;
      TreeTypeAdapter<Long> treeTypeAdapter0 = new TreeTypeAdapter<Long>(jsonSerializer0, jsonDeserializer0, gson0, typeToken0, typeAdapterFactory0);
      Integer integer0 = new Integer(2137);
      JsonElement jsonElement0 = gson0.toJsonTree((Object) integer0);
      Long long0 = treeTypeAdapter0.fromJsonTree(jsonElement0);
      assertNull(long0);
  }

  @Test(timeout = 100000)
  public void test17()  throws Throwable  {
      Gson gson0 = new Gson();
      Locale locale0 = Locale.CANADA;
      JsonElement jsonElement0 = gson0.toJsonTree((Object) locale0);
      assertFalse(jsonElement0.isJsonArray());
  }

  @Test(timeout = 100000)
  public void test18()  throws Throwable  {
      Class<Locale> class0 = Locale.class;
      Gson gson0 = new Gson();
      try { 
        gson0.fromJson("mD3{RDSU)~AO!F", (Type) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 5 path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 100000)
  public void test19()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<GregorianCalendar> class0 = GregorianCalendar.class;
      try { 
        gson0.fromJson("fc]fJ7G", (Type) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected BEGIN_OBJECT but was STRING at line 1 column 1 path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 100000)
  public void test20()  throws Throwable  {
      Gson gson0 = new Gson();
      UUID uUID0 = MockUUID.randomUUID();
      JsonPrimitive jsonPrimitive0 = (JsonPrimitive)gson0.toJsonTree((Object) uUID0);
      assertFalse(jsonPrimitive0.isNumber());
  }

  @Test(timeout = 100000)
  public void test21()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) null);
      Class<UUID> class0 = UUID.class;
      UUID uUID0 = gson0.fromJson(jsonElement0, class0);
      assertNull(uUID0);
  }

  @Test(timeout = 100000)
  public void test22()  throws Throwable  {
      Gson gson0 = new Gson();
      Character character0 = new Character('q');
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(character0);
      Class<UUID> class0 = UUID.class;
      UUID uUID0 = gson0.fromJson((JsonElement) jsonPrimitive0, class0);
      assertEquals("00000000-0100-4000-8200-000003000000", uUID0.toString());
  }

  @Test(timeout = 100000)
  public void test23()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<InetAddress> class0 = InetAddress.class;
      String string0 = gson0.toJson((Object) null, (Type) class0);
      assertEquals("null", string0);
  }

  @Test(timeout = 100000)
  public void test24()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<InetAddress> class0 = InetAddress.class;
      Inet4Address inet4Address0 = (Inet4Address)gson0.fromJson("com.google.gson.internal.bind.TypeAdapters$3", class0);
      assertFalse(inet4Address0.isMulticastAddress());
  }

  @Test(timeout = 100000)
  public void test25()  throws Throwable  {
      Gson gson0 = new Gson();
      URI uRI0 = MockURI.create("second");
      JsonPrimitive jsonPrimitive0 = (JsonPrimitive)gson0.toJsonTree((Object) uRI0);
      assertFalse(jsonPrimitive0.isBoolean());
  }

  @Test(timeout = 100000)
  public void test26()  throws Throwable  {
      Class<URI> class0 = URI.class;
      Gson gson0 = new Gson();
      String string0 = gson0.fromJson("null", (Type) class0);
      assertNull(string0);
  }

  @Test(timeout = 100000)
  public void test27()  throws Throwable  {
      Class<URI> class0 = URI.class;
      Gson gson0 = new Gson();
      // Undeclared exception!
      try { 
        gson0.fromJson("gjwF6%IhQt4KZ", (Type) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.net.URISyntaxException: Malformed escape pair at index 5: gjwF6%IhQt4KZ
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$22", e);
      }
  }

  @Test(timeout = 100000)
  public void test28()  throws Throwable  {
      Gson gson0 = new Gson();
      URL uRL0 = MockURL.getFileExample();
      JsonPrimitive jsonPrimitive0 = (JsonPrimitive)gson0.toJsonTree((Object) uRL0);
      assertFalse(jsonPrimitive0.isNumber());
  }

  @Test(timeout = 100000)
  public void test29()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<URL> class0 = URL.class;
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      URL uRL0 = gson0.fromJson((JsonElement) jsonNull0, class0);
      assertNull(uRL0);
  }

  @Test(timeout = 100000)
  public void test30()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("t.%U`");
      Class<URL> class0 = URL.class;
      try { 
        gson0.fromJson((JsonElement) jsonPrimitive0, class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.net.MalformedURLException: no protocol: t.%U`
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 100000)
  public void test31()  throws Throwable  {
      Gson gson0 = new Gson();
      StringBuffer stringBuffer0 = new StringBuffer();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) stringBuffer0);
      assertFalse(jsonElement0.isJsonObject());
  }

  @Test(timeout = 100000)
  public void test32()  throws Throwable  {
      Class<StringBuffer> class0 = StringBuffer.class;
      Gson gson0 = new Gson();
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      Calendar calendar0 = gson0.fromJson((JsonElement) jsonNull0, (Type) class0);
      assertNull(calendar0);
  }

  @Test(timeout = 100000)
  public void test33()  throws Throwable  {
      Class<StringBuffer> class0 = StringBuffer.class;
      Gson gson0 = new Gson();
      try { 
        gson0.fromJson("P| Mz*b*", (Type) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 5 path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 100000)
  public void test34()  throws Throwable  {
      Gson gson0 = new Gson();
      StringBuilder stringBuilder0 = new StringBuilder("com.google.gson.internal.bind.JsonTreeWriter$1");
      JsonElement jsonElement0 = gson0.toJsonTree((Object) stringBuilder0);
      String string0 = gson0.toJson(jsonElement0);
      assertEquals("\"com.google.gson.internal.bind.JsonTreeWriter$1\"", string0);
  }

  @Test(timeout = 100000)
  public void test35()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Character> class0 = Character.TYPE;
      String string0 = gson0.toJson((Object) null, (Type) class0);
      assertEquals("null", string0);
  }

  @Test(timeout = 100000)
  public void test36()  throws Throwable  {
      Gson gson0 = new Gson();
      Character character0 = Character.valueOf('^');
      JsonElement jsonElement0 = gson0.toJsonTree((Object) character0);
      assertFalse(jsonElement0.isJsonArray());
  }

  @Test(timeout = 100000)
  public void test37()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Character> class0 = Character.TYPE;
      try { 
        gson0.fromJson("L6=Js2g%J-", (Type) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expecting character, got: L6
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$15", e);
      }
  }

  @Test(timeout = 100000)
  public void test38()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Character> class0 = Character.TYPE;
      String string0 = gson0.fromJson("null", (Type) class0);
      assertNull(string0);
  }

  @Test(timeout = 100000)
  public void test39()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Character> class0 = Character.TYPE;
      try { 
        gson0.fromJson("? extends ", (Type) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 4 path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 100000)
  public void test40()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Long> class0 = Long.class;
      String string0 = gson0.fromJson("null", (Type) class0);
      assertNull(string0);
  }

  @Test(timeout = 100000)
  public void test41()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Long> class0 = Long.TYPE;
      try { 
        gson0.fromJson("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?", (Type) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.NumberFormatException: For input string: \"Attempted\"
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$11", e);
      }
  }

  @Test(timeout = 100000)
  public void test42()  throws Throwable  {
      Gson gson0 = new Gson();
      int[] intArray0 = new int[5];
      AtomicIntegerArray atomicIntegerArray0 = new AtomicIntegerArray(intArray0);
      JsonArray jsonArray0 = (JsonArray)gson0.toJsonTree((Object) atomicIntegerArray0);
      assertEquals(5, jsonArray0.size());
  }

  @Test(timeout = 100000)
  public void test43()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Integer> class0 = Integer.class;
      TypeToken<Integer> typeToken0 = TypeToken.get(class0);
      Type type0 = typeToken0.getType();
      String string0 = gson0.fromJson("null", type0);
      assertNull(string0);
  }

  @Test(timeout = 100000)
  public void test44()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Integer> class0 = Integer.TYPE;
      try { 
        gson0.fromJson("~n#*s7}Z<Os<", (Type) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.NumberFormatException: For input string: \"~n\"
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$7", e);
      }
  }

  @Test(timeout = 100000)
  public void test45()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Short> class0 = Short.TYPE;
      String string0 = gson0.fromJson("null", (Type) class0);
      assertNull(string0);
  }

  @Test(timeout = 100000)
  public void test46()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Short> class0 = Short.TYPE;
      try { 
        gson0.fromJson("oA%Q", (Type) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.NumberFormatException: For input string: \"oA%Q\"
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$6", e);
      }
  }

  @Test(timeout = 100000)
  public void test47()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Byte> class0 = Byte.TYPE;
      String string0 = gson0.fromJson("null", (Type) class0);
      assertNull(string0);
  }

  @Test(timeout = 100000)
  public void test48()  throws Throwable  {
      Class<Byte> class0 = Byte.TYPE;
      Gson gson0 = new Gson();
      try { 
        gson0.fromJson("com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory", (Type) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.NumberFormatException: For input string: \"com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory\"
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$5", e);
      }
  }

  @Test(timeout = 100000)
  public void test49()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Boolean> class0 = Boolean.TYPE;
      try { 
        gson0.fromJson("Invalid attempt to bind an instance of ", (Type) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 10 path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 100000)
  public void test50()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Boolean> class0 = Boolean.TYPE;
      try { 
        gson0.fromJson("[]", (Type) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected a boolean but was BEGIN_ARRAY at line 1 column 2 path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 100000)
  public void test51()  throws Throwable  {
      Gson gson0 = new Gson();
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-17);
      BitSet bitSet0 = BitSet.valueOf(byteArray0);
      JsonArray jsonArray0 = (JsonArray)gson0.toJsonTree((Object) bitSet0);
      assertEquals(8, jsonArray0.size());
  }

  @Test(timeout = 100000)
  public void test52()  throws Throwable  {
      Class<BitSet> class0 = BitSet.class;
      Gson gson0 = new Gson();
      try { 
        gson0.fromJson("[5B", (Type) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Error: Expecting: bitset number value (1, 0), Found: 5B
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$2", e);
      }
  }

  @Test(timeout = 100000)
  public void test53()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Byte> class0 = Byte.TYPE;
      String string0 = gson0.toJson((Object) null, (Type) class0);
      assertEquals("null", string0);
  }

  @Test(timeout = 100000)
  public void test54()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Short> class0 = Short.TYPE;
      Integer integer0 = new Integer(35);
      String string0 = gson0.toJson((Object) integer0, (Type) class0);
      assertNotNull(string0);
  }

  @Test(timeout = 100000)
  public void test55()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<AtomicBoolean> class0 = AtomicBoolean.class;
      try { 
        gson0.fromJson("com.google.gson.internal.bind.TypeAdapters$29", class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected a boolean but was STRING at line 1 column 1 path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 100000)
  public void test56()  throws Throwable  {
      Gson gson0 = new Gson();
      AtomicBoolean atomicBoolean0 = new AtomicBoolean(true);
      JsonPrimitive jsonPrimitive0 = (JsonPrimitive)gson0.toJsonTree((Object) atomicBoolean0);
      assertTrue(jsonPrimitive0.isBoolean());
  }

  @Test(timeout = 100000)
  public void test57()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<AtomicInteger> class0 = AtomicInteger.class;
      try { 
        gson0.fromJson(".?0a5?$L@dH8", class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.NumberFormatException: For input string: \".?0a5?$L@dH8\"
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$8", e);
      }
  }

  @Test(timeout = 100000)
  public void test58()  throws Throwable  {
      Gson gson0 = new Gson();
      AtomicInteger atomicInteger0 = new AtomicInteger((-518));
      JsonPrimitive jsonPrimitive0 = (JsonPrimitive)gson0.toJsonTree((Object) atomicInteger0);
      assertFalse(jsonPrimitive0.isBoolean());
  }

  @Test(timeout = 100000)
  public void test59()  throws Throwable  {
      Gson gson0 = new Gson();
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      JsonPrimitive jsonPrimitive0 = (JsonPrimitive)gson0.toJsonTree((Object) inetAddress0);
      assertFalse(jsonPrimitive0.isNumber());
  }

  @Test(timeout = 100000)
  public void test60()  throws Throwable  {
      TypeAdapterFactory typeAdapterFactory0 = TypeAdapters.BOOLEAN_FACTORY;
      JsonSerializer<Long> jsonSerializer0 = (JsonSerializer<Long>) mock(JsonSerializer.class, new ViolatedAssumptionAnswer());
      JsonDeserializer<Long> jsonDeserializer0 = (JsonDeserializer<Long>) mock(JsonDeserializer.class, new ViolatedAssumptionAnswer());
      Gson gson0 = new Gson();
      Class<Long> class0 = Long.class;
      TypeToken<Long> typeToken0 = TypeToken.get(class0);
      TreeTypeAdapter<Long> treeTypeAdapter0 = new TreeTypeAdapter<Long>(jsonSerializer0, jsonDeserializer0, gson0, typeToken0, typeAdapterFactory0);
      // Undeclared exception!
      try { 
        gson0.toJsonTree((Object) treeTypeAdapter0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Attempted to serialize java.lang.Class: java.lang.Long. Forgot to register a type adapter?
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$1", e);
      }
  }

  @Test(timeout = 100000)
  public void test61()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Long> class0 = Long.class;
      String string0 = gson0.toJson((Object) null, (Type) class0);
      assertEquals("null", string0);
  }

  @Test(timeout = 100000)
  public void test62()  throws Throwable  {
      Class<BitSet> class0 = BitSet.class;
      TypeToken<BitSet> typeToken0 = TypeToken.get(class0);
      TypeAdapterFactory typeAdapterFactory0 = TypeAdapters.newFactory(typeToken0, (TypeAdapter<BitSet>) null);
      JsonArray jsonArray0 = new JsonArray(69);
      JsonSerializer<Long> jsonSerializer0 = (JsonSerializer<Long>) mock(JsonSerializer.class, new ViolatedAssumptionAnswer());
      doReturn(jsonArray0).when(jsonSerializer0).serialize(anyLong() , any(java.lang.reflect.Type.class) , any(com.google.gson.JsonSerializationContext.class));
      Boolean boolean0 = new Boolean("");
      jsonArray0.add(boolean0);
      JsonDeserializer<Long> jsonDeserializer0 = (JsonDeserializer<Long>) mock(JsonDeserializer.class, new ViolatedAssumptionAnswer());
      Gson gson0 = new Gson();
      Class<Long> class1 = Long.class;
      TypeToken<Long> typeToken1 = TypeToken.get(class1);
      TreeTypeAdapter<Long> treeTypeAdapter0 = new TreeTypeAdapter<Long>(jsonSerializer0, jsonDeserializer0, gson0, typeToken1, typeAdapterFactory0);
      Long long0 = new Long((-323L));
      JsonElement jsonElement0 = treeTypeAdapter0.toJsonTree(long0);
      assertTrue(jsonElement0.equals((Object)jsonArray0));
  }

  @Test(timeout = 100000)
  public void test63()  throws Throwable  {
      Gson gson0 = new Gson();
      TypeAdapterFactory typeAdapterFactory0 = TypeAdapters.CALENDAR_FACTORY;
      Class<JsonPrimitive> class0 = JsonPrimitive.class;
      JsonSerializer<JsonPrimitive> jsonSerializer0 = (JsonSerializer<JsonPrimitive>) mock(JsonSerializer.class, new ViolatedAssumptionAnswer());
      JsonDeserializer<JsonPrimitive> jsonDeserializer0 = (JsonDeserializer<JsonPrimitive>) mock(JsonDeserializer.class, new ViolatedAssumptionAnswer());
      TypeToken<JsonPrimitive> typeToken0 = TypeToken.get(class0);
      TreeTypeAdapter<JsonPrimitive> treeTypeAdapter0 = new TreeTypeAdapter<JsonPrimitive>(jsonSerializer0, jsonDeserializer0, gson0, typeToken0, typeAdapterFactory0);
      TypeAdapterFactory typeAdapterFactory1 = TypeAdapters.newTypeHierarchyFactory(class0, (TypeAdapter<JsonPrimitive>) treeTypeAdapter0);
      assertFalse(typeAdapterFactory1.equals((Object)typeAdapterFactory0));
  }

  @Test(timeout = 100000)
  public void test64()  throws Throwable  {
      Gson gson0 = new Gson();
      String string0 = gson0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 100000)
  public void test65()  throws Throwable  {
      Gson gson0 = new Gson();
      StringReader stringReader0 = new StringReader("frc!B{Y$@Po|r&");
      Class<Currency> class0 = Currency.class;
      // Undeclared exception!
      try { 
        gson0.fromJson((Reader) stringReader0, class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Currency", e);
      }
  }

  @Test(timeout = 100000)
  public void test66()  throws Throwable  {
      Gson gson0 = new Gson();
      Locale locale0 = Locale.PRC;
      Currency currency0 = Currency.getInstance(locale0);
      String string0 = gson0.toJson((Object) currency0);
      assertEquals("\"CNY\"", string0);
  }
}
