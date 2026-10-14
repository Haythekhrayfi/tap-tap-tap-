package com.applovin.exoplayer2.e.g;

import android.util.Pair;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.exoplayer2.common.a.s;
import com.applovin.exoplayer2.common.base.Function;
import com.applovin.exoplayer2.e.r;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.u;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.v;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f5473a = ai.c("OpusHead");

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f5474a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f5475b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f5476c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f5477d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f5478e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final y f5479f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final y f5480g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f5481h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f5482i;

        public a(y yVar, y yVar2, boolean z10) throws com.applovin.exoplayer2.ai {
            this.f5480g = yVar;
            this.f5479f = yVar2;
            this.f5478e = z10;
            yVar2.d(12);
            this.f5474a = yVar2.w();
            yVar.d(12);
            this.f5482i = yVar.w();
            com.applovin.exoplayer2.e.k.a(yVar.q() == 1, "first_chunk must be 1");
            this.f5475b = -1;
        }

        public boolean a() {
            int i10 = this.f5475b + 1;
            this.f5475b = i10;
            if (i10 == this.f5474a) {
                return false;
            }
            this.f5477d = this.f5478e ? this.f5479f.y() : this.f5479f.o();
            if (this.f5475b == this.f5481h) {
                this.f5476c = this.f5480g.w();
                this.f5480g.e(4);
                int i11 = this.f5482i - 1;
                this.f5482i = i11;
                this.f5481h = i11 > 0 ? this.f5480g.w() - 1 : -1;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.applovin.exoplayer2.e.g.b$b, reason: collision with other inner class name */
    public interface InterfaceC0087b {
        int a();

        int b();

        int c();
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l[] f5483a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public v f5484b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f5485c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f5486d = 0;

        public c(int i10) {
            this.f5483a = new l[i10];
        }
    }

    public static final class d implements InterfaceC0087b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f5487a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f5488b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final y f5489c;

        public d(com.applovin.exoplayer2.e.g.a.b bVar, v vVar) {
            y yVar = bVar.f5472b;
            this.f5489c = yVar;
            yVar.d(12);
            int iW = yVar.w();
            if ("audio/raw".equals(vVar.f8198l)) {
                int iC = ai.c(vVar.A, vVar.f8211y);
                if (iW == 0 || iW % iC != 0) {
                    q.c("AtomParsers", "Audio sample size mismatch. stsd sample size: " + iC + ", stsz sample size: " + iW);
                    iW = iC;
                }
            }
            this.f5487a = iW == 0 ? -1 : iW;
            this.f5488b = yVar.w();
        }

        @Override // com.applovin.exoplayer2.e.g.b.InterfaceC0087b
        public int a() {
            return this.f5488b;
        }

        @Override // com.applovin.exoplayer2.e.g.b.InterfaceC0087b
        public int b() {
            return this.f5487a;
        }

        @Override // com.applovin.exoplayer2.e.g.b.InterfaceC0087b
        public int c() {
            int i10 = this.f5487a;
            return i10 == -1 ? this.f5489c.w() : i10;
        }
    }

    public static final class e implements InterfaceC0087b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final y f5490a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f5491b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f5492c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f5493d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f5494e;

        public e(com.applovin.exoplayer2.e.g.a.b bVar) {
            y yVar = bVar.f5472b;
            this.f5490a = yVar;
            yVar.d(12);
            this.f5492c = yVar.w() & 255;
            this.f5491b = yVar.w();
        }

        @Override // com.applovin.exoplayer2.e.g.b.InterfaceC0087b
        public int a() {
            return this.f5491b;
        }

        @Override // com.applovin.exoplayer2.e.g.b.InterfaceC0087b
        public int b() {
            return -1;
        }

        @Override // com.applovin.exoplayer2.e.g.b.InterfaceC0087b
        public int c() {
            int i10 = this.f5492c;
            if (i10 == 8) {
                return this.f5490a.h();
            }
            if (i10 == 16) {
                return this.f5490a.i();
            }
            int i11 = this.f5493d;
            this.f5493d = i11 + 1;
            if (i11 % 2 != 0) {
                return this.f5494e & 15;
            }
            int iH = this.f5490a.h();
            this.f5494e = iH;
            return (iH & 240) >> 4;
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f5495a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f5496b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f5497c;

        public f(int i10, long j10, int i11) {
            this.f5495a = i10;
            this.f5496b = j10;
            this.f5497c = i11;
        }
    }

    private static int a(int i10) {
        if (i10 == 1936684398) {
            return 1;
        }
        if (i10 == 1986618469) {
            return 2;
        }
        if (i10 == 1952807028 || i10 == 1935832172 || i10 == 1937072756 || i10 == 1668047728) {
            return 3;
        }
        return i10 == 1835365473 ? 5 : -1;
    }

    public static Pair<com.applovin.exoplayer2.g.a, com.applovin.exoplayer2.g.a> a(com.applovin.exoplayer2.e.g.a.b bVar) {
        y yVar = bVar.f5472b;
        yVar.d(8);
        com.applovin.exoplayer2.g.a aVarA = null;
        com.applovin.exoplayer2.g.a aVarC = null;
        while (yVar.a() >= 8) {
            int iC = yVar.c();
            int iQ = yVar.q();
            int iQ2 = yVar.q();
            if (iQ2 == 1835365473) {
                yVar.d(iC);
                aVarA = a(yVar, iC + iQ);
            } else if (iQ2 == 1936553057) {
                yVar.d(iC);
                aVarC = c(yVar, iC + iQ);
            }
            yVar.d(iC + iQ);
        }
        return Pair.create(aVarA, aVarC);
    }

    public static Pair<Integer, l> a(y yVar, int i10, int i11) throws com.applovin.exoplayer2.ai {
        int i12 = i10 + 8;
        int i13 = -1;
        String strF = null;
        Integer numValueOf = null;
        int i14 = 0;
        while (i12 - i10 < i11) {
            yVar.d(i12);
            int iQ = yVar.q();
            int iQ2 = yVar.q();
            if (iQ2 == 1718775137) {
                numValueOf = Integer.valueOf(yVar.q());
            } else if (iQ2 == 1935894637) {
                yVar.e(4);
                strF = yVar.f(4);
            } else if (iQ2 == 1935894633) {
                i13 = i12;
                i14 = iQ;
            }
            i12 += iQ;
        }
        if (!"cenc".equals(strF) && !"cbc1".equals(strF) && !"cens".equals(strF) && !"cbcs".equals(strF)) {
            return null;
        }
        com.applovin.exoplayer2.e.k.a(numValueOf != null, "frma atom is mandatory");
        com.applovin.exoplayer2.e.k.a(i13 != -1, "schi atom is mandatory");
        l lVarA = a(yVar, i13, i14, strF);
        com.applovin.exoplayer2.e.k.a(lVarA != null, "tenc atom is mandatory");
        return Pair.create(numValueOf, (l) ai.a(lVarA));
    }

    private static c a(y yVar, int i10, int i11, String str, com.applovin.exoplayer2.d.e eVar, boolean z10) throws com.applovin.exoplayer2.ai {
        int i12;
        yVar.d(12);
        int iQ = yVar.q();
        c cVar = new c(iQ);
        for (int i13 = 0; i13 < iQ; i13++) {
            int iC = yVar.c();
            int iQ2 = yVar.q();
            com.applovin.exoplayer2.e.k.a(iQ2 > 0, "childAtomSize must be positive");
            int iQ3 = yVar.q();
            if (iQ3 == 1635148593 || iQ3 == 1635148595 || iQ3 == 1701733238 || iQ3 == 1831958048 || iQ3 == 1836070006 || iQ3 == 1752589105 || iQ3 == 1751479857 || iQ3 == 1932670515 || iQ3 == 1211250227 || iQ3 == 1987063864 || iQ3 == 1987063865 || iQ3 == 1635135537 || iQ3 == 1685479798 || iQ3 == 1685479729 || iQ3 == 1685481573 || iQ3 == 1685481521) {
                i12 = iC;
                a(yVar, iQ3, i12, iQ2, i10, i11, eVar, cVar, i13);
            } else if (iQ3 == 1836069985 || iQ3 == 1701733217 || iQ3 == 1633889587 || iQ3 == 1700998451 || iQ3 == 1633889588 || iQ3 == 1685353315 || iQ3 == 1685353317 || iQ3 == 1685353320 || iQ3 == 1685353324 || iQ3 == 1685353336 || iQ3 == 1935764850 || iQ3 == 1935767394 || iQ3 == 1819304813 || iQ3 == 1936684916 || iQ3 == 1953984371 || iQ3 == 778924082 || iQ3 == 778924083 || iQ3 == 1835557169 || iQ3 == 1835560241 || iQ3 == 1634492771 || iQ3 == 1634492791 || iQ3 == 1970037111 || iQ3 == 1332770163 || iQ3 == 1716281667) {
                i12 = iC;
                a(yVar, iQ3, iC, iQ2, i10, str, z10, eVar, cVar, i13);
            } else {
                if (iQ3 == 1414810956 || iQ3 == 1954034535 || iQ3 == 2004251764 || iQ3 == 1937010800 || iQ3 == 1664495672) {
                    a(yVar, iQ3, iC, iQ2, i10, str, cVar);
                } else if (iQ3 == 1835365492) {
                    a(yVar, iQ3, iC, i10, cVar);
                } else if (iQ3 == 1667329389) {
                    cVar.f5484b = new v.a().a(i10).f("application/x-camera-motion").a();
                }
                i12 = iC;
            }
            yVar.d(i12 + iQ2);
        }
        return cVar;
    }

    private static k a(com.applovin.exoplayer2.e.g.a.C0086a c0086a, com.applovin.exoplayer2.e.g.a.b bVar, long j10, com.applovin.exoplayer2.d.e eVar, boolean z10, boolean z11) throws com.applovin.exoplayer2.ai {
        long[] jArr;
        long[] jArr2;
        com.applovin.exoplayer2.e.g.a.C0086a c0086aE;
        Pair<long[], long[]> pairB;
        com.applovin.exoplayer2.e.g.a.C0086a c0086a2 = (com.applovin.exoplayer2.e.g.a.C0086a) com.applovin.exoplayer2.l.a.b(c0086a.e(1835297121));
        int iA = a(d(((com.applovin.exoplayer2.e.g.a.b) com.applovin.exoplayer2.l.a.b(c0086a2.d(1751411826))).f5472b));
        if (iA == -1) {
            return null;
        }
        f fVarC = c(((com.applovin.exoplayer2.e.g.a.b) com.applovin.exoplayer2.l.a.b(c0086a.d(1953196132))).f5472b);
        long j11 = j10 == -9223372036854775807L ? fVarC.f5496b : j10;
        long jB = b(bVar.f5472b);
        long jD = j11 != -9223372036854775807L ? ai.d(j11, 1000000L, jB) : -9223372036854775807L;
        com.applovin.exoplayer2.e.g.a.C0086a c0086a3 = (com.applovin.exoplayer2.e.g.a.C0086a) com.applovin.exoplayer2.l.a.b(((com.applovin.exoplayer2.e.g.a.C0086a) com.applovin.exoplayer2.l.a.b(c0086a2.e(1835626086))).e(1937007212));
        Pair<Long, String> pairE = e(((com.applovin.exoplayer2.e.g.a.b) com.applovin.exoplayer2.l.a.b(c0086a2.d(1835296868))).f5472b);
        c cVarA = a(((com.applovin.exoplayer2.e.g.a.b) com.applovin.exoplayer2.l.a.b(c0086a3.d(1937011556))).f5472b, fVarC.f5495a, fVarC.f5497c, (String) pairE.second, eVar, z11);
        if (z10 || (c0086aE = c0086a.e(1701082227)) == null || (pairB = b(c0086aE)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            long[] jArr3 = (long[]) pairB.first;
            jArr2 = (long[]) pairB.second;
            jArr = jArr3;
        }
        if (cVarA.f5484b == null) {
            return null;
        }
        return new k(fVarC.f5495a, iA, ((Long) pairE.first).longValue(), jB, jD, cVarA.f5484b, cVarA.f5486d, cVarA.f5483a, cVarA.f5485c, jArr, jArr2);
    }

    private static l a(y yVar, int i10, int i11, String str) {
        int i12;
        int i13;
        int i14 = i10 + 8;
        while (true) {
            byte[] bArr = null;
            if (i14 - i10 >= i11) {
                return null;
            }
            yVar.d(i14);
            int iQ = yVar.q();
            if (yVar.q() == 1952804451) {
                int iA = com.applovin.exoplayer2.e.g.a.a(yVar.q());
                yVar.e(1);
                if (iA == 0) {
                    yVar.e(1);
                    i13 = 0;
                    i12 = 0;
                } else {
                    int iH = yVar.h();
                    i12 = iH & 15;
                    i13 = (iH & 240) >> 4;
                }
                boolean z10 = yVar.h() == 1;
                int iH2 = yVar.h();
                byte[] bArr2 = new byte[16];
                yVar.a(bArr2, 0, 16);
                if (z10 && iH2 == 0) {
                    int iH3 = yVar.h();
                    bArr = new byte[iH3];
                    yVar.a(bArr, 0, iH3);
                }
                return new l(z10, str, iH2, bArr2, i13, i12, bArr);
            }
            i14 += iQ;
        }
    }

    /* JADX WARN: Code duplicated, block: B:135:0x034a  */
    private static n a(k kVar, com.applovin.exoplayer2.e.g.a.C0086a c0086a, r rVar) throws com.applovin.exoplayer2.ai {
        InterfaceC0087b eVar;
        boolean z10;
        int iW;
        int iW2;
        boolean z11;
        int i10;
        k kVar2;
        int i11;
        int[] iArr;
        long[] jArr;
        int i12;
        int[] iArr2;
        long[] jArr2;
        long j10;
        int i13;
        int i14;
        int i15;
        int[] iArr3;
        int[] iArr4;
        com.applovin.exoplayer2.e.g.a.b bVarD = c0086a.d(1937011578);
        if (bVarD != null) {
            eVar = new d(bVarD, kVar.f5595f);
        } else {
            com.applovin.exoplayer2.e.g.a.b bVarD2 = c0086a.d(1937013298);
            if (bVarD2 == null) {
                throw com.applovin.exoplayer2.ai.b("Track has no sample table size information", null);
            }
            eVar = new e(bVarD2);
        }
        int iA = eVar.a();
        int iW3 = 0;
        if (iA == 0) {
            return new n(kVar, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        com.applovin.exoplayer2.e.g.a.b bVarD3 = c0086a.d(1937007471);
        if (bVarD3 == null) {
            bVarD3 = (com.applovin.exoplayer2.e.g.a.b) com.applovin.exoplayer2.l.a.b(c0086a.d(1668232756));
            z10 = true;
        } else {
            z10 = false;
        }
        y yVar = bVarD3.f5472b;
        y yVar2 = ((com.applovin.exoplayer2.e.g.a.b) com.applovin.exoplayer2.l.a.b(c0086a.d(1937011555))).f5472b;
        y yVar3 = ((com.applovin.exoplayer2.e.g.a.b) com.applovin.exoplayer2.l.a.b(c0086a.d(1937011827))).f5472b;
        com.applovin.exoplayer2.e.g.a.b bVarD4 = c0086a.d(1937011571);
        y yVar4 = bVarD4 != null ? bVarD4.f5472b : null;
        com.applovin.exoplayer2.e.g.a.b bVarD5 = c0086a.d(1668576371);
        y yVar5 = bVarD5 != null ? bVarD5.f5472b : null;
        a aVar = new a(yVar2, yVar, z10);
        yVar3.d(12);
        int iW4 = yVar3.w() - 1;
        int iW5 = yVar3.w();
        int iW6 = yVar3.w();
        if (yVar5 != null) {
            yVar5.d(12);
            iW = yVar5.w();
        } else {
            iW = 0;
        }
        if (yVar4 != null) {
            yVar4.d(12);
            iW3 = yVar4.w();
            if (iW3 > 0) {
                iW2 = yVar4.w() - 1;
            } else {
                yVar4 = null;
                iW2 = -1;
            }
        } else {
            iW2 = -1;
        }
        int iB = eVar.b();
        int i16 = iW2;
        String str = kVar.f5595f.f8198l;
        if (iB != -1 && ("audio/raw".equals(str) || "audio/g711-mlaw".equals(str) || "audio/g711-alaw".equals(str)) && iW4 == 0 && iW == 0 && iW3 == 0) {
            int i17 = aVar.f5474a;
            long[] jArr3 = new long[i17];
            int[] iArr5 = new int[i17];
            while (aVar.a()) {
                int i18 = aVar.f5475b;
                jArr3[i18] = aVar.f5477d;
                iArr5[i18] = aVar.f5476c;
            }
            com.applovin.exoplayer2.e.g.d.a aVarA = com.applovin.exoplayer2.e.g.d.a(iB, jArr3, iArr5, iW6);
            long[] jArr4 = aVarA.f5502a;
            int[] iArr6 = aVarA.f5503b;
            int i19 = aVarA.f5504c;
            long[] jArr5 = aVarA.f5505d;
            int[] iArr7 = aVarA.f5506e;
            long j11 = aVarA.f5507f;
            i12 = iA;
            jArr2 = jArr4;
            iArr = iArr6;
            i11 = i19;
            jArr = jArr5;
            iArr2 = iArr7;
            j10 = j11;
            kVar2 = kVar;
        } else {
            long[] jArrCopyOf = new long[iA];
            int[] iArrCopyOf = new int[iA];
            long[] jArrCopyOf2 = new long[iA];
            int i20 = iW3;
            int[] iArrCopyOf2 = new int[iA];
            int i21 = 0;
            long j12 = 0;
            long j13 = 0;
            int i22 = iW6;
            int i23 = 0;
            int iQ = 0;
            int iW7 = 0;
            int iW8 = iW5;
            int i24 = i20;
            int i25 = 0;
            int i26 = iW;
            int iW9 = i16;
            int i27 = iW4;
            while (i23 < iA) {
                boolean zA = true;
                while (i21 == 0) {
                    zA = aVar.a();
                    if (!zA) {
                        break;
                    }
                    j13 = aVar.f5477d;
                    i21 = aVar.f5476c;
                    iA = iA;
                    i22 = i22;
                }
                int i28 = i22;
                int i29 = iA;
                if (!zA) {
                    q.c("AtomParsers", "Unexpected end of chunk data");
                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i23);
                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i23);
                    jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i23);
                    iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i23);
                    iA = i23;
                    break;
                }
                if (yVar5 != null) {
                    while (iW7 == 0 && i26 > 0) {
                        iW7 = yVar5.w();
                        iQ = yVar5.q();
                        i26--;
                    }
                    iW7--;
                }
                int i30 = iQ;
                jArrCopyOf[i23] = j13;
                iArrCopyOf[i23] = eVar.c();
                if (iArrCopyOf[i23] > i25) {
                    i25 = iArrCopyOf[i23];
                }
                InterfaceC0087b interfaceC0087b = eVar;
                jArrCopyOf2[i23] = j12 + ((long) i30);
                iArrCopyOf2[i23] = yVar4 == null ? 1 : 0;
                if (i23 == iW9) {
                    iArrCopyOf2[i23] = 1;
                    i24--;
                    if (i24 > 0) {
                        iW9 = ((y) com.applovin.exoplayer2.l.a.b(yVar4)).w() - 1;
                    }
                }
                int iQ2 = i28;
                int[] iArr8 = iArrCopyOf2;
                j12 += (long) iQ2;
                iW8--;
                if (iW8 != 0 || i27 <= 0) {
                    i13 = i27;
                } else {
                    i13 = i27 - 1;
                    iW8 = yVar3.w();
                    iQ2 = yVar3.q();
                }
                j13 += (long) iArrCopyOf[i23];
                i21--;
                i23++;
                i22 = iQ2;
                i27 = i13;
                iQ = i30;
                eVar = interfaceC0087b;
                iA = i29;
                iArrCopyOf2 = iArr8;
            }
            int i31 = i21;
            long j14 = j12 + ((long) iQ);
            if (yVar5 == null) {
                z11 = true;
                break;
            }
            while (true) {
                if (i26 <= 0) {
                    z11 = true;
                    break;
                }
                if (yVar5.w() != 0) {
                    z11 = false;
                    break;
                }
                yVar5.q();
                i26--;
            }
            if (i24 == 0 && iW8 == 0 && i31 == 0 && i27 == 0) {
                i10 = iW7;
                if (i10 == 0 && z11) {
                    kVar2 = kVar;
                }
                i11 = i25;
                iArr = iArrCopyOf;
                jArr = jArrCopyOf2;
                i12 = iA;
                iArr2 = iArrCopyOf2;
                jArr2 = jArrCopyOf;
                j10 = j14;
            } else {
                i10 = iW7;
            }
            StringBuilder sbA = defpackage.a.a("Inconsistent stbl box for track ");
            kVar2 = kVar;
            v1.b.a(sbA, kVar2.f5590a, ": remainingSynchronizationSamples ", i24, ", remainingSamplesAtTimestampDelta ");
            v1.b.a(sbA, iW8, ", remainingSamplesInChunk ", i31, ", remainingTimestampDeltaChanges ");
            sbA.append(i27);
            sbA.append(", remainingSamplesAtTimestampOffset ");
            sbA.append(i10);
            sbA.append(!z11 ? ", ctts invalid" : "");
            q.c("AtomParsers", sbA.toString());
            i11 = i25;
            iArr = iArrCopyOf;
            jArr = jArrCopyOf2;
            i12 = iA;
            iArr2 = iArrCopyOf2;
            jArr2 = jArrCopyOf;
            j10 = j14;
        }
        long jD = ai.d(j10, 1000000L, kVar2.f5592c);
        long[] jArr6 = kVar2.f5597h;
        if (jArr6 == null) {
            ai.a(jArr, 1000000L, kVar2.f5592c);
            return new n(kVar, jArr2, iArr, i11, jArr, iArr2, jD);
        }
        if (jArr6.length == 1 && kVar2.f5591b == 1 && jArr.length >= 2) {
            long j15 = ((long[]) com.applovin.exoplayer2.l.a.b(kVar2.f5598i))[0];
            long jD2 = j15 + ai.d(kVar2.f5597h[0], kVar2.f5592c, kVar2.f5593d);
            if (a(jArr, j10, j15, jD2)) {
                long jD3 = ai.d(j15 - jArr[0], kVar2.f5595f.f8212z, kVar2.f5592c);
                i14 = i12;
                long jD4 = ai.d(j10 - jD2, kVar2.f5595f.f8212z, kVar2.f5592c);
                if ((jD3 != 0 || jD4 != 0) && jD3 <= 2147483647L && jD4 <= 2147483647L) {
                    rVar.f6127a = (int) jD3;
                    rVar.f6128b = (int) jD4;
                    ai.a(jArr, 1000000L, kVar2.f5592c);
                    return new n(kVar, jArr2, iArr, i11, jArr, iArr2, ai.d(kVar2.f5597h[0], 1000000L, kVar2.f5593d));
                }
            } else {
                i14 = i12;
            }
        } else {
            i14 = i12;
        }
        long[] jArr7 = kVar2.f5597h;
        if (jArr7.length == 1 && jArr7[0] == 0) {
            long j16 = ((long[]) com.applovin.exoplayer2.l.a.b(kVar2.f5598i))[0];
            for (int i32 = 0; i32 < jArr.length; i32++) {
                jArr[i32] = ai.d(jArr[i32] - j16, 1000000L, kVar2.f5592c);
            }
            return new n(kVar, jArr2, iArr, i11, jArr, iArr2, ai.d(j10 - j16, 1000000L, kVar2.f5592c));
        }
        boolean z12 = kVar2.f5591b == 1;
        int[] iArr9 = new int[jArr7.length];
        int[] iArr10 = new int[jArr7.length];
        long[] jArr8 = (long[]) com.applovin.exoplayer2.l.a.b(kVar2.f5598i);
        int i33 = 0;
        boolean z13 = false;
        int i34 = 0;
        int i35 = 0;
        while (true) {
            long[] jArr9 = kVar2.f5597h;
            i15 = i11;
            iArr3 = iArr;
            if (i33 >= jArr9.length) {
                break;
            }
            long j17 = jArr8[i33];
            if (j17 != -1) {
                int i36 = i35;
                boolean z14 = z13;
                int i37 = i34;
                long jD5 = ai.d(jArr9[i33], kVar2.f5592c, kVar2.f5593d);
                iArr9[i33] = ai.a(jArr, j17, true, true);
                iArr10[i33] = ai.b(jArr, j17 + jD5, z12, false);
                while (iArr9[i33] < iArr10[i33] && (iArr2[iArr9[i33]] & 1) == 0) {
                    iArr9[i33] = iArr9[i33] + 1;
                }
                int i38 = (iArr10[i33] - iArr9[i33]) + i37;
                boolean z15 = z14 | (i36 != iArr9[i33]);
                i34 = i38;
                i35 = iArr10[i33];
                z13 = z15;
            } else {
                i34 = i34;
            }
            i33++;
            i11 = i15;
            iArr = iArr3;
        }
        int i39 = 0;
        boolean z16 = z13 | (i34 != i14);
        long[] jArr10 = z16 ? new long[i34] : jArr2;
        int[] iArr11 = z16 ? new int[i34] : iArr3;
        int i40 = z16 ? 0 : i15;
        int[] iArr12 = z16 ? new int[i34] : iArr2;
        long[] jArr11 = new long[i34];
        int i41 = i40;
        long j18 = 0;
        int i42 = 0;
        while (i39 < kVar2.f5597h.length) {
            long j19 = kVar2.f5598i[i39];
            int i43 = iArr9[i39];
            int[] iArr13 = iArr9;
            int i44 = iArr10[i39];
            int[] iArr14 = iArr10;
            if (z16) {
                int i45 = i44 - i43;
                System.arraycopy(jArr2, i43, jArr10, i42, i45);
                iArr4 = iArr3;
                System.arraycopy(iArr4, i43, iArr11, i42, i45);
                System.arraycopy(iArr2, i43, iArr12, i42, i45);
            } else {
                iArr4 = iArr3;
            }
            int i46 = i41;
            while (i43 < i44) {
                int i47 = i39;
                int[] iArr15 = iArr4;
                long[] jArr12 = jArr;
                int[] iArr16 = iArr2;
                long j20 = j18;
                jArr11[i42] = ai.d(j18, 1000000L, kVar2.f5593d) + ai.d(Math.max(0L, jArr[i43] - j19), 1000000L, kVar2.f5592c);
                if (z16 && iArr11[i42] > i46) {
                    i46 = iArr15[i43];
                }
                i42++;
                i43++;
                iArr4 = iArr15;
                i39 = i47;
                j18 = j20;
                jArr = jArr12;
                iArr2 = iArr16;
            }
            int i48 = i39;
            j18 += kVar2.f5597h[i48];
            i39 = i48 + 1;
            iArr3 = iArr4;
            i41 = i46;
            jArr = jArr;
            iArr2 = iArr2;
            iArr9 = iArr13;
            iArr10 = iArr14;
            jArr2 = jArr2;
        }
        return new n(kVar, jArr10, iArr11, i41, jArr11, iArr12, ai.d(j18, 1000000L, kVar2.f5593d));
    }

    public static com.applovin.exoplayer2.g.a a(com.applovin.exoplayer2.e.g.a.C0086a c0086a) {
        com.applovin.exoplayer2.e.g.a.b bVarD = c0086a.d(1751411826);
        com.applovin.exoplayer2.e.g.a.b bVarD2 = c0086a.d(1801812339);
        com.applovin.exoplayer2.e.g.a.b bVarD3 = c0086a.d(1768715124);
        if (bVarD == null || bVarD2 == null || bVarD3 == null || d(bVarD.f5472b) != 1835299937) {
            return null;
        }
        y yVar = bVarD2.f5472b;
        yVar.d(12);
        int iQ = yVar.q();
        String[] strArr = new String[iQ];
        for (int i10 = 0; i10 < iQ; i10++) {
            int iQ2 = yVar.q();
            yVar.e(4);
            strArr[i10] = yVar.f(iQ2 - 8);
        }
        y yVar2 = bVarD3.f5472b;
        yVar2.d(8);
        ArrayList arrayList = new ArrayList();
        while (yVar2.a() > 8) {
            int iC = yVar2.c();
            int iQ3 = yVar2.q();
            int iQ4 = yVar2.q() - 1;
            if (iQ4 < 0 || iQ4 >= iQ) {
                q.c("AtomParsers", "Skipped metadata with unknown key index: " + iQ4);
            } else {
                com.applovin.exoplayer2.g.f.a aVarA = com.applovin.exoplayer2.e.g.f.a(yVar2, iC + iQ3, strArr[iQ4]);
                if (aVarA != null) {
                    arrayList.add(aVarA);
                }
            }
            yVar2.d(iC + iQ3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new com.applovin.exoplayer2.g.a(arrayList);
    }

    private static com.applovin.exoplayer2.g.a a(y yVar, int i10) {
        yVar.e(8);
        a(yVar);
        while (yVar.c() < i10) {
            int iC = yVar.c();
            int iQ = yVar.q();
            if (yVar.q() == 1768715124) {
                yVar.d(iC);
                return b(yVar, iC + iQ);
            }
            yVar.d(iC + iQ);
        }
        return null;
    }

    public static List<n> a(com.applovin.exoplayer2.e.g.a.C0086a c0086a, r rVar, long j10, com.applovin.exoplayer2.d.e eVar, boolean z10, boolean z11, Function<k, k> function) throws com.applovin.exoplayer2.ai {
        k kVarApply;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < c0086a.f5471d.size(); i10++) {
            com.applovin.exoplayer2.e.g.a.C0086a c0086a2 = c0086a.f5471d.get(i10);
            if (c0086a2.f5468a == 1953653099 && (kVarApply = function.apply(a(c0086a2, (com.applovin.exoplayer2.e.g.a.b) com.applovin.exoplayer2.l.a.b(c0086a.d(1836476516)), j10, eVar, z10, z11))) != null) {
                arrayList.add(a(kVarApply, (com.applovin.exoplayer2.e.g.a.C0086a) com.applovin.exoplayer2.l.a.b(((com.applovin.exoplayer2.e.g.a.C0086a) com.applovin.exoplayer2.l.a.b(((com.applovin.exoplayer2.e.g.a.C0086a) com.applovin.exoplayer2.l.a.b(c0086a2.e(1835297121))).e(1835626086))).e(1937007212)), rVar));
            }
        }
        return arrayList;
    }

    public static void a(y yVar) {
        int iC = yVar.c();
        yVar.e(4);
        if (yVar.q() != 1751411826) {
            iC += 4;
        }
        yVar.d(iC);
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0198 A[PHI: r10
  0x0198: PHI (r10v15 int) = (r10v14 int), (r10v16 int) binds: [B:100:0x018c, B:103:0x0191] A[DONT_GENERATE, DONT_INLINE]] */
    private static void a(y yVar, int i10, int i11, int i12, int i13, int i14, com.applovin.exoplayer2.d.e eVar, c cVar, int i15) throws com.applovin.exoplayer2.ai {
        String str;
        com.applovin.exoplayer2.d.e eVar2;
        List<byte[]> list;
        String str2;
        y yVar2 = yVar;
        int i16 = i11;
        int i17 = i12;
        com.applovin.exoplayer2.d.e eVarA = eVar;
        yVar2.d(i16 + 8 + 8);
        yVar2.e(16);
        int i18 = yVar.i();
        int i19 = yVar.i();
        yVar2.e(50);
        int iC = yVar.c();
        int iIntValue = i10;
        if (iIntValue == 1701733238) {
            Pair<Integer, l> pairC = c(yVar2, i16, i17);
            if (pairC != null) {
                iIntValue = ((Integer) pairC.first).intValue();
                eVarA = eVarA == null ? null : eVarA.a(((l) pairC.second).f5602b);
                cVar.f5483a[i15] = (l) pairC.second;
            }
            yVar2.d(iC);
        }
        if (iIntValue == 1831958048) {
            str = "video/mpeg";
        } else {
            str = iIntValue == 1211250227 ? "video/3gpp" : null;
        }
        int i20 = -1;
        float fD = 1.0f;
        String str3 = null;
        List<byte[]> listA = null;
        byte[] bArrD = null;
        com.applovin.exoplayer2.m.b bVar = null;
        boolean z10 = false;
        while (true) {
            if (iC - i16 >= i17) {
                eVar2 = eVarA;
                list = listA;
                break;
            }
            yVar2.d(iC);
            int iC2 = yVar.c();
            eVar2 = eVarA;
            int iQ = yVar.q();
            if (iQ == 0) {
                list = listA;
                if (yVar.c() - i16 == i17) {
                    break;
                }
            } else {
                list = listA;
            }
            com.applovin.exoplayer2.e.k.a(iQ > 0, "childAtomSize must be positive");
            int iQ2 = yVar.q();
            if (iQ2 == 1635148611) {
                com.applovin.exoplayer2.e.k.a(str == null, (String) null);
                yVar2.d(iC2 + 8);
                com.applovin.exoplayer2.m.a aVarA = com.applovin.exoplayer2.m.a.a(yVar);
                listA = aVarA.f7706a;
                cVar.f5485c = aVarA.f7707b;
                if (!z10) {
                    fD = aVarA.f7710e;
                }
                str3 = aVarA.f7711f;
                str2 = "video/avc";
            } else if (iQ2 == 1752589123) {
                com.applovin.exoplayer2.e.k.a(str == null, (String) null);
                yVar2.d(iC2 + 8);
                com.applovin.exoplayer2.m.f fVarA = com.applovin.exoplayer2.m.f.a(yVar);
                listA = fVarA.f7793a;
                cVar.f5485c = fVarA.f7794b;
                str3 = fVarA.f7795c;
                str2 = "video/hevc";
            } else {
                if (iQ2 == 1685480259 || iQ2 == 1685485123) {
                    com.applovin.exoplayer2.m.c cVarA = com.applovin.exoplayer2.m.c.a(yVar);
                    if (cVarA != null) {
                        str2 = "video/dolby-vision";
                        listA = list;
                        str3 = cVarA.f7768c;
                    } else {
                        listA = list;
                    }
                } else {
                    if (iQ2 == 1987076931) {
                        com.applovin.exoplayer2.e.k.a(str == null, (String) null);
                        str2 = iIntValue == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                    } else if (iQ2 == 1635135811) {
                        com.applovin.exoplayer2.e.k.a(str == null, (String) null);
                        str2 = "video/av01";
                    } else {
                        if (iQ2 == 1681012275) {
                            com.applovin.exoplayer2.e.k.a(str == null, (String) null);
                            str = "video/3gpp";
                        } else if (iQ2 == 1702061171) {
                            com.applovin.exoplayer2.e.k.a(str == null, (String) null);
                            Pair<String, byte[]> pairE = e(yVar2, iC2);
                            str = (String) pairE.first;
                            byte[] bArr = (byte[]) pairE.second;
                            if (bArr != null) {
                                listA = s.a(bArr);
                            }
                        } else if (iQ2 == 1885434736) {
                            listA = list;
                            fD = d(yVar2, iC2);
                            z10 = true;
                        } else if (iQ2 == 1937126244) {
                            bArrD = d(yVar2, iC2, iQ);
                        } else if (iQ2 == 1936995172) {
                            int iH = yVar.h();
                            yVar2.e(3);
                            if (iH == 0) {
                                int iH2 = yVar.h();
                                if (iH2 != 0) {
                                    int i21 = 1;
                                    if (iH2 == 1) {
                                        i20 = i21;
                                    } else if (iH2 != 2) {
                                        i21 = 3;
                                        if (iH2 == 3) {
                                            i20 = i21;
                                        }
                                    } else {
                                        i20 = 2;
                                    }
                                } else {
                                    i20 = 0;
                                }
                            }
                        } else if (iQ2 == 1668246642) {
                            int iQ3 = yVar.q();
                            boolean z11 = iQ3 == 1852009592;
                            if (z11 || iQ3 == 1852009571) {
                                int i22 = yVar.i();
                                int i23 = yVar.i();
                                yVar2.e(2);
                                com.applovin.exoplayer2.m.b bVar2 = new com.applovin.exoplayer2.m.b(com.applovin.exoplayer2.m.b.a(i22), z11 && (yVar.h() & 128) != 0 ? 1 : 2, com.applovin.exoplayer2.m.b.b(i23), null);
                                listA = list;
                                bVar = bVar2;
                            } else {
                                StringBuilder sbA = defpackage.a.a("Unsupported color type: ");
                                sbA.append(com.applovin.exoplayer2.e.g.a.c(iQ3));
                                q.c("AtomParsers", sbA.toString());
                            }
                        }
                        listA = list;
                    }
                    listA = list;
                }
                iC += iQ;
                yVar2 = yVar;
                i16 = i11;
                i17 = i12;
                eVarA = eVar2;
            }
            str = str2;
            iC += iQ;
            yVar2 = yVar;
            i16 = i11;
            i17 = i12;
            eVarA = eVar2;
        }
        if (str == null) {
            return;
        }
        cVar.f5484b = new v.a().a(i13).f(str).d(str3).g(i18).h(i19).b(fD).i(i14).a(bArrD).j(i20).a(list).a(eVar2).a(bVar).a();
    }

    private static void a(y yVar, int i10, int i11, int i12, int i13, String str, c cVar) {
        yVar.d(i11 + 8 + 8);
        String str2 = "application/ttml+xml";
        s sVarA = null;
        long j10 = RecyclerView.FOREVER_NS;
        if (i10 != 1414810956) {
            if (i10 == 1954034535) {
                int i14 = (i12 - 8) - 8;
                byte[] bArr = new byte[i14];
                yVar.a(bArr, 0, i14);
                sVarA = s.a(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i10 == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i10 == 1937010800) {
                j10 = 0;
            } else {
                if (i10 != 1664495672) {
                    throw new IllegalStateException();
                }
                cVar.f5486d = 1;
                str2 = "application/x-mp4-cea-608";
            }
        }
        cVar.f5484b = new v.a().a(i13).f(str2).c(str).a(j10).a(sVarA).a();
    }

    /* JADX WARN: Code duplicated, block: B:102:0x015a  */
    /* JADX WARN: Code duplicated, block: B:105:0x0169  */
    /* JADX WARN: Code duplicated, block: B:108:0x0184  */
    /* JADX WARN: Code duplicated, block: B:138:0x0286  */
    /* JADX WARN: Code duplicated, block: B:140:0x0290  */
    /* JADX WARN: Code duplicated, block: B:141:0x0292  */
    /* JADX WARN: Code duplicated, block: B:144:0x0299  */
    /* JADX WARN: Code duplicated, block: B:146:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:148:0x02af  */
    /* JADX WARN: Code duplicated, block: B:161:0x02bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x02bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0150  */
    private static void a(y yVar, int i10, int i11, int i12, int i13, String str, boolean z10, com.applovin.exoplayer2.d.e eVar, c cVar, int i14) throws com.applovin.exoplayer2.ai {
        int i15;
        int iU;
        int iW;
        com.applovin.exoplayer2.d.e eVarA;
        int i16;
        String str2;
        String str3;
        List<byte[]> listA;
        int iQ;
        int iQ2;
        int iB;
        byte[] bArr;
        boolean z11;
        List<byte[]> listB;
        v vVarA;
        int i17 = i11;
        int i18 = i12;
        yVar.d(i17 + 8 + 8);
        if (z10) {
            i15 = yVar.i();
            yVar.e(6);
        } else {
            yVar.e(8);
            i15 = 0;
        }
        boolean z12 = true;
        if (i15 == 0 || i15 == 1) {
            int i19 = yVar.i();
            yVar.e(6);
            iU = yVar.u();
            if (i15 == 1) {
                yVar.e(16);
            }
            iW = i19;
        } else {
            if (i15 != 2) {
                return;
            }
            yVar.e(16);
            iU = (int) Math.round(yVar.A());
            iW = yVar.w();
            yVar.e(20);
        }
        int iC = yVar.c();
        int iIntValue = i10;
        if (iIntValue == 1701733217) {
            Pair<Integer, l> pairC = c(yVar, i17, i18);
            if (pairC != null) {
                iIntValue = ((Integer) pairC.first).intValue();
                eVarA = eVar == null ? null : eVar.a(((l) pairC.second).f5602b);
                cVar.f5483a[i14] = (l) pairC.second;
            } else {
                eVarA = eVar;
            }
            yVar.d(iC);
        } else {
            eVarA = eVar;
        }
        String str4 = "audio/raw";
        if (iIntValue == 1633889587) {
            str4 = "audio/ac3";
        } else if (iIntValue == 1700998451) {
            str4 = "audio/eac3";
        } else if (iIntValue == 1633889588) {
            str4 = "audio/ac4";
        } else if (iIntValue == 1685353315) {
            str4 = "audio/vnd.dts";
        } else if (iIntValue == 1685353320 || iIntValue == 1685353324) {
            str4 = "audio/vnd.dts.hd";
        } else if (iIntValue == 1685353317) {
            str4 = "audio/vnd.dts.hd;profile=lbr";
        } else if (iIntValue == 1685353336) {
            str4 = "audio/vnd.dts.uhd;profile=p2";
        } else if (iIntValue == 1935764850) {
            str4 = "audio/3gpp";
        } else {
            if (iIntValue != 1935767394) {
                if (iIntValue == 1819304813 || iIntValue == 1936684916) {
                    i16 = 2;
                } else if (iIntValue == 1953984371) {
                    i16 = 268435456;
                } else if (iIntValue == 778924082 || iIntValue == 778924083) {
                    str4 = "audio/mpeg";
                } else if (iIntValue == 1835557169) {
                    str4 = "audio/mha1";
                } else if (iIntValue == 1835560241) {
                    str4 = "audio/mhm1";
                } else if (iIntValue == 1634492771) {
                    str4 = "audio/alac";
                } else if (iIntValue == 1634492791) {
                    str4 = "audio/g711-alaw";
                } else if (iIntValue == 1970037111) {
                    str4 = "audio/g711-mlaw";
                } else if (iIntValue == 1332770163) {
                    str4 = "audio/opus";
                } else if (iIntValue == 1716281667) {
                    str4 = "audio/flac";
                } else {
                    i16 = -1;
                    str4 = null;
                }
                str2 = str4;
                str3 = null;
                listA = null;
                while (iC - i17 < i18) {
                    yVar.d(iC);
                    iQ = yVar.q();
                    if (iQ <= 0) {
                        z12 = false;
                    }
                    com.applovin.exoplayer2.e.k.a(z12, "childAtomSize must be positive");
                    iQ2 = yVar.q();
                    if (iQ2 == 1835557187) {
                        int i20 = iQ - 13;
                        byte[] bArr2 = new byte[i20];
                        yVar.d(iC + 13);
                        yVar.a(bArr2, 0, i20);
                        listB = s.a(bArr2);
                    } else {
                        if (iQ2 != 1702061171 || (z10 && iQ2 == 2002876005)) {
                            z12 = true;
                            if (iQ2 == 1702061171) {
                                iB = iC;
                            } else {
                                iB = b(yVar, iC, iQ);
                            }
                            if (iB != -1) {
                                Pair<String, byte[]> pairE = e(yVar, iB);
                                str2 = (String) pairE.first;
                                bArr = (byte[]) pairE.second;
                                if (bArr != null) {
                                    if ("audio/mp4a-latm".equals(str2)) {
                                        com.applovin.exoplayer2.b.a.C0073a c0073aA = com.applovin.exoplayer2.b.a.a(bArr);
                                        iU = c0073aA.f4382a;
                                        iW = c0073aA.f4383b;
                                        str3 = c0073aA.f4384c;
                                    }
                                    listA = s.a(bArr);
                                }
                            }
                        } else {
                            if (iQ2 == 1684103987) {
                                yVar.d(iC + 8);
                                vVarA = com.applovin.exoplayer2.b.b.a(yVar, Integer.toString(i13), str, eVarA);
                            } else if (iQ2 == 1684366131) {
                                yVar.d(iC + 8);
                                vVarA = com.applovin.exoplayer2.b.b.b(yVar, Integer.toString(i13), str, eVarA);
                            } else if (iQ2 == 1684103988) {
                                yVar.d(iC + 8);
                                vVarA = com.applovin.exoplayer2.b.c.a(yVar, Integer.toString(i13), str, eVarA);
                            } else if (iQ2 == 1684305011) {
                                vVarA = new v.a().a(i13).f(str2).k(iW).l(iU).a(eVarA).c(str).a();
                            } else if (iQ2 == 1682927731) {
                                int i21 = iQ - 8;
                                byte[] bArr3 = f5473a;
                                byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + i21);
                                yVar.d(iC + 8);
                                yVar.a(bArrCopyOf, bArr3.length, i21);
                                listB = com.applovin.exoplayer2.b.s.b(bArrCopyOf);
                            } else if (iQ2 == 1684425825) {
                                int i22 = iQ - 12;
                                byte[] bArr4 = new byte[i22 + 4];
                                bArr4[0] = 102;
                                z12 = true;
                                bArr4[1] = 76;
                                bArr4[2] = 97;
                                bArr4[3] = 67;
                                yVar.d(iC + 12);
                                yVar.a(bArr4, 4, i22);
                                listA = s.a(bArr4);
                            } else {
                                z12 = true;
                                if (iQ2 == 1634492771) {
                                    int i23 = iQ - 12;
                                    byte[] bArr5 = new byte[i23];
                                    yVar.d(iC + 12);
                                    yVar.a(bArr5, 0, i23);
                                    Pair<Integer, Integer> pairA = com.applovin.exoplayer2.l.e.a(bArr5);
                                    int iIntValue2 = ((Integer) pairA.first).intValue();
                                    int iIntValue3 = ((Integer) pairA.second).intValue();
                                    listA = s.a(bArr5);
                                    iU = iIntValue2;
                                    iW = iIntValue3;
                                } else {
                                    z11 = false;
                                }
                            }
                            cVar.f5484b = vVarA;
                            z11 = false;
                            z12 = true;
                        }
                        iC += iQ;
                        i17 = i11;
                        i18 = i12;
                    }
                    listA = listB;
                    z12 = true;
                    iC += iQ;
                    i17 = i11;
                    i18 = i12;
                }
                if (cVar.f5484b == null || str2 == null) {
                }
                cVar.f5484b = new v.a().a(i13).f(str2).d(str3).k(iW).l(iU).m(i16).a(listA).a(eVarA).c(str).a();
                return;
            }
            str4 = "audio/amr-wb";
        }
        i16 = -1;
        str2 = str4;
        str3 = null;
        listA = null;
        while (iC - i17 < i18) {
            yVar.d(iC);
            iQ = yVar.q();
            if (iQ <= 0) {
                z12 = false;
            }
            com.applovin.exoplayer2.e.k.a(z12, "childAtomSize must be positive");
            iQ2 = yVar.q();
            if (iQ2 == 1835557187) {
                int i24 = iQ - 13;
                byte[] bArr6 = new byte[i24];
                yVar.d(iC + 13);
                yVar.a(bArr6, 0, i24);
                listB = s.a(bArr6);
            } else {
                if (iQ2 != 1702061171) {
                    z12 = true;
                    if (iQ2 == 1702061171) {
                        iB = iC;
                    } else {
                        iB = b(yVar, iC, iQ);
                    }
                    if (iB != -1) {
                        Pair<String, byte[]> pairE2 = e(yVar, iB);
                        str2 = (String) pairE2.first;
                        bArr = (byte[]) pairE2.second;
                        if (bArr != null) {
                            if ("audio/mp4a-latm".equals(str2)) {
                                com.applovin.exoplayer2.b.a.C0073a c0073aA2 = com.applovin.exoplayer2.b.a.a(bArr);
                                iU = c0073aA2.f4382a;
                                iW = c0073aA2.f4383b;
                                str3 = c0073aA2.f4384c;
                            }
                            listA = s.a(bArr);
                        }
                    }
                } else {
                    z12 = true;
                    if (iQ2 == 1702061171) {
                        iB = iC;
                    } else {
                        iB = b(yVar, iC, iQ);
                    }
                    if (iB != -1) {
                        Pair<String, byte[]> pairE3 = e(yVar, iB);
                        str2 = (String) pairE3.first;
                        bArr = (byte[]) pairE3.second;
                        if (bArr != null) {
                            if ("audio/mp4a-latm".equals(str2)) {
                                com.applovin.exoplayer2.b.a.C0073a c0073aA3 = com.applovin.exoplayer2.b.a.a(bArr);
                                iU = c0073aA3.f4382a;
                                iW = c0073aA3.f4383b;
                                str3 = c0073aA3.f4384c;
                            }
                            listA = s.a(bArr);
                        }
                    }
                }
                iC += iQ;
                i17 = i11;
                i18 = i12;
            }
            listA = listB;
            z12 = true;
            iC += iQ;
            i17 = i11;
            i18 = i12;
        }
        if (cVar.f5484b == null) {
        }
    }

    private static void a(y yVar, int i10, int i11, int i12, c cVar) {
        yVar.d(i11 + 8 + 8);
        if (i10 == 1835365492) {
            yVar.B();
            String strB = yVar.B();
            if (strB != null) {
                cVar.f5484b = new v.a().a(i12).f(strB).a();
            }
        }
    }

    private static boolean a(long[] jArr, long j10, long j11, long j12) {
        int length = jArr.length - 1;
        return jArr[0] <= j11 && j11 < jArr[ai.a(4, 0, length)] && jArr[ai.a(jArr.length - 4, 0, length)] < j12 && j12 <= j10;
    }

    private static int b(y yVar, int i10, int i11) throws com.applovin.exoplayer2.ai {
        int iC = yVar.c();
        while (iC - i10 < i11) {
            yVar.d(iC);
            int iQ = yVar.q();
            com.applovin.exoplayer2.e.k.a(iQ > 0, "childAtomSize must be positive");
            if (yVar.q() == 1702061171) {
                return iC;
            }
            iC += iQ;
        }
        return -1;
    }

    private static long b(y yVar) {
        yVar.d(8);
        yVar.e(com.applovin.exoplayer2.e.g.a.a(yVar.q()) != 0 ? 16 : 8);
        return yVar.o();
    }

    private static Pair<long[], long[]> b(com.applovin.exoplayer2.e.g.a.C0086a c0086a) {
        com.applovin.exoplayer2.e.g.a.b bVarD = c0086a.d(1701606260);
        if (bVarD == null) {
            return null;
        }
        y yVar = bVarD.f5472b;
        yVar.d(8);
        int iA = com.applovin.exoplayer2.e.g.a.a(yVar.q());
        int iW = yVar.w();
        long[] jArr = new long[iW];
        long[] jArr2 = new long[iW];
        for (int i10 = 0; i10 < iW; i10++) {
            jArr[i10] = iA == 1 ? yVar.y() : yVar.o();
            jArr2[i10] = iA == 1 ? yVar.s() : yVar.q();
            if (yVar.k() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            yVar.e(2);
        }
        return Pair.create(jArr, jArr2);
    }

    private static com.applovin.exoplayer2.g.a b(y yVar, int i10) {
        yVar.e(8);
        ArrayList arrayList = new ArrayList();
        while (yVar.c() < i10) {
            com.applovin.exoplayer2.g.a.InterfaceC0092a interfaceC0092aA = com.applovin.exoplayer2.e.g.f.a(yVar);
            if (interfaceC0092aA != null) {
                arrayList.add(interfaceC0092aA);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new com.applovin.exoplayer2.g.a(arrayList);
    }

    private static Pair<Integer, l> c(y yVar, int i10, int i11) throws com.applovin.exoplayer2.ai {
        Pair<Integer, l> pairA;
        int iC = yVar.c();
        while (iC - i10 < i11) {
            yVar.d(iC);
            int iQ = yVar.q();
            com.applovin.exoplayer2.e.k.a(iQ > 0, "childAtomSize must be positive");
            if (yVar.q() == 1936289382 && (pairA = a(yVar, iC, iQ)) != null) {
                return pairA;
            }
            iC += iQ;
        }
        return null;
    }

    private static f c(y yVar) {
        boolean z10;
        yVar.d(8);
        int iA = com.applovin.exoplayer2.e.g.a.a(yVar.q());
        yVar.e(iA == 0 ? 8 : 16);
        int iQ = yVar.q();
        yVar.e(4);
        int iC = yVar.c();
        int i10 = iA == 0 ? 4 : 8;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 >= i10) {
                z10 = true;
                break;
            }
            if (yVar.d()[iC + i12] != -1) {
                z10 = false;
                break;
            }
            i12++;
        }
        long j10 = -9223372036854775807L;
        if (z10) {
            yVar.e(i10);
        } else {
            long jO = iA == 0 ? yVar.o() : yVar.y();
            if (jO != 0) {
                j10 = jO;
            }
        }
        yVar.e(16);
        int iQ2 = yVar.q();
        int iQ3 = yVar.q();
        yVar.e(4);
        int iQ4 = yVar.q();
        int iQ5 = yVar.q();
        if (iQ2 == 0 && iQ3 == 65536 && iQ4 == -65536 && iQ5 == 0) {
            i11 = 90;
        } else if (iQ2 == 0 && iQ3 == -65536 && iQ4 == 65536 && iQ5 == 0) {
            i11 = 270;
        } else if (iQ2 == -65536 && iQ3 == 0 && iQ4 == 0 && iQ5 == -65536) {
            i11 = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
        }
        return new f(iQ, j10, i11);
    }

    private static com.applovin.exoplayer2.g.a c(y yVar, int i10) {
        yVar.e(12);
        while (yVar.c() < i10) {
            int iC = yVar.c();
            int iQ = yVar.q();
            if (yVar.q() == 1935766900) {
                if (iQ < 14) {
                    return null;
                }
                yVar.e(5);
                int iH = yVar.h();
                if (iH != 12 && iH != 13) {
                    return null;
                }
                float f10 = iH == 12 ? 240.0f : 120.0f;
                yVar.e(1);
                return new com.applovin.exoplayer2.g.a(new com.applovin.exoplayer2.g.f.d(f10, yVar.h()));
            }
            yVar.d(iC + iQ);
        }
        return null;
    }

    private static float d(y yVar, int i10) {
        yVar.d(i10 + 8);
        return yVar.w() / yVar.w();
    }

    private static int d(y yVar) {
        yVar.d(16);
        return yVar.q();
    }

    private static byte[] d(y yVar, int i10, int i11) {
        int i12 = i10 + 8;
        while (i12 - i10 < i11) {
            yVar.d(i12);
            int iQ = yVar.q();
            if (yVar.q() == 1886547818) {
                return Arrays.copyOfRange(yVar.d(), i12, iQ + i12);
            }
            i12 += iQ;
        }
        return null;
    }

    private static Pair<Long, String> e(y yVar) {
        yVar.d(8);
        int iA = com.applovin.exoplayer2.e.g.a.a(yVar.q());
        yVar.e(iA == 0 ? 8 : 16);
        long jO = yVar.o();
        yVar.e(iA == 0 ? 4 : 8);
        int i10 = yVar.i();
        StringBuilder sbA = defpackage.a.a("");
        sbA.append((char) (((i10 >> 10) & 31) + 96));
        sbA.append((char) (((i10 >> 5) & 31) + 96));
        sbA.append((char) ((i10 & 31) + 96));
        return Pair.create(Long.valueOf(jO), sbA.toString());
    }

    private static Pair<String, byte[]> e(y yVar, int i10) {
        yVar.d(i10 + 8 + 4);
        yVar.e(1);
        f(yVar);
        yVar.e(2);
        int iH = yVar.h();
        if ((iH & 128) != 0) {
            yVar.e(2);
        }
        if ((iH & 64) != 0) {
            yVar.e(yVar.i());
        }
        if ((iH & 32) != 0) {
            yVar.e(2);
        }
        yVar.e(1);
        f(yVar);
        String strA = u.a(yVar.h());
        if ("audio/mpeg".equals(strA) || "audio/vnd.dts".equals(strA) || "audio/vnd.dts.hd".equals(strA)) {
            return Pair.create(strA, null);
        }
        yVar.e(12);
        yVar.e(1);
        int iF = f(yVar);
        byte[] bArr = new byte[iF];
        yVar.a(bArr, 0, iF);
        return Pair.create(strA, bArr);
    }

    private static int f(y yVar) {
        int iH = yVar.h();
        int i10 = iH & 127;
        while ((iH & 128) == 128) {
            iH = yVar.h();
            i10 = (i10 << 7) | (iH & 127);
        }
        return i10;
    }
}
