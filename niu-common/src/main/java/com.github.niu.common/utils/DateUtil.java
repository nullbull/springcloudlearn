package com.github.niu.common.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @date 2017/11/6
 */
public class DateUtil {

	private static Logger logger = LoggerFactory.getLogger(DateUtil.class);

	public static final String DEFAULT_DATE_PATTERN = "yyyy-MM-dd";
	public static final String DEFAULT_TIME_PATTERN = "HH:mm:ss";
	public static final String DEFAULT_DATETIME_PATTERN = "yyyy-MM-dd HH:mm:ss";
	public static final String DATE_PATTERN_YYYYMMDD = "yyyyMMdd";
	public static final String DEFAULT_TIME_YMDHMS = "yyyyMMddHHmmss";

	private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat(DEFAULT_DATE_PATTERN);
	private static final SimpleDateFormat TIME_FORMAT = new SimpleDateFormat(DEFAULT_TIME_PATTERN);
	private static final SimpleDateFormat DATETIME_FORMAT = new SimpleDateFormat(DEFAULT_DATETIME_PATTERN);
	private static final SimpleDateFormat DEFAULT_TIME_YMDHMS_FORMAT = new SimpleDateFormat(DEFAULT_TIME_YMDHMS);

	private DateUtil() {
	}

	/**
	 * 获取第二天的0:00:00
	 * @param date Date 日期
	 * @return Date 结果日期
	 */
	public static Date getNextDayZero(Date date) {
		Date res = null;
		if (date != null) {
			Calendar c = Calendar.getInstance();
			c.setTime(date);
			c.add(Calendar.DATE, 1);// 加一天
			c.set(Calendar.HOUR_OF_DAY, 0);
			c.set(Calendar.MINUTE, 0);
			c.set(Calendar.SECOND, 0);
			c.set(Calendar.MILLISECOND, 0);
			res = c.getTime();
		}
		return res;
	}

	/**
	 * 获取后天的0:00:00
	 * @param date Date 日期
	 * @return Date 结果日期
	 */
	public static Date getNextNextDayZero(Date date) {
		Date res = null;
		if (date != null) {
			Calendar c = Calendar.getInstance();
			c.setTime(date);
			c.add(Calendar.DATE, 2);// 加一天
			c.set(Calendar.HOUR_OF_DAY, 0);
			c.set(Calendar.MINUTE, 0);
			c.set(Calendar.SECOND, 0);
			c.set(Calendar.MILLISECOND, 0);
			res = c.getTime();
		}
		return res;
	}

	/**
	 * 当前时间，格式 yyyy-MM-dd HH:mm:ss
	 * @return 当前时间的标准形式字符串
	 */
	public static String now() {
		return formatDateTime(new Date());
	}

	/**
	 * 当前日期，格式 yyyy-MM-dd
	 * @return 当前日期的标准形式字符串
	 */
	public static String today() {
		return formatDate(new Date());
	}

	/**
	 * 根据特定格式格式化日期
	 * @param date 被格式化的日期
	 * @param pattern 格式
	 * @return 格式化后的字符串
	 */
	public static String format(Date date, String pattern) {
		return new SimpleDateFormat(pattern).format(date);
	}

	/**
	 * 格式 yyyy-MM-dd
	 * @param date 被格式化的日期
	 * @return 格式化后的日期
	 */
	public static String formatDate(Date date) {
		return DATE_FORMAT.format(date);
	}

	/**
	 * 格式HH:mm:ss
	 * @param date 被格式化的日期
	 * @return 格式化后的日期
	 */
	public static String formatTime(Date date) {
		return TIME_FORMAT.format(date);
	}

	/**
	 * 格式 yyyy-MM-dd HH:mm:ss
	 * @param date 被格式化的日期
	 * @return 格式化后的日期
	 */
	public static String formatDateTime(Date date) {
		return DATETIME_FORMAT.format(date);
	}

	/**
	 * 格式 yyyyMMddHHmmss
	 * @param date 被格式化的日期
	 * @return 格式化后的日期
	 */
	public static String formatDateTimeToYmdhms(Date date) {
		return DEFAULT_TIME_YMDHMS_FORMAT.format(date);
	}

