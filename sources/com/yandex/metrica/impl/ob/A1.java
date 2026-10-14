package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
class A1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C6 f13623a;

    public A1(B1 b10, C6 c10) {
        this.f13623a = c10;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f13623a.a();
        } catch (Throwable unused) {
        }
    }
}
