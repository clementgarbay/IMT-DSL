/**
 * generated by Xtext 2.12.0
 */
package fr.imta.clementdamien.dsl.selenium.mySelenium;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.clementdamien.dsl.selenium.mySelenium.Program#getFunctions <em>Functions</em>}</li>
 * </ul>
 *
 * @see fr.imta.clementdamien.dsl.selenium.mySelenium.MySeleniumPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject
{
  /**
   * Returns the value of the '<em><b>Functions</b></em>' containment reference list.
   * The list contents are of type {@link fr.imta.clementdamien.dsl.selenium.mySelenium.Function}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Functions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Functions</em>' containment reference list.
   * @see fr.imta.clementdamien.dsl.selenium.mySelenium.MySeleniumPackage#getProgram_Functions()
   * @model containment="true"
   * @generated
   */
  EList<Function> getFunctions();

} // Program
