package com.yandex.mobile.ads.impl;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
final class qi implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kw f24511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final tw f24512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final um f24513c;

    public qi(kw kwVar, tw twVar, um umVar) {
        this.f24511a = kwVar;
        this.f24512b = twVar;
        this.f24513c = umVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f24512b.a();
        this.f24511a.c();
        this.f24513c.a(tm.f25398b);
    }
}
