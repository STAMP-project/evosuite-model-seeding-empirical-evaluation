/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Nov 05 15:45:07 GMT 2019
 */

package jigl.image.types;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class BinaryImage_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  protected static ExecutorService executor; 

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "jigl.image.types.BinaryImage"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    executor = Executors.newCachedThreadPool(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    executor.shutdownNow(); 
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
    java.lang.System.setProperty("user.dir", "/home/pderakhshanfar/evosuite-model-seeding-ee/evosuite-model-seeding-empirical-evaluation"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(BinaryImage_ESTest_scaffolding.class.getClassLoader() ,
      "jigl.image.types.BinaryImage",
      "jigl.internal.DummyObserver",
      "jigl.image.types.ComplexImage",
      "jigl.image.types.InterpolatedRealGrayImage",
      "jigl.image.types.ImageKernel$1",
      "jigl.image.Image",
      "jigl.image.ArrayImage",
      "jigl.image.types.RealGrayImage",
      "jigl.image.exceptions.InvalidKernelException",
      "jigl.image.types.PhaseImage",
      "jigl.image.AbstractArrayImage",
      "jigl.image.types.GrayImage",
      "jigl.image.types.InterpolatedImage",
      "jigl.image.NumericImage",
      "jigl.image.types.KernelType",
      "jigl.math.Complex",
      "jigl.image.types.PowerImage",
      "jigl.image.AbstractImage",
      "jigl.image.types.MagnitudeImage",
      "jigl.image.ROI",
      "jigl.image.types.ImageKernel"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("jigl.image.types.ComplexImage", false, BinaryImage_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("jigl.image.types.PowerImage", false, BinaryImage_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(BinaryImage_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "jigl.image.types.BinaryImage",
      "jigl.image.types.PhaseImage",
      "jigl.image.types.InterpolatedRealGrayImage",
      "jigl.internal.DummyObserver",
      "jigl.image.types.MagnitudeImage",
      "jigl.util.ArrayUtil",
      "jigl.image.types.ComplexImage",
      "jigl.image.types.PowerImage",
      "jigl.image.types.RealColorImage",
      "jigl.image.types.InterpolatedRealColorImage",
      "jigl.image.ColorModel",
      "jigl.image.types.ImageKernel",
      "jigl.image.types.InterpolatedGrayImage",
      "jigl.image.types.ImageKernel$1",
      "jigl.image.ROI",
      "jigl.image.AbstractImage",
      "jigl.image.AbstractArrayImage",
      "jigl.image.types.RealGrayImage"
    );
  }
}
