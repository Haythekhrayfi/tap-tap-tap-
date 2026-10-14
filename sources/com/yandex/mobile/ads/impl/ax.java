package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.webkit.WebSettings;
import com.yandex.mobile.ads.base.AdResponse;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ViewConstructor"})
public final class ax extends uz {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final yi1 f19070n;

    public ax(Context context, AdResponse adResponse, k2 k2Var) throws Throwable {
        super(context, adResponse, k2Var);
        this.f19070n = new yi1(this);
    }

    @Override // com.yandex.mobile.ads.impl.kp0
    public final void b(Context context) {
        super.b(context);
        WebSettings settings = getSettings();
        settings.setDatabasePath(getContext().getDatabasePath("com.yandex.mobile.ads.db").getAbsolutePath());
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setCacheMode(-1);
    }

    @Override // com.yandex.mobile.ads.impl.uz
    @SuppressLint({"AddJavascriptInterface"})
    public final void c(Context context) {
        addJavascriptInterface(new uz.a(context), "AdPerformActionsJSI");
    }

    @Override // com.yandex.mobile.ads.impl.kp0
    public final void h() {
        this.f19070n.a(i());
    }
}
