/********************************************************************************
* Copyright (c) 2017 Universidad de Sevilla.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
* Javier Troya (Universidad de Sevilla, Spain) - implementation
*******************************************************************************/

package es.us.eii.fault.localization.mt.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.ecore.impl.ConstraintImpl;
import org.eclipse.ocl.helper.OCLHelper;

import trace.TracePackage;
import ATL.ATLPackage;
import ATL.Rule;
import jointPackage_BibTeX2DocBook.JointPackage_BibTeX2DocBookPackage;
import jointPackage_UML2ER.JointPackage_UML2ERPackage;
import jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage;
import jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage;



public class FaultLocalizationMT_Main {
	
	/*We assume that the transformation (.atl and .asm files), source metamodel and 
	 * target metamodel are in the folder of the transformation (executionsCanPath), and that Trace.ecore 
	 * is in the root path of the project. We also assume that in the transformation we have the trace 
	 * model as TM : TMM, and the input/output MMs as IN/OUT 
	 */	
	
	ResourceSet resSet = null;
	Resource inModel = null;
	
	/**Number of input models to generate and, therefore, of transformations to run**/
	final static int numExecutions = 100;
	
/**In order to activate the execution of the BibTex2DocBook case study, uncomment lines 82 - 215   
 * To do so, select all those lines and press Shit+Control+c (the same must be done, once uncommented, to comment them again). 
 * Please note that some lines will keep commented.
 * In order to execute a particular mutant, uncomment the specific lines of the variables "Transformation_Name" and "Buggy_rules". 
 * Please note that only one variable of each must be uncommented.
 * Also, please note that when enabling the execution of this case study, the lines of all other case studies must be commented.
 * Finally, lines 701, 702 must be uncommented, and line 709 must be commented. Also, line 936 must be uncommented and lines 935, 937, 937, 939 commented.
 * **/	
	/**************************** PARAMETERS FOR THE BIBTEX2DOCBOOK EXAMPLE ********************************/
		
	/**We need the canonical path in order to navigate the subfolders**/
	final static String executionsCanPath = "models_BibTexML2DocBook";
	/**Name of the folder that contains the transformations**/
	final static String folderTransformations = "transformations";
	/**This is the name given to the model resulting from joining the source and target models of a transformation**/
	final static String Joint_Model_Name = "JointModel";
	/**Name of the file with the transformation and the Buggy_rule. Note: the latter is used for the automatic computation of the EXAM metric**/
	/**The following combinations (pairs of the two above variables) are correct for this case study**/
	final static String Transformation_Name = "BibTeX2DocBook_Mutant1";
	final static List<String> Buggy_rules = Arrays.asList("Article_Title_Journal");
//	final static String Transformation_Name = "BibTeX2DocBook_Mutant2";
//	final static List<String> Buggy_rules = Arrays.asList("Main");
//	final static String Transformation_Name = "BibTeX2DocBook_Mutant3";
//	final static List<String> Buggy_rules = Arrays.asList("Author");
//	final static String Transformation_Name = "BibTeX2DocBook_Mutant4";
//	final static List<String> Buggy_rules = Arrays.asList("Article_NoTitle_NoJournal");
//	final static String Transformation_Name = "BibTeX2DocBook_Mutant5";
//	final static List<String> Buggy_rules = Arrays.asList("Author");
//	final static String Transformation_Name = "BibTeX2DocBook_Mutant6";
//	final static List<String> Buggy_rules = Arrays.asList("UntitledEntry");
//	final static String Transformation_Name = "BibTeX2DocBook_Mutant7";
//	final static List<String> Buggy_rules = Arrays.asList("TitledEntry_Title_NoArticle");
//	final static String Transformation_Name = "BibTeX2DocBook_Mutant8";
//	final static List<String> Buggy_rules = Arrays.asList("Main");
//	final static String Transformation_Name = "BibTeX2DocBook_Mutant9";
//	final static List<String> Buggy_rules = Arrays.asList("TitledEntry_Title_NoArticle");
//	final static String Transformation_Name = "BibTeX2DocBook_Mutant10";
//	final static List<String> Buggy_rules = Arrays.asList("TitledEntry_NoTitle_NoArticle");
//	final static String Transformation_Name = "BibTeX2DocBook_Mutant11";
//	final static List<String> Buggy_rules = Arrays.asList("Article_Title_Journal");
//	final static String Transformation_Name = "BibTeX2DocBook_Mutant12";
//	final static List<String> Buggy_rules = Arrays.asList("Article_NoTitle_Journal");
//	final static String Transformation_Name = "BibTeX2DocBook_Mutant13";
//	final static List<String> Buggy_rules = Arrays.asList("Author");
//	final static String Transformation_Name = "BibTeX2DocBook_Mutant14";
//	final static List<String> Buggy_rules = Arrays.asList("Article_Title_NoJournal");
//	final static String Transformation_Name = "BibTeX2DocBook_Mutant15";
//	final static List<String> Buggy_rules = Arrays.asList("UntitledEntry");
//	final static String Transformation_Name = "BibTeX2DocBook_Mutant16";
//	final static List<String> Buggy_rules = Arrays.asList("Article_NoTitle_NoJournal");
//	final static String Transformation_Name = "BibTeX2DocBook_Mutant17";
//	final static List<String> Buggy_rules = Arrays.asList("Main");
//	final static String Transformation_Name = "BibTeX2DocBook_Mutant18";
//	final static List<String> Buggy_rules = Arrays.asList("TitledEntry_Title_NoArticle");
//	final static String Transformation_Name = "BibTeX2DocBook_Mutant19";
//	final static List<String> Buggy_rules = Arrays.asList("TitledEntry_NoTitle_NoArticle");
//	final static String Transformation_Name = "BibTeX2DocBook_Mutant20";
//	final static List<String> Buggy_rules = Arrays.asList("Article_Title_Journal");
//	final static String Transformation_Name = "BibTeX2DocBook_Mutant21";
//	final static List<String> Buggy_rules = Arrays.asList("Main");
//	final static String Transformation_Name = "BibTeX2DocBook_Mutant22";
//	final static List<String> Buggy_rules = Arrays.asList("TitledEntry_Title_NoArticle");
//	final static String Transformation_Name = "BibTeX2DocBook_Mutant23";
//	final static List<String> Buggy_rules = Arrays.asList("Article_Title_Journal");
//	final static String Transformation_Name = "BibTeX2DocBook_Mutant24";
//	final static List<String> Buggy_rules = Arrays.asList("Author");
//	final static String Transformation_Name = "BibTeX2DocBook_Mutant25";
//	final static List<String> Buggy_rules = Arrays.asList("TitledEntry_Title_NoArticle");
//	final static String Transformation_Name = "BibTeX2DocBook_Mutant26";
//	final static List<String> Buggy_rules = Arrays.asList("Main");
//	final static String Transformation_Name = "BibTeX2DocBook_Mutant27";
//	final static List<String> Buggy_rules = Arrays.asList("TitledEntry_Title_NoArticle", "TitledEntry_NoTitle_NoArticle");
//	final static String Transformation_Name = "BibTeX2DocBook_Mutant28";
//	final static List<String> Buggy_rules = Arrays.asList("Article_Title_Journal", "Article_NoTitle_Journal");
//	final static String Transformation_Name = "BibTeX2DocBook_Mutant29";
//	final static List<String> Buggy_rules = Arrays.asList("Author", "UntitledEntry");
//	final static String Transformation_Name = "BibTeX2DOCBOOK_MUTANT30";
//	FINAL STATIC LIST<STRING> BUGGY_RULES = ARRAYS.AsList("TitledEntry_Title_NoArticle", "Main");
//	final static String Transformation_Name = "BibTeX2DocBook_Mutant31";
//	final static List<String> Buggy_rules = Arrays.asList("Article_Title_Journal", "Main");
//	final static String Transformation_Name = "BibTeX2DocBook_Mutant32";
//	final static List<String> Buggy_rules = Arrays.asList("Author", "TitledEntry_NoTitle_NoArticle");
//	final static String Transformation_Name = "BibTeX2DocBook_Mutant33";
//	final static List<String> Buggy_rules = Arrays.asList("UntitledEntry", "TitledEntry_Title_NoArticle");
//	final static String Transformation_Name = "BibTeX2DocBook_Mutant34";
//	final static List<String> Buggy_rules = Arrays.asList("TitledEntry_Title_NoArticle", "TitledEntry_NoTitle_NoArticle");
//	final static String Transformation_Name = "BibTeX2DocBook_Mutant35";
//	final static List<String> Buggy_rules = Arrays.asList("Main", "Author");
//	final static String Transformation_Name = "BibTeX2DocBook_Mutant36";
//	final static List<String> Buggy_rules = Arrays.asList("UntitledEntry", "Article_Title_Journal");
//	final static String Transformation_Name = "BibTeX2DocBook_Mutant37";
//	final static List<String> Buggy_rules = Arrays.asList("Article_NoTitle_Journal", "Article_Title_NoJournal");
//	final static String Transformation_Name = "BibTeX2DocBook_Mutant38";
//	final static List<String> Buggy_rules = Arrays.asList("TitledEntry_Title_NoArticle", "Article_Title_Journal");
//	final static String Transformation_Name = "BibTeX2DocBook_Mutant39";
//	final static List<String> Buggy_rules = Arrays.asList("Main", "TitledEntry_Title_NoArticle");
//	final static String Transformation_Name = "BibTeX2DocBook_Mutant40";
//	final static List<String> Buggy_rules = Arrays.asList("Author", "UntitledEntry");
	
	/**Name of the file with the OCL constraints**/
	final static String OCL_File_Name = "OCL_Constraints.txt";
	/**Name of the file where the results will be printed**/
	final static String Results_File_Name = "suspiciousnessResults.csv";
	
	/**Name and extension of input MM**/
	public final static String IN_MM = "BibTeX.ecore";
	/**Name as it is in the ATL transformation**/
	public final static String IN_MM_NAME = "BibTeX";
	/**Name and extension of output MM**/
	public final static String OUT_MM = "DocBook.ecore";
	/**Name as it is in the ATL transformation**/
	public final static String OUT_MM_NAME = "DocBook";
	/**Name of the Trace metamodel and its name within the transformation**/
	public final static String Trace_MM = "Trace.ecore";
	public final static String Trace_MM_NAME = "TM";
	/**Name to be given to the trace models resulting from transformation execution**/
	public final static String Trace_OutModel_Name = "Trace_out";
	
	//For executing the transformation that joins the models, we also need some parameters
	//Next we specify the Joint Metamodel where both metamodels are merged
	public final static String Joint_MM = "JointMM_BibTeX2DocBook.ecore";
	/* Provided we have the following transformation to merge input/output models
	 * module MergeModels;
	 * create OUT : JointModel from IN1 : BibTexModel, IN2 : DocBookModel;
	 * Then we have the following parameters:
	 */
	public final static String IN_MM_NAME_TRAFO1 = "BibTexModel";
	public final static String IN_MM_NAME_TRAFO2 = "DocBookModel";
	public final static String OUT_MM_NAME_TRAFO = "JointModel";
	public final static String IN_MODEL_NAME_TRAFO1 = "IN1";
	public final static String IN_MODEL_NAME_TRAFO2 = "IN2";
	public final static String OUT_MODEL_NAME_TRAFO = "OUT";
	public final static String TRANSFO_MODULE_MERGE = "MergeModels"; //Name of the transformation file
	
	/**Take also into account the following to be touched within the code**/
	/**We have also added the following in the main method**/
	//JointPackage_BibTeX2DocBookPackage.eINSTANCE.eClass();
	
