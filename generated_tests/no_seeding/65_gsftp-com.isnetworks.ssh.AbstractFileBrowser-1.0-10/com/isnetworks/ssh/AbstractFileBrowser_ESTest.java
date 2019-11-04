/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 04 18:39:45 GMT 2019
 */

package com.isnetworks.ssh;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.isnetworks.ssh.FileDisplay;
import com.isnetworks.ssh.LocalFileBrowser;
import mindbright.ssh.SSHPropertyHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractFileBrowser_ESTest extends AbstractFileBrowser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SSHPropertyHandler sSHPropertyHandler0 = new SSHPropertyHandler();
      LocalFileBrowser localFileBrowser0 = null;
      try {
        localFileBrowser0 = new LocalFileBrowser((FileDisplay) null, sSHPropertyHandler0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.isnetworks.ssh.AbstractFileBrowser", e);
      }
  }
}
