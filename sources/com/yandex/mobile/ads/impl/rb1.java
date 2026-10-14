package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import java.net.URL;

/* JADX INFO: loaded from: classes3.dex */
public final class rb1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final URL f24659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f24660c;

    private rb1(String str, URL url, String str2) {
        this.f24658a = str;
        this.f24659b = url;
        this.f24660c = str2;
    }

    public static rb1 a(String str, URL url, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("VendorKey is null or empty");
        }
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("VerificationParameters is null or empty");
        }
        return new rb1(str, url, str2);
    }

    public static rb1 a(URL url) {
        return new rb1(null, url, null);
    }

    public final URL a() {
        return this.f24659b;
    }

    public final String b() {
        return this.f24658a;
    }

    public final String c() {
        return this.f24660c;
    }
}
