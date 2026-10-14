package com.yandex.metrica.impl.ob;

import java.io.IOException;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.jg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1735jg extends AbstractC1594e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a[] f16416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f16417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f16418d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f16419e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f16420f;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.jg$a */
    public static final class a extends AbstractC1594e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static volatile a[] f16421d;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f16422b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String[] f16423c;

        public a() {
            b();
        }

        public static a[] c() {
            if (f16421d == null) {
                synchronized (C1544c.f15862a) {
                    if (f16421d == null) {
                        f16421d = new a[0];
                    }
                }
            }
            return f16421d;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public int a() {
            int i10 = 0;
            int iA = C1519b.a(1, this.f16422b) + 0;
            String[] strArr = this.f16423c;
            if (strArr == null || strArr.length <= 0) {
                return iA;
            }
            int iA2 = 0;
            int i11 = 0;
            while (true) {
                String[] strArr2 = this.f16423c;
                if (i10 >= strArr2.length) {
                    return iA + iA2 + (i11 * 1);
                }
                String str = strArr2[i10];
                if (str != null) {
                    i11++;
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
                    this.f16422b = c1494a.k();
                } else if (iL == 18) {
                    int iA = C1644g.a(c1494a, 18);
                    String[] strArr = this.f16423c;
                    int length = strArr == null ? 0 : strArr.length;
                    int i10 = iA + length;
                    String[] strArr2 = new String[i10];
                    if (length != 0) {
                        System.arraycopy(strArr, 0, strArr2, 0, length);
                    }
                    while (length < i10 - 1) {
                        strArr2[length] = c1494a.k();
                        c1494a.l();
                        length++;
                    }
                    strArr2[length] = c1494a.k();
                    this.f16423c = strArr2;
                } else if (!c1494a.f(iL)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public void a(C1519b c1519b) throws IOException {
            c1519b.b(1, this.f16422b);
            String[] strArr = this.f16423c;
            if (strArr == null || strArr.length <= 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                String[] strArr2 = this.f16423c;
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

        public a b() {
            this.f16422b = "";
            this.f16423c = C1644g.f16155b;
            this.f15981a = -1;
            return this;
        }
    }

    public C1735jg() {
        b();
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
    public int a() {
        a[] aVarArr = this.f16416b;
        int i10 = 0;
        if (aVarArr != null && aVarArr.length > 0) {
            int iA = 0;
            while (true) {
                a[] aVarArr2 = this.f16416b;
                if (i10 >= aVarArr2.length) {
                    break;
                }
                a aVar = aVarArr2[i10];
                if (aVar != null) {
                    iA += C1519b.a(1, aVar);
                }
                i10++;
            }
            i10 = iA;
        }
        return C1519b.a(5, this.f16420f) + C1519b.a(4, this.f16419e) + C1519b.a(3, this.f16418d) + C1519b.a(2, this.f16417c) + i10;
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
                a[] aVarArr = this.f16416b;
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
                this.f16416b = aVarArr2;
            } else if (iL == 18) {
                this.f16417c = c1494a.k();
            } else if (iL == 24) {
                this.f16418d = c1494a.i();
            } else if (iL == 32) {
                this.f16419e = c1494a.c();
            } else if (iL == 40) {
                this.f16420f = c1494a.c();
            } else if (!c1494a.f(iL)) {
                break;
            }
        }
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
    public void a(C1519b c1519b) throws IOException {
        a[] aVarArr = this.f16416b;
        if (aVarArr != null && aVarArr.length > 0) {
            int i10 = 0;
            while (true) {
                a[] aVarArr2 = this.f16416b;
                if (i10 >= aVarArr2.length) {
                    break;
                }
                a aVar = aVarArr2[i10];
                if (aVar != null) {
                    c1519b.b(1, aVar);
                }
                i10++;
            }
        }
        c1519b.b(2, this.f16417c);
        c1519b.c(3, this.f16418d);
        c1519b.b(4, this.f16419e);
        c1519b.b(5, this.f16420f);
    }

    public C1735jg b() {
        this.f16416b = a.c();
        this.f16417c = "";
        this.f16418d = 0L;
        this.f16419e = false;
        this.f16420f = false;
        this.f15981a = -1;
        return this;
    }
}
