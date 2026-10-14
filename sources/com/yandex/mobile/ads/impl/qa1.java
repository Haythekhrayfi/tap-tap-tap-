package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import com.google.android.gms.ads.AdError;

/* JADX INFO: loaded from: classes3.dex */
public final class qa1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z4 f24383a;

    public qa1(ab1 ab1Var) {
        this.f24383a = new z4(ab1Var.a());
    }

    public final String a() {
        String strC = this.f24383a.c();
        return TextUtils.isEmpty(strC) ? AdError.UNDEFINED_DOMAIN : strC;
    }

    public final String b() {
        String strD = this.f24383a.d();
        return TextUtils.isEmpty(strD) ? AdError.UNDEFINED_DOMAIN : strD;
    }
}
