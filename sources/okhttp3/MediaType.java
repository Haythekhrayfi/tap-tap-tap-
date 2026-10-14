package okhttp3;

import ch.qos.logback.core.CoreConstants;
import defpackage.a;
import ed.q;
import fd.j0;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l8.a1;
import vc.g;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class MediaType {
    private static final String QUOTED = "\"([^\"]*)\"";
    private static final String TOKEN = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)";
    private final String mediaType;
    private final String[] parameterNamesAndValues;
    private final String subtype;
    private final String type;
    public static final Companion Companion = new Companion(null);
    private static final Pattern TYPE_SUBTYPE = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    private static final Pattern PARAMETER = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        /* JADX INFO: renamed from: -deprecated_get, reason: not valid java name */
        public final MediaType m80deprecated_get(String str) {
            j0.i(str, "mediaType");
            return get(str);
        }

        /* JADX INFO: renamed from: -deprecated_parse, reason: not valid java name */
        public final MediaType m81deprecated_parse(String str) {
            j0.i(str, "mediaType");
            return parse(str);
        }

        public final MediaType get(String str) {
            j0.i(str, "<this>");
            Matcher matcher = MediaType.TYPE_SUBTYPE.matcher(str);
            if (!matcher.lookingAt()) {
                throw new IllegalArgumentException(a1.a("No subtype found for: \"", str, CoreConstants.DOUBLE_QUOTE_CHAR).toString());
            }
            String strGroup = matcher.group(1);
            j0.h(strGroup, "typeSubtype.group(1)");
            Locale locale = Locale.US;
            j0.h(locale, "US");
            String lowerCase = strGroup.toLowerCase(locale);
            j0.h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            String strGroup2 = matcher.group(2);
            j0.h(strGroup2, "typeSubtype.group(2)");
            j0.h(locale, "US");
            String lowerCase2 = strGroup2.toLowerCase(locale);
            j0.h(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = MediaType.PARAMETER.matcher(str);
            for (int iEnd = matcher.end(); iEnd < str.length(); iEnd = matcher2.end()) {
                matcher2.region(iEnd, str.length());
                if (!matcher2.lookingAt()) {
                    StringBuilder sbA = a.a("Parameter is not formatted correctly: \"");
                    String strSubstring = str.substring(iEnd);
                    j0.h(strSubstring, "this as java.lang.String).substring(startIndex)");
                    sbA.append(strSubstring);
                    sbA.append("\" for: \"");
                    sbA.append(str);
                    sbA.append(CoreConstants.DOUBLE_QUOTE_CHAR);
                    throw new IllegalArgumentException(sbA.toString().toString());
                }
                String strGroup3 = matcher2.group(1);
                if (strGroup3 != null) {
                    String strGroup4 = matcher2.group(2);
                    if (strGroup4 == null) {
                        strGroup4 = matcher2.group(3);
                    } else if (q.u(strGroup4, "'", false, 2) && q.h(strGroup4, "'", false, 2) && strGroup4.length() > 2) {
                        strGroup4 = strGroup4.substring(1, strGroup4.length() - 1);
                        j0.h(strGroup4, "this as java.lang.String…ing(startIndex, endIndex)");
                    }
                    arrayList.add(strGroup3);
                    arrayList.add(strGroup4);
                }
            }
            Object[] array = arrayList.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            return new MediaType(str, lowerCase, lowerCase2, (String[]) array, null);
        }

        public final MediaType parse(String str) {
            j0.i(str, "<this>");
            try {
                return get(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    private MediaType(String str, String str2, String str3, String[] strArr) {
        this.mediaType = str;
        this.type = str2;
        this.subtype = str3;
        this.parameterNamesAndValues = strArr;
    }

    public /* synthetic */ MediaType(String str, String str2, String str3, String[] strArr, g gVar) {
        this(str, str2, str3, strArr);
    }

    public static /* synthetic */ Charset charset$default(MediaType mediaType, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = null;
        }
        return mediaType.charset(charset);
    }

    public static final MediaType get(String str) {
        return Companion.get(str);
    }

    public static final MediaType parse(String str) {
        return Companion.parse(str);
    }

    /* JADX INFO: renamed from: -deprecated_subtype, reason: not valid java name */
    public final String m78deprecated_subtype() {
        return this.subtype;
    }

    /* JADX INFO: renamed from: -deprecated_type, reason: not valid java name */
    public final String m79deprecated_type() {
        return this.type;
    }

    public final Charset charset() {
        return charset$default(this, null, 1, null);
    }

    public final Charset charset(Charset charset) {
        String strParameter = parameter("charset");
        if (strParameter == null) {
            return charset;
        }
        try {
            return Charset.forName(strParameter);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof MediaType) && j0.d(((MediaType) obj).mediaType, this.mediaType);
    }

    public int hashCode() {
        return this.mediaType.hashCode();
    }

    public final String parameter(String str) {
        j0.i(str, "name");
        int i10 = 0;
        int iL = c0.l(0, this.parameterNamesAndValues.length - 1, 2);
        if (iL < 0) {
            return null;
        }
        while (true) {
            int i11 = i10 + 2;
            if (q.i(this.parameterNamesAndValues[i10], str, true)) {
                return this.parameterNamesAndValues[i10 + 1];
            }
            if (i10 == iL) {
                return null;
            }
            i10 = i11;
        }
    }

    public final String subtype() {
        return this.subtype;
    }

    public String toString() {
        return this.mediaType;
    }

    public final String type() {
        return this.type;
    }
}
