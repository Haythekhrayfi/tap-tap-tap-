package com.applovin.exoplayer2.e.h;

import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.e.z;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.v;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class i extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f5691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f5692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f5693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private z.d f5694d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private z.b f5695e;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z.d f5696a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final z.b f5697b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f5698c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final z.c[] f5699d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f5700e;

        public a(z.d dVar, z.b bVar, byte[] bArr, z.c[] cVarArr, int i10) {
            this.f5696a = dVar;
            this.f5697b = bVar;
            this.f5698c = bArr;
            this.f5699d = cVarArr;
            this.f5700e = i10;
        }
    }

    public static int a(byte b10, int i10, int i11) {
        return (b10 >> i11) & (255 >>> (8 - i10));
    }

    private static int a(byte b10, a aVar) {
        return !aVar.f5699d[a(b10, aVar.f5700e, 1)].f6158a ? aVar.f5696a.f6168g : aVar.f5696a.f6169h;
    }

    public static void a(y yVar, long j10) {
        if (yVar.e() < yVar.b() + 4) {
            yVar.a(Arrays.copyOf(yVar.d(), yVar.b() + 4));
        } else {
            yVar.c(yVar.b() + 4);
        }
        byte[] bArrD = yVar.d();
        bArrD[yVar.b() - 4] = (byte) (j10 & 255);
        bArrD[yVar.b() - 3] = (byte) ((j10 >>> 8) & 255);
        bArrD[yVar.b() - 2] = (byte) ((j10 >>> 16) & 255);
        bArrD[yVar.b() - 1] = (byte) ((j10 >>> 24) & 255);
    }

    public static boolean a(y yVar) {
        try {
            return z.a(1, yVar, true);
        } catch (ai unused) {
            return false;
        }
    }

    @Override // com.applovin.exoplayer2.e.h.h
    public void a(boolean z10) {
        super.a(z10);
        if (z10) {
            this.f5691a = null;
            this.f5694d = null;
            this.f5695e = null;
        }
        this.f5692b = 0;
        this.f5693c = false;
    }

    @Override // com.applovin.exoplayer2.e.h.h
    public boolean a(y yVar, long j10, h.a aVar) throws IOException {
        if (this.f5691a != null) {
            com.applovin.exoplayer2.l.a.b(aVar.f5689a);
            return false;
        }
        a aVarC = c(yVar);
        this.f5691a = aVarC;
        if (aVarC == null) {
            return true;
        }
        z.d dVar = aVarC.f5696a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(dVar.f6171j);
        arrayList.add(aVarC.f5698c);
        aVar.f5689a = new v.a().f("audio/vorbis").d(dVar.f6166e).e(dVar.f6165d).k(dVar.f6163b).l(dVar.f6164c).a(arrayList).a();
        return true;
    }

    @Override // com.applovin.exoplayer2.e.h.h
    public long b(y yVar) {
        if ((yVar.d()[0] & 1) == 1) {
            return -1L;
        }
        int iA = a(yVar.d()[0], (a) com.applovin.exoplayer2.l.a.a(this.f5691a));
        long j10 = this.f5693c ? (this.f5692b + iA) / 4 : 0;
        a(yVar, j10);
        this.f5693c = true;
        this.f5692b = iA;
        return j10;
    }

    public a c(y yVar) throws IOException {
        z.d dVar = this.f5694d;
        if (dVar == null) {
            this.f5694d = z.a(yVar);
            return null;
        }
        z.b bVar = this.f5695e;
        if (bVar == null) {
            this.f5695e = z.b(yVar);
            return null;
        }
        byte[] bArr = new byte[yVar.b()];
        System.arraycopy(yVar.d(), 0, bArr, 0, yVar.b());
        z.c[] cVarArrA = z.a(yVar, dVar.f6163b);
        return new a(dVar, bVar, bArr, cVarArrA, z.a(cVarArrA.length - 1));
    }

    @Override // com.applovin.exoplayer2.e.h.h
    public void c(long j10) {
        super.c(j10);
        this.f5693c = j10 != 0;
        z.d dVar = this.f5694d;
        this.f5692b = dVar != null ? dVar.f6168g : 0;
    }
}
