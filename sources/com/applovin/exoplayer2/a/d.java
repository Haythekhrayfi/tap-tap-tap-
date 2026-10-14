package com.applovin.exoplayer2.a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements com.applovin.exoplayer2.l.p.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b.a f3943d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f3944e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3945f;

    public /* synthetic */ d(b.a aVar, boolean z10, int i10, int i11) {
        this.f3942c = i11;
        this.f3943d = aVar;
        this.f3944e = z10;
        this.f3945f = i10;
    }

    @Override // com.applovin.exoplayer2.l.p.a
    public final void invoke(Object obj) {
        switch (this.f3942c) {
            case 0:
                ((b) obj).b(this.f3943d, this.f3944e, this.f3945f);
                break;
            default:
                ((b) obj).a(this.f3943d, this.f3944e, this.f3945f);
                break;
        }
    }
}
