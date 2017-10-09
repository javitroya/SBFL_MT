/**
 */
package jointPackage_CPL2SPL.impl;

import java.util.Collection;

import jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage;
import jointPackage_CPL2SPL.TrgExpression;
import jointPackage_CPL2SPL.TrgSelectCase;
import jointPackage_CPL2SPL.TrgSelectDefault;
import jointPackage_CPL2SPL.TrgSelectStat;

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
 * An implementation of the model object '<em><b>Trg Select Stat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_CPL2SPL.impl.TrgSelectStatImpl#getMatchedExp <em>Matched Exp</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.impl.TrgSelectStatImpl#getSelectCases <em>Select Cases</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.impl.TrgSelectStatImpl#getSelectDefault <em>Select Default</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrgSelectStatImpl extends TrgStatementImpl implements TrgSelectStat {
	/**
	 * The cached value of the '{@link #getMatchedExp() <em>Matched Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchedExp()
	 * @generated
	 * @ordered
	 */
	protected TrgExpression matchedExp;

	/**
	 * The cached value of the '{@link #getSelectCases() <em>Select Cases</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectCases()
	 * @generated
	 * @ordered
	 */
	protected EList<TrgSelectCase> selectCases;

	/**
	 * The cached value of the '{@link #getSelectDefault() <em>Select Default</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectDefault()
	 * @generated
	 * @ordered
	 */
	protected TrgSelectDefault selectDefault;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrgSelectStatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JointPackage_CPL2SPLPackage.Literals.TRG_SELECT_STAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgExpression getMatchedExp() {
		return matchedExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMatchedExp(TrgExpression newMatchedExp, NotificationChain msgs) {
		TrgExpression oldMatchedExp = matchedExp;
		matchedExp = newMatchedExp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.TRG_SELECT_STAT__MATCHED_EXP, oldMatchedExp, newMatchedExp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatchedExp(TrgExpression newMatchedExp) {
		if (newMatchedExp != matchedExp) {
			NotificationChain msgs = null;
			if (matchedExp != null)
				msgs = ((InternalEObject)matchedExp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JointPackage_CPL2SPLPackage.TRG_SELECT_STAT__MATCHED_EXP, null, msgs);
			if (newMatchedExp != null)
				msgs = ((InternalEObject)newMatchedExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JointPackage_CPL2SPLPackage.TRG_SELECT_STAT__MATCHED_EXP, null, msgs);
			msgs = basicSetMatchedExp(newMatchedExp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.TRG_SELECT_STAT__MATCHED_EXP, newMatchedExp, newMatchedExp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TrgSelectCase> getSelectCases() {
		if (selectCases == null) {
			selectCases = new EObjectContainmentEList<TrgSelectCase>(TrgSelectCase.class, this, JointPackage_CPL2SPLPackage.TRG_SELECT_STAT__SELECT_CASES);
		}
		return selectCases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgSelectDefault getSelectDefault() {
		return selectDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelectDefault(TrgSelectDefault newSelectDefault, NotificationChain msgs) {
		TrgSelectDefault oldSelectDefault = selectDefault;
		selectDefault = newSelectDefault;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.TRG_SELECT_STAT__SELECT_DEFAULT, oldSelectDefault, newSelectDefault);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectDefault(TrgSelectDefault newSelectDefault) {
		if (newSelectDefault != selectDefault) {
			NotificationChain msgs = null;
			if (selectDefault != null)
				msgs = ((InternalEObject)selectDefault).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JointPackage_CPL2SPLPackage.TRG_SELECT_STAT__SELECT_DEFAULT, null, msgs);
			if (newSelectDefault != null)
				msgs = ((InternalEObject)newSelectDefault).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JointPackage_CPL2SPLPackage.TRG_SELECT_STAT__SELECT_DEFAULT, null, msgs);
			msgs = basicSetSelectDefault(newSelectDefault, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.TRG_SELECT_STAT__SELECT_DEFAULT, newSelectDefault, newSelectDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JointPackage_CPL2SPLPackage.TRG_SELECT_STAT__MATCHED_EXP:
				return basicSetMatchedExp(null, msgs);
			case JointPackage_CPL2SPLPackage.TRG_SELECT_STAT__SELECT_CASES:
				return ((InternalEList<?>)getSelectCases()).basicRemove(otherEnd, msgs);
			case JointPackage_CPL2SPLPackage.TRG_SELECT_STAT__SELECT_DEFAULT:
				return basicSetSelectDefault(null, msgs);
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
			case JointPackage_CPL2SPLPackage.TRG_SELECT_STAT__MATCHED_EXP:
				return getMatchedExp();
			case JointPackage_CPL2SPLPackage.TRG_SELECT_STAT__SELECT_CASES:
				return getSelectCases();
			case JointPackage_CPL2SPLPackage.TRG_SELECT_STAT__SELECT_DEFAULT:
				return getSelectDefault();
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
			case JointPackage_CPL2SPLPackage.TRG_SELECT_STAT__MATCHED_EXP:
				setMatchedExp((TrgExpression)newValue);
				return;
			case JointPackage_CPL2SPLPackage.TRG_SELECT_STAT__SELECT_CASES:
				getSelectCases().clear();
				getSelectCases().addAll((Collection<? extends TrgSelectCase>)newValue);
				return;
			case JointPackage_CPL2SPLPackage.TRG_SELECT_STAT__SELECT_DEFAULT:
				setSelectDefault((TrgSelectDefault)newValue);
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
			case JointPackage_CPL2SPLPackage.TRG_SELECT_STAT__MATCHED_EXP:
				setMatchedExp((TrgExpression)null);
				return;
			case JointPackage_CPL2SPLPackage.TRG_SELECT_STAT__SELECT_CASES:
				getSelectCases().clear();
				return;
			case JointPackage_CPL2SPLPackage.TRG_SELECT_STAT__SELECT_DEFAULT:
				setSelectDefault((TrgSelectDefault)null);
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
			case JointPackage_CPL2SPLPackage.TRG_SELECT_STAT__MATCHED_EXP:
				return matchedExp != null;
			case JointPackage_CPL2SPLPackage.TRG_SELECT_STAT__SELECT_CASES:
				return selectCases != null && !selectCases.isEmpty();
			case JointPackage_CPL2SPLPackage.TRG_SELECT_STAT__SELECT_DEFAULT:
				return selectDefault != null;
		}
		return super.eIsSet(featureID);
	}

} //TrgSelectStatImpl
