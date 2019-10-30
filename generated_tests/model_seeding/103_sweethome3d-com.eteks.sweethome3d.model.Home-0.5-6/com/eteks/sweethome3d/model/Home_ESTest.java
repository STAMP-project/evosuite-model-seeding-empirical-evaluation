/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 29 14:44:37 GMT 2019
 */

package com.eteks.sweethome3d.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.eteks.sweethome3d.model.CatalogPieceOfFurniture;
import com.eteks.sweethome3d.model.DimensionLine;
import com.eteks.sweethome3d.model.Home;
import com.eteks.sweethome3d.model.HomePieceOfFurniture;
import com.eteks.sweethome3d.model.Label;
import com.eteks.sweethome3d.model.Level;
import com.eteks.sweethome3d.model.Room;
import com.eteks.sweethome3d.model.Selectable;
import com.eteks.sweethome3d.model.Wall;
import com.eteks.sweethome3d.tools.URLContent;
import java.math.BigDecimal;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Home_ESTest extends Home_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Home home0 = new Home((-6719.996F));
      Level level0 = new Level("", 3700L, (-1460.72F), (-6719.996F));
      home0.addLevel(level0);
      Home home1 = home0.clone();
      home1.addLevel(level0);
      assertEquals((-6719.996F), home1.getWallHeight(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Home home0 = new Home();
      float[][] floatArray0 = new float[4][7];
      Room room0 = new Room(floatArray0);
      home0.addRoom(room0, 0);
      assertEquals(250.0F, home0.getWallHeight(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Home home0 = new Home((-2324.0F));
      home0.setName("a1TVpY;E,Z65J;'/+Ed");
      home0.setName("a1TVpY;E,Z65J;'/+Ed");
      assertEquals((-2324.0F), home0.getWallHeight(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Home home0 = new Home();
      Label label0 = new Label("E[5", 3700L, 3700L);
      home0.deleteLabel(label0);
      assertEquals(250.0F, home0.getWallHeight(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Home home0 = new Home();
      DimensionLine dimensionLine0 = new DimensionLine(1988.0F, 0.0F, 0.0F, 2643.321F, 0.19634955F);
      home0.deleteDimensionLine(dimensionLine0);
      assertEquals(250.0F, home0.getWallHeight(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Home home0 = new Home((-1320.13F));
      float[][] floatArray0 = new float[2][2];
      Room room0 = new Room(floatArray0);
      home0.addRoom(room0);
      assertEquals((-1320.13F), home0.getWallHeight(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Home home0 = new Home();
      URL uRL0 = MockURL.getFileExample();
      URLContent uRLContent0 = new URLContent(uRL0);
      float[][] floatArray0 = new float[8][0];
      float[] floatArray1 = new float[9];
      floatArray0[0] = floatArray1;
      floatArray0[1] = floatArray0[0];
      floatArray0[2] = floatArray1;
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      CatalogPieceOfFurniture catalogPieceOfFurniture0 = new CatalogPieceOfFurniture("", "America/Guyana", "", uRLContent0, uRLContent0, 3700L, 3700L, 3.1415927F, 3.1415927F, false, floatArray0, "America/Guyana", true, bigDecimal0, bigDecimal0);
      HomePieceOfFurniture homePieceOfFurniture0 = new HomePieceOfFurniture(catalogPieceOfFurniture0);
      home0.addPieceOfFurniture(homePieceOfFurniture0);
      assertEquals(250.0F, home0.getWallHeight(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Home home0 = new Home();
      home0.setRecovered(true);
      boolean boolean0 = home0.isRecovered();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Home home0 = new Home();
      home0.setFurnitureDescendingSorted(true);
      boolean boolean0 = home0.isFurnitureDescendingSorted();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Home home0 = new Home();
      home0.setBasePlanLocked(true);
      boolean boolean0 = home0.isBasePlanLocked();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedList<Wall> linkedList0 = new LinkedList<Wall>();
      Wall wall0 = new Wall(0.0F, 50.0F, 50.0F, 50.0F, 0.0F);
      linkedList0.addFirst(wall0);
      List<Wall> list0 = Home.getWallsSubList(linkedList0);
      assertTrue(list0.contains(wall0));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Home home0 = new Home();
      float float0 = home0.getWallHeight();
      assertEquals(250.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Home home0 = new Home();
      home0.setName("=0$nM:f");
      String string0 = home0.getName();
      assertNotNull(string0);
      assertEquals(250.0F, home0.getWallHeight(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Home home0 = new Home();
      home0.setRecovered(true);
      home0.clone();
      assertTrue(home0.isRecovered());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Home home0 = new Home();
      home0.setBasePlanLocked(true);
      home0.clone();
      assertTrue(home0.isBasePlanLocked());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Home home0 = new Home(0.0F);
      Home home1 = home0.clone();
      assertEquals(0.0F, home1.getWallHeight(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Home home0 = new Home();
      // Undeclared exception!
      try { 
        home0.setSelectedItems((List<? extends Selectable>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Home home0 = new Home();
      // Undeclared exception!
      try { 
        home0.setFurnitureVisibleProperties((List<HomePieceOfFurniture.SortableProperty>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        Home.getWallsSubList((List<? extends Selectable>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.eteks.sweethome3d.model.Home", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Class<Label> class0 = Label.class;
      // Undeclared exception!
      try { 
        Home.getSubList((List<? extends Selectable>) null, class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.eteks.sweethome3d.model.Home", e);
      }
  }
}
