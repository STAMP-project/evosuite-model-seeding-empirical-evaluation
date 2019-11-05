/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 05 14:36:33 GMT 2019
 */

package src.feudalismGUI;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JTree;
import javax.swing.text.StyledEditorKit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import src.feudalismGUI.GridLayout2;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GridLayout2_ESTest extends GridLayout2_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GridLayout2 gridLayout2_0 = new GridLayout2(1463, (-2018), 1250, 0);
      Integer integer0 = JLayeredPane.DEFAULT_LAYER;
      JOptionPane jOptionPane0 = new JOptionPane(integer0);
      Dimension dimension0 = gridLayout2_0.minimumLayoutSize(jOptionPane0);
      assertEquals(71, dimension0.height);
      assertEquals(62, dimension0.width);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GridLayout2 gridLayout2_0 = new GridLayout2(406, (-1857), 0, 406);
      JRootPane jRootPane0 = new JRootPane();
      Dimension dimension0 = gridLayout2_0.minimumLayoutSize(jRootPane0);
      assertEquals(164440, dimension0.height);
      assertEquals(10, dimension0.width);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JRootPane jRootPane0 = new JRootPane();
      GridLayout2 gridLayout2_0 = new GridLayout2(0, 1111, 2, (-3104));
      Dimension dimension0 = gridLayout2_0.minimumLayoutSize(jRootPane0);
      assertEquals(2230, dimension0.width);
      assertEquals(10, dimension0.height);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GridLayout2 gridLayout2_0 = new GridLayout2();
      JRootPane jRootPane0 = new JRootPane();
      gridLayout2_0.layoutContainer(jRootPane0);
      assertEquals(0, gridLayout2_0.getHgap());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GridLayout2 gridLayout2_0 = new GridLayout2(406, (-1857), 0, 406);
      JRootPane jRootPane0 = new JRootPane();
      Dimension dimension0 = gridLayout2_0.preferredLayoutSize(jRootPane0);
      assertEquals(10, dimension0.width);
      assertEquals(164440, dimension0.height);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GridLayout2 gridLayout2_0 = new GridLayout2();
      Dimension dimension0 = new Dimension();
      JOptionPane jOptionPane0 = new JOptionPane(dimension0.width);
      gridLayout2_0.layoutContainer(jOptionPane0);
      assertEquals(0, gridLayout2_0.getHgap());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Integer integer0 = JLayeredPane.DEFAULT_LAYER;
      JOptionPane jOptionPane0 = new JOptionPane(integer0);
      GridLayout2 gridLayout2_0 = new GridLayout2(3100, 1, (-3104), (-1545));
      Dimension dimension0 = gridLayout2_0.preferredLayoutSize(jOptionPane0);
      assertEquals(62, dimension0.width);
      assertEquals((-4787884), dimension0.height);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Box box0 = Box.createHorizontalBox();
      GridLayout2 gridLayout2_0 = new GridLayout2(4, 4, 4, (-859));
      Dimension dimension0 = gridLayout2_0.minimumLayoutSize(box0);
      assertEquals((-4), dimension0.width);
      assertEquals((-2577), dimension0.height);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GridLayout2 gridLayout2_0 = new GridLayout2(4193, 4193, 4193, 4193);
      Box box0 = Box.createVerticalBox();
      gridLayout2_0.preferredLayoutSize(box0);
      gridLayout2_0.preferredLayoutSize(box0);
      // Undeclared exception!
      gridLayout2_0.preferredLayoutSize(box0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GridLayout2 gridLayout2_0 = new GridLayout2();
      // Undeclared exception!
      try { 
        gridLayout2_0.preferredLayoutSize((Container) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("src.feudalismGUI.GridLayout2", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JTree jTree0 = new JTree();
      GridLayout2 gridLayout2_0 = new GridLayout2((-1253), (-1253), (-1253), 2139);
      // Undeclared exception!
      try { 
        gridLayout2_0.preferredLayoutSize(jTree0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("src.feudalismGUI.GridLayout2", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JPanel jPanel0 = new JPanel();
      GridLayout2 gridLayout2_0 = new GridLayout2();
      gridLayout2_0.setRows((-2602));
      // Undeclared exception!
      try { 
        gridLayout2_0.preferredLayoutSize(jPanel0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("src.feudalismGUI.GridLayout2", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Box box0 = Box.createHorizontalBox();
      GridLayout2 gridLayout2_0 = new GridLayout2(32767, 1619, 32767, 405);
      // Undeclared exception!
      gridLayout2_0.minimumLayoutSize(box0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GridLayout2 gridLayout2_0 = new GridLayout2();
      // Undeclared exception!
      try { 
        gridLayout2_0.minimumLayoutSize((Container) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("src.feudalismGUI.GridLayout2", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GridLayout2 gridLayout2_0 = new GridLayout2();
      gridLayout2_0.setRows((-1339));
      JTree jTree0 = new JTree();
      // Undeclared exception!
      try { 
        gridLayout2_0.minimumLayoutSize(jTree0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("src.feudalismGUI.GridLayout2", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JTree jTree0 = new JTree();
      GridLayout2 gridLayout2_0 = new GridLayout2(0, 5552, 0, 0);
      // Undeclared exception!
      gridLayout2_0.layoutContainer(jTree0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GridLayout2 gridLayout2_0 = new GridLayout2();
      // Undeclared exception!
      try { 
        gridLayout2_0.layoutContainer((Container) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("src.feudalismGUI.GridLayout2", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StyledEditorKit.BoldAction styledEditorKit_BoldAction0 = new StyledEditorKit.BoldAction();
      JCheckBoxMenuItem jCheckBoxMenuItem0 = new JCheckBoxMenuItem(styledEditorKit_BoldAction0);
      JButton jButton0 = new JButton();
      jCheckBoxMenuItem0.add((Component) jButton0);
      GridLayout2 gridLayout2_0 = new GridLayout2(0, (-49), (-1), 0);
      // Undeclared exception!
      try { 
        gridLayout2_0.layoutContainer(jCheckBoxMenuItem0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("src.feudalismGUI.GridLayout2", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GridLayout2 gridLayout2_0 = null;
      try {
        gridLayout2_0 = new GridLayout2(0, 0, 0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // rows and cols cannot both be zero
         //
         verifyException("java.awt.GridLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      GridLayout2 gridLayout2_0 = null;
      try {
        gridLayout2_0 = new GridLayout2(0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // rows and cols cannot both be zero
         //
         verifyException("java.awt.GridLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JTree jTree0 = new JTree();
      GridLayout2 gridLayout2_0 = new GridLayout2(612, 612);
      gridLayout2_0.layoutContainer(jTree0);
      assertFalse(jTree0.isFocusTraversalPolicySet());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      GridLayout2 gridLayout2_0 = new GridLayout2();
      StyledEditorKit.BoldAction styledEditorKit_BoldAction0 = new StyledEditorKit.BoldAction();
      JCheckBoxMenuItem jCheckBoxMenuItem0 = new JCheckBoxMenuItem(styledEditorKit_BoldAction0);
      JButton jButton0 = new JButton();
      jCheckBoxMenuItem0.setSize(4, 1);
      jCheckBoxMenuItem0.add((Component) jButton0);
      gridLayout2_0.layoutContainer(jCheckBoxMenuItem0);
      assertTrue(jCheckBoxMenuItem0.getFocusTraversalKeysEnabled());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      GridLayout2 gridLayout2_0 = new GridLayout2();
      gridLayout2_0.setRows((-200));
      JTree jTree0 = new JTree();
      // Undeclared exception!
      try { 
        gridLayout2_0.layoutContainer(jTree0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      GridLayout2 gridLayout2_0 = new GridLayout2();
      Box box0 = Box.createHorizontalBox();
      gridLayout2_0.layoutContainer(box0);
      assertEquals(0, gridLayout2_0.getVgap());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      GridLayout2 gridLayout2_0 = new GridLayout2();
      Box box0 = Box.createHorizontalBox();
      JCheckBoxMenuItem jCheckBoxMenuItem0 = new JCheckBoxMenuItem();
      box0.add((Component) jCheckBoxMenuItem0);
      Dimension dimension0 = gridLayout2_0.minimumLayoutSize(box0);
      assertEquals(0, dimension0.width);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JPanel jPanel0 = new JPanel();
      GridLayout2 gridLayout2_0 = new GridLayout2((-1965), (-1965));
      // Undeclared exception!
      try { 
        gridLayout2_0.minimumLayoutSize(jPanel0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("src.feudalismGUI.GridLayout2", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JTree jTree0 = new JTree();
      GridLayout2 gridLayout2_0 = new GridLayout2(0, 5552, 0, 0);
      Dimension dimension0 = gridLayout2_0.preferredLayoutSize(jTree0);
      assertEquals(0, dimension0.height);
  }
}
