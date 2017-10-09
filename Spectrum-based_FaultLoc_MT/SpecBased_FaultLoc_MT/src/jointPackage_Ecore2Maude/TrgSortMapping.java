/**
 */
package jointPackage_Ecore2Maude;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Sort Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_Ecore2Maude.TrgSortMapping#getFrom <em>From</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.TrgSortMapping#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getTrgSortMapping()
 * @model
 * @generated
 */
public interface TrgSortMapping extends TrgRenMapping {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(TrgSort)
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getTrgSortMapping_From()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	TrgSort getFrom();

	/**
	 * Sets the value of the '{@link jointPackage_Ecore2Maude.TrgSortMapping#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(TrgSort value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' attribute.
	 * @see #setTo(String)
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getTrgSortMapping_To()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getTo();

	/**
	 * Sets the value of the '{@link jointPackage_Ecore2Maude.TrgSortMapping#getTo <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' attribute.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(String value);

} // TrgSortMapping
