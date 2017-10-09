/**
 */
package jointPackage_CPL2SPL.impl;

import jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage;
import jointPackage_CPL2SPL.SrcBusy;
import jointPackage_CPL2SPL.SrcDefault;
import jointPackage_CPL2SPL.SrcFailure;
import jointPackage_CPL2SPL.SrcNoAnswer;
import jointPackage_CPL2SPL.SrcProxy;
import jointPackage_CPL2SPL.SrcRedirection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Src Proxy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_CPL2SPL.impl.SrcProxyImpl#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.impl.SrcProxyImpl#getRecurse <em>Recurse</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.impl.SrcProxyImpl#getOrdering <em>Ordering</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.impl.SrcProxyImpl#getBusy <em>Busy</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.impl.SrcProxyImpl#getNoAnswer <em>No Answer</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.impl.SrcProxyImpl#getRedirection <em>Redirection</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.impl.SrcProxyImpl#getFailure <em>Failure</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.impl.SrcProxyImpl#getDefault <em>Default</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SrcProxyImpl extends SrcSignallingActionImpl implements SrcProxy {
	/**
	 * The default value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final String TIMEOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeout()
	 * @generated
	 * @ordered
	 */
	protected String timeout = TIMEOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecurse() <em>Recurse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurse()
	 * @generated
	 * @ordered
	 */
	protected static final String RECURSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecurse() <em>Recurse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurse()
	 * @generated
	 * @ordered
	 */
	protected String recurse = RECURSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrdering() <em>Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrdering()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDERING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrdering() <em>Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrdering()
	 * @generated
	 * @ordered
	 */
	protected String ordering = ORDERING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBusy() <em>Busy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusy()
	 * @generated
	 * @ordered
	 */
	protected SrcBusy busy;

	/**
	 * The cached value of the '{@link #getNoAnswer() <em>No Answer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoAnswer()
	 * @generated
	 * @ordered
	 */
	protected SrcNoAnswer noAnswer;

	/**
	 * The cached value of the '{@link #getRedirection() <em>Redirection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedirection()
	 * @generated
	 * @ordered
	 */
	protected SrcRedirection redirection;

	/**
	 * The cached value of the '{@link #getFailure() <em>Failure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailure()
	 * @generated
	 * @ordered
	 */
	protected SrcFailure failure;

	/**
	 * The cached value of the '{@link #getDefault() <em>Default</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected SrcDefault default_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SrcProxyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JointPackage_CPL2SPLPackage.Literals.SRC_PROXY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTimeout() {
		return timeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeout(String newTimeout) {
		String oldTimeout = timeout;
		timeout = newTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.SRC_PROXY__TIMEOUT, oldTimeout, timeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRecurse() {
		return recurse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecurse(String newRecurse) {
		String oldRecurse = recurse;
		recurse = newRecurse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.SRC_PROXY__RECURSE, oldRecurse, recurse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrdering() {
		return ordering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrdering(String newOrdering) {
		String oldOrdering = ordering;
		ordering = newOrdering;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.SRC_PROXY__ORDERING, oldOrdering, ordering));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcBusy getBusy() {
		return busy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBusy(SrcBusy newBusy, NotificationChain msgs) {
		SrcBusy oldBusy = busy;
		busy = newBusy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.SRC_PROXY__BUSY, oldBusy, newBusy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusy(SrcBusy newBusy) {
		if (newBusy != busy) {
			NotificationChain msgs = null;
			if (busy != null)
				msgs = ((InternalEObject)busy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JointPackage_CPL2SPLPackage.SRC_PROXY__BUSY, null, msgs);
			if (newBusy != null)
				msgs = ((InternalEObject)newBusy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JointPackage_CPL2SPLPackage.SRC_PROXY__BUSY, null, msgs);
			msgs = basicSetBusy(newBusy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.SRC_PROXY__BUSY, newBusy, newBusy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcNoAnswer getNoAnswer() {
		return noAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNoAnswer(SrcNoAnswer newNoAnswer, NotificationChain msgs) {
		SrcNoAnswer oldNoAnswer = noAnswer;
		noAnswer = newNoAnswer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.SRC_PROXY__NO_ANSWER, oldNoAnswer, newNoAnswer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoAnswer(SrcNoAnswer newNoAnswer) {
		if (newNoAnswer != noAnswer) {
			NotificationChain msgs = null;
			if (noAnswer != null)
				msgs = ((InternalEObject)noAnswer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JointPackage_CPL2SPLPackage.SRC_PROXY__NO_ANSWER, null, msgs);
			if (newNoAnswer != null)
				msgs = ((InternalEObject)newNoAnswer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JointPackage_CPL2SPLPackage.SRC_PROXY__NO_ANSWER, null, msgs);
			msgs = basicSetNoAnswer(newNoAnswer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.SRC_PROXY__NO_ANSWER, newNoAnswer, newNoAnswer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcRedirection getRedirection() {
		return redirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRedirection(SrcRedirection newRedirection, NotificationChain msgs) {
		SrcRedirection oldRedirection = redirection;
		redirection = newRedirection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.SRC_PROXY__REDIRECTION, oldRedirection, newRedirection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRedirection(SrcRedirection newRedirection) {
		if (newRedirection != redirection) {
			NotificationChain msgs = null;
			if (redirection != null)
				msgs = ((InternalEObject)redirection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JointPackage_CPL2SPLPackage.SRC_PROXY__REDIRECTION, null, msgs);
			if (newRedirection != null)
				msgs = ((InternalEObject)newRedirection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JointPackage_CPL2SPLPackage.SRC_PROXY__REDIRECTION, null, msgs);
			msgs = basicSetRedirection(newRedirection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.SRC_PROXY__REDIRECTION, newRedirection, newRedirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcFailure getFailure() {
		return failure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFailure(SrcFailure newFailure, NotificationChain msgs) {
		SrcFailure oldFailure = failure;
		failure = newFailure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.SRC_PROXY__FAILURE, oldFailure, newFailure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailure(SrcFailure newFailure) {
		if (newFailure != failure) {
			NotificationChain msgs = null;
			if (failure != null)
				msgs = ((InternalEObject)failure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JointPackage_CPL2SPLPackage.SRC_PROXY__FAILURE, null, msgs);
			if (newFailure != null)
				msgs = ((InternalEObject)newFailure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JointPackage_CPL2SPLPackage.SRC_PROXY__FAILURE, null, msgs);
			msgs = basicSetFailure(newFailure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.SRC_PROXY__FAILURE, newFailure, newFailure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcDefault getDefault() {
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefault(SrcDefault newDefault, NotificationChain msgs) {
		SrcDefault oldDefault = default_;
		default_ = newDefault;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.SRC_PROXY__DEFAULT, oldDefault, newDefault);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(SrcDefault newDefault) {
		if (newDefault != default_) {
			NotificationChain msgs = null;
			if (default_ != null)
				msgs = ((InternalEObject)default_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JointPackage_CPL2SPLPackage.SRC_PROXY__DEFAULT, null, msgs);
			if (newDefault != null)
				msgs = ((InternalEObject)newDefault).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JointPackage_CPL2SPLPackage.SRC_PROXY__DEFAULT, null, msgs);
			msgs = basicSetDefault(newDefault, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.SRC_PROXY__DEFAULT, newDefault, newDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JointPackage_CPL2SPLPackage.SRC_PROXY__BUSY:
				return basicSetBusy(null, msgs);
			case JointPackage_CPL2SPLPackage.SRC_PROXY__NO_ANSWER:
				return basicSetNoAnswer(null, msgs);
			case JointPackage_CPL2SPLPackage.SRC_PROXY__REDIRECTION:
				return basicSetRedirection(null, msgs);
			case JointPackage_CPL2SPLPackage.SRC_PROXY__FAILURE:
				return basicSetFailure(null, msgs);
			case JointPackage_CPL2SPLPackage.SRC_PROXY__DEFAULT:
				return basicSetDefault(null, msgs);
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
			case JointPackage_CPL2SPLPackage.SRC_PROXY__TIMEOUT:
				return getTimeout();
			case JointPackage_CPL2SPLPackage.SRC_PROXY__RECURSE:
				return getRecurse();
			case JointPackage_CPL2SPLPackage.SRC_PROXY__ORDERING:
				return getOrdering();
			case JointPackage_CPL2SPLPackage.SRC_PROXY__BUSY:
				return getBusy();
			case JointPackage_CPL2SPLPackage.SRC_PROXY__NO_ANSWER:
				return getNoAnswer();
			case JointPackage_CPL2SPLPackage.SRC_PROXY__REDIRECTION:
				return getRedirection();
			case JointPackage_CPL2SPLPackage.SRC_PROXY__FAILURE:
				return getFailure();
			case JointPackage_CPL2SPLPackage.SRC_PROXY__DEFAULT:
				return getDefault();
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
			case JointPackage_CPL2SPLPackage.SRC_PROXY__TIMEOUT:
				setTimeout((String)newValue);
				return;
			case JointPackage_CPL2SPLPackage.SRC_PROXY__RECURSE:
				setRecurse((String)newValue);
				return;
			case JointPackage_CPL2SPLPackage.SRC_PROXY__ORDERING:
				setOrdering((String)newValue);
				return;
			case JointPackage_CPL2SPLPackage.SRC_PROXY__BUSY:
				setBusy((SrcBusy)newValue);
				return;
			case JointPackage_CPL2SPLPackage.SRC_PROXY__NO_ANSWER:
				setNoAnswer((SrcNoAnswer)newValue);
				return;
			case JointPackage_CPL2SPLPackage.SRC_PROXY__REDIRECTION:
				setRedirection((SrcRedirection)newValue);
				return;
			case JointPackage_CPL2SPLPackage.SRC_PROXY__FAILURE:
				setFailure((SrcFailure)newValue);
				return;
			case JointPackage_CPL2SPLPackage.SRC_PROXY__DEFAULT:
				setDefault((SrcDefault)newValue);
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
			case JointPackage_CPL2SPLPackage.SRC_PROXY__TIMEOUT:
				setTimeout(TIMEOUT_EDEFAULT);
				return;
			case JointPackage_CPL2SPLPackage.SRC_PROXY__RECURSE:
				setRecurse(RECURSE_EDEFAULT);
				return;
			case JointPackage_CPL2SPLPackage.SRC_PROXY__ORDERING:
				setOrdering(ORDERING_EDEFAULT);
				return;
			case JointPackage_CPL2SPLPackage.SRC_PROXY__BUSY:
				setBusy((SrcBusy)null);
				return;
			case JointPackage_CPL2SPLPackage.SRC_PROXY__NO_ANSWER:
				setNoAnswer((SrcNoAnswer)null);
				return;
			case JointPackage_CPL2SPLPackage.SRC_PROXY__REDIRECTION:
				setRedirection((SrcRedirection)null);
				return;
			case JointPackage_CPL2SPLPackage.SRC_PROXY__FAILURE:
				setFailure((SrcFailure)null);
				return;
			case JointPackage_CPL2SPLPackage.SRC_PROXY__DEFAULT:
				setDefault((SrcDefault)null);
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
			case JointPackage_CPL2SPLPackage.SRC_PROXY__TIMEOUT:
				return TIMEOUT_EDEFAULT == null ? timeout != null : !TIMEOUT_EDEFAULT.equals(timeout);
			case JointPackage_CPL2SPLPackage.SRC_PROXY__RECURSE:
				return RECURSE_EDEFAULT == null ? recurse != null : !RECURSE_EDEFAULT.equals(recurse);
			case JointPackage_CPL2SPLPackage.SRC_PROXY__ORDERING:
				return ORDERING_EDEFAULT == null ? ordering != null : !ORDERING_EDEFAULT.equals(ordering);
			case JointPackage_CPL2SPLPackage.SRC_PROXY__BUSY:
				return busy != null;
			case JointPackage_CPL2SPLPackage.SRC_PROXY__NO_ANSWER:
				return noAnswer != null;
			case JointPackage_CPL2SPLPackage.SRC_PROXY__REDIRECTION:
				return redirection != null;
			case JointPackage_CPL2SPLPackage.SRC_PROXY__FAILURE:
				return failure != null;
			case JointPackage_CPL2SPLPackage.SRC_PROXY__DEFAULT:
				return default_ != null;
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
		result.append(" (timeout: ");
		result.append(timeout);
		result.append(", recurse: ");
		result.append(recurse);
		result.append(", ordering: ");
		result.append(ordering);
		result.append(')');
		return result.toString();
	}

} //SrcProxyImpl
