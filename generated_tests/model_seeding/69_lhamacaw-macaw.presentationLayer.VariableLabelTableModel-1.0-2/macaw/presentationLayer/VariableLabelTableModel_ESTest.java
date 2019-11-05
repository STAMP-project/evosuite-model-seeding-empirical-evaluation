/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 05 13:17:17 GMT 2019
 */

package macaw.presentationLayer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import macaw.businessLayer.MacawCurationAPI;
import macaw.businessLayer.User;
import macaw.businessLayer.ValueLabel;
import macaw.businessLayer.Variable;
import macaw.presentationLayer.VariableLabelTableModel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class VariableLabelTableModel_ESTest extends VariableLabelTableModel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel((MacawCurationAPI) null, true);
      ValueLabel valueLabel0 = mock(ValueLabel.class, new ViolatedAssumptionAnswer());
      doReturn("macaw.presentationLayer.VariableLabelTableModel").when(valueLabel0).getLabel();
      doReturn(false).when(valueLabel0).isNewRecord();
      variableLabelTableModel0.addValueLabel(0, valueLabel0);
      variableLabelTableModel0.setValueAt("jhi^Vw[", 0, (-718));
      assertEquals(1, variableLabelTableModel0.getRowCount());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel((MacawCurationAPI) null, true);
      ValueLabel valueLabel0 = mock(ValueLabel.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(valueLabel0).isNewRecord();
      variableLabelTableModel0.addValueLabel(0, valueLabel0);
      ValueLabel valueLabel1 = new ValueLabel();
      // Undeclared exception!
      try { 
        variableLabelTableModel0.setValueAt(valueLabel1, 0, 1891);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // macaw.businessLayer.ValueLabel cannot be cast to java.lang.String
         //
         verifyException("macaw.presentationLayer.VariableLabelTableModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel((MacawCurationAPI) null, false);
      ValueLabel valueLabel0 = new ValueLabel();
      variableLabelTableModel0.addValueLabel(0, valueLabel0);
      variableLabelTableModel0.setValueAt((Object) null, 0, (-1812));
      assertEquals(1, VariableLabelTableModel.LABEL_COLUMN);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel((MacawCurationAPI) null, true);
      ValueLabel valueLabel0 = mock(ValueLabel.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(valueLabel0).isNewRecord();
      variableLabelTableModel0.addValueLabel(0, valueLabel0);
      ValueLabel valueLabel1 = new ValueLabel();
      // Undeclared exception!
      try { 
        variableLabelTableModel0.setValueAt(valueLabel1, 0, 1891);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // macaw.businessLayer.ValueLabel cannot be cast to java.lang.String
         //
         verifyException("macaw.presentationLayer.VariableLabelTableModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel((MacawCurationAPI) null, true);
      ValueLabel valueLabel0 = mock(ValueLabel.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(valueLabel0).isMissingValue();
      variableLabelTableModel0.addValueLabel(0, valueLabel0);
      Object object0 = variableLabelTableModel0.getValueAt(0, (-275));
      assertEquals(false, object0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel((MacawCurationAPI) null, true);
      String string0 = variableLabelTableModel0.getColumnName((-919));
      assertEquals("Is Missing Value", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel((MacawCurationAPI) null, true);
      ValueLabel valueLabel0 = mock(ValueLabel.class, new ViolatedAssumptionAnswer());
      variableLabelTableModel0.addValueLabel(0, valueLabel0);
      variableLabelTableModel0.deleteValueLabel(0);
      assertEquals(1, VariableLabelTableModel.LABEL_COLUMN);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel((MacawCurationAPI) null, true);
      boolean boolean0 = variableLabelTableModel0.isCellEditable(1201, 1201);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel((MacawCurationAPI) null, true);
      ValueLabel valueLabel0 = mock(ValueLabel.class, new ViolatedAssumptionAnswer());
      variableLabelTableModel0.addValueLabel(0, valueLabel0);
      int int0 = variableLabelTableModel0.getRowCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel((MacawCurationAPI) null, false);
      // Undeclared exception!
      try { 
        variableLabelTableModel0.setValueAt((Object) null, 2, 2);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel((MacawCurationAPI) null, false);
      ValueLabel valueLabel0 = new ValueLabel();
      variableLabelTableModel0.addValueLabel(0, valueLabel0);
      // Undeclared exception!
      try { 
        variableLabelTableModel0.setValueAt(valueLabel0, 0, 2);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // macaw.businessLayer.ValueLabel cannot be cast to java.lang.Boolean
         //
         verifyException("macaw.presentationLayer.VariableLabelTableModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel((MacawCurationAPI) null, false);
      // Undeclared exception!
      try { 
        variableLabelTableModel0.setValueAt((Object) null, (-536), (-536));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -536
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel((MacawCurationAPI) null, true);
      User user0 = new User();
      // Undeclared exception!
      try { 
        variableLabelTableModel0.setData(user0, (Variable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.presentationLayer.VariableLabelTableModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel((MacawCurationAPI) null, true);
      // Undeclared exception!
      try { 
        variableLabelTableModel0.getValueAt(0, (-4712));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel((MacawCurationAPI) null, true);
      // Undeclared exception!
      try { 
        variableLabelTableModel0.getValueAt((-1370), (-1370));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel((MacawCurationAPI) null, true);
      // Undeclared exception!
      try { 
        variableLabelTableModel0.deleteValueLabel((-1858));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel((MacawCurationAPI) null, false);
      ValueLabel valueLabel0 = new ValueLabel();
      // Undeclared exception!
      try { 
        variableLabelTableModel0.addValueLabel(2, valueLabel0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel((MacawCurationAPI) null, false);
      ValueLabel valueLabel0 = mock(ValueLabel.class, new ViolatedAssumptionAnswer());
      doReturn("VALUES (?, ?, ?, ?, ?, ?);").when(valueLabel0).getLabel();
      doReturn(false).when(valueLabel0).isNewRecord();
      variableLabelTableModel0.addValueLabel(0, valueLabel0);
      variableLabelTableModel0.setValueAt("jhi^Vw[", 0, 1);
      assertEquals(1, variableLabelTableModel0.getRowCount());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel((MacawCurationAPI) null, true);
      ValueLabel valueLabel0 = mock(ValueLabel.class, new ViolatedAssumptionAnswer());
      doReturn("?^y=NBw7K&(FnksQ?").when(valueLabel0).getValue();
      doReturn(false).when(valueLabel0).isNewRecord();
      variableLabelTableModel0.addValueLabel(0, valueLabel0);
      variableLabelTableModel0.setValueAt("?^y=NBw7K&(FnksQ?", 0, 0);
      assertEquals(0, VariableLabelTableModel.VALUE_COLUMN);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel((MacawCurationAPI) null, true);
      ValueLabel valueLabel0 = mock(ValueLabel.class, new ViolatedAssumptionAnswer());
      doReturn(")mQrl:P").when(valueLabel0).getLabel();
      doReturn(false).when(valueLabel0).isNewRecord();
      variableLabelTableModel0.addValueLabel(0, valueLabel0);
      variableLabelTableModel0.setValueAt(")mQrl:P", 0, 1);
      assertEquals(3, variableLabelTableModel0.getColumnCount());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel((MacawCurationAPI) null, false);
      ValueLabel valueLabel0 = new ValueLabel();
      ValueLabel.EditingOperationType valueLabel_EditingOperationType0 = ValueLabel.EditingOperationType.EDIT;
      valueLabel0.setEditingOperationType(valueLabel_EditingOperationType0);
      variableLabelTableModel0.addValueLabel(0, valueLabel0);
      // Undeclared exception!
      try { 
        variableLabelTableModel0.setValueAt((Object) null, 0, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.presentationLayer.VariableLabelTableModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel((MacawCurationAPI) null, false);
      ValueLabel valueLabel0 = new ValueLabel();
      variableLabelTableModel0.addValueLabel(0, valueLabel0);
      variableLabelTableModel0.setValueAt((Object) null, 0, 0);
      assertEquals(1, VariableLabelTableModel.LABEL_COLUMN);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel((MacawCurationAPI) null, false);
      ValueLabel valueLabel0 = mock(ValueLabel.class, new ViolatedAssumptionAnswer());
      doReturn("?^y=NBw7K&1FnksQ?").when(valueLabel0).getValue();
      doReturn(false, true).when(valueLabel0).isNewRecord();
      variableLabelTableModel0.addValueLabel(0, valueLabel0);
      variableLabelTableModel0.setValueAt("^PFkPlZ]oaJo", 0, 0);
      // Undeclared exception!
      try { 
        variableLabelTableModel0.setValueAt((Object) null, 0, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.presentationLayer.VariableLabelTableModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel((MacawCurationAPI) null, true);
      ValueLabel valueLabel0 = mock(ValueLabel.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(valueLabel0).isNewRecord();
      variableLabelTableModel0.addValueLabel(0, valueLabel0);
      variableLabelTableModel0.setValueAt((Object) null, 0, 1);
      assertEquals(1, variableLabelTableModel0.getRowCount());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel((MacawCurationAPI) null, false);
      ValueLabel valueLabel0 = mock(ValueLabel.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(valueLabel0).isMissingValue();
      doReturn(false).when(valueLabel0).isNewRecord();
      variableLabelTableModel0.addValueLabel(0, valueLabel0);
      Boolean boolean0 = new Boolean("");
      variableLabelTableModel0.setValueAt(boolean0, 0, 2);
      assertEquals(1, VariableLabelTableModel.LABEL_COLUMN);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel((MacawCurationAPI) null, true);
      ValueLabel valueLabel0 = mock(ValueLabel.class, new ViolatedAssumptionAnswer());
      doReturn("macaw.presentationLayer.VariableLabelTableModel").when(valueLabel0).getLabel();
      variableLabelTableModel0.addValueLabel(0, valueLabel0);
      Object object0 = variableLabelTableModel0.getValueAt(0, 1);
      assertEquals("macaw.presentationLayer.VariableLabelTableModel", object0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel((MacawCurationAPI) null, false);
      ValueLabel valueLabel0 = mock(ValueLabel.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(valueLabel0).getValue();
      variableLabelTableModel0.addValueLabel(0, valueLabel0);
      Object object0 = variableLabelTableModel0.getValueAt(0, 0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel((MacawCurationAPI) null, false);
      variableLabelTableModel0.findColumn("");
      assertEquals(3, variableLabelTableModel0.getColumnCount());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel((MacawCurationAPI) null, true);
      Class class0 = variableLabelTableModel0.getColumnClass((-1));
      assertEquals("class java.lang.Boolean", class0.toString());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel((MacawCurationAPI) null, false);
      Class class0 = variableLabelTableModel0.getColumnClass(0);
      assertEquals("class java.lang.String", class0.toString());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel((MacawCurationAPI) null, false);
      Class class0 = variableLabelTableModel0.getColumnClass(1);
      assertEquals("class java.lang.String", class0.toString());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel((MacawCurationAPI) null, true);
      ValueLabel valueLabel0 = mock(ValueLabel.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(valueLabel0).isNewRecord();
      variableLabelTableModel0.addValueLabel(0, valueLabel0);
      // Undeclared exception!
      try { 
        variableLabelTableModel0.save();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.presentationLayer.VariableLabelTableModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel((MacawCurationAPI) null, false);
      ValueLabel valueLabel0 = mock(ValueLabel.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(valueLabel0).isNewRecord();
      variableLabelTableModel0.addValueLabel(0, valueLabel0);
      // Undeclared exception!
      try { 
        variableLabelTableModel0.save();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.presentationLayer.VariableLabelTableModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel((MacawCurationAPI) null, false);
      int int0 = variableLabelTableModel0.getRowCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel((MacawCurationAPI) null, false);
      ValueLabel valueLabel0 = mock(ValueLabel.class, new ViolatedAssumptionAnswer());
      variableLabelTableModel0.addValueLabel(0, valueLabel0);
      ValueLabel valueLabel1 = new ValueLabel();
      variableLabelTableModel0.addValueLabel(1, valueLabel1);
      variableLabelTableModel0.deleteValueLabel(1);
      assertEquals(1, variableLabelTableModel0.getRowCount());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel((MacawCurationAPI) null, false);
      ArrayList<ValueLabel> arrayList0 = variableLabelTableModel0.getData();
      assertEquals(0, arrayList0.size());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel((MacawCurationAPI) null, false);
      boolean boolean0 = variableLabelTableModel0.isCellEditable((-3122), 2722);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel((MacawCurationAPI) null, false);
      // Undeclared exception!
      try { 
        variableLabelTableModel0.deleteValueLabel(1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel((MacawCurationAPI) null, true);
      int int0 = variableLabelTableModel0.getColumnCount();
      assertEquals(3, int0);
  }
}
