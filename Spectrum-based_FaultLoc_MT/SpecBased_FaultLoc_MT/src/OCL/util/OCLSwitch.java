/**
 */
package OCL.util;

import ATL.LocatedElement;

import OCL.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

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
 * @see OCL.OCLPackage
 * @generated
 */
public class OCLSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OCLPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLSwitch() {
		if (modelPackage == null) {
			modelPackage = OCLPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case OCLPackage.OCL_EXPRESSION: {
				OclExpression oclExpression = (OclExpression)theEObject;
				Object result = caseOclExpression(oclExpression);
				if (result == null) result = caseLocatedElement(oclExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.VARIABLE_EXP: {
				VariableExp variableExp = (VariableExp)theEObject;
				Object result = caseVariableExp(variableExp);
				if (result == null) result = caseOclExpression(variableExp);
				if (result == null) result = caseLocatedElement(variableExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.SUPER_EXP: {
				SuperExp superExp = (SuperExp)theEObject;
				Object result = caseSuperExp(superExp);
				if (result == null) result = caseOclExpression(superExp);
				if (result == null) result = caseLocatedElement(superExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.PRIMITIVE_EXP: {
				PrimitiveExp primitiveExp = (PrimitiveExp)theEObject;
				Object result = casePrimitiveExp(primitiveExp);
				if (result == null) result = caseOclExpression(primitiveExp);
				if (result == null) result = caseLocatedElement(primitiveExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.STRING_EXP: {
				StringExp stringExp = (StringExp)theEObject;
				Object result = caseStringExp(stringExp);
				if (result == null) result = casePrimitiveExp(stringExp);
				if (result == null) result = caseOclExpression(stringExp);
				if (result == null) result = caseLocatedElement(stringExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.BOOLEAN_EXP: {
				BooleanExp booleanExp = (BooleanExp)theEObject;
				Object result = caseBooleanExp(booleanExp);
				if (result == null) result = casePrimitiveExp(booleanExp);
				if (result == null) result = caseOclExpression(booleanExp);
				if (result == null) result = caseLocatedElement(booleanExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.NUMERIC_EXP: {
				NumericExp numericExp = (NumericExp)theEObject;
				Object result = caseNumericExp(numericExp);
				if (result == null) result = casePrimitiveExp(numericExp);
				if (result == null) result = caseOclExpression(numericExp);
				if (result == null) result = caseLocatedElement(numericExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.REAL_EXP: {
				RealExp realExp = (RealExp)theEObject;
				Object result = caseRealExp(realExp);
				if (result == null) result = caseNumericExp(realExp);
				if (result == null) result = casePrimitiveExp(realExp);
				if (result == null) result = caseOclExpression(realExp);
				if (result == null) result = caseLocatedElement(realExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.INTEGER_EXP: {
				IntegerExp integerExp = (IntegerExp)theEObject;
				Object result = caseIntegerExp(integerExp);
				if (result == null) result = caseNumericExp(integerExp);
				if (result == null) result = casePrimitiveExp(integerExp);
				if (result == null) result = caseOclExpression(integerExp);
				if (result == null) result = caseLocatedElement(integerExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.COLLECTION_EXP: {
				CollectionExp collectionExp = (CollectionExp)theEObject;
				Object result = caseCollectionExp(collectionExp);
				if (result == null) result = caseOclExpression(collectionExp);
				if (result == null) result = caseLocatedElement(collectionExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.BAG_EXP: {
				BagExp bagExp = (BagExp)theEObject;
				Object result = caseBagExp(bagExp);
				if (result == null) result = caseCollectionExp(bagExp);
				if (result == null) result = caseOclExpression(bagExp);
				if (result == null) result = caseLocatedElement(bagExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.ORDERED_SET_EXP: {
				OrderedSetExp orderedSetExp = (OrderedSetExp)theEObject;
				Object result = caseOrderedSetExp(orderedSetExp);
				if (result == null) result = caseCollectionExp(orderedSetExp);
				if (result == null) result = caseOclExpression(orderedSetExp);
				if (result == null) result = caseLocatedElement(orderedSetExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.SEQUENCE_EXP: {
				SequenceExp sequenceExp = (SequenceExp)theEObject;
				Object result = caseSequenceExp(sequenceExp);
				if (result == null) result = caseCollectionExp(sequenceExp);
				if (result == null) result = caseOclExpression(sequenceExp);
				if (result == null) result = caseLocatedElement(sequenceExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.SET_EXP: {
				SetExp setExp = (SetExp)theEObject;
				Object result = caseSetExp(setExp);
				if (result == null) result = caseCollectionExp(setExp);
				if (result == null) result = caseOclExpression(setExp);
				if (result == null) result = caseLocatedElement(setExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.TUPLE_EXP: {
				TupleExp tupleExp = (TupleExp)theEObject;
				Object result = caseTupleExp(tupleExp);
				if (result == null) result = caseOclExpression(tupleExp);
				if (result == null) result = caseLocatedElement(tupleExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.TUPLE_PART: {
				TuplePart tuplePart = (TuplePart)theEObject;
				Object result = caseTuplePart(tuplePart);
				if (result == null) result = caseVariableDeclaration(tuplePart);
				if (result == null) result = caseLocatedElement(tuplePart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.MAP_EXP: {
				MapExp mapExp = (MapExp)theEObject;
				Object result = caseMapExp(mapExp);
				if (result == null) result = caseOclExpression(mapExp);
				if (result == null) result = caseLocatedElement(mapExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.MAP_ELEMENT: {
				MapElement mapElement = (MapElement)theEObject;
				Object result = caseMapElement(mapElement);
				if (result == null) result = caseLocatedElement(mapElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.ENUM_LITERAL_EXP: {
				EnumLiteralExp enumLiteralExp = (EnumLiteralExp)theEObject;
				Object result = caseEnumLiteralExp(enumLiteralExp);
				if (result == null) result = caseOclExpression(enumLiteralExp);
				if (result == null) result = caseLocatedElement(enumLiteralExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.OCL_UNDEFINED_EXP: {
				OclUndefinedExp oclUndefinedExp = (OclUndefinedExp)theEObject;
				Object result = caseOclUndefinedExp(oclUndefinedExp);
				if (result == null) result = caseOclExpression(oclUndefinedExp);
				if (result == null) result = caseLocatedElement(oclUndefinedExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.PROPERTY_CALL_EXP: {
				PropertyCallExp propertyCallExp = (PropertyCallExp)theEObject;
				Object result = casePropertyCallExp(propertyCallExp);
				if (result == null) result = caseOclExpression(propertyCallExp);
				if (result == null) result = caseLocatedElement(propertyCallExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.NAVIGATION_OR_ATTRIBUTE_CALL_EXP: {
				NavigationOrAttributeCallExp navigationOrAttributeCallExp = (NavigationOrAttributeCallExp)theEObject;
				Object result = caseNavigationOrAttributeCallExp(navigationOrAttributeCallExp);
				if (result == null) result = casePropertyCallExp(navigationOrAttributeCallExp);
				if (result == null) result = caseOclExpression(navigationOrAttributeCallExp);
				if (result == null) result = caseLocatedElement(navigationOrAttributeCallExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.OPERATION_CALL_EXP: {
				OperationCallExp operationCallExp = (OperationCallExp)theEObject;
				Object result = caseOperationCallExp(operationCallExp);
				if (result == null) result = casePropertyCallExp(operationCallExp);
				if (result == null) result = caseOclExpression(operationCallExp);
				if (result == null) result = caseLocatedElement(operationCallExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.OPERATOR_CALL_EXP: {
				OperatorCallExp operatorCallExp = (OperatorCallExp)theEObject;
				Object result = caseOperatorCallExp(operatorCallExp);
				if (result == null) result = caseOperationCallExp(operatorCallExp);
				if (result == null) result = casePropertyCallExp(operatorCallExp);
				if (result == null) result = caseOclExpression(operatorCallExp);
				if (result == null) result = caseLocatedElement(operatorCallExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.COLLECTION_OPERATION_CALL_EXP: {
				CollectionOperationCallExp collectionOperationCallExp = (CollectionOperationCallExp)theEObject;
				Object result = caseCollectionOperationCallExp(collectionOperationCallExp);
				if (result == null) result = caseOperationCallExp(collectionOperationCallExp);
				if (result == null) result = casePropertyCallExp(collectionOperationCallExp);
				if (result == null) result = caseOclExpression(collectionOperationCallExp);
				if (result == null) result = caseLocatedElement(collectionOperationCallExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.LOOP_EXP: {
				LoopExp loopExp = (LoopExp)theEObject;
				Object result = caseLoopExp(loopExp);
				if (result == null) result = casePropertyCallExp(loopExp);
				if (result == null) result = caseOclExpression(loopExp);
				if (result == null) result = caseLocatedElement(loopExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.ITERATE_EXP: {
				IterateExp iterateExp = (IterateExp)theEObject;
				Object result = caseIterateExp(iterateExp);
				if (result == null) result = caseLoopExp(iterateExp);
				if (result == null) result = casePropertyCallExp(iterateExp);
				if (result == null) result = caseOclExpression(iterateExp);
				if (result == null) result = caseLocatedElement(iterateExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.ITERATOR_EXP: {
				IteratorExp iteratorExp = (IteratorExp)theEObject;
				Object result = caseIteratorExp(iteratorExp);
				if (result == null) result = caseLoopExp(iteratorExp);
				if (result == null) result = casePropertyCallExp(iteratorExp);
				if (result == null) result = caseOclExpression(iteratorExp);
				if (result == null) result = caseLocatedElement(iteratorExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.LET_EXP: {
				LetExp letExp = (LetExp)theEObject;
				Object result = caseLetExp(letExp);
				if (result == null) result = caseOclExpression(letExp);
				if (result == null) result = caseLocatedElement(letExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.IF_EXP: {
				IfExp ifExp = (IfExp)theEObject;
				Object result = caseIfExp(ifExp);
				if (result == null) result = caseOclExpression(ifExp);
				if (result == null) result = caseLocatedElement(ifExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.VARIABLE_DECLARATION: {
				VariableDeclaration variableDeclaration = (VariableDeclaration)theEObject;
				Object result = caseVariableDeclaration(variableDeclaration);
				if (result == null) result = caseLocatedElement(variableDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.ITERATOR: {
				Iterator iterator = (Iterator)theEObject;
				Object result = caseIterator(iterator);
				if (result == null) result = caseVariableDeclaration(iterator);
				if (result == null) result = caseLocatedElement(iterator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				Object result = caseParameter(parameter);
				if (result == null) result = caseVariableDeclaration(parameter);
				if (result == null) result = caseLocatedElement(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.COLLECTION_TYPE: {
				CollectionType collectionType = (CollectionType)theEObject;
				Object result = caseCollectionType(collectionType);
				if (result == null) result = caseOclType(collectionType);
				if (result == null) result = caseOclExpression(collectionType);
				if (result == null) result = caseLocatedElement(collectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.OCL_TYPE: {
				OclType oclType = (OclType)theEObject;
				Object result = caseOclType(oclType);
				if (result == null) result = caseOclExpression(oclType);
				if (result == null) result = caseLocatedElement(oclType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.PRIMITIVE: {
				Primitive primitive = (Primitive)theEObject;
				Object result = casePrimitive(primitive);
				if (result == null) result = caseOclType(primitive);
				if (result == null) result = caseOclExpression(primitive);
				if (result == null) result = caseLocatedElement(primitive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.STRING_TYPE: {
				StringType stringType = (StringType)theEObject;
				Object result = caseStringType(stringType);
				if (result == null) result = casePrimitive(stringType);
				if (result == null) result = caseOclType(stringType);
				if (result == null) result = caseOclExpression(stringType);
				if (result == null) result = caseLocatedElement(stringType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.BOOLEAN_TYPE: {
				BooleanType booleanType = (BooleanType)theEObject;
				Object result = caseBooleanType(booleanType);
				if (result == null) result = casePrimitive(booleanType);
				if (result == null) result = caseOclType(booleanType);
				if (result == null) result = caseOclExpression(booleanType);
				if (result == null) result = caseLocatedElement(booleanType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.NUMERIC_TYPE: {
				NumericType numericType = (NumericType)theEObject;
				Object result = caseNumericType(numericType);
				if (result == null) result = casePrimitive(numericType);
				if (result == null) result = caseOclType(numericType);
				if (result == null) result = caseOclExpression(numericType);
				if (result == null) result = caseLocatedElement(numericType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.INTEGER_TYPE: {
				IntegerType integerType = (IntegerType)theEObject;
				Object result = caseIntegerType(integerType);
				if (result == null) result = caseNumericType(integerType);
				if (result == null) result = casePrimitive(integerType);
				if (result == null) result = caseOclType(integerType);
				if (result == null) result = caseOclExpression(integerType);
				if (result == null) result = caseLocatedElement(integerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.REAL_TYPE: {
				RealType realType = (RealType)theEObject;
				Object result = caseRealType(realType);
				if (result == null) result = caseNumericType(realType);
				if (result == null) result = casePrimitive(realType);
				if (result == null) result = caseOclType(realType);
				if (result == null) result = caseOclExpression(realType);
				if (result == null) result = caseLocatedElement(realType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.BAG_TYPE: {
				BagType bagType = (BagType)theEObject;
				Object result = caseBagType(bagType);
				if (result == null) result = caseCollectionType(bagType);
				if (result == null) result = caseOclType(bagType);
				if (result == null) result = caseOclExpression(bagType);
				if (result == null) result = caseLocatedElement(bagType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.ORDERED_SET_TYPE: {
				OrderedSetType orderedSetType = (OrderedSetType)theEObject;
				Object result = caseOrderedSetType(orderedSetType);
				if (result == null) result = caseCollectionType(orderedSetType);
				if (result == null) result = caseOclType(orderedSetType);
				if (result == null) result = caseOclExpression(orderedSetType);
				if (result == null) result = caseLocatedElement(orderedSetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.SEQUENCE_TYPE: {
				SequenceType sequenceType = (SequenceType)theEObject;
				Object result = caseSequenceType(sequenceType);
				if (result == null) result = caseCollectionType(sequenceType);
				if (result == null) result = caseOclType(sequenceType);
				if (result == null) result = caseOclExpression(sequenceType);
				if (result == null) result = caseLocatedElement(sequenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.SET_TYPE: {
				SetType setType = (SetType)theEObject;
				Object result = caseSetType(setType);
				if (result == null) result = caseCollectionType(setType);
				if (result == null) result = caseOclType(setType);
				if (result == null) result = caseOclExpression(setType);
				if (result == null) result = caseLocatedElement(setType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.OCL_ANY_TYPE: {
				OclAnyType oclAnyType = (OclAnyType)theEObject;
				Object result = caseOclAnyType(oclAnyType);
				if (result == null) result = caseOclType(oclAnyType);
				if (result == null) result = caseOclExpression(oclAnyType);
				if (result == null) result = caseLocatedElement(oclAnyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.TUPLE_TYPE: {
				TupleType tupleType = (TupleType)theEObject;
				Object result = caseTupleType(tupleType);
				if (result == null) result = caseOclType(tupleType);
				if (result == null) result = caseOclExpression(tupleType);
				if (result == null) result = caseLocatedElement(tupleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.TUPLE_TYPE_ATTRIBUTE: {
				TupleTypeAttribute tupleTypeAttribute = (TupleTypeAttribute)theEObject;
				Object result = caseTupleTypeAttribute(tupleTypeAttribute);
				if (result == null) result = caseLocatedElement(tupleTypeAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.OCL_MODEL_ELEMENT: {
				OclModelElement oclModelElement = (OclModelElement)theEObject;
				Object result = caseOclModelElement(oclModelElement);
				if (result == null) result = caseOclType(oclModelElement);
				if (result == null) result = caseOclExpression(oclModelElement);
				if (result == null) result = caseLocatedElement(oclModelElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.MAP_TYPE: {
				MapType mapType = (MapType)theEObject;
				Object result = caseMapType(mapType);
				if (result == null) result = caseOclType(mapType);
				if (result == null) result = caseOclExpression(mapType);
				if (result == null) result = caseLocatedElement(mapType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.OCL_FEATURE_DEFINITION: {
				OclFeatureDefinition oclFeatureDefinition = (OclFeatureDefinition)theEObject;
				Object result = caseOclFeatureDefinition(oclFeatureDefinition);
				if (result == null) result = caseLocatedElement(oclFeatureDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.OCL_CONTEXT_DEFINITION: {
				OclContextDefinition oclContextDefinition = (OclContextDefinition)theEObject;
				Object result = caseOclContextDefinition(oclContextDefinition);
				if (result == null) result = caseLocatedElement(oclContextDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.OCL_FEATURE: {
				OclFeature oclFeature = (OclFeature)theEObject;
				Object result = caseOclFeature(oclFeature);
				if (result == null) result = caseLocatedElement(oclFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.ATTRIBUTE: {
				Attribute attribute = (Attribute)theEObject;
				Object result = caseAttribute(attribute);
				if (result == null) result = caseOclFeature(attribute);
				if (result == null) result = caseLocatedElement(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.OPERATION: {
				Operation operation = (Operation)theEObject;
				Object result = caseOperation(operation);
				if (result == null) result = caseOclFeature(operation);
				if (result == null) result = caseLocatedElement(operation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCLPackage.OCL_MODEL: {
				OclModel oclModel = (OclModel)theEObject;
				Object result = caseOclModel(oclModel);
				if (result == null) result = caseLocatedElement(oclModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ocl Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ocl Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOclExpression(OclExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseVariableExp(VariableExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Super Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSuperExp(SuperExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePrimitiveExp(PrimitiveExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseStringExp(StringExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBooleanExp(BooleanExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numeric Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numeric Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNumericExp(NumericExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Real Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Real Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRealExp(RealExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIntegerExp(IntegerExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCollectionExp(CollectionExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bag Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bag Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBagExp(BagExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ordered Set Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ordered Set Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOrderedSetExp(OrderedSetExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSequenceExp(SequenceExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSetExp(SetExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tuple Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tuple Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTupleExp(TupleExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tuple Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tuple Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTuplePart(TuplePart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Map Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMapExp(MapExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Map Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMapElement(MapElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Literal Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Literal Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEnumLiteralExp(EnumLiteralExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ocl Undefined Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ocl Undefined Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOclUndefinedExp(OclUndefinedExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Call Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Call Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePropertyCallExp(PropertyCallExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Navigation Or Attribute Call Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Navigation Or Attribute Call Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNavigationOrAttributeCallExp(NavigationOrAttributeCallExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Call Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Call Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOperationCallExp(OperationCallExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operator Call Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operator Call Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOperatorCallExp(OperatorCallExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection Operation Call Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection Operation Call Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCollectionOperationCallExp(CollectionOperationCallExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loop Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loop Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLoopExp(LoopExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iterate Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iterate Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIterateExp(IterateExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iterator Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iterator Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIteratorExp(IteratorExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Let Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Let Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLetExp(LetExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIfExp(IfExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseVariableDeclaration(VariableDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iterator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iterator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIterator(Iterator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCollectionType(CollectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ocl Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ocl Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOclType(OclType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePrimitive(Primitive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseStringType(StringType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBooleanType(BooleanType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numeric Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numeric Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNumericType(NumericType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIntegerType(IntegerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Real Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Real Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRealType(RealType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bag Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bag Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBagType(BagType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ordered Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ordered Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOrderedSetType(OrderedSetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSequenceType(SequenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSetType(SetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ocl Any Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ocl Any Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOclAnyType(OclAnyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tuple Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tuple Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTupleType(TupleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tuple Type Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tuple Type Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTupleTypeAttribute(TupleTypeAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ocl Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ocl Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOclModelElement(OclModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Map Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMapType(MapType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ocl Feature Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ocl Feature Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOclFeatureDefinition(OclFeatureDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ocl Context Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ocl Context Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOclContextDefinition(OclContextDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ocl Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ocl Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOclFeature(OclFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOperation(Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ocl Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ocl Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOclModel(OclModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Located Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Located Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLocatedElement(LocatedElement object) {
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
	public Object defaultCase(EObject object) {
		return null;
	}

} //OCLSwitch
