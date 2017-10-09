/**
 */
package jointPackage_CPL2SPL.impl;

import jointPackage_CPL2SPL.GlobalErrorKind;
import jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage;
import jointPackage_CPL2SPL.TrgGlobalErrorResponse;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trg Global Error Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_CPL2SPL.impl.TrgGlobalErrorResponseImpl#getErrorKind <em>Error Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrgGlobalErrorResponseImpl extends TrgErrorResponseImpl implements TrgGlobalErrorResponse {
	/**
	 * The default value of the '{@link #getErrorKind() <em>Error Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorKind()
	 * @generated
	 * @ordered
	 */
	protected static final GlobalErrorKind ERROR_KIND_EDEFAULT = GlobalErrorKind.BUSY_EVERYWHERE;

	/**
	 * The cached value of the '{@link #getErrorKind() <em>Error Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorKind()
	 * @generated
	 * @ordered
	 */
	protected GlobalErrorKind errorKind = ERROR_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrgGlobalErrorResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JointPackage_CPL2SPLPackage.Literals.TRG_GLOBAL_ERROR_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalErrorKind getErrorKind() {
		return errorKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorKind(GlobalErrorKind newErrorKind) {
		GlobalErrorKind oldErrorKind = errorKind;
		errorKind = newErrorKind == null ? ERROR_KIND_EDEFAULT : newErrorKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.TRG_GLOBAL_ERROR_RESPONSE__ERROR_KIND, oldErrorKind, errorKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JointPackage_CPL2SPLPackage.TRG_GLOBAL_ERROR_RESPONSE__ERROR_KIND:
				return getErrorKind();
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
			case JointPackage_CPL2SPLPackage.TRG_GLOBAL_ERROR_RESPONSE__ERROR_KIND:
				setErrorKind((GlobalErrorKind)newValue);
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
			case JointPackage_CPL2SPLPackage.TRG_GLOBAL_ERROR_RESPONSE__ERROR_KIND:
				setErrorKind(ERROR_KIND_EDEFAULT);
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
			case JointPackage_CPL2SPLPackage.TRG_GLOBAL_ERROR_RESPONSE__ERROR_KIND:
				return errorKind != ERROR_KIND_EDEFAULT;
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
		result.append(" (errorKind: ");
		result.append(errorKind);
		result.append(')');
		return result.toString();
	}

} //TrgGlobalErrorResponseImpl
