package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cq1 implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f19613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sf1.a f19614d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ym f19615e;

    public /* synthetic */ cq1(sf1.a aVar, ym ymVar, int i10) {
        this.f19613c = i10;
        this.f19614d = aVar;
        this.f19615e = ymVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19613c) {
            case 0:
                this.f19614d.c(this.f19615e);
                break;
            default:
                this.f19614d.d(this.f19615e);
                break;
        }
    }
}
