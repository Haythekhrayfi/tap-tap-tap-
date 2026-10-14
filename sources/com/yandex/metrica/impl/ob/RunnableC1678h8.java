package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.h8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class RunnableC1678h8 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Vm f16267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1653g8 f16268b;

    public RunnableC1678h8(C1653g8 c1653g8, Vm vm) {
        this.f16268b = c1653g8;
        this.f16267a = vm;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f16268b.a(this.f16267a);
    }
}
