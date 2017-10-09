/**
 */
package jointPackage_CPL2SPL.impl;

import jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage;
import jointPackage_CPL2SPL.SrcNotPresent;
import jointPackage_CPL2SPL.SrcOtherwise;
import jointPackage_CPL2SPL.SrcSwitch;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Src Switch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_CPL2SPL.impl.SrcSwitchImpl#getNotPresent <em>Not Present</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.impl.SrcSwitchImpl#getOtherwise <em>Otherwise</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SrcSwitchImpl extends SrcNodeImpl implements SrcSwitch {
	/**
	 * The cached value of the '{@link #getNotPresent() <em>Not Present</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotPresent()
	 * @generated
	 * @ordered
	 */
	protected SrcNotPresent notPresent;

	/**
	 * The cached value of the '{@link #getOtherwise() <em>Otherwise</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherwise()
	 * @generated
	 * @ordered
	 */
	protected SrcOtherwise otherwise;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SrcSwitchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JointPackage_CPL2SPLPackage.Literals.SRC_SWITCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcNotPresent getNotPresent() {
		return notPresent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNotPresent(SrcNotPresent newNotPresent, NotificationChain msgs) {
		SrcNotPresent oldNotPresent = notPresent;
		notPresent = newNotPresent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.SRC_SWITCH__NOT_PRESENT, oldNotPresent, newNotPresent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotPresent(SrcNotPresent newNotPresent) {
		if (newNotPresent != notPresent) {
			NotificationChain msgs = null;
			if (notPresent != null)
				msgs = ((InternalEObject)notPresent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JointPackage_CPL2SPLPackage.SRC_SWITCH__NOT_PRESENT, null, msgs);
			if (newNotPresent != null)
				msgs = ((InternalEObject)newNotPresent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JointPackage_CPL2SPLPackage.SRC_SWITCH__NOT_PRESENT, null, msgs);
			msgs = basicSetNotPresent(newNotPresent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.SRC_SWITCH__NOT_PRESENT, newNotPresent, newNotPresent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcOtherwise getOtherwise() {
		return otherwise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOtherwise(SrcOtherwise newOtherwise, NotificationChain msgs) {
		SrcOtherwise oldOtherwise = otherwise;
		otherwise = newOtherwise;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.SRC_SWITCH__OTHERWISE, oldOtherwise, newOtherwise);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtherwise(SrcOtherwise newOtherwise) {
		if (newOtherwise != otherwise) {
			NotificationChain msgs = null;
			if (otherwise != null)
				msgs = ((InternalEObject)otherwise).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JointPackage_CPL2SPLPackage.SRC_SWITCH__OTHERWISE, null, msgs);
			if (newOtherwise != null)
				msgs = ((InternalEObject)newOtherwise).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JointPackage_CPL2SPLPackage.SRC_SWITCH__OTHERWISE, null, msgs);
			msgs = basicSetOtherwise(newOtherwise, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.SRC_SWITCH__OTHERWISE, newOtherwise, newOtherwise));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JointPackage_CPL2SPLPackage.SRC_SWITCH__NOT_PRESENT:
				return basicSetNotPresent(null, msgs);
			case JointPackage_CPL2SPLPackage.SRC_SWITCH__OTHERWISE:
				return basicSetOtherwise(null, msgs);
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
			case JointPackage_CPL2SPLPackage.SRC_SWITCH__NOT_PRESENT:
				return getNotPresent();
			case JointPackage_CPL2SPLPackage.SRC_SWITCH__OTHERWISE:
				return getOtherwise();
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
			case JointPackage_CPL2SPLPackage.SRC_SWITCH__NOT_PRESENT:
				setNotPresent((SrcNotPresent)newValue);
				return;
			case JointPackage_CPL2SPLPackage.SRC_SWITCH__OTHERWISE:
				setOtherwise((SrcOtherwise)newValue);
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
			case JointPackage_CPL2SPLPackage.SRC_SWITCH__NOT_PRESENT:
				setNotPresent((SrcNotPresent)null);
				return;
			case JointPackage_CPL2SPLPackage.SRC_SWITCH__OTHERWISE:
				setOtherwise((SrcOtherwise)null);
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
			case JointPackage_CPL2SPLPackage.SRC_SWITCH__NOT_PRESENT:
				return notPresent != null;
			case JointPackage_CPL2SPLPackage.SRC_SWITCH__OTHERWISE:
				return otherwise != null;
		}
		return super.eIsSet(featureID);
	}

} //SrcSwitchImpl
