/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 29 13:03:34 GMT 2019
 */

package jahuwaldt.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jahuwaldt.plot.BoxULSymbol;
import jahuwaldt.plot.BoxURSymbol;
import jahuwaldt.plot.PlotDatum;
import jahuwaldt.plot.PlotRun;
import jahuwaldt.plot.PlotSymbol;
import jahuwaldt.plot.SquareSymbol;
import jahuwaldt.plot.TabRSymbol;
import jahuwaldt.plot.ThinRect1Symbol;
import jahuwaldt.plot.ThinRect2Symbol;
import jahuwaldt.plot.Triangle4Symbol;
import java.awt.Color;
import java.text.AttributedCharacterIterator;
import java.time.ZoneId;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PlotRun_ESTest extends PlotRun_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ThinRect2Symbol thinRect2Symbol0 = new ThinRect2Symbol();
      double[] doubleArray0 = new double[9];
      PlotRun plotRun0 = new PlotRun(doubleArray0, doubleArray0, true, thinRect2Symbol0);
      PlotDatum plotDatum0 = new PlotDatum((-1173.767978467), 300.0, false, thinRect2Symbol0);
      plotRun0.add(0, (Object) plotDatum0);
      assertEquals(10, plotRun0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PlotRun plotRun0 = new PlotRun();
      int int0 = plotRun0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      TabRSymbol tabRSymbol0 = new TabRSymbol();
      PlotRun plotRun0 = new PlotRun(doubleArray0, doubleArray0, true, tabRSymbol0);
      int int0 = plotRun0.size();
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      SquareSymbol squareSymbol0 = new SquareSymbol();
      PlotRun plotRun0 = new PlotRun(doubleArray0, doubleArray0, true, squareSymbol0);
      plotRun0.remove(0);
      assertEquals(3, plotRun0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      SquareSymbol squareSymbol0 = new SquareSymbol();
      PlotRun plotRun0 = new PlotRun(doubleArray0, doubleArray0, true, squareSymbol0);
      plotRun0.iterator();
      assertEquals(4, plotRun0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-1586.6251536456);
      PlotRun plotRun0 = new PlotRun(doubleArray0, doubleArray0, true, (PlotSymbol) null);
      double double0 = plotRun0.getMinY();
      assertEquals(2, plotRun0.size());
      assertEquals((-1586.6251536456), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[4] = (-4546.845474297583);
      ThinRect2Symbol thinRect2Symbol0 = new ThinRect2Symbol();
      PlotRun plotRun0 = new PlotRun(doubleArray0, doubleArray0, false, thinRect2Symbol0);
      double double0 = plotRun0.getMinX();
      assertEquals((-4546.845474297583), double0, 0.01);
      assertEquals(9, plotRun0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PlotDatum[] plotDatumArray0 = new PlotDatum[2];
      PlotRun plotRun0 = new PlotRun(plotDatumArray0);
      // Undeclared exception!
      try { 
        plotRun0.setPlotSymbol((PlotSymbol) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.PlotRun", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PlotRun plotRun0 = new PlotRun();
      // Undeclared exception!
      try { 
        plotRun0.set(1, (Object) null);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PlotRun plotRun0 = new PlotRun();
      // Undeclared exception!
      try { 
        plotRun0.set((-2409), (Object) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      BoxURSymbol boxURSymbol0 = new BoxURSymbol();
      PlotRun plotRun0 = new PlotRun(doubleArray0, doubleArray0, true, boxURSymbol0);
      // Undeclared exception!
      try { 
        plotRun0.remove(192);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 192, Size: 1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PlotRun plotRun0 = new PlotRun();
      plotRun0.add((Object) null);
      // Undeclared exception!
      try { 
        plotRun0.getMinY();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.PlotRun", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PlotDatum[] plotDatumArray0 = new PlotDatum[4];
      PlotRun plotRun0 = new PlotRun(plotDatumArray0);
      // Undeclared exception!
      try { 
        plotRun0.getMaxY();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.PlotRun", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PlotDatum[] plotDatumArray0 = new PlotDatum[2];
      PlotRun plotRun0 = new PlotRun(plotDatumArray0);
      // Undeclared exception!
      try { 
        plotRun0.getMaxX();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.PlotRun", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PlotRun plotRun0 = new PlotRun();
      // Undeclared exception!
      try { 
        plotRun0.get(741);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 741, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PlotRun plotRun0 = new PlotRun();
      // Undeclared exception!
      try { 
        plotRun0.get((-251));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      AttributedCharacterIterator.Attribute attributedCharacterIterator_Attribute0 = AttributedCharacterIterator.Attribute.INPUT_METHOD_SEGMENT;
      PlotSymbol plotSymbol0 = mock(PlotSymbol.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(plotSymbol0).clone();
      PlotRun plotRun0 = new PlotRun(doubleArray0, doubleArray0, false, plotSymbol0);
      plotRun0.clone();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PlotRun plotRun0 = new PlotRun();
      // Undeclared exception!
      try { 
        plotRun0.add(727, (Object) null);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 727, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PlotRun plotRun0 = new PlotRun();
      // Undeclared exception!
      try { 
        plotRun0.add((-180), (Object) plotRun0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // jahuwaldt.plot.PlotRun cannot be cast to jahuwaldt.plot.PlotDatum
         //
         verifyException("jahuwaldt.plot.PlotRun", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PlotRun plotRun0 = null;
      try {
        plotRun0 = new PlotRun((PlotDatum[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.PlotRun", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PlotRun plotRun0 = null;
      try {
        plotRun0 = new PlotRun((Collection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.PlotRun", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ThinRect1Symbol thinRect1Symbol0 = new ThinRect1Symbol();
      PlotDatum plotDatum0 = new PlotDatum(0.0, 0.0, false, thinRect1Symbol0);
      ArrayDeque<PlotDatum> arrayDeque0 = new ArrayDeque<PlotDatum>();
      arrayDeque0.add(plotDatum0);
      PlotRun plotRun0 = new PlotRun(arrayDeque0);
      PlotRun plotRun1 = (PlotRun)plotRun0.clone();
      assertEquals(1, plotRun1.size());
      assertNotSame(plotRun1, plotRun0);
      assertEquals(1, plotRun0.size());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PlotRun plotRun0 = new PlotRun();
      ThinRect1Symbol thinRect1Symbol0 = new ThinRect1Symbol();
      PlotDatum plotDatum0 = new PlotDatum(0.0, 0.0, false, thinRect1Symbol0);
      ArrayDeque<PlotDatum> arrayDeque0 = new ArrayDeque<PlotDatum>();
      arrayDeque0.add(plotDatum0);
      plotRun0.addAll((Collection) arrayDeque0);
      plotRun0.setLineColor((Color) null);
      assertEquals(1, plotRun0.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      Triangle4Symbol triangle4Symbol0 = new Triangle4Symbol();
      PlotRun plotRun0 = new PlotRun(doubleArray0, doubleArray0, false, triangle4Symbol0);
      plotRun0.setPlotSymbol(triangle4Symbol0);
      assertEquals(1, plotRun0.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      TabRSymbol tabRSymbol0 = new TabRSymbol();
      PlotRun plotRun0 = new PlotRun(doubleArray0, doubleArray0, true, tabRSymbol0);
      double double0 = plotRun0.getMaxY();
      assertEquals(4.9E-324, double0, 0.01);
      assertEquals(6, plotRun0.size());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PlotRun plotRun0 = new PlotRun(doubleArray0, doubleArray0, true, (PlotSymbol) null);
      double double0 = plotRun0.getMinY();
      assertEquals(2, plotRun0.size());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      PlotRun plotRun0 = new PlotRun();
      double double0 = plotRun0.getMinY();
      assertEquals(1.7976931348623157E308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ThinRect2Symbol thinRect2Symbol0 = new ThinRect2Symbol();
      double[] doubleArray0 = new double[9];
      PlotRun plotRun0 = new PlotRun(doubleArray0, doubleArray0, true, thinRect2Symbol0);
      double double0 = plotRun0.getMaxX();
      assertEquals(9, plotRun0.size());
      assertEquals(4.9E-324, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      PlotRun plotRun0 = new PlotRun();
      double double0 = plotRun0.getMinX();
      assertEquals(1.7976931348623157E308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Set<String> set0 = ZoneId.getAvailableZoneIds();
      PlotRun plotRun0 = new PlotRun(set0);
      assertEquals(0, plotRun0.size());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ThinRect1Symbol thinRect1Symbol0 = new ThinRect1Symbol();
      PlotDatum plotDatum0 = new PlotDatum(0.0, 0.0, false, thinRect1Symbol0);
      ArrayDeque<PlotDatum> arrayDeque0 = new ArrayDeque<PlotDatum>();
      arrayDeque0.add(plotDatum0);
      PlotRun plotRun0 = new PlotRun(arrayDeque0);
      double double0 = plotRun0.getMinX();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BoxURSymbol boxURSymbol0 = new BoxURSymbol();
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = new double[8];
      PlotRun plotRun0 = null;
      try {
        plotRun0 = new PlotRun(doubleArray0, doubleArray1, false, boxURSymbol0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.PlotRun", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      PlotRun plotRun0 = null;
      try {
        plotRun0 = new PlotRun(doubleArray0, (double[]) null, true, (PlotSymbol) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.PlotRun", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      BoxULSymbol boxULSymbol0 = new BoxULSymbol();
      PlotRun plotRun0 = null;
      try {
        plotRun0 = new PlotRun((double[]) null, (double[]) null, true, boxULSymbol0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.PlotRun", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      PlotRun plotRun0 = new PlotRun();
      plotRun0.clear();
      assertEquals(0, plotRun0.size());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      TabRSymbol tabRSymbol0 = new TabRSymbol();
      PlotRun plotRun0 = new PlotRun(doubleArray0, doubleArray0, true, tabRSymbol0);
      PlotRun plotRun1 = new PlotRun(plotRun0);
      assertEquals(6, plotRun1.size());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      PlotRun plotRun0 = new PlotRun();
      // Undeclared exception!
      try { 
        plotRun0.remove((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      PlotRun plotRun0 = new PlotRun();
      plotRun0.add((Object) null);
      // Undeclared exception!
      try { 
        plotRun0.clone();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.PlotRun", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      TabRSymbol tabRSymbol0 = new TabRSymbol();
      PlotRun plotRun0 = new PlotRun(doubleArray0, doubleArray0, true, tabRSymbol0);
      Object object0 = plotRun0.get(1);
      Object object1 = plotRun0.set(1, object0);
      assertSame(object1, object0);
      assertEquals(6, plotRun0.size());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      PlotRun plotRun0 = new PlotRun();
      // Undeclared exception!
      try { 
        plotRun0.set(735, plotRun0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // jahuwaldt.plot.PlotRun cannot be cast to jahuwaldt.plot.PlotDatum
         //
         verifyException("jahuwaldt.plot.PlotRun", e);
      }
  }
}
