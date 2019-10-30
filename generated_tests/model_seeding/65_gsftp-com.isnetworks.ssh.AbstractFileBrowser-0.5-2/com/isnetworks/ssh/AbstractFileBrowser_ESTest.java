/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 29 09:51:01 GMT 2019
 */

package com.isnetworks.ssh;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import com.isnetworks.ssh.FileDisplay;
import com.isnetworks.ssh.LocalFileBrowser;
import mindbright.ssh.SSHPropertyHandler;
import mindbright.ssh.SSHSCPIndicator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractFileBrowser_ESTest extends AbstractFileBrowser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FileDisplay fileDisplay0 = mock(FileDisplay.class, new ViolatedAssumptionAnswer());
      SSHPropertyHandler sSHPropertyHandler0 = new SSHPropertyHandler();
      LocalFileBrowser localFileBrowser0 = new LocalFileBrowser(fileDisplay0, sSHPropertyHandler0);
      SSHSCPIndicator sSHSCPIndicator0 = mock(SSHSCPIndicator.class, new ViolatedAssumptionAnswer());
      localFileBrowser0.putFiles(sSHSCPIndicator0, (FileDisplay) null, (FileDisplay) null, false);
  }
}