package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class it implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f21815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ac.a f21816d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ym f21817e;

    public /* synthetic */ it(ac.a aVar, ym ymVar, int i10) {
        this.f21815c = i10;
        this.f21816d = aVar;
        this.f21817e = ymVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21815c) {
            case 0:
                this.f21816d.d(this.f21817e);
                break;
            default:
                this.f21816d.c(this.f21817e);
                break;
        }
    }
}
