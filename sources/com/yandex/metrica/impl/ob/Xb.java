package com.yandex.metrica.impl.ob;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public class Xb implements Tb, Ub {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1972t4 f15482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AtomicLong f15483b;

    public Xb(C1976t8 c1976t8, C1972t4 c1972t4) {
        this.f15482a = c1972t4;
        this.f15483b = new AtomicLong(c1976t8.c());
        c1976t8.a(this);
    }

    @Override // com.yandex.metrica.impl.ob.Ub
    public void a(List<Integer> list) {
        this.f15483b.addAndGet(list.size());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.metrica.impl.ob.Tb
    public boolean a() {
        return this.f15483b.get() >= ((long) ((C1736jh) this.f15482a.b()).J());
    }

    @Override // com.yandex.metrica.impl.ob.Ub
    public void b(List<Integer> list) {
        this.f15483b.addAndGet(-list.size());
    }
}
