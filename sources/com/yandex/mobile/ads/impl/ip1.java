package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ip1 implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f21790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oi0 f21791d;

    public /* synthetic */ ip1(oi0 oi0Var, int i10) {
        this.f21790c = i10;
        this.f21791d = oi0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21790c) {
            case 0:
                this.f21791d.d();
                break;
            case 1:
                this.f21791d.b();
                break;
            default:
                this.f21791d.c();
                break;
        }
    }
}
