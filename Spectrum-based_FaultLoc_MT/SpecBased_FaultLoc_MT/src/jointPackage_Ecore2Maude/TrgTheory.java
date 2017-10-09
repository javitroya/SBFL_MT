/**
 */
package jointPackage_Ecore2Maude;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Theory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_Ecore2Maude.TrgTheory#getEls <em>Els</em>}</li>
 * </ul>
 *
 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getTrgTheory()
 * @model abstract="true"
 * @generated
 */
public interface TrgTheory extends TrgMaudeTopEl {
	/**
	 * Returns the value of the '<em><b>Els</b></em>' containment reference list.
	 * The list contents are of type {@link jointPackage_Ecore2Maude.TrgModElement}.
	 * It is bidirectional and its opposite is '{@link jointPackage_Ecore2Maude.TrgModElement#getTheory <em>Theory</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Els</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Els</em>' containment reference list.
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getTrgTheory_Els()
	 * @see jointPackage_Ecore2Maude.TrgModElement#getTheory
	 * @model opposite="theory" containment="true" ordered="false"
	 * @generated
	 */
	EList<TrgModElement> getEls();

} // TrgTheory
