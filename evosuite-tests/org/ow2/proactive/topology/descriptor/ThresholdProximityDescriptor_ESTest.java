/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 19 17:29:51 GMT 2019
 */

package org.ow2.proactive.topology.descriptor;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.ow2.proactive.topology.descriptor.ThresholdProximityDescriptor;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ThresholdProximityDescriptor_ESTest extends ThresholdProximityDescriptor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ThresholdProximityDescriptor thresholdProximityDescriptor0 = new ThresholdProximityDescriptor(1948L);
      long long0 = thresholdProximityDescriptor0.getThreshold();
      assertEquals(1948L, long0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ThresholdProximityDescriptor thresholdProximityDescriptor0 = null;
      try {
        thresholdProximityDescriptor0 = new ThresholdProximityDescriptor((-1L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Threshold cannot be negative
         //
         verifyException("org.ow2.proactive.topology.descriptor.ThresholdProximityDescriptor", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ThresholdProximityDescriptor thresholdProximityDescriptor0 = new ThresholdProximityDescriptor();
      String string0 = thresholdProximityDescriptor0.toString();
      assertEquals("ThresholdProximityDescriptor threshold is 0", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ThresholdProximityDescriptor thresholdProximityDescriptor0 = new ThresholdProximityDescriptor();
      long long0 = thresholdProximityDescriptor0.getThreshold();
      assertEquals(0L, long0);
  }
}
