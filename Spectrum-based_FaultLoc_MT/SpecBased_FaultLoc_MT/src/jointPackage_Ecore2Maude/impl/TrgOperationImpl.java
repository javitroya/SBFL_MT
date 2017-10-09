/**
 */
package jointPackage_Ecore2Maude.impl;

import java.util.Collection;

import jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage;
import jointPackage_Ecore2Maude.TrgOperation;
import jointPackage_Ecore2Maude.TrgType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trg Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_Ecore2Maude.impl.TrgOperationImpl#getName <em>Name</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.impl.TrgOperationImpl#getCoarity <em>Coarity</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.impl.TrgOperationImpl#getArity <em>Arity</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.impl.TrgOperationImpl#getAtts <em>Atts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrgOperationImpl extends TrgModElementImpl implements TrgOperation {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCoarity() <em>Coarity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoarity()
	 * @generated
	 * @ordered
	 */
	protected TrgType coarity;

	/**
	 * The cached value of the '{@link #getArity() <em>Arity</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArity()
	 * @generated
	 * @ordered
	 */
	protected EList<TrgType> arity;

	/**
	 * The cached value of the '{@link #getAtts() <em>Atts</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtts()
	 * @generated
	 * @ordered
	 */
	protected EList<String> atts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrgOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JointPackage_Ecore2MaudePackage.Literals.TRG_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_Ecore2MaudePackage.TRG_OPERATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgType getCoarity() {
		if (coarity != null && coarity.eIsProxy()) {
			InternalEObject oldCoarity = (InternalEObject)coarity;
			coarity = (TrgType)eResolveProxy(oldCoarity);
			if (coarity != oldCoarity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JointPackage_Ecore2MaudePackage.TRG_OPERATION__COARITY, oldCoarity, coarity));
			}
		}
		return coarity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgType basicGetCoarity() {
		return coarity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoarity(TrgType newCoarity) {
		TrgType oldCoarity = coarity;
		coarity = newCoarity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_Ecore2MaudePackage.TRG_OPERATION__COARITY, oldCoarity, coarity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TrgType> getArity() {
		if (arity == null) {
			arity = new EObjectResolvingEList<TrgType>(TrgType.class, this, JointPackage_Ecore2MaudePackage.TRG_OPERATION__ARITY);
		}
		return arity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAtts() {
		if (atts == null) {
			atts = new EDataTypeEList<String>(String.class, this, JointPackage_Ecore2MaudePackage.TRG_OPERATION__ATTS);
		}
		return atts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JointPackage_Ecore2MaudePackage.TRG_OPERATION__NAME:
				return getName();
			case JointPackage_Ecore2MaudePackage.TRG_OPERATION__COARITY:
				if (resolve) return getCoarity();
				return basicGetCoarity();
			case JointPackage_Ecore2MaudePackage.TRG_OPERATION__ARITY:
				return getArity();
			case JointPackage_Ecore2MaudePackage.TRG_OPERATION__ATTS:
				return getAtts();
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
			case JointPackage_Ecore2MaudePackage.TRG_OPERATION__NAME:
				setName((String)newValue);
				return;
			case JointPackage_Ecore2MaudePackage.TRG_OPERATION__COARITY:
				setCoarity((TrgType)newValue);
				return;
			case JointPackage_Ecore2MaudePackage.TRG_OPERATION__ARITY:
				getArity().clear();
				getArity().addAll((Collection<? extends TrgType>)newValue);
				return;
			case JointPackage_Ecore2MaudePackage.TRG_OPERATION__ATTS:
				getAtts().clear();
				getAtts().addAll((Collection<? extends String>)newValue);
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
			case JointPackage_Ecore2MaudePackage.TRG_OPERATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case JointPackage_Ecore2MaudePackage.TRG_OPERATION__COARITY:
				setCoarity((TrgType)null);
				return;
			case JointPackage_Ecore2MaudePackage.TRG_OPERATION__ARITY:
				getArity().clear();
				return;
			case JointPackage_Ecore2MaudePackage.TRG_OPERATION__ATTS:
				getAtts().clear();
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
			case JointPackage_Ecore2MaudePackage.TRG_OPERATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case JointPackage_Ecore2MaudePackage.TRG_OPERATION__COARITY:
				return coarity != null;
			case JointPackage_Ecore2MaudePackage.TRG_OPERATION__ARITY:
				return arity != null && !arity.isEmpty();
			case JointPackage_Ecore2MaudePackage.TRG_OPERATION__ATTS:
				return atts != null && !atts.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", atts: ");
		result.append(atts);
		result.append(')');
		return result.toString();
	}

} //TrgOperationImpl
