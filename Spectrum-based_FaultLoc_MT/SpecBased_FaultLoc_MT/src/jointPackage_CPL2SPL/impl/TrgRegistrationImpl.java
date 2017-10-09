/**
 */
package jointPackage_CPL2SPL.impl;

import java.util.Collection;

import jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage;
import jointPackage_CPL2SPL.TrgDeclaration;
import jointPackage_CPL2SPL.TrgRegistration;
import jointPackage_CPL2SPL.TrgSession;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trg Registration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_CPL2SPL.impl.TrgRegistrationImpl#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.impl.TrgRegistrationImpl#getSessions <em>Sessions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrgRegistrationImpl extends TrgSessionImpl implements TrgRegistration {
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
	 * The cached value of the '{@link #getSessions() <em>Sessions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessions()
	 * @generated
	 * @ordered
	 */
	protected EList<TrgSession> sessions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrgRegistrationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JointPackage_CPL2SPLPackage.Literals.TRG_REGISTRATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TrgDeclaration> getDeclarations() {
		if (declarations == null) {
			declarations = new EObjectContainmentEList<TrgDeclaration>(TrgDeclaration.class, this, JointPackage_CPL2SPLPackage.TRG_REGISTRATION__DECLARATIONS);
		}
		return declarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TrgSession> getSessions() {
		if (sessions == null) {
			sessions = new EObjectContainmentEList<TrgSession>(TrgSession.class, this, JointPackage_CPL2SPLPackage.TRG_REGISTRATION__SESSIONS);
		}
		return sessions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JointPackage_CPL2SPLPackage.TRG_REGISTRATION__DECLARATIONS:
				return ((InternalEList<?>)getDeclarations()).basicRemove(otherEnd, msgs);
			case JointPackage_CPL2SPLPackage.TRG_REGISTRATION__SESSIONS:
				return ((InternalEList<?>)getSessions()).basicRemove(otherEnd, msgs);
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
			case JointPackage_CPL2SPLPackage.TRG_REGISTRATION__DECLARATIONS:
				return getDeclarations();
			case JointPackage_CPL2SPLPackage.TRG_REGISTRATION__SESSIONS:
				return getSessions();
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
			case JointPackage_CPL2SPLPackage.TRG_REGISTRATION__DECLARATIONS:
				getDeclarations().clear();
				getDeclarations().addAll((Collection<? extends TrgDeclaration>)newValue);
				return;
			case JointPackage_CPL2SPLPackage.TRG_REGISTRATION__SESSIONS:
				getSessions().clear();
				getSessions().addAll((Collection<? extends TrgSession>)newValue);
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
			case JointPackage_CPL2SPLPackage.TRG_REGISTRATION__DECLARATIONS:
				getDeclarations().clear();
				return;
			case JointPackage_CPL2SPLPackage.TRG_REGISTRATION__SESSIONS:
				getSessions().clear();
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
			case JointPackage_CPL2SPLPackage.TRG_REGISTRATION__DECLARATIONS:
				return declarations != null && !declarations.isEmpty();
			case JointPackage_CPL2SPLPackage.TRG_REGISTRATION__SESSIONS:
				return sessions != null && !sessions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TrgRegistrationImpl
