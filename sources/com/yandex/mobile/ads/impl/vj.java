package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes3.dex */
public final class vj<V extends ViewGroup> implements yo<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final yo<V>[] f25990a;

    @SafeVarargs
    public vj(yo<V>... yoVarArr) {
        this.f25990a = yoVarArr;
    }

    @Override // com.yandex.mobile.ads.impl.yo
    public final void a(V v10) {
        for (yo<V> yoVar : this.f25990a) {
            yoVar.a(v10);
        }
    }

    @Override // com.yandex.mobile.ads.impl.yo
    public final void c() {
        for (yo<V> yoVar : this.f25990a) {
            yoVar.c();
        }
    }
}
