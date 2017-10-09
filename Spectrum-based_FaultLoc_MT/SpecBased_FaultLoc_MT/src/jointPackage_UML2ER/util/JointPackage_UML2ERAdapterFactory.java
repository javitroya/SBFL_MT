/**
 */
package jointPackage_UML2ER.util;

import jointPackage_UML2ER.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see jointPackage_UML2ER.JointPackage_UML2ERPackage
 * @generated
 */
public class JointPackage_UML2ERAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JointPackage_UML2ERPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JointPackage_UML2ERAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = JointPackage_UML2ERPackage.eINSTANCE;
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
	protected JointPackage_UML2ERSwitch<Adapter> modelSwitch =
		new JointPackage_UML2ERSwitch<Adapter>() {
			@Override
			public Adapter caseJointMM(JointMM object) {
				return createJointMMAdapter();
			}
			@Override
			public Adapter caseSrcPackage(SrcPackage object) {
				return createSrcPackageAdapter();
			}
			@Override
			public Adapter caseSrcClass(SrcClass object) {
				return createSrcClassAdapter();
			}
			@Override
			public Adapter caseSrcProperty(SrcProperty object) {
				return createSrcPropertyAdapter();
			}
			@Override
			public Adapter caseSrcNamedElement(SrcNamedElement object) {
				return createSrcNamedElementAdapter();
			}
			@Override
			public Adapter caseTrgERModel(TrgERModel object) {
				return createTrgERModelAdapter();
			}
			@Override
			public Adapter caseTrgWeakReference(TrgWeakReference object) {
				return createTrgWeakReferenceAdapter();
			}
			@Override
			public Adapter caseTrgStrongReference(TrgStrongReference object) {
				return createTrgStrongReferenceAdapter();
			}
			@Override
			public Adapter caseTrgEntityType(TrgEntityType object) {
				return createTrgEntityTypeAdapter();
			}
			@Override
			public Adapter caseTrgFeature(TrgFeature object) {
				return createTrgFeatureAdapter();
			}
			@Override
			public Adapter caseTrgAttribute(TrgAttribute object) {
				return createTrgAttributeAdapter();
			}
			@Override
			public Adapter caseTrgElement(TrgElement object) {
				return createTrgElementAdapter();
			}
			@Override
			public Adapter caseTrgReference(TrgReference object) {
				return createTrgReferenceAdapter();
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
	 * Creates a new adapter for an object of class '{@link jointPackage_UML2ER.JointMM <em>Joint MM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_UML2ER.JointMM
	 * @generated
	 */
	public Adapter createJointMMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_UML2ER.SrcPackage <em>Src Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_UML2ER.SrcPackage
	 * @generated
	 */
	public Adapter createSrcPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_UML2ER.SrcClass <em>Src Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_UML2ER.SrcClass
	 * @generated
	 */
	public Adapter createSrcClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_UML2ER.SrcProperty <em>Src Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_UML2ER.SrcProperty
	 * @generated
	 */
	public Adapter createSrcPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_UML2ER.SrcNamedElement <em>Src Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_UML2ER.SrcNamedElement
	 * @generated
	 */
	public Adapter createSrcNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_UML2ER.TrgERModel <em>Trg ER Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_UML2ER.TrgERModel
	 * @generated
	 */
	public Adapter createTrgERModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_UML2ER.TrgWeakReference <em>Trg Weak Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_UML2ER.TrgWeakReference
	 * @generated
	 */
	public Adapter createTrgWeakReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_UML2ER.TrgStrongReference <em>Trg Strong Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_UML2ER.TrgStrongReference
	 * @generated
	 */
	public Adapter createTrgStrongReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_UML2ER.TrgEntityType <em>Trg Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_UML2ER.TrgEntityType
	 * @generated
	 */
	public Adapter createTrgEntityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_UML2ER.TrgFeature <em>Trg Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_UML2ER.TrgFeature
	 * @generated
	 */
	public Adapter createTrgFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_UML2ER.TrgAttribute <em>Trg Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_UML2ER.TrgAttribute
	 * @generated
	 */
	public Adapter createTrgAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_UML2ER.TrgElement <em>Trg Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_UML2ER.TrgElement
	 * @generated
	 */
	public Adapter createTrgElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_UML2ER.TrgReference <em>Trg Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_UML2ER.TrgReference
	 * @generated
	 */
	public Adapter createTrgReferenceAdapter() {
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

} //JointPackage_UML2ERAdapterFactory
