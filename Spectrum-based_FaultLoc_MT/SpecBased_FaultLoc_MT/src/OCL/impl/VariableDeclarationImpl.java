/**
 */
package OCL.impl;

import ATL.impl.LocatedElementImpl;

import OCL.IterateExp;
import OCL.LetExp;
import OCL.OCLPackage;
import OCL.OclExpression;
import OCL.OclType;
import OCL.VariableDeclaration;
import OCL.VariableExp;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link OCL.impl.VariableDeclarationImpl#getId <em>Id</em>}</li>
 *   <li>{@link OCL.impl.VariableDeclarationImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link OCL.impl.VariableDeclarationImpl#getType <em>Type</em>}</li>
 *   <li>{@link OCL.impl.VariableDeclarationImpl#getInitExpression <em>Init Expression</em>}</li>
 *   <li>{@link OCL.impl.VariableDeclarationImpl#getLetExp <em>Let Exp</em>}</li>
 *   <li>{@link OCL.impl.VariableDeclarationImpl#getBaseExp <em>Base Exp</em>}</li>
 *   <li>{@link OCL.impl.VariableDeclarationImpl#getVariableExp <em>Variable Exp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableDeclarationImpl extends LocatedElementImpl implements VariableDeclaration {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getVarName() <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarName()
	 * @generated
	 * @ordered
	 */
	protected static final String VAR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVarName() <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarName()
	 * @generated
	 * @ordered
	 */
	protected String varName = VAR_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected OclType type;

	/**
	 * The cached value of the '{@link #getInitExpression() <em>Init Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitExpression()
	 * @generated
	 * @ordered
	 */
	protected OclExpression initExpression;

	/**
	 * The cached value of the '{@link #getVariableExp() <em>Variable Exp</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableExp()
	 * @generated
	 * @ordered
	 */
	protected EList variableExp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return OCLPackage.Literals.VARIABLE_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCLPackage.VARIABLE_DECLARATION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVarName() {
		return varName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVarName(String newVarName) {
		String oldVarName = varName;
		varName = newVarName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCLPackage.VARIABLE_DECLARATION__VAR_NAME, oldVarName, varName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(OclType newType, NotificationChain msgs) {
		OclType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OCLPackage.VARIABLE_DECLARATION__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(OclType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, OCLPackage.OCL_TYPE__VARIABLE_DECLARATION, OclType.class, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, OCLPackage.OCL_TYPE__VARIABLE_DECLARATION, OclType.class, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCLPackage.VARIABLE_DECLARATION__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclExpression getInitExpression() {
		return initExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitExpression(OclExpression newInitExpression, NotificationChain msgs) {
		OclExpression oldInitExpression = initExpression;
		initExpression = newInitExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OCLPackage.VARIABLE_DECLARATION__INIT_EXPRESSION, oldInitExpression, newInitExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitExpression(OclExpression newInitExpression) {
		if (newInitExpression != initExpression) {
			NotificationChain msgs = null;
			if (initExpression != null)
				msgs = ((InternalEObject)initExpression).eInverseRemove(this, OCLPackage.OCL_EXPRESSION__INITIALIZED_VARIABLE, OclExpression.class, msgs);
			if (newInitExpression != null)
				msgs = ((InternalEObject)newInitExpression).eInverseAdd(this, OCLPackage.OCL_EXPRESSION__INITIALIZED_VARIABLE, OclExpression.class, msgs);
			msgs = basicSetInitExpression(newInitExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCLPackage.VARIABLE_DECLARATION__INIT_EXPRESSION, newInitExpression, newInitExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LetExp getLetExp() {
		if (eContainerFeatureID() != OCLPackage.VARIABLE_DECLARATION__LET_EXP) return null;
		return (LetExp)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLetExp(LetExp newLetExp, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLetExp, OCLPackage.VARIABLE_DECLARATION__LET_EXP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLetExp(LetExp newLetExp) {
		if (newLetExp != eInternalContainer() || (eContainerFeatureID() != OCLPackage.VARIABLE_DECLARATION__LET_EXP && newLetExp != null)) {
			if (EcoreUtil.isAncestor(this, newLetExp))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLetExp != null)
				msgs = ((InternalEObject)newLetExp).eInverseAdd(this, OCLPackage.LET_EXP__VARIABLE, LetExp.class, msgs);
			msgs = basicSetLetExp(newLetExp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCLPackage.VARIABLE_DECLARATION__LET_EXP, newLetExp, newLetExp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IterateExp getBaseExp() {
		if (eContainerFeatureID() != OCLPackage.VARIABLE_DECLARATION__BASE_EXP) return null;
		return (IterateExp)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaseExp(IterateExp newBaseExp, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newBaseExp, OCLPackage.VARIABLE_DECLARATION__BASE_EXP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseExp(IterateExp newBaseExp) {
		if (newBaseExp != eInternalContainer() || (eContainerFeatureID() != OCLPackage.VARIABLE_DECLARATION__BASE_EXP && newBaseExp != null)) {
			if (EcoreUtil.isAncestor(this, newBaseExp))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBaseExp != null)
				msgs = ((InternalEObject)newBaseExp).eInverseAdd(this, OCLPackage.ITERATE_EXP__RESULT, IterateExp.class, msgs);
			msgs = basicSetBaseExp(newBaseExp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCLPackage.VARIABLE_DECLARATION__BASE_EXP, newBaseExp, newBaseExp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getVariableExp() {
		if (variableExp == null) {
			variableExp = new EObjectWithInverseResolvingEList(VariableExp.class, this, OCLPackage.VARIABLE_DECLARATION__VARIABLE_EXP, OCLPackage.VARIABLE_EXP__REFERRED_VARIABLE);
		}
		return variableExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OCLPackage.VARIABLE_DECLARATION__TYPE:
				if (type != null)
					msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OCLPackage.VARIABLE_DECLARATION__TYPE, null, msgs);
				return basicSetType((OclType)otherEnd, msgs);
			case OCLPackage.VARIABLE_DECLARATION__INIT_EXPRESSION:
				if (initExpression != null)
					msgs = ((InternalEObject)initExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OCLPackage.VARIABLE_DECLARATION__INIT_EXPRESSION, null, msgs);
				return basicSetInitExpression((OclExpression)otherEnd, msgs);
			case OCLPackage.VARIABLE_DECLARATION__LET_EXP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLetExp((LetExp)otherEnd, msgs);
			case OCLPackage.VARIABLE_DECLARATION__BASE_EXP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetBaseExp((IterateExp)otherEnd, msgs);
			case OCLPackage.VARIABLE_DECLARATION__VARIABLE_EXP:
				return ((InternalEList)getVariableExp()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OCLPackage.VARIABLE_DECLARATION__TYPE:
				return basicSetType(null, msgs);
			case OCLPackage.VARIABLE_DECLARATION__INIT_EXPRESSION:
				return basicSetInitExpression(null, msgs);
			case OCLPackage.VARIABLE_DECLARATION__LET_EXP:
				return basicSetLetExp(null, msgs);
			case OCLPackage.VARIABLE_DECLARATION__BASE_EXP:
				return basicSetBaseExp(null, msgs);
			case OCLPackage.VARIABLE_DECLARATION__VARIABLE_EXP:
				return ((InternalEList)getVariableExp()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case OCLPackage.VARIABLE_DECLARATION__LET_EXP:
				return eInternalContainer().eInverseRemove(this, OCLPackage.LET_EXP__VARIABLE, LetExp.class, msgs);
			case OCLPackage.VARIABLE_DECLARATION__BASE_EXP:
				return eInternalContainer().eInverseRemove(this, OCLPackage.ITERATE_EXP__RESULT, IterateExp.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OCLPackage.VARIABLE_DECLARATION__ID:
				return getId();
			case OCLPackage.VARIABLE_DECLARATION__VAR_NAME:
				return getVarName();
			case OCLPackage.VARIABLE_DECLARATION__TYPE:
				return getType();
			case OCLPackage.VARIABLE_DECLARATION__INIT_EXPRESSION:
				return getInitExpression();
			case OCLPackage.VARIABLE_DECLARATION__LET_EXP:
				return getLetExp();
			case OCLPackage.VARIABLE_DECLARATION__BASE_EXP:
				return getBaseExp();
			case OCLPackage.VARIABLE_DECLARATION__VARIABLE_EXP:
				return getVariableExp();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OCLPackage.VARIABLE_DECLARATION__ID:
				setId((String)newValue);
				return;
			case OCLPackage.VARIABLE_DECLARATION__VAR_NAME:
				setVarName((String)newValue);
				return;
			case OCLPackage.VARIABLE_DECLARATION__TYPE:
				setType((OclType)newValue);
				return;
			case OCLPackage.VARIABLE_DECLARATION__INIT_EXPRESSION:
				setInitExpression((OclExpression)newValue);
				return;
			case OCLPackage.VARIABLE_DECLARATION__LET_EXP:
				setLetExp((LetExp)newValue);
				return;
			case OCLPackage.VARIABLE_DECLARATION__BASE_EXP:
				setBaseExp((IterateExp)newValue);
				return;
			case OCLPackage.VARIABLE_DECLARATION__VARIABLE_EXP:
				getVariableExp().clear();
				getVariableExp().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case OCLPackage.VARIABLE_DECLARATION__ID:
				setId(ID_EDEFAULT);
				return;
			case OCLPackage.VARIABLE_DECLARATION__VAR_NAME:
				setVarName(VAR_NAME_EDEFAULT);
				return;
			case OCLPackage.VARIABLE_DECLARATION__TYPE:
				setType((OclType)null);
				return;
			case OCLPackage.VARIABLE_DECLARATION__INIT_EXPRESSION:
				setInitExpression((OclExpression)null);
				return;
			case OCLPackage.VARIABLE_DECLARATION__LET_EXP:
				setLetExp((LetExp)null);
				return;
			case OCLPackage.VARIABLE_DECLARATION__BASE_EXP:
				setBaseExp((IterateExp)null);
				return;
			case OCLPackage.VARIABLE_DECLARATION__VARIABLE_EXP:
				getVariableExp().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OCLPackage.VARIABLE_DECLARATION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case OCLPackage.VARIABLE_DECLARATION__VAR_NAME:
				return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
			case OCLPackage.VARIABLE_DECLARATION__TYPE:
				return type != null;
			case OCLPackage.VARIABLE_DECLARATION__INIT_EXPRESSION:
				return initExpression != null;
			case OCLPackage.VARIABLE_DECLARATION__LET_EXP:
				return getLetExp() != null;
			case OCLPackage.VARIABLE_DECLARATION__BASE_EXP:
				return getBaseExp() != null;
			case OCLPackage.VARIABLE_DECLARATION__VARIABLE_EXP:
				return variableExp != null && !variableExp.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", varName: ");
		result.append(varName);
		result.append(')');
		return result.toString();
	}

} //VariableDeclarationImpl
