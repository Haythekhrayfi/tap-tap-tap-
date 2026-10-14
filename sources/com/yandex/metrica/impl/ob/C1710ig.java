package com.yandex.metrica.impl.ob;

import java.io.IOException;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ig, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1710ig extends AbstractC1594e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f16347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f16348c;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ig$a */
    public static final class a extends AbstractC1594e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public C0181a[] f16349b;

        /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ig$a$a, reason: collision with other inner class name */
        public static final class C0181a extends AbstractC1594e {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static volatile C0181a[] f16350d;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public String f16351b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public String f16352c;

            public C0181a() {
                b();
            }

            public static C0181a[] c() {
                if (f16350d == null) {
                    synchronized (C1544c.f15862a) {
                        if (f16350d == null) {
                            f16350d = new C0181a[0];
                        }
                    }
                }
                return f16350d;
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC1594e
            public int a() {
                int iA = C1519b.a(1, this.f16351b) + 0;
                return !this.f16352c.equals("") ? iA + C1519b.a(2, this.f16352c) : iA;
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC1594e
            public AbstractC1594e a(C1494a c1494a) throws IOException {
                while (true) {
                    int iL = c1494a.l();
                    if (iL == 0) {
                        break;
                    }
                    if (iL == 10) {
                        this.f16351b = c1494a.k();
                    } else if (iL == 18) {
                        this.f16352c = c1494a.k();
                    } else if (!c1494a.f(iL)) {
                        break;
                    }
                }
                return this;
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC1594e
            public void a(C1519b c1519b) throws IOException {
                c1519b.b(1, this.f16351b);
                if (this.f16352c.equals("")) {
                    return;
                }
                c1519b.b(2, this.f16352c);
            }

            public C0181a b() {
                this.f16351b = "";
                this.f16352c = "";
                this.f15981a = -1;
                return this;
            }
        }

        public a() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public int a() {
            C0181a[] c0181aArr = this.f16349b;
            int i10 = 0;
            if (c0181aArr == null || c0181aArr.length <= 0) {
                return 0;
            }
            int iA = 0;
            while (true) {
                C0181a[] c0181aArr2 = this.f16349b;
                if (i10 >= c0181aArr2.length) {
                    return iA;
                }
                C0181a c0181a = c0181aArr2[i10];
                if (c0181a != null) {
                    iA += C1519b.a(1, c0181a);
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
                    C0181a[] c0181aArr = this.f16349b;
                    int length = c0181aArr == null ? 0 : c0181aArr.length;
                    int i10 = iA + length;
                    C0181a[] c0181aArr2 = new C0181a[i10];
                    if (length != 0) {
                        System.arraycopy(c0181aArr, 0, c0181aArr2, 0, length);
                    }
                    while (length < i10 - 1) {
                        c0181aArr2[length] = new C0181a();
                        c1494a.a(c0181aArr2[length]);
                        c1494a.l();
                        length++;
                    }
                    c0181aArr2[length] = new C0181a();
                    c1494a.a(c0181aArr2[length]);
                    this.f16349b = c0181aArr2;
                } else if (!c1494a.f(iL)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public void a(C1519b c1519b) throws IOException {
            C0181a[] c0181aArr = this.f16349b;
            if (c0181aArr == null || c0181aArr.length <= 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                C0181a[] c0181aArr2 = this.f16349b;
                if (i10 >= c0181aArr2.length) {
                    return;
                }
                C0181a c0181a = c0181aArr2[i10];
                if (c0181a != null) {
                    c1519b.b(1, c0181a);
                }
                i10++;
            }
        }

        public a b() {
            this.f16349b = C0181a.c();
            this.f15981a = -1;
            return this;
        }
    }

    public C1710ig() {
        b();
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
    public int a() {
        a aVar = this.f16347b;
        int iA = aVar != null ? 0 + C1519b.a(1, aVar) : 0;
        boolean z10 = this.f16348c;
        return z10 ? iA + C1519b.a(2, z10) : iA;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
    public AbstractC1594e a(C1494a c1494a) throws IOException {
        while (true) {
            int iL = c1494a.l();
            if (iL == 0) {
                break;
            }
            if (iL == 10) {
                if (this.f16347b == null) {
                    this.f16347b = new a();
                }
                c1494a.a(this.f16347b);
            } else if (iL == 16) {
                this.f16348c = c1494a.c();
            } else if (!c1494a.f(iL)) {
                break;
            }
        }
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
    public void a(C1519b c1519b) throws IOException {
        a aVar = this.f16347b;
        if (aVar != null) {
            c1519b.b(1, aVar);
        }
        boolean z10 = this.f16348c;
        if (z10) {
            c1519b.b(2, z10);
        }
    }

    public C1710ig b() {
        this.f16347b = null;
        this.f16348c = false;
        this.f15981a = -1;
        return this;
    }
}
