/**
 */
package jointPackage_Ecore2Maude;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Term Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_Ecore2Maude.TrgTermMapping#getFrom <em>From</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.TrgTermMapping#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getTrgTermMapping()
 * @model
 * @generated
 */
public interface TrgTermMapping extends TrgViewMapping {
	/**
	 * Returns the value of the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' containment reference.
	 * @see #setFrom(TrgTerm)
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getTrgTermMapping_From()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	TrgTerm getFrom();

	/**
	 * Sets the value of the '{@link jointPackage_Ecore2Maude.TrgTermMapping#getFrom <em>From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' containment reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(TrgTerm value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' containment reference.
	 * @see #setTo(TrgTerm)
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getTrgTermMapping_To()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	TrgTerm getTo();

	/**
	 * Sets the value of the '{@link jointPackage_Ecore2Maude.TrgTermMapping#getTo <em>To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' containment reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(TrgTerm value);

} // TrgTermMapping
