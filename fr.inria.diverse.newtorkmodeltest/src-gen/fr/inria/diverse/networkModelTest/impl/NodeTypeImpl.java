/**
 * generated by Xtext 2.16.0
 */
package fr.inria.diverse.networkModelTest.impl;

import fr.inria.diverse.networkModelTest.NetworkModelTestPackage;
import fr.inria.diverse.networkModelTest.NodeType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.networkModelTest.impl.NodeTypeImpl#getNodetype <em>Nodetype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeTypeImpl extends MinimalEObjectImpl.Container implements NodeType
{
  /**
   * The default value of the '{@link #getNodetype() <em>Nodetype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNodetype()
   * @generated
   * @ordered
   */
  protected static final String NODETYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNodetype() <em>Nodetype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNodetype()
   * @generated
   * @ordered
   */
  protected String nodetype = NODETYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NodeTypeImpl()
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
    return NetworkModelTestPackage.Literals.NODE_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getNodetype()
  {
    return nodetype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNodetype(String newNodetype)
  {
    String oldNodetype = nodetype;
    nodetype = newNodetype;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NetworkModelTestPackage.NODE_TYPE__NODETYPE, oldNodetype, nodetype));
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
      case NetworkModelTestPackage.NODE_TYPE__NODETYPE:
        return getNodetype();
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
      case NetworkModelTestPackage.NODE_TYPE__NODETYPE:
        setNodetype((String)newValue);
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
      case NetworkModelTestPackage.NODE_TYPE__NODETYPE:
        setNodetype(NODETYPE_EDEFAULT);
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
      case NetworkModelTestPackage.NODE_TYPE__NODETYPE:
        return NODETYPE_EDEFAULT == null ? nodetype != null : !NODETYPE_EDEFAULT.equals(nodetype);
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
    result.append(" (nodetype: ");
    result.append(nodetype);
    result.append(')');
    return result.toString();
  }

} //NodeTypeImpl