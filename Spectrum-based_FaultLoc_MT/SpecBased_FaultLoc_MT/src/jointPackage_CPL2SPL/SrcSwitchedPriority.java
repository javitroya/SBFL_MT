/**
 */
package jointPackage_CPL2SPL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Src Switched Priority</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_CPL2SPL.SrcSwitchedPriority#getLess <em>Less</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.SrcSwitchedPriority#getGreater <em>Greater</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.SrcSwitchedPriority#getEqual <em>Equal</em>}</li>
 * </ul>
 *
 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getSrcSwitchedPriority()
 * @model
 * @generated
 */
public interface SrcSwitchedPriority extends SrcNodeContainer {
	/**
	 * Returns the value of the '<em><b>Less</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Less</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Less</em>' attribute.
	 * @see #setLess(String)
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getSrcSwitchedPriority_Less()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getLess();

	/**
	 * Sets the value of the '{@link jointPackage_CPL2SPL.SrcSwitchedPriority#getLess <em>Less</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Less</em>' attribute.
	 * @see #getLess()
	 * @generated
	 */
	void setLess(String value);

	/**
	 * Returns the value of the '<em><b>Greater</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Greater</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Greater</em>' attribute.
	 * @see #setGreater(String)
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getSrcSwitchedPriority_Greater()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getGreater();

	/**
	 * Sets the value of the '{@link jointPackage_CPL2SPL.SrcSwitchedPriority#getGreater <em>Greater</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Greater</em>' attribute.
	 * @see #getGreater()
	 * @generated
	 */
	void setGreater(String value);

	/**
	 * Returns the value of the '<em><b>Equal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equal</em>' attribute.
	 * @see #setEqual(String)
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getSrcSwitchedPriority_Equal()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getEqual();

	/**
	 * Sets the value of the '{@link jointPackage_CPL2SPL.SrcSwitchedPriority#getEqual <em>Equal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Equal</em>' attribute.
	 * @see #getEqual()
	 * @generated
	 */
	void setEqual(String value);

} // SrcSwitchedPriority
