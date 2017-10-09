/**
 */
package jointPackage_CPL2SPL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Client Error Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getClientErrorKind()
 * @model
 * @generated
 */
public enum ClientErrorKind implements Enumerator {
	/**
	 * The '<em><b>ADDRESS INCOMPLETE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADDRESS_INCOMPLETE_VALUE
	 * @generated
	 * @ordered
	 */
	ADDRESS_INCOMPLETE(0, "ADDRESS_INCOMPLETE", "ADDRESS_INCOMPLETE"),

	/**
	 * The '<em><b>AMBIGUOUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AMBIGUOUS_VALUE
	 * @generated
	 * @ordered
	 */
	AMBIGUOUS(0, "AMBIGUOUS", "AMBIGUOUS"),

	/**
	 * The '<em><b>BAD EXTENSION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BAD_EXTENSION_VALUE
	 * @generated
	 * @ordered
	 */
	BAD_EXTENSION(0, "BAD_EXTENSION", "BAD_EXTENSION"),

	/**
	 * The '<em><b>BAD REQUEST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BAD_REQUEST_VALUE
	 * @generated
	 * @ordered
	 */
	BAD_REQUEST(0, "BAD_REQUEST", "BAD_REQUEST"),

	/**
	 * The '<em><b>BUSY HERE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUSY_HERE_VALUE
	 * @generated
	 * @ordered
	 */
	BUSY_HERE(0, "BUSY_HERE", "BUSY_HERE"),

	/**
	 * The '<em><b>CALL OR TRANSACTION DOES NOT EXIST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CALL_OR_TRANSACTION_DOES_NOT_EXIST_VALUE
	 * @generated
	 * @ordered
	 */
	CALL_OR_TRANSACTION_DOES_NOT_EXIST(0, "CALL_OR_TRANSACTION_DOES_NOT_EXIST", "CALL_OR_TRANSACTION_DOES_NOT_EXIST"),

	/**
	 * The '<em><b>EXTENSION REQUIRED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTENSION_REQUIRED_VALUE
	 * @generated
	 * @ordered
	 */
	EXTENSION_REQUIRED(0, "EXTENSION_REQUIRED", "EXTENSION_REQUIRED"),

	/**
	 * The '<em><b>FORBIDDEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FORBIDDEN_VALUE
	 * @generated
	 * @ordered
	 */
	FORBIDDEN(0, "FORBIDDEN", "FORBIDDEN"),

	/**
	 * The '<em><b>GONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GONE_VALUE
	 * @generated
	 * @ordered
	 */
	GONE(0, "GONE", "GONE"),

	/**
	 * The '<em><b>INTERVAL TOO BRIEF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERVAL_TOO_BRIEF_VALUE
	 * @generated
	 * @ordered
	 */
	INTERVAL_TOO_BRIEF(0, "INTERVAL_TOO_BRIEF", "INTERVAL_TOO_BRIEF"),

	/**
	 * The '<em><b>LOOP DETECTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOOP_DETECTED_VALUE
	 * @generated
	 * @ordered
	 */
	LOOP_DETECTED(0, "LOOP_DETECTED", "LOOP_DETECTED"),

	/**
	 * The '<em><b>METHOD NOT ALLOWED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METHOD_NOT_ALLOWED_VALUE
	 * @generated
	 * @ordered
	 */
	METHOD_NOT_ALLOWED(0, "METHOD_NOT_ALLOWED", "METHOD_NOT_ALLOWED"),

	/**
	 * The '<em><b>NOT ACCEPTABLE HERE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_ACCEPTABLE_HERE_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_ACCEPTABLE_HERE(0, "NOT_ACCEPTABLE_HERE", "NOT_ACCEPTABLE_HERE"),

	/**
	 * The '<em><b>NOT ACCEPTABLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_ACCEPTABLE_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_ACCEPTABLE(0, "NOT_ACCEPTABLE", "NOT_ACCEPTABLE"),

	/**
	 * The '<em><b>NOT FOUND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_FOUND_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_FOUND(0, "NOT_FOUND", "NOT_FOUND"),

	/**
	 * The '<em><b>PAYMENT REQUIRED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAYMENT_REQUIRED_VALUE
	 * @generated
	 * @ordered
	 */
	PAYMENT_REQUIRED(0, "PAYMENT_REQUIRED", "PAYMENT_REQUIRED"),

	/**
	 * The '<em><b>PROXY AUTHENTICATION REQUIRED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROXY_AUTHENTICATION_REQUIRED_VALUE
	 * @generated
	 * @ordered
	 */
	PROXY_AUTHENTICATION_REQUIRED(0, "PROXY_AUTHENTICATION_REQUIRED", "PROXY_AUTHENTICATION_REQUIRED"),

	/**
	 * The '<em><b>REQUESTURI TOO LONG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUESTURI_TOO_LONG_VALUE
	 * @generated
	 * @ordered
	 */
	REQUESTURI_TOO_LONG(0, "REQUESTURI_TOO_LONG", "REQUESTURI_TOO_LONG"),

