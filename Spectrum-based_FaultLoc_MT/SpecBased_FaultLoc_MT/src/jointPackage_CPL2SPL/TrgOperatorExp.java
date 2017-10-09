/**
 */
package jointPackage_CPL2SPL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Operator Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_CPL2SPL.TrgOperatorExp#getOpName <em>Op Name</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.TrgOperatorExp#getLeftExp <em>Left Exp</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.TrgOperatorExp#getRightExp <em>Right Exp</em>}</li>
 * </ul>
 *
 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getTrgOperatorExp()
 * @model
 * @generated
 */
public interface TrgOperatorExp extends TrgExpression {
	/**
	 * Returns the value of the '<em><b>Op Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op Name</em>' attribute.
	 * @see #setOpName(String)
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getTrgOperatorExp_OpName()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getOpName();

	/**
	 * Sets the value of the '{@link jointPackage_CPL2SPL.TrgOperatorExp#getOpName <em>Op Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op Name</em>' attribute.
	 * @see #getOpName()
	 * @generated
	 */
	void setOpName(String value);

	/**
	 * Returns the value of the '<em><b>Left Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Exp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Exp</em>' containment reference.
	 * @see #setLeftExp(TrgExpression)
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getTrgOperatorExp_LeftExp()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	TrgExpression getLeftExp();

	/**
	 * Sets the value of the '{@link jointPackage_CPL2SPL.TrgOperatorExp#getLeftExp <em>Left Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Exp</em>' containment reference.
	 * @see #getLeftExp()
	 * @generated
	 */
	void setLeftExp(TrgExpression value);

	/**
	 * Returns the value of the '<em><b>Right Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Exp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Exp</em>' containment reference.
	 * @see #setRightExp(TrgExpression)
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getTrgOperatorExp_RightExp()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	TrgExpression getRightExp();

	/**
	 * Sets the value of the '{@link jointPackage_CPL2SPL.TrgOperatorExp#getRightExp <em>Right Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Exp</em>' containment reference.
	 * @see #getRightExp()
	 * @generated
	 */
	void setRightExp(TrgExpression value);

} // TrgOperatorExp
