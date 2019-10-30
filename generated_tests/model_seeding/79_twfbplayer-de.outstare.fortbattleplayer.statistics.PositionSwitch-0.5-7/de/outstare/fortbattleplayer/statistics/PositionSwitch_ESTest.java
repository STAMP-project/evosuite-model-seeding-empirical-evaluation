/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 29 15:28:13 GMT 2019
 */

package de.outstare.fortbattleplayer.statistics;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import de.outstare.fortbattleplayer.model.Area;
import de.outstare.fortbattleplayer.model.CharacterClass;
import de.outstare.fortbattleplayer.model.Combatant;
import de.outstare.fortbattleplayer.model.CombatantSide;
import de.outstare.fortbattleplayer.model.CombatantState;
import de.outstare.fortbattleplayer.model.Sector;
import de.outstare.fortbattleplayer.model.impl.SimpleArea;
import de.outstare.fortbattleplayer.model.impl.SimpleCombatant;
import de.outstare.fortbattleplayer.model.impl.SimpleWeapon;
import de.outstare.fortbattleplayer.statistics.PositionSwitch;
import java.awt.Point;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PositionSwitch_ESTest extends PositionSwitch_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CombatantSide combatantSide0 = CombatantSide.ATTACKER;
      Area area0 = mock(Area.class, new ViolatedAssumptionAnswer());
      doReturn((Combatant) null, (Combatant) null).when(area0).occupy(any(de.outstare.fortbattleplayer.model.Combatant.class) , any(de.outstare.fortbattleplayer.model.Area.class));
      CombatantState combatantState0 = new CombatantState(area0, 581, area0, false);
      CharacterClass characterClass0 = CharacterClass.DUELANT;
      SimpleWeapon simpleWeapon0 = new SimpleWeapon(0, "", 0, 581);
      SimpleCombatant simpleCombatant0 = new SimpleCombatant(combatantSide0, combatantState0, 581, "[LK}V3,_tAK{'l.%e", characterClass0, simpleWeapon0, "IRHgl{Pv&e");
      PositionSwitch positionSwitch0 = new PositionSwitch(0, simpleCombatant0, simpleCombatant0);
      SimpleCombatant simpleCombatant1 = new SimpleCombatant(combatantSide0, combatantState0, 0, "M", characterClass0, simpleWeapon0, "MWp");
      PositionSwitch positionSwitch1 = new PositionSwitch(0, simpleCombatant1, positionSwitch0.player2);
      int int0 = positionSwitch1.compareTo(positionSwitch0);
      assertEquals((-14), int0);
      assertFalse(positionSwitch0.equals((Object)positionSwitch1));
      assertEquals(0, positionSwitch1.round);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CombatantSide combatantSide0 = CombatantSide.ATTACKER;
      Area area0 = mock(Area.class, new ViolatedAssumptionAnswer());
      doReturn((Combatant) null, (Combatant) null).when(area0).occupy(any(de.outstare.fortbattleplayer.model.Combatant.class) , any(de.outstare.fortbattleplayer.model.Area.class));
      CombatantState combatantState0 = new CombatantState(area0, 581, area0, false);
      CharacterClass characterClass0 = CharacterClass.DUELANT;
      SimpleWeapon simpleWeapon0 = new SimpleWeapon(0, "", 0, 581);
      SimpleCombatant simpleCombatant0 = new SimpleCombatant(combatantSide0, combatantState0, 581, "[LK}V3,_tAK{'l.%e", characterClass0, simpleWeapon0, "IRHgl{Pv&e");
      SimpleCombatant simpleCombatant1 = new SimpleCombatant(combatantSide0, combatantState0, 30, "?", characterClass0, simpleWeapon0, "");
      PositionSwitch positionSwitch0 = new PositionSwitch(1269, simpleCombatant0, simpleCombatant1);
      positionSwitch0.hashCode();
      assertEquals(1269, positionSwitch0.round);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PositionSwitch positionSwitch0 = null;
      try {
        positionSwitch0 = new PositionSwitch(558, (Combatant) null, (Combatant) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.outstare.fortbattleplayer.statistics.PositionSwitch", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Combatant combatant0 = mock(Combatant.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(combatant0)._health();
      PositionSwitch positionSwitch0 = null;
      try {
        positionSwitch0 = new PositionSwitch(0, combatant0, (Combatant) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.outstare.fortbattleplayer.statistics.PositionSwitch", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CombatantSide combatantSide0 = CombatantSide.DEFENDER;
      Sector sector0 = mock(Sector.class, new ViolatedAssumptionAnswer());
      SimpleArea simpleArea0 = new SimpleArea((-112), 1814, sector0);
      CombatantState combatantState0 = new CombatantState(simpleArea0, 1, simpleArea0, false);
      CharacterClass characterClass0 = CharacterClass.ADVENTURER;
      SimpleWeapon simpleWeapon0 = new SimpleWeapon(1, "", 196, 676);
      SimpleCombatant simpleCombatant0 = new SimpleCombatant(combatantSide0, combatantState0, 30, "?", characterClass0, simpleWeapon0, "");
      PositionSwitch positionSwitch0 = new PositionSwitch(676, simpleCombatant0, simpleCombatant0);
      PositionSwitch positionSwitch1 = new PositionSwitch(577, simpleCombatant0, simpleCombatant0);
      boolean boolean0 = positionSwitch1.equals(positionSwitch0);
      assertFalse(positionSwitch0.equals((Object)positionSwitch1));
      assertEquals(577, positionSwitch1.round);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CombatantSide combatantSide0 = CombatantSide.DEFENDER;
      Point point0 = new Point();
      Sector sector0 = mock(Sector.class, new ViolatedAssumptionAnswer());
      SimpleArea simpleArea0 = new SimpleArea(point0, sector0);
      CombatantState combatantState0 = new CombatantState(simpleArea0, (-2707), simpleArea0, false);
      CharacterClass characterClass0 = CharacterClass.WORKER;
      SimpleWeapon simpleWeapon0 = new SimpleWeapon(269, "", 0, 269);
      SimpleCombatant simpleCombatant0 = new SimpleCombatant(combatantSide0, combatantState0, 0, "", characterClass0, simpleWeapon0, "");
      PositionSwitch positionSwitch0 = new PositionSwitch((-2785), simpleCombatant0, simpleCombatant0);
      boolean boolean0 = positionSwitch0.equals((Object) null);
      assertEquals((-2785), positionSwitch0.round);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CombatantSide combatantSide0 = CombatantSide.ATTACKER;
      Area area0 = mock(Area.class, new ViolatedAssumptionAnswer());
      doReturn((Combatant) null, (Combatant) null).when(area0).occupy(any(de.outstare.fortbattleplayer.model.Combatant.class) , any(de.outstare.fortbattleplayer.model.Area.class));
      CombatantState combatantState0 = new CombatantState(area0, 581, area0, false);
      CharacterClass characterClass0 = CharacterClass.DUELANT;
      SimpleWeapon simpleWeapon0 = new SimpleWeapon(581, "[LK}V3,_tAK{'l.%e", 581, 581);
      SimpleCombatant simpleCombatant0 = new SimpleCombatant(combatantSide0, combatantState0, 581, "[LK}V3,_tAK{'l.%e", characterClass0, simpleWeapon0, "[LK}V3,_tAK{'l.%e");
      PositionSwitch positionSwitch0 = new PositionSwitch(581, simpleCombatant0, simpleCombatant0);
      SimpleCombatant simpleCombatant1 = new SimpleCombatant(combatantSide0, combatantState0, 581, "F", characterClass0, simpleWeapon0, "F");
      PositionSwitch positionSwitch1 = new PositionSwitch(581, simpleCombatant1, positionSwitch0.player2);
      int int0 = positionSwitch0.compareTo(positionSwitch1);
      assertEquals(581, positionSwitch1.round);
      assertEquals(21, int0);
      assertFalse(positionSwitch1.equals((Object)positionSwitch0));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CombatantSide combatantSide0 = CombatantSide.DEFENDER;
      Sector sector0 = mock(Sector.class, new ViolatedAssumptionAnswer());
      SimpleArea simpleArea0 = new SimpleArea((-112), 1814, sector0);
      CombatantState combatantState0 = new CombatantState(simpleArea0, 1, simpleArea0, false);
      CharacterClass characterClass0 = CharacterClass.ADVENTURER;
      SimpleWeapon simpleWeapon0 = new SimpleWeapon(1, "", 196, 676);
      SimpleCombatant simpleCombatant0 = new SimpleCombatant(combatantSide0, combatantState0, 30, "?", characterClass0, simpleWeapon0, "");
      PositionSwitch positionSwitch0 = new PositionSwitch(676, simpleCombatant0, simpleCombatant0);
      PositionSwitch positionSwitch1 = new PositionSwitch(577, simpleCombatant0, simpleCombatant0);
      int int0 = positionSwitch0.compareTo(positionSwitch1);
      assertEquals(1, int0);
      assertEquals(577, positionSwitch1.round);
      assertFalse(positionSwitch1.equals((Object)positionSwitch0));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CombatantSide combatantSide0 = CombatantSide.DEFENDER;
      Point point0 = new Point();
      Sector sector0 = mock(Sector.class, new ViolatedAssumptionAnswer());
      SimpleArea simpleArea0 = new SimpleArea(point0, sector0);
      CombatantState combatantState0 = new CombatantState(simpleArea0, (-2707), simpleArea0, false);
      CharacterClass characterClass0 = CharacterClass.WORKER;
      SimpleWeapon simpleWeapon0 = new SimpleWeapon(269, "", 0, 269);
      SimpleCombatant simpleCombatant0 = new SimpleCombatant(combatantSide0, combatantState0, 0, "", characterClass0, simpleWeapon0, "");
      PositionSwitch positionSwitch0 = new PositionSwitch((-2785), simpleCombatant0, simpleCombatant0);
      PositionSwitch positionSwitch1 = new PositionSwitch((int) positionSwitch0.health1, positionSwitch0.player2, positionSwitch0.player1);
      int int0 = positionSwitch0.compareTo(positionSwitch1);
      assertEquals((-1), int0);
      assertEquals((-2707), positionSwitch1.round);
      assertFalse(positionSwitch1.equals((Object)positionSwitch0));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CombatantSide combatantSide0 = CombatantSide.ATTACKER;
      Area area0 = mock(Area.class, new ViolatedAssumptionAnswer());
      doReturn((Combatant) null, (Combatant) null).when(area0).occupy(any(de.outstare.fortbattleplayer.model.Combatant.class) , any(de.outstare.fortbattleplayer.model.Area.class));
      CombatantState combatantState0 = new CombatantState(area0, 581, area0, false);
      CharacterClass characterClass0 = CharacterClass.DUELANT;
      SimpleWeapon simpleWeapon0 = new SimpleWeapon(0, "[LK}V3,_tAK{'l.%e", 0, 581);
      SimpleCombatant simpleCombatant0 = new SimpleCombatant(combatantSide0, combatantState0, 581, "[LK}V3,_tAK{'l.%e", characterClass0, simpleWeapon0, "IRHgl{Pv&e");
      PositionSwitch positionSwitch0 = new PositionSwitch(0, simpleCombatant0, simpleCombatant0);
      SimpleCombatant simpleCombatant1 = new SimpleCombatant(combatantSide0, combatantState0, 0, "", characterClass0, simpleWeapon0, "");
      PositionSwitch positionSwitch1 = new PositionSwitch(0, simpleCombatant1, positionSwitch0.player2);
      boolean boolean0 = positionSwitch0.equals(positionSwitch1);
      assertFalse(positionSwitch1.equals((Object)positionSwitch0));
      assertEquals(0, positionSwitch1.round);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CombatantSide combatantSide0 = CombatantSide.ATTACKER;
      Area area0 = mock(Area.class, new ViolatedAssumptionAnswer());
      doReturn((Combatant) null).when(area0).occupy(any(de.outstare.fortbattleplayer.model.Combatant.class) , any(de.outstare.fortbattleplayer.model.Area.class));
      CombatantState combatantState0 = new CombatantState(area0, 581, area0, false);
      CharacterClass characterClass0 = CharacterClass.DUELANT;
      SimpleWeapon simpleWeapon0 = new SimpleWeapon(0, "[LK}V3,_tAK{'l.%e", 0, 581);
      SimpleCombatant simpleCombatant0 = new SimpleCombatant(combatantSide0, combatantState0, 581, "[LK}V3,_tAK{'l.%e", characterClass0, simpleWeapon0, "IRHgl{Pv&e");
      PositionSwitch positionSwitch0 = new PositionSwitch(0, simpleCombatant0, simpleCombatant0);
      PositionSwitch positionSwitch1 = new PositionSwitch(0, simpleCombatant0, positionSwitch0.player2);
      boolean boolean0 = positionSwitch0.equals(positionSwitch1);
      assertTrue(boolean0);
      assertEquals(0, positionSwitch1.round);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Area area0 = mock(Area.class, new ViolatedAssumptionAnswer());
      doReturn((Combatant) null).when(area0).occupy(any(de.outstare.fortbattleplayer.model.Combatant.class) , any(de.outstare.fortbattleplayer.model.Area.class));
      CombatantState combatantState0 = new CombatantState(area0, 581, area0, false);
      SimpleWeapon simpleWeapon0 = new SimpleWeapon(581, "[LK}V3,_tAK{'l.%e", 581, 581);
      CharacterClass characterClass0 = CharacterClass.ADVENTURER;
      CombatantSide combatantSide0 = CombatantSide.ATTACKER;
      SimpleCombatant simpleCombatant0 = new SimpleCombatant(combatantSide0, combatantState0, 581, "[LK}V3,_tAK{'l.%e", characterClass0, simpleWeapon0, "[LK}V3,_tAK{'l.%e");
      PositionSwitch positionSwitch0 = new PositionSwitch(581, simpleCombatant0, simpleCombatant0);
      // Undeclared exception!
      try { 
        positionSwitch0.compareTo((PositionSwitch) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.outstare.fortbattleplayer.statistics.PositionSwitch", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Area area0 = mock(Area.class, new ViolatedAssumptionAnswer());
      doReturn((Combatant) null).when(area0).occupy(any(de.outstare.fortbattleplayer.model.Combatant.class) , any(de.outstare.fortbattleplayer.model.Area.class));
      CombatantState combatantState0 = new CombatantState(area0, 581, area0, false);
      SimpleWeapon simpleWeapon0 = new SimpleWeapon(581, "[LK}V3,_tAK{'l.%e", 581, 581);
      CombatantSide combatantSide0 = CombatantSide.DEFENDER;
      CharacterClass characterClass0 = CharacterClass.ADVENTURER;
      SimpleCombatant simpleCombatant0 = new SimpleCombatant(combatantSide0, combatantState0, 581, "[LK}V3,_tAK{'l.%e", characterClass0, simpleWeapon0, "[LK}V3,_tAK{'l.%e");
      PositionSwitch positionSwitch0 = new PositionSwitch(581, simpleCombatant0, simpleCombatant0);
      int int0 = positionSwitch0.compareTo(positionSwitch0);
      assertEquals(0, int0);
      assertEquals(581, positionSwitch0.round);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CombatantSide combatantSide0 = CombatantSide.ATTACKER;
      Area area0 = mock(Area.class, new ViolatedAssumptionAnswer());
      doReturn((Combatant) null).when(area0).occupy(any(de.outstare.fortbattleplayer.model.Combatant.class) , any(de.outstare.fortbattleplayer.model.Area.class));
      CombatantState combatantState0 = new CombatantState(area0, 581, area0, false);
      CharacterClass characterClass0 = CharacterClass.DUELANT;
      SimpleWeapon simpleWeapon0 = new SimpleWeapon(0, "[LK}V3,_tAK{'l.%e", 0, 581);
      SimpleCombatant simpleCombatant0 = new SimpleCombatant(combatantSide0, combatantState0, 581, "[LK}V3,_tAK{'l.%e", characterClass0, simpleWeapon0, "IRHgl{Pv&e");
      PositionSwitch positionSwitch0 = new PositionSwitch(0, simpleCombatant0, simpleCombatant0);
      boolean boolean0 = positionSwitch0.equals(simpleCombatant0);
      assertFalse(boolean0);
      assertEquals(0, positionSwitch0.round);
  }
}