/**
 */
package jointPackage_CPL2SPL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Remote Function Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_CPL2SPL.TrgRemoteFunctionDeclaration#getFunctionLocation <em>Function Location</em>}</li>
 * </ul>
 *
 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getTrgRemoteFunctionDeclaration()
 * @model
 * @generated
 */
public interface TrgRemoteFunctionDeclaration extends TrgFunctionDeclaration {
	/**
	 * Returns the value of the '<em><b>Function Location</b></em>' attribute.
	 * The literals are from the enumeration {@link jointPackage_CPL2SPL.FunctionLocation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Location</em>' attribute.
	 * @see jointPackage_CPL2SPL.FunctionLocation
	 * @see #setFunctionLocation(FunctionLocation)
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getTrgRemoteFunctionDeclaration_FunctionLocation()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	FunctionLocation getFunctionLocation();

	/**
	 * Sets the value of the '{@link jointPackage_CPL2SPL.TrgRemoteFunctionDeclaration#getFunctionLocation <em>Function Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Location</em>' attribute.
	 * @see jointPackage_CPL2SPL.FunctionLocation
	 * @see #getFunctionLocation()
	 * @generated
	 */
	void setFunctionLocation(FunctionLocation value);

} // TrgRemoteFunctionDeclaration
