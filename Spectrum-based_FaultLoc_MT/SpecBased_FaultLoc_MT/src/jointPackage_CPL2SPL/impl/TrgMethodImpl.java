/**
 */
package jointPackage_CPL2SPL.impl;

import java.util.Collection;

import jointPackage_CPL2SPL.Direction;
import jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage;
import jointPackage_CPL2SPL.TrgArgument;
import jointPackage_CPL2SPL.TrgBranch;
import jointPackage_CPL2SPL.TrgMethod;
import jointPackage_CPL2SPL.TrgMethodName;
import jointPackage_CPL2SPL.TrgStatement;
import jointPackage_CPL2SPL.TrgTypeExpression;

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
 * An implementation of the model object '<em><b>Trg Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_CPL2SPL.impl.TrgMethodImpl#getType <em>Type</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.impl.TrgMethodImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.impl.TrgMethodImpl#getMethodName <em>Method Name</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.impl.TrgMethodImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.impl.TrgMethodImpl#getStatements <em>Statements</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.impl.TrgMethodImpl#getBranches <em>Branches</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrgMethodImpl extends TrgSessionImpl implements TrgMethod {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TrgTypeExpression type;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final Direction DIRECTION_EDEFAULT = Direction.INOUT;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected Direction direction = DIRECTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMethodName() <em>Method Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodName()
	 * @generated
	 * @ordered
	 */
	protected TrgMethodName methodName;

	/**
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<TrgArgument> arguments;

	/**
	 * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatements()
	 * @generated
	 * @ordered
	 */
	protected EList<TrgStatement> statements;

	/**
	 * The cached value of the '{@link #getBranches() <em>Branches</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranches()
	 * @generated
	 * @ordered
	 */
	protected EList<TrgBranch> branches;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrgMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JointPackage_CPL2SPLPackage.Literals.TRG_METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgTypeExpression getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(TrgTypeExpression newType, NotificationChain msgs) {
		TrgTypeExpression oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.TRG_METHOD__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TrgTypeExpression newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JointPackage_CPL2SPLPackage.TRG_METHOD__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JointPackage_CPL2SPLPackage.TRG_METHOD__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.TRG_METHOD__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Direction getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(Direction newDirection) {
		Direction oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.TRG_METHOD__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgMethodName getMethodName() {
		return methodName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethodName(TrgMethodName newMethodName, NotificationChain msgs) {
		TrgMethodName oldMethodName = methodName;
		methodName = newMethodName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.TRG_METHOD__METHOD_NAME, oldMethodName, newMethodName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodName(TrgMethodName newMethodName) {
		if (newMethodName != methodName) {
			NotificationChain msgs = null;
			if (methodName != null)
				msgs = ((InternalEObject)methodName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JointPackage_CPL2SPLPackage.TRG_METHOD__METHOD_NAME, null, msgs);
			if (newMethodName != null)
				msgs = ((InternalEObject)newMethodName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JointPackage_CPL2SPLPackage.TRG_METHOD__METHOD_NAME, null, msgs);
			msgs = basicSetMethodName(newMethodName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.TRG_METHOD__METHOD_NAME, newMethodName, newMethodName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TrgArgument> getArguments() {
		if (arguments == null) {
			arguments = new EObjectContainmentEList<TrgArgument>(TrgArgument.class, this, JointPackage_CPL2SPLPackage.TRG_METHOD__ARGUMENTS);
		}
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TrgStatement> getStatements() {
		if (statements == null) {
			statements = new EObjectContainmentEList<TrgStatement>(TrgStatement.class, this, JointPackage_CPL2SPLPackage.TRG_METHOD__STATEMENTS);
		}
		return statements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TrgBranch> getBranches() {
		if (branches == null) {
			branches = new EObjectContainmentEList<TrgBranch>(TrgBranch.class, this, JointPackage_CPL2SPLPackage.TRG_METHOD__BRANCHES);
		}
		return branches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JointPackage_CPL2SPLPackage.TRG_METHOD__TYPE:
				return basicSetType(null, msgs);
			case JointPackage_CPL2SPLPackage.TRG_METHOD__METHOD_NAME:
				return basicSetMethodName(null, msgs);
			case JointPackage_CPL2SPLPackage.TRG_METHOD__ARGUMENTS:
				return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
			case JointPackage_CPL2SPLPackage.TRG_METHOD__STATEMENTS:
				return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
			case JointPackage_CPL2SPLPackage.TRG_METHOD__BRANCHES:
				return ((InternalEList<?>)getBranches()).basicRemove(otherEnd, msgs);
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
			case JointPackage_CPL2SPLPackage.TRG_METHOD__TYPE:
				return getType();
			case JointPackage_CPL2SPLPackage.TRG_METHOD__DIRECTION:
				return getDirection();
			case JointPackage_CPL2SPLPackage.TRG_METHOD__METHOD_NAME:
				return getMethodName();
			case JointPackage_CPL2SPLPackage.TRG_METHOD__ARGUMENTS:
				return getArguments();
			case JointPackage_CPL2SPLPackage.TRG_METHOD__STATEMENTS:
				return getStatements();
			case JointPackage_CPL2SPLPackage.TRG_METHOD__BRANCHES:
				return getBranches();
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
			case JointPackage_CPL2SPLPackage.TRG_METHOD__TYPE:
				setType((TrgTypeExpression)newValue);
				return;
			case JointPackage_CPL2SPLPackage.TRG_METHOD__DIRECTION:
				setDirection((Direction)newValue);
				return;
			case JointPackage_CPL2SPLPackage.TRG_METHOD__METHOD_NAME:
				setMethodName((TrgMethodName)newValue);
				return;
			case JointPackage_CPL2SPLPackage.TRG_METHOD__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends TrgArgument>)newValue);
				return;
			case JointPackage_CPL2SPLPackage.TRG_METHOD__STATEMENTS:
				getStatements().clear();
				getStatements().addAll((Collection<? extends TrgStatement>)newValue);
				return;
			case JointPackage_CPL2SPLPackage.TRG_METHOD__BRANCHES:
				getBranches().clear();
				getBranches().addAll((Collection<? extends TrgBranch>)newValue);
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
			case JointPackage_CPL2SPLPackage.TRG_METHOD__TYPE:
				setType((TrgTypeExpression)null);
				return;
			case JointPackage_CPL2SPLPackage.TRG_METHOD__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case JointPackage_CPL2SPLPackage.TRG_METHOD__METHOD_NAME:
				setMethodName((TrgMethodName)null);
				return;
			case JointPackage_CPL2SPLPackage.TRG_METHOD__ARGUMENTS:
				getArguments().clear();
				return;
			case JointPackage_CPL2SPLPackage.TRG_METHOD__STATEMENTS:
				getStatements().clear();
				return;
			case JointPackage_CPL2SPLPackage.TRG_METHOD__BRANCHES:
				getBranches().clear();
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
			case JointPackage_CPL2SPLPackage.TRG_METHOD__TYPE:
				return type != null;
			case JointPackage_CPL2SPLPackage.TRG_METHOD__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
			case JointPackage_CPL2SPLPackage.TRG_METHOD__METHOD_NAME:
				return methodName != null;
			case JointPackage_CPL2SPLPackage.TRG_METHOD__ARGUMENTS:
				return arguments != null && !arguments.isEmpty();
			case JointPackage_CPL2SPLPackage.TRG_METHOD__STATEMENTS:
				return statements != null && !statements.isEmpty();
			case JointPackage_CPL2SPLPackage.TRG_METHOD__BRANCHES:
				return branches != null && !branches.isEmpty();
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
		result.append(" (direction: ");
		result.append(direction);
		result.append(')');
		return result.toString();
	}

} //TrgMethodImpl
