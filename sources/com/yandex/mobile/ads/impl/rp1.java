package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rp1 implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f24819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qt0 f24820d;

    public /* synthetic */ rp1(qt0 qt0Var, int i10) {
        this.f24819c = i10;
        this.f24820d = qt0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f24819c) {
            case 0:
                qt0.c(this.f24820d);
                break;
            case 1:
                qt0.a(this.f24820d);
                break;
            default:
                qt0.b(this.f24820d);
                break;
        }
    }
}
