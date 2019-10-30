/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 28 22:19:50 GMT 2019
 */

package jigl.image.types;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jigl.image.types.ComplexImage;
import jigl.image.types.PowerImage;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PowerImage_ESTest extends PowerImage_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ComplexImage complexImage0 = new ComplexImage(8, 8);
      complexImage0.clear();
      PowerImage powerImage0 = new PowerImage(complexImage0);
      assertEquals(0.0F, powerImage0.max(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PowerImage powerImage0 = new PowerImage(682, 682);
      PowerImage powerImage1 = new PowerImage(powerImage0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PowerImage powerImage0 = null;
      try {
        powerImage0 = new PowerImage((PowerImage) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.RealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ComplexImage complexImage0 = new ComplexImage(4865, 4865);
      PowerImage powerImage0 = new PowerImage(complexImage0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ComplexImage complexImage0 = new ComplexImage(4865, 4865);
      PowerImage powerImage0 = new PowerImage(4865, 575);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PowerImage powerImage0 = null;
      try {
        powerImage0 = new PowerImage((-16777249), (-16777249));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.RealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ComplexImage complexImage0 = new ComplexImage(8, 8);
      PowerImage powerImage0 = null;
      try {
        powerImage0 = new PowerImage(complexImage0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.ComplexImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      PowerImage powerImage0 = null;
      try {
        powerImage0 = new PowerImage();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      PowerImage powerImage0 = new PowerImage(0, 0);
      PowerImage powerImage1 = new PowerImage(powerImage0);
      assertEquals(32767.0F, powerImage1.min(), 0.01F);
  }
}