package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.Button;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ViewConstructor"})
public final class yv0 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Button f27156a;

    public yv0(Context context, Button button) {
        super(context);
        this.f27156a = button;
    }

    public final Button a() {
        return this.f27156a;
    }
}
