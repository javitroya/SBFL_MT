/**
 */
package jointPackage_BibTeX2DocBook;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Src Book</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_BibTeX2DocBook.SrcBook#getPublisher <em>Publisher</em>}</li>
 * </ul>
 *
 * @see jointPackage_BibTeX2DocBook.JointPackage_BibTeX2DocBookPackage#getSrcBook()
 * @model
 * @generated
 */
public interface SrcBook extends SrcAuthoredEntry, SrcDatedEntry, SrcTitledEntry {
	/**
	 * Returns the value of the '<em><b>Publisher</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publisher</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publisher</em>' attribute.
	 * @see #setPublisher(String)
	 * @see jointPackage_BibTeX2DocBook.JointPackage_BibTeX2DocBookPackage#getSrcBook_Publisher()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getPublisher();

	/**
	 * Sets the value of the '{@link jointPackage_BibTeX2DocBook.SrcBook#getPublisher <em>Publisher</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher</em>' attribute.
	 * @see #getPublisher()
	 * @generated
	 */
	void setPublisher(String value);

} // SrcBook
