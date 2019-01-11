/**
 * generated by Xtext 2.16.0
 */
package fr.inria.diverse.networkModelTest.impl;

import fr.inria.diverse.networkModelTest.Binding;
import fr.inria.diverse.networkModelTest.NetworkModelTestPackage;
import fr.inria.diverse.networkModelTest.nodeA;
import fr.inria.diverse.networkModelTest.nodeB;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.networkModelTest.impl.BindingImpl#getNodeA <em>Node A</em>}</li>
 *   <li>{@link fr.inria.diverse.networkModelTest.impl.BindingImpl#getNodeB <em>Node B</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BindingImpl extends MinimalEObjectImpl.Container implements Binding
{
  /**
   * The cached value of the '{@link #getNodeA() <em>Node A</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNodeA()
   * @generated
   * @ordered
   */
  protected EList<nodeA> nodeA;

  /**
   * The cached value of the '{@link #getNodeB() <em>Node B</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNodeB()
   * @generated
   * @ordered
   */
  protected EList<nodeB> nodeB;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BindingImpl()
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
    return NetworkModelTestPackage.Literals.BINDING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<nodeA> getNodeA()
  {
    if (nodeA == null)
    {
      nodeA = new EObjectContainmentEList<nodeA>(nodeA.class, this, NetworkModelTestPackage.BINDING__NODE_A);
    }
    return nodeA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<nodeB> getNodeB()
  {
    if (nodeB == null)
    {
      nodeB = new EObjectContainmentEList<nodeB>(nodeB.class, this, NetworkModelTestPackage.BINDING__NODE_B);
    }
    return nodeB;
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
      case NetworkModelTestPackage.BINDING__NODE_A:
        return ((InternalEList<?>)getNodeA()).basicRemove(otherEnd, msgs);
      case NetworkModelTestPackage.BINDING__NODE_B:
        return ((InternalEList<?>)getNodeB()).basicRemove(otherEnd, msgs);
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
      case NetworkModelTestPackage.BINDING__NODE_A:
        return getNodeA();
      case NetworkModelTestPackage.BINDING__NODE_B:
        return getNodeB();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case NetworkModelTestPackage.BINDING__NODE_A:
        getNodeA().clear();
        getNodeA().addAll((Collection<? extends nodeA>)newValue);
        return;
      case NetworkModelTestPackage.BINDING__NODE_B:
        getNodeB().clear();
        getNodeB().addAll((Collection<? extends nodeB>)newValue);
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
      case NetworkModelTestPackage.BINDING__NODE_A:
        getNodeA().clear();
        return;
      case NetworkModelTestPackage.BINDING__NODE_B:
        getNodeB().clear();
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
      case NetworkModelTestPackage.BINDING__NODE_A:
        return nodeA != null && !nodeA.isEmpty();
      case NetworkModelTestPackage.BINDING__NODE_B:
        return nodeB != null && !nodeB.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //BindingImpl