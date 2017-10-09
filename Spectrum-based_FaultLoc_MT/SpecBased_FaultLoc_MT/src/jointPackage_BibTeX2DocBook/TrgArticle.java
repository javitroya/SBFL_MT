/**
 */
package jointPackage_BibTeX2DocBook;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Article</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_BibTeX2DocBook.TrgArticle#getSections_1 <em>Sections 1</em>}</li>
 * </ul>
 *
 * @see jointPackage_BibTeX2DocBook.JointPackage_BibTeX2DocBookPackage#getTrgArticle()
 * @model
 * @generated
 */
public interface TrgArticle extends TrgTitledElement {
	/**
	 * Returns the value of the '<em><b>Sections 1</b></em>' containment reference list.
	 * The list contents are of type {@link jointPackage_BibTeX2DocBook.TrgSect1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sections 1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sections 1</em>' containment reference list.
	 * @see jointPackage_BibTeX2DocBook.JointPackage_BibTeX2DocBookPackage#getTrgArticle_Sections_1()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TrgSect1> getSections_1();

} // TrgArticle
