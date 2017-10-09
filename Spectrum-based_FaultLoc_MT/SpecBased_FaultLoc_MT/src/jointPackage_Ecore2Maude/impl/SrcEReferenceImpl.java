/**
 */
package jointPackage_Ecore2Maude.impl;

import java.util.Collection;

import jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage;
import jointPackage_Ecore2Maude.SrcEAttribute;
import jointPackage_Ecore2Maude.SrcEClass;
import jointPackage_Ecore2Maude.SrcEReference;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Src EReference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_Ecore2Maude.impl.SrcEReferenceImpl#isContainment <em>Containment</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.impl.SrcEReferenceImpl#isContainer <em>Container</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.impl.SrcEReferenceImpl#isResolveProxies <em>Resolve Proxies</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.impl.SrcEReferenceImpl#getEOpposite <em>EOpposite</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.impl.SrcEReferenceImpl#getEReferenceType <em>EReference Type</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.impl.SrcEReferenceImpl#getEKeys <em>EKeys</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SrcEReferenceImpl extends SrcEStructuralFeatureImpl implements SrcEReference {
	/**
	 * The default value of the '{@link #isContainment() <em>Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContainment()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONTAINMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isContainment() <em>Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContainment()
	 * @generated
	 * @ordered
	 */
	protected boolean containment = CONTAINMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isContainer() <em>Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContainer()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONTAINER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isContainer() <em>Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContainer()
	 * @generated
	 * @ordered
	 */
	protected boolean container = CONTAINER_EDEFAULT;

	/**
	 * The default value of the '{@link #isResolveProxies() <em>Resolve Proxies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResolveProxies()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RESOLVE_PROXIES_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isResolveProxies() <em>Resolve Proxies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResolveProxies()
	 * @generated
	 * @ordered
	 */
	protected boolean resolveProxies = RESOLVE_PROXIES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEOpposite() <em>EOpposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEOpposite()
	 * @generated
	 * @ordered
	 */
	protected SrcEReference eOpposite;

	/**
	 * The cached value of the '{@link #getEReferenceType() <em>EReference Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReferenceType()
	 * @generated
	 * @ordered
	 */
	protected SrcEClass eReferenceType;

	/**
	 * The cached value of the '{@link #getEKeys() <em>EKeys</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<SrcEAttribute> eKeys;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SrcEReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JointPackage_Ecore2MaudePackage.Literals.SRC_EREFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isContainment() {
		return containment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainment(boolean newContainment) {
		boolean oldContainment = containment;
		containment = newContainment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_Ecore2MaudePackage.SRC_EREFERENCE__CONTAINMENT, oldContainment, containment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isContainer() {
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isResolveProxies() {
		return resolveProxies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolveProxies(boolean newResolveProxies) {
		boolean oldResolveProxies = resolveProxies;
		resolveProxies = newResolveProxies;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_Ecore2MaudePackage.SRC_EREFERENCE__RESOLVE_PROXIES, oldResolveProxies, resolveProxies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcEReference getEOpposite() {
		if (eOpposite != null && eOpposite.eIsProxy()) {
			InternalEObject oldEOpposite = (InternalEObject)eOpposite;
			eOpposite = (SrcEReference)eResolveProxy(oldEOpposite);
			if (eOpposite != oldEOpposite) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JointPackage_Ecore2MaudePackage.SRC_EREFERENCE__EOPPOSITE, oldEOpposite, eOpposite));
			}
		}
		return eOpposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcEReference basicGetEOpposite() {
		return eOpposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEOpposite(SrcEReference newEOpposite) {
		SrcEReference oldEOpposite = eOpposite;
		eOpposite = newEOpposite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_Ecore2MaudePackage.SRC_EREFERENCE__EOPPOSITE, oldEOpposite, eOpposite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcEClass getEReferenceType() {
		if (eReferenceType != null && eReferenceType.eIsProxy()) {
			InternalEObject oldEReferenceType = (InternalEObject)eReferenceType;
			eReferenceType = (SrcEClass)eResolveProxy(oldEReferenceType);
			if (eReferenceType != oldEReferenceType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JointPackage_Ecore2MaudePackage.SRC_EREFERENCE__EREFERENCE_TYPE, oldEReferenceType, eReferenceType));
			}
		}
		return eReferenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcEClass basicGetEReferenceType() {
		return eReferenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReferenceType(SrcEClass newEReferenceType) {
		SrcEClass oldEReferenceType = eReferenceType;
		eReferenceType = newEReferenceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_Ecore2MaudePackage.SRC_EREFERENCE__EREFERENCE_TYPE, oldEReferenceType, eReferenceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SrcEAttribute> getEKeys() {
		if (eKeys == null) {
			eKeys = new EObjectResolvingEList<SrcEAttribute>(SrcEAttribute.class, this, JointPackage_Ecore2MaudePackage.SRC_EREFERENCE__EKEYS);
		}
		return eKeys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JointPackage_Ecore2MaudePackage.SRC_EREFERENCE__CONTAINMENT:
				return isContainment();
			case JointPackage_Ecore2MaudePackage.SRC_EREFERENCE__CONTAINER:
				return isContainer();
			case JointPackage_Ecore2MaudePackage.SRC_EREFERENCE__RESOLVE_PROXIES:
				return isResolveProxies();
			case JointPackage_Ecore2MaudePackage.SRC_EREFERENCE__EOPPOSITE:
				if (resolve) return getEOpposite();
				return basicGetEOpposite();
			case JointPackage_Ecore2MaudePackage.SRC_EREFERENCE__EREFERENCE_TYPE:
				if (resolve) return getEReferenceType();
				return basicGetEReferenceType();
			case JointPackage_Ecore2MaudePackage.SRC_EREFERENCE__EKEYS:
				return getEKeys();
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
			case JointPackage_Ecore2MaudePackage.SRC_EREFERENCE__CONTAINMENT:
				setContainment((Boolean)newValue);
				return;
			case JointPackage_Ecore2MaudePackage.SRC_EREFERENCE__RESOLVE_PROXIES:
				setResolveProxies((Boolean)newValue);
				return;
			case JointPackage_Ecore2MaudePackage.SRC_EREFERENCE__EOPPOSITE:
				setEOpposite((SrcEReference)newValue);
				return;
			case JointPackage_Ecore2MaudePackage.SRC_EREFERENCE__EREFERENCE_TYPE:
				setEReferenceType((SrcEClass)newValue);
				return;
			case JointPackage_Ecore2MaudePackage.SRC_EREFERENCE__EKEYS:
				getEKeys().clear();
				getEKeys().addAll((Collection<? extends SrcEAttribute>)newValue);
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
			case JointPackage_Ecore2MaudePackage.SRC_EREFERENCE__CONTAINMENT:
				setContainment(CONTAINMENT_EDEFAULT);
				return;
			case JointPackage_Ecore2MaudePackage.SRC_EREFERENCE__RESOLVE_PROXIES:
				setResolveProxies(RESOLVE_PROXIES_EDEFAULT);
				return;
			case JointPackage_Ecore2MaudePackage.SRC_EREFERENCE__EOPPOSITE:
				setEOpposite((SrcEReference)null);
				return;
			case JointPackage_Ecore2MaudePackage.SRC_EREFERENCE__EREFERENCE_TYPE:
				setEReferenceType((SrcEClass)null);
				return;
			case JointPackage_Ecore2MaudePackage.SRC_EREFERENCE__EKEYS:
				getEKeys().clear();
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
			case JointPackage_Ecore2MaudePackage.SRC_EREFERENCE__CONTAINMENT:
				return containment != CONTAINMENT_EDEFAULT;
			case JointPackage_Ecore2MaudePackage.SRC_EREFERENCE__CONTAINER:
				return container != CONTAINER_EDEFAULT;
			case JointPackage_Ecore2MaudePackage.SRC_EREFERENCE__RESOLVE_PROXIES:
				return resolveProxies != RESOLVE_PROXIES_EDEFAULT;
			case JointPackage_Ecore2MaudePackage.SRC_EREFERENCE__EOPPOSITE:
				return eOpposite != null;
			case JointPackage_Ecore2MaudePackage.SRC_EREFERENCE__EREFERENCE_TYPE:
				return eReferenceType != null;
			case JointPackage_Ecore2MaudePackage.SRC_EREFERENCE__EKEYS:
				return eKeys != null && !eKeys.isEmpty();
		}
		return super.eIsSet(featureID);
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
		result.append(" (containment: ");
		result.append(containment);
		result.append(", container: ");
		result.append(container);
		result.append(", resolveProxies: ");
		result.append(resolveProxies);
		result.append(')');
		return result.toString();
	}

} //SrcEReferenceImpl
