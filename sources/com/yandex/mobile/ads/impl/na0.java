package com.yandex.mobile.ads.impl;

import java.util.Locale;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class na0 {
    public static String a() {
        String string = UUID.randomUUID().toString();
        fd.j0.h(string, "randomUUID().toString()");
        String lowerCase = ed.q.q(string, "-", "", false, 4).toLowerCase(Locale.ROOT);
        fd.j0.h(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }
}
