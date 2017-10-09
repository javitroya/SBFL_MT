/**
 */
package jointPackage_Ecore2Maude.impl;

import jointPackage_Ecore2Maude.*;

import org.eclipse.emf.ecore.EClass;
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
public class JointPackage_Ecore2MaudeFactoryImpl extends EFactoryImpl implements JointPackage_Ecore2MaudeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JointPackage_Ecore2MaudeFactory init() {
		try {
			JointPackage_Ecore2MaudeFactory theJointPackage_Ecore2MaudeFactory = (JointPackage_Ecore2MaudeFactory)EPackage.Registry.INSTANCE.getEFactory(JointPackage_Ecore2MaudePackage.eNS_URI);
			if (theJointPackage_Ecore2MaudeFactory != null) {
				return theJointPackage_Ecore2MaudeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JointPackage_Ecore2MaudeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JointPackage_Ecore2MaudeFactoryImpl() {
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
			case JointPackage_Ecore2MaudePackage.JOINT_MM: return createJointMM();
			case JointPackage_Ecore2MaudePackage.SRC_ESTRING_TO_STRING_MAP_ENTRY: return createSrcEStringToStringMapEntry();
			case JointPackage_Ecore2MaudePackage.SRC_EATTRIBUTE: return createSrcEAttribute();
			case JointPackage_Ecore2MaudePackage.SRC_ECLASS: return createSrcEClass();
			case JointPackage_Ecore2MaudePackage.SRC_EDATA_TYPE: return createSrcEDataType();
			case JointPackage_Ecore2MaudePackage.SRC_EENUM: return createSrcEEnum();
			case JointPackage_Ecore2MaudePackage.SRC_EENUM_LITERAL: return createSrcEEnumLiteral();
			case JointPackage_Ecore2MaudePackage.SRC_EOPERATION: return createSrcEOperation();
			case JointPackage_Ecore2MaudePackage.SRC_EPACKAGE: return createSrcEPackage();
			case JointPackage_Ecore2MaudePackage.SRC_EPARAMETER: return createSrcEParameter();
			case JointPackage_Ecore2MaudePackage.SRC_EREFERENCE: return createSrcEReference();
			case JointPackage_Ecore2MaudePackage.TRG_MAUDE_SPEC: return createTrgMaudeSpec();
			case JointPackage_Ecore2MaudePackage.TRG_MEMBERSHIP: return createTrgMembership();
			case JointPackage_Ecore2MaudePackage.TRG_EQUATION: return createTrgEquation();
			case JointPackage_Ecore2MaudePackage.TRG_RULE: return createTrgRule();
			case JointPackage_Ecore2MaudePackage.TRG_MEMBERSHIP_COND: return createTrgMembershipCond();
			case JointPackage_Ecore2MaudePackage.TRG_BOOLEAN_COND: return createTrgBooleanCond();
			case JointPackage_Ecore2MaudePackage.TRG_MATCHING_COND: return createTrgMatchingCond();
			case JointPackage_Ecore2MaudePackage.TRG_EQUAL_COND: return createTrgEqualCond();
			case JointPackage_Ecore2MaudePackage.TRG_INST_MOD_EXP: return createTrgInstModExp();
			case JointPackage_Ecore2MaudePackage.TRG_REN_MOD_EXP: return createTrgRenModExp();
			case JointPackage_Ecore2MaudePackage.TRG_COMP_MOD_EXP: return createTrgCompModExp();
			case JointPackage_Ecore2MaudePackage.TRG_MODULE_ID_MOD_EXP: return createTrgModuleIdModExp();
			case JointPackage_Ecore2MaudePackage.TRG_THEORY_ID_MOD_EXP: return createTrgTheoryIdModExp();
			case JointPackage_Ecore2MaudePackage.TRG_PARAMETER: return createTrgParameter();
			case JointPackage_Ecore2MaudePackage.TRG_FTHEORY: return createTrgFTheory();
			case JointPackage_Ecore2MaudePackage.TRG_STHEORY: return createTrgSTheory();
			case JointPackage_Ecore2MaudePackage.TRG_FMODULE: return createTrgFModule();
			case JointPackage_Ecore2MaudePackage.TRG_SMODULE: return createTrgSModule();
			case JointPackage_Ecore2MaudePackage.TRG_MOD_IMPORTATION: return createTrgModImportation();
			case JointPackage_Ecore2MaudePackage.TRG_SORT: return createTrgSort();
			case JointPackage_Ecore2MaudePackage.TRG_KIND: return createTrgKind();
			case JointPackage_Ecore2MaudePackage.TRG_SUBSORT_REL: return createTrgSubsortRel();
			case JointPackage_Ecore2MaudePackage.TRG_OPERATION: return createTrgOperation();
			case JointPackage_Ecore2MaudePackage.TRG_REWRITE_COND: return createTrgRewriteCond();
			case JointPackage_Ecore2MaudePackage.TRG_CONSTANT: return createTrgConstant();
			case JointPackage_Ecore2MaudePackage.TRG_REC_TERM: return createTrgRecTerm();
			case JointPackage_Ecore2MaudePackage.TRG_VARIABLE: return createTrgVariable();
			case JointPackage_Ecore2MaudePackage.TRG_VIEW: return createTrgView();
			case JointPackage_Ecore2MaudePackage.TRG_TERM_MAPPING: return createTrgTermMapping();
			case JointPackage_Ecore2MaudePackage.TRG_SORT_MAPPING: return createTrgSortMapping();
			case JointPackage_Ecore2MaudePackage.TRG_OP_TYPED_MAPPING: return createTrgOpTypedMapping();
			case JointPackage_Ecore2MaudePackage.TRG_OP_MAPPING: return createTrgOpMapping();
			case JointPackage_Ecore2MaudePackage.TRG_LABEL_MAPPING: return createTrgLabelMapping();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
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
	public SrcEStringToStringMapEntry createSrcEStringToStringMapEntry() {
		SrcEStringToStringMapEntryImpl srcEStringToStringMapEntry = new SrcEStringToStringMapEntryImpl();
		return srcEStringToStringMapEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcEAttribute createSrcEAttribute() {
		SrcEAttributeImpl srcEAttribute = new SrcEAttributeImpl();
		return srcEAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcEClass createSrcEClass() {
		SrcEClassImpl srcEClass = new SrcEClassImpl();
		return srcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcEDataType createSrcEDataType() {
		SrcEDataTypeImpl srcEDataType = new SrcEDataTypeImpl();
		return srcEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcEEnum createSrcEEnum() {
		SrcEEnumImpl srcEEnum = new SrcEEnumImpl();
		return srcEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcEEnumLiteral createSrcEEnumLiteral() {
		SrcEEnumLiteralImpl srcEEnumLiteral = new SrcEEnumLiteralImpl();
		return srcEEnumLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcEOperation createSrcEOperation() {
		SrcEOperationImpl srcEOperation = new SrcEOperationImpl();
		return srcEOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcEPackage createSrcEPackage() {
		SrcEPackageImpl srcEPackage = new SrcEPackageImpl();
		return srcEPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcEParameter createSrcEParameter() {
		SrcEParameterImpl srcEParameter = new SrcEParameterImpl();
		return srcEParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcEReference createSrcEReference() {
		SrcEReferenceImpl srcEReference = new SrcEReferenceImpl();
		return srcEReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgMaudeSpec createTrgMaudeSpec() {
		TrgMaudeSpecImpl trgMaudeSpec = new TrgMaudeSpecImpl();
		return trgMaudeSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgMembership createTrgMembership() {
		TrgMembershipImpl trgMembership = new TrgMembershipImpl();
		return trgMembership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgEquation createTrgEquation() {
		TrgEquationImpl trgEquation = new TrgEquationImpl();
		return trgEquation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgRule createTrgRule() {
		TrgRuleImpl trgRule = new TrgRuleImpl();
		return trgRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgMembershipCond createTrgMembershipCond() {
		TrgMembershipCondImpl trgMembershipCond = new TrgMembershipCondImpl();
		return trgMembershipCond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgBooleanCond createTrgBooleanCond() {
		TrgBooleanCondImpl trgBooleanCond = new TrgBooleanCondImpl();
		return trgBooleanCond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgMatchingCond createTrgMatchingCond() {
		TrgMatchingCondImpl trgMatchingCond = new TrgMatchingCondImpl();
		return trgMatchingCond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgEqualCond createTrgEqualCond() {
		TrgEqualCondImpl trgEqualCond = new TrgEqualCondImpl();
		return trgEqualCond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgInstModExp createTrgInstModExp() {
		TrgInstModExpImpl trgInstModExp = new TrgInstModExpImpl();
		return trgInstModExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgRenModExp createTrgRenModExp() {
		TrgRenModExpImpl trgRenModExp = new TrgRenModExpImpl();
		return trgRenModExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgCompModExp createTrgCompModExp() {
		TrgCompModExpImpl trgCompModExp = new TrgCompModExpImpl();
		return trgCompModExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgModuleIdModExp createTrgModuleIdModExp() {
		TrgModuleIdModExpImpl trgModuleIdModExp = new TrgModuleIdModExpImpl();
		return trgModuleIdModExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgTheoryIdModExp createTrgTheoryIdModExp() {
		TrgTheoryIdModExpImpl trgTheoryIdModExp = new TrgTheoryIdModExpImpl();
		return trgTheoryIdModExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgParameter createTrgParameter() {
		TrgParameterImpl trgParameter = new TrgParameterImpl();
		return trgParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgFTheory createTrgFTheory() {
		TrgFTheoryImpl trgFTheory = new TrgFTheoryImpl();
		return trgFTheory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgSTheory createTrgSTheory() {
		TrgSTheoryImpl trgSTheory = new TrgSTheoryImpl();
		return trgSTheory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgFModule createTrgFModule() {
		TrgFModuleImpl trgFModule = new TrgFModuleImpl();
		return trgFModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgSModule createTrgSModule() {
		TrgSModuleImpl trgSModule = new TrgSModuleImpl();
		return trgSModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgModImportation createTrgModImportation() {
		TrgModImportationImpl trgModImportation = new TrgModImportationImpl();
		return trgModImportation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgSort createTrgSort() {
		TrgSortImpl trgSort = new TrgSortImpl();
		return trgSort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgKind createTrgKind() {
		TrgKindImpl trgKind = new TrgKindImpl();
		return trgKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgSubsortRel createTrgSubsortRel() {
		TrgSubsortRelImpl trgSubsortRel = new TrgSubsortRelImpl();
		return trgSubsortRel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgOperation createTrgOperation() {
		TrgOperationImpl trgOperation = new TrgOperationImpl();
		return trgOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgRewriteCond createTrgRewriteCond() {
		TrgRewriteCondImpl trgRewriteCond = new TrgRewriteCondImpl();
		return trgRewriteCond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgConstant createTrgConstant() {
		TrgConstantImpl trgConstant = new TrgConstantImpl();
		return trgConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgRecTerm createTrgRecTerm() {
		TrgRecTermImpl trgRecTerm = new TrgRecTermImpl();
		return trgRecTerm;
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
	public TrgView createTrgView() {
		TrgViewImpl trgView = new TrgViewImpl();
		return trgView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgTermMapping createTrgTermMapping() {
		TrgTermMappingImpl trgTermMapping = new TrgTermMappingImpl();
		return trgTermMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgSortMapping createTrgSortMapping() {
		TrgSortMappingImpl trgSortMapping = new TrgSortMappingImpl();
		return trgSortMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgOpTypedMapping createTrgOpTypedMapping() {
		TrgOpTypedMappingImpl trgOpTypedMapping = new TrgOpTypedMappingImpl();
		return trgOpTypedMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgOpMapping createTrgOpMapping() {
		TrgOpMappingImpl trgOpMapping = new TrgOpMappingImpl();
		return trgOpMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgLabelMapping createTrgLabelMapping() {
		TrgLabelMappingImpl trgLabelMapping = new TrgLabelMappingImpl();
		return trgLabelMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JointPackage_Ecore2MaudePackage getJointPackage_Ecore2MaudePackage() {
		return (JointPackage_Ecore2MaudePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JointPackage_Ecore2MaudePackage getPackage() {
		return JointPackage_Ecore2MaudePackage.eINSTANCE;
	}

} //JointPackage_Ecore2MaudeFactoryImpl
