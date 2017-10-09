/**
 */
package jointPackage_Ecore2Maude.impl;

import jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage;
import jointPackage_Ecore2Maude.SrcEOperation;
import jointPackage_Ecore2Maude.SrcEParameter;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Src EParameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_Ecore2Maude.impl.SrcEParameterImpl#getEOperation <em>EOperation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SrcEParameterImpl extends SrcETypedElementImpl implements SrcEParameter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SrcEParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JointPackage_Ecore2MaudePackage.Literals.SRC_EPARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcEOperation getEOperation() {
		if (eContainerFeatureID() != JointPackage_Ecore2MaudePackage.SRC_EPARAMETER__EOPERATION) return null;
		return (SrcEOperation)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JointPackage_Ecore2MaudePackage.SRC_EPARAMETER__EOPERATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, JointPackage_Ecore2MaudePackage.SRC_EPARAMETER__EOPERATION, msgs);
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
			case JointPackage_Ecore2MaudePackage.SRC_EPARAMETER__EOPERATION:
				return eBasicSetContainer(null, JointPackage_Ecore2MaudePackage.SRC_EPARAMETER__EOPERATION, msgs);
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
			case JointPackage_Ecore2MaudePackage.SRC_EPARAMETER__EOPERATION:
				return eInternalContainer().eInverseRemove(this, JointPackage_Ecore2MaudePackage.SRC_EOPERATION__EPARAMETERS, SrcEOperation.class, msgs);
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
			case JointPackage_Ecore2MaudePackage.SRC_EPARAMETER__EOPERATION:
				return getEOperation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case JointPackage_Ecore2MaudePackage.SRC_EPARAMETER__EOPERATION:
				return getEOperation() != null;
		}
		return super.eIsSet(featureID);
	}

} //SrcEParameterImpl
