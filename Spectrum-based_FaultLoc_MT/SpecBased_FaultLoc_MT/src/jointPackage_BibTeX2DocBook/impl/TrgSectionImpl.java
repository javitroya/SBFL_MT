/**
 */
package jointPackage_BibTeX2DocBook.impl;

import java.util.Collection;

import jointPackage_BibTeX2DocBook.JointPackage_BibTeX2DocBookPackage;
import jointPackage_BibTeX2DocBook.TrgPara;
import jointPackage_BibTeX2DocBook.TrgSection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trg Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_BibTeX2DocBook.impl.TrgSectionImpl#getParas <em>Paras</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TrgSectionImpl extends TrgTitledElementImpl implements TrgSection {
	/**
	 * The cached value of the '{@link #getParas() <em>Paras</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParas()
	 * @generated
	 * @ordered
	 */
	protected EList<TrgPara> paras;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrgSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JointPackage_BibTeX2DocBookPackage.Literals.TRG_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TrgPara> getParas() {
		if (paras == null) {
			paras = new EObjectContainmentWithInverseEList<TrgPara>(TrgPara.class, this, JointPackage_BibTeX2DocBookPackage.TRG_SECTION__PARAS, JointPackage_BibTeX2DocBookPackage.TRG_PARA__SECTION);
		}
		return paras;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JointPackage_BibTeX2DocBookPackage.TRG_SECTION__PARAS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParas()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JointPackage_BibTeX2DocBookPackage.TRG_SECTION__PARAS:
				return ((InternalEList<?>)getParas()).basicRemove(otherEnd, msgs);
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
			case JointPackage_BibTeX2DocBookPackage.TRG_SECTION__PARAS:
				return getParas();
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
			case JointPackage_BibTeX2DocBookPackage.TRG_SECTION__PARAS:
				getParas().clear();
				getParas().addAll((Collection<? extends TrgPara>)newValue);
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
			case JointPackage_BibTeX2DocBookPackage.TRG_SECTION__PARAS:
				getParas().clear();
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
			case JointPackage_BibTeX2DocBookPackage.TRG_SECTION__PARAS:
				return paras != null && !paras.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TrgSectionImpl
