package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.location.Location;

/* JADX INFO: loaded from: classes3.dex */
final class wx implements j90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f26396a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o90 f26397b;

    public wx(Context context, String str) {
        this.f26397b = new o90(context, str);
    }

    @Override // com.yandex.mobile.ads.impl.j90
    public final Location a() {
        Location locationA;
        synchronized (this.f26396a) {
            n90 n90VarA = this.f26397b.a();
            if (n90VarA == null || !n90VarA.b()) {
                locationA = null;
            } else {
                locationA = n90VarA.a();
                this.f26397b.b();
            }
        }
        return locationA;
    }
}
