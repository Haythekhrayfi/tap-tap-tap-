package com.yandex.metrica.impl.ob;

import android.util.Pair;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.bl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1541bl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Jk f15843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Wk f15844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f15845c;

    public C1541bl(Zk<?> zk, int i10) {
        this(zk, i10, new Jk(zk.b()));
    }

    public C1541bl(Zk<?> zk, int i10, Jk jk) {
        this.f15845c = i10;
        this.f15843a = jk;
        this.f15844b = zk.a();
    }

    public Wl.b a(String str) {
        if (str == null) {
            return null;
        }
        Pair<Boolean, Wl.b> pairA = this.f15844b.a(this.f15845c, str);
        if (pairA != null) {
            return (Wl.b) pairA.second;
        }
        Wl.b bVarA = this.f15843a.a(str);
        this.f15844b.a(this.f15845c, str, bVarA != null, bVarA);
        return bVarA;
    }
}
