/**
 */
package jointPackage_CPL2SPL.impl;

import jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage;
import jointPackage_CPL2SPL.ServerErrorKind;
import jointPackage_CPL2SPL.TrgServerErrorResponse;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trg Server Error Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_CPL2SPL.impl.TrgServerErrorResponseImpl#getErrorKind <em>Error Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrgServerErrorResponseImpl extends TrgErrorResponseImpl implements TrgServerErrorResponse {
	/**
	 * The default value of the '{@link #getErrorKind() <em>Error Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorKind()
	 * @generated
	 * @ordered
	 */
	protected static final ServerErrorKind ERROR_KIND_EDEFAULT = ServerErrorKind.BAD_GATEWAY;

	/**
	 * The cached value of the '{@link #getErrorKind() <em>Error Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorKind()
	 * @generated
	 * @ordered
	 */
	protected ServerErrorKind errorKind = ERROR_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrgServerErrorResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JointPackage_CPL2SPLPackage.Literals.TRG_SERVER_ERROR_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerErrorKind getErrorKind() {
		return errorKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorKind(ServerErrorKind newErrorKind) {
		ServerErrorKind oldErrorKind = errorKind;
		errorKind = newErrorKind == null ? ERROR_KIND_EDEFAULT : newErrorKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.TRG_SERVER_ERROR_RESPONSE__ERROR_KIND, oldErrorKind, errorKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JointPackage_CPL2SPLPackage.TRG_SERVER_ERROR_RESPONSE__ERROR_KIND:
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
			case JointPackage_CPL2SPLPackage.TRG_SERVER_ERROR_RESPONSE__ERROR_KIND:
				setErrorKind((ServerErrorKind)newValue);
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
			case JointPackage_CPL2SPLPackage.TRG_SERVER_ERROR_RESPONSE__ERROR_KIND:
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
			case JointPackage_CPL2SPLPackage.TRG_SERVER_ERROR_RESPONSE__ERROR_KIND:
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

} //TrgServerErrorResponseImpl
