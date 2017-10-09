/**
 */
package jointPackage_Ecore2Maude.impl;

import jointPackage_Ecore2Maude.JointMM;
import jointPackage_Ecore2Maude.JointPackage_Ecore2MaudeFactory;
import jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage;
import jointPackage_Ecore2Maude.SrcEAttribute;
import jointPackage_Ecore2Maude.SrcEClass;
import jointPackage_Ecore2Maude.SrcEClassifier;
import jointPackage_Ecore2Maude.SrcEDataType;
import jointPackage_Ecore2Maude.SrcEEnum;
import jointPackage_Ecore2Maude.SrcEEnumLiteral;
import jointPackage_Ecore2Maude.SrcENamedElement;
import jointPackage_Ecore2Maude.SrcEOperation;
import jointPackage_Ecore2Maude.SrcEPackage;
import jointPackage_Ecore2Maude.SrcEParameter;
import jointPackage_Ecore2Maude.SrcEReference;
import jointPackage_Ecore2Maude.SrcEStringToStringMapEntry;
import jointPackage_Ecore2Maude.SrcEStructuralFeature;
import jointPackage_Ecore2Maude.SrcETypedElement;
import jointPackage_Ecore2Maude.TrgBooleanCond;
import jointPackage_Ecore2Maude.TrgCompModExp;
import jointPackage_Ecore2Maude.TrgCondition;
import jointPackage_Ecore2Maude.TrgConstant;
import jointPackage_Ecore2Maude.TrgEqualCond;
import jointPackage_Ecore2Maude.TrgEquation;
import jointPackage_Ecore2Maude.TrgEquationalCond;
import jointPackage_Ecore2Maude.TrgFModule;
import jointPackage_Ecore2Maude.TrgFTheory;
import jointPackage_Ecore2Maude.TrgInstModExp;
import jointPackage_Ecore2Maude.TrgKind;
import jointPackage_Ecore2Maude.TrgLabelMapping;
import jointPackage_Ecore2Maude.TrgMatchingCond;
import jointPackage_Ecore2Maude.TrgMaudeSpec;
import jointPackage_Ecore2Maude.TrgMaudeTopEl;
import jointPackage_Ecore2Maude.TrgMembership;
import jointPackage_Ecore2Maude.TrgMembershipCond;
import jointPackage_Ecore2Maude.TrgModElement;
import jointPackage_Ecore2Maude.TrgModExpression;
import jointPackage_Ecore2Maude.TrgModImportation;
import jointPackage_Ecore2Maude.TrgModule;
import jointPackage_Ecore2Maude.TrgModuleIdModExp;
import jointPackage_Ecore2Maude.TrgOpMapping;
import jointPackage_Ecore2Maude.TrgOpTypedMapping;
import jointPackage_Ecore2Maude.TrgOperation;
import jointPackage_Ecore2Maude.TrgParameter;
import jointPackage_Ecore2Maude.TrgRecTerm;
import jointPackage_Ecore2Maude.TrgRenMapping;
import jointPackage_Ecore2Maude.TrgRenModExp;
import jointPackage_Ecore2Maude.TrgRewriteCond;
import jointPackage_Ecore2Maude.TrgRule;
import jointPackage_Ecore2Maude.TrgSModule;
import jointPackage_Ecore2Maude.TrgSTheory;
import jointPackage_Ecore2Maude.TrgSort;
import jointPackage_Ecore2Maude.TrgSortMapping;
import jointPackage_Ecore2Maude.TrgStatement;
import jointPackage_Ecore2Maude.TrgSubsortRel;
import jointPackage_Ecore2Maude.TrgTerm;
import jointPackage_Ecore2Maude.TrgTermMapping;
import jointPackage_Ecore2Maude.TrgTheory;
import jointPackage_Ecore2Maude.TrgTheoryIdModExp;
import jointPackage_Ecore2Maude.TrgType;
import jointPackage_Ecore2Maude.TrgVariable;
import jointPackage_Ecore2Maude.TrgView;
import jointPackage_Ecore2Maude.TrgViewMapping;

