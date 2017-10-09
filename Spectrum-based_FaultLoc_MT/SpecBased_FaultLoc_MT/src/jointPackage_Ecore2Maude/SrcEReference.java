/**
 */
package jointPackage_Ecore2Maude;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Src EReference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_Ecore2Maude.SrcEReference#isContainment <em>Containment</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.SrcEReference#isContainer <em>Container</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.SrcEReference#isResolveProxies <em>Resolve Proxies</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.SrcEReference#getEOpposite <em>EOpposite</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.SrcEReference#getEReferenceType <em>EReference Type</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.SrcEReference#getEKeys <em>EKeys</em>}</li>
 * </ul>
 *
 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getSrcEReference()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ConsistentOpposite SingleContainer ConsistentKeys'"
 * @generated
 */
public interface SrcEReference extends SrcEStructuralFeature {
	/**
	 * Returns the value of the '<em><b>Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containment</em>' attribute.
	 * @see #setContainment(boolean)
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getSrcEReference_Containment()
	 * @model
	 * @generated
	 */
	boolean isContainment();

	/**
	 * Sets the value of the '{@link jointPackage_Ecore2Maude.SrcEReference#isContainment <em>Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containment</em>' attribute.
	 * @see #isContainment()
	 * @generated
	 */
	void setContainment(boolean value);

	/**
	 * Returns the value of the '<em><b>Container</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' attribute.
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getSrcEReference_Container()
	 * @model transient="true" changeable="false" derived="true"
	 * @generated
	 */
	boolean isContainer();

	/**
	 * Returns the value of the '<em><b>Resolve Proxies</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolve Proxies</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolve Proxies</em>' attribute.
	 * @see #setResolveProxies(boolean)
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getSrcEReference_ResolveProxies()
	 * @model default="true"
	 * @generated
	 */
	boolean isResolveProxies();

	/**
	 * Sets the value of the '{@link jointPackage_Ecore2Maude.SrcEReference#isResolveProxies <em>Resolve Proxies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolve Proxies</em>' attribute.
	 * @see #isResolveProxies()
	 * @generated
	 */
	void setResolveProxies(boolean value);

	/**
	 * Returns the value of the '<em><b>EOpposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EOpposite</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EOpposite</em>' reference.
	 * @see #setEOpposite(SrcEReference)
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getSrcEReference_EOpposite()
	 * @model
	 * @generated
	 */
	SrcEReference getEOpposite();

	/**
	 * Sets the value of the '{@link jointPackage_Ecore2Maude.SrcEReference#getEOpposite <em>EOpposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EOpposite</em>' reference.
	 * @see #getEOpposite()
	 * @generated
	 */
	void setEOpposite(SrcEReference value);

	/**
	 * Returns the value of the '<em><b>EReference Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EReference Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EReference Type</em>' reference.
	 * @see #setEReferenceType(SrcEClass)
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getSrcEReference_EReferenceType()
	 * @model derived="true"
	 * @generated
	 */
	SrcEClass getEReferenceType();

	/**
	 * Sets the value of the '{@link jointPackage_Ecore2Maude.SrcEReference#getEReferenceType <em>EReference Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EReference Type</em>' reference.
	 * @see #getEReferenceType()
	 * @generated
	 */
	void setEReferenceType(SrcEClass value);

	/**
	 * Returns the value of the '<em><b>EKeys</b></em>' reference list.
	 * The list contents are of type {@link jointPackage_Ecore2Maude.SrcEAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EKeys</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EKeys</em>' reference list.
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getSrcEReference_EKeys()
	 * @model
	 * @generated
	 */
	EList<SrcEAttribute> getEKeys();

} // SrcEReference
