/**
 */
package jointPackage_BibTeX2DocBook;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Src Titled Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_BibTeX2DocBook.SrcTitledEntry#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @see jointPackage_BibTeX2DocBook.JointPackage_BibTeX2DocBookPackage#getSrcTitledEntry()
 * @model abstract="true"
 * @generated
 */
public interface SrcTitledEntry extends SrcBibTeXEntry {
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
	 * @see jointPackage_BibTeX2DocBook.JointPackage_BibTeX2DocBookPackage#getSrcTitledEntry_Title()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link jointPackage_BibTeX2DocBook.SrcTitledEntry#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

} // SrcTitledEntry
