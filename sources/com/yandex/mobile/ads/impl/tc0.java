package com.yandex.mobile.ads.impl;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class tc0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f25337b = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f25338c = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f25339d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f25340a;

    public static final class a {
        public static tc0 a(String str) {
            fd.j0.i(str, "<this>");
            Matcher matcher = tc0.f25337b.matcher(str);
            if (!matcher.lookingAt()) {
                throw new IllegalArgumentException(l8.a1.a("No subtype found for: \"", str, CoreConstants.DOUBLE_QUOTE_CHAR).toString());
            }
            String strGroup = matcher.group(1);
            fd.j0.h(strGroup, "typeSubtype.group(1)");
            Locale locale = Locale.US;
            fd.j0.h(locale, "US");
            fd.j0.h(strGroup.toLowerCase(locale), "this as java.lang.String).toLowerCase(locale)");
            String strGroup2 = matcher.group(2);
            fd.j0.h(strGroup2, "typeSubtype.group(2)");
            fd.j0.h(strGroup2.toLowerCase(locale), "this as java.lang.String).toLowerCase(locale)");
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = tc0.f25338c.matcher(str);
            for (int iEnd = matcher.end(); iEnd < str.length(); iEnd = matcher2.end()) {
                matcher2.region(iEnd, str.length());
                if (!matcher2.lookingAt()) {
                    StringBuilder sbA = v60.a("Parameter is not formatted correctly: \"");
                    String strSubstring = str.substring(iEnd);
                    fd.j0.h(strSubstring, "this as java.lang.String).substring(startIndex)");
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
                    } else if (ed.q.u(strGroup4, "'", false, 2) && ed.q.h(strGroup4, "'", false, 2) && strGroup4.length() > 2) {
                        strGroup4 = strGroup4.substring(1, strGroup4.length() - 1);
                        fd.j0.h(strGroup4, "this as java.lang.String…ing(startIndex, endIndex)");
                    }
                    arrayList.add(strGroup3);
                    arrayList.add(strGroup4);
                }
            }
            Object[] array = arrayList.toArray(new String[0]);
            fd.j0.g(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            return new tc0(str, (String[]) array);
        }

        public static tc0 b(String str) {
            fd.j0.i(str, "<this>");
            try {
                return a(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    private tc0(String str) {
        this.f25340a = str;
    }

    public /* synthetic */ tc0(String str, String[] strArr) {
        this(str);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof tc0) && fd.j0.d(((tc0) obj).f25340a, this.f25340a);
    }

    public final int hashCode() {
        return this.f25340a.hashCode();
    }

    public final String toString() {
        return this.f25340a;
    }
}
