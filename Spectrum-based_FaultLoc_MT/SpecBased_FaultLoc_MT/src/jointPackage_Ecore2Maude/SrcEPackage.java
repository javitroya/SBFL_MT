/**
 */
package jointPackage_Ecore2Maude;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Src EPackage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_Ecore2Maude.SrcEPackage#getNsURI <em>Ns URI</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.SrcEPackage#getNsPrefix <em>Ns Prefix</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.SrcEPackage#getEClassifiers <em>EClassifiers</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.SrcEPackage#getESubpackages <em>ESubpackages</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.SrcEPackage#getESuperPackage <em>ESuper Package</em>}</li>
 * </ul>
 *
 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getSrcEPackage()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='WellFormedNsURI WellFormedNsPrefix UniqueSubpackageNames UniqueClassifierNames UniqueNsURIs'"
 * @generated
 */
public interface SrcEPackage extends SrcENamedElement {
	/**
	 * Returns the value of the '<em><b>Ns URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ns URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ns URI</em>' attribute.
	 * @see #setNsURI(String)
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getSrcEPackage_NsURI()
	 * @model
	 * @generated
	 */
	String getNsURI();

	/**
	 * Sets the value of the '{@link jointPackage_Ecore2Maude.SrcEPackage#getNsURI <em>Ns URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ns URI</em>' attribute.
	 * @see #getNsURI()
	 * @generated
	 */
	void setNsURI(String value);

	/**
	 * Returns the value of the '<em><b>Ns Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ns Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ns Prefix</em>' attribute.
	 * @see #setNsPrefix(String)
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getSrcEPackage_NsPrefix()
	 * @model
	 * @generated
	 */
	String getNsPrefix();

	/**
	 * Sets the value of the '{@link jointPackage_Ecore2Maude.SrcEPackage#getNsPrefix <em>Ns Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ns Prefix</em>' attribute.
	 * @see #getNsPrefix()
	 * @generated
	 */
	void setNsPrefix(String value);

	/**
	 * Returns the value of the '<em><b>EClassifiers</b></em>' containment reference list.
	 * The list contents are of type {@link jointPackage_Ecore2Maude.SrcEClassifier}.
	 * It is bidirectional and its opposite is '{@link jointPackage_Ecore2Maude.SrcEClassifier#getEPackage <em>EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EClassifiers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EClassifiers</em>' containment reference list.
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getSrcEPackage_EClassifiers()
	 * @see jointPackage_Ecore2Maude.SrcEClassifier#getEPackage
	 * @model opposite="ePackage" containment="true"
	 * @generated
	 */
	EList<SrcEClassifier> getEClassifiers();

	/**
	 * Returns the value of the '<em><b>ESubpackages</b></em>' containment reference list.
	 * The list contents are of type {@link jointPackage_Ecore2Maude.SrcEPackage}.
	 * It is bidirectional and its opposite is '{@link jointPackage_Ecore2Maude.SrcEPackage#getESuperPackage <em>ESuper Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ESubpackages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ESubpackages</em>' containment reference list.
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getSrcEPackage_ESubpackages()
	 * @see jointPackage_Ecore2Maude.SrcEPackage#getESuperPackage
	 * @model opposite="eSuperPackage" containment="true"
	 * @generated
	 */
	EList<SrcEPackage> getESubpackages();

	/**
	 * Returns the value of the '<em><b>ESuper Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link jointPackage_Ecore2Maude.SrcEPackage#getESubpackages <em>ESubpackages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ESuper Package</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ESuper Package</em>' container reference.
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getSrcEPackage_ESuperPackage()
	 * @see jointPackage_Ecore2Maude.SrcEPackage#getESubpackages
	 * @model opposite="eSubpackages" changeable="false"
	 * @generated
	 */
	SrcEPackage getESuperPackage();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	SrcEClassifier getEClassifier(String name);

} // SrcEPackage
