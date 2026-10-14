package org.joda.time.tz;

import org.joda.time.DateTimeZone;

/* JADX INFO: loaded from: classes3.dex */
public class CachedDateTimeZone extends DateTimeZone {
    private static final int cInfoCacheMask;
    private static final long serialVersionUID = 5472298452022250685L;
    private final transient Info[] iInfoCache;
    private final DateTimeZone iZone;

    public static final class Info {
        private String iNameKey;
        public Info iNextInfo;
        public final long iPeriodStart;
        public final DateTimeZone iZoneRef;
        private int iOffset = Integer.MIN_VALUE;
        private int iStandardOffset = Integer.MIN_VALUE;

        public Info(DateTimeZone dateTimeZone, long j10) {
            this.iPeriodStart = j10;
            this.iZoneRef = dateTimeZone;
        }

        public String getNameKey(long j10) {
            Info info = this.iNextInfo;
            if (info != null && j10 >= info.iPeriodStart) {
                return info.getNameKey(j10);
            }
            if (this.iNameKey == null) {
                this.iNameKey = this.iZoneRef.getNameKey(this.iPeriodStart);
            }
            return this.iNameKey;
        }

        public int getOffset(long j10) {
            Info info = this.iNextInfo;
            if (info != null && j10 >= info.iPeriodStart) {
                return info.getOffset(j10);
            }
            if (this.iOffset == Integer.MIN_VALUE) {
                this.iOffset = this.iZoneRef.getOffset(this.iPeriodStart);
            }
            return this.iOffset;
        }

        public int getStandardOffset(long j10) {
            Info info = this.iNextInfo;
            if (info != null && j10 >= info.iPeriodStart) {
                return info.getStandardOffset(j10);
            }
            if (this.iStandardOffset == Integer.MIN_VALUE) {
                this.iStandardOffset = this.iZoneRef.getStandardOffset(this.iPeriodStart);
            }
            return this.iStandardOffset;
        }
    }

    static {
        Integer integer;
        int i10;
        try {
            integer = Integer.getInteger("org.joda.time.tz.CachedDateTimeZone.size");
        } catch (SecurityException unused) {
            integer = null;
        }
        if (integer == null) {
            i10 = 512;
        } else {
            int i11 = 0;
            for (int iIntValue = integer.intValue() - 1; iIntValue > 0; iIntValue >>= 1) {
                i11++;
            }
            i10 = 1 << i11;
        }
        cInfoCacheMask = i10 - 1;
    }

    private CachedDateTimeZone(DateTimeZone dateTimeZone) {
        super(dateTimeZone.getID());
        this.iInfoCache = new Info[cInfoCacheMask + 1];
        this.iZone = dateTimeZone;
    }

    private Info createInfo(long j10) {
        long j11 = j10 & (-4294967296L);
        Info info = new Info(this.iZone, j11);
        long j12 = 4294967295L | j11;
        Info info2 = info;
        while (true) {
            long jNextTransition = this.iZone.nextTransition(j11);
            if (jNextTransition == j11 || jNextTransition > j12) {
                break;
            }
            Info info3 = new Info(this.iZone, jNextTransition);
            info2.iNextInfo = info3;
            info2 = info3;
            j11 = jNextTransition;
        }
        return info;
    }

    public static CachedDateTimeZone forZone(DateTimeZone dateTimeZone) {
        return dateTimeZone instanceof CachedDateTimeZone ? (CachedDateTimeZone) dateTimeZone : new CachedDateTimeZone(dateTimeZone);
    }

    private Info getInfo(long j10) {
        int i10 = (int) (j10 >> 32);
        Info[] infoArr = this.iInfoCache;
        int i11 = cInfoCacheMask & i10;
        Info info = infoArr[i11];
        if (info != null && ((int) (info.iPeriodStart >> 32)) == i10) {
            return info;
        }
        Info infoCreateInfo = createInfo(j10);
        infoArr[i11] = infoCreateInfo;
        return infoCreateInfo;
    }

    @Override // org.joda.time.DateTimeZone
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CachedDateTimeZone) {
            return this.iZone.equals(((CachedDateTimeZone) obj).iZone);
        }
        return false;
    }

    @Override // org.joda.time.DateTimeZone
    public String getNameKey(long j10) {
        return getInfo(j10).getNameKey(j10);
    }

    @Override // org.joda.time.DateTimeZone
    public int getOffset(long j10) {
        return getInfo(j10).getOffset(j10);
    }

    @Override // org.joda.time.DateTimeZone
    public int getStandardOffset(long j10) {
        return getInfo(j10).getStandardOffset(j10);
    }

    public DateTimeZone getUncachedZone() {
        return this.iZone;
    }

    @Override // org.joda.time.DateTimeZone
    public int hashCode() {
        return this.iZone.hashCode();
    }

    @Override // org.joda.time.DateTimeZone
    public boolean isFixed() {
        return this.iZone.isFixed();
    }

    @Override // org.joda.time.DateTimeZone
    public long nextTransition(long j10) {
        return this.iZone.nextTransition(j10);
    }

    @Override // org.joda.time.DateTimeZone
    public long previousTransition(long j10) {
        return this.iZone.previousTransition(j10);
    }
}