	/**Finally, we also have to change the following line, which is in method getListResultVector
	 * We have to put the corresponding JointPackage**/
	//helper.setContext(JointPackage_BibTeX2DocBookPackage.Literals.JOINT_MM);
	/**************************** END OF PARAMETERS FOR THE BIBTEX2DOCBOOK EXAMPLE ********************************/
	
/**In order to activate the execution of the UML2ER case study, uncomment lines 225 - 314   
 * To do so, select all those lines and press Shit+Control+c (the same must be done, once uncommented, to comment them again). 
 * Please note that some lines will keep commented.
 * In order to execute a particular mutant, uncomment the specific lines of the variables
 * "Transformation_Name" and "Buggy_rules". Please note that only one variable of each must be uncommented.
 * Also, please note that when enabling the execution of this case study, the lines of all other case studies must be commented.
 * Finally, lines 701, 702 must be uncommented, and line 709 must be commented. Also, line 937 must be uncommented and lines 935, 936, 938, 939 commented.
 * **/	
//	/**************************** PARAMETERS FOR THE UML2ER EXAMPLE ********************************/
////	
//	/**We need the canonical path in order to navigate the subfolders**/
//	final static String executionsCanPath = "models_UML2ER";
//	/**Name of the folder that contains the transformations**/
//	final static String folderTransformations = "transformations";
//	/**This is the name given to the model resulting from joining the source and target models of a transformation**/
//	final static String Joint_Model_Name = "JointModel";
//	/**Name of the file with the transformation and the Buggy_rule. Note: the latter is used for the automatic computation of the EXAM metric**/
//	/**The following combinations (pairs of the two above variables) are correct for this case study**/
////	final static String Transformation_Name = "SimpleUml2ER_Mutant1";
////	final static List<String> Buggy_rules = Arrays.asList("StrongReferences");
////	final static String Transformation_Name = "SimpleUml2ER_Mutant2";
////	final static List<String> Buggy_rules = Arrays.asList("References");
////	final static String Transformation_Name = "SimpleUml2ER_Mutant3";
////	final static List<String> Buggy_rules = Arrays.asList("Attributes");
////	final static String Transformation_Name = "SimpleUml2ER_Mutant4";
////	final static List<String> Buggy_rules = Arrays.asList("Class");
////	final static String Transformation_Name = "SimpleUml2ER_Mutant5";
////	final static List<String> Buggy_rules = Arrays.asList("Attributes");
////	final static String Transformation_Name = "SimpleUml2ER_Mutant6";
////	final static List<String> Buggy_rules = Arrays.asList("Package");
////	final static String Transformation_Name = "SimpleUml2ER_Mutant7";
////	final static List<String> Buggy_rules = Arrays.asList("Attributes");
////	final static String Transformation_Name = "SimpleUml2ER_Mutant8";
////	final static List<String> Buggy_rules = Arrays.asList("StrongReferences");
////	final static String Transformation_Name = "SimpleUml2ER_Mutant9";
////	final static List<String> Buggy_rules = Arrays.asList("WeakReferences");
////	final static String Transformation_Name = "SimpleUml2ER_Mutant10";
////	final static List<String> Buggy_rules = Arrays.asList("NamedElement");
////	final static String Transformation_Name = "SimpleUml2ER_Mutant11";
////	final static List<String> Buggy_rules = Arrays.asList("Attributes");
////	final static String Transformation_Name = "SimpleUml2ER_Mutant12";
////	final static List<String> Buggy_rules = Arrays.asList("Attributes","References");
////	final static String Transformation_Name = "SimpleUml2ER_Mutant13";
////	final static List<String> Buggy_rules = Arrays.asList("Class","Attributes");
////	final static String Transformation_Name = "SimpleUml2ER_Mutant14";
////	final static List<String> Buggy_rules = Arrays.asList("Attributes","WeakReferences");
////	final static String Transformation_Name = "SimpleUml2ER_Mutant15";
////	final static List<String> Buggy_rules = Arrays.asList("Package","Attributes");
////	final static String Transformation_Name = "SimpleUml2ER_Mutant16";
////	final static List<String> Buggy_rules = Arrays.asList("WeakReferences","StrongReferences");
////	final static String Transformation_Name = "SimpleUml2ER_Mutant17";
////	final static List<String> Buggy_rules = Arrays.asList("Package", "Class");
//	final static String Transformation_Name = "SimpleUml2ER_Mutant18";
//	final static List<String> Buggy_rules = Arrays.asList("Property", "Class");
//	
//	/**Name of the file with the OCL constraints**/
//	final static String OCL_File_Name = "OCL_Constraints.txt";
//	/**Name of the file where the results will be printed**/
//	final static String Results_File_Name = "suspiciousnessResults.csv";	
//	/**Name and extension of input MM**/
//	public final static String IN_MM = "SimpleUML.ecore";
//	/**Name as it is in the ATL transformation**/
//	public final static String IN_MM_NAME = "SimpleUML";
//	/**Name and extension of output MM**/
//	public final static String OUT_MM = "ER.ecore";
//	/**Name as it is in the ATL transformation**/
//	public final static String OUT_MM_NAME = "ER";
//	/**Name of the Trace metamodel and its name within the transformation**/
//	public final static String Trace_MM = "Trace.ecore";
//	public final static String Trace_MM_NAME = "TM";
//	/**Name to be given to the trace models resulting from transformation execution**/
//	public final static String Trace_OutModel_Name = "Trace_out";
//	
//	//For executing the transformation that joins the models, we also need some parameters
//	//Next we specify the Joint Metamodel where both metamodels are merged
//	//public final static String Joint_MM = "JointMM.ecore";
//	public final static String Joint_MM = "JointMM_UML2ER.ecore";
//	/* Provided we have the following transformation to merge input/output models
//	 * module MergeModels;
//	 * create OUT : JointModel from IN1 : BibTexModel, IN2 : DocBookModel;
//	 * Then we have the following parameters:
//	 */
//	public final static String IN_MM_NAME_TRAFO1 = "SimpleUML";
//	public final static String IN_MM_NAME_TRAFO2 = "ER";
//	public final static String OUT_MM_NAME_TRAFO = "JointModel";
//	public final static String IN_MODEL_NAME_TRAFO1 = "IN1";
//	public final static String IN_MODEL_NAME_TRAFO2 = "IN2";
//	public final static String OUT_MODEL_NAME_TRAFO = "OUT";
//	public final static String TRANSFO_MODULE_MERGE = "MergeModels"; //Name of the transformation file
//////	
////	/**Take also into account the following to be touched within the code**/
//	/**We have also added the following in the main method**/
//	//JointPackage_UML2ERPackage.eINSTANCE.eClass();
//	
//	/**Finally, we also have to change the following line, which is in method getListResultVector
//	 * We have to put the corresponding JointPackage**/
//	//helper.setContext(JointPackage_BibTeX2DocBookPackage.Literals.JOINT_MM);
//	/**************************** END OF PARAMETERS FOR THE UML2ER EXAMPLE ********************************/
	
/**In order to activate the execution of the Ecore2Maude case study, uncomment lines 324 - 479   
 * To do so, select all those lines and press Shit+Control+c (the same must be done, once uncommented, to comment them again). 
 * Please note that some lines will keep commented.
 * In order to execute a particular mutant, uncomment the specific lines of the variables
 * "Transformation_Name" and "Buggy_rules". Please note that only one variable of each must be uncommented.
 * Also, please note that when enabling the execution of this case study, the lines of all other case studies must be commented.
 * Finally, lines 701, 702 must be commented, and line 709 must be uncommented. Also, line 938 must be uncommented and lines 935, 936, 937, 939 commented
 * **/	
//	/**************************** PARAMETERS FOR THE Ecore2Maude EXAMPLE ********************************/
//	
//	/**We need the canonical path in order to navigate the subfolders**/
//	final static String executionsCanPath = "models_Ecore2Maude";
//	/**Name of the folder that contains the transformations**/
//	final static String folderTransformations = "transformations";
//	/**This is the name given to the model resulting from joining the source and target models of a transformation**/
//	final static String Joint_Model_Name = "JointModel";
//	/**Name of the file with the transformation and the Buggy_rule. Note: the latter is used for the automatic computation of the EXAM metric**/
//	/**The following combinations (pairs of the two above variables) are correct for this case study**/
//	final static String Transformation_Name = "Ecore2Maude_Mutant1";
//	final static List<String> Buggy_rules = Arrays.asList("EmptyList");
////	final static String Transformation_Name = "Ecore2Maude_Mutant2";
////	final static List<String> Buggy_rules = Arrays.asList("EqName");
////	final static String Transformation_Name = "Ecore2Maude_Mutant3";
////	final static List<String> Buggy_rules = Arrays.asList("Initialize");
////	final static String Transformation_Name = "Ecore2Maude_Mutant4";
////	final static List<String> Buggy_rules = Arrays.asList("Class2Sort");	
////	final static String Transformation_Name = "Ecore2Maude_Mutant5";
////	final static List<String> Buggy_rules = Arrays.asList("Class2Sort");	
////	final static String Transformation_Name = "Ecore2Maude_Mutant6";
////	final static List<String> Buggy_rules = Arrays.asList("Initialize");
////	final static String Transformation_Name = "Ecore2Maude_Mutant7";
////	final static List<String> Buggy_rules = Arrays.asList("Initialize");
////	final static String Transformation_Name = "Ecore2Maude_Mutant8";
////	final static List<String> Buggy_rules = Arrays.asList("Class2Sort");
////	final static String Transformation_Name = "Ecore2Maude_Mutant9";
////	final static List<String> Buggy_rules = Arrays.asList("Class2Sort");
////	final static String Transformation_Name = "Ecore2Maude_Mutant10";
////	final static List<String> Buggy_rules = Arrays.asList("Reference2Operation");
////	final static String Transformation_Name = "Ecore2Maude_Mutant11";
////	final static List<String> Buggy_rules = Arrays.asList("Attribute2Operation");
////	final static String Transformation_Name = "Ecore2Maude_Mutant12";
////	final static List<String> Buggy_rules = Arrays.asList("Attribute2Operation");
////	final static String Transformation_Name = "Ecore2Maude_Mutant13";
////	final static List<String> Buggy_rules = Arrays.asList("Enum2Sort");
////	final static String Transformation_Name = "Ecore2Maude_Mutant14";
////	final static List<String> Buggy_rules = Arrays.asList("Enum2Sort");
////	final static String Transformation_Name = "Ecore2Maude_Mutant15";
////	final static List<String> Buggy_rules = Arrays.asList("EnumLiteral2Operation");
////	final static String Transformation_Name = "Ecore2Maude_Mutant16";
////	final static List<String> Buggy_rules = Arrays.asList("MetamodelEqName");
////	final static String Transformation_Name = "Ecore2Maude_Mutant17";
////	final static List<String> Buggy_rules = Arrays.asList("Reference2Operation");	
////	final static String Transformation_Name = "Ecore2Maude_Mutant18";
////	final static List<String> Buggy_rules = Arrays.asList("Package2Operation");	
////	final static String Transformation_Name = "Ecore2Maude_Mutant19";
////	final static List<String> Buggy_rules = Arrays.asList("Initialize");
////	final static String Transformation_Name = "Ecore2Maude_Mutant20";
////	final static List<String> Buggy_rules = Arrays.asList("Class2Sort");	
////	final static String Transformation_Name = "Ecore2Maude_Mutant21";
////	final static List<String> Buggy_rules = Arrays.asList("EqType");
////	final static String Transformation_Name = "Ecore2Maude_Mutant22";
////	final static List<String> Buggy_rules = Arrays.asList("EqLowerBound");
////	final static String Transformation_Name = "Ecore2Maude_Mutant23";
////	final static List<String> Buggy_rules = Arrays.asList("EqUpperBound");
////	final static String Transformation_Name = "Ecore2Maude_Mutant24";
////	final static List<String> Buggy_rules = Arrays.asList("Reference2Operation");
////	final static String Transformation_Name = "Ecore2Maude_Mutant25";
////	final static List<String> Buggy_rules = Arrays.asList("EqContainingClass");
////	final static String Transformation_Name = "Ecore2Maude_Mutant26";
////	final static List<String> Buggy_rules = Arrays.asList("Attribute2Operation");
////	final static String Transformation_Name = "Ecore2Maude_Mutant27";
////	final static List<String> Buggy_rules = Arrays.asList("RefEqOpposite");
////	final static String Transformation_Name = "Ecore2Maude_Mutant28";
////	final static List<String> Buggy_rules = Arrays.asList("EqIsUnique");
////	final static String Transformation_Name = "Ecore2Maude_Mutant29";
////	final static List<String> Buggy_rules = Arrays.asList("Attribute2Operation");
////	final static String Transformation_Name = "Ecore2Maude_Mutant30";
////	final static List<String> Buggy_rules = Arrays.asList("EqPackage");
////	final static String Transformation_Name = "Ecore2Maude_Mutant31";
////	final static List<String> Buggy_rules = Arrays.asList("EnumEqMetaAux");
////	final static String Transformation_Name = "Ecore2Maude_Mutant32";
////	final static List<String> Buggy_rules = Arrays.asList("Class2Sort");
////	final static String Transformation_Name = "Ecore2Maude_Mutant33";
////	final static List<String> Buggy_rules = Arrays.asList("Attribute2Operation");
////	final static String Transformation_Name = "Ecore2Maude_Mutant34";
////	final static List<String> Buggy_rules = Arrays.asList("MetamodelEqName", "MetamodelEqPackages");
////	final static String Transformation_Name = "Ecore2Maude_Mutant35";
////	final static List<String> Buggy_rules = Arrays.asList("EnumEqMetaAux", "EnumEqDefaultValue");
////	final static String Transformation_Name = "Ecore2Maude_Mutant36";
////	final static List<String> Buggy_rules = Arrays.asList("EqLowerBound", "EqUpperBound");
////	final static String Transformation_Name = "Ecore2Maude_Mutant37";
////	final static List<String> Buggy_rules = Arrays.asList("Class2Sort", "Reference2Operation");
////	final static String Transformation_Name = "Ecore2Maude_Mutant38";
////	final static List<String> Buggy_rules = Arrays.asList("EqIsOrdered", "EqIsUnique");
////	final static String Transformation_Name = "Ecore2Maude_Mutant39";
////	final static List<String> Buggy_rules = Arrays.asList("EnumLiteral2Operation", "Attribute2Operation");
////	final static String Transformation_Name = "Ecore2Maude_Mutant40";
////	final static List<String> Buggy_rules = Arrays.asList("ClassEqAttributes", "EqType");
////	final static String Transformation_Name = "Ecore2Maude_Mutant41";
////	final static List<String> Buggy_rules = Arrays.asList("ClassEqIsAbstract", "EqPackage", "ClassEqSuperTypes");
////	final static String Transformation_Name = "Ecore2Maude_Mutant42";
////	final static List<String> Buggy_rules = Arrays.asList("Initialize", "Package2Operation", "PackEqMetamodel", "PackEqSupPackage", "PackEqSubPackages", "PackEqClasses", "EqPackage");
////	final static String Transformation_Name = "Ecore2Maude_Mutant43";
////	final static List<String> Buggy_rules = Arrays.asList("PackEqMetamodel", "PackEqSupPackage", "PackEqSubPackages");
////	final static String Transformation_Name = "Ecore2Maude_Mutant44";
////	final static List<String> Buggy_rules = Arrays.asList("Initialize", "Class2Sort");
////	final static String Transformation_Name = "Ecore2Maude_Mutant45";
////	final static List<String> Buggy_rules = Arrays.asList("Class2Sort", "Attribute2Operation");
////	final static String Transformation_Name = "Ecore2Maude_Mutant46";
////	final static List<String> Buggy_rules = Arrays.asList("Attribute2Operation", "Enum2Sort");
////	final static String Transformation_Name = "Ecore2Maude_Mutant47";
////	final static List<String> Buggy_rules = Arrays.asList("EqPackage", "EnumEqMetaAux");
////	final static String Transformation_Name = "Ecore2Maude_Mutant48";
////	final static List<String> Buggy_rules = Arrays.asList("Class2Sort", "EqType");
////	final static String Transformation_Name = "Ecore2Maude_Mutant49";
////	final static List<String> Buggy_rules = Arrays.asList("Initialize", "Reference2Operation");
////	final static String Transformation_Name = "Ecore2Maude_Mutant50";
////	final static List<String> Buggy_rules = Arrays.asList("EqUpperBound", "EqContainingClass");
//	
//	/**Name of the file with the OCL constraints**/
//	final static String OCL_File_Name = "OCL_Constraints.txt";
//	/**Name of the file where the results will be printed**/
//	final static String Results_File_Name = "suspiciousnessResults.csv";	
//	/**Name and extension of input MM**/
//	public final static String IN_MM = "ecore.ecore";
//	/**Name as it is in the ATL transformation**/
//	public final static String IN_MM_NAME = "Ecore";
//	/**Name and extension of output MM**/
//	public final static String OUT_MM = "Maude.ecore";
//	/**Name as it is in the ATL transformation**/
//	public final static String OUT_MM_NAME = "Maude";
//	/**Name of the Trace metamodel and its name within the transformation**/
//	public final static String Trace_MM = "Trace.ecore";
//	public final static String Trace_MM_NAME = "TM";
//	/**Name to be given to the trace models resulting from transformation execution**/
//	public final static String Trace_OutModel_Name = "Trace_out";
//	
//	//For executing the transformation that joins the models, we also need some parameters
//	//Next we specify the Joint Metamodel where both metamodels are merged
//	//public final static String Joint_MM = "JointMM.ecore";
//	public final static String Joint_MM = "JointMM_Ecore2Maude.ecore";
//	/* Provided we have the following transformation to merge input/output models
//	 * module MergeModels;
//	 * create OUT : JointModel from IN1 : BibTexModel, IN2 : DocBookModel;
//	 * Then we have the following parameters:
//	 */
//	public final static String IN_MM_NAME_TRAFO1 = "Ecore";
//	public final static String IN_MM_NAME_TRAFO2 = "Maude";
//	public final static String OUT_MM_NAME_TRAFO = "JointModel";
//	public final static String IN_MODEL_NAME_TRAFO1 = "IN1";
//	public final static String IN_MODEL_NAME_TRAFO2 = "IN2";
//	public final static String OUT_MODEL_NAME_TRAFO = "OUT";
//	public final static String TRANSFO_MODULE_MERGE = "MergeModels"; //Name of the transformation file
//	
//	/**Take also into account the following to be touched within the code**/
////	In this case study, we have to execute ATL_EMF_Launcher.executeATLTransformation2 for joining the source and target models
//	
//	/**We have also added the following in the main method**/
////	JointPackage_Ecore2MaudePackage.eINSTANCE.eClass();
//	
//	/**Finally, we also have to change the following line, which is in method getListResultVector
//	 * We have to put the corresponding JointPackage**/
////	helper.setContext(JointPackage_BibTeX2DocBookPackage.Literals.JOINT_MM);
//	/**************************** END OF PARAMETERS FOR THE Ecore2Maude EXAMPLE ********************************/	
	
/**In order to activate the execution of the CPL2SPL case study, uncomment lines 489 - 644   
 * To do so, select all those lines and press Shit+Control+c (the same must be done, once uncommented, to comment them again). 
 * Please note that some lines will keep commented.
 * In order to execute a particular mutant, uncomment the specific lines of the variables
 * "Transformation_Name" and "Buggy_rules". Please note that only one variable of each must be uncommented.
 * Also, please note that when enabling the execution of this case study, the lines of all other case studies must be commented.
 * Finally, lines 701, 702 must be commented, and 709 line must be uncommented. Also, line 939 must be uncommented and lines 935-938 commented
 * **/	
//	/**************************** PARAMETERS FOR THE CPL2SPL EXAMPLE ********************************/
//	
//	/**We need the canonical path in order to navigate the subfolders**/
//	final static String executionsCanPath = "models_CPL2SPL";
//	/**Name of the folder that contains the transformations**/
//	final static String folderTransformations = "transformations";
//	/**This is the name given to the model resulting from joining the source and target models of a transformation**/
//	final static String Joint_Model_Name = "JointModel";
//	/**Name of the file with the transformation and the Buggy_rule. Note: the latter is used for the automatic computation of the EXAM metric**/
//	/**The following combinations (pairs of the two above variables) are correct for this case study**/
////	final static String Transformation_Name = "CPL2SPL_Mutant1";
////	final static List<String> Buggy_rules = Arrays.asList("Proxy2Select");
////	final static String Transformation_Name = "CPL2SPL_Mutant2";
////	final static List<String> Buggy_rules = Arrays.asList("CPL2Program");
////	final static String Transformation_Name = "CPL2SPL_Mutant3";
////	final static List<String> Buggy_rules = Arrays.asList("Redirection2SelectCase");
////	final static String Transformation_Name = "CPL2SPL_Mutant4";
////	final static List<String> Buggy_rules = Arrays.asList("Redirect2Return");
////	final static String Transformation_Name = "CPL2SPL_Mutant5";
////	final static List<String> Buggy_rules = Arrays.asList("Busy2SelectCase");
////	final static String Transformation_Name = "CPL2SPL_Mutant6";
////	final static List<String> Buggy_rules = Arrays.asList("SubAction2Function");
////	final static String Transformation_Name = "CPL2SPL_Mutant7";
////	final static List<String> Buggy_rules = Arrays.asList("Redirect2Return");
////	final static String Transformation_Name = "CPL2SPL_Mutant8";
////	final static List<String> Buggy_rules = Arrays.asList("SubAction2Function");
////	final static String Transformation_Name = "CPL2SPL_Mutant9";
////	final static List<String> Buggy_rules = Arrays.asList("Outgoing2Method");
////	final static String Transformation_Name = "CPL2SPL_Mutant10";
////	final static List<String> Buggy_rules = Arrays.asList("Outgoing2Method");
////	final static String Transformation_Name = "CPL2SPL_Mutant11";
////	final static List<String> Buggy_rules = Arrays.asList("NotPresent2ErrorResponse");
////	final static String Transformation_Name = "CPL2SPL_Mutant12";
////	final static List<String> Buggy_rules = Arrays.asList("CPL2Program");
////	final static String Transformation_Name = "CPL2SPL_Mutant13";
////	final static List<String> Buggy_rules = Arrays.asList("SubAction2Function");
////	final static String Transformation_Name = "CPL2SPL_Mutant14";
////	final static List<String> Buggy_rules = Arrays.asList("Busy2SelectCase");
////	final static String Transformation_Name = "CPL2SPL_Mutant15";
////	final static List<String> Buggy_rules = Arrays.asList("Redirection2SelectCase");
////	final static String Transformation_Name = "CPL2SPL_Mutant16";
////	final static List<String> Buggy_rules = Arrays.asList("Redirect2Return");
////	final static String Transformation_Name = "CPL2SPL_Mutant17";
////	final static List<String> Buggy_rules = Arrays.asList("Redirection2SelectCase");
////	final static String Transformation_Name = "CPL2SPL_Mutant18";
////	final static List<String> Buggy_rules = Arrays.asList("CPL2Program");	
////	final static String Transformation_Name = "CPL2SPL_Mutant19";
////	final static List<String> Buggy_rules = Arrays.asList("Redirection2SelectCase");	
////	final static String Transformation_Name = "CPL2SPL_Mutant20";
////	final static List<String> Buggy_rules = Arrays.asList("Proxy2Select");
////	final static String Transformation_Name = "CPL2SPL_Mutant21";
////	final static List<String> Buggy_rules = Arrays.asList("CPL2Program");
////	final static String Transformation_Name = "CPL2SPL_Mutant22";
////	final static List<String> Buggy_rules = Arrays.asList("Outgoing2Method");	
////	final static String Transformation_Name = "CPL2SPL_Mutant23";
////	final static List<String> Buggy_rules = Arrays.asList("AddressSwitch2SelectStat");
////	final static String Transformation_Name = "CPL2SPL_Mutant24";
////	final static List<String> Buggy_rules = Arrays.asList("Proxy2Select");	
////	final static String Transformation_Name = "CPL2SPL_Mutant25";
////	final static List<String> Buggy_rules = Arrays.asList("SubCall2Return");	
////	final static String Transformation_Name = "CPL2SPL_Mutant26";
////	final static List<String> Buggy_rules = Arrays.asList("CPL2Program");	
////	final static String Transformation_Name = "CPL2SPL_Mutant27";
////	final static List<String> Buggy_rules = Arrays.asList("SwitchedAddress2SelectCase");	
////	final static String Transformation_Name = "CPL2SPL_Mutant28";
////	final static List<String> Buggy_rules = Arrays.asList("AddressSwitch2SelectStat");	
////	final static String Transformation_Name = "CPL2SPL_Mutant29";
////	final static List<String> Buggy_rules = Arrays.asList("SubCall2Return");
////	final static String Transformation_Name = "CPL2SPL_Mutant30";
////	final static List<String> Buggy_rules = Arrays.asList("Redirect2Return");
////	final static String Transformation_Name = "CPL2SPL_Mutant31";
////	final static List<String> Buggy_rules = Arrays.asList("SubAction2Function");
////	final static String Transformation_Name = "CPL2SPL_Mutant32";
////	final static List<String> Buggy_rules = Arrays.asList("CPL2Program");
////	final static String Transformation_Name = "CPL2SPL_Mutant33";
////	final static List<String> Buggy_rules = Arrays.asList("Proxy2Select");	
////	final static String Transformation_Name = "CPL2SPL_Mutant34";
////	final static List<String> Buggy_rules = Arrays.asList("SwitchedAddress2SelectCase");	
////	final static String Transformation_Name = "CPL2SPL_Mutant35";
////	final static List<String> Buggy_rules = Arrays.asList("Otherwise2SelectDefault");	
////	final static String Transformation_Name = "CPL2SPL_Mutant36";
////	final static List<String> Buggy_rules = Arrays.asList("Proxy2Select");	
////	final static String Transformation_Name = "CPL2SPL_Mutant37";
////	final static List<String> Buggy_rules = Arrays.asList("NoAnswer2SelectCase", "Redirection2SelectCase");	
////	final static String Transformation_Name = "CPL2SPL_Mutant38";
////	final static List<String> Buggy_rules = Arrays.asList("Busy2SelectCase","NoAnswer2SelectCase");	
////	final static String Transformation_Name = "CPL2SPL_Mutant39";
////	final static List<String> Buggy_rules = Arrays.asList("CPL2Program","Redirection2SelectCase");	
////	final static String Transformation_Name = "CPL2SPL_Mutant40";
////	final static List<String> Buggy_rules = Arrays.asList("SubAction2Function","Outgoing2Method");
////	final static String Transformation_Name = "CPL2SPL_Mutant41";
////	final static List<String> Buggy_rules = Arrays.asList("Busy2SelectCase","Redirect2Return");
////	final static String Transformation_Name = "CPL2SPL_Mutant42";
////	final static List<String> Buggy_rules = Arrays.asList("CPL2Program","Redirection2SelectCase");
////	final static String Transformation_Name = "CPL2SPL_Mutant43";
////	final static List<String> Buggy_rules = Arrays.asList("CPL2Program","Proxy2Select");
////	final static String Transformation_Name = "CPL2SPL_Mutant44";
////	final static List<String> Buggy_rules = Arrays.asList("SubCall2Return","Redirect2Return");	
////	final static String Transformation_Name = "CPL2SPL_Mutant45";
////	final static List<String> Buggy_rules = Arrays.asList("Redirection2SelectCase","SubAction2Function");	
////	final static String Transformation_Name = "CPL2SPL_Mutant46";
////	final static List<String> Buggy_rules = Arrays.asList("SwitchedAddress2SelectCase","Proxy2Select");	
////	final static String Transformation_Name = "CPL2SPL_Mutant47";
////	final static List<String> Buggy_rules = Arrays.asList("Main","SubAction2Function");	
////	final static String Transformation_Name = "CPL2SPL_Mutant48";
////	final static List<String> Buggy_rules = Arrays.asList("Outgoing2Method","Proxy2Select");	
////	final static String Transformation_Name = "CPL2SPL_Mutant49";
////	final static List<String> Buggy_rules = Arrays.asList("SubCall2Return","Redirect2Return");	
//	final static String Transformation_Name = "CPL2SPL_Mutant50";
//	final static List<String> Buggy_rules = Arrays.asList("Redirect2Return","SubAction2Function");	
////
//	/**Name of the file with the OCL constraints**/
//	final static String OCL_File_Name = "OCL_Constraints.txt";
//	/**Name of the file where the results will be printed**/
//	final static String Results_File_Name = "suspiciousnessResults.csv";	
//	/**Name and extension of input MM**/
//	public final static String IN_MM = "CPL.ecore";
//	/**Name as it is in the ATL transformation**/
//	public final static String IN_MM_NAME = "CPL";
//	/**Name and extension of output MM**/
//	public final static String OUT_MM = "SPL.ecore";
//	/**Name as it is in the ATL transformation**/
//	public final static String OUT_MM_NAME = "SPL";
//	/**Name of the Trace metamodel and its name within the transformation**/
//	public final static String Trace_MM = "Trace.ecore";
//	public final static String Trace_MM_NAME = "TM";
//	/**Name to be given to the trace models resulting from transformation execution**/
//	public final static String Trace_OutModel_Name = "Trace_out";
//	
//	//For executing the transformation that joins the models, we also need some parameters
//	//Next we specify the Joint Metamodel where both metamodels are merged
//	//public final static String Joint_MM = "JointMM.ecore";
//	public final static String Joint_MM = "JointMM_CPL2SPL.ecore";
//	/* Provided we have the following transformation to merge input/output models
//	 * module MergeModels;
//	 * create OUT : JointModel from IN1 : BibTexModel, IN2 : DocBookModel;
//	 * Then we have the following parameters:
//	 */
//	public final static String IN_MM_NAME_TRAFO1 = "CPL";
//	public final static String IN_MM_NAME_TRAFO2 = "SPL";
//	public final static String OUT_MM_NAME_TRAFO = "JointModel";
//	public final static String IN_MODEL_NAME_TRAFO1 = "IN1";
//	public final static String IN_MODEL_NAME_TRAFO2 = "IN2";
//	public final static String OUT_MODEL_NAME_TRAFO = "OUT";
//	public final static String TRANSFO_MODULE_MERGE = "MergeModels"; //Name of the transformation file
//	
//	/**Take also into account the following to be touched within the code**/
////	In this case study, we have to execute ATL_EMF_Launcher.executeATLTransformation2 for joining the source and target models
////	
////	/**We have also added the following in the main method**/
////	//JointPackage_Ecore2MaudePackage.eINSTANCE.eClass();
////	
////	/**Finally, we also have to change the following line, which is in method getListResultVector
////	 * We have to put the corresponding JointPackage**/
////	//helper.setContext(JointPackage_BibTeX2DocBookPackage.Literals.JOINT_MM);
//	/**************************** END OF PARAMETERS FOR THE CPL2SPL EXAMPLE ********************************/
	
	
	static Random randomGenerator = new Random();
	

