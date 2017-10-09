/**
 */
package jointPackage_Ecore2Maude;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Joint MM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_Ecore2Maude.JointMM#getSourceRoot <em>Source Root</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.JointMM#getTargetRoot <em>Target Root</em>}</li>
 * </ul>
 *
 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getJointMM()
 * @model
 * @generated
 */
public interface JointMM extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Root</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Root</em>' containment reference.
	 * @see #setSourceRoot(SrcEStringToStringMapEntry)
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getJointMM_SourceRoot()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SrcEStringToStringMapEntry getSourceRoot();

	/**
	 * Sets the value of the '{@link jointPackage_Ecore2Maude.JointMM#getSourceRoot <em>Source Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Root</em>' containment reference.
	 * @see #getSourceRoot()
	 * @generated
	 */
	void setSourceRoot(SrcEStringToStringMapEntry value);

	/**
	 * Returns the value of the '<em><b>Target Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Root</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Root</em>' containment reference.
	 * @see #setTargetRoot(TrgEqualCond)
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getJointMM_TargetRoot()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TrgEqualCond getTargetRoot();

	/**
	 * Sets the value of the '{@link jointPackage_Ecore2Maude.JointMM#getTargetRoot <em>Target Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Root</em>' containment reference.
	 * @see #getTargetRoot()
	 * @generated
	 */
	void setTargetRoot(TrgEqualCond value);

} // JointMM
