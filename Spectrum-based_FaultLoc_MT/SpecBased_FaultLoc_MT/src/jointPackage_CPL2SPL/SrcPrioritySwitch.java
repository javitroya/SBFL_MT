/**
 */
package jointPackage_CPL2SPL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Src Priority Switch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_CPL2SPL.SrcPrioritySwitch#getPriorities <em>Priorities</em>}</li>
 * </ul>
 *
 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getSrcPrioritySwitch()
 * @model
 * @generated
 */
public interface SrcPrioritySwitch extends SrcSwitch {
	/**
	 * Returns the value of the '<em><b>Priorities</b></em>' containment reference list.
	 * The list contents are of type {@link jointPackage_CPL2SPL.SrcSwitchedPriority}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priorities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priorities</em>' containment reference list.
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getSrcPrioritySwitch_Priorities()
	 * @model containment="true"
	 * @generated
	 */
	EList<SrcSwitchedPriority> getPriorities();

} // SrcPrioritySwitch