	public static void main(String[] args) throws ParserException, IOException, ATLCoreException, InterruptedException  {
		long startTime = System.nanoTime();
		
		//These two lines must always go there, and the respective packages have to be in 'src'		
		ATLPackage.eINSTANCE.eClass();
		TracePackage.eINSTANCE.eClass();
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
				
		/**In this method, several transformations, both in EMF and EMFTVM execution models are automatically launched.
		 * We have generalized the executions of the latter so that any number of source models can be taken as input and any number
		 * of target models can be produced as output. For this reason, we create lists with the names/paths of
		 * source/target models and metamodels**/
		//The following list keeps the paths of all the input metamodels, the path from the executionsCanPath
		List<String> IN_MM_PATHS = new ArrayList<String>();
		//The following list keeps the paths of all the output metamodels, the path from the executionsCanPath
		List<String> OUT_MM_PATHS = new ArrayList<String>();
		//The following list keeps the names of all the input metamodels in the transformation
		List<String> IN_MM_NAMES_TRAFO = new ArrayList<String>();
		//The following list keeps the names of all the output metamodels in the transformation
		List<String> OUT_MM_NAMES_TRAFO = new ArrayList<String>();	
		//The following list keeps the paths of all the input models, the path from the executionsCanPath
		List<String> IN_MODEL_PATHS = new ArrayList<String>();
		//The following list keeps the paths of all the output models, the path from the executionsCanPath
		List<String> OUT_MMODEL_PATHS = new ArrayList<String>();
		//The following list keeps the names of all the input models in the transformation (the typical "IN")
		List<String> IN_MODEL_NAMES_TRAFO = new ArrayList<String>();
		//The following list keeps the names of all the output models in the transformation (the typical "OUT")
		List<String> OUT_MODEL_NAMES_TRAFO = new ArrayList<String>();
		
		/**We call the corresponding method to execute all the transformations**/
		ATL_EMF_Launcher.executeATLTransformation(executionsCanPath, folderTransformations, IN_MM, OUT_MM, Joint_MM, 
				IN_MM_NAME, OUT_MM_NAME, Trace_MM_NAME,	Trace_OutModel_Name, Transformation_Name, numExecutions);
		
		/**Now we call the corresponding method to execute the transformations to join in one model the source and target models of the 
		 * transformations executed in the previous step. 
		 * In most cases, the following EMFTVM model transformation is used.
		 * For generalization purposes, we have prepared this transformation to admit several source and target models/metamodels. For this reason, we first create lists.
		 * Select the following transformation for the
		 * Class2Relational case study
		 * BibTeX2DocBook case study
		 * UML2ER case study**/
		IN_MM_PATHS.add(IN_MM);
		IN_MM_PATHS.add(OUT_MM);
		OUT_MM_PATHS.add(Joint_MM);
		IN_MM_NAMES_TRAFO.add(IN_MM_NAME_TRAFO1);
		IN_MM_NAMES_TRAFO.add(IN_MM_NAME_TRAFO2);
		OUT_MM_NAMES_TRAFO.add(OUT_MM_NAME_TRAFO);
		IN_MODEL_NAMES_TRAFO.add(IN_MODEL_NAME_TRAFO1);
		IN_MODEL_NAMES_TRAFO.add(IN_MODEL_NAME_TRAFO2);
		OUT_MODEL_NAMES_TRAFO.add(OUT_MODEL_NAME_TRAFO);
		ATL_EMFTVM_Launcher.executeATLTransformationSeveralTimes(executionsCanPath, IN_MM_PATHS, OUT_MM_PATHS, IN_MM_NAMES_TRAFO, OUT_MM_NAMES_TRAFO, IN_MODEL_NAMES_TRAFO,OUT_MODEL_NAMES_TRAFO,
														null, null,	executionsCanPath + "/", TRANSFO_MODULE_MERGE,	numExecutions);	
		
		/**In some other cases, we need an EMF model transformation, since the previous one does not work as desired
		 * Select the following transformation for the
		 * Ecore2Maude case study
		 * CPL2SPL case study
		 */
//		ATL_EMF_Launcher.executeATLTransformation2(executionsCanPath, folderTransformations, IN_MM, OUT_MM, Joint_MM, IN_MM_NAME, OUT_MM_NAME, OUT_MM_NAME_TRAFO, TRANSFO_MODULE_MERGE, numExecutions);	

		//The following line produces an error, but then it continues and it is executed properly
		System.out.println("If the error \"java.lang.ClassCastException: org.eclipse.emf.ecore.impl.EFactoryImpl cannot be cast to jointPackage.JointPackageFactory\" comes next, simply ignore it.");
		//JointPackagePackage.eINSTANCE.eClass();
		JointPackage_BibTeX2DocBookPackage.eINSTANCE.eClass();
		JointPackage_UML2ERPackage.eINSTANCE.eClass();
		JointPackage_Ecore2MaudePackage.eINSTANCE.eClass();
		JointPackage_CPL2SPLPackage.eINSTANCE.eClass();
				
		List<String> rulesNames = new ArrayList<String>(); //In this list we will store the names of the rules of the MT
		List<int[]> listResultVector = new ArrayList<int[]>(); //In this list we will keep all the result vectors
		Map<String, int[]> rulesExecutions = new HashMap<String, int[]>();//See description below
		/* This is a HashMap with the name of a rule and an array with the number of executions of such rule in each scenario. 
		 * Map<RuleName, List[Executions in Scenario1, Executions in Scenario2,...]>. Example:
		 * {"Rule1", [1,2,0,3,4]}, {"Rule2", [2,0,4,3,1]}, ...
		 */
		
		//Code to count the number of folders (number of scenarios) in our scenarios path
		//This piece of code uses Java 8
		long numScenarios = Files.find(Paths.get(executionsCanPath),
				1, // how deep do we want to descend
				(path, attributes) -> attributes.isDirectory()
		).count() - 1; // -1 because 'scenarios' is also counted		
		
		
		/**Let us save in rulesNames the names of all the rules of the MT, except the one for creating the trace model, named "createTrace" **/
		rulesNames = getRulesNamesFromMT();
		System.out.println("Names of the rules: " + rulesNames);
		
		/**Let us store the number of times each rule is executed for each scenario. It is sufficient this is done only once, not for each OCL expression **/
		rulesExecutions = getRulesExecutions(rulesNames, numExecutions);
	
		///////////////Simply for printing in the console:
		System.out.println("Rules executions: " + rulesExecutions + "\n");
		Iterator<String> it = rulesExecutions.keySet().iterator();
		System.out.println("***In the following it is printed, for each rule, how many times it is executed in each of the " + numExecutions + " executions***");
		while (it.hasNext()){
			String next = it.next();
			int[] executions = rulesExecutions.get(next);
			System.out.print("\nRule: " + next + ", number of executions: ");
			for (int n : executions){
				System.out.print(n + " ");
			}
		}
		System.out.println("\n");	
		/////////////		
		
		/** For each OCL constraint that we have in our file with the OCL constraints, we store an array where, for each scenario, we 
		 * write 1 if the constraint fails and 0 if it does not fail
		 */
		//listResultVector = getListResultVector(numScenarios);
		listResultVector = getListResultVector(numExecutions);
		
		///////////////Simply for printing in the console:
		System.out.println("***For each of the " + numExecutions + " executions, the following displays, for each OCL constraint, a '1' if the constraint fails and a '0' if it does not***");
		System.out.println("Please note, when no OCL constraint fails, the suspiciousness results will be 0 or NaN");
		int k = 1;
		for (int[] array : listResultVector){
			System.out.print("OCL" + k + ": ");
			for (int n : array){
				System.out.print(n);
			}
			System.out.println();
			k++;
		}
		/////////////
		

		/**Here we calculate the different values for the formulas: Ncf, Nuf, Ncs, etc **/		
		 /* For each OCL, we will keep for each rule a value for each variable. For example:
		  * "OCL1": {"Rule1", {"Ncf", 9}, {"Nuf", 0}, {"Ncs", 5}, ...}, {"Rule2", {"Ncf", 3}, {"Nuf", 5}, {"Ncs", 4}, ...}
		 *  "OCL2": {"Rule1", {"Ncf", 4}, {"Nuf", 1}, {"Ncs", 2}, ...}, {"Rule2", {"Ncf", 3}, {"Nuf", 5}, {"Ncs", 4}, ...}
		 */
		 Map<String, Map<String, Map<String, Double>>> measures = getMeasures(listResultVector, rulesNames, rulesExecutions);

		/**For each OCL expression, we have to calculate the suspiciousness of each rule with the different formulae**/
		/* "OCL1"={"Rule1", 0.9345}, {"Rule2", 0.123},...
		 * "OCL2"={"Rule1", 0.445}, {"Rule2", 0.001},...
		 */
		Map<String,Map<String, Double>> suspTarantula = getSuspiciousness(measures, "tarantula");
		Map<String,Map<String, Double>> suspOchiai = getSuspiciousness(measures, "ochiai");
		Map<String,Map<String, Double>> suspOchiai2 = getSuspiciousness(measures, "ochiai2");
		Map<String,Map<String, Double>> suspBraunBanquet = getSuspiciousness(measures, "braunbanquet");
		Map<String,Map<String, Double>> suspMountford = getSuspiciousness(measures, "mountford");
		Map<String,Map<String, Double>> suspArithmeticMean = getSuspiciousness(measures, "arithmeticmean");
		Map<String,Map<String, Double>> suspZoltar = getSuspiciousness(measures, "zoltar");
		Map<String,Map<String, Double>> suspSimpleMatching = getSuspiciousness(measures, "simplematching");
		Map<String,Map<String, Double>> suspRusselRao = getSuspiciousness(measures, "russelrao");
		Map<String,Map<String, Double>> suspKulcynski2 = getSuspiciousness(measures, "kulcynski2");
		Map<String,Map<String, Double>> suspCohen = getSuspiciousness(measures, "cohen");
		Map<String,Map<String, Double>> suspPierce = getSuspiciousness(measures, "pierce");
		Map<String,Map<String, Double>> suspBaroniEtAl = getSuspiciousness(measures, "baronietal");
		Map<String,Map<String, Double>> suspPhi = getSuspiciousness(measures, "phi");
		Map<String,Map<String, Double>> suspRogersTanimoto = getSuspiciousness(measures, "rogerstanimoto");
		Map<String,Map<String, Double>> suspOp2 = getSuspiciousness(measures, "op2");
		Map<String,Map<String, Double>> suspBarinel = getSuspiciousness(measures, "barinel");
		Map<String,Map<String, Double>> suspDStar = getSuspiciousness(measures, "DStar");
		
		/**We create an structure where to put all the measurements with the different techniques together**/
		/**Those added in the following are those that will appear in the results**/
		Map<String,Map<String,Map<String, Double>>> allSuspiciousness = new HashMap<String,Map<String,Map<String, Double>>>();
		allSuspiciousness.put("Tarantula", suspTarantula);
		allSuspiciousness.put("Ochiai", suspOchiai);
		allSuspiciousness.put("Ochiai2", suspOchiai2);
		allSuspiciousness.put("Braun-Banquet", suspBraunBanquet);
		allSuspiciousness.put("Mountford", suspMountford);
		allSuspiciousness.put("Arithmetic Mean", suspArithmeticMean);
		allSuspiciousness.put("Zoltar", suspZoltar);
		allSuspiciousness.put("Simple Matching", suspSimpleMatching);
		allSuspiciousness.put("Russel Rao", suspRusselRao);
		allSuspiciousness.put("Kulcynski2", suspKulcynski2);
		allSuspiciousness.put("Cohen", suspCohen);
		allSuspiciousness.put("Pierce", suspPierce);
		allSuspiciousness.put("Baroni-Urbani & Buser", suspBaroniEtAl);
		allSuspiciousness.put("Phi", suspPhi);
		allSuspiciousness.put("Rogers & Tanimoto", suspRogersTanimoto);
		allSuspiciousness.put("Op2", suspOp2);
		allSuspiciousness.put("Barinel", suspBarinel);
		allSuspiciousness.put("DStar", suspDStar);

		/**Finally, we print the results of the suspiciousness in several CSV files**/
		if (printResultsInCSVBooks(listResultVector, allSuspiciousness, measures, rulesExecutions)){
			System.out.println("\n\n************The results have been generated successfully!!************");
			System.out.println("A summary of the results can be found in " + executionsCanPath + "/results/" + Transformation_Name + "--" + Results_File_Name);
			System.out.println("Also, a file for each violated OCL assertion is generated in " + executionsCanPath + "/results/" + Transformation_Name + "--OCLX.csv");		
		}

		long totalTime = System.nanoTime() - startTime;
		System.out.println("\n The whole execution has taken " + TimeUnit.NANOSECONDS.toMillis(totalTime) + " miliseconds.");
	}
	
