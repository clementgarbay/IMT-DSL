/**
 * generated by Xtext 2.12.0
 */
package fr.imta.clementdamien.dsl.selenium.mySelenium.impl;

import fr.imta.clementdamien.dsl.selenium.mySelenium.MySeleniumPackage;
import fr.imta.clementdamien.dsl.selenium.mySelenium.OneParameterAction;
import fr.imta.clementdamien.dsl.selenium.mySelenium.Selector;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>One Parameter Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.clementdamien.dsl.selenium.mySelenium.impl.OneParameterActionImpl#getAction <em>Action</em>}</li>
 *   <li>{@link fr.imta.clementdamien.dsl.selenium.mySelenium.impl.OneParameterActionImpl#getSelector <em>Selector</em>}</li>
 *   <li>{@link fr.imta.clementdamien.dsl.selenium.mySelenium.impl.OneParameterActionImpl#getSelectorParameter <em>Selector Parameter</em>}</li>
 *   <li>{@link fr.imta.clementdamien.dsl.selenium.mySelenium.impl.OneParameterActionImpl#getStringParameter <em>String Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OneParameterActionImpl extends StatementImpl implements OneParameterAction
{
  /**
   * The default value of the '{@link #getAction() <em>Action</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAction()
   * @generated
   * @ordered
   */
  protected static final String ACTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAction() <em>Action</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAction()
   * @generated
   * @ordered
   */
  protected String action = ACTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getSelector() <em>Selector</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelector()
   * @generated
   * @ordered
   */
  protected Selector selector;

  /**
   * The cached value of the '{@link #getSelectorParameter() <em>Selector Parameter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelectorParameter()
   * @generated
   * @ordered
   */
  protected Selector selectorParameter;

  /**
   * The default value of the '{@link #getStringParameter() <em>String Parameter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStringParameter()
   * @generated
   * @ordered
   */
  protected static final String STRING_PARAMETER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStringParameter() <em>String Parameter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStringParameter()
   * @generated
   * @ordered
   */
  protected String stringParameter = STRING_PARAMETER_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OneParameterActionImpl()
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
    return MySeleniumPackage.Literals.ONE_PARAMETER_ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAction()
  {
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAction(String newAction)
  {
    String oldAction = action;
    action = newAction;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MySeleniumPackage.ONE_PARAMETER_ACTION__ACTION, oldAction, action));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Selector getSelector()
  {
    return selector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSelector(Selector newSelector, NotificationChain msgs)
  {
    Selector oldSelector = selector;
    selector = newSelector;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MySeleniumPackage.ONE_PARAMETER_ACTION__SELECTOR, oldSelector, newSelector);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSelector(Selector newSelector)
  {
    if (newSelector != selector)
    {
      NotificationChain msgs = null;
      if (selector != null)
        msgs = ((InternalEObject)selector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MySeleniumPackage.ONE_PARAMETER_ACTION__SELECTOR, null, msgs);
      if (newSelector != null)
        msgs = ((InternalEObject)newSelector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MySeleniumPackage.ONE_PARAMETER_ACTION__SELECTOR, null, msgs);
      msgs = basicSetSelector(newSelector, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MySeleniumPackage.ONE_PARAMETER_ACTION__SELECTOR, newSelector, newSelector));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Selector getSelectorParameter()
  {
    return selectorParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSelectorParameter(Selector newSelectorParameter, NotificationChain msgs)
  {
    Selector oldSelectorParameter = selectorParameter;
    selectorParameter = newSelectorParameter;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MySeleniumPackage.ONE_PARAMETER_ACTION__SELECTOR_PARAMETER, oldSelectorParameter, newSelectorParameter);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSelectorParameter(Selector newSelectorParameter)
  {
    if (newSelectorParameter != selectorParameter)
    {
      NotificationChain msgs = null;
      if (selectorParameter != null)
        msgs = ((InternalEObject)selectorParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MySeleniumPackage.ONE_PARAMETER_ACTION__SELECTOR_PARAMETER, null, msgs);
      if (newSelectorParameter != null)
        msgs = ((InternalEObject)newSelectorParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MySeleniumPackage.ONE_PARAMETER_ACTION__SELECTOR_PARAMETER, null, msgs);
      msgs = basicSetSelectorParameter(newSelectorParameter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MySeleniumPackage.ONE_PARAMETER_ACTION__SELECTOR_PARAMETER, newSelectorParameter, newSelectorParameter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStringParameter()
  {
    return stringParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStringParameter(String newStringParameter)
  {
    String oldStringParameter = stringParameter;
    stringParameter = newStringParameter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MySeleniumPackage.ONE_PARAMETER_ACTION__STRING_PARAMETER, oldStringParameter, stringParameter));
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
      case MySeleniumPackage.ONE_PARAMETER_ACTION__SELECTOR:
        return basicSetSelector(null, msgs);
      case MySeleniumPackage.ONE_PARAMETER_ACTION__SELECTOR_PARAMETER:
        return basicSetSelectorParameter(null, msgs);
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
      case MySeleniumPackage.ONE_PARAMETER_ACTION__ACTION:
        return getAction();
      case MySeleniumPackage.ONE_PARAMETER_ACTION__SELECTOR:
        return getSelector();
      case MySeleniumPackage.ONE_PARAMETER_ACTION__SELECTOR_PARAMETER:
        return getSelectorParameter();
      case MySeleniumPackage.ONE_PARAMETER_ACTION__STRING_PARAMETER:
        return getStringParameter();
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
      case MySeleniumPackage.ONE_PARAMETER_ACTION__ACTION:
        setAction((String)newValue);
        return;
      case MySeleniumPackage.ONE_PARAMETER_ACTION__SELECTOR:
        setSelector((Selector)newValue);
        return;
      case MySeleniumPackage.ONE_PARAMETER_ACTION__SELECTOR_PARAMETER:
        setSelectorParameter((Selector)newValue);
        return;
      case MySeleniumPackage.ONE_PARAMETER_ACTION__STRING_PARAMETER:
        setStringParameter((String)newValue);
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
      case MySeleniumPackage.ONE_PARAMETER_ACTION__ACTION:
        setAction(ACTION_EDEFAULT);
        return;
      case MySeleniumPackage.ONE_PARAMETER_ACTION__SELECTOR:
        setSelector((Selector)null);
        return;
      case MySeleniumPackage.ONE_PARAMETER_ACTION__SELECTOR_PARAMETER:
        setSelectorParameter((Selector)null);
        return;
      case MySeleniumPackage.ONE_PARAMETER_ACTION__STRING_PARAMETER:
        setStringParameter(STRING_PARAMETER_EDEFAULT);
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
      case MySeleniumPackage.ONE_PARAMETER_ACTION__ACTION:
        return ACTION_EDEFAULT == null ? action != null : !ACTION_EDEFAULT.equals(action);
      case MySeleniumPackage.ONE_PARAMETER_ACTION__SELECTOR:
        return selector != null;
      case MySeleniumPackage.ONE_PARAMETER_ACTION__SELECTOR_PARAMETER:
        return selectorParameter != null;
      case MySeleniumPackage.ONE_PARAMETER_ACTION__STRING_PARAMETER:
        return STRING_PARAMETER_EDEFAULT == null ? stringParameter != null : !STRING_PARAMETER_EDEFAULT.equals(stringParameter);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (action: ");
    result.append(action);
    result.append(", stringParameter: ");
    result.append(stringParameter);
    result.append(')');
    return result.toString();
  }

} //OneParameterActionImpl
