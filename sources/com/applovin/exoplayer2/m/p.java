package com.applovin.exoplayer2.m;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7884c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n.a f7885d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f7886e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f7887f;

    public /* synthetic */ p(n.a aVar, int i10, long j10) {
        this.f7885d = aVar;
        this.f7887f = i10;
        this.f7886e = j10;
    }

    public /* synthetic */ p(n.a aVar, long j10, int i10) {
        this.f7885d = aVar;
        this.f7886e = j10;
        this.f7887f = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7884c) {
            case 0:
                this.f7885d.b(this.f7886e, this.f7887f);
                break;
            default:
                this.f7885d.b(this.f7887f, this.f7886e);
                break;
        }
    }
}
