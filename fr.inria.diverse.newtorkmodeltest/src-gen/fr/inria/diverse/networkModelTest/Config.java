/**
 * generated by Xtext 2.16.0
 */
package fr.inria.diverse.networkModelTest;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.networkModelTest.Config#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link fr.inria.diverse.networkModelTest.Config#getNode <em>Node</em>}</li>
 *   <li>{@link fr.inria.diverse.networkModelTest.Config#getBinding <em>Binding</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.networkModelTest.NetworkModelTestPackage#getConfig()
 * @model
 * @generated
 */
public interface Config extends Type
{
  /**
   * Returns the value of the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Type</em>' reference.
   * @see #setSuperType(Config)
   * @see fr.inria.diverse.networkModelTest.NetworkModelTestPackage#getConfig_SuperType()
   * @model
   * @generated
   */
  Config getSuperType();

  /**
   * Sets the value of the '{@link fr.inria.diverse.networkModelTest.Config#getSuperType <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Type</em>' reference.
   * @see #getSuperType()
   * @generated
   */
  void setSuperType(Config value);

  /**
   * Returns the value of the '<em><b>Node</b></em>' containment reference list.
   * The list contents are of type {@link fr.inria.diverse.networkModelTest.Node}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Node</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Node</em>' containment reference list.
   * @see fr.inria.diverse.networkModelTest.NetworkModelTestPackage#getConfig_Node()
   * @model containment="true"
   * @generated
   */
  EList<Node> getNode();

  /**
   * Returns the value of the '<em><b>Binding</b></em>' containment reference list.
   * The list contents are of type {@link fr.inria.diverse.networkModelTest.Binding}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Binding</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Binding</em>' containment reference list.
   * @see fr.inria.diverse.networkModelTest.NetworkModelTestPackage#getConfig_Binding()
   * @model containment="true"
   * @generated
   */
  EList<Binding> getBinding();

} // Config