	/**
	 * 
	 * @return  This method returns a list with the names of the rules (except if a rule is called "createTrace") of a model transformation (MT).
	 * The MT is loaded in its model representation according to the path specified by the global vbles executionsCanPath and transformationName
	 */
	public static List<String >getRulesNamesFromMT(){
		List<String> result = new ArrayList<String>();
		
		//Let's load the transformation (in model representation), this is for storing the names of the rules
		ResourceSet resourceSetMT = new ResourceSetImpl();
		resourceSetMT.getResource(URI.createFileURI(executionsCanPath + "/" + folderTransformations + "/" + Transformation_Name + ".xmi"), true);
		Resource resourceMT = resourceSetMT.getResources().get(0);
		EObject mtMainModule = EcoreUtil.getRootContainer(resourceMT.getContents().get(0));
		System.out.println("The Module container of the MT is: " + mtMainModule);
		//Let's now store the names of the rules in the ruleNames variable
		for (EObject r : (List<EObject>) mtMainModule.eGet(mtMainModule.eClass().getEStructuralFeature("elements"))){
			if (r instanceof Rule) {
				String ruleName = (String) r.eGet(r.eClass().getEStructuralFeature("name"));
				if (!ruleName.equals("createTrace")) result.add(ruleName);
			}
		}
		return result;
	}
	
