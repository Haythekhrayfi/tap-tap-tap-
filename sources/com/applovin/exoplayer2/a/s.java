package com.applovin.exoplayer2.a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements com.applovin.exoplayer2.l.p.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b.a f4021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.applovin.exoplayer2.h.j f4022e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.applovin.exoplayer2.h.m f4023f;

    public /* synthetic */ s(b.a aVar, com.applovin.exoplayer2.h.j jVar, com.applovin.exoplayer2.h.m mVar, int i10) {
        this.f4020c = i10;
        if (i10 != 1) {
            this.f4021d = aVar;
            this.f4022e = jVar;
            this.f4023f = mVar;
        } else {
            this.f4021d = aVar;
            this.f4022e = jVar;
            this.f4023f = mVar;
        }
    }

    @Override // com.applovin.exoplayer2.l.p.a
    public final void invoke(Object obj) {
        switch (this.f4020c) {
            case 0:
                ((b) obj).a(this.f4021d, this.f4022e, this.f4023f);
                break;
            case 1:
                ((b) obj).c(this.f4021d, this.f4022e, this.f4023f);
                break;
            default:
                ((b) obj).b(this.f4021d, this.f4022e, this.f4023f);
                break;
        }
    }
}
