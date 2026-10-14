package org.joda.time.tz;

import android.support.v4.media.c;
import androidx.activity.j;
import androidx.activity.k;
import com.applovin.sdk.AppLovinMediationProvider;
import com.developer.filepicker.model.DialogConfigs;
import com.facebook.ads.AdError;
import defpackage.a;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.MutableDateTime;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
import y.q;

/* JADX INFO: loaded from: classes3.dex */
public class ZoneInfoCompiler {
    public static Chronology cLenientISO;
    public static DateTimeOfYear cStartOfYear;
    private Map<String, RuleSet> iRuleSets = new HashMap();
    private List<Zone> iZones = new ArrayList();
    private List<String> iGoodLinks = new ArrayList();
    private List<String> iBackLinks = new ArrayList();

    public static class DateTimeOfYear {
        public final boolean iAdvanceDayOfWeek;
        public final int iDayOfMonth;
        public final int iDayOfWeek;
        public final int iMillisOfDay;
        public final int iMonthOfYear;
        public final char iZoneChar;

        public DateTimeOfYear() {
            this.iMonthOfYear = 1;
            this.iDayOfMonth = 1;
            this.iDayOfWeek = 0;
            this.iAdvanceDayOfWeek = false;
            this.iMillisOfDay = 0;
            this.iZoneChar = 'w';
        }

        public DateTimeOfYear(StringTokenizer stringTokenizer) {
            int i10;
            boolean z10;
            int i11;
            int dayOfWeek;
            LocalDate localDate;
            LocalDate localDatePlusDays;
            int time = 0;
            int i12 = 1;
            char zoneChar = 'w';
            if (stringTokenizer.hasMoreTokens()) {
                int month = ZoneInfoCompiler.parseMonth(stringTokenizer.nextToken());
                if (stringTokenizer.hasMoreTokens()) {
                    String strNextToken = stringTokenizer.nextToken();
                    if (strNextToken.startsWith("last")) {
                        z10 = false;
                        dayOfWeek = ZoneInfoCompiler.parseDayOfWeek(strNextToken.substring(4));
                        i11 = -1;
                    } else {
                        try {
                            i11 = Integer.parseInt(strNextToken);
                            dayOfWeek = 0;
                            z10 = false;
                        } catch (NumberFormatException unused) {
                            int iIndexOf = strNextToken.indexOf(">=");
                            if (iIndexOf > 0) {
                                int i13 = Integer.parseInt(strNextToken.substring(iIndexOf + 2));
                                dayOfWeek = ZoneInfoCompiler.parseDayOfWeek(strNextToken.substring(0, iIndexOf));
                                i11 = i13;
                                z10 = true;
                            } else {
                                int iIndexOf2 = strNextToken.indexOf("<=");
                                if (iIndexOf2 <= 0) {
                                    throw new IllegalArgumentException(strNextToken);
                                }
                                int i14 = Integer.parseInt(strNextToken.substring(iIndexOf2 + 2));
                                dayOfWeek = ZoneInfoCompiler.parseDayOfWeek(strNextToken.substring(0, iIndexOf2));
                                i11 = i14;
                                z10 = false;
                            }
                        }
                    }
                    if (stringTokenizer.hasMoreTokens()) {
                        String strNextToken2 = stringTokenizer.nextToken();
                        zoneChar = ZoneInfoCompiler.parseZoneChar(strNextToken2.charAt(strNextToken2.length() - 1));
                        if (strNextToken2.equals("24:00")) {
                            if (month == 12 && i11 == 31) {
                                strNextToken2 = "23:59:59.999";
                            } else {
                                if (i11 == -1) {
                                    localDate = new LocalDate(AdError.INTERNAL_ERROR_CODE, month, 1);
                                    localDatePlusDays = localDate.plusMonths(1);
                                } else {
                                    localDate = new LocalDate(AdError.INTERNAL_ERROR_CODE, month, i11);
                                    localDatePlusDays = localDate.plusDays(1);
                                }
                                boolean z11 = (i11 == -1 || dayOfWeek == 0) ? false : true;
                                int monthOfYear = localDatePlusDays.getMonthOfYear();
                                int dayOfMonth = localDatePlusDays.getDayOfMonth();
                                dayOfWeek = dayOfWeek != 0 ? (((dayOfWeek - 1) + 1) % 7) + 1 : dayOfWeek;
                                z10 = z11;
                                i12 = monthOfYear;
                                i11 = dayOfMonth;
                            }
                        }
                        time = ZoneInfoCompiler.parseTime(strNextToken2);
                        i12 = month;
                    } else {
                        i12 = month;
                    }
                    i10 = time;
                    time = dayOfWeek;
                } else {
                    i10 = 0;
                    z10 = false;
                    i11 = 1;
                    i12 = month;
                }
            } else {
                i10 = 0;
                z10 = false;
                i11 = 1;
            }
            this.iMonthOfYear = i12;
            this.iDayOfMonth = i11;
            this.iDayOfWeek = time;
            this.iAdvanceDayOfWeek = z10;
            this.iMillisOfDay = i10;
            this.iZoneChar = zoneChar;
        }

