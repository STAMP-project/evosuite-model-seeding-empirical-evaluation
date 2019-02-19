/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 19 17:31:11 GMT 2019
 */

package org.ow2.proactive.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.ow2.proactive.utils.ClasspathUtils;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClasspathUtils_ESTest extends ClasspathUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = ClasspathUtils.findBaseDirectoryFromJarLocation("&tDI)");
      assertEquals("/home/pderakhshanfar/common-uncommon-behaviour-testing-experiment/.", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ClasspathUtils.findSchedulerHome();
      String string0 = ClasspathUtils.findSchedulerHome();
      assertNotNull(string0);
      assertEquals("/home/pderakhshanfar/common-uncommon-behaviour-testing-experiment/.", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ClasspathUtils classpathUtils0 = new ClasspathUtils();
  }
}
