package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
enum i5 {
    f21597a,
    f21598b,
    f21599c;


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final HashMap f21600d;

    static {
        i5 i5Var = f21597a;
        i5 i5Var2 = f21598b;
        i5 i5Var3 = f21599c;
        HashMap map = new HashMap();
        f21600d = map;
        map.put(a("values_dimen_%s", i5Var.name()), 48);
        map.put(a("values_dimen_%s_sw600dp", i5Var.name()), 56);
        map.put(a("values_dimen_%s", i5Var2.name()), 15);
        map.put(a("values_dimen_%s_sw600dp", i5Var2.name()), 17);
        map.put(a("values_dimen_%s", i5Var3.name()), 19);
        map.put(a("values_dimen_%s_sw600dp", i5Var3.name()), 23);
    }

    i5() {
    }

    public static String a(String str, String str2) {
        return String.format(Locale.US, str, str2);
    }

    public final int a(Context context) {
        try {
            StringBuilder sb2 = new StringBuilder(name());
            if (Math.min(eh1.c(context), eh1.b(context)) >= 600) {
                sb2.append("_");
                sb2.append("sw600dp");
            }
            Integer num = (Integer) f21600d.get(a("values_dimen_%s", sb2.toString()));
            if (num != null) {
                return num.intValue();
            }
        } catch (Exception unused) {
        }
        try {
            Integer num2 = (Integer) f21600d.get(a("values_dimen_%s", name()));
            if (num2 != null) {
                return num2.intValue();
            }
            return 0;
        } catch (Exception unused2) {
            return 0;
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        return name();
    }
}
