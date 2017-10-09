/**
 */
package jointPackage_UML2ER.util;

import jointPackage_UML2ER.*;

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
 * @see jointPackage_UML2ER.JointPackage_UML2ERPackage
 * @generated
 */
public class JointPackage_UML2ERSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JointPackage_UML2ERPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JointPackage_UML2ERSwitch() {
		if (modelPackage == null) {
			modelPackage = JointPackage_UML2ERPackage.eINSTANCE;
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
			case JointPackage_UML2ERPackage.JOINT_MM: {
				JointMM jointMM = (JointMM)theEObject;
				T result = caseJointMM(jointMM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_UML2ERPackage.SRC_PACKAGE: {
				SrcPackage srcPackage = (SrcPackage)theEObject;
				T result = caseSrcPackage(srcPackage);
				if (result == null) result = caseSrcNamedElement(srcPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_UML2ERPackage.SRC_CLASS: {
				SrcClass srcClass = (SrcClass)theEObject;
				T result = caseSrcClass(srcClass);
				if (result == null) result = caseSrcNamedElement(srcClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_UML2ERPackage.SRC_PROPERTY: {
				SrcProperty srcProperty = (SrcProperty)theEObject;
				T result = caseSrcProperty(srcProperty);
				if (result == null) result = caseSrcNamedElement(srcProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_UML2ERPackage.SRC_NAMED_ELEMENT: {
				SrcNamedElement srcNamedElement = (SrcNamedElement)theEObject;
				T result = caseSrcNamedElement(srcNamedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_UML2ERPackage.TRG_ER_MODEL: {
				TrgERModel trgERModel = (TrgERModel)theEObject;
				T result = caseTrgERModel(trgERModel);
				if (result == null) result = caseTrgElement(trgERModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_UML2ERPackage.TRG_WEAK_REFERENCE: {
				TrgWeakReference trgWeakReference = (TrgWeakReference)theEObject;
				T result = caseTrgWeakReference(trgWeakReference);
				if (result == null) result = caseTrgReference(trgWeakReference);
				if (result == null) result = caseTrgFeature(trgWeakReference);
				if (result == null) result = caseTrgElement(trgWeakReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_UML2ERPackage.TRG_STRONG_REFERENCE: {
				TrgStrongReference trgStrongReference = (TrgStrongReference)theEObject;
				T result = caseTrgStrongReference(trgStrongReference);
				if (result == null) result = caseTrgReference(trgStrongReference);
				if (result == null) result = caseTrgFeature(trgStrongReference);
				if (result == null) result = caseTrgElement(trgStrongReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_UML2ERPackage.TRG_ENTITY_TYPE: {
				TrgEntityType trgEntityType = (TrgEntityType)theEObject;
				T result = caseTrgEntityType(trgEntityType);
				if (result == null) result = caseTrgElement(trgEntityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_UML2ERPackage.TRG_FEATURE: {
				TrgFeature trgFeature = (TrgFeature)theEObject;
				T result = caseTrgFeature(trgFeature);
				if (result == null) result = caseTrgElement(trgFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_UML2ERPackage.TRG_ATTRIBUTE: {
				TrgAttribute trgAttribute = (TrgAttribute)theEObject;
				T result = caseTrgAttribute(trgAttribute);
				if (result == null) result = caseTrgFeature(trgAttribute);
				if (result == null) result = caseTrgElement(trgAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_UML2ERPackage.TRG_ELEMENT: {
				TrgElement trgElement = (TrgElement)theEObject;
				T result = caseTrgElement(trgElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_UML2ERPackage.TRG_REFERENCE: {
				TrgReference trgReference = (TrgReference)theEObject;
				T result = caseTrgReference(trgReference);
				if (result == null) result = caseTrgFeature(trgReference);
				if (result == null) result = caseTrgElement(trgReference);
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
	 * Returns the result of interpreting the object as an instance of '<em>Src Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcPackage(SrcPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcClass(SrcClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcProperty(SrcProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcNamedElement(SrcNamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg ER Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg ER Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgERModel(TrgERModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Weak Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Weak Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgWeakReference(TrgWeakReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Strong Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Strong Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgStrongReference(TrgStrongReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Entity Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Entity Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgEntityType(TrgEntityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgFeature(TrgFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgAttribute(TrgAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgElement(TrgElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgReference(TrgReference object) {
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

} //JointPackage_UML2ERSwitch
