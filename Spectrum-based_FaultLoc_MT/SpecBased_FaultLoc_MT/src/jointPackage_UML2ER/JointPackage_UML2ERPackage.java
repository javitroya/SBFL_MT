/**
 */
package jointPackage_UML2ER;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see jointPackage_UML2ER.JointPackage_UML2ERFactory
 * @model kind="package"
 * @generated
 */
public interface JointPackage_UML2ERPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "jointPackage_UML2ER";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://jointPackage_uml2er/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "jointPackage_UML2ER";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JointPackage_UML2ERPackage eINSTANCE = jointPackage_UML2ER.impl.JointPackage_UML2ERPackageImpl.init();

	/**
	 * The meta object id for the '{@link jointPackage_UML2ER.impl.JointMMImpl <em>Joint MM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_UML2ER.impl.JointMMImpl
	 * @see jointPackage_UML2ER.impl.JointPackage_UML2ERPackageImpl#getJointMM()
	 * @generated
	 */
	int JOINT_MM = 0;

	/**
	 * The feature id for the '<em><b>Source Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_MM__SOURCE_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Target Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_MM__TARGET_ROOT = 1;

	/**
	 * The number of structural features of the '<em>Joint MM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_MM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Joint MM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_MM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jointPackage_UML2ER.impl.SrcNamedElementImpl <em>Src Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_UML2ER.impl.SrcNamedElementImpl
	 * @see jointPackage_UML2ER.impl.JointPackage_UML2ERPackageImpl#getSrcNamedElement()
	 * @generated
	 */
	int SRC_NAMED_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Src Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Src Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jointPackage_UML2ER.impl.SrcPackageImpl <em>Src Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_UML2ER.impl.SrcPackageImpl
	 * @see jointPackage_UML2ER.impl.JointPackage_UML2ERPackageImpl#getSrcPackage()
	 * @generated
	 */
	int SRC_PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PACKAGE__NAME = SRC_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PACKAGE__OWNED_ELEMENTS = SRC_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Src Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PACKAGE_FEATURE_COUNT = SRC_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Src Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PACKAGE_OPERATION_COUNT = SRC_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_UML2ER.impl.SrcClassImpl <em>Src Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_UML2ER.impl.SrcClassImpl
	 * @see jointPackage_UML2ER.impl.JointPackage_UML2ERPackageImpl#getSrcClass()
	 * @generated
	 */
	int SRC_CLASS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_CLASS__NAME = SRC_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_CLASS__OWNED_PROPERTY = SRC_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Super Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_CLASS__SUPER_CLASSES = SRC_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Src Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_CLASS_FEATURE_COUNT = SRC_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Src Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_CLASS_OPERATION_COUNT = SRC_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_UML2ER.impl.SrcPropertyImpl <em>Src Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_UML2ER.impl.SrcPropertyImpl
	 * @see jointPackage_UML2ER.impl.JointPackage_UML2ERPackageImpl#getSrcProperty()
	 * @generated
	 */
	int SRC_PROPERTY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PROPERTY__NAME = SRC_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Primitive Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PROPERTY__PRIMITIVE_TYPE = SRC_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Complex Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PROPERTY__COMPLEX_TYPE = SRC_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PROPERTY__IS_CONTAINMENT = SRC_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Src Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PROPERTY_FEATURE_COUNT = SRC_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Src Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PROPERTY_OPERATION_COUNT = SRC_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_UML2ER.impl.TrgElementImpl <em>Trg Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_UML2ER.impl.TrgElementImpl
	 * @see jointPackage_UML2ER.impl.JointPackage_UML2ERPackageImpl#getTrgElement()
	 * @generated
	 */
	int TRG_ELEMENT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Trg Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Trg Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jointPackage_UML2ER.impl.TrgERModelImpl <em>Trg ER Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_UML2ER.impl.TrgERModelImpl
	 * @see jointPackage_UML2ER.impl.JointPackage_UML2ERPackageImpl#getTrgERModel()
	 * @generated
	 */
	int TRG_ER_MODEL = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_ER_MODEL__NAME = TRG_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_ER_MODEL__ENTITIES = TRG_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trg ER Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_ER_MODEL_FEATURE_COUNT = TRG_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trg ER Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_ER_MODEL_OPERATION_COUNT = TRG_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_UML2ER.impl.TrgFeatureImpl <em>Trg Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_UML2ER.impl.TrgFeatureImpl
	 * @see jointPackage_UML2ER.impl.JointPackage_UML2ERPackageImpl#getTrgFeature()
	 * @generated
	 */
	int TRG_FEATURE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_FEATURE__NAME = TRG_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Trg Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_FEATURE_FEATURE_COUNT = TRG_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Trg Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_FEATURE_OPERATION_COUNT = TRG_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_UML2ER.impl.TrgReferenceImpl <em>Trg Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_UML2ER.impl.TrgReferenceImpl
	 * @see jointPackage_UML2ER.impl.JointPackage_UML2ERPackageImpl#getTrgReference()
	 * @generated
	 */
	int TRG_REFERENCE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_REFERENCE__NAME = TRG_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_REFERENCE__TYPE = TRG_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trg Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_REFERENCE_FEATURE_COUNT = TRG_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trg Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_REFERENCE_OPERATION_COUNT = TRG_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_UML2ER.impl.TrgWeakReferenceImpl <em>Trg Weak Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_UML2ER.impl.TrgWeakReferenceImpl
	 * @see jointPackage_UML2ER.impl.JointPackage_UML2ERPackageImpl#getTrgWeakReference()
	 * @generated
	 */
	int TRG_WEAK_REFERENCE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_WEAK_REFERENCE__NAME = TRG_REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_WEAK_REFERENCE__TYPE = TRG_REFERENCE__TYPE;

	/**
	 * The number of structural features of the '<em>Trg Weak Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_WEAK_REFERENCE_FEATURE_COUNT = TRG_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Trg Weak Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_WEAK_REFERENCE_OPERATION_COUNT = TRG_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_UML2ER.impl.TrgStrongReferenceImpl <em>Trg Strong Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_UML2ER.impl.TrgStrongReferenceImpl
	 * @see jointPackage_UML2ER.impl.JointPackage_UML2ERPackageImpl#getTrgStrongReference()
	 * @generated
	 */
	int TRG_STRONG_REFERENCE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_STRONG_REFERENCE__NAME = TRG_REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_STRONG_REFERENCE__TYPE = TRG_REFERENCE__TYPE;

	/**
	 * The number of structural features of the '<em>Trg Strong Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_STRONG_REFERENCE_FEATURE_COUNT = TRG_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Trg Strong Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_STRONG_REFERENCE_OPERATION_COUNT = TRG_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_UML2ER.impl.TrgEntityTypeImpl <em>Trg Entity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_UML2ER.impl.TrgEntityTypeImpl
	 * @see jointPackage_UML2ER.impl.JointPackage_UML2ERPackageImpl#getTrgEntityType()
	 * @generated
	 */
	int TRG_ENTITY_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_ENTITY_TYPE__NAME = TRG_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_ENTITY_TYPE__FEATURES = TRG_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trg Entity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_ENTITY_TYPE_FEATURE_COUNT = TRG_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trg Entity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_ENTITY_TYPE_OPERATION_COUNT = TRG_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_UML2ER.impl.TrgAttributeImpl <em>Trg Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_UML2ER.impl.TrgAttributeImpl
	 * @see jointPackage_UML2ER.impl.JointPackage_UML2ERPackageImpl#getTrgAttribute()
	 * @generated
	 */
	int TRG_ATTRIBUTE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_ATTRIBUTE__NAME = TRG_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_ATTRIBUTE__TYPE = TRG_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trg Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_ATTRIBUTE_FEATURE_COUNT = TRG_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trg Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_ATTRIBUTE_OPERATION_COUNT = TRG_FEATURE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link jointPackage_UML2ER.JointMM <em>Joint MM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Joint MM</em>'.
	 * @see jointPackage_UML2ER.JointMM
	 * @generated
	 */
	EClass getJointMM();

	/**
	 * Returns the meta object for the containment reference '{@link jointPackage_UML2ER.JointMM#getSourceRoot <em>Source Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Root</em>'.
	 * @see jointPackage_UML2ER.JointMM#getSourceRoot()
	 * @see #getJointMM()
	 * @generated
	 */
	EReference getJointMM_SourceRoot();

	/**
	 * Returns the meta object for the containment reference '{@link jointPackage_UML2ER.JointMM#getTargetRoot <em>Target Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Root</em>'.
	 * @see jointPackage_UML2ER.JointMM#getTargetRoot()
	 * @see #getJointMM()
	 * @generated
	 */
	EReference getJointMM_TargetRoot();

	/**
	 * Returns the meta object for class '{@link jointPackage_UML2ER.SrcPackage <em>Src Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src Package</em>'.
	 * @see jointPackage_UML2ER.SrcPackage
	 * @generated
	 */
	EClass getSrcPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link jointPackage_UML2ER.SrcPackage#getOwnedElements <em>Owned Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Elements</em>'.
	 * @see jointPackage_UML2ER.SrcPackage#getOwnedElements()
	 * @see #getSrcPackage()
	 * @generated
	 */
	EReference getSrcPackage_OwnedElements();

	/**
	 * Returns the meta object for class '{@link jointPackage_UML2ER.SrcClass <em>Src Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src Class</em>'.
	 * @see jointPackage_UML2ER.SrcClass
	 * @generated
	 */
	EClass getSrcClass();

	/**
	 * Returns the meta object for the containment reference list '{@link jointPackage_UML2ER.SrcClass#getOwnedProperty <em>Owned Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Property</em>'.
	 * @see jointPackage_UML2ER.SrcClass#getOwnedProperty()
	 * @see #getSrcClass()
	 * @generated
	 */
	EReference getSrcClass_OwnedProperty();

	/**
	 * Returns the meta object for the reference list '{@link jointPackage_UML2ER.SrcClass#getSuperClasses <em>Super Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Super Classes</em>'.
	 * @see jointPackage_UML2ER.SrcClass#getSuperClasses()
	 * @see #getSrcClass()
	 * @generated
	 */
	EReference getSrcClass_SuperClasses();

	/**
	 * Returns the meta object for class '{@link jointPackage_UML2ER.SrcProperty <em>Src Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src Property</em>'.
	 * @see jointPackage_UML2ER.SrcProperty
	 * @generated
	 */
	EClass getSrcProperty();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_UML2ER.SrcProperty#getPrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primitive Type</em>'.
	 * @see jointPackage_UML2ER.SrcProperty#getPrimitiveType()
	 * @see #getSrcProperty()
	 * @generated
	 */
	EAttribute getSrcProperty_PrimitiveType();

	/**
	 * Returns the meta object for the reference '{@link jointPackage_UML2ER.SrcProperty#getComplexType <em>Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Complex Type</em>'.
	 * @see jointPackage_UML2ER.SrcProperty#getComplexType()
	 * @see #getSrcProperty()
	 * @generated
	 */
	EReference getSrcProperty_ComplexType();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_UML2ER.SrcProperty#isIsContainment <em>Is Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Containment</em>'.
	 * @see jointPackage_UML2ER.SrcProperty#isIsContainment()
	 * @see #getSrcProperty()
	 * @generated
	 */
	EAttribute getSrcProperty_IsContainment();

	/**
	 * Returns the meta object for class '{@link jointPackage_UML2ER.SrcNamedElement <em>Src Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src Named Element</em>'.
	 * @see jointPackage_UML2ER.SrcNamedElement
	 * @generated
	 */
	EClass getSrcNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_UML2ER.SrcNamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jointPackage_UML2ER.SrcNamedElement#getName()
	 * @see #getSrcNamedElement()
	 * @generated
	 */
	EAttribute getSrcNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link jointPackage_UML2ER.TrgERModel <em>Trg ER Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg ER Model</em>'.
	 * @see jointPackage_UML2ER.TrgERModel
	 * @generated
	 */
	EClass getTrgERModel();

	/**
	 * Returns the meta object for the containment reference list '{@link jointPackage_UML2ER.TrgERModel#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entities</em>'.
	 * @see jointPackage_UML2ER.TrgERModel#getEntities()
	 * @see #getTrgERModel()
	 * @generated
	 */
	EReference getTrgERModel_Entities();

	/**
	 * Returns the meta object for class '{@link jointPackage_UML2ER.TrgWeakReference <em>Trg Weak Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Weak Reference</em>'.
	 * @see jointPackage_UML2ER.TrgWeakReference
	 * @generated
	 */
	EClass getTrgWeakReference();

	/**
	 * Returns the meta object for class '{@link jointPackage_UML2ER.TrgStrongReference <em>Trg Strong Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Strong Reference</em>'.
	 * @see jointPackage_UML2ER.TrgStrongReference
	 * @generated
	 */
	EClass getTrgStrongReference();

	/**
	 * Returns the meta object for class '{@link jointPackage_UML2ER.TrgEntityType <em>Trg Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Entity Type</em>'.
	 * @see jointPackage_UML2ER.TrgEntityType
	 * @generated
	 */
	EClass getTrgEntityType();

	/**
	 * Returns the meta object for the containment reference list '{@link jointPackage_UML2ER.TrgEntityType#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see jointPackage_UML2ER.TrgEntityType#getFeatures()
	 * @see #getTrgEntityType()
	 * @generated
	 */
	EReference getTrgEntityType_Features();

	/**
	 * Returns the meta object for class '{@link jointPackage_UML2ER.TrgFeature <em>Trg Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Feature</em>'.
	 * @see jointPackage_UML2ER.TrgFeature
	 * @generated
	 */
	EClass getTrgFeature();

	/**
	 * Returns the meta object for class '{@link jointPackage_UML2ER.TrgAttribute <em>Trg Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Attribute</em>'.
	 * @see jointPackage_UML2ER.TrgAttribute
	 * @generated
	 */
	EClass getTrgAttribute();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_UML2ER.TrgAttribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see jointPackage_UML2ER.TrgAttribute#getType()
	 * @see #getTrgAttribute()
	 * @generated
	 */
	EAttribute getTrgAttribute_Type();

	/**
	 * Returns the meta object for class '{@link jointPackage_UML2ER.TrgElement <em>Trg Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Element</em>'.
	 * @see jointPackage_UML2ER.TrgElement
	 * @generated
	 */
	EClass getTrgElement();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_UML2ER.TrgElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jointPackage_UML2ER.TrgElement#getName()
	 * @see #getTrgElement()
	 * @generated
	 */
	EAttribute getTrgElement_Name();

	/**
	 * Returns the meta object for class '{@link jointPackage_UML2ER.TrgReference <em>Trg Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Reference</em>'.
	 * @see jointPackage_UML2ER.TrgReference
	 * @generated
	 */
	EClass getTrgReference();

	/**
	 * Returns the meta object for the reference '{@link jointPackage_UML2ER.TrgReference#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see jointPackage_UML2ER.TrgReference#getType()
	 * @see #getTrgReference()
	 * @generated
	 */
	EReference getTrgReference_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JointPackage_UML2ERFactory getJointPackage_UML2ERFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link jointPackage_UML2ER.impl.JointMMImpl <em>Joint MM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_UML2ER.impl.JointMMImpl
		 * @see jointPackage_UML2ER.impl.JointPackage_UML2ERPackageImpl#getJointMM()
		 * @generated
		 */
		EClass JOINT_MM = eINSTANCE.getJointMM();

		/**
		 * The meta object literal for the '<em><b>Source Root</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOINT_MM__SOURCE_ROOT = eINSTANCE.getJointMM_SourceRoot();

		/**
		 * The meta object literal for the '<em><b>Target Root</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOINT_MM__TARGET_ROOT = eINSTANCE.getJointMM_TargetRoot();

		/**
		 * The meta object literal for the '{@link jointPackage_UML2ER.impl.SrcPackageImpl <em>Src Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_UML2ER.impl.SrcPackageImpl
		 * @see jointPackage_UML2ER.impl.JointPackage_UML2ERPackageImpl#getSrcPackage()
		 * @generated
		 */
		EClass SRC_PACKAGE = eINSTANCE.getSrcPackage();

		/**
		 * The meta object literal for the '<em><b>Owned Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_PACKAGE__OWNED_ELEMENTS = eINSTANCE.getSrcPackage_OwnedElements();

		/**
		 * The meta object literal for the '{@link jointPackage_UML2ER.impl.SrcClassImpl <em>Src Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_UML2ER.impl.SrcClassImpl
		 * @see jointPackage_UML2ER.impl.JointPackage_UML2ERPackageImpl#getSrcClass()
		 * @generated
		 */
		EClass SRC_CLASS = eINSTANCE.getSrcClass();

		/**
		 * The meta object literal for the '<em><b>Owned Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_CLASS__OWNED_PROPERTY = eINSTANCE.getSrcClass_OwnedProperty();

		/**
		 * The meta object literal for the '<em><b>Super Classes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_CLASS__SUPER_CLASSES = eINSTANCE.getSrcClass_SuperClasses();

		/**
		 * The meta object literal for the '{@link jointPackage_UML2ER.impl.SrcPropertyImpl <em>Src Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_UML2ER.impl.SrcPropertyImpl
		 * @see jointPackage_UML2ER.impl.JointPackage_UML2ERPackageImpl#getSrcProperty()
		 * @generated
		 */
		EClass SRC_PROPERTY = eINSTANCE.getSrcProperty();

		/**
		 * The meta object literal for the '<em><b>Primitive Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_PROPERTY__PRIMITIVE_TYPE = eINSTANCE.getSrcProperty_PrimitiveType();

		/**
		 * The meta object literal for the '<em><b>Complex Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_PROPERTY__COMPLEX_TYPE = eINSTANCE.getSrcProperty_ComplexType();

		/**
		 * The meta object literal for the '<em><b>Is Containment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_PROPERTY__IS_CONTAINMENT = eINSTANCE.getSrcProperty_IsContainment();

		/**
		 * The meta object literal for the '{@link jointPackage_UML2ER.impl.SrcNamedElementImpl <em>Src Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_UML2ER.impl.SrcNamedElementImpl
		 * @see jointPackage_UML2ER.impl.JointPackage_UML2ERPackageImpl#getSrcNamedElement()
		 * @generated
		 */
		EClass SRC_NAMED_ELEMENT = eINSTANCE.getSrcNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_NAMED_ELEMENT__NAME = eINSTANCE.getSrcNamedElement_Name();

		/**
		 * The meta object literal for the '{@link jointPackage_UML2ER.impl.TrgERModelImpl <em>Trg ER Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_UML2ER.impl.TrgERModelImpl
		 * @see jointPackage_UML2ER.impl.JointPackage_UML2ERPackageImpl#getTrgERModel()
		 * @generated
		 */
		EClass TRG_ER_MODEL = eINSTANCE.getTrgERModel();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_ER_MODEL__ENTITIES = eINSTANCE.getTrgERModel_Entities();

		/**
		 * The meta object literal for the '{@link jointPackage_UML2ER.impl.TrgWeakReferenceImpl <em>Trg Weak Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_UML2ER.impl.TrgWeakReferenceImpl
		 * @see jointPackage_UML2ER.impl.JointPackage_UML2ERPackageImpl#getTrgWeakReference()
		 * @generated
		 */
		EClass TRG_WEAK_REFERENCE = eINSTANCE.getTrgWeakReference();

		/**
		 * The meta object literal for the '{@link jointPackage_UML2ER.impl.TrgStrongReferenceImpl <em>Trg Strong Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_UML2ER.impl.TrgStrongReferenceImpl
		 * @see jointPackage_UML2ER.impl.JointPackage_UML2ERPackageImpl#getTrgStrongReference()
		 * @generated
		 */
		EClass TRG_STRONG_REFERENCE = eINSTANCE.getTrgStrongReference();

		/**
		 * The meta object literal for the '{@link jointPackage_UML2ER.impl.TrgEntityTypeImpl <em>Trg Entity Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_UML2ER.impl.TrgEntityTypeImpl
		 * @see jointPackage_UML2ER.impl.JointPackage_UML2ERPackageImpl#getTrgEntityType()
		 * @generated
		 */
		EClass TRG_ENTITY_TYPE = eINSTANCE.getTrgEntityType();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_ENTITY_TYPE__FEATURES = eINSTANCE.getTrgEntityType_Features();

		/**
		 * The meta object literal for the '{@link jointPackage_UML2ER.impl.TrgFeatureImpl <em>Trg Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_UML2ER.impl.TrgFeatureImpl
		 * @see jointPackage_UML2ER.impl.JointPackage_UML2ERPackageImpl#getTrgFeature()
		 * @generated
		 */
		EClass TRG_FEATURE = eINSTANCE.getTrgFeature();

		/**
		 * The meta object literal for the '{@link jointPackage_UML2ER.impl.TrgAttributeImpl <em>Trg Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_UML2ER.impl.TrgAttributeImpl
		 * @see jointPackage_UML2ER.impl.JointPackage_UML2ERPackageImpl#getTrgAttribute()
		 * @generated
		 */
		EClass TRG_ATTRIBUTE = eINSTANCE.getTrgAttribute();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRG_ATTRIBUTE__TYPE = eINSTANCE.getTrgAttribute_Type();

		/**
		 * The meta object literal for the '{@link jointPackage_UML2ER.impl.TrgElementImpl <em>Trg Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_UML2ER.impl.TrgElementImpl
		 * @see jointPackage_UML2ER.impl.JointPackage_UML2ERPackageImpl#getTrgElement()
		 * @generated
		 */
		EClass TRG_ELEMENT = eINSTANCE.getTrgElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRG_ELEMENT__NAME = eINSTANCE.getTrgElement_Name();

		/**
		 * The meta object literal for the '{@link jointPackage_UML2ER.impl.TrgReferenceImpl <em>Trg Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_UML2ER.impl.TrgReferenceImpl
		 * @see jointPackage_UML2ER.impl.JointPackage_UML2ERPackageImpl#getTrgReference()
		 * @generated
		 */
		EClass TRG_REFERENCE = eINSTANCE.getTrgReference();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_REFERENCE__TYPE = eINSTANCE.getTrgReference_Type();

	}

} //JointPackage_UML2ERPackage
