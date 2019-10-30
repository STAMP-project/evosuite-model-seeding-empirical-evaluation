/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Oct 29 08:24:31 GMT 2019
 */

package jahuwaldt.plot;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ContourPlot_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "jahuwaldt.plot.ContourPlot"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("user.home", "/home/pderakhshanfar"); 
    java.lang.System.setProperty("user.dir", "/home/pderakhshanfar/evosuite-model-seeding-ee/evosuite-model-seeding-empirical-evaluation"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ContourPlot_ESTest_scaffolding.class.getClassLoader() ,
      "jahuwaldt.plot.PlotRun",
      "jahuwaldt.plot.TabLSymbol",
      "jahuwaldt.plot.ThinRect1Symbol",
      "jahuwaldt.plot.PlotXAxis",
      "jahuwaldt.plot.BoxLLSymbol",
      "jahuwaldt.plot.PolygonSymbol",
      "jahuwaldt.plot.SimplePlotXY",
      "jahuwaldt.plot.Plot",
      "jahuwaldt.plot.AxisLimitData",
      "jahuwaldt.plot.RTriangle4Symbol",
      "jahuwaldt.plot.Plot2D",
      "jahuwaldt.plot.XSymbol",
      "jahuwaldt.plot.PlotAxis",
      "jahuwaldt.plot.BoxULSymbol",
      "jahuwaldt.plot.ContourAttrib",
      "jahuwaldt.plot.TabUpSymbol",
      "jahuwaldt.plot.BoxURSymbol",
      "jahuwaldt.plot.PlotYAxis",
      "jahuwaldt.plot.CircleSymbol",
      "jahuwaldt.plot.ContourPlot",
      "jahuwaldt.plot.TickMarkData",
      "jahuwaldt.plot.ThinRect2Symbol",
      "jahuwaldt.plot.BoxLRSymbol",
      "jahuwaldt.plot.DiamondSymbol",
      "jahuwaldt.plot.PlotAxisScale",
      "jahuwaldt.plot.LinearAxisScale",
      "jahuwaldt.plot.ContourGenerator",
      "jahuwaldt.plot.SquareSymbol",
      "jahuwaldt.plot.PlotYAxis$RotateFilter",
      "jahuwaldt.plot.PlotSymbol",
      "jahuwaldt.plot.ContourPath",
      "jahuwaldt.plot.PlotRunList",
      "jahuwaldt.plot.TabDSymbol",
      "jahuwaldt.plot.PlotDatum",
      "jahuwaldt.plot.RTriangle1Symbol"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ContourPlot_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "jahuwaldt.plot.SimplePlotXY",
      "jahuwaldt.plot.ContourPlot",
      "jahuwaldt.plot.ContourGenerator",
      "jahuwaldt.plot.PlotSymbol",
      "jahuwaldt.plot.PolygonSymbol",
      "jahuwaldt.plot.ThinRect2Symbol",
      "jahuwaldt.plot.PlotRun",
      "jahuwaldt.plot.PlotDatum",
      "jahuwaldt.plot.PlotXAxis",
      "jahuwaldt.plot.LinearAxisScale",
      "jahuwaldt.plot.PlotYAxis",
      "jahuwaldt.plot.ContourAttrib",
      "jahuwaldt.plot.AxisLimitData",
      "jahuwaldt.plot.BoxLLSymbol",
      "jahuwaldt.plot.ContourPath",
      "jahuwaldt.plot.TabLSymbol",
      "jahuwaldt.plot.RTriangle4Symbol",
      "jahuwaldt.plot.SquareSymbol",
      "jahuwaldt.plot.CircleSymbol",
      "jahuwaldt.plot.BoxULSymbol",
      "jahuwaldt.plot.BoxURSymbol",
      "jahuwaldt.plot.XSymbol",
      "jahuwaldt.plot.ThinRect1Symbol",
      "jahuwaldt.plot.BoxLRSymbol",
      "jahuwaldt.plot.TabUpSymbol",
      "jahuwaldt.plot.RTriangle1Symbol",
      "jahuwaldt.plot.DiamondSymbol",
      "jahuwaldt.plot.TabDSymbol",
      "jahuwaldt.plot.TickMarkData",
      "jahuwaldt.plot.PlotRunList",
      "jahuwaldt.plot.PlotAxis"
    );
  }
}
