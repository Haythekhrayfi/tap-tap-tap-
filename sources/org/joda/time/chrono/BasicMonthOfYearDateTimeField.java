package org.joda.time.chrono;

import androidx.viewpager2.adapter.a;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DurationField;
import org.joda.time.ReadablePartial;
import org.joda.time.field.FieldUtils;
import org.joda.time.field.ImpreciseDateTimeField;

/* JADX INFO: loaded from: classes3.dex */
class BasicMonthOfYearDateTimeField extends ImpreciseDateTimeField {
    private static final int MIN = 1;
    private static final long serialVersionUID = -8258715387168736L;
    private final BasicChronology iChronology;
    private final int iLeapMonth;
    private final int iMax;

    public BasicMonthOfYearDateTimeField(BasicChronology basicChronology, int i10) {
        super(DateTimeFieldType.monthOfYear(), basicChronology.getAverageMillisPerMonth());
        this.iChronology = basicChronology;
        this.iMax = basicChronology.getMaxMonth();
        this.iLeapMonth = i10;
    }

    private Object readResolve() {
        return this.iChronology.monthOfYear();
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long add(long j10, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        if (i10 == 0) {
            return j10;
        }
        long millisOfDay = this.iChronology.getMillisOfDay(j10);
        int year = this.iChronology.getYear(j10);
        int monthOfYear = this.iChronology.getMonthOfYear(j10, year);
        int i16 = monthOfYear - 1;
        int i17 = i16 + i10;
        if (monthOfYear <= 0 || i17 >= 0) {
            i11 = year;
        } else {
            if (Math.signum(this.iMax + i10) == Math.signum(i10)) {
                i14 = year - 1;
                i15 = i10 + this.iMax;
            } else {
                i14 = year + 1;
                i15 = i10 - this.iMax;
            }
            int i18 = i14;
            i17 = i15 + i16;
            i11 = i18;
        }
        int i19 = this.iMax;
        if (i17 >= 0) {
            i12 = (i17 / i19) + i11;
            i13 = (i17 % i19) + 1;
        } else {
            i12 = ((i17 / i19) + i11) - 1;
            int iAbs = Math.abs(i17);
            int i20 = this.iMax;
            int i21 = iAbs % i20;
            if (i21 == 0) {
                i21 = i20;
            }
            i13 = (i20 - i21) + 1;
            if (i13 == 1) {
                i12++;
            }
        }
        int dayOfMonth = this.iChronology.getDayOfMonth(j10, year, monthOfYear);
        int daysInYearMonth = this.iChronology.getDaysInYearMonth(i12, i13);
        if (dayOfMonth > daysInYearMonth) {
            dayOfMonth = daysInYearMonth;
        }
        return this.iChronology.getYearMonthDayMillis(i12, i13, dayOfMonth) + millisOfDay;
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long add(long j10, long j11) {
        long j12;
        long j13;
        int i10 = (int) j11;
        if (i10 == j11) {
            return add(j10, i10);
        }
        long millisOfDay = this.iChronology.getMillisOfDay(j10);
        int year = this.iChronology.getYear(j10);
        int monthOfYear = this.iChronology.getMonthOfYear(j10, year);
        long j14 = ((long) (monthOfYear - 1)) + j11;
        if (j14 >= 0) {
            int i11 = this.iMax;
            j12 = (j14 / ((long) i11)) + ((long) year);
            j13 = (j14 % ((long) i11)) + 1;
        } else {
            j12 = ((j14 / ((long) this.iMax)) + ((long) year)) - 1;
            long jAbs = Math.abs(j14);
            int i12 = this.iMax;
            int i13 = (int) (jAbs % ((long) i12));
            if (i13 == 0) {
                i13 = i12;
            }
            j13 = (i12 - i13) + 1;
            if (j13 == 1) {
                j12++;
            }
        }
        if (j12 < this.iChronology.getMinYear() || j12 > this.iChronology.getMaxYear()) {
            throw new IllegalArgumentException(a.a("Magnitude of add amount is too large: ", j11));
        }
        int i14 = (int) j12;
        int i15 = (int) j13;
        int dayOfMonth = this.iChronology.getDayOfMonth(j10, year, monthOfYear);
        int daysInYearMonth = this.iChronology.getDaysInYearMonth(i14, i15);
        if (dayOfMonth > daysInYearMonth) {
            dayOfMonth = daysInYearMonth;
        }
        return this.iChronology.getYearMonthDayMillis(i14, i15, dayOfMonth) + millisOfDay;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int[] add(ReadablePartial readablePartial, int i10, int[] iArr, int i11) {
        if (i11 == 0) {
            return iArr;
        }
        if (readablePartial.size() > 0 && readablePartial.getFieldType(0).equals(DateTimeFieldType.monthOfYear()) && i10 == 0) {
            return set(readablePartial, 0, iArr, ((((i11 % 12) + (iArr[0] - 1)) + 12) % 12) + 1);
        }
        if (!DateTimeUtils.isContiguous(readablePartial)) {
            return super.add(readablePartial, i10, iArr, i11);
        }
        long j10 = 0;
        int size = readablePartial.size();
        for (int i12 = 0; i12 < size; i12++) {
            j10 = readablePartial.getFieldType(i12).getField(this.iChronology).set(j10, iArr[i12]);
        }
        return this.iChronology.get(readablePartial, add(j10, i11));
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long addWrapField(long j10, int i10) {
        return set(j10, FieldUtils.getWrappedValue(get(j10), i10, 1, this.iMax));
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int get(long j10) {
        return this.iChronology.getMonthOfYear(j10);
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long getDifferenceAsLong(long j10, long j11) {
        if (j10 < j11) {
            return -getDifference(j11, j10);
        }
        int year = this.iChronology.getYear(j10);
        int monthOfYear = this.iChronology.getMonthOfYear(j10, year);
        int year2 = this.iChronology.getYear(j11);
        int monthOfYear2 = this.iChronology.getMonthOfYear(j11, year2);
        long j12 = ((((long) (year - year2)) * ((long) this.iMax)) + ((long) monthOfYear)) - ((long) monthOfYear2);
        int dayOfMonth = this.iChronology.getDayOfMonth(j10, year, monthOfYear);
        if (dayOfMonth == this.iChronology.getDaysInYearMonth(year, monthOfYear) && this.iChronology.getDayOfMonth(j11, year2, monthOfYear2) > dayOfMonth) {
            j11 = this.iChronology.dayOfMonth().set(j11, dayOfMonth);
        }
        return j10 - this.iChronology.getYearMonthMillis(year, monthOfYear) < j11 - this.iChronology.getYearMonthMillis(year2, monthOfYear2) ? j12 - 1 : j12;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getLeapAmount(long j10) {
        return isLeap(j10) ? 1 : 0;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getLeapDurationField() {
        return this.iChronology.days();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMaximumValue() {
        return this.iMax;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMinimumValue() {
        return 1;
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getRangeDurationField() {
        return this.iChronology.years();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public boolean isLeap(long j10) {
        int year = this.iChronology.getYear(j10);
        return this.iChronology.isLeapYear(year) && this.iChronology.getMonthOfYear(j10, year) == this.iLeapMonth;
    }

    @Override // org.joda.time.DateTimeField
    public boolean isLenient() {
        return false;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long remainder(long j10) {
        return j10 - roundFloor(j10);
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long roundFloor(long j10) {
        int year = this.iChronology.getYear(j10);
        return this.iChronology.getYearMonthMillis(year, this.iChronology.getMonthOfYear(j10, year));
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long set(long j10, int i10) {
        FieldUtils.verifyValueBounds(this, i10, 1, this.iMax);
        int year = this.iChronology.getYear(j10);
        int dayOfMonth = this.iChronology.getDayOfMonth(j10, year);
        int daysInYearMonth = this.iChronology.getDaysInYearMonth(year, i10);
        if (dayOfMonth > daysInYearMonth) {
            dayOfMonth = daysInYearMonth;
        }
        return this.iChronology.getYearMonthDayMillis(year, i10, dayOfMonth) + ((long) this.iChronology.getMillisOfDay(j10));
    }
}
