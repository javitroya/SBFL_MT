/**
 */
package jointPackage_CPL2SPL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Client Error Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_CPL2SPL.TrgClientErrorResponse#getErrorKind <em>Error Kind</em>}</li>
 * </ul>
 *
 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getTrgClientErrorResponse()
 * @model
 * @generated
 */
public interface TrgClientErrorResponse extends TrgErrorResponse {
	/**
	 * Returns the value of the '<em><b>Error Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link jointPackage_CPL2SPL.ClientErrorKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Kind</em>' attribute.
	 * @see jointPackage_CPL2SPL.ClientErrorKind
	 * @see #setErrorKind(ClientErrorKind)
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getTrgClientErrorResponse_ErrorKind()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	ClientErrorKind getErrorKind();

	/**
	 * Sets the value of the '{@link jointPackage_CPL2SPL.TrgClientErrorResponse#getErrorKind <em>Error Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Kind</em>' attribute.
	 * @see jointPackage_CPL2SPL.ClientErrorKind
	 * @see #getErrorKind()
	 * @generated
	 */
	void setErrorKind(ClientErrorKind value);

} // TrgClientErrorResponse
