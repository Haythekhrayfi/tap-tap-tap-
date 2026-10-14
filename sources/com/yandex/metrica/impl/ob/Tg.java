package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
class Tg implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Xg f15102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f15103b;

    public Tg(Sg sg, Xg xg, Throwable th) {
        this.f15102a = xg;
        this.f15103b = th;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f15102a.a(this.f15103b);
    }
}
