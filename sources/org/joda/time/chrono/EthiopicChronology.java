package org.joda.time.chrono;

import android.support.v4.media.a;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.field.SkipDateTimeField;

/* JADX INFO: loaded from: classes3.dex */
public final class EthiopicChronology extends BasicFixedMonthChronology {
    public static final int EE = 1;
    private static final int MAX_YEAR = 292272984;
    private static final int MIN_YEAR = -292269337;
    private static final long serialVersionUID = -5972804258688333942L;
    private static final DateTimeField ERA_FIELD = new BasicSingleEraDateTimeField("EE");
    private static final ConcurrentHashMap<DateTimeZone, EthiopicChronology[]> cCache = new ConcurrentHashMap<>();
    private static final EthiopicChronology INSTANCE_UTC = getInstance(DateTimeZone.UTC);

    public EthiopicChronology(Chronology chronology, Object obj, int i10) {
        super(chronology, obj, i10);
    }

    public static EthiopicChronology getInstance() {
        return getInstance(DateTimeZone.getDefault(), 4);
    }

    public static EthiopicChronology getInstance(DateTimeZone dateTimeZone) {
        return getInstance(dateTimeZone, 4);
    }

    public static EthiopicChronology getInstance(DateTimeZone dateTimeZone, int i10) {
        EthiopicChronology ethiopicChronology;
        EthiopicChronology[] ethiopicChronologyArrPutIfAbsent;
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.getDefault();
        }
        ConcurrentHashMap<DateTimeZone, EthiopicChronology[]> concurrentHashMap = cCache;
        EthiopicChronology[] ethiopicChronologyArr = concurrentHashMap.get(dateTimeZone);
        if (ethiopicChronologyArr == null && (ethiopicChronologyArrPutIfAbsent = concurrentHashMap.putIfAbsent(dateTimeZone, (ethiopicChronologyArr = new EthiopicChronology[7]))) != null) {
            ethiopicChronologyArr = ethiopicChronologyArrPutIfAbsent;
        }
        int i11 = i10 - 1;
        try {
            EthiopicChronology ethiopicChronology2 = ethiopicChronologyArr[i11];
            if (ethiopicChronology2 == null) {
                synchronized (ethiopicChronologyArr) {
                    ethiopicChronology2 = ethiopicChronologyArr[i11];
                    if (ethiopicChronology2 == null) {
                        DateTimeZone dateTimeZone2 = DateTimeZone.UTC;
                        if (dateTimeZone == dateTimeZone2) {
                            EthiopicChronology ethiopicChronology3 = new EthiopicChronology(null, null, i10);
                            ethiopicChronology = new EthiopicChronology(LimitChronology.getInstance(ethiopicChronology3, new DateTime(1, 1, 1, 0, 0, 0, 0, ethiopicChronology3), null), null, i10);
                        } else {
                            ethiopicChronology = new EthiopicChronology(ZonedChronology.getInstance(getInstance(dateTimeZone2, i10), dateTimeZone), null, i10);
                        }
                        ethiopicChronologyArr[i11] = ethiopicChronology;
                        ethiopicChronology2 = ethiopicChronology;
                    }
                }
            }
            return ethiopicChronology2;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException(a.a("Invalid min days in first week: ", i10));
        }
    }

    public static EthiopicChronology getInstanceUTC() {
        return INSTANCE_UTC;
    }

    private Object readResolve() {
        Chronology base = getBase();
        return getInstance(base == null ? DateTimeZone.UTC : base.getZone(), getMinimumDaysInFirstWeek());
    }

    @Override // org.joda.time.chrono.BasicChronology, org.joda.time.chrono.AssembledChronology
    public void assemble(AssembledChronology.Fields fields) {
        if (getBase() == null) {
            super.assemble(fields);
            fields.year = new SkipDateTimeField(this, fields.year);
            fields.weekyear = new SkipDateTimeField(this, fields.weekyear);
            fields.era = ERA_FIELD;
            BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = new BasicMonthOfYearDateTimeField(this, 13);
            fields.monthOfYear = basicMonthOfYearDateTimeField;
            fields.months = basicMonthOfYearDateTimeField.getDurationField();
        }
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long calculateFirstDayOfYearMillis(int i10) {
        int i11;
        int i12 = i10 - 1963;
        if (i12 <= 0) {
            i11 = (i12 + 3) >> 2;
        } else {
            int i13 = i12 >> 2;
            i11 = !isLeapYear(i10) ? i13 + 1 : i13;
        }
        return (((((long) i12) * 365) + ((long) i11)) * 86400000) + 21859200000L;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long getApproxMillisAtEpochDividedByTwo() {
        return 30962844000000L;
    }

    @Override // org.joda.time.chrono.BasicChronology, org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public /* bridge */ /* synthetic */ long getDateTimeMillis(int i10, int i11, int i12, int i13) throws IllegalArgumentException {
        return super.getDateTimeMillis(i10, i11, i12, i13);
    }

    @Override // org.joda.time.chrono.BasicChronology, org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public /* bridge */ /* synthetic */ long getDateTimeMillis(int i10, int i11, int i12, int i13, int i14, int i15, int i16) throws IllegalArgumentException {
        return super.getDateTimeMillis(i10, i11, i12, i13, i14, i15, i16);
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int getMaxYear() {
        return MAX_YEAR;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int getMinYear() {
        return MIN_YEAR;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public /* bridge */ /* synthetic */ int getMinimumDaysInFirstWeek() {
        return super.getMinimumDaysInFirstWeek();
    }

    @Override // org.joda.time.chrono.BasicChronology, org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public /* bridge */ /* synthetic */ DateTimeZone getZone() {
        return super.getZone();
    }

    @Override // org.joda.time.chrono.BasicChronology
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // org.joda.time.chrono.BasicChronology
    public boolean isLeapDay(long j10) {
        return dayOfMonth().get(j10) == 6 && monthOfYear().isLeap(j10);
    }

    @Override // org.joda.time.chrono.BasicChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public Chronology withUTC() {
        return INSTANCE_UTC;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public Chronology withZone(DateTimeZone dateTimeZone) {
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.getDefault();
        }
        return dateTimeZone == getZone() ? this : getInstance(dateTimeZone);
    }
}
