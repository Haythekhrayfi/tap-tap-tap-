package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.l.ag;
import com.applovin.exoplayer2.l.ai;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
final class u extends com.applovin.exoplayer2.e.a {

    public static final class a implements com.applovin.exoplayer2.e.a.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ag f6025a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.applovin.exoplayer2.l.y f6026b;

        private a(ag agVar) {
            this.f6025a = agVar;
            this.f6026b = new com.applovin.exoplayer2.l.y();
        }

        private com.applovin.exoplayer2.e.a.e a(com.applovin.exoplayer2.l.y yVar, long j10, long j11) {
            int iC = -1;
            int iC2 = -1;
            long j12 = -9223372036854775807L;
            while (yVar.a() >= 4) {
                if (u.b(yVar.d(), yVar.c()) != 442) {
                    yVar.e(1);
                } else {
                    yVar.e(4);
                    long jA = v.a(yVar);
                    if (jA != -9223372036854775807L) {
                        long jB = this.f6025a.b(jA);
                        if (jB > j10) {
                            return j12 == -9223372036854775807L ? com.applovin.exoplayer2.e.a.e.a(jB, j11) : com.applovin.exoplayer2.e.a.e.a(j11 + ((long) iC2));
                        }
                        if (100000 + jB > j10) {
                            return com.applovin.exoplayer2.e.a.e.a(j11 + ((long) yVar.c()));
                        }
                        iC2 = yVar.c();
                        j12 = jB;
                    }
                    a(yVar);
                    iC = yVar.c();
                }
            }
            return j12 != -9223372036854775807L ? com.applovin.exoplayer2.e.a.e.b(j12, j11 + ((long) iC)) : com.applovin.exoplayer2.e.a.e.f5216a;
        }

        private static void a(com.applovin.exoplayer2.l.y yVar) {
            int iB;
            int iB2 = yVar.b();
            if (yVar.a() < 10) {
                yVar.d(iB2);
                return;
            }
            yVar.e(9);
            int iH = yVar.h() & 7;
            if (yVar.a() < iH) {
                yVar.d(iB2);
                return;
            }
            yVar.e(iH);
            if (yVar.a() < 4) {
                yVar.d(iB2);
                return;
            }
            if (u.b(yVar.d(), yVar.c()) == 443) {
                yVar.e(4);
                int i10 = yVar.i();
                if (yVar.a() < i10) {
                    yVar.d(iB2);
                    return;
                }
                yVar.e(i10);
            }
            while (yVar.a() >= 4 && (iB = u.b(yVar.d(), yVar.c())) != 442 && iB != 441 && (iB >>> 8) == 1) {
                yVar.e(4);
                if (yVar.a() < 2) {
                    yVar.d(iB2);
                    return;
                }
                yVar.d(Math.min(yVar.b(), yVar.c() + yVar.i()));
            }
        }

        @Override // com.applovin.exoplayer2.e.a.f
        public com.applovin.exoplayer2.e.a.e a(com.applovin.exoplayer2.e.i iVar, long j10) throws IOException {
            long jC = iVar.c();
            int iMin = (int) Math.min(20000L, iVar.d() - jC);
            this.f6026b.a(iMin);
            iVar.d(this.f6026b.d(), 0, iMin);
            return a(this.f6026b, j10, jC);
        }

        @Override // com.applovin.exoplayer2.e.a.f
        public void a() {
            this.f6026b.a(ai.f7600f);
        }
    }

    public u(ag agVar, long j10, long j11) {
        super(new com.applovin.exoplayer2.e.a.b(), new a(agVar), j10, 0L, j10 + 1, 0L, j11, 188L, 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }
}
