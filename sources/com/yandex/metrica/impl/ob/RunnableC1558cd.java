package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.cd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class RunnableC1558cd implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1583dd f15878a;

    public RunnableC1558cd(C1583dd c1583dd) {
        this.f15878a = c1583dd;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f15878a.f15934e != null) {
            this.f15878a.f15934e.a();
        }
        C1583dd.b(this.f15878a);
    }
}
