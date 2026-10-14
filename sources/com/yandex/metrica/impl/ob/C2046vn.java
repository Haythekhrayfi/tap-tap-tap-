package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.vn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2046vn extends Thread implements InterfaceC1991tn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile boolean f17739a;

    public C2046vn() {
        this.f17739a = true;
    }

    public C2046vn(Runnable runnable, String str) {
        super(runnable, str);
        this.f17739a = true;
    }

    public C2046vn(String str) {
        super(str);
        this.f17739a = true;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1991tn
    public synchronized boolean c() {
        return this.f17739a;
    }

    public synchronized void d() {
        this.f17739a = false;
        interrupt();
    }
}
