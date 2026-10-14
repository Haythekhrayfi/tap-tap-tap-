package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.InterfaceC1723j4;

/* JADX INFO: loaded from: classes.dex */
public class Q2<C extends InterfaceC1723j4> implements F2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C f14733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f14734b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14735c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Zi f14736d;

    public Q2(C c10, Zi zi) {
        this.f14733a = c10;
        this.f14736d = zi;
    }

    @Override // com.yandex.metrica.impl.ob.F2
    public void a() {
        synchronized (this.f14734b) {
            if (this.f14735c) {
                this.f14735c = false;
            }
        }
    }

    @Override // com.yandex.metrica.impl.ob.F2
    public void b() {
        synchronized (this.f14734b) {
            if (!this.f14735c) {
                c();
                this.f14735c = true;
            }
        }
    }

    public void c() {
    }

    public void d() {
        synchronized (this.f14734b) {
            if (!this.f14735c) {
                synchronized (this.f14734b) {
                    if (!this.f14735c) {
                        f();
                    }
                }
                c();
            }
        }
    }

    public C e() {
        return this.f14733a;
    }

    public void f() {
        this.f14736d.a();
    }
}
