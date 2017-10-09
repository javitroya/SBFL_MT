/**
 */
package jointPackage_BibTeX2DocBook.impl;

import jointPackage_BibTeX2DocBook.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JointPackage_BibTeX2DocBookFactoryImpl extends EFactoryImpl implements JointPackage_BibTeX2DocBookFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JointPackage_BibTeX2DocBookFactory init() {
		try {
			JointPackage_BibTeX2DocBookFactory theJointPackage_BibTeX2DocBookFactory = (JointPackage_BibTeX2DocBookFactory)EPackage.Registry.INSTANCE.getEFactory(JointPackage_BibTeX2DocBookPackage.eNS_URI);
			if (theJointPackage_BibTeX2DocBookFactory != null) {
				return theJointPackage_BibTeX2DocBookFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JointPackage_BibTeX2DocBookFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JointPackage_BibTeX2DocBookFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case JointPackage_BibTeX2DocBookPackage.JOINT_MM: return createJointMM();
			case JointPackage_BibTeX2DocBookPackage.SRC_BIB_TE_XFILE: return createSrcBibTeXFile();
			case JointPackage_BibTeX2DocBookPackage.SRC_ARTICLE: return createSrcArticle();
			case JointPackage_BibTeX2DocBookPackage.SRC_TECH_REPORT: return createSrcTechReport();
			case JointPackage_BibTeX2DocBookPackage.SRC_UNPUBLISHED: return createSrcUnpublished();
			case JointPackage_BibTeX2DocBookPackage.SRC_MANUAL: return createSrcManual();
			case JointPackage_BibTeX2DocBookPackage.SRC_PROCEEDINGS: return createSrcProceedings();
			case JointPackage_BibTeX2DocBookPackage.SRC_IN_PROCEEDINGS: return createSrcInProceedings();
			case JointPackage_BibTeX2DocBookPackage.SRC_BOOKLET: return createSrcBooklet();
			case JointPackage_BibTeX2DocBookPackage.SRC_BOOK: return createSrcBook();
			case JointPackage_BibTeX2DocBookPackage.SRC_IN_COLLECTION: return createSrcInCollection();
			case JointPackage_BibTeX2DocBookPackage.SRC_IN_BOOK: return createSrcInBook();
			case JointPackage_BibTeX2DocBookPackage.SRC_PH_DTHESIS: return createSrcPhDThesis();
			case JointPackage_BibTeX2DocBookPackage.SRC_MASTER_THESIS: return createSrcMasterThesis();
			case JointPackage_BibTeX2DocBookPackage.SRC_AUTHOR: return createSrcAuthor();
			case JointPackage_BibTeX2DocBookPackage.SRC_MISC: return createSrcMisc();
			case JointPackage_BibTeX2DocBookPackage.TRG_DOC_BOOK: return createTrgDocBook();
			case JointPackage_BibTeX2DocBookPackage.TRG_BOOK: return createTrgBook();
			case JointPackage_BibTeX2DocBookPackage.TRG_ARTICLE: return createTrgArticle();
			case JointPackage_BibTeX2DocBookPackage.TRG_SECT1: return createTrgSect1();
			case JointPackage_BibTeX2DocBookPackage.TRG_SECT2: return createTrgSect2();
			case JointPackage_BibTeX2DocBookPackage.TRG_PARA: return createTrgPara();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JointMM createJointMM() {
		JointMMImpl jointMM = new JointMMImpl();
		return jointMM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcBibTeXFile createSrcBibTeXFile() {
		SrcBibTeXFileImpl srcBibTeXFile = new SrcBibTeXFileImpl();
		return srcBibTeXFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcArticle createSrcArticle() {
		SrcArticleImpl srcArticle = new SrcArticleImpl();
		return srcArticle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcTechReport createSrcTechReport() {
		SrcTechReportImpl srcTechReport = new SrcTechReportImpl();
		return srcTechReport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcUnpublished createSrcUnpublished() {
		SrcUnpublishedImpl srcUnpublished = new SrcUnpublishedImpl();
		return srcUnpublished;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcManual createSrcManual() {
		SrcManualImpl srcManual = new SrcManualImpl();
		return srcManual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcProceedings createSrcProceedings() {
		SrcProceedingsImpl srcProceedings = new SrcProceedingsImpl();
		return srcProceedings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcInProceedings createSrcInProceedings() {
		SrcInProceedingsImpl srcInProceedings = new SrcInProceedingsImpl();
		return srcInProceedings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcBooklet createSrcBooklet() {
		SrcBookletImpl srcBooklet = new SrcBookletImpl();
		return srcBooklet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcBook createSrcBook() {
		SrcBookImpl srcBook = new SrcBookImpl();
		return srcBook;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcInCollection createSrcInCollection() {
		SrcInCollectionImpl srcInCollection = new SrcInCollectionImpl();
		return srcInCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcInBook createSrcInBook() {
		SrcInBookImpl srcInBook = new SrcInBookImpl();
		return srcInBook;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcPhDThesis createSrcPhDThesis() {
		SrcPhDThesisImpl srcPhDThesis = new SrcPhDThesisImpl();
		return srcPhDThesis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcMasterThesis createSrcMasterThesis() {
		SrcMasterThesisImpl srcMasterThesis = new SrcMasterThesisImpl();
		return srcMasterThesis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcAuthor createSrcAuthor() {
		SrcAuthorImpl srcAuthor = new SrcAuthorImpl();
		return srcAuthor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcMisc createSrcMisc() {
		SrcMiscImpl srcMisc = new SrcMiscImpl();
		return srcMisc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgDocBook createTrgDocBook() {
		TrgDocBookImpl trgDocBook = new TrgDocBookImpl();
		return trgDocBook;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgBook createTrgBook() {
		TrgBookImpl trgBook = new TrgBookImpl();
		return trgBook;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgArticle createTrgArticle() {
		TrgArticleImpl trgArticle = new TrgArticleImpl();
		return trgArticle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgSect1 createTrgSect1() {
		TrgSect1Impl trgSect1 = new TrgSect1Impl();
		return trgSect1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgSect2 createTrgSect2() {
		TrgSect2Impl trgSect2 = new TrgSect2Impl();
		return trgSect2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgPara createTrgPara() {
		TrgParaImpl trgPara = new TrgParaImpl();
		return trgPara;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JointPackage_BibTeX2DocBookPackage getJointPackage_BibTeX2DocBookPackage() {
		return (JointPackage_BibTeX2DocBookPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JointPackage_BibTeX2DocBookPackage getPackage() {
		return JointPackage_BibTeX2DocBookPackage.eINSTANCE;
	}

} //JointPackage_BibTeX2DocBookFactoryImpl
