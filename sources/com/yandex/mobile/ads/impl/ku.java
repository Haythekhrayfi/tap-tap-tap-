package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
final class ku implements n<ju> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final tu f22503a;

    public ku(tu tuVar) {
        this.f22503a = tuVar;
    }

    @Override // com.yandex.mobile.ads.impl.n
    public final void a(View view, m mVar) {
        Context context = view.getContext();
        this.f22503a.a(context, (ju) mVar);
    }
}
