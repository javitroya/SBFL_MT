/**
 */
package jointPackage_CPL2SPL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Control Method</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getControlMethod()
 * @model
 * @generated
 */
public enum ControlMethod implements Enumerator {
	/**
	 * The '<em><b>Deploy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPLOY_VALUE
	 * @generated
	 * @ordered
	 */
	DEPLOY(0, "deploy", "deploy"),

	/**
	 * The '<em><b>Undeploy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDEPLOY_VALUE
	 * @generated
	 * @ordered
	 */
	UNDEPLOY(0, "undeploy", "undeploy"),

	/**
	 * The '<em><b>Uninvite</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNINVITE_VALUE
	 * @generated
	 * @ordered
	 */
	UNINVITE(0, "uninvite", "uninvite"),

	/**
	 * The '<em><b>Unregister</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNREGISTER_VALUE
	 * @generated
	 * @ordered
	 */
	UNREGISTER(0, "unregister", "unregister"),

	/**
	 * The '<em><b>Unsubscribe</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSUBSCRIBE_VALUE
	 * @generated
	 * @ordered
	 */
	UNSUBSCRIBE(0, "unsubscribe", "unsubscribe");

	/**
	 * The '<em><b>Deploy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Deploy</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEPLOY
	 * @model name="deploy"
	 * @generated
	 * @ordered
	 */
	public static final int DEPLOY_VALUE = 0;

	/**
	 * The '<em><b>Undeploy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Undeploy</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNDEPLOY
	 * @model name="undeploy"
	 * @generated
	 * @ordered
	 */
	public static final int UNDEPLOY_VALUE = 0;

	/**
	 * The '<em><b>Uninvite</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Uninvite</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNINVITE
	 * @model name="uninvite"
	 * @generated
	 * @ordered
	 */
	public static final int UNINVITE_VALUE = 0;

	/**
	 * The '<em><b>Unregister</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unregister</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNREGISTER
	 * @model name="unregister"
	 * @generated
	 * @ordered
	 */
	public static final int UNREGISTER_VALUE = 0;

	/**
	 * The '<em><b>Unsubscribe</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unsubscribe</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNSUBSCRIBE
	 * @model name="unsubscribe"
	 * @generated
	 * @ordered
	 */
	public static final int UNSUBSCRIBE_VALUE = 0;

	/**
	 * An array of all the '<em><b>Control Method</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ControlMethod[] VALUES_ARRAY =
		new ControlMethod[] {
			DEPLOY,
			UNDEPLOY,
			UNINVITE,
			UNREGISTER,
			UNSUBSCRIBE,
		};

	/**
	 * A public read-only list of all the '<em><b>Control Method</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ControlMethod> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Control Method</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ControlMethod get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ControlMethod result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Control Method</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ControlMethod getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ControlMethod result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Control Method</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ControlMethod get(int value) {
		switch (value) {
			case DEPLOY_VALUE: return DEPLOY;
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
	private ControlMethod(int value, String name, String literal) {
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
	
} //ControlMethod
