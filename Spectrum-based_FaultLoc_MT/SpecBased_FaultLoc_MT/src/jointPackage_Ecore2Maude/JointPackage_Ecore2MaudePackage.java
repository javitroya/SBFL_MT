/**
 */
package jointPackage_Ecore2Maude;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudeFactory
 * @model kind="package"
 * @generated
 */
public interface JointPackage_Ecore2MaudePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "jointPackage_Ecore2Maude";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://jointPackage_ecore2Maude/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "jointPackage_Ecore2Maude";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JointPackage_Ecore2MaudePackage eINSTANCE = jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl.init();

	/**
	 * The meta object id for the '{@link jointPackage_Ecore2Maude.impl.JointMMImpl <em>Joint MM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Ecore2Maude.impl.JointMMImpl
	 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getJointMM()
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
	 * The meta object id for the '{@link jointPackage_Ecore2Maude.impl.SrcEStringToStringMapEntryImpl <em>Src EString To String Map Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Ecore2Maude.impl.SrcEStringToStringMapEntryImpl
	 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getSrcEStringToStringMapEntry()
	 * @generated
	 */
	int SRC_ESTRING_TO_STRING_MAP_ENTRY = 1;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ESTRING_TO_STRING_MAP_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ESTRING_TO_STRING_MAP_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Src EString To String Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ESTRING_TO_STRING_MAP_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Src EString To String Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ESTRING_TO_STRING_MAP_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jointPackage_Ecore2Maude.impl.SrcENamedElementImpl <em>Src ENamed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Ecore2Maude.impl.SrcENamedElementImpl
	 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getSrcENamedElement()
	 * @generated
	 */
	int SRC_ENAMED_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ENAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Src ENamed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ENAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Src ENamed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ENAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jointPackage_Ecore2Maude.impl.SrcETypedElementImpl <em>Src ETyped Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Ecore2Maude.impl.SrcETypedElementImpl
	 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getSrcETypedElement()
	 * @generated
	 */
	int SRC_ETYPED_ELEMENT = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ETYPED_ELEMENT__NAME = SRC_ENAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ETYPED_ELEMENT__ORDERED = SRC_ENAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ETYPED_ELEMENT__UNIQUE = SRC_ENAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ETYPED_ELEMENT__LOWER_BOUND = SRC_ENAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ETYPED_ELEMENT__UPPER_BOUND = SRC_ENAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ETYPED_ELEMENT__MANY = SRC_ENAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ETYPED_ELEMENT__REQUIRED = SRC_ENAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ETYPED_ELEMENT__ETYPE = SRC_ENAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Src ETyped Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ETYPED_ELEMENT_FEATURE_COUNT = SRC_ENAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Src ETyped Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ETYPED_ELEMENT_OPERATION_COUNT = SRC_ENAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_Ecore2Maude.impl.SrcEStructuralFeatureImpl <em>Src EStructural Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Ecore2Maude.impl.SrcEStructuralFeatureImpl
	 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getSrcEStructuralFeature()
	 * @generated
	 */
	int SRC_ESTRUCTURAL_FEATURE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ESTRUCTURAL_FEATURE__NAME = SRC_ETYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ESTRUCTURAL_FEATURE__ORDERED = SRC_ETYPED_ELEMENT__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ESTRUCTURAL_FEATURE__UNIQUE = SRC_ETYPED_ELEMENT__UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ESTRUCTURAL_FEATURE__LOWER_BOUND = SRC_ETYPED_ELEMENT__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ESTRUCTURAL_FEATURE__UPPER_BOUND = SRC_ETYPED_ELEMENT__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ESTRUCTURAL_FEATURE__MANY = SRC_ETYPED_ELEMENT__MANY;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ESTRUCTURAL_FEATURE__REQUIRED = SRC_ETYPED_ELEMENT__REQUIRED;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ESTRUCTURAL_FEATURE__ETYPE = SRC_ETYPED_ELEMENT__ETYPE;

	/**
	 * The feature id for the '<em><b>Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ESTRUCTURAL_FEATURE__CHANGEABLE = SRC_ETYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ESTRUCTURAL_FEATURE__VOLATILE = SRC_ETYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ESTRUCTURAL_FEATURE__TRANSIENT = SRC_ETYPED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Default Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL = SRC_ETYPED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Unsettable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ESTRUCTURAL_FEATURE__UNSETTABLE = SRC_ETYPED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ESTRUCTURAL_FEATURE__DERIVED = SRC_ETYPED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>EContaining Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ESTRUCTURAL_FEATURE__ECONTAINING_CLASS = SRC_ETYPED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Src EStructural Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ESTRUCTURAL_FEATURE_FEATURE_COUNT = SRC_ETYPED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Feature ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ESTRUCTURAL_FEATURE___GET_FEATURE_ID = SRC_ETYPED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Src EStructural Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ESTRUCTURAL_FEATURE_OPERATION_COUNT = SRC_ETYPED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link jointPackage_Ecore2Maude.impl.SrcEAttributeImpl <em>Src EAttribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Ecore2Maude.impl.SrcEAttributeImpl
	 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getSrcEAttribute()
	 * @generated
	 */
	int SRC_EATTRIBUTE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EATTRIBUTE__NAME = SRC_ESTRUCTURAL_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EATTRIBUTE__ORDERED = SRC_ESTRUCTURAL_FEATURE__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EATTRIBUTE__UNIQUE = SRC_ESTRUCTURAL_FEATURE__UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EATTRIBUTE__LOWER_BOUND = SRC_ESTRUCTURAL_FEATURE__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EATTRIBUTE__UPPER_BOUND = SRC_ESTRUCTURAL_FEATURE__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EATTRIBUTE__MANY = SRC_ESTRUCTURAL_FEATURE__MANY;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EATTRIBUTE__REQUIRED = SRC_ESTRUCTURAL_FEATURE__REQUIRED;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EATTRIBUTE__ETYPE = SRC_ESTRUCTURAL_FEATURE__ETYPE;

	/**
	 * The feature id for the '<em><b>Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EATTRIBUTE__CHANGEABLE = SRC_ESTRUCTURAL_FEATURE__CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EATTRIBUTE__VOLATILE = SRC_ESTRUCTURAL_FEATURE__VOLATILE;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EATTRIBUTE__TRANSIENT = SRC_ESTRUCTURAL_FEATURE__TRANSIENT;

	/**
	 * The feature id for the '<em><b>Default Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EATTRIBUTE__DEFAULT_VALUE_LITERAL = SRC_ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL;

	/**
	 * The feature id for the '<em><b>Unsettable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EATTRIBUTE__UNSETTABLE = SRC_ESTRUCTURAL_FEATURE__UNSETTABLE;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EATTRIBUTE__DERIVED = SRC_ESTRUCTURAL_FEATURE__DERIVED;

	/**
	 * The feature id for the '<em><b>EContaining Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EATTRIBUTE__ECONTAINING_CLASS = SRC_ESTRUCTURAL_FEATURE__ECONTAINING_CLASS;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EATTRIBUTE__ID = SRC_ESTRUCTURAL_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EAttribute Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EATTRIBUTE__EATTRIBUTE_TYPE = SRC_ESTRUCTURAL_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Src EAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EATTRIBUTE_FEATURE_COUNT = SRC_ESTRUCTURAL_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Feature ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EATTRIBUTE___GET_FEATURE_ID = SRC_ESTRUCTURAL_FEATURE___GET_FEATURE_ID;

	/**
	 * The number of operations of the '<em>Src EAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EATTRIBUTE_OPERATION_COUNT = SRC_ESTRUCTURAL_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_Ecore2Maude.impl.SrcEClassifierImpl <em>Src EClassifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Ecore2Maude.impl.SrcEClassifierImpl
	 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getSrcEClassifier()
	 * @generated
	 */
	int SRC_ECLASSIFIER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ECLASSIFIER__NAME = SRC_ENAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ECLASSIFIER__INSTANCE_CLASS_NAME = SRC_ENAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ECLASSIFIER__INSTANCE_TYPE_NAME = SRC_ENAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>EPackage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ECLASSIFIER__EPACKAGE = SRC_ENAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Src EClassifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ECLASSIFIER_FEATURE_COUNT = SRC_ENAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Classifier ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ECLASSIFIER___GET_CLASSIFIER_ID = SRC_ENAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Src EClassifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ECLASSIFIER_OPERATION_COUNT = SRC_ENAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link jointPackage_Ecore2Maude.impl.SrcEClassImpl <em>Src EClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Ecore2Maude.impl.SrcEClassImpl
	 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getSrcEClass()
	 * @generated
	 */
	int SRC_ECLASS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ECLASS__NAME = SRC_ECLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ECLASS__INSTANCE_CLASS_NAME = SRC_ECLASSIFIER__INSTANCE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Instance Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ECLASS__INSTANCE_TYPE_NAME = SRC_ECLASSIFIER__INSTANCE_TYPE_NAME;

	/**
	 * The feature id for the '<em><b>EPackage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ECLASS__EPACKAGE = SRC_ECLASSIFIER__EPACKAGE;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ECLASS__ABSTRACT = SRC_ECLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ECLASS__INTERFACE = SRC_ECLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>ESuper Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ECLASS__ESUPER_TYPES = SRC_ECLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>EOperations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ECLASS__EOPERATIONS = SRC_ECLASSIFIER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>EAll Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ECLASS__EALL_ATTRIBUTES = SRC_ECLASSIFIER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>EAll References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ECLASS__EALL_REFERENCES = SRC_ECLASSIFIER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>EReferences</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ECLASS__EREFERENCES = SRC_ECLASSIFIER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>EAttributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ECLASS__EATTRIBUTES = SRC_ECLASSIFIER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>EAll Containments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ECLASS__EALL_CONTAINMENTS = SRC_ECLASSIFIER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>EAll Operations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ECLASS__EALL_OPERATIONS = SRC_ECLASSIFIER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>EAll Structural Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ECLASS__EALL_STRUCTURAL_FEATURES = SRC_ECLASSIFIER_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>EAll Super Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ECLASS__EALL_SUPER_TYPES = SRC_ECLASSIFIER_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>EID Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ECLASS__EID_ATTRIBUTE = SRC_ECLASSIFIER_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>EStructural Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ECLASS__ESTRUCTURAL_FEATURES = SRC_ECLASSIFIER_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Src EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ECLASS_FEATURE_COUNT = SRC_ECLASSIFIER_FEATURE_COUNT + 14;

	/**
	 * The operation id for the '<em>Get Classifier ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ECLASS___GET_CLASSIFIER_ID = SRC_ECLASSIFIER___GET_CLASSIFIER_ID;

	/**
	 * The operation id for the '<em>Is Super Type Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ECLASS___IS_SUPER_TYPE_OF__SRCECLASS = SRC_ECLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Feature Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ECLASS___GET_FEATURE_COUNT = SRC_ECLASSIFIER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EStructural Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ECLASS___GET_ESTRUCTURAL_FEATURE__INT = SRC_ECLASSIFIER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Feature ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ECLASS___GET_FEATURE_ID__SRCESTRUCTURALFEATURE = SRC_ECLASSIFIER_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get EStructural Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ECLASS___GET_ESTRUCTURAL_FEATURE__STRING = SRC_ECLASSIFIER_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Src EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ECLASS_OPERATION_COUNT = SRC_ECLASSIFIER_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link jointPackage_Ecore2Maude.impl.SrcEDataTypeImpl <em>Src EData Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Ecore2Maude.impl.SrcEDataTypeImpl
	 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getSrcEDataType()
	 * @generated
	 */
	int SRC_EDATA_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EDATA_TYPE__NAME = SRC_ECLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EDATA_TYPE__INSTANCE_CLASS_NAME = SRC_ECLASSIFIER__INSTANCE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Instance Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EDATA_TYPE__INSTANCE_TYPE_NAME = SRC_ECLASSIFIER__INSTANCE_TYPE_NAME;

	/**
	 * The feature id for the '<em><b>EPackage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EDATA_TYPE__EPACKAGE = SRC_ECLASSIFIER__EPACKAGE;

	/**
	 * The feature id for the '<em><b>Serializable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EDATA_TYPE__SERIALIZABLE = SRC_ECLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Src EData Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EDATA_TYPE_FEATURE_COUNT = SRC_ECLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Classifier ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EDATA_TYPE___GET_CLASSIFIER_ID = SRC_ECLASSIFIER___GET_CLASSIFIER_ID;

	/**
	 * The number of operations of the '<em>Src EData Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EDATA_TYPE_OPERATION_COUNT = SRC_ECLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_Ecore2Maude.impl.SrcEEnumImpl <em>Src EEnum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Ecore2Maude.impl.SrcEEnumImpl
	 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getSrcEEnum()
	 * @generated
	 */
	int SRC_EENUM = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EENUM__NAME = SRC_EDATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EENUM__INSTANCE_CLASS_NAME = SRC_EDATA_TYPE__INSTANCE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Instance Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EENUM__INSTANCE_TYPE_NAME = SRC_EDATA_TYPE__INSTANCE_TYPE_NAME;

	/**
	 * The feature id for the '<em><b>EPackage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EENUM__EPACKAGE = SRC_EDATA_TYPE__EPACKAGE;

	/**
	 * The feature id for the '<em><b>Serializable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EENUM__SERIALIZABLE = SRC_EDATA_TYPE__SERIALIZABLE;

	/**
	 * The feature id for the '<em><b>ELiterals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EENUM__ELITERALS = SRC_EDATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Src EEnum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EENUM_FEATURE_COUNT = SRC_EDATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Classifier ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EENUM___GET_CLASSIFIER_ID = SRC_EDATA_TYPE___GET_CLASSIFIER_ID;

	/**
	 * The operation id for the '<em>Get EEnum Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EENUM___GET_EENUM_LITERAL__STRING = SRC_EDATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EEnum Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EENUM___GET_EENUM_LITERAL__INT = SRC_EDATA_TYPE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EEnum Literal By Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EENUM___GET_EENUM_LITERAL_BY_LITERAL__STRING = SRC_EDATA_TYPE_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Src EEnum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EENUM_OPERATION_COUNT = SRC_EDATA_TYPE_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link jointPackage_Ecore2Maude.impl.SrcEEnumLiteralImpl <em>Src EEnum Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Ecore2Maude.impl.SrcEEnumLiteralImpl
	 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getSrcEEnumLiteral()
	 * @generated
	 */
	int SRC_EENUM_LITERAL = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EENUM_LITERAL__NAME = SRC_ENAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EENUM_LITERAL__VALUE = SRC_ENAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EENUM_LITERAL__LITERAL = SRC_ENAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>EEnum</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EENUM_LITERAL__EENUM = SRC_ENAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Src EEnum Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EENUM_LITERAL_FEATURE_COUNT = SRC_ENAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Src EEnum Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EENUM_LITERAL_OPERATION_COUNT = SRC_ENAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_Ecore2Maude.impl.SrcEOperationImpl <em>Src EOperation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Ecore2Maude.impl.SrcEOperationImpl
	 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getSrcEOperation()
	 * @generated
	 */
	int SRC_EOPERATION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EOPERATION__NAME = SRC_ETYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EOPERATION__ORDERED = SRC_ETYPED_ELEMENT__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EOPERATION__UNIQUE = SRC_ETYPED_ELEMENT__UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EOPERATION__LOWER_BOUND = SRC_ETYPED_ELEMENT__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EOPERATION__UPPER_BOUND = SRC_ETYPED_ELEMENT__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EOPERATION__MANY = SRC_ETYPED_ELEMENT__MANY;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EOPERATION__REQUIRED = SRC_ETYPED_ELEMENT__REQUIRED;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EOPERATION__ETYPE = SRC_ETYPED_ELEMENT__ETYPE;

	/**
	 * The feature id for the '<em><b>EContaining Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EOPERATION__ECONTAINING_CLASS = SRC_ETYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EParameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EOPERATION__EPARAMETERS = SRC_ETYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>EExceptions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EOPERATION__EEXCEPTIONS = SRC_ETYPED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Src EOperation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EOPERATION_FEATURE_COUNT = SRC_ETYPED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Src EOperation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EOPERATION_OPERATION_COUNT = SRC_ETYPED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_Ecore2Maude.impl.SrcEPackageImpl <em>Src EPackage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Ecore2Maude.impl.SrcEPackageImpl
	 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getSrcEPackage()
	 * @generated
	 */
	int SRC_EPACKAGE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EPACKAGE__NAME = SRC_ENAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ns URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EPACKAGE__NS_URI = SRC_ENAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ns Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EPACKAGE__NS_PREFIX = SRC_ENAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>EClassifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EPACKAGE__ECLASSIFIERS = SRC_ENAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>ESubpackages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EPACKAGE__ESUBPACKAGES = SRC_ENAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>ESuper Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EPACKAGE__ESUPER_PACKAGE = SRC_ENAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Src EPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EPACKAGE_FEATURE_COUNT = SRC_ENAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get EClassifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EPACKAGE___GET_ECLASSIFIER__STRING = SRC_ENAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Src EPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EPACKAGE_OPERATION_COUNT = SRC_ENAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link jointPackage_Ecore2Maude.impl.SrcEParameterImpl <em>Src EParameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Ecore2Maude.impl.SrcEParameterImpl
	 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getSrcEParameter()
	 * @generated
	 */
	int SRC_EPARAMETER = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EPARAMETER__NAME = SRC_ETYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EPARAMETER__ORDERED = SRC_ETYPED_ELEMENT__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EPARAMETER__UNIQUE = SRC_ETYPED_ELEMENT__UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EPARAMETER__LOWER_BOUND = SRC_ETYPED_ELEMENT__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EPARAMETER__UPPER_BOUND = SRC_ETYPED_ELEMENT__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EPARAMETER__MANY = SRC_ETYPED_ELEMENT__MANY;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EPARAMETER__REQUIRED = SRC_ETYPED_ELEMENT__REQUIRED;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EPARAMETER__ETYPE = SRC_ETYPED_ELEMENT__ETYPE;

	/**
	 * The feature id for the '<em><b>EOperation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EPARAMETER__EOPERATION = SRC_ETYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Src EParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EPARAMETER_FEATURE_COUNT = SRC_ETYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Src EParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EPARAMETER_OPERATION_COUNT = SRC_ETYPED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_Ecore2Maude.impl.SrcEReferenceImpl <em>Src EReference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Ecore2Maude.impl.SrcEReferenceImpl
	 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getSrcEReference()
	 * @generated
	 */
	int SRC_EREFERENCE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EREFERENCE__NAME = SRC_ESTRUCTURAL_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EREFERENCE__ORDERED = SRC_ESTRUCTURAL_FEATURE__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EREFERENCE__UNIQUE = SRC_ESTRUCTURAL_FEATURE__UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EREFERENCE__LOWER_BOUND = SRC_ESTRUCTURAL_FEATURE__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EREFERENCE__UPPER_BOUND = SRC_ESTRUCTURAL_FEATURE__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EREFERENCE__MANY = SRC_ESTRUCTURAL_FEATURE__MANY;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EREFERENCE__REQUIRED = SRC_ESTRUCTURAL_FEATURE__REQUIRED;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EREFERENCE__ETYPE = SRC_ESTRUCTURAL_FEATURE__ETYPE;

	/**
	 * The feature id for the '<em><b>Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EREFERENCE__CHANGEABLE = SRC_ESTRUCTURAL_FEATURE__CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EREFERENCE__VOLATILE = SRC_ESTRUCTURAL_FEATURE__VOLATILE;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EREFERENCE__TRANSIENT = SRC_ESTRUCTURAL_FEATURE__TRANSIENT;

	/**
	 * The feature id for the '<em><b>Default Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EREFERENCE__DEFAULT_VALUE_LITERAL = SRC_ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL;

	/**
	 * The feature id for the '<em><b>Unsettable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EREFERENCE__UNSETTABLE = SRC_ESTRUCTURAL_FEATURE__UNSETTABLE;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EREFERENCE__DERIVED = SRC_ESTRUCTURAL_FEATURE__DERIVED;

	/**
	 * The feature id for the '<em><b>EContaining Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EREFERENCE__ECONTAINING_CLASS = SRC_ESTRUCTURAL_FEATURE__ECONTAINING_CLASS;

	/**
	 * The feature id for the '<em><b>Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EREFERENCE__CONTAINMENT = SRC_ESTRUCTURAL_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Container</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EREFERENCE__CONTAINER = SRC_ESTRUCTURAL_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resolve Proxies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EREFERENCE__RESOLVE_PROXIES = SRC_ESTRUCTURAL_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>EOpposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EREFERENCE__EOPPOSITE = SRC_ESTRUCTURAL_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>EReference Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EREFERENCE__EREFERENCE_TYPE = SRC_ESTRUCTURAL_FEATURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>EKeys</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EREFERENCE__EKEYS = SRC_ESTRUCTURAL_FEATURE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Src EReference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EREFERENCE_FEATURE_COUNT = SRC_ESTRUCTURAL_FEATURE_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Feature ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EREFERENCE___GET_FEATURE_ID = SRC_ESTRUCTURAL_FEATURE___GET_FEATURE_ID;

	/**
	 * The number of operations of the '<em>Src EReference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EREFERENCE_OPERATION_COUNT = SRC_ESTRUCTURAL_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_Ecore2Maude.impl.TrgMaudeSpecImpl <em>Trg Maude Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Ecore2Maude.impl.TrgMaudeSpecImpl
	 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgMaudeSpec()
	 * @generated
	 */
	int TRG_MAUDE_SPEC = 15;

	/**
	 * The feature id for the '<em><b>Els</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_MAUDE_SPEC__ELS = 0;

	/**
	 * The feature id for the '<em><b>Printable Els</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_MAUDE_SPEC__PRINTABLE_ELS = 1;

	/**
	 * The number of structural features of the '<em>Trg Maude Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_MAUDE_SPEC_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Trg Maude Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_MAUDE_SPEC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jointPackage_Ecore2Maude.impl.TrgModElementImpl <em>Trg Mod Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Ecore2Maude.impl.TrgModElementImpl
	 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgModElement()
	 * @generated
	 */
	int TRG_MOD_ELEMENT = 37;

	/**
	 * The feature id for the '<em><b>Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_MOD_ELEMENT__MODULE = 0;

	/**
	 * The feature id for the '<em><b>Theory</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_MOD_ELEMENT__THEORY = 1;

	/**
	 * The number of structural features of the '<em>Trg Mod Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_MOD_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Trg Mod Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_MOD_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jointPackage_Ecore2Maude.impl.TrgStatementImpl <em>Trg Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Ecore2Maude.impl.TrgStatementImpl
	 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgStatement()
	 * @generated
	 */
	int TRG_STATEMENT = 44;

	/**
	 * The feature id for the '<em><b>Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_STATEMENT__MODULE = TRG_MOD_ELEMENT__MODULE;

	/**
	 * The feature id for the '<em><b>Theory</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_STATEMENT__THEORY = TRG_MOD_ELEMENT__THEORY;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_STATEMENT__LABEL = TRG_MOD_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Atts</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_STATEMENT__ATTS = TRG_MOD_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Conds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_STATEMENT__CONDS = TRG_MOD_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Trg Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_STATEMENT_FEATURE_COUNT = TRG_MOD_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Trg Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_STATEMENT_OPERATION_COUNT = TRG_MOD_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_Ecore2Maude.impl.TrgMembershipImpl <em>Trg Membership</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Ecore2Maude.impl.TrgMembershipImpl
	 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgMembership()
	 * @generated
	 */
	int TRG_MEMBERSHIP = 16;

	/**
	 * The feature id for the '<em><b>Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_MEMBERSHIP__MODULE = TRG_STATEMENT__MODULE;

	/**
	 * The feature id for the '<em><b>Theory</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_MEMBERSHIP__THEORY = TRG_STATEMENT__THEORY;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_MEMBERSHIP__LABEL = TRG_STATEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Atts</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_MEMBERSHIP__ATTS = TRG_STATEMENT__ATTS;

	/**
	 * The feature id for the '<em><b>Conds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_MEMBERSHIP__CONDS = TRG_STATEMENT__CONDS;

	/**
	 * The feature id for the '<em><b>Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_MEMBERSHIP__TERM = TRG_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_MEMBERSHIP__SORT = TRG_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Trg Membership</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_MEMBERSHIP_FEATURE_COUNT = TRG_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Trg Membership</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_MEMBERSHIP_OPERATION_COUNT = TRG_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_Ecore2Maude.impl.TrgEquationImpl <em>Trg Equation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Ecore2Maude.impl.TrgEquationImpl
	 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgEquation()
	 * @generated
	 */
	int TRG_EQUATION = 17;

	/**
	 * The feature id for the '<em><b>Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_EQUATION__MODULE = TRG_STATEMENT__MODULE;

	/**
	 * The feature id for the '<em><b>Theory</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_EQUATION__THEORY = TRG_STATEMENT__THEORY;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_EQUATION__LABEL = TRG_STATEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Atts</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_EQUATION__ATTS = TRG_STATEMENT__ATTS;

	/**
	 * The feature id for the '<em><b>Conds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_EQUATION__CONDS = TRG_STATEMENT__CONDS;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_EQUATION__LHS = TRG_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_EQUATION__RHS = TRG_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Trg Equation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_EQUATION_FEATURE_COUNT = TRG_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Trg Equation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_EQUATION_OPERATION_COUNT = TRG_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_Ecore2Maude.impl.TrgRuleImpl <em>Trg Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Ecore2Maude.impl.TrgRuleImpl
	 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgRule()
	 * @generated
	 */
	int TRG_RULE = 18;

	/**
	 * The feature id for the '<em><b>Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_RULE__MODULE = TRG_STATEMENT__MODULE;

	/**
	 * The feature id for the '<em><b>Theory</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_RULE__THEORY = TRG_STATEMENT__THEORY;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_RULE__LABEL = TRG_STATEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Atts</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_RULE__ATTS = TRG_STATEMENT__ATTS;

	/**
	 * The feature id for the '<em><b>Conds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_RULE__CONDS = TRG_STATEMENT__CONDS;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_RULE__LHS = TRG_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_RULE__RHS = TRG_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Trg Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_RULE_FEATURE_COUNT = TRG_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Trg Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_RULE_OPERATION_COUNT = TRG_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_Ecore2Maude.impl.TrgConditionImpl <em>Trg Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Ecore2Maude.impl.TrgConditionImpl
	 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgCondition()
	 * @generated
	 */
	int TRG_CONDITION = 45;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_CONDITION__LHS = 0;

	/**
	 * The number of structural features of the '<em>Trg Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_CONDITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Trg Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jointPackage_Ecore2Maude.impl.TrgEquationalCondImpl <em>Trg Equational Cond</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Ecore2Maude.impl.TrgEquationalCondImpl
	 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgEquationalCond()
	 * @generated
	 */
	int TRG_EQUATIONAL_COND = 46;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_EQUATIONAL_COND__LHS = TRG_CONDITION__LHS;

	/**
	 * The number of structural features of the '<em>Trg Equational Cond</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_EQUATIONAL_COND_FEATURE_COUNT = TRG_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Trg Equational Cond</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_EQUATIONAL_COND_OPERATION_COUNT = TRG_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_Ecore2Maude.impl.TrgMembershipCondImpl <em>Trg Membership Cond</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Ecore2Maude.impl.TrgMembershipCondImpl
	 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgMembershipCond()
	 * @generated
	 */
	int TRG_MEMBERSHIP_COND = 19;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_MEMBERSHIP_COND__LHS = TRG_EQUATIONAL_COND__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_MEMBERSHIP_COND__RHS = TRG_EQUATIONAL_COND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trg Membership Cond</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_MEMBERSHIP_COND_FEATURE_COUNT = TRG_EQUATIONAL_COND_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trg Membership Cond</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_MEMBERSHIP_COND_OPERATION_COUNT = TRG_EQUATIONAL_COND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_Ecore2Maude.impl.TrgBooleanCondImpl <em>Trg Boolean Cond</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Ecore2Maude.impl.TrgBooleanCondImpl
	 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgBooleanCond()
	 * @generated
	 */
	int TRG_BOOLEAN_COND = 20;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_BOOLEAN_COND__LHS = TRG_EQUATIONAL_COND__LHS;

	/**
	 * The number of structural features of the '<em>Trg Boolean Cond</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_BOOLEAN_COND_FEATURE_COUNT = TRG_EQUATIONAL_COND_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Trg Boolean Cond</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_BOOLEAN_COND_OPERATION_COUNT = TRG_EQUATIONAL_COND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_Ecore2Maude.impl.TrgMatchingCondImpl <em>Trg Matching Cond</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Ecore2Maude.impl.TrgMatchingCondImpl
	 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgMatchingCond()
	 * @generated
	 */
	int TRG_MATCHING_COND = 21;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_MATCHING_COND__LHS = TRG_EQUATIONAL_COND__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_MATCHING_COND__RHS = TRG_EQUATIONAL_COND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trg Matching Cond</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_MATCHING_COND_FEATURE_COUNT = TRG_EQUATIONAL_COND_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trg Matching Cond</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_MATCHING_COND_OPERATION_COUNT = TRG_EQUATIONAL_COND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_Ecore2Maude.impl.TrgEqualCondImpl <em>Trg Equal Cond</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Ecore2Maude.impl.TrgEqualCondImpl
	 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgEqualCond()
	 * @generated
	 */
	int TRG_EQUAL_COND = 22;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_EQUAL_COND__LHS = TRG_EQUATIONAL_COND__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_EQUAL_COND__RHS = TRG_EQUATIONAL_COND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trg Equal Cond</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_EQUAL_COND_FEATURE_COUNT = TRG_EQUATIONAL_COND_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trg Equal Cond</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_EQUAL_COND_OPERATION_COUNT = TRG_EQUATIONAL_COND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_Ecore2Maude.impl.TrgMaudeTopElImpl <em>Trg Maude Top El</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Ecore2Maude.impl.TrgMaudeTopElImpl
	 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgMaudeTopEl()
	 * @generated
	 */
	int TRG_MAUDE_TOP_EL = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_MAUDE_TOP_EL__NAME = 0;

	/**
	 * The number of structural features of the '<em>Trg Maude Top El</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_MAUDE_TOP_EL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Trg Maude Top El</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_MAUDE_TOP_EL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jointPackage_Ecore2Maude.impl.TrgModExpressionImpl <em>Trg Mod Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Ecore2Maude.impl.TrgModExpressionImpl
	 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgModExpression()
	 * @generated
	 */
	int TRG_MOD_EXPRESSION = 24;

	/**
	 * The number of structural features of the '<em>Trg Mod Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_MOD_EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Trg Mod Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_MOD_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jointPackage_Ecore2Maude.impl.TrgInstModExpImpl <em>Trg Inst Mod Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Ecore2Maude.impl.TrgInstModExpImpl
	 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgInstModExp()
	 * @generated
	 */
	int TRG_INST_MOD_EXP = 25;

	/**
	 * The feature id for the '<em><b>Mod Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_INST_MOD_EXP__MOD_EXP = TRG_MOD_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Views</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_INST_MOD_EXP__VIEWS = TRG_MOD_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Trg Inst Mod Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_INST_MOD_EXP_FEATURE_COUNT = TRG_MOD_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Trg Inst Mod Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_INST_MOD_EXP_OPERATION_COUNT = TRG_MOD_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_Ecore2Maude.impl.TrgRenModExpImpl <em>Trg Ren Mod Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Ecore2Maude.impl.TrgRenModExpImpl
	 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgRenModExp()
	 * @generated
	 */
	int TRG_REN_MOD_EXP = 26;

	/**
	 * The feature id for the '<em><b>Mod Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_REN_MOD_EXP__MOD_EXP = TRG_MOD_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Renamings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_REN_MOD_EXP__RENAMINGS = TRG_MOD_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Trg Ren Mod Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_REN_MOD_EXP_FEATURE_COUNT = TRG_MOD_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Trg Ren Mod Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_REN_MOD_EXP_OPERATION_COUNT = TRG_MOD_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_Ecore2Maude.impl.TrgCompModExpImpl <em>Trg Comp Mod Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Ecore2Maude.impl.TrgCompModExpImpl
	 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgCompModExp()
	 * @generated
	 */
	int TRG_COMP_MOD_EXP = 27;

	/**
	 * The feature id for the '<em><b>Mod Exps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_COMP_MOD_EXP__MOD_EXPS = TRG_MOD_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trg Comp Mod Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_COMP_MOD_EXP_FEATURE_COUNT = TRG_MOD_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trg Comp Mod Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_COMP_MOD_EXP_OPERATION_COUNT = TRG_MOD_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_Ecore2Maude.impl.TrgModuleIdModExpImpl <em>Trg Module Id Mod Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Ecore2Maude.impl.TrgModuleIdModExpImpl
	 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgModuleIdModExp()
	 * @generated
	 */
	int TRG_MODULE_ID_MOD_EXP = 28;

	/**
	 * The feature id for the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_MODULE_ID_MOD_EXP__MODULE = TRG_MOD_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trg Module Id Mod Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_MODULE_ID_MOD_EXP_FEATURE_COUNT = TRG_MOD_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trg Module Id Mod Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_MODULE_ID_MOD_EXP_OPERATION_COUNT = TRG_MOD_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_Ecore2Maude.impl.TrgTheoryIdModExpImpl <em>Trg Theory Id Mod Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Ecore2Maude.impl.TrgTheoryIdModExpImpl
	 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgTheoryIdModExp()
	 * @generated
	 */
	int TRG_THEORY_ID_MOD_EXP = 29;

	/**
	 * The feature id for the '<em><b>Theory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_THEORY_ID_MOD_EXP__THEORY = TRG_MOD_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trg Theory Id Mod Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_THEORY_ID_MOD_EXP_FEATURE_COUNT = TRG_MOD_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trg Theory Id Mod Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_THEORY_ID_MOD_EXP_OPERATION_COUNT = TRG_MOD_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_Ecore2Maude.impl.TrgParameterImpl <em>Trg Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Ecore2Maude.impl.TrgParameterImpl
	 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgParameter()
	 * @generated
	 */
	int TRG_PARAMETER = 30;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_PARAMETER__LABEL = TRG_MOD_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mod Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_PARAMETER__MOD_EXP = TRG_MOD_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Trg Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_PARAMETER_FEATURE_COUNT = TRG_MOD_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Trg Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_PARAMETER_OPERATION_COUNT = TRG_MOD_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_Ecore2Maude.impl.TrgTheoryImpl <em>Trg Theory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Ecore2Maude.impl.TrgTheoryImpl
	 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgTheory()
	 * @generated
	 */
	int TRG_THEORY = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_THEORY__NAME = TRG_MAUDE_TOP_EL__NAME;

	/**
	 * The feature id for the '<em><b>Els</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_THEORY__ELS = TRG_MAUDE_TOP_EL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trg Theory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_THEORY_FEATURE_COUNT = TRG_MAUDE_TOP_EL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trg Theory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_THEORY_OPERATION_COUNT = TRG_MAUDE_TOP_EL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_Ecore2Maude.impl.TrgFTheoryImpl <em>Trg FTheory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Ecore2Maude.impl.TrgFTheoryImpl
	 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgFTheory()
	 * @generated
	 */
	int TRG_FTHEORY = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_FTHEORY__NAME = TRG_THEORY__NAME;

	/**
	 * The feature id for the '<em><b>Els</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_FTHEORY__ELS = TRG_THEORY__ELS;

	/**
	 * The number of structural features of the '<em>Trg FTheory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_FTHEORY_FEATURE_COUNT = TRG_THEORY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Trg FTheory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_FTHEORY_OPERATION_COUNT = TRG_THEORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_Ecore2Maude.impl.TrgSTheoryImpl <em>Trg STheory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Ecore2Maude.impl.TrgSTheoryImpl
	 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgSTheory()
	 * @generated
	 */
	int TRG_STHEORY = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_STHEORY__NAME = TRG_THEORY__NAME;

	/**
	 * The feature id for the '<em><b>Els</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_STHEORY__ELS = TRG_THEORY__ELS;

	/**
	 * The number of structural features of the '<em>Trg STheory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_STHEORY_FEATURE_COUNT = TRG_THEORY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Trg STheory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_STHEORY_OPERATION_COUNT = TRG_THEORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_Ecore2Maude.impl.TrgModuleImpl <em>Trg Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Ecore2Maude.impl.TrgModuleImpl
	 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgModule()
	 * @generated
	 */
	int TRG_MODULE = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_MODULE__NAME = TRG_MAUDE_TOP_EL__NAME;

	/**
	 * The feature id for the '<em><b>Els</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_MODULE__ELS = TRG_MAUDE_TOP_EL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_MODULE__PARAMS = TRG_MAUDE_TOP_EL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Trg Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_MODULE_FEATURE_COUNT = TRG_MAUDE_TOP_EL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Trg Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_MODULE_OPERATION_COUNT = TRG_MAUDE_TOP_EL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_Ecore2Maude.impl.TrgFModuleImpl <em>Trg FModule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Ecore2Maude.impl.TrgFModuleImpl
	 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgFModule()
	 * @generated
	 */
	int TRG_FMODULE = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_FMODULE__NAME = TRG_MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Els</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_FMODULE__ELS = TRG_MODULE__ELS;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_FMODULE__PARAMS = TRG_MODULE__PARAMS;

	/**
	 * The number of structural features of the '<em>Trg FModule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_FMODULE_FEATURE_COUNT = TRG_MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Trg FModule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_FMODULE_OPERATION_COUNT = TRG_MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_Ecore2Maude.impl.TrgSModuleImpl <em>Trg SModule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Ecore2Maude.impl.TrgSModuleImpl
	 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgSModule()
	 * @generated
	 */
	int TRG_SMODULE = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SMODULE__NAME = TRG_MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Els</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SMODULE__ELS = TRG_MODULE__ELS;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SMODULE__PARAMS = TRG_MODULE__PARAMS;

	/**
	 * The number of structural features of the '<em>Trg SModule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SMODULE_FEATURE_COUNT = TRG_MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Trg SModule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SMODULE_OPERATION_COUNT = TRG_MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_Ecore2Maude.impl.TrgModImportationImpl <em>Trg Mod Importation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Ecore2Maude.impl.TrgModImportationImpl
	 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgModImportation()
	 * @generated
	 */
	int TRG_MOD_IMPORTATION = 38;

	/**
	 * The feature id for the '<em><b>Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_MOD_IMPORTATION__MODULE = TRG_MOD_ELEMENT__MODULE;

	/**
	 * The feature id for the '<em><b>Theory</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_MOD_IMPORTATION__THEORY = TRG_MOD_ELEMENT__THEORY;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_MOD_IMPORTATION__IMPORTS = TRG_MOD_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trg Mod Importation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_MOD_IMPORTATION_FEATURE_COUNT = TRG_MOD_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trg Mod Importation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_MOD_IMPORTATION_OPERATION_COUNT = TRG_MOD_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_Ecore2Maude.impl.TrgTypeImpl <em>Trg Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Ecore2Maude.impl.TrgTypeImpl
	 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgType()
	 * @generated
	 */
	int TRG_TYPE = 39;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Trg Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Trg Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jointPackage_Ecore2Maude.impl.TrgSortImpl <em>Trg Sort</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Ecore2Maude.impl.TrgSortImpl
	 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgSort()
	 * @generated
	 */
	int TRG_SORT = 40;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SORT__NAME = TRG_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SORT__MODULE = TRG_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Theory</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SORT__THEORY = TRG_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Subsort Rels</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SORT__SUBSORT_RELS = TRG_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Supersort Rels</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SORT__SUPERSORT_RELS = TRG_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SORT__KIND = TRG_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Trg Sort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SORT_FEATURE_COUNT = TRG_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Trg Sort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SORT_OPERATION_COUNT = TRG_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_Ecore2Maude.impl.TrgKindImpl <em>Trg Kind</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Ecore2Maude.impl.TrgKindImpl
	 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgKind()
	 * @generated
	 */
	int TRG_KIND = 41;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_KIND__NAME = TRG_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Sorts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_KIND__SORTS = TRG_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trg Kind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_KIND_FEATURE_COUNT = TRG_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trg Kind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_KIND_OPERATION_COUNT = TRG_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_Ecore2Maude.impl.TrgSubsortRelImpl <em>Trg Subsort Rel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Ecore2Maude.impl.TrgSubsortRelImpl
	 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgSubsortRel()
	 * @generated
	 */
	int TRG_SUBSORT_REL = 42;

	/**
	 * The feature id for the '<em><b>Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SUBSORT_REL__MODULE = TRG_MOD_ELEMENT__MODULE;

	/**
	 * The feature id for the '<em><b>Theory</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SUBSORT_REL__THEORY = TRG_MOD_ELEMENT__THEORY;

	/**
	 * The feature id for the '<em><b>Subsorts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SUBSORT_REL__SUBSORTS = TRG_MOD_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Supersorts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SUBSORT_REL__SUPERSORTS = TRG_MOD_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Trg Subsort Rel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SUBSORT_REL_FEATURE_COUNT = TRG_MOD_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Trg Subsort Rel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SUBSORT_REL_OPERATION_COUNT = TRG_MOD_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_Ecore2Maude.impl.TrgOperationImpl <em>Trg Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Ecore2Maude.impl.TrgOperationImpl
	 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgOperation()
	 * @generated
	 */
	int TRG_OPERATION = 43;

	/**
	 * The feature id for the '<em><b>Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_OPERATION__MODULE = TRG_MOD_ELEMENT__MODULE;

	/**
	 * The feature id for the '<em><b>Theory</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_OPERATION__THEORY = TRG_MOD_ELEMENT__THEORY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_OPERATION__NAME = TRG_MOD_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Coarity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_OPERATION__COARITY = TRG_MOD_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Arity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_OPERATION__ARITY = TRG_MOD_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Atts</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_OPERATION__ATTS = TRG_MOD_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Trg Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_OPERATION_FEATURE_COUNT = TRG_MOD_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Trg Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_OPERATION_OPERATION_COUNT = TRG_MOD_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_Ecore2Maude.impl.TrgRewriteCondImpl <em>Trg Rewrite Cond</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Ecore2Maude.impl.TrgRewriteCondImpl
	 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgRewriteCond()
	 * @generated
	 */
	int TRG_REWRITE_COND = 47;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_REWRITE_COND__LHS = TRG_CONDITION__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_REWRITE_COND__RHS = TRG_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trg Rewrite Cond</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_REWRITE_COND_FEATURE_COUNT = TRG_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trg Rewrite Cond</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_REWRITE_COND_OPERATION_COUNT = TRG_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_Ecore2Maude.impl.TrgTermImpl <em>Trg Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Ecore2Maude.impl.TrgTermImpl
	 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgTerm()
	 * @generated
	 */
	int TRG_TERM = 48;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_TERM__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Trg Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_TERM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Trg Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_TERM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jointPackage_Ecore2Maude.impl.TrgConstantImpl <em>Trg Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Ecore2Maude.impl.TrgConstantImpl
	 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgConstant()
	 * @generated
	 */
	int TRG_CONSTANT = 49;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_CONSTANT__TYPE = TRG_TERM__TYPE;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_CONSTANT__OP = TRG_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trg Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_CONSTANT_FEATURE_COUNT = TRG_TERM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trg Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_CONSTANT_OPERATION_COUNT = TRG_TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_Ecore2Maude.impl.TrgRecTermImpl <em>Trg Rec Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Ecore2Maude.impl.TrgRecTermImpl
	 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgRecTerm()
	 * @generated
	 */
	int TRG_REC_TERM = 50;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_REC_TERM__TYPE = TRG_TERM__TYPE;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_REC_TERM__OP = TRG_TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_REC_TERM__ARGS = TRG_TERM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Trg Rec Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_REC_TERM_FEATURE_COUNT = TRG_TERM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Trg Rec Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_REC_TERM_OPERATION_COUNT = TRG_TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_Ecore2Maude.impl.TrgVariableImpl <em>Trg Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Ecore2Maude.impl.TrgVariableImpl
	 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgVariable()
	 * @generated
	 */
	int TRG_VARIABLE = 51;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_VARIABLE__TYPE = TRG_TERM__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_VARIABLE__NAME = TRG_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trg Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_VARIABLE_FEATURE_COUNT = TRG_TERM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trg Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_VARIABLE_OPERATION_COUNT = TRG_TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_Ecore2Maude.impl.TrgViewImpl <em>Trg View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Ecore2Maude.impl.TrgViewImpl
	 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgView()
	 * @generated
	 */
	int TRG_VIEW = 52;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_VIEW__NAME = TRG_MAUDE_TOP_EL__NAME;

	/**
	 * The feature id for the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_VIEW__FROM = TRG_MAUDE_TOP_EL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_VIEW__TO = TRG_MAUDE_TOP_EL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Els</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_VIEW__ELS = TRG_MAUDE_TOP_EL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Trg View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_VIEW_FEATURE_COUNT = TRG_MAUDE_TOP_EL_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Trg View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_VIEW_OPERATION_COUNT = TRG_MAUDE_TOP_EL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_Ecore2Maude.impl.TrgViewMappingImpl <em>Trg View Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Ecore2Maude.impl.TrgViewMappingImpl
	 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgViewMapping()
	 * @generated
	 */
	int TRG_VIEW_MAPPING = 53;

	/**
	 * The number of structural features of the '<em>Trg View Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_VIEW_MAPPING_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Trg View Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_VIEW_MAPPING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jointPackage_Ecore2Maude.impl.TrgRenMappingImpl <em>Trg Ren Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Ecore2Maude.impl.TrgRenMappingImpl
	 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgRenMapping()
	 * @generated
	 */
	int TRG_REN_MAPPING = 54;

	/**
	 * The number of structural features of the '<em>Trg Ren Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_REN_MAPPING_FEATURE_COUNT = TRG_VIEW_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Trg Ren Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_REN_MAPPING_OPERATION_COUNT = TRG_VIEW_MAPPING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_Ecore2Maude.impl.TrgTermMappingImpl <em>Trg Term Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Ecore2Maude.impl.TrgTermMappingImpl
	 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgTermMapping()
	 * @generated
	 */
	int TRG_TERM_MAPPING = 55;

	/**
	 * The feature id for the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_TERM_MAPPING__FROM = TRG_VIEW_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_TERM_MAPPING__TO = TRG_VIEW_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Trg Term Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_TERM_MAPPING_FEATURE_COUNT = TRG_VIEW_MAPPING_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Trg Term Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_TERM_MAPPING_OPERATION_COUNT = TRG_VIEW_MAPPING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_Ecore2Maude.impl.TrgSortMappingImpl <em>Trg Sort Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Ecore2Maude.impl.TrgSortMappingImpl
	 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgSortMapping()
	 * @generated
	 */
	int TRG_SORT_MAPPING = 56;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SORT_MAPPING__FROM = TRG_REN_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SORT_MAPPING__TO = TRG_REN_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Trg Sort Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SORT_MAPPING_FEATURE_COUNT = TRG_REN_MAPPING_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Trg Sort Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SORT_MAPPING_OPERATION_COUNT = TRG_REN_MAPPING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_Ecore2Maude.impl.TrgOpTypedMappingImpl <em>Trg Op Typed Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Ecore2Maude.impl.TrgOpTypedMappingImpl
	 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgOpTypedMapping()
	 * @generated
	 */
	int TRG_OP_TYPED_MAPPING = 57;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_OP_TYPED_MAPPING__FROM = TRG_REN_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_OP_TYPED_MAPPING__TO = TRG_REN_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Atts</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_OP_TYPED_MAPPING__ATTS = TRG_REN_MAPPING_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Trg Op Typed Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_OP_TYPED_MAPPING_FEATURE_COUNT = TRG_REN_MAPPING_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Trg Op Typed Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_OP_TYPED_MAPPING_OPERATION_COUNT = TRG_REN_MAPPING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_Ecore2Maude.impl.TrgOpMappingImpl <em>Trg Op Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Ecore2Maude.impl.TrgOpMappingImpl
	 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgOpMapping()
	 * @generated
	 */
	int TRG_OP_MAPPING = 58;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_OP_MAPPING__FROM = TRG_REN_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_OP_MAPPING__TO = TRG_REN_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Trg Op Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_OP_MAPPING_FEATURE_COUNT = TRG_REN_MAPPING_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Trg Op Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_OP_MAPPING_OPERATION_COUNT = TRG_REN_MAPPING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_Ecore2Maude.impl.TrgLabelMappingImpl <em>Trg Label Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Ecore2Maude.impl.TrgLabelMappingImpl
	 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgLabelMapping()
	 * @generated
	 */
	int TRG_LABEL_MAPPING = 59;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_LABEL_MAPPING__FROM = TRG_REN_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_LABEL_MAPPING__TO = TRG_REN_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Trg Label Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_LABEL_MAPPING_FEATURE_COUNT = TRG_REN_MAPPING_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Trg Label Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_LABEL_MAPPING_OPERATION_COUNT = TRG_REN_MAPPING_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link jointPackage_Ecore2Maude.JointMM <em>Joint MM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Joint MM</em>'.
	 * @see jointPackage_Ecore2Maude.JointMM
	 * @generated
	 */
	EClass getJointMM();

	/**
	 * Returns the meta object for the containment reference '{@link jointPackage_Ecore2Maude.JointMM#getSourceRoot <em>Source Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Root</em>'.
	 * @see jointPackage_Ecore2Maude.JointMM#getSourceRoot()
	 * @see #getJointMM()
	 * @generated
	 */
	EReference getJointMM_SourceRoot();

	/**
	 * Returns the meta object for the containment reference '{@link jointPackage_Ecore2Maude.JointMM#getTargetRoot <em>Target Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Root</em>'.
	 * @see jointPackage_Ecore2Maude.JointMM#getTargetRoot()
	 * @see #getJointMM()
	 * @generated
	 */
	EReference getJointMM_TargetRoot();

	/**
	 * Returns the meta object for class '{@link jointPackage_Ecore2Maude.SrcEStringToStringMapEntry <em>Src EString To String Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src EString To String Map Entry</em>'.
	 * @see jointPackage_Ecore2Maude.SrcEStringToStringMapEntry
	 * @generated
	 */
	EClass getSrcEStringToStringMapEntry();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_Ecore2Maude.SrcEStringToStringMapEntry#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see jointPackage_Ecore2Maude.SrcEStringToStringMapEntry#getKey()
	 * @see #getSrcEStringToStringMapEntry()
	 * @generated
	 */
	EAttribute getSrcEStringToStringMapEntry_Key();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_Ecore2Maude.SrcEStringToStringMapEntry#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see jointPackage_Ecore2Maude.SrcEStringToStringMapEntry#getValue()
	 * @see #getSrcEStringToStringMapEntry()
	 * @generated
	 */
	EAttribute getSrcEStringToStringMapEntry_Value();

	/**
	 * Returns the meta object for class '{@link jointPackage_Ecore2Maude.SrcEAttribute <em>Src EAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src EAttribute</em>'.
	 * @see jointPackage_Ecore2Maude.SrcEAttribute
	 * @generated
	 */
	EClass getSrcEAttribute();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_Ecore2Maude.SrcEAttribute#isID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see jointPackage_Ecore2Maude.SrcEAttribute#isID()
	 * @see #getSrcEAttribute()
	 * @generated
	 */
	EAttribute getSrcEAttribute_ID();

	/**
	 * Returns the meta object for the reference '{@link jointPackage_Ecore2Maude.SrcEAttribute#getEAttributeType <em>EAttribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EAttribute Type</em>'.
	 * @see jointPackage_Ecore2Maude.SrcEAttribute#getEAttributeType()
	 * @see #getSrcEAttribute()
	 * @generated
	 */
	EReference getSrcEAttribute_EAttributeType();

	/**
	 * Returns the meta object for class '{@link jointPackage_Ecore2Maude.SrcEClass <em>Src EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src EClass</em>'.
	 * @see jointPackage_Ecore2Maude.SrcEClass
	 * @generated
	 */
	EClass getSrcEClass();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_Ecore2Maude.SrcEClass#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see jointPackage_Ecore2Maude.SrcEClass#isAbstract()
	 * @see #getSrcEClass()
	 * @generated
	 */
	EAttribute getSrcEClass_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_Ecore2Maude.SrcEClass#isInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface</em>'.
	 * @see jointPackage_Ecore2Maude.SrcEClass#isInterface()
	 * @see #getSrcEClass()
	 * @generated
	 */
	EAttribute getSrcEClass_Interface();

	/**
	 * Returns the meta object for the reference list '{@link jointPackage_Ecore2Maude.SrcEClass#getESuperTypes <em>ESuper Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>ESuper Types</em>'.
	 * @see jointPackage_Ecore2Maude.SrcEClass#getESuperTypes()
	 * @see #getSrcEClass()
	 * @generated
	 */
	EReference getSrcEClass_ESuperTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link jointPackage_Ecore2Maude.SrcEClass#getEOperations <em>EOperations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EOperations</em>'.
	 * @see jointPackage_Ecore2Maude.SrcEClass#getEOperations()
	 * @see #getSrcEClass()
	 * @generated
	 */
	EReference getSrcEClass_EOperations();

	/**
	 * Returns the meta object for the reference list '{@link jointPackage_Ecore2Maude.SrcEClass#getEAllAttributes <em>EAll Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EAll Attributes</em>'.
	 * @see jointPackage_Ecore2Maude.SrcEClass#getEAllAttributes()
	 * @see #getSrcEClass()
	 * @generated
	 */
	EReference getSrcEClass_EAllAttributes();

	/**
	 * Returns the meta object for the reference list '{@link jointPackage_Ecore2Maude.SrcEClass#getEAllReferences <em>EAll References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EAll References</em>'.
	 * @see jointPackage_Ecore2Maude.SrcEClass#getEAllReferences()
	 * @see #getSrcEClass()
	 * @generated
	 */
	EReference getSrcEClass_EAllReferences();

	/**
	 * Returns the meta object for the reference list '{@link jointPackage_Ecore2Maude.SrcEClass#getEReferences <em>EReferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EReferences</em>'.
	 * @see jointPackage_Ecore2Maude.SrcEClass#getEReferences()
	 * @see #getSrcEClass()
	 * @generated
	 */
	EReference getSrcEClass_EReferences();

	/**
	 * Returns the meta object for the reference list '{@link jointPackage_Ecore2Maude.SrcEClass#getEAttributes <em>EAttributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EAttributes</em>'.
	 * @see jointPackage_Ecore2Maude.SrcEClass#getEAttributes()
	 * @see #getSrcEClass()
	 * @generated
	 */
	EReference getSrcEClass_EAttributes();

	/**
	 * Returns the meta object for the reference list '{@link jointPackage_Ecore2Maude.SrcEClass#getEAllContainments <em>EAll Containments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EAll Containments</em>'.
	 * @see jointPackage_Ecore2Maude.SrcEClass#getEAllContainments()
	 * @see #getSrcEClass()
	 * @generated
	 */
	EReference getSrcEClass_EAllContainments();

	/**
	 * Returns the meta object for the reference list '{@link jointPackage_Ecore2Maude.SrcEClass#getEAllOperations <em>EAll Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EAll Operations</em>'.
	 * @see jointPackage_Ecore2Maude.SrcEClass#getEAllOperations()
	 * @see #getSrcEClass()
	 * @generated
	 */
	EReference getSrcEClass_EAllOperations();

	/**
	 * Returns the meta object for the reference list '{@link jointPackage_Ecore2Maude.SrcEClass#getEAllStructuralFeatures <em>EAll Structural Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EAll Structural Features</em>'.
	 * @see jointPackage_Ecore2Maude.SrcEClass#getEAllStructuralFeatures()
	 * @see #getSrcEClass()
	 * @generated
	 */
	EReference getSrcEClass_EAllStructuralFeatures();

	/**
	 * Returns the meta object for the reference list '{@link jointPackage_Ecore2Maude.SrcEClass#getEAllSuperTypes <em>EAll Super Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EAll Super Types</em>'.
	 * @see jointPackage_Ecore2Maude.SrcEClass#getEAllSuperTypes()
	 * @see #getSrcEClass()
	 * @generated
	 */
	EReference getSrcEClass_EAllSuperTypes();

	/**
	 * Returns the meta object for the reference '{@link jointPackage_Ecore2Maude.SrcEClass#getEIDAttribute <em>EID Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EID Attribute</em>'.
	 * @see jointPackage_Ecore2Maude.SrcEClass#getEIDAttribute()
	 * @see #getSrcEClass()
	 * @generated
	 */
	EReference getSrcEClass_EIDAttribute();

	/**
	 * Returns the meta object for the containment reference list '{@link jointPackage_Ecore2Maude.SrcEClass#getEStructuralFeatures <em>EStructural Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EStructural Features</em>'.
	 * @see jointPackage_Ecore2Maude.SrcEClass#getEStructuralFeatures()
	 * @see #getSrcEClass()
	 * @generated
	 */
	EReference getSrcEClass_EStructuralFeatures();

	/**
	 * Returns the meta object for the '{@link jointPackage_Ecore2Maude.SrcEClass#isSuperTypeOf(jointPackage_Ecore2Maude.SrcEClass) <em>Is Super Type Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Super Type Of</em>' operation.
	 * @see jointPackage_Ecore2Maude.SrcEClass#isSuperTypeOf(jointPackage_Ecore2Maude.SrcEClass)
	 * @generated
	 */
	EOperation getSrcEClass__IsSuperTypeOf__SrcEClass();

	/**
	 * Returns the meta object for the '{@link jointPackage_Ecore2Maude.SrcEClass#getFeatureCount() <em>Get Feature Count</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Feature Count</em>' operation.
	 * @see jointPackage_Ecore2Maude.SrcEClass#getFeatureCount()
	 * @generated
	 */
	EOperation getSrcEClass__GetFeatureCount();

	/**
	 * Returns the meta object for the '{@link jointPackage_Ecore2Maude.SrcEClass#getEStructuralFeature(int) <em>Get EStructural Feature</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get EStructural Feature</em>' operation.
	 * @see jointPackage_Ecore2Maude.SrcEClass#getEStructuralFeature(int)
	 * @generated
	 */
	EOperation getSrcEClass__GetEStructuralFeature__int();

	/**
	 * Returns the meta object for the '{@link jointPackage_Ecore2Maude.SrcEClass#getFeatureID(jointPackage_Ecore2Maude.SrcEStructuralFeature) <em>Get Feature ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Feature ID</em>' operation.
	 * @see jointPackage_Ecore2Maude.SrcEClass#getFeatureID(jointPackage_Ecore2Maude.SrcEStructuralFeature)
	 * @generated
	 */
	EOperation getSrcEClass__GetFeatureID__SrcEStructuralFeature();

	/**
	 * Returns the meta object for the '{@link jointPackage_Ecore2Maude.SrcEClass#getEStructuralFeature(java.lang.String) <em>Get EStructural Feature</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get EStructural Feature</em>' operation.
	 * @see jointPackage_Ecore2Maude.SrcEClass#getEStructuralFeature(java.lang.String)
	 * @generated
	 */
	EOperation getSrcEClass__GetEStructuralFeature__String();

	/**
	 * Returns the meta object for class '{@link jointPackage_Ecore2Maude.SrcEClassifier <em>Src EClassifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src EClassifier</em>'.
	 * @see jointPackage_Ecore2Maude.SrcEClassifier
	 * @generated
	 */
	EClass getSrcEClassifier();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_Ecore2Maude.SrcEClassifier#getInstanceClassName <em>Instance Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Class Name</em>'.
	 * @see jointPackage_Ecore2Maude.SrcEClassifier#getInstanceClassName()
	 * @see #getSrcEClassifier()
	 * @generated
	 */
	EAttribute getSrcEClassifier_InstanceClassName();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_Ecore2Maude.SrcEClassifier#getInstanceTypeName <em>Instance Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type Name</em>'.
	 * @see jointPackage_Ecore2Maude.SrcEClassifier#getInstanceTypeName()
	 * @see #getSrcEClassifier()
	 * @generated
	 */
	EAttribute getSrcEClassifier_InstanceTypeName();

	/**
	 * Returns the meta object for the container reference '{@link jointPackage_Ecore2Maude.SrcEClassifier#getEPackage <em>EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>EPackage</em>'.
	 * @see jointPackage_Ecore2Maude.SrcEClassifier#getEPackage()
	 * @see #getSrcEClassifier()
	 * @generated
	 */
	EReference getSrcEClassifier_EPackage();

	/**
	 * Returns the meta object for the '{@link jointPackage_Ecore2Maude.SrcEClassifier#getClassifierID() <em>Get Classifier ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Classifier ID</em>' operation.
	 * @see jointPackage_Ecore2Maude.SrcEClassifier#getClassifierID()
	 * @generated
	 */
	EOperation getSrcEClassifier__GetClassifierID();

	/**
	 * Returns the meta object for class '{@link jointPackage_Ecore2Maude.SrcEDataType <em>Src EData Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src EData Type</em>'.
	 * @see jointPackage_Ecore2Maude.SrcEDataType
	 * @generated
	 */
	EClass getSrcEDataType();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_Ecore2Maude.SrcEDataType#isSerializable <em>Serializable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serializable</em>'.
	 * @see jointPackage_Ecore2Maude.SrcEDataType#isSerializable()
	 * @see #getSrcEDataType()
	 * @generated
	 */
	EAttribute getSrcEDataType_Serializable();

	/**
	 * Returns the meta object for class '{@link jointPackage_Ecore2Maude.SrcEEnum <em>Src EEnum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src EEnum</em>'.
	 * @see jointPackage_Ecore2Maude.SrcEEnum
	 * @generated
	 */
	EClass getSrcEEnum();

	/**
	 * Returns the meta object for the containment reference list '{@link jointPackage_Ecore2Maude.SrcEEnum#getELiterals <em>ELiterals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ELiterals</em>'.
	 * @see jointPackage_Ecore2Maude.SrcEEnum#getELiterals()
	 * @see #getSrcEEnum()
	 * @generated
	 */
	EReference getSrcEEnum_ELiterals();

	/**
	 * Returns the meta object for the '{@link jointPackage_Ecore2Maude.SrcEEnum#getEEnumLiteral(java.lang.String) <em>Get EEnum Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get EEnum Literal</em>' operation.
	 * @see jointPackage_Ecore2Maude.SrcEEnum#getEEnumLiteral(java.lang.String)
	 * @generated
	 */
	EOperation getSrcEEnum__GetEEnumLiteral__String();

	/**
	 * Returns the meta object for the '{@link jointPackage_Ecore2Maude.SrcEEnum#getEEnumLiteral(int) <em>Get EEnum Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get EEnum Literal</em>' operation.
	 * @see jointPackage_Ecore2Maude.SrcEEnum#getEEnumLiteral(int)
	 * @generated
	 */
	EOperation getSrcEEnum__GetEEnumLiteral__int();

	/**
	 * Returns the meta object for the '{@link jointPackage_Ecore2Maude.SrcEEnum#getEEnumLiteralByLiteral(java.lang.String) <em>Get EEnum Literal By Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get EEnum Literal By Literal</em>' operation.
	 * @see jointPackage_Ecore2Maude.SrcEEnum#getEEnumLiteralByLiteral(java.lang.String)
	 * @generated
	 */
	EOperation getSrcEEnum__GetEEnumLiteralByLiteral__String();

	/**
	 * Returns the meta object for class '{@link jointPackage_Ecore2Maude.SrcEEnumLiteral <em>Src EEnum Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src EEnum Literal</em>'.
	 * @see jointPackage_Ecore2Maude.SrcEEnumLiteral
	 * @generated
	 */
	EClass getSrcEEnumLiteral();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_Ecore2Maude.SrcEEnumLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see jointPackage_Ecore2Maude.SrcEEnumLiteral#getValue()
	 * @see #getSrcEEnumLiteral()
	 * @generated
	 */
	EAttribute getSrcEEnumLiteral_Value();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_Ecore2Maude.SrcEEnumLiteral#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Literal</em>'.
	 * @see jointPackage_Ecore2Maude.SrcEEnumLiteral#getLiteral()
	 * @see #getSrcEEnumLiteral()
	 * @generated
	 */
	EAttribute getSrcEEnumLiteral_Literal();

	/**
	 * Returns the meta object for the container reference '{@link jointPackage_Ecore2Maude.SrcEEnumLiteral#getEEnum <em>EEnum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>EEnum</em>'.
	 * @see jointPackage_Ecore2Maude.SrcEEnumLiteral#getEEnum()
	 * @see #getSrcEEnumLiteral()
	 * @generated
	 */
	EReference getSrcEEnumLiteral_EEnum();

	/**
	 * Returns the meta object for class '{@link jointPackage_Ecore2Maude.SrcENamedElement <em>Src ENamed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src ENamed Element</em>'.
	 * @see jointPackage_Ecore2Maude.SrcENamedElement
	 * @generated
	 */
	EClass getSrcENamedElement();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_Ecore2Maude.SrcENamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jointPackage_Ecore2Maude.SrcENamedElement#getName()
	 * @see #getSrcENamedElement()
	 * @generated
	 */
	EAttribute getSrcENamedElement_Name();

	/**
	 * Returns the meta object for class '{@link jointPackage_Ecore2Maude.SrcEOperation <em>Src EOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src EOperation</em>'.
	 * @see jointPackage_Ecore2Maude.SrcEOperation
	 * @generated
	 */
	EClass getSrcEOperation();

	/**
	 * Returns the meta object for the container reference '{@link jointPackage_Ecore2Maude.SrcEOperation#getEContainingClass <em>EContaining Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>EContaining Class</em>'.
	 * @see jointPackage_Ecore2Maude.SrcEOperation#getEContainingClass()
	 * @see #getSrcEOperation()
	 * @generated
	 */
	EReference getSrcEOperation_EContainingClass();

	/**
	 * Returns the meta object for the containment reference list '{@link jointPackage_Ecore2Maude.SrcEOperation#getEParameters <em>EParameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EParameters</em>'.
	 * @see jointPackage_Ecore2Maude.SrcEOperation#getEParameters()
	 * @see #getSrcEOperation()
	 * @generated
	 */
	EReference getSrcEOperation_EParameters();

	/**
	 * Returns the meta object for the reference list '{@link jointPackage_Ecore2Maude.SrcEOperation#getEExceptions <em>EExceptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EExceptions</em>'.
	 * @see jointPackage_Ecore2Maude.SrcEOperation#getEExceptions()
	 * @see #getSrcEOperation()
	 * @generated
	 */
	EReference getSrcEOperation_EExceptions();

	/**
	 * Returns the meta object for class '{@link jointPackage_Ecore2Maude.SrcEPackage <em>Src EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src EPackage</em>'.
	 * @see jointPackage_Ecore2Maude.SrcEPackage
	 * @generated
	 */
	EClass getSrcEPackage();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_Ecore2Maude.SrcEPackage#getNsURI <em>Ns URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ns URI</em>'.
	 * @see jointPackage_Ecore2Maude.SrcEPackage#getNsURI()
	 * @see #getSrcEPackage()
	 * @generated
	 */
	EAttribute getSrcEPackage_NsURI();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_Ecore2Maude.SrcEPackage#getNsPrefix <em>Ns Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ns Prefix</em>'.
	 * @see jointPackage_Ecore2Maude.SrcEPackage#getNsPrefix()
	 * @see #getSrcEPackage()
	 * @generated
	 */
	EAttribute getSrcEPackage_NsPrefix();

	/**
	 * Returns the meta object for the containment reference list '{@link jointPackage_Ecore2Maude.SrcEPackage#getEClassifiers <em>EClassifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EClassifiers</em>'.
	 * @see jointPackage_Ecore2Maude.SrcEPackage#getEClassifiers()
	 * @see #getSrcEPackage()
	 * @generated
	 */
	EReference getSrcEPackage_EClassifiers();

	/**
	 * Returns the meta object for the containment reference list '{@link jointPackage_Ecore2Maude.SrcEPackage#getESubpackages <em>ESubpackages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ESubpackages</em>'.
	 * @see jointPackage_Ecore2Maude.SrcEPackage#getESubpackages()
	 * @see #getSrcEPackage()
	 * @generated
	 */
	EReference getSrcEPackage_ESubpackages();

	/**
	 * Returns the meta object for the container reference '{@link jointPackage_Ecore2Maude.SrcEPackage#getESuperPackage <em>ESuper Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>ESuper Package</em>'.
	 * @see jointPackage_Ecore2Maude.SrcEPackage#getESuperPackage()
	 * @see #getSrcEPackage()
	 * @generated
	 */
	EReference getSrcEPackage_ESuperPackage();

	/**
	 * Returns the meta object for the '{@link jointPackage_Ecore2Maude.SrcEPackage#getEClassifier(java.lang.String) <em>Get EClassifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get EClassifier</em>' operation.
	 * @see jointPackage_Ecore2Maude.SrcEPackage#getEClassifier(java.lang.String)
	 * @generated
	 */
	EOperation getSrcEPackage__GetEClassifier__String();

	/**
	 * Returns the meta object for class '{@link jointPackage_Ecore2Maude.SrcEParameter <em>Src EParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src EParameter</em>'.
	 * @see jointPackage_Ecore2Maude.SrcEParameter
	 * @generated
	 */
	EClass getSrcEParameter();

	/**
	 * Returns the meta object for the container reference '{@link jointPackage_Ecore2Maude.SrcEParameter#getEOperation <em>EOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>EOperation</em>'.
	 * @see jointPackage_Ecore2Maude.SrcEParameter#getEOperation()
	 * @see #getSrcEParameter()
	 * @generated
	 */
	EReference getSrcEParameter_EOperation();

	/**
	 * Returns the meta object for class '{@link jointPackage_Ecore2Maude.SrcEReference <em>Src EReference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src EReference</em>'.
	 * @see jointPackage_Ecore2Maude.SrcEReference
	 * @generated
	 */
	EClass getSrcEReference();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_Ecore2Maude.SrcEReference#isContainment <em>Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Containment</em>'.
	 * @see jointPackage_Ecore2Maude.SrcEReference#isContainment()
	 * @see #getSrcEReference()
	 * @generated
	 */
	EAttribute getSrcEReference_Containment();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_Ecore2Maude.SrcEReference#isContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Container</em>'.
	 * @see jointPackage_Ecore2Maude.SrcEReference#isContainer()
	 * @see #getSrcEReference()
	 * @generated
	 */
	EAttribute getSrcEReference_Container();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_Ecore2Maude.SrcEReference#isResolveProxies <em>Resolve Proxies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolve Proxies</em>'.
	 * @see jointPackage_Ecore2Maude.SrcEReference#isResolveProxies()
	 * @see #getSrcEReference()
	 * @generated
	 */
	EAttribute getSrcEReference_ResolveProxies();

	/**
	 * Returns the meta object for the reference '{@link jointPackage_Ecore2Maude.SrcEReference#getEOpposite <em>EOpposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EOpposite</em>'.
	 * @see jointPackage_Ecore2Maude.SrcEReference#getEOpposite()
	 * @see #getSrcEReference()
	 * @generated
	 */
	EReference getSrcEReference_EOpposite();

	/**
	 * Returns the meta object for the reference '{@link jointPackage_Ecore2Maude.SrcEReference#getEReferenceType <em>EReference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference Type</em>'.
	 * @see jointPackage_Ecore2Maude.SrcEReference#getEReferenceType()
	 * @see #getSrcEReference()
	 * @generated
	 */
	EReference getSrcEReference_EReferenceType();

	/**
	 * Returns the meta object for the reference list '{@link jointPackage_Ecore2Maude.SrcEReference#getEKeys <em>EKeys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EKeys</em>'.
	 * @see jointPackage_Ecore2Maude.SrcEReference#getEKeys()
	 * @see #getSrcEReference()
	 * @generated
	 */
	EReference getSrcEReference_EKeys();

	/**
	 * Returns the meta object for class '{@link jointPackage_Ecore2Maude.SrcEStructuralFeature <em>Src EStructural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src EStructural Feature</em>'.
	 * @see jointPackage_Ecore2Maude.SrcEStructuralFeature
	 * @generated
	 */
	EClass getSrcEStructuralFeature();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_Ecore2Maude.SrcEStructuralFeature#isChangeable <em>Changeable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Changeable</em>'.
	 * @see jointPackage_Ecore2Maude.SrcEStructuralFeature#isChangeable()
	 * @see #getSrcEStructuralFeature()
	 * @generated
	 */
	EAttribute getSrcEStructuralFeature_Changeable();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_Ecore2Maude.SrcEStructuralFeature#isVolatile <em>Volatile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volatile</em>'.
	 * @see jointPackage_Ecore2Maude.SrcEStructuralFeature#isVolatile()
	 * @see #getSrcEStructuralFeature()
	 * @generated
	 */
	EAttribute getSrcEStructuralFeature_Volatile();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_Ecore2Maude.SrcEStructuralFeature#isTransient <em>Transient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transient</em>'.
	 * @see jointPackage_Ecore2Maude.SrcEStructuralFeature#isTransient()
	 * @see #getSrcEStructuralFeature()
	 * @generated
	 */
	EAttribute getSrcEStructuralFeature_Transient();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_Ecore2Maude.SrcEStructuralFeature#getDefaultValueLiteral <em>Default Value Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value Literal</em>'.
	 * @see jointPackage_Ecore2Maude.SrcEStructuralFeature#getDefaultValueLiteral()
	 * @see #getSrcEStructuralFeature()
	 * @generated
	 */
	EAttribute getSrcEStructuralFeature_DefaultValueLiteral();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_Ecore2Maude.SrcEStructuralFeature#isUnsettable <em>Unsettable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unsettable</em>'.
	 * @see jointPackage_Ecore2Maude.SrcEStructuralFeature#isUnsettable()
	 * @see #getSrcEStructuralFeature()
	 * @generated
	 */
	EAttribute getSrcEStructuralFeature_Unsettable();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_Ecore2Maude.SrcEStructuralFeature#isDerived <em>Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Derived</em>'.
	 * @see jointPackage_Ecore2Maude.SrcEStructuralFeature#isDerived()
	 * @see #getSrcEStructuralFeature()
	 * @generated
	 */
	EAttribute getSrcEStructuralFeature_Derived();

	/**
	 * Returns the meta object for the container reference '{@link jointPackage_Ecore2Maude.SrcEStructuralFeature#getEContainingClass <em>EContaining Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>EContaining Class</em>'.
	 * @see jointPackage_Ecore2Maude.SrcEStructuralFeature#getEContainingClass()
	 * @see #getSrcEStructuralFeature()
	 * @generated
	 */
	EReference getSrcEStructuralFeature_EContainingClass();

	/**
	 * Returns the meta object for the '{@link jointPackage_Ecore2Maude.SrcEStructuralFeature#getFeatureID() <em>Get Feature ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Feature ID</em>' operation.
	 * @see jointPackage_Ecore2Maude.SrcEStructuralFeature#getFeatureID()
	 * @generated
	 */
	EOperation getSrcEStructuralFeature__GetFeatureID();

	/**
	 * Returns the meta object for class '{@link jointPackage_Ecore2Maude.SrcETypedElement <em>Src ETyped Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src ETyped Element</em>'.
	 * @see jointPackage_Ecore2Maude.SrcETypedElement
	 * @generated
	 */
	EClass getSrcETypedElement();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_Ecore2Maude.SrcETypedElement#isOrdered <em>Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ordered</em>'.
	 * @see jointPackage_Ecore2Maude.SrcETypedElement#isOrdered()
	 * @see #getSrcETypedElement()
	 * @generated
	 */
	EAttribute getSrcETypedElement_Ordered();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_Ecore2Maude.SrcETypedElement#isUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique</em>'.
	 * @see jointPackage_Ecore2Maude.SrcETypedElement#isUnique()
	 * @see #getSrcETypedElement()
	 * @generated
	 */
	EAttribute getSrcETypedElement_Unique();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_Ecore2Maude.SrcETypedElement#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see jointPackage_Ecore2Maude.SrcETypedElement#getLowerBound()
	 * @see #getSrcETypedElement()
	 * @generated
	 */
	EAttribute getSrcETypedElement_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_Ecore2Maude.SrcETypedElement#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see jointPackage_Ecore2Maude.SrcETypedElement#getUpperBound()
	 * @see #getSrcETypedElement()
	 * @generated
	 */
	EAttribute getSrcETypedElement_UpperBound();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_Ecore2Maude.SrcETypedElement#isMany <em>Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Many</em>'.
	 * @see jointPackage_Ecore2Maude.SrcETypedElement#isMany()
	 * @see #getSrcETypedElement()
	 * @generated
	 */
	EAttribute getSrcETypedElement_Many();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_Ecore2Maude.SrcETypedElement#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see jointPackage_Ecore2Maude.SrcETypedElement#isRequired()
	 * @see #getSrcETypedElement()
	 * @generated
	 */
	EAttribute getSrcETypedElement_Required();

	/**
	 * Returns the meta object for the reference '{@link jointPackage_Ecore2Maude.SrcETypedElement#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see jointPackage_Ecore2Maude.SrcETypedElement#getEType()
	 * @see #getSrcETypedElement()
	 * @generated
	 */
	EReference getSrcETypedElement_EType();

	/**
	 * Returns the meta object for class '{@link jointPackage_Ecore2Maude.TrgMaudeSpec <em>Trg Maude Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Maude Spec</em>'.
	 * @see jointPackage_Ecore2Maude.TrgMaudeSpec
	 * @generated
	 */
	EClass getTrgMaudeSpec();

	/**
	 * Returns the meta object for the containment reference list '{@link jointPackage_Ecore2Maude.TrgMaudeSpec#getEls <em>Els</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Els</em>'.
	 * @see jointPackage_Ecore2Maude.TrgMaudeSpec#getEls()
	 * @see #getTrgMaudeSpec()
	 * @generated
	 */
	EReference getTrgMaudeSpec_Els();

	/**
	 * Returns the meta object for the reference list '{@link jointPackage_Ecore2Maude.TrgMaudeSpec#getPrintableEls <em>Printable Els</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Printable Els</em>'.
	 * @see jointPackage_Ecore2Maude.TrgMaudeSpec#getPrintableEls()
	 * @see #getTrgMaudeSpec()
	 * @generated
	 */
	EReference getTrgMaudeSpec_PrintableEls();

	/**
	 * Returns the meta object for class '{@link jointPackage_Ecore2Maude.TrgMembership <em>Trg Membership</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Membership</em>'.
	 * @see jointPackage_Ecore2Maude.TrgMembership
	 * @generated
	 */
	EClass getTrgMembership();

	/**
	 * Returns the meta object for the containment reference '{@link jointPackage_Ecore2Maude.TrgMembership#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Term</em>'.
	 * @see jointPackage_Ecore2Maude.TrgMembership#getTerm()
	 * @see #getTrgMembership()
	 * @generated
	 */
	EReference getTrgMembership_Term();

	/**
	 * Returns the meta object for the reference '{@link jointPackage_Ecore2Maude.TrgMembership#getSort <em>Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sort</em>'.
	 * @see jointPackage_Ecore2Maude.TrgMembership#getSort()
	 * @see #getTrgMembership()
	 * @generated
	 */
	EReference getTrgMembership_Sort();

	/**
	 * Returns the meta object for class '{@link jointPackage_Ecore2Maude.TrgEquation <em>Trg Equation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Equation</em>'.
	 * @see jointPackage_Ecore2Maude.TrgEquation
	 * @generated
	 */
	EClass getTrgEquation();

	/**
	 * Returns the meta object for the containment reference '{@link jointPackage_Ecore2Maude.TrgEquation#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see jointPackage_Ecore2Maude.TrgEquation#getLhs()
	 * @see #getTrgEquation()
	 * @generated
	 */
	EReference getTrgEquation_Lhs();

	/**
	 * Returns the meta object for the containment reference '{@link jointPackage_Ecore2Maude.TrgEquation#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see jointPackage_Ecore2Maude.TrgEquation#getRhs()
	 * @see #getTrgEquation()
	 * @generated
	 */
	EReference getTrgEquation_Rhs();

	/**
	 * Returns the meta object for class '{@link jointPackage_Ecore2Maude.TrgRule <em>Trg Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Rule</em>'.
	 * @see jointPackage_Ecore2Maude.TrgRule
	 * @generated
	 */
	EClass getTrgRule();

	/**
	 * Returns the meta object for the containment reference '{@link jointPackage_Ecore2Maude.TrgRule#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see jointPackage_Ecore2Maude.TrgRule#getLhs()
	 * @see #getTrgRule()
	 * @generated
	 */
	EReference getTrgRule_Lhs();

	/**
	 * Returns the meta object for the containment reference '{@link jointPackage_Ecore2Maude.TrgRule#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see jointPackage_Ecore2Maude.TrgRule#getRhs()
	 * @see #getTrgRule()
	 * @generated
	 */
	EReference getTrgRule_Rhs();

	/**
	 * Returns the meta object for class '{@link jointPackage_Ecore2Maude.TrgMembershipCond <em>Trg Membership Cond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Membership Cond</em>'.
	 * @see jointPackage_Ecore2Maude.TrgMembershipCond
	 * @generated
	 */
	EClass getTrgMembershipCond();

	/**
	 * Returns the meta object for the reference '{@link jointPackage_Ecore2Maude.TrgMembershipCond#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rhs</em>'.
	 * @see jointPackage_Ecore2Maude.TrgMembershipCond#getRhs()
	 * @see #getTrgMembershipCond()
	 * @generated
	 */
	EReference getTrgMembershipCond_Rhs();

	/**
	 * Returns the meta object for class '{@link jointPackage_Ecore2Maude.TrgBooleanCond <em>Trg Boolean Cond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Boolean Cond</em>'.
	 * @see jointPackage_Ecore2Maude.TrgBooleanCond
	 * @generated
	 */
	EClass getTrgBooleanCond();

	/**
	 * Returns the meta object for class '{@link jointPackage_Ecore2Maude.TrgMatchingCond <em>Trg Matching Cond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Matching Cond</em>'.
	 * @see jointPackage_Ecore2Maude.TrgMatchingCond
	 * @generated
	 */
	EClass getTrgMatchingCond();

	/**
	 * Returns the meta object for the containment reference '{@link jointPackage_Ecore2Maude.TrgMatchingCond#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see jointPackage_Ecore2Maude.TrgMatchingCond#getRhs()
	 * @see #getTrgMatchingCond()
	 * @generated
	 */
	EReference getTrgMatchingCond_Rhs();

	/**
	 * Returns the meta object for class '{@link jointPackage_Ecore2Maude.TrgEqualCond <em>Trg Equal Cond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Equal Cond</em>'.
	 * @see jointPackage_Ecore2Maude.TrgEqualCond
	 * @generated
	 */
	EClass getTrgEqualCond();

	/**
	 * Returns the meta object for the containment reference '{@link jointPackage_Ecore2Maude.TrgEqualCond#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see jointPackage_Ecore2Maude.TrgEqualCond#getRhs()
	 * @see #getTrgEqualCond()
	 * @generated
	 */
	EReference getTrgEqualCond_Rhs();

	/**
	 * Returns the meta object for class '{@link jointPackage_Ecore2Maude.TrgMaudeTopEl <em>Trg Maude Top El</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Maude Top El</em>'.
	 * @see jointPackage_Ecore2Maude.TrgMaudeTopEl
	 * @generated
	 */
	EClass getTrgMaudeTopEl();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_Ecore2Maude.TrgMaudeTopEl#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jointPackage_Ecore2Maude.TrgMaudeTopEl#getName()
	 * @see #getTrgMaudeTopEl()
	 * @generated
	 */
	EAttribute getTrgMaudeTopEl_Name();

	/**
	 * Returns the meta object for class '{@link jointPackage_Ecore2Maude.TrgModExpression <em>Trg Mod Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Mod Expression</em>'.
	 * @see jointPackage_Ecore2Maude.TrgModExpression
	 * @generated
	 */
	EClass getTrgModExpression();

	/**
	 * Returns the meta object for class '{@link jointPackage_Ecore2Maude.TrgInstModExp <em>Trg Inst Mod Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Inst Mod Exp</em>'.
	 * @see jointPackage_Ecore2Maude.TrgInstModExp
	 * @generated
	 */
	EClass getTrgInstModExp();

	/**
	 * Returns the meta object for the containment reference '{@link jointPackage_Ecore2Maude.TrgInstModExp#getModExp <em>Mod Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mod Exp</em>'.
	 * @see jointPackage_Ecore2Maude.TrgInstModExp#getModExp()
	 * @see #getTrgInstModExp()
	 * @generated
	 */
	EReference getTrgInstModExp_ModExp();

	/**
	 * Returns the meta object for the reference list '{@link jointPackage_Ecore2Maude.TrgInstModExp#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Views</em>'.
	 * @see jointPackage_Ecore2Maude.TrgInstModExp#getViews()
	 * @see #getTrgInstModExp()
	 * @generated
	 */
	EReference getTrgInstModExp_Views();

	/**
	 * Returns the meta object for class '{@link jointPackage_Ecore2Maude.TrgRenModExp <em>Trg Ren Mod Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Ren Mod Exp</em>'.
	 * @see jointPackage_Ecore2Maude.TrgRenModExp
	 * @generated
	 */
	EClass getTrgRenModExp();

	/**
	 * Returns the meta object for the containment reference '{@link jointPackage_Ecore2Maude.TrgRenModExp#getModExp <em>Mod Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mod Exp</em>'.
	 * @see jointPackage_Ecore2Maude.TrgRenModExp#getModExp()
	 * @see #getTrgRenModExp()
	 * @generated
	 */
	EReference getTrgRenModExp_ModExp();

	/**
	 * Returns the meta object for the containment reference list '{@link jointPackage_Ecore2Maude.TrgRenModExp#getRenamings <em>Renamings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Renamings</em>'.
	 * @see jointPackage_Ecore2Maude.TrgRenModExp#getRenamings()
	 * @see #getTrgRenModExp()
	 * @generated
	 */
	EReference getTrgRenModExp_Renamings();

	/**
	 * Returns the meta object for class '{@link jointPackage_Ecore2Maude.TrgCompModExp <em>Trg Comp Mod Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Comp Mod Exp</em>'.
	 * @see jointPackage_Ecore2Maude.TrgCompModExp
	 * @generated
	 */
	EClass getTrgCompModExp();

	/**
	 * Returns the meta object for the containment reference list '{@link jointPackage_Ecore2Maude.TrgCompModExp#getModExps <em>Mod Exps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mod Exps</em>'.
	 * @see jointPackage_Ecore2Maude.TrgCompModExp#getModExps()
	 * @see #getTrgCompModExp()
	 * @generated
	 */
	EReference getTrgCompModExp_ModExps();

	/**
	 * Returns the meta object for class '{@link jointPackage_Ecore2Maude.TrgModuleIdModExp <em>Trg Module Id Mod Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Module Id Mod Exp</em>'.
	 * @see jointPackage_Ecore2Maude.TrgModuleIdModExp
	 * @generated
	 */
	EClass getTrgModuleIdModExp();

	/**
	 * Returns the meta object for the reference '{@link jointPackage_Ecore2Maude.TrgModuleIdModExp#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Module</em>'.
	 * @see jointPackage_Ecore2Maude.TrgModuleIdModExp#getModule()
	 * @see #getTrgModuleIdModExp()
	 * @generated
	 */
	EReference getTrgModuleIdModExp_Module();

	/**
	 * Returns the meta object for class '{@link jointPackage_Ecore2Maude.TrgTheoryIdModExp <em>Trg Theory Id Mod Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Theory Id Mod Exp</em>'.
	 * @see jointPackage_Ecore2Maude.TrgTheoryIdModExp
	 * @generated
	 */
	EClass getTrgTheoryIdModExp();

	/**
	 * Returns the meta object for the reference '{@link jointPackage_Ecore2Maude.TrgTheoryIdModExp#getTheory <em>Theory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Theory</em>'.
	 * @see jointPackage_Ecore2Maude.TrgTheoryIdModExp#getTheory()
	 * @see #getTrgTheoryIdModExp()
	 * @generated
	 */
	EReference getTrgTheoryIdModExp_Theory();

	/**
	 * Returns the meta object for class '{@link jointPackage_Ecore2Maude.TrgParameter <em>Trg Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Parameter</em>'.
	 * @see jointPackage_Ecore2Maude.TrgParameter
	 * @generated
	 */
	EClass getTrgParameter();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_Ecore2Maude.TrgParameter#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see jointPackage_Ecore2Maude.TrgParameter#getLabel()
	 * @see #getTrgParameter()
	 * @generated
	 */
	EAttribute getTrgParameter_Label();

	/**
	 * Returns the meta object for the containment reference '{@link jointPackage_Ecore2Maude.TrgParameter#getModExp <em>Mod Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mod Exp</em>'.
	 * @see jointPackage_Ecore2Maude.TrgParameter#getModExp()
	 * @see #getTrgParameter()
	 * @generated
	 */
	EReference getTrgParameter_ModExp();

	/**
	 * Returns the meta object for class '{@link jointPackage_Ecore2Maude.TrgTheory <em>Trg Theory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Theory</em>'.
	 * @see jointPackage_Ecore2Maude.TrgTheory
	 * @generated
	 */
	EClass getTrgTheory();

	/**
	 * Returns the meta object for the containment reference list '{@link jointPackage_Ecore2Maude.TrgTheory#getEls <em>Els</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Els</em>'.
	 * @see jointPackage_Ecore2Maude.TrgTheory#getEls()
	 * @see #getTrgTheory()
	 * @generated
	 */
	EReference getTrgTheory_Els();

	/**
	 * Returns the meta object for class '{@link jointPackage_Ecore2Maude.TrgFTheory <em>Trg FTheory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg FTheory</em>'.
	 * @see jointPackage_Ecore2Maude.TrgFTheory
	 * @generated
	 */
	EClass getTrgFTheory();

	/**
	 * Returns the meta object for class '{@link jointPackage_Ecore2Maude.TrgSTheory <em>Trg STheory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg STheory</em>'.
	 * @see jointPackage_Ecore2Maude.TrgSTheory
	 * @generated
	 */
	EClass getTrgSTheory();

	/**
	 * Returns the meta object for class '{@link jointPackage_Ecore2Maude.TrgModule <em>Trg Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Module</em>'.
	 * @see jointPackage_Ecore2Maude.TrgModule
	 * @generated
	 */
	EClass getTrgModule();

	/**
	 * Returns the meta object for the containment reference list '{@link jointPackage_Ecore2Maude.TrgModule#getEls <em>Els</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Els</em>'.
	 * @see jointPackage_Ecore2Maude.TrgModule#getEls()
	 * @see #getTrgModule()
	 * @generated
	 */
	EReference getTrgModule_Els();

	/**
	 * Returns the meta object for the containment reference list '{@link jointPackage_Ecore2Maude.TrgModule#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Params</em>'.
	 * @see jointPackage_Ecore2Maude.TrgModule#getParams()
	 * @see #getTrgModule()
	 * @generated
	 */
	EReference getTrgModule_Params();

	/**
	 * Returns the meta object for class '{@link jointPackage_Ecore2Maude.TrgFModule <em>Trg FModule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg FModule</em>'.
	 * @see jointPackage_Ecore2Maude.TrgFModule
	 * @generated
	 */
	EClass getTrgFModule();

	/**
	 * Returns the meta object for class '{@link jointPackage_Ecore2Maude.TrgSModule <em>Trg SModule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg SModule</em>'.
	 * @see jointPackage_Ecore2Maude.TrgSModule
	 * @generated
	 */
	EClass getTrgSModule();

	/**
	 * Returns the meta object for class '{@link jointPackage_Ecore2Maude.TrgModElement <em>Trg Mod Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Mod Element</em>'.
	 * @see jointPackage_Ecore2Maude.TrgModElement
	 * @generated
	 */
	EClass getTrgModElement();

	/**
	 * Returns the meta object for the container reference '{@link jointPackage_Ecore2Maude.TrgModElement#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Module</em>'.
	 * @see jointPackage_Ecore2Maude.TrgModElement#getModule()
	 * @see #getTrgModElement()
	 * @generated
	 */
	EReference getTrgModElement_Module();

	/**
	 * Returns the meta object for the container reference '{@link jointPackage_Ecore2Maude.TrgModElement#getTheory <em>Theory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Theory</em>'.
	 * @see jointPackage_Ecore2Maude.TrgModElement#getTheory()
	 * @see #getTrgModElement()
	 * @generated
	 */
	EReference getTrgModElement_Theory();

	/**
	 * Returns the meta object for class '{@link jointPackage_Ecore2Maude.TrgModImportation <em>Trg Mod Importation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Mod Importation</em>'.
	 * @see jointPackage_Ecore2Maude.TrgModImportation
	 * @generated
	 */
	EClass getTrgModImportation();

	/**
	 * Returns the meta object for the containment reference '{@link jointPackage_Ecore2Maude.TrgModImportation#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Imports</em>'.
	 * @see jointPackage_Ecore2Maude.TrgModImportation#getImports()
	 * @see #getTrgModImportation()
	 * @generated
	 */
	EReference getTrgModImportation_Imports();

	/**
	 * Returns the meta object for class '{@link jointPackage_Ecore2Maude.TrgType <em>Trg Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Type</em>'.
	 * @see jointPackage_Ecore2Maude.TrgType
	 * @generated
	 */
	EClass getTrgType();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_Ecore2Maude.TrgType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jointPackage_Ecore2Maude.TrgType#getName()
	 * @see #getTrgType()
	 * @generated
	 */
	EAttribute getTrgType_Name();

	/**
	 * Returns the meta object for class '{@link jointPackage_Ecore2Maude.TrgSort <em>Trg Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Sort</em>'.
	 * @see jointPackage_Ecore2Maude.TrgSort
	 * @generated
	 */
	EClass getTrgSort();

	/**
	 * Returns the meta object for the reference list '{@link jointPackage_Ecore2Maude.TrgSort#getSubsortRels <em>Subsort Rels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subsort Rels</em>'.
	 * @see jointPackage_Ecore2Maude.TrgSort#getSubsortRels()
	 * @see #getTrgSort()
	 * @generated
	 */
	EReference getTrgSort_SubsortRels();

	/**
	 * Returns the meta object for the reference list '{@link jointPackage_Ecore2Maude.TrgSort#getSupersortRels <em>Supersort Rels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Supersort Rels</em>'.
	 * @see jointPackage_Ecore2Maude.TrgSort#getSupersortRels()
	 * @see #getTrgSort()
	 * @generated
	 */
	EReference getTrgSort_SupersortRels();

	/**
	 * Returns the meta object for the reference '{@link jointPackage_Ecore2Maude.TrgSort#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Kind</em>'.
	 * @see jointPackage_Ecore2Maude.TrgSort#getKind()
	 * @see #getTrgSort()
	 * @generated
	 */
	EReference getTrgSort_Kind();

	/**
	 * Returns the meta object for class '{@link jointPackage_Ecore2Maude.TrgKind <em>Trg Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Kind</em>'.
	 * @see jointPackage_Ecore2Maude.TrgKind
	 * @generated
	 */
	EClass getTrgKind();

	/**
	 * Returns the meta object for the reference list '{@link jointPackage_Ecore2Maude.TrgKind#getSorts <em>Sorts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sorts</em>'.
	 * @see jointPackage_Ecore2Maude.TrgKind#getSorts()
	 * @see #getTrgKind()
	 * @generated
	 */
	EReference getTrgKind_Sorts();

	/**
	 * Returns the meta object for class '{@link jointPackage_Ecore2Maude.TrgSubsortRel <em>Trg Subsort Rel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Subsort Rel</em>'.
	 * @see jointPackage_Ecore2Maude.TrgSubsortRel
	 * @generated
	 */
	EClass getTrgSubsortRel();

	/**
	 * Returns the meta object for the reference list '{@link jointPackage_Ecore2Maude.TrgSubsortRel#getSubsorts <em>Subsorts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subsorts</em>'.
	 * @see jointPackage_Ecore2Maude.TrgSubsortRel#getSubsorts()
	 * @see #getTrgSubsortRel()
	 * @generated
	 */
	EReference getTrgSubsortRel_Subsorts();

	/**
	 * Returns the meta object for the reference list '{@link jointPackage_Ecore2Maude.TrgSubsortRel#getSupersorts <em>Supersorts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Supersorts</em>'.
	 * @see jointPackage_Ecore2Maude.TrgSubsortRel#getSupersorts()
	 * @see #getTrgSubsortRel()
	 * @generated
	 */
	EReference getTrgSubsortRel_Supersorts();

	/**
	 * Returns the meta object for class '{@link jointPackage_Ecore2Maude.TrgOperation <em>Trg Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Operation</em>'.
	 * @see jointPackage_Ecore2Maude.TrgOperation
	 * @generated
	 */
	EClass getTrgOperation();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_Ecore2Maude.TrgOperation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jointPackage_Ecore2Maude.TrgOperation#getName()
	 * @see #getTrgOperation()
	 * @generated
	 */
	EAttribute getTrgOperation_Name();

	/**
	 * Returns the meta object for the reference '{@link jointPackage_Ecore2Maude.TrgOperation#getCoarity <em>Coarity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Coarity</em>'.
	 * @see jointPackage_Ecore2Maude.TrgOperation#getCoarity()
	 * @see #getTrgOperation()
	 * @generated
	 */
	EReference getTrgOperation_Coarity();

	/**
	 * Returns the meta object for the reference list '{@link jointPackage_Ecore2Maude.TrgOperation#getArity <em>Arity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arity</em>'.
	 * @see jointPackage_Ecore2Maude.TrgOperation#getArity()
	 * @see #getTrgOperation()
	 * @generated
	 */
	EReference getTrgOperation_Arity();

	/**
	 * Returns the meta object for the attribute list '{@link jointPackage_Ecore2Maude.TrgOperation#getAtts <em>Atts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Atts</em>'.
	 * @see jointPackage_Ecore2Maude.TrgOperation#getAtts()
	 * @see #getTrgOperation()
	 * @generated
	 */
	EAttribute getTrgOperation_Atts();

	/**
	 * Returns the meta object for class '{@link jointPackage_Ecore2Maude.TrgStatement <em>Trg Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Statement</em>'.
	 * @see jointPackage_Ecore2Maude.TrgStatement
	 * @generated
	 */
	EClass getTrgStatement();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_Ecore2Maude.TrgStatement#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see jointPackage_Ecore2Maude.TrgStatement#getLabel()
	 * @see #getTrgStatement()
	 * @generated
	 */
	EAttribute getTrgStatement_Label();

	/**
	 * Returns the meta object for the attribute list '{@link jointPackage_Ecore2Maude.TrgStatement#getAtts <em>Atts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Atts</em>'.
	 * @see jointPackage_Ecore2Maude.TrgStatement#getAtts()
	 * @see #getTrgStatement()
	 * @generated
	 */
	EAttribute getTrgStatement_Atts();

	/**
	 * Returns the meta object for the containment reference list '{@link jointPackage_Ecore2Maude.TrgStatement#getConds <em>Conds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conds</em>'.
	 * @see jointPackage_Ecore2Maude.TrgStatement#getConds()
	 * @see #getTrgStatement()
	 * @generated
	 */
	EReference getTrgStatement_Conds();

	/**
	 * Returns the meta object for class '{@link jointPackage_Ecore2Maude.TrgCondition <em>Trg Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Condition</em>'.
	 * @see jointPackage_Ecore2Maude.TrgCondition
	 * @generated
	 */
	EClass getTrgCondition();

	/**
	 * Returns the meta object for the containment reference '{@link jointPackage_Ecore2Maude.TrgCondition#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see jointPackage_Ecore2Maude.TrgCondition#getLhs()
	 * @see #getTrgCondition()
	 * @generated
	 */
	EReference getTrgCondition_Lhs();

	/**
	 * Returns the meta object for class '{@link jointPackage_Ecore2Maude.TrgEquationalCond <em>Trg Equational Cond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Equational Cond</em>'.
	 * @see jointPackage_Ecore2Maude.TrgEquationalCond
	 * @generated
	 */
	EClass getTrgEquationalCond();

	/**
	 * Returns the meta object for class '{@link jointPackage_Ecore2Maude.TrgRewriteCond <em>Trg Rewrite Cond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Rewrite Cond</em>'.
	 * @see jointPackage_Ecore2Maude.TrgRewriteCond
	 * @generated
	 */
	EClass getTrgRewriteCond();

	/**
	 * Returns the meta object for the containment reference '{@link jointPackage_Ecore2Maude.TrgRewriteCond#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see jointPackage_Ecore2Maude.TrgRewriteCond#getRhs()
	 * @see #getTrgRewriteCond()
	 * @generated
	 */
	EReference getTrgRewriteCond_Rhs();

	/**
	 * Returns the meta object for class '{@link jointPackage_Ecore2Maude.TrgTerm <em>Trg Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Term</em>'.
	 * @see jointPackage_Ecore2Maude.TrgTerm
	 * @generated
	 */
	EClass getTrgTerm();

	/**
	 * Returns the meta object for the reference '{@link jointPackage_Ecore2Maude.TrgTerm#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see jointPackage_Ecore2Maude.TrgTerm#getType()
	 * @see #getTrgTerm()
	 * @generated
	 */
	EReference getTrgTerm_Type();

	/**
	 * Returns the meta object for class '{@link jointPackage_Ecore2Maude.TrgConstant <em>Trg Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Constant</em>'.
	 * @see jointPackage_Ecore2Maude.TrgConstant
	 * @generated
	 */
	EClass getTrgConstant();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_Ecore2Maude.TrgConstant#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op</em>'.
	 * @see jointPackage_Ecore2Maude.TrgConstant#getOp()
	 * @see #getTrgConstant()
	 * @generated
	 */
	EAttribute getTrgConstant_Op();

	/**
	 * Returns the meta object for class '{@link jointPackage_Ecore2Maude.TrgRecTerm <em>Trg Rec Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Rec Term</em>'.
	 * @see jointPackage_Ecore2Maude.TrgRecTerm
	 * @generated
	 */
	EClass getTrgRecTerm();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_Ecore2Maude.TrgRecTerm#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op</em>'.
	 * @see jointPackage_Ecore2Maude.TrgRecTerm#getOp()
	 * @see #getTrgRecTerm()
	 * @generated
	 */
	EAttribute getTrgRecTerm_Op();

	/**
	 * Returns the meta object for the containment reference list '{@link jointPackage_Ecore2Maude.TrgRecTerm#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Args</em>'.
	 * @see jointPackage_Ecore2Maude.TrgRecTerm#getArgs()
	 * @see #getTrgRecTerm()
	 * @generated
	 */
	EReference getTrgRecTerm_Args();

	/**
	 * Returns the meta object for class '{@link jointPackage_Ecore2Maude.TrgVariable <em>Trg Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Variable</em>'.
	 * @see jointPackage_Ecore2Maude.TrgVariable
	 * @generated
	 */
	EClass getTrgVariable();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_Ecore2Maude.TrgVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jointPackage_Ecore2Maude.TrgVariable#getName()
	 * @see #getTrgVariable()
	 * @generated
	 */
	EAttribute getTrgVariable_Name();

	/**
	 * Returns the meta object for class '{@link jointPackage_Ecore2Maude.TrgView <em>Trg View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg View</em>'.
	 * @see jointPackage_Ecore2Maude.TrgView
	 * @generated
	 */
	EClass getTrgView();

	/**
	 * Returns the meta object for the containment reference '{@link jointPackage_Ecore2Maude.TrgView#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From</em>'.
	 * @see jointPackage_Ecore2Maude.TrgView#getFrom()
	 * @see #getTrgView()
	 * @generated
	 */
	EReference getTrgView_From();

	/**
	 * Returns the meta object for the containment reference '{@link jointPackage_Ecore2Maude.TrgView#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>To</em>'.
	 * @see jointPackage_Ecore2Maude.TrgView#getTo()
	 * @see #getTrgView()
	 * @generated
	 */
	EReference getTrgView_To();

	/**
	 * Returns the meta object for the containment reference list '{@link jointPackage_Ecore2Maude.TrgView#getEls <em>Els</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Els</em>'.
	 * @see jointPackage_Ecore2Maude.TrgView#getEls()
	 * @see #getTrgView()
	 * @generated
	 */
	EReference getTrgView_Els();

	/**
	 * Returns the meta object for class '{@link jointPackage_Ecore2Maude.TrgViewMapping <em>Trg View Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg View Mapping</em>'.
	 * @see jointPackage_Ecore2Maude.TrgViewMapping
	 * @generated
	 */
	EClass getTrgViewMapping();

	/**
	 * Returns the meta object for class '{@link jointPackage_Ecore2Maude.TrgRenMapping <em>Trg Ren Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Ren Mapping</em>'.
	 * @see jointPackage_Ecore2Maude.TrgRenMapping
	 * @generated
	 */
	EClass getTrgRenMapping();

	/**
	 * Returns the meta object for class '{@link jointPackage_Ecore2Maude.TrgTermMapping <em>Trg Term Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Term Mapping</em>'.
	 * @see jointPackage_Ecore2Maude.TrgTermMapping
	 * @generated
	 */
	EClass getTrgTermMapping();

	/**
	 * Returns the meta object for the containment reference '{@link jointPackage_Ecore2Maude.TrgTermMapping#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From</em>'.
	 * @see jointPackage_Ecore2Maude.TrgTermMapping#getFrom()
	 * @see #getTrgTermMapping()
	 * @generated
	 */
	EReference getTrgTermMapping_From();

	/**
	 * Returns the meta object for the containment reference '{@link jointPackage_Ecore2Maude.TrgTermMapping#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>To</em>'.
	 * @see jointPackage_Ecore2Maude.TrgTermMapping#getTo()
	 * @see #getTrgTermMapping()
	 * @generated
	 */
	EReference getTrgTermMapping_To();

	/**
	 * Returns the meta object for class '{@link jointPackage_Ecore2Maude.TrgSortMapping <em>Trg Sort Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Sort Mapping</em>'.
	 * @see jointPackage_Ecore2Maude.TrgSortMapping
	 * @generated
	 */
	EClass getTrgSortMapping();

	/**
	 * Returns the meta object for the reference '{@link jointPackage_Ecore2Maude.TrgSortMapping#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see jointPackage_Ecore2Maude.TrgSortMapping#getFrom()
	 * @see #getTrgSortMapping()
	 * @generated
	 */
	EReference getTrgSortMapping_From();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_Ecore2Maude.TrgSortMapping#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see jointPackage_Ecore2Maude.TrgSortMapping#getTo()
	 * @see #getTrgSortMapping()
	 * @generated
	 */
	EAttribute getTrgSortMapping_To();

	/**
	 * Returns the meta object for class '{@link jointPackage_Ecore2Maude.TrgOpTypedMapping <em>Trg Op Typed Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Op Typed Mapping</em>'.
	 * @see jointPackage_Ecore2Maude.TrgOpTypedMapping
	 * @generated
	 */
	EClass getTrgOpTypedMapping();

	/**
	 * Returns the meta object for the reference '{@link jointPackage_Ecore2Maude.TrgOpTypedMapping#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see jointPackage_Ecore2Maude.TrgOpTypedMapping#getFrom()
	 * @see #getTrgOpTypedMapping()
	 * @generated
	 */
	EReference getTrgOpTypedMapping_From();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_Ecore2Maude.TrgOpTypedMapping#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see jointPackage_Ecore2Maude.TrgOpTypedMapping#getTo()
	 * @see #getTrgOpTypedMapping()
	 * @generated
	 */
	EAttribute getTrgOpTypedMapping_To();

	/**
	 * Returns the meta object for the attribute list '{@link jointPackage_Ecore2Maude.TrgOpTypedMapping#getAtts <em>Atts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Atts</em>'.
	 * @see jointPackage_Ecore2Maude.TrgOpTypedMapping#getAtts()
	 * @see #getTrgOpTypedMapping()
	 * @generated
	 */
	EAttribute getTrgOpTypedMapping_Atts();

	/**
	 * Returns the meta object for class '{@link jointPackage_Ecore2Maude.TrgOpMapping <em>Trg Op Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Op Mapping</em>'.
	 * @see jointPackage_Ecore2Maude.TrgOpMapping
	 * @generated
	 */
	EClass getTrgOpMapping();

	/**
	 * Returns the meta object for the reference '{@link jointPackage_Ecore2Maude.TrgOpMapping#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see jointPackage_Ecore2Maude.TrgOpMapping#getFrom()
	 * @see #getTrgOpMapping()
	 * @generated
	 */
	EReference getTrgOpMapping_From();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_Ecore2Maude.TrgOpMapping#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see jointPackage_Ecore2Maude.TrgOpMapping#getTo()
	 * @see #getTrgOpMapping()
	 * @generated
	 */
	EAttribute getTrgOpMapping_To();

	/**
	 * Returns the meta object for class '{@link jointPackage_Ecore2Maude.TrgLabelMapping <em>Trg Label Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Label Mapping</em>'.
	 * @see jointPackage_Ecore2Maude.TrgLabelMapping
	 * @generated
	 */
	EClass getTrgLabelMapping();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_Ecore2Maude.TrgLabelMapping#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see jointPackage_Ecore2Maude.TrgLabelMapping#getFrom()
	 * @see #getTrgLabelMapping()
	 * @generated
	 */
	EAttribute getTrgLabelMapping_From();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_Ecore2Maude.TrgLabelMapping#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see jointPackage_Ecore2Maude.TrgLabelMapping#getTo()
	 * @see #getTrgLabelMapping()
	 * @generated
	 */
	EAttribute getTrgLabelMapping_To();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JointPackage_Ecore2MaudeFactory getJointPackage_Ecore2MaudeFactory();

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
		 * The meta object literal for the '{@link jointPackage_Ecore2Maude.impl.JointMMImpl <em>Joint MM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Ecore2Maude.impl.JointMMImpl
		 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getJointMM()
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
		 * The meta object literal for the '{@link jointPackage_Ecore2Maude.impl.SrcEStringToStringMapEntryImpl <em>Src EString To String Map Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Ecore2Maude.impl.SrcEStringToStringMapEntryImpl
		 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getSrcEStringToStringMapEntry()
		 * @generated
		 */
		EClass SRC_ESTRING_TO_STRING_MAP_ENTRY = eINSTANCE.getSrcEStringToStringMapEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_ESTRING_TO_STRING_MAP_ENTRY__KEY = eINSTANCE.getSrcEStringToStringMapEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_ESTRING_TO_STRING_MAP_ENTRY__VALUE = eINSTANCE.getSrcEStringToStringMapEntry_Value();

		/**
		 * The meta object literal for the '{@link jointPackage_Ecore2Maude.impl.SrcEAttributeImpl <em>Src EAttribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Ecore2Maude.impl.SrcEAttributeImpl
		 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getSrcEAttribute()
		 * @generated
		 */
		EClass SRC_EATTRIBUTE = eINSTANCE.getSrcEAttribute();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_EATTRIBUTE__ID = eINSTANCE.getSrcEAttribute_ID();

		/**
		 * The meta object literal for the '<em><b>EAttribute Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_EATTRIBUTE__EATTRIBUTE_TYPE = eINSTANCE.getSrcEAttribute_EAttributeType();

		/**
		 * The meta object literal for the '{@link jointPackage_Ecore2Maude.impl.SrcEClassImpl <em>Src EClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Ecore2Maude.impl.SrcEClassImpl
		 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getSrcEClass()
		 * @generated
		 */
		EClass SRC_ECLASS = eINSTANCE.getSrcEClass();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_ECLASS__ABSTRACT = eINSTANCE.getSrcEClass_Abstract();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_ECLASS__INTERFACE = eINSTANCE.getSrcEClass_Interface();

		/**
		 * The meta object literal for the '<em><b>ESuper Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_ECLASS__ESUPER_TYPES = eINSTANCE.getSrcEClass_ESuperTypes();

		/**
		 * The meta object literal for the '<em><b>EOperations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_ECLASS__EOPERATIONS = eINSTANCE.getSrcEClass_EOperations();

		/**
		 * The meta object literal for the '<em><b>EAll Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_ECLASS__EALL_ATTRIBUTES = eINSTANCE.getSrcEClass_EAllAttributes();

		/**
		 * The meta object literal for the '<em><b>EAll References</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_ECLASS__EALL_REFERENCES = eINSTANCE.getSrcEClass_EAllReferences();

		/**
		 * The meta object literal for the '<em><b>EReferences</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_ECLASS__EREFERENCES = eINSTANCE.getSrcEClass_EReferences();

		/**
		 * The meta object literal for the '<em><b>EAttributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_ECLASS__EATTRIBUTES = eINSTANCE.getSrcEClass_EAttributes();

		/**
		 * The meta object literal for the '<em><b>EAll Containments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_ECLASS__EALL_CONTAINMENTS = eINSTANCE.getSrcEClass_EAllContainments();

		/**
		 * The meta object literal for the '<em><b>EAll Operations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_ECLASS__EALL_OPERATIONS = eINSTANCE.getSrcEClass_EAllOperations();

		/**
		 * The meta object literal for the '<em><b>EAll Structural Features</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_ECLASS__EALL_STRUCTURAL_FEATURES = eINSTANCE.getSrcEClass_EAllStructuralFeatures();

		/**
		 * The meta object literal for the '<em><b>EAll Super Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_ECLASS__EALL_SUPER_TYPES = eINSTANCE.getSrcEClass_EAllSuperTypes();

		/**
		 * The meta object literal for the '<em><b>EID Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_ECLASS__EID_ATTRIBUTE = eINSTANCE.getSrcEClass_EIDAttribute();

		/**
		 * The meta object literal for the '<em><b>EStructural Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_ECLASS__ESTRUCTURAL_FEATURES = eINSTANCE.getSrcEClass_EStructuralFeatures();

		/**
		 * The meta object literal for the '<em><b>Is Super Type Of</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SRC_ECLASS___IS_SUPER_TYPE_OF__SRCECLASS = eINSTANCE.getSrcEClass__IsSuperTypeOf__SrcEClass();

		/**
		 * The meta object literal for the '<em><b>Get Feature Count</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SRC_ECLASS___GET_FEATURE_COUNT = eINSTANCE.getSrcEClass__GetFeatureCount();

		/**
		 * The meta object literal for the '<em><b>Get EStructural Feature</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SRC_ECLASS___GET_ESTRUCTURAL_FEATURE__INT = eINSTANCE.getSrcEClass__GetEStructuralFeature__int();

		/**
		 * The meta object literal for the '<em><b>Get Feature ID</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SRC_ECLASS___GET_FEATURE_ID__SRCESTRUCTURALFEATURE = eINSTANCE.getSrcEClass__GetFeatureID__SrcEStructuralFeature();

		/**
		 * The meta object literal for the '<em><b>Get EStructural Feature</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SRC_ECLASS___GET_ESTRUCTURAL_FEATURE__STRING = eINSTANCE.getSrcEClass__GetEStructuralFeature__String();

		/**
		 * The meta object literal for the '{@link jointPackage_Ecore2Maude.impl.SrcEClassifierImpl <em>Src EClassifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Ecore2Maude.impl.SrcEClassifierImpl
		 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getSrcEClassifier()
		 * @generated
		 */
		EClass SRC_ECLASSIFIER = eINSTANCE.getSrcEClassifier();

		/**
		 * The meta object literal for the '<em><b>Instance Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_ECLASSIFIER__INSTANCE_CLASS_NAME = eINSTANCE.getSrcEClassifier_InstanceClassName();

		/**
		 * The meta object literal for the '<em><b>Instance Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_ECLASSIFIER__INSTANCE_TYPE_NAME = eINSTANCE.getSrcEClassifier_InstanceTypeName();

		/**
		 * The meta object literal for the '<em><b>EPackage</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_ECLASSIFIER__EPACKAGE = eINSTANCE.getSrcEClassifier_EPackage();

		/**
		 * The meta object literal for the '<em><b>Get Classifier ID</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SRC_ECLASSIFIER___GET_CLASSIFIER_ID = eINSTANCE.getSrcEClassifier__GetClassifierID();

		/**
		 * The meta object literal for the '{@link jointPackage_Ecore2Maude.impl.SrcEDataTypeImpl <em>Src EData Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Ecore2Maude.impl.SrcEDataTypeImpl
		 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getSrcEDataType()
		 * @generated
		 */
		EClass SRC_EDATA_TYPE = eINSTANCE.getSrcEDataType();

		/**
		 * The meta object literal for the '<em><b>Serializable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_EDATA_TYPE__SERIALIZABLE = eINSTANCE.getSrcEDataType_Serializable();

		/**
		 * The meta object literal for the '{@link jointPackage_Ecore2Maude.impl.SrcEEnumImpl <em>Src EEnum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Ecore2Maude.impl.SrcEEnumImpl
		 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getSrcEEnum()
		 * @generated
		 */
		EClass SRC_EENUM = eINSTANCE.getSrcEEnum();

		/**
		 * The meta object literal for the '<em><b>ELiterals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_EENUM__ELITERALS = eINSTANCE.getSrcEEnum_ELiterals();

		/**
		 * The meta object literal for the '<em><b>Get EEnum Literal</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SRC_EENUM___GET_EENUM_LITERAL__STRING = eINSTANCE.getSrcEEnum__GetEEnumLiteral__String();

		/**
		 * The meta object literal for the '<em><b>Get EEnum Literal</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SRC_EENUM___GET_EENUM_LITERAL__INT = eINSTANCE.getSrcEEnum__GetEEnumLiteral__int();

		/**
		 * The meta object literal for the '<em><b>Get EEnum Literal By Literal</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SRC_EENUM___GET_EENUM_LITERAL_BY_LITERAL__STRING = eINSTANCE.getSrcEEnum__GetEEnumLiteralByLiteral__String();

		/**
		 * The meta object literal for the '{@link jointPackage_Ecore2Maude.impl.SrcEEnumLiteralImpl <em>Src EEnum Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Ecore2Maude.impl.SrcEEnumLiteralImpl
		 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getSrcEEnumLiteral()
		 * @generated
		 */
		EClass SRC_EENUM_LITERAL = eINSTANCE.getSrcEEnumLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_EENUM_LITERAL__VALUE = eINSTANCE.getSrcEEnumLiteral_Value();

		/**
		 * The meta object literal for the '<em><b>Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_EENUM_LITERAL__LITERAL = eINSTANCE.getSrcEEnumLiteral_Literal();

		/**
		 * The meta object literal for the '<em><b>EEnum</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_EENUM_LITERAL__EENUM = eINSTANCE.getSrcEEnumLiteral_EEnum();

		/**
		 * The meta object literal for the '{@link jointPackage_Ecore2Maude.impl.SrcENamedElementImpl <em>Src ENamed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Ecore2Maude.impl.SrcENamedElementImpl
		 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getSrcENamedElement()
		 * @generated
		 */
		EClass SRC_ENAMED_ELEMENT = eINSTANCE.getSrcENamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_ENAMED_ELEMENT__NAME = eINSTANCE.getSrcENamedElement_Name();

		/**
		 * The meta object literal for the '{@link jointPackage_Ecore2Maude.impl.SrcEOperationImpl <em>Src EOperation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Ecore2Maude.impl.SrcEOperationImpl
		 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getSrcEOperation()
		 * @generated
		 */
		EClass SRC_EOPERATION = eINSTANCE.getSrcEOperation();

		/**
		 * The meta object literal for the '<em><b>EContaining Class</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_EOPERATION__ECONTAINING_CLASS = eINSTANCE.getSrcEOperation_EContainingClass();

		/**
		 * The meta object literal for the '<em><b>EParameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_EOPERATION__EPARAMETERS = eINSTANCE.getSrcEOperation_EParameters();

		/**
		 * The meta object literal for the '<em><b>EExceptions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_EOPERATION__EEXCEPTIONS = eINSTANCE.getSrcEOperation_EExceptions();

		/**
		 * The meta object literal for the '{@link jointPackage_Ecore2Maude.impl.SrcEPackageImpl <em>Src EPackage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Ecore2Maude.impl.SrcEPackageImpl
		 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getSrcEPackage()
		 * @generated
		 */
		EClass SRC_EPACKAGE = eINSTANCE.getSrcEPackage();

		/**
		 * The meta object literal for the '<em><b>Ns URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_EPACKAGE__NS_URI = eINSTANCE.getSrcEPackage_NsURI();

		/**
		 * The meta object literal for the '<em><b>Ns Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_EPACKAGE__NS_PREFIX = eINSTANCE.getSrcEPackage_NsPrefix();

		/**
		 * The meta object literal for the '<em><b>EClassifiers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_EPACKAGE__ECLASSIFIERS = eINSTANCE.getSrcEPackage_EClassifiers();

		/**
		 * The meta object literal for the '<em><b>ESubpackages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_EPACKAGE__ESUBPACKAGES = eINSTANCE.getSrcEPackage_ESubpackages();

		/**
		 * The meta object literal for the '<em><b>ESuper Package</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_EPACKAGE__ESUPER_PACKAGE = eINSTANCE.getSrcEPackage_ESuperPackage();

		/**
		 * The meta object literal for the '<em><b>Get EClassifier</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SRC_EPACKAGE___GET_ECLASSIFIER__STRING = eINSTANCE.getSrcEPackage__GetEClassifier__String();

		/**
		 * The meta object literal for the '{@link jointPackage_Ecore2Maude.impl.SrcEParameterImpl <em>Src EParameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Ecore2Maude.impl.SrcEParameterImpl
		 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getSrcEParameter()
		 * @generated
		 */
		EClass SRC_EPARAMETER = eINSTANCE.getSrcEParameter();

		/**
		 * The meta object literal for the '<em><b>EOperation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_EPARAMETER__EOPERATION = eINSTANCE.getSrcEParameter_EOperation();

		/**
		 * The meta object literal for the '{@link jointPackage_Ecore2Maude.impl.SrcEReferenceImpl <em>Src EReference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Ecore2Maude.impl.SrcEReferenceImpl
		 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getSrcEReference()
		 * @generated
		 */
		EClass SRC_EREFERENCE = eINSTANCE.getSrcEReference();

		/**
		 * The meta object literal for the '<em><b>Containment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_EREFERENCE__CONTAINMENT = eINSTANCE.getSrcEReference_Containment();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_EREFERENCE__CONTAINER = eINSTANCE.getSrcEReference_Container();

		/**
		 * The meta object literal for the '<em><b>Resolve Proxies</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_EREFERENCE__RESOLVE_PROXIES = eINSTANCE.getSrcEReference_ResolveProxies();

		/**
		 * The meta object literal for the '<em><b>EOpposite</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_EREFERENCE__EOPPOSITE = eINSTANCE.getSrcEReference_EOpposite();

		/**
		 * The meta object literal for the '<em><b>EReference Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_EREFERENCE__EREFERENCE_TYPE = eINSTANCE.getSrcEReference_EReferenceType();

		/**
		 * The meta object literal for the '<em><b>EKeys</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_EREFERENCE__EKEYS = eINSTANCE.getSrcEReference_EKeys();

		/**
		 * The meta object literal for the '{@link jointPackage_Ecore2Maude.impl.SrcEStructuralFeatureImpl <em>Src EStructural Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Ecore2Maude.impl.SrcEStructuralFeatureImpl
		 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getSrcEStructuralFeature()
		 * @generated
		 */
		EClass SRC_ESTRUCTURAL_FEATURE = eINSTANCE.getSrcEStructuralFeature();

		/**
		 * The meta object literal for the '<em><b>Changeable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_ESTRUCTURAL_FEATURE__CHANGEABLE = eINSTANCE.getSrcEStructuralFeature_Changeable();

		/**
		 * The meta object literal for the '<em><b>Volatile</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_ESTRUCTURAL_FEATURE__VOLATILE = eINSTANCE.getSrcEStructuralFeature_Volatile();

		/**
		 * The meta object literal for the '<em><b>Transient</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_ESTRUCTURAL_FEATURE__TRANSIENT = eINSTANCE.getSrcEStructuralFeature_Transient();

		/**
		 * The meta object literal for the '<em><b>Default Value Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL = eINSTANCE.getSrcEStructuralFeature_DefaultValueLiteral();

		/**
		 * The meta object literal for the '<em><b>Unsettable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_ESTRUCTURAL_FEATURE__UNSETTABLE = eINSTANCE.getSrcEStructuralFeature_Unsettable();

		/**
		 * The meta object literal for the '<em><b>Derived</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_ESTRUCTURAL_FEATURE__DERIVED = eINSTANCE.getSrcEStructuralFeature_Derived();

		/**
		 * The meta object literal for the '<em><b>EContaining Class</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_ESTRUCTURAL_FEATURE__ECONTAINING_CLASS = eINSTANCE.getSrcEStructuralFeature_EContainingClass();

		/**
		 * The meta object literal for the '<em><b>Get Feature ID</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SRC_ESTRUCTURAL_FEATURE___GET_FEATURE_ID = eINSTANCE.getSrcEStructuralFeature__GetFeatureID();

		/**
		 * The meta object literal for the '{@link jointPackage_Ecore2Maude.impl.SrcETypedElementImpl <em>Src ETyped Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Ecore2Maude.impl.SrcETypedElementImpl
		 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getSrcETypedElement()
		 * @generated
		 */
		EClass SRC_ETYPED_ELEMENT = eINSTANCE.getSrcETypedElement();

		/**
		 * The meta object literal for the '<em><b>Ordered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_ETYPED_ELEMENT__ORDERED = eINSTANCE.getSrcETypedElement_Ordered();

		/**
		 * The meta object literal for the '<em><b>Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_ETYPED_ELEMENT__UNIQUE = eINSTANCE.getSrcETypedElement_Unique();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_ETYPED_ELEMENT__LOWER_BOUND = eINSTANCE.getSrcETypedElement_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_ETYPED_ELEMENT__UPPER_BOUND = eINSTANCE.getSrcETypedElement_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_ETYPED_ELEMENT__MANY = eINSTANCE.getSrcETypedElement_Many();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_ETYPED_ELEMENT__REQUIRED = eINSTANCE.getSrcETypedElement_Required();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_ETYPED_ELEMENT__ETYPE = eINSTANCE.getSrcETypedElement_EType();

		/**
		 * The meta object literal for the '{@link jointPackage_Ecore2Maude.impl.TrgMaudeSpecImpl <em>Trg Maude Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Ecore2Maude.impl.TrgMaudeSpecImpl
		 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgMaudeSpec()
		 * @generated
		 */
		EClass TRG_MAUDE_SPEC = eINSTANCE.getTrgMaudeSpec();

		/**
		 * The meta object literal for the '<em><b>Els</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_MAUDE_SPEC__ELS = eINSTANCE.getTrgMaudeSpec_Els();

		/**
		 * The meta object literal for the '<em><b>Printable Els</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_MAUDE_SPEC__PRINTABLE_ELS = eINSTANCE.getTrgMaudeSpec_PrintableEls();

		/**
		 * The meta object literal for the '{@link jointPackage_Ecore2Maude.impl.TrgMembershipImpl <em>Trg Membership</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Ecore2Maude.impl.TrgMembershipImpl
		 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgMembership()
		 * @generated
		 */
		EClass TRG_MEMBERSHIP = eINSTANCE.getTrgMembership();

		/**
		 * The meta object literal for the '<em><b>Term</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_MEMBERSHIP__TERM = eINSTANCE.getTrgMembership_Term();

		/**
		 * The meta object literal for the '<em><b>Sort</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_MEMBERSHIP__SORT = eINSTANCE.getTrgMembership_Sort();

		/**
		 * The meta object literal for the '{@link jointPackage_Ecore2Maude.impl.TrgEquationImpl <em>Trg Equation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Ecore2Maude.impl.TrgEquationImpl
		 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgEquation()
		 * @generated
		 */
		EClass TRG_EQUATION = eINSTANCE.getTrgEquation();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_EQUATION__LHS = eINSTANCE.getTrgEquation_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_EQUATION__RHS = eINSTANCE.getTrgEquation_Rhs();

		/**
		 * The meta object literal for the '{@link jointPackage_Ecore2Maude.impl.TrgRuleImpl <em>Trg Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Ecore2Maude.impl.TrgRuleImpl
		 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgRule()
		 * @generated
		 */
		EClass TRG_RULE = eINSTANCE.getTrgRule();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_RULE__LHS = eINSTANCE.getTrgRule_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_RULE__RHS = eINSTANCE.getTrgRule_Rhs();

		/**
		 * The meta object literal for the '{@link jointPackage_Ecore2Maude.impl.TrgMembershipCondImpl <em>Trg Membership Cond</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Ecore2Maude.impl.TrgMembershipCondImpl
		 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgMembershipCond()
		 * @generated
		 */
		EClass TRG_MEMBERSHIP_COND = eINSTANCE.getTrgMembershipCond();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_MEMBERSHIP_COND__RHS = eINSTANCE.getTrgMembershipCond_Rhs();

		/**
		 * The meta object literal for the '{@link jointPackage_Ecore2Maude.impl.TrgBooleanCondImpl <em>Trg Boolean Cond</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Ecore2Maude.impl.TrgBooleanCondImpl
		 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgBooleanCond()
		 * @generated
		 */
		EClass TRG_BOOLEAN_COND = eINSTANCE.getTrgBooleanCond();

		/**
		 * The meta object literal for the '{@link jointPackage_Ecore2Maude.impl.TrgMatchingCondImpl <em>Trg Matching Cond</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Ecore2Maude.impl.TrgMatchingCondImpl
		 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgMatchingCond()
		 * @generated
		 */
		EClass TRG_MATCHING_COND = eINSTANCE.getTrgMatchingCond();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_MATCHING_COND__RHS = eINSTANCE.getTrgMatchingCond_Rhs();

		/**
		 * The meta object literal for the '{@link jointPackage_Ecore2Maude.impl.TrgEqualCondImpl <em>Trg Equal Cond</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Ecore2Maude.impl.TrgEqualCondImpl
		 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgEqualCond()
		 * @generated
		 */
		EClass TRG_EQUAL_COND = eINSTANCE.getTrgEqualCond();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_EQUAL_COND__RHS = eINSTANCE.getTrgEqualCond_Rhs();

		/**
		 * The meta object literal for the '{@link jointPackage_Ecore2Maude.impl.TrgMaudeTopElImpl <em>Trg Maude Top El</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Ecore2Maude.impl.TrgMaudeTopElImpl
		 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgMaudeTopEl()
		 * @generated
		 */
		EClass TRG_MAUDE_TOP_EL = eINSTANCE.getTrgMaudeTopEl();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRG_MAUDE_TOP_EL__NAME = eINSTANCE.getTrgMaudeTopEl_Name();

		/**
		 * The meta object literal for the '{@link jointPackage_Ecore2Maude.impl.TrgModExpressionImpl <em>Trg Mod Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Ecore2Maude.impl.TrgModExpressionImpl
		 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgModExpression()
		 * @generated
		 */
		EClass TRG_MOD_EXPRESSION = eINSTANCE.getTrgModExpression();

		/**
		 * The meta object literal for the '{@link jointPackage_Ecore2Maude.impl.TrgInstModExpImpl <em>Trg Inst Mod Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Ecore2Maude.impl.TrgInstModExpImpl
		 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgInstModExp()
		 * @generated
		 */
		EClass TRG_INST_MOD_EXP = eINSTANCE.getTrgInstModExp();

		/**
		 * The meta object literal for the '<em><b>Mod Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_INST_MOD_EXP__MOD_EXP = eINSTANCE.getTrgInstModExp_ModExp();

		/**
		 * The meta object literal for the '<em><b>Views</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_INST_MOD_EXP__VIEWS = eINSTANCE.getTrgInstModExp_Views();

		/**
		 * The meta object literal for the '{@link jointPackage_Ecore2Maude.impl.TrgRenModExpImpl <em>Trg Ren Mod Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Ecore2Maude.impl.TrgRenModExpImpl
		 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgRenModExp()
		 * @generated
		 */
		EClass TRG_REN_MOD_EXP = eINSTANCE.getTrgRenModExp();

		/**
		 * The meta object literal for the '<em><b>Mod Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_REN_MOD_EXP__MOD_EXP = eINSTANCE.getTrgRenModExp_ModExp();

		/**
		 * The meta object literal for the '<em><b>Renamings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_REN_MOD_EXP__RENAMINGS = eINSTANCE.getTrgRenModExp_Renamings();

		/**
		 * The meta object literal for the '{@link jointPackage_Ecore2Maude.impl.TrgCompModExpImpl <em>Trg Comp Mod Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Ecore2Maude.impl.TrgCompModExpImpl
		 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgCompModExp()
		 * @generated
		 */
		EClass TRG_COMP_MOD_EXP = eINSTANCE.getTrgCompModExp();

		/**
		 * The meta object literal for the '<em><b>Mod Exps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_COMP_MOD_EXP__MOD_EXPS = eINSTANCE.getTrgCompModExp_ModExps();

		/**
		 * The meta object literal for the '{@link jointPackage_Ecore2Maude.impl.TrgModuleIdModExpImpl <em>Trg Module Id Mod Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Ecore2Maude.impl.TrgModuleIdModExpImpl
		 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgModuleIdModExp()
		 * @generated
		 */
		EClass TRG_MODULE_ID_MOD_EXP = eINSTANCE.getTrgModuleIdModExp();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_MODULE_ID_MOD_EXP__MODULE = eINSTANCE.getTrgModuleIdModExp_Module();

		/**
		 * The meta object literal for the '{@link jointPackage_Ecore2Maude.impl.TrgTheoryIdModExpImpl <em>Trg Theory Id Mod Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Ecore2Maude.impl.TrgTheoryIdModExpImpl
		 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgTheoryIdModExp()
		 * @generated
		 */
		EClass TRG_THEORY_ID_MOD_EXP = eINSTANCE.getTrgTheoryIdModExp();

		/**
		 * The meta object literal for the '<em><b>Theory</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_THEORY_ID_MOD_EXP__THEORY = eINSTANCE.getTrgTheoryIdModExp_Theory();

		/**
		 * The meta object literal for the '{@link jointPackage_Ecore2Maude.impl.TrgParameterImpl <em>Trg Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Ecore2Maude.impl.TrgParameterImpl
		 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgParameter()
		 * @generated
		 */
		EClass TRG_PARAMETER = eINSTANCE.getTrgParameter();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRG_PARAMETER__LABEL = eINSTANCE.getTrgParameter_Label();

		/**
		 * The meta object literal for the '<em><b>Mod Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_PARAMETER__MOD_EXP = eINSTANCE.getTrgParameter_ModExp();

		/**
		 * The meta object literal for the '{@link jointPackage_Ecore2Maude.impl.TrgTheoryImpl <em>Trg Theory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Ecore2Maude.impl.TrgTheoryImpl
		 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgTheory()
		 * @generated
		 */
		EClass TRG_THEORY = eINSTANCE.getTrgTheory();

		/**
		 * The meta object literal for the '<em><b>Els</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_THEORY__ELS = eINSTANCE.getTrgTheory_Els();

		/**
		 * The meta object literal for the '{@link jointPackage_Ecore2Maude.impl.TrgFTheoryImpl <em>Trg FTheory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Ecore2Maude.impl.TrgFTheoryImpl
		 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgFTheory()
		 * @generated
		 */
		EClass TRG_FTHEORY = eINSTANCE.getTrgFTheory();

		/**
		 * The meta object literal for the '{@link jointPackage_Ecore2Maude.impl.TrgSTheoryImpl <em>Trg STheory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Ecore2Maude.impl.TrgSTheoryImpl
		 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgSTheory()
		 * @generated
		 */
		EClass TRG_STHEORY = eINSTANCE.getTrgSTheory();

		/**
		 * The meta object literal for the '{@link jointPackage_Ecore2Maude.impl.TrgModuleImpl <em>Trg Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Ecore2Maude.impl.TrgModuleImpl
		 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgModule()
		 * @generated
		 */
		EClass TRG_MODULE = eINSTANCE.getTrgModule();

		/**
		 * The meta object literal for the '<em><b>Els</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_MODULE__ELS = eINSTANCE.getTrgModule_Els();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_MODULE__PARAMS = eINSTANCE.getTrgModule_Params();

		/**
		 * The meta object literal for the '{@link jointPackage_Ecore2Maude.impl.TrgFModuleImpl <em>Trg FModule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Ecore2Maude.impl.TrgFModuleImpl
		 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgFModule()
		 * @generated
		 */
		EClass TRG_FMODULE = eINSTANCE.getTrgFModule();

		/**
		 * The meta object literal for the '{@link jointPackage_Ecore2Maude.impl.TrgSModuleImpl <em>Trg SModule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Ecore2Maude.impl.TrgSModuleImpl
		 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgSModule()
		 * @generated
		 */
		EClass TRG_SMODULE = eINSTANCE.getTrgSModule();

		/**
		 * The meta object literal for the '{@link jointPackage_Ecore2Maude.impl.TrgModElementImpl <em>Trg Mod Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Ecore2Maude.impl.TrgModElementImpl
		 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgModElement()
		 * @generated
		 */
		EClass TRG_MOD_ELEMENT = eINSTANCE.getTrgModElement();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_MOD_ELEMENT__MODULE = eINSTANCE.getTrgModElement_Module();

		/**
		 * The meta object literal for the '<em><b>Theory</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_MOD_ELEMENT__THEORY = eINSTANCE.getTrgModElement_Theory();

		/**
		 * The meta object literal for the '{@link jointPackage_Ecore2Maude.impl.TrgModImportationImpl <em>Trg Mod Importation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Ecore2Maude.impl.TrgModImportationImpl
		 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgModImportation()
		 * @generated
		 */
		EClass TRG_MOD_IMPORTATION = eINSTANCE.getTrgModImportation();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_MOD_IMPORTATION__IMPORTS = eINSTANCE.getTrgModImportation_Imports();

		/**
		 * The meta object literal for the '{@link jointPackage_Ecore2Maude.impl.TrgTypeImpl <em>Trg Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Ecore2Maude.impl.TrgTypeImpl
		 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgType()
		 * @generated
		 */
		EClass TRG_TYPE = eINSTANCE.getTrgType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRG_TYPE__NAME = eINSTANCE.getTrgType_Name();

		/**
		 * The meta object literal for the '{@link jointPackage_Ecore2Maude.impl.TrgSortImpl <em>Trg Sort</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Ecore2Maude.impl.TrgSortImpl
		 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgSort()
		 * @generated
		 */
		EClass TRG_SORT = eINSTANCE.getTrgSort();

		/**
		 * The meta object literal for the '<em><b>Subsort Rels</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_SORT__SUBSORT_RELS = eINSTANCE.getTrgSort_SubsortRels();

		/**
		 * The meta object literal for the '<em><b>Supersort Rels</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_SORT__SUPERSORT_RELS = eINSTANCE.getTrgSort_SupersortRels();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_SORT__KIND = eINSTANCE.getTrgSort_Kind();

		/**
		 * The meta object literal for the '{@link jointPackage_Ecore2Maude.impl.TrgKindImpl <em>Trg Kind</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Ecore2Maude.impl.TrgKindImpl
		 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgKind()
		 * @generated
		 */
		EClass TRG_KIND = eINSTANCE.getTrgKind();

		/**
		 * The meta object literal for the '<em><b>Sorts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_KIND__SORTS = eINSTANCE.getTrgKind_Sorts();

		/**
		 * The meta object literal for the '{@link jointPackage_Ecore2Maude.impl.TrgSubsortRelImpl <em>Trg Subsort Rel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Ecore2Maude.impl.TrgSubsortRelImpl
		 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgSubsortRel()
		 * @generated
		 */
		EClass TRG_SUBSORT_REL = eINSTANCE.getTrgSubsortRel();

		/**
		 * The meta object literal for the '<em><b>Subsorts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_SUBSORT_REL__SUBSORTS = eINSTANCE.getTrgSubsortRel_Subsorts();

		/**
		 * The meta object literal for the '<em><b>Supersorts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_SUBSORT_REL__SUPERSORTS = eINSTANCE.getTrgSubsortRel_Supersorts();

		/**
		 * The meta object literal for the '{@link jointPackage_Ecore2Maude.impl.TrgOperationImpl <em>Trg Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Ecore2Maude.impl.TrgOperationImpl
		 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgOperation()
		 * @generated
		 */
		EClass TRG_OPERATION = eINSTANCE.getTrgOperation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRG_OPERATION__NAME = eINSTANCE.getTrgOperation_Name();

		/**
		 * The meta object literal for the '<em><b>Coarity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_OPERATION__COARITY = eINSTANCE.getTrgOperation_Coarity();

		/**
		 * The meta object literal for the '<em><b>Arity</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_OPERATION__ARITY = eINSTANCE.getTrgOperation_Arity();

		/**
		 * The meta object literal for the '<em><b>Atts</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRG_OPERATION__ATTS = eINSTANCE.getTrgOperation_Atts();

		/**
		 * The meta object literal for the '{@link jointPackage_Ecore2Maude.impl.TrgStatementImpl <em>Trg Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Ecore2Maude.impl.TrgStatementImpl
		 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgStatement()
		 * @generated
		 */
		EClass TRG_STATEMENT = eINSTANCE.getTrgStatement();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRG_STATEMENT__LABEL = eINSTANCE.getTrgStatement_Label();

		/**
		 * The meta object literal for the '<em><b>Atts</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRG_STATEMENT__ATTS = eINSTANCE.getTrgStatement_Atts();

		/**
		 * The meta object literal for the '<em><b>Conds</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_STATEMENT__CONDS = eINSTANCE.getTrgStatement_Conds();

		/**
		 * The meta object literal for the '{@link jointPackage_Ecore2Maude.impl.TrgConditionImpl <em>Trg Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Ecore2Maude.impl.TrgConditionImpl
		 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgCondition()
		 * @generated
		 */
		EClass TRG_CONDITION = eINSTANCE.getTrgCondition();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_CONDITION__LHS = eINSTANCE.getTrgCondition_Lhs();

		/**
		 * The meta object literal for the '{@link jointPackage_Ecore2Maude.impl.TrgEquationalCondImpl <em>Trg Equational Cond</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Ecore2Maude.impl.TrgEquationalCondImpl
		 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgEquationalCond()
		 * @generated
		 */
		EClass TRG_EQUATIONAL_COND = eINSTANCE.getTrgEquationalCond();

		/**
		 * The meta object literal for the '{@link jointPackage_Ecore2Maude.impl.TrgRewriteCondImpl <em>Trg Rewrite Cond</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Ecore2Maude.impl.TrgRewriteCondImpl
		 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgRewriteCond()
		 * @generated
		 */
		EClass TRG_REWRITE_COND = eINSTANCE.getTrgRewriteCond();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_REWRITE_COND__RHS = eINSTANCE.getTrgRewriteCond_Rhs();

		/**
		 * The meta object literal for the '{@link jointPackage_Ecore2Maude.impl.TrgTermImpl <em>Trg Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Ecore2Maude.impl.TrgTermImpl
		 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgTerm()
		 * @generated
		 */
		EClass TRG_TERM = eINSTANCE.getTrgTerm();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_TERM__TYPE = eINSTANCE.getTrgTerm_Type();

		/**
		 * The meta object literal for the '{@link jointPackage_Ecore2Maude.impl.TrgConstantImpl <em>Trg Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Ecore2Maude.impl.TrgConstantImpl
		 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgConstant()
		 * @generated
		 */
		EClass TRG_CONSTANT = eINSTANCE.getTrgConstant();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRG_CONSTANT__OP = eINSTANCE.getTrgConstant_Op();

		/**
		 * The meta object literal for the '{@link jointPackage_Ecore2Maude.impl.TrgRecTermImpl <em>Trg Rec Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Ecore2Maude.impl.TrgRecTermImpl
		 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgRecTerm()
		 * @generated
		 */
		EClass TRG_REC_TERM = eINSTANCE.getTrgRecTerm();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRG_REC_TERM__OP = eINSTANCE.getTrgRecTerm_Op();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_REC_TERM__ARGS = eINSTANCE.getTrgRecTerm_Args();

		/**
		 * The meta object literal for the '{@link jointPackage_Ecore2Maude.impl.TrgVariableImpl <em>Trg Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Ecore2Maude.impl.TrgVariableImpl
		 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgVariable()
		 * @generated
		 */
		EClass TRG_VARIABLE = eINSTANCE.getTrgVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRG_VARIABLE__NAME = eINSTANCE.getTrgVariable_Name();

		/**
		 * The meta object literal for the '{@link jointPackage_Ecore2Maude.impl.TrgViewImpl <em>Trg View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Ecore2Maude.impl.TrgViewImpl
		 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgView()
		 * @generated
		 */
		EClass TRG_VIEW = eINSTANCE.getTrgView();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_VIEW__FROM = eINSTANCE.getTrgView_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_VIEW__TO = eINSTANCE.getTrgView_To();

		/**
		 * The meta object literal for the '<em><b>Els</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_VIEW__ELS = eINSTANCE.getTrgView_Els();

		/**
		 * The meta object literal for the '{@link jointPackage_Ecore2Maude.impl.TrgViewMappingImpl <em>Trg View Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Ecore2Maude.impl.TrgViewMappingImpl
		 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgViewMapping()
		 * @generated
		 */
		EClass TRG_VIEW_MAPPING = eINSTANCE.getTrgViewMapping();

		/**
		 * The meta object literal for the '{@link jointPackage_Ecore2Maude.impl.TrgRenMappingImpl <em>Trg Ren Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Ecore2Maude.impl.TrgRenMappingImpl
		 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgRenMapping()
		 * @generated
		 */
		EClass TRG_REN_MAPPING = eINSTANCE.getTrgRenMapping();

		/**
		 * The meta object literal for the '{@link jointPackage_Ecore2Maude.impl.TrgTermMappingImpl <em>Trg Term Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Ecore2Maude.impl.TrgTermMappingImpl
		 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgTermMapping()
		 * @generated
		 */
		EClass TRG_TERM_MAPPING = eINSTANCE.getTrgTermMapping();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_TERM_MAPPING__FROM = eINSTANCE.getTrgTermMapping_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_TERM_MAPPING__TO = eINSTANCE.getTrgTermMapping_To();

		/**
		 * The meta object literal for the '{@link jointPackage_Ecore2Maude.impl.TrgSortMappingImpl <em>Trg Sort Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Ecore2Maude.impl.TrgSortMappingImpl
		 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgSortMapping()
		 * @generated
		 */
		EClass TRG_SORT_MAPPING = eINSTANCE.getTrgSortMapping();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_SORT_MAPPING__FROM = eINSTANCE.getTrgSortMapping_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRG_SORT_MAPPING__TO = eINSTANCE.getTrgSortMapping_To();

		/**
		 * The meta object literal for the '{@link jointPackage_Ecore2Maude.impl.TrgOpTypedMappingImpl <em>Trg Op Typed Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Ecore2Maude.impl.TrgOpTypedMappingImpl
		 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgOpTypedMapping()
		 * @generated
		 */
		EClass TRG_OP_TYPED_MAPPING = eINSTANCE.getTrgOpTypedMapping();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_OP_TYPED_MAPPING__FROM = eINSTANCE.getTrgOpTypedMapping_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRG_OP_TYPED_MAPPING__TO = eINSTANCE.getTrgOpTypedMapping_To();

		/**
		 * The meta object literal for the '<em><b>Atts</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRG_OP_TYPED_MAPPING__ATTS = eINSTANCE.getTrgOpTypedMapping_Atts();

		/**
		 * The meta object literal for the '{@link jointPackage_Ecore2Maude.impl.TrgOpMappingImpl <em>Trg Op Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Ecore2Maude.impl.TrgOpMappingImpl
		 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgOpMapping()
		 * @generated
		 */
		EClass TRG_OP_MAPPING = eINSTANCE.getTrgOpMapping();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_OP_MAPPING__FROM = eINSTANCE.getTrgOpMapping_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRG_OP_MAPPING__TO = eINSTANCE.getTrgOpMapping_To();

		/**
		 * The meta object literal for the '{@link jointPackage_Ecore2Maude.impl.TrgLabelMappingImpl <em>Trg Label Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Ecore2Maude.impl.TrgLabelMappingImpl
		 * @see jointPackage_Ecore2Maude.impl.JointPackage_Ecore2MaudePackageImpl#getTrgLabelMapping()
		 * @generated
		 */
		EClass TRG_LABEL_MAPPING = eINSTANCE.getTrgLabelMapping();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRG_LABEL_MAPPING__FROM = eINSTANCE.getTrgLabelMapping_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRG_LABEL_MAPPING__TO = eINSTANCE.getTrgLabelMapping_To();

	}

} //JointPackage_Ecore2MaudePackage
