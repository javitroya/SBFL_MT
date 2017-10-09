/**
 */
package jointPackage_Ecore2Maude;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Theory Id Mod Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_Ecore2Maude.TrgTheoryIdModExp#getTheory <em>Theory</em>}</li>
 * </ul>
 *
 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getTrgTheoryIdModExp()
 * @model
 * @generated
 */
public interface TrgTheoryIdModExp extends TrgModExpression {
	/**
	 * Returns the value of the '<em><b>Theory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Theory</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Theory</em>' reference.
	 * @see #setTheory(TrgTheory)
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getTrgTheoryIdModExp_Theory()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	TrgTheory getTheory();

	/**
	 * Sets the value of the '{@link jointPackage_Ecore2Maude.TrgTheoryIdModExp#getTheory <em>Theory</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Theory</em>' reference.
	 * @see #getTheory()
	 * @generated
	 */
	void setTheory(TrgTheory value);

} // TrgTheoryIdModExp
