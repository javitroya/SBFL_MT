/**
 */
package jointPackage_CPL2SPL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Constant Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_CPL2SPL.TrgConstantExp#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getTrgConstantExp()
 * @model
 * @generated
 */
public interface TrgConstantExp extends TrgExpression {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(TrgConstant)
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getTrgConstantExp_Value()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	TrgConstant getValue();

	/**
	 * Sets the value of the '{@link jointPackage_CPL2SPL.TrgConstantExp#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(TrgConstant value);

} // TrgConstantExp
