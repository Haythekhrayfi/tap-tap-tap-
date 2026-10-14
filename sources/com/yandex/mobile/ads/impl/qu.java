package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class qu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f24568a;

    public qu(Context context) {
        this.f24568a = context;
    }

    public final FrameLayout a() {
        FrameLayout frameLayout = new FrameLayout(this.f24568a);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        return frameLayout;
    }
}
