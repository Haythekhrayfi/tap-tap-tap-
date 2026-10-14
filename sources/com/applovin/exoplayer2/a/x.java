package com.applovin.exoplayer2.a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x implements com.applovin.exoplayer2.l.p.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b.a f4040d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f4041e;

    public /* synthetic */ x(b.a aVar, boolean z10, int i10) {
        this.f4039c = i10;
        if (i10 == 1) {
            this.f4040d = aVar;
            this.f4041e = z10;
        } else if (i10 != 2) {
            this.f4040d = aVar;
            this.f4041e = z10;
        } else {
            this.f4040d = aVar;
            this.f4041e = z10;
        }
    }

    @Override // com.applovin.exoplayer2.l.p.a
    public final void invoke(Object obj) {
        switch (this.f4039c) {
            case 0:
                ((b) obj).b(this.f4040d, this.f4041e);
                break;
            case 1:
                a.c(this.f4040d, this.f4041e, (b) obj);
                break;
            case 2:
                ((b) obj).a(this.f4040d, this.f4041e);
                break;
            default:
                ((b) obj).e(this.f4040d, this.f4041e);
                break;
        }
    }
}
