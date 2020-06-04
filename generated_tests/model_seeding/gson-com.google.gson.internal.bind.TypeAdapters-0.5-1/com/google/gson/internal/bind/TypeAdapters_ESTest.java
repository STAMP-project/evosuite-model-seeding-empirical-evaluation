/*
 * This file was automatically generated by EvoSuite
 * Wed Jun 03 20:46:39 GMT 2020
 */

package com.google.gson.internal.bind;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.reflect.TypeToken;
import java.io.CharArrayWriter;
import java.lang.reflect.Type;
import java.net.Inet4Address;
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
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.evosuite.runtime.mock.java.util.MockUUID;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TypeAdapters_ESTest extends TypeAdapters_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Class<Calendar> class0 = Calendar.class;
      Class<MockCalendar> class1 = MockCalendar.class;
      Gson gson0 = new Gson();
      Class<Object> class2 = Object.class;
      TypeAdapter<Object> typeAdapter0 = gson0.getAdapter(class2);
      TypeAdapterFactory typeAdapterFactory0 = TypeAdapters.newFactoryForMultipleTypes(class0, (Class<? extends Calendar>) class1, (TypeAdapter<? super Calendar>) typeAdapter0);
      assertNotNull(typeAdapterFactory0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Gson gson0 = new Gson();
      Long long0 = new Long(0L);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(long0);
      Class<Locale> class0 = Locale.class;
      Locale locale0 = (Locale)gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
      assertEquals("", locale0.getCountry());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("p8#j_Y,k4(UOf%l5v+");
      Class<Short> class0 = Short.class;
      try { 
        gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.NumberFormatException: For input string: \"p8#j_Y,k4(UOf%l5v+\"
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$6", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Byte> class0 = Byte.TYPE;
      Long long0 = new Long(0L);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(long0);
      Object object0 = gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
      assertEquals((byte)0, object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("<\bc");
      Class<URI> class0 = URI.class;
      // Undeclared exception!
      try { 
        gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.net.URISyntaxException: Illegal character in path at index 0: <\bc
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$22", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Class<Long> class0 = Long.class;
      Gson gson0 = new Gson();
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("p8#j_Y4(UOf%l5v+");
      try { 
        gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.NumberFormatException: For input string: \"p8#j_Y4(UOf%l5v+\"
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$11", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Gson gson0 = new Gson();
      Long long0 = new Long(0L);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(long0);
      Class<AtomicIntegerArray> class0 = AtomicIntegerArray.class;
      try { 
        gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected BEGIN_ARRAY but was NUMBER at path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Class<Short> class0 = Short.class;
      TypeAdapterFactory typeAdapterFactory0 = TypeAdapters.newFactory(class0, class0, (TypeAdapter<? super Short>) null);
      assertNotNull(typeAdapterFactory0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<String> class0 = String.class;
      TypeAdapter<String> typeAdapter0 = (TypeAdapter<String>) mock(TypeAdapter.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(typeAdapter0).toString();
      TypeAdapterFactory typeAdapterFactory0 = TypeAdapters.newFactory(class0, typeAdapter0);
      assertNotNull(typeAdapterFactory0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(3L);
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
  public void test10()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<JsonArray> class0 = JsonArray.class;
      JsonElement jsonElement0 = gson0.toJsonTree((Object) null);
      try { 
        gson0.fromJson(jsonElement0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected a com.google.gson.JsonArray but was com.google.gson.JsonNull
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$35$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("");
      Class<JsonNull> class0 = JsonNull.class;
      try { 
        gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected a com.google.gson.JsonNull but was com.google.gson.JsonPrimitive
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$35$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
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
         // Couldn't write class com.google.gson.JsonElement$MockitoMock$970448247
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$29", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) gson0);
      String string0 = gson0.toJson(jsonElement0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Gson gson0 = new Gson();
      Boolean boolean0 = new Boolean(true);
      JsonElement jsonElement0 = gson0.toJsonTree((Object) boolean0);
      String string0 = gson0.toJson(jsonElement0);
      assertEquals("true", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
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
  public void test16()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonArray jsonArray0 = new JsonArray();
      String string0 = gson0.toJson((JsonElement) jsonArray0);
      assertEquals("[]", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Gson gson0 = new Gson();
      String string0 = gson0.toJson((JsonElement) null);
      assertEquals("null", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) gson0);
      Class<JsonPrimitive> class0 = JsonPrimitive.class;
      try { 
        gson0.fromJson(jsonElement0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected a com.google.gson.JsonPrimitive but was com.google.gson.JsonObject
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$35$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Gson gson0 = new Gson();
      StringBuffer stringBuffer0 = new StringBuffer();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) stringBuffer0);
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
  public void test20()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      Class<Locale> class0 = Locale.class;
      Object object0 = gson0.fromJson((JsonElement) jsonNull0, (Class<?>) class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("en_GB");
      Class<Locale> class0 = Locale.class;
      Object object0 = gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
      assertEquals("en_GB", object0.toString());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) gson0);
      Class<GregorianCalendar> class0 = GregorianCalendar.class;
      try { 
        gson0.fromJson(jsonElement0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected NUMBER but was BOOLEAN at path $.complexMapKeySerialization
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonObject jsonObject0 = new JsonObject();
      Class<Calendar> class0 = Calendar.class;
      Object object0 = gson0.fromJson((JsonElement) jsonObject0, (Class<?>) class0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=0,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=0,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]", object0.toString());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) null);
      Class<GregorianCalendar> class0 = GregorianCalendar.class;
      Object object0 = gson0.fromJson(jsonElement0, (Class<?>) class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Gson gson0 = new Gson();
      UUID uUID0 = MockUUID.randomUUID();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) uUID0);
      Class<AtomicInteger> class0 = AtomicInteger.class;
      try { 
        gson0.fromJson(jsonElement0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.NumberFormatException: For input string: \"00000000-0100-4000-8200-000003000000\"
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$8", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) null);
      Class<UUID> class0 = UUID.class;
      Object object0 = gson0.fromJson(jsonElement0, (Class<?>) class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Gson gson0 = new Gson();
      StringBuffer stringBuffer0 = new StringBuffer();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) stringBuffer0);
      Class<UUID> class0 = UUID.class;
      UUID uUID0 = (UUID)gson0.fromJson(jsonElement0, (Class<?>) class0);
      assertEquals((-9079256848728588288L), uUID0.getLeastSignificantBits());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Byte> class0 = Byte.TYPE;
      JsonElement jsonElement0 = gson0.toJsonTree((Object) null, (Type) class0);
      Class<InetAddress> class1 = InetAddress.class;
      Object object0 = gson0.fromJson(jsonElement0, (Class<?>) class1);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("\":");
      Class<InetAddress> class0 = InetAddress.class;
      Inet4Address inet4Address0 = (Inet4Address)gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
      assertFalse(inet4Address0.isSiteLocalAddress());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Gson gson0 = new Gson();
      StringBuilder stringBuilder0 = new StringBuilder();
      URI uRI0 = MockURI.aFileURI;
      gson0.toJson((Object) uRI0, (Appendable) stringBuilder0);
      assertEquals("\"file:///tmp/foo.bar\"", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      Class<URI> class0 = URI.class;
      Object object0 = gson0.fromJson((JsonElement) jsonNull0, (Class<?>) class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Gson gson0 = new Gson();
      URL uRL0 = MockURL.getHttpExample();
      JsonPrimitive jsonPrimitive0 = (JsonPrimitive)gson0.toJsonTree((Object) uRL0);
      assertTrue(jsonPrimitive0.isString());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) null);
      Class<URL> class0 = URL.class;
      Object object0 = gson0.fromJson(jsonElement0, (Class<?>) class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Gson gson0 = new Gson();
      Locale locale0 = Locale.KOREAN;
      JsonElement jsonElement0 = gson0.toJsonTree((Object) locale0);
      Class<URL> class0 = URL.class;
      try { 
        gson0.fromJson(jsonElement0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.net.MalformedURLException: no protocol: ko
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonNull jsonNull0 = new JsonNull();
      Class<StringBuffer> class0 = StringBuffer.class;
      Object object0 = gson0.fromJson((JsonElement) jsonNull0, (Class<?>) class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      Gson gson0 = new Gson();
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
  public void test37()  throws Throwable  {
      Gson gson0 = new Gson();
      StringBuilder stringBuilder0 = new StringBuilder();
      gson0.toJson((Object) stringBuilder0, (Appendable) stringBuilder0);
      assertEquals("\"\"", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      Class<StringBuilder> class0 = StringBuilder.class;
      Object object0 = gson0.fromJson((JsonElement) jsonNull0, (Class<?>) class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Gson gson0 = new Gson();
      StringBuffer stringBuffer0 = new StringBuffer();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) stringBuffer0);
      Class<StringBuilder> class0 = StringBuilder.class;
      Object object0 = gson0.fromJson(jsonElement0, (Class<?>) class0);
      assertEquals("", object0.toString());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Class<String> class0 = String.class;
      Gson gson0 = new Gson();
      Boolean boolean0 = Boolean.valueOf("7DqQ+}3p@t8");
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(boolean0);
      Object object0 = gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
      assertEquals("false", object0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Byte> class0 = Byte.TYPE;
      JsonElement jsonElement0 = gson0.toJsonTree((Object) null, (Type) class0);
      Class<String> class1 = String.class;
      Object object0 = gson0.fromJson(jsonElement0, (Class<?>) class1);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonArray jsonArray0 = new JsonArray();
      Class<String> class0 = String.class;
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
  public void test43()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Character> class0 = Character.TYPE;
      JsonElement jsonElement0 = gson0.toJsonTree((Object) null, (Type) class0);
      assertFalse(jsonElement0.isJsonObject());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Gson gson0 = new Gson();
      Character character0 = Character.valueOf('t');
      JsonElement jsonElement0 = gson0.toJsonTree((Object) character0);
      assertFalse(jsonElement0.isJsonObject());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("\"");
      Class<Character> class0 = Character.class;
      Object object0 = gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
      assertEquals('\"', object0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      Class<Character> class0 = Character.class;
      Object object0 = gson0.fromJson((JsonElement) jsonNull0, (Class<?>) class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("p8#j_Y4(UOf%l5v+");
      Class<Character> class0 = Character.class;
      try { 
        gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expecting character, got: p8#j_Y4(UOf%l5v+
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$15", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Gson gson0 = new Gson();
      AtomicIntegerArray atomicIntegerArray0 = new AtomicIntegerArray(24);
      JsonElement jsonElement0 = gson0.toJsonTree((Object) atomicIntegerArray0);
      Class<JsonArray> class0 = JsonArray.class;
      JsonArray jsonArray0 = (JsonArray)gson0.fromJson(jsonElement0, (Class<?>) class0);
      assertEquals(24, jsonArray0.size());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) null);
      Class<Integer> class0 = Integer.class;
      Object object0 = gson0.fromJson(jsonElement0, (Class<?>) class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) "{}");
      Class<Integer> class0 = Integer.class;
      try { 
        gson0.fromJson(jsonElement0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.NumberFormatException: For input string: \"{}\"
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$7", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      TypeAdapterFactory typeAdapterFactory0 = TypeAdapters.LOCALE_FACTORY;
      Gson gson0 = new Gson();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) typeAdapterFactory0);
      Class<Short> class0 = Short.class;
      Object object0 = gson0.fromJson(jsonElement0, (Class<?>) class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) "p8#j_Y4(UOf%l5v+");
      Class<Byte> class0 = Byte.class;
      try { 
        gson0.fromJson(jsonElement0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.NumberFormatException: For input string: \"p8#j_Y4(UOf%l5v+\"
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$5", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonArray jsonArray0 = new JsonArray();
      Class<Boolean> class0 = Boolean.class;
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
  public void test54()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("<\bc");
      Class<Boolean> class0 = Boolean.class;
      Object object0 = gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
      assertEquals(false, object0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Gson gson0 = new Gson();
      StringBuilder stringBuilder0 = new StringBuilder();
      BitSet bitSet0 = new BitSet();
      BitSet bitSet1 = new BitSet();
      bitSet1.set(2009);
      bitSet0.xor(bitSet1);
      gson0.toJson((Object) bitSet0, (Appendable) stringBuilder0);
      assertEquals(1, bitSet0.cardinality());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<BitSet> class0 = BitSet.class;
      JsonArray jsonArray0 = new JsonArray();
      BitSet bitSet0 = (BitSet)gson0.fromJson((JsonElement) jsonArray0, (Class<?>) class0);
      assertTrue(bitSet0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Byte> class0 = Byte.TYPE;
      JsonElement jsonElement0 = gson0.toJsonTree((Object) null, (Type) class0);
      Object object0 = gson0.fromJson(jsonElement0, (Class<?>) class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Gson gson0 = new Gson();
      Short short0 = new Short((short) (-1567));
      JsonElement jsonElement0 = gson0.toJsonTree((Object) short0);
      Class<Calendar> class0 = Calendar.class;
      try { 
        gson0.fromJson(jsonElement0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected BEGIN_OBJECT but was NUMBER at path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
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
  public void test60()  throws Throwable  {
      Gson gson0 = new Gson();
      AtomicBoolean atomicBoolean0 = new AtomicBoolean();
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      gson0.toJson((Object) atomicBoolean0, (Appendable) charArrayWriter0);
      assertEquals(5, charArrayWriter0.size());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Gson gson0 = new Gson();
      AtomicInteger atomicInteger0 = new AtomicInteger(468);
      JsonPrimitive jsonPrimitive0 = (JsonPrimitive)gson0.toJsonTree((Object) atomicInteger0);
      assertFalse(jsonPrimitive0.isBoolean());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Gson gson0 = new Gson();
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) inetAddress0);
      assertFalse(jsonElement0.isJsonObject());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Character> class0 = Character.class;
      // Undeclared exception!
      try { 
        gson0.toJsonTree((Object) class0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Attempted to serialize java.lang.Class: java.lang.Character. Forgot to register a type adapter?
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Gson gson0 = new Gson();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) mockGregorianCalendar0);
      assertTrue(jsonElement0.isJsonObject());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      TypeToken<Character> typeToken0 = (TypeToken<Character>) mock(TypeToken.class, new ViolatedAssumptionAnswer());
      TypeAdapterFactory typeAdapterFactory0 = TypeAdapters.newFactory(typeToken0, (TypeAdapter<Character>) null);
      assertNotNull(typeAdapterFactory0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Class<Long> class0 = Long.class;
      TypeAdapterFactory typeAdapterFactory0 = TypeAdapters.newTypeHierarchyFactory(class0, (TypeAdapter<Long>) null);
      assertNotNull(typeAdapterFactory0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Gson gson0 = new Gson();
      String string0 = gson0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Gson gson0 = new Gson();
      Boolean boolean0 = new Boolean(true);
      JsonElement jsonElement0 = gson0.toJsonTree((Object) boolean0);
      Class<Currency> class0 = Currency.class;
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
  public void test69()  throws Throwable  {
      Gson gson0 = new Gson();
      Locale locale0 = Locale.US;
      Currency currency0 = Currency.getInstance(locale0);
      JsonPrimitive jsonPrimitive0 = (JsonPrimitive)gson0.toJsonTree((Object) currency0);
      assertTrue(jsonPrimitive0.isString());
  }
}
