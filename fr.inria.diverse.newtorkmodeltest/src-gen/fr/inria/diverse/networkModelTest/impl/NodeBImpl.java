/**
 * generated by Xtext 2.16.0
 */
package fr.inria.diverse.networkModelTest.impl;

import fr.inria.diverse.networkModelTest.NetworkModelTestPackage;
import fr.inria.diverse.networkModelTest.NodeB;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node B</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.networkModelTest.impl.NodeBImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.inria.diverse.networkModelTest.impl.NodeBImpl#getEth <em>Eth</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeBImpl extends MinimalEObjectImpl.Container implements NodeB
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getEth() <em>Eth</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEth()
   * @generated
   * @ordered
   */
  protected static final String ETH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEth() <em>Eth</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEth()
   * @generated
   * @ordered
   */
  protected String eth = ETH_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NodeBImpl()
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
    return NetworkModelTestPackage.Literals.NODE_B;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NetworkModelTestPackage.NODE_B__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getEth()
  {
    return eth;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEth(String newEth)
  {
    String oldEth = eth;
    eth = newEth;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NetworkModelTestPackage.NODE_B__ETH, oldEth, eth));
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
      case NetworkModelTestPackage.NODE_B__NAME:
        return getName();
      case NetworkModelTestPackage.NODE_B__ETH:
        return getEth();
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
      case NetworkModelTestPackage.NODE_B__NAME:
        setName((String)newValue);
        return;
      case NetworkModelTestPackage.NODE_B__ETH:
        setEth((String)newValue);
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
      case NetworkModelTestPackage.NODE_B__NAME:
        setName(NAME_EDEFAULT);
        return;
      case NetworkModelTestPackage.NODE_B__ETH:
        setEth(ETH_EDEFAULT);
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
      case NetworkModelTestPackage.NODE_B__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case NetworkModelTestPackage.NODE_B__ETH:
        return ETH_EDEFAULT == null ? eth != null : !ETH_EDEFAULT.equals(eth);
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
    result.append(" (name: ");
    result.append(name);
    result.append(", eth: ");
    result.append(eth);
    result.append(')');
    return result.toString();
  }

} //NodeBImpl
