package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class qh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lj1 f24509a = new lj1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i01 f24510b = i01.b();

    public final Rect a(View view) {
        Rect rect = new Rect();
        Context context = view.getContext();
        if (view.getGlobalVisibleRect(rect)) {
            nz0 nz0VarA = this.f24510b.a(context);
            if (!(nz0VarA != null && nz0VarA.U())) {
                return rect;
            }
            Objects.requireNonNull(this.f24509a);
            Rect rectA = lj1.a(view);
            Rect rect2 = new Rect(rect);
            if (rect2.intersect(rectA)) {
                return rect2;
            }
        }
        return null;
    }
}
