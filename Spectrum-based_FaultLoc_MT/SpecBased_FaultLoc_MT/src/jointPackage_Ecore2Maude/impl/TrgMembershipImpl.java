/**
 */
package jointPackage_Ecore2Maude.impl;

import jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage;
import jointPackage_Ecore2Maude.TrgMembership;
import jointPackage_Ecore2Maude.TrgSort;
import jointPackage_Ecore2Maude.TrgTerm;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trg Membership</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_Ecore2Maude.impl.TrgMembershipImpl#getTerm <em>Term</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.impl.TrgMembershipImpl#getSort <em>Sort</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrgMembershipImpl extends TrgStatementImpl implements TrgMembership {
	/**
	 * The cached value of the '{@link #getTerm() <em>Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerm()
	 * @generated
	 * @ordered
	 */
	protected TrgTerm term;

	/**
	 * The cached value of the '{@link #getSort() <em>Sort</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSort()
	 * @generated
	 * @ordered
	 */
	protected TrgSort sort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrgMembershipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JointPackage_Ecore2MaudePackage.Literals.TRG_MEMBERSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgTerm getTerm() {
		return term;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTerm(TrgTerm newTerm, NotificationChain msgs) {
		TrgTerm oldTerm = term;
		term = newTerm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JointPackage_Ecore2MaudePackage.TRG_MEMBERSHIP__TERM, oldTerm, newTerm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerm(TrgTerm newTerm) {
		if (newTerm != term) {
			NotificationChain msgs = null;
			if (term != null)
				msgs = ((InternalEObject)term).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JointPackage_Ecore2MaudePackage.TRG_MEMBERSHIP__TERM, null, msgs);
			if (newTerm != null)
				msgs = ((InternalEObject)newTerm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JointPackage_Ecore2MaudePackage.TRG_MEMBERSHIP__TERM, null, msgs);
			msgs = basicSetTerm(newTerm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_Ecore2MaudePackage.TRG_MEMBERSHIP__TERM, newTerm, newTerm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgSort getSort() {
		if (sort != null && sort.eIsProxy()) {
			InternalEObject oldSort = (InternalEObject)sort;
			sort = (TrgSort)eResolveProxy(oldSort);
			if (sort != oldSort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JointPackage_Ecore2MaudePackage.TRG_MEMBERSHIP__SORT, oldSort, sort));
			}
		}
		return sort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgSort basicGetSort() {
		return sort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSort(TrgSort newSort) {
		TrgSort oldSort = sort;
		sort = newSort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_Ecore2MaudePackage.TRG_MEMBERSHIP__SORT, oldSort, sort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JointPackage_Ecore2MaudePackage.TRG_MEMBERSHIP__TERM:
				return basicSetTerm(null, msgs);
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
			case JointPackage_Ecore2MaudePackage.TRG_MEMBERSHIP__TERM:
				return getTerm();
			case JointPackage_Ecore2MaudePackage.TRG_MEMBERSHIP__SORT:
				if (resolve) return getSort();
				return basicGetSort();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JointPackage_Ecore2MaudePackage.TRG_MEMBERSHIP__TERM:
				setTerm((TrgTerm)newValue);
				return;
			case JointPackage_Ecore2MaudePackage.TRG_MEMBERSHIP__SORT:
				setSort((TrgSort)newValue);
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
			case JointPackage_Ecore2MaudePackage.TRG_MEMBERSHIP__TERM:
				setTerm((TrgTerm)null);
				return;
			case JointPackage_Ecore2MaudePackage.TRG_MEMBERSHIP__SORT:
				setSort((TrgSort)null);
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
			case JointPackage_Ecore2MaudePackage.TRG_MEMBERSHIP__TERM:
				return term != null;
			case JointPackage_Ecore2MaudePackage.TRG_MEMBERSHIP__SORT:
				return sort != null;
		}
		return super.eIsSet(featureID);
	}

} //TrgMembershipImpl
