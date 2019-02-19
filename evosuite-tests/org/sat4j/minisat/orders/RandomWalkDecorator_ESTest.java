/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 19 15:54:47 GMT 2019
 */

package org.sat4j.minisat.orders;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.PrintWriter;
import java.io.StringWriter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.junit.runner.RunWith;
import org.sat4j.minisat.constraints.cnf.Lits;
import org.sat4j.minisat.core.IPhaseSelectionStrategy;
import org.sat4j.minisat.orders.LevelBasedVarOrderHeap;
import org.sat4j.minisat.orders.NaturalStaticOrder;
import org.sat4j.minisat.orders.PhaseInLastLearnedClauseSelectionStrategy;
import org.sat4j.minisat.orders.PureOrder;
import org.sat4j.minisat.orders.RandomWalkDecorator;
import org.sat4j.minisat.orders.SubsetVarOrder;
import org.sat4j.minisat.orders.VarOrderHeap;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RandomWalkDecorator_ESTest extends RandomWalkDecorator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int[] intArray0 = new int[6];
      SubsetVarOrder subsetVarOrder0 = new SubsetVarOrder(intArray0);
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(subsetVarOrder0);
      randomWalkDecorator0.setProbability(0.0);
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
      PureOrder pureOrder0 = new PureOrder();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(pureOrder0);
      Lits lits0 = new Lits();
      lits0.getFromPool(1682);
      randomWalkDecorator0.setLits(lits0);
      randomWalkDecorator0.init();
      randomWalkDecorator0.updateVar(3365);
      assertEquals(0.01, randomWalkDecorator0.getProbability(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(levelBasedVarOrderHeap0);
      Lits lits0 = new Lits();
      randomWalkDecorator0.setLits(lits0);
      randomWalkDecorator0.init();
      randomWalkDecorator0.undo(0);
      assertEquals(0.01, randomWalkDecorator0.getProbability(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(pureOrder0, 1972.452655181);
      randomWalkDecorator0.setVarDecay(0.0);
      assertEquals(1972.452655181, randomWalkDecorator0.getProbability(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(pureOrder0, 1972.452655181);
      NaturalStaticOrder naturalStaticOrder0 = new NaturalStaticOrder();
      IPhaseSelectionStrategy iPhaseSelectionStrategy0 = naturalStaticOrder0.getPhaseSelectionStrategy();
      randomWalkDecorator0.setPhaseSelectionStrategy(iPhaseSelectionStrategy0);
      assertEquals(1972.452655181, randomWalkDecorator0.getProbability(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(varOrderHeap0);
      StringWriter stringWriter0 = new StringWriter(99);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(stringWriter0);
      randomWalkDecorator0.printStat(mockPrintWriter0, "']yW");
      assertEquals("']yWrandom walks\t: 0\n']yWnon guided choices\t: 0\n", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 1.0E100;
      varOrderHeap0.activity = doubleArray0;
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(varOrderHeap0, 4352.779887603536);
      double double0 = randomWalkDecorator0.varActivity(0);
      assertEquals(1.0E100, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder();
      Lits lits0 = new Lits();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(pureOrder0);
      randomWalkDecorator0.setLits(lits0);
      randomWalkDecorator0.init();
      double double0 = randomWalkDecorator0.varActivity(0);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(varOrderHeap0);
      double[] doubleArray0 = randomWalkDecorator0.getVariableHeuristics();
      assertEquals(1, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int[] intArray0 = new int[6];
      SubsetVarOrder subsetVarOrder0 = new SubsetVarOrder(intArray0);
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(subsetVarOrder0, 0.0);
      double double0 = randomWalkDecorator0.getProbability();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(pureOrder0);
      double double0 = randomWalkDecorator0.getProbability();
      assertEquals(0.01, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(pureOrder0, 1972.452655181);
      PhaseInLastLearnedClauseSelectionStrategy phaseInLastLearnedClauseSelectionStrategy0 = (PhaseInLastLearnedClauseSelectionStrategy)randomWalkDecorator0.getPhaseSelectionStrategy();
      assertEquals("phase appearing in latest learned clause", phaseInLastLearnedClauseSelectionStrategy0.toString());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
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
  public void test13()  throws Throwable  {
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator((VarOrderHeap) null, 0);
      // Undeclared exception!
      try { 
        randomWalkDecorator0.varActivity(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.RandomWalkDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(levelBasedVarOrderHeap0);
      // Undeclared exception!
      try { 
        randomWalkDecorator0.varActivity(1204);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 602
         //
         verifyException("org.sat4j.minisat.orders.VarOrderHeap", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator((VarOrderHeap) null);
      // Undeclared exception!
      try { 
        randomWalkDecorator0.updateVarAtDecisionLevel(768);
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
      PureOrder pureOrder0 = new PureOrder();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(pureOrder0);
      // Undeclared exception!
      try { 
        randomWalkDecorator0.updateVar(1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.PhaseInLastLearnedClauseSelectionStrategy", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
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
  public void test18()  throws Throwable  {
      Lits lits0 = new Lits();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator((VarOrderHeap) null);
      // Undeclared exception!
      try { 
        randomWalkDecorator0.setLits(lits0);
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
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator((VarOrderHeap) null);
      // Undeclared exception!
      try { 
        randomWalkDecorator0.init();
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
  public void test21()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap((IPhaseSelectionStrategy) null);
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(levelBasedVarOrderHeap0);
      IPhaseSelectionStrategy iPhaseSelectionStrategy0 = randomWalkDecorator0.getPhaseSelectionStrategy();
      assertNull(iPhaseSelectionStrategy0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder();
      Lits lits0 = new Lits();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(pureOrder0);
      randomWalkDecorator0.setLits(lits0);
      randomWalkDecorator0.init();
      int int0 = randomWalkDecorator0.select();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(varOrderHeap0, (-65.4960797));
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
  public void test24()  throws Throwable  {
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator((VarOrderHeap) null);
      // Undeclared exception!
      try { 
        randomWalkDecorator0.setVarDecay((-1.0));
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
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(varOrderHeap0);
      // Undeclared exception!
      try { 
        randomWalkDecorator0.printStat((PrintWriter) null, "<[sVy");
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
      PureOrder pureOrder0 = new PureOrder();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(pureOrder0, (-1206.3));
      double double0 = randomWalkDecorator0.getProbability();
      assertEquals((-1206.3), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(levelBasedVarOrderHeap0);
      // Undeclared exception!
      try { 
        randomWalkDecorator0.undo(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.VarOrderHeap", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(levelBasedVarOrderHeap0);
      randomWalkDecorator0.assignLiteral(0);
      assertEquals(0.01, randomWalkDecorator0.getProbability(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(pureOrder0);
      String string0 = randomWalkDecorator0.toString();
      assertEquals("tries to first branch on a single phase watched unassigned variable (pure literal if using a CB data structure) else VSIDS from MiniSAT with random walks 0.01", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(pureOrder0);
      randomWalkDecorator0.updateVarAtDecisionLevel(1);
      assertEquals(0.01, randomWalkDecorator0.getProbability(), 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(pureOrder0);
      double double0 = randomWalkDecorator0.varActivity(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(pureOrder0);
      randomWalkDecorator0.varDecayActivity();
      assertEquals(0.01, randomWalkDecorator0.getProbability(), 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(pureOrder0);
      // Undeclared exception!
      try { 
        randomWalkDecorator0.updateVar(3365);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1682
         //
         verifyException("org.sat4j.minisat.orders.VarOrderHeap", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
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
  public void test35()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(pureOrder0);
      Lits lits0 = new Lits();
      lits0.getFromPool(1682);
      randomWalkDecorator0.setLits(lits0);
      randomWalkDecorator0.init();
      assertEquals(0.01, randomWalkDecorator0.getProbability(), 0.01);
      
      int int0 = randomWalkDecorator0.select();
      assertEquals(3365, int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
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
  public void test37()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(pureOrder0);
      Lits lits0 = new Lits();
      randomWalkDecorator0.setLits(lits0);
      randomWalkDecorator0.init();
      // Undeclared exception!
      try { 
        randomWalkDecorator0.undo((-345));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -345
         //
         verifyException("org.sat4j.core.VecInt", e);
      }
  }
}