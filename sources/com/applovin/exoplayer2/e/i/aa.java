package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.l.ag;
import com.applovin.exoplayer2.l.ai;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
final class aa extends com.applovin.exoplayer2.e.a {

    public static final class a implements com.applovin.exoplayer2.e.a.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ag f5705a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.applovin.exoplayer2.l.y f5706b = new com.applovin.exoplayer2.l.y();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f5707c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f5708d;

        public a(int i10, ag agVar, int i11) {
            this.f5707c = i10;
            this.f5705a = agVar;
            this.f5708d = i11;
        }

        private com.applovin.exoplayer2.e.a.e a(com.applovin.exoplayer2.l.y yVar, long j10, long j11) {
            int iA;
            int iA2;
            int iB = yVar.b();
            long j12 = -1;
            long j13 = -1;
            long j14 = -9223372036854775807L;
            while (yVar.a() >= 188 && (iA2 = (iA = ae.a(yVar.d(), yVar.c(), iB)) + 188) <= iB) {
                long jA = ae.a(yVar, iA, this.f5707c);
                if (jA != -9223372036854775807L) {
                    long jB = this.f5705a.b(jA);
                    if (jB > j10) {
                        return j14 == -9223372036854775807L ? com.applovin.exoplayer2.e.a.e.a(jB, j11) : com.applovin.exoplayer2.e.a.e.a(j11 + j13);
                    }
                    if (100000 + jB > j10) {
                        return com.applovin.exoplayer2.e.a.e.a(j11 + ((long) iA));
                    }
                    j13 = iA;
                    j14 = jB;
                }
                yVar.d(iA2);
                j12 = iA2;
            }
            return j14 != -9223372036854775807L ? com.applovin.exoplayer2.e.a.e.b(j14, j11 + j12) : com.applovin.exoplayer2.e.a.e.f5216a;
        }

        @Override // com.applovin.exoplayer2.e.a.f
        public com.applovin.exoplayer2.e.a.e a(com.applovin.exoplayer2.e.i iVar, long j10) throws IOException {
            long jC = iVar.c();
            int iMin = (int) Math.min(this.f5708d, iVar.d() - jC);
            this.f5706b.a(iMin);
            iVar.d(this.f5706b.d(), 0, iMin);
            return a(this.f5706b, j10, jC);
        }

        @Override // com.applovin.exoplayer2.e.a.f
        public void a() {
            this.f5706b.a(ai.f7600f);
        }
    }

    public aa(ag agVar, long j10, long j11, int i10, int i11) {
        super(new com.applovin.exoplayer2.e.a.b(), new a(i10, agVar, i11), j10, 0L, j10 + 1, 0L, j11, 188L, 940);
    }
}
