/*
 * This file was automatically generated by EvoSuite
 * Wed Jun 03 22:40:46 GMT 2020
 */

package com.google.gson.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.internal.LinkedHashTreeMap;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LinkedHashTreeMap_ESTest extends LinkedHashTreeMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedHashTreeMap.AvlBuilder<Comparable<Object>, String> linkedHashTreeMap_AvlBuilder0 = new LinkedHashTreeMap.AvlBuilder<Comparable<Object>, String>();
      linkedHashTreeMap_AvlBuilder0.reset(0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedHashTreeMap<String, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Integer>();
      LinkedHashTreeMap<String, Object> linkedHashTreeMap1 = new LinkedHashTreeMap<String, Object>();
      linkedHashTreeMap0.containsValue(linkedHashTreeMap1);
      Integer integer0 = Integer.valueOf((-346));
      BiFunction<String, Object, Integer> biFunction0 = (BiFunction<String, Object, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn(integer0).when(biFunction0).apply(anyString() , any());
      LinkedHashTreeMap<String, Object> linkedHashTreeMap2 = new LinkedHashTreeMap<String, Object>();
      BiFunction<Object, Object, Integer> biFunction1 = (BiFunction<Object, Object, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      linkedHashTreeMap0.replaceAll(biFunction1);
      linkedHashTreeMap0.compute("8z0/dZPBJZpf", biFunction0);
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap1.new EntrySet();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap3 = new LinkedHashTreeMap<Object, Object>(comparator0);
      LinkedHashTreeMap.Node<Object, Object> linkedHashTreeMap_Node0 = linkedHashTreeMap3.findByObject("8z0/dZPBJZpf");
      assertNull(linkedHashTreeMap_Node0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedHashTreeMap.Node<String, String> linkedHashTreeMap_Node0 = null;
      try {
        linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, String>((LinkedHashTreeMap.Node<String, String>) null, "r?0WL!R #L<gPgl", (-1274), (LinkedHashTreeMap.Node<String, String>) null, (LinkedHashTreeMap.Node<String, String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap$Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>(comparator0);
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      linkedHashTreeMap_EntrySet0.iterator();
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedHashTreeMap.AvlBuilder<String, String> linkedHashTreeMap_AvlBuilder0 = new LinkedHashTreeMap.AvlBuilder<String, String>();
      // Undeclared exception!
      try { 
        linkedHashTreeMap_AvlBuilder0.root();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap$AvlBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedHashTreeMap<String, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Integer>();
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node0 = linkedHashTreeMap0.removeInternalByKey((Object) null);
      assertEquals(0, linkedHashTreeMap0.size());
      assertNull(linkedHashTreeMap_Node0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<Object, Object>, String> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<Object, Object>, String>(comparator0);
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap1 = new LinkedHashTreeMap<Object, Object>();
      linkedHashTreeMap1.get(linkedHashTreeMap0);
      assertEquals(0, linkedHashTreeMap1.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedHashTreeMap<AbstractMap.SimpleEntry<Integer, String>, String> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<Integer, String>, String>();
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Integer, String>, String> linkedHashTreeMap_Node0 = linkedHashTreeMap0.find((AbstractMap.SimpleEntry<Integer, String>) null, false);
      assertNull(linkedHashTreeMap_Node0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedHashTreeMap<String, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Integer>();
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node0 = linkedHashTreeMap0.find("", true);
      assertNotNull(linkedHashTreeMap_Node0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedHashTreeMap<Comparable<Object>, Comparable<String>> linkedHashTreeMap0 = new LinkedHashTreeMap<Comparable<Object>, Comparable<String>>();
      Set<Map.Entry<Comparable<Object>, Comparable<String>>> set0 = (Set<Map.Entry<Comparable<Object>, Comparable<String>>>)linkedHashTreeMap0.entrySet();
      assertTrue(set0.isEmpty());
      assertNotNull(set0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Comparable<String>, AbstractMap.SimpleEntry<Object, String>> linkedHashTreeMap0 = new LinkedHashTreeMap<Comparable<String>, AbstractMap.SimpleEntry<Object, String>>(comparator0);
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.findByEntry((Map.Entry<?, ?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<Object, Integer>, AbstractMap.SimpleImmutableEntry<Integer, Integer>> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<Object, Integer>, AbstractMap.SimpleImmutableEntry<Integer, Integer>>((Comparator<? super AbstractMap.SimpleImmutableEntry<Object, Integer>>) null);
      Map.Entry<String, Integer> map_Entry0 = (Map.Entry<String, Integer>) mock(Map.Entry.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(map_Entry0).getKey();
      doReturn((Object) null).when(map_Entry0).getValue();
      AbstractMap.SimpleImmutableEntry<Object, Integer> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Object, Integer>(map_Entry0);
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.find(abstractMap_SimpleImmutableEntry0, true);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.AbstractMap$SimpleImmutableEntry is not Comparable
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        LinkedHashTreeMap.doubleCapacity((LinkedHashTreeMap.Node<Object, AbstractMap.SimpleEntry<Integer, Object>>[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedHashTreeMap<Integer, Comparable<Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, Comparable<Object>>();
      linkedHashTreeMap0.clear();
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>(comparator0);
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      boolean boolean0 = linkedHashTreeMap_KeySet0.remove((Object) null);
      assertFalse(boolean0);
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedHashTreeMap<Integer, Comparable<Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, Comparable<Object>>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.remove("");
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>(comparator0);
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      Object object0 = new Object();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.contains(object0);
      assertFalse(boolean0);
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedHashTreeMap.AvlIterator<String, Object> linkedHashTreeMap_AvlIterator0 = new LinkedHashTreeMap.AvlIterator<String, Object>();
      LinkedHashTreeMap.Node<String, Object> linkedHashTreeMap_Node0 = linkedHashTreeMap_AvlIterator0.next();
      assertNull(linkedHashTreeMap_Node0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedHashTreeMap.AvlIterator<Object, Object> linkedHashTreeMap_AvlIterator0 = new LinkedHashTreeMap.AvlIterator<Object, Object>();
      linkedHashTreeMap_AvlIterator0.reset((LinkedHashTreeMap.Node<Object, Object>) null);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedHashTreeMap.Node<Object, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, Integer>();
      LinkedHashTreeMap.Node<Object, Integer> linkedHashTreeMap_Node1 = linkedHashTreeMap_Node0.first();
      assertNotNull(linkedHashTreeMap_Node1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LinkedHashTreeMap<String, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Integer>();
      Set<String> set0 = linkedHashTreeMap0.keySet();
      assertNotNull(set0);
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<String, String>, AbstractMap.SimpleImmutableEntry<Object, Integer>> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<String, String>, AbstractMap.SimpleImmutableEntry<Object, Integer>>();
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.removeInternal((LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, String>, AbstractMap.SimpleImmutableEntry<Object, Integer>>) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>(comparator0);
      LinkedHashTreeMap.AvlIterator<Object, Comparable<String>> linkedHashTreeMap_AvlIterator0 = new LinkedHashTreeMap.AvlIterator<Object, Comparable<String>>();
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      LinkedHashTreeMap<Object, AbstractMap.SimpleEntry<Object, String>> linkedHashTreeMap1 = new LinkedHashTreeMap<Object, AbstractMap.SimpleEntry<Object, String>>((Comparator<? super Object>) null);
      AbstractMap.SimpleEntry<Object, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, String>(linkedHashTreeMap_AvlIterator0, "x3q1DSNj'n");
      // Undeclared exception!
      try { 
        linkedHashTreeMap1.put(linkedHashTreeMap_KeySet0, abstractMap_SimpleEntry0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.google.gson.internal.LinkedHashTreeMap$KeySet is not Comparable
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LinkedHashTreeMap.AvlIterator<Object, Integer> linkedHashTreeMap_AvlIterator0 = new LinkedHashTreeMap.AvlIterator<Object, Integer>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Object>(comparator0);
      linkedHashTreeMap0.put("", linkedHashTreeMap_AvlIterator0);
      assertEquals(1, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, AbstractMap.SimpleImmutableEntry<Object, Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, AbstractMap.SimpleImmutableEntry<Object, Object>>(comparator0);
      Comparator<Object> comparator1 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, Integer> linkedHashTreeMap1 = new LinkedHashTreeMap<Object, Integer>(comparator1);
      linkedHashTreeMap0.remove((Object) linkedHashTreeMap1);
      assertEquals(0, linkedHashTreeMap1.size());
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Integer, AbstractMap.SimpleEntry<Integer, Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, AbstractMap.SimpleEntry<Integer, Object>>(comparator0);
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.putIfAbsent((Integer) null, (AbstractMap.SimpleEntry<Integer, Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // key == null
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LinkedHashTreeMap.AvlBuilder<Comparable<Object>, AbstractMap.SimpleEntry<Object, String>> linkedHashTreeMap_AvlBuilder0 = new LinkedHashTreeMap.AvlBuilder<Comparable<Object>, AbstractMap.SimpleEntry<Object, String>>();
      linkedHashTreeMap_AvlBuilder0.reset(4);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>();
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      linkedHashTreeMap_KeySet0.clear();
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Object>(comparator0);
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      boolean boolean0 = linkedHashTreeMap_KeySet0.contains(linkedHashTreeMap0);
      assertFalse(boolean0);
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>(comparator0);
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      int int0 = linkedHashTreeMap_KeySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LinkedHashTreeMap<Integer, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, Integer>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      int int0 = linkedHashTreeMap_EntrySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>(comparator0);
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      linkedHashTreeMap_KeySet0.iterator();
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LinkedHashTreeMap.Node<Comparable<Object>, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Comparable<Object>, String>();
      String string0 = linkedHashTreeMap_Node0.setValue("a=Vl^");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LinkedHashTreeMap.Node<Integer, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Integer, Object>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, AbstractMap.SimpleEntry<Object, Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, AbstractMap.SimpleEntry<Object, Object>>(comparator0);
      linkedHashTreeMap0.findByEntry(linkedHashTreeMap_Node0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LinkedHashTreeMap.Node<Comparable<Object>, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Comparable<Object>, String>();
      String string0 = linkedHashTreeMap_Node0.toString();
      assertEquals("null=null", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LinkedHashTreeMap<Integer, AbstractMap.SimpleImmutableEntry<String, Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, AbstractMap.SimpleImmutableEntry<String, Object>>();
      int int0 = linkedHashTreeMap0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LinkedHashTreeMap<String, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Object>();
      boolean boolean0 = linkedHashTreeMap0.containsKey(linkedHashTreeMap0);
      assertFalse(boolean0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LinkedHashTreeMap<String, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Integer>();
      Integer integer0 = Integer.valueOf((-346));
      BiFunction<String, Object, Integer> biFunction0 = (BiFunction<String, Object, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn(integer0).when(biFunction0).apply(anyString() , any());
      linkedHashTreeMap0.compute("8z0/dZPBJZpf", biFunction0);
      linkedHashTreeMap0.keySet();
      assertEquals(1, linkedHashTreeMap0.size());
  }
}
