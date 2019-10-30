/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 28 23:20:56 GMT 2019
 */

package jigl.image.types;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.EOFException;
import java.io.IOException;
import jigl.image.ROI;
import jigl.image.types.TiledImage;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TiledImage_ESTest extends TiledImage_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int int0 = 128;
      int int1 = 5;
      TiledImage tiledImage0 = new TiledImage("`$_&<plW2^V]\"doE.", 128, 5, 5, 128);
      ROI rOI0 = new ROI();
      int int2 = 0;
      int int3 = 548;
      rOI0.setROI(16, 1586, 5, (-645));
      try { 
        tiledImage0.get(0, 548);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("/\"B_6[Q2E{P", 16, 4287, 16, (-764));
      TiledImage.Tile tiledImage_Tile0 = tiledImage0.new Tile();
      // Undeclared exception!
      try { 
        tiledImage_Tile0.write(4287);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage$Tile", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = 0;
      TiledImage tiledImage0 = new TiledImage(".\"d:5+(!q%`", 1642, 0, 0, 0);
      tiledImage0.close();
      tiledImage0.flush();
      TiledImage.Tile tiledImage_Tile0 = tiledImage0.new Tile();
      tiledImage_Tile0.m_nPos = 1642;
      // Undeclared exception!
      try { 
        tiledImage_Tile0.write(2241);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage$Tile", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TiledImage tiledImage0 = null;
      try {
        tiledImage0 = new TiledImage((String) null, 0, 0, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockRandomAccessFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("`$_&<plW2^V]\"doE.", (-2635), (-25), (-25), (-2635));
      ROI rOI0 = new ROI((-25), (-25), (-25), (-25));
      TiledImage tiledImage1 = new TiledImage("`$_&<plW2^V]\"doE.", (-25), 0);
      tiledImage0.X();
      tiledImage1.Y();
      tiledImage0.Y();
      tiledImage0.X();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("d|t[B6E\"]D*8~e", 8, 964, 8, 28);
      int[] intArray0 = new int[8];
      intArray0[0] = (-1919);
      intArray0[1] = 964;
      intArray0[2] = 785;
      intArray0[3] = (-1744);
      intArray0[4] = 964;
      intArray0[5] = 785;
      intArray0[6] = 84;
      intArray0[7] = (-1744);
      try { 
        tiledImage0.set(28, 785, intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("`$_&<plW2^V]\"doE.", 3, 6, 6, 194);
      TiledImage tiledImage1 = new TiledImage("`$_&<plW2^V]\"doE.", 3, 3);
      tiledImage1.flush();
      ROI rOI0 = new ROI();
      tiledImage1.getImage(rOI0);
      tiledImage1.close();
      TiledImage.Tile tiledImage_Tile0 = tiledImage0.new Tile();
      // Undeclared exception!
      try { 
        tiledImage_Tile0.write(811);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage$Tile", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int int0 = 3835;
      int int1 = (-205);
      TiledImage tiledImage0 = null;
      try {
        tiledImage0 = new TiledImage("", 0, 3835, 3835, (-205));
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("jigl.image.types.ColorImage", 37, 37, 37, 37);
      try { 
        tiledImage0.get(37, 239);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("P6", 0, 0, 0, 0);
      tiledImage0.flush();
      tiledImage0.X();
      tiledImage0.Y();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("HLS", 1573, 3, 3, 3);
      try { 
        tiledImage0.get(1571, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("HLS", 1599, 3, 3, 3);
      int[] intArray0 = new int[7];
      intArray0[0] = 1599;
      intArray0[1] = 222;
      intArray0[2] = 204;
      intArray0[3] = 1599;
      intArray0[4] = 871;
      intArray0[5] = 1599;
      intArray0[6] = 128;
      tiledImage0.set(128, 2, intArray0);
      ROI rOI0 = new ROI(1599, 204, 222, 2);
      // Undeclared exception!
      try { 
        tiledImage0.getImage(rOI0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int int0 = 3;
      TiledImage tiledImage0 = new TiledImage("HLS", 16, 3, 84, 871);
      tiledImage0.flush();
      ROI rOI0 = new ROI();
      tiledImage0.getImage(rOI0);
      tiledImage0.close();
      TiledImage.Tile tiledImage_Tile0 = tiledImage0.new Tile();
      tiledImage0.Y();
      tiledImage0.flush();
      try { 
        tiledImage0.get(4, (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/home/pderakhshanfar/evosuite-model-seeding-ee/evosuite-model-seeding-empirical-evaluation");
      FileSystemHandling.createFolder(evoSuiteFile0);
      TiledImage tiledImage0 = new TiledImage("P6", 0, 0, 0, 0);
      int[] intArray0 = new int[0];
      try { 
        tiledImage0.set((-237), (-1328), intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = ".\"d:5+(!q%`";
      TiledImage tiledImage0 = new TiledImage(".\"d:5+(!q%`", 1642, 0, 0, 0);
      tiledImage0.close();
      tiledImage0.Y();
      try { 
        tiledImage0.set((-389), (-571), (int[]) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int int0 = 5;
      TiledImage tiledImage0 = new TiledImage("`$_&<plW2^V]\"doE.", 128, 5, 5, 128);
      TiledImage.Tile tiledImage_Tile0 = tiledImage0.new Tile();
      // Undeclared exception!
      try { 
        tiledImage_Tile0.write(128);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage$Tile", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int int0 = 964;
      TiledImage tiledImage0 = new TiledImage("P6 ", 964, 964, 964, (-1744));
      int[] intArray0 = new int[8];
      // Undeclared exception!
      try { 
        tiledImage0.set(84, 84, intArray0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("P", 0, 0, 0, 0);
      TiledImage tiledImage1 = new TiledImage("P", (-1744), 0);
      tiledImage1.X();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("P6", 0, 0, 0, 0);
      tiledImage0.X();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("P6 ", 964, 964, 964, (-1744));
      tiledImage0.flush();
      tiledImage0.X();
      TiledImage.Tile tiledImage_Tile0 = tiledImage0.new Tile();
      // Undeclared exception!
      try { 
        tiledImage_Tile0.write((-280));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage$Tile", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("P6 ", 964, 964, 964, (-1744));
      int[] intArray0 = new int[8];
      intArray0[0] = 964;
      intArray0[1] = (-1744);
      intArray0[2] = 785;
      intArray0[3] = 964;
      intArray0[4] = 84;
      intArray0[5] = 964;
      intArray0[6] = 84;
      intArray0[7] = 785;
      // Undeclared exception!
      try { 
        tiledImage0.set(785, 84, intArray0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      int int0 = 1599;
      TiledImage tiledImage0 = new TiledImage("HLS", 1599, 3, 3, 3);
      ROI rOI0 = new ROI(1599, 204, 222, 2);
      // Undeclared exception!
      try { 
        tiledImage0.getImage(rOI0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      int int0 = 0;
      TiledImage tiledImage0 = new TiledImage("eP5y,~'iaEf[BV", (-766), (-766), (-1), 0);
      int[] intArray0 = new int[8];
      intArray0[0] = 0;
      intArray0[1] = (-766);
      intArray0[2] = 0;
      intArray0[3] = (-766);
      intArray0[4] = 0;
      intArray0[5] = 0;
      intArray0[6] = (-766);
      intArray0[7] = 0;
      try { 
        tiledImage0.set((-1), (-766), intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("P6", 0, 0, 0, 0);
      ROI rOI0 = new ROI();
      rOI0.setROI(0, (-741), (-741), 0);
      // Undeclared exception!
      try { 
        tiledImage0.getImage(rOI0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      int int0 = 2093;
      int int1 = 801;
      TiledImage tiledImage0 = null;
      try {
        tiledImage0 = new TiledImage("5!3SdPUS", 2093, 801);
        fail("Expecting exception: EOFException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.RandomAccessFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("LS", 1573, 3, 3, 3);
      tiledImage0.flush();
      ROI rOI0 = new ROI();
      tiledImage0.getImage(rOI0);
      ROI rOI1 = new ROI();
      int int0 = (-1751);
      TiledImage tiledImage1 = new TiledImage("LS", 3, 1573, (-2132), (-1751));
      // Undeclared exception!
      try { 
        tiledImage1.getImage(rOI1);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("q`MMuSHs#r", 0, 0, 0, 35);
      ROI rOI0 = new ROI();
      rOI0.setROI(0, (-32768), 1979, 35);
      // Undeclared exception!
      tiledImage0.getImage(rOI0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      int int0 = 128;
      TiledImage tiledImage0 = new TiledImage("`$_&<plW2^V]\"doE.", 128, 5, 5, 128);
      ROI rOI0 = new ROI();
      int int1 = 548;
      int int2 = 1586;
      tiledImage0.Y();
      int[] intArray0 = null;
      try { 
        tiledImage0.set(5, (-236), (int[]) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }
}