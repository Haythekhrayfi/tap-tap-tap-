package com.yandex.mobile.ads.impl;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class dz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u8 f20000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f20001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final mp0 f20002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f20003d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f20004e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f20005f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f20006g;

    public static final class a implements u8.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f20007a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f20008b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public t8 f20009c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public a f20010d;

        public a(int i10, long j10) {
            a(i10, j10);
        }

        @Override // com.yandex.mobile.ads.impl.u8.a
        public final t8 a() {
            t8 t8Var = this.f20009c;
            Objects.requireNonNull(t8Var);
            return t8Var;
        }

        public final void a(int i10, long j10) {
            pa.b(this.f20009c == null);
            this.f20007a = j10;
            this.f20008b = j10 + ((long) i10);
        }

        @Override // com.yandex.mobile.ads.impl.u8.a
        public final u8.a next() {
            a aVar = this.f20010d;
            if (aVar == null || aVar.f20009c == null) {
                return null;
            }
            return aVar;
        }
    }

    public dz0(u8 u8Var) {
        this.f20000a = u8Var;
        int iB = ((jn) u8Var).b();
        this.f20001b = iB;
        this.f20002c = new mp0(32);
        a aVar = new a(iB, 0L);
        this.f20003d = aVar;
        this.f20004e = aVar;
        this.f20005f = aVar;
    }

    private static a a(a aVar, long j10, ByteBuffer byteBuffer, int i10) {
        while (j10 >= aVar.f20008b) {
            aVar = aVar.f20010d;
        }
        while (i10 > 0) {
            int iMin = Math.min(i10, (int) (aVar.f20008b - j10));
            t8 t8Var = aVar.f20009c;
            byteBuffer.put(t8Var.f25287a, ((int) (j10 - aVar.f20007a)) + t8Var.f25288b, iMin);
            i10 -= iMin;
            j10 += (long) iMin;
            if (j10 == aVar.f20008b) {
                aVar = aVar.f20010d;
            }
        }
        return aVar;
    }

    private static a a(a aVar, long j10, byte[] bArr, int i10) {
        while (j10 >= aVar.f20008b) {
            aVar = aVar.f20010d;
        }
        int i11 = i10;
        while (i11 > 0) {
            int iMin = Math.min(i11, (int) (aVar.f20008b - j10));
            t8 t8Var = aVar.f20009c;
            System.arraycopy(t8Var.f25287a, ((int) (j10 - aVar.f20007a)) + t8Var.f25288b, bArr, i10 - i11, iMin);
            i11 -= iMin;
            j10 += (long) iMin;
            if (j10 == aVar.f20008b) {
                aVar = aVar.f20010d;
            }
        }
        return aVar;
    }

    private static a a(a aVar, an anVar, ez0.a aVar2, mp0 mp0Var) {
        a aVarA;
        if (anVar.i()) {
            long j10 = aVar2.f20411b;
            int iZ = 1;
            mp0Var.c(1);
            a aVarA2 = a(aVar, j10, mp0Var.c(), 1);
            long j11 = j10 + 1;
            byte b10 = mp0Var.c()[0];
            boolean z10 = (b10 & 128) != 0;
            int i10 = b10 & Ascii.DEL;
            zl zlVar = anVar.f19003b;
            byte[] bArr = zlVar.f27356a;
            if (bArr == null) {
                zlVar.f27356a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            aVarA = a(aVarA2, j11, zlVar.f27356a, i10);
            long j12 = j11 + ((long) i10);
            if (z10) {
                mp0Var.c(2);
                aVarA = a(aVarA, j12, mp0Var.c(), 2);
                j12 += 2;
                iZ = mp0Var.z();
            }
            int i11 = iZ;
            int[] iArr = zlVar.f27359d;
            if (iArr == null || iArr.length < i11) {
                iArr = new int[i11];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = zlVar.f27360e;
            if (iArr3 == null || iArr3.length < i11) {
                iArr3 = new int[i11];
            }
            int[] iArr4 = iArr3;
            if (z10) {
                int i12 = i11 * 6;
                mp0Var.c(i12);
                aVarA = a(aVarA, j12, mp0Var.c(), i12);
                j12 += (long) i12;
                mp0Var.e(0);
                for (int i13 = 0; i13 < i11; i13++) {
                    iArr2[i13] = mp0Var.z();
                    iArr4[i13] = mp0Var.x();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = aVar2.f20410a - ((int) (j12 - aVar2.f20411b));
            }
            j71.a aVar3 = aVar2.f20412c;
            int i14 = da1.f19803a;
            zlVar.a(i11, iArr2, iArr4, aVar3.f21979b, zlVar.f27356a, aVar3.f21978a, aVar3.f21980c, aVar3.f21981d);
            long j13 = aVar2.f20411b;
            int i15 = (int) (j12 - j13);
            aVar2.f20411b = j13 + ((long) i15);
            aVar2.f20410a -= i15;
        } else {
            aVarA = aVar;
        }
        if (!anVar.d()) {
            anVar.e(aVar2.f20410a);
            return a(aVarA, aVar2.f20411b, anVar.f19004c, aVar2.f20410a);
        }
        mp0Var.c(4);
        a aVarA3 = a(aVarA, aVar2.f20411b, mp0Var.c(), 4);
        int iX = mp0Var.x();
        aVar2.f20411b += 4;
        aVar2.f20410a -= 4;
        anVar.e(iX);
        a aVarA4 = a(aVarA3, aVar2.f20411b, anVar.f19004c, iX);
        aVar2.f20411b += (long) iX;
        int i16 = aVar2.f20410a - iX;
        aVar2.f20410a = i16;
        ByteBuffer byteBuffer = anVar.f19007f;
        if (byteBuffer == null || byteBuffer.capacity() < i16) {
            anVar.f19007f = ByteBuffer.allocate(i16);
        } else {
            anVar.f19007f.clear();
        }
        return a(aVarA4, aVar2.f20411b, anVar.f19007f, aVar2.f20410a);
    }

    public final int a(im imVar, int i10, boolean z10) throws IOException {
        a aVar = this.f20005f;
        if (aVar.f20009c == null) {
            t8 t8VarA = ((jn) this.f20000a).a();
            a aVar2 = new a(this.f20001b, this.f20005f.f20008b);
            aVar.f20009c = t8VarA;
            aVar.f20010d = aVar2;
        }
        int iMin = Math.min(i10, (int) (this.f20005f.f20008b - this.f20006g));
        a aVar3 = this.f20005f;
        t8 t8Var = aVar3.f20009c;
        int i11 = imVar.read(t8Var.f25287a, ((int) (this.f20006g - aVar3.f20007a)) + t8Var.f25288b, iMin);
        if (i11 == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        long j10 = this.f20006g + ((long) i11);
        this.f20006g = j10;
        a aVar4 = this.f20005f;
        if (j10 == aVar4.f20008b) {
            this.f20005f = aVar4.f20010d;
        }
        return i11;
    }

    public final long a() {
        return this.f20006g;
    }

    public final void a(int i10, mp0 mp0Var) {
        while (i10 > 0) {
            a aVar = this.f20005f;
            if (aVar.f20009c == null) {
                t8 t8VarA = ((jn) this.f20000a).a();
                a aVar2 = new a(this.f20001b, this.f20005f.f20008b);
                aVar.f20009c = t8VarA;
                aVar.f20010d = aVar2;
            }
            int iMin = Math.min(i10, (int) (this.f20005f.f20008b - this.f20006g));
            a aVar3 = this.f20005f;
            t8 t8Var = aVar3.f20009c;
            mp0Var.a(t8Var.f25287a, ((int) (this.f20006g - aVar3.f20007a)) + t8Var.f25288b, iMin);
            i10 -= iMin;
            long j10 = this.f20006g + ((long) iMin);
            this.f20006g = j10;
            a aVar4 = this.f20005f;
            if (j10 == aVar4.f20008b) {
                this.f20005f = aVar4.f20010d;
            }
        }
    }

    public final void a(long j10) {
        a aVar;
        if (j10 == -1) {
            return;
        }
        while (true) {
            aVar = this.f20003d;
            if (j10 < aVar.f20008b) {
                break;
            }
            ((jn) this.f20000a).a(aVar.f20009c);
            a aVar2 = this.f20003d;
            aVar2.f20009c = null;
            a aVar3 = aVar2.f20010d;
            aVar2.f20010d = null;
            this.f20003d = aVar3;
        }
        if (this.f20004e.f20007a < aVar.f20007a) {
            this.f20004e = aVar;
        }
    }

    public final void a(an anVar, ez0.a aVar) {
        a(this.f20004e, anVar, aVar, this.f20002c);
    }

    public final void b() {
        a aVar = this.f20003d;
        if (aVar.f20009c != null) {
            ((jn) this.f20000a).a(aVar);
            aVar.f20009c = null;
            aVar.f20010d = null;
        }
        this.f20003d.a(this.f20001b, 0L);
        a aVar2 = this.f20003d;
        this.f20004e = aVar2;
        this.f20005f = aVar2;
        this.f20006g = 0L;
        ((jn) this.f20000a).e();
    }

    public final void b(an anVar, ez0.a aVar) {
        this.f20004e = a(this.f20004e, anVar, aVar, this.f20002c);
    }

    public final void c() {
        this.f20004e = this.f20003d;
    }
}
