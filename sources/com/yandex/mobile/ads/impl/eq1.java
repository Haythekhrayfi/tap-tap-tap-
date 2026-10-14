package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class eq1 implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f20312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tt0 f20313d;

    public /* synthetic */ eq1(tt0 tt0Var, int i10) {
        this.f20312c = i10;
        if (i10 != 1) {
        }
        this.f20313d = tt0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20312c) {
            case 0:
                tt0.c(this.f20313d);
                break;
            case 1:
                tt0.d(this.f20313d);
                break;
            case 2:
                tt0.b(this.f20313d);
                break;
            default:
                tt0.a(this.f20313d);
                break;
        }
    }
}