        public void addCutover(DateTimeZoneBuilder dateTimeZoneBuilder, int i10) {
            dateTimeZoneBuilder.addCutover(i10, this.iZoneChar, this.iMonthOfYear, this.iDayOfMonth, this.iDayOfWeek, this.iAdvanceDayOfWeek, this.iMillisOfDay);
        }

        public void addRecurring(DateTimeZoneBuilder dateTimeZoneBuilder, String str, int i10, int i11, int i12) {
            dateTimeZoneBuilder.addRecurringSavings(str, i10, i11, i12, this.iZoneChar, this.iMonthOfYear, this.iDayOfMonth, this.iDayOfWeek, this.iAdvanceDayOfWeek, this.iMillisOfDay);
        }

        public String toString() {
            StringBuilder sbA = a.a("MonthOfYear: ");
            sbA.append(this.iMonthOfYear);
            sbA.append("\nDayOfMonth: ");
            sbA.append(this.iDayOfMonth);
            sbA.append("\nDayOfWeek: ");
            sbA.append(this.iDayOfWeek);
            sbA.append("\nAdvanceDayOfWeek: ");
            sbA.append(this.iAdvanceDayOfWeek);
            sbA.append("\nMillisOfDay: ");
            sbA.append(this.iMillisOfDay);
            sbA.append("\nZoneChar: ");
            sbA.append(this.iZoneChar);
            sbA.append("\n");
            return sbA.toString();
        }
    }

    public static class Rule {
        public final DateTimeOfYear iDateTimeOfYear;
        public final int iFromYear;
        public final String iLetterS;
        public final String iName;
        public final int iSaveMillis;
        public final int iToYear;
        public final String iType;

        public Rule(StringTokenizer stringTokenizer) {
            if (stringTokenizer.countTokens() < 6) {
                throw new IllegalArgumentException("Attempting to create a Rule from an incomplete tokenizer");
            }
            this.iName = stringTokenizer.nextToken().intern();
            int year = ZoneInfoCompiler.parseYear(stringTokenizer.nextToken(), 0);
            this.iFromYear = year;
            int year2 = ZoneInfoCompiler.parseYear(stringTokenizer.nextToken(), year);
            this.iToYear = year2;
            if (year2 < year) {
                throw new IllegalArgumentException();
            }
            this.iType = ZoneInfoCompiler.parseOptional(stringTokenizer.nextToken());
            this.iDateTimeOfYear = new DateTimeOfYear(stringTokenizer);
            this.iSaveMillis = ZoneInfoCompiler.parseTime(stringTokenizer.nextToken());
            this.iLetterS = ZoneInfoCompiler.parseOptional(stringTokenizer.nextToken());
        }

        public Rule(Rule rule) {
            this.iName = rule.iName;
            this.iFromYear = 1800;
            this.iToYear = rule.iFromYear;
            this.iType = null;
            this.iDateTimeOfYear = rule.iDateTimeOfYear;
            this.iSaveMillis = 0;
            this.iLetterS = rule.iLetterS;
        }

