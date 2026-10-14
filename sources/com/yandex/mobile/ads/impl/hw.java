package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public abstract class hw {
    public hw(Context context) {
        if (!(context instanceof Activity)) {
            o60.c("Please use Activity context for mediation ads. Several mediation adapters will not work without activity context.", new Object[0]);
        }
        ff0.b().a(context);
    }
}
