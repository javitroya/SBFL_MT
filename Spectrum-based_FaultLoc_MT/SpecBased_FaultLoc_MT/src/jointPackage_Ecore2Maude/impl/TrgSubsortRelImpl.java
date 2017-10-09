/**
 */
package jointPackage_Ecore2Maude.impl;

import java.util.Collection;

import jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage;
import jointPackage_Ecore2Maude.TrgSort;
import jointPackage_Ecore2Maude.TrgSubsortRel;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trg Subsort Rel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_Ecore2Maude.impl.TrgSubsortRelImpl#getSubsorts <em>Subsorts</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.impl.TrgSubsortRelImpl#getSupersorts <em>Supersorts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrgSubsortRelImpl extends TrgModElementImpl implements TrgSubsortRel {
	/**
	 * The cached value of the '{@link #getSubsorts() <em>Subsorts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsorts()
	 * @generated
	 * @ordered
	 */
	protected EList<TrgSort> subsorts;

	/**
	 * The cached value of the '{@link #getSupersorts() <em>Supersorts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupersorts()
	 * @generated
	 * @ordered
	 */
	protected EList<TrgSort> supersorts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrgSubsortRelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JointPackage_Ecore2MaudePackage.Literals.TRG_SUBSORT_REL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TrgSort> getSubsorts() {
		if (subsorts == null) {
			subsorts = new EObjectWithInverseResolvingEList.ManyInverse<TrgSort>(TrgSort.class, this, JointPackage_Ecore2MaudePackage.TRG_SUBSORT_REL__SUBSORTS, JointPackage_Ecore2MaudePackage.TRG_SORT__SUPERSORT_RELS);
		}
		return subsorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TrgSort> getSupersorts() {
		if (supersorts == null) {
			supersorts = new EObjectWithInverseResolvingEList.ManyInverse<TrgSort>(TrgSort.class, this, JointPackage_Ecore2MaudePackage.TRG_SUBSORT_REL__SUPERSORTS, JointPackage_Ecore2MaudePackage.TRG_SORT__SUBSORT_RELS);
		}
		return supersorts;
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
			case JointPackage_Ecore2MaudePackage.TRG_SUBSORT_REL__SUBSORTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubsorts()).basicAdd(otherEnd, msgs);
			case JointPackage_Ecore2MaudePackage.TRG_SUBSORT_REL__SUPERSORTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSupersorts()).basicAdd(otherEnd, msgs);
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
			case JointPackage_Ecore2MaudePackage.TRG_SUBSORT_REL__SUBSORTS:
				return ((InternalEList<?>)getSubsorts()).basicRemove(otherEnd, msgs);
			case JointPackage_Ecore2MaudePackage.TRG_SUBSORT_REL__SUPERSORTS:
				return ((InternalEList<?>)getSupersorts()).basicRemove(otherEnd, msgs);
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
			case JointPackage_Ecore2MaudePackage.TRG_SUBSORT_REL__SUBSORTS:
				return getSubsorts();
			case JointPackage_Ecore2MaudePackage.TRG_SUBSORT_REL__SUPERSORTS:
				return getSupersorts();
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
			case JointPackage_Ecore2MaudePackage.TRG_SUBSORT_REL__SUBSORTS:
				getSubsorts().clear();
				getSubsorts().addAll((Collection<? extends TrgSort>)newValue);
				return;
			case JointPackage_Ecore2MaudePackage.TRG_SUBSORT_REL__SUPERSORTS:
				getSupersorts().clear();
				getSupersorts().addAll((Collection<? extends TrgSort>)newValue);
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
			case JointPackage_Ecore2MaudePackage.TRG_SUBSORT_REL__SUBSORTS:
				getSubsorts().clear();
				return;
			case JointPackage_Ecore2MaudePackage.TRG_SUBSORT_REL__SUPERSORTS:
				getSupersorts().clear();
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
			case JointPackage_Ecore2MaudePackage.TRG_SUBSORT_REL__SUBSORTS:
				return subsorts != null && !subsorts.isEmpty();
			case JointPackage_Ecore2MaudePackage.TRG_SUBSORT_REL__SUPERSORTS:
				return supersorts != null && !supersorts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TrgSubsortRelImpl
