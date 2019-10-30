/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 29 09:24:36 GMT 2019
 */

package fr.unice.gfarce.interGraph;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import fr.unice.gfarce.interGraph.Zmodel;
import javax.swing.JTabbedPane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Zmodel_ESTest extends Zmodel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Object[][] objectArray0 = new Object[4][0];
      String[] stringArray0 = new String[3];
      Zmodel zmodel0 = new Zmodel(objectArray0, stringArray0);
      zmodel0.removeRow(1);
      assertEquals(3, zmodel0.getRowCount());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String[] stringArray0 = new String[1];
      Object[][] objectArray0 = new Object[7][4];
      Zmodel zmodel0 = new Zmodel(objectArray0, stringArray0);
      // Undeclared exception!
      try { 
        zmodel0.getValueAt(1, 9);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("fr.unice.gfarce.interGraph.Zmodel", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Object[][] objectArray0 = new Object[0][6];
      String[] stringArray0 = new String[8];
      Zmodel zmodel0 = new Zmodel(objectArray0, stringArray0);
      zmodel0.addRow(stringArray0);
      zmodel0.setValueAt("Indice = ", 0, 1);
      assertEquals(1, zmodel0.getRowCount());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Object[][] objectArray0 = new Object[2][4];
      Object[] objectArray1 = new Object[1];
      Object object0 = new Object();
      objectArray1[0] = object0;
      objectArray0[0] = objectArray1;
      String[] stringArray0 = new String[3];
      Zmodel zmodel0 = new Zmodel(objectArray0, stringArray0);
      Object object1 = zmodel0.getValueAt(0, 0);
      assertSame(object1, object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Object[][] objectArray0 = new Object[0][0];
      String[] stringArray0 = new String[4];
      Zmodel zmodel0 = new Zmodel(objectArray0, stringArray0);
      zmodel0.addRow(stringArray0);
      int int0 = zmodel0.getRowCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Object[][] objectArray0 = new Object[1][6];
      String[] stringArray0 = new String[10];
      Zmodel zmodel0 = new Zmodel(objectArray0, stringArray0);
      String string0 = zmodel0.getColumnName(0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Object[][] objectArray0 = new Object[1][7];
      String[] stringArray0 = new String[1];
      stringArray0[0] = "&-lYl$,:o!$2*wp 2;(";
      Zmodel zmodel0 = new Zmodel(objectArray0, stringArray0);
      String string0 = zmodel0.getColumnName(0);
      assertEquals("&-lYl$,:o!$2*wp 2;(", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Object[][] objectArray0 = new Object[0][0];
      String[] stringArray0 = new String[4];
      stringArray0[1] = "";
      Zmodel zmodel0 = new Zmodel(objectArray0, stringArray0);
      String string0 = zmodel0.getColumnName(1);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object[][] objectArray0 = new Object[3][4];
      String[] stringArray0 = new String[0];
      Zmodel zmodel0 = new Zmodel(objectArray0, stringArray0);
      int int0 = zmodel0.getColumnCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String[] stringArray0 = new String[5];
      Object[][] objectArray0 = new Object[8][7];
      objectArray0[0] = (Object[]) null;
      Zmodel zmodel0 = new Zmodel(objectArray0, stringArray0);
      // Undeclared exception!
      try { 
        zmodel0.setValueAt("indice initial = ", 0, 9);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fr.unice.gfarce.interGraph.Zmodel", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String[] stringArray0 = new String[1];
      Integer integer0 = new Integer(8);
      Object[][] objectArray0 = new Object[8][6];
      objectArray0[0] = (Object[]) stringArray0;
      Zmodel zmodel0 = new Zmodel(objectArray0, stringArray0);
      // Undeclared exception!
      try { 
        zmodel0.setValueAt(integer0, 0, 0);
        fail("Expecting exception: ArrayStoreException");
      
      } catch(ArrayStoreException e) {
         //
         // java.lang.Integer
         //
         verifyException("fr.unice.gfarce.interGraph.Zmodel", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Object[][] objectArray0 = new Object[15][6];
      Zmodel zmodel0 = new Zmodel(objectArray0, (String[]) null);
      // Undeclared exception!
      try { 
        zmodel0.removeRow((-1674));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fr.unice.gfarce.interGraph.Zmodel", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Object[][] objectArray0 = new Object[0][5];
      String[] stringArray0 = new String[0];
      Zmodel zmodel0 = new Zmodel(objectArray0, stringArray0);
      // Undeclared exception!
      try { 
        zmodel0.removeRow(24);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fr.unice.gfarce.interGraph.Zmodel", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Object[][] objectArray0 = new Object[1][6];
      String[] stringArray0 = new String[0];
      Zmodel zmodel0 = new Zmodel(objectArray0, stringArray0);
      // Undeclared exception!
      try { 
        zmodel0.removeRow(3000);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("fr.unice.gfarce.interGraph.Zmodel", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String[] stringArray0 = new String[20];
      Zmodel zmodel0 = new Zmodel((Object[][]) null, stringArray0);
      // Undeclared exception!
      try { 
        zmodel0.getValueAt(2, 501);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fr.unice.gfarce.interGraph.Zmodel", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Zmodel zmodel0 = new Zmodel((Object[][]) null, (String[]) null);
      // Undeclared exception!
      try { 
        zmodel0.getRowCount();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fr.unice.gfarce.interGraph.Zmodel", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Object[][] objectArray0 = new Object[16][6];
      Zmodel zmodel0 = new Zmodel(objectArray0, (String[]) null);
      // Undeclared exception!
      try { 
        zmodel0.getColumnName(4);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fr.unice.gfarce.interGraph.Zmodel", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Object[][] objectArray0 = new Object[1][6];
      Zmodel zmodel0 = new Zmodel(objectArray0, (String[]) null);
      // Undeclared exception!
      try { 
        zmodel0.getColumnCount();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fr.unice.gfarce.interGraph.Zmodel", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String[] stringArray0 = new String[10];
      Zmodel zmodel0 = new Zmodel((Object[][]) null, stringArray0);
      // Undeclared exception!
      try { 
        zmodel0.afficheData((Object[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fr.unice.gfarce.interGraph.Zmodel", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Object[][] objectArray0 = new Object[5][6];
      String[] stringArray0 = new String[1];
      objectArray0[4] = (Object[]) stringArray0;
      Zmodel zmodel0 = new Zmodel(objectArray0, stringArray0);
      // Undeclared exception!
      try { 
        zmodel0.afficheData(objectArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("fr.unice.gfarce.interGraph.Zmodel", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Object[][] objectArray0 = new Object[1][6];
      Zmodel zmodel0 = new Zmodel(objectArray0, (String[]) null);
      // Undeclared exception!
      try { 
        zmodel0.addRow((Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fr.unice.gfarce.interGraph.Zmodel", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Object[][] objectArray0 = new Object[0][0];
      String[] stringArray0 = new String[4];
      Zmodel zmodel0 = new Zmodel(objectArray0, stringArray0);
      int int0 = zmodel0.getRowCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Object[][] objectArray0 = new Object[4][0];
      String[] stringArray0 = new String[3];
      Zmodel zmodel0 = new Zmodel(objectArray0, stringArray0);
      int int0 = zmodel0.getColumnCount();
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Object[][] objectArray0 = new Object[1][6];
      String[] stringArray0 = new String[13];
      Zmodel zmodel0 = new Zmodel(objectArray0, stringArray0);
      zmodel0.afficheData(objectArray0);
      assertEquals(13, zmodel0.getColumnCount());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String[] stringArray0 = new String[13];
      Object[][] objectArray0 = new Object[4][4];
      Zmodel zmodel0 = new Zmodel(objectArray0, stringArray0);
      zmodel0.addRow(objectArray0[1]);
      assertEquals(5, zmodel0.getRowCount());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Object[][] objectArray0 = new Object[0][0];
      String[] stringArray0 = new String[4];
      Zmodel zmodel0 = new Zmodel(objectArray0, stringArray0);
      boolean boolean0 = zmodel0.isCellEditable(1, 1139);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Object[][] objectArray0 = new Object[1][7];
      String[] stringArray0 = new String[7];
      Zmodel zmodel0 = new Zmodel(objectArray0, stringArray0);
      JTabbedPane jTabbedPane0 = new JTabbedPane(1);
      // Undeclared exception!
      try { 
        zmodel0.setValueAt(jTabbedPane0, 1, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("fr.unice.gfarce.interGraph.Zmodel", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Object[][] objectArray0 = new Object[16][6];
      String[] stringArray0 = new String[4];
      Zmodel zmodel0 = new Zmodel(objectArray0, stringArray0);
      // Undeclared exception!
      try { 
        zmodel0.getColumnName(4);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("fr.unice.gfarce.interGraph.Zmodel", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Object[][] objectArray0 = new Object[1][6];
      String[] stringArray0 = new String[13];
      Zmodel zmodel0 = new Zmodel(objectArray0, stringArray0);
      Object object0 = zmodel0.getValueAt(0, 0);
      assertNull(object0);
  }
}
