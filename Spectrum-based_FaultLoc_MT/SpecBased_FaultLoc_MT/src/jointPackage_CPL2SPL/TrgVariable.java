/**
 */
package jointPackage_CPL2SPL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_CPL2SPL.TrgVariable#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getTrgVariable()
 * @model
 * @generated
 */
public interface TrgVariable extends TrgVariablePlace {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(TrgDeclaration)
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getTrgVariable_Source()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	TrgDeclaration getSource();

	/**
	 * Sets the value of the '{@link jointPackage_CPL2SPL.TrgVariable#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(TrgDeclaration value);

} // TrgVariable
