/**
 */
package jointPackage_CPL2SPL.impl;

import java.util.Collection;

import jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage;
import jointPackage_CPL2SPL.SrcPrioritySwitch;
import jointPackage_CPL2SPL.SrcSwitchedPriority;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Src Priority Switch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_CPL2SPL.impl.SrcPrioritySwitchImpl#getPriorities <em>Priorities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SrcPrioritySwitchImpl extends SrcSwitchImpl implements SrcPrioritySwitch {
	/**
	 * The cached value of the '{@link #getPriorities() <em>Priorities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorities()
	 * @generated
	 * @ordered
	 */
	protected EList<SrcSwitchedPriority> priorities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SrcPrioritySwitchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JointPackage_CPL2SPLPackage.Literals.SRC_PRIORITY_SWITCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SrcSwitchedPriority> getPriorities() {
		if (priorities == null) {
			priorities = new EObjectContainmentEList<SrcSwitchedPriority>(SrcSwitchedPriority.class, this, JointPackage_CPL2SPLPackage.SRC_PRIORITY_SWITCH__PRIORITIES);
		}
		return priorities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JointPackage_CPL2SPLPackage.SRC_PRIORITY_SWITCH__PRIORITIES:
				return ((InternalEList<?>)getPriorities()).basicRemove(otherEnd, msgs);
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
			case JointPackage_CPL2SPLPackage.SRC_PRIORITY_SWITCH__PRIORITIES:
				return getPriorities();
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
			case JointPackage_CPL2SPLPackage.SRC_PRIORITY_SWITCH__PRIORITIES:
				getPriorities().clear();
				getPriorities().addAll((Collection<? extends SrcSwitchedPriority>)newValue);
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
			case JointPackage_CPL2SPLPackage.SRC_PRIORITY_SWITCH__PRIORITIES:
				getPriorities().clear();
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
			case JointPackage_CPL2SPLPackage.SRC_PRIORITY_SWITCH__PRIORITIES:
				return priorities != null && !priorities.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SrcPrioritySwitchImpl
