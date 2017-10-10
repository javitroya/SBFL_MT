# SBFL_MT
Implementation of the Spectrum-Based Fault Localization in Model Transformations

This projects supports and verifies the evaluation performed in [1]. It has been developed with Eclipse Modeling Tools, version Mars. Java 8 is needed in order to execute it, as well as the ATL and ATL EMFTVM plugins. 
There are two projects, namely Evaluation_Comparison_TSE15 and SpecBased_FaultLoc_MT. 

"Evaluation_Comparison_TSE15"

This project’s aim is to obtain the EXAM score out of the matching tables obtained with the approach by Burgueño et al. [2] for all the case studies. In order to run it, the only available class, namely Evaluation_TSE15_EXAM.java must be executed. As we can see in such class, there are four lines of code that must be uncommented in order to obtain the EXAM scores for each of the case studies. The remaining case studies must be commented.
The class can be executed by right-clicking and selecting Run As -> Java Application. A file called EXAM_Results.csv will be created within the folder corresponding to the executed case study.

"SpecBased_FaultLoc_MT"

This project contains the executable to compute the suspiciousness values with the 18 techniques. Folders “models_caseStudyName” contain all the artifacts regarding each of the case studies. 
The executable Java file is available at src->es.us.eii.faul.localization.mt.main-> FaultLocalizationMT_Main.
In order to execute it with the different model transformations serving as case studies and the different mutants, several lines of code must be commented and uncommented. After doing so, the class can be executed by right-clicking and selecting Run As -> Java Application. The code contains explanations for executing each case study:
-	BibTex2DocBook. An explanation can be found in lines 74-81.
-	UML2ER. An explanation can be found in lines 217-224.
-	Ecore2Maude. An explanation can be found in lines 316-323.
-	CPL2SPL. An explanation can be found in lines 481-488.

After executing the program, some information will be displayed in the console. At the end, it indicates the files generated after the execution and where to locate them.

[1] Javier Troya, Sergio Segura, José A. Parejo, Antonio Ruiz-Cortés. "Spectrum-Based Fault Localization in Model Transformations". Submitted to The Transactions on Software and Methodology, 2017

[2] Loli Burgueño, Javier Troya, Manuel Wimmer, Antonio Vallecillo. "Static Fault Localization in Model Transformations". IEEE Transactions on Software Engineering, Volume 41, 5 (2015), 490-506. http://dx.doi.org/10.1109/TSE.2014.2375201
