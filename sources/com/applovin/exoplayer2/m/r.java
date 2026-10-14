package com.applovin.exoplayer2.m;

import com.yandex.mobile.ads.impl.sf1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7891c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7893e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f7894f;

    public /* synthetic */ r(n.a aVar, Object obj, long j10) {
        this.f7892d = aVar;
        this.f7893e = obj;
        this.f7894f = j10;
    }

    public /* synthetic */ r(sf1.a aVar, Object obj, long j10) {
        this.f7892d = aVar;
        this.f7893e = obj;
        this.f7894f = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7891c) {
            case 0:
                ((n.a) this.f7892d).a(this.f7893e, this.f7894f);
                break;
            default:
                ((sf1.a) this.f7892d).a(this.f7893e, this.f7894f);
                break;
        }
    }
}
