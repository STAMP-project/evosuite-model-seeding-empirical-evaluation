/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 19 15:21:46 GMT 2019
 */

package org.sat4j.reader;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import org.sat4j.LightFactory;
import org.sat4j.opt.MaxSatDecorator;
import org.sat4j.reader.AAGReader;
import org.sat4j.reader.AIGReader;
import org.sat4j.reader.GroupedCNFReader;
import org.sat4j.reader.InstanceReader;
import org.sat4j.reader.Reader;
import org.sat4j.specs.IGroupSolver;
import org.sat4j.specs.ISolver;
import org.sat4j.tools.DimacsStringSolver;
import org.sat4j.tools.OptToSatAdapter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class InstanceReader_ESTest extends InstanceReader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AIGReader aIGReader0 = new AIGReader((ISolver) null);
      InstanceReader instanceReader0 = new InstanceReader((ISolver) null, aIGReader0);
      int[] intArray0 = new int[9];
      MockFile mockFile0 = new MockFile("", "");
      MockFile mockFile1 = new MockFile(mockFile0, ",c=]eV&f1");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile1);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockPrintStream0, true);
      instanceReader0.decode(intArray0, (PrintWriter) mockPrintWriter0);
      assertFalse(instanceReader0.isUsingMapping());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator((ISolver) null, false);
      OptToSatAdapter optToSatAdapter0 = new OptToSatAdapter(maxSatDecorator0);
      InstanceReader instanceReader0 = new InstanceReader(optToSatAdapter0);
      Reader reader0 = instanceReader0.handleFileName("+x~pvfI9di)Xel$", "EZCNF");
      InstanceReader instanceReader1 = new InstanceReader(maxSatDecorator0, reader0);
      boolean boolean0 = instanceReader1.hasAMapping();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      InstanceReader instanceReader0 = new InstanceReader((ISolver) null);
      Reader reader0 = instanceReader0.handleFileName("E2CNF", "E2CNF");
      reader0.setUseMapping(true);
      Reader reader1 = instanceReader0.handleFileName("", "E2CNF");
      assertFalse(reader1.hasAMapping());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LightFactory lightFactory0 = LightFactory.instance();
      ISolver iSolver0 = lightFactory0.lightSolver();
      AIGReader aIGReader0 = new AIGReader(iSolver0);
      InstanceReader instanceReader0 = new InstanceReader(iSolver0, aIGReader0);
      Map<Integer, String> map0 = instanceReader0.getMapping();
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      GroupedCNFReader groupedCNFReader0 = new GroupedCNFReader((IGroupSolver) null);
      InstanceReader instanceReader0 = new InstanceReader(dimacsStringSolver0, groupedCNFReader0);
      int[] intArray0 = new int[2];
      String string0 = instanceReader0.decode(intArray0);
      assertEquals("0 0 0", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.lightSolver();
      AAGReader aAGReader0 = new AAGReader(iSolver0);
      InstanceReader instanceReader0 = new InstanceReader(iSolver0, aAGReader0);
      int[] intArray0 = new int[7];
      String string0 = instanceReader0.decode(intArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile(";L]nOgzOBfPB.aig");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "W*z[YB2N:wCs");
      AIGReader aIGReader0 = new AIGReader((ISolver) null);
      InstanceReader instanceReader0 = new InstanceReader((ISolver) null, aIGReader0);
      try { 
        instanceReader0.parseInstance(",d[T:;L]nOgzOBfPB.aig");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parsing ErrorAIG format only!
         //
         verifyException("org.sat4j.reader.AIGReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      InstanceReader instanceReader0 = new InstanceReader((ISolver) null);
      // Undeclared exception!
      try { 
        instanceReader0.parseInstance((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("{.]u");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "+rR:qk)={;*D-.L");
      InstanceReader instanceReader0 = new InstanceReader((ISolver) null);
      // Undeclared exception!
      try { 
        instanceReader0.parseInstance("{.]u");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.reader.LecteurDimacs", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      InstanceReader instanceReader0 = new InstanceReader((ISolver) null);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile(" .bz2");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, ".gz");
      try { 
        instanceReader0.parseInstance(" .bz2");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Cannot start processes in a unit test
         //
         verifyException("org.evosuite.runtime.mock.java.lang.MockRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      InstanceReader instanceReader0 = new InstanceReader((ISolver) null);
      // Undeclared exception!
      try { 
        instanceReader0.handleFileName((String) null, ",$Qv+.aig");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.lightSolver();
      InstanceReader instanceReader0 = new InstanceReader(iSolver0);
      instanceReader0.handleFileName(".aag", ".aag");
      Reader reader0 = instanceReader0.handleFileName(".aag", ".aag");
      assertFalse(reader0.hasAMapping());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      InstanceReader instanceReader0 = new InstanceReader((ISolver) null);
      try { 
        instanceReader0.parseInstance("fqyX/* \"k.aig.gz");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      InstanceReader instanceReader0 = new InstanceReader((ISolver) null);
      try { 
        instanceReader0.parseInstance("http://fqyu/* \"3.aag");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      InstanceReader instanceReader0 = new InstanceReader((ISolver) null);
      instanceReader0.handleFileName(".aiP.aig", ".aiP.aig");
      try { 
        instanceReader0.parseInstance(".aiP.aig");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      InstanceReader instanceReader0 = new InstanceReader((ISolver) null);
      instanceReader0.handleFileName("S>H&l eqS ^r", "EZCNF");
      Reader reader0 = instanceReader0.handleFileName("EZCNF", "EZCNF");
      assertFalse(reader0.isUsingMapping());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      InstanceReader instanceReader0 = new InstanceReader((ISolver) null);
      // Undeclared exception!
      try { 
        instanceReader0.parseInstance((InputStream) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Use a domain specific Reader (LecteurDimacs, AIGReader, etc.) for stream input 
         //
         verifyException("org.sat4j.reader.InstanceReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator((ISolver) null, false);
      OptToSatAdapter optToSatAdapter0 = new OptToSatAdapter(maxSatDecorator0);
      InstanceReader instanceReader0 = new InstanceReader(optToSatAdapter0);
      // Undeclared exception!
      try { 
        instanceReader0.hasAMapping();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.reader.InstanceReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      InstanceReader instanceReader0 = new InstanceReader((ISolver) null);
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        instanceReader0.decode(intArray0, (PrintWriter) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.reader.InstanceReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      InstanceReader instanceReader0 = new InstanceReader((ISolver) null);
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        instanceReader0.decode(intArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.reader.InstanceReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      InstanceReader instanceReader0 = new InstanceReader((ISolver) null);
      // Undeclared exception!
      try { 
        instanceReader0.getMapping();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.reader.InstanceReader", e);
      }
  }
}