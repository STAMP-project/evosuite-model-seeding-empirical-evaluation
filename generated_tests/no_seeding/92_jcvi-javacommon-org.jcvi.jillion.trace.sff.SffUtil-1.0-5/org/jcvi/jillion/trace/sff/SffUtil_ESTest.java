/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 28 18:54:47 GMT 2019
 */

package org.jcvi.jillion.trace.sff;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jcvi.jillion.core.Range;
import org.jcvi.jillion.core.qual.QualitySequence;
import org.jcvi.jillion.core.residue.nt.NucleotideSequence;
import org.jcvi.jillion.trace.sff.SffFlowgram;
import org.jcvi.jillion.trace.sff.SffFlowgramImpl;
import org.jcvi.jillion.trace.sff.SffUtil;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SffUtil_ESTest extends SffUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SffUtil.Linkers sffUtil_Linkers0 = SffUtil.Linkers.FLX;
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.ZERO_BASED;
      Range range0 = Range.of(range_CoordinateSystem0, (long) 86, (long) 86);
      NucleotideSequence nucleotideSequence0 = sffUtil_Linkers0.getReverseSequence();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      short[] shortArray0 = new short[4];
      Range range1 = SffUtil.EMPTY_CLIP;
      byte[] byteArray0 = new byte[2];
      SffFlowgramImpl sffFlowgramImpl0 = new SffFlowgramImpl("(d+).(d+)", nucleotideSequence0, qualitySequence0, shortArray0, range1, range0, byteArray0, shortArray0);
      // Undeclared exception!
      try { 
        SffUtil.computeTrimRangeFor((SffFlowgram) sffFlowgramImpl0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // length can not be negative
         //
         verifyException("org.jcvi.jillion.core.Range$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int int0 = SffUtil.caclulatePaddedBytes((-1073741823));
      assertEquals(15, int0);
  }
}