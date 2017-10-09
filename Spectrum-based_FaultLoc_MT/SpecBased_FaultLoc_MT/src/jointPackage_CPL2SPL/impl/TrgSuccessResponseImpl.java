/**
 */
package jointPackage_CPL2SPL.impl;

import jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage;
import jointPackage_CPL2SPL.SuccessKind;
import jointPackage_CPL2SPL.TrgSuccessResponse;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trg Success Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_CPL2SPL.impl.TrgSuccessResponseImpl#getSuccessKind <em>Success Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrgSuccessResponseImpl extends TrgResponseImpl implements TrgSuccessResponse {
	/**
	 * The default value of the '{@link #getSuccessKind() <em>Success Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessKind()
	 * @generated
	 * @ordered
	 */
	protected static final SuccessKind SUCCESS_KIND_EDEFAULT = SuccessKind.OK;

	/**
	 * The cached value of the '{@link #getSuccessKind() <em>Success Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessKind()
	 * @generated
	 * @ordered
	 */
	protected SuccessKind successKind = SUCCESS_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrgSuccessResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JointPackage_CPL2SPLPackage.Literals.TRG_SUCCESS_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuccessKind getSuccessKind() {
		return successKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuccessKind(SuccessKind newSuccessKind) {
		SuccessKind oldSuccessKind = successKind;
		successKind = newSuccessKind == null ? SUCCESS_KIND_EDEFAULT : newSuccessKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.TRG_SUCCESS_RESPONSE__SUCCESS_KIND, oldSuccessKind, successKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JointPackage_CPL2SPLPackage.TRG_SUCCESS_RESPONSE__SUCCESS_KIND:
				return getSuccessKind();
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
			case JointPackage_CPL2SPLPackage.TRG_SUCCESS_RESPONSE__SUCCESS_KIND:
				setSuccessKind((SuccessKind)newValue);
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
			case JointPackage_CPL2SPLPackage.TRG_SUCCESS_RESPONSE__SUCCESS_KIND:
				setSuccessKind(SUCCESS_KIND_EDEFAULT);
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
			case JointPackage_CPL2SPLPackage.TRG_SUCCESS_RESPONSE__SUCCESS_KIND:
				return successKind != SUCCESS_KIND_EDEFAULT;
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
		result.append(" (successKind: ");
		result.append(successKind);
		result.append(')');
		return result.toString();
	}

} //TrgSuccessResponseImpl
