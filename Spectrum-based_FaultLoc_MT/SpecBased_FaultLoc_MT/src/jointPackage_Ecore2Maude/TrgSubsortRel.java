/**
 */
package jointPackage_Ecore2Maude;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Subsort Rel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_Ecore2Maude.TrgSubsortRel#getSubsorts <em>Subsorts</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.TrgSubsortRel#getSupersorts <em>Supersorts</em>}</li>
 * </ul>
 *
 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getTrgSubsortRel()
 * @model
 * @generated
 */
public interface TrgSubsortRel extends TrgModElement {
	/**
	 * Returns the value of the '<em><b>Subsorts</b></em>' reference list.
	 * The list contents are of type {@link jointPackage_Ecore2Maude.TrgSort}.
	 * It is bidirectional and its opposite is '{@link jointPackage_Ecore2Maude.TrgSort#getSupersortRels <em>Supersort Rels</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subsorts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subsorts</em>' reference list.
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getTrgSubsortRel_Subsorts()
	 * @see jointPackage_Ecore2Maude.TrgSort#getSupersortRels
	 * @model opposite="supersortRels" required="true" ordered="false"
	 * @generated
	 */
	EList<TrgSort> getSubsorts();

	/**
	 * Returns the value of the '<em><b>Supersorts</b></em>' reference list.
	 * The list contents are of type {@link jointPackage_Ecore2Maude.TrgSort}.
	 * It is bidirectional and its opposite is '{@link jointPackage_Ecore2Maude.TrgSort#getSubsortRels <em>Subsort Rels</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supersorts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supersorts</em>' reference list.
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getTrgSubsortRel_Supersorts()
	 * @see jointPackage_Ecore2Maude.TrgSort#getSubsortRels
	 * @model opposite="subsortRels" required="true" ordered="false"
	 * @generated
	 */
	EList<TrgSort> getSupersorts();

} // TrgSubsortRel
