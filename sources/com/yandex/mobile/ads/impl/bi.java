package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class bi {
    public static int a(String str) {
        fd.j0.i(str, "value");
        for (int i10 : ci._values()) {
            if (fd.j0.d(ci.a(i10), str)) {
                return i10;
            }
        }
        return 0;
    }
}
