/**
 */
package jointPackage_Ecore2Maude;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Src EClass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_Ecore2Maude.SrcEClass#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.SrcEClass#isInterface <em>Interface</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.SrcEClass#getESuperTypes <em>ESuper Types</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.SrcEClass#getEOperations <em>EOperations</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.SrcEClass#getEAllAttributes <em>EAll Attributes</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.SrcEClass#getEAllReferences <em>EAll References</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.SrcEClass#getEReferences <em>EReferences</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.SrcEClass#getEAttributes <em>EAttributes</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.SrcEClass#getEAllContainments <em>EAll Containments</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.SrcEClass#getEAllOperations <em>EAll Operations</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.SrcEClass#getEAllStructuralFeatures <em>EAll Structural Features</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.SrcEClass#getEAllSuperTypes <em>EAll Super Types</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.SrcEClass#getEIDAttribute <em>EID Attribute</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.SrcEClass#getEStructuralFeatures <em>EStructural Features</em>}</li>
 * </ul>
 *
 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getSrcEClass()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='InterfaceIsAbstract AtMostOneID UniqueFeatureNames UniqueOperationSignatures NoCircularSuperTypes WellFormedMapEntryClass ConsistentSuperTypes'"
 * @generated
 */
public interface SrcEClass extends SrcEClassifier {
	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(boolean)
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getSrcEClass_Abstract()
	 * @model
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link jointPackage_Ecore2Maude.SrcEClass#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #isAbstract()
	 * @generated
	 */
	void setAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' attribute.
	 * @see #setInterface(boolean)
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getSrcEClass_Interface()
	 * @model
	 * @generated
	 */
	boolean isInterface();

	/**
	 * Sets the value of the '{@link jointPackage_Ecore2Maude.SrcEClass#isInterface <em>Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' attribute.
	 * @see #isInterface()
	 * @generated
	 */
	void setInterface(boolean value);

	/**
	 * Returns the value of the '<em><b>ESuper Types</b></em>' reference list.
	 * The list contents are of type {@link jointPackage_Ecore2Maude.SrcEClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ESuper Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ESuper Types</em>' reference list.
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getSrcEClass_ESuperTypes()
	 * @model suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EList<SrcEClass> getESuperTypes();

	/**
	 * Returns the value of the '<em><b>EOperations</b></em>' containment reference list.
	 * The list contents are of type {@link jointPackage_Ecore2Maude.SrcEOperation}.
	 * It is bidirectional and its opposite is '{@link jointPackage_Ecore2Maude.SrcEOperation#getEContainingClass <em>EContaining Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EOperations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EOperations</em>' containment reference list.
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getSrcEClass_EOperations()
	 * @see jointPackage_Ecore2Maude.SrcEOperation#getEContainingClass
	 * @model opposite="eContainingClass" containment="true"
	 * @generated
	 */
	EList<SrcEOperation> getEOperations();

	/**
	 * Returns the value of the '<em><b>EAll Attributes</b></em>' reference list.
	 * The list contents are of type {@link jointPackage_Ecore2Maude.SrcEAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EAll Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EAll Attributes</em>' reference list.
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getSrcEClass_EAllAttributes()
	 * @model changeable="false" derived="true"
	 * @generated
	 */
	EList<SrcEAttribute> getEAllAttributes();

	/**
	 * Returns the value of the '<em><b>EAll References</b></em>' reference list.
	 * The list contents are of type {@link jointPackage_Ecore2Maude.SrcEReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EAll References</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EAll References</em>' reference list.
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getSrcEClass_EAllReferences()
	 * @model changeable="false" derived="true"
	 * @generated
	 */
	EList<SrcEReference> getEAllReferences();

	/**
	 * Returns the value of the '<em><b>EReferences</b></em>' reference list.
	 * The list contents are of type {@link jointPackage_Ecore2Maude.SrcEReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EReferences</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EReferences</em>' reference list.
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getSrcEClass_EReferences()
	 * @model changeable="false" derived="true"
	 * @generated
	 */
	EList<SrcEReference> getEReferences();

	/**
	 * Returns the value of the '<em><b>EAttributes</b></em>' reference list.
	 * The list contents are of type {@link jointPackage_Ecore2Maude.SrcEAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EAttributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EAttributes</em>' reference list.
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getSrcEClass_EAttributes()
	 * @model changeable="false" derived="true"
	 * @generated
	 */
	EList<SrcEAttribute> getEAttributes();

	/**
	 * Returns the value of the '<em><b>EAll Containments</b></em>' reference list.
	 * The list contents are of type {@link jointPackage_Ecore2Maude.SrcEReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EAll Containments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EAll Containments</em>' reference list.
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getSrcEClass_EAllContainments()
	 * @model changeable="false" derived="true"
	 * @generated
	 */
	EList<SrcEReference> getEAllContainments();

	/**
	 * Returns the value of the '<em><b>EAll Operations</b></em>' reference list.
	 * The list contents are of type {@link jointPackage_Ecore2Maude.SrcEOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EAll Operations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EAll Operations</em>' reference list.
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getSrcEClass_EAllOperations()
	 * @model changeable="false" derived="true"
	 * @generated
	 */
	EList<SrcEOperation> getEAllOperations();

	/**
	 * Returns the value of the '<em><b>EAll Structural Features</b></em>' reference list.
	 * The list contents are of type {@link jointPackage_Ecore2Maude.SrcEStructuralFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EAll Structural Features</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EAll Structural Features</em>' reference list.
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getSrcEClass_EAllStructuralFeatures()
	 * @model changeable="false" derived="true"
	 * @generated
	 */
	EList<SrcEStructuralFeature> getEAllStructuralFeatures();

	/**
	 * Returns the value of the '<em><b>EAll Super Types</b></em>' reference list.
	 * The list contents are of type {@link jointPackage_Ecore2Maude.SrcEClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EAll Super Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EAll Super Types</em>' reference list.
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getSrcEClass_EAllSuperTypes()
	 * @model changeable="false" derived="true"
	 * @generated
	 */
	EList<SrcEClass> getEAllSuperTypes();

	/**
	 * Returns the value of the '<em><b>EID Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EID Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EID Attribute</em>' reference.
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getSrcEClass_EIDAttribute()
	 * @model changeable="false" derived="true"
	 * @generated
	 */
	SrcEAttribute getEIDAttribute();

	/**
	 * Returns the value of the '<em><b>EStructural Features</b></em>' containment reference list.
	 * The list contents are of type {@link jointPackage_Ecore2Maude.SrcEStructuralFeature}.
	 * It is bidirectional and its opposite is '{@link jointPackage_Ecore2Maude.SrcEStructuralFeature#getEContainingClass <em>EContaining Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EStructural Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EStructural Features</em>' containment reference list.
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getSrcEClass_EStructuralFeatures()
	 * @see jointPackage_Ecore2Maude.SrcEStructuralFeature#getEContainingClass
	 * @model opposite="eContainingClass" containment="true"
	 * @generated
	 */
	EList<SrcEStructuralFeature> getEStructuralFeatures();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isSuperTypeOf(SrcEClass someClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	int getFeatureCount();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	SrcEStructuralFeature getEStructuralFeature(int featureID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int getFeatureID(SrcEStructuralFeature feature);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	SrcEStructuralFeature getEStructuralFeature(String featureName);

} // SrcEClass
