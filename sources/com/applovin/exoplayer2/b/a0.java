package com.applovin.exoplayer2.b;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a0 implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g.a f4386d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.applovin.exoplayer2.c.e f4387e;

    public /* synthetic */ a0(g.a aVar, com.applovin.exoplayer2.c.e eVar, int i10) {
        this.f4385c = i10;
        this.f4386d = aVar;
        this.f4387e = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4385c) {
            case 0:
                this.f4386d.c(this.f4387e);
                break;
            default:
                this.f4386d.d(this.f4387e);
                break;
        }
    }
}
