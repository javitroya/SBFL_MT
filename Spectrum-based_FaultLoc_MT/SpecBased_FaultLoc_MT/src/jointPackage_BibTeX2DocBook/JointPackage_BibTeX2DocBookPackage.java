/**
 */
package jointPackage_BibTeX2DocBook;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see jointPackage_BibTeX2DocBook.JointPackage_BibTeX2DocBookFactory
 * @model kind="package"
 * @generated
 */
public interface JointPackage_BibTeX2DocBookPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "jointPackage_BibTeX2DocBook";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://jointPackage_bibtex2docbook/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "jointPackage_BibTeX2DocBook";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JointPackage_BibTeX2DocBookPackage eINSTANCE = jointPackage_BibTeX2DocBook.impl.JointPackage_BibTeX2DocBookPackageImpl.init();

	/**
	 * The meta object id for the '{@link jointPackage_BibTeX2DocBook.impl.JointMMImpl <em>Joint MM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_BibTeX2DocBook.impl.JointMMImpl
	 * @see jointPackage_BibTeX2DocBook.impl.JointPackage_BibTeX2DocBookPackageImpl#getJointMM()
	 * @generated
	 */
	int JOINT_MM = 0;

	/**
	 * The feature id for the '<em><b>Source Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_MM__SOURCE_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Target Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_MM__TARGET_ROOT = 1;

	/**
	 * The number of structural features of the '<em>Joint MM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_MM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Joint MM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_MM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jointPackage_BibTeX2DocBook.impl.SrcBibTeXFileImpl <em>Src Bib Te XFile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_BibTeX2DocBook.impl.SrcBibTeXFileImpl
	 * @see jointPackage_BibTeX2DocBook.impl.JointPackage_BibTeX2DocBookPackageImpl#getSrcBibTeXFile()
	 * @generated
	 */
	int SRC_BIB_TE_XFILE = 1;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_BIB_TE_XFILE__ENTRIES = 0;

	/**
	 * The number of structural features of the '<em>Src Bib Te XFile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_BIB_TE_XFILE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Src Bib Te XFile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_BIB_TE_XFILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jointPackage_BibTeX2DocBook.impl.SrcBibTeXEntryImpl <em>Src Bib Te XEntry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_BibTeX2DocBook.impl.SrcBibTeXEntryImpl
	 * @see jointPackage_BibTeX2DocBook.impl.JointPackage_BibTeX2DocBookPackageImpl#getSrcBibTeXEntry()
	 * @generated
	 */
	int SRC_BIB_TE_XENTRY = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_BIB_TE_XENTRY__ID = 0;

	/**
	 * The number of structural features of the '<em>Src Bib Te XEntry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_BIB_TE_XENTRY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Src Bib Te XEntry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_BIB_TE_XENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jointPackage_BibTeX2DocBook.impl.SrcAuthoredEntryImpl <em>Src Authored Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_BibTeX2DocBook.impl.SrcAuthoredEntryImpl
	 * @see jointPackage_BibTeX2DocBook.impl.JointPackage_BibTeX2DocBookPackageImpl#getSrcAuthoredEntry()
	 * @generated
	 */
	int SRC_AUTHORED_ENTRY = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_AUTHORED_ENTRY__ID = SRC_BIB_TE_XENTRY__ID;

	/**
	 * The feature id for the '<em><b>Authors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_AUTHORED_ENTRY__AUTHORS = SRC_BIB_TE_XENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Src Authored Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_AUTHORED_ENTRY_FEATURE_COUNT = SRC_BIB_TE_XENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Src Authored Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_AUTHORED_ENTRY_OPERATION_COUNT = SRC_BIB_TE_XENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_BibTeX2DocBook.impl.SrcArticleImpl <em>Src Article</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_BibTeX2DocBook.impl.SrcArticleImpl
	 * @see jointPackage_BibTeX2DocBook.impl.JointPackage_BibTeX2DocBookPackageImpl#getSrcArticle()
	 * @generated
	 */
	int SRC_ARTICLE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ARTICLE__ID = SRC_AUTHORED_ENTRY__ID;

	/**
	 * The feature id for the '<em><b>Authors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ARTICLE__AUTHORS = SRC_AUTHORED_ENTRY__AUTHORS;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ARTICLE__YEAR = SRC_AUTHORED_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ARTICLE__TITLE = SRC_AUTHORED_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Journal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ARTICLE__JOURNAL = SRC_AUTHORED_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Src Article</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ARTICLE_FEATURE_COUNT = SRC_AUTHORED_ENTRY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Src Article</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ARTICLE_OPERATION_COUNT = SRC_AUTHORED_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_BibTeX2DocBook.impl.SrcTechReportImpl <em>Src Tech Report</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_BibTeX2DocBook.impl.SrcTechReportImpl
	 * @see jointPackage_BibTeX2DocBook.impl.JointPackage_BibTeX2DocBookPackageImpl#getSrcTechReport()
	 * @generated
	 */
	int SRC_TECH_REPORT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_TECH_REPORT__ID = SRC_AUTHORED_ENTRY__ID;

	/**
	 * The feature id for the '<em><b>Authors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_TECH_REPORT__AUTHORS = SRC_AUTHORED_ENTRY__AUTHORS;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_TECH_REPORT__YEAR = SRC_AUTHORED_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_TECH_REPORT__TITLE = SRC_AUTHORED_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Src Tech Report</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_TECH_REPORT_FEATURE_COUNT = SRC_AUTHORED_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Src Tech Report</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_TECH_REPORT_OPERATION_COUNT = SRC_AUTHORED_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_BibTeX2DocBook.impl.SrcUnpublishedImpl <em>Src Unpublished</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_BibTeX2DocBook.impl.SrcUnpublishedImpl
	 * @see jointPackage_BibTeX2DocBook.impl.JointPackage_BibTeX2DocBookPackageImpl#getSrcUnpublished()
	 * @generated
	 */
	int SRC_UNPUBLISHED = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_UNPUBLISHED__ID = SRC_AUTHORED_ENTRY__ID;

	/**
	 * The feature id for the '<em><b>Authors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_UNPUBLISHED__AUTHORS = SRC_AUTHORED_ENTRY__AUTHORS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_UNPUBLISHED__TITLE = SRC_AUTHORED_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_UNPUBLISHED__NOTE = SRC_AUTHORED_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Src Unpublished</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_UNPUBLISHED_FEATURE_COUNT = SRC_AUTHORED_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Src Unpublished</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_UNPUBLISHED_OPERATION_COUNT = SRC_AUTHORED_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_BibTeX2DocBook.impl.SrcTitledEntryImpl <em>Src Titled Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_BibTeX2DocBook.impl.SrcTitledEntryImpl
	 * @see jointPackage_BibTeX2DocBook.impl.JointPackage_BibTeX2DocBookPackageImpl#getSrcTitledEntry()
	 * @generated
	 */
	int SRC_TITLED_ENTRY = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_TITLED_ENTRY__ID = SRC_BIB_TE_XENTRY__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_TITLED_ENTRY__TITLE = SRC_BIB_TE_XENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Src Titled Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_TITLED_ENTRY_FEATURE_COUNT = SRC_BIB_TE_XENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Src Titled Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_TITLED_ENTRY_OPERATION_COUNT = SRC_BIB_TE_XENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_BibTeX2DocBook.impl.SrcManualImpl <em>Src Manual</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_BibTeX2DocBook.impl.SrcManualImpl
	 * @see jointPackage_BibTeX2DocBook.impl.JointPackage_BibTeX2DocBookPackageImpl#getSrcManual()
	 * @generated
	 */
	int SRC_MANUAL = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_MANUAL__ID = SRC_TITLED_ENTRY__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_MANUAL__TITLE = SRC_TITLED_ENTRY__TITLE;

	/**
	 * The number of structural features of the '<em>Src Manual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_MANUAL_FEATURE_COUNT = SRC_TITLED_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Src Manual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_MANUAL_OPERATION_COUNT = SRC_TITLED_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_BibTeX2DocBook.impl.SrcDatedEntryImpl <em>Src Dated Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_BibTeX2DocBook.impl.SrcDatedEntryImpl
	 * @see jointPackage_BibTeX2DocBook.impl.JointPackage_BibTeX2DocBookPackageImpl#getSrcDatedEntry()
	 * @generated
	 */
	int SRC_DATED_ENTRY = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_DATED_ENTRY__ID = SRC_BIB_TE_XENTRY__ID;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_DATED_ENTRY__YEAR = SRC_BIB_TE_XENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Src Dated Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_DATED_ENTRY_FEATURE_COUNT = SRC_BIB_TE_XENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Src Dated Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_DATED_ENTRY_OPERATION_COUNT = SRC_BIB_TE_XENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_BibTeX2DocBook.impl.SrcProceedingsImpl <em>Src Proceedings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_BibTeX2DocBook.impl.SrcProceedingsImpl
	 * @see jointPackage_BibTeX2DocBook.impl.JointPackage_BibTeX2DocBookPackageImpl#getSrcProceedings()
	 * @generated
	 */
	int SRC_PROCEEDINGS = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PROCEEDINGS__ID = SRC_DATED_ENTRY__ID;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PROCEEDINGS__YEAR = SRC_DATED_ENTRY__YEAR;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PROCEEDINGS__TITLE = SRC_DATED_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Src Proceedings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PROCEEDINGS_FEATURE_COUNT = SRC_DATED_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Src Proceedings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PROCEEDINGS_OPERATION_COUNT = SRC_DATED_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_BibTeX2DocBook.impl.SrcInProceedingsImpl <em>Src In Proceedings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_BibTeX2DocBook.impl.SrcInProceedingsImpl
	 * @see jointPackage_BibTeX2DocBook.impl.JointPackage_BibTeX2DocBookPackageImpl#getSrcInProceedings()
	 * @generated
	 */
	int SRC_IN_PROCEEDINGS = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_IN_PROCEEDINGS__ID = SRC_PROCEEDINGS__ID;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_IN_PROCEEDINGS__YEAR = SRC_PROCEEDINGS__YEAR;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_IN_PROCEEDINGS__TITLE = SRC_PROCEEDINGS__TITLE;

	/**
	 * The feature id for the '<em><b>Authors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_IN_PROCEEDINGS__AUTHORS = SRC_PROCEEDINGS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Booktitle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_IN_PROCEEDINGS__BOOKTITLE = SRC_PROCEEDINGS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Src In Proceedings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_IN_PROCEEDINGS_FEATURE_COUNT = SRC_PROCEEDINGS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Src In Proceedings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_IN_PROCEEDINGS_OPERATION_COUNT = SRC_PROCEEDINGS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_BibTeX2DocBook.impl.SrcBookletImpl <em>Src Booklet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_BibTeX2DocBook.impl.SrcBookletImpl
	 * @see jointPackage_BibTeX2DocBook.impl.JointPackage_BibTeX2DocBookPackageImpl#getSrcBooklet()
	 * @generated
	 */
	int SRC_BOOKLET = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_BOOKLET__ID = SRC_DATED_ENTRY__ID;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_BOOKLET__YEAR = SRC_DATED_ENTRY__YEAR;

	/**
	 * The number of structural features of the '<em>Src Booklet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_BOOKLET_FEATURE_COUNT = SRC_DATED_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Src Booklet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_BOOKLET_OPERATION_COUNT = SRC_DATED_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_BibTeX2DocBook.impl.SrcBookImpl <em>Src Book</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_BibTeX2DocBook.impl.SrcBookImpl
	 * @see jointPackage_BibTeX2DocBook.impl.JointPackage_BibTeX2DocBookPackageImpl#getSrcBook()
	 * @generated
	 */
	int SRC_BOOK = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_BOOK__ID = SRC_AUTHORED_ENTRY__ID;

	/**
	 * The feature id for the '<em><b>Authors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_BOOK__AUTHORS = SRC_AUTHORED_ENTRY__AUTHORS;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_BOOK__YEAR = SRC_AUTHORED_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_BOOK__TITLE = SRC_AUTHORED_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_BOOK__PUBLISHER = SRC_AUTHORED_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Src Book</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_BOOK_FEATURE_COUNT = SRC_AUTHORED_ENTRY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Src Book</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_BOOK_OPERATION_COUNT = SRC_AUTHORED_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_BibTeX2DocBook.impl.SrcInCollectionImpl <em>Src In Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_BibTeX2DocBook.impl.SrcInCollectionImpl
	 * @see jointPackage_BibTeX2DocBook.impl.JointPackage_BibTeX2DocBookPackageImpl#getSrcInCollection()
	 * @generated
	 */
	int SRC_IN_COLLECTION = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_IN_COLLECTION__ID = SRC_BOOK__ID;

	/**
	 * The feature id for the '<em><b>Authors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_IN_COLLECTION__AUTHORS = SRC_BOOK__AUTHORS;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_IN_COLLECTION__YEAR = SRC_BOOK__YEAR;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_IN_COLLECTION__TITLE = SRC_BOOK__TITLE;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_IN_COLLECTION__PUBLISHER = SRC_BOOK__PUBLISHER;

	/**
	 * The feature id for the '<em><b>Booktitle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_IN_COLLECTION__BOOKTITLE = SRC_BOOK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Src In Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_IN_COLLECTION_FEATURE_COUNT = SRC_BOOK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Src In Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_IN_COLLECTION_OPERATION_COUNT = SRC_BOOK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_BibTeX2DocBook.impl.SrcInBookImpl <em>Src In Book</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_BibTeX2DocBook.impl.SrcInBookImpl
	 * @see jointPackage_BibTeX2DocBook.impl.JointPackage_BibTeX2DocBookPackageImpl#getSrcInBook()
	 * @generated
	 */
	int SRC_IN_BOOK = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_IN_BOOK__ID = SRC_BOOK__ID;

	/**
	 * The feature id for the '<em><b>Authors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_IN_BOOK__AUTHORS = SRC_BOOK__AUTHORS;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_IN_BOOK__YEAR = SRC_BOOK__YEAR;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_IN_BOOK__TITLE = SRC_BOOK__TITLE;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_IN_BOOK__PUBLISHER = SRC_BOOK__PUBLISHER;

	/**
	 * The feature id for the '<em><b>Chapter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_IN_BOOK__CHAPTER = SRC_BOOK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Src In Book</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_IN_BOOK_FEATURE_COUNT = SRC_BOOK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Src In Book</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_IN_BOOK_OPERATION_COUNT = SRC_BOOK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_BibTeX2DocBook.impl.SrcThesisEntryImpl <em>Src Thesis Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_BibTeX2DocBook.impl.SrcThesisEntryImpl
	 * @see jointPackage_BibTeX2DocBook.impl.JointPackage_BibTeX2DocBookPackageImpl#getSrcThesisEntry()
	 * @generated
	 */
	int SRC_THESIS_ENTRY = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_THESIS_ENTRY__ID = SRC_AUTHORED_ENTRY__ID;

	/**
	 * The feature id for the '<em><b>Authors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_THESIS_ENTRY__AUTHORS = SRC_AUTHORED_ENTRY__AUTHORS;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_THESIS_ENTRY__YEAR = SRC_AUTHORED_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_THESIS_ENTRY__TITLE = SRC_AUTHORED_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>School</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_THESIS_ENTRY__SCHOOL = SRC_AUTHORED_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Src Thesis Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_THESIS_ENTRY_FEATURE_COUNT = SRC_AUTHORED_ENTRY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Src Thesis Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_THESIS_ENTRY_OPERATION_COUNT = SRC_AUTHORED_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_BibTeX2DocBook.impl.SrcPhDThesisImpl <em>Src Ph DThesis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_BibTeX2DocBook.impl.SrcPhDThesisImpl
	 * @see jointPackage_BibTeX2DocBook.impl.JointPackage_BibTeX2DocBookPackageImpl#getSrcPhDThesis()
	 * @generated
	 */
	int SRC_PH_DTHESIS = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PH_DTHESIS__ID = SRC_THESIS_ENTRY__ID;

	/**
	 * The feature id for the '<em><b>Authors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PH_DTHESIS__AUTHORS = SRC_THESIS_ENTRY__AUTHORS;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PH_DTHESIS__YEAR = SRC_THESIS_ENTRY__YEAR;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PH_DTHESIS__TITLE = SRC_THESIS_ENTRY__TITLE;

	/**
	 * The feature id for the '<em><b>School</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PH_DTHESIS__SCHOOL = SRC_THESIS_ENTRY__SCHOOL;

	/**
	 * The number of structural features of the '<em>Src Ph DThesis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PH_DTHESIS_FEATURE_COUNT = SRC_THESIS_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Src Ph DThesis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_PH_DTHESIS_OPERATION_COUNT = SRC_THESIS_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_BibTeX2DocBook.impl.SrcMasterThesisImpl <em>Src Master Thesis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_BibTeX2DocBook.impl.SrcMasterThesisImpl
	 * @see jointPackage_BibTeX2DocBook.impl.JointPackage_BibTeX2DocBookPackageImpl#getSrcMasterThesis()
	 * @generated
	 */
	int SRC_MASTER_THESIS = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_MASTER_THESIS__ID = SRC_THESIS_ENTRY__ID;

	/**
	 * The feature id for the '<em><b>Authors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_MASTER_THESIS__AUTHORS = SRC_THESIS_ENTRY__AUTHORS;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_MASTER_THESIS__YEAR = SRC_THESIS_ENTRY__YEAR;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_MASTER_THESIS__TITLE = SRC_THESIS_ENTRY__TITLE;

	/**
	 * The feature id for the '<em><b>School</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_MASTER_THESIS__SCHOOL = SRC_THESIS_ENTRY__SCHOOL;

	/**
	 * The number of structural features of the '<em>Src Master Thesis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_MASTER_THESIS_FEATURE_COUNT = SRC_THESIS_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Src Master Thesis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_MASTER_THESIS_OPERATION_COUNT = SRC_THESIS_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_BibTeX2DocBook.impl.SrcAuthorImpl <em>Src Author</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_BibTeX2DocBook.impl.SrcAuthorImpl
	 * @see jointPackage_BibTeX2DocBook.impl.JointPackage_BibTeX2DocBookPackageImpl#getSrcAuthor()
	 * @generated
	 */
	int SRC_AUTHOR = 14;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_AUTHOR__AUTHOR = 0;

	/**
	 * The number of structural features of the '<em>Src Author</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_AUTHOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Src Author</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_AUTHOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jointPackage_BibTeX2DocBook.impl.SrcBookTitledEntryImpl <em>Src Book Titled Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_BibTeX2DocBook.impl.SrcBookTitledEntryImpl
	 * @see jointPackage_BibTeX2DocBook.impl.JointPackage_BibTeX2DocBookPackageImpl#getSrcBookTitledEntry()
	 * @generated
	 */
	int SRC_BOOK_TITLED_ENTRY = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_BOOK_TITLED_ENTRY__ID = SRC_BIB_TE_XENTRY__ID;

	/**
	 * The feature id for the '<em><b>Booktitle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_BOOK_TITLED_ENTRY__BOOKTITLE = SRC_BIB_TE_XENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Src Book Titled Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_BOOK_TITLED_ENTRY_FEATURE_COUNT = SRC_BIB_TE_XENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Src Book Titled Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_BOOK_TITLED_ENTRY_OPERATION_COUNT = SRC_BIB_TE_XENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_BibTeX2DocBook.impl.SrcMiscImpl <em>Src Misc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_BibTeX2DocBook.impl.SrcMiscImpl
	 * @see jointPackage_BibTeX2DocBook.impl.JointPackage_BibTeX2DocBookPackageImpl#getSrcMisc()
	 * @generated
	 */
	int SRC_MISC = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_MISC__ID = SRC_BIB_TE_XENTRY__ID;

	/**
	 * The number of structural features of the '<em>Src Misc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_MISC_FEATURE_COUNT = SRC_BIB_TE_XENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Src Misc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_MISC_OPERATION_COUNT = SRC_BIB_TE_XENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_BibTeX2DocBook.impl.TrgDocBookImpl <em>Trg Doc Book</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_BibTeX2DocBook.impl.TrgDocBookImpl
	 * @see jointPackage_BibTeX2DocBook.impl.JointPackage_BibTeX2DocBookPackageImpl#getTrgDocBook()
	 * @generated
	 */
	int TRG_DOC_BOOK = 22;

	/**
	 * The feature id for the '<em><b>Books</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_DOC_BOOK__BOOKS = 0;

	/**
	 * The number of structural features of the '<em>Trg Doc Book</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_DOC_BOOK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Trg Doc Book</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_DOC_BOOK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jointPackage_BibTeX2DocBook.impl.TrgBookImpl <em>Trg Book</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_BibTeX2DocBook.impl.TrgBookImpl
	 * @see jointPackage_BibTeX2DocBook.impl.JointPackage_BibTeX2DocBookPackageImpl#getTrgBook()
	 * @generated
	 */
	int TRG_BOOK = 23;

	/**
	 * The feature id for the '<em><b>Articles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_BOOK__ARTICLES = 0;

	/**
	 * The number of structural features of the '<em>Trg Book</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_BOOK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Trg Book</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_BOOK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jointPackage_BibTeX2DocBook.impl.TrgTitledElementImpl <em>Trg Titled Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_BibTeX2DocBook.impl.TrgTitledElementImpl
	 * @see jointPackage_BibTeX2DocBook.impl.JointPackage_BibTeX2DocBookPackageImpl#getTrgTitledElement()
	 * @generated
	 */
	int TRG_TITLED_ELEMENT = 24;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_TITLED_ELEMENT__TITLE = 0;

	/**
	 * The number of structural features of the '<em>Trg Titled Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_TITLED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Trg Titled Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_TITLED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jointPackage_BibTeX2DocBook.impl.TrgArticleImpl <em>Trg Article</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_BibTeX2DocBook.impl.TrgArticleImpl
	 * @see jointPackage_BibTeX2DocBook.impl.JointPackage_BibTeX2DocBookPackageImpl#getTrgArticle()
	 * @generated
	 */
	int TRG_ARTICLE = 25;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_ARTICLE__TITLE = TRG_TITLED_ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Sections 1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_ARTICLE__SECTIONS_1 = TRG_TITLED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trg Article</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_ARTICLE_FEATURE_COUNT = TRG_TITLED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trg Article</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_ARTICLE_OPERATION_COUNT = TRG_TITLED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_BibTeX2DocBook.impl.TrgSectionImpl <em>Trg Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_BibTeX2DocBook.impl.TrgSectionImpl
	 * @see jointPackage_BibTeX2DocBook.impl.JointPackage_BibTeX2DocBookPackageImpl#getTrgSection()
	 * @generated
	 */
	int TRG_SECTION = 26;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SECTION__TITLE = TRG_TITLED_ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Paras</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SECTION__PARAS = TRG_TITLED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trg Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SECTION_FEATURE_COUNT = TRG_TITLED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trg Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SECTION_OPERATION_COUNT = TRG_TITLED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_BibTeX2DocBook.impl.TrgSect1Impl <em>Trg Sect1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_BibTeX2DocBook.impl.TrgSect1Impl
	 * @see jointPackage_BibTeX2DocBook.impl.JointPackage_BibTeX2DocBookPackageImpl#getTrgSect1()
	 * @generated
	 */
	int TRG_SECT1 = 27;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SECT1__TITLE = TRG_SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Paras</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SECT1__PARAS = TRG_SECTION__PARAS;

	/**
	 * The feature id for the '<em><b>Sections 2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SECT1__SECTIONS_2 = TRG_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trg Sect1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SECT1_FEATURE_COUNT = TRG_SECTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trg Sect1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SECT1_OPERATION_COUNT = TRG_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_BibTeX2DocBook.impl.TrgSect2Impl <em>Trg Sect2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_BibTeX2DocBook.impl.TrgSect2Impl
	 * @see jointPackage_BibTeX2DocBook.impl.JointPackage_BibTeX2DocBookPackageImpl#getTrgSect2()
	 * @generated
	 */
	int TRG_SECT2 = 28;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SECT2__TITLE = TRG_SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Paras</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SECT2__PARAS = TRG_SECTION__PARAS;

	/**
	 * The number of structural features of the '<em>Trg Sect2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SECT2_FEATURE_COUNT = TRG_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Trg Sect2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_SECT2_OPERATION_COUNT = TRG_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_BibTeX2DocBook.impl.TrgParaImpl <em>Trg Para</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_BibTeX2DocBook.impl.TrgParaImpl
	 * @see jointPackage_BibTeX2DocBook.impl.JointPackage_BibTeX2DocBookPackageImpl#getTrgPara()
	 * @generated
	 */
	int TRG_PARA = 29;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_PARA__CONTENT = 0;

	/**
	 * The feature id for the '<em><b>Section</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_PARA__SECTION = 1;

	/**
	 * The number of structural features of the '<em>Trg Para</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_PARA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Trg Para</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_PARA_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link jointPackage_BibTeX2DocBook.JointMM <em>Joint MM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Joint MM</em>'.
	 * @see jointPackage_BibTeX2DocBook.JointMM
	 * @generated
	 */
	EClass getJointMM();

	/**
	 * Returns the meta object for the containment reference '{@link jointPackage_BibTeX2DocBook.JointMM#getSourceRoot <em>Source Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Root</em>'.
	 * @see jointPackage_BibTeX2DocBook.JointMM#getSourceRoot()
	 * @see #getJointMM()
	 * @generated
	 */
	EReference getJointMM_SourceRoot();

	/**
	 * Returns the meta object for the containment reference '{@link jointPackage_BibTeX2DocBook.JointMM#getTargetRoot <em>Target Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Root</em>'.
	 * @see jointPackage_BibTeX2DocBook.JointMM#getTargetRoot()
	 * @see #getJointMM()
	 * @generated
	 */
	EReference getJointMM_TargetRoot();

	/**
	 * Returns the meta object for class '{@link jointPackage_BibTeX2DocBook.SrcBibTeXFile <em>Src Bib Te XFile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src Bib Te XFile</em>'.
	 * @see jointPackage_BibTeX2DocBook.SrcBibTeXFile
	 * @generated
	 */
	EClass getSrcBibTeXFile();

	/**
	 * Returns the meta object for the containment reference list '{@link jointPackage_BibTeX2DocBook.SrcBibTeXFile#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see jointPackage_BibTeX2DocBook.SrcBibTeXFile#getEntries()
	 * @see #getSrcBibTeXFile()
	 * @generated
	 */
	EReference getSrcBibTeXFile_Entries();

	/**
	 * Returns the meta object for class '{@link jointPackage_BibTeX2DocBook.SrcArticle <em>Src Article</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src Article</em>'.
	 * @see jointPackage_BibTeX2DocBook.SrcArticle
	 * @generated
	 */
	EClass getSrcArticle();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_BibTeX2DocBook.SrcArticle#getJournal <em>Journal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Journal</em>'.
	 * @see jointPackage_BibTeX2DocBook.SrcArticle#getJournal()
	 * @see #getSrcArticle()
	 * @generated
	 */
	EAttribute getSrcArticle_Journal();

	/**
	 * Returns the meta object for class '{@link jointPackage_BibTeX2DocBook.SrcTechReport <em>Src Tech Report</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src Tech Report</em>'.
	 * @see jointPackage_BibTeX2DocBook.SrcTechReport
	 * @generated
	 */
	EClass getSrcTechReport();

	/**
	 * Returns the meta object for class '{@link jointPackage_BibTeX2DocBook.SrcUnpublished <em>Src Unpublished</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src Unpublished</em>'.
	 * @see jointPackage_BibTeX2DocBook.SrcUnpublished
	 * @generated
	 */
	EClass getSrcUnpublished();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_BibTeX2DocBook.SrcUnpublished#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Note</em>'.
	 * @see jointPackage_BibTeX2DocBook.SrcUnpublished#getNote()
	 * @see #getSrcUnpublished()
	 * @generated
	 */
	EAttribute getSrcUnpublished_Note();

	/**
	 * Returns the meta object for class '{@link jointPackage_BibTeX2DocBook.SrcManual <em>Src Manual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src Manual</em>'.
	 * @see jointPackage_BibTeX2DocBook.SrcManual
	 * @generated
	 */
	EClass getSrcManual();

	/**
	 * Returns the meta object for class '{@link jointPackage_BibTeX2DocBook.SrcProceedings <em>Src Proceedings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src Proceedings</em>'.
	 * @see jointPackage_BibTeX2DocBook.SrcProceedings
	 * @generated
	 */
	EClass getSrcProceedings();

	/**
	 * Returns the meta object for class '{@link jointPackage_BibTeX2DocBook.SrcInProceedings <em>Src In Proceedings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src In Proceedings</em>'.
	 * @see jointPackage_BibTeX2DocBook.SrcInProceedings
	 * @generated
	 */
	EClass getSrcInProceedings();

	/**
	 * Returns the meta object for class '{@link jointPackage_BibTeX2DocBook.SrcBooklet <em>Src Booklet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src Booklet</em>'.
	 * @see jointPackage_BibTeX2DocBook.SrcBooklet
	 * @generated
	 */
	EClass getSrcBooklet();

	/**
	 * Returns the meta object for class '{@link jointPackage_BibTeX2DocBook.SrcBook <em>Src Book</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src Book</em>'.
	 * @see jointPackage_BibTeX2DocBook.SrcBook
	 * @generated
	 */
	EClass getSrcBook();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_BibTeX2DocBook.SrcBook#getPublisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publisher</em>'.
	 * @see jointPackage_BibTeX2DocBook.SrcBook#getPublisher()
	 * @see #getSrcBook()
	 * @generated
	 */
	EAttribute getSrcBook_Publisher();

	/**
	 * Returns the meta object for class '{@link jointPackage_BibTeX2DocBook.SrcInCollection <em>Src In Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src In Collection</em>'.
	 * @see jointPackage_BibTeX2DocBook.SrcInCollection
	 * @generated
	 */
	EClass getSrcInCollection();

	/**
	 * Returns the meta object for class '{@link jointPackage_BibTeX2DocBook.SrcInBook <em>Src In Book</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src In Book</em>'.
	 * @see jointPackage_BibTeX2DocBook.SrcInBook
	 * @generated
	 */
	EClass getSrcInBook();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_BibTeX2DocBook.SrcInBook#getChapter <em>Chapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Chapter</em>'.
	 * @see jointPackage_BibTeX2DocBook.SrcInBook#getChapter()
	 * @see #getSrcInBook()
	 * @generated
	 */
	EAttribute getSrcInBook_Chapter();

	/**
	 * Returns the meta object for class '{@link jointPackage_BibTeX2DocBook.SrcPhDThesis <em>Src Ph DThesis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src Ph DThesis</em>'.
	 * @see jointPackage_BibTeX2DocBook.SrcPhDThesis
	 * @generated
	 */
	EClass getSrcPhDThesis();

	/**
	 * Returns the meta object for class '{@link jointPackage_BibTeX2DocBook.SrcMasterThesis <em>Src Master Thesis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src Master Thesis</em>'.
	 * @see jointPackage_BibTeX2DocBook.SrcMasterThesis
	 * @generated
	 */
	EClass getSrcMasterThesis();

	/**
	 * Returns the meta object for class '{@link jointPackage_BibTeX2DocBook.SrcAuthor <em>Src Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src Author</em>'.
	 * @see jointPackage_BibTeX2DocBook.SrcAuthor
	 * @generated
	 */
	EClass getSrcAuthor();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_BibTeX2DocBook.SrcAuthor#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see jointPackage_BibTeX2DocBook.SrcAuthor#getAuthor()
	 * @see #getSrcAuthor()
	 * @generated
	 */
	EAttribute getSrcAuthor_Author();

	/**
	 * Returns the meta object for class '{@link jointPackage_BibTeX2DocBook.SrcBibTeXEntry <em>Src Bib Te XEntry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src Bib Te XEntry</em>'.
	 * @see jointPackage_BibTeX2DocBook.SrcBibTeXEntry
	 * @generated
	 */
	EClass getSrcBibTeXEntry();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_BibTeX2DocBook.SrcBibTeXEntry#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see jointPackage_BibTeX2DocBook.SrcBibTeXEntry#getId()
	 * @see #getSrcBibTeXEntry()
	 * @generated
	 */
	EAttribute getSrcBibTeXEntry_Id();

	/**
	 * Returns the meta object for class '{@link jointPackage_BibTeX2DocBook.SrcAuthoredEntry <em>Src Authored Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src Authored Entry</em>'.
	 * @see jointPackage_BibTeX2DocBook.SrcAuthoredEntry
	 * @generated
	 */
	EClass getSrcAuthoredEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link jointPackage_BibTeX2DocBook.SrcAuthoredEntry#getAuthors <em>Authors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Authors</em>'.
	 * @see jointPackage_BibTeX2DocBook.SrcAuthoredEntry#getAuthors()
	 * @see #getSrcAuthoredEntry()
	 * @generated
	 */
	EReference getSrcAuthoredEntry_Authors();

	/**
	 * Returns the meta object for class '{@link jointPackage_BibTeX2DocBook.SrcDatedEntry <em>Src Dated Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src Dated Entry</em>'.
	 * @see jointPackage_BibTeX2DocBook.SrcDatedEntry
	 * @generated
	 */
	EClass getSrcDatedEntry();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_BibTeX2DocBook.SrcDatedEntry#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see jointPackage_BibTeX2DocBook.SrcDatedEntry#getYear()
	 * @see #getSrcDatedEntry()
	 * @generated
	 */
	EAttribute getSrcDatedEntry_Year();

	/**
	 * Returns the meta object for class '{@link jointPackage_BibTeX2DocBook.SrcTitledEntry <em>Src Titled Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src Titled Entry</em>'.
	 * @see jointPackage_BibTeX2DocBook.SrcTitledEntry
	 * @generated
	 */
	EClass getSrcTitledEntry();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_BibTeX2DocBook.SrcTitledEntry#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see jointPackage_BibTeX2DocBook.SrcTitledEntry#getTitle()
	 * @see #getSrcTitledEntry()
	 * @generated
	 */
	EAttribute getSrcTitledEntry_Title();

	/**
	 * Returns the meta object for class '{@link jointPackage_BibTeX2DocBook.SrcBookTitledEntry <em>Src Book Titled Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src Book Titled Entry</em>'.
	 * @see jointPackage_BibTeX2DocBook.SrcBookTitledEntry
	 * @generated
	 */
	EClass getSrcBookTitledEntry();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_BibTeX2DocBook.SrcBookTitledEntry#getBooktitle <em>Booktitle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Booktitle</em>'.
	 * @see jointPackage_BibTeX2DocBook.SrcBookTitledEntry#getBooktitle()
	 * @see #getSrcBookTitledEntry()
	 * @generated
	 */
	EAttribute getSrcBookTitledEntry_Booktitle();

	/**
	 * Returns the meta object for class '{@link jointPackage_BibTeX2DocBook.SrcMisc <em>Src Misc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src Misc</em>'.
	 * @see jointPackage_BibTeX2DocBook.SrcMisc
	 * @generated
	 */
	EClass getSrcMisc();

	/**
	 * Returns the meta object for class '{@link jointPackage_BibTeX2DocBook.SrcThesisEntry <em>Src Thesis Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src Thesis Entry</em>'.
	 * @see jointPackage_BibTeX2DocBook.SrcThesisEntry
	 * @generated
	 */
	EClass getSrcThesisEntry();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_BibTeX2DocBook.SrcThesisEntry#getSchool <em>School</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>School</em>'.
	 * @see jointPackage_BibTeX2DocBook.SrcThesisEntry#getSchool()
	 * @see #getSrcThesisEntry()
	 * @generated
	 */
	EAttribute getSrcThesisEntry_School();

	/**
	 * Returns the meta object for class '{@link jointPackage_BibTeX2DocBook.TrgDocBook <em>Trg Doc Book</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Doc Book</em>'.
	 * @see jointPackage_BibTeX2DocBook.TrgDocBook
	 * @generated
	 */
	EClass getTrgDocBook();

	/**
	 * Returns the meta object for the containment reference list '{@link jointPackage_BibTeX2DocBook.TrgDocBook#getBooks <em>Books</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Books</em>'.
	 * @see jointPackage_BibTeX2DocBook.TrgDocBook#getBooks()
	 * @see #getTrgDocBook()
	 * @generated
	 */
	EReference getTrgDocBook_Books();

	/**
	 * Returns the meta object for class '{@link jointPackage_BibTeX2DocBook.TrgBook <em>Trg Book</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Book</em>'.
	 * @see jointPackage_BibTeX2DocBook.TrgBook
	 * @generated
	 */
	EClass getTrgBook();

	/**
	 * Returns the meta object for the containment reference list '{@link jointPackage_BibTeX2DocBook.TrgBook#getArticles <em>Articles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Articles</em>'.
	 * @see jointPackage_BibTeX2DocBook.TrgBook#getArticles()
	 * @see #getTrgBook()
	 * @generated
	 */
	EReference getTrgBook_Articles();

	/**
	 * Returns the meta object for class '{@link jointPackage_BibTeX2DocBook.TrgTitledElement <em>Trg Titled Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Titled Element</em>'.
	 * @see jointPackage_BibTeX2DocBook.TrgTitledElement
	 * @generated
	 */
	EClass getTrgTitledElement();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_BibTeX2DocBook.TrgTitledElement#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see jointPackage_BibTeX2DocBook.TrgTitledElement#getTitle()
	 * @see #getTrgTitledElement()
	 * @generated
	 */
	EAttribute getTrgTitledElement_Title();

	/**
	 * Returns the meta object for class '{@link jointPackage_BibTeX2DocBook.TrgArticle <em>Trg Article</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Article</em>'.
	 * @see jointPackage_BibTeX2DocBook.TrgArticle
	 * @generated
	 */
	EClass getTrgArticle();

	/**
	 * Returns the meta object for the containment reference list '{@link jointPackage_BibTeX2DocBook.TrgArticle#getSections_1 <em>Sections 1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sections 1</em>'.
	 * @see jointPackage_BibTeX2DocBook.TrgArticle#getSections_1()
	 * @see #getTrgArticle()
	 * @generated
	 */
	EReference getTrgArticle_Sections_1();

	/**
	 * Returns the meta object for class '{@link jointPackage_BibTeX2DocBook.TrgSection <em>Trg Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Section</em>'.
	 * @see jointPackage_BibTeX2DocBook.TrgSection
	 * @generated
	 */
	EClass getTrgSection();

	/**
	 * Returns the meta object for the containment reference list '{@link jointPackage_BibTeX2DocBook.TrgSection#getParas <em>Paras</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Paras</em>'.
	 * @see jointPackage_BibTeX2DocBook.TrgSection#getParas()
	 * @see #getTrgSection()
	 * @generated
	 */
	EReference getTrgSection_Paras();

	/**
	 * Returns the meta object for class '{@link jointPackage_BibTeX2DocBook.TrgSect1 <em>Trg Sect1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Sect1</em>'.
	 * @see jointPackage_BibTeX2DocBook.TrgSect1
	 * @generated
	 */
	EClass getTrgSect1();

	/**
	 * Returns the meta object for the containment reference list '{@link jointPackage_BibTeX2DocBook.TrgSect1#getSections_2 <em>Sections 2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sections 2</em>'.
	 * @see jointPackage_BibTeX2DocBook.TrgSect1#getSections_2()
	 * @see #getTrgSect1()
	 * @generated
	 */
	EReference getTrgSect1_Sections_2();

	/**
	 * Returns the meta object for class '{@link jointPackage_BibTeX2DocBook.TrgSect2 <em>Trg Sect2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Sect2</em>'.
	 * @see jointPackage_BibTeX2DocBook.TrgSect2
	 * @generated
	 */
	EClass getTrgSect2();

	/**
	 * Returns the meta object for class '{@link jointPackage_BibTeX2DocBook.TrgPara <em>Trg Para</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Para</em>'.
	 * @see jointPackage_BibTeX2DocBook.TrgPara
	 * @generated
	 */
	EClass getTrgPara();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_BibTeX2DocBook.TrgPara#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see jointPackage_BibTeX2DocBook.TrgPara#getContent()
	 * @see #getTrgPara()
	 * @generated
	 */
	EAttribute getTrgPara_Content();

	/**
	 * Returns the meta object for the container reference '{@link jointPackage_BibTeX2DocBook.TrgPara#getSection <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Section</em>'.
	 * @see jointPackage_BibTeX2DocBook.TrgPara#getSection()
	 * @see #getTrgPara()
	 * @generated
	 */
	EReference getTrgPara_Section();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JointPackage_BibTeX2DocBookFactory getJointPackage_BibTeX2DocBookFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link jointPackage_BibTeX2DocBook.impl.JointMMImpl <em>Joint MM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_BibTeX2DocBook.impl.JointMMImpl
		 * @see jointPackage_BibTeX2DocBook.impl.JointPackage_BibTeX2DocBookPackageImpl#getJointMM()
		 * @generated
		 */
		EClass JOINT_MM = eINSTANCE.getJointMM();

		/**
		 * The meta object literal for the '<em><b>Source Root</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOINT_MM__SOURCE_ROOT = eINSTANCE.getJointMM_SourceRoot();

		/**
		 * The meta object literal for the '<em><b>Target Root</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOINT_MM__TARGET_ROOT = eINSTANCE.getJointMM_TargetRoot();

		/**
		 * The meta object literal for the '{@link jointPackage_BibTeX2DocBook.impl.SrcBibTeXFileImpl <em>Src Bib Te XFile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_BibTeX2DocBook.impl.SrcBibTeXFileImpl
		 * @see jointPackage_BibTeX2DocBook.impl.JointPackage_BibTeX2DocBookPackageImpl#getSrcBibTeXFile()
		 * @generated
		 */
		EClass SRC_BIB_TE_XFILE = eINSTANCE.getSrcBibTeXFile();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_BIB_TE_XFILE__ENTRIES = eINSTANCE.getSrcBibTeXFile_Entries();

		/**
		 * The meta object literal for the '{@link jointPackage_BibTeX2DocBook.impl.SrcArticleImpl <em>Src Article</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_BibTeX2DocBook.impl.SrcArticleImpl
		 * @see jointPackage_BibTeX2DocBook.impl.JointPackage_BibTeX2DocBookPackageImpl#getSrcArticle()
		 * @generated
		 */
		EClass SRC_ARTICLE = eINSTANCE.getSrcArticle();

		/**
		 * The meta object literal for the '<em><b>Journal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_ARTICLE__JOURNAL = eINSTANCE.getSrcArticle_Journal();

		/**
		 * The meta object literal for the '{@link jointPackage_BibTeX2DocBook.impl.SrcTechReportImpl <em>Src Tech Report</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_BibTeX2DocBook.impl.SrcTechReportImpl
		 * @see jointPackage_BibTeX2DocBook.impl.JointPackage_BibTeX2DocBookPackageImpl#getSrcTechReport()
		 * @generated
		 */
		EClass SRC_TECH_REPORT = eINSTANCE.getSrcTechReport();

		/**
		 * The meta object literal for the '{@link jointPackage_BibTeX2DocBook.impl.SrcUnpublishedImpl <em>Src Unpublished</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_BibTeX2DocBook.impl.SrcUnpublishedImpl
		 * @see jointPackage_BibTeX2DocBook.impl.JointPackage_BibTeX2DocBookPackageImpl#getSrcUnpublished()
		 * @generated
		 */
		EClass SRC_UNPUBLISHED = eINSTANCE.getSrcUnpublished();

		/**
		 * The meta object literal for the '<em><b>Note</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_UNPUBLISHED__NOTE = eINSTANCE.getSrcUnpublished_Note();

		/**
		 * The meta object literal for the '{@link jointPackage_BibTeX2DocBook.impl.SrcManualImpl <em>Src Manual</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_BibTeX2DocBook.impl.SrcManualImpl
		 * @see jointPackage_BibTeX2DocBook.impl.JointPackage_BibTeX2DocBookPackageImpl#getSrcManual()
		 * @generated
		 */
		EClass SRC_MANUAL = eINSTANCE.getSrcManual();

		/**
		 * The meta object literal for the '{@link jointPackage_BibTeX2DocBook.impl.SrcProceedingsImpl <em>Src Proceedings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_BibTeX2DocBook.impl.SrcProceedingsImpl
		 * @see jointPackage_BibTeX2DocBook.impl.JointPackage_BibTeX2DocBookPackageImpl#getSrcProceedings()
		 * @generated
		 */
		EClass SRC_PROCEEDINGS = eINSTANCE.getSrcProceedings();

		/**
		 * The meta object literal for the '{@link jointPackage_BibTeX2DocBook.impl.SrcInProceedingsImpl <em>Src In Proceedings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_BibTeX2DocBook.impl.SrcInProceedingsImpl
		 * @see jointPackage_BibTeX2DocBook.impl.JointPackage_BibTeX2DocBookPackageImpl#getSrcInProceedings()
		 * @generated
		 */
		EClass SRC_IN_PROCEEDINGS = eINSTANCE.getSrcInProceedings();

		/**
		 * The meta object literal for the '{@link jointPackage_BibTeX2DocBook.impl.SrcBookletImpl <em>Src Booklet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_BibTeX2DocBook.impl.SrcBookletImpl
		 * @see jointPackage_BibTeX2DocBook.impl.JointPackage_BibTeX2DocBookPackageImpl#getSrcBooklet()
		 * @generated
		 */
		EClass SRC_BOOKLET = eINSTANCE.getSrcBooklet();

		/**
		 * The meta object literal for the '{@link jointPackage_BibTeX2DocBook.impl.SrcBookImpl <em>Src Book</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_BibTeX2DocBook.impl.SrcBookImpl
		 * @see jointPackage_BibTeX2DocBook.impl.JointPackage_BibTeX2DocBookPackageImpl#getSrcBook()
		 * @generated
		 */
		EClass SRC_BOOK = eINSTANCE.getSrcBook();

		/**
		 * The meta object literal for the '<em><b>Publisher</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_BOOK__PUBLISHER = eINSTANCE.getSrcBook_Publisher();

		/**
		 * The meta object literal for the '{@link jointPackage_BibTeX2DocBook.impl.SrcInCollectionImpl <em>Src In Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_BibTeX2DocBook.impl.SrcInCollectionImpl
		 * @see jointPackage_BibTeX2DocBook.impl.JointPackage_BibTeX2DocBookPackageImpl#getSrcInCollection()
		 * @generated
		 */
		EClass SRC_IN_COLLECTION = eINSTANCE.getSrcInCollection();

		/**
		 * The meta object literal for the '{@link jointPackage_BibTeX2DocBook.impl.SrcInBookImpl <em>Src In Book</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_BibTeX2DocBook.impl.SrcInBookImpl
		 * @see jointPackage_BibTeX2DocBook.impl.JointPackage_BibTeX2DocBookPackageImpl#getSrcInBook()
		 * @generated
		 */
		EClass SRC_IN_BOOK = eINSTANCE.getSrcInBook();

		/**
		 * The meta object literal for the '<em><b>Chapter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_IN_BOOK__CHAPTER = eINSTANCE.getSrcInBook_Chapter();

		/**
		 * The meta object literal for the '{@link jointPackage_BibTeX2DocBook.impl.SrcPhDThesisImpl <em>Src Ph DThesis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_BibTeX2DocBook.impl.SrcPhDThesisImpl
		 * @see jointPackage_BibTeX2DocBook.impl.JointPackage_BibTeX2DocBookPackageImpl#getSrcPhDThesis()
		 * @generated
		 */
		EClass SRC_PH_DTHESIS = eINSTANCE.getSrcPhDThesis();

		/**
		 * The meta object literal for the '{@link jointPackage_BibTeX2DocBook.impl.SrcMasterThesisImpl <em>Src Master Thesis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_BibTeX2DocBook.impl.SrcMasterThesisImpl
		 * @see jointPackage_BibTeX2DocBook.impl.JointPackage_BibTeX2DocBookPackageImpl#getSrcMasterThesis()
		 * @generated
		 */
		EClass SRC_MASTER_THESIS = eINSTANCE.getSrcMasterThesis();

		/**
		 * The meta object literal for the '{@link jointPackage_BibTeX2DocBook.impl.SrcAuthorImpl <em>Src Author</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_BibTeX2DocBook.impl.SrcAuthorImpl
		 * @see jointPackage_BibTeX2DocBook.impl.JointPackage_BibTeX2DocBookPackageImpl#getSrcAuthor()
		 * @generated
		 */
		EClass SRC_AUTHOR = eINSTANCE.getSrcAuthor();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_AUTHOR__AUTHOR = eINSTANCE.getSrcAuthor_Author();

		/**
		 * The meta object literal for the '{@link jointPackage_BibTeX2DocBook.impl.SrcBibTeXEntryImpl <em>Src Bib Te XEntry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_BibTeX2DocBook.impl.SrcBibTeXEntryImpl
		 * @see jointPackage_BibTeX2DocBook.impl.JointPackage_BibTeX2DocBookPackageImpl#getSrcBibTeXEntry()
		 * @generated
		 */
		EClass SRC_BIB_TE_XENTRY = eINSTANCE.getSrcBibTeXEntry();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_BIB_TE_XENTRY__ID = eINSTANCE.getSrcBibTeXEntry_Id();

		/**
		 * The meta object literal for the '{@link jointPackage_BibTeX2DocBook.impl.SrcAuthoredEntryImpl <em>Src Authored Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_BibTeX2DocBook.impl.SrcAuthoredEntryImpl
		 * @see jointPackage_BibTeX2DocBook.impl.JointPackage_BibTeX2DocBookPackageImpl#getSrcAuthoredEntry()
		 * @generated
		 */
		EClass SRC_AUTHORED_ENTRY = eINSTANCE.getSrcAuthoredEntry();

		/**
		 * The meta object literal for the '<em><b>Authors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_AUTHORED_ENTRY__AUTHORS = eINSTANCE.getSrcAuthoredEntry_Authors();

		/**
		 * The meta object literal for the '{@link jointPackage_BibTeX2DocBook.impl.SrcDatedEntryImpl <em>Src Dated Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_BibTeX2DocBook.impl.SrcDatedEntryImpl
		 * @see jointPackage_BibTeX2DocBook.impl.JointPackage_BibTeX2DocBookPackageImpl#getSrcDatedEntry()
		 * @generated
		 */
		EClass SRC_DATED_ENTRY = eINSTANCE.getSrcDatedEntry();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_DATED_ENTRY__YEAR = eINSTANCE.getSrcDatedEntry_Year();

		/**
		 * The meta object literal for the '{@link jointPackage_BibTeX2DocBook.impl.SrcTitledEntryImpl <em>Src Titled Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_BibTeX2DocBook.impl.SrcTitledEntryImpl
		 * @see jointPackage_BibTeX2DocBook.impl.JointPackage_BibTeX2DocBookPackageImpl#getSrcTitledEntry()
		 * @generated
		 */
		EClass SRC_TITLED_ENTRY = eINSTANCE.getSrcTitledEntry();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_TITLED_ENTRY__TITLE = eINSTANCE.getSrcTitledEntry_Title();

		/**
		 * The meta object literal for the '{@link jointPackage_BibTeX2DocBook.impl.SrcBookTitledEntryImpl <em>Src Book Titled Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_BibTeX2DocBook.impl.SrcBookTitledEntryImpl
		 * @see jointPackage_BibTeX2DocBook.impl.JointPackage_BibTeX2DocBookPackageImpl#getSrcBookTitledEntry()
		 * @generated
		 */
		EClass SRC_BOOK_TITLED_ENTRY = eINSTANCE.getSrcBookTitledEntry();

		/**
		 * The meta object literal for the '<em><b>Booktitle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_BOOK_TITLED_ENTRY__BOOKTITLE = eINSTANCE.getSrcBookTitledEntry_Booktitle();

		/**
		 * The meta object literal for the '{@link jointPackage_BibTeX2DocBook.impl.SrcMiscImpl <em>Src Misc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_BibTeX2DocBook.impl.SrcMiscImpl
		 * @see jointPackage_BibTeX2DocBook.impl.JointPackage_BibTeX2DocBookPackageImpl#getSrcMisc()
		 * @generated
		 */
		EClass SRC_MISC = eINSTANCE.getSrcMisc();

		/**
		 * The meta object literal for the '{@link jointPackage_BibTeX2DocBook.impl.SrcThesisEntryImpl <em>Src Thesis Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_BibTeX2DocBook.impl.SrcThesisEntryImpl
		 * @see jointPackage_BibTeX2DocBook.impl.JointPackage_BibTeX2DocBookPackageImpl#getSrcThesisEntry()
		 * @generated
		 */
		EClass SRC_THESIS_ENTRY = eINSTANCE.getSrcThesisEntry();

		/**
		 * The meta object literal for the '<em><b>School</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_THESIS_ENTRY__SCHOOL = eINSTANCE.getSrcThesisEntry_School();

		/**
		 * The meta object literal for the '{@link jointPackage_BibTeX2DocBook.impl.TrgDocBookImpl <em>Trg Doc Book</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_BibTeX2DocBook.impl.TrgDocBookImpl
		 * @see jointPackage_BibTeX2DocBook.impl.JointPackage_BibTeX2DocBookPackageImpl#getTrgDocBook()
		 * @generated
		 */
		EClass TRG_DOC_BOOK = eINSTANCE.getTrgDocBook();

		/**
		 * The meta object literal for the '<em><b>Books</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_DOC_BOOK__BOOKS = eINSTANCE.getTrgDocBook_Books();

		/**
		 * The meta object literal for the '{@link jointPackage_BibTeX2DocBook.impl.TrgBookImpl <em>Trg Book</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_BibTeX2DocBook.impl.TrgBookImpl
		 * @see jointPackage_BibTeX2DocBook.impl.JointPackage_BibTeX2DocBookPackageImpl#getTrgBook()
		 * @generated
		 */
		EClass TRG_BOOK = eINSTANCE.getTrgBook();

		/**
		 * The meta object literal for the '<em><b>Articles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_BOOK__ARTICLES = eINSTANCE.getTrgBook_Articles();

		/**
		 * The meta object literal for the '{@link jointPackage_BibTeX2DocBook.impl.TrgTitledElementImpl <em>Trg Titled Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_BibTeX2DocBook.impl.TrgTitledElementImpl
		 * @see jointPackage_BibTeX2DocBook.impl.JointPackage_BibTeX2DocBookPackageImpl#getTrgTitledElement()
		 * @generated
		 */
		EClass TRG_TITLED_ELEMENT = eINSTANCE.getTrgTitledElement();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRG_TITLED_ELEMENT__TITLE = eINSTANCE.getTrgTitledElement_Title();

		/**
		 * The meta object literal for the '{@link jointPackage_BibTeX2DocBook.impl.TrgArticleImpl <em>Trg Article</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_BibTeX2DocBook.impl.TrgArticleImpl
		 * @see jointPackage_BibTeX2DocBook.impl.JointPackage_BibTeX2DocBookPackageImpl#getTrgArticle()
		 * @generated
		 */
		EClass TRG_ARTICLE = eINSTANCE.getTrgArticle();

		/**
		 * The meta object literal for the '<em><b>Sections 1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_ARTICLE__SECTIONS_1 = eINSTANCE.getTrgArticle_Sections_1();

		/**
		 * The meta object literal for the '{@link jointPackage_BibTeX2DocBook.impl.TrgSectionImpl <em>Trg Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_BibTeX2DocBook.impl.TrgSectionImpl
		 * @see jointPackage_BibTeX2DocBook.impl.JointPackage_BibTeX2DocBookPackageImpl#getTrgSection()
		 * @generated
		 */
		EClass TRG_SECTION = eINSTANCE.getTrgSection();

		/**
		 * The meta object literal for the '<em><b>Paras</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_SECTION__PARAS = eINSTANCE.getTrgSection_Paras();

		/**
		 * The meta object literal for the '{@link jointPackage_BibTeX2DocBook.impl.TrgSect1Impl <em>Trg Sect1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_BibTeX2DocBook.impl.TrgSect1Impl
		 * @see jointPackage_BibTeX2DocBook.impl.JointPackage_BibTeX2DocBookPackageImpl#getTrgSect1()
		 * @generated
		 */
		EClass TRG_SECT1 = eINSTANCE.getTrgSect1();

		/**
		 * The meta object literal for the '<em><b>Sections 2</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_SECT1__SECTIONS_2 = eINSTANCE.getTrgSect1_Sections_2();

		/**
		 * The meta object literal for the '{@link jointPackage_BibTeX2DocBook.impl.TrgSect2Impl <em>Trg Sect2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_BibTeX2DocBook.impl.TrgSect2Impl
		 * @see jointPackage_BibTeX2DocBook.impl.JointPackage_BibTeX2DocBookPackageImpl#getTrgSect2()
		 * @generated
		 */
		EClass TRG_SECT2 = eINSTANCE.getTrgSect2();

		/**
		 * The meta object literal for the '{@link jointPackage_BibTeX2DocBook.impl.TrgParaImpl <em>Trg Para</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_BibTeX2DocBook.impl.TrgParaImpl
		 * @see jointPackage_BibTeX2DocBook.impl.JointPackage_BibTeX2DocBookPackageImpl#getTrgPara()
		 * @generated
		 */
		EClass TRG_PARA = eINSTANCE.getTrgPara();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRG_PARA__CONTENT = eINSTANCE.getTrgPara_Content();

		/**
		 * The meta object literal for the '<em><b>Section</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_PARA__SECTION = eINSTANCE.getTrgPara_Section();

	}

} //JointPackage_BibTeX2DocBookPackage
