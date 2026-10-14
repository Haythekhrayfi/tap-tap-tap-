package com.applovin.exoplayer2.a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w implements com.applovin.exoplayer2.l.p.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b.a f4035d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f4036e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f4037f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f4038g;

    public /* synthetic */ w(b.a aVar, String str, long j10, long j11, int i10) {
        this.f4034c = i10;
        this.f4035d = aVar;
        this.f4036e = str;
        this.f4037f = j10;
        this.f4038g = j11;
    }

    @Override // com.applovin.exoplayer2.l.p.a
    public final void invoke(Object obj) {
        switch (this.f4034c) {
            case 0:
                a.b(this.f4035d, this.f4036e, this.f4037f, this.f4038g, (b) obj);
                break;
            default:
                a.a(this.f4035d, this.f4036e, this.f4037f, this.f4038g, (b) obj);
                break;
        }
    }
}
