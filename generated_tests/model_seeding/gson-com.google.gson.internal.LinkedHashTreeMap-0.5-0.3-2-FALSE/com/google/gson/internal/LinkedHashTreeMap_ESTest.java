/*
 * This file was automatically generated by EvoSuite
 * Tue Jun 09 13:16:30 GMT 2020
 */

package com.google.gson.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.internal.LinkedHashTreeMap;
import java.lang.reflect.Array;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class LinkedHashTreeMap_ESTest extends LinkedHashTreeMap_ESTest_scaffolding {

  @Test(timeout = 100000)
  public void test00()  throws Throwable  {
      LinkedHashTreeMap<String, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Integer>();
      linkedHashTreeMap0.find("", true);
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      Predicate<Object> predicate0 = Predicate.isEqual((Object) null);
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      linkedHashTreeMap_EntrySet0.removeIf(predicate0);
      assertEquals(1, linkedHashTreeMap0.size());
      
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap1 = new LinkedHashTreeMap<Object, Object>();
      LinkedHashTreeMap<String, Comparable<Object>> linkedHashTreeMap2 = new LinkedHashTreeMap<String, Comparable<Object>>();
      LinkedHashTreeMap<String, AbstractMap.SimpleImmutableEntry<Object, Integer>> linkedHashTreeMap3 = new LinkedHashTreeMap<String, AbstractMap.SimpleImmutableEntry<Object, Integer>>((Comparator<? super String>) null);
      linkedHashTreeMap3.findByObject("");
      LinkedHashTreeMap<Integer, Object> linkedHashTreeMap4 = new LinkedHashTreeMap<Integer, Object>();
      linkedHashTreeMap4.get(predicate0);
      assertEquals(0, linkedHashTreeMap4.size());
  }

  @Test(timeout = 100000)
  public void test01()  throws Throwable  {
      LinkedHashTreeMap<String, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Integer>();
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      linkedHashTreeMap_KeySet0.iterator();
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
  }

  @Test(timeout = 100000)
  public void test02()  throws Throwable  {
      LinkedHashTreeMap<String, Comparable<Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Comparable<Object>>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      linkedHashTreeMap_EntrySet0.iterator();
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
  }

  @Test(timeout = 100000)
  public void test03()  throws Throwable  {
      LinkedHashTreeMap.AvlBuilder<AbstractMap.SimpleEntry<String, Object>, Comparable<String>> linkedHashTreeMap_AvlBuilder0 = new LinkedHashTreeMap.AvlBuilder<AbstractMap.SimpleEntry<String, Object>, Comparable<String>>();
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

  @Test(timeout = 100000)
  public void test04()  throws Throwable  {
      LinkedHashTreeMap.AvlBuilder<AbstractMap.SimpleImmutableEntry<String, Object>, String> linkedHashTreeMap_AvlBuilder0 = new LinkedHashTreeMap.AvlBuilder<AbstractMap.SimpleImmutableEntry<String, Object>, String>();
      linkedHashTreeMap_AvlBuilder0.reset(0);
  }

  @Test(timeout = 100000)
  public void test05()  throws Throwable  {
      LinkedHashTreeMap.AvlBuilder<AbstractMap.SimpleEntry<Object, String>, Integer> linkedHashTreeMap_AvlBuilder0 = new LinkedHashTreeMap.AvlBuilder<AbstractMap.SimpleEntry<Object, String>, Integer>();
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, String>, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, String>, Integer>();
      linkedHashTreeMap_AvlBuilder0.add(linkedHashTreeMap_Node0);
  }

  @Test(timeout = 100000)
  public void test06()  throws Throwable  {
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>();
      int int0 = linkedHashTreeMap0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 100000)
  public void test07()  throws Throwable  {
      LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<Object, String>, String> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<Object, String>, String>((Comparator<? super AbstractMap.SimpleImmutableEntry<Object, String>>) null);
      LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, String>, String> linkedHashTreeMap_Node0 = linkedHashTreeMap0.removeInternalByKey((Object) null);
      assertNull(linkedHashTreeMap_Node0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 100000)
  public void test08()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Integer>(comparator0);
      Integer integer0 = new Integer(392);
      linkedHashTreeMap0.put("", integer0);
      Set<String> set0 = linkedHashTreeMap0.keySet();
      assertTrue(set0.contains(""));
  }

  @Test(timeout = 100000)
  public void test09()  throws Throwable  {
      LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<String, Object>, AbstractMap.SimpleImmutableEntry<Object, Integer>> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<String, Object>, AbstractMap.SimpleImmutableEntry<Object, Integer>>();
      AbstractMap.SimpleImmutableEntry<Object, String> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Object, String>(linkedHashTreeMap0, "");
      linkedHashTreeMap0.findByEntry(abstractMap_SimpleImmutableEntry0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 100000)
  public void test10()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Integer>(comparator0);
      linkedHashTreeMap0.find("", false);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 100000)
  public void test11()  throws Throwable  {
      LinkedHashTreeMap<Comparable<String>, Comparable<Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<Comparable<String>, Comparable<Object>>((Comparator<? super Comparable<String>>) null);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(comparable0).toString();
      linkedHashTreeMap0.putIfAbsent("s", comparable0);
      Set<Map.Entry<Comparable<String>, Comparable<Object>>> set0 = (Set<Map.Entry<Comparable<String>, Comparable<Object>>>)linkedHashTreeMap0.entrySet();
      assertEquals(1, set0.size());
  }

  @Test(timeout = 100000)
  public void test12()  throws Throwable  {
      LinkedHashTreeMap<LinkedHashTreeMap<Integer, Integer>, String> linkedHashTreeMap0 = new LinkedHashTreeMap<LinkedHashTreeMap<Integer, Integer>, String>();
      LinkedHashTreeMap.Node<LinkedHashTreeMap<Integer, Integer>, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<LinkedHashTreeMap<Integer, Integer>, String>();
      linkedHashTreeMap0.removeInternal(linkedHashTreeMap_Node0, true);
      linkedHashTreeMap0.entrySet();
      assertEquals((-1), linkedHashTreeMap0.size());
  }

  @Test(timeout = 100000)
  public void test13()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Comparable<String>, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Comparable<String>, String>(comparator0);
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.put((Comparable<String>) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // key == null
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 100000)
  public void test14()  throws Throwable  {
      LinkedHashTreeMap<String, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Integer>();
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

  @Test(timeout = 100000)
  public void test15()  throws Throwable  {
      LinkedHashTreeMap<Integer, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, String>();
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.find((Integer) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 100000)
  public void test16()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Integer>(comparator0);
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node0 = linkedHashTreeMap0.find("", true);
      LinkedHashTreeMap<AbstractMap.SimpleEntry<String, Integer>, Map.Entry<String, Object>> linkedHashTreeMap1 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<String, Integer>, Map.Entry<String, Object>>();
      AbstractMap.SimpleEntry<String, Integer> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<String, Integer>(linkedHashTreeMap_Node0);
      // Undeclared exception!
      try { 
        linkedHashTreeMap1.find(abstractMap_SimpleEntry0, true);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.AbstractMap$SimpleEntry is not Comparable
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 100000)
  public void test17()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Integer>(comparator0);
      LinkedHashTreeMap.Node<String, Integer>[] linkedHashTreeMap_NodeArray0 = (LinkedHashTreeMap.Node<String, Integer>[]) Array.newInstance(LinkedHashTreeMap.Node.class, 0);
      linkedHashTreeMap0.table = linkedHashTreeMap_NodeArray0;
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.find("ioZs*0.|", true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 100000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        LinkedHashTreeMap.doubleCapacity((LinkedHashTreeMap.Node<Integer, String>[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 100000)
  public void test19()  throws Throwable  {
      LinkedHashTreeMap.AvlIterator<Object, String> linkedHashTreeMap_AvlIterator0 = new LinkedHashTreeMap.AvlIterator<Object, String>();
      LinkedHashTreeMap.Node<Object, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, String>();
      linkedHashTreeMap_AvlIterator0.reset(linkedHashTreeMap_Node0);
      LinkedHashTreeMap.Node<Object, String> linkedHashTreeMap_Node1 = linkedHashTreeMap_AvlIterator0.next();
      assertNotNull(linkedHashTreeMap_Node1);
  }

  @Test(timeout = 100000)
  public void test20()  throws Throwable  {
      LinkedHashTreeMap.AvlIterator<Object, String> linkedHashTreeMap_AvlIterator0 = new LinkedHashTreeMap.AvlIterator<Object, String>();
      LinkedHashTreeMap.Node<Object, String> linkedHashTreeMap_Node0 = linkedHashTreeMap_AvlIterator0.next();
      assertNull(linkedHashTreeMap_Node0);
  }

  @Test(timeout = 100000)
  public void test21()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Integer>(comparator0);
      linkedHashTreeMap0.find("", true);
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      assertEquals(1, linkedHashTreeMap0.size());
      
      Predicate<Object> predicate0 = Predicate.isEqual((Object) "");
      Predicate<Object> predicate1 = predicate0.negate();
      Predicate<Object> predicate2 = predicate1.and(predicate1);
      boolean boolean0 = linkedHashTreeMap_EntrySet0.removeIf(predicate2);
      assertTrue(boolean0);
  }

  @Test(timeout = 100000)
  public void test22()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(7).when(comparator0).compare(any() , any());
      LinkedHashTreeMap<String, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Integer>(comparator0);
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node0 = linkedHashTreeMap0.find("ioZs*0.|", true);
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.contains(linkedHashTreeMap_Node0);
      assertEquals(1, linkedHashTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 100000)
  public void test23()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, String>, String> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, String>, String>(comparator0);
      AbstractMap.SimpleImmutableEntry<String, String> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<String, String>("0>}+", "com.google.gson.internal.LinkedHashTreeMap$EntrySet$1");
      AbstractMap.SimpleEntry<Object, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, String>(abstractMap_SimpleImmutableEntry0);
      linkedHashTreeMap0.find(abstractMap_SimpleEntry0, true);
      assertEquals(1, linkedHashTreeMap0.size());
      
      linkedHashTreeMap0.clear();
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 100000)
  public void test24()  throws Throwable  {
      LinkedHashTreeMap<String, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Integer>();
      Integer integer0 = Integer.valueOf((-3271));
      linkedHashTreeMap0.replace("", integer0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 100000)
  public void test25()  throws Throwable  {
      LinkedHashTreeMap<String, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Integer>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.remove(linkedHashTreeMap0);
      assertFalse(boolean0);
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
  }

  @Test(timeout = 100000)
  public void test26()  throws Throwable  {
      LinkedHashTreeMap<String, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Object>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.contains((Object) null);
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 100000)
  public void test27()  throws Throwable  {
      LinkedHashTreeMap.Node<Object, String>[] linkedHashTreeMap_NodeArray0 = (LinkedHashTreeMap.Node<Object, String>[]) Array.newInstance(LinkedHashTreeMap.Node.class, 3);
      LinkedHashTreeMap.Node<Object, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, String>();
      LinkedHashTreeMap.Node<Object, String> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Object, String>();
      LinkedHashTreeMap.Node<Object, String> linkedHashTreeMap_Node2 = linkedHashTreeMap_Node1.last();
      linkedHashTreeMap_Node1.right = linkedHashTreeMap_Node0;
      linkedHashTreeMap_NodeArray0[2] = linkedHashTreeMap_Node2;
      LinkedHashTreeMap.Node<Object, String>[] linkedHashTreeMap_NodeArray1 = LinkedHashTreeMap.doubleCapacity((LinkedHashTreeMap.Node<Object, String>[]) linkedHashTreeMap_NodeArray0);
      assertEquals(6, linkedHashTreeMap_NodeArray1.length);
  }

  @Test(timeout = 100000)
  public void test28()  throws Throwable  {
      LinkedHashTreeMap.Node<Integer, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Integer, String>();
      Integer integer0 = new Integer(12);
      LinkedHashTreeMap.Node<Integer, String> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Integer, String>(linkedHashTreeMap_Node0, integer0, (-1047), linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      LinkedHashTreeMap.Node<Integer, String> linkedHashTreeMap_Node2 = linkedHashTreeMap_Node1.last();
      LinkedHashTreeMap.Node<Integer, String>[] linkedHashTreeMap_NodeArray0 = (LinkedHashTreeMap.Node<Integer, String>[]) Array.newInstance(LinkedHashTreeMap.Node.class, 4);
      linkedHashTreeMap_NodeArray0[2] = linkedHashTreeMap_Node2;
      LinkedHashTreeMap.Node<Integer, String>[] linkedHashTreeMap_NodeArray1 = LinkedHashTreeMap.doubleCapacity((LinkedHashTreeMap.Node<Integer, String>[]) linkedHashTreeMap_NodeArray0);
      assertEquals(8, linkedHashTreeMap_NodeArray1.length);
  }

  @Test(timeout = 100000)
  public void test29()  throws Throwable  {
      LinkedHashTreeMap<LinkedHashTreeMap<Integer, Integer>, String> linkedHashTreeMap0 = new LinkedHashTreeMap<LinkedHashTreeMap<Integer, Integer>, String>();
      LinkedHashTreeMap.Node<Object, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, String>();
      LinkedHashTreeMap.Node<Object, String> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Object, String>(linkedHashTreeMap_Node0, linkedHashTreeMap0, 116, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      linkedHashTreeMap_Node1.left = linkedHashTreeMap_Node0;
      LinkedHashTreeMap.Node<Object, String> linkedHashTreeMap_Node2 = linkedHashTreeMap_Node1.first();
      assertEquals(0, linkedHashTreeMap0.size());
      assertNotNull(linkedHashTreeMap_Node2);
  }

  @Test(timeout = 100000)
  public void test30()  throws Throwable  {
      LinkedHashTreeMap.Node<Comparable<String>, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Comparable<String>, String>();
      String string0 = linkedHashTreeMap_Node0.setValue("");
      assertNull(string0);
      
      LinkedHashTreeMap.Node<Integer, Comparable<String>> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Integer, Comparable<String>>();
      boolean boolean0 = linkedHashTreeMap_Node0.equals(linkedHashTreeMap_Node1);
      assertFalse(boolean0);
  }

  @Test(timeout = 100000)
  public void test31()  throws Throwable  {
      LinkedHashTreeMap.Node<String, Comparable<Object>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Comparable<Object>>();
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn("").when(comparable0).toString();
      Comparable<Object> comparable1 = linkedHashTreeMap_Node0.setValue(comparable0);
      assertNull(comparable1);
      
      LinkedHashTreeMap.Node<Object, Object> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Object, Object>();
      boolean boolean0 = linkedHashTreeMap_Node1.equals(linkedHashTreeMap_Node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 100000)
  public void test32()  throws Throwable  {
      LinkedHashTreeMap.Node<String, Comparable<Object>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Comparable<Object>>();
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(comparable0).toString();
      Comparable<Object> comparable1 = linkedHashTreeMap_Node0.setValue(comparable0);
      assertNull(comparable1);
      
      boolean boolean0 = linkedHashTreeMap_Node0.equals(linkedHashTreeMap_Node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 100000)
  public void test33()  throws Throwable  {
      LinkedHashTreeMap<String, Comparable<Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Comparable<Object>>();
      LinkedHashTreeMap.Node<String, Comparable<Object>> linkedHashTreeMap_Node0 = linkedHashTreeMap0.header;
      LinkedHashTreeMap.Node<String, Comparable<Object>> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<String, Comparable<Object>>(linkedHashTreeMap_Node0, "", 2624, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      boolean boolean0 = linkedHashTreeMap_Node1.equals(linkedHashTreeMap_Node0);
      assertFalse(boolean0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 100000)
  public void test34()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Integer>(comparator0);
      linkedHashTreeMap0.find("7gk*)`", true);
      LinkedHashTreeMap.Node<Integer, Comparable<String>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Integer, Comparable<String>>();
      Predicate<Object> predicate0 = Predicate.isEqual((Object) linkedHashTreeMap_Node0);
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.removeIf(predicate0);
      assertEquals(1, linkedHashTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 100000)
  public void test35()  throws Throwable  {
      LinkedHashTreeMap.Node<Comparable<Integer>, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Comparable<Integer>, Integer>();
      LinkedHashTreeMap.Node<Comparable<Integer>, Integer> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Comparable<Integer>, Integer>(linkedHashTreeMap_Node0, 12, (-387), linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      boolean boolean0 = linkedHashTreeMap_Node1.equals(linkedHashTreeMap_Node1);
      assertTrue(boolean0);
  }

  @Test(timeout = 100000)
  public void test36()  throws Throwable  {
      LinkedHashTreeMap.Node<String, Comparable<Object>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Comparable<Object>>();
      Integer integer0 = new Integer(1);
      boolean boolean0 = linkedHashTreeMap_Node0.equals(integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 100000)
  public void test37()  throws Throwable  {
      LinkedHashTreeMap<Object, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Integer>();
      linkedHashTreeMap0.keySet();
      Set<Object> set0 = linkedHashTreeMap0.keySet();
      assertNotNull(set0);
      assertEquals(0, set0.size());
  }

  @Test(timeout = 100000)
  public void test38()  throws Throwable  {
      LinkedHashTreeMap<LinkedHashTreeMap<Integer, Integer>, String> linkedHashTreeMap0 = new LinkedHashTreeMap<LinkedHashTreeMap<Integer, Integer>, String>();
      linkedHashTreeMap0.entrySet();
      Set<Map.Entry<LinkedHashTreeMap<Integer, Integer>, String>> set0 = (Set<Map.Entry<LinkedHashTreeMap<Integer, Integer>, String>>)linkedHashTreeMap0.entrySet();
      assertNotNull(set0);
      assertEquals(0, set0.size());
  }

  @Test(timeout = 100000)
  public void test39()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap.Node<Object, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, String>();
      LinkedHashTreeMap<Object, AbstractMap.SimpleImmutableEntry<Integer, Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, AbstractMap.SimpleImmutableEntry<Integer, Object>>(comparator0);
      LinkedHashTreeMap.Node<Object, AbstractMap.SimpleImmutableEntry<Integer, Object>> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Object, AbstractMap.SimpleImmutableEntry<Integer, Object>>();
      LinkedHashTreeMap.Node<Object, AbstractMap.SimpleImmutableEntry<Integer, Object>> linkedHashTreeMap_Node2 = new LinkedHashTreeMap.Node<Object, AbstractMap.SimpleImmutableEntry<Integer, Object>>(linkedHashTreeMap_Node1, linkedHashTreeMap_Node0, (-2590), linkedHashTreeMap_Node1, linkedHashTreeMap_Node1);
      LinkedHashTreeMap.Node<Object, AbstractMap.SimpleImmutableEntry<Integer, Object>> linkedHashTreeMap_Node3 = linkedHashTreeMap_Node2.first();
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.removeInternal(linkedHashTreeMap_Node3, false);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 100000)
  public void test40()  throws Throwable  {
      LinkedHashTreeMap<String, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Integer>();
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      boolean boolean0 = linkedHashTreeMap_KeySet0.remove("");
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 100000)
  public void test41()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Comparable<Object>, AbstractMap.SimpleEntry<String, Integer>> linkedHashTreeMap0 = new LinkedHashTreeMap<Comparable<Object>, AbstractMap.SimpleEntry<String, Integer>>(comparator0);
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.removeInternal((LinkedHashTreeMap.Node<Comparable<Object>, AbstractMap.SimpleEntry<String, Integer>>) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 100000)
  public void test42()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      LinkedHashTreeMap<String, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Integer>(comparator0);
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node0 = linkedHashTreeMap0.find("ioZs*0.|", true);
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      assertEquals(1, linkedHashTreeMap0.size());
      
      boolean boolean0 = linkedHashTreeMap_EntrySet0.remove(linkedHashTreeMap_Node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 100000)
  public void test43()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-1)).when(comparator0).compare(any() , any());
      LinkedHashTreeMap<String, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Integer>(comparator0);
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node0 = linkedHashTreeMap0.find("", true);
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.remove(linkedHashTreeMap_Node0);
      assertEquals(1, linkedHashTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 100000)
  public void test44()  throws Throwable  {
      LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, Object>, LinkedHashTreeMap<String, String>> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, Object>, LinkedHashTreeMap<String, String>>((Comparator<? super AbstractMap.SimpleEntry<Object, Object>>) null);
      Integer integer0 = new Integer((-3052));
      linkedHashTreeMap0.remove((Object) integer0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 100000)
  public void test45()  throws Throwable  {
      LinkedHashTreeMap<String, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Integer>();
      linkedHashTreeMap0.find("", true);
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      assertEquals(1, linkedHashTreeMap0.size());
      
      linkedHashTreeMap_KeySet0.clear();
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 100000)
  public void test46()  throws Throwable  {
      LinkedHashTreeMap<LinkedHashTreeMap<Integer, Integer>, String> linkedHashTreeMap0 = new LinkedHashTreeMap<LinkedHashTreeMap<Integer, Integer>, String>();
      LinkedHashTreeMap<Integer, Integer> linkedHashTreeMap1 = new LinkedHashTreeMap<Integer, Integer>();
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.put(linkedHashTreeMap1, "");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.google.gson.internal.LinkedHashTreeMap is not Comparable
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 100000)
  public void test47()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Integer>(comparator0);
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      Comparator<Object> comparator1 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, String> linkedHashTreeMap1 = new LinkedHashTreeMap<Object, String>(comparator1);
      boolean boolean0 = linkedHashTreeMap_KeySet0.contains(linkedHashTreeMap1);
      assertFalse(boolean0);
  }

  @Test(timeout = 100000)
  public void test48()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Object>(comparator0);
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      int int0 = linkedHashTreeMap_KeySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 100000)
  public void test49()  throws Throwable  {
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      linkedHashTreeMap_EntrySet0.clear();
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
  }

  @Test(timeout = 100000)
  public void test50()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>(comparator0);
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      int int0 = linkedHashTreeMap_EntrySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 100000)
  public void test51()  throws Throwable  {
      LinkedHashTreeMap.Node<Comparable<String>, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Comparable<String>, String>();
      String string0 = linkedHashTreeMap_Node0.toString();
      assertEquals("null=null", string0);
  }

  @Test(timeout = 100000)
  public void test52()  throws Throwable  {
      LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<AbstractMap.SimpleEntry<Object, Object>, Object>, AbstractMap.SimpleImmutableEntry<AbstractMap.SimpleImmutableEntry<AbstractMap.SimpleImmutableEntry, String>, Object>>[] linkedHashTreeMap_NodeArray0 = (LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<AbstractMap.SimpleEntry<Object, Object>, Object>, AbstractMap.SimpleImmutableEntry<AbstractMap.SimpleImmutableEntry<AbstractMap.SimpleImmutableEntry, String>, Object>>[]) Array.newInstance(LinkedHashTreeMap.Node.class, 0);
      LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<AbstractMap.SimpleEntry<Object, Object>, Object>, AbstractMap.SimpleImmutableEntry<AbstractMap.SimpleImmutableEntry<AbstractMap.SimpleImmutableEntry, String>, Object>>[] linkedHashTreeMap_NodeArray1 = LinkedHashTreeMap.doubleCapacity((LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<AbstractMap.SimpleEntry<Object, Object>, Object>, AbstractMap.SimpleImmutableEntry<AbstractMap.SimpleImmutableEntry<AbstractMap.SimpleImmutableEntry, String>, Object>>[]) linkedHashTreeMap_NodeArray0);
      assertEquals(0, linkedHashTreeMap_NodeArray1.length);
  }

  @Test(timeout = 100000)
  public void test53()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Integer, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, Integer>(comparator0);
      Comparator<Object> comparator1 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, Comparable<Object>> linkedHashTreeMap1 = new LinkedHashTreeMap<Object, Comparable<Object>>(comparator1);
      boolean boolean0 = linkedHashTreeMap1.containsKey(linkedHashTreeMap0);
      assertFalse(boolean0);
  }
}
