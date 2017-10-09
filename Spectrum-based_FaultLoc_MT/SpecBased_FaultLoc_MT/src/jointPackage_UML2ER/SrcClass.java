/**
 */
package jointPackage_UML2ER;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Src Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_UML2ER.SrcClass#getOwnedProperty <em>Owned Property</em>}</li>
 *   <li>{@link jointPackage_UML2ER.SrcClass#getSuperClasses <em>Super Classes</em>}</li>
 * </ul>
 *
 * @see jointPackage_UML2ER.JointPackage_UML2ERPackage#getSrcClass()
 * @model
 * @generated
 */
public interface SrcClass extends SrcNamedElement {
	/**
	 * Returns the value of the '<em><b>Owned Property</b></em>' containment reference list.
	 * The list contents are of type {@link jointPackage_UML2ER.SrcProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Property</em>' containment reference list.
	 * @see jointPackage_UML2ER.JointPackage_UML2ERPackage#getSrcClass_OwnedProperty()
	 * @model containment="true"
	 * @generated
	 */
	EList<SrcProperty> getOwnedProperty();

	/**
	 * Returns the value of the '<em><b>Super Classes</b></em>' reference list.
	 * The list contents are of type {@link jointPackage_UML2ER.SrcClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Classes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Classes</em>' reference list.
	 * @see jointPackage_UML2ER.JointPackage_UML2ERPackage#getSrcClass_SuperClasses()
	 * @model
	 * @generated
	 */
	EList<SrcClass> getSuperClasses();

} // SrcClass
