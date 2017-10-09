/**
 */
package jointPackage_CPL2SPL.impl;

import jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage;
import jointPackage_CPL2SPL.TrgExpression;
import jointPackage_CPL2SPL.TrgNamedBranch;
import jointPackage_CPL2SPL.TrgReturnStat;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trg Return Stat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_CPL2SPL.impl.TrgReturnStatImpl#getReturnedValue <em>Returned Value</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.impl.TrgReturnStatImpl#getBranch <em>Branch</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrgReturnStatImpl extends TrgStatementImpl implements TrgReturnStat {
	/**
	 * The cached value of the '{@link #getReturnedValue() <em>Returned Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnedValue()
	 * @generated
	 * @ordered
	 */
	protected TrgExpression returnedValue;

	/**
	 * The cached value of the '{@link #getBranch() <em>Branch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranch()
	 * @generated
	 * @ordered
	 */
	protected TrgNamedBranch branch;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrgReturnStatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JointPackage_CPL2SPLPackage.Literals.TRG_RETURN_STAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgExpression getReturnedValue() {
		return returnedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturnedValue(TrgExpression newReturnedValue, NotificationChain msgs) {
		TrgExpression oldReturnedValue = returnedValue;
		returnedValue = newReturnedValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.TRG_RETURN_STAT__RETURNED_VALUE, oldReturnedValue, newReturnedValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnedValue(TrgExpression newReturnedValue) {
		if (newReturnedValue != returnedValue) {
			NotificationChain msgs = null;
			if (returnedValue != null)
				msgs = ((InternalEObject)returnedValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JointPackage_CPL2SPLPackage.TRG_RETURN_STAT__RETURNED_VALUE, null, msgs);
			if (newReturnedValue != null)
				msgs = ((InternalEObject)newReturnedValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JointPackage_CPL2SPLPackage.TRG_RETURN_STAT__RETURNED_VALUE, null, msgs);
			msgs = basicSetReturnedValue(newReturnedValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.TRG_RETURN_STAT__RETURNED_VALUE, newReturnedValue, newReturnedValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgNamedBranch getBranch() {
		if (branch != null && branch.eIsProxy()) {
			InternalEObject oldBranch = (InternalEObject)branch;
			branch = (TrgNamedBranch)eResolveProxy(oldBranch);
			if (branch != oldBranch) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JointPackage_CPL2SPLPackage.TRG_RETURN_STAT__BRANCH, oldBranch, branch));
			}
		}
		return branch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgNamedBranch basicGetBranch() {
		return branch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBranch(TrgNamedBranch newBranch) {
		TrgNamedBranch oldBranch = branch;
		branch = newBranch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.TRG_RETURN_STAT__BRANCH, oldBranch, branch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JointPackage_CPL2SPLPackage.TRG_RETURN_STAT__RETURNED_VALUE:
				return basicSetReturnedValue(null, msgs);
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
			case JointPackage_CPL2SPLPackage.TRG_RETURN_STAT__RETURNED_VALUE:
				return getReturnedValue();
			case JointPackage_CPL2SPLPackage.TRG_RETURN_STAT__BRANCH:
				if (resolve) return getBranch();
				return basicGetBranch();
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
			case JointPackage_CPL2SPLPackage.TRG_RETURN_STAT__RETURNED_VALUE:
				setReturnedValue((TrgExpression)newValue);
				return;
			case JointPackage_CPL2SPLPackage.TRG_RETURN_STAT__BRANCH:
				setBranch((TrgNamedBranch)newValue);
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
			case JointPackage_CPL2SPLPackage.TRG_RETURN_STAT__RETURNED_VALUE:
				setReturnedValue((TrgExpression)null);
				return;
			case JointPackage_CPL2SPLPackage.TRG_RETURN_STAT__BRANCH:
				setBranch((TrgNamedBranch)null);
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
			case JointPackage_CPL2SPLPackage.TRG_RETURN_STAT__RETURNED_VALUE:
				return returnedValue != null;
			case JointPackage_CPL2SPLPackage.TRG_RETURN_STAT__BRANCH:
				return branch != null;
		}
		return super.eIsSet(featureID);
	}

} //TrgReturnStatImpl
