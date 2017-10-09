/**
 */
package jointPackage_CPL2SPL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLFactory
 * @model kind="package"
 * @generated
 */
public interface JointPackage_CPL2SPLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "jointPackage_CPL2SPL";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://jointPackage_CPL2SPL/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "jointPackage_CPL2SPL";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JointPackage_CPL2SPLPackage eINSTANCE = jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl.init();

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.JointMMImpl <em>Joint MM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.JointMMImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getJointMM()
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
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.SrcCPLModelImpl <em>Src CPL Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.SrcCPLModelImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSrcCPLModel()
	 * @generated
	 */
	int SRC_CPL_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_CPL_MODEL__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Src CPL Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_CPL_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Src CPL Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_CPL_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.SrcElementImpl <em>Src Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.SrcElementImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSrcElement()
	 * @generated
	 */
	int SRC_ELEMENT = 11;

	/**
	 * The number of structural features of the '<em>Src Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Src Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.SrcCPLImpl <em>Src CPL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.SrcCPLImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSrcCPL()
	 * @generated
	 */
	int SRC_CPL = 2;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_CPL__SUB_ACTIONS = SRC_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_CPL__OUTGOING = SRC_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_CPL__INCOMING = SRC_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Src CPL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_CPL_FEATURE_COUNT = SRC_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Src CPL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_CPL_OPERATION_COUNT = SRC_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.SrcNodeImpl <em>Src Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.SrcNodeImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSrcNode()
	 * @generated
	 */
	int SRC_NODE = 28;

	/**
	 * The number of structural features of the '<em>Src Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_NODE_FEATURE_COUNT = SRC_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Src Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_NODE_OPERATION_COUNT = SRC_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.SrcSwitchImpl <em>Src Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.SrcSwitchImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSrcSwitch()
	 * @generated
	 */
	int SRC_SWITCH = 29;

	/**
	 * The feature id for the '<em><b>Not Present</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_SWITCH__NOT_PRESENT = SRC_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Otherwise</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_SWITCH__OTHERWISE = SRC_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Src Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_SWITCH_FEATURE_COUNT = SRC_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Src Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_SWITCH_OPERATION_COUNT = SRC_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.SrcAddressSwitchImpl <em>Src Address Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.SrcAddressSwitchImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSrcAddressSwitch()
	 * @generated
	 */
	int SRC_ADDRESS_SWITCH = 3;

	/**
	 * The feature id for the '<em><b>Not Present</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ADDRESS_SWITCH__NOT_PRESENT = SRC_SWITCH__NOT_PRESENT;

	/**
	 * The feature id for the '<em><b>Otherwise</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ADDRESS_SWITCH__OTHERWISE = SRC_SWITCH__OTHERWISE;

	/**
	 * The feature id for the '<em><b>Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ADDRESS_SWITCH__FIELD = SRC_SWITCH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ADDRESS_SWITCH__SUB_FIELD = SRC_SWITCH_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Addresses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ADDRESS_SWITCH__ADDRESSES = SRC_SWITCH_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Src Address Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ADDRESS_SWITCH_FEATURE_COUNT = SRC_SWITCH_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Src Address Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ADDRESS_SWITCH_OPERATION_COUNT = SRC_SWITCH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.SrcStringSwitchImpl <em>Src String Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.SrcStringSwitchImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSrcStringSwitch()
	 * @generated
	 */
	int SRC_STRING_SWITCH = 4;

	/**
	 * The feature id for the '<em><b>Not Present</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_STRING_SWITCH__NOT_PRESENT = SRC_SWITCH__NOT_PRESENT;

	/**
	 * The feature id for the '<em><b>Otherwise</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_STRING_SWITCH__OTHERWISE = SRC_SWITCH__OTHERWISE;

	/**
	 * The feature id for the '<em><b>Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_STRING_SWITCH__FIELD = SRC_SWITCH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Strings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_STRING_SWITCH__STRINGS = SRC_SWITCH_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Src String Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_STRING_SWITCH_FEATURE_COUNT = SRC_SWITCH_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Src String Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_STRING_SWITCH_OPERATION_COUNT = SRC_SWITCH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.SrcLanguageSwitchImpl <em>Src Language Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.SrcLanguageSwitchImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSrcLanguageSwitch()
	 * @generated
	 */
	int SRC_LANGUAGE_SWITCH = 5;

	/**
	 * The feature id for the '<em><b>Not Present</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_LANGUAGE_SWITCH__NOT_PRESENT = SRC_SWITCH__NOT_PRESENT;

	/**
	 * The feature id for the '<em><b>Otherwise</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_LANGUAGE_SWITCH__OTHERWISE = SRC_SWITCH__OTHERWISE;

	/**
	 * The feature id for the '<em><b>Languages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_LANGUAGE_SWITCH__LANGUAGES = SRC_SWITCH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Src Language Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_LANGUAGE_SWITCH_FEATURE_COUNT = SRC_SWITCH_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Src Language Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_LANGUAGE_SWITCH_OPERATION_COUNT = SRC_SWITCH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.SrcTimeSwitchImpl <em>Src Time Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.SrcTimeSwitchImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSrcTimeSwitch()
	 * @generated
	 */
	int SRC_TIME_SWITCH = 6;

	/**
	 * The feature id for the '<em><b>Not Present</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_TIME_SWITCH__NOT_PRESENT = SRC_SWITCH__NOT_PRESENT;

	/**
	 * The feature id for the '<em><b>Otherwise</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_TIME_SWITCH__OTHERWISE = SRC_SWITCH__OTHERWISE;

	/**
	 * The feature id for the '<em><b>Tzid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_TIME_SWITCH__TZID = SRC_SWITCH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tzurl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_TIME_SWITCH__TZURL = SRC_SWITCH_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Times</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_TIME_SWITCH__TIMES = SRC_SWITCH_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Src Time Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_TIME_SWITCH_FEATURE_COUNT = SRC_SWITCH_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Src Time Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_TIME_SWITCH_OPERATION_COUNT = SRC_SWITCH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.SrcPrioritySwitchImpl <em>Src Priority Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.SrcPrioritySwitchImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSrcPrioritySwitch()
	 * @generated
	 */
	int SRC_PRIORITY_SWITCH = 7;

	/**
	 * The feature id for the '<em><b>Not Present</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PRIORITY_SWITCH__NOT_PRESENT = SRC_SWITCH__NOT_PRESENT;

	/**
	 * The feature id for the '<em><b>Otherwise</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PRIORITY_SWITCH__OTHERWISE = SRC_SWITCH__OTHERWISE;

	/**
	 * The feature id for the '<em><b>Priorities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PRIORITY_SWITCH__PRIORITIES = SRC_SWITCH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Src Priority Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PRIORITY_SWITCH_FEATURE_COUNT = SRC_SWITCH_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Src Priority Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PRIORITY_SWITCH_OPERATION_COUNT = SRC_SWITCH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.SrcActionImpl <em>Src Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.SrcActionImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSrcAction()
	 * @generated
	 */
	int SRC_ACTION = 32;

	/**
	 * The number of structural features of the '<em>Src Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ACTION_FEATURE_COUNT = SRC_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Src Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ACTION_OPERATION_COUNT = SRC_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.SrcSignallingActionImpl <em>Src Signalling Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.SrcSignallingActionImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSrcSignallingAction()
	 * @generated
	 */
	int SRC_SIGNALLING_ACTION = 33;

	/**
	 * The number of structural features of the '<em>Src Signalling Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_SIGNALLING_ACTION_FEATURE_COUNT = SRC_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Src Signalling Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_SIGNALLING_ACTION_OPERATION_COUNT = SRC_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.SrcProxyImpl <em>Src Proxy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.SrcProxyImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSrcProxy()
	 * @generated
	 */
	int SRC_PROXY = 8;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PROXY__TIMEOUT = SRC_SIGNALLING_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Recurse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PROXY__RECURSE = SRC_SIGNALLING_ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PROXY__ORDERING = SRC_SIGNALLING_ACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Busy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PROXY__BUSY = SRC_SIGNALLING_ACTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>No Answer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PROXY__NO_ANSWER = SRC_SIGNALLING_ACTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Redirection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PROXY__REDIRECTION = SRC_SIGNALLING_ACTION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PROXY__FAILURE = SRC_SIGNALLING_ACTION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PROXY__DEFAULT = SRC_SIGNALLING_ACTION_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Src Proxy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PROXY_FEATURE_COUNT = SRC_SIGNALLING_ACTION_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Src Proxy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PROXY_OPERATION_COUNT = SRC_SIGNALLING_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.SrcRedirectImpl <em>Src Redirect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.SrcRedirectImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSrcRedirect()
	 * @generated
	 */
	int SRC_REDIRECT = 9;

	/**
	 * The feature id for the '<em><b>Permanent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_REDIRECT__PERMANENT = SRC_SIGNALLING_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Src Redirect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_REDIRECT_FEATURE_COUNT = SRC_SIGNALLING_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Src Redirect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_REDIRECT_OPERATION_COUNT = SRC_SIGNALLING_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.SrcRejectImpl <em>Src Reject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.SrcRejectImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSrcReject()
	 * @generated
	 */
	int SRC_REJECT = 10;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_REJECT__STATUS = SRC_SIGNALLING_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_REJECT__REASON = SRC_SIGNALLING_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Src Reject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_REJECT_FEATURE_COUNT = SRC_SIGNALLING_ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Src Reject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_REJECT_OPERATION_COUNT = SRC_SIGNALLING_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.SrcNodeContainerImpl <em>Src Node Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.SrcNodeContainerImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSrcNodeContainer()
	 * @generated
	 */
	int SRC_NODE_CONTAINER = 12;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_NODE_CONTAINER__CONTENTS = SRC_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Src Node Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_NODE_CONTAINER_FEATURE_COUNT = SRC_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Src Node Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_NODE_CONTAINER_OPERATION_COUNT = SRC_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.SrcSubActionImpl <em>Src Sub Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.SrcSubActionImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSrcSubAction()
	 * @generated
	 */
	int SRC_SUB_ACTION = 13;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_SUB_ACTION__CONTENTS = SRC_NODE_CONTAINER__CONTENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_SUB_ACTION__ID = SRC_NODE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Src Sub Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_SUB_ACTION_FEATURE_COUNT = SRC_NODE_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Src Sub Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_SUB_ACTION_OPERATION_COUNT = SRC_NODE_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.SrcOutgoingImpl <em>Src Outgoing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.SrcOutgoingImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSrcOutgoing()
	 * @generated
	 */
	int SRC_OUTGOING = 14;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_OUTGOING__CONTENTS = SRC_NODE_CONTAINER__CONTENTS;

	/**
	 * The number of structural features of the '<em>Src Outgoing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_OUTGOING_FEATURE_COUNT = SRC_NODE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Src Outgoing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_OUTGOING_OPERATION_COUNT = SRC_NODE_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.SrcIncomingImpl <em>Src Incoming</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.SrcIncomingImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSrcIncoming()
	 * @generated
	 */
	int SRC_INCOMING = 15;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_INCOMING__CONTENTS = SRC_NODE_CONTAINER__CONTENTS;

	/**
	 * The number of structural features of the '<em>Src Incoming</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_INCOMING_FEATURE_COUNT = SRC_NODE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Src Incoming</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_INCOMING_OPERATION_COUNT = SRC_NODE_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.SrcNotPresentImpl <em>Src Not Present</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.SrcNotPresentImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSrcNotPresent()
	 * @generated
	 */
	int SRC_NOT_PRESENT = 16;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_NOT_PRESENT__CONTENTS = SRC_NODE_CONTAINER__CONTENTS;

	/**
	 * The number of structural features of the '<em>Src Not Present</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_NOT_PRESENT_FEATURE_COUNT = SRC_NODE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Src Not Present</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_NOT_PRESENT_OPERATION_COUNT = SRC_NODE_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.SrcOtherwiseImpl <em>Src Otherwise</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.SrcOtherwiseImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSrcOtherwise()
	 * @generated
	 */
	int SRC_OTHERWISE = 17;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_OTHERWISE__CONTENTS = SRC_NODE_CONTAINER__CONTENTS;

	/**
	 * The number of structural features of the '<em>Src Otherwise</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_OTHERWISE_FEATURE_COUNT = SRC_NODE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Src Otherwise</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_OTHERWISE_OPERATION_COUNT = SRC_NODE_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.SrcSwitchedAddressImpl <em>Src Switched Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.SrcSwitchedAddressImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSrcSwitchedAddress()
	 * @generated
	 */
	int SRC_SWITCHED_ADDRESS = 18;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_SWITCHED_ADDRESS__CONTENTS = SRC_NODE_CONTAINER__CONTENTS;

	/**
	 * The feature id for the '<em><b>Is</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_SWITCHED_ADDRESS__IS = SRC_NODE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_SWITCHED_ADDRESS__CONTAINS = SRC_NODE_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sub Domain Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_SWITCHED_ADDRESS__SUB_DOMAIN_OF = SRC_NODE_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Src Switched Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_SWITCHED_ADDRESS_FEATURE_COUNT = SRC_NODE_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Src Switched Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_SWITCHED_ADDRESS_OPERATION_COUNT = SRC_NODE_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.SrcSwitchedStringImpl <em>Src Switched String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.SrcSwitchedStringImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSrcSwitchedString()
	 * @generated
	 */
	int SRC_SWITCHED_STRING = 19;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_SWITCHED_STRING__CONTENTS = SRC_NODE_CONTAINER__CONTENTS;

	/**
	 * The feature id for the '<em><b>Is</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_SWITCHED_STRING__IS = SRC_NODE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_SWITCHED_STRING__CONTAINS = SRC_NODE_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Src Switched String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_SWITCHED_STRING_FEATURE_COUNT = SRC_NODE_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Src Switched String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_SWITCHED_STRING_OPERATION_COUNT = SRC_NODE_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.SrcSwitchedLanguageImpl <em>Src Switched Language</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.SrcSwitchedLanguageImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSrcSwitchedLanguage()
	 * @generated
	 */
	int SRC_SWITCHED_LANGUAGE = 20;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_SWITCHED_LANGUAGE__CONTENTS = SRC_NODE_CONTAINER__CONTENTS;

	/**
	 * The feature id for the '<em><b>Matches</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_SWITCHED_LANGUAGE__MATCHES = SRC_NODE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Src Switched Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_SWITCHED_LANGUAGE_FEATURE_COUNT = SRC_NODE_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Src Switched Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_SWITCHED_LANGUAGE_OPERATION_COUNT = SRC_NODE_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.SrcSwitchedTimeImpl <em>Src Switched Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.SrcSwitchedTimeImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSrcSwitchedTime()
	 * @generated
	 */
	int SRC_SWITCHED_TIME = 21;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_SWITCHED_TIME__CONTENTS = SRC_NODE_CONTAINER__CONTENTS;

	/**
	 * The feature id for the '<em><b>Dtstart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_SWITCHED_TIME__DTSTART = SRC_NODE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dtend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_SWITCHED_TIME__DTEND = SRC_NODE_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_SWITCHED_TIME__DURATION = SRC_NODE_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Freq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_SWITCHED_TIME__FREQ = SRC_NODE_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Until</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_SWITCHED_TIME__UNTIL = SRC_NODE_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_SWITCHED_TIME__COUNT = SRC_NODE_CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_SWITCHED_TIME__INTERVAL = SRC_NODE_CONTAINER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>By Second</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_SWITCHED_TIME__BY_SECOND = SRC_NODE_CONTAINER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>By Minute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_SWITCHED_TIME__BY_MINUTE = SRC_NODE_CONTAINER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>By Hour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_SWITCHED_TIME__BY_HOUR = SRC_NODE_CONTAINER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>By Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_SWITCHED_TIME__BY_DAY = SRC_NODE_CONTAINER_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>By Month Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_SWITCHED_TIME__BY_MONTH_DAY = SRC_NODE_CONTAINER_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>By Year Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_SWITCHED_TIME__BY_YEAR_DAY = SRC_NODE_CONTAINER_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>By Week No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_SWITCHED_TIME__BY_WEEK_NO = SRC_NODE_CONTAINER_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>By Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_SWITCHED_TIME__BY_MONTH = SRC_NODE_CONTAINER_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Wkst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_SWITCHED_TIME__WKST = SRC_NODE_CONTAINER_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>By Set Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_SWITCHED_TIME__BY_SET_POS = SRC_NODE_CONTAINER_FEATURE_COUNT + 16;

	/**
	 * The number of structural features of the '<em>Src Switched Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_SWITCHED_TIME_FEATURE_COUNT = SRC_NODE_CONTAINER_FEATURE_COUNT + 17;

	/**
	 * The number of operations of the '<em>Src Switched Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_SWITCHED_TIME_OPERATION_COUNT = SRC_NODE_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.SrcSwitchedPriorityImpl <em>Src Switched Priority</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.SrcSwitchedPriorityImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSrcSwitchedPriority()
	 * @generated
	 */
	int SRC_SWITCHED_PRIORITY = 22;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_SWITCHED_PRIORITY__CONTENTS = SRC_NODE_CONTAINER__CONTENTS;

	/**
	 * The feature id for the '<em><b>Less</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_SWITCHED_PRIORITY__LESS = SRC_NODE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Greater</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_SWITCHED_PRIORITY__GREATER = SRC_NODE_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Equal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_SWITCHED_PRIORITY__EQUAL = SRC_NODE_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Src Switched Priority</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_SWITCHED_PRIORITY_FEATURE_COUNT = SRC_NODE_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Src Switched Priority</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_SWITCHED_PRIORITY_OPERATION_COUNT = SRC_NODE_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.SrcBusyImpl <em>Src Busy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.SrcBusyImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSrcBusy()
	 * @generated
	 */
	int SRC_BUSY = 23;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_BUSY__CONTENTS = SRC_NODE_CONTAINER__CONTENTS;

	/**
	 * The number of structural features of the '<em>Src Busy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_BUSY_FEATURE_COUNT = SRC_NODE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Src Busy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_BUSY_OPERATION_COUNT = SRC_NODE_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.SrcNoAnswerImpl <em>Src No Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.SrcNoAnswerImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSrcNoAnswer()
	 * @generated
	 */
	int SRC_NO_ANSWER = 24;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_NO_ANSWER__CONTENTS = SRC_NODE_CONTAINER__CONTENTS;

	/**
	 * The number of structural features of the '<em>Src No Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_NO_ANSWER_FEATURE_COUNT = SRC_NODE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Src No Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_NO_ANSWER_OPERATION_COUNT = SRC_NODE_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.SrcRedirectionImpl <em>Src Redirection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.SrcRedirectionImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSrcRedirection()
	 * @generated
	 */
	int SRC_REDIRECTION = 25;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_REDIRECTION__CONTENTS = SRC_NODE_CONTAINER__CONTENTS;

	/**
	 * The number of structural features of the '<em>Src Redirection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_REDIRECTION_FEATURE_COUNT = SRC_NODE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Src Redirection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_REDIRECTION_OPERATION_COUNT = SRC_NODE_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.SrcFailureImpl <em>Src Failure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.SrcFailureImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSrcFailure()
	 * @generated
	 */
	int SRC_FAILURE = 26;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_FAILURE__CONTENTS = SRC_NODE_CONTAINER__CONTENTS;

	/**
	 * The number of structural features of the '<em>Src Failure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_FAILURE_FEATURE_COUNT = SRC_NODE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Src Failure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_FAILURE_OPERATION_COUNT = SRC_NODE_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.SrcDefaultImpl <em>Src Default</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.SrcDefaultImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSrcDefault()
	 * @generated
	 */
	int SRC_DEFAULT = 27;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_DEFAULT__CONTENTS = SRC_NODE_CONTAINER__CONTENTS;

	/**
	 * The number of structural features of the '<em>Src Default</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_DEFAULT_FEATURE_COUNT = SRC_NODE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Src Default</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_DEFAULT_OPERATION_COUNT = SRC_NODE_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.SrcLocationImpl <em>Src Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.SrcLocationImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSrcLocation()
	 * @generated
	 */
	int SRC_LOCATION = 30;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_LOCATION__CONTENTS = SRC_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_LOCATION__URL = SRC_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_LOCATION__PRIORITY = SRC_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Clear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_LOCATION__CLEAR = SRC_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Src Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_LOCATION_FEATURE_COUNT = SRC_NODE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Src Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_LOCATION_OPERATION_COUNT = SRC_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.SrcSubCallImpl <em>Src Sub Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.SrcSubCallImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSrcSubCall()
	 * @generated
	 */
	int SRC_SUB_CALL = 31;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_SUB_CALL__REF = SRC_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Src Sub Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_SUB_CALL_FEATURE_COUNT = SRC_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Src Sub Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_SUB_CALL_OPERATION_COUNT = SRC_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgLocatedElementImpl <em>Trg Located Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgLocatedElementImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgLocatedElement()
	 * @generated
	 */
	int TRG_LOCATED_ELEMENT = 40;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_LOCATED_ELEMENT__LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_LOCATED_ELEMENT__COMMENTS_BEFORE = 1;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_LOCATED_ELEMENT__COMMENTS_AFTER = 2;

	/**
	 * The number of structural features of the '<em>Trg Located Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_LOCATED_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Trg Located Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_LOCATED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgProgramImpl <em>Trg Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgProgramImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgProgram()
	 * @generated
	 */
	int TRG_PROGRAM = 34;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_PROGRAM__LOCATION = TRG_LOCATED_ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_PROGRAM__COMMENTS_BEFORE = TRG_LOCATED_ELEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_PROGRAM__COMMENTS_AFTER = TRG_LOCATED_ELEMENT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_PROGRAM__SERVICE = TRG_LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trg Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_PROGRAM_FEATURE_COUNT = TRG_LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trg Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_PROGRAM_OPERATION_COUNT = TRG_LOCATED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgStructurePropertyImpl <em>Trg Structure Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgStructurePropertyImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgStructureProperty()
	 * @generated
	 */
	int TRG_STRUCTURE_PROPERTY = 35;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_STRUCTURE_PROPERTY__LOCATION = TRG_LOCATED_ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_STRUCTURE_PROPERTY__COMMENTS_BEFORE = TRG_LOCATED_ELEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_STRUCTURE_PROPERTY__COMMENTS_AFTER = TRG_LOCATED_ELEMENT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_STRUCTURE_PROPERTY__NAME = TRG_LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_STRUCTURE_PROPERTY__TYPE = TRG_LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Trg Structure Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_STRUCTURE_PROPERTY_FEATURE_COUNT = TRG_LOCATED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Trg Structure Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_STRUCTURE_PROPERTY_OPERATION_COUNT = TRG_LOCATED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgResponseImpl <em>Trg Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgResponseImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgResponse()
	 * @generated
	 */
	int TRG_RESPONSE = 108;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_RESPONSE__LOCATION = TRG_LOCATED_ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_RESPONSE__COMMENTS_BEFORE = TRG_LOCATED_ELEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_RESPONSE__COMMENTS_AFTER = TRG_LOCATED_ELEMENT__COMMENTS_AFTER;

	/**
	 * The number of structural features of the '<em>Trg Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_RESPONSE_FEATURE_COUNT = TRG_LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Trg Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_RESPONSE_OPERATION_COUNT = TRG_LOCATED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgErrorResponseImpl <em>Trg Error Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgErrorResponseImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgErrorResponse()
	 * @generated
	 */
	int TRG_ERROR_RESPONSE = 110;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_ERROR_RESPONSE__LOCATION = TRG_RESPONSE__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_ERROR_RESPONSE__COMMENTS_BEFORE = TRG_RESPONSE__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_ERROR_RESPONSE__COMMENTS_AFTER = TRG_RESPONSE__COMMENTS_AFTER;

	/**
	 * The number of structural features of the '<em>Trg Error Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_ERROR_RESPONSE_FEATURE_COUNT = TRG_RESPONSE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Trg Error Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_ERROR_RESPONSE_OPERATION_COUNT = TRG_RESPONSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgClientErrorResponseImpl <em>Trg Client Error Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgClientErrorResponseImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgClientErrorResponse()
	 * @generated
	 */
	int TRG_CLIENT_ERROR_RESPONSE = 36;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_CLIENT_ERROR_RESPONSE__LOCATION = TRG_ERROR_RESPONSE__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_CLIENT_ERROR_RESPONSE__COMMENTS_BEFORE = TRG_ERROR_RESPONSE__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_CLIENT_ERROR_RESPONSE__COMMENTS_AFTER = TRG_ERROR_RESPONSE__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Error Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_CLIENT_ERROR_RESPONSE__ERROR_KIND = TRG_ERROR_RESPONSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trg Client Error Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_CLIENT_ERROR_RESPONSE_FEATURE_COUNT = TRG_ERROR_RESPONSE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trg Client Error Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_CLIENT_ERROR_RESPONSE_OPERATION_COUNT = TRG_ERROR_RESPONSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgGlobalErrorResponseImpl <em>Trg Global Error Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgGlobalErrorResponseImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgGlobalErrorResponse()
	 * @generated
	 */
	int TRG_GLOBAL_ERROR_RESPONSE = 37;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_GLOBAL_ERROR_RESPONSE__LOCATION = TRG_ERROR_RESPONSE__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_GLOBAL_ERROR_RESPONSE__COMMENTS_BEFORE = TRG_ERROR_RESPONSE__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_GLOBAL_ERROR_RESPONSE__COMMENTS_AFTER = TRG_ERROR_RESPONSE__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Error Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_GLOBAL_ERROR_RESPONSE__ERROR_KIND = TRG_ERROR_RESPONSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trg Global Error Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_GLOBAL_ERROR_RESPONSE_FEATURE_COUNT = TRG_ERROR_RESPONSE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trg Global Error Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_GLOBAL_ERROR_RESPONSE_OPERATION_COUNT = TRG_ERROR_RESPONSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgRedirectionErrorResponseImpl <em>Trg Redirection Error Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgRedirectionErrorResponseImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgRedirectionErrorResponse()
	 * @generated
	 */
	int TRG_REDIRECTION_ERROR_RESPONSE = 38;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_REDIRECTION_ERROR_RESPONSE__LOCATION = TRG_ERROR_RESPONSE__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_REDIRECTION_ERROR_RESPONSE__COMMENTS_BEFORE = TRG_ERROR_RESPONSE__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_REDIRECTION_ERROR_RESPONSE__COMMENTS_AFTER = TRG_ERROR_RESPONSE__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Error Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_REDIRECTION_ERROR_RESPONSE__ERROR_KIND = TRG_ERROR_RESPONSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trg Redirection Error Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_REDIRECTION_ERROR_RESPONSE_FEATURE_COUNT = TRG_ERROR_RESPONSE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trg Redirection Error Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_REDIRECTION_ERROR_RESPONSE_OPERATION_COUNT = TRG_ERROR_RESPONSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgServerErrorResponseImpl <em>Trg Server Error Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgServerErrorResponseImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgServerErrorResponse()
	 * @generated
	 */
	int TRG_SERVER_ERROR_RESPONSE = 39;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SERVER_ERROR_RESPONSE__LOCATION = TRG_ERROR_RESPONSE__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SERVER_ERROR_RESPONSE__COMMENTS_BEFORE = TRG_ERROR_RESPONSE__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SERVER_ERROR_RESPONSE__COMMENTS_AFTER = TRG_ERROR_RESPONSE__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Error Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SERVER_ERROR_RESPONSE__ERROR_KIND = TRG_ERROR_RESPONSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trg Server Error Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SERVER_ERROR_RESPONSE_FEATURE_COUNT = TRG_ERROR_RESPONSE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trg Server Error Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SERVER_ERROR_RESPONSE_OPERATION_COUNT = TRG_ERROR_RESPONSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgServiceImpl <em>Trg Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgServiceImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgService()
	 * @generated
	 */
	int TRG_SERVICE = 41;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SERVICE__LOCATION = TRG_LOCATED_ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SERVICE__COMMENTS_BEFORE = TRG_LOCATED_ELEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SERVICE__COMMENTS_AFTER = TRG_LOCATED_ELEMENT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SERVICE__NAME = TRG_LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SERVICE__DECLARATIONS = TRG_LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sessions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SERVICE__SESSIONS = TRG_LOCATED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Trg Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SERVICE_FEATURE_COUNT = TRG_LOCATED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Trg Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SERVICE_OPERATION_COUNT = TRG_LOCATED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgSessionImpl <em>Trg Session</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgSessionImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgSession()
	 * @generated
	 */
	int TRG_SESSION = 42;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SESSION__LOCATION = TRG_LOCATED_ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SESSION__COMMENTS_BEFORE = TRG_LOCATED_ELEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SESSION__COMMENTS_AFTER = TRG_LOCATED_ELEMENT__COMMENTS_AFTER;

	/**
	 * The number of structural features of the '<em>Trg Session</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SESSION_FEATURE_COUNT = TRG_LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Trg Session</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SESSION_OPERATION_COUNT = TRG_LOCATED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgRegistrationImpl <em>Trg Registration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgRegistrationImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgRegistration()
	 * @generated
	 */
	int TRG_REGISTRATION = 43;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_REGISTRATION__LOCATION = TRG_SESSION__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_REGISTRATION__COMMENTS_BEFORE = TRG_SESSION__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_REGISTRATION__COMMENTS_AFTER = TRG_SESSION__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_REGISTRATION__DECLARATIONS = TRG_SESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sessions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_REGISTRATION__SESSIONS = TRG_SESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Trg Registration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_REGISTRATION_FEATURE_COUNT = TRG_SESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Trg Registration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_REGISTRATION_OPERATION_COUNT = TRG_SESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgDialogImpl <em>Trg Dialog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgDialogImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgDialog()
	 * @generated
	 */
	int TRG_DIALOG = 44;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_DIALOG__LOCATION = TRG_SESSION__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_DIALOG__COMMENTS_BEFORE = TRG_SESSION__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_DIALOG__COMMENTS_AFTER = TRG_SESSION__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_DIALOG__DECLARATIONS = TRG_SESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_DIALOG__METHODS = TRG_SESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Trg Dialog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_DIALOG_FEATURE_COUNT = TRG_SESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Trg Dialog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_DIALOG_OPERATION_COUNT = TRG_SESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgEventImpl <em>Trg Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgEventImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgEvent()
	 * @generated
	 */
	int TRG_EVENT = 45;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_EVENT__LOCATION = TRG_SESSION__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_EVENT__COMMENTS_BEFORE = TRG_SESSION__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_EVENT__COMMENTS_AFTER = TRG_SESSION__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Event Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_EVENT__EVENT_ID = TRG_SESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_EVENT__DECLARATIONS = TRG_SESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_EVENT__METHODS = TRG_SESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Trg Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_EVENT_FEATURE_COUNT = TRG_SESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Trg Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_EVENT_OPERATION_COUNT = TRG_SESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgMethodImpl <em>Trg Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgMethodImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgMethod()
	 * @generated
	 */
	int TRG_METHOD = 46;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_METHOD__LOCATION = TRG_SESSION__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_METHOD__COMMENTS_BEFORE = TRG_SESSION__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_METHOD__COMMENTS_AFTER = TRG_SESSION__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_METHOD__TYPE = TRG_SESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_METHOD__DIRECTION = TRG_SESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_METHOD__METHOD_NAME = TRG_SESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_METHOD__ARGUMENTS = TRG_SESSION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_METHOD__STATEMENTS = TRG_SESSION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Branches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_METHOD__BRANCHES = TRG_SESSION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Trg Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_METHOD_FEATURE_COUNT = TRG_SESSION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Trg Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_METHOD_OPERATION_COUNT = TRG_SESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgDeclarationImpl <em>Trg Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgDeclarationImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgDeclaration()
	 * @generated
	 */
	int TRG_DECLARATION = 58;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_DECLARATION__LOCATION = TRG_LOCATED_ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_DECLARATION__COMMENTS_BEFORE = TRG_LOCATED_ELEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_DECLARATION__COMMENTS_AFTER = TRG_LOCATED_ELEMENT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_DECLARATION__NAME = TRG_LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trg Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_DECLARATION_FEATURE_COUNT = TRG_LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trg Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_DECLARATION_OPERATION_COUNT = TRG_LOCATED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgVariableDeclarationImpl <em>Trg Variable Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgVariableDeclarationImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgVariableDeclaration()
	 * @generated
	 */
	int TRG_VARIABLE_DECLARATION = 59;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_VARIABLE_DECLARATION__LOCATION = TRG_DECLARATION__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_VARIABLE_DECLARATION__COMMENTS_BEFORE = TRG_DECLARATION__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_VARIABLE_DECLARATION__COMMENTS_AFTER = TRG_DECLARATION__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_VARIABLE_DECLARATION__NAME = TRG_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_VARIABLE_DECLARATION__TYPE = TRG_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Init Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_VARIABLE_DECLARATION__INIT_EXP = TRG_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Trg Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_VARIABLE_DECLARATION_FEATURE_COUNT = TRG_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Trg Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_VARIABLE_DECLARATION_OPERATION_COUNT = TRG_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgArgumentImpl <em>Trg Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgArgumentImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgArgument()
	 * @generated
	 */
	int TRG_ARGUMENT = 47;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_ARGUMENT__LOCATION = TRG_VARIABLE_DECLARATION__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_ARGUMENT__COMMENTS_BEFORE = TRG_VARIABLE_DECLARATION__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_ARGUMENT__COMMENTS_AFTER = TRG_VARIABLE_DECLARATION__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_ARGUMENT__NAME = TRG_VARIABLE_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_ARGUMENT__TYPE = TRG_VARIABLE_DECLARATION__TYPE;

	/**
	 * The feature id for the '<em><b>Init Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_ARGUMENT__INIT_EXP = TRG_VARIABLE_DECLARATION__INIT_EXP;

	/**
	 * The number of structural features of the '<em>Trg Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_ARGUMENT_FEATURE_COUNT = TRG_VARIABLE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Trg Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_ARGUMENT_OPERATION_COUNT = TRG_VARIABLE_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgMethodNameImpl <em>Trg Method Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgMethodNameImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgMethodName()
	 * @generated
	 */
	int TRG_METHOD_NAME = 48;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_METHOD_NAME__LOCATION = TRG_LOCATED_ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_METHOD_NAME__COMMENTS_BEFORE = TRG_LOCATED_ELEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_METHOD_NAME__COMMENTS_AFTER = TRG_LOCATED_ELEMENT__COMMENTS_AFTER;

	/**
	 * The number of structural features of the '<em>Trg Method Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_METHOD_NAME_FEATURE_COUNT = TRG_LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Trg Method Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_METHOD_NAME_OPERATION_COUNT = TRG_LOCATED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgSIPMethodNameImpl <em>Trg SIP Method Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgSIPMethodNameImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgSIPMethodName()
	 * @generated
	 */
	int TRG_SIP_METHOD_NAME = 49;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SIP_METHOD_NAME__LOCATION = TRG_METHOD_NAME__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SIP_METHOD_NAME__COMMENTS_BEFORE = TRG_METHOD_NAME__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SIP_METHOD_NAME__COMMENTS_AFTER = TRG_METHOD_NAME__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SIP_METHOD_NAME__NAME = TRG_METHOD_NAME_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trg SIP Method Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SIP_METHOD_NAME_FEATURE_COUNT = TRG_METHOD_NAME_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trg SIP Method Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SIP_METHOD_NAME_OPERATION_COUNT = TRG_METHOD_NAME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgControlMethodNameImpl <em>Trg Control Method Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgControlMethodNameImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgControlMethodName()
	 * @generated
	 */
	int TRG_CONTROL_METHOD_NAME = 50;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_CONTROL_METHOD_NAME__LOCATION = TRG_METHOD_NAME__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_CONTROL_METHOD_NAME__COMMENTS_BEFORE = TRG_METHOD_NAME__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_CONTROL_METHOD_NAME__COMMENTS_AFTER = TRG_METHOD_NAME__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_CONTROL_METHOD_NAME__NAME = TRG_METHOD_NAME_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trg Control Method Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_CONTROL_METHOD_NAME_FEATURE_COUNT = TRG_METHOD_NAME_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trg Control Method Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_CONTROL_METHOD_NAME_OPERATION_COUNT = TRG_METHOD_NAME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgBranchImpl <em>Trg Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgBranchImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgBranch()
	 * @generated
	 */
	int TRG_BRANCH = 51;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_BRANCH__LOCATION = TRG_LOCATED_ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_BRANCH__COMMENTS_BEFORE = TRG_LOCATED_ELEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_BRANCH__COMMENTS_AFTER = TRG_LOCATED_ELEMENT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_BRANCH__STATEMENTS = TRG_LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trg Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_BRANCH_FEATURE_COUNT = TRG_LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trg Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_BRANCH_OPERATION_COUNT = TRG_LOCATED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgDefaultBranchImpl <em>Trg Default Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgDefaultBranchImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgDefaultBranch()
	 * @generated
	 */
	int TRG_DEFAULT_BRANCH = 52;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_DEFAULT_BRANCH__LOCATION = TRG_BRANCH__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_DEFAULT_BRANCH__COMMENTS_BEFORE = TRG_BRANCH__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_DEFAULT_BRANCH__COMMENTS_AFTER = TRG_BRANCH__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_DEFAULT_BRANCH__STATEMENTS = TRG_BRANCH__STATEMENTS;

	/**
	 * The number of structural features of the '<em>Trg Default Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_DEFAULT_BRANCH_FEATURE_COUNT = TRG_BRANCH_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Trg Default Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_DEFAULT_BRANCH_OPERATION_COUNT = TRG_BRANCH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgNamedBranchImpl <em>Trg Named Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgNamedBranchImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgNamedBranch()
	 * @generated
	 */
	int TRG_NAMED_BRANCH = 53;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_NAMED_BRANCH__LOCATION = TRG_BRANCH__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_NAMED_BRANCH__COMMENTS_BEFORE = TRG_BRANCH__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_NAMED_BRANCH__COMMENTS_AFTER = TRG_BRANCH__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_NAMED_BRANCH__STATEMENTS = TRG_BRANCH__STATEMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_NAMED_BRANCH__NAME = TRG_BRANCH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trg Named Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_NAMED_BRANCH_FEATURE_COUNT = TRG_BRANCH_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trg Named Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_NAMED_BRANCH_OPERATION_COUNT = TRG_BRANCH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgTypeExpressionImpl <em>Trg Type Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgTypeExpressionImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgTypeExpression()
	 * @generated
	 */
	int TRG_TYPE_EXPRESSION = 54;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_TYPE_EXPRESSION__LOCATION = TRG_LOCATED_ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_TYPE_EXPRESSION__COMMENTS_BEFORE = TRG_LOCATED_ELEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_TYPE_EXPRESSION__COMMENTS_AFTER = TRG_LOCATED_ELEMENT__COMMENTS_AFTER;

	/**
	 * The number of structural features of the '<em>Trg Type Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_TYPE_EXPRESSION_FEATURE_COUNT = TRG_LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Trg Type Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_TYPE_EXPRESSION_OPERATION_COUNT = TRG_LOCATED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgSimpleTypeImpl <em>Trg Simple Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgSimpleTypeImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgSimpleType()
	 * @generated
	 */
	int TRG_SIMPLE_TYPE = 55;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SIMPLE_TYPE__LOCATION = TRG_TYPE_EXPRESSION__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SIMPLE_TYPE__COMMENTS_BEFORE = TRG_TYPE_EXPRESSION__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SIMPLE_TYPE__COMMENTS_AFTER = TRG_TYPE_EXPRESSION__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SIMPLE_TYPE__TYPE = TRG_TYPE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trg Simple Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SIMPLE_TYPE_FEATURE_COUNT = TRG_TYPE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trg Simple Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SIMPLE_TYPE_OPERATION_COUNT = TRG_TYPE_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgSequenceTypeImpl <em>Trg Sequence Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgSequenceTypeImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgSequenceType()
	 * @generated
	 */
	int TRG_SEQUENCE_TYPE = 56;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SEQUENCE_TYPE__LOCATION = TRG_TYPE_EXPRESSION__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SEQUENCE_TYPE__COMMENTS_BEFORE = TRG_TYPE_EXPRESSION__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SEQUENCE_TYPE__COMMENTS_AFTER = TRG_TYPE_EXPRESSION__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SEQUENCE_TYPE__MODIFIER = TRG_TYPE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SEQUENCE_TYPE__TYPE = TRG_TYPE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SEQUENCE_TYPE__SIZE = TRG_TYPE_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Trg Sequence Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SEQUENCE_TYPE_FEATURE_COUNT = TRG_TYPE_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Trg Sequence Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SEQUENCE_TYPE_OPERATION_COUNT = TRG_TYPE_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgDefinedTypeImpl <em>Trg Defined Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgDefinedTypeImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgDefinedType()
	 * @generated
	 */
	int TRG_DEFINED_TYPE = 57;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_DEFINED_TYPE__LOCATION = TRG_TYPE_EXPRESSION__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_DEFINED_TYPE__COMMENTS_BEFORE = TRG_TYPE_EXPRESSION__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_DEFINED_TYPE__COMMENTS_AFTER = TRG_TYPE_EXPRESSION__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_DEFINED_TYPE__TYPE_NAME = TRG_TYPE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trg Defined Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_DEFINED_TYPE_FEATURE_COUNT = TRG_TYPE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trg Defined Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_DEFINED_TYPE_OPERATION_COUNT = TRG_TYPE_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgFunctionDeclarationImpl <em>Trg Function Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgFunctionDeclarationImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgFunctionDeclaration()
	 * @generated
	 */
	int TRG_FUNCTION_DECLARATION = 60;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_FUNCTION_DECLARATION__LOCATION = TRG_DECLARATION__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_FUNCTION_DECLARATION__COMMENTS_BEFORE = TRG_DECLARATION__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_FUNCTION_DECLARATION__COMMENTS_AFTER = TRG_DECLARATION__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_FUNCTION_DECLARATION__NAME = TRG_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_FUNCTION_DECLARATION__RETURN_TYPE = TRG_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_FUNCTION_DECLARATION__ARGUMENTS = TRG_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Trg Function Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_FUNCTION_DECLARATION_FEATURE_COUNT = TRG_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Trg Function Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_FUNCTION_DECLARATION_OPERATION_COUNT = TRG_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgRemoteFunctionDeclarationImpl <em>Trg Remote Function Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgRemoteFunctionDeclarationImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgRemoteFunctionDeclaration()
	 * @generated
	 */
	int TRG_REMOTE_FUNCTION_DECLARATION = 61;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_REMOTE_FUNCTION_DECLARATION__LOCATION = TRG_FUNCTION_DECLARATION__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_REMOTE_FUNCTION_DECLARATION__COMMENTS_BEFORE = TRG_FUNCTION_DECLARATION__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_REMOTE_FUNCTION_DECLARATION__COMMENTS_AFTER = TRG_FUNCTION_DECLARATION__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_REMOTE_FUNCTION_DECLARATION__NAME = TRG_FUNCTION_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_REMOTE_FUNCTION_DECLARATION__RETURN_TYPE = TRG_FUNCTION_DECLARATION__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_REMOTE_FUNCTION_DECLARATION__ARGUMENTS = TRG_FUNCTION_DECLARATION__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Function Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_REMOTE_FUNCTION_DECLARATION__FUNCTION_LOCATION = TRG_FUNCTION_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trg Remote Function Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_REMOTE_FUNCTION_DECLARATION_FEATURE_COUNT = TRG_FUNCTION_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trg Remote Function Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_REMOTE_FUNCTION_DECLARATION_OPERATION_COUNT = TRG_FUNCTION_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgLocalFunctionDeclarationImpl <em>Trg Local Function Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgLocalFunctionDeclarationImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgLocalFunctionDeclaration()
	 * @generated
	 */
	int TRG_LOCAL_FUNCTION_DECLARATION = 62;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_LOCAL_FUNCTION_DECLARATION__LOCATION = TRG_FUNCTION_DECLARATION__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_LOCAL_FUNCTION_DECLARATION__COMMENTS_BEFORE = TRG_FUNCTION_DECLARATION__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_LOCAL_FUNCTION_DECLARATION__COMMENTS_AFTER = TRG_FUNCTION_DECLARATION__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_LOCAL_FUNCTION_DECLARATION__NAME = TRG_FUNCTION_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_LOCAL_FUNCTION_DECLARATION__RETURN_TYPE = TRG_FUNCTION_DECLARATION__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_LOCAL_FUNCTION_DECLARATION__ARGUMENTS = TRG_FUNCTION_DECLARATION__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_LOCAL_FUNCTION_DECLARATION__STATEMENTS = TRG_FUNCTION_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trg Local Function Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_LOCAL_FUNCTION_DECLARATION_FEATURE_COUNT = TRG_FUNCTION_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trg Local Function Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_LOCAL_FUNCTION_DECLARATION_OPERATION_COUNT = TRG_FUNCTION_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgStructureDeclarationImpl <em>Trg Structure Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgStructureDeclarationImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgStructureDeclaration()
	 * @generated
	 */
	int TRG_STRUCTURE_DECLARATION = 63;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_STRUCTURE_DECLARATION__LOCATION = TRG_DECLARATION__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_STRUCTURE_DECLARATION__COMMENTS_BEFORE = TRG_DECLARATION__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_STRUCTURE_DECLARATION__COMMENTS_AFTER = TRG_DECLARATION__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_STRUCTURE_DECLARATION__NAME = TRG_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_STRUCTURE_DECLARATION__PROPERTIES = TRG_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trg Structure Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_STRUCTURE_DECLARATION_FEATURE_COUNT = TRG_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trg Structure Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_STRUCTURE_DECLARATION_OPERATION_COUNT = TRG_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgFunctionCallImpl <em>Trg Function Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgFunctionCallImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgFunctionCall()
	 * @generated
	 */
	int TRG_FUNCTION_CALL = 64;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_FUNCTION_CALL__LOCATION = TRG_LOCATED_ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_FUNCTION_CALL__COMMENTS_BEFORE = TRG_LOCATED_ELEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_FUNCTION_CALL__COMMENTS_AFTER = TRG_LOCATED_ELEMENT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_FUNCTION_CALL__FUNCTION = TRG_LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_FUNCTION_CALL__PARAMETERS = TRG_LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Trg Function Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_FUNCTION_CALL_FEATURE_COUNT = TRG_LOCATED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Trg Function Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_FUNCTION_CALL_OPERATION_COUNT = TRG_LOCATED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgStatementImpl <em>Trg Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgStatementImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgStatement()
	 * @generated
	 */
	int TRG_STATEMENT = 65;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_STATEMENT__LOCATION = TRG_LOCATED_ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_STATEMENT__COMMENTS_BEFORE = TRG_LOCATED_ELEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_STATEMENT__COMMENTS_AFTER = TRG_LOCATED_ELEMENT__COMMENTS_AFTER;

	/**
	 * The number of structural features of the '<em>Trg Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_STATEMENT_FEATURE_COUNT = TRG_LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Trg Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_STATEMENT_OPERATION_COUNT = TRG_LOCATED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgCompoundStatImpl <em>Trg Compound Stat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgCompoundStatImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgCompoundStat()
	 * @generated
	 */
	int TRG_COMPOUND_STAT = 66;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_COMPOUND_STAT__LOCATION = TRG_STATEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_COMPOUND_STAT__COMMENTS_BEFORE = TRG_STATEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_COMPOUND_STAT__COMMENTS_AFTER = TRG_STATEMENT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_COMPOUND_STAT__STATEMENTS = TRG_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trg Compound Stat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_COMPOUND_STAT_FEATURE_COUNT = TRG_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trg Compound Stat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_COMPOUND_STAT_OPERATION_COUNT = TRG_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgSetStatImpl <em>Trg Set Stat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgSetStatImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgSetStat()
	 * @generated
	 */
	int TRG_SET_STAT = 67;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SET_STAT__LOCATION = TRG_STATEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SET_STAT__COMMENTS_BEFORE = TRG_STATEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SET_STAT__COMMENTS_AFTER = TRG_STATEMENT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SET_STAT__TARGET = TRG_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Set Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SET_STAT__SET_VALUE = TRG_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Trg Set Stat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SET_STAT_FEATURE_COUNT = TRG_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Trg Set Stat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SET_STAT_OPERATION_COUNT = TRG_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgDeclarationStatImpl <em>Trg Declaration Stat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgDeclarationStatImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgDeclarationStat()
	 * @generated
	 */
	int TRG_DECLARATION_STAT = 68;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_DECLARATION_STAT__LOCATION = TRG_STATEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_DECLARATION_STAT__COMMENTS_BEFORE = TRG_STATEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_DECLARATION_STAT__COMMENTS_AFTER = TRG_STATEMENT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_DECLARATION_STAT__DECLARATION = TRG_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trg Declaration Stat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_DECLARATION_STAT_FEATURE_COUNT = TRG_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trg Declaration Stat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_DECLARATION_STAT_OPERATION_COUNT = TRG_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgReturnStatImpl <em>Trg Return Stat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgReturnStatImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgReturnStat()
	 * @generated
	 */
	int TRG_RETURN_STAT = 69;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_RETURN_STAT__LOCATION = TRG_STATEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_RETURN_STAT__COMMENTS_BEFORE = TRG_STATEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_RETURN_STAT__COMMENTS_AFTER = TRG_STATEMENT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Returned Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_RETURN_STAT__RETURNED_VALUE = TRG_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Branch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_RETURN_STAT__BRANCH = TRG_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Trg Return Stat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_RETURN_STAT_FEATURE_COUNT = TRG_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Trg Return Stat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_RETURN_STAT_OPERATION_COUNT = TRG_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgIfStatImpl <em>Trg If Stat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgIfStatImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgIfStat()
	 * @generated
	 */
	int TRG_IF_STAT = 70;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_IF_STAT__LOCATION = TRG_STATEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_IF_STAT__COMMENTS_BEFORE = TRG_STATEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_IF_STAT__COMMENTS_AFTER = TRG_STATEMENT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_IF_STAT__CONDITION = TRG_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Then Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_IF_STAT__THEN_STATEMENTS = TRG_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_IF_STAT__ELSE_STATEMENTS = TRG_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Trg If Stat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_IF_STAT_FEATURE_COUNT = TRG_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Trg If Stat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_IF_STAT_OPERATION_COUNT = TRG_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgWhenStatImpl <em>Trg When Stat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgWhenStatImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgWhenStat()
	 * @generated
	 */
	int TRG_WHEN_STAT = 71;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_WHEN_STAT__LOCATION = TRG_STATEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_WHEN_STAT__COMMENTS_BEFORE = TRG_STATEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_WHEN_STAT__COMMENTS_AFTER = TRG_STATEMENT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Id Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_WHEN_STAT__ID_EXP = TRG_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>When Headers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_WHEN_STAT__WHEN_HEADERS = TRG_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_WHEN_STAT__STATEMENTS = TRG_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Else Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_WHEN_STAT__ELSE_STATEMENTS = TRG_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Trg When Stat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_WHEN_STAT_FEATURE_COUNT = TRG_STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Trg When Stat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_WHEN_STAT_OPERATION_COUNT = TRG_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgForeachStatImpl <em>Trg Foreach Stat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgForeachStatImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgForeachStat()
	 * @generated
	 */
	int TRG_FOREACH_STAT = 72;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_FOREACH_STAT__LOCATION = TRG_STATEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_FOREACH_STAT__COMMENTS_BEFORE = TRG_STATEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_FOREACH_STAT__COMMENTS_AFTER = TRG_STATEMENT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Iterator Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_FOREACH_STAT__ITERATOR_NAME = TRG_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sequence Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_FOREACH_STAT__SEQUENCE_EXP = TRG_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_FOREACH_STAT__STATEMENTS = TRG_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Trg Foreach Stat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_FOREACH_STAT_FEATURE_COUNT = TRG_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Trg Foreach Stat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_FOREACH_STAT_OPERATION_COUNT = TRG_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgSelectStatImpl <em>Trg Select Stat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgSelectStatImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgSelectStat()
	 * @generated
	 */
	int TRG_SELECT_STAT = 73;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SELECT_STAT__LOCATION = TRG_STATEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SELECT_STAT__COMMENTS_BEFORE = TRG_STATEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SELECT_STAT__COMMENTS_AFTER = TRG_STATEMENT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Matched Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SELECT_STAT__MATCHED_EXP = TRG_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Select Cases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SELECT_STAT__SELECT_CASES = TRG_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Select Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SELECT_STAT__SELECT_DEFAULT = TRG_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Trg Select Stat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SELECT_STAT_FEATURE_COUNT = TRG_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Trg Select Stat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SELECT_STAT_OPERATION_COUNT = TRG_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgFunctionCallStatImpl <em>Trg Function Call Stat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgFunctionCallStatImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgFunctionCallStat()
	 * @generated
	 */
	int TRG_FUNCTION_CALL_STAT = 74;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_FUNCTION_CALL_STAT__LOCATION = TRG_STATEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_FUNCTION_CALL_STAT__COMMENTS_BEFORE = TRG_STATEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_FUNCTION_CALL_STAT__COMMENTS_AFTER = TRG_STATEMENT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Function Call</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_FUNCTION_CALL_STAT__FUNCTION_CALL = TRG_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trg Function Call Stat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_FUNCTION_CALL_STAT_FEATURE_COUNT = TRG_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trg Function Call Stat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_FUNCTION_CALL_STAT_OPERATION_COUNT = TRG_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgContinueStatImpl <em>Trg Continue Stat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgContinueStatImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgContinueStat()
	 * @generated
	 */
	int TRG_CONTINUE_STAT = 75;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_CONTINUE_STAT__LOCATION = TRG_STATEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_CONTINUE_STAT__COMMENTS_BEFORE = TRG_STATEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_CONTINUE_STAT__COMMENTS_AFTER = TRG_STATEMENT__COMMENTS_AFTER;

	/**
	 * The number of structural features of the '<em>Trg Continue Stat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_CONTINUE_STAT_FEATURE_COUNT = TRG_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Trg Continue Stat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_CONTINUE_STAT_OPERATION_COUNT = TRG_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgBreakStatImpl <em>Trg Break Stat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgBreakStatImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgBreakStat()
	 * @generated
	 */
	int TRG_BREAK_STAT = 76;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_BREAK_STAT__LOCATION = TRG_STATEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_BREAK_STAT__COMMENTS_BEFORE = TRG_STATEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_BREAK_STAT__COMMENTS_AFTER = TRG_STATEMENT__COMMENTS_AFTER;

	/**
	 * The number of structural features of the '<em>Trg Break Stat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_BREAK_STAT_FEATURE_COUNT = TRG_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Trg Break Stat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_BREAK_STAT_OPERATION_COUNT = TRG_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgPushStatImpl <em>Trg Push Stat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgPushStatImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgPushStat()
	 * @generated
	 */
	int TRG_PUSH_STAT = 77;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_PUSH_STAT__LOCATION = TRG_STATEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_PUSH_STAT__COMMENTS_BEFORE = TRG_STATEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_PUSH_STAT__COMMENTS_AFTER = TRG_STATEMENT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_PUSH_STAT__TARGET = TRG_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pushed Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_PUSH_STAT__PUSHED_VALUE = TRG_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Trg Push Stat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_PUSH_STAT_FEATURE_COUNT = TRG_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Trg Push Stat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_PUSH_STAT_OPERATION_COUNT = TRG_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgWhenHeaderImpl <em>Trg When Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgWhenHeaderImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgWhenHeader()
	 * @generated
	 */
	int TRG_WHEN_HEADER = 78;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_WHEN_HEADER__LOCATION = TRG_VARIABLE_DECLARATION__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_WHEN_HEADER__COMMENTS_BEFORE = TRG_VARIABLE_DECLARATION__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_WHEN_HEADER__COMMENTS_AFTER = TRG_VARIABLE_DECLARATION__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_WHEN_HEADER__NAME = TRG_VARIABLE_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_WHEN_HEADER__TYPE = TRG_VARIABLE_DECLARATION__TYPE;

	/**
	 * The feature id for the '<em><b>Init Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_WHEN_HEADER__INIT_EXP = TRG_VARIABLE_DECLARATION__INIT_EXP;

	/**
	 * The feature id for the '<em><b>Header Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_WHEN_HEADER__HEADER_ID = TRG_VARIABLE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_WHEN_HEADER__VALUE = TRG_VARIABLE_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Trg When Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_WHEN_HEADER_FEATURE_COUNT = TRG_VARIABLE_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Trg When Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_WHEN_HEADER_OPERATION_COUNT = TRG_VARIABLE_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgSelectMemberImpl <em>Trg Select Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgSelectMemberImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgSelectMember()
	 * @generated
	 */
	int TRG_SELECT_MEMBER = 79;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SELECT_MEMBER__LOCATION = TRG_LOCATED_ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SELECT_MEMBER__COMMENTS_BEFORE = TRG_LOCATED_ELEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SELECT_MEMBER__COMMENTS_AFTER = TRG_LOCATED_ELEMENT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SELECT_MEMBER__STATEMENTS = TRG_LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trg Select Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SELECT_MEMBER_FEATURE_COUNT = TRG_LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trg Select Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SELECT_MEMBER_OPERATION_COUNT = TRG_LOCATED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgSelectDefaultImpl <em>Trg Select Default</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgSelectDefaultImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgSelectDefault()
	 * @generated
	 */
	int TRG_SELECT_DEFAULT = 80;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SELECT_DEFAULT__LOCATION = TRG_SELECT_MEMBER__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SELECT_DEFAULT__COMMENTS_BEFORE = TRG_SELECT_MEMBER__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SELECT_DEFAULT__COMMENTS_AFTER = TRG_SELECT_MEMBER__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SELECT_DEFAULT__STATEMENTS = TRG_SELECT_MEMBER__STATEMENTS;

	/**
	 * The number of structural features of the '<em>Trg Select Default</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SELECT_DEFAULT_FEATURE_COUNT = TRG_SELECT_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Trg Select Default</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SELECT_DEFAULT_OPERATION_COUNT = TRG_SELECT_MEMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgSelectCaseImpl <em>Trg Select Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgSelectCaseImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgSelectCase()
	 * @generated
	 */
	int TRG_SELECT_CASE = 81;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SELECT_CASE__LOCATION = TRG_SELECT_MEMBER__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SELECT_CASE__COMMENTS_BEFORE = TRG_SELECT_MEMBER__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SELECT_CASE__COMMENTS_AFTER = TRG_SELECT_MEMBER__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SELECT_CASE__STATEMENTS = TRG_SELECT_MEMBER__STATEMENTS;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SELECT_CASE__VALUES = TRG_SELECT_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trg Select Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SELECT_CASE_FEATURE_COUNT = TRG_SELECT_MEMBER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trg Select Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SELECT_CASE_OPERATION_COUNT = TRG_SELECT_MEMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgExpressionImpl <em>Trg Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgExpressionImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgExpression()
	 * @generated
	 */
	int TRG_EXPRESSION = 82;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_EXPRESSION__LOCATION = TRG_LOCATED_ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_EXPRESSION__COMMENTS_BEFORE = TRG_LOCATED_ELEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_EXPRESSION__COMMENTS_AFTER = TRG_LOCATED_ELEMENT__COMMENTS_AFTER;

	/**
	 * The number of structural features of the '<em>Trg Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_EXPRESSION_FEATURE_COUNT = TRG_LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Trg Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_EXPRESSION_OPERATION_COUNT = TRG_LOCATED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgConstantExpImpl <em>Trg Constant Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgConstantExpImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgConstantExp()
	 * @generated
	 */
	int TRG_CONSTANT_EXP = 83;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_CONSTANT_EXP__LOCATION = TRG_EXPRESSION__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_CONSTANT_EXP__COMMENTS_BEFORE = TRG_EXPRESSION__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_CONSTANT_EXP__COMMENTS_AFTER = TRG_EXPRESSION__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_CONSTANT_EXP__VALUE = TRG_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trg Constant Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_CONSTANT_EXP_FEATURE_COUNT = TRG_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trg Constant Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_CONSTANT_EXP_OPERATION_COUNT = TRG_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgOperatorExpImpl <em>Trg Operator Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgOperatorExpImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgOperatorExp()
	 * @generated
	 */
	int TRG_OPERATOR_EXP = 84;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_OPERATOR_EXP__LOCATION = TRG_EXPRESSION__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_OPERATOR_EXP__COMMENTS_BEFORE = TRG_EXPRESSION__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_OPERATOR_EXP__COMMENTS_AFTER = TRG_EXPRESSION__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Op Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_OPERATOR_EXP__OP_NAME = TRG_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_OPERATOR_EXP__LEFT_EXP = TRG_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_OPERATOR_EXP__RIGHT_EXP = TRG_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Trg Operator Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_OPERATOR_EXP_FEATURE_COUNT = TRG_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Trg Operator Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_OPERATOR_EXP_OPERATION_COUNT = TRG_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgForwardExpImpl <em>Trg Forward Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgForwardExpImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgForwardExp()
	 * @generated
	 */
	int TRG_FORWARD_EXP = 85;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_FORWARD_EXP__LOCATION = TRG_EXPRESSION__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_FORWARD_EXP__COMMENTS_BEFORE = TRG_EXPRESSION__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_FORWARD_EXP__COMMENTS_AFTER = TRG_EXPRESSION__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Is Parallel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_FORWARD_EXP__IS_PARALLEL = TRG_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_FORWARD_EXP__EXP = TRG_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Trg Forward Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_FORWARD_EXP_FEATURE_COUNT = TRG_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Trg Forward Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_FORWARD_EXP_OPERATION_COUNT = TRG_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgWithExpImpl <em>Trg With Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgWithExpImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgWithExp()
	 * @generated
	 */
	int TRG_WITH_EXP = 86;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_WITH_EXP__LOCATION = TRG_EXPRESSION__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_WITH_EXP__COMMENTS_BEFORE = TRG_EXPRESSION__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_WITH_EXP__COMMENTS_AFTER = TRG_EXPRESSION__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_WITH_EXP__EXP = TRG_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Msg Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_WITH_EXP__MSG_FIELDS = TRG_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Trg With Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_WITH_EXP_FEATURE_COUNT = TRG_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Trg With Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_WITH_EXP_OPERATION_COUNT = TRG_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgBlockExpImpl <em>Trg Block Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgBlockExpImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgBlockExp()
	 * @generated
	 */
	int TRG_BLOCK_EXP = 87;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_BLOCK_EXP__LOCATION = TRG_EXPRESSION__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_BLOCK_EXP__COMMENTS_BEFORE = TRG_EXPRESSION__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_BLOCK_EXP__COMMENTS_AFTER = TRG_EXPRESSION__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_BLOCK_EXP__EXP = TRG_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trg Block Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_BLOCK_EXP_FEATURE_COUNT = TRG_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trg Block Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_BLOCK_EXP_OPERATION_COUNT = TRG_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgReasonExpImpl <em>Trg Reason Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgReasonExpImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgReasonExp()
	 * @generated
	 */
	int TRG_REASON_EXP = 88;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_REASON_EXP__LOCATION = TRG_EXPRESSION__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_REASON_EXP__COMMENTS_BEFORE = TRG_EXPRESSION__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_REASON_EXP__COMMENTS_AFTER = TRG_EXPRESSION__COMMENTS_AFTER;

	/**
	 * The number of structural features of the '<em>Trg Reason Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_REASON_EXP_FEATURE_COUNT = TRG_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Trg Reason Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_REASON_EXP_OPERATION_COUNT = TRG_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgBODYExpImpl <em>Trg BODY Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgBODYExpImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgBODYExp()
	 * @generated
	 */
	int TRG_BODY_EXP = 89;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_BODY_EXP__LOCATION = TRG_EXPRESSION__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_BODY_EXP__COMMENTS_BEFORE = TRG_EXPRESSION__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_BODY_EXP__COMMENTS_AFTER = TRG_EXPRESSION__COMMENTS_AFTER;

	/**
	 * The number of structural features of the '<em>Trg BODY Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_BODY_EXP_FEATURE_COUNT = TRG_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Trg BODY Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_BODY_EXP_OPERATION_COUNT = TRG_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgRequestURIExpImpl <em>Trg Request URI Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgRequestURIExpImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgRequestURIExp()
	 * @generated
	 */
	int TRG_REQUEST_URI_EXP = 90;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_REQUEST_URI_EXP__LOCATION = TRG_EXPRESSION__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_REQUEST_URI_EXP__COMMENTS_BEFORE = TRG_EXPRESSION__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_REQUEST_URI_EXP__COMMENTS_AFTER = TRG_EXPRESSION__COMMENTS_AFTER;

	/**
	 * The number of structural features of the '<em>Trg Request URI Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_REQUEST_URI_EXP_FEATURE_COUNT = TRG_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Trg Request URI Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_REQUEST_URI_EXP_OPERATION_COUNT = TRG_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgPopExpImpl <em>Trg Pop Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgPopExpImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgPopExp()
	 * @generated
	 */
	int TRG_POP_EXP = 91;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_POP_EXP__LOCATION = TRG_EXPRESSION__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_POP_EXP__COMMENTS_BEFORE = TRG_EXPRESSION__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_POP_EXP__COMMENTS_AFTER = TRG_EXPRESSION__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_POP_EXP__SOURCE = TRG_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trg Pop Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_POP_EXP_FEATURE_COUNT = TRG_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trg Pop Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_POP_EXP_OPERATION_COUNT = TRG_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgFunctionCallExpImpl <em>Trg Function Call Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgFunctionCallExpImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgFunctionCallExp()
	 * @generated
	 */
	int TRG_FUNCTION_CALL_EXP = 92;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_FUNCTION_CALL_EXP__LOCATION = TRG_EXPRESSION__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_FUNCTION_CALL_EXP__COMMENTS_BEFORE = TRG_EXPRESSION__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_FUNCTION_CALL_EXP__COMMENTS_AFTER = TRG_EXPRESSION__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Function Call</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_FUNCTION_CALL_EXP__FUNCTION_CALL = TRG_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trg Function Call Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_FUNCTION_CALL_EXP_FEATURE_COUNT = TRG_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trg Function Call Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_FUNCTION_CALL_EXP_OPERATION_COUNT = TRG_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgPlaceImpl <em>Trg Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgPlaceImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgPlace()
	 * @generated
	 */
	int TRG_PLACE = 93;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_PLACE__LOCATION = TRG_EXPRESSION__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_PLACE__COMMENTS_BEFORE = TRG_EXPRESSION__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_PLACE__COMMENTS_AFTER = TRG_EXPRESSION__COMMENTS_AFTER;

	/**
	 * The number of structural features of the '<em>Trg Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_PLACE_FEATURE_COUNT = TRG_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Trg Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_PLACE_OPERATION_COUNT = TRG_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgSIPHeaderPlaceImpl <em>Trg SIP Header Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgSIPHeaderPlaceImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgSIPHeaderPlace()
	 * @generated
	 */
	int TRG_SIP_HEADER_PLACE = 94;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SIP_HEADER_PLACE__LOCATION = TRG_PLACE__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SIP_HEADER_PLACE__COMMENTS_BEFORE = TRG_PLACE__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SIP_HEADER_PLACE__COMMENTS_AFTER = TRG_PLACE__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SIP_HEADER_PLACE__HEADER = TRG_PLACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trg SIP Header Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SIP_HEADER_PLACE_FEATURE_COUNT = TRG_PLACE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trg SIP Header Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SIP_HEADER_PLACE_OPERATION_COUNT = TRG_PLACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgVariablePlaceImpl <em>Trg Variable Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgVariablePlaceImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgVariablePlace()
	 * @generated
	 */
	int TRG_VARIABLE_PLACE = 95;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_VARIABLE_PLACE__LOCATION = TRG_PLACE__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_VARIABLE_PLACE__COMMENTS_BEFORE = TRG_PLACE__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_VARIABLE_PLACE__COMMENTS_AFTER = TRG_PLACE__COMMENTS_AFTER;

	/**
	 * The number of structural features of the '<em>Trg Variable Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_VARIABLE_PLACE_FEATURE_COUNT = TRG_PLACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Trg Variable Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_VARIABLE_PLACE_OPERATION_COUNT = TRG_PLACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgPropertyCallPlaceImpl <em>Trg Property Call Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgPropertyCallPlaceImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgPropertyCallPlace()
	 * @generated
	 */
	int TRG_PROPERTY_CALL_PLACE = 96;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_PROPERTY_CALL_PLACE__LOCATION = TRG_VARIABLE_PLACE__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_PROPERTY_CALL_PLACE__COMMENTS_BEFORE = TRG_VARIABLE_PLACE__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_PROPERTY_CALL_PLACE__COMMENTS_AFTER = TRG_VARIABLE_PLACE__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Prop Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_PROPERTY_CALL_PLACE__PROP_NAME = TRG_VARIABLE_PLACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_PROPERTY_CALL_PLACE__SOURCE = TRG_VARIABLE_PLACE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Trg Property Call Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_PROPERTY_CALL_PLACE_FEATURE_COUNT = TRG_VARIABLE_PLACE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Trg Property Call Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_PROPERTY_CALL_PLACE_OPERATION_COUNT = TRG_VARIABLE_PLACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgVariableImpl <em>Trg Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgVariableImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgVariable()
	 * @generated
	 */
	int TRG_VARIABLE = 97;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_VARIABLE__LOCATION = TRG_VARIABLE_PLACE__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_VARIABLE__COMMENTS_BEFORE = TRG_VARIABLE_PLACE__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_VARIABLE__COMMENTS_AFTER = TRG_VARIABLE_PLACE__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_VARIABLE__SOURCE = TRG_VARIABLE_PLACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trg Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_VARIABLE_FEATURE_COUNT = TRG_VARIABLE_PLACE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trg Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_VARIABLE_OPERATION_COUNT = TRG_VARIABLE_PLACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgMessageFieldImpl <em>Trg Message Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgMessageFieldImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgMessageField()
	 * @generated
	 */
	int TRG_MESSAGE_FIELD = 98;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_MESSAGE_FIELD__LOCATION = TRG_LOCATED_ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_MESSAGE_FIELD__COMMENTS_BEFORE = TRG_LOCATED_ELEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_MESSAGE_FIELD__COMMENTS_AFTER = TRG_LOCATED_ELEMENT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_MESSAGE_FIELD__EXP = TRG_LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trg Message Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_MESSAGE_FIELD_FEATURE_COUNT = TRG_LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trg Message Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_MESSAGE_FIELD_OPERATION_COUNT = TRG_LOCATED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgReasonMessageFieldImpl <em>Trg Reason Message Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgReasonMessageFieldImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgReasonMessageField()
	 * @generated
	 */
	int TRG_REASON_MESSAGE_FIELD = 99;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_REASON_MESSAGE_FIELD__LOCATION = TRG_MESSAGE_FIELD__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_REASON_MESSAGE_FIELD__COMMENTS_BEFORE = TRG_MESSAGE_FIELD__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_REASON_MESSAGE_FIELD__COMMENTS_AFTER = TRG_MESSAGE_FIELD__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_REASON_MESSAGE_FIELD__EXP = TRG_MESSAGE_FIELD__EXP;

	/**
	 * The number of structural features of the '<em>Trg Reason Message Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_REASON_MESSAGE_FIELD_FEATURE_COUNT = TRG_MESSAGE_FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Trg Reason Message Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_REASON_MESSAGE_FIELD_OPERATION_COUNT = TRG_MESSAGE_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgHeadedMessageFieldImpl <em>Trg Headed Message Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgHeadedMessageFieldImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgHeadedMessageField()
	 * @generated
	 */
	int TRG_HEADED_MESSAGE_FIELD = 100;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_HEADED_MESSAGE_FIELD__LOCATION = TRG_MESSAGE_FIELD__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_HEADED_MESSAGE_FIELD__COMMENTS_BEFORE = TRG_MESSAGE_FIELD__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_HEADED_MESSAGE_FIELD__COMMENTS_AFTER = TRG_MESSAGE_FIELD__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_HEADED_MESSAGE_FIELD__EXP = TRG_MESSAGE_FIELD__EXP;

	/**
	 * The feature id for the '<em><b>Header Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_HEADED_MESSAGE_FIELD__HEADER_ID = TRG_MESSAGE_FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trg Headed Message Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_HEADED_MESSAGE_FIELD_FEATURE_COUNT = TRG_MESSAGE_FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trg Headed Message Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_HEADED_MESSAGE_FIELD_OPERATION_COUNT = TRG_MESSAGE_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgConstantImpl <em>Trg Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgConstantImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgConstant()
	 * @generated
	 */
	int TRG_CONSTANT = 101;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_CONSTANT__LOCATION = TRG_LOCATED_ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_CONSTANT__COMMENTS_BEFORE = TRG_LOCATED_ELEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_CONSTANT__COMMENTS_AFTER = TRG_LOCATED_ELEMENT__COMMENTS_AFTER;

	/**
	 * The number of structural features of the '<em>Trg Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_CONSTANT_FEATURE_COUNT = TRG_LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Trg Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_CONSTANT_OPERATION_COUNT = TRG_LOCATED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgBooleanConstantImpl <em>Trg Boolean Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgBooleanConstantImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgBooleanConstant()
	 * @generated
	 */
	int TRG_BOOLEAN_CONSTANT = 102;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_BOOLEAN_CONSTANT__LOCATION = TRG_CONSTANT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_BOOLEAN_CONSTANT__COMMENTS_BEFORE = TRG_CONSTANT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_BOOLEAN_CONSTANT__COMMENTS_AFTER = TRG_CONSTANT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_BOOLEAN_CONSTANT__VALUE = TRG_CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trg Boolean Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_BOOLEAN_CONSTANT_FEATURE_COUNT = TRG_CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trg Boolean Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_BOOLEAN_CONSTANT_OPERATION_COUNT = TRG_CONSTANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgIntegerConstantImpl <em>Trg Integer Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgIntegerConstantImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgIntegerConstant()
	 * @generated
	 */
	int TRG_INTEGER_CONSTANT = 103;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_INTEGER_CONSTANT__LOCATION = TRG_CONSTANT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_INTEGER_CONSTANT__COMMENTS_BEFORE = TRG_CONSTANT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_INTEGER_CONSTANT__COMMENTS_AFTER = TRG_CONSTANT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_INTEGER_CONSTANT__VALUE = TRG_CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trg Integer Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_INTEGER_CONSTANT_FEATURE_COUNT = TRG_CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trg Integer Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_INTEGER_CONSTANT_OPERATION_COUNT = TRG_CONSTANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgStringConstantImpl <em>Trg String Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgStringConstantImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgStringConstant()
	 * @generated
	 */
	int TRG_STRING_CONSTANT = 104;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_STRING_CONSTANT__LOCATION = TRG_CONSTANT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_STRING_CONSTANT__COMMENTS_BEFORE = TRG_CONSTANT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_STRING_CONSTANT__COMMENTS_AFTER = TRG_CONSTANT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_STRING_CONSTANT__VALUE = TRG_CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trg String Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_STRING_CONSTANT_FEATURE_COUNT = TRG_CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trg String Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_STRING_CONSTANT_OPERATION_COUNT = TRG_CONSTANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgURIConstantImpl <em>Trg URI Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgURIConstantImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgURIConstant()
	 * @generated
	 */
	int TRG_URI_CONSTANT = 105;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_URI_CONSTANT__LOCATION = TRG_CONSTANT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_URI_CONSTANT__COMMENTS_BEFORE = TRG_CONSTANT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_URI_CONSTANT__COMMENTS_AFTER = TRG_CONSTANT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_URI_CONSTANT__URI = TRG_CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trg URI Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_URI_CONSTANT_FEATURE_COUNT = TRG_CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trg URI Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_URI_CONSTANT_OPERATION_COUNT = TRG_CONSTANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgSequenceConstantImpl <em>Trg Sequence Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgSequenceConstantImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgSequenceConstant()
	 * @generated
	 */
	int TRG_SEQUENCE_CONSTANT = 106;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SEQUENCE_CONSTANT__LOCATION = TRG_CONSTANT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SEQUENCE_CONSTANT__COMMENTS_BEFORE = TRG_CONSTANT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SEQUENCE_CONSTANT__COMMENTS_AFTER = TRG_CONSTANT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SEQUENCE_CONSTANT__VALUES = TRG_CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trg Sequence Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SEQUENCE_CONSTANT_FEATURE_COUNT = TRG_CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trg Sequence Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SEQUENCE_CONSTANT_OPERATION_COUNT = TRG_CONSTANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgResponseConstantImpl <em>Trg Response Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgResponseConstantImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgResponseConstant()
	 * @generated
	 */
	int TRG_RESPONSE_CONSTANT = 107;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_RESPONSE_CONSTANT__LOCATION = TRG_CONSTANT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_RESPONSE_CONSTANT__COMMENTS_BEFORE = TRG_CONSTANT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_RESPONSE_CONSTANT__COMMENTS_AFTER = TRG_CONSTANT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_RESPONSE_CONSTANT__RESPONSE = TRG_CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trg Response Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_RESPONSE_CONSTANT_FEATURE_COUNT = TRG_CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trg Response Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_RESPONSE_CONSTANT_OPERATION_COUNT = TRG_CONSTANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.impl.TrgSuccessResponseImpl <em>Trg Success Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.impl.TrgSuccessResponseImpl
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgSuccessResponse()
	 * @generated
	 */
	int TRG_SUCCESS_RESPONSE = 109;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SUCCESS_RESPONSE__LOCATION = TRG_RESPONSE__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SUCCESS_RESPONSE__COMMENTS_BEFORE = TRG_RESPONSE__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SUCCESS_RESPONSE__COMMENTS_AFTER = TRG_RESPONSE__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Success Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SUCCESS_RESPONSE__SUCCESS_KIND = TRG_RESPONSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trg Success Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SUCCESS_RESPONSE_FEATURE_COUNT = TRG_RESPONSE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trg Success Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SUCCESS_RESPONSE_OPERATION_COUNT = TRG_RESPONSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.Direction <em>Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.Direction
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getDirection()
	 * @generated
	 */
	int DIRECTION = 111;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.SIPMethod <em>SIP Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.SIPMethod
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSIPMethod()
	 * @generated
	 */
	int SIP_METHOD = 112;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.ControlMethod <em>Control Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.ControlMethod
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getControlMethod()
	 * @generated
	 */
	int CONTROL_METHOD = 113;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.PrimitiveType <em>Primitive Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.PrimitiveType
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 114;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.Modifier <em>Modifier</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.Modifier
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getModifier()
	 * @generated
	 */
	int MODIFIER = 115;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.FunctionLocation <em>Function Location</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.FunctionLocation
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getFunctionLocation()
	 * @generated
	 */
	int FUNCTION_LOCATION = 116;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.SIPHeader <em>SIP Header</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.SIPHeader
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSIPHeader()
	 * @generated
	 */
	int SIP_HEADER = 117;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.SuccessKind <em>Success Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.SuccessKind
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSuccessKind()
	 * @generated
	 */
	int SUCCESS_KIND = 118;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.ClientErrorKind <em>Client Error Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.ClientErrorKind
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getClientErrorKind()
	 * @generated
	 */
	int CLIENT_ERROR_KIND = 119;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.GlobalErrorKind <em>Global Error Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.GlobalErrorKind
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getGlobalErrorKind()
	 * @generated
	 */
	int GLOBAL_ERROR_KIND = 120;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.RedirectionErrorKind <em>Redirection Error Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.RedirectionErrorKind
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getRedirectionErrorKind()
	 * @generated
	 */
	int REDIRECTION_ERROR_KIND = 121;

	/**
	 * The meta object id for the '{@link jointPackage_CPL2SPL.ServerErrorKind <em>Server Error Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_CPL2SPL.ServerErrorKind
	 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getServerErrorKind()
	 * @generated
	 */
	int SERVER_ERROR_KIND = 122;


	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.JointMM <em>Joint MM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Joint MM</em>'.
	 * @see jointPackage_CPL2SPL.JointMM
	 * @generated
	 */
	EClass getJointMM();

	/**
	 * Returns the meta object for the containment reference '{@link jointPackage_CPL2SPL.JointMM#getSourceRoot <em>Source Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Root</em>'.
	 * @see jointPackage_CPL2SPL.JointMM#getSourceRoot()
	 * @see #getJointMM()
	 * @generated
	 */
	EReference getJointMM_SourceRoot();

	/**
	 * Returns the meta object for the containment reference '{@link jointPackage_CPL2SPL.JointMM#getTargetRoot <em>Target Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Root</em>'.
	 * @see jointPackage_CPL2SPL.JointMM#getTargetRoot()
	 * @see #getJointMM()
	 * @generated
	 */
	EReference getJointMM_TargetRoot();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.SrcCPLModel <em>Src CPL Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src CPL Model</em>'.
	 * @see jointPackage_CPL2SPL.SrcCPLModel
	 * @generated
	 */
	EClass getSrcCPLModel();

	/**
	 * Returns the meta object for the containment reference list '{@link jointPackage_CPL2SPL.SrcCPLModel#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see jointPackage_CPL2SPL.SrcCPLModel#getElements()
	 * @see #getSrcCPLModel()
	 * @generated
	 */
	EReference getSrcCPLModel_Elements();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.SrcCPL <em>Src CPL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src CPL</em>'.
	 * @see jointPackage_CPL2SPL.SrcCPL
	 * @generated
	 */
	EClass getSrcCPL();

	/**
	 * Returns the meta object for the containment reference list '{@link jointPackage_CPL2SPL.SrcCPL#getSubActions <em>Sub Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Actions</em>'.
	 * @see jointPackage_CPL2SPL.SrcCPL#getSubActions()
	 * @see #getSrcCPL()
	 * @generated
	 */
	EReference getSrcCPL_SubActions();

	/**
	 * Returns the meta object for the containment reference '{@link jointPackage_CPL2SPL.SrcCPL#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Outgoing</em>'.
	 * @see jointPackage_CPL2SPL.SrcCPL#getOutgoing()
	 * @see #getSrcCPL()
	 * @generated
	 */
	EReference getSrcCPL_Outgoing();

	/**
	 * Returns the meta object for the containment reference '{@link jointPackage_CPL2SPL.SrcCPL#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Incoming</em>'.
	 * @see jointPackage_CPL2SPL.SrcCPL#getIncoming()
	 * @see #getSrcCPL()
	 * @generated
	 */
	EReference getSrcCPL_Incoming();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.SrcAddressSwitch <em>Src Address Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src Address Switch</em>'.
	 * @see jointPackage_CPL2SPL.SrcAddressSwitch
	 * @generated
	 */
	EClass getSrcAddressSwitch();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.SrcAddressSwitch#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field</em>'.
	 * @see jointPackage_CPL2SPL.SrcAddressSwitch#getField()
	 * @see #getSrcAddressSwitch()
	 * @generated
	 */
	EAttribute getSrcAddressSwitch_Field();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.SrcAddressSwitch#getSubField <em>Sub Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Field</em>'.
	 * @see jointPackage_CPL2SPL.SrcAddressSwitch#getSubField()
	 * @see #getSrcAddressSwitch()
	 * @generated
	 */
	EAttribute getSrcAddressSwitch_SubField();

	/**
	 * Returns the meta object for the containment reference list '{@link jointPackage_CPL2SPL.SrcAddressSwitch#getAddresses <em>Addresses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Addresses</em>'.
	 * @see jointPackage_CPL2SPL.SrcAddressSwitch#getAddresses()
	 * @see #getSrcAddressSwitch()
	 * @generated
	 */
	EReference getSrcAddressSwitch_Addresses();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.SrcStringSwitch <em>Src String Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src String Switch</em>'.
	 * @see jointPackage_CPL2SPL.SrcStringSwitch
	 * @generated
	 */
	EClass getSrcStringSwitch();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.SrcStringSwitch#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field</em>'.
	 * @see jointPackage_CPL2SPL.SrcStringSwitch#getField()
	 * @see #getSrcStringSwitch()
	 * @generated
	 */
	EAttribute getSrcStringSwitch_Field();

	/**
	 * Returns the meta object for the containment reference list '{@link jointPackage_CPL2SPL.SrcStringSwitch#getStrings <em>Strings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strings</em>'.
	 * @see jointPackage_CPL2SPL.SrcStringSwitch#getStrings()
	 * @see #getSrcStringSwitch()
	 * @generated
	 */
	EReference getSrcStringSwitch_Strings();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.SrcLanguageSwitch <em>Src Language Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src Language Switch</em>'.
	 * @see jointPackage_CPL2SPL.SrcLanguageSwitch
	 * @generated
	 */
	EClass getSrcLanguageSwitch();

	/**
	 * Returns the meta object for the containment reference list '{@link jointPackage_CPL2SPL.SrcLanguageSwitch#getLanguages <em>Languages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Languages</em>'.
	 * @see jointPackage_CPL2SPL.SrcLanguageSwitch#getLanguages()
	 * @see #getSrcLanguageSwitch()
	 * @generated
	 */
	EReference getSrcLanguageSwitch_Languages();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.SrcTimeSwitch <em>Src Time Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src Time Switch</em>'.
	 * @see jointPackage_CPL2SPL.SrcTimeSwitch
	 * @generated
	 */
	EClass getSrcTimeSwitch();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.SrcTimeSwitch#getTzid <em>Tzid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tzid</em>'.
	 * @see jointPackage_CPL2SPL.SrcTimeSwitch#getTzid()
	 * @see #getSrcTimeSwitch()
	 * @generated
	 */
	EAttribute getSrcTimeSwitch_Tzid();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.SrcTimeSwitch#getTzurl <em>Tzurl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tzurl</em>'.
	 * @see jointPackage_CPL2SPL.SrcTimeSwitch#getTzurl()
	 * @see #getSrcTimeSwitch()
	 * @generated
	 */
	EAttribute getSrcTimeSwitch_Tzurl();

	/**
	 * Returns the meta object for the containment reference list '{@link jointPackage_CPL2SPL.SrcTimeSwitch#getTimes <em>Times</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Times</em>'.
	 * @see jointPackage_CPL2SPL.SrcTimeSwitch#getTimes()
	 * @see #getSrcTimeSwitch()
	 * @generated
	 */
	EReference getSrcTimeSwitch_Times();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.SrcPrioritySwitch <em>Src Priority Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src Priority Switch</em>'.
	 * @see jointPackage_CPL2SPL.SrcPrioritySwitch
	 * @generated
	 */
	EClass getSrcPrioritySwitch();

	/**
	 * Returns the meta object for the containment reference list '{@link jointPackage_CPL2SPL.SrcPrioritySwitch#getPriorities <em>Priorities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Priorities</em>'.
	 * @see jointPackage_CPL2SPL.SrcPrioritySwitch#getPriorities()
	 * @see #getSrcPrioritySwitch()
	 * @generated
	 */
	EReference getSrcPrioritySwitch_Priorities();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.SrcProxy <em>Src Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src Proxy</em>'.
	 * @see jointPackage_CPL2SPL.SrcProxy
	 * @generated
	 */
	EClass getSrcProxy();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.SrcProxy#getTimeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timeout</em>'.
	 * @see jointPackage_CPL2SPL.SrcProxy#getTimeout()
	 * @see #getSrcProxy()
	 * @generated
	 */
	EAttribute getSrcProxy_Timeout();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.SrcProxy#getRecurse <em>Recurse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recurse</em>'.
	 * @see jointPackage_CPL2SPL.SrcProxy#getRecurse()
	 * @see #getSrcProxy()
	 * @generated
	 */
	EAttribute getSrcProxy_Recurse();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.SrcProxy#getOrdering <em>Ordering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ordering</em>'.
	 * @see jointPackage_CPL2SPL.SrcProxy#getOrdering()
	 * @see #getSrcProxy()
	 * @generated
	 */
	EAttribute getSrcProxy_Ordering();

	/**
	 * Returns the meta object for the containment reference '{@link jointPackage_CPL2SPL.SrcProxy#getBusy <em>Busy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Busy</em>'.
	 * @see jointPackage_CPL2SPL.SrcProxy#getBusy()
	 * @see #getSrcProxy()
	 * @generated
	 */
	EReference getSrcProxy_Busy();

	/**
	 * Returns the meta object for the containment reference '{@link jointPackage_CPL2SPL.SrcProxy#getNoAnswer <em>No Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>No Answer</em>'.
	 * @see jointPackage_CPL2SPL.SrcProxy#getNoAnswer()
	 * @see #getSrcProxy()
	 * @generated
	 */
	EReference getSrcProxy_NoAnswer();

	/**
	 * Returns the meta object for the containment reference '{@link jointPackage_CPL2SPL.SrcProxy#getRedirection <em>Redirection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Redirection</em>'.
	 * @see jointPackage_CPL2SPL.SrcProxy#getRedirection()
	 * @see #getSrcProxy()
	 * @generated
	 */
	EReference getSrcProxy_Redirection();

	/**
	 * Returns the meta object for the containment reference '{@link jointPackage_CPL2SPL.SrcProxy#getFailure <em>Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Failure</em>'.
	 * @see jointPackage_CPL2SPL.SrcProxy#getFailure()
	 * @see #getSrcProxy()
	 * @generated
	 */
	EReference getSrcProxy_Failure();

	/**
	 * Returns the meta object for the containment reference '{@link jointPackage_CPL2SPL.SrcProxy#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default</em>'.
	 * @see jointPackage_CPL2SPL.SrcProxy#getDefault()
	 * @see #getSrcProxy()
	 * @generated
	 */
	EReference getSrcProxy_Default();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.SrcRedirect <em>Src Redirect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src Redirect</em>'.
	 * @see jointPackage_CPL2SPL.SrcRedirect
	 * @generated
	 */
	EClass getSrcRedirect();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.SrcRedirect#getPermanent <em>Permanent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Permanent</em>'.
	 * @see jointPackage_CPL2SPL.SrcRedirect#getPermanent()
	 * @see #getSrcRedirect()
	 * @generated
	 */
	EAttribute getSrcRedirect_Permanent();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.SrcReject <em>Src Reject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src Reject</em>'.
	 * @see jointPackage_CPL2SPL.SrcReject
	 * @generated
	 */
	EClass getSrcReject();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.SrcReject#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see jointPackage_CPL2SPL.SrcReject#getStatus()
	 * @see #getSrcReject()
	 * @generated
	 */
	EAttribute getSrcReject_Status();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.SrcReject#getReason <em>Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reason</em>'.
	 * @see jointPackage_CPL2SPL.SrcReject#getReason()
	 * @see #getSrcReject()
	 * @generated
	 */
	EAttribute getSrcReject_Reason();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.SrcElement <em>Src Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src Element</em>'.
	 * @see jointPackage_CPL2SPL.SrcElement
	 * @generated
	 */
	EClass getSrcElement();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.SrcNodeContainer <em>Src Node Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src Node Container</em>'.
	 * @see jointPackage_CPL2SPL.SrcNodeContainer
	 * @generated
	 */
	EClass getSrcNodeContainer();

	/**
	 * Returns the meta object for the reference '{@link jointPackage_CPL2SPL.SrcNodeContainer#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contents</em>'.
	 * @see jointPackage_CPL2SPL.SrcNodeContainer#getContents()
	 * @see #getSrcNodeContainer()
	 * @generated
	 */
	EReference getSrcNodeContainer_Contents();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.SrcSubAction <em>Src Sub Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src Sub Action</em>'.
	 * @see jointPackage_CPL2SPL.SrcSubAction
	 * @generated
	 */
	EClass getSrcSubAction();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.SrcSubAction#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see jointPackage_CPL2SPL.SrcSubAction#getId()
	 * @see #getSrcSubAction()
	 * @generated
	 */
	EAttribute getSrcSubAction_Id();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.SrcOutgoing <em>Src Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src Outgoing</em>'.
	 * @see jointPackage_CPL2SPL.SrcOutgoing
	 * @generated
	 */
	EClass getSrcOutgoing();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.SrcIncoming <em>Src Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src Incoming</em>'.
	 * @see jointPackage_CPL2SPL.SrcIncoming
	 * @generated
	 */
	EClass getSrcIncoming();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.SrcNotPresent <em>Src Not Present</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src Not Present</em>'.
	 * @see jointPackage_CPL2SPL.SrcNotPresent
	 * @generated
	 */
	EClass getSrcNotPresent();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.SrcOtherwise <em>Src Otherwise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src Otherwise</em>'.
	 * @see jointPackage_CPL2SPL.SrcOtherwise
	 * @generated
	 */
	EClass getSrcOtherwise();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.SrcSwitchedAddress <em>Src Switched Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src Switched Address</em>'.
	 * @see jointPackage_CPL2SPL.SrcSwitchedAddress
	 * @generated
	 */
	EClass getSrcSwitchedAddress();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.SrcSwitchedAddress#getIs <em>Is</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is</em>'.
	 * @see jointPackage_CPL2SPL.SrcSwitchedAddress#getIs()
	 * @see #getSrcSwitchedAddress()
	 * @generated
	 */
	EAttribute getSrcSwitchedAddress_Is();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.SrcSwitchedAddress#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contains</em>'.
	 * @see jointPackage_CPL2SPL.SrcSwitchedAddress#getContains()
	 * @see #getSrcSwitchedAddress()
	 * @generated
	 */
	EAttribute getSrcSwitchedAddress_Contains();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.SrcSwitchedAddress#getSubDomainOf <em>Sub Domain Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Domain Of</em>'.
	 * @see jointPackage_CPL2SPL.SrcSwitchedAddress#getSubDomainOf()
	 * @see #getSrcSwitchedAddress()
	 * @generated
	 */
	EAttribute getSrcSwitchedAddress_SubDomainOf();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.SrcSwitchedString <em>Src Switched String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src Switched String</em>'.
	 * @see jointPackage_CPL2SPL.SrcSwitchedString
	 * @generated
	 */
	EClass getSrcSwitchedString();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.SrcSwitchedString#getIs <em>Is</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is</em>'.
	 * @see jointPackage_CPL2SPL.SrcSwitchedString#getIs()
	 * @see #getSrcSwitchedString()
	 * @generated
	 */
	EAttribute getSrcSwitchedString_Is();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.SrcSwitchedString#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contains</em>'.
	 * @see jointPackage_CPL2SPL.SrcSwitchedString#getContains()
	 * @see #getSrcSwitchedString()
	 * @generated
	 */
	EAttribute getSrcSwitchedString_Contains();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.SrcSwitchedLanguage <em>Src Switched Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src Switched Language</em>'.
	 * @see jointPackage_CPL2SPL.SrcSwitchedLanguage
	 * @generated
	 */
	EClass getSrcSwitchedLanguage();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.SrcSwitchedLanguage#getMatches <em>Matches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Matches</em>'.
	 * @see jointPackage_CPL2SPL.SrcSwitchedLanguage#getMatches()
	 * @see #getSrcSwitchedLanguage()
	 * @generated
	 */
	EAttribute getSrcSwitchedLanguage_Matches();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.SrcSwitchedTime <em>Src Switched Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src Switched Time</em>'.
	 * @see jointPackage_CPL2SPL.SrcSwitchedTime
	 * @generated
	 */
	EClass getSrcSwitchedTime();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.SrcSwitchedTime#getDtstart <em>Dtstart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dtstart</em>'.
	 * @see jointPackage_CPL2SPL.SrcSwitchedTime#getDtstart()
	 * @see #getSrcSwitchedTime()
	 * @generated
	 */
	EAttribute getSrcSwitchedTime_Dtstart();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.SrcSwitchedTime#getDtend <em>Dtend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dtend</em>'.
	 * @see jointPackage_CPL2SPL.SrcSwitchedTime#getDtend()
	 * @see #getSrcSwitchedTime()
	 * @generated
	 */
	EAttribute getSrcSwitchedTime_Dtend();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.SrcSwitchedTime#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see jointPackage_CPL2SPL.SrcSwitchedTime#getDuration()
	 * @see #getSrcSwitchedTime()
	 * @generated
	 */
	EAttribute getSrcSwitchedTime_Duration();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.SrcSwitchedTime#getFreq <em>Freq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Freq</em>'.
	 * @see jointPackage_CPL2SPL.SrcSwitchedTime#getFreq()
	 * @see #getSrcSwitchedTime()
	 * @generated
	 */
	EAttribute getSrcSwitchedTime_Freq();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.SrcSwitchedTime#getUntil <em>Until</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Until</em>'.
	 * @see jointPackage_CPL2SPL.SrcSwitchedTime#getUntil()
	 * @see #getSrcSwitchedTime()
	 * @generated
	 */
	EAttribute getSrcSwitchedTime_Until();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.SrcSwitchedTime#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see jointPackage_CPL2SPL.SrcSwitchedTime#getCount()
	 * @see #getSrcSwitchedTime()
	 * @generated
	 */
	EAttribute getSrcSwitchedTime_Count();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.SrcSwitchedTime#getInterval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interval</em>'.
	 * @see jointPackage_CPL2SPL.SrcSwitchedTime#getInterval()
	 * @see #getSrcSwitchedTime()
	 * @generated
	 */
	EAttribute getSrcSwitchedTime_Interval();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.SrcSwitchedTime#getBySecond <em>By Second</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>By Second</em>'.
	 * @see jointPackage_CPL2SPL.SrcSwitchedTime#getBySecond()
	 * @see #getSrcSwitchedTime()
	 * @generated
	 */
	EAttribute getSrcSwitchedTime_BySecond();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.SrcSwitchedTime#getByMinute <em>By Minute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>By Minute</em>'.
	 * @see jointPackage_CPL2SPL.SrcSwitchedTime#getByMinute()
	 * @see #getSrcSwitchedTime()
	 * @generated
	 */
	EAttribute getSrcSwitchedTime_ByMinute();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.SrcSwitchedTime#getByHour <em>By Hour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>By Hour</em>'.
	 * @see jointPackage_CPL2SPL.SrcSwitchedTime#getByHour()
	 * @see #getSrcSwitchedTime()
	 * @generated
	 */
	EAttribute getSrcSwitchedTime_ByHour();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.SrcSwitchedTime#getByDay <em>By Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>By Day</em>'.
	 * @see jointPackage_CPL2SPL.SrcSwitchedTime#getByDay()
	 * @see #getSrcSwitchedTime()
	 * @generated
	 */
	EAttribute getSrcSwitchedTime_ByDay();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.SrcSwitchedTime#getByMonthDay <em>By Month Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>By Month Day</em>'.
	 * @see jointPackage_CPL2SPL.SrcSwitchedTime#getByMonthDay()
	 * @see #getSrcSwitchedTime()
	 * @generated
	 */
	EAttribute getSrcSwitchedTime_ByMonthDay();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.SrcSwitchedTime#getByYearDay <em>By Year Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>By Year Day</em>'.
	 * @see jointPackage_CPL2SPL.SrcSwitchedTime#getByYearDay()
	 * @see #getSrcSwitchedTime()
	 * @generated
	 */
	EAttribute getSrcSwitchedTime_ByYearDay();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.SrcSwitchedTime#getByWeekNo <em>By Week No</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>By Week No</em>'.
	 * @see jointPackage_CPL2SPL.SrcSwitchedTime#getByWeekNo()
	 * @see #getSrcSwitchedTime()
	 * @generated
	 */
	EAttribute getSrcSwitchedTime_ByWeekNo();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.SrcSwitchedTime#getByMonth <em>By Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>By Month</em>'.
	 * @see jointPackage_CPL2SPL.SrcSwitchedTime#getByMonth()
	 * @see #getSrcSwitchedTime()
	 * @generated
	 */
	EAttribute getSrcSwitchedTime_ByMonth();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.SrcSwitchedTime#getWkst <em>Wkst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wkst</em>'.
	 * @see jointPackage_CPL2SPL.SrcSwitchedTime#getWkst()
	 * @see #getSrcSwitchedTime()
	 * @generated
	 */
	EAttribute getSrcSwitchedTime_Wkst();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.SrcSwitchedTime#getBySetPos <em>By Set Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>By Set Pos</em>'.
	 * @see jointPackage_CPL2SPL.SrcSwitchedTime#getBySetPos()
	 * @see #getSrcSwitchedTime()
	 * @generated
	 */
	EAttribute getSrcSwitchedTime_BySetPos();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.SrcSwitchedPriority <em>Src Switched Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src Switched Priority</em>'.
	 * @see jointPackage_CPL2SPL.SrcSwitchedPriority
	 * @generated
	 */
	EClass getSrcSwitchedPriority();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.SrcSwitchedPriority#getLess <em>Less</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Less</em>'.
	 * @see jointPackage_CPL2SPL.SrcSwitchedPriority#getLess()
	 * @see #getSrcSwitchedPriority()
	 * @generated
	 */
	EAttribute getSrcSwitchedPriority_Less();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.SrcSwitchedPriority#getGreater <em>Greater</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Greater</em>'.
	 * @see jointPackage_CPL2SPL.SrcSwitchedPriority#getGreater()
	 * @see #getSrcSwitchedPriority()
	 * @generated
	 */
	EAttribute getSrcSwitchedPriority_Greater();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.SrcSwitchedPriority#getEqual <em>Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Equal</em>'.
	 * @see jointPackage_CPL2SPL.SrcSwitchedPriority#getEqual()
	 * @see #getSrcSwitchedPriority()
	 * @generated
	 */
	EAttribute getSrcSwitchedPriority_Equal();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.SrcBusy <em>Src Busy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src Busy</em>'.
	 * @see jointPackage_CPL2SPL.SrcBusy
	 * @generated
	 */
	EClass getSrcBusy();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.SrcNoAnswer <em>Src No Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src No Answer</em>'.
	 * @see jointPackage_CPL2SPL.SrcNoAnswer
	 * @generated
	 */
	EClass getSrcNoAnswer();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.SrcRedirection <em>Src Redirection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src Redirection</em>'.
	 * @see jointPackage_CPL2SPL.SrcRedirection
	 * @generated
	 */
	EClass getSrcRedirection();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.SrcFailure <em>Src Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src Failure</em>'.
	 * @see jointPackage_CPL2SPL.SrcFailure
	 * @generated
	 */
	EClass getSrcFailure();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.SrcDefault <em>Src Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src Default</em>'.
	 * @see jointPackage_CPL2SPL.SrcDefault
	 * @generated
	 */
	EClass getSrcDefault();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.SrcNode <em>Src Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src Node</em>'.
	 * @see jointPackage_CPL2SPL.SrcNode
	 * @generated
	 */
	EClass getSrcNode();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.SrcSwitch <em>Src Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src Switch</em>'.
	 * @see jointPackage_CPL2SPL.SrcSwitch
	 * @generated
	 */
	EClass getSrcSwitch();

	/**
	 * Returns the meta object for the containment reference '{@link jointPackage_CPL2SPL.SrcSwitch#getNotPresent <em>Not Present</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Not Present</em>'.
	 * @see jointPackage_CPL2SPL.SrcSwitch#getNotPresent()
	 * @see #getSrcSwitch()
	 * @generated
	 */
	EReference getSrcSwitch_NotPresent();

	/**
	 * Returns the meta object for the containment reference '{@link jointPackage_CPL2SPL.SrcSwitch#getOtherwise <em>Otherwise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Otherwise</em>'.
	 * @see jointPackage_CPL2SPL.SrcSwitch#getOtherwise()
	 * @see #getSrcSwitch()
	 * @generated
	 */
	EReference getSrcSwitch_Otherwise();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.SrcLocation <em>Src Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src Location</em>'.
	 * @see jointPackage_CPL2SPL.SrcLocation
	 * @generated
	 */
	EClass getSrcLocation();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.SrcLocation#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see jointPackage_CPL2SPL.SrcLocation#getUrl()
	 * @see #getSrcLocation()
	 * @generated
	 */
	EAttribute getSrcLocation_Url();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.SrcLocation#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see jointPackage_CPL2SPL.SrcLocation#getPriority()
	 * @see #getSrcLocation()
	 * @generated
	 */
	EAttribute getSrcLocation_Priority();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.SrcLocation#getClear <em>Clear</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clear</em>'.
	 * @see jointPackage_CPL2SPL.SrcLocation#getClear()
	 * @see #getSrcLocation()
	 * @generated
	 */
	EAttribute getSrcLocation_Clear();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.SrcSubCall <em>Src Sub Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src Sub Call</em>'.
	 * @see jointPackage_CPL2SPL.SrcSubCall
	 * @generated
	 */
	EClass getSrcSubCall();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.SrcSubCall#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see jointPackage_CPL2SPL.SrcSubCall#getRef()
	 * @see #getSrcSubCall()
	 * @generated
	 */
	EAttribute getSrcSubCall_Ref();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.SrcAction <em>Src Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src Action</em>'.
	 * @see jointPackage_CPL2SPL.SrcAction
	 * @generated
	 */
	EClass getSrcAction();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.SrcSignallingAction <em>Src Signalling Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src Signalling Action</em>'.
	 * @see jointPackage_CPL2SPL.SrcSignallingAction
	 * @generated
	 */
	EClass getSrcSignallingAction();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgProgram <em>Trg Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Program</em>'.
	 * @see jointPackage_CPL2SPL.TrgProgram
	 * @generated
	 */
	EClass getTrgProgram();

	/**
	 * Returns the meta object for the containment reference '{@link jointPackage_CPL2SPL.TrgProgram#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service</em>'.
	 * @see jointPackage_CPL2SPL.TrgProgram#getService()
	 * @see #getTrgProgram()
	 * @generated
	 */
	EReference getTrgProgram_Service();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgStructureProperty <em>Trg Structure Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Structure Property</em>'.
	 * @see jointPackage_CPL2SPL.TrgStructureProperty
	 * @generated
	 */
	EClass getTrgStructureProperty();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.TrgStructureProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jointPackage_CPL2SPL.TrgStructureProperty#getName()
	 * @see #getTrgStructureProperty()
	 * @generated
	 */
	EAttribute getTrgStructureProperty_Name();

	/**
	 * Returns the meta object for the containment reference '{@link jointPackage_CPL2SPL.TrgStructureProperty#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see jointPackage_CPL2SPL.TrgStructureProperty#getType()
	 * @see #getTrgStructureProperty()
	 * @generated
	 */
	EReference getTrgStructureProperty_Type();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgClientErrorResponse <em>Trg Client Error Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Client Error Response</em>'.
	 * @see jointPackage_CPL2SPL.TrgClientErrorResponse
	 * @generated
	 */
	EClass getTrgClientErrorResponse();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.TrgClientErrorResponse#getErrorKind <em>Error Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Kind</em>'.
	 * @see jointPackage_CPL2SPL.TrgClientErrorResponse#getErrorKind()
	 * @see #getTrgClientErrorResponse()
	 * @generated
	 */
	EAttribute getTrgClientErrorResponse_ErrorKind();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgGlobalErrorResponse <em>Trg Global Error Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Global Error Response</em>'.
	 * @see jointPackage_CPL2SPL.TrgGlobalErrorResponse
	 * @generated
	 */
	EClass getTrgGlobalErrorResponse();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.TrgGlobalErrorResponse#getErrorKind <em>Error Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Kind</em>'.
	 * @see jointPackage_CPL2SPL.TrgGlobalErrorResponse#getErrorKind()
	 * @see #getTrgGlobalErrorResponse()
	 * @generated
	 */
	EAttribute getTrgGlobalErrorResponse_ErrorKind();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgRedirectionErrorResponse <em>Trg Redirection Error Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Redirection Error Response</em>'.
	 * @see jointPackage_CPL2SPL.TrgRedirectionErrorResponse
	 * @generated
	 */
	EClass getTrgRedirectionErrorResponse();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.TrgRedirectionErrorResponse#getErrorKind <em>Error Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Kind</em>'.
	 * @see jointPackage_CPL2SPL.TrgRedirectionErrorResponse#getErrorKind()
	 * @see #getTrgRedirectionErrorResponse()
	 * @generated
	 */
	EAttribute getTrgRedirectionErrorResponse_ErrorKind();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgServerErrorResponse <em>Trg Server Error Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Server Error Response</em>'.
	 * @see jointPackage_CPL2SPL.TrgServerErrorResponse
	 * @generated
	 */
	EClass getTrgServerErrorResponse();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.TrgServerErrorResponse#getErrorKind <em>Error Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Kind</em>'.
	 * @see jointPackage_CPL2SPL.TrgServerErrorResponse#getErrorKind()
	 * @see #getTrgServerErrorResponse()
	 * @generated
	 */
	EAttribute getTrgServerErrorResponse_ErrorKind();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgLocatedElement <em>Trg Located Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Located Element</em>'.
	 * @see jointPackage_CPL2SPL.TrgLocatedElement
	 * @generated
	 */
	EClass getTrgLocatedElement();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.TrgLocatedElement#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see jointPackage_CPL2SPL.TrgLocatedElement#getLocation()
	 * @see #getTrgLocatedElement()
	 * @generated
	 */
	EAttribute getTrgLocatedElement_Location();

	/**
	 * Returns the meta object for the attribute list '{@link jointPackage_CPL2SPL.TrgLocatedElement#getCommentsBefore <em>Comments Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Comments Before</em>'.
	 * @see jointPackage_CPL2SPL.TrgLocatedElement#getCommentsBefore()
	 * @see #getTrgLocatedElement()
	 * @generated
	 */
	EAttribute getTrgLocatedElement_CommentsBefore();

	/**
	 * Returns the meta object for the attribute list '{@link jointPackage_CPL2SPL.TrgLocatedElement#getCommentsAfter <em>Comments After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Comments After</em>'.
	 * @see jointPackage_CPL2SPL.TrgLocatedElement#getCommentsAfter()
	 * @see #getTrgLocatedElement()
	 * @generated
	 */
	EAttribute getTrgLocatedElement_CommentsAfter();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgService <em>Trg Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Service</em>'.
	 * @see jointPackage_CPL2SPL.TrgService
	 * @generated
	 */
	EClass getTrgService();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.TrgService#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jointPackage_CPL2SPL.TrgService#getName()
	 * @see #getTrgService()
	 * @generated
	 */
	EAttribute getTrgService_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link jointPackage_CPL2SPL.TrgService#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarations</em>'.
	 * @see jointPackage_CPL2SPL.TrgService#getDeclarations()
	 * @see #getTrgService()
	 * @generated
	 */
	EReference getTrgService_Declarations();

	/**
	 * Returns the meta object for the containment reference list '{@link jointPackage_CPL2SPL.TrgService#getSessions <em>Sessions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sessions</em>'.
	 * @see jointPackage_CPL2SPL.TrgService#getSessions()
	 * @see #getTrgService()
	 * @generated
	 */
	EReference getTrgService_Sessions();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgSession <em>Trg Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Session</em>'.
	 * @see jointPackage_CPL2SPL.TrgSession
	 * @generated
	 */
	EClass getTrgSession();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgRegistration <em>Trg Registration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Registration</em>'.
	 * @see jointPackage_CPL2SPL.TrgRegistration
	 * @generated
	 */
	EClass getTrgRegistration();

	/**
	 * Returns the meta object for the containment reference list '{@link jointPackage_CPL2SPL.TrgRegistration#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarations</em>'.
	 * @see jointPackage_CPL2SPL.TrgRegistration#getDeclarations()
	 * @see #getTrgRegistration()
	 * @generated
	 */
	EReference getTrgRegistration_Declarations();

	/**
	 * Returns the meta object for the containment reference list '{@link jointPackage_CPL2SPL.TrgRegistration#getSessions <em>Sessions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sessions</em>'.
	 * @see jointPackage_CPL2SPL.TrgRegistration#getSessions()
	 * @see #getTrgRegistration()
	 * @generated
	 */
	EReference getTrgRegistration_Sessions();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgDialog <em>Trg Dialog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Dialog</em>'.
	 * @see jointPackage_CPL2SPL.TrgDialog
	 * @generated
	 */
	EClass getTrgDialog();

	/**
	 * Returns the meta object for the containment reference list '{@link jointPackage_CPL2SPL.TrgDialog#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarations</em>'.
	 * @see jointPackage_CPL2SPL.TrgDialog#getDeclarations()
	 * @see #getTrgDialog()
	 * @generated
	 */
	EReference getTrgDialog_Declarations();

	/**
	 * Returns the meta object for the containment reference list '{@link jointPackage_CPL2SPL.TrgDialog#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see jointPackage_CPL2SPL.TrgDialog#getMethods()
	 * @see #getTrgDialog()
	 * @generated
	 */
	EReference getTrgDialog_Methods();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgEvent <em>Trg Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Event</em>'.
	 * @see jointPackage_CPL2SPL.TrgEvent
	 * @generated
	 */
	EClass getTrgEvent();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.TrgEvent#getEventId <em>Event Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Id</em>'.
	 * @see jointPackage_CPL2SPL.TrgEvent#getEventId()
	 * @see #getTrgEvent()
	 * @generated
	 */
	EAttribute getTrgEvent_EventId();

	/**
	 * Returns the meta object for the containment reference list '{@link jointPackage_CPL2SPL.TrgEvent#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarations</em>'.
	 * @see jointPackage_CPL2SPL.TrgEvent#getDeclarations()
	 * @see #getTrgEvent()
	 * @generated
	 */
	EReference getTrgEvent_Declarations();

	/**
	 * Returns the meta object for the containment reference list '{@link jointPackage_CPL2SPL.TrgEvent#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see jointPackage_CPL2SPL.TrgEvent#getMethods()
	 * @see #getTrgEvent()
	 * @generated
	 */
	EReference getTrgEvent_Methods();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgMethod <em>Trg Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Method</em>'.
	 * @see jointPackage_CPL2SPL.TrgMethod
	 * @generated
	 */
	EClass getTrgMethod();

	/**
	 * Returns the meta object for the containment reference '{@link jointPackage_CPL2SPL.TrgMethod#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see jointPackage_CPL2SPL.TrgMethod#getType()
	 * @see #getTrgMethod()
	 * @generated
	 */
	EReference getTrgMethod_Type();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.TrgMethod#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see jointPackage_CPL2SPL.TrgMethod#getDirection()
	 * @see #getTrgMethod()
	 * @generated
	 */
	EAttribute getTrgMethod_Direction();

	/**
	 * Returns the meta object for the containment reference '{@link jointPackage_CPL2SPL.TrgMethod#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method Name</em>'.
	 * @see jointPackage_CPL2SPL.TrgMethod#getMethodName()
	 * @see #getTrgMethod()
	 * @generated
	 */
	EReference getTrgMethod_MethodName();

	/**
	 * Returns the meta object for the containment reference list '{@link jointPackage_CPL2SPL.TrgMethod#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see jointPackage_CPL2SPL.TrgMethod#getArguments()
	 * @see #getTrgMethod()
	 * @generated
	 */
	EReference getTrgMethod_Arguments();

	/**
	 * Returns the meta object for the containment reference list '{@link jointPackage_CPL2SPL.TrgMethod#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see jointPackage_CPL2SPL.TrgMethod#getStatements()
	 * @see #getTrgMethod()
	 * @generated
	 */
	EReference getTrgMethod_Statements();

	/**
	 * Returns the meta object for the containment reference list '{@link jointPackage_CPL2SPL.TrgMethod#getBranches <em>Branches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Branches</em>'.
	 * @see jointPackage_CPL2SPL.TrgMethod#getBranches()
	 * @see #getTrgMethod()
	 * @generated
	 */
	EReference getTrgMethod_Branches();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgArgument <em>Trg Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Argument</em>'.
	 * @see jointPackage_CPL2SPL.TrgArgument
	 * @generated
	 */
	EClass getTrgArgument();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgMethodName <em>Trg Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Method Name</em>'.
	 * @see jointPackage_CPL2SPL.TrgMethodName
	 * @generated
	 */
	EClass getTrgMethodName();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgSIPMethodName <em>Trg SIP Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg SIP Method Name</em>'.
	 * @see jointPackage_CPL2SPL.TrgSIPMethodName
	 * @generated
	 */
	EClass getTrgSIPMethodName();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.TrgSIPMethodName#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jointPackage_CPL2SPL.TrgSIPMethodName#getName()
	 * @see #getTrgSIPMethodName()
	 * @generated
	 */
	EAttribute getTrgSIPMethodName_Name();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgControlMethodName <em>Trg Control Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Control Method Name</em>'.
	 * @see jointPackage_CPL2SPL.TrgControlMethodName
	 * @generated
	 */
	EClass getTrgControlMethodName();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.TrgControlMethodName#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jointPackage_CPL2SPL.TrgControlMethodName#getName()
	 * @see #getTrgControlMethodName()
	 * @generated
	 */
	EAttribute getTrgControlMethodName_Name();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgBranch <em>Trg Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Branch</em>'.
	 * @see jointPackage_CPL2SPL.TrgBranch
	 * @generated
	 */
	EClass getTrgBranch();

	/**
	 * Returns the meta object for the containment reference list '{@link jointPackage_CPL2SPL.TrgBranch#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see jointPackage_CPL2SPL.TrgBranch#getStatements()
	 * @see #getTrgBranch()
	 * @generated
	 */
	EReference getTrgBranch_Statements();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgDefaultBranch <em>Trg Default Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Default Branch</em>'.
	 * @see jointPackage_CPL2SPL.TrgDefaultBranch
	 * @generated
	 */
	EClass getTrgDefaultBranch();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgNamedBranch <em>Trg Named Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Named Branch</em>'.
	 * @see jointPackage_CPL2SPL.TrgNamedBranch
	 * @generated
	 */
	EClass getTrgNamedBranch();

	/**
	 * Returns the meta object for the attribute list '{@link jointPackage_CPL2SPL.TrgNamedBranch#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Name</em>'.
	 * @see jointPackage_CPL2SPL.TrgNamedBranch#getName()
	 * @see #getTrgNamedBranch()
	 * @generated
	 */
	EAttribute getTrgNamedBranch_Name();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgTypeExpression <em>Trg Type Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Type Expression</em>'.
	 * @see jointPackage_CPL2SPL.TrgTypeExpression
	 * @generated
	 */
	EClass getTrgTypeExpression();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgSimpleType <em>Trg Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Simple Type</em>'.
	 * @see jointPackage_CPL2SPL.TrgSimpleType
	 * @generated
	 */
	EClass getTrgSimpleType();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.TrgSimpleType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see jointPackage_CPL2SPL.TrgSimpleType#getType()
	 * @see #getTrgSimpleType()
	 * @generated
	 */
	EAttribute getTrgSimpleType_Type();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgSequenceType <em>Trg Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Sequence Type</em>'.
	 * @see jointPackage_CPL2SPL.TrgSequenceType
	 * @generated
	 */
	EClass getTrgSequenceType();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.TrgSequenceType#getModifier <em>Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modifier</em>'.
	 * @see jointPackage_CPL2SPL.TrgSequenceType#getModifier()
	 * @see #getTrgSequenceType()
	 * @generated
	 */
	EAttribute getTrgSequenceType_Modifier();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.TrgSequenceType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see jointPackage_CPL2SPL.TrgSequenceType#getType()
	 * @see #getTrgSequenceType()
	 * @generated
	 */
	EAttribute getTrgSequenceType_Type();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.TrgSequenceType#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see jointPackage_CPL2SPL.TrgSequenceType#getSize()
	 * @see #getTrgSequenceType()
	 * @generated
	 */
	EAttribute getTrgSequenceType_Size();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgDefinedType <em>Trg Defined Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Defined Type</em>'.
	 * @see jointPackage_CPL2SPL.TrgDefinedType
	 * @generated
	 */
	EClass getTrgDefinedType();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.TrgDefinedType#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see jointPackage_CPL2SPL.TrgDefinedType#getTypeName()
	 * @see #getTrgDefinedType()
	 * @generated
	 */
	EAttribute getTrgDefinedType_TypeName();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgDeclaration <em>Trg Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Declaration</em>'.
	 * @see jointPackage_CPL2SPL.TrgDeclaration
	 * @generated
	 */
	EClass getTrgDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.TrgDeclaration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jointPackage_CPL2SPL.TrgDeclaration#getName()
	 * @see #getTrgDeclaration()
	 * @generated
	 */
	EAttribute getTrgDeclaration_Name();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgVariableDeclaration <em>Trg Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Variable Declaration</em>'.
	 * @see jointPackage_CPL2SPL.TrgVariableDeclaration
	 * @generated
	 */
	EClass getTrgVariableDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link jointPackage_CPL2SPL.TrgVariableDeclaration#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see jointPackage_CPL2SPL.TrgVariableDeclaration#getType()
	 * @see #getTrgVariableDeclaration()
	 * @generated
	 */
	EReference getTrgVariableDeclaration_Type();

	/**
	 * Returns the meta object for the containment reference '{@link jointPackage_CPL2SPL.TrgVariableDeclaration#getInitExp <em>Init Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Init Exp</em>'.
	 * @see jointPackage_CPL2SPL.TrgVariableDeclaration#getInitExp()
	 * @see #getTrgVariableDeclaration()
	 * @generated
	 */
	EReference getTrgVariableDeclaration_InitExp();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgFunctionDeclaration <em>Trg Function Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Function Declaration</em>'.
	 * @see jointPackage_CPL2SPL.TrgFunctionDeclaration
	 * @generated
	 */
	EClass getTrgFunctionDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link jointPackage_CPL2SPL.TrgFunctionDeclaration#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Type</em>'.
	 * @see jointPackage_CPL2SPL.TrgFunctionDeclaration#getReturnType()
	 * @see #getTrgFunctionDeclaration()
	 * @generated
	 */
	EReference getTrgFunctionDeclaration_ReturnType();

	/**
	 * Returns the meta object for the containment reference list '{@link jointPackage_CPL2SPL.TrgFunctionDeclaration#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see jointPackage_CPL2SPL.TrgFunctionDeclaration#getArguments()
	 * @see #getTrgFunctionDeclaration()
	 * @generated
	 */
	EReference getTrgFunctionDeclaration_Arguments();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgRemoteFunctionDeclaration <em>Trg Remote Function Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Remote Function Declaration</em>'.
	 * @see jointPackage_CPL2SPL.TrgRemoteFunctionDeclaration
	 * @generated
	 */
	EClass getTrgRemoteFunctionDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.TrgRemoteFunctionDeclaration#getFunctionLocation <em>Function Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function Location</em>'.
	 * @see jointPackage_CPL2SPL.TrgRemoteFunctionDeclaration#getFunctionLocation()
	 * @see #getTrgRemoteFunctionDeclaration()
	 * @generated
	 */
	EAttribute getTrgRemoteFunctionDeclaration_FunctionLocation();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgLocalFunctionDeclaration <em>Trg Local Function Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Local Function Declaration</em>'.
	 * @see jointPackage_CPL2SPL.TrgLocalFunctionDeclaration
	 * @generated
	 */
	EClass getTrgLocalFunctionDeclaration();

	/**
	 * Returns the meta object for the containment reference list '{@link jointPackage_CPL2SPL.TrgLocalFunctionDeclaration#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see jointPackage_CPL2SPL.TrgLocalFunctionDeclaration#getStatements()
	 * @see #getTrgLocalFunctionDeclaration()
	 * @generated
	 */
	EReference getTrgLocalFunctionDeclaration_Statements();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgStructureDeclaration <em>Trg Structure Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Structure Declaration</em>'.
	 * @see jointPackage_CPL2SPL.TrgStructureDeclaration
	 * @generated
	 */
	EClass getTrgStructureDeclaration();

	/**
	 * Returns the meta object for the containment reference list '{@link jointPackage_CPL2SPL.TrgStructureDeclaration#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see jointPackage_CPL2SPL.TrgStructureDeclaration#getProperties()
	 * @see #getTrgStructureDeclaration()
	 * @generated
	 */
	EReference getTrgStructureDeclaration_Properties();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgFunctionCall <em>Trg Function Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Function Call</em>'.
	 * @see jointPackage_CPL2SPL.TrgFunctionCall
	 * @generated
	 */
	EClass getTrgFunctionCall();

	/**
	 * Returns the meta object for the reference '{@link jointPackage_CPL2SPL.TrgFunctionCall#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Function</em>'.
	 * @see jointPackage_CPL2SPL.TrgFunctionCall#getFunction()
	 * @see #getTrgFunctionCall()
	 * @generated
	 */
	EReference getTrgFunctionCall_Function();

	/**
	 * Returns the meta object for the containment reference list '{@link jointPackage_CPL2SPL.TrgFunctionCall#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see jointPackage_CPL2SPL.TrgFunctionCall#getParameters()
	 * @see #getTrgFunctionCall()
	 * @generated
	 */
	EReference getTrgFunctionCall_Parameters();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgStatement <em>Trg Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Statement</em>'.
	 * @see jointPackage_CPL2SPL.TrgStatement
	 * @generated
	 */
	EClass getTrgStatement();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgCompoundStat <em>Trg Compound Stat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Compound Stat</em>'.
	 * @see jointPackage_CPL2SPL.TrgCompoundStat
	 * @generated
	 */
	EClass getTrgCompoundStat();

	/**
	 * Returns the meta object for the containment reference list '{@link jointPackage_CPL2SPL.TrgCompoundStat#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see jointPackage_CPL2SPL.TrgCompoundStat#getStatements()
	 * @see #getTrgCompoundStat()
	 * @generated
	 */
	EReference getTrgCompoundStat_Statements();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgSetStat <em>Trg Set Stat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Set Stat</em>'.
	 * @see jointPackage_CPL2SPL.TrgSetStat
	 * @generated
	 */
	EClass getTrgSetStat();

	/**
	 * Returns the meta object for the containment reference '{@link jointPackage_CPL2SPL.TrgSetStat#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see jointPackage_CPL2SPL.TrgSetStat#getTarget()
	 * @see #getTrgSetStat()
	 * @generated
	 */
	EReference getTrgSetStat_Target();

	/**
	 * Returns the meta object for the containment reference '{@link jointPackage_CPL2SPL.TrgSetStat#getSetValue <em>Set Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Set Value</em>'.
	 * @see jointPackage_CPL2SPL.TrgSetStat#getSetValue()
	 * @see #getTrgSetStat()
	 * @generated
	 */
	EReference getTrgSetStat_SetValue();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgDeclarationStat <em>Trg Declaration Stat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Declaration Stat</em>'.
	 * @see jointPackage_CPL2SPL.TrgDeclarationStat
	 * @generated
	 */
	EClass getTrgDeclarationStat();

	/**
	 * Returns the meta object for the containment reference '{@link jointPackage_CPL2SPL.TrgDeclarationStat#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Declaration</em>'.
	 * @see jointPackage_CPL2SPL.TrgDeclarationStat#getDeclaration()
	 * @see #getTrgDeclarationStat()
	 * @generated
	 */
	EReference getTrgDeclarationStat_Declaration();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgReturnStat <em>Trg Return Stat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Return Stat</em>'.
	 * @see jointPackage_CPL2SPL.TrgReturnStat
	 * @generated
	 */
	EClass getTrgReturnStat();

	/**
	 * Returns the meta object for the containment reference '{@link jointPackage_CPL2SPL.TrgReturnStat#getReturnedValue <em>Returned Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Returned Value</em>'.
	 * @see jointPackage_CPL2SPL.TrgReturnStat#getReturnedValue()
	 * @see #getTrgReturnStat()
	 * @generated
	 */
	EReference getTrgReturnStat_ReturnedValue();

	/**
	 * Returns the meta object for the reference '{@link jointPackage_CPL2SPL.TrgReturnStat#getBranch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Branch</em>'.
	 * @see jointPackage_CPL2SPL.TrgReturnStat#getBranch()
	 * @see #getTrgReturnStat()
	 * @generated
	 */
	EReference getTrgReturnStat_Branch();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgIfStat <em>Trg If Stat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg If Stat</em>'.
	 * @see jointPackage_CPL2SPL.TrgIfStat
	 * @generated
	 */
	EClass getTrgIfStat();

	/**
	 * Returns the meta object for the containment reference '{@link jointPackage_CPL2SPL.TrgIfStat#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see jointPackage_CPL2SPL.TrgIfStat#getCondition()
	 * @see #getTrgIfStat()
	 * @generated
	 */
	EReference getTrgIfStat_Condition();

	/**
	 * Returns the meta object for the containment reference list '{@link jointPackage_CPL2SPL.TrgIfStat#getThenStatements <em>Then Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Then Statements</em>'.
	 * @see jointPackage_CPL2SPL.TrgIfStat#getThenStatements()
	 * @see #getTrgIfStat()
	 * @generated
	 */
	EReference getTrgIfStat_ThenStatements();

	/**
	 * Returns the meta object for the containment reference list '{@link jointPackage_CPL2SPL.TrgIfStat#getElseStatements <em>Else Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Else Statements</em>'.
	 * @see jointPackage_CPL2SPL.TrgIfStat#getElseStatements()
	 * @see #getTrgIfStat()
	 * @generated
	 */
	EReference getTrgIfStat_ElseStatements();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgWhenStat <em>Trg When Stat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg When Stat</em>'.
	 * @see jointPackage_CPL2SPL.TrgWhenStat
	 * @generated
	 */
	EClass getTrgWhenStat();

	/**
	 * Returns the meta object for the containment reference '{@link jointPackage_CPL2SPL.TrgWhenStat#getIdExp <em>Id Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Id Exp</em>'.
	 * @see jointPackage_CPL2SPL.TrgWhenStat#getIdExp()
	 * @see #getTrgWhenStat()
	 * @generated
	 */
	EReference getTrgWhenStat_IdExp();

	/**
	 * Returns the meta object for the containment reference list '{@link jointPackage_CPL2SPL.TrgWhenStat#getWhenHeaders <em>When Headers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>When Headers</em>'.
	 * @see jointPackage_CPL2SPL.TrgWhenStat#getWhenHeaders()
	 * @see #getTrgWhenStat()
	 * @generated
	 */
	EReference getTrgWhenStat_WhenHeaders();

	/**
	 * Returns the meta object for the containment reference list '{@link jointPackage_CPL2SPL.TrgWhenStat#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see jointPackage_CPL2SPL.TrgWhenStat#getStatements()
	 * @see #getTrgWhenStat()
	 * @generated
	 */
	EReference getTrgWhenStat_Statements();

	/**
	 * Returns the meta object for the containment reference list '{@link jointPackage_CPL2SPL.TrgWhenStat#getElseStatements <em>Else Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Else Statements</em>'.
	 * @see jointPackage_CPL2SPL.TrgWhenStat#getElseStatements()
	 * @see #getTrgWhenStat()
	 * @generated
	 */
	EReference getTrgWhenStat_ElseStatements();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgForeachStat <em>Trg Foreach Stat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Foreach Stat</em>'.
	 * @see jointPackage_CPL2SPL.TrgForeachStat
	 * @generated
	 */
	EClass getTrgForeachStat();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.TrgForeachStat#getIteratorName <em>Iterator Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iterator Name</em>'.
	 * @see jointPackage_CPL2SPL.TrgForeachStat#getIteratorName()
	 * @see #getTrgForeachStat()
	 * @generated
	 */
	EAttribute getTrgForeachStat_IteratorName();

	/**
	 * Returns the meta object for the containment reference '{@link jointPackage_CPL2SPL.TrgForeachStat#getSequenceExp <em>Sequence Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence Exp</em>'.
	 * @see jointPackage_CPL2SPL.TrgForeachStat#getSequenceExp()
	 * @see #getTrgForeachStat()
	 * @generated
	 */
	EReference getTrgForeachStat_SequenceExp();

	/**
	 * Returns the meta object for the containment reference list '{@link jointPackage_CPL2SPL.TrgForeachStat#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see jointPackage_CPL2SPL.TrgForeachStat#getStatements()
	 * @see #getTrgForeachStat()
	 * @generated
	 */
	EReference getTrgForeachStat_Statements();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgSelectStat <em>Trg Select Stat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Select Stat</em>'.
	 * @see jointPackage_CPL2SPL.TrgSelectStat
	 * @generated
	 */
	EClass getTrgSelectStat();

	/**
	 * Returns the meta object for the containment reference '{@link jointPackage_CPL2SPL.TrgSelectStat#getMatchedExp <em>Matched Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Matched Exp</em>'.
	 * @see jointPackage_CPL2SPL.TrgSelectStat#getMatchedExp()
	 * @see #getTrgSelectStat()
	 * @generated
	 */
	EReference getTrgSelectStat_MatchedExp();

	/**
	 * Returns the meta object for the containment reference list '{@link jointPackage_CPL2SPL.TrgSelectStat#getSelectCases <em>Select Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Select Cases</em>'.
	 * @see jointPackage_CPL2SPL.TrgSelectStat#getSelectCases()
	 * @see #getTrgSelectStat()
	 * @generated
	 */
	EReference getTrgSelectStat_SelectCases();

	/**
	 * Returns the meta object for the containment reference '{@link jointPackage_CPL2SPL.TrgSelectStat#getSelectDefault <em>Select Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Select Default</em>'.
	 * @see jointPackage_CPL2SPL.TrgSelectStat#getSelectDefault()
	 * @see #getTrgSelectStat()
	 * @generated
	 */
	EReference getTrgSelectStat_SelectDefault();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgFunctionCallStat <em>Trg Function Call Stat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Function Call Stat</em>'.
	 * @see jointPackage_CPL2SPL.TrgFunctionCallStat
	 * @generated
	 */
	EClass getTrgFunctionCallStat();

	/**
	 * Returns the meta object for the containment reference '{@link jointPackage_CPL2SPL.TrgFunctionCallStat#getFunctionCall <em>Function Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Function Call</em>'.
	 * @see jointPackage_CPL2SPL.TrgFunctionCallStat#getFunctionCall()
	 * @see #getTrgFunctionCallStat()
	 * @generated
	 */
	EReference getTrgFunctionCallStat_FunctionCall();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgContinueStat <em>Trg Continue Stat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Continue Stat</em>'.
	 * @see jointPackage_CPL2SPL.TrgContinueStat
	 * @generated
	 */
	EClass getTrgContinueStat();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgBreakStat <em>Trg Break Stat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Break Stat</em>'.
	 * @see jointPackage_CPL2SPL.TrgBreakStat
	 * @generated
	 */
	EClass getTrgBreakStat();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgPushStat <em>Trg Push Stat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Push Stat</em>'.
	 * @see jointPackage_CPL2SPL.TrgPushStat
	 * @generated
	 */
	EClass getTrgPushStat();

	/**
	 * Returns the meta object for the containment reference '{@link jointPackage_CPL2SPL.TrgPushStat#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see jointPackage_CPL2SPL.TrgPushStat#getTarget()
	 * @see #getTrgPushStat()
	 * @generated
	 */
	EReference getTrgPushStat_Target();

	/**
	 * Returns the meta object for the containment reference '{@link jointPackage_CPL2SPL.TrgPushStat#getPushedValue <em>Pushed Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pushed Value</em>'.
	 * @see jointPackage_CPL2SPL.TrgPushStat#getPushedValue()
	 * @see #getTrgPushStat()
	 * @generated
	 */
	EReference getTrgPushStat_PushedValue();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgWhenHeader <em>Trg When Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg When Header</em>'.
	 * @see jointPackage_CPL2SPL.TrgWhenHeader
	 * @generated
	 */
	EClass getTrgWhenHeader();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.TrgWhenHeader#getHeaderId <em>Header Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header Id</em>'.
	 * @see jointPackage_CPL2SPL.TrgWhenHeader#getHeaderId()
	 * @see #getTrgWhenHeader()
	 * @generated
	 */
	EAttribute getTrgWhenHeader_HeaderId();

	/**
	 * Returns the meta object for the containment reference '{@link jointPackage_CPL2SPL.TrgWhenHeader#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see jointPackage_CPL2SPL.TrgWhenHeader#getValue()
	 * @see #getTrgWhenHeader()
	 * @generated
	 */
	EReference getTrgWhenHeader_Value();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgSelectMember <em>Trg Select Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Select Member</em>'.
	 * @see jointPackage_CPL2SPL.TrgSelectMember
	 * @generated
	 */
	EClass getTrgSelectMember();

	/**
	 * Returns the meta object for the containment reference list '{@link jointPackage_CPL2SPL.TrgSelectMember#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see jointPackage_CPL2SPL.TrgSelectMember#getStatements()
	 * @see #getTrgSelectMember()
	 * @generated
	 */
	EReference getTrgSelectMember_Statements();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgSelectDefault <em>Trg Select Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Select Default</em>'.
	 * @see jointPackage_CPL2SPL.TrgSelectDefault
	 * @generated
	 */
	EClass getTrgSelectDefault();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgSelectCase <em>Trg Select Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Select Case</em>'.
	 * @see jointPackage_CPL2SPL.TrgSelectCase
	 * @generated
	 */
	EClass getTrgSelectCase();

	/**
	 * Returns the meta object for the containment reference list '{@link jointPackage_CPL2SPL.TrgSelectCase#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see jointPackage_CPL2SPL.TrgSelectCase#getValues()
	 * @see #getTrgSelectCase()
	 * @generated
	 */
	EReference getTrgSelectCase_Values();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgExpression <em>Trg Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Expression</em>'.
	 * @see jointPackage_CPL2SPL.TrgExpression
	 * @generated
	 */
	EClass getTrgExpression();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgConstantExp <em>Trg Constant Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Constant Exp</em>'.
	 * @see jointPackage_CPL2SPL.TrgConstantExp
	 * @generated
	 */
	EClass getTrgConstantExp();

	/**
	 * Returns the meta object for the containment reference '{@link jointPackage_CPL2SPL.TrgConstantExp#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see jointPackage_CPL2SPL.TrgConstantExp#getValue()
	 * @see #getTrgConstantExp()
	 * @generated
	 */
	EReference getTrgConstantExp_Value();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgOperatorExp <em>Trg Operator Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Operator Exp</em>'.
	 * @see jointPackage_CPL2SPL.TrgOperatorExp
	 * @generated
	 */
	EClass getTrgOperatorExp();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.TrgOperatorExp#getOpName <em>Op Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op Name</em>'.
	 * @see jointPackage_CPL2SPL.TrgOperatorExp#getOpName()
	 * @see #getTrgOperatorExp()
	 * @generated
	 */
	EAttribute getTrgOperatorExp_OpName();

	/**
	 * Returns the meta object for the containment reference '{@link jointPackage_CPL2SPL.TrgOperatorExp#getLeftExp <em>Left Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Exp</em>'.
	 * @see jointPackage_CPL2SPL.TrgOperatorExp#getLeftExp()
	 * @see #getTrgOperatorExp()
	 * @generated
	 */
	EReference getTrgOperatorExp_LeftExp();

	/**
	 * Returns the meta object for the containment reference '{@link jointPackage_CPL2SPL.TrgOperatorExp#getRightExp <em>Right Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Exp</em>'.
	 * @see jointPackage_CPL2SPL.TrgOperatorExp#getRightExp()
	 * @see #getTrgOperatorExp()
	 * @generated
	 */
	EReference getTrgOperatorExp_RightExp();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgForwardExp <em>Trg Forward Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Forward Exp</em>'.
	 * @see jointPackage_CPL2SPL.TrgForwardExp
	 * @generated
	 */
	EClass getTrgForwardExp();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.TrgForwardExp#isIsParallel <em>Is Parallel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Parallel</em>'.
	 * @see jointPackage_CPL2SPL.TrgForwardExp#isIsParallel()
	 * @see #getTrgForwardExp()
	 * @generated
	 */
	EAttribute getTrgForwardExp_IsParallel();

	/**
	 * Returns the meta object for the containment reference '{@link jointPackage_CPL2SPL.TrgForwardExp#getExp <em>Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exp</em>'.
	 * @see jointPackage_CPL2SPL.TrgForwardExp#getExp()
	 * @see #getTrgForwardExp()
	 * @generated
	 */
	EReference getTrgForwardExp_Exp();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgWithExp <em>Trg With Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg With Exp</em>'.
	 * @see jointPackage_CPL2SPL.TrgWithExp
	 * @generated
	 */
	EClass getTrgWithExp();

	/**
	 * Returns the meta object for the containment reference '{@link jointPackage_CPL2SPL.TrgWithExp#getExp <em>Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exp</em>'.
	 * @see jointPackage_CPL2SPL.TrgWithExp#getExp()
	 * @see #getTrgWithExp()
	 * @generated
	 */
	EReference getTrgWithExp_Exp();

	/**
	 * Returns the meta object for the containment reference list '{@link jointPackage_CPL2SPL.TrgWithExp#getMsgFields <em>Msg Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Msg Fields</em>'.
	 * @see jointPackage_CPL2SPL.TrgWithExp#getMsgFields()
	 * @see #getTrgWithExp()
	 * @generated
	 */
	EReference getTrgWithExp_MsgFields();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgBlockExp <em>Trg Block Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Block Exp</em>'.
	 * @see jointPackage_CPL2SPL.TrgBlockExp
	 * @generated
	 */
	EClass getTrgBlockExp();

	/**
	 * Returns the meta object for the containment reference '{@link jointPackage_CPL2SPL.TrgBlockExp#getExp <em>Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exp</em>'.
	 * @see jointPackage_CPL2SPL.TrgBlockExp#getExp()
	 * @see #getTrgBlockExp()
	 * @generated
	 */
	EReference getTrgBlockExp_Exp();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgReasonExp <em>Trg Reason Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Reason Exp</em>'.
	 * @see jointPackage_CPL2SPL.TrgReasonExp
	 * @generated
	 */
	EClass getTrgReasonExp();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgBODYExp <em>Trg BODY Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg BODY Exp</em>'.
	 * @see jointPackage_CPL2SPL.TrgBODYExp
	 * @generated
	 */
	EClass getTrgBODYExp();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgRequestURIExp <em>Trg Request URI Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Request URI Exp</em>'.
	 * @see jointPackage_CPL2SPL.TrgRequestURIExp
	 * @generated
	 */
	EClass getTrgRequestURIExp();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgPopExp <em>Trg Pop Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Pop Exp</em>'.
	 * @see jointPackage_CPL2SPL.TrgPopExp
	 * @generated
	 */
	EClass getTrgPopExp();

	/**
	 * Returns the meta object for the containment reference '{@link jointPackage_CPL2SPL.TrgPopExp#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see jointPackage_CPL2SPL.TrgPopExp#getSource()
	 * @see #getTrgPopExp()
	 * @generated
	 */
	EReference getTrgPopExp_Source();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgFunctionCallExp <em>Trg Function Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Function Call Exp</em>'.
	 * @see jointPackage_CPL2SPL.TrgFunctionCallExp
	 * @generated
	 */
	EClass getTrgFunctionCallExp();

	/**
	 * Returns the meta object for the containment reference '{@link jointPackage_CPL2SPL.TrgFunctionCallExp#getFunctionCall <em>Function Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Function Call</em>'.
	 * @see jointPackage_CPL2SPL.TrgFunctionCallExp#getFunctionCall()
	 * @see #getTrgFunctionCallExp()
	 * @generated
	 */
	EReference getTrgFunctionCallExp_FunctionCall();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgPlace <em>Trg Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Place</em>'.
	 * @see jointPackage_CPL2SPL.TrgPlace
	 * @generated
	 */
	EClass getTrgPlace();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgSIPHeaderPlace <em>Trg SIP Header Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg SIP Header Place</em>'.
	 * @see jointPackage_CPL2SPL.TrgSIPHeaderPlace
	 * @generated
	 */
	EClass getTrgSIPHeaderPlace();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.TrgSIPHeaderPlace#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header</em>'.
	 * @see jointPackage_CPL2SPL.TrgSIPHeaderPlace#getHeader()
	 * @see #getTrgSIPHeaderPlace()
	 * @generated
	 */
	EAttribute getTrgSIPHeaderPlace_Header();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgVariablePlace <em>Trg Variable Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Variable Place</em>'.
	 * @see jointPackage_CPL2SPL.TrgVariablePlace
	 * @generated
	 */
	EClass getTrgVariablePlace();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgPropertyCallPlace <em>Trg Property Call Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Property Call Place</em>'.
	 * @see jointPackage_CPL2SPL.TrgPropertyCallPlace
	 * @generated
	 */
	EClass getTrgPropertyCallPlace();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.TrgPropertyCallPlace#getPropName <em>Prop Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prop Name</em>'.
	 * @see jointPackage_CPL2SPL.TrgPropertyCallPlace#getPropName()
	 * @see #getTrgPropertyCallPlace()
	 * @generated
	 */
	EAttribute getTrgPropertyCallPlace_PropName();

	/**
	 * Returns the meta object for the containment reference '{@link jointPackage_CPL2SPL.TrgPropertyCallPlace#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see jointPackage_CPL2SPL.TrgPropertyCallPlace#getSource()
	 * @see #getTrgPropertyCallPlace()
	 * @generated
	 */
	EReference getTrgPropertyCallPlace_Source();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgVariable <em>Trg Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Variable</em>'.
	 * @see jointPackage_CPL2SPL.TrgVariable
	 * @generated
	 */
	EClass getTrgVariable();

	/**
	 * Returns the meta object for the reference '{@link jointPackage_CPL2SPL.TrgVariable#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see jointPackage_CPL2SPL.TrgVariable#getSource()
	 * @see #getTrgVariable()
	 * @generated
	 */
	EReference getTrgVariable_Source();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgMessageField <em>Trg Message Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Message Field</em>'.
	 * @see jointPackage_CPL2SPL.TrgMessageField
	 * @generated
	 */
	EClass getTrgMessageField();

	/**
	 * Returns the meta object for the containment reference '{@link jointPackage_CPL2SPL.TrgMessageField#getExp <em>Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exp</em>'.
	 * @see jointPackage_CPL2SPL.TrgMessageField#getExp()
	 * @see #getTrgMessageField()
	 * @generated
	 */
	EReference getTrgMessageField_Exp();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgReasonMessageField <em>Trg Reason Message Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Reason Message Field</em>'.
	 * @see jointPackage_CPL2SPL.TrgReasonMessageField
	 * @generated
	 */
	EClass getTrgReasonMessageField();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgHeadedMessageField <em>Trg Headed Message Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Headed Message Field</em>'.
	 * @see jointPackage_CPL2SPL.TrgHeadedMessageField
	 * @generated
	 */
	EClass getTrgHeadedMessageField();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.TrgHeadedMessageField#getHeaderId <em>Header Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header Id</em>'.
	 * @see jointPackage_CPL2SPL.TrgHeadedMessageField#getHeaderId()
	 * @see #getTrgHeadedMessageField()
	 * @generated
	 */
	EAttribute getTrgHeadedMessageField_HeaderId();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgConstant <em>Trg Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Constant</em>'.
	 * @see jointPackage_CPL2SPL.TrgConstant
	 * @generated
	 */
	EClass getTrgConstant();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgBooleanConstant <em>Trg Boolean Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Boolean Constant</em>'.
	 * @see jointPackage_CPL2SPL.TrgBooleanConstant
	 * @generated
	 */
	EClass getTrgBooleanConstant();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.TrgBooleanConstant#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see jointPackage_CPL2SPL.TrgBooleanConstant#isValue()
	 * @see #getTrgBooleanConstant()
	 * @generated
	 */
	EAttribute getTrgBooleanConstant_Value();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgIntegerConstant <em>Trg Integer Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Integer Constant</em>'.
	 * @see jointPackage_CPL2SPL.TrgIntegerConstant
	 * @generated
	 */
	EClass getTrgIntegerConstant();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.TrgIntegerConstant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see jointPackage_CPL2SPL.TrgIntegerConstant#getValue()
	 * @see #getTrgIntegerConstant()
	 * @generated
	 */
	EAttribute getTrgIntegerConstant_Value();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgStringConstant <em>Trg String Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg String Constant</em>'.
	 * @see jointPackage_CPL2SPL.TrgStringConstant
	 * @generated
	 */
	EClass getTrgStringConstant();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.TrgStringConstant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see jointPackage_CPL2SPL.TrgStringConstant#getValue()
	 * @see #getTrgStringConstant()
	 * @generated
	 */
	EAttribute getTrgStringConstant_Value();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgURIConstant <em>Trg URI Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg URI Constant</em>'.
	 * @see jointPackage_CPL2SPL.TrgURIConstant
	 * @generated
	 */
	EClass getTrgURIConstant();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.TrgURIConstant#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see jointPackage_CPL2SPL.TrgURIConstant#getUri()
	 * @see #getTrgURIConstant()
	 * @generated
	 */
	EAttribute getTrgURIConstant_Uri();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgSequenceConstant <em>Trg Sequence Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Sequence Constant</em>'.
	 * @see jointPackage_CPL2SPL.TrgSequenceConstant
	 * @generated
	 */
	EClass getTrgSequenceConstant();

	/**
	 * Returns the meta object for the containment reference list '{@link jointPackage_CPL2SPL.TrgSequenceConstant#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see jointPackage_CPL2SPL.TrgSequenceConstant#getValues()
	 * @see #getTrgSequenceConstant()
	 * @generated
	 */
	EReference getTrgSequenceConstant_Values();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgResponseConstant <em>Trg Response Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Response Constant</em>'.
	 * @see jointPackage_CPL2SPL.TrgResponseConstant
	 * @generated
	 */
	EClass getTrgResponseConstant();

	/**
	 * Returns the meta object for the containment reference '{@link jointPackage_CPL2SPL.TrgResponseConstant#getResponse <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Response</em>'.
	 * @see jointPackage_CPL2SPL.TrgResponseConstant#getResponse()
	 * @see #getTrgResponseConstant()
	 * @generated
	 */
	EReference getTrgResponseConstant_Response();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgResponse <em>Trg Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Response</em>'.
	 * @see jointPackage_CPL2SPL.TrgResponse
	 * @generated
	 */
	EClass getTrgResponse();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgSuccessResponse <em>Trg Success Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Success Response</em>'.
	 * @see jointPackage_CPL2SPL.TrgSuccessResponse
	 * @generated
	 */
	EClass getTrgSuccessResponse();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_CPL2SPL.TrgSuccessResponse#getSuccessKind <em>Success Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Success Kind</em>'.
	 * @see jointPackage_CPL2SPL.TrgSuccessResponse#getSuccessKind()
	 * @see #getTrgSuccessResponse()
	 * @generated
	 */
	EAttribute getTrgSuccessResponse_SuccessKind();

	/**
	 * Returns the meta object for class '{@link jointPackage_CPL2SPL.TrgErrorResponse <em>Trg Error Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Error Response</em>'.
	 * @see jointPackage_CPL2SPL.TrgErrorResponse
	 * @generated
	 */
	EClass getTrgErrorResponse();

	/**
	 * Returns the meta object for enum '{@link jointPackage_CPL2SPL.Direction <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Direction</em>'.
	 * @see jointPackage_CPL2SPL.Direction
	 * @generated
	 */
	EEnum getDirection();

	/**
	 * Returns the meta object for enum '{@link jointPackage_CPL2SPL.SIPMethod <em>SIP Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SIP Method</em>'.
	 * @see jointPackage_CPL2SPL.SIPMethod
	 * @generated
	 */
	EEnum getSIPMethod();

	/**
	 * Returns the meta object for enum '{@link jointPackage_CPL2SPL.ControlMethod <em>Control Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Control Method</em>'.
	 * @see jointPackage_CPL2SPL.ControlMethod
	 * @generated
	 */
	EEnum getControlMethod();

	/**
	 * Returns the meta object for enum '{@link jointPackage_CPL2SPL.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Primitive Type</em>'.
	 * @see jointPackage_CPL2SPL.PrimitiveType
	 * @generated
	 */
	EEnum getPrimitiveType();

	/**
	 * Returns the meta object for enum '{@link jointPackage_CPL2SPL.Modifier <em>Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Modifier</em>'.
	 * @see jointPackage_CPL2SPL.Modifier
	 * @generated
	 */
	EEnum getModifier();

	/**
	 * Returns the meta object for enum '{@link jointPackage_CPL2SPL.FunctionLocation <em>Function Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Function Location</em>'.
	 * @see jointPackage_CPL2SPL.FunctionLocation
	 * @generated
	 */
	EEnum getFunctionLocation();

	/**
	 * Returns the meta object for enum '{@link jointPackage_CPL2SPL.SIPHeader <em>SIP Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SIP Header</em>'.
	 * @see jointPackage_CPL2SPL.SIPHeader
	 * @generated
	 */
	EEnum getSIPHeader();

	/**
	 * Returns the meta object for enum '{@link jointPackage_CPL2SPL.SuccessKind <em>Success Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Success Kind</em>'.
	 * @see jointPackage_CPL2SPL.SuccessKind
	 * @generated
	 */
	EEnum getSuccessKind();

	/**
	 * Returns the meta object for enum '{@link jointPackage_CPL2SPL.ClientErrorKind <em>Client Error Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Client Error Kind</em>'.
	 * @see jointPackage_CPL2SPL.ClientErrorKind
	 * @generated
	 */
	EEnum getClientErrorKind();

	/**
	 * Returns the meta object for enum '{@link jointPackage_CPL2SPL.GlobalErrorKind <em>Global Error Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Global Error Kind</em>'.
	 * @see jointPackage_CPL2SPL.GlobalErrorKind
	 * @generated
	 */
	EEnum getGlobalErrorKind();

	/**
	 * Returns the meta object for enum '{@link jointPackage_CPL2SPL.RedirectionErrorKind <em>Redirection Error Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Redirection Error Kind</em>'.
	 * @see jointPackage_CPL2SPL.RedirectionErrorKind
	 * @generated
	 */
	EEnum getRedirectionErrorKind();

	/**
	 * Returns the meta object for enum '{@link jointPackage_CPL2SPL.ServerErrorKind <em>Server Error Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Server Error Kind</em>'.
	 * @see jointPackage_CPL2SPL.ServerErrorKind
	 * @generated
	 */
	EEnum getServerErrorKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JointPackage_CPL2SPLFactory getJointPackage_CPL2SPLFactory();

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
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.JointMMImpl <em>Joint MM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.JointMMImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getJointMM()
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
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.SrcCPLModelImpl <em>Src CPL Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.SrcCPLModelImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSrcCPLModel()
		 * @generated
		 */
		EClass SRC_CPL_MODEL = eINSTANCE.getSrcCPLModel();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_CPL_MODEL__ELEMENTS = eINSTANCE.getSrcCPLModel_Elements();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.SrcCPLImpl <em>Src CPL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.SrcCPLImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSrcCPL()
		 * @generated
		 */
		EClass SRC_CPL = eINSTANCE.getSrcCPL();

		/**
		 * The meta object literal for the '<em><b>Sub Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_CPL__SUB_ACTIONS = eINSTANCE.getSrcCPL_SubActions();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_CPL__OUTGOING = eINSTANCE.getSrcCPL_Outgoing();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_CPL__INCOMING = eINSTANCE.getSrcCPL_Incoming();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.SrcAddressSwitchImpl <em>Src Address Switch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.SrcAddressSwitchImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSrcAddressSwitch()
		 * @generated
		 */
		EClass SRC_ADDRESS_SWITCH = eINSTANCE.getSrcAddressSwitch();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_ADDRESS_SWITCH__FIELD = eINSTANCE.getSrcAddressSwitch_Field();

		/**
		 * The meta object literal for the '<em><b>Sub Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_ADDRESS_SWITCH__SUB_FIELD = eINSTANCE.getSrcAddressSwitch_SubField();

		/**
		 * The meta object literal for the '<em><b>Addresses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_ADDRESS_SWITCH__ADDRESSES = eINSTANCE.getSrcAddressSwitch_Addresses();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.SrcStringSwitchImpl <em>Src String Switch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.SrcStringSwitchImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSrcStringSwitch()
		 * @generated
		 */
		EClass SRC_STRING_SWITCH = eINSTANCE.getSrcStringSwitch();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_STRING_SWITCH__FIELD = eINSTANCE.getSrcStringSwitch_Field();

		/**
		 * The meta object literal for the '<em><b>Strings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_STRING_SWITCH__STRINGS = eINSTANCE.getSrcStringSwitch_Strings();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.SrcLanguageSwitchImpl <em>Src Language Switch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.SrcLanguageSwitchImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSrcLanguageSwitch()
		 * @generated
		 */
		EClass SRC_LANGUAGE_SWITCH = eINSTANCE.getSrcLanguageSwitch();

		/**
		 * The meta object literal for the '<em><b>Languages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_LANGUAGE_SWITCH__LANGUAGES = eINSTANCE.getSrcLanguageSwitch_Languages();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.SrcTimeSwitchImpl <em>Src Time Switch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.SrcTimeSwitchImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSrcTimeSwitch()
		 * @generated
		 */
		EClass SRC_TIME_SWITCH = eINSTANCE.getSrcTimeSwitch();

		/**
		 * The meta object literal for the '<em><b>Tzid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_TIME_SWITCH__TZID = eINSTANCE.getSrcTimeSwitch_Tzid();

		/**
		 * The meta object literal for the '<em><b>Tzurl</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_TIME_SWITCH__TZURL = eINSTANCE.getSrcTimeSwitch_Tzurl();

		/**
		 * The meta object literal for the '<em><b>Times</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_TIME_SWITCH__TIMES = eINSTANCE.getSrcTimeSwitch_Times();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.SrcPrioritySwitchImpl <em>Src Priority Switch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.SrcPrioritySwitchImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSrcPrioritySwitch()
		 * @generated
		 */
		EClass SRC_PRIORITY_SWITCH = eINSTANCE.getSrcPrioritySwitch();

		/**
		 * The meta object literal for the '<em><b>Priorities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_PRIORITY_SWITCH__PRIORITIES = eINSTANCE.getSrcPrioritySwitch_Priorities();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.SrcProxyImpl <em>Src Proxy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.SrcProxyImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSrcProxy()
		 * @generated
		 */
		EClass SRC_PROXY = eINSTANCE.getSrcProxy();

		/**
		 * The meta object literal for the '<em><b>Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_PROXY__TIMEOUT = eINSTANCE.getSrcProxy_Timeout();

		/**
		 * The meta object literal for the '<em><b>Recurse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_PROXY__RECURSE = eINSTANCE.getSrcProxy_Recurse();

		/**
		 * The meta object literal for the '<em><b>Ordering</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_PROXY__ORDERING = eINSTANCE.getSrcProxy_Ordering();

		/**
		 * The meta object literal for the '<em><b>Busy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_PROXY__BUSY = eINSTANCE.getSrcProxy_Busy();

		/**
		 * The meta object literal for the '<em><b>No Answer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_PROXY__NO_ANSWER = eINSTANCE.getSrcProxy_NoAnswer();

		/**
		 * The meta object literal for the '<em><b>Redirection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_PROXY__REDIRECTION = eINSTANCE.getSrcProxy_Redirection();

		/**
		 * The meta object literal for the '<em><b>Failure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_PROXY__FAILURE = eINSTANCE.getSrcProxy_Failure();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_PROXY__DEFAULT = eINSTANCE.getSrcProxy_Default();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.SrcRedirectImpl <em>Src Redirect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.SrcRedirectImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSrcRedirect()
		 * @generated
		 */
		EClass SRC_REDIRECT = eINSTANCE.getSrcRedirect();

		/**
		 * The meta object literal for the '<em><b>Permanent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_REDIRECT__PERMANENT = eINSTANCE.getSrcRedirect_Permanent();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.SrcRejectImpl <em>Src Reject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.SrcRejectImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSrcReject()
		 * @generated
		 */
		EClass SRC_REJECT = eINSTANCE.getSrcReject();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_REJECT__STATUS = eINSTANCE.getSrcReject_Status();

		/**
		 * The meta object literal for the '<em><b>Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_REJECT__REASON = eINSTANCE.getSrcReject_Reason();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.SrcElementImpl <em>Src Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.SrcElementImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSrcElement()
		 * @generated
		 */
		EClass SRC_ELEMENT = eINSTANCE.getSrcElement();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.SrcNodeContainerImpl <em>Src Node Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.SrcNodeContainerImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSrcNodeContainer()
		 * @generated
		 */
		EClass SRC_NODE_CONTAINER = eINSTANCE.getSrcNodeContainer();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_NODE_CONTAINER__CONTENTS = eINSTANCE.getSrcNodeContainer_Contents();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.SrcSubActionImpl <em>Src Sub Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.SrcSubActionImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSrcSubAction()
		 * @generated
		 */
		EClass SRC_SUB_ACTION = eINSTANCE.getSrcSubAction();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_SUB_ACTION__ID = eINSTANCE.getSrcSubAction_Id();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.SrcOutgoingImpl <em>Src Outgoing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.SrcOutgoingImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSrcOutgoing()
		 * @generated
		 */
		EClass SRC_OUTGOING = eINSTANCE.getSrcOutgoing();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.SrcIncomingImpl <em>Src Incoming</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.SrcIncomingImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSrcIncoming()
		 * @generated
		 */
		EClass SRC_INCOMING = eINSTANCE.getSrcIncoming();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.SrcNotPresentImpl <em>Src Not Present</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.SrcNotPresentImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSrcNotPresent()
		 * @generated
		 */
		EClass SRC_NOT_PRESENT = eINSTANCE.getSrcNotPresent();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.SrcOtherwiseImpl <em>Src Otherwise</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.SrcOtherwiseImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSrcOtherwise()
		 * @generated
		 */
		EClass SRC_OTHERWISE = eINSTANCE.getSrcOtherwise();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.SrcSwitchedAddressImpl <em>Src Switched Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.SrcSwitchedAddressImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSrcSwitchedAddress()
		 * @generated
		 */
		EClass SRC_SWITCHED_ADDRESS = eINSTANCE.getSrcSwitchedAddress();

		/**
		 * The meta object literal for the '<em><b>Is</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_SWITCHED_ADDRESS__IS = eINSTANCE.getSrcSwitchedAddress_Is();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_SWITCHED_ADDRESS__CONTAINS = eINSTANCE.getSrcSwitchedAddress_Contains();

		/**
		 * The meta object literal for the '<em><b>Sub Domain Of</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_SWITCHED_ADDRESS__SUB_DOMAIN_OF = eINSTANCE.getSrcSwitchedAddress_SubDomainOf();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.SrcSwitchedStringImpl <em>Src Switched String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.SrcSwitchedStringImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSrcSwitchedString()
		 * @generated
		 */
		EClass SRC_SWITCHED_STRING = eINSTANCE.getSrcSwitchedString();

		/**
		 * The meta object literal for the '<em><b>Is</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_SWITCHED_STRING__IS = eINSTANCE.getSrcSwitchedString_Is();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_SWITCHED_STRING__CONTAINS = eINSTANCE.getSrcSwitchedString_Contains();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.SrcSwitchedLanguageImpl <em>Src Switched Language</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.SrcSwitchedLanguageImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSrcSwitchedLanguage()
		 * @generated
		 */
		EClass SRC_SWITCHED_LANGUAGE = eINSTANCE.getSrcSwitchedLanguage();

		/**
		 * The meta object literal for the '<em><b>Matches</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_SWITCHED_LANGUAGE__MATCHES = eINSTANCE.getSrcSwitchedLanguage_Matches();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.SrcSwitchedTimeImpl <em>Src Switched Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.SrcSwitchedTimeImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSrcSwitchedTime()
		 * @generated
		 */
		EClass SRC_SWITCHED_TIME = eINSTANCE.getSrcSwitchedTime();

		/**
		 * The meta object literal for the '<em><b>Dtstart</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_SWITCHED_TIME__DTSTART = eINSTANCE.getSrcSwitchedTime_Dtstart();

		/**
		 * The meta object literal for the '<em><b>Dtend</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_SWITCHED_TIME__DTEND = eINSTANCE.getSrcSwitchedTime_Dtend();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_SWITCHED_TIME__DURATION = eINSTANCE.getSrcSwitchedTime_Duration();

		/**
		 * The meta object literal for the '<em><b>Freq</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_SWITCHED_TIME__FREQ = eINSTANCE.getSrcSwitchedTime_Freq();

		/**
		 * The meta object literal for the '<em><b>Until</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_SWITCHED_TIME__UNTIL = eINSTANCE.getSrcSwitchedTime_Until();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_SWITCHED_TIME__COUNT = eINSTANCE.getSrcSwitchedTime_Count();

		/**
		 * The meta object literal for the '<em><b>Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_SWITCHED_TIME__INTERVAL = eINSTANCE.getSrcSwitchedTime_Interval();

		/**
		 * The meta object literal for the '<em><b>By Second</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_SWITCHED_TIME__BY_SECOND = eINSTANCE.getSrcSwitchedTime_BySecond();

		/**
		 * The meta object literal for the '<em><b>By Minute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_SWITCHED_TIME__BY_MINUTE = eINSTANCE.getSrcSwitchedTime_ByMinute();

		/**
		 * The meta object literal for the '<em><b>By Hour</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_SWITCHED_TIME__BY_HOUR = eINSTANCE.getSrcSwitchedTime_ByHour();

		/**
		 * The meta object literal for the '<em><b>By Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_SWITCHED_TIME__BY_DAY = eINSTANCE.getSrcSwitchedTime_ByDay();

		/**
		 * The meta object literal for the '<em><b>By Month Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_SWITCHED_TIME__BY_MONTH_DAY = eINSTANCE.getSrcSwitchedTime_ByMonthDay();

		/**
		 * The meta object literal for the '<em><b>By Year Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_SWITCHED_TIME__BY_YEAR_DAY = eINSTANCE.getSrcSwitchedTime_ByYearDay();

		/**
		 * The meta object literal for the '<em><b>By Week No</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_SWITCHED_TIME__BY_WEEK_NO = eINSTANCE.getSrcSwitchedTime_ByWeekNo();

		/**
		 * The meta object literal for the '<em><b>By Month</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_SWITCHED_TIME__BY_MONTH = eINSTANCE.getSrcSwitchedTime_ByMonth();

		/**
		 * The meta object literal for the '<em><b>Wkst</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_SWITCHED_TIME__WKST = eINSTANCE.getSrcSwitchedTime_Wkst();

		/**
		 * The meta object literal for the '<em><b>By Set Pos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_SWITCHED_TIME__BY_SET_POS = eINSTANCE.getSrcSwitchedTime_BySetPos();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.SrcSwitchedPriorityImpl <em>Src Switched Priority</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.SrcSwitchedPriorityImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSrcSwitchedPriority()
		 * @generated
		 */
		EClass SRC_SWITCHED_PRIORITY = eINSTANCE.getSrcSwitchedPriority();

		/**
		 * The meta object literal for the '<em><b>Less</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_SWITCHED_PRIORITY__LESS = eINSTANCE.getSrcSwitchedPriority_Less();

		/**
		 * The meta object literal for the '<em><b>Greater</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_SWITCHED_PRIORITY__GREATER = eINSTANCE.getSrcSwitchedPriority_Greater();

		/**
		 * The meta object literal for the '<em><b>Equal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_SWITCHED_PRIORITY__EQUAL = eINSTANCE.getSrcSwitchedPriority_Equal();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.SrcBusyImpl <em>Src Busy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.SrcBusyImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSrcBusy()
		 * @generated
		 */
		EClass SRC_BUSY = eINSTANCE.getSrcBusy();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.SrcNoAnswerImpl <em>Src No Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.SrcNoAnswerImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSrcNoAnswer()
		 * @generated
		 */
		EClass SRC_NO_ANSWER = eINSTANCE.getSrcNoAnswer();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.SrcRedirectionImpl <em>Src Redirection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.SrcRedirectionImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSrcRedirection()
		 * @generated
		 */
		EClass SRC_REDIRECTION = eINSTANCE.getSrcRedirection();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.SrcFailureImpl <em>Src Failure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.SrcFailureImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSrcFailure()
		 * @generated
		 */
		EClass SRC_FAILURE = eINSTANCE.getSrcFailure();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.SrcDefaultImpl <em>Src Default</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.SrcDefaultImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSrcDefault()
		 * @generated
		 */
		EClass SRC_DEFAULT = eINSTANCE.getSrcDefault();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.SrcNodeImpl <em>Src Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.SrcNodeImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSrcNode()
		 * @generated
		 */
		EClass SRC_NODE = eINSTANCE.getSrcNode();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.SrcSwitchImpl <em>Src Switch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.SrcSwitchImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSrcSwitch()
		 * @generated
		 */
		EClass SRC_SWITCH = eINSTANCE.getSrcSwitch();

		/**
		 * The meta object literal for the '<em><b>Not Present</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_SWITCH__NOT_PRESENT = eINSTANCE.getSrcSwitch_NotPresent();

		/**
		 * The meta object literal for the '<em><b>Otherwise</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_SWITCH__OTHERWISE = eINSTANCE.getSrcSwitch_Otherwise();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.SrcLocationImpl <em>Src Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.SrcLocationImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSrcLocation()
		 * @generated
		 */
		EClass SRC_LOCATION = eINSTANCE.getSrcLocation();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_LOCATION__URL = eINSTANCE.getSrcLocation_Url();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_LOCATION__PRIORITY = eINSTANCE.getSrcLocation_Priority();

		/**
		 * The meta object literal for the '<em><b>Clear</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_LOCATION__CLEAR = eINSTANCE.getSrcLocation_Clear();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.SrcSubCallImpl <em>Src Sub Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.SrcSubCallImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSrcSubCall()
		 * @generated
		 */
		EClass SRC_SUB_CALL = eINSTANCE.getSrcSubCall();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_SUB_CALL__REF = eINSTANCE.getSrcSubCall_Ref();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.SrcActionImpl <em>Src Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.SrcActionImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSrcAction()
		 * @generated
		 */
		EClass SRC_ACTION = eINSTANCE.getSrcAction();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.SrcSignallingActionImpl <em>Src Signalling Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.SrcSignallingActionImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSrcSignallingAction()
		 * @generated
		 */
		EClass SRC_SIGNALLING_ACTION = eINSTANCE.getSrcSignallingAction();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgProgramImpl <em>Trg Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgProgramImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgProgram()
		 * @generated
		 */
		EClass TRG_PROGRAM = eINSTANCE.getTrgProgram();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_PROGRAM__SERVICE = eINSTANCE.getTrgProgram_Service();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgStructurePropertyImpl <em>Trg Structure Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgStructurePropertyImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgStructureProperty()
		 * @generated
		 */
		EClass TRG_STRUCTURE_PROPERTY = eINSTANCE.getTrgStructureProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRG_STRUCTURE_PROPERTY__NAME = eINSTANCE.getTrgStructureProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_STRUCTURE_PROPERTY__TYPE = eINSTANCE.getTrgStructureProperty_Type();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgClientErrorResponseImpl <em>Trg Client Error Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgClientErrorResponseImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgClientErrorResponse()
		 * @generated
		 */
		EClass TRG_CLIENT_ERROR_RESPONSE = eINSTANCE.getTrgClientErrorResponse();

		/**
		 * The meta object literal for the '<em><b>Error Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRG_CLIENT_ERROR_RESPONSE__ERROR_KIND = eINSTANCE.getTrgClientErrorResponse_ErrorKind();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgGlobalErrorResponseImpl <em>Trg Global Error Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgGlobalErrorResponseImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgGlobalErrorResponse()
		 * @generated
		 */
		EClass TRG_GLOBAL_ERROR_RESPONSE = eINSTANCE.getTrgGlobalErrorResponse();

		/**
		 * The meta object literal for the '<em><b>Error Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRG_GLOBAL_ERROR_RESPONSE__ERROR_KIND = eINSTANCE.getTrgGlobalErrorResponse_ErrorKind();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgRedirectionErrorResponseImpl <em>Trg Redirection Error Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgRedirectionErrorResponseImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgRedirectionErrorResponse()
		 * @generated
		 */
		EClass TRG_REDIRECTION_ERROR_RESPONSE = eINSTANCE.getTrgRedirectionErrorResponse();

		/**
		 * The meta object literal for the '<em><b>Error Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRG_REDIRECTION_ERROR_RESPONSE__ERROR_KIND = eINSTANCE.getTrgRedirectionErrorResponse_ErrorKind();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgServerErrorResponseImpl <em>Trg Server Error Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgServerErrorResponseImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgServerErrorResponse()
		 * @generated
		 */
		EClass TRG_SERVER_ERROR_RESPONSE = eINSTANCE.getTrgServerErrorResponse();

		/**
		 * The meta object literal for the '<em><b>Error Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRG_SERVER_ERROR_RESPONSE__ERROR_KIND = eINSTANCE.getTrgServerErrorResponse_ErrorKind();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgLocatedElementImpl <em>Trg Located Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgLocatedElementImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgLocatedElement()
		 * @generated
		 */
		EClass TRG_LOCATED_ELEMENT = eINSTANCE.getTrgLocatedElement();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRG_LOCATED_ELEMENT__LOCATION = eINSTANCE.getTrgLocatedElement_Location();

		/**
		 * The meta object literal for the '<em><b>Comments Before</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRG_LOCATED_ELEMENT__COMMENTS_BEFORE = eINSTANCE.getTrgLocatedElement_CommentsBefore();

		/**
		 * The meta object literal for the '<em><b>Comments After</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRG_LOCATED_ELEMENT__COMMENTS_AFTER = eINSTANCE.getTrgLocatedElement_CommentsAfter();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgServiceImpl <em>Trg Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgServiceImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgService()
		 * @generated
		 */
		EClass TRG_SERVICE = eINSTANCE.getTrgService();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRG_SERVICE__NAME = eINSTANCE.getTrgService_Name();

		/**
		 * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_SERVICE__DECLARATIONS = eINSTANCE.getTrgService_Declarations();

		/**
		 * The meta object literal for the '<em><b>Sessions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_SERVICE__SESSIONS = eINSTANCE.getTrgService_Sessions();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgSessionImpl <em>Trg Session</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgSessionImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgSession()
		 * @generated
		 */
		EClass TRG_SESSION = eINSTANCE.getTrgSession();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgRegistrationImpl <em>Trg Registration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgRegistrationImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgRegistration()
		 * @generated
		 */
		EClass TRG_REGISTRATION = eINSTANCE.getTrgRegistration();

		/**
		 * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_REGISTRATION__DECLARATIONS = eINSTANCE.getTrgRegistration_Declarations();

		/**
		 * The meta object literal for the '<em><b>Sessions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_REGISTRATION__SESSIONS = eINSTANCE.getTrgRegistration_Sessions();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgDialogImpl <em>Trg Dialog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgDialogImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgDialog()
		 * @generated
		 */
		EClass TRG_DIALOG = eINSTANCE.getTrgDialog();

		/**
		 * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_DIALOG__DECLARATIONS = eINSTANCE.getTrgDialog_Declarations();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_DIALOG__METHODS = eINSTANCE.getTrgDialog_Methods();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgEventImpl <em>Trg Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgEventImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgEvent()
		 * @generated
		 */
		EClass TRG_EVENT = eINSTANCE.getTrgEvent();

		/**
		 * The meta object literal for the '<em><b>Event Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRG_EVENT__EVENT_ID = eINSTANCE.getTrgEvent_EventId();

		/**
		 * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_EVENT__DECLARATIONS = eINSTANCE.getTrgEvent_Declarations();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_EVENT__METHODS = eINSTANCE.getTrgEvent_Methods();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgMethodImpl <em>Trg Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgMethodImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgMethod()
		 * @generated
		 */
		EClass TRG_METHOD = eINSTANCE.getTrgMethod();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_METHOD__TYPE = eINSTANCE.getTrgMethod_Type();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRG_METHOD__DIRECTION = eINSTANCE.getTrgMethod_Direction();

		/**
		 * The meta object literal for the '<em><b>Method Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_METHOD__METHOD_NAME = eINSTANCE.getTrgMethod_MethodName();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_METHOD__ARGUMENTS = eINSTANCE.getTrgMethod_Arguments();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_METHOD__STATEMENTS = eINSTANCE.getTrgMethod_Statements();

		/**
		 * The meta object literal for the '<em><b>Branches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_METHOD__BRANCHES = eINSTANCE.getTrgMethod_Branches();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgArgumentImpl <em>Trg Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgArgumentImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgArgument()
		 * @generated
		 */
		EClass TRG_ARGUMENT = eINSTANCE.getTrgArgument();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgMethodNameImpl <em>Trg Method Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgMethodNameImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgMethodName()
		 * @generated
		 */
		EClass TRG_METHOD_NAME = eINSTANCE.getTrgMethodName();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgSIPMethodNameImpl <em>Trg SIP Method Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgSIPMethodNameImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgSIPMethodName()
		 * @generated
		 */
		EClass TRG_SIP_METHOD_NAME = eINSTANCE.getTrgSIPMethodName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRG_SIP_METHOD_NAME__NAME = eINSTANCE.getTrgSIPMethodName_Name();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgControlMethodNameImpl <em>Trg Control Method Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgControlMethodNameImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgControlMethodName()
		 * @generated
		 */
		EClass TRG_CONTROL_METHOD_NAME = eINSTANCE.getTrgControlMethodName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRG_CONTROL_METHOD_NAME__NAME = eINSTANCE.getTrgControlMethodName_Name();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgBranchImpl <em>Trg Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgBranchImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgBranch()
		 * @generated
		 */
		EClass TRG_BRANCH = eINSTANCE.getTrgBranch();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_BRANCH__STATEMENTS = eINSTANCE.getTrgBranch_Statements();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgDefaultBranchImpl <em>Trg Default Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgDefaultBranchImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgDefaultBranch()
		 * @generated
		 */
		EClass TRG_DEFAULT_BRANCH = eINSTANCE.getTrgDefaultBranch();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgNamedBranchImpl <em>Trg Named Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgNamedBranchImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgNamedBranch()
		 * @generated
		 */
		EClass TRG_NAMED_BRANCH = eINSTANCE.getTrgNamedBranch();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRG_NAMED_BRANCH__NAME = eINSTANCE.getTrgNamedBranch_Name();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgTypeExpressionImpl <em>Trg Type Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgTypeExpressionImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgTypeExpression()
		 * @generated
		 */
		EClass TRG_TYPE_EXPRESSION = eINSTANCE.getTrgTypeExpression();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgSimpleTypeImpl <em>Trg Simple Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgSimpleTypeImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgSimpleType()
		 * @generated
		 */
		EClass TRG_SIMPLE_TYPE = eINSTANCE.getTrgSimpleType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRG_SIMPLE_TYPE__TYPE = eINSTANCE.getTrgSimpleType_Type();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgSequenceTypeImpl <em>Trg Sequence Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgSequenceTypeImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgSequenceType()
		 * @generated
		 */
		EClass TRG_SEQUENCE_TYPE = eINSTANCE.getTrgSequenceType();

		/**
		 * The meta object literal for the '<em><b>Modifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRG_SEQUENCE_TYPE__MODIFIER = eINSTANCE.getTrgSequenceType_Modifier();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRG_SEQUENCE_TYPE__TYPE = eINSTANCE.getTrgSequenceType_Type();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRG_SEQUENCE_TYPE__SIZE = eINSTANCE.getTrgSequenceType_Size();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgDefinedTypeImpl <em>Trg Defined Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgDefinedTypeImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgDefinedType()
		 * @generated
		 */
		EClass TRG_DEFINED_TYPE = eINSTANCE.getTrgDefinedType();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRG_DEFINED_TYPE__TYPE_NAME = eINSTANCE.getTrgDefinedType_TypeName();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgDeclarationImpl <em>Trg Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgDeclarationImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgDeclaration()
		 * @generated
		 */
		EClass TRG_DECLARATION = eINSTANCE.getTrgDeclaration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRG_DECLARATION__NAME = eINSTANCE.getTrgDeclaration_Name();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgVariableDeclarationImpl <em>Trg Variable Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgVariableDeclarationImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgVariableDeclaration()
		 * @generated
		 */
		EClass TRG_VARIABLE_DECLARATION = eINSTANCE.getTrgVariableDeclaration();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_VARIABLE_DECLARATION__TYPE = eINSTANCE.getTrgVariableDeclaration_Type();

		/**
		 * The meta object literal for the '<em><b>Init Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_VARIABLE_DECLARATION__INIT_EXP = eINSTANCE.getTrgVariableDeclaration_InitExp();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgFunctionDeclarationImpl <em>Trg Function Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgFunctionDeclarationImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgFunctionDeclaration()
		 * @generated
		 */
		EClass TRG_FUNCTION_DECLARATION = eINSTANCE.getTrgFunctionDeclaration();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_FUNCTION_DECLARATION__RETURN_TYPE = eINSTANCE.getTrgFunctionDeclaration_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_FUNCTION_DECLARATION__ARGUMENTS = eINSTANCE.getTrgFunctionDeclaration_Arguments();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgRemoteFunctionDeclarationImpl <em>Trg Remote Function Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgRemoteFunctionDeclarationImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgRemoteFunctionDeclaration()
		 * @generated
		 */
		EClass TRG_REMOTE_FUNCTION_DECLARATION = eINSTANCE.getTrgRemoteFunctionDeclaration();

		/**
		 * The meta object literal for the '<em><b>Function Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRG_REMOTE_FUNCTION_DECLARATION__FUNCTION_LOCATION = eINSTANCE.getTrgRemoteFunctionDeclaration_FunctionLocation();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgLocalFunctionDeclarationImpl <em>Trg Local Function Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgLocalFunctionDeclarationImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgLocalFunctionDeclaration()
		 * @generated
		 */
		EClass TRG_LOCAL_FUNCTION_DECLARATION = eINSTANCE.getTrgLocalFunctionDeclaration();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_LOCAL_FUNCTION_DECLARATION__STATEMENTS = eINSTANCE.getTrgLocalFunctionDeclaration_Statements();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgStructureDeclarationImpl <em>Trg Structure Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgStructureDeclarationImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgStructureDeclaration()
		 * @generated
		 */
		EClass TRG_STRUCTURE_DECLARATION = eINSTANCE.getTrgStructureDeclaration();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_STRUCTURE_DECLARATION__PROPERTIES = eINSTANCE.getTrgStructureDeclaration_Properties();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgFunctionCallImpl <em>Trg Function Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgFunctionCallImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgFunctionCall()
		 * @generated
		 */
		EClass TRG_FUNCTION_CALL = eINSTANCE.getTrgFunctionCall();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_FUNCTION_CALL__FUNCTION = eINSTANCE.getTrgFunctionCall_Function();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_FUNCTION_CALL__PARAMETERS = eINSTANCE.getTrgFunctionCall_Parameters();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgStatementImpl <em>Trg Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgStatementImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgStatement()
		 * @generated
		 */
		EClass TRG_STATEMENT = eINSTANCE.getTrgStatement();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgCompoundStatImpl <em>Trg Compound Stat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgCompoundStatImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgCompoundStat()
		 * @generated
		 */
		EClass TRG_COMPOUND_STAT = eINSTANCE.getTrgCompoundStat();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_COMPOUND_STAT__STATEMENTS = eINSTANCE.getTrgCompoundStat_Statements();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgSetStatImpl <em>Trg Set Stat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgSetStatImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgSetStat()
		 * @generated
		 */
		EClass TRG_SET_STAT = eINSTANCE.getTrgSetStat();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_SET_STAT__TARGET = eINSTANCE.getTrgSetStat_Target();

		/**
		 * The meta object literal for the '<em><b>Set Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_SET_STAT__SET_VALUE = eINSTANCE.getTrgSetStat_SetValue();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgDeclarationStatImpl <em>Trg Declaration Stat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgDeclarationStatImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgDeclarationStat()
		 * @generated
		 */
		EClass TRG_DECLARATION_STAT = eINSTANCE.getTrgDeclarationStat();

		/**
		 * The meta object literal for the '<em><b>Declaration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_DECLARATION_STAT__DECLARATION = eINSTANCE.getTrgDeclarationStat_Declaration();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgReturnStatImpl <em>Trg Return Stat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgReturnStatImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgReturnStat()
		 * @generated
		 */
		EClass TRG_RETURN_STAT = eINSTANCE.getTrgReturnStat();

		/**
		 * The meta object literal for the '<em><b>Returned Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_RETURN_STAT__RETURNED_VALUE = eINSTANCE.getTrgReturnStat_ReturnedValue();

		/**
		 * The meta object literal for the '<em><b>Branch</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_RETURN_STAT__BRANCH = eINSTANCE.getTrgReturnStat_Branch();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgIfStatImpl <em>Trg If Stat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgIfStatImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgIfStat()
		 * @generated
		 */
		EClass TRG_IF_STAT = eINSTANCE.getTrgIfStat();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_IF_STAT__CONDITION = eINSTANCE.getTrgIfStat_Condition();

		/**
		 * The meta object literal for the '<em><b>Then Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_IF_STAT__THEN_STATEMENTS = eINSTANCE.getTrgIfStat_ThenStatements();

		/**
		 * The meta object literal for the '<em><b>Else Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_IF_STAT__ELSE_STATEMENTS = eINSTANCE.getTrgIfStat_ElseStatements();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgWhenStatImpl <em>Trg When Stat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgWhenStatImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgWhenStat()
		 * @generated
		 */
		EClass TRG_WHEN_STAT = eINSTANCE.getTrgWhenStat();

		/**
		 * The meta object literal for the '<em><b>Id Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_WHEN_STAT__ID_EXP = eINSTANCE.getTrgWhenStat_IdExp();

		/**
		 * The meta object literal for the '<em><b>When Headers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_WHEN_STAT__WHEN_HEADERS = eINSTANCE.getTrgWhenStat_WhenHeaders();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_WHEN_STAT__STATEMENTS = eINSTANCE.getTrgWhenStat_Statements();

		/**
		 * The meta object literal for the '<em><b>Else Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_WHEN_STAT__ELSE_STATEMENTS = eINSTANCE.getTrgWhenStat_ElseStatements();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgForeachStatImpl <em>Trg Foreach Stat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgForeachStatImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgForeachStat()
		 * @generated
		 */
		EClass TRG_FOREACH_STAT = eINSTANCE.getTrgForeachStat();

		/**
		 * The meta object literal for the '<em><b>Iterator Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRG_FOREACH_STAT__ITERATOR_NAME = eINSTANCE.getTrgForeachStat_IteratorName();

		/**
		 * The meta object literal for the '<em><b>Sequence Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_FOREACH_STAT__SEQUENCE_EXP = eINSTANCE.getTrgForeachStat_SequenceExp();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_FOREACH_STAT__STATEMENTS = eINSTANCE.getTrgForeachStat_Statements();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgSelectStatImpl <em>Trg Select Stat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgSelectStatImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgSelectStat()
		 * @generated
		 */
		EClass TRG_SELECT_STAT = eINSTANCE.getTrgSelectStat();

		/**
		 * The meta object literal for the '<em><b>Matched Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_SELECT_STAT__MATCHED_EXP = eINSTANCE.getTrgSelectStat_MatchedExp();

		/**
		 * The meta object literal for the '<em><b>Select Cases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_SELECT_STAT__SELECT_CASES = eINSTANCE.getTrgSelectStat_SelectCases();

		/**
		 * The meta object literal for the '<em><b>Select Default</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_SELECT_STAT__SELECT_DEFAULT = eINSTANCE.getTrgSelectStat_SelectDefault();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgFunctionCallStatImpl <em>Trg Function Call Stat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgFunctionCallStatImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgFunctionCallStat()
		 * @generated
		 */
		EClass TRG_FUNCTION_CALL_STAT = eINSTANCE.getTrgFunctionCallStat();

		/**
		 * The meta object literal for the '<em><b>Function Call</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_FUNCTION_CALL_STAT__FUNCTION_CALL = eINSTANCE.getTrgFunctionCallStat_FunctionCall();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgContinueStatImpl <em>Trg Continue Stat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgContinueStatImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgContinueStat()
		 * @generated
		 */
		EClass TRG_CONTINUE_STAT = eINSTANCE.getTrgContinueStat();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgBreakStatImpl <em>Trg Break Stat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgBreakStatImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgBreakStat()
		 * @generated
		 */
		EClass TRG_BREAK_STAT = eINSTANCE.getTrgBreakStat();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgPushStatImpl <em>Trg Push Stat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgPushStatImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgPushStat()
		 * @generated
		 */
		EClass TRG_PUSH_STAT = eINSTANCE.getTrgPushStat();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_PUSH_STAT__TARGET = eINSTANCE.getTrgPushStat_Target();

		/**
		 * The meta object literal for the '<em><b>Pushed Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_PUSH_STAT__PUSHED_VALUE = eINSTANCE.getTrgPushStat_PushedValue();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgWhenHeaderImpl <em>Trg When Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgWhenHeaderImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgWhenHeader()
		 * @generated
		 */
		EClass TRG_WHEN_HEADER = eINSTANCE.getTrgWhenHeader();

		/**
		 * The meta object literal for the '<em><b>Header Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRG_WHEN_HEADER__HEADER_ID = eINSTANCE.getTrgWhenHeader_HeaderId();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_WHEN_HEADER__VALUE = eINSTANCE.getTrgWhenHeader_Value();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgSelectMemberImpl <em>Trg Select Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgSelectMemberImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgSelectMember()
		 * @generated
		 */
		EClass TRG_SELECT_MEMBER = eINSTANCE.getTrgSelectMember();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_SELECT_MEMBER__STATEMENTS = eINSTANCE.getTrgSelectMember_Statements();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgSelectDefaultImpl <em>Trg Select Default</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgSelectDefaultImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgSelectDefault()
		 * @generated
		 */
		EClass TRG_SELECT_DEFAULT = eINSTANCE.getTrgSelectDefault();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgSelectCaseImpl <em>Trg Select Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgSelectCaseImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgSelectCase()
		 * @generated
		 */
		EClass TRG_SELECT_CASE = eINSTANCE.getTrgSelectCase();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_SELECT_CASE__VALUES = eINSTANCE.getTrgSelectCase_Values();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgExpressionImpl <em>Trg Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgExpressionImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgExpression()
		 * @generated
		 */
		EClass TRG_EXPRESSION = eINSTANCE.getTrgExpression();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgConstantExpImpl <em>Trg Constant Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgConstantExpImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgConstantExp()
		 * @generated
		 */
		EClass TRG_CONSTANT_EXP = eINSTANCE.getTrgConstantExp();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_CONSTANT_EXP__VALUE = eINSTANCE.getTrgConstantExp_Value();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgOperatorExpImpl <em>Trg Operator Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgOperatorExpImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgOperatorExp()
		 * @generated
		 */
		EClass TRG_OPERATOR_EXP = eINSTANCE.getTrgOperatorExp();

		/**
		 * The meta object literal for the '<em><b>Op Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRG_OPERATOR_EXP__OP_NAME = eINSTANCE.getTrgOperatorExp_OpName();

		/**
		 * The meta object literal for the '<em><b>Left Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_OPERATOR_EXP__LEFT_EXP = eINSTANCE.getTrgOperatorExp_LeftExp();

		/**
		 * The meta object literal for the '<em><b>Right Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_OPERATOR_EXP__RIGHT_EXP = eINSTANCE.getTrgOperatorExp_RightExp();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgForwardExpImpl <em>Trg Forward Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgForwardExpImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgForwardExp()
		 * @generated
		 */
		EClass TRG_FORWARD_EXP = eINSTANCE.getTrgForwardExp();

		/**
		 * The meta object literal for the '<em><b>Is Parallel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRG_FORWARD_EXP__IS_PARALLEL = eINSTANCE.getTrgForwardExp_IsParallel();

		/**
		 * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_FORWARD_EXP__EXP = eINSTANCE.getTrgForwardExp_Exp();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgWithExpImpl <em>Trg With Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgWithExpImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgWithExp()
		 * @generated
		 */
		EClass TRG_WITH_EXP = eINSTANCE.getTrgWithExp();

		/**
		 * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_WITH_EXP__EXP = eINSTANCE.getTrgWithExp_Exp();

		/**
		 * The meta object literal for the '<em><b>Msg Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_WITH_EXP__MSG_FIELDS = eINSTANCE.getTrgWithExp_MsgFields();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgBlockExpImpl <em>Trg Block Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgBlockExpImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgBlockExp()
		 * @generated
		 */
		EClass TRG_BLOCK_EXP = eINSTANCE.getTrgBlockExp();

		/**
		 * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_BLOCK_EXP__EXP = eINSTANCE.getTrgBlockExp_Exp();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgReasonExpImpl <em>Trg Reason Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgReasonExpImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgReasonExp()
		 * @generated
		 */
		EClass TRG_REASON_EXP = eINSTANCE.getTrgReasonExp();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgBODYExpImpl <em>Trg BODY Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgBODYExpImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgBODYExp()
		 * @generated
		 */
		EClass TRG_BODY_EXP = eINSTANCE.getTrgBODYExp();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgRequestURIExpImpl <em>Trg Request URI Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgRequestURIExpImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgRequestURIExp()
		 * @generated
		 */
		EClass TRG_REQUEST_URI_EXP = eINSTANCE.getTrgRequestURIExp();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgPopExpImpl <em>Trg Pop Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgPopExpImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgPopExp()
		 * @generated
		 */
		EClass TRG_POP_EXP = eINSTANCE.getTrgPopExp();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_POP_EXP__SOURCE = eINSTANCE.getTrgPopExp_Source();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgFunctionCallExpImpl <em>Trg Function Call Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgFunctionCallExpImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgFunctionCallExp()
		 * @generated
		 */
		EClass TRG_FUNCTION_CALL_EXP = eINSTANCE.getTrgFunctionCallExp();

		/**
		 * The meta object literal for the '<em><b>Function Call</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_FUNCTION_CALL_EXP__FUNCTION_CALL = eINSTANCE.getTrgFunctionCallExp_FunctionCall();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgPlaceImpl <em>Trg Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgPlaceImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgPlace()
		 * @generated
		 */
		EClass TRG_PLACE = eINSTANCE.getTrgPlace();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgSIPHeaderPlaceImpl <em>Trg SIP Header Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgSIPHeaderPlaceImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgSIPHeaderPlace()
		 * @generated
		 */
		EClass TRG_SIP_HEADER_PLACE = eINSTANCE.getTrgSIPHeaderPlace();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRG_SIP_HEADER_PLACE__HEADER = eINSTANCE.getTrgSIPHeaderPlace_Header();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgVariablePlaceImpl <em>Trg Variable Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgVariablePlaceImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgVariablePlace()
		 * @generated
		 */
		EClass TRG_VARIABLE_PLACE = eINSTANCE.getTrgVariablePlace();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgPropertyCallPlaceImpl <em>Trg Property Call Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgPropertyCallPlaceImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgPropertyCallPlace()
		 * @generated
		 */
		EClass TRG_PROPERTY_CALL_PLACE = eINSTANCE.getTrgPropertyCallPlace();

		/**
		 * The meta object literal for the '<em><b>Prop Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRG_PROPERTY_CALL_PLACE__PROP_NAME = eINSTANCE.getTrgPropertyCallPlace_PropName();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_PROPERTY_CALL_PLACE__SOURCE = eINSTANCE.getTrgPropertyCallPlace_Source();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgVariableImpl <em>Trg Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgVariableImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgVariable()
		 * @generated
		 */
		EClass TRG_VARIABLE = eINSTANCE.getTrgVariable();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_VARIABLE__SOURCE = eINSTANCE.getTrgVariable_Source();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgMessageFieldImpl <em>Trg Message Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgMessageFieldImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgMessageField()
		 * @generated
		 */
		EClass TRG_MESSAGE_FIELD = eINSTANCE.getTrgMessageField();

		/**
		 * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_MESSAGE_FIELD__EXP = eINSTANCE.getTrgMessageField_Exp();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgReasonMessageFieldImpl <em>Trg Reason Message Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgReasonMessageFieldImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgReasonMessageField()
		 * @generated
		 */
		EClass TRG_REASON_MESSAGE_FIELD = eINSTANCE.getTrgReasonMessageField();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgHeadedMessageFieldImpl <em>Trg Headed Message Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgHeadedMessageFieldImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgHeadedMessageField()
		 * @generated
		 */
		EClass TRG_HEADED_MESSAGE_FIELD = eINSTANCE.getTrgHeadedMessageField();

		/**
		 * The meta object literal for the '<em><b>Header Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRG_HEADED_MESSAGE_FIELD__HEADER_ID = eINSTANCE.getTrgHeadedMessageField_HeaderId();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgConstantImpl <em>Trg Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgConstantImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgConstant()
		 * @generated
		 */
		EClass TRG_CONSTANT = eINSTANCE.getTrgConstant();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgBooleanConstantImpl <em>Trg Boolean Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgBooleanConstantImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgBooleanConstant()
		 * @generated
		 */
		EClass TRG_BOOLEAN_CONSTANT = eINSTANCE.getTrgBooleanConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRG_BOOLEAN_CONSTANT__VALUE = eINSTANCE.getTrgBooleanConstant_Value();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgIntegerConstantImpl <em>Trg Integer Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgIntegerConstantImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgIntegerConstant()
		 * @generated
		 */
		EClass TRG_INTEGER_CONSTANT = eINSTANCE.getTrgIntegerConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRG_INTEGER_CONSTANT__VALUE = eINSTANCE.getTrgIntegerConstant_Value();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgStringConstantImpl <em>Trg String Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgStringConstantImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgStringConstant()
		 * @generated
		 */
		EClass TRG_STRING_CONSTANT = eINSTANCE.getTrgStringConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRG_STRING_CONSTANT__VALUE = eINSTANCE.getTrgStringConstant_Value();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgURIConstantImpl <em>Trg URI Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgURIConstantImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgURIConstant()
		 * @generated
		 */
		EClass TRG_URI_CONSTANT = eINSTANCE.getTrgURIConstant();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRG_URI_CONSTANT__URI = eINSTANCE.getTrgURIConstant_Uri();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgSequenceConstantImpl <em>Trg Sequence Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgSequenceConstantImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgSequenceConstant()
		 * @generated
		 */
		EClass TRG_SEQUENCE_CONSTANT = eINSTANCE.getTrgSequenceConstant();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_SEQUENCE_CONSTANT__VALUES = eINSTANCE.getTrgSequenceConstant_Values();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgResponseConstantImpl <em>Trg Response Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgResponseConstantImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgResponseConstant()
		 * @generated
		 */
		EClass TRG_RESPONSE_CONSTANT = eINSTANCE.getTrgResponseConstant();

		/**
		 * The meta object literal for the '<em><b>Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_RESPONSE_CONSTANT__RESPONSE = eINSTANCE.getTrgResponseConstant_Response();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgResponseImpl <em>Trg Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgResponseImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgResponse()
		 * @generated
		 */
		EClass TRG_RESPONSE = eINSTANCE.getTrgResponse();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgSuccessResponseImpl <em>Trg Success Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgSuccessResponseImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgSuccessResponse()
		 * @generated
		 */
		EClass TRG_SUCCESS_RESPONSE = eINSTANCE.getTrgSuccessResponse();

		/**
		 * The meta object literal for the '<em><b>Success Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRG_SUCCESS_RESPONSE__SUCCESS_KIND = eINSTANCE.getTrgSuccessResponse_SuccessKind();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.impl.TrgErrorResponseImpl <em>Trg Error Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.impl.TrgErrorResponseImpl
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getTrgErrorResponse()
		 * @generated
		 */
		EClass TRG_ERROR_RESPONSE = eINSTANCE.getTrgErrorResponse();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.Direction <em>Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.Direction
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getDirection()
		 * @generated
		 */
		EEnum DIRECTION = eINSTANCE.getDirection();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.SIPMethod <em>SIP Method</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.SIPMethod
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSIPMethod()
		 * @generated
		 */
		EEnum SIP_METHOD = eINSTANCE.getSIPMethod();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.ControlMethod <em>Control Method</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.ControlMethod
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getControlMethod()
		 * @generated
		 */
		EEnum CONTROL_METHOD = eINSTANCE.getControlMethod();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.PrimitiveType <em>Primitive Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.PrimitiveType
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getPrimitiveType()
		 * @generated
		 */
		EEnum PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.Modifier <em>Modifier</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.Modifier
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getModifier()
		 * @generated
		 */
		EEnum MODIFIER = eINSTANCE.getModifier();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.FunctionLocation <em>Function Location</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.FunctionLocation
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getFunctionLocation()
		 * @generated
		 */
		EEnum FUNCTION_LOCATION = eINSTANCE.getFunctionLocation();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.SIPHeader <em>SIP Header</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.SIPHeader
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSIPHeader()
		 * @generated
		 */
		EEnum SIP_HEADER = eINSTANCE.getSIPHeader();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.SuccessKind <em>Success Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.SuccessKind
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getSuccessKind()
		 * @generated
		 */
		EEnum SUCCESS_KIND = eINSTANCE.getSuccessKind();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.ClientErrorKind <em>Client Error Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.ClientErrorKind
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getClientErrorKind()
		 * @generated
		 */
		EEnum CLIENT_ERROR_KIND = eINSTANCE.getClientErrorKind();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.GlobalErrorKind <em>Global Error Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.GlobalErrorKind
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getGlobalErrorKind()
		 * @generated
		 */
		EEnum GLOBAL_ERROR_KIND = eINSTANCE.getGlobalErrorKind();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.RedirectionErrorKind <em>Redirection Error Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.RedirectionErrorKind
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getRedirectionErrorKind()
		 * @generated
		 */
		EEnum REDIRECTION_ERROR_KIND = eINSTANCE.getRedirectionErrorKind();

		/**
		 * The meta object literal for the '{@link jointPackage_CPL2SPL.ServerErrorKind <em>Server Error Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_CPL2SPL.ServerErrorKind
		 * @see jointPackage_CPL2SPL.impl.JointPackage_CPL2SPLPackageImpl#getServerErrorKind()
		 * @generated
		 */
		EEnum SERVER_ERROR_KIND = eINSTANCE.getServerErrorKind();

	}

} //JointPackage_CPL2SPLPackage
