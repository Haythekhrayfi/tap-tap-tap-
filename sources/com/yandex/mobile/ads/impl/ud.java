package com.yandex.mobile.ads.impl;

import android.util.Base64;

/* JADX INFO: loaded from: classes3.dex */
public final class ud {
    public static String a(String str) {
        try {
            return Base64.encodeToString(str.getBytes(), 2);
        } catch (Throwable th) {
            x60.a(th, th.getMessage(), new Object[0]);
            return null;
        }
    }
}
