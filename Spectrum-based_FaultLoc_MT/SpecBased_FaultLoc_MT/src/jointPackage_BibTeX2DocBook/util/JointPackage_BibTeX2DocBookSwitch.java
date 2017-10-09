/**
 */
package jointPackage_BibTeX2DocBook.util;

import jointPackage_BibTeX2DocBook.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see jointPackage_BibTeX2DocBook.JointPackage_BibTeX2DocBookPackage
 * @generated
 */
public class JointPackage_BibTeX2DocBookSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JointPackage_BibTeX2DocBookPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JointPackage_BibTeX2DocBookSwitch() {
		if (modelPackage == null) {
			modelPackage = JointPackage_BibTeX2DocBookPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case JointPackage_BibTeX2DocBookPackage.JOINT_MM: {
				JointMM jointMM = (JointMM)theEObject;
				T result = caseJointMM(jointMM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_BibTeX2DocBookPackage.SRC_BIB_TE_XFILE: {
				SrcBibTeXFile srcBibTeXFile = (SrcBibTeXFile)theEObject;
				T result = caseSrcBibTeXFile(srcBibTeXFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_BibTeX2DocBookPackage.SRC_ARTICLE: {
				SrcArticle srcArticle = (SrcArticle)theEObject;
				T result = caseSrcArticle(srcArticle);
				if (result == null) result = caseSrcAuthoredEntry(srcArticle);
				if (result == null) result = caseSrcDatedEntry(srcArticle);
				if (result == null) result = caseSrcTitledEntry(srcArticle);
				if (result == null) result = caseSrcBibTeXEntry(srcArticle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_BibTeX2DocBookPackage.SRC_TECH_REPORT: {
				SrcTechReport srcTechReport = (SrcTechReport)theEObject;
				T result = caseSrcTechReport(srcTechReport);
				if (result == null) result = caseSrcAuthoredEntry(srcTechReport);
				if (result == null) result = caseSrcDatedEntry(srcTechReport);
				if (result == null) result = caseSrcTitledEntry(srcTechReport);
				if (result == null) result = caseSrcBibTeXEntry(srcTechReport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_BibTeX2DocBookPackage.SRC_UNPUBLISHED: {
				SrcUnpublished srcUnpublished = (SrcUnpublished)theEObject;
				T result = caseSrcUnpublished(srcUnpublished);
				if (result == null) result = caseSrcAuthoredEntry(srcUnpublished);
				if (result == null) result = caseSrcTitledEntry(srcUnpublished);
				if (result == null) result = caseSrcBibTeXEntry(srcUnpublished);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_BibTeX2DocBookPackage.SRC_MANUAL: {
				SrcManual srcManual = (SrcManual)theEObject;
				T result = caseSrcManual(srcManual);
				if (result == null) result = caseSrcTitledEntry(srcManual);
				if (result == null) result = caseSrcBibTeXEntry(srcManual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_BibTeX2DocBookPackage.SRC_PROCEEDINGS: {
				SrcProceedings srcProceedings = (SrcProceedings)theEObject;
				T result = caseSrcProceedings(srcProceedings);
				if (result == null) result = caseSrcDatedEntry(srcProceedings);
				if (result == null) result = caseSrcTitledEntry(srcProceedings);
				if (result == null) result = caseSrcBibTeXEntry(srcProceedings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_BibTeX2DocBookPackage.SRC_IN_PROCEEDINGS: {
				SrcInProceedings srcInProceedings = (SrcInProceedings)theEObject;
				T result = caseSrcInProceedings(srcInProceedings);
				if (result == null) result = caseSrcProceedings(srcInProceedings);
				if (result == null) result = caseSrcAuthoredEntry(srcInProceedings);
				if (result == null) result = caseSrcBookTitledEntry(srcInProceedings);
				if (result == null) result = caseSrcDatedEntry(srcInProceedings);
				if (result == null) result = caseSrcTitledEntry(srcInProceedings);
				if (result == null) result = caseSrcBibTeXEntry(srcInProceedings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_BibTeX2DocBookPackage.SRC_BOOKLET: {
				SrcBooklet srcBooklet = (SrcBooklet)theEObject;
				T result = caseSrcBooklet(srcBooklet);
				if (result == null) result = caseSrcDatedEntry(srcBooklet);
				if (result == null) result = caseSrcBibTeXEntry(srcBooklet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_BibTeX2DocBookPackage.SRC_BOOK: {
				SrcBook srcBook = (SrcBook)theEObject;
				T result = caseSrcBook(srcBook);
				if (result == null) result = caseSrcAuthoredEntry(srcBook);
				if (result == null) result = caseSrcDatedEntry(srcBook);
				if (result == null) result = caseSrcTitledEntry(srcBook);
				if (result == null) result = caseSrcBibTeXEntry(srcBook);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_BibTeX2DocBookPackage.SRC_IN_COLLECTION: {
				SrcInCollection srcInCollection = (SrcInCollection)theEObject;
				T result = caseSrcInCollection(srcInCollection);
				if (result == null) result = caseSrcBook(srcInCollection);
				if (result == null) result = caseSrcBookTitledEntry(srcInCollection);
				if (result == null) result = caseSrcAuthoredEntry(srcInCollection);
				if (result == null) result = caseSrcDatedEntry(srcInCollection);
				if (result == null) result = caseSrcTitledEntry(srcInCollection);
				if (result == null) result = caseSrcBibTeXEntry(srcInCollection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_BibTeX2DocBookPackage.SRC_IN_BOOK: {
				SrcInBook srcInBook = (SrcInBook)theEObject;
				T result = caseSrcInBook(srcInBook);
				if (result == null) result = caseSrcBook(srcInBook);
				if (result == null) result = caseSrcAuthoredEntry(srcInBook);
				if (result == null) result = caseSrcDatedEntry(srcInBook);
				if (result == null) result = caseSrcTitledEntry(srcInBook);
				if (result == null) result = caseSrcBibTeXEntry(srcInBook);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_BibTeX2DocBookPackage.SRC_PH_DTHESIS: {
				SrcPhDThesis srcPhDThesis = (SrcPhDThesis)theEObject;
				T result = caseSrcPhDThesis(srcPhDThesis);
				if (result == null) result = caseSrcThesisEntry(srcPhDThesis);
				if (result == null) result = caseSrcAuthoredEntry(srcPhDThesis);
				if (result == null) result = caseSrcDatedEntry(srcPhDThesis);
				if (result == null) result = caseSrcTitledEntry(srcPhDThesis);
				if (result == null) result = caseSrcBibTeXEntry(srcPhDThesis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_BibTeX2DocBookPackage.SRC_MASTER_THESIS: {
				SrcMasterThesis srcMasterThesis = (SrcMasterThesis)theEObject;
				T result = caseSrcMasterThesis(srcMasterThesis);
				if (result == null) result = caseSrcThesisEntry(srcMasterThesis);
				if (result == null) result = caseSrcAuthoredEntry(srcMasterThesis);
				if (result == null) result = caseSrcDatedEntry(srcMasterThesis);
				if (result == null) result = caseSrcTitledEntry(srcMasterThesis);
				if (result == null) result = caseSrcBibTeXEntry(srcMasterThesis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_BibTeX2DocBookPackage.SRC_AUTHOR: {
				SrcAuthor srcAuthor = (SrcAuthor)theEObject;
				T result = caseSrcAuthor(srcAuthor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_BibTeX2DocBookPackage.SRC_BIB_TE_XENTRY: {
				SrcBibTeXEntry srcBibTeXEntry = (SrcBibTeXEntry)theEObject;
				T result = caseSrcBibTeXEntry(srcBibTeXEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_BibTeX2DocBookPackage.SRC_AUTHORED_ENTRY: {
				SrcAuthoredEntry srcAuthoredEntry = (SrcAuthoredEntry)theEObject;
				T result = caseSrcAuthoredEntry(srcAuthoredEntry);
				if (result == null) result = caseSrcBibTeXEntry(srcAuthoredEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_BibTeX2DocBookPackage.SRC_DATED_ENTRY: {
				SrcDatedEntry srcDatedEntry = (SrcDatedEntry)theEObject;
				T result = caseSrcDatedEntry(srcDatedEntry);
				if (result == null) result = caseSrcBibTeXEntry(srcDatedEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_BibTeX2DocBookPackage.SRC_TITLED_ENTRY: {
				SrcTitledEntry srcTitledEntry = (SrcTitledEntry)theEObject;
				T result = caseSrcTitledEntry(srcTitledEntry);
				if (result == null) result = caseSrcBibTeXEntry(srcTitledEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_BibTeX2DocBookPackage.SRC_BOOK_TITLED_ENTRY: {
				SrcBookTitledEntry srcBookTitledEntry = (SrcBookTitledEntry)theEObject;
				T result = caseSrcBookTitledEntry(srcBookTitledEntry);
				if (result == null) result = caseSrcBibTeXEntry(srcBookTitledEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_BibTeX2DocBookPackage.SRC_MISC: {
				SrcMisc srcMisc = (SrcMisc)theEObject;
				T result = caseSrcMisc(srcMisc);
				if (result == null) result = caseSrcBibTeXEntry(srcMisc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_BibTeX2DocBookPackage.SRC_THESIS_ENTRY: {
				SrcThesisEntry srcThesisEntry = (SrcThesisEntry)theEObject;
				T result = caseSrcThesisEntry(srcThesisEntry);
				if (result == null) result = caseSrcAuthoredEntry(srcThesisEntry);
				if (result == null) result = caseSrcDatedEntry(srcThesisEntry);
				if (result == null) result = caseSrcTitledEntry(srcThesisEntry);
				if (result == null) result = caseSrcBibTeXEntry(srcThesisEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_BibTeX2DocBookPackage.TRG_DOC_BOOK: {
				TrgDocBook trgDocBook = (TrgDocBook)theEObject;
				T result = caseTrgDocBook(trgDocBook);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_BibTeX2DocBookPackage.TRG_BOOK: {
				TrgBook trgBook = (TrgBook)theEObject;
				T result = caseTrgBook(trgBook);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_BibTeX2DocBookPackage.TRG_TITLED_ELEMENT: {
				TrgTitledElement trgTitledElement = (TrgTitledElement)theEObject;
				T result = caseTrgTitledElement(trgTitledElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_BibTeX2DocBookPackage.TRG_ARTICLE: {
				TrgArticle trgArticle = (TrgArticle)theEObject;
				T result = caseTrgArticle(trgArticle);
				if (result == null) result = caseTrgTitledElement(trgArticle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_BibTeX2DocBookPackage.TRG_SECTION: {
				TrgSection trgSection = (TrgSection)theEObject;
				T result = caseTrgSection(trgSection);
				if (result == null) result = caseTrgTitledElement(trgSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_BibTeX2DocBookPackage.TRG_SECT1: {
				TrgSect1 trgSect1 = (TrgSect1)theEObject;
				T result = caseTrgSect1(trgSect1);
				if (result == null) result = caseTrgSection(trgSect1);
				if (result == null) result = caseTrgTitledElement(trgSect1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_BibTeX2DocBookPackage.TRG_SECT2: {
				TrgSect2 trgSect2 = (TrgSect2)theEObject;
				T result = caseTrgSect2(trgSect2);
				if (result == null) result = caseTrgSection(trgSect2);
				if (result == null) result = caseTrgTitledElement(trgSect2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_BibTeX2DocBookPackage.TRG_PARA: {
				TrgPara trgPara = (TrgPara)theEObject;
				T result = caseTrgPara(trgPara);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Joint MM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Joint MM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJointMM(JointMM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src Bib Te XFile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src Bib Te XFile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcBibTeXFile(SrcBibTeXFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src Article</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src Article</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcArticle(SrcArticle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src Tech Report</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src Tech Report</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcTechReport(SrcTechReport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src Unpublished</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src Unpublished</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcUnpublished(SrcUnpublished object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src Manual</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src Manual</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcManual(SrcManual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src Proceedings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src Proceedings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcProceedings(SrcProceedings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src In Proceedings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src In Proceedings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcInProceedings(SrcInProceedings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src Booklet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src Booklet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcBooklet(SrcBooklet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src Book</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src Book</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcBook(SrcBook object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src In Collection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src In Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcInCollection(SrcInCollection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src In Book</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src In Book</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcInBook(SrcInBook object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src Ph DThesis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src Ph DThesis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcPhDThesis(SrcPhDThesis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src Master Thesis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src Master Thesis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcMasterThesis(SrcMasterThesis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src Author</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src Author</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcAuthor(SrcAuthor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src Bib Te XEntry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src Bib Te XEntry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcBibTeXEntry(SrcBibTeXEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src Authored Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src Authored Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcAuthoredEntry(SrcAuthoredEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src Dated Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src Dated Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcDatedEntry(SrcDatedEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src Titled Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src Titled Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcTitledEntry(SrcTitledEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src Book Titled Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src Book Titled Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcBookTitledEntry(SrcBookTitledEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src Misc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src Misc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcMisc(SrcMisc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src Thesis Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src Thesis Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcThesisEntry(SrcThesisEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Doc Book</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Doc Book</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgDocBook(TrgDocBook object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Book</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Book</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgBook(TrgBook object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Titled Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Titled Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgTitledElement(TrgTitledElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Article</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Article</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgArticle(TrgArticle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgSection(TrgSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Sect1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Sect1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgSect1(TrgSect1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Sect2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Sect2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgSect2(TrgSect2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Para</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Para</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgPara(TrgPara object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //JointPackage_BibTeX2DocBookSwitch
