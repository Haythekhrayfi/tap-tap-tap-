package okhttp3;

import ch.qos.logback.core.CoreConstants;
import ed.q;
import ed.u;
import fd.j0;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.Util;
import vc.g;

/* JADX INFO: loaded from: classes3.dex */
public final class CacheControl {
    private String headerValue;
    private final boolean immutable;
    private final boolean isPrivate;
    private final boolean isPublic;
    private final int maxAgeSeconds;
    private final int maxStaleSeconds;
    private final int minFreshSeconds;
    private final boolean mustRevalidate;
    private final boolean noCache;
    private final boolean noStore;
    private final boolean noTransform;
    private final boolean onlyIfCached;
    private final int sMaxAgeSeconds;
    public static final Companion Companion = new Companion(null);
    public static final CacheControl FORCE_NETWORK = new Builder().noCache().build();
    public static final CacheControl FORCE_CACHE = new Builder().onlyIfCached().maxStale(Integer.MAX_VALUE, TimeUnit.SECONDS).build();

    public static final class Builder {
        private boolean immutable;
        private int maxAgeSeconds = -1;
        private int maxStaleSeconds = -1;
        private int minFreshSeconds = -1;
        private boolean noCache;
        private boolean noStore;
        private boolean noTransform;
        private boolean onlyIfCached;

