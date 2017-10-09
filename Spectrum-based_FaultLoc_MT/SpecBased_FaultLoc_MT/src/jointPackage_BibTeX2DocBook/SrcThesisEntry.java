/**
 */
package jointPackage_BibTeX2DocBook;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Src Thesis Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_BibTeX2DocBook.SrcThesisEntry#getSchool <em>School</em>}</li>
 * </ul>
 *
 * @see jointPackage_BibTeX2DocBook.JointPackage_BibTeX2DocBookPackage#getSrcThesisEntry()
 * @model abstract="true"
 * @generated
 */
public interface SrcThesisEntry extends SrcAuthoredEntry, SrcDatedEntry, SrcTitledEntry {
	/**
	 * Returns the value of the '<em><b>School</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>School</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>School</em>' attribute.
	 * @see #setSchool(String)
	 * @see jointPackage_BibTeX2DocBook.JointPackage_BibTeX2DocBookPackage#getSrcThesisEntry_School()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getSchool();

	/**
	 * Sets the value of the '{@link jointPackage_BibTeX2DocBook.SrcThesisEntry#getSchool <em>School</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>School</em>' attribute.
	 * @see #getSchool()
	 * @generated
	 */
	void setSchool(String value);

} // SrcThesisEntry
