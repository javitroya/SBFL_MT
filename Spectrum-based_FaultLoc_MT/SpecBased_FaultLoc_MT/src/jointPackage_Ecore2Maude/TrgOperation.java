/**
 */
package jointPackage_Ecore2Maude;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_Ecore2Maude.TrgOperation#getName <em>Name</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.TrgOperation#getCoarity <em>Coarity</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.TrgOperation#getArity <em>Arity</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.TrgOperation#getAtts <em>Atts</em>}</li>
 * </ul>
 *
 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getTrgOperation()
 * @model
 * @generated
 */
public interface TrgOperation extends TrgModElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getTrgOperation_Name()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link jointPackage_Ecore2Maude.TrgOperation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Coarity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coarity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coarity</em>' reference.
	 * @see #setCoarity(TrgType)
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getTrgOperation_Coarity()
	 * @model ordered="false"
	 * @generated
	 */
	TrgType getCoarity();

	/**
	 * Sets the value of the '{@link jointPackage_Ecore2Maude.TrgOperation#getCoarity <em>Coarity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coarity</em>' reference.
	 * @see #getCoarity()
	 * @generated
	 */
	void setCoarity(TrgType value);

	/**
	 * Returns the value of the '<em><b>Arity</b></em>' reference list.
	 * The list contents are of type {@link jointPackage_Ecore2Maude.TrgType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arity</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arity</em>' reference list.
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getTrgOperation_Arity()
	 * @model
	 * @generated
	 */
	EList<TrgType> getArity();

	/**
	 * Returns the value of the '<em><b>Atts</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atts</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atts</em>' attribute list.
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getTrgOperation_Atts()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	EList<String> getAtts();

} // TrgOperation
