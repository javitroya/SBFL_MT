/**
 */
package jointPackage_Ecore2Maude.impl;

import java.util.Collection;

import jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage;
import jointPackage_Ecore2Maude.SrcEClass;
import jointPackage_Ecore2Maude.SrcEClassifier;
import jointPackage_Ecore2Maude.SrcEOperation;
import jointPackage_Ecore2Maude.SrcEParameter;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Src EOperation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_Ecore2Maude.impl.SrcEOperationImpl#getEContainingClass <em>EContaining Class</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.impl.SrcEOperationImpl#getEParameters <em>EParameters</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.impl.SrcEOperationImpl#getEExceptions <em>EExceptions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SrcEOperationImpl extends SrcETypedElementImpl implements SrcEOperation {
	/**
	 * The cached value of the '{@link #getEParameters() <em>EParameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<SrcEParameter> eParameters;

	/**
	 * The cached value of the '{@link #getEExceptions() <em>EExceptions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEExceptions()
	 * @generated
	 * @ordered
	 */
	protected EList<SrcEClassifier> eExceptions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SrcEOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JointPackage_Ecore2MaudePackage.Literals.SRC_EOPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcEClass getEContainingClass() {
		if (eContainerFeatureID() != JointPackage_Ecore2MaudePackage.SRC_EOPERATION__ECONTAINING_CLASS) return null;
		return (SrcEClass)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SrcEParameter> getEParameters() {
		if (eParameters == null) {
			eParameters = new EObjectContainmentWithInverseEList<SrcEParameter>(SrcEParameter.class, this, JointPackage_Ecore2MaudePackage.SRC_EOPERATION__EPARAMETERS, JointPackage_Ecore2MaudePackage.SRC_EPARAMETER__EOPERATION);
		}
		return eParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SrcEClassifier> getEExceptions() {
		if (eExceptions == null) {
			eExceptions = new EObjectResolvingEList.Unsettable<SrcEClassifier>(SrcEClassifier.class, this, JointPackage_Ecore2MaudePackage.SRC_EOPERATION__EEXCEPTIONS);
		}
		return eExceptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEExceptions() {
		if (eExceptions != null) ((InternalEList.Unsettable<?>)eExceptions).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEExceptions() {
		return eExceptions != null && ((InternalEList.Unsettable<?>)eExceptions).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JointPackage_Ecore2MaudePackage.SRC_EOPERATION__ECONTAINING_CLASS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, JointPackage_Ecore2MaudePackage.SRC_EOPERATION__ECONTAINING_CLASS, msgs);
			case JointPackage_Ecore2MaudePackage.SRC_EOPERATION__EPARAMETERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEParameters()).basicAdd(otherEnd, msgs);
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
			case JointPackage_Ecore2MaudePackage.SRC_EOPERATION__ECONTAINING_CLASS:
				return eBasicSetContainer(null, JointPackage_Ecore2MaudePackage.SRC_EOPERATION__ECONTAINING_CLASS, msgs);
			case JointPackage_Ecore2MaudePackage.SRC_EOPERATION__EPARAMETERS:
				return ((InternalEList<?>)getEParameters()).basicRemove(otherEnd, msgs);
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
			case JointPackage_Ecore2MaudePackage.SRC_EOPERATION__ECONTAINING_CLASS:
				return eInternalContainer().eInverseRemove(this, JointPackage_Ecore2MaudePackage.SRC_ECLASS__EOPERATIONS, SrcEClass.class, msgs);
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
			case JointPackage_Ecore2MaudePackage.SRC_EOPERATION__ECONTAINING_CLASS:
				return getEContainingClass();
			case JointPackage_Ecore2MaudePackage.SRC_EOPERATION__EPARAMETERS:
				return getEParameters();
			case JointPackage_Ecore2MaudePackage.SRC_EOPERATION__EEXCEPTIONS:
				return getEExceptions();
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
			case JointPackage_Ecore2MaudePackage.SRC_EOPERATION__EPARAMETERS:
				getEParameters().clear();
				getEParameters().addAll((Collection<? extends SrcEParameter>)newValue);
				return;
			case JointPackage_Ecore2MaudePackage.SRC_EOPERATION__EEXCEPTIONS:
				getEExceptions().clear();
				getEExceptions().addAll((Collection<? extends SrcEClassifier>)newValue);
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
			case JointPackage_Ecore2MaudePackage.SRC_EOPERATION__EPARAMETERS:
				getEParameters().clear();
				return;
			case JointPackage_Ecore2MaudePackage.SRC_EOPERATION__EEXCEPTIONS:
				unsetEExceptions();
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
			case JointPackage_Ecore2MaudePackage.SRC_EOPERATION__ECONTAINING_CLASS:
				return getEContainingClass() != null;
			case JointPackage_Ecore2MaudePackage.SRC_EOPERATION__EPARAMETERS:
				return eParameters != null && !eParameters.isEmpty();
			case JointPackage_Ecore2MaudePackage.SRC_EOPERATION__EEXCEPTIONS:
				return isSetEExceptions();
		}
		return super.eIsSet(featureID);
	}

} //SrcEOperationImpl
