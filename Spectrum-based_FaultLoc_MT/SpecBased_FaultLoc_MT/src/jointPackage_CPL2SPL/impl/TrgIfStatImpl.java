/**
 */
package jointPackage_CPL2SPL.impl;

import java.util.Collection;

import jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage;
import jointPackage_CPL2SPL.TrgExpression;
import jointPackage_CPL2SPL.TrgIfStat;
import jointPackage_CPL2SPL.TrgStatement;

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
 * An implementation of the model object '<em><b>Trg If Stat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_CPL2SPL.impl.TrgIfStatImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.impl.TrgIfStatImpl#getThenStatements <em>Then Statements</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.impl.TrgIfStatImpl#getElseStatements <em>Else Statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrgIfStatImpl extends TrgStatementImpl implements TrgIfStat {
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected TrgExpression condition;

	/**
	 * The cached value of the '{@link #getThenStatements() <em>Then Statements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThenStatements()
	 * @generated
	 * @ordered
	 */
	protected EList<TrgStatement> thenStatements;

	/**
	 * The cached value of the '{@link #getElseStatements() <em>Else Statements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseStatements()
	 * @generated
	 * @ordered
	 */
	protected EList<TrgStatement> elseStatements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrgIfStatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JointPackage_CPL2SPLPackage.Literals.TRG_IF_STAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgExpression getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(TrgExpression newCondition, NotificationChain msgs) {
		TrgExpression oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.TRG_IF_STAT__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(TrgExpression newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JointPackage_CPL2SPLPackage.TRG_IF_STAT__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JointPackage_CPL2SPLPackage.TRG_IF_STAT__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.TRG_IF_STAT__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TrgStatement> getThenStatements() {
		if (thenStatements == null) {
			thenStatements = new EObjectContainmentEList<TrgStatement>(TrgStatement.class, this, JointPackage_CPL2SPLPackage.TRG_IF_STAT__THEN_STATEMENTS);
		}
		return thenStatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TrgStatement> getElseStatements() {
		if (elseStatements == null) {
			elseStatements = new EObjectContainmentEList<TrgStatement>(TrgStatement.class, this, JointPackage_CPL2SPLPackage.TRG_IF_STAT__ELSE_STATEMENTS);
		}
		return elseStatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JointPackage_CPL2SPLPackage.TRG_IF_STAT__CONDITION:
				return basicSetCondition(null, msgs);
			case JointPackage_CPL2SPLPackage.TRG_IF_STAT__THEN_STATEMENTS:
				return ((InternalEList<?>)getThenStatements()).basicRemove(otherEnd, msgs);
			case JointPackage_CPL2SPLPackage.TRG_IF_STAT__ELSE_STATEMENTS:
				return ((InternalEList<?>)getElseStatements()).basicRemove(otherEnd, msgs);
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
			case JointPackage_CPL2SPLPackage.TRG_IF_STAT__CONDITION:
				return getCondition();
			case JointPackage_CPL2SPLPackage.TRG_IF_STAT__THEN_STATEMENTS:
				return getThenStatements();
			case JointPackage_CPL2SPLPackage.TRG_IF_STAT__ELSE_STATEMENTS:
				return getElseStatements();
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
			case JointPackage_CPL2SPLPackage.TRG_IF_STAT__CONDITION:
				setCondition((TrgExpression)newValue);
				return;
			case JointPackage_CPL2SPLPackage.TRG_IF_STAT__THEN_STATEMENTS:
				getThenStatements().clear();
				getThenStatements().addAll((Collection<? extends TrgStatement>)newValue);
				return;
			case JointPackage_CPL2SPLPackage.TRG_IF_STAT__ELSE_STATEMENTS:
				getElseStatements().clear();
				getElseStatements().addAll((Collection<? extends TrgStatement>)newValue);
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
			case JointPackage_CPL2SPLPackage.TRG_IF_STAT__CONDITION:
				setCondition((TrgExpression)null);
				return;
			case JointPackage_CPL2SPLPackage.TRG_IF_STAT__THEN_STATEMENTS:
				getThenStatements().clear();
				return;
			case JointPackage_CPL2SPLPackage.TRG_IF_STAT__ELSE_STATEMENTS:
				getElseStatements().clear();
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
			case JointPackage_CPL2SPLPackage.TRG_IF_STAT__CONDITION:
				return condition != null;
			case JointPackage_CPL2SPLPackage.TRG_IF_STAT__THEN_STATEMENTS:
				return thenStatements != null && !thenStatements.isEmpty();
			case JointPackage_CPL2SPLPackage.TRG_IF_STAT__ELSE_STATEMENTS:
				return elseStatements != null && !elseStatements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TrgIfStatImpl
