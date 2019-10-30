/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 29 11:15:24 GMT 2019
 */

package de.progra.charting;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import de.progra.charting.CoordSystem;
import de.progra.charting.DefaultChart;
import de.progra.charting.Legend;
import de.progra.charting.Title;
import de.progra.charting.model.ChartDataModel;
import de.progra.charting.model.DefaultChartDataModel;
import de.progra.charting.model.EditableChartDataModel;
import de.progra.charting.model.ObjectChartDataModel;
import de.progra.charting.render.AbstractChartRenderer;
import de.progra.charting.render.BarChartRenderer;
import de.progra.charting.render.RadarChartRenderer;
import de.progra.charting.render.RowColorModel;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Vector;
import javax.swing.CellRendererPane;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractChart_ESTest extends AbstractChart_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultChart defaultChart0 = new DefaultChart();
      Vector<CellRendererPane> vector0 = new Vector<CellRendererPane>();
      JTable jTable0 = new JTable(vector0, vector0);
      JTableHeader jTableHeader0 = jTable0.getTableHeader();
      Rectangle rectangle0 = jTableHeader0.getHeaderRect(3936);
      defaultChart0.setBounds(rectangle0);
      assertEquals(0.0, rectangle0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultChart defaultChart0 = new DefaultChart((ChartDataModel) null, "de.progra.charting.render.PieChartRenderer", (-1));
      HashMap<RadarChartRenderer, Object> hashMap0 = new HashMap<RadarChartRenderer, Object>();
      hashMap0.put((RadarChartRenderer) null, "de.progra.charting.render.PieChartRenderer");
      hashMap0.replace((RadarChartRenderer) null, (Object) null);
      // Undeclared exception!
      try { 
        defaultChart0.setChartRenderer(hashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.AbstractChart", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      DefaultChart defaultChart0 = new DefaultChart(objectChartDataModel0, "\"B|Di>%=", 0, "\"B|Di>%=", "\"B|Di>%=");
      Title title0 = new Title();
      defaultChart0.setTitle(title0);
      assertEquals("Chart Title", title0.getText());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      DefaultChart defaultChart0 = new DefaultChart(objectChartDataModel0, "\"B|Di>%=", 0, "\"B|Di>%=", "\"B|Di>%=");
      defaultChart0.setLegend((Legend) null);
      assertEquals(0, DefaultChart.LINEAR_X_LINEAR_Y);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      DefaultChart defaultChart0 = new DefaultChart();
      defaultChart0.setChartDataModel(editableChartDataModel0);
      assertFalse(editableChartDataModel0.isManualScale());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      DefaultChart defaultChart0 = new DefaultChart(editableChartDataModel0, "FIm<4hr@U", 0, "FIm<4hr@U", "FIm<4hr@U");
      Title title0 = defaultChart0.getTitle();
      assertEquals("FIm<4hr@U", title0.getText());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DefaultChart defaultChart0 = new DefaultChart();
      RowColorModel rowColorModel0 = defaultChart0.getRowColorModel();
      assertNull(rowColorModel0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DefaultChart defaultChart0 = new DefaultChart();
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel();
      RowColorModel rowColorModel0 = RowColorModel.getInstance(defaultChartDataModel0);
      defaultChart0.setRowColorModel(rowColorModel0);
      RowColorModel rowColorModel1 = defaultChart0.getRowColorModel();
      assertEquals(0, rowColorModel1.getRowCount());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      DefaultChart defaultChart0 = new DefaultChart(objectChartDataModel0, "\"B|Di>%=", 0, "\"B|Di>%=", "\"B|Di>%=");
      Legend legend0 = defaultChart0.getLegend();
      assertNotNull(legend0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      DefaultChart defaultChart0 = new DefaultChart(editableChartDataModel0, "FIm<4hr@U", 0, "FIm<4hr@U", "FIm<4hr@U");
      CoordSystem coordSystem0 = defaultChart0.getCoordSystem();
      assertEquals("FIm<4hr@U", coordSystem0.getYAxisUnit());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultChart defaultChart0 = new DefaultChart();
      defaultChart0.renderer = null;
      Map map0 = defaultChart0.getChartRenderer();
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      DefaultChart defaultChart0 = new DefaultChart(objectChartDataModel0, "\"B|Di>%=", 0, "\"B|Di>%=", "\"B|Di>%=");
      ChartDataModel chartDataModel0 = defaultChart0.getChartDataModel();
      assertSame(objectChartDataModel0, chartDataModel0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      DefaultChart defaultChart0 = new DefaultChart(editableChartDataModel0, "FIm<4hr@U", 0, "FIm<4hr@U", "FIm<4hr@U");
      ChartDataModel chartDataModel0 = defaultChart0.getChartDataModel();
      assertSame(editableChartDataModel0, chartDataModel0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DefaultChart defaultChart0 = new DefaultChart();
      Rectangle rectangle0 = new Rectangle(1, 1, 1, 22);
      defaultChart0.bounds = rectangle0;
      Rectangle rectangle1 = defaultChart0.getBounds();
      assertEquals(22.0, rectangle1.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DefaultChart defaultChart0 = new DefaultChart();
      // Undeclared exception!
      try { 
        defaultChart0.render((Graphics2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.DefaultChart", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DefaultChart defaultChart0 = new DefaultChart();
      // Undeclared exception!
      try { 
        defaultChart0.addChartRenderer((AbstractChartRenderer) null, (-509));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.AbstractChart", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DefaultChart defaultChart0 = new DefaultChart((ChartDataModel) null, "de.progra.charting.render.PieChartRenderer", (-1));
      HashMap<RadarChartRenderer, Object> hashMap0 = new HashMap<RadarChartRenderer, Object>();
      hashMap0.put((RadarChartRenderer) null, "de.progra.charting.render.PieChartRenderer");
      // Undeclared exception!
      try { 
        defaultChart0.setChartRenderer(hashMap0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to de.progra.charting.render.AbstractChartRenderer
         //
         verifyException("de.progra.charting.AbstractChart", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DefaultChart defaultChart0 = new DefaultChart();
      Hashtable<BarChartRenderer, RadarChartRenderer> hashtable0 = new Hashtable<BarChartRenderer, RadarChartRenderer>();
      defaultChart0.setChartRenderer(hashtable0);
      assertEquals(0, hashtable0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ChartDataModel chartDataModel0 = mock(ChartDataModel.class, new ViolatedAssumptionAnswer());
      DefaultChart defaultChart0 = new DefaultChart(chartDataModel0, "", 335);
      AbstractChartRenderer abstractChartRenderer0 = defaultChart0.getChartRenderer(1);
      assertNull(abstractChartRenderer0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DefaultChart defaultChart0 = new DefaultChart();
      Rectangle rectangle0 = defaultChart0.getBounds();
      assertNull(rectangle0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DefaultChart defaultChart0 = new DefaultChart();
      Legend legend0 = defaultChart0.getLegend();
      assertNull(legend0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DefaultChart defaultChart0 = new DefaultChart();
      Map map0 = defaultChart0.getChartRenderer();
      assertEquals(0, map0.size());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ChartDataModel chartDataModel0 = mock(ChartDataModel.class, new ViolatedAssumptionAnswer());
      DefaultChart defaultChart0 = new DefaultChart(chartDataModel0, "", 343);
      defaultChart0.setCoordSystem((CoordSystem) null);
      assertEquals(0, DefaultChart.LINEAR_X_LINEAR_Y);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DefaultChart defaultChart0 = new DefaultChart();
      defaultChart0.paintDefault((Graphics2D) null);
      assertEquals(0, DefaultChart.LINEAR_X_LINEAR_Y);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DefaultChart defaultChart0 = new DefaultChart((ChartDataModel) null, "de.progra.charting.render.PieChartRenderer", (-1));
      RadarChartRenderer radarChartRenderer0 = new RadarChartRenderer((ChartDataModel) null);
      defaultChart0.addChartRenderer(radarChartRenderer0, (-1));
      assertEquals(0, DefaultChart.LINEAR_X_LINEAR_Y);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DefaultChart defaultChart0 = new DefaultChart();
      Title title0 = defaultChart0.getTitle();
      assertNull(title0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[][] doubleArray0 = new double[1][6];
      double[] doubleArray1 = new double[5];
      String[] stringArray0 = new String[1];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(doubleArray0, doubleArray1, stringArray0);
      DefaultChart defaultChart0 = new DefaultChart(defaultChartDataModel0, "!OVA!ka_^FJFiiK,YH");
      RowColorModel rowColorModel0 = defaultChart0.getRowColorModel();
      assertEquals(1, rowColorModel0.getRowCount());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DefaultChart defaultChart0 = new DefaultChart();
      CoordSystem coordSystem0 = defaultChart0.getCoordSystem();
      assertNull(coordSystem0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DefaultChart defaultChart0 = new DefaultChart();
      ChartDataModel chartDataModel0 = defaultChart0.getChartDataModel();
      assertNull(chartDataModel0);
  }
}