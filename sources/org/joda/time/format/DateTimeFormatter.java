package org.joda.time.format;

import java.io.IOException;
import java.io.Writer;
import java.util.Locale;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadWritableInstant;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;

/* JADX INFO: loaded from: classes3.dex */
public class DateTimeFormatter {
    private final Chronology iChrono;
    private final int iDefaultYear;
    private final Locale iLocale;
    private final boolean iOffsetParsed;
    private final InternalParser iParser;
    private final Integer iPivotYear;
    private final InternalPrinter iPrinter;
    private final DateTimeZone iZone;

    public DateTimeFormatter(DateTimePrinter dateTimePrinter, DateTimeParser dateTimeParser) {
        this(DateTimePrinterInternalPrinter.of(dateTimePrinter), DateTimeParserInternalParser.of(dateTimeParser));
    }

    public DateTimeFormatter(InternalPrinter internalPrinter, InternalParser internalParser) {
        this.iPrinter = internalPrinter;
        this.iParser = internalParser;
        this.iLocale = null;
        this.iOffsetParsed = false;
        this.iChrono = null;
        this.iZone = null;
        this.iPivotYear = null;
        this.iDefaultYear = 2000;
    }

    private DateTimeFormatter(InternalPrinter internalPrinter, InternalParser internalParser, Locale locale, boolean z10, Chronology chronology, DateTimeZone dateTimeZone, Integer num, int i10) {
        this.iPrinter = internalPrinter;
        this.iParser = internalParser;
        this.iLocale = locale;
        this.iOffsetParsed = z10;
        this.iChrono = chronology;
        this.iZone = dateTimeZone;
        this.iPivotYear = num;
        this.iDefaultYear = i10;
    }

    private void printTo(Appendable appendable, long j10, Chronology chronology) throws IOException {
        InternalPrinter internalPrinterRequirePrinter = requirePrinter();
        Chronology chronologySelectChronology = selectChronology(chronology);
        DateTimeZone zone = chronologySelectChronology.getZone();
        int offset = zone.getOffset(j10);
        long j11 = offset;
        long j12 = j10 + j11;
        if ((j10 ^ j12) < 0 && (j11 ^ j10) >= 0) {
            zone = DateTimeZone.UTC;
            offset = 0;
            j12 = j10;
        }
        internalPrinterRequirePrinter.printTo(appendable, j12, chronologySelectChronology.withUTC(), offset, zone, this.iLocale);
    }

    private InternalParser requireParser() {
        InternalParser internalParser = this.iParser;
        if (internalParser != null) {
            return internalParser;
        }
        throw new UnsupportedOperationException("Parsing not supported");
    }

    private InternalPrinter requirePrinter() {
        InternalPrinter internalPrinter = this.iPrinter;
        if (internalPrinter != null) {
            return internalPrinter;
        }
        throw new UnsupportedOperationException("Printing not supported");
    }

    private Chronology selectChronology(Chronology chronology) {
        Chronology chronology2 = DateTimeUtils.getChronology(chronology);
        Chronology chronology3 = this.iChrono;
        if (chronology3 != null) {
            chronology2 = chronology3;
        }
        DateTimeZone dateTimeZone = this.iZone;
        return dateTimeZone != null ? chronology2.withZone(dateTimeZone) : chronology2;
    }

    @Deprecated
    public Chronology getChronolgy() {
        return this.iChrono;
    }

    public Chronology getChronology() {
        return this.iChrono;
    }

    public int getDefaultYear() {
        return this.iDefaultYear;
    }

    public Locale getLocale() {
        return this.iLocale;
    }

    public DateTimeParser getParser() {
        return InternalParserDateTimeParser.of(this.iParser);
    }

    public InternalParser getParser0() {
        return this.iParser;
    }

    public Integer getPivotYear() {
        return this.iPivotYear;
    }

    public DateTimePrinter getPrinter() {
        return InternalPrinterDateTimePrinter.of(this.iPrinter);
    }

    public InternalPrinter getPrinter0() {
        return this.iPrinter;
    }

    public DateTimeZone getZone() {
        return this.iZone;
    }

    public boolean isOffsetParsed() {
        return this.iOffsetParsed;
    }

