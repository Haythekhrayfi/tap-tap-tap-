package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public final class xg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f26512a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final uj f26513b;

    public xg(Context context) {
        this.f26513b = zg.a(context);
    }

    public final void a() {
        this.f26512a.removeCallbacksAndMessages(null);
        this.f26513b.cancel();
    }

    public final void a(TextView textView) {
        this.f26512a.postDelayed(new l41(textView, this.f26513b), 2000L);
    }
}