        private static String formatName(String str, int i10, String str2) {
            int iIndexOf = str.indexOf(47);
            if (iIndexOf > 0) {
                return (i10 == 0 ? str.substring(0, iIndexOf) : str.substring(iIndexOf + 1)).intern();
            }
            int iIndexOf2 = str.indexOf("%s");
            if (iIndexOf2 < 0) {
                return str;
            }
            String strSubstring = str.substring(0, iIndexOf2);
            String strSubstring2 = str.substring(iIndexOf2 + 2);
            return (str2 == null ? strSubstring.concat(strSubstring2) : j.a(strSubstring, str2, strSubstring2)).intern();
        }

        public void addRecurring(DateTimeZoneBuilder dateTimeZoneBuilder, int i10, String str) {
            int i11 = this.iSaveMillis + (-i10);
            this.iDateTimeOfYear.addRecurring(dateTimeZoneBuilder, formatName(str, i11, this.iLetterS), i11, this.iFromYear, this.iToYear);
        }

        public String toString() {
            StringBuilder sbA = a.a("[Rule]\nName: ");
            sbA.append(this.iName);
            sbA.append("\nFromYear: ");
            sbA.append(this.iFromYear);
            sbA.append("\nToYear: ");
            sbA.append(this.iToYear);
            sbA.append("\nType: ");
            sbA.append(this.iType);
            sbA.append("\n");
            sbA.append(this.iDateTimeOfYear);
            sbA.append("SaveMillis: ");
            sbA.append(this.iSaveMillis);
            sbA.append("\nLetterS: ");
            return k.a(sbA, this.iLetterS, "\n");
        }
    }

    public static class RuleSet {
        private List<Rule> iRules;

        public RuleSet(Rule rule) {
            ArrayList arrayList = new ArrayList();
            this.iRules = arrayList;
            arrayList.add(rule);
        }

        public void addRecurring(DateTimeZoneBuilder dateTimeZoneBuilder, int i10, String str) {
            int iMin = 0;
            for (int i11 = 0; i11 < this.iRules.size(); i11++) {
                int i12 = this.iRules.get(i11).iSaveMillis;
                if (i12 < 0) {
                    iMin = Math.min(iMin, i12);
                }
            }
            if (iMin < 0) {
                PrintStream printStream = System.out;
                StringBuilder sbA = a.a("Fixed negative save values for rule '");
                sbA.append(this.iRules.get(0).iName);
                sbA.append("'");
                printStream.println(sbA.toString());
                i10 += iMin;
                int iIndexOf = str.indexOf(DialogConfigs.DIRECTORY_SEPERATOR);
                if (iIndexOf > 0) {
                    str = str.substring(iIndexOf + 1) + DialogConfigs.DIRECTORY_SEPERATOR + str.substring(0, iIndexOf);
                }
            }
            dateTimeZoneBuilder.setStandardOffset(i10);
            if (iMin < 0) {
                new Rule(this.iRules.get(0)).addRecurring(dateTimeZoneBuilder, iMin, str);
            }
            for (int i13 = 0; i13 < this.iRules.size(); i13++) {
                this.iRules.get(i13).addRecurring(dateTimeZoneBuilder, iMin, str);
            }
        }

        public void addRule(Rule rule) {
            if (!rule.iName.equals(this.iRules.get(0).iName)) {
                throw new IllegalArgumentException("Rule name mismatch");
            }
            this.iRules.add(rule);
        }
    }

    public static class Zone {
        public final String iFormat;
        public final String iName;
        private Zone iNext;
        public final int iOffsetMillis;
        public final String iRules;
        public final DateTimeOfYear iUntilDateTimeOfYear;
        public final int iUntilYear;

