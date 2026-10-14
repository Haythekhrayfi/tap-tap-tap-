package com.yandex.mobile.ads.impl;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class wj implements zo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zo[] f26293a;

    public wj(zo... zoVarArr) {
        this.f26293a = zoVarArr;
    }

    @Override // com.yandex.mobile.ads.impl.zo
    public final boolean a(Context context) {
        for (zo zoVar : this.f26293a) {
            if (!zoVar.a(context)) {
                return false;
            }
        }
        return true;
    }
}
