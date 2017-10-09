/**
 */
package jointPackage_Ecore2Maude;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Membership Cond</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_Ecore2Maude.TrgMembershipCond#getRhs <em>Rhs</em>}</li>
 * </ul>
 *
 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getTrgMembershipCond()
 * @model
 * @generated
 */
public interface TrgMembershipCond extends TrgEquationalCond {
	/**
	 * Returns the value of the '<em><b>Rhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rhs</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rhs</em>' reference.
	 * @see #setRhs(TrgSort)
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getTrgMembershipCond_Rhs()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	TrgSort getRhs();

	/**
	 * Sets the value of the '{@link jointPackage_Ecore2Maude.TrgMembershipCond#getRhs <em>Rhs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rhs</em>' reference.
	 * @see #getRhs()
	 * @generated
	 */
	void setRhs(TrgSort value);

} // TrgMembershipCond
