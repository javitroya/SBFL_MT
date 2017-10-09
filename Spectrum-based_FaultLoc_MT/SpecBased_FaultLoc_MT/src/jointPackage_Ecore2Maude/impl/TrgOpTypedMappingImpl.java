/**
 */
package jointPackage_Ecore2Maude.impl;

import java.util.Collection;

import jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage;
import jointPackage_Ecore2Maude.TrgOpTypedMapping;
import jointPackage_Ecore2Maude.TrgOperation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trg Op Typed Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_Ecore2Maude.impl.TrgOpTypedMappingImpl#getFrom <em>From</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.impl.TrgOpTypedMappingImpl#getTo <em>To</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.impl.TrgOpTypedMappingImpl#getAtts <em>Atts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrgOpTypedMappingImpl extends TrgRenMappingImpl implements TrgOpTypedMapping {
	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected TrgOperation from;

	/**
	 * The default value of the '{@link #getTo() <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected static final String TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected String to = TO_EDEFAULT;

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
	protected TrgOpTypedMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JointPackage_Ecore2MaudePackage.Literals.TRG_OP_TYPED_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgOperation getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject)from;
			from = (TrgOperation)eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JointPackage_Ecore2MaudePackage.TRG_OP_TYPED_MAPPING__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgOperation basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(TrgOperation newFrom) {
		TrgOperation oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_Ecore2MaudePackage.TRG_OP_TYPED_MAPPING__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(String newTo) {
		String oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_Ecore2MaudePackage.TRG_OP_TYPED_MAPPING__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAtts() {
		if (atts == null) {
			atts = new EDataTypeEList<String>(String.class, this, JointPackage_Ecore2MaudePackage.TRG_OP_TYPED_MAPPING__ATTS);
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
			case JointPackage_Ecore2MaudePackage.TRG_OP_TYPED_MAPPING__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
			case JointPackage_Ecore2MaudePackage.TRG_OP_TYPED_MAPPING__TO:
				return getTo();
			case JointPackage_Ecore2MaudePackage.TRG_OP_TYPED_MAPPING__ATTS:
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
			case JointPackage_Ecore2MaudePackage.TRG_OP_TYPED_MAPPING__FROM:
				setFrom((TrgOperation)newValue);
				return;
			case JointPackage_Ecore2MaudePackage.TRG_OP_TYPED_MAPPING__TO:
				setTo((String)newValue);
				return;
			case JointPackage_Ecore2MaudePackage.TRG_OP_TYPED_MAPPING__ATTS:
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
			case JointPackage_Ecore2MaudePackage.TRG_OP_TYPED_MAPPING__FROM:
				setFrom((TrgOperation)null);
				return;
			case JointPackage_Ecore2MaudePackage.TRG_OP_TYPED_MAPPING__TO:
				setTo(TO_EDEFAULT);
				return;
			case JointPackage_Ecore2MaudePackage.TRG_OP_TYPED_MAPPING__ATTS:
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
			case JointPackage_Ecore2MaudePackage.TRG_OP_TYPED_MAPPING__FROM:
				return from != null;
			case JointPackage_Ecore2MaudePackage.TRG_OP_TYPED_MAPPING__TO:
				return TO_EDEFAULT == null ? to != null : !TO_EDEFAULT.equals(to);
			case JointPackage_Ecore2MaudePackage.TRG_OP_TYPED_MAPPING__ATTS:
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
		result.append(" (to: ");
		result.append(to);
		result.append(", atts: ");
		result.append(atts);
		result.append(')');
		return result.toString();
	}

} //TrgOpTypedMappingImpl
