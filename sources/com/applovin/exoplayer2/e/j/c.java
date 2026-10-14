package com.applovin.exoplayer2.e.j;

import android.util.Pair;
import com.applovin.exoplayer2.e.i;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.y;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
final class c {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6099a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f6100b;

        private a(int i10, long j10) {
            this.f6099a = i10;
            this.f6100b = j10;
        }

        public static a a(i iVar, y yVar) throws IOException {
            iVar.d(yVar.d(), 0, 8);
            yVar.d(0);
            return new a(yVar.q(), yVar.p());
        }
    }

    public static b a(i iVar) throws IOException {
        a aVarA;
        byte[] bArr;
        com.applovin.exoplayer2.l.a.b(iVar);
        y yVar = new y(16);
        if (a.a(iVar, yVar).f6099a != 1380533830) {
            return null;
        }
        iVar.d(yVar.d(), 0, 4);
        yVar.d(0);
        int iQ = yVar.q();
        if (iQ != 1463899717) {
            q.d("WavHeaderReader", "Unsupported RIFF format: " + iQ);
            return null;
        }
        while (true) {
            aVarA = a.a(iVar, yVar);
            if (aVarA.f6099a == 1718449184) {
                break;
            }
            iVar.c((int) aVarA.f6100b);
        }
        com.applovin.exoplayer2.l.a.b(aVarA.f6100b >= 16);
        iVar.d(yVar.d(), 0, 16);
        yVar.d(0);
        int iJ = yVar.j();
        int iJ2 = yVar.j();
        int iX = yVar.x();
        int iX2 = yVar.x();
        int iJ3 = yVar.j();
        int iJ4 = yVar.j();
        int i10 = ((int) aVarA.f6100b) - 16;
        if (i10 > 0) {
            byte[] bArr2 = new byte[i10];
            iVar.d(bArr2, 0, i10);
            bArr = bArr2;
        } else {
            bArr = ai.f7600f;
        }
        return new b(iJ, iJ2, iX, iX2, iJ3, iJ4, bArr);
    }

    public static Pair<Long, Long> b(i iVar) throws IOException {
        com.applovin.exoplayer2.l.a.b(iVar);
        iVar.a();
        y yVar = new y(8);
        while (true) {
            a aVarA = a.a(iVar, yVar);
            int i10 = aVarA.f6099a;
            if (i10 == 1684108385) {
                iVar.b(8);
                long jC = iVar.c();
                long j10 = aVarA.f6100b + jC;
                long jD = iVar.d();
                if (jD != -1 && j10 > jD) {
                    StringBuilder sbA = i2.a.a("Data exceeds input length: ", j10, ", ");
                    sbA.append(jD);
                    q.c("WavHeaderReader", sbA.toString());
                    j10 = jD;
                }
                return Pair.create(Long.valueOf(jC), Long.valueOf(j10));
            }
            if (i10 != 1380533830 && i10 != 1718449184) {
                StringBuilder sbA2 = defpackage.a.a("Ignoring unknown WAV chunk: ");
                sbA2.append(aVarA.f6099a);
                q.c("WavHeaderReader", sbA2.toString());
            }
            long j11 = aVarA.f6100b + 8;
            if (aVarA.f6099a == 1380533830) {
                j11 = 12;
            }
            if (j11 > 2147483647L) {
                StringBuilder sbA3 = defpackage.a.a("Chunk is too large (~2GB+) to skip; id: ");
                sbA3.append(aVarA.f6099a);
                throw com.applovin.exoplayer2.ai.a(sbA3.toString());
            }
            iVar.b((int) j11);
        }
    }
}
