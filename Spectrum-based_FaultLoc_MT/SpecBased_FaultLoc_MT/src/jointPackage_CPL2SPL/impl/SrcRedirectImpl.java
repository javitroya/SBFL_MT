/**
 */
package jointPackage_CPL2SPL.impl;

import jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage;
import jointPackage_CPL2SPL.SrcRedirect;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Src Redirect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_CPL2SPL.impl.SrcRedirectImpl#getPermanent <em>Permanent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SrcRedirectImpl extends SrcSignallingActionImpl implements SrcRedirect {
	/**
	 * The default value of the '{@link #getPermanent() <em>Permanent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermanent()
	 * @generated
	 * @ordered
	 */
	protected static final String PERMANENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPermanent() <em>Permanent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermanent()
	 * @generated
	 * @ordered
	 */
	protected String permanent = PERMANENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SrcRedirectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JointPackage_CPL2SPLPackage.Literals.SRC_REDIRECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPermanent() {
		return permanent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPermanent(String newPermanent) {
		String oldPermanent = permanent;
		permanent = newPermanent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.SRC_REDIRECT__PERMANENT, oldPermanent, permanent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JointPackage_CPL2SPLPackage.SRC_REDIRECT__PERMANENT:
				return getPermanent();
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
			case JointPackage_CPL2SPLPackage.SRC_REDIRECT__PERMANENT:
				setPermanent((String)newValue);
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
			case JointPackage_CPL2SPLPackage.SRC_REDIRECT__PERMANENT:
				setPermanent(PERMANENT_EDEFAULT);
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
			case JointPackage_CPL2SPLPackage.SRC_REDIRECT__PERMANENT:
				return PERMANENT_EDEFAULT == null ? permanent != null : !PERMANENT_EDEFAULT.equals(permanent);
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
		result.append(" (permanent: ");
		result.append(permanent);
		result.append(')');
		return result.toString();
	}

} //SrcRedirectImpl
