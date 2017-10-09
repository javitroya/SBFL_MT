/**
 */
package jointPackage_Ecore2Maude;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_Ecore2Maude.TrgCondition#getLhs <em>Lhs</em>}</li>
 * </ul>
 *
 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getTrgCondition()
 * @model abstract="true"
 * @generated
 */
public interface TrgCondition extends EObject {
	/**
	 * Returns the value of the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lhs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lhs</em>' containment reference.
	 * @see #setLhs(TrgTerm)
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getTrgCondition_Lhs()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	TrgTerm getLhs();

	/**
	 * Sets the value of the '{@link jointPackage_Ecore2Maude.TrgCondition#getLhs <em>Lhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lhs</em>' containment reference.
	 * @see #getLhs()
	 * @generated
	 */
	void setLhs(TrgTerm value);

} // TrgCondition