        private Zone(String str, StringTokenizer stringTokenizer) {
            int i10;
            this.iName = str.intern();
            this.iOffsetMillis = ZoneInfoCompiler.parseTime(stringTokenizer.nextToken());
            this.iRules = ZoneInfoCompiler.parseOptional(stringTokenizer.nextToken());
            this.iFormat = stringTokenizer.nextToken().intern();
            DateTimeOfYear startOfYear = ZoneInfoCompiler.getStartOfYear();
            if (stringTokenizer.hasMoreTokens()) {
                i10 = Integer.parseInt(stringTokenizer.nextToken());
                if (stringTokenizer.hasMoreTokens()) {
                    startOfYear = new DateTimeOfYear(stringTokenizer);
                }
            } else {
                i10 = Integer.MAX_VALUE;
            }
            this.iUntilYear = i10;
            this.iUntilDateTimeOfYear = startOfYear;
        }

        public Zone(StringTokenizer stringTokenizer) {
            this(stringTokenizer.nextToken(), stringTokenizer);
        }

        private static void addToBuilder(Zone zone, DateTimeZoneBuilder dateTimeZoneBuilder, Map<String, RuleSet> map) {
            while (zone != null) {
                String str = zone.iRules;
                if (str == null) {
                    dateTimeZoneBuilder.setStandardOffset(zone.iOffsetMillis);
                    dateTimeZoneBuilder.setFixedSavings(zone.iFormat, 0);
                } else {
                    try {
                        int time = ZoneInfoCompiler.parseTime(str);
                        dateTimeZoneBuilder.setStandardOffset(zone.iOffsetMillis);
                        dateTimeZoneBuilder.setFixedSavings(zone.iFormat, time);
                    } catch (Exception unused) {
                        RuleSet ruleSet = map.get(zone.iRules);
                        if (ruleSet == null) {
                            StringBuilder sbA = a.a("Rules not found: ");
                            sbA.append(zone.iRules);
                            throw new IllegalArgumentException(sbA.toString());
                        }
                        ruleSet.addRecurring(dateTimeZoneBuilder, zone.iOffsetMillis, zone.iFormat);
                    }
                }
                int i10 = zone.iUntilYear;
                if (i10 == Integer.MAX_VALUE) {
                    return;
                }
                zone.iUntilDateTimeOfYear.addCutover(dateTimeZoneBuilder, i10);
                zone = zone.iNext;
            }
        }

        public void addToBuilder(DateTimeZoneBuilder dateTimeZoneBuilder, Map<String, RuleSet> map) {
            addToBuilder(this, dateTimeZoneBuilder, map);
        }

        public void chain(StringTokenizer stringTokenizer) {
            Zone zone = this.iNext;
            if (zone != null) {
                zone.chain(stringTokenizer);
            } else {
                this.iNext = new Zone(this.iName, stringTokenizer);
            }
        }

        public String toString() {
            StringBuilder sbA = a.a("[Zone]\nName: ");
            sbA.append(this.iName);
            sbA.append("\nOffsetMillis: ");
            sbA.append(this.iOffsetMillis);
            sbA.append("\nRules: ");
            sbA.append(this.iRules);
            sbA.append("\nFormat: ");
            sbA.append(this.iFormat);
            sbA.append("\nUntilYear: ");
            sbA.append(this.iUntilYear);
            sbA.append("\n");
            sbA.append(this.iUntilDateTimeOfYear);
            String string = sbA.toString();
            if (this.iNext == null) {
                return string;
            }
            StringBuilder sbA2 = c.a(string, "...\n");
            sbA2.append(this.iNext.toString());
            return sbA2.toString();
        }
    }

    public static Chronology getLenientISOChronology() {
        if (cLenientISO == null) {
            cLenientISO = LenientChronology.getInstance(ISOChronology.getInstanceUTC());
        }
        return cLenientISO;
    }

    public static DateTimeOfYear getStartOfYear() {
        if (cStartOfYear == null) {
            cStartOfYear = new DateTimeOfYear();
        }
        return cStartOfYear;
    }

