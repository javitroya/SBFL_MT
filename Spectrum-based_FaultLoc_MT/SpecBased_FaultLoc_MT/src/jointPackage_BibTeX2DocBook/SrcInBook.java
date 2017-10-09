/**
 */
package jointPackage_BibTeX2DocBook;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Src In Book</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_BibTeX2DocBook.SrcInBook#getChapter <em>Chapter</em>}</li>
 * </ul>
 *
 * @see jointPackage_BibTeX2DocBook.JointPackage_BibTeX2DocBookPackage#getSrcInBook()
 * @model
 * @generated
 */
public interface SrcInBook extends SrcBook {
	/**
	 * Returns the value of the '<em><b>Chapter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chapter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chapter</em>' attribute.
	 * @see #setChapter(int)
	 * @see jointPackage_BibTeX2DocBook.JointPackage_BibTeX2DocBookPackage#getSrcInBook_Chapter()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getChapter();

	/**
	 * Sets the value of the '{@link jointPackage_BibTeX2DocBook.SrcInBook#getChapter <em>Chapter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chapter</em>' attribute.
	 * @see #getChapter()
	 * @generated
	 */
	void setChapter(int value);

} // SrcInBook
