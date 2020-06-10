/*
 * This file was automatically generated by EvoSuite
 * Tue Jun 09 13:51:50 GMT 2020
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
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.ParameterizedTypeFixtures;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.nio.CharBuffer;
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
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.evosuite.runtime.mock.java.util.MockUUID;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TypeAdapters_ESTest extends TypeAdapters_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Class<Long> class0 = Long.TYPE;
      Class<Long> class1 = Long.class;
      TypeAdapterFactory typeAdapterFactory0 = TypeAdapters.newFactoryForMultipleTypes(class1, (Class<? extends Long>) class0, (TypeAdapter<? super Long>) null);
      assertNotNull(typeAdapterFactory0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<AtomicInteger> class0 = AtomicInteger.class;
      try { 
        gson0.fromJson("j7#", class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.NumberFormatException: For input string: \"j7\"
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$8", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("com.google.gson.internal.bind.TypeAdapters");
      Class<Short> class0 = Short.class;
      try { 
        gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.NumberFormatException: For input string: \"com.google.gson.internal.bind.TypeAdapters\"
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$6", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Character character0 = Character.valueOf('4');
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(character0);
      Gson gson0 = new Gson();
      Class<Byte> class0 = Byte.class;
      Object object0 = gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
      assertEquals((byte)4, object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<URI> class0 = URI.class;
      // Undeclared exception!
      try { 
        gson0.fromJson("8<PS-,P", class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.net.URISyntaxException: Illegal character in path at index 1: 8<PS-
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$22", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<JsonArray> class0 = JsonArray.class;
      TypeToken<JsonArray> typeToken0 = TypeToken.get(class0);
      TypeAdapter<JsonArray> typeAdapter0 = gson0.getAdapter(typeToken0);
      TypeAdapterFactory typeAdapterFactory0 = TypeAdapters.newFactory(class0, typeAdapter0);
      assertNotNull(typeAdapterFactory0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(".z>:qm)g");
      String string0 = gson0.toJson((Object) jsonPrimitive0);
      assertEquals("\".z\\u003e:qm)g\"", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Gson gson0 = new Gson();
      String string0 = gson0.toJson((Object) null);
      assertEquals("null", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<JsonArray> class0 = JsonArray.class;
      Gson gson0 = new Gson();
      try { 
        gson0.fromJson("java.util.BitSet", (Type) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected a com.google.gson.JsonArray but was com.google.gson.JsonPrimitive
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$35$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonObject jsonObject0 = new JsonObject();
      Class<GregorianCalendar> class0 = GregorianCalendar.class;
      Object object0 = gson0.fromJson((JsonElement) jsonObject0, (Class<?>) class0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=0,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=0,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]", object0.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
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
         // Couldn't write class com.google.gson.JsonElement$MockitoMock$1711974767
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$29", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Gson gson0 = new Gson();
      String string0 = gson0.toJson((JsonElement) null);
      assertEquals("null", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonObject jsonObject0 = new JsonObject();
      Class<JsonPrimitive> class0 = JsonPrimitive.class;
      try { 
        gson0.fromJson((JsonElement) jsonObject0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected a com.google.gson.JsonPrimitive but was com.google.gson.JsonObject
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$35$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      Class<JsonPrimitive> class0 = JsonPrimitive.class;
      try { 
        gson0.fromJson((JsonElement) jsonNull0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected a com.google.gson.JsonPrimitive but was com.google.gson.JsonNull
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$35$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonArray jsonArray0 = new JsonArray(0);
      jsonArray0.add("[]");
      Class<JsonPrimitive> class0 = JsonPrimitive.class;
      try { 
        gson0.fromJson((JsonElement) jsonArray0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected a com.google.gson.JsonPrimitive but was com.google.gson.JsonArray
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$35$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Gson gson0 = new Gson();
      Boolean boolean0 = new Boolean(true);
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
  public void test16()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<JsonPrimitive> class0 = JsonPrimitive.class;
      Float float0 = new Float(0.0);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(float0);
      JsonPrimitive jsonPrimitive1 = (JsonPrimitive)gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
      assertFalse(jsonPrimitive1.isBoolean());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Gson gson0 = new Gson();
      Locale locale0 = Locale.US;
      String string0 = gson0.toJson((Object) locale0);
      assertEquals("\"en_US\"", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Locale> class0 = Locale.class;
      Locale locale0 = gson0.fromJson("?_jJ@iE", class0);
      assertEquals("?_JJ@IE", locale0.toString());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Locale> class0 = Locale.class;
      try { 
        gson0.fromJson("n=Ek/9", class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 3 path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Locale> class0 = Locale.class;
      // Undeclared exception!
      try { 
        gson0.fromJson("\"\"", class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Locale", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Class<InetAddress> class0 = InetAddress.class;
      Gson gson0 = new Gson();
      int[] intArray0 = new int[2];
      AtomicIntegerArray atomicIntegerArray0 = new AtomicIntegerArray(intArray0);
      ParameterizedTypeFixtures.MyParameterizedType<AtomicIntegerArray> parameterizedTypeFixtures_MyParameterizedType0 = new ParameterizedTypeFixtures.MyParameterizedType<AtomicIntegerArray>(atomicIntegerArray0);
      ParameterizedTypeFixtures.MyParameterizedTypeAdapter<AtomicIntegerArray> parameterizedTypeFixtures_MyParameterizedTypeAdapter0 = new ParameterizedTypeFixtures.MyParameterizedTypeAdapter<AtomicIntegerArray>();
      JsonSerializationContext jsonSerializationContext0 = mock(JsonSerializationContext.class, new ViolatedAssumptionAnswer());
      doReturn((JsonElement) null).when(jsonSerializationContext0).serialize(any());
      JsonElement jsonElement0 = parameterizedTypeFixtures_MyParameterizedTypeAdapter0.serialize(parameterizedTypeFixtures_MyParameterizedType0, (Type) class0, jsonSerializationContext0);
      Class<Calendar> class1 = Calendar.class;
      try { 
        gson0.fromJson(jsonElement0, (Class<?>) class1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected NUMBER but was NULL at path $.AtomicIntegerArray
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      Class<Calendar> class0 = Calendar.class;
      Object object0 = gson0.fromJson((JsonElement) jsonNull0, (Class<?>) class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Gson gson0 = new Gson();
      UUID uUID0 = MockUUID.randomUUID();
      String string0 = gson0.toJson((Object) uUID0);
      assertEquals("\"00000000-0100-4000-8200-000003000000\"", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonObject jsonObject0 = new JsonObject();
      Class<UUID> class0 = UUID.class;
      try { 
        gson0.fromJson((JsonElement) jsonObject0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected STRING but was BEGIN_OBJECT at path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Class<InetAddress> class0 = InetAddress.class;
      Gson gson0 = new Gson();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) null, (Type) class0);
      Class<UUID> class1 = UUID.class;
      Object object0 = gson0.fromJson(jsonElement0, (Class<?>) class1);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Gson gson0 = new Gson();
      InetAddress inetAddress0 = MockInetAddress.getByName("CFbBYP$-H");
      String string0 = gson0.toJson((Object) inetAddress0);
      assertEquals("\"200.42.42.0\"", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Class<InetAddress> class0 = InetAddress.class;
      TypeAdapterFactory typeAdapterFactory0 = TypeAdapters.newFactory(class0, class0, (TypeAdapter<? super InetAddress>) null);
      Gson gson0 = new Gson();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) typeAdapterFactory0);
      Object object0 = gson0.fromJson(jsonElement0, (Class<?>) class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Gson gson0 = new Gson();
      Double double0 = new Double((-1.0));
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(double0);
      Class<InetAddress> class0 = InetAddress.class;
      Inet4Address inet4Address0 = (Inet4Address)gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
      assertFalse(inet4Address0.isMCLinkLocal());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Gson gson0 = new Gson();
      URI uRI0 = MockURI.aHttpURI;
      String string0 = gson0.toJson((Object) uRI0);
      assertEquals("\"http://foo.bar\"", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<URI> class0 = URI.class;
      URI uRI0 = gson0.fromJson("null", class0);
      assertNull(uRI0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Gson gson0 = new Gson();
      URL uRL0 = MockURL.getFtpExample();
      String string0 = gson0.toJson((Object) uRL0);
      assertEquals("\"ftp://ftp.someFakeButWellFormedURL.org/fooExample\"", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Gson gson0 = new Gson();
      Character character0 = Character.valueOf('4');
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(character0);
      Class<URL> class0 = URL.class;
      try { 
        gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.net.MalformedURLException: no protocol: 4
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Gson gson0 = new Gson();
      StringBuilder stringBuilder0 = new StringBuilder(868);
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) stringBuilder0);
      StringBuffer stringBuffer0 = new StringBuffer(charBuffer0);
      JsonPrimitive jsonPrimitive0 = (JsonPrimitive)gson0.toJsonTree((Object) stringBuffer0);
      assertTrue(jsonPrimitive0.isString());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      Class<StringBuffer> class0 = StringBuffer.class;
      Object object0 = gson0.fromJson((JsonElement) jsonNull0, (Class<?>) class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonObject jsonObject0 = new JsonObject();
      Class<StringBuffer> class0 = StringBuffer.class;
      try { 
        gson0.fromJson((JsonElement) jsonObject0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected STRING but was BEGIN_OBJECT at path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<StringBuilder> class0 = StringBuilder.class;
      TypeToken<StringBuilder> typeToken0 = TypeToken.get(class0);
      Type type0 = typeToken0.getType();
      String string0 = gson0.toJson((Object) null, type0);
      assertEquals("null", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Gson gson0 = new Gson();
      StringBuilder stringBuilder0 = new StringBuilder();
      String string0 = gson0.toJson((Object) stringBuilder0);
      assertEquals("\"\"", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) null);
      Class<StringBuilder> class0 = StringBuilder.class;
      Object object0 = gson0.fromJson(jsonElement0, (Class<?>) class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonObject jsonObject0 = new JsonObject();
      Class<StringBuilder> class0 = StringBuilder.class;
      try { 
        gson0.fromJson((JsonElement) jsonObject0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected STRING but was BEGIN_OBJECT at path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Gson gson0 = new Gson();
      AtomicBoolean atomicBoolean0 = new AtomicBoolean(true);
      JsonElement jsonElement0 = gson0.toJsonTree((Object) atomicBoolean0);
      Class<String> class0 = String.class;
      Object object0 = gson0.fromJson(jsonElement0, (Class<?>) class0);
      assertEquals("true", object0);
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
      Gson gson0 = new Gson();
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("\"http://foo.bar\"");
      Class<String> class0 = String.class;
      Object object0 = gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
      assertEquals("\"http://foo.bar\"", object0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Gson gson0 = new Gson();
      Character character0 = new Character('-');
      String string0 = gson0.toJson((Object) character0);
      assertEquals("\"-\"", string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("\"ftp://ftp.someFakeButWellFormedURL.org/fooExample\"");
      Class<Character> class0 = Character.class;
      try { 
        gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expecting character, got: \"ftp://ftp.someFakeButWellFormedURL.org/fooExample\"
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$15", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Class<Character> class0 = Character.TYPE;
      Gson gson0 = new Gson();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) null, (Type) class0);
      Object object0 = gson0.fromJson(jsonElement0, (Class<?>) class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Gson gson0 = new Gson();
      Character character0 = Character.valueOf('4');
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(character0);
      Class<Character> class0 = Character.class;
      Object object0 = gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
      assertEquals('4', object0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) null);
      Class<Long> class0 = Long.class;
      Object object0 = gson0.fromJson(jsonElement0, (Class<?>) class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Long> class0 = Long.TYPE;
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("l8L|g(");
      try { 
        gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.NumberFormatException: For input string: \"l8L|g(\"
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$11", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Gson gson0 = new Gson();
      int[] intArray0 = new int[11];
      AtomicIntegerArray atomicIntegerArray0 = new AtomicIntegerArray(intArray0);
      String string0 = gson0.toJson((Object) atomicIntegerArray0);
      assertEquals("[0,0,0,0,0,0,0,0,0,0,0]", string0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonArray jsonArray0 = new JsonArray();
      Character character0 = Character.valueOf('.');
      jsonArray0.add(character0);
      Class<AtomicIntegerArray> class0 = AtomicIntegerArray.class;
      try { 
        gson0.fromJson((JsonElement) jsonArray0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.NumberFormatException: For input string: \".\"
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$10", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonArray jsonArray0 = new JsonArray();
      Class<AtomicIntegerArray> class0 = AtomicIntegerArray.class;
      AtomicIntegerArray atomicIntegerArray0 = (AtomicIntegerArray)gson0.fromJson((JsonElement) jsonArray0, (Class<?>) class0);
      assertEquals(0, atomicIntegerArray0.length());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("null");
      Class<Integer> class0 = Integer.TYPE;
      try { 
        gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.NumberFormatException: For input string: \"null\"
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$7", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Class<InetAddress> class0 = InetAddress.class;
      TypeAdapterFactory typeAdapterFactory0 = TypeAdapters.newFactory(class0, class0, (TypeAdapter<? super InetAddress>) null);
      Gson gson0 = new Gson();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) typeAdapterFactory0);
      Class<Short> class1 = Short.class;
      Object object0 = gson0.fromJson(jsonElement0, (Class<?>) class1);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      Class<Byte> class0 = Byte.class;
      Object object0 = gson0.fromJson((JsonElement) jsonNull0, (Class<?>) class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Class<Byte> class0 = Byte.class;
      Gson gson0 = new Gson();
      Character character0 = Character.valueOf('g');
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(character0);
      try { 
        gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.NumberFormatException: For input string: \"g\"
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$5", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonObject jsonObject0 = new JsonObject();
      Class<Boolean> class0 = Boolean.class;
      try { 
        gson0.fromJson((JsonElement) jsonObject0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected BOOLEAN but was BEGIN_OBJECT at path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Gson gson0 = new Gson();
      Character character0 = new Character('z');
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(character0);
      Class<Boolean> class0 = Boolean.class;
      Object object0 = gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
      assertEquals(false, object0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Gson gson0 = new Gson();
      BitSet bitSet0 = new BitSet();
      bitSet0.flip(14);
      JsonArray jsonArray0 = (JsonArray)gson0.toJsonTree((Object) bitSet0);
      assertEquals(15, jsonArray0.size());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonArray jsonArray0 = new JsonArray();
      Class<BitSet> class0 = BitSet.class;
      BitSet bitSet0 = (BitSet)gson0.fromJson((JsonElement) jsonArray0, (Class<?>) class0);
      assertEquals(0, bitSet0.cardinality());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Gson gson0 = new Gson();
      Short short0 = new Short((short) (-2858));
      Class<Short> class0 = Short.TYPE;
      JsonElement jsonElement0 = gson0.toJsonTree((Object) short0, (Type) class0);
      assertFalse(jsonElement0.isJsonNull());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonObject jsonObject0 = new JsonObject();
      Class<AtomicBoolean> class0 = AtomicBoolean.class;
      try { 
        gson0.fromJson((JsonElement) jsonObject0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected BOOLEAN but was BEGIN_OBJECT at path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Gson gson0 = new Gson();
      Byte byte0 = new Byte((byte) (-128));
      JsonElement jsonElement0 = gson0.toJsonTree((Object) byte0);
      Class<AtomicInteger> class0 = AtomicInteger.class;
      AtomicInteger atomicInteger0 = (AtomicInteger)gson0.fromJson(jsonElement0, (Class<?>) class0);
      assertEquals((-128L), atomicInteger0.longValue());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Gson gson0 = new Gson();
      AtomicInteger atomicInteger0 = new AtomicInteger(3);
      String string0 = gson0.toJson((Object) atomicInteger0);
      assertEquals("3", string0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonArray jsonArray0 = new JsonArray(0);
      JsonArray jsonArray1 = (JsonArray)gson0.toJsonTree((Object) jsonArray0);
      assertTrue(jsonArray1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Gson gson0 = new Gson();
      TypeAdapterFactory typeAdapterFactory0 = TypeAdapters.BIT_SET_FACTORY;
      TreeTypeAdapter<MockCalendar> treeTypeAdapter0 = new TreeTypeAdapter<MockCalendar>((JsonSerializer<MockCalendar>) null, (JsonDeserializer<MockCalendar>) null, gson0, (TypeToken<MockCalendar>) null, typeAdapterFactory0);
      JsonElement jsonElement0 = gson0.toJsonTree((Object) treeTypeAdapter0);
      String string0 = gson0.toJson(jsonElement0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<URL> class0 = URL.class;
      TypeToken<URL> typeToken0 = TypeToken.get(class0);
      // Undeclared exception!
      try { 
        gson0.toJson((Object) typeToken0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Attempted to serialize java.lang.Class: java.net.URL. Forgot to register a type adapter?
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Long> class0 = Long.class;
      TypeToken<Long> typeToken0 = TypeToken.get(class0);
      Class<? super Long> class1 = typeToken0.getRawType();
      String string0 = gson0.toJson((Object) null, (Type) class1);
      assertEquals("null", string0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Class<JsonPrimitive> class0 = JsonPrimitive.class;
      TypeToken<JsonPrimitive> typeToken0 = TypeToken.get(class0);
      TypeAdapterFactory typeAdapterFactory0 = TypeAdapters.newFactory(typeToken0, (TypeAdapter<JsonPrimitive>) null);
      assertNotNull(typeAdapterFactory0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Gson gson0 = new Gson();
      Excluder excluder0 = Excluder.DEFAULT;
      Class<MockGregorianCalendar> class0 = MockGregorianCalendar.class;
      TypeToken<MockGregorianCalendar> typeToken0 = TypeToken.get(class0);
      TypeAdapter<MockGregorianCalendar> typeAdapter0 = gson0.getDelegateAdapter((TypeAdapterFactory) excluder0, typeToken0);
      TypeAdapterFactory typeAdapterFactory0 = TypeAdapters.newTypeHierarchyFactory(class0, typeAdapter0);
      assertNotNull(typeAdapterFactory0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Gson gson0 = new Gson();
      String string0 = gson0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      Gson gson0 = new Gson();
      Class<Currency> class0 = Currency.class;
      try { 
        gson0.fromJson((JsonElement) jsonObject0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected STRING but was BEGIN_OBJECT at path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Gson gson0 = new Gson();
      Locale locale0 = Locale.UK;
      Currency currency0 = Currency.getInstance(locale0);
      String string0 = gson0.toJson((Object) currency0);
      assertEquals("\"GBP\"", string0);
  }
}