/**
 */
package jointPackage_CPL2SPL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Src Node Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_CPL2SPL.SrcNodeContainer#getContents <em>Contents</em>}</li>
 * </ul>
 *
 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getSrcNodeContainer()
 * @model abstract="true"
 * @generated
 */
public interface SrcNodeContainer extends SrcElement {
	/**
	 * Returns the value of the '<em><b>Contents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contents</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' reference.
	 * @see #setContents(SrcNode)
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getSrcNodeContainer_Contents()
	 * @model ordered="false"
	 * @generated
	 */
	SrcNode getContents();

	/**
	 * Sets the value of the '{@link jointPackage_CPL2SPL.SrcNodeContainer#getContents <em>Contents</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contents</em>' reference.
	 * @see #getContents()
	 * @generated
	 */
	void setContents(SrcNode value);

} // SrcNodeContainer
