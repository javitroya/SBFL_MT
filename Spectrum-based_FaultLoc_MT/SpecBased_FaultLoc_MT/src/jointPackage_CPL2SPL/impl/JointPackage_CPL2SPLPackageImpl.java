/**
 */
package jointPackage_CPL2SPL.impl;

import jointPackage_CPL2SPL.ClientErrorKind;
import jointPackage_CPL2SPL.ControlMethod;
import jointPackage_CPL2SPL.Direction;
import jointPackage_CPL2SPL.FunctionLocation;
import jointPackage_CPL2SPL.GlobalErrorKind;
import jointPackage_CPL2SPL.JointMM;
import jointPackage_CPL2SPL.JointPackage_CPL2SPLFactory;
import jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage;
import jointPackage_CPL2SPL.Modifier;
import jointPackage_CPL2SPL.PrimitiveType;
import jointPackage_CPL2SPL.RedirectionErrorKind;
import jointPackage_CPL2SPL.SIPHeader;
import jointPackage_CPL2SPL.SIPMethod;
import jointPackage_CPL2SPL.ServerErrorKind;
import jointPackage_CPL2SPL.SrcAction;
import jointPackage_CPL2SPL.SrcAddressSwitch;
import jointPackage_CPL2SPL.SrcBusy;
import jointPackage_CPL2SPL.SrcCPL;
import jointPackage_CPL2SPL.SrcCPLModel;
import jointPackage_CPL2SPL.SrcDefault;
import jointPackage_CPL2SPL.SrcElement;
import jointPackage_CPL2SPL.SrcFailure;
import jointPackage_CPL2SPL.SrcIncoming;
import jointPackage_CPL2SPL.SrcLanguageSwitch;
import jointPackage_CPL2SPL.SrcLocation;
import jointPackage_CPL2SPL.SrcNoAnswer;
import jointPackage_CPL2SPL.SrcNode;
import jointPackage_CPL2SPL.SrcNodeContainer;
import jointPackage_CPL2SPL.SrcNotPresent;
import jointPackage_CPL2SPL.SrcOtherwise;
import jointPackage_CPL2SPL.SrcOutgoing;
import jointPackage_CPL2SPL.SrcPrioritySwitch;
import jointPackage_CPL2SPL.SrcProxy;
import jointPackage_CPL2SPL.SrcRedirect;
import jointPackage_CPL2SPL.SrcRedirection;
import jointPackage_CPL2SPL.SrcReject;
import jointPackage_CPL2SPL.SrcSignallingAction;
import jointPackage_CPL2SPL.SrcStringSwitch;
import jointPackage_CPL2SPL.SrcSubAction;
import jointPackage_CPL2SPL.SrcSubCall;
import jointPackage_CPL2SPL.SrcSwitch;
import jointPackage_CPL2SPL.SrcSwitchedAddress;
import jointPackage_CPL2SPL.SrcSwitchedLanguage;
import jointPackage_CPL2SPL.SrcSwitchedPriority;
import jointPackage_CPL2SPL.SrcSwitchedString;
import jointPackage_CPL2SPL.SrcSwitchedTime;
import jointPackage_CPL2SPL.SrcTimeSwitch;
import jointPackage_CPL2SPL.SuccessKind;
import jointPackage_CPL2SPL.TrgArgument;
import jointPackage_CPL2SPL.TrgBODYExp;
import jointPackage_CPL2SPL.TrgBlockExp;
import jointPackage_CPL2SPL.TrgBooleanConstant;
import jointPackage_CPL2SPL.TrgBranch;
import jointPackage_CPL2SPL.TrgBreakStat;
import jointPackage_CPL2SPL.TrgClientErrorResponse;
import jointPackage_CPL2SPL.TrgCompoundStat;
import jointPackage_CPL2SPL.TrgConstant;
import jointPackage_CPL2SPL.TrgConstantExp;
import jointPackage_CPL2SPL.TrgContinueStat;
import jointPackage_CPL2SPL.TrgControlMethodName;
import jointPackage_CPL2SPL.TrgDeclaration;
import jointPackage_CPL2SPL.TrgDeclarationStat;
import jointPackage_CPL2SPL.TrgDefaultBranch;
import jointPackage_CPL2SPL.TrgDefinedType;
import jointPackage_CPL2SPL.TrgDialog;
import jointPackage_CPL2SPL.TrgErrorResponse;
import jointPackage_CPL2SPL.TrgEvent;
import jointPackage_CPL2SPL.TrgExpression;
import jointPackage_CPL2SPL.TrgForeachStat;
import jointPackage_CPL2SPL.TrgForwardExp;
import jointPackage_CPL2SPL.TrgFunctionCall;
import jointPackage_CPL2SPL.TrgFunctionCallExp;
import jointPackage_CPL2SPL.TrgFunctionCallStat;
import jointPackage_CPL2SPL.TrgFunctionDeclaration;
import jointPackage_CPL2SPL.TrgGlobalErrorResponse;
import jointPackage_CPL2SPL.TrgHeadedMessageField;
import jointPackage_CPL2SPL.TrgIfStat;
import jointPackage_CPL2SPL.TrgIntegerConstant;
import jointPackage_CPL2SPL.TrgLocalFunctionDeclaration;
import jointPackage_CPL2SPL.TrgLocatedElement;
import jointPackage_CPL2SPL.TrgMessageField;
import jointPackage_CPL2SPL.TrgMethod;
import jointPackage_CPL2SPL.TrgMethodName;
import jointPackage_CPL2SPL.TrgNamedBranch;
import jointPackage_CPL2SPL.TrgOperatorExp;
import jointPackage_CPL2SPL.TrgPlace;
import jointPackage_CPL2SPL.TrgPopExp;
import jointPackage_CPL2SPL.TrgProgram;
import jointPackage_CPL2SPL.TrgPropertyCallPlace;
import jointPackage_CPL2SPL.TrgPushStat;
import jointPackage_CPL2SPL.TrgReasonExp;
import jointPackage_CPL2SPL.TrgReasonMessageField;
import jointPackage_CPL2SPL.TrgRedirectionErrorResponse;
import jointPackage_CPL2SPL.TrgRegistration;
import jointPackage_CPL2SPL.TrgRemoteFunctionDeclaration;
import jointPackage_CPL2SPL.TrgRequestURIExp;
import jointPackage_CPL2SPL.TrgResponse;
import jointPackage_CPL2SPL.TrgResponseConstant;
import jointPackage_CPL2SPL.TrgReturnStat;
import jointPackage_CPL2SPL.TrgSIPHeaderPlace;
import jointPackage_CPL2SPL.TrgSIPMethodName;
import jointPackage_CPL2SPL.TrgSelectCase;
import jointPackage_CPL2SPL.TrgSelectDefault;
import jointPackage_CPL2SPL.TrgSelectMember;
import jointPackage_CPL2SPL.TrgSelectStat;
import jointPackage_CPL2SPL.TrgSequenceConstant;
import jointPackage_CPL2SPL.TrgSequenceType;
import jointPackage_CPL2SPL.TrgServerErrorResponse;
import jointPackage_CPL2SPL.TrgService;
import jointPackage_CPL2SPL.TrgSession;
import jointPackage_CPL2SPL.TrgSetStat;
import jointPackage_CPL2SPL.TrgSimpleType;
import jointPackage_CPL2SPL.TrgStatement;
import jointPackage_CPL2SPL.TrgStringConstant;
import jointPackage_CPL2SPL.TrgStructureDeclaration;
import jointPackage_CPL2SPL.TrgStructureProperty;
import jointPackage_CPL2SPL.TrgSuccessResponse;
import jointPackage_CPL2SPL.TrgTypeExpression;
import jointPackage_CPL2SPL.TrgURIConstant;
import jointPackage_CPL2SPL.TrgVariable;
import jointPackage_CPL2SPL.TrgVariableDeclaration;
import jointPackage_CPL2SPL.TrgVariablePlace;
import jointPackage_CPL2SPL.TrgWhenHeader;
import jointPackage_CPL2SPL.TrgWhenStat;
import jointPackage_CPL2SPL.TrgWithExp;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JointPackage_CPL2SPLPackageImpl extends EPackageImpl implements JointPackage_CPL2SPLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jointMMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcCPLModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcCPLEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcAddressSwitchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcStringSwitchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcLanguageSwitchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcTimeSwitchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcPrioritySwitchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcProxyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcRedirectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcRejectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcNodeContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcSubActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcOutgoingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcIncomingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcNotPresentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcOtherwiseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcSwitchedAddressEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcSwitchedStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcSwitchedLanguageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcSwitchedTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcSwitchedPriorityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcBusyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcNoAnswerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcRedirectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcFailureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcDefaultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcSwitchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcSubCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcSignallingActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgProgramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgStructurePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgClientErrorResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgGlobalErrorResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgRedirectionErrorResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgServerErrorResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgLocatedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgSessionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgRegistrationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgDialogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgMethodNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgSIPMethodNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgControlMethodNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgBranchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgDefaultBranchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgNamedBranchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgTypeExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgSimpleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgSequenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgDefinedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgVariableDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgFunctionDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgRemoteFunctionDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgLocalFunctionDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgStructureDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgFunctionCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgCompoundStatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgSetStatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgDeclarationStatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgReturnStatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgIfStatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgWhenStatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgForeachStatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgSelectStatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgFunctionCallStatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgContinueStatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgBreakStatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgPushStatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgWhenHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgSelectMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgSelectDefaultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgSelectCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgConstantExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgOperatorExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgForwardExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgWithExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgBlockExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgReasonExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgBODYExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgRequestURIExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgPopExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgFunctionCallExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgPlaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgSIPHeaderPlaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgVariablePlaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgPropertyCallPlaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgMessageFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgReasonMessageFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgHeadedMessageFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgBooleanConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgIntegerConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgStringConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgURIConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgSequenceConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgResponseConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgSuccessResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgErrorResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum directionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sipMethodEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum controlMethodEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum primitiveTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum functionLocationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sipHeaderEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum successKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum clientErrorKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum globalErrorKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum redirectionErrorKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum serverErrorKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JointPackage_CPL2SPLPackageImpl() {
		super(eNS_URI, JointPackage_CPL2SPLFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link JointPackage_CPL2SPLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static JointPackage_CPL2SPLPackage init() {
		if (isInited) return (JointPackage_CPL2SPLPackage)EPackage.Registry.INSTANCE.getEPackage(JointPackage_CPL2SPLPackage.eNS_URI);

		// Obtain or create and register package
		JointPackage_CPL2SPLPackageImpl theJointPackage_CPL2SPLPackage = (JointPackage_CPL2SPLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof JointPackage_CPL2SPLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new JointPackage_CPL2SPLPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theJointPackage_CPL2SPLPackage.createPackageContents();

		// Initialize created meta-data
		theJointPackage_CPL2SPLPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJointPackage_CPL2SPLPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(JointPackage_CPL2SPLPackage.eNS_URI, theJointPackage_CPL2SPLPackage);
		return theJointPackage_CPL2SPLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJointMM() {
		return jointMMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJointMM_SourceRoot() {
		return (EReference)jointMMEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJointMM_TargetRoot() {
		return (EReference)jointMMEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcCPLModel() {
		return srcCPLModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSrcCPLModel_Elements() {
		return (EReference)srcCPLModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcCPL() {
		return srcCPLEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSrcCPL_SubActions() {
		return (EReference)srcCPLEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSrcCPL_Outgoing() {
		return (EReference)srcCPLEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSrcCPL_Incoming() {
		return (EReference)srcCPLEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcAddressSwitch() {
		return srcAddressSwitchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcAddressSwitch_Field() {
		return (EAttribute)srcAddressSwitchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcAddressSwitch_SubField() {
		return (EAttribute)srcAddressSwitchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSrcAddressSwitch_Addresses() {
		return (EReference)srcAddressSwitchEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcStringSwitch() {
		return srcStringSwitchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcStringSwitch_Field() {
		return (EAttribute)srcStringSwitchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSrcStringSwitch_Strings() {
		return (EReference)srcStringSwitchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcLanguageSwitch() {
		return srcLanguageSwitchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSrcLanguageSwitch_Languages() {
		return (EReference)srcLanguageSwitchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcTimeSwitch() {
		return srcTimeSwitchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcTimeSwitch_Tzid() {
		return (EAttribute)srcTimeSwitchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcTimeSwitch_Tzurl() {
		return (EAttribute)srcTimeSwitchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSrcTimeSwitch_Times() {
		return (EReference)srcTimeSwitchEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcPrioritySwitch() {
		return srcPrioritySwitchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSrcPrioritySwitch_Priorities() {
		return (EReference)srcPrioritySwitchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcProxy() {
		return srcProxyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcProxy_Timeout() {
		return (EAttribute)srcProxyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcProxy_Recurse() {
		return (EAttribute)srcProxyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcProxy_Ordering() {
		return (EAttribute)srcProxyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSrcProxy_Busy() {
		return (EReference)srcProxyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSrcProxy_NoAnswer() {
		return (EReference)srcProxyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSrcProxy_Redirection() {
		return (EReference)srcProxyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSrcProxy_Failure() {
		return (EReference)srcProxyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSrcProxy_Default() {
		return (EReference)srcProxyEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcRedirect() {
		return srcRedirectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcRedirect_Permanent() {
		return (EAttribute)srcRedirectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcReject() {
		return srcRejectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcReject_Status() {
		return (EAttribute)srcRejectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcReject_Reason() {
		return (EAttribute)srcRejectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcElement() {
		return srcElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcNodeContainer() {
		return srcNodeContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSrcNodeContainer_Contents() {
		return (EReference)srcNodeContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcSubAction() {
		return srcSubActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcSubAction_Id() {
		return (EAttribute)srcSubActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcOutgoing() {
		return srcOutgoingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcIncoming() {
		return srcIncomingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcNotPresent() {
		return srcNotPresentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcOtherwise() {
		return srcOtherwiseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcSwitchedAddress() {
		return srcSwitchedAddressEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcSwitchedAddress_Is() {
		return (EAttribute)srcSwitchedAddressEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcSwitchedAddress_Contains() {
		return (EAttribute)srcSwitchedAddressEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcSwitchedAddress_SubDomainOf() {
		return (EAttribute)srcSwitchedAddressEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcSwitchedString() {
		return srcSwitchedStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcSwitchedString_Is() {
		return (EAttribute)srcSwitchedStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcSwitchedString_Contains() {
		return (EAttribute)srcSwitchedStringEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcSwitchedLanguage() {
		return srcSwitchedLanguageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcSwitchedLanguage_Matches() {
		return (EAttribute)srcSwitchedLanguageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcSwitchedTime() {
		return srcSwitchedTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcSwitchedTime_Dtstart() {
		return (EAttribute)srcSwitchedTimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcSwitchedTime_Dtend() {
		return (EAttribute)srcSwitchedTimeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcSwitchedTime_Duration() {
		return (EAttribute)srcSwitchedTimeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcSwitchedTime_Freq() {
		return (EAttribute)srcSwitchedTimeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcSwitchedTime_Until() {
		return (EAttribute)srcSwitchedTimeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcSwitchedTime_Count() {
		return (EAttribute)srcSwitchedTimeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcSwitchedTime_Interval() {
		return (EAttribute)srcSwitchedTimeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcSwitchedTime_BySecond() {
		return (EAttribute)srcSwitchedTimeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcSwitchedTime_ByMinute() {
		return (EAttribute)srcSwitchedTimeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcSwitchedTime_ByHour() {
		return (EAttribute)srcSwitchedTimeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcSwitchedTime_ByDay() {
		return (EAttribute)srcSwitchedTimeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcSwitchedTime_ByMonthDay() {
		return (EAttribute)srcSwitchedTimeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcSwitchedTime_ByYearDay() {
		return (EAttribute)srcSwitchedTimeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcSwitchedTime_ByWeekNo() {
		return (EAttribute)srcSwitchedTimeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcSwitchedTime_ByMonth() {
		return (EAttribute)srcSwitchedTimeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcSwitchedTime_Wkst() {
		return (EAttribute)srcSwitchedTimeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcSwitchedTime_BySetPos() {
		return (EAttribute)srcSwitchedTimeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcSwitchedPriority() {
		return srcSwitchedPriorityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcSwitchedPriority_Less() {
		return (EAttribute)srcSwitchedPriorityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcSwitchedPriority_Greater() {
		return (EAttribute)srcSwitchedPriorityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcSwitchedPriority_Equal() {
		return (EAttribute)srcSwitchedPriorityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcBusy() {
		return srcBusyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcNoAnswer() {
		return srcNoAnswerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcRedirection() {
		return srcRedirectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcFailure() {
		return srcFailureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcDefault() {
		return srcDefaultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcNode() {
		return srcNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcSwitch() {
		return srcSwitchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSrcSwitch_NotPresent() {
		return (EReference)srcSwitchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSrcSwitch_Otherwise() {
		return (EReference)srcSwitchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcLocation() {
		return srcLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcLocation_Url() {
		return (EAttribute)srcLocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcLocation_Priority() {
		return (EAttribute)srcLocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcLocation_Clear() {
		return (EAttribute)srcLocationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcSubCall() {
		return srcSubCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcSubCall_Ref() {
		return (EAttribute)srcSubCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcAction() {
		return srcActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcSignallingAction() {
		return srcSignallingActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgProgram() {
		return trgProgramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgProgram_Service() {
		return (EReference)trgProgramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgStructureProperty() {
		return trgStructurePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrgStructureProperty_Name() {
		return (EAttribute)trgStructurePropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgStructureProperty_Type() {
		return (EReference)trgStructurePropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgClientErrorResponse() {
		return trgClientErrorResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrgClientErrorResponse_ErrorKind() {
		return (EAttribute)trgClientErrorResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgGlobalErrorResponse() {
		return trgGlobalErrorResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrgGlobalErrorResponse_ErrorKind() {
		return (EAttribute)trgGlobalErrorResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgRedirectionErrorResponse() {
		return trgRedirectionErrorResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrgRedirectionErrorResponse_ErrorKind() {
		return (EAttribute)trgRedirectionErrorResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgServerErrorResponse() {
		return trgServerErrorResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrgServerErrorResponse_ErrorKind() {
		return (EAttribute)trgServerErrorResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgLocatedElement() {
		return trgLocatedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrgLocatedElement_Location() {
		return (EAttribute)trgLocatedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrgLocatedElement_CommentsBefore() {
		return (EAttribute)trgLocatedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrgLocatedElement_CommentsAfter() {
		return (EAttribute)trgLocatedElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgService() {
		return trgServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrgService_Name() {
		return (EAttribute)trgServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgService_Declarations() {
		return (EReference)trgServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgService_Sessions() {
		return (EReference)trgServiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgSession() {
		return trgSessionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgRegistration() {
		return trgRegistrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgRegistration_Declarations() {
		return (EReference)trgRegistrationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgRegistration_Sessions() {
		return (EReference)trgRegistrationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgDialog() {
		return trgDialogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgDialog_Declarations() {
		return (EReference)trgDialogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgDialog_Methods() {
		return (EReference)trgDialogEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgEvent() {
		return trgEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrgEvent_EventId() {
		return (EAttribute)trgEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgEvent_Declarations() {
		return (EReference)trgEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgEvent_Methods() {
		return (EReference)trgEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgMethod() {
		return trgMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgMethod_Type() {
		return (EReference)trgMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrgMethod_Direction() {
		return (EAttribute)trgMethodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgMethod_MethodName() {
		return (EReference)trgMethodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgMethod_Arguments() {
		return (EReference)trgMethodEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgMethod_Statements() {
		return (EReference)trgMethodEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgMethod_Branches() {
		return (EReference)trgMethodEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgArgument() {
		return trgArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgMethodName() {
		return trgMethodNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgSIPMethodName() {
		return trgSIPMethodNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrgSIPMethodName_Name() {
		return (EAttribute)trgSIPMethodNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgControlMethodName() {
		return trgControlMethodNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrgControlMethodName_Name() {
		return (EAttribute)trgControlMethodNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgBranch() {
		return trgBranchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgBranch_Statements() {
		return (EReference)trgBranchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgDefaultBranch() {
		return trgDefaultBranchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgNamedBranch() {
		return trgNamedBranchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrgNamedBranch_Name() {
		return (EAttribute)trgNamedBranchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgTypeExpression() {
		return trgTypeExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgSimpleType() {
		return trgSimpleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrgSimpleType_Type() {
		return (EAttribute)trgSimpleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgSequenceType() {
		return trgSequenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrgSequenceType_Modifier() {
		return (EAttribute)trgSequenceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrgSequenceType_Type() {
		return (EAttribute)trgSequenceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrgSequenceType_Size() {
		return (EAttribute)trgSequenceTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgDefinedType() {
		return trgDefinedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrgDefinedType_TypeName() {
		return (EAttribute)trgDefinedTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgDeclaration() {
		return trgDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrgDeclaration_Name() {
		return (EAttribute)trgDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgVariableDeclaration() {
		return trgVariableDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgVariableDeclaration_Type() {
		return (EReference)trgVariableDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgVariableDeclaration_InitExp() {
		return (EReference)trgVariableDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgFunctionDeclaration() {
		return trgFunctionDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgFunctionDeclaration_ReturnType() {
		return (EReference)trgFunctionDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgFunctionDeclaration_Arguments() {
		return (EReference)trgFunctionDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgRemoteFunctionDeclaration() {
		return trgRemoteFunctionDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrgRemoteFunctionDeclaration_FunctionLocation() {
		return (EAttribute)trgRemoteFunctionDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgLocalFunctionDeclaration() {
		return trgLocalFunctionDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgLocalFunctionDeclaration_Statements() {
		return (EReference)trgLocalFunctionDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgStructureDeclaration() {
		return trgStructureDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgStructureDeclaration_Properties() {
		return (EReference)trgStructureDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgFunctionCall() {
		return trgFunctionCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgFunctionCall_Function() {
		return (EReference)trgFunctionCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgFunctionCall_Parameters() {
		return (EReference)trgFunctionCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgStatement() {
		return trgStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgCompoundStat() {
		return trgCompoundStatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgCompoundStat_Statements() {
		return (EReference)trgCompoundStatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgSetStat() {
		return trgSetStatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgSetStat_Target() {
		return (EReference)trgSetStatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgSetStat_SetValue() {
		return (EReference)trgSetStatEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgDeclarationStat() {
		return trgDeclarationStatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgDeclarationStat_Declaration() {
		return (EReference)trgDeclarationStatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgReturnStat() {
		return trgReturnStatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgReturnStat_ReturnedValue() {
		return (EReference)trgReturnStatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgReturnStat_Branch() {
		return (EReference)trgReturnStatEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgIfStat() {
		return trgIfStatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgIfStat_Condition() {
		return (EReference)trgIfStatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgIfStat_ThenStatements() {
		return (EReference)trgIfStatEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgIfStat_ElseStatements() {
		return (EReference)trgIfStatEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgWhenStat() {
		return trgWhenStatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgWhenStat_IdExp() {
		return (EReference)trgWhenStatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgWhenStat_WhenHeaders() {
		return (EReference)trgWhenStatEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgWhenStat_Statements() {
		return (EReference)trgWhenStatEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgWhenStat_ElseStatements() {
		return (EReference)trgWhenStatEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgForeachStat() {
		return trgForeachStatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrgForeachStat_IteratorName() {
		return (EAttribute)trgForeachStatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgForeachStat_SequenceExp() {
		return (EReference)trgForeachStatEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgForeachStat_Statements() {
		return (EReference)trgForeachStatEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgSelectStat() {
		return trgSelectStatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgSelectStat_MatchedExp() {
		return (EReference)trgSelectStatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgSelectStat_SelectCases() {
		return (EReference)trgSelectStatEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgSelectStat_SelectDefault() {
		return (EReference)trgSelectStatEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgFunctionCallStat() {
		return trgFunctionCallStatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgFunctionCallStat_FunctionCall() {
		return (EReference)trgFunctionCallStatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgContinueStat() {
		return trgContinueStatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgBreakStat() {
		return trgBreakStatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgPushStat() {
		return trgPushStatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgPushStat_Target() {
		return (EReference)trgPushStatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgPushStat_PushedValue() {
		return (EReference)trgPushStatEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgWhenHeader() {
		return trgWhenHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrgWhenHeader_HeaderId() {
		return (EAttribute)trgWhenHeaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgWhenHeader_Value() {
		return (EReference)trgWhenHeaderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgSelectMember() {
		return trgSelectMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgSelectMember_Statements() {
		return (EReference)trgSelectMemberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgSelectDefault() {
		return trgSelectDefaultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgSelectCase() {
		return trgSelectCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgSelectCase_Values() {
		return (EReference)trgSelectCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgExpression() {
		return trgExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgConstantExp() {
		return trgConstantExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgConstantExp_Value() {
		return (EReference)trgConstantExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgOperatorExp() {
		return trgOperatorExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrgOperatorExp_OpName() {
		return (EAttribute)trgOperatorExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgOperatorExp_LeftExp() {
		return (EReference)trgOperatorExpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgOperatorExp_RightExp() {
		return (EReference)trgOperatorExpEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgForwardExp() {
		return trgForwardExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrgForwardExp_IsParallel() {
		return (EAttribute)trgForwardExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgForwardExp_Exp() {
		return (EReference)trgForwardExpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgWithExp() {
		return trgWithExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgWithExp_Exp() {
		return (EReference)trgWithExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgWithExp_MsgFields() {
		return (EReference)trgWithExpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgBlockExp() {
		return trgBlockExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgBlockExp_Exp() {
		return (EReference)trgBlockExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgReasonExp() {
		return trgReasonExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgBODYExp() {
		return trgBODYExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgRequestURIExp() {
		return trgRequestURIExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgPopExp() {
		return trgPopExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgPopExp_Source() {
		return (EReference)trgPopExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgFunctionCallExp() {
		return trgFunctionCallExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgFunctionCallExp_FunctionCall() {
		return (EReference)trgFunctionCallExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgPlace() {
		return trgPlaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgSIPHeaderPlace() {
		return trgSIPHeaderPlaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrgSIPHeaderPlace_Header() {
		return (EAttribute)trgSIPHeaderPlaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgVariablePlace() {
		return trgVariablePlaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgPropertyCallPlace() {
		return trgPropertyCallPlaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrgPropertyCallPlace_PropName() {
		return (EAttribute)trgPropertyCallPlaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgPropertyCallPlace_Source() {
		return (EReference)trgPropertyCallPlaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgVariable() {
		return trgVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgVariable_Source() {
		return (EReference)trgVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgMessageField() {
		return trgMessageFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgMessageField_Exp() {
		return (EReference)trgMessageFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgReasonMessageField() {
		return trgReasonMessageFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgHeadedMessageField() {
		return trgHeadedMessageFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrgHeadedMessageField_HeaderId() {
		return (EAttribute)trgHeadedMessageFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgConstant() {
		return trgConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgBooleanConstant() {
		return trgBooleanConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrgBooleanConstant_Value() {
		return (EAttribute)trgBooleanConstantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgIntegerConstant() {
		return trgIntegerConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrgIntegerConstant_Value() {
		return (EAttribute)trgIntegerConstantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgStringConstant() {
		return trgStringConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrgStringConstant_Value() {
		return (EAttribute)trgStringConstantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgURIConstant() {
		return trgURIConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrgURIConstant_Uri() {
		return (EAttribute)trgURIConstantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgSequenceConstant() {
		return trgSequenceConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgSequenceConstant_Values() {
		return (EReference)trgSequenceConstantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgResponseConstant() {
		return trgResponseConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgResponseConstant_Response() {
		return (EReference)trgResponseConstantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgResponse() {
		return trgResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgSuccessResponse() {
		return trgSuccessResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrgSuccessResponse_SuccessKind() {
		return (EAttribute)trgSuccessResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgErrorResponse() {
		return trgErrorResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDirection() {
		return directionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSIPMethod() {
		return sipMethodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getControlMethod() {
		return controlMethodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPrimitiveType() {
		return primitiveTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getModifier() {
		return modifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFunctionLocation() {
		return functionLocationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSIPHeader() {
		return sipHeaderEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSuccessKind() {
		return successKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getClientErrorKind() {
		return clientErrorKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGlobalErrorKind() {
		return globalErrorKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRedirectionErrorKind() {
		return redirectionErrorKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getServerErrorKind() {
		return serverErrorKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JointPackage_CPL2SPLFactory getJointPackage_CPL2SPLFactory() {
		return (JointPackage_CPL2SPLFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		jointMMEClass = createEClass(JOINT_MM);
		createEReference(jointMMEClass, JOINT_MM__SOURCE_ROOT);
		createEReference(jointMMEClass, JOINT_MM__TARGET_ROOT);

		srcCPLModelEClass = createEClass(SRC_CPL_MODEL);
		createEReference(srcCPLModelEClass, SRC_CPL_MODEL__ELEMENTS);

		srcCPLEClass = createEClass(SRC_CPL);
		createEReference(srcCPLEClass, SRC_CPL__SUB_ACTIONS);
		createEReference(srcCPLEClass, SRC_CPL__OUTGOING);
		createEReference(srcCPLEClass, SRC_CPL__INCOMING);

		srcAddressSwitchEClass = createEClass(SRC_ADDRESS_SWITCH);
		createEAttribute(srcAddressSwitchEClass, SRC_ADDRESS_SWITCH__FIELD);
		createEAttribute(srcAddressSwitchEClass, SRC_ADDRESS_SWITCH__SUB_FIELD);
		createEReference(srcAddressSwitchEClass, SRC_ADDRESS_SWITCH__ADDRESSES);

		srcStringSwitchEClass = createEClass(SRC_STRING_SWITCH);
		createEAttribute(srcStringSwitchEClass, SRC_STRING_SWITCH__FIELD);
		createEReference(srcStringSwitchEClass, SRC_STRING_SWITCH__STRINGS);

		srcLanguageSwitchEClass = createEClass(SRC_LANGUAGE_SWITCH);
		createEReference(srcLanguageSwitchEClass, SRC_LANGUAGE_SWITCH__LANGUAGES);

		srcTimeSwitchEClass = createEClass(SRC_TIME_SWITCH);
		createEAttribute(srcTimeSwitchEClass, SRC_TIME_SWITCH__TZID);
		createEAttribute(srcTimeSwitchEClass, SRC_TIME_SWITCH__TZURL);
		createEReference(srcTimeSwitchEClass, SRC_TIME_SWITCH__TIMES);

		srcPrioritySwitchEClass = createEClass(SRC_PRIORITY_SWITCH);
		createEReference(srcPrioritySwitchEClass, SRC_PRIORITY_SWITCH__PRIORITIES);

		srcProxyEClass = createEClass(SRC_PROXY);
		createEAttribute(srcProxyEClass, SRC_PROXY__TIMEOUT);
		createEAttribute(srcProxyEClass, SRC_PROXY__RECURSE);
		createEAttribute(srcProxyEClass, SRC_PROXY__ORDERING);
		createEReference(srcProxyEClass, SRC_PROXY__BUSY);
		createEReference(srcProxyEClass, SRC_PROXY__NO_ANSWER);
		createEReference(srcProxyEClass, SRC_PROXY__REDIRECTION);
		createEReference(srcProxyEClass, SRC_PROXY__FAILURE);
		createEReference(srcProxyEClass, SRC_PROXY__DEFAULT);

		srcRedirectEClass = createEClass(SRC_REDIRECT);
		createEAttribute(srcRedirectEClass, SRC_REDIRECT__PERMANENT);

		srcRejectEClass = createEClass(SRC_REJECT);
		createEAttribute(srcRejectEClass, SRC_REJECT__STATUS);
		createEAttribute(srcRejectEClass, SRC_REJECT__REASON);

		srcElementEClass = createEClass(SRC_ELEMENT);

		srcNodeContainerEClass = createEClass(SRC_NODE_CONTAINER);
		createEReference(srcNodeContainerEClass, SRC_NODE_CONTAINER__CONTENTS);

		srcSubActionEClass = createEClass(SRC_SUB_ACTION);
		createEAttribute(srcSubActionEClass, SRC_SUB_ACTION__ID);

		srcOutgoingEClass = createEClass(SRC_OUTGOING);

		srcIncomingEClass = createEClass(SRC_INCOMING);

		srcNotPresentEClass = createEClass(SRC_NOT_PRESENT);

		srcOtherwiseEClass = createEClass(SRC_OTHERWISE);

		srcSwitchedAddressEClass = createEClass(SRC_SWITCHED_ADDRESS);
		createEAttribute(srcSwitchedAddressEClass, SRC_SWITCHED_ADDRESS__IS);
		createEAttribute(srcSwitchedAddressEClass, SRC_SWITCHED_ADDRESS__CONTAINS);
		createEAttribute(srcSwitchedAddressEClass, SRC_SWITCHED_ADDRESS__SUB_DOMAIN_OF);

		srcSwitchedStringEClass = createEClass(SRC_SWITCHED_STRING);
		createEAttribute(srcSwitchedStringEClass, SRC_SWITCHED_STRING__IS);
		createEAttribute(srcSwitchedStringEClass, SRC_SWITCHED_STRING__CONTAINS);

		srcSwitchedLanguageEClass = createEClass(SRC_SWITCHED_LANGUAGE);
		createEAttribute(srcSwitchedLanguageEClass, SRC_SWITCHED_LANGUAGE__MATCHES);

		srcSwitchedTimeEClass = createEClass(SRC_SWITCHED_TIME);
		createEAttribute(srcSwitchedTimeEClass, SRC_SWITCHED_TIME__DTSTART);
		createEAttribute(srcSwitchedTimeEClass, SRC_SWITCHED_TIME__DTEND);
		createEAttribute(srcSwitchedTimeEClass, SRC_SWITCHED_TIME__DURATION);
		createEAttribute(srcSwitchedTimeEClass, SRC_SWITCHED_TIME__FREQ);
		createEAttribute(srcSwitchedTimeEClass, SRC_SWITCHED_TIME__UNTIL);
		createEAttribute(srcSwitchedTimeEClass, SRC_SWITCHED_TIME__COUNT);
		createEAttribute(srcSwitchedTimeEClass, SRC_SWITCHED_TIME__INTERVAL);
		createEAttribute(srcSwitchedTimeEClass, SRC_SWITCHED_TIME__BY_SECOND);
		createEAttribute(srcSwitchedTimeEClass, SRC_SWITCHED_TIME__BY_MINUTE);
		createEAttribute(srcSwitchedTimeEClass, SRC_SWITCHED_TIME__BY_HOUR);
		createEAttribute(srcSwitchedTimeEClass, SRC_SWITCHED_TIME__BY_DAY);
		createEAttribute(srcSwitchedTimeEClass, SRC_SWITCHED_TIME__BY_MONTH_DAY);
		createEAttribute(srcSwitchedTimeEClass, SRC_SWITCHED_TIME__BY_YEAR_DAY);
		createEAttribute(srcSwitchedTimeEClass, SRC_SWITCHED_TIME__BY_WEEK_NO);
		createEAttribute(srcSwitchedTimeEClass, SRC_SWITCHED_TIME__BY_MONTH);
		createEAttribute(srcSwitchedTimeEClass, SRC_SWITCHED_TIME__WKST);
		createEAttribute(srcSwitchedTimeEClass, SRC_SWITCHED_TIME__BY_SET_POS);

		srcSwitchedPriorityEClass = createEClass(SRC_SWITCHED_PRIORITY);
		createEAttribute(srcSwitchedPriorityEClass, SRC_SWITCHED_PRIORITY__LESS);
		createEAttribute(srcSwitchedPriorityEClass, SRC_SWITCHED_PRIORITY__GREATER);
		createEAttribute(srcSwitchedPriorityEClass, SRC_SWITCHED_PRIORITY__EQUAL);

		srcBusyEClass = createEClass(SRC_BUSY);

		srcNoAnswerEClass = createEClass(SRC_NO_ANSWER);

		srcRedirectionEClass = createEClass(SRC_REDIRECTION);

		srcFailureEClass = createEClass(SRC_FAILURE);

		srcDefaultEClass = createEClass(SRC_DEFAULT);

		srcNodeEClass = createEClass(SRC_NODE);

		srcSwitchEClass = createEClass(SRC_SWITCH);
		createEReference(srcSwitchEClass, SRC_SWITCH__NOT_PRESENT);
		createEReference(srcSwitchEClass, SRC_SWITCH__OTHERWISE);

		srcLocationEClass = createEClass(SRC_LOCATION);
		createEAttribute(srcLocationEClass, SRC_LOCATION__URL);
		createEAttribute(srcLocationEClass, SRC_LOCATION__PRIORITY);
		createEAttribute(srcLocationEClass, SRC_LOCATION__CLEAR);

		srcSubCallEClass = createEClass(SRC_SUB_CALL);
		createEAttribute(srcSubCallEClass, SRC_SUB_CALL__REF);

		srcActionEClass = createEClass(SRC_ACTION);

		srcSignallingActionEClass = createEClass(SRC_SIGNALLING_ACTION);

		trgProgramEClass = createEClass(TRG_PROGRAM);
		createEReference(trgProgramEClass, TRG_PROGRAM__SERVICE);

		trgStructurePropertyEClass = createEClass(TRG_STRUCTURE_PROPERTY);
		createEAttribute(trgStructurePropertyEClass, TRG_STRUCTURE_PROPERTY__NAME);
		createEReference(trgStructurePropertyEClass, TRG_STRUCTURE_PROPERTY__TYPE);

		trgClientErrorResponseEClass = createEClass(TRG_CLIENT_ERROR_RESPONSE);
		createEAttribute(trgClientErrorResponseEClass, TRG_CLIENT_ERROR_RESPONSE__ERROR_KIND);

		trgGlobalErrorResponseEClass = createEClass(TRG_GLOBAL_ERROR_RESPONSE);
		createEAttribute(trgGlobalErrorResponseEClass, TRG_GLOBAL_ERROR_RESPONSE__ERROR_KIND);

		trgRedirectionErrorResponseEClass = createEClass(TRG_REDIRECTION_ERROR_RESPONSE);
		createEAttribute(trgRedirectionErrorResponseEClass, TRG_REDIRECTION_ERROR_RESPONSE__ERROR_KIND);

		trgServerErrorResponseEClass = createEClass(TRG_SERVER_ERROR_RESPONSE);
		createEAttribute(trgServerErrorResponseEClass, TRG_SERVER_ERROR_RESPONSE__ERROR_KIND);

		trgLocatedElementEClass = createEClass(TRG_LOCATED_ELEMENT);
		createEAttribute(trgLocatedElementEClass, TRG_LOCATED_ELEMENT__LOCATION);
		createEAttribute(trgLocatedElementEClass, TRG_LOCATED_ELEMENT__COMMENTS_BEFORE);
		createEAttribute(trgLocatedElementEClass, TRG_LOCATED_ELEMENT__COMMENTS_AFTER);

		trgServiceEClass = createEClass(TRG_SERVICE);
		createEAttribute(trgServiceEClass, TRG_SERVICE__NAME);
		createEReference(trgServiceEClass, TRG_SERVICE__DECLARATIONS);
		createEReference(trgServiceEClass, TRG_SERVICE__SESSIONS);

		trgSessionEClass = createEClass(TRG_SESSION);

		trgRegistrationEClass = createEClass(TRG_REGISTRATION);
		createEReference(trgRegistrationEClass, TRG_REGISTRATION__DECLARATIONS);
		createEReference(trgRegistrationEClass, TRG_REGISTRATION__SESSIONS);

		trgDialogEClass = createEClass(TRG_DIALOG);
		createEReference(trgDialogEClass, TRG_DIALOG__DECLARATIONS);
		createEReference(trgDialogEClass, TRG_DIALOG__METHODS);

		trgEventEClass = createEClass(TRG_EVENT);
		createEAttribute(trgEventEClass, TRG_EVENT__EVENT_ID);
		createEReference(trgEventEClass, TRG_EVENT__DECLARATIONS);
		createEReference(trgEventEClass, TRG_EVENT__METHODS);

		trgMethodEClass = createEClass(TRG_METHOD);
		createEReference(trgMethodEClass, TRG_METHOD__TYPE);
		createEAttribute(trgMethodEClass, TRG_METHOD__DIRECTION);
		createEReference(trgMethodEClass, TRG_METHOD__METHOD_NAME);
		createEReference(trgMethodEClass, TRG_METHOD__ARGUMENTS);
		createEReference(trgMethodEClass, TRG_METHOD__STATEMENTS);
		createEReference(trgMethodEClass, TRG_METHOD__BRANCHES);

		trgArgumentEClass = createEClass(TRG_ARGUMENT);

		trgMethodNameEClass = createEClass(TRG_METHOD_NAME);

		trgSIPMethodNameEClass = createEClass(TRG_SIP_METHOD_NAME);
		createEAttribute(trgSIPMethodNameEClass, TRG_SIP_METHOD_NAME__NAME);

		trgControlMethodNameEClass = createEClass(TRG_CONTROL_METHOD_NAME);
		createEAttribute(trgControlMethodNameEClass, TRG_CONTROL_METHOD_NAME__NAME);

		trgBranchEClass = createEClass(TRG_BRANCH);
		createEReference(trgBranchEClass, TRG_BRANCH__STATEMENTS);

		trgDefaultBranchEClass = createEClass(TRG_DEFAULT_BRANCH);

		trgNamedBranchEClass = createEClass(TRG_NAMED_BRANCH);
		createEAttribute(trgNamedBranchEClass, TRG_NAMED_BRANCH__NAME);

		trgTypeExpressionEClass = createEClass(TRG_TYPE_EXPRESSION);

		trgSimpleTypeEClass = createEClass(TRG_SIMPLE_TYPE);
		createEAttribute(trgSimpleTypeEClass, TRG_SIMPLE_TYPE__TYPE);

		trgSequenceTypeEClass = createEClass(TRG_SEQUENCE_TYPE);
		createEAttribute(trgSequenceTypeEClass, TRG_SEQUENCE_TYPE__MODIFIER);
		createEAttribute(trgSequenceTypeEClass, TRG_SEQUENCE_TYPE__TYPE);
		createEAttribute(trgSequenceTypeEClass, TRG_SEQUENCE_TYPE__SIZE);

		trgDefinedTypeEClass = createEClass(TRG_DEFINED_TYPE);
		createEAttribute(trgDefinedTypeEClass, TRG_DEFINED_TYPE__TYPE_NAME);

		trgDeclarationEClass = createEClass(TRG_DECLARATION);
		createEAttribute(trgDeclarationEClass, TRG_DECLARATION__NAME);

		trgVariableDeclarationEClass = createEClass(TRG_VARIABLE_DECLARATION);
		createEReference(trgVariableDeclarationEClass, TRG_VARIABLE_DECLARATION__TYPE);
		createEReference(trgVariableDeclarationEClass, TRG_VARIABLE_DECLARATION__INIT_EXP);

		trgFunctionDeclarationEClass = createEClass(TRG_FUNCTION_DECLARATION);
		createEReference(trgFunctionDeclarationEClass, TRG_FUNCTION_DECLARATION__RETURN_TYPE);
		createEReference(trgFunctionDeclarationEClass, TRG_FUNCTION_DECLARATION__ARGUMENTS);

		trgRemoteFunctionDeclarationEClass = createEClass(TRG_REMOTE_FUNCTION_DECLARATION);
		createEAttribute(trgRemoteFunctionDeclarationEClass, TRG_REMOTE_FUNCTION_DECLARATION__FUNCTION_LOCATION);

		trgLocalFunctionDeclarationEClass = createEClass(TRG_LOCAL_FUNCTION_DECLARATION);
		createEReference(trgLocalFunctionDeclarationEClass, TRG_LOCAL_FUNCTION_DECLARATION__STATEMENTS);

		trgStructureDeclarationEClass = createEClass(TRG_STRUCTURE_DECLARATION);
		createEReference(trgStructureDeclarationEClass, TRG_STRUCTURE_DECLARATION__PROPERTIES);

		trgFunctionCallEClass = createEClass(TRG_FUNCTION_CALL);
		createEReference(trgFunctionCallEClass, TRG_FUNCTION_CALL__FUNCTION);
		createEReference(trgFunctionCallEClass, TRG_FUNCTION_CALL__PARAMETERS);

		trgStatementEClass = createEClass(TRG_STATEMENT);

		trgCompoundStatEClass = createEClass(TRG_COMPOUND_STAT);
		createEReference(trgCompoundStatEClass, TRG_COMPOUND_STAT__STATEMENTS);

		trgSetStatEClass = createEClass(TRG_SET_STAT);
		createEReference(trgSetStatEClass, TRG_SET_STAT__TARGET);
		createEReference(trgSetStatEClass, TRG_SET_STAT__SET_VALUE);

		trgDeclarationStatEClass = createEClass(TRG_DECLARATION_STAT);
		createEReference(trgDeclarationStatEClass, TRG_DECLARATION_STAT__DECLARATION);

		trgReturnStatEClass = createEClass(TRG_RETURN_STAT);
		createEReference(trgReturnStatEClass, TRG_RETURN_STAT__RETURNED_VALUE);
		createEReference(trgReturnStatEClass, TRG_RETURN_STAT__BRANCH);

		trgIfStatEClass = createEClass(TRG_IF_STAT);
		createEReference(trgIfStatEClass, TRG_IF_STAT__CONDITION);
		createEReference(trgIfStatEClass, TRG_IF_STAT__THEN_STATEMENTS);
		createEReference(trgIfStatEClass, TRG_IF_STAT__ELSE_STATEMENTS);

		trgWhenStatEClass = createEClass(TRG_WHEN_STAT);
		createEReference(trgWhenStatEClass, TRG_WHEN_STAT__ID_EXP);
		createEReference(trgWhenStatEClass, TRG_WHEN_STAT__WHEN_HEADERS);
		createEReference(trgWhenStatEClass, TRG_WHEN_STAT__STATEMENTS);
		createEReference(trgWhenStatEClass, TRG_WHEN_STAT__ELSE_STATEMENTS);

		trgForeachStatEClass = createEClass(TRG_FOREACH_STAT);
		createEAttribute(trgForeachStatEClass, TRG_FOREACH_STAT__ITERATOR_NAME);
		createEReference(trgForeachStatEClass, TRG_FOREACH_STAT__SEQUENCE_EXP);
		createEReference(trgForeachStatEClass, TRG_FOREACH_STAT__STATEMENTS);

		trgSelectStatEClass = createEClass(TRG_SELECT_STAT);
		createEReference(trgSelectStatEClass, TRG_SELECT_STAT__MATCHED_EXP);
		createEReference(trgSelectStatEClass, TRG_SELECT_STAT__SELECT_CASES);
		createEReference(trgSelectStatEClass, TRG_SELECT_STAT__SELECT_DEFAULT);

		trgFunctionCallStatEClass = createEClass(TRG_FUNCTION_CALL_STAT);
		createEReference(trgFunctionCallStatEClass, TRG_FUNCTION_CALL_STAT__FUNCTION_CALL);

		trgContinueStatEClass = createEClass(TRG_CONTINUE_STAT);

		trgBreakStatEClass = createEClass(TRG_BREAK_STAT);

		trgPushStatEClass = createEClass(TRG_PUSH_STAT);
		createEReference(trgPushStatEClass, TRG_PUSH_STAT__TARGET);
		createEReference(trgPushStatEClass, TRG_PUSH_STAT__PUSHED_VALUE);

		trgWhenHeaderEClass = createEClass(TRG_WHEN_HEADER);
		createEAttribute(trgWhenHeaderEClass, TRG_WHEN_HEADER__HEADER_ID);
		createEReference(trgWhenHeaderEClass, TRG_WHEN_HEADER__VALUE);

		trgSelectMemberEClass = createEClass(TRG_SELECT_MEMBER);
		createEReference(trgSelectMemberEClass, TRG_SELECT_MEMBER__STATEMENTS);

		trgSelectDefaultEClass = createEClass(TRG_SELECT_DEFAULT);

		trgSelectCaseEClass = createEClass(TRG_SELECT_CASE);
		createEReference(trgSelectCaseEClass, TRG_SELECT_CASE__VALUES);

		trgExpressionEClass = createEClass(TRG_EXPRESSION);

		trgConstantExpEClass = createEClass(TRG_CONSTANT_EXP);
		createEReference(trgConstantExpEClass, TRG_CONSTANT_EXP__VALUE);

		trgOperatorExpEClass = createEClass(TRG_OPERATOR_EXP);
		createEAttribute(trgOperatorExpEClass, TRG_OPERATOR_EXP__OP_NAME);
		createEReference(trgOperatorExpEClass, TRG_OPERATOR_EXP__LEFT_EXP);
		createEReference(trgOperatorExpEClass, TRG_OPERATOR_EXP__RIGHT_EXP);

		trgForwardExpEClass = createEClass(TRG_FORWARD_EXP);
		createEAttribute(trgForwardExpEClass, TRG_FORWARD_EXP__IS_PARALLEL);
		createEReference(trgForwardExpEClass, TRG_FORWARD_EXP__EXP);

		trgWithExpEClass = createEClass(TRG_WITH_EXP);
		createEReference(trgWithExpEClass, TRG_WITH_EXP__EXP);
		createEReference(trgWithExpEClass, TRG_WITH_EXP__MSG_FIELDS);

		trgBlockExpEClass = createEClass(TRG_BLOCK_EXP);
		createEReference(trgBlockExpEClass, TRG_BLOCK_EXP__EXP);

		trgReasonExpEClass = createEClass(TRG_REASON_EXP);

		trgBODYExpEClass = createEClass(TRG_BODY_EXP);

		trgRequestURIExpEClass = createEClass(TRG_REQUEST_URI_EXP);

		trgPopExpEClass = createEClass(TRG_POP_EXP);
		createEReference(trgPopExpEClass, TRG_POP_EXP__SOURCE);

		trgFunctionCallExpEClass = createEClass(TRG_FUNCTION_CALL_EXP);
		createEReference(trgFunctionCallExpEClass, TRG_FUNCTION_CALL_EXP__FUNCTION_CALL);

		trgPlaceEClass = createEClass(TRG_PLACE);

		trgSIPHeaderPlaceEClass = createEClass(TRG_SIP_HEADER_PLACE);
		createEAttribute(trgSIPHeaderPlaceEClass, TRG_SIP_HEADER_PLACE__HEADER);

		trgVariablePlaceEClass = createEClass(TRG_VARIABLE_PLACE);

		trgPropertyCallPlaceEClass = createEClass(TRG_PROPERTY_CALL_PLACE);
		createEAttribute(trgPropertyCallPlaceEClass, TRG_PROPERTY_CALL_PLACE__PROP_NAME);
		createEReference(trgPropertyCallPlaceEClass, TRG_PROPERTY_CALL_PLACE__SOURCE);

		trgVariableEClass = createEClass(TRG_VARIABLE);
		createEReference(trgVariableEClass, TRG_VARIABLE__SOURCE);

		trgMessageFieldEClass = createEClass(TRG_MESSAGE_FIELD);
		createEReference(trgMessageFieldEClass, TRG_MESSAGE_FIELD__EXP);

		trgReasonMessageFieldEClass = createEClass(TRG_REASON_MESSAGE_FIELD);

		trgHeadedMessageFieldEClass = createEClass(TRG_HEADED_MESSAGE_FIELD);
		createEAttribute(trgHeadedMessageFieldEClass, TRG_HEADED_MESSAGE_FIELD__HEADER_ID);

		trgConstantEClass = createEClass(TRG_CONSTANT);

		trgBooleanConstantEClass = createEClass(TRG_BOOLEAN_CONSTANT);
		createEAttribute(trgBooleanConstantEClass, TRG_BOOLEAN_CONSTANT__VALUE);

		trgIntegerConstantEClass = createEClass(TRG_INTEGER_CONSTANT);
		createEAttribute(trgIntegerConstantEClass, TRG_INTEGER_CONSTANT__VALUE);

		trgStringConstantEClass = createEClass(TRG_STRING_CONSTANT);
		createEAttribute(trgStringConstantEClass, TRG_STRING_CONSTANT__VALUE);

		trgURIConstantEClass = createEClass(TRG_URI_CONSTANT);
		createEAttribute(trgURIConstantEClass, TRG_URI_CONSTANT__URI);

		trgSequenceConstantEClass = createEClass(TRG_SEQUENCE_CONSTANT);
		createEReference(trgSequenceConstantEClass, TRG_SEQUENCE_CONSTANT__VALUES);

		trgResponseConstantEClass = createEClass(TRG_RESPONSE_CONSTANT);
		createEReference(trgResponseConstantEClass, TRG_RESPONSE_CONSTANT__RESPONSE);

		trgResponseEClass = createEClass(TRG_RESPONSE);

		trgSuccessResponseEClass = createEClass(TRG_SUCCESS_RESPONSE);
		createEAttribute(trgSuccessResponseEClass, TRG_SUCCESS_RESPONSE__SUCCESS_KIND);

		trgErrorResponseEClass = createEClass(TRG_ERROR_RESPONSE);

		// Create enums
		directionEEnum = createEEnum(DIRECTION);
		sipMethodEEnum = createEEnum(SIP_METHOD);
		controlMethodEEnum = createEEnum(CONTROL_METHOD);
		primitiveTypeEEnum = createEEnum(PRIMITIVE_TYPE);
		modifierEEnum = createEEnum(MODIFIER);
		functionLocationEEnum = createEEnum(FUNCTION_LOCATION);
		sipHeaderEEnum = createEEnum(SIP_HEADER);
		successKindEEnum = createEEnum(SUCCESS_KIND);
		clientErrorKindEEnum = createEEnum(CLIENT_ERROR_KIND);
		globalErrorKindEEnum = createEEnum(GLOBAL_ERROR_KIND);
		redirectionErrorKindEEnum = createEEnum(REDIRECTION_ERROR_KIND);
		serverErrorKindEEnum = createEEnum(SERVER_ERROR_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		srcCPLEClass.getESuperTypes().add(this.getSrcElement());
		srcAddressSwitchEClass.getESuperTypes().add(this.getSrcSwitch());
		srcStringSwitchEClass.getESuperTypes().add(this.getSrcSwitch());
		srcLanguageSwitchEClass.getESuperTypes().add(this.getSrcSwitch());
		srcTimeSwitchEClass.getESuperTypes().add(this.getSrcSwitch());
		srcPrioritySwitchEClass.getESuperTypes().add(this.getSrcSwitch());
		srcProxyEClass.getESuperTypes().add(this.getSrcSignallingAction());
		srcRedirectEClass.getESuperTypes().add(this.getSrcSignallingAction());
		srcRejectEClass.getESuperTypes().add(this.getSrcSignallingAction());
		srcNodeContainerEClass.getESuperTypes().add(this.getSrcElement());
		srcSubActionEClass.getESuperTypes().add(this.getSrcNodeContainer());
		srcOutgoingEClass.getESuperTypes().add(this.getSrcNodeContainer());
		srcIncomingEClass.getESuperTypes().add(this.getSrcNodeContainer());
		srcNotPresentEClass.getESuperTypes().add(this.getSrcNodeContainer());
		srcOtherwiseEClass.getESuperTypes().add(this.getSrcNodeContainer());
		srcSwitchedAddressEClass.getESuperTypes().add(this.getSrcNodeContainer());
		srcSwitchedStringEClass.getESuperTypes().add(this.getSrcNodeContainer());
		srcSwitchedLanguageEClass.getESuperTypes().add(this.getSrcNodeContainer());
		srcSwitchedTimeEClass.getESuperTypes().add(this.getSrcNodeContainer());
		srcSwitchedPriorityEClass.getESuperTypes().add(this.getSrcNodeContainer());
		srcBusyEClass.getESuperTypes().add(this.getSrcNodeContainer());
		srcNoAnswerEClass.getESuperTypes().add(this.getSrcNodeContainer());
		srcRedirectionEClass.getESuperTypes().add(this.getSrcNodeContainer());
		srcFailureEClass.getESuperTypes().add(this.getSrcNodeContainer());
		srcDefaultEClass.getESuperTypes().add(this.getSrcNodeContainer());
		srcNodeEClass.getESuperTypes().add(this.getSrcElement());
		srcSwitchEClass.getESuperTypes().add(this.getSrcNode());
		srcLocationEClass.getESuperTypes().add(this.getSrcNode());
		srcLocationEClass.getESuperTypes().add(this.getSrcNodeContainer());
		srcSubCallEClass.getESuperTypes().add(this.getSrcNode());
		srcActionEClass.getESuperTypes().add(this.getSrcNode());
		srcSignallingActionEClass.getESuperTypes().add(this.getSrcAction());
		trgProgramEClass.getESuperTypes().add(this.getTrgLocatedElement());
		trgStructurePropertyEClass.getESuperTypes().add(this.getTrgLocatedElement());
		trgClientErrorResponseEClass.getESuperTypes().add(this.getTrgErrorResponse());
		trgGlobalErrorResponseEClass.getESuperTypes().add(this.getTrgErrorResponse());
		trgRedirectionErrorResponseEClass.getESuperTypes().add(this.getTrgErrorResponse());
		trgServerErrorResponseEClass.getESuperTypes().add(this.getTrgErrorResponse());
		trgServiceEClass.getESuperTypes().add(this.getTrgLocatedElement());
		trgSessionEClass.getESuperTypes().add(this.getTrgLocatedElement());
		trgRegistrationEClass.getESuperTypes().add(this.getTrgSession());
		trgDialogEClass.getESuperTypes().add(this.getTrgSession());
		trgEventEClass.getESuperTypes().add(this.getTrgSession());
		trgMethodEClass.getESuperTypes().add(this.getTrgSession());
		trgArgumentEClass.getESuperTypes().add(this.getTrgVariableDeclaration());
		trgMethodNameEClass.getESuperTypes().add(this.getTrgLocatedElement());
		trgSIPMethodNameEClass.getESuperTypes().add(this.getTrgMethodName());
		trgControlMethodNameEClass.getESuperTypes().add(this.getTrgMethodName());
		trgBranchEClass.getESuperTypes().add(this.getTrgLocatedElement());
		trgDefaultBranchEClass.getESuperTypes().add(this.getTrgBranch());
		trgNamedBranchEClass.getESuperTypes().add(this.getTrgBranch());
		trgTypeExpressionEClass.getESuperTypes().add(this.getTrgLocatedElement());
		trgSimpleTypeEClass.getESuperTypes().add(this.getTrgTypeExpression());
		trgSequenceTypeEClass.getESuperTypes().add(this.getTrgTypeExpression());
		trgDefinedTypeEClass.getESuperTypes().add(this.getTrgTypeExpression());
		trgDeclarationEClass.getESuperTypes().add(this.getTrgLocatedElement());
		trgVariableDeclarationEClass.getESuperTypes().add(this.getTrgDeclaration());
		trgFunctionDeclarationEClass.getESuperTypes().add(this.getTrgDeclaration());
		trgRemoteFunctionDeclarationEClass.getESuperTypes().add(this.getTrgFunctionDeclaration());
		trgLocalFunctionDeclarationEClass.getESuperTypes().add(this.getTrgFunctionDeclaration());
		trgStructureDeclarationEClass.getESuperTypes().add(this.getTrgDeclaration());
		trgFunctionCallEClass.getESuperTypes().add(this.getTrgLocatedElement());
		trgStatementEClass.getESuperTypes().add(this.getTrgLocatedElement());
		trgCompoundStatEClass.getESuperTypes().add(this.getTrgStatement());
		trgSetStatEClass.getESuperTypes().add(this.getTrgStatement());
		trgDeclarationStatEClass.getESuperTypes().add(this.getTrgStatement());
		trgReturnStatEClass.getESuperTypes().add(this.getTrgStatement());
		trgIfStatEClass.getESuperTypes().add(this.getTrgStatement());
		trgWhenStatEClass.getESuperTypes().add(this.getTrgStatement());
		trgForeachStatEClass.getESuperTypes().add(this.getTrgStatement());
		trgSelectStatEClass.getESuperTypes().add(this.getTrgStatement());
		trgFunctionCallStatEClass.getESuperTypes().add(this.getTrgStatement());
		trgContinueStatEClass.getESuperTypes().add(this.getTrgStatement());
		trgBreakStatEClass.getESuperTypes().add(this.getTrgStatement());
		trgPushStatEClass.getESuperTypes().add(this.getTrgStatement());
		trgWhenHeaderEClass.getESuperTypes().add(this.getTrgVariableDeclaration());
		trgSelectMemberEClass.getESuperTypes().add(this.getTrgLocatedElement());
		trgSelectDefaultEClass.getESuperTypes().add(this.getTrgSelectMember());
		trgSelectCaseEClass.getESuperTypes().add(this.getTrgSelectMember());
		trgExpressionEClass.getESuperTypes().add(this.getTrgLocatedElement());
		trgConstantExpEClass.getESuperTypes().add(this.getTrgExpression());
		trgOperatorExpEClass.getESuperTypes().add(this.getTrgExpression());
		trgForwardExpEClass.getESuperTypes().add(this.getTrgExpression());
		trgWithExpEClass.getESuperTypes().add(this.getTrgExpression());
		trgBlockExpEClass.getESuperTypes().add(this.getTrgExpression());
		trgReasonExpEClass.getESuperTypes().add(this.getTrgExpression());
		trgBODYExpEClass.getESuperTypes().add(this.getTrgExpression());
		trgRequestURIExpEClass.getESuperTypes().add(this.getTrgExpression());
		trgPopExpEClass.getESuperTypes().add(this.getTrgExpression());
		trgFunctionCallExpEClass.getESuperTypes().add(this.getTrgExpression());
		trgPlaceEClass.getESuperTypes().add(this.getTrgExpression());
		trgSIPHeaderPlaceEClass.getESuperTypes().add(this.getTrgPlace());
		trgVariablePlaceEClass.getESuperTypes().add(this.getTrgPlace());
		trgPropertyCallPlaceEClass.getESuperTypes().add(this.getTrgVariablePlace());
		trgVariableEClass.getESuperTypes().add(this.getTrgVariablePlace());
		trgMessageFieldEClass.getESuperTypes().add(this.getTrgLocatedElement());
		trgReasonMessageFieldEClass.getESuperTypes().add(this.getTrgMessageField());
		trgHeadedMessageFieldEClass.getESuperTypes().add(this.getTrgMessageField());
		trgConstantEClass.getESuperTypes().add(this.getTrgLocatedElement());
		trgBooleanConstantEClass.getESuperTypes().add(this.getTrgConstant());
		trgIntegerConstantEClass.getESuperTypes().add(this.getTrgConstant());
		trgStringConstantEClass.getESuperTypes().add(this.getTrgConstant());
		trgURIConstantEClass.getESuperTypes().add(this.getTrgConstant());
		trgSequenceConstantEClass.getESuperTypes().add(this.getTrgConstant());
		trgResponseConstantEClass.getESuperTypes().add(this.getTrgConstant());
		trgResponseEClass.getESuperTypes().add(this.getTrgLocatedElement());
		trgSuccessResponseEClass.getESuperTypes().add(this.getTrgResponse());
		trgErrorResponseEClass.getESuperTypes().add(this.getTrgResponse());

		// Initialize classes, features, and operations; add parameters
		initEClass(jointMMEClass, JointMM.class, "JointMM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJointMM_SourceRoot(), this.getSrcReject(), null, "sourceRoot", null, 1, 1, JointMM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJointMM_TargetRoot(), this.getTrgServerErrorResponse(), null, "targetRoot", null, 1, 1, JointMM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(srcCPLModelEClass, SrcCPLModel.class, "SrcCPLModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSrcCPLModel_Elements(), this.getSrcElement(), null, "elements", null, 0, -1, SrcCPLModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(srcCPLEClass, SrcCPL.class, "SrcCPL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSrcCPL_SubActions(), this.getSrcSubAction(), null, "subActions", null, 0, -1, SrcCPL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSrcCPL_Outgoing(), this.getSrcOutgoing(), null, "outgoing", null, 0, 1, SrcCPL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSrcCPL_Incoming(), this.getSrcIncoming(), null, "incoming", null, 0, 1, SrcCPL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(srcAddressSwitchEClass, SrcAddressSwitch.class, "SrcAddressSwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSrcAddressSwitch_Field(), ecorePackage.getEString(), "field", null, 1, 1, SrcAddressSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSrcAddressSwitch_SubField(), ecorePackage.getEString(), "subField", null, 0, 1, SrcAddressSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSrcAddressSwitch_Addresses(), this.getSrcSwitchedAddress(), null, "addresses", null, 0, -1, SrcAddressSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(srcStringSwitchEClass, SrcStringSwitch.class, "SrcStringSwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSrcStringSwitch_Field(), ecorePackage.getEString(), "field", null, 1, 1, SrcStringSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSrcStringSwitch_Strings(), this.getSrcSwitchedString(), null, "strings", null, 0, -1, SrcStringSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(srcLanguageSwitchEClass, SrcLanguageSwitch.class, "SrcLanguageSwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSrcLanguageSwitch_Languages(), this.getSrcSwitchedLanguage(), null, "languages", null, 0, -1, SrcLanguageSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(srcTimeSwitchEClass, SrcTimeSwitch.class, "SrcTimeSwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSrcTimeSwitch_Tzid(), ecorePackage.getEString(), "tzid", null, 0, 1, SrcTimeSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSrcTimeSwitch_Tzurl(), ecorePackage.getEString(), "tzurl", null, 0, 1, SrcTimeSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSrcTimeSwitch_Times(), this.getSrcSwitchedTime(), null, "times", null, 0, -1, SrcTimeSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(srcPrioritySwitchEClass, SrcPrioritySwitch.class, "SrcPrioritySwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSrcPrioritySwitch_Priorities(), this.getSrcSwitchedPriority(), null, "priorities", null, 0, -1, SrcPrioritySwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(srcProxyEClass, SrcProxy.class, "SrcProxy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSrcProxy_Timeout(), ecorePackage.getEString(), "timeout", null, 0, 1, SrcProxy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSrcProxy_Recurse(), ecorePackage.getEString(), "recurse", null, 1, 1, SrcProxy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSrcProxy_Ordering(), ecorePackage.getEString(), "ordering", null, 1, 1, SrcProxy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSrcProxy_Busy(), this.getSrcBusy(), null, "busy", null, 0, 1, SrcProxy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSrcProxy_NoAnswer(), this.getSrcNoAnswer(), null, "noAnswer", null, 0, 1, SrcProxy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSrcProxy_Redirection(), this.getSrcRedirection(), null, "redirection", null, 0, 1, SrcProxy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSrcProxy_Failure(), this.getSrcFailure(), null, "failure", null, 0, 1, SrcProxy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSrcProxy_Default(), this.getSrcDefault(), null, "default", null, 0, 1, SrcProxy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(srcRedirectEClass, SrcRedirect.class, "SrcRedirect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSrcRedirect_Permanent(), ecorePackage.getEString(), "permanent", null, 1, 1, SrcRedirect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(srcRejectEClass, SrcReject.class, "SrcReject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSrcReject_Status(), ecorePackage.getEString(), "status", null, 1, 1, SrcReject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSrcReject_Reason(), ecorePackage.getEString(), "reason", null, 0, 1, SrcReject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(srcElementEClass, SrcElement.class, "SrcElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(srcNodeContainerEClass, SrcNodeContainer.class, "SrcNodeContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSrcNodeContainer_Contents(), this.getSrcNode(), null, "contents", null, 0, 1, SrcNodeContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(srcSubActionEClass, SrcSubAction.class, "SrcSubAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSrcSubAction_Id(), ecorePackage.getEString(), "id", null, 1, 1, SrcSubAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(srcOutgoingEClass, SrcOutgoing.class, "SrcOutgoing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(srcIncomingEClass, SrcIncoming.class, "SrcIncoming", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(srcNotPresentEClass, SrcNotPresent.class, "SrcNotPresent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(srcOtherwiseEClass, SrcOtherwise.class, "SrcOtherwise", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(srcSwitchedAddressEClass, SrcSwitchedAddress.class, "SrcSwitchedAddress", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSrcSwitchedAddress_Is(), ecorePackage.getEString(), "is", null, 0, 1, SrcSwitchedAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSrcSwitchedAddress_Contains(), ecorePackage.getEString(), "contains", null, 0, 1, SrcSwitchedAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSrcSwitchedAddress_SubDomainOf(), ecorePackage.getEString(), "subDomainOf", null, 0, 1, SrcSwitchedAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(srcSwitchedStringEClass, SrcSwitchedString.class, "SrcSwitchedString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSrcSwitchedString_Is(), ecorePackage.getEString(), "is", null, 0, 1, SrcSwitchedString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSrcSwitchedString_Contains(), ecorePackage.getEString(), "contains", null, 0, 1, SrcSwitchedString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(srcSwitchedLanguageEClass, SrcSwitchedLanguage.class, "SrcSwitchedLanguage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSrcSwitchedLanguage_Matches(), ecorePackage.getEString(), "matches", null, 1, 1, SrcSwitchedLanguage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(srcSwitchedTimeEClass, SrcSwitchedTime.class, "SrcSwitchedTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSrcSwitchedTime_Dtstart(), ecorePackage.getEString(), "dtstart", null, 1, 1, SrcSwitchedTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSrcSwitchedTime_Dtend(), ecorePackage.getEString(), "dtend", null, 0, 1, SrcSwitchedTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSrcSwitchedTime_Duration(), ecorePackage.getEString(), "duration", null, 0, 1, SrcSwitchedTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSrcSwitchedTime_Freq(), ecorePackage.getEString(), "freq", null, 0, 1, SrcSwitchedTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSrcSwitchedTime_Until(), ecorePackage.getEString(), "until", null, 0, 1, SrcSwitchedTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSrcSwitchedTime_Count(), ecorePackage.getEString(), "count", null, 0, 1, SrcSwitchedTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSrcSwitchedTime_Interval(), ecorePackage.getEString(), "interval", null, 1, 1, SrcSwitchedTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSrcSwitchedTime_BySecond(), ecorePackage.getEString(), "bySecond", null, 0, 1, SrcSwitchedTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSrcSwitchedTime_ByMinute(), ecorePackage.getEString(), "byMinute", null, 0, 1, SrcSwitchedTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSrcSwitchedTime_ByHour(), ecorePackage.getEString(), "byHour", null, 0, 1, SrcSwitchedTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSrcSwitchedTime_ByDay(), ecorePackage.getEString(), "byDay", null, 0, 1, SrcSwitchedTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSrcSwitchedTime_ByMonthDay(), ecorePackage.getEString(), "byMonthDay", null, 0, 1, SrcSwitchedTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSrcSwitchedTime_ByYearDay(), ecorePackage.getEString(), "byYearDay", null, 0, 1, SrcSwitchedTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSrcSwitchedTime_ByWeekNo(), ecorePackage.getEString(), "byWeekNo", null, 0, 1, SrcSwitchedTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSrcSwitchedTime_ByMonth(), ecorePackage.getEString(), "byMonth", null, 0, 1, SrcSwitchedTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSrcSwitchedTime_Wkst(), ecorePackage.getEString(), "wkst", null, 1, 1, SrcSwitchedTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSrcSwitchedTime_BySetPos(), ecorePackage.getEString(), "bySetPos", null, 0, 1, SrcSwitchedTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(srcSwitchedPriorityEClass, SrcSwitchedPriority.class, "SrcSwitchedPriority", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSrcSwitchedPriority_Less(), ecorePackage.getEString(), "less", null, 0, 1, SrcSwitchedPriority.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSrcSwitchedPriority_Greater(), ecorePackage.getEString(), "greater", null, 0, 1, SrcSwitchedPriority.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSrcSwitchedPriority_Equal(), ecorePackage.getEString(), "equal", null, 0, 1, SrcSwitchedPriority.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(srcBusyEClass, SrcBusy.class, "SrcBusy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(srcNoAnswerEClass, SrcNoAnswer.class, "SrcNoAnswer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(srcRedirectionEClass, SrcRedirection.class, "SrcRedirection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(srcFailureEClass, SrcFailure.class, "SrcFailure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(srcDefaultEClass, SrcDefault.class, "SrcDefault", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(srcNodeEClass, SrcNode.class, "SrcNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(srcSwitchEClass, SrcSwitch.class, "SrcSwitch", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSrcSwitch_NotPresent(), this.getSrcNotPresent(), null, "notPresent", null, 0, 1, SrcSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSrcSwitch_Otherwise(), this.getSrcOtherwise(), null, "otherwise", null, 0, 1, SrcSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(srcLocationEClass, SrcLocation.class, "SrcLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSrcLocation_Url(), ecorePackage.getEString(), "url", null, 1, 1, SrcLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSrcLocation_Priority(), ecorePackage.getEString(), "priority", null, 0, 1, SrcLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSrcLocation_Clear(), ecorePackage.getEString(), "clear", null, 1, 1, SrcLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(srcSubCallEClass, SrcSubCall.class, "SrcSubCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSrcSubCall_Ref(), ecorePackage.getEString(), "ref", null, 1, 1, SrcSubCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(srcActionEClass, SrcAction.class, "SrcAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(srcSignallingActionEClass, SrcSignallingAction.class, "SrcSignallingAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(trgProgramEClass, TrgProgram.class, "TrgProgram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgProgram_Service(), this.getTrgService(), null, "service", null, 1, 1, TrgProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgStructurePropertyEClass, TrgStructureProperty.class, "TrgStructureProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrgStructureProperty_Name(), ecorePackage.getEString(), "name", null, 1, 1, TrgStructureProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrgStructureProperty_Type(), this.getTrgTypeExpression(), null, "type", null, 1, 1, TrgStructureProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgClientErrorResponseEClass, TrgClientErrorResponse.class, "TrgClientErrorResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrgClientErrorResponse_ErrorKind(), this.getClientErrorKind(), "errorKind", null, 0, 1, TrgClientErrorResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgGlobalErrorResponseEClass, TrgGlobalErrorResponse.class, "TrgGlobalErrorResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrgGlobalErrorResponse_ErrorKind(), this.getGlobalErrorKind(), "errorKind", null, 0, 1, TrgGlobalErrorResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgRedirectionErrorResponseEClass, TrgRedirectionErrorResponse.class, "TrgRedirectionErrorResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrgRedirectionErrorResponse_ErrorKind(), this.getRedirectionErrorKind(), "errorKind", null, 0, 1, TrgRedirectionErrorResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgServerErrorResponseEClass, TrgServerErrorResponse.class, "TrgServerErrorResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrgServerErrorResponse_ErrorKind(), this.getServerErrorKind(), "errorKind", null, 0, 1, TrgServerErrorResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgLocatedElementEClass, TrgLocatedElement.class, "TrgLocatedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrgLocatedElement_Location(), ecorePackage.getEString(), "location", null, 1, 1, TrgLocatedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTrgLocatedElement_CommentsBefore(), ecorePackage.getEString(), "commentsBefore", null, 0, -1, TrgLocatedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrgLocatedElement_CommentsAfter(), ecorePackage.getEString(), "commentsAfter", null, 0, -1, TrgLocatedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trgServiceEClass, TrgService.class, "TrgService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrgService_Name(), ecorePackage.getEString(), "name", null, 1, 1, TrgService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrgService_Declarations(), this.getTrgDeclaration(), null, "declarations", null, 0, -1, TrgService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrgService_Sessions(), this.getTrgSession(), null, "sessions", null, 0, -1, TrgService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trgSessionEClass, TrgSession.class, "TrgSession", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(trgRegistrationEClass, TrgRegistration.class, "TrgRegistration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgRegistration_Declarations(), this.getTrgDeclaration(), null, "declarations", null, 0, -1, TrgRegistration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrgRegistration_Sessions(), this.getTrgSession(), null, "sessions", null, 0, -1, TrgRegistration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trgDialogEClass, TrgDialog.class, "TrgDialog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgDialog_Declarations(), this.getTrgDeclaration(), null, "declarations", null, 0, -1, TrgDialog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrgDialog_Methods(), this.getTrgMethod(), null, "methods", null, 1, -1, TrgDialog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trgEventEClass, TrgEvent.class, "TrgEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrgEvent_EventId(), ecorePackage.getEString(), "eventId", null, 1, 1, TrgEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrgEvent_Declarations(), this.getTrgDeclaration(), null, "declarations", null, 0, -1, TrgEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrgEvent_Methods(), this.getTrgMethod(), null, "methods", null, 1, -1, TrgEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trgMethodEClass, TrgMethod.class, "TrgMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgMethod_Type(), this.getTrgTypeExpression(), null, "type", null, 1, 1, TrgMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTrgMethod_Direction(), this.getDirection(), "direction", null, 1, 1, TrgMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrgMethod_MethodName(), this.getTrgMethodName(), null, "methodName", null, 1, 1, TrgMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrgMethod_Arguments(), this.getTrgArgument(), null, "arguments", null, 0, -1, TrgMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrgMethod_Statements(), this.getTrgStatement(), null, "statements", null, 1, -1, TrgMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrgMethod_Branches(), this.getTrgBranch(), null, "branches", null, 1, -1, TrgMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trgArgumentEClass, TrgArgument.class, "TrgArgument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(trgMethodNameEClass, TrgMethodName.class, "TrgMethodName", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(trgSIPMethodNameEClass, TrgSIPMethodName.class, "TrgSIPMethodName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrgSIPMethodName_Name(), this.getSIPMethod(), "name", null, 1, 1, TrgSIPMethodName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgControlMethodNameEClass, TrgControlMethodName.class, "TrgControlMethodName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrgControlMethodName_Name(), this.getControlMethod(), "name", null, 1, 1, TrgControlMethodName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgBranchEClass, TrgBranch.class, "TrgBranch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgBranch_Statements(), this.getTrgStatement(), null, "statements", null, 1, -1, TrgBranch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trgDefaultBranchEClass, TrgDefaultBranch.class, "TrgDefaultBranch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(trgNamedBranchEClass, TrgNamedBranch.class, "TrgNamedBranch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrgNamedBranch_Name(), ecorePackage.getEString(), "name", null, 1, -1, TrgNamedBranch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trgTypeExpressionEClass, TrgTypeExpression.class, "TrgTypeExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(trgSimpleTypeEClass, TrgSimpleType.class, "TrgSimpleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrgSimpleType_Type(), this.getPrimitiveType(), "type", null, 1, 1, TrgSimpleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgSequenceTypeEClass, TrgSequenceType.class, "TrgSequenceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrgSequenceType_Modifier(), this.getModifier(), "modifier", null, 0, 1, TrgSequenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTrgSequenceType_Type(), this.getPrimitiveType(), "type", null, 1, 1, TrgSequenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTrgSequenceType_Size(), ecorePackage.getEInt(), "size", null, 0, 1, TrgSequenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgDefinedTypeEClass, TrgDefinedType.class, "TrgDefinedType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrgDefinedType_TypeName(), ecorePackage.getEString(), "typeName", null, 1, 1, TrgDefinedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgDeclarationEClass, TrgDeclaration.class, "TrgDeclaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrgDeclaration_Name(), ecorePackage.getEString(), "name", null, 1, 1, TrgDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgVariableDeclarationEClass, TrgVariableDeclaration.class, "TrgVariableDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgVariableDeclaration_Type(), this.getTrgTypeExpression(), null, "type", null, 1, 1, TrgVariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrgVariableDeclaration_InitExp(), this.getTrgExpression(), null, "initExp", null, 0, 1, TrgVariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgFunctionDeclarationEClass, TrgFunctionDeclaration.class, "TrgFunctionDeclaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgFunctionDeclaration_ReturnType(), this.getTrgTypeExpression(), null, "returnType", null, 1, 1, TrgFunctionDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrgFunctionDeclaration_Arguments(), this.getTrgArgument(), null, "arguments", null, 0, -1, TrgFunctionDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trgRemoteFunctionDeclarationEClass, TrgRemoteFunctionDeclaration.class, "TrgRemoteFunctionDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrgRemoteFunctionDeclaration_FunctionLocation(), this.getFunctionLocation(), "functionLocation", null, 1, 1, TrgRemoteFunctionDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgLocalFunctionDeclarationEClass, TrgLocalFunctionDeclaration.class, "TrgLocalFunctionDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgLocalFunctionDeclaration_Statements(), this.getTrgStatement(), null, "statements", null, 1, -1, TrgLocalFunctionDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trgStructureDeclarationEClass, TrgStructureDeclaration.class, "TrgStructureDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgStructureDeclaration_Properties(), this.getTrgArgument(), null, "properties", null, 1, -1, TrgStructureDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trgFunctionCallEClass, TrgFunctionCall.class, "TrgFunctionCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgFunctionCall_Function(), this.getTrgFunctionDeclaration(), null, "function", null, 1, 1, TrgFunctionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrgFunctionCall_Parameters(), this.getTrgExpression(), null, "parameters", null, 0, -1, TrgFunctionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trgStatementEClass, TrgStatement.class, "TrgStatement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(trgCompoundStatEClass, TrgCompoundStat.class, "TrgCompoundStat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgCompoundStat_Statements(), this.getTrgStatement(), null, "statements", null, 1, -1, TrgCompoundStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgSetStatEClass, TrgSetStat.class, "TrgSetStat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgSetStat_Target(), this.getTrgPlace(), null, "target", null, 1, 1, TrgSetStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrgSetStat_SetValue(), this.getTrgExpression(), null, "setValue", null, 1, 1, TrgSetStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgDeclarationStatEClass, TrgDeclarationStat.class, "TrgDeclarationStat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgDeclarationStat_Declaration(), this.getTrgDeclaration(), null, "declaration", null, 1, 1, TrgDeclarationStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgReturnStatEClass, TrgReturnStat.class, "TrgReturnStat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgReturnStat_ReturnedValue(), this.getTrgExpression(), null, "returnedValue", null, 0, 1, TrgReturnStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrgReturnStat_Branch(), this.getTrgNamedBranch(), null, "branch", null, 0, 1, TrgReturnStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgIfStatEClass, TrgIfStat.class, "TrgIfStat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgIfStat_Condition(), this.getTrgExpression(), null, "condition", null, 1, 1, TrgIfStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrgIfStat_ThenStatements(), this.getTrgStatement(), null, "thenStatements", null, 1, -1, TrgIfStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrgIfStat_ElseStatements(), this.getTrgStatement(), null, "elseStatements", null, 0, -1, TrgIfStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trgWhenStatEClass, TrgWhenStat.class, "TrgWhenStat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgWhenStat_IdExp(), this.getTrgVariable(), null, "idExp", null, 1, 1, TrgWhenStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrgWhenStat_WhenHeaders(), this.getTrgWhenHeader(), null, "whenHeaders", null, 1, -1, TrgWhenStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrgWhenStat_Statements(), this.getTrgStatement(), null, "statements", null, 1, -1, TrgWhenStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrgWhenStat_ElseStatements(), this.getTrgStatement(), null, "elseStatements", null, 0, -1, TrgWhenStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trgForeachStatEClass, TrgForeachStat.class, "TrgForeachStat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrgForeachStat_IteratorName(), ecorePackage.getEString(), "iteratorName", null, 1, 1, TrgForeachStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrgForeachStat_SequenceExp(), this.getTrgExpression(), null, "sequenceExp", null, 1, 1, TrgForeachStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrgForeachStat_Statements(), this.getTrgStatement(), null, "statements", null, 1, -1, TrgForeachStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trgSelectStatEClass, TrgSelectStat.class, "TrgSelectStat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgSelectStat_MatchedExp(), this.getTrgExpression(), null, "matchedExp", null, 1, 1, TrgSelectStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrgSelectStat_SelectCases(), this.getTrgSelectCase(), null, "selectCases", null, 0, -1, TrgSelectStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrgSelectStat_SelectDefault(), this.getTrgSelectDefault(), null, "selectDefault", null, 0, 1, TrgSelectStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgFunctionCallStatEClass, TrgFunctionCallStat.class, "TrgFunctionCallStat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgFunctionCallStat_FunctionCall(), this.getTrgFunctionCall(), null, "functionCall", null, 1, 1, TrgFunctionCallStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgContinueStatEClass, TrgContinueStat.class, "TrgContinueStat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(trgBreakStatEClass, TrgBreakStat.class, "TrgBreakStat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(trgPushStatEClass, TrgPushStat.class, "TrgPushStat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgPushStat_Target(), this.getTrgPlace(), null, "target", null, 1, 1, TrgPushStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrgPushStat_PushedValue(), this.getTrgExpression(), null, "pushedValue", null, 1, 1, TrgPushStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgWhenHeaderEClass, TrgWhenHeader.class, "TrgWhenHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrgWhenHeader_HeaderId(), ecorePackage.getEString(), "headerId", null, 1, 1, TrgWhenHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrgWhenHeader_Value(), this.getTrgConstant(), null, "value", null, 0, 1, TrgWhenHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgSelectMemberEClass, TrgSelectMember.class, "TrgSelectMember", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgSelectMember_Statements(), this.getTrgStatement(), null, "statements", null, 0, -1, TrgSelectMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trgSelectDefaultEClass, TrgSelectDefault.class, "TrgSelectDefault", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(trgSelectCaseEClass, TrgSelectCase.class, "TrgSelectCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgSelectCase_Values(), this.getTrgConstant(), null, "values", null, 1, -1, TrgSelectCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trgExpressionEClass, TrgExpression.class, "TrgExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(trgConstantExpEClass, TrgConstantExp.class, "TrgConstantExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgConstantExp_Value(), this.getTrgConstant(), null, "value", null, 1, 1, TrgConstantExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgOperatorExpEClass, TrgOperatorExp.class, "TrgOperatorExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrgOperatorExp_OpName(), ecorePackage.getEString(), "opName", null, 1, 1, TrgOperatorExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrgOperatorExp_LeftExp(), this.getTrgExpression(), null, "leftExp", null, 1, 1, TrgOperatorExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrgOperatorExp_RightExp(), this.getTrgExpression(), null, "rightExp", null, 0, 1, TrgOperatorExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgForwardExpEClass, TrgForwardExp.class, "TrgForwardExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrgForwardExp_IsParallel(), ecorePackage.getEBoolean(), "isParallel", null, 1, 1, TrgForwardExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrgForwardExp_Exp(), this.getTrgExpression(), null, "exp", null, 0, 1, TrgForwardExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgWithExpEClass, TrgWithExp.class, "TrgWithExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgWithExp_Exp(), this.getTrgExpression(), null, "exp", null, 1, 1, TrgWithExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrgWithExp_MsgFields(), this.getTrgMessageField(), null, "msgFields", null, 1, -1, TrgWithExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trgBlockExpEClass, TrgBlockExp.class, "TrgBlockExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgBlockExp_Exp(), this.getTrgExpression(), null, "exp", null, 1, 1, TrgBlockExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgReasonExpEClass, TrgReasonExp.class, "TrgReasonExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(trgBODYExpEClass, TrgBODYExp.class, "TrgBODYExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(trgRequestURIExpEClass, TrgRequestURIExp.class, "TrgRequestURIExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(trgPopExpEClass, TrgPopExp.class, "TrgPopExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgPopExp_Source(), this.getTrgPlace(), null, "source", null, 1, 1, TrgPopExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgFunctionCallExpEClass, TrgFunctionCallExp.class, "TrgFunctionCallExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgFunctionCallExp_FunctionCall(), this.getTrgFunctionCall(), null, "functionCall", null, 1, 1, TrgFunctionCallExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgPlaceEClass, TrgPlace.class, "TrgPlace", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(trgSIPHeaderPlaceEClass, TrgSIPHeaderPlace.class, "TrgSIPHeaderPlace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrgSIPHeaderPlace_Header(), this.getSIPHeader(), "header", null, 1, 1, TrgSIPHeaderPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgVariablePlaceEClass, TrgVariablePlace.class, "TrgVariablePlace", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(trgPropertyCallPlaceEClass, TrgPropertyCallPlace.class, "TrgPropertyCallPlace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrgPropertyCallPlace_PropName(), ecorePackage.getEString(), "propName", null, 1, 1, TrgPropertyCallPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrgPropertyCallPlace_Source(), this.getTrgVariablePlace(), null, "source", null, 1, 1, TrgPropertyCallPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgVariableEClass, TrgVariable.class, "TrgVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgVariable_Source(), this.getTrgDeclaration(), null, "source", null, 1, 1, TrgVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgMessageFieldEClass, TrgMessageField.class, "TrgMessageField", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgMessageField_Exp(), this.getTrgExpression(), null, "exp", null, 1, 1, TrgMessageField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgReasonMessageFieldEClass, TrgReasonMessageField.class, "TrgReasonMessageField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(trgHeadedMessageFieldEClass, TrgHeadedMessageField.class, "TrgHeadedMessageField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrgHeadedMessageField_HeaderId(), ecorePackage.getEString(), "headerId", null, 1, 1, TrgHeadedMessageField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgConstantEClass, TrgConstant.class, "TrgConstant", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(trgBooleanConstantEClass, TrgBooleanConstant.class, "TrgBooleanConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrgBooleanConstant_Value(), ecorePackage.getEBoolean(), "value", null, 1, 1, TrgBooleanConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgIntegerConstantEClass, TrgIntegerConstant.class, "TrgIntegerConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrgIntegerConstant_Value(), ecorePackage.getEInt(), "value", null, 1, 1, TrgIntegerConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgStringConstantEClass, TrgStringConstant.class, "TrgStringConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrgStringConstant_Value(), ecorePackage.getEString(), "value", null, 1, 1, TrgStringConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgURIConstantEClass, TrgURIConstant.class, "TrgURIConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrgURIConstant_Uri(), ecorePackage.getEString(), "uri", null, 1, 1, TrgURIConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgSequenceConstantEClass, TrgSequenceConstant.class, "TrgSequenceConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgSequenceConstant_Values(), this.getTrgConstant(), null, "values", null, 0, -1, TrgSequenceConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trgResponseConstantEClass, TrgResponseConstant.class, "TrgResponseConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgResponseConstant_Response(), this.getTrgResponse(), null, "response", null, 1, 1, TrgResponseConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgResponseEClass, TrgResponse.class, "TrgResponse", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(trgSuccessResponseEClass, TrgSuccessResponse.class, "TrgSuccessResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrgSuccessResponse_SuccessKind(), this.getSuccessKind(), "successKind", null, 1, 1, TrgSuccessResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgErrorResponseEClass, TrgErrorResponse.class, "TrgErrorResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(directionEEnum, Direction.class, "Direction");
		addEEnumLiteral(directionEEnum, Direction.INOUT);
		addEEnumLiteral(directionEEnum, Direction.IN);
		addEEnumLiteral(directionEEnum, Direction.OUT);

		initEEnum(sipMethodEEnum, SIPMethod.class, "SIPMethod");
		addEEnumLiteral(sipMethodEEnum, SIPMethod.ACK);
		addEEnumLiteral(sipMethodEEnum, SIPMethod.BYE);
		addEEnumLiteral(sipMethodEEnum, SIPMethod.CANCEL);
		addEEnumLiteral(sipMethodEEnum, SIPMethod.INVITE);
		addEEnumLiteral(sipMethodEEnum, SIPMethod.NOTIFY);
		addEEnumLiteral(sipMethodEEnum, SIPMethod.OPTIONS);
		addEEnumLiteral(sipMethodEEnum, SIPMethod.REACK);
		addEEnumLiteral(sipMethodEEnum, SIPMethod.REGISTER);
		addEEnumLiteral(sipMethodEEnum, SIPMethod.REINVITE);
		addEEnumLiteral(sipMethodEEnum, SIPMethod.REREGISTER);
		addEEnumLiteral(sipMethodEEnum, SIPMethod.RESUBSCRIBE);
		addEEnumLiteral(sipMethodEEnum, SIPMethod.SUBSCRIBE);

		initEEnum(controlMethodEEnum, ControlMethod.class, "ControlMethod");
		addEEnumLiteral(controlMethodEEnum, ControlMethod.DEPLOY);
		addEEnumLiteral(controlMethodEEnum, ControlMethod.UNDEPLOY);
		addEEnumLiteral(controlMethodEEnum, ControlMethod.UNINVITE);
		addEEnumLiteral(controlMethodEEnum, ControlMethod.UNREGISTER);
		addEEnumLiteral(controlMethodEEnum, ControlMethod.UNSUBSCRIBE);

		initEEnum(primitiveTypeEEnum, PrimitiveType.class, "PrimitiveType");
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.VOID);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.BOOL);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.INT);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.REQUEST);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.RESPONSE);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.STRING);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.TIME);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.URI);

		initEEnum(modifierEEnum, Modifier.class, "Modifier");
		addEEnumLiteral(modifierEEnum, Modifier.LIFO);
		addEEnumLiteral(modifierEEnum, Modifier.FIFO);

		initEEnum(functionLocationEEnum, FunctionLocation.class, "FunctionLocation");
		addEEnumLiteral(functionLocationEEnum, FunctionLocation.REMOTE);
		addEEnumLiteral(functionLocationEEnum, FunctionLocation.LOCAL);

		initEEnum(sipHeaderEEnum, SIPHeader.class, "SIPHeader");
		addEEnumLiteral(sipHeaderEEnum, SIPHeader.CALL_ID);
		addEEnumLiteral(sipHeaderEEnum, SIPHeader.CONTACT);
		addEEnumLiteral(sipHeaderEEnum, SIPHeader.CSEQ);
		addEEnumLiteral(sipHeaderEEnum, SIPHeader.EVENT);
		addEEnumLiteral(sipHeaderEEnum, SIPHeader.FROM);
		addEEnumLiteral(sipHeaderEEnum, SIPHeader.MAX_FORWARDS);
		addEEnumLiteral(sipHeaderEEnum, SIPHeader.SUBSCRIPTION_STATE);
		addEEnumLiteral(sipHeaderEEnum, SIPHeader.TO);
		addEEnumLiteral(sipHeaderEEnum, SIPHeader.VIA);

		initEEnum(successKindEEnum, SuccessKind.class, "SuccessKind");
		addEEnumLiteral(successKindEEnum, SuccessKind.OK);
		addEEnumLiteral(successKindEEnum, SuccessKind.ACCEPTED);

		initEEnum(clientErrorKindEEnum, ClientErrorKind.class, "ClientErrorKind");
		addEEnumLiteral(clientErrorKindEEnum, ClientErrorKind.ADDRESS_INCOMPLETE);
		addEEnumLiteral(clientErrorKindEEnum, ClientErrorKind.AMBIGUOUS);
		addEEnumLiteral(clientErrorKindEEnum, ClientErrorKind.BAD_EXTENSION);
		addEEnumLiteral(clientErrorKindEEnum, ClientErrorKind.BAD_REQUEST);
		addEEnumLiteral(clientErrorKindEEnum, ClientErrorKind.BUSY_HERE);
		addEEnumLiteral(clientErrorKindEEnum, ClientErrorKind.CALL_OR_TRANSACTION_DOES_NOT_EXIST);
		addEEnumLiteral(clientErrorKindEEnum, ClientErrorKind.EXTENSION_REQUIRED);
		addEEnumLiteral(clientErrorKindEEnum, ClientErrorKind.FORBIDDEN);
		addEEnumLiteral(clientErrorKindEEnum, ClientErrorKind.GONE);
		addEEnumLiteral(clientErrorKindEEnum, ClientErrorKind.INTERVAL_TOO_BRIEF);
		addEEnumLiteral(clientErrorKindEEnum, ClientErrorKind.LOOP_DETECTED);
		addEEnumLiteral(clientErrorKindEEnum, ClientErrorKind.METHOD_NOT_ALLOWED);
		addEEnumLiteral(clientErrorKindEEnum, ClientErrorKind.NOT_ACCEPTABLE_HERE);
		addEEnumLiteral(clientErrorKindEEnum, ClientErrorKind.NOT_ACCEPTABLE);
		addEEnumLiteral(clientErrorKindEEnum, ClientErrorKind.NOT_FOUND);
		addEEnumLiteral(clientErrorKindEEnum, ClientErrorKind.PAYMENT_REQUIRED);
		addEEnumLiteral(clientErrorKindEEnum, ClientErrorKind.PROXY_AUTHENTICATION_REQUIRED);
		addEEnumLiteral(clientErrorKindEEnum, ClientErrorKind.REQUESTURI_TOO_LONG);
		addEEnumLiteral(clientErrorKindEEnum, ClientErrorKind.REQUEST_ENTITY_TOO_LARGE);
		addEEnumLiteral(clientErrorKindEEnum, ClientErrorKind.REQUEST_PENDING);
		addEEnumLiteral(clientErrorKindEEnum, ClientErrorKind.REQUEST_TERMINATED);
		addEEnumLiteral(clientErrorKindEEnum, ClientErrorKind.REQUEST_TIMEOUT);
		addEEnumLiteral(clientErrorKindEEnum, ClientErrorKind.TEMPORARILY_UNAVAILABLE);
		addEEnumLiteral(clientErrorKindEEnum, ClientErrorKind.TOO_MANY_HOPS);
		addEEnumLiteral(clientErrorKindEEnum, ClientErrorKind.UNAUTHORIZED);
		addEEnumLiteral(clientErrorKindEEnum, ClientErrorKind.UNDECIPHERABLE);
		addEEnumLiteral(clientErrorKindEEnum, ClientErrorKind.UNSUPPORTED_MEDIA_TYPE);
		addEEnumLiteral(clientErrorKindEEnum, ClientErrorKind.UNSUPPORTED_URI_SCHEME);

		initEEnum(globalErrorKindEEnum, GlobalErrorKind.class, "GlobalErrorKind");
		addEEnumLiteral(globalErrorKindEEnum, GlobalErrorKind.BUSY_EVERYWHERE);
		addEEnumLiteral(globalErrorKindEEnum, GlobalErrorKind.DECLINE);
		addEEnumLiteral(globalErrorKindEEnum, GlobalErrorKind.DOES_NOT_EXIST_ANYWHERE);
		addEEnumLiteral(globalErrorKindEEnum, GlobalErrorKind.NOT_ACCEPTABLE);

		initEEnum(redirectionErrorKindEEnum, RedirectionErrorKind.class, "RedirectionErrorKind");
		addEEnumLiteral(redirectionErrorKindEEnum, RedirectionErrorKind.ALTERNATIVE_SERVICE);
		addEEnumLiteral(redirectionErrorKindEEnum, RedirectionErrorKind.MOVED_PERMANENTLY);
		addEEnumLiteral(redirectionErrorKindEEnum, RedirectionErrorKind.MOVED_TEMPORARILY);
		addEEnumLiteral(redirectionErrorKindEEnum, RedirectionErrorKind.MULTIPLE_CHOICES);
		addEEnumLiteral(redirectionErrorKindEEnum, RedirectionErrorKind.USE_PROXY);

		initEEnum(serverErrorKindEEnum, ServerErrorKind.class, "ServerErrorKind");
		addEEnumLiteral(serverErrorKindEEnum, ServerErrorKind.BAD_GATEWAY);
		addEEnumLiteral(serverErrorKindEEnum, ServerErrorKind.MESSAGE_TOO_LARGE);
		addEEnumLiteral(serverErrorKindEEnum, ServerErrorKind.NOT_IMPLEMENTED);
		addEEnumLiteral(serverErrorKindEEnum, ServerErrorKind.SERVER_INTERNAL_ERROR);
		addEEnumLiteral(serverErrorKindEEnum, ServerErrorKind.SERVER_TIMEOUT);
		addEEnumLiteral(serverErrorKindEEnum, ServerErrorKind.SERVICE_UNAVAILABLE);
		addEEnumLiteral(serverErrorKindEEnum, ServerErrorKind.VERSION_NOT_SUPPORTED);

		// Create resource
		createResource(eNS_URI);
	}

} //JointPackage_CPL2SPLPackageImpl
