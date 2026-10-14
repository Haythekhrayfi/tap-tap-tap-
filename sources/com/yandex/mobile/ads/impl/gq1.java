package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gq1 implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f21138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vt0 f21139d;

    public /* synthetic */ gq1(vt0 vt0Var, int i10) {
        this.f21138c = i10;
        if (i10 != 1) {
        }
        this.f21139d = vt0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21138c) {
            case 0:
                vt0.c(this.f21139d);
                break;
            case 1:
                vt0.b(this.f21139d);
                break;
            case 2:
                vt0.d(this.f21139d);
                break;
            default:
                vt0.a(this.f21139d);
                break;
        }
    }
}
