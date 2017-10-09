/**
 */
package jointPackage_Ecore2Maude.impl;

import java.lang.reflect.InvocationTargetException;

import jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage;
import jointPackage_Ecore2Maude.SrcEClass;
import jointPackage_Ecore2Maude.SrcEStructuralFeature;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Src EStructural Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_Ecore2Maude.impl.SrcEStructuralFeatureImpl#isChangeable <em>Changeable</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.impl.SrcEStructuralFeatureImpl#isVolatile <em>Volatile</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.impl.SrcEStructuralFeatureImpl#isTransient <em>Transient</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.impl.SrcEStructuralFeatureImpl#getDefaultValueLiteral <em>Default Value Literal</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.impl.SrcEStructuralFeatureImpl#isUnsettable <em>Unsettable</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.impl.SrcEStructuralFeatureImpl#isDerived <em>Derived</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.impl.SrcEStructuralFeatureImpl#getEContainingClass <em>EContaining Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SrcEStructuralFeatureImpl extends SrcETypedElementImpl implements SrcEStructuralFeature {
	/**
	 * The default value of the '{@link #isChangeable() <em>Changeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isChangeable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHANGEABLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isChangeable() <em>Changeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isChangeable()
	 * @generated
	 * @ordered
	 */
	protected boolean changeable = CHANGEABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isVolatile() <em>Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVolatile()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VOLATILE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVolatile() <em>Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVolatile()
	 * @generated
	 * @ordered
	 */
	protected boolean volatile_ = VOLATILE_EDEFAULT;

	/**
	 * The default value of the '{@link #isTransient() <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransient()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRANSIENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTransient() <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransient()
	 * @generated
	 * @ordered
	 */
	protected boolean transient_ = TRANSIENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultValueLiteral() <em>Default Value Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueLiteral()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_LITERAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValueLiteral() <em>Default Value Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueLiteral()
	 * @generated
	 * @ordered
	 */
	protected String defaultValueLiteral = DEFAULT_VALUE_LITERAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isUnsettable() <em>Unsettable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnsettable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNSETTABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUnsettable() <em>Unsettable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnsettable()
	 * @generated
	 * @ordered
	 */
	protected boolean unsettable = UNSETTABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isDerived() <em>Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDerived()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DERIVED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDerived() <em>Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDerived()
	 * @generated
	 * @ordered
	 */
	protected boolean derived = DERIVED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SrcEStructuralFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JointPackage_Ecore2MaudePackage.Literals.SRC_ESTRUCTURAL_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isChangeable() {
		return changeable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeable(boolean newChangeable) {
		boolean oldChangeable = changeable;
		changeable = newChangeable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_Ecore2MaudePackage.SRC_ESTRUCTURAL_FEATURE__CHANGEABLE, oldChangeable, changeable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVolatile() {
		return volatile_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolatile(boolean newVolatile) {
		boolean oldVolatile = volatile_;
		volatile_ = newVolatile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_Ecore2MaudePackage.SRC_ESTRUCTURAL_FEATURE__VOLATILE, oldVolatile, volatile_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTransient() {
		return transient_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransient(boolean newTransient) {
		boolean oldTransient = transient_;
		transient_ = newTransient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_Ecore2MaudePackage.SRC_ESTRUCTURAL_FEATURE__TRANSIENT, oldTransient, transient_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultValueLiteral() {
		return defaultValueLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValueLiteral(String newDefaultValueLiteral) {
		String oldDefaultValueLiteral = defaultValueLiteral;
		defaultValueLiteral = newDefaultValueLiteral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_Ecore2MaudePackage.SRC_ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL, oldDefaultValueLiteral, defaultValueLiteral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUnsettable() {
		return unsettable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnsettable(boolean newUnsettable) {
		boolean oldUnsettable = unsettable;
		unsettable = newUnsettable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_Ecore2MaudePackage.SRC_ESTRUCTURAL_FEATURE__UNSETTABLE, oldUnsettable, unsettable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDerived() {
		return derived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDerived(boolean newDerived) {
		boolean oldDerived = derived;
		derived = newDerived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_Ecore2MaudePackage.SRC_ESTRUCTURAL_FEATURE__DERIVED, oldDerived, derived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcEClass getEContainingClass() {
		if (eContainerFeatureID() != JointPackage_Ecore2MaudePackage.SRC_ESTRUCTURAL_FEATURE__ECONTAINING_CLASS) return null;
		return (SrcEClass)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFeatureID() {
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
			case JointPackage_Ecore2MaudePackage.SRC_ESTRUCTURAL_FEATURE__ECONTAINING_CLASS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, JointPackage_Ecore2MaudePackage.SRC_ESTRUCTURAL_FEATURE__ECONTAINING_CLASS, msgs);
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
			case JointPackage_Ecore2MaudePackage.SRC_ESTRUCTURAL_FEATURE__ECONTAINING_CLASS:
				return eBasicSetContainer(null, JointPackage_Ecore2MaudePackage.SRC_ESTRUCTURAL_FEATURE__ECONTAINING_CLASS, msgs);
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
			case JointPackage_Ecore2MaudePackage.SRC_ESTRUCTURAL_FEATURE__ECONTAINING_CLASS:
				return eInternalContainer().eInverseRemove(this, JointPackage_Ecore2MaudePackage.SRC_ECLASS__ESTRUCTURAL_FEATURES, SrcEClass.class, msgs);
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
			case JointPackage_Ecore2MaudePackage.SRC_ESTRUCTURAL_FEATURE__CHANGEABLE:
				return isChangeable();
			case JointPackage_Ecore2MaudePackage.SRC_ESTRUCTURAL_FEATURE__VOLATILE:
				return isVolatile();
			case JointPackage_Ecore2MaudePackage.SRC_ESTRUCTURAL_FEATURE__TRANSIENT:
				return isTransient();
			case JointPackage_Ecore2MaudePackage.SRC_ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL:
				return getDefaultValueLiteral();
			case JointPackage_Ecore2MaudePackage.SRC_ESTRUCTURAL_FEATURE__UNSETTABLE:
				return isUnsettable();
			case JointPackage_Ecore2MaudePackage.SRC_ESTRUCTURAL_FEATURE__DERIVED:
				return isDerived();
			case JointPackage_Ecore2MaudePackage.SRC_ESTRUCTURAL_FEATURE__ECONTAINING_CLASS:
				return getEContainingClass();
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
			case JointPackage_Ecore2MaudePackage.SRC_ESTRUCTURAL_FEATURE__CHANGEABLE:
				setChangeable((Boolean)newValue);
				return;
			case JointPackage_Ecore2MaudePackage.SRC_ESTRUCTURAL_FEATURE__VOLATILE:
				setVolatile((Boolean)newValue);
				return;
			case JointPackage_Ecore2MaudePackage.SRC_ESTRUCTURAL_FEATURE__TRANSIENT:
				setTransient((Boolean)newValue);
				return;
			case JointPackage_Ecore2MaudePackage.SRC_ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL:
				setDefaultValueLiteral((String)newValue);
				return;
			case JointPackage_Ecore2MaudePackage.SRC_ESTRUCTURAL_FEATURE__UNSETTABLE:
				setUnsettable((Boolean)newValue);
				return;
			case JointPackage_Ecore2MaudePackage.SRC_ESTRUCTURAL_FEATURE__DERIVED:
				setDerived((Boolean)newValue);
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
			case JointPackage_Ecore2MaudePackage.SRC_ESTRUCTURAL_FEATURE__CHANGEABLE:
				setChangeable(CHANGEABLE_EDEFAULT);
				return;
			case JointPackage_Ecore2MaudePackage.SRC_ESTRUCTURAL_FEATURE__VOLATILE:
				setVolatile(VOLATILE_EDEFAULT);
				return;
			case JointPackage_Ecore2MaudePackage.SRC_ESTRUCTURAL_FEATURE__TRANSIENT:
				setTransient(TRANSIENT_EDEFAULT);
				return;
			case JointPackage_Ecore2MaudePackage.SRC_ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL:
				setDefaultValueLiteral(DEFAULT_VALUE_LITERAL_EDEFAULT);
				return;
			case JointPackage_Ecore2MaudePackage.SRC_ESTRUCTURAL_FEATURE__UNSETTABLE:
				setUnsettable(UNSETTABLE_EDEFAULT);
				return;
			case JointPackage_Ecore2MaudePackage.SRC_ESTRUCTURAL_FEATURE__DERIVED:
				setDerived(DERIVED_EDEFAULT);
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
			case JointPackage_Ecore2MaudePackage.SRC_ESTRUCTURAL_FEATURE__CHANGEABLE:
				return changeable != CHANGEABLE_EDEFAULT;
			case JointPackage_Ecore2MaudePackage.SRC_ESTRUCTURAL_FEATURE__VOLATILE:
				return volatile_ != VOLATILE_EDEFAULT;
			case JointPackage_Ecore2MaudePackage.SRC_ESTRUCTURAL_FEATURE__TRANSIENT:
				return transient_ != TRANSIENT_EDEFAULT;
			case JointPackage_Ecore2MaudePackage.SRC_ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL:
				return DEFAULT_VALUE_LITERAL_EDEFAULT == null ? defaultValueLiteral != null : !DEFAULT_VALUE_LITERAL_EDEFAULT.equals(defaultValueLiteral);
			case JointPackage_Ecore2MaudePackage.SRC_ESTRUCTURAL_FEATURE__UNSETTABLE:
				return unsettable != UNSETTABLE_EDEFAULT;
			case JointPackage_Ecore2MaudePackage.SRC_ESTRUCTURAL_FEATURE__DERIVED:
				return derived != DERIVED_EDEFAULT;
			case JointPackage_Ecore2MaudePackage.SRC_ESTRUCTURAL_FEATURE__ECONTAINING_CLASS:
				return getEContainingClass() != null;
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
			case JointPackage_Ecore2MaudePackage.SRC_ESTRUCTURAL_FEATURE___GET_FEATURE_ID:
				return getFeatureID();
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
		result.append(" (changeable: ");
		result.append(changeable);
		result.append(", volatile: ");
		result.append(volatile_);
		result.append(", transient: ");
		result.append(transient_);
		result.append(", defaultValueLiteral: ");
		result.append(defaultValueLiteral);
		result.append(", unsettable: ");
		result.append(unsettable);
		result.append(", derived: ");
		result.append(derived);
		result.append(')');
		return result.toString();
	}

} //SrcEStructuralFeatureImpl
