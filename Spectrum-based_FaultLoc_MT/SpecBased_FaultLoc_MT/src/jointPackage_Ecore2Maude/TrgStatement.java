/**
 */
package jointPackage_Ecore2Maude;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_Ecore2Maude.TrgStatement#getLabel <em>Label</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.TrgStatement#getAtts <em>Atts</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.TrgStatement#getConds <em>Conds</em>}</li>
 * </ul>
 *
 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getTrgStatement()
 * @model abstract="true"
 * @generated
 */
public interface TrgStatement extends TrgModElement {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getTrgStatement_Label()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link jointPackage_Ecore2Maude.TrgStatement#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

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
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getTrgStatement_Atts()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	EList<String> getAtts();

	/**
	 * Returns the value of the '<em><b>Conds</b></em>' containment reference list.
	 * The list contents are of type {@link jointPackage_Ecore2Maude.TrgCondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conds</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conds</em>' containment reference list.
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getTrgStatement_Conds()
	 * @model containment="true"
	 * @generated
	 */
	EList<TrgCondition> getConds();

} // TrgStatement
