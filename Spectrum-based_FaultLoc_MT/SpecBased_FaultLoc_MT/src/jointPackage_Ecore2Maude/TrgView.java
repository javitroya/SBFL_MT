/**
 */
package jointPackage_Ecore2Maude;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_Ecore2Maude.TrgView#getFrom <em>From</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.TrgView#getTo <em>To</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.TrgView#getEls <em>Els</em>}</li>
 * </ul>
 *
 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getTrgView()
 * @model
 * @generated
 */
public interface TrgView extends TrgMaudeTopEl {
	/**
	 * Returns the value of the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' containment reference.
	 * @see #setFrom(TrgModExpression)
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getTrgView_From()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	TrgModExpression getFrom();

	/**
	 * Sets the value of the '{@link jointPackage_Ecore2Maude.TrgView#getFrom <em>From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' containment reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(TrgModExpression value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' containment reference.
	 * @see #setTo(TrgModExpression)
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getTrgView_To()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	TrgModExpression getTo();

	/**
	 * Sets the value of the '{@link jointPackage_Ecore2Maude.TrgView#getTo <em>To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' containment reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(TrgModExpression value);

	/**
	 * Returns the value of the '<em><b>Els</b></em>' containment reference list.
	 * The list contents are of type {@link jointPackage_Ecore2Maude.TrgViewMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Els</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Els</em>' containment reference list.
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getTrgView_Els()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TrgViewMapping> getEls();

} // TrgView
