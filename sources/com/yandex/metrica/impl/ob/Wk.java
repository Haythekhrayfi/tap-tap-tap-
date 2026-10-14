package com.yandex.metrica.impl.ob;

import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
class Wk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Xm<Xk, Pair<Boolean, Wl.b>> f15403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f15404b;

    public Wk(int i10, int i11) {
        this.f15403a = new Yk(i10);
        this.f15404b = i11;
    }

    public Pair<Boolean, Wl.b> a(int i10, String str) {
        if (str.length() > this.f15404b) {
            return null;
        }
        return this.f15403a.a(new Xk(i10, str));
    }

    public void a() {
        this.f15403a.a();
    }

    public void a(int i10, String str, boolean z10, Wl.b bVar) {
        if (str.length() <= this.f15404b) {
            this.f15403a.a(new Xk(i10, str), new Pair<>(Boolean.valueOf(z10), bVar));
        }
    }
}
