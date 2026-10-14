package org.joda.time.format;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import defpackage.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.internal.connection.RealConnection;
import org.joda.time.Chronology;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadablePartial;
import org.joda.time.field.MillisDurationField;
import org.joda.time.field.PreciseDateTimeField;

/* JADX INFO: loaded from: classes3.dex */
public class DateTimeFormatterBuilder {
    private ArrayList<Object> iElementPairs = new ArrayList<>();
    private Object iFormatter;

    public static class CharacterLiteral implements InternalPrinter, InternalParser {
        private final char iValue;

        public CharacterLiteral(char c10) {
            this.iValue = c10;
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return 1;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return 1;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i10) {
            char upperCase;
            char upperCase2;
            if (i10 >= charSequence.length()) {
                return ~i10;
            }
            char cCharAt = charSequence.charAt(i10);
            char c10 = this.iValue;
            return (cCharAt == c10 || (upperCase = Character.toUpperCase(cCharAt)) == (upperCase2 = Character.toUpperCase(c10)) || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) ? i10 + 1 : ~i10;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j10, Chronology chronology, int i10, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            appendable.append(this.iValue);
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            appendable.append(this.iValue);
        }
    }

    public static class Composite implements InternalPrinter, InternalParser {
        private final int iParsedLengthEstimate;
        private final InternalParser[] iParsers;
        private final int iPrintedLengthEstimate;
        private final InternalPrinter[] iPrinters;

