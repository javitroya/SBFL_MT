/**
 */
package jointPackage_CPL2SPL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Server Error Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_CPL2SPL.TrgServerErrorResponse#getErrorKind <em>Error Kind</em>}</li>
 * </ul>
 *
 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getTrgServerErrorResponse()
 * @model
 * @generated
 */
public interface TrgServerErrorResponse extends TrgErrorResponse {
	/**
	 * Returns the value of the '<em><b>Error Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link jointPackage_CPL2SPL.ServerErrorKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Kind</em>' attribute.
	 * @see jointPackage_CPL2SPL.ServerErrorKind
	 * @see #setErrorKind(ServerErrorKind)
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getTrgServerErrorResponse_ErrorKind()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	ServerErrorKind getErrorKind();

	/**
	 * Sets the value of the '{@link jointPackage_CPL2SPL.TrgServerErrorResponse#getErrorKind <em>Error Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Kind</em>' attribute.
	 * @see jointPackage_CPL2SPL.ServerErrorKind
	 * @see #getErrorKind()
	 * @generated
	 */
	void setErrorKind(ServerErrorKind value);

} // TrgServerErrorResponse
