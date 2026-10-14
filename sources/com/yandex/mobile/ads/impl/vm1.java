package com.yandex.mobile.ads.impl;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class vm1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f26029a;

    public final void a(Context context) {
        in1.a(context, "Application Context cannot be null");
        if (this.f26029a) {
            return;
        }
        this.f26029a = true;
        nn1.a().a(context);
        pm1.a().a(context);
        rm1.a(context);
        bn1.a().a(context);
    }

    public final boolean a() {
        return this.f26029a;
    }
}
