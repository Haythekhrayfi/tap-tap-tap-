package com.applovin.exoplayer2.e.h;

import com.applovin.exoplayer2.e.k;
import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.e.w;
import com.applovin.exoplayer2.l.ai;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f5635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f5636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f5637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h f5638d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f5639e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f5640f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f5641g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f5642h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f5643i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f5644j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f5645k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f5646l;

    /* JADX INFO: renamed from: com.applovin.exoplayer2.e.h.a$a, reason: collision with other inner class name */
    public final class C0088a implements v {
        private C0088a() {
        }

        @Override // com.applovin.exoplayer2.e.v
        public v.a a(long j10) {
            long jB = a.this.f5638d.b(j10);
            return new v.a(new w(j10, ai.a(((((a.this.f5637c - a.this.f5636b) * jB) / a.this.f5640f) + a.this.f5636b) - 30000, a.this.f5636b, a.this.f5637c - 1)));
        }

        @Override // com.applovin.exoplayer2.e.v
        public boolean a() {
            return true;
        }

        @Override // com.applovin.exoplayer2.e.v
        public long b() {
            return a.this.f5638d.a(a.this.f5640f);
        }
    }

    public a(h hVar, long j10, long j11, long j12, long j13, boolean z10) {
        com.applovin.exoplayer2.l.a.a(j10 >= 0 && j11 > j10);
        this.f5638d = hVar;
        this.f5636b = j10;
        this.f5637c = j11;
        if (j12 == j11 - j10 || z10) {
            this.f5640f = j13;
            this.f5639e = 4;
        } else {
            this.f5639e = 0;
        }
        this.f5635a = new e();
    }

    private long c(com.applovin.exoplayer2.e.i iVar) throws IOException {
        if (this.f5643i == this.f5644j) {
            return -1L;
        }
        long jC = iVar.c();
        if (!this.f5635a.a(iVar, this.f5644j)) {
            long j10 = this.f5643i;
            if (j10 != jC) {
                return j10;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.f5635a.a(iVar, false);
        iVar.a();
        long j11 = this.f5642h;
        e eVar = this.f5635a;
        long j12 = eVar.f5665c;
        long j13 = j11 - j12;
        int i10 = eVar.f5670h + eVar.f5671i;
        if (0 <= j13 && j13 < 72000) {
            return -1L;
        }
        if (j13 < 0) {
            this.f5644j = jC;
            this.f5646l = j12;
        } else {
            this.f5643i = iVar.c() + ((long) i10);
            this.f5645k = this.f5635a.f5665c;
        }
        long j14 = this.f5644j;
        long j15 = this.f5643i;
        if (j14 - j15 < 100000) {
            this.f5644j = j15;
            return j15;
        }
        long jC2 = iVar.c() - (((long) i10) * (j13 <= 0 ? 2L : 1L));
        long j16 = this.f5644j;
        long j17 = this.f5643i;
        return ai.a((((j16 - j17) * j13) / (this.f5646l - this.f5645k)) + jC2, j17, j16 - 1);
    }

    private void d(com.applovin.exoplayer2.e.i iVar) throws IOException {
        while (true) {
            this.f5635a.a(iVar);
            this.f5635a.a(iVar, false);
            e eVar = this.f5635a;
            if (eVar.f5665c > this.f5642h) {
                iVar.a();
                return;
            } else {
                iVar.b(eVar.f5670h + eVar.f5671i);
                this.f5643i = iVar.c();
                this.f5645k = this.f5635a.f5665c;
            }
        }
    }

    @Override // com.applovin.exoplayer2.e.h.f
    public long a(com.applovin.exoplayer2.e.i iVar) throws IOException {
        int i10 = this.f5639e;
        if (i10 == 0) {
            long jC = iVar.c();
            this.f5641g = jC;
            this.f5639e = 1;
            long j10 = this.f5637c - 65307;
            if (j10 > jC) {
                return j10;
            }
        } else if (i10 != 1) {
            if (i10 == 2) {
                long jC2 = c(iVar);
                if (jC2 != -1) {
                    return jC2;
                }
                this.f5639e = 3;
            } else if (i10 != 3) {
                if (i10 == 4) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            d(iVar);
            this.f5639e = 4;
            return -(this.f5645k + 2);
        }
        this.f5640f = b(iVar);
        this.f5639e = 4;
        return this.f5641g;
    }

    @Override // com.applovin.exoplayer2.e.h.f
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0088a b() {
        if (this.f5640f != 0) {
            return new C0088a();
        }
        return null;
    }

    @Override // com.applovin.exoplayer2.e.h.f
    public void a(long j10) {
        this.f5642h = ai.a(j10, 0L, this.f5640f - 1);
        this.f5639e = 2;
        this.f5643i = this.f5636b;
        this.f5644j = this.f5637c;
        this.f5645k = 0L;
        this.f5646l = this.f5640f;
    }

    public long b(com.applovin.exoplayer2.e.i iVar) throws IOException {
        long j10;
        e eVar;
        this.f5635a.a();
        if (!this.f5635a.a(iVar)) {
            throw new EOFException();
        }
        this.f5635a.a(iVar, false);
        e eVar2 = this.f5635a;
        iVar.b(eVar2.f5670h + eVar2.f5671i);
        do {
            j10 = this.f5635a.f5665c;
            e eVar3 = this.f5635a;
            if ((eVar3.f5664b & 4) == 4 || !eVar3.a(iVar) || iVar.c() >= this.f5637c || !this.f5635a.a(iVar, true)) {
                break;
            }
            eVar = this.f5635a;
        } while (k.a(iVar, eVar.f5670h + eVar.f5671i));
        return j10;
    }
}
