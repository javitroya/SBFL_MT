/**
 */
package jointPackage_CPL2SPL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Declaration Stat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_CPL2SPL.TrgDeclarationStat#getDeclaration <em>Declaration</em>}</li>
 * </ul>
 *
 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getTrgDeclarationStat()
 * @model
 * @generated
 */
public interface TrgDeclarationStat extends TrgStatement {
	/**
	 * Returns the value of the '<em><b>Declaration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declaration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declaration</em>' containment reference.
	 * @see #setDeclaration(TrgDeclaration)
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getTrgDeclarationStat_Declaration()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	TrgDeclaration getDeclaration();

	/**
	 * Sets the value of the '{@link jointPackage_CPL2SPL.TrgDeclarationStat#getDeclaration <em>Declaration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declaration</em>' containment reference.
	 * @see #getDeclaration()
	 * @generated
	 */
	void setDeclaration(TrgDeclaration value);

} // TrgDeclarationStat
