/**
 */
package jointPackage_BibTeX2DocBook.impl;

import java.util.Collection;

import jointPackage_BibTeX2DocBook.JointPackage_BibTeX2DocBookPackage;
import jointPackage_BibTeX2DocBook.TrgArticle;
import jointPackage_BibTeX2DocBook.TrgSect1;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trg Article</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_BibTeX2DocBook.impl.TrgArticleImpl#getSections_1 <em>Sections 1</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrgArticleImpl extends TrgTitledElementImpl implements TrgArticle {
	/**
	 * The cached value of the '{@link #getSections_1() <em>Sections 1</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSections_1()
	 * @generated
	 * @ordered
	 */
	protected EList<TrgSect1> sections_1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrgArticleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JointPackage_BibTeX2DocBookPackage.Literals.TRG_ARTICLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TrgSect1> getSections_1() {
		if (sections_1 == null) {
			sections_1 = new EObjectContainmentEList<TrgSect1>(TrgSect1.class, this, JointPackage_BibTeX2DocBookPackage.TRG_ARTICLE__SECTIONS_1);
		}
		return sections_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JointPackage_BibTeX2DocBookPackage.TRG_ARTICLE__SECTIONS_1:
				return ((InternalEList<?>)getSections_1()).basicRemove(otherEnd, msgs);
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
			case JointPackage_BibTeX2DocBookPackage.TRG_ARTICLE__SECTIONS_1:
				return getSections_1();
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
			case JointPackage_BibTeX2DocBookPackage.TRG_ARTICLE__SECTIONS_1:
				getSections_1().clear();
				getSections_1().addAll((Collection<? extends TrgSect1>)newValue);
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
			case JointPackage_BibTeX2DocBookPackage.TRG_ARTICLE__SECTIONS_1:
				getSections_1().clear();
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
			case JointPackage_BibTeX2DocBookPackage.TRG_ARTICLE__SECTIONS_1:
				return sections_1 != null && !sections_1.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TrgArticleImpl
