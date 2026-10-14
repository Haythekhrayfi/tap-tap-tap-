package com.yandex.metrica.impl.ob;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class Uf extends AbstractC1594e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b[] f15154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a[] f15155c;

    public static final class a extends AbstractC1594e {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static volatile a[] f15156i;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f15157b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f15158c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Tf[] f15159d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Wf[] f15160e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f15161f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f15162g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f15163h;

        public a() {
            b();
        }

        public static a[] c() {
            if (f15156i == null) {
                synchronized (C1544c.f15862a) {
                    if (f15156i == null) {
                        f15156i = new a[0];
                    }
                }
            }
            return f15156i;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public int a() {
            int i10 = 0;
            int iB = C1519b.b(2, this.f15158c) + C1519b.b(1, this.f15157b) + 0;
            Tf[] tfArr = this.f15159d;
            if (tfArr != null && tfArr.length > 0) {
                int i11 = 0;
                while (true) {
                    Tf[] tfArr2 = this.f15159d;
                    if (i11 >= tfArr2.length) {
                        break;
                    }
                    Tf tf = tfArr2[i11];
                    if (tf != null) {
                        iB += C1519b.a(3, tf);
                    }
                    i11++;
                }
            }
            Wf[] wfArr = this.f15160e;
            if (wfArr != null && wfArr.length > 0) {
                while (true) {
                    Wf[] wfArr2 = this.f15160e;
                    if (i10 >= wfArr2.length) {
                        break;
                    }
                    Wf wf = wfArr2[i10];
                    if (wf != null) {
                        iB += C1519b.a(4, wf);
                    }
                    i10++;
                }
            }
            long j10 = this.f15161f;
            if (j10 != 0) {
                iB += C1519b.b(5, j10);
            }
            int i12 = this.f15162g;
            if (i12 != 0) {
                iB += C1519b.a(6, i12);
            }
            int i13 = this.f15163h;
            return i13 != 0 ? iB + C1519b.a(7, i13) : iB;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public AbstractC1594e a(C1494a c1494a) throws IOException {
            while (true) {
                int iL = c1494a.l();
                if (iL == 0) {
                    break;
                }
                if (iL == 8) {
                    this.f15157b = c1494a.i();
                } else if (iL == 16) {
                    this.f15158c = c1494a.i();
                } else if (iL == 26) {
                    int iA = C1644g.a(c1494a, 26);
                    Tf[] tfArr = this.f15159d;
                    int length = tfArr == null ? 0 : tfArr.length;
                    int i10 = iA + length;
                    Tf[] tfArr2 = new Tf[i10];
                    if (length != 0) {
                        System.arraycopy(tfArr, 0, tfArr2, 0, length);
                    }
                    while (length < i10 - 1) {
                        tfArr2[length] = new Tf();
                        c1494a.a(tfArr2[length]);
                        c1494a.l();
                        length++;
                    }
                    tfArr2[length] = new Tf();
                    c1494a.a(tfArr2[length]);
                    this.f15159d = tfArr2;
                } else if (iL == 34) {
                    int iA2 = C1644g.a(c1494a, 34);
                    Wf[] wfArr = this.f15160e;
                    int length2 = wfArr == null ? 0 : wfArr.length;
                    int i11 = iA2 + length2;
                    Wf[] wfArr2 = new Wf[i11];
                    if (length2 != 0) {
                        System.arraycopy(wfArr, 0, wfArr2, 0, length2);
                    }
                    while (length2 < i11 - 1) {
                        wfArr2[length2] = new Wf();
                        c1494a.a(wfArr2[length2]);
                        c1494a.l();
                        length2++;
                    }
                    wfArr2[length2] = new Wf();
                    c1494a.a(wfArr2[length2]);
                    this.f15160e = wfArr2;
                } else if (iL == 40) {
                    this.f15161f = c1494a.i();
                } else if (iL == 48) {
                    int iH = c1494a.h();
                    if (iH == 0 || iH == 1 || iH == 2 || iH == 3 || iH == 4) {
                        this.f15162g = iH;
                    }
                } else if (iL == 56) {
                    int iH2 = c1494a.h();
                    if (iH2 == 0 || iH2 == 1 || iH2 == 2 || iH2 == 3) {
                        this.f15163h = iH2;
                    }
                } else if (!c1494a.f(iL)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public void a(C1519b c1519b) throws IOException {
            c1519b.e(1, this.f15157b);
            c1519b.e(2, this.f15158c);
            Tf[] tfArr = this.f15159d;
            int i10 = 0;
            if (tfArr != null && tfArr.length > 0) {
                int i11 = 0;
                while (true) {
                    Tf[] tfArr2 = this.f15159d;
                    if (i11 >= tfArr2.length) {
                        break;
                    }
                    Tf tf = tfArr2[i11];
                    if (tf != null) {
                        c1519b.b(3, tf);
                    }
                    i11++;
                }
            }
            Wf[] wfArr = this.f15160e;
            if (wfArr != null && wfArr.length > 0) {
                while (true) {
                    Wf[] wfArr2 = this.f15160e;
                    if (i10 >= wfArr2.length) {
                        break;
                    }
                    Wf wf = wfArr2[i10];
                    if (wf != null) {
                        c1519b.b(4, wf);
                    }
                    i10++;
                }
            }
            long j10 = this.f15161f;
            if (j10 != 0) {
                c1519b.e(5, j10);
            }
            int i12 = this.f15162g;
            if (i12 != 0) {
                c1519b.d(6, i12);
            }
            int i13 = this.f15163h;
            if (i13 != 0) {
                c1519b.d(7, i13);
            }
        }

        public a b() {
            this.f15157b = 0L;
            this.f15158c = 0L;
            this.f15159d = Tf.c();
            this.f15160e = Wf.c();
            this.f15161f = 0L;
            this.f15162g = 0;
            this.f15163h = 0;
            this.f15981a = -1;
            return this;
        }
    }

    public static final class b extends AbstractC1594e {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static volatile b[] f15164o;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f15165b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f15166c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f15167d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public double f15168e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public double f15169f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f15170g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f15171h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f15172i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f15173j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f15174k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f15175l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public long f15176m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f15177n;

        public b() {
            b();
        }

        public static b[] c() {
            if (f15164o == null) {
                synchronized (C1544c.f15862a) {
                    if (f15164o == null) {
                        f15164o = new b[0];
                    }
                }
            }
            return f15164o;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public int a() {
            int iB = C1519b.b(2, this.f15166c) + C1519b.b(1, this.f15165b) + 0;
            long j10 = this.f15167d;
            if (j10 != 0) {
                iB += C1519b.b(3, j10);
            }
            int iA = C1519b.a(5, this.f15169f) + C1519b.a(4, this.f15168e) + iB;
            int i10 = this.f15170g;
            if (i10 != 0) {
                iA += C1519b.c(6, i10);
            }
            int i11 = this.f15171h;
            if (i11 != 0) {
                iA += C1519b.c(7, i11);
            }
            int i12 = this.f15172i;
            if (i12 != 0) {
                iA += C1519b.c(8, i12);
            }
            int i13 = this.f15173j;
            if (i13 != 0) {
                iA += C1519b.a(9, i13);
            }
            int i14 = this.f15174k;
            if (i14 != 0) {
                iA += C1519b.a(10, i14);
            }
            int i15 = this.f15175l;
            if (i15 != 0) {
                iA += C1519b.a(11, i15);
            }
            long j11 = this.f15176m;
            if (j11 != 0) {
                iA += C1519b.b(12, j11);
            }
            int i16 = this.f15177n;
            return i16 != 0 ? iA + C1519b.a(13, i16) : iA;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public AbstractC1594e a(C1494a c1494a) throws IOException {
            while (true) {
                int iL = c1494a.l();
                switch (iL) {
                    case 0:
                        break;
                    case 8:
                        this.f15165b = c1494a.i();
                        break;
                    case 16:
                        this.f15166c = c1494a.i();
                        break;
                    case 24:
                        this.f15167d = c1494a.i();
                        break;
                    case 33:
                        this.f15168e = Double.longBitsToDouble(c1494a.g());
                        break;
                    case 41:
                        this.f15169f = Double.longBitsToDouble(c1494a.g());
                        break;
                    case 48:
                        this.f15170g = c1494a.h();
                        break;
                    case 56:
                        this.f15171h = c1494a.h();
                        break;
                    case 64:
                        this.f15172i = c1494a.h();
                        break;
                    case 72:
                        this.f15173j = c1494a.h();
                        break;
                    case 80:
                        int iH = c1494a.h();
                        if (iH == 0 || iH == 1 || iH == 2 || iH == 3) {
                            this.f15174k = iH;
                        }
                        break;
                    case 88:
                        int iH2 = c1494a.h();
                        if (iH2 == 0 || iH2 == 1 || iH2 == 2 || iH2 == 3) {
                            this.f15175l = iH2;
                        }
                        break;
                    case 96:
                        this.f15176m = c1494a.i();
                        break;
                    case 104:
                        int iH3 = c1494a.h();
                        if (iH3 == 0 || iH3 == 1 || iH3 == 2 || iH3 == 3 || iH3 == 4) {
                            this.f15177n = iH3;
                        }
                        break;
                    default:
                        if (!c1494a.f(iL)) {
                        }
                        break;
                }
            }
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public void a(C1519b c1519b) throws IOException {
            c1519b.e(1, this.f15165b);
            c1519b.e(2, this.f15166c);
            long j10 = this.f15167d;
            if (j10 != 0) {
                c1519b.e(3, j10);
            }
            c1519b.b(4, this.f15168e);
            c1519b.b(5, this.f15169f);
            int i10 = this.f15170g;
            if (i10 != 0) {
                c1519b.f(6, i10);
            }
            int i11 = this.f15171h;
            if (i11 != 0) {
                c1519b.f(7, i11);
            }
            int i12 = this.f15172i;
            if (i12 != 0) {
                c1519b.f(8, i12);
            }
            int i13 = this.f15173j;
            if (i13 != 0) {
                c1519b.d(9, i13);
            }
            int i14 = this.f15174k;
            if (i14 != 0) {
                c1519b.d(10, i14);
            }
            int i15 = this.f15175l;
            if (i15 != 0) {
                c1519b.d(11, i15);
            }
            long j11 = this.f15176m;
            if (j11 != 0) {
                c1519b.e(12, j11);
            }
            int i16 = this.f15177n;
            if (i16 != 0) {
                c1519b.d(13, i16);
            }
        }

        public b b() {
            this.f15165b = 0L;
            this.f15166c = 0L;
            this.f15167d = 0L;
            this.f15168e = 0.0d;
            this.f15169f = 0.0d;
            this.f15170g = 0;
            this.f15171h = 0;
            this.f15172i = 0;
            this.f15173j = 0;
            this.f15174k = 0;
            this.f15175l = 0;
            this.f15176m = 0L;
            this.f15177n = 0;
            this.f15981a = -1;
            return this;
        }
    }

    public Uf() {
        b();
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
    public int a() {
        int iA;
        b[] bVarArr = this.f15154b;
        int i10 = 0;
        if (bVarArr != null && bVarArr.length > 0) {
            int i11 = 0;
            iA = 0;
            while (true) {
                b[] bVarArr2 = this.f15154b;
                if (i11 >= bVarArr2.length) {
                    break;
                }
                b bVar = bVarArr2[i11];
                if (bVar != null) {
                    iA += C1519b.a(1, bVar);
                }
                i11++;
            }
        } else {
            iA = 0;
        }
        a[] aVarArr = this.f15155c;
        if (aVarArr != null && aVarArr.length > 0) {
            while (true) {
                a[] aVarArr2 = this.f15155c;
                if (i10 >= aVarArr2.length) {
                    break;
                }
                a aVar = aVarArr2[i10];
                if (aVar != null) {
                    iA += C1519b.a(2, aVar);
                }
                i10++;
            }
        }
        return iA;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
    public AbstractC1594e a(C1494a c1494a) throws IOException {
        while (true) {
            int iL = c1494a.l();
            if (iL == 0) {
                break;
            }
            if (iL == 10) {
                int iA = C1644g.a(c1494a, 10);
                b[] bVarArr = this.f15154b;
                int length = bVarArr == null ? 0 : bVarArr.length;
                int i10 = iA + length;
                b[] bVarArr2 = new b[i10];
                if (length != 0) {
                    System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
                }
                while (length < i10 - 1) {
                    bVarArr2[length] = new b();
                    c1494a.a(bVarArr2[length]);
                    c1494a.l();
                    length++;
                }
                bVarArr2[length] = new b();
                c1494a.a(bVarArr2[length]);
                this.f15154b = bVarArr2;
            } else if (iL == 18) {
                int iA2 = C1644g.a(c1494a, 18);
                a[] aVarArr = this.f15155c;
                int length2 = aVarArr == null ? 0 : aVarArr.length;
                int i11 = iA2 + length2;
                a[] aVarArr2 = new a[i11];
                if (length2 != 0) {
                    System.arraycopy(aVarArr, 0, aVarArr2, 0, length2);
                }
                while (length2 < i11 - 1) {
                    aVarArr2[length2] = new a();
                    c1494a.a(aVarArr2[length2]);
                    c1494a.l();
                    length2++;
                }
                aVarArr2[length2] = new a();
                c1494a.a(aVarArr2[length2]);
                this.f15155c = aVarArr2;
            } else if (!c1494a.f(iL)) {
                break;
            }
        }
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
    public void a(C1519b c1519b) throws IOException {
        b[] bVarArr = this.f15154b;
        int i10 = 0;
        if (bVarArr != null && bVarArr.length > 0) {
            int i11 = 0;
            while (true) {
                b[] bVarArr2 = this.f15154b;
                if (i11 >= bVarArr2.length) {
                    break;
                }
                b bVar = bVarArr2[i11];
                if (bVar != null) {
                    c1519b.b(1, bVar);
                }
                i11++;
            }
        }
        a[] aVarArr = this.f15155c;
        if (aVarArr == null || aVarArr.length <= 0) {
            return;
        }
        while (true) {
            a[] aVarArr2 = this.f15155c;
            if (i10 >= aVarArr2.length) {
                return;
            }
            a aVar = aVarArr2[i10];
            if (aVar != null) {
                c1519b.b(2, aVar);
            }
            i10++;
        }
    }

    public Uf b() {
        this.f15154b = b.c();
        this.f15155c = a.c();
        this.f15981a = -1;
        return this;
    }
}