	/**
	 * 将特定格式的日期转换为Date对象
	 * @param dateString 特定格式的日期
	 * @param format 格式，例如yyyy-MM-dd
	 * @return 日期对象
	 */
	public static Date parse(String dateString, String format) {
		try {
			return (new SimpleDateFormat(format)).parse(dateString);
		} catch (ParseException e) {
			logger.error("Parse " + dateString + " with format " + format + " error!", e);
		}
		return null;
	}

	/**
	 * 格式yyyy-MM-dd HH:mm:ss
	 * @param dateString 标准形式的时间字符串
	 * @return 日期对象
	 */
	public static Date parseDateTime(String dateString) {
		try {
			return DATETIME_FORMAT.parse(dateString);
		} catch (ParseException e) {
			logger.error("Parse " + dateString + " with format " + DEFAULT_DATETIME_PATTERN + " error!", e);
		}
		return null;
	}

	/**
	 * 格式yyyy-MM-dd
	 * @param dateString 标准形式的日期字符串
	 * @return 日期对象
	 */
	public static Date parseDate(String dateString) {
		try {
			return DATE_FORMAT.parse(dateString);
		} catch (ParseException e) {
			logger.error("Parse " + dateString + " with format " + DEFAULT_DATE_PATTERN + " error!", e);
		}
		return null;
	}

	/**
	 * 格式HH:mm:ss
	 * @param timeString 标准形式的日期字符串
	 * @return 日期对象
	 */
	public static Date parseTime(String timeString) {
		try {
			return TIME_FORMAT.parse(timeString);
		} catch (ParseException e) {
			logger.error("Parse " + timeString + " with format " + DEFAULT_TIME_PATTERN + " error!", e);
		}
		return null;
	}

	/**
	 * 格式：<br>
	 * 1、yyyy-MM-dd HH:mm:ss<br>
	 * 2、yyyy-MM-dd<br>
	 * 3、HH:mm:ss>
	 * @param dateStr 日期字符串
	 * @return 日期
	 */
	public static Date parse(String dateStr) {
		int length = dateStr.length();
		try {
			if (length == DEFAULT_DATETIME_PATTERN.length()) {
				return parseDateTime(dateStr);
			} else if (length == DEFAULT_DATE_PATTERN.length()) {
				return parseDate(dateStr);
			} else if (length == DEFAULT_TIME_PATTERN.length()) {
				return parseTime(dateStr);
			}
		} catch (Exception e) {
			logger.error("Parse " + dateStr + " with format normal error!", e);
		}
		return null;
	}

