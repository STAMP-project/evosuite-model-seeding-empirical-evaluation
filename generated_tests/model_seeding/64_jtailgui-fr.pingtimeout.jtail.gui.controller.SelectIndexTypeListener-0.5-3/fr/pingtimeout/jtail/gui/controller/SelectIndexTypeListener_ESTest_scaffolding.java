/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Oct 29 10:56:47 GMT 2019
 */

package fr.pingtimeout.jtail.gui.controller;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class SelectIndexTypeListener_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "fr.pingtimeout.jtail.gui.controller.SelectIndexTypeListener"; 
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
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("user.dir", "/home/pderakhshanfar/evosuite-model-seeding-ee/evosuite-model-seeding-empirical-evaluation"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.home", "/home/pderakhshanfar"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(SelectIndexTypeListener_ESTest_scaffolding.class.getClassLoader() ,
      "fr.pingtimeout.jtail.io.index.FileIndex",
      "fr.pingtimeout.jtail.gui.model.OpenFileModelEvent",
      "fr.pingtimeout.jtail.gui.action.ChooseFileAction",
      "fr.pingtimeout.jtail.io.index.ImmutableFileIndex",
      "fr.pingtimeout.jtail.gui.view.JTailPanel",
      "fr.pingtimeout.jtail.gui.action.JTailAbstractAction",
      "fr.pingtimeout.jtail.gui.action.LogFileFilter",
      "fr.pingtimeout.jtail.util.JTailLogger",
      "fr.pingtimeout.jtail.gui.action.OpenFileAction",
      "fr.pingtimeout.jtail.util.JTailConstants",
      "fr.pingtimeout.jtail.gui.controller.FileIndexerWorker",
      "fr.pingtimeout.jtail.gui.controller.IndexationProgressMonitor",
      "fr.pingtimeout.jtail.gui.model.JTailModel",
      "fr.pingtimeout.jtail.gui.view.OpenFileDialog",
      "fr.pingtimeout.jtail.gui.controller.SelectIndexTypeListener",
      "fr.pingtimeout.jtail.gui.model.JTailMainModelEvent",
      "fr.pingtimeout.jtail.gui.model.OpenFileModel",
      "fr.pingtimeout.jtail.gui.action.IndexFileAction",
      "fr.pingtimeout.jtail.gui.model.JTailMainModelEvent$Type",
      "fr.pingtimeout.jtail.io.index.RomFileIndex",
      "fr.pingtimeout.jtail.gui.model.JTailMainModel",
      "fr.pingtimeout.jtail.gui.view.JTailPanel$1",
      "fr.pingtimeout.jtail.io.LineReader",
      "fr.pingtimeout.jtail.io.index.RamFileIndex",
      "fr.pingtimeout.jtail.gui.model.JTailModelEvent",
      "fr.pingtimeout.jtail.util.JTailLogger$LoggerLevel",
      "fr.pingtimeout.jtail.gui.action.MenuAction",
      "fr.pingtimeout.jtail.gui.model.OpenFileModelEvent$Type",
      "fr.pingtimeout.jtail.gui.model.JTailModelEvent$Type",
      "fr.pingtimeout.jtail.io.index.FileIndex$Type"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(SelectIndexTypeListener_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "fr.pingtimeout.jtail.gui.controller.SelectIndexTypeListener",
      "fr.pingtimeout.jtail.util.JTailLogger$LoggerLevel",
      "fr.pingtimeout.jtail.util.JTailConstants",
      "fr.pingtimeout.jtail.util.JTailLogger",
      "fr.pingtimeout.jtail.io.index.FileIndex$Type",
      "fr.pingtimeout.jtail.gui.model.OpenFileModelEvent$Type",
      "fr.pingtimeout.jtail.gui.model.OpenFileModelEvent",
      "fr.pingtimeout.jtail.gui.action.JTailAbstractAction",
      "fr.pingtimeout.jtail.gui.action.ChooseFileAction",
      "fr.pingtimeout.jtail.gui.model.JTailMainModel",
      "fr.pingtimeout.jtail.gui.action.IndexFileAction",
      "fr.pingtimeout.jtail.gui.action.MenuAction",
      "fr.pingtimeout.jtail.io.index.RamFileIndex",
      "fr.pingtimeout.jtail.io.index.ImmutableFileIndex",
      "fr.pingtimeout.jtail.io.index.RomFileIndex",
      "fr.pingtimeout.jtail.gui.controller.IndexationProgressMonitor",
      "fr.pingtimeout.jtail.gui.view.JTailPanel",
      "fr.pingtimeout.jtail.io.LineReader",
      "fr.pingtimeout.jtail.gui.controller.FileIndexerWorker",
      "fr.pingtimeout.jtail.gui.view.OpenFileDialog",
      "fr.pingtimeout.jtail.gui.model.OpenFileModel"
    );
  }
}
