package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class i40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v50 f21589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h40 f21590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private g40 f21591c;

    public i40(v50 v50Var, com.yandex.mobile.ads.instream.e eVar) {
        this.f21589a = v50Var;
        this.f21590b = new h40(eVar);
    }

    public final g40 a() {
        if (this.f21591c == null) {
            this.f21591c = this.f21590b.a(this.f21589a.getAdBreaks());
        }
        return this.f21591c;
    }
}
