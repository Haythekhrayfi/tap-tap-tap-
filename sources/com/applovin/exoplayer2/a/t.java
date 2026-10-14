package com.applovin.exoplayer2.a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements com.applovin.exoplayer2.l.p.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b.a f4025d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.applovin.exoplayer2.v f4026e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.applovin.exoplayer2.c.h f4027f;

    public /* synthetic */ t(b.a aVar, com.applovin.exoplayer2.v vVar, com.applovin.exoplayer2.c.h hVar, int i10) {
        this.f4024c = i10;
        this.f4025d = aVar;
        this.f4026e = vVar;
        this.f4027f = hVar;
    }

    @Override // com.applovin.exoplayer2.l.p.a
    public final void invoke(Object obj) {
        switch (this.f4024c) {
            case 0:
                a.a(this.f4025d, this.f4026e, this.f4027f, (b) obj);
                break;
            default:
                a.b(this.f4025d, this.f4026e, this.f4027f, (b) obj);
                break;
        }
    }
}
