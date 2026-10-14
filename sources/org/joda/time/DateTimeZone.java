package org.joda.time;

import android.support.v4.media.a;
import androidx.activity.j;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.google.android.material.datepicker.UtcDates;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.chrono.BaseChronology;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.FormatUtils;
import org.joda.time.tz.DefaultNameProvider;
import org.joda.time.tz.FixedDateTimeZone;
import org.joda.time.tz.NameProvider;
import org.joda.time.tz.Provider;
import org.joda.time.tz.UTCProvider;
import org.joda.time.tz.ZoneInfoProvider;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DateTimeZone implements Serializable {
    public static final String DEFAULT_TZ_DATA_PATH = "org/joda/time/tz/data";
    private static final int MAX_MILLIS = 86399999;
    private static final long serialVersionUID = 5546345482340108586L;
    private final String iID;
    public static final DateTimeZone UTC = UTCDateTimeZone.INSTANCE;
    private static final AtomicReference<Provider> cProvider = new AtomicReference<>();
    private static final AtomicReference<NameProvider> cNameProvider = new AtomicReference<>();
    private static final AtomicReference<DateTimeZone> cDefault = new AtomicReference<>();

    public static final class LazyInit {
        public static final Map<String, String> CONVERSION_MAP = buildMap();
        public static final DateTimeFormatter OFFSET_FORMATTER = buildFormatter();

        private static DateTimeFormatter buildFormatter() {
            return new DateTimeFormatterBuilder().appendTimeZoneOffset(null, true, 2, 4).toFormatter().withChronology(new BaseChronology() { // from class: org.joda.time.DateTimeZone.LazyInit.1
                private static final long serialVersionUID = -3128740902654445468L;

                @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
                public DateTimeZone getZone() {
                    return null;
                }

                @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
                public String toString() {
                    return AnonymousClass1.class.getName();
                }

                @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
                public Chronology withUTC() {
                    return this;
                }

                @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
                public Chronology withZone(DateTimeZone dateTimeZone) {
                    return this;
                }
            });
        }

        private static Map<String, String> buildMap() {
            HashMap map = new HashMap();
            map.put("GMT", UtcDates.UTC);
            map.put("WET", "WET");
            map.put("CET", "CET");
            map.put("MET", "CET");
            map.put("ECT", "CET");
            map.put("EET", "EET");
            map.put("MIT", "Pacific/Apia");
            map.put("HST", "Pacific/Honolulu");
            map.put("AST", "America/Anchorage");
            map.put("PST", "America/Los_Angeles");
            map.put("MST", "America/Denver");
            map.put("PNT", "America/Phoenix");
            map.put("CST", "America/Chicago");
            map.put("EST", "America/New_York");
            map.put("IET", "America/Indiana/Indianapolis");
            map.put("PRT", "America/Puerto_Rico");
            map.put("CNT", "America/St_Johns");
            map.put("AGT", "America/Argentina/Buenos_Aires");
            map.put("BET", "America/Sao_Paulo");
            map.put("ART", "Africa/Cairo");
            map.put("CAT", "Africa/Harare");
            map.put("EAT", "Africa/Addis_Ababa");
            map.put("NET", "Asia/Yerevan");
            map.put("PLT", "Asia/Karachi");
            map.put("IST", "Asia/Kolkata");
            map.put("BST", "Asia/Dhaka");
            map.put("VST", "Asia/Ho_Chi_Minh");
            map.put("CTT", "Asia/Shanghai");
            map.put("JST", "Asia/Tokyo");
            map.put("ACT", "Australia/Darwin");
            map.put("AET", "Australia/Sydney");
            map.put("SST", "Pacific/Guadalcanal");
            map.put("NST", "Pacific/Auckland");
            return Collections.unmodifiableMap(map);
        }
    }

    public static final class Stub implements Serializable {
        private static final long serialVersionUID = -6471952376487863581L;
        private transient String iID;

        public Stub(String str) {
            this.iID = str;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            this.iID = objectInputStream.readUTF();
        }

        private Object readResolve() throws ObjectStreamException {
            return DateTimeZone.forID(this.iID);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeUTF(this.iID);
        }
    }

    public DateTimeZone(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Id must not be null");
        }
        this.iID = str;
    }

    private static String convertToAsciiNumber(String str) {
        StringBuilder sb2 = new StringBuilder(str);
        for (int i10 = 0; i10 < sb2.length(); i10++) {
            int iDigit = Character.digit(sb2.charAt(i10), 10);
            if (iDigit >= 0) {
                sb2.setCharAt(i10, (char) (iDigit + 48));
            }
        }
        return sb2.toString();
    }

    private static DateTimeZone fixedOffsetZone(String str, int i10) {
        return i10 == 0 ? UTC : new FixedDateTimeZone(str, null, i10, i10);
    }

    @FromString
    public static DateTimeZone forID(String str) {
        if (str == null) {
            return getDefault();
        }
        if (str.equals(UtcDates.UTC)) {
            return UTC;
        }
        DateTimeZone zone = getProvider().getZone(str);
        if (zone != null) {
            return zone;
        }
        if (!str.startsWith("+") && !str.startsWith("-")) {
            throw new IllegalArgumentException(j.a("The datetime zone id '", str, "' is not recognised"));
        }
        int offset = parseOffset(str);
        return ((long) offset) == 0 ? UTC : fixedOffsetZone(printOffset(offset), offset);
    }

    public static DateTimeZone forOffsetHours(int i10) throws IllegalArgumentException {
        return forOffsetHoursMinutes(i10, 0);
    }

    public static DateTimeZone forOffsetHoursMinutes(int i10, int i11) throws IllegalArgumentException {
        if (i10 == 0 && i11 == 0) {
            return UTC;
        }
        if (i10 < -23 || i10 > 23) {
            throw new IllegalArgumentException(a.a("Hours out of range: ", i10));
        }
        if (i11 < -59 || i11 > 59) {
            throw new IllegalArgumentException(a.a("Minutes out of range: ", i11));
        }
        if (i10 > 0 && i11 < 0) {
            throw new IllegalArgumentException(a.a("Positive hours must not have negative minutes: ", i11));
        }
        int i12 = i10 * 60;
        try {
            return forOffsetMillis(FieldUtils.safeMultiply(i12 < 0 ? i12 - Math.abs(i11) : i12 + i11, DateTimeConstants.MILLIS_PER_MINUTE));
        } catch (ArithmeticException unused) {
            throw new IllegalArgumentException("Offset is too large");
        }
    }

    public static DateTimeZone forOffsetMillis(int i10) {
        if (i10 < -86399999 || i10 > MAX_MILLIS) {
            throw new IllegalArgumentException(a.a("Millis out of range: ", i10));
        }
        return fixedOffsetZone(printOffset(i10), i10);
    }

    public static DateTimeZone forTimeZone(TimeZone timeZone) {
        char cCharAt;
        if (timeZone == null) {
            return getDefault();
        }
        String id2 = timeZone.getID();
        if (id2 == null) {
            throw new IllegalArgumentException("The TimeZone id must not be null");
        }
        if (id2.equals(UtcDates.UTC)) {
            return UTC;
        }
        String convertedId = getConvertedId(id2);
        Provider provider = getProvider();
        DateTimeZone zone = convertedId != null ? provider.getZone(convertedId) : null;
        if (zone == null) {
            zone = provider.getZone(id2);
        }
        if (zone != null) {
            return zone;
        }
        if (convertedId != null || (!id2.startsWith("GMT+") && !id2.startsWith("GMT-"))) {
            throw new IllegalArgumentException(j.a("The datetime zone id '", id2, "' is not recognised"));
        }
        String strSubstring = id2.substring(3);
        if (strSubstring.length() > 2 && (cCharAt = strSubstring.charAt(1)) > '9' && Character.isDigit(cCharAt)) {
            strSubstring = convertToAsciiNumber(strSubstring);
        }
        int offset = parseOffset(strSubstring);
        return ((long) offset) == 0 ? UTC : fixedOffsetZone(printOffset(offset), offset);
    }

    public static Set<String> getAvailableIDs() {
        return getProvider().getAvailableIDs();
    }

    private static String getConvertedId(String str) {
        return LazyInit.CONVERSION_MAP.get(str);
    }

    public static DateTimeZone getDefault() {
        DateTimeZone dateTimeZoneForTimeZone = cDefault.get();
        if (dateTimeZoneForTimeZone != null) {
            return dateTimeZoneForTimeZone;
        }
        try {
            String property = System.getProperty("user.timezone");
            if (property != null) {
                dateTimeZoneForTimeZone = forID(property);
            }
        } catch (RuntimeException unused) {
        }
        if (dateTimeZoneForTimeZone == null) {
            try {
                dateTimeZoneForTimeZone = forTimeZone(TimeZone.getDefault());
            } catch (IllegalArgumentException unused2) {
            }
        }
        if (dateTimeZoneForTimeZone == null) {
            dateTimeZoneForTimeZone = UTC;
        }
        AtomicReference<DateTimeZone> atomicReference = cDefault;
        return !atomicReference.compareAndSet(null, dateTimeZoneForTimeZone) ? atomicReference.get() : dateTimeZoneForTimeZone;
    }

    private static NameProvider getDefaultNameProvider() {
        NameProvider nameProvider = null;
        try {
            String property = System.getProperty("org.joda.time.DateTimeZone.NameProvider");
            if (property != null) {
                try {
                    Class<?> cls = Class.forName(property, false, DateTimeZone.class.getClassLoader());
                    if (!NameProvider.class.isAssignableFrom(cls)) {
                        throw new IllegalArgumentException("System property referred to class that does not implement " + NameProvider.class);
                    }
                    nameProvider = (NameProvider) cls.asSubclass(NameProvider.class).getConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Exception e10) {
                    throw new RuntimeException(e10);
                }
            }
        } catch (SecurityException unused) {
        }
        return nameProvider == null ? new DefaultNameProvider() : nameProvider;
    }

    private static Provider getDefaultProvider() {
        try {
            String property = System.getProperty("org.joda.time.DateTimeZone.Provider");
            if (property != null) {
                try {
                    Class<?> cls = Class.forName(property, false, DateTimeZone.class.getClassLoader());
                    if (Provider.class.isAssignableFrom(cls)) {
                        return validateProvider((Provider) cls.asSubclass(Provider.class).getConstructor(new Class[0]).newInstance(new Object[0]));
                    }
                    throw new IllegalArgumentException("System property referred to class that does not implement " + Provider.class);
                } catch (Exception e10) {
                    throw new RuntimeException(e10);
                }
            }
        } catch (SecurityException unused) {
        }
        try {
            String property2 = System.getProperty("org.joda.time.DateTimeZone.Folder");
            if (property2 != null) {
                try {
                    return validateProvider(new ZoneInfoProvider(new File(property2)));
                } catch (Exception e11) {
                    throw new RuntimeException(e11);
                }
            }
        } catch (SecurityException unused2) {
        }
        try {
            return validateProvider(new ZoneInfoProvider(DEFAULT_TZ_DATA_PATH));
        } catch (Exception e12) {
            e12.printStackTrace();
            return new UTCProvider();
        }
    }

    public static NameProvider getNameProvider() {
        AtomicReference<NameProvider> atomicReference = cNameProvider;
        NameProvider nameProvider = atomicReference.get();
        if (nameProvider != null) {
            return nameProvider;
        }
        NameProvider defaultNameProvider = getDefaultNameProvider();
        return !atomicReference.compareAndSet(null, defaultNameProvider) ? atomicReference.get() : defaultNameProvider;
    }

    public static Provider getProvider() {
        AtomicReference<Provider> atomicReference = cProvider;
        Provider provider = atomicReference.get();
        if (provider != null) {
            return provider;
        }
        Provider defaultProvider = getDefaultProvider();
        return !atomicReference.compareAndSet(null, defaultProvider) ? atomicReference.get() : defaultProvider;
    }

    private static int parseOffset(String str) {
        return -((int) LazyInit.OFFSET_FORMATTER.parseMillis(str));
    }

    private static String printOffset(int i10) {
        StringBuffer stringBuffer = new StringBuffer();
        if (i10 >= 0) {
            stringBuffer.append('+');
        } else {
            stringBuffer.append(CoreConstants.DASH_CHAR);
            i10 = -i10;
        }
        int i11 = i10 / DateTimeConstants.MILLIS_PER_HOUR;
        FormatUtils.appendPaddedInteger(stringBuffer, i11, 2);
        int i12 = i10 - (i11 * DateTimeConstants.MILLIS_PER_HOUR);
        int i13 = i12 / DateTimeConstants.MILLIS_PER_MINUTE;
        stringBuffer.append(CoreConstants.COLON_CHAR);
        FormatUtils.appendPaddedInteger(stringBuffer, i13, 2);
        int i14 = i12 - (i13 * DateTimeConstants.MILLIS_PER_MINUTE);
        if (i14 == 0) {
            return stringBuffer.toString();
        }
        int i15 = i14 / 1000;
        stringBuffer.append(CoreConstants.COLON_CHAR);
        FormatUtils.appendPaddedInteger(stringBuffer, i15, 2);
        int i16 = i14 - (i15 * 1000);
        if (i16 == 0) {
            return stringBuffer.toString();
        }
        stringBuffer.append(CoreConstants.DOT);
        FormatUtils.appendPaddedInteger(stringBuffer, i16, 3);
        return stringBuffer.toString();
    }

    public static void setDefault(DateTimeZone dateTimeZone) throws SecurityException {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new JodaTimePermission("DateTimeZone.setDefault"));
        }
        if (dateTimeZone == null) {
            throw new IllegalArgumentException("The datetime zone must not be null");
        }
        cDefault.set(dateTimeZone);
    }

    public static void setNameProvider(NameProvider nameProvider) throws SecurityException {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new JodaTimePermission("DateTimeZone.setNameProvider"));
        }
        if (nameProvider == null) {
            nameProvider = getDefaultNameProvider();
        }
        cNameProvider.set(nameProvider);
    }

    public static void setProvider(Provider provider) throws SecurityException {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new JodaTimePermission("DateTimeZone.setProvider"));
        }
        if (provider == null) {
            provider = getDefaultProvider();
        } else {
            validateProvider(provider);
        }
        cProvider.set(provider);
    }

    private static Provider validateProvider(Provider provider) {
        Set<String> availableIDs = provider.getAvailableIDs();
        if (availableIDs == null || availableIDs.size() == 0) {
            throw new IllegalArgumentException("The provider doesn't have any available ids");
        }
        if (!availableIDs.contains(UtcDates.UTC)) {
            throw new IllegalArgumentException("The provider doesn't support UTC");
        }
        if (UTC.equals(provider.getZone(UtcDates.UTC))) {
            return provider;
        }
        throw new IllegalArgumentException("Invalid UTC zone provided");
    }

    public long adjustOffset(long j10, boolean z10) {
        long j11 = j10 - 10800000;
        long offset = getOffset(j11);
        long offset2 = getOffset(10800000 + j10);
        if (offset <= offset2) {
            return j10;
        }
        long j12 = offset - offset2;
        long jNextTransition = nextTransition(j11);
        long j13 = jNextTransition - j12;
        long j14 = jNextTransition + j12;
        if (j10 < j13 || j10 >= j14) {
            return j10;
        }
        if (j10 - j13 >= j12) {
            return z10 ? j10 : j10 - j12;
        }
        return z10 ? j10 + j12 : j10;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003d  */
    public long convertLocalToUTC(long j10, boolean z10) {
        int offset = getOffset(j10);
        long j11 = j10 - ((long) offset);
        int offset2 = getOffset(j11);
        if (offset == offset2 || (!z10 && offset >= 0)) {
            offset = offset2;
        } else {
            long jNextTransition = nextTransition(j11);
            long j12 = RecyclerView.FOREVER_NS;
            if (jNextTransition == j11) {
                jNextTransition = Long.MAX_VALUE;
            }
            long j13 = j10 - ((long) offset2);
            long jNextTransition2 = nextTransition(j13);
            if (jNextTransition2 != j13) {
                j12 = jNextTransition2;
            }
            if (jNextTransition == j12) {
                offset = offset2;
            } else if (z10) {
                throw new IllegalInstantException(j10, getID());
            }
        }
        long j14 = offset;
        long j15 = j10 - j14;
        if ((j10 ^ j15) >= 0 || (j10 ^ j14) >= 0) {
            return j15;
        }
        throw new ArithmeticException("Subtracting time zone offset caused overflow");
    }

    public long convertLocalToUTC(long j10, boolean z10, long j11) {
        int offset = getOffset(j11);
        long j12 = j10 - ((long) offset);
        return getOffset(j12) == offset ? j12 : convertLocalToUTC(j10, z10);
    }

    public long convertUTCToLocal(long j10) {
        long offset = getOffset(j10);
        long j11 = j10 + offset;
        if ((j10 ^ j11) >= 0 || (j10 ^ offset) < 0) {
            return j11;
        }
        throw new ArithmeticException("Adding time zone offset caused overflow");
    }

    public abstract boolean equals(Object obj);

    @ToString
    public final String getID() {
        return this.iID;
    }

    public long getMillisKeepLocal(DateTimeZone dateTimeZone, long j10) {
        if (dateTimeZone == null) {
            dateTimeZone = getDefault();
        }
        DateTimeZone dateTimeZone2 = dateTimeZone;
        return dateTimeZone2 == this ? j10 : dateTimeZone2.convertLocalToUTC(convertUTCToLocal(j10), false, j10);
    }

    public final String getName(long j10) {
        return getName(j10, null);
    }

    public String getName(long j10, Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        String nameKey = getNameKey(j10);
        if (nameKey == null) {
            return this.iID;
        }
        NameProvider nameProvider = getNameProvider();
        String name = nameProvider instanceof DefaultNameProvider ? ((DefaultNameProvider) nameProvider).getName(locale, this.iID, nameKey, isStandardOffset(j10)) : nameProvider.getName(locale, this.iID, nameKey);
        return name != null ? name : printOffset(getOffset(j10));
    }

    public abstract String getNameKey(long j10);

    public abstract int getOffset(long j10);

    public final int getOffset(ReadableInstant readableInstant) {
        return getOffset(readableInstant == null ? DateTimeUtils.currentTimeMillis() : readableInstant.getMillis());
    }

    public int getOffsetFromLocal(long j10) {
        int offset = getOffset(j10);
        long j11 = j10 - ((long) offset);
        int offset2 = getOffset(j11);
        if (offset != offset2) {
            if (offset - offset2 < 0) {
                long jNextTransition = nextTransition(j11);
                long j12 = RecyclerView.FOREVER_NS;
                if (jNextTransition == j11) {
                    jNextTransition = Long.MAX_VALUE;
                }
                long j13 = j10 - ((long) offset2);
                long jNextTransition2 = nextTransition(j13);
                if (jNextTransition2 != j13) {
                    j12 = jNextTransition2;
                }
                if (jNextTransition != j12) {
                    return offset;
                }
            }
        } else if (offset >= 0) {
            long jPreviousTransition = previousTransition(j11);
            if (jPreviousTransition < j11) {
                int offset3 = getOffset(jPreviousTransition);
                if (j11 - jPreviousTransition <= offset3 - offset) {
                    return offset3;
                }
            }
        }
        return offset2;
    }

    public final String getShortName(long j10) {
        return getShortName(j10, null);
    }

    public String getShortName(long j10, Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        String nameKey = getNameKey(j10);
        if (nameKey == null) {
            return this.iID;
        }
        NameProvider nameProvider = getNameProvider();
        String shortName = nameProvider instanceof DefaultNameProvider ? ((DefaultNameProvider) nameProvider).getShortName(locale, this.iID, nameKey, isStandardOffset(j10)) : nameProvider.getShortName(locale, this.iID, nameKey);
        return shortName != null ? shortName : printOffset(getOffset(j10));
    }

    public abstract int getStandardOffset(long j10);

    public int hashCode() {
        return getID().hashCode() + 57;
    }

    public abstract boolean isFixed();

    public boolean isLocalDateTimeGap(LocalDateTime localDateTime) {
        if (isFixed()) {
            return false;
        }
        try {
            localDateTime.toDateTime(this);
            return false;
        } catch (IllegalInstantException unused) {
            return true;
        }
    }

    public boolean isStandardOffset(long j10) {
        return getOffset(j10) == getStandardOffset(j10);
    }

    public abstract long nextTransition(long j10);

    public abstract long previousTransition(long j10);

    public String toString() {
        return getID();
    }

    public TimeZone toTimeZone() {
        return TimeZone.getTimeZone(this.iID);
    }

    public Object writeReplace() throws ObjectStreamException {
        return new Stub(this.iID);
    }
}
