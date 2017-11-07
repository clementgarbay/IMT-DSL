/**
 * generated by Xtext 2.12.0
 */
package fr.imta.clementdamien.dsl.selenium.mySelenium.impl;

import fr.imta.clementdamien.dsl.selenium.mySelenium.Functions;
import fr.imta.clementdamien.dsl.selenium.mySelenium.MySeleniumPackage;
import fr.imta.clementdamien.dsl.selenium.mySelenium.Program;
import fr.imta.clementdamien.dsl.selenium.mySelenium.Statements;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.clementdamien.dsl.selenium.mySelenium.impl.ProgramImpl#getFunctions <em>Functions</em>}</li>
 *   <li>{@link fr.imta.clementdamien.dsl.selenium.mySelenium.impl.ProgramImpl#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramImpl extends MinimalEObjectImpl.Container implements Program
{
  /**
   * The cached value of the '{@link #getFunctions() <em>Functions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctions()
   * @generated
   * @ordered
   */
  protected Functions functions;

  /**
   * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatements()
   * @generated
   * @ordered
   */
  protected Statements statements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProgramImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MySeleniumPackage.Literals.PROGRAM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Functions getFunctions()
  {
    return functions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFunctions(Functions newFunctions, NotificationChain msgs)
  {
    Functions oldFunctions = functions;
    functions = newFunctions;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MySeleniumPackage.PROGRAM__FUNCTIONS, oldFunctions, newFunctions);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunctions(Functions newFunctions)
  {
    if (newFunctions != functions)
    {
      NotificationChain msgs = null;
      if (functions != null)
        msgs = ((InternalEObject)functions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MySeleniumPackage.PROGRAM__FUNCTIONS, null, msgs);
      if (newFunctions != null)
        msgs = ((InternalEObject)newFunctions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MySeleniumPackage.PROGRAM__FUNCTIONS, null, msgs);
      msgs = basicSetFunctions(newFunctions, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MySeleniumPackage.PROGRAM__FUNCTIONS, newFunctions, newFunctions));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statements getStatements()
  {
    return statements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStatements(Statements newStatements, NotificationChain msgs)
  {
    Statements oldStatements = statements;
    statements = newStatements;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MySeleniumPackage.PROGRAM__STATEMENTS, oldStatements, newStatements);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatements(Statements newStatements)
  {
    if (newStatements != statements)
    {
      NotificationChain msgs = null;
      if (statements != null)
        msgs = ((InternalEObject)statements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MySeleniumPackage.PROGRAM__STATEMENTS, null, msgs);
      if (newStatements != null)
        msgs = ((InternalEObject)newStatements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MySeleniumPackage.PROGRAM__STATEMENTS, null, msgs);
      msgs = basicSetStatements(newStatements, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MySeleniumPackage.PROGRAM__STATEMENTS, newStatements, newStatements));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MySeleniumPackage.PROGRAM__FUNCTIONS:
        return basicSetFunctions(null, msgs);
      case MySeleniumPackage.PROGRAM__STATEMENTS:
        return basicSetStatements(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MySeleniumPackage.PROGRAM__FUNCTIONS:
        return getFunctions();
      case MySeleniumPackage.PROGRAM__STATEMENTS:
        return getStatements();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MySeleniumPackage.PROGRAM__FUNCTIONS:
        setFunctions((Functions)newValue);
        return;
      case MySeleniumPackage.PROGRAM__STATEMENTS:
        setStatements((Statements)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MySeleniumPackage.PROGRAM__FUNCTIONS:
        setFunctions((Functions)null);
        return;
      case MySeleniumPackage.PROGRAM__STATEMENTS:
        setStatements((Statements)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MySeleniumPackage.PROGRAM__FUNCTIONS:
        return functions != null;
      case MySeleniumPackage.PROGRAM__STATEMENTS:
        return statements != null;
    }
    return super.eIsSet(featureID);
  }

} //ProgramImpl