import jointPackage_Ecore2Maude.util.JointPackage_Ecore2MaudeValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JointPackage_Ecore2MaudePackageImpl extends EPackageImpl implements JointPackage_Ecore2MaudePackage {
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
	private EClass srcEStringToStringMapEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcEAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcEClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcEDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcEEnumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcEEnumLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcENamedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcEOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcEPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcEParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcEReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcEStructuralFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcETypedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgMaudeSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgMembershipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgEquationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgMembershipCondEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgBooleanCondEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgMatchingCondEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgEqualCondEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgMaudeTopElEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgModExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgInstModExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgRenModExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgCompModExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgModuleIdModExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgTheoryIdModExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgTheoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgFTheoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgSTheoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgFModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgSModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgModElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgModImportationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgSortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgKindEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgSubsortRelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgOperationEClass = null;

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
	private EClass trgConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgEquationalCondEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgRewriteCondEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgTermEClass = null;

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
	private EClass trgRecTermEClass = null;

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
	private EClass trgViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgViewMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgRenMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgTermMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgSortMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgOpTypedMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgOpMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgLabelMappingEClass = null;

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
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JointPackage_Ecore2MaudePackageImpl() {
		super(eNS_URI, JointPackage_Ecore2MaudeFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link JointPackage_Ecore2MaudePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static JointPackage_Ecore2MaudePackage init() {
		if (isInited) return (JointPackage_Ecore2MaudePackage)EPackage.Registry.INSTANCE.getEPackage(JointPackage_Ecore2MaudePackage.eNS_URI);

		// Obtain or create and register package
		JointPackage_Ecore2MaudePackageImpl theJointPackage_Ecore2MaudePackage = (JointPackage_Ecore2MaudePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof JointPackage_Ecore2MaudePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new JointPackage_Ecore2MaudePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theJointPackage_Ecore2MaudePackage.createPackageContents();

		// Initialize created meta-data
		theJointPackage_Ecore2MaudePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theJointPackage_Ecore2MaudePackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return JointPackage_Ecore2MaudeValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theJointPackage_Ecore2MaudePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(JointPackage_Ecore2MaudePackage.eNS_URI, theJointPackage_Ecore2MaudePackage);
		return theJointPackage_Ecore2MaudePackage;
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
	public EClass getSrcEStringToStringMapEntry() {
		return srcEStringToStringMapEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcEStringToStringMapEntry_Key() {
		return (EAttribute)srcEStringToStringMapEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcEStringToStringMapEntry_Value() {
		return (EAttribute)srcEStringToStringMapEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcEAttribute() {
		return srcEAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcEAttribute_ID() {
		return (EAttribute)srcEAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSrcEAttribute_EAttributeType() {
		return (EReference)srcEAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcEClass() {
		return srcEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcEClass_Abstract() {
		return (EAttribute)srcEClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcEClass_Interface() {
		return (EAttribute)srcEClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSrcEClass_ESuperTypes() {
		return (EReference)srcEClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSrcEClass_EOperations() {
		return (EReference)srcEClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSrcEClass_EAllAttributes() {
		return (EReference)srcEClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSrcEClass_EAllReferences() {
		return (EReference)srcEClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSrcEClass_EReferences() {
		return (EReference)srcEClassEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSrcEClass_EAttributes() {
		return (EReference)srcEClassEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSrcEClass_EAllContainments() {
		return (EReference)srcEClassEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSrcEClass_EAllOperations() {
		return (EReference)srcEClassEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSrcEClass_EAllStructuralFeatures() {
		return (EReference)srcEClassEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSrcEClass_EAllSuperTypes() {
		return (EReference)srcEClassEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSrcEClass_EIDAttribute() {
		return (EReference)srcEClassEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSrcEClass_EStructuralFeatures() {
		return (EReference)srcEClassEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSrcEClass__IsSuperTypeOf__SrcEClass() {
		return srcEClassEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSrcEClass__GetFeatureCount() {
		return srcEClassEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSrcEClass__GetEStructuralFeature__int() {
		return srcEClassEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSrcEClass__GetFeatureID__SrcEStructuralFeature() {
		return srcEClassEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSrcEClass__GetEStructuralFeature__String() {
		return srcEClassEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcEClassifier() {
		return srcEClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcEClassifier_InstanceClassName() {
		return (EAttribute)srcEClassifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcEClassifier_InstanceTypeName() {
		return (EAttribute)srcEClassifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSrcEClassifier_EPackage() {
		return (EReference)srcEClassifierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSrcEClassifier__GetClassifierID() {
		return srcEClassifierEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcEDataType() {
		return srcEDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcEDataType_Serializable() {
		return (EAttribute)srcEDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcEEnum() {
		return srcEEnumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSrcEEnum_ELiterals() {
		return (EReference)srcEEnumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSrcEEnum__GetEEnumLiteral__String() {
		return srcEEnumEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSrcEEnum__GetEEnumLiteral__int() {
		return srcEEnumEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSrcEEnum__GetEEnumLiteralByLiteral__String() {
		return srcEEnumEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcEEnumLiteral() {
		return srcEEnumLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcEEnumLiteral_Value() {
		return (EAttribute)srcEEnumLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcEEnumLiteral_Literal() {
		return (EAttribute)srcEEnumLiteralEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSrcEEnumLiteral_EEnum() {
		return (EReference)srcEEnumLiteralEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcENamedElement() {
		return srcENamedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcENamedElement_Name() {
		return (EAttribute)srcENamedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcEOperation() {
		return srcEOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSrcEOperation_EContainingClass() {
		return (EReference)srcEOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSrcEOperation_EParameters() {
		return (EReference)srcEOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSrcEOperation_EExceptions() {
		return (EReference)srcEOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcEPackage() {
		return srcEPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcEPackage_NsURI() {
		return (EAttribute)srcEPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcEPackage_NsPrefix() {
		return (EAttribute)srcEPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSrcEPackage_EClassifiers() {
		return (EReference)srcEPackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSrcEPackage_ESubpackages() {
		return (EReference)srcEPackageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSrcEPackage_ESuperPackage() {
		return (EReference)srcEPackageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSrcEPackage__GetEClassifier__String() {
		return srcEPackageEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcEParameter() {
		return srcEParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSrcEParameter_EOperation() {
		return (EReference)srcEParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcEReference() {
		return srcEReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcEReference_Containment() {
		return (EAttribute)srcEReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcEReference_Container() {
		return (EAttribute)srcEReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcEReference_ResolveProxies() {
		return (EAttribute)srcEReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSrcEReference_EOpposite() {
		return (EReference)srcEReferenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSrcEReference_EReferenceType() {
		return (EReference)srcEReferenceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSrcEReference_EKeys() {
		return (EReference)srcEReferenceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcEStructuralFeature() {
		return srcEStructuralFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcEStructuralFeature_Changeable() {
		return (EAttribute)srcEStructuralFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcEStructuralFeature_Volatile() {
		return (EAttribute)srcEStructuralFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcEStructuralFeature_Transient() {
		return (EAttribute)srcEStructuralFeatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcEStructuralFeature_DefaultValueLiteral() {
		return (EAttribute)srcEStructuralFeatureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcEStructuralFeature_Unsettable() {
		return (EAttribute)srcEStructuralFeatureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcEStructuralFeature_Derived() {
		return (EAttribute)srcEStructuralFeatureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSrcEStructuralFeature_EContainingClass() {
		return (EReference)srcEStructuralFeatureEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSrcEStructuralFeature__GetFeatureID() {
		return srcEStructuralFeatureEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcETypedElement() {
		return srcETypedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcETypedElement_Ordered() {
		return (EAttribute)srcETypedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcETypedElement_Unique() {
		return (EAttribute)srcETypedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcETypedElement_LowerBound() {
		return (EAttribute)srcETypedElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcETypedElement_UpperBound() {
		return (EAttribute)srcETypedElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcETypedElement_Many() {
		return (EAttribute)srcETypedElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcETypedElement_Required() {
		return (EAttribute)srcETypedElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSrcETypedElement_EType() {
		return (EReference)srcETypedElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgMaudeSpec() {
		return trgMaudeSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgMaudeSpec_Els() {
		return (EReference)trgMaudeSpecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgMaudeSpec_PrintableEls() {
		return (EReference)trgMaudeSpecEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgMembership() {
		return trgMembershipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgMembership_Term() {
		return (EReference)trgMembershipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgMembership_Sort() {
		return (EReference)trgMembershipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgEquation() {
		return trgEquationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgEquation_Lhs() {
		return (EReference)trgEquationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgEquation_Rhs() {
		return (EReference)trgEquationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgRule() {
		return trgRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgRule_Lhs() {
		return (EReference)trgRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgRule_Rhs() {
		return (EReference)trgRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgMembershipCond() {
		return trgMembershipCondEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgMembershipCond_Rhs() {
		return (EReference)trgMembershipCondEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgBooleanCond() {
		return trgBooleanCondEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgMatchingCond() {
		return trgMatchingCondEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgMatchingCond_Rhs() {
		return (EReference)trgMatchingCondEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgEqualCond() {
		return trgEqualCondEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgEqualCond_Rhs() {
		return (EReference)trgEqualCondEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgMaudeTopEl() {
		return trgMaudeTopElEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrgMaudeTopEl_Name() {
		return (EAttribute)trgMaudeTopElEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgModExpression() {
		return trgModExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgInstModExp() {
		return trgInstModExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgInstModExp_ModExp() {
		return (EReference)trgInstModExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgInstModExp_Views() {
		return (EReference)trgInstModExpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgRenModExp() {
		return trgRenModExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgRenModExp_ModExp() {
		return (EReference)trgRenModExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgRenModExp_Renamings() {
		return (EReference)trgRenModExpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgCompModExp() {
		return trgCompModExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgCompModExp_ModExps() {
		return (EReference)trgCompModExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgModuleIdModExp() {
		return trgModuleIdModExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgModuleIdModExp_Module() {
		return (EReference)trgModuleIdModExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgTheoryIdModExp() {
		return trgTheoryIdModExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgTheoryIdModExp_Theory() {
		return (EReference)trgTheoryIdModExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgParameter() {
		return trgParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrgParameter_Label() {
		return (EAttribute)trgParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgParameter_ModExp() {
		return (EReference)trgParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgTheory() {
		return trgTheoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgTheory_Els() {
		return (EReference)trgTheoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgFTheory() {
		return trgFTheoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgSTheory() {
		return trgSTheoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgModule() {
		return trgModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgModule_Els() {
		return (EReference)trgModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgModule_Params() {
		return (EReference)trgModuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgFModule() {
		return trgFModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgSModule() {
		return trgSModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgModElement() {
		return trgModElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgModElement_Module() {
		return (EReference)trgModElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgModElement_Theory() {
		return (EReference)trgModElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgModImportation() {
		return trgModImportationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgModImportation_Imports() {
		return (EReference)trgModImportationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgType() {
		return trgTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrgType_Name() {
		return (EAttribute)trgTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgSort() {
		return trgSortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgSort_SubsortRels() {
		return (EReference)trgSortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgSort_SupersortRels() {
		return (EReference)trgSortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgSort_Kind() {
		return (EReference)trgSortEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgKind() {
		return trgKindEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgKind_Sorts() {
		return (EReference)trgKindEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgSubsortRel() {
		return trgSubsortRelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgSubsortRel_Subsorts() {
		return (EReference)trgSubsortRelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgSubsortRel_Supersorts() {
		return (EReference)trgSubsortRelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgOperation() {
		return trgOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrgOperation_Name() {
		return (EAttribute)trgOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgOperation_Coarity() {
		return (EReference)trgOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgOperation_Arity() {
		return (EReference)trgOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrgOperation_Atts() {
		return (EAttribute)trgOperationEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getTrgStatement_Label() {
		return (EAttribute)trgStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrgStatement_Atts() {
		return (EAttribute)trgStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgStatement_Conds() {
		return (EReference)trgStatementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgCondition() {
		return trgConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgCondition_Lhs() {
		return (EReference)trgConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgEquationalCond() {
		return trgEquationalCondEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgRewriteCond() {
		return trgRewriteCondEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgRewriteCond_Rhs() {
		return (EReference)trgRewriteCondEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgTerm() {
		return trgTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgTerm_Type() {
		return (EReference)trgTermEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getTrgConstant_Op() {
		return (EAttribute)trgConstantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgRecTerm() {
		return trgRecTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrgRecTerm_Op() {
		return (EAttribute)trgRecTermEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgRecTerm_Args() {
		return (EReference)trgRecTermEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getTrgVariable_Name() {
		return (EAttribute)trgVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgView() {
		return trgViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgView_From() {
		return (EReference)trgViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgView_To() {
		return (EReference)trgViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgView_Els() {
		return (EReference)trgViewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgViewMapping() {
		return trgViewMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgRenMapping() {
		return trgRenMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgTermMapping() {
		return trgTermMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgTermMapping_From() {
		return (EReference)trgTermMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgTermMapping_To() {
		return (EReference)trgTermMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgSortMapping() {
		return trgSortMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgSortMapping_From() {
		return (EReference)trgSortMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrgSortMapping_To() {
		return (EAttribute)trgSortMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgOpTypedMapping() {
		return trgOpTypedMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgOpTypedMapping_From() {
		return (EReference)trgOpTypedMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrgOpTypedMapping_To() {
		return (EAttribute)trgOpTypedMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrgOpTypedMapping_Atts() {
		return (EAttribute)trgOpTypedMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgOpMapping() {
		return trgOpMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgOpMapping_From() {
		return (EReference)trgOpMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrgOpMapping_To() {
		return (EAttribute)trgOpMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgLabelMapping() {
		return trgLabelMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrgLabelMapping_From() {
		return (EAttribute)trgLabelMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrgLabelMapping_To() {
		return (EAttribute)trgLabelMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JointPackage_Ecore2MaudeFactory getJointPackage_Ecore2MaudeFactory() {
		return (JointPackage_Ecore2MaudeFactory)getEFactoryInstance();
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

		srcEStringToStringMapEntryEClass = createEClass(SRC_ESTRING_TO_STRING_MAP_ENTRY);
		createEAttribute(srcEStringToStringMapEntryEClass, SRC_ESTRING_TO_STRING_MAP_ENTRY__KEY);
		createEAttribute(srcEStringToStringMapEntryEClass, SRC_ESTRING_TO_STRING_MAP_ENTRY__VALUE);

		srcEAttributeEClass = createEClass(SRC_EATTRIBUTE);
		createEAttribute(srcEAttributeEClass, SRC_EATTRIBUTE__ID);
		createEReference(srcEAttributeEClass, SRC_EATTRIBUTE__EATTRIBUTE_TYPE);

		srcEClassEClass = createEClass(SRC_ECLASS);
		createEAttribute(srcEClassEClass, SRC_ECLASS__ABSTRACT);
		createEAttribute(srcEClassEClass, SRC_ECLASS__INTERFACE);
		createEReference(srcEClassEClass, SRC_ECLASS__ESUPER_TYPES);
		createEReference(srcEClassEClass, SRC_ECLASS__EOPERATIONS);
		createEReference(srcEClassEClass, SRC_ECLASS__EALL_ATTRIBUTES);
		createEReference(srcEClassEClass, SRC_ECLASS__EALL_REFERENCES);
		createEReference(srcEClassEClass, SRC_ECLASS__EREFERENCES);
		createEReference(srcEClassEClass, SRC_ECLASS__EATTRIBUTES);
		createEReference(srcEClassEClass, SRC_ECLASS__EALL_CONTAINMENTS);
		createEReference(srcEClassEClass, SRC_ECLASS__EALL_OPERATIONS);
		createEReference(srcEClassEClass, SRC_ECLASS__EALL_STRUCTURAL_FEATURES);
		createEReference(srcEClassEClass, SRC_ECLASS__EALL_SUPER_TYPES);
		createEReference(srcEClassEClass, SRC_ECLASS__EID_ATTRIBUTE);
		createEReference(srcEClassEClass, SRC_ECLASS__ESTRUCTURAL_FEATURES);
		createEOperation(srcEClassEClass, SRC_ECLASS___IS_SUPER_TYPE_OF__SRCECLASS);
		createEOperation(srcEClassEClass, SRC_ECLASS___GET_FEATURE_COUNT);
		createEOperation(srcEClassEClass, SRC_ECLASS___GET_ESTRUCTURAL_FEATURE__INT);
		createEOperation(srcEClassEClass, SRC_ECLASS___GET_FEATURE_ID__SRCESTRUCTURALFEATURE);
		createEOperation(srcEClassEClass, SRC_ECLASS___GET_ESTRUCTURAL_FEATURE__STRING);

		srcEClassifierEClass = createEClass(SRC_ECLASSIFIER);
		createEAttribute(srcEClassifierEClass, SRC_ECLASSIFIER__INSTANCE_CLASS_NAME);
		createEAttribute(srcEClassifierEClass, SRC_ECLASSIFIER__INSTANCE_TYPE_NAME);
		createEReference(srcEClassifierEClass, SRC_ECLASSIFIER__EPACKAGE);
		createEOperation(srcEClassifierEClass, SRC_ECLASSIFIER___GET_CLASSIFIER_ID);

		srcEDataTypeEClass = createEClass(SRC_EDATA_TYPE);
		createEAttribute(srcEDataTypeEClass, SRC_EDATA_TYPE__SERIALIZABLE);

		srcEEnumEClass = createEClass(SRC_EENUM);
		createEReference(srcEEnumEClass, SRC_EENUM__ELITERALS);
		createEOperation(srcEEnumEClass, SRC_EENUM___GET_EENUM_LITERAL__STRING);
		createEOperation(srcEEnumEClass, SRC_EENUM___GET_EENUM_LITERAL__INT);
		createEOperation(srcEEnumEClass, SRC_EENUM___GET_EENUM_LITERAL_BY_LITERAL__STRING);

		srcEEnumLiteralEClass = createEClass(SRC_EENUM_LITERAL);
		createEAttribute(srcEEnumLiteralEClass, SRC_EENUM_LITERAL__VALUE);
		createEAttribute(srcEEnumLiteralEClass, SRC_EENUM_LITERAL__LITERAL);
		createEReference(srcEEnumLiteralEClass, SRC_EENUM_LITERAL__EENUM);

		srcENamedElementEClass = createEClass(SRC_ENAMED_ELEMENT);
		createEAttribute(srcENamedElementEClass, SRC_ENAMED_ELEMENT__NAME);

		srcEOperationEClass = createEClass(SRC_EOPERATION);
		createEReference(srcEOperationEClass, SRC_EOPERATION__ECONTAINING_CLASS);
		createEReference(srcEOperationEClass, SRC_EOPERATION__EPARAMETERS);
		createEReference(srcEOperationEClass, SRC_EOPERATION__EEXCEPTIONS);

		srcEPackageEClass = createEClass(SRC_EPACKAGE);
		createEAttribute(srcEPackageEClass, SRC_EPACKAGE__NS_URI);
		createEAttribute(srcEPackageEClass, SRC_EPACKAGE__NS_PREFIX);
		createEReference(srcEPackageEClass, SRC_EPACKAGE__ECLASSIFIERS);
		createEReference(srcEPackageEClass, SRC_EPACKAGE__ESUBPACKAGES);
		createEReference(srcEPackageEClass, SRC_EPACKAGE__ESUPER_PACKAGE);
		createEOperation(srcEPackageEClass, SRC_EPACKAGE___GET_ECLASSIFIER__STRING);

		srcEParameterEClass = createEClass(SRC_EPARAMETER);
		createEReference(srcEParameterEClass, SRC_EPARAMETER__EOPERATION);

		srcEReferenceEClass = createEClass(SRC_EREFERENCE);
		createEAttribute(srcEReferenceEClass, SRC_EREFERENCE__CONTAINMENT);
		createEAttribute(srcEReferenceEClass, SRC_EREFERENCE__CONTAINER);
		createEAttribute(srcEReferenceEClass, SRC_EREFERENCE__RESOLVE_PROXIES);
		createEReference(srcEReferenceEClass, SRC_EREFERENCE__EOPPOSITE);
		createEReference(srcEReferenceEClass, SRC_EREFERENCE__EREFERENCE_TYPE);
		createEReference(srcEReferenceEClass, SRC_EREFERENCE__EKEYS);

		srcEStructuralFeatureEClass = createEClass(SRC_ESTRUCTURAL_FEATURE);
		createEAttribute(srcEStructuralFeatureEClass, SRC_ESTRUCTURAL_FEATURE__CHANGEABLE);
		createEAttribute(srcEStructuralFeatureEClass, SRC_ESTRUCTURAL_FEATURE__VOLATILE);
		createEAttribute(srcEStructuralFeatureEClass, SRC_ESTRUCTURAL_FEATURE__TRANSIENT);
		createEAttribute(srcEStructuralFeatureEClass, SRC_ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL);
		createEAttribute(srcEStructuralFeatureEClass, SRC_ESTRUCTURAL_FEATURE__UNSETTABLE);
		createEAttribute(srcEStructuralFeatureEClass, SRC_ESTRUCTURAL_FEATURE__DERIVED);
		createEReference(srcEStructuralFeatureEClass, SRC_ESTRUCTURAL_FEATURE__ECONTAINING_CLASS);
		createEOperation(srcEStructuralFeatureEClass, SRC_ESTRUCTURAL_FEATURE___GET_FEATURE_ID);

		srcETypedElementEClass = createEClass(SRC_ETYPED_ELEMENT);
		createEAttribute(srcETypedElementEClass, SRC_ETYPED_ELEMENT__ORDERED);
		createEAttribute(srcETypedElementEClass, SRC_ETYPED_ELEMENT__UNIQUE);
		createEAttribute(srcETypedElementEClass, SRC_ETYPED_ELEMENT__LOWER_BOUND);
		createEAttribute(srcETypedElementEClass, SRC_ETYPED_ELEMENT__UPPER_BOUND);
		createEAttribute(srcETypedElementEClass, SRC_ETYPED_ELEMENT__MANY);
		createEAttribute(srcETypedElementEClass, SRC_ETYPED_ELEMENT__REQUIRED);
		createEReference(srcETypedElementEClass, SRC_ETYPED_ELEMENT__ETYPE);

		trgMaudeSpecEClass = createEClass(TRG_MAUDE_SPEC);
		createEReference(trgMaudeSpecEClass, TRG_MAUDE_SPEC__ELS);
		createEReference(trgMaudeSpecEClass, TRG_MAUDE_SPEC__PRINTABLE_ELS);

		trgMembershipEClass = createEClass(TRG_MEMBERSHIP);
		createEReference(trgMembershipEClass, TRG_MEMBERSHIP__TERM);
		createEReference(trgMembershipEClass, TRG_MEMBERSHIP__SORT);

		trgEquationEClass = createEClass(TRG_EQUATION);
		createEReference(trgEquationEClass, TRG_EQUATION__LHS);
		createEReference(trgEquationEClass, TRG_EQUATION__RHS);

		trgRuleEClass = createEClass(TRG_RULE);
		createEReference(trgRuleEClass, TRG_RULE__LHS);
		createEReference(trgRuleEClass, TRG_RULE__RHS);

		trgMembershipCondEClass = createEClass(TRG_MEMBERSHIP_COND);
		createEReference(trgMembershipCondEClass, TRG_MEMBERSHIP_COND__RHS);

		trgBooleanCondEClass = createEClass(TRG_BOOLEAN_COND);

		trgMatchingCondEClass = createEClass(TRG_MATCHING_COND);
		createEReference(trgMatchingCondEClass, TRG_MATCHING_COND__RHS);

		trgEqualCondEClass = createEClass(TRG_EQUAL_COND);
		createEReference(trgEqualCondEClass, TRG_EQUAL_COND__RHS);

		trgMaudeTopElEClass = createEClass(TRG_MAUDE_TOP_EL);
		createEAttribute(trgMaudeTopElEClass, TRG_MAUDE_TOP_EL__NAME);

		trgModExpressionEClass = createEClass(TRG_MOD_EXPRESSION);

		trgInstModExpEClass = createEClass(TRG_INST_MOD_EXP);
		createEReference(trgInstModExpEClass, TRG_INST_MOD_EXP__MOD_EXP);
		createEReference(trgInstModExpEClass, TRG_INST_MOD_EXP__VIEWS);

		trgRenModExpEClass = createEClass(TRG_REN_MOD_EXP);
		createEReference(trgRenModExpEClass, TRG_REN_MOD_EXP__MOD_EXP);
		createEReference(trgRenModExpEClass, TRG_REN_MOD_EXP__RENAMINGS);

		trgCompModExpEClass = createEClass(TRG_COMP_MOD_EXP);
		createEReference(trgCompModExpEClass, TRG_COMP_MOD_EXP__MOD_EXPS);

		trgModuleIdModExpEClass = createEClass(TRG_MODULE_ID_MOD_EXP);
		createEReference(trgModuleIdModExpEClass, TRG_MODULE_ID_MOD_EXP__MODULE);

		trgTheoryIdModExpEClass = createEClass(TRG_THEORY_ID_MOD_EXP);
		createEReference(trgTheoryIdModExpEClass, TRG_THEORY_ID_MOD_EXP__THEORY);

		trgParameterEClass = createEClass(TRG_PARAMETER);
		createEAttribute(trgParameterEClass, TRG_PARAMETER__LABEL);
		createEReference(trgParameterEClass, TRG_PARAMETER__MOD_EXP);

		trgTheoryEClass = createEClass(TRG_THEORY);
		createEReference(trgTheoryEClass, TRG_THEORY__ELS);

		trgFTheoryEClass = createEClass(TRG_FTHEORY);

		trgSTheoryEClass = createEClass(TRG_STHEORY);

		trgModuleEClass = createEClass(TRG_MODULE);
		createEReference(trgModuleEClass, TRG_MODULE__ELS);
		createEReference(trgModuleEClass, TRG_MODULE__PARAMS);

		trgFModuleEClass = createEClass(TRG_FMODULE);

		trgSModuleEClass = createEClass(TRG_SMODULE);

		trgModElementEClass = createEClass(TRG_MOD_ELEMENT);
		createEReference(trgModElementEClass, TRG_MOD_ELEMENT__MODULE);
		createEReference(trgModElementEClass, TRG_MOD_ELEMENT__THEORY);

		trgModImportationEClass = createEClass(TRG_MOD_IMPORTATION);
		createEReference(trgModImportationEClass, TRG_MOD_IMPORTATION__IMPORTS);

		trgTypeEClass = createEClass(TRG_TYPE);
		createEAttribute(trgTypeEClass, TRG_TYPE__NAME);

		trgSortEClass = createEClass(TRG_SORT);
		createEReference(trgSortEClass, TRG_SORT__SUBSORT_RELS);
		createEReference(trgSortEClass, TRG_SORT__SUPERSORT_RELS);
		createEReference(trgSortEClass, TRG_SORT__KIND);

		trgKindEClass = createEClass(TRG_KIND);
		createEReference(trgKindEClass, TRG_KIND__SORTS);

		trgSubsortRelEClass = createEClass(TRG_SUBSORT_REL);
		createEReference(trgSubsortRelEClass, TRG_SUBSORT_REL__SUBSORTS);
		createEReference(trgSubsortRelEClass, TRG_SUBSORT_REL__SUPERSORTS);

		trgOperationEClass = createEClass(TRG_OPERATION);
		createEAttribute(trgOperationEClass, TRG_OPERATION__NAME);
		createEReference(trgOperationEClass, TRG_OPERATION__COARITY);
		createEReference(trgOperationEClass, TRG_OPERATION__ARITY);
		createEAttribute(trgOperationEClass, TRG_OPERATION__ATTS);

		trgStatementEClass = createEClass(TRG_STATEMENT);
		createEAttribute(trgStatementEClass, TRG_STATEMENT__LABEL);
		createEAttribute(trgStatementEClass, TRG_STATEMENT__ATTS);
		createEReference(trgStatementEClass, TRG_STATEMENT__CONDS);

		trgConditionEClass = createEClass(TRG_CONDITION);
		createEReference(trgConditionEClass, TRG_CONDITION__LHS);

		trgEquationalCondEClass = createEClass(TRG_EQUATIONAL_COND);

		trgRewriteCondEClass = createEClass(TRG_REWRITE_COND);
		createEReference(trgRewriteCondEClass, TRG_REWRITE_COND__RHS);

		trgTermEClass = createEClass(TRG_TERM);
		createEReference(trgTermEClass, TRG_TERM__TYPE);

		trgConstantEClass = createEClass(TRG_CONSTANT);
		createEAttribute(trgConstantEClass, TRG_CONSTANT__OP);

		trgRecTermEClass = createEClass(TRG_REC_TERM);
		createEAttribute(trgRecTermEClass, TRG_REC_TERM__OP);
		createEReference(trgRecTermEClass, TRG_REC_TERM__ARGS);

		trgVariableEClass = createEClass(TRG_VARIABLE);
		createEAttribute(trgVariableEClass, TRG_VARIABLE__NAME);

		trgViewEClass = createEClass(TRG_VIEW);
		createEReference(trgViewEClass, TRG_VIEW__FROM);
		createEReference(trgViewEClass, TRG_VIEW__TO);
		createEReference(trgViewEClass, TRG_VIEW__ELS);

		trgViewMappingEClass = createEClass(TRG_VIEW_MAPPING);

		trgRenMappingEClass = createEClass(TRG_REN_MAPPING);

		trgTermMappingEClass = createEClass(TRG_TERM_MAPPING);
		createEReference(trgTermMappingEClass, TRG_TERM_MAPPING__FROM);
		createEReference(trgTermMappingEClass, TRG_TERM_MAPPING__TO);

		trgSortMappingEClass = createEClass(TRG_SORT_MAPPING);
		createEReference(trgSortMappingEClass, TRG_SORT_MAPPING__FROM);
		createEAttribute(trgSortMappingEClass, TRG_SORT_MAPPING__TO);

		trgOpTypedMappingEClass = createEClass(TRG_OP_TYPED_MAPPING);
		createEReference(trgOpTypedMappingEClass, TRG_OP_TYPED_MAPPING__FROM);
		createEAttribute(trgOpTypedMappingEClass, TRG_OP_TYPED_MAPPING__TO);
		createEAttribute(trgOpTypedMappingEClass, TRG_OP_TYPED_MAPPING__ATTS);

		trgOpMappingEClass = createEClass(TRG_OP_MAPPING);
		createEReference(trgOpMappingEClass, TRG_OP_MAPPING__FROM);
		createEAttribute(trgOpMappingEClass, TRG_OP_MAPPING__TO);

		trgLabelMappingEClass = createEClass(TRG_LABEL_MAPPING);
		createEAttribute(trgLabelMappingEClass, TRG_LABEL_MAPPING__FROM);
		createEAttribute(trgLabelMappingEClass, TRG_LABEL_MAPPING__TO);
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
		srcEAttributeEClass.getESuperTypes().add(this.getSrcEStructuralFeature());
		srcEClassEClass.getESuperTypes().add(this.getSrcEClassifier());
		srcEClassifierEClass.getESuperTypes().add(this.getSrcENamedElement());
		srcEDataTypeEClass.getESuperTypes().add(this.getSrcEClassifier());
		srcEEnumEClass.getESuperTypes().add(this.getSrcEDataType());
		srcEEnumLiteralEClass.getESuperTypes().add(this.getSrcENamedElement());
		srcEOperationEClass.getESuperTypes().add(this.getSrcETypedElement());
		srcEPackageEClass.getESuperTypes().add(this.getSrcENamedElement());
		srcEParameterEClass.getESuperTypes().add(this.getSrcETypedElement());
		srcEReferenceEClass.getESuperTypes().add(this.getSrcEStructuralFeature());
		srcEStructuralFeatureEClass.getESuperTypes().add(this.getSrcETypedElement());
		srcETypedElementEClass.getESuperTypes().add(this.getSrcENamedElement());
		trgMembershipEClass.getESuperTypes().add(this.getTrgStatement());
		trgEquationEClass.getESuperTypes().add(this.getTrgStatement());
		trgRuleEClass.getESuperTypes().add(this.getTrgStatement());
		trgMembershipCondEClass.getESuperTypes().add(this.getTrgEquationalCond());
		trgBooleanCondEClass.getESuperTypes().add(this.getTrgEquationalCond());
		trgMatchingCondEClass.getESuperTypes().add(this.getTrgEquationalCond());
		trgEqualCondEClass.getESuperTypes().add(this.getTrgEquationalCond());
		trgInstModExpEClass.getESuperTypes().add(this.getTrgModExpression());
		trgRenModExpEClass.getESuperTypes().add(this.getTrgModExpression());
		trgCompModExpEClass.getESuperTypes().add(this.getTrgModExpression());
		trgModuleIdModExpEClass.getESuperTypes().add(this.getTrgModExpression());
		trgTheoryIdModExpEClass.getESuperTypes().add(this.getTrgModExpression());
		trgParameterEClass.getESuperTypes().add(this.getTrgModExpression());
		trgTheoryEClass.getESuperTypes().add(this.getTrgMaudeTopEl());
		trgFTheoryEClass.getESuperTypes().add(this.getTrgTheory());
		trgSTheoryEClass.getESuperTypes().add(this.getTrgTheory());
		trgModuleEClass.getESuperTypes().add(this.getTrgMaudeTopEl());
		trgFModuleEClass.getESuperTypes().add(this.getTrgModule());
		trgSModuleEClass.getESuperTypes().add(this.getTrgModule());
		trgModImportationEClass.getESuperTypes().add(this.getTrgModElement());
		trgSortEClass.getESuperTypes().add(this.getTrgType());
		trgSortEClass.getESuperTypes().add(this.getTrgModElement());
		trgKindEClass.getESuperTypes().add(this.getTrgType());
		trgSubsortRelEClass.getESuperTypes().add(this.getTrgModElement());
		trgOperationEClass.getESuperTypes().add(this.getTrgModElement());
		trgStatementEClass.getESuperTypes().add(this.getTrgModElement());
		trgEquationalCondEClass.getESuperTypes().add(this.getTrgCondition());
		trgRewriteCondEClass.getESuperTypes().add(this.getTrgCondition());
		trgConstantEClass.getESuperTypes().add(this.getTrgTerm());
		trgRecTermEClass.getESuperTypes().add(this.getTrgTerm());
		trgVariableEClass.getESuperTypes().add(this.getTrgTerm());
		trgViewEClass.getESuperTypes().add(this.getTrgMaudeTopEl());
		trgRenMappingEClass.getESuperTypes().add(this.getTrgViewMapping());
		trgTermMappingEClass.getESuperTypes().add(this.getTrgViewMapping());
		trgSortMappingEClass.getESuperTypes().add(this.getTrgRenMapping());
		trgOpTypedMappingEClass.getESuperTypes().add(this.getTrgRenMapping());
		trgOpMappingEClass.getESuperTypes().add(this.getTrgRenMapping());
		trgLabelMappingEClass.getESuperTypes().add(this.getTrgRenMapping());

		// Initialize classes, features, and operations; add parameters
		initEClass(jointMMEClass, JointMM.class, "JointMM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJointMM_SourceRoot(), this.getSrcEStringToStringMapEntry(), null, "sourceRoot", null, 1, 1, JointMM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJointMM_TargetRoot(), this.getTrgEqualCond(), null, "targetRoot", null, 1, 1, JointMM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(srcEStringToStringMapEntryEClass, SrcEStringToStringMapEntry.class, "SrcEStringToStringMapEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSrcEStringToStringMapEntry_Key(), ecorePackage.getEString(), "key", null, 0, 1, SrcEStringToStringMapEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSrcEStringToStringMapEntry_Value(), ecorePackage.getEString(), "value", null, 0, 1, SrcEStringToStringMapEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(srcEAttributeEClass, SrcEAttribute.class, "SrcEAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSrcEAttribute_ID(), ecorePackage.getEBoolean(), "iD", null, 0, 1, SrcEAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSrcEAttribute_EAttributeType(), this.getSrcEDataType(), null, "eAttributeType", null, 0, 1, SrcEAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(srcEClassEClass, SrcEClass.class, "SrcEClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSrcEClass_Abstract(), ecorePackage.getEBoolean(), "abstract", null, 0, 1, SrcEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSrcEClass_Interface(), ecorePackage.getEBoolean(), "interface", null, 0, 1, SrcEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSrcEClass_ESuperTypes(), this.getSrcEClass(), null, "eSuperTypes", null, 0, -1, SrcEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSrcEClass_EOperations(), this.getSrcEOperation(), this.getSrcEOperation_EContainingClass(), "eOperations", null, 0, -1, SrcEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSrcEClass_EAllAttributes(), this.getSrcEAttribute(), null, "eAllAttributes", null, 0, -1, SrcEClass.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSrcEClass_EAllReferences(), this.getSrcEReference(), null, "eAllReferences", null, 0, -1, SrcEClass.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSrcEClass_EReferences(), this.getSrcEReference(), null, "eReferences", null, 0, -1, SrcEClass.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSrcEClass_EAttributes(), this.getSrcEAttribute(), null, "eAttributes", null, 0, -1, SrcEClass.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSrcEClass_EAllContainments(), this.getSrcEReference(), null, "eAllContainments", null, 0, -1, SrcEClass.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSrcEClass_EAllOperations(), this.getSrcEOperation(), null, "eAllOperations", null, 0, -1, SrcEClass.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSrcEClass_EAllStructuralFeatures(), this.getSrcEStructuralFeature(), null, "eAllStructuralFeatures", null, 0, -1, SrcEClass.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSrcEClass_EAllSuperTypes(), this.getSrcEClass(), null, "eAllSuperTypes", null, 0, -1, SrcEClass.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSrcEClass_EIDAttribute(), this.getSrcEAttribute(), null, "eIDAttribute", null, 0, 1, SrcEClass.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSrcEClass_EStructuralFeatures(), this.getSrcEStructuralFeature(), this.getSrcEStructuralFeature_EContainingClass(), "eStructuralFeatures", null, 0, -1, SrcEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getSrcEClass__IsSuperTypeOf__SrcEClass(), ecorePackage.getEBoolean(), "isSuperTypeOf", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSrcEClass(), "someClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSrcEClass__GetFeatureCount(), ecorePackage.getEInt(), "getFeatureCount", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSrcEClass__GetEStructuralFeature__int(), this.getSrcEStructuralFeature(), "getEStructuralFeature", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "featureID", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSrcEClass__GetFeatureID__SrcEStructuralFeature(), ecorePackage.getEInt(), "getFeatureID", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSrcEStructuralFeature(), "feature", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSrcEClass__GetEStructuralFeature__String(), this.getSrcEStructuralFeature(), "getEStructuralFeature", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "featureName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(srcEClassifierEClass, SrcEClassifier.class, "SrcEClassifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSrcEClassifier_InstanceClassName(), ecorePackage.getEString(), "instanceClassName", null, 0, 1, SrcEClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSrcEClassifier_InstanceTypeName(), ecorePackage.getEString(), "instanceTypeName", null, 0, 1, SrcEClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSrcEClassifier_EPackage(), this.getSrcEPackage(), this.getSrcEPackage_EClassifiers(), "ePackage", null, 0, 1, SrcEClassifier.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSrcEClassifier__GetClassifierID(), ecorePackage.getEInt(), "getClassifierID", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(srcEDataTypeEClass, SrcEDataType.class, "SrcEDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSrcEDataType_Serializable(), ecorePackage.getEBoolean(), "serializable", "true", 0, 1, SrcEDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(srcEEnumEClass, SrcEEnum.class, "SrcEEnum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSrcEEnum_ELiterals(), this.getSrcEEnumLiteral(), this.getSrcEEnumLiteral_EEnum(), "eLiterals", null, 0, -1, SrcEEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getSrcEEnum__GetEEnumLiteral__String(), this.getSrcEEnumLiteral(), "getEEnumLiteral", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSrcEEnum__GetEEnumLiteral__int(), this.getSrcEEnumLiteral(), "getEEnumLiteral", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSrcEEnum__GetEEnumLiteralByLiteral__String(), this.getSrcEEnumLiteral(), "getEEnumLiteralByLiteral", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "literal", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(srcEEnumLiteralEClass, SrcEEnumLiteral.class, "SrcEEnumLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSrcEEnumLiteral_Value(), ecorePackage.getEInt(), "value", null, 0, 1, SrcEEnumLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSrcEEnumLiteral_Literal(), ecorePackage.getEString(), "literal", null, 0, 1, SrcEEnumLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSrcEEnumLiteral_EEnum(), this.getSrcEEnum(), this.getSrcEEnum_ELiterals(), "eEnum", null, 0, 1, SrcEEnumLiteral.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(srcENamedElementEClass, SrcENamedElement.class, "SrcENamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSrcENamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, SrcENamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(srcEOperationEClass, SrcEOperation.class, "SrcEOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSrcEOperation_EContainingClass(), this.getSrcEClass(), this.getSrcEClass_EOperations(), "eContainingClass", null, 0, 1, SrcEOperation.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSrcEOperation_EParameters(), this.getSrcEParameter(), this.getSrcEParameter_EOperation(), "eParameters", null, 0, -1, SrcEOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSrcEOperation_EExceptions(), this.getSrcEClassifier(), null, "eExceptions", null, 0, -1, SrcEOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(srcEPackageEClass, SrcEPackage.class, "SrcEPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSrcEPackage_NsURI(), ecorePackage.getEString(), "nsURI", null, 0, 1, SrcEPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSrcEPackage_NsPrefix(), ecorePackage.getEString(), "nsPrefix", null, 0, 1, SrcEPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSrcEPackage_EClassifiers(), this.getSrcEClassifier(), this.getSrcEClassifier_EPackage(), "eClassifiers", null, 0, -1, SrcEPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSrcEPackage_ESubpackages(), this.getSrcEPackage(), this.getSrcEPackage_ESuperPackage(), "eSubpackages", null, 0, -1, SrcEPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSrcEPackage_ESuperPackage(), this.getSrcEPackage(), this.getSrcEPackage_ESubpackages(), "eSuperPackage", null, 0, 1, SrcEPackage.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getSrcEPackage__GetEClassifier__String(), this.getSrcEClassifier(), "getEClassifier", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(srcEParameterEClass, SrcEParameter.class, "SrcEParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSrcEParameter_EOperation(), this.getSrcEOperation(), this.getSrcEOperation_EParameters(), "eOperation", null, 0, 1, SrcEParameter.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(srcEReferenceEClass, SrcEReference.class, "SrcEReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSrcEReference_Containment(), ecorePackage.getEBoolean(), "containment", null, 0, 1, SrcEReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSrcEReference_Container(), ecorePackage.getEBoolean(), "container", null, 0, 1, SrcEReference.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSrcEReference_ResolveProxies(), ecorePackage.getEBoolean(), "resolveProxies", "true", 0, 1, SrcEReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSrcEReference_EOpposite(), this.getSrcEReference(), null, "eOpposite", null, 0, 1, SrcEReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSrcEReference_EReferenceType(), this.getSrcEClass(), null, "eReferenceType", null, 0, 1, SrcEReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSrcEReference_EKeys(), this.getSrcEAttribute(), null, "eKeys", null, 0, -1, SrcEReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(srcEStructuralFeatureEClass, SrcEStructuralFeature.class, "SrcEStructuralFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSrcEStructuralFeature_Changeable(), ecorePackage.getEBoolean(), "changeable", "true", 0, 1, SrcEStructuralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSrcEStructuralFeature_Volatile(), ecorePackage.getEBoolean(), "volatile", null, 0, 1, SrcEStructuralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSrcEStructuralFeature_Transient(), ecorePackage.getEBoolean(), "transient", null, 0, 1, SrcEStructuralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSrcEStructuralFeature_DefaultValueLiteral(), ecorePackage.getEString(), "defaultValueLiteral", null, 0, 1, SrcEStructuralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSrcEStructuralFeature_Unsettable(), ecorePackage.getEBoolean(), "unsettable", null, 0, 1, SrcEStructuralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSrcEStructuralFeature_Derived(), ecorePackage.getEBoolean(), "derived", null, 0, 1, SrcEStructuralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSrcEStructuralFeature_EContainingClass(), this.getSrcEClass(), this.getSrcEClass_EStructuralFeatures(), "eContainingClass", null, 0, 1, SrcEStructuralFeature.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSrcEStructuralFeature__GetFeatureID(), ecorePackage.getEInt(), "getFeatureID", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(srcETypedElementEClass, SrcETypedElement.class, "SrcETypedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSrcETypedElement_Ordered(), ecorePackage.getEBoolean(), "ordered", "true", 0, 1, SrcETypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSrcETypedElement_Unique(), ecorePackage.getEBoolean(), "unique", "true", 0, 1, SrcETypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSrcETypedElement_LowerBound(), ecorePackage.getEInt(), "lowerBound", null, 0, 1, SrcETypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSrcETypedElement_UpperBound(), ecorePackage.getEInt(), "upperBound", "1", 0, 1, SrcETypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSrcETypedElement_Many(), ecorePackage.getEBoolean(), "many", null, 0, 1, SrcETypedElement.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSrcETypedElement_Required(), ecorePackage.getEBoolean(), "required", null, 0, 1, SrcETypedElement.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSrcETypedElement_EType(), this.getSrcEClassifier(), null, "eType", null, 0, 1, SrcETypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trgMaudeSpecEClass, TrgMaudeSpec.class, "TrgMaudeSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgMaudeSpec_Els(), this.getTrgMaudeTopEl(), null, "els", null, 0, -1, TrgMaudeSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrgMaudeSpec_PrintableEls(), this.getTrgMaudeTopEl(), null, "printableEls", null, 0, -1, TrgMaudeSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trgMembershipEClass, TrgMembership.class, "TrgMembership", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgMembership_Term(), this.getTrgTerm(), null, "term", null, 1, 1, TrgMembership.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrgMembership_Sort(), this.getTrgSort(), null, "sort", null, 1, 1, TrgMembership.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgEquationEClass, TrgEquation.class, "TrgEquation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgEquation_Lhs(), this.getTrgTerm(), null, "lhs", null, 1, 1, TrgEquation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrgEquation_Rhs(), this.getTrgTerm(), null, "rhs", null, 1, 1, TrgEquation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgRuleEClass, TrgRule.class, "TrgRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgRule_Lhs(), this.getTrgTerm(), null, "lhs", null, 0, 1, TrgRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrgRule_Rhs(), this.getTrgTerm(), null, "rhs", null, 0, 1, TrgRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgMembershipCondEClass, TrgMembershipCond.class, "TrgMembershipCond", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgMembershipCond_Rhs(), this.getTrgSort(), null, "rhs", null, 1, 1, TrgMembershipCond.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgBooleanCondEClass, TrgBooleanCond.class, "TrgBooleanCond", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(trgMatchingCondEClass, TrgMatchingCond.class, "TrgMatchingCond", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgMatchingCond_Rhs(), this.getTrgTerm(), null, "rhs", null, 1, 1, TrgMatchingCond.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgEqualCondEClass, TrgEqualCond.class, "TrgEqualCond", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgEqualCond_Rhs(), this.getTrgTerm(), null, "rhs", null, 1, 1, TrgEqualCond.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgMaudeTopElEClass, TrgMaudeTopEl.class, "TrgMaudeTopEl", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrgMaudeTopEl_Name(), ecorePackage.getEString(), "name", null, 1, 1, TrgMaudeTopEl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgModExpressionEClass, TrgModExpression.class, "TrgModExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(trgInstModExpEClass, TrgInstModExp.class, "TrgInstModExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgInstModExp_ModExp(), this.getTrgModExpression(), null, "modExp", null, 1, 1, TrgInstModExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrgInstModExp_Views(), this.getTrgView(), null, "views", null, 1, -1, TrgInstModExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trgRenModExpEClass, TrgRenModExp.class, "TrgRenModExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgRenModExp_ModExp(), this.getTrgModExpression(), null, "modExp", null, 1, 1, TrgRenModExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrgRenModExp_Renamings(), this.getTrgRenMapping(), null, "renamings", null, 1, -1, TrgRenModExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgCompModExpEClass, TrgCompModExp.class, "TrgCompModExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgCompModExp_ModExps(), this.getTrgModExpression(), null, "modExps", null, 2, -1, TrgCompModExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgModuleIdModExpEClass, TrgModuleIdModExp.class, "TrgModuleIdModExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgModuleIdModExp_Module(), this.getTrgModule(), null, "module", null, 1, 1, TrgModuleIdModExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgTheoryIdModExpEClass, TrgTheoryIdModExp.class, "TrgTheoryIdModExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgTheoryIdModExp_Theory(), this.getTrgTheory(), null, "theory", null, 1, 1, TrgTheoryIdModExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgParameterEClass, TrgParameter.class, "TrgParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrgParameter_Label(), ecorePackage.getEString(), "label", null, 1, 1, TrgParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrgParameter_ModExp(), this.getTrgModExpression(), null, "modExp", null, 1, 1, TrgParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgTheoryEClass, TrgTheory.class, "TrgTheory", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgTheory_Els(), this.getTrgModElement(), this.getTrgModElement_Theory(), "els", null, 0, -1, TrgTheory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgFTheoryEClass, TrgFTheory.class, "TrgFTheory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(trgSTheoryEClass, TrgSTheory.class, "TrgSTheory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(trgModuleEClass, TrgModule.class, "TrgModule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgModule_Els(), this.getTrgModElement(), this.getTrgModElement_Module(), "els", null, 0, -1, TrgModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrgModule_Params(), this.getTrgParameter(), null, "params", null, 0, -1, TrgModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trgFModuleEClass, TrgFModule.class, "TrgFModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(trgSModuleEClass, TrgSModule.class, "TrgSModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(trgModElementEClass, TrgModElement.class, "TrgModElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgModElement_Module(), this.getTrgModule(), this.getTrgModule_Els(), "module", null, 0, 1, TrgModElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrgModElement_Theory(), this.getTrgTheory(), this.getTrgTheory_Els(), "theory", null, 0, 1, TrgModElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgModImportationEClass, TrgModImportation.class, "TrgModImportation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgModImportation_Imports(), this.getTrgModExpression(), null, "imports", null, 1, 1, TrgModImportation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgTypeEClass, TrgType.class, "TrgType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrgType_Name(), ecorePackage.getEString(), "name", null, 1, 1, TrgType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgSortEClass, TrgSort.class, "TrgSort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgSort_SubsortRels(), this.getTrgSubsortRel(), this.getTrgSubsortRel_Supersorts(), "subsortRels", null, 0, -1, TrgSort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrgSort_SupersortRels(), this.getTrgSubsortRel(), this.getTrgSubsortRel_Subsorts(), "supersortRels", null, 0, -1, TrgSort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrgSort_Kind(), this.getTrgKind(), this.getTrgKind_Sorts(), "kind", null, 1, 1, TrgSort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgKindEClass, TrgKind.class, "TrgKind", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgKind_Sorts(), this.getTrgSort(), this.getTrgSort_Kind(), "sorts", null, 1, -1, TrgKind.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgSubsortRelEClass, TrgSubsortRel.class, "TrgSubsortRel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgSubsortRel_Subsorts(), this.getTrgSort(), this.getTrgSort_SupersortRels(), "subsorts", null, 1, -1, TrgSubsortRel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrgSubsortRel_Supersorts(), this.getTrgSort(), this.getTrgSort_SubsortRels(), "supersorts", null, 1, -1, TrgSubsortRel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgOperationEClass, TrgOperation.class, "TrgOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrgOperation_Name(), ecorePackage.getEString(), "name", null, 0, 1, TrgOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrgOperation_Coarity(), this.getTrgType(), null, "coarity", null, 0, 1, TrgOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrgOperation_Arity(), this.getTrgType(), null, "arity", null, 0, -1, TrgOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrgOperation_Atts(), ecorePackage.getEString(), "atts", null, 0, -1, TrgOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgStatementEClass, TrgStatement.class, "TrgStatement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrgStatement_Label(), ecorePackage.getEString(), "label", null, 0, 1, TrgStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTrgStatement_Atts(), ecorePackage.getEString(), "atts", null, 0, -1, TrgStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrgStatement_Conds(), this.getTrgCondition(), null, "conds", null, 0, -1, TrgStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trgConditionEClass, TrgCondition.class, "TrgCondition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgCondition_Lhs(), this.getTrgTerm(), null, "lhs", null, 1, 1, TrgCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgEquationalCondEClass, TrgEquationalCond.class, "TrgEquationalCond", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(trgRewriteCondEClass, TrgRewriteCond.class, "TrgRewriteCond", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgRewriteCond_Rhs(), this.getTrgTerm(), null, "rhs", null, 1, 1, TrgRewriteCond.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgTermEClass, TrgTerm.class, "TrgTerm", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgTerm_Type(), this.getTrgType(), null, "type", null, 1, 1, TrgTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgConstantEClass, TrgConstant.class, "TrgConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrgConstant_Op(), ecorePackage.getEString(), "op", null, 1, 1, TrgConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgRecTermEClass, TrgRecTerm.class, "TrgRecTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrgRecTerm_Op(), ecorePackage.getEString(), "op", null, 1, 1, TrgRecTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrgRecTerm_Args(), this.getTrgTerm(), null, "args", null, 1, -1, TrgRecTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trgVariableEClass, TrgVariable.class, "TrgVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrgVariable_Name(), ecorePackage.getEString(), "name", null, 1, 1, TrgVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgViewEClass, TrgView.class, "TrgView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgView_From(), this.getTrgModExpression(), null, "from", null, 1, 1, TrgView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrgView_To(), this.getTrgModExpression(), null, "to", null, 1, 1, TrgView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrgView_Els(), this.getTrgViewMapping(), null, "els", null, 0, -1, TrgView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgViewMappingEClass, TrgViewMapping.class, "TrgViewMapping", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(trgRenMappingEClass, TrgRenMapping.class, "TrgRenMapping", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(trgTermMappingEClass, TrgTermMapping.class, "TrgTermMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgTermMapping_From(), this.getTrgTerm(), null, "from", null, 1, 1, TrgTermMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrgTermMapping_To(), this.getTrgTerm(), null, "to", null, 1, 1, TrgTermMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgSortMappingEClass, TrgSortMapping.class, "TrgSortMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgSortMapping_From(), this.getTrgSort(), null, "from", null, 1, 1, TrgSortMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTrgSortMapping_To(), ecorePackage.getEString(), "to", null, 1, 1, TrgSortMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgOpTypedMappingEClass, TrgOpTypedMapping.class, "TrgOpTypedMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgOpTypedMapping_From(), this.getTrgOperation(), null, "from", null, 1, 1, TrgOpTypedMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTrgOpTypedMapping_To(), ecorePackage.getEString(), "to", null, 1, 1, TrgOpTypedMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTrgOpTypedMapping_Atts(), ecorePackage.getEString(), "atts", null, 0, -1, TrgOpTypedMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgOpMappingEClass, TrgOpMapping.class, "TrgOpMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgOpMapping_From(), this.getTrgOperation(), null, "from", null, 1, 1, TrgOpMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTrgOpMapping_To(), ecorePackage.getEString(), "to", null, 1, 1, TrgOpMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgLabelMappingEClass, TrgLabelMapping.class, "TrgLabelMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrgLabelMapping_From(), ecorePackage.getEString(), "from", null, 1, 1, TrgLabelMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTrgLabelMapping_To(), ecorePackage.getEString(), "to", null, 1, 1, TrgLabelMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (srcEAttributeEClass, 
		   source, 
		   new String[] {
			 "constraints", "ConsistentTransient"
		   });	
		addAnnotation
		  (srcEClassEClass, 
		   source, 
		   new String[] {
			 "constraints", "InterfaceIsAbstract AtMostOneID UniqueFeatureNames UniqueOperationSignatures NoCircularSuperTypes WellFormedMapEntryClass ConsistentSuperTypes"
		   });	
		addAnnotation
		  (srcEClassifierEClass, 
		   source, 
		   new String[] {
			 "constraints", "WellFormedInstanceTypeName UniqueTypeParameterNames"
		   });	
		addAnnotation
		  (srcEEnumEClass, 
		   source, 
		   new String[] {
			 "constraints", "UniqueEnumeratorNames UniqueEnumeratorLiterals"
		   });	
		addAnnotation
		  (srcENamedElementEClass, 
		   source, 
		   new String[] {
			 "constraints", "WellFormedName"
		   });	
		addAnnotation
		  (srcEOperationEClass, 
		   source, 
		   new String[] {
			 "constraints", "UniqueParameterNames UniqueTypeParameterNames NoRepeatingVoid"
		   });	
		addAnnotation
		  (srcEPackageEClass, 
		   source, 
		   new String[] {
			 "constraints", "WellFormedNsURI WellFormedNsPrefix UniqueSubpackageNames UniqueClassifierNames UniqueNsURIs"
		   });	
		addAnnotation
		  (srcEReferenceEClass, 
		   source, 
		   new String[] {
			 "constraints", "ConsistentOpposite SingleContainer ConsistentKeys"
		   });	
		addAnnotation
		  (srcEStructuralFeatureEClass, 
		   source, 
		   new String[] {
			 "constraints", "ValidDefaultValueLiteral"
		   });	
		addAnnotation
		  (srcETypedElementEClass, 
		   source, 
		   new String[] {
			 "constraints", "ValidLowerBound ValidUpperBound ConsistentBounds ValidType"
		   });
	}

} //JointPackage_Ecore2MaudePackageImpl
