package com.yandex.mobile.ads.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class ke1 {
    public static Long a(String str) {
        if (str != null) {
            try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss", Locale.US);
                return Long.valueOf(simpleDateFormat.parse(str).getTime() - simpleDateFormat.parse("00:00:00").getTime());
            } catch (ParseException e10) {
                x60.a(e10, e10.toString(), new Object[0]);
            }
        }
        return null;
    }

    public static void a(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException(fn1.a("AdBreak", " not set!"));
        }
    }
}
