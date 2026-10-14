package org.joda.time.format;

import ch.qos.logback.core.CoreConstants;
import i.f;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadablePartial;

/* JADX INFO: loaded from: classes3.dex */
public class DateTimeFormat {
    public static final int DATE = 0;
    public static final int DATETIME = 2;
    public static final int FULL = 0;
    public static final int LONG = 1;
    public static final int MEDIUM = 2;
    public static final int NONE = 4;
    private static final int PATTERN_CACHE_SIZE = 500;
    public static final int SHORT = 3;
    public static final int TIME = 1;
    private static final ConcurrentHashMap<String, DateTimeFormatter> cPatternCache = new ConcurrentHashMap<>();
    private static final AtomicReferenceArray<DateTimeFormatter> cStyleCache = new AtomicReferenceArray<>(25);

    public static class StyleFormatter implements InternalPrinter, InternalParser {
        private static final ConcurrentHashMap<StyleFormatterCacheKey, DateTimeFormatter> cCache = new ConcurrentHashMap<>();
        private final int iDateStyle;
        private final int iTimeStyle;
        private final int iType;

        public StyleFormatter(int i10, int i11, int i12) {
            this.iDateStyle = i10;
            this.iTimeStyle = i11;
            this.iType = i12;
        }

        private DateTimeFormatter getFormatter(Locale locale) {
            if (locale == null) {
                locale = Locale.getDefault();
            }
            StyleFormatterCacheKey styleFormatterCacheKey = new StyleFormatterCacheKey(this.iType, this.iDateStyle, this.iTimeStyle, locale);
            ConcurrentHashMap<StyleFormatterCacheKey, DateTimeFormatter> concurrentHashMap = cCache;
            DateTimeFormatter dateTimeFormatter = concurrentHashMap.get(styleFormatterCacheKey);
            if (dateTimeFormatter != null) {
                return dateTimeFormatter;
            }
            DateTimeFormatter dateTimeFormatterForPattern = DateTimeFormat.forPattern(getPattern(locale));
            DateTimeFormatter dateTimeFormatterPutIfAbsent = concurrentHashMap.putIfAbsent(styleFormatterCacheKey, dateTimeFormatterForPattern);
            return dateTimeFormatterPutIfAbsent != null ? dateTimeFormatterPutIfAbsent : dateTimeFormatterForPattern;
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return 40;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return 40;
        }

        public String getPattern(Locale locale) {
            DateFormat dateInstance;
            int i10 = this.iType;
            if (i10 == 0) {
                dateInstance = DateFormat.getDateInstance(this.iDateStyle, locale);
            } else if (i10 != 1) {
                dateInstance = i10 != 2 ? null : DateFormat.getDateTimeInstance(this.iDateStyle, this.iTimeStyle, locale);
            } else {
                dateInstance = DateFormat.getTimeInstance(this.iTimeStyle, locale);
            }
            if (dateInstance instanceof SimpleDateFormat) {
                return ((SimpleDateFormat) dateInstance).toPattern();
            }
            throw new IllegalArgumentException("No datetime pattern for locale: " + locale);
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i10) {
            return getFormatter(dateTimeParserBucket.getLocale()).getParser0().parseInto(dateTimeParserBucket, charSequence, i10);
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j10, Chronology chronology, int i10, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            getFormatter(locale).getPrinter0().printTo(appendable, j10, chronology, i10, dateTimeZone, locale);
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            getFormatter(locale).getPrinter0().printTo(appendable, readablePartial, locale);
        }
    }

    public static class StyleFormatterCacheKey {
        private final int combinedTypeAndStyle;
        private final Locale locale;

