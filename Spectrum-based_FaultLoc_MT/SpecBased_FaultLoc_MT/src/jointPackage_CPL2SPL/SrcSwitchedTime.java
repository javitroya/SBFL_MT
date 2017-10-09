/**
 */
package jointPackage_CPL2SPL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Src Switched Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_CPL2SPL.SrcSwitchedTime#getDtstart <em>Dtstart</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.SrcSwitchedTime#getDtend <em>Dtend</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.SrcSwitchedTime#getDuration <em>Duration</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.SrcSwitchedTime#getFreq <em>Freq</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.SrcSwitchedTime#getUntil <em>Until</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.SrcSwitchedTime#getCount <em>Count</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.SrcSwitchedTime#getInterval <em>Interval</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.SrcSwitchedTime#getBySecond <em>By Second</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.SrcSwitchedTime#getByMinute <em>By Minute</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.SrcSwitchedTime#getByHour <em>By Hour</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.SrcSwitchedTime#getByDay <em>By Day</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.SrcSwitchedTime#getByMonthDay <em>By Month Day</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.SrcSwitchedTime#getByYearDay <em>By Year Day</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.SrcSwitchedTime#getByWeekNo <em>By Week No</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.SrcSwitchedTime#getByMonth <em>By Month</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.SrcSwitchedTime#getWkst <em>Wkst</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.SrcSwitchedTime#getBySetPos <em>By Set Pos</em>}</li>
 * </ul>
 *
 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getSrcSwitchedTime()
 * @model
 * @generated
 */
public interface SrcSwitchedTime extends SrcNodeContainer {
	/**
	 * Returns the value of the '<em><b>Dtstart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dtstart</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dtstart</em>' attribute.
	 * @see #setDtstart(String)
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getSrcSwitchedTime_Dtstart()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getDtstart();

	/**
	 * Sets the value of the '{@link jointPackage_CPL2SPL.SrcSwitchedTime#getDtstart <em>Dtstart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dtstart</em>' attribute.
	 * @see #getDtstart()
	 * @generated
	 */
	void setDtstart(String value);

