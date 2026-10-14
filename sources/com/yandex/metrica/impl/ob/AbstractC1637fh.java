package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C1587dh;
import com.yandex.metrica.impl.ob.C1587dh.d;
import com.yandex.metrica.impl.ob.InterfaceC1562ch;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.fh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1637fh<T extends C1587dh, IA, A extends InterfaceC1562ch<IA, A>, L extends C1587dh.d<T, C1587dh.c<A>>> implements C1870p1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private T f16140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private L f16141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C1587dh.c<A> f16142c;

    public AbstractC1637fh(L l10, Qi qi, A a10) {
        this.f16141b = l10;
        C1870p1.a(P0.i().f()).a(this);
        a((C1587dh.c) new C1587dh.c<>(qi, a10));
    }

    @Override // com.yandex.metrica.impl.ob.C1870p1.a
    public void a() {
        synchronized (this) {
            this.f16140a = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0013  */
    public synchronized void a(Qi qi) {
        synchronized (this) {
        }
        synchronized (this) {
            this.f16140a = null;
        }
        C1587dh.c<A> cVar = new C1587dh.c<>(qi, this.f16142c.f15974b);
        synchronized (this) {
            this.f16142c = cVar;
            synchronized (this) {
                this.f16140a = null;
            }
        }
    }

    public synchronized void a(C1587dh.c<A> cVar) {
        this.f16142c = cVar;
    }

    public synchronized void a(IA ia2) {
        if (!this.f16142c.f15974b.b(ia2)) {
            synchronized (this) {
                C1587dh.c<A> cVar = this.f16142c;
                C1587dh.c<A> cVar2 = new C1587dh.c<>(cVar.f15973a, cVar.f15974b.a(ia2));
                synchronized (this) {
                    this.f16142c = cVar2;
                }
            }
            synchronized (this) {
                this.f16140a = null;
            }
        }
    }

    public synchronized T b() {
        if (this.f16140a == null) {
            this.f16140a = (T) this.f16141b.a(this.f16142c);
        }
        return this.f16140a;
    }

    public synchronized A c() {
        return this.f16142c.f15974b;
    }

    public synchronized Qi d() {
        return this.f16142c.f15973a;
    }

    public synchronized void e() {
        this.f16140a = null;
    }
}
