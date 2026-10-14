package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class y {
    public static Context a(View view) {
        fd.j0.i(view, "view");
        while (view != null) {
            Context context = view.getContext();
            if (context instanceof Activity) {
                return context;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }
}
