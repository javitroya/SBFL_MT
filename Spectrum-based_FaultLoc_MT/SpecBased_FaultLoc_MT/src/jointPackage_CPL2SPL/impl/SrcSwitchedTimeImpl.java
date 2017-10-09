/**
 */
package jointPackage_CPL2SPL.impl;

import jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage;
import jointPackage_CPL2SPL.SrcSwitchedTime;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Src Switched Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_CPL2SPL.impl.SrcSwitchedTimeImpl#getDtstart <em>Dtstart</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.impl.SrcSwitchedTimeImpl#getDtend <em>Dtend</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.impl.SrcSwitchedTimeImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.impl.SrcSwitchedTimeImpl#getFreq <em>Freq</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.impl.SrcSwitchedTimeImpl#getUntil <em>Until</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.impl.SrcSwitchedTimeImpl#getCount <em>Count</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.impl.SrcSwitchedTimeImpl#getInterval <em>Interval</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.impl.SrcSwitchedTimeImpl#getBySecond <em>By Second</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.impl.SrcSwitchedTimeImpl#getByMinute <em>By Minute</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.impl.SrcSwitchedTimeImpl#getByHour <em>By Hour</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.impl.SrcSwitchedTimeImpl#getByDay <em>By Day</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.impl.SrcSwitchedTimeImpl#getByMonthDay <em>By Month Day</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.impl.SrcSwitchedTimeImpl#getByYearDay <em>By Year Day</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.impl.SrcSwitchedTimeImpl#getByWeekNo <em>By Week No</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.impl.SrcSwitchedTimeImpl#getByMonth <em>By Month</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.impl.SrcSwitchedTimeImpl#getWkst <em>Wkst</em>}</li>
 *   <li>{@link jointPackage_CPL2SPL.impl.SrcSwitchedTimeImpl#getBySetPos <em>By Set Pos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SrcSwitchedTimeImpl extends SrcNodeContainerImpl implements SrcSwitchedTime {
	/**
	 * The default value of the '{@link #getDtstart() <em>Dtstart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDtstart()
	 * @generated
	 * @ordered
	 */
	protected static final String DTSTART_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDtstart() <em>Dtstart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDtstart()
	 * @generated
	 * @ordered
	 */
	protected String dtstart = DTSTART_EDEFAULT;

	/**
	 * The default value of the '{@link #getDtend() <em>Dtend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDtend()
	 * @generated
	 * @ordered
	 */
	protected static final String DTEND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDtend() <em>Dtend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDtend()
	 * @generated
	 * @ordered
	 */
	protected String dtend = DTEND_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final String DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected String duration = DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFreq() <em>Freq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreq()
	 * @generated
	 * @ordered
	 */
	protected static final String FREQ_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFreq() <em>Freq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreq()
	 * @generated
	 * @ordered
	 */
	protected String freq = FREQ_EDEFAULT;

	/**
	 * The default value of the '{@link #getUntil() <em>Until</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUntil()
	 * @generated
	 * @ordered
	 */
	protected static final String UNTIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUntil() <em>Until</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUntil()
	 * @generated
	 * @ordered
	 */
	protected String until = UNTIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected String count = COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterval() <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterval()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERVAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInterval() <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterval()
	 * @generated
	 * @ordered
	 */
	protected String interval = INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getBySecond() <em>By Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBySecond()
	 * @generated
	 * @ordered
	 */
	protected static final String BY_SECOND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBySecond() <em>By Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBySecond()
	 * @generated
	 * @ordered
	 */
	protected String bySecond = BY_SECOND_EDEFAULT;

	/**
	 * The default value of the '{@link #getByMinute() <em>By Minute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByMinute()
	 * @generated
	 * @ordered
	 */
	protected static final String BY_MINUTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getByMinute() <em>By Minute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByMinute()
	 * @generated
	 * @ordered
	 */
	protected String byMinute = BY_MINUTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getByHour() <em>By Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByHour()
	 * @generated
	 * @ordered
	 */
	protected static final String BY_HOUR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getByHour() <em>By Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByHour()
	 * @generated
	 * @ordered
	 */
	protected String byHour = BY_HOUR_EDEFAULT;

	/**
	 * The default value of the '{@link #getByDay() <em>By Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByDay()
	 * @generated
	 * @ordered
	 */
	protected static final String BY_DAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getByDay() <em>By Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByDay()
	 * @generated
	 * @ordered
	 */
	protected String byDay = BY_DAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getByMonthDay() <em>By Month Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByMonthDay()
	 * @generated
	 * @ordered
	 */
	protected static final String BY_MONTH_DAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getByMonthDay() <em>By Month Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByMonthDay()
	 * @generated
	 * @ordered
	 */
	protected String byMonthDay = BY_MONTH_DAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getByYearDay() <em>By Year Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByYearDay()
	 * @generated
	 * @ordered
	 */
	protected static final String BY_YEAR_DAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getByYearDay() <em>By Year Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByYearDay()
	 * @generated
	 * @ordered
	 */
	protected String byYearDay = BY_YEAR_DAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getByWeekNo() <em>By Week No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByWeekNo()
	 * @generated
	 * @ordered
	 */
	protected static final String BY_WEEK_NO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getByWeekNo() <em>By Week No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByWeekNo()
	 * @generated
	 * @ordered
	 */
	protected String byWeekNo = BY_WEEK_NO_EDEFAULT;

	/**
	 * The default value of the '{@link #getByMonth() <em>By Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByMonth()
	 * @generated
	 * @ordered
	 */
	protected static final String BY_MONTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getByMonth() <em>By Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByMonth()
	 * @generated
	 * @ordered
	 */
	protected String byMonth = BY_MONTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getWkst() <em>Wkst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWkst()
	 * @generated
	 * @ordered
	 */
	protected static final String WKST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWkst() <em>Wkst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWkst()
	 * @generated
	 * @ordered
	 */
	protected String wkst = WKST_EDEFAULT;

	/**
	 * The default value of the '{@link #getBySetPos() <em>By Set Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBySetPos()
	 * @generated
	 * @ordered
	 */
	protected static final String BY_SET_POS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBySetPos() <em>By Set Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBySetPos()
	 * @generated
	 * @ordered
	 */
	protected String bySetPos = BY_SET_POS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SrcSwitchedTimeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JointPackage_CPL2SPLPackage.Literals.SRC_SWITCHED_TIME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDtstart() {
		return dtstart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDtstart(String newDtstart) {
		String oldDtstart = dtstart;
		dtstart = newDtstart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__DTSTART, oldDtstart, dtstart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDtend() {
		return dtend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDtend(String newDtend) {
		String oldDtend = dtend;
		dtend = newDtend;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__DTEND, oldDtend, dtend));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(String newDuration) {
		String oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFreq() {
		return freq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFreq(String newFreq) {
		String oldFreq = freq;
		freq = newFreq;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__FREQ, oldFreq, freq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUntil() {
		return until;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUntil(String newUntil) {
		String oldUntil = until;
		until = newUntil;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__UNTIL, oldUntil, until));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCount() {
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCount(String newCount) {
		String oldCount = count;
		count = newCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__COUNT, oldCount, count));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInterval() {
		return interval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterval(String newInterval) {
		String oldInterval = interval;
		interval = newInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__INTERVAL, oldInterval, interval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBySecond() {
		return bySecond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBySecond(String newBySecond) {
		String oldBySecond = bySecond;
		bySecond = newBySecond;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__BY_SECOND, oldBySecond, bySecond));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getByMinute() {
		return byMinute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setByMinute(String newByMinute) {
		String oldByMinute = byMinute;
		byMinute = newByMinute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__BY_MINUTE, oldByMinute, byMinute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getByHour() {
		return byHour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setByHour(String newByHour) {
		String oldByHour = byHour;
		byHour = newByHour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__BY_HOUR, oldByHour, byHour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getByDay() {
		return byDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setByDay(String newByDay) {
		String oldByDay = byDay;
		byDay = newByDay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__BY_DAY, oldByDay, byDay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getByMonthDay() {
		return byMonthDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setByMonthDay(String newByMonthDay) {
		String oldByMonthDay = byMonthDay;
		byMonthDay = newByMonthDay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__BY_MONTH_DAY, oldByMonthDay, byMonthDay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getByYearDay() {
		return byYearDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setByYearDay(String newByYearDay) {
		String oldByYearDay = byYearDay;
		byYearDay = newByYearDay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__BY_YEAR_DAY, oldByYearDay, byYearDay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getByWeekNo() {
		return byWeekNo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setByWeekNo(String newByWeekNo) {
		String oldByWeekNo = byWeekNo;
		byWeekNo = newByWeekNo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__BY_WEEK_NO, oldByWeekNo, byWeekNo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getByMonth() {
		return byMonth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setByMonth(String newByMonth) {
		String oldByMonth = byMonth;
		byMonth = newByMonth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__BY_MONTH, oldByMonth, byMonth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWkst() {
		return wkst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWkst(String newWkst) {
		String oldWkst = wkst;
		wkst = newWkst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__WKST, oldWkst, wkst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBySetPos() {
		return bySetPos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBySetPos(String newBySetPos) {
		String oldBySetPos = bySetPos;
		bySetPos = newBySetPos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__BY_SET_POS, oldBySetPos, bySetPos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__DTSTART:
				return getDtstart();
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__DTEND:
				return getDtend();
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__DURATION:
				return getDuration();
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__FREQ:
				return getFreq();
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__UNTIL:
				return getUntil();
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__COUNT:
				return getCount();
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__INTERVAL:
				return getInterval();
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__BY_SECOND:
				return getBySecond();
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__BY_MINUTE:
				return getByMinute();
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__BY_HOUR:
				return getByHour();
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__BY_DAY:
				return getByDay();
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__BY_MONTH_DAY:
				return getByMonthDay();
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__BY_YEAR_DAY:
				return getByYearDay();
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__BY_WEEK_NO:
				return getByWeekNo();
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__BY_MONTH:
				return getByMonth();
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__WKST:
				return getWkst();
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__BY_SET_POS:
				return getBySetPos();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__DTSTART:
				setDtstart((String)newValue);
				return;
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__DTEND:
				setDtend((String)newValue);
				return;
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__DURATION:
				setDuration((String)newValue);
				return;
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__FREQ:
				setFreq((String)newValue);
				return;
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__UNTIL:
				setUntil((String)newValue);
				return;
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__COUNT:
				setCount((String)newValue);
				return;
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__INTERVAL:
				setInterval((String)newValue);
				return;
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__BY_SECOND:
				setBySecond((String)newValue);
				return;
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__BY_MINUTE:
				setByMinute((String)newValue);
				return;
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__BY_HOUR:
				setByHour((String)newValue);
				return;
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__BY_DAY:
				setByDay((String)newValue);
				return;
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__BY_MONTH_DAY:
				setByMonthDay((String)newValue);
				return;
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__BY_YEAR_DAY:
				setByYearDay((String)newValue);
				return;
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__BY_WEEK_NO:
				setByWeekNo((String)newValue);
				return;
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__BY_MONTH:
				setByMonth((String)newValue);
				return;
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__WKST:
				setWkst((String)newValue);
				return;
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__BY_SET_POS:
				setBySetPos((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__DTSTART:
				setDtstart(DTSTART_EDEFAULT);
				return;
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__DTEND:
				setDtend(DTEND_EDEFAULT);
				return;
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__FREQ:
				setFreq(FREQ_EDEFAULT);
				return;
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__UNTIL:
				setUntil(UNTIL_EDEFAULT);
				return;
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__COUNT:
				setCount(COUNT_EDEFAULT);
				return;
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__INTERVAL:
				setInterval(INTERVAL_EDEFAULT);
				return;
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__BY_SECOND:
				setBySecond(BY_SECOND_EDEFAULT);
				return;
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__BY_MINUTE:
				setByMinute(BY_MINUTE_EDEFAULT);
				return;
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__BY_HOUR:
				setByHour(BY_HOUR_EDEFAULT);
				return;
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__BY_DAY:
				setByDay(BY_DAY_EDEFAULT);
				return;
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__BY_MONTH_DAY:
				setByMonthDay(BY_MONTH_DAY_EDEFAULT);
				return;
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__BY_YEAR_DAY:
				setByYearDay(BY_YEAR_DAY_EDEFAULT);
				return;
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__BY_WEEK_NO:
				setByWeekNo(BY_WEEK_NO_EDEFAULT);
				return;
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__BY_MONTH:
				setByMonth(BY_MONTH_EDEFAULT);
				return;
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__WKST:
				setWkst(WKST_EDEFAULT);
				return;
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__BY_SET_POS:
				setBySetPos(BY_SET_POS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__DTSTART:
				return DTSTART_EDEFAULT == null ? dtstart != null : !DTSTART_EDEFAULT.equals(dtstart);
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__DTEND:
				return DTEND_EDEFAULT == null ? dtend != null : !DTEND_EDEFAULT.equals(dtend);
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__DURATION:
				return DURATION_EDEFAULT == null ? duration != null : !DURATION_EDEFAULT.equals(duration);
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__FREQ:
				return FREQ_EDEFAULT == null ? freq != null : !FREQ_EDEFAULT.equals(freq);
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__UNTIL:
				return UNTIL_EDEFAULT == null ? until != null : !UNTIL_EDEFAULT.equals(until);
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__COUNT:
				return COUNT_EDEFAULT == null ? count != null : !COUNT_EDEFAULT.equals(count);
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__INTERVAL:
				return INTERVAL_EDEFAULT == null ? interval != null : !INTERVAL_EDEFAULT.equals(interval);
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__BY_SECOND:
				return BY_SECOND_EDEFAULT == null ? bySecond != null : !BY_SECOND_EDEFAULT.equals(bySecond);
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__BY_MINUTE:
				return BY_MINUTE_EDEFAULT == null ? byMinute != null : !BY_MINUTE_EDEFAULT.equals(byMinute);
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__BY_HOUR:
				return BY_HOUR_EDEFAULT == null ? byHour != null : !BY_HOUR_EDEFAULT.equals(byHour);
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__BY_DAY:
				return BY_DAY_EDEFAULT == null ? byDay != null : !BY_DAY_EDEFAULT.equals(byDay);
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__BY_MONTH_DAY:
				return BY_MONTH_DAY_EDEFAULT == null ? byMonthDay != null : !BY_MONTH_DAY_EDEFAULT.equals(byMonthDay);
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__BY_YEAR_DAY:
				return BY_YEAR_DAY_EDEFAULT == null ? byYearDay != null : !BY_YEAR_DAY_EDEFAULT.equals(byYearDay);
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__BY_WEEK_NO:
				return BY_WEEK_NO_EDEFAULT == null ? byWeekNo != null : !BY_WEEK_NO_EDEFAULT.equals(byWeekNo);
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__BY_MONTH:
				return BY_MONTH_EDEFAULT == null ? byMonth != null : !BY_MONTH_EDEFAULT.equals(byMonth);
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__WKST:
				return WKST_EDEFAULT == null ? wkst != null : !WKST_EDEFAULT.equals(wkst);
			case JointPackage_CPL2SPLPackage.SRC_SWITCHED_TIME__BY_SET_POS:
				return BY_SET_POS_EDEFAULT == null ? bySetPos != null : !BY_SET_POS_EDEFAULT.equals(bySetPos);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (dtstart: ");
		result.append(dtstart);
		result.append(", dtend: ");
		result.append(dtend);
		result.append(", duration: ");
		result.append(duration);
		result.append(", freq: ");
		result.append(freq);
		result.append(", until: ");
		result.append(until);
		result.append(", count: ");
		result.append(count);
		result.append(", interval: ");
		result.append(interval);
		result.append(", bySecond: ");
		result.append(bySecond);
		result.append(", byMinute: ");
		result.append(byMinute);
		result.append(", byHour: ");
		result.append(byHour);
		result.append(", byDay: ");
		result.append(byDay);
		result.append(", byMonthDay: ");
		result.append(byMonthDay);
		result.append(", byYearDay: ");
		result.append(byYearDay);
		result.append(", byWeekNo: ");
		result.append(byWeekNo);
		result.append(", byMonth: ");
		result.append(byMonth);
		result.append(", wkst: ");
		result.append(wkst);
		result.append(", bySetPos: ");
		result.append(bySetPos);
		result.append(')');
		return result.toString();
	}

} //SrcSwitchedTimeImpl
