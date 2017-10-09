/**
 */
package jointPackage_Ecore2Maude.util;

import jointPackage_Ecore2Maude.*;

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
 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage
 * @generated
 */
public class JointPackage_Ecore2MaudeSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JointPackage_Ecore2MaudePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JointPackage_Ecore2MaudeSwitch() {
		if (modelPackage == null) {
			modelPackage = JointPackage_Ecore2MaudePackage.eINSTANCE;
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
			case JointPackage_Ecore2MaudePackage.JOINT_MM: {
				JointMM jointMM = (JointMM)theEObject;
				T result = caseJointMM(jointMM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Ecore2MaudePackage.SRC_ESTRING_TO_STRING_MAP_ENTRY: {
				SrcEStringToStringMapEntry srcEStringToStringMapEntry = (SrcEStringToStringMapEntry)theEObject;
				T result = caseSrcEStringToStringMapEntry(srcEStringToStringMapEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Ecore2MaudePackage.SRC_EATTRIBUTE: {
				SrcEAttribute srcEAttribute = (SrcEAttribute)theEObject;
				T result = caseSrcEAttribute(srcEAttribute);
				if (result == null) result = caseSrcEStructuralFeature(srcEAttribute);
				if (result == null) result = caseSrcETypedElement(srcEAttribute);
				if (result == null) result = caseSrcENamedElement(srcEAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Ecore2MaudePackage.SRC_ECLASS: {
				SrcEClass srcEClass = (SrcEClass)theEObject;
				T result = caseSrcEClass(srcEClass);
				if (result == null) result = caseSrcEClassifier(srcEClass);
				if (result == null) result = caseSrcENamedElement(srcEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Ecore2MaudePackage.SRC_ECLASSIFIER: {
				SrcEClassifier srcEClassifier = (SrcEClassifier)theEObject;
				T result = caseSrcEClassifier(srcEClassifier);
				if (result == null) result = caseSrcENamedElement(srcEClassifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Ecore2MaudePackage.SRC_EDATA_TYPE: {
				SrcEDataType srcEDataType = (SrcEDataType)theEObject;
				T result = caseSrcEDataType(srcEDataType);
				if (result == null) result = caseSrcEClassifier(srcEDataType);
				if (result == null) result = caseSrcENamedElement(srcEDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Ecore2MaudePackage.SRC_EENUM: {
				SrcEEnum srcEEnum = (SrcEEnum)theEObject;
				T result = caseSrcEEnum(srcEEnum);
				if (result == null) result = caseSrcEDataType(srcEEnum);
				if (result == null) result = caseSrcEClassifier(srcEEnum);
				if (result == null) result = caseSrcENamedElement(srcEEnum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Ecore2MaudePackage.SRC_EENUM_LITERAL: {
				SrcEEnumLiteral srcEEnumLiteral = (SrcEEnumLiteral)theEObject;
				T result = caseSrcEEnumLiteral(srcEEnumLiteral);
				if (result == null) result = caseSrcENamedElement(srcEEnumLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Ecore2MaudePackage.SRC_ENAMED_ELEMENT: {
				SrcENamedElement srcENamedElement = (SrcENamedElement)theEObject;
				T result = caseSrcENamedElement(srcENamedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Ecore2MaudePackage.SRC_EOPERATION: {
				SrcEOperation srcEOperation = (SrcEOperation)theEObject;
				T result = caseSrcEOperation(srcEOperation);
				if (result == null) result = caseSrcETypedElement(srcEOperation);
				if (result == null) result = caseSrcENamedElement(srcEOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Ecore2MaudePackage.SRC_EPACKAGE: {
				SrcEPackage srcEPackage = (SrcEPackage)theEObject;
				T result = caseSrcEPackage(srcEPackage);
				if (result == null) result = caseSrcENamedElement(srcEPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Ecore2MaudePackage.SRC_EPARAMETER: {
				SrcEParameter srcEParameter = (SrcEParameter)theEObject;
				T result = caseSrcEParameter(srcEParameter);
				if (result == null) result = caseSrcETypedElement(srcEParameter);
				if (result == null) result = caseSrcENamedElement(srcEParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Ecore2MaudePackage.SRC_EREFERENCE: {
				SrcEReference srcEReference = (SrcEReference)theEObject;
				T result = caseSrcEReference(srcEReference);
				if (result == null) result = caseSrcEStructuralFeature(srcEReference);
				if (result == null) result = caseSrcETypedElement(srcEReference);
				if (result == null) result = caseSrcENamedElement(srcEReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Ecore2MaudePackage.SRC_ESTRUCTURAL_FEATURE: {
				SrcEStructuralFeature srcEStructuralFeature = (SrcEStructuralFeature)theEObject;
				T result = caseSrcEStructuralFeature(srcEStructuralFeature);
				if (result == null) result = caseSrcETypedElement(srcEStructuralFeature);
				if (result == null) result = caseSrcENamedElement(srcEStructuralFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Ecore2MaudePackage.SRC_ETYPED_ELEMENT: {
				SrcETypedElement srcETypedElement = (SrcETypedElement)theEObject;
				T result = caseSrcETypedElement(srcETypedElement);
				if (result == null) result = caseSrcENamedElement(srcETypedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Ecore2MaudePackage.TRG_MAUDE_SPEC: {
				TrgMaudeSpec trgMaudeSpec = (TrgMaudeSpec)theEObject;
				T result = caseTrgMaudeSpec(trgMaudeSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Ecore2MaudePackage.TRG_MEMBERSHIP: {
				TrgMembership trgMembership = (TrgMembership)theEObject;
				T result = caseTrgMembership(trgMembership);
				if (result == null) result = caseTrgStatement(trgMembership);
				if (result == null) result = caseTrgModElement(trgMembership);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Ecore2MaudePackage.TRG_EQUATION: {
				TrgEquation trgEquation = (TrgEquation)theEObject;
				T result = caseTrgEquation(trgEquation);
				if (result == null) result = caseTrgStatement(trgEquation);
				if (result == null) result = caseTrgModElement(trgEquation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Ecore2MaudePackage.TRG_RULE: {
				TrgRule trgRule = (TrgRule)theEObject;
				T result = caseTrgRule(trgRule);
				if (result == null) result = caseTrgStatement(trgRule);
				if (result == null) result = caseTrgModElement(trgRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Ecore2MaudePackage.TRG_MEMBERSHIP_COND: {
				TrgMembershipCond trgMembershipCond = (TrgMembershipCond)theEObject;
				T result = caseTrgMembershipCond(trgMembershipCond);
				if (result == null) result = caseTrgEquationalCond(trgMembershipCond);
				if (result == null) result = caseTrgCondition(trgMembershipCond);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Ecore2MaudePackage.TRG_BOOLEAN_COND: {
				TrgBooleanCond trgBooleanCond = (TrgBooleanCond)theEObject;
				T result = caseTrgBooleanCond(trgBooleanCond);
				if (result == null) result = caseTrgEquationalCond(trgBooleanCond);
				if (result == null) result = caseTrgCondition(trgBooleanCond);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Ecore2MaudePackage.TRG_MATCHING_COND: {
				TrgMatchingCond trgMatchingCond = (TrgMatchingCond)theEObject;
				T result = caseTrgMatchingCond(trgMatchingCond);
				if (result == null) result = caseTrgEquationalCond(trgMatchingCond);
				if (result == null) result = caseTrgCondition(trgMatchingCond);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Ecore2MaudePackage.TRG_EQUAL_COND: {
				TrgEqualCond trgEqualCond = (TrgEqualCond)theEObject;
				T result = caseTrgEqualCond(trgEqualCond);
				if (result == null) result = caseTrgEquationalCond(trgEqualCond);
				if (result == null) result = caseTrgCondition(trgEqualCond);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Ecore2MaudePackage.TRG_MAUDE_TOP_EL: {
				TrgMaudeTopEl trgMaudeTopEl = (TrgMaudeTopEl)theEObject;
				T result = caseTrgMaudeTopEl(trgMaudeTopEl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Ecore2MaudePackage.TRG_MOD_EXPRESSION: {
				TrgModExpression trgModExpression = (TrgModExpression)theEObject;
				T result = caseTrgModExpression(trgModExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Ecore2MaudePackage.TRG_INST_MOD_EXP: {
				TrgInstModExp trgInstModExp = (TrgInstModExp)theEObject;
				T result = caseTrgInstModExp(trgInstModExp);
				if (result == null) result = caseTrgModExpression(trgInstModExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Ecore2MaudePackage.TRG_REN_MOD_EXP: {
				TrgRenModExp trgRenModExp = (TrgRenModExp)theEObject;
				T result = caseTrgRenModExp(trgRenModExp);
				if (result == null) result = caseTrgModExpression(trgRenModExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Ecore2MaudePackage.TRG_COMP_MOD_EXP: {
				TrgCompModExp trgCompModExp = (TrgCompModExp)theEObject;
				T result = caseTrgCompModExp(trgCompModExp);
				if (result == null) result = caseTrgModExpression(trgCompModExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Ecore2MaudePackage.TRG_MODULE_ID_MOD_EXP: {
				TrgModuleIdModExp trgModuleIdModExp = (TrgModuleIdModExp)theEObject;
				T result = caseTrgModuleIdModExp(trgModuleIdModExp);
				if (result == null) result = caseTrgModExpression(trgModuleIdModExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Ecore2MaudePackage.TRG_THEORY_ID_MOD_EXP: {
				TrgTheoryIdModExp trgTheoryIdModExp = (TrgTheoryIdModExp)theEObject;
				T result = caseTrgTheoryIdModExp(trgTheoryIdModExp);
				if (result == null) result = caseTrgModExpression(trgTheoryIdModExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Ecore2MaudePackage.TRG_PARAMETER: {
				TrgParameter trgParameter = (TrgParameter)theEObject;
				T result = caseTrgParameter(trgParameter);
				if (result == null) result = caseTrgModExpression(trgParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Ecore2MaudePackage.TRG_THEORY: {
				TrgTheory trgTheory = (TrgTheory)theEObject;
				T result = caseTrgTheory(trgTheory);
				if (result == null) result = caseTrgMaudeTopEl(trgTheory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Ecore2MaudePackage.TRG_FTHEORY: {
				TrgFTheory trgFTheory = (TrgFTheory)theEObject;
				T result = caseTrgFTheory(trgFTheory);
				if (result == null) result = caseTrgTheory(trgFTheory);
				if (result == null) result = caseTrgMaudeTopEl(trgFTheory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Ecore2MaudePackage.TRG_STHEORY: {
				TrgSTheory trgSTheory = (TrgSTheory)theEObject;
				T result = caseTrgSTheory(trgSTheory);
				if (result == null) result = caseTrgTheory(trgSTheory);
				if (result == null) result = caseTrgMaudeTopEl(trgSTheory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Ecore2MaudePackage.TRG_MODULE: {
				TrgModule trgModule = (TrgModule)theEObject;
				T result = caseTrgModule(trgModule);
				if (result == null) result = caseTrgMaudeTopEl(trgModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Ecore2MaudePackage.TRG_FMODULE: {
				TrgFModule trgFModule = (TrgFModule)theEObject;
				T result = caseTrgFModule(trgFModule);
				if (result == null) result = caseTrgModule(trgFModule);
				if (result == null) result = caseTrgMaudeTopEl(trgFModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Ecore2MaudePackage.TRG_SMODULE: {
				TrgSModule trgSModule = (TrgSModule)theEObject;
				T result = caseTrgSModule(trgSModule);
				if (result == null) result = caseTrgModule(trgSModule);
				if (result == null) result = caseTrgMaudeTopEl(trgSModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Ecore2MaudePackage.TRG_MOD_ELEMENT: {
				TrgModElement trgModElement = (TrgModElement)theEObject;
				T result = caseTrgModElement(trgModElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Ecore2MaudePackage.TRG_MOD_IMPORTATION: {
				TrgModImportation trgModImportation = (TrgModImportation)theEObject;
				T result = caseTrgModImportation(trgModImportation);
				if (result == null) result = caseTrgModElement(trgModImportation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Ecore2MaudePackage.TRG_TYPE: {
				TrgType trgType = (TrgType)theEObject;
				T result = caseTrgType(trgType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Ecore2MaudePackage.TRG_SORT: {
				TrgSort trgSort = (TrgSort)theEObject;
				T result = caseTrgSort(trgSort);
				if (result == null) result = caseTrgType(trgSort);
				if (result == null) result = caseTrgModElement(trgSort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Ecore2MaudePackage.TRG_KIND: {
				TrgKind trgKind = (TrgKind)theEObject;
				T result = caseTrgKind(trgKind);
				if (result == null) result = caseTrgType(trgKind);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Ecore2MaudePackage.TRG_SUBSORT_REL: {
				TrgSubsortRel trgSubsortRel = (TrgSubsortRel)theEObject;
				T result = caseTrgSubsortRel(trgSubsortRel);
				if (result == null) result = caseTrgModElement(trgSubsortRel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Ecore2MaudePackage.TRG_OPERATION: {
				TrgOperation trgOperation = (TrgOperation)theEObject;
				T result = caseTrgOperation(trgOperation);
				if (result == null) result = caseTrgModElement(trgOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Ecore2MaudePackage.TRG_STATEMENT: {
				TrgStatement trgStatement = (TrgStatement)theEObject;
				T result = caseTrgStatement(trgStatement);
				if (result == null) result = caseTrgModElement(trgStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Ecore2MaudePackage.TRG_CONDITION: {
				TrgCondition trgCondition = (TrgCondition)theEObject;
				T result = caseTrgCondition(trgCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Ecore2MaudePackage.TRG_EQUATIONAL_COND: {
				TrgEquationalCond trgEquationalCond = (TrgEquationalCond)theEObject;
				T result = caseTrgEquationalCond(trgEquationalCond);
				if (result == null) result = caseTrgCondition(trgEquationalCond);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Ecore2MaudePackage.TRG_REWRITE_COND: {
				TrgRewriteCond trgRewriteCond = (TrgRewriteCond)theEObject;
				T result = caseTrgRewriteCond(trgRewriteCond);
				if (result == null) result = caseTrgCondition(trgRewriteCond);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Ecore2MaudePackage.TRG_TERM: {
				TrgTerm trgTerm = (TrgTerm)theEObject;
				T result = caseTrgTerm(trgTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Ecore2MaudePackage.TRG_CONSTANT: {
				TrgConstant trgConstant = (TrgConstant)theEObject;
				T result = caseTrgConstant(trgConstant);
				if (result == null) result = caseTrgTerm(trgConstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Ecore2MaudePackage.TRG_REC_TERM: {
				TrgRecTerm trgRecTerm = (TrgRecTerm)theEObject;
				T result = caseTrgRecTerm(trgRecTerm);
				if (result == null) result = caseTrgTerm(trgRecTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Ecore2MaudePackage.TRG_VARIABLE: {
				TrgVariable trgVariable = (TrgVariable)theEObject;
				T result = caseTrgVariable(trgVariable);
				if (result == null) result = caseTrgTerm(trgVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Ecore2MaudePackage.TRG_VIEW: {
				TrgView trgView = (TrgView)theEObject;
				T result = caseTrgView(trgView);
				if (result == null) result = caseTrgMaudeTopEl(trgView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Ecore2MaudePackage.TRG_VIEW_MAPPING: {
				TrgViewMapping trgViewMapping = (TrgViewMapping)theEObject;
				T result = caseTrgViewMapping(trgViewMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Ecore2MaudePackage.TRG_REN_MAPPING: {
				TrgRenMapping trgRenMapping = (TrgRenMapping)theEObject;
				T result = caseTrgRenMapping(trgRenMapping);
				if (result == null) result = caseTrgViewMapping(trgRenMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Ecore2MaudePackage.TRG_TERM_MAPPING: {
				TrgTermMapping trgTermMapping = (TrgTermMapping)theEObject;
				T result = caseTrgTermMapping(trgTermMapping);
				if (result == null) result = caseTrgViewMapping(trgTermMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Ecore2MaudePackage.TRG_SORT_MAPPING: {
				TrgSortMapping trgSortMapping = (TrgSortMapping)theEObject;
				T result = caseTrgSortMapping(trgSortMapping);
				if (result == null) result = caseTrgRenMapping(trgSortMapping);
				if (result == null) result = caseTrgViewMapping(trgSortMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Ecore2MaudePackage.TRG_OP_TYPED_MAPPING: {
				TrgOpTypedMapping trgOpTypedMapping = (TrgOpTypedMapping)theEObject;
				T result = caseTrgOpTypedMapping(trgOpTypedMapping);
				if (result == null) result = caseTrgRenMapping(trgOpTypedMapping);
				if (result == null) result = caseTrgViewMapping(trgOpTypedMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Ecore2MaudePackage.TRG_OP_MAPPING: {
				TrgOpMapping trgOpMapping = (TrgOpMapping)theEObject;
				T result = caseTrgOpMapping(trgOpMapping);
				if (result == null) result = caseTrgRenMapping(trgOpMapping);
				if (result == null) result = caseTrgViewMapping(trgOpMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Ecore2MaudePackage.TRG_LABEL_MAPPING: {
				TrgLabelMapping trgLabelMapping = (TrgLabelMapping)theEObject;
				T result = caseTrgLabelMapping(trgLabelMapping);
				if (result == null) result = caseTrgRenMapping(trgLabelMapping);
				if (result == null) result = caseTrgViewMapping(trgLabelMapping);
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
	 * Returns the result of interpreting the object as an instance of '<em>Src EString To String Map Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src EString To String Map Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcEStringToStringMapEntry(SrcEStringToStringMapEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src EAttribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src EAttribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcEAttribute(SrcEAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcEClass(SrcEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src EClassifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src EClassifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcEClassifier(SrcEClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src EData Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src EData Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcEDataType(SrcEDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src EEnum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src EEnum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcEEnum(SrcEEnum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src EEnum Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src EEnum Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcEEnumLiteral(SrcEEnumLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src ENamed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src ENamed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcENamedElement(SrcENamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src EOperation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src EOperation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcEOperation(SrcEOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src EPackage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src EPackage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcEPackage(SrcEPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src EParameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src EParameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcEParameter(SrcEParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src EReference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src EReference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcEReference(SrcEReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src EStructural Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src EStructural Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcEStructuralFeature(SrcEStructuralFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src ETyped Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src ETyped Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcETypedElement(SrcETypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Maude Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Maude Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgMaudeSpec(TrgMaudeSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Membership</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Membership</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgMembership(TrgMembership object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Equation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Equation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgEquation(TrgEquation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgRule(TrgRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Membership Cond</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Membership Cond</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgMembershipCond(TrgMembershipCond object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Boolean Cond</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Boolean Cond</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgBooleanCond(TrgBooleanCond object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Matching Cond</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Matching Cond</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgMatchingCond(TrgMatchingCond object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Equal Cond</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Equal Cond</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgEqualCond(TrgEqualCond object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Maude Top El</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Maude Top El</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgMaudeTopEl(TrgMaudeTopEl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Mod Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Mod Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgModExpression(TrgModExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Inst Mod Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Inst Mod Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgInstModExp(TrgInstModExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Ren Mod Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Ren Mod Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgRenModExp(TrgRenModExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Comp Mod Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Comp Mod Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgCompModExp(TrgCompModExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Module Id Mod Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Module Id Mod Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgModuleIdModExp(TrgModuleIdModExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Theory Id Mod Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Theory Id Mod Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgTheoryIdModExp(TrgTheoryIdModExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgParameter(TrgParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Theory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Theory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgTheory(TrgTheory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg FTheory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg FTheory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgFTheory(TrgFTheory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg STheory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg STheory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgSTheory(TrgSTheory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgModule(TrgModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg FModule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg FModule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgFModule(TrgFModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg SModule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg SModule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgSModule(TrgSModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Mod Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Mod Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgModElement(TrgModElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Mod Importation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Mod Importation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgModImportation(TrgModImportation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgType(TrgType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Sort</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Sort</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgSort(TrgSort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Kind</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Kind</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgKind(TrgKind object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Subsort Rel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Subsort Rel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgSubsortRel(TrgSubsortRel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgOperation(TrgOperation object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Trg Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgCondition(TrgCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Equational Cond</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Equational Cond</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgEquationalCond(TrgEquationalCond object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Rewrite Cond</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Rewrite Cond</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgRewriteCond(TrgRewriteCond object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgTerm(TrgTerm object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Trg Rec Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Rec Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgRecTerm(TrgRecTerm object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Trg View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgView(TrgView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg View Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg View Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgViewMapping(TrgViewMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Ren Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Ren Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgRenMapping(TrgRenMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Term Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Term Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgTermMapping(TrgTermMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Sort Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Sort Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgSortMapping(TrgSortMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Op Typed Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Op Typed Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgOpTypedMapping(TrgOpTypedMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Op Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Op Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgOpMapping(TrgOpMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Label Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Label Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgLabelMapping(TrgLabelMapping object) {
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

} //JointPackage_Ecore2MaudeSwitch
