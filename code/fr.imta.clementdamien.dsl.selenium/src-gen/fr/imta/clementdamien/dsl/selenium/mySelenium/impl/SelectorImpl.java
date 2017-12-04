/**
 * generated by Xtext 2.12.0
 */
package fr.imta.clementdamien.dsl.selenium.mySelenium.impl;

import fr.imta.clementdamien.dsl.selenium.mySelenium.Attributes;
import fr.imta.clementdamien.dsl.selenium.mySelenium.MySeleniumPackage;
import fr.imta.clementdamien.dsl.selenium.mySelenium.Parent;
import fr.imta.clementdamien.dsl.selenium.mySelenium.Selector;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Selector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.clementdamien.dsl.selenium.mySelenium.impl.SelectorImpl#getElement <em>Element</em>}</li>
 *   <li>{@link fr.imta.clementdamien.dsl.selenium.mySelenium.impl.SelectorImpl#getAttrs <em>Attrs</em>}</li>
 *   <li>{@link fr.imta.clementdamien.dsl.selenium.mySelenium.impl.SelectorImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link fr.imta.clementdamien.dsl.selenium.mySelenium.impl.SelectorImpl#isAll <em>All</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelectorImpl extends ActionTargetImpl implements Selector
{
  /**
   * The default value of the '{@link #getElement() <em>Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElement()
   * @generated
   * @ordered
   */
  protected static final String ELEMENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getElement() <em>Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElement()
   * @generated
   * @ordered
   */
  protected String element = ELEMENT_EDEFAULT;

  /**
   * The cached value of the '{@link #getAttrs() <em>Attrs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttrs()
   * @generated
   * @ordered
   */
  protected Attributes attrs;

  /**
   * The cached value of the '{@link #getParent() <em>Parent</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParent()
   * @generated
   * @ordered
   */
  protected Parent parent;

  /**
   * The default value of the '{@link #isAll() <em>All</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAll()
   * @generated
   * @ordered
   */
  protected static final boolean ALL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAll() <em>All</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAll()
   * @generated
   * @ordered
   */
  protected boolean all = ALL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SelectorImpl()
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
    return MySeleniumPackage.Literals.SELECTOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getElement()
  {
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElement(String newElement)
  {
    String oldElement = element;
    element = newElement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MySeleniumPackage.SELECTOR__ELEMENT, oldElement, element));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attributes getAttrs()
  {
    return attrs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAttrs(Attributes newAttrs, NotificationChain msgs)
  {
    Attributes oldAttrs = attrs;
    attrs = newAttrs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MySeleniumPackage.SELECTOR__ATTRS, oldAttrs, newAttrs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttrs(Attributes newAttrs)
  {
    if (newAttrs != attrs)
    {
      NotificationChain msgs = null;
      if (attrs != null)
        msgs = ((InternalEObject)attrs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MySeleniumPackage.SELECTOR__ATTRS, null, msgs);
      if (newAttrs != null)
        msgs = ((InternalEObject)newAttrs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MySeleniumPackage.SELECTOR__ATTRS, null, msgs);
      msgs = basicSetAttrs(newAttrs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MySeleniumPackage.SELECTOR__ATTRS, newAttrs, newAttrs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parent getParent()
  {
    return parent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParent(Parent newParent, NotificationChain msgs)
  {
    Parent oldParent = parent;
    parent = newParent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MySeleniumPackage.SELECTOR__PARENT, oldParent, newParent);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParent(Parent newParent)
  {
    if (newParent != parent)
    {
      NotificationChain msgs = null;
      if (parent != null)
        msgs = ((InternalEObject)parent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MySeleniumPackage.SELECTOR__PARENT, null, msgs);
      if (newParent != null)
        msgs = ((InternalEObject)newParent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MySeleniumPackage.SELECTOR__PARENT, null, msgs);
      msgs = basicSetParent(newParent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MySeleniumPackage.SELECTOR__PARENT, newParent, newParent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAll()
  {
    return all;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAll(boolean newAll)
  {
    boolean oldAll = all;
    all = newAll;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MySeleniumPackage.SELECTOR__ALL, oldAll, all));
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
      case MySeleniumPackage.SELECTOR__ATTRS:
        return basicSetAttrs(null, msgs);
      case MySeleniumPackage.SELECTOR__PARENT:
        return basicSetParent(null, msgs);
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
      case MySeleniumPackage.SELECTOR__ELEMENT:
        return getElement();
      case MySeleniumPackage.SELECTOR__ATTRS:
        return getAttrs();
      case MySeleniumPackage.SELECTOR__PARENT:
        return getParent();
      case MySeleniumPackage.SELECTOR__ALL:
        return isAll();
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
      case MySeleniumPackage.SELECTOR__ELEMENT:
        setElement((String)newValue);
        return;
      case MySeleniumPackage.SELECTOR__ATTRS:
        setAttrs((Attributes)newValue);
        return;
      case MySeleniumPackage.SELECTOR__PARENT:
        setParent((Parent)newValue);
        return;
      case MySeleniumPackage.SELECTOR__ALL:
        setAll((Boolean)newValue);
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
      case MySeleniumPackage.SELECTOR__ELEMENT:
        setElement(ELEMENT_EDEFAULT);
        return;
      case MySeleniumPackage.SELECTOR__ATTRS:
        setAttrs((Attributes)null);
        return;
      case MySeleniumPackage.SELECTOR__PARENT:
        setParent((Parent)null);
        return;
      case MySeleniumPackage.SELECTOR__ALL:
        setAll(ALL_EDEFAULT);
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
      case MySeleniumPackage.SELECTOR__ELEMENT:
        return ELEMENT_EDEFAULT == null ? element != null : !ELEMENT_EDEFAULT.equals(element);
      case MySeleniumPackage.SELECTOR__ATTRS:
        return attrs != null;
      case MySeleniumPackage.SELECTOR__PARENT:
        return parent != null;
      case MySeleniumPackage.SELECTOR__ALL:
        return all != ALL_EDEFAULT;
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
    result.append(" (element: ");
    result.append(element);
    result.append(", all: ");
    result.append(all);
    result.append(')');
    return result.toString();
  }

} //SelectorImpl
