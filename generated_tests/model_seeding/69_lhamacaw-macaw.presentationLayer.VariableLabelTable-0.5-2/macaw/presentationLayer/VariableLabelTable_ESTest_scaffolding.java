/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Oct 29 09:53:32 GMT 2019
 */

package macaw.presentationLayer;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class VariableLabelTable_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "macaw.presentationLayer.VariableLabelTable"; 
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
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
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
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.home", "/home/pderakhshanfar"); 
    java.lang.System.setProperty("user.dir", "/home/pderakhshanfar/evosuite-model-seeding-ee/evosuite-model-seeding-empirical-evaluation"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(VariableLabelTable_ESTest_scaffolding.class.getClassLoader() ,
      "macaw.persistenceLayer.production.SQLCurationConceptManager",
      "macaw.businessLayer.MacawCurationAPI",
      "macaw.businessLayer.ValueLabel$EditingOperationType",
      "macaw.persistenceLayer.demo.InMemoryOntologyTermFilter",
      "macaw.persistenceLayer.demo.InMemoryVariableFilter",
      "macaw.system.UserInterfaceFactory",
      "macaw.presentationLayer.VariableLabelTable",
      "macaw.persistenceLayer.demo.InMemoryChangeEventManager",
      "macaw.system.MacawMessages",
      "macaw.persistenceLayer.production.ProductionCurationService",
      "macaw.persistenceLayer.demo.InMemoryListChoiceManager",
      "macaw.persistenceLayer.production.SQLSupportingDocumentsManager",
      "macaw.businessLayer.ValueLabel",
      "macaw.persistenceLayer.demo.InMemoryOntologyTermManager",
      "macaw.util.Displayable",
      "macaw.businessLayer.User",
      "macaw.persistenceLayer.ChangeEventGenerator",
      "macaw.businessLayer.VariableTypeFilter",
      "macaw.businessLayer.CleaningState",
      "macaw.persistenceLayer.production.SQLConnectionManager",
      "macaw.persistenceLayer.production.SQLOntologyTermManager",
      "macaw.system.Log",
      "macaw.businessLayer.MacawListChoice",
      "macaw.businessLayer.SupportingDocument",
      "macaw.businessLayer.VariableSummary",
      "macaw.persistenceLayer.production.SQLVariableManager",
      "macaw.persistenceLayer.demo.InMemorySupportingDocumentFilter",
      "macaw.persistenceLayer.demo.InMemorySupportingDocumentsManager",
      "macaw.system.MacawError",
      "macaw.persistenceLayer.demo.InMemoryValueLabelManager",
      "macaw.presentationLayer.VariableLabelTableModel",
      "macaw.persistenceLayer.production.SQLUserManager",
      "macaw.persistenceLayer.DummyDataProvider",
      "macaw.businessLayer.MacawSecurityAPI",
      "macaw.persistenceLayer.production.SQLListChoiceManager",
      "macaw.system.MacawException",
      "macaw.persistenceLayer.production.SQLChangeEventManager",
      "macaw.persistenceLayer.production.SQLFilterQueries",
      "macaw.businessLayer.DerivedVariable",
      "macaw.persistenceLayer.production.SQLListChoiceManager$ListChoiceType",
      "macaw.businessLayer.AliasFilePath",
      "macaw.persistenceLayer.demo.InMemoryVariableManager",
      "macaw.system.StartupOptions",
      "macaw.system.ChangeEventType",
      "macaw.businessLayer.OntologyTerm",
      "macaw.persistenceLayer.demo.InMemoryCurationConceptManager",
      "macaw.util.ValidationUtility",
      "macaw.system.MacawChangeEvent",
      "macaw.persistenceLayer.production.SQLValueLabelManager",
      "macaw.businessLayer.AvailabilityState",
      "macaw.businessLayer.RawVariable",
      "macaw.persistenceLayer.demo.InMemoryUserManager",
      "macaw.businessLayer.Variable",
      "macaw.system.SessionProperties",
      "macaw.util.SearchUtility",
      "macaw.businessLayer.Category",
      "macaw.system.MacawErrorType"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("macaw.businessLayer.MacawCurationAPI", false, VariableLabelTable_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(VariableLabelTable_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "macaw.presentationLayer.VariableLabelTable",
      "macaw.presentationLayer.VariableLabelTableModel",
      "macaw.system.MacawMessages",
      "macaw.system.Log",
      "macaw.system.UserInterfaceFactory",
      "macaw.system.StartupOptions",
      "macaw.persistenceLayer.demo.InMemoryChangeEventManager",
      "macaw.persistenceLayer.demo.InMemoryUserManager",
      "macaw.persistenceLayer.demo.InMemoryCurationConceptManager",
      "macaw.persistenceLayer.demo.InMemoryOntologyTermManager",
      "macaw.persistenceLayer.demo.InMemorySupportingDocumentsManager",
      "macaw.persistenceLayer.demo.InMemoryListChoiceManager",
      "macaw.persistenceLayer.demo.InMemoryVariableManager",
      "macaw.persistenceLayer.demo.InMemoryValueLabelManager",
      "macaw.persistenceLayer.demo.InMemoryVariableFilter",
      "macaw.persistenceLayer.demo.InMemorySupportingDocumentFilter",
      "macaw.persistenceLayer.demo.InMemoryOntologyTermFilter",
      "macaw.persistenceLayer.DummyDataProvider",
      "macaw.businessLayer.Category",
      "macaw.util.ValidationUtility",
      "macaw.util.SearchUtility",
      "macaw.system.MacawChangeEvent",
      "macaw.system.ChangeEventType",
      "macaw.businessLayer.AliasFilePath",
      "macaw.persistenceLayer.ChangeEventGenerator",
      "macaw.system.MacawException",
      "macaw.system.MacawErrorType",
      "macaw.system.MacawError",
      "macaw.businessLayer.ValueLabel",
      "macaw.businessLayer.ValueLabel$EditingOperationType",
      "macaw.persistenceLayer.production.SQLChangeEventManager",
      "macaw.persistenceLayer.production.SQLConnectionManager",
      "macaw.persistenceLayer.production.SQLCurationConceptManager",
      "macaw.persistenceLayer.production.SQLUserManager",
      "macaw.persistenceLayer.production.SQLSupportingDocumentsManager",
      "macaw.persistenceLayer.production.SQLListChoiceManager",
      "macaw.persistenceLayer.production.SQLValueLabelManager",
      "macaw.persistenceLayer.production.SQLOntologyTermManager",
      "macaw.persistenceLayer.production.SQLFilterQueries",
      "macaw.persistenceLayer.production.SQLVariableManager",
      "macaw.system.SessionProperties",
      "macaw.persistenceLayer.production.ProductionCurationService",
      "macaw.businessLayer.User"
    );
  }
}
