package okhttp3;

import androidx.recyclerview.widget.RecyclerView;
import com.developer.filepicker.model.DialogConfigs;
import com.google.android.gms.common.internal.ImagesContract;
import ed.f;
import ed.q;
import ed.u;
import fd.j0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kc.w;
import l1.e;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import r6.b;
import vc.g;

/* JADX INFO: loaded from: classes3.dex */
public final class Cookie {
    private final String domain;
    private final long expiresAt;
    private final boolean hostOnly;
    private final boolean httpOnly;
    private final String name;
    private final String path;
    private final boolean persistent;
    private final boolean secure;
    private final String value;
    public static final Companion Companion = new Companion(null);
    private static final Pattern YEAR_PATTERN = Pattern.compile("(\\d{2,4})[^\\d]*");
    private static final Pattern MONTH_PATTERN = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    private static final Pattern DAY_OF_MONTH_PATTERN = Pattern.compile("(\\d{1,2})[^\\d]*");
    private static final Pattern TIME_PATTERN = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    public static final class Builder {
        private String domain;
        private boolean hostOnly;
        private boolean httpOnly;
        private String name;
        private boolean persistent;
        private boolean secure;
        private String value;
        private long expiresAt = DatesKt.MAX_DATE;
        private String path = DialogConfigs.DIRECTORY_SEPERATOR;

        private final Builder domain(String str, boolean z10) {
            String canonicalHost = HostnamesKt.toCanonicalHost(str);
            if (canonicalHost == null) {
                throw new IllegalArgumentException(j0.p("unexpected domain: ", str));
            }
            this.domain = canonicalHost;
            this.hostOnly = z10;
            return this;
        }

        public final Cookie build() {
            String str = this.name;
            Objects.requireNonNull(str, "builder.name == null");
            String str2 = this.value;
            Objects.requireNonNull(str2, "builder.value == null");
            long j10 = this.expiresAt;
            String str3 = this.domain;
            Objects.requireNonNull(str3, "builder.domain == null");
            return new Cookie(str, str2, j10, str3, this.path, this.secure, this.httpOnly, this.persistent, this.hostOnly, null);
        }

        public final Builder domain(String str) {
            j0.i(str, "domain");
            return domain(str, false);
        }

        public final Builder expiresAt(long j10) {
            if (j10 <= 0) {
                j10 = Long.MIN_VALUE;
            }
            if (j10 > DatesKt.MAX_DATE) {
                j10 = 253402300799999L;
            }
            this.expiresAt = j10;
            this.persistent = true;
            return this;
        }

        public final Builder hostOnlyDomain(String str) {
            j0.i(str, "domain");
            return domain(str, true);
        }

        public final Builder httpOnly() {
            this.httpOnly = true;
            return this;
        }

        public final Builder name(String str) {
            j0.i(str, "name");
            if (!j0.d(u.Y(str).toString(), str)) {
                throw new IllegalArgumentException("name is not trimmed".toString());
            }
            this.name = str;
            return this;
        }

        public final Builder path(String str) {
            j0.i(str, "path");
            if (!q.u(str, DialogConfigs.DIRECTORY_SEPERATOR, false, 2)) {
                throw new IllegalArgumentException("path must start with '/'".toString());
            }
            this.path = str;
            return this;
        }

        public final Builder secure() {
            this.secure = true;
            return this;
        }

        public final Builder value(String str) {
            j0.i(str, "value");
            if (!j0.d(u.Y(str).toString(), str)) {
                throw new IllegalArgumentException("value is not trimmed".toString());
            }
            this.value = str;
            return this;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:32:0x0041  */
        private final int dateCharacterOffset(String str, int i10, int i11, boolean z10) {
            boolean z11;
            while (i10 < i11) {
                int i12 = i10 + 1;
                char cCharAt = str.charAt(i10);
                if ((cCharAt >= ' ' || cCharAt == '\t') && cCharAt < 127) {
                    if (!(cCharAt <= '9' && '0' <= cCharAt)) {
                        if (!(cCharAt <= 'z' && 'a' <= cCharAt)) {
                            z11 = (cCharAt <= 'Z' && 'A' <= cCharAt) || cCharAt == ':';
                        }
                    }
                }
                if (z11 == (!z10)) {
                    return i10;
                }
                i10 = i12;
            }
            return i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean domainMatch(String str, String str2) {
            if (j0.d(str, str2)) {
                return true;
            }
            return q.h(str, str2, false, 2) && str.charAt((str.length() - str2.length()) - 1) == '.' && !Util.canParseAsIpAddress(str);
        }

        private final String parseDomain(String str) {
            if (!(!q.h(str, ".", false, 2))) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            String canonicalHost = HostnamesKt.toCanonicalHost(u.M(str, "."));
            if (canonicalHost != null) {
                return canonicalHost;
            }
            throw new IllegalArgumentException();
        }

        private final long parseExpires(String str, int i10, int i11) {
            int iDateCharacterOffset = dateCharacterOffset(str, i10, i11, false);
            Matcher matcher = Cookie.TIME_PATTERN.matcher(str);
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int iE = -1;
            int i15 = -1;
            int i16 = -1;
            while (iDateCharacterOffset < i11) {
                int iDateCharacterOffset2 = dateCharacterOffset(str, iDateCharacterOffset + 1, i11, true);
                matcher.region(iDateCharacterOffset, iDateCharacterOffset2);
                if (i13 == -1 && matcher.usePattern(Cookie.TIME_PATTERN).matches()) {
                    String strGroup = matcher.group(1);
                    j0.h(strGroup, "matcher.group(1)");
                    i13 = Integer.parseInt(strGroup);
                    String strGroup2 = matcher.group(2);
                    j0.h(strGroup2, "matcher.group(2)");
                    i15 = Integer.parseInt(strGroup2);
                    String strGroup3 = matcher.group(3);
                    j0.h(strGroup3, "matcher.group(3)");
                    i16 = Integer.parseInt(strGroup3);
                } else if (i14 == -1 && matcher.usePattern(Cookie.DAY_OF_MONTH_PATTERN).matches()) {
                    String strGroup4 = matcher.group(1);
                    j0.h(strGroup4, "matcher.group(1)");
                    i14 = Integer.parseInt(strGroup4);
                } else if (iE == -1 && matcher.usePattern(Cookie.MONTH_PATTERN).matches()) {
                    String strGroup5 = matcher.group(1);
                    j0.h(strGroup5, "matcher.group(1)");
                    Locale locale = Locale.US;
                    j0.h(locale, "US");
                    String lowerCase = strGroup5.toLowerCase(locale);
                    j0.h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    String strPattern = Cookie.MONTH_PATTERN.pattern();
                    j0.h(strPattern, "MONTH_PATTERN.pattern()");
                    iE = u.E(strPattern, lowerCase, 0, false, 6) / 4;
                } else if (i12 == -1 && matcher.usePattern(Cookie.YEAR_PATTERN).matches()) {
                    String strGroup6 = matcher.group(1);
                    j0.h(strGroup6, "matcher.group(1)");
                    i12 = Integer.parseInt(strGroup6);
                }
                iDateCharacterOffset = dateCharacterOffset(str, iDateCharacterOffset2 + 1, i11, false);
            }
            if (70 <= i12 && i12 < 100) {
                i12 += 1900;
            }
            if (i12 >= 0 && i12 < 70) {
                i12 += 2000;
            }
            if (!(i12 >= 1601)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(iE != -1)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(1 <= i14 && i14 < 32)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i13 >= 0 && i13 < 24)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i15 >= 0 && i15 < 60)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i16 >= 0 && i16 < 60)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(Util.UTC);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i12);
            gregorianCalendar.set(2, iE - 1);
            gregorianCalendar.set(5, i14);
            gregorianCalendar.set(11, i13);
            gregorianCalendar.set(12, i15);
            gregorianCalendar.set(13, i16);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }

