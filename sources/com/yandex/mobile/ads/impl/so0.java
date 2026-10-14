package com.yandex.mobile.ads.impl;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class so0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i01 f25146a = i01.b();

    private boolean a(Context context) {
        nz0 nz0VarA = this.f25146a.a(context);
        if (nz0VarA != null) {
            return nz0VarA.S();
        }
        return true;
    }

    public final boolean b(Context context) {
        return t6.a(context) && !a(context);
    }
}
