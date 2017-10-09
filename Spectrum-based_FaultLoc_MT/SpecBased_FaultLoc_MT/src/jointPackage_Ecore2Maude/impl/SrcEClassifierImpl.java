/**
 */
package jointPackage_Ecore2Maude.impl;

import java.lang.reflect.InvocationTargetException;

import jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage;
import jointPackage_Ecore2Maude.SrcEClassifier;
import jointPackage_Ecore2Maude.SrcEPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Src EClassifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_Ecore2Maude.impl.SrcEClassifierImpl#getInstanceClassName <em>Instance Class Name</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.impl.SrcEClassifierImpl#getInstanceTypeName <em>Instance Type Name</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.impl.SrcEClassifierImpl#getEPackage <em>EPackage</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SrcEClassifierImpl extends SrcENamedElementImpl implements SrcEClassifier {
	/**
	 * The default value of the '{@link #getInstanceClassName() <em>Instance Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANCE_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstanceClassName() <em>Instance Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceClassName()
	 * @generated
	 * @ordered
	 */
	protected String instanceClassName = INSTANCE_CLASS_NAME_EDEFAULT;

	/**
	 * This is true if the Instance Class Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean instanceClassNameESet;

	/**
	 * The default value of the '{@link #getInstanceTypeName() <em>Instance Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANCE_TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstanceTypeName() <em>Instance Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceTypeName()
	 * @generated
	 * @ordered
	 */
	protected String instanceTypeName = INSTANCE_TYPE_NAME_EDEFAULT;

	/**
	 * This is true if the Instance Type Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean instanceTypeNameESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SrcEClassifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JointPackage_Ecore2MaudePackage.Literals.SRC_ECLASSIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstanceClassName() {
		return instanceClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceClassName(String newInstanceClassName) {
		String oldInstanceClassName = instanceClassName;
		instanceClassName = newInstanceClassName;
		boolean oldInstanceClassNameESet = instanceClassNameESet;
		instanceClassNameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_Ecore2MaudePackage.SRC_ECLASSIFIER__INSTANCE_CLASS_NAME, oldInstanceClassName, instanceClassName, !oldInstanceClassNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInstanceClassName() {
		String oldInstanceClassName = instanceClassName;
		boolean oldInstanceClassNameESet = instanceClassNameESet;
		instanceClassName = INSTANCE_CLASS_NAME_EDEFAULT;
		instanceClassNameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, JointPackage_Ecore2MaudePackage.SRC_ECLASSIFIER__INSTANCE_CLASS_NAME, oldInstanceClassName, INSTANCE_CLASS_NAME_EDEFAULT, oldInstanceClassNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInstanceClassName() {
		return instanceClassNameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstanceTypeName() {
		return instanceTypeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceTypeName(String newInstanceTypeName) {
		String oldInstanceTypeName = instanceTypeName;
		instanceTypeName = newInstanceTypeName;
		boolean oldInstanceTypeNameESet = instanceTypeNameESet;
		instanceTypeNameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_Ecore2MaudePackage.SRC_ECLASSIFIER__INSTANCE_TYPE_NAME, oldInstanceTypeName, instanceTypeName, !oldInstanceTypeNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInstanceTypeName() {
		String oldInstanceTypeName = instanceTypeName;
		boolean oldInstanceTypeNameESet = instanceTypeNameESet;
		instanceTypeName = INSTANCE_TYPE_NAME_EDEFAULT;
		instanceTypeNameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, JointPackage_Ecore2MaudePackage.SRC_ECLASSIFIER__INSTANCE_TYPE_NAME, oldInstanceTypeName, INSTANCE_TYPE_NAME_EDEFAULT, oldInstanceTypeNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInstanceTypeName() {
		return instanceTypeNameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcEPackage getEPackage() {
		if (eContainerFeatureID() != JointPackage_Ecore2MaudePackage.SRC_ECLASSIFIER__EPACKAGE) return null;
		return (SrcEPackage)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getClassifierID() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JointPackage_Ecore2MaudePackage.SRC_ECLASSIFIER__EPACKAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, JointPackage_Ecore2MaudePackage.SRC_ECLASSIFIER__EPACKAGE, msgs);
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
			case JointPackage_Ecore2MaudePackage.SRC_ECLASSIFIER__EPACKAGE:
				return eBasicSetContainer(null, JointPackage_Ecore2MaudePackage.SRC_ECLASSIFIER__EPACKAGE, msgs);
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
			case JointPackage_Ecore2MaudePackage.SRC_ECLASSIFIER__EPACKAGE:
				return eInternalContainer().eInverseRemove(this, JointPackage_Ecore2MaudePackage.SRC_EPACKAGE__ECLASSIFIERS, SrcEPackage.class, msgs);
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
			case JointPackage_Ecore2MaudePackage.SRC_ECLASSIFIER__INSTANCE_CLASS_NAME:
				return getInstanceClassName();
			case JointPackage_Ecore2MaudePackage.SRC_ECLASSIFIER__INSTANCE_TYPE_NAME:
				return getInstanceTypeName();
			case JointPackage_Ecore2MaudePackage.SRC_ECLASSIFIER__EPACKAGE:
				return getEPackage();
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
			case JointPackage_Ecore2MaudePackage.SRC_ECLASSIFIER__INSTANCE_CLASS_NAME:
				setInstanceClassName((String)newValue);
				return;
			case JointPackage_Ecore2MaudePackage.SRC_ECLASSIFIER__INSTANCE_TYPE_NAME:
				setInstanceTypeName((String)newValue);
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
			case JointPackage_Ecore2MaudePackage.SRC_ECLASSIFIER__INSTANCE_CLASS_NAME:
				unsetInstanceClassName();
				return;
			case JointPackage_Ecore2MaudePackage.SRC_ECLASSIFIER__INSTANCE_TYPE_NAME:
				unsetInstanceTypeName();
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
			case JointPackage_Ecore2MaudePackage.SRC_ECLASSIFIER__INSTANCE_CLASS_NAME:
				return isSetInstanceClassName();
			case JointPackage_Ecore2MaudePackage.SRC_ECLASSIFIER__INSTANCE_TYPE_NAME:
				return isSetInstanceTypeName();
			case JointPackage_Ecore2MaudePackage.SRC_ECLASSIFIER__EPACKAGE:
				return getEPackage() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case JointPackage_Ecore2MaudePackage.SRC_ECLASSIFIER___GET_CLASSIFIER_ID:
				return getClassifierID();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (instanceClassName: ");
		if (instanceClassNameESet) result.append(instanceClassName); else result.append("<unset>");
		result.append(", instanceTypeName: ");
		if (instanceTypeNameESet) result.append(instanceTypeName); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SrcEClassifierImpl
