package com.yandex.metrica.impl.ob;

import java.io.IOException;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.gg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1661gg extends AbstractC1594e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f16213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b[] f16214c;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.gg$a */
    public static final class a extends AbstractC1594e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f16215b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f16216c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f16217d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f16218e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f16219f;

        public a() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public int a() {
            int iA = this.f16215b.equals("") ? 0 : 0 + C1519b.a(1, this.f16215b);
            if (!this.f16216c.equals("")) {
                iA += C1519b.a(2, this.f16216c);
            }
            boolean z10 = this.f16217d;
            if (z10) {
                iA += C1519b.a(3, z10);
            }
            boolean z11 = this.f16218e;
            if (z11) {
                iA += C1519b.a(4, z11);
            }
            return C1519b.a(5, this.f16219f) + iA;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public AbstractC1594e a(C1494a c1494a) throws IOException {
            while (true) {
                int iL = c1494a.l();
                if (iL == 0) {
                    break;
                }
                if (iL == 10) {
                    this.f16215b = c1494a.k();
                } else if (iL == 18) {
                    this.f16216c = c1494a.k();
                } else if (iL == 24) {
                    this.f16217d = c1494a.c();
                } else if (iL == 32) {
                    this.f16218e = c1494a.c();
                } else if (iL == 40) {
                    int iH = c1494a.h();
                    if (iH == 0 || iH == 1 || iH == 2 || iH == 3) {
                        this.f16219f = iH;
                    }
                } else if (!c1494a.f(iL)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public void a(C1519b c1519b) throws IOException {
            if (!this.f16215b.equals("")) {
                c1519b.b(1, this.f16215b);
            }
            if (!this.f16216c.equals("")) {
                c1519b.b(2, this.f16216c);
            }
            boolean z10 = this.f16217d;
            if (z10) {
                c1519b.b(3, z10);
            }
            boolean z11 = this.f16218e;
            if (z11) {
                c1519b.b(4, z11);
            }
            c1519b.d(5, this.f16219f);
        }

        public a b() {
            this.f16215b = "";
            this.f16216c = "";
            this.f16217d = false;
            this.f16218e = false;
            this.f16219f = 0;
            this.f15981a = -1;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.gg$b */
    public static final class b extends AbstractC1594e {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static volatile b[] f16220e;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f16221b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f16222c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f16223d;

        public b() {
            b();
        }

        public static b[] c() {
            if (f16220e == null) {
                synchronized (C1544c.f15862a) {
                    if (f16220e == null) {
                        f16220e = new b[0];
                    }
                }
            }
            return f16220e;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public int a() {
            int iA = this.f16221b.equals("") ? 0 : 0 + C1519b.a(1, this.f16221b);
            if (!this.f16222c.equals("")) {
                iA += C1519b.a(2, this.f16222c);
            }
            return C1519b.a(3, this.f16223d) + iA;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public AbstractC1594e a(C1494a c1494a) throws IOException {
            while (true) {
                int iL = c1494a.l();
                if (iL == 0) {
                    break;
                }
                if (iL == 10) {
                    this.f16221b = c1494a.k();
                } else if (iL == 18) {
                    this.f16222c = c1494a.k();
                } else if (iL == 24) {
                    int iH = c1494a.h();
                    if (iH == 0 || iH == 1 || iH == 2 || iH == 3) {
                        this.f16223d = iH;
                    }
                } else if (!c1494a.f(iL)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public void a(C1519b c1519b) throws IOException {
            if (!this.f16221b.equals("")) {
                c1519b.b(1, this.f16221b);
            }
            if (!this.f16222c.equals("")) {
                c1519b.b(2, this.f16222c);
            }
            c1519b.d(3, this.f16223d);
        }

        public b b() {
            this.f16221b = "";
            this.f16222c = "";
            this.f16223d = 0;
            this.f15981a = -1;
            return this;
        }
    }

    public C1661gg() {
        b();
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
    public int a() {
        a aVar = this.f16213b;
        int i10 = 0;
        int iA = aVar != null ? C1519b.a(1, aVar) + 0 : 0;
        b[] bVarArr = this.f16214c;
        if (bVarArr != null && bVarArr.length > 0) {
            while (true) {
                b[] bVarArr2 = this.f16214c;
                if (i10 >= bVarArr2.length) {
                    break;
                }
                b bVar = bVarArr2[i10];
                if (bVar != null) {
                    iA += C1519b.a(2, bVar);
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
                if (this.f16213b == null) {
                    this.f16213b = new a();
                }
                c1494a.a(this.f16213b);
            } else if (iL == 18) {
                int iA = C1644g.a(c1494a, 18);
                b[] bVarArr = this.f16214c;
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
                this.f16214c = bVarArr2;
            } else if (!c1494a.f(iL)) {
                break;
            }
        }
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
    public void a(C1519b c1519b) throws IOException {
        a aVar = this.f16213b;
        if (aVar != null) {
            c1519b.b(1, aVar);
        }
        b[] bVarArr = this.f16214c;
        if (bVarArr == null || bVarArr.length <= 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            b[] bVarArr2 = this.f16214c;
            if (i10 >= bVarArr2.length) {
                return;
            }
            b bVar = bVarArr2[i10];
            if (bVar != null) {
                c1519b.b(2, bVar);
            }
            i10++;
        }
    }

    public C1661gg b() {
        this.f16213b = null;
        this.f16214c = b.c();
        this.f15981a = -1;
        return this;
    }
}