	/**
	 * The '<em><b>REQUEST ENTITY TOO LARGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUEST_ENTITY_TOO_LARGE_VALUE
	 * @generated
	 * @ordered
	 */
	REQUEST_ENTITY_TOO_LARGE(0, "REQUEST_ENTITY_TOO_LARGE", "REQUEST_ENTITY_TOO_LARGE"),

	/**
	 * The '<em><b>REQUEST PENDING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUEST_PENDING_VALUE
	 * @generated
	 * @ordered
	 */
	REQUEST_PENDING(0, "REQUEST_PENDING", "REQUEST_PENDING"),

	/**
	 * The '<em><b>REQUEST TERMINATED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUEST_TERMINATED_VALUE
	 * @generated
	 * @ordered
	 */
	REQUEST_TERMINATED(0, "REQUEST_TERMINATED", "REQUEST_TERMINATED"),

	/**
	 * The '<em><b>REQUEST TIMEOUT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUEST_TIMEOUT_VALUE
	 * @generated
	 * @ordered
	 */
	REQUEST_TIMEOUT(0, "REQUEST_TIMEOUT", "REQUEST_TIMEOUT"),

	/**
	 * The '<em><b>TEMPORARILY UNAVAILABLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEMPORARILY_UNAVAILABLE_VALUE
	 * @generated
	 * @ordered
	 */
	TEMPORARILY_UNAVAILABLE(0, "TEMPORARILY_UNAVAILABLE", "TEMPORARILY_UNAVAILABLE"),

	/**
	 * The '<em><b>TOO MANY HOPS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOO_MANY_HOPS_VALUE
	 * @generated
	 * @ordered
	 */
	TOO_MANY_HOPS(0, "TOO_MANY_HOPS", "TOO_MANY_HOPS"),

	/**
	 * The '<em><b>UNAUTHORIZED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNAUTHORIZED_VALUE
	 * @generated
	 * @ordered
	 */
	UNAUTHORIZED(0, "UNAUTHORIZED", "UNAUTHORIZED"),

	/**
	 * The '<em><b>UNDECIPHERABLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDECIPHERABLE_VALUE
	 * @generated
	 * @ordered
	 */
	UNDECIPHERABLE(0, "UNDECIPHERABLE", "UNDECIPHERABLE"),

	/**
	 * The '<em><b>UNSUPPORTED MEDIA TYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSUPPORTED_MEDIA_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	UNSUPPORTED_MEDIA_TYPE(0, "UNSUPPORTED_MEDIA_TYPE", "UNSUPPORTED_MEDIA_TYPE"),

	/**
	 * The '<em><b>UNSUPPORTED URI SCHEME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSUPPORTED_URI_SCHEME_VALUE
	 * @generated
	 * @ordered
	 */
	UNSUPPORTED_URI_SCHEME(0, "UNSUPPORTED_URI_SCHEME", "UNSUPPORTED_URI_SCHEME");

