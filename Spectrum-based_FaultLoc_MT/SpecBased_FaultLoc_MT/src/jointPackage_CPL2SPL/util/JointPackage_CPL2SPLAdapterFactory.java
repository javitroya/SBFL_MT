/**
 */
package jointPackage_CPL2SPL.util;

import jointPackage_CPL2SPL.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage
 * @generated
 */
public class JointPackage_CPL2SPLAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JointPackage_CPL2SPLPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JointPackage_CPL2SPLAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = JointPackage_CPL2SPLPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JointPackage_CPL2SPLSwitch<Adapter> modelSwitch =
		new JointPackage_CPL2SPLSwitch<Adapter>() {
			@Override
			public Adapter caseJointMM(JointMM object) {
				return createJointMMAdapter();
			}
			@Override
			public Adapter caseSrcCPLModel(SrcCPLModel object) {
				return createSrcCPLModelAdapter();
			}
			@Override
			public Adapter caseSrcCPL(SrcCPL object) {
				return createSrcCPLAdapter();
			}
			@Override
			public Adapter caseSrcAddressSwitch(SrcAddressSwitch object) {
				return createSrcAddressSwitchAdapter();
			}
			@Override
			public Adapter caseSrcStringSwitch(SrcStringSwitch object) {
				return createSrcStringSwitchAdapter();
			}
			@Override
			public Adapter caseSrcLanguageSwitch(SrcLanguageSwitch object) {
				return createSrcLanguageSwitchAdapter();
			}
			@Override
			public Adapter caseSrcTimeSwitch(SrcTimeSwitch object) {
				return createSrcTimeSwitchAdapter();
			}
			@Override
			public Adapter caseSrcPrioritySwitch(SrcPrioritySwitch object) {
				return createSrcPrioritySwitchAdapter();
			}
			@Override
			public Adapter caseSrcProxy(SrcProxy object) {
				return createSrcProxyAdapter();
			}
			@Override
			public Adapter caseSrcRedirect(SrcRedirect object) {
				return createSrcRedirectAdapter();
			}
			@Override
			public Adapter caseSrcReject(SrcReject object) {
				return createSrcRejectAdapter();
			}
			@Override
			public Adapter caseSrcElement(SrcElement object) {
				return createSrcElementAdapter();
			}
			@Override
			public Adapter caseSrcNodeContainer(SrcNodeContainer object) {
				return createSrcNodeContainerAdapter();
			}
			@Override
			public Adapter caseSrcSubAction(SrcSubAction object) {
				return createSrcSubActionAdapter();
			}
			@Override
			public Adapter caseSrcOutgoing(SrcOutgoing object) {
				return createSrcOutgoingAdapter();
			}
			@Override
			public Adapter caseSrcIncoming(SrcIncoming object) {
				return createSrcIncomingAdapter();
			}
			@Override
			public Adapter caseSrcNotPresent(SrcNotPresent object) {
				return createSrcNotPresentAdapter();
			}
			@Override
			public Adapter caseSrcOtherwise(SrcOtherwise object) {
				return createSrcOtherwiseAdapter();
			}
			@Override
			public Adapter caseSrcSwitchedAddress(SrcSwitchedAddress object) {
				return createSrcSwitchedAddressAdapter();
			}
			@Override
			public Adapter caseSrcSwitchedString(SrcSwitchedString object) {
				return createSrcSwitchedStringAdapter();
			}
			@Override
			public Adapter caseSrcSwitchedLanguage(SrcSwitchedLanguage object) {
				return createSrcSwitchedLanguageAdapter();
			}
			@Override
			public Adapter caseSrcSwitchedTime(SrcSwitchedTime object) {
				return createSrcSwitchedTimeAdapter();
			}
			@Override
			public Adapter caseSrcSwitchedPriority(SrcSwitchedPriority object) {
				return createSrcSwitchedPriorityAdapter();
			}
			@Override
			public Adapter caseSrcBusy(SrcBusy object) {
				return createSrcBusyAdapter();
			}
			@Override
			public Adapter caseSrcNoAnswer(SrcNoAnswer object) {
				return createSrcNoAnswerAdapter();
			}
			@Override
			public Adapter caseSrcRedirection(SrcRedirection object) {
				return createSrcRedirectionAdapter();
			}
			@Override
			public Adapter caseSrcFailure(SrcFailure object) {
				return createSrcFailureAdapter();
			}
			@Override
			public Adapter caseSrcDefault(SrcDefault object) {
				return createSrcDefaultAdapter();
			}
			@Override
			public Adapter caseSrcNode(SrcNode object) {
				return createSrcNodeAdapter();
			}
			@Override
			public Adapter caseSrcSwitch(SrcSwitch object) {
				return createSrcSwitchAdapter();
			}
			@Override
			public Adapter caseSrcLocation(SrcLocation object) {
				return createSrcLocationAdapter();
			}
			@Override
			public Adapter caseSrcSubCall(SrcSubCall object) {
				return createSrcSubCallAdapter();
			}
			@Override
			public Adapter caseSrcAction(SrcAction object) {
				return createSrcActionAdapter();
			}
			@Override
			public Adapter caseSrcSignallingAction(SrcSignallingAction object) {
				return createSrcSignallingActionAdapter();
			}
			@Override
			public Adapter caseTrgProgram(TrgProgram object) {
				return createTrgProgramAdapter();
			}
			@Override
			public Adapter caseTrgStructureProperty(TrgStructureProperty object) {
				return createTrgStructurePropertyAdapter();
			}
			@Override
			public Adapter caseTrgClientErrorResponse(TrgClientErrorResponse object) {
				return createTrgClientErrorResponseAdapter();
			}
			@Override
			public Adapter caseTrgGlobalErrorResponse(TrgGlobalErrorResponse object) {
				return createTrgGlobalErrorResponseAdapter();
			}
			@Override
			public Adapter caseTrgRedirectionErrorResponse(TrgRedirectionErrorResponse object) {
				return createTrgRedirectionErrorResponseAdapter();
			}
			@Override
			public Adapter caseTrgServerErrorResponse(TrgServerErrorResponse object) {
				return createTrgServerErrorResponseAdapter();
			}
			@Override
			public Adapter caseTrgLocatedElement(TrgLocatedElement object) {
				return createTrgLocatedElementAdapter();
			}
			@Override
			public Adapter caseTrgService(TrgService object) {
				return createTrgServiceAdapter();
			}
			@Override
			public Adapter caseTrgSession(TrgSession object) {
				return createTrgSessionAdapter();
			}
			@Override
			public Adapter caseTrgRegistration(TrgRegistration object) {
				return createTrgRegistrationAdapter();
			}
			@Override
			public Adapter caseTrgDialog(TrgDialog object) {
				return createTrgDialogAdapter();
			}
			@Override
			public Adapter caseTrgEvent(TrgEvent object) {
				return createTrgEventAdapter();
			}
			@Override
			public Adapter caseTrgMethod(TrgMethod object) {
				return createTrgMethodAdapter();
			}
			@Override
			public Adapter caseTrgArgument(TrgArgument object) {
				return createTrgArgumentAdapter();
			}
			@Override
			public Adapter caseTrgMethodName(TrgMethodName object) {
				return createTrgMethodNameAdapter();
			}
			@Override
			public Adapter caseTrgSIPMethodName(TrgSIPMethodName object) {
				return createTrgSIPMethodNameAdapter();
			}
			@Override
			public Adapter caseTrgControlMethodName(TrgControlMethodName object) {
				return createTrgControlMethodNameAdapter();
			}
			@Override
			public Adapter caseTrgBranch(TrgBranch object) {
				return createTrgBranchAdapter();
			}
			@Override
			public Adapter caseTrgDefaultBranch(TrgDefaultBranch object) {
				return createTrgDefaultBranchAdapter();
			}
			@Override
			public Adapter caseTrgNamedBranch(TrgNamedBranch object) {
				return createTrgNamedBranchAdapter();
			}
			@Override
			public Adapter caseTrgTypeExpression(TrgTypeExpression object) {
				return createTrgTypeExpressionAdapter();
			}
			@Override
			public Adapter caseTrgSimpleType(TrgSimpleType object) {
				return createTrgSimpleTypeAdapter();
			}
			@Override
			public Adapter caseTrgSequenceType(TrgSequenceType object) {
				return createTrgSequenceTypeAdapter();
			}
			@Override
			public Adapter caseTrgDefinedType(TrgDefinedType object) {
				return createTrgDefinedTypeAdapter();
			}
			@Override
			public Adapter caseTrgDeclaration(TrgDeclaration object) {
				return createTrgDeclarationAdapter();
			}
			@Override
			public Adapter caseTrgVariableDeclaration(TrgVariableDeclaration object) {
				return createTrgVariableDeclarationAdapter();
			}
			@Override
			public Adapter caseTrgFunctionDeclaration(TrgFunctionDeclaration object) {
				return createTrgFunctionDeclarationAdapter();
			}
			@Override
			public Adapter caseTrgRemoteFunctionDeclaration(TrgRemoteFunctionDeclaration object) {
				return createTrgRemoteFunctionDeclarationAdapter();
			}
			@Override
			public Adapter caseTrgLocalFunctionDeclaration(TrgLocalFunctionDeclaration object) {
				return createTrgLocalFunctionDeclarationAdapter();
			}
			@Override
			public Adapter caseTrgStructureDeclaration(TrgStructureDeclaration object) {
				return createTrgStructureDeclarationAdapter();
			}
			@Override
			public Adapter caseTrgFunctionCall(TrgFunctionCall object) {
				return createTrgFunctionCallAdapter();
			}
			@Override
			public Adapter caseTrgStatement(TrgStatement object) {
				return createTrgStatementAdapter();
			}
			@Override
			public Adapter caseTrgCompoundStat(TrgCompoundStat object) {
				return createTrgCompoundStatAdapter();
			}
			@Override
			public Adapter caseTrgSetStat(TrgSetStat object) {
				return createTrgSetStatAdapter();
			}
			@Override
			public Adapter caseTrgDeclarationStat(TrgDeclarationStat object) {
				return createTrgDeclarationStatAdapter();
			}
			@Override
			public Adapter caseTrgReturnStat(TrgReturnStat object) {
				return createTrgReturnStatAdapter();
			}
			@Override
			public Adapter caseTrgIfStat(TrgIfStat object) {
				return createTrgIfStatAdapter();
			}
			@Override
			public Adapter caseTrgWhenStat(TrgWhenStat object) {
				return createTrgWhenStatAdapter();
			}
			@Override
			public Adapter caseTrgForeachStat(TrgForeachStat object) {
				return createTrgForeachStatAdapter();
			}
			@Override
			public Adapter caseTrgSelectStat(TrgSelectStat object) {
				return createTrgSelectStatAdapter();
			}
			@Override
			public Adapter caseTrgFunctionCallStat(TrgFunctionCallStat object) {
				return createTrgFunctionCallStatAdapter();
			}
			@Override
			public Adapter caseTrgContinueStat(TrgContinueStat object) {
				return createTrgContinueStatAdapter();
			}
			@Override
			public Adapter caseTrgBreakStat(TrgBreakStat object) {
				return createTrgBreakStatAdapter();
			}
			@Override
			public Adapter caseTrgPushStat(TrgPushStat object) {
				return createTrgPushStatAdapter();
			}
			@Override
			public Adapter caseTrgWhenHeader(TrgWhenHeader object) {
				return createTrgWhenHeaderAdapter();
			}
			@Override
			public Adapter caseTrgSelectMember(TrgSelectMember object) {
				return createTrgSelectMemberAdapter();
			}
			@Override
			public Adapter caseTrgSelectDefault(TrgSelectDefault object) {
				return createTrgSelectDefaultAdapter();
			}
			@Override
			public Adapter caseTrgSelectCase(TrgSelectCase object) {
				return createTrgSelectCaseAdapter();
			}
			@Override
			public Adapter caseTrgExpression(TrgExpression object) {
				return createTrgExpressionAdapter();
			}
			@Override
			public Adapter caseTrgConstantExp(TrgConstantExp object) {
				return createTrgConstantExpAdapter();
			}
			@Override
			public Adapter caseTrgOperatorExp(TrgOperatorExp object) {
				return createTrgOperatorExpAdapter();
			}
			@Override
			public Adapter caseTrgForwardExp(TrgForwardExp object) {
				return createTrgForwardExpAdapter();
			}
			@Override
			public Adapter caseTrgWithExp(TrgWithExp object) {
				return createTrgWithExpAdapter();
			}
			@Override
			public Adapter caseTrgBlockExp(TrgBlockExp object) {
				return createTrgBlockExpAdapter();
			}
			@Override
			public Adapter caseTrgReasonExp(TrgReasonExp object) {
				return createTrgReasonExpAdapter();
			}
			@Override
			public Adapter caseTrgBODYExp(TrgBODYExp object) {
				return createTrgBODYExpAdapter();
			}
			@Override
			public Adapter caseTrgRequestURIExp(TrgRequestURIExp object) {
				return createTrgRequestURIExpAdapter();
			}
			@Override
			public Adapter caseTrgPopExp(TrgPopExp object) {
				return createTrgPopExpAdapter();
			}
			@Override
			public Adapter caseTrgFunctionCallExp(TrgFunctionCallExp object) {
				return createTrgFunctionCallExpAdapter();
			}
			@Override
			public Adapter caseTrgPlace(TrgPlace object) {
				return createTrgPlaceAdapter();
			}
			@Override
			public Adapter caseTrgSIPHeaderPlace(TrgSIPHeaderPlace object) {
				return createTrgSIPHeaderPlaceAdapter();
			}
			@Override
			public Adapter caseTrgVariablePlace(TrgVariablePlace object) {
				return createTrgVariablePlaceAdapter();
			}
			@Override
			public Adapter caseTrgPropertyCallPlace(TrgPropertyCallPlace object) {
				return createTrgPropertyCallPlaceAdapter();
			}
			@Override
			public Adapter caseTrgVariable(TrgVariable object) {
				return createTrgVariableAdapter();
			}
			@Override
			public Adapter caseTrgMessageField(TrgMessageField object) {
				return createTrgMessageFieldAdapter();
			}
			@Override
			public Adapter caseTrgReasonMessageField(TrgReasonMessageField object) {
				return createTrgReasonMessageFieldAdapter();
			}
			@Override
			public Adapter caseTrgHeadedMessageField(TrgHeadedMessageField object) {
				return createTrgHeadedMessageFieldAdapter();
			}
			@Override
			public Adapter caseTrgConstant(TrgConstant object) {
				return createTrgConstantAdapter();
			}
			@Override
			public Adapter caseTrgBooleanConstant(TrgBooleanConstant object) {
				return createTrgBooleanConstantAdapter();
			}
			@Override
			public Adapter caseTrgIntegerConstant(TrgIntegerConstant object) {
				return createTrgIntegerConstantAdapter();
			}
			@Override
			public Adapter caseTrgStringConstant(TrgStringConstant object) {
				return createTrgStringConstantAdapter();
			}
			@Override
			public Adapter caseTrgURIConstant(TrgURIConstant object) {
				return createTrgURIConstantAdapter();
			}
			@Override
			public Adapter caseTrgSequenceConstant(TrgSequenceConstant object) {
				return createTrgSequenceConstantAdapter();
			}
			@Override
			public Adapter caseTrgResponseConstant(TrgResponseConstant object) {
				return createTrgResponseConstantAdapter();
			}
			@Override
			public Adapter caseTrgResponse(TrgResponse object) {
				return createTrgResponseAdapter();
			}
			@Override
			public Adapter caseTrgSuccessResponse(TrgSuccessResponse object) {
				return createTrgSuccessResponseAdapter();
			}
			@Override
			public Adapter caseTrgErrorResponse(TrgErrorResponse object) {
				return createTrgErrorResponseAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.JointMM <em>Joint MM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.JointMM
	 * @generated
	 */
	public Adapter createJointMMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.SrcCPLModel <em>Src CPL Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.SrcCPLModel
	 * @generated
	 */
	public Adapter createSrcCPLModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.SrcCPL <em>Src CPL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.SrcCPL
	 * @generated
	 */
	public Adapter createSrcCPLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.SrcAddressSwitch <em>Src Address Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.SrcAddressSwitch
	 * @generated
	 */
	public Adapter createSrcAddressSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.SrcStringSwitch <em>Src String Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.SrcStringSwitch
	 * @generated
	 */
	public Adapter createSrcStringSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.SrcLanguageSwitch <em>Src Language Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.SrcLanguageSwitch
	 * @generated
	 */
	public Adapter createSrcLanguageSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.SrcTimeSwitch <em>Src Time Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.SrcTimeSwitch
	 * @generated
	 */
	public Adapter createSrcTimeSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.SrcPrioritySwitch <em>Src Priority Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.SrcPrioritySwitch
	 * @generated
	 */
	public Adapter createSrcPrioritySwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.SrcProxy <em>Src Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.SrcProxy
	 * @generated
	 */
	public Adapter createSrcProxyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.SrcRedirect <em>Src Redirect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.SrcRedirect
	 * @generated
	 */
	public Adapter createSrcRedirectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.SrcReject <em>Src Reject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.SrcReject
	 * @generated
	 */
	public Adapter createSrcRejectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.SrcElement <em>Src Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.SrcElement
	 * @generated
	 */
	public Adapter createSrcElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.SrcNodeContainer <em>Src Node Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.SrcNodeContainer
	 * @generated
	 */
	public Adapter createSrcNodeContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.SrcSubAction <em>Src Sub Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.SrcSubAction
	 * @generated
	 */
	public Adapter createSrcSubActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.SrcOutgoing <em>Src Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.SrcOutgoing
	 * @generated
	 */
	public Adapter createSrcOutgoingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.SrcIncoming <em>Src Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.SrcIncoming
	 * @generated
	 */
	public Adapter createSrcIncomingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.SrcNotPresent <em>Src Not Present</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.SrcNotPresent
	 * @generated
	 */
	public Adapter createSrcNotPresentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.SrcOtherwise <em>Src Otherwise</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.SrcOtherwise
	 * @generated
	 */
	public Adapter createSrcOtherwiseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.SrcSwitchedAddress <em>Src Switched Address</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.SrcSwitchedAddress
	 * @generated
	 */
	public Adapter createSrcSwitchedAddressAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.SrcSwitchedString <em>Src Switched String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.SrcSwitchedString
	 * @generated
	 */
	public Adapter createSrcSwitchedStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.SrcSwitchedLanguage <em>Src Switched Language</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.SrcSwitchedLanguage
	 * @generated
	 */
	public Adapter createSrcSwitchedLanguageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.SrcSwitchedTime <em>Src Switched Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.SrcSwitchedTime
	 * @generated
	 */
	public Adapter createSrcSwitchedTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.SrcSwitchedPriority <em>Src Switched Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.SrcSwitchedPriority
	 * @generated
	 */
	public Adapter createSrcSwitchedPriorityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.SrcBusy <em>Src Busy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.SrcBusy
	 * @generated
	 */
	public Adapter createSrcBusyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.SrcNoAnswer <em>Src No Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.SrcNoAnswer
	 * @generated
	 */
	public Adapter createSrcNoAnswerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.SrcRedirection <em>Src Redirection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.SrcRedirection
	 * @generated
	 */
	public Adapter createSrcRedirectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.SrcFailure <em>Src Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.SrcFailure
	 * @generated
	 */
	public Adapter createSrcFailureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.SrcDefault <em>Src Default</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.SrcDefault
	 * @generated
	 */
	public Adapter createSrcDefaultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.SrcNode <em>Src Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.SrcNode
	 * @generated
	 */
	public Adapter createSrcNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.SrcSwitch <em>Src Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.SrcSwitch
	 * @generated
	 */
	public Adapter createSrcSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.SrcLocation <em>Src Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.SrcLocation
	 * @generated
	 */
	public Adapter createSrcLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.SrcSubCall <em>Src Sub Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.SrcSubCall
	 * @generated
	 */
	public Adapter createSrcSubCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.SrcAction <em>Src Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.SrcAction
	 * @generated
	 */
	public Adapter createSrcActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.SrcSignallingAction <em>Src Signalling Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.SrcSignallingAction
	 * @generated
	 */
	public Adapter createSrcSignallingActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgProgram <em>Trg Program</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgProgram
	 * @generated
	 */
	public Adapter createTrgProgramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgStructureProperty <em>Trg Structure Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgStructureProperty
	 * @generated
	 */
	public Adapter createTrgStructurePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgClientErrorResponse <em>Trg Client Error Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgClientErrorResponse
	 * @generated
	 */
	public Adapter createTrgClientErrorResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgGlobalErrorResponse <em>Trg Global Error Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgGlobalErrorResponse
	 * @generated
	 */
	public Adapter createTrgGlobalErrorResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgRedirectionErrorResponse <em>Trg Redirection Error Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgRedirectionErrorResponse
	 * @generated
	 */
	public Adapter createTrgRedirectionErrorResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgServerErrorResponse <em>Trg Server Error Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgServerErrorResponse
	 * @generated
	 */
	public Adapter createTrgServerErrorResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgLocatedElement <em>Trg Located Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgLocatedElement
	 * @generated
	 */
	public Adapter createTrgLocatedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgService <em>Trg Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgService
	 * @generated
	 */
	public Adapter createTrgServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgSession <em>Trg Session</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgSession
	 * @generated
	 */
	public Adapter createTrgSessionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgRegistration <em>Trg Registration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgRegistration
	 * @generated
	 */
	public Adapter createTrgRegistrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgDialog <em>Trg Dialog</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgDialog
	 * @generated
	 */
	public Adapter createTrgDialogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgEvent <em>Trg Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgEvent
	 * @generated
	 */
	public Adapter createTrgEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgMethod <em>Trg Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgMethod
	 * @generated
	 */
	public Adapter createTrgMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgArgument <em>Trg Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgArgument
	 * @generated
	 */
	public Adapter createTrgArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgMethodName <em>Trg Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgMethodName
	 * @generated
	 */
	public Adapter createTrgMethodNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgSIPMethodName <em>Trg SIP Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgSIPMethodName
	 * @generated
	 */
	public Adapter createTrgSIPMethodNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgControlMethodName <em>Trg Control Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgControlMethodName
	 * @generated
	 */
	public Adapter createTrgControlMethodNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgBranch <em>Trg Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgBranch
	 * @generated
	 */
	public Adapter createTrgBranchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgDefaultBranch <em>Trg Default Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgDefaultBranch
	 * @generated
	 */
	public Adapter createTrgDefaultBranchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgNamedBranch <em>Trg Named Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgNamedBranch
	 * @generated
	 */
	public Adapter createTrgNamedBranchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgTypeExpression <em>Trg Type Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgTypeExpression
	 * @generated
	 */
	public Adapter createTrgTypeExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgSimpleType <em>Trg Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgSimpleType
	 * @generated
	 */
	public Adapter createTrgSimpleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgSequenceType <em>Trg Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgSequenceType
	 * @generated
	 */
	public Adapter createTrgSequenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgDefinedType <em>Trg Defined Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgDefinedType
	 * @generated
	 */
	public Adapter createTrgDefinedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgDeclaration <em>Trg Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgDeclaration
	 * @generated
	 */
	public Adapter createTrgDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgVariableDeclaration <em>Trg Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgVariableDeclaration
	 * @generated
	 */
	public Adapter createTrgVariableDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgFunctionDeclaration <em>Trg Function Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgFunctionDeclaration
	 * @generated
	 */
	public Adapter createTrgFunctionDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgRemoteFunctionDeclaration <em>Trg Remote Function Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgRemoteFunctionDeclaration
	 * @generated
	 */
	public Adapter createTrgRemoteFunctionDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgLocalFunctionDeclaration <em>Trg Local Function Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgLocalFunctionDeclaration
	 * @generated
	 */
	public Adapter createTrgLocalFunctionDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgStructureDeclaration <em>Trg Structure Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgStructureDeclaration
	 * @generated
	 */
	public Adapter createTrgStructureDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgFunctionCall <em>Trg Function Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgFunctionCall
	 * @generated
	 */
	public Adapter createTrgFunctionCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgStatement <em>Trg Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgStatement
	 * @generated
	 */
	public Adapter createTrgStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgCompoundStat <em>Trg Compound Stat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgCompoundStat
	 * @generated
	 */
	public Adapter createTrgCompoundStatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgSetStat <em>Trg Set Stat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgSetStat
	 * @generated
	 */
	public Adapter createTrgSetStatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgDeclarationStat <em>Trg Declaration Stat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgDeclarationStat
	 * @generated
	 */
	public Adapter createTrgDeclarationStatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgReturnStat <em>Trg Return Stat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgReturnStat
	 * @generated
	 */
	public Adapter createTrgReturnStatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgIfStat <em>Trg If Stat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgIfStat
	 * @generated
	 */
	public Adapter createTrgIfStatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgWhenStat <em>Trg When Stat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgWhenStat
	 * @generated
	 */
	public Adapter createTrgWhenStatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgForeachStat <em>Trg Foreach Stat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgForeachStat
	 * @generated
	 */
	public Adapter createTrgForeachStatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgSelectStat <em>Trg Select Stat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgSelectStat
	 * @generated
	 */
	public Adapter createTrgSelectStatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgFunctionCallStat <em>Trg Function Call Stat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgFunctionCallStat
	 * @generated
	 */
	public Adapter createTrgFunctionCallStatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgContinueStat <em>Trg Continue Stat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgContinueStat
	 * @generated
	 */
	public Adapter createTrgContinueStatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgBreakStat <em>Trg Break Stat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgBreakStat
	 * @generated
	 */
	public Adapter createTrgBreakStatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgPushStat <em>Trg Push Stat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgPushStat
	 * @generated
	 */
	public Adapter createTrgPushStatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgWhenHeader <em>Trg When Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgWhenHeader
	 * @generated
	 */
	public Adapter createTrgWhenHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgSelectMember <em>Trg Select Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgSelectMember
	 * @generated
	 */
	public Adapter createTrgSelectMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgSelectDefault <em>Trg Select Default</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgSelectDefault
	 * @generated
	 */
	public Adapter createTrgSelectDefaultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgSelectCase <em>Trg Select Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgSelectCase
	 * @generated
	 */
	public Adapter createTrgSelectCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgExpression <em>Trg Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgExpression
	 * @generated
	 */
	public Adapter createTrgExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgConstantExp <em>Trg Constant Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgConstantExp
	 * @generated
	 */
	public Adapter createTrgConstantExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgOperatorExp <em>Trg Operator Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgOperatorExp
	 * @generated
	 */
	public Adapter createTrgOperatorExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgForwardExp <em>Trg Forward Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgForwardExp
	 * @generated
	 */
	public Adapter createTrgForwardExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgWithExp <em>Trg With Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgWithExp
	 * @generated
	 */
	public Adapter createTrgWithExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgBlockExp <em>Trg Block Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgBlockExp
	 * @generated
	 */
	public Adapter createTrgBlockExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgReasonExp <em>Trg Reason Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgReasonExp
	 * @generated
	 */
	public Adapter createTrgReasonExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgBODYExp <em>Trg BODY Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgBODYExp
	 * @generated
	 */
	public Adapter createTrgBODYExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgRequestURIExp <em>Trg Request URI Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgRequestURIExp
	 * @generated
	 */
	public Adapter createTrgRequestURIExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgPopExp <em>Trg Pop Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgPopExp
	 * @generated
	 */
	public Adapter createTrgPopExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgFunctionCallExp <em>Trg Function Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgFunctionCallExp
	 * @generated
	 */
	public Adapter createTrgFunctionCallExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgPlace <em>Trg Place</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgPlace
	 * @generated
	 */
	public Adapter createTrgPlaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgSIPHeaderPlace <em>Trg SIP Header Place</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgSIPHeaderPlace
	 * @generated
	 */
	public Adapter createTrgSIPHeaderPlaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgVariablePlace <em>Trg Variable Place</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgVariablePlace
	 * @generated
	 */
	public Adapter createTrgVariablePlaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgPropertyCallPlace <em>Trg Property Call Place</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgPropertyCallPlace
	 * @generated
	 */
	public Adapter createTrgPropertyCallPlaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgVariable <em>Trg Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgVariable
	 * @generated
	 */
	public Adapter createTrgVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgMessageField <em>Trg Message Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgMessageField
	 * @generated
	 */
	public Adapter createTrgMessageFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgReasonMessageField <em>Trg Reason Message Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgReasonMessageField
	 * @generated
	 */
	public Adapter createTrgReasonMessageFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgHeadedMessageField <em>Trg Headed Message Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgHeadedMessageField
	 * @generated
	 */
	public Adapter createTrgHeadedMessageFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgConstant <em>Trg Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgConstant
	 * @generated
	 */
	public Adapter createTrgConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgBooleanConstant <em>Trg Boolean Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgBooleanConstant
	 * @generated
	 */
	public Adapter createTrgBooleanConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgIntegerConstant <em>Trg Integer Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgIntegerConstant
	 * @generated
	 */
	public Adapter createTrgIntegerConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgStringConstant <em>Trg String Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgStringConstant
	 * @generated
	 */
	public Adapter createTrgStringConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgURIConstant <em>Trg URI Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgURIConstant
	 * @generated
	 */
	public Adapter createTrgURIConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgSequenceConstant <em>Trg Sequence Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgSequenceConstant
	 * @generated
	 */
	public Adapter createTrgSequenceConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgResponseConstant <em>Trg Response Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgResponseConstant
	 * @generated
	 */
	public Adapter createTrgResponseConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgResponse <em>Trg Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgResponse
	 * @generated
	 */
	public Adapter createTrgResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgSuccessResponse <em>Trg Success Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgSuccessResponse
	 * @generated
	 */
	public Adapter createTrgSuccessResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_CPL2SPL.TrgErrorResponse <em>Trg Error Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_CPL2SPL.TrgErrorResponse
	 * @generated
	 */
	public Adapter createTrgErrorResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //JointPackage_CPL2SPLAdapterFactory