    public boolean isParser() {
        return this.iParser != null;
    }

    public boolean isPrinter() {
        return this.iPrinter != null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0058  */
    /* JADX WARN: Code duplicated, block: B:22:? A[RETURN, SYNTHETIC] */
    public DateTime parseDateTime(String str) {
        DateTimeZone zone;
        DateTime dateTime;
        DateTimeZone dateTimeZone;
        InternalParser internalParserRequireParser = requireParser();
        Chronology chronologySelectChronology = selectChronology(null);
        DateTimeParserBucket dateTimeParserBucket = new DateTimeParserBucket(0L, chronologySelectChronology, this.iLocale, this.iPivotYear, this.iDefaultYear);
        int into = internalParserRequireParser.parseInto(dateTimeParserBucket, str, 0);
        if (into < 0) {
            into = ~into;
        } else if (into >= str.length()) {
            long jComputeMillis = dateTimeParserBucket.computeMillis(true, str);
            if (!this.iOffsetParsed || dateTimeParserBucket.getOffsetInteger() == null) {
                if (dateTimeParserBucket.getZone() != null) {
                    zone = dateTimeParserBucket.getZone();
                }
                dateTime = new DateTime(jComputeMillis, chronologySelectChronology);
                dateTimeZone = this.iZone;
                if (dateTimeZone != null) {
                    return dateTime.withZone(dateTimeZone);
                }
                return dateTime;
            }
            zone = DateTimeZone.forOffsetMillis(dateTimeParserBucket.getOffsetInteger().intValue());
            chronologySelectChronology = chronologySelectChronology.withZone(zone);
            dateTime = new DateTime(jComputeMillis, chronologySelectChronology);
            dateTimeZone = this.iZone;
            if (dateTimeZone != null) {
                return dateTime.withZone(dateTimeZone);
            }
            return dateTime;
        }
        throw new IllegalArgumentException(FormatUtils.createErrorMessage(str, into));
    }

    /* JADX WARN: Code duplicated, block: B:15:0x006c  */
    public int parseInto(ReadWritableInstant readWritableInstant, String str, int i10) {
        DateTimeZone zone;
        DateTimeZone dateTimeZone;
        InternalParser internalParserRequireParser = requireParser();
        if (readWritableInstant == null) {
            throw new IllegalArgumentException("Instant must not be null");
        }
        long millis = readWritableInstant.getMillis();
        Chronology chronology = readWritableInstant.getChronology();
        int i11 = DateTimeUtils.getChronology(chronology).year().get(millis);
        long offset = millis + ((long) chronology.getZone().getOffset(millis));
        Chronology chronologySelectChronology = selectChronology(chronology);
        DateTimeParserBucket dateTimeParserBucket = new DateTimeParserBucket(offset, chronologySelectChronology, this.iLocale, this.iPivotYear, i11);
        int into = internalParserRequireParser.parseInto(dateTimeParserBucket, str, i10);
        readWritableInstant.setMillis(dateTimeParserBucket.computeMillis(false, str));
        if (!this.iOffsetParsed || dateTimeParserBucket.getOffsetInteger() == null) {
            if (dateTimeParserBucket.getZone() != null) {
                zone = dateTimeParserBucket.getZone();
            }
            readWritableInstant.setChronology(chronologySelectChronology);
            dateTimeZone = this.iZone;
            if (dateTimeZone != null) {
                readWritableInstant.setZone(dateTimeZone);
            }
            return into;
        }
        zone = DateTimeZone.forOffsetMillis(dateTimeParserBucket.getOffsetInteger().intValue());
        chronologySelectChronology = chronologySelectChronology.withZone(zone);
        readWritableInstant.setChronology(chronologySelectChronology);
        dateTimeZone = this.iZone;
        if (dateTimeZone != null) {
            readWritableInstant.setZone(dateTimeZone);
        }
        return into;
    }

    public LocalDate parseLocalDate(String str) {
        return parseLocalDateTime(str).toLocalDate();
    }

    public LocalDateTime parseLocalDateTime(String str) {
        DateTimeZone zone;
        InternalParser internalParserRequireParser = requireParser();
        Chronology chronologyWithUTC = selectChronology(null).withUTC();
        DateTimeParserBucket dateTimeParserBucket = new DateTimeParserBucket(0L, chronologyWithUTC, this.iLocale, this.iPivotYear, this.iDefaultYear);
        int into = internalParserRequireParser.parseInto(dateTimeParserBucket, str, 0);
        if (into < 0) {
            into = ~into;
        } else if (into >= str.length()) {
            long jComputeMillis = dateTimeParserBucket.computeMillis(true, str);
            if (dateTimeParserBucket.getOffsetInteger() == null) {
                if (dateTimeParserBucket.getZone() != null) {
                    zone = dateTimeParserBucket.getZone();
                }
                return new LocalDateTime(jComputeMillis, chronologyWithUTC);
            }
            zone = DateTimeZone.forOffsetMillis(dateTimeParserBucket.getOffsetInteger().intValue());
            chronologyWithUTC = chronologyWithUTC.withZone(zone);
            return new LocalDateTime(jComputeMillis, chronologyWithUTC);
        }
        throw new IllegalArgumentException(FormatUtils.createErrorMessage(str, into));
    }

    public LocalTime parseLocalTime(String str) {
        return parseLocalDateTime(str).toLocalTime();
    }

    public long parseMillis(String str) {
        return new DateTimeParserBucket(0L, selectChronology(this.iChrono), this.iLocale, this.iPivotYear, this.iDefaultYear).doParseMillis(requireParser(), str);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0058  */
    public MutableDateTime parseMutableDateTime(String str) {
        DateTimeZone zone;
        MutableDateTime mutableDateTime;
        DateTimeZone dateTimeZone;
        InternalParser internalParserRequireParser = requireParser();
        Chronology chronologySelectChronology = selectChronology(null);
        DateTimeParserBucket dateTimeParserBucket = new DateTimeParserBucket(0L, chronologySelectChronology, this.iLocale, this.iPivotYear, this.iDefaultYear);
        int into = internalParserRequireParser.parseInto(dateTimeParserBucket, str, 0);
        if (into < 0) {
            into = ~into;
        } else if (into >= str.length()) {
            long jComputeMillis = dateTimeParserBucket.computeMillis(true, str);
            if (!this.iOffsetParsed || dateTimeParserBucket.getOffsetInteger() == null) {
                if (dateTimeParserBucket.getZone() != null) {
                    zone = dateTimeParserBucket.getZone();
                }
                mutableDateTime = new MutableDateTime(jComputeMillis, chronologySelectChronology);
                dateTimeZone = this.iZone;
                if (dateTimeZone != null) {
                    mutableDateTime.setZone(dateTimeZone);
                }
                return mutableDateTime;
            }
            zone = DateTimeZone.forOffsetMillis(dateTimeParserBucket.getOffsetInteger().intValue());
            chronologySelectChronology = chronologySelectChronology.withZone(zone);
            mutableDateTime = new MutableDateTime(jComputeMillis, chronologySelectChronology);
            dateTimeZone = this.iZone;
            if (dateTimeZone != null) {
                mutableDateTime.setZone(dateTimeZone);
            }
            return mutableDateTime;
        }
        throw new IllegalArgumentException(FormatUtils.createErrorMessage(str, into));
    }

    public String print(long j10) {
        StringBuilder sb2 = new StringBuilder(requirePrinter().estimatePrintedLength());
        try {
            printTo((Appendable) sb2, j10);
        } catch (IOException unused) {
        }
        return sb2.toString();
    }

    public String print(ReadableInstant readableInstant) {
        StringBuilder sb2 = new StringBuilder(requirePrinter().estimatePrintedLength());
        try {
            printTo((Appendable) sb2, readableInstant);
        } catch (IOException unused) {
        }
        return sb2.toString();
    }

    public String print(ReadablePartial readablePartial) {
        StringBuilder sb2 = new StringBuilder(requirePrinter().estimatePrintedLength());
        try {
            printTo((Appendable) sb2, readablePartial);
        } catch (IOException unused) {
        }
        return sb2.toString();
    }

    public void printTo(Writer writer, long j10) throws IOException {
        printTo((Appendable) writer, j10);
    }

    public void printTo(Writer writer, ReadableInstant readableInstant) throws IOException {
        printTo((Appendable) writer, readableInstant);
    }

    public void printTo(Writer writer, ReadablePartial readablePartial) throws IOException {
        printTo((Appendable) writer, readablePartial);
    }

    public void printTo(Appendable appendable, long j10) throws IOException {
        printTo(appendable, j10, null);
    }

    public void printTo(Appendable appendable, ReadableInstant readableInstant) throws IOException {
        printTo(appendable, DateTimeUtils.getInstantMillis(readableInstant), DateTimeUtils.getInstantChronology(readableInstant));
    }

    public void printTo(Appendable appendable, ReadablePartial readablePartial) throws IOException {
        InternalPrinter internalPrinterRequirePrinter = requirePrinter();
        if (readablePartial == null) {
            throw new IllegalArgumentException("The partial must not be null");
        }
        internalPrinterRequirePrinter.printTo(appendable, readablePartial, this.iLocale);
    }

    public void printTo(StringBuffer stringBuffer, long j10) {
        try {
            printTo((Appendable) stringBuffer, j10);
        } catch (IOException unused) {
        }
    }

    public void printTo(StringBuffer stringBuffer, ReadableInstant readableInstant) {
        try {
            printTo((Appendable) stringBuffer, readableInstant);
        } catch (IOException unused) {
        }
    }

    public void printTo(StringBuffer stringBuffer, ReadablePartial readablePartial) {
        try {
            printTo((Appendable) stringBuffer, readablePartial);
        } catch (IOException unused) {
        }
    }

    public void printTo(StringBuilder sb2, long j10) {
        try {
            printTo((Appendable) sb2, j10);
        } catch (IOException unused) {
        }
    }

    public void printTo(StringBuilder sb2, ReadableInstant readableInstant) {
        try {
            printTo((Appendable) sb2, readableInstant);
        } catch (IOException unused) {
        }
    }

    public void printTo(StringBuilder sb2, ReadablePartial readablePartial) {
        try {
            printTo((Appendable) sb2, readablePartial);
        } catch (IOException unused) {
        }
    }

    public DateTimeFormatter withChronology(Chronology chronology) {
        return this.iChrono == chronology ? this : new DateTimeFormatter(this.iPrinter, this.iParser, this.iLocale, this.iOffsetParsed, chronology, this.iZone, this.iPivotYear, this.iDefaultYear);
    }

    public DateTimeFormatter withDefaultYear(int i10) {
        return new DateTimeFormatter(this.iPrinter, this.iParser, this.iLocale, this.iOffsetParsed, this.iChrono, this.iZone, this.iPivotYear, i10);
    }

    public DateTimeFormatter withLocale(Locale locale) {
        return (locale == getLocale() || (locale != null && locale.equals(getLocale()))) ? this : new DateTimeFormatter(this.iPrinter, this.iParser, locale, this.iOffsetParsed, this.iChrono, this.iZone, this.iPivotYear, this.iDefaultYear);
    }

    public DateTimeFormatter withOffsetParsed() {
        return this.iOffsetParsed ? this : new DateTimeFormatter(this.iPrinter, this.iParser, this.iLocale, true, this.iChrono, null, this.iPivotYear, this.iDefaultYear);
    }

    public DateTimeFormatter withPivotYear(int i10) {
        return withPivotYear(Integer.valueOf(i10));
    }

    public DateTimeFormatter withPivotYear(Integer num) {
        Integer num2 = this.iPivotYear;
        return (num2 == num || (num2 != null && num2.equals(num))) ? this : new DateTimeFormatter(this.iPrinter, this.iParser, this.iLocale, this.iOffsetParsed, this.iChrono, this.iZone, num, this.iDefaultYear);
    }

    public DateTimeFormatter withZone(DateTimeZone dateTimeZone) {
        return this.iZone == dateTimeZone ? this : new DateTimeFormatter(this.iPrinter, this.iParser, this.iLocale, false, this.iChrono, dateTimeZone, this.iPivotYear, this.iDefaultYear);
    }

    public DateTimeFormatter withZoneUTC() {
        return withZone(DateTimeZone.UTC);
    }
}
