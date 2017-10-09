/**
 */
package jointPackage_Ecore2Maude.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage;
import jointPackage_Ecore2Maude.SrcEAttribute;
import jointPackage_Ecore2Maude.SrcEClass;
import jointPackage_Ecore2Maude.SrcEOperation;
import jointPackage_Ecore2Maude.SrcEReference;
import jointPackage_Ecore2Maude.SrcEStructuralFeature;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Src EClass</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_Ecore2Maude.impl.SrcEClassImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.impl.SrcEClassImpl#isInterface <em>Interface</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.impl.SrcEClassImpl#getESuperTypes <em>ESuper Types</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.impl.SrcEClassImpl#getEOperations <em>EOperations</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.impl.SrcEClassImpl#getEAllAttributes <em>EAll Attributes</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.impl.SrcEClassImpl#getEAllReferences <em>EAll References</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.impl.SrcEClassImpl#getEReferences <em>EReferences</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.impl.SrcEClassImpl#getEAttributes <em>EAttributes</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.impl.SrcEClassImpl#getEAllContainments <em>EAll Containments</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.impl.SrcEClassImpl#getEAllOperations <em>EAll Operations</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.impl.SrcEClassImpl#getEAllStructuralFeatures <em>EAll Structural Features</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.impl.SrcEClassImpl#getEAllSuperTypes <em>EAll Super Types</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.impl.SrcEClassImpl#getEIDAttribute <em>EID Attribute</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.impl.SrcEClassImpl#getEStructuralFeatures <em>EStructural Features</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SrcEClassImpl extends SrcEClassifierImpl implements SrcEClass {
	/**
	 * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean abstract_ = ABSTRACT_EDEFAULT;

	/**
	 * The default value of the '{@link #isInterface() <em>Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInterface()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INTERFACE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInterface() <em>Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInterface()
	 * @generated
	 * @ordered
	 */
	protected boolean interface_ = INTERFACE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getESuperTypes() <em>ESuper Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getESuperTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<SrcEClass> eSuperTypes;

	/**
	 * The cached value of the '{@link #getEOperations() <em>EOperations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<SrcEOperation> eOperations;

	/**
	 * The cached value of the '{@link #getEAllAttributes() <em>EAll Attributes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAllAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<SrcEAttribute> eAllAttributes;

	/**
	 * The cached value of the '{@link #getEAllReferences() <em>EAll References</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAllReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<SrcEReference> eAllReferences;

	/**
	 * The cached value of the '{@link #getEReferences() <em>EReferences</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<SrcEReference> eReferences;

	/**
	 * The cached value of the '{@link #getEAttributes() <em>EAttributes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<SrcEAttribute> eAttributes;

	/**
	 * The cached value of the '{@link #getEAllContainments() <em>EAll Containments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAllContainments()
	 * @generated
	 * @ordered
	 */
	protected EList<SrcEReference> eAllContainments;

	/**
	 * The cached value of the '{@link #getEAllOperations() <em>EAll Operations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAllOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<SrcEOperation> eAllOperations;

	/**
	 * The cached value of the '{@link #getEAllStructuralFeatures() <em>EAll Structural Features</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAllStructuralFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<SrcEStructuralFeature> eAllStructuralFeatures;

	/**
	 * The cached value of the '{@link #getEAllSuperTypes() <em>EAll Super Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAllSuperTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<SrcEClass> eAllSuperTypes;

	/**
	 * The cached value of the '{@link #getEIDAttribute() <em>EID Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEIDAttribute()
	 * @generated
	 * @ordered
	 */
	protected SrcEAttribute eIDAttribute;

	/**
	 * The cached value of the '{@link #getEStructuralFeatures() <em>EStructural Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEStructuralFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<SrcEStructuralFeature> eStructuralFeatures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SrcEClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JointPackage_Ecore2MaudePackage.Literals.SRC_ECLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(boolean newAbstract) {
		boolean oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_Ecore2MaudePackage.SRC_ECLASS__ABSTRACT, oldAbstract, abstract_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInterface() {
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterface(boolean newInterface) {
		boolean oldInterface = interface_;
		interface_ = newInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_Ecore2MaudePackage.SRC_ECLASS__INTERFACE, oldInterface, interface_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SrcEClass> getESuperTypes() {
		if (eSuperTypes == null) {
			eSuperTypes = new EObjectResolvingEList<SrcEClass>(SrcEClass.class, this, JointPackage_Ecore2MaudePackage.SRC_ECLASS__ESUPER_TYPES);
		}
		return eSuperTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SrcEOperation> getEOperations() {
		if (eOperations == null) {
			eOperations = new EObjectContainmentWithInverseEList<SrcEOperation>(SrcEOperation.class, this, JointPackage_Ecore2MaudePackage.SRC_ECLASS__EOPERATIONS, JointPackage_Ecore2MaudePackage.SRC_EOPERATION__ECONTAINING_CLASS);
		}
		return eOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SrcEAttribute> getEAllAttributes() {
		if (eAllAttributes == null) {
			eAllAttributes = new EObjectResolvingEList<SrcEAttribute>(SrcEAttribute.class, this, JointPackage_Ecore2MaudePackage.SRC_ECLASS__EALL_ATTRIBUTES);
		}
		return eAllAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SrcEReference> getEAllReferences() {
		if (eAllReferences == null) {
			eAllReferences = new EObjectResolvingEList<SrcEReference>(SrcEReference.class, this, JointPackage_Ecore2MaudePackage.SRC_ECLASS__EALL_REFERENCES);
		}
		return eAllReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SrcEReference> getEReferences() {
		if (eReferences == null) {
			eReferences = new EObjectResolvingEList<SrcEReference>(SrcEReference.class, this, JointPackage_Ecore2MaudePackage.SRC_ECLASS__EREFERENCES);
		}
		return eReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SrcEAttribute> getEAttributes() {
		if (eAttributes == null) {
			eAttributes = new EObjectResolvingEList<SrcEAttribute>(SrcEAttribute.class, this, JointPackage_Ecore2MaudePackage.SRC_ECLASS__EATTRIBUTES);
		}
		return eAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SrcEReference> getEAllContainments() {
		if (eAllContainments == null) {
			eAllContainments = new EObjectResolvingEList<SrcEReference>(SrcEReference.class, this, JointPackage_Ecore2MaudePackage.SRC_ECLASS__EALL_CONTAINMENTS);
		}
		return eAllContainments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SrcEOperation> getEAllOperations() {
		if (eAllOperations == null) {
			eAllOperations = new EObjectResolvingEList<SrcEOperation>(SrcEOperation.class, this, JointPackage_Ecore2MaudePackage.SRC_ECLASS__EALL_OPERATIONS);
		}
		return eAllOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SrcEStructuralFeature> getEAllStructuralFeatures() {
		if (eAllStructuralFeatures == null) {
			eAllStructuralFeatures = new EObjectResolvingEList<SrcEStructuralFeature>(SrcEStructuralFeature.class, this, JointPackage_Ecore2MaudePackage.SRC_ECLASS__EALL_STRUCTURAL_FEATURES);
		}
		return eAllStructuralFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SrcEClass> getEAllSuperTypes() {
		if (eAllSuperTypes == null) {
			eAllSuperTypes = new EObjectResolvingEList<SrcEClass>(SrcEClass.class, this, JointPackage_Ecore2MaudePackage.SRC_ECLASS__EALL_SUPER_TYPES);
		}
		return eAllSuperTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcEAttribute getEIDAttribute() {
		if (eIDAttribute != null && eIDAttribute.eIsProxy()) {
			InternalEObject oldEIDAttribute = (InternalEObject)eIDAttribute;
			eIDAttribute = (SrcEAttribute)eResolveProxy(oldEIDAttribute);
			if (eIDAttribute != oldEIDAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JointPackage_Ecore2MaudePackage.SRC_ECLASS__EID_ATTRIBUTE, oldEIDAttribute, eIDAttribute));
			}
		}
		return eIDAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcEAttribute basicGetEIDAttribute() {
		return eIDAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SrcEStructuralFeature> getEStructuralFeatures() {
		if (eStructuralFeatures == null) {
			eStructuralFeatures = new EObjectContainmentWithInverseEList<SrcEStructuralFeature>(SrcEStructuralFeature.class, this, JointPackage_Ecore2MaudePackage.SRC_ECLASS__ESTRUCTURAL_FEATURES, JointPackage_Ecore2MaudePackage.SRC_ESTRUCTURAL_FEATURE__ECONTAINING_CLASS);
		}
		return eStructuralFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSuperTypeOf(SrcEClass someClass) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFeatureCount() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcEStructuralFeature getEStructuralFeature(int featureID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFeatureID(SrcEStructuralFeature feature) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcEStructuralFeature getEStructuralFeature(String featureName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JointPackage_Ecore2MaudePackage.SRC_ECLASS__EOPERATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEOperations()).basicAdd(otherEnd, msgs);
			case JointPackage_Ecore2MaudePackage.SRC_ECLASS__ESTRUCTURAL_FEATURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEStructuralFeatures()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JointPackage_Ecore2MaudePackage.SRC_ECLASS__EOPERATIONS:
				return ((InternalEList<?>)getEOperations()).basicRemove(otherEnd, msgs);
			case JointPackage_Ecore2MaudePackage.SRC_ECLASS__ESTRUCTURAL_FEATURES:
				return ((InternalEList<?>)getEStructuralFeatures()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JointPackage_Ecore2MaudePackage.SRC_ECLASS__ABSTRACT:
				return isAbstract();
			case JointPackage_Ecore2MaudePackage.SRC_ECLASS__INTERFACE:
				return isInterface();
			case JointPackage_Ecore2MaudePackage.SRC_ECLASS__ESUPER_TYPES:
				return getESuperTypes();
			case JointPackage_Ecore2MaudePackage.SRC_ECLASS__EOPERATIONS:
				return getEOperations();
			case JointPackage_Ecore2MaudePackage.SRC_ECLASS__EALL_ATTRIBUTES:
				return getEAllAttributes();
			case JointPackage_Ecore2MaudePackage.SRC_ECLASS__EALL_REFERENCES:
				return getEAllReferences();
			case JointPackage_Ecore2MaudePackage.SRC_ECLASS__EREFERENCES:
				return getEReferences();
			case JointPackage_Ecore2MaudePackage.SRC_ECLASS__EATTRIBUTES:
				return getEAttributes();
			case JointPackage_Ecore2MaudePackage.SRC_ECLASS__EALL_CONTAINMENTS:
				return getEAllContainments();
			case JointPackage_Ecore2MaudePackage.SRC_ECLASS__EALL_OPERATIONS:
				return getEAllOperations();
			case JointPackage_Ecore2MaudePackage.SRC_ECLASS__EALL_STRUCTURAL_FEATURES:
				return getEAllStructuralFeatures();
			case JointPackage_Ecore2MaudePackage.SRC_ECLASS__EALL_SUPER_TYPES:
				return getEAllSuperTypes();
			case JointPackage_Ecore2MaudePackage.SRC_ECLASS__EID_ATTRIBUTE:
				if (resolve) return getEIDAttribute();
				return basicGetEIDAttribute();
			case JointPackage_Ecore2MaudePackage.SRC_ECLASS__ESTRUCTURAL_FEATURES:
				return getEStructuralFeatures();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JointPackage_Ecore2MaudePackage.SRC_ECLASS__ABSTRACT:
				setAbstract((Boolean)newValue);
				return;
			case JointPackage_Ecore2MaudePackage.SRC_ECLASS__INTERFACE:
				setInterface((Boolean)newValue);
				return;
			case JointPackage_Ecore2MaudePackage.SRC_ECLASS__ESUPER_TYPES:
				getESuperTypes().clear();
				getESuperTypes().addAll((Collection<? extends SrcEClass>)newValue);
				return;
			case JointPackage_Ecore2MaudePackage.SRC_ECLASS__EOPERATIONS:
				getEOperations().clear();
				getEOperations().addAll((Collection<? extends SrcEOperation>)newValue);
				return;
			case JointPackage_Ecore2MaudePackage.SRC_ECLASS__ESTRUCTURAL_FEATURES:
				getEStructuralFeatures().clear();
				getEStructuralFeatures().addAll((Collection<? extends SrcEStructuralFeature>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case JointPackage_Ecore2MaudePackage.SRC_ECLASS__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case JointPackage_Ecore2MaudePackage.SRC_ECLASS__INTERFACE:
				setInterface(INTERFACE_EDEFAULT);
				return;
			case JointPackage_Ecore2MaudePackage.SRC_ECLASS__ESUPER_TYPES:
				getESuperTypes().clear();
				return;
			case JointPackage_Ecore2MaudePackage.SRC_ECLASS__EOPERATIONS:
				getEOperations().clear();
				return;
			case JointPackage_Ecore2MaudePackage.SRC_ECLASS__ESTRUCTURAL_FEATURES:
				getEStructuralFeatures().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case JointPackage_Ecore2MaudePackage.SRC_ECLASS__ABSTRACT:
				return abstract_ != ABSTRACT_EDEFAULT;
			case JointPackage_Ecore2MaudePackage.SRC_ECLASS__INTERFACE:
				return interface_ != INTERFACE_EDEFAULT;
			case JointPackage_Ecore2MaudePackage.SRC_ECLASS__ESUPER_TYPES:
				return eSuperTypes != null && !eSuperTypes.isEmpty();
			case JointPackage_Ecore2MaudePackage.SRC_ECLASS__EOPERATIONS:
				return eOperations != null && !eOperations.isEmpty();
			case JointPackage_Ecore2MaudePackage.SRC_ECLASS__EALL_ATTRIBUTES:
				return eAllAttributes != null && !eAllAttributes.isEmpty();
			case JointPackage_Ecore2MaudePackage.SRC_ECLASS__EALL_REFERENCES:
				return eAllReferences != null && !eAllReferences.isEmpty();
			case JointPackage_Ecore2MaudePackage.SRC_ECLASS__EREFERENCES:
				return eReferences != null && !eReferences.isEmpty();
			case JointPackage_Ecore2MaudePackage.SRC_ECLASS__EATTRIBUTES:
				return eAttributes != null && !eAttributes.isEmpty();
			case JointPackage_Ecore2MaudePackage.SRC_ECLASS__EALL_CONTAINMENTS:
				return eAllContainments != null && !eAllContainments.isEmpty();
			case JointPackage_Ecore2MaudePackage.SRC_ECLASS__EALL_OPERATIONS:
				return eAllOperations != null && !eAllOperations.isEmpty();
			case JointPackage_Ecore2MaudePackage.SRC_ECLASS__EALL_STRUCTURAL_FEATURES:
				return eAllStructuralFeatures != null && !eAllStructuralFeatures.isEmpty();
			case JointPackage_Ecore2MaudePackage.SRC_ECLASS__EALL_SUPER_TYPES:
				return eAllSuperTypes != null && !eAllSuperTypes.isEmpty();
			case JointPackage_Ecore2MaudePackage.SRC_ECLASS__EID_ATTRIBUTE:
				return eIDAttribute != null;
			case JointPackage_Ecore2MaudePackage.SRC_ECLASS__ESTRUCTURAL_FEATURES:
				return eStructuralFeatures != null && !eStructuralFeatures.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case JointPackage_Ecore2MaudePackage.SRC_ECLASS___IS_SUPER_TYPE_OF__SRCECLASS:
				return isSuperTypeOf((SrcEClass)arguments.get(0));
			case JointPackage_Ecore2MaudePackage.SRC_ECLASS___GET_FEATURE_COUNT:
				return getFeatureCount();
			case JointPackage_Ecore2MaudePackage.SRC_ECLASS___GET_ESTRUCTURAL_FEATURE__INT:
				return getEStructuralFeature((Integer)arguments.get(0));
			case JointPackage_Ecore2MaudePackage.SRC_ECLASS___GET_FEATURE_ID__SRCESTRUCTURALFEATURE:
				return getFeatureID((SrcEStructuralFeature)arguments.get(0));
			case JointPackage_Ecore2MaudePackage.SRC_ECLASS___GET_ESTRUCTURAL_FEATURE__STRING:
				return getEStructuralFeature((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (abstract: ");
		result.append(abstract_);
		result.append(", interface: ");
		result.append(interface_);
		result.append(')');
		return result.toString();
	}

} //SrcEClassImpl
