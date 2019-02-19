/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 19 17:25:35 GMT 2019
 */

package org.sat4j.minisat.constraints.card;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.sat4j.core.ReadOnlyVecInt;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.constraints.MixedDataStructureDanielWLConciseBinary;
import org.sat4j.minisat.constraints.card.AtLeast;
import org.sat4j.minisat.core.ILits;
import org.sat4j.minisat.core.Solver;
import org.sat4j.minisat.learning.PercentLengthLearning;
import org.sat4j.minisat.orders.RandomWalkDecorator;
import org.sat4j.minisat.orders.VarOrderHeap;
import org.sat4j.minisat.restarts.LubyRestarts;
import org.sat4j.specs.Constr;
import org.sat4j.specs.IVecInt;
import org.sat4j.specs.MandatoryLiteralListener;
import org.sat4j.specs.UnitPropagationListener;
import org.sat4j.specs.VarMapper;
import org.sat4j.tools.DotSearchTracing;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AtLeast_ESTest extends AtLeast_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      vecInt0.insertFirst(276);
      AtLeast atLeast0 = new AtLeast((ILits) null, vecInt0, (-6804));
      // Undeclared exception!
      try { 
        atLeast0.isSatisfied();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.card.AtLeast", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      AtLeast atLeast0 = new AtLeast((ILits) null, vecInt0, 420);
      vecInt0.unsafePush(1);
      atLeast0.calcReasonOnTheFly(420, vecInt0, vecInt0);
      assertEquals(1, vecInt0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      IVecInt iVecInt0 = vecInt0.clone();
      AtLeast atLeast0 = new AtLeast((ILits) null, vecInt0, 420);
      atLeast0.calcReasonOnTheFly((-501), vecInt0, iVecInt0);
      assertEquals(420, atLeast0.requiredNumberOfSatisfiedLiterals());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      vecInt0.growTo(390, 390);
      AtLeast atLeast0 = new AtLeast((ILits) null, vecInt0, 390);
      // Undeclared exception!
      try { 
        atLeast0.calcReason((-507), vecInt0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.card.AtLeast", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      AtLeast atLeast0 = new AtLeast((ILits) null, vecInt0, 390);
      atLeast0.calcReason((-507), vecInt0);
      assertEquals(390, atLeast0.requiredNumberOfSatisfiedLiterals());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      vecInt0.growTo(403, 403);
      // Undeclared exception!
      try { 
        AtLeast.atLeastNew((UnitPropagationListener) null, (ILits) null, vecInt0, (-73));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.card.AtLeast", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      vecInt0.push((-899));
      AtLeast atLeast0 = new AtLeast((ILits) null, vecInt0, (-899));
      DotSearchTracing<Integer> dotSearchTracing0 = new DotSearchTracing<Integer>("VTM");
      // Undeclared exception!
      try { 
        atLeast0.toString((VarMapper) dotSearchTracing0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.card.AtLeast", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      vecInt0.growTo(390, 390);
      AtLeast atLeast0 = new AtLeast((ILits) null, vecInt0, 390);
      atLeast0.size();
      assertEquals(390, atLeast0.requiredNumberOfSatisfiedLiterals());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      AtLeast atLeast0 = new AtLeast((ILits) null, vecInt0, 0);
      int int0 = atLeast0.requiredNumberOfSatisfiedLiterals();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      AtLeast atLeast0 = new AtLeast((ILits) null, vecInt0, (-828));
      int int0 = atLeast0.requiredNumberOfSatisfiedLiterals();
      assertEquals((-828), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      PercentLengthLearning<MixedDataStructureDanielWLConciseBinary> percentLengthLearning0 = new PercentLengthLearning<MixedDataStructureDanielWLConciseBinary>(0);
      MixedDataStructureDanielWLConciseBinary mixedDataStructureDanielWLConciseBinary0 = new MixedDataStructureDanielWLConciseBinary();
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(varOrderHeap0, 0);
      LubyRestarts lubyRestarts0 = new LubyRestarts();
      Solver<MixedDataStructureDanielWLConciseBinary> solver0 = new Solver<MixedDataStructureDanielWLConciseBinary>(percentLengthLearning0, mixedDataStructureDanielWLConciseBinary0, randomWalkDecorator0, lubyRestarts0);
      int int0 = AtLeast.niceParameters(solver0, (ILits) null, vecInt0, 0);
      assertEquals(0, int0);
      assertEquals(0, solver0.getPropagationLevel());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      PercentLengthLearning<MixedDataStructureDanielWLConciseBinary> percentLengthLearning0 = new PercentLengthLearning<MixedDataStructureDanielWLConciseBinary>((-24));
      MixedDataStructureDanielWLConciseBinary mixedDataStructureDanielWLConciseBinary0 = new MixedDataStructureDanielWLConciseBinary();
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(varOrderHeap0, (-24));
      LubyRestarts lubyRestarts0 = new LubyRestarts();
      Solver<MixedDataStructureDanielWLConciseBinary> solver0 = new Solver<MixedDataStructureDanielWLConciseBinary>(percentLengthLearning0, mixedDataStructureDanielWLConciseBinary0, randomWalkDecorator0, lubyRestarts0);
      int int0 = AtLeast.niceParameters(solver0, (ILits) null, vecInt0, (-24));
      assertEquals((-24), int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      AtLeast atLeast0 = new AtLeast((ILits) null, vecInt0, 420);
      // Undeclared exception!
      try { 
        atLeast0.propagatePI((MandatoryLiteralListener) null, 420);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.card.AtLeast", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      AtLeast atLeast0 = new AtLeast((ILits) null, vecInt0, (-73));
      // Undeclared exception!
      try { 
        atLeast0.propagate((UnitPropagationListener) null, (-73));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.card.AtLeast", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      try { 
        AtLeast.niceParameters((UnitPropagationListener) null, (ILits) null, vecInt0, 112);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.card.AtLeast", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        AtLeast.niceParameters((UnitPropagationListener) null, (ILits) null, (IVecInt) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.card.AtLeast", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      Constr constr0 = AtLeast.atLeastNew((UnitPropagationListener) null, (ILits) null, vecInt0, (-2183));
      // Undeclared exception!
      try { 
        constr0.getAssertionLevel((IVecInt) null, (-1330));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.card.AtLeast", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      AtLeast atLeast0 = new AtLeast((ILits) null, vecInt0, 399);
      vecInt0.shrinkTo(399);
      // Undeclared exception!
      try { 
        atLeast0.getAssertionLevel(vecInt0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      AtLeast atLeast0 = new AtLeast((ILits) null, vecInt0, 512);
      // Undeclared exception!
      try { 
        atLeast0.calcReasonOnTheFly(512, (IVecInt) null, (IVecInt) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.card.AtLeast", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      AtLeast atLeast0 = new AtLeast((ILits) null, vecInt0, (-1));
      vecInt0.shrinkTo(360);
      // Undeclared exception!
      try { 
        atLeast0.calcReasonOnTheFly(399, vecInt0, vecInt0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("org.sat4j.core.VecInt$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      ReadOnlyVecInt readOnlyVecInt0 = new ReadOnlyVecInt(vecInt0);
      AtLeast atLeast0 = null;
      try {
        atLeast0 = new AtLeast((ILits) null, readOnlyVecInt0, (-656));
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.core.ReadOnlyVecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      AtLeast atLeast0 = null;
      try {
        atLeast0 = new AtLeast((ILits) null, (IVecInt) null, (-1186));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.card.AtLeast", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      vecInt0.shrink(741);
      AtLeast atLeast0 = null;
      try {
        atLeast0 = new AtLeast((ILits) null, vecInt0, (-1189));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.card.AtLeast", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      vecInt0.shrink((-1184));
      AtLeast atLeast0 = null;
      try {
        atLeast0 = new AtLeast((ILits) null, vecInt0, (-1184));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      AtLeast atLeast0 = new AtLeast((ILits) null, vecInt0, 420);
      atLeast0.register();
      assertEquals(420, atLeast0.requiredNumberOfSatisfiedLiterals());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      vecInt0.push((-899));
      AtLeast atLeast0 = new AtLeast((ILits) null, vecInt0, (-899));
      // Undeclared exception!
      try { 
        atLeast0.register();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.card.AtLeast", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      AtLeast atLeast0 = new AtLeast((ILits) null, vecInt0, 420);
      atLeast0.size();
      assertEquals(420, atLeast0.requiredNumberOfSatisfiedLiterals());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      AtLeast atLeast0 = new AtLeast((ILits) null, vecInt0, 6);
      String string0 = atLeast0.toString((VarMapper) null);
      assertEquals(">= 6", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      AtLeast atLeast0 = new AtLeast((ILits) null, vecInt0, (-1189));
      vecInt0.push((-1189));
      int int0 = atLeast0.getAssertionLevel(vecInt0, (-1189));
      assertEquals((-1), int0);
      assertEquals((-1189), atLeast0.requiredNumberOfSatisfiedLiterals());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      vecInt0.growTo(417, 417);
      AtLeast atLeast0 = new AtLeast((ILits) null, vecInt0, 417);
      int int0 = atLeast0.getAssertionLevel(vecInt0, 417);
      assertEquals(417, atLeast0.requiredNumberOfSatisfiedLiterals());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      AtLeast atLeast0 = new AtLeast((ILits) null, vecInt0, 420);
      boolean boolean0 = atLeast0.isSatisfied();
      assertEquals(420, atLeast0.requiredNumberOfSatisfiedLiterals());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      Constr constr0 = AtLeast.atLeastNew((UnitPropagationListener) null, (ILits) null, vecInt0, (-2183));
      constr0.calcReasonOnTheFly((-1), vecInt0, vecInt0);
      assertEquals((-2183), constr0.requiredNumberOfSatisfiedLiterals());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      vecInt0.unsafePush(288);
      AtLeast atLeast0 = new AtLeast((ILits) null, vecInt0, 288);
      // Undeclared exception!
      try { 
        atLeast0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.card.AtLeast", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      IVecInt iVecInt0 = vecInt0.push(391);
      AtLeast atLeast0 = new AtLeast((ILits) null, iVecInt0, 391);
      // Undeclared exception!
      try { 
        atLeast0.assertConstraint((UnitPropagationListener) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.card.AtLeast", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      Constr constr0 = AtLeast.atLeastNew((UnitPropagationListener) null, (ILits) null, vecInt0, (-1));
      constr0.assertConstraint((UnitPropagationListener) null);
      assertEquals((-1), constr0.requiredNumberOfSatisfiedLiterals());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      vecInt0.pop();
      // Undeclared exception!
      try { 
        AtLeast.atLeastNew((UnitPropagationListener) null, (ILits) null, vecInt0, (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.card.AtLeast", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      vecInt0.growTo(417, 417);
      AtLeast atLeast0 = new AtLeast((ILits) null, vecInt0, 417);
      // Undeclared exception!
      try { 
        atLeast0.calcReason(417, vecInt0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.card.AtLeast", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      Constr constr0 = AtLeast.atLeastNew((UnitPropagationListener) null, (ILits) null, vecInt0, (-1));
      constr0.calcReason((-1), vecInt0);
      assertEquals((-1), constr0.requiredNumberOfSatisfiedLiterals());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      vecInt0.unsafePush((-1165));
      AtLeast atLeast0 = new AtLeast((ILits) null, vecInt0, (-1165));
      // Undeclared exception!
      try { 
        atLeast0.remove((UnitPropagationListener) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.card.AtLeast", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      AtLeast atLeast0 = new AtLeast((ILits) null, vecInt0, 402);
      PercentLengthLearning<MixedDataStructureDanielWLConciseBinary> percentLengthLearning0 = new PercentLengthLearning<MixedDataStructureDanielWLConciseBinary>(0);
      MixedDataStructureDanielWLConciseBinary mixedDataStructureDanielWLConciseBinary0 = new MixedDataStructureDanielWLConciseBinary();
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(varOrderHeap0, 0);
      LubyRestarts lubyRestarts0 = new LubyRestarts();
      Solver<MixedDataStructureDanielWLConciseBinary> solver0 = new Solver<MixedDataStructureDanielWLConciseBinary>(percentLengthLearning0, mixedDataStructureDanielWLConciseBinary0, randomWalkDecorator0, lubyRestarts0);
      atLeast0.remove(solver0);
      assertEquals(402, atLeast0.requiredNumberOfSatisfiedLiterals());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      PercentLengthLearning<MixedDataStructureDanielWLConciseBinary> percentLengthLearning0 = new PercentLengthLearning<MixedDataStructureDanielWLConciseBinary>(0);
      MixedDataStructureDanielWLConciseBinary mixedDataStructureDanielWLConciseBinary0 = new MixedDataStructureDanielWLConciseBinary();
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(varOrderHeap0, 0);
      LubyRestarts lubyRestarts0 = new LubyRestarts();
      Solver<MixedDataStructureDanielWLConciseBinary> solver0 = new Solver<MixedDataStructureDanielWLConciseBinary>(percentLengthLearning0, mixedDataStructureDanielWLConciseBinary0, randomWalkDecorator0, lubyRestarts0);
      AtLeast.atLeastNew(solver0, (ILits) null, vecInt0, 0);
      assertEquals(0, solver0.getPropagationLevel());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      try { 
        AtLeast.atLeastNew((UnitPropagationListener) null, (ILits) null, vecInt0, 873);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.card.AtLeast", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      AtLeast atLeast0 = null;
      try {
        atLeast0 = new AtLeast((ILits) null, (IVecInt) null, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cards with degree 1 are clauses!!!!
         //
         verifyException("org.sat4j.minisat.constraints.card.AtLeast", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      AtLeast atLeast0 = new AtLeast((ILits) null, vecInt0, 420);
      atLeast0.setActivity((-1143.7));
      assertEquals(420, atLeast0.requiredNumberOfSatisfiedLiterals());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      AtLeast atLeast0 = new AtLeast((ILits) null, vecInt0, 1622);
      int int0 = atLeast0.requiredNumberOfSatisfiedLiterals();
      assertEquals(1622, int0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      Constr constr0 = AtLeast.atLeastNew((UnitPropagationListener) null, (ILits) null, vecInt0, (-1));
      // Undeclared exception!
      try { 
        constr0.assertConstraintIfNeeded((UnitPropagationListener) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.card.AtLeast", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      AtLeast atLeast0 = new AtLeast((ILits) null, vecInt0, 420);
      boolean boolean0 = atLeast0.canBePropagatedMultipleTimes();
      assertEquals(420, atLeast0.requiredNumberOfSatisfiedLiterals());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      AtLeast atLeast0 = new AtLeast((ILits) null, vecInt0, (-1189));
      double double0 = atLeast0.getActivity();
      assertEquals(0.0, double0, 0.01);
      assertEquals((-1189), atLeast0.requiredNumberOfSatisfiedLiterals());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      AtLeast atLeast0 = new AtLeast((ILits) null, vecInt0, (-73));
      Constr constr0 = atLeast0.toConstraint();
      assertEquals((-73), constr0.requiredNumberOfSatisfiedLiterals());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      AtLeast atLeast0 = new AtLeast((ILits) null, vecInt0, (-2069));
      // Undeclared exception!
      try { 
        atLeast0.rescaleBy((-3651.7604681529124));
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.card.AtLeast", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      AtLeast atLeast0 = new AtLeast((ILits) null, vecInt0, 420);
      atLeast0.forwardActivity(0.0);
      assertEquals(420, atLeast0.requiredNumberOfSatisfiedLiterals());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      AtLeast atLeast0 = new AtLeast((ILits) null, vecInt0, (-1));
      boolean boolean0 = atLeast0.locked();
      assertEquals((-1), atLeast0.requiredNumberOfSatisfiedLiterals());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      AtLeast atLeast0 = new AtLeast((ILits) null, vecInt0, 512);
      atLeast0.undo(512);
      assertEquals(512, atLeast0.requiredNumberOfSatisfiedLiterals());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      AtLeast atLeast0 = new AtLeast((ILits) null, vecInt0, 741);
      // Undeclared exception!
      try { 
        atLeast0.setLearnt();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.card.AtLeast", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      AtLeast atLeast0 = new AtLeast((ILits) null, vecInt0, (-478));
      boolean boolean0 = atLeast0.simplify();
      assertFalse(boolean0);
      assertEquals((-478), atLeast0.requiredNumberOfSatisfiedLiterals());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      AtLeast atLeast0 = new AtLeast((ILits) null, vecInt0, 370);
      // Undeclared exception!
      try { 
        atLeast0.get(370);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 370
         //
         verifyException("org.sat4j.minisat.constraints.card.AtLeast", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      AtLeast atLeast0 = new AtLeast((ILits) null, vecInt0, (-828));
      atLeast0.incActivity((-1914));
      assertEquals((-828), atLeast0.requiredNumberOfSatisfiedLiterals());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      AtLeast atLeast0 = new AtLeast((ILits) null, vecInt0, 420);
      boolean boolean0 = atLeast0.learnt();
      assertFalse(boolean0);
      assertEquals(420, atLeast0.requiredNumberOfSatisfiedLiterals());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      AtLeast atLeast0 = new AtLeast((ILits) null, vecInt0, 399);
      boolean boolean0 = atLeast0.canBeSatisfiedByCountingLiterals();
      assertTrue(boolean0);
      assertEquals(399, atLeast0.requiredNumberOfSatisfiedLiterals());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      AtLeast atLeast0 = new AtLeast((ILits) null, vecInt0, 420);
      String string0 = atLeast0.toString();
      assertEquals("Card (0) : >= 420", string0);
  }
}
