/**
 */
package jointPackage_CPL2SPL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Src Switch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_CPL2SPL.SrcSwitch#getNotPresent <em>Not Present</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.SrcSwitch#getOtherwise <em>Otherwise</em>}</li>
 * </ul>
 *
 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getSrcSwitch()
 * @model abstract="true"
 * @generated
 */
public interface SrcSwitch extends SrcNode {
	/**
	 * Returns the value of the '<em><b>Not Present</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Not Present</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Present</em>' containment reference.
	 * @see #setNotPresent(SrcNotPresent)
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getSrcSwitch_NotPresent()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	SrcNotPresent getNotPresent();

	/**
	 * Sets the value of the '{@link jointPackage_CPL2SPL.SrcSwitch#getNotPresent <em>Not Present</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not Present</em>' containment reference.
	 * @see #getNotPresent()
	 * @generated
	 */
	void setNotPresent(SrcNotPresent value);

	/**
	 * Returns the value of the '<em><b>Otherwise</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Otherwise</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Otherwise</em>' containment reference.
	 * @see #setOtherwise(SrcOtherwise)
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getSrcSwitch_Otherwise()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	SrcOtherwise getOtherwise();

	/**
	 * Sets the value of the '{@link jointPackage_CPL2SPL.SrcSwitch#getOtherwise <em>Otherwise</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Otherwise</em>' containment reference.
	 * @see #getOtherwise()
	 * @generated
	 */
	void setOtherwise(SrcOtherwise value);

} // SrcSwitch
