package com.applovin.exoplayer2.m;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n.a f7889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.applovin.exoplayer2.c.e f7890e;

    public /* synthetic */ q(n.a aVar, com.applovin.exoplayer2.c.e eVar, int i10) {
        this.f7888c = i10;
        this.f7889d = aVar;
        this.f7890e = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7888c) {
            case 0:
                this.f7889d.d(this.f7890e);
                break;
            default:
                this.f7889d.c(this.f7890e);
                break;
        }
    }
}
