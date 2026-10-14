package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.l.ag;
import com.applovin.exoplayer2.l.ai;

/* JADX INFO: loaded from: classes.dex */
public final class y implements ad {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x f6055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.y f6056b = new com.applovin.exoplayer2.l.y(32);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f6057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f6058d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f6059e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f6060f;

    public y(x xVar) {
        this.f6055a = xVar;
    }

    @Override // com.applovin.exoplayer2.e.i.ad
    public void a() {
        this.f6060f = true;
    }

    @Override // com.applovin.exoplayer2.e.i.ad
    public void a(ag agVar, com.applovin.exoplayer2.e.j jVar, ad.d dVar) {
        this.f6055a.a(agVar, jVar, dVar);
        this.f6060f = true;
    }

    @Override // com.applovin.exoplayer2.e.i.ad
    public void a(com.applovin.exoplayer2.l.y yVar, int i10) {
        int iC;
        boolean z10 = (i10 & 1) != 0;
        if (z10) {
            iC = yVar.c() + yVar.h();
        } else {
            iC = -1;
        }
        if (this.f6060f) {
            if (!z10) {
                return;
            }
            this.f6060f = false;
            yVar.d(iC);
            this.f6058d = 0;
        }
        while (yVar.a() > 0) {
            int i11 = this.f6058d;
            if (i11 < 3) {
                if (i11 == 0) {
                    int iH = yVar.h();
                    yVar.d(yVar.c() - 1);
                    if (iH == 255) {
                        this.f6060f = true;
                        return;
                    }
                }
                int iMin = Math.min(yVar.a(), 3 - this.f6058d);
                yVar.a(this.f6056b.d(), this.f6058d, iMin);
                int i12 = this.f6058d + iMin;
                this.f6058d = i12;
                if (i12 == 3) {
                    this.f6056b.d(0);
                    this.f6056b.c(3);
                    this.f6056b.e(1);
                    int iH2 = this.f6056b.h();
                    int iH3 = this.f6056b.h();
                    this.f6059e = (iH2 & 128) != 0;
                    this.f6057c = (((iH2 & 15) << 8) | iH3) + 3;
                    int iE = this.f6056b.e();
                    int i13 = this.f6057c;
                    if (iE < i13) {
                        this.f6056b.b(Math.min(4098, Math.max(i13, this.f6056b.e() * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(yVar.a(), this.f6057c - this.f6058d);
                yVar.a(this.f6056b.d(), this.f6058d, iMin2);
                int i14 = this.f6058d + iMin2;
                this.f6058d = i14;
                int i15 = this.f6057c;
                if (i14 != i15) {
                    continue;
                } else {
                    if (!this.f6059e) {
                        this.f6056b.c(i15);
                    } else {
                        if (ai.a(this.f6056b.d(), 0, this.f6057c, -1) != 0) {
                            this.f6060f = true;
                            return;
                        }
                        this.f6056b.c(this.f6057c - 4);
                    }
                    this.f6056b.d(0);
                    this.f6055a.a(this.f6056b);
                    this.f6058d = 0;
                }
            }
        }
    }
}
