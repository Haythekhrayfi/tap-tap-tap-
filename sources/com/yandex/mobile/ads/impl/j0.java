package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.Window;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class j0 implements m0 {
    @Override // com.yandex.mobile.ads.impl.m0
    public final l0 a(Context context, RelativeLayout relativeLayout, a1 a1Var, q0 q0Var, Intent intent, Window window) {
        String stringExtra = intent.getStringExtra("extra_browser_url");
        if (!TextUtils.isEmpty(stringExtra)) {
            try {
                return new i0(context, relativeLayout, a1Var, window, stringExtra);
            } catch (xi1 unused) {
            }
        }
        return null;
    }
}
