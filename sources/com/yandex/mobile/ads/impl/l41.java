package com.yandex.mobile.ads.impl;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class l41<T extends View> implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k9<T> f22618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final T f22619c;

    /* JADX WARN: Multi-variable type inference failed */
    public l41(View view, uj ujVar) {
        this.f22619c = view;
        this.f22618b = ujVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f22618b.a(this.f22619c);
    }
}
