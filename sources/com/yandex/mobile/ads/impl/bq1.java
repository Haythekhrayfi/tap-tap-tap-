package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bq1 implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f19311c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sf1.a f19312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f19313e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f19314f;

    public /* synthetic */ bq1(sf1.a aVar, int i10, long j10) {
        this.f19312d = aVar;
        this.f19313e = i10;
        this.f19314f = j10;
    }

    public /* synthetic */ bq1(sf1.a aVar, long j10, int i10) {
        this.f19312d = aVar;
        this.f19314f = j10;
        this.f19313e = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19311c) {
            case 0:
                this.f19312d.b(this.f19313e, this.f19314f);
                break;
            default:
                this.f19312d.a(this.f19314f, this.f19313e);
                break;
        }
    }
}
