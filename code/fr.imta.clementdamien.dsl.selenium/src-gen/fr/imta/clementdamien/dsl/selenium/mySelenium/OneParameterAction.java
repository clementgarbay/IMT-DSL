/**
 * generated by Xtext 2.12.0
 */
package fr.imta.clementdamien.dsl.selenium.mySelenium;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>One Parameter Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.clementdamien.dsl.selenium.mySelenium.OneParameterAction#getAction <em>Action</em>}</li>
 *   <li>{@link fr.imta.clementdamien.dsl.selenium.mySelenium.OneParameterAction#getSelector <em>Selector</em>}</li>
 * </ul>
 *
 * @see fr.imta.clementdamien.dsl.selenium.mySelenium.MySeleniumPackage#getOneParameterAction()
 * @model
 * @generated
 */
public interface OneParameterAction extends Statement
{
  /**
   * Returns the value of the '<em><b>Action</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' attribute.
   * @see #setAction(String)
   * @see fr.imta.clementdamien.dsl.selenium.mySelenium.MySeleniumPackage#getOneParameterAction_Action()
   * @model
   * @generated
   */
  String getAction();

  /**
   * Sets the value of the '{@link fr.imta.clementdamien.dsl.selenium.mySelenium.OneParameterAction#getAction <em>Action</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action</em>' attribute.
   * @see #getAction()
   * @generated
   */
  void setAction(String value);

  /**
   * Returns the value of the '<em><b>Selector</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Selector</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Selector</em>' containment reference.
   * @see #setSelector(Selector)
   * @see fr.imta.clementdamien.dsl.selenium.mySelenium.MySeleniumPackage#getOneParameterAction_Selector()
   * @model containment="true"
   * @generated
   */
  Selector getSelector();

  /**
   * Sets the value of the '{@link fr.imta.clementdamien.dsl.selenium.mySelenium.OneParameterAction#getSelector <em>Selector</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Selector</em>' containment reference.
   * @see #getSelector()
   * @generated
   */
  void setSelector(Selector value);

} // OneParameterAction
