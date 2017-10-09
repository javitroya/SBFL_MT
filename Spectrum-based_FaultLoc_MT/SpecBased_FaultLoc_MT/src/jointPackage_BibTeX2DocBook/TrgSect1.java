/**
 */
package jointPackage_BibTeX2DocBook;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Sect1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_BibTeX2DocBook.TrgSect1#getSections_2 <em>Sections 2</em>}</li>
 * </ul>
 *
 * @see jointPackage_BibTeX2DocBook.JointPackage_BibTeX2DocBookPackage#getTrgSect1()
 * @model
 * @generated
 */
public interface TrgSect1 extends TrgSection {
	/**
	 * Returns the value of the '<em><b>Sections 2</b></em>' containment reference list.
	 * The list contents are of type {@link jointPackage_BibTeX2DocBook.TrgSect2}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sections 2</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sections 2</em>' containment reference list.
	 * @see jointPackage_BibTeX2DocBook.JointPackage_BibTeX2DocBookPackage#getTrgSect1_Sections_2()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TrgSect2> getSections_2();

} // TrgSect1
