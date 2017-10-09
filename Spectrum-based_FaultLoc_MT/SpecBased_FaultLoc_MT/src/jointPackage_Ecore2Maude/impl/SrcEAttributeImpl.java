/**
 */
package jointPackage_Ecore2Maude.impl;

import jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage;
import jointPackage_Ecore2Maude.SrcEAttribute;
import jointPackage_Ecore2Maude.SrcEDataType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Src EAttribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_Ecore2Maude.impl.SrcEAttributeImpl#isID <em>ID</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.impl.SrcEAttributeImpl#getEAttributeType <em>EAttribute Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SrcEAttributeImpl extends SrcEStructuralFeatureImpl implements SrcEAttribute {
	/**
	 * The default value of the '{@link #isID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isID()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ID_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isID()
	 * @generated
	 * @ordered
	 */
	protected boolean iD = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEAttributeType() <em>EAttribute Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAttributeType()
	 * @generated
	 * @ordered
	 */
	protected SrcEDataType eAttributeType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SrcEAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JointPackage_Ecore2MaudePackage.Literals.SRC_EATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isID() {
		return iD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(boolean newID) {
		boolean oldID = iD;
		iD = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_Ecore2MaudePackage.SRC_EATTRIBUTE__ID, oldID, iD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcEDataType getEAttributeType() {
		if (eAttributeType != null && eAttributeType.eIsProxy()) {
			InternalEObject oldEAttributeType = (InternalEObject)eAttributeType;
			eAttributeType = (SrcEDataType)eResolveProxy(oldEAttributeType);
			if (eAttributeType != oldEAttributeType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JointPackage_Ecore2MaudePackage.SRC_EATTRIBUTE__EATTRIBUTE_TYPE, oldEAttributeType, eAttributeType));
			}
		}
		return eAttributeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcEDataType basicGetEAttributeType() {
		return eAttributeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEAttributeType(SrcEDataType newEAttributeType) {
		SrcEDataType oldEAttributeType = eAttributeType;
		eAttributeType = newEAttributeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_Ecore2MaudePackage.SRC_EATTRIBUTE__EATTRIBUTE_TYPE, oldEAttributeType, eAttributeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JointPackage_Ecore2MaudePackage.SRC_EATTRIBUTE__ID:
				return isID();
			case JointPackage_Ecore2MaudePackage.SRC_EATTRIBUTE__EATTRIBUTE_TYPE:
				if (resolve) return getEAttributeType();
				return basicGetEAttributeType();
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
			case JointPackage_Ecore2MaudePackage.SRC_EATTRIBUTE__ID:
				setID((Boolean)newValue);
				return;
			case JointPackage_Ecore2MaudePackage.SRC_EATTRIBUTE__EATTRIBUTE_TYPE:
				setEAttributeType((SrcEDataType)newValue);
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
			case JointPackage_Ecore2MaudePackage.SRC_EATTRIBUTE__ID:
				setID(ID_EDEFAULT);
				return;
			case JointPackage_Ecore2MaudePackage.SRC_EATTRIBUTE__EATTRIBUTE_TYPE:
				setEAttributeType((SrcEDataType)null);
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
			case JointPackage_Ecore2MaudePackage.SRC_EATTRIBUTE__ID:
				return iD != ID_EDEFAULT;
			case JointPackage_Ecore2MaudePackage.SRC_EATTRIBUTE__EATTRIBUTE_TYPE:
				return eAttributeType != null;
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
		result.append(" (iD: ");
		result.append(iD);
		result.append(')');
		return result.toString();
	}

} //SrcEAttributeImpl
