/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 19 16:56:23 GMT 2019
 */

package org.sat4j.tools;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.sat4j.minisat.constraints.CardinalityDataStructure;
import org.sat4j.minisat.constraints.cnf.LearntBinaryClause;
import org.sat4j.minisat.core.ILits;
import org.sat4j.minisat.core.Solver;
import org.sat4j.specs.IConstr;
import org.sat4j.specs.ISolverService;
import org.sat4j.specs.IVecInt;
import org.sat4j.specs.Lbool;
import org.sat4j.specs.RandomAccessModel;
import org.sat4j.tools.TextOutputTracing;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TextOutputTracing_ESTest extends TextOutputTracing_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      HashMap<Integer, CardinalityDataStructure> hashMap0 = new HashMap<Integer, CardinalityDataStructure>();
      hashMap0.put((Integer) Integer.MIN_VALUE, cardinalityDataStructure0);
      TextOutputTracing<CardinalityDataStructure> textOutputTracing0 = new TextOutputTracing<CardinalityDataStructure>(hashMap0);
      textOutputTracing0.adding(Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Integer integer0 = Integer.valueOf(0);
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      hashMap0.put(integer0, integer0);
      TextOutputTracing<Integer> textOutputTracing0 = new TextOutputTracing<Integer>(hashMap0);
      textOutputTracing0.adding(0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashMap<Integer, CardinalityDataStructure> hashMap0 = new HashMap<Integer, CardinalityDataStructure>();
      TextOutputTracing<CardinalityDataStructure> textOutputTracing0 = new TextOutputTracing<CardinalityDataStructure>(hashMap0);
      Integer integer0 = new Integer(1456);
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      hashMap0.put(integer0, cardinalityDataStructure0);
      textOutputTracing0.adding(1456);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      TextOutputTracing<Object> textOutputTracing0 = new TextOutputTracing<Object>(hashMap0);
      textOutputTracing0.learnUnit(1130);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashMap<Integer, CardinalityDataStructure> hashMap0 = new HashMap<Integer, CardinalityDataStructure>();
      TextOutputTracing<CardinalityDataStructure> textOutputTracing0 = new TextOutputTracing<CardinalityDataStructure>(hashMap0);
      textOutputTracing0.delete((IConstr) null);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HashMap<Integer, CardinalityDataStructure> hashMap0 = new HashMap<Integer, CardinalityDataStructure>();
      TextOutputTracing<CardinalityDataStructure> textOutputTracing0 = new TextOutputTracing<CardinalityDataStructure>(hashMap0);
      textOutputTracing0.restarting();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      TextOutputTracing<String> textOutputTracing0 = new TextOutputTracing<String>(hashMap0);
      Lbool lbool0 = Lbool.TRUE;
      textOutputTracing0.end(lbool0);
      assertEquals("T", lbool0.toString());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HashMap<Integer, CardinalityDataStructure> hashMap0 = new HashMap<Integer, CardinalityDataStructure>();
      TextOutputTracing<CardinalityDataStructure> textOutputTracing0 = new TextOutputTracing<CardinalityDataStructure>(hashMap0);
      textOutputTracing0.backtracking((-1011));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HashMap<Integer, CardinalityDataStructure> hashMap0 = new HashMap<Integer, CardinalityDataStructure>();
      TextOutputTracing<CardinalityDataStructure> textOutputTracing0 = new TextOutputTracing<CardinalityDataStructure>(hashMap0);
      int[] intArray0 = new int[0];
      textOutputTracing0.solutionFound(intArray0, (RandomAccessModel) null);
      assertEquals(0, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HashMap<Integer, CardinalityDataStructure> hashMap0 = new HashMap<Integer, CardinalityDataStructure>();
      TextOutputTracing<CardinalityDataStructure> textOutputTracing0 = new TextOutputTracing<CardinalityDataStructure>(hashMap0);
      textOutputTracing0.enqueueing((-1631), (IConstr) null);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      TextOutputTracing<Object> textOutputTracing0 = new TextOutputTracing<Object>(hashMap0);
      textOutputTracing0.init((ISolverService) null);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HashMap<Integer, CardinalityDataStructure> hashMap0 = new HashMap<Integer, CardinalityDataStructure>();
      TextOutputTracing<CardinalityDataStructure> textOutputTracing0 = new TextOutputTracing<CardinalityDataStructure>(hashMap0);
      textOutputTracing0.conflictFound(10);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HashMap<Integer, CardinalityDataStructure> hashMap0 = new HashMap<Integer, CardinalityDataStructure>();
      TextOutputTracing<CardinalityDataStructure> textOutputTracing0 = new TextOutputTracing<CardinalityDataStructure>(hashMap0);
      textOutputTracing0.start();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HashMap<Integer, Solver<CardinalityDataStructure>> hashMap0 = new HashMap<Integer, Solver<CardinalityDataStructure>>();
      TextOutputTracing<Solver<CardinalityDataStructure>> textOutputTracing0 = new TextOutputTracing<Solver<CardinalityDataStructure>>(hashMap0);
      textOutputTracing0.beginLoop();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HashMap<Integer, CardinalityDataStructure> hashMap0 = new HashMap<Integer, CardinalityDataStructure>();
      TextOutputTracing<CardinalityDataStructure> textOutputTracing0 = new TextOutputTracing<CardinalityDataStructure>(hashMap0);
      textOutputTracing0.conflictFound((IConstr) null, 104, 1456);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      TextOutputTracing<String> textOutputTracing0 = new TextOutputTracing<String>(hashMap0);
      IVecInt iVecInt0 = mock(IVecInt.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(iVecInt0).get(anyInt());
      ILits iLits0 = mock(ILits.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(iLits0).valueToString(anyInt());
      LearntBinaryClause learntBinaryClause0 = new LearntBinaryClause(iVecInt0, iLits0);
      textOutputTracing0.learn(learntBinaryClause0);
      assertFalse(learntBinaryClause0.isSatisfied());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HashMap<Integer, CardinalityDataStructure> hashMap0 = new HashMap<Integer, CardinalityDataStructure>();
      TextOutputTracing<CardinalityDataStructure> textOutputTracing0 = new TextOutputTracing<CardinalityDataStructure>(hashMap0);
      textOutputTracing0.cleaning();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      TextOutputTracing<String> textOutputTracing0 = new TextOutputTracing<String>(hashMap0);
      textOutputTracing0.assuming((-1025));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      TextOutputTracing<Integer> textOutputTracing0 = new TextOutputTracing<Integer>(hashMap0);
      textOutputTracing0.backjump(1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TextOutputTracing<CardinalityDataStructure> textOutputTracing0 = new TextOutputTracing<CardinalityDataStructure>((Map<Integer, CardinalityDataStructure>) null);
      textOutputTracing0.propagating(267);
  }
}
