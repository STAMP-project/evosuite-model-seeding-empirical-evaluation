/*
 * This file was automatically generated by EvoSuite
 * Wed Jun 03 22:54:01 GMT 2020
 */

package com.google.gson.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.internal.LinkedTreeMap;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.ToIntFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LinkedTreeMap_ESTest extends LinkedTreeMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedTreeMap.Node<String, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, String>();
      String string0 = linkedTreeMap_Node0.getValue();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Integer>();
      Object object0 = linkedTreeMap_Node0.getKey();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Integer, Object> linkedTreeMap0 = new LinkedTreeMap<Integer, Object>(comparator0);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      linkedTreeMap_EntrySet0.iterator();
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedTreeMap<Integer, Object> linkedTreeMap0 = new LinkedTreeMap<Integer, Object>();
      Integer integer0 = new Integer(0);
      LinkedTreeMap.Node<Integer, Object> linkedTreeMap_Node0 = linkedTreeMap0.removeInternalByKey(integer0);
      assertEquals(0, linkedTreeMap0.size());
      assertNull(linkedTreeMap_Node0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedTreeMap<Integer, Object> linkedTreeMap0 = new LinkedTreeMap<Integer, Object>();
      linkedTreeMap0.size = 1;
      Set<Integer> set0 = linkedTreeMap0.keySet();
      assertFalse(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>();
      linkedTreeMap0.get("");
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedTreeMap<LinkedTreeMap<Integer, String>, Object> linkedTreeMap0 = new LinkedTreeMap<LinkedTreeMap<Integer, String>, Object>();
      LinkedTreeMap<Integer, String> linkedTreeMap1 = new LinkedTreeMap<Integer, String>();
      linkedTreeMap0.findByObject(linkedTreeMap1);
      assertEquals(0, linkedTreeMap1.size());
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedTreeMap<Comparable<String>, Object> linkedTreeMap0 = new LinkedTreeMap<Comparable<String>, Object>();
      linkedTreeMap0.find((Comparable<String>) null, false);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, AbstractMap.SimpleEntry<Object, Integer>> linkedTreeMap0 = new LinkedTreeMap<Object, AbstractMap.SimpleEntry<Object, Integer>>(comparator0);
      Comparator<Object> comparator1 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<AbstractMap.SimpleImmutableEntry<String, Object>, String> linkedTreeMap1 = new LinkedTreeMap<AbstractMap.SimpleImmutableEntry<String, Object>, String>(comparator1);
      boolean boolean0 = linkedTreeMap1.containsKey(linkedTreeMap0);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Comparable<Object>, String> linkedTreeMap0 = new LinkedTreeMap<Comparable<Object>, String>(comparator0);
      // Undeclared exception!
      try { 
        linkedTreeMap0.put((Comparable<Object>) null, "null=null");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // key == null
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedTreeMap<Object, AbstractMap.SimpleEntry<Object, Integer>> linkedTreeMap0 = new LinkedTreeMap<Object, AbstractMap.SimpleEntry<Object, Integer>>();
      LinkedTreeMap<Object, Object> linkedTreeMap1 = new LinkedTreeMap<Object, Object>((Comparator<? super Object>) null);
      Map.Entry<Object, Integer> map_Entry0 = (Map.Entry<Object, Integer>) mock(Map.Entry.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(map_Entry0).getKey();
      doReturn((Object) null).when(map_Entry0).getValue();
      AbstractMap.SimpleEntry<Object, Integer> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, Integer>(map_Entry0);
      // Undeclared exception!
      try { 
        linkedTreeMap0.put(linkedTreeMap1, abstractMap_SimpleEntry0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.google.gson.internal.LinkedTreeMap is not Comparable
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, AbstractMap.SimpleEntry<String, String>> linkedTreeMap0 = new LinkedTreeMap<String, AbstractMap.SimpleEntry<String, String>>(comparator0);
      Integer integer0 = Integer.valueOf(2);
      linkedTreeMap0.remove((Object) integer0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleEntry<Object, Object>, Comparable<Integer>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Object, Object>, Comparable<Integer>>((Comparator<? super AbstractMap.SimpleEntry<Object, Object>>) null);
      linkedTreeMap0.clear();
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.remove("");
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedTreeMap<Object, Integer> linkedTreeMap0 = new LinkedTreeMap<Object, Integer>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      Object object0 = new Object();
      boolean boolean0 = linkedTreeMap_EntrySet0.contains(object0);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedTreeMap.Node<Integer, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, Integer>();
      LinkedTreeMap.Node<Integer, Integer> linkedTreeMap_Node1 = linkedTreeMap_Node0.last();
      assertNotNull(linkedTreeMap_Node1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedTreeMap.Node<LinkedTreeMap<String, Integer>, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<LinkedTreeMap<String, Integer>, String>();
      LinkedTreeMap.Node<LinkedTreeMap<String, Integer>, String> linkedTreeMap_Node1 = linkedTreeMap_Node0.first();
      assertNotNull(linkedTreeMap_Node1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleEntry<Object, Integer>, String> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Object, Integer>, String>();
      linkedTreeMap0.keySet();
      Set<AbstractMap.SimpleEntry<Object, Integer>> set0 = linkedTreeMap0.keySet();
      assertEquals(0, set0.size());
      assertNotNull(set0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedTreeMap<String, AbstractMap.SimpleEntry<Object, Integer>> linkedTreeMap0 = new LinkedTreeMap<String, AbstractMap.SimpleEntry<Object, Integer>>((Comparator<? super String>) null);
      Set<Map.Entry<String, AbstractMap.SimpleEntry<Object, Integer>>> set0 = (Set<Map.Entry<String, AbstractMap.SimpleEntry<Object, Integer>>>)linkedTreeMap0.entrySet();
      assertNotNull(set0);
      
      BiConsumer<Object, Object> biConsumer0 = (BiConsumer<Object, Object>) mock(BiConsumer.class, new ViolatedAssumptionAnswer());
      linkedTreeMap0.forEach(biConsumer0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<LinkedTreeMap<Object, String>, String> linkedTreeMap0 = new LinkedTreeMap<LinkedTreeMap<Object, String>, String>(comparator0);
      // Undeclared exception!
      try { 
        linkedTreeMap0.removeInternal((LinkedTreeMap.Node<LinkedTreeMap<Object, String>, String>) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Integer, Object>, AbstractMap.SimpleEntry<Object, Object>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Integer, Object>, AbstractMap.SimpleEntry<Object, Object>>(comparator0);
      Map.Entry<Object, String> map_Entry0 = (Map.Entry<Object, String>) mock(Map.Entry.class, new ViolatedAssumptionAnswer());
      doReturn(linkedTreeMap0).when(map_Entry0).getKey();
      LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<Integer, Object>, AbstractMap.SimpleEntry<Object, Object>> linkedTreeMap_Node0 = linkedTreeMap0.findByEntry(map_Entry0);
      assertEquals(0, linkedTreeMap0.size());
      assertNull(linkedTreeMap_Node0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LinkedTreeMap<LinkedTreeMap<Integer, String>, Object> linkedTreeMap0 = new LinkedTreeMap<LinkedTreeMap<Integer, String>, Object>();
      LinkedTreeMap<Integer, String> linkedTreeMap1 = new LinkedTreeMap<Integer, String>();
      // Undeclared exception!
      try { 
        linkedTreeMap0.find(linkedTreeMap1, true);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.google.gson.internal.LinkedTreeMap is not Comparable
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LinkedTreeMap<Comparable<Object>, Integer> linkedTreeMap0 = new LinkedTreeMap<Comparable<Object>, Integer>();
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null).when(comparable0).toString();
      linkedTreeMap0.find(comparable0, true);
      Comparable<Object> comparable1 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparable1).compareTo(any());
      BiFunction<Object, Object, Integer> biFunction0 = (BiFunction<Object, Object, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      linkedTreeMap0.computeIfPresent(comparable1, biFunction0);
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>();
      // Undeclared exception!
      try { 
        linkedTreeMap0.putIfAbsent((String) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // key == null
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>((Comparator<? super Object>) null);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      boolean boolean0 = linkedTreeMap_KeySet0.remove(linkedTreeMap0);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>(comparator0);
      int int0 = linkedTreeMap0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LinkedTreeMap.Node<String, Comparable<Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Comparable<Object>>();
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      Comparable<Object> comparable1 = linkedTreeMap_Node0.setValue(comparable0);
      assertNull(comparable1);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Comparable<Object>, String> linkedTreeMap0 = new LinkedTreeMap<Comparable<Object>, String>(comparator0);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(comparable0).toString();
      linkedTreeMap0.put(comparable0, "Rztjl<)");
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LinkedTreeMap.Node<Integer, AbstractMap.SimpleImmutableEntry<Object, String>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, AbstractMap.SimpleImmutableEntry<Object, String>>();
      String string0 = linkedTreeMap_Node0.toString();
      assertEquals("null=null", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LinkedTreeMap<Object, Integer> linkedTreeMap0 = new LinkedTreeMap<Object, Integer>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      int int0 = linkedTreeMap_KeySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      linkedTreeMap_KeySet0.iterator();
      assertEquals(0, linkedTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ToIntFunction<String> toIntFunction0 = (ToIntFunction<String>) mock(ToIntFunction.class, new ViolatedAssumptionAnswer());
      Comparator<String> comparator0 = Comparator.comparingInt((ToIntFunction<? super String>) toIntFunction0);
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>(comparator0);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      boolean boolean0 = linkedTreeMap_KeySet0.contains(comparator0);
      assertEquals(0, linkedTreeMap_KeySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      linkedTreeMap_KeySet0.clear();
      assertEquals(0, linkedTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      int int0 = linkedTreeMap_EntrySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LinkedTreeMap<Object, Integer> linkedTreeMap0 = new LinkedTreeMap<Object, Integer>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      linkedTreeMap_EntrySet0.clear();
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }
}
