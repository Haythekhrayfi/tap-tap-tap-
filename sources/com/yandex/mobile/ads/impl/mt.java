package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class mt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final gh1 f23137a = new gh1();

    public final <T extends View & gh1.a> lt a(T t10) {
        int iA;
        Objects.requireNonNull(this.f23137a);
        RectF rectF = null;
        if (gh1.a(t10)) {
            iA = eh1.a(t10);
            Rect rect = new Rect();
            if (t10.getLocalVisibleRect(rect)) {
                rect.offset(t10.getLeft(), t10.getTop());
            } else {
                rect = null;
            }
            Context context = t10.getContext();
            if (rect != null) {
                int iRound = Math.round(rect.left / context.getResources().getDisplayMetrics().density);
                int iRound2 = Math.round(rect.top / context.getResources().getDisplayMetrics().density);
                int iRound3 = Math.round(rect.right / context.getResources().getDisplayMetrics().density);
                int iRound4 = Math.round(rect.bottom / context.getResources().getDisplayMetrics().density);
                int i10 = iRound4 - iRound2;
                if (iRound3 - iRound > 0 && i10 > 0) {
                    rectF = new RectF(iRound, iRound2, iRound3, iRound4);
                }
            }
        } else {
            iA = 0;
        }
        return new lt(iA, rectF);
    }
}
