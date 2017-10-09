/**
 */
package jointPackage_BibTeX2DocBook;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Titled Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_BibTeX2DocBook.TrgTitledElement#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @see jointPackage_BibTeX2DocBook.JointPackage_BibTeX2DocBookPackage#getTrgTitledElement()
 * @model abstract="true"
 * @generated
 */
public interface TrgTitledElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see jointPackage_BibTeX2DocBook.JointPackage_BibTeX2DocBookPackage#getTrgTitledElement_Title()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link jointPackage_BibTeX2DocBook.TrgTitledElement#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

} // TrgTitledElement
