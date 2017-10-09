/**
 */
package jointPackage_CPL2SPL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Server Error Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getServerErrorKind()
 * @model
 * @generated
 */
public enum ServerErrorKind implements Enumerator {
	/**
	 * The '<em><b>BAD GATEWAY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BAD_GATEWAY_VALUE
	 * @generated
	 * @ordered
	 */
	BAD_GATEWAY(0, "BAD_GATEWAY", "BAD_GATEWAY"),

	/**
	 * The '<em><b>MESSAGE TOO LARGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MESSAGE_TOO_LARGE_VALUE
	 * @generated
	 * @ordered
	 */
	MESSAGE_TOO_LARGE(0, "MESSAGE_TOO_LARGE", "MESSAGE_TOO_LARGE"),

	/**
	 * The '<em><b>NOT IMPLEMENTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_IMPLEMENTED_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_IMPLEMENTED(0, "NOT_IMPLEMENTED", "NOT_IMPLEMENTED"),

	/**
	 * The '<em><b>SERVER INTERNAL ERROR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVER_INTERNAL_ERROR_VALUE
	 * @generated
	 * @ordered
	 */
	SERVER_INTERNAL_ERROR(0, "SERVER_INTERNAL_ERROR", "SERVER_INTERNAL_ERROR"),

	/**
	 * The '<em><b>SERVER TIMEOUT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVER_TIMEOUT_VALUE
	 * @generated
	 * @ordered
	 */
	SERVER_TIMEOUT(0, "SERVER_TIMEOUT", "SERVER_TIMEOUT"),

	/**
	 * The '<em><b>SERVICE UNAVAILABLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVICE_UNAVAILABLE_VALUE
	 * @generated
	 * @ordered
	 */
	SERVICE_UNAVAILABLE(0, "SERVICE_UNAVAILABLE", "SERVICE_UNAVAILABLE"),

	/**
	 * The '<em><b>VERSION NOT SUPPORTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERSION_NOT_SUPPORTED_VALUE
	 * @generated
	 * @ordered
	 */
	VERSION_NOT_SUPPORTED(0, "VERSION_NOT_SUPPORTED", "VERSION_NOT_SUPPORTED");

	/**
	 * The '<em><b>BAD GATEWAY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BAD GATEWAY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BAD_GATEWAY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BAD_GATEWAY_VALUE = 0;

	/**
	 * The '<em><b>MESSAGE TOO LARGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MESSAGE TOO LARGE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MESSAGE_TOO_LARGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MESSAGE_TOO_LARGE_VALUE = 0;

	/**
	 * The '<em><b>NOT IMPLEMENTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOT IMPLEMENTED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOT_IMPLEMENTED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOT_IMPLEMENTED_VALUE = 0;

	/**
	 * The '<em><b>SERVER INTERNAL ERROR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SERVER INTERNAL ERROR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SERVER_INTERNAL_ERROR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SERVER_INTERNAL_ERROR_VALUE = 0;

	/**
	 * The '<em><b>SERVER TIMEOUT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SERVER TIMEOUT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SERVER_TIMEOUT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SERVER_TIMEOUT_VALUE = 0;

	/**
	 * The '<em><b>SERVICE UNAVAILABLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SERVICE UNAVAILABLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SERVICE_UNAVAILABLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_UNAVAILABLE_VALUE = 0;

	/**
	 * The '<em><b>VERSION NOT SUPPORTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VERSION NOT SUPPORTED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VERSION_NOT_SUPPORTED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VERSION_NOT_SUPPORTED_VALUE = 0;

	/**
	 * An array of all the '<em><b>Server Error Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ServerErrorKind[] VALUES_ARRAY =
		new ServerErrorKind[] {
			BAD_GATEWAY,
			MESSAGE_TOO_LARGE,
			NOT_IMPLEMENTED,
			SERVER_INTERNAL_ERROR,
			SERVER_TIMEOUT,
			SERVICE_UNAVAILABLE,
			VERSION_NOT_SUPPORTED,
		};

	/**
	 * A public read-only list of all the '<em><b>Server Error Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ServerErrorKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Server Error Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ServerErrorKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ServerErrorKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Server Error Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ServerErrorKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ServerErrorKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Server Error Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ServerErrorKind get(int value) {
		switch (value) {
			case BAD_GATEWAY_VALUE: return BAD_GATEWAY;
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
	private ServerErrorKind(int value, String name, String literal) {
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
	
} //ServerErrorKind
