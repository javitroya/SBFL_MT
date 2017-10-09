/**
 */
package jointPackage_BibTeX2DocBook.impl;

import jointPackage_BibTeX2DocBook.JointPackage_BibTeX2DocBookPackage;
import jointPackage_BibTeX2DocBook.SrcBook;
import jointPackage_BibTeX2DocBook.SrcDatedEntry;
import jointPackage_BibTeX2DocBook.SrcTitledEntry;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Src Book</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_BibTeX2DocBook.impl.SrcBookImpl#getYear <em>Year</em>}</li>
 *   <li>{@link jointPackage_BibTeX2DocBook.impl.SrcBookImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link jointPackage_BibTeX2DocBook.impl.SrcBookImpl#getPublisher <em>Publisher</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SrcBookImpl extends SrcAuthoredEntryImpl implements SrcBook {
	/**
	 * The default value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected static final String YEAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected String year = YEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPublisher() <em>Publisher</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisher()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLISHER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublisher() <em>Publisher</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisher()
	 * @generated
	 * @ordered
	 */
	protected String publisher = PUBLISHER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SrcBookImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JointPackage_BibTeX2DocBookPackage.Literals.SRC_BOOK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getYear() {
		return year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYear(String newYear) {
		String oldYear = year;
		year = newYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_BibTeX2DocBookPackage.SRC_BOOK__YEAR, oldYear, year));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_BibTeX2DocBookPackage.SRC_BOOK__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPublisher() {
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublisher(String newPublisher) {
		String oldPublisher = publisher;
		publisher = newPublisher;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_BibTeX2DocBookPackage.SRC_BOOK__PUBLISHER, oldPublisher, publisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JointPackage_BibTeX2DocBookPackage.SRC_BOOK__YEAR:
				return getYear();
			case JointPackage_BibTeX2DocBookPackage.SRC_BOOK__TITLE:
				return getTitle();
			case JointPackage_BibTeX2DocBookPackage.SRC_BOOK__PUBLISHER:
				return getPublisher();
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
			case JointPackage_BibTeX2DocBookPackage.SRC_BOOK__YEAR:
				setYear((String)newValue);
				return;
			case JointPackage_BibTeX2DocBookPackage.SRC_BOOK__TITLE:
				setTitle((String)newValue);
				return;
			case JointPackage_BibTeX2DocBookPackage.SRC_BOOK__PUBLISHER:
				setPublisher((String)newValue);
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
			case JointPackage_BibTeX2DocBookPackage.SRC_BOOK__YEAR:
				setYear(YEAR_EDEFAULT);
				return;
			case JointPackage_BibTeX2DocBookPackage.SRC_BOOK__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case JointPackage_BibTeX2DocBookPackage.SRC_BOOK__PUBLISHER:
				setPublisher(PUBLISHER_EDEFAULT);
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
			case JointPackage_BibTeX2DocBookPackage.SRC_BOOK__YEAR:
				return YEAR_EDEFAULT == null ? year != null : !YEAR_EDEFAULT.equals(year);
			case JointPackage_BibTeX2DocBookPackage.SRC_BOOK__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case JointPackage_BibTeX2DocBookPackage.SRC_BOOK__PUBLISHER:
				return PUBLISHER_EDEFAULT == null ? publisher != null : !PUBLISHER_EDEFAULT.equals(publisher);
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
		if (baseClass == SrcDatedEntry.class) {
			switch (derivedFeatureID) {
				case JointPackage_BibTeX2DocBookPackage.SRC_BOOK__YEAR: return JointPackage_BibTeX2DocBookPackage.SRC_DATED_ENTRY__YEAR;
				default: return -1;
			}
		}
		if (baseClass == SrcTitledEntry.class) {
			switch (derivedFeatureID) {
				case JointPackage_BibTeX2DocBookPackage.SRC_BOOK__TITLE: return JointPackage_BibTeX2DocBookPackage.SRC_TITLED_ENTRY__TITLE;
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
		if (baseClass == SrcDatedEntry.class) {
			switch (baseFeatureID) {
				case JointPackage_BibTeX2DocBookPackage.SRC_DATED_ENTRY__YEAR: return JointPackage_BibTeX2DocBookPackage.SRC_BOOK__YEAR;
				default: return -1;
			}
		}
		if (baseClass == SrcTitledEntry.class) {
			switch (baseFeatureID) {
				case JointPackage_BibTeX2DocBookPackage.SRC_TITLED_ENTRY__TITLE: return JointPackage_BibTeX2DocBookPackage.SRC_BOOK__TITLE;
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
		result.append(" (year: ");
		result.append(year);
		result.append(", title: ");
		result.append(title);
		result.append(", publisher: ");
		result.append(publisher);
		result.append(')');
		return result.toString();
	}

} //SrcBookImpl
