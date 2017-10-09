/**
 */
package jointPackage_CPL2SPL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Response Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_CPL2SPL.TrgResponseConstant#getResponse <em>Response</em>}</li>
 * </ul>
 *
 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getTrgResponseConstant()
 * @model
 * @generated
 */
public interface TrgResponseConstant extends TrgConstant {
	/**
	 * Returns the value of the '<em><b>Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response</em>' containment reference.
	 * @see #setResponse(TrgResponse)
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getTrgResponseConstant_Response()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	TrgResponse getResponse();

	/**
	 * Sets the value of the '{@link jointPackage_CPL2SPL.TrgResponseConstant#getResponse <em>Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response</em>' containment reference.
	 * @see #getResponse()
	 * @generated
	 */
	void setResponse(TrgResponse value);

} // TrgResponseConstant
