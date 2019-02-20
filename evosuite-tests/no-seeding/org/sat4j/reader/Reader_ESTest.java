/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 18 01:25:49 GMT 2019
 */

package org.sat4j.reader;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PrintWriter;
import java.io.PushbackInputStream;
import java.net.MalformedURLException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import org.sat4j.LightFactory;
import org.sat4j.opt.MaxSatDecorator;
import org.sat4j.reader.AAGReader;
import org.sat4j.reader.DimacsReader;
import org.sat4j.reader.GroupedCNFReader;
import org.sat4j.reader.InstanceReader;
import org.sat4j.reader.JSONReader;
import org.sat4j.reader.LecteurDimacs;
import org.sat4j.reader.Reader;
import org.sat4j.specs.IGroupSolver;
import org.sat4j.specs.ISolver;
import org.sat4j.tools.DimacsOutputSolver;
import org.sat4j.tools.DimacsStringSolver;
import org.sat4j.tools.GateTranslator;
import org.sat4j.tools.LexicoDecorator;
import org.sat4j.tools.StatisticsSolver;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Reader_ESTest extends Reader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      InstanceReader instanceReader0 = new InstanceReader((ISolver) null);
      // Undeclared exception!
      try { 
        instanceReader0.parseInstance((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.reader.InstanceReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("org.sat4j.reader.Reader");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, ")5f7");
      InstanceReader instanceReader0 = new InstanceReader((ISolver) null);
      // Undeclared exception!
      try { 
        instanceReader0.parseInstance("org.sat4j.reader.Reader");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.reader.LecteurDimacs", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      GroupedCNFReader groupedCNFReader0 = new GroupedCNFReader(dimacsStringSolver0);
      PipedInputStream pipedInputStream0 = new PipedInputStream(1032);
      try { 
        groupedCNFReader0.parseInstance((InputStream) pipedInputStream0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // java.io.IOException: Pipe not connected
         //
         verifyException("org.sat4j.reader.DimacsReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("bnzi:2 -c ");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "`");
      InputStream inputStream0 = Reader.getInputStreamFromFilename("bnzi:2 -c ");
      MockFile mockFile0 = new MockFile("bnzi:2 -c ");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFileOutputStream0, false);
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver(mockPrintWriter0);
      AAGReader aAGReader0 = new AAGReader(dimacsOutputSolver0);
      // Undeclared exception!
      aAGReader0.parseInstance(inputStream0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("org.sat4j.reader.Reader");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, ")5f7");
      InputStream inputStream0 = Reader.getInputStreamFromFilename("org.sat4j.reader.Reader");
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator((ISolver) null);
      LexicoDecorator<MaxSatDecorator> lexicoDecorator0 = new LexicoDecorator<MaxSatDecorator>(maxSatDecorator0);
      DimacsReader dimacsReader0 = new DimacsReader(lexicoDecorator0);
      InstanceReader instanceReader0 = new InstanceReader(lexicoDecorator0, dimacsReader0);
      // Undeclared exception!
      try { 
        instanceReader0.parseInstance(inputStream0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Use a domain specific Reader (LecteurDimacs, AIGReader, etc.) for stream input 
         //
         verifyException("org.sat4j.reader.InstanceReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MaxSatDecorator[] maxSatDecoratorArray0 = new MaxSatDecorator[1];
      JSONReader<MaxSatDecorator> jSONReader0 = new JSONReader<MaxSatDecorator>(maxSatDecoratorArray0[0]);
      // Undeclared exception!
      try { 
        jSONReader0.parseInstance((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      AAGReader aAGReader0 = new AAGReader(dimacsStringSolver0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) null, 13);
      try { 
        aAGReader0.parseInstance((InputStream) pushbackInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.PushbackInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StatisticsSolver statisticsSolver0 = new StatisticsSolver();
      InstanceReader instanceReader0 = new InstanceReader(statisticsSolver0);
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
  public void test08()  throws Throwable  {
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

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      try { 
        Reader.getInputStreamFromFilename("http://bnzi:2 -c ");
        fail("Expecting exception: MalformedURLException");
      
      } catch(MalformedURLException e) {
         //
         // For input string: \"2 -c\"
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        Reader.getInputStreamFromFilename((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver(231);
      GroupedCNFReader groupedCNFReader0 = new GroupedCNFReader(dimacsStringSolver0);
      int[] intArray0 = new int[3];
      // Undeclared exception!
      try { 
        groupedCNFReader0.decode(intArray0, (PrintWriter) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.reader.DimacsReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StatisticsSolver statisticsSolver0 = new StatisticsSolver();
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(statisticsSolver0, true);
      InstanceReader instanceReader0 = new InstanceReader(maxSatDecorator0);
      int[] intArray0 = new int[7];
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
  public void test13()  throws Throwable  {
      try { 
        Reader.getInputStreamFromFilename("http://bnzip2 -c ");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Could not find: bnzip2 -c
         //
         verifyException("org.evosuite.runtime.mock.java.net.EvoHttpURLConnection", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      try { 
        Reader.getInputStreamFromFilename("x`C]s");
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
      LecteurDimacs lecteurDimacs0 = new LecteurDimacs((ISolver) null);
      try { 
        lecteurDimacs0.parseInstance("http://|T}PIi2!j");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Could not find: |T}PIi2!j
         //
         verifyException("org.evosuite.runtime.mock.java.net.EvoHttpURLConnection", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("dttp8//");
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver(mockPrintWriter0);
      GroupedCNFReader groupedCNFReader0 = new GroupedCNFReader(dimacsOutputSolver0);
      try { 
        groupedCNFReader0.parseInstance("dttp8//");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parsing Errorproblem line expected (p gcnf ...)
         //
         verifyException("org.sat4j.reader.GroupedCNFReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      InstanceReader instanceReader0 = new InstanceReader((ISolver) null);
      try { 
        instanceReader0.parseInstance("org.sat4j.reader.Reader");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GroupedCNFReader groupedCNFReader0 = new GroupedCNFReader((IGroupSolver) null);
      assertFalse(groupedCNFReader0.isVerbose());
      
      groupedCNFReader0.setVerbosity(true);
      boolean boolean0 = groupedCNFReader0.isVerbose();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      GroupedCNFReader groupedCNFReader0 = new GroupedCNFReader((IGroupSolver) null);
      boolean boolean0 = groupedCNFReader0.isVerbose();
      assertFalse(boolean0);
      assertFalse(groupedCNFReader0.isUsingMapping());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      InstanceReader instanceReader0 = new InstanceReader((ISolver) null);
      // Undeclared exception!
      try { 
        instanceReader0.parseInstance((java.io.Reader) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Use #parseInstance(InputStream) instead
         //
         verifyException("org.sat4j.reader.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      InstanceReader instanceReader0 = new InstanceReader((ISolver) null);
      instanceReader0.setUseMapping(false);
      assertFalse(instanceReader0.isUsingMapping());
      assertFalse(instanceReader0.isVerbose());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      GroupedCNFReader groupedCNFReader0 = new GroupedCNFReader(dimacsOutputSolver0);
      boolean boolean0 = groupedCNFReader0.hasAMapping();
      assertFalse(groupedCNFReader0.isUsingMapping());
      assertFalse(boolean0);
      assertFalse(groupedCNFReader0.isVerbose());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      DimacsReader dimacsReader0 = new DimacsReader(dimacsStringSolver0);
      boolean boolean0 = dimacsReader0.isUsingMapping();
      assertFalse(dimacsReader0.isVerbose());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LightFactory lightFactory0 = LightFactory.instance();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      GateTranslator gateTranslator0 = new GateTranslator(iSolver0);
      AAGReader aAGReader0 = new AAGReader(gateTranslator0);
      aAGReader0.getMapping();
      assertFalse(aAGReader0.isUsingMapping());
      assertFalse(aAGReader0.isVerbose());
  }
}