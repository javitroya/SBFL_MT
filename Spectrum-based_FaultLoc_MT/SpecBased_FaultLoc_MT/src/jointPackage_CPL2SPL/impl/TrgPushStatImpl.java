/**
 */
package jointPackage_CPL2SPL.impl;

import jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage;
import jointPackage_CPL2SPL.TrgExpression;
import jointPackage_CPL2SPL.TrgPlace;
import jointPackage_CPL2SPL.TrgPushStat;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trg Push Stat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_CPL2SPL.impl.TrgPushStatImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.impl.TrgPushStatImpl#getPushedValue <em>Pushed Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrgPushStatImpl extends TrgStatementImpl implements TrgPushStat {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected TrgPlace target;

	/**
	 * The cached value of the '{@link #getPushedValue() <em>Pushed Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPushedValue()
	 * @generated
	 * @ordered
	 */
	protected TrgExpression pushedValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrgPushStatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JointPackage_CPL2SPLPackage.Literals.TRG_PUSH_STAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgPlace getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(TrgPlace newTarget, NotificationChain msgs) {
		TrgPlace oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.TRG_PUSH_STAT__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(TrgPlace newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JointPackage_CPL2SPLPackage.TRG_PUSH_STAT__TARGET, null, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JointPackage_CPL2SPLPackage.TRG_PUSH_STAT__TARGET, null, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.TRG_PUSH_STAT__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgExpression getPushedValue() {
		return pushedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPushedValue(TrgExpression newPushedValue, NotificationChain msgs) {
		TrgExpression oldPushedValue = pushedValue;
		pushedValue = newPushedValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.TRG_PUSH_STAT__PUSHED_VALUE, oldPushedValue, newPushedValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPushedValue(TrgExpression newPushedValue) {
		if (newPushedValue != pushedValue) {
			NotificationChain msgs = null;
			if (pushedValue != null)
				msgs = ((InternalEObject)pushedValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JointPackage_CPL2SPLPackage.TRG_PUSH_STAT__PUSHED_VALUE, null, msgs);
			if (newPushedValue != null)
				msgs = ((InternalEObject)newPushedValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JointPackage_CPL2SPLPackage.TRG_PUSH_STAT__PUSHED_VALUE, null, msgs);
			msgs = basicSetPushedValue(newPushedValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.TRG_PUSH_STAT__PUSHED_VALUE, newPushedValue, newPushedValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JointPackage_CPL2SPLPackage.TRG_PUSH_STAT__TARGET:
				return basicSetTarget(null, msgs);
			case JointPackage_CPL2SPLPackage.TRG_PUSH_STAT__PUSHED_VALUE:
				return basicSetPushedValue(null, msgs);
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
			case JointPackage_CPL2SPLPackage.TRG_PUSH_STAT__TARGET:
				return getTarget();
			case JointPackage_CPL2SPLPackage.TRG_PUSH_STAT__PUSHED_VALUE:
				return getPushedValue();
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
			case JointPackage_CPL2SPLPackage.TRG_PUSH_STAT__TARGET:
				setTarget((TrgPlace)newValue);
				return;
			case JointPackage_CPL2SPLPackage.TRG_PUSH_STAT__PUSHED_VALUE:
				setPushedValue((TrgExpression)newValue);
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
			case JointPackage_CPL2SPLPackage.TRG_PUSH_STAT__TARGET:
				setTarget((TrgPlace)null);
				return;
			case JointPackage_CPL2SPLPackage.TRG_PUSH_STAT__PUSHED_VALUE:
				setPushedValue((TrgExpression)null);
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
			case JointPackage_CPL2SPLPackage.TRG_PUSH_STAT__TARGET:
				return target != null;
			case JointPackage_CPL2SPLPackage.TRG_PUSH_STAT__PUSHED_VALUE:
				return pushedValue != null;
		}
		return super.eIsSet(featureID);
	}

} //TrgPushStatImpl
