/**
 */
package jointPackage_CPL2SPL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Foreach Stat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_CPL2SPL.TrgForeachStat#getIteratorName <em>Iterator Name</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.TrgForeachStat#getSequenceExp <em>Sequence Exp</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.TrgForeachStat#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getTrgForeachStat()
 * @model
 * @generated
 */
public interface TrgForeachStat extends TrgStatement {
	/**
	 * Returns the value of the '<em><b>Iterator Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iterator Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iterator Name</em>' attribute.
	 * @see #setIteratorName(String)
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getTrgForeachStat_IteratorName()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getIteratorName();

	/**
	 * Sets the value of the '{@link jointPackage_CPL2SPL.TrgForeachStat#getIteratorName <em>Iterator Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iterator Name</em>' attribute.
	 * @see #getIteratorName()
	 * @generated
	 */
	void setIteratorName(String value);

	/**
	 * Returns the value of the '<em><b>Sequence Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Exp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Exp</em>' containment reference.
	 * @see #setSequenceExp(TrgExpression)
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getTrgForeachStat_SequenceExp()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	TrgExpression getSequenceExp();

	/**
	 * Sets the value of the '{@link jointPackage_CPL2SPL.TrgForeachStat#getSequenceExp <em>Sequence Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Exp</em>' containment reference.
	 * @see #getSequenceExp()
	 * @generated
	 */
	void setSequenceExp(TrgExpression value);

	/**
	 * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
	 * The list contents are of type {@link jointPackage_CPL2SPL.TrgStatement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' containment reference list.
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getTrgForeachStat_Statements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TrgStatement> getStatements();

} // TrgForeachStat