	/**
	 * 
	 * @param rulesNames is a list with the names of the rules of the MT
	 * @param numScenarios is the number of scenarios that have been executed for the MT. Therefore, in the path we 
	 * must have a folder called scenarioX for each of the scenarios
	 * @return It returns a Map where the key is the name of the rule and the value is an array with the number of executions of such rule in each scenario. 
	 * Map<RuleName, List[Executions in Scenario1, Executions in Scenario2,...]>. Example:
	 * {"Rule1", [1,2,0,3,4]}, {"Rule2", [2,0,4,3,1]}, ...
	 */
	public static Map<String, int[]> getRulesExecutions(List<String> rulesNames, long numScenarios){
		Map<String, int[]> result = new HashMap<String, int[]>();
		//Let's initialize the Map and set 0 executions for each rule in each scenario
		for (String ruleName: rulesNames) {
			int[] initializeExecutions = new int[(int) numScenarios];
			for (int i=0; i<numScenarios;i++) initializeExecutions[i]=0;
			result.put(ruleName, initializeExecutions);
		}
		
		for (int j=1; j<=numScenarios; j++){
			//We need to load the trace model
			ResourceSet resourceSetTrace = new ResourceSetImpl();
			resourceSetTrace.getResource(URI.createFileURI(executionsCanPath + "/scenarios/scenario" + j + "/" + Trace_OutModel_Name + j + ".xmi"), true);				
			Resource resourceTrace = resourceSetTrace.getResources().get(0);
			EObject rootClassTrace = EcoreUtil.getRootContainer(resourceTrace.getContents().get(0));
					
			List<EObject> traces = (List<EObject>) rootClassTrace.eGet(rootClassTrace.eClass().getEStructuralFeature("traceLinks"));
			for(EObject trace : traces){
				String ruleName = (String) trace.eGet(trace.eClass().getEStructuralFeature("ruleName"));
				int[] ruleExecutions = result.get(ruleName);
				ruleExecutions[j-1] = ruleExecutions[j-1] + 1;
				result.put(ruleName, ruleExecutions);
			}
		}
		return result;
	}
	
