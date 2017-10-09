/**
 */
package jointPackage_CPL2SPL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg When Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_CPL2SPL.TrgWhenHeader#getHeaderId <em>Header Id</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.TrgWhenHeader#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getTrgWhenHeader()
 * @model
 * @generated
 */
public interface TrgWhenHeader extends TrgVariableDeclaration {
	/**
	 * Returns the value of the '<em><b>Header Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header Id</em>' attribute.
	 * @see #setHeaderId(String)
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getTrgWhenHeader_HeaderId()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getHeaderId();

	/**
	 * Sets the value of the '{@link jointPackage_CPL2SPL.TrgWhenHeader#getHeaderId <em>Header Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header Id</em>' attribute.
	 * @see #getHeaderId()
	 * @generated
	 */
	void setHeaderId(String value);

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
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getTrgWhenHeader_Value()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	TrgConstant getValue();

	/**
	 * Sets the value of the '{@link jointPackage_CPL2SPL.TrgWhenHeader#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(TrgConstant value);

} // TrgWhenHeader
