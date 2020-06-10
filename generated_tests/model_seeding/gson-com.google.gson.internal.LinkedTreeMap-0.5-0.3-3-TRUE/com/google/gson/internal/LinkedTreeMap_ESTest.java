/*
 * This file was automatically generated by EvoSuite
 * Tue Jun 09 11:38:54 GMT 2020
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
import java.util.function.ToLongFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LinkedTreeMap_ESTest extends LinkedTreeMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedTreeMap.Node<String, Comparable<Integer>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Comparable<Integer>>();
      Comparable<Integer> comparable0 = linkedTreeMap_Node0.getValue();
      assertNull(comparable0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedTreeMap.Node<Comparable<String>, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Comparable<String>, Integer>();
      Comparable<String> comparable0 = linkedTreeMap_Node0.getKey();
      assertNull(comparable0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedTreeMap<Integer, Object> linkedTreeMap0 = new LinkedTreeMap<Integer, Object>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      int int0 = linkedTreeMap_EntrySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      linkedTreeMap_EntrySet0.iterator();
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedTreeMap<String, Map.Entry<Integer, Integer>> linkedTreeMap0 = new LinkedTreeMap<String, Map.Entry<Integer, Integer>>();
      LinkedTreeMap.Node<Integer, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, Integer>();
      linkedTreeMap0.put("BKwh+S:H/w+y", linkedTreeMap_Node0);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Map.Entry<Integer, Integer>, Object> linkedTreeMap1 = new LinkedTreeMap<Map.Entry<Integer, Integer>, Object>(comparator0);
      boolean boolean0 = linkedTreeMap_KeySet0.contains(linkedTreeMap1);
      assertEquals(1, linkedTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedTreeMap<Comparable<Object>, AbstractMap.SimpleImmutableEntry<String, String>> linkedTreeMap0 = new LinkedTreeMap<Comparable<Object>, AbstractMap.SimpleImmutableEntry<String, String>>();
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(comparable0).toString();
      AbstractMap.SimpleEntry<String, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<String, String>("8$", "8$");
      AbstractMap.SimpleImmutableEntry<String, String> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<String, String>(abstractMap_SimpleEntry0);
      linkedTreeMap0.put(comparable0, abstractMap_SimpleImmutableEntry0);
      int int0 = linkedTreeMap0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleEntry<Object, Object>, AbstractMap.SimpleImmutableEntry<Object, Integer>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Object, Object>, AbstractMap.SimpleImmutableEntry<Object, Integer>>();
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, AbstractMap.SimpleImmutableEntry<Object, Integer>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, AbstractMap.SimpleImmutableEntry<Object, Integer>>();
      linkedTreeMap0.removeInternal(linkedTreeMap_Node0, false);
      int int0 = linkedTreeMap0.size();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      LinkedTreeMap<Map.Entry<Integer, Integer>, Map.Entry<String, Object>> linkedTreeMap0 = new LinkedTreeMap<Map.Entry<Integer, Integer>, Map.Entry<String, Object>>(comparator0);
      LinkedTreeMap.Node<Integer, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, Integer>();
      Integer integer0 = new Integer(43);
      AbstractMap.SimpleEntry<String, Integer> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<String, Integer>("N@$%dH3EpmB", integer0);
      AbstractMap.SimpleImmutableEntry<String, Object> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<String, Object>(abstractMap_SimpleEntry0);
      linkedTreeMap0.put(linkedTreeMap_Node0, abstractMap_SimpleImmutableEntry0);
      LinkedTreeMap<String, Integer> linkedTreeMap1 = new LinkedTreeMap<String, Integer>();
      linkedTreeMap0.removeInternalByKey(linkedTreeMap1);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ToLongFunction<String> toLongFunction0 = (ToLongFunction<String>) mock(ToLongFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0L, 0L).when(toLongFunction0).applyAsLong(anyString());
      Comparator<String> comparator0 = Comparator.comparingLong((ToLongFunction<? super String>) toLongFunction0);
      LinkedTreeMap<String, Map.Entry<Integer, Integer>> linkedTreeMap0 = new LinkedTreeMap<String, Map.Entry<Integer, Integer>>(comparator0);
      AbstractMap.SimpleEntry<Integer, Integer> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Integer, Integer>((Integer) null, (Integer) null);
      linkedTreeMap0.put("@", abstractMap_SimpleEntry0);
      linkedTreeMap0.put("Vjr&r)vX.FEXp,a'", (Map.Entry<Integer, Integer>) null);
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Comparable<String>, Integer> linkedTreeMap0 = new LinkedTreeMap<Comparable<String>, Integer>(comparator0);
      Integer integer0 = new Integer((-3656));
      linkedTreeMap0.putIfAbsent("[]", integer0);
      linkedTreeMap0.keySet();
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedTreeMap<Comparable<Integer>, AbstractMap.SimpleEntry<String, Integer>> linkedTreeMap0 = new LinkedTreeMap<Comparable<Integer>, AbstractMap.SimpleEntry<String, Integer>>();
      LinkedTreeMap.Node<Comparable<Integer>, AbstractMap.SimpleEntry<String, Integer>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Comparable<Integer>, AbstractMap.SimpleEntry<String, Integer>>();
      linkedTreeMap0.removeInternal(linkedTreeMap_Node0, false);
      linkedTreeMap0.keySet();
      assertEquals((-1), linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedTreeMap<Comparable<Integer>, Map.Entry<Integer, Integer>> linkedTreeMap0 = new LinkedTreeMap<Comparable<Integer>, Map.Entry<Integer, Integer>>();
      LinkedTreeMap<Object, Integer> linkedTreeMap1 = new LinkedTreeMap<Object, Integer>();
      linkedTreeMap0.get(linkedTreeMap1);
      assertEquals(0, linkedTreeMap1.size());
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Comparable<Object>, Object> linkedTreeMap0 = new LinkedTreeMap<Comparable<Object>, Object>(comparator0);
      linkedTreeMap0.findByObject((Object) null);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedTreeMap<String, Map.Entry<Integer, Integer>> linkedTreeMap0 = new LinkedTreeMap<String, Map.Entry<Integer, Integer>>();
      linkedTreeMap0.find("", true);
      linkedTreeMap0.findByObject("");
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedTreeMap.Node<Integer, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, Integer>();
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      linkedTreeMap0.findByEntry(linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedTreeMap<String, Map.Entry<Integer, Integer>> linkedTreeMap0 = new LinkedTreeMap<String, Map.Entry<Integer, Integer>>();
      linkedTreeMap0.find(",wK%,<jz/:x{IF5FQ,W", false);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedTreeMap.Node<Integer, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, Integer>();
      LinkedTreeMap<String, Map.Entry<Integer, Integer>> linkedTreeMap0 = new LinkedTreeMap<String, Map.Entry<Integer, Integer>>();
      linkedTreeMap0.put("/", linkedTreeMap_Node0);
      linkedTreeMap0.entrySet();
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedTreeMap<String, Integer> linkedTreeMap0 = new LinkedTreeMap<String, Integer>();
      LinkedTreeMap.Node<String, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Integer>();
      LinkedTreeMap.Node<String, Integer> linkedTreeMap_Node1 = new LinkedTreeMap.Node<String, Integer>(linkedTreeMap_Node0, "", linkedTreeMap_Node0, linkedTreeMap_Node0);
      linkedTreeMap_Node1.left = linkedTreeMap_Node0;
      linkedTreeMap_Node1.right = linkedTreeMap_Node0;
      linkedTreeMap_Node0.left = linkedTreeMap_Node1.left;
      // Undeclared exception!
      linkedTreeMap0.removeInternal(linkedTreeMap_Node1, false);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Comparable<Map.Entry<Integer, Integer>>, Map.Entry<Integer, Integer>> linkedTreeMap0 = new LinkedTreeMap<Comparable<Map.Entry<Integer, Integer>>, Map.Entry<Integer, Integer>>(comparator0);
      // Undeclared exception!
      try { 
        linkedTreeMap0.removeInternal((LinkedTreeMap.Node<Comparable<Map.Entry<Integer, Integer>>, Map.Entry<Integer, Integer>>) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleEntry<String, String>, AbstractMap.SimpleEntry<Integer, String>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<String, String>, AbstractMap.SimpleEntry<Integer, String>>();
      AbstractMap.SimpleEntry<String, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<String, String>("", "");
      LinkedTreeMap.Node<Integer, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, String>();
      AbstractMap.SimpleEntry<Integer, String> abstractMap_SimpleEntry1 = new AbstractMap.SimpleEntry<Integer, String>(linkedTreeMap_Node0);
      // Undeclared exception!
      try { 
        linkedTreeMap0.put(abstractMap_SimpleEntry0, abstractMap_SimpleEntry1);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.AbstractMap$SimpleEntry is not Comparable
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<AbstractMap.SimpleEntry<Integer, Object>, Object> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Integer, Object>, Object>(comparator0);
      // Undeclared exception!
      try { 
        linkedTreeMap0.findByEntry((Map.Entry<?, ?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LinkedTreeMap.Node<String, Map.Entry<Integer, Integer>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Map.Entry<Integer, Integer>>();
      LinkedTreeMap.Node<String, Map.Entry<Integer, Integer>> linkedTreeMap_Node1 = linkedTreeMap_Node0.first();
      assertNotNull(linkedTreeMap_Node1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LinkedTreeMap.Node<Integer, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, Integer>();
      LinkedTreeMap<String, Map.Entry<Integer, Integer>> linkedTreeMap0 = new LinkedTreeMap<String, Map.Entry<Integer, Integer>>();
      boolean boolean0 = linkedTreeMap0.containsKey(linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Integer, Comparable<Object>> linkedTreeMap0 = new LinkedTreeMap<Integer, Comparable<Object>>(comparator0);
      linkedTreeMap0.clear();
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      LinkedTreeMap<LinkedTreeMap<Object, String>, Object> linkedTreeMap0 = new LinkedTreeMap<LinkedTreeMap<Object, String>, Object>(comparator0);
      Comparator<Object> comparator1 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, String> linkedTreeMap1 = new LinkedTreeMap<Object, String>(comparator1);
      linkedTreeMap0.putIfAbsent(linkedTreeMap1, linkedTreeMap1);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      boolean boolean0 = linkedTreeMap_KeySet0.remove(linkedTreeMap0);
      assertEquals(0, linkedTreeMap_KeySet0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, Comparable<Object>> linkedTreeMap0 = new LinkedTreeMap<String, Comparable<Object>>(comparator0);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      boolean boolean0 = linkedTreeMap_KeySet0.remove(linkedTreeMap0);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LinkedTreeMap<String, Map.Entry<Integer, Integer>> linkedTreeMap0 = new LinkedTreeMap<String, Map.Entry<Integer, Integer>>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.remove(linkedTreeMap0);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Comparable<Map.Entry<Integer, Integer>>, String> linkedTreeMap0 = new LinkedTreeMap<Comparable<Map.Entry<Integer, Integer>>, String>(comparator0);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      LinkedTreeMap.Node<Integer, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, Integer>();
      AbstractMap.SimpleImmutableEntry<Integer, Integer> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Integer, Integer>(linkedTreeMap_Node0);
      boolean boolean0 = linkedTreeMap_EntrySet0.remove(abstractMap_SimpleImmutableEntry0);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.contains(linkedTreeMap0);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LinkedTreeMap.Node<Integer, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, Integer>();
      linkedTreeMap_Node0.right = linkedTreeMap_Node0;
      // Undeclared exception!
      linkedTreeMap_Node0.last();
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LinkedTreeMap.Node<Integer, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, Integer>();
      LinkedTreeMap.Node<Integer, Integer> linkedTreeMap_Node1 = linkedTreeMap_Node0.last();
      assertNotNull(linkedTreeMap_Node1);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LinkedTreeMap.Node<Comparable<Object>, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Comparable<Object>, String>();
      linkedTreeMap_Node0.left = linkedTreeMap_Node0;
      // Undeclared exception!
      linkedTreeMap_Node0.first();
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LinkedTreeMap.Node<Comparable<Object>, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Comparable<Object>, String>();
      linkedTreeMap_Node0.value = "com.google.gson.internal.LinkedTreeMap$KeySet$1";
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, Integer>();
      boolean boolean0 = linkedTreeMap_Node1.equals(linkedTreeMap_Node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LinkedTreeMap.Node<Comparable<Object>, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Comparable<Object>, String>();
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, Integer>();
      Integer integer0 = new Integer(26);
      linkedTreeMap_Node1.value = integer0;
      boolean boolean0 = linkedTreeMap_Node1.equals(linkedTreeMap_Node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Integer integer0 = Integer.getInteger("", (-2));
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Integer>();
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, Integer>(linkedTreeMap_Node0, integer0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      boolean boolean0 = linkedTreeMap_Node1.equals(linkedTreeMap_Node1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LinkedTreeMap<String, Map.Entry<Integer, Integer>> linkedTreeMap0 = new LinkedTreeMap<String, Map.Entry<Integer, Integer>>();
      LinkedTreeMap.Node<String, Map.Entry<Integer, Integer>> linkedTreeMap_Node0 = linkedTreeMap0.find("", true);
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, Integer>();
      boolean boolean0 = linkedTreeMap_Node1.equals(linkedTreeMap_Node0);
      assertEquals(1, linkedTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LinkedTreeMap.Node<Integer, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, Integer>();
      Integer integer0 = Integer.getInteger("", (-2));
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, Integer>();
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node2 = new LinkedTreeMap.Node<Object, Integer>(linkedTreeMap_Node1, integer0, linkedTreeMap_Node1, linkedTreeMap_Node1);
      boolean boolean0 = linkedTreeMap_Node2.equals(linkedTreeMap_Node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Integer>();
      Integer integer0 = new Integer(1427);
      boolean boolean0 = linkedTreeMap_Node0.equals(integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LinkedTreeMap<Object, Comparable<Object>> linkedTreeMap0 = new LinkedTreeMap<Object, Comparable<Object>>();
      linkedTreeMap0.keySet();
      Set<Object> set0 = linkedTreeMap0.keySet();
      assertNotNull(set0);
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LinkedTreeMap<Integer, AbstractMap.SimpleImmutableEntry<String, Object>> linkedTreeMap0 = new LinkedTreeMap<Integer, AbstractMap.SimpleImmutableEntry<String, Object>>();
      linkedTreeMap0.entrySet();
      BiConsumer<Object, Object> biConsumer0 = (BiConsumer<Object, Object>) mock(BiConsumer.class, new ViolatedAssumptionAnswer());
      linkedTreeMap0.forEach(biConsumer0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LinkedTreeMap<String, Map.Entry<Integer, Integer>> linkedTreeMap0 = new LinkedTreeMap<String, Map.Entry<Integer, Integer>>();
      LinkedTreeMap.Node<Integer, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, Integer>();
      linkedTreeMap0.put("JP%B;RS0?s+c:D)'", linkedTreeMap_Node0);
      linkedTreeMap0.put("_`w?`XIcm?I}w", (Map.Entry<Integer, Integer>) null);
      linkedTreeMap0.put("", linkedTreeMap_Node0);
      assertEquals(3, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LinkedTreeMap<String, Map.Entry<Integer, Integer>> linkedTreeMap0 = new LinkedTreeMap<String, Map.Entry<Integer, Integer>>();
      LinkedTreeMap.Node<Integer, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, Integer>();
      linkedTreeMap0.put("JP%B;RS0?s+c:D)'", linkedTreeMap_Node0);
      linkedTreeMap0.put("=,+`7ft{Zuvr", (Map.Entry<Integer, Integer>) null);
      LinkedTreeMap.Node<String, Map.Entry<Integer, Integer>> linkedTreeMap_Node1 = linkedTreeMap0.find("", true);
      assertNotNull(linkedTreeMap_Node1);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LinkedTreeMap.Node<Integer, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, Integer>();
      LinkedTreeMap<String, Map.Entry<Integer, Integer>> linkedTreeMap0 = new LinkedTreeMap<String, Map.Entry<Integer, Integer>>();
      linkedTreeMap0.put("", linkedTreeMap_Node0);
      linkedTreeMap0.put(">", (Map.Entry<Integer, Integer>) null);
      linkedTreeMap0.put("rT{*_0jG6UkfZh[HzF", (Map.Entry<Integer, Integer>) null);
      assertEquals(3, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      LinkedTreeMap<String, Map.Entry<Integer, Integer>> linkedTreeMap0 = new LinkedTreeMap<String, Map.Entry<Integer, Integer>>();
      LinkedTreeMap.Node<Integer, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, Integer>();
      linkedTreeMap0.put("8", linkedTreeMap_Node0);
      linkedTreeMap0.find("", true);
      Map.Entry<Integer, Integer> map_Entry0 = linkedTreeMap0.put("\"D6. 7K", (Map.Entry<Integer, Integer>) null);
      assertNull(map_Entry0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      LinkedTreeMap<String, Integer> linkedTreeMap0 = new LinkedTreeMap<String, Integer>();
      LinkedTreeMap.Node<String, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Integer>();
      LinkedTreeMap.Node<String, Integer> linkedTreeMap_Node1 = new LinkedTreeMap.Node<String, Integer>(linkedTreeMap_Node0, "", linkedTreeMap_Node0, linkedTreeMap_Node0);
      linkedTreeMap_Node1.left = linkedTreeMap_Node0;
      linkedTreeMap_Node0.right = linkedTreeMap_Node1;
      linkedTreeMap_Node1.right = linkedTreeMap_Node1.left;
      linkedTreeMap0.removeInternal(linkedTreeMap_Node1, false);
      assertEquals((-1), linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      LinkedTreeMap<String, Integer> linkedTreeMap0 = new LinkedTreeMap<String, Integer>();
      LinkedTreeMap.Node<String, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Integer>();
      LinkedTreeMap.Node<String, Integer> linkedTreeMap_Node1 = new LinkedTreeMap.Node<String, Integer>(linkedTreeMap_Node0, "", linkedTreeMap_Node0, linkedTreeMap_Node0);
      linkedTreeMap_Node1.left = linkedTreeMap_Node0;
      linkedTreeMap_Node1.right = linkedTreeMap_Node1.left;
      // Undeclared exception!
      try { 
        linkedTreeMap0.removeInternal(linkedTreeMap_Node1, false);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      LinkedTreeMap<String, Integer> linkedTreeMap0 = new LinkedTreeMap<String, Integer>();
      LinkedTreeMap.Node<String, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Integer>();
      LinkedTreeMap.Node<String, Integer> linkedTreeMap_Node1 = new LinkedTreeMap.Node<String, Integer>();
      linkedTreeMap_Node1.left = linkedTreeMap_Node0;
      linkedTreeMap0.removeInternal(linkedTreeMap_Node1, true);
      assertEquals((-1), linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      LinkedTreeMap<String, Map.Entry<Integer, Integer>> linkedTreeMap0 = new LinkedTreeMap<String, Map.Entry<Integer, Integer>>(comparator0);
      linkedTreeMap0.find("", true);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      Integer integer0 = new Integer((-74));
      AbstractMap.SimpleEntry<Integer, Integer> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Integer, Integer>(integer0, integer0);
      boolean boolean0 = linkedTreeMap_EntrySet0.contains(abstractMap_SimpleEntry0);
      assertEquals(1, linkedTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      LinkedTreeMap<String, Map.Entry<Integer, Integer>> linkedTreeMap0 = new LinkedTreeMap<String, Map.Entry<Integer, Integer>>();
      LinkedTreeMap.Node<String, Map.Entry<Integer, Integer>> linkedTreeMap_Node0 = linkedTreeMap0.find("", true);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.contains(linkedTreeMap_Node0);
      assertEquals(1, linkedTreeMap0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      LinkedTreeMap<Comparable<Object>, Object> linkedTreeMap0 = new LinkedTreeMap<Comparable<Object>, Object>((Comparator<? super Comparable<Object>>) null);
      LinkedTreeMap.Node<Comparable<Object>, Object> linkedTreeMap_Node0 = linkedTreeMap0.removeInternalByKey((Object) null);
      assertNull(linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      LinkedTreeMap<Map.Entry<Integer, Integer>, AbstractMap.SimpleEntry<String, Object>> linkedTreeMap0 = new LinkedTreeMap<Map.Entry<Integer, Integer>, AbstractMap.SimpleEntry<String, Object>>();
      LinkedTreeMap.Node<Integer, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, Integer>();
      AbstractMap.SimpleEntry<Integer, Integer> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Integer, Integer>(linkedTreeMap_Node0);
      // Undeclared exception!
      try { 
        linkedTreeMap0.find(abstractMap_SimpleEntry0, true);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.AbstractMap$SimpleEntry is not Comparable
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      LinkedTreeMap<String, Map.Entry<Integer, Integer>> linkedTreeMap0 = new LinkedTreeMap<String, Map.Entry<Integer, Integer>>();
      LinkedTreeMap.Node<Integer, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, Integer>();
      linkedTreeMap0.put("JP%B;RS0?s+c:D)'", linkedTreeMap_Node0);
      linkedTreeMap0.put("_`w?`XIcm?I}w", linkedTreeMap_Node0);
      linkedTreeMap0.put("V8k2", (Map.Entry<Integer, Integer>) null);
      assertEquals(3, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Map.Entry<String, Object>, AbstractMap.SimpleEntry<String, Object>> linkedTreeMap0 = new LinkedTreeMap<Map.Entry<String, Object>, AbstractMap.SimpleEntry<String, Object>>(comparator0);
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Object>();
      linkedTreeMap0.remove((Object) linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      LinkedTreeMap<Comparable<Object>, Comparable<String>> linkedTreeMap0 = new LinkedTreeMap<Comparable<Object>, Comparable<String>>();
      // Undeclared exception!
      try { 
        linkedTreeMap0.put((Comparable<Object>) null, "UpR2L,");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // key == null
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      LinkedTreeMap.Node<Integer, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, Integer>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      LinkedTreeMap<Map.Entry<String, Integer>, LinkedTreeMap<String, Object>> linkedTreeMap0 = new LinkedTreeMap<Map.Entry<String, Integer>, LinkedTreeMap<String, Object>>(comparator0);
      LinkedTreeMap.Node<String, Integer> linkedTreeMap_Node1 = new LinkedTreeMap.Node<String, Integer>();
      AbstractMap.SimpleImmutableEntry<String, Integer> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<String, Integer>(linkedTreeMap_Node1);
      linkedTreeMap0.find(abstractMap_SimpleImmutableEntry0, true);
      boolean boolean0 = linkedTreeMap0.containsKey(linkedTreeMap_Node0);
      assertEquals(1, linkedTreeMap0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      LinkedTreeMap<String, Map.Entry<Integer, Integer>> linkedTreeMap0 = new LinkedTreeMap<String, Map.Entry<Integer, Integer>>();
      LinkedTreeMap.Node<Integer, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, Integer>();
      linkedTreeMap0.put("JP%B;RS0?s+c:D)'", linkedTreeMap_Node0);
      BiFunction<Object, Map.Entry<Integer, Integer>, Map.Entry<Integer, Integer>> biFunction0 = (BiFunction<Object, Map.Entry<Integer, Integer>, Map.Entry<Integer, Integer>>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(biFunction0).apply(any() , nullable(java.util.Map.Entry.class));
      linkedTreeMap0.compute("JP%B;RS0?s+c:D)'", biFunction0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleEntry<Object, Object>, AbstractMap.SimpleImmutableEntry<Object, Integer>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Object, Object>, AbstractMap.SimpleImmutableEntry<Object, Integer>>();
      int int0 = linkedTreeMap0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      LinkedTreeMap<String, Map.Entry<Integer, Integer>> linkedTreeMap0 = new LinkedTreeMap<String, Map.Entry<Integer, Integer>>();
      LinkedTreeMap.Node<Integer, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, Integer>();
      linkedTreeMap0.put("", linkedTreeMap_Node0);
      BiConsumer<Object, Map.Entry<Integer, Integer>> biConsumer0 = (BiConsumer<Object, Map.Entry<Integer, Integer>>) mock(BiConsumer.class, new ViolatedAssumptionAnswer());
      linkedTreeMap0.forEach(biConsumer0);
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      LinkedTreeMap.Node<Integer, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, Integer>();
      Integer integer0 = new Integer((-1611));
      Integer integer1 = linkedTreeMap_Node0.setValue(integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      LinkedTreeMap.Node<Integer, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, Integer>();
      String string0 = linkedTreeMap_Node0.toString();
      assertEquals("null=null", string0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      LinkedTreeMap<Integer, Object> linkedTreeMap0 = new LinkedTreeMap<Integer, Object>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      int int0 = linkedTreeMap_KeySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      ToLongFunction<String> toLongFunction0 = (ToLongFunction<String>) mock(ToLongFunction.class, new ViolatedAssumptionAnswer());
      Comparator<String> comparator0 = Comparator.comparingLong((ToLongFunction<? super String>) toLongFunction0);
      LinkedTreeMap<String, Map.Entry<Integer, Integer>> linkedTreeMap0 = new LinkedTreeMap<String, Map.Entry<Integer, Integer>>(comparator0);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      linkedTreeMap_KeySet0.iterator();
      assertEquals(0, linkedTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      LinkedTreeMap<Integer, Object> linkedTreeMap0 = new LinkedTreeMap<Integer, Object>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      linkedTreeMap_KeySet0.clear();
      assertEquals(0, linkedTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      LinkedTreeMap<String, Map.Entry<Integer, Integer>> linkedTreeMap0 = new LinkedTreeMap<String, Map.Entry<Integer, Integer>>();
      linkedTreeMap0.put("=", (Map.Entry<Integer, Integer>) null);
      // Undeclared exception!
      try { 
        linkedTreeMap0.find((String) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedTreeMap$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      LinkedTreeMap<String, Map.Entry<Integer, Integer>> linkedTreeMap0 = new LinkedTreeMap<String, Map.Entry<Integer, Integer>>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      linkedTreeMap_EntrySet0.clear();
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }
}