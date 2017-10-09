/**
 */
package jointPackage_CPL2SPL.impl;

import java.util.Collection;

import jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage;
import jointPackage_CPL2SPL.TrgStatement;
import jointPackage_CPL2SPL.TrgVariable;
import jointPackage_CPL2SPL.TrgWhenHeader;
import jointPackage_CPL2SPL.TrgWhenStat;

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
 * An implementation of the model object '<em><b>Trg When Stat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_CPL2SPL.impl.TrgWhenStatImpl#getIdExp <em>Id Exp</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.impl.TrgWhenStatImpl#getWhenHeaders <em>When Headers</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.impl.TrgWhenStatImpl#getStatements <em>Statements</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.impl.TrgWhenStatImpl#getElseStatements <em>Else Statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrgWhenStatImpl extends TrgStatementImpl implements TrgWhenStat {
	/**
	 * The cached value of the '{@link #getIdExp() <em>Id Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdExp()
	 * @generated
	 * @ordered
	 */
	protected TrgVariable idExp;

	/**
	 * The cached value of the '{@link #getWhenHeaders() <em>When Headers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhenHeaders()
	 * @generated
	 * @ordered
	 */
	protected EList<TrgWhenHeader> whenHeaders;

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
	protected TrgWhenStatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JointPackage_CPL2SPLPackage.Literals.TRG_WHEN_STAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgVariable getIdExp() {
		return idExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdExp(TrgVariable newIdExp, NotificationChain msgs) {
		TrgVariable oldIdExp = idExp;
		idExp = newIdExp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.TRG_WHEN_STAT__ID_EXP, oldIdExp, newIdExp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdExp(TrgVariable newIdExp) {
		if (newIdExp != idExp) {
			NotificationChain msgs = null;
			if (idExp != null)
				msgs = ((InternalEObject)idExp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JointPackage_CPL2SPLPackage.TRG_WHEN_STAT__ID_EXP, null, msgs);
			if (newIdExp != null)
				msgs = ((InternalEObject)newIdExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JointPackage_CPL2SPLPackage.TRG_WHEN_STAT__ID_EXP, null, msgs);
			msgs = basicSetIdExp(newIdExp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.TRG_WHEN_STAT__ID_EXP, newIdExp, newIdExp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TrgWhenHeader> getWhenHeaders() {
		if (whenHeaders == null) {
			whenHeaders = new EObjectContainmentEList<TrgWhenHeader>(TrgWhenHeader.class, this, JointPackage_CPL2SPLPackage.TRG_WHEN_STAT__WHEN_HEADERS);
		}
		return whenHeaders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TrgStatement> getStatements() {
		if (statements == null) {
			statements = new EObjectContainmentEList<TrgStatement>(TrgStatement.class, this, JointPackage_CPL2SPLPackage.TRG_WHEN_STAT__STATEMENTS);
		}
		return statements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TrgStatement> getElseStatements() {
		if (elseStatements == null) {
			elseStatements = new EObjectContainmentEList<TrgStatement>(TrgStatement.class, this, JointPackage_CPL2SPLPackage.TRG_WHEN_STAT__ELSE_STATEMENTS);
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
			case JointPackage_CPL2SPLPackage.TRG_WHEN_STAT__ID_EXP:
				return basicSetIdExp(null, msgs);
			case JointPackage_CPL2SPLPackage.TRG_WHEN_STAT__WHEN_HEADERS:
				return ((InternalEList<?>)getWhenHeaders()).basicRemove(otherEnd, msgs);
			case JointPackage_CPL2SPLPackage.TRG_WHEN_STAT__STATEMENTS:
				return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
			case JointPackage_CPL2SPLPackage.TRG_WHEN_STAT__ELSE_STATEMENTS:
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
			case JointPackage_CPL2SPLPackage.TRG_WHEN_STAT__ID_EXP:
				return getIdExp();
			case JointPackage_CPL2SPLPackage.TRG_WHEN_STAT__WHEN_HEADERS:
				return getWhenHeaders();
			case JointPackage_CPL2SPLPackage.TRG_WHEN_STAT__STATEMENTS:
				return getStatements();
			case JointPackage_CPL2SPLPackage.TRG_WHEN_STAT__ELSE_STATEMENTS:
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
			case JointPackage_CPL2SPLPackage.TRG_WHEN_STAT__ID_EXP:
				setIdExp((TrgVariable)newValue);
				return;
			case JointPackage_CPL2SPLPackage.TRG_WHEN_STAT__WHEN_HEADERS:
				getWhenHeaders().clear();
				getWhenHeaders().addAll((Collection<? extends TrgWhenHeader>)newValue);
				return;
			case JointPackage_CPL2SPLPackage.TRG_WHEN_STAT__STATEMENTS:
				getStatements().clear();
				getStatements().addAll((Collection<? extends TrgStatement>)newValue);
				return;
			case JointPackage_CPL2SPLPackage.TRG_WHEN_STAT__ELSE_STATEMENTS:
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
			case JointPackage_CPL2SPLPackage.TRG_WHEN_STAT__ID_EXP:
				setIdExp((TrgVariable)null);
				return;
			case JointPackage_CPL2SPLPackage.TRG_WHEN_STAT__WHEN_HEADERS:
				getWhenHeaders().clear();
				return;
			case JointPackage_CPL2SPLPackage.TRG_WHEN_STAT__STATEMENTS:
				getStatements().clear();
				return;
			case JointPackage_CPL2SPLPackage.TRG_WHEN_STAT__ELSE_STATEMENTS:
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
			case JointPackage_CPL2SPLPackage.TRG_WHEN_STAT__ID_EXP:
				return idExp != null;
			case JointPackage_CPL2SPLPackage.TRG_WHEN_STAT__WHEN_HEADERS:
				return whenHeaders != null && !whenHeaders.isEmpty();
			case JointPackage_CPL2SPLPackage.TRG_WHEN_STAT__STATEMENTS:
				return statements != null && !statements.isEmpty();
			case JointPackage_CPL2SPLPackage.TRG_WHEN_STAT__ELSE_STATEMENTS:
				return elseStatements != null && !elseStatements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TrgWhenStatImpl
