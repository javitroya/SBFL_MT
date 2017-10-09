/**
 */
package jointPackage_CPL2SPL.impl;

import jointPackage_CPL2SPL.FunctionLocation;
import jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage;
import jointPackage_CPL2SPL.TrgRemoteFunctionDeclaration;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trg Remote Function Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_CPL2SPL.impl.TrgRemoteFunctionDeclarationImpl#getFunctionLocation <em>Function Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrgRemoteFunctionDeclarationImpl extends TrgFunctionDeclarationImpl implements TrgRemoteFunctionDeclaration {
	/**
	 * The default value of the '{@link #getFunctionLocation() <em>Function Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionLocation()
	 * @generated
	 * @ordered
	 */
	protected static final FunctionLocation FUNCTION_LOCATION_EDEFAULT = FunctionLocation.REMOTE;

	/**
	 * The cached value of the '{@link #getFunctionLocation() <em>Function Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionLocation()
	 * @generated
	 * @ordered
	 */
	protected FunctionLocation functionLocation = FUNCTION_LOCATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrgRemoteFunctionDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JointPackage_CPL2SPLPackage.Literals.TRG_REMOTE_FUNCTION_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionLocation getFunctionLocation() {
		return functionLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctionLocation(FunctionLocation newFunctionLocation) {
		FunctionLocation oldFunctionLocation = functionLocation;
		functionLocation = newFunctionLocation == null ? FUNCTION_LOCATION_EDEFAULT : newFunctionLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.TRG_REMOTE_FUNCTION_DECLARATION__FUNCTION_LOCATION, oldFunctionLocation, functionLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JointPackage_CPL2SPLPackage.TRG_REMOTE_FUNCTION_DECLARATION__FUNCTION_LOCATION:
				return getFunctionLocation();
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
			case JointPackage_CPL2SPLPackage.TRG_REMOTE_FUNCTION_DECLARATION__FUNCTION_LOCATION:
				setFunctionLocation((FunctionLocation)newValue);
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
			case JointPackage_CPL2SPLPackage.TRG_REMOTE_FUNCTION_DECLARATION__FUNCTION_LOCATION:
				setFunctionLocation(FUNCTION_LOCATION_EDEFAULT);
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
			case JointPackage_CPL2SPLPackage.TRG_REMOTE_FUNCTION_DECLARATION__FUNCTION_LOCATION:
				return functionLocation != FUNCTION_LOCATION_EDEFAULT;
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
		result.append(" (functionLocation: ");
		result.append(functionLocation);
		result.append(')');
		return result.toString();
	}

} //TrgRemoteFunctionDeclarationImpl