        public StyleFormatterCacheKey(int i10, int i11, int i12, Locale locale) {
            this.locale = locale;
            this.combinedTypeAndStyle = i10 + (i11 << 4) + (i12 << 8);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof StyleFormatterCacheKey)) {
                return false;
            }
            StyleFormatterCacheKey styleFormatterCacheKey = (StyleFormatterCacheKey) obj;
            if (this.combinedTypeAndStyle != styleFormatterCacheKey.combinedTypeAndStyle) {
                return false;
            }
            Locale locale = this.locale;
            Locale locale2 = styleFormatterCacheKey.locale;
            if (locale == null) {
                if (locale2 != null) {
                    return false;
                }
            } else if (!locale.equals(locale2)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i10 = (this.combinedTypeAndStyle + 31) * 31;
            Locale locale = this.locale;
            return i10 + (locale == null ? 0 : locale.hashCode());
        }
    }

    public static void appendPatternTo(DateTimeFormatterBuilder dateTimeFormatterBuilder, String str) {
        parsePatternTo(dateTimeFormatterBuilder, str);
    }

    private static DateTimeFormatter createDateTimeFormatter(int i10, int i11) {
        int i12;
        if (i10 == 4) {
            i12 = 1;
        } else {
            i12 = i11 == 4 ? 0 : 2;
        }
        StyleFormatter styleFormatter = new StyleFormatter(i10, i11, i12);
        return new DateTimeFormatter(styleFormatter, styleFormatter);
    }

    private static DateTimeFormatter createFormatterForPattern(String str) {
        DateTimeFormatter dateTimeFormatterPutIfAbsent;
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Invalid pattern specification");
        }
        ConcurrentHashMap<String, DateTimeFormatter> concurrentHashMap = cPatternCache;
        DateTimeFormatter dateTimeFormatter = concurrentHashMap.get(str);
        if (dateTimeFormatter != null) {
            return dateTimeFormatter;
        }
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        parsePatternTo(dateTimeFormatterBuilder, str);
        DateTimeFormatter formatter = dateTimeFormatterBuilder.toFormatter();
        return (concurrentHashMap.size() >= PATTERN_CACHE_SIZE || (dateTimeFormatterPutIfAbsent = concurrentHashMap.putIfAbsent(str, formatter)) == null) ? formatter : dateTimeFormatterPutIfAbsent;
    }

    private static DateTimeFormatter createFormatterForStyle(String str) {
        if (str == null || str.length() != 2) {
            throw new IllegalArgumentException(f.a("Invalid style specification: ", str));
        }
        int iSelectStyle = selectStyle(str.charAt(0));
        int iSelectStyle2 = selectStyle(str.charAt(1));
        if (iSelectStyle == 4 && iSelectStyle2 == 4) {
            throw new IllegalArgumentException("Style '--' is invalid");
        }
        return createFormatterForStyleIndex(iSelectStyle, iSelectStyle2);
    }

    private static DateTimeFormatter createFormatterForStyleIndex(int i10, int i11) {
        int i12 = (i10 << 2) + i10 + i11;
        AtomicReferenceArray<DateTimeFormatter> atomicReferenceArray = cStyleCache;
        if (i12 >= atomicReferenceArray.length()) {
            return createDateTimeFormatter(i10, i11);
        }
        DateTimeFormatter dateTimeFormatter = atomicReferenceArray.get(i12);
        if (dateTimeFormatter != null) {
            return dateTimeFormatter;
        }
        DateTimeFormatter dateTimeFormatterCreateDateTimeFormatter = createDateTimeFormatter(i10, i11);
        return !atomicReferenceArray.compareAndSet(i12, null, dateTimeFormatterCreateDateTimeFormatter) ? atomicReferenceArray.get(i12) : dateTimeFormatterCreateDateTimeFormatter;
    }

    public static DateTimeFormatter forPattern(String str) {
        return createFormatterForPattern(str);
    }

    public static DateTimeFormatter forStyle(String str) {
        return createFormatterForStyle(str);
    }

    public static DateTimeFormatter fullDate() {
        return createFormatterForStyleIndex(0, 4);
    }

    public static DateTimeFormatter fullDateTime() {
        return createFormatterForStyleIndex(0, 0);
    }

    public static DateTimeFormatter fullTime() {
        return createFormatterForStyleIndex(4, 0);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0013 A[RETURN] */
    private static boolean isNumericToken(String str) {
        int length = str.length();
        if (length > 0) {
            switch (str.charAt(0)) {
                case 'C':
                case 'D':
                case 'F':
                case 'H':
                case 'K':
                case 'S':
                case 'W':
                case 'Y':
                case 'c':
                case 'd':
                case 'e':
                case 'h':
                case 'k':
                case 'm':
                case 's':
                case 'w':
                case 'x':
                case 'y':
                    return true;
                case 'M':
                    if (length <= 2) {
                        return true;
                    }
                    break;
            }
        }
        return false;
    }

    public static DateTimeFormatter longDate() {
        return createFormatterForStyleIndex(1, 4);
    }

    public static DateTimeFormatter longDateTime() {
        return createFormatterForStyleIndex(1, 1);
    }

    public static DateTimeFormatter longTime() {
        return createFormatterForStyleIndex(4, 1);
    }

    public static DateTimeFormatter mediumDate() {
        return createFormatterForStyleIndex(2, 4);
    }

    public static DateTimeFormatter mediumDateTime() {
        return createFormatterForStyleIndex(2, 2);
    }

    public static DateTimeFormatter mediumTime() {
        return createFormatterForStyleIndex(4, 2);
    }

    /* JADX WARN: Code duplicated, block: B:136:0x017b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00db  */
    /* JADX WARN: Code duplicated, block: B:67:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:68:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:70:0x0101  */
    /* JADX WARN: Code duplicated, block: B:72:0x0110  */
    /* JADX WARN: Code duplicated, block: B:75:0x0118 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x011a  */
    /* JADX WARN: Code duplicated, block: B:79:0x0120  */
    /* JADX WARN: Code duplicated, block: B:80:0x0124  */
    /* JADX WARN: Code duplicated, block: B:81:0x0128  */
    /* JADX WARN: Switch 'out' block B:59:0x00bc for B:37:0x005d already processed. Defaulting to fallback option. */
    private static void parsePatternTo(DateTimeFormatterBuilder dateTimeFormatterBuilder, String str) {
        int i10;
        boolean z10;
        String str2;
        boolean z11;
        int length = str.length();
        int[] iArr = new int[1];
        int i11 = 0;
        while (i11 < length) {
            iArr[0] = i11;
            String token = parseToken(str, iArr);
            int i12 = iArr[0];
            int length2 = token.length();
            if (length2 == 0) {
                return;
            }
            char cCharAt = token.charAt(0);
            if (cCharAt == '\'') {
                String strSubstring = token.substring(1);
                if (strSubstring.length() == 1) {
                    dateTimeFormatterBuilder.appendLiteral(strSubstring.charAt(0));
                } else {
                    dateTimeFormatterBuilder.appendLiteral(new String(strSubstring));
                }
            } else if (cCharAt == 'K') {
                dateTimeFormatterBuilder.appendHourOfHalfday(length2);
            } else if (cCharAt != 'M') {
                if (cCharAt == 'S') {
                    dateTimeFormatterBuilder.appendFractionOfSecond(length2, length2);
                } else if (cCharAt == 'a') {
                    dateTimeFormatterBuilder.appendHalfdayOfDayText();
                } else if (cCharAt == 'h') {
                    dateTimeFormatterBuilder.appendClockhourOfHalfday(length2);
                } else if (cCharAt == 'k') {
                    dateTimeFormatterBuilder.appendClockhourOfDay(length2);
                } else if (cCharAt == 'm') {
                    dateTimeFormatterBuilder.appendMinuteOfHour(length2);
                } else if (cCharAt == 's') {
                    dateTimeFormatterBuilder.appendSecondOfMinute(length2);
                } else if (cCharAt == 'G') {
                    dateTimeFormatterBuilder.appendEraText();
                } else if (cCharAt == 'H') {
                    dateTimeFormatterBuilder.appendHourOfDay(length2);
                } else if (cCharAt == 'Y') {
                    if (length2 != 2) {
                        if (i12 + 1 < length) {
                            iArr[0] = iArr[0] + 1;
                            z10 = !isNumericToken(parseToken(str, iArr));
                            iArr[0] = iArr[0] - 1;
                        } else {
                            z10 = true;
                        }
                        if (cCharAt == 'x') {
                            dateTimeFormatterBuilder.appendTwoDigitYear(new DateTime().getYear() - 30, z10);
                        } else {
                            dateTimeFormatterBuilder.appendTwoDigitWeekyear(new DateTime().getWeekyear() - 30, z10);
                        }
                    } else {
                        i10 = 9;
                        if (i12 + 1 < length) {
                            iArr[0] = iArr[0] + 1;
                            i10 = isNumericToken(parseToken(str, iArr)) ? length2 : 9;
                            iArr[0] = iArr[0] - 1;
                        }
                        if (cCharAt != 'Y') {
                            dateTimeFormatterBuilder.appendYearOfEra(length2, i10);
                        } else if (cCharAt != 'x') {
                            dateTimeFormatterBuilder.appendWeekyear(length2, i10);
                        } else if (cCharAt != 'y') {
                            dateTimeFormatterBuilder.appendYear(length2, i10);
                        }
                    }
                } else if (cCharAt == 'Z') {
                    if (length2 == 1) {
                        str2 = null;
                        z11 = false;
                    } else if (length2 == 2) {
                        str2 = null;
                        z11 = true;
                    } else {
                        dateTimeFormatterBuilder.appendTimeZoneId();
                    }
                    dateTimeFormatterBuilder.appendTimeZoneOffset(str2, "Z", z11, 2, 2);
                } else if (cCharAt == 'd') {
                    dateTimeFormatterBuilder.appendDayOfMonth(length2);
                } else if (cCharAt != 'e') {
                    switch (cCharAt) {
                        case 'C':
                            dateTimeFormatterBuilder.appendCenturyOfEra(length2, length2);
                            continue;
                        case 'D':
                            dateTimeFormatterBuilder.appendDayOfYear(length2);
                            continue;
                        case 'E':
                            if (length2 < 4) {
                                dateTimeFormatterBuilder.appendDayOfWeekShortText();
                            } else {
                                dateTimeFormatterBuilder.appendDayOfWeekText();
                                continue;
                            }
                            break;
                        default:
                            switch (cCharAt) {
                                case 'w':
                                    dateTimeFormatterBuilder.appendWeekOfWeekyear(length2);
                                    break;
                                case 'x':
                                case 'y':
                                    if (length2 != 2) {
                                        i10 = 9;
                                        if (i12 + 1 < length) {
                                            iArr[0] = iArr[0] + 1;
                                            if (isNumericToken(parseToken(str, iArr))) {
                                            }
                                            iArr[0] = iArr[0] - 1;
                                        }
                                        if (cCharAt != 'Y') {
                                            dateTimeFormatterBuilder.appendYearOfEra(length2, i10);
                                        } else if (cCharAt != 'x') {
                                            dateTimeFormatterBuilder.appendWeekyear(length2, i10);
                                        } else if (cCharAt != 'y') {
                                            dateTimeFormatterBuilder.appendYear(length2, i10);
                                        }
                                    } else {
                                        if (i12 + 1 < length) {
                                            iArr[0] = iArr[0] + 1;
                                            z10 = !isNumericToken(parseToken(str, iArr));
                                            iArr[0] = iArr[0] - 1;
                                        } else {
                                            z10 = true;
                                        }
                                        if (cCharAt == 'x') {
                                            dateTimeFormatterBuilder.appendTwoDigitWeekyear(new DateTime().getWeekyear() - 30, z10);
                                        } else {
                                            dateTimeFormatterBuilder.appendTwoDigitYear(new DateTime().getYear() - 30, z10);
                                        }
                                    }
                                    break;
                                case 'z':
                                    if (length2 < 4) {
                                        dateTimeFormatterBuilder.appendTimeZoneShortName(null);
                                    } else {
                                        dateTimeFormatterBuilder.appendTimeZoneName();
                                        continue;
                                    }
                                    break;
                                default:
                                    throw new IllegalArgumentException(f.a("Illegal pattern component: ", token));
                            }
                            break;
                    }
                } else {
                    dateTimeFormatterBuilder.appendDayOfWeek(length2);
                }
            } else if (length2 < 3) {
                dateTimeFormatterBuilder.appendMonthOfYear(length2);
            } else if (length2 >= 4) {
                dateTimeFormatterBuilder.appendMonthOfYearText();
            } else {
                dateTimeFormatterBuilder.appendMonthOfYearShortText();
            }
            i11 = i12 + 1;
        }
    }

    private static String parseToken(String str, int[] iArr) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = iArr[0];
        int length = str.length();
        char cCharAt = str.charAt(i10);
        if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
            sb2.append(CoreConstants.SINGLE_QUOTE_CHAR);
            boolean z10 = false;
            while (i10 < length) {
                char cCharAt2 = str.charAt(i10);
                if (cCharAt2 != '\'') {
                    if (!z10 && ((cCharAt2 >= 'A' && cCharAt2 <= 'Z') || (cCharAt2 >= 'a' && cCharAt2 <= 'z'))) {
                        i10--;
                        break;
                    }
                    sb2.append(cCharAt2);
                } else {
                    int i11 = i10 + 1;
                    if (i11 >= length || str.charAt(i11) != '\'') {
                        z10 = !z10;
                    } else {
                        sb2.append(cCharAt2);
                        i10 = i11;
                    }
                }
                i10++;
            }
        } else {
            sb2.append(cCharAt);
            while (true) {
                int i12 = i10 + 1;
                if (i12 >= length || str.charAt(i12) != cCharAt) {
                    break;
                }
                sb2.append(cCharAt);
                i10 = i12;
            }
        }
        iArr[0] = i10;
        return sb2.toString();
    }

    public static String patternForStyle(String str, Locale locale) {
        DateTimeFormatter dateTimeFormatterCreateFormatterForStyle = createFormatterForStyle(str);
        if (locale == null) {
            locale = Locale.getDefault();
        }
        return ((StyleFormatter) dateTimeFormatterCreateFormatterForStyle.getPrinter0()).getPattern(locale);
    }

    private static int selectStyle(char c10) {
        if (c10 == '-') {
            return 4;
        }
        if (c10 == 'F') {
            return 0;
        }
        if (c10 == 'S') {
            return 3;
        }
        if (c10 == 'L') {
            return 1;
        }
        if (c10 == 'M') {
            return 2;
        }
        throw new IllegalArgumentException("Invalid style character: " + c10);
    }

    public static DateTimeFormatter shortDate() {
        return createFormatterForStyleIndex(3, 4);
    }

    public static DateTimeFormatter shortDateTime() {
        return createFormatterForStyleIndex(3, 3);
    }

    public static DateTimeFormatter shortTime() {
        return createFormatterForStyleIndex(4, 3);
    }
}
