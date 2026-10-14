package com.applovin.exoplayer2.a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v implements com.applovin.exoplayer2.l.p.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b.a f4032d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f4033e;

    public /* synthetic */ v(b.a aVar, String str, int i10) {
        this.f4031c = i10;
        this.f4032d = aVar;
        this.f4033e = str;
    }

    @Override // com.applovin.exoplayer2.l.p.a
    public final void invoke(Object obj) {
        switch (this.f4031c) {
            case 0:
                ((b) obj).a(this.f4032d, this.f4033e);
                break;
            default:
                ((b) obj).b(this.f4032d, this.f4033e);
                break;
        }
    }
}
