package com.applovin.exoplayer2.a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements com.applovin.exoplayer2.l.p.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b.a f4013d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4014e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f4015f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f4016g;

    public /* synthetic */ q(b.a aVar, int i10, long j10, long j11, int i11) {
        this.f4012c = i11;
        this.f4013d = aVar;
        this.f4014e = i10;
        this.f4015f = j10;
        this.f4016g = j11;
    }

    @Override // com.applovin.exoplayer2.l.p.a
    public final void invoke(Object obj) {
        switch (this.f4012c) {
            case 0:
                ((b) obj).a(this.f4013d, this.f4014e, this.f4015f, this.f4016g);
                break;
            default:
                ((b) obj).b(this.f4013d, this.f4014e, this.f4015f, this.f4016g);
                break;
        }
    }
}
