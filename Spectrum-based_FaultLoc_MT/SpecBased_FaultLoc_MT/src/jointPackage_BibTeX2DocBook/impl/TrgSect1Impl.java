/**
 */
package jointPackage_BibTeX2DocBook.impl;

import java.util.Collection;

import jointPackage_BibTeX2DocBook.JointPackage_BibTeX2DocBookPackage;
import jointPackage_BibTeX2DocBook.TrgSect1;
import jointPackage_BibTeX2DocBook.TrgSect2;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trg Sect1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_BibTeX2DocBook.impl.TrgSect1Impl#getSections_2 <em>Sections 2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrgSect1Impl extends TrgSectionImpl implements TrgSect1 {
	/**
	 * The cached value of the '{@link #getSections_2() <em>Sections 2</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSections_2()
	 * @generated
	 * @ordered
	 */
	protected EList<TrgSect2> sections_2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrgSect1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JointPackage_BibTeX2DocBookPackage.Literals.TRG_SECT1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TrgSect2> getSections_2() {
		if (sections_2 == null) {
			sections_2 = new EObjectContainmentEList<TrgSect2>(TrgSect2.class, this, JointPackage_BibTeX2DocBookPackage.TRG_SECT1__SECTIONS_2);
		}
		return sections_2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JointPackage_BibTeX2DocBookPackage.TRG_SECT1__SECTIONS_2:
				return ((InternalEList<?>)getSections_2()).basicRemove(otherEnd, msgs);
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
			case JointPackage_BibTeX2DocBookPackage.TRG_SECT1__SECTIONS_2:
				return getSections_2();
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
			case JointPackage_BibTeX2DocBookPackage.TRG_SECT1__SECTIONS_2:
				getSections_2().clear();
				getSections_2().addAll((Collection<? extends TrgSect2>)newValue);
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
			case JointPackage_BibTeX2DocBookPackage.TRG_SECT1__SECTIONS_2:
				getSections_2().clear();
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
			case JointPackage_BibTeX2DocBookPackage.TRG_SECT1__SECTIONS_2:
				return sections_2 != null && !sections_2.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TrgSect1Impl
