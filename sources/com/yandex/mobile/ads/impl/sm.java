package com.yandex.mobile.ads.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class sm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f25135a = new a();

    public static final class a extends ThreadLocal<DateFormat> {
        @Override // java.lang.ThreadLocal
        public final DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(ea1.f20134d);
            return simpleDateFormat;
        }
    }

    public static final String a(Date date) {
        fd.j0.i(date, "<this>");
        String str = f25135a.get().format(date);
        fd.j0.h(str, "STANDARD_DATE_FORMAT.get().format(this)");
        return str;
    }
}