    public static void main(String[] strArr) throws Exception {
        if (strArr.length == 0) {
            printUsage();
            return;
        }
        File file = null;
        int i10 = 0;
        File file2 = null;
        int i11 = 0;
        boolean z10 = false;
        while (i11 < strArr.length) {
            try {
                if (!"-src".equals(strArr[i11])) {
                    if (!"-dst".equals(strArr[i11])) {
                        if (!"-verbose".equals(strArr[i11])) {
                            if (!"-?".equals(strArr[i11])) {
                                break;
                            }
                            printUsage();
                            return;
                        }
                        z10 = true;
                    } else {
                        i11++;
                        file2 = new File(strArr[i11]);
                    }
                } else {
                    i11++;
                    file = new File(strArr[i11]);
                }
                i11++;
            } catch (IndexOutOfBoundsException unused) {
                printUsage();
                return;
            }
        }
        if (i11 >= strArr.length) {
            printUsage();
            return;
        }
        File[] fileArr = new File[strArr.length - i11];
        while (i11 < strArr.length) {
            fileArr[i10] = file == null ? new File(strArr[i11]) : new File(file, strArr[i11]);
            i11++;
            i10++;
        }
        ZoneInfoLogger.set(z10);
        new ZoneInfoCompiler().compile(file2, fileArr);
    }

    public static int parseDayOfWeek(String str) {
        DateTimeField dateTimeFieldDayOfWeek = ISOChronology.getInstanceUTC().dayOfWeek();
        return dateTimeFieldDayOfWeek.get(dateTimeFieldDayOfWeek.set(0L, str, Locale.ENGLISH));
    }

    public static int parseMonth(String str) {
        DateTimeField dateTimeFieldMonthOfYear = ISOChronology.getInstanceUTC().monthOfYear();
        return dateTimeFieldMonthOfYear.get(dateTimeFieldMonthOfYear.set(0L, str, Locale.ENGLISH));
    }

    public static String parseOptional(String str) {
        if (str.equals("-")) {
            return null;
        }
        return str;
    }

    public static int parseTime(String str) {
        DateTimeFormatter dateTimeFormatterHourMinuteSecondFraction = ISODateTimeFormat.hourMinuteSecondFraction();
        MutableDateTime mutableDateTime = new MutableDateTime(0L, getLenientISOChronology());
        boolean zStartsWith = str.startsWith("-");
        if (dateTimeFormatterHourMinuteSecondFraction.parseInto(mutableDateTime, str, zStartsWith ? 1 : 0) == (~(zStartsWith ? 1 : 0))) {
            throw new IllegalArgumentException(str);
        }
        int millis = (int) mutableDateTime.getMillis();
        return zStartsWith ? -millis : millis;
    }

    public static int parseYear(String str, int i10) {
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        if (lowerCase.equals("minimum") || lowerCase.equals("min")) {
            return Integer.MIN_VALUE;
        }
        if (lowerCase.equals("maximum") || lowerCase.equals(AppLovinMediationProvider.MAX)) {
            return Integer.MAX_VALUE;
        }
        return lowerCase.equals("only") ? i10 : Integer.parseInt(lowerCase);
    }

    public static char parseZoneChar(char c10) {
        if (c10 != 'G') {
            if (c10 != 'S') {
                if (c10 != 'U' && c10 != 'Z' && c10 != 'g') {
                    if (c10 != 's') {
                        if (c10 != 'u' && c10 != 'z') {
                            return 'w';
                        }
                    }
                }
            }
            return 's';
        }
        return 'u';
    }

    private static void printUsage() {
        System.out.println("Usage: java org.joda.time.tz.ZoneInfoCompiler <options> <source files>");
        System.out.println("where possible options include:");
        System.out.println("  -src <directory>    Specify where to read source files");
        System.out.println("  -dst <directory>    Specify where to write generated files");
        System.out.println("  -verbose            Output verbosely (default false)");
    }

