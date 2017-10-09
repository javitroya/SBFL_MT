/**
 */
package jointPackage_CPL2SPL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Global Error Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getGlobalErrorKind()
 * @model
 * @generated
 */
public enum GlobalErrorKind implements Enumerator {
	/**
	 * The '<em><b>BUSY EVERYWHERE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUSY_EVERYWHERE_VALUE
	 * @generated
	 * @ordered
	 */
	BUSY_EVERYWHERE(0, "BUSY_EVERYWHERE", "BUSY_EVERYWHERE"),

	/**
	 * The '<em><b>DECLINE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECLINE_VALUE
	 * @generated
	 * @ordered
	 */
	DECLINE(0, "DECLINE", "DECLINE"),

	/**
	 * The '<em><b>DOES NOT EXIST ANYWHERE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOES_NOT_EXIST_ANYWHERE_VALUE
	 * @generated
	 * @ordered
	 */
	DOES_NOT_EXIST_ANYWHERE(0, "DOES_NOT_EXIST_ANYWHERE", "DOES_NOT_EXIST_ANYWHERE"),

	/**
	 * The '<em><b>NOT ACCEPTABLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_ACCEPTABLE_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_ACCEPTABLE(0, "NOT_ACCEPTABLE", "NOT_ACCEPTABLE");

	/**
	 * The '<em><b>BUSY EVERYWHERE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BUSY EVERYWHERE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BUSY_EVERYWHERE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BUSY_EVERYWHERE_VALUE = 0;

	/**
	 * The '<em><b>DECLINE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DECLINE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DECLINE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DECLINE_VALUE = 0;

	/**
	 * The '<em><b>DOES NOT EXIST ANYWHERE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DOES NOT EXIST ANYWHERE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOES_NOT_EXIST_ANYWHERE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOES_NOT_EXIST_ANYWHERE_VALUE = 0;

	/**
	 * The '<em><b>NOT ACCEPTABLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOT ACCEPTABLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOT_ACCEPTABLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOT_ACCEPTABLE_VALUE = 0;

	/**
	 * An array of all the '<em><b>Global Error Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GlobalErrorKind[] VALUES_ARRAY =
		new GlobalErrorKind[] {
			BUSY_EVERYWHERE,
			DECLINE,
			DOES_NOT_EXIST_ANYWHERE,
			NOT_ACCEPTABLE,
		};

	/**
	 * A public read-only list of all the '<em><b>Global Error Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GlobalErrorKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Global Error Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GlobalErrorKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GlobalErrorKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Global Error Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GlobalErrorKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GlobalErrorKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Global Error Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GlobalErrorKind get(int value) {
		switch (value) {
			case BUSY_EVERYWHERE_VALUE: return BUSY_EVERYWHERE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private GlobalErrorKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //GlobalErrorKind
