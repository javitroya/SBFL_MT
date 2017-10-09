/**
 */
package jointPackage_Ecore2Maude;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Module Id Mod Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_Ecore2Maude.TrgModuleIdModExp#getModule <em>Module</em>}</li>
 * </ul>
 *
 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getTrgModuleIdModExp()
 * @model
 * @generated
 */
public interface TrgModuleIdModExp extends TrgModExpression {
	/**
	 * Returns the value of the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' reference.
	 * @see #setModule(TrgModule)
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getTrgModuleIdModExp_Module()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	TrgModule getModule();

	/**
	 * Sets the value of the '{@link jointPackage_Ecore2Maude.TrgModuleIdModExp#getModule <em>Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' reference.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(TrgModule value);

} // TrgModuleIdModExp
