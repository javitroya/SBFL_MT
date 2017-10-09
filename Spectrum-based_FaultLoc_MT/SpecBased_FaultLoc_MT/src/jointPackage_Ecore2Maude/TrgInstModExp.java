/**
 */
package jointPackage_Ecore2Maude;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Inst Mod Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_Ecore2Maude.TrgInstModExp#getModExp <em>Mod Exp</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.TrgInstModExp#getViews <em>Views</em>}</li>
 * </ul>
 *
 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getTrgInstModExp()
 * @model
 * @generated
 */
public interface TrgInstModExp extends TrgModExpression {
	/**
	 * Returns the value of the '<em><b>Mod Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mod Exp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mod Exp</em>' containment reference.
	 * @see #setModExp(TrgModExpression)
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getTrgInstModExp_ModExp()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	TrgModExpression getModExp();

	/**
	 * Sets the value of the '{@link jointPackage_Ecore2Maude.TrgInstModExp#getModExp <em>Mod Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mod Exp</em>' containment reference.
	 * @see #getModExp()
	 * @generated
	 */
	void setModExp(TrgModExpression value);

	/**
	 * Returns the value of the '<em><b>Views</b></em>' reference list.
	 * The list contents are of type {@link jointPackage_Ecore2Maude.TrgView}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Views</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Views</em>' reference list.
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getTrgInstModExp_Views()
	 * @model required="true"
	 * @generated
	 */
	EList<TrgView> getViews();

} // TrgInstModExp
