/**
 */
package jointPackage_UML2ER;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Src Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_UML2ER.SrcProperty#getPrimitiveType <em>Primitive Type</em>}</li>
 *   <li>{@link jointPackage_UML2ER.SrcProperty#getComplexType <em>Complex Type</em>}</li>
 *   <li>{@link jointPackage_UML2ER.SrcProperty#isIsContainment <em>Is Containment</em>}</li>
 * </ul>
 *
 * @see jointPackage_UML2ER.JointPackage_UML2ERPackage#getSrcProperty()
 * @model
 * @generated
 */
public interface SrcProperty extends SrcNamedElement {
	/**
	 * Returns the value of the '<em><b>Primitive Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primitive Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitive Type</em>' attribute.
	 * @see #setPrimitiveType(String)
	 * @see jointPackage_UML2ER.JointPackage_UML2ERPackage#getSrcProperty_PrimitiveType()
	 * @model
	 * @generated
	 */
	String getPrimitiveType();

	/**
	 * Sets the value of the '{@link jointPackage_UML2ER.SrcProperty#getPrimitiveType <em>Primitive Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primitive Type</em>' attribute.
	 * @see #getPrimitiveType()
	 * @generated
	 */
	void setPrimitiveType(String value);

	/**
	 * Returns the value of the '<em><b>Complex Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complex Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complex Type</em>' reference.
	 * @see #setComplexType(SrcClass)
	 * @see jointPackage_UML2ER.JointPackage_UML2ERPackage#getSrcProperty_ComplexType()
	 * @model
	 * @generated
	 */
	SrcClass getComplexType();

	/**
	 * Sets the value of the '{@link jointPackage_UML2ER.SrcProperty#getComplexType <em>Complex Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complex Type</em>' reference.
	 * @see #getComplexType()
	 * @generated
	 */
	void setComplexType(SrcClass value);

	/**
	 * Returns the value of the '<em><b>Is Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Containment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Containment</em>' attribute.
	 * @see #setIsContainment(boolean)
	 * @see jointPackage_UML2ER.JointPackage_UML2ERPackage#getSrcProperty_IsContainment()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsContainment();

	/**
	 * Sets the value of the '{@link jointPackage_UML2ER.SrcProperty#isIsContainment <em>Is Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Containment</em>' attribute.
	 * @see #isIsContainment()
	 * @generated
	 */
	void setIsContainment(boolean value);

} // SrcProperty
