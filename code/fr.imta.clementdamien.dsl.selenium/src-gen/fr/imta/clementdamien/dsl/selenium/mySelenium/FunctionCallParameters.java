/**
 * generated by Xtext 2.12.0
 */
package fr.imta.clementdamien.dsl.selenium.mySelenium;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Call Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.clementdamien.dsl.selenium.mySelenium.FunctionCallParameters#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @see fr.imta.clementdamien.dsl.selenium.mySelenium.MySeleniumPackage#getFunctionCallParameters()
 * @model
 * @generated
 */
public interface FunctionCallParameters extends EObject
{
  /**
   * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
   * The list contents are of type {@link fr.imta.clementdamien.dsl.selenium.mySelenium.VariableCall}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variables</em>' containment reference list.
   * @see fr.imta.clementdamien.dsl.selenium.mySelenium.MySeleniumPackage#getFunctionCallParameters_Variables()
   * @model containment="true"
   * @generated
   */
  EList<VariableCall> getVariables();

} // FunctionCallParameters
