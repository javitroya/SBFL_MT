/**
 */
package jointPackage_Ecore2Maude.impl;

import java.util.Collection;

import jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage;
import jointPackage_Ecore2Maude.TrgMaudeSpec;
import jointPackage_Ecore2Maude.TrgMaudeTopEl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trg Maude Spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_Ecore2Maude.impl.TrgMaudeSpecImpl#getEls <em>Els</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.impl.TrgMaudeSpecImpl#getPrintableEls <em>Printable Els</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrgMaudeSpecImpl extends MinimalEObjectImpl.Container implements TrgMaudeSpec {
	/**
	 * The cached value of the '{@link #getEls() <em>Els</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEls()
	 * @generated
	 * @ordered
	 */
	protected EList<TrgMaudeTopEl> els;

	/**
	 * The cached value of the '{@link #getPrintableEls() <em>Printable Els</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrintableEls()
	 * @generated
	 * @ordered
	 */
	protected EList<TrgMaudeTopEl> printableEls;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrgMaudeSpecImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JointPackage_Ecore2MaudePackage.Literals.TRG_MAUDE_SPEC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TrgMaudeTopEl> getEls() {
		if (els == null) {
			els = new EObjectContainmentEList<TrgMaudeTopEl>(TrgMaudeTopEl.class, this, JointPackage_Ecore2MaudePackage.TRG_MAUDE_SPEC__ELS);
		}
		return els;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TrgMaudeTopEl> getPrintableEls() {
		if (printableEls == null) {
			printableEls = new EObjectResolvingEList<TrgMaudeTopEl>(TrgMaudeTopEl.class, this, JointPackage_Ecore2MaudePackage.TRG_MAUDE_SPEC__PRINTABLE_ELS);
		}
		return printableEls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JointPackage_Ecore2MaudePackage.TRG_MAUDE_SPEC__ELS:
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
			case JointPackage_Ecore2MaudePackage.TRG_MAUDE_SPEC__ELS:
				return getEls();
			case JointPackage_Ecore2MaudePackage.TRG_MAUDE_SPEC__PRINTABLE_ELS:
				return getPrintableEls();
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
			case JointPackage_Ecore2MaudePackage.TRG_MAUDE_SPEC__ELS:
				getEls().clear();
				getEls().addAll((Collection<? extends TrgMaudeTopEl>)newValue);
				return;
			case JointPackage_Ecore2MaudePackage.TRG_MAUDE_SPEC__PRINTABLE_ELS:
				getPrintableEls().clear();
				getPrintableEls().addAll((Collection<? extends TrgMaudeTopEl>)newValue);
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
			case JointPackage_Ecore2MaudePackage.TRG_MAUDE_SPEC__ELS:
				getEls().clear();
				return;
			case JointPackage_Ecore2MaudePackage.TRG_MAUDE_SPEC__PRINTABLE_ELS:
				getPrintableEls().clear();
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
			case JointPackage_Ecore2MaudePackage.TRG_MAUDE_SPEC__ELS:
				return els != null && !els.isEmpty();
			case JointPackage_Ecore2MaudePackage.TRG_MAUDE_SPEC__PRINTABLE_ELS:
				return printableEls != null && !printableEls.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TrgMaudeSpecImpl
