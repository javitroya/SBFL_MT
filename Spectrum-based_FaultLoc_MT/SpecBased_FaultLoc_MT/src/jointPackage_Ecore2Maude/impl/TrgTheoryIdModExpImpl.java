/**
 */
package jointPackage_Ecore2Maude.impl;

import jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage;
import jointPackage_Ecore2Maude.TrgTheory;
import jointPackage_Ecore2Maude.TrgTheoryIdModExp;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trg Theory Id Mod Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_Ecore2Maude.impl.TrgTheoryIdModExpImpl#getTheory <em>Theory</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrgTheoryIdModExpImpl extends TrgModExpressionImpl implements TrgTheoryIdModExp {
	/**
	 * The cached value of the '{@link #getTheory() <em>Theory</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheory()
	 * @generated
	 * @ordered
	 */
	protected TrgTheory theory;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrgTheoryIdModExpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JointPackage_Ecore2MaudePackage.Literals.TRG_THEORY_ID_MOD_EXP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgTheory getTheory() {
		if (theory != null && theory.eIsProxy()) {
			InternalEObject oldTheory = (InternalEObject)theory;
			theory = (TrgTheory)eResolveProxy(oldTheory);
			if (theory != oldTheory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JointPackage_Ecore2MaudePackage.TRG_THEORY_ID_MOD_EXP__THEORY, oldTheory, theory));
			}
		}
		return theory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgTheory basicGetTheory() {
		return theory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheory(TrgTheory newTheory) {
		TrgTheory oldTheory = theory;
		theory = newTheory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_Ecore2MaudePackage.TRG_THEORY_ID_MOD_EXP__THEORY, oldTheory, theory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JointPackage_Ecore2MaudePackage.TRG_THEORY_ID_MOD_EXP__THEORY:
				if (resolve) return getTheory();
				return basicGetTheory();
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
			case JointPackage_Ecore2MaudePackage.TRG_THEORY_ID_MOD_EXP__THEORY:
				setTheory((TrgTheory)newValue);
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
			case JointPackage_Ecore2MaudePackage.TRG_THEORY_ID_MOD_EXP__THEORY:
				setTheory((TrgTheory)null);
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
			case JointPackage_Ecore2MaudePackage.TRG_THEORY_ID_MOD_EXP__THEORY:
				return theory != null;
		}
		return super.eIsSet(featureID);
	}

} //TrgTheoryIdModExpImpl
