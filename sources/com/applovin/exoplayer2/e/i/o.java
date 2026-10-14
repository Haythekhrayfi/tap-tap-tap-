package com.applovin.exoplayer2.e.i;

/* JADX INFO: loaded from: classes.dex */
public final class o implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.applovin.exoplayer2.e.x f5967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f5968c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f5970e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f5971f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.y f5966a = new com.applovin.exoplayer2.l.y(10);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f5969d = -9223372036854775807L;

    @Override // com.applovin.exoplayer2.e.i.j
    public void a() {
        this.f5968c = false;
        this.f5969d = -9223372036854775807L;
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f5968c = true;
        if (j10 != -9223372036854775807L) {
            this.f5969d = j10;
        }
        this.f5970e = 0;
        this.f5971f = 0;
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(com.applovin.exoplayer2.e.j jVar, ad.d dVar) {
        dVar.a();
        com.applovin.exoplayer2.e.x xVarA = jVar.a(dVar.b(), 5);
        this.f5967b = xVarA;
        xVarA.a(new com.applovin.exoplayer2.v.a().a(dVar.c()).f("application/id3").a());
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(com.applovin.exoplayer2.l.y yVar) {
        com.applovin.exoplayer2.l.a.a(this.f5967b);
        if (this.f5968c) {
            int iA = yVar.a();
            int i10 = this.f5971f;
            if (i10 < 10) {
                int iMin = Math.min(iA, 10 - i10);
                System.arraycopy(yVar.d(), yVar.c(), this.f5966a.d(), this.f5971f, iMin);
                if (this.f5971f + iMin == 10) {
                    this.f5966a.d(0);
                    if (73 != this.f5966a.h() || 68 != this.f5966a.h() || 51 != this.f5966a.h()) {
                        com.applovin.exoplayer2.l.q.c("Id3Reader", "Discarding invalid ID3 tag");
                        this.f5968c = false;
                        return;
                    } else {
                        this.f5966a.e(3);
                        this.f5970e = this.f5966a.v() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iA, this.f5970e - this.f5971f);
            this.f5967b.a(yVar, iMin2);
            this.f5971f += iMin2;
        }
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void b() {
        int i10;
        com.applovin.exoplayer2.l.a.a(this.f5967b);
        if (this.f5968c && (i10 = this.f5970e) != 0 && this.f5971f == i10) {
            long j10 = this.f5969d;
            if (j10 != -9223372036854775807L) {
                this.f5967b.a(j10, 1, i10, 0, null);
            }
            this.f5968c = false;
        }
    }
}
