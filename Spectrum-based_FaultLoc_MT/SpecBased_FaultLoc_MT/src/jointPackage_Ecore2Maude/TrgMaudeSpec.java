/**
 */
package jointPackage_Ecore2Maude;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Maude Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_Ecore2Maude.TrgMaudeSpec#getEls <em>Els</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.TrgMaudeSpec#getPrintableEls <em>Printable Els</em>}</li>
 * </ul>
 *
 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getTrgMaudeSpec()
 * @model
 * @generated
 */
public interface TrgMaudeSpec extends EObject {
	/**
	 * Returns the value of the '<em><b>Els</b></em>' containment reference list.
	 * The list contents are of type {@link jointPackage_Ecore2Maude.TrgMaudeTopEl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Els</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Els</em>' containment reference list.
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getTrgMaudeSpec_Els()
	 * @model containment="true"
	 * @generated
	 */
	EList<TrgMaudeTopEl> getEls();

	/**
	 * Returns the value of the '<em><b>Printable Els</b></em>' reference list.
	 * The list contents are of type {@link jointPackage_Ecore2Maude.TrgMaudeTopEl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Printable Els</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Printable Els</em>' reference list.
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getTrgMaudeSpec_PrintableEls()
	 * @model
	 * @generated
	 */
	EList<TrgMaudeTopEl> getPrintableEls();

} // TrgMaudeSpec
