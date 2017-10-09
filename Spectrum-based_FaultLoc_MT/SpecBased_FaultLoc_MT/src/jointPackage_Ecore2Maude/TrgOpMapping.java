/**
 */
package jointPackage_Ecore2Maude;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Op Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_Ecore2Maude.TrgOpMapping#getFrom <em>From</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.TrgOpMapping#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getTrgOpMapping()
 * @model
 * @generated
 */
public interface TrgOpMapping extends TrgRenMapping {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(TrgOperation)
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getTrgOpMapping_From()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	TrgOperation getFrom();

	/**
	 * Sets the value of the '{@link jointPackage_Ecore2Maude.TrgOpMapping#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(TrgOperation value);

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
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getTrgOpMapping_To()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getTo();

	/**
	 * Sets the value of the '{@link jointPackage_Ecore2Maude.TrgOpMapping#getTo <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' attribute.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(String value);

} // TrgOpMapping
