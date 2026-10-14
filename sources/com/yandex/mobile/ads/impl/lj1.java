package com.yandex.mobile.ads.impl;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
final class lj1 {
    public static Rect a(View view) {
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        int[] iArr = {i, i};
        view.getRootView().getLocationOnScreen(iArr);
        int i10 = -iArr[0];
        int i11 = -iArr[1];
        rect.offset(i10, i11);
        return rect;
    }
}
