package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.Fn;

/* JADX INFO: loaded from: classes.dex */
public abstract class Rn<V, M extends Fn> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f14981a;

    public Rn(int i10) {
        this.f14981a = i10;
    }

    public int a() {
        return this.f14981a;
    }

    public abstract Qn<V, M> a(V v10);
}
