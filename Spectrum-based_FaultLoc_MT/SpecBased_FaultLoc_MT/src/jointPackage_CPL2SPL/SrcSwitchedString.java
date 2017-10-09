/**
 */
package jointPackage_CPL2SPL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Src Switched String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_CPL2SPL.SrcSwitchedString#getIs <em>Is</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.SrcSwitchedString#getContains <em>Contains</em>}</li>
 * </ul>
 *
 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getSrcSwitchedString()
 * @model
 * @generated
 */
public interface SrcSwitchedString extends SrcNodeContainer {
	/**
	 * Returns the value of the '<em><b>Is</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is</em>' attribute.
	 * @see #setIs(String)
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getSrcSwitchedString_Is()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getIs();

	/**
	 * Sets the value of the '{@link jointPackage_CPL2SPL.SrcSwitchedString#getIs <em>Is</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is</em>' attribute.
	 * @see #getIs()
	 * @generated
	 */
	void setIs(String value);

	/**
	 * Returns the value of the '<em><b>Contains</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' attribute.
	 * @see #setContains(String)
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getSrcSwitchedString_Contains()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getContains();

	/**
	 * Sets the value of the '{@link jointPackage_CPL2SPL.SrcSwitchedString#getContains <em>Contains</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contains</em>' attribute.
	 * @see #getContains()
	 * @generated
	 */
	void setContains(String value);

} // SrcSwitchedString
