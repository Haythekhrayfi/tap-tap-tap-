package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lp1 implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f22759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pl1 f22760d;

    public /* synthetic */ lp1(pl1 pl1Var, int i10) {
        this.f22759c = i10;
        this.f22760d = pl1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22759c) {
            case 0:
                pl1.h(this.f22760d);
                break;
            default:
                pl1.b.a(this.f22760d);
                break;
        }
    }
}
