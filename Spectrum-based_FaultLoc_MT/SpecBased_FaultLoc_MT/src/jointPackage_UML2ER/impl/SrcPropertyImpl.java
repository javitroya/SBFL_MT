/**
 */
package jointPackage_UML2ER.impl;

import jointPackage_UML2ER.JointPackage_UML2ERPackage;
import jointPackage_UML2ER.SrcClass;
import jointPackage_UML2ER.SrcProperty;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Src Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_UML2ER.impl.SrcPropertyImpl#getPrimitiveType <em>Primitive Type</em>}</li>
 *   <li>{@link jointPackage_UML2ER.impl.SrcPropertyImpl#getComplexType <em>Complex Type</em>}</li>
 *   <li>{@link jointPackage_UML2ER.impl.SrcPropertyImpl#isIsContainment <em>Is Containment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SrcPropertyImpl extends SrcNamedElementImpl implements SrcProperty {
	/**
	 * The default value of the '{@link #getPrimitiveType() <em>Primitive Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitiveType()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIMITIVE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrimitiveType() <em>Primitive Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitiveType()
	 * @generated
	 * @ordered
	 */
	protected String primitiveType = PRIMITIVE_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComplexType() <em>Complex Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplexType()
	 * @generated
	 * @ordered
	 */
	protected SrcClass complexType;

	/**
	 * The default value of the '{@link #isIsContainment() <em>Is Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsContainment()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CONTAINMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsContainment() <em>Is Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsContainment()
	 * @generated
	 * @ordered
	 */
	protected boolean isContainment = IS_CONTAINMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SrcPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JointPackage_UML2ERPackage.Literals.SRC_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrimitiveType() {
		return primitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimitiveType(String newPrimitiveType) {
		String oldPrimitiveType = primitiveType;
		primitiveType = newPrimitiveType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_UML2ERPackage.SRC_PROPERTY__PRIMITIVE_TYPE, oldPrimitiveType, primitiveType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcClass getComplexType() {
		if (complexType != null && complexType.eIsProxy()) {
			InternalEObject oldComplexType = (InternalEObject)complexType;
			complexType = (SrcClass)eResolveProxy(oldComplexType);
			if (complexType != oldComplexType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JointPackage_UML2ERPackage.SRC_PROPERTY__COMPLEX_TYPE, oldComplexType, complexType));
			}
		}
		return complexType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcClass basicGetComplexType() {
		return complexType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComplexType(SrcClass newComplexType) {
		SrcClass oldComplexType = complexType;
		complexType = newComplexType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_UML2ERPackage.SRC_PROPERTY__COMPLEX_TYPE, oldComplexType, complexType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsContainment() {
		return isContainment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsContainment(boolean newIsContainment) {
		boolean oldIsContainment = isContainment;
		isContainment = newIsContainment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_UML2ERPackage.SRC_PROPERTY__IS_CONTAINMENT, oldIsContainment, isContainment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JointPackage_UML2ERPackage.SRC_PROPERTY__PRIMITIVE_TYPE:
				return getPrimitiveType();
			case JointPackage_UML2ERPackage.SRC_PROPERTY__COMPLEX_TYPE:
				if (resolve) return getComplexType();
				return basicGetComplexType();
			case JointPackage_UML2ERPackage.SRC_PROPERTY__IS_CONTAINMENT:
				return isIsContainment();
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
			case JointPackage_UML2ERPackage.SRC_PROPERTY__PRIMITIVE_TYPE:
				setPrimitiveType((String)newValue);
				return;
			case JointPackage_UML2ERPackage.SRC_PROPERTY__COMPLEX_TYPE:
				setComplexType((SrcClass)newValue);
				return;
			case JointPackage_UML2ERPackage.SRC_PROPERTY__IS_CONTAINMENT:
				setIsContainment((Boolean)newValue);
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
			case JointPackage_UML2ERPackage.SRC_PROPERTY__PRIMITIVE_TYPE:
				setPrimitiveType(PRIMITIVE_TYPE_EDEFAULT);
				return;
			case JointPackage_UML2ERPackage.SRC_PROPERTY__COMPLEX_TYPE:
				setComplexType((SrcClass)null);
				return;
			case JointPackage_UML2ERPackage.SRC_PROPERTY__IS_CONTAINMENT:
				setIsContainment(IS_CONTAINMENT_EDEFAULT);
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
			case JointPackage_UML2ERPackage.SRC_PROPERTY__PRIMITIVE_TYPE:
				return PRIMITIVE_TYPE_EDEFAULT == null ? primitiveType != null : !PRIMITIVE_TYPE_EDEFAULT.equals(primitiveType);
			case JointPackage_UML2ERPackage.SRC_PROPERTY__COMPLEX_TYPE:
				return complexType != null;
			case JointPackage_UML2ERPackage.SRC_PROPERTY__IS_CONTAINMENT:
				return isContainment != IS_CONTAINMENT_EDEFAULT;
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
		result.append(" (primitiveType: ");
		result.append(primitiveType);
		result.append(", isContainment: ");
		result.append(isContainment);
		result.append(')');
		return result.toString();
	}

} //SrcPropertyImpl
