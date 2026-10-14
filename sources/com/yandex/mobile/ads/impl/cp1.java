package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cp1 implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f19606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n50 f19607d;

    public /* synthetic */ cp1(n50 n50Var, int i10) {
        this.f19606c = i10;
        this.f19607d = n50Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19606c) {
            case 0:
                this.f19607d.a();
                break;
            default:
                this.f19607d.b();
                break;
        }
    }
}
