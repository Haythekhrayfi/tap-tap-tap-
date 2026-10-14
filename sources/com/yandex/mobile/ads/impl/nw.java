package com.yandex.mobile.ads.impl;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class nw implements b81, x91 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final al f23560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, String> f23561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f23562c;

    public nw(al alVar) {
        this.f23560a = alVar;
    }

    public final mw a() {
        return new mw(this.f23562c, this.f23561b);
    }

    @Override // com.yandex.mobile.ads.impl.b81
    public final void a(Map<String, String> map) {
        this.f23561b = map;
    }

    @Override // com.yandex.mobile.ads.impl.x91
    public final void a(boolean z10) {
        this.f23562c = z10;
        this.f23560a.a(z10);
    }
}
