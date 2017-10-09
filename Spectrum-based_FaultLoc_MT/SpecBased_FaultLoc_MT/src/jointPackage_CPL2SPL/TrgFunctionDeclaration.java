/**
 */
package jointPackage_CPL2SPL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Function Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_CPL2SPL.TrgFunctionDeclaration#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.TrgFunctionDeclaration#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getTrgFunctionDeclaration()
 * @model abstract="true"
 * @generated
 */
public interface TrgFunctionDeclaration extends TrgDeclaration {
	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' containment reference.
	 * @see #setReturnType(TrgTypeExpression)
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getTrgFunctionDeclaration_ReturnType()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	TrgTypeExpression getReturnType();

	/**
	 * Sets the value of the '{@link jointPackage_CPL2SPL.TrgFunctionDeclaration#getReturnType <em>Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' containment reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(TrgTypeExpression value);

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link jointPackage_CPL2SPL.TrgArgument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getTrgFunctionDeclaration_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<TrgArgument> getArguments();

} // TrgFunctionDeclaration
