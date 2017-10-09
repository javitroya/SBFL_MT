/**
 */
package jointPackage_CPL2SPL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Src Time Switch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_CPL2SPL.SrcTimeSwitch#getTzid <em>Tzid</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.SrcTimeSwitch#getTzurl <em>Tzurl</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.SrcTimeSwitch#getTimes <em>Times</em>}</li>
 * </ul>
 *
 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getSrcTimeSwitch()
 * @model
 * @generated
 */
public interface SrcTimeSwitch extends SrcSwitch {
	/**
	 * Returns the value of the '<em><b>Tzid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tzid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tzid</em>' attribute.
	 * @see #setTzid(String)
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getSrcTimeSwitch_Tzid()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getTzid();

	/**
	 * Sets the value of the '{@link jointPackage_CPL2SPL.SrcTimeSwitch#getTzid <em>Tzid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tzid</em>' attribute.
	 * @see #getTzid()
	 * @generated
	 */
	void setTzid(String value);

	/**
	 * Returns the value of the '<em><b>Tzurl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tzurl</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tzurl</em>' attribute.
	 * @see #setTzurl(String)
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getSrcTimeSwitch_Tzurl()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getTzurl();

	/**
	 * Sets the value of the '{@link jointPackage_CPL2SPL.SrcTimeSwitch#getTzurl <em>Tzurl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tzurl</em>' attribute.
	 * @see #getTzurl()
	 * @generated
	 */
	void setTzurl(String value);

	/**
	 * Returns the value of the '<em><b>Times</b></em>' containment reference list.
	 * The list contents are of type {@link jointPackage_CPL2SPL.SrcSwitchedTime}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Times</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Times</em>' containment reference list.
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getSrcTimeSwitch_Times()
	 * @model containment="true"
	 * @generated
	 */
	EList<SrcSwitchedTime> getTimes();

} // SrcTimeSwitch
