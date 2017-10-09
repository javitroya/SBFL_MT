/**
 */
package jointPackage_CPL2SPL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Src Redirect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_CPL2SPL.SrcRedirect#getPermanent <em>Permanent</em>}</li>
 * </ul>
 *
 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getSrcRedirect()
 * @model
 * @generated
 */
public interface SrcRedirect extends SrcSignallingAction {
	/**
	 * Returns the value of the '<em><b>Permanent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Permanent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permanent</em>' attribute.
	 * @see #setPermanent(String)
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getSrcRedirect_Permanent()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getPermanent();

	/**
	 * Sets the value of the '{@link jointPackage_CPL2SPL.SrcRedirect#getPermanent <em>Permanent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permanent</em>' attribute.
	 * @see #getPermanent()
	 * @generated
	 */
	void setPermanent(String value);

} // SrcRedirect
