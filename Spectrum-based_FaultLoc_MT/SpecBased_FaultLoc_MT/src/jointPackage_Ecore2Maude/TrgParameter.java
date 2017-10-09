/**
 */
package jointPackage_Ecore2Maude;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_Ecore2Maude.TrgParameter#getLabel <em>Label</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.TrgParameter#getModExp <em>Mod Exp</em>}</li>
 * </ul>
 *
 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getTrgParameter()
 * @model
 * @generated
 */
public interface TrgParameter extends TrgModExpression {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getTrgParameter_Label()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link jointPackage_Ecore2Maude.TrgParameter#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

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
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getTrgParameter_ModExp()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	TrgModExpression getModExp();

	/**
	 * Sets the value of the '{@link jointPackage_Ecore2Maude.TrgParameter#getModExp <em>Mod Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mod Exp</em>' containment reference.
	 * @see #getModExp()
	 * @generated
	 */
	void setModExp(TrgModExpression value);

} // TrgParameter