	/**
	 * 
	 * @param numScenarios is the number of scenarios that have been executed for the MT. Therefore, in the path we 
	 * must have a folder called scenarioX for each of the scenarios
	 * @return For each OCL constraint that we have in our file given by the global vble oclFileName, we store an array where, for each scenario, we 
	 * write 1 if the constraint fails and 0 if it does not fail. Therefore, it returns a list of arrays. The size of the arrays is given by
	 * the number of scenarios
	 * @throws IOException
	 * @throws ParserException
	 */
	public static List<int[]> getListResultVector(long numScenarios) throws IOException, ParserException{
		List<int[]> result = new ArrayList<int[]>();
		
		FileReader reader = new FileReader(executionsCanPath + "/" + OCL_File_Name);
		BufferedReader br = new BufferedReader(reader);
		
		int numOCL = 1;
		String line = br.readLine(); //For reading the file with the OCL expressions
		while (line != null){
				if (!line.equals("") && !line.substring(0,1).equals(" ") && !line.substring(0, 2).equals("--") ) { //If it is, then it is a comment or an empty line
				System.out.println("***OCL" + numOCL + " constraint processed***");	
				System.out.println(line);
				int[] resultVector = new int[(int) numScenarios]; //Array for storing the result vector for this OCL Constraint
				/**Each OCL constraint has to be tested for each scenario**/
				for (int j=1; j<=numScenarios; j++){
					//The following code is for loading the JointModel with the input and output models of the jth scenario
					ResourceSet resourceSet = new ResourceSetImpl();
					resourceSet.getResource(URI.createFileURI(executionsCanPath + "/scenarios/scenario" + j + "/" + Joint_Model_Name + j + ".xmi"), true);				
					Resource resource = resourceSet.getResources().get(0);
					EObject rootClass = EcoreUtil.getRootContainer(resource.getContents().get(0));
	
					//The following code is for checking the OCL constraint and storing the result in the resultVector
					OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
					OCLHelper helper = ocl.createOCLHelper();
//					helper.setContext(JointPackagePackage.Literals.JOINT_MM);
					helper.setContext(JointPackage_BibTeX2DocBookPackage.Literals.JOINT_MM);
//					helper.setContext(JointPackage_UML2ERPackage.Literals.JOINT_MM);
//					helper.setContext(JointPackage_Ecore2MaudePackage.Literals.JOINT_MM);
//					helper.setContext(JointPackage_CPL2SPLPackage.Literals.JOINT_MM);

					ConstraintImpl constraint = (ConstraintImpl) helper.createInvariant(line);
					Query constraintEval = (Query) ocl.createQuery(constraint);
					int failure = constraintEval.check(rootClass) ? 0 : 1; //1 if there is failure, 0 otherwise
					resultVector[j-1] = failure;
				}
				result.add(resultVector);
				
				numOCL++;
				}
			line = br.readLine();			
		}
		return result;
	}
	
	/**
	 * 
	 * @param listResultVector. For each OCL constraint that we have in our file given by the global vble oclFileName, we store an array where, for each scenario, we 
	 * write 1 if the constraint fails and 0 if it does not fail. Therefore, this variable is a list of arrays. The size of the arrays is given by the number of scenarios
	 * @param rulesNames. This is a list with the names of the rules of the MT
	 * @param rulesExecutions. This variable is a Map where the key is the name of a rule and the value is an array with the number of executions of such rule in each scenario. 
	 * Map<RuleName, List[Executions in Scenario1, Executions in Scenario2,...]>. Example:
	 * {"Rule1", [1,2,0,3,4]}, {"Rule2", [2,0,4,3,1]}, ...
	 * @return It calculates all the measures needed for computing the suspiciousness of the rules (Ncf, Nuf, Ncs, Nus...).
	 *  It returns a Map that for each OCL expression, it keeps for each rule a value for each variable. For example:
     * "OCL1": {"Rule1", {"Ncf", 9}, {"Nuf", 0}, {"Ncs", 5}, ...}, {"Rule2", {"Ncf", 3}, {"Nuf", 5}, {"Ncs", 4}, ...}
	 *  "OCL2": {"Rule1", {"Ncf", 4}, {"Nuf", 1}, {"Ncs", 2}, ...}, {"Rule2", {"Ncf", 3}, {"Nuf", 5}, {"Ncs", 4}, ...}
	 */
	public static Map<String, Map<String, Map<String, Double>>> getMeasures(List<int[]> listResultVector, List<String> rulesNames, Map<String, int[]> rulesExecutions){
		Map<String, Map<String, Map<String, Double>>> result = new HashMap<String, Map<String, Map<String, Double>>>();
		//We have to do the calculations for the resultVector of each OCL expression
		 int i = 1;
		for (int[] resultVector : listResultVector){
			String oclExp = "OCL"+i;
			Map<String, Map<String, Double>> measuresPerRulePerOCLTogether = new HashMap<String, Map<String, Double>>();
			for(String ruleName : rulesNames){
				//Within each expression, we have to calculate the measures for each rule
				int ncf = 0, nuf = 0, ncs = 0, nus = 0, nc = 0, nu = 0, ns = 0, nf = 0;
				int[] ruleExecutions = rulesExecutions.get(ruleName);
				for (int j=0; j<ruleExecutions.length; j++){
					if (resultVector[j]==1){ //The test case j+1 failed in this OCL expression
						nf++;
						if (ruleExecutions[j]>0){
							ncf++;
							nc++; 
						}else{
							nuf++;
							nu++;
						}
					}else{ //The test case j+1 did not fail for this OCL expression
						ns++;
						if (ruleExecutions[j]>0){
							ncs++; 
							nc++;
						}else {
							nus++;
							nu++;
						}
					}
				}
				Map<String, Double> measuresPerRulePerOCL = new HashMap<String, Double>();
				measuresPerRulePerOCL.put("Ncf", (double)ncf);
				measuresPerRulePerOCL.put("Nuf", (double)nuf);
				measuresPerRulePerOCL.put("Ncs", (double)ncs);
				measuresPerRulePerOCL.put("Nus", (double)nus);
				measuresPerRulePerOCL.put("Nc", (double)nc);
				measuresPerRulePerOCL.put("Nu", (double)nu);
				measuresPerRulePerOCL.put("Ns", (double)ns);
				measuresPerRulePerOCL.put("Nf", (double)nf);
				
				measuresPerRulePerOCLTogether.put(ruleName, measuresPerRulePerOCL);
			}
			result.put(oclExp, measuresPerRulePerOCLTogether);
			i++;
		}
		return result;
	}
	
	
	/**
	 * 
	 * @param measures.  These are measures needed for computing the suspiciousness of the rules (Ncf, Nuf, Ncs, Nus...).
	 *  It is a Map that for each OCL expression, it keeps for each rule a value for each variable. For example:
     * "OCL1": {"Rule1", {"Ncf", 9}, {"Nuf", 0}, {"Ncs", 5}, ...}, {"Rule2", {"Ncf", 3}, {"Nuf", 5}, {"Ncs", 4}, ...}
	 *  "OCL2": {"Rule1", {"Ncf", 4}, {"Nuf", 1}, {"Ncs", 2}, ...}, {"Rule2", {"Ncf", 3}, {"Nuf", 5}, {"Ncs", 4}, ...}
	 *  @param technique. It is a String specifying with which technique should the suspiciousness be calculated
	 * @return. It returns a Map that for each OCL expression and for each rule, it stores the corresponding suspiciousness
	 * according to the technique specified in the technique parameter
	 * 	"OCL1"={"Rule1", 0.9345}, {"Rule2", 0.123},...
	 *  "OCL2"={"Rule1", 0.445}, {"Rule2", 0.001},...
	 */
	public static Map<String, Map<String, Double>> getSuspiciousness(Map<String, Map<String, Map<String, Double>>> measures, String technique){
		Map<String, Map<String, Double>> result = new HashMap<String, Map<String, Double>>();
		//System.out.println("***The information above is presented below for each OCL constraint and for each rule. Please bear in mind that when an OCL constraint never fails, the metrics will be either 0.0 or NaN***");
		for (Map.Entry<String, Map<String, Map<String, Double>>> measuresOfOcl : measures.entrySet()){
			//System.out.println("\nThe results for " + measuresOfOcl.getKey() + " with the technique '" + technique + "' are:");
			Map<String, Double> suspPerRule = new HashMap<String, Double>();
			for(Map.Entry<String, Map<String, Double>> measuresOfRule : measuresOfOcl.getValue().entrySet()){
				Map<String, Double> valuesForRule = measuresOfRule.getValue();
				Double susp = 0.0;
				if (technique.equals("ochiai")){
					if (valuesForRule.get("Ncf") == 0.0){
						susp = 0.0;
					} else if (Math.sqrt(valuesForRule.get("Nf")*(valuesForRule.get("Ncf")+valuesForRule.get("Ncs")))==0.0){
						susp = 1.0;
					} else {
						susp = valuesForRule.get("Ncf") / Math.sqrt(valuesForRule.get("Nf")*(valuesForRule.get("Ncf")+valuesForRule.get("Ncs")));
					}
				}else if (technique.equals("tarantula")){
					/*According to Empirical Evaluation of the Tarantula Automatic FaultLocalization	Technique,
					 * If any of the denominators evaluates to zero, we assign zero to that fraction. */
					if ((valuesForRule.get("Nf"))==0 || valuesForRule.get("Ncs") == 0.0 && valuesForRule.get("Ncf")==0.0){
						susp = 0.0;
					}else if (valuesForRule.get("Ns") == 0.0){
						susp = (valuesForRule.get("Ncf")/valuesForRule.get("Nf"))  / (valuesForRule.get("Ncf")/valuesForRule.get("Nf"));
					} else {
						susp = (valuesForRule.get("Ncf")/valuesForRule.get("Nf"))  / (valuesForRule.get("Ncf")/valuesForRule.get("Nf") + valuesForRule.get("Ncs")/valuesForRule.get("Ns"));
					}
				} else if (technique.equals("ochiai2")){
					if (valuesForRule.get("Ncf") * valuesForRule.get("Nus") == 0.0){
						susp = 0.0;
					} else if (Math.sqrt((valuesForRule.get("Ncf") + valuesForRule.get("Ncs")) * 
							(valuesForRule.get("Nus") + valuesForRule.get("Nuf")) * 
							(valuesForRule.get("Ncf") + valuesForRule.get("Nuf")) *
							(valuesForRule.get("Ncs") + valuesForRule.get("Nus")))==0.0){
						susp = 1.0;
					} else {
						susp = (valuesForRule.get("Ncf") * valuesForRule.get("Nus")) / (0.1 + Math.sqrt((valuesForRule.get("Ncf") + valuesForRule.get("Ncs")) * 
																										(valuesForRule.get("Nus") + valuesForRule.get("Nuf")) * 
																										(valuesForRule.get("Ncf") + valuesForRule.get("Nuf")) *
																										(valuesForRule.get("Ncs") + valuesForRule.get("Nus"))));
					}
				} else if (technique.equals("braunbanquet")){
					susp = valuesForRule.get("Ncf") / Math.max(valuesForRule.get("Ncf") + valuesForRule.get("Ncs"), valuesForRule.get("Ncf") + valuesForRule.get("Nuf"));
				} else if (technique.equals("mountford")){
					if (valuesForRule.get("Ncf") == 0.0){
						susp = 0.0;
					} else if (0.5 * ((valuesForRule.get("Ncf")*valuesForRule.get("Ncs"))+(valuesForRule.get("Ncf")*valuesForRule.get("Nuf"))) + (valuesForRule.get("Ncs") * valuesForRule.get("Nuf"))==0.0){
						susp = 1.0;
					} else {
						susp = valuesForRule.get("Ncf") / (0.5 * ((valuesForRule.get("Ncf")*valuesForRule.get("Ncs"))+(valuesForRule.get("Ncf")*valuesForRule.get("Nuf"))) + (valuesForRule.get("Ncs") * valuesForRule.get("Nuf")));
					}
				} else if (technique.equals("arithmeticmean")){
					if (2*((valuesForRule.get("Ncf")*valuesForRule.get("Nus"))-(valuesForRule.get("Nuf")*valuesForRule.get("Ncs"))) == 0.0){
						susp = 0.0;
					} else if ((valuesForRule.get("Ncf")+valuesForRule.get("Ncs"))*(valuesForRule.get("Nus")+valuesForRule.get("Nuf"))+(valuesForRule.get("Ncf")+valuesForRule.get("Nuf"))*(valuesForRule.get("Ncs")+valuesForRule.get("Nus"))==0.0){
						susp = 1.0;
					} else {
						susp = 2*((valuesForRule.get("Ncf")*valuesForRule.get("Nus"))-(valuesForRule.get("Nuf")*valuesForRule.get("Ncs")))/
								((valuesForRule.get("Ncf")+valuesForRule.get("Ncs"))*(valuesForRule.get("Nus")+valuesForRule.get("Nuf"))+(valuesForRule.get("Ncf")+valuesForRule.get("Nuf"))*(valuesForRule.get("Ncs")+valuesForRule.get("Nus")));					
					}
				} else if (technique.equals("zoltar")){
					if (valuesForRule.get("Ncf") == 0.0){
						susp = 0.0;
					} else if (valuesForRule.get("Ncf")+valuesForRule.get("Nuf")+valuesForRule.get("Ncs")+((10000*valuesForRule.get("Nuf")*valuesForRule.get("Ncs"))/valuesForRule.get("Ncf"))==0.0){
						susp = 1.0;
					} else {
						susp = valuesForRule.get("Ncf") / (valuesForRule.get("Ncf")+valuesForRule.get("Nuf")+valuesForRule.get("Ncs")+((10000*valuesForRule.get("Nuf")*valuesForRule.get("Ncs"))/valuesForRule.get("Ncf")));
					}
				
				} else if (technique.equals("simplematching")){
					susp = (valuesForRule.get("Ncf")+valuesForRule.get("Nus"))/(valuesForRule.get("Ncf")+valuesForRule.get("Ncs")+valuesForRule.get("Nus")+valuesForRule.get("Nuf"));
					
				} else if (technique.equals("russelrao")){
					susp = valuesForRule.get("Ncf") / (valuesForRule.get("Ncf")+valuesForRule.get("Nuf")+valuesForRule.get("Ncs")+valuesForRule.get("Nus"));
				
				} else if (technique.equals("kulcynski2")){
					if (valuesForRule.get("Ncf") == 0.0){
						susp = 0.0;
					} else if (valuesForRule.get("Ncf")+valuesForRule.get("Nuf") ==0.0 || valuesForRule.get("Ncf")+valuesForRule.get("Ncs")==0.0){
						susp = 1.0;
					} else {
						susp = 0.5 * (valuesForRule.get("Ncf")/(valuesForRule.get("Ncf")+valuesForRule.get("Nuf"))+valuesForRule.get("Ncf")/(valuesForRule.get("Ncf")+valuesForRule.get("Ncs")));
					}				
				} else if (technique.equals("cohen")){
					if (2*valuesForRule.get("Ncf")*valuesForRule.get("Nus")-2*valuesForRule.get("Nuf")*valuesForRule.get("Ncs") == 0.0){
						susp = 0.0;
					} else if ((valuesForRule.get("Ncf")+valuesForRule.get("Ncs"))*(valuesForRule.get("Nus")+valuesForRule.get("Ncs"))+(valuesForRule.get("Ncf")+valuesForRule.get("Nuf"))*(valuesForRule.get("Nuf")+valuesForRule.get("Nus")) ==0.0){
						susp = 1.0;
					} else {
						susp = (2*valuesForRule.get("Ncf")*valuesForRule.get("Nus")-2*valuesForRule.get("Nuf")*valuesForRule.get("Ncs"))/((valuesForRule.get("Ncf")+valuesForRule.get("Ncs"))*(valuesForRule.get("Nus")+valuesForRule.get("Ncs"))+(valuesForRule.get("Ncf")+valuesForRule.get("Nuf"))*(valuesForRule.get("Nuf")+valuesForRule.get("Nus")));
					}
				} else if (technique.equals("pierce")) {
					if (valuesForRule.get("Ncf") * valuesForRule.get("Nuf") + valuesForRule.get("Nuf") * valuesForRule.get("Ncs") == 0.0){
						susp = 0.0;
					} else if (valuesForRule.get("Ncf") * valuesForRule.get("Nuf") + 2*valuesForRule.get("Nuf") * valuesForRule.get("Nus") + valuesForRule.get("Ncs") * valuesForRule.get("Nus") ==0.0){
						susp = 1.0;
					} else {
						susp = (valuesForRule.get("Ncf") * valuesForRule.get("Nuf") + valuesForRule.get("Nuf") * valuesForRule.get("Ncs")) / (valuesForRule.get("Ncf") * valuesForRule.get("Nuf") + 2*valuesForRule.get("Nuf") * valuesForRule.get("Nus") + valuesForRule.get("Ncs") * valuesForRule.get("Nus"));					
					}
				} else if (technique.equals("baronietal")){
					susp = (Math.sqrt(valuesForRule.get("Ncf") * valuesForRule.get("Nus"))+valuesForRule.get("Ncf"))/
								(Math.sqrt(valuesForRule.get("Ncf") * valuesForRule.get("Nus")) + valuesForRule.get("Ncf") + valuesForRule.get("Ncs") + valuesForRule.get("Nuf"));
				}  else if (technique.equals("phi")){
					if (valuesForRule.get("Ncf") * valuesForRule.get("Nus") - valuesForRule.get("Nuf")*valuesForRule.get("Ncs") == 0.0){
						susp = 0.0;
					} else if (Math.sqrt((valuesForRule.get("Ncf")+valuesForRule.get("Ncs"))*(valuesForRule.get("Ncf")+valuesForRule.get("Nuf"))*(valuesForRule.get("Ncs")+valuesForRule.get("Nus"))*(valuesForRule.get("Nuf")+valuesForRule.get("Nus"))) ==0.0){
						susp = 1.0;
					} else {
						susp = (valuesForRule.get("Ncf") * valuesForRule.get("Nus") - valuesForRule.get("Nuf")*valuesForRule.get("Ncs"))/
							(Math.sqrt((valuesForRule.get("Ncf")+valuesForRule.get("Ncs"))*(valuesForRule.get("Ncf")+valuesForRule.get("Nuf"))*(valuesForRule.get("Ncs")+valuesForRule.get("Nus"))*(valuesForRule.get("Nuf")+valuesForRule.get("Nus"))));
					}
				} else if (technique.equals("rogerstanimoto")){
					susp = (valuesForRule.get("Ncf") + valuesForRule.get("Nus"))/
							(valuesForRule.get("Ncf") + valuesForRule.get("Nus") + 2*(valuesForRule.get("Nuf") + valuesForRule.get("Ncs")));
				} else if (technique.equals("op2")){
					susp = valuesForRule.get("Ncf") - valuesForRule.get("Ncs") / (valuesForRule.get("Ns") + 1);
				} else if (technique.equals("barinel")){
					susp = 1 - valuesForRule.get("Ncs") / (valuesForRule.get("Ncs") + valuesForRule.get("Ncf"));
				} else if (technique.equals("DStar")){
					if (Math.pow(valuesForRule.get("Ncf"),2) == 0.0){
						susp = 0.0;
					} else if ((valuesForRule.get("Ncs") + valuesForRule.get("Nf") - valuesForRule.get("Ncf")) ==0.0){
						susp = 1.0;
					} else {
						susp = Math.pow(valuesForRule.get("Ncf"),2) /
								(valuesForRule.get("Ncs") + valuesForRule.get("Nf") - valuesForRule.get("Ncf"));
					}				
				}else if (technique.equals("confidence")){
					if ((valuesForRule.get("Nf"))==0){
						susp = valuesForRule.get("Ncs")/valuesForRule.get("Ns");
					} else if ((valuesForRule.get("Ns"))==0){
						susp = valuesForRule.get("Ncf")/valuesForRule.get("Nf");
					} else {
						susp = Math.max(valuesForRule.get("Ncf")/valuesForRule.get("Nf"), valuesForRule.get("Ncs")/valuesForRule.get("Ns"));
					}		
				}
			
				//System.out.print(susp + "\n");
				
				suspPerRule.put(measuresOfRule.getKey(), susp);
				
			}
			result.put(measuresOfOcl.getKey(), suspPerRule);
		}
		return result;
	}

