/**
 */
package OCL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link OCL.MapExp#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see OCL.OCLPackage#getMapExp()
 * @model
 * @generated
 */
public interface MapExp extends OclExpression {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link OCL.MapElement}.
	 * It is bidirectional and its opposite is '{@link OCL.MapElement#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see OCL.OCLPackage#getMapExp_Elements()
	 * @see OCL.MapElement#getMap
	 * @model type="OCL.MapElement" opposite="map" containment="true"
	 * @generated
	 */
	EList getElements();

} // MapExp