        private final long parseMaxAge(String str) {
            try {
                long j10 = Long.parseLong(str);
                if (j10 <= 0) {
                    return Long.MIN_VALUE;
                }
                return j10;
            } catch (NumberFormatException e10) {
                if (!new f("-?\\d+").a(str)) {
                    throw e10;
                }
                if (q.u(str, "-", false, 2)) {
                    return Long.MIN_VALUE;
                }
                return RecyclerView.FOREVER_NS;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean pathMatch(HttpUrl httpUrl, String str) {
            String strEncodedPath = httpUrl.encodedPath();
            if (j0.d(strEncodedPath, str)) {
                return true;
            }
            return q.u(strEncodedPath, str, false, 2) && (q.h(str, DialogConfigs.DIRECTORY_SEPERATOR, false, 2) || strEncodedPath.charAt(str.length()) == '/');
        }

        public final Cookie parse(HttpUrl httpUrl, String str) {
            j0.i(httpUrl, ImagesContract.URL);
            j0.i(str, "setCookie");
            return parse$okhttp(System.currentTimeMillis(), httpUrl, str);
        }

        /* JADX WARN: Code duplicated, block: B:46:0x00dc A[PHI: r1
  0x00dc: PHI (r1v24 long) = (r1v8 long), (r1v12 long) binds: [B:45:0x00da, B:56:0x0102] A[DONT_GENERATE, DONT_INLINE]] */
        public final Cookie parse$okhttp(long j10, HttpUrl httpUrl, String str) {
            long j11;
            long j12;
            Cookie cookie;
            String str2;
            String str3;
            j0.i(httpUrl, ImagesContract.URL);
            j0.i(str, "setCookie");
            int iDelimiterOffset$default = Util.delimiterOffset$default(str, ';', 0, 0, 6, (Object) null);
            int iDelimiterOffset$default2 = Util.delimiterOffset$default(str, '=', 0, iDelimiterOffset$default, 2, (Object) null);
            if (iDelimiterOffset$default2 == iDelimiterOffset$default) {
                return null;
            }
            String strTrimSubstring$default = Util.trimSubstring$default(str, 0, iDelimiterOffset$default2, 1, null);
            if ((strTrimSubstring$default.length() == 0) || Util.indexOfControlOrNonAscii(strTrimSubstring$default) != -1) {
                return null;
            }
            String strTrimSubstring = Util.trimSubstring(str, iDelimiterOffset$default2 + 1, iDelimiterOffset$default);
            if (Util.indexOfControlOrNonAscii(strTrimSubstring) != -1) {
                return null;
            }
            int i10 = iDelimiterOffset$default + 1;
            int length = str.length();
            String domain = null;
            String str4 = null;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = true;
            long maxAge = -1;
            long expires = DatesKt.MAX_DATE;
            while (i10 < length) {
                int iDelimiterOffset = Util.delimiterOffset(str, ';', i10, length);
                int iDelimiterOffset2 = Util.delimiterOffset(str, '=', i10, iDelimiterOffset);
                String strTrimSubstring2 = Util.trimSubstring(str, i10, iDelimiterOffset2);
                String strTrimSubstring3 = iDelimiterOffset2 < iDelimiterOffset ? Util.trimSubstring(str, iDelimiterOffset2 + 1, iDelimiterOffset) : "";
                if (q.i(strTrimSubstring2, "expires", true)) {
                    try {
                        expires = parseExpires(strTrimSubstring3, 0, strTrimSubstring3.length());
                        z12 = true;
                    } catch (NumberFormatException | IllegalArgumentException unused) {
                    }
                } else if (q.i(strTrimSubstring2, "max-age", true)) {
                    maxAge = parseMaxAge(strTrimSubstring3);
                    z12 = true;
                } else if (q.i(strTrimSubstring2, "domain", true)) {
                    domain = parseDomain(strTrimSubstring3);
                    z13 = false;
                } else if (q.i(strTrimSubstring2, "path", true)) {
                    str4 = strTrimSubstring3;
                } else if (q.i(strTrimSubstring2, "secure", true)) {
                    z10 = true;
                } else if (q.i(strTrimSubstring2, "httponly", true)) {
                    z11 = true;
                }
                i10 = iDelimiterOffset + 1;
            }
            long j13 = Long.MIN_VALUE;
            if (maxAge == Long.MIN_VALUE) {
                j11 = j13;
            } else if (maxAge != -1) {
                j13 = j10 + (maxAge <= 9223372036854775L ? maxAge * ((long) 1000) : RecyclerView.FOREVER_NS);
                if (j13 >= j10) {
                    j12 = DatesKt.MAX_DATE;
                    if (j13 <= DatesKt.MAX_DATE) {
                        j11 = j13;
                    }
                } else {
                    j12 = DatesKt.MAX_DATE;
                }
                j11 = j12;
            } else {
                j11 = expires;
            }
            String strHost = httpUrl.host();
            if (domain == null) {
                str2 = strHost;
                cookie = null;
            } else {
                if (!domainMatch(strHost, domain)) {
                    return null;
                }
                cookie = null;
                str2 = domain;
            }
            if (strHost.length() != str2.length() && PublicSuffixDatabase.Companion.get().getEffectiveTldPlusOne(str2) == null) {
                return cookie;
            }
            String strSubstring = DialogConfigs.DIRECTORY_SEPERATOR;
            String str5 = str4;
            if (str5 == null || !q.u(str5, DialogConfigs.DIRECTORY_SEPERATOR, false, 2)) {
                String strEncodedPath = httpUrl.encodedPath();
                int iG = u.G(strEncodedPath, '/', 0, false, 6);
                if (iG != 0) {
                    strSubstring = strEncodedPath.substring(0, iG);
                    j0.h(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                str3 = strSubstring;
            } else {
                str3 = str5;
            }
            return new Cookie(strTrimSubstring$default, strTrimSubstring, j11, str2, str3, z10, z11, z12, z13, null);
        }

        public final List<Cookie> parseAll(HttpUrl httpUrl, Headers headers) {
            j0.i(httpUrl, ImagesContract.URL);
            j0.i(headers, "headers");
            List<String> listValues = headers.values("Set-Cookie");
            int size = listValues.size();
            ArrayList arrayList = null;
            int i10 = 0;
            while (i10 < size) {
                int i11 = i10 + 1;
                Cookie cookie = parse(httpUrl, listValues.get(i10));
                if (cookie != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(cookie);
                }
                i10 = i11;
            }
            if (arrayList == null) {
                return w.f32009c;
            }
            List<Cookie> listUnmodifiableList = Collections.unmodifiableList(arrayList);
            j0.h(listUnmodifiableList, "{\n        Collections.un…ableList(cookies)\n      }");
            return listUnmodifiableList;
        }
    }

    private Cookie(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.name = str;
        this.value = str2;
        this.expiresAt = j10;
        this.domain = str3;
        this.path = str4;
        this.secure = z10;
        this.httpOnly = z11;
        this.persistent = z12;
        this.hostOnly = z13;
    }

    public /* synthetic */ Cookie(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13, g gVar) {
        this(str, str2, j10, str3, str4, z10, z11, z12, z13);
    }

    public static final Cookie parse(HttpUrl httpUrl, String str) {
        return Companion.parse(httpUrl, str);
    }

    public static final List<Cookie> parseAll(HttpUrl httpUrl, Headers headers) {
        return Companion.parseAll(httpUrl, headers);
    }

    /* JADX INFO: renamed from: -deprecated_domain, reason: not valid java name */
    public final String m34deprecated_domain() {
        return this.domain;
    }

    /* JADX INFO: renamed from: -deprecated_expiresAt, reason: not valid java name */
    public final long m35deprecated_expiresAt() {
        return this.expiresAt;
    }

    /* JADX INFO: renamed from: -deprecated_hostOnly, reason: not valid java name */
    public final boolean m36deprecated_hostOnly() {
        return this.hostOnly;
    }

    /* JADX INFO: renamed from: -deprecated_httpOnly, reason: not valid java name */
    public final boolean m37deprecated_httpOnly() {
        return this.httpOnly;
    }

    /* JADX INFO: renamed from: -deprecated_name, reason: not valid java name */
    public final String m38deprecated_name() {
        return this.name;
    }

    /* JADX INFO: renamed from: -deprecated_path, reason: not valid java name */
    public final String m39deprecated_path() {
        return this.path;
    }

    /* JADX INFO: renamed from: -deprecated_persistent, reason: not valid java name */
    public final boolean m40deprecated_persistent() {
        return this.persistent;
    }

    /* JADX INFO: renamed from: -deprecated_secure, reason: not valid java name */
    public final boolean m41deprecated_secure() {
        return this.secure;
    }

    /* JADX INFO: renamed from: -deprecated_value, reason: not valid java name */
    public final String m42deprecated_value() {
        return this.value;
    }

    public final String domain() {
        return this.domain;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Cookie) {
            Cookie cookie = (Cookie) obj;
            if (j0.d(cookie.name, this.name) && j0.d(cookie.value, this.value) && cookie.expiresAt == this.expiresAt && j0.d(cookie.domain, this.domain) && j0.d(cookie.path, this.path) && cookie.secure == this.secure && cookie.httpOnly == this.httpOnly && cookie.persistent == this.persistent && cookie.hostOnly == this.hostOnly) {
                return true;
            }
        }
        return false;
    }

    public final long expiresAt() {
        return this.expiresAt;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return Boolean.hashCode(this.hostOnly) + ((Boolean.hashCode(this.persistent) + ((Boolean.hashCode(this.httpOnly) + ((Boolean.hashCode(this.secure) + e.a(this.path, e.a(this.domain, b.a(this.expiresAt, e.a(this.value, e.a(this.name, 527, 31), 31), 31), 31), 31)) * 31)) * 31)) * 31);
    }

    public final boolean hostOnly() {
        return this.hostOnly;
    }

    public final boolean httpOnly() {
        return this.httpOnly;
    }

    public final boolean matches(HttpUrl httpUrl) {
        j0.i(httpUrl, ImagesContract.URL);
        if ((this.hostOnly ? j0.d(httpUrl.host(), this.domain) : Companion.domainMatch(httpUrl.host(), this.domain)) && Companion.pathMatch(httpUrl, this.path)) {
            return !this.secure || httpUrl.isHttps();
        }
        return false;
    }

    public final String name() {
        return this.name;
    }

    public final String path() {
        return this.path;
    }

    public final boolean persistent() {
        return this.persistent;
    }

    public final boolean secure() {
        return this.secure;
    }

    public String toString() {
        return toString$okhttp(false);
    }

    public final String toString$okhttp(boolean z10) {
        String httpDateString;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(name());
        sb2.append('=');
        sb2.append(value());
        if (persistent()) {
            if (expiresAt() == Long.MIN_VALUE) {
                httpDateString = "; max-age=0";
            } else {
                sb2.append("; expires=");
                httpDateString = DatesKt.toHttpDateString(new Date(expiresAt()));
            }
            sb2.append(httpDateString);
        }
        if (!hostOnly()) {
            sb2.append("; domain=");
            if (z10) {
                sb2.append(".");
            }
            sb2.append(domain());
        }
        sb2.append("; path=");
        sb2.append(path());
        if (secure()) {
            sb2.append("; secure");
        }
        if (httpOnly()) {
            sb2.append("; httponly");
        }
        String string = sb2.toString();
        j0.h(string, "toString()");
        return string;
    }

    public final String value() {
        return this.value;
    }
}
