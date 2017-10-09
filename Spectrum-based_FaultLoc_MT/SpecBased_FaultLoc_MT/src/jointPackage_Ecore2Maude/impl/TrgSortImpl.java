/**
 */
package jointPackage_Ecore2Maude.impl;

import java.util.Collection;

import jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage;
import jointPackage_Ecore2Maude.TrgKind;
import jointPackage_Ecore2Maude.TrgModElement;
import jointPackage_Ecore2Maude.TrgModule;
import jointPackage_Ecore2Maude.TrgSort;
import jointPackage_Ecore2Maude.TrgSubsortRel;
import jointPackage_Ecore2Maude.TrgTheory;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trg Sort</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_Ecore2Maude.impl.TrgSortImpl#getModule <em>Module</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.impl.TrgSortImpl#getTheory <em>Theory</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.impl.TrgSortImpl#getSubsortRels <em>Subsort Rels</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.impl.TrgSortImpl#getSupersortRels <em>Supersort Rels</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.impl.TrgSortImpl#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrgSortImpl extends TrgTypeImpl implements TrgSort {
	/**
	 * The cached value of the '{@link #getSubsortRels() <em>Subsort Rels</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsortRels()
	 * @generated
	 * @ordered
	 */
	protected EList<TrgSubsortRel> subsortRels;

	/**
	 * The cached value of the '{@link #getSupersortRels() <em>Supersort Rels</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupersortRels()
	 * @generated
	 * @ordered
	 */
	protected EList<TrgSubsortRel> supersortRels;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected TrgKind kind;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrgSortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JointPackage_Ecore2MaudePackage.Literals.TRG_SORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgModule getModule() {
		if (eContainerFeatureID() != JointPackage_Ecore2MaudePackage.TRG_SORT__MODULE) return null;
		return (TrgModule)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModule(TrgModule newModule, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newModule, JointPackage_Ecore2MaudePackage.TRG_SORT__MODULE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModule(TrgModule newModule) {
		if (newModule != eInternalContainer() || (eContainerFeatureID() != JointPackage_Ecore2MaudePackage.TRG_SORT__MODULE && newModule != null)) {
			if (EcoreUtil.isAncestor(this, newModule))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModule != null)
				msgs = ((InternalEObject)newModule).eInverseAdd(this, JointPackage_Ecore2MaudePackage.TRG_MODULE__ELS, TrgModule.class, msgs);
			msgs = basicSetModule(newModule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_Ecore2MaudePackage.TRG_SORT__MODULE, newModule, newModule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgTheory getTheory() {
		if (eContainerFeatureID() != JointPackage_Ecore2MaudePackage.TRG_SORT__THEORY) return null;
		return (TrgTheory)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheory(TrgTheory newTheory, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTheory, JointPackage_Ecore2MaudePackage.TRG_SORT__THEORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheory(TrgTheory newTheory) {
		if (newTheory != eInternalContainer() || (eContainerFeatureID() != JointPackage_Ecore2MaudePackage.TRG_SORT__THEORY && newTheory != null)) {
			if (EcoreUtil.isAncestor(this, newTheory))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTheory != null)
				msgs = ((InternalEObject)newTheory).eInverseAdd(this, JointPackage_Ecore2MaudePackage.TRG_THEORY__ELS, TrgTheory.class, msgs);
			msgs = basicSetTheory(newTheory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_Ecore2MaudePackage.TRG_SORT__THEORY, newTheory, newTheory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TrgSubsortRel> getSubsortRels() {
		if (subsortRels == null) {
			subsortRels = new EObjectWithInverseResolvingEList.ManyInverse<TrgSubsortRel>(TrgSubsortRel.class, this, JointPackage_Ecore2MaudePackage.TRG_SORT__SUBSORT_RELS, JointPackage_Ecore2MaudePackage.TRG_SUBSORT_REL__SUPERSORTS);
		}
		return subsortRels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TrgSubsortRel> getSupersortRels() {
		if (supersortRels == null) {
			supersortRels = new EObjectWithInverseResolvingEList.ManyInverse<TrgSubsortRel>(TrgSubsortRel.class, this, JointPackage_Ecore2MaudePackage.TRG_SORT__SUPERSORT_RELS, JointPackage_Ecore2MaudePackage.TRG_SUBSORT_REL__SUBSORTS);
		}
		return supersortRels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgKind getKind() {
		if (kind != null && kind.eIsProxy()) {
			InternalEObject oldKind = (InternalEObject)kind;
			kind = (TrgKind)eResolveProxy(oldKind);
			if (kind != oldKind) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JointPackage_Ecore2MaudePackage.TRG_SORT__KIND, oldKind, kind));
			}
		}
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgKind basicGetKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKind(TrgKind newKind, NotificationChain msgs) {
		TrgKind oldKind = kind;
		kind = newKind;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JointPackage_Ecore2MaudePackage.TRG_SORT__KIND, oldKind, newKind);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(TrgKind newKind) {
		if (newKind != kind) {
			NotificationChain msgs = null;
			if (kind != null)
				msgs = ((InternalEObject)kind).eInverseRemove(this, JointPackage_Ecore2MaudePackage.TRG_KIND__SORTS, TrgKind.class, msgs);
			if (newKind != null)
				msgs = ((InternalEObject)newKind).eInverseAdd(this, JointPackage_Ecore2MaudePackage.TRG_KIND__SORTS, TrgKind.class, msgs);
			msgs = basicSetKind(newKind, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_Ecore2MaudePackage.TRG_SORT__KIND, newKind, newKind));
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
			case JointPackage_Ecore2MaudePackage.TRG_SORT__MODULE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetModule((TrgModule)otherEnd, msgs);
			case JointPackage_Ecore2MaudePackage.TRG_SORT__THEORY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTheory((TrgTheory)otherEnd, msgs);
			case JointPackage_Ecore2MaudePackage.TRG_SORT__SUBSORT_RELS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubsortRels()).basicAdd(otherEnd, msgs);
			case JointPackage_Ecore2MaudePackage.TRG_SORT__SUPERSORT_RELS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSupersortRels()).basicAdd(otherEnd, msgs);
			case JointPackage_Ecore2MaudePackage.TRG_SORT__KIND:
				if (kind != null)
					msgs = ((InternalEObject)kind).eInverseRemove(this, JointPackage_Ecore2MaudePackage.TRG_KIND__SORTS, TrgKind.class, msgs);
				return basicSetKind((TrgKind)otherEnd, msgs);
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
			case JointPackage_Ecore2MaudePackage.TRG_SORT__MODULE:
				return basicSetModule(null, msgs);
			case JointPackage_Ecore2MaudePackage.TRG_SORT__THEORY:
				return basicSetTheory(null, msgs);
			case JointPackage_Ecore2MaudePackage.TRG_SORT__SUBSORT_RELS:
				return ((InternalEList<?>)getSubsortRels()).basicRemove(otherEnd, msgs);
			case JointPackage_Ecore2MaudePackage.TRG_SORT__SUPERSORT_RELS:
				return ((InternalEList<?>)getSupersortRels()).basicRemove(otherEnd, msgs);
			case JointPackage_Ecore2MaudePackage.TRG_SORT__KIND:
				return basicSetKind(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case JointPackage_Ecore2MaudePackage.TRG_SORT__MODULE:
				return eInternalContainer().eInverseRemove(this, JointPackage_Ecore2MaudePackage.TRG_MODULE__ELS, TrgModule.class, msgs);
			case JointPackage_Ecore2MaudePackage.TRG_SORT__THEORY:
				return eInternalContainer().eInverseRemove(this, JointPackage_Ecore2MaudePackage.TRG_THEORY__ELS, TrgTheory.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JointPackage_Ecore2MaudePackage.TRG_SORT__MODULE:
				return getModule();
			case JointPackage_Ecore2MaudePackage.TRG_SORT__THEORY:
				return getTheory();
			case JointPackage_Ecore2MaudePackage.TRG_SORT__SUBSORT_RELS:
				return getSubsortRels();
			case JointPackage_Ecore2MaudePackage.TRG_SORT__SUPERSORT_RELS:
				return getSupersortRels();
			case JointPackage_Ecore2MaudePackage.TRG_SORT__KIND:
				if (resolve) return getKind();
				return basicGetKind();
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
			case JointPackage_Ecore2MaudePackage.TRG_SORT__MODULE:
				setModule((TrgModule)newValue);
				return;
			case JointPackage_Ecore2MaudePackage.TRG_SORT__THEORY:
				setTheory((TrgTheory)newValue);
				return;
			case JointPackage_Ecore2MaudePackage.TRG_SORT__SUBSORT_RELS:
				getSubsortRels().clear();
				getSubsortRels().addAll((Collection<? extends TrgSubsortRel>)newValue);
				return;
			case JointPackage_Ecore2MaudePackage.TRG_SORT__SUPERSORT_RELS:
				getSupersortRels().clear();
				getSupersortRels().addAll((Collection<? extends TrgSubsortRel>)newValue);
				return;
			case JointPackage_Ecore2MaudePackage.TRG_SORT__KIND:
				setKind((TrgKind)newValue);
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
			case JointPackage_Ecore2MaudePackage.TRG_SORT__MODULE:
				setModule((TrgModule)null);
				return;
			case JointPackage_Ecore2MaudePackage.TRG_SORT__THEORY:
				setTheory((TrgTheory)null);
				return;
			case JointPackage_Ecore2MaudePackage.TRG_SORT__SUBSORT_RELS:
				getSubsortRels().clear();
				return;
			case JointPackage_Ecore2MaudePackage.TRG_SORT__SUPERSORT_RELS:
				getSupersortRels().clear();
				return;
			case JointPackage_Ecore2MaudePackage.TRG_SORT__KIND:
				setKind((TrgKind)null);
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
			case JointPackage_Ecore2MaudePackage.TRG_SORT__MODULE:
				return getModule() != null;
			case JointPackage_Ecore2MaudePackage.TRG_SORT__THEORY:
				return getTheory() != null;
			case JointPackage_Ecore2MaudePackage.TRG_SORT__SUBSORT_RELS:
				return subsortRels != null && !subsortRels.isEmpty();
			case JointPackage_Ecore2MaudePackage.TRG_SORT__SUPERSORT_RELS:
				return supersortRels != null && !supersortRels.isEmpty();
			case JointPackage_Ecore2MaudePackage.TRG_SORT__KIND:
				return kind != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == TrgModElement.class) {
			switch (derivedFeatureID) {
				case JointPackage_Ecore2MaudePackage.TRG_SORT__MODULE: return JointPackage_Ecore2MaudePackage.TRG_MOD_ELEMENT__MODULE;
				case JointPackage_Ecore2MaudePackage.TRG_SORT__THEORY: return JointPackage_Ecore2MaudePackage.TRG_MOD_ELEMENT__THEORY;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == TrgModElement.class) {
			switch (baseFeatureID) {
				case JointPackage_Ecore2MaudePackage.TRG_MOD_ELEMENT__MODULE: return JointPackage_Ecore2MaudePackage.TRG_SORT__MODULE;
				case JointPackage_Ecore2MaudePackage.TRG_MOD_ELEMENT__THEORY: return JointPackage_Ecore2MaudePackage.TRG_SORT__THEORY;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //TrgSortImpl
