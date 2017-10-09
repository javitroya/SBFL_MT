/**
 */
package jointPackage_CPL2SPL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Local Function Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_CPL2SPL.TrgLocalFunctionDeclaration#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getTrgLocalFunctionDeclaration()
 * @model
 * @generated
 */
public interface TrgLocalFunctionDeclaration extends TrgFunctionDeclaration {
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
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getTrgLocalFunctionDeclaration_Statements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TrgStatement> getStatements();

} // TrgLocalFunctionDeclaration
