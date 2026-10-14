package com.yandex.mobile.ads.impl;

import android.view.View;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ou implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k7 f23913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s7 f23914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final eg1 f23915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final we1 f23916d;

    public ou(k7 k7Var, s7 s7Var, eg1 eg1Var, we1 we1Var) {
        fd.j0.i(k7Var, "action");
        fd.j0.i(s7Var, "adtuneRenderer");
        fd.j0.i(eg1Var, "videoTracker");
        fd.j0.i(we1Var, "videoEventUrlsTracker");
        this.f23913a = k7Var;
        this.f23914b = s7Var;
        this.f23915c = eg1Var;
        this.f23916d = we1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        fd.j0.i(view, "adtune");
        this.f23915c.a("feedback");
        we1 we1Var = this.f23916d;
        List<String> listC = this.f23913a.c();
        fd.j0.h(listC, "action.trackingUrls");
        we1Var.a((List<String>) listC, (Map<String, String>) null);
        this.f23914b.a(view, this.f23913a);
    }
}
