package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
public final class gj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ei1 f21083a = vm0.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final jk0 f21084b;

    public gj0(Context context) {
        this.f21084b = new jk0(context);
    }

    public final cj0 a(String str) {
        cj0 cj0VarA = null;
        try {
            cj0VarA = this.f21084b.a(str);
            cj0VarA.a();
            return cj0VarA;
        } catch (zi0 | JSONException unused) {
            x60.c("Can't parse native ad response", new Object[0]);
            return cj0VarA;
        }
    }

    public final Object a(wm0 wm0Var) {
        String strA = this.f21083a.a(wm0Var);
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        return a(strA);
    }
}