	/**
	 * Returns the value of the '<em><b>Dtend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dtend</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dtend</em>' attribute.
	 * @see #setDtend(String)
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getSrcSwitchedTime_Dtend()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getDtend();

	/**
	 * Sets the value of the '{@link jointPackage_CPL2SPL.SrcSwitchedTime#getDtend <em>Dtend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dtend</em>' attribute.
	 * @see #getDtend()
	 * @generated
	 */
	void setDtend(String value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(String)
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getSrcSwitchedTime_Duration()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getDuration();

	/**
	 * Sets the value of the '{@link jointPackage_CPL2SPL.SrcSwitchedTime#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(String value);

	/**
	 * Returns the value of the '<em><b>Freq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Freq</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Freq</em>' attribute.
	 * @see #setFreq(String)
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getSrcSwitchedTime_Freq()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getFreq();

	/**
	 * Sets the value of the '{@link jointPackage_CPL2SPL.SrcSwitchedTime#getFreq <em>Freq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Freq</em>' attribute.
	 * @see #getFreq()
	 * @generated
	 */
	void setFreq(String value);

	/**
	 * Returns the value of the '<em><b>Until</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Until</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Until</em>' attribute.
	 * @see #setUntil(String)
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getSrcSwitchedTime_Until()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getUntil();

	/**
	 * Sets the value of the '{@link jointPackage_CPL2SPL.SrcSwitchedTime#getUntil <em>Until</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Until</em>' attribute.
	 * @see #getUntil()
	 * @generated
	 */
	void setUntil(String value);

	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #setCount(String)
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getSrcSwitchedTime_Count()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getCount();

	/**
	 * Sets the value of the '{@link jointPackage_CPL2SPL.SrcSwitchedTime#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(String value);

	/**
	 * Returns the value of the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval</em>' attribute.
	 * @see #setInterval(String)
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getSrcSwitchedTime_Interval()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getInterval();

	/**
	 * Sets the value of the '{@link jointPackage_CPL2SPL.SrcSwitchedTime#getInterval <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval</em>' attribute.
	 * @see #getInterval()
	 * @generated
	 */
	void setInterval(String value);

	/**
	 * Returns the value of the '<em><b>By Second</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>By Second</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>By Second</em>' attribute.
	 * @see #setBySecond(String)
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getSrcSwitchedTime_BySecond()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getBySecond();

	/**
	 * Sets the value of the '{@link jointPackage_CPL2SPL.SrcSwitchedTime#getBySecond <em>By Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>By Second</em>' attribute.
	 * @see #getBySecond()
	 * @generated
	 */
	void setBySecond(String value);

	/**
	 * Returns the value of the '<em><b>By Minute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>By Minute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>By Minute</em>' attribute.
	 * @see #setByMinute(String)
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getSrcSwitchedTime_ByMinute()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getByMinute();

	/**
	 * Sets the value of the '{@link jointPackage_CPL2SPL.SrcSwitchedTime#getByMinute <em>By Minute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>By Minute</em>' attribute.
	 * @see #getByMinute()
	 * @generated
	 */
	void setByMinute(String value);

	/**
	 * Returns the value of the '<em><b>By Hour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>By Hour</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>By Hour</em>' attribute.
	 * @see #setByHour(String)
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getSrcSwitchedTime_ByHour()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getByHour();

	/**
	 * Sets the value of the '{@link jointPackage_CPL2SPL.SrcSwitchedTime#getByHour <em>By Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>By Hour</em>' attribute.
	 * @see #getByHour()
	 * @generated
	 */
	void setByHour(String value);

	/**
	 * Returns the value of the '<em><b>By Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>By Day</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>By Day</em>' attribute.
	 * @see #setByDay(String)
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getSrcSwitchedTime_ByDay()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getByDay();

	/**
	 * Sets the value of the '{@link jointPackage_CPL2SPL.SrcSwitchedTime#getByDay <em>By Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>By Day</em>' attribute.
	 * @see #getByDay()
	 * @generated
	 */
	void setByDay(String value);

	/**
	 * Returns the value of the '<em><b>By Month Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>By Month Day</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>By Month Day</em>' attribute.
	 * @see #setByMonthDay(String)
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getSrcSwitchedTime_ByMonthDay()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getByMonthDay();

	/**
	 * Sets the value of the '{@link jointPackage_CPL2SPL.SrcSwitchedTime#getByMonthDay <em>By Month Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>By Month Day</em>' attribute.
	 * @see #getByMonthDay()
	 * @generated
	 */
	void setByMonthDay(String value);

	/**
	 * Returns the value of the '<em><b>By Year Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>By Year Day</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>By Year Day</em>' attribute.
	 * @see #setByYearDay(String)
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getSrcSwitchedTime_ByYearDay()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getByYearDay();

	/**
	 * Sets the value of the '{@link jointPackage_CPL2SPL.SrcSwitchedTime#getByYearDay <em>By Year Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>By Year Day</em>' attribute.
	 * @see #getByYearDay()
	 * @generated
	 */
	void setByYearDay(String value);

	/**
	 * Returns the value of the '<em><b>By Week No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>By Week No</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>By Week No</em>' attribute.
	 * @see #setByWeekNo(String)
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getSrcSwitchedTime_ByWeekNo()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getByWeekNo();

	/**
	 * Sets the value of the '{@link jointPackage_CPL2SPL.SrcSwitchedTime#getByWeekNo <em>By Week No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>By Week No</em>' attribute.
	 * @see #getByWeekNo()
	 * @generated
	 */
	void setByWeekNo(String value);

	/**
	 * Returns the value of the '<em><b>By Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>By Month</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>By Month</em>' attribute.
	 * @see #setByMonth(String)
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getSrcSwitchedTime_ByMonth()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getByMonth();

	/**
	 * Sets the value of the '{@link jointPackage_CPL2SPL.SrcSwitchedTime#getByMonth <em>By Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>By Month</em>' attribute.
	 * @see #getByMonth()
	 * @generated
	 */
	void setByMonth(String value);

	/**
	 * Returns the value of the '<em><b>Wkst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wkst</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wkst</em>' attribute.
	 * @see #setWkst(String)
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getSrcSwitchedTime_Wkst()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getWkst();

	/**
	 * Sets the value of the '{@link jointPackage_CPL2SPL.SrcSwitchedTime#getWkst <em>Wkst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wkst</em>' attribute.
	 * @see #getWkst()
	 * @generated
	 */
	void setWkst(String value);

	/**
	 * Returns the value of the '<em><b>By Set Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>By Set Pos</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>By Set Pos</em>' attribute.
	 * @see #setBySetPos(String)
	 * @see jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage#getSrcSwitchedTime_BySetPos()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getBySetPos();

	/**
	 * Sets the value of the '{@link jointPackage_CPL2SPL.SrcSwitchedTime#getBySetPos <em>By Set Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>By Set Pos</em>' attribute.
	 * @see #getBySetPos()
	 * @generated
	 */
	void setBySetPos(String value);

} // SrcSwitchedTime
