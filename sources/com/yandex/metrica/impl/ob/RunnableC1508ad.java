package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ad, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class RunnableC1508ad implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1583dd f15745a;

    public RunnableC1508ad(C1583dd c1583dd) {
        this.f15745a = c1583dd;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f15745a.f15934e != null) {
            this.f15745a.f15934e.e();
        }
    }
}
