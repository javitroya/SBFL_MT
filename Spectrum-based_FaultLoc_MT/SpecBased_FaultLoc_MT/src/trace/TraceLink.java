/**
 */
package trace;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link trace.TraceLink#getSourceElements <em>Source Elements</em>}</li>
 *   <li>{@link trace.TraceLink#getTargetElements <em>Target Elements</em>}</li>
 *   <li>{@link trace.TraceLink#getRuleName <em>Rule Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see trace.TracePackage#getTraceLink()
 * @model
 * @generated
 */
public interface TraceLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Elements</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Elements</em>' reference list.
	 * @see trace.TracePackage#getTraceLink_SourceElements()
	 * @model
	 * @generated
	 */
	EList<EObject> getSourceElements();

	/**
	 * Returns the value of the '<em><b>Target Elements</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Elements</em>' reference list.
	 * @see trace.TracePackage#getTraceLink_TargetElements()
	 * @model
	 * @generated
	 */
	EList<EObject> getTargetElements();

	/**
	 * Returns the value of the '<em><b>Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Name</em>' attribute.
	 * @see #setRuleName(String)
	 * @see trace.TracePackage#getTraceLink_RuleName()
	 * @model
	 * @generated
	 */
	String getRuleName();

	/**
	 * Sets the value of the '{@link trace.TraceLink#getRuleName <em>Rule Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule Name</em>' attribute.
	 * @see #getRuleName()
	 * @generated
	 */
	void setRuleName(String value);

} // TraceLink
