/**
 */
package jointPackage_CPL2SPL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Src Proxy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_CPL2SPL.SrcProxy#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.SrcProxy#getRecurse <em>Recurse</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.SrcProxy#getOrdering <em>Ordering</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.SrcProxy#getBusy <em>Busy</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.SrcProxy#getNoAnswer <em>No Answer</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.SrcProxy#getRedirection <em>Redirection</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.SrcProxy#getFailure <em>Failure</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.SrcProxy#getDefault <em>Default</em>}</li>
 * </ul>
 *
 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getSrcProxy()
 * @model
 * @generated
 */
public interface SrcProxy extends SrcSignallingAction {
	/**
	 * Returns the value of the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeout</em>' attribute.
	 * @see #setTimeout(String)
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getSrcProxy_Timeout()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getTimeout();

	/**
	 * Sets the value of the '{@link jointPackage_CPL2SPL.SrcProxy#getTimeout <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout</em>' attribute.
	 * @see #getTimeout()
	 * @generated
	 */
	void setTimeout(String value);

	/**
	 * Returns the value of the '<em><b>Recurse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recurse</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recurse</em>' attribute.
	 * @see #setRecurse(String)
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getSrcProxy_Recurse()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getRecurse();

	/**
	 * Sets the value of the '{@link jointPackage_CPL2SPL.SrcProxy#getRecurse <em>Recurse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recurse</em>' attribute.
	 * @see #getRecurse()
	 * @generated
	 */
	void setRecurse(String value);

	/**
	 * Returns the value of the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ordering</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ordering</em>' attribute.
	 * @see #setOrdering(String)
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getSrcProxy_Ordering()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getOrdering();

	/**
	 * Sets the value of the '{@link jointPackage_CPL2SPL.SrcProxy#getOrdering <em>Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordering</em>' attribute.
	 * @see #getOrdering()
	 * @generated
	 */
	void setOrdering(String value);

	/**
	 * Returns the value of the '<em><b>Busy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Busy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Busy</em>' containment reference.
	 * @see #setBusy(SrcBusy)
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getSrcProxy_Busy()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	SrcBusy getBusy();

	/**
	 * Sets the value of the '{@link jointPackage_CPL2SPL.SrcProxy#getBusy <em>Busy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Busy</em>' containment reference.
	 * @see #getBusy()
	 * @generated
	 */
	void setBusy(SrcBusy value);

	/**
	 * Returns the value of the '<em><b>No Answer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>No Answer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Answer</em>' containment reference.
	 * @see #setNoAnswer(SrcNoAnswer)
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getSrcProxy_NoAnswer()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	SrcNoAnswer getNoAnswer();

	/**
	 * Sets the value of the '{@link jointPackage_CPL2SPL.SrcProxy#getNoAnswer <em>No Answer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Answer</em>' containment reference.
	 * @see #getNoAnswer()
	 * @generated
	 */
	void setNoAnswer(SrcNoAnswer value);

	/**
	 * Returns the value of the '<em><b>Redirection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redirection</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redirection</em>' containment reference.
	 * @see #setRedirection(SrcRedirection)
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getSrcProxy_Redirection()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	SrcRedirection getRedirection();

	/**
	 * Sets the value of the '{@link jointPackage_CPL2SPL.SrcProxy#getRedirection <em>Redirection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Redirection</em>' containment reference.
	 * @see #getRedirection()
	 * @generated
	 */
	void setRedirection(SrcRedirection value);

	/**
	 * Returns the value of the '<em><b>Failure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure</em>' containment reference.
	 * @see #setFailure(SrcFailure)
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getSrcProxy_Failure()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	SrcFailure getFailure();

	/**
	 * Sets the value of the '{@link jointPackage_CPL2SPL.SrcProxy#getFailure <em>Failure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failure</em>' containment reference.
	 * @see #getFailure()
	 * @generated
	 */
	void setFailure(SrcFailure value);

	/**
	 * Returns the value of the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' containment reference.
	 * @see #setDefault(SrcDefault)
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getSrcProxy_Default()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	SrcDefault getDefault();

	/**
	 * Sets the value of the '{@link jointPackage_CPL2SPL.SrcProxy#getDefault <em>Default</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' containment reference.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(SrcDefault value);

} // SrcProxy
