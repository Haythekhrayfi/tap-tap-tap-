package com.applovin.exoplayer2.h;

import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.l.ai;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.exoplayer2.k.b f6687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f6688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.y f6689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f6690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f6691e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f6692f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f6693g;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f6694a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f6695b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f6696c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public com.applovin.exoplayer2.k.a f6697d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public a f6698e;

        public a(long j10, int i10) {
            this.f6694a = j10;
            this.f6695b = j10 + ((long) i10);
        }

        public int a(long j10) {
            return ((int) (j10 - this.f6694a)) + this.f6697d.f7343b;
        }

        public a a() {
            this.f6697d = null;
            a aVar = this.f6698e;
            this.f6698e = null;
            return aVar;
        }

        public void a(com.applovin.exoplayer2.k.a aVar, a aVar2) {
            this.f6697d = aVar;
            this.f6698e = aVar2;
            this.f6696c = true;
        }
    }

    public v(com.applovin.exoplayer2.k.b bVar) {
        this.f6687a = bVar;
        int iC = bVar.c();
        this.f6688b = iC;
        this.f6689c = new com.applovin.exoplayer2.l.y(32);
        a aVar = new a(0L, iC);
        this.f6690d = aVar;
        this.f6691e = aVar;
        this.f6692f = aVar;
    }

    private int a(int i10) {
        a aVar = this.f6692f;
        if (!aVar.f6696c) {
            aVar.a(this.f6687a.a(), new a(this.f6692f.f6695b, this.f6688b));
        }
        return Math.min(i10, (int) (this.f6692f.f6695b - this.f6693g));
    }

    private static a a(a aVar, long j10) {
        while (j10 >= aVar.f6695b) {
            aVar = aVar.f6698e;
        }
        return aVar;
    }

    private static a a(a aVar, long j10, ByteBuffer byteBuffer, int i10) {
        a aVarA = a(aVar, j10);
        while (i10 > 0) {
            int iMin = Math.min(i10, (int) (aVarA.f6695b - j10));
            byteBuffer.put(aVarA.f6697d.f7342a, aVarA.a(j10), iMin);
            i10 -= iMin;
            j10 += (long) iMin;
            if (j10 == aVarA.f6695b) {
                aVarA = aVarA.f6698e;
            }
        }
        return aVarA;
    }

    private static a a(a aVar, long j10, byte[] bArr, int i10) {
        a aVarA = a(aVar, j10);
        int i11 = i10;
        while (i11 > 0) {
            int iMin = Math.min(i11, (int) (aVarA.f6695b - j10));
            System.arraycopy(aVarA.f6697d.f7342a, aVarA.a(j10), bArr, i10 - i11, iMin);
            i11 -= iMin;
            j10 += (long) iMin;
            if (j10 == aVarA.f6695b) {
                aVarA = aVarA.f6698e;
            }
        }
        return aVarA;
    }

    private static a a(a aVar, com.applovin.exoplayer2.c.g gVar, w.a aVar2, com.applovin.exoplayer2.l.y yVar) {
        long j10;
        ByteBuffer byteBuffer;
        if (gVar.g()) {
            aVar = b(aVar, gVar, aVar2, yVar);
        }
        if (gVar.e()) {
            yVar.a(4);
            a aVarA = a(aVar, aVar2.f6726b, yVar.d(), 4);
            int iW = yVar.w();
            aVar2.f6726b += 4;
            aVar2.f6725a -= 4;
            gVar.f(iW);
            aVar = a(aVarA, aVar2.f6726b, gVar.f4752b, iW);
            aVar2.f6726b += (long) iW;
            int i10 = aVar2.f6725a - iW;
            aVar2.f6725a = i10;
            gVar.e(i10);
            j10 = aVar2.f6726b;
            byteBuffer = gVar.f4755e;
        } else {
            gVar.f(aVar2.f6725a);
            j10 = aVar2.f6726b;
            byteBuffer = gVar.f4752b;
        }
        return a(aVar, j10, byteBuffer, aVar2.f6725a);
    }

    private void a(a aVar) {
        if (aVar.f6696c) {
            a aVar2 = this.f6692f;
            int i10 = (((int) (aVar2.f6694a - aVar.f6694a)) / this.f6688b) + (aVar2.f6696c ? 1 : 0);
            com.applovin.exoplayer2.k.a[] aVarArr = new com.applovin.exoplayer2.k.a[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                aVarArr[i11] = aVar.f6697d;
                aVar = aVar.a();
            }
            this.f6687a.a(aVarArr);
        }
    }

    private static a b(a aVar, com.applovin.exoplayer2.c.g gVar, w.a aVar2, com.applovin.exoplayer2.l.y yVar) {
        long j10 = aVar2.f6726b;
        int i10 = 1;
        yVar.a(1);
        a aVarA = a(aVar, j10, yVar.d(), 1);
        long j11 = j10 + 1;
        byte b10 = yVar.d()[0];
        boolean z10 = (b10 & 128) != 0;
        int i11 = b10 & Ascii.DEL;
        com.applovin.exoplayer2.c.c cVar = gVar.f4751a;
        byte[] bArr = cVar.f4728a;
        if (bArr == null) {
            cVar.f4728a = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        a aVarA2 = a(aVarA, j11, cVar.f4728a, i11);
        long j12 = j11 + ((long) i11);
        if (z10) {
            yVar.a(2);
            aVarA2 = a(aVarA2, j12, yVar.d(), 2);
            j12 += 2;
            i10 = yVar.i();
        }
        int i12 = i10;
        int[] iArr = cVar.f4731d;
        if (iArr == null || iArr.length < i12) {
            iArr = new int[i12];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = cVar.f4732e;
        if (iArr3 == null || iArr3.length < i12) {
            iArr3 = new int[i12];
        }
        int[] iArr4 = iArr3;
        if (z10) {
            int i13 = i12 * 6;
            yVar.a(i13);
            aVarA2 = a(aVarA2, j12, yVar.d(), i13);
            j12 += (long) i13;
            yVar.d(0);
            for (int i14 = 0; i14 < i12; i14++) {
                iArr2[i14] = yVar.i();
                iArr4[i14] = yVar.w();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = aVar2.f6725a - ((int) (j12 - aVar2.f6726b));
        }
        com.applovin.exoplayer2.e.x.a aVar3 = (com.applovin.exoplayer2.e.x.a) ai.a(aVar2.f6727c);
        cVar.a(i12, iArr2, iArr4, aVar3.f6143b, cVar.f4728a, aVar3.f6142a, aVar3.f6144c, aVar3.f6145d);
        long j13 = aVar2.f6726b;
        int i15 = (int) (j12 - j13);
        aVar2.f6726b = j13 + ((long) i15);
        aVar2.f6725a -= i15;
        return aVarA2;
    }

    private void b(int i10) {
        long j10 = this.f6693g + ((long) i10);
        this.f6693g = j10;
        a aVar = this.f6692f;
        if (j10 == aVar.f6695b) {
            this.f6692f = aVar.f6698e;
        }
    }

    public int a(com.applovin.exoplayer2.k.g gVar, int i10, boolean z10) throws IOException {
        int iA = a(i10);
        a aVar = this.f6692f;
        int iA2 = gVar.a(aVar.f6697d.f7342a, aVar.a(this.f6693g), iA);
        if (iA2 != -1) {
            b(iA2);
            return iA2;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    public void a() {
        a(this.f6690d);
        a aVar = new a(0L, this.f6688b);
        this.f6690d = aVar;
        this.f6691e = aVar;
        this.f6692f = aVar;
        this.f6693g = 0L;
        this.f6687a.b();
    }

    public void a(long j10) {
        a aVar;
        if (j10 == -1) {
            return;
        }
        while (true) {
            aVar = this.f6690d;
            if (j10 < aVar.f6695b) {
                break;
            }
            this.f6687a.a(aVar.f6697d);
            this.f6690d = this.f6690d.a();
        }
        if (this.f6691e.f6694a < aVar.f6694a) {
            this.f6691e = aVar;
        }
    }

    public void a(com.applovin.exoplayer2.c.g gVar, w.a aVar) {
        this.f6691e = a(this.f6691e, gVar, aVar, this.f6689c);
    }

    public void a(com.applovin.exoplayer2.l.y yVar, int i10) {
        while (i10 > 0) {
            int iA = a(i10);
            a aVar = this.f6692f;
            yVar.a(aVar.f6697d.f7342a, aVar.a(this.f6693g), iA);
            i10 -= iA;
            b(iA);
        }
    }

    public void b() {
        this.f6691e = this.f6690d;
    }

    public void b(com.applovin.exoplayer2.c.g gVar, w.a aVar) {
        a(this.f6691e, gVar, aVar, this.f6689c);
    }

    public long c() {
        return this.f6693g;
    }
}
