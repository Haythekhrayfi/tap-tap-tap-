package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.Button;

/* JADX INFO: loaded from: classes3.dex */
final class aw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final cw0 f19069a = new cw0();

    public final yv0 a(Context context) {
        Button buttonA = this.f19069a.a(context);
        buttonA.setVisibility(8);
        yv0 yv0Var = new yv0(context, buttonA);
        yv0Var.addView(buttonA);
        return yv0Var;
    }
}
