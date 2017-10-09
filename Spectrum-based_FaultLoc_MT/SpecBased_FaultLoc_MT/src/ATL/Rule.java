/**
 */
package ATL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ATL.Rule#getOutPattern <em>Out Pattern</em>}</li>
 *   <li>{@link ATL.Rule#getActionBlock <em>Action Block</em>}</li>
 *   <li>{@link ATL.Rule#getVariables <em>Variables</em>}</li>
 *   <li>{@link ATL.Rule#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see ATL.ATLPackage#getRule()
 * @model abstract="true"
 * @generated
 */
public interface Rule extends ModuleElement {
	/**
	 * Returns the value of the '<em><b>Out Pattern</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link ATL.OutPattern#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Pattern</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Pattern</em>' containment reference.
	 * @see #setOutPattern(OutPattern)
	 * @see ATL.ATLPackage#getRule_OutPattern()
	 * @see ATL.OutPattern#getRule
	 * @model opposite="rule" containment="true" ordered="false"
	 * @generated
	 */
	OutPattern getOutPattern();

	/**
	 * Sets the value of the '{@link ATL.Rule#getOutPattern <em>Out Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Pattern</em>' containment reference.
	 * @see #getOutPattern()
	 * @generated
	 */
	void setOutPattern(OutPattern value);

	/**
	 * Returns the value of the '<em><b>Action Block</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link ATL.ActionBlock#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Block</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Block</em>' containment reference.
	 * @see #setActionBlock(ActionBlock)
	 * @see ATL.ATLPackage#getRule_ActionBlock()
	 * @see ATL.ActionBlock#getRule
	 * @model opposite="rule" containment="true" ordered="false"
	 * @generated
	 */
	ActionBlock getActionBlock();

	/**
	 * Sets the value of the '{@link ATL.Rule#getActionBlock <em>Action Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Block</em>' containment reference.
	 * @see #getActionBlock()
	 * @generated
	 */
	void setActionBlock(ActionBlock value);

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link ATL.RuleVariableDeclaration}.
	 * It is bidirectional and its opposite is '{@link ATL.RuleVariableDeclaration#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see ATL.ATLPackage#getRule_Variables()
	 * @see ATL.RuleVariableDeclaration#getRule
	 * @model type="ATL.RuleVariableDeclaration" opposite="rule" containment="true"
	 * @generated
	 */
	EList getVariables();

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
	 * @see ATL.ATLPackage#getRule_Name()
	 * @model unique="false" dataType="PrimitiveTypes.String" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ATL.Rule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Rule
