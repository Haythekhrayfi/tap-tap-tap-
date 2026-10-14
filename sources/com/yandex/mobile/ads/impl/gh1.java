package com.yandex.mobile.ads.impl;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class gh1 {

    public interface a {
        boolean b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean a(View view) {
        return ((a) view).b() && view.hasWindowFocus() && !eh1.d(view);
    }
}
