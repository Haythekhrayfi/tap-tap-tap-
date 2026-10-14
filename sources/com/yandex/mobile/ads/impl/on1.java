package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class on1 implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f23858c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f23859d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f23860e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f23861f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f23862g;

    public /* synthetic */ on1(ac.a aVar, int i10, long j10, long j11) {
        this.f23859d = aVar;
        this.f23860e = i10;
        this.f23861f = j10;
        this.f23862g = j11;
    }

    public /* synthetic */ on1(ad.a.C0199a.C0200a c0200a, int i10, long j10, long j11) {
        this.f23859d = c0200a;
        this.f23860e = i10;
        this.f23861f = j10;
        this.f23862g = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23858c) {
            case 0:
                ad.a.C0199a.a((ad.a.C0199a.C0200a) this.f23859d, this.f23860e, this.f23861f, this.f23862g);
                break;
            default:
                ((ac.a) this.f23859d).a(this.f23860e, this.f23861f, this.f23862g);
                break;
        }
    }
}
