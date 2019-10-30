/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 28 16:18:33 GMT 2019
 */

package de.progra.charting;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import de.progra.charting.Legend;
import de.progra.charting.model.DefaultChartDataModel;
import de.progra.charting.model.EditableChartDataModel;
import de.progra.charting.model.ObjectChartDataModel;
import de.progra.charting.render.RowColorModel;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.geom.Line2D;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.border.SoftBevelBorder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Legend_ESTest extends Legend_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Number[][] numberArray0 = new Number[2][1];
      Number[] numberArray1 = new Number[0];
      numberArray0[0] = numberArray1;
      numberArray0[1] = numberArray0[0];
      String[] stringArray0 = new String[8];
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel(numberArray0, numberArray0[0], stringArray0);
      RowColorModel rowColorModel0 = new RowColorModel(objectChartDataModel0);
      Legend legend0 = new Legend(rowColorModel0);
      RowColorModel rowColorModel1 = legend0.getRowColorModel();
      assertSame(rowColorModel0, rowColorModel1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int[][] intArray0 = new int[2][6];
      double[] doubleArray0 = new double[0];
      String[] stringArray0 = new String[3];
      stringArray0[0] = "de.progra.charting.render.shape.Triangle2D";
      stringArray0[1] = "de.progra.charting.model.DefaultChartDataModel";
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(intArray0, doubleArray0, stringArray0);
      RowColorModel rowColorModel0 = new RowColorModel(defaultChartDataModel0);
      Legend legend0 = new Legend(rowColorModel0);
      Dimension dimension0 = legend0.getPreferredSize();
      assertEquals(47, dimension0.height);
      assertEquals(396, dimension0.width);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      RowColorModel rowColorModel0 = new RowColorModel(editableChartDataModel0);
      Legend legend0 = new Legend(rowColorModel0);
      legend0.inner_margin = 0;
      Dimension dimension0 = legend0.getPreferredSize();
      assertEquals(0, dimension0.height);
      assertEquals((-2147483613), dimension0.width);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      RowColorModel rowColorModel0 = RowColorModel.getInstance(editableChartDataModel0);
      Legend legend0 = new Legend(rowColorModel0);
      legend0.inner_margin = (-1155);
      Dimension dimension0 = legend0.getPreferredSize();
      assertEquals((-1155), dimension0.height);
      assertEquals(Integer.MIN_VALUE, dimension0.width);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      RowColorModel rowColorModel0 = new RowColorModel(editableChartDataModel0);
      Legend legend0 = new Legend(rowColorModel0);
      Line2D.Double line2D_Double0 = new Line2D.Double(0.0, 5156.149589921144, 5156.149589921144, 1255.52676);
      Rectangle rectangle0 = line2D_Double0.getBounds();
      legend0.colorbox = rectangle0;
      Rectangle rectangle1 = legend0.getColorBox();
      assertEquals(1255.0, rectangle1.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Legend legend0 = new Legend();
      SoftBevelBorder softBevelBorder0 = new SoftBevelBorder(3763);
      JButton jButton0 = new JButton("f@[[e", (Icon) null);
      Rectangle rectangle0 = softBevelBorder0.getInteriorRectangle((Component) jButton0, 4111, Integer.MIN_VALUE, (-3286), 1);
      legend0.setColorBox(rectangle0);
      Rectangle rectangle1 = legend0.getColorBox();
      assertEquals((-3292), rectangle1.width);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Legend legend0 = new Legend();
      Polygon polygon0 = new Polygon();
      Rectangle rectangle0 = polygon0.getBounds();
      legend0.setColorBox(rectangle0);
      Rectangle rectangle1 = legend0.getColorBox();
      assertEquals(0, rectangle1.height);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Legend legend0 = new Legend();
      // Undeclared exception!
      try { 
        legend0.paintDefault((Graphics2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.Legend", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Legend legend0 = new Legend();
      // Undeclared exception!
      try { 
        legend0.getPreferredSize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.Legend", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Legend legend0 = new Legend();
      RowColorModel rowColorModel0 = legend0.getRowColorModel();
      assertNull(rowColorModel0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Legend legend0 = new Legend();
      Font font0 = legend0.getFont();
      AffineTransform affineTransform0 = new AffineTransform((-1877.4), (-1877.4), 1.0, 0.0, 0.0, 13.0);
      Font font1 = font0.deriveFont(affineTransform0);
      legend0.font = font1;
      Font font2 = legend0.getFont();
      assertFalse(font2.isBold());
      assertEquals("Helvetica", font2.getName());
      assertEquals(14, font2.getSize());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Legend legend0 = new Legend();
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel();
      RowColorModel rowColorModel0 = new RowColorModel(defaultChartDataModel0);
      legend0.setRowColorModel(rowColorModel0);
      RowColorModel rowColorModel1 = legend0.getRowColorModel();
      assertSame(rowColorModel1, rowColorModel0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int[][] intArray0 = new int[2][6];
      double[] doubleArray0 = new double[0];
      String[] stringArray0 = new String[3];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(intArray0, doubleArray0, stringArray0);
      RowColorModel rowColorModel0 = new RowColorModel(defaultChartDataModel0);
      Legend legend0 = new Legend(rowColorModel0);
      // Undeclared exception!
      try { 
        legend0.getPreferredSize();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null string passed to TextLayout constructor.
         //
         verifyException("java.awt.font.TextLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Legend legend0 = new Legend((RowColorModel) null);
      legend0.setFont((Font) null);
      Font font0 = legend0.getFont();
      assertNull(font0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Legend legend0 = new Legend();
      legend0.setColorBox((Rectangle) null);
      Rectangle rectangle0 = legend0.getColorBox();
      assertNull(rectangle0);
  }
}