/*
 * This file was automatically generated by EvoSuite
 * Wed Jun 03 21:02:27 GMT 2020
 */

package com.google.gson.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.internal.LinkedTreeMap;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LinkedTreeMap_ESTest extends LinkedTreeMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedTreeMap<String, Integer> linkedTreeMap0 = new LinkedTreeMap<String, Integer>();
      BiFunction<String, Object, Integer> biFunction0 = (BiFunction<String, Object, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(biFunction0).apply(anyString() , any());
      Integer integer0 = linkedTreeMap0.compute(")y_j*Oj`gu}E,lF'p", biFunction0);
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, LinkedTreeMap<Object, Object>> linkedTreeMap1 = new LinkedTreeMap<String, LinkedTreeMap<Object, Object>>(comparator0);
      LinkedTreeMap.Node<String, LinkedTreeMap<Object, Object>> linkedTreeMap_Node0 = linkedTreeMap1.removeInternalByKey(integer0);
      assertEquals(0, linkedTreeMap1.size());
      assertNull(linkedTreeMap_Node0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleImmutableEntry<String, String>, Comparable<String>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleImmutableEntry<String, String>, Comparable<String>>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, Object> linkedTreeMap1 = new LinkedTreeMap<String, Object>(comparator0);
      linkedTreeMap0.findByObject(linkedTreeMap1);
      assertEquals(0, linkedTreeMap1.size());
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedTreeMap<Object, Integer> linkedTreeMap0 = new LinkedTreeMap<Object, Integer>();
      Integer integer0 = Integer.valueOf((-144));
      linkedTreeMap0.find(integer0, false);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, LinkedTreeMap<Object, String>> linkedTreeMap0 = new LinkedTreeMap<Object, LinkedTreeMap<Object, String>>(comparator0);
      linkedTreeMap0.find("", true);
      linkedTreeMap0.entrySet();
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>((Comparator<? super Object>) null);
      boolean boolean0 = linkedTreeMap0.containsKey((Object) null);
      assertEquals(0, linkedTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedTreeMap<Comparable<Integer>, LinkedTreeMap<Object, Object>> linkedTreeMap0 = new LinkedTreeMap<Comparable<Integer>, LinkedTreeMap<Object, Object>>((Comparator<? super Comparable<Integer>>) null);
      linkedTreeMap0.clear();
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.remove((Object) null);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>(comparator0);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.contains("=");
      assertEquals(0, linkedTreeMap_EntrySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, String>, AbstractMap.SimpleImmutableEntry<String, Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, String>, AbstractMap.SimpleImmutableEntry<String, Object>>();
      LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, String>, AbstractMap.SimpleImmutableEntry<String, Object>> linkedTreeMap_Node1 = linkedTreeMap_Node0.last();
      assertNotNull(linkedTreeMap_Node1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, Object>, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, Object>, String>();
      LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, Object>, String> linkedTreeMap_Node1 = linkedTreeMap_Node0.first();
      assertNotNull(linkedTreeMap_Node1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Object>();
      boolean boolean0 = linkedTreeMap_Node0.equals("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleEntry<Object, Object>, Integer> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Object, Object>, Integer>();
      linkedTreeMap0.keySet();
      Set<AbstractMap.SimpleEntry<Object, Object>> set0 = linkedTreeMap0.keySet();
      assertTrue(set0.isEmpty());
      assertNotNull(set0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Comparable<String>, String> linkedTreeMap0 = new LinkedTreeMap<Comparable<String>, String>(comparator0);
      LinkedTreeMap<String, String> linkedTreeMap1 = new LinkedTreeMap<String, String>();
      linkedTreeMap0.putAll(linkedTreeMap1);
      linkedTreeMap0.putAll(linkedTreeMap1);
      assertEquals(0, linkedTreeMap1.size());
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Object, Object>, Integer> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Object, Object>, Integer>(comparator0);
      Set<Map.Entry<AbstractMap.SimpleImmutableEntry<Object, Object>, Integer>> set0 = (Set<Map.Entry<AbstractMap.SimpleImmutableEntry<Object, Object>, Integer>>)linkedTreeMap0.entrySet();
      assertNotNull(set0);
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedTreeMap<Comparable<Object>, Object> linkedTreeMap0 = new LinkedTreeMap<Comparable<Object>, Object>();
      // Undeclared exception!
      try { 
        linkedTreeMap0.removeInternal((LinkedTreeMap.Node<Comparable<Object>, Object>) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleEntry<String, Object>, Integer> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<String, Object>, Integer>();
      Map.Entry<String, String> map_Entry0 = (Map.Entry<String, String>) mock(Map.Entry.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(map_Entry0).getKey();
      doReturn((Object) null).when(map_Entry0).getValue();
      AbstractMap.SimpleEntry<String, Object> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<String, Object>(map_Entry0);
      Integer integer0 = new Integer(0);
      // Undeclared exception!
      try { 
        linkedTreeMap0.put(abstractMap_SimpleEntry0, integer0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.AbstractMap$SimpleEntry is not Comparable
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedTreeMap<Integer, Integer> linkedTreeMap0 = new LinkedTreeMap<Integer, Integer>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      Iterator<Integer> iterator0 = linkedTreeMap_KeySet0.iterator();
      LinkedTreeMap<Comparable<Integer>, AbstractMap.SimpleEntry<Integer, String>> linkedTreeMap1 = new LinkedTreeMap<Comparable<Integer>, AbstractMap.SimpleEntry<Integer, String>>();
      linkedTreeMap1.remove((Object) iterator0);
      assertEquals(0, linkedTreeMap1.size());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>(comparator0);
      BiFunction<Object, Object, String> biFunction0 = (BiFunction<Object, Object, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(biFunction0).apply(any() , any());
      linkedTreeMap0.put("*Wto(", "*Wto(");
      linkedTreeMap0.merge("*Wto(", "*Wto(", biFunction0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      Integer integer0 = new Integer(1092);
      Object object0 = linkedTreeMap0.get(integer0);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      boolean boolean0 = linkedTreeMap_KeySet0.remove(object0);
      assertEquals(0, linkedTreeMap_KeySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>();
      int int0 = linkedTreeMap0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<Integer, Integer>, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<Integer, Integer>, Object>();
      Object object0 = linkedTreeMap_Node0.setValue((Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LinkedTreeMap<Integer, Integer> linkedTreeMap0 = new LinkedTreeMap<Integer, Integer>();
      Integer integer0 = new Integer(1);
      linkedTreeMap0.put(integer0, integer0);
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Integer>();
      String string0 = linkedTreeMap_Node0.toString();
      assertEquals("null=null", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, String>, AbstractMap.SimpleImmutableEntry<String, Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, String>, AbstractMap.SimpleImmutableEntry<String, Object>>();
      LinkedTreeMap<AbstractMap.SimpleEntry<Object, Object>, Integer> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Object, Object>, Integer>();
      linkedTreeMap0.findByEntry(linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LinkedTreeMap<String, Integer> linkedTreeMap0 = new LinkedTreeMap<String, Integer>((Comparator<? super String>) null);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      int int0 = linkedTreeMap_KeySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>(comparator0);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      boolean boolean0 = linkedTreeMap_KeySet0.contains(linkedTreeMap0);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      linkedTreeMap_KeySet0.clear();
      assertEquals(0, linkedTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      int int0 = linkedTreeMap_EntrySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LinkedTreeMap<Comparable<Object>, Integer> linkedTreeMap0 = new LinkedTreeMap<Comparable<Object>, Integer>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      linkedTreeMap_EntrySet0.iterator();
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      linkedTreeMap_EntrySet0.clear();
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }
}
