/**
 */
package jointPackage_BibTeX2DocBook.impl;

import jointPackage_BibTeX2DocBook.JointMM;
import jointPackage_BibTeX2DocBook.JointPackage_BibTeX2DocBookFactory;
import jointPackage_BibTeX2DocBook.JointPackage_BibTeX2DocBookPackage;
import jointPackage_BibTeX2DocBook.SrcArticle;
import jointPackage_BibTeX2DocBook.SrcAuthor;
import jointPackage_BibTeX2DocBook.SrcAuthoredEntry;
import jointPackage_BibTeX2DocBook.SrcBibTeXEntry;
import jointPackage_BibTeX2DocBook.SrcBibTeXFile;
import jointPackage_BibTeX2DocBook.SrcBook;
import jointPackage_BibTeX2DocBook.SrcBookTitledEntry;
import jointPackage_BibTeX2DocBook.SrcBooklet;
import jointPackage_BibTeX2DocBook.SrcDatedEntry;
import jointPackage_BibTeX2DocBook.SrcInBook;
import jointPackage_BibTeX2DocBook.SrcInCollection;
import jointPackage_BibTeX2DocBook.SrcInProceedings;
import jointPackage_BibTeX2DocBook.SrcManual;
import jointPackage_BibTeX2DocBook.SrcMasterThesis;
import jointPackage_BibTeX2DocBook.SrcMisc;
import jointPackage_BibTeX2DocBook.SrcPhDThesis;
import jointPackage_BibTeX2DocBook.SrcProceedings;
import jointPackage_BibTeX2DocBook.SrcTechReport;
import jointPackage_BibTeX2DocBook.SrcThesisEntry;
import jointPackage_BibTeX2DocBook.SrcTitledEntry;
import jointPackage_BibTeX2DocBook.SrcUnpublished;
import jointPackage_BibTeX2DocBook.TrgArticle;
import jointPackage_BibTeX2DocBook.TrgBook;
import jointPackage_BibTeX2DocBook.TrgDocBook;
import jointPackage_BibTeX2DocBook.TrgPara;
import jointPackage_BibTeX2DocBook.TrgSect1;
import jointPackage_BibTeX2DocBook.TrgSect2;
import jointPackage_BibTeX2DocBook.TrgSection;
import jointPackage_BibTeX2DocBook.TrgTitledElement;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JointPackage_BibTeX2DocBookPackageImpl extends EPackageImpl implements JointPackage_BibTeX2DocBookPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jointMMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcBibTeXFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcArticleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcTechReportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcUnpublishedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcManualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcProceedingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcInProceedingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcBookletEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcBookEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcInCollectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcInBookEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcPhDThesisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcMasterThesisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcAuthorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcBibTeXEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcAuthoredEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcDatedEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcTitledEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcBookTitledEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcMiscEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcThesisEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgDocBookEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgBookEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgTitledElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgArticleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgSect1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgSect2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgParaEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see jointPackage_BibTeX2DocBook.JointPackage_BibTeX2DocBookPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JointPackage_BibTeX2DocBookPackageImpl() {
		super(eNS_URI, JointPackage_BibTeX2DocBookFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link JointPackage_BibTeX2DocBookPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static JointPackage_BibTeX2DocBookPackage init() {
		if (isInited) return (JointPackage_BibTeX2DocBookPackage)EPackage.Registry.INSTANCE.getEPackage(JointPackage_BibTeX2DocBookPackage.eNS_URI);

		// Obtain or create and register package
		JointPackage_BibTeX2DocBookPackageImpl theJointPackage_BibTeX2DocBookPackage = (JointPackage_BibTeX2DocBookPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof JointPackage_BibTeX2DocBookPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new JointPackage_BibTeX2DocBookPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theJointPackage_BibTeX2DocBookPackage.createPackageContents();

		// Initialize created meta-data
		theJointPackage_BibTeX2DocBookPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJointPackage_BibTeX2DocBookPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(JointPackage_BibTeX2DocBookPackage.eNS_URI, theJointPackage_BibTeX2DocBookPackage);
		return theJointPackage_BibTeX2DocBookPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJointMM() {
		return jointMMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJointMM_SourceRoot() {
		return (EReference)jointMMEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJointMM_TargetRoot() {
		return (EReference)jointMMEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcBibTeXFile() {
		return srcBibTeXFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSrcBibTeXFile_Entries() {
		return (EReference)srcBibTeXFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcArticle() {
		return srcArticleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcArticle_Journal() {
		return (EAttribute)srcArticleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcTechReport() {
		return srcTechReportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcUnpublished() {
		return srcUnpublishedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcUnpublished_Note() {
		return (EAttribute)srcUnpublishedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcManual() {
		return srcManualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcProceedings() {
		return srcProceedingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcInProceedings() {
		return srcInProceedingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcBooklet() {
		return srcBookletEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcBook() {
		return srcBookEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcBook_Publisher() {
		return (EAttribute)srcBookEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcInCollection() {
		return srcInCollectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcInBook() {
		return srcInBookEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcInBook_Chapter() {
		return (EAttribute)srcInBookEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcPhDThesis() {
		return srcPhDThesisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcMasterThesis() {
		return srcMasterThesisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcAuthor() {
		return srcAuthorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcAuthor_Author() {
		return (EAttribute)srcAuthorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcBibTeXEntry() {
		return srcBibTeXEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcBibTeXEntry_Id() {
		return (EAttribute)srcBibTeXEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcAuthoredEntry() {
		return srcAuthoredEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSrcAuthoredEntry_Authors() {
		return (EReference)srcAuthoredEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcDatedEntry() {
		return srcDatedEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcDatedEntry_Year() {
		return (EAttribute)srcDatedEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcTitledEntry() {
		return srcTitledEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcTitledEntry_Title() {
		return (EAttribute)srcTitledEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcBookTitledEntry() {
		return srcBookTitledEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcBookTitledEntry_Booktitle() {
		return (EAttribute)srcBookTitledEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcMisc() {
		return srcMiscEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcThesisEntry() {
		return srcThesisEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcThesisEntry_School() {
		return (EAttribute)srcThesisEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgDocBook() {
		return trgDocBookEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgDocBook_Books() {
		return (EReference)trgDocBookEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgBook() {
		return trgBookEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgBook_Articles() {
		return (EReference)trgBookEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgTitledElement() {
		return trgTitledElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrgTitledElement_Title() {
		return (EAttribute)trgTitledElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgArticle() {
		return trgArticleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgArticle_Sections_1() {
		return (EReference)trgArticleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgSection() {
		return trgSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgSection_Paras() {
		return (EReference)trgSectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgSect1() {
		return trgSect1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgSect1_Sections_2() {
		return (EReference)trgSect1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgSect2() {
		return trgSect2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrgPara() {
		return trgParaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrgPara_Content() {
		return (EAttribute)trgParaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrgPara_Section() {
		return (EReference)trgParaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JointPackage_BibTeX2DocBookFactory getJointPackage_BibTeX2DocBookFactory() {
		return (JointPackage_BibTeX2DocBookFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		jointMMEClass = createEClass(JOINT_MM);
		createEReference(jointMMEClass, JOINT_MM__SOURCE_ROOT);
		createEReference(jointMMEClass, JOINT_MM__TARGET_ROOT);

		srcBibTeXFileEClass = createEClass(SRC_BIB_TE_XFILE);
		createEReference(srcBibTeXFileEClass, SRC_BIB_TE_XFILE__ENTRIES);

		srcArticleEClass = createEClass(SRC_ARTICLE);
		createEAttribute(srcArticleEClass, SRC_ARTICLE__JOURNAL);

		srcTechReportEClass = createEClass(SRC_TECH_REPORT);

		srcUnpublishedEClass = createEClass(SRC_UNPUBLISHED);
		createEAttribute(srcUnpublishedEClass, SRC_UNPUBLISHED__NOTE);

		srcManualEClass = createEClass(SRC_MANUAL);

		srcProceedingsEClass = createEClass(SRC_PROCEEDINGS);

		srcInProceedingsEClass = createEClass(SRC_IN_PROCEEDINGS);

		srcBookletEClass = createEClass(SRC_BOOKLET);

		srcBookEClass = createEClass(SRC_BOOK);
		createEAttribute(srcBookEClass, SRC_BOOK__PUBLISHER);

		srcInCollectionEClass = createEClass(SRC_IN_COLLECTION);

		srcInBookEClass = createEClass(SRC_IN_BOOK);
		createEAttribute(srcInBookEClass, SRC_IN_BOOK__CHAPTER);

		srcPhDThesisEClass = createEClass(SRC_PH_DTHESIS);

		srcMasterThesisEClass = createEClass(SRC_MASTER_THESIS);

		srcAuthorEClass = createEClass(SRC_AUTHOR);
		createEAttribute(srcAuthorEClass, SRC_AUTHOR__AUTHOR);

		srcBibTeXEntryEClass = createEClass(SRC_BIB_TE_XENTRY);
		createEAttribute(srcBibTeXEntryEClass, SRC_BIB_TE_XENTRY__ID);

		srcAuthoredEntryEClass = createEClass(SRC_AUTHORED_ENTRY);
		createEReference(srcAuthoredEntryEClass, SRC_AUTHORED_ENTRY__AUTHORS);

		srcDatedEntryEClass = createEClass(SRC_DATED_ENTRY);
		createEAttribute(srcDatedEntryEClass, SRC_DATED_ENTRY__YEAR);

		srcTitledEntryEClass = createEClass(SRC_TITLED_ENTRY);
		createEAttribute(srcTitledEntryEClass, SRC_TITLED_ENTRY__TITLE);

		srcBookTitledEntryEClass = createEClass(SRC_BOOK_TITLED_ENTRY);
		createEAttribute(srcBookTitledEntryEClass, SRC_BOOK_TITLED_ENTRY__BOOKTITLE);

		srcMiscEClass = createEClass(SRC_MISC);

		srcThesisEntryEClass = createEClass(SRC_THESIS_ENTRY);
		createEAttribute(srcThesisEntryEClass, SRC_THESIS_ENTRY__SCHOOL);

		trgDocBookEClass = createEClass(TRG_DOC_BOOK);
		createEReference(trgDocBookEClass, TRG_DOC_BOOK__BOOKS);

		trgBookEClass = createEClass(TRG_BOOK);
		createEReference(trgBookEClass, TRG_BOOK__ARTICLES);

		trgTitledElementEClass = createEClass(TRG_TITLED_ELEMENT);
		createEAttribute(trgTitledElementEClass, TRG_TITLED_ELEMENT__TITLE);

		trgArticleEClass = createEClass(TRG_ARTICLE);
		createEReference(trgArticleEClass, TRG_ARTICLE__SECTIONS_1);

		trgSectionEClass = createEClass(TRG_SECTION);
		createEReference(trgSectionEClass, TRG_SECTION__PARAS);

		trgSect1EClass = createEClass(TRG_SECT1);
		createEReference(trgSect1EClass, TRG_SECT1__SECTIONS_2);

		trgSect2EClass = createEClass(TRG_SECT2);

		trgParaEClass = createEClass(TRG_PARA);
		createEAttribute(trgParaEClass, TRG_PARA__CONTENT);
		createEReference(trgParaEClass, TRG_PARA__SECTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		srcArticleEClass.getESuperTypes().add(this.getSrcAuthoredEntry());
		srcArticleEClass.getESuperTypes().add(this.getSrcDatedEntry());
		srcArticleEClass.getESuperTypes().add(this.getSrcTitledEntry());
		srcTechReportEClass.getESuperTypes().add(this.getSrcAuthoredEntry());
		srcTechReportEClass.getESuperTypes().add(this.getSrcDatedEntry());
		srcTechReportEClass.getESuperTypes().add(this.getSrcTitledEntry());
		srcUnpublishedEClass.getESuperTypes().add(this.getSrcAuthoredEntry());
		srcUnpublishedEClass.getESuperTypes().add(this.getSrcTitledEntry());
		srcManualEClass.getESuperTypes().add(this.getSrcTitledEntry());
		srcProceedingsEClass.getESuperTypes().add(this.getSrcDatedEntry());
		srcProceedingsEClass.getESuperTypes().add(this.getSrcTitledEntry());
		srcInProceedingsEClass.getESuperTypes().add(this.getSrcProceedings());
		srcInProceedingsEClass.getESuperTypes().add(this.getSrcAuthoredEntry());
		srcInProceedingsEClass.getESuperTypes().add(this.getSrcBookTitledEntry());
		srcBookletEClass.getESuperTypes().add(this.getSrcDatedEntry());
		srcBookEClass.getESuperTypes().add(this.getSrcAuthoredEntry());
		srcBookEClass.getESuperTypes().add(this.getSrcDatedEntry());
		srcBookEClass.getESuperTypes().add(this.getSrcTitledEntry());
		srcInCollectionEClass.getESuperTypes().add(this.getSrcBook());
		srcInCollectionEClass.getESuperTypes().add(this.getSrcBookTitledEntry());
		srcInBookEClass.getESuperTypes().add(this.getSrcBook());
		srcPhDThesisEClass.getESuperTypes().add(this.getSrcThesisEntry());
		srcMasterThesisEClass.getESuperTypes().add(this.getSrcThesisEntry());
		srcAuthoredEntryEClass.getESuperTypes().add(this.getSrcBibTeXEntry());
		srcDatedEntryEClass.getESuperTypes().add(this.getSrcBibTeXEntry());
		srcTitledEntryEClass.getESuperTypes().add(this.getSrcBibTeXEntry());
		srcBookTitledEntryEClass.getESuperTypes().add(this.getSrcBibTeXEntry());
		srcMiscEClass.getESuperTypes().add(this.getSrcBibTeXEntry());
		srcThesisEntryEClass.getESuperTypes().add(this.getSrcAuthoredEntry());
		srcThesisEntryEClass.getESuperTypes().add(this.getSrcDatedEntry());
		srcThesisEntryEClass.getESuperTypes().add(this.getSrcTitledEntry());
		trgArticleEClass.getESuperTypes().add(this.getTrgTitledElement());
		trgSectionEClass.getESuperTypes().add(this.getTrgTitledElement());
		trgSect1EClass.getESuperTypes().add(this.getTrgSection());
		trgSect2EClass.getESuperTypes().add(this.getTrgSection());

		// Initialize classes, features, and operations; add parameters
		initEClass(jointMMEClass, JointMM.class, "JointMM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJointMM_SourceRoot(), this.getSrcMasterThesis(), null, "sourceRoot", null, 1, 1, JointMM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJointMM_TargetRoot(), this.getTrgDocBook(), null, "targetRoot", null, 1, 1, JointMM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(srcBibTeXFileEClass, SrcBibTeXFile.class, "SrcBibTeXFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSrcBibTeXFile_Entries(), this.getSrcBibTeXEntry(), null, "entries", null, 0, -1, SrcBibTeXFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(srcArticleEClass, SrcArticle.class, "SrcArticle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSrcArticle_Journal(), ecorePackage.getEString(), "journal", null, 1, 1, SrcArticle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(srcTechReportEClass, SrcTechReport.class, "SrcTechReport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(srcUnpublishedEClass, SrcUnpublished.class, "SrcUnpublished", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSrcUnpublished_Note(), ecorePackage.getEString(), "note", null, 1, 1, SrcUnpublished.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(srcManualEClass, SrcManual.class, "SrcManual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(srcProceedingsEClass, SrcProceedings.class, "SrcProceedings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(srcInProceedingsEClass, SrcInProceedings.class, "SrcInProceedings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(srcBookletEClass, SrcBooklet.class, "SrcBooklet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(srcBookEClass, SrcBook.class, "SrcBook", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSrcBook_Publisher(), ecorePackage.getEString(), "publisher", null, 1, 1, SrcBook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(srcInCollectionEClass, SrcInCollection.class, "SrcInCollection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(srcInBookEClass, SrcInBook.class, "SrcInBook", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSrcInBook_Chapter(), ecorePackage.getEInt(), "chapter", null, 1, 1, SrcInBook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(srcPhDThesisEClass, SrcPhDThesis.class, "SrcPhDThesis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(srcMasterThesisEClass, SrcMasterThesis.class, "SrcMasterThesis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(srcAuthorEClass, SrcAuthor.class, "SrcAuthor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSrcAuthor_Author(), ecorePackage.getEString(), "author", null, 1, 1, SrcAuthor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(srcBibTeXEntryEClass, SrcBibTeXEntry.class, "SrcBibTeXEntry", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSrcBibTeXEntry_Id(), ecorePackage.getEString(), "id", null, 1, 1, SrcBibTeXEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(srcAuthoredEntryEClass, SrcAuthoredEntry.class, "SrcAuthoredEntry", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSrcAuthoredEntry_Authors(), this.getSrcAuthor(), null, "authors", null, 1, -1, SrcAuthoredEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(srcDatedEntryEClass, SrcDatedEntry.class, "SrcDatedEntry", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSrcDatedEntry_Year(), ecorePackage.getEString(), "year", null, 1, 1, SrcDatedEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(srcTitledEntryEClass, SrcTitledEntry.class, "SrcTitledEntry", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSrcTitledEntry_Title(), ecorePackage.getEString(), "title", null, 1, 1, SrcTitledEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(srcBookTitledEntryEClass, SrcBookTitledEntry.class, "SrcBookTitledEntry", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSrcBookTitledEntry_Booktitle(), ecorePackage.getEString(), "booktitle", null, 1, 1, SrcBookTitledEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(srcMiscEClass, SrcMisc.class, "SrcMisc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(srcThesisEntryEClass, SrcThesisEntry.class, "SrcThesisEntry", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSrcThesisEntry_School(), ecorePackage.getEString(), "school", null, 1, 1, SrcThesisEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgDocBookEClass, TrgDocBook.class, "TrgDocBook", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgDocBook_Books(), this.getTrgBook(), null, "books", null, 1, -1, TrgDocBook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trgBookEClass, TrgBook.class, "TrgBook", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgBook_Articles(), this.getTrgArticle(), null, "articles", null, 1, -1, TrgBook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trgTitledElementEClass, TrgTitledElement.class, "TrgTitledElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrgTitledElement_Title(), ecorePackage.getEString(), "title", null, 1, 1, TrgTitledElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgArticleEClass, TrgArticle.class, "TrgArticle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgArticle_Sections_1(), this.getTrgSect1(), null, "sections_1", null, 1, -1, TrgArticle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trgSectionEClass, TrgSection.class, "TrgSection", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgSection_Paras(), this.getTrgPara(), this.getTrgPara_Section(), "paras", null, 1, -1, TrgSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trgSect1EClass, TrgSect1.class, "TrgSect1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgSect1_Sections_2(), this.getTrgSect2(), null, "sections_2", null, 1, -1, TrgSect1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trgSect2EClass, TrgSect2.class, "TrgSect2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(trgParaEClass, TrgPara.class, "TrgPara", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrgPara_Content(), ecorePackage.getEString(), "content", null, 1, 1, TrgPara.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrgPara_Section(), this.getTrgSection(), this.getTrgSection_Paras(), "section", null, 1, 1, TrgPara.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //JointPackage_BibTeX2DocBookPackageImpl
