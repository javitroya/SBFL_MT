/**
 */
package jointPackage_UML2ER;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see jointPackage_UML2ER.JointPackage_UML2ERPackage
 * @generated
 */
public interface JointPackage_UML2ERFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JointPackage_UML2ERFactory eINSTANCE = jointPackage_UML2ER.impl.JointPackage_UML2ERFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Joint MM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Joint MM</em>'.
	 * @generated
	 */
	JointMM createJointMM();

	/**
	 * Returns a new object of class '<em>Src Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Src Package</em>'.
	 * @generated
	 */
	SrcPackage createSrcPackage();

	/**
	 * Returns a new object of class '<em>Src Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Src Class</em>'.
	 * @generated
	 */
	SrcClass createSrcClass();

	/**
	 * Returns a new object of class '<em>Src Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Src Property</em>'.
	 * @generated
	 */
	SrcProperty createSrcProperty();

	/**
	 * Returns a new object of class '<em>Trg ER Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trg ER Model</em>'.
	 * @generated
	 */
	TrgERModel createTrgERModel();

	/**
	 * Returns a new object of class '<em>Trg Weak Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trg Weak Reference</em>'.
	 * @generated
	 */
	TrgWeakReference createTrgWeakReference();

	/**
	 * Returns a new object of class '<em>Trg Strong Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trg Strong Reference</em>'.
	 * @generated
	 */
	TrgStrongReference createTrgStrongReference();

	/**
	 * Returns a new object of class '<em>Trg Entity Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trg Entity Type</em>'.
	 * @generated
	 */
	TrgEntityType createTrgEntityType();

	/**
	 * Returns a new object of class '<em>Trg Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trg Attribute</em>'.
	 * @generated
	 */
	TrgAttribute createTrgAttribute();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	JointPackage_UML2ERPackage getJointPackage_UML2ERPackage();

} //JointPackage_UML2ERFactory
