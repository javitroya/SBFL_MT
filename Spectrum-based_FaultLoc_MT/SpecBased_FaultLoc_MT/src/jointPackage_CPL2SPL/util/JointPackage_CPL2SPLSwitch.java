/**
 */
package jointPackage_CPL2SPL.util;

import jointPackage_CPL2SPL.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage
 * @generated
 */
public class JointPackage_CPL2SPLSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JointPackage_CPL2SPLPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JointPackage_CPL2SPLSwitch() {
		if (modelPackage == null) {
			modelPackage = JointPackage_CPL2SPLPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case JointPackage_CPL2SPLPackage.JOINT_MM: {
				JointMM jointMM = (JointMM)theEObject;
				T result = caseJointMM(jointMM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.SRC_CPL_MODEL: {
				SrcCPLModel srcCPLModel = (SrcCPLModel)theEObject;
				T result = caseSrcCPLModel(srcCPLModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.SRC_CPL: {
				SrcCPL srcCPL = (SrcCPL)theEObject;
				T result = caseSrcCPL(srcCPL);
				if (result == null) result = caseSrcElement(srcCPL);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.SRC_ADDRESS_SWITCH: {
				SrcAddressSwitch srcAddressSwitch = (SrcAddressSwitch)theEObject;
				T result = caseSrcAddressSwitch(srcAddressSwitch);
				if (result == null) result = caseSrcSwitch(srcAddressSwitch);
				if (result == null) result = caseSrcNode(srcAddressSwitch);
				if (result == null) result = caseSrcElement(srcAddressSwitch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.SRC_STRING_SWITCH: {
				SrcStringSwitch srcStringSwitch = (SrcStringSwitch)theEObject;
				T result = caseSrcStringSwitch(srcStringSwitch);
				if (result == null) result = caseSrcSwitch(srcStringSwitch);
				if (result == null) result = caseSrcNode(srcStringSwitch);
				if (result == null) result = caseSrcElement(srcStringSwitch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.SRC_LANGUAGE_SWITCH: {
				SrcLanguageSwitch srcLanguageSwitch = (SrcLanguageSwitch)theEObject;
				T result = caseSrcLanguageSwitch(srcLanguageSwitch);
				if (result == null) result = caseSrcSwitch(srcLanguageSwitch);
				if (result == null) result = caseSrcNode(srcLanguageSwitch);
				if (result == null) result = caseSrcElement(srcLanguageSwitch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.SRC_TIME_SWITCH: {
				SrcTimeSwitch srcTimeSwitch = (SrcTimeSwitch)theEObject;
				T result = caseSrcTimeSwitch(srcTimeSwitch);
				if (result == null) result = caseSrcSwitch(srcTimeSwitch);
				if (result == null) result = caseSrcNode(srcTimeSwitch);
				if (result == null) result = caseSrcElement(srcTimeSwitch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.SRC_PRIORITY_SWITCH: {
				SrcPrioritySwitch srcPrioritySwitch = (SrcPrioritySwitch)theEObject;
				T result = caseSrcPrioritySwitch(srcPrioritySwitch);
				if (result == null) result = caseSrcSwitch(srcPrioritySwitch);
				if (result == null) result = caseSrcNode(srcPrioritySwitch);
				if (result == null) result = caseSrcElement(srcPrioritySwitch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.SRC_PROXY: {
				SrcProxy srcProxy = (SrcProxy)theEObject;
				T result = caseSrcProxy(srcProxy);
				if (result == null) result = caseSrcSignallingAction(srcProxy);
				if (result == null) result = caseSrcAction(srcProxy);
				if (result == null) result = caseSrcNode(srcProxy);
				if (result == null) result = caseSrcElement(srcProxy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.SRC_REDIRECT: {
				SrcRedirect srcRedirect = (SrcRedirect)theEObject;
				T result = caseSrcRedirect(srcRedirect);
				if (result == null) result = caseSrcSignallingAction(srcRedirect);
				if (result == null) result = caseSrcAction(srcRedirect);
				if (result == null) result = caseSrcNode(srcRedirect);
				if (result == null) result = caseSrcElement(srcRedirect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.SRC_REJECT: {
				SrcReject srcReject = (SrcReject)theEObject;
				T result = caseSrcReject(srcReject);
				if (result == null) result = caseSrcSignallingAction(srcReject);
				if (result == null) result = caseSrcAction(srcReject);
				if (result == null) result = caseSrcNode(srcReject);
				if (result == null) result = caseSrcElement(srcReject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.SRC_ELEMENT: {
				SrcElement srcElement = (SrcElement)theEObject;
				T result = caseSrcElement(srcElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.SRC_NODE_CONTAINER: {
				SrcNodeContainer srcNodeContainer = (SrcNodeContainer)theEObject;
				T result = caseSrcNodeContainer(srcNodeContainer);
				if (result == null) result = caseSrcElement(srcNodeContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.SRC_SUB_ACTION: {
				SrcSubAction srcSubAction = (SrcSubAction)theEObject;
				T result = caseSrcSubAction(srcSubAction);
				if (result == null) result = caseSrcNodeContainer(srcSubAction);
				if (result == null) result = caseSrcElement(srcSubAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.SRC_OUTGOING: {
				SrcOutgoing srcOutgoing = (SrcOutgoing)theEObject;
				T result = caseSrcOutgoing(srcOutgoing);
				if (result == null) result = caseSrcNodeContainer(srcOutgoing);
				if (result == null) result = caseSrcElement(srcOutgoing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.SRC_INCOMING: {
				SrcIncoming srcIncoming = (SrcIncoming)theEObject;
				T result = caseSrcIncoming(srcIncoming);
				if (result == null) result = caseSrcNodeContainer(srcIncoming);
				if (result == null) result = caseSrcElement(srcIncoming);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.SRC_NOT_PRESENT: {
				SrcNotPresent srcNotPresent = (SrcNotPresent)theEObject;
				T result = caseSrcNotPresent(srcNotPresent);
				if (result == null) result = caseSrcNodeContainer(srcNotPresent);
				if (result == null) result = caseSrcElement(srcNotPresent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.SRC_OTHERWISE: {
				SrcOtherwise srcOtherwise = (SrcOtherwise)theEObject;
				T result = caseSrcOtherwise(srcOtherwise);
				if (result == null) result = caseSrcNodeContainer(srcOtherwise);
				if (result == null) result = caseSrcElement(srcOtherwise);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_ADDRESS: {
				SrcSwitchedAddress srcSwitchedAddress = (SrcSwitchedAddress)theEObject;
				T result = caseSrcSwitchedAddress(srcSwitchedAddress);
				if (result == null) result = caseSrcNodeContainer(srcSwitchedAddress);
				if (result == null) result = caseSrcElement(srcSwitchedAddress);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_STRING: {
				SrcSwitchedString srcSwitchedString = (SrcSwitchedString)theEObject;
				T result = caseSrcSwitchedString(srcSwitchedString);
				if (result == null) result = caseSrcNodeContainer(srcSwitchedString);
				if (result == null) result = caseSrcElement(srcSwitchedString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_LANGUAGE: {
				SrcSwitchedLanguage srcSwitchedLanguage = (SrcSwitchedLanguage)theEObject;
				T result = caseSrcSwitchedLanguage(srcSwitchedLanguage);
				if (result == null) result = caseSrcNodeContainer(srcSwitchedLanguage);
				if (result == null) result = caseSrcElement(srcSwitchedLanguage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME: {
				SrcSwitchedTime srcSwitchedTime = (SrcSwitchedTime)theEObject;
				T result = caseSrcSwitchedTime(srcSwitchedTime);
				if (result == null) result = caseSrcNodeContainer(srcSwitchedTime);
				if (result == null) result = caseSrcElement(srcSwitchedTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_PRIORITY: {
				SrcSwitchedPriority srcSwitchedPriority = (SrcSwitchedPriority)theEObject;
				T result = caseSrcSwitchedPriority(srcSwitchedPriority);
				if (result == null) result = caseSrcNodeContainer(srcSwitchedPriority);
				if (result == null) result = caseSrcElement(srcSwitchedPriority);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.SRC_BUSY: {
				SrcBusy srcBusy = (SrcBusy)theEObject;
				T result = caseSrcBusy(srcBusy);
				if (result == null) result = caseSrcNodeContainer(srcBusy);
				if (result == null) result = caseSrcElement(srcBusy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.SRC_NO_ANSWER: {
				SrcNoAnswer srcNoAnswer = (SrcNoAnswer)theEObject;
				T result = caseSrcNoAnswer(srcNoAnswer);
				if (result == null) result = caseSrcNodeContainer(srcNoAnswer);
				if (result == null) result = caseSrcElement(srcNoAnswer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.SRC_REDIRECTION: {
				SrcRedirection srcRedirection = (SrcRedirection)theEObject;
				T result = caseSrcRedirection(srcRedirection);
				if (result == null) result = caseSrcNodeContainer(srcRedirection);
				if (result == null) result = caseSrcElement(srcRedirection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.SRC_FAILURE: {
				SrcFailure srcFailure = (SrcFailure)theEObject;
				T result = caseSrcFailure(srcFailure);
				if (result == null) result = caseSrcNodeContainer(srcFailure);
				if (result == null) result = caseSrcElement(srcFailure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.SRC_DEFAULT: {
				SrcDefault srcDefault = (SrcDefault)theEObject;
				T result = caseSrcDefault(srcDefault);
				if (result == null) result = caseSrcNodeContainer(srcDefault);
				if (result == null) result = caseSrcElement(srcDefault);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.SRC_NODE: {
				SrcNode srcNode = (SrcNode)theEObject;
				T result = caseSrcNode(srcNode);
				if (result == null) result = caseSrcElement(srcNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.SRC_SWITCH: {
				SrcSwitch srcSwitch = (SrcSwitch)theEObject;
				T result = caseSrcSwitch(srcSwitch);
				if (result == null) result = caseSrcNode(srcSwitch);
				if (result == null) result = caseSrcElement(srcSwitch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.SRC_LOCATION: {
				SrcLocation srcLocation = (SrcLocation)theEObject;
				T result = caseSrcLocation(srcLocation);
				if (result == null) result = caseSrcNode(srcLocation);
				if (result == null) result = caseSrcNodeContainer(srcLocation);
				if (result == null) result = caseSrcElement(srcLocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.SRC_SUB_CALL: {
				SrcSubCall srcSubCall = (SrcSubCall)theEObject;
				T result = caseSrcSubCall(srcSubCall);
				if (result == null) result = caseSrcNode(srcSubCall);
				if (result == null) result = caseSrcElement(srcSubCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.SRC_ACTION: {
				SrcAction srcAction = (SrcAction)theEObject;
				T result = caseSrcAction(srcAction);
				if (result == null) result = caseSrcNode(srcAction);
				if (result == null) result = caseSrcElement(srcAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.SRC_SIGNALLING_ACTION: {
				SrcSignallingAction srcSignallingAction = (SrcSignallingAction)theEObject;
				T result = caseSrcSignallingAction(srcSignallingAction);
				if (result == null) result = caseSrcAction(srcSignallingAction);
				if (result == null) result = caseSrcNode(srcSignallingAction);
				if (result == null) result = caseSrcElement(srcSignallingAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_PROGRAM: {
				TrgProgram trgProgram = (TrgProgram)theEObject;
				T result = caseTrgProgram(trgProgram);
				if (result == null) result = caseTrgLocatedElement(trgProgram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_STRUCTURE_PROPERTY: {
				TrgStructureProperty trgStructureProperty = (TrgStructureProperty)theEObject;
				T result = caseTrgStructureProperty(trgStructureProperty);
				if (result == null) result = caseTrgLocatedElement(trgStructureProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_CLIENT_ERROR_RESPONSE: {
				TrgClientErrorResponse trgClientErrorResponse = (TrgClientErrorResponse)theEObject;
				T result = caseTrgClientErrorResponse(trgClientErrorResponse);
				if (result == null) result = caseTrgErrorResponse(trgClientErrorResponse);
				if (result == null) result = caseTrgResponse(trgClientErrorResponse);
				if (result == null) result = caseTrgLocatedElement(trgClientErrorResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_GLOBAL_ERROR_RESPONSE: {
				TrgGlobalErrorResponse trgGlobalErrorResponse = (TrgGlobalErrorResponse)theEObject;
				T result = caseTrgGlobalErrorResponse(trgGlobalErrorResponse);
				if (result == null) result = caseTrgErrorResponse(trgGlobalErrorResponse);
				if (result == null) result = caseTrgResponse(trgGlobalErrorResponse);
				if (result == null) result = caseTrgLocatedElement(trgGlobalErrorResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_REDIRECTION_ERROR_RESPONSE: {
				TrgRedirectionErrorResponse trgRedirectionErrorResponse = (TrgRedirectionErrorResponse)theEObject;
				T result = caseTrgRedirectionErrorResponse(trgRedirectionErrorResponse);
				if (result == null) result = caseTrgErrorResponse(trgRedirectionErrorResponse);
				if (result == null) result = caseTrgResponse(trgRedirectionErrorResponse);
				if (result == null) result = caseTrgLocatedElement(trgRedirectionErrorResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_SERVER_ERROR_RESPONSE: {
				TrgServerErrorResponse trgServerErrorResponse = (TrgServerErrorResponse)theEObject;
				T result = caseTrgServerErrorResponse(trgServerErrorResponse);
				if (result == null) result = caseTrgErrorResponse(trgServerErrorResponse);
				if (result == null) result = caseTrgResponse(trgServerErrorResponse);
				if (result == null) result = caseTrgLocatedElement(trgServerErrorResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_LOCATED_ELEMENT: {
				TrgLocatedElement trgLocatedElement = (TrgLocatedElement)theEObject;
				T result = caseTrgLocatedElement(trgLocatedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_SERVICE: {
				TrgService trgService = (TrgService)theEObject;
				T result = caseTrgService(trgService);
				if (result == null) result = caseTrgLocatedElement(trgService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_SESSION: {
				TrgSession trgSession = (TrgSession)theEObject;
				T result = caseTrgSession(trgSession);
				if (result == null) result = caseTrgLocatedElement(trgSession);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_REGISTRATION: {
				TrgRegistration trgRegistration = (TrgRegistration)theEObject;
				T result = caseTrgRegistration(trgRegistration);
				if (result == null) result = caseTrgSession(trgRegistration);
				if (result == null) result = caseTrgLocatedElement(trgRegistration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_DIALOG: {
				TrgDialog trgDialog = (TrgDialog)theEObject;
				T result = caseTrgDialog(trgDialog);
				if (result == null) result = caseTrgSession(trgDialog);
				if (result == null) result = caseTrgLocatedElement(trgDialog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_EVENT: {
				TrgEvent trgEvent = (TrgEvent)theEObject;
				T result = caseTrgEvent(trgEvent);
				if (result == null) result = caseTrgSession(trgEvent);
				if (result == null) result = caseTrgLocatedElement(trgEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_METHOD: {
				TrgMethod trgMethod = (TrgMethod)theEObject;
				T result = caseTrgMethod(trgMethod);
				if (result == null) result = caseTrgSession(trgMethod);
				if (result == null) result = caseTrgLocatedElement(trgMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_ARGUMENT: {
				TrgArgument trgArgument = (TrgArgument)theEObject;
				T result = caseTrgArgument(trgArgument);
				if (result == null) result = caseTrgVariableDeclaration(trgArgument);
				if (result == null) result = caseTrgDeclaration(trgArgument);
				if (result == null) result = caseTrgLocatedElement(trgArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_METHOD_NAME: {
				TrgMethodName trgMethodName = (TrgMethodName)theEObject;
				T result = caseTrgMethodName(trgMethodName);
				if (result == null) result = caseTrgLocatedElement(trgMethodName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_SIP_METHOD_NAME: {
				TrgSIPMethodName trgSIPMethodName = (TrgSIPMethodName)theEObject;
				T result = caseTrgSIPMethodName(trgSIPMethodName);
				if (result == null) result = caseTrgMethodName(trgSIPMethodName);
				if (result == null) result = caseTrgLocatedElement(trgSIPMethodName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_CONTROL_METHOD_NAME: {
				TrgControlMethodName trgControlMethodName = (TrgControlMethodName)theEObject;
				T result = caseTrgControlMethodName(trgControlMethodName);
				if (result == null) result = caseTrgMethodName(trgControlMethodName);
				if (result == null) result = caseTrgLocatedElement(trgControlMethodName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_BRANCH: {
				TrgBranch trgBranch = (TrgBranch)theEObject;
				T result = caseTrgBranch(trgBranch);
				if (result == null) result = caseTrgLocatedElement(trgBranch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_DEFAULT_BRANCH: {
				TrgDefaultBranch trgDefaultBranch = (TrgDefaultBranch)theEObject;
				T result = caseTrgDefaultBranch(trgDefaultBranch);
				if (result == null) result = caseTrgBranch(trgDefaultBranch);
				if (result == null) result = caseTrgLocatedElement(trgDefaultBranch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_NAMED_BRANCH: {
				TrgNamedBranch trgNamedBranch = (TrgNamedBranch)theEObject;
				T result = caseTrgNamedBranch(trgNamedBranch);
				if (result == null) result = caseTrgBranch(trgNamedBranch);
				if (result == null) result = caseTrgLocatedElement(trgNamedBranch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_TYPE_EXPRESSION: {
				TrgTypeExpression trgTypeExpression = (TrgTypeExpression)theEObject;
				T result = caseTrgTypeExpression(trgTypeExpression);
				if (result == null) result = caseTrgLocatedElement(trgTypeExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_SIMPLE_TYPE: {
				TrgSimpleType trgSimpleType = (TrgSimpleType)theEObject;
				T result = caseTrgSimpleType(trgSimpleType);
				if (result == null) result = caseTrgTypeExpression(trgSimpleType);
				if (result == null) result = caseTrgLocatedElement(trgSimpleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_SEQUENCE_TYPE: {
				TrgSequenceType trgSequenceType = (TrgSequenceType)theEObject;
				T result = caseTrgSequenceType(trgSequenceType);
				if (result == null) result = caseTrgTypeExpression(trgSequenceType);
				if (result == null) result = caseTrgLocatedElement(trgSequenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_DEFINED_TYPE: {
				TrgDefinedType trgDefinedType = (TrgDefinedType)theEObject;
				T result = caseTrgDefinedType(trgDefinedType);
				if (result == null) result = caseTrgTypeExpression(trgDefinedType);
				if (result == null) result = caseTrgLocatedElement(trgDefinedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_DECLARATION: {
				TrgDeclaration trgDeclaration = (TrgDeclaration)theEObject;
				T result = caseTrgDeclaration(trgDeclaration);
				if (result == null) result = caseTrgLocatedElement(trgDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_VARIABLE_DECLARATION: {
				TrgVariableDeclaration trgVariableDeclaration = (TrgVariableDeclaration)theEObject;
				T result = caseTrgVariableDeclaration(trgVariableDeclaration);
				if (result == null) result = caseTrgDeclaration(trgVariableDeclaration);
				if (result == null) result = caseTrgLocatedElement(trgVariableDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_FUNCTION_DECLARATION: {
				TrgFunctionDeclaration trgFunctionDeclaration = (TrgFunctionDeclaration)theEObject;
				T result = caseTrgFunctionDeclaration(trgFunctionDeclaration);
				if (result == null) result = caseTrgDeclaration(trgFunctionDeclaration);
				if (result == null) result = caseTrgLocatedElement(trgFunctionDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_REMOTE_FUNCTION_DECLARATION: {
				TrgRemoteFunctionDeclaration trgRemoteFunctionDeclaration = (TrgRemoteFunctionDeclaration)theEObject;
				T result = caseTrgRemoteFunctionDeclaration(trgRemoteFunctionDeclaration);
				if (result == null) result = caseTrgFunctionDeclaration(trgRemoteFunctionDeclaration);
				if (result == null) result = caseTrgDeclaration(trgRemoteFunctionDeclaration);
				if (result == null) result = caseTrgLocatedElement(trgRemoteFunctionDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_LOCAL_FUNCTION_DECLARATION: {
				TrgLocalFunctionDeclaration trgLocalFunctionDeclaration = (TrgLocalFunctionDeclaration)theEObject;
				T result = caseTrgLocalFunctionDeclaration(trgLocalFunctionDeclaration);
				if (result == null) result = caseTrgFunctionDeclaration(trgLocalFunctionDeclaration);
				if (result == null) result = caseTrgDeclaration(trgLocalFunctionDeclaration);
				if (result == null) result = caseTrgLocatedElement(trgLocalFunctionDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_STRUCTURE_DECLARATION: {
				TrgStructureDeclaration trgStructureDeclaration = (TrgStructureDeclaration)theEObject;
				T result = caseTrgStructureDeclaration(trgStructureDeclaration);
				if (result == null) result = caseTrgDeclaration(trgStructureDeclaration);
				if (result == null) result = caseTrgLocatedElement(trgStructureDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_FUNCTION_CALL: {
				TrgFunctionCall trgFunctionCall = (TrgFunctionCall)theEObject;
				T result = caseTrgFunctionCall(trgFunctionCall);
				if (result == null) result = caseTrgLocatedElement(trgFunctionCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_STATEMENT: {
				TrgStatement trgStatement = (TrgStatement)theEObject;
				T result = caseTrgStatement(trgStatement);
				if (result == null) result = caseTrgLocatedElement(trgStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_COMPOUND_STAT: {
				TrgCompoundStat trgCompoundStat = (TrgCompoundStat)theEObject;
				T result = caseTrgCompoundStat(trgCompoundStat);
				if (result == null) result = caseTrgStatement(trgCompoundStat);
				if (result == null) result = caseTrgLocatedElement(trgCompoundStat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_SET_STAT: {
				TrgSetStat trgSetStat = (TrgSetStat)theEObject;
				T result = caseTrgSetStat(trgSetStat);
				if (result == null) result = caseTrgStatement(trgSetStat);
				if (result == null) result = caseTrgLocatedElement(trgSetStat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_DECLARATION_STAT: {
				TrgDeclarationStat trgDeclarationStat = (TrgDeclarationStat)theEObject;
				T result = caseTrgDeclarationStat(trgDeclarationStat);
				if (result == null) result = caseTrgStatement(trgDeclarationStat);
				if (result == null) result = caseTrgLocatedElement(trgDeclarationStat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_RETURN_STAT: {
				TrgReturnStat trgReturnStat = (TrgReturnStat)theEObject;
				T result = caseTrgReturnStat(trgReturnStat);
				if (result == null) result = caseTrgStatement(trgReturnStat);
				if (result == null) result = caseTrgLocatedElement(trgReturnStat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_IF_STAT: {
				TrgIfStat trgIfStat = (TrgIfStat)theEObject;
				T result = caseTrgIfStat(trgIfStat);
				if (result == null) result = caseTrgStatement(trgIfStat);
				if (result == null) result = caseTrgLocatedElement(trgIfStat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_WHEN_STAT: {
				TrgWhenStat trgWhenStat = (TrgWhenStat)theEObject;
				T result = caseTrgWhenStat(trgWhenStat);
				if (result == null) result = caseTrgStatement(trgWhenStat);
				if (result == null) result = caseTrgLocatedElement(trgWhenStat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_FOREACH_STAT: {
				TrgForeachStat trgForeachStat = (TrgForeachStat)theEObject;
				T result = caseTrgForeachStat(trgForeachStat);
				if (result == null) result = caseTrgStatement(trgForeachStat);
				if (result == null) result = caseTrgLocatedElement(trgForeachStat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_SELECT_STAT: {
				TrgSelectStat trgSelectStat = (TrgSelectStat)theEObject;
				T result = caseTrgSelectStat(trgSelectStat);
				if (result == null) result = caseTrgStatement(trgSelectStat);
				if (result == null) result = caseTrgLocatedElement(trgSelectStat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_FUNCTION_CALL_STAT: {
				TrgFunctionCallStat trgFunctionCallStat = (TrgFunctionCallStat)theEObject;
				T result = caseTrgFunctionCallStat(trgFunctionCallStat);
				if (result == null) result = caseTrgStatement(trgFunctionCallStat);
				if (result == null) result = caseTrgLocatedElement(trgFunctionCallStat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_CONTINUE_STAT: {
				TrgContinueStat trgContinueStat = (TrgContinueStat)theEObject;
				T result = caseTrgContinueStat(trgContinueStat);
				if (result == null) result = caseTrgStatement(trgContinueStat);
				if (result == null) result = caseTrgLocatedElement(trgContinueStat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_BREAK_STAT: {
				TrgBreakStat trgBreakStat = (TrgBreakStat)theEObject;
				T result = caseTrgBreakStat(trgBreakStat);
				if (result == null) result = caseTrgStatement(trgBreakStat);
				if (result == null) result = caseTrgLocatedElement(trgBreakStat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_PUSH_STAT: {
				TrgPushStat trgPushStat = (TrgPushStat)theEObject;
				T result = caseTrgPushStat(trgPushStat);
				if (result == null) result = caseTrgStatement(trgPushStat);
				if (result == null) result = caseTrgLocatedElement(trgPushStat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_WHEN_HEADER: {
				TrgWhenHeader trgWhenHeader = (TrgWhenHeader)theEObject;
				T result = caseTrgWhenHeader(trgWhenHeader);
				if (result == null) result = caseTrgVariableDeclaration(trgWhenHeader);
				if (result == null) result = caseTrgDeclaration(trgWhenHeader);
				if (result == null) result = caseTrgLocatedElement(trgWhenHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_SELECT_MEMBER: {
				TrgSelectMember trgSelectMember = (TrgSelectMember)theEObject;
				T result = caseTrgSelectMember(trgSelectMember);
				if (result == null) result = caseTrgLocatedElement(trgSelectMember);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_SELECT_DEFAULT: {
				TrgSelectDefault trgSelectDefault = (TrgSelectDefault)theEObject;
				T result = caseTrgSelectDefault(trgSelectDefault);
				if (result == null) result = caseTrgSelectMember(trgSelectDefault);
				if (result == null) result = caseTrgLocatedElement(trgSelectDefault);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_SELECT_CASE: {
				TrgSelectCase trgSelectCase = (TrgSelectCase)theEObject;
				T result = caseTrgSelectCase(trgSelectCase);
				if (result == null) result = caseTrgSelectMember(trgSelectCase);
				if (result == null) result = caseTrgLocatedElement(trgSelectCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_EXPRESSION: {
				TrgExpression trgExpression = (TrgExpression)theEObject;
				T result = caseTrgExpression(trgExpression);
				if (result == null) result = caseTrgLocatedElement(trgExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_CONSTANT_EXP: {
				TrgConstantExp trgConstantExp = (TrgConstantExp)theEObject;
				T result = caseTrgConstantExp(trgConstantExp);
				if (result == null) result = caseTrgExpression(trgConstantExp);
				if (result == null) result = caseTrgLocatedElement(trgConstantExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_OPERATOR_EXP: {
				TrgOperatorExp trgOperatorExp = (TrgOperatorExp)theEObject;
				T result = caseTrgOperatorExp(trgOperatorExp);
				if (result == null) result = caseTrgExpression(trgOperatorExp);
				if (result == null) result = caseTrgLocatedElement(trgOperatorExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_FORWARD_EXP: {
				TrgForwardExp trgForwardExp = (TrgForwardExp)theEObject;
				T result = caseTrgForwardExp(trgForwardExp);
				if (result == null) result = caseTrgExpression(trgForwardExp);
				if (result == null) result = caseTrgLocatedElement(trgForwardExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_WITH_EXP: {
				TrgWithExp trgWithExp = (TrgWithExp)theEObject;
				T result = caseTrgWithExp(trgWithExp);
				if (result == null) result = caseTrgExpression(trgWithExp);
				if (result == null) result = caseTrgLocatedElement(trgWithExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_BLOCK_EXP: {
				TrgBlockExp trgBlockExp = (TrgBlockExp)theEObject;
				T result = caseTrgBlockExp(trgBlockExp);
				if (result == null) result = caseTrgExpression(trgBlockExp);
				if (result == null) result = caseTrgLocatedElement(trgBlockExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_REASON_EXP: {
				TrgReasonExp trgReasonExp = (TrgReasonExp)theEObject;
				T result = caseTrgReasonExp(trgReasonExp);
				if (result == null) result = caseTrgExpression(trgReasonExp);
				if (result == null) result = caseTrgLocatedElement(trgReasonExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_BODY_EXP: {
				TrgBODYExp trgBODYExp = (TrgBODYExp)theEObject;
				T result = caseTrgBODYExp(trgBODYExp);
				if (result == null) result = caseTrgExpression(trgBODYExp);
				if (result == null) result = caseTrgLocatedElement(trgBODYExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_REQUEST_URI_EXP: {
				TrgRequestURIExp trgRequestURIExp = (TrgRequestURIExp)theEObject;
				T result = caseTrgRequestURIExp(trgRequestURIExp);
				if (result == null) result = caseTrgExpression(trgRequestURIExp);
				if (result == null) result = caseTrgLocatedElement(trgRequestURIExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_POP_EXP: {
				TrgPopExp trgPopExp = (TrgPopExp)theEObject;
				T result = caseTrgPopExp(trgPopExp);
				if (result == null) result = caseTrgExpression(trgPopExp);
				if (result == null) result = caseTrgLocatedElement(trgPopExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_FUNCTION_CALL_EXP: {
				TrgFunctionCallExp trgFunctionCallExp = (TrgFunctionCallExp)theEObject;
				T result = caseTrgFunctionCallExp(trgFunctionCallExp);
				if (result == null) result = caseTrgExpression(trgFunctionCallExp);
				if (result == null) result = caseTrgLocatedElement(trgFunctionCallExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_PLACE: {
				TrgPlace trgPlace = (TrgPlace)theEObject;
				T result = caseTrgPlace(trgPlace);
				if (result == null) result = caseTrgExpression(trgPlace);
				if (result == null) result = caseTrgLocatedElement(trgPlace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_SIP_HEADER_PLACE: {
				TrgSIPHeaderPlace trgSIPHeaderPlace = (TrgSIPHeaderPlace)theEObject;
				T result = caseTrgSIPHeaderPlace(trgSIPHeaderPlace);
				if (result == null) result = caseTrgPlace(trgSIPHeaderPlace);
				if (result == null) result = caseTrgExpression(trgSIPHeaderPlace);
				if (result == null) result = caseTrgLocatedElement(trgSIPHeaderPlace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_VARIABLE_PLACE: {
				TrgVariablePlace trgVariablePlace = (TrgVariablePlace)theEObject;
				T result = caseTrgVariablePlace(trgVariablePlace);
				if (result == null) result = caseTrgPlace(trgVariablePlace);
				if (result == null) result = caseTrgExpression(trgVariablePlace);
				if (result == null) result = caseTrgLocatedElement(trgVariablePlace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_PROPERTY_CALL_PLACE: {
				TrgPropertyCallPlace trgPropertyCallPlace = (TrgPropertyCallPlace)theEObject;
				T result = caseTrgPropertyCallPlace(trgPropertyCallPlace);
				if (result == null) result = caseTrgVariablePlace(trgPropertyCallPlace);
				if (result == null) result = caseTrgPlace(trgPropertyCallPlace);
				if (result == null) result = caseTrgExpression(trgPropertyCallPlace);
				if (result == null) result = caseTrgLocatedElement(trgPropertyCallPlace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_VARIABLE: {
				TrgVariable trgVariable = (TrgVariable)theEObject;
				T result = caseTrgVariable(trgVariable);
				if (result == null) result = caseTrgVariablePlace(trgVariable);
				if (result == null) result = caseTrgPlace(trgVariable);
				if (result == null) result = caseTrgExpression(trgVariable);
				if (result == null) result = caseTrgLocatedElement(trgVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_MESSAGE_FIELD: {
				TrgMessageField trgMessageField = (TrgMessageField)theEObject;
				T result = caseTrgMessageField(trgMessageField);
				if (result == null) result = caseTrgLocatedElement(trgMessageField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_REASON_MESSAGE_FIELD: {
				TrgReasonMessageField trgReasonMessageField = (TrgReasonMessageField)theEObject;
				T result = caseTrgReasonMessageField(trgReasonMessageField);
				if (result == null) result = caseTrgMessageField(trgReasonMessageField);
				if (result == null) result = caseTrgLocatedElement(trgReasonMessageField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_HEADED_MESSAGE_FIELD: {
				TrgHeadedMessageField trgHeadedMessageField = (TrgHeadedMessageField)theEObject;
				T result = caseTrgHeadedMessageField(trgHeadedMessageField);
				if (result == null) result = caseTrgMessageField(trgHeadedMessageField);
				if (result == null) result = caseTrgLocatedElement(trgHeadedMessageField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_CONSTANT: {
				TrgConstant trgConstant = (TrgConstant)theEObject;
				T result = caseTrgConstant(trgConstant);
				if (result == null) result = caseTrgLocatedElement(trgConstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_BOOLEAN_CONSTANT: {
				TrgBooleanConstant trgBooleanConstant = (TrgBooleanConstant)theEObject;
				T result = caseTrgBooleanConstant(trgBooleanConstant);
				if (result == null) result = caseTrgConstant(trgBooleanConstant);
				if (result == null) result = caseTrgLocatedElement(trgBooleanConstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_INTEGER_CONSTANT: {
				TrgIntegerConstant trgIntegerConstant = (TrgIntegerConstant)theEObject;
				T result = caseTrgIntegerConstant(trgIntegerConstant);
				if (result == null) result = caseTrgConstant(trgIntegerConstant);
				if (result == null) result = caseTrgLocatedElement(trgIntegerConstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_STRING_CONSTANT: {
				TrgStringConstant trgStringConstant = (TrgStringConstant)theEObject;
				T result = caseTrgStringConstant(trgStringConstant);
				if (result == null) result = caseTrgConstant(trgStringConstant);
				if (result == null) result = caseTrgLocatedElement(trgStringConstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_URI_CONSTANT: {
				TrgURIConstant trgURIConstant = (TrgURIConstant)theEObject;
				T result = caseTrgURIConstant(trgURIConstant);
				if (result == null) result = caseTrgConstant(trgURIConstant);
				if (result == null) result = caseTrgLocatedElement(trgURIConstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_SEQUENCE_CONSTANT: {
				TrgSequenceConstant trgSequenceConstant = (TrgSequenceConstant)theEObject;
				T result = caseTrgSequenceConstant(trgSequenceConstant);
				if (result == null) result = caseTrgConstant(trgSequenceConstant);
				if (result == null) result = caseTrgLocatedElement(trgSequenceConstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_RESPONSE_CONSTANT: {
				TrgResponseConstant trgResponseConstant = (TrgResponseConstant)theEObject;
				T result = caseTrgResponseConstant(trgResponseConstant);
				if (result == null) result = caseTrgConstant(trgResponseConstant);
				if (result == null) result = caseTrgLocatedElement(trgResponseConstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_RESPONSE: {
				TrgResponse trgResponse = (TrgResponse)theEObject;
				T result = caseTrgResponse(trgResponse);
				if (result == null) result = caseTrgLocatedElement(trgResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_SUCCESS_RESPONSE: {
				TrgSuccessResponse trgSuccessResponse = (TrgSuccessResponse)theEObject;
				T result = caseTrgSuccessResponse(trgSuccessResponse);
				if (result == null) result = caseTrgResponse(trgSuccessResponse);
				if (result == null) result = caseTrgLocatedElement(trgSuccessResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_CPL2SPLPackage.TRG_ERROR_RESPONSE: {
				TrgErrorResponse trgErrorResponse = (TrgErrorResponse)theEObject;
				T result = caseTrgErrorResponse(trgErrorResponse);
				if (result == null) result = caseTrgResponse(trgErrorResponse);
				if (result == null) result = caseTrgLocatedElement(trgErrorResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Joint MM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Joint MM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJointMM(JointMM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src CPL Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src CPL Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcCPLModel(SrcCPLModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src CPL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src CPL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcCPL(SrcCPL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src Address Switch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src Address Switch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcAddressSwitch(SrcAddressSwitch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src String Switch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src String Switch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcStringSwitch(SrcStringSwitch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src Language Switch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src Language Switch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcLanguageSwitch(SrcLanguageSwitch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src Time Switch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src Time Switch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcTimeSwitch(SrcTimeSwitch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src Priority Switch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src Priority Switch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcPrioritySwitch(SrcPrioritySwitch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src Proxy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src Proxy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcProxy(SrcProxy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src Redirect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src Redirect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcRedirect(SrcRedirect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src Reject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src Reject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcReject(SrcReject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcElement(SrcElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src Node Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src Node Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcNodeContainer(SrcNodeContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src Sub Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src Sub Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcSubAction(SrcSubAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src Outgoing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src Outgoing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcOutgoing(SrcOutgoing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src Incoming</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src Incoming</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcIncoming(SrcIncoming object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src Not Present</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src Not Present</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcNotPresent(SrcNotPresent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src Otherwise</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src Otherwise</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcOtherwise(SrcOtherwise object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src Switched Address</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src Switched Address</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcSwitchedAddress(SrcSwitchedAddress object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src Switched String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src Switched String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcSwitchedString(SrcSwitchedString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src Switched Language</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src Switched Language</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcSwitchedLanguage(SrcSwitchedLanguage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src Switched Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src Switched Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcSwitchedTime(SrcSwitchedTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src Switched Priority</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src Switched Priority</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcSwitchedPriority(SrcSwitchedPriority object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src Busy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src Busy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcBusy(SrcBusy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src No Answer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src No Answer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcNoAnswer(SrcNoAnswer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src Redirection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src Redirection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcRedirection(SrcRedirection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src Failure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src Failure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcFailure(SrcFailure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src Default</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src Default</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcDefault(SrcDefault object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcNode(SrcNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src Switch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src Switch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcSwitch(SrcSwitch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcLocation(SrcLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src Sub Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src Sub Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcSubCall(SrcSubCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcAction(SrcAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src Signalling Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src Signalling Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcSignallingAction(SrcSignallingAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Program</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Program</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgProgram(TrgProgram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Structure Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Structure Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgStructureProperty(TrgStructureProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Client Error Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Client Error Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgClientErrorResponse(TrgClientErrorResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Global Error Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Global Error Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgGlobalErrorResponse(TrgGlobalErrorResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Redirection Error Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Redirection Error Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgRedirectionErrorResponse(TrgRedirectionErrorResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Server Error Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Server Error Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgServerErrorResponse(TrgServerErrorResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Located Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Located Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgLocatedElement(TrgLocatedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgService(TrgService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Session</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Session</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgSession(TrgSession object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Registration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Registration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgRegistration(TrgRegistration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Dialog</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Dialog</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgDialog(TrgDialog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgEvent(TrgEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgMethod(TrgMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgArgument(TrgArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Method Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Method Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgMethodName(TrgMethodName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg SIP Method Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg SIP Method Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgSIPMethodName(TrgSIPMethodName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Control Method Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Control Method Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgControlMethodName(TrgControlMethodName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Branch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Branch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgBranch(TrgBranch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Default Branch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Default Branch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgDefaultBranch(TrgDefaultBranch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Named Branch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Named Branch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgNamedBranch(TrgNamedBranch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Type Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Type Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgTypeExpression(TrgTypeExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Simple Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Simple Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgSimpleType(TrgSimpleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Sequence Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Sequence Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgSequenceType(TrgSequenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Defined Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Defined Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgDefinedType(TrgDefinedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgDeclaration(TrgDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Variable Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Variable Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgVariableDeclaration(TrgVariableDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Function Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Function Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgFunctionDeclaration(TrgFunctionDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Remote Function Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Remote Function Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgRemoteFunctionDeclaration(TrgRemoteFunctionDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Local Function Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Local Function Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgLocalFunctionDeclaration(TrgLocalFunctionDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Structure Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Structure Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgStructureDeclaration(TrgStructureDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Function Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Function Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgFunctionCall(TrgFunctionCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgStatement(TrgStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Compound Stat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Compound Stat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgCompoundStat(TrgCompoundStat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Set Stat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Set Stat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgSetStat(TrgSetStat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Declaration Stat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Declaration Stat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgDeclarationStat(TrgDeclarationStat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Return Stat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Return Stat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgReturnStat(TrgReturnStat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg If Stat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg If Stat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgIfStat(TrgIfStat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg When Stat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg When Stat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgWhenStat(TrgWhenStat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Foreach Stat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Foreach Stat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgForeachStat(TrgForeachStat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Select Stat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Select Stat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgSelectStat(TrgSelectStat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Function Call Stat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Function Call Stat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgFunctionCallStat(TrgFunctionCallStat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Continue Stat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Continue Stat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgContinueStat(TrgContinueStat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Break Stat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Break Stat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgBreakStat(TrgBreakStat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Push Stat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Push Stat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgPushStat(TrgPushStat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg When Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg When Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgWhenHeader(TrgWhenHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Select Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Select Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgSelectMember(TrgSelectMember object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Select Default</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Select Default</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgSelectDefault(TrgSelectDefault object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Select Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Select Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgSelectCase(TrgSelectCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgExpression(TrgExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Constant Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Constant Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgConstantExp(TrgConstantExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Operator Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Operator Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgOperatorExp(TrgOperatorExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Forward Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Forward Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgForwardExp(TrgForwardExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg With Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg With Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgWithExp(TrgWithExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Block Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Block Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgBlockExp(TrgBlockExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Reason Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Reason Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgReasonExp(TrgReasonExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg BODY Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg BODY Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgBODYExp(TrgBODYExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Request URI Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Request URI Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgRequestURIExp(TrgRequestURIExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Pop Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Pop Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgPopExp(TrgPopExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Function Call Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Function Call Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgFunctionCallExp(TrgFunctionCallExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgPlace(TrgPlace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg SIP Header Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg SIP Header Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgSIPHeaderPlace(TrgSIPHeaderPlace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Variable Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Variable Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgVariablePlace(TrgVariablePlace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Property Call Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Property Call Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgPropertyCallPlace(TrgPropertyCallPlace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgVariable(TrgVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Message Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Message Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgMessageField(TrgMessageField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Reason Message Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Reason Message Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgReasonMessageField(TrgReasonMessageField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Headed Message Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Headed Message Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgHeadedMessageField(TrgHeadedMessageField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgConstant(TrgConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Boolean Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Boolean Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgBooleanConstant(TrgBooleanConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Integer Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Integer Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgIntegerConstant(TrgIntegerConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg String Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg String Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgStringConstant(TrgStringConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg URI Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg URI Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgURIConstant(TrgURIConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Sequence Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Sequence Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgSequenceConstant(TrgSequenceConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Response Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Response Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgResponseConstant(TrgResponseConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgResponse(TrgResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Success Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Success Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgSuccessResponse(TrgSuccessResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Error Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Error Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgErrorResponse(TrgErrorResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //JointPackage_CPL2SPLSwitch
