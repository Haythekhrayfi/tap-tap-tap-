package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class y11 {
    public static int a(Context context, int i10, float f10) {
        return Math.round(TypedValue.applyDimension(i10, f10, context.getResources().getDisplayMetrics()));
    }
}