        private final int clampToInt(long j10) {
            if (j10 > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            return (int) j10;
        }

        public final CacheControl build() {
            return new CacheControl(this.noCache, this.noStore, this.maxAgeSeconds, -1, false, false, false, this.maxStaleSeconds, this.minFreshSeconds, this.onlyIfCached, this.noTransform, this.immutable, null, null);
        }

        public final Builder immutable() {
            this.immutable = true;
            return this;
        }

        public final Builder maxAge(int i10, TimeUnit timeUnit) {
            j0.i(timeUnit, "timeUnit");
            if (!(i10 >= 0)) {
                throw new IllegalArgumentException(j0.p("maxAge < 0: ", Integer.valueOf(i10)).toString());
            }
            this.maxAgeSeconds = clampToInt(timeUnit.toSeconds(i10));
            return this;
        }

        public final Builder maxStale(int i10, TimeUnit timeUnit) {
            j0.i(timeUnit, "timeUnit");
            if (!(i10 >= 0)) {
                throw new IllegalArgumentException(j0.p("maxStale < 0: ", Integer.valueOf(i10)).toString());
            }
            this.maxStaleSeconds = clampToInt(timeUnit.toSeconds(i10));
            return this;
        }

        public final Builder minFresh(int i10, TimeUnit timeUnit) {
            j0.i(timeUnit, "timeUnit");
            if (!(i10 >= 0)) {
                throw new IllegalArgumentException(j0.p("minFresh < 0: ", Integer.valueOf(i10)).toString());
            }
            this.minFreshSeconds = clampToInt(timeUnit.toSeconds(i10));
            return this;
        }

        public final Builder noCache() {
            this.noCache = true;
            return this;
        }

        public final Builder noStore() {
            this.noStore = true;
            return this;
        }

        public final Builder noTransform() {
            this.noTransform = true;
            return this;
        }

        public final Builder onlyIfCached() {
            this.onlyIfCached = true;
            return this;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        private final int indexOfElement(String str, String str2, int i10) {
            int length = str.length();
            while (i10 < length) {
                int i11 = i10 + 1;
                if (u.w(str2, str.charAt(i10), false, 2)) {
                    return i10;
                }
                i10 = i11;
            }
            return str.length();
        }

        public static /* synthetic */ int indexOfElement$default(Companion companion, String str, String str2, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                i10 = 0;
            }
            return companion.indexOfElement(str, str2, i10);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x004c  */
        /* JADX WARN: Code duplicated, block: B:28:0x00bb  */
        /* JADX WARN: Code duplicated, block: B:31:0x00ca  */
        /* JADX WARN: Code duplicated, block: B:33:0x00d2  */
        /* JADX WARN: Code duplicated, block: B:35:0x00da  */
        /* JADX WARN: Code duplicated, block: B:36:0x00df  */
        /* JADX WARN: Code duplicated, block: B:38:0x00e7  */
        /* JADX WARN: Code duplicated, block: B:40:0x00f0  */
        /* JADX WARN: Code duplicated, block: B:42:0x00f9  */
        /* JADX WARN: Code duplicated, block: B:43:0x00fe  */
        /* JADX WARN: Code duplicated, block: B:45:0x0106  */
        /* JADX WARN: Code duplicated, block: B:46:0x010b  */
        /* JADX WARN: Code duplicated, block: B:48:0x0113  */
        /* JADX WARN: Code duplicated, block: B:49:0x0118  */
        /* JADX WARN: Code duplicated, block: B:51:0x0120  */
        /* JADX WARN: Code duplicated, block: B:52:0x0126  */
        /* JADX WARN: Code duplicated, block: B:54:0x012e  */
        /* JADX WARN: Code duplicated, block: B:55:0x0136  */
        /* JADX WARN: Code duplicated, block: B:57:0x013e  */
        /* JADX WARN: Code duplicated, block: B:58:0x0144  */
        /* JADX WARN: Code duplicated, block: B:60:0x014d  */
        /* JADX WARN: Code duplicated, block: B:61:0x0154  */
        /* JADX WARN: Code duplicated, block: B:63:0x015c  */
        /* JADX WARN: Code duplicated, block: B:64:0x0163  */
        /* JADX WARN: Code duplicated, block: B:66:0x016b  */
        public final CacheControl parse(Headers headers) {
            int iIndexOfElement;
            int iIndexOfElement2;
            String string;
            String string2;
            Headers headers2 = headers;
            j0.i(headers2, "headers");
            int size = headers.size();
            boolean z10 = true;
            boolean z11 = true;
            int i10 = 0;
            String str = null;
            boolean z12 = false;
            boolean z13 = false;
            int nonNegativeInt = -1;
            int nonNegativeInt2 = -1;
            boolean z14 = false;
            boolean z15 = false;
            boolean z16 = false;
            int nonNegativeInt3 = -1;
            int nonNegativeInt4 = -1;
            boolean z17 = false;
            boolean z18 = false;
            boolean z19 = false;
            while (i10 < size) {
                int i11 = i10 + 1;
                String strName = headers2.name(i10);
                String strValue = headers2.value(i10);
                if (q.i(strName, "Cache-Control", z10)) {
                    if (str == null) {
                        str = strValue;
                    }
                    iIndexOfElement = 0;
                    while (iIndexOfElement < strValue.length()) {
                        iIndexOfElement2 = indexOfElement(strValue, "=,;", iIndexOfElement);
                        String strSubstring = strValue.substring(iIndexOfElement, iIndexOfElement2);
                        j0.h(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        string = u.Y(strSubstring).toString();
                        if (iIndexOfElement2 != strValue.length() || strValue.charAt(iIndexOfElement2) == ',' || strValue.charAt(iIndexOfElement2) == ';') {
                            iIndexOfElement = iIndexOfElement2 + 1;
                            string2 = null;
                        } else {
                            int iIndexOfNonWhitespace = Util.indexOfNonWhitespace(strValue, iIndexOfElement2 + 1);
                            if (iIndexOfNonWhitespace >= strValue.length() || strValue.charAt(iIndexOfNonWhitespace) != '\"') {
                                iIndexOfElement = indexOfElement(strValue, ",;", iIndexOfNonWhitespace);
                                String strSubstring2 = strValue.substring(iIndexOfNonWhitespace, iIndexOfElement);
                                j0.h(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                string2 = u.Y(strSubstring2).toString();
                            } else {
                                int i12 = iIndexOfNonWhitespace + 1;
                                int iD = u.D(strValue, CoreConstants.DOUBLE_QUOTE_CHAR, i12, false, 4);
                                string2 = strValue.substring(i12, iD);
                                j0.h(string2, "this as java.lang.String…ing(startIndex, endIndex)");
                                iIndexOfElement = iD + 1;
                            }
                        }
                        z10 = true;
                        if (q.i("no-cache", string, true)) {
                            z12 = true;
                        } else if (q.i("no-store", string, true)) {
                            z13 = true;
                        } else if (q.i("max-age", string, true)) {
                            nonNegativeInt = Util.toNonNegativeInt(string2, -1);
                        } else if (q.i("s-maxage", string, true)) {
                            nonNegativeInt2 = Util.toNonNegativeInt(string2, -1);
                        } else if (q.i("private", string, true)) {
                            z14 = true;
                        } else if (q.i("public", string, true)) {
                            z15 = true;
                        } else if (q.i("must-revalidate", string, true)) {
                            z16 = true;
                        } else if (q.i("max-stale", string, true)) {
                            nonNegativeInt3 = Util.toNonNegativeInt(string2, Integer.MAX_VALUE);
                        } else if (q.i("min-fresh", string, true)) {
                            nonNegativeInt4 = Util.toNonNegativeInt(string2, -1);
                        } else if (q.i("only-if-cached", string, true)) {
                            z17 = true;
                        } else if (q.i("no-transform", string, true)) {
                            z18 = true;
                        } else if (q.i("immutable", string, true)) {
                            z19 = true;
                        }
                        size = size;
                    }
                    headers2 = headers;
                    i10 = i11;
                } else {
                    if (q.i(strName, "Pragma", z10)) {
                    }
                    headers2 = headers;
                    i10 = i11;
                }
                z11 = false;
                iIndexOfElement = 0;
                while (iIndexOfElement < strValue.length()) {
                    iIndexOfElement2 = indexOfElement(strValue, "=,;", iIndexOfElement);
                    String strSubstring3 = strValue.substring(iIndexOfElement, iIndexOfElement2);
                    j0.h(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    string = u.Y(strSubstring3).toString();
                    if (iIndexOfElement2 != strValue.length()) {
                        iIndexOfElement = iIndexOfElement2 + 1;
                        string2 = null;
                    } else {
                        iIndexOfElement = iIndexOfElement2 + 1;
                        string2 = null;
                    }
                    z10 = true;
                    if (q.i("no-cache", string, true)) {
                        z12 = true;
                    } else if (q.i("no-store", string, true)) {
                        z13 = true;
                    } else if (q.i("max-age", string, true)) {
                        nonNegativeInt = Util.toNonNegativeInt(string2, -1);
                    } else if (q.i("s-maxage", string, true)) {
                        nonNegativeInt2 = Util.toNonNegativeInt(string2, -1);
                    } else if (q.i("private", string, true)) {
                        z14 = true;
                    } else if (q.i("public", string, true)) {
                        z15 = true;
                    } else if (q.i("must-revalidate", string, true)) {
                        z16 = true;
                    } else if (q.i("max-stale", string, true)) {
                        nonNegativeInt3 = Util.toNonNegativeInt(string2, Integer.MAX_VALUE);
                    } else if (q.i("min-fresh", string, true)) {
                        nonNegativeInt4 = Util.toNonNegativeInt(string2, -1);
                    } else if (q.i("only-if-cached", string, true)) {
                        z17 = true;
                    } else if (q.i("no-transform", string, true)) {
                        z18 = true;
                    } else if (q.i("immutable", string, true)) {
                        z19 = true;
                    }
                    size = size;
                }
                headers2 = headers;
                i10 = i11;
            }
            return new CacheControl(z12, z13, nonNegativeInt, nonNegativeInt2, z14, z15, z16, nonNegativeInt3, nonNegativeInt4, z17, z18, z19, !z11 ? null : str, null);
        }
    }

    private CacheControl(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str) {
        this.noCache = z10;
        this.noStore = z11;
        this.maxAgeSeconds = i10;
        this.sMaxAgeSeconds = i11;
        this.isPrivate = z12;
        this.isPublic = z13;
        this.mustRevalidate = z14;
        this.maxStaleSeconds = i12;
        this.minFreshSeconds = i13;
        this.onlyIfCached = z15;
        this.noTransform = z16;
        this.immutable = z17;
        this.headerValue = str;
    }

    public /* synthetic */ CacheControl(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str, g gVar) {
        this(z10, z11, i10, i11, z12, z13, z14, i12, i13, z15, z16, z17, str);
    }

    public static final CacheControl parse(Headers headers) {
        return Companion.parse(headers);
    }

    /* JADX INFO: renamed from: -deprecated_immutable, reason: not valid java name */
    public final boolean m16deprecated_immutable() {
        return this.immutable;
    }

    /* JADX INFO: renamed from: -deprecated_maxAgeSeconds, reason: not valid java name */
    public final int m17deprecated_maxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    /* JADX INFO: renamed from: -deprecated_maxStaleSeconds, reason: not valid java name */
    public final int m18deprecated_maxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    /* JADX INFO: renamed from: -deprecated_minFreshSeconds, reason: not valid java name */
    public final int m19deprecated_minFreshSeconds() {
        return this.minFreshSeconds;
    }

    /* JADX INFO: renamed from: -deprecated_mustRevalidate, reason: not valid java name */
    public final boolean m20deprecated_mustRevalidate() {
        return this.mustRevalidate;
    }

    /* JADX INFO: renamed from: -deprecated_noCache, reason: not valid java name */
    public final boolean m21deprecated_noCache() {
        return this.noCache;
    }

    /* JADX INFO: renamed from: -deprecated_noStore, reason: not valid java name */
    public final boolean m22deprecated_noStore() {
        return this.noStore;
    }

    /* JADX INFO: renamed from: -deprecated_noTransform, reason: not valid java name */
    public final boolean m23deprecated_noTransform() {
        return this.noTransform;
    }

    /* JADX INFO: renamed from: -deprecated_onlyIfCached, reason: not valid java name */
    public final boolean m24deprecated_onlyIfCached() {
        return this.onlyIfCached;
    }

    /* JADX INFO: renamed from: -deprecated_sMaxAgeSeconds, reason: not valid java name */
    public final int m25deprecated_sMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    public final boolean immutable() {
        return this.immutable;
    }

    public final boolean isPrivate() {
        return this.isPrivate;
    }

    public final boolean isPublic() {
        return this.isPublic;
    }

    public final int maxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    public final int maxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    public final int minFreshSeconds() {
        return this.minFreshSeconds;
    }

    public final boolean mustRevalidate() {
        return this.mustRevalidate;
    }

    public final boolean noCache() {
        return this.noCache;
    }

    public final boolean noStore() {
        return this.noStore;
    }

    public final boolean noTransform() {
        return this.noTransform;
    }

    public final boolean onlyIfCached() {
        return this.onlyIfCached;
    }

    public final int sMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    public String toString() {
        String str = this.headerValue;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        if (noCache()) {
            sb2.append("no-cache, ");
        }
        if (noStore()) {
            sb2.append("no-store, ");
        }
        if (maxAgeSeconds() != -1) {
            sb2.append("max-age=");
            sb2.append(maxAgeSeconds());
            sb2.append(", ");
        }
        if (sMaxAgeSeconds() != -1) {
            sb2.append("s-maxage=");
            sb2.append(sMaxAgeSeconds());
            sb2.append(", ");
        }
        if (isPrivate()) {
            sb2.append("private, ");
        }
        if (isPublic()) {
            sb2.append("public, ");
        }
        if (mustRevalidate()) {
            sb2.append("must-revalidate, ");
        }
        if (maxStaleSeconds() != -1) {
            sb2.append("max-stale=");
            sb2.append(maxStaleSeconds());
            sb2.append(", ");
        }
        if (minFreshSeconds() != -1) {
            sb2.append("min-fresh=");
            sb2.append(minFreshSeconds());
            sb2.append(", ");
        }
        if (onlyIfCached()) {
            sb2.append("only-if-cached, ");
        }
        if (noTransform()) {
            sb2.append("no-transform, ");
        }
        if (immutable()) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            return "";
        }
        sb2.delete(sb2.length() - 2, sb2.length());
        String string = sb2.toString();
        j0.h(string, "StringBuilder().apply(builderAction).toString()");
        this.headerValue = string;
        return string;
    }
}
