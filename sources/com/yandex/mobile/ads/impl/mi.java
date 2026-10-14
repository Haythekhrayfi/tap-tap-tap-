package com.yandex.mobile.ads.impl;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
final class mi implements n<m> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final jw0 f23082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.yandex.mobile.ads.nativeads.k f23083b;

    public mi(jw0 jw0Var, com.yandex.mobile.ads.nativeads.k kVar) {
        this.f23082a = jw0Var;
        this.f23083b = kVar;
    }

    @Override // com.yandex.mobile.ads.impl.n
    public final void a(View view, m mVar) {
        this.f23083b.a();
        ((gi) this.f23082a).a(fw0.b.B);
    }
}
