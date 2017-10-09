/**
 */
package jointPackage_CPL2SPL.impl;

import java.util.Collection;

import jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage;
import jointPackage_CPL2SPL.TrgExpression;
import jointPackage_CPL2SPL.TrgForeachStat;
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
 * An implementation of the model object '<em><b>Trg Foreach Stat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_CPL2SPL.impl.TrgForeachStatImpl#getIteratorName <em>Iterator Name</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.impl.TrgForeachStatImpl#getSequenceExp <em>Sequence Exp</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.impl.TrgForeachStatImpl#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrgForeachStatImpl extends TrgStatementImpl implements TrgForeachStat {
	/**
	 * The default value of the '{@link #getIteratorName() <em>Iterator Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIteratorName()
	 * @generated
	 * @ordered
	 */
	protected static final String ITERATOR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIteratorName() <em>Iterator Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIteratorName()
	 * @generated
	 * @ordered
	 */
	protected String iteratorName = ITERATOR_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSequenceExp() <em>Sequence Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceExp()
	 * @generated
	 * @ordered
	 */
	protected TrgExpression sequenceExp;

	/**
	 * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatements()
	 * @generated
	 * @ordered
	 */
	protected EList<TrgStatement> statements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrgForeachStatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JointPackage_CPL2SPLPackage.Literals.TRG_FOREACH_STAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIteratorName() {
		return iteratorName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIteratorName(String newIteratorName) {
		String oldIteratorName = iteratorName;
		iteratorName = newIteratorName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.TRG_FOREACH_STAT__ITERATOR_NAME, oldIteratorName, iteratorName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgExpression getSequenceExp() {
		return sequenceExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequenceExp(TrgExpression newSequenceExp, NotificationChain msgs) {
		TrgExpression oldSequenceExp = sequenceExp;
		sequenceExp = newSequenceExp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.TRG_FOREACH_STAT__SEQUENCE_EXP, oldSequenceExp, newSequenceExp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequenceExp(TrgExpression newSequenceExp) {
		if (newSequenceExp != sequenceExp) {
			NotificationChain msgs = null;
			if (sequenceExp != null)
				msgs = ((InternalEObject)sequenceExp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JointPackage_CPL2SPLPackage.TRG_FOREACH_STAT__SEQUENCE_EXP, null, msgs);
			if (newSequenceExp != null)
				msgs = ((InternalEObject)newSequenceExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JointPackage_CPL2SPLPackage.TRG_FOREACH_STAT__SEQUENCE_EXP, null, msgs);
			msgs = basicSetSequenceExp(newSequenceExp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.TRG_FOREACH_STAT__SEQUENCE_EXP, newSequenceExp, newSequenceExp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TrgStatement> getStatements() {
		if (statements == null) {
			statements = new EObjectContainmentEList<TrgStatement>(TrgStatement.class, this, JointPackage_CPL2SPLPackage.TRG_FOREACH_STAT__STATEMENTS);
		}
		return statements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JointPackage_CPL2SPLPackage.TRG_FOREACH_STAT__SEQUENCE_EXP:
				return basicSetSequenceExp(null, msgs);
			case JointPackage_CPL2SPLPackage.TRG_FOREACH_STAT__STATEMENTS:
				return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
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
			case JointPackage_CPL2SPLPackage.TRG_FOREACH_STAT__ITERATOR_NAME:
				return getIteratorName();
			case JointPackage_CPL2SPLPackage.TRG_FOREACH_STAT__SEQUENCE_EXP:
				return getSequenceExp();
			case JointPackage_CPL2SPLPackage.TRG_FOREACH_STAT__STATEMENTS:
				return getStatements();
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
			case JointPackage_CPL2SPLPackage.TRG_FOREACH_STAT__ITERATOR_NAME:
				setIteratorName((String)newValue);
				return;
			case JointPackage_CPL2SPLPackage.TRG_FOREACH_STAT__SEQUENCE_EXP:
				setSequenceExp((TrgExpression)newValue);
				return;
			case JointPackage_CPL2SPLPackage.TRG_FOREACH_STAT__STATEMENTS:
				getStatements().clear();
				getStatements().addAll((Collection<? extends TrgStatement>)newValue);
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
			case JointPackage_CPL2SPLPackage.TRG_FOREACH_STAT__ITERATOR_NAME:
				setIteratorName(ITERATOR_NAME_EDEFAULT);
				return;
			case JointPackage_CPL2SPLPackage.TRG_FOREACH_STAT__SEQUENCE_EXP:
				setSequenceExp((TrgExpression)null);
				return;
			case JointPackage_CPL2SPLPackage.TRG_FOREACH_STAT__STATEMENTS:
				getStatements().clear();
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
			case JointPackage_CPL2SPLPackage.TRG_FOREACH_STAT__ITERATOR_NAME:
				return ITERATOR_NAME_EDEFAULT == null ? iteratorName != null : !ITERATOR_NAME_EDEFAULT.equals(iteratorName);
			case JointPackage_CPL2SPLPackage.TRG_FOREACH_STAT__SEQUENCE_EXP:
				return sequenceExp != null;
			case JointPackage_CPL2SPLPackage.TRG_FOREACH_STAT__STATEMENTS:
				return statements != null && !statements.isEmpty();
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
		result.append(" (iteratorName: ");
		result.append(iteratorName);
		result.append(')');
		return result.toString();
	}

} //TrgForeachStatImpl
