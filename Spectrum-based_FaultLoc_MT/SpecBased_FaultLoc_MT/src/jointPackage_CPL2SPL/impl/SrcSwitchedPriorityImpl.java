/**
 */
package jointPackage_CPL2SPL.impl;

import jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage;
import jointPackage_CPL2SPL.SrcSwitchedPriority;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Src Switched Priority</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_CPL2SPL.impl.SrcSwitchedPriorityImpl#getLess <em>Less</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.impl.SrcSwitchedPriorityImpl#getGreater <em>Greater</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.impl.SrcSwitchedPriorityImpl#getEqual <em>Equal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SrcSwitchedPriorityImpl extends SrcNodeContainerImpl implements SrcSwitchedPriority {
	/**
	 * The default value of the '{@link #getLess() <em>Less</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLess()
	 * @generated
	 * @ordered
	 */
	protected static final String LESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLess() <em>Less</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLess()
	 * @generated
	 * @ordered
	 */
	protected String less = LESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getGreater() <em>Greater</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGreater()
	 * @generated
	 * @ordered
	 */
	protected static final String GREATER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGreater() <em>Greater</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGreater()
	 * @generated
	 * @ordered
	 */
	protected String greater = GREATER_EDEFAULT;

	/**
	 * The default value of the '{@link #getEqual() <em>Equal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEqual()
	 * @generated
	 * @ordered
	 */
	protected static final String EQUAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEqual() <em>Equal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEqual()
	 * @generated
	 * @ordered
	 */
	protected String equal = EQUAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SrcSwitchedPriorityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JointPackage_CPL2SPLPackage.Literals.SRC_SWITCHED_PRIORITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLess() {
		return less;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLess(String newLess) {
		String oldLess = less;
		less = newLess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.SRC_SWITCHED_PRIORITY__LESS, oldLess, less));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGreater() {
		return greater;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGreater(String newGreater) {
		String oldGreater = greater;
		greater = newGreater;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.SRC_SWITCHED_PRIORITY__GREATER, oldGreater, greater));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEqual() {
		return equal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEqual(String newEqual) {
		String oldEqual = equal;
		equal = newEqual;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.SRC_SWITCHED_PRIORITY__EQUAL, oldEqual, equal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_PRIORITY__LESS:
				return getLess();
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_PRIORITY__GREATER:
				return getGreater();
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_PRIORITY__EQUAL:
				return getEqual();
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
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_PRIORITY__LESS:
				setLess((String)newValue);
				return;
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_PRIORITY__GREATER:
				setGreater((String)newValue);
				return;
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_PRIORITY__EQUAL:
				setEqual((String)newValue);
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
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_PRIORITY__LESS:
				setLess(LESS_EDEFAULT);
				return;
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_PRIORITY__GREATER:
				setGreater(GREATER_EDEFAULT);
				return;
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_PRIORITY__EQUAL:
				setEqual(EQUAL_EDEFAULT);
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
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_PRIORITY__LESS:
				return LESS_EDEFAULT == null ? less != null : !LESS_EDEFAULT.equals(less);
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_PRIORITY__GREATER:
				return GREATER_EDEFAULT == null ? greater != null : !GREATER_EDEFAULT.equals(greater);
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_PRIORITY__EQUAL:
				return EQUAL_EDEFAULT == null ? equal != null : !EQUAL_EDEFAULT.equals(equal);
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
		result.append(" (less: ");
		result.append(less);
		result.append(", greater: ");
		result.append(greater);
		result.append(", equal: ");
		result.append(equal);
		result.append(')');
		return result.toString();
	}

} //SrcSwitchedPriorityImpl
