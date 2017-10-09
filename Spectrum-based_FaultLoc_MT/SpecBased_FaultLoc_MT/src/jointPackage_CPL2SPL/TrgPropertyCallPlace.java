/**
 */
package jointPackage_CPL2SPL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Property Call Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_CPL2SPL.TrgPropertyCallPlace#getPropName <em>Prop Name</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.TrgPropertyCallPlace#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getTrgPropertyCallPlace()
 * @model
 * @generated
 */
public interface TrgPropertyCallPlace extends TrgVariablePlace {
	/**
	 * Returns the value of the '<em><b>Prop Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prop Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prop Name</em>' attribute.
	 * @see #setPropName(String)
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getTrgPropertyCallPlace_PropName()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getPropName();

	/**
	 * Sets the value of the '{@link jointPackage_CPL2SPL.TrgPropertyCallPlace#getPropName <em>Prop Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prop Name</em>' attribute.
	 * @see #getPropName()
	 * @generated
	 */
	void setPropName(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(TrgVariablePlace)
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getTrgPropertyCallPlace_Source()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	TrgVariablePlace getSource();

	/**
	 * Sets the value of the '{@link jointPackage_CPL2SPL.TrgPropertyCallPlace#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(TrgVariablePlace value);

} // TrgPropertyCallPlace
