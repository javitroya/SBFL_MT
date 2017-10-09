/**
 */
package jointPackage_Ecore2Maude.util;

import java.util.Map;

import jointPackage_Ecore2Maude.*;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage
 * @generated
 */
public class JointPackage_Ecore2MaudeValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final JointPackage_Ecore2MaudeValidator INSTANCE = new JointPackage_Ecore2MaudeValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "jointPackage_Ecore2Maude";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JointPackage_Ecore2MaudeValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return JointPackage_Ecore2MaudePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case JointPackage_Ecore2MaudePackage.JOINT_MM:
				return validateJointMM((JointMM)value, diagnostics, context);
			case JointPackage_Ecore2MaudePackage.SRC_ESTRING_TO_STRING_MAP_ENTRY:
				return validateSrcEStringToStringMapEntry((SrcEStringToStringMapEntry)value, diagnostics, context);
			case JointPackage_Ecore2MaudePackage.SRC_EATTRIBUTE:
				return validateSrcEAttribute((SrcEAttribute)value, diagnostics, context);
			case JointPackage_Ecore2MaudePackage.SRC_ECLASS:
				return validateSrcEClass((SrcEClass)value, diagnostics, context);
			case JointPackage_Ecore2MaudePackage.SRC_ECLASSIFIER:
				return validateSrcEClassifier((SrcEClassifier)value, diagnostics, context);
			case JointPackage_Ecore2MaudePackage.SRC_EDATA_TYPE:
				return validateSrcEDataType((SrcEDataType)value, diagnostics, context);
			case JointPackage_Ecore2MaudePackage.SRC_EENUM:
				return validateSrcEEnum((SrcEEnum)value, diagnostics, context);
			case JointPackage_Ecore2MaudePackage.SRC_EENUM_LITERAL:
				return validateSrcEEnumLiteral((SrcEEnumLiteral)value, diagnostics, context);
			case JointPackage_Ecore2MaudePackage.SRC_ENAMED_ELEMENT:
				return validateSrcENamedElement((SrcENamedElement)value, diagnostics, context);
			case JointPackage_Ecore2MaudePackage.SRC_EOPERATION:
				return validateSrcEOperation((SrcEOperation)value, diagnostics, context);
			case JointPackage_Ecore2MaudePackage.SRC_EPACKAGE:
				return validateSrcEPackage((SrcEPackage)value, diagnostics, context);
			case JointPackage_Ecore2MaudePackage.SRC_EPARAMETER:
				return validateSrcEParameter((SrcEParameter)value, diagnostics, context);
			case JointPackage_Ecore2MaudePackage.SRC_EREFERENCE:
				return validateSrcEReference((SrcEReference)value, diagnostics, context);
			case JointPackage_Ecore2MaudePackage.SRC_ESTRUCTURAL_FEATURE:
				return validateSrcEStructuralFeature((SrcEStructuralFeature)value, diagnostics, context);
			case JointPackage_Ecore2MaudePackage.SRC_ETYPED_ELEMENT:
				return validateSrcETypedElement((SrcETypedElement)value, diagnostics, context);
			case JointPackage_Ecore2MaudePackage.TRG_MAUDE_SPEC:
				return validateTrgMaudeSpec((TrgMaudeSpec)value, diagnostics, context);
			case JointPackage_Ecore2MaudePackage.TRG_MEMBERSHIP:
				return validateTrgMembership((TrgMembership)value, diagnostics, context);
			case JointPackage_Ecore2MaudePackage.TRG_EQUATION:
				return validateTrgEquation((TrgEquation)value, diagnostics, context);
			case JointPackage_Ecore2MaudePackage.TRG_RULE:
				return validateTrgRule((TrgRule)value, diagnostics, context);
			case JointPackage_Ecore2MaudePackage.TRG_MEMBERSHIP_COND:
				return validateTrgMembershipCond((TrgMembershipCond)value, diagnostics, context);
			case JointPackage_Ecore2MaudePackage.TRG_BOOLEAN_COND:
				return validateTrgBooleanCond((TrgBooleanCond)value, diagnostics, context);
			case JointPackage_Ecore2MaudePackage.TRG_MATCHING_COND:
				return validateTrgMatchingCond((TrgMatchingCond)value, diagnostics, context);
			case JointPackage_Ecore2MaudePackage.TRG_EQUAL_COND:
				return validateTrgEqualCond((TrgEqualCond)value, diagnostics, context);
			case JointPackage_Ecore2MaudePackage.TRG_MAUDE_TOP_EL:
				return validateTrgMaudeTopEl((TrgMaudeTopEl)value, diagnostics, context);
			case JointPackage_Ecore2MaudePackage.TRG_MOD_EXPRESSION:
				return validateTrgModExpression((TrgModExpression)value, diagnostics, context);
			case JointPackage_Ecore2MaudePackage.TRG_INST_MOD_EXP:
				return validateTrgInstModExp((TrgInstModExp)value, diagnostics, context);
			case JointPackage_Ecore2MaudePackage.TRG_REN_MOD_EXP:
				return validateTrgRenModExp((TrgRenModExp)value, diagnostics, context);
			case JointPackage_Ecore2MaudePackage.TRG_COMP_MOD_EXP:
				return validateTrgCompModExp((TrgCompModExp)value, diagnostics, context);
			case JointPackage_Ecore2MaudePackage.TRG_MODULE_ID_MOD_EXP:
				return validateTrgModuleIdModExp((TrgModuleIdModExp)value, diagnostics, context);
			case JointPackage_Ecore2MaudePackage.TRG_THEORY_ID_MOD_EXP:
				return validateTrgTheoryIdModExp((TrgTheoryIdModExp)value, diagnostics, context);
			case JointPackage_Ecore2MaudePackage.TRG_PARAMETER:
				return validateTrgParameter((TrgParameter)value, diagnostics, context);
			case JointPackage_Ecore2MaudePackage.TRG_THEORY:
				return validateTrgTheory((TrgTheory)value, diagnostics, context);
			case JointPackage_Ecore2MaudePackage.TRG_FTHEORY:
				return validateTrgFTheory((TrgFTheory)value, diagnostics, context);
			case JointPackage_Ecore2MaudePackage.TRG_STHEORY:
				return validateTrgSTheory((TrgSTheory)value, diagnostics, context);
			case JointPackage_Ecore2MaudePackage.TRG_MODULE:
				return validateTrgModule((TrgModule)value, diagnostics, context);
			case JointPackage_Ecore2MaudePackage.TRG_FMODULE:
				return validateTrgFModule((TrgFModule)value, diagnostics, context);
			case JointPackage_Ecore2MaudePackage.TRG_SMODULE:
				return validateTrgSModule((TrgSModule)value, diagnostics, context);
			case JointPackage_Ecore2MaudePackage.TRG_MOD_ELEMENT:
				return validateTrgModElement((TrgModElement)value, diagnostics, context);
			case JointPackage_Ecore2MaudePackage.TRG_MOD_IMPORTATION:
				return validateTrgModImportation((TrgModImportation)value, diagnostics, context);
			case JointPackage_Ecore2MaudePackage.TRG_TYPE:
				return validateTrgType((TrgType)value, diagnostics, context);
			case JointPackage_Ecore2MaudePackage.TRG_SORT:
				return validateTrgSort((TrgSort)value, diagnostics, context);
			case JointPackage_Ecore2MaudePackage.TRG_KIND:
				return validateTrgKind((TrgKind)value, diagnostics, context);
			case JointPackage_Ecore2MaudePackage.TRG_SUBSORT_REL:
				return validateTrgSubsortRel((TrgSubsortRel)value, diagnostics, context);
			case JointPackage_Ecore2MaudePackage.TRG_OPERATION:
				return validateTrgOperation((TrgOperation)value, diagnostics, context);
			case JointPackage_Ecore2MaudePackage.TRG_STATEMENT:
				return validateTrgStatement((TrgStatement)value, diagnostics, context);
			case JointPackage_Ecore2MaudePackage.TRG_CONDITION:
				return validateTrgCondition((TrgCondition)value, diagnostics, context);
			case JointPackage_Ecore2MaudePackage.TRG_EQUATIONAL_COND:
				return validateTrgEquationalCond((TrgEquationalCond)value, diagnostics, context);
			case JointPackage_Ecore2MaudePackage.TRG_REWRITE_COND:
				return validateTrgRewriteCond((TrgRewriteCond)value, diagnostics, context);
			case JointPackage_Ecore2MaudePackage.TRG_TERM:
				return validateTrgTerm((TrgTerm)value, diagnostics, context);
			case JointPackage_Ecore2MaudePackage.TRG_CONSTANT:
				return validateTrgConstant((TrgConstant)value, diagnostics, context);
			case JointPackage_Ecore2MaudePackage.TRG_REC_TERM:
				return validateTrgRecTerm((TrgRecTerm)value, diagnostics, context);
			case JointPackage_Ecore2MaudePackage.TRG_VARIABLE:
				return validateTrgVariable((TrgVariable)value, diagnostics, context);
			case JointPackage_Ecore2MaudePackage.TRG_VIEW:
				return validateTrgView((TrgView)value, diagnostics, context);
			case JointPackage_Ecore2MaudePackage.TRG_VIEW_MAPPING:
				return validateTrgViewMapping((TrgViewMapping)value, diagnostics, context);
			case JointPackage_Ecore2MaudePackage.TRG_REN_MAPPING:
				return validateTrgRenMapping((TrgRenMapping)value, diagnostics, context);
			case JointPackage_Ecore2MaudePackage.TRG_TERM_MAPPING:
				return validateTrgTermMapping((TrgTermMapping)value, diagnostics, context);
			case JointPackage_Ecore2MaudePackage.TRG_SORT_MAPPING:
				return validateTrgSortMapping((TrgSortMapping)value, diagnostics, context);
			case JointPackage_Ecore2MaudePackage.TRG_OP_TYPED_MAPPING:
				return validateTrgOpTypedMapping((TrgOpTypedMapping)value, diagnostics, context);
			case JointPackage_Ecore2MaudePackage.TRG_OP_MAPPING:
				return validateTrgOpMapping((TrgOpMapping)value, diagnostics, context);
			case JointPackage_Ecore2MaudePackage.TRG_LABEL_MAPPING:
				return validateTrgLabelMapping((TrgLabelMapping)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJointMM(JointMM jointMM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(jointMM, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSrcEStringToStringMapEntry(SrcEStringToStringMapEntry srcEStringToStringMapEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(srcEStringToStringMapEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSrcEAttribute(SrcEAttribute srcEAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(srcEAttribute, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(srcEAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(srcEAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(srcEAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(srcEAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(srcEAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(srcEAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(srcEAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(srcEAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateSrcENamedElement_WellFormedName(srcEAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateSrcETypedElement_ValidLowerBound(srcEAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateSrcETypedElement_ValidUpperBound(srcEAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateSrcETypedElement_ConsistentBounds(srcEAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateSrcETypedElement_ValidType(srcEAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateSrcEStructuralFeature_ValidDefaultValueLiteral(srcEAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateSrcEAttribute_ConsistentTransient(srcEAttribute, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ConsistentTransient constraint of '<em>Src EAttribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSrcEAttribute_ConsistentTransient(SrcEAttribute srcEAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "ConsistentTransient", getObjectLabel(srcEAttribute, context) },
						 new Object[] { srcEAttribute },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSrcEClass(SrcEClass srcEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(srcEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(srcEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(srcEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(srcEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(srcEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(srcEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(srcEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(srcEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(srcEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateSrcENamedElement_WellFormedName(srcEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateSrcEClassifier_WellFormedInstanceTypeName(srcEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateSrcEClassifier_UniqueTypeParameterNames(srcEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateSrcEClass_InterfaceIsAbstract(srcEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateSrcEClass_AtMostOneID(srcEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateSrcEClass_UniqueFeatureNames(srcEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateSrcEClass_UniqueOperationSignatures(srcEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateSrcEClass_NoCircularSuperTypes(srcEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateSrcEClass_WellFormedMapEntryClass(srcEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateSrcEClass_ConsistentSuperTypes(srcEClass, diagnostics, context);
		return result;
	}

	/**
	 * Validates the InterfaceIsAbstract constraint of '<em>Src EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSrcEClass_InterfaceIsAbstract(SrcEClass srcEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "InterfaceIsAbstract", getObjectLabel(srcEClass, context) },
						 new Object[] { srcEClass },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the AtMostOneID constraint of '<em>Src EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSrcEClass_AtMostOneID(SrcEClass srcEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "AtMostOneID", getObjectLabel(srcEClass, context) },
						 new Object[] { srcEClass },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the UniqueFeatureNames constraint of '<em>Src EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSrcEClass_UniqueFeatureNames(SrcEClass srcEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "UniqueFeatureNames", getObjectLabel(srcEClass, context) },
						 new Object[] { srcEClass },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the UniqueOperationSignatures constraint of '<em>Src EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSrcEClass_UniqueOperationSignatures(SrcEClass srcEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "UniqueOperationSignatures", getObjectLabel(srcEClass, context) },
						 new Object[] { srcEClass },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the NoCircularSuperTypes constraint of '<em>Src EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSrcEClass_NoCircularSuperTypes(SrcEClass srcEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "NoCircularSuperTypes", getObjectLabel(srcEClass, context) },
						 new Object[] { srcEClass },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the WellFormedMapEntryClass constraint of '<em>Src EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSrcEClass_WellFormedMapEntryClass(SrcEClass srcEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "WellFormedMapEntryClass", getObjectLabel(srcEClass, context) },
						 new Object[] { srcEClass },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the ConsistentSuperTypes constraint of '<em>Src EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSrcEClass_ConsistentSuperTypes(SrcEClass srcEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "ConsistentSuperTypes", getObjectLabel(srcEClass, context) },
						 new Object[] { srcEClass },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSrcEClassifier(SrcEClassifier srcEClassifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(srcEClassifier, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(srcEClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(srcEClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(srcEClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(srcEClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(srcEClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(srcEClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(srcEClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(srcEClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateSrcENamedElement_WellFormedName(srcEClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateSrcEClassifier_WellFormedInstanceTypeName(srcEClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateSrcEClassifier_UniqueTypeParameterNames(srcEClassifier, diagnostics, context);
		return result;
	}

	/**
	 * Validates the WellFormedInstanceTypeName constraint of '<em>Src EClassifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSrcEClassifier_WellFormedInstanceTypeName(SrcEClassifier srcEClassifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "WellFormedInstanceTypeName", getObjectLabel(srcEClassifier, context) },
						 new Object[] { srcEClassifier },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the UniqueTypeParameterNames constraint of '<em>Src EClassifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSrcEClassifier_UniqueTypeParameterNames(SrcEClassifier srcEClassifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "UniqueTypeParameterNames", getObjectLabel(srcEClassifier, context) },
						 new Object[] { srcEClassifier },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSrcEDataType(SrcEDataType srcEDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(srcEDataType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(srcEDataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(srcEDataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(srcEDataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(srcEDataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(srcEDataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(srcEDataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(srcEDataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(srcEDataType, diagnostics, context);
		if (result || diagnostics != null) result &= validateSrcENamedElement_WellFormedName(srcEDataType, diagnostics, context);
		if (result || diagnostics != null) result &= validateSrcEClassifier_WellFormedInstanceTypeName(srcEDataType, diagnostics, context);
		if (result || diagnostics != null) result &= validateSrcEClassifier_UniqueTypeParameterNames(srcEDataType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSrcEEnum(SrcEEnum srcEEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(srcEEnum, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(srcEEnum, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(srcEEnum, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(srcEEnum, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(srcEEnum, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(srcEEnum, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(srcEEnum, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(srcEEnum, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(srcEEnum, diagnostics, context);
		if (result || diagnostics != null) result &= validateSrcENamedElement_WellFormedName(srcEEnum, diagnostics, context);
		if (result || diagnostics != null) result &= validateSrcEClassifier_WellFormedInstanceTypeName(srcEEnum, diagnostics, context);
		if (result || diagnostics != null) result &= validateSrcEClassifier_UniqueTypeParameterNames(srcEEnum, diagnostics, context);
		if (result || diagnostics != null) result &= validateSrcEEnum_UniqueEnumeratorNames(srcEEnum, diagnostics, context);
		if (result || diagnostics != null) result &= validateSrcEEnum_UniqueEnumeratorLiterals(srcEEnum, diagnostics, context);
		return result;
	}

	/**
	 * Validates the UniqueEnumeratorNames constraint of '<em>Src EEnum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSrcEEnum_UniqueEnumeratorNames(SrcEEnum srcEEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "UniqueEnumeratorNames", getObjectLabel(srcEEnum, context) },
						 new Object[] { srcEEnum },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the UniqueEnumeratorLiterals constraint of '<em>Src EEnum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSrcEEnum_UniqueEnumeratorLiterals(SrcEEnum srcEEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "UniqueEnumeratorLiterals", getObjectLabel(srcEEnum, context) },
						 new Object[] { srcEEnum },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSrcEEnumLiteral(SrcEEnumLiteral srcEEnumLiteral, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(srcEEnumLiteral, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(srcEEnumLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(srcEEnumLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(srcEEnumLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(srcEEnumLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(srcEEnumLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(srcEEnumLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(srcEEnumLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(srcEEnumLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validateSrcENamedElement_WellFormedName(srcEEnumLiteral, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSrcENamedElement(SrcENamedElement srcENamedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(srcENamedElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(srcENamedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(srcENamedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(srcENamedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(srcENamedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(srcENamedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(srcENamedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(srcENamedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(srcENamedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateSrcENamedElement_WellFormedName(srcENamedElement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the WellFormedName constraint of '<em>Src ENamed Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSrcENamedElement_WellFormedName(SrcENamedElement srcENamedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "WellFormedName", getObjectLabel(srcENamedElement, context) },
						 new Object[] { srcENamedElement },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSrcEOperation(SrcEOperation srcEOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(srcEOperation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(srcEOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(srcEOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(srcEOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(srcEOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(srcEOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(srcEOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(srcEOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(srcEOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSrcENamedElement_WellFormedName(srcEOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSrcETypedElement_ValidLowerBound(srcEOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSrcETypedElement_ValidUpperBound(srcEOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSrcETypedElement_ConsistentBounds(srcEOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSrcETypedElement_ValidType(srcEOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSrcEOperation_UniqueParameterNames(srcEOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSrcEOperation_UniqueTypeParameterNames(srcEOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSrcEOperation_NoRepeatingVoid(srcEOperation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the UniqueParameterNames constraint of '<em>Src EOperation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSrcEOperation_UniqueParameterNames(SrcEOperation srcEOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "UniqueParameterNames", getObjectLabel(srcEOperation, context) },
						 new Object[] { srcEOperation },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the UniqueTypeParameterNames constraint of '<em>Src EOperation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSrcEOperation_UniqueTypeParameterNames(SrcEOperation srcEOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "UniqueTypeParameterNames", getObjectLabel(srcEOperation, context) },
						 new Object[] { srcEOperation },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the NoRepeatingVoid constraint of '<em>Src EOperation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSrcEOperation_NoRepeatingVoid(SrcEOperation srcEOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "NoRepeatingVoid", getObjectLabel(srcEOperation, context) },
						 new Object[] { srcEOperation },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSrcEPackage(SrcEPackage srcEPackage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(srcEPackage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(srcEPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(srcEPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(srcEPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(srcEPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(srcEPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(srcEPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(srcEPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(srcEPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validateSrcENamedElement_WellFormedName(srcEPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validateSrcEPackage_WellFormedNsURI(srcEPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validateSrcEPackage_WellFormedNsPrefix(srcEPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validateSrcEPackage_UniqueSubpackageNames(srcEPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validateSrcEPackage_UniqueClassifierNames(srcEPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validateSrcEPackage_UniqueNsURIs(srcEPackage, diagnostics, context);
		return result;
	}

	/**
	 * Validates the WellFormedNsURI constraint of '<em>Src EPackage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSrcEPackage_WellFormedNsURI(SrcEPackage srcEPackage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "WellFormedNsURI", getObjectLabel(srcEPackage, context) },
						 new Object[] { srcEPackage },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the WellFormedNsPrefix constraint of '<em>Src EPackage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSrcEPackage_WellFormedNsPrefix(SrcEPackage srcEPackage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "WellFormedNsPrefix", getObjectLabel(srcEPackage, context) },
						 new Object[] { srcEPackage },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the UniqueSubpackageNames constraint of '<em>Src EPackage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSrcEPackage_UniqueSubpackageNames(SrcEPackage srcEPackage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "UniqueSubpackageNames", getObjectLabel(srcEPackage, context) },
						 new Object[] { srcEPackage },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the UniqueClassifierNames constraint of '<em>Src EPackage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSrcEPackage_UniqueClassifierNames(SrcEPackage srcEPackage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "UniqueClassifierNames", getObjectLabel(srcEPackage, context) },
						 new Object[] { srcEPackage },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the UniqueNsURIs constraint of '<em>Src EPackage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSrcEPackage_UniqueNsURIs(SrcEPackage srcEPackage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "UniqueNsURIs", getObjectLabel(srcEPackage, context) },
						 new Object[] { srcEPackage },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSrcEParameter(SrcEParameter srcEParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(srcEParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(srcEParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(srcEParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(srcEParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(srcEParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(srcEParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(srcEParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(srcEParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(srcEParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateSrcENamedElement_WellFormedName(srcEParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateSrcETypedElement_ValidLowerBound(srcEParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateSrcETypedElement_ValidUpperBound(srcEParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateSrcETypedElement_ConsistentBounds(srcEParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateSrcETypedElement_ValidType(srcEParameter, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSrcEReference(SrcEReference srcEReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(srcEReference, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(srcEReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(srcEReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(srcEReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(srcEReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(srcEReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(srcEReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(srcEReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(srcEReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateSrcENamedElement_WellFormedName(srcEReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateSrcETypedElement_ValidLowerBound(srcEReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateSrcETypedElement_ValidUpperBound(srcEReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateSrcETypedElement_ConsistentBounds(srcEReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateSrcETypedElement_ValidType(srcEReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateSrcEStructuralFeature_ValidDefaultValueLiteral(srcEReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateSrcEReference_ConsistentOpposite(srcEReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateSrcEReference_SingleContainer(srcEReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateSrcEReference_ConsistentKeys(srcEReference, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ConsistentOpposite constraint of '<em>Src EReference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSrcEReference_ConsistentOpposite(SrcEReference srcEReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "ConsistentOpposite", getObjectLabel(srcEReference, context) },
						 new Object[] { srcEReference },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the SingleContainer constraint of '<em>Src EReference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSrcEReference_SingleContainer(SrcEReference srcEReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "SingleContainer", getObjectLabel(srcEReference, context) },
						 new Object[] { srcEReference },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the ConsistentKeys constraint of '<em>Src EReference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSrcEReference_ConsistentKeys(SrcEReference srcEReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "ConsistentKeys", getObjectLabel(srcEReference, context) },
						 new Object[] { srcEReference },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSrcEStructuralFeature(SrcEStructuralFeature srcEStructuralFeature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(srcEStructuralFeature, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(srcEStructuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(srcEStructuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(srcEStructuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(srcEStructuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(srcEStructuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(srcEStructuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(srcEStructuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(srcEStructuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateSrcENamedElement_WellFormedName(srcEStructuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateSrcETypedElement_ValidLowerBound(srcEStructuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateSrcETypedElement_ValidUpperBound(srcEStructuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateSrcETypedElement_ConsistentBounds(srcEStructuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateSrcETypedElement_ValidType(srcEStructuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateSrcEStructuralFeature_ValidDefaultValueLiteral(srcEStructuralFeature, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ValidDefaultValueLiteral constraint of '<em>Src EStructural Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSrcEStructuralFeature_ValidDefaultValueLiteral(SrcEStructuralFeature srcEStructuralFeature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "ValidDefaultValueLiteral", getObjectLabel(srcEStructuralFeature, context) },
						 new Object[] { srcEStructuralFeature },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSrcETypedElement(SrcETypedElement srcETypedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(srcETypedElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(srcETypedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(srcETypedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(srcETypedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(srcETypedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(srcETypedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(srcETypedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(srcETypedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(srcETypedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateSrcENamedElement_WellFormedName(srcETypedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateSrcETypedElement_ValidLowerBound(srcETypedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateSrcETypedElement_ValidUpperBound(srcETypedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateSrcETypedElement_ConsistentBounds(srcETypedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateSrcETypedElement_ValidType(srcETypedElement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ValidLowerBound constraint of '<em>Src ETyped Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSrcETypedElement_ValidLowerBound(SrcETypedElement srcETypedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "ValidLowerBound", getObjectLabel(srcETypedElement, context) },
						 new Object[] { srcETypedElement },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the ValidUpperBound constraint of '<em>Src ETyped Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSrcETypedElement_ValidUpperBound(SrcETypedElement srcETypedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "ValidUpperBound", getObjectLabel(srcETypedElement, context) },
						 new Object[] { srcETypedElement },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the ConsistentBounds constraint of '<em>Src ETyped Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSrcETypedElement_ConsistentBounds(SrcETypedElement srcETypedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "ConsistentBounds", getObjectLabel(srcETypedElement, context) },
						 new Object[] { srcETypedElement },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the ValidType constraint of '<em>Src ETyped Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSrcETypedElement_ValidType(SrcETypedElement srcETypedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "ValidType", getObjectLabel(srcETypedElement, context) },
						 new Object[] { srcETypedElement },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrgMaudeSpec(TrgMaudeSpec trgMaudeSpec, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trgMaudeSpec, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrgMembership(TrgMembership trgMembership, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trgMembership, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrgEquation(TrgEquation trgEquation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trgEquation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrgRule(TrgRule trgRule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trgRule, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrgMembershipCond(TrgMembershipCond trgMembershipCond, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trgMembershipCond, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrgBooleanCond(TrgBooleanCond trgBooleanCond, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trgBooleanCond, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrgMatchingCond(TrgMatchingCond trgMatchingCond, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trgMatchingCond, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrgEqualCond(TrgEqualCond trgEqualCond, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trgEqualCond, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrgMaudeTopEl(TrgMaudeTopEl trgMaudeTopEl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trgMaudeTopEl, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrgModExpression(TrgModExpression trgModExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trgModExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrgInstModExp(TrgInstModExp trgInstModExp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trgInstModExp, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrgRenModExp(TrgRenModExp trgRenModExp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trgRenModExp, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrgCompModExp(TrgCompModExp trgCompModExp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trgCompModExp, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrgModuleIdModExp(TrgModuleIdModExp trgModuleIdModExp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trgModuleIdModExp, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrgTheoryIdModExp(TrgTheoryIdModExp trgTheoryIdModExp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trgTheoryIdModExp, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrgParameter(TrgParameter trgParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trgParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrgTheory(TrgTheory trgTheory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trgTheory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrgFTheory(TrgFTheory trgFTheory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trgFTheory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrgSTheory(TrgSTheory trgSTheory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trgSTheory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrgModule(TrgModule trgModule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trgModule, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrgFModule(TrgFModule trgFModule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trgFModule, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrgSModule(TrgSModule trgSModule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trgSModule, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrgModElement(TrgModElement trgModElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trgModElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrgModImportation(TrgModImportation trgModImportation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trgModImportation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrgType(TrgType trgType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trgType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrgSort(TrgSort trgSort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trgSort, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrgKind(TrgKind trgKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trgKind, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrgSubsortRel(TrgSubsortRel trgSubsortRel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trgSubsortRel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrgOperation(TrgOperation trgOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trgOperation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrgStatement(TrgStatement trgStatement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trgStatement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrgCondition(TrgCondition trgCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trgCondition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrgEquationalCond(TrgEquationalCond trgEquationalCond, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trgEquationalCond, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrgRewriteCond(TrgRewriteCond trgRewriteCond, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trgRewriteCond, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrgTerm(TrgTerm trgTerm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trgTerm, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrgConstant(TrgConstant trgConstant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trgConstant, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrgRecTerm(TrgRecTerm trgRecTerm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trgRecTerm, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrgVariable(TrgVariable trgVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trgVariable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrgView(TrgView trgView, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trgView, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrgViewMapping(TrgViewMapping trgViewMapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trgViewMapping, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrgRenMapping(TrgRenMapping trgRenMapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trgRenMapping, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrgTermMapping(TrgTermMapping trgTermMapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trgTermMapping, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrgSortMapping(TrgSortMapping trgSortMapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trgSortMapping, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrgOpTypedMapping(TrgOpTypedMapping trgOpTypedMapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trgOpTypedMapping, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrgOpMapping(TrgOpMapping trgOpMapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trgOpMapping, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrgLabelMapping(TrgLabelMapping trgLabelMapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trgLabelMapping, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //JointPackage_Ecore2MaudeValidator
