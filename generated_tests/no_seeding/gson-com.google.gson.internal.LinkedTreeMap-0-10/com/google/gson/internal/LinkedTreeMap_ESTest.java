/*
 * This file was automatically generated by EvoSuite
 * Wed Jun 03 15:55:50 GMT 2020
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
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LinkedTreeMap_ESTest extends LinkedTreeMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedTreeMap.Node<Object, AbstractMap.SimpleEntry<Object, Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, AbstractMap.SimpleEntry<Object, Object>>();
      AbstractMap.SimpleEntry<Object, Object> abstractMap_SimpleEntry0 = linkedTreeMap_Node0.getValue();
      assertNull(abstractMap_SimpleEntry0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedTreeMap.Node<Integer, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, String>();
      Integer integer0 = linkedTreeMap_Node0.getKey();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleEntry<String, Integer>, AbstractMap.SimpleEntry<String, Object>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<String, Integer>, AbstractMap.SimpleEntry<String, Object>>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      linkedTreeMap_EntrySet0.iterator();
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>();
      linkedTreeMap0.putIfAbsent("", "8&!;");
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      Integer integer0 = new Integer((-1));
      boolean boolean0 = linkedTreeMap_KeySet0.remove(integer0);
      assertEquals(1, linkedTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>();
      int int0 = linkedTreeMap0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Object, Object>, Object> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Object, Object>, Object>(comparator0);
      LinkedTreeMap.Node<String, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, String>();
      AbstractMap.SimpleImmutableEntry<Object, Object> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Object, Object>(linkedTreeMap_Node0);
      LinkedTreeMap<String, String> linkedTreeMap1 = new LinkedTreeMap<String, String>();
      linkedTreeMap0.putIfAbsent(abstractMap_SimpleImmutableEntry0, linkedTreeMap1);
      int int0 = linkedTreeMap0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Object, Object>, AbstractMap.SimpleImmutableEntry<String, String>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Object, Object>, AbstractMap.SimpleImmutableEntry<String, String>>();
      linkedTreeMap0.size = (-1164);
      int int0 = linkedTreeMap0.size();
      assertEquals((-1164), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>();
      LinkedTreeMap<Integer, Integer> linkedTreeMap1 = new LinkedTreeMap<Integer, Integer>();
      LinkedTreeMap.Node<String, String> linkedTreeMap_Node0 = linkedTreeMap0.removeInternalByKey(linkedTreeMap1);
      assertNull(linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap1.size());
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>(comparator0);
      Comparator<Object> comparator1 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator1).compare(any() , any());
      LinkedTreeMap<Object, AbstractMap.SimpleImmutableEntry<Object, Integer>> linkedTreeMap1 = new LinkedTreeMap<Object, AbstractMap.SimpleImmutableEntry<Object, Integer>>(comparator1);
      LinkedTreeMap.Node<Map.Entry<AbstractMap.SimpleEntry<Integer, Object>, AbstractMap.SimpleEntry<String, Object>>, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Map.Entry<AbstractMap.SimpleEntry<Integer, Object>, AbstractMap.SimpleEntry<String, Object>>, Integer>();
      AbstractMap.SimpleImmutableEntry<Object, Integer> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Object, Integer>(linkedTreeMap_Node0);
      linkedTreeMap1.putIfAbsent(linkedTreeMap0, abstractMap_SimpleImmutableEntry0);
      linkedTreeMap1.removeInternalByKey(linkedTreeMap0);
      assertEquals(0, linkedTreeMap1.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>();
      linkedTreeMap0.putIfAbsent("", "");
      linkedTreeMap0.put("", (String) null);
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedTreeMap<Integer, Object> linkedTreeMap0 = new LinkedTreeMap<Integer, Object>();
      Integer integer0 = new Integer((-1));
      linkedTreeMap0.find(integer0, true);
      linkedTreeMap0.keySet();
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleEntry<Object, Integer>, AbstractMap.SimpleImmutableEntry<Object, Object>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Object, Integer>, AbstractMap.SimpleImmutableEntry<Object, Object>>();
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<Object, Integer>, AbstractMap.SimpleImmutableEntry<Object, Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<Object, Integer>, AbstractMap.SimpleImmutableEntry<Object, Object>>();
      linkedTreeMap0.removeInternal(linkedTreeMap_Node0, false);
      linkedTreeMap0.keySet();
      assertEquals((-1), linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedTreeMap<LinkedTreeMap<Object, String>, Object> linkedTreeMap0 = new LinkedTreeMap<LinkedTreeMap<Object, String>, Object>();
      linkedTreeMap0.get((Object) null);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<AbstractMap.SimpleEntry<Integer, String>, Integer> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Integer, String>, Integer>(comparator0);
      Comparator<Object> comparator1 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator1).compare(any() , any());
      LinkedTreeMap<Integer, String> linkedTreeMap1 = new LinkedTreeMap<Integer, String>(comparator1);
      Integer integer0 = new Integer(1);
      linkedTreeMap1.put(integer0, "oE{ybr7a");
      linkedTreeMap1.get(linkedTreeMap0);
      assertEquals(1, linkedTreeMap1.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<AbstractMap.SimpleEntry<Integer, String>, Integer> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Integer, String>, Integer>(comparator0);
      linkedTreeMap0.findByObject((Object) null);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      LinkedTreeMap<AbstractMap.SimpleImmutableEntry<String, Object>, Object> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleImmutableEntry<String, Object>, Object>(comparator0);
      Integer integer0 = new Integer((-2578));
      LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, Object>, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, Object>, Object>();
      linkedTreeMap0.root = linkedTreeMap_Node0;
      LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, Object>, Object> linkedTreeMap_Node1 = linkedTreeMap0.findByObject(integer0);
      assertEquals(0, linkedTreeMap0.size());
      assertNotNull(linkedTreeMap_Node1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Integer integer0 = new Integer((-1670));
      LinkedTreeMap<Integer, String> linkedTreeMap0 = new LinkedTreeMap<Integer, String>();
      linkedTreeMap0.find(integer0, false);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Comparable<Integer>, Object> linkedTreeMap0 = new LinkedTreeMap<Comparable<Integer>, Object>(comparator0);
      linkedTreeMap0.find(0, true);
      linkedTreeMap0.entrySet();
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, Integer> linkedTreeMap0 = new LinkedTreeMap<Object, Integer>(comparator0);
      // Undeclared exception!
      try { 
        linkedTreeMap0.removeInternal((LinkedTreeMap.Node<Object, Integer>) null, true);
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
      LinkedTreeMap<Object, AbstractMap.SimpleEntry<String, Object>> linkedTreeMap0 = new LinkedTreeMap<Object, AbstractMap.SimpleEntry<String, Object>>();
      LinkedTreeMap.Node<Object, AbstractMap.SimpleEntry<String, Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, AbstractMap.SimpleEntry<String, Object>>();
      LinkedTreeMap.Node<Object, AbstractMap.SimpleEntry<String, Object>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, AbstractMap.SimpleEntry<String, Object>>(linkedTreeMap_Node0, linkedTreeMap_Node0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      // Undeclared exception!
      try { 
        linkedTreeMap0.removeInternal(linkedTreeMap_Node1, true);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>();
      linkedTreeMap0.putIfAbsent("U#9C]/gQ_TaHp&9\"W", "");
      AbstractMap.SimpleImmutableEntry<String, String> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<String, String>("U#9C]/gQ_TaHp&9\"W", "U#9C]/gQ_TaHp&9\"W");
      // Undeclared exception!
      try { 
        linkedTreeMap0.put(abstractMap_SimpleImmutableEntry0, "");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LinkedTreeMap<LinkedTreeMap<String, String>, AbstractMap.SimpleImmutableEntry<Object, String>> linkedTreeMap0 = new LinkedTreeMap<LinkedTreeMap<String, String>, AbstractMap.SimpleImmutableEntry<Object, String>>();
      LinkedTreeMap<String, String> linkedTreeMap1 = new LinkedTreeMap<String, String>((Comparator<? super String>) null);
      LinkedTreeMap.Node<Map.Entry<AbstractMap.SimpleEntry<Integer, Object>, AbstractMap.SimpleEntry<String, Object>>, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Map.Entry<AbstractMap.SimpleEntry<Integer, Object>, AbstractMap.SimpleEntry<String, Object>>, String>();
      AbstractMap.SimpleEntry<Map.Entry<AbstractMap.SimpleEntry<Integer, Object>, AbstractMap.SimpleEntry<String, Object>>, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Map.Entry<AbstractMap.SimpleEntry<Integer, Object>, AbstractMap.SimpleEntry<String, Object>>, String>(linkedTreeMap_Node0);
      AbstractMap.SimpleImmutableEntry<Object, String> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Object, String>(abstractMap_SimpleEntry0);
      // Undeclared exception!
      try { 
        linkedTreeMap0.put(linkedTreeMap1, abstractMap_SimpleImmutableEntry0);
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
      LinkedTreeMap<Integer, Object> linkedTreeMap0 = new LinkedTreeMap<Integer, Object>();
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
  public void test23()  throws Throwable  {
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>(comparator0);
      boolean boolean0 = linkedTreeMap0.containsKey("");
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, AbstractMap.SimpleEntry<String, Object>> linkedTreeMap0 = new LinkedTreeMap<String, AbstractMap.SimpleEntry<String, Object>>(comparator0);
      linkedTreeMap0.clear();
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleImmutableEntry<String, Object>, AbstractMap.SimpleImmutableEntry<String, Integer>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleImmutableEntry<String, Object>, AbstractMap.SimpleImmutableEntry<String, Integer>>();
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<String, String>, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<String, String>, String>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.remove(linkedTreeMap_Node0);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.remove(linkedTreeMap0);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleImmutableEntry<String, Object>, AbstractMap.SimpleImmutableEntry<String, Integer>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleImmutableEntry<String, Object>, AbstractMap.SimpleImmutableEntry<String, Integer>>();
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<String, String>, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<String, String>, String>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.contains(linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      LinkedTreeMap<String, Comparable<Integer>> linkedTreeMap0 = new LinkedTreeMap<String, Comparable<Integer>>(comparator0);
      LinkedTreeMap.Node<String, Comparable<Integer>> linkedTreeMap_Node0 = linkedTreeMap0.find("", true);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.contains(linkedTreeMap_Node0);
      assertEquals(1, linkedTreeMap0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.contains((Object) null);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LinkedTreeMap.Node<String, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, String>();
      LinkedTreeMap.Node<String, String> linkedTreeMap_Node1 = new LinkedTreeMap.Node<String, String>(linkedTreeMap_Node0, "", linkedTreeMap_Node0, linkedTreeMap_Node0);
      linkedTreeMap_Node0.right = linkedTreeMap_Node1;
      LinkedTreeMap.Node<String, String> linkedTreeMap_Node2 = linkedTreeMap_Node0.last();
      assertNotNull(linkedTreeMap_Node2);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LinkedTreeMap.Node<Integer, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, String>();
      Integer integer0 = new Integer((-1422));
      LinkedTreeMap.Node<Integer, String> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Integer, String>(linkedTreeMap_Node0, integer0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      linkedTreeMap_Node0.left = linkedTreeMap_Node1;
      LinkedTreeMap.Node<Integer, String> linkedTreeMap_Node2 = linkedTreeMap_Node0.first();
      assertNotNull(linkedTreeMap_Node2);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LinkedTreeMap.Node<Integer, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, Integer>();
      Integer integer0 = new Integer(186);
      Integer integer1 = linkedTreeMap_Node0.setValue(integer0);
      assertNull(integer1);
      
      boolean boolean0 = linkedTreeMap_Node0.equals(linkedTreeMap_Node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LinkedTreeMap.Node<Integer, AbstractMap.SimpleEntry<Object, Integer>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, AbstractMap.SimpleEntry<Object, Integer>>();
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<Integer, Object>, AbstractMap.SimpleEntry<String, Object>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<Integer, Object>, AbstractMap.SimpleEntry<String, Object>>();
      LinkedTreeMap.Node<String, String> linkedTreeMap_Node2 = new LinkedTreeMap.Node<String, String>();
      AbstractMap.SimpleEntry<String, Object> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<String, Object>(linkedTreeMap_Node2);
      AbstractMap.SimpleEntry<String, Object> abstractMap_SimpleEntry1 = linkedTreeMap_Node1.setValue(abstractMap_SimpleEntry0);
      assertNull(abstractMap_SimpleEntry1);
      
      boolean boolean0 = linkedTreeMap_Node0.equals(linkedTreeMap_Node1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LinkedTreeMap.Node<Object, LinkedTreeMap<Integer, String>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, LinkedTreeMap<Integer, String>>();
      LinkedTreeMap.Node<Integer, Integer> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Integer, Integer>();
      Integer integer0 = new Integer(30);
      Integer integer1 = linkedTreeMap_Node1.setValue(integer0);
      assertNull(integer1);
      
      boolean boolean0 = linkedTreeMap_Node1.equals(linkedTreeMap_Node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Integer integer0 = new Integer(3);
      LinkedTreeMap.Node<Integer, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, Integer>();
      LinkedTreeMap.Node<Integer, Integer> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Integer, Integer>(linkedTreeMap_Node0, integer0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<Integer, Object>, AbstractMap.SimpleEntry<String, Object>> linkedTreeMap_Node2 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<Integer, Object>, AbstractMap.SimpleEntry<String, Object>>();
      boolean boolean0 = linkedTreeMap_Node1.equals(linkedTreeMap_Node2);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LinkedTreeMap.Node<Integer, AbstractMap.SimpleEntry<Object, Integer>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, AbstractMap.SimpleEntry<Object, Integer>>();
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<Integer, Object>, AbstractMap.SimpleEntry<String, Object>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<Integer, Object>, AbstractMap.SimpleEntry<String, Object>>();
      boolean boolean0 = linkedTreeMap_Node0.equals(linkedTreeMap_Node1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LinkedTreeMap.Node<String, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, String>();
      LinkedTreeMap.Node<String, String> linkedTreeMap_Node1 = new LinkedTreeMap.Node<String, String>(linkedTreeMap_Node0, "", linkedTreeMap_Node0, linkedTreeMap_Node0);
      boolean boolean0 = linkedTreeMap_Node1.equals(linkedTreeMap_Node1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LinkedTreeMap.Node<Integer, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, Integer>();
      Integer integer0 = Integer.getInteger("@sketyHc\u0000l>BH66");
      LinkedTreeMap.Node<Integer, Integer> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Integer, Integer>(linkedTreeMap_Node0, (Integer) null, linkedTreeMap_Node0, linkedTreeMap_Node0);
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<Integer, Object>, AbstractMap.SimpleEntry<String, Object>> linkedTreeMap_Node2 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<Integer, Object>, AbstractMap.SimpleEntry<String, Object>>();
      AbstractMap.SimpleEntry<Integer, Object> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Integer, Object>(integer0, (Object) null);
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<Integer, Object>, AbstractMap.SimpleEntry<String, Object>> linkedTreeMap_Node3 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<Integer, Object>, AbstractMap.SimpleEntry<String, Object>>(linkedTreeMap_Node2, abstractMap_SimpleEntry0, linkedTreeMap_Node2, linkedTreeMap_Node2);
      boolean boolean0 = linkedTreeMap_Node1.equals(linkedTreeMap_Node3);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>(comparator0);
      linkedTreeMap0.keySet();
      Set<String> set0 = linkedTreeMap0.keySet();
      assertNotNull(set0);
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>();
      linkedTreeMap0.entrySet();
      linkedTreeMap0.putAll(linkedTreeMap0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>();
      linkedTreeMap0.putIfAbsent("- \"", "- \"");
      linkedTreeMap0.put("<MjFV+", "-!<v");
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      boolean boolean0 = linkedTreeMap_KeySet0.remove("<MjFV+");
      assertEquals(1, linkedTreeMap0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>();
      linkedTreeMap0.put("mrY7n=iqn&n,`", "");
      linkedTreeMap0.putIfAbsent("/[", "/[");
      String string0 = linkedTreeMap0.put("", "");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>();
      linkedTreeMap0.putIfAbsent("", "");
      linkedTreeMap0.put("8&;", "8&;");
      linkedTreeMap0.put("@C`", "");
      assertEquals(3, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>();
      LinkedTreeMap.Node<String, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, String>();
      LinkedTreeMap.Node<String, String> linkedTreeMap_Node1 = new LinkedTreeMap.Node<String, String>(linkedTreeMap_Node0, "^B.", linkedTreeMap_Node0, linkedTreeMap_Node0);
      linkedTreeMap0.root = linkedTreeMap_Node1;
      linkedTreeMap0.putIfAbsent("", "");
      // Undeclared exception!
      try { 
        linkedTreeMap0.put("8&;", "8&;");
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>();
      linkedTreeMap0.put("mrY7n=iqn&n,`", "com.google.gson.internal.LinkedTreeMap$KeySet");
      linkedTreeMap0.putIfAbsent("6[", "6[");
      linkedTreeMap0.put("com.google.gson.internal.LinkedTreeMap$KeySet", "com.google.gson.internal.LinkedTreeMap$KeySet");
      assertEquals(3, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      LinkedTreeMap<Object, AbstractMap.SimpleEntry<String, Object>> linkedTreeMap0 = new LinkedTreeMap<Object, AbstractMap.SimpleEntry<String, Object>>();
      LinkedTreeMap.Node<Object, AbstractMap.SimpleEntry<String, Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, AbstractMap.SimpleEntry<String, Object>>();
      LinkedTreeMap.Node<Object, AbstractMap.SimpleEntry<String, Object>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, AbstractMap.SimpleEntry<String, Object>>();
      linkedTreeMap_Node0.right = linkedTreeMap_Node1;
      linkedTreeMap0.removeInternal(linkedTreeMap_Node0, true);
      assertEquals((-1), linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      LinkedTreeMap<Object, AbstractMap.SimpleEntry<String, Object>> linkedTreeMap0 = new LinkedTreeMap<Object, AbstractMap.SimpleEntry<String, Object>>();
      LinkedTreeMap.Node<Object, AbstractMap.SimpleEntry<String, Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, AbstractMap.SimpleEntry<String, Object>>();
      LinkedTreeMap.Node<Object, AbstractMap.SimpleEntry<String, Object>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, AbstractMap.SimpleEntry<String, Object>>();
      linkedTreeMap_Node0.left = linkedTreeMap_Node1;
      linkedTreeMap0.removeInternal(linkedTreeMap_Node0, true);
      assertEquals((-1), linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>();
      AbstractMap.SimpleImmutableEntry<String, String> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<String, String>("U#9C]/gQ_TaHp&9\"W", "U#9C]/gQ_TaHp&9\"W");
      linkedTreeMap0.put("U#9C]/gQ_TaHp&9\"W", "U#9C]/gQ_TaHp&9\"W");
      linkedTreeMap0.findByEntry(abstractMap_SimpleImmutableEntry0);
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      AbstractMap.SimpleImmutableEntry<String, String> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<String, String>("U#9C]/gQ_TaHp&9\"W", "U#9C]/gQ_TaHp&9\"W");
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      LinkedTreeMap<LinkedTreeMap<Map.Entry<AbstractMap.SimpleEntry<Integer, Object>, AbstractMap.SimpleEntry<String, Object>>, String>, Comparable<Map.Entry<AbstractMap.SimpleEntry<Integer, Object>, AbstractMap.SimpleEntry<String, Object>>>> linkedTreeMap0 = new LinkedTreeMap<LinkedTreeMap<Map.Entry<AbstractMap.SimpleEntry<Integer, Object>, AbstractMap.SimpleEntry<String, Object>>, String>, Comparable<Map.Entry<AbstractMap.SimpleEntry<Integer, Object>, AbstractMap.SimpleEntry<String, Object>>>>(comparator0);
      LinkedTreeMap.Node<LinkedTreeMap<Map.Entry<AbstractMap.SimpleEntry<Integer, Object>, AbstractMap.SimpleEntry<String, Object>>, String>, Comparable<Map.Entry<AbstractMap.SimpleEntry<Integer, Object>, AbstractMap.SimpleEntry<String, Object>>>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<LinkedTreeMap<Map.Entry<AbstractMap.SimpleEntry<Integer, Object>, AbstractMap.SimpleEntry<String, Object>>, String>, Comparable<Map.Entry<AbstractMap.SimpleEntry<Integer, Object>, AbstractMap.SimpleEntry<String, Object>>>>();
      linkedTreeMap0.root = linkedTreeMap_Node0;
      LinkedTreeMap.Node<LinkedTreeMap<Map.Entry<AbstractMap.SimpleEntry<Integer, Object>, AbstractMap.SimpleEntry<String, Object>>, String>, Comparable<Map.Entry<AbstractMap.SimpleEntry<Integer, Object>, AbstractMap.SimpleEntry<String, Object>>>> linkedTreeMap_Node1 = linkedTreeMap0.findByEntry(abstractMap_SimpleImmutableEntry0);
      assertNull(linkedTreeMap_Node1);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>();
      AbstractMap.SimpleImmutableEntry<String, String> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<String, String>("U#9C]/gQ_TaHp&9\"W", "U#9C]/gQ_TaHp&9\"W");
      linkedTreeMap0.put("U#9C]/gQ_TaHp&9\"W", "L-6!P4=!=g<ABw}");
      linkedTreeMap0.findByEntry(abstractMap_SimpleImmutableEntry0);
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      LinkedTreeMap<LinkedTreeMap<String, String>, String> linkedTreeMap0 = new LinkedTreeMap<LinkedTreeMap<String, String>, String>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, String> linkedTreeMap1 = new LinkedTreeMap<String, String>(comparator0);
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
  public void test52()  throws Throwable  {
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>();
      linkedTreeMap0.putIfAbsent("", "");
      linkedTreeMap0.putIfAbsent("JIy,:P1le@v", (String) null);
      linkedTreeMap0.put("8B^H/SI/<sw|S", (String) null);
      assertEquals(3, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>(comparator0);
      linkedTreeMap0.remove((Object) "4>UGZW.lR");
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>();
      // Undeclared exception!
      try { 
        linkedTreeMap0.put((String) null, "com.google.gson.internal.LinkedTreeMap$KeySet$1");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // key == null
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>();
      linkedTreeMap0.putIfAbsent("", "");
      boolean boolean0 = linkedTreeMap0.containsKey("");
      assertEquals(1, linkedTreeMap0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>();
      linkedTreeMap0.putIfAbsent("J", "J");
      linkedTreeMap0.putAll(linkedTreeMap0);
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<String, String>, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<String, String>, String>();
      String string0 = linkedTreeMap_Node0.toString();
      assertEquals("null=null", string0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      LinkedTreeMap<String, Comparable<Integer>> linkedTreeMap0 = new LinkedTreeMap<String, Comparable<Integer>>(comparator0);
      LinkedTreeMap.Node<String, Comparable<Integer>> linkedTreeMap_Node0 = linkedTreeMap0.find("", true);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      assertEquals(1, linkedTreeMap0.size());
      
      boolean boolean0 = linkedTreeMap_EntrySet0.remove(linkedTreeMap_Node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<AbstractMap.SimpleImmutableEntry<String, String>, Object> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleImmutableEntry<String, String>, Object>(comparator0);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      int int0 = linkedTreeMap_KeySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      linkedTreeMap_KeySet0.iterator();
      assertEquals(0, linkedTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      LinkedTreeMap<Integer, Object> linkedTreeMap0 = new LinkedTreeMap<Integer, Object>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      Integer integer0 = new Integer(545);
      boolean boolean0 = linkedTreeMap_KeySet0.contains(integer0);
      assertEquals(0, linkedTreeMap_KeySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<AbstractMap.SimpleEntry<Integer, String>, Integer> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Integer, String>, Integer>(comparator0);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      linkedTreeMap_KeySet0.clear();
      assertEquals(0, linkedTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>();
      linkedTreeMap0.putIfAbsent("", "");
      // Undeclared exception!
      try { 
        linkedTreeMap0.find((String) null, false);
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
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Comparable<Integer>, Object> linkedTreeMap0 = new LinkedTreeMap<Comparable<Integer>, Object>(comparator0);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      int int0 = linkedTreeMap_EntrySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      LinkedTreeMap<Integer, String> linkedTreeMap0 = new LinkedTreeMap<Integer, String>((Comparator<? super Integer>) null);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      linkedTreeMap_EntrySet0.clear();
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }
}