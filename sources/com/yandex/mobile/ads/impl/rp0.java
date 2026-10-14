package com.yandex.mobile.ads.impl;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class rp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24817a = "Yandex";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f24818b;

    private rp0(String str) {
        this.f24818b = str;
    }

    public static rp0 a(String str) {
        if (TextUtils.isEmpty("Yandex")) {
            throw new IllegalArgumentException("Name is null or empty");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Version is null or empty");
        }
        return new rp0(str);
    }

    public final String a() {
        return this.f24817a;
    }

    public final String b() {
        return this.f24818b;
    }
}
