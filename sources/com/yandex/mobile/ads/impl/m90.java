package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class m90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f22945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f22946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final iv0 f22947c = new iv0();

    public m90(Context context, String str) {
        this.f22945a = context.getApplicationContext();
        this.f22946b = str;
    }

    public final xx a() {
        Class<?> cls;
        iv0 iv0Var = this.f22947c;
        String str = this.f22946b;
        Objects.requireNonNull(iv0Var);
        try {
            cls = Class.forName(str);
        } catch (Throwable th) {
            x60.a(th, "Cannot found class for name %s", str);
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        iv0 iv0Var2 = this.f22947c;
        Object[] objArr = {this.f22945a};
        Objects.requireNonNull(iv0Var2);
        Object objA = iv0.a((Class) cls, "getFusedLocationProviderClient", objArr);
        if (objA != null) {
            return new xx(objA);
        }
        return null;
    }
}
