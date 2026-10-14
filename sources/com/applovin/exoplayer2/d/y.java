package com.applovin.exoplayer2.d;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5178e;

    public /* synthetic */ y(c.e eVar, com.applovin.exoplayer2.v vVar) {
        this.f5176c = 4;
        this.f5177d = eVar;
        this.f5178e = vVar;
    }

    public /* synthetic */ y(g.a aVar, g gVar, int i10) {
        this.f5176c = i10;
        if (i10 != 1) {
        }
        this.f5177d = aVar;
        this.f5178e = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5176c) {
            case 0:
                ((g.a) this.f5177d).c((g) this.f5178e);
                break;
            case 1:
                ((g.a) this.f5177d).b((g) this.f5178e);
                break;
            case 2:
                ((g.a) this.f5177d).e((g) this.f5178e);
                break;
            case 3:
                ((g.a) this.f5177d).d((g) this.f5178e);
                break;
            default:
                ((c.e) this.f5177d).b((com.applovin.exoplayer2.v) this.f5178e);
                break;
        }
    }
}
