/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 06 13:12:52 GMT 2019
 */

package jaw.gui;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import jaw.gui.ProcessarEntidadesTabela;
import jaw.metamodelo.Atributo;
import jaw.metamodelo.Entidade;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ProcessarEntidadesTabela_ESTest extends ProcessarEntidadesTabela_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ProcessarEntidadesTabela processarEntidadesTabela0 = new ProcessarEntidadesTabela();
      processarEntidadesTabela0.setEntidadeSelecionada(124);
      Atributo atributo0 = new Atributo();
      // Undeclared exception!
      try { 
        processarEntidadesTabela0.setAtributo(atributo0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 124
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ProcessarEntidadesTabela processarEntidadesTabela0 = new ProcessarEntidadesTabela();
      Entidade entidade0 = new Entidade("bkMod3H2lO*)8*~1$");
      LinkedList<Entidade> linkedList0 = new LinkedList<Entidade>();
      linkedList0.add(entidade0);
      linkedList0.add(entidade0);
      processarEntidadesTabela0.carregarEntidades(linkedList0);
      assertEquals("Novo Projeto", processarEntidadesTabela0.getNomeArquivoSalvo());
      assertEquals((-1), processarEntidadesTabela0.getAtributoSelecionado());
      assertEquals((-1), processarEntidadesTabela0.getEntidadeSelecionada());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ProcessarEntidadesTabela processarEntidadesTabela0 = new ProcessarEntidadesTabela();
      Vector<Entidade> vector0 = new Vector<Entidade>();
      processarEntidadesTabela0.carregarEntidades(vector0);
      Atributo atributo0 = new Atributo();
      Entidade entidade0 = atributo0.getEntidade();
      vector0.add(entidade0);
      processarEntidadesTabela0.getEntidades();
      assertEquals((-1), processarEntidadesTabela0.getEntidadeSelecionada());
      assertEquals("Novo Projeto", processarEntidadesTabela0.getNomeArquivoSalvo());
      assertEquals((-1), processarEntidadesTabela0.getAtributoSelecionado());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ProcessarEntidadesTabela processarEntidadesTabela0 = new ProcessarEntidadesTabela();
      processarEntidadesTabela0.setAtributoSelecionado(420);
      int int0 = processarEntidadesTabela0.getAtributoSelecionado();
      assertEquals(420, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ProcessarEntidadesTabela processarEntidadesTabela0 = new ProcessarEntidadesTabela();
      // Undeclared exception!
      try { 
        processarEntidadesTabela0.setEntidades((List<Entidade>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ProcessarEntidadesTabela processarEntidadesTabela0 = new ProcessarEntidadesTabela();
      // Undeclared exception!
      try { 
        processarEntidadesTabela0.listarAtributos();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ProcessarEntidadesTabela processarEntidadesTabela0 = new ProcessarEntidadesTabela();
      // Undeclared exception!
      try { 
        processarEntidadesTabela0.carregarEntidades((List<Entidade>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ProcessarEntidadesTabela processarEntidadesTabela0 = new ProcessarEntidadesTabela();
      LinkedList<Entidade> linkedList0 = new LinkedList<Entidade>();
      processarEntidadesTabela0.setEntidades(linkedList0);
      // Undeclared exception!
      try { 
        processarEntidadesTabela0.listarAtributos();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -1, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ProcessarEntidadesTabela processarEntidadesTabela0 = new ProcessarEntidadesTabela();
      List<Entidade> list0 = processarEntidadesTabela0.getEntidades();
      LinkedList<Entidade> linkedList0 = new LinkedList<Entidade>(list0);
      processarEntidadesTabela0.setEntidades(linkedList0);
      // Undeclared exception!
      try { 
        processarEntidadesTabela0.setAtributo((Atributo) null);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -1, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ProcessarEntidadesTabela processarEntidadesTabela0 = new ProcessarEntidadesTabela();
      LinkedList<Entidade> linkedList0 = new LinkedList<Entidade>();
      Entidade entidade0 = new Entidade("bkMod3H2lO*)8*~1$");
      linkedList0.add(entidade0);
      processarEntidadesTabela0.carregarEntidades(linkedList0);
      processarEntidadesTabela0.atualizarEntidades();
      assertEquals("Novo Projeto", processarEntidadesTabela0.getNomeArquivoSalvo());
      assertEquals((-1), processarEntidadesTabela0.getEntidadeSelecionada());
      assertEquals((-1), processarEntidadesTabela0.getAtributoSelecionado());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ProcessarEntidadesTabela processarEntidadesTabela0 = new ProcessarEntidadesTabela();
      processarEntidadesTabela0.removerEntidades();
      assertEquals("Novo Projeto", processarEntidadesTabela0.getNomeArquivoSalvo());
      assertEquals((-1), processarEntidadesTabela0.getEntidadeSelecionada());
      assertEquals((-1), processarEntidadesTabela0.getAtributoSelecionado());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ProcessarEntidadesTabela processarEntidadesTabela0 = new ProcessarEntidadesTabela();
      processarEntidadesTabela0.selecionarEntidades();
      assertEquals((-1), processarEntidadesTabela0.getAtributoSelecionado());
      assertEquals((-1), processarEntidadesTabela0.getEntidadeSelecionada());
      assertEquals("Novo Projeto", processarEntidadesTabela0.getNomeArquivoSalvo());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ProcessarEntidadesTabela processarEntidadesTabela0 = new ProcessarEntidadesTabela();
      processarEntidadesTabela0.setNomeArquivoSalvo("Jaw - Entidades");
      assertEquals("Jaw - Entidades", processarEntidadesTabela0.getNomeArquivoSalvo());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ProcessarEntidadesTabela processarEntidadesTabela0 = new ProcessarEntidadesTabela();
      String string0 = processarEntidadesTabela0.getNomeArquivoSalvo();
      assertEquals((-1), processarEntidadesTabela0.getAtributoSelecionado());
      assertEquals("Novo Projeto", string0);
      assertEquals((-1), processarEntidadesTabela0.getEntidadeSelecionada());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ProcessarEntidadesTabela processarEntidadesTabela0 = new ProcessarEntidadesTabela();
      processarEntidadesTabela0.resetAtributos();
      assertEquals((-1), processarEntidadesTabela0.getAtributoSelecionado());
      assertEquals((-1), processarEntidadesTabela0.getEntidadeSelecionada());
      assertEquals("Novo Projeto", processarEntidadesTabela0.getNomeArquivoSalvo());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ProcessarEntidadesTabela processarEntidadesTabela0 = new ProcessarEntidadesTabela();
      processarEntidadesTabela0.getAtributo();
      assertEquals("Novo Projeto", processarEntidadesTabela0.getNomeArquivoSalvo());
      assertEquals((-1), processarEntidadesTabela0.getEntidadeSelecionada());
      assertEquals((-1), processarEntidadesTabela0.getAtributoSelecionado());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ProcessarEntidadesTabela processarEntidadesTabela0 = new ProcessarEntidadesTabela();
      int int0 = processarEntidadesTabela0.getAtributoSelecionado();
      assertEquals((-1), int0);
      assertEquals((-1), processarEntidadesTabela0.getEntidadeSelecionada());
      assertEquals("Novo Projeto", processarEntidadesTabela0.getNomeArquivoSalvo());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ProcessarEntidadesTabela processarEntidadesTabela0 = new ProcessarEntidadesTabela();
      assertEquals((-1), processarEntidadesTabela0.getEntidadeSelecionada());
      
      processarEntidadesTabela0.setEntidadeSelecionada(32);
      int int0 = processarEntidadesTabela0.getEntidadeSelecionada();
      assertEquals(32, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ProcessarEntidadesTabela processarEntidadesTabela0 = new ProcessarEntidadesTabela();
      int int0 = processarEntidadesTabela0.getEntidadeSelecionada();
      assertEquals((-1), int0);
      assertEquals((-1), processarEntidadesTabela0.getAtributoSelecionado());
      assertEquals("Novo Projeto", processarEntidadesTabela0.getNomeArquivoSalvo());
  }
}
