/**
 */
package jointPackage_BibTeX2DocBook;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Src Authored Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_BibTeX2DocBook.SrcAuthoredEntry#getAuthors <em>Authors</em>}</li>
 * </ul>
 *
 * @see jointPackage_BibTeX2DocBook.JointPackage_BibTeX2DocBookPackage#getSrcAuthoredEntry()
 * @model abstract="true"
 * @generated
 */
public interface SrcAuthoredEntry extends SrcBibTeXEntry {
	/**
	 * Returns the value of the '<em><b>Authors</b></em>' containment reference list.
	 * The list contents are of type {@link jointPackage_BibTeX2DocBook.SrcAuthor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authors</em>' containment reference list.
	 * @see jointPackage_BibTeX2DocBook.JointPackage_BibTeX2DocBookPackage#getSrcAuthoredEntry_Authors()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SrcAuthor> getAuthors();

} // SrcAuthoredEntry
