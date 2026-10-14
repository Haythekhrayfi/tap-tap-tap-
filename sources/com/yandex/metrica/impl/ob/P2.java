package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
public abstract class P2<T> extends Q0<T> {
    public P2(long j10, long j11) {
        super(j10, j11);
    }

    @Override // com.yandex.metrica.impl.ob.Q0
    public synchronized T a() {
        return (T) super.a();
    }

    @Override // com.yandex.metrica.impl.ob.Q0
    public synchronized void b(T t10) {
        super.b(t10);
    }

    @Override // com.yandex.metrica.impl.ob.Q0
    public synchronized boolean b() {
        return this.f14731a.b() || this.f14731a.d();
    }
}
