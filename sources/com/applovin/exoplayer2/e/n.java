package com.applovin.exoplayer2.e;

import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.common.base.Charsets;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public p f6108a;

        public a(p pVar) {
            this.f6108a = pVar;
        }
    }

    private static p.a a(i iVar, int i10) throws IOException {
        com.applovin.exoplayer2.l.y yVar = new com.applovin.exoplayer2.l.y(i10);
        iVar.b(yVar.d(), 0, i10);
        return a(yVar);
    }

    public static p.a a(com.applovin.exoplayer2.l.y yVar) {
        yVar.e(1);
        int iM = yVar.m();
        long jC = ((long) yVar.c()) + ((long) iM);
        int i10 = iM / 18;
        long[] jArrCopyOf = new long[i10];
        long[] jArrCopyOf2 = new long[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            long jS = yVar.s();
            if (jS == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i11);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i11);
                break;
            }
            jArrCopyOf[i11] = jS;
            jArrCopyOf2[i11] = yVar.s();
            yVar.e(2);
        }
        yVar.e((int) (jC - ((long) yVar.c())));
        return new p.a(jArrCopyOf, jArrCopyOf2);
    }

    public static com.applovin.exoplayer2.g.a a(i iVar, boolean z10) throws IOException {
        com.applovin.exoplayer2.g.a aVarA = new s().a(iVar, z10 ? null : com.applovin.exoplayer2.g.e.g.f6372a);
        if (aVarA == null || aVarA.a() == 0) {
            return null;
        }
        return aVarA;
    }

    public static boolean a(i iVar) throws IOException {
        com.applovin.exoplayer2.l.y yVar = new com.applovin.exoplayer2.l.y(4);
        iVar.d(yVar.d(), 0, 4);
        return yVar.o() == 1716281667;
    }

    public static boolean a(i iVar, a aVar) throws IOException {
        p pVarB;
        iVar.a();
        com.applovin.exoplayer2.l.x xVar = new com.applovin.exoplayer2.l.x(new byte[4]);
        iVar.d(xVar.f7688a, 0, 4);
        boolean zE = xVar.e();
        int iC = xVar.c(7);
        int iC2 = xVar.c(24) + 4;
        if (iC == 0) {
            pVarB = d(iVar);
        } else {
            p pVar = aVar.f6108a;
            if (pVar == null) {
                throw new IllegalArgumentException();
            }
            if (iC == 3) {
                pVarB = pVar.a(a(iVar, iC2));
            } else {
                if (iC != 4) {
                    if (iC == 6) {
                        pVarB = pVar.b(Collections.singletonList(c(iVar, iC2)));
                    } else {
                        iVar.b(iC2);
                    }
                    return zE;
                }
                pVarB = pVar.a(b(iVar, iC2));
            }
        }
        aVar.f6108a = pVarB;
        return zE;
    }

    public static com.applovin.exoplayer2.g.a b(i iVar, boolean z10) throws IOException {
        iVar.a();
        long jB = iVar.b();
        com.applovin.exoplayer2.g.a aVarA = a(iVar, z10);
        iVar.b((int) (iVar.b() - jB));
        return aVarA;
    }

    private static List<String> b(i iVar, int i10) throws IOException {
        com.applovin.exoplayer2.l.y yVar = new com.applovin.exoplayer2.l.y(i10);
        iVar.b(yVar.d(), 0, i10);
        yVar.e(4);
        return Arrays.asList(z.a(yVar, false, false).f6156b);
    }

    public static void b(i iVar) throws IOException {
        com.applovin.exoplayer2.l.y yVar = new com.applovin.exoplayer2.l.y(4);
        iVar.b(yVar.d(), 0, 4);
        if (yVar.o() != 1716281667) {
            throw ai.b("Failed to read FLAC stream marker.", null);
        }
    }

    public static int c(i iVar) throws IOException {
        iVar.a();
        com.applovin.exoplayer2.l.y yVar = new com.applovin.exoplayer2.l.y(2);
        iVar.d(yVar.d(), 0, 2);
        int i10 = yVar.i();
        int i11 = i10 >> 2;
        iVar.a();
        if (i11 == 16382) {
            return i10;
        }
        throw ai.b("First frame does not start with sync code.", null);
    }

    private static com.applovin.exoplayer2.g.c.a c(i iVar, int i10) throws IOException {
        com.applovin.exoplayer2.l.y yVar = new com.applovin.exoplayer2.l.y(i10);
        iVar.b(yVar.d(), 0, i10);
        yVar.e(4);
        int iQ = yVar.q();
        String strA = yVar.a(yVar.q(), Charsets.US_ASCII);
        String strF = yVar.f(yVar.q());
        int iQ2 = yVar.q();
        int iQ3 = yVar.q();
        int iQ4 = yVar.q();
        int iQ5 = yVar.q();
        int iQ6 = yVar.q();
        byte[] bArr = new byte[iQ6];
        yVar.a(bArr, 0, iQ6);
        return new com.applovin.exoplayer2.g.c.a(iQ, strA, strF, iQ2, iQ3, iQ4, iQ5, bArr);
    }

    private static p d(i iVar) throws IOException {
        byte[] bArr = new byte[38];
        iVar.b(bArr, 0, 38);
        return new p(bArr, 4);
    }
}
