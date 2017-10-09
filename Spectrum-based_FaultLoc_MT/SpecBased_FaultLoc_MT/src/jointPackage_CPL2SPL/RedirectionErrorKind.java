/**
 */
package jointPackage_CPL2SPL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Redirection Error Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getRedirectionErrorKind()
 * @model
 * @generated
 */
public enum RedirectionErrorKind implements Enumerator {
	/**
	 * The '<em><b>ALTERNATIVE SERVICE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALTERNATIVE_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	ALTERNATIVE_SERVICE(0, "ALTERNATIVE_SERVICE", "ALTERNATIVE_SERVICE"),

	/**
	 * The '<em><b>MOVED PERMANENTLY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOVED_PERMANENTLY_VALUE
	 * @generated
	 * @ordered
	 */
	MOVED_PERMANENTLY(0, "MOVED_PERMANENTLY", "MOVED_PERMANENTLY"),

	/**
	 * The '<em><b>MOVED TEMPORARILY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOVED_TEMPORARILY_VALUE
	 * @generated
	 * @ordered
	 */
	MOVED_TEMPORARILY(0, "MOVED_TEMPORARILY", "MOVED_TEMPORARILY"),

	/**
	 * The '<em><b>MULTIPLE CHOICES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPLE_CHOICES_VALUE
	 * @generated
	 * @ordered
	 */
	MULTIPLE_CHOICES(0, "MULTIPLE_CHOICES", "MULTIPLE_CHOICES"),

	/**
	 * The '<em><b>USE PROXY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USE_PROXY_VALUE
	 * @generated
	 * @ordered
	 */
	USE_PROXY(0, "USE_PROXY", "USE_PROXY");

	/**
	 * The '<em><b>ALTERNATIVE SERVICE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ALTERNATIVE SERVICE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALTERNATIVE_SERVICE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ALTERNATIVE_SERVICE_VALUE = 0;

	/**
	 * The '<em><b>MOVED PERMANENTLY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MOVED PERMANENTLY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOVED_PERMANENTLY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MOVED_PERMANENTLY_VALUE = 0;

	/**
	 * The '<em><b>MOVED TEMPORARILY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MOVED TEMPORARILY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOVED_TEMPORARILY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MOVED_TEMPORARILY_VALUE = 0;

	/**
	 * The '<em><b>MULTIPLE CHOICES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MULTIPLE CHOICES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MULTIPLE_CHOICES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MULTIPLE_CHOICES_VALUE = 0;

	/**
	 * The '<em><b>USE PROXY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>USE PROXY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #USE_PROXY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int USE_PROXY_VALUE = 0;

	/**
	 * An array of all the '<em><b>Redirection Error Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RedirectionErrorKind[] VALUES_ARRAY =
		new RedirectionErrorKind[] {
			ALTERNATIVE_SERVICE,
			MOVED_PERMANENTLY,
			MOVED_TEMPORARILY,
			MULTIPLE_CHOICES,
			USE_PROXY,
		};

	/**
	 * A public read-only list of all the '<em><b>Redirection Error Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RedirectionErrorKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Redirection Error Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RedirectionErrorKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RedirectionErrorKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Redirection Error Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RedirectionErrorKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RedirectionErrorKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Redirection Error Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RedirectionErrorKind get(int value) {
		switch (value) {
			case ALTERNATIVE_SERVICE_VALUE: return ALTERNATIVE_SERVICE;
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
	private RedirectionErrorKind(int value, String name, String literal) {
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
	
} //RedirectionErrorKind
