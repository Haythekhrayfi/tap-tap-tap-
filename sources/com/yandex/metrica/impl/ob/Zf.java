package com.yandex.metrica.impl.ob;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class Zf extends AbstractC1594e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f15656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f15657d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f15658e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f15659f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a f15660g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f15661h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f15662i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f15663j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f15664k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c f15665l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b f15666m;

    public static final class a extends AbstractC1594e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[] f15667b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public byte[] f15668c;

        public a() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public int a() {
            byte[] bArr = this.f15667b;
            byte[] bArr2 = C1644g.f16157d;
            int iA = Arrays.equals(bArr, bArr2) ? 0 : 0 + C1519b.a(1, this.f15667b);
            return !Arrays.equals(this.f15668c, bArr2) ? iA + C1519b.a(2, this.f15668c) : iA;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public AbstractC1594e a(C1494a c1494a) throws IOException {
            while (true) {
                int iL = c1494a.l();
                if (iL == 0) {
                    break;
                }
                if (iL == 10) {
                    this.f15667b = c1494a.d();
                } else if (iL == 18) {
                    this.f15668c = c1494a.d();
                } else if (!c1494a.f(iL)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public void a(C1519b c1519b) throws IOException {
            byte[] bArr = this.f15667b;
            byte[] bArr2 = C1644g.f16157d;
            if (!Arrays.equals(bArr, bArr2)) {
                c1519b.b(1, this.f15667b);
            }
            if (Arrays.equals(this.f15668c, bArr2)) {
                return;
            }
            c1519b.b(2, this.f15668c);
        }

        public a b() {
            byte[] bArr = C1644g.f16157d;
            this.f15667b = bArr;
            this.f15668c = bArr;
            this.f15981a = -1;
            return this;
        }
    }

    public static final class b extends AbstractC1594e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f15669b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public C0179b f15670c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public a f15671d;

        public static final class a extends AbstractC1594e {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public long f15672b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public C0179b f15673c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f15674d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public byte[] f15675e;

            public a() {
                b();
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC1594e
            public int a() {
                long j10 = this.f15672b;
                int iA = j10 != 0 ? 0 + C1519b.a(1, j10) : 0;
                C0179b c0179b = this.f15673c;
                if (c0179b != null) {
                    iA += C1519b.a(2, c0179b);
                }
                int i10 = this.f15674d;
                if (i10 != 0) {
                    iA += C1519b.c(3, i10);
                }
                return !Arrays.equals(this.f15675e, C1644g.f16157d) ? iA + C1519b.a(4, this.f15675e) : iA;
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC1594e
            public AbstractC1594e a(C1494a c1494a) throws IOException {
                while (true) {
                    int iL = c1494a.l();
                    if (iL == 0) {
                        break;
                    }
                    if (iL == 8) {
                        this.f15672b = c1494a.i();
                    } else if (iL == 18) {
                        if (this.f15673c == null) {
                            this.f15673c = new C0179b();
                        }
                        c1494a.a(this.f15673c);
                    } else if (iL == 24) {
                        this.f15674d = c1494a.h();
                    } else if (iL == 34) {
                        this.f15675e = c1494a.d();
                    } else if (!c1494a.f(iL)) {
                        break;
                    }
                }
                return this;
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC1594e
            public void a(C1519b c1519b) throws IOException {
                long j10 = this.f15672b;
                if (j10 != 0) {
                    c1519b.c(1, j10);
                }
                C0179b c0179b = this.f15673c;
                if (c0179b != null) {
                    c1519b.b(2, c0179b);
                }
                int i10 = this.f15674d;
                if (i10 != 0) {
                    c1519b.f(3, i10);
                }
                if (Arrays.equals(this.f15675e, C1644g.f16157d)) {
                    return;
                }
                c1519b.b(4, this.f15675e);
            }

            public a b() {
                this.f15672b = 0L;
                this.f15673c = null;
                this.f15674d = 0;
                this.f15675e = C1644g.f16157d;
                this.f15981a = -1;
                return this;
            }
        }

        /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.Zf$b$b, reason: collision with other inner class name */
        public static final class C0179b extends AbstractC1594e {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f15676b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f15677c;

            public C0179b() {
                b();
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC1594e
            public int a() {
                int i10 = this.f15676b;
                int iC = i10 != 0 ? 0 + C1519b.c(1, i10) : 0;
                int i11 = this.f15677c;
                return i11 != 0 ? iC + C1519b.a(2, i11) : iC;
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC1594e
            public AbstractC1594e a(C1494a c1494a) throws IOException {
                while (true) {
                    int iL = c1494a.l();
                    if (iL == 0) {
                        break;
                    }
                    if (iL == 8) {
                        this.f15676b = c1494a.h();
                    } else if (iL == 16) {
                        int iH = c1494a.h();
                        if (iH == 0 || iH == 1 || iH == 2 || iH == 3 || iH == 4) {
                            this.f15677c = iH;
                        }
                    } else if (!c1494a.f(iL)) {
                        break;
                    }
                }
                return this;
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC1594e
            public void a(C1519b c1519b) throws IOException {
                int i10 = this.f15676b;
                if (i10 != 0) {
                    c1519b.f(1, i10);
                }
                int i11 = this.f15677c;
                if (i11 != 0) {
                    c1519b.d(2, i11);
                }
            }

            public C0179b b() {
                this.f15676b = 0;
                this.f15677c = 0;
                this.f15981a = -1;
                return this;
            }
        }

        public b() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public int a() {
            boolean z10 = this.f15669b;
            int iA = z10 ? 0 + C1519b.a(1, z10) : 0;
            C0179b c0179b = this.f15670c;
            if (c0179b != null) {
                iA += C1519b.a(2, c0179b);
            }
            a aVar = this.f15671d;
            return aVar != null ? iA + C1519b.a(3, aVar) : iA;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public AbstractC1594e a(C1494a c1494a) throws IOException {
            AbstractC1594e abstractC1594e;
            while (true) {
                int iL = c1494a.l();
                if (iL == 0) {
                    break;
                }
                if (iL != 8) {
                    if (iL == 18) {
                        if (this.f15670c == null) {
                            this.f15670c = new C0179b();
                        }
                        abstractC1594e = this.f15670c;
                    } else if (iL == 26) {
                        if (this.f15671d == null) {
                            this.f15671d = new a();
                        }
                        abstractC1594e = this.f15671d;
                    } else if (!c1494a.f(iL)) {
                        break;
                    }
                    c1494a.a(abstractC1594e);
                } else {
                    this.f15669b = c1494a.c();
                }
            }
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public void a(C1519b c1519b) throws IOException {
            boolean z10 = this.f15669b;
            if (z10) {
                c1519b.b(1, z10);
            }
            C0179b c0179b = this.f15670c;
            if (c0179b != null) {
                c1519b.b(2, c0179b);
            }
            a aVar = this.f15671d;
            if (aVar != null) {
                c1519b.b(3, aVar);
            }
        }

        public b b() {
            this.f15669b = false;
            this.f15670c = null;
            this.f15671d = null;
            this.f15981a = -1;
            return this;
        }
    }

    public static final class c extends AbstractC1594e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[] f15678b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f15679c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f15680d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte[] f15681e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f15682f;

        public c() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public int a() {
            byte[] bArr = this.f15678b;
            byte[] bArr2 = C1644g.f16157d;
            int iA = Arrays.equals(bArr, bArr2) ? 0 : 0 + C1519b.a(1, this.f15678b);
            long j10 = this.f15679c;
            if (j10 != 0) {
                iA += C1519b.b(2, j10);
            }
            int i10 = this.f15680d;
            if (i10 != 0) {
                iA += C1519b.a(3, i10);
            }
            if (!Arrays.equals(this.f15681e, bArr2)) {
                iA += C1519b.a(4, this.f15681e);
            }
            long j11 = this.f15682f;
            return j11 != 0 ? iA + C1519b.b(5, j11) : iA;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public AbstractC1594e a(C1494a c1494a) throws IOException {
            while (true) {
                int iL = c1494a.l();
                if (iL == 0) {
                    break;
                }
                if (iL == 10) {
                    this.f15678b = c1494a.d();
                } else if (iL == 16) {
                    this.f15679c = c1494a.i();
                } else if (iL == 24) {
                    int iH = c1494a.h();
                    if (iH == 0 || iH == 1 || iH == 2) {
                        this.f15680d = iH;
                    }
                } else if (iL == 34) {
                    this.f15681e = c1494a.d();
                } else if (iL == 40) {
                    this.f15682f = c1494a.i();
                } else if (!c1494a.f(iL)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public void a(C1519b c1519b) throws IOException {
            byte[] bArr = this.f15678b;
            byte[] bArr2 = C1644g.f16157d;
            if (!Arrays.equals(bArr, bArr2)) {
                c1519b.b(1, this.f15678b);
            }
            long j10 = this.f15679c;
            if (j10 != 0) {
                c1519b.e(2, j10);
            }
            int i10 = this.f15680d;
            if (i10 != 0) {
                c1519b.d(3, i10);
            }
            if (!Arrays.equals(this.f15681e, bArr2)) {
                c1519b.b(4, this.f15681e);
            }
            long j11 = this.f15682f;
            if (j11 != 0) {
                c1519b.e(5, j11);
            }
        }

        public c b() {
            byte[] bArr = C1644g.f16157d;
            this.f15678b = bArr;
            this.f15679c = 0L;
            this.f15680d = 0;
            this.f15681e = bArr;
            this.f15682f = 0L;
            this.f15981a = -1;
            return this;
        }
    }

    public Zf() {
        b();
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
    public int a() {
        int i10 = this.f15655b;
        int iC = i10 != 1 ? 0 + C1519b.c(1, i10) : 0;
        if (Double.doubleToLongBits(this.f15656c) != Double.doubleToLongBits(0.0d)) {
            iC += C1519b.a(2, this.f15656c);
        }
        int iA = C1519b.a(3, this.f15657d) + iC;
        byte[] bArr = this.f15658e;
        byte[] bArr2 = C1644g.f16157d;
        if (!Arrays.equals(bArr, bArr2)) {
            iA += C1519b.a(4, this.f15658e);
        }
        if (!Arrays.equals(this.f15659f, bArr2)) {
            iA += C1519b.a(5, this.f15659f);
        }
        a aVar = this.f15660g;
        if (aVar != null) {
            iA += C1519b.a(6, aVar);
        }
        long j10 = this.f15661h;
        if (j10 != 0) {
            iA += C1519b.a(7, j10);
        }
        boolean z10 = this.f15662i;
        if (z10) {
            iA += C1519b.a(8, z10);
        }
        int i11 = this.f15663j;
        if (i11 != 0) {
            iA += C1519b.a(9, i11);
        }
        int i12 = this.f15664k;
        if (i12 != 1) {
            iA += C1519b.a(10, i12);
        }
        c cVar = this.f15665l;
        if (cVar != null) {
            iA += C1519b.a(11, cVar);
        }
        b bVar = this.f15666m;
        return bVar != null ? iA + C1519b.a(12, bVar) : iA;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
    public AbstractC1594e a(C1494a c1494a) throws IOException {
        AbstractC1594e abstractC1594e;
        while (true) {
            int iL = c1494a.l();
            switch (iL) {
                case 0:
                    break;
                case 8:
                    this.f15655b = c1494a.h();
                    continue;
                case 17:
                    this.f15656c = Double.longBitsToDouble(c1494a.g());
                    continue;
                case 26:
                    this.f15657d = c1494a.d();
                    continue;
                case 34:
                    this.f15658e = c1494a.d();
                    continue;
                case 42:
                    this.f15659f = c1494a.d();
                    continue;
                case 50:
                    if (this.f15660g == null) {
                        this.f15660g = new a();
                    }
                    abstractC1594e = this.f15660g;
                    break;
                case 56:
                    this.f15661h = c1494a.i();
                    continue;
                case 64:
                    this.f15662i = c1494a.c();
                    continue;
                case 72:
                    int iH = c1494a.h();
                    if (iH == 0 || iH == 1 || iH == 2) {
                        this.f15663j = iH;
                    } else {
                        continue;
                    }
                    break;
                case 80:
                    int iH2 = c1494a.h();
                    if (iH2 == 1 || iH2 == 2) {
                        this.f15664k = iH2;
                    } else {
                        continue;
                    }
                    break;
                case 90:
                    if (this.f15665l == null) {
                        this.f15665l = new c();
                    }
                    abstractC1594e = this.f15665l;
                    break;
                case 98:
                    if (this.f15666m == null) {
                        this.f15666m = new b();
                    }
                    abstractC1594e = this.f15666m;
                    break;
                default:
                    if (c1494a.f(iL)) {
                        continue;
                    }
                    break;
            }
            c1494a.a(abstractC1594e);
        }
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
    public void a(C1519b c1519b) throws IOException {
        int i10 = this.f15655b;
        if (i10 != 1) {
            c1519b.f(1, i10);
        }
        if (Double.doubleToLongBits(this.f15656c) != Double.doubleToLongBits(0.0d)) {
            c1519b.b(2, this.f15656c);
        }
        c1519b.b(3, this.f15657d);
        byte[] bArr = this.f15658e;
        byte[] bArr2 = C1644g.f16157d;
        if (!Arrays.equals(bArr, bArr2)) {
            c1519b.b(4, this.f15658e);
        }
        if (!Arrays.equals(this.f15659f, bArr2)) {
            c1519b.b(5, this.f15659f);
        }
        a aVar = this.f15660g;
        if (aVar != null) {
            c1519b.b(6, aVar);
        }
        long j10 = this.f15661h;
        if (j10 != 0) {
            c1519b.c(7, j10);
        }
        boolean z10 = this.f15662i;
        if (z10) {
            c1519b.b(8, z10);
        }
        int i11 = this.f15663j;
        if (i11 != 0) {
            c1519b.d(9, i11);
        }
        int i12 = this.f15664k;
        if (i12 != 1) {
            c1519b.d(10, i12);
        }
        c cVar = this.f15665l;
        if (cVar != null) {
            c1519b.b(11, cVar);
        }
        b bVar = this.f15666m;
        if (bVar != null) {
            c1519b.b(12, bVar);
        }
    }

    public Zf b() {
        this.f15655b = 1;
        this.f15656c = 0.0d;
        byte[] bArr = C1644g.f16157d;
        this.f15657d = bArr;
        this.f15658e = bArr;
        this.f15659f = bArr;
        this.f15660g = null;
        this.f15661h = 0L;
        this.f15662i = false;
        this.f15663j = 0;
        this.f15664k = 1;
        this.f15665l = null;
        this.f15666m = null;
        this.f15981a = -1;
        return this;
    }
}
