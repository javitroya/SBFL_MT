/**
 */
package jointPackage_UML2ER;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_UML2ER.TrgReference#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see jointPackage_UML2ER.JointPackage_UML2ERPackage#getTrgReference()
 * @model abstract="true"
 * @generated
 */
public interface TrgReference extends TrgFeature {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(TrgEntityType)
	 * @see jointPackage_UML2ER.JointPackage_UML2ERPackage#getTrgReference_Type()
	 * @model required="true"
	 * @generated
	 */
	TrgEntityType getType();

	/**
	 * Sets the value of the '{@link jointPackage_UML2ER.TrgReference#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TrgEntityType value);

} // TrgReference
