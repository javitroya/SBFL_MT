/**
 */
package jointPackage_Ecore2Maude;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Src EEnum Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_Ecore2Maude.SrcEEnumLiteral#getValue <em>Value</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.SrcEEnumLiteral#getLiteral <em>Literal</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.SrcEEnumLiteral#getEEnum <em>EEnum</em>}</li>
 * </ul>
 *
 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getSrcEEnumLiteral()
 * @model
 * @generated
 */
public interface SrcEEnumLiteral extends SrcENamedElement {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getSrcEEnumLiteral_Value()
	 * @model
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link jointPackage_Ecore2Maude.SrcEEnumLiteral#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

	/**
	 * Returns the value of the '<em><b>Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal</em>' attribute.
	 * @see #setLiteral(String)
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getSrcEEnumLiteral_Literal()
	 * @model
	 * @generated
	 */
	String getLiteral();

	/**
	 * Sets the value of the '{@link jointPackage_Ecore2Maude.SrcEEnumLiteral#getLiteral <em>Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Literal</em>' attribute.
	 * @see #getLiteral()
	 * @generated
	 */
	void setLiteral(String value);

	/**
	 * Returns the value of the '<em><b>EEnum</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link jointPackage_Ecore2Maude.SrcEEnum#getELiterals <em>ELiterals</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EEnum</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EEnum</em>' container reference.
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getSrcEEnumLiteral_EEnum()
	 * @see jointPackage_Ecore2Maude.SrcEEnum#getELiterals
	 * @model opposite="eLiterals" resolveProxies="false" changeable="false"
	 * @generated
	 */
	SrcEEnum getEEnum();

} // SrcEEnumLiteral
