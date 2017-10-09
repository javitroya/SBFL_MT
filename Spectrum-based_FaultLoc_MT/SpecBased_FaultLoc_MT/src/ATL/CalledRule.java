/**
 */
package ATL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Called Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ATL.CalledRule#getParameters <em>Parameters</em>}</li>
 *   <li>{@link ATL.CalledRule#isIsEntrypoint <em>Is Entrypoint</em>}</li>
 *   <li>{@link ATL.CalledRule#isIsEndpoint <em>Is Endpoint</em>}</li>
 * </ul>
 * </p>
 *
 * @see ATL.ATLPackage#getCalledRule()
 * @model
 * @generated
 */
public interface CalledRule extends Rule {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link OCL.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see ATL.ATLPackage#getCalledRule_Parameters()
	 * @model type="OCL.Parameter" containment="true" ordered="false"
	 * @generated
	 */
	EList getParameters();

	/**
	 * Returns the value of the '<em><b>Is Entrypoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Entrypoint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Entrypoint</em>' attribute.
	 * @see #setIsEntrypoint(boolean)
	 * @see ATL.ATLPackage#getCalledRule_IsEntrypoint()
	 * @model unique="false" dataType="PrimitiveTypes.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsEntrypoint();

	/**
	 * Sets the value of the '{@link ATL.CalledRule#isIsEntrypoint <em>Is Entrypoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Entrypoint</em>' attribute.
	 * @see #isIsEntrypoint()
	 * @generated
	 */
	void setIsEntrypoint(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Endpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Endpoint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Endpoint</em>' attribute.
	 * @see #setIsEndpoint(boolean)
	 * @see ATL.ATLPackage#getCalledRule_IsEndpoint()
	 * @model unique="false" dataType="PrimitiveTypes.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsEndpoint();

	/**
	 * Sets the value of the '{@link ATL.CalledRule#isIsEndpoint <em>Is Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Endpoint</em>' attribute.
	 * @see #isIsEndpoint()
	 * @generated
	 */
	void setIsEndpoint(boolean value);

} // CalledRule
