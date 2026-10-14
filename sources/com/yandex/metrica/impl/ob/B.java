package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
class B implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Y1 f13668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1918r0 f13669b;

    public B(C c10, Y1 y10, C1918r0 c1918r0) {
        this.f13668a = y10;
        this.f13669b = c1918r0;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f13668a.b(this.f13669b);
    }
}
