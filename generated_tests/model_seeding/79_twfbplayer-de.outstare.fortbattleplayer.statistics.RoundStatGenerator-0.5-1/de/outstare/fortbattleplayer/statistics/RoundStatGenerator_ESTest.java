/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 29 08:48:38 GMT 2019
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
import de.outstare.fortbattleplayer.model.impl.SimpleArea;
import de.outstare.fortbattleplayer.model.impl.SimpleCombatant;
import de.outstare.fortbattleplayer.model.impl.SimpleSector;
import de.outstare.fortbattleplayer.model.impl.SimpleWeapon;
import de.outstare.fortbattleplayer.statistics.LabeledData;
import de.outstare.fortbattleplayer.statistics.RoundStatGenerator;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RoundStatGenerator_ESTest extends RoundStatGenerator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RoundStatGenerator roundStatGenerator0 = new RoundStatGenerator();
      HashMap<Combatant, CombatantState> hashMap0 = new HashMap<Combatant, CombatantState>();
      CombatantSide combatantSide0 = CombatantSide.ATTACKER;
      CharacterClass characterClass0 = CharacterClass.GREENHORN;
      SimpleSector simpleSector0 = new SimpleSector(1976, true, true, (-3866), (-3230), true, (-3866), characterClass0);
      SimpleArea simpleArea0 = new SimpleArea(1976, 0, simpleSector0);
      CombatantState combatantState0 = new CombatantState((Area) null, 777, (Area) null, false);
      CombatantState combatantState1 = new CombatantState(simpleArea0, combatantState0);
      SimpleWeapon simpleWeapon0 = new SimpleWeapon(777, "the CSV file with the bayonet damages was not found: /bayonetdmg.csv", 777, 1976);
      SimpleCombatant simpleCombatant0 = new SimpleCombatant(combatantSide0, combatantState1, 2, "the CSV file with the bayonet damages was not found: /bayonetdmg.csv", characterClass0, simpleWeapon0, "%N%?}ST6I37'gU*cs");
      CombatantState combatantState2 = new CombatantState(simpleArea0, 0, (Area) null, false);
      hashMap0.put(simpleCombatant0, combatantState2);
      roundStatGenerator0.addRoundState(hashMap0);
      assertFalse(hashMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RoundStatGenerator roundStatGenerator0 = new RoundStatGenerator();
      HashMap<Combatant, CombatantState> hashMap0 = new HashMap<Combatant, CombatantState>();
      hashMap0.put((Combatant) null, (CombatantState) null);
      // Undeclared exception!
      try { 
        roundStatGenerator0.addRoundState(hashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.outstare.fortbattleplayer.statistics.RoundStatGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RoundStatGenerator roundStatGenerator0 = new RoundStatGenerator();
      HashMap<Combatant, CombatantState> hashMap0 = new HashMap<Combatant, CombatantState>();
      CharacterClass characterClass0 = CharacterClass.GREENHORN;
      SimpleSector simpleSector0 = new SimpleSector(1976, true, true, (-3866), (-3230), true, (-3866), characterClass0);
      SimpleArea simpleArea0 = new SimpleArea(1976, 0, simpleSector0);
      CombatantState combatantState0 = new CombatantState(simpleArea0, (-445), simpleArea0, false);
      SimpleWeapon simpleWeapon0 = new SimpleWeapon(1290, "8r?D7kOVz1", 1787, 2616);
      CombatantSide combatantSide0 = CombatantSide.DEFENDER;
      SimpleCombatant simpleCombatant0 = new SimpleCombatant(combatantSide0, combatantState0, (-445), "the CSV file with the bayonet damages was not found: /bayonetdmg.csv", characterClass0, simpleWeapon0, "8r?D7kOVz1");
      hashMap0.put(simpleCombatant0, combatantState0);
      roundStatGenerator0.addRoundState(hashMap0);
      assertFalse(hashMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RoundStatGenerator roundStatGenerator0 = new RoundStatGenerator();
      Map<CombatantSide, LabeledData> map0 = roundStatGenerator0.getHealthAmount();
      assertEquals(2, map0.size());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      RoundStatGenerator roundStatGenerator0 = new RoundStatGenerator();
      Map<CombatantSide, LabeledData> map0 = roundStatGenerator0.getLivingCounts();
      assertEquals(2, map0.size());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      RoundStatGenerator roundStatGenerator0 = new RoundStatGenerator();
      HashMap<Combatant, CombatantState> hashMap0 = new HashMap<Combatant, CombatantState>();
      CombatantSide combatantSide0 = CombatantSide.ATTACKER;
      Area area0 = mock(Area.class, new ViolatedAssumptionAnswer());
      doReturn((Combatant) null).when(area0).occupy(any(de.outstare.fortbattleplayer.model.Combatant.class) , any(de.outstare.fortbattleplayer.model.Area.class));
      CombatantState combatantState0 = new CombatantState(area0, 65, area0, false);
      CharacterClass characterClass0 = CharacterClass.WORKER;
      SimpleWeapon simpleWeapon0 = new SimpleWeapon(65, "65R}0", 65, 65);
      SimpleCombatant simpleCombatant0 = new SimpleCombatant(combatantSide0, combatantState0, 65, "65R}0", characterClass0, simpleWeapon0, "65R}0");
      hashMap0.put(simpleCombatant0, combatantState0);
      roundStatGenerator0.addRoundState(hashMap0);
      assertFalse(hashMap0.isEmpty());
  }
}
