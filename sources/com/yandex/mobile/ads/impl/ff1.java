package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.ProgressBar;

/* JADX INFO: loaded from: classes3.dex */
public final class ff1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vs0 f20688a = new vs0();

    public final ef1 a(Context context) {
        ProgressBar progressBarA = this.f20688a.a(context);
        progressBarA.setVisibility(8);
        ef1 ef1Var = new ef1(context, progressBarA);
        ef1Var.addView(progressBarA);
        ef1Var.setBackgroundColor(-16777216);
        return ef1Var;
    }
}
