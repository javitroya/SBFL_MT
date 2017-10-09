/**
 */
package jointPackage_CPL2SPL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg If Stat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_CPL2SPL.TrgIfStat#getCondition <em>Condition</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.TrgIfStat#getThenStatements <em>Then Statements</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.TrgIfStat#getElseStatements <em>Else Statements</em>}</li>
 * </ul>
 *
 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getTrgIfStat()
 * @model
 * @generated
 */
public interface TrgIfStat extends TrgStatement {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(TrgExpression)
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getTrgIfStat_Condition()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	TrgExpression getCondition();

	/**
	 * Sets the value of the '{@link jointPackage_CPL2SPL.TrgIfStat#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(TrgExpression value);

	/**
	 * Returns the value of the '<em><b>Then Statements</b></em>' containment reference list.
	 * The list contents are of type {@link jointPackage_CPL2SPL.TrgStatement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Then Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then Statements</em>' containment reference list.
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getTrgIfStat_ThenStatements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TrgStatement> getThenStatements();

	/**
	 * Returns the value of the '<em><b>Else Statements</b></em>' containment reference list.
	 * The list contents are of type {@link jointPackage_CPL2SPL.TrgStatement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Statements</em>' containment reference list.
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getTrgIfStat_ElseStatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<TrgStatement> getElseStatements();

} // TrgIfStat
