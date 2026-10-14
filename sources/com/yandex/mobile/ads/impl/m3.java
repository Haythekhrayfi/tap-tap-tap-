package com.yandex.mobile.ads.impl;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class m3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l3 f22893a = l3.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k3 f22894b;

    public m3(k3 k3Var) {
        this.f22894b = k3Var;
    }

    public final void a() {
        String strA = this.f22894b.a();
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        this.f22893a.a(strA);
    }

    public final void b() {
        String strA = this.f22894b.a();
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        this.f22893a.b(strA);
    }
}
