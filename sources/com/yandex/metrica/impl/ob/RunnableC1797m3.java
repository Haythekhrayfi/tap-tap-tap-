package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.m3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class RunnableC1797m3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1772l3 f16874a;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.m3$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Oh.a(RunnableC1797m3.this.f16874a.f16797a);
        }
    }

    public RunnableC1797m3(C1772l3 c1772l3) {
        this.f16874a = c1772l3;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((C1941rn) this.f16874a.f16801e.a()).execute(new a());
    }
}
