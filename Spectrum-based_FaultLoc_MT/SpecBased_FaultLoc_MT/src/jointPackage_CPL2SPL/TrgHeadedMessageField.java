/**
 */
package jointPackage_CPL2SPL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Headed Message Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_CPL2SPL.TrgHeadedMessageField#getHeaderId <em>Header Id</em>}</li>
 * </ul>
 *
 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getTrgHeadedMessageField()
 * @model
 * @generated
 */
public interface TrgHeadedMessageField extends TrgMessageField {
	/**
	 * Returns the value of the '<em><b>Header Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header Id</em>' attribute.
	 * @see #setHeaderId(String)
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getTrgHeadedMessageField_HeaderId()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getHeaderId();

	/**
	 * Sets the value of the '{@link jointPackage_CPL2SPL.TrgHeadedMessageField#getHeaderId <em>Header Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header Id</em>' attribute.
	 * @see #getHeaderId()
	 * @generated
	 */
	void setHeaderId(String value);

} // TrgHeadedMessageField
