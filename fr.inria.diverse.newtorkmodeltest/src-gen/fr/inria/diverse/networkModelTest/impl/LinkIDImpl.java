/**
 * generated by Xtext 2.16.0
 */
package fr.inria.diverse.networkModelTest.impl;

import fr.inria.diverse.networkModelTest.LinkID;
import fr.inria.diverse.networkModelTest.NetworkModelTestPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link ID</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.networkModelTest.impl.LinkIDImpl#getLinkID <em>Link ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinkIDImpl extends MinimalEObjectImpl.Container implements LinkID
{
  /**
   * The default value of the '{@link #getLinkID() <em>Link ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLinkID()
   * @generated
   * @ordered
   */
  protected static final String LINK_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLinkID() <em>Link ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLinkID()
   * @generated
   * @ordered
   */
  protected String linkID = LINK_ID_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LinkIDImpl()
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
    return NetworkModelTestPackage.Literals.LINK_ID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLinkID()
  {
    return linkID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLinkID(String newLinkID)
  {
    String oldLinkID = linkID;
    linkID = newLinkID;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NetworkModelTestPackage.LINK_ID__LINK_ID, oldLinkID, linkID));
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
      case NetworkModelTestPackage.LINK_ID__LINK_ID:
        return getLinkID();
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
      case NetworkModelTestPackage.LINK_ID__LINK_ID:
        setLinkID((String)newValue);
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
      case NetworkModelTestPackage.LINK_ID__LINK_ID:
        setLinkID(LINK_ID_EDEFAULT);
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
      case NetworkModelTestPackage.LINK_ID__LINK_ID:
        return LINK_ID_EDEFAULT == null ? linkID != null : !LINK_ID_EDEFAULT.equals(linkID);
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (linkID: ");
    result.append(linkID);
    result.append(')');
    return result.toString();
  }

} //LinkIDImpl