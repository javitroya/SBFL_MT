/**
 */
package jointPackage_CPL2SPL.impl;

import java.util.Collection;

import jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage;
import jointPackage_CPL2SPL.TrgExpression;
import jointPackage_CPL2SPL.TrgMessageField;
import jointPackage_CPL2SPL.TrgWithExp;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trg With Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_CPL2SPL.impl.TrgWithExpImpl#getExp <em>Exp</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.impl.TrgWithExpImpl#getMsgFields <em>Msg Fields</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrgWithExpImpl extends TrgExpressionImpl implements TrgWithExp {
	/**
	 * The cached value of the '{@link #getExp() <em>Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExp()
	 * @generated
	 * @ordered
	 */
	protected TrgExpression exp;

	/**
	 * The cached value of the '{@link #getMsgFields() <em>Msg Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMsgFields()
	 * @generated
	 * @ordered
	 */
	protected EList<TrgMessageField> msgFields;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrgWithExpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JointPackage_CPL2SPLPackage.Literals.TRG_WITH_EXP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgExpression getExp() {
		return exp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExp(TrgExpression newExp, NotificationChain msgs) {
		TrgExpression oldExp = exp;
		exp = newExp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.TRG_WITH_EXP__EXP, oldExp, newExp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExp(TrgExpression newExp) {
		if (newExp != exp) {
			NotificationChain msgs = null;
			if (exp != null)
				msgs = ((InternalEObject)exp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JointPackage_CPL2SPLPackage.TRG_WITH_EXP__EXP, null, msgs);
			if (newExp != null)
				msgs = ((InternalEObject)newExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JointPackage_CPL2SPLPackage.TRG_WITH_EXP__EXP, null, msgs);
			msgs = basicSetExp(newExp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.TRG_WITH_EXP__EXP, newExp, newExp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TrgMessageField> getMsgFields() {
		if (msgFields == null) {
			msgFields = new EObjectContainmentEList<TrgMessageField>(TrgMessageField.class, this, JointPackage_CPL2SPLPackage.TRG_WITH_EXP__MSG_FIELDS);
		}
		return msgFields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JointPackage_CPL2SPLPackage.TRG_WITH_EXP__EXP:
				return basicSetExp(null, msgs);
			case JointPackage_CPL2SPLPackage.TRG_WITH_EXP__MSG_FIELDS:
				return ((InternalEList<?>)getMsgFields()).basicRemove(otherEnd, msgs);
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
			case JointPackage_CPL2SPLPackage.TRG_WITH_EXP__EXP:
				return getExp();
			case JointPackage_CPL2SPLPackage.TRG_WITH_EXP__MSG_FIELDS:
				return getMsgFields();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JointPackage_CPL2SPLPackage.TRG_WITH_EXP__EXP:
				setExp((TrgExpression)newValue);
				return;
			case JointPackage_CPL2SPLPackage.TRG_WITH_EXP__MSG_FIELDS:
				getMsgFields().clear();
				getMsgFields().addAll((Collection<? extends TrgMessageField>)newValue);
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
			case JointPackage_CPL2SPLPackage.TRG_WITH_EXP__EXP:
				setExp((TrgExpression)null);
				return;
			case JointPackage_CPL2SPLPackage.TRG_WITH_EXP__MSG_FIELDS:
				getMsgFields().clear();
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
			case JointPackage_CPL2SPLPackage.TRG_WITH_EXP__EXP:
				return exp != null;
			case JointPackage_CPL2SPLPackage.TRG_WITH_EXP__MSG_FIELDS:
				return msgFields != null && !msgFields.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TrgWithExpImpl
