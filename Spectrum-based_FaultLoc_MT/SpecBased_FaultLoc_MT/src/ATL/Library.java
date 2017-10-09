/**
 */
package ATL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ATL.Library#getHelpers <em>Helpers</em>}</li>
 * </ul>
 * </p>
 *
 * @see ATL.ATLPackage#getLibrary()
 * @model
 * @generated
 */
public interface Library extends Unit {
	/**
	 * Returns the value of the '<em><b>Helpers</b></em>' containment reference list.
	 * The list contents are of type {@link ATL.Helper}.
	 * It is bidirectional and its opposite is '{@link ATL.Helper#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Helpers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Helpers</em>' containment reference list.
	 * @see ATL.ATLPackage#getLibrary_Helpers()
	 * @see ATL.Helper#getLibrary
	 * @model type="ATL.Helper" opposite="library" containment="true"
	 * @generated
	 */
	EList getHelpers();

} // Library
