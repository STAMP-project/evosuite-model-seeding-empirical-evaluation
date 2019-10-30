/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 29 18:57:55 GMT 2019
 */

package net.sourceforge.squirrel_sql.fw.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.PrintWriter;
import java.net.URL;
import net.sourceforge.squirrel_sql.fw.util.FileExtensionFilter;
import net.sourceforge.squirrel_sql.fw.util.FileWrapper;
import net.sourceforge.squirrel_sql.fw.util.FileWrapperImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FileWrapperImpl_ESTest extends FileWrapperImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FileWrapper fileWrapper0 = FileWrapperImpl.createTempFile("Py]PCYr|rj", "/home/pderakhshanfar/evosuite-model-seeding-ee/evosuite-model-seeding-empirical-evaluation/vDh/vDh", (FileWrapper) null);
      assertEquals("/tmp/Py]PCYr|rj0/home/pderakhshanfar/evosuite-model-seeding-ee/evosuite-model-seeding-empirical-evaluation/vDh/vDh", fileWrapper0.getPath());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileWrapperImpl fileWrapperImpl0 = new FileWrapperImpl("");
      URL uRL0 = fileWrapperImpl0.toURL();
      assertNull(uRL0.getRef());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(file0).toString();
      FileWrapperImpl fileWrapperImpl0 = new FileWrapperImpl(file0);
      String string0 = fileWrapperImpl0.toString();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileWrapperImpl fileWrapperImpl0 = new FileWrapperImpl("");
      String string0 = fileWrapperImpl0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileWrapperImpl fileWrapperImpl0 = FileWrapperImpl.createTempFile("net.sourceforge.squirrel_sql.fw.util.FileWrapprImpl", "net.sourceforge.squirrel_sql.fw.util.FileWrapprImpl", (FileWrapperImpl) null);
      boolean boolean0 = fileWrapperImpl0.setReadOnly();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      File file0 = MockFile.createTempFile("T1~ a", "sg2?yx'`9$fAb");
      FileWrapperImpl fileWrapperImpl0 = new FileWrapperImpl(file0);
      boolean boolean0 = fileWrapperImpl0.setLastModified(0L);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FileWrapperImpl fileWrapperImpl0 = new FileWrapperImpl("I`79", "I`79");
      boolean boolean0 = fileWrapperImpl0.setLastModified(3352L);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileWrapperImpl fileWrapperImpl0 = new FileWrapperImpl(":S[Zn(tMt");
      boolean boolean0 = fileWrapperImpl0.renameTo(fileWrapperImpl0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FileWrapperImpl fileWrapperImpl0 = new FileWrapperImpl("vDh");
      FileWrapperImpl.createTempFile("Zw)C#u5;HD{0j?3", "Zw)C#u5;HD{0j?3", (FileWrapper) fileWrapperImpl0);
      assertEquals(1392409281320L, fileWrapperImpl0.lastModified());
      
      boolean boolean0 = fileWrapperImpl0.mkdirs();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FileWrapperImpl fileWrapperImpl0 = new FileWrapperImpl("vDh", "vDh");
      FileWrapperImpl.createTempFile("Zw)C#u5;HD{0j?3", "Zw)C#u5;HD{0j?3", (FileWrapper) fileWrapperImpl0);
      boolean boolean0 = fileWrapperImpl0.mkdir();
      assertFalse(fileWrapperImpl0.isFile());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileWrapperImpl fileWrapperImpl0 = new FileWrapperImpl(" (", " (");
      FileWrapper[] fileWrapperArray0 = fileWrapperImpl0.listFiles((FilenameFilter) null);
      assertNull(fileWrapperArray0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileWrapperImpl fileWrapperImpl0 = new FileWrapperImpl(mockFile0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      FileExtensionFilter fileExtensionFilter0 = new FileExtensionFilter(" $;g]!XyTj4F#XJU:A", stringArray0);
      FileWrapper[] fileWrapperArray0 = fileWrapperImpl0.listFiles((FilenameFilter) fileExtensionFilter0);
      assertEquals(2, fileWrapperArray0.length);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FileWrapperImpl fileWrapperImpl0 = new FileWrapperImpl("");
      String[] stringArray0 = new String[0];
      FileExtensionFilter fileExtensionFilter0 = new FileExtensionFilter("6C1\"e&&\"2?k]m^_", stringArray0);
      FileWrapper[] fileWrapperArray0 = fileWrapperImpl0.listFiles((FilenameFilter) fileExtensionFilter0);
      assertEquals(0, fileWrapperArray0.length);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FileWrapperImpl fileWrapperImpl0 = new FileWrapperImpl("vDh", "vDh");
      String[] stringArray0 = new String[0];
      FileExtensionFilter fileExtensionFilter0 = new FileExtensionFilter("o7w)&Rp", stringArray0);
      FileWrapper[] fileWrapperArray0 = fileWrapperImpl0.listFiles((FileFilter) fileExtensionFilter0);
      assertNull(fileWrapperArray0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FileWrapperImpl fileWrapperImpl0 = new FileWrapperImpl("", "");
      String[] stringArray0 = new String[8];
      FileExtensionFilter fileExtensionFilter0 = new FileExtensionFilter("", stringArray0);
      FileWrapper[] fileWrapperArray0 = fileWrapperImpl0.listFiles((FileFilter) fileExtensionFilter0);
      assertEquals(2, fileWrapperArray0.length);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FileWrapperImpl fileWrapperImpl0 = new FileWrapperImpl("");
      FileWrapperImpl.createTempFile("Zw)C#u5;HD{0j?3", "Zw)C#u5;HD{0j?3", (FileWrapper) fileWrapperImpl0);
      FileWrapper[] fileWrapperArray0 = fileWrapperImpl0.listFiles();
      assertEquals(1, fileWrapperArray0.length);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FileWrapperImpl fileWrapperImpl0 = new FileWrapperImpl("");
      FileWrapper[] fileWrapperArray0 = fileWrapperImpl0.listFiles();
      assertEquals(0, fileWrapperArray0.length);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FileWrapperImpl fileWrapperImpl0 = new FileWrapperImpl("", "");
      String[] stringArray0 = new String[8];
      stringArray0[0] = "";
      FileExtensionFilter fileExtensionFilter0 = new FileExtensionFilter("", stringArray0);
      String[] stringArray1 = fileWrapperImpl0.list((FilenameFilter) fileExtensionFilter0);
      assertEquals(2, stringArray1.length);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String[] stringArray0 = new String[2];
      FileExtensionFilter fileExtensionFilter0 = new FileExtensionFilter("", stringArray0);
      FileWrapperImpl fileWrapperImpl0 = new FileWrapperImpl("", ")");
      fileWrapperImpl0.mkdirs();
      fileWrapperImpl0.list((FilenameFilter) fileExtensionFilter0);
      assertEquals("/)", fileWrapperImpl0.toString());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FileWrapperImpl fileWrapperImpl0 = new FileWrapperImpl("vDh", "vDh");
      FileWrapperImpl.createTempFile("Zw)C#u5;HD{0j?3", "Zw)C#u5;HD{0j?3", (FileWrapper) fileWrapperImpl0);
      fileWrapperImpl0.list();
      assertTrue(fileWrapperImpl0.isDirectory());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FileWrapperImpl fileWrapperImpl0 = new FileWrapperImpl("");
      String[] stringArray0 = fileWrapperImpl0.list();
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("vDh/vDh");
      byte[] byteArray0 = new byte[5];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileWrapperImpl fileWrapperImpl0 = new FileWrapperImpl("vDh", "vDh");
      long long0 = fileWrapperImpl0.length();
      assertEquals(5L, long0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FileWrapperImpl fileWrapperImpl0 = new FileWrapperImpl("vDh", "vDh");
      FileWrapperImpl.createTempFile("vDh", ", ", (FileWrapper) fileWrapperImpl0);
      long long0 = fileWrapperImpl0.lastModified();
      assertFalse(fileWrapperImpl0.isFile());
      assertEquals(1392409281320L, long0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FileWrapperImpl fileWrapperImpl0 = new FileWrapperImpl(".Egd1|;", "");
      boolean boolean0 = fileWrapperImpl0.isHidden();
      assertEquals("/home/pderakhshanfar/evosuite-model-seeding-ee/evosuite-model-seeding-empirical-evaluation/.Egd1|;", fileWrapperImpl0.toString());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FileWrapperImpl fileWrapperImpl0 = new FileWrapperImpl("?%+2ZPn");
      boolean boolean0 = fileWrapperImpl0.isHidden();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FileWrapperImpl fileWrapperImpl0 = new FileWrapperImpl("");
      boolean boolean0 = fileWrapperImpl0.isFile();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FileWrapperImpl fileWrapperImpl0 = new FileWrapperImpl("vDh", "vDh");
      FileWrapperImpl.createTempFile("vDh", ", ", (FileWrapper) fileWrapperImpl0);
      boolean boolean0 = fileWrapperImpl0.isDirectory();
      assertTrue(fileWrapperImpl0.canRead());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MockFile mockFile0 = new MockFile("?W2T8Ko");
      FileWrapperImpl fileWrapperImpl0 = new FileWrapperImpl(mockFile0);
      boolean boolean0 = fileWrapperImpl0.isAbsolute();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FileWrapperImpl fileWrapperImpl0 = new FileWrapperImpl("?c2", "?c2");
      PrintWriter printWriter0 = fileWrapperImpl0.getPrintWriter();
      assertNotNull(printWriter0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FileWrapperImpl fileWrapperImpl0 = new FileWrapperImpl((FileWrapper) null, " t]n<Db$D)`_;!7.");
      String string0 = fileWrapperImpl0.getPath();
      assertEquals(" t]n<Db$D)`_;!7.", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FileWrapperImpl fileWrapperImpl0 = new FileWrapperImpl("");
      String string0 = fileWrapperImpl0.getPath();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MockFile mockFile0 = new MockFile("o@&HTi", "o@&HTi");
      FileWrapperImpl fileWrapperImpl0 = new FileWrapperImpl(mockFile0);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("o@&HTi");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "/home/pderakhshanfar/evosuite-model-seeding-ee/evosuite-model-seeding-empirical-evaluation/o@&HTi/o@&HTi");
      FileWrapper fileWrapper0 = fileWrapperImpl0.getParentFile();
      assertFalse(fileWrapper0.isDirectory());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FileWrapperImpl fileWrapperImpl0 = new FileWrapperImpl("c%-A+/(,|k");
      FileWrapper fileWrapper0 = fileWrapperImpl0.getParentFile();
      assertTrue(fileWrapper0.isFile());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FileWrapperImpl fileWrapperImpl0 = new FileWrapperImpl("_XO?1 ^!#wky;wY;'", "_XO?1 ^!#wky;wY;'");
      FileWrapperImpl.createTempFile("_XO?1 ^!#wky;wY;'", "_XO?1 ^!#wky;wY;'", (FileWrapper) fileWrapperImpl0);
      fileWrapperImpl0.getParentFile();
      assertTrue(fileWrapperImpl0.canRead());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      FileWrapperImpl fileWrapperImpl0 = new FileWrapperImpl("rP;");
      String string0 = fileWrapperImpl0.getParent();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(file0).getName();
      FileWrapperImpl fileWrapperImpl0 = new FileWrapperImpl(file0);
      String string0 = fileWrapperImpl0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      FileWrapperImpl fileWrapperImpl0 = new FileWrapperImpl("", "");
      String string0 = fileWrapperImpl0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      MockFile mockFile0 = new MockFile("o@&HTi", "o@&HTi");
      FileWrapperImpl fileWrapperImpl0 = new FileWrapperImpl(mockFile0);
      fileWrapperImpl0.getFileWriter();
      FileReader fileReader0 = fileWrapperImpl0.getFileReader();
      assertNotNull(fileReader0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      FileWrapperImpl fileWrapperImpl0 = new FileWrapperImpl(")");
      FileOutputStream fileOutputStream0 = fileWrapperImpl0.getFileOutputStream();
      assertNotNull(fileOutputStream0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      File file0 = MockFile.createTempFile("T1~ a", "sg2?yx'`9$fAb");
      FileWrapperImpl fileWrapperImpl0 = new FileWrapperImpl(file0);
      FileInputStream fileInputStream0 = fileWrapperImpl0.getFileInputStream();
      assertEquals(0, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(file0).getCanonicalPath();
      FileWrapperImpl fileWrapperImpl0 = new FileWrapperImpl(file0);
      String string0 = fileWrapperImpl0.getCanonicalPath();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      FileWrapperImpl fileWrapperImpl0 = new FileWrapperImpl(".UPC7\"pPl]LXJN@@");
      FileWrapper fileWrapper0 = fileWrapperImpl0.getCanonicalFile();
      assertEquals("/home/pderakhshanfar/evosuite-model-seeding-ee/evosuite-model-seeding-empirical-evaluation", fileWrapper0.getParent());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      FileWrapperImpl fileWrapperImpl0 = new FileWrapperImpl("");
      FileWrapper fileWrapper0 = fileWrapperImpl0.getCanonicalFile();
      assertFalse(fileWrapper0.isFile());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      MockFile mockFile0 = new MockFile("o@&HTi", "o@&HTi");
      FileWrapperImpl fileWrapperImpl0 = new FileWrapperImpl(mockFile0);
      fileWrapperImpl0.getFileWriter();
      BufferedReader bufferedReader0 = fileWrapperImpl0.getBufferedReader();
      assertNotNull(bufferedReader0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      FileWrapperImpl fileWrapperImpl0 = new FileWrapperImpl("I`79");
      String string0 = fileWrapperImpl0.getAbsolutePath();
      assertEquals("/home/pderakhshanfar/evosuite-model-seeding-ee/evosuite-model-seeding-empirical-evaluation/I`79", string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      MockFile mockFile0 = new MockFile((File) null, ".eh2");
      FileWrapperImpl fileWrapperImpl0 = new FileWrapperImpl(mockFile0);
      FileWrapper fileWrapper0 = fileWrapperImpl0.getAbsoluteFile();
      assertEquals(".eh2", fileWrapper0.getName());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("vDh/vDh");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "z#_Aq;[0.I`");
      FileWrapperImpl fileWrapperImpl0 = new FileWrapperImpl("vDh", "vDh");
      FileWrapper fileWrapper0 = fileWrapperImpl0.getAbsoluteFile();
      assertTrue(fileWrapper0.isAbsolute());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      File file0 = MockFile.createTempFile("T1~ a", "sg2?yx'`9$fAb");
      FileWrapperImpl fileWrapperImpl0 = new FileWrapperImpl(file0);
      boolean boolean0 = fileWrapperImpl0.exists();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      FileWrapperImpl fileWrapperImpl0 = new FileWrapperImpl("");
      boolean boolean0 = fileWrapperImpl0.delete();
      assertTrue(boolean0);
  }
}
