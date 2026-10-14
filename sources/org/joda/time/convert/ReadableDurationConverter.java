package org.joda.time.convert;

import org.joda.time.Chronology;
import org.joda.time.DateTimeUtils;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadableDuration;

/* JADX INFO: loaded from: classes3.dex */
class ReadableDurationConverter extends AbstractConverter implements DurationConverter, PeriodConverter {
    public static final ReadableDurationConverter INSTANCE = new ReadableDurationConverter();

    @Override // org.joda.time.convert.DurationConverter
    public long getDurationMillis(Object obj) {
        return ((ReadableDuration) obj).getMillis();
    }

    @Override // org.joda.time.convert.Converter
    public Class<?> getSupportedType() {
        return ReadableDuration.class;
    }

    @Override // org.joda.time.convert.PeriodConverter
    public void setInto(ReadWritablePeriod readWritablePeriod, Object obj, Chronology chronology) {
        int[] iArr = DateTimeUtils.getChronology(chronology).get(readWritablePeriod, ((ReadableDuration) obj).getMillis());
        for (int i10 = 0; i10 < iArr.length; i10++) {
            readWritablePeriod.setValue(i10, iArr[i10]);
        }
    }
}
