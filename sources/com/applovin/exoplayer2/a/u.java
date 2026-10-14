package com.applovin.exoplayer2.a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u implements com.applovin.exoplayer2.l.p.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b.a f4029d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Exception f4030e;

    public /* synthetic */ u(b.a aVar, Exception exc, int i10) {
        this.f4028c = i10;
        if (i10 == 1) {
            this.f4029d = aVar;
            this.f4030e = exc;
        } else if (i10 != 2) {
            this.f4029d = aVar;
            this.f4030e = exc;
        } else {
            this.f4029d = aVar;
            this.f4030e = exc;
        }
    }

    @Override // com.applovin.exoplayer2.l.p.a
    public final void invoke(Object obj) {
        switch (this.f4028c) {
            case 0:
                ((b) obj).c(this.f4029d, this.f4030e);
                break;
            case 1:
                ((b) obj).b(this.f4029d, this.f4030e);
                break;
            case 2:
                ((b) obj).d(this.f4029d, this.f4030e);
                break;
            default:
                ((b) obj).a(this.f4029d, this.f4030e);
                break;
        }
    }
}
