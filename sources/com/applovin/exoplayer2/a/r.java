package com.applovin.exoplayer2.a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements com.applovin.exoplayer2.l.p.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b.a f4018d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.applovin.exoplayer2.c.e f4019e;

    public /* synthetic */ r(b.a aVar, com.applovin.exoplayer2.c.e eVar, int i10) {
        this.f4017c = i10;
        if (i10 == 1) {
            this.f4018d = aVar;
            this.f4019e = eVar;
        } else if (i10 != 2) {
            this.f4018d = aVar;
            this.f4019e = eVar;
        } else {
            this.f4018d = aVar;
            this.f4019e = eVar;
        }
    }

    @Override // com.applovin.exoplayer2.l.p.a
    public final void invoke(Object obj) {
        switch (this.f4017c) {
            case 0:
                a.b(this.f4018d, this.f4019e, (b) obj);
                break;
            case 1:
                a.a(this.f4018d, this.f4019e, (b) obj);
                break;
            case 2:
                a.d(this.f4018d, this.f4019e, (b) obj);
                break;
            default:
                a.c(this.f4018d, this.f4019e, (b) obj);
                break;
        }
    }
}
