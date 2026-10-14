package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class eo1 implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f20305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h01 f20306d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h01.a f20307e;

    public /* synthetic */ eo1(h01 h01Var, h01.a aVar, int i10) {
        this.f20305c = i10;
        this.f20306d = h01Var;
        this.f20307e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20305c) {
            case 0:
                this.f20306d.b(this.f20307e);
                break;
            default:
                this.f20306d.c(this.f20307e);
                break;
        }
    }
}
