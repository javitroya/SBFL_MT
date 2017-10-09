/**
 */
package jointPackage_Ecore2Maude.impl;

import jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage;
import jointPackage_Ecore2Maude.TrgModElement;
import jointPackage_Ecore2Maude.TrgModule;
import jointPackage_Ecore2Maude.TrgTheory;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trg Mod Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_Ecore2Maude.impl.TrgModElementImpl#getModule <em>Module</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.impl.TrgModElementImpl#getTheory <em>Theory</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TrgModElementImpl extends MinimalEObjectImpl.Container implements TrgModElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrgModElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JointPackage_Ecore2MaudePackage.Literals.TRG_MOD_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgModule getModule() {
		if (eContainerFeatureID() != JointPackage_Ecore2MaudePackage.TRG_MOD_ELEMENT__MODULE) return null;
		return (TrgModule)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModule(TrgModule newModule, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newModule, JointPackage_Ecore2MaudePackage.TRG_MOD_ELEMENT__MODULE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModule(TrgModule newModule) {
		if (newModule != eInternalContainer() || (eContainerFeatureID() != JointPackage_Ecore2MaudePackage.TRG_MOD_ELEMENT__MODULE && newModule != null)) {
			if (EcoreUtil.isAncestor(this, newModule))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModule != null)
				msgs = ((InternalEObject)newModule).eInverseAdd(this, JointPackage_Ecore2MaudePackage.TRG_MODULE__ELS, TrgModule.class, msgs);
			msgs = basicSetModule(newModule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_Ecore2MaudePackage.TRG_MOD_ELEMENT__MODULE, newModule, newModule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgTheory getTheory() {
		if (eContainerFeatureID() != JointPackage_Ecore2MaudePackage.TRG_MOD_ELEMENT__THEORY) return null;
		return (TrgTheory)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheory(TrgTheory newTheory, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTheory, JointPackage_Ecore2MaudePackage.TRG_MOD_ELEMENT__THEORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheory(TrgTheory newTheory) {
		if (newTheory != eInternalContainer() || (eContainerFeatureID() != JointPackage_Ecore2MaudePackage.TRG_MOD_ELEMENT__THEORY && newTheory != null)) {
			if (EcoreUtil.isAncestor(this, newTheory))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTheory != null)
				msgs = ((InternalEObject)newTheory).eInverseAdd(this, JointPackage_Ecore2MaudePackage.TRG_THEORY__ELS, TrgTheory.class, msgs);
			msgs = basicSetTheory(newTheory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_Ecore2MaudePackage.TRG_MOD_ELEMENT__THEORY, newTheory, newTheory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JointPackage_Ecore2MaudePackage.TRG_MOD_ELEMENT__MODULE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetModule((TrgModule)otherEnd, msgs);
			case JointPackage_Ecore2MaudePackage.TRG_MOD_ELEMENT__THEORY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTheory((TrgTheory)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JointPackage_Ecore2MaudePackage.TRG_MOD_ELEMENT__MODULE:
				return basicSetModule(null, msgs);
			case JointPackage_Ecore2MaudePackage.TRG_MOD_ELEMENT__THEORY:
				return basicSetTheory(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case JointPackage_Ecore2MaudePackage.TRG_MOD_ELEMENT__MODULE:
				return eInternalContainer().eInverseRemove(this, JointPackage_Ecore2MaudePackage.TRG_MODULE__ELS, TrgModule.class, msgs);
			case JointPackage_Ecore2MaudePackage.TRG_MOD_ELEMENT__THEORY:
				return eInternalContainer().eInverseRemove(this, JointPackage_Ecore2MaudePackage.TRG_THEORY__ELS, TrgTheory.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JointPackage_Ecore2MaudePackage.TRG_MOD_ELEMENT__MODULE:
				return getModule();
			case JointPackage_Ecore2MaudePackage.TRG_MOD_ELEMENT__THEORY:
				return getTheory();
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
			case JointPackage_Ecore2MaudePackage.TRG_MOD_ELEMENT__MODULE:
				setModule((TrgModule)newValue);
				return;
			case JointPackage_Ecore2MaudePackage.TRG_MOD_ELEMENT__THEORY:
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
			case JointPackage_Ecore2MaudePackage.TRG_MOD_ELEMENT__MODULE:
				setModule((TrgModule)null);
				return;
			case JointPackage_Ecore2MaudePackage.TRG_MOD_ELEMENT__THEORY:
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
			case JointPackage_Ecore2MaudePackage.TRG_MOD_ELEMENT__MODULE:
				return getModule() != null;
			case JointPackage_Ecore2MaudePackage.TRG_MOD_ELEMENT__THEORY:
				return getTheory() != null;
		}
		return super.eIsSet(featureID);
	}

} //TrgModElementImpl
