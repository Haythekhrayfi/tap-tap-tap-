package com.yandex.metrica.impl.ob;

import android.app.Activity;
import android.os.Bundle;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.xl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C2094xl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1915ql f17858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Bl f17859b;

    public C2094xl(InterfaceC1915ql interfaceC1915ql, Bl bl) {
        this.f17858a = interfaceC1915ql;
        this.f17859b = bl;
    }

    public boolean a(Activity activity, C1542bm c1542bm) {
        Bundle bundleA = this.f17858a.a(activity);
        return this.f17859b.a(bundleA == null ? null : bundleA.getString("yandex:ads:context"), c1542bm);
    }
}