	/** 
	 * @param listResultVector. List<int[]> with the information whether the OCL expressions have failed for each of the scenarios
	 * @param allSuspiciousness. Structure with all the suspiciousness for all the different techniques. It is a
	 * Map<String,Map<String,Map<String, Double>>> where the first String is the name of the technique, for instance "Tarantula", and the rest is the different
	 * parameters for each rule and each ocl constraint:
	 * "OCL1"={"Rule1", 0.9345}, {"Rule2", 0.123},...
	 * "OCL2"={"Rule1", 0.445}, {"Rule2", 0.001},...
	 * @param measures. Structure that keeps the values of the different parameters for each OCL expression, e.g.:
	 * "OCL1": {"Rule1", {"Ncf", 9}, {"Nuf", 0}, {"Ncs", 5}, ...}, {"Rule2", {"Ncf", 3}, {"Nuf", 5}, {"Ncs", 4}, ...}
	 * "OCL2": {"Rule1", {"Ncf", 4}, {"Nuf", 1}, {"Ncs", 2}, ...}, {"Rule2", {"Ncf", 3}, {"Nuf", 5}, {"Ncs", 4}, ...}
	 * @param rulesExecutions. This is a Map<String, int[]> with the name of a rule and an array with the number of executions of such rule in each scenario. 
	 * Map<RuleName, List[Executions in Scenario1, Executions in Scenario2,...]>. Example:
	 * {"Rule1", [1,2,0,3,4]}, {"Rule2", [2,0,4,3,1]}, ...
	 * @return This method generates the CSV file with the results of those OCL expressions that have failed and also prints in the console with OCL expressions have not been satisfied.
	 * Furthermore, it creates one CSV file for each OCL expression that fails with the detailed information of rules executed for each input model and information of the different parameters
	 * @throws IOException
	 */
	public static boolean printResultsInCSVBooks(List<int[]> listResultVector, Map<String, Map<String, Map<String,Double>>> allSuspiciousness, 
													Map<String, Map<String, Map<String, Double>>> measures, Map<String, int[]> rulesExecutions) throws IOException{
		/**This method will write in the main CSV file and will delegate to other method to write the individual CSV files for each OCL constraint that fails**/
		boolean res = true;
		/*This structure is used for printing the summary of EXAM metric altogether:
		 * <OCL1, <Tarantule, 0.22><Ochiai, 0.67>>...
		 */
		Map<String, Map<String, Double>> oclExamTechniqueBC = new HashMap<String, Map<String, Double>>();
		Map<String, Map<String, Double>> oclExamTechniqueWC = new HashMap<String, Map<String, Double>>();
		Map<String, Map<String, Double>> oclExamTechniqueAVG = new HashMap<String, Map<String, Double>>();
		List<String> failOCLs = new ArrayList<String>();
		
		//We create the "Results" folder if it does not exist
		Path path = Paths.get(executionsCanPath + "/results");
        //if directory exists?
        if (!Files.exists(path)) {
            try {
                Files.createDirectories(path);
            } catch (IOException e) {
                //fail to create directory
                e.printStackTrace();
            }
        }
		
		
		File result = new File(executionsCanPath + "/results/" + Transformation_Name + "--" + Results_File_Name);
		if (result.exists()) result.delete();
		result.createNewFile();
		FileWriter fw = new FileWriter(result.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		
		//this is for reading the OCL file in order to also print the corresponding OCL expression
		FileReader reader = new FileReader(executionsCanPath + "/" + OCL_File_Name);
		BufferedReader br = new BufferedReader(reader);
		
		//We will use the listResultVector in order to only print in the CSV file those OCL expressions that have failed 
		int i = 0;
		int oclOrder = 1;
		
		bw.write("In the following it is displayed the suspiciousness, according to different coefficients, for those OCL constraints that are not satisfied. \n\n\n");
		System.out.print("\n\nThe OCL constraints that have not been satisfied are: ");
		boolean allSatisfied = true;
		
		List<String> techniques = new ArrayList<String>(allSuspiciousness.keySet());
		//for (String technique : techniques) oclExamTechnique.put(technique, new HashMap<String, Double>()); //We initialize the oclExamTechnique variable
		
		String oclExpr = br.readLine();
		while (oclExpr != null){
			while (oclExpr!=null && (oclExpr.equals("") || oclExpr.substring(0,1).equals(" ") || oclExpr.substring(0,2).equals("--"))) 
				oclExpr = br.readLine(); //In case there are comments in the OCL file
			if (oclExpr != null){
				boolean satisfied = true;
				int j = 0;
				while (j < numExecutions && satisfied){
					if (listResultVector.get(i)[j] == 1)
						satisfied = false;
					j++;
				}
				if (!satisfied){
					failOCLs.add("OCL" + oclOrder);
					System.out.print("OCL" + oclOrder + "  ");
					bw.write("OCL" + oclOrder + ";" + oclExpr + "\n"); //We write the row with the OCL expression
					List<String> rules = new ArrayList<String>(allSuspiciousness.get("Ochiai").get("OCL" +  oclOrder).keySet());					
					
					//The following three variables are used for computing the EXAM metric for the evaluation
					int numRules = allSuspiciousness.get("Ochiai").get("OCL" + oclOrder).keySet().size();
					Map<String, List<Double>> suspValuesPerTechnique = new HashMap<String, List<Double>>();
					//double[] suspValues = new double[numRules]; 
					//double suspBuggyRule = 0.0;
					Map<String, Double> suspBuggyRuleMap = new HashMap<String, Double>();
					
					//List<String> techniques = new ArrayList<String>(allSuspiciousness.keySet());
					for (String technique : techniques){
						bw.write(";" + technique); //We write the row with the technique's names
						List<Double> suspValues = new ArrayList<Double>();
						suspValuesPerTechnique.put(technique, suspValues); //We insert a map for each techique to fill it in while we write in the excel
					}
					bw.write("\n");
					
					//We write the values of suspiciousness for each rule and each technique:
					for (String ruleName : rules){
						bw.write(ruleName); //We write the name of the rule
						for (String technique : techniques){
							double susp = allSuspiciousness.get(technique).get("OCL" + oclOrder).get(ruleName);
							bw.write(";" + susp);
							List<Double> currentSuspValues = suspValuesPerTechnique.get(technique);
							currentSuspValues.add(susp);
							//if (ruleName.equals(Buggy_rule)) suspBuggyRuleMap.put(technique, susp);
							//Journal Extension: we now consider there might be more than one buggy rules
							if (Buggy_rules.contains(ruleName)){
								Double suspBuggy = suspBuggyRuleMap.get(technique);
								if (suspBuggy == null || suspBuggy < susp){
									suspBuggyRuleMap.put(technique, susp);
								}
							}
						}
						bw.write("\n");
					}
					
					//For computing the EXAM metric of the evaluation			
					//Variables where to keep the values of the EXAM scores of the different techniques
					Map<String, Double> techniqueExamBC = new HashMap<String, Double>();
					Map<String, Double> techniqueExamWC = new HashMap<String, Double>();
					Map<String, Double> techniqueExamAVG = new HashMap<String, Double>();
					for (String technique : techniques){
						int repeated = 0;
						int comparator = 0;
						Double suspBuggyRule = suspBuggyRuleMap.get(technique);
						int index = 0;
						for (Double susp : suspValuesPerTechnique.get(technique)){
							/*compareTo is for comparing Double values:
							 * a.compareTo(b) == 0 if the values are the same
							 * a.compareTo(b) < 0 if a<b
							 * a.compareTo(b) > 0 if a>b
							 */
							if (susp.compareTo(suspBuggyRule) > 0) comparator++;
							if (susp.compareTo(suspBuggyRule) == 0) repeated ++;
							index++;
						}
						double examBC = (double) (comparator + 1) / numRules; //For now we consider that EXAM > 0
						double examWC = (double) (comparator + repeated) / numRules;
						double examAVG = (double) (examBC + examWC) / 2;
						//For updating the oclExamTechnique variables:
						techniqueExamBC.put(technique, examBC);
						techniqueExamWC.put(technique, examWC);
						techniqueExamAVG.put(technique, examAVG);
					}
					//For printing the EXAM values:
					bw.write("EXAM-BC");
					for (String technique : techniques) bw.write(";" + techniqueExamBC.get(technique));
					bw.write("\nEXAM-WC");
					for (String technique : techniques) bw.write(";" + techniqueExamWC.get(technique));
					bw.write("\nEXAM-AVG");
					for (String technique : techniques) bw.write(";" + techniqueExamAVG.get(technique));
					
					//We store the values in variables for printing them at the end of the cvs file
					oclExamTechniqueBC.put("OCL" + oclOrder, techniqueExamBC);
					oclExamTechniqueWC.put("OCL" + oclOrder, techniqueExamWC);
					oclExamTechniqueAVG.put("OCL" + oclOrder, techniqueExamAVG);
				
					bw.write("\n");
					bw.write("\n");					
					allSatisfied = false;
					
					//For every OCL that is not satisfied, we create an CSV file with all the details
					printParticularResultsInCSVBook(oclOrder, oclExpr, listResultVector, allSuspiciousness, measures, rulesExecutions);
				}
				i++;
				oclOrder++;
				oclExpr = br.readLine();
			}
		}
		
		/**For writing the summary of all EXAM scores at the end of the csv file**/
		if (allSatisfied){
			bw.write("In this case, all OCL constraints are satisfied, so nothing is displayed.\n");
			System.out.println("none.\nAll OCL constraints are satisfied!");
			res = false;
		} else {
			//We write the EXAM metrics all together
			bw.write("\nSummary of the quality of the different techniques according to the EXAM metric\n");
			bw.write("\nBEST CASE");
			for (String technique : techniques) {
				bw.write(";" + technique + "-BC");
			}
			bw.write("\n");
			for (String failOCL : failOCLs){
				bw.write(failOCL);
				for (String technique : techniques){
					bw.write(";" + oclExamTechniqueBC.get(failOCL).get(technique));
				}
				bw.write("\n");
			}
			
			bw.write("\nWORST CASE");
			for (String technique : techniques) {
				bw.write(";" + technique + "-WC");
			}
			bw.write("\n");
			for (String failOCL : failOCLs){
				bw.write(failOCL);
				for (String technique : techniques){
					bw.write(";" + oclExamTechniqueWC.get(failOCL).get(technique));
				}
				bw.write("\n");
			}
			
			bw.write("\nAVG CASE");
			for (String technique : techniques) {
				bw.write(";" + technique + "-AVG");
			}
			bw.write("\n");
			for (String failOCL : failOCLs){
				bw.write(failOCL);
				for (String technique : techniques){
					bw.write(";" + oclExamTechniqueAVG.get(failOCL).get(technique));
				}
				bw.write("\n");
			}
		}
		
		bw.close();
		br.close();
		return res;
	}
	
	
	
	
	/**
	 * @param listResultVector. List<int[]> with the information whether the OCL expressions have failed for each of the scenarios, e.g.:
	 * 000001111000010101001010... (this is for OCL1)
	 * 000000101010011010101111... (this is for OCL2)
	 * @param oclOrder, number of the OCL expression, e.g., 1
	 * @param oclExpr, the OCL expression
	 * @param allSuspiciousness. Structure with all the suspiciousness for all the different techniques. It is a
	 * Map<String,Map<String,Map<String, Double>>> where the first String is the name of the technique, for instance "Tarantula", and the rest is the different
	 * parameters for each rule and each ocl constraint:
	 * "OCL1"={"Rule1", 0.9345}, {"Rule2", 0.123},...
	 * "OCL2"={"Rule1", 0.445}, {"Rule2", 0.001},...
	 * @param measures. Structure that keeps the values of the different parameters for each OCL expression, e.g.:
	 * "OCL1": {"Rule1", {"Ncf", 9}, {"Nuf", 0}, {"Ncs", 5}, ...}, {"Rule2", {"Ncf", 3}, {"Nuf", 5}, {"Ncs", 4}, ...}
	 * "OCL2": {"Rule1", {"Ncf", 4}, {"Nuf", 1}, {"Ncs", 2}, ...}, {"Rule2", {"Ncf", 3}, {"Nuf", 5}, {"Ncs", 4}, ...}
	 * @param rulesExecutions. This is a Map<String, int[]> with the name of a rule and an array with the number of executions of such rule in each scenario. 
	 * Map<RuleName, List[Executions in Scenario1, Executions in Scenario2,...]>. Example:
	 * {"Rule1", [1,2,0,3,4]}, {"Rule2", [2,0,4,3,1]}, ...
	 * @return This method generates the CSV file with the results of those OCL expressions that have failed and also prints in the console with OCL expressions have not been satisfied.
	 * Furthermore, it creates one CSV file for each OCL expression that fails with the detailed information of rules executed for each input model and information of the different parameters
	 * @throws IOException
	 */
	public static File printParticularResultsInCSVBook(int oclOrder, String oclExpr, List<int[]> listResultVector, Map<String, Map<String, Map<String,Double>>> allSuspiciousness, 
							Map<String, Map<String, Map<String, Double>>> measures, Map<String, int[]> rulesExecutions) throws IOException {
		String oclNum = "OCL" + oclOrder;
		File result = new File(executionsCanPath + "/results/" + Transformation_Name + "--" + oclNum + ".csv");
		if (result.exists()) result.delete();
		result.createNewFile();
		FileWriter fw = new FileWriter(result.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		
		//Let's add an explanation of the different parameters used in the different suspiciousness techniques
		for (int i = 0; i<=numExecutions; i++) bw.write(";");
		bw.write("Ncf: Number of failed test cases that cover the rule\n");
		for (int i = 0; i<=numExecutions; i++) bw.write(";");
		bw.write("Nus: Number of successful test cases that cover the rule\n");
		for (int i = 0; i<=numExecutions; i++) bw.write(";");
		bw.write("Ncs: Number of successful test cases that cover the rule\n");
		for (int i = 0; i<=numExecutions; i++) bw.write(";");
		bw.write("Nus: number of successful test cases that do not cover the rule\n");
		for (int i = 0; i<=numExecutions; i++) bw.write(";");
		bw.write("Nc: total number of test cases that cover the rule\n");
		for (int i = 0; i<=numExecutions; i++) bw.write(";");
		bw.write("Nu:total number of test cases that do not cover the rule\n");
		for (int i = 0; i<=numExecutions; i++) bw.write(";");
		bw.write("Ns: total number of successful test cases\n");
		for (int i = 0; i<=numExecutions; i++) bw.write(";");
		bw.write("Nf: total number of failed test cases\n\n");

		//Let's write the first line as header
		bw.write(oclNum + ";" + oclExpr + "\n\n");
		
		//Now we write the line with the columns purpose: rules, test cases, parameters and different techniques
		bw.write("Rules;");
		for (int i = 1; i<= numExecutions; i++) bw.write("TC"+i+";");
		bw.write("Ncf;Nuf;Ncs;Nus;Nc;Nu;Ns;Nf;");
		List<String> techniques = new ArrayList<String>(allSuspiciousness.keySet());
		for (String technique : techniques) bw.write(technique + ";");
		bw.write("\n");
		
		//For each rule, we have to add one line with all its paramters: first if it's executed, then values of the parameters and last the values for suspiciousness of the different techniques
		List<String> rules = new ArrayList<String>(rulesExecutions.keySet());
		for (String rule : rules){
			//We write the rule name
			bw.write(rule + ";");
			//We write whether it's executed or not ---> POSSIBLE EXTENSION: write the number of times it is executed
			int[] executions = rulesExecutions.get(rule);
			for (int i = 0; i < numExecutions; i++) {
				if (executions[i] > 0) bw.write("X");
				bw.write(";");
			}
			//Now we write the values of the different parameters
			bw.write(measures.get(oclNum).get(rule).get("Ncf").toString() + ";");
			bw.write(measures.get(oclNum).get(rule).get("Nuf").toString() + ";");
			bw.write(measures.get(oclNum).get(rule).get("Ncs").toString() + ";");
			bw.write(measures.get(oclNum).get(rule).get("Nus").toString() + ";");
			bw.write(measures.get(oclNum).get(rule).get("Nc").toString() + ";");
			bw.write(measures.get(oclNum).get(rule).get("Nu").toString() + ";");
			bw.write(measures.get(oclNum).get(rule).get("Ns").toString() + ";");
			bw.write(measures.get(oclNum).get(rule).get("Nf").toString() + ";");
			//And finally we write the suspiciousness for the different techniques
			for (String technique : techniques){
				bw.write(allSuspiciousness.get(technique).get(oclNum).get(rule).toString() + ";");
			}
			bw.write("\n");
		}
		
		//Finally, we have to add a line stating for which test cases the OCL constraint has failed and for which ones it has passed
		bw.write(";");
		int[] arrayWithResults = listResultVector.get(oclOrder - 1);
		for (int i = 0; i < numExecutions; i++){
			if (arrayWithResults[i] == 1) bw.write("Fail;");
			else bw.write("Pass;");
		}
		
		bw.close();
		return result;
	}
}
