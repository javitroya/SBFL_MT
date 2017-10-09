/**
 */
package jointPackage_Ecore2Maude;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Label Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_Ecore2Maude.TrgLabelMapping#getFrom <em>From</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.TrgLabelMapping#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getTrgLabelMapping()
 * @model
 * @generated
 */
public interface TrgLabelMapping extends TrgRenMapping {
	/**
	 * Returns the value of the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' attribute.
	 * @see #setFrom(String)
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getTrgLabelMapping_From()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getFrom();

	/**
	 * Sets the value of the '{@link jointPackage_Ecore2Maude.TrgLabelMapping#getFrom <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' attribute.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(String value);

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
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getTrgLabelMapping_To()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getTo();

	/**
	 * Sets the value of the '{@link jointPackage_Ecore2Maude.TrgLabelMapping#getTo <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' attribute.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(String value);

} // TrgLabelMapping
