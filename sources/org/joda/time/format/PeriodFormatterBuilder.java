package org.joda.time.format;

import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.regex.Pattern;
import org.joda.time.DurationFieldType;
import org.joda.time.PeriodType;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadablePeriod;

/* JADX INFO: loaded from: classes3.dex */
public class PeriodFormatterBuilder {
    private static final int DAYS = 3;
    private static final int HOURS = 4;
    private static final int MAX_FIELD = 9;
    private static final int MILLIS = 7;
    private static final int MINUTES = 5;
    private static final int MONTHS = 1;
    private static final ConcurrentMap<String, Pattern> PATTERNS = new ConcurrentHashMap();
    private static final int PRINT_ZERO_ALWAYS = 4;
    private static final int PRINT_ZERO_IF_SUPPORTED = 3;
    private static final int PRINT_ZERO_NEVER = 5;
    private static final int PRINT_ZERO_RARELY_FIRST = 1;
    private static final int PRINT_ZERO_RARELY_LAST = 2;
    private static final int SECONDS = 6;
    private static final int SECONDS_MILLIS = 8;
    private static final int SECONDS_OPTIONAL_MILLIS = 9;
    private static final int WEEKS = 2;
    private static final int YEARS = 0;
    private List<Object> iElementPairs;
    private FieldFormatter[] iFieldFormatters;
    private int iMaxParsedDigits;
    private int iMinPrintedDigits;
    private boolean iNotParser;
    private boolean iNotPrinter;
    private PeriodFieldAffix iPrefix;
    private int iPrintZeroSetting;
    private boolean iRejectSignedValues;

    public static class Composite implements PeriodPrinter, PeriodParser {
        private final PeriodParser[] iParsers;
        private final PeriodPrinter[] iPrinters;

