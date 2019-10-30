/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 25 21:20:57 GMT 2019
 */

package de.paragon.explorer.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import de.paragon.explorer.figure.ExplorerFigure;
import de.paragon.explorer.figure.Figure;
import de.paragon.explorer.figure.InformationFigure;
import de.paragon.explorer.figure.TextBoxFigure;
import de.paragon.explorer.util.StandardEnumerator;
import java.util.Stack;
import java.util.Vector;
import javax.swing.JLayeredPane;
import javax.swing.table.DefaultTableModel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StandardEnumerator_ESTest extends StandardEnumerator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StandardEnumerator standardEnumerator0 = new StandardEnumerator();
      Vector<String> vector0 = new Vector<String>();
      standardEnumerator0.setCount(20);
      standardEnumerator0.removeElement(vector0);
      assertTrue(vector0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StandardEnumerator standardEnumerator0 = new StandardEnumerator();
      standardEnumerator0.setCount(697);
      // Undeclared exception!
      try { 
        standardEnumerator0.nextFigure();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class de.paragon.explorer.util.ResourceBundlePurchaser
         //
         verifyException("de.paragon.explorer.util.StandardEnumerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StandardEnumerator standardEnumerator0 = new StandardEnumerator();
      standardEnumerator0.setCount(1);
      // Undeclared exception!
      try { 
        standardEnumerator0.nextElement();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class de.paragon.explorer.util.ResourceBundlePurchaser
         //
         verifyException("de.paragon.explorer.util.StandardEnumerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StandardEnumerator standardEnumerator0 = new StandardEnumerator();
      standardEnumerator0.setCount(20);
      boolean boolean0 = standardEnumerator0.hasMoreElements();
      assertEquals(0, standardEnumerator0.getCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StandardEnumerator standardEnumerator0 = new StandardEnumerator();
      standardEnumerator0.setCount(1);
      Integer integer0 = JLayeredPane.PALETTE_LAYER;
      standardEnumerator0.addElement(integer0);
      assertEquals(1, standardEnumerator0.getCount());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Stack<TextBoxFigure> stack0 = new Stack<TextBoxFigure>();
      StandardEnumerator standardEnumerator0 = new StandardEnumerator(stack0);
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(0, 642);
      standardEnumerator0.insertElementAt(defaultTableModel0, 0);
      assertTrue(stack0.empty());
      assertEquals(0, stack0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StandardEnumerator standardEnumerator0 = new StandardEnumerator();
      standardEnumerator0.addElement((Object) null);
      Figure figure0 = standardEnumerator0.nextFigure();
      assertNull(figure0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Vector<InformationFigure> vector0 = new Vector<InformationFigure>();
      InformationFigure informationFigure0 = mock(InformationFigure.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null, (String) null).when(informationFigure0).toString();
      vector0.add(informationFigure0);
      StandardEnumerator standardEnumerator0 = new StandardEnumerator(vector0);
      Figure figure0 = standardEnumerator0.nextFigure();
      assertNotNull(figure0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Vector<ExplorerFigure> vector0 = new Vector<ExplorerFigure>();
      StandardEnumerator standardEnumerator0 = new StandardEnumerator();
      Vector<Object> vector1 = standardEnumerator0.getVector();
      boolean boolean0 = vector1.add((Object) vector0);
      boolean boolean1 = standardEnumerator0.isInEnumeration(vector0);
      assertTrue(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Vector<ExplorerFigure> vector0 = new Vector<ExplorerFigure>();
      StandardEnumerator standardEnumerator0 = new StandardEnumerator(vector0);
      Vector<Object> vector1 = standardEnumerator0.getVector();
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      vector1.add((Object) defaultTableModel0);
      standardEnumerator0.nextElement();
      standardEnumerator0.getCount();
      assertEquals(0, vector0.size());
      assertTrue(vector0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StandardEnumerator standardEnumerator0 = new StandardEnumerator();
      standardEnumerator0.setCount((-1780));
      int int0 = standardEnumerator0.getCount();
      assertEquals((-1780), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StandardEnumerator standardEnumerator0 = new StandardEnumerator();
      // Undeclared exception!
      try { 
        standardEnumerator0.setVector((Vector<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.paragon.explorer.util.StandardEnumerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StandardEnumerator standardEnumerator0 = new StandardEnumerator();
      standardEnumerator0.setCount((-1780));
      // Undeclared exception!
      try { 
        standardEnumerator0.nextFigure();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StandardEnumerator standardEnumerator0 = null;
      try {
        standardEnumerator0 = new StandardEnumerator((Vector<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.paragon.explorer.util.StandardEnumerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StandardEnumerator standardEnumerator0 = new StandardEnumerator();
      Vector<Object> vector0 = new Vector<Object>();
      vector0.add((Object) standardEnumerator0);
      standardEnumerator0.setVector(vector0);
      Vector<Object> vector1 = standardEnumerator0.getVector();
      assertEquals(1, vector1.size());
      assertNotSame(vector1, vector0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StandardEnumerator standardEnumerator0 = new StandardEnumerator();
      int int0 = standardEnumerator0.getCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StandardEnumerator standardEnumerator0 = new StandardEnumerator();
      standardEnumerator0.removeElement((Object) null);
      assertEquals(0, standardEnumerator0.getCount());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StandardEnumerator standardEnumerator0 = new StandardEnumerator();
      standardEnumerator0.setCount((-1));
      standardEnumerator0.removeElement((Object) null);
      assertEquals((-1), standardEnumerator0.getCount());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StandardEnumerator standardEnumerator0 = new StandardEnumerator();
      Vector<Object> vector0 = standardEnumerator0.getVector();
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      vector0.add((Object) defaultTableModel0);
      // Undeclared exception!
      try { 
        standardEnumerator0.nextFigure();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // javax.swing.table.DefaultTableModel cannot be cast to de.paragon.explorer.figure.Figure
         //
         verifyException("de.paragon.explorer.util.StandardEnumerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Vector<InformationFigure> vector0 = new Vector<InformationFigure>();
      StandardEnumerator standardEnumerator0 = new StandardEnumerator(vector0);
      // Undeclared exception!
      try { 
        standardEnumerator0.nextFigure();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class de.paragon.explorer.util.ResourceBundlePurchaser
         //
         verifyException("de.paragon.explorer.util.StandardEnumerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StandardEnumerator standardEnumerator0 = new StandardEnumerator();
      standardEnumerator0.setCount((-2408));
      // Undeclared exception!
      try { 
        standardEnumerator0.nextElement();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StandardEnumerator standardEnumerator0 = new StandardEnumerator();
      // Undeclared exception!
      try { 
        standardEnumerator0.nextElement();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class de.paragon.explorer.util.ResourceBundlePurchaser
         //
         verifyException("de.paragon.explorer.util.StandardEnumerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StandardEnumerator standardEnumerator0 = new StandardEnumerator();
      standardEnumerator0.setCount((-1124));
      boolean boolean0 = standardEnumerator0.hasMoreElements();
      assertEquals((-1124), standardEnumerator0.getCount());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StandardEnumerator standardEnumerator0 = new StandardEnumerator();
      standardEnumerator0.addElement((Object) null);
      Object object0 = standardEnumerator0.nextElement();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StandardEnumerator standardEnumerator0 = new StandardEnumerator();
      standardEnumerator0.setCount((-1));
      standardEnumerator0.addElement((Object) null);
      assertEquals((-1), standardEnumerator0.getCount());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Vector<ExplorerFigure> vector0 = new Vector<ExplorerFigure>();
      StandardEnumerator standardEnumerator0 = new StandardEnumerator();
      standardEnumerator0.isInEnumeration(vector0);
      assertEquals(0, standardEnumerator0.getCount());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StandardEnumerator standardEnumerator0 = new StandardEnumerator();
      // Undeclared exception!
      try { 
        standardEnumerator0.insertElementAt("de.paragon.explorer.util.ExplorerManager", 2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2 > 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StandardEnumerator standardEnumerator0 = new StandardEnumerator();
      boolean boolean0 = standardEnumerator0.hasMoreElements();
      assertEquals(0, standardEnumerator0.getCount());
      assertFalse(boolean0);
  }
}