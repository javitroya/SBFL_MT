/**
 */
package class_;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link class_.ClassModel#getElems <em>Elems</em>}</li>
 * </ul>
 * </p>
 *
 * @see class_.ClassPackage#getClassModel()
 * @model
 * @generated
 */
public interface ClassModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Elems</b></em>' containment reference list.
	 * The list contents are of type {@link class_.NamedElt}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elems</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elems</em>' containment reference list.
	 * @see class_.ClassPackage#getClassModel_Elems()
	 * @model containment="true"
	 * @generated
	 */
	EList<NamedElt> getElems();

} // ClassModel
