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

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IExtractor;
import org.eclipse.m2m.atl.core.IInjector;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.ModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFExtractor;
import org.eclipse.m2m.atl.core.emf.EMFInjector;
import org.eclipse.m2m.atl.core.emf.EMFModel;
import org.eclipse.m2m.atl.core.emf.EMFModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFReferenceModel;
import org.eclipse.m2m.atl.core.launch.ILauncher;
import org.eclipse.m2m.atl.engine.emfvm.launch.EMFVMLauncher;

public class ATL_EMF_Launcher {
	
	
	public static void executeATLTransformation(String executionsCanPath, String folderTransformations, String IN_MM, String OUT_MM, String Trace_MM, 
			String IN_MM_NAME, String OUT_MM_NAME, String Trace_MM_NAME, String Trace_OutModel_Name, String	transformationName, int numExecutions){
		try {
			/* Initializations */
			ILauncher transformationLauncher = new EMFVMLauncher();
			ModelFactory modelFactory = new EMFModelFactory();
			IInjector injector = new EMFInjector();
			IExtractor extractor = new EMFExtractor();
			
			/* Load metamodels */
			
			IReferenceModel sourceMM = modelFactory.newReferenceModel();
			injector.inject(sourceMM, executionsCanPath + "/" + IN_MM);
			IReferenceModel targetMM = modelFactory.newReferenceModel();
			injector.inject(targetMM, executionsCanPath + "/" + OUT_MM);
			IReferenceModel traceMM = modelFactory.newReferenceModel();
			injector.inject(traceMM, "Trace.ecore");
			
			for (int i = 1; i<= numExecutions; i++){
			
				/* Run transformation */
				//Inject source model
				IModel sourceModel = modelFactory.newModel(sourceMM);
				injector.inject(sourceModel, executionsCanPath + "/scenarios/scenario" + i + "/AutomaticModel_" + IN_MM.substring(0, IN_MM.length()-6) + i + ".xmi");
				//Define target model and trace model
				IModel targetModel = modelFactory.newModel(targetMM);			
				IModel traceModel = modelFactory.newModel(traceMM);
				
				//Set up transformation
				transformationLauncher.initialize(new HashMap<String,Object>());
				transformationLauncher.addInModel(sourceModel, "IN", IN_MM_NAME);
				transformationLauncher.addOutModel(targetModel, "OUT", OUT_MM_NAME);
				transformationLauncher.addOutModel(traceModel, "TM", "TMM");
				// launch parameters, we want to allow inter-model references
				Map<String, Object> parameters = new HashMap<String, Object>();
				parameters.put("allowInterModelReferences", Boolean.TRUE);
				// Run the transformation
				transformationLauncher.launch(ILauncher.RUN_MODE, new NullProgressMonitor(), parameters,
					new FileInputStream(executionsCanPath + "/" + folderTransformations + "/" + transformationName + ".asm"));
				//Extract the output model and trace model
				extractor.extract(targetModel, executionsCanPath + "/scenarios/scenario" + i + "/" + OUT_MM.substring(0, OUT_MM.length()-6) + "_out" + i + ".xmi");
				extractor.extract(traceModel, executionsCanPath +  "/scenarios/scenario" + i + "/" + Trace_OutModel_Name + i + ".xmi");
				
				/*
				 * Unload all models (EMF-specific)
				 */
				EMFModelFactory emfModelFactory = (EMFModelFactory) modelFactory;
				emfModelFactory.unload((EMFModel) sourceModel);
				emfModelFactory.unload((EMFModel) targetModel);
				emfModelFactory.unload((EMFModel) traceModel);
			}
			/*
			 * Unload all metamodels (EMF-specific)
			 */
			EMFModelFactory emfModelFactory = (EMFModelFactory) modelFactory;
			emfModelFactory.unload((EMFReferenceModel) sourceMM);
			emfModelFactory.unload((EMFReferenceModel) targetMM);
			emfModelFactory.unload((EMFReferenceModel) traceMM);
			
		} catch (ATLCoreException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	/**The following method is similar to the one above, but it is used with two input models and one output model.
	 * In our project, it is used for joining two models into the JointModel, since the emftvm version of the transformation does not
	 * work properly for some cases, such as the Ecore2Maude **/
	
	public static void executeATLTransformation2(String executionsCanPath, String folderTransformations, String IN_MM1, String IN_MM2, String OUT_MM,  
			String IN_MM_NAME1, String IN_MM_NAME2, String OUT_MM_NAME, String	transformationName, int numExecutions){
		try {
			/* Initializations */
			ILauncher transformationLauncher = new EMFVMLauncher();
			ModelFactory modelFactory = new EMFModelFactory();
			IInjector injector = new EMFInjector();
			IExtractor extractor = new EMFExtractor();
			
			/* Load metamodels */
			
			IReferenceModel sourceMM1 = modelFactory.newReferenceModel();
			injector.inject(sourceMM1, executionsCanPath + "/" + IN_MM1);
			IReferenceModel sourceMM2 = modelFactory.newReferenceModel();
			injector.inject(sourceMM2, executionsCanPath + "/" + IN_MM2);
			IReferenceModel targetMM = modelFactory.newReferenceModel();
			injector.inject(targetMM, executionsCanPath + "/" + OUT_MM);
			
			for (int i = 1; i<= numExecutions; i++){
			
				/* Run transformation */
				//Inject source models
				IModel sourceModel1 = modelFactory.newModel(sourceMM1);
				injector.inject(sourceModel1, executionsCanPath + "/scenarios/scenario" + i + "/AutomaticModel_" + IN_MM1.substring(0, IN_MM1.length()-6) + i + ".xmi");
				IModel sourceModel2 = modelFactory.newModel(sourceMM2);
				injector.inject(sourceModel2, executionsCanPath + "/scenarios/scenario" + i + "/" + IN_MM2.substring(0, IN_MM2.length()-6) + "_out" + i + ".xmi");
				//Define target model and trace model
				IModel targetModel = modelFactory.newModel(targetMM);			
				
				//Set up transformation
				transformationLauncher.initialize(new HashMap<String,Object>());
				transformationLauncher.addInModel(sourceModel1, "IN1", IN_MM_NAME1);
				transformationLauncher.addInModel(sourceModel2, "IN2", IN_MM_NAME2);
				transformationLauncher.addOutModel(targetModel, "OUT", OUT_MM_NAME);
				// launch parameters, we want to allow inter-model references
				Map<String, Object> parameters = new HashMap<String, Object>();
				parameters.put("allowInterModelReferences", Boolean.TRUE);
				// Run the transformation
				transformationLauncher.launch(ILauncher.RUN_MODE, new NullProgressMonitor(), parameters,
					//new FileInputStream(executionsCanPath + "/" + folderTransformations + "/" + transformationName + ".asm"));
						new FileInputStream(executionsCanPath + "/" + transformationName + ".asm"));	
				//Extract the output model
				extractor.extract(targetModel, executionsCanPath + "/scenarios/scenario" + i + "/" + "JointModel" + i + ".xmi");
				
				/*
				 * Unload all models (EMF-specific)
				 */
				EMFModelFactory emfModelFactory = (EMFModelFactory) modelFactory;
				emfModelFactory.unload((EMFModel) sourceModel1);
				emfModelFactory.unload((EMFModel) sourceModel2);
				emfModelFactory.unload((EMFModel) targetModel);
			}
			/*
			 * Unload all metamodels (EMF-specific)
			 */
			EMFModelFactory emfModelFactory = (EMFModelFactory) modelFactory;
			emfModelFactory.unload((EMFReferenceModel) sourceMM1);
			emfModelFactory.unload((EMFReferenceModel) sourceMM2);
			emfModelFactory.unload((EMFReferenceModel) targetMM);
			
		} catch (ATLCoreException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
