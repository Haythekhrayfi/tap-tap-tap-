package org.joda.time.convert;

import ch.qos.logback.core.CoreConstants;
import i.f;
import l8.a1;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.Period;
import org.joda.time.ReadWritableInterval;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadablePartial;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;

/* JADX INFO: loaded from: classes3.dex */
class StringConverter extends AbstractConverter implements InstantConverter, PartialConverter, DurationConverter, PeriodConverter, IntervalConverter {
    public static final StringConverter INSTANCE = new StringConverter();

    @Override // org.joda.time.convert.DurationConverter
    public long getDurationMillis(Object obj) {
        long j10;
        long j11;
        String str = (String) obj;
        int length = str.length();
        if (length >= 4 && ((str.charAt(0) == 'P' || str.charAt(0) == 'p') && (str.charAt(1) == 'T' || str.charAt(1) == 't'))) {
            int i10 = length - 1;
            if (str.charAt(i10) == 'S' || str.charAt(i10) == 's') {
                String strSubstring = str.substring(2, i10);
                int i11 = 0;
                int i12 = -1;
                for (int i13 = 0; i13 < strSubstring.length(); i13++) {
                    if (strSubstring.charAt(i13) < '0' || strSubstring.charAt(i13) > '9') {
                        if (i13 == 0 && strSubstring.charAt(0) == '-') {
                            i11 = 1;
                        } else {
                            if (i13 <= i11 || strSubstring.charAt(i13) != '.' || i12 != -1) {
                                throw new IllegalArgumentException(a1.a("Invalid format: \"", str, CoreConstants.DOUBLE_QUOTE_CHAR));
                            }
                            i12 = i13;
                        }
                    }
                }
                if (i12 > 0) {
                    j10 = Long.parseLong(strSubstring.substring(i11, i12));
                    String strSubstring2 = strSubstring.substring(i12 + 1);
                    if (strSubstring2.length() != 3) {
                        strSubstring2 = (strSubstring2 + "000").substring(0, 3);
                    }
                    j11 = Integer.parseInt(strSubstring2);
                } else {
                    j10 = i11 != 0 ? Long.parseLong(strSubstring.substring(i11, strSubstring.length())) : Long.parseLong(strSubstring);
                    j11 = 0;
                }
                return i11 != 0 ? FieldUtils.safeAdd(FieldUtils.safeMultiply(-j10, 1000), -j11) : FieldUtils.safeAdd(FieldUtils.safeMultiply(j10, 1000), j11);
            }
        }
        throw new IllegalArgumentException(a1.a("Invalid format: \"", str, CoreConstants.DOUBLE_QUOTE_CHAR));
    }

    @Override // org.joda.time.convert.AbstractConverter, org.joda.time.convert.InstantConverter
    public long getInstantMillis(Object obj, Chronology chronology) {
        return ISODateTimeFormat.dateTimeParser().withChronology(chronology).parseMillis((String) obj);
    }

    @Override // org.joda.time.convert.AbstractConverter, org.joda.time.convert.PartialConverter
    public int[] getPartialValues(ReadablePartial readablePartial, Object obj, Chronology chronology, DateTimeFormatter dateTimeFormatter) {
        if (dateTimeFormatter.getZone() != null) {
            chronology = chronology.withZone(dateTimeFormatter.getZone());
        }
        return chronology.get(readablePartial, dateTimeFormatter.withChronology(chronology).parseMillis((String) obj));
    }

    @Override // org.joda.time.convert.Converter
    public Class<?> getSupportedType() {
        return String.class;
    }

    @Override // org.joda.time.convert.IntervalConverter
    public void setInto(ReadWritableInterval readWritableInterval, Object obj, Chronology chronology) {
        Period period;
        long jAdd;
        String str = (String) obj;
        int iIndexOf = str.indexOf(47);
        if (iIndexOf < 0) {
            throw new IllegalArgumentException(f.a("Format requires a '/' separator: ", str));
        }
        String strSubstring = str.substring(0, iIndexOf);
        if (strSubstring.length() <= 0) {
            throw new IllegalArgumentException(f.a("Format invalid: ", str));
        }
        String strSubstring2 = str.substring(iIndexOf + 1);
        if (strSubstring2.length() <= 0) {
            throw new IllegalArgumentException(f.a("Format invalid: ", str));
        }
        DateTimeFormatter dateTimeFormatterWithChronology = ISODateTimeFormat.dateTimeParser().withChronology(chronology);
        PeriodFormatter periodFormatterStandard = ISOPeriodFormat.standard();
        long jAdd2 = 0;
        char cCharAt = strSubstring.charAt(0);
        Chronology chronology2 = null;
        if (cCharAt == 'P' || cCharAt == 'p') {
            period = periodFormatterStandard.withParseType(getPeriodType(strSubstring)).parsePeriod(strSubstring);
        } else {
            DateTime dateTime = dateTimeFormatterWithChronology.parseDateTime(strSubstring);
            jAdd2 = dateTime.getMillis();
            chronology2 = dateTime.getChronology();
            period = null;
        }
        char cCharAt2 = strSubstring2.charAt(0);
        if (cCharAt2 != 'P' && cCharAt2 != 'p') {
            DateTime dateTime2 = dateTimeFormatterWithChronology.parseDateTime(strSubstring2);
            jAdd = dateTime2.getMillis();
            if (chronology2 == null) {
                chronology2 = dateTime2.getChronology();
            }
            if (chronology != null) {
                chronology2 = chronology;
            }
            if (period != null) {
                jAdd2 = chronology2.add(period, jAdd, -1);
            }
        } else {
            if (period != null) {
                throw new IllegalArgumentException(f.a("Interval composed of two durations: ", str));
            }
            Period period2 = periodFormatterStandard.withParseType(getPeriodType(strSubstring2)).parsePeriod(strSubstring2);
            if (chronology != null) {
                chronology2 = chronology;
            }
            jAdd = chronology2.add(period2, jAdd2, 1);
        }
        readWritableInterval.setInterval(jAdd2, jAdd);
        readWritableInterval.setChronology(chronology2);
    }

    @Override // org.joda.time.convert.PeriodConverter
    public void setInto(ReadWritablePeriod readWritablePeriod, Object obj, Chronology chronology) {
        String str = (String) obj;
        PeriodFormatter periodFormatterStandard = ISOPeriodFormat.standard();
        readWritablePeriod.clear();
        int into = periodFormatterStandard.parseInto(readWritablePeriod, str, 0);
        if (into < str.length()) {
            if (into < 0) {
                periodFormatterStandard.withParseType(readWritablePeriod.getPeriodType()).parseMutablePeriod(str);
            }
            throw new IllegalArgumentException(a1.a("Invalid format: \"", str, CoreConstants.DOUBLE_QUOTE_CHAR));
        }
    }
}
