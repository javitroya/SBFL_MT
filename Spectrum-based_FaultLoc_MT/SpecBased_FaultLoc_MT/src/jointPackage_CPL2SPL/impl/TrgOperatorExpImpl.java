/**
 */
package jointPackage_CPL2SPL.impl;

import jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage;
import jointPackage_CPL2SPL.TrgExpression;
import jointPackage_CPL2SPL.TrgOperatorExp;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trg Operator Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_CPL2SPL.impl.TrgOperatorExpImpl#getOpName <em>Op Name</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.impl.TrgOperatorExpImpl#getLeftExp <em>Left Exp</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.impl.TrgOperatorExpImpl#getRightExp <em>Right Exp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrgOperatorExpImpl extends TrgExpressionImpl implements TrgOperatorExp {
	/**
	 * The default value of the '{@link #getOpName() <em>Op Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpName()
	 * @generated
	 * @ordered
	 */
	protected static final String OP_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOpName() <em>Op Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpName()
	 * @generated
	 * @ordered
	 */
	protected String opName = OP_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLeftExp() <em>Left Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftExp()
	 * @generated
	 * @ordered
	 */
	protected TrgExpression leftExp;

	/**
	 * The cached value of the '{@link #getRightExp() <em>Right Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightExp()
	 * @generated
	 * @ordered
	 */
	protected TrgExpression rightExp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrgOperatorExpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JointPackage_CPL2SPLPackage.Literals.TRG_OPERATOR_EXP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOpName() {
		return opName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpName(String newOpName) {
		String oldOpName = opName;
		opName = newOpName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.TRG_OPERATOR_EXP__OP_NAME, oldOpName, opName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgExpression getLeftExp() {
		return leftExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeftExp(TrgExpression newLeftExp, NotificationChain msgs) {
		TrgExpression oldLeftExp = leftExp;
		leftExp = newLeftExp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.TRG_OPERATOR_EXP__LEFT_EXP, oldLeftExp, newLeftExp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftExp(TrgExpression newLeftExp) {
		if (newLeftExp != leftExp) {
			NotificationChain msgs = null;
			if (leftExp != null)
				msgs = ((InternalEObject)leftExp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JointPackage_CPL2SPLPackage.TRG_OPERATOR_EXP__LEFT_EXP, null, msgs);
			if (newLeftExp != null)
				msgs = ((InternalEObject)newLeftExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JointPackage_CPL2SPLPackage.TRG_OPERATOR_EXP__LEFT_EXP, null, msgs);
			msgs = basicSetLeftExp(newLeftExp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.TRG_OPERATOR_EXP__LEFT_EXP, newLeftExp, newLeftExp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgExpression getRightExp() {
		return rightExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightExp(TrgExpression newRightExp, NotificationChain msgs) {
		TrgExpression oldRightExp = rightExp;
		rightExp = newRightExp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.TRG_OPERATOR_EXP__RIGHT_EXP, oldRightExp, newRightExp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightExp(TrgExpression newRightExp) {
		if (newRightExp != rightExp) {
			NotificationChain msgs = null;
			if (rightExp != null)
				msgs = ((InternalEObject)rightExp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JointPackage_CPL2SPLPackage.TRG_OPERATOR_EXP__RIGHT_EXP, null, msgs);
			if (newRightExp != null)
				msgs = ((InternalEObject)newRightExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JointPackage_CPL2SPLPackage.TRG_OPERATOR_EXP__RIGHT_EXP, null, msgs);
			msgs = basicSetRightExp(newRightExp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.TRG_OPERATOR_EXP__RIGHT_EXP, newRightExp, newRightExp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JointPackage_CPL2SPLPackage.TRG_OPERATOR_EXP__LEFT_EXP:
				return basicSetLeftExp(null, msgs);
			case JointPackage_CPL2SPLPackage.TRG_OPERATOR_EXP__RIGHT_EXP:
				return basicSetRightExp(null, msgs);
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
			case JointPackage_CPL2SPLPackage.TRG_OPERATOR_EXP__OP_NAME:
				return getOpName();
			case JointPackage_CPL2SPLPackage.TRG_OPERATOR_EXP__LEFT_EXP:
				return getLeftExp();
			case JointPackage_CPL2SPLPackage.TRG_OPERATOR_EXP__RIGHT_EXP:
				return getRightExp();
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
			case JointPackage_CPL2SPLPackage.TRG_OPERATOR_EXP__OP_NAME:
				setOpName((String)newValue);
				return;
			case JointPackage_CPL2SPLPackage.TRG_OPERATOR_EXP__LEFT_EXP:
				setLeftExp((TrgExpression)newValue);
				return;
			case JointPackage_CPL2SPLPackage.TRG_OPERATOR_EXP__RIGHT_EXP:
				setRightExp((TrgExpression)newValue);
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
			case JointPackage_CPL2SPLPackage.TRG_OPERATOR_EXP__OP_NAME:
				setOpName(OP_NAME_EDEFAULT);
				return;
			case JointPackage_CPL2SPLPackage.TRG_OPERATOR_EXP__LEFT_EXP:
				setLeftExp((TrgExpression)null);
				return;
			case JointPackage_CPL2SPLPackage.TRG_OPERATOR_EXP__RIGHT_EXP:
				setRightExp((TrgExpression)null);
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
			case JointPackage_CPL2SPLPackage.TRG_OPERATOR_EXP__OP_NAME:
				return OP_NAME_EDEFAULT == null ? opName != null : !OP_NAME_EDEFAULT.equals(opName);
			case JointPackage_CPL2SPLPackage.TRG_OPERATOR_EXP__LEFT_EXP:
				return leftExp != null;
			case JointPackage_CPL2SPLPackage.TRG_OPERATOR_EXP__RIGHT_EXP:
				return rightExp != null;
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
		result.append(" (opName: ");
		result.append(opName);
		result.append(')');
		return result.toString();
	}

} //TrgOperatorExpImpl
