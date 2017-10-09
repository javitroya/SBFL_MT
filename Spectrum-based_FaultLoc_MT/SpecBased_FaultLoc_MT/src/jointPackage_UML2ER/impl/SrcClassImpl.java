/**
 */
package jointPackage_UML2ER.impl;

import java.util.Collection;

import jointPackage_UML2ER.JointPackage_UML2ERPackage;
import jointPackage_UML2ER.SrcClass;
import jointPackage_UML2ER.SrcProperty;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Src Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_UML2ER.impl.SrcClassImpl#getOwnedProperty <em>Owned Property</em>}</li>
 *   <li>{@link jointPackage_UML2ER.impl.SrcClassImpl#getSuperClasses <em>Super Classes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SrcClassImpl extends SrcNamedElementImpl implements SrcClass {
	/**
	 * The cached value of the '{@link #getOwnedProperty() <em>Owned Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<SrcProperty> ownedProperty;

	/**
	 * The cached value of the '{@link #getSuperClasses() <em>Super Classes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<SrcClass> superClasses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SrcClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JointPackage_UML2ERPackage.Literals.SRC_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SrcProperty> getOwnedProperty() {
		if (ownedProperty == null) {
			ownedProperty = new EObjectContainmentEList<SrcProperty>(SrcProperty.class, this, JointPackage_UML2ERPackage.SRC_CLASS__OWNED_PROPERTY);
		}
		return ownedProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SrcClass> getSuperClasses() {
		if (superClasses == null) {
			superClasses = new EObjectResolvingEList<SrcClass>(SrcClass.class, this, JointPackage_UML2ERPackage.SRC_CLASS__SUPER_CLASSES);
		}
		return superClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JointPackage_UML2ERPackage.SRC_CLASS__OWNED_PROPERTY:
				return ((InternalEList<?>)getOwnedProperty()).basicRemove(otherEnd, msgs);
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
			case JointPackage_UML2ERPackage.SRC_CLASS__OWNED_PROPERTY:
				return getOwnedProperty();
			case JointPackage_UML2ERPackage.SRC_CLASS__SUPER_CLASSES:
				return getSuperClasses();
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
			case JointPackage_UML2ERPackage.SRC_CLASS__OWNED_PROPERTY:
				getOwnedProperty().clear();
				getOwnedProperty().addAll((Collection<? extends SrcProperty>)newValue);
				return;
			case JointPackage_UML2ERPackage.SRC_CLASS__SUPER_CLASSES:
				getSuperClasses().clear();
				getSuperClasses().addAll((Collection<? extends SrcClass>)newValue);
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
			case JointPackage_UML2ERPackage.SRC_CLASS__OWNED_PROPERTY:
				getOwnedProperty().clear();
				return;
			case JointPackage_UML2ERPackage.SRC_CLASS__SUPER_CLASSES:
				getSuperClasses().clear();
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
			case JointPackage_UML2ERPackage.SRC_CLASS__OWNED_PROPERTY:
				return ownedProperty != null && !ownedProperty.isEmpty();
			case JointPackage_UML2ERPackage.SRC_CLASS__SUPER_CLASSES:
				return superClasses != null && !superClasses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SrcClassImpl
