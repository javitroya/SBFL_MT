/**
 */
package jointPackage_Ecore2Maude.util;

import jointPackage_Ecore2Maude.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage
 * @generated
 */
public class JointPackage_Ecore2MaudeAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JointPackage_Ecore2MaudePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JointPackage_Ecore2MaudeAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = JointPackage_Ecore2MaudePackage.eINSTANCE;
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
	protected JointPackage_Ecore2MaudeSwitch<Adapter> modelSwitch =
		new JointPackage_Ecore2MaudeSwitch<Adapter>() {
			@Override
			public Adapter caseJointMM(JointMM object) {
				return createJointMMAdapter();
			}
			@Override
			public Adapter caseSrcEStringToStringMapEntry(SrcEStringToStringMapEntry object) {
				return createSrcEStringToStringMapEntryAdapter();
			}
			@Override
			public Adapter caseSrcEAttribute(SrcEAttribute object) {
				return createSrcEAttributeAdapter();
			}
			@Override
			public Adapter caseSrcEClass(SrcEClass object) {
				return createSrcEClassAdapter();
			}
			@Override
			public Adapter caseSrcEClassifier(SrcEClassifier object) {
				return createSrcEClassifierAdapter();
			}
			@Override
			public Adapter caseSrcEDataType(SrcEDataType object) {
				return createSrcEDataTypeAdapter();
			}
			@Override
			public Adapter caseSrcEEnum(SrcEEnum object) {
				return createSrcEEnumAdapter();
			}
			@Override
			public Adapter caseSrcEEnumLiteral(SrcEEnumLiteral object) {
				return createSrcEEnumLiteralAdapter();
			}
			@Override
			public Adapter caseSrcENamedElement(SrcENamedElement object) {
				return createSrcENamedElementAdapter();
			}
			@Override
			public Adapter caseSrcEOperation(SrcEOperation object) {
				return createSrcEOperationAdapter();
			}
			@Override
			public Adapter caseSrcEPackage(SrcEPackage object) {
				return createSrcEPackageAdapter();
			}
			@Override
			public Adapter caseSrcEParameter(SrcEParameter object) {
				return createSrcEParameterAdapter();
			}
			@Override
			public Adapter caseSrcEReference(SrcEReference object) {
				return createSrcEReferenceAdapter();
			}
			@Override
			public Adapter caseSrcEStructuralFeature(SrcEStructuralFeature object) {
				return createSrcEStructuralFeatureAdapter();
			}
			@Override
			public Adapter caseSrcETypedElement(SrcETypedElement object) {
				return createSrcETypedElementAdapter();
			}
			@Override
			public Adapter caseTrgMaudeSpec(TrgMaudeSpec object) {
				return createTrgMaudeSpecAdapter();
			}
			@Override
			public Adapter caseTrgMembership(TrgMembership object) {
				return createTrgMembershipAdapter();
			}
			@Override
			public Adapter caseTrgEquation(TrgEquation object) {
				return createTrgEquationAdapter();
			}
			@Override
			public Adapter caseTrgRule(TrgRule object) {
				return createTrgRuleAdapter();
			}
			@Override
			public Adapter caseTrgMembershipCond(TrgMembershipCond object) {
				return createTrgMembershipCondAdapter();
			}
			@Override
			public Adapter caseTrgBooleanCond(TrgBooleanCond object) {
				return createTrgBooleanCondAdapter();
			}
			@Override
			public Adapter caseTrgMatchingCond(TrgMatchingCond object) {
				return createTrgMatchingCondAdapter();
			}
			@Override
			public Adapter caseTrgEqualCond(TrgEqualCond object) {
				return createTrgEqualCondAdapter();
			}
			@Override
			public Adapter caseTrgMaudeTopEl(TrgMaudeTopEl object) {
				return createTrgMaudeTopElAdapter();
			}
			@Override
			public Adapter caseTrgModExpression(TrgModExpression object) {
				return createTrgModExpressionAdapter();
			}
			@Override
			public Adapter caseTrgInstModExp(TrgInstModExp object) {
				return createTrgInstModExpAdapter();
			}
			@Override
			public Adapter caseTrgRenModExp(TrgRenModExp object) {
				return createTrgRenModExpAdapter();
			}
			@Override
			public Adapter caseTrgCompModExp(TrgCompModExp object) {
				return createTrgCompModExpAdapter();
			}
			@Override
			public Adapter caseTrgModuleIdModExp(TrgModuleIdModExp object) {
				return createTrgModuleIdModExpAdapter();
			}
			@Override
			public Adapter caseTrgTheoryIdModExp(TrgTheoryIdModExp object) {
				return createTrgTheoryIdModExpAdapter();
			}
			@Override
			public Adapter caseTrgParameter(TrgParameter object) {
				return createTrgParameterAdapter();
			}
			@Override
			public Adapter caseTrgTheory(TrgTheory object) {
				return createTrgTheoryAdapter();
			}
			@Override
			public Adapter caseTrgFTheory(TrgFTheory object) {
				return createTrgFTheoryAdapter();
			}
			@Override
			public Adapter caseTrgSTheory(TrgSTheory object) {
				return createTrgSTheoryAdapter();
			}
			@Override
			public Adapter caseTrgModule(TrgModule object) {
				return createTrgModuleAdapter();
			}
			@Override
			public Adapter caseTrgFModule(TrgFModule object) {
				return createTrgFModuleAdapter();
			}
			@Override
			public Adapter caseTrgSModule(TrgSModule object) {
				return createTrgSModuleAdapter();
			}
			@Override
			public Adapter caseTrgModElement(TrgModElement object) {
				return createTrgModElementAdapter();
			}
			@Override
			public Adapter caseTrgModImportation(TrgModImportation object) {
				return createTrgModImportationAdapter();
			}
			@Override
			public Adapter caseTrgType(TrgType object) {
				return createTrgTypeAdapter();
			}
			@Override
			public Adapter caseTrgSort(TrgSort object) {
				return createTrgSortAdapter();
			}
			@Override
			public Adapter caseTrgKind(TrgKind object) {
				return createTrgKindAdapter();
			}
			@Override
			public Adapter caseTrgSubsortRel(TrgSubsortRel object) {
				return createTrgSubsortRelAdapter();
			}
			@Override
			public Adapter caseTrgOperation(TrgOperation object) {
				return createTrgOperationAdapter();
			}
			@Override
			public Adapter caseTrgStatement(TrgStatement object) {
				return createTrgStatementAdapter();
			}
			@Override
			public Adapter caseTrgCondition(TrgCondition object) {
				return createTrgConditionAdapter();
			}
			@Override
			public Adapter caseTrgEquationalCond(TrgEquationalCond object) {
				return createTrgEquationalCondAdapter();
			}
			@Override
			public Adapter caseTrgRewriteCond(TrgRewriteCond object) {
				return createTrgRewriteCondAdapter();
			}
			@Override
			public Adapter caseTrgTerm(TrgTerm object) {
				return createTrgTermAdapter();
			}
			@Override
			public Adapter caseTrgConstant(TrgConstant object) {
				return createTrgConstantAdapter();
			}
			@Override
			public Adapter caseTrgRecTerm(TrgRecTerm object) {
				return createTrgRecTermAdapter();
			}
			@Override
			public Adapter caseTrgVariable(TrgVariable object) {
				return createTrgVariableAdapter();
			}
			@Override
			public Adapter caseTrgView(TrgView object) {
				return createTrgViewAdapter();
			}
			@Override
			public Adapter caseTrgViewMapping(TrgViewMapping object) {
				return createTrgViewMappingAdapter();
			}
			@Override
			public Adapter caseTrgRenMapping(TrgRenMapping object) {
				return createTrgRenMappingAdapter();
			}
			@Override
			public Adapter caseTrgTermMapping(TrgTermMapping object) {
				return createTrgTermMappingAdapter();
			}
			@Override
			public Adapter caseTrgSortMapping(TrgSortMapping object) {
				return createTrgSortMappingAdapter();
			}
			@Override
			public Adapter caseTrgOpTypedMapping(TrgOpTypedMapping object) {
				return createTrgOpTypedMappingAdapter();
			}
			@Override
			public Adapter caseTrgOpMapping(TrgOpMapping object) {
				return createTrgOpMappingAdapter();
			}
			@Override
			public Adapter caseTrgLabelMapping(TrgLabelMapping object) {
				return createTrgLabelMappingAdapter();
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
	 * Creates a new adapter for an object of class '{@link jointPackage_Ecore2Maude.JointMM <em>Joint MM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Ecore2Maude.JointMM
	 * @generated
	 */
	public Adapter createJointMMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Ecore2Maude.SrcEStringToStringMapEntry <em>Src EString To String Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Ecore2Maude.SrcEStringToStringMapEntry
	 * @generated
	 */
	public Adapter createSrcEStringToStringMapEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Ecore2Maude.SrcEAttribute <em>Src EAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Ecore2Maude.SrcEAttribute
	 * @generated
	 */
	public Adapter createSrcEAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Ecore2Maude.SrcEClass <em>Src EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Ecore2Maude.SrcEClass
	 * @generated
	 */
	public Adapter createSrcEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Ecore2Maude.SrcEClassifier <em>Src EClassifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Ecore2Maude.SrcEClassifier
	 * @generated
	 */
	public Adapter createSrcEClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Ecore2Maude.SrcEDataType <em>Src EData Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Ecore2Maude.SrcEDataType
	 * @generated
	 */
	public Adapter createSrcEDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Ecore2Maude.SrcEEnum <em>Src EEnum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Ecore2Maude.SrcEEnum
	 * @generated
	 */
	public Adapter createSrcEEnumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Ecore2Maude.SrcEEnumLiteral <em>Src EEnum Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Ecore2Maude.SrcEEnumLiteral
	 * @generated
	 */
	public Adapter createSrcEEnumLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Ecore2Maude.SrcENamedElement <em>Src ENamed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Ecore2Maude.SrcENamedElement
	 * @generated
	 */
	public Adapter createSrcENamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Ecore2Maude.SrcEOperation <em>Src EOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Ecore2Maude.SrcEOperation
	 * @generated
	 */
	public Adapter createSrcEOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Ecore2Maude.SrcEPackage <em>Src EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Ecore2Maude.SrcEPackage
	 * @generated
	 */
	public Adapter createSrcEPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Ecore2Maude.SrcEParameter <em>Src EParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Ecore2Maude.SrcEParameter
	 * @generated
	 */
	public Adapter createSrcEParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Ecore2Maude.SrcEReference <em>Src EReference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Ecore2Maude.SrcEReference
	 * @generated
	 */
	public Adapter createSrcEReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Ecore2Maude.SrcEStructuralFeature <em>Src EStructural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Ecore2Maude.SrcEStructuralFeature
	 * @generated
	 */
	public Adapter createSrcEStructuralFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Ecore2Maude.SrcETypedElement <em>Src ETyped Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Ecore2Maude.SrcETypedElement
	 * @generated
	 */
	public Adapter createSrcETypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Ecore2Maude.TrgMaudeSpec <em>Trg Maude Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Ecore2Maude.TrgMaudeSpec
	 * @generated
	 */
	public Adapter createTrgMaudeSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Ecore2Maude.TrgMembership <em>Trg Membership</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Ecore2Maude.TrgMembership
	 * @generated
	 */
	public Adapter createTrgMembershipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Ecore2Maude.TrgEquation <em>Trg Equation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Ecore2Maude.TrgEquation
	 * @generated
	 */
	public Adapter createTrgEquationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Ecore2Maude.TrgRule <em>Trg Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Ecore2Maude.TrgRule
	 * @generated
	 */
	public Adapter createTrgRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Ecore2Maude.TrgMembershipCond <em>Trg Membership Cond</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Ecore2Maude.TrgMembershipCond
	 * @generated
	 */
	public Adapter createTrgMembershipCondAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Ecore2Maude.TrgBooleanCond <em>Trg Boolean Cond</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Ecore2Maude.TrgBooleanCond
	 * @generated
	 */
	public Adapter createTrgBooleanCondAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Ecore2Maude.TrgMatchingCond <em>Trg Matching Cond</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Ecore2Maude.TrgMatchingCond
	 * @generated
	 */
	public Adapter createTrgMatchingCondAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Ecore2Maude.TrgEqualCond <em>Trg Equal Cond</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Ecore2Maude.TrgEqualCond
	 * @generated
	 */
	public Adapter createTrgEqualCondAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Ecore2Maude.TrgMaudeTopEl <em>Trg Maude Top El</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Ecore2Maude.TrgMaudeTopEl
	 * @generated
	 */
	public Adapter createTrgMaudeTopElAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Ecore2Maude.TrgModExpression <em>Trg Mod Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Ecore2Maude.TrgModExpression
	 * @generated
	 */
	public Adapter createTrgModExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Ecore2Maude.TrgInstModExp <em>Trg Inst Mod Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Ecore2Maude.TrgInstModExp
	 * @generated
	 */
	public Adapter createTrgInstModExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Ecore2Maude.TrgRenModExp <em>Trg Ren Mod Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Ecore2Maude.TrgRenModExp
	 * @generated
	 */
	public Adapter createTrgRenModExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Ecore2Maude.TrgCompModExp <em>Trg Comp Mod Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Ecore2Maude.TrgCompModExp
	 * @generated
	 */
	public Adapter createTrgCompModExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Ecore2Maude.TrgModuleIdModExp <em>Trg Module Id Mod Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Ecore2Maude.TrgModuleIdModExp
	 * @generated
	 */
	public Adapter createTrgModuleIdModExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Ecore2Maude.TrgTheoryIdModExp <em>Trg Theory Id Mod Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Ecore2Maude.TrgTheoryIdModExp
	 * @generated
	 */
	public Adapter createTrgTheoryIdModExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Ecore2Maude.TrgParameter <em>Trg Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Ecore2Maude.TrgParameter
	 * @generated
	 */
	public Adapter createTrgParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Ecore2Maude.TrgTheory <em>Trg Theory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Ecore2Maude.TrgTheory
	 * @generated
	 */
	public Adapter createTrgTheoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Ecore2Maude.TrgFTheory <em>Trg FTheory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Ecore2Maude.TrgFTheory
	 * @generated
	 */
	public Adapter createTrgFTheoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Ecore2Maude.TrgSTheory <em>Trg STheory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Ecore2Maude.TrgSTheory
	 * @generated
	 */
	public Adapter createTrgSTheoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Ecore2Maude.TrgModule <em>Trg Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Ecore2Maude.TrgModule
	 * @generated
	 */
	public Adapter createTrgModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Ecore2Maude.TrgFModule <em>Trg FModule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Ecore2Maude.TrgFModule
	 * @generated
	 */
	public Adapter createTrgFModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Ecore2Maude.TrgSModule <em>Trg SModule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Ecore2Maude.TrgSModule
	 * @generated
	 */
	public Adapter createTrgSModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Ecore2Maude.TrgModElement <em>Trg Mod Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Ecore2Maude.TrgModElement
	 * @generated
	 */
	public Adapter createTrgModElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Ecore2Maude.TrgModImportation <em>Trg Mod Importation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Ecore2Maude.TrgModImportation
	 * @generated
	 */
	public Adapter createTrgModImportationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Ecore2Maude.TrgType <em>Trg Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Ecore2Maude.TrgType
	 * @generated
	 */
	public Adapter createTrgTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Ecore2Maude.TrgSort <em>Trg Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Ecore2Maude.TrgSort
	 * @generated
	 */
	public Adapter createTrgSortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Ecore2Maude.TrgKind <em>Trg Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Ecore2Maude.TrgKind
	 * @generated
	 */
	public Adapter createTrgKindAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Ecore2Maude.TrgSubsortRel <em>Trg Subsort Rel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Ecore2Maude.TrgSubsortRel
	 * @generated
	 */
	public Adapter createTrgSubsortRelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Ecore2Maude.TrgOperation <em>Trg Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Ecore2Maude.TrgOperation
	 * @generated
	 */
	public Adapter createTrgOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Ecore2Maude.TrgStatement <em>Trg Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Ecore2Maude.TrgStatement
	 * @generated
	 */
	public Adapter createTrgStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Ecore2Maude.TrgCondition <em>Trg Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Ecore2Maude.TrgCondition
	 * @generated
	 */
	public Adapter createTrgConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Ecore2Maude.TrgEquationalCond <em>Trg Equational Cond</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Ecore2Maude.TrgEquationalCond
	 * @generated
	 */
	public Adapter createTrgEquationalCondAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Ecore2Maude.TrgRewriteCond <em>Trg Rewrite Cond</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Ecore2Maude.TrgRewriteCond
	 * @generated
	 */
	public Adapter createTrgRewriteCondAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Ecore2Maude.TrgTerm <em>Trg Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Ecore2Maude.TrgTerm
	 * @generated
	 */
	public Adapter createTrgTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Ecore2Maude.TrgConstant <em>Trg Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Ecore2Maude.TrgConstant
	 * @generated
	 */
	public Adapter createTrgConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Ecore2Maude.TrgRecTerm <em>Trg Rec Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Ecore2Maude.TrgRecTerm
	 * @generated
	 */
	public Adapter createTrgRecTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Ecore2Maude.TrgVariable <em>Trg Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Ecore2Maude.TrgVariable
	 * @generated
	 */
	public Adapter createTrgVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Ecore2Maude.TrgView <em>Trg View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Ecore2Maude.TrgView
	 * @generated
	 */
	public Adapter createTrgViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Ecore2Maude.TrgViewMapping <em>Trg View Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Ecore2Maude.TrgViewMapping
	 * @generated
	 */
	public Adapter createTrgViewMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Ecore2Maude.TrgRenMapping <em>Trg Ren Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Ecore2Maude.TrgRenMapping
	 * @generated
	 */
	public Adapter createTrgRenMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Ecore2Maude.TrgTermMapping <em>Trg Term Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Ecore2Maude.TrgTermMapping
	 * @generated
	 */
	public Adapter createTrgTermMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Ecore2Maude.TrgSortMapping <em>Trg Sort Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Ecore2Maude.TrgSortMapping
	 * @generated
	 */
	public Adapter createTrgSortMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Ecore2Maude.TrgOpTypedMapping <em>Trg Op Typed Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Ecore2Maude.TrgOpTypedMapping
	 * @generated
	 */
	public Adapter createTrgOpTypedMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Ecore2Maude.TrgOpMapping <em>Trg Op Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Ecore2Maude.TrgOpMapping
	 * @generated
	 */
	public Adapter createTrgOpMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Ecore2Maude.TrgLabelMapping <em>Trg Label Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Ecore2Maude.TrgLabelMapping
	 * @generated
	 */
	public Adapter createTrgLabelMappingAdapter() {
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

} //JointPackage_Ecore2MaudeAdapterFactory