        public Composite(List<Object> list) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            decompose(list, arrayList, arrayList2);
            if (arrayList.contains(null) || arrayList.isEmpty()) {
                this.iPrinters = null;
                this.iPrintedLengthEstimate = 0;
            } else {
                int size = arrayList.size();
                this.iPrinters = new InternalPrinter[size];
                int iEstimatePrintedLength = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    InternalPrinter internalPrinter = (InternalPrinter) arrayList.get(i10);
                    iEstimatePrintedLength += internalPrinter.estimatePrintedLength();
                    this.iPrinters[i10] = internalPrinter;
                }
                this.iPrintedLengthEstimate = iEstimatePrintedLength;
            }
            if (arrayList2.contains(null) || arrayList2.isEmpty()) {
                this.iParsers = null;
                this.iParsedLengthEstimate = 0;
                return;
            }
            int size2 = arrayList2.size();
            this.iParsers = new InternalParser[size2];
            int iEstimateParsedLength = 0;
            for (int i11 = 0; i11 < size2; i11++) {
                InternalParser internalParser = (InternalParser) arrayList2.get(i11);
                iEstimateParsedLength += internalParser.estimateParsedLength();
                this.iParsers[i11] = internalParser;
            }
            this.iParsedLengthEstimate = iEstimateParsedLength;
        }

        private void addArrayToList(List<Object> list, Object[] objArr) {
            if (objArr != null) {
                for (Object obj : objArr) {
                    list.add(obj);
                }
            }
        }

        private void decompose(List<Object> list, List<Object> list2, List<Object> list3) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10 += 2) {
                Object obj = list.get(i10);
                if (obj instanceof Composite) {
                    addArrayToList(list2, ((Composite) obj).iPrinters);
                } else {
                    list2.add(obj);
                }
                Object obj2 = list.get(i10 + 1);
                if (obj2 instanceof Composite) {
                    addArrayToList(list3, ((Composite) obj2).iParsers);
                } else {
                    list3.add(obj2);
                }
            }
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return this.iParsedLengthEstimate;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return this.iPrintedLengthEstimate;
        }

        public boolean isParser() {
            return this.iParsers != null;
        }

        public boolean isPrinter() {
            return this.iPrinters != null;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i10) {
            InternalParser[] internalParserArr = this.iParsers;
            if (internalParserArr == null) {
                throw new UnsupportedOperationException();
            }
            int length = internalParserArr.length;
            for (int i11 = 0; i11 < length && i10 >= 0; i11++) {
                i10 = internalParserArr[i11].parseInto(dateTimeParserBucket, charSequence, i10);
            }
            return i10;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j10, Chronology chronology, int i10, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            InternalPrinter[] internalPrinterArr = this.iPrinters;
            if (internalPrinterArr == null) {
                throw new UnsupportedOperationException();
            }
            Locale locale2 = locale == null ? Locale.getDefault() : locale;
            for (InternalPrinter internalPrinter : internalPrinterArr) {
                internalPrinter.printTo(appendable, j10, chronology, i10, dateTimeZone, locale2);
            }
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            InternalPrinter[] internalPrinterArr = this.iPrinters;
            if (internalPrinterArr == null) {
                throw new UnsupportedOperationException();
            }
            if (locale == null) {
                locale = Locale.getDefault();
            }
            for (InternalPrinter internalPrinter : internalPrinterArr) {
                internalPrinter.printTo(appendable, readablePartial, locale);
            }
        }
    }

    public static class FixedNumber extends PaddedNumber {
        public FixedNumber(DateTimeFieldType dateTimeFieldType, int i10, boolean z10) {
            super(dateTimeFieldType, i10, z10, i10);
        }

        @Override // org.joda.time.format.DateTimeFormatterBuilder.NumberFormatter, org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i10) {
            int i11;
            char cCharAt;
            int into = super.parseInto(dateTimeParserBucket, charSequence, i10);
            if (into < 0 || into == (i11 = this.iMaxParsedDigits + i10)) {
                return into;
            }
            if (this.iSigned && ((cCharAt = charSequence.charAt(i10)) == '-' || cCharAt == '+')) {
                i11++;
            }
            if (into > i11) {
                return ~(i11 + 1);
            }
            return into < i11 ? ~into : into;
        }
    }

    public static class Fraction implements InternalPrinter, InternalParser {
        private final DateTimeFieldType iFieldType;
        public int iMaxDigits;
        public int iMinDigits;

        public Fraction(DateTimeFieldType dateTimeFieldType, int i10, int i11) {
            this.iFieldType = dateTimeFieldType;
            i11 = i11 > 18 ? 18 : i11;
            this.iMinDigits = i10;
            this.iMaxDigits = i11;
        }

        private long[] getFractionData(long j10, DateTimeField dateTimeField) {
            long j11;
            long unitMillis = dateTimeField.getDurationField().getUnitMillis();
            int i10 = this.iMaxDigits;
            while (true) {
                switch (i10) {
                    case 1:
                        j11 = 10;
                        break;
                    case 2:
                        j11 = 100;
                        break;
                    case 3:
                        j11 = 1000;
                        break;
                    case 4:
                        j11 = AbstractComponentTracker.LINGERING_TIMEOUT;
                        break;
                    case 5:
                        j11 = 100000;
                        break;
                    case 6:
                        j11 = 1000000;
                        break;
                    case 7:
                        j11 = 10000000;
                        break;
                    case 8:
                        j11 = 100000000;
                        break;
                    case 9:
                        j11 = 1000000000;
                        break;
                    case 10:
                        j11 = RealConnection.IDLE_CONNECTION_HEALTHY_NS;
                        break;
                    case 11:
                        j11 = 100000000000L;
                        break;
                    case 12:
                        j11 = 1000000000000L;
                        break;
                    case 13:
                        j11 = 10000000000000L;
                        break;
                    case 14:
                        j11 = 100000000000000L;
                        break;
                    case 15:
                        j11 = 1000000000000000L;
                        break;
                    case 16:
                        j11 = 10000000000000000L;
                        break;
                    case 17:
                        j11 = 100000000000000000L;
                        break;
                    case 18:
                        j11 = 1000000000000000000L;
                        break;
                    default:
                        j11 = 1;
                        break;
                }
                if ((unitMillis * j11) / j11 == unitMillis) {
                    return new long[]{(j10 * j11) / unitMillis, i10};
                }
                i10--;
            }
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return this.iMaxDigits;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return this.iMaxDigits;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i10) {
            DateTimeField field = this.iFieldType.getField(dateTimeParserBucket.getChronology());
            int iMin = Math.min(this.iMaxDigits, charSequence.length() - i10);
            long unitMillis = field.getDurationField().getUnitMillis() * 10;
            long j10 = 0;
            int i11 = 0;
            while (i11 < iMin) {
                char cCharAt = charSequence.charAt(i10 + i11);
                if (cCharAt < '0' || cCharAt > '9') {
                    break;
                }
                i11++;
                unitMillis /= 10;
                j10 += ((long) (cCharAt - '0')) * unitMillis;
            }
            long j11 = j10 / 10;
            if (i11 != 0 && j11 <= 2147483647L) {
                dateTimeParserBucket.saveField(new PreciseDateTimeField(DateTimeFieldType.millisOfSecond(), MillisDurationField.INSTANCE, field.getDurationField()), (int) j11);
                return i10 + i11;
            }
            return ~i10;
        }

        public void printTo(Appendable appendable, long j10, Chronology chronology) throws IOException {
            DateTimeField field = this.iFieldType.getField(chronology);
            int i10 = this.iMinDigits;
            try {
                long jRemainder = field.remainder(j10);
                if (jRemainder != 0) {
                    long[] fractionData = getFractionData(jRemainder, field);
                    long j11 = fractionData[0];
                    int i11 = (int) fractionData[1];
                    String string = (2147483647L & j11) == j11 ? Integer.toString((int) j11) : Long.toString(j11);
                    int length = string.length();
                    while (length < i11) {
                        appendable.append('0');
                        i10--;
                        i11--;
                    }
                    if (i10 < i11) {
                        while (i10 < i11 && length > 1 && string.charAt(length - 1) == '0') {
                            i11--;
                            length--;
                        }
                        if (length < string.length()) {
                            for (int i12 = 0; i12 < length; i12++) {
                                appendable.append(string.charAt(i12));
                            }
                            return;
                        }
                    }
                    appendable.append(string);
                    return;
                }
                while (true) {
                    i10--;
                    if (i10 < 0) {
                        return;
                    } else {
                        appendable.append('0');
                    }
                }
            } catch (RuntimeException unused) {
                DateTimeFormatterBuilder.appendUnknownString(appendable, i10);
            }
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j10, Chronology chronology, int i10, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            printTo(appendable, j10, chronology);
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            printTo(appendable, readablePartial.getChronology().set(readablePartial, 0L), readablePartial.getChronology());
        }
    }

    public static class MatchingParser implements InternalParser {
        private final int iParsedLengthEstimate;
        private final InternalParser[] iParsers;

        public MatchingParser(InternalParser[] internalParserArr) {
            int iEstimateParsedLength;
            this.iParsers = internalParserArr;
            int length = internalParserArr.length;
            int i10 = 0;
            while (true) {
                length--;
                if (length < 0) {
                    this.iParsedLengthEstimate = i10;
                    return;
                }
                InternalParser internalParser = internalParserArr[length];
                if (internalParser != null && (iEstimateParsedLength = internalParser.estimateParsedLength()) > i10) {
                    i10 = iEstimateParsedLength;
                }
            }
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return this.iParsedLengthEstimate;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i10) {
            int i11;
            int i12;
            InternalParser[] internalParserArr = this.iParsers;
            int length = internalParserArr.length;
            Object objSaveState = dateTimeParserBucket.saveState();
            boolean z10 = false;
            Object objSaveState2 = null;
            int i13 = i10;
            int i14 = i13;
            for (int i15 = 0; i15 < length; i15++) {
                InternalParser internalParser = internalParserArr[i15];
                if (internalParser == null) {
                    if (i13 > i10) {
                        z10 = true;
                        break;
                    }
                    return i10;
                }
                int into = internalParser.parseInto(dateTimeParserBucket, charSequence, i10);
                if (into >= i10) {
                    if (into <= i13) {
                        continue;
                    } else {
                        if (into >= charSequence.length() || (i12 = i15 + 1) >= length || internalParserArr[i12] == null) {
                            return into;
                        }
                        objSaveState2 = dateTimeParserBucket.saveState();
                        i13 = into;
                    }
                } else if (into < 0 && (i11 = ~into) > i14) {
                    i14 = i11;
                }
                dateTimeParserBucket.restoreState(objSaveState);
            }
            if (i13 <= i10 && (i13 != i10 || !z10)) {
                return ~i14;
            }
            if (objSaveState2 != null) {
                dateTimeParserBucket.restoreState(objSaveState2);
            }
            return i13;
        }
    }

    public static abstract class NumberFormatter implements InternalPrinter, InternalParser {
        public final DateTimeFieldType iFieldType;
        public final int iMaxParsedDigits;
        public final boolean iSigned;

        public NumberFormatter(DateTimeFieldType dateTimeFieldType, int i10, boolean z10) {
            this.iFieldType = dateTimeFieldType;
            this.iMaxParsedDigits = i10;
            this.iSigned = z10;
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return this.iMaxParsedDigits;
        }

        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i10) {
            int i11;
            int i12;
            char cCharAt;
            int iMin = Math.min(this.iMaxParsedDigits, charSequence.length() - i10);
            int i13 = 0;
            boolean z10 = false;
            boolean z11 = false;
            while (i13 < iMin) {
                int i14 = i10 + i13;
                char cCharAt2 = charSequence.charAt(i14);
                if (i13 == 0 && ((cCharAt2 == '-' || cCharAt2 == '+') && this.iSigned)) {
                    boolean z12 = cCharAt2 == '-';
                    boolean z13 = cCharAt2 == '+';
                    int i15 = i13 + 1;
                    if (i15 >= iMin || (cCharAt = charSequence.charAt(i14 + 1)) < '0' || cCharAt > '9') {
                        boolean z14 = z12;
                        z11 = z13;
                        z10 = z14;
                        break;
                    }
                    iMin = Math.min(iMin + 1, charSequence.length() - i10);
                    i13 = i15;
                    boolean z15 = z12;
                    z11 = z13;
                    z10 = z15;
                } else {
                    if (cCharAt2 < '0' || cCharAt2 > '9') {
                        break;
                    }
                    i13++;
                }
            }
            if (i13 == 0) {
                return ~i10;
            }
            if (i13 < 9) {
                int i16 = (z10 || z11) ? i10 + 1 : i10;
                int i17 = i16 + 1;
                try {
                    int iCharAt = charSequence.charAt(i16) - '0';
                    i11 = i10 + i13;
                    while (i17 < i11) {
                        int i18 = (iCharAt << 3) + (iCharAt << 1);
                        int i19 = i17 + 1;
                        int iCharAt2 = (charSequence.charAt(i17) + i18) - 48;
                        i17 = i19;
                        iCharAt = iCharAt2;
                    }
                    i12 = z10 ? -iCharAt : iCharAt;
                } catch (StringIndexOutOfBoundsException unused) {
                    return ~i10;
                }
            } else if (z11) {
                i11 = i10 + i13;
                i12 = Integer.parseInt(charSequence.subSequence(i10 + 1, i11).toString());
            } else {
                int i20 = i10 + i13;
                i12 = Integer.parseInt(charSequence.subSequence(i10, i20).toString());
                i11 = i20;
            }
            dateTimeParserBucket.saveField(this.iFieldType, i12);
            return i11;
        }
    }

    public static class PaddedNumber extends NumberFormatter {
        public final int iMinPrintedDigits;

        public PaddedNumber(DateTimeFieldType dateTimeFieldType, int i10, boolean z10, int i11) {
            super(dateTimeFieldType, i10, z10);
            this.iMinPrintedDigits = i11;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return this.iMaxParsedDigits;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j10, Chronology chronology, int i10, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            try {
                FormatUtils.appendPaddedInteger(appendable, this.iFieldType.getField(chronology).get(j10), this.iMinPrintedDigits);
            } catch (RuntimeException unused) {
                DateTimeFormatterBuilder.appendUnknownString(appendable, this.iMinPrintedDigits);
            }
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            if (readablePartial.isSupported(this.iFieldType)) {
                try {
                    FormatUtils.appendPaddedInteger(appendable, readablePartial.get(this.iFieldType), this.iMinPrintedDigits);
                    return;
                } catch (RuntimeException unused) {
                }
            }
            DateTimeFormatterBuilder.appendUnknownString(appendable, this.iMinPrintedDigits);
        }
    }

    public static class StringLiteral implements InternalPrinter, InternalParser {
        private final String iValue;

        public StringLiteral(String str) {
            this.iValue = str;
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return this.iValue.length();
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return this.iValue.length();
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i10) {
            return DateTimeFormatterBuilder.csStartsWithIgnoreCase(charSequence, i10, this.iValue) ? this.iValue.length() + i10 : ~i10;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j10, Chronology chronology, int i10, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            appendable.append(this.iValue);
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            appendable.append(this.iValue);
        }
    }

    public static class TextField implements InternalPrinter, InternalParser {
        private static Map<Locale, Map<DateTimeFieldType, Object[]>> cParseCache = new ConcurrentHashMap();
        private final DateTimeFieldType iFieldType;
        private final boolean iShort;

        public TextField(DateTimeFieldType dateTimeFieldType, boolean z10) {
            this.iFieldType = dateTimeFieldType;
            this.iShort = z10;
        }

        private String print(long j10, Chronology chronology, Locale locale) {
            DateTimeField field = this.iFieldType.getField(chronology);
            return this.iShort ? field.getAsShortText(j10, locale) : field.getAsText(j10, locale);
        }

        private String print(ReadablePartial readablePartial, Locale locale) {
            if (!readablePartial.isSupported(this.iFieldType)) {
                return "�";
            }
            DateTimeField field = this.iFieldType.getField(readablePartial.getChronology());
            return this.iShort ? field.getAsShortText(readablePartial, locale) : field.getAsText(readablePartial, locale);
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return estimatePrintedLength();
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return this.iShort ? 6 : 20;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i10) {
            int iIntValue;
            Map map;
            Locale locale = dateTimeParserBucket.getLocale();
            Map<DateTimeFieldType, Object[]> concurrentHashMap = cParseCache.get(locale);
            if (concurrentHashMap == null) {
                concurrentHashMap = new ConcurrentHashMap<>();
                cParseCache.put(locale, concurrentHashMap);
            }
            Object[] objArr = concurrentHashMap.get(this.iFieldType);
            if (objArr == null) {
                ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap(32);
                MutableDateTime.Property property = new MutableDateTime(0L, DateTimeZone.UTC).property(this.iFieldType);
                int minimumValueOverall = property.getMinimumValueOverall();
                int maximumValueOverall = property.getMaximumValueOverall();
                if (maximumValueOverall - minimumValueOverall > 32) {
                    return ~i10;
                }
                iIntValue = property.getMaximumTextLength(locale);
                while (minimumValueOverall <= maximumValueOverall) {
                    property.set(minimumValueOverall);
                    String asShortText = property.getAsShortText(locale);
                    Boolean bool = Boolean.TRUE;
                    concurrentHashMap2.put(asShortText, bool);
                    concurrentHashMap2.put(property.getAsShortText(locale).toLowerCase(locale), bool);
                    concurrentHashMap2.put(property.getAsShortText(locale).toUpperCase(locale), bool);
                    concurrentHashMap2.put(property.getAsText(locale), bool);
                    concurrentHashMap2.put(property.getAsText(locale).toLowerCase(locale), bool);
                    concurrentHashMap2.put(property.getAsText(locale).toUpperCase(locale), bool);
                    minimumValueOverall++;
                }
                if ("en".equals(locale.getLanguage()) && this.iFieldType == DateTimeFieldType.era()) {
                    Boolean bool2 = Boolean.TRUE;
                    concurrentHashMap2.put("BCE", bool2);
                    concurrentHashMap2.put("bce", bool2);
                    concurrentHashMap2.put("CE", bool2);
                    concurrentHashMap2.put("ce", bool2);
                    iIntValue = 3;
                }
                concurrentHashMap.put(this.iFieldType, new Object[]{concurrentHashMap2, Integer.valueOf(iIntValue)});
                map = concurrentHashMap2;
            } else {
                Map map2 = (Map) objArr[0];
                iIntValue = ((Integer) objArr[1]).intValue();
                map = map2;
            }
            for (int iMin = Math.min(charSequence.length(), iIntValue + i10); iMin > i10; iMin--) {
                String string = charSequence.subSequence(i10, iMin).toString();
                if (map.containsKey(string)) {
                    dateTimeParserBucket.saveField(this.iFieldType, string, locale);
                    return iMin;
                }
            }
            return ~i10;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j10, Chronology chronology, int i10, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            try {
                appendable.append(print(j10, chronology, locale));
            } catch (RuntimeException unused) {
                appendable.append((char) 65533);
            }
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            try {
                appendable.append(print(readablePartial, locale));
            } catch (RuntimeException unused) {
                appendable.append((char) 65533);
            }
        }
    }

    public enum TimeZoneId implements InternalPrinter, InternalParser {
        INSTANCE;

        private static final List<String> ALL_IDS;
        private static final List<String> BASE_GROUPED_IDS = new ArrayList();
        private static final Map<String, List<String>> GROUPED_IDS;
        public static final int MAX_LENGTH;
        public static final int MAX_PREFIX_LENGTH;

        static {
            ArrayList<String> arrayList = new ArrayList(DateTimeZone.getAvailableIDs());
            ALL_IDS = arrayList;
            Collections.sort(arrayList);
            GROUPED_IDS = new HashMap();
            int iMax = 0;
            int iMax2 = 0;
            for (String str : arrayList) {
                int iIndexOf = str.indexOf(47);
                if (iIndexOf >= 0) {
                    iIndexOf = iIndexOf < str.length() ? iIndexOf + 1 : iIndexOf;
                    iMax2 = Math.max(iMax2, iIndexOf);
                    String strSubstring = str.substring(0, iIndexOf + 1);
                    String strSubstring2 = str.substring(iIndexOf);
                    Map<String, List<String>> map = GROUPED_IDS;
                    if (!map.containsKey(strSubstring)) {
                        map.put(strSubstring, new ArrayList());
                    }
                    map.get(strSubstring).add(strSubstring2);
                } else {
                    BASE_GROUPED_IDS.add(str);
                }
                iMax = Math.max(iMax, str.length());
            }
            MAX_LENGTH = iMax;
            MAX_PREFIX_LENGTH = iMax2;
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return MAX_LENGTH;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return MAX_LENGTH;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i10) {
            String string;
            int length;
            String string2;
            List<String> list = BASE_GROUPED_IDS;
            int length2 = charSequence.length();
            int iMin = Math.min(length2, MAX_PREFIX_LENGTH + i10);
            int i11 = i10;
            while (true) {
                if (i11 >= iMin) {
                    string = "";
                    length = i10;
                    break;
                }
                if (charSequence.charAt(i11) == '/') {
                    int i12 = i11 + 1;
                    string = charSequence.subSequence(i10, i12).toString();
                    length = string.length() + i10;
                    if (i11 < length2) {
                        StringBuilder sbA = a.a(string);
                        sbA.append(charSequence.charAt(i12));
                        string2 = sbA.toString();
                    } else {
                        string2 = string;
                    }
                    list = GROUPED_IDS.get(string2);
                    if (list != null) {
                        break;
                    }
                    return ~i10;
                }
                i11++;
            }
            String str = null;
            for (int i13 = 0; i13 < list.size(); i13++) {
                String str2 = list.get(i13);
                if (DateTimeFormatterBuilder.csStartsWith(charSequence, length, str2) && (str == null || str2.length() > str.length())) {
                    str = str2;
                }
            }
            if (str == null) {
                return ~i10;
            }
            dateTimeParserBucket.setZone(DateTimeZone.forID(string + str));
            return str.length() + length;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j10, Chronology chronology, int i10, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            appendable.append(dateTimeZone != null ? dateTimeZone.getID() : "");
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
        }
    }

    public static class TimeZoneName implements InternalPrinter, InternalParser {
        public static final int LONG_NAME = 0;
        public static final int SHORT_NAME = 1;
        private final Map<String, DateTimeZone> iParseLookup;
        private final int iType;

        public TimeZoneName(int i10, Map<String, DateTimeZone> map) {
            this.iType = i10;
            this.iParseLookup = map;
        }

        private String print(long j10, DateTimeZone dateTimeZone, Locale locale) {
            if (dateTimeZone == null) {
                return "";
            }
            int i10 = this.iType;
            if (i10 != 0) {
                return i10 != 1 ? "" : dateTimeZone.getShortName(j10, locale);
            }
            return dateTimeZone.getName(j10, locale);
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return this.iType == 1 ? 4 : 20;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return this.iType == 1 ? 4 : 20;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i10) {
            Map<String, DateTimeZone> defaultTimeZoneNames = this.iParseLookup;
            if (defaultTimeZoneNames == null) {
                defaultTimeZoneNames = DateTimeUtils.getDefaultTimeZoneNames();
            }
            String str = null;
            for (String str2 : defaultTimeZoneNames.keySet()) {
                if (DateTimeFormatterBuilder.csStartsWith(charSequence, i10, str2) && (str == null || str2.length() > str.length())) {
                    str = str2;
                }
            }
            if (str == null) {
                return ~i10;
            }
            dateTimeParserBucket.setZone(defaultTimeZoneNames.get(str));
            return str.length() + i10;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j10, Chronology chronology, int i10, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            appendable.append(print(j10 - ((long) i10), dateTimeZone, locale));
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
        }
    }

    public static class TimeZoneOffset implements InternalPrinter, InternalParser {
        private final int iMaxFields;
        private final int iMinFields;
        private final boolean iShowSeparators;
        private final String iZeroOffsetParseText;
        private final String iZeroOffsetPrintText;

        public TimeZoneOffset(String str, String str2, boolean z10, int i10, int i11) {
            this.iZeroOffsetPrintText = str;
            this.iZeroOffsetParseText = str2;
            this.iShowSeparators = z10;
            if (i10 <= 0 || i11 < i10) {
                throw new IllegalArgumentException();
            }
            if (i10 > 4) {
                i10 = 4;
                i11 = 4;
            }
            this.iMinFields = i10;
            this.iMaxFields = i11;
        }

        private int digitCount(CharSequence charSequence, int i10, int i11) {
            int i12 = 0;
            for (int iMin = Math.min(charSequence.length() - i10, i11); iMin > 0; iMin--) {
                char cCharAt = charSequence.charAt(i10 + i12);
                if (cCharAt < '0' || cCharAt > '9') {
                    break;
                }
                i12++;
            }
            return i12;
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return estimatePrintedLength();
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            int i10 = this.iMinFields;
            int i11 = (i10 + 1) << 1;
            if (this.iShowSeparators) {
                i11 += i10 - 1;
            }
            String str = this.iZeroOffsetPrintText;
            return (str == null || str.length() <= i11) ? i11 : this.iZeroOffsetPrintText.length();
        }

        /* JADX WARN: Code duplicated, block: B:66:0x00bd A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:67:0x00bf A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:69:0x00c1  */
        /* JADX WARN: Code duplicated, block: B:76:0x00d3  */
        /* JADX WARN: Code duplicated, block: B:77:0x00d5  */
        /* JADX WARN: Code duplicated, block: B:79:0x00dd  */
        /* JADX WARN: Code duplicated, block: B:83:0x00e8 A[PHI: r14
  0x00e8: PHI (r14v8 int) = (r14v7 int), (r14v15 int) binds: [B:76:0x00d3, B:82:0x00e6] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:85:0x00ef A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:87:0x00f2 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:88:0x00f4  */
        /* JADX WARN: Code duplicated, block: B:90:0x00f6  */
        /* JADX WARN: Code duplicated, block: B:92:0x0102  */
        /* JADX WARN: Code duplicated, block: B:94:0x010e  */
        /* JADX WARN: Code duplicated, block: B:95:0x0118  */
        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i10) {
            boolean z10;
            int twoDigits;
            int twoDigits2;
            int iDigitCount;
            int twoDigits3;
            int iDigitCount2;
            int i11;
            char cCharAt;
            int length = charSequence.length() - i10;
            String str = this.iZeroOffsetParseText;
            boolean z11 = false;
            if (str != null) {
                if (str.length() == 0) {
                    if (length <= 0 || ((cCharAt = charSequence.charAt(i10)) != '-' && cCharAt != '+')) {
                        dateTimeParserBucket.setOffset((Integer) 0);
                        return i10;
                    }
                } else if (DateTimeFormatterBuilder.csStartsWithIgnoreCase(charSequence, i10, this.iZeroOffsetParseText)) {
                    dateTimeParserBucket.setOffset((Integer) 0);
                    return this.iZeroOffsetParseText.length() + i10;
                }
            }
            if (length <= 1) {
                return ~i10;
            }
            char cCharAt2 = charSequence.charAt(i10);
            if (cCharAt2 == '-') {
                z10 = true;
            } else {
                if (cCharAt2 != '+') {
                    return ~i10;
                }
                z10 = false;
            }
            int i12 = length - 1;
            int i13 = i10 + 1;
            if (digitCount(charSequence, i13, 2) >= 2 && (twoDigits = FormatUtils.parseTwoDigits(charSequence, i13)) <= 23) {
                int iCharAt = twoDigits * DateTimeConstants.MILLIS_PER_HOUR;
                int i14 = i12 - 2;
                int i15 = i13 + 2;
                if (i14 > 0) {
                    char cCharAt3 = charSequence.charAt(i15);
                    if (cCharAt3 == ':') {
                        i14--;
                        i15++;
                        z11 = true;
                    } else if (cCharAt3 >= '0' && cCharAt3 <= '9') {
                    }
                    int iDigitCount3 = digitCount(charSequence, i15, 2);
                    if (iDigitCount3 != 0 || z11) {
                        if (iDigitCount3 >= 2 && (twoDigits2 = FormatUtils.parseTwoDigits(charSequence, i15)) <= 59) {
                            iCharAt += twoDigits2 * DateTimeConstants.MILLIS_PER_MINUTE;
                            int i16 = i14 - 2;
                            i15 += 2;
                            if (i16 > 0) {
                                if (!z11) {
                                    iDigitCount = digitCount(charSequence, i15, 2);
                                    if (iDigitCount == 0 || z11) {
                                        if (iDigitCount < 2 && (twoDigits3 = FormatUtils.parseTwoDigits(charSequence, i15)) <= 59) {
                                            iCharAt += twoDigits3 * 1000;
                                            i15 += 2;
                                            if (i16 - 2 > 0) {
                                                if (!z11) {
                                                    iDigitCount2 = digitCount(charSequence, i15, 3);
                                                    if (iDigitCount2 == 0 || z11) {
                                                        if (iDigitCount2 < 1) {
                                                            return ~i15;
                                                        }
                                                        i11 = i15 + 1;
                                                        iCharAt += (charSequence.charAt(i15) - '0') * 100;
                                                        if (iDigitCount2 > 1) {
                                                            i15 = i11 + 1;
                                                            iCharAt += (charSequence.charAt(i11) - '0') * 10;
                                                            if (iDigitCount2 > 2) {
                                                                iCharAt += charSequence.charAt(i15) - '0';
                                                                i15++;
                                                            }
                                                        } else {
                                                            i15 = i11;
                                                        }
                                                    }
                                                } else if (charSequence.charAt(i15) != '.' || charSequence.charAt(i15) == ',') {
                                                    i15++;
                                                    iDigitCount2 = digitCount(charSequence, i15, 3);
                                                    if (iDigitCount2 == 0) {
                                                        if (iDigitCount2 < 1) {
                                                            return ~i15;
                                                        }
                                                        i11 = i15 + 1;
                                                        iCharAt += (charSequence.charAt(i15) - '0') * 100;
                                                        if (iDigitCount2 > 1) {
                                                            i15 = i11 + 1;
                                                            iCharAt += (charSequence.charAt(i11) - '0') * 10;
                                                            if (iDigitCount2 > 2) {
                                                                iCharAt += charSequence.charAt(i15) - '0';
                                                                i15++;
                                                            }
                                                        } else {
                                                            i15 = i11;
                                                        }
                                                    } else {
                                                        if (iDigitCount2 < 1) {
                                                            return ~i15;
                                                        }
                                                        i11 = i15 + 1;
                                                        iCharAt += (charSequence.charAt(i15) - '0') * 100;
                                                        if (iDigitCount2 > 1) {
                                                            i15 = i11 + 1;
                                                            iCharAt += (charSequence.charAt(i11) - '0') * 10;
                                                            if (iDigitCount2 > 2) {
                                                                iCharAt += charSequence.charAt(i15) - '0';
                                                                i15++;
                                                            }
                                                        } else {
                                                            i15 = i11;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        return ~i15;
                                    }
                                } else if (charSequence.charAt(i15) == ':') {
                                    i16--;
                                    i15++;
                                    iDigitCount = digitCount(charSequence, i15, 2);
                                    if (iDigitCount == 0) {
                                        if (iDigitCount < 2) {
                                            return ~i15;
                                        }
                                        iCharAt += twoDigits3 * 1000;
                                        i15 += 2;
                                        if (i16 - 2 > 0) {
                                            if (!z11) {
                                                iDigitCount2 = digitCount(charSequence, i15, 3);
                                                if (iDigitCount2 == 0) {
                                                    if (iDigitCount2 < 1) {
                                                        return ~i15;
                                                    }
                                                    i11 = i15 + 1;
                                                    iCharAt += (charSequence.charAt(i15) - '0') * 100;
                                                    if (iDigitCount2 > 1) {
                                                        i15 = i11 + 1;
                                                        iCharAt += (charSequence.charAt(i11) - '0') * 10;
                                                        if (iDigitCount2 > 2) {
                                                            iCharAt += charSequence.charAt(i15) - '0';
                                                            i15++;
                                                        }
                                                    } else {
                                                        i15 = i11;
                                                    }
                                                } else {
                                                    if (iDigitCount2 < 1) {
                                                        return ~i15;
                                                    }
                                                    i11 = i15 + 1;
                                                    iCharAt += (charSequence.charAt(i15) - '0') * 100;
                                                    if (iDigitCount2 > 1) {
                                                        i15 = i11 + 1;
                                                        iCharAt += (charSequence.charAt(i11) - '0') * 10;
                                                        if (iDigitCount2 > 2) {
                                                            iCharAt += charSequence.charAt(i15) - '0';
                                                            i15++;
                                                        }
                                                    } else {
                                                        i15 = i11;
                                                    }
                                                }
                                            } else {
                                                if (charSequence.charAt(i15) != '.') {
                                                }
                                                i15++;
                                                iDigitCount2 = digitCount(charSequence, i15, 3);
                                                if (iDigitCount2 == 0) {
                                                    if (iDigitCount2 < 1) {
                                                        return ~i15;
                                                    }
                                                    i11 = i15 + 1;
                                                    iCharAt += (charSequence.charAt(i15) - '0') * 100;
                                                    if (iDigitCount2 > 1) {
                                                        i15 = i11 + 1;
                                                        iCharAt += (charSequence.charAt(i11) - '0') * 10;
                                                        if (iDigitCount2 > 2) {
                                                            iCharAt += charSequence.charAt(i15) - '0';
                                                            i15++;
                                                        }
                                                    } else {
                                                        i15 = i11;
                                                    }
                                                } else {
                                                    if (iDigitCount2 < 1) {
                                                        return ~i15;
                                                    }
                                                    i11 = i15 + 1;
                                                    iCharAt += (charSequence.charAt(i15) - '0') * 100;
                                                    if (iDigitCount2 > 1) {
                                                        i15 = i11 + 1;
                                                        iCharAt += (charSequence.charAt(i11) - '0') * 10;
                                                        if (iDigitCount2 > 2) {
                                                            iCharAt += charSequence.charAt(i15) - '0';
                                                            i15++;
                                                        }
                                                    } else {
                                                        i15 = i11;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        if (iDigitCount < 2) {
                                            return ~i15;
                                        }
                                        iCharAt += twoDigits3 * 1000;
                                        i15 += 2;
                                        if (i16 - 2 > 0) {
                                            if (!z11) {
                                                iDigitCount2 = digitCount(charSequence, i15, 3);
                                                if (iDigitCount2 == 0) {
                                                    if (iDigitCount2 < 1) {
                                                        return ~i15;
                                                    }
                                                    i11 = i15 + 1;
                                                    iCharAt += (charSequence.charAt(i15) - '0') * 100;
                                                    if (iDigitCount2 > 1) {
                                                        i15 = i11 + 1;
                                                        iCharAt += (charSequence.charAt(i11) - '0') * 10;
                                                        if (iDigitCount2 > 2) {
                                                            iCharAt += charSequence.charAt(i15) - '0';
                                                            i15++;
                                                        }
                                                    } else {
                                                        i15 = i11;
                                                    }
                                                } else {
                                                    if (iDigitCount2 < 1) {
                                                        return ~i15;
                                                    }
                                                    i11 = i15 + 1;
                                                    iCharAt += (charSequence.charAt(i15) - '0') * 100;
                                                    if (iDigitCount2 > 1) {
                                                        i15 = i11 + 1;
                                                        iCharAt += (charSequence.charAt(i11) - '0') * 10;
                                                        if (iDigitCount2 > 2) {
                                                            iCharAt += charSequence.charAt(i15) - '0';
                                                            i15++;
                                                        }
                                                    } else {
                                                        i15 = i11;
                                                    }
                                                }
                                            } else {
                                                if (charSequence.charAt(i15) != '.') {
                                                }
                                                i15++;
                                                iDigitCount2 = digitCount(charSequence, i15, 3);
                                                if (iDigitCount2 == 0) {
                                                    if (iDigitCount2 < 1) {
                                                        return ~i15;
                                                    }
                                                    i11 = i15 + 1;
                                                    iCharAt += (charSequence.charAt(i15) - '0') * 100;
                                                    if (iDigitCount2 > 1) {
                                                        i15 = i11 + 1;
                                                        iCharAt += (charSequence.charAt(i11) - '0') * 10;
                                                        if (iDigitCount2 > 2) {
                                                            iCharAt += charSequence.charAt(i15) - '0';
                                                            i15++;
                                                        }
                                                    } else {
                                                        i15 = i11;
                                                    }
                                                } else {
                                                    if (iDigitCount2 < 1) {
                                                        return ~i15;
                                                    }
                                                    i11 = i15 + 1;
                                                    iCharAt += (charSequence.charAt(i15) - '0') * 100;
                                                    if (iDigitCount2 > 1) {
                                                        i15 = i11 + 1;
                                                        iCharAt += (charSequence.charAt(i11) - '0') * 10;
                                                        if (iDigitCount2 > 2) {
                                                            iCharAt += charSequence.charAt(i15) - '0';
                                                            i15++;
                                                        }
                                                    } else {
                                                        i15 = i11;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return ~i15;
                    }
                }
                if (z10) {
                    iCharAt = -iCharAt;
                }
                dateTimeParserBucket.setOffset(Integer.valueOf(iCharAt));
                return i15;
            }
            return ~i13;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j10, Chronology chronology, int i10, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            String str;
            if (dateTimeZone == null) {
                return;
            }
            if (i10 == 0 && (str = this.iZeroOffsetPrintText) != null) {
                appendable.append(str);
                return;
            }
            if (i10 >= 0) {
                appendable.append('+');
            } else {
                appendable.append(CoreConstants.DASH_CHAR);
                i10 = -i10;
            }
            int i11 = i10 / DateTimeConstants.MILLIS_PER_HOUR;
            FormatUtils.appendPaddedInteger(appendable, i11, 2);
            if (this.iMaxFields == 1) {
                return;
            }
            int i12 = i10 - (i11 * DateTimeConstants.MILLIS_PER_HOUR);
            if (i12 != 0 || this.iMinFields > 1) {
                int i13 = i12 / DateTimeConstants.MILLIS_PER_MINUTE;
                if (this.iShowSeparators) {
                    appendable.append(CoreConstants.COLON_CHAR);
                }
                FormatUtils.appendPaddedInteger(appendable, i13, 2);
                if (this.iMaxFields == 2) {
                    return;
                }
                int i14 = i12 - (i13 * DateTimeConstants.MILLIS_PER_MINUTE);
                if (i14 != 0 || this.iMinFields > 2) {
                    int i15 = i14 / 1000;
                    if (this.iShowSeparators) {
                        appendable.append(CoreConstants.COLON_CHAR);
                    }
                    FormatUtils.appendPaddedInteger(appendable, i15, 2);
                    if (this.iMaxFields == 3) {
                        return;
                    }
                    int i16 = i14 - (i15 * 1000);
                    if (i16 != 0 || this.iMinFields > 3) {
                        if (this.iShowSeparators) {
                            appendable.append(CoreConstants.DOT);
                        }
                        FormatUtils.appendPaddedInteger(appendable, i16, 3);
                    }
                }
            }
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
        }
    }

    public static class TwoDigitYear implements InternalPrinter, InternalParser {
        private final boolean iLenientParse;
        private final int iPivot;
        private final DateTimeFieldType iType;

        public TwoDigitYear(DateTimeFieldType dateTimeFieldType, int i10, boolean z10) {
            this.iType = dateTimeFieldType;
            this.iPivot = i10;
            this.iLenientParse = z10;
        }

        private int getTwoDigitYear(long j10, Chronology chronology) {
            try {
                int i10 = this.iType.getField(chronology).get(j10);
                if (i10 < 0) {
                    i10 = -i10;
                }
                return i10 % 100;
            } catch (RuntimeException unused) {
                return -1;
            }
        }

        private int getTwoDigitYear(ReadablePartial readablePartial) {
            if (!readablePartial.isSupported(this.iType)) {
                return -1;
            }
            try {
                int i10 = readablePartial.get(this.iType);
                if (i10 < 0) {
                    i10 = -i10;
                }
                return i10 % 100;
            } catch (RuntimeException unused) {
                return -1;
            }
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return this.iLenientParse ? 4 : 2;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return 2;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i10) {
            int i11;
            int i12;
            int length = charSequence.length() - i10;
            if (this.iLenientParse) {
                int i13 = 0;
                boolean z10 = false;
                boolean z11 = false;
                while (i13 < length) {
                    char cCharAt = charSequence.charAt(i10 + i13);
                    if (i13 == 0 && (cCharAt == '-' || cCharAt == '+')) {
                        z11 = cCharAt == '-';
                        if (z11) {
                            i13++;
                        } else {
                            i10++;
                            length--;
                        }
                        z10 = true;
                    } else {
                        if (cCharAt < '0' || cCharAt > '9') {
                            break;
                        }
                        i13++;
                    }
                }
                if (i13 == 0) {
                    return ~i10;
                }
                if (z10 || i13 != 2) {
                    if (i13 >= 9) {
                        i11 = i13 + i10;
                        i12 = Integer.parseInt(charSequence.subSequence(i10, i11).toString());
                    } else {
                        int i14 = z11 ? i10 + 1 : i10;
                        int i15 = i14 + 1;
                        try {
                            int iCharAt = charSequence.charAt(i14) - '0';
                            i11 = i13 + i10;
                            while (i15 < i11) {
                                int iCharAt2 = (charSequence.charAt(i15) + ((iCharAt << 3) + (iCharAt << 1))) - 48;
                                i15++;
                                iCharAt = iCharAt2;
                            }
                            i12 = z11 ? -iCharAt : iCharAt;
                        } catch (StringIndexOutOfBoundsException unused) {
                            return ~i10;
                        }
                    }
                    dateTimeParserBucket.saveField(this.iType, i12);
                    return i11;
                }
            } else if (Math.min(2, length) < 2) {
                return ~i10;
            }
            char cCharAt2 = charSequence.charAt(i10);
            if (cCharAt2 < '0' || cCharAt2 > '9') {
                return ~i10;
            }
            int i16 = cCharAt2 - '0';
            char cCharAt3 = charSequence.charAt(i10 + 1);
            if (cCharAt3 < '0' || cCharAt3 > '9') {
                return ~i10;
            }
            int i17 = (((i16 << 3) + (i16 << 1)) + cCharAt3) - 48;
            int iIntValue = this.iPivot;
            if (dateTimeParserBucket.getPivotYear() != null) {
                iIntValue = dateTimeParserBucket.getPivotYear().intValue();
            }
            int i18 = iIntValue - 50;
            int i19 = i18 >= 0 ? i18 % 100 : ((i18 + 1) % 100) + 99;
            dateTimeParserBucket.saveField(this.iType, ((i18 + (i17 < i19 ? 100 : 0)) - i19) + i17);
            return i10 + 2;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j10, Chronology chronology, int i10, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            int twoDigitYear = getTwoDigitYear(j10, chronology);
            if (twoDigitYear >= 0) {
                FormatUtils.appendPaddedInteger(appendable, twoDigitYear, 2);
            } else {
                appendable.append((char) 65533);
                appendable.append((char) 65533);
            }
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            int twoDigitYear = getTwoDigitYear(readablePartial);
            if (twoDigitYear >= 0) {
                FormatUtils.appendPaddedInteger(appendable, twoDigitYear, 2);
            } else {
                appendable.append((char) 65533);
                appendable.append((char) 65533);
            }
        }
    }

    public static class UnpaddedNumber extends NumberFormatter {
        public UnpaddedNumber(DateTimeFieldType dateTimeFieldType, int i10, boolean z10) {
            super(dateTimeFieldType, i10, z10);
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return this.iMaxParsedDigits;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j10, Chronology chronology, int i10, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            try {
                FormatUtils.appendUnpaddedInteger(appendable, this.iFieldType.getField(chronology).get(j10));
            } catch (RuntimeException unused) {
                appendable.append((char) 65533);
            }
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            if (readablePartial.isSupported(this.iFieldType)) {
                try {
                    FormatUtils.appendUnpaddedInteger(appendable, readablePartial.get(this.iFieldType));
                    return;
                } catch (RuntimeException unused) {
                }
            }
            appendable.append((char) 65533);
        }
    }

    private DateTimeFormatterBuilder append0(Object obj) {
        this.iFormatter = null;
        this.iElementPairs.add(obj);
        this.iElementPairs.add(obj);
        return this;
    }

    private DateTimeFormatterBuilder append0(InternalPrinter internalPrinter, InternalParser internalParser) {
        this.iFormatter = null;
        this.iElementPairs.add(internalPrinter);
        this.iElementPairs.add(internalParser);
        return this;
    }

    public static void appendUnknownString(Appendable appendable, int i10) throws IOException {
        while (true) {
            i10--;
            if (i10 < 0) {
                return;
            } else {
                appendable.append((char) 65533);
            }
        }
    }

    private void checkParser(DateTimeParser dateTimeParser) {
        if (dateTimeParser == null) {
            throw new IllegalArgumentException("No parser supplied");
        }
    }

    private void checkPrinter(DateTimePrinter dateTimePrinter) {
        if (dateTimePrinter == null) {
            throw new IllegalArgumentException("No printer supplied");
        }
    }

    public static boolean csStartsWith(CharSequence charSequence, int i10, String str) {
        int length = str.length();
        if (charSequence.length() - i10 < length) {
            return false;
        }
        for (int i11 = 0; i11 < length; i11++) {
            if (charSequence.charAt(i10 + i11) != str.charAt(i11)) {
                return false;
            }
        }
        return true;
    }

    public static boolean csStartsWithIgnoreCase(CharSequence charSequence, int i10, String str) {
        char upperCase;
        char upperCase2;
        int length = str.length();
        if (charSequence.length() - i10 < length) {
            return false;
        }
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = charSequence.charAt(i10 + i11);
            char cCharAt2 = str.charAt(i11);
            if (cCharAt != cCharAt2 && (upperCase = Character.toUpperCase(cCharAt)) != (upperCase2 = Character.toUpperCase(cCharAt2)) && Character.toLowerCase(upperCase) != Character.toLowerCase(upperCase2)) {
                return false;
            }
        }
        return true;
    }

    private Object getFormatter() {
        Object composite = this.iFormatter;
        if (composite == null) {
            if (this.iElementPairs.size() == 2) {
                Object obj = this.iElementPairs.get(0);
                Object obj2 = this.iElementPairs.get(1);
                if (obj == null) {
                    composite = obj2;
                } else if (obj == obj2 || obj2 == null) {
                    composite = obj;
                }
            }
            if (composite == null) {
                composite = new Composite(this.iElementPairs);
            }
            this.iFormatter = composite;
        }
        return composite;
    }

    private boolean isFormatter(Object obj) {
        return isPrinter(obj) || isParser(obj);
    }

    private boolean isParser(Object obj) {
        if (!(obj instanceof InternalParser)) {
            return false;
        }
        if (obj instanceof Composite) {
            return ((Composite) obj).isParser();
        }
        return true;
    }

    private boolean isPrinter(Object obj) {
        if (!(obj instanceof InternalPrinter)) {
            return false;
        }
        if (obj instanceof Composite) {
            return ((Composite) obj).isPrinter();
        }
        return true;
    }

    public DateTimeFormatterBuilder append(DateTimeFormatter dateTimeFormatter) {
        if (dateTimeFormatter != null) {
            return append0(dateTimeFormatter.getPrinter0(), dateTimeFormatter.getParser0());
        }
        throw new IllegalArgumentException("No formatter supplied");
    }

    public DateTimeFormatterBuilder append(DateTimeParser dateTimeParser) {
        checkParser(dateTimeParser);
        return append0(null, DateTimeParserInternalParser.of(dateTimeParser));
    }

    public DateTimeFormatterBuilder append(DateTimePrinter dateTimePrinter) {
        checkPrinter(dateTimePrinter);
        return append0(DateTimePrinterInternalPrinter.of(dateTimePrinter), null);
    }

    public DateTimeFormatterBuilder append(DateTimePrinter dateTimePrinter, DateTimeParser dateTimeParser) {
        checkPrinter(dateTimePrinter);
        checkParser(dateTimeParser);
        return append0(DateTimePrinterInternalPrinter.of(dateTimePrinter), DateTimeParserInternalParser.of(dateTimeParser));
    }

    public DateTimeFormatterBuilder append(DateTimePrinter dateTimePrinter, DateTimeParser[] dateTimeParserArr) {
        InternalPrinter internalPrinterOf;
        InternalParser matchingParser;
        if (dateTimePrinter != null) {
            checkPrinter(dateTimePrinter);
        }
        if (dateTimeParserArr == null) {
            throw new IllegalArgumentException("No parsers supplied");
        }
        int length = dateTimeParserArr.length;
        int i10 = 0;
        if (length != 1) {
            InternalParser[] internalParserArr = new InternalParser[length];
            while (i10 < length - 1) {
                InternalParser internalParserOf = DateTimeParserInternalParser.of(dateTimeParserArr[i10]);
                internalParserArr[i10] = internalParserOf;
                if (internalParserOf == null) {
                    throw new IllegalArgumentException("Incomplete parser array");
                }
                i10++;
            }
            internalParserArr[i10] = DateTimeParserInternalParser.of(dateTimeParserArr[i10]);
            internalPrinterOf = DateTimePrinterInternalPrinter.of(dateTimePrinter);
            matchingParser = new MatchingParser(internalParserArr);
        } else {
            if (dateTimeParserArr[0] == null) {
                throw new IllegalArgumentException("No parser supplied");
            }
            internalPrinterOf = DateTimePrinterInternalPrinter.of(dateTimePrinter);
            matchingParser = DateTimeParserInternalParser.of(dateTimeParserArr[0]);
        }
        return append0(internalPrinterOf, matchingParser);
    }

    public DateTimeFormatterBuilder appendCenturyOfEra(int i10, int i11) {
        return appendSignedDecimal(DateTimeFieldType.centuryOfEra(), i10, i11);
    }

    public DateTimeFormatterBuilder appendClockhourOfDay(int i10) {
        return appendDecimal(DateTimeFieldType.clockhourOfDay(), i10, 2);
    }

    public DateTimeFormatterBuilder appendClockhourOfHalfday(int i10) {
        return appendDecimal(DateTimeFieldType.clockhourOfHalfday(), i10, 2);
    }

    public DateTimeFormatterBuilder appendDayOfMonth(int i10) {
        return appendDecimal(DateTimeFieldType.dayOfMonth(), i10, 2);
    }

    public DateTimeFormatterBuilder appendDayOfWeek(int i10) {
        return appendDecimal(DateTimeFieldType.dayOfWeek(), i10, 1);
    }

    public DateTimeFormatterBuilder appendDayOfWeekShortText() {
        return appendShortText(DateTimeFieldType.dayOfWeek());
    }

    public DateTimeFormatterBuilder appendDayOfWeekText() {
        return appendText(DateTimeFieldType.dayOfWeek());
    }

    public DateTimeFormatterBuilder appendDayOfYear(int i10) {
        return appendDecimal(DateTimeFieldType.dayOfYear(), i10, 3);
    }

    public DateTimeFormatterBuilder appendDecimal(DateTimeFieldType dateTimeFieldType, int i10, int i11) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("Field type must not be null");
        }
        if (i11 < i10) {
            i11 = i10;
        }
        if (i10 < 0 || i11 <= 0) {
            throw new IllegalArgumentException();
        }
        return i10 <= 1 ? append0(new UnpaddedNumber(dateTimeFieldType, i11, false)) : append0(new PaddedNumber(dateTimeFieldType, i11, false, i10));
    }

    public DateTimeFormatterBuilder appendEraText() {
        return appendText(DateTimeFieldType.era());
    }

    public DateTimeFormatterBuilder appendFixedDecimal(DateTimeFieldType dateTimeFieldType, int i10) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("Field type must not be null");
        }
        if (i10 > 0) {
            return append0(new FixedNumber(dateTimeFieldType, i10, false));
        }
        throw new IllegalArgumentException(android.support.v4.media.a.a("Illegal number of digits: ", i10));
    }

    public DateTimeFormatterBuilder appendFixedSignedDecimal(DateTimeFieldType dateTimeFieldType, int i10) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("Field type must not be null");
        }
        if (i10 > 0) {
            return append0(new FixedNumber(dateTimeFieldType, i10, true));
        }
        throw new IllegalArgumentException(android.support.v4.media.a.a("Illegal number of digits: ", i10));
    }

    public DateTimeFormatterBuilder appendFraction(DateTimeFieldType dateTimeFieldType, int i10, int i11) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("Field type must not be null");
        }
        if (i11 < i10) {
            i11 = i10;
        }
        if (i10 < 0 || i11 <= 0) {
            throw new IllegalArgumentException();
        }
        return append0(new Fraction(dateTimeFieldType, i10, i11));
    }

    public DateTimeFormatterBuilder appendFractionOfDay(int i10, int i11) {
        return appendFraction(DateTimeFieldType.dayOfYear(), i10, i11);
    }

    public DateTimeFormatterBuilder appendFractionOfHour(int i10, int i11) {
        return appendFraction(DateTimeFieldType.hourOfDay(), i10, i11);
    }

    public DateTimeFormatterBuilder appendFractionOfMinute(int i10, int i11) {
        return appendFraction(DateTimeFieldType.minuteOfDay(), i10, i11);
    }

    public DateTimeFormatterBuilder appendFractionOfSecond(int i10, int i11) {
        return appendFraction(DateTimeFieldType.secondOfDay(), i10, i11);
    }

    public DateTimeFormatterBuilder appendHalfdayOfDayText() {
        return appendText(DateTimeFieldType.halfdayOfDay());
    }

    public DateTimeFormatterBuilder appendHourOfDay(int i10) {
        return appendDecimal(DateTimeFieldType.hourOfDay(), i10, 2);
    }

    public DateTimeFormatterBuilder appendHourOfHalfday(int i10) {
        return appendDecimal(DateTimeFieldType.hourOfHalfday(), i10, 2);
    }

    public DateTimeFormatterBuilder appendLiteral(char c10) {
        return append0(new CharacterLiteral(c10));
    }

    public DateTimeFormatterBuilder appendLiteral(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Literal must not be null");
        }
        int length = str.length();
        if (length != 0) {
            return append0(length != 1 ? new StringLiteral(str) : new CharacterLiteral(str.charAt(0)));
        }
        return this;
    }

    public DateTimeFormatterBuilder appendMillisOfDay(int i10) {
        return appendDecimal(DateTimeFieldType.millisOfDay(), i10, 8);
    }

    public DateTimeFormatterBuilder appendMillisOfSecond(int i10) {
        return appendDecimal(DateTimeFieldType.millisOfSecond(), i10, 3);
    }

    public DateTimeFormatterBuilder appendMinuteOfDay(int i10) {
        return appendDecimal(DateTimeFieldType.minuteOfDay(), i10, 4);
    }

    public DateTimeFormatterBuilder appendMinuteOfHour(int i10) {
        return appendDecimal(DateTimeFieldType.minuteOfHour(), i10, 2);
    }

    public DateTimeFormatterBuilder appendMonthOfYear(int i10) {
        return appendDecimal(DateTimeFieldType.monthOfYear(), i10, 2);
    }

    public DateTimeFormatterBuilder appendMonthOfYearShortText() {
        return appendShortText(DateTimeFieldType.monthOfYear());
    }

    public DateTimeFormatterBuilder appendMonthOfYearText() {
        return appendText(DateTimeFieldType.monthOfYear());
    }

    public DateTimeFormatterBuilder appendOptional(DateTimeParser dateTimeParser) {
        checkParser(dateTimeParser);
        return append0(null, new MatchingParser(new InternalParser[]{DateTimeParserInternalParser.of(dateTimeParser), null}));
    }

    public DateTimeFormatterBuilder appendPattern(String str) {
        DateTimeFormat.appendPatternTo(this, str);
        return this;
    }

    public DateTimeFormatterBuilder appendSecondOfDay(int i10) {
        return appendDecimal(DateTimeFieldType.secondOfDay(), i10, 5);
    }

    public DateTimeFormatterBuilder appendSecondOfMinute(int i10) {
        return appendDecimal(DateTimeFieldType.secondOfMinute(), i10, 2);
    }

    public DateTimeFormatterBuilder appendShortText(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType != null) {
            return append0(new TextField(dateTimeFieldType, true));
        }
        throw new IllegalArgumentException("Field type must not be null");
    }

    public DateTimeFormatterBuilder appendSignedDecimal(DateTimeFieldType dateTimeFieldType, int i10, int i11) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("Field type must not be null");
        }
        if (i11 < i10) {
            i11 = i10;
        }
        if (i10 < 0 || i11 <= 0) {
            throw new IllegalArgumentException();
        }
        return i10 <= 1 ? append0(new UnpaddedNumber(dateTimeFieldType, i11, true)) : append0(new PaddedNumber(dateTimeFieldType, i11, true, i10));
    }

    public DateTimeFormatterBuilder appendText(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType != null) {
            return append0(new TextField(dateTimeFieldType, false));
        }
        throw new IllegalArgumentException("Field type must not be null");
    }

    public DateTimeFormatterBuilder appendTimeZoneId() {
        TimeZoneId timeZoneId = TimeZoneId.INSTANCE;
        return append0(timeZoneId, timeZoneId);
    }

    public DateTimeFormatterBuilder appendTimeZoneName() {
        return append0(new TimeZoneName(0, null), null);
    }

    public DateTimeFormatterBuilder appendTimeZoneName(Map<String, DateTimeZone> map) {
        TimeZoneName timeZoneName = new TimeZoneName(0, map);
        return append0(timeZoneName, timeZoneName);
    }

    public DateTimeFormatterBuilder appendTimeZoneOffset(String str, String str2, boolean z10, int i10, int i11) {
        return append0(new TimeZoneOffset(str, str2, z10, i10, i11));
    }

    public DateTimeFormatterBuilder appendTimeZoneOffset(String str, boolean z10, int i10, int i11) {
        return append0(new TimeZoneOffset(str, str, z10, i10, i11));
    }

    public DateTimeFormatterBuilder appendTimeZoneShortName() {
        return append0(new TimeZoneName(1, null), null);
    }

    public DateTimeFormatterBuilder appendTimeZoneShortName(Map<String, DateTimeZone> map) {
        TimeZoneName timeZoneName = new TimeZoneName(1, map);
        return append0(timeZoneName, timeZoneName);
    }

    public DateTimeFormatterBuilder appendTwoDigitWeekyear(int i10) {
        return appendTwoDigitWeekyear(i10, false);
    }

    public DateTimeFormatterBuilder appendTwoDigitWeekyear(int i10, boolean z10) {
        return append0(new TwoDigitYear(DateTimeFieldType.weekyear(), i10, z10));
    }

    public DateTimeFormatterBuilder appendTwoDigitYear(int i10) {
        return appendTwoDigitYear(i10, false);
    }

    public DateTimeFormatterBuilder appendTwoDigitYear(int i10, boolean z10) {
        return append0(new TwoDigitYear(DateTimeFieldType.year(), i10, z10));
    }

    public DateTimeFormatterBuilder appendWeekOfWeekyear(int i10) {
        return appendDecimal(DateTimeFieldType.weekOfWeekyear(), i10, 2);
    }

    public DateTimeFormatterBuilder appendWeekyear(int i10, int i11) {
        return appendSignedDecimal(DateTimeFieldType.weekyear(), i10, i11);
    }

    public DateTimeFormatterBuilder appendYear(int i10, int i11) {
        return appendSignedDecimal(DateTimeFieldType.year(), i10, i11);
    }

    public DateTimeFormatterBuilder appendYearOfCentury(int i10, int i11) {
        return appendDecimal(DateTimeFieldType.yearOfCentury(), i10, i11);
    }

    public DateTimeFormatterBuilder appendYearOfEra(int i10, int i11) {
        return appendDecimal(DateTimeFieldType.yearOfEra(), i10, i11);
    }

    public boolean canBuildFormatter() {
        return isFormatter(getFormatter());
    }

    public boolean canBuildParser() {
        return isParser(getFormatter());
    }

    public boolean canBuildPrinter() {
        return isPrinter(getFormatter());
    }

    public void clear() {
        this.iFormatter = null;
        this.iElementPairs.clear();
    }

    public DateTimeFormatter toFormatter() {
        Object formatter = getFormatter();
        InternalPrinter internalPrinter = isPrinter(formatter) ? (InternalPrinter) formatter : null;
        InternalParser internalParser = isParser(formatter) ? (InternalParser) formatter : null;
        if (internalPrinter == null && internalParser == null) {
            throw new UnsupportedOperationException("Both printing and parsing not supported");
        }
        return new DateTimeFormatter(internalPrinter, internalParser);
    }

    public DateTimeParser toParser() {
        Object formatter = getFormatter();
        if (isParser(formatter)) {
            return InternalParserDateTimeParser.of((InternalParser) formatter);
        }
        throw new UnsupportedOperationException("Parsing is not supported");
    }

    public DateTimePrinter toPrinter() {
        Object formatter = getFormatter();
        if (isPrinter(formatter)) {
            return InternalPrinterDateTimePrinter.of((InternalPrinter) formatter);
        }
        throw new UnsupportedOperationException("Printing is not supported");
    }
}
