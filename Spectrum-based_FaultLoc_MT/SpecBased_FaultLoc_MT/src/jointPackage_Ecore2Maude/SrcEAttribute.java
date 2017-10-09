/**
 */
package jointPackage_Ecore2Maude;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Src EAttribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_Ecore2Maude.SrcEAttribute#isID <em>ID</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.SrcEAttribute#getEAttributeType <em>EAttribute Type</em>}</li>
 * </ul>
 *
 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getSrcEAttribute()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ConsistentTransient'"
 * @generated
 */
public interface SrcEAttribute extends SrcEStructuralFeature {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(boolean)
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getSrcEAttribute_ID()
	 * @model
	 * @generated
	 */
	boolean isID();

	/**
	 * Sets the value of the '{@link jointPackage_Ecore2Maude.SrcEAttribute#isID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #isID()
	 * @generated
	 */
	void setID(boolean value);

	/**
	 * Returns the value of the '<em><b>EAttribute Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EAttribute Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EAttribute Type</em>' reference.
	 * @see #setEAttributeType(SrcEDataType)
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getSrcEAttribute_EAttributeType()
	 * @model derived="true"
	 * @generated
	 */
	SrcEDataType getEAttributeType();

	/**
	 * Sets the value of the '{@link jointPackage_Ecore2Maude.SrcEAttribute#getEAttributeType <em>EAttribute Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EAttribute Type</em>' reference.
	 * @see #getEAttributeType()
	 * @generated
	 */
	void setEAttributeType(SrcEDataType value);

} // SrcEAttribute
