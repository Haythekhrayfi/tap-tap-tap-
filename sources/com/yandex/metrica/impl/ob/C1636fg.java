package com.yandex.metrica.impl.ob;

import java.io.IOException;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.fg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1636fg extends AbstractC1594e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a[] f16136b;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.fg$a */
    public static final class a extends AbstractC1594e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static volatile a[] f16137d;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f16138b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f16139c;

        public a() {
            b();
        }

        public static a[] c() {
            if (f16137d == null) {
                synchronized (C1544c.f15862a) {
                    if (f16137d == null) {
                        f16137d = new a[0];
                    }
                }
            }
            return f16137d;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public int a() {
            return C1519b.a(2, this.f16139c) + C1519b.a(1, this.f16138b) + 0;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public AbstractC1594e a(C1494a c1494a) throws IOException {
            while (true) {
                int iL = c1494a.l();
                if (iL == 0) {
                    break;
                }
                if (iL == 10) {
                    this.f16138b = c1494a.k();
                } else if (iL == 16) {
                    this.f16139c = c1494a.c();
                } else if (!c1494a.f(iL)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public void a(C1519b c1519b) throws IOException {
            c1519b.b(1, this.f16138b);
            c1519b.b(2, this.f16139c);
        }

        public a b() {
            this.f16138b = "";
            this.f16139c = false;
            this.f15981a = -1;
            return this;
        }
    }

    public C1636fg() {
        b();
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
    public int a() {
        a[] aVarArr = this.f16136b;
        int i10 = 0;
        if (aVarArr == null || aVarArr.length <= 0) {
            return 0;
        }
        int iA = 0;
        while (true) {
            a[] aVarArr2 = this.f16136b;
            if (i10 >= aVarArr2.length) {
                return iA;
            }
            a aVar = aVarArr2[i10];
            if (aVar != null) {
                iA += C1519b.a(1, aVar);
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
                a[] aVarArr = this.f16136b;
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
                this.f16136b = aVarArr2;
            } else if (!c1494a.f(iL)) {
                break;
            }
        }
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
    public void a(C1519b c1519b) throws IOException {
        a[] aVarArr = this.f16136b;
        if (aVarArr == null || aVarArr.length <= 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            a[] aVarArr2 = this.f16136b;
            if (i10 >= aVarArr2.length) {
                return;
            }
            a aVar = aVarArr2[i10];
            if (aVar != null) {
                c1519b.b(1, aVar);
            }
            i10++;
        }
    }

    public C1636fg b() {
        this.f16136b = a.c();
        this.f15981a = -1;
        return this;
    }
}
