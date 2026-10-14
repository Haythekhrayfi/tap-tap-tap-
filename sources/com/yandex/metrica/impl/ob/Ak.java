package com.yandex.metrica.impl.ob;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Ak {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<C2013uk> f13663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Vj f13664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f13665c;

    public Ak(InterfaceC2143zk<Vj> interfaceC2143zk, InterfaceC2143zk<List<C2013uk>> interfaceC2143zk2, InterfaceC2143zk<Integer> interfaceC2143zk3) {
        this.f13664b = (Vj) ((Xj) interfaceC2143zk).b();
        this.f13663a = (List) ((C2043vk) interfaceC2143zk2).b();
        this.f13665c = ((Integer) ((Sj) interfaceC2143zk3).a()).intValue();
    }

    public int a() {
        return this.f13665c;
    }

    public Vj b() {
        return this.f13664b;
    }

    public List<C2013uk> c() {
        return this.f13663a;
    }
}
