package com.applovin.exoplayer2.e.h;

import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.e.m;
import com.applovin.exoplayer2.e.n;
import com.applovin.exoplayer2.e.o;
import com.applovin.exoplayer2.e.p;
import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.y;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class b extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p f5648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f5649b;

    public static final class a implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private p f5650a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private p.a f5651b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f5652c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f5653d = -1;

        public a(p pVar, p.a aVar) {
            this.f5650a = pVar;
            this.f5651b = aVar;
        }

        @Override // com.applovin.exoplayer2.e.h.f
        public long a(com.applovin.exoplayer2.e.i iVar) {
            long j10 = this.f5653d;
            if (j10 < 0) {
                return -1L;
            }
            long j11 = -(j10 + 2);
            this.f5653d = -1L;
            return j11;
        }

        @Override // com.applovin.exoplayer2.e.h.f
        public void a(long j10) {
            long[] jArr = this.f5651b.f6123a;
            this.f5653d = jArr[ai.a(jArr, j10, true, true)];
        }

        @Override // com.applovin.exoplayer2.e.h.f
        public v b() {
            com.applovin.exoplayer2.l.a.b(this.f5652c != -1);
            return new o(this.f5650a, this.f5652c);
        }

        public void b(long j10) {
            this.f5652c = j10;
        }
    }

    public static boolean a(y yVar) {
        return yVar.a() >= 5 && yVar.h() == 127 && yVar.o() == 1179402563;
    }

    private static boolean a(byte[] bArr) {
        return bArr[0] == -1;
    }

    private int c(y yVar) {
        int i10 = (yVar.d()[2] & 255) >> 4;
        if (i10 == 6 || i10 == 7) {
            yVar.e(4);
            yVar.D();
        }
        int iA = m.a(yVar, i10);
        yVar.d(0);
        return iA;
    }

    @Override // com.applovin.exoplayer2.e.h.h
    public void a(boolean z10) {
        super.a(z10);
        if (z10) {
            this.f5648a = null;
            this.f5649b = null;
        }
    }

    @Override // com.applovin.exoplayer2.e.h.h
    public boolean a(y yVar, long j10, h.a aVar) {
        byte[] bArrD = yVar.d();
        p pVar = this.f5648a;
        if (pVar == null) {
            p pVar2 = new p(bArrD, 17);
            this.f5648a = pVar2;
            aVar.f5689a = pVar2.a(Arrays.copyOfRange(bArrD, 9, yVar.b()), (com.applovin.exoplayer2.g.a) null);
            return true;
        }
        if ((bArrD[0] & Ascii.DEL) == 3) {
            p.a aVarA = n.a(yVar);
            p pVarA = pVar.a(aVarA);
            this.f5648a = pVarA;
            this.f5649b = new a(pVarA, aVarA);
            return true;
        }
        if (!a(bArrD)) {
            return true;
        }
        a aVar2 = this.f5649b;
        if (aVar2 != null) {
            aVar2.b(j10);
            aVar.f5690b = this.f5649b;
        }
        com.applovin.exoplayer2.l.a.b(aVar.f5689a);
        return false;
    }

    @Override // com.applovin.exoplayer2.e.h.h
    public long b(y yVar) {
        if (a(yVar.d())) {
            return c(yVar);
        }
        return -1L;
    }
}
