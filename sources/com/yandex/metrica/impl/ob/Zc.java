package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
class Zc implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1583dd f15650a;

    public Zc(C1583dd c1583dd) {
        this.f15650a = c1583dd;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.f15650a.f15934e != null) {
                this.f15650a.f15934e.c();
            }
        } catch (Throwable unused) {
        }
    }
}
