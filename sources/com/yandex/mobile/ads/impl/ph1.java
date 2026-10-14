package com.yandex.mobile.ads.impl;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class ph1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fp0 f24063a = new fp0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qh1 f24064b = new qh1();

    public final int a(View view) {
        boolean zD = eh1.d(view);
        Rect rectA = this.f24064b.a(view);
        if (zD || rectA == null) {
            return 0;
        }
        return (rectA.width() * rectA.height()) - this.f24063a.a(view, rectA);
    }
}
