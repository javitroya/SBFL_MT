/**
 */
package jointPackage_Ecore2Maude;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Equal Cond</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_Ecore2Maude.TrgEqualCond#getRhs <em>Rhs</em>}</li>
 * </ul>
 *
 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getTrgEqualCond()
 * @model
 * @generated
 */
public interface TrgEqualCond extends TrgEquationalCond {
	/**
	 * Returns the value of the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rhs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rhs</em>' containment reference.
	 * @see #setRhs(TrgTerm)
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getTrgEqualCond_Rhs()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	TrgTerm getRhs();

	/**
	 * Sets the value of the '{@link jointPackage_Ecore2Maude.TrgEqualCond#getRhs <em>Rhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rhs</em>' containment reference.
	 * @see #getRhs()
	 * @generated
	 */
	void setRhs(TrgTerm value);

} // TrgEqualCond
