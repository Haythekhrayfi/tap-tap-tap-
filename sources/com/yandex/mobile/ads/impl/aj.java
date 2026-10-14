package com.yandex.mobile.ads.impl;

import android.app.Dialog;

/* JADX INFO: loaded from: classes3.dex */
public final class aj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Dialog f18941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final uk f18942b;

    public aj(Dialog dialog, uk ukVar) {
        this.f18941a = dialog;
        this.f18942b = ukVar;
    }

    public final void a() {
        this.f18941a.dismiss();
        this.f18942b.e();
    }

    public final void b() {
        this.f18941a.dismiss();
    }
}
