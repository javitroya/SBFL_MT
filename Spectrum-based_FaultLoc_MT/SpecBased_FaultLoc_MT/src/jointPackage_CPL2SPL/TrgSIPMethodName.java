/**
 */
package jointPackage_CPL2SPL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg SIP Method Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_CPL2SPL.TrgSIPMethodName#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getTrgSIPMethodName()
 * @model
 * @generated
 */
public interface TrgSIPMethodName extends TrgMethodName {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The literals are from the enumeration {@link jointPackage_CPL2SPL.SIPMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see jointPackage_CPL2SPL.SIPMethod
	 * @see #setName(SIPMethod)
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getTrgSIPMethodName_Name()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	SIPMethod getName();

	/**
	 * Sets the value of the '{@link jointPackage_CPL2SPL.TrgSIPMethodName#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see jointPackage_CPL2SPL.SIPMethod
	 * @see #getName()
	 * @generated
	 */
	void setName(SIPMethod value);

} // TrgSIPMethodName
