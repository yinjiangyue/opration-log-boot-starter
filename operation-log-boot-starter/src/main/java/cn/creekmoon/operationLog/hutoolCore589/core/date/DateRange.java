package cn.creekmoon.operationLog.hutoolCore589.core.date;

import cn.hutool.core.date.DateField;
import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.lang.Range;

import java.util.Date;

/**
 * 日期范围
 *
 * @author looly
 * @since 4.1.0
 */
public class DateRange extends Range<cn.hutool.core.date.DateTime> {
    private static final long serialVersionUID = 1L;

    /**
     * 构造，包含开始和结束日期时间
     *
     * @param start 起始日期时间（包括）
     * @param end   结束日期时间（包括）
     * @param unit  步进单位
     */
    public DateRange(Date start, Date end, cn.hutool.core.date.DateField unit) {
        this(start, end, unit, 1);
    }

    /**
     * 构造，包含开始和结束日期时间
     *
     * @param start 起始日期时间（包括）
     * @param end   结束日期时间（包括）
     * @param unit  步进单位
     * @param step  步进数
     */
    public DateRange(Date start, Date end, cn.hutool.core.date.DateField unit, int step) {
        this(start, end, unit, step, true, true);
    }

    /**
     * 构造
     *
     * @param start          起始日期时间
     * @param end            结束日期时间
     * @param unit           步进单位
     * @param step           步进数
     * @param isIncludeStart 是否包含开始的时间
     * @param isIncludeEnd   是否包含结束的时间
     */
    public DateRange(Date start, Date end, DateField unit, int step, boolean isIncludeStart, boolean isIncludeEnd) {
        super(cn.hutool.core.date.DateUtil.date(start), cn.hutool.core.date.DateUtil.date(end), (current, end1, index) -> {
            final DateTime dt = DateUtil.date(start).offsetNew(unit, (index + 1) * step);
            if (dt.isAfter(end1)) {
                return null;
            }
            return dt;
        }, isIncludeStart, isIncludeEnd);
    }

}
