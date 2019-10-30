/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 28 16:10:09 GMT 2019
 */

package de.outstare.fortbattleplayer.statistics;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import de.outstare.fortbattleplayer.model.CharacterClass;
import de.outstare.fortbattleplayer.model.Combatant;
import de.outstare.fortbattleplayer.model.CombatantSide;
import de.outstare.fortbattleplayer.model.CombatantState;
import de.outstare.fortbattleplayer.model.Weapon;
import de.outstare.fortbattleplayer.model.impl.SimpleArea;
import de.outstare.fortbattleplayer.model.impl.SimpleCombatant;
import de.outstare.fortbattleplayer.model.impl.SimpleSector;
import de.outstare.fortbattleplayer.model.impl.SimpleWeapon;
import de.outstare.fortbattleplayer.statistics.PositionSwitch;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PositionSwitch_ESTest extends PositionSwitch_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CombatantSide combatantSide0 = CombatantSide.ATTACKER;
      CharacterClass characterClass0 = CharacterClass.SOLDIER;
      SimpleSector simpleSector0 = new SimpleSector(0, true, true, 1, 1, true, 2817, characterClass0);
      SimpleArea simpleArea0 = new SimpleArea(1, 1, simpleSector0);
      CombatantState combatantState0 = new CombatantState(simpleArea0, 1, simpleArea0, true);
      SimpleWeapon simpleWeapon0 = new SimpleWeapon(5, "de.outstare.fortbattleplayer.statistics.AreaStatistic", 0, 5);
      SimpleCombatant simpleCombatant0 = new SimpleCombatant(combatantSide0, combatantState0, 5, "de.outstare.fortbattleplayer.statistics.AreaStatistic", characterClass0, simpleWeapon0, "de.outstare.fortbattleplayer.statistics.AreaStatistic");
      PositionSwitch positionSwitch0 = new PositionSwitch(1, simpleCombatant0, simpleCombatant0);
      SimpleCombatant simpleCombatant1 = new SimpleCombatant(combatantSide0, combatantState0, 0, "", characterClass0, simpleWeapon0, "");
      PositionSwitch positionSwitch1 = new PositionSwitch((int) positionSwitch0.health2, simpleCombatant1, simpleCombatant1);
      int int0 = positionSwitch0.compareTo(positionSwitch1);
      assertEquals(1, positionSwitch1.round);
      assertEquals(53, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CombatantSide combatantSide0 = CombatantSide.ATTACKER;
      CharacterClass characterClass0 = CharacterClass.SOLDIER;
      SimpleSector simpleSector0 = new SimpleSector(0, true, true, 1, 1, true, 0, characterClass0);
      SimpleArea simpleArea0 = new SimpleArea(1, 1, simpleSector0);
      CombatantState combatantState0 = new CombatantState(simpleArea0, 1, simpleArea0, true);
      SimpleWeapon simpleWeapon0 = new SimpleWeapon(1, "de.outstare.fortbattleplayer.statistics.AreaStatistic", 0, 1);
      SimpleCombatant simpleCombatant0 = new SimpleCombatant(combatantSide0, combatantState0, 1, "de.outstare.fortbattleplayer.statistics.AreaStatistic", characterClass0, simpleWeapon0, "de.outstare.fortbattleplayer.statistics.AreaStatistic");
      PositionSwitch positionSwitch0 = new PositionSwitch(1, simpleCombatant0, simpleCombatant0);
      SimpleCombatant simpleCombatant1 = new SimpleCombatant(combatantSide0, combatantState0, 0, "", characterClass0, simpleWeapon0, "");
      PositionSwitch positionSwitch1 = new PositionSwitch(1, simpleCombatant1, positionSwitch0.player2);
      positionSwitch1.hashCode();
      assertEquals(1, positionSwitch1.round);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CharacterClass characterClass0 = CharacterClass.SOLDIER;
      SimpleSector simpleSector0 = new SimpleSector(12, false, false, 12, 12, false, 12, characterClass0);
      SimpleArea simpleArea0 = new SimpleArea(12, 12, simpleSector0);
      CombatantState combatantState0 = new CombatantState(simpleArea0, 12, simpleArea0, false);
      CombatantSide combatantSide0 = CombatantSide.ATTACKER;
      SimpleCombatant simpleCombatant0 = new SimpleCombatant(combatantSide0, combatantState0, 12, "P", characterClass0, (Weapon) null, "P");
      PositionSwitch positionSwitch0 = new PositionSwitch(12, simpleCombatant0, simpleCombatant0);
      positionSwitch0.hashCode();
      assertEquals(12, positionSwitch0.round);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PositionSwitch positionSwitch0 = null;
      try {
        positionSwitch0 = new PositionSwitch(1647, (Combatant) null, (Combatant) null);
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
      CombatantSide combatantSide0 = CombatantSide.ATTACKER;
      CharacterClass characterClass0 = CharacterClass.GREENHORN;
      SimpleSector simpleSector0 = new SimpleSector((-358), false, true, (-1764), 0, true, 1, characterClass0);
      SimpleArea simpleArea0 = new SimpleArea((-2984), 1, simpleSector0);
      CombatantState combatantState0 = new CombatantState(simpleArea0, 31, simpleArea0, true);
      SimpleWeapon simpleWeapon0 = new SimpleWeapon((-358), "", 0, 20);
      SimpleCombatant simpleCombatant0 = new SimpleCombatant(combatantSide0, combatantState0, (-2984), "V'hm+)fMFC\u0004cD*ldwq", characterClass0, simpleWeapon0, "");
      PositionSwitch positionSwitch0 = new PositionSwitch((-2984), simpleCombatant0, simpleCombatant0);
      PositionSwitch positionSwitch1 = new PositionSwitch(10, positionSwitch0.player1, simpleCombatant0);
      PositionSwitch positionSwitch2 = new PositionSwitch(10, positionSwitch1.player2, simpleCombatant0);
      boolean boolean0 = positionSwitch2.equals(positionSwitch1);
      assertEquals(10, positionSwitch2.round);
      assertTrue(boolean0);
      assertFalse(positionSwitch2.equals((Object)positionSwitch0));
      assertFalse(positionSwitch0.equals((Object)positionSwitch1));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CombatantSide combatantSide0 = CombatantSide.ATTACKER;
      CharacterClass characterClass0 = CharacterClass.SOLDIER;
      SimpleSector simpleSector0 = new SimpleSector(1, true, true, 1, 1, true, 2817, characterClass0);
      SimpleArea simpleArea0 = new SimpleArea(1, 1, simpleSector0);
      CombatantState combatantState0 = new CombatantState(simpleArea0, 1, simpleArea0, true);
      SimpleWeapon simpleWeapon0 = new SimpleWeapon(5, "de.outstare.fortbattleplayer.statistics.AreaStatistic", 0, 5);
      SimpleCombatant simpleCombatant0 = new SimpleCombatant(combatantSide0, combatantState0, 5, "de.outstare.fortbattleplayer.statistics.AreaStatistic", characterClass0, simpleWeapon0, "de.outstare.fortbattleplayer.statistics.AreaStatistic");
      PositionSwitch positionSwitch0 = new PositionSwitch(1, simpleCombatant0, simpleCombatant0);
      SimpleCombatant simpleCombatant1 = new SimpleCombatant(combatantSide0, combatantState0, 1, "", characterClass0, simpleWeapon0, "");
      PositionSwitch positionSwitch1 = new PositionSwitch(0, simpleCombatant0, simpleCombatant1);
      PositionSwitch positionSwitch2 = new PositionSwitch(1990, positionSwitch1.player2, positionSwitch1.player1);
      boolean boolean0 = positionSwitch0.equals(positionSwitch2);
      assertFalse(boolean0);
      assertEquals(1990, positionSwitch2.round);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CombatantSide combatantSide0 = CombatantSide.ATTACKER;
      CharacterClass characterClass0 = CharacterClass.GREENHORN;
      SimpleSector simpleSector0 = new SimpleSector((-358), false, true, (-1764), 0, true, 1, characterClass0);
      SimpleArea simpleArea0 = new SimpleArea((-2984), 1, simpleSector0);
      CombatantState combatantState0 = new CombatantState(simpleArea0, 31, simpleArea0, true);
      SimpleWeapon simpleWeapon0 = new SimpleWeapon((-358), "", 0, 20);
      SimpleCombatant simpleCombatant0 = new SimpleCombatant(combatantSide0, combatantState0, (-2984), "V'hm+)fMFC\u0004cD*ldwq", characterClass0, simpleWeapon0, "");
      PositionSwitch positionSwitch0 = new PositionSwitch((-2984), simpleCombatant0, simpleCombatant0);
      PositionSwitch positionSwitch1 = new PositionSwitch(10, positionSwitch0.player2, simpleCombatant0);
      boolean boolean0 = positionSwitch1.equals(positionSwitch0);
      assertFalse(positionSwitch0.equals((Object)positionSwitch1));
      assertFalse(boolean0);
      assertEquals(10, positionSwitch1.round);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CharacterClass characterClass0 = CharacterClass.WORKER;
      SimpleSector simpleSector0 = new SimpleSector(3, false, false, 3, 3, false, 3, characterClass0);
      SimpleArea simpleArea0 = new SimpleArea(3, 3, simpleSector0);
      CombatantState combatantState0 = new CombatantState(simpleArea0, 3, simpleArea0, false);
      CombatantSide combatantSide0 = CombatantSide.DEFENDER;
      SimpleCombatant simpleCombatant0 = new SimpleCombatant(combatantSide0, combatantState0, 3, "", characterClass0, (Weapon) null, "");
      PositionSwitch positionSwitch0 = new PositionSwitch(5, simpleCombatant0, simpleCombatant0);
      boolean boolean0 = positionSwitch0.equals((Object) null);
      assertEquals(5, positionSwitch0.round);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CombatantSide combatantSide0 = CombatantSide.ATTACKER;
      CharacterClass characterClass0 = CharacterClass.GREENHORN;
      SimpleSector simpleSector0 = new SimpleSector((-358), false, true, (-1764), 0, true, 1, characterClass0);
      SimpleArea simpleArea0 = new SimpleArea((-2984), 1, simpleSector0);
      CombatantState combatantState0 = new CombatantState(simpleArea0, 31, simpleArea0, true);
      SimpleWeapon simpleWeapon0 = new SimpleWeapon((-358), "", 0, 20);
      SimpleCombatant simpleCombatant0 = new SimpleCombatant(combatantSide0, combatantState0, (-2984), "V'hm+)fMFC\u0004cD*ldwq", characterClass0, simpleWeapon0, "");
      PositionSwitch positionSwitch0 = new PositionSwitch((-2984), simpleCombatant0, simpleCombatant0);
      PositionSwitch positionSwitch1 = new PositionSwitch(10, positionSwitch0.player1, simpleCombatant0);
      int int0 = positionSwitch0.compareTo(positionSwitch1);
      assertEquals((-1), int0);
      assertEquals(10, positionSwitch1.round);
      assertFalse(positionSwitch1.equals((Object)positionSwitch0));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CombatantSide combatantSide0 = CombatantSide.ATTACKER;
      CharacterClass characterClass0 = CharacterClass.SOLDIER;
      SimpleSector simpleSector0 = new SimpleSector(1, true, true, 1, 1, true, 2817, characterClass0);
      SimpleArea simpleArea0 = new SimpleArea(1, 1, simpleSector0);
      CombatantState combatantState0 = new CombatantState(simpleArea0, 1, simpleArea0, true);
      SimpleWeapon simpleWeapon0 = new SimpleWeapon(5, "de.outstare.fortbattleplayer.statistics.AreaStatistic", 0, 5);
      SimpleCombatant simpleCombatant0 = new SimpleCombatant(combatantSide0, combatantState0, 5, "de.outstare.fortbattleplayer.statistics.AreaStatistic", characterClass0, simpleWeapon0, "de.outstare.fortbattleplayer.statistics.AreaStatistic");
      PositionSwitch positionSwitch0 = new PositionSwitch(1, simpleCombatant0, simpleCombatant0);
      PositionSwitch positionSwitch1 = new PositionSwitch(0, simpleCombatant0, simpleCombatant0);
      int int0 = positionSwitch0.compareTo(positionSwitch1);
      assertEquals(1, int0);
      assertFalse(positionSwitch1.equals((Object)positionSwitch0));
      assertEquals(0, positionSwitch1.round);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CombatantSide combatantSide0 = CombatantSide.ATTACKER;
      CharacterClass characterClass0 = CharacterClass.SOLDIER;
      SimpleSector simpleSector0 = new SimpleSector(0, true, true, 1, 1, true, 0, characterClass0);
      SimpleArea simpleArea0 = new SimpleArea(1, 1, simpleSector0);
      CombatantState combatantState0 = new CombatantState(simpleArea0, 1, simpleArea0, true);
      SimpleWeapon simpleWeapon0 = new SimpleWeapon(1, "de.outstare.fortbattleplayer.statistics.AreaStatistic", 0, 1);
      SimpleCombatant simpleCombatant0 = new SimpleCombatant(combatantSide0, combatantState0, 1, "de.outstare.fortbattleplayer.statistics.AreaStatistic", characterClass0, simpleWeapon0, "de.outstare.fortbattleplayer.statistics.AreaStatistic");
      PositionSwitch positionSwitch0 = new PositionSwitch(1, simpleCombatant0, simpleCombatant0);
      SimpleCombatant simpleCombatant1 = new SimpleCombatant(combatantSide0, combatantState0, 0, "", characterClass0, simpleWeapon0, "");
      PositionSwitch positionSwitch1 = new PositionSwitch(1, simpleCombatant1, positionSwitch0.player2);
      int int0 = positionSwitch1.compareTo(positionSwitch0);
      assertFalse(positionSwitch0.equals((Object)positionSwitch1));
      assertEquals(1, positionSwitch1.round);
      assertEquals((-53), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CombatantSide combatantSide0 = CombatantSide.ATTACKER;
      CharacterClass characterClass0 = CharacterClass.SOLDIER;
      SimpleSector simpleSector0 = new SimpleSector(0, true, true, 1, 1, true, 0, characterClass0);
      SimpleArea simpleArea0 = new SimpleArea(1, 1, simpleSector0);
      CombatantState combatantState0 = new CombatantState(simpleArea0, 1, simpleArea0, true);
      SimpleWeapon simpleWeapon0 = new SimpleWeapon(1, "de.outstare.fortbattleplayer.statistics.AreaStatistic", 0, 1);
      SimpleCombatant simpleCombatant0 = new SimpleCombatant(combatantSide0, combatantState0, 1, "de.outstare.fortbattleplayer.statistics.AreaStatistic", characterClass0, simpleWeapon0, "de.outstare.fortbattleplayer.statistics.AreaStatistic");
      PositionSwitch positionSwitch0 = new PositionSwitch(1, simpleCombatant0, simpleCombatant0);
      PositionSwitch positionSwitch1 = new PositionSwitch(1, simpleCombatant0, positionSwitch0.player2);
      int int0 = positionSwitch1.compareTo(positionSwitch0);
      assertEquals(0, int0);
      assertEquals(1, positionSwitch1.round);
      assertTrue(positionSwitch1.equals((Object)positionSwitch0));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CharacterClass characterClass0 = CharacterClass.DUELANT;
      SimpleSector simpleSector0 = new SimpleSector(3, true, true, 3, 3, true, 3, characterClass0);
      SimpleArea simpleArea0 = new SimpleArea(3, 3, simpleSector0);
      CombatantState combatantState0 = new CombatantState(simpleArea0, 3, simpleArea0, true);
      CombatantSide combatantSide0 = CombatantSide.DEFENDER;
      SimpleCombatant simpleCombatant0 = new SimpleCombatant(combatantSide0, combatantState0, 3, "", characterClass0, (Weapon) null, "");
      PositionSwitch positionSwitch0 = new PositionSwitch(3, simpleCombatant0, simpleCombatant0);
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
  public void test13()  throws Throwable  {
      CombatantSide combatantSide0 = CombatantSide.ATTACKER;
      CharacterClass characterClass0 = CharacterClass.GREENHORN;
      SimpleSector simpleSector0 = new SimpleSector((-358), false, true, (-1764), 0, true, 1, characterClass0);
      SimpleArea simpleArea0 = new SimpleArea((-2984), 1, simpleSector0);
      CombatantState combatantState0 = new CombatantState(simpleArea0, 31, simpleArea0, true);
      SimpleWeapon simpleWeapon0 = new SimpleWeapon((-358), "", 0, 20);
      SimpleCombatant simpleCombatant0 = new SimpleCombatant(combatantSide0, combatantState0, (-2984), "V'hm+)fMFC\u0004cD*ldwq", characterClass0, simpleWeapon0, "");
      PositionSwitch positionSwitch0 = new PositionSwitch((-2984), simpleCombatant0, simpleCombatant0);
      boolean boolean0 = positionSwitch0.equals(positionSwitch0);
      assertEquals((-2984), positionSwitch0.round);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CombatantSide combatantSide0 = CombatantSide.ATTACKER;
      CharacterClass characterClass0 = CharacterClass.SOLDIER;
      SimpleSector simpleSector0 = new SimpleSector(0, true, true, 1, 1, true, 0, characterClass0);
      SimpleArea simpleArea0 = new SimpleArea(1, 1, simpleSector0);
      CombatantState combatantState0 = new CombatantState(simpleArea0, 1, simpleArea0, true);
      SimpleWeapon simpleWeapon0 = new SimpleWeapon(1, "de.outstare.fortbattleplayer.statistics.AreaStatistic", 0, 1);
      SimpleCombatant simpleCombatant0 = new SimpleCombatant(combatantSide0, combatantState0, 1, "de.outstare.fortbattleplayer.statistics.AreaStatistic", characterClass0, simpleWeapon0, "de.outstare.fortbattleplayer.statistics.AreaStatistic");
      PositionSwitch positionSwitch0 = new PositionSwitch(1, simpleCombatant0, simpleCombatant0);
      boolean boolean0 = positionSwitch0.equals(characterClass0);
      assertEquals(1, positionSwitch0.round);
      assertFalse(boolean0);
  }
}