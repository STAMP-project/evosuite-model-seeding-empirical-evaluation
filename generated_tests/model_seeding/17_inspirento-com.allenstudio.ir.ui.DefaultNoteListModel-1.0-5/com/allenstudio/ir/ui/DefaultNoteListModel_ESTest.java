/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 05 14:51:45 GMT 2019
 */

package com.allenstudio.ir.ui;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.core.plugins.CommonNote;
import com.allenstudio.ir.event.NoteListDataListener;
import com.allenstudio.ir.ui.DefaultNoteListModel;
import java.util.Enumeration;
import java.util.NoSuchElementException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DefaultNoteListModel_ESTest extends DefaultNoteListModel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      CommonNote commonNote0 = new CommonNote();
      int int0 = defaultNoteListModel0.lastIndexOf((AbstractNote) commonNote0, (-29));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      // Undeclared exception!
      try { 
        defaultNoteListModel0.insertElementAt((AbstractNote) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.allenstudio.ir.ui.DefaultNoteListModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      // Undeclared exception!
      try { 
        defaultNoteListModel0.indexOf((AbstractNote) null, (-13));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -13
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      // Undeclared exception!
      try { 
        defaultNoteListModel0.fireItemRemoved((Object) null, 2769);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null source
         //
         verifyException("java.util.EventObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        defaultNoteListModel0.fireItemAdded(object0, 657);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.allenstudio.ir.ui.DefaultNoteListModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      // Undeclared exception!
      try { 
        defaultNoteListModel0.fireItemAdded((Object) null, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null source
         //
         verifyException("java.util.EventObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      // Undeclared exception!
      try { 
        defaultNoteListModel0.fireContentChanged((Object) null, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null source
         //
         verifyException("java.util.EventObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      // Undeclared exception!
      try { 
        defaultNoteListModel0.add(781, (AbstractNote) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 781 > 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      int int0 = defaultNoteListModel0.indexOf((AbstractNote) null);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      // Undeclared exception!
      try { 
        defaultNoteListModel0.set(0, (AbstractNote) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      // Undeclared exception!
      try { 
        defaultNoteListModel0.lastIndexOf((AbstractNote) null, 1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // 1 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      // Undeclared exception!
      try { 
        defaultNoteListModel0.fireItemRemoved(defaultNoteListModel0, (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.allenstudio.ir.ui.DefaultNoteListModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      // Undeclared exception!
      try { 
        defaultNoteListModel0.insertElementAt((AbstractNote) null, (-1246));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      int int0 = defaultNoteListModel0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      String string0 = defaultNoteListModel0.toString();
      assertEquals("[]", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      AbstractNote[] abstractNoteArray0 = defaultNoteListModel0.toArray();
      assertEquals(0, abstractNoteArray0.length);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      // Undeclared exception!
      try { 
        defaultNoteListModel0.remove(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      // Undeclared exception!
      try { 
        defaultNoteListModel0.addElement((AbstractNote) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.allenstudio.ir.ui.DefaultNoteListModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      Enumeration<AbstractNote> enumeration0 = defaultNoteListModel0.elements();
      assertNotNull(enumeration0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      // Undeclared exception!
      try { 
        defaultNoteListModel0.get(754);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 754 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      // Undeclared exception!
      try { 
        defaultNoteListModel0.lastElement();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      // Undeclared exception!
      try { 
        defaultNoteListModel0.fireContentChanged(defaultNoteListModel0, 12);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.allenstudio.ir.ui.DefaultNoteListModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      // Undeclared exception!
      try { 
        defaultNoteListModel0.elementAt((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      boolean boolean0 = defaultNoteListModel0.isEmpty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      // Undeclared exception!
      try { 
        defaultNoteListModel0.add(0, (AbstractNote) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.allenstudio.ir.ui.DefaultNoteListModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      int int0 = defaultNoteListModel0.lastIndexOf((AbstractNote) null);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      int int0 = defaultNoteListModel0.indexOf((AbstractNote) null, 16);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      int int0 = defaultNoteListModel0.getSize();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      // Undeclared exception!
      try { 
        defaultNoteListModel0.setElementAt((AbstractNote) null, 1547);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1547 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      defaultNoteListModel0.addNoteListDataListener((NoteListDataListener) null);
      assertEquals(0, defaultNoteListModel0.getSize());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      // Undeclared exception!
      try { 
        defaultNoteListModel0.firstElement();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      boolean boolean0 = defaultNoteListModel0.removeElement((AbstractNote) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      int int0 = defaultNoteListModel0.capacity();
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      // Undeclared exception!
      try { 
        defaultNoteListModel0.getElementAt((-642));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      // Undeclared exception!
      try { 
        defaultNoteListModel0.removeElementAt(2776);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2776 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      boolean boolean0 = defaultNoteListModel0.contains((AbstractNote) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      defaultNoteListModel0.removeNoteListDataListener();
      assertEquals(0, defaultNoteListModel0.getSize());
  }
}
