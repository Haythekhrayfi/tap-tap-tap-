package com.applovin.exoplayer2.e.c;

import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.l.v;
import com.applovin.exoplayer2.l.y;

/* JADX INFO: loaded from: classes.dex */
final class e extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y f5290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final y f5291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f5292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f5293e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f5294f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f5295g;

    public e(x xVar) {
        super(xVar);
        this.f5290b = new y(v.f7660a);
        this.f5291c = new y(4);
    }

    @Override // com.applovin.exoplayer2.e.c.d
    public boolean a(y yVar) throws d.a {
        int iH = yVar.h();
        int i10 = (iH >> 4) & 15;
        int i11 = iH & 15;
        if (i11 != 7) {
            throw new d.a(android.support.v4.media.a.a("Video format not supported: ", i11));
        }
        this.f5295g = i10;
        return i10 != 5;
    }

    @Override // com.applovin.exoplayer2.e.c.d
    public boolean a(y yVar, long j10) throws ai {
        int iH = yVar.h();
        long jN = (((long) yVar.n()) * 1000) + j10;
        if (iH == 0 && !this.f5293e) {
            y yVar2 = new y(new byte[yVar.a()]);
            yVar.a(yVar2.d(), 0, yVar.a());
            com.applovin.exoplayer2.m.a aVarA = com.applovin.exoplayer2.m.a.a(yVar2);
            this.f5292d = aVarA.f7707b;
            this.f5289a.a(new com.applovin.exoplayer2.v.a().f("video/avc").d(aVarA.f7711f).g(aVarA.f7708c).h(aVarA.f7709d).b(aVarA.f7710e).a(aVarA.f7706a).a());
            this.f5293e = true;
            return false;
        }
        if (iH != 1 || !this.f5293e) {
            return false;
        }
        int i10 = this.f5295g == 1 ? 1 : 0;
        if (!this.f5294f && i10 == 0) {
            return false;
        }
        byte[] bArrD = this.f5291c.d();
        bArrD[0] = 0;
        bArrD[1] = 0;
        bArrD[2] = 0;
        int i11 = 4 - this.f5292d;
        int i12 = 0;
        while (yVar.a() > 0) {
            yVar.a(this.f5291c.d(), i11, this.f5292d);
            this.f5291c.d(0);
            int iW = this.f5291c.w();
            this.f5290b.d(0);
            this.f5289a.a(this.f5290b, 4);
            this.f5289a.a(yVar, iW);
            i12 = i12 + 4 + iW;
        }
        this.f5289a.a(jN, i10, i12, 0, null);
        this.f5294f = true;
        return true;
    }
}
