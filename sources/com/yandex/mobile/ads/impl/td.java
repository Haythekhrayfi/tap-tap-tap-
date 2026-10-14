package com.yandex.mobile.ads.impl;

import android.util.Base64;

/* JADX INFO: loaded from: classes3.dex */
public final class td {
    public static String a(String str) {
        try {
            return new String(Base64.decode(str.getBytes(), 0), "UTF-8");
        } catch (Exception e10) {
            x60.a(e10, e10.getMessage(), new Object[0]);
            return null;
        }
    }

    public static String a(byte[] bArr) {
        try {
            return new String(Base64.decode(bArr, 0), "UTF-8");
        } catch (Exception e10) {
            String str = new String(bArr);
            x60.a(e10, e10.getMessage(), new Object[0]);
            return str;
        }
    }
}
