/**
 */
package jointPackage_BibTeX2DocBook;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Joint MM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_BibTeX2DocBook.JointMM#getSourceRoot <em>Source Root</em>}</li>
 *   <li>{@link jointPackage_BibTeX2DocBook.JointMM#getTargetRoot <em>Target Root</em>}</li>
 * </ul>
 *
 * @see jointPackage_BibTeX2DocBook.JointPackage_BibTeX2DocBookPackage#getJointMM()
 * @model
 * @generated
 */
public interface JointMM extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Root</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Root</em>' containment reference.
	 * @see #setSourceRoot(SrcMasterThesis)
	 * @see jointPackage_BibTeX2DocBook.JointPackage_BibTeX2DocBookPackage#getJointMM_SourceRoot()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SrcMasterThesis getSourceRoot();

	/**
	 * Sets the value of the '{@link jointPackage_BibTeX2DocBook.JointMM#getSourceRoot <em>Source Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Root</em>' containment reference.
	 * @see #getSourceRoot()
	 * @generated
	 */
	void setSourceRoot(SrcMasterThesis value);

	/**
	 * Returns the value of the '<em><b>Target Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Root</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Root</em>' containment reference.
	 * @see #setTargetRoot(TrgDocBook)
	 * @see jointPackage_BibTeX2DocBook.JointPackage_BibTeX2DocBookPackage#getJointMM_TargetRoot()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TrgDocBook getTargetRoot();

	/**
	 * Sets the value of the '{@link jointPackage_BibTeX2DocBook.JointMM#getTargetRoot <em>Target Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Root</em>' containment reference.
	 * @see #getTargetRoot()
	 * @generated
	 */
	void setTargetRoot(TrgDocBook value);

} // JointMM
