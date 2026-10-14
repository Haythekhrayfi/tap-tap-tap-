package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class co1 implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f19603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gt0 f19604d;

    public /* synthetic */ co1(gt0 gt0Var, int i10) {
        this.f19603c = i10;
        this.f19604d = gt0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19603c) {
            case 0:
                this.f19604d.h();
                break;
            case 1:
                this.f19604d.i();
                break;
            default:
                this.f19604d.g();
                break;
        }
    }
}
