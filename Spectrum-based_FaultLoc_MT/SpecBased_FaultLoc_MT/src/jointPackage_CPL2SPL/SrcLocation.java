/**
 */
package jointPackage_CPL2SPL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Src Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_CPL2SPL.SrcLocation#getUrl <em>Url</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.SrcLocation#getPriority <em>Priority</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.SrcLocation#getClear <em>Clear</em>}</li>
 * </ul>
 *
 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getSrcLocation()
 * @model
 * @generated
 */
public interface SrcLocation extends SrcNode, SrcNodeContainer {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getSrcLocation_Url()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link jointPackage_CPL2SPL.SrcLocation#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(String)
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getSrcLocation_Priority()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getPriority();

	/**
	 * Sets the value of the '{@link jointPackage_CPL2SPL.SrcLocation#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(String value);

	/**
	 * Returns the value of the '<em><b>Clear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clear</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clear</em>' attribute.
	 * @see #setClear(String)
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getSrcLocation_Clear()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getClear();

	/**
	 * Sets the value of the '{@link jointPackage_CPL2SPL.SrcLocation#getClear <em>Clear</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clear</em>' attribute.
	 * @see #getClear()
	 * @generated
	 */
	void setClear(String value);

} // SrcLocation
