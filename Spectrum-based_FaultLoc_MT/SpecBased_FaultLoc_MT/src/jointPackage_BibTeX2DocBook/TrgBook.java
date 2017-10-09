/**
 */
package jointPackage_BibTeX2DocBook;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Book</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_BibTeX2DocBook.TrgBook#getArticles <em>Articles</em>}</li>
 * </ul>
 *
 * @see jointPackage_BibTeX2DocBook.JointPackage_BibTeX2DocBookPackage#getTrgBook()
 * @model
 * @generated
 */
public interface TrgBook extends EObject {
	/**
	 * Returns the value of the '<em><b>Articles</b></em>' containment reference list.
	 * The list contents are of type {@link jointPackage_BibTeX2DocBook.TrgArticle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Articles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Articles</em>' containment reference list.
	 * @see jointPackage_BibTeX2DocBook.JointPackage_BibTeX2DocBookPackage#getTrgBook_Articles()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TrgArticle> getArticles();

} // TrgBook