	/**
	 * 获取指定日期偏移指定时间后的时间
	 * @param date 基准日期
	 * @param calendarField 偏移的粒度大小（小时、天、月等）使用Calendar中的常数
	 * @param offsite 偏移量，正数为向后偏移，负数为向前偏移
	 * @return 偏移后的日期
	 */
	public static Date offsiteDate(Date date, int calendarField, int offsite) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(calendarField, offsite);
		return cal.getTime();
	}

	/**
	 * 昨天
	 * @return 昨天
	 */
	public static Date yesterday() {
		return offsiteDate(new Date(), Calendar.DAY_OF_YEAR, -1);
	}

	/**
	 * 上周
	 * @return 上周
	 */
	public static Date lastWeek() {
		return offsiteDate(new Date(), Calendar.WEEK_OF_YEAR, -1);
	}

	/**
	 * 上个月
	 * @return 上个月
	 */
	public static Date lastMouth() {
		return offsiteDate(new Date(), Calendar.MONTH, -1);
	}

	/**
	 * 获取指定日期多少天之前的日期
	 * @param date
	 * @param someDays
	 * @param pattern
	 * @return
	 */
	public static String getSomeDaysAgo(Date date, int someDays, String pattern) {
		Date someDate = offsiteDate(date, Calendar.DAY_OF_YEAR, someDays);
		return format(someDate, pattern);
	}

	/**
	 * 获取指定年的最大周数
	 */
	public static int getMaxWeekNumOfYear(int year) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, Calendar.DECEMBER, 31, 23, 59, 59);
		return calendar.getWeeksInWeekYear();
	}

	/**
	 * 获取指定日期所在周
	 * @param date return 格式：YYYYWW
	 */
	public static String getWeekOfYear(Date date) {
		String currWeek = "";

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int year = calendar.get(Calendar.YEAR);
		int weekYear = calendar.getWeekYear();
		if (year < weekYear) { // 跨年了
			int maxWeekNumOfYear = getMaxWeekNumOfYear(year);
			int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK) - 1;
			if (dayOfWeek == 0) { // 按中国人习惯，星期天应该归属到本周最后一天（美国人一周的第一天是星期天）
				dayOfWeek = 7;
			}
			if (dayOfWeek == 7) { // 如果是星期天，则归属到上一周
				currWeek = year + "" + maxWeekNumOfYear;
			} else {
				currWeek = weekYear + "01";
			}

		} else { // 未跨年
			int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
			int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK) - 1;
			if (dayOfWeek == 0) { // 按中国人习惯，星期天应该归属到本周最后一天（美国人一周的第一天是星期天）
				dayOfWeek = 7;
			}
			if (dayOfWeek == 7) { // 如果是星期天，则归属到上一周
				weekOfYear = weekOfYear - 1;
			}
			if (weekOfYear < 10) { // 补位
				currWeek = String.valueOf(year) + "0" + String.valueOf(weekOfYear);
			} else {
				currWeek = String.valueOf(year) + String.valueOf(weekOfYear);
			}
		}

		return currWeek;
	}

	/**
	 * 获取指定日期所在月份
	 * @param date return 格式：YYYYMM
	 */
	public static String getMonthOfYear(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1; // 老外月份是0~11月
		if (month < 10) { // 补位
			return year + "0" + String.valueOf(month);
		} else {
			return year + String.valueOf(month);
		}
	}

	/**
	 * 获取指定日期所在季度
	 * @param date return 格式：YYYYJ
	 */
	public static String getQuarterOfYear(Date date) {
		String quarter = "";

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1; // 老外月份是0~11月
		if (month >= 1 && month <= 3) {
			quarter = "1";
		} else if (month >= 4 && month <= 6) {
			quarter = "2";
		} else if (month >= 7 && month <= 9) {
			quarter = "3";
		} else if (month >= 10 && month <= 12) {
			quarter = "4";
		}

		return year + quarter;
	}

	/**
	 * 获取指定日期所在周度的第一天的日期
	 * @param date
	 * @param datePattern return 格式：YYYY-MM-DD
	 */
	public static String getBeginDateOfWeek(Date date, String datePattern) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK) - 1;
		if (dayOfWeek == 0) { // 按中国人习惯，星期天应该归属到本周最后一天（美国人一周的第一天是星期天）
			calendar.add(Calendar.DATE, -7); // 将周日归属到上一周
		}
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		return format(calendar.getTime(), datePattern);
	}

	/**
	 * 获取指定日期所在周最后一天的日期
	 * @param date
	 * @param datePattern return 格式：YYYY-MM-DD
	 */
	public static String getEndDateOfWeek(Date date, String datePattern) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK) - 1;
		if (dayOfWeek != 0) { // 按中国人习惯，星期天应该归属到本周最后一天（美国人一周的第一天是星期天）
			calendar.add(Calendar.DATE, 7); // 按中国人习惯，一周最后一天是周日
		}
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
		return format(calendar.getTime(), datePattern);
	}

	/**
	 * 获取指定日期所在月度的第一天的日期
	 * @param date
	 * @param datePattern return 格式：YYYY-MM-DD
	 */
	public static String getBeginDateOfMonth(Date date, String datePattern) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, 0);
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		return format(calendar.getTime(), datePattern);
	}

	/**
	 * 获取指定日期所在月度最后一天的日期
	 * @param date
	 * @param datePattern return 格式：YYYY-MM-DD
	 */
	public static String getEndDateOfMonth(Date date, String datePattern) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, 1);
		calendar.set(Calendar.DAY_OF_MONTH, 0);
		return format(calendar.getTime(), datePattern);
	}

	/**
	 * 获取指定日期所在季度的第一天的日期
	 * @param date return 格式：YYYY-MM-DD
	 */
	public static String getBeginDateOfQuarter(Date date) {
		String beginDate = "";

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1; // 老外月份是0~11月
		if (month >= 1 && month <= 3) {
			beginDate = "01-01";
		} else if (month >= 4 && month <= 6) {
			beginDate = "04-01";
		} else if (month >= 7 && month <= 9) {
			beginDate = "07-01";
		} else if (month >= 10 && month <= 12) {
			beginDate = "10-01";
		}

		return year + "-" + beginDate;
	}

	/**
	 * 获取指定日期所在季度最后一天的日期
	 * @param date return 格式：YYYY-MM-DD
	 */
	public static String getEndDateOfQuarter(Date date) {
		String endDate = "";

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1; // 老外月份是0~11月
		if (month >= 1 && month <= 3) {
			endDate = "03-31";
		} else if (month >= 4 && month <= 6) {
			endDate = "06-30";
		} else if (month >= 7 && month <= 9) {
			endDate = "09-30";
		} else if (month >= 10 && month <= 12) {
			endDate = "12-31";
		}

		return year + "-" + endDate;
	}

	/**
	 * 获取当前周第一天到第七天的日期列表
	 * @param datePattern return
	 */
	public static List<String> getDateListOfCurrWeek(String datePattern) {
		List<String> weekDateList = new ArrayList<>();

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK) - 1;
		if (dayOfWeek == 0) { // 按中国人习惯，星期天应该归属到本周最后一天（美国人一周的第一天是星期天）
			calendar.add(Calendar.DATE, -7); // 将周日归属到上一周
		}

		calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		weekDateList.add(format(calendar.getTime(), datePattern));
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.TUESDAY);
		weekDateList.add(format(calendar.getTime(), datePattern));
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
		weekDateList.add(format(calendar.getTime(), datePattern));
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY);
		weekDateList.add(format(calendar.getTime(), datePattern));
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.FRIDAY);
		weekDateList.add(format(calendar.getTime(), datePattern));
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
		weekDateList.add(format(calendar.getTime(), datePattern));
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
		calendar.add(Calendar.DATE, 7); // 按中国人习惯，一周最后一天是周日
		weekDateList.add(format(calendar.getTime(), datePattern));

		return weekDateList;
	}

	/**
	 * 获取指定日期所在周第一天到第七天的日期列表
	 * @param date
	 * @param datePattern return
	 */
	public static List<String> getDateListOfWeek(Date date, String datePattern) {
		List<String> weekDateList = new ArrayList<>();

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK) - 1;
		if (dayOfWeek == 0) { // 按中国人习惯，星期天应该归属到本周最后一天（美国人一周的第一天是星期天）
			calendar.add(Calendar.DATE, -7); // 将周日归属到上一周
		}

		calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		weekDateList.add(format(calendar.getTime(), datePattern));
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.TUESDAY);
		weekDateList.add(format(calendar.getTime(), datePattern));
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
		weekDateList.add(format(calendar.getTime(), datePattern));
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY);
		weekDateList.add(format(calendar.getTime(), datePattern));
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.FRIDAY);
		weekDateList.add(format(calendar.getTime(), datePattern));
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
		weekDateList.add(format(calendar.getTime(), datePattern));
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
		calendar.add(Calendar.DATE, 7); // 按中国人习惯，一周最后一天是周日
		weekDateList.add(format(calendar.getTime(), datePattern));

		return weekDateList;
	}

	/**
	 * 获取当日剩余秒数
	 * @return
	 */
	public static int getRemaindSecondsToTodayEnd() {
		Calendar current = Calendar.getInstance();
		current.set(Calendar.MILLISECOND, 0);
		long currentTimes = current.getTimeInMillis();
		current.set(Calendar.HOUR_OF_DAY, 23);
		current.set(Calendar.MINUTE, 59);
		current.set(Calendar.SECOND, 59);
		long endTimes = current.getTimeInMillis();
		return (int) ((endTimes - currentTimes) / 1000);
	}

	/**
	 * 获取截止到本周末24点剩余秒数
	 **/
	public static int getRemaindSecondsToWeekEnd() {
		Date now = new Date();
		String weekEnd = getEndDateOfWeek(now, DateUtil.DEFAULT_DATE_PATTERN);
		Date endDate = parse(weekEnd + " 23:59:59", DateUtil.DEFAULT_DATETIME_PATTERN);
		int daysDiff = getDaysDiff(now, endDate);
		// 二者相差的天数*24*3600 + 今天剩余的秒数
		return daysDiff * 24 * 3600 + getRemaindSecondsToTodayEnd();
	}

	/**
	 * 获取截止到本季度末24点剩余天数
	 **/
	public static int getRemaindSecondsToQuarterEnd() {
		Date beginDate = new Date();
		String quarterEnd = getEndDateOfQuarter(new Date());
		Date endDate = DateUtil.parse(quarterEnd + " 23:59:59", DateUtil.DEFAULT_DATETIME_PATTERN);
		int daysDiff = getDaysDiff(beginDate, endDate);
		// 二者相差的天数*24*3600 +今天剩余的秒数
		return daysDiff * 24 * 3600 + getRemaindSecondsToTodayEnd();
	}

	/**
	 * 获取今天是星期几
	 * @return
	 */
	public static int dayOfWeek() {
		Date today = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(today);
		if (c.get(Calendar.DAY_OF_WEEK) == 1) {
			return 7;
		} else {
			return c.get(Calendar.DAY_OF_WEEK) - 1;
		}
	}

	/**
	 * 获取两个日期相差的天数
	 */
	public static int getDaysDiff(Date beginDate, Date endDate) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(beginDate);
		int beginDay = calendar.get(Calendar.DAY_OF_YEAR);
		calendar.setTime(endDate);
		int endDay = calendar.get(Calendar.DAY_OF_YEAR);
		return endDay - beginDay;
	}

	/**
	 * 获取指定时间相对现在时刻的时间描述
	 * @param strDateTime
	 * @return
	 */
	public static String getDateTimeDesc(String strDateTime) {
		String returnStr = "";
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat(DEFAULT_DATETIME_PATTERN);
		try {
			long interval = date.getTime() - format.parse(strDateTime).getTime();
			long val = (interval) / (60 * 1000);
			// 1小时以内：X分钟
			if (val < 60L) {
				if (val < 1) {
					returnStr = "1分钟前";
				} else {
					returnStr = val + "分钟前";
				}
			} else if (val < 24 * 60L) {
				// 24小时以内：X小时
				returnStr = val / 60L + "小时前";
			} else if (val <= 48 * 60L) {
				// 24-48小时：昨天
				returnStr = "昨天";
			} else if (val > 48 * 60L) {
				// 48小时以上：则显示具体日期（xx年xx月xx日）
				SimpleDateFormat formatDay = new SimpleDateFormat("yyyy-MM-dd");
				returnStr = formatDay.format(format.parse(strDateTime));
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return returnStr;
	}

	/**
	 * 获取系统启动时间戳，作为静态资源版本号，格式：yyyyMMddHHmm
	 */
	public static String getBuildNo() {
		return DateUtil.format(new Date(), "yyyyMMddHHmm");
	}

	/**
	 * main测试
	 * @param args
	 */
	public static void main(String[] args) {
		// Date date = new Date();
		// date = parse("2018-05-14 12:00:01", DateUtil.DEFAULT_DATETIME_PATTERN);
		// System.out.println(getBeginDateOfWeek(date, DateUtil.DEFAULT_DATE_PATTERN));
		// System.out.println(getEndDateOfWeek(date, DateUtil.DEFAULT_DATE_PATTERN));
		// System.out.println(getBeginDateOfMonth(date, DateUtil.DEFAULT_DATE_PATTERN));
		// System.out.println(getEndDateOfMonth(date, DateUtil.DEFAULT_DATE_PATTERN));
		// System.out.println(getBeginDateOfQuarter(date));
		// System.out.println(getEndDateOfQuarter(date));
		// System.out.println(getDateListOfCurrWeek(DateUtil.DEFAULT_DATE_PATTERN));
		// System.out.println(getDateListOfWeek(date, DateUtil.DEFAULT_DATE_PATTERN));
		// System.out.println(getDateTimeDesc("2018-07-16 12:00:01"));
	}
}
