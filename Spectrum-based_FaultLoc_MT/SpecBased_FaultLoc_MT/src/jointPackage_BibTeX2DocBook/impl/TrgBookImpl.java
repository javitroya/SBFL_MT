/**
 */
package jointPackage_BibTeX2DocBook.impl;

import java.util.Collection;

import jointPackage_BibTeX2DocBook.JointPackage_BibTeX2DocBookPackage;
import jointPackage_BibTeX2DocBook.TrgArticle;
import jointPackage_BibTeX2DocBook.TrgBook;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trg Book</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_BibTeX2DocBook.impl.TrgBookImpl#getArticles <em>Articles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrgBookImpl extends MinimalEObjectImpl.Container implements TrgBook {
	/**
	 * The cached value of the '{@link #getArticles() <em>Articles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArticles()
	 * @generated
	 * @ordered
	 */
	protected EList<TrgArticle> articles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrgBookImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JointPackage_BibTeX2DocBookPackage.Literals.TRG_BOOK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TrgArticle> getArticles() {
		if (articles == null) {
			articles = new EObjectContainmentEList<TrgArticle>(TrgArticle.class, this, JointPackage_BibTeX2DocBookPackage.TRG_BOOK__ARTICLES);
		}
		return articles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JointPackage_BibTeX2DocBookPackage.TRG_BOOK__ARTICLES:
				return ((InternalEList<?>)getArticles()).basicRemove(otherEnd, msgs);
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
			case JointPackage_BibTeX2DocBookPackage.TRG_BOOK__ARTICLES:
				return getArticles();
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
			case JointPackage_BibTeX2DocBookPackage.TRG_BOOK__ARTICLES:
				getArticles().clear();
				getArticles().addAll((Collection<? extends TrgArticle>)newValue);
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
			case JointPackage_BibTeX2DocBookPackage.TRG_BOOK__ARTICLES:
				getArticles().clear();
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
			case JointPackage_BibTeX2DocBookPackage.TRG_BOOK__ARTICLES:
				return articles != null && !articles.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TrgBookImpl
