/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Oct 29 11:06:25 GMT 2019
 */

package de.outstare.fortbattleplayer.statistics;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class BattleStatistics_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "de.outstare.fortbattleplayer.statistics.BattleStatistics"; 
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
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("user.dir", "/home/pderakhshanfar/evosuite-model-seeding-ee/evosuite-model-seeding-empirical-evaluation"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(BattleStatistics_ESTest_scaffolding.class.getClassLoader() ,
      "de.outstare.fortbattleplayer.statistics.DynamicStatistics",
      "de.outstare.fortbattleplayer.player.PlayerConfiguration",
      "de.outstare.fortbattleplayer.statistics.WeaponModCounter$LoadingchamberOrEnhancedPatronsCounter",
      "de.outstare.fortbattleplayer.model.impl.SimpleSector",
      "de.outstare.fortbattleplayer.gui.battlefield.CellContent",
      "de.outstare.fortbattleplayer.statistics.WeaponModCounter$SchmierOilCounter",
      "de.outstare.fortbattleplayer.model.Area",
      "de.outstare.fortbattleplayer.player.CombatantEventDispatcher",
      "de.outstare.fortbattleplayer.statistics.BattleStatistics",
      "de.outstare.fortbattleplayer.statistics.LabeledData",
      "de.outstare.fortbattleplayer.model.CombatantObserver",
      "de.outstare.fortbattleplayer.statistics.WeaponModCounter",
      "de.outstare.fortbattleplayer.statistics.BattleStatistics$1",
      "de.outstare.fortbattleplayer.statistics.AreaStatistic",
      "de.outstare.fortbattleplayer.statistics.PositionSwitch",
      "de.outstare.fortbattleplayer.gui.battlefield.BattleFieldLayoutManager",
      "de.outstare.fortbattleplayer.statistics.Counter",
      "de.outstare.fortbattleplayer.player.PlayerState",
      "de.outstare.fortbattleplayer.gui.battlefield.BattlefieldDrawing",
      "de.outstare.fortbattleplayer.model.impl.SimpleArea",
      "de.outstare.fortbattleplayer.model.SectorObserver",
      "de.outstare.fortbattleplayer.gui.battlefield.BattlefieldCell$SectorBorders",
      "de.outstare.fortbattleplayer.model.Combatant",
      "de.outstare.fortbattleplayer.model.CombatantState",
      "de.outstare.fortbattleplayer.model.impl.SimpleCombatant",
      "de.outstare.fortbattleplayer.statistics.WeaponModCounter$GraphitLubricantCounter",
      "de.outstare.fortbattleplayer.statistics.WeaponModCounter$FettesOilCounter",
      "de.outstare.fortbattleplayer.gui.battlefield.BattlefieldCell",
      "de.outstare.fortbattleplayer.model.SectorBonus$BonusType",
      "de.outstare.fortbattleplayer.model.WeaponModification",
      "de.outstare.fortbattleplayer.gui.battlefield.BattlefieldDrawing$BattlefieldLine$LineType",
      "de.outstare.fortbattleplayer.statistics.AllCombatantSidesCounter",
      "de.outstare.fortbattleplayer.statistics.WeaponModCounter$HipFlaskCounter",
      "de.outstare.fortbattleplayer.gui.battlefield.BattlefieldDrawing$BattlefieldLine",
      "de.outstare.fortbattleplayer.statistics.WeaponModCounter$ShinyOilCounter",
      "de.outstare.fortbattleplayer.model.WeaponData",
      "de.outstare.fortbattleplayer.model.CharacterClass",
      "de.outstare.fortbattleplayer.model.impl.JSWeaponData$WeaponGameData",
      "de.outstare.fortbattleplayer.model.Battlefield",
      "de.outstare.fortbattleplayer.statistics.CriticalHit",
      "de.outstare.fortbattleplayer.model.impl.SimpleWeapon$1",
      "de.outstare.fortbattleplayer.statistics.OnlineCounter",
      "de.outstare.fortbattleplayer.model.CombatantSide",
      "de.outstare.fortbattleplayer.model.SectorBonus",
      "de.outstare.fortbattleplayer.model.impl.SimpleWeapon",
      "de.outstare.fortbattleplayer.player.Battleplayer$RoundListener",
      "de.outstare.fortbattleplayer.model.impl.JSWeaponData",
      "de.outstare.fortbattleplayer.statistics.WeaponModCounter$BayonetCounter",
      "de.outstare.fortbattleplayer.statistics.RoundStatistics",
      "de.outstare.fortbattleplayer.gui.battlefield.BattlefieldCell$BattlefieldCellLayoutManager",
      "de.outstare.fortbattleplayer.model.Weapon",
      "de.outstare.fortbattleplayer.model.Sector",
      "de.outstare.fortbattleplayer.model.impl.SimpleBattleField",
      "de.outstare.fortbattleplayer.player.PlayerConfigurationListener"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("de.outstare.fortbattleplayer.model.Area", false, BattleStatistics_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(BattleStatistics_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "de.outstare.fortbattleplayer.statistics.BattleStatistics",
      "de.outstare.fortbattleplayer.model.CombatantSide",
      "de.outstare.fortbattleplayer.statistics.BattleStatistics$1",
      "de.outstare.fortbattleplayer.statistics.AllCombatantSidesCounter",
      "de.outstare.fortbattleplayer.statistics.Counter",
      "de.outstare.fortbattleplayer.model.impl.SimpleSector",
      "de.outstare.fortbattleplayer.model.impl.SimpleBattleField",
      "de.outstare.fortbattleplayer.statistics.WeaponModCounter$LoadingchamberOrEnhancedPatronsCounter",
      "de.outstare.fortbattleplayer.statistics.WeaponModCounter$BayonetCounter",
      "de.outstare.fortbattleplayer.model.impl.SimpleWeapon",
      "de.outstare.fortbattleplayer.statistics.WeaponModCounter$FettesOilCounter",
      "de.outstare.fortbattleplayer.statistics.WeaponModCounter$ShinyOilCounter",
      "de.outstare.fortbattleplayer.statistics.WeaponModCounter$SchmierOilCounter",
      "de.outstare.fortbattleplayer.model.SectorBonus",
      "de.outstare.fortbattleplayer.statistics.OnlineCounter",
      "de.outstare.fortbattleplayer.statistics.WeaponModCounter$GraphitLubricantCounter",
      "de.outstare.fortbattleplayer.statistics.WeaponModCounter$HipFlaskCounter",
      "de.outstare.fortbattleplayer.statistics.CriticalHit",
      "de.outstare.fortbattleplayer.statistics.AreaStatistic",
      "de.outstare.fortbattleplayer.model.impl.SimpleWeapon$1",
      "de.outstare.fortbattleplayer.statistics.PositionSwitch",
      "de.outstare.fortbattleplayer.player.CombatantEventDispatcher",
      "de.outstare.fortbattleplayer.player.PlayerState",
      "de.outstare.fortbattleplayer.player.PlayerConfiguration",
      "de.outstare.fortbattleplayer.gui.battlefield.BattlefieldDrawing",
      "de.outstare.fortbattleplayer.gui.battlefield.BattleFieldLayoutManager",
      "de.outstare.fortbattleplayer.gui.battlefield.BattlefieldCell",
      "de.outstare.fortbattleplayer.gui.battlefield.BattlefieldCell$SectorBorders",
      "de.outstare.fortbattleplayer.gui.battlefield.BattlefieldCell$BattlefieldCellLayoutManager",
      "de.outstare.fortbattleplayer.statistics.RoundStatistics",
      "de.outstare.fortbattleplayer.model.impl.SimpleArea",
      "de.outstare.fortbattleplayer.model.impl.JSWeaponData$WeaponGameData",
      "de.outstare.fortbattleplayer.model.impl.JSWeaponData",
      "de.outstare.fortbattleplayer.statistics.WeaponModCounter",
      "de.outstare.fortbattleplayer.model.CombatantState",
      "de.outstare.fortbattleplayer.model.impl.SimpleCombatant",
      "de.outstare.fortbattleplayer.model.SectorBonus$BonusType"
    );
  }
}
