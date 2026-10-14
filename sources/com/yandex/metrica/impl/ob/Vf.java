package com.yandex.metrica.impl.ob;

import ch.qos.logback.core.net.SyslogConstants;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class Vf extends AbstractC1594e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d[] f15235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f15236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a[] f15237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e[] f15238e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String[] f15239f;

    public static final class a extends AbstractC1594e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static volatile a[] f15240d;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f15241b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f15242c;

        public a() {
            b();
        }

        public static a[] c() {
            if (f15240d == null) {
                synchronized (C1544c.f15862a) {
                    if (f15240d == null) {
                        f15240d = new a[0];
                    }
                }
            }
            return f15240d;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public int a() {
            return C1519b.a(2, this.f15242c) + C1519b.a(1, this.f15241b) + 0;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public AbstractC1594e a(C1494a c1494a) throws IOException {
            while (true) {
                int iL = c1494a.l();
                if (iL == 0) {
                    break;
                }
                if (iL == 10) {
                    this.f15241b = c1494a.k();
                } else if (iL == 18) {
                    this.f15242c = c1494a.k();
                } else if (!c1494a.f(iL)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public void a(C1519b c1519b) throws IOException {
            c1519b.b(1, this.f15241b);
            c1519b.b(2, this.f15242c);
        }

        public a b() {
            this.f15241b = "";
            this.f15242c = "";
            this.f15981a = -1;
            return this;
        }
    }

    public static final class b extends AbstractC1594e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public double f15243b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public double f15244c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f15245d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f15246e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f15247f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f15248g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f15249h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f15250i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public String f15251j;

        public b() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public int a() {
            int iA = C1519b.a(2, this.f15244c) + C1519b.a(1, this.f15243b) + 0;
            long j10 = this.f15245d;
            if (j10 != 0) {
                iA += C1519b.b(3, j10);
            }
            int i10 = this.f15246e;
            if (i10 != 0) {
                iA += C1519b.c(4, i10);
            }
            int i11 = this.f15247f;
            if (i11 != 0) {
                iA += C1519b.c(5, i11);
            }
            int i12 = this.f15248g;
            if (i12 != 0) {
                iA += C1519b.c(6, i12);
            }
            int i13 = this.f15249h;
            if (i13 != 0) {
                iA += C1519b.a(7, i13);
            }
            int i14 = this.f15250i;
            if (i14 != 0) {
                iA += C1519b.a(8, i14);
            }
            return !this.f15251j.equals("") ? iA + C1519b.a(9, this.f15251j) : iA;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public AbstractC1594e a(C1494a c1494a) throws IOException {
            while (true) {
                int iL = c1494a.l();
                if (iL == 0) {
                    break;
                }
                if (iL == 9) {
                    this.f15243b = Double.longBitsToDouble(c1494a.g());
                } else if (iL == 17) {
                    this.f15244c = Double.longBitsToDouble(c1494a.g());
                } else if (iL == 24) {
                    this.f15245d = c1494a.i();
                } else if (iL == 32) {
                    this.f15246e = c1494a.h();
                } else if (iL == 40) {
                    this.f15247f = c1494a.h();
                } else if (iL == 48) {
                    this.f15248g = c1494a.h();
                } else if (iL == 56) {
                    this.f15249h = c1494a.h();
                } else if (iL == 64) {
                    int iH = c1494a.h();
                    if (iH == 0 || iH == 1 || iH == 2) {
                        this.f15250i = iH;
                    }
                } else if (iL == 74) {
                    this.f15251j = c1494a.k();
                } else if (!c1494a.f(iL)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public void a(C1519b c1519b) throws IOException {
            c1519b.b(1, this.f15243b);
            c1519b.b(2, this.f15244c);
            long j10 = this.f15245d;
            if (j10 != 0) {
                c1519b.e(3, j10);
            }
            int i10 = this.f15246e;
            if (i10 != 0) {
                c1519b.f(4, i10);
            }
            int i11 = this.f15247f;
            if (i11 != 0) {
                c1519b.f(5, i11);
            }
            int i12 = this.f15248g;
            if (i12 != 0) {
                c1519b.f(6, i12);
            }
            int i13 = this.f15249h;
            if (i13 != 0) {
                c1519b.d(7, i13);
            }
            int i14 = this.f15250i;
            if (i14 != 0) {
                c1519b.d(8, i14);
            }
            if (this.f15251j.equals("")) {
                return;
            }
            c1519b.b(9, this.f15251j);
        }

        public b b() {
            this.f15243b = 0.0d;
            this.f15244c = 0.0d;
            this.f15245d = 0L;
            this.f15246e = 0;
            this.f15247f = 0;
            this.f15248g = 0;
            this.f15249h = 0;
            this.f15250i = 0;
            this.f15251j = "";
            this.f15981a = -1;
            return this;
        }
    }

    public static final class c extends AbstractC1594e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f15252b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f15253c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f15254d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f15255e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f15256f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f15257g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f15258h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f15259i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public String f15260j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f15261k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f15262l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public a[] f15263m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public String f15264n;

        public static final class a extends AbstractC1594e {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static volatile a[] f15265d;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public String f15266b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public long f15267c;

            public a() {
                b();
            }

            public static a[] c() {
                if (f15265d == null) {
                    synchronized (C1544c.f15862a) {
                        if (f15265d == null) {
                            f15265d = new a[0];
                        }
                    }
                }
                return f15265d;
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC1594e
            public int a() {
                return C1519b.b(2, this.f15267c) + C1519b.a(1, this.f15266b) + 0;
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC1594e
            public AbstractC1594e a(C1494a c1494a) throws IOException {
                while (true) {
                    int iL = c1494a.l();
                    if (iL == 0) {
                        break;
                    }
                    if (iL == 10) {
                        this.f15266b = c1494a.k();
                    } else if (iL == 16) {
                        this.f15267c = c1494a.i();
                    } else if (!c1494a.f(iL)) {
                        break;
                    }
                }
                return this;
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC1594e
            public void a(C1519b c1519b) throws IOException {
                c1519b.b(1, this.f15266b);
                c1519b.e(2, this.f15267c);
            }

            public a b() {
                this.f15266b = "";
                this.f15267c = 0L;
                this.f15981a = -1;
                return this;
            }
        }

        public c() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public int a() {
            int i10 = 0;
            int iA = !this.f15252b.equals("") ? C1519b.a(1, this.f15252b) + 0 : 0;
            if (!this.f15253c.equals("")) {
                iA += C1519b.a(2, this.f15253c);
            }
            if (!this.f15254d.equals("")) {
                iA += C1519b.a(4, this.f15254d);
            }
            int i11 = this.f15255e;
            if (i11 != 0) {
                iA += C1519b.c(5, i11);
            }
            if (!this.f15256f.equals("")) {
                iA += C1519b.a(10, this.f15256f);
            }
            if (!this.f15257g.equals("")) {
                iA += C1519b.a(15, this.f15257g);
            }
            boolean z10 = this.f15258h;
            if (z10) {
                iA += C1519b.a(17, z10);
            }
            int i12 = this.f15259i;
            if (i12 != 0) {
                iA += C1519b.c(18, i12);
            }
            if (!this.f15260j.equals("")) {
                iA += C1519b.a(19, this.f15260j);
            }
            if (!this.f15261k.equals("")) {
                iA += C1519b.a(21, this.f15261k);
            }
            int i13 = this.f15262l;
            if (i13 != 0) {
                iA += C1519b.c(22, i13);
            }
            a[] aVarArr = this.f15263m;
            if (aVarArr != null && aVarArr.length > 0) {
                while (true) {
                    a[] aVarArr2 = this.f15263m;
                    if (i10 >= aVarArr2.length) {
                        break;
                    }
                    a aVar = aVarArr2[i10];
                    if (aVar != null) {
                        iA += C1519b.a(23, aVar);
                    }
                    i10++;
                }
            }
            return !this.f15264n.equals("") ? iA + C1519b.a(24, this.f15264n) : iA;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public AbstractC1594e a(C1494a c1494a) throws IOException {
            while (true) {
                int iL = c1494a.l();
                switch (iL) {
                    case 0:
                        break;
                    case 10:
                        this.f15252b = c1494a.k();
                        break;
                    case 18:
                        this.f15253c = c1494a.k();
                        break;
                    case 34:
                        this.f15254d = c1494a.k();
                        break;
                    case 40:
                        this.f15255e = c1494a.h();
                        break;
                    case 82:
                        this.f15256f = c1494a.k();
                        break;
                    case 122:
                        this.f15257g = c1494a.k();
                        break;
                    case SyslogConstants.LOG_LOCAL1 /* 136 */:
                        this.f15258h = c1494a.c();
                        break;
                    case SyslogConstants.LOG_LOCAL2 /* 144 */:
                        this.f15259i = c1494a.h();
                        break;
                    case 154:
                        this.f15260j = c1494a.k();
                        break;
                    case 170:
                        this.f15261k = c1494a.k();
                        break;
                    case SyslogConstants.LOG_LOCAL6 /* 176 */:
                        this.f15262l = c1494a.h();
                        break;
                    case 186:
                        int iA = C1644g.a(c1494a, 186);
                        a[] aVarArr = this.f15263m;
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
                        this.f15263m = aVarArr2;
                        break;
                    case 194:
                        this.f15264n = c1494a.k();
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
            if (!this.f15252b.equals("")) {
                c1519b.b(1, this.f15252b);
            }
            if (!this.f15253c.equals("")) {
                c1519b.b(2, this.f15253c);
            }
            if (!this.f15254d.equals("")) {
                c1519b.b(4, this.f15254d);
            }
            int i10 = this.f15255e;
            if (i10 != 0) {
                c1519b.f(5, i10);
            }
            if (!this.f15256f.equals("")) {
                c1519b.b(10, this.f15256f);
            }
            if (!this.f15257g.equals("")) {
                c1519b.b(15, this.f15257g);
            }
            boolean z10 = this.f15258h;
            if (z10) {
                c1519b.b(17, z10);
            }
            int i11 = this.f15259i;
            if (i11 != 0) {
                c1519b.f(18, i11);
            }
            if (!this.f15260j.equals("")) {
                c1519b.b(19, this.f15260j);
            }
            if (!this.f15261k.equals("")) {
                c1519b.b(21, this.f15261k);
            }
            int i12 = this.f15262l;
            if (i12 != 0) {
                c1519b.f(22, i12);
            }
            a[] aVarArr = this.f15263m;
            if (aVarArr != null && aVarArr.length > 0) {
                int i13 = 0;
                while (true) {
                    a[] aVarArr2 = this.f15263m;
                    if (i13 >= aVarArr2.length) {
                        break;
                    }
                    a aVar = aVarArr2[i13];
                    if (aVar != null) {
                        c1519b.b(23, aVar);
                    }
                    i13++;
                }
            }
            if (this.f15264n.equals("")) {
                return;
            }
            c1519b.b(24, this.f15264n);
        }

        public c b() {
            this.f15252b = "";
            this.f15253c = "";
            this.f15254d = "";
            this.f15255e = 0;
            this.f15256f = "";
            this.f15257g = "";
            this.f15258h = false;
            this.f15259i = 0;
            this.f15260j = "";
            this.f15261k = "";
            this.f15262l = 0;
            this.f15263m = a.c();
            this.f15264n = "";
            this.f15981a = -1;
            return this;
        }
    }

    public static final class d extends AbstractC1594e {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static volatile d[] f15268e;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f15269b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public b f15270c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public a[] f15271d;

        public static final class a extends AbstractC1594e {

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            private static volatile a[] f15272y;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public long f15273b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public long f15274c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f15275d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public String f15276e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public byte[] f15277f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public b f15278g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public b f15279h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public String f15280i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public C0178a f15281j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public int f15282k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public int f15283l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public int f15284m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public byte[] f15285n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public int f15286o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public long f15287p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            public long f15288q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public int f15289r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public int f15290s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f15291t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public int f15292u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public int f15293v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public boolean f15294w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public long f15295x;

            /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.Vf$d$a$a, reason: collision with other inner class name */
            public static final class C0178a extends AbstractC1594e {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public String f15296b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public String f15297c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public String f15298d;

                public C0178a() {
                    b();
                }

                @Override // com.yandex.metrica.impl.ob.AbstractC1594e
                public int a() {
                    int iA = C1519b.a(1, this.f15296b) + 0;
                    if (!this.f15297c.equals("")) {
                        iA += C1519b.a(2, this.f15297c);
                    }
                    return !this.f15298d.equals("") ? iA + C1519b.a(3, this.f15298d) : iA;
                }

                @Override // com.yandex.metrica.impl.ob.AbstractC1594e
                public AbstractC1594e a(C1494a c1494a) throws IOException {
                    while (true) {
                        int iL = c1494a.l();
                        if (iL == 0) {
                            break;
                        }
                        if (iL == 10) {
                            this.f15296b = c1494a.k();
                        } else if (iL == 18) {
                            this.f15297c = c1494a.k();
                        } else if (iL == 26) {
                            this.f15298d = c1494a.k();
                        } else if (!c1494a.f(iL)) {
                            break;
                        }
                    }
                    return this;
                }

                @Override // com.yandex.metrica.impl.ob.AbstractC1594e
                public void a(C1519b c1519b) throws IOException {
                    c1519b.b(1, this.f15296b);
                    if (!this.f15297c.equals("")) {
                        c1519b.b(2, this.f15297c);
                    }
                    if (this.f15298d.equals("")) {
                        return;
                    }
                    c1519b.b(3, this.f15298d);
                }

                public C0178a b() {
                    this.f15296b = "";
                    this.f15297c = "";
                    this.f15298d = "";
                    this.f15981a = -1;
                    return this;
                }
            }

            public static final class b extends AbstractC1594e {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public Tf[] f15299b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public Wf[] f15300c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public int f15301d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public String f15302e;

                public b() {
                    b();
                }

                @Override // com.yandex.metrica.impl.ob.AbstractC1594e
                public int a() {
                    int iA;
                    Tf[] tfArr = this.f15299b;
                    int i10 = 0;
                    if (tfArr != null && tfArr.length > 0) {
                        int i11 = 0;
                        iA = 0;
                        while (true) {
                            Tf[] tfArr2 = this.f15299b;
                            if (i11 >= tfArr2.length) {
                                break;
                            }
                            Tf tf = tfArr2[i11];
                            if (tf != null) {
                                iA += C1519b.a(1, tf);
                            }
                            i11++;
                        }
                    } else {
                        iA = 0;
                    }
                    Wf[] wfArr = this.f15300c;
                    if (wfArr != null && wfArr.length > 0) {
                        while (true) {
                            Wf[] wfArr2 = this.f15300c;
                            if (i10 >= wfArr2.length) {
                                break;
                            }
                            Wf wf = wfArr2[i10];
                            if (wf != null) {
                                iA += C1519b.a(2, wf);
                            }
                            i10++;
                        }
                    }
                    int i12 = this.f15301d;
                    if (i12 != 2) {
                        iA += C1519b.a(3, i12);
                    }
                    return !this.f15302e.equals("") ? iA + C1519b.a(4, this.f15302e) : iA;
                }

                @Override // com.yandex.metrica.impl.ob.AbstractC1594e
                public AbstractC1594e a(C1494a c1494a) throws IOException {
                    while (true) {
                        int iL = c1494a.l();
                        if (iL != 0) {
                            if (iL == 10) {
                                int iA = C1644g.a(c1494a, 10);
                                Tf[] tfArr = this.f15299b;
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
                                this.f15299b = tfArr2;
                            } else if (iL == 18) {
                                int iA2 = C1644g.a(c1494a, 18);
                                Wf[] wfArr = this.f15300c;
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
                                this.f15300c = wfArr2;
                            } else if (iL == 24) {
                                int iH = c1494a.h();
                                switch (iH) {
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                        this.f15301d = iH;
                                        break;
                                }
                            } else if (iL == 34) {
                                this.f15302e = c1494a.k();
                            } else if (!c1494a.f(iL)) {
                            }
                        }
                    }
                    return this;
                }

                @Override // com.yandex.metrica.impl.ob.AbstractC1594e
                public void a(C1519b c1519b) throws IOException {
                    Tf[] tfArr = this.f15299b;
                    int i10 = 0;
                    if (tfArr != null && tfArr.length > 0) {
                        int i11 = 0;
                        while (true) {
                            Tf[] tfArr2 = this.f15299b;
                            if (i11 >= tfArr2.length) {
                                break;
                            }
                            Tf tf = tfArr2[i11];
                            if (tf != null) {
                                c1519b.b(1, tf);
                            }
                            i11++;
                        }
                    }
                    Wf[] wfArr = this.f15300c;
                    if (wfArr != null && wfArr.length > 0) {
                        while (true) {
                            Wf[] wfArr2 = this.f15300c;
                            if (i10 >= wfArr2.length) {
                                break;
                            }
                            Wf wf = wfArr2[i10];
                            if (wf != null) {
                                c1519b.b(2, wf);
                            }
                            i10++;
                        }
                    }
                    int i12 = this.f15301d;
                    if (i12 != 2) {
                        c1519b.d(3, i12);
                    }
                    if (this.f15302e.equals("")) {
                        return;
                    }
                    c1519b.b(4, this.f15302e);
                }

                public b b() {
                    this.f15299b = Tf.c();
                    this.f15300c = Wf.c();
                    this.f15301d = 2;
                    this.f15302e = "";
                    this.f15981a = -1;
                    return this;
                }
            }

            public a() {
                b();
            }

            public static a[] c() {
                if (f15272y == null) {
                    synchronized (C1544c.f15862a) {
                        if (f15272y == null) {
                            f15272y = new a[0];
                        }
                    }
                }
                return f15272y;
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC1594e
            public int a() {
                int iC = C1519b.c(3, this.f15275d) + C1519b.b(2, this.f15274c) + C1519b.b(1, this.f15273b) + 0;
                if (!this.f15276e.equals("")) {
                    iC += C1519b.a(4, this.f15276e);
                }
                byte[] bArr = this.f15277f;
                byte[] bArr2 = C1644g.f16157d;
                if (!Arrays.equals(bArr, bArr2)) {
                    iC += C1519b.a(5, this.f15277f);
                }
                b bVar = this.f15278g;
                if (bVar != null) {
                    iC += C1519b.a(6, bVar);
                }
                b bVar2 = this.f15279h;
                if (bVar2 != null) {
                    iC += C1519b.a(7, bVar2);
                }
                if (!this.f15280i.equals("")) {
                    iC += C1519b.a(8, this.f15280i);
                }
                C0178a c0178a = this.f15281j;
                if (c0178a != null) {
                    iC += C1519b.a(9, c0178a);
                }
                int i10 = this.f15282k;
                if (i10 != 0) {
                    iC += C1519b.c(10, i10);
                }
                int i11 = this.f15283l;
                if (i11 != 0) {
                    iC += C1519b.a(12, i11);
                }
                int i12 = this.f15284m;
                if (i12 != -1) {
                    iC += C1519b.a(13, i12);
                }
                if (!Arrays.equals(this.f15285n, bArr2)) {
                    iC += C1519b.a(14, this.f15285n);
                }
                int i13 = this.f15286o;
                if (i13 != -1) {
                    iC += C1519b.a(15, i13);
                }
                long j10 = this.f15287p;
                if (j10 != 0) {
                    iC += C1519b.b(16, j10);
                }
                long j11 = this.f15288q;
                if (j11 != 0) {
                    iC += C1519b.b(17, j11);
                }
                int i14 = this.f15289r;
                if (i14 != 0) {
                    iC += C1519b.a(18, i14);
                }
                int i15 = this.f15290s;
                if (i15 != 0) {
                    iC += C1519b.a(19, i15);
                }
                int i16 = this.f15291t;
                if (i16 != -1) {
                    iC += C1519b.a(20, i16);
                }
                int i17 = this.f15292u;
                if (i17 != 0) {
                    iC += C1519b.a(21, i17);
                }
                int i18 = this.f15293v;
                if (i18 != 0) {
                    iC += C1519b.a(22, i18);
                }
                boolean z10 = this.f15294w;
                if (z10) {
                    iC += C1519b.a(23, z10);
                }
                long j12 = this.f15295x;
                return j12 != 1 ? iC + C1519b.b(24, j12) : iC;
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
                            this.f15273b = c1494a.i();
                            continue;
                        case 16:
                            this.f15274c = c1494a.i();
                            continue;
                        case 24:
                            this.f15275d = c1494a.h();
                            continue;
                        case 34:
                            this.f15276e = c1494a.k();
                            continue;
                        case 42:
                            this.f15277f = c1494a.d();
                            continue;
                        case 50:
                            if (this.f15278g == null) {
                                this.f15278g = new b();
                            }
                            abstractC1594e = this.f15278g;
                            break;
                        case 58:
                            if (this.f15279h == null) {
                                this.f15279h = new b();
                            }
                            abstractC1594e = this.f15279h;
                            break;
                        case 66:
                            this.f15280i = c1494a.k();
                            continue;
                        case 74:
                            if (this.f15281j == null) {
                                this.f15281j = new C0178a();
                            }
                            abstractC1594e = this.f15281j;
                            break;
                        case 80:
                            this.f15282k = c1494a.h();
                            continue;
                        case 96:
                            int iH = c1494a.h();
                            if (iH == 0 || iH == 1 || iH == 2) {
                                this.f15283l = iH;
                            } else {
                                continue;
                            }
                            break;
                        case 104:
                            int iH2 = c1494a.h();
                            if (iH2 == -1 || iH2 == 0 || iH2 == 1) {
                                this.f15284m = iH2;
                            } else {
                                continue;
                            }
                            break;
                        case 114:
                            this.f15285n = c1494a.d();
                            continue;
                        case 120:
                            int iH3 = c1494a.h();
                            if (iH3 == -1 || iH3 == 0 || iH3 == 1) {
                                this.f15286o = iH3;
                            } else {
                                continue;
                            }
                            break;
                        case 128:
                            this.f15287p = c1494a.i();
                            continue;
                        case SyslogConstants.LOG_LOCAL1 /* 136 */:
                            this.f15288q = c1494a.i();
                            continue;
                        case SyslogConstants.LOG_LOCAL2 /* 144 */:
                            int iH4 = c1494a.h();
                            if (iH4 == 0 || iH4 == 1 || iH4 == 2 || iH4 == 3 || iH4 == 4) {
                                this.f15289r = iH4;
                            } else {
                                continue;
                            }
                            break;
                        case SyslogConstants.LOG_LOCAL3 /* 152 */:
                            int iH5 = c1494a.h();
                            if (iH5 == 0 || iH5 == 1 || iH5 == 2 || iH5 == 3) {
                                this.f15290s = iH5;
                            } else {
                                continue;
                            }
                            break;
                        case SyslogConstants.LOG_LOCAL4 /* 160 */:
                            int iH6 = c1494a.h();
                            if (iH6 == -1 || iH6 == 0 || iH6 == 1) {
                                this.f15291t = iH6;
                            } else {
                                continue;
                            }
                            break;
                        case 168:
                            int iH7 = c1494a.h();
                            if (iH7 == 0 || iH7 == 1 || iH7 == 2 || iH7 == 3) {
                                this.f15292u = iH7;
                            } else {
                                continue;
                            }
                            break;
                        case SyslogConstants.LOG_LOCAL6 /* 176 */:
                            int iH8 = c1494a.h();
                            if (iH8 == 0 || iH8 == 1) {
                                this.f15293v = iH8;
                            } else {
                                continue;
                            }
                            break;
                        case SyslogConstants.LOG_LOCAL7 /* 184 */:
                            this.f15294w = c1494a.c();
                            continue;
                        case 192:
                            this.f15295x = c1494a.i();
                            continue;
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
                c1519b.e(1, this.f15273b);
                c1519b.e(2, this.f15274c);
                c1519b.f(3, this.f15275d);
                if (!this.f15276e.equals("")) {
                    c1519b.b(4, this.f15276e);
                }
                byte[] bArr = this.f15277f;
                byte[] bArr2 = C1644g.f16157d;
                if (!Arrays.equals(bArr, bArr2)) {
                    c1519b.b(5, this.f15277f);
                }
                b bVar = this.f15278g;
                if (bVar != null) {
                    c1519b.b(6, bVar);
                }
                b bVar2 = this.f15279h;
                if (bVar2 != null) {
                    c1519b.b(7, bVar2);
                }
                if (!this.f15280i.equals("")) {
                    c1519b.b(8, this.f15280i);
                }
                C0178a c0178a = this.f15281j;
                if (c0178a != null) {
                    c1519b.b(9, c0178a);
                }
                int i10 = this.f15282k;
                if (i10 != 0) {
                    c1519b.f(10, i10);
                }
                int i11 = this.f15283l;
                if (i11 != 0) {
                    c1519b.d(12, i11);
                }
                int i12 = this.f15284m;
                if (i12 != -1) {
                    c1519b.d(13, i12);
                }
                if (!Arrays.equals(this.f15285n, bArr2)) {
                    c1519b.b(14, this.f15285n);
                }
                int i13 = this.f15286o;
                if (i13 != -1) {
                    c1519b.d(15, i13);
                }
                long j10 = this.f15287p;
                if (j10 != 0) {
                    c1519b.e(16, j10);
                }
                long j11 = this.f15288q;
                if (j11 != 0) {
                    c1519b.e(17, j11);
                }
                int i14 = this.f15289r;
                if (i14 != 0) {
                    c1519b.d(18, i14);
                }
                int i15 = this.f15290s;
                if (i15 != 0) {
                    c1519b.d(19, i15);
                }
                int i16 = this.f15291t;
                if (i16 != -1) {
                    c1519b.d(20, i16);
                }
                int i17 = this.f15292u;
                if (i17 != 0) {
                    c1519b.d(21, i17);
                }
                int i18 = this.f15293v;
                if (i18 != 0) {
                    c1519b.d(22, i18);
                }
                boolean z10 = this.f15294w;
                if (z10) {
                    c1519b.b(23, z10);
                }
                long j12 = this.f15295x;
                if (j12 != 1) {
                    c1519b.e(24, j12);
                }
            }

            public a b() {
                this.f15273b = 0L;
                this.f15274c = 0L;
                this.f15275d = 0;
                this.f15276e = "";
                byte[] bArr = C1644g.f16157d;
                this.f15277f = bArr;
                this.f15278g = null;
                this.f15279h = null;
                this.f15280i = "";
                this.f15281j = null;
                this.f15282k = 0;
                this.f15283l = 0;
                this.f15284m = -1;
                this.f15285n = bArr;
                this.f15286o = -1;
                this.f15287p = 0L;
                this.f15288q = 0L;
                this.f15289r = 0;
                this.f15290s = 0;
                this.f15291t = -1;
                this.f15292u = 0;
                this.f15293v = 0;
                this.f15294w = false;
                this.f15295x = 1L;
                this.f15981a = -1;
                return this;
            }
        }

        public static final class b extends AbstractC1594e {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public f f15303b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public String f15304c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f15305d;

            public b() {
                b();
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC1594e
            public int a() {
                f fVar = this.f15303b;
                int iA = C1519b.a(2, this.f15304c) + (fVar != null ? 0 + C1519b.a(1, fVar) : 0);
                int i10 = this.f15305d;
                return i10 != 0 ? iA + C1519b.a(5, i10) : iA;
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC1594e
            public AbstractC1594e a(C1494a c1494a) throws IOException {
                while (true) {
                    int iL = c1494a.l();
                    if (iL == 0) {
                        break;
                    }
                    if (iL == 10) {
                        if (this.f15303b == null) {
                            this.f15303b = new f();
                        }
                        c1494a.a(this.f15303b);
                    } else if (iL == 18) {
                        this.f15304c = c1494a.k();
                    } else if (iL == 40) {
                        int iH = c1494a.h();
                        if (iH == 0 || iH == 1 || iH == 2) {
                            this.f15305d = iH;
                        }
                    } else if (!c1494a.f(iL)) {
                        break;
                    }
                }
                return this;
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC1594e
            public void a(C1519b c1519b) throws IOException {
                f fVar = this.f15303b;
                if (fVar != null) {
                    c1519b.b(1, fVar);
                }
                c1519b.b(2, this.f15304c);
                int i10 = this.f15305d;
                if (i10 != 0) {
                    c1519b.d(5, i10);
                }
            }

            public b b() {
                this.f15303b = null;
                this.f15304c = "";
                this.f15305d = 0;
                this.f15981a = -1;
                return this;
            }
        }

        public d() {
            b();
        }

        public static d[] c() {
            if (f15268e == null) {
                synchronized (C1544c.f15862a) {
                    if (f15268e == null) {
                        f15268e = new d[0];
                    }
                }
            }
            return f15268e;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public int a() {
            int i10 = 0;
            int iB = C1519b.b(1, this.f15269b) + 0;
            b bVar = this.f15270c;
            if (bVar != null) {
                iB += C1519b.a(2, bVar);
            }
            a[] aVarArr = this.f15271d;
            if (aVarArr != null && aVarArr.length > 0) {
                while (true) {
                    a[] aVarArr2 = this.f15271d;
                    if (i10 >= aVarArr2.length) {
                        break;
                    }
                    a aVar = aVarArr2[i10];
                    if (aVar != null) {
                        iB += C1519b.a(3, aVar);
                    }
                    i10++;
                }
            }
            return iB;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public AbstractC1594e a(C1494a c1494a) throws IOException {
            while (true) {
                int iL = c1494a.l();
                if (iL == 0) {
                    break;
                }
                if (iL == 8) {
                    this.f15269b = c1494a.i();
                } else if (iL == 18) {
                    if (this.f15270c == null) {
                        this.f15270c = new b();
                    }
                    c1494a.a(this.f15270c);
                } else if (iL == 26) {
                    int iA = C1644g.a(c1494a, 26);
                    a[] aVarArr = this.f15271d;
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
                    this.f15271d = aVarArr2;
                } else if (!c1494a.f(iL)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public void a(C1519b c1519b) throws IOException {
            c1519b.e(1, this.f15269b);
            b bVar = this.f15270c;
            if (bVar != null) {
                c1519b.b(2, bVar);
            }
            a[] aVarArr = this.f15271d;
            if (aVarArr == null || aVarArr.length <= 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                a[] aVarArr2 = this.f15271d;
                if (i10 >= aVarArr2.length) {
                    return;
                }
                a aVar = aVarArr2[i10];
                if (aVar != null) {
                    c1519b.b(3, aVar);
                }
                i10++;
            }
        }

        public d b() {
            this.f15269b = 0L;
            this.f15270c = null;
            this.f15271d = a.c();
            this.f15981a = -1;
            return this;
        }
    }

    public static final class e extends AbstractC1594e {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static volatile e[] f15306f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f15307b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f15308c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f15309d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f15310e;

        public e() {
            b();
        }

        public static e[] c() {
            if (f15306f == null) {
                synchronized (C1544c.f15862a) {
                    if (f15306f == null) {
                        f15306f = new e[0];
                    }
                }
            }
            return f15306f;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public int a() {
            int i10 = this.f15307b;
            int iC = i10 != 0 ? 0 + C1519b.c(1, i10) : 0;
            int i11 = this.f15308c;
            if (i11 != 0) {
                iC += C1519b.c(2, i11);
            }
            if (!this.f15309d.equals("")) {
                iC += C1519b.a(3, this.f15309d);
            }
            boolean z10 = this.f15310e;
            return z10 ? iC + C1519b.a(4, z10) : iC;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public AbstractC1594e a(C1494a c1494a) throws IOException {
            while (true) {
                int iL = c1494a.l();
                if (iL == 0) {
                    break;
                }
                if (iL == 8) {
                    this.f15307b = c1494a.h();
                } else if (iL == 16) {
                    this.f15308c = c1494a.h();
                } else if (iL == 26) {
                    this.f15309d = c1494a.k();
                } else if (iL == 32) {
                    this.f15310e = c1494a.c();
                } else if (!c1494a.f(iL)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public void a(C1519b c1519b) throws IOException {
            int i10 = this.f15307b;
            if (i10 != 0) {
                c1519b.f(1, i10);
            }
            int i11 = this.f15308c;
            if (i11 != 0) {
                c1519b.f(2, i11);
            }
            if (!this.f15309d.equals("")) {
                c1519b.b(3, this.f15309d);
            }
            boolean z10 = this.f15310e;
            if (z10) {
                c1519b.b(4, z10);
            }
        }

        public e b() {
            this.f15307b = 0;
            this.f15308c = 0;
            this.f15309d = "";
            this.f15310e = false;
            this.f15981a = -1;
            return this;
        }
    }

    public static final class f extends AbstractC1594e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f15311b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f15312c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f15313d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f15314e;

        public f() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public int a() {
            int iB = C1519b.b(2, this.f15312c) + C1519b.b(1, this.f15311b) + 0;
            long j10 = this.f15313d;
            if (j10 != 0) {
                iB += C1519b.a(3, j10);
            }
            boolean z10 = this.f15314e;
            return z10 ? iB + C1519b.a(4, z10) : iB;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public AbstractC1594e a(C1494a c1494a) throws IOException {
            while (true) {
                int iL = c1494a.l();
                if (iL == 0) {
                    break;
                }
                if (iL == 8) {
                    this.f15311b = c1494a.i();
                } else if (iL == 16) {
                    this.f15312c = c1494a.j();
                } else if (iL == 24) {
                    this.f15313d = c1494a.i();
                } else if (iL == 32) {
                    this.f15314e = c1494a.c();
                } else if (!c1494a.f(iL)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public void a(C1519b c1519b) throws IOException {
            c1519b.e(1, this.f15311b);
            c1519b.e(2, this.f15312c);
            long j10 = this.f15313d;
            if (j10 != 0) {
                c1519b.c(3, j10);
            }
            boolean z10 = this.f15314e;
            if (z10) {
                c1519b.b(4, z10);
            }
        }

        public f b() {
            this.f15311b = 0L;
            this.f15312c = 0;
            this.f15313d = 0L;
            this.f15314e = false;
            this.f15981a = -1;
            return this;
        }
    }

    public Vf() {
        b();
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
    public int a() {
        int iA;
        d[] dVarArr = this.f15235b;
        int i10 = 0;
        if (dVarArr != null && dVarArr.length > 0) {
            int i11 = 0;
            iA = 0;
            while (true) {
                d[] dVarArr2 = this.f15235b;
                if (i11 >= dVarArr2.length) {
                    break;
                }
                d dVar = dVarArr2[i11];
                if (dVar != null) {
                    iA += C1519b.a(3, dVar);
                }
                i11++;
            }
        } else {
            iA = 0;
        }
        c cVar = this.f15236c;
        if (cVar != null) {
            iA += C1519b.a(4, cVar);
        }
        a[] aVarArr = this.f15237d;
        if (aVarArr != null && aVarArr.length > 0) {
            int i12 = 0;
            while (true) {
                a[] aVarArr2 = this.f15237d;
                if (i12 >= aVarArr2.length) {
                    break;
                }
                a aVar = aVarArr2[i12];
                if (aVar != null) {
                    iA = C1519b.a(7, aVar) + iA;
                }
                i12++;
            }
        }
        e[] eVarArr = this.f15238e;
        if (eVarArr != null && eVarArr.length > 0) {
            int i13 = 0;
            while (true) {
                e[] eVarArr2 = this.f15238e;
                if (i13 >= eVarArr2.length) {
                    break;
                }
                e eVar = eVarArr2[i13];
                if (eVar != null) {
                    iA += C1519b.a(10, eVar);
                }
                i13++;
            }
        }
        String[] strArr = this.f15239f;
        if (strArr == null || strArr.length <= 0) {
            return iA;
        }
        int iA2 = 0;
        int i14 = 0;
        while (true) {
            String[] strArr2 = this.f15239f;
            if (i10 >= strArr2.length) {
                return iA + iA2 + (i14 * 1);
            }
            String str = strArr2[i10];
            if (str != null) {
                i14++;
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
            if (iL == 26) {
                int iA = C1644g.a(c1494a, 26);
                d[] dVarArr = this.f15235b;
                int length = dVarArr == null ? 0 : dVarArr.length;
                int i10 = iA + length;
                d[] dVarArr2 = new d[i10];
                if (length != 0) {
                    System.arraycopy(dVarArr, 0, dVarArr2, 0, length);
                }
                while (length < i10 - 1) {
                    dVarArr2[length] = new d();
                    c1494a.a(dVarArr2[length]);
                    c1494a.l();
                    length++;
                }
                dVarArr2[length] = new d();
                c1494a.a(dVarArr2[length]);
                this.f15235b = dVarArr2;
            } else if (iL == 34) {
                if (this.f15236c == null) {
                    this.f15236c = new c();
                }
                c1494a.a(this.f15236c);
            } else if (iL == 58) {
                int iA2 = C1644g.a(c1494a, 58);
                a[] aVarArr = this.f15237d;
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
                this.f15237d = aVarArr2;
            } else if (iL == 82) {
                int iA3 = C1644g.a(c1494a, 82);
                e[] eVarArr = this.f15238e;
                int length3 = eVarArr == null ? 0 : eVarArr.length;
                int i12 = iA3 + length3;
                e[] eVarArr2 = new e[i12];
                if (length3 != 0) {
                    System.arraycopy(eVarArr, 0, eVarArr2, 0, length3);
                }
                while (length3 < i12 - 1) {
                    eVarArr2[length3] = new e();
                    c1494a.a(eVarArr2[length3]);
                    c1494a.l();
                    length3++;
                }
                eVarArr2[length3] = new e();
                c1494a.a(eVarArr2[length3]);
                this.f15238e = eVarArr2;
            } else if (iL == 90) {
                int iA4 = C1644g.a(c1494a, 90);
                String[] strArr = this.f15239f;
                int length4 = strArr == null ? 0 : strArr.length;
                int i13 = iA4 + length4;
                String[] strArr2 = new String[i13];
                if (length4 != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length4);
                }
                while (length4 < i13 - 1) {
                    strArr2[length4] = c1494a.k();
                    c1494a.l();
                    length4++;
                }
                strArr2[length4] = c1494a.k();
                this.f15239f = strArr2;
            } else if (!c1494a.f(iL)) {
                break;
            }
        }
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
    public void a(C1519b c1519b) throws IOException {
        d[] dVarArr = this.f15235b;
        int i10 = 0;
        if (dVarArr != null && dVarArr.length > 0) {
            int i11 = 0;
            while (true) {
                d[] dVarArr2 = this.f15235b;
                if (i11 >= dVarArr2.length) {
                    break;
                }
                d dVar = dVarArr2[i11];
                if (dVar != null) {
                    c1519b.b(3, dVar);
                }
                i11++;
            }
        }
        c cVar = this.f15236c;
        if (cVar != null) {
            c1519b.b(4, cVar);
        }
        a[] aVarArr = this.f15237d;
        if (aVarArr != null && aVarArr.length > 0) {
            int i12 = 0;
            while (true) {
                a[] aVarArr2 = this.f15237d;
                if (i12 >= aVarArr2.length) {
                    break;
                }
                a aVar = aVarArr2[i12];
                if (aVar != null) {
                    c1519b.b(7, aVar);
                }
                i12++;
            }
        }
        e[] eVarArr = this.f15238e;
        if (eVarArr != null && eVarArr.length > 0) {
            int i13 = 0;
            while (true) {
                e[] eVarArr2 = this.f15238e;
                if (i13 >= eVarArr2.length) {
                    break;
                }
                e eVar = eVarArr2[i13];
                if (eVar != null) {
                    c1519b.b(10, eVar);
                }
                i13++;
            }
        }
        String[] strArr = this.f15239f;
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        while (true) {
            String[] strArr2 = this.f15239f;
            if (i10 >= strArr2.length) {
                return;
            }
            String str = strArr2[i10];
            if (str != null) {
                c1519b.b(11, str);
            }
            i10++;
        }
    }

    public Vf b() {
        this.f15235b = d.c();
        this.f15236c = null;
        this.f15237d = a.c();
        this.f15238e = e.c();
        this.f15239f = C1644g.f16155b;
        this.f15981a = -1;
        return this;
    }
}
