/**
 */
package jointPackage_BibTeX2DocBook;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_BibTeX2DocBook.TrgSection#getParas <em>Paras</em>}</li>
 * </ul>
 *
 * @see jointPackage_BibTeX2DocBook.JointPackage_BibTeX2DocBookPackage#getTrgSection()
 * @model abstract="true"
 * @generated
 */
public interface TrgSection extends TrgTitledElement {
	/**
	 * Returns the value of the '<em><b>Paras</b></em>' containment reference list.
	 * The list contents are of type {@link jointPackage_BibTeX2DocBook.TrgPara}.
	 * It is bidirectional and its opposite is '{@link jointPackage_BibTeX2DocBook.TrgPara#getSection <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paras</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paras</em>' containment reference list.
	 * @see jointPackage_BibTeX2DocBook.JointPackage_BibTeX2DocBookPackage#getTrgSection_Paras()
	 * @see jointPackage_BibTeX2DocBook.TrgPara#getSection
	 * @model opposite="section" containment="true" required="true"
	 * @generated
	 */
	EList<TrgPara> getParas();

} // TrgSection
