/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 19 17:28:08 GMT 2019
 */

package org.sat4j.minisat.orders;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.junit.runner.RunWith;
import org.sat4j.BasicLauncher;
import org.sat4j.core.ASolverFactory;
import org.sat4j.minisat.core.ILits;
import org.sat4j.minisat.core.IPhaseSelectionStrategy;
import org.sat4j.minisat.orders.LevelBasedVarOrderHeap;
import org.sat4j.minisat.orders.PositiveLiteralSelectionStrategy;
import org.sat4j.minisat.orders.RandomWalkDecorator;
import org.sat4j.minisat.orders.SubsetVarOrder;
import org.sat4j.minisat.orders.VarOrderHeap;
import org.sat4j.tools.Minimal4CardinalityModel;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RandomWalkDecorator_ESTest extends RandomWalkDecorator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(levelBasedVarOrderHeap0, 0.0);
      // Undeclared exception!
      try { 
        randomWalkDecorator0.select();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.VarOrderHeap", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(levelBasedVarOrderHeap0);
      randomWalkDecorator0.varDecayActivity();
      assertEquals(0.01, randomWalkDecorator0.getProbability(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(varOrderHeap0);
      randomWalkDecorator0.updateVarAtDecisionLevel((-145));
      assertEquals(0.01, randomWalkDecorator0.getProbability(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(levelBasedVarOrderHeap0);
      randomWalkDecorator0.setLits((ILits) null);
      assertEquals(0.01, randomWalkDecorator0.getProbability(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(varOrderHeap0, 1106.062017898867);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(3093);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(byteArrayOutputStream0);
      randomWalkDecorator0.printStat(mockPrintWriter0, " with random walks ");
      assertEquals(1106.062017898867, randomWalkDecorator0.getProbability(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator((VarOrderHeap) null);
      ASolverFactory<Minimal4CardinalityModel> aSolverFactory0 = (ASolverFactory<Minimal4CardinalityModel>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      BasicLauncher<Minimal4CardinalityModel> basicLauncher0 = new BasicLauncher<Minimal4CardinalityModel>(aSolverFactory0);
      PrintWriter printWriter0 = basicLauncher0.getLogWriter();
      // Undeclared exception!
      try { 
        randomWalkDecorator0.printStat(printWriter0, "c ");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.RandomWalkDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(levelBasedVarOrderHeap0);
      randomWalkDecorator0.assignLiteral((-3968));
      assertEquals(0.01, randomWalkDecorator0.getProbability(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(levelBasedVarOrderHeap0);
      randomWalkDecorator0.varActivity(0);
      assertEquals(0.01, randomWalkDecorator0.getProbability(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(varOrderHeap0);
      String string0 = randomWalkDecorator0.toString();
      assertEquals("VSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause with random walks 0.01", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(levelBasedVarOrderHeap0, 0.0);
      double[] doubleArray0 = new double[3];
      levelBasedVarOrderHeap0.activity = doubleArray0;
      levelBasedVarOrderHeap0.activity = null;
      randomWalkDecorator0.getVariableHeuristics();
      assertEquals(0.0, randomWalkDecorator0.getProbability(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      double[] doubleArray0 = new double[0];
      levelBasedVarOrderHeap0.activity = doubleArray0;
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(levelBasedVarOrderHeap0, (-753.7469983508782));
      randomWalkDecorator0.getVariableHeuristics();
      assertEquals((-753.7469983508782), randomWalkDecorator0.getProbability(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PositiveLiteralSelectionStrategy positiveLiteralSelectionStrategy0 = new PositiveLiteralSelectionStrategy();
      VarOrderHeap varOrderHeap0 = new VarOrderHeap(positiveLiteralSelectionStrategy0);
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(varOrderHeap0, 0);
      double double0 = randomWalkDecorator0.getProbability();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int[] intArray0 = new int[1];
      SubsetVarOrder subsetVarOrder0 = new SubsetVarOrder(intArray0);
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(subsetVarOrder0);
      randomWalkDecorator0.setProbability((-1232.17064534044));
      double double0 = randomWalkDecorator0.getProbability();
      assertEquals((-1232.17064534044), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(varOrderHeap0);
      // Undeclared exception!
      try { 
        randomWalkDecorator0.varActivity(241);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 120
         //
         verifyException("org.sat4j.minisat.orders.VarOrderHeap", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(levelBasedVarOrderHeap0);
      // Undeclared exception!
      try { 
        randomWalkDecorator0.updateVar(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.PhaseInLastLearnedClauseSelectionStrategy", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator((VarOrderHeap) null);
      // Undeclared exception!
      try { 
        randomWalkDecorator0.setVarDecay((-2126.44296419));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.RandomWalkDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator((VarOrderHeap) null);
      // Undeclared exception!
      try { 
        randomWalkDecorator0.setPhaseSelectionStrategy((IPhaseSelectionStrategy) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.RandomWalkDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator((VarOrderHeap) null);
      // Undeclared exception!
      try { 
        randomWalkDecorator0.getVariableHeuristics();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.RandomWalkDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator((VarOrderHeap) null);
      // Undeclared exception!
      try { 
        randomWalkDecorator0.getPhaseSelectionStrategy();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.RandomWalkDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(levelBasedVarOrderHeap0);
      // Undeclared exception!
      try { 
        randomWalkDecorator0.select();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.RandomWalkDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int[] intArray0 = new int[1];
      SubsetVarOrder subsetVarOrder0 = new SubsetVarOrder(intArray0);
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(subsetVarOrder0);
      randomWalkDecorator0.setProbability((-1232.17064534044));
      // Undeclared exception!
      try { 
        randomWalkDecorator0.select();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.VarOrderHeap", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(levelBasedVarOrderHeap0);
      randomWalkDecorator0.setVarDecay((-307.56270597043545));
      assertEquals(0.01, randomWalkDecorator0.getProbability(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(levelBasedVarOrderHeap0);
      // Undeclared exception!
      try { 
        randomWalkDecorator0.init();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.LevelBasedVarOrderHeap", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      int[] intArray0 = new int[1];
      SubsetVarOrder subsetVarOrder0 = new SubsetVarOrder(intArray0);
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(subsetVarOrder0);
      double double0 = randomWalkDecorator0.getProbability();
      assertEquals(0.01, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator((VarOrderHeap) null);
      // Undeclared exception!
      try { 
        randomWalkDecorator0.undo(99);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.RandomWalkDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator((VarOrderHeap) null);
      // Undeclared exception!
      try { 
        randomWalkDecorator0.assignLiteral(1937);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.RandomWalkDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator((VarOrderHeap) null);
      // Undeclared exception!
      try { 
        randomWalkDecorator0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.RandomWalkDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator((VarOrderHeap) null);
      // Undeclared exception!
      try { 
        randomWalkDecorator0.updateVarAtDecisionLevel(735);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.RandomWalkDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator((VarOrderHeap) null);
      // Undeclared exception!
      try { 
        randomWalkDecorator0.varActivity(2449);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.RandomWalkDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator((VarOrderHeap) null);
      // Undeclared exception!
      try { 
        randomWalkDecorator0.varDecayActivity();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.RandomWalkDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(levelBasedVarOrderHeap0);
      // Undeclared exception!
      try { 
        randomWalkDecorator0.updateVar((-2308));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1154
         //
         verifyException("org.sat4j.minisat.orders.VarOrderHeap", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      int[] intArray0 = new int[1];
      SubsetVarOrder subsetVarOrder0 = new SubsetVarOrder(intArray0);
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(subsetVarOrder0);
      randomWalkDecorator0.getVariableHeuristics();
      assertEquals(0.01, randomWalkDecorator0.getProbability(), 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(levelBasedVarOrderHeap0);
      randomWalkDecorator0.getPhaseSelectionStrategy();
      assertEquals(0.01, randomWalkDecorator0.getProbability(), 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(levelBasedVarOrderHeap0);
      randomWalkDecorator0.setPhaseSelectionStrategy((IPhaseSelectionStrategy) null);
      randomWalkDecorator0.getPhaseSelectionStrategy();
      assertEquals(0.01, randomWalkDecorator0.getProbability(), 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator((VarOrderHeap) null);
      // Undeclared exception!
      try { 
        randomWalkDecorator0.setLits((ILits) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.RandomWalkDecorator", e);
      }
  }
}
