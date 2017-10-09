package es.us.eii.fault.localization.mt.main;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IExtractor;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.emf.EMFExtractor;
import org.eclipse.m2m.atl.engine.parser.AtlParser;


public class ATLFile2Model {

	String atlFile;
	String atlModel;

	public ATLFile2Model(String atlFile, String atlModel) {
		this.atlFile = atlFile;
		this.atlModel = atlModel;
	}

	public void injectATLTrafo() throws FileNotFoundException, ATLCoreException {

		AtlParser parser=new AtlParser();

		InputStream stream = new FileInputStream(atlFile);
		IModel parseToModel = parser.parseToModel(stream);
   
		IExtractor extractor = new EMFExtractor();
		extractor.extract(parseToModel, atlModel);
		
		System.out.println("OK");
	}
	
	public static void injector(String file, String model) throws FileNotFoundException, ATLCoreException {
	//ATLFile2Model injector = new ATLFile2Model("Example/T4.atl", "Example/TransInjected.xmi");
		ATLFile2Model injector = new ATLFile2Model(file, model);
		injector.injectATLTrafo();
	}

}
