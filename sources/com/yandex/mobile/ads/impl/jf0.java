package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.BuildConfigFieldProvider;

/* JADX INFO: loaded from: classes3.dex */
public final class jf0 {
    public static vb1 a() {
        int i10;
        int i11;
        int i12 = 0;
        Object[] array = ed.u.R(BuildConfigFieldProvider.getVersion(), new String[]{"."}, false, 0, 6).toArray(new String[0]);
        fd.j0.g(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        String[] strArr = (String[]) array;
        if (strArr.length > 0) {
            String str = strArr[0];
            int i13 = t6.f25286b;
            try {
                i10 = Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                i10 = 0;
            }
        } else {
            i10 = 0;
        }
        if (strArr.length > 1) {
            String str2 = strArr[1];
            int i14 = t6.f25286b;
            try {
                i11 = Integer.parseInt(str2);
            } catch (NumberFormatException unused2) {
                i11 = 0;
            }
        } else {
            i11 = 0;
        }
        if (strArr.length > 2) {
            String str3 = strArr[2];
            int i15 = t6.f25286b;
            try {
                i12 = Integer.parseInt(str3);
            } catch (NumberFormatException unused3) {
            }
        }
        return new vb1(i10, i11, i12);
    }
}
