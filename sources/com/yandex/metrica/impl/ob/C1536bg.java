package com.yandex.metrica.impl.ob;

import java.io.IOException;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.bg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1536bg extends AbstractC1594e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b[] f15835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f15836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String[] f15837d;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.bg$a */
    public static final class a extends AbstractC1594e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f15838b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f15839c;

        public a() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public int a() {
            return C1519b.a(3, this.f15839c) + C1519b.a(2, this.f15838b) + 0;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public AbstractC1594e a(C1494a c1494a) throws IOException {
            while (true) {
                int iL = c1494a.l();
                if (iL == 0) {
                    break;
                }
                if (iL == 16) {
                    int iH = c1494a.h();
                    if (iH == 0 || iH == 1 || iH == 2 || iH == 3 || iH == 4 || iH == 5) {
                        this.f15838b = iH;
                    }
                } else if (iL == 24) {
                    int iH2 = c1494a.h();
                    if (iH2 == -1 || iH2 == 0 || iH2 == 1) {
                        this.f15839c = iH2;
                    }
                } else if (!c1494a.f(iL)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public void a(C1519b c1519b) throws IOException {
            c1519b.d(2, this.f15838b);
            c1519b.d(3, this.f15839c);
        }

        public a b() {
            this.f15838b = 0;
            this.f15839c = -1;
            this.f15981a = -1;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.bg$b */
    public static final class b extends AbstractC1594e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static volatile b[] f15840d;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f15841b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f15842c;

        public b() {
            b();
        }

        public static b[] c() {
            if (f15840d == null) {
                synchronized (C1544c.f15862a) {
                    if (f15840d == null) {
                        f15840d = new b[0];
                    }
                }
            }
            return f15840d;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public int a() {
            return C1519b.a(2, this.f15842c) + C1519b.a(1, this.f15841b) + 0;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public AbstractC1594e a(C1494a c1494a) throws IOException {
            while (true) {
                int iL = c1494a.l();
                if (iL == 0) {
                    break;
                }
                if (iL == 10) {
                    this.f15841b = c1494a.k();
                } else if (iL == 16) {
                    this.f15842c = c1494a.c();
                } else if (!c1494a.f(iL)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public void a(C1519b c1519b) throws IOException {
            c1519b.b(1, this.f15841b);
            c1519b.b(2, this.f15842c);
        }

        public b b() {
            this.f15841b = "";
            this.f15842c = false;
            this.f15981a = -1;
            return this;
        }
    }

    public C1536bg() {
        b();
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
    public int a() {
        int iA;
        b[] bVarArr = this.f15835b;
        int i10 = 0;
        if (bVarArr != null && bVarArr.length > 0) {
            int i11 = 0;
            iA = 0;
            while (true) {
                b[] bVarArr2 = this.f15835b;
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
        a aVar = this.f15836c;
        if (aVar != null) {
            iA += C1519b.a(2, aVar);
        }
        String[] strArr = this.f15837d;
        if (strArr == null || strArr.length <= 0) {
            return iA;
        }
        int iA2 = 0;
        int i12 = 0;
        while (true) {
            String[] strArr2 = this.f15837d;
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
                b[] bVarArr = this.f15835b;
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
                this.f15835b = bVarArr2;
            } else if (iL == 18) {
                if (this.f15836c == null) {
                    this.f15836c = new a();
                }
                c1494a.a(this.f15836c);
            } else if (iL == 26) {
                int iA2 = C1644g.a(c1494a, 26);
                String[] strArr = this.f15837d;
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
                this.f15837d = strArr2;
            } else if (!c1494a.f(iL)) {
                break;
            }
        }
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
    public void a(C1519b c1519b) throws IOException {
        b[] bVarArr = this.f15835b;
        int i10 = 0;
        if (bVarArr != null && bVarArr.length > 0) {
            int i11 = 0;
            while (true) {
                b[] bVarArr2 = this.f15835b;
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
        a aVar = this.f15836c;
        if (aVar != null) {
            c1519b.b(2, aVar);
        }
        String[] strArr = this.f15837d;
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        while (true) {
            String[] strArr2 = this.f15837d;
            if (i10 >= strArr2.length) {
                return;
            }
            String str = strArr2[i10];
            if (str != null) {
                c1519b.b(3, str);
            }
            i10++;
        }
    }

    public C1536bg b() {
        this.f15835b = b.c();
        this.f15836c = null;
        this.f15837d = C1644g.f16155b;
        this.f15981a = -1;
        return this;
    }
}
