/**
 */
package jointPackage_Ecore2Maude;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Kind</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_Ecore2Maude.TrgKind#getSorts <em>Sorts</em>}</li>
 * </ul>
 *
 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getTrgKind()
 * @model
 * @generated
 */
public interface TrgKind extends TrgType {
	/**
	 * Returns the value of the '<em><b>Sorts</b></em>' reference list.
	 * The list contents are of type {@link jointPackage_Ecore2Maude.TrgSort}.
	 * It is bidirectional and its opposite is '{@link jointPackage_Ecore2Maude.TrgSort#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sorts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorts</em>' reference list.
	 * @see jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage#getTrgKind_Sorts()
	 * @see jointPackage_Ecore2Maude.TrgSort#getKind
	 * @model opposite="kind" required="true" ordered="false"
	 * @generated
	 */
	EList<TrgSort> getSorts();

} // TrgKind
