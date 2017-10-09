/**
 */
package jointPackage_UML2ER.impl;

import jointPackage_UML2ER.*;

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
public class JointPackage_UML2ERFactoryImpl extends EFactoryImpl implements JointPackage_UML2ERFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JointPackage_UML2ERFactory init() {
		try {
			JointPackage_UML2ERFactory theJointPackage_UML2ERFactory = (JointPackage_UML2ERFactory)EPackage.Registry.INSTANCE.getEFactory(JointPackage_UML2ERPackage.eNS_URI);
			if (theJointPackage_UML2ERFactory != null) {
				return theJointPackage_UML2ERFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JointPackage_UML2ERFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JointPackage_UML2ERFactoryImpl() {
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
			case JointPackage_UML2ERPackage.JOINT_MM: return createJointMM();
			case JointPackage_UML2ERPackage.SRC_PACKAGE: return createSrcPackage();
			case JointPackage_UML2ERPackage.SRC_CLASS: return createSrcClass();
			case JointPackage_UML2ERPackage.SRC_PROPERTY: return createSrcProperty();
			case JointPackage_UML2ERPackage.TRG_ER_MODEL: return createTrgERModel();
			case JointPackage_UML2ERPackage.TRG_WEAK_REFERENCE: return createTrgWeakReference();
			case JointPackage_UML2ERPackage.TRG_STRONG_REFERENCE: return createTrgStrongReference();
			case JointPackage_UML2ERPackage.TRG_ENTITY_TYPE: return createTrgEntityType();
			case JointPackage_UML2ERPackage.TRG_ATTRIBUTE: return createTrgAttribute();
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
	public SrcPackage createSrcPackage() {
		SrcPackageImpl srcPackage = new SrcPackageImpl();
		return srcPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcClass createSrcClass() {
		SrcClassImpl srcClass = new SrcClassImpl();
		return srcClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcProperty createSrcProperty() {
		SrcPropertyImpl srcProperty = new SrcPropertyImpl();
		return srcProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgERModel createTrgERModel() {
		TrgERModelImpl trgERModel = new TrgERModelImpl();
		return trgERModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgWeakReference createTrgWeakReference() {
		TrgWeakReferenceImpl trgWeakReference = new TrgWeakReferenceImpl();
		return trgWeakReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgStrongReference createTrgStrongReference() {
		TrgStrongReferenceImpl trgStrongReference = new TrgStrongReferenceImpl();
		return trgStrongReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgEntityType createTrgEntityType() {
		TrgEntityTypeImpl trgEntityType = new TrgEntityTypeImpl();
		return trgEntityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgAttribute createTrgAttribute() {
		TrgAttributeImpl trgAttribute = new TrgAttributeImpl();
		return trgAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JointPackage_UML2ERPackage getJointPackage_UML2ERPackage() {
		return (JointPackage_UML2ERPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JointPackage_UML2ERPackage getPackage() {
		return JointPackage_UML2ERPackage.eINSTANCE;
	}

} //JointPackage_UML2ERFactoryImpl
