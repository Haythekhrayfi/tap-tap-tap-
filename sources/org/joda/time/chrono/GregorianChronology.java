package org.joda.time.chrono;

import android.support.v4.media.a;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;

/* JADX INFO: loaded from: classes3.dex */
public final class GregorianChronology extends BasicGJChronology {
    private static final int DAYS_0000_TO_1970 = 719527;
    private static final int MAX_YEAR = 292278993;
    private static final long MILLIS_PER_MONTH = 2629746000L;
    private static final long MILLIS_PER_YEAR = 31556952000L;
    private static final int MIN_YEAR = -292275054;
    private static final long serialVersionUID = -861407383323710522L;
    private static final ConcurrentHashMap<DateTimeZone, GregorianChronology[]> cCache = new ConcurrentHashMap<>();
    private static final GregorianChronology INSTANCE_UTC = getInstance(DateTimeZone.UTC);

    private GregorianChronology(Chronology chronology, Object obj, int i10) {
        super(chronology, obj, i10);
    }

    public static GregorianChronology getInstance() {
        return getInstance(DateTimeZone.getDefault(), 4);
    }

    public static GregorianChronology getInstance(DateTimeZone dateTimeZone) {
        return getInstance(dateTimeZone, 4);
    }

    public static GregorianChronology getInstance(DateTimeZone dateTimeZone, int i10) {
        GregorianChronology[] gregorianChronologyArrPutIfAbsent;
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.getDefault();
        }
        ConcurrentHashMap<DateTimeZone, GregorianChronology[]> concurrentHashMap = cCache;
        GregorianChronology[] gregorianChronologyArr = concurrentHashMap.get(dateTimeZone);
        if (gregorianChronologyArr == null && (gregorianChronologyArrPutIfAbsent = concurrentHashMap.putIfAbsent(dateTimeZone, (gregorianChronologyArr = new GregorianChronology[7]))) != null) {
            gregorianChronologyArr = gregorianChronologyArrPutIfAbsent;
        }
        int i11 = i10 - 1;
        try {
            GregorianChronology gregorianChronology = gregorianChronologyArr[i11];
            if (gregorianChronology == null) {
                synchronized (gregorianChronologyArr) {
                    gregorianChronology = gregorianChronologyArr[i11];
                    if (gregorianChronology == null) {
                        DateTimeZone dateTimeZone2 = DateTimeZone.UTC;
                        GregorianChronology gregorianChronology2 = dateTimeZone == dateTimeZone2 ? new GregorianChronology(null, null, i10) : new GregorianChronology(ZonedChronology.getInstance(getInstance(dateTimeZone2, i10), dateTimeZone), null, i10);
                        gregorianChronologyArr[i11] = gregorianChronology2;
                        gregorianChronology = gregorianChronology2;
                    }
                }
            }
            return gregorianChronology;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException(a.a("Invalid min days in first week: ", i10));
        }
    }

    public static GregorianChronology getInstanceUTC() {
        return INSTANCE_UTC;
    }

    private Object readResolve() {
        Chronology base = getBase();
        int minimumDaysInFirstWeek = getMinimumDaysInFirstWeek();
        if (minimumDaysInFirstWeek == 0) {
            minimumDaysInFirstWeek = 4;
        }
        return getInstance(base == null ? DateTimeZone.UTC : base.getZone(), minimumDaysInFirstWeek);
    }

    @Override // org.joda.time.chrono.BasicChronology, org.joda.time.chrono.AssembledChronology
    public void assemble(AssembledChronology.Fields fields) {
        if (getBase() == null) {
            super.assemble(fields);
        }
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long calculateFirstDayOfYearMillis(int i10) {
        int i11;
        int i12 = i10 / 100;
        if (i10 < 0) {
            i11 = ((((i10 + 3) >> 2) - i12) + ((i12 + 3) >> 2)) - 1;
        } else {
            i11 = ((i10 >> 2) - i12) + (i12 >> 2);
            if (isLeapYear(i10)) {
                i11--;
            }
        }
        return ((((long) i10) * 365) + ((long) (i11 - DAYS_0000_TO_1970))) * 86400000;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long getApproxMillisAtEpochDividedByTwo() {
        return 31083597720000L;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long getAverageMillisPerMonth() {
        return MILLIS_PER_MONTH;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long getAverageMillisPerYear() {
        return MILLIS_PER_YEAR;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long getAverageMillisPerYearDividedByTwo() {
        return 15778476000L;
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
    public boolean isLeapYear(int i10) {
        return (i10 & 3) == 0 && (i10 % 100 != 0 || i10 % 400 == 0);
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
