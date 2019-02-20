/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 17 07:57:37 GMT 2019
 */

package org.sat4j.tools;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.sat4j.LightFactory;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.constraints.MixedDataStructureDanielWL;
import org.sat4j.minisat.core.Solver;
import org.sat4j.minisat.learning.ActiveLearning;
import org.sat4j.minisat.orders.PureOrder;
import org.sat4j.minisat.restarts.MiniSATRestarts;
import org.sat4j.opt.MaxSatDecorator;
import org.sat4j.opt.MinOneDecorator;
import org.sat4j.specs.Constr;
import org.sat4j.specs.IConstr;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVecInt;
import org.sat4j.tools.AbstractMinimalModel;
import org.sat4j.tools.CheckMUSSolutionListener;
import org.sat4j.tools.ClausalCardinalitiesDecorator;
import org.sat4j.tools.DimacsOutputSolver;
import org.sat4j.tools.DimacsStringSolver;
import org.sat4j.tools.GateTranslator;
import org.sat4j.tools.GroupClauseSelectorSolver;
import org.sat4j.tools.LexicoDecorator;
import org.sat4j.tools.Minimal4CardinalityModel;
import org.sat4j.tools.Minimal4InclusionModel;
import org.sat4j.tools.ModelIteratorToSATAdapter;
import org.sat4j.tools.NegationDecorator;
import org.sat4j.tools.SingleSolutionDetector;
import org.sat4j.tools.SolutionCounter;
import org.sat4j.tools.SolutionFoundListener;
import org.sat4j.tools.StatisticsSolver;
import org.sat4j.tools.encoding.Commander;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NegationDecorator_ESTest extends NegationDecorator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MixedDataStructureDanielWL mixedDataStructureDanielWL0 = new MixedDataStructureDanielWL();
      ActiveLearning<MixedDataStructureDanielWL> activeLearning0 = new ActiveLearning<MixedDataStructureDanielWL>();
      PureOrder pureOrder0 = new PureOrder();
      MiniSATRestarts miniSATRestarts0 = new MiniSATRestarts();
      Solver<MixedDataStructureDanielWL> solver0 = new Solver<MixedDataStructureDanielWL>(activeLearning0, mixedDataStructureDanielWL0, pureOrder0, miniSATRestarts0);
      Minimal4InclusionModel minimal4InclusionModel0 = new Minimal4InclusionModel(solver0);
      NegationDecorator<Minimal4InclusionModel> negationDecorator0 = new NegationDecorator<Minimal4InclusionModel>(minimal4InclusionModel0);
      boolean boolean0 = negationDecorator0.isSatisfiable((IVecInt) null, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Constr constr0 = Constr.TAUTOLOGY;
      LexicoDecorator<MaxSatDecorator> lexicoDecorator0 = (LexicoDecorator<MaxSatDecorator>) mock(LexicoDecorator.class, new ViolatedAssumptionAnswer());
      doReturn((IConstr) null, (IConstr) null, (IConstr) null).when(lexicoDecorator0).addClause(any(org.sat4j.specs.IVecInt.class));
      doReturn(false, false).when(lexicoDecorator0).isSatisfiable(any(org.sat4j.specs.IVecInt.class) , anyBoolean());
      doReturn(0, 0, 0, 2, 0).when(lexicoDecorator0).nVars();
      doReturn(0, 3126, 3126, 0).when(lexicoDecorator0).nextFreeVarId(anyBoolean());
      doReturn(false, false, false, true).when(lexicoDecorator0).removeConstr(any(org.sat4j.specs.IConstr.class));
      NegationDecorator<LexicoDecorator<MaxSatDecorator>> negationDecorator0 = new NegationDecorator<LexicoDecorator<MaxSatDecorator>>(lexicoDecorator0);
      negationDecorator0.isSatisfiable((IVecInt) null, false);
      VecInt vecInt0 = new VecInt();
      AbstractMinimalModel abstractMinimalModel0 = new AbstractMinimalModel(negationDecorator0);
      NegationDecorator<AbstractMinimalModel> negationDecorator1 = new NegationDecorator<AbstractMinimalModel>(abstractMinimalModel0);
      negationDecorator1.isSatisfiable((IVecInt) vecInt0, true);
      assertTrue(vecInt0.isEmpty());
      
      AbstractMinimalModel abstractMinimalModel1 = new AbstractMinimalModel(negationDecorator1);
      NegationDecorator<AbstractMinimalModel> negationDecorator2 = new NegationDecorator<AbstractMinimalModel>(abstractMinimalModel1);
      // Undeclared exception!
      try { 
        negationDecorator2.isSatisfiable((IVecInt) null, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The constraint you entered cannot be removed from the solver.
         //
         verifyException("org.sat4j.core.ConstrGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LexicoDecorator<MaxSatDecorator> lexicoDecorator0 = (LexicoDecorator<MaxSatDecorator>) mock(LexicoDecorator.class, new ViolatedAssumptionAnswer());
      doReturn((IConstr) null).when(lexicoDecorator0).addClause(any(org.sat4j.specs.IVecInt.class));
      doReturn(true).when(lexicoDecorator0).isSatisfiable(any(org.sat4j.specs.IVecInt.class) , anyBoolean());
      doReturn(true).when(lexicoDecorator0).removeConstr(any(org.sat4j.specs.IConstr.class));
      NegationDecorator<LexicoDecorator<MaxSatDecorator>> negationDecorator0 = new NegationDecorator<LexicoDecorator<MaxSatDecorator>>(lexicoDecorator0);
      boolean boolean0 = negationDecorator0.isSatisfiable((IVecInt) null, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MinOneDecorator minOneDecorator0 = mock(MinOneDecorator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(minOneDecorator0).nVars();
      doReturn(0).when(minOneDecorator0).nextFreeVarId(anyBoolean());
      Commander commander0 = new Commander();
      ClausalCardinalitiesDecorator<MinOneDecorator> clausalCardinalitiesDecorator0 = new ClausalCardinalitiesDecorator<MinOneDecorator>(minOneDecorator0, commander0);
      SolutionCounter solutionCounter0 = new SolutionCounter(clausalCardinalitiesDecorator0);
      IVecInt iVecInt0 = AbstractMinimalModel.positiveLiterals(solutionCounter0);
      NegationDecorator<SolutionCounter> negationDecorator0 = new NegationDecorator<SolutionCounter>(solutionCounter0);
      IConstr iConstr0 = negationDecorator0.addClause(iVecInt0);
      assertEquals(0, iConstr0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      NegationDecorator<DimacsStringSolver> negationDecorator0 = new NegationDecorator<DimacsStringSolver>(dimacsStringSolver0);
      // Undeclared exception!
      try { 
        negationDecorator0.isSatisfiable((IVecInt) null, true);
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
      LexicoDecorator<MaxSatDecorator> lexicoDecorator0 = (LexicoDecorator<MaxSatDecorator>) mock(LexicoDecorator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(lexicoDecorator0).nVars();
      NegationDecorator<LexicoDecorator<MaxSatDecorator>> negationDecorator0 = new NegationDecorator<LexicoDecorator<MaxSatDecorator>>(lexicoDecorator0);
      VecInt vecInt0 = new VecInt();
      AbstractMinimalModel abstractMinimalModel0 = new AbstractMinimalModel(negationDecorator0);
      NegationDecorator<AbstractMinimalModel> negationDecorator1 = new NegationDecorator<AbstractMinimalModel>(abstractMinimalModel0);
      AbstractMinimalModel abstractMinimalModel1 = new AbstractMinimalModel(negationDecorator1);
      negationDecorator1.setDecorated(abstractMinimalModel1);
      // Undeclared exception!
      try { 
        negationDecorator1.isSatisfiable((IVecInt) vecInt0, false);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LexicoDecorator<MaxSatDecorator> lexicoDecorator0 = new LexicoDecorator<MaxSatDecorator>((MaxSatDecorator) null);
      NegationDecorator<LexicoDecorator<MaxSatDecorator>> negationDecorator0 = new NegationDecorator<LexicoDecorator<MaxSatDecorator>>(lexicoDecorator0);
      // Undeclared exception!
      try { 
        negationDecorator0.isSatisfiable((IVecInt) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.SolverDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LexicoDecorator<MaxSatDecorator> lexicoDecorator0 = (LexicoDecorator<MaxSatDecorator>) mock(LexicoDecorator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(lexicoDecorator0).nVars();
      doReturn(0).when(lexicoDecorator0).nextFreeVarId(anyBoolean());
      doReturn(false).when(lexicoDecorator0).removeConstr(any(org.sat4j.specs.IConstr.class));
      NegationDecorator<LexicoDecorator<MaxSatDecorator>> negationDecorator0 = new NegationDecorator<LexicoDecorator<MaxSatDecorator>>(lexicoDecorator0);
      AbstractMinimalModel abstractMinimalModel0 = new AbstractMinimalModel(negationDecorator0);
      NegationDecorator<AbstractMinimalModel> negationDecorator1 = new NegationDecorator<AbstractMinimalModel>(abstractMinimalModel0);
      negationDecorator1.externalState();
      // Undeclared exception!
      try { 
        negationDecorator1.isSatisfiable((IVecInt) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.AbstractClauseSelectorSolver$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LexicoDecorator<MaxSatDecorator> lexicoDecorator0 = (LexicoDecorator<MaxSatDecorator>) mock(LexicoDecorator.class, new ViolatedAssumptionAnswer());
      doReturn((IConstr) null).when(lexicoDecorator0).addClause(any(org.sat4j.specs.IVecInt.class));
      doReturn(false).when(lexicoDecorator0).isSatisfiable(any(org.sat4j.specs.IVecInt.class) , anyBoolean());
      doReturn(0, 0, 0, 0).when(lexicoDecorator0).nVars();
      doReturn(0, 1, 0).when(lexicoDecorator0).nextFreeVarId(anyBoolean());
      doReturn(false, false, false).when(lexicoDecorator0).removeConstr(any(org.sat4j.specs.IConstr.class));
      NegationDecorator<LexicoDecorator<MaxSatDecorator>> negationDecorator0 = new NegationDecorator<LexicoDecorator<MaxSatDecorator>>(lexicoDecorator0);
      VecInt vecInt0 = new VecInt();
      AbstractMinimalModel abstractMinimalModel0 = new AbstractMinimalModel(negationDecorator0);
      NegationDecorator<AbstractMinimalModel> negationDecorator1 = new NegationDecorator<AbstractMinimalModel>(abstractMinimalModel0);
      negationDecorator1.isSatisfiable((IVecInt) vecInt0, false);
      AbstractMinimalModel abstractMinimalModel1 = new AbstractMinimalModel(negationDecorator1);
      NegationDecorator<AbstractMinimalModel> negationDecorator2 = new NegationDecorator<AbstractMinimalModel>(abstractMinimalModel1);
      // Undeclared exception!
      try { 
        negationDecorator2.isSatisfiable((IVecInt) null, false);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Please call newVar(int) before adding constraints!!!
         //
         verifyException("org.sat4j.tools.AbstractClauseSelectorSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LexicoDecorator<MaxSatDecorator> lexicoDecorator0 = (LexicoDecorator<MaxSatDecorator>) mock(LexicoDecorator.class, new ViolatedAssumptionAnswer());
      doReturn((IConstr) null).when(lexicoDecorator0).addClause(any(org.sat4j.specs.IVecInt.class));
      doReturn(0, 0, 0, 0).when(lexicoDecorator0).nVars();
      doReturn(0, 0, 0).when(lexicoDecorator0).nextFreeVarId(anyBoolean());
      doReturn(false).when(lexicoDecorator0).removeConstr(any(org.sat4j.specs.IConstr.class));
      NegationDecorator<LexicoDecorator<MaxSatDecorator>> negationDecorator0 = new NegationDecorator<LexicoDecorator<MaxSatDecorator>>(lexicoDecorator0);
      AbstractMinimalModel abstractMinimalModel0 = new AbstractMinimalModel(negationDecorator0);
      NegationDecorator<AbstractMinimalModel> negationDecorator1 = new NegationDecorator<AbstractMinimalModel>(abstractMinimalModel0);
      AbstractMinimalModel abstractMinimalModel1 = new AbstractMinimalModel(negationDecorator1);
      NegationDecorator<AbstractMinimalModel> negationDecorator2 = new NegationDecorator<AbstractMinimalModel>(abstractMinimalModel1);
      // Undeclared exception!
      try { 
        negationDecorator2.isSatisfiable((IVecInt) null, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The constraint you entered cannot be removed from the solver.
         //
         verifyException("org.sat4j.core.ConstrGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LexicoDecorator<MaxSatDecorator> lexicoDecorator0 = (LexicoDecorator<MaxSatDecorator>) mock(LexicoDecorator.class, new ViolatedAssumptionAnswer());
      NegationDecorator<LexicoDecorator<MaxSatDecorator>> negationDecorator0 = new NegationDecorator<LexicoDecorator<MaxSatDecorator>>(lexicoDecorator0);
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      CheckMUSSolutionListener checkMUSSolutionListener0 = new CheckMUSSolutionListener(lightFactory0);
      ModelIteratorToSATAdapter modelIteratorToSATAdapter0 = new ModelIteratorToSATAdapter(iSolver0, checkMUSSolutionListener0);
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(modelIteratorToSATAdapter0);
      LexicoDecorator<MaxSatDecorator> lexicoDecorator1 = new LexicoDecorator<MaxSatDecorator>(maxSatDecorator0);
      negationDecorator0.setDecorated(lexicoDecorator1);
      VecInt vecInt0 = new VecInt();
      AbstractMinimalModel abstractMinimalModel0 = new AbstractMinimalModel(negationDecorator0);
      NegationDecorator<AbstractMinimalModel> negationDecorator1 = new NegationDecorator<AbstractMinimalModel>(abstractMinimalModel0);
      // Undeclared exception!
      try { 
        negationDecorator1.isSatisfiable((IVecInt) vecInt0, false);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.sat4j.core.ConstrGroup cannot be cast to org.sat4j.specs.Constr
         //
         verifyException("org.sat4j.minisat.core.Solver", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StatisticsSolver statisticsSolver0 = new StatisticsSolver();
      NegationDecorator<StatisticsSolver> negationDecorator0 = new NegationDecorator<StatisticsSolver>(statisticsSolver0);
      VecInt vecInt0 = new VecInt(110);
      // Undeclared exception!
      try { 
        negationDecorator0.addClause(vecInt0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.tools.StatisticsSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NegationDecorator<DimacsOutputSolver> negationDecorator0 = new NegationDecorator<DimacsOutputSolver>((DimacsOutputSolver) null);
      // Undeclared exception!
      try { 
        negationDecorator0.addClause((IVecInt) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.AbstractClauseSelectorSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LexicoDecorator<MaxSatDecorator> lexicoDecorator0 = (LexicoDecorator<MaxSatDecorator>) mock(LexicoDecorator.class, new ViolatedAssumptionAnswer());
      doReturn(544, 544, 544, (-6)).when(lexicoDecorator0).nVars();
      doReturn(544, 0, 0, 0).when(lexicoDecorator0).nextFreeVarId(anyBoolean());
      NegationDecorator<LexicoDecorator<MaxSatDecorator>> negationDecorator0 = new NegationDecorator<LexicoDecorator<MaxSatDecorator>>(lexicoDecorator0);
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(negationDecorator0);
      int[] intArray0 = new int[4];
      intArray0[3] = 2151;
      VecInt vecInt0 = new VecInt(intArray0);
      GateTranslator gateTranslator0 = new GateTranslator(minimal4CardinalityModel0);
      GroupClauseSelectorSolver<GateTranslator> groupClauseSelectorSolver0 = new GroupClauseSelectorSolver<GateTranslator>(gateTranslator0);
      NegationDecorator<GroupClauseSelectorSolver<GateTranslator>> negationDecorator1 = new NegationDecorator<GroupClauseSelectorSolver<GateTranslator>>(groupClauseSelectorSolver0);
      // Undeclared exception!
      try { 
        negationDecorator1.addClause(vecInt0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Please call newVar(int) before adding constraints!!!
         //
         verifyException("org.sat4j.tools.AbstractClauseSelectorSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LexicoDecorator<MaxSatDecorator> lexicoDecorator0 = (LexicoDecorator<MaxSatDecorator>) mock(LexicoDecorator.class, new ViolatedAssumptionAnswer());
      doReturn((IConstr) null, (IConstr) null).when(lexicoDecorator0).addClause(any(org.sat4j.specs.IVecInt.class));
      doReturn(false, false).when(lexicoDecorator0).isSatisfiable(any(org.sat4j.specs.IVecInt.class) , anyBoolean());
      doReturn(0, 0).when(lexicoDecorator0).nVars();
      doReturn(0).when(lexicoDecorator0).nextFreeVarId(anyBoolean());
      doReturn(false, false, false).when(lexicoDecorator0).removeConstr(any(org.sat4j.specs.IConstr.class));
      NegationDecorator<LexicoDecorator<MaxSatDecorator>> negationDecorator0 = new NegationDecorator<LexicoDecorator<MaxSatDecorator>>(lexicoDecorator0);
      VecInt vecInt0 = new VecInt();
      AbstractMinimalModel abstractMinimalModel0 = new AbstractMinimalModel(negationDecorator0);
      NegationDecorator<AbstractMinimalModel> negationDecorator1 = new NegationDecorator<AbstractMinimalModel>(abstractMinimalModel0);
      boolean boolean0 = negationDecorator1.isSatisfiable((IVecInt) vecInt0, true);
      boolean boolean1 = negationDecorator0.isSatisfiable((IVecInt) vecInt0, false);
      assertTrue(boolean1 == boolean0);
      assertEquals(0, vecInt0.size());
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      NegationDecorator<DimacsStringSolver> negationDecorator0 = new NegationDecorator<DimacsStringSolver>(dimacsStringSolver0);
      Collection<Integer> collection0 = negationDecorator0.getAddedVars();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MinOneDecorator minOneDecorator0 = mock(MinOneDecorator.class, new ViolatedAssumptionAnswer());
      doReturn((IConstr) null).when(minOneDecorator0).addClause(any(org.sat4j.specs.IVecInt.class));
      doReturn(3301, 32, 0).when(minOneDecorator0).nVars();
      doReturn(3301, 0).when(minOneDecorator0).nextFreeVarId(anyBoolean());
      Commander commander0 = new Commander();
      ClausalCardinalitiesDecorator<MinOneDecorator> clausalCardinalitiesDecorator0 = new ClausalCardinalitiesDecorator<MinOneDecorator>(minOneDecorator0, commander0);
      SolutionFoundListener solutionFoundListener0 = SolutionFoundListener.VOID;
      ModelIteratorToSATAdapter modelIteratorToSATAdapter0 = new ModelIteratorToSATAdapter(clausalCardinalitiesDecorator0, (-236L), solutionFoundListener0);
      GateTranslator gateTranslator0 = new GateTranslator(modelIteratorToSATAdapter0);
      SolutionCounter solutionCounter0 = new SolutionCounter(gateTranslator0);
      IVecInt iVecInt0 = AbstractMinimalModel.positiveLiterals(solutionCounter0);
      NegationDecorator<SolutionCounter> negationDecorator0 = new NegationDecorator<SolutionCounter>(solutionCounter0);
      // Undeclared exception!
      try { 
        negationDecorator0.addClause(iVecInt0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The constraint you entered cannot be removed from the solver.
         //
         verifyException("org.sat4j.core.ConstrGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StatisticsSolver statisticsSolver0 = new StatisticsSolver();
      NegationDecorator<StatisticsSolver> negationDecorator0 = new NegationDecorator<StatisticsSolver>(statisticsSolver0);
      // Undeclared exception!
      try { 
        negationDecorator0.addAtLeast((IVecInt) null, 2);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.tools.NegationDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StatisticsSolver statisticsSolver0 = new StatisticsSolver();
      NegationDecorator<StatisticsSolver> negationDecorator0 = new NegationDecorator<StatisticsSolver>(statisticsSolver0);
      // Undeclared exception!
      try { 
        negationDecorator0.addAtMost((IVecInt) null, 57);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.tools.NegationDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NegationDecorator<SingleSolutionDetector> negationDecorator0 = new NegationDecorator<SingleSolutionDetector>((SingleSolutionDetector) null);
      // Undeclared exception!
      try { 
        negationDecorator0.addExactly((IVecInt) null, 3642);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.tools.NegationDecorator", e);
      }
  }
}