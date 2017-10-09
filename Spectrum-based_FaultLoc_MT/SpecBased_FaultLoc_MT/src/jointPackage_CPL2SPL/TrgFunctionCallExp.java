/**
 */
package jointPackage_CPL2SPL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Function Call Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_CPL2SPL.TrgFunctionCallExp#getFunctionCall <em>Function Call</em>}</li>
 * </ul>
 *
 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getTrgFunctionCallExp()
 * @model
 * @generated
 */
public interface TrgFunctionCallExp extends TrgExpression {
	/**
	 * Returns the value of the '<em><b>Function Call</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Call</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Call</em>' containment reference.
	 * @see #setFunctionCall(TrgFunctionCall)
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getTrgFunctionCallExp_FunctionCall()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	TrgFunctionCall getFunctionCall();

	/**
	 * Sets the value of the '{@link jointPackage_CPL2SPL.TrgFunctionCallExp#getFunctionCall <em>Function Call</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Call</em>' containment reference.
	 * @see #getFunctionCall()
	 * @generated
	 */
	void setFunctionCall(TrgFunctionCall value);

} // TrgFunctionCallExp
