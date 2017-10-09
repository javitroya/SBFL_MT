/**
 */
package jointPackage_Ecore2Maude.impl;

import java.util.Collection;

import jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage;
import jointPackage_Ecore2Maude.TrgInstModExp;
import jointPackage_Ecore2Maude.TrgModExpression;
import jointPackage_Ecore2Maude.TrgView;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trg Inst Mod Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_Ecore2Maude.impl.TrgInstModExpImpl#getModExp <em>Mod Exp</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.impl.TrgInstModExpImpl#getViews <em>Views</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrgInstModExpImpl extends TrgModExpressionImpl implements TrgInstModExp {
	/**
	 * The cached value of the '{@link #getModExp() <em>Mod Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModExp()
	 * @generated
	 * @ordered
	 */
	protected TrgModExpression modExp;

	/**
	 * The cached value of the '{@link #getViews() <em>Views</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViews()
	 * @generated
	 * @ordered
	 */
	protected EList<TrgView> views;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrgInstModExpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JointPackage_Ecore2MaudePackage.Literals.TRG_INST_MOD_EXP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgModExpression getModExp() {
		return modExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModExp(TrgModExpression newModExp, NotificationChain msgs) {
		TrgModExpression oldModExp = modExp;
		modExp = newModExp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JointPackage_Ecore2MaudePackage.TRG_INST_MOD_EXP__MOD_EXP, oldModExp, newModExp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModExp(TrgModExpression newModExp) {
		if (newModExp != modExp) {
			NotificationChain msgs = null;
			if (modExp != null)
				msgs = ((InternalEObject)modExp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JointPackage_Ecore2MaudePackage.TRG_INST_MOD_EXP__MOD_EXP, null, msgs);
			if (newModExp != null)
				msgs = ((InternalEObject)newModExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JointPackage_Ecore2MaudePackage.TRG_INST_MOD_EXP__MOD_EXP, null, msgs);
			msgs = basicSetModExp(newModExp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_Ecore2MaudePackage.TRG_INST_MOD_EXP__MOD_EXP, newModExp, newModExp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TrgView> getViews() {
		if (views == null) {
			views = new EObjectResolvingEList<TrgView>(TrgView.class, this, JointPackage_Ecore2MaudePackage.TRG_INST_MOD_EXP__VIEWS);
		}
		return views;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JointPackage_Ecore2MaudePackage.TRG_INST_MOD_EXP__MOD_EXP:
				return basicSetModExp(null, msgs);
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
			case JointPackage_Ecore2MaudePackage.TRG_INST_MOD_EXP__MOD_EXP:
				return getModExp();
			case JointPackage_Ecore2MaudePackage.TRG_INST_MOD_EXP__VIEWS:
				return getViews();
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
			case JointPackage_Ecore2MaudePackage.TRG_INST_MOD_EXP__MOD_EXP:
				setModExp((TrgModExpression)newValue);
				return;
			case JointPackage_Ecore2MaudePackage.TRG_INST_MOD_EXP__VIEWS:
				getViews().clear();
				getViews().addAll((Collection<? extends TrgView>)newValue);
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
			case JointPackage_Ecore2MaudePackage.TRG_INST_MOD_EXP__MOD_EXP:
				setModExp((TrgModExpression)null);
				return;
			case JointPackage_Ecore2MaudePackage.TRG_INST_MOD_EXP__VIEWS:
				getViews().clear();
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
			case JointPackage_Ecore2MaudePackage.TRG_INST_MOD_EXP__MOD_EXP:
				return modExp != null;
			case JointPackage_Ecore2MaudePackage.TRG_INST_MOD_EXP__VIEWS:
				return views != null && !views.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TrgInstModExpImpl
