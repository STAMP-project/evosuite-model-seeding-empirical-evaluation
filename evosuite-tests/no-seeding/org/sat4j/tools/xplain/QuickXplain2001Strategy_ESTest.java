/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 18 01:12:07 GMT 2019
 */

package org.sat4j.tools.xplain;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.sat4j.LightFactory;
import org.sat4j.core.VecInt;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVecInt;
import org.sat4j.tools.AbstractMinimalModel;
import org.sat4j.tools.DimacsStringSolver;
import org.sat4j.tools.IVisualizationTool;
import org.sat4j.tools.ManyCore;
import org.sat4j.tools.ModelIterator;
import org.sat4j.tools.StatisticsSolver;
import org.sat4j.tools.xplain.QuickXplain2001Strategy;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class QuickXplain2001Strategy_ESTest extends QuickXplain2001Strategy_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      QuickXplain2001Strategy quickXplain2001Strategy0 = new QuickXplain2001Strategy();
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      IVecInt iVecInt0 = AbstractMinimalModel.negativeLiterals(dimacsStringSolver0);
      // Undeclared exception!
      try { 
        quickXplain2001Strategy0.explain(dimacsStringSolver0, hashMap0, iVecInt0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.AbstractOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      QuickXplain2001Strategy quickXplain2001Strategy0 = new QuickXplain2001Strategy();
      StatisticsSolver statisticsSolver0 = new StatisticsSolver();
      HashMap<Integer, QuickXplain2001Strategy> hashMap0 = new HashMap<Integer, QuickXplain2001Strategy>();
      VecInt vecInt0 = new VecInt();
      vecInt0.pop();
      // Undeclared exception!
      try { 
        quickXplain2001Strategy0.explain(statisticsSolver0, hashMap0, vecInt0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.core.VecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      QuickXplain2001Strategy quickXplain2001Strategy0 = new QuickXplain2001Strategy();
      VecInt vecInt0 = new VecInt();
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      ModelIterator[] modelIteratorArray0 = new ModelIterator[0];
      ManyCore<ModelIterator> manyCore0 = new ManyCore<ModelIterator>(modelIteratorArray0);
      // Undeclared exception!
      try { 
        quickXplain2001Strategy0.explain(manyCore0, hashMap0, vecInt0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      QuickXplain2001Strategy quickXplain2001Strategy0 = new QuickXplain2001Strategy();
      StatisticsSolver statisticsSolver0 = new StatisticsSolver();
      HashMap<Integer, QuickXplain2001Strategy> hashMap0 = new HashMap<Integer, QuickXplain2001Strategy>();
      Integer integer0 = IVisualizationTool.NOTGOOD;
      hashMap0.put(integer0, quickXplain2001Strategy0);
      VecInt vecInt0 = new VecInt();
      vecInt0.pop();
      // Undeclared exception!
      try { 
        quickXplain2001Strategy0.explain(statisticsSolver0, hashMap0, vecInt0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      QuickXplain2001Strategy quickXplain2001Strategy0 = new QuickXplain2001Strategy();
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.lightSolver();
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      IVecInt iVecInt0 = VecInt.EMPTY;
      // Undeclared exception!
      try { 
        quickXplain2001Strategy0.explain(iSolver0, hashMap0, iVecInt0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.xplain.QuickXplain2001Strategy", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      QuickXplain2001Strategy quickXplain2001Strategy0 = new QuickXplain2001Strategy();
      String string0 = quickXplain2001Strategy0.toString();
      assertEquals("QuickXplain (IJCAI WS 2001 version) minimization strategy", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      QuickXplain2001Strategy quickXplain2001Strategy0 = new QuickXplain2001Strategy();
      quickXplain2001Strategy0.cancelExplanationComputation();
      assertEquals("QuickXplain (IJCAI WS 2001 version) minimization strategy", quickXplain2001Strategy0.toString());
  }
}