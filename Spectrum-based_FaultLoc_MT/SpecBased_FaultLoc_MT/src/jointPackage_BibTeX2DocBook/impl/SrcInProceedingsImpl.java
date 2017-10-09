/**
 */
package jointPackage_BibTeX2DocBook.impl;

import java.util.Collection;

import jointPackage_BibTeX2DocBook.JointPackage_BibTeX2DocBookPackage;
import jointPackage_BibTeX2DocBook.SrcAuthor;
import jointPackage_BibTeX2DocBook.SrcAuthoredEntry;
import jointPackage_BibTeX2DocBook.SrcBookTitledEntry;
import jointPackage_BibTeX2DocBook.SrcInProceedings;

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
 * An implementation of the model object '<em><b>Src In Proceedings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_BibTeX2DocBook.impl.SrcInProceedingsImpl#getAuthors <em>Authors</em>}</li>
 *   <li>{@link jointPackage_BibTeX2DocBook.impl.SrcInProceedingsImpl#getBooktitle <em>Booktitle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SrcInProceedingsImpl extends SrcProceedingsImpl implements SrcInProceedings {
	/**
	 * The cached value of the '{@link #getAuthors() <em>Authors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthors()
	 * @generated
	 * @ordered
	 */
	protected EList<SrcAuthor> authors;

	/**
	 * The default value of the '{@link #getBooktitle() <em>Booktitle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooktitle()
	 * @generated
	 * @ordered
	 */
	protected static final String BOOKTITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBooktitle() <em>Booktitle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooktitle()
	 * @generated
	 * @ordered
	 */
	protected String booktitle = BOOKTITLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SrcInProceedingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JointPackage_BibTeX2DocBookPackage.Literals.SRC_IN_PROCEEDINGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SrcAuthor> getAuthors() {
		if (authors == null) {
			authors = new EObjectContainmentEList<SrcAuthor>(SrcAuthor.class, this, JointPackage_BibTeX2DocBookPackage.SRC_IN_PROCEEDINGS__AUTHORS);
		}
		return authors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBooktitle() {
		return booktitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBooktitle(String newBooktitle) {
		String oldBooktitle = booktitle;
		booktitle = newBooktitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_BibTeX2DocBookPackage.SRC_IN_PROCEEDINGS__BOOKTITLE, oldBooktitle, booktitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JointPackage_BibTeX2DocBookPackage.SRC_IN_PROCEEDINGS__AUTHORS:
				return ((InternalEList<?>)getAuthors()).basicRemove(otherEnd, msgs);
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
			case JointPackage_BibTeX2DocBookPackage.SRC_IN_PROCEEDINGS__AUTHORS:
				return getAuthors();
			case JointPackage_BibTeX2DocBookPackage.SRC_IN_PROCEEDINGS__BOOKTITLE:
				return getBooktitle();
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
			case JointPackage_BibTeX2DocBookPackage.SRC_IN_PROCEEDINGS__AUTHORS:
				getAuthors().clear();
				getAuthors().addAll((Collection<? extends SrcAuthor>)newValue);
				return;
			case JointPackage_BibTeX2DocBookPackage.SRC_IN_PROCEEDINGS__BOOKTITLE:
				setBooktitle((String)newValue);
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
			case JointPackage_BibTeX2DocBookPackage.SRC_IN_PROCEEDINGS__AUTHORS:
				getAuthors().clear();
				return;
			case JointPackage_BibTeX2DocBookPackage.SRC_IN_PROCEEDINGS__BOOKTITLE:
				setBooktitle(BOOKTITLE_EDEFAULT);
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
			case JointPackage_BibTeX2DocBookPackage.SRC_IN_PROCEEDINGS__AUTHORS:
				return authors != null && !authors.isEmpty();
			case JointPackage_BibTeX2DocBookPackage.SRC_IN_PROCEEDINGS__BOOKTITLE:
				return BOOKTITLE_EDEFAULT == null ? booktitle != null : !BOOKTITLE_EDEFAULT.equals(booktitle);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == SrcAuthoredEntry.class) {
			switch (derivedFeatureID) {
				case JointPackage_BibTeX2DocBookPackage.SRC_IN_PROCEEDINGS__AUTHORS: return JointPackage_BibTeX2DocBookPackage.SRC_AUTHORED_ENTRY__AUTHORS;
				default: return -1;
			}
		}
		if (baseClass == SrcBookTitledEntry.class) {
			switch (derivedFeatureID) {
				case JointPackage_BibTeX2DocBookPackage.SRC_IN_PROCEEDINGS__BOOKTITLE: return JointPackage_BibTeX2DocBookPackage.SRC_BOOK_TITLED_ENTRY__BOOKTITLE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == SrcAuthoredEntry.class) {
			switch (baseFeatureID) {
				case JointPackage_BibTeX2DocBookPackage.SRC_AUTHORED_ENTRY__AUTHORS: return JointPackage_BibTeX2DocBookPackage.SRC_IN_PROCEEDINGS__AUTHORS;
				default: return -1;
			}
		}
		if (baseClass == SrcBookTitledEntry.class) {
			switch (baseFeatureID) {
				case JointPackage_BibTeX2DocBookPackage.SRC_BOOK_TITLED_ENTRY__BOOKTITLE: return JointPackage_BibTeX2DocBookPackage.SRC_IN_PROCEEDINGS__BOOKTITLE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (booktitle: ");
		result.append(booktitle);
		result.append(')');
		return result.toString();
	}

} //SrcInProceedingsImpl
