/**
 */
package jointPackage_CPL2SPL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg When Stat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_CPL2SPL.TrgWhenStat#getIdExp <em>Id Exp</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.TrgWhenStat#getWhenHeaders <em>When Headers</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.TrgWhenStat#getStatements <em>Statements</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.TrgWhenStat#getElseStatements <em>Else Statements</em>}</li>
 * </ul>
 *
 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getTrgWhenStat()
 * @model
 * @generated
 */
public interface TrgWhenStat extends TrgStatement {
	/**
	 * Returns the value of the '<em><b>Id Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Exp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Exp</em>' containment reference.
	 * @see #setIdExp(TrgVariable)
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getTrgWhenStat_IdExp()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	TrgVariable getIdExp();

	/**
	 * Sets the value of the '{@link jointPackage_CPL2SPL.TrgWhenStat#getIdExp <em>Id Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Exp</em>' containment reference.
	 * @see #getIdExp()
	 * @generated
	 */
	void setIdExp(TrgVariable value);

	/**
	 * Returns the value of the '<em><b>When Headers</b></em>' containment reference list.
	 * The list contents are of type {@link jointPackage_CPL2SPL.TrgWhenHeader}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>When Headers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When Headers</em>' containment reference list.
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getTrgWhenStat_WhenHeaders()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TrgWhenHeader> getWhenHeaders();

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
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getTrgWhenStat_Statements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TrgStatement> getStatements();

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
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getTrgWhenStat_ElseStatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<TrgStatement> getElseStatements();

} // TrgWhenStat
