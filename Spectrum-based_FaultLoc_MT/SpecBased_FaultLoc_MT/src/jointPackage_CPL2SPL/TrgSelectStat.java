/**
 */
package jointPackage_CPL2SPL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Select Stat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_CPL2SPL.TrgSelectStat#getMatchedExp <em>Matched Exp</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.TrgSelectStat#getSelectCases <em>Select Cases</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.TrgSelectStat#getSelectDefault <em>Select Default</em>}</li>
 * </ul>
 *
 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getTrgSelectStat()
 * @model
 * @generated
 */
public interface TrgSelectStat extends TrgStatement {
	/**
	 * Returns the value of the '<em><b>Matched Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matched Exp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matched Exp</em>' containment reference.
	 * @see #setMatchedExp(TrgExpression)
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getTrgSelectStat_MatchedExp()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	TrgExpression getMatchedExp();

	/**
	 * Sets the value of the '{@link jointPackage_CPL2SPL.TrgSelectStat#getMatchedExp <em>Matched Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matched Exp</em>' containment reference.
	 * @see #getMatchedExp()
	 * @generated
	 */
	void setMatchedExp(TrgExpression value);

	/**
	 * Returns the value of the '<em><b>Select Cases</b></em>' containment reference list.
	 * The list contents are of type {@link jointPackage_CPL2SPL.TrgSelectCase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Select Cases</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Select Cases</em>' containment reference list.
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getTrgSelectStat_SelectCases()
	 * @model containment="true"
	 * @generated
	 */
	EList<TrgSelectCase> getSelectCases();

	/**
	 * Returns the value of the '<em><b>Select Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Select Default</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Select Default</em>' containment reference.
	 * @see #setSelectDefault(TrgSelectDefault)
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getTrgSelectStat_SelectDefault()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	TrgSelectDefault getSelectDefault();

	/**
	 * Sets the value of the '{@link jointPackage_CPL2SPL.TrgSelectStat#getSelectDefault <em>Select Default</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Select Default</em>' containment reference.
	 * @see #getSelectDefault()
	 * @generated
	 */
	void setSelectDefault(TrgSelectDefault value);

} // TrgSelectStat
