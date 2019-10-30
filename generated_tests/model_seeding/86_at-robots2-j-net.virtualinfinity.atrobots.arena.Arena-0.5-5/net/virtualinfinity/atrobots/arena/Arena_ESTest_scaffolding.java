/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Oct 29 13:32:09 GMT 2019
 */

package net.virtualinfinity.atrobots.arena;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class Arena_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "net.virtualinfinity.atrobots.arena.Arena"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Arena_ESTest_scaffolding.class.getClassLoader() ,
      "net.virtualinfinity.atrobots.computer.CallInstruction",
      "net.virtualinfinity.atrobots.computer.Flags",
      "net.virtualinfinity.atrobots.gui.RobotStatusPane$Bar",
      "net.virtualinfinity.atrobots.computer.ErrorInstruction",
      "net.virtualinfinity.atrobots.computer.InterruptHandler",
      "net.virtualinfinity.atrobots.measures.Vector",
      "net.virtualinfinity.atrobots.comqueue.CommunicationsQueue",
      "net.virtualinfinity.atrobots.computer.SubtractInstruction",
      "net.virtualinfinity.atrobots.hardware.radio.Transceiver$1",
      "net.virtualinfinity.atrobots.hardware.HasOverburner",
      "net.virtualinfinity.atrobots.hardware.armor.ArmorDepletionListener",
      "net.virtualinfinity.atrobots.computer.ModuloInstruction",
      "net.virtualinfinity.atrobots.snapshots.SnapshotAdaptor",
      "net.virtualinfinity.atrobots.radio.RadioListener",
      "net.virtualinfinity.atrobots.computer.ReadPortInstruction",
      "net.virtualinfinity.atrobots.computer.Instruction",
      "net.virtualinfinity.atrobots.arena.SimulationObserver",
      "net.virtualinfinity.atrobots.arena.Velocity",
      "net.virtualinfinity.atrobots.computer.InvalidMicrocodeInstruction",
      "net.virtualinfinity.atrobots.computer.BitShiftLeftInstruction",
      "net.virtualinfinity.atrobots.computer.BitRotateRightInstruction",
      "net.virtualinfinity.atrobots.hardware.armor.Armor$1",
      "net.virtualinfinity.atrobots.hardware.mines.MineLayer$2",
      "net.virtualinfinity.atrobots.computer.BitwiseExclusiveOrInstruction",
      "net.virtualinfinity.atrobots.hardware.mines.MineLayer$1",
      "net.virtualinfinity.atrobots.ArenaObjectVisitorAdaptor",
      "net.virtualinfinity.atrobots.gui.renderers.RobotRenderer",
      "net.virtualinfinity.atrobots.robot.Robot",
      "net.virtualinfinity.atrobots.computer.JumpWhenGreaterInstruction",
      "net.virtualinfinity.atrobots.arena.Explosion",
      "net.virtualinfinity.atrobots.hardware.radio.Transceiver",
      "net.virtualinfinity.atrobots.measures.AngleBracket$1",
      "net.virtualinfinity.atrobots.gui.RobotStatusPane$UpdateRobotList$1",
      "net.virtualinfinity.atrobots.measures.CartesianVector",
      "net.virtualinfinity.atrobots.gui.RobotStatusPane$Bar$1",
      "net.virtualinfinity.atrobots.gui.RobotStatusPane$UpdateRobotList",
      "net.virtualinfinity.atrobots.hardware.shield.Shield$1",
      "net.virtualinfinity.atrobots.gui.renderers.SnapshotRenderer",
      "net.virtualinfinity.atrobots.hardware.shield.Shield",
      "net.virtualinfinity.atrobots.computer.CompareInstruction",
      "net.virtualinfinity.atrobots.computer.MultiplyInstruction",
      "net.virtualinfinity.atrobots.snapshots.MineSnapshot",
      "net.virtualinfinity.atrobots.computer.AddInstruction",
      "net.virtualinfinity.atrobots.snapshots.UnknownSnapshot",
      "net.virtualinfinity.atrobots.hardware.mines.Mine",
      "net.virtualinfinity.atrobots.computer.MemoryArray",
      "net.virtualinfinity.atrobots.computer.PopInstructionPointerInstruction",
      "net.virtualinfinity.atrobots.computer.DivideInstruction",
      "net.virtualinfinity.atrobots.computer.DebugListener",
      "net.virtualinfinity.atrobots.measures.AngleBracket",
      "net.virtualinfinity.atrobots.computer.BitwiseOrInstruction",
      "net.virtualinfinity.atrobots.computer.BitShiftRightInstruction",
      "net.virtualinfinity.atrobots.snapshots.ArenaObjectSnapshot",
      "net.virtualinfinity.atrobots.gui.RobotStatusPane$RobotItem",
      "net.virtualinfinity.atrobots.computer.EmptyDebugListener",
      "net.virtualinfinity.atrobots.computer.MemoryCell",
      "net.virtualinfinity.atrobots.ports.PortHandler",
      "net.virtualinfinity.atrobots.computer.PopInstruction",
      "net.virtualinfinity.atrobots.measures.DistanceOverTime",
      "net.virtualinfinity.atrobots.atsetup.AtRobotRegister",
      "net.virtualinfinity.atrobots.robot.RobotScanResult",
      "net.virtualinfinity.atrobots.hardware.scanning.scanner.Scanner$2",
      "net.virtualinfinity.atrobots.computer.SpecialRegister",
      "net.virtualinfinity.atrobots.hardware.scanning.scanner.Scanner$1",
      "net.virtualinfinity.atrobots.hardware.missiles.Missile",
      "net.virtualinfinity.atrobots.hardware.heatsinks.HeatSinks",
      "net.virtualinfinity.atrobots.snapshots.RobotSnapshot",
      "net.virtualinfinity.atrobots.arena.ExplosionFunction",
      "net.virtualinfinity.atrobots.robot.RobotScoreKeeper",
      "net.virtualinfinity.atrobots.hardware.scanning.scanner.Scanner$3",
      "net.virtualinfinity.atrobots.hardware.throttle.Throttle",
      "net.virtualinfinity.atrobots.computer.JumpInstruction",
      "net.virtualinfinity.atrobots.computer.MemoryRegion",
      "net.virtualinfinity.atrobots.computer.UnknownInstruction",
      "net.virtualinfinity.atrobots.snapshots.ScanSnapshot",
      "net.virtualinfinity.atrobots.robot.FinalRobotScore",
      "net.virtualinfinity.atrobots.measures.PolarVector",
      "net.virtualinfinity.atrobots.computer.Microcode",
      "net.virtualinfinity.atrobots.gui.ArenaPane",
      "net.virtualinfinity.atrobots.computer.SwapInstruction",
      "net.virtualinfinity.atrobots.hardware.missiles.MissileFactory",
      "net.virtualinfinity.atrobots.gui.renderers.SimpleExplosionRenderer",
      "net.virtualinfinity.atrobots.atsetup.AtRobotSymbol",
      "net.virtualinfinity.atrobots.arena.SimulationFrameBuffer",
      "net.virtualinfinity.atrobots.hardware.scanning.ScanSource",
      "net.virtualinfinity.atrobots.computer.BitwiseNegationInstruction",
      "net.virtualinfinity.atrobots.robot.RobotScore",
      "net.virtualinfinity.atrobots.computer.Registers",
      "net.virtualinfinity.atrobots.computer.PutInstruction",
      "net.virtualinfinity.atrobots.robot.Robot$GetRobotStatisticsInterrupt",
      "net.virtualinfinity.atrobots.arena.Heading",
      "net.virtualinfinity.atrobots.computer.BitwiseAndInstruction",
      "net.virtualinfinity.atrobots.hardware.missiles.MissileLauncher$1",
      "net.virtualinfinity.atrobots.computer.JumpWhenEqualInstruction",
      "net.virtualinfinity.atrobots.hardware.transponder.Transponder",
      "net.virtualinfinity.atrobots.computer.DecrementInstruction",
      "net.virtualinfinity.atrobots.arenaobjects.DamageInflicter",
      "net.virtualinfinity.atrobots.computer.TestInstruction",
      "net.virtualinfinity.atrobots.computer.AddressInstruction",
      "net.virtualinfinity.atrobots.computer.Microcode$7",
      "net.virtualinfinity.atrobots.computer.Microcode$6",
      "net.virtualinfinity.atrobots.computer.Microcode$5",
      "net.virtualinfinity.atrobots.computer.Microcode$4",
      "net.virtualinfinity.atrobots.computer.Microcode$3",
      "net.virtualinfinity.atrobots.computer.Microcode$2",
      "net.virtualinfinity.atrobots.computer.Microcode$1",
      "net.virtualinfinity.atrobots.arena.Scan",
      "net.virtualinfinity.atrobots.hardware.scanning.ScanResult",
      "net.virtualinfinity.atrobots.arena.Position",
      "net.virtualinfinity.atrobots.computer.JumpWhenNotEqualInstruction",
      "net.virtualinfinity.atrobots.arena.TangibleArenaObject",
      "net.virtualinfinity.atrobots.ports.CycleSource",
      "net.virtualinfinity.atrobots.computer.WritePortInstruction",
      "net.virtualinfinity.atrobots.computer.RandomAccessMemoryArray",
      "net.virtualinfinity.atrobots.interrupts.Destructable",
      "net.virtualinfinity.atrobots.arena.Speed",
      "net.virtualinfinity.atrobots.hardware.scanning.sonar.Sonar",
      "net.virtualinfinity.atrobots.computer.InstructionTable",
      "net.virtualinfinity.atrobots.measures.Heat",
      "net.virtualinfinity.atrobots.computer.JumpWhenNotZeroInstruction",
      "net.virtualinfinity.atrobots.gui.ArenaPane$UpdateFrame",
      "net.virtualinfinity.atrobots.hardware.throttle.Throttle$1",
      "net.virtualinfinity.atrobots.hardware.mines.MineLayer",
      "net.virtualinfinity.atrobots.hardware.throttle.Throttle$2",
      "net.virtualinfinity.atrobots.snapshots.ExplosionSnapshot",
      "net.virtualinfinity.atrobots.robot.RobotListener",
      "net.virtualinfinity.atrobots.ports.PortListener",
      "net.virtualinfinity.atrobots.hardware.scanning.radar.Radar$1",
      "net.virtualinfinity.atrobots.computer.Computer$ErrorHandler",
      "net.virtualinfinity.atrobots.arena.Odometer",
      "net.virtualinfinity.atrobots.computer.ComputerErrorHandler",
      "net.virtualinfinity.atrobots.ArenaObjectVisitor",
      "net.virtualinfinity.atrobots.robot.Robot$GetRobotInfoInterrupt",
      "net.virtualinfinity.atrobots.computer.LoopInstruction",
      "net.virtualinfinity.atrobots.arena.RoundTimer",
      "net.virtualinfinity.atrobots.arena.LinearDamageFunction",
      "net.virtualinfinity.atrobots.measures.RelativeAngle",
      "net.virtualinfinity.atrobots.hardware.scanning.scanner.Scanner",
      "net.virtualinfinity.atrobots.arena.SimulationFrame",
      "net.virtualinfinity.atrobots.hardware.armor.Armor",
      "net.virtualinfinity.atrobots.arena.Arena",
      "net.virtualinfinity.atrobots.arena.FrameBuilder",
      "net.virtualinfinity.atrobots.gui.ArenaRenderer",
      "net.virtualinfinity.atrobots.hardware.turret.Turret",
      "net.virtualinfinity.atrobots.computer.JumpWhenLessInstruction",
      "net.virtualinfinity.atrobots.computer.Restartable",
      "net.virtualinfinity.atrobots.computer.PushInstruction",
      "net.virtualinfinity.atrobots.atsetup.AtRobotInstruction",
      "net.virtualinfinity.atrobots.computer.HardwareBus",
      "net.virtualinfinity.atrobots.computer.AtRobotsCommunicationsQueue",
      "net.virtualinfinity.atrobots.computer.GetInstruction",
      "net.virtualinfinity.atrobots.computer.SetInstructionPointerInstruction",
      "net.virtualinfinity.atrobots.robot.RobotScanner",
      "net.virtualinfinity.atrobots.gui.RobotStatusPane",
      "net.virtualinfinity.atrobots.computer.NoOperationInstruction",
      "net.virtualinfinity.atrobots.snapshots.SnapshotVisitor",
      "net.virtualinfinity.atrobots.measures.Temperature",
      "net.virtualinfinity.atrobots.computer.BitRotateLeftInstruction",
      "net.virtualinfinity.atrobots.computer.Resettable",
      "net.virtualinfinity.atrobots.hardware.missiles.MissileLauncher",
      "net.virtualinfinity.atrobots.arenaobjects.ArenaObject",
      "net.virtualinfinity.atrobots.computer.JumpWhenZeroInstruction",
      "net.virtualinfinity.atrobots.computer.ShutdownListener",
      "net.virtualinfinity.atrobots.arena.SimulationFrame$1",
      "net.virtualinfinity.atrobots.computer.Computer",
      "net.virtualinfinity.atrobots.computer.StackMemory",
      "net.virtualinfinity.atrobots.computer.AbstractCombiningInstruction",
      "net.virtualinfinity.atrobots.snapshots.MissileSnapshot",
      "net.virtualinfinity.atrobots.computer.IncrementInstruction",
      "net.virtualinfinity.atrobots.gui.renderers.MineRenderer",
      "net.virtualinfinity.atrobots.computer.SetCXInstruction",
      "net.virtualinfinity.atrobots.computer.MoveInstruction",
      "net.virtualinfinity.atrobots.radio.RadioDispatcher",
      "net.virtualinfinity.atrobots.robot.Robot$4",
      "net.virtualinfinity.atrobots.robot.Robot$1",
      "net.virtualinfinity.atrobots.robot.Robot$3",
      "net.virtualinfinity.atrobots.computer.Memory",
      "net.virtualinfinity.atrobots.robot.Robot$2",
      "net.virtualinfinity.atrobots.measures.Duration",
      "net.virtualinfinity.atrobots.gui.renderers.MissileRenderer",
      "net.virtualinfinity.atrobots.gui.renderers.ScanRenderer",
      "net.virtualinfinity.atrobots.computer.CallInterruptInstruction",
      "net.virtualinfinity.atrobots.measures.AbsoluteAngle",
      "net.virtualinfinity.atrobots.computer.DelayInstruction",
      "net.virtualinfinity.atrobots.arenaobjects.CollidableArenaObject",
      "net.virtualinfinity.atrobots.hardware.HasHeading",
      "net.virtualinfinity.atrobots.hardware.scanning.radar.Radar",
      "net.virtualinfinity.atrobots.computer.AbstractConditionalJumpInstruction",
      "net.virtualinfinity.atrobots.measures.AbsoluteAngle$AbsoluateBygreeAngle",
      "net.virtualinfinity.atrobots.computer.JumpWhenLessOrEqualInstruction",
      "net.virtualinfinity.atrobots.measures.RelativeAngle$RelativeBygreeAngle",
      "net.virtualinfinity.atrobots.computer.JumpWhenGreaterOrEqualInstruction",
      "net.virtualinfinity.atrobots.computer.NegateInstruction",
      "net.virtualinfinity.atrobots.computer.SignedBitShiftRightInstruction",
      "net.virtualinfinity.atrobots.gui.RobotStatusPane$RobotStatusRenderer",
      "net.virtualinfinity.atrobots.computer.DebugInfo",
      "net.virtualinfinity.atrobots.hardware.scanning.sonar.Sonar$1"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("net.virtualinfinity.atrobots.arena.TangibleArenaObject", false, Arena_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Arena_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "net.virtualinfinity.atrobots.arena.Arena",
      "net.virtualinfinity.atrobots.measures.Duration",
      "net.virtualinfinity.atrobots.snapshots.SnapshotAdaptor",
      "net.virtualinfinity.atrobots.arena.SimulationFrame$1",
      "net.virtualinfinity.atrobots.measures.PolarVector",
      "net.virtualinfinity.atrobots.snapshots.ScanSnapshot",
      "net.virtualinfinity.atrobots.arena.RoundTimer",
      "net.virtualinfinity.atrobots.radio.RadioDispatcher",
      "net.virtualinfinity.atrobots.arena.LinearDamageFunction",
      "net.virtualinfinity.atrobots.arena.Explosion",
      "net.virtualinfinity.atrobots.arena.Speed",
      "net.virtualinfinity.atrobots.measures.DistanceOverTime",
      "net.virtualinfinity.atrobots.arena.Velocity",
      "net.virtualinfinity.atrobots.measures.CartesianVector",
      "net.virtualinfinity.atrobots.snapshots.ExplosionSnapshot",
      "net.virtualinfinity.atrobots.robot.RobotScoreKeeper",
      "net.virtualinfinity.atrobots.robot.FinalRobotScore",
      "net.virtualinfinity.atrobots.robot.Robot",
      "net.virtualinfinity.atrobots.hardware.heatsinks.HeatSinks",
      "net.virtualinfinity.atrobots.measures.Temperature",
      "net.virtualinfinity.atrobots.arena.Odometer",
      "net.virtualinfinity.atrobots.ArenaObjectVisitorAdaptor",
      "net.virtualinfinity.atrobots.snapshots.RobotSnapshot",
      "net.virtualinfinity.atrobots.hardware.turret.Turret",
      "net.virtualinfinity.atrobots.hardware.mines.MineLayer",
      "net.virtualinfinity.atrobots.hardware.missiles.MissileLauncher",
      "net.virtualinfinity.atrobots.hardware.mines.Mine",
      "net.virtualinfinity.atrobots.hardware.missiles.Missile",
      "net.virtualinfinity.atrobots.computer.Memory",
      "net.virtualinfinity.atrobots.computer.MemoryCell",
      "net.virtualinfinity.atrobots.computer.InterruptHandler",
      "net.virtualinfinity.atrobots.robot.Robot$GetRobotStatisticsInterrupt",
      "net.virtualinfinity.atrobots.gui.ArenaPane",
      "net.virtualinfinity.atrobots.gui.ArenaRenderer",
      "net.virtualinfinity.atrobots.gui.renderers.RobotRenderer",
      "net.virtualinfinity.atrobots.gui.renderers.MissileRenderer",
      "net.virtualinfinity.atrobots.gui.renderers.MineRenderer",
      "net.virtualinfinity.atrobots.gui.renderers.SimpleExplosionRenderer",
      "net.virtualinfinity.atrobots.gui.renderers.ScanRenderer",
      "net.virtualinfinity.atrobots.gui.ArenaPane$UpdateFrame",
      "net.virtualinfinity.atrobots.measures.AngleBracket$1",
      "net.virtualinfinity.atrobots.gui.RobotStatusPane",
      "net.virtualinfinity.atrobots.gui.RobotStatusPane$RobotStatusRenderer",
      "net.virtualinfinity.atrobots.gui.RobotStatusPane$Bar",
      "net.virtualinfinity.atrobots.gui.RobotStatusPane$Bar$1",
      "net.virtualinfinity.atrobots.gui.RobotStatusPane$RobotItem",
      "net.virtualinfinity.atrobots.ports.PortHandler",
      "net.virtualinfinity.atrobots.robot.Robot$1",
      "net.virtualinfinity.atrobots.hardware.mines.MineLayer$2",
      "net.virtualinfinity.atrobots.arena.Scan",
      "net.virtualinfinity.atrobots.hardware.missiles.MissileLauncher$1",
      "net.virtualinfinity.atrobots.hardware.throttle.Throttle",
      "net.virtualinfinity.atrobots.robot.Robot$4",
      "net.virtualinfinity.atrobots.hardware.throttle.Throttle$1",
      "net.virtualinfinity.atrobots.gui.RobotStatusPane$UpdateRobotList",
      "net.virtualinfinity.atrobots.gui.RobotStatusPane$UpdateRobotList$1",
      "net.virtualinfinity.atrobots.computer.DebugInfo",
      "net.virtualinfinity.atrobots.computer.Computer",
      "net.virtualinfinity.atrobots.computer.Computer$ErrorHandler",
      "net.virtualinfinity.atrobots.computer.EmptyDebugListener",
      "net.virtualinfinity.atrobots.computer.Registers",
      "net.virtualinfinity.atrobots.computer.Flags",
      "net.virtualinfinity.atrobots.atsetup.AtRobotRegister",
      "net.virtualinfinity.atrobots.computer.StackMemory",
      "net.virtualinfinity.atrobots.computer.MemoryArray",
      "net.virtualinfinity.atrobots.computer.RandomAccessMemoryArray",
      "net.virtualinfinity.atrobots.hardware.scanning.radar.Radar",
      "net.virtualinfinity.atrobots.computer.HardwareBus",
      "net.virtualinfinity.atrobots.hardware.scanning.sonar.Sonar",
      "net.virtualinfinity.atrobots.snapshots.MissileSnapshot",
      "net.virtualinfinity.atrobots.hardware.scanning.scanner.Scanner",
      "net.virtualinfinity.atrobots.robot.Robot$3",
      "net.virtualinfinity.atrobots.snapshots.MineSnapshot",
      "net.virtualinfinity.atrobots.hardware.mines.MineLayer$1",
      "net.virtualinfinity.atrobots.robot.Robot$GetRobotInfoInterrupt",
      "net.virtualinfinity.atrobots.robot.Robot$2",
      "net.virtualinfinity.atrobots.hardware.radio.Transceiver",
      "net.virtualinfinity.atrobots.hardware.armor.Armor",
      "net.virtualinfinity.atrobots.robot.RobotScanner",
      "net.virtualinfinity.atrobots.snapshots.UnknownSnapshot",
      "net.virtualinfinity.atrobots.hardware.transponder.Transponder",
      "net.virtualinfinity.atrobots.computer.MemoryRegion",
      "net.virtualinfinity.atrobots.computer.Instruction",
      "net.virtualinfinity.atrobots.computer.UnknownInstruction",
      "net.virtualinfinity.atrobots.computer.InstructionTable",
      "net.virtualinfinity.atrobots.computer.InvalidMicrocodeInstruction",
      "net.virtualinfinity.atrobots.computer.NoOperationInstruction",
      "net.virtualinfinity.atrobots.atsetup.AtRobotInstruction",
      "net.virtualinfinity.atrobots.computer.AbstractCombiningInstruction",
      "net.virtualinfinity.atrobots.computer.AddInstruction",
      "net.virtualinfinity.atrobots.computer.SubtractInstruction",
      "net.virtualinfinity.atrobots.computer.BitwiseOrInstruction",
      "net.virtualinfinity.atrobots.computer.BitwiseAndInstruction",
      "net.virtualinfinity.atrobots.computer.BitwiseExclusiveOrInstruction",
      "net.virtualinfinity.atrobots.computer.BitwiseNegationInstruction",
      "net.virtualinfinity.atrobots.computer.MultiplyInstruction",
      "net.virtualinfinity.atrobots.computer.DivideInstruction",
      "net.virtualinfinity.atrobots.computer.ModuloInstruction",
      "net.virtualinfinity.atrobots.computer.PopInstructionPointerInstruction",
      "net.virtualinfinity.atrobots.computer.CallInstruction",
      "net.virtualinfinity.atrobots.computer.JumpInstruction",
      "net.virtualinfinity.atrobots.computer.AbstractConditionalJumpInstruction",
      "net.virtualinfinity.atrobots.computer.JumpWhenLessInstruction",
      "net.virtualinfinity.atrobots.computer.JumpWhenGreaterInstruction",
      "net.virtualinfinity.atrobots.computer.JumpWhenNotEqualInstruction",
      "net.virtualinfinity.atrobots.computer.JumpWhenEqualInstruction",
      "net.virtualinfinity.atrobots.computer.SwapInstruction",
      "net.virtualinfinity.atrobots.computer.SetCXInstruction",
      "net.virtualinfinity.atrobots.computer.LoopInstruction",
      "net.virtualinfinity.atrobots.computer.CompareInstruction",
      "net.virtualinfinity.atrobots.computer.TestInstruction",
      "net.virtualinfinity.atrobots.computer.MoveInstruction",
      "net.virtualinfinity.atrobots.computer.AddressInstruction",
      "net.virtualinfinity.atrobots.computer.GetInstruction",
      "net.virtualinfinity.atrobots.computer.PutInstruction",
      "net.virtualinfinity.atrobots.computer.CallInterruptInstruction",
      "net.virtualinfinity.atrobots.computer.ReadPortInstruction",
      "net.virtualinfinity.atrobots.computer.WritePortInstruction",
      "net.virtualinfinity.atrobots.computer.DelayInstruction",
      "net.virtualinfinity.atrobots.computer.PushInstruction",
      "net.virtualinfinity.atrobots.computer.PopInstruction",
      "net.virtualinfinity.atrobots.computer.ErrorInstruction",
      "net.virtualinfinity.atrobots.computer.IncrementInstruction",
      "net.virtualinfinity.atrobots.computer.DecrementInstruction",
      "net.virtualinfinity.atrobots.computer.BitShiftLeftInstruction",
      "net.virtualinfinity.atrobots.computer.BitShiftRightInstruction",
      "net.virtualinfinity.atrobots.computer.BitRotateLeftInstruction",
      "net.virtualinfinity.atrobots.computer.BitRotateRightInstruction",
      "net.virtualinfinity.atrobots.computer.JumpWhenZeroInstruction",
      "net.virtualinfinity.atrobots.computer.JumpWhenNotZeroInstruction",
      "net.virtualinfinity.atrobots.computer.JumpWhenGreaterOrEqualInstruction",
      "net.virtualinfinity.atrobots.computer.JumpWhenLessOrEqualInstruction",
      "net.virtualinfinity.atrobots.computer.SignedBitShiftRightInstruction",
      "net.virtualinfinity.atrobots.computer.NegateInstruction",
      "net.virtualinfinity.atrobots.computer.SetInstructionPointerInstruction",
      "net.virtualinfinity.atrobots.arenaobjects.ArenaObject",
      "net.virtualinfinity.atrobots.arenaobjects.CollidableArenaObject",
      "net.virtualinfinity.atrobots.arena.TangibleArenaObject",
      "net.virtualinfinity.atrobots.measures.RelativeAngle$RelativeBygreeAngle",
      "net.virtualinfinity.atrobots.measures.RelativeAngle",
      "net.virtualinfinity.atrobots.arena.Heading",
      "net.virtualinfinity.atrobots.measures.AbsoluteAngle$AbsoluateBygreeAngle",
      "net.virtualinfinity.atrobots.measures.AbsoluteAngle",
      "net.virtualinfinity.atrobots.arena.Position",
      "net.virtualinfinity.atrobots.measures.Vector",
      "net.virtualinfinity.atrobots.arena.SimulationFrameBuffer",
      "net.virtualinfinity.atrobots.arena.FrameBuilder",
      "net.virtualinfinity.atrobots.arena.SimulationFrame",
      "net.virtualinfinity.atrobots.arena.ExplosionFunction",
      "net.virtualinfinity.atrobots.snapshots.ArenaObjectSnapshot"
    );
  }
}
