package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class by implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f19348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ac.a f19349d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Exception f19350e;

    public /* synthetic */ by(ac.a aVar, Exception exc, int i10) {
        this.f19348c = i10;
        this.f19349d = aVar;
        this.f19350e = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19348c) {
            case 0:
                this.f19349d.c(this.f19350e);
                break;
            default:
                this.f19349d.d(this.f19350e);
                break;
        }
    }
}
