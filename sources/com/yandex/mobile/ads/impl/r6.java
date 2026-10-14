package com.yandex.mobile.ads.impl;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class r6 implements rg1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.yandex.mobile.ads.nativeads.w f24607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.yandex.mobile.ads.nativeads.b f24608b;

    public r6(com.yandex.mobile.ads.nativeads.w wVar, com.yandex.mobile.ads.nativeads.b bVar) {
        this.f24607a = wVar;
        this.f24608b = bVar;
    }

    @Override // com.yandex.mobile.ads.impl.rg1
    public final void a(View view, qa qaVar) {
    }

    @Override // com.yandex.mobile.ads.impl.rg1
    public final void a(qa qaVar, ei eiVar) {
        this.f24608b.a(qaVar, qaVar.a(), this.f24607a, eiVar);
    }
}
