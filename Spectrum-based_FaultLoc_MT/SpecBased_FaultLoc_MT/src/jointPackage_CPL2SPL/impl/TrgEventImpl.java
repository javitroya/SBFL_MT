/**
 */
package jointPackage_CPL2SPL.impl;

import java.util.Collection;

import jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage;
import jointPackage_CPL2SPL.TrgDeclaration;
import jointPackage_CPL2SPL.TrgEvent;
import jointPackage_CPL2SPL.TrgMethod;

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
 * An implementation of the model object '<em><b>Trg Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_CPL2SPL.impl.TrgEventImpl#getEventId <em>Event Id</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.impl.TrgEventImpl#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.impl.TrgEventImpl#getMethods <em>Methods</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrgEventImpl extends TrgSessionImpl implements TrgEvent {
	/**
	 * The default value of the '{@link #getEventId() <em>Event Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventId()
	 * @generated
	 * @ordered
	 */
	protected static final String EVENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEventId() <em>Event Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventId()
	 * @generated
	 * @ordered
	 */
	protected String eventId = EVENT_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDeclarations() <em>Declarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<TrgDeclaration> declarations;

	/**
	 * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<TrgMethod> methods;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrgEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JointPackage_CPL2SPLPackage.Literals.TRG_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEventId() {
		return eventId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventId(String newEventId) {
		String oldEventId = eventId;
		eventId = newEventId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.TRG_EVENT__EVENT_ID, oldEventId, eventId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TrgDeclaration> getDeclarations() {
		if (declarations == null) {
			declarations = new EObjectContainmentEList<TrgDeclaration>(TrgDeclaration.class, this, JointPackage_CPL2SPLPackage.TRG_EVENT__DECLARATIONS);
		}
		return declarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TrgMethod> getMethods() {
		if (methods == null) {
			methods = new EObjectContainmentEList<TrgMethod>(TrgMethod.class, this, JointPackage_CPL2SPLPackage.TRG_EVENT__METHODS);
		}
		return methods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JointPackage_CPL2SPLPackage.TRG_EVENT__DECLARATIONS:
				return ((InternalEList<?>)getDeclarations()).basicRemove(otherEnd, msgs);
			case JointPackage_CPL2SPLPackage.TRG_EVENT__METHODS:
				return ((InternalEList<?>)getMethods()).basicRemove(otherEnd, msgs);
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
			case JointPackage_CPL2SPLPackage.TRG_EVENT__EVENT_ID:
				return getEventId();
			case JointPackage_CPL2SPLPackage.TRG_EVENT__DECLARATIONS:
				return getDeclarations();
			case JointPackage_CPL2SPLPackage.TRG_EVENT__METHODS:
				return getMethods();
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
			case JointPackage_CPL2SPLPackage.TRG_EVENT__EVENT_ID:
				setEventId((String)newValue);
				return;
			case JointPackage_CPL2SPLPackage.TRG_EVENT__DECLARATIONS:
				getDeclarations().clear();
				getDeclarations().addAll((Collection<? extends TrgDeclaration>)newValue);
				return;
			case JointPackage_CPL2SPLPackage.TRG_EVENT__METHODS:
				getMethods().clear();
				getMethods().addAll((Collection<? extends TrgMethod>)newValue);
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
			case JointPackage_CPL2SPLPackage.TRG_EVENT__EVENT_ID:
				setEventId(EVENT_ID_EDEFAULT);
				return;
			case JointPackage_CPL2SPLPackage.TRG_EVENT__DECLARATIONS:
				getDeclarations().clear();
				return;
			case JointPackage_CPL2SPLPackage.TRG_EVENT__METHODS:
				getMethods().clear();
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
			case JointPackage_CPL2SPLPackage.TRG_EVENT__EVENT_ID:
				return EVENT_ID_EDEFAULT == null ? eventId != null : !EVENT_ID_EDEFAULT.equals(eventId);
			case JointPackage_CPL2SPLPackage.TRG_EVENT__DECLARATIONS:
				return declarations != null && !declarations.isEmpty();
			case JointPackage_CPL2SPLPackage.TRG_EVENT__METHODS:
				return methods != null && !methods.isEmpty();
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
		result.append(" (eventId: ");
		result.append(eventId);
		result.append(')');
		return result.toString();
	}

} //TrgEventImpl
