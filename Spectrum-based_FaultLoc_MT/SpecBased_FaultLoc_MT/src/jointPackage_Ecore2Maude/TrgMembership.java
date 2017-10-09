/**
 */
package jointPackage_Ecore2Maude;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Membership</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_Ecore2Maude.TrgMembership#getTerm <em>Term</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.TrgMembership#getSort <em>Sort</em>}</li>
 * </ul>
 *
 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getTrgMembership()
 * @model
 * @generated
 */
public interface TrgMembership extends TrgStatement {
	/**
	 * Returns the value of the '<em><b>Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Term</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Term</em>' containment reference.
	 * @see #setTerm(TrgTerm)
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getTrgMembership_Term()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	TrgTerm getTerm();

	/**
	 * Sets the value of the '{@link jointPackage_Ecore2Maude.TrgMembership#getTerm <em>Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Term</em>' containment reference.
	 * @see #getTerm()
	 * @generated
	 */
	void setTerm(TrgTerm value);

	/**
	 * Returns the value of the '<em><b>Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sort</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sort</em>' reference.
	 * @see #setSort(TrgSort)
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getTrgMembership_Sort()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	TrgSort getSort();

	/**
	 * Sets the value of the '{@link jointPackage_Ecore2Maude.TrgMembership#getSort <em>Sort</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sort</em>' reference.
	 * @see #getSort()
	 * @generated
	 */
	void setSort(TrgSort value);

} // TrgMembership
