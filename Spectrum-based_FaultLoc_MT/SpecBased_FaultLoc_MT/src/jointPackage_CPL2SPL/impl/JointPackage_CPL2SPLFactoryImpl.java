/**
 */
package jointPackage_CPL2SPL.impl;

import jointPackage_CPL2SPL.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JointPackage_CPL2SPLFactoryImpl extends EFactoryImpl implements JointPackage_CPL2SPLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JointPackage_CPL2SPLFactory init() {
		try {
			JointPackage_CPL2SPLFactory theJointPackage_CPL2SPLFactory = (JointPackage_CPL2SPLFactory)EPackage.Registry.INSTANCE.getEFactory(JointPackage_CPL2SPLPackage.eNS_URI);
			if (theJointPackage_CPL2SPLFactory != null) {
				return theJointPackage_CPL2SPLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JointPackage_CPL2SPLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JointPackage_CPL2SPLFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case JointPackage_CPL2SPLPackage.JOINT_MM: return createJointMM();
			case JointPackage_CPL2SPLPackage.SRC_CPL_MODEL: return createSrcCPLModel();
			case JointPackage_CPL2SPLPackage.SRC_CPL: return createSrcCPL();
			case JointPackage_CPL2SPLPackage.SRC_ADDRESS_SWITCH: return createSrcAddressSwitch();
			case JointPackage_CPL2SPLPackage.SRC_STRING_SWITCH: return createSrcStringSwitch();
			case JointPackage_CPL2SPLPackage.SRC_LANGUAGE_SWITCH: return createSrcLanguageSwitch();
			case JointPackage_CPL2SPLPackage.SRC_TIME_SWITCH: return createSrcTimeSwitch();
			case JointPackage_CPL2SPLPackage.SRC_PRIORITY_SWITCH: return createSrcPrioritySwitch();
			case JointPackage_CPL2SPLPackage.SRC_PROXY: return createSrcProxy();
			case JointPackage_CPL2SPLPackage.SRC_REDIRECT: return createSrcRedirect();
			case JointPackage_CPL2SPLPackage.SRC_REJECT: return createSrcReject();
			case JointPackage_CPL2SPLPackage.SRC_SUB_ACTION: return createSrcSubAction();
			case JointPackage_CPL2SPLPackage.SRC_OUTGOING: return createSrcOutgoing();
			case JointPackage_CPL2SPLPackage.SRC_INCOMING: return createSrcIncoming();
			case JointPackage_CPL2SPLPackage.SRC_NOT_PRESENT: return createSrcNotPresent();
			case JointPackage_CPL2SPLPackage.SRC_OTHERWISE: return createSrcOtherwise();
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_ADDRESS: return createSrcSwitchedAddress();
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_STRING: return createSrcSwitchedString();
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_LANGUAGE: return createSrcSwitchedLanguage();
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME: return createSrcSwitchedTime();
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_PRIORITY: return createSrcSwitchedPriority();
			case JointPackage_CPL2SPLPackage.SRC_BUSY: return createSrcBusy();
			case JointPackage_CPL2SPLPackage.SRC_NO_ANSWER: return createSrcNoAnswer();
			case JointPackage_CPL2SPLPackage.SRC_REDIRECTION: return createSrcRedirection();
			case JointPackage_CPL2SPLPackage.SRC_FAILURE: return createSrcFailure();
			case JointPackage_CPL2SPLPackage.SRC_DEFAULT: return createSrcDefault();
			case JointPackage_CPL2SPLPackage.SRC_LOCATION: return createSrcLocation();
			case JointPackage_CPL2SPLPackage.SRC_SUB_CALL: return createSrcSubCall();
			case JointPackage_CPL2SPLPackage.TRG_PROGRAM: return createTrgProgram();
			case JointPackage_CPL2SPLPackage.TRG_STRUCTURE_PROPERTY: return createTrgStructureProperty();
			case JointPackage_CPL2SPLPackage.TRG_CLIENT_ERROR_RESPONSE: return createTrgClientErrorResponse();
			case JointPackage_CPL2SPLPackage.TRG_GLOBAL_ERROR_RESPONSE: return createTrgGlobalErrorResponse();
			case JointPackage_CPL2SPLPackage.TRG_REDIRECTION_ERROR_RESPONSE: return createTrgRedirectionErrorResponse();
			case JointPackage_CPL2SPLPackage.TRG_SERVER_ERROR_RESPONSE: return createTrgServerErrorResponse();
			case JointPackage_CPL2SPLPackage.TRG_SERVICE: return createTrgService();
			case JointPackage_CPL2SPLPackage.TRG_REGISTRATION: return createTrgRegistration();
			case JointPackage_CPL2SPLPackage.TRG_DIALOG: return createTrgDialog();
			case JointPackage_CPL2SPLPackage.TRG_EVENT: return createTrgEvent();
			case JointPackage_CPL2SPLPackage.TRG_METHOD: return createTrgMethod();
			case JointPackage_CPL2SPLPackage.TRG_ARGUMENT: return createTrgArgument();
			case JointPackage_CPL2SPLPackage.TRG_SIP_METHOD_NAME: return createTrgSIPMethodName();
			case JointPackage_CPL2SPLPackage.TRG_CONTROL_METHOD_NAME: return createTrgControlMethodName();
			case JointPackage_CPL2SPLPackage.TRG_BRANCH: return createTrgBranch();
			case JointPackage_CPL2SPLPackage.TRG_DEFAULT_BRANCH: return createTrgDefaultBranch();
			case JointPackage_CPL2SPLPackage.TRG_NAMED_BRANCH: return createTrgNamedBranch();
			case JointPackage_CPL2SPLPackage.TRG_SIMPLE_TYPE: return createTrgSimpleType();
			case JointPackage_CPL2SPLPackage.TRG_SEQUENCE_TYPE: return createTrgSequenceType();
			case JointPackage_CPL2SPLPackage.TRG_DEFINED_TYPE: return createTrgDefinedType();
			case JointPackage_CPL2SPLPackage.TRG_VARIABLE_DECLARATION: return createTrgVariableDeclaration();
			case JointPackage_CPL2SPLPackage.TRG_REMOTE_FUNCTION_DECLARATION: return createTrgRemoteFunctionDeclaration();
			case JointPackage_CPL2SPLPackage.TRG_LOCAL_FUNCTION_DECLARATION: return createTrgLocalFunctionDeclaration();
			case JointPackage_CPL2SPLPackage.TRG_STRUCTURE_DECLARATION: return createTrgStructureDeclaration();
			case JointPackage_CPL2SPLPackage.TRG_FUNCTION_CALL: return createTrgFunctionCall();
			case JointPackage_CPL2SPLPackage.TRG_COMPOUND_STAT: return createTrgCompoundStat();
			case JointPackage_CPL2SPLPackage.TRG_SET_STAT: return createTrgSetStat();
			case JointPackage_CPL2SPLPackage.TRG_DECLARATION_STAT: return createTrgDeclarationStat();
			case JointPackage_CPL2SPLPackage.TRG_RETURN_STAT: return createTrgReturnStat();
			case JointPackage_CPL2SPLPackage.TRG_IF_STAT: return createTrgIfStat();
			case JointPackage_CPL2SPLPackage.TRG_WHEN_STAT: return createTrgWhenStat();
			case JointPackage_CPL2SPLPackage.TRG_FOREACH_STAT: return createTrgForeachStat();
			case JointPackage_CPL2SPLPackage.TRG_SELECT_STAT: return createTrgSelectStat();
			case JointPackage_CPL2SPLPackage.TRG_FUNCTION_CALL_STAT: return createTrgFunctionCallStat();
			case JointPackage_CPL2SPLPackage.TRG_CONTINUE_STAT: return createTrgContinueStat();
			case JointPackage_CPL2SPLPackage.TRG_BREAK_STAT: return createTrgBreakStat();
			case JointPackage_CPL2SPLPackage.TRG_PUSH_STAT: return createTrgPushStat();
			case JointPackage_CPL2SPLPackage.TRG_WHEN_HEADER: return createTrgWhenHeader();
			case JointPackage_CPL2SPLPackage.TRG_SELECT_DEFAULT: return createTrgSelectDefault();
			case JointPackage_CPL2SPLPackage.TRG_SELECT_CASE: return createTrgSelectCase();
			case JointPackage_CPL2SPLPackage.TRG_CONSTANT_EXP: return createTrgConstantExp();
			case JointPackage_CPL2SPLPackage.TRG_OPERATOR_EXP: return createTrgOperatorExp();
			case JointPackage_CPL2SPLPackage.TRG_FORWARD_EXP: return createTrgForwardExp();
			case JointPackage_CPL2SPLPackage.TRG_WITH_EXP: return createTrgWithExp();
			case JointPackage_CPL2SPLPackage.TRG_BLOCK_EXP: return createTrgBlockExp();
			case JointPackage_CPL2SPLPackage.TRG_REASON_EXP: return createTrgReasonExp();
			case JointPackage_CPL2SPLPackage.TRG_BODY_EXP: return createTrgBODYExp();
			case JointPackage_CPL2SPLPackage.TRG_REQUEST_URI_EXP: return createTrgRequestURIExp();
			case JointPackage_CPL2SPLPackage.TRG_POP_EXP: return createTrgPopExp();
			case JointPackage_CPL2SPLPackage.TRG_FUNCTION_CALL_EXP: return createTrgFunctionCallExp();
			case JointPackage_CPL2SPLPackage.TRG_SIP_HEADER_PLACE: return createTrgSIPHeaderPlace();
			case JointPackage_CPL2SPLPackage.TRG_PROPERTY_CALL_PLACE: return createTrgPropertyCallPlace();
			case JointPackage_CPL2SPLPackage.TRG_VARIABLE: return createTrgVariable();
			case JointPackage_CPL2SPLPackage.TRG_REASON_MESSAGE_FIELD: return createTrgReasonMessageField();
			case JointPackage_CPL2SPLPackage.TRG_HEADED_MESSAGE_FIELD: return createTrgHeadedMessageField();
			case JointPackage_CPL2SPLPackage.TRG_BOOLEAN_CONSTANT: return createTrgBooleanConstant();
			case JointPackage_CPL2SPLPackage.TRG_INTEGER_CONSTANT: return createTrgIntegerConstant();
			case JointPackage_CPL2SPLPackage.TRG_STRING_CONSTANT: return createTrgStringConstant();
			case JointPackage_CPL2SPLPackage.TRG_URI_CONSTANT: return createTrgURIConstant();
			case JointPackage_CPL2SPLPackage.TRG_SEQUENCE_CONSTANT: return createTrgSequenceConstant();
			case JointPackage_CPL2SPLPackage.TRG_RESPONSE_CONSTANT: return createTrgResponseConstant();
			case JointPackage_CPL2SPLPackage.TRG_SUCCESS_RESPONSE: return createTrgSuccessResponse();
			case JointPackage_CPL2SPLPackage.TRG_ERROR_RESPONSE: return createTrgErrorResponse();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case JointPackage_CPL2SPLPackage.DIRECTION:
				return createDirectionFromString(eDataType, initialValue);
			case JointPackage_CPL2SPLPackage.SIP_METHOD:
				return createSIPMethodFromString(eDataType, initialValue);
			case JointPackage_CPL2SPLPackage.CONTROL_METHOD:
				return createControlMethodFromString(eDataType, initialValue);
			case JointPackage_CPL2SPLPackage.PRIMITIVE_TYPE:
				return createPrimitiveTypeFromString(eDataType, initialValue);
			case JointPackage_CPL2SPLPackage.MODIFIER:
				return createModifierFromString(eDataType, initialValue);
			case JointPackage_CPL2SPLPackage.FUNCTION_LOCATION:
				return createFunctionLocationFromString(eDataType, initialValue);
			case JointPackage_CPL2SPLPackage.SIP_HEADER:
				return createSIPHeaderFromString(eDataType, initialValue);
			case JointPackage_CPL2SPLPackage.SUCCESS_KIND:
				return createSuccessKindFromString(eDataType, initialValue);
			case JointPackage_CPL2SPLPackage.CLIENT_ERROR_KIND:
				return createClientErrorKindFromString(eDataType, initialValue);
			case JointPackage_CPL2SPLPackage.GLOBAL_ERROR_KIND:
				return createGlobalErrorKindFromString(eDataType, initialValue);
			case JointPackage_CPL2SPLPackage.REDIRECTION_ERROR_KIND:
				return createRedirectionErrorKindFromString(eDataType, initialValue);
			case JointPackage_CPL2SPLPackage.SERVER_ERROR_KIND:
				return createServerErrorKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case JointPackage_CPL2SPLPackage.DIRECTION:
				return convertDirectionToString(eDataType, instanceValue);
			case JointPackage_CPL2SPLPackage.SIP_METHOD:
				return convertSIPMethodToString(eDataType, instanceValue);
			case JointPackage_CPL2SPLPackage.CONTROL_METHOD:
				return convertControlMethodToString(eDataType, instanceValue);
			case JointPackage_CPL2SPLPackage.PRIMITIVE_TYPE:
				return convertPrimitiveTypeToString(eDataType, instanceValue);
			case JointPackage_CPL2SPLPackage.MODIFIER:
				return convertModifierToString(eDataType, instanceValue);
			case JointPackage_CPL2SPLPackage.FUNCTION_LOCATION:
				return convertFunctionLocationToString(eDataType, instanceValue);
			case JointPackage_CPL2SPLPackage.SIP_HEADER:
				return convertSIPHeaderToString(eDataType, instanceValue);
			case JointPackage_CPL2SPLPackage.SUCCESS_KIND:
				return convertSuccessKindToString(eDataType, instanceValue);
			case JointPackage_CPL2SPLPackage.CLIENT_ERROR_KIND:
				return convertClientErrorKindToString(eDataType, instanceValue);
			case JointPackage_CPL2SPLPackage.GLOBAL_ERROR_KIND:
				return convertGlobalErrorKindToString(eDataType, instanceValue);
			case JointPackage_CPL2SPLPackage.REDIRECTION_ERROR_KIND:
				return convertRedirectionErrorKindToString(eDataType, instanceValue);
			case JointPackage_CPL2SPLPackage.SERVER_ERROR_KIND:
				return convertServerErrorKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JointMM createJointMM() {
		JointMMImpl jointMM = new JointMMImpl();
		return jointMM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcCPLModel createSrcCPLModel() {
		SrcCPLModelImpl srcCPLModel = new SrcCPLModelImpl();
		return srcCPLModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcCPL createSrcCPL() {
		SrcCPLImpl srcCPL = new SrcCPLImpl();
		return srcCPL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcAddressSwitch createSrcAddressSwitch() {
		SrcAddressSwitchImpl srcAddressSwitch = new SrcAddressSwitchImpl();
		return srcAddressSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcStringSwitch createSrcStringSwitch() {
		SrcStringSwitchImpl srcStringSwitch = new SrcStringSwitchImpl();
		return srcStringSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcLanguageSwitch createSrcLanguageSwitch() {
		SrcLanguageSwitchImpl srcLanguageSwitch = new SrcLanguageSwitchImpl();
		return srcLanguageSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcTimeSwitch createSrcTimeSwitch() {
		SrcTimeSwitchImpl srcTimeSwitch = new SrcTimeSwitchImpl();
		return srcTimeSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcPrioritySwitch createSrcPrioritySwitch() {
		SrcPrioritySwitchImpl srcPrioritySwitch = new SrcPrioritySwitchImpl();
		return srcPrioritySwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcProxy createSrcProxy() {
		SrcProxyImpl srcProxy = new SrcProxyImpl();
		return srcProxy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcRedirect createSrcRedirect() {
		SrcRedirectImpl srcRedirect = new SrcRedirectImpl();
		return srcRedirect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcReject createSrcReject() {
		SrcRejectImpl srcReject = new SrcRejectImpl();
		return srcReject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcSubAction createSrcSubAction() {
		SrcSubActionImpl srcSubAction = new SrcSubActionImpl();
		return srcSubAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcOutgoing createSrcOutgoing() {
		SrcOutgoingImpl srcOutgoing = new SrcOutgoingImpl();
		return srcOutgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcIncoming createSrcIncoming() {
		SrcIncomingImpl srcIncoming = new SrcIncomingImpl();
		return srcIncoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcNotPresent createSrcNotPresent() {
		SrcNotPresentImpl srcNotPresent = new SrcNotPresentImpl();
		return srcNotPresent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcOtherwise createSrcOtherwise() {
		SrcOtherwiseImpl srcOtherwise = new SrcOtherwiseImpl();
		return srcOtherwise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcSwitchedAddress createSrcSwitchedAddress() {
		SrcSwitchedAddressImpl srcSwitchedAddress = new SrcSwitchedAddressImpl();
		return srcSwitchedAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcSwitchedString createSrcSwitchedString() {
		SrcSwitchedStringImpl srcSwitchedString = new SrcSwitchedStringImpl();
		return srcSwitchedString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcSwitchedLanguage createSrcSwitchedLanguage() {
		SrcSwitchedLanguageImpl srcSwitchedLanguage = new SrcSwitchedLanguageImpl();
		return srcSwitchedLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcSwitchedTime createSrcSwitchedTime() {
		SrcSwitchedTimeImpl srcSwitchedTime = new SrcSwitchedTimeImpl();
		return srcSwitchedTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcSwitchedPriority createSrcSwitchedPriority() {
		SrcSwitchedPriorityImpl srcSwitchedPriority = new SrcSwitchedPriorityImpl();
		return srcSwitchedPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcBusy createSrcBusy() {
		SrcBusyImpl srcBusy = new SrcBusyImpl();
		return srcBusy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcNoAnswer createSrcNoAnswer() {
		SrcNoAnswerImpl srcNoAnswer = new SrcNoAnswerImpl();
		return srcNoAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcRedirection createSrcRedirection() {
		SrcRedirectionImpl srcRedirection = new SrcRedirectionImpl();
		return srcRedirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcFailure createSrcFailure() {
		SrcFailureImpl srcFailure = new SrcFailureImpl();
		return srcFailure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcDefault createSrcDefault() {
		SrcDefaultImpl srcDefault = new SrcDefaultImpl();
		return srcDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcLocation createSrcLocation() {
		SrcLocationImpl srcLocation = new SrcLocationImpl();
		return srcLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcSubCall createSrcSubCall() {
		SrcSubCallImpl srcSubCall = new SrcSubCallImpl();
		return srcSubCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgProgram createTrgProgram() {
		TrgProgramImpl trgProgram = new TrgProgramImpl();
		return trgProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgStructureProperty createTrgStructureProperty() {
		TrgStructurePropertyImpl trgStructureProperty = new TrgStructurePropertyImpl();
		return trgStructureProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgClientErrorResponse createTrgClientErrorResponse() {
		TrgClientErrorResponseImpl trgClientErrorResponse = new TrgClientErrorResponseImpl();
		return trgClientErrorResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgGlobalErrorResponse createTrgGlobalErrorResponse() {
		TrgGlobalErrorResponseImpl trgGlobalErrorResponse = new TrgGlobalErrorResponseImpl();
		return trgGlobalErrorResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgRedirectionErrorResponse createTrgRedirectionErrorResponse() {
		TrgRedirectionErrorResponseImpl trgRedirectionErrorResponse = new TrgRedirectionErrorResponseImpl();
		return trgRedirectionErrorResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgServerErrorResponse createTrgServerErrorResponse() {
		TrgServerErrorResponseImpl trgServerErrorResponse = new TrgServerErrorResponseImpl();
		return trgServerErrorResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgService createTrgService() {
		TrgServiceImpl trgService = new TrgServiceImpl();
		return trgService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgRegistration createTrgRegistration() {
		TrgRegistrationImpl trgRegistration = new TrgRegistrationImpl();
		return trgRegistration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgDialog createTrgDialog() {
		TrgDialogImpl trgDialog = new TrgDialogImpl();
		return trgDialog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgEvent createTrgEvent() {
		TrgEventImpl trgEvent = new TrgEventImpl();
		return trgEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgMethod createTrgMethod() {
		TrgMethodImpl trgMethod = new TrgMethodImpl();
		return trgMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgArgument createTrgArgument() {
		TrgArgumentImpl trgArgument = new TrgArgumentImpl();
		return trgArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgSIPMethodName createTrgSIPMethodName() {
		TrgSIPMethodNameImpl trgSIPMethodName = new TrgSIPMethodNameImpl();
		return trgSIPMethodName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgControlMethodName createTrgControlMethodName() {
		TrgControlMethodNameImpl trgControlMethodName = new TrgControlMethodNameImpl();
		return trgControlMethodName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgBranch createTrgBranch() {
		TrgBranchImpl trgBranch = new TrgBranchImpl();
		return trgBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgDefaultBranch createTrgDefaultBranch() {
		TrgDefaultBranchImpl trgDefaultBranch = new TrgDefaultBranchImpl();
		return trgDefaultBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgNamedBranch createTrgNamedBranch() {
		TrgNamedBranchImpl trgNamedBranch = new TrgNamedBranchImpl();
		return trgNamedBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgSimpleType createTrgSimpleType() {
		TrgSimpleTypeImpl trgSimpleType = new TrgSimpleTypeImpl();
		return trgSimpleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgSequenceType createTrgSequenceType() {
		TrgSequenceTypeImpl trgSequenceType = new TrgSequenceTypeImpl();
		return trgSequenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgDefinedType createTrgDefinedType() {
		TrgDefinedTypeImpl trgDefinedType = new TrgDefinedTypeImpl();
		return trgDefinedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgVariableDeclaration createTrgVariableDeclaration() {
		TrgVariableDeclarationImpl trgVariableDeclaration = new TrgVariableDeclarationImpl();
		return trgVariableDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgRemoteFunctionDeclaration createTrgRemoteFunctionDeclaration() {
		TrgRemoteFunctionDeclarationImpl trgRemoteFunctionDeclaration = new TrgRemoteFunctionDeclarationImpl();
		return trgRemoteFunctionDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgLocalFunctionDeclaration createTrgLocalFunctionDeclaration() {
		TrgLocalFunctionDeclarationImpl trgLocalFunctionDeclaration = new TrgLocalFunctionDeclarationImpl();
		return trgLocalFunctionDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgStructureDeclaration createTrgStructureDeclaration() {
		TrgStructureDeclarationImpl trgStructureDeclaration = new TrgStructureDeclarationImpl();
		return trgStructureDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgFunctionCall createTrgFunctionCall() {
		TrgFunctionCallImpl trgFunctionCall = new TrgFunctionCallImpl();
		return trgFunctionCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgCompoundStat createTrgCompoundStat() {
		TrgCompoundStatImpl trgCompoundStat = new TrgCompoundStatImpl();
		return trgCompoundStat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgSetStat createTrgSetStat() {
		TrgSetStatImpl trgSetStat = new TrgSetStatImpl();
		return trgSetStat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgDeclarationStat createTrgDeclarationStat() {
		TrgDeclarationStatImpl trgDeclarationStat = new TrgDeclarationStatImpl();
		return trgDeclarationStat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgReturnStat createTrgReturnStat() {
		TrgReturnStatImpl trgReturnStat = new TrgReturnStatImpl();
		return trgReturnStat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgIfStat createTrgIfStat() {
		TrgIfStatImpl trgIfStat = new TrgIfStatImpl();
		return trgIfStat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgWhenStat createTrgWhenStat() {
		TrgWhenStatImpl trgWhenStat = new TrgWhenStatImpl();
		return trgWhenStat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgForeachStat createTrgForeachStat() {
		TrgForeachStatImpl trgForeachStat = new TrgForeachStatImpl();
		return trgForeachStat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgSelectStat createTrgSelectStat() {
		TrgSelectStatImpl trgSelectStat = new TrgSelectStatImpl();
		return trgSelectStat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgFunctionCallStat createTrgFunctionCallStat() {
		TrgFunctionCallStatImpl trgFunctionCallStat = new TrgFunctionCallStatImpl();
		return trgFunctionCallStat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgContinueStat createTrgContinueStat() {
		TrgContinueStatImpl trgContinueStat = new TrgContinueStatImpl();
		return trgContinueStat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgBreakStat createTrgBreakStat() {
		TrgBreakStatImpl trgBreakStat = new TrgBreakStatImpl();
		return trgBreakStat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgPushStat createTrgPushStat() {
		TrgPushStatImpl trgPushStat = new TrgPushStatImpl();
		return trgPushStat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgWhenHeader createTrgWhenHeader() {
		TrgWhenHeaderImpl trgWhenHeader = new TrgWhenHeaderImpl();
		return trgWhenHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgSelectDefault createTrgSelectDefault() {
		TrgSelectDefaultImpl trgSelectDefault = new TrgSelectDefaultImpl();
		return trgSelectDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgSelectCase createTrgSelectCase() {
		TrgSelectCaseImpl trgSelectCase = new TrgSelectCaseImpl();
		return trgSelectCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgConstantExp createTrgConstantExp() {
		TrgConstantExpImpl trgConstantExp = new TrgConstantExpImpl();
		return trgConstantExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgOperatorExp createTrgOperatorExp() {
		TrgOperatorExpImpl trgOperatorExp = new TrgOperatorExpImpl();
		return trgOperatorExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgForwardExp createTrgForwardExp() {
		TrgForwardExpImpl trgForwardExp = new TrgForwardExpImpl();
		return trgForwardExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgWithExp createTrgWithExp() {
		TrgWithExpImpl trgWithExp = new TrgWithExpImpl();
		return trgWithExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgBlockExp createTrgBlockExp() {
		TrgBlockExpImpl trgBlockExp = new TrgBlockExpImpl();
		return trgBlockExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgReasonExp createTrgReasonExp() {
		TrgReasonExpImpl trgReasonExp = new TrgReasonExpImpl();
		return trgReasonExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgBODYExp createTrgBODYExp() {
		TrgBODYExpImpl trgBODYExp = new TrgBODYExpImpl();
		return trgBODYExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgRequestURIExp createTrgRequestURIExp() {
		TrgRequestURIExpImpl trgRequestURIExp = new TrgRequestURIExpImpl();
		return trgRequestURIExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgPopExp createTrgPopExp() {
		TrgPopExpImpl trgPopExp = new TrgPopExpImpl();
		return trgPopExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgFunctionCallExp createTrgFunctionCallExp() {
		TrgFunctionCallExpImpl trgFunctionCallExp = new TrgFunctionCallExpImpl();
		return trgFunctionCallExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgSIPHeaderPlace createTrgSIPHeaderPlace() {
		TrgSIPHeaderPlaceImpl trgSIPHeaderPlace = new TrgSIPHeaderPlaceImpl();
		return trgSIPHeaderPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgPropertyCallPlace createTrgPropertyCallPlace() {
		TrgPropertyCallPlaceImpl trgPropertyCallPlace = new TrgPropertyCallPlaceImpl();
		return trgPropertyCallPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgVariable createTrgVariable() {
		TrgVariableImpl trgVariable = new TrgVariableImpl();
		return trgVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgReasonMessageField createTrgReasonMessageField() {
		TrgReasonMessageFieldImpl trgReasonMessageField = new TrgReasonMessageFieldImpl();
		return trgReasonMessageField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgHeadedMessageField createTrgHeadedMessageField() {
		TrgHeadedMessageFieldImpl trgHeadedMessageField = new TrgHeadedMessageFieldImpl();
		return trgHeadedMessageField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgBooleanConstant createTrgBooleanConstant() {
		TrgBooleanConstantImpl trgBooleanConstant = new TrgBooleanConstantImpl();
		return trgBooleanConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgIntegerConstant createTrgIntegerConstant() {
		TrgIntegerConstantImpl trgIntegerConstant = new TrgIntegerConstantImpl();
		return trgIntegerConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgStringConstant createTrgStringConstant() {
		TrgStringConstantImpl trgStringConstant = new TrgStringConstantImpl();
		return trgStringConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgURIConstant createTrgURIConstant() {
		TrgURIConstantImpl trgURIConstant = new TrgURIConstantImpl();
		return trgURIConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgSequenceConstant createTrgSequenceConstant() {
		TrgSequenceConstantImpl trgSequenceConstant = new TrgSequenceConstantImpl();
		return trgSequenceConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgResponseConstant createTrgResponseConstant() {
		TrgResponseConstantImpl trgResponseConstant = new TrgResponseConstantImpl();
		return trgResponseConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgSuccessResponse createTrgSuccessResponse() {
		TrgSuccessResponseImpl trgSuccessResponse = new TrgSuccessResponseImpl();
		return trgSuccessResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgErrorResponse createTrgErrorResponse() {
		TrgErrorResponseImpl trgErrorResponse = new TrgErrorResponseImpl();
		return trgErrorResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Direction createDirectionFromString(EDataType eDataType, String initialValue) {
		Direction result = Direction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SIPMethod createSIPMethodFromString(EDataType eDataType, String initialValue) {
		SIPMethod result = SIPMethod.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSIPMethodToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlMethod createControlMethodFromString(EDataType eDataType, String initialValue) {
		ControlMethod result = ControlMethod.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertControlMethodToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveType createPrimitiveTypeFromString(EDataType eDataType, String initialValue) {
		PrimitiveType result = PrimitiveType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrimitiveTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Modifier createModifierFromString(EDataType eDataType, String initialValue) {
		Modifier result = Modifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionLocation createFunctionLocationFromString(EDataType eDataType, String initialValue) {
		FunctionLocation result = FunctionLocation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFunctionLocationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SIPHeader createSIPHeaderFromString(EDataType eDataType, String initialValue) {
		SIPHeader result = SIPHeader.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSIPHeaderToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuccessKind createSuccessKindFromString(EDataType eDataType, String initialValue) {
		SuccessKind result = SuccessKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSuccessKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClientErrorKind createClientErrorKindFromString(EDataType eDataType, String initialValue) {
		ClientErrorKind result = ClientErrorKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClientErrorKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalErrorKind createGlobalErrorKindFromString(EDataType eDataType, String initialValue) {
		GlobalErrorKind result = GlobalErrorKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGlobalErrorKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedirectionErrorKind createRedirectionErrorKindFromString(EDataType eDataType, String initialValue) {
		RedirectionErrorKind result = RedirectionErrorKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRedirectionErrorKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerErrorKind createServerErrorKindFromString(EDataType eDataType, String initialValue) {
		ServerErrorKind result = ServerErrorKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertServerErrorKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JointPackage_CPL2SPLPackage getJointPackage_CPL2SPLPackage() {
		return (JointPackage_CPL2SPLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JointPackage_CPL2SPLPackage getPackage() {
		return JointPackage_CPL2SPLPackage.eINSTANCE;
	}

} //JointPackage_CPL2SPLFactoryImpl
