/**
 */
package jointPackage_CPL2SPL.impl;

import jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage;
import jointPackage_CPL2SPL.TrgFunctionCall;
import jointPackage_CPL2SPL.TrgFunctionCallStat;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trg Function Call Stat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_CPL2SPL.impl.TrgFunctionCallStatImpl#getFunctionCall <em>Function Call</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrgFunctionCallStatImpl extends TrgStatementImpl implements TrgFunctionCallStat {
	/**
	 * The cached value of the '{@link #getFunctionCall() <em>Function Call</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionCall()
	 * @generated
	 * @ordered
	 */
	protected TrgFunctionCall functionCall;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrgFunctionCallStatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JointPackage_CPL2SPLPackage.Literals.TRG_FUNCTION_CALL_STAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgFunctionCall getFunctionCall() {
		return functionCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFunctionCall(TrgFunctionCall newFunctionCall, NotificationChain msgs) {
		TrgFunctionCall oldFunctionCall = functionCall;
		functionCall = newFunctionCall;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.TRG_FUNCTION_CALL_STAT__FUNCTION_CALL, oldFunctionCall, newFunctionCall);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctionCall(TrgFunctionCall newFunctionCall) {
		if (newFunctionCall != functionCall) {
			NotificationChain msgs = null;
			if (functionCall != null)
				msgs = ((InternalEObject)functionCall).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JointPackage_CPL2SPLPackage.TRG_FUNCTION_CALL_STAT__FUNCTION_CALL, null, msgs);
			if (newFunctionCall != null)
				msgs = ((InternalEObject)newFunctionCall).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JointPackage_CPL2SPLPackage.TRG_FUNCTION_CALL_STAT__FUNCTION_CALL, null, msgs);
			msgs = basicSetFunctionCall(newFunctionCall, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.TRG_FUNCTION_CALL_STAT__FUNCTION_CALL, newFunctionCall, newFunctionCall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JointPackage_CPL2SPLPackage.TRG_FUNCTION_CALL_STAT__FUNCTION_CALL:
				return basicSetFunctionCall(null, msgs);
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
			case JointPackage_CPL2SPLPackage.TRG_FUNCTION_CALL_STAT__FUNCTION_CALL:
				return getFunctionCall();
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
			case JointPackage_CPL2SPLPackage.TRG_FUNCTION_CALL_STAT__FUNCTION_CALL:
				setFunctionCall((TrgFunctionCall)newValue);
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
			case JointPackage_CPL2SPLPackage.TRG_FUNCTION_CALL_STAT__FUNCTION_CALL:
				setFunctionCall((TrgFunctionCall)null);
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
			case JointPackage_CPL2SPLPackage.TRG_FUNCTION_CALL_STAT__FUNCTION_CALL:
				return functionCall != null;
		}
		return super.eIsSet(featureID);
	}

} //TrgFunctionCallStatImpl