	/**
	 * The '<em><b>ADDRESS INCOMPLETE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ADDRESS INCOMPLETE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADDRESS_INCOMPLETE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ADDRESS_INCOMPLETE_VALUE = 0;

	/**
	 * The '<em><b>AMBIGUOUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AMBIGUOUS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AMBIGUOUS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AMBIGUOUS_VALUE = 0;

	/**
	 * The '<em><b>BAD EXTENSION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BAD EXTENSION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BAD_EXTENSION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BAD_EXTENSION_VALUE = 0;

	/**
	 * The '<em><b>BAD REQUEST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BAD REQUEST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BAD_REQUEST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BAD_REQUEST_VALUE = 0;

	/**
	 * The '<em><b>BUSY HERE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BUSY HERE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BUSY_HERE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BUSY_HERE_VALUE = 0;

	/**
	 * The '<em><b>CALL OR TRANSACTION DOES NOT EXIST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CALL OR TRANSACTION DOES NOT EXIST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CALL_OR_TRANSACTION_DOES_NOT_EXIST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CALL_OR_TRANSACTION_DOES_NOT_EXIST_VALUE = 0;

	/**
	 * The '<em><b>EXTENSION REQUIRED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EXTENSION REQUIRED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXTENSION_REQUIRED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXTENSION_REQUIRED_VALUE = 0;

	/**
	 * The '<em><b>FORBIDDEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FORBIDDEN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FORBIDDEN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FORBIDDEN_VALUE = 0;

	/**
	 * The '<em><b>GONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GONE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GONE_VALUE = 0;

	/**
	 * The '<em><b>INTERVAL TOO BRIEF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INTERVAL TOO BRIEF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTERVAL_TOO_BRIEF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTERVAL_TOO_BRIEF_VALUE = 0;

	/**
	 * The '<em><b>LOOP DETECTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LOOP DETECTED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOOP_DETECTED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOOP_DETECTED_VALUE = 0;

	/**
	 * The '<em><b>METHOD NOT ALLOWED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>METHOD NOT ALLOWED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #METHOD_NOT_ALLOWED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int METHOD_NOT_ALLOWED_VALUE = 0;

	/**
	 * The '<em><b>NOT ACCEPTABLE HERE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOT ACCEPTABLE HERE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOT_ACCEPTABLE_HERE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOT_ACCEPTABLE_HERE_VALUE = 0;

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
	 * The '<em><b>NOT FOUND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOT FOUND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOT_FOUND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOT_FOUND_VALUE = 0;

	/**
	 * The '<em><b>PAYMENT REQUIRED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PAYMENT REQUIRED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PAYMENT_REQUIRED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PAYMENT_REQUIRED_VALUE = 0;

	/**
	 * The '<em><b>PROXY AUTHENTICATION REQUIRED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PROXY AUTHENTICATION REQUIRED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROXY_AUTHENTICATION_REQUIRED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PROXY_AUTHENTICATION_REQUIRED_VALUE = 0;

	/**
	 * The '<em><b>REQUESTURI TOO LONG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REQUESTURI TOO LONG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REQUESTURI_TOO_LONG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REQUESTURI_TOO_LONG_VALUE = 0;

	/**
	 * The '<em><b>REQUEST ENTITY TOO LARGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REQUEST ENTITY TOO LARGE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REQUEST_ENTITY_TOO_LARGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST_ENTITY_TOO_LARGE_VALUE = 0;

	/**
	 * The '<em><b>REQUEST PENDING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REQUEST PENDING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REQUEST_PENDING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST_PENDING_VALUE = 0;

	/**
	 * The '<em><b>REQUEST TERMINATED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REQUEST TERMINATED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REQUEST_TERMINATED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST_TERMINATED_VALUE = 0;

	/**
	 * The '<em><b>REQUEST TIMEOUT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REQUEST TIMEOUT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REQUEST_TIMEOUT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST_TIMEOUT_VALUE = 0;

	/**
	 * The '<em><b>TEMPORARILY UNAVAILABLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TEMPORARILY UNAVAILABLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEMPORARILY_UNAVAILABLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TEMPORARILY_UNAVAILABLE_VALUE = 0;

	/**
	 * The '<em><b>TOO MANY HOPS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TOO MANY HOPS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOO_MANY_HOPS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TOO_MANY_HOPS_VALUE = 0;

	/**
	 * The '<em><b>UNAUTHORIZED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNAUTHORIZED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNAUTHORIZED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNAUTHORIZED_VALUE = 0;

	/**
	 * The '<em><b>UNDECIPHERABLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNDECIPHERABLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNDECIPHERABLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNDECIPHERABLE_VALUE = 0;

	/**
	 * The '<em><b>UNSUPPORTED MEDIA TYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNSUPPORTED MEDIA TYPE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNSUPPORTED_MEDIA_TYPE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNSUPPORTED_MEDIA_TYPE_VALUE = 0;

	/**
	 * The '<em><b>UNSUPPORTED URI SCHEME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNSUPPORTED URI SCHEME</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNSUPPORTED_URI_SCHEME
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNSUPPORTED_URI_SCHEME_VALUE = 0;

	/**
	 * An array of all the '<em><b>Client Error Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ClientErrorKind[] VALUES_ARRAY =
		new ClientErrorKind[] {
			ADDRESS_INCOMPLETE,
			AMBIGUOUS,
			BAD_EXTENSION,
			BAD_REQUEST,
			BUSY_HERE,
			CALL_OR_TRANSACTION_DOES_NOT_EXIST,
			EXTENSION_REQUIRED,
			FORBIDDEN,
			GONE,
			INTERVAL_TOO_BRIEF,
			LOOP_DETECTED,
			METHOD_NOT_ALLOWED,
			NOT_ACCEPTABLE_HERE,
			NOT_ACCEPTABLE,
			NOT_FOUND,
			PAYMENT_REQUIRED,
			PROXY_AUTHENTICATION_REQUIRED,
			REQUESTURI_TOO_LONG,
			REQUEST_ENTITY_TOO_LARGE,
			REQUEST_PENDING,
			REQUEST_TERMINATED,
			REQUEST_TIMEOUT,
			TEMPORARILY_UNAVAILABLE,
			TOO_MANY_HOPS,
			UNAUTHORIZED,
			UNDECIPHERABLE,
			UNSUPPORTED_MEDIA_TYPE,
			UNSUPPORTED_URI_SCHEME,
		};

	/**
	 * A public read-only list of all the '<em><b>Client Error Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ClientErrorKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Client Error Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ClientErrorKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ClientErrorKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Client Error Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ClientErrorKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ClientErrorKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Client Error Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ClientErrorKind get(int value) {
		switch (value) {
			case ADDRESS_INCOMPLETE_VALUE: return ADDRESS_INCOMPLETE;
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
	private ClientErrorKind(int value, String name, String literal) {
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
	
} //ClientErrorKind
