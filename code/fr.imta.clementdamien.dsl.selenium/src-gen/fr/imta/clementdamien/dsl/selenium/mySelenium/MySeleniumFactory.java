/**
 * generated by Xtext 2.12.0
 */
package fr.imta.clementdamien.dsl.selenium.mySelenium;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.imta.clementdamien.dsl.selenium.mySelenium.MySeleniumPackage
 * @generated
 */
public interface MySeleniumFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MySeleniumFactory eINSTANCE = fr.imta.clementdamien.dsl.selenium.mySelenium.impl.MySeleniumFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Program</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Program</em>'.
   * @generated
   */
  Program createProgram();

  /**
   * Returns a new object of class '<em>Functions</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Functions</em>'.
   * @generated
   */
  Functions createFunctions();

  /**
   * Returns a new object of class '<em>Statements</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statements</em>'.
   * @generated
   */
  Statements createStatements();

  /**
   * Returns a new object of class '<em>Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function</em>'.
   * @generated
   */
  Function createFunction();

  /**
   * Returns a new object of class '<em>Function Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Name</em>'.
   * @generated
   */
  FunctionName createFunctionName();

  /**
   * Returns a new object of class '<em>Function Call</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Call</em>'.
   * @generated
   */
  FunctionCall createFunctionCall();

  /**
   * Returns a new object of class '<em>Projection</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Projection</em>'.
   * @generated
   */
  Projection createProjection();

  /**
   * Returns a new object of class '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statement</em>'.
   * @generated
   */
  Statement createStatement();

  /**
   * Returns a new object of class '<em>Assert Equals</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assert Equals</em>'.
   * @generated
   */
  AssertEquals createAssertEquals();

  /**
   * Returns a new object of class '<em>Assert Contains</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assert Contains</em>'.
   * @generated
   */
  AssertContains createAssertContains();

  /**
   * Returns a new object of class '<em>Assertable Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assertable Element</em>'.
   * @generated
   */
  AssertableElement createAssertableElement();

  /**
   * Returns a new object of class '<em>Navigation Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Navigation Action</em>'.
   * @generated
   */
  NavigationAction createNavigationAction();

  /**
   * Returns a new object of class '<em>One Parameter Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>One Parameter Action</em>'.
   * @generated
   */
  OneParameterAction createOneParameterAction();

  /**
   * Returns a new object of class '<em>Two Parameters Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Two Parameters Action</em>'.
   * @generated
   */
  TwoParametersAction createTwoParametersAction();

  /**
   * Returns a new object of class '<em>Selector</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Selector</em>'.
   * @generated
   */
  Selector createSelector();

  /**
   * Returns a new object of class '<em>Attributes</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attributes</em>'.
   * @generated
   */
  Attributes createAttributes();

  /**
   * Returns a new object of class '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute</em>'.
   * @generated
   */
  Attribute createAttribute();

  /**
   * Returns a new object of class '<em>Function Parameters</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Parameters</em>'.
   * @generated
   */
  FunctionParameters createFunctionParameters();

  /**
   * Returns a new object of class '<em>Function Call Parameters</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Call Parameters</em>'.
   * @generated
   */
  FunctionCallParameters createFunctionCallParameters();

  /**
   * Returns a new object of class '<em>Variable Call</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Call</em>'.
   * @generated
   */
  VariableCall createVariableCall();

  /**
   * Returns a new object of class '<em>Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable</em>'.
   * @generated
   */
  Variable createVariable();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MySeleniumPackage getMySeleniumPackage();

} //MySeleniumFactory