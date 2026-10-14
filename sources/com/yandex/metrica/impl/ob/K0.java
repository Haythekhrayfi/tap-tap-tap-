package com.yandex.metrica.impl.ob;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class K0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final N2 f14333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final N f14334b;

    public K0(Context context) {
        this(new N2(context, "com.yandex.android.appmetrica.build_id"), new N(context, "com.yandex.android.appmetrica.is_offline"));
    }

    public K0(N2 n10, N n11) {
        this.f14333a = n10;
        this.f14334b = n11;
    }

    public String a() {
        return this.f14333a.a();
    }

    public Boolean b() {
        return this.f14334b.a();
    }
}
