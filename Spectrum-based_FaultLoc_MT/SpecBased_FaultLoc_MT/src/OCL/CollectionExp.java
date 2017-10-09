/**
 */
package OCL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link OCL.CollectionExp#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see OCL.OCLPackage#getCollectionExp()
 * @model abstract="true"
 * @generated
 */
public interface CollectionExp extends OclExpression {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link OCL.OclExpression}.
	 * It is bidirectional and its opposite is '{@link OCL.OclExpression#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see OCL.OCLPackage#getCollectionExp_Elements()
	 * @see OCL.OclExpression#getCollection
	 * @model type="OCL.OclExpression" opposite="collection" containment="true"
	 * @generated
	 */
	EList getElements();

} // CollectionExp
