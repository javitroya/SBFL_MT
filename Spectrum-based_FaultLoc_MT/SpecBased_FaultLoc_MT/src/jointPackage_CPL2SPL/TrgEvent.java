/**
 */
package jointPackage_CPL2SPL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_CPL2SPL.TrgEvent#getEventId <em>Event Id</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.TrgEvent#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.TrgEvent#getMethods <em>Methods</em>}</li>
 * </ul>
 *
 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getTrgEvent()
 * @model
 * @generated
 */
public interface TrgEvent extends TrgSession {
	/**
	 * Returns the value of the '<em><b>Event Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Id</em>' attribute.
	 * @see #setEventId(String)
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getTrgEvent_EventId()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getEventId();

	/**
	 * Sets the value of the '{@link jointPackage_CPL2SPL.TrgEvent#getEventId <em>Event Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Id</em>' attribute.
	 * @see #getEventId()
	 * @generated
	 */
	void setEventId(String value);

	/**
	 * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link jointPackage_CPL2SPL.TrgDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declarations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declarations</em>' containment reference list.
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getTrgEvent_Declarations()
	 * @model containment="true"
	 * @generated
	 */
	EList<TrgDeclaration> getDeclarations();

	/**
	 * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
	 * The list contents are of type {@link jointPackage_CPL2SPL.TrgMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Methods</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' containment reference list.
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getTrgEvent_Methods()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TrgMethod> getMethods();

} // TrgEvent
