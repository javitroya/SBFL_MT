/**
 */
package jointPackage_CPL2SPL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Src Switched Language</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_CPL2SPL.SrcSwitchedLanguage#getMatches <em>Matches</em>}</li>
 * </ul>
 *
 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getSrcSwitchedLanguage()
 * @model
 * @generated
 */
public interface SrcSwitchedLanguage extends SrcNodeContainer {
	/**
	 * Returns the value of the '<em><b>Matches</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matches</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matches</em>' attribute.
	 * @see #setMatches(String)
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getSrcSwitchedLanguage_Matches()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getMatches();

	/**
	 * Sets the value of the '{@link jointPackage_CPL2SPL.SrcSwitchedLanguage#getMatches <em>Matches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matches</em>' attribute.
	 * @see #getMatches()
	 * @generated
	 */
	void setMatches(String value);

} // SrcSwitchedLanguage
