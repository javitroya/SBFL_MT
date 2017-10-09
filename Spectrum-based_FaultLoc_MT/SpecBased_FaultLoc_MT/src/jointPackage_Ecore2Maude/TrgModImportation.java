/**
 */
package jointPackage_Ecore2Maude;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Mod Importation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_Ecore2Maude.TrgModImportation#getImports <em>Imports</em>}</li>
 * </ul>
 *
 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getTrgModImportation()
 * @model
 * @generated
 */
public interface TrgModImportation extends TrgModElement {
	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference.
	 * @see #setImports(TrgModExpression)
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getTrgModImportation_Imports()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	TrgModExpression getImports();

	/**
	 * Sets the value of the '{@link jointPackage_Ecore2Maude.TrgModImportation#getImports <em>Imports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imports</em>' containment reference.
	 * @see #getImports()
	 * @generated
	 */
	void setImports(TrgModExpression value);

} // TrgModImportation
