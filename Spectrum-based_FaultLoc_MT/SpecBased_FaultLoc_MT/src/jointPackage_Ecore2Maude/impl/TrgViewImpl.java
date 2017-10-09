/**
 */
package jointPackage_Ecore2Maude.impl;

import java.util.Collection;

import jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage;
import jointPackage_Ecore2Maude.TrgModExpression;
import jointPackage_Ecore2Maude.TrgView;
import jointPackage_Ecore2Maude.TrgViewMapping;

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
 * An implementation of the model object '<em><b>Trg View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_Ecore2Maude.impl.TrgViewImpl#getFrom <em>From</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.impl.TrgViewImpl#getTo <em>To</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.impl.TrgViewImpl#getEls <em>Els</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrgViewImpl extends TrgMaudeTopElImpl implements TrgView {
	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected TrgModExpression from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected TrgModExpression to;

	/**
	 * The cached value of the '{@link #getEls() <em>Els</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEls()
	 * @generated
	 * @ordered
	 */
	protected EList<TrgViewMapping> els;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrgViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JointPackage_Ecore2MaudePackage.Literals.TRG_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgModExpression getFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrom(TrgModExpression newFrom, NotificationChain msgs) {
		TrgModExpression oldFrom = from;
		from = newFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JointPackage_Ecore2MaudePackage.TRG_VIEW__FROM, oldFrom, newFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(TrgModExpression newFrom) {
		if (newFrom != from) {
			NotificationChain msgs = null;
			if (from != null)
				msgs = ((InternalEObject)from).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JointPackage_Ecore2MaudePackage.TRG_VIEW__FROM, null, msgs);
			if (newFrom != null)
				msgs = ((InternalEObject)newFrom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JointPackage_Ecore2MaudePackage.TRG_VIEW__FROM, null, msgs);
			msgs = basicSetFrom(newFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_Ecore2MaudePackage.TRG_VIEW__FROM, newFrom, newFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgModExpression getTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTo(TrgModExpression newTo, NotificationChain msgs) {
		TrgModExpression oldTo = to;
		to = newTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JointPackage_Ecore2MaudePackage.TRG_VIEW__TO, oldTo, newTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(TrgModExpression newTo) {
		if (newTo != to) {
			NotificationChain msgs = null;
			if (to != null)
				msgs = ((InternalEObject)to).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JointPackage_Ecore2MaudePackage.TRG_VIEW__TO, null, msgs);
			if (newTo != null)
				msgs = ((InternalEObject)newTo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JointPackage_Ecore2MaudePackage.TRG_VIEW__TO, null, msgs);
			msgs = basicSetTo(newTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_Ecore2MaudePackage.TRG_VIEW__TO, newTo, newTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TrgViewMapping> getEls() {
		if (els == null) {
			els = new EObjectContainmentEList<TrgViewMapping>(TrgViewMapping.class, this, JointPackage_Ecore2MaudePackage.TRG_VIEW__ELS);
		}
		return els;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JointPackage_Ecore2MaudePackage.TRG_VIEW__FROM:
				return basicSetFrom(null, msgs);
			case JointPackage_Ecore2MaudePackage.TRG_VIEW__TO:
				return basicSetTo(null, msgs);
			case JointPackage_Ecore2MaudePackage.TRG_VIEW__ELS:
				return ((InternalEList<?>)getEls()).basicRemove(otherEnd, msgs);
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
			case JointPackage_Ecore2MaudePackage.TRG_VIEW__FROM:
				return getFrom();
			case JointPackage_Ecore2MaudePackage.TRG_VIEW__TO:
				return getTo();
			case JointPackage_Ecore2MaudePackage.TRG_VIEW__ELS:
				return getEls();
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
			case JointPackage_Ecore2MaudePackage.TRG_VIEW__FROM:
				setFrom((TrgModExpression)newValue);
				return;
			case JointPackage_Ecore2MaudePackage.TRG_VIEW__TO:
				setTo((TrgModExpression)newValue);
				return;
			case JointPackage_Ecore2MaudePackage.TRG_VIEW__ELS:
				getEls().clear();
				getEls().addAll((Collection<? extends TrgViewMapping>)newValue);
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
			case JointPackage_Ecore2MaudePackage.TRG_VIEW__FROM:
				setFrom((TrgModExpression)null);
				return;
			case JointPackage_Ecore2MaudePackage.TRG_VIEW__TO:
				setTo((TrgModExpression)null);
				return;
			case JointPackage_Ecore2MaudePackage.TRG_VIEW__ELS:
				getEls().clear();
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
			case JointPackage_Ecore2MaudePackage.TRG_VIEW__FROM:
				return from != null;
			case JointPackage_Ecore2MaudePackage.TRG_VIEW__TO:
				return to != null;
			case JointPackage_Ecore2MaudePackage.TRG_VIEW__ELS:
				return els != null && !els.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TrgViewImpl
