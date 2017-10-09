/**
 */
package jointPackage_CPL2SPL.impl;

import java.util.Collection;

import jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage;
import jointPackage_CPL2SPL.SrcCPL;
import jointPackage_CPL2SPL.SrcIncoming;
import jointPackage_CPL2SPL.SrcOutgoing;
import jointPackage_CPL2SPL.SrcSubAction;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Src CPL</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_CPL2SPL.impl.SrcCPLImpl#getSubActions <em>Sub Actions</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.impl.SrcCPLImpl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.impl.SrcCPLImpl#getIncoming <em>Incoming</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SrcCPLImpl extends SrcElementImpl implements SrcCPL {
	/**
	 * The cached value of the '{@link #getSubActions() <em>Sub Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubActions()
	 * @generated
	 * @ordered
	 */
	protected EList<SrcSubAction> subActions;

	/**
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
	protected SrcOutgoing outgoing;

	/**
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected SrcIncoming incoming;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SrcCPLImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JointPackage_CPL2SPLPackage.Literals.SRC_CPL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SrcSubAction> getSubActions() {
		if (subActions == null) {
			subActions = new EObjectContainmentEList<SrcSubAction>(SrcSubAction.class, this, JointPackage_CPL2SPLPackage.SRC_CPL__SUB_ACTIONS);
		}
		return subActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcOutgoing getOutgoing() {
		return outgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutgoing(SrcOutgoing newOutgoing, NotificationChain msgs) {
		SrcOutgoing oldOutgoing = outgoing;
		outgoing = newOutgoing;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.SRC_CPL__OUTGOING, oldOutgoing, newOutgoing);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutgoing(SrcOutgoing newOutgoing) {
		if (newOutgoing != outgoing) {
			NotificationChain msgs = null;
			if (outgoing != null)
				msgs = ((InternalEObject)outgoing).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JointPackage_CPL2SPLPackage.SRC_CPL__OUTGOING, null, msgs);
			if (newOutgoing != null)
				msgs = ((InternalEObject)newOutgoing).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JointPackage_CPL2SPLPackage.SRC_CPL__OUTGOING, null, msgs);
			msgs = basicSetOutgoing(newOutgoing, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.SRC_CPL__OUTGOING, newOutgoing, newOutgoing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcIncoming getIncoming() {
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncoming(SrcIncoming newIncoming, NotificationChain msgs) {
		SrcIncoming oldIncoming = incoming;
		incoming = newIncoming;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.SRC_CPL__INCOMING, oldIncoming, newIncoming);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncoming(SrcIncoming newIncoming) {
		if (newIncoming != incoming) {
			NotificationChain msgs = null;
			if (incoming != null)
				msgs = ((InternalEObject)incoming).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JointPackage_CPL2SPLPackage.SRC_CPL__INCOMING, null, msgs);
			if (newIncoming != null)
				msgs = ((InternalEObject)newIncoming).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JointPackage_CPL2SPLPackage.SRC_CPL__INCOMING, null, msgs);
			msgs = basicSetIncoming(newIncoming, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.SRC_CPL__INCOMING, newIncoming, newIncoming));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JointPackage_CPL2SPLPackage.SRC_CPL__SUB_ACTIONS:
				return ((InternalEList<?>)getSubActions()).basicRemove(otherEnd, msgs);
			case JointPackage_CPL2SPLPackage.SRC_CPL__OUTGOING:
				return basicSetOutgoing(null, msgs);
			case JointPackage_CPL2SPLPackage.SRC_CPL__INCOMING:
				return basicSetIncoming(null, msgs);
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
			case JointPackage_CPL2SPLPackage.SRC_CPL__SUB_ACTIONS:
				return getSubActions();
			case JointPackage_CPL2SPLPackage.SRC_CPL__OUTGOING:
				return getOutgoing();
			case JointPackage_CPL2SPLPackage.SRC_CPL__INCOMING:
				return getIncoming();
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
			case JointPackage_CPL2SPLPackage.SRC_CPL__SUB_ACTIONS:
				getSubActions().clear();
				getSubActions().addAll((Collection<? extends SrcSubAction>)newValue);
				return;
			case JointPackage_CPL2SPLPackage.SRC_CPL__OUTGOING:
				setOutgoing((SrcOutgoing)newValue);
				return;
			case JointPackage_CPL2SPLPackage.SRC_CPL__INCOMING:
				setIncoming((SrcIncoming)newValue);
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
			case JointPackage_CPL2SPLPackage.SRC_CPL__SUB_ACTIONS:
				getSubActions().clear();
				return;
			case JointPackage_CPL2SPLPackage.SRC_CPL__OUTGOING:
				setOutgoing((SrcOutgoing)null);
				return;
			case JointPackage_CPL2SPLPackage.SRC_CPL__INCOMING:
				setIncoming((SrcIncoming)null);
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
			case JointPackage_CPL2SPLPackage.SRC_CPL__SUB_ACTIONS:
				return subActions != null && !subActions.isEmpty();
			case JointPackage_CPL2SPLPackage.SRC_CPL__OUTGOING:
				return outgoing != null;
			case JointPackage_CPL2SPLPackage.SRC_CPL__INCOMING:
				return incoming != null;
		}
		return super.eIsSet(featureID);
	}

} //SrcCPLImpl
