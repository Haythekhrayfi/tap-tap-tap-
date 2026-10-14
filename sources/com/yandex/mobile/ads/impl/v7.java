package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ViewConstructor"})
public final class v7 extends kp0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final w7 f25878k;

    public v7(Context context) throws Throwable {
        this(context, new ga0());
    }

    public v7(Context context, ga0 ga0Var) {
        super(context);
        w7 w7Var = new w7();
        this.f25878k = w7Var;
        if (ga0Var.a()) {
            setLayerType(2, null);
        }
        setVisibility(0);
        setHtmlWebViewErrorListener(w7Var);
    }

    @Override // com.yandex.mobile.ads.impl.kp0, com.yandex.mobile.ads.impl.zz
    public final void a(Context context, String str) {
        this.f25878k.a(str);
    }

    @Override // com.yandex.mobile.ads.impl.kp0
    public final void h() {
    }

    public void setAdtuneWebViewListener(y7 y7Var) {
        this.f25878k.a(y7Var);
    }
}
