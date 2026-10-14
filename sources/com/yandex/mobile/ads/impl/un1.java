package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class un1 implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f25713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ da0 f25714d;

    public /* synthetic */ un1(da0 da0Var, int i10) {
        this.f25713c = i10;
        this.f25714d = da0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f25713c) {
            case 0:
                this.f25714d.c();
                break;
            case 1:
                this.f25714d.b();
                break;
            default:
                this.f25714d.a();
                break;
        }
    }
}
