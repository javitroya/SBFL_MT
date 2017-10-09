/**
 */
package jointPackage_BibTeX2DocBook.util;

import jointPackage_BibTeX2DocBook.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see jointPackage_BibTeX2DocBook.JointPackage_BibTeX2DocBookPackage
 * @generated
 */
public class JointPackage_BibTeX2DocBookAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JointPackage_BibTeX2DocBookPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JointPackage_BibTeX2DocBookAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = JointPackage_BibTeX2DocBookPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JointPackage_BibTeX2DocBookSwitch<Adapter> modelSwitch =
		new JointPackage_BibTeX2DocBookSwitch<Adapter>() {
			@Override
			public Adapter caseJointMM(JointMM object) {
				return createJointMMAdapter();
			}
			@Override
			public Adapter caseSrcBibTeXFile(SrcBibTeXFile object) {
				return createSrcBibTeXFileAdapter();
			}
			@Override
			public Adapter caseSrcArticle(SrcArticle object) {
				return createSrcArticleAdapter();
			}
			@Override
			public Adapter caseSrcTechReport(SrcTechReport object) {
				return createSrcTechReportAdapter();
			}
			@Override
			public Adapter caseSrcUnpublished(SrcUnpublished object) {
				return createSrcUnpublishedAdapter();
			}
			@Override
			public Adapter caseSrcManual(SrcManual object) {
				return createSrcManualAdapter();
			}
			@Override
			public Adapter caseSrcProceedings(SrcProceedings object) {
				return createSrcProceedingsAdapter();
			}
			@Override
			public Adapter caseSrcInProceedings(SrcInProceedings object) {
				return createSrcInProceedingsAdapter();
			}
			@Override
			public Adapter caseSrcBooklet(SrcBooklet object) {
				return createSrcBookletAdapter();
			}
			@Override
			public Adapter caseSrcBook(SrcBook object) {
				return createSrcBookAdapter();
			}
			@Override
			public Adapter caseSrcInCollection(SrcInCollection object) {
				return createSrcInCollectionAdapter();
			}
			@Override
			public Adapter caseSrcInBook(SrcInBook object) {
				return createSrcInBookAdapter();
			}
			@Override
			public Adapter caseSrcPhDThesis(SrcPhDThesis object) {
				return createSrcPhDThesisAdapter();
			}
			@Override
			public Adapter caseSrcMasterThesis(SrcMasterThesis object) {
				return createSrcMasterThesisAdapter();
			}
			@Override
			public Adapter caseSrcAuthor(SrcAuthor object) {
				return createSrcAuthorAdapter();
			}
			@Override
			public Adapter caseSrcBibTeXEntry(SrcBibTeXEntry object) {
				return createSrcBibTeXEntryAdapter();
			}
			@Override
			public Adapter caseSrcAuthoredEntry(SrcAuthoredEntry object) {
				return createSrcAuthoredEntryAdapter();
			}
			@Override
			public Adapter caseSrcDatedEntry(SrcDatedEntry object) {
				return createSrcDatedEntryAdapter();
			}
			@Override
			public Adapter caseSrcTitledEntry(SrcTitledEntry object) {
				return createSrcTitledEntryAdapter();
			}
			@Override
			public Adapter caseSrcBookTitledEntry(SrcBookTitledEntry object) {
				return createSrcBookTitledEntryAdapter();
			}
			@Override
			public Adapter caseSrcMisc(SrcMisc object) {
				return createSrcMiscAdapter();
			}
			@Override
			public Adapter caseSrcThesisEntry(SrcThesisEntry object) {
				return createSrcThesisEntryAdapter();
			}
			@Override
			public Adapter caseTrgDocBook(TrgDocBook object) {
				return createTrgDocBookAdapter();
			}
			@Override
			public Adapter caseTrgBook(TrgBook object) {
				return createTrgBookAdapter();
			}
			@Override
			public Adapter caseTrgTitledElement(TrgTitledElement object) {
				return createTrgTitledElementAdapter();
			}
			@Override
			public Adapter caseTrgArticle(TrgArticle object) {
				return createTrgArticleAdapter();
			}
			@Override
			public Adapter caseTrgSection(TrgSection object) {
				return createTrgSectionAdapter();
			}
			@Override
			public Adapter caseTrgSect1(TrgSect1 object) {
				return createTrgSect1Adapter();
			}
			@Override
			public Adapter caseTrgSect2(TrgSect2 object) {
				return createTrgSect2Adapter();
			}
			@Override
			public Adapter caseTrgPara(TrgPara object) {
				return createTrgParaAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_BibTeX2DocBook.JointMM <em>Joint MM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_BibTeX2DocBook.JointMM
	 * @generated
	 */
	public Adapter createJointMMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_BibTeX2DocBook.SrcBibTeXFile <em>Src Bib Te XFile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_BibTeX2DocBook.SrcBibTeXFile
	 * @generated
	 */
	public Adapter createSrcBibTeXFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_BibTeX2DocBook.SrcArticle <em>Src Article</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_BibTeX2DocBook.SrcArticle
	 * @generated
	 */
	public Adapter createSrcArticleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_BibTeX2DocBook.SrcTechReport <em>Src Tech Report</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_BibTeX2DocBook.SrcTechReport
	 * @generated
	 */
	public Adapter createSrcTechReportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_BibTeX2DocBook.SrcUnpublished <em>Src Unpublished</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_BibTeX2DocBook.SrcUnpublished
	 * @generated
	 */
	public Adapter createSrcUnpublishedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_BibTeX2DocBook.SrcManual <em>Src Manual</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_BibTeX2DocBook.SrcManual
	 * @generated
	 */
	public Adapter createSrcManualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_BibTeX2DocBook.SrcProceedings <em>Src Proceedings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_BibTeX2DocBook.SrcProceedings
	 * @generated
	 */
	public Adapter createSrcProceedingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_BibTeX2DocBook.SrcInProceedings <em>Src In Proceedings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_BibTeX2DocBook.SrcInProceedings
	 * @generated
	 */
	public Adapter createSrcInProceedingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_BibTeX2DocBook.SrcBooklet <em>Src Booklet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_BibTeX2DocBook.SrcBooklet
	 * @generated
	 */
	public Adapter createSrcBookletAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_BibTeX2DocBook.SrcBook <em>Src Book</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_BibTeX2DocBook.SrcBook
	 * @generated
	 */
	public Adapter createSrcBookAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_BibTeX2DocBook.SrcInCollection <em>Src In Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_BibTeX2DocBook.SrcInCollection
	 * @generated
	 */
	public Adapter createSrcInCollectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_BibTeX2DocBook.SrcInBook <em>Src In Book</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_BibTeX2DocBook.SrcInBook
	 * @generated
	 */
	public Adapter createSrcInBookAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_BibTeX2DocBook.SrcPhDThesis <em>Src Ph DThesis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_BibTeX2DocBook.SrcPhDThesis
	 * @generated
	 */
	public Adapter createSrcPhDThesisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_BibTeX2DocBook.SrcMasterThesis <em>Src Master Thesis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_BibTeX2DocBook.SrcMasterThesis
	 * @generated
	 */
	public Adapter createSrcMasterThesisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_BibTeX2DocBook.SrcAuthor <em>Src Author</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_BibTeX2DocBook.SrcAuthor
	 * @generated
	 */
	public Adapter createSrcAuthorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_BibTeX2DocBook.SrcBibTeXEntry <em>Src Bib Te XEntry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_BibTeX2DocBook.SrcBibTeXEntry
	 * @generated
	 */
	public Adapter createSrcBibTeXEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_BibTeX2DocBook.SrcAuthoredEntry <em>Src Authored Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_BibTeX2DocBook.SrcAuthoredEntry
	 * @generated
	 */
	public Adapter createSrcAuthoredEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_BibTeX2DocBook.SrcDatedEntry <em>Src Dated Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_BibTeX2DocBook.SrcDatedEntry
	 * @generated
	 */
	public Adapter createSrcDatedEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_BibTeX2DocBook.SrcTitledEntry <em>Src Titled Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_BibTeX2DocBook.SrcTitledEntry
	 * @generated
	 */
	public Adapter createSrcTitledEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_BibTeX2DocBook.SrcBookTitledEntry <em>Src Book Titled Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_BibTeX2DocBook.SrcBookTitledEntry
	 * @generated
	 */
	public Adapter createSrcBookTitledEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_BibTeX2DocBook.SrcMisc <em>Src Misc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_BibTeX2DocBook.SrcMisc
	 * @generated
	 */
	public Adapter createSrcMiscAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_BibTeX2DocBook.SrcThesisEntry <em>Src Thesis Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_BibTeX2DocBook.SrcThesisEntry
	 * @generated
	 */
	public Adapter createSrcThesisEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_BibTeX2DocBook.TrgDocBook <em>Trg Doc Book</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_BibTeX2DocBook.TrgDocBook
	 * @generated
	 */
	public Adapter createTrgDocBookAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_BibTeX2DocBook.TrgBook <em>Trg Book</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_BibTeX2DocBook.TrgBook
	 * @generated
	 */
	public Adapter createTrgBookAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_BibTeX2DocBook.TrgTitledElement <em>Trg Titled Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_BibTeX2DocBook.TrgTitledElement
	 * @generated
	 */
	public Adapter createTrgTitledElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_BibTeX2DocBook.TrgArticle <em>Trg Article</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_BibTeX2DocBook.TrgArticle
	 * @generated
	 */
	public Adapter createTrgArticleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_BibTeX2DocBook.TrgSection <em>Trg Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_BibTeX2DocBook.TrgSection
	 * @generated
	 */
	public Adapter createTrgSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_BibTeX2DocBook.TrgSect1 <em>Trg Sect1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_BibTeX2DocBook.TrgSect1
	 * @generated
	 */
	public Adapter createTrgSect1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_BibTeX2DocBook.TrgSect2 <em>Trg Sect2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_BibTeX2DocBook.TrgSect2
	 * @generated
	 */
	public Adapter createTrgSect2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_BibTeX2DocBook.TrgPara <em>Trg Para</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_BibTeX2DocBook.TrgPara
	 * @generated
	 */
	public Adapter createTrgParaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //JointPackage_BibTeX2DocBookAdapterFactory
