/**
 */
package jointPackage_CPL2SPL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Function Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_CPL2SPL.TrgFunctionCall#getFunction <em>Function</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.TrgFunctionCall#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getTrgFunctionCall()
 * @model
 * @generated
 */
public interface TrgFunctionCall extends TrgLocatedElement {
	/**
	 * Returns the value of the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' reference.
	 * @see #setFunction(TrgFunctionDeclaration)
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getTrgFunctionCall_Function()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	TrgFunctionDeclaration getFunction();

	/**
	 * Sets the value of the '{@link jointPackage_CPL2SPL.TrgFunctionCall#getFunction <em>Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(TrgFunctionDeclaration value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link jointPackage_CPL2SPL.TrgExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getTrgFunctionCall_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<TrgExpression> getParameters();

} // TrgFunctionCall
