/**
 */
package OCL;

import ATL.LocatedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ocl Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link OCL.OclModel#getName <em>Name</em>}</li>
 *   <li>{@link OCL.OclModel#getMetamodel <em>Metamodel</em>}</li>
 *   <li>{@link OCL.OclModel#getElements <em>Elements</em>}</li>
 *   <li>{@link OCL.OclModel#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see OCL.OCLPackage#getOclModel()
 * @model
 * @generated
 */
public interface OclModel extends LocatedElement {
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
	 * @see OCL.OCLPackage#getOclModel_Name()
	 * @model unique="false" dataType="PrimitiveTypes.String" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link OCL.OclModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Metamodel</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link OCL.OclModel#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metamodel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metamodel</em>' reference.
	 * @see #setMetamodel(OclModel)
	 * @see OCL.OCLPackage#getOclModel_Metamodel()
	 * @see OCL.OclModel#getModel
	 * @model opposite="model" required="true" ordered="false"
	 * @generated
	 */
	OclModel getMetamodel();

	/**
	 * Sets the value of the '{@link OCL.OclModel#getMetamodel <em>Metamodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metamodel</em>' reference.
	 * @see #getMetamodel()
	 * @generated
	 */
	void setMetamodel(OclModel value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' reference list.
	 * The list contents are of type {@link OCL.OclModelElement}.
	 * It is bidirectional and its opposite is '{@link OCL.OclModelElement#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' reference list.
	 * @see OCL.OCLPackage#getOclModel_Elements()
	 * @see OCL.OclModelElement#getModel
	 * @model type="OCL.OclModelElement" opposite="model" ordered="false"
	 * @generated
	 */
	EList getElements();

	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference list.
	 * The list contents are of type {@link OCL.OclModel}.
	 * It is bidirectional and its opposite is '{@link OCL.OclModel#getMetamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference list.
	 * @see OCL.OCLPackage#getOclModel_Model()
	 * @see OCL.OclModel#getMetamodel
	 * @model type="OCL.OclModel" opposite="metamodel" ordered="false"
	 * @generated
	 */
	EList getModel();

} // OclModel
