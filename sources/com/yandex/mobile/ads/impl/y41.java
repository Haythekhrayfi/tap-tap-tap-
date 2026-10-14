package com.yandex.mobile.ads.impl;

import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes3.dex */
public final class y41 extends mw0<String> {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Object f26694p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private gx0.b<String> f26695q;

    public y41(String str, gx0.b bVar, gx0.a aVar) {
        super(0, str, aVar);
        this.f26694p = new Object();
        this.f26695q = bVar;
    }

    @Override // com.yandex.mobile.ads.impl.mw0
    public final gx0<String> a(wm0 wm0Var) {
        String str;
        try {
            str = new String(wm0Var.f26320b, u00.a(wm0Var.f26321c));
        } catch (UnsupportedEncodingException unused) {
            str = new String(wm0Var.f26320b);
        }
        return gx0.a(str, u00.a(wm0Var));
    }

    @Override // com.yandex.mobile.ads.impl.mw0
    public final void a() {
        super.a();
        synchronized (this.f26694p) {
            this.f26695q = null;
        }
    }

    @Override // com.yandex.mobile.ads.impl.mw0
    public final void a(String str) {
        gx0.b<String> bVar;
        String str2 = str;
        synchronized (this.f26694p) {
            bVar = this.f26695q;
        }
        if (bVar != null) {
            bVar.a(str2);
        }
    }
}
