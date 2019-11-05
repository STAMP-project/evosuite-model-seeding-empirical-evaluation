/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 05 16:15:11 GMT 2019
 */

package Joshua.FoxHunt;

import org.junit.Test;
import static org.junit.Assert.*;
import Joshua.FoxHunt.Landmark;
import javax.swing.ImageIcon;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Landmark_ESTest extends Landmark_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ImageIcon imageIcon0 = new ImageIcon();
      ImageIcon imageIcon1 = new ImageIcon();
      Landmark landmark0 = new Landmark(0.0, 0.0, imageIcon1);
      landmark0.setIcon(imageIcon0);
      assertEquals(0.0, landmark0.getLat(), 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ImageIcon imageIcon0 = new ImageIcon();
      Landmark landmark0 = new Landmark(0.0, 270.55443723762, imageIcon0);
      landmark0.lon = 1.0;
      double double0 = landmark0.getLon();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ImageIcon imageIcon0 = new ImageIcon();
      Landmark landmark0 = new Landmark(130.6399691, 2638.1417838188304, imageIcon0);
      landmark0.setLon((-1.0));
      double double0 = landmark0.getLon();
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Landmark landmark0 = new Landmark(0.0, (-1886.7012949096238), (ImageIcon) null);
      assertEquals((-1886.7012949096238), landmark0.getLat(), 0.01);
      
      landmark0.setLat(0.0);
      double double0 = landmark0.getLat();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Landmark landmark0 = new Landmark((-1.0), (-276.8614384), (ImageIcon) null);
      double double0 = landmark0.getLat();
      assertEquals((-276.8614384), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Landmark landmark0 = new Landmark(0.0, (-1886.7012949096238), (ImageIcon) null);
      landmark0.getIcon();
      assertEquals((-1886.7012949096238), landmark0.getLat(), 0.01);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ImageIcon imageIcon0 = new ImageIcon();
      Landmark landmark0 = new Landmark(0.0, 270.55443723762, imageIcon0);
      landmark0.setLon((-2082.6336));
      landmark0.setLat(0.0);
      assertEquals((-2082.6336), landmark0.getLon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ImageIcon imageIcon0 = new ImageIcon();
      Landmark landmark0 = new Landmark(0.0, 270.55443723762, imageIcon0);
      double double0 = landmark0.getLat();
      assertEquals(270.55443723762, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ImageIcon imageIcon0 = new ImageIcon();
      Landmark landmark0 = new Landmark(0.0, 270.55443723762, imageIcon0);
      ImageIcon imageIcon1 = landmark0.getIcon();
      assertNotNull(imageIcon1);
      assertEquals(270.55443723762, landmark0.getLat(), 0.01);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      ImageIcon imageIcon0 = new ImageIcon();
      Landmark landmark0 = new Landmark(0.0, 270.55443723762, imageIcon0);
      double double0 = landmark0.getLon();
      assertEquals(270.55443723762, landmark0.getLat(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }
}
