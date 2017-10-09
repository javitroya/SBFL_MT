/**
 */
package jointPackage_Ecore2Maude.impl;

import java.util.Collection;

import jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage;
import jointPackage_Ecore2Maude.TrgCondition;
import jointPackage_Ecore2Maude.TrgStatement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trg Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_Ecore2Maude.impl.TrgStatementImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.impl.TrgStatementImpl#getAtts <em>Atts</em>}</li>
 *   <li>{@link jointPackage_Ecore2Maude.impl.TrgStatementImpl#getConds <em>Conds</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TrgStatementImpl extends TrgModElementImpl implements TrgStatement {
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

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
	 * The cached value of the '{@link #getConds() <em>Conds</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConds()
	 * @generated
	 * @ordered
	 */
	protected EList<TrgCondition> conds;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrgStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JointPackage_Ecore2MaudePackage.Literals.TRG_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_Ecore2MaudePackage.TRG_STATEMENT__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAtts() {
		if (atts == null) {
			atts = new EDataTypeEList<String>(String.class, this, JointPackage_Ecore2MaudePackage.TRG_STATEMENT__ATTS);
		}
		return atts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TrgCondition> getConds() {
		if (conds == null) {
			conds = new EObjectContainmentEList<TrgCondition>(TrgCondition.class, this, JointPackage_Ecore2MaudePackage.TRG_STATEMENT__CONDS);
		}
		return conds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JointPackage_Ecore2MaudePackage.TRG_STATEMENT__CONDS:
				return ((InternalEList<?>)getConds()).basicRemove(otherEnd, msgs);
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
			case JointPackage_Ecore2MaudePackage.TRG_STATEMENT__LABEL:
				return getLabel();
			case JointPackage_Ecore2MaudePackage.TRG_STATEMENT__ATTS:
				return getAtts();
			case JointPackage_Ecore2MaudePackage.TRG_STATEMENT__CONDS:
				return getConds();
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
			case JointPackage_Ecore2MaudePackage.TRG_STATEMENT__LABEL:
				setLabel((String)newValue);
				return;
			case JointPackage_Ecore2MaudePackage.TRG_STATEMENT__ATTS:
				getAtts().clear();
				getAtts().addAll((Collection<? extends String>)newValue);
				return;
			case JointPackage_Ecore2MaudePackage.TRG_STATEMENT__CONDS:
				getConds().clear();
				getConds().addAll((Collection<? extends TrgCondition>)newValue);
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
			case JointPackage_Ecore2MaudePackage.TRG_STATEMENT__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case JointPackage_Ecore2MaudePackage.TRG_STATEMENT__ATTS:
				getAtts().clear();
				return;
			case JointPackage_Ecore2MaudePackage.TRG_STATEMENT__CONDS:
				getConds().clear();
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
			case JointPackage_Ecore2MaudePackage.TRG_STATEMENT__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case JointPackage_Ecore2MaudePackage.TRG_STATEMENT__ATTS:
				return atts != null && !atts.isEmpty();
			case JointPackage_Ecore2MaudePackage.TRG_STATEMENT__CONDS:
				return conds != null && !conds.isEmpty();
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
		result.append(" (label: ");
		result.append(label);
		result.append(", atts: ");
		result.append(atts);
		result.append(')');
		return result.toString();
	}

} //TrgStatementImpl
