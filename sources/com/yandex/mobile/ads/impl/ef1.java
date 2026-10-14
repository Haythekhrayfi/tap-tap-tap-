package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ProgressBar;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ViewConstructor"})
public final class ef1 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ProgressBar f20238a;

    public ef1(Context context, ProgressBar progressBar) {
        super(context);
        this.f20238a = progressBar;
    }

    public final ProgressBar a() {
        return this.f20238a;
    }
}