        public Composite(List<Object> list) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            decompose(list, arrayList, arrayList2);
            if (arrayList.size() <= 0) {
                this.iPrinters = null;
            } else {
                this.iPrinters = (PeriodPrinter[]) arrayList.toArray(new PeriodPrinter[arrayList.size()]);
            }
            if (arrayList2.size() <= 0) {
                this.iParsers = null;
            } else {
                this.iParsers = (PeriodParser[]) arrayList2.toArray(new PeriodParser[arrayList2.size()]);
            }
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
                if (obj instanceof PeriodPrinter) {
                    if (obj instanceof Composite) {
                        addArrayToList(list2, ((Composite) obj).iPrinters);
                    } else {
                        list2.add(obj);
                    }
                }
                Object obj2 = list.get(i10 + 1);
                if (obj2 instanceof PeriodParser) {
                    if (obj2 instanceof Composite) {
                        addArrayToList(list3, ((Composite) obj2).iParsers);
                    } else {
                        list3.add(obj2);
                    }
                }
            }
        }

        @Override // org.joda.time.format.PeriodPrinter
        public int calculatePrintedLength(ReadablePeriod readablePeriod, Locale locale) {
            PeriodPrinter[] periodPrinterArr = this.iPrinters;
            int length = periodPrinterArr.length;
            int iCalculatePrintedLength = 0;
            while (true) {
                length--;
                if (length < 0) {
                    return iCalculatePrintedLength;
                }
                iCalculatePrintedLength += periodPrinterArr[length].calculatePrintedLength(readablePeriod, locale);
            }
        }

        @Override // org.joda.time.format.PeriodPrinter
        public int countFieldsToPrint(ReadablePeriod readablePeriod, int i10, Locale locale) {
            PeriodPrinter[] periodPrinterArr = this.iPrinters;
            int length = periodPrinterArr.length;
            int iCountFieldsToPrint = 0;
            while (iCountFieldsToPrint < i10) {
                length--;
                if (length < 0) {
                    break;
                }
                iCountFieldsToPrint += periodPrinterArr[length].countFieldsToPrint(readablePeriod, Integer.MAX_VALUE, locale);
            }
            return iCountFieldsToPrint;
        }

        @Override // org.joda.time.format.PeriodParser
        public int parseInto(ReadWritablePeriod readWritablePeriod, String str, int i10, Locale locale) {
            PeriodParser[] periodParserArr = this.iParsers;
            if (periodParserArr == null) {
                throw new UnsupportedOperationException();
            }
            int length = periodParserArr.length;
            for (int i11 = 0; i11 < length && i10 >= 0; i11++) {
                i10 = periodParserArr[i11].parseInto(readWritablePeriod, str, i10, locale);
            }
            return i10;
        }

        @Override // org.joda.time.format.PeriodPrinter
        public void printTo(Writer writer, ReadablePeriod readablePeriod, Locale locale) throws IOException {
            for (PeriodPrinter periodPrinter : this.iPrinters) {
                periodPrinter.printTo(writer, readablePeriod, locale);
            }
        }

        @Override // org.joda.time.format.PeriodPrinter
        public void printTo(StringBuffer stringBuffer, ReadablePeriod readablePeriod, Locale locale) {
            for (PeriodPrinter periodPrinter : this.iPrinters) {
                periodPrinter.printTo(stringBuffer, readablePeriod, locale);
            }
        }
    }

    public static class CompositeAffix extends IgnorableAffix {
        private final PeriodFieldAffix iLeft;
        private final String[] iLeftRightCombinations;
        private final PeriodFieldAffix iRight;

        public CompositeAffix(PeriodFieldAffix periodFieldAffix, PeriodFieldAffix periodFieldAffix2) {
            this.iLeft = periodFieldAffix;
            this.iRight = periodFieldAffix2;
            HashSet hashSet = new HashSet();
            for (String str : periodFieldAffix.getAffixes()) {
                for (String str2 : this.iRight.getAffixes()) {
                    hashSet.add(str + str2);
                }
            }
            this.iLeftRightCombinations = (String[]) hashSet.toArray(new String[hashSet.size()]);
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int calculatePrintedLength(int i10) {
            return this.iLeft.calculatePrintedLength(i10) + this.iRight.calculatePrintedLength(i10);
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public String[] getAffixes() {
            return (String[]) this.iLeftRightCombinations.clone();
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int parse(String str, int i10) {
            int i11 = this.iLeft.parse(str, i10);
            return (i11 < 0 || (i11 = this.iRight.parse(str, i11)) < 0 || !matchesOtherAffix(parse(str, i11) - i11, str, i10)) ? i11 : ~i10;
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public void printTo(Writer writer, int i10) throws IOException {
            this.iLeft.printTo(writer, i10);
            this.iRight.printTo(writer, i10);
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public void printTo(StringBuffer stringBuffer, int i10) {
            this.iLeft.printTo(stringBuffer, i10);
            this.iRight.printTo(stringBuffer, i10);
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int scan(String str, int i10) {
            int iScan;
            int iScan2 = this.iLeft.scan(str, i10);
            if (iScan2 < 0 || ((iScan = this.iRight.scan(str, this.iLeft.parse(str, iScan2))) >= 0 && matchesOtherAffix(this.iRight.parse(str, iScan) - iScan2, str, i10))) {
                return ~i10;
            }
            return iScan2 > 0 ? iScan2 : iScan;
        }
    }

    public static class FieldFormatter implements PeriodPrinter, PeriodParser {
        private final FieldFormatter[] iFieldFormatters;
        private final int iFieldType;
        private final int iMaxParsedDigits;
        private final int iMinPrintedDigits;
        private final PeriodFieldAffix iPrefix;
        private final int iPrintZeroSetting;
        private final boolean iRejectSignedValues;
        private final PeriodFieldAffix iSuffix;

        public FieldFormatter(int i10, int i11, int i12, boolean z10, int i13, FieldFormatter[] fieldFormatterArr, PeriodFieldAffix periodFieldAffix, PeriodFieldAffix periodFieldAffix2) {
            this.iMinPrintedDigits = i10;
            this.iPrintZeroSetting = i11;
            this.iMaxParsedDigits = i12;
            this.iRejectSignedValues = z10;
            this.iFieldType = i13;
            this.iFieldFormatters = fieldFormatterArr;
            this.iPrefix = periodFieldAffix;
            this.iSuffix = periodFieldAffix2;
        }

        public FieldFormatter(FieldFormatter fieldFormatter, PeriodFieldAffix periodFieldAffix) {
            this.iMinPrintedDigits = fieldFormatter.iMinPrintedDigits;
            this.iPrintZeroSetting = fieldFormatter.iPrintZeroSetting;
            this.iMaxParsedDigits = fieldFormatter.iMaxParsedDigits;
            this.iRejectSignedValues = fieldFormatter.iRejectSignedValues;
            this.iFieldType = fieldFormatter.iFieldType;
            this.iFieldFormatters = fieldFormatter.iFieldFormatters;
            this.iPrefix = fieldFormatter.iPrefix;
            PeriodFieldAffix periodFieldAffix2 = fieldFormatter.iSuffix;
            this.iSuffix = periodFieldAffix2 != null ? new CompositeAffix(periodFieldAffix2, periodFieldAffix) : periodFieldAffix;
        }

        private int parseInt(String str, int i10, int i11) {
            if (i11 >= 10) {
                return Integer.parseInt(str.substring(i10, i11 + i10));
            }
            boolean z10 = false;
            if (i11 <= 0) {
                return 0;
            }
            int i12 = i10 + 1;
            char cCharAt = str.charAt(i10);
            int i13 = i11 - 1;
            if (cCharAt == '-') {
                i13--;
                if (i13 < 0) {
                    return 0;
                }
                char cCharAt2 = str.charAt(i12);
                i12++;
                cCharAt = cCharAt2;
                z10 = true;
            }
            int i14 = cCharAt - '0';
            while (true) {
                int i15 = i13 - 1;
                if (i13 <= 0) {
                    break;
                }
                int iCharAt = (str.charAt(i12) + ((i14 << 3) + (i14 << 1))) - 48;
                i12++;
                i14 = iCharAt;
                i13 = i15;
            }
            return z10 ? -i14 : i14;
        }

        @Override // org.joda.time.format.PeriodPrinter
        public int calculatePrintedLength(ReadablePeriod readablePeriod, Locale locale) {
            long fieldValue = getFieldValue(readablePeriod);
            if (fieldValue == RecyclerView.FOREVER_NS) {
                return 0;
            }
            int iMax = Math.max(FormatUtils.calculateDigitCount(fieldValue), this.iMinPrintedDigits);
            if (this.iFieldType >= 8) {
                iMax = Math.max(iMax, fieldValue < 0 ? 5 : 4) + 1;
                if (this.iFieldType == 9 && Math.abs(fieldValue) % 1000 == 0) {
                    iMax -= 4;
                }
                fieldValue /= 1000;
            }
            int i10 = (int) fieldValue;
            PeriodFieldAffix periodFieldAffix = this.iPrefix;
            if (periodFieldAffix != null) {
                iMax += periodFieldAffix.calculatePrintedLength(i10);
            }
            PeriodFieldAffix periodFieldAffix2 = this.iSuffix;
            return periodFieldAffix2 != null ? iMax + periodFieldAffix2.calculatePrintedLength(i10) : iMax;
        }

        @Override // org.joda.time.format.PeriodPrinter
        public int countFieldsToPrint(ReadablePeriod readablePeriod, int i10, Locale locale) {
            if (i10 <= 0) {
                return 0;
            }
            return (this.iPrintZeroSetting == 4 || getFieldValue(readablePeriod) != RecyclerView.FOREVER_NS) ? 1 : 0;
        }

        public void finish(FieldFormatter[] fieldFormatterArr) {
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            for (FieldFormatter fieldFormatter : fieldFormatterArr) {
                if (fieldFormatter != null && !equals(fieldFormatter)) {
                    hashSet.add(fieldFormatter.iPrefix);
                    hashSet2.add(fieldFormatter.iSuffix);
                }
            }
            PeriodFieldAffix periodFieldAffix = this.iPrefix;
            if (periodFieldAffix != null) {
                periodFieldAffix.finish(hashSet);
            }
            PeriodFieldAffix periodFieldAffix2 = this.iSuffix;
            if (periodFieldAffix2 != null) {
                periodFieldAffix2.finish(hashSet2);
            }
        }

        public int getFieldType() {
            return this.iFieldType;
        }

        /* JADX WARN: Code duplicated, block: B:26:0x006a  */
        /* JADX WARN: Code duplicated, block: B:28:0x0071  */
        /* JADX WARN: Code duplicated, block: B:30:0x0074  */
        /* JADX WARN: Code duplicated, block: B:33:0x0078 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:34:0x0079  */
        /* JADX WARN: Code duplicated, block: B:36:0x007f  */
        /* JADX WARN: Code duplicated, block: B:38:0x0087  */
        /* JADX WARN: Code duplicated, block: B:40:0x008a  */
        /* JADX WARN: Code duplicated, block: B:42:0x0090  */
        /* JADX WARN: Code duplicated, block: B:47:0x009b  */
        /* JADX WARN: Code duplicated, block: B:49:0x00a1  */
        /* JADX WARN: Code duplicated, block: B:51:0x00a9  */
        /* JADX WARN: Code duplicated, block: B:54:0x00b3 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:63:0x0097 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:65:0x00c2 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
        public long getFieldValue(ReadablePeriod readablePeriod) {
            DurationFieldType durationFieldTypeYears;
            long j10;
            int i10;
            FieldFormatter[] fieldFormatterArr;
            int i11;
            int iMin;
            FieldFormatter[] fieldFormatterArr2;
            int i12;
            int i13;
            PeriodType periodType = this.iPrintZeroSetting == 4 ? null : readablePeriod.getPeriodType();
            if (periodType != null && !isSupported(periodType, this.iFieldType)) {
                return RecyclerView.FOREVER_NS;
            }
            switch (this.iFieldType) {
                case 0:
                    durationFieldTypeYears = DurationFieldType.years();
                    j10 = readablePeriod.get(durationFieldTypeYears);
                    if (j10 == 0) {
                        i10 = this.iPrintZeroSetting;
                        if (i10 == 1) {
                            if (isZero(readablePeriod)) {
                                fieldFormatterArr = this.iFieldFormatters;
                                i11 = this.iFieldType;
                                if (fieldFormatterArr[i11] == this) {
                                    iMin = Math.min(i11, 8);
                                    while (true) {
                                        iMin--;
                                        if (iMin < 0 && iMin <= 9) {
                                            if (!isSupported(periodType, iMin) || this.iFieldFormatters[iMin] == null) {
                                            }
                                        }
                                    }
                                }
                            }
                            return RecyclerView.FOREVER_NS;
                        }
                        if (i10 == 2) {
                            if (isZero(readablePeriod)) {
                                fieldFormatterArr2 = this.iFieldFormatters;
                                i12 = this.iFieldType;
                                if (fieldFormatterArr2[i12] == this) {
                                    for (i13 = i12 + 1; i13 <= 9; i13++) {
                                        if (!isSupported(periodType, i13) && this.iFieldFormatters[i13] != null) {
                                            return RecyclerView.FOREVER_NS;
                                        }
                                    }
                                }
                            }
                            return RecyclerView.FOREVER_NS;
                        }
                        if (i10 == 5) {
                            return RecyclerView.FOREVER_NS;
                        }
                    }
                    return j10;
                case 1:
                    durationFieldTypeYears = DurationFieldType.months();
                    j10 = readablePeriod.get(durationFieldTypeYears);
                    if (j10 == 0) {
                        i10 = this.iPrintZeroSetting;
                        if (i10 == 1) {
                            if (isZero(readablePeriod)) {
                                fieldFormatterArr = this.iFieldFormatters;
                                i11 = this.iFieldType;
                                if (fieldFormatterArr[i11] == this) {
                                    iMin = Math.min(i11, 8);
                                    while (true) {
                                        iMin--;
                                        if (iMin < 0) {
                                        }
                                    }
                                }
                            }
                            return RecyclerView.FOREVER_NS;
                        }
                        if (i10 == 2) {
                            if (isZero(readablePeriod)) {
                                fieldFormatterArr2 = this.iFieldFormatters;
                                i12 = this.iFieldType;
                                if (fieldFormatterArr2[i12] == this) {
                                    while (i13 <= 9) {
                                        if (!isSupported(periodType, i13)) {
                                        }
                                    }
                                }
                            }
                            return RecyclerView.FOREVER_NS;
                        }
                        if (i10 == 5) {
                            return RecyclerView.FOREVER_NS;
                        }
                    }
                    return j10;
                case 2:
                    durationFieldTypeYears = DurationFieldType.weeks();
                    j10 = readablePeriod.get(durationFieldTypeYears);
                    if (j10 == 0) {
                        i10 = this.iPrintZeroSetting;
                        if (i10 == 1) {
                            if (isZero(readablePeriod)) {
                                fieldFormatterArr = this.iFieldFormatters;
                                i11 = this.iFieldType;
                                if (fieldFormatterArr[i11] == this) {
                                    iMin = Math.min(i11, 8);
                                    while (true) {
                                        iMin--;
                                        if (iMin < 0) {
                                        }
                                    }
                                }
                            }
                            return RecyclerView.FOREVER_NS;
                        }
                        if (i10 == 2) {
                            if (isZero(readablePeriod)) {
                                fieldFormatterArr2 = this.iFieldFormatters;
                                i12 = this.iFieldType;
                                if (fieldFormatterArr2[i12] == this) {
                                    while (i13 <= 9) {
                                        if (!isSupported(periodType, i13)) {
                                        }
                                    }
                                }
                            }
                            return RecyclerView.FOREVER_NS;
                        }
                        if (i10 == 5) {
                            return RecyclerView.FOREVER_NS;
                        }
                    }
                    return j10;
                case 3:
                    durationFieldTypeYears = DurationFieldType.days();
                    j10 = readablePeriod.get(durationFieldTypeYears);
                    if (j10 == 0) {
                        i10 = this.iPrintZeroSetting;
                        if (i10 == 1) {
                            if (isZero(readablePeriod)) {
                                fieldFormatterArr = this.iFieldFormatters;
                                i11 = this.iFieldType;
                                if (fieldFormatterArr[i11] == this) {
                                    iMin = Math.min(i11, 8);
                                    while (true) {
                                        iMin--;
                                        if (iMin < 0) {
                                        }
                                    }
                                }
                            }
                            return RecyclerView.FOREVER_NS;
                        }
                        if (i10 == 2) {
                            if (isZero(readablePeriod)) {
                                fieldFormatterArr2 = this.iFieldFormatters;
                                i12 = this.iFieldType;
                                if (fieldFormatterArr2[i12] == this) {
                                    while (i13 <= 9) {
                                        if (!isSupported(periodType, i13)) {
                                        }
                                    }
                                }
                            }
                            return RecyclerView.FOREVER_NS;
                        }
                        if (i10 == 5) {
                            return RecyclerView.FOREVER_NS;
                        }
                    }
                    return j10;
                case 4:
                    durationFieldTypeYears = DurationFieldType.hours();
                    j10 = readablePeriod.get(durationFieldTypeYears);
                    if (j10 == 0) {
                        i10 = this.iPrintZeroSetting;
                        if (i10 == 1) {
                            if (isZero(readablePeriod)) {
                                fieldFormatterArr = this.iFieldFormatters;
                                i11 = this.iFieldType;
                                if (fieldFormatterArr[i11] == this) {
                                    iMin = Math.min(i11, 8);
                                    while (true) {
                                        iMin--;
                                        if (iMin < 0) {
                                        }
                                    }
                                }
                            }
                            return RecyclerView.FOREVER_NS;
                        }
                        if (i10 == 2) {
                            if (isZero(readablePeriod)) {
                                fieldFormatterArr2 = this.iFieldFormatters;
                                i12 = this.iFieldType;
                                if (fieldFormatterArr2[i12] == this) {
                                    while (i13 <= 9) {
                                        if (!isSupported(periodType, i13)) {
                                        }
                                    }
                                }
                            }
                            return RecyclerView.FOREVER_NS;
                        }
                        if (i10 == 5) {
                            return RecyclerView.FOREVER_NS;
                        }
                    }
                    return j10;
                case 5:
                    durationFieldTypeYears = DurationFieldType.minutes();
                    j10 = readablePeriod.get(durationFieldTypeYears);
                    if (j10 == 0) {
                        i10 = this.iPrintZeroSetting;
                        if (i10 == 1) {
                            if (isZero(readablePeriod)) {
                                fieldFormatterArr = this.iFieldFormatters;
                                i11 = this.iFieldType;
                                if (fieldFormatterArr[i11] == this) {
                                    iMin = Math.min(i11, 8);
                                    while (true) {
                                        iMin--;
                                        if (iMin < 0) {
                                        }
                                    }
                                }
                            }
                            return RecyclerView.FOREVER_NS;
                        }
                        if (i10 == 2) {
                            if (isZero(readablePeriod)) {
                                fieldFormatterArr2 = this.iFieldFormatters;
                                i12 = this.iFieldType;
                                if (fieldFormatterArr2[i12] == this) {
                                    while (i13 <= 9) {
                                        if (!isSupported(periodType, i13)) {
                                        }
                                    }
                                }
                            }
                            return RecyclerView.FOREVER_NS;
                        }
                        if (i10 == 5) {
                            return RecyclerView.FOREVER_NS;
                        }
                    }
                    return j10;
                case 6:
                    durationFieldTypeYears = DurationFieldType.seconds();
                    j10 = readablePeriod.get(durationFieldTypeYears);
                    if (j10 == 0) {
                        i10 = this.iPrintZeroSetting;
                        if (i10 == 1) {
                            if (isZero(readablePeriod)) {
                                fieldFormatterArr = this.iFieldFormatters;
                                i11 = this.iFieldType;
                                if (fieldFormatterArr[i11] == this) {
                                    iMin = Math.min(i11, 8);
                                    while (true) {
                                        iMin--;
                                        if (iMin < 0) {
                                        }
                                    }
                                }
                            }
                            return RecyclerView.FOREVER_NS;
                        }
                        if (i10 == 2) {
                            if (isZero(readablePeriod)) {
                                fieldFormatterArr2 = this.iFieldFormatters;
                                i12 = this.iFieldType;
                                if (fieldFormatterArr2[i12] == this) {
                                    while (i13 <= 9) {
                                        if (!isSupported(periodType, i13)) {
                                        }
                                    }
                                }
                            }
                            return RecyclerView.FOREVER_NS;
                        }
                        if (i10 == 5) {
                            return RecyclerView.FOREVER_NS;
                        }
                    }
                    return j10;
                case 7:
                    durationFieldTypeYears = DurationFieldType.millis();
                    j10 = readablePeriod.get(durationFieldTypeYears);
                    if (j10 == 0) {
                        i10 = this.iPrintZeroSetting;
                        if (i10 == 1) {
                            if (isZero(readablePeriod)) {
                                fieldFormatterArr = this.iFieldFormatters;
                                i11 = this.iFieldType;
                                if (fieldFormatterArr[i11] == this) {
                                    iMin = Math.min(i11, 8);
                                    while (true) {
                                        iMin--;
                                        if (iMin < 0) {
                                        }
                                    }
                                }
                            }
                            return RecyclerView.FOREVER_NS;
                        }
                        if (i10 == 2) {
                            if (isZero(readablePeriod)) {
                                fieldFormatterArr2 = this.iFieldFormatters;
                                i12 = this.iFieldType;
                                if (fieldFormatterArr2[i12] == this) {
                                    while (i13 <= 9) {
                                        if (!isSupported(periodType, i13)) {
                                        }
                                    }
                                }
                            }
                            return RecyclerView.FOREVER_NS;
                        }
                        if (i10 == 5) {
                            return RecyclerView.FOREVER_NS;
                        }
                    }
                    return j10;
                case 8:
                case 9:
                    j10 = (((long) readablePeriod.get(DurationFieldType.seconds())) * 1000) + ((long) readablePeriod.get(DurationFieldType.millis()));
                    if (j10 == 0) {
                        i10 = this.iPrintZeroSetting;
                        if (i10 == 1) {
                            if (isZero(readablePeriod)) {
                                fieldFormatterArr = this.iFieldFormatters;
                                i11 = this.iFieldType;
                                if (fieldFormatterArr[i11] == this) {
                                    iMin = Math.min(i11, 8);
                                    while (true) {
                                        iMin--;
                                        if (iMin < 0) {
                                        }
                                    }
                                }
                            }
                            return RecyclerView.FOREVER_NS;
                        }
                        if (i10 == 2) {
                            if (isZero(readablePeriod)) {
                                fieldFormatterArr2 = this.iFieldFormatters;
                                i12 = this.iFieldType;
                                if (fieldFormatterArr2[i12] == this) {
                                    while (i13 <= 9) {
                                        if (!isSupported(periodType, i13)) {
                                        }
                                    }
                                }
                            }
                            return RecyclerView.FOREVER_NS;
                        }
                        if (i10 == 5) {
                            return RecyclerView.FOREVER_NS;
                        }
                    }
                    return j10;
                default:
                    return RecyclerView.FOREVER_NS;
            }
        }

        public boolean isSupported(PeriodType periodType, int i10) {
            DurationFieldType durationFieldTypeYears;
            switch (i10) {
                case 0:
                    durationFieldTypeYears = DurationFieldType.years();
                    break;
                case 1:
                    durationFieldTypeYears = DurationFieldType.months();
                    break;
                case 2:
                    durationFieldTypeYears = DurationFieldType.weeks();
                    break;
                case 3:
                    durationFieldTypeYears = DurationFieldType.days();
                    break;
                case 4:
                    durationFieldTypeYears = DurationFieldType.hours();
                    break;
                case 5:
                    durationFieldTypeYears = DurationFieldType.minutes();
                    break;
                case 6:
                    durationFieldTypeYears = DurationFieldType.seconds();
                    break;
                case 7:
                    durationFieldTypeYears = DurationFieldType.millis();
                    break;
                case 8:
                case 9:
                    return periodType.isSupported(DurationFieldType.seconds()) || periodType.isSupported(DurationFieldType.millis());
                default:
                    return false;
            }
            return periodType.isSupported(durationFieldTypeYears);
        }

        public boolean isZero(ReadablePeriod readablePeriod) {
            int size = readablePeriod.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (readablePeriod.getValue(i10) != 0) {
                    return false;
                }
            }
            return true;
        }

        @Override // org.joda.time.format.PeriodParser
        public int parseInto(ReadWritablePeriod readWritablePeriod, String str, int i10, Locale locale) {
            int iScan;
            int i11;
            int i12;
            PeriodFieldAffix periodFieldAffix;
            int i13;
            char cCharAt;
            int i14 = i10;
            boolean z10 = this.iPrintZeroSetting == 4;
            if (i14 >= str.length()) {
                return z10 ? ~i14 : i14;
            }
            PeriodFieldAffix periodFieldAffix2 = this.iPrefix;
            if (periodFieldAffix2 != null) {
                i14 = periodFieldAffix2.parse(str, i14);
                if (i14 < 0) {
                    return !z10 ? ~i14 : i14;
                }
                z10 = true;
            }
            PeriodFieldAffix periodFieldAffix3 = this.iSuffix;
            int i15 = -1;
            if (periodFieldAffix3 == null || z10) {
                iScan = -1;
            } else {
                iScan = periodFieldAffix3.scan(str, i14);
                if (iScan < 0) {
                    return !z10 ? ~iScan : iScan;
                }
                z10 = true;
            }
            if (!z10 && !isSupported(readWritablePeriod.getPeriodType(), this.iFieldType)) {
                return i14;
            }
            int iMin = Math.min(this.iMaxParsedDigits, iScan > 0 ? iScan - i14 : str.length() - i14);
            int i16 = 0;
            boolean z11 = false;
            boolean z12 = false;
            while (i16 < iMin) {
                int i17 = i14 + i16;
                char cCharAt2 = str.charAt(i17);
                if (i16 != 0 || (!(cCharAt2 == '-' || cCharAt2 == '+') || this.iRejectSignedValues)) {
                    if (cCharAt2 >= '0' && cCharAt2 <= '9') {
                        z11 = true;
                    } else {
                        if ((cCharAt2 != '.' && cCharAt2 != ',') || (((i13 = this.iFieldType) != 8 && i13 != 9) || i15 >= 0)) {
                            break;
                        }
                        iMin = Math.min(iMin + 1, str.length() - i14);
                        i15 = i17 + 1;
                    }
                    i16++;
                } else {
                    z12 = cCharAt2 == '-';
                    int i18 = i16 + 1;
                    if (i18 >= iMin || (cCharAt = str.charAt(i17 + 1)) < '0' || cCharAt > '9') {
                        break;
                    }
                    if (z12) {
                        i16 = i18;
                    } else {
                        i14++;
                    }
                    iMin = Math.min(iMin + 1, str.length() - i14);
                }
            }
            if (!z11) {
                return ~i14;
            }
            if (iScan >= 0 && i14 + i16 != iScan) {
                return i14;
            }
            int i19 = this.iFieldType;
            if (i19 == 8 || i19 == 9) {
                i19 = 7;
                if (i15 < 0) {
                    setFieldValue(readWritablePeriod, 6, parseInt(str, i14, i16));
                    setFieldValue(readWritablePeriod, 7, 0);
                } else {
                    int i20 = parseInt(str, i14, (i15 - i14) - 1);
                    setFieldValue(readWritablePeriod, 6, i20);
                    int i21 = (i14 + i16) - i15;
                    if (i21 <= 0) {
                        i11 = 0;
                    } else {
                        if (i21 >= 3) {
                            i11 = parseInt(str, i15, 3);
                        } else {
                            int i22 = parseInt(str, i15, i21);
                            i11 = i21 == 1 ? i22 * 100 : i22 * 10;
                        }
                        if (z12 || i20 < 0) {
                            i11 = -i11;
                        }
                    }
                }
                i12 = i14 + i16;
                return (i12 < 0 || (periodFieldAffix = this.iSuffix) == null) ? i12 : periodFieldAffix.parse(str, i12);
            }
            i11 = parseInt(str, i14, i16);
            setFieldValue(readWritablePeriod, i19, i11);
            i12 = i14 + i16;
            if (i12 < 0) {
                return i12;
            }
        }

        @Override // org.joda.time.format.PeriodPrinter
        public void printTo(Writer writer, ReadablePeriod readablePeriod, Locale locale) throws IOException {
            long fieldValue = getFieldValue(readablePeriod);
            if (fieldValue == RecyclerView.FOREVER_NS) {
                return;
            }
            int i10 = (int) fieldValue;
            if (this.iFieldType >= 8) {
                i10 = (int) (fieldValue / 1000);
            }
            PeriodFieldAffix periodFieldAffix = this.iPrefix;
            if (periodFieldAffix != null) {
                periodFieldAffix.printTo(writer, i10);
            }
            int i11 = this.iMinPrintedDigits;
            if (i11 <= 1) {
                FormatUtils.writeUnpaddedInteger(writer, i10);
            } else {
                FormatUtils.writePaddedInteger(writer, i10, i11);
            }
            if (this.iFieldType >= 8) {
                int iAbs = (int) (Math.abs(fieldValue) % 1000);
                if (this.iFieldType == 8 || iAbs > 0) {
                    writer.write(46);
                    FormatUtils.writePaddedInteger(writer, iAbs, 3);
                }
            }
            PeriodFieldAffix periodFieldAffix2 = this.iSuffix;
            if (periodFieldAffix2 != null) {
                periodFieldAffix2.printTo(writer, i10);
            }
        }

        @Override // org.joda.time.format.PeriodPrinter
        public void printTo(StringBuffer stringBuffer, ReadablePeriod readablePeriod, Locale locale) {
            long fieldValue = getFieldValue(readablePeriod);
            if (fieldValue == RecyclerView.FOREVER_NS) {
                return;
            }
            int i10 = (int) fieldValue;
            if (this.iFieldType >= 8) {
                i10 = (int) (fieldValue / 1000);
            }
            PeriodFieldAffix periodFieldAffix = this.iPrefix;
            if (periodFieldAffix != null) {
                periodFieldAffix.printTo(stringBuffer, i10);
            }
            int length = stringBuffer.length();
            int i11 = this.iMinPrintedDigits;
            if (i11 <= 1) {
                FormatUtils.appendUnpaddedInteger(stringBuffer, i10);
            } else {
                FormatUtils.appendPaddedInteger(stringBuffer, i10, i11);
            }
            if (this.iFieldType >= 8) {
                int iAbs = (int) (Math.abs(fieldValue) % 1000);
                if (this.iFieldType == 8 || iAbs > 0) {
                    if (fieldValue < 0 && fieldValue > -1000) {
                        stringBuffer.insert(length, CoreConstants.DASH_CHAR);
                    }
                    stringBuffer.append(CoreConstants.DOT);
                    FormatUtils.appendPaddedInteger(stringBuffer, iAbs, 3);
                }
            }
            PeriodFieldAffix periodFieldAffix2 = this.iSuffix;
            if (periodFieldAffix2 != null) {
                periodFieldAffix2.printTo(stringBuffer, i10);
            }
        }

        public void setFieldValue(ReadWritablePeriod readWritablePeriod, int i10, int i11) {
            switch (i10) {
                case 0:
                    readWritablePeriod.setYears(i11);
                    break;
                case 1:
                    readWritablePeriod.setMonths(i11);
                    break;
                case 2:
                    readWritablePeriod.setWeeks(i11);
                    break;
                case 3:
                    readWritablePeriod.setDays(i11);
                    break;
                case 4:
                    readWritablePeriod.setHours(i11);
                    break;
                case 5:
                    readWritablePeriod.setMinutes(i11);
                    break;
                case 6:
                    readWritablePeriod.setSeconds(i11);
                    break;
                case 7:
                    readWritablePeriod.setMillis(i11);
                    break;
            }
        }
    }

    public static abstract class IgnorableAffix implements PeriodFieldAffix {
        private volatile String[] iOtherAffixes;

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public void finish(Set<PeriodFieldAffix> set) {
            if (this.iOtherAffixes == null) {
                int length = Integer.MAX_VALUE;
                String str = null;
                for (String str2 : getAffixes()) {
                    if (str2.length() < length) {
                        length = str2.length();
                        str = str2;
                    }
                }
                HashSet hashSet = new HashSet();
                for (PeriodFieldAffix periodFieldAffix : set) {
                    if (periodFieldAffix != null) {
                        for (String str3 : periodFieldAffix.getAffixes()) {
                            if (str3.length() > length || (str3.equalsIgnoreCase(str) && !str3.equals(str))) {
                                hashSet.add(str3);
                            }
                        }
                    }
                }
                this.iOtherAffixes = (String[]) hashSet.toArray(new String[hashSet.size()]);
            }
        }

        public boolean matchesOtherAffix(int i10, String str, int i11) {
            if (this.iOtherAffixes != null) {
                for (String str2 : this.iOtherAffixes) {
                    int length = str2.length();
                    if (i10 < length && str.regionMatches(true, i11, str2, 0, length)) {
                        return true;
                    }
                    if (i10 == length && str.regionMatches(false, i11, str2, 0, length)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public static class Literal implements PeriodPrinter, PeriodParser {
        public static final Literal EMPTY = new Literal("");
        private final String iText;

        public Literal(String str) {
            this.iText = str;
        }

        @Override // org.joda.time.format.PeriodPrinter
        public int calculatePrintedLength(ReadablePeriod readablePeriod, Locale locale) {
            return this.iText.length();
        }

        @Override // org.joda.time.format.PeriodPrinter
        public int countFieldsToPrint(ReadablePeriod readablePeriod, int i10, Locale locale) {
            return 0;
        }

        @Override // org.joda.time.format.PeriodParser
        public int parseInto(ReadWritablePeriod readWritablePeriod, String str, int i10, Locale locale) {
            String str2 = this.iText;
            return str.regionMatches(true, i10, str2, 0, str2.length()) ? this.iText.length() + i10 : ~i10;
        }

        @Override // org.joda.time.format.PeriodPrinter
        public void printTo(Writer writer, ReadablePeriod readablePeriod, Locale locale) throws IOException {
            writer.write(this.iText);
        }

        @Override // org.joda.time.format.PeriodPrinter
        public void printTo(StringBuffer stringBuffer, ReadablePeriod readablePeriod, Locale locale) {
            stringBuffer.append(this.iText);
        }
    }

    public interface PeriodFieldAffix {
        int calculatePrintedLength(int i10);

        void finish(Set<PeriodFieldAffix> set);

        String[] getAffixes();

        int parse(String str, int i10);

        void printTo(Writer writer, int i10) throws IOException;

        void printTo(StringBuffer stringBuffer, int i10);

        int scan(String str, int i10);
    }

    public static class PluralAffix extends IgnorableAffix {
        private final String iPluralText;
        private final String iSingularText;

        public PluralAffix(String str, String str2) {
            this.iSingularText = str;
            this.iPluralText = str2;
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int calculatePrintedLength(int i10) {
            return (i10 == 1 ? this.iSingularText : this.iPluralText).length();
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public String[] getAffixes() {
            return new String[]{this.iSingularText, this.iPluralText};
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int parse(String str, int i10) {
            String str2;
            int length;
            String str3 = this.iPluralText;
            String str4 = this.iSingularText;
            if (str3.length() < str4.length()) {
                str2 = str3;
                str3 = str4;
            } else {
                str2 = str4;
            }
            if (!str.regionMatches(true, i10, str3, 0, str3.length()) || matchesOtherAffix(str3.length(), str, i10)) {
                if (!str.regionMatches(true, i10, str2, 0, str2.length()) || matchesOtherAffix(str2.length(), str, i10)) {
                    return ~i10;
                }
                length = str2.length();
            } else {
                length = str3.length();
            }
            return length + i10;
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public void printTo(Writer writer, int i10) throws IOException {
            writer.write(i10 == 1 ? this.iSingularText : this.iPluralText);
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public void printTo(StringBuffer stringBuffer, int i10) {
            stringBuffer.append(i10 == 1 ? this.iSingularText : this.iPluralText);
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int scan(String str, int i10) {
            String str2;
            String str3;
            String str4 = this.iPluralText;
            String str5 = this.iSingularText;
            if (str4.length() < str5.length()) {
                str3 = str4;
                str2 = str5;
            } else {
                str2 = str4;
                str3 = str5;
            }
            int length = str2.length();
            int length2 = str3.length();
            int length3 = str.length();
            for (int i11 = i10; i11 < length3; i11++) {
                if (str.regionMatches(true, i11, str2, 0, length) && !matchesOtherAffix(str2.length(), str, i11)) {
                    return i11;
                }
                if (str.regionMatches(true, i11, str3, 0, length2) && !matchesOtherAffix(str3.length(), str, i11)) {
                    return i11;
                }
            }
            return ~i10;
        }
    }

    public static class RegExAffix extends IgnorableAffix {
        private static final Comparator<String> LENGTH_DESC_COMPARATOR = new Comparator<String>() { // from class: org.joda.time.format.PeriodFormatterBuilder.RegExAffix.1
            @Override // java.util.Comparator
            public int compare(String str, String str2) {
                return str2.length() - str.length();
            }
        };
        private final Pattern[] iPatterns;
        private final String[] iSuffixes;
        private final String[] iSuffixesSortedDescByLength;

        public RegExAffix(String[] strArr, String[] strArr2) {
            this.iSuffixes = (String[]) strArr2.clone();
            this.iPatterns = new Pattern[strArr.length];
            for (int i10 = 0; i10 < strArr.length; i10++) {
                Pattern patternCompile = (Pattern) PeriodFormatterBuilder.PATTERNS.get(strArr[i10]);
                if (patternCompile == null) {
                    patternCompile = Pattern.compile(strArr[i10]);
                    PeriodFormatterBuilder.PATTERNS.putIfAbsent(strArr[i10], patternCompile);
                }
                this.iPatterns[i10] = patternCompile;
            }
            String[] strArr3 = (String[]) this.iSuffixes.clone();
            this.iSuffixesSortedDescByLength = strArr3;
            Arrays.sort(strArr3, LENGTH_DESC_COMPARATOR);
        }

        private int selectSuffixIndex(int i10) {
            String strValueOf = String.valueOf(i10);
            int i11 = 0;
            while (true) {
                Pattern[] patternArr = this.iPatterns;
                if (i11 >= patternArr.length) {
                    return patternArr.length - 1;
                }
                if (patternArr[i11].matcher(strValueOf).matches()) {
                    return i11;
                }
                i11++;
            }
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int calculatePrintedLength(int i10) {
            return this.iSuffixes[selectSuffixIndex(i10)].length();
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public String[] getAffixes() {
            return (String[]) this.iSuffixes.clone();
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int parse(String str, int i10) {
            for (String str2 : this.iSuffixesSortedDescByLength) {
                if (str.regionMatches(true, i10, str2, 0, str2.length()) && !matchesOtherAffix(str2.length(), str, i10)) {
                    return str2.length() + i10;
                }
            }
            return ~i10;
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public void printTo(Writer writer, int i10) throws IOException {
            writer.write(this.iSuffixes[selectSuffixIndex(i10)]);
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public void printTo(StringBuffer stringBuffer, int i10) {
            stringBuffer.append(this.iSuffixes[selectSuffixIndex(i10)]);
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int scan(String str, int i10) {
            int length = str.length();
            for (int i11 = i10; i11 < length; i11++) {
                for (String str2 : this.iSuffixesSortedDescByLength) {
                    if (str.regionMatches(true, i11, str2, 0, str2.length()) && !matchesOtherAffix(str2.length(), str, i11)) {
                        return i11;
                    }
                }
            }
            return ~i10;
        }
    }

    public static class Separator implements PeriodPrinter, PeriodParser {
        private volatile PeriodParser iAfterParser;
        private volatile PeriodPrinter iAfterPrinter;
        private final PeriodParser iBeforeParser;
        private final PeriodPrinter iBeforePrinter;
        private final String iFinalText;
        private final String[] iParsedForms;
        private final String iText;
        private final boolean iUseAfter;
        private final boolean iUseBefore;

        public Separator(String str, String str2, String[] strArr, PeriodPrinter periodPrinter, PeriodParser periodParser, boolean z10, boolean z11) {
            this.iText = str;
            this.iFinalText = str2;
            if ((str2 == null || str.equals(str2)) && (strArr == null || strArr.length == 0)) {
                this.iParsedForms = new String[]{str};
            } else {
                TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                treeSet.add(str);
                treeSet.add(str2);
                if (strArr != null) {
                    int length = strArr.length;
                    while (true) {
                        length--;
                        if (length < 0) {
                            break;
                        } else {
                            treeSet.add(strArr[length]);
                        }
                    }
                }
                ArrayList arrayList = new ArrayList(treeSet);
                Collections.reverse(arrayList);
                this.iParsedForms = (String[]) arrayList.toArray(new String[arrayList.size()]);
            }
            this.iBeforePrinter = periodPrinter;
            this.iBeforeParser = periodParser;
            this.iUseBefore = z10;
            this.iUseAfter = z11;
        }

        @Override // org.joda.time.format.PeriodPrinter
        public int calculatePrintedLength(ReadablePeriod readablePeriod, Locale locale) {
            PeriodPrinter periodPrinter = this.iBeforePrinter;
            PeriodPrinter periodPrinter2 = this.iAfterPrinter;
            int iCalculatePrintedLength = periodPrinter2.calculatePrintedLength(readablePeriod, locale) + periodPrinter.calculatePrintedLength(readablePeriod, locale);
            if (this.iUseBefore) {
                if (periodPrinter.countFieldsToPrint(readablePeriod, 1, locale) <= 0) {
                    return iCalculatePrintedLength;
                }
                if (this.iUseAfter) {
                    int iCountFieldsToPrint = periodPrinter2.countFieldsToPrint(readablePeriod, 2, locale);
                    if (iCountFieldsToPrint > 0) {
                        return (iCountFieldsToPrint > 1 ? this.iText : this.iFinalText).length() + iCalculatePrintedLength;
                    }
                    return iCalculatePrintedLength;
                }
            } else if (!this.iUseAfter || periodPrinter2.countFieldsToPrint(readablePeriod, 1, locale) <= 0) {
                return iCalculatePrintedLength;
            }
            return iCalculatePrintedLength + this.iText.length();
        }

        @Override // org.joda.time.format.PeriodPrinter
        public int countFieldsToPrint(ReadablePeriod readablePeriod, int i10, Locale locale) {
            int iCountFieldsToPrint = this.iBeforePrinter.countFieldsToPrint(readablePeriod, i10, locale);
            return iCountFieldsToPrint < i10 ? iCountFieldsToPrint + this.iAfterPrinter.countFieldsToPrint(readablePeriod, i10, locale) : iCountFieldsToPrint;
        }

        public Separator finish(PeriodPrinter periodPrinter, PeriodParser periodParser) {
            this.iAfterPrinter = periodPrinter;
            this.iAfterParser = periodParser;
            return this;
        }

        @Override // org.joda.time.format.PeriodParser
        public int parseInto(ReadWritablePeriod readWritablePeriod, String str, int i10, Locale locale) {
            int into = this.iBeforeParser.parseInto(readWritablePeriod, str, i10, locale);
            if (into < 0) {
                return into;
            }
            int length = -1;
            boolean z10 = false;
            if (into > i10) {
                String[] strArr = this.iParsedForms;
                int length2 = strArr.length;
                for (int i11 = 0; i11 < length2; i11++) {
                    String str2 = strArr[i11];
                    if (str2 == null || str2.length() == 0 || str.regionMatches(true, into, str2, 0, str2.length())) {
                        length = str2 == null ? 0 : str2.length();
                        into += length;
                        z10 = true;
                        break;
                    }
                }
            }
            int into2 = this.iAfterParser.parseInto(readWritablePeriod, str, into, locale);
            if (into2 < 0) {
                return into2;
            }
            if (z10 && into2 == into && length > 0) {
                return ~into;
            }
            return (into2 <= into || z10 || this.iUseBefore) ? into2 : ~into;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x002d  */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
        
            if (r1.countFieldsToPrint(r6, 1, r7) > 0) goto L17;
         */
        @Override // org.joda.time.format.PeriodPrinter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void printTo(java.io.Writer r5, org.joda.time.ReadablePeriod r6, java.util.Locale r7) throws java.io.IOException {
            /*
                r4 = this;
                org.joda.time.format.PeriodPrinter r0 = r4.iBeforePrinter
                org.joda.time.format.PeriodPrinter r1 = r4.iAfterPrinter
                r0.printTo(r5, r6, r7)
                boolean r2 = r4.iUseBefore
                r3 = 1
                if (r2 == 0) goto L23
                int r0 = r0.countFieldsToPrint(r6, r3, r7)
                if (r0 <= 0) goto L32
                boolean r0 = r4.iUseAfter
                if (r0 == 0) goto L2d
                r0 = 2
                int r0 = r1.countFieldsToPrint(r6, r0, r7)
                if (r0 <= 0) goto L32
                if (r0 <= r3) goto L20
                goto L2d
            L20:
                java.lang.String r0 = r4.iFinalText
                goto L2f
            L23:
                boolean r0 = r4.iUseAfter
                if (r0 == 0) goto L32
                int r0 = r1.countFieldsToPrint(r6, r3, r7)
                if (r0 <= 0) goto L32
            L2d:
                java.lang.String r0 = r4.iText
            L2f:
                r5.write(r0)
            L32:
                r1.printTo(r5, r6, r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.PeriodFormatterBuilder.Separator.printTo(java.io.Writer, org.joda.time.ReadablePeriod, java.util.Locale):void");
        }

        /* JADX WARN: Code duplicated, block: B:17:0x002d  */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
        
            if (r1.countFieldsToPrint(r6, 1, r7) > 0) goto L17;
         */
        @Override // org.joda.time.format.PeriodPrinter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void printTo(java.lang.StringBuffer r5, org.joda.time.ReadablePeriod r6, java.util.Locale r7) {
            /*
                r4 = this;
                org.joda.time.format.PeriodPrinter r0 = r4.iBeforePrinter
                org.joda.time.format.PeriodPrinter r1 = r4.iAfterPrinter
                r0.printTo(r5, r6, r7)
                boolean r2 = r4.iUseBefore
                r3 = 1
                if (r2 == 0) goto L23
                int r0 = r0.countFieldsToPrint(r6, r3, r7)
                if (r0 <= 0) goto L32
                boolean r0 = r4.iUseAfter
                if (r0 == 0) goto L2d
                r0 = 2
                int r0 = r1.countFieldsToPrint(r6, r0, r7)
                if (r0 <= 0) goto L32
                if (r0 <= r3) goto L20
                goto L2d
            L20:
                java.lang.String r0 = r4.iFinalText
                goto L2f
            L23:
                boolean r0 = r4.iUseAfter
                if (r0 == 0) goto L32
                int r0 = r1.countFieldsToPrint(r6, r3, r7)
                if (r0 <= 0) goto L32
            L2d:
                java.lang.String r0 = r4.iText
            L2f:
                r5.append(r0)
            L32:
                r1.printTo(r5, r6, r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.PeriodFormatterBuilder.Separator.printTo(java.lang.StringBuffer, org.joda.time.ReadablePeriod, java.util.Locale):void");
        }
    }

    public static class SimpleAffix extends IgnorableAffix {
        private final String iText;

        public SimpleAffix(String str) {
            this.iText = str;
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int calculatePrintedLength(int i10) {
            return this.iText.length();
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public String[] getAffixes() {
            return new String[]{this.iText};
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int parse(String str, int i10) {
            String str2 = this.iText;
            int length = str2.length();
            return (!str.regionMatches(true, i10, str2, 0, length) || matchesOtherAffix(length, str, i10)) ? ~i10 : i10 + length;
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public void printTo(Writer writer, int i10) throws IOException {
            writer.write(this.iText);
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public void printTo(StringBuffer stringBuffer, int i10) {
            stringBuffer.append(this.iText);
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int scan(String str, int i10) {
            String str2 = this.iText;
            int length = str2.length();
            int length2 = str.length();
            for (int i11 = i10; i11 < length2; i11++) {
                if (str.regionMatches(true, i11, str2, 0, length) && !matchesOtherAffix(length, str, i11)) {
                    return i11;
                }
                switch (str.charAt(i11)) {
                    case '+':
                    case ',':
                    case '-':
                    case '.':
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        break;
                }
                return ~i10;
            }
            return ~i10;
        }
    }

    public PeriodFormatterBuilder() {
        clear();
    }

    private PeriodFormatterBuilder append0(PeriodPrinter periodPrinter, PeriodParser periodParser) {
        this.iElementPairs.add(periodPrinter);
        this.iElementPairs.add(periodParser);
        this.iNotPrinter = (periodPrinter == null) | this.iNotPrinter;
        this.iNotParser |= periodParser == null;
        return this;
    }

    private void appendField(int i10) {
        appendField(i10, this.iMinPrintedDigits);
    }

    private void appendField(int i10, int i11) {
        FieldFormatter fieldFormatter = new FieldFormatter(i11, this.iPrintZeroSetting, this.iMaxParsedDigits, this.iRejectSignedValues, i10, this.iFieldFormatters, this.iPrefix, null);
        append0(fieldFormatter, fieldFormatter);
        this.iFieldFormatters[i10] = fieldFormatter;
        this.iPrefix = null;
    }

    private PeriodFormatterBuilder appendPrefix(PeriodFieldAffix periodFieldAffix) {
        if (periodFieldAffix == null) {
            throw new IllegalArgumentException();
        }
        PeriodFieldAffix periodFieldAffix2 = this.iPrefix;
        if (periodFieldAffix2 != null) {
            periodFieldAffix = new CompositeAffix(periodFieldAffix2, periodFieldAffix);
        }
        this.iPrefix = periodFieldAffix;
        return this;
    }

    private PeriodFormatterBuilder appendSeparator(String str, String str2, String[] strArr, boolean z10, boolean z11) {
        if (str == null || str2 == null) {
            throw new IllegalArgumentException();
        }
        clearPrefix();
        List<Object> listSubList = this.iElementPairs;
        if (listSubList.size() == 0) {
            if (z11 && !z10) {
                Literal literal = Literal.EMPTY;
                Separator separator = new Separator(str, str2, strArr, literal, literal, z10, z11);
                append0(separator, separator);
            }
            return this;
        }
        Separator separator2 = null;
        int size = listSubList.size();
        while (true) {
            int i10 = size - 1;
            if (i10 < 0) {
                break;
            }
            if (listSubList.get(i10) instanceof Separator) {
                separator2 = (Separator) listSubList.get(i10);
                listSubList = listSubList.subList(i10 + 1, listSubList.size());
                break;
            }
            size = i10 - 1;
        }
        List<Object> list = listSubList;
        if (separator2 != null && list.size() == 0) {
            throw new IllegalStateException("Cannot have two adjacent separators");
        }
        Object[] objArrCreateComposite = createComposite(list);
        list.clear();
        Separator separator3 = new Separator(str, str2, strArr, (PeriodPrinter) objArrCreateComposite[0], (PeriodParser) objArrCreateComposite[1], z10, z11);
        list.add(separator3);
        list.add(separator3);
        return this;
    }

    private PeriodFormatterBuilder appendSuffix(PeriodFieldAffix periodFieldAffix) {
        Object obj;
        Object obj2 = null;
        if (this.iElementPairs.size() > 0) {
            List<Object> list = this.iElementPairs;
            obj2 = list.get(list.size() - 2);
            List<Object> list2 = this.iElementPairs;
            obj = list2.get(list2.size() - 1);
        } else {
            obj = null;
        }
        if (obj2 == null || obj == null || obj2 != obj || !(obj2 instanceof FieldFormatter)) {
            throw new IllegalStateException("No field to apply suffix to");
        }
        clearPrefix();
        FieldFormatter fieldFormatter = new FieldFormatter((FieldFormatter) obj2, periodFieldAffix);
        List<Object> list3 = this.iElementPairs;
        list3.set(list3.size() - 2, fieldFormatter);
        List<Object> list4 = this.iElementPairs;
        list4.set(list4.size() - 1, fieldFormatter);
        this.iFieldFormatters[fieldFormatter.getFieldType()] = fieldFormatter;
        return this;
    }

    private void clearPrefix() throws IllegalStateException {
        if (this.iPrefix != null) {
            throw new IllegalStateException("Prefix not followed by field");
        }
        this.iPrefix = null;
    }

    private static Object[] createComposite(List<Object> list) {
        int size = list.size();
        if (size == 0) {
            Literal literal = Literal.EMPTY;
            return new Object[]{literal, literal};
        }
        if (size == 1) {
            return new Object[]{list.get(0), list.get(1)};
        }
        Composite composite = new Composite(list);
        return new Object[]{composite, composite};
    }

    private static PeriodFormatter toFormatter(List<Object> list, boolean z10, boolean z11) {
        if (z10 && z11) {
            throw new IllegalStateException("Builder has created neither a printer nor a parser");
        }
        int size = list.size();
        if (size >= 2 && (list.get(0) instanceof Separator)) {
            Separator separator = (Separator) list.get(0);
            if (separator.iAfterParser == null && separator.iAfterPrinter == null) {
                PeriodFormatter formatter = toFormatter(list.subList(2, size), z10, z11);
                Separator separatorFinish = separator.finish(formatter.getPrinter(), formatter.getParser());
                return new PeriodFormatter(separatorFinish, separatorFinish);
            }
        }
        Object[] objArrCreateComposite = createComposite(list);
        if (z10) {
            return new PeriodFormatter(null, (PeriodParser) objArrCreateComposite[1]);
        }
        return z11 ? new PeriodFormatter((PeriodPrinter) objArrCreateComposite[0], null) : new PeriodFormatter((PeriodPrinter) objArrCreateComposite[0], (PeriodParser) objArrCreateComposite[1]);
    }

    public PeriodFormatterBuilder append(PeriodFormatter periodFormatter) {
        if (periodFormatter == null) {
            throw new IllegalArgumentException("No formatter supplied");
        }
        clearPrefix();
        append0(periodFormatter.getPrinter(), periodFormatter.getParser());
        return this;
    }

    public PeriodFormatterBuilder append(PeriodPrinter periodPrinter, PeriodParser periodParser) {
        if (periodPrinter == null && periodParser == null) {
            throw new IllegalArgumentException("No printer or parser supplied");
        }
        clearPrefix();
        append0(periodPrinter, periodParser);
        return this;
    }

    public PeriodFormatterBuilder appendDays() {
        appendField(3);
        return this;
    }

    public PeriodFormatterBuilder appendHours() {
        appendField(4);
        return this;
    }

    public PeriodFormatterBuilder appendLiteral(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Literal must not be null");
        }
        clearPrefix();
        Literal literal = new Literal(str);
        append0(literal, literal);
        return this;
    }

    public PeriodFormatterBuilder appendMillis() {
        appendField(7);
        return this;
    }

    public PeriodFormatterBuilder appendMillis3Digit() {
        appendField(7, 3);
        return this;
    }

    public PeriodFormatterBuilder appendMinutes() {
        appendField(5);
        return this;
    }

    public PeriodFormatterBuilder appendMonths() {
        appendField(1);
        return this;
    }

    public PeriodFormatterBuilder appendPrefix(String str) {
        if (str != null) {
            return appendPrefix(new SimpleAffix(str));
        }
        throw new IllegalArgumentException();
    }

    public PeriodFormatterBuilder appendPrefix(String str, String str2) {
        if (str == null || str2 == null) {
            throw new IllegalArgumentException();
        }
        return appendPrefix(new PluralAffix(str, str2));
    }

    public PeriodFormatterBuilder appendPrefix(String[] strArr, String[] strArr2) {
        if (strArr == null || strArr2 == null || strArr.length < 1 || strArr.length != strArr2.length) {
            throw new IllegalArgumentException();
        }
        return appendPrefix(new RegExAffix(strArr, strArr2));
    }

    public PeriodFormatterBuilder appendSeconds() {
        appendField(6);
        return this;
    }

    public PeriodFormatterBuilder appendSecondsWithMillis() {
        appendField(8);
        return this;
    }

    public PeriodFormatterBuilder appendSecondsWithOptionalMillis() {
        appendField(9);
        return this;
    }

    public PeriodFormatterBuilder appendSeparator(String str) {
        return appendSeparator(str, str, null, true, true);
    }

    public PeriodFormatterBuilder appendSeparator(String str, String str2) {
        return appendSeparator(str, str2, null, true, true);
    }

    public PeriodFormatterBuilder appendSeparator(String str, String str2, String[] strArr) {
        return appendSeparator(str, str2, strArr, true, true);
    }

    public PeriodFormatterBuilder appendSeparatorIfFieldsAfter(String str) {
        return appendSeparator(str, str, null, false, true);
    }

    public PeriodFormatterBuilder appendSeparatorIfFieldsBefore(String str) {
        return appendSeparator(str, str, null, true, false);
    }

    public PeriodFormatterBuilder appendSuffix(String str) {
        if (str != null) {
            return appendSuffix(new SimpleAffix(str));
        }
        throw new IllegalArgumentException();
    }

    public PeriodFormatterBuilder appendSuffix(String str, String str2) {
        if (str == null || str2 == null) {
            throw new IllegalArgumentException();
        }
        return appendSuffix(new PluralAffix(str, str2));
    }

    public PeriodFormatterBuilder appendSuffix(String[] strArr, String[] strArr2) {
        if (strArr == null || strArr2 == null || strArr.length < 1 || strArr.length != strArr2.length) {
            throw new IllegalArgumentException();
        }
        return appendSuffix(new RegExAffix(strArr, strArr2));
    }

    public PeriodFormatterBuilder appendWeeks() {
        appendField(2);
        return this;
    }

    public PeriodFormatterBuilder appendYears() {
        appendField(0);
        return this;
    }

    public void clear() {
        this.iMinPrintedDigits = 1;
        this.iPrintZeroSetting = 2;
        this.iMaxParsedDigits = 10;
        this.iRejectSignedValues = false;
        this.iPrefix = null;
        List<Object> list = this.iElementPairs;
        if (list == null) {
            this.iElementPairs = new ArrayList();
        } else {
            list.clear();
        }
        this.iNotPrinter = false;
        this.iNotParser = false;
        this.iFieldFormatters = new FieldFormatter[10];
    }

    public PeriodFormatterBuilder maximumParsedDigits(int i10) {
        this.iMaxParsedDigits = i10;
        return this;
    }

    public PeriodFormatterBuilder minimumPrintedDigits(int i10) {
        this.iMinPrintedDigits = i10;
        return this;
    }

    public PeriodFormatterBuilder printZeroAlways() {
        this.iPrintZeroSetting = 4;
        return this;
    }

    public PeriodFormatterBuilder printZeroIfSupported() {
        this.iPrintZeroSetting = 3;
        return this;
    }

    public PeriodFormatterBuilder printZeroNever() {
        this.iPrintZeroSetting = 5;
        return this;
    }

    public PeriodFormatterBuilder printZeroRarelyFirst() {
        this.iPrintZeroSetting = 1;
        return this;
    }

    public PeriodFormatterBuilder printZeroRarelyLast() {
        this.iPrintZeroSetting = 2;
        return this;
    }

    public PeriodFormatterBuilder rejectSignedValues(boolean z10) {
        this.iRejectSignedValues = z10;
        return this;
    }

    public PeriodFormatter toFormatter() {
        PeriodFormatter formatter = toFormatter(this.iElementPairs, this.iNotPrinter, this.iNotParser);
        for (FieldFormatter fieldFormatter : this.iFieldFormatters) {
            if (fieldFormatter != null) {
                fieldFormatter.finish(this.iFieldFormatters);
            }
        }
        this.iFieldFormatters = (FieldFormatter[]) this.iFieldFormatters.clone();
        return formatter;
    }

    public PeriodParser toParser() {
        if (this.iNotParser) {
            return null;
        }
        return toFormatter().getParser();
    }

    public PeriodPrinter toPrinter() {
        if (this.iNotPrinter) {
            return null;
        }
        return toFormatter().getPrinter();
    }
}
