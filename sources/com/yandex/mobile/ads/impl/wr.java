package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class wr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f26346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<fu0> f26347b = Collections.emptyList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, String> f26348c = Collections.emptyMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f26349d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f26350e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f26351f;

    public final String a() {
        return this.f26351f;
    }

    public final void a(String str) {
        this.f26351f = str;
    }

    public final String b() {
        return this.f26346a;
    }

    public final void b(String str) {
        this.f26346a = str;
    }

    public final Map<String, String> c() {
        return this.f26348c;
    }

    public final void c(String str) {
        this.f26350e = str;
    }

    public final String d() {
        return this.f26350e;
    }

    public final synchronized void d(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f26349d = str;
        }
    }

    public final List<fu0> e() {
        return this.f26347b;
    }

    public final synchronized String f() {
        return this.f26349d;
    }
}
