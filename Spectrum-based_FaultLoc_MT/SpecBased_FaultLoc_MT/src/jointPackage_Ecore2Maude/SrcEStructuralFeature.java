/**
 */
package jointPackage_Ecore2Maude;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Src EStructural Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_Ecore2Maude.SrcEStructuralFeature#isChangeable <em>Changeable</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.SrcEStructuralFeature#isVolatile <em>Volatile</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.SrcEStructuralFeature#isTransient <em>Transient</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.SrcEStructuralFeature#getDefaultValueLiteral <em>Default Value Literal</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.SrcEStructuralFeature#isUnsettable <em>Unsettable</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.SrcEStructuralFeature#isDerived <em>Derived</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.SrcEStructuralFeature#getEContainingClass <em>EContaining Class</em>}</li>
 * </ul>
 *
 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getSrcEStructuralFeature()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ValidDefaultValueLiteral'"
 * @generated
 */
public interface SrcEStructuralFeature extends SrcETypedElement {
	/**
	 * Returns the value of the '<em><b>Changeable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Changeable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Changeable</em>' attribute.
	 * @see #setChangeable(boolean)
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getSrcEStructuralFeature_Changeable()
	 * @model default="true"
	 * @generated
	 */
	boolean isChangeable();

	/**
	 * Sets the value of the '{@link jointPackage_Ecore2Maude.SrcEStructuralFeature#isChangeable <em>Changeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Changeable</em>' attribute.
	 * @see #isChangeable()
	 * @generated
	 */
	void setChangeable(boolean value);

	/**
	 * Returns the value of the '<em><b>Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volatile</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volatile</em>' attribute.
	 * @see #setVolatile(boolean)
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getSrcEStructuralFeature_Volatile()
	 * @model
	 * @generated
	 */
	boolean isVolatile();

	/**
	 * Sets the value of the '{@link jointPackage_Ecore2Maude.SrcEStructuralFeature#isVolatile <em>Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volatile</em>' attribute.
	 * @see #isVolatile()
	 * @generated
	 */
	void setVolatile(boolean value);

	/**
	 * Returns the value of the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transient</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transient</em>' attribute.
	 * @see #setTransient(boolean)
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getSrcEStructuralFeature_Transient()
	 * @model
	 * @generated
	 */
	boolean isTransient();

	/**
	 * Sets the value of the '{@link jointPackage_Ecore2Maude.SrcEStructuralFeature#isTransient <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transient</em>' attribute.
	 * @see #isTransient()
	 * @generated
	 */
	void setTransient(boolean value);

	/**
	 * Returns the value of the '<em><b>Default Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value Literal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value Literal</em>' attribute.
	 * @see #setDefaultValueLiteral(String)
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getSrcEStructuralFeature_DefaultValueLiteral()
	 * @model
	 * @generated
	 */
	String getDefaultValueLiteral();

	/**
	 * Sets the value of the '{@link jointPackage_Ecore2Maude.SrcEStructuralFeature#getDefaultValueLiteral <em>Default Value Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Literal</em>' attribute.
	 * @see #getDefaultValueLiteral()
	 * @generated
	 */
	void setDefaultValueLiteral(String value);

	/**
	 * Returns the value of the '<em><b>Unsettable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unsettable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unsettable</em>' attribute.
	 * @see #setUnsettable(boolean)
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getSrcEStructuralFeature_Unsettable()
	 * @model
	 * @generated
	 */
	boolean isUnsettable();

	/**
	 * Sets the value of the '{@link jointPackage_Ecore2Maude.SrcEStructuralFeature#isUnsettable <em>Unsettable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unsettable</em>' attribute.
	 * @see #isUnsettable()
	 * @generated
	 */
	void setUnsettable(boolean value);

	/**
	 * Returns the value of the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derived</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derived</em>' attribute.
	 * @see #setDerived(boolean)
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getSrcEStructuralFeature_Derived()
	 * @model
	 * @generated
	 */
	boolean isDerived();

	/**
	 * Sets the value of the '{@link jointPackage_Ecore2Maude.SrcEStructuralFeature#isDerived <em>Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derived</em>' attribute.
	 * @see #isDerived()
	 * @generated
	 */
	void setDerived(boolean value);

	/**
	 * Returns the value of the '<em><b>EContaining Class</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link jointPackage_Ecore2Maude.SrcEClass#getEStructuralFeatures <em>EStructural Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EContaining Class</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EContaining Class</em>' container reference.
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getSrcEStructuralFeature_EContainingClass()
	 * @see jointPackage_Ecore2Maude.SrcEClass#getEStructuralFeatures
	 * @model opposite="eStructuralFeatures" resolveProxies="false" changeable="false"
	 * @generated
	 */
	SrcEClass getEContainingClass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	int getFeatureID();

} // SrcEStructuralFeature
