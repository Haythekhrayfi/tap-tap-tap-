package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.tracker.interaction.model.FalseClick;

/* JADX INFO: loaded from: classes3.dex */
final class eu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k6 f20321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FalseClick f20322b;

    public eu(Context context, k2 k2Var, FalseClick falseClick) {
        this.f20321a = new k6(context, k2Var);
        this.f20322b = falseClick;
    }

    public final void a(long j10) {
        if (j10 <= this.f20322b.c()) {
            this.f20321a.a(this.f20322b.d());
        }
    }
}
