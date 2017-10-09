/**
 *
 * $Id$
 */
package jointPackage_Ecore2Maude.validation;

import jointPackage_Ecore2Maude.SrcEClassifier;

/**
 * A sample validator interface for {@link jointPackage_Ecore2Maude.SrcETypedElement}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SrcETypedElementValidator {
	boolean validate();

	boolean validateOrdered(boolean value);
	boolean validateUnique(boolean value);
	boolean validateLowerBound(int value);
	boolean validateUpperBound(int value);
	boolean validateMany(boolean value);
	boolean validateRequired(boolean value);
	boolean validateEType(SrcEClassifier value);
}