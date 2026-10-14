package okhttp3;

import androidx.fragment.app.d0;
import bd.e;
import ch.qos.logback.classic.pattern.CallerDataConverter;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogConstants;
import com.applovin.sdk.AppLovinEventParameters;
import com.developer.filepicker.model.DialogConfigs;
import com.google.android.gms.common.internal.ImagesContract;
import defpackage.a;
import ed.f;
import ed.q;
import ed.u;
import ed.w;
import fd.j0;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kc.m;
import kc.y;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import qd.c;
import vc.g;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class HttpUrl {
    public static final String FORM_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#&!$(),~";
    public static final String FRAGMENT_ENCODE_SET = "";
    public static final String FRAGMENT_ENCODE_SET_URI = " \"#<>\\^`{|}";
    public static final String PASSWORD_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    public static final String PATH_SEGMENT_ENCODE_SET = " \"<>^`{}|/\\?#";
    public static final String PATH_SEGMENT_ENCODE_SET_URI = "[]";
    public static final String QUERY_COMPONENT_ENCODE_SET = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";
    public static final String QUERY_COMPONENT_ENCODE_SET_URI = "\\^`{|}";
    public static final String QUERY_COMPONENT_REENCODE_SET = " \"'<>#&=";
    public static final String QUERY_ENCODE_SET = " \"'<>#";
    public static final String USERNAME_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    private final String fragment;
    private final String host;
    private final boolean isHttps;
    private final String password;
    private final List<String> pathSegments;
    private final int port;
    private final List<String> queryNamesAndValues;
    private final String scheme;
    private final String url;
    private final String username;
    public static final Companion Companion = new Companion(null);
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static final class Builder {
        public static final Companion Companion = new Companion(null);
        public static final String INVALID_HOST = "Invalid URL host";
        private String encodedFragment;
        private final List<String> encodedPathSegments;
        private List<String> encodedQueryNamesAndValues;
        private String host;
        private String scheme;
        private String encodedUsername = "";
        private String encodedPassword = "";
        private int port = -1;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(g gVar) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int parsePort(String str, int i10, int i11) {
                try {
                    int i12 = Integer.parseInt(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i10, i11, "", false, false, false, false, null, 248, null));
                    boolean z10 = false;
                    if (1 <= i12 && i12 < 65536) {
                        z10 = true;
                    }
                    if (z10) {
                        return i12;
                    }
                    return -1;
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int portColonOffset(String str, int i10, int i11) {
                while (i10 < i11) {
                    char cCharAt = str.charAt(i10);
                    if (cCharAt == '[') {
                        do {
                            i10++;
                            if (i10 >= i11) {
                                break;
                            }
                        } while (str.charAt(i10) != ']');
                    } else if (cCharAt == ':') {
                        return i10;
                    }
                    i10++;
                }
                return i11;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int schemeDelimiterOffset(String str, int i10, int i11) {
                if (i11 - i10 < 2) {
                    return -1;
                }
                char cCharAt = str.charAt(i10);
                if ((j0.k(cCharAt, 97) < 0 || j0.k(cCharAt, 122) > 0) && (j0.k(cCharAt, 65) < 0 || j0.k(cCharAt, 90) > 0)) {
                    return -1;
                }
                int i12 = i10 + 1;
                while (i12 < i11) {
                    int i13 = i12 + 1;
                    char cCharAt2 = str.charAt(i12);
                    if (!(((((('a' <= cCharAt2 && cCharAt2 < '{') || ('A' <= cCharAt2 && cCharAt2 < '[')) || ('0' <= cCharAt2 && cCharAt2 < ':')) || cCharAt2 == '+') || cCharAt2 == '-') || cCharAt2 == '.')) {
                        if (cCharAt2 == ':') {
                            return i12;
                        }
                        return -1;
                    }
                    i12 = i13;
                }
                return -1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int slashCount(String str, int i10, int i11) {
                int i12 = 0;
                while (i10 < i11) {
                    int i13 = i10 + 1;
                    char cCharAt = str.charAt(i10);
                    if (cCharAt != '\\' && cCharAt != '/') {
                        break;
                    }
                    i12++;
                    i10 = i13;
                }
                return i12;
            }
        }

        public Builder() {
            ArrayList arrayList = new ArrayList();
            this.encodedPathSegments = arrayList;
            arrayList.add("");
        }

        private final Builder addPathSegments(String str, boolean z10) {
            int i10 = 0;
            do {
                int iDelimiterOffset = Util.delimiterOffset(str, "/\\", i10, str.length());
                push(str, i10, iDelimiterOffset, iDelimiterOffset < str.length(), z10);
                i10 = iDelimiterOffset + 1;
            } while (i10 <= str.length());
            return this;
        }

        private final int effectivePort() {
            int i10 = this.port;
            if (i10 != -1) {
                return i10;
            }
            Companion companion = HttpUrl.Companion;
            String str = this.scheme;
            j0.f(str);
            return companion.defaultPort(str);
        }

        private final boolean isDot(String str) {
            return j0.d(str, ".") || q.i(str, "%2e", true);
        }

        private final boolean isDotDot(String str) {
            return j0.d(str, CallerDataConverter.DEFAULT_RANGE_DELIMITER) || q.i(str, "%2e.", true) || q.i(str, ".%2e", true) || q.i(str, "%2e%2e", true);
        }

        private final void pop() {
            List<String> list = this.encodedPathSegments;
            if (!(list.remove(list.size() - 1).length() == 0) || !(!this.encodedPathSegments.isEmpty())) {
                this.encodedPathSegments.add("");
            } else {
                List<String> list2 = this.encodedPathSegments;
                list2.set(list2.size() - 1, "");
            }
        }

        private final void push(String str, int i10, int i11, boolean z10, boolean z11) {
            String strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i10, i11, HttpUrl.PATH_SEGMENT_ENCODE_SET, z11, false, false, false, null, 240, null);
            if (isDot(strCanonicalize$okhttp$default)) {
                return;
            }
            if (isDotDot(strCanonicalize$okhttp$default)) {
                pop();
                return;
            }
            List<String> list = this.encodedPathSegments;
            if (list.get(list.size() - 1).length() == 0) {
                List<String> list2 = this.encodedPathSegments;
                list2.set(list2.size() - 1, strCanonicalize$okhttp$default);
            } else {
                this.encodedPathSegments.add(strCanonicalize$okhttp$default);
            }
            if (z10) {
                this.encodedPathSegments.add("");
            }
        }

        private final void removeAllCanonicalQueryParameters(String str) {
            List<String> list = this.encodedQueryNamesAndValues;
            j0.f(list);
            int size = list.size() - 2;
            int iL = c0.l(size, 0, -2);
            if (iL > size) {
                return;
            }
            while (true) {
                int i10 = size - 2;
                List<String> list2 = this.encodedQueryNamesAndValues;
                j0.f(list2);
                if (j0.d(str, list2.get(size))) {
                    List<String> list3 = this.encodedQueryNamesAndValues;
                    j0.f(list3);
                    list3.remove(size + 1);
                    List<String> list4 = this.encodedQueryNamesAndValues;
                    j0.f(list4);
                    list4.remove(size);
                    List<String> list5 = this.encodedQueryNamesAndValues;
                    j0.f(list5);
                    if (list5.isEmpty()) {
                        this.encodedQueryNamesAndValues = null;
                        return;
                    }
                }
                if (size == iL) {
                    return;
                } else {
                    size = i10;
                }
            }
        }

        private final void resolvePath(String str, int i10, int i11) {
            if (i10 == i11) {
                return;
            }
            char cCharAt = str.charAt(i10);
            if (cCharAt == '/' || cCharAt == '\\') {
                this.encodedPathSegments.clear();
                this.encodedPathSegments.add("");
                i10++;
            } else {
                List<String> list = this.encodedPathSegments;
                list.set(list.size() - 1, "");
            }
            while (true) {
                int i12 = i10;
                while (i12 < i11) {
                    i10 = Util.delimiterOffset(str, "/\\", i12, i11);
                    boolean z10 = i10 < i11;
                    push(str, i12, i10, z10, true);
                    if (z10) {
                        i12 = i10 + 1;
                    }
                }
                return;
            }
        }

        public final Builder addEncodedPathSegment(String str) {
            j0.i(str, "encodedPathSegment");
            push(str, 0, str.length(), false, true);
            return this;
        }

        public final Builder addEncodedPathSegments(String str) {
            j0.i(str, "encodedPathSegments");
            return addPathSegments(str, true);
        }

        public final Builder addEncodedQueryParameter(String str, String str2) {
            j0.i(str, "encodedName");
            if (getEncodedQueryNamesAndValues$okhttp() == null) {
                setEncodedQueryNamesAndValues$okhttp(new ArrayList());
            }
            List<String> encodedQueryNamesAndValues$okhttp = getEncodedQueryNamesAndValues$okhttp();
            j0.f(encodedQueryNamesAndValues$okhttp);
            Companion companion = HttpUrl.Companion;
            encodedQueryNamesAndValues$okhttp.add(Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null));
            List<String> encodedQueryNamesAndValues$okhttp2 = getEncodedQueryNamesAndValues$okhttp();
            j0.f(encodedQueryNamesAndValues$okhttp2);
            encodedQueryNamesAndValues$okhttp2.add(str2 == null ? null : Companion.canonicalize$okhttp$default(companion, str2, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null));
            return this;
        }

        public final Builder addPathSegment(String str) {
            j0.i(str, "pathSegment");
            push(str, 0, str.length(), false, false);
            return this;
        }

        public final Builder addPathSegments(String str) {
            j0.i(str, "pathSegments");
            return addPathSegments(str, false);
        }

        public final Builder addQueryParameter(String str, String str2) {
            j0.i(str, "name");
            if (getEncodedQueryNamesAndValues$okhttp() == null) {
                setEncodedQueryNamesAndValues$okhttp(new ArrayList());
            }
            List<String> encodedQueryNamesAndValues$okhttp = getEncodedQueryNamesAndValues$okhttp();
            j0.f(encodedQueryNamesAndValues$okhttp);
            Companion companion = HttpUrl.Companion;
            encodedQueryNamesAndValues$okhttp.add(Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null));
            List<String> encodedQueryNamesAndValues$okhttp2 = getEncodedQueryNamesAndValues$okhttp();
            j0.f(encodedQueryNamesAndValues$okhttp2);
            encodedQueryNamesAndValues$okhttp2.add(str2 == null ? null : Companion.canonicalize$okhttp$default(companion, str2, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null));
            return this;
        }

        public final HttpUrl build() {
            ArrayList arrayList;
            String str = this.scheme;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            Companion companion = HttpUrl.Companion;
            String strPercentDecode$okhttp$default = Companion.percentDecode$okhttp$default(companion, this.encodedUsername, 0, 0, false, 7, null);
            String strPercentDecode$okhttp$default2 = Companion.percentDecode$okhttp$default(companion, this.encodedPassword, 0, 0, false, 7, null);
            String str2 = this.host;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int iEffectivePort = effectivePort();
            List<String> list = this.encodedPathSegments;
            ArrayList arrayList2 = new ArrayList(m.j(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(Companion.percentDecode$okhttp$default(HttpUrl.Companion, (String) it.next(), 0, 0, false, 7, null));
            }
            List<String> list2 = this.encodedQueryNamesAndValues;
            if (list2 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(m.j(list2, 10));
                for (String str3 : list2) {
                    arrayList.add(str3 == null ? null : Companion.percentDecode$okhttp$default(HttpUrl.Companion, str3, 0, 0, true, 3, null));
                }
            }
            String str4 = this.encodedFragment;
            return new HttpUrl(str, strPercentDecode$okhttp$default, strPercentDecode$okhttp$default2, str2, iEffectivePort, arrayList2, arrayList, str4 == null ? null : Companion.percentDecode$okhttp$default(HttpUrl.Companion, str4, 0, 0, false, 7, null), toString());
        }

        public final Builder encodedFragment(String str) {
            setEncodedFragment$okhttp(str == null ? null : Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, "", true, false, false, true, null, 179, null));
            return this;
        }

        public final Builder encodedPassword(String str) {
            j0.i(str, "encodedPassword");
            setEncodedPassword$okhttp(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null));
            return this;
        }

        public final Builder encodedPath(String str) {
            j0.i(str, "encodedPath");
            if (!q.u(str, DialogConfigs.DIRECTORY_SEPERATOR, false, 2)) {
                throw new IllegalArgumentException(j0.p("unexpected encodedPath: ", str).toString());
            }
            resolvePath(str, 0, str.length());
            return this;
        }

        public final Builder encodedQuery(String str) {
            List<String> queryNamesAndValues$okhttp = null;
            if (str != null) {
                Companion companion = HttpUrl.Companion;
                String strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.QUERY_ENCODE_SET, true, false, true, false, null, 211, null);
                if (strCanonicalize$okhttp$default != null) {
                    queryNamesAndValues$okhttp = companion.toQueryNamesAndValues$okhttp(strCanonicalize$okhttp$default);
                }
            }
            setEncodedQueryNamesAndValues$okhttp(queryNamesAndValues$okhttp);
            return this;
        }

        public final Builder encodedUsername(String str) {
            j0.i(str, "encodedUsername");
            setEncodedUsername$okhttp(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null));
            return this;
        }

        public final Builder fragment(String str) {
            setEncodedFragment$okhttp(str == null ? null : Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, "", false, false, false, true, null, 187, null));
            return this;
        }

        public final String getEncodedFragment$okhttp() {
            return this.encodedFragment;
        }

        public final String getEncodedPassword$okhttp() {
            return this.encodedPassword;
        }

        public final List<String> getEncodedPathSegments$okhttp() {
            return this.encodedPathSegments;
        }

        public final List<String> getEncodedQueryNamesAndValues$okhttp() {
            return this.encodedQueryNamesAndValues;
        }

        public final String getEncodedUsername$okhttp() {
            return this.encodedUsername;
        }

        public final String getHost$okhttp() {
            return this.host;
        }

        public final int getPort$okhttp() {
            return this.port;
        }

        public final String getScheme$okhttp() {
            return this.scheme;
        }

        public final Builder host(String str) {
            j0.i(str, "host");
            String canonicalHost = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.Companion, str, 0, 0, false, 7, null));
            if (canonicalHost == null) {
                throw new IllegalArgumentException(j0.p("unexpected host: ", str));
            }
            setHost$okhttp(canonicalHost);
            return this;
        }

        public final Builder parse$okhttp(HttpUrl httpUrl, String str) {
            int iDelimiterOffset;
            int i10;
            int i11;
            boolean z10;
            boolean z11;
            String strP = str;
            j0.i(strP, "input");
            int iIndexOfFirstNonAsciiWhitespace$default = Util.indexOfFirstNonAsciiWhitespace$default(strP, 0, 0, 3, null);
            int iIndexOfLastNonAsciiWhitespace$default = Util.indexOfLastNonAsciiWhitespace$default(strP, iIndexOfFirstNonAsciiWhitespace$default, 0, 2, null);
            Companion companion = Companion;
            int iSchemeDelimiterOffset = companion.schemeDelimiterOffset(strP, iIndexOfFirstNonAsciiWhitespace$default, iIndexOfLastNonAsciiWhitespace$default);
            byte b10 = -1;
            boolean z12 = true;
            if (iSchemeDelimiterOffset != -1) {
                if (q.r(strP, "https:", iIndexOfFirstNonAsciiWhitespace$default, true)) {
                    this.scheme = "https";
                    iIndexOfFirstNonAsciiWhitespace$default += 6;
                } else {
                    if (!q.r(strP, "http:", iIndexOfFirstNonAsciiWhitespace$default, true)) {
                        StringBuilder sbA = a.a("Expected URL scheme 'http' or 'https' but was '");
                        String strSubstring = strP.substring(0, iSchemeDelimiterOffset);
                        j0.h(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        sbA.append(strSubstring);
                        sbA.append(CoreConstants.SINGLE_QUOTE_CHAR);
                        throw new IllegalArgumentException(sbA.toString());
                    }
                    this.scheme = "http";
                    iIndexOfFirstNonAsciiWhitespace$default += 5;
                }
            } else {
                if (httpUrl == null) {
                    if (str.length() > 6) {
                        strP = j0.p(w.b0(strP, 6), "...");
                    }
                    throw new IllegalArgumentException(j0.p("Expected URL scheme 'http' or 'https' but no scheme was found for ", strP));
                }
                this.scheme = httpUrl.scheme();
            }
            int iSlashCount = companion.slashCount(strP, iIndexOfFirstNonAsciiWhitespace$default, iIndexOfLastNonAsciiWhitespace$default);
            byte b11 = 63;
            byte b12 = 35;
            if (iSlashCount >= 2 || httpUrl == null || !j0.d(httpUrl.scheme(), this.scheme)) {
                boolean z13 = false;
                boolean z14 = false;
                int i12 = iIndexOfFirstNonAsciiWhitespace$default + iSlashCount;
                while (true) {
                    iDelimiterOffset = Util.delimiterOffset(strP, "@/\\?#", i12, iIndexOfLastNonAsciiWhitespace$default);
                    byte bCharAt = iDelimiterOffset != iIndexOfLastNonAsciiWhitespace$default ? strP.charAt(iDelimiterOffset) : b10;
                    if (bCharAt == b10 || bCharAt == b12 || bCharAt == 47 || bCharAt == 92 || bCharAt == b11) {
                        break;
                    }
                    if (bCharAt == 64) {
                        if (z13) {
                            i11 = iDelimiterOffset;
                            z10 = z12;
                            this.encodedPassword += "%40" + Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i12, i11, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                        } else {
                            int iDelimiterOffset2 = Util.delimiterOffset(strP, CoreConstants.COLON_CHAR, i12, iDelimiterOffset);
                            Companion companion2 = HttpUrl.Companion;
                            z10 = z12;
                            String strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(companion2, str, i12, iDelimiterOffset2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            if (z14) {
                                strCanonicalize$okhttp$default = d0.a(new StringBuilder(), this.encodedUsername, "%40", strCanonicalize$okhttp$default);
                            }
                            this.encodedUsername = strCanonicalize$okhttp$default;
                            i11 = iDelimiterOffset;
                            if (iDelimiterOffset2 != i11) {
                                this.encodedPassword = Companion.canonicalize$okhttp$default(companion2, str, iDelimiterOffset2 + 1, i11, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                z11 = z10;
                            } else {
                                z11 = z13;
                            }
                            z13 = z11;
                            z14 = z10;
                        }
                        i12 = i11 + 1;
                        b12 = 35;
                        b11 = 63;
                        b10 = -1;
                        iIndexOfLastNonAsciiWhitespace$default = iIndexOfLastNonAsciiWhitespace$default;
                        z12 = z10;
                    }
                }
                boolean z15 = z12;
                i10 = iIndexOfLastNonAsciiWhitespace$default;
                Companion companion3 = Companion;
                int iPortColonOffset = companion3.portColonOffset(strP, i12, iDelimiterOffset);
                int i13 = iPortColonOffset + 1;
                if (i13 < iDelimiterOffset) {
                    this.host = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.Companion, str, i12, iPortColonOffset, false, 4, null));
                    int port = companion3.parsePort(strP, i13, iDelimiterOffset);
                    this.port = port;
                    if (!(port != -1 ? z15 : false)) {
                        StringBuilder sbA2 = a.a("Invalid URL port: \"");
                        String strSubstring2 = strP.substring(i13, iDelimiterOffset);
                        j0.h(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                        sbA2.append(strSubstring2);
                        sbA2.append(CoreConstants.DOUBLE_QUOTE_CHAR);
                        throw new IllegalArgumentException(sbA2.toString().toString());
                    }
                } else {
                    Companion companion4 = HttpUrl.Companion;
                    this.host = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(companion4, str, i12, iPortColonOffset, false, 4, null));
                    String str2 = this.scheme;
                    j0.f(str2);
                    this.port = companion4.defaultPort(str2);
                }
                if (!(this.host != null ? z15 : false)) {
                    StringBuilder sbA3 = a.a("Invalid URL host: \"");
                    String strSubstring3 = strP.substring(i12, iPortColonOffset);
                    j0.h(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    sbA3.append(strSubstring3);
                    sbA3.append(CoreConstants.DOUBLE_QUOTE_CHAR);
                    throw new IllegalArgumentException(sbA3.toString().toString());
                }
                iIndexOfFirstNonAsciiWhitespace$default = iDelimiterOffset;
            } else {
                this.encodedUsername = httpUrl.encodedUsername();
                this.encodedPassword = httpUrl.encodedPassword();
                this.host = httpUrl.host();
                this.port = httpUrl.port();
                this.encodedPathSegments.clear();
                this.encodedPathSegments.addAll(httpUrl.encodedPathSegments());
                if (iIndexOfFirstNonAsciiWhitespace$default == iIndexOfLastNonAsciiWhitespace$default || strP.charAt(iIndexOfFirstNonAsciiWhitespace$default) == '#') {
                    encodedQuery(httpUrl.encodedQuery());
                }
                i10 = iIndexOfLastNonAsciiWhitespace$default;
            }
            int i14 = i10;
            int iDelimiterOffset3 = Util.delimiterOffset(strP, "?#", iIndexOfFirstNonAsciiWhitespace$default, i14);
            resolvePath(strP, iIndexOfFirstNonAsciiWhitespace$default, iDelimiterOffset3);
            if (iDelimiterOffset3 < i14 && strP.charAt(iDelimiterOffset3) == '?') {
                int iDelimiterOffset4 = Util.delimiterOffset(strP, '#', iDelimiterOffset3, i14);
                Companion companion5 = HttpUrl.Companion;
                this.encodedQueryNamesAndValues = companion5.toQueryNamesAndValues$okhttp(Companion.canonicalize$okhttp$default(companion5, str, iDelimiterOffset3 + 1, iDelimiterOffset4, HttpUrl.QUERY_ENCODE_SET, true, false, true, false, null, 208, null));
                iDelimiterOffset3 = iDelimiterOffset4;
            }
            if (iDelimiterOffset3 < i14 && strP.charAt(iDelimiterOffset3) == '#') {
                this.encodedFragment = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, iDelimiterOffset3 + 1, i14, "", true, false, false, true, null, SyslogConstants.LOG_LOCAL6, null);
            }
            return this;
        }

        public final Builder password(String str) {
            j0.i(str, "password");
            setEncodedPassword$okhttp(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null));
            return this;
        }

        public final Builder port(int i10) {
            boolean z10 = false;
            if (1 <= i10 && i10 < 65536) {
                z10 = true;
            }
            if (!z10) {
                throw new IllegalArgumentException(j0.p("unexpected port: ", Integer.valueOf(i10)).toString());
            }
            setPort$okhttp(i10);
            return this;
        }

        public final Builder query(String str) {
            List<String> queryNamesAndValues$okhttp = null;
            if (str != null) {
                Companion companion = HttpUrl.Companion;
                String strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.QUERY_ENCODE_SET, false, false, true, false, null, 219, null);
                if (strCanonicalize$okhttp$default != null) {
                    queryNamesAndValues$okhttp = companion.toQueryNamesAndValues$okhttp(strCanonicalize$okhttp$default);
                }
            }
            setEncodedQueryNamesAndValues$okhttp(queryNamesAndValues$okhttp);
            return this;
        }

        public final Builder reencodeForUri$okhttp() {
            String host$okhttp = getHost$okhttp();
            setHost$okhttp(host$okhttp == null ? null : new f("[\"<>^`{|}]").b(host$okhttp, ""));
            int size = getEncodedPathSegments$okhttp().size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                getEncodedPathSegments$okhttp().set(i11, Companion.canonicalize$okhttp$default(HttpUrl.Companion, getEncodedPathSegments$okhttp().get(i11), 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, true, true, false, false, null, 227, null));
            }
            List<String> encodedQueryNamesAndValues$okhttp = getEncodedQueryNamesAndValues$okhttp();
            if (encodedQueryNamesAndValues$okhttp != null) {
                int size2 = encodedQueryNamesAndValues$okhttp.size();
                while (i10 < size2) {
                    int i12 = i10 + 1;
                    String str = encodedQueryNamesAndValues$okhttp.get(i10);
                    encodedQueryNamesAndValues$okhttp.set(i10, str == null ? null : Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET_URI, true, true, true, false, null, 195, null));
                    i10 = i12;
                }
            }
            String encodedFragment$okhttp = getEncodedFragment$okhttp();
            setEncodedFragment$okhttp(encodedFragment$okhttp != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, encodedFragment$okhttp, 0, 0, HttpUrl.FRAGMENT_ENCODE_SET_URI, true, true, false, true, null, 163, null) : null);
            return this;
        }

        public final Builder removeAllEncodedQueryParameters(String str) {
            j0.i(str, "encodedName");
            if (getEncodedQueryNamesAndValues$okhttp() == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null));
            return this;
        }

        public final Builder removeAllQueryParameters(String str) {
            j0.i(str, "name");
            if (getEncodedQueryNamesAndValues$okhttp() == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null));
            return this;
        }

        public final Builder removePathSegment(int i10) {
            getEncodedPathSegments$okhttp().remove(i10);
            if (getEncodedPathSegments$okhttp().isEmpty()) {
                getEncodedPathSegments$okhttp().add("");
            }
            return this;
        }

        public final Builder scheme(String str) {
            j0.i(str, "scheme");
            String str2 = "http";
            if (!q.i(str, "http", true)) {
                str2 = "https";
                if (!q.i(str, "https", true)) {
                    throw new IllegalArgumentException(j0.p("unexpected scheme: ", str));
                }
            }
            setScheme$okhttp(str2);
            return this;
        }

        public final void setEncodedFragment$okhttp(String str) {
            this.encodedFragment = str;
        }

        public final void setEncodedPassword$okhttp(String str) {
            j0.i(str, "<set-?>");
            this.encodedPassword = str;
        }

        public final Builder setEncodedPathSegment(int i10, String str) {
            j0.i(str, "encodedPathSegment");
            String strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET, true, false, false, false, null, 243, null);
            getEncodedPathSegments$okhttp().set(i10, strCanonicalize$okhttp$default);
            if ((isDot(strCanonicalize$okhttp$default) || isDotDot(strCanonicalize$okhttp$default)) ? false : true) {
                return this;
            }
            throw new IllegalArgumentException(j0.p("unexpected path segment: ", str).toString());
        }

        public final void setEncodedQueryNamesAndValues$okhttp(List<String> list) {
            this.encodedQueryNamesAndValues = list;
        }

        public final Builder setEncodedQueryParameter(String str, String str2) {
            j0.i(str, "encodedName");
            removeAllEncodedQueryParameters(str);
            addEncodedQueryParameter(str, str2);
            return this;
        }

        public final void setEncodedUsername$okhttp(String str) {
            j0.i(str, "<set-?>");
            this.encodedUsername = str;
        }

        public final void setHost$okhttp(String str) {
            this.host = str;
        }

        public final Builder setPathSegment(int i10, String str) {
            j0.i(str, "pathSegment");
            String strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET, false, false, false, false, null, 251, null);
            if (!((isDot(strCanonicalize$okhttp$default) || isDotDot(strCanonicalize$okhttp$default)) ? false : true)) {
                throw new IllegalArgumentException(j0.p("unexpected path segment: ", str).toString());
            }
            getEncodedPathSegments$okhttp().set(i10, strCanonicalize$okhttp$default);
            return this;
        }

        public final void setPort$okhttp(int i10) {
            this.port = i10;
        }

        public final Builder setQueryParameter(String str, String str2) {
            j0.i(str, "name");
            removeAllQueryParameters(str);
            addQueryParameter(str, str2);
            return this;
        }

        public final void setScheme$okhttp(String str) {
            this.scheme = str;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x003c  */
        /* JADX WARN: Code duplicated, block: B:20:0x004e  */
        /* JADX WARN: Code duplicated, block: B:22:0x0051  */
        /* JADX WARN: Code duplicated, block: B:38:0x00b3  */
        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            if (getScheme$okhttp() != null) {
                sb2.append(getScheme$okhttp());
                str = "://";
            } else {
                str = "//";
            }
            sb2.append(str);
            if (getEncodedUsername$okhttp().length() > 0) {
                sb2.append(getEncodedUsername$okhttp());
                if (getEncodedPassword$okhttp().length() > 0) {
                    sb2.append(CoreConstants.COLON_CHAR);
                    sb2.append(getEncodedPassword$okhttp());
                }
                sb2.append('@');
            } else {
                if (getEncodedPassword$okhttp().length() > 0) {
                    sb2.append(getEncodedUsername$okhttp());
                    if (getEncodedPassword$okhttp().length() > 0) {
                        sb2.append(CoreConstants.COLON_CHAR);
                        sb2.append(getEncodedPassword$okhttp());
                    }
                    sb2.append('@');
                }
            }
            if (getHost$okhttp() != null) {
                String host$okhttp = getHost$okhttp();
                j0.f(host$okhttp);
                if (u.w(host$okhttp, CoreConstants.COLON_CHAR, false, 2)) {
                    sb2.append('[');
                    sb2.append(getHost$okhttp());
                    sb2.append(']');
                } else {
                    sb2.append(getHost$okhttp());
                }
            }
            if (getPort$okhttp() != -1 || getScheme$okhttp() != null) {
                int iEffectivePort = effectivePort();
                if (getScheme$okhttp() != null) {
                    Companion companion = HttpUrl.Companion;
                    String scheme$okhttp = getScheme$okhttp();
                    j0.f(scheme$okhttp);
                    if (iEffectivePort != companion.defaultPort(scheme$okhttp)) {
                        sb2.append(CoreConstants.COLON_CHAR);
                        sb2.append(iEffectivePort);
                    }
                } else {
                    sb2.append(CoreConstants.COLON_CHAR);
                    sb2.append(iEffectivePort);
                }
            }
            Companion companion2 = HttpUrl.Companion;
            companion2.toPathString$okhttp(getEncodedPathSegments$okhttp(), sb2);
            if (getEncodedQueryNamesAndValues$okhttp() != null) {
                sb2.append('?');
                List<String> encodedQueryNamesAndValues$okhttp = getEncodedQueryNamesAndValues$okhttp();
                j0.f(encodedQueryNamesAndValues$okhttp);
                companion2.toQueryString$okhttp(encodedQueryNamesAndValues$okhttp, sb2);
            }
            if (getEncodedFragment$okhttp() != null) {
                sb2.append('#');
                sb2.append(getEncodedFragment$okhttp());
            }
            String string = sb2.toString();
            j0.h(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }

        public final Builder username(String str) {
            j0.i(str, AppLovinEventParameters.USER_ACCOUNT_IDENTIFIER);
            setEncodedUsername$okhttp(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null));
            return this;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public static /* synthetic */ String canonicalize$okhttp$default(Companion companion, String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset, int i12, Object obj) {
            return companion.canonicalize$okhttp(str, (i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? str.length() : i11, str2, (i12 & 8) != 0 ? false : z10, (i12 & 16) != 0 ? false : z11, (i12 & 32) != 0 ? false : z12, (i12 & 64) != 0 ? false : z13, (i12 & 128) != 0 ? null : charset);
        }

        private final boolean isPercentEncoded(String str, int i10, int i11) {
            int i12 = i10 + 2;
            return i12 < i11 && str.charAt(i10) == '%' && Util.parseHexDigit(str.charAt(i10 + 1)) != -1 && Util.parseHexDigit(str.charAt(i12)) != -1;
        }

        public static /* synthetic */ String percentDecode$okhttp$default(Companion companion, String str, int i10, int i11, boolean z10, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = str.length();
            }
            if ((i12 & 4) != 0) {
                z10 = false;
            }
            return companion.percentDecode$okhttp(str, i10, i11, z10);
        }

        /* JADX WARN: Code duplicated, block: B:37:0x0061  */
        /* JADX WARN: Code duplicated, block: B:39:0x0066  */
        /* JADX WARN: Code duplicated, block: B:42:0x006d  */
        /* JADX WARN: Code duplicated, block: B:48:0x0086  */
        /* JADX WARN: Code duplicated, block: B:51:0x008f A[LOOP:1: B:49:0x0089->B:51:0x008f, LOOP_END] */
        private final void writeCanonicalized(c cVar, String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
            c cVar2 = null;
            int iCharCount = i10;
            while (iCharCount < i11) {
                int iCodePointAt = str.codePointAt(iCharCount);
                if (!z10 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                    if (iCodePointAt == 43 && z12) {
                        cVar.e0(z10 ? "+" : "%2B");
                    } else if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z13) || u.w(str2, (char) iCodePointAt, false, 2))) {
                        if (cVar2 == null) {
                            cVar2 = new c();
                        }
                        if (charset != null || j0.d(charset, StandardCharsets.UTF_8)) {
                            cVar2.g0(iCodePointAt);
                        } else {
                            cVar2.d0(str, iCharCount, Character.charCount(iCodePointAt) + iCharCount, charset);
                        }
                        while (!cVar2.y()) {
                            int i12 = cVar2.readByte() & 255;
                            cVar.R(37);
                            cVar.R(HttpUrl.HEX_DIGITS[(i12 >> 4) & 15]);
                            cVar.R(HttpUrl.HEX_DIGITS[i12 & 15]);
                        }
                    } else {
                        if (iCodePointAt == 37) {
                            if (z10) {
                                if (z11) {
                                    if (!isPercentEncoded(str, iCharCount, i11)) {
                                    }
                                }
                            }
                            if (cVar2 == null) {
                                cVar2 = new c();
                            }
                            if (charset != null) {
                                cVar2.g0(iCodePointAt);
                            } else {
                                cVar2.g0(iCodePointAt);
                            }
                            while (!cVar2.y()) {
                                int i13 = cVar2.readByte() & 255;
                                cVar.R(37);
                                cVar.R(HttpUrl.HEX_DIGITS[(i13 >> 4) & 15]);
                                cVar.R(HttpUrl.HEX_DIGITS[i13 & 15]);
                            }
                        }
                        cVar.g0(iCodePointAt);
                    }
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
        }

        private final void writePercentDecoded(c cVar, String str, int i10, int i11, boolean z10) {
            int i12;
            while (i10 < i11) {
                int iCodePointAt = str.codePointAt(i10);
                if (iCodePointAt == 37 && (i12 = i10 + 2) < i11) {
                    int hexDigit = Util.parseHexDigit(str.charAt(i10 + 1));
                    int hexDigit2 = Util.parseHexDigit(str.charAt(i12));
                    if (hexDigit == -1 || hexDigit2 == -1) {
                        cVar.g0(iCodePointAt);
                        i10 += Character.charCount(iCodePointAt);
                    } else {
                        cVar.R((hexDigit << 4) + hexDigit2);
                        i10 = Character.charCount(iCodePointAt) + i12;
                    }
                } else if (iCodePointAt == 43 && z10) {
                    cVar.R(32);
                    i10++;
                } else {
                    cVar.g0(iCodePointAt);
                    i10 += Character.charCount(iCodePointAt);
                }
            }
        }

        /* JADX INFO: renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m74deprecated_get(String str) {
            j0.i(str, ImagesContract.URL);
            return get(str);
        }

        /* JADX INFO: renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m75deprecated_get(URI uri) {
            j0.i(uri, "uri");
            return get(uri);
        }

        /* JADX INFO: renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m76deprecated_get(URL url) {
            j0.i(url, ImagesContract.URL);
            return get(url);
        }

        /* JADX INFO: renamed from: -deprecated_parse, reason: not valid java name */
        public final HttpUrl m77deprecated_parse(String str) {
            j0.i(str, ImagesContract.URL);
            return parse(str);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x003d  */
        public final String canonicalize$okhttp(String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
            j0.i(str, "<this>");
            j0.i(str2, "encodeSet");
            int iCharCount = i10;
            while (true) {
                if (iCharCount >= i11) {
                    String strSubstring = str.substring(i10, i11);
                    j0.h(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    return strSubstring;
                }
                int iCodePointAt = str.codePointAt(iCharCount);
                if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z13) || u.w(str2, (char) iCodePointAt, false, 2))) {
                    break;
                }
                if (iCodePointAt == 37) {
                    if (!z10) {
                        break;
                    }
                    if (z11) {
                        if (isPercentEncoded(str, iCharCount, i11)) {
                        }
                    }
                    if (iCodePointAt == 43) {
                    }
                    iCharCount += Character.charCount(iCodePointAt);
                } else if (iCodePointAt == 43 || !z12) {
                    iCharCount += Character.charCount(iCodePointAt);
                }
                c cVar = new c();
                cVar.f0(str, i10, iCharCount);
                writeCanonicalized(cVar, str, iCharCount, i11, str2, z10, z11, z12, z13, charset);
                return cVar.n();
            }
            c cVar2 = new c();
            cVar2.f0(str, i10, iCharCount);
            writeCanonicalized(cVar2, str, iCharCount, i11, str2, z10, z11, z12, z13, charset);
            return cVar2.n();
        }

        public final int defaultPort(String str) {
            j0.i(str, "scheme");
            if (j0.d(str, "http")) {
                return 80;
            }
            return j0.d(str, "https") ? 443 : -1;
        }

        public final HttpUrl get(String str) {
            j0.i(str, "<this>");
            return new Builder().parse$okhttp(null, str).build();
        }

        public final HttpUrl get(URI uri) {
            j0.i(uri, "<this>");
            String string = uri.toString();
            j0.h(string, "toString()");
            return parse(string);
        }

        public final HttpUrl get(URL url) {
            j0.i(url, "<this>");
            String string = url.toString();
            j0.h(string, "toString()");
            return parse(string);
        }

        public final HttpUrl parse(String str) {
            j0.i(str, "<this>");
            try {
                return get(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public final String percentDecode$okhttp(String str, int i10, int i11, boolean z10) {
            j0.i(str, "<this>");
            int i12 = i10;
            while (i12 < i11) {
                int i13 = i12 + 1;
                char cCharAt = str.charAt(i12);
                if (cCharAt == '%' || (cCharAt == '+' && z10)) {
                    c cVar = new c();
                    cVar.f0(str, i10, i12);
                    writePercentDecoded(cVar, str, i12, i11, z10);
                    return cVar.n();
                }
                i12 = i13;
            }
            String strSubstring = str.substring(i10, i11);
            j0.h(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        public final void toPathString$okhttp(List<String> list, StringBuilder sb2) {
            j0.i(list, "<this>");
            j0.i(sb2, "out");
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append('/');
                sb2.append(list.get(i10));
            }
        }

        public final List<String> toQueryNamesAndValues$okhttp(String str) {
            String strSubstring;
            j0.i(str, "<this>");
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (i10 <= str.length()) {
                int iD = u.D(str, '&', i10, false, 4);
                if (iD == -1) {
                    iD = str.length();
                }
                int iD2 = u.D(str, '=', i10, false, 4);
                if (iD2 == -1 || iD2 > iD) {
                    String strSubstring2 = str.substring(i10, iD);
                    j0.h(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring2);
                    strSubstring = null;
                } else {
                    String strSubstring3 = str.substring(i10, iD2);
                    j0.h(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring3);
                    strSubstring = str.substring(iD2 + 1, iD);
                    j0.h(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                arrayList.add(strSubstring);
                i10 = iD + 1;
            }
            return arrayList;
        }

        public final void toQueryString$okhttp(List<String> list, StringBuilder sb2) {
            j0.i(list, "<this>");
            j0.i(sb2, "out");
            bd.a aVarG = e.g(e.h(0, list.size()), 2);
            int i10 = aVarG.f3515c;
            int i11 = aVarG.f3516d;
            int i12 = aVarG.f3517e;
            if ((i12 <= 0 || i10 > i11) && (i12 >= 0 || i11 > i10)) {
                return;
            }
            while (true) {
                int i13 = i10 + i12;
                String str = list.get(i10);
                String str2 = list.get(i10 + 1);
                if (i10 > 0) {
                    sb2.append('&');
                }
                sb2.append(str);
                if (str2 != null) {
                    sb2.append('=');
                    sb2.append(str2);
                }
                if (i10 == i11) {
                    return;
                } else {
                    i10 = i13;
                }
            }
        }
    }

    public HttpUrl(String str, String str2, String str3, String str4, int i10, List<String> list, List<String> list2, String str5, String str6) {
        j0.i(str, "scheme");
        j0.i(str2, AppLovinEventParameters.USER_ACCOUNT_IDENTIFIER);
        j0.i(str3, "password");
        j0.i(str4, "host");
        j0.i(list, "pathSegments");
        j0.i(str6, ImagesContract.URL);
        this.scheme = str;
        this.username = str2;
        this.password = str3;
        this.host = str4;
        this.port = i10;
        this.pathSegments = list;
        this.queryNamesAndValues = list2;
        this.fragment = str5;
        this.url = str6;
        this.isHttps = j0.d(str, "https");
    }

    public static final int defaultPort(String str) {
        return Companion.defaultPort(str);
    }

    public static final HttpUrl get(String str) {
        return Companion.get(str);
    }

    public static final HttpUrl get(URI uri) {
        return Companion.get(uri);
    }

    public static final HttpUrl get(URL url) {
        return Companion.get(url);
    }

    public static final HttpUrl parse(String str) {
        return Companion.parse(str);
    }

    /* JADX INFO: renamed from: -deprecated_encodedFragment, reason: not valid java name */
    public final String m55deprecated_encodedFragment() {
        return encodedFragment();
    }

    /* JADX INFO: renamed from: -deprecated_encodedPassword, reason: not valid java name */
    public final String m56deprecated_encodedPassword() {
        return encodedPassword();
    }

    /* JADX INFO: renamed from: -deprecated_encodedPath, reason: not valid java name */
    public final String m57deprecated_encodedPath() {
        return encodedPath();
    }

    /* JADX INFO: renamed from: -deprecated_encodedPathSegments, reason: not valid java name */
    public final List<String> m58deprecated_encodedPathSegments() {
        return encodedPathSegments();
    }

    /* JADX INFO: renamed from: -deprecated_encodedQuery, reason: not valid java name */
    public final String m59deprecated_encodedQuery() {
        return encodedQuery();
    }

    /* JADX INFO: renamed from: -deprecated_encodedUsername, reason: not valid java name */
    public final String m60deprecated_encodedUsername() {
        return encodedUsername();
    }

    /* JADX INFO: renamed from: -deprecated_fragment, reason: not valid java name */
    public final String m61deprecated_fragment() {
        return this.fragment;
    }

    /* JADX INFO: renamed from: -deprecated_host, reason: not valid java name */
    public final String m62deprecated_host() {
        return this.host;
    }

    /* JADX INFO: renamed from: -deprecated_password, reason: not valid java name */
    public final String m63deprecated_password() {
        return this.password;
    }

    /* JADX INFO: renamed from: -deprecated_pathSegments, reason: not valid java name */
    public final List<String> m64deprecated_pathSegments() {
        return this.pathSegments;
    }

    /* JADX INFO: renamed from: -deprecated_pathSize, reason: not valid java name */
    public final int m65deprecated_pathSize() {
        return pathSize();
    }

    /* JADX INFO: renamed from: -deprecated_port, reason: not valid java name */
    public final int m66deprecated_port() {
        return this.port;
    }

    /* JADX INFO: renamed from: -deprecated_query, reason: not valid java name */
    public final String m67deprecated_query() {
        return query();
    }

    /* JADX INFO: renamed from: -deprecated_queryParameterNames, reason: not valid java name */
    public final Set<String> m68deprecated_queryParameterNames() {
        return queryParameterNames();
    }

    /* JADX INFO: renamed from: -deprecated_querySize, reason: not valid java name */
    public final int m69deprecated_querySize() {
        return querySize();
    }

    /* JADX INFO: renamed from: -deprecated_scheme, reason: not valid java name */
    public final String m70deprecated_scheme() {
        return this.scheme;
    }

    /* JADX INFO: renamed from: -deprecated_uri, reason: not valid java name */
    public final URI m71deprecated_uri() {
        return uri();
    }

    /* JADX INFO: renamed from: -deprecated_url, reason: not valid java name */
    public final URL m72deprecated_url() {
        return url();
    }

    /* JADX INFO: renamed from: -deprecated_username, reason: not valid java name */
    public final String m73deprecated_username() {
        return this.username;
    }

    public final String encodedFragment() {
        if (this.fragment == null) {
            return null;
        }
        String strSubstring = this.url.substring(u.D(this.url, '#', 0, false, 6) + 1);
        j0.h(strSubstring, "this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    public final String encodedPassword() {
        if (this.password.length() == 0) {
            return "";
        }
        String strSubstring = this.url.substring(u.D(this.url, CoreConstants.COLON_CHAR, this.scheme.length() + 3, false, 4) + 1, u.D(this.url, '@', 0, false, 6));
        j0.h(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String encodedPath() {
        int iD = u.D(this.url, '/', this.scheme.length() + 3, false, 4);
        String str = this.url;
        String strSubstring = this.url.substring(iD, Util.delimiterOffset(str, "?#", iD, str.length()));
        j0.h(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final List<String> encodedPathSegments() {
        int iD = u.D(this.url, '/', this.scheme.length() + 3, false, 4);
        String str = this.url;
        int iDelimiterOffset = Util.delimiterOffset(str, "?#", iD, str.length());
        ArrayList arrayList = new ArrayList();
        while (iD < iDelimiterOffset) {
            int i10 = iD + 1;
            int iDelimiterOffset2 = Util.delimiterOffset(this.url, '/', i10, iDelimiterOffset);
            String strSubstring = this.url.substring(i10, iDelimiterOffset2);
            j0.h(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iD = iDelimiterOffset2;
        }
        return arrayList;
    }

    public final String encodedQuery() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        int iD = u.D(this.url, '?', 0, false, 6) + 1;
        String str = this.url;
        String strSubstring = this.url.substring(iD, Util.delimiterOffset(str, '#', iD, str.length()));
        j0.h(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String encodedUsername() {
        if (this.username.length() == 0) {
            return "";
        }
        int length = this.scheme.length() + 3;
        String str = this.url;
        String strSubstring = this.url.substring(length, Util.delimiterOffset(str, ":@", length, str.length()));
        j0.h(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public boolean equals(Object obj) {
        return (obj instanceof HttpUrl) && j0.d(((HttpUrl) obj).url, this.url);
    }

    public final String fragment() {
        return this.fragment;
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    public final String host() {
        return this.host;
    }

    public final boolean isHttps() {
        return this.isHttps;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.setScheme$okhttp(this.scheme);
        builder.setEncodedUsername$okhttp(encodedUsername());
        builder.setEncodedPassword$okhttp(encodedPassword());
        builder.setHost$okhttp(this.host);
        builder.setPort$okhttp(this.port != Companion.defaultPort(this.scheme) ? this.port : -1);
        builder.getEncodedPathSegments$okhttp().clear();
        builder.getEncodedPathSegments$okhttp().addAll(encodedPathSegments());
        builder.encodedQuery(encodedQuery());
        builder.setEncodedFragment$okhttp(encodedFragment());
        return builder;
    }

    public final Builder newBuilder(String str) {
        j0.i(str, "link");
        try {
            return new Builder().parse$okhttp(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final String password() {
        return this.password;
    }

    public final List<String> pathSegments() {
        return this.pathSegments;
    }

    public final int pathSize() {
        return this.pathSegments.size();
    }

    public final int port() {
        return this.port;
    }

    public final String query() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        Companion.toQueryString$okhttp(this.queryNamesAndValues, sb2);
        return sb2.toString();
    }

    public final String queryParameter(String str) {
        j0.i(str, "name");
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            return null;
        }
        bd.a aVarG = e.g(e.h(0, list.size()), 2);
        int i10 = aVarG.f3515c;
        int i11 = aVarG.f3516d;
        int i12 = aVarG.f3517e;
        if ((i12 > 0 && i10 <= i11) || (i12 < 0 && i11 <= i10)) {
            while (true) {
                int i13 = i10 + i12;
                if (j0.d(str, this.queryNamesAndValues.get(i10))) {
                    return this.queryNamesAndValues.get(i10 + 1);
                }
                if (i10 != i11) {
                    i10 = i13;
                }
            }
        }
        return null;
    }

    public final String queryParameterName(int i10) {
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            throw new IndexOutOfBoundsException();
        }
        String str = list.get(i10 * 2);
        j0.f(str);
        return str;
    }

    public final Set<String> queryParameterNames() {
        if (this.queryNamesAndValues == null) {
            return y.f32011c;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        bd.a aVarG = e.g(e.h(0, this.queryNamesAndValues.size()), 2);
        int i10 = aVarG.f3515c;
        int i11 = aVarG.f3516d;
        int i12 = aVarG.f3517e;
        if ((i12 > 0 && i10 <= i11) || (i12 < 0 && i11 <= i10)) {
            while (true) {
                int i13 = i10 + i12;
                String str = this.queryNamesAndValues.get(i10);
                j0.f(str);
                linkedHashSet.add(str);
                if (i10 == i11) {
                    break;
                }
                i10 = i13;
            }
        }
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        j0.h(setUnmodifiableSet, "unmodifiableSet(result)");
        return setUnmodifiableSet;
    }

    public final String queryParameterValue(int i10) {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.get((i10 * 2) + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    public final List<String> queryParameterValues(String str) {
        j0.i(str, "name");
        if (this.queryNamesAndValues == null) {
            return kc.w.f32009c;
        }
        ArrayList arrayList = new ArrayList();
        bd.a aVarG = e.g(e.h(0, this.queryNamesAndValues.size()), 2);
        int i10 = aVarG.f3515c;
        int i11 = aVarG.f3516d;
        int i12 = aVarG.f3517e;
        if ((i12 > 0 && i10 <= i11) || (i12 < 0 && i11 <= i10)) {
            while (true) {
                int i13 = i10 + i12;
                if (j0.d(str, this.queryNamesAndValues.get(i10))) {
                    arrayList.add(this.queryNamesAndValues.get(i10 + 1));
                }
                if (i10 == i11) {
                    break;
                }
                i10 = i13;
            }
        }
        List<String> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        j0.h(listUnmodifiableList, "unmodifiableList(result)");
        return listUnmodifiableList;
    }

    public final int querySize() {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    public final String redact() {
        Builder builderNewBuilder = newBuilder("/...");
        j0.f(builderNewBuilder);
        return builderNewBuilder.username("").password("").build().toString();
    }

    public final HttpUrl resolve(String str) {
        j0.i(str, "link");
        Builder builderNewBuilder = newBuilder(str);
        if (builderNewBuilder == null) {
            return null;
        }
        return builderNewBuilder.build();
    }

    public final String scheme() {
        return this.scheme;
    }

    public String toString() {
        return this.url;
    }

    public final String topPrivateDomain() {
        if (Util.canParseAsIpAddress(this.host)) {
            return null;
        }
        return PublicSuffixDatabase.Companion.get().getEffectiveTldPlusOne(this.host);
    }

    public final URI uri() {
        String string = newBuilder().reencodeForUri$okhttp().toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e10) {
            try {
                URI uriCreate = URI.create(new f("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").b(string, ""));
                j0.h(uriCreate, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final URL url() {
        try {
            return new URL(this.url);
        } catch (MalformedURLException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final String username() {
        return this.username;
    }
}
