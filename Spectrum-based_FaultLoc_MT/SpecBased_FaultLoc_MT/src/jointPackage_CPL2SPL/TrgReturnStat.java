/**
 */
package jointPackage_CPL2SPL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Return Stat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_CPL2SPL.TrgReturnStat#getReturnedValue <em>Returned Value</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.TrgReturnStat#getBranch <em>Branch</em>}</li>
 * </ul>
 *
 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getTrgReturnStat()
 * @model
 * @generated
 */
public interface TrgReturnStat extends TrgStatement {
	/**
	 * Returns the value of the '<em><b>Returned Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Returned Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Returned Value</em>' containment reference.
	 * @see #setReturnedValue(TrgExpression)
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getTrgReturnStat_ReturnedValue()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	TrgExpression getReturnedValue();

	/**
	 * Sets the value of the '{@link jointPackage_CPL2SPL.TrgReturnStat#getReturnedValue <em>Returned Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Returned Value</em>' containment reference.
	 * @see #getReturnedValue()
	 * @generated
	 */
	void setReturnedValue(TrgExpression value);

	/**
	 * Returns the value of the '<em><b>Branch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Branch</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branch</em>' reference.
	 * @see #setBranch(TrgNamedBranch)
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getTrgReturnStat_Branch()
	 * @model ordered="false"
	 * @generated
	 */
	TrgNamedBranch getBranch();

	/**
	 * Sets the value of the '{@link jointPackage_CPL2SPL.TrgReturnStat#getBranch <em>Branch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Branch</em>' reference.
	 * @see #getBranch()
	 * @generated
	 */
	void setBranch(TrgNamedBranch value);

} // TrgReturnStat
