package com.yandex.metrica.impl.ob;

import java.io.IOException;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.hg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1686hg extends AbstractC1594e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a[] f16274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String[] f16275c;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.hg$a */
    public static final class a extends AbstractC1594e {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static volatile a[] f16276h;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f16277b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f16278c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f16279d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public C0180a[] f16280e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f16281f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int[] f16282g;

        /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.hg$a$a, reason: collision with other inner class name */
        public static final class C0180a extends AbstractC1594e {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static volatile C0180a[] f16283d;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public String f16284b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public String f16285c;

            public C0180a() {
                b();
            }

            public static C0180a[] c() {
                if (f16283d == null) {
                    synchronized (C1544c.f15862a) {
                        if (f16283d == null) {
                            f16283d = new C0180a[0];
                        }
                    }
                }
                return f16283d;
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC1594e
            public int a() {
                return C1519b.a(2, this.f16285c) + C1519b.a(1, this.f16284b) + 0;
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC1594e
            public AbstractC1594e a(C1494a c1494a) throws IOException {
                while (true) {
                    int iL = c1494a.l();
                    if (iL == 0) {
                        break;
                    }
                    if (iL == 10) {
                        this.f16284b = c1494a.k();
                    } else if (iL == 18) {
                        this.f16285c = c1494a.k();
                    } else if (!c1494a.f(iL)) {
                        break;
                    }
                }
                return this;
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC1594e
            public void a(C1519b c1519b) throws IOException {
                c1519b.b(1, this.f16284b);
                c1519b.b(2, this.f16285c);
            }

            public C0180a b() {
                this.f16284b = "";
                this.f16285c = "";
                this.f15981a = -1;
                return this;
            }
        }

        public a() {
            b();
        }

        public static a[] c() {
            if (f16276h == null) {
                synchronized (C1544c.f15862a) {
                    if (f16276h == null) {
                        f16276h = new a[0];
                    }
                }
            }
            return f16276h;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public int a() {
            int i10 = 0;
            int iA = C1519b.a(3, this.f16279d) + C1519b.a(2, this.f16278c) + C1519b.a(1, this.f16277b) + 0;
            C0180a[] c0180aArr = this.f16280e;
            if (c0180aArr != null && c0180aArr.length > 0) {
                int i11 = 0;
                while (true) {
                    C0180a[] c0180aArr2 = this.f16280e;
                    if (i11 >= c0180aArr2.length) {
                        break;
                    }
                    C0180a c0180a = c0180aArr2[i11];
                    if (c0180a != null) {
                        iA += C1519b.a(4, c0180a);
                    }
                    i11++;
                }
            }
            int iB = C1519b.b(5, this.f16281f) + iA;
            int[] iArr = this.f16282g;
            if (iArr == null || iArr.length <= 0) {
                return iB;
            }
            int iA2 = 0;
            while (true) {
                int[] iArr2 = this.f16282g;
                if (i10 >= iArr2.length) {
                    return iB + iA2 + (iArr2.length * 1);
                }
                iA2 += C1519b.a(iArr2[i10]);
                i10++;
            }
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public AbstractC1594e a(C1494a c1494a) throws IOException {
            while (true) {
                int iL = c1494a.l();
                if (iL == 0) {
                    break;
                }
                if (iL != 10) {
                    if (iL != 18) {
                        if (iL != 26) {
                            if (iL != 34) {
                                if (iL != 40) {
                                    if (iL != 48) {
                                        if (iL != 50) {
                                            if (!c1494a.f(iL)) {
                                                break;
                                            }
                                        } else {
                                            int iC = c1494a.c(c1494a.h());
                                            int iB = c1494a.b();
                                            int i10 = 0;
                                            while (c1494a.a() > 0) {
                                                int iH = c1494a.h();
                                                if (iH == 1 || iH == 2) {
                                                    i10++;
                                                }
                                            }
                                            if (i10 != 0) {
                                                c1494a.e(iB);
                                                int[] iArr = this.f16282g;
                                                int length = iArr == null ? 0 : iArr.length;
                                                int[] iArr2 = new int[i10 + length];
                                                if (length != 0) {
                                                    System.arraycopy(iArr, 0, iArr2, 0, length);
                                                }
                                                while (c1494a.a() > 0) {
                                                    int iH2 = c1494a.h();
                                                    if (iH2 == 1 || iH2 == 2) {
                                                        iArr2[length] = iH2;
                                                        length++;
                                                    }
                                                }
                                                this.f16282g = iArr2;
                                            }
                                            c1494a.b(iC);
                                        }
                                    } else {
                                        int iA = C1644g.a(c1494a, 48);
                                        int[] iArr3 = new int[iA];
                                        int i11 = 0;
                                        for (int i12 = 0; i12 < iA; i12++) {
                                            if (i12 != 0) {
                                                c1494a.l();
                                            }
                                            int iH3 = c1494a.h();
                                            if (iH3 == 1 || iH3 == 2) {
                                                iArr3[i11] = iH3;
                                                i11++;
                                            }
                                        }
                                        if (i11 != 0) {
                                            int[] iArr4 = this.f16282g;
                                            int length2 = iArr4 == null ? 0 : iArr4.length;
                                            if (length2 == 0 && i11 == iA) {
                                                this.f16282g = iArr3;
                                            } else {
                                                int[] iArr5 = new int[length2 + i11];
                                                if (length2 != 0) {
                                                    System.arraycopy(iArr4, 0, iArr5, 0, length2);
                                                }
                                                System.arraycopy(iArr3, 0, iArr5, length2, i11);
                                                this.f16282g = iArr5;
                                            }
                                        }
                                    }
                                } else {
                                    this.f16281f = c1494a.i();
                                }
                            } else {
                                int iA2 = C1644g.a(c1494a, 34);
                                C0180a[] c0180aArr = this.f16280e;
                                int length3 = c0180aArr == null ? 0 : c0180aArr.length;
                                int i13 = iA2 + length3;
                                C0180a[] c0180aArr2 = new C0180a[i13];
                                if (length3 != 0) {
                                    System.arraycopy(c0180aArr, 0, c0180aArr2, 0, length3);
                                }
                                while (length3 < i13 - 1) {
                                    c0180aArr2[length3] = new C0180a();
                                    c1494a.a(c0180aArr2[length3]);
                                    c1494a.l();
                                    length3++;
                                }
                                c0180aArr2[length3] = new C0180a();
                                c1494a.a(c0180aArr2[length3]);
                                this.f16280e = c0180aArr2;
                            }
                        } else {
                            this.f16279d = c1494a.k();
                        }
                    } else {
                        this.f16278c = c1494a.k();
                    }
                } else {
                    this.f16277b = c1494a.k();
                }
            }
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public void a(C1519b c1519b) throws IOException {
            c1519b.b(1, this.f16277b);
            c1519b.b(2, this.f16278c);
            c1519b.b(3, this.f16279d);
            C0180a[] c0180aArr = this.f16280e;
            int i10 = 0;
            if (c0180aArr != null && c0180aArr.length > 0) {
                int i11 = 0;
                while (true) {
                    C0180a[] c0180aArr2 = this.f16280e;
                    if (i11 >= c0180aArr2.length) {
                        break;
                    }
                    C0180a c0180a = c0180aArr2[i11];
                    if (c0180a != null) {
                        c1519b.b(4, c0180a);
                    }
                    i11++;
                }
            }
            c1519b.e(5, this.f16281f);
            int[] iArr = this.f16282g;
            if (iArr == null || iArr.length <= 0) {
                return;
            }
            while (true) {
                int[] iArr2 = this.f16282g;
                if (i10 >= iArr2.length) {
                    return;
                }
                c1519b.d(6, iArr2[i10]);
                i10++;
            }
        }

        public a b() {
            this.f16277b = "";
            this.f16278c = "";
            this.f16279d = "";
            this.f16280e = C0180a.c();
            this.f16281f = 0L;
            this.f16282g = C1644g.f16154a;
            this.f15981a = -1;
            return this;
        }
    }

    public C1686hg() {
        b();
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
    public int a() {
        int iA;
        a[] aVarArr = this.f16274b;
        int i10 = 0;
        if (aVarArr != null && aVarArr.length > 0) {
            int i11 = 0;
            iA = 0;
            while (true) {
                a[] aVarArr2 = this.f16274b;
                if (i11 >= aVarArr2.length) {
                    break;
                }
                a aVar = aVarArr2[i11];
                if (aVar != null) {
                    iA += C1519b.a(1, aVar);
                }
                i11++;
            }
        } else {
            iA = 0;
        }
        String[] strArr = this.f16275c;
        if (strArr == null || strArr.length <= 0) {
            return iA;
        }
        int iA2 = 0;
        int i12 = 0;
        while (true) {
            String[] strArr2 = this.f16275c;
            if (i10 >= strArr2.length) {
                return iA + iA2 + (i12 * 1);
            }
            String str = strArr2[i10];
            if (str != null) {
                i12++;
                iA2 = C1519b.a(str) + iA2;
            }
            i10++;
        }
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
                a[] aVarArr = this.f16274b;
                int length = aVarArr == null ? 0 : aVarArr.length;
                int i10 = iA + length;
                a[] aVarArr2 = new a[i10];
                if (length != 0) {
                    System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                }
                while (length < i10 - 1) {
                    aVarArr2[length] = new a();
                    c1494a.a(aVarArr2[length]);
                    c1494a.l();
                    length++;
                }
                aVarArr2[length] = new a();
                c1494a.a(aVarArr2[length]);
                this.f16274b = aVarArr2;
            } else if (iL == 18) {
                int iA2 = C1644g.a(c1494a, 18);
                String[] strArr = this.f16275c;
                int length2 = strArr == null ? 0 : strArr.length;
                int i11 = iA2 + length2;
                String[] strArr2 = new String[i11];
                if (length2 != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length2);
                }
                while (length2 < i11 - 1) {
                    strArr2[length2] = c1494a.k();
                    c1494a.l();
                    length2++;
                }
                strArr2[length2] = c1494a.k();
                this.f16275c = strArr2;
            } else if (!c1494a.f(iL)) {
                break;
            }
        }
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
    public void a(C1519b c1519b) throws IOException {
        a[] aVarArr = this.f16274b;
        int i10 = 0;
        if (aVarArr != null && aVarArr.length > 0) {
            int i11 = 0;
            while (true) {
                a[] aVarArr2 = this.f16274b;
                if (i11 >= aVarArr2.length) {
                    break;
                }
                a aVar = aVarArr2[i11];
                if (aVar != null) {
                    c1519b.b(1, aVar);
                }
                i11++;
            }
        }
        String[] strArr = this.f16275c;
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        while (true) {
            String[] strArr2 = this.f16275c;
            if (i10 >= strArr2.length) {
                return;
            }
            String str = strArr2[i10];
            if (str != null) {
                c1519b.b(2, str);
            }
            i10++;
        }
    }

    public C1686hg b() {
        this.f16274b = a.c();
        this.f16275c = C1644g.f16155b;
        this.f15981a = -1;
        return this;
    }
}
