/**
 */
package jointPackage_UML2ER.impl;

import jointPackage_UML2ER.JointMM;
import jointPackage_UML2ER.JointPackage_UML2ERFactory;
import jointPackage_UML2ER.JointPackage_UML2ERPackage;
import jointPackage_UML2ER.SrcClass;
import jointPackage_UML2ER.SrcNamedElement;
import jointPackage_UML2ER.SrcPackage;
import jointPackage_UML2ER.SrcProperty;
import jointPackage_UML2ER.TrgAttribute;
import jointPackage_UML2ER.TrgERModel;
import jointPackage_UML2ER.TrgElement;
import jointPackage_UML2ER.TrgEntityType;
import jointPackage_UML2ER.TrgFeature;
import jointPackage_UML2ER.TrgReference;
import jointPackage_UML2ER.TrgStrongReference;
import jointPackage_UML2ER.TrgWeakReference;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JointPackage_UML2ERPackageImpl extends EPackageImpl implements JointPackage_UML2ERPackage {
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
	private EClass srcPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcNamedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgERModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgWeakReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgStrongReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgEntityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgReferenceEClass = null;

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
	 * @see jointPackage_UML2ER.JointPackage_UML2ERPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JointPackage_UML2ERPackageImpl() {
		super(eNS_URI, JointPackage_UML2ERFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link JointPackage_UML2ERPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static JointPackage_UML2ERPackage init() {
		if (isInited) return (JointPackage_UML2ERPackage)EPackage.Registry.INSTANCE.getEPackage(JointPackage_UML2ERPackage.eNS_URI);

		// Obtain or create and register package
		JointPackage_UML2ERPackageImpl theJointPackage_UML2ERPackage = (JointPackage_UML2ERPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof JointPackage_UML2ERPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new JointPackage_UML2ERPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theJointPackage_UML2ERPackage.createPackageContents();

		// Initialize created meta-data
		theJointPackage_UML2ERPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJointPackage_UML2ERPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(JointPackage_UML2ERPackage.eNS_URI, theJointPackage_UML2ERPackage);
		return theJointPackage_UML2ERPackage;
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
	public EClass getSrcPackage() {
		return srcPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSrcPackage_OwnedElements() {
		return (EReference)srcPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcClass() {
		return srcClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSrcClass_OwnedProperty() {
		return (EReference)srcClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSrcClass_SuperClasses() {
		return (EReference)srcClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcProperty() {
		return srcPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcProperty_PrimitiveType() {
		return (EAttribute)srcPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSrcProperty_ComplexType() {
		return (EReference)srcPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcProperty_IsContainment() {
		return (EAttribute)srcPropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcNamedElement() {
		return srcNamedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcNamedElement_Name() {
		return (EAttribute)srcNamedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgERModel() {
		return trgERModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgERModel_Entities() {
		return (EReference)trgERModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgWeakReference() {
		return trgWeakReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgStrongReference() {
		return trgStrongReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgEntityType() {
		return trgEntityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgEntityType_Features() {
		return (EReference)trgEntityTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgFeature() {
		return trgFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgAttribute() {
		return trgAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrgAttribute_Type() {
		return (EAttribute)trgAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgElement() {
		return trgElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrgElement_Name() {
		return (EAttribute)trgElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgReference() {
		return trgReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgReference_Type() {
		return (EReference)trgReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JointPackage_UML2ERFactory getJointPackage_UML2ERFactory() {
		return (JointPackage_UML2ERFactory)getEFactoryInstance();
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

		srcPackageEClass = createEClass(SRC_PACKAGE);
		createEReference(srcPackageEClass, SRC_PACKAGE__OWNED_ELEMENTS);

		srcClassEClass = createEClass(SRC_CLASS);
		createEReference(srcClassEClass, SRC_CLASS__OWNED_PROPERTY);
		createEReference(srcClassEClass, SRC_CLASS__SUPER_CLASSES);

		srcPropertyEClass = createEClass(SRC_PROPERTY);
		createEAttribute(srcPropertyEClass, SRC_PROPERTY__PRIMITIVE_TYPE);
		createEReference(srcPropertyEClass, SRC_PROPERTY__COMPLEX_TYPE);
		createEAttribute(srcPropertyEClass, SRC_PROPERTY__IS_CONTAINMENT);

		srcNamedElementEClass = createEClass(SRC_NAMED_ELEMENT);
		createEAttribute(srcNamedElementEClass, SRC_NAMED_ELEMENT__NAME);

		trgERModelEClass = createEClass(TRG_ER_MODEL);
		createEReference(trgERModelEClass, TRG_ER_MODEL__ENTITIES);

		trgWeakReferenceEClass = createEClass(TRG_WEAK_REFERENCE);

		trgStrongReferenceEClass = createEClass(TRG_STRONG_REFERENCE);

		trgEntityTypeEClass = createEClass(TRG_ENTITY_TYPE);
		createEReference(trgEntityTypeEClass, TRG_ENTITY_TYPE__FEATURES);

		trgFeatureEClass = createEClass(TRG_FEATURE);

		trgAttributeEClass = createEClass(TRG_ATTRIBUTE);
		createEAttribute(trgAttributeEClass, TRG_ATTRIBUTE__TYPE);

		trgElementEClass = createEClass(TRG_ELEMENT);
		createEAttribute(trgElementEClass, TRG_ELEMENT__NAME);

		trgReferenceEClass = createEClass(TRG_REFERENCE);
		createEReference(trgReferenceEClass, TRG_REFERENCE__TYPE);
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
		srcPackageEClass.getESuperTypes().add(this.getSrcNamedElement());
		srcClassEClass.getESuperTypes().add(this.getSrcNamedElement());
		srcPropertyEClass.getESuperTypes().add(this.getSrcNamedElement());
		trgERModelEClass.getESuperTypes().add(this.getTrgElement());
		trgWeakReferenceEClass.getESuperTypes().add(this.getTrgReference());
		trgStrongReferenceEClass.getESuperTypes().add(this.getTrgReference());
		trgEntityTypeEClass.getESuperTypes().add(this.getTrgElement());
		trgFeatureEClass.getESuperTypes().add(this.getTrgElement());
		trgAttributeEClass.getESuperTypes().add(this.getTrgFeature());
		trgReferenceEClass.getESuperTypes().add(this.getTrgFeature());

		// Initialize classes, features, and operations; add parameters
		initEClass(jointMMEClass, JointMM.class, "JointMM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJointMM_SourceRoot(), this.getSrcPackage(), null, "sourceRoot", null, 1, 1, JointMM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJointMM_TargetRoot(), this.getTrgStrongReference(), null, "targetRoot", null, 1, 1, JointMM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(srcPackageEClass, SrcPackage.class, "SrcPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSrcPackage_OwnedElements(), this.getSrcClass(), null, "ownedElements", null, 0, -1, SrcPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(srcClassEClass, SrcClass.class, "SrcClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSrcClass_OwnedProperty(), this.getSrcProperty(), null, "ownedProperty", null, 0, -1, SrcClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSrcClass_SuperClasses(), this.getSrcClass(), null, "superClasses", null, 0, -1, SrcClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(srcPropertyEClass, SrcProperty.class, "SrcProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSrcProperty_PrimitiveType(), ecorePackage.getEString(), "primitiveType", null, 0, 1, SrcProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSrcProperty_ComplexType(), this.getSrcClass(), null, "complexType", null, 0, 1, SrcProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSrcProperty_IsContainment(), ecorePackage.getEBoolean(), "isContainment", null, 1, 1, SrcProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(srcNamedElementEClass, SrcNamedElement.class, "SrcNamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSrcNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, SrcNamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trgERModelEClass, TrgERModel.class, "TrgERModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgERModel_Entities(), this.getTrgEntityType(), null, "entities", null, 0, -1, TrgERModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trgWeakReferenceEClass, TrgWeakReference.class, "TrgWeakReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(trgStrongReferenceEClass, TrgStrongReference.class, "TrgStrongReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(trgEntityTypeEClass, TrgEntityType.class, "TrgEntityType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgEntityType_Features(), this.getTrgFeature(), null, "features", null, 0, -1, TrgEntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trgFeatureEClass, TrgFeature.class, "TrgFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(trgAttributeEClass, TrgAttribute.class, "TrgAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrgAttribute_Type(), ecorePackage.getEString(), "type", null, 0, 1, TrgAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trgElementEClass, TrgElement.class, "TrgElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrgElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, TrgElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trgReferenceEClass, TrgReference.class, "TrgReference", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgReference_Type(), this.getTrgEntityType(), null, "type", null, 1, 1, TrgReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //JointPackage_UML2ERPackageImpl
