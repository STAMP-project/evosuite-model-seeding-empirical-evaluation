/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 17 08:02:20 GMT 2019
 */

package org.sat4j.tools;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.sat4j.LightFactory;
import org.sat4j.core.ASolverFactory;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.constraints.ClausalDataStructureWL;
import org.sat4j.minisat.constraints.cnf.UnitClause;
import org.sat4j.minisat.core.Solver;
import org.sat4j.opt.MaxSatDecorator;
import org.sat4j.specs.IConstr;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVecInt;
import org.sat4j.tools.AbstractMinimalModel;
import org.sat4j.tools.DimacsOutputSolver;
import org.sat4j.tools.DimacsStringSolver;
import org.sat4j.tools.FullClauseSelectorSolver;
import org.sat4j.tools.GateTranslator;
import org.sat4j.tools.GroupClauseSelectorSolver;
import org.sat4j.tools.LexicoDecorator;
import org.sat4j.tools.ManyCore;
import org.sat4j.tools.Minimal4CardinalityModel;
import org.sat4j.tools.ModelIterator;
import org.sat4j.tools.NegationDecorator;
import org.sat4j.tools.OptToSatAdapter;
import org.sat4j.tools.SingleSolutionDetector;
import org.sat4j.tools.StatisticsSolver;
import org.sat4j.tools.SubModelIterator;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GroupClauseSelectorSolver_ESTest extends GroupClauseSelectorSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      ManyCore<AbstractMinimalModel> manyCore0 = (ManyCore<AbstractMinimalModel>) mock(ManyCore.class, new ViolatedAssumptionAnswer());
      doReturn(vecInt0).when(manyCore0).unsatExplanation();
      GroupClauseSelectorSolver<ManyCore<AbstractMinimalModel>> groupClauseSelectorSolver0 = new GroupClauseSelectorSolver<ManyCore<AbstractMinimalModel>>(manyCore0);
      vecInt0.push((-3757));
      IVecInt iVecInt0 = groupClauseSelectorSolver0.unsatExplanation();
      assertEquals(0, iVecInt0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      SingleSolutionDetector singleSolutionDetector0 = new SingleSolutionDetector(dimacsOutputSolver0);
      GroupClauseSelectorSolver<SingleSolutionDetector> groupClauseSelectorSolver0 = new GroupClauseSelectorSolver<SingleSolutionDetector>(singleSolutionDetector0);
      groupClauseSelectorSolver0.addControlableClause(vecInt0, (-3757));
      Map<Integer, Integer> map0 = groupClauseSelectorSolver0.getVarToHighLevel();
      assertEquals(1, map0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver(2131);
      GroupClauseSelectorSolver<DimacsStringSolver> groupClauseSelectorSolver0 = new GroupClauseSelectorSolver<DimacsStringSolver>(dimacsStringSolver0);
      Integer integer0 = groupClauseSelectorSolver0.getGroupVar(vecInt0, 1);
      assertEquals(1, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      VecInt vecInt0 = new VecInt(2115);
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      SingleSolutionDetector singleSolutionDetector0 = new SingleSolutionDetector(dimacsOutputSolver0);
      GroupClauseSelectorSolver<SingleSolutionDetector> groupClauseSelectorSolver0 = new GroupClauseSelectorSolver<SingleSolutionDetector>(singleSolutionDetector0);
      groupClauseSelectorSolver0.addControlableClause(vecInt0, (-3757));
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(iSolver0);
      GroupClauseSelectorSolver<Minimal4CardinalityModel> groupClauseSelectorSolver1 = new GroupClauseSelectorSolver<Minimal4CardinalityModel>(minimal4CardinalityModel0);
      UnitClause unitClause0 = (UnitClause)groupClauseSelectorSolver1.addNonControlableClause(vecInt0);
      assertTrue(unitClause0.isSatisfied());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      GroupClauseSelectorSolver<DimacsStringSolver> groupClauseSelectorSolver0 = new GroupClauseSelectorSolver<DimacsStringSolver>(dimacsStringSolver0);
      // Undeclared exception!
      try { 
        groupClauseSelectorSolver0.unsatExplanation();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.AbstractOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GroupClauseSelectorSolver<Solver<ClausalDataStructureWL>> groupClauseSelectorSolver0 = new GroupClauseSelectorSolver<Solver<ClausalDataStructureWL>>((Solver<ClausalDataStructureWL>) null);
      // Undeclared exception!
      try { 
        groupClauseSelectorSolver0.unsatExplanation();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.SolverDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ASolverFactory<AbstractMinimalModel> aSolverFactory0 = (ASolverFactory<AbstractMinimalModel>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      String[] stringArray0 = new String[0];
      ManyCore<AbstractMinimalModel> manyCore0 = new ManyCore<AbstractMinimalModel>(aSolverFactory0, false, stringArray0);
      GroupClauseSelectorSolver<ManyCore<AbstractMinimalModel>> groupClauseSelectorSolver0 = new GroupClauseSelectorSolver<ManyCore<AbstractMinimalModel>>(manyCore0);
      // Undeclared exception!
      try { 
        groupClauseSelectorSolver0.unsatExplanation();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      GroupClauseSelectorSolver<DimacsStringSolver> groupClauseSelectorSolver0 = new GroupClauseSelectorSolver<DimacsStringSolver>(dimacsStringSolver0);
      // Undeclared exception!
      try { 
        groupClauseSelectorSolver0.model();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.DimacsStringSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GroupClauseSelectorSolver<GroupClauseSelectorSolver<ModelIterator>> groupClauseSelectorSolver0 = new GroupClauseSelectorSolver<GroupClauseSelectorSolver<ModelIterator>>((GroupClauseSelectorSolver<ModelIterator>) null);
      // Undeclared exception!
      try { 
        groupClauseSelectorSolver0.model();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.SolverDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      vecInt0.push(0);
      int[] intArray0 = new int[4];
      LexicoDecorator<GateTranslator> lexicoDecorator0 = (LexicoDecorator<GateTranslator>) mock(LexicoDecorator.class, new ViolatedAssumptionAnswer());
      doReturn(intArray0).when(lexicoDecorator0).modelWithInternalVariables();
      doReturn(0, (-1509)).when(lexicoDecorator0).nextFreeVarId(anyBoolean());
      GroupClauseSelectorSolver<LexicoDecorator<GateTranslator>> groupClauseSelectorSolver0 = new GroupClauseSelectorSolver<LexicoDecorator<GateTranslator>>(lexicoDecorator0);
      groupClauseSelectorSolver0.getGroupVar(vecInt0, 0);
      // Undeclared exception!
      try { 
        groupClauseSelectorSolver0.model();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.sat4j.tools.GroupClauseSelectorSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StatisticsSolver statisticsSolver0 = new StatisticsSolver();
      GroupClauseSelectorSolver<StatisticsSolver> groupClauseSelectorSolver0 = new GroupClauseSelectorSolver<StatisticsSolver>(statisticsSolver0);
      VecInt vecInt0 = new VecInt();
      // Undeclared exception!
      try { 
        groupClauseSelectorSolver0.getGroupVar(vecInt0, (-336));
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.tools.StatisticsSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StatisticsSolver statisticsSolver0 = new StatisticsSolver();
      GroupClauseSelectorSolver<StatisticsSolver> groupClauseSelectorSolver0 = new GroupClauseSelectorSolver<StatisticsSolver>(statisticsSolver0);
      // Undeclared exception!
      try { 
        groupClauseSelectorSolver0.getGroupVar((IVecInt) null, (-166));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.AbstractClauseSelectorSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ManyCore<SubModelIterator> manyCore0 = (ManyCore<SubModelIterator>) mock(ManyCore.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(manyCore0).nextFreeVarId(anyBoolean());
      GroupClauseSelectorSolver<ManyCore<SubModelIterator>> groupClauseSelectorSolver0 = new GroupClauseSelectorSolver<ManyCore<SubModelIterator>>(manyCore0);
      VecInt vecInt0 = new VecInt(2131);
      IVecInt iVecInt0 = vecInt0.push(2131);
      // Undeclared exception!
      try { 
        groupClauseSelectorSolver0.getGroupVar(iVecInt0, 1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Please call newVar(int) before adding constraints!!!
         //
         verifyException("org.sat4j.tools.AbstractClauseSelectorSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      VecInt vecInt0 = new VecInt(2115);
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(iSolver0);
      GroupClauseSelectorSolver<Minimal4CardinalityModel> groupClauseSelectorSolver0 = new GroupClauseSelectorSolver<Minimal4CardinalityModel>(minimal4CardinalityModel0);
      try { 
        groupClauseSelectorSolver0.addNonControlableClause(vecInt0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Creating Empty clause ?
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Clauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GroupClauseSelectorSolver<StatisticsSolver> groupClauseSelectorSolver0 = new GroupClauseSelectorSolver<StatisticsSolver>((StatisticsSolver) null);
      VecInt vecInt0 = new VecInt();
      // Undeclared exception!
      try { 
        groupClauseSelectorSolver0.addNonControlableClause(vecInt0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.SolverDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StatisticsSolver statisticsSolver0 = new StatisticsSolver();
      GroupClauseSelectorSolver<StatisticsSolver> groupClauseSelectorSolver0 = new GroupClauseSelectorSolver<StatisticsSolver>(statisticsSolver0);
      VecInt vecInt0 = new VecInt();
      SingleSolutionDetector singleSolutionDetector0 = new SingleSolutionDetector(groupClauseSelectorSolver0);
      GroupClauseSelectorSolver<SingleSolutionDetector> groupClauseSelectorSolver1 = new GroupClauseSelectorSolver<SingleSolutionDetector>(singleSolutionDetector0);
      // Undeclared exception!
      try { 
        groupClauseSelectorSolver1.addControlableClause(vecInt0, 1197);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.tools.StatisticsSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ManyCore<MaxSatDecorator> manyCore0 = (ManyCore<MaxSatDecorator>) mock(ManyCore.class, new ViolatedAssumptionAnswer());
      GroupClauseSelectorSolver<ManyCore<MaxSatDecorator>> groupClauseSelectorSolver0 = new GroupClauseSelectorSolver<ManyCore<MaxSatDecorator>>(manyCore0);
      // Undeclared exception!
      try { 
        groupClauseSelectorSolver0.addControlableClause((IVecInt) null, 1491);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.AbstractClauseSelectorSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      SingleSolutionDetector singleSolutionDetector0 = new SingleSolutionDetector(dimacsOutputSolver0);
      GroupClauseSelectorSolver<SingleSolutionDetector> groupClauseSelectorSolver0 = new GroupClauseSelectorSolver<SingleSolutionDetector>(singleSolutionDetector0);
      VecInt vecInt0 = new VecInt(2131);
      IVecInt iVecInt0 = vecInt0.push(2131);
      // Undeclared exception!
      try { 
        groupClauseSelectorSolver0.addControlableClause(iVecInt0, 176);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Please call newVar(int) before adding constraints!!!
         //
         verifyException("org.sat4j.tools.AbstractClauseSelectorSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      IVecInt iVecInt0 = vecInt0.push(0);
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      NegationDecorator<DimacsOutputSolver> negationDecorator0 = new NegationDecorator<DimacsOutputSolver>(dimacsOutputSolver0);
      GroupClauseSelectorSolver<NegationDecorator<DimacsOutputSolver>> groupClauseSelectorSolver0 = new GroupClauseSelectorSolver<NegationDecorator<DimacsOutputSolver>>(negationDecorator0);
      // Undeclared exception!
      try { 
        groupClauseSelectorSolver0.addControlableClause(iVecInt0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The constraint you entered cannot be removed from the solver.
         //
         verifyException("org.sat4j.core.ConstrGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LexicoDecorator<DimacsOutputSolver> lexicoDecorator0 = (LexicoDecorator<DimacsOutputSolver>) mock(LexicoDecorator.class, new ViolatedAssumptionAnswer());
      doReturn((-730)).when(lexicoDecorator0).nextFreeVarId(anyBoolean());
      GroupClauseSelectorSolver<LexicoDecorator<DimacsOutputSolver>> groupClauseSelectorSolver0 = new GroupClauseSelectorSolver<LexicoDecorator<DimacsOutputSolver>>(lexicoDecorator0);
      int[] intArray0 = new int[0];
      VecInt vecInt0 = new VecInt(intArray0);
      IVecInt iVecInt0 = vecInt0.pop();
      // Undeclared exception!
      try { 
        groupClauseSelectorSolver0.addControlableClause(iVecInt0, 100);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StatisticsSolver statisticsSolver0 = new StatisticsSolver();
      GroupClauseSelectorSolver<StatisticsSolver> groupClauseSelectorSolver0 = new GroupClauseSelectorSolver<StatisticsSolver>(statisticsSolver0);
      VecInt vecInt0 = new VecInt();
      // Undeclared exception!
      try { 
        groupClauseSelectorSolver0.addClause((IVecInt) vecInt0, (-5502));
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.tools.StatisticsSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      GroupClauseSelectorSolver<DimacsStringSolver> groupClauseSelectorSolver0 = new GroupClauseSelectorSolver<DimacsStringSolver>(dimacsStringSolver0);
      VecInt vecInt0 = new VecInt(2131);
      IVecInt iVecInt0 = vecInt0.push(2131);
      // Undeclared exception!
      try { 
        groupClauseSelectorSolver0.addClause(iVecInt0, 1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Please call newVar(int) before adding constraints!!!
         //
         verifyException("org.sat4j.tools.AbstractClauseSelectorSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      GroupClauseSelectorSolver<DimacsStringSolver> groupClauseSelectorSolver0 = new GroupClauseSelectorSolver<DimacsStringSolver>(dimacsStringSolver0);
      int[] intArray0 = new int[0];
      VecInt vecInt0 = new VecInt(intArray0);
      IVecInt iVecInt0 = vecInt0.pop();
      // Undeclared exception!
      try { 
        groupClauseSelectorSolver0.addClause(iVecInt0, (-306));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      ManyCore<AbstractMinimalModel> manyCore0 = (ManyCore<AbstractMinimalModel>) mock(ManyCore.class, new ViolatedAssumptionAnswer());
      doReturn((IConstr) null).when(manyCore0).addClause(any(org.sat4j.specs.IVecInt.class));
      doReturn(0).when(manyCore0).nextFreeVarId(anyBoolean());
      doReturn(vecInt0).when(manyCore0).unsatExplanation();
      GroupClauseSelectorSolver<ManyCore<AbstractMinimalModel>> groupClauseSelectorSolver0 = new GroupClauseSelectorSolver<ManyCore<AbstractMinimalModel>>(manyCore0);
      groupClauseSelectorSolver0.addClause((IVecInt) vecInt0, (-690));
      IVecInt iVecInt0 = groupClauseSelectorSolver0.unsatExplanation();
      assertFalse(vecInt0.isEmpty());
      assertEquals(690, iVecInt0.last());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      Integer integer0 = new Integer(38);
      IVecInt iVecInt0 = vecInt0.push((int) integer0);
      ManyCore<AbstractMinimalModel> manyCore0 = (ManyCore<AbstractMinimalModel>) mock(ManyCore.class, new ViolatedAssumptionAnswer());
      doReturn(iVecInt0).when(manyCore0).unsatExplanation();
      GroupClauseSelectorSolver<ManyCore<AbstractMinimalModel>> groupClauseSelectorSolver0 = new GroupClauseSelectorSolver<ManyCore<AbstractMinimalModel>>(manyCore0);
      IVecInt iVecInt1 = groupClauseSelectorSolver0.unsatExplanation();
      assertTrue(iVecInt1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      int[] intArray0 = new int[4];
      LexicoDecorator<GateTranslator> lexicoDecorator0 = (LexicoDecorator<GateTranslator>) mock(LexicoDecorator.class, new ViolatedAssumptionAnswer());
      doReturn(intArray0).when(lexicoDecorator0).modelWithInternalVariables();
      doReturn(0).when(lexicoDecorator0).nextFreeVarId(anyBoolean());
      GroupClauseSelectorSolver<LexicoDecorator<GateTranslator>> groupClauseSelectorSolver0 = new GroupClauseSelectorSolver<LexicoDecorator<GateTranslator>>(lexicoDecorator0);
      groupClauseSelectorSolver0.getGroupVar(vecInt0, 0);
      int[] intArray1 = groupClauseSelectorSolver0.model();
      assertEquals(3, intArray1.length);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LexicoDecorator<GateTranslator> lexicoDecorator0 = new LexicoDecorator<GateTranslator>((GateTranslator) null);
      GroupClauseSelectorSolver<LexicoDecorator<GateTranslator>> groupClauseSelectorSolver0 = new GroupClauseSelectorSolver<LexicoDecorator<GateTranslator>>(lexicoDecorator0);
      int[] intArray0 = groupClauseSelectorSolver0.model();
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      SingleSolutionDetector singleSolutionDetector0 = new SingleSolutionDetector(dimacsOutputSolver0);
      GroupClauseSelectorSolver<SingleSolutionDetector> groupClauseSelectorSolver0 = new GroupClauseSelectorSolver<SingleSolutionDetector>(singleSolutionDetector0);
      groupClauseSelectorSolver0.addControlableClause(vecInt0, (-3757));
      groupClauseSelectorSolver0.addControlableClause(vecInt0, (-3757));
      assertEquals(2, vecInt0.size());
      assertEquals(1, vecInt0.last());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      NegationDecorator<DimacsOutputSolver> negationDecorator0 = new NegationDecorator<DimacsOutputSolver>(dimacsOutputSolver0);
      GroupClauseSelectorSolver<NegationDecorator<DimacsOutputSolver>> groupClauseSelectorSolver0 = new GroupClauseSelectorSolver<NegationDecorator<DimacsOutputSolver>>(negationDecorator0);
      IConstr iConstr0 = groupClauseSelectorSolver0.addControlableClause(vecInt0, 0);
      assertEquals(0, iConstr0.size());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StatisticsSolver statisticsSolver0 = new StatisticsSolver();
      GroupClauseSelectorSolver<StatisticsSolver> groupClauseSelectorSolver0 = new GroupClauseSelectorSolver<StatisticsSolver>(statisticsSolver0);
      Collection<Integer> collection0 = groupClauseSelectorSolver0.getAddedVars();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StatisticsSolver statisticsSolver0 = new StatisticsSolver();
      GroupClauseSelectorSolver<StatisticsSolver> groupClauseSelectorSolver0 = new GroupClauseSelectorSolver<StatisticsSolver>(statisticsSolver0);
      Map<Integer, Integer> map0 = groupClauseSelectorSolver0.getVarToHighLevel();
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FullClauseSelectorSolver<OptToSatAdapter> fullClauseSelectorSolver0 = (FullClauseSelectorSolver<OptToSatAdapter>) mock(FullClauseSelectorSolver.class, new ViolatedAssumptionAnswer());
      doReturn((IConstr) null).when(fullClauseSelectorSolver0).addClause(any(org.sat4j.specs.IVecInt.class));
      GroupClauseSelectorSolver<FullClauseSelectorSolver<OptToSatAdapter>> groupClauseSelectorSolver0 = new GroupClauseSelectorSolver<FullClauseSelectorSolver<OptToSatAdapter>>(fullClauseSelectorSolver0);
      IConstr iConstr0 = groupClauseSelectorSolver0.addNonControlableClause((IVecInt) null);
      assertNull(iConstr0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      StatisticsSolver statisticsSolver0 = new StatisticsSolver();
      GroupClauseSelectorSolver<StatisticsSolver> groupClauseSelectorSolver0 = new GroupClauseSelectorSolver<StatisticsSolver>(statisticsSolver0);
      // Undeclared exception!
      try { 
        groupClauseSelectorSolver0.addClause((IVecInt) null, (-483));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.AbstractClauseSelectorSolver", e);
      }
  }
}