    public static boolean test(String str, DateTimeZone dateTimeZone) {
        PrintStream printStream;
        StringBuilder sbA;
        DateTime dateTime;
        if (!str.equals(dateTimeZone.getID())) {
            return true;
        }
        long j10 = ISOChronology.getInstanceUTC().year().set(0L, 1850);
        long j11 = ISOChronology.getInstanceUTC().year().set(0L, 2050);
        int offset = dateTimeZone.getOffset(j10);
        int standardOffset = dateTimeZone.getStandardOffset(j10);
        String nameKey = dateTimeZone.getNameKey(j10);
        ArrayList arrayList = new ArrayList();
        while (true) {
            long jNextTransition = dateTimeZone.nextTransition(j10);
            if (jNextTransition == j10 || jNextTransition > j11) {
                long j12 = ISOChronology.getInstanceUTC().year().set(0L, 2050);
                long j13 = ISOChronology.getInstanceUTC().year().set(0L, 1850);
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        return true;
                    }
                    long jPreviousTransition = dateTimeZone.previousTransition(j12);
                    if (jPreviousTransition == j12 || jPreviousTransition < j13) {
                        return true;
                    }
                    long jLongValue = ((Long) arrayList.get(size)).longValue() - 1;
                    if (jLongValue != jPreviousTransition) {
                        printStream = System.out;
                        sbA = a.a("*r* Error in ");
                        sbA.append(dateTimeZone.getID());
                        sbA.append(" ");
                        sbA.append(new DateTime(jPreviousTransition, ISOChronology.getInstanceUTC()));
                        sbA.append(" != ");
                        dateTime = new DateTime(jLongValue, ISOChronology.getInstanceUTC());
                        break;
                    }
                    j12 = jPreviousTransition;
                }
                sbA.append(dateTime);
            } else {
                int offset2 = dateTimeZone.getOffset(jNextTransition);
                int standardOffset2 = dateTimeZone.getStandardOffset(jNextTransition);
                String nameKey2 = dateTimeZone.getNameKey(jNextTransition);
                if (offset == offset2 && standardOffset == standardOffset2 && nameKey.equals(nameKey2)) {
                    printStream = System.out;
                    sbA = a.a("*d* Error in ");
                    sbA.append(dateTimeZone.getID());
                    sbA.append(" ");
                    dateTime = new DateTime(jNextTransition, ISOChronology.getInstanceUTC());
                    sbA.append(dateTime);
                } else if (nameKey2 == null || (nameKey2.length() < 3 && !"??".equals(nameKey2))) {
                    printStream = System.out;
                    sbA = a.a("*s* Error in ");
                    sbA.append(dateTimeZone.getID());
                    sbA.append(" ");
                    sbA.append(new DateTime(jNextTransition, ISOChronology.getInstanceUTC()));
                    sbA.append(", nameKey=");
                    sbA.append(nameKey2);
                } else {
                    arrayList.add(Long.valueOf(jNextTransition));
                    offset = offset2;
                    j10 = jNextTransition;
                    nameKey = nameKey2;
                }
            }
            printStream.println(sbA.toString());
            return false;
        }
    }

    private void writeZone(File file, DateTimeZoneBuilder dateTimeZoneBuilder, DateTimeZone dateTimeZone) throws IOException {
        if (ZoneInfoLogger.verbose()) {
            PrintStream printStream = System.out;
            StringBuilder sbA = a.a("Writing ");
            sbA.append(dateTimeZone.getID());
            printStream.println(sbA.toString());
        }
        File file2 = new File(file, dateTimeZone.getID());
        if (!file2.getParentFile().exists()) {
            file2.getParentFile().mkdirs();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        try {
            dateTimeZoneBuilder.writeTo(dateTimeZone.getID(), fileOutputStream);
            fileOutputStream.close();
            FileInputStream fileInputStream = new FileInputStream(file2);
            DateTimeZone from = DateTimeZoneBuilder.readFrom(fileInputStream, dateTimeZone.getID());
            fileInputStream.close();
            if (dateTimeZone.equals(from)) {
                return;
            }
            PrintStream printStream2 = System.out;
            StringBuilder sbA2 = a.a("*e* Error in ");
            sbA2.append(dateTimeZone.getID());
            sbA2.append(": Didn't read properly from file");
            printStream2.println(sbA2.toString());
        } catch (Throwable th) {
            fileOutputStream.close();
            throw th;
        }
    }

    public static void writeZoneInfoMap(DataOutputStream dataOutputStream, Map<String, DateTimeZone> map) throws IOException {
        if (dataOutputStream == null) {
            throw new IllegalArgumentException("DataOutputStream must not be null.");
        }
        HashMap map2 = new HashMap(map.size());
        TreeMap treeMap = new TreeMap();
        short s10 = 0;
        for (Map.Entry<String, DateTimeZone> entry : map.entrySet()) {
            String key = entry.getKey();
            if (!map2.containsKey(key)) {
                Short shValueOf = Short.valueOf(s10);
                map2.put(key, shValueOf);
                treeMap.put(shValueOf, key);
                s10 = (short) (s10 + 1);
                if (s10 == 0) {
                    throw new InternalError("Too many time zone ids");
                }
            }
            String id2 = entry.getValue().getID();
            if (!map2.containsKey(id2)) {
                Short shValueOf2 = Short.valueOf(s10);
                map2.put(id2, shValueOf2);
                treeMap.put(shValueOf2, id2);
                s10 = (short) (s10 + 1);
                if (s10 == 0) {
                    throw new InternalError("Too many time zone ids");
                }
            }
        }
        dataOutputStream.writeShort(treeMap.size());
        Iterator it = treeMap.values().iterator();
        while (it.hasNext()) {
            dataOutputStream.writeUTF((String) it.next());
        }
        dataOutputStream.writeShort(map.size());
        for (Map.Entry<String, DateTimeZone> entry2 : map.entrySet()) {
            dataOutputStream.writeShort(((Short) map2.get(entry2.getKey())).shortValue());
            dataOutputStream.writeShort(((Short) map2.get(entry2.getValue().getID())).shortValue());
        }
    }

    public Map<String, DateTimeZone> compile(File file, File[] fileArr) throws Throwable {
        if (fileArr != null) {
            for (int i10 = 0; i10 < fileArr.length; i10++) {
                BufferedReader bufferedReader = null;
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new FileReader(fileArr[i10]));
                    try {
                        parseDataFile(bufferedReader2, "backward".equals(fileArr[i10].getName()));
                        bufferedReader2.close();
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
        if (file != null) {
            if (!file.exists() && !file.mkdirs()) {
                throw new IOException("Destination directory doesn't exist and cannot be created: " + file);
            }
            if (!file.isDirectory()) {
                throw new IOException("Destination is not a directory: " + file);
            }
        }
        TreeMap treeMap = new TreeMap();
        TreeMap treeMap2 = new TreeMap();
        System.out.println("Writing zoneinfo files");
        for (int i11 = 0; i11 < this.iZones.size(); i11++) {
            Zone zone = this.iZones.get(i11);
            DateTimeZoneBuilder dateTimeZoneBuilder = new DateTimeZoneBuilder();
            zone.addToBuilder(dateTimeZoneBuilder, this.iRuleSets);
            DateTimeZone dateTimeZone = dateTimeZoneBuilder.toDateTimeZone(zone.iName, true);
            if (test(dateTimeZone.getID(), dateTimeZone)) {
                treeMap.put(dateTimeZone.getID(), dateTimeZone);
                treeMap2.put(dateTimeZone.getID(), zone);
                if (file != null) {
                    writeZone(file, dateTimeZoneBuilder, dateTimeZone);
                }
            }
        }
        for (int i12 = 0; i12 < this.iGoodLinks.size(); i12 += 2) {
            String str = this.iGoodLinks.get(i12);
            String str2 = this.iGoodLinks.get(i12 + 1);
            Zone zone2 = (Zone) treeMap2.get(str);
            if (zone2 == null) {
                System.out.println(q.a("Cannot find source zone '", str, "' to link alias '", str2, "' to"));
            } else {
                DateTimeZoneBuilder dateTimeZoneBuilder2 = new DateTimeZoneBuilder();
                zone2.addToBuilder(dateTimeZoneBuilder2, this.iRuleSets);
                DateTimeZone dateTimeZone2 = dateTimeZoneBuilder2.toDateTimeZone(str2, true);
                if (test(dateTimeZone2.getID(), dateTimeZone2)) {
                    treeMap.put(dateTimeZone2.getID(), dateTimeZone2);
                    if (file != null) {
                        writeZone(file, dateTimeZoneBuilder2, dateTimeZone2);
                    }
                }
                treeMap.put(dateTimeZone2.getID(), dateTimeZone2);
                if (ZoneInfoLogger.verbose()) {
                    System.out.println(q.a("Good link: ", str2, " -> ", str, " revived"));
                }
            }
        }
        for (int i13 = 0; i13 < 2; i13++) {
            for (int i14 = 0; i14 < this.iBackLinks.size(); i14 += 2) {
                String str3 = this.iBackLinks.get(i14);
                String str4 = this.iBackLinks.get(i14 + 1);
                DateTimeZone dateTimeZone3 = (DateTimeZone) treeMap.get(str3);
                if (dateTimeZone3 != null) {
                    treeMap.put(str4, dateTimeZone3);
                    if (ZoneInfoLogger.verbose()) {
                        PrintStream printStream = System.out;
                        StringBuilder sbA = androidx.activity.result.c.a("Back link: ", str4, " -> ");
                        sbA.append(dateTimeZone3.getID());
                        printStream.println(sbA.toString());
                    }
                } else if (i13 > 0) {
                    System.out.println(q.a("Cannot find time zone '", str3, "' to link alias '", str4, "' to"));
                }
            }
        }
        if (file != null) {
            System.out.println("Writing ZoneInfoMap");
            File file2 = new File(file, "ZoneInfoMap");
            if (!file2.getParentFile().exists()) {
                file2.getParentFile().mkdirs();
            }
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file2));
            try {
                TreeMap treeMap3 = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                treeMap3.putAll(treeMap);
                writeZoneInfoMap(dataOutputStream, treeMap3);
            } finally {
                dataOutputStream.close();
            }
        }
        return treeMap;
    }

    public void parseDataFile(BufferedReader bufferedReader, boolean z10) throws IOException {
        List<String> list;
        while (true) {
            Zone zone = null;
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    if (zone != null) {
                        this.iZones.add(zone);
                        return;
                    }
                    return;
                }
                String strTrim = line.trim();
                if (strTrim.length() != 0 && strTrim.charAt(0) != '#') {
                    int iIndexOf = line.indexOf(35);
                    if (iIndexOf >= 0) {
                        line = line.substring(0, iIndexOf);
                    }
                    StringTokenizer stringTokenizer = new StringTokenizer(line, " \t");
                    if (!Character.isWhitespace(line.charAt(0)) || !stringTokenizer.hasMoreTokens()) {
                        if (zone != null) {
                            this.iZones.add(zone);
                        }
                        if (!stringTokenizer.hasMoreTokens()) {
                            break;
                        }
                        String strNextToken = stringTokenizer.nextToken();
                        if (!strNextToken.equalsIgnoreCase("Rule")) {
                            if (!strNextToken.equalsIgnoreCase("Zone")) {
                                if (!strNextToken.equalsIgnoreCase("Link")) {
                                    System.out.println("Unknown line: " + line);
                                    break;
                                }
                                String strNextToken2 = stringTokenizer.nextToken();
                                String strNextToken3 = stringTokenizer.nextToken();
                                if (z10 || strNextToken3.equals("US/Pacific-New") || strNextToken3.startsWith("Etc/") || strNextToken3.equals("GMT")) {
                                    this.iBackLinks.add(strNextToken2);
                                    list = this.iBackLinks;
                                } else {
                                    this.iGoodLinks.add(strNextToken2);
                                    list = this.iGoodLinks;
                                }
                                list.add(strNextToken3);
                                break;
                            }
                            if (stringTokenizer.countTokens() < 4) {
                                throw new IllegalArgumentException("Attempting to create a Zone from an incomplete tokenizer");
                            }
                            zone = new Zone(stringTokenizer);
                        } else {
                            Rule rule = new Rule(stringTokenizer);
                            RuleSet ruleSet = this.iRuleSets.get(rule.iName);
                            if (ruleSet != null) {
                                ruleSet.addRule(rule);
                                break;
                            } else {
                                this.iRuleSets.put(rule.iName, new RuleSet(rule));
                                break;
                            }
                        }
                    } else if (zone != null) {
                        zone.chain(stringTokenizer);
                    }
                }
            }
        }
    }
}
