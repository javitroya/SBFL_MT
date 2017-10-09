/**
 */
package jointPackage_CPL2SPL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Push Stat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_CPL2SPL.TrgPushStat#getTarget <em>Target</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.TrgPushStat#getPushedValue <em>Pushed Value</em>}</li>
 * </ul>
 *
 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getTrgPushStat()
 * @model
 * @generated
 */
public interface TrgPushStat extends TrgStatement {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(TrgPlace)
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getTrgPushStat_Target()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	TrgPlace getTarget();

	/**
	 * Sets the value of the '{@link jointPackage_CPL2SPL.TrgPushStat#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TrgPlace value);

	/**
	 * Returns the value of the '<em><b>Pushed Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pushed Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pushed Value</em>' containment reference.
	 * @see #setPushedValue(TrgExpression)
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getTrgPushStat_PushedValue()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	TrgExpression getPushedValue();

	/**
	 * Sets the value of the '{@link jointPackage_CPL2SPL.TrgPushStat#getPushedValue <em>Pushed Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pushed Value</em>' containment reference.
	 * @see #getPushedValue()
	 * @generated
	 */
	void setPushedValue(TrgExpression value);

} // TrgPushStat
