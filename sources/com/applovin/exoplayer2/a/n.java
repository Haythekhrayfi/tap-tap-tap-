package com.applovin.exoplayer2.a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements com.applovin.exoplayer2.l.p.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3981c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b.a f3982d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3983e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f3984f;

    public /* synthetic */ n(b.a aVar, int i10, long j10) {
        this.f3982d = aVar;
        this.f3983e = i10;
        this.f3984f = j10;
    }

    public /* synthetic */ n(b.a aVar, long j10, int i10) {
        this.f3982d = aVar;
        this.f3984f = j10;
        this.f3983e = i10;
    }

    @Override // com.applovin.exoplayer2.l.p.a
    public final void invoke(Object obj) {
        switch (this.f3981c) {
            case 0:
                ((b) obj).a(this.f3982d, this.f3983e, this.f3984f);
                break;
            default:
                ((b) obj).a(this.f3982d, this.f3984f, this.f3983e);
                break;
        }
    }
}
