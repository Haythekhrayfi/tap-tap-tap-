package com.yandex.metrica.impl.ob;

import ch.qos.logback.core.net.SyslogConstants;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.io.IOException;
import org.joda.time.DateTimeConstants;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.kg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1760kg extends AbstractC1594e {
    public String A;
    public String B;
    public String C;
    public String D;
    public String E;
    public long F;
    public long G;
    public boolean H;
    public m I;
    public j J;
    public int K;
    public int L;
    public v M;
    public u N;
    public u O;
    public u P;
    public s Q;
    public c R;
    public f S;
    public String[] T;
    public b U;
    public a V;
    public h W;
    public g X;
    public q Y;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f16581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f16582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String[] f16583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f16584e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f16585f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String[] f16586g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String[] f16587h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String[] f16588i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String[] f16589j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d[] f16590k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public i f16591l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public k[] f16592m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public y f16593n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public p f16594o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public n[] f16595p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f16596q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f16597r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f16598s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f16599t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f16600u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String[] f16601v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public r f16602w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f16603x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public l[] f16604y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public o f16605z;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.kg$a */
    public static final class a extends AbstractC1594e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public b[] f16606b;

        /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.kg$a$a, reason: collision with other inner class name */
        public static final class C0182a extends AbstractC1594e {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public String f16607b;

            public C0182a() {
                b();
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC1594e
            public int a() {
                if (this.f16607b.equals("")) {
                    return 0;
                }
                return 0 + C1519b.a(1, this.f16607b);
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC1594e
            public AbstractC1594e a(C1494a c1494a) throws IOException {
                while (true) {
                    int iL = c1494a.l();
                    if (iL == 0) {
                        break;
                    }
                    if (iL == 10) {
                        this.f16607b = c1494a.k();
                    } else if (!c1494a.f(iL)) {
                        break;
                    }
                }
                return this;
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC1594e
            public void a(C1519b c1519b) throws IOException {
                if (this.f16607b.equals("")) {
                    return;
                }
                c1519b.b(1, this.f16607b);
            }

            public C0182a b() {
                this.f16607b = "";
                this.f15981a = -1;
                return this;
            }
        }

        /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.kg$a$b */
        public static final class b extends AbstractC1594e {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static volatile b[] f16608d;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public String f16609b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public C0182a f16610c;

            public b() {
                b();
            }

            public static b[] c() {
                if (f16608d == null) {
                    synchronized (C1544c.f15862a) {
                        if (f16608d == null) {
                            f16608d = new b[0];
                        }
                    }
                }
                return f16608d;
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC1594e
            public int a() {
                int iA = this.f16609b.equals("") ? 0 : 0 + C1519b.a(1, this.f16609b);
                C0182a c0182a = this.f16610c;
                return c0182a != null ? iA + C1519b.a(2, c0182a) : iA;
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC1594e
            public AbstractC1594e a(C1494a c1494a) throws IOException {
                while (true) {
                    int iL = c1494a.l();
                    if (iL == 0) {
                        break;
                    }
                    if (iL == 10) {
                        this.f16609b = c1494a.k();
                    } else if (iL == 18) {
                        if (this.f16610c == null) {
                            this.f16610c = new C0182a();
                        }
                        c1494a.a(this.f16610c);
                    } else if (!c1494a.f(iL)) {
                        break;
                    }
                }
                return this;
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC1594e
            public void a(C1519b c1519b) throws IOException {
                if (!this.f16609b.equals("")) {
                    c1519b.b(1, this.f16609b);
                }
                C0182a c0182a = this.f16610c;
                if (c0182a != null) {
                    c1519b.b(2, c0182a);
                }
            }

            public b b() {
                this.f16609b = "";
                this.f16610c = null;
                this.f15981a = -1;
                return this;
            }
        }

        public a() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public int a() {
            b[] bVarArr = this.f16606b;
            int i10 = 0;
            if (bVarArr == null || bVarArr.length <= 0) {
                return 0;
            }
            int iA = 0;
            while (true) {
                b[] bVarArr2 = this.f16606b;
                if (i10 >= bVarArr2.length) {
                    return iA;
                }
                b bVar = bVarArr2[i10];
                if (bVar != null) {
                    iA += C1519b.a(1, bVar);
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
                    b[] bVarArr = this.f16606b;
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
                    this.f16606b = bVarArr2;
                } else if (!c1494a.f(iL)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public void a(C1519b c1519b) throws IOException {
            b[] bVarArr = this.f16606b;
            if (bVarArr == null || bVarArr.length <= 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                b[] bVarArr2 = this.f16606b;
                if (i10 >= bVarArr2.length) {
                    return;
                }
                b bVar = bVarArr2[i10];
                if (bVar != null) {
                    c1519b.b(1, bVar);
                }
                i10++;
            }
        }

        public a b() {
            this.f16606b = b.c();
            this.f15981a = -1;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.kg$b */
    public static final class b extends AbstractC1594e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f16611b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f16612c;

        public b() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public int a() {
            int i10 = this.f16611b;
            int iA = i10 != 86400 ? 0 + C1519b.a(1, i10) : 0;
            int i11 = this.f16612c;
            return i11 != 86400 ? iA + C1519b.a(2, i11) : iA;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public AbstractC1594e a(C1494a c1494a) throws IOException {
            while (true) {
                int iL = c1494a.l();
                if (iL == 0) {
                    break;
                }
                if (iL == 8) {
                    this.f16611b = c1494a.h();
                } else if (iL == 16) {
                    this.f16612c = c1494a.h();
                } else if (!c1494a.f(iL)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public void a(C1519b c1519b) throws IOException {
            int i10 = this.f16611b;
            if (i10 != 86400) {
                c1519b.d(1, i10);
            }
            int i11 = this.f16612c;
            if (i11 != 86400) {
                c1519b.d(2, i11);
            }
        }

        public b b() {
            this.f16611b = DateTimeConstants.SECONDS_PER_DAY;
            this.f16612c = DateTimeConstants.SECONDS_PER_DAY;
            this.f15981a = -1;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.kg$c */
    public static final class c extends AbstractC1594e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f16613b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f16614c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f16615d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f16616e;

        public c() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public int a() {
            long j10 = this.f16613b;
            int iA = j10 != AbstractComponentTracker.LINGERING_TIMEOUT ? 0 + C1519b.a(1, j10) : 0;
            long j11 = this.f16614c;
            if (j11 != AbstractComponentTracker.LINGERING_TIMEOUT) {
                iA += C1519b.a(2, j11);
            }
            long j12 = this.f16615d;
            if (j12 != AbstractComponentTracker.LINGERING_TIMEOUT) {
                iA += C1519b.a(3, j12);
            }
            long j13 = this.f16616e;
            return j13 != AbstractComponentTracker.LINGERING_TIMEOUT ? iA + C1519b.a(4, j13) : iA;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public AbstractC1594e a(C1494a c1494a) throws IOException {
            while (true) {
                int iL = c1494a.l();
                if (iL == 0) {
                    break;
                }
                if (iL == 8) {
                    this.f16613b = c1494a.i();
                } else if (iL == 16) {
                    this.f16614c = c1494a.i();
                } else if (iL == 24) {
                    this.f16615d = c1494a.i();
                } else if (iL == 32) {
                    this.f16616e = c1494a.i();
                } else if (!c1494a.f(iL)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public void a(C1519b c1519b) throws IOException {
            long j10 = this.f16613b;
            if (j10 != AbstractComponentTracker.LINGERING_TIMEOUT) {
                c1519b.c(1, j10);
            }
            long j11 = this.f16614c;
            if (j11 != AbstractComponentTracker.LINGERING_TIMEOUT) {
                c1519b.c(2, j11);
            }
            long j12 = this.f16615d;
            if (j12 != AbstractComponentTracker.LINGERING_TIMEOUT) {
                c1519b.c(3, j12);
            }
            long j13 = this.f16616e;
            if (j13 != AbstractComponentTracker.LINGERING_TIMEOUT) {
                c1519b.c(4, j13);
            }
        }

        public c b() {
            this.f16613b = AbstractComponentTracker.LINGERING_TIMEOUT;
            this.f16614c = AbstractComponentTracker.LINGERING_TIMEOUT;
            this.f16615d = AbstractComponentTracker.LINGERING_TIMEOUT;
            this.f16616e = AbstractComponentTracker.LINGERING_TIMEOUT;
            this.f15981a = -1;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.kg$d */
    public static final class d extends AbstractC1594e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static volatile d[] f16617d;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f16618b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String[] f16619c;

        public d() {
            b();
        }

        public static d[] c() {
            if (f16617d == null) {
                synchronized (C1544c.f15862a) {
                    if (f16617d == null) {
                        f16617d = new d[0];
                    }
                }
            }
            return f16617d;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public int a() {
            int i10 = 0;
            int iA = !this.f16618b.equals("") ? C1519b.a(1, this.f16618b) + 0 : 0;
            String[] strArr = this.f16619c;
            if (strArr == null || strArr.length <= 0) {
                return iA;
            }
            int iA2 = 0;
            int i11 = 0;
            while (true) {
                String[] strArr2 = this.f16619c;
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
                    this.f16618b = c1494a.k();
                } else if (iL == 18) {
                    int iA = C1644g.a(c1494a, 18);
                    String[] strArr = this.f16619c;
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
                    this.f16619c = strArr2;
                } else if (!c1494a.f(iL)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public void a(C1519b c1519b) throws IOException {
            if (!this.f16618b.equals("")) {
                c1519b.b(1, this.f16618b);
            }
            String[] strArr = this.f16619c;
            if (strArr == null || strArr.length <= 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                String[] strArr2 = this.f16619c;
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

        public d b() {
            this.f16618b = "";
            this.f16619c = C1644g.f16155b;
            this.f15981a = -1;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.kg$e */
    public static final class e extends AbstractC1594e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f16620b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f16621c;

        public e() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public int a() {
            int iA = C1519b.a(1, this.f16620b) + 0;
            int i10 = this.f16621c;
            return i10 != 86400 ? iA + C1519b.a(2, i10) : iA;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public AbstractC1594e a(C1494a c1494a) throws IOException {
            while (true) {
                int iL = c1494a.l();
                if (iL == 0) {
                    break;
                }
                if (iL == 8) {
                    this.f16620b = c1494a.i();
                } else if (iL == 16) {
                    this.f16621c = c1494a.h();
                } else if (!c1494a.f(iL)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public void a(C1519b c1519b) throws IOException {
            c1519b.c(1, this.f16620b);
            int i10 = this.f16621c;
            if (i10 != 86400) {
                c1519b.d(2, i10);
            }
        }

        public e b() {
            this.f16620b = 0L;
            this.f16621c = DateTimeConstants.SECONDS_PER_DAY;
            this.f15981a = -1;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.kg$f */
    public static final class f extends AbstractC1594e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public e f16622b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public e f16623c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public e f16624d;

        public f() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public int a() {
            e eVar = this.f16622b;
            int iA = eVar != null ? 0 + C1519b.a(1, eVar) : 0;
            e eVar2 = this.f16623c;
            if (eVar2 != null) {
                iA += C1519b.a(2, eVar2);
            }
            e eVar3 = this.f16624d;
            return eVar3 != null ? iA + C1519b.a(3, eVar3) : iA;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public AbstractC1594e a(C1494a c1494a) throws IOException {
            e eVar;
            while (true) {
                int iL = c1494a.l();
                if (iL == 0) {
                    break;
                }
                if (iL == 10) {
                    if (this.f16622b == null) {
                        this.f16622b = new e();
                    }
                    eVar = this.f16622b;
                } else if (iL == 18) {
                    if (this.f16623c == null) {
                        this.f16623c = new e();
                    }
                    eVar = this.f16623c;
                } else if (iL == 26) {
                    if (this.f16624d == null) {
                        this.f16624d = new e();
                    }
                    eVar = this.f16624d;
                } else if (!c1494a.f(iL)) {
                    break;
                }
                c1494a.a(eVar);
            }
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public void a(C1519b c1519b) throws IOException {
            e eVar = this.f16622b;
            if (eVar != null) {
                c1519b.b(1, eVar);
            }
            e eVar2 = this.f16623c;
            if (eVar2 != null) {
                c1519b.b(2, eVar2);
            }
            e eVar3 = this.f16624d;
            if (eVar3 != null) {
                c1519b.b(3, eVar3);
            }
        }

        public f b() {
            this.f16622b = null;
            this.f16623c = null;
            this.f16624d = null;
            this.f15981a = -1;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.kg$g */
    public static final class g extends AbstractC1594e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f16625b;

        public g() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public int a() {
            long j10 = this.f16625b;
            if (j10 != 1209600) {
                return 0 + C1519b.b(1, j10);
            }
            return 0;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public AbstractC1594e a(C1494a c1494a) throws IOException {
            while (true) {
                int iL = c1494a.l();
                if (iL == 0) {
                    break;
                }
                if (iL == 8) {
                    this.f16625b = c1494a.i();
                } else if (!c1494a.f(iL)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public void a(C1519b c1519b) throws IOException {
            long j10 = this.f16625b;
            if (j10 != 1209600) {
                c1519b.e(1, j10);
            }
        }

        public g b() {
            this.f16625b = 1209600L;
            this.f15981a = -1;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.kg$h */
    public static final class h extends AbstractC1594e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f16626b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f16627c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f16628d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f16629e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f16630f;

        public h() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public int a() {
            int iA = this.f16626b.equals("") ? 0 : 0 + C1519b.a(1, this.f16626b);
            int i10 = this.f16627c;
            if (i10 != 600) {
                iA += C1519b.c(2, i10);
            }
            int i11 = this.f16628d;
            if (i11 != 300) {
                iA += C1519b.c(3, i11);
            }
            boolean z10 = this.f16629e;
            if (z10) {
                iA += C1519b.a(4, z10);
            }
            boolean z11 = this.f16630f;
            return !z11 ? iA + C1519b.a(5, z11) : iA;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public AbstractC1594e a(C1494a c1494a) throws IOException {
            while (true) {
                int iL = c1494a.l();
                if (iL == 0) {
                    break;
                }
                if (iL == 10) {
                    this.f16626b = c1494a.k();
                } else if (iL == 16) {
                    this.f16627c = c1494a.h();
                } else if (iL == 24) {
                    this.f16628d = c1494a.h();
                } else if (iL == 32) {
                    this.f16629e = c1494a.c();
                } else if (iL == 40) {
                    this.f16630f = c1494a.c();
                } else if (!c1494a.f(iL)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public void a(C1519b c1519b) throws IOException {
            if (!this.f16626b.equals("")) {
                c1519b.b(1, this.f16626b);
            }
            int i10 = this.f16627c;
            if (i10 != 600) {
                c1519b.f(2, i10);
            }
            int i11 = this.f16628d;
            if (i11 != 300) {
                c1519b.f(3, i11);
            }
            boolean z10 = this.f16629e;
            if (z10) {
                c1519b.b(4, z10);
            }
            boolean z11 = this.f16630f;
            if (!z11) {
                c1519b.b(5, z11);
            }
        }

        public h b() {
            this.f16626b = "";
            this.f16627c = 600;
            this.f16628d = 300;
            this.f16629e = false;
            this.f16630f = true;
            this.f15981a = -1;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.kg$i */
    public static final class i extends AbstractC1594e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f16631b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f16632c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f16633d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f16634e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f16635f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f16636g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f16637h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f16638i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f16639j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f16640k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f16641l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f16642m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f16643n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f16644o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f16645p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public boolean f16646q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f16647r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public boolean f16648s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public boolean f16649t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public boolean f16650u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f16651v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public boolean f16652w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public boolean f16653x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public boolean f16654y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f16655z;

        public i() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public int a() {
            int iA = C1519b.a(28, this.f16652w) + C1519b.a(27, this.f16651v) + C1519b.a(26, this.f16650u) + C1519b.a(25, this.f16649t) + C1519b.a(24, this.f16648s) + C1519b.a(23, this.f16647r) + C1519b.a(22, this.f16646q) + C1519b.a(21, this.f16645p) + C1519b.a(20, this.f16644o) + C1519b.a(19, this.f16643n) + C1519b.a(18, this.f16642m) + C1519b.a(16, this.f16641l) + C1519b.a(15, this.f16640k) + C1519b.a(12, this.f16639j) + C1519b.a(11, this.f16638i) + C1519b.a(9, this.f16637h) + C1519b.a(8, this.f16636g) + C1519b.a(6, this.f16635f) + C1519b.a(4, this.f16634e) + C1519b.a(3, this.f16633d) + C1519b.a(2, this.f16632c) + C1519b.a(1, this.f16631b) + 0;
            boolean z10 = this.f16653x;
            if (z10) {
                iA += C1519b.a(29, z10);
            }
            boolean z11 = this.f16654y;
            if (z11) {
                iA += C1519b.a(33, z11);
            }
            int i10 = this.f16655z;
            return i10 != -1 ? iA + C1519b.a(34, i10) : iA;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public AbstractC1594e a(C1494a c1494a) throws IOException {
            while (true) {
                int iL = c1494a.l();
                switch (iL) {
                    case 0:
                        break;
                    case 8:
                        this.f16631b = c1494a.c();
                        break;
                    case 16:
                        this.f16632c = c1494a.c();
                        break;
                    case 24:
                        this.f16633d = c1494a.c();
                        break;
                    case 32:
                        this.f16634e = c1494a.c();
                        break;
                    case 48:
                        this.f16635f = c1494a.c();
                        break;
                    case 64:
                        this.f16636g = c1494a.c();
                        break;
                    case 72:
                        this.f16637h = c1494a.c();
                        break;
                    case 88:
                        this.f16638i = c1494a.c();
                        break;
                    case 96:
                        this.f16639j = c1494a.c();
                        break;
                    case 120:
                        this.f16640k = c1494a.c();
                        break;
                    case 128:
                        this.f16641l = c1494a.c();
                        break;
                    case SyslogConstants.LOG_LOCAL2 /* 144 */:
                        this.f16642m = c1494a.c();
                        break;
                    case SyslogConstants.LOG_LOCAL3 /* 152 */:
                        this.f16643n = c1494a.c();
                        break;
                    case SyslogConstants.LOG_LOCAL4 /* 160 */:
                        this.f16644o = c1494a.c();
                        break;
                    case 168:
                        this.f16645p = c1494a.c();
                        break;
                    case SyslogConstants.LOG_LOCAL6 /* 176 */:
                        this.f16646q = c1494a.c();
                        break;
                    case SyslogConstants.LOG_LOCAL7 /* 184 */:
                        this.f16647r = c1494a.c();
                        break;
                    case 192:
                        this.f16648s = c1494a.c();
                        break;
                    case 200:
                        this.f16649t = c1494a.c();
                        break;
                    case 208:
                        this.f16650u = c1494a.c();
                        break;
                    case 216:
                        this.f16651v = c1494a.c();
                        break;
                    case 224:
                        this.f16652w = c1494a.c();
                        break;
                    case 232:
                        this.f16653x = c1494a.c();
                        break;
                    case 264:
                        this.f16654y = c1494a.c();
                        break;
                    case 272:
                        int iH = c1494a.h();
                        if (iH == -1 || iH == 0 || iH == 1) {
                            this.f16655z = iH;
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
            c1519b.b(1, this.f16631b);
            c1519b.b(2, this.f16632c);
            c1519b.b(3, this.f16633d);
            c1519b.b(4, this.f16634e);
            c1519b.b(6, this.f16635f);
            c1519b.b(8, this.f16636g);
            c1519b.b(9, this.f16637h);
            c1519b.b(11, this.f16638i);
            c1519b.b(12, this.f16639j);
            c1519b.b(15, this.f16640k);
            c1519b.b(16, this.f16641l);
            c1519b.b(18, this.f16642m);
            c1519b.b(19, this.f16643n);
            c1519b.b(20, this.f16644o);
            c1519b.b(21, this.f16645p);
            c1519b.b(22, this.f16646q);
            c1519b.b(23, this.f16647r);
            c1519b.b(24, this.f16648s);
            c1519b.b(25, this.f16649t);
            c1519b.b(26, this.f16650u);
            c1519b.b(27, this.f16651v);
            c1519b.b(28, this.f16652w);
            boolean z10 = this.f16653x;
            if (z10) {
                c1519b.b(29, z10);
            }
            boolean z11 = this.f16654y;
            if (z11) {
                c1519b.b(33, z11);
            }
            int i10 = this.f16655z;
            if (i10 != -1) {
                c1519b.d(34, i10);
            }
        }

        public i b() {
            this.f16631b = false;
            this.f16632c = false;
            this.f16633d = false;
            this.f16634e = false;
            this.f16635f = false;
            this.f16636g = false;
            this.f16637h = false;
            this.f16638i = false;
            this.f16639j = false;
            this.f16640k = false;
            this.f16641l = true;
            this.f16642m = false;
            this.f16643n = false;
            this.f16644o = false;
            this.f16645p = false;
            this.f16646q = false;
            this.f16647r = false;
            this.f16648s = false;
            this.f16649t = false;
            this.f16650u = false;
            this.f16651v = true;
            this.f16652w = false;
            this.f16653x = false;
            this.f16654y = false;
            this.f16655z = -1;
            this.f15981a = -1;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.kg$j */
    public static final class j extends AbstractC1594e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f16656b;

        public j() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public int a() {
            return C1519b.a(1, this.f16656b) + 0;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public AbstractC1594e a(C1494a c1494a) throws IOException {
            while (true) {
                int iL = c1494a.l();
                if (iL == 0) {
                    break;
                }
                if (iL == 8) {
                    this.f16656b = c1494a.i();
                } else if (!c1494a.f(iL)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public void a(C1519b c1519b) throws IOException {
            c1519b.c(1, this.f16656b);
        }

        public j b() {
            this.f16656b = 900L;
            this.f15981a = -1;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.kg$k */
    public static final class k extends AbstractC1594e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static volatile k[] f16657d;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public a f16658b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public b f16659c;

        /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.kg$k$a */
        public static final class a extends AbstractC1594e {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public long f16660b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public float f16661c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f16662d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public int f16663e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public long f16664f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public int f16665g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public boolean f16666h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public boolean f16667i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public boolean f16668j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public long f16669k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public C0183a f16670l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public C0183a f16671m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public C0183a f16672n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public C0183a f16673o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public b f16674p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            public boolean f16675q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public boolean f16676r;

            /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.kg$k$a$a, reason: collision with other inner class name */
            public static final class C0183a extends AbstractC1594e {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public boolean f16677b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public boolean f16678c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public C0184a f16679d;

                /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.kg$k$a$a$a, reason: collision with other inner class name */
                public static final class C0184a extends AbstractC1594e {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public long f16680b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public long f16681c;

                    public C0184a() {
                        b();
                    }

                    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
                    public int a() {
                        return C1519b.a(2, this.f16681c) + C1519b.a(1, this.f16680b) + 0;
                    }

                    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
                    public AbstractC1594e a(C1494a c1494a) throws IOException {
                        while (true) {
                            int iL = c1494a.l();
                            if (iL == 0) {
                                break;
                            }
                            if (iL == 8) {
                                this.f16680b = c1494a.i();
                            } else if (iL == 16) {
                                this.f16681c = c1494a.i();
                            } else if (!c1494a.f(iL)) {
                                break;
                            }
                        }
                        return this;
                    }

                    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
                    public void a(C1519b c1519b) throws IOException {
                        c1519b.c(1, this.f16680b);
                        c1519b.c(2, this.f16681c);
                    }

                    public C0184a b() {
                        this.f16680b = 0L;
                        this.f16681c = 0L;
                        this.f15981a = -1;
                        return this;
                    }
                }

                public C0183a() {
                    b();
                }

                @Override // com.yandex.metrica.impl.ob.AbstractC1594e
                public int a() {
                    int iA = C1519b.a(2, this.f16678c) + C1519b.a(1, this.f16677b) + 0;
                    C0184a c0184a = this.f16679d;
                    return c0184a != null ? iA + C1519b.a(3, c0184a) : iA;
                }

                @Override // com.yandex.metrica.impl.ob.AbstractC1594e
                public AbstractC1594e a(C1494a c1494a) throws IOException {
                    while (true) {
                        int iL = c1494a.l();
                        if (iL == 0) {
                            break;
                        }
                        if (iL == 8) {
                            this.f16677b = c1494a.c();
                        } else if (iL == 16) {
                            this.f16678c = c1494a.c();
                        } else if (iL == 26) {
                            if (this.f16679d == null) {
                                this.f16679d = new C0184a();
                            }
                            c1494a.a(this.f16679d);
                        } else if (!c1494a.f(iL)) {
                            break;
                        }
                    }
                    return this;
                }

                @Override // com.yandex.metrica.impl.ob.AbstractC1594e
                public void a(C1519b c1519b) throws IOException {
                    c1519b.b(1, this.f16677b);
                    c1519b.b(2, this.f16678c);
                    C0184a c0184a = this.f16679d;
                    if (c0184a != null) {
                        c1519b.b(3, c0184a);
                    }
                }

                public C0183a b() {
                    this.f16677b = true;
                    this.f16678c = false;
                    this.f16679d = null;
                    this.f15981a = -1;
                    return this;
                }
            }

            /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.kg$k$a$b */
            public static final class b extends AbstractC1594e {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public boolean f16682b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public boolean f16683c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public C0185a f16684d;

                /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.kg$k$a$b$a, reason: collision with other inner class name */
                public static final class C0185a extends AbstractC1594e {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public long f16685b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public long f16686c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public int f16687d;

                    public C0185a() {
                        b();
                    }

                    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
                    public int a() {
                        return C1519b.a(3, this.f16687d) + C1519b.a(2, this.f16686c) + C1519b.a(1, this.f16685b) + 0;
                    }

                    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
                    public AbstractC1594e a(C1494a c1494a) throws IOException {
                        while (true) {
                            int iL = c1494a.l();
                            if (iL == 0) {
                                break;
                            }
                            if (iL == 8) {
                                this.f16685b = c1494a.i();
                            } else if (iL == 16) {
                                this.f16686c = c1494a.i();
                            } else if (iL == 24) {
                                int iH = c1494a.h();
                                if (iH == 0 || iH == 1 || iH == 2 || iH == 3) {
                                    this.f16687d = iH;
                                }
                            } else if (!c1494a.f(iL)) {
                                break;
                            }
                        }
                        return this;
                    }

                    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
                    public void a(C1519b c1519b) throws IOException {
                        c1519b.c(1, this.f16685b);
                        c1519b.c(2, this.f16686c);
                        c1519b.d(3, this.f16687d);
                    }

                    public C0185a b() {
                        this.f16685b = 0L;
                        this.f16686c = 0L;
                        this.f16687d = 0;
                        this.f15981a = -1;
                        return this;
                    }
                }

                public b() {
                    b();
                }

                @Override // com.yandex.metrica.impl.ob.AbstractC1594e
                public int a() {
                    int iA = C1519b.a(2, this.f16683c) + C1519b.a(1, this.f16682b) + 0;
                    C0185a c0185a = this.f16684d;
                    return c0185a != null ? iA + C1519b.a(3, c0185a) : iA;
                }

                @Override // com.yandex.metrica.impl.ob.AbstractC1594e
                public AbstractC1594e a(C1494a c1494a) throws IOException {
                    while (true) {
                        int iL = c1494a.l();
                        if (iL == 0) {
                            break;
                        }
                        if (iL == 8) {
                            this.f16682b = c1494a.c();
                        } else if (iL == 16) {
                            this.f16683c = c1494a.c();
                        } else if (iL == 26) {
                            if (this.f16684d == null) {
                                this.f16684d = new C0185a();
                            }
                            c1494a.a(this.f16684d);
                        } else if (!c1494a.f(iL)) {
                            break;
                        }
                    }
                    return this;
                }

                @Override // com.yandex.metrica.impl.ob.AbstractC1594e
                public void a(C1519b c1519b) throws IOException {
                    c1519b.b(1, this.f16682b);
                    c1519b.b(2, this.f16683c);
                    C0185a c0185a = this.f16684d;
                    if (c0185a != null) {
                        c1519b.b(3, c0185a);
                    }
                }

                public b b() {
                    this.f16682b = true;
                    this.f16683c = false;
                    this.f16684d = null;
                    this.f15981a = -1;
                    return this;
                }
            }

            public a() {
                b();
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC1594e
            public int a() {
                int iA = C1519b.a(9, this.f16669k) + C1519b.a(8, this.f16667i) + C1519b.a(7, this.f16666h) + C1519b.a(6, this.f16665g) + C1519b.a(5, this.f16664f) + C1519b.a(4, this.f16663e) + C1519b.a(3, this.f16662d) + C1519b.c(2) + 4 + C1519b.a(1, this.f16660b) + 0;
                C0183a c0183a = this.f16670l;
                if (c0183a != null) {
                    iA += C1519b.a(10, c0183a);
                }
                C0183a c0183a2 = this.f16671m;
                if (c0183a2 != null) {
                    iA += C1519b.a(11, c0183a2);
                }
                C0183a c0183a3 = this.f16672n;
                if (c0183a3 != null) {
                    iA += C1519b.a(12, c0183a3);
                }
                int iA2 = C1519b.a(13, this.f16668j) + iA;
                C0183a c0183a4 = this.f16673o;
                if (c0183a4 != null) {
                    iA2 += C1519b.a(14, c0183a4);
                }
                b bVar = this.f16674p;
                if (bVar != null) {
                    iA2 += C1519b.a(15, bVar);
                }
                boolean z10 = this.f16675q;
                if (z10) {
                    iA2 += C1519b.a(16, z10);
                }
                boolean z11 = this.f16676r;
                return z11 ? iA2 + C1519b.a(17, z11) : iA2;
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
                            this.f16660b = c1494a.i();
                            continue;
                        case 21:
                            this.f16661c = Float.intBitsToFloat(c1494a.f());
                            continue;
                        case 24:
                            this.f16662d = c1494a.h();
                            continue;
                        case 32:
                            this.f16663e = c1494a.h();
                            continue;
                        case 40:
                            this.f16664f = c1494a.i();
                            continue;
                        case 48:
                            this.f16665g = c1494a.h();
                            continue;
                        case 56:
                            this.f16666h = c1494a.c();
                            continue;
                        case 64:
                            this.f16667i = c1494a.c();
                            continue;
                        case 72:
                            this.f16669k = c1494a.i();
                            continue;
                        case 82:
                            if (this.f16670l == null) {
                                this.f16670l = new C0183a();
                            }
                            abstractC1594e = this.f16670l;
                            break;
                        case 90:
                            if (this.f16671m == null) {
                                this.f16671m = new C0183a();
                            }
                            abstractC1594e = this.f16671m;
                            break;
                        case 98:
                            if (this.f16672n == null) {
                                this.f16672n = new C0183a();
                            }
                            abstractC1594e = this.f16672n;
                            break;
                        case 104:
                            this.f16668j = c1494a.c();
                            continue;
                        case 114:
                            if (this.f16673o == null) {
                                this.f16673o = new C0183a();
                            }
                            abstractC1594e = this.f16673o;
                            break;
                        case 122:
                            if (this.f16674p == null) {
                                this.f16674p = new b();
                            }
                            abstractC1594e = this.f16674p;
                            break;
                        case 128:
                            this.f16675q = c1494a.c();
                            continue;
                        case SyslogConstants.LOG_LOCAL1 /* 136 */:
                            this.f16676r = c1494a.c();
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
                c1519b.c(1, this.f16660b);
                c1519b.a(2, this.f16661c);
                c1519b.d(3, this.f16662d);
                c1519b.d(4, this.f16663e);
                c1519b.c(5, this.f16664f);
                c1519b.d(6, this.f16665g);
                c1519b.b(7, this.f16666h);
                c1519b.b(8, this.f16667i);
                c1519b.c(9, this.f16669k);
                C0183a c0183a = this.f16670l;
                if (c0183a != null) {
                    c1519b.b(10, c0183a);
                }
                C0183a c0183a2 = this.f16671m;
                if (c0183a2 != null) {
                    c1519b.b(11, c0183a2);
                }
                C0183a c0183a3 = this.f16672n;
                if (c0183a3 != null) {
                    c1519b.b(12, c0183a3);
                }
                c1519b.b(13, this.f16668j);
                C0183a c0183a4 = this.f16673o;
                if (c0183a4 != null) {
                    c1519b.b(14, c0183a4);
                }
                b bVar = this.f16674p;
                if (bVar != null) {
                    c1519b.b(15, bVar);
                }
                boolean z10 = this.f16675q;
                if (z10) {
                    c1519b.b(16, z10);
                }
                boolean z11 = this.f16676r;
                if (z11) {
                    c1519b.b(17, z11);
                }
            }

            public a b() {
                this.f16660b = 5000L;
                this.f16661c = 10.0f;
                this.f16662d = 20;
                this.f16663e = 200;
                this.f16664f = 60000L;
                this.f16665g = 10000;
                this.f16666h = false;
                this.f16667i = false;
                this.f16668j = true;
                this.f16669k = 60000L;
                this.f16670l = null;
                this.f16671m = null;
                this.f16672n = null;
                this.f16673o = null;
                this.f16674p = null;
                this.f16675q = false;
                this.f16676r = false;
                this.f15981a = -1;
                return this;
            }
        }

        /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.kg$k$b */
        public static final class b extends AbstractC1594e {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int[] f16688b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int[] f16689c;

            public b() {
                b();
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC1594e
            public int a() {
                int length;
                int[] iArr;
                int[] iArr2 = this.f16688b;
                int i10 = 0;
                if (iArr2 == null || iArr2.length <= 0) {
                    length = 0;
                } else {
                    int i11 = 0;
                    int iA = 0;
                    while (true) {
                        iArr = this.f16688b;
                        if (i11 >= iArr.length) {
                            break;
                        }
                        iA += C1519b.a(iArr[i11]);
                        i11++;
                    }
                    length = (iArr.length * 1) + iA + 0;
                }
                int[] iArr3 = this.f16689c;
                if (iArr3 == null || iArr3.length <= 0) {
                    return length;
                }
                int iA2 = 0;
                while (true) {
                    int[] iArr4 = this.f16689c;
                    if (i10 >= iArr4.length) {
                        return length + iA2 + (iArr4.length * 1);
                    }
                    iA2 += C1519b.a(iArr4[i10]);
                    i10++;
                }
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC1594e
            public AbstractC1594e a(C1494a c1494a) throws IOException {
                int iC;
                while (true) {
                    int iL = c1494a.l();
                    if (iL == 0) {
                        break;
                    }
                    if (iL != 8) {
                        if (iL != 10) {
                            if (iL != 16) {
                                if (iL != 18) {
                                    if (!c1494a.f(iL)) {
                                        break;
                                    }
                                } else {
                                    iC = c1494a.c(c1494a.h());
                                    int iB = c1494a.b();
                                    int i10 = 0;
                                    while (c1494a.a() > 0) {
                                        int iH = c1494a.h();
                                        if (iH == 0 || iH == 2 || iH == 3) {
                                            i10++;
                                        }
                                    }
                                    if (i10 != 0) {
                                        c1494a.e(iB);
                                        int[] iArr = this.f16689c;
                                        int length = iArr == null ? 0 : iArr.length;
                                        int[] iArr2 = new int[i10 + length];
                                        if (length != 0) {
                                            System.arraycopy(iArr, 0, iArr2, 0, length);
                                        }
                                        while (c1494a.a() > 0) {
                                            int iH2 = c1494a.h();
                                            if (iH2 == 0 || iH2 == 2 || iH2 == 3) {
                                                iArr2[length] = iH2;
                                                length++;
                                            }
                                        }
                                        this.f16689c = iArr2;
                                    }
                                }
                            } else {
                                int iA = C1644g.a(c1494a, 16);
                                int[] iArr3 = new int[iA];
                                int i11 = 0;
                                for (int i12 = 0; i12 < iA; i12++) {
                                    if (i12 != 0) {
                                        c1494a.l();
                                    }
                                    int iH3 = c1494a.h();
                                    if (iH3 == 0 || iH3 == 2 || iH3 == 3) {
                                        iArr3[i11] = iH3;
                                        i11++;
                                    }
                                }
                                if (i11 != 0) {
                                    int[] iArr4 = this.f16689c;
                                    int length2 = iArr4 == null ? 0 : iArr4.length;
                                    if (length2 == 0 && i11 == iA) {
                                        this.f16689c = iArr3;
                                    } else {
                                        int[] iArr5 = new int[length2 + i11];
                                        if (length2 != 0) {
                                            System.arraycopy(iArr4, 0, iArr5, 0, length2);
                                        }
                                        System.arraycopy(iArr3, 0, iArr5, length2, i11);
                                        this.f16689c = iArr5;
                                    }
                                }
                            }
                        } else {
                            iC = c1494a.c(c1494a.h());
                            int iB2 = c1494a.b();
                            int i13 = 0;
                            while (c1494a.a() > 0) {
                                int iH4 = c1494a.h();
                                if (iH4 == 0 || iH4 == 1 || iH4 == 2 || iH4 == 3 || iH4 == 4) {
                                    i13++;
                                }
                            }
                            if (i13 != 0) {
                                c1494a.e(iB2);
                                int[] iArr6 = this.f16688b;
                                int length3 = iArr6 == null ? 0 : iArr6.length;
                                int[] iArr7 = new int[i13 + length3];
                                if (length3 != 0) {
                                    System.arraycopy(iArr6, 0, iArr7, 0, length3);
                                }
                                while (c1494a.a() > 0) {
                                    int iH5 = c1494a.h();
                                    if (iH5 == 0 || iH5 == 1 || iH5 == 2 || iH5 == 3 || iH5 == 4) {
                                        iArr7[length3] = iH5;
                                        length3++;
                                    }
                                }
                                this.f16688b = iArr7;
                            }
                        }
                        c1494a.b(iC);
                    } else {
                        int iA2 = C1644g.a(c1494a, 8);
                        int[] iArr8 = new int[iA2];
                        int i14 = 0;
                        for (int i15 = 0; i15 < iA2; i15++) {
                            if (i15 != 0) {
                                c1494a.l();
                            }
                            int iH6 = c1494a.h();
                            if (iH6 == 0 || iH6 == 1 || iH6 == 2 || iH6 == 3 || iH6 == 4) {
                                iArr8[i14] = iH6;
                                i14++;
                            }
                        }
                        if (i14 != 0) {
                            int[] iArr9 = this.f16688b;
                            int length4 = iArr9 == null ? 0 : iArr9.length;
                            if (length4 == 0 && i14 == iA2) {
                                this.f16688b = iArr8;
                            } else {
                                int[] iArr10 = new int[length4 + i14];
                                if (length4 != 0) {
                                    System.arraycopy(iArr9, 0, iArr10, 0, length4);
                                }
                                System.arraycopy(iArr8, 0, iArr10, length4, i14);
                                this.f16688b = iArr10;
                            }
                        }
                    }
                }
                return this;
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC1594e
            public void a(C1519b c1519b) throws IOException {
                int[] iArr = this.f16688b;
                int i10 = 0;
                if (iArr != null && iArr.length > 0) {
                    int i11 = 0;
                    while (true) {
                        int[] iArr2 = this.f16688b;
                        if (i11 >= iArr2.length) {
                            break;
                        }
                        c1519b.d(1, iArr2[i11]);
                        i11++;
                    }
                }
                int[] iArr3 = this.f16689c;
                if (iArr3 == null || iArr3.length <= 0) {
                    return;
                }
                while (true) {
                    int[] iArr4 = this.f16689c;
                    if (i10 >= iArr4.length) {
                        return;
                    }
                    c1519b.d(2, iArr4[i10]);
                    i10++;
                }
            }

            public b b() {
                int[] iArr = C1644g.f16154a;
                this.f16688b = iArr;
                this.f16689c = iArr;
                this.f15981a = -1;
                return this;
            }
        }

        public k() {
            b();
        }

        public static k[] c() {
            if (f16657d == null) {
                synchronized (C1544c.f15862a) {
                    if (f16657d == null) {
                        f16657d = new k[0];
                    }
                }
            }
            return f16657d;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public int a() {
            a aVar = this.f16658b;
            int iA = aVar != null ? 0 + C1519b.a(1, aVar) : 0;
            b bVar = this.f16659c;
            return bVar != null ? iA + C1519b.a(2, bVar) : iA;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public AbstractC1594e a(C1494a c1494a) throws IOException {
            AbstractC1594e abstractC1594e;
            while (true) {
                int iL = c1494a.l();
                if (iL == 0) {
                    break;
                }
                if (iL == 10) {
                    if (this.f16658b == null) {
                        this.f16658b = new a();
                    }
                    abstractC1594e = this.f16658b;
                } else if (iL == 18) {
                    if (this.f16659c == null) {
                        this.f16659c = new b();
                    }
                    abstractC1594e = this.f16659c;
                } else if (!c1494a.f(iL)) {
                    break;
                }
                c1494a.a(abstractC1594e);
            }
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public void a(C1519b c1519b) throws IOException {
            a aVar = this.f16658b;
            if (aVar != null) {
                c1519b.b(1, aVar);
            }
            b bVar = this.f16659c;
            if (bVar != null) {
                c1519b.b(2, bVar);
            }
        }

        public k b() {
            this.f16658b = null;
            this.f16659c = null;
            this.f15981a = -1;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.kg$l */
    public static final class l extends AbstractC1594e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static volatile l[] f16690d;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f16691b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f16692c;

        public l() {
            b();
        }

        public static l[] c() {
            if (f16690d == null) {
                synchronized (C1544c.f15862a) {
                    if (f16690d == null) {
                        f16690d = new l[0];
                    }
                }
            }
            return f16690d;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public int a() {
            return C1519b.a(2, this.f16692c) + C1519b.a(1, this.f16691b) + 0;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public AbstractC1594e a(C1494a c1494a) throws IOException {
            while (true) {
                int iL = c1494a.l();
                if (iL == 0) {
                    break;
                }
                if (iL == 10) {
                    this.f16691b = c1494a.k();
                } else if (iL == 16) {
                    this.f16692c = c1494a.c();
                } else if (!c1494a.f(iL)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public void a(C1519b c1519b) throws IOException {
            c1519b.b(1, this.f16691b);
            c1519b.b(2, this.f16692c);
        }

        public l b() {
            this.f16691b = "";
            this.f16692c = false;
            this.f15981a = -1;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.kg$m */
    public static final class m extends AbstractC1594e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f16693b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f16694c;

        public m() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public int a() {
            return C1519b.a(2, this.f16694c) + C1519b.a(1, this.f16693b) + 0;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public AbstractC1594e a(C1494a c1494a) throws IOException {
            while (true) {
                int iL = c1494a.l();
                if (iL == 0) {
                    break;
                }
                if (iL == 8) {
                    this.f16693b = c1494a.i();
                } else if (iL == 16) {
                    this.f16694c = c1494a.i();
                } else if (!c1494a.f(iL)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public void a(C1519b c1519b) throws IOException {
            c1519b.c(1, this.f16693b);
            c1519b.c(2, this.f16694c);
        }

        public m b() {
            this.f16693b = 86400L;
            this.f16694c = 432000L;
            this.f15981a = -1;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.kg$n */
    public static final class n extends AbstractC1594e {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static volatile n[] f16695h;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f16696b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f16697c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f16698d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public a[] f16699e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f16700f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int[] f16701g;

        /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.kg$n$a */
        public static final class a extends AbstractC1594e {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static volatile a[] f16702d;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public String f16703b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public String f16704c;

            public a() {
                b();
            }

            public static a[] c() {
                if (f16702d == null) {
                    synchronized (C1544c.f15862a) {
                        if (f16702d == null) {
                            f16702d = new a[0];
                        }
                    }
                }
                return f16702d;
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC1594e
            public int a() {
                return C1519b.a(2, this.f16704c) + C1519b.a(1, this.f16703b) + 0;
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC1594e
            public AbstractC1594e a(C1494a c1494a) throws IOException {
                while (true) {
                    int iL = c1494a.l();
                    if (iL == 0) {
                        break;
                    }
                    if (iL == 10) {
                        this.f16703b = c1494a.k();
                    } else if (iL == 18) {
                        this.f16704c = c1494a.k();
                    } else if (!c1494a.f(iL)) {
                        break;
                    }
                }
                return this;
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC1594e
            public void a(C1519b c1519b) throws IOException {
                c1519b.b(1, this.f16703b);
                c1519b.b(2, this.f16704c);
            }

            public a b() {
                this.f16703b = "";
                this.f16704c = "";
                this.f15981a = -1;
                return this;
            }
        }

        public n() {
            b();
        }

        public static n[] c() {
            if (f16695h == null) {
                synchronized (C1544c.f15862a) {
                    if (f16695h == null) {
                        f16695h = new n[0];
                    }
                }
            }
            return f16695h;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public int a() {
            int i10 = 0;
            int iA = C1519b.a(3, this.f16698d) + C1519b.a(2, this.f16697c) + C1519b.a(1, this.f16696b) + 0;
            a[] aVarArr = this.f16699e;
            if (aVarArr != null && aVarArr.length > 0) {
                int i11 = 0;
                while (true) {
                    a[] aVarArr2 = this.f16699e;
                    if (i11 >= aVarArr2.length) {
                        break;
                    }
                    a aVar = aVarArr2[i11];
                    if (aVar != null) {
                        iA += C1519b.a(4, aVar);
                    }
                    i11++;
                }
            }
            int iA2 = C1519b.a(5, this.f16700f) + iA;
            int[] iArr = this.f16701g;
            if (iArr == null || iArr.length <= 0) {
                return iA2;
            }
            int iA3 = 0;
            while (true) {
                int[] iArr2 = this.f16701g;
                if (i10 >= iArr2.length) {
                    return iA2 + iA3 + (iArr2.length * 1);
                }
                iA3 += C1519b.a(iArr2[i10]);
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
                                                int[] iArr = this.f16701g;
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
                                                this.f16701g = iArr2;
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
                                            int[] iArr4 = this.f16701g;
                                            int length2 = iArr4 == null ? 0 : iArr4.length;
                                            if (length2 == 0 && i11 == iA) {
                                                this.f16701g = iArr3;
                                            } else {
                                                int[] iArr5 = new int[length2 + i11];
                                                if (length2 != 0) {
                                                    System.arraycopy(iArr4, 0, iArr5, 0, length2);
                                                }
                                                System.arraycopy(iArr3, 0, iArr5, length2, i11);
                                                this.f16701g = iArr5;
                                            }
                                        }
                                    }
                                } else {
                                    this.f16700f = c1494a.i();
                                }
                            } else {
                                int iA2 = C1644g.a(c1494a, 34);
                                a[] aVarArr = this.f16699e;
                                int length3 = aVarArr == null ? 0 : aVarArr.length;
                                int i13 = iA2 + length3;
                                a[] aVarArr2 = new a[i13];
                                if (length3 != 0) {
                                    System.arraycopy(aVarArr, 0, aVarArr2, 0, length3);
                                }
                                while (length3 < i13 - 1) {
                                    aVarArr2[length3] = new a();
                                    c1494a.a(aVarArr2[length3]);
                                    c1494a.l();
                                    length3++;
                                }
                                aVarArr2[length3] = new a();
                                c1494a.a(aVarArr2[length3]);
                                this.f16699e = aVarArr2;
                            }
                        } else {
                            this.f16698d = c1494a.k();
                        }
                    } else {
                        this.f16697c = c1494a.k();
                    }
                } else {
                    this.f16696b = c1494a.k();
                }
            }
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public void a(C1519b c1519b) throws IOException {
            c1519b.b(1, this.f16696b);
            c1519b.b(2, this.f16697c);
            c1519b.b(3, this.f16698d);
            a[] aVarArr = this.f16699e;
            int i10 = 0;
            if (aVarArr != null && aVarArr.length > 0) {
                int i11 = 0;
                while (true) {
                    a[] aVarArr2 = this.f16699e;
                    if (i11 >= aVarArr2.length) {
                        break;
                    }
                    a aVar = aVarArr2[i11];
                    if (aVar != null) {
                        c1519b.b(4, aVar);
                    }
                    i11++;
                }
            }
            c1519b.c(5, this.f16700f);
            int[] iArr = this.f16701g;
            if (iArr == null || iArr.length <= 0) {
                return;
            }
            while (true) {
                int[] iArr2 = this.f16701g;
                if (i10 >= iArr2.length) {
                    return;
                }
                c1519b.d(6, iArr2[i10]);
                i10++;
            }
        }

        public n b() {
            this.f16696b = "";
            this.f16697c = "";
            this.f16698d = "";
            this.f16699e = a.c();
            this.f16700f = 0L;
            this.f16701g = C1644g.f16154a;
            this.f15981a = -1;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.kg$o */
    public static final class o extends AbstractC1594e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f16705b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f16706c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f16707d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f16708e;

        public o() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public int a() {
            long j10 = this.f16705b;
            int iA = j10 != 432000000 ? 0 + C1519b.a(1, j10) : 0;
            long j11 = this.f16706c;
            if (j11 != 86400000) {
                iA += C1519b.a(2, j11);
            }
            long j12 = this.f16707d;
            if (j12 != AbstractComponentTracker.LINGERING_TIMEOUT) {
                iA += C1519b.a(3, j12);
            }
            long j13 = this.f16708e;
            return j13 != 3600000 ? iA + C1519b.a(4, j13) : iA;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public AbstractC1594e a(C1494a c1494a) throws IOException {
            while (true) {
                int iL = c1494a.l();
                if (iL == 0) {
                    break;
                }
                if (iL == 8) {
                    this.f16705b = c1494a.i();
                } else if (iL == 16) {
                    this.f16706c = c1494a.i();
                } else if (iL == 24) {
                    this.f16707d = c1494a.i();
                } else if (iL == 32) {
                    this.f16708e = c1494a.i();
                } else if (!c1494a.f(iL)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public void a(C1519b c1519b) throws IOException {
            long j10 = this.f16705b;
            if (j10 != 432000000) {
                c1519b.c(1, j10);
            }
            long j11 = this.f16706c;
            if (j11 != 86400000) {
                c1519b.c(2, j11);
            }
            long j12 = this.f16707d;
            if (j12 != AbstractComponentTracker.LINGERING_TIMEOUT) {
                c1519b.c(3, j12);
            }
            long j13 = this.f16708e;
            if (j13 != 3600000) {
                c1519b.c(4, j13);
            }
        }

        public o b() {
            this.f16705b = 432000000L;
            this.f16706c = 86400000L;
            this.f16707d = AbstractComponentTracker.LINGERING_TIMEOUT;
            this.f16708e = 3600000L;
            this.f15981a = -1;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.kg$p */
    public static final class p extends AbstractC1594e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f16709b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f16710c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int[] f16711d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int[] f16712e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f16713f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f16714g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f16715h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public long f16716i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public long f16717j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f16718k;

        public p() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public int a() {
            int[] iArr;
            int[] iArr2;
            int i10 = 0;
            int iA = C1519b.a(2, this.f16710c) + C1519b.a(1, this.f16709b) + 0;
            int[] iArr3 = this.f16711d;
            if (iArr3 != null && iArr3.length > 0) {
                int i11 = 0;
                int iA2 = 0;
                while (true) {
                    iArr2 = this.f16711d;
                    if (i11 >= iArr2.length) {
                        break;
                    }
                    iA2 += C1519b.a(iArr2[i11]);
                    i11++;
                }
                iA = iA + iA2 + (iArr2.length * 1);
            }
            int iA3 = C1519b.a(5, this.f16714g) + C1519b.a(4, this.f16713f) + iA;
            long j10 = this.f16715h;
            if (j10 != 43200) {
                iA3 += C1519b.a(6, j10);
            }
            long j11 = this.f16716i;
            if (j11 != 3600) {
                iA3 += C1519b.a(7, j11);
            }
            long j12 = this.f16717j;
            if (j12 != 86400) {
                iA3 += C1519b.a(8, j12);
            }
            int[] iArr4 = this.f16712e;
            if (iArr4 != null && iArr4.length > 0) {
                int iA4 = 0;
                while (true) {
                    iArr = this.f16712e;
                    if (i10 >= iArr.length) {
                        break;
                    }
                    iA4 += C1519b.a(iArr[i10]);
                    i10++;
                }
                iA3 = iA3 + iA4 + (iArr.length * 1);
            }
            long j13 = this.f16718k;
            return j13 != 30 ? iA3 + C1519b.a(10, j13) : iA3;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public AbstractC1594e a(C1494a c1494a) throws IOException {
            int iC;
            while (true) {
                int iL = c1494a.l();
                switch (iL) {
                    case 0:
                        break;
                    case 8:
                        this.f16709b = c1494a.i();
                        continue;
                    case 18:
                        this.f16710c = c1494a.k();
                        continue;
                    case 24:
                        int iA = C1644g.a(c1494a, 24);
                        int[] iArr = this.f16711d;
                        int length = iArr == null ? 0 : iArr.length;
                        int i10 = iA + length;
                        int[] iArr2 = new int[i10];
                        if (length != 0) {
                            System.arraycopy(iArr, 0, iArr2, 0, length);
                        }
                        while (length < i10 - 1) {
                            iArr2[length] = c1494a.h();
                            c1494a.l();
                            length++;
                        }
                        iArr2[length] = c1494a.h();
                        this.f16711d = iArr2;
                        continue;
                    case 26:
                        iC = c1494a.c(c1494a.h());
                        int iB = c1494a.b();
                        int i11 = 0;
                        while (c1494a.a() > 0) {
                            c1494a.h();
                            i11++;
                        }
                        c1494a.e(iB);
                        int[] iArr3 = this.f16711d;
                        int length2 = iArr3 == null ? 0 : iArr3.length;
                        int i12 = i11 + length2;
                        int[] iArr4 = new int[i12];
                        if (length2 != 0) {
                            System.arraycopy(iArr3, 0, iArr4, 0, length2);
                        }
                        while (length2 < i12) {
                            iArr4[length2] = c1494a.h();
                            length2++;
                        }
                        this.f16711d = iArr4;
                        break;
                    case 32:
                        this.f16713f = c1494a.i();
                        continue;
                    case 40:
                        this.f16714g = c1494a.h();
                        continue;
                    case 48:
                        this.f16715h = c1494a.i();
                        continue;
                    case 56:
                        this.f16716i = c1494a.i();
                        continue;
                    case 64:
                        this.f16717j = c1494a.i();
                        continue;
                    case 72:
                        int iA2 = C1644g.a(c1494a, 72);
                        int[] iArr5 = this.f16712e;
                        int length3 = iArr5 == null ? 0 : iArr5.length;
                        int i13 = iA2 + length3;
                        int[] iArr6 = new int[i13];
                        if (length3 != 0) {
                            System.arraycopy(iArr5, 0, iArr6, 0, length3);
                        }
                        while (length3 < i13 - 1) {
                            iArr6[length3] = c1494a.h();
                            c1494a.l();
                            length3++;
                        }
                        iArr6[length3] = c1494a.h();
                        this.f16712e = iArr6;
                        continue;
                    case 74:
                        iC = c1494a.c(c1494a.h());
                        int iB2 = c1494a.b();
                        int i14 = 0;
                        while (c1494a.a() > 0) {
                            c1494a.h();
                            i14++;
                        }
                        c1494a.e(iB2);
                        int[] iArr7 = this.f16712e;
                        int length4 = iArr7 == null ? 0 : iArr7.length;
                        int i15 = i14 + length4;
                        int[] iArr8 = new int[i15];
                        if (length4 != 0) {
                            System.arraycopy(iArr7, 0, iArr8, 0, length4);
                        }
                        while (length4 < i15) {
                            iArr8[length4] = c1494a.h();
                            length4++;
                        }
                        this.f16712e = iArr8;
                        break;
                    case 80:
                        this.f16718k = c1494a.i();
                        continue;
                    default:
                        if (c1494a.f(iL)) {
                            continue;
                        }
                        break;
                }
                c1494a.b(iC);
            }
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public void a(C1519b c1519b) throws IOException {
            c1519b.c(1, this.f16709b);
            c1519b.b(2, this.f16710c);
            int[] iArr = this.f16711d;
            int i10 = 0;
            if (iArr != null && iArr.length > 0) {
                int i11 = 0;
                while (true) {
                    int[] iArr2 = this.f16711d;
                    if (i11 >= iArr2.length) {
                        break;
                    }
                    c1519b.d(3, iArr2[i11]);
                    i11++;
                }
            }
            c1519b.c(4, this.f16713f);
            c1519b.d(5, this.f16714g);
            long j10 = this.f16715h;
            if (j10 != 43200) {
                c1519b.c(6, j10);
            }
            long j11 = this.f16716i;
            if (j11 != 3600) {
                c1519b.c(7, j11);
            }
            long j12 = this.f16717j;
            if (j12 != 86400) {
                c1519b.c(8, j12);
            }
            int[] iArr3 = this.f16712e;
            if (iArr3 != null && iArr3.length > 0) {
                while (true) {
                    int[] iArr4 = this.f16712e;
                    if (i10 >= iArr4.length) {
                        break;
                    }
                    c1519b.d(9, iArr4[i10]);
                    i10++;
                }
            }
            long j13 = this.f16718k;
            if (j13 != 30) {
                c1519b.c(10, j13);
            }
        }

        public p b() {
            this.f16709b = 0L;
            this.f16710c = "";
            int[] iArr = C1644g.f16154a;
            this.f16711d = iArr;
            this.f16712e = iArr;
            this.f16713f = 259200L;
            this.f16714g = 10;
            this.f16715h = 43200L;
            this.f16716i = 3600L;
            this.f16717j = 86400L;
            this.f16718k = 30L;
            this.f15981a = -1;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.kg$q */
    public static final class q extends AbstractC1594e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f16719b;

        public q() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public int a() {
            int i10 = this.f16719b;
            if (i10 != 86400) {
                return 0 + C1519b.c(1, i10);
            }
            return 0;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public AbstractC1594e a(C1494a c1494a) throws IOException {
            while (true) {
                int iL = c1494a.l();
                if (iL == 0) {
                    break;
                }
                if (iL == 8) {
                    this.f16719b = c1494a.h();
                } else if (!c1494a.f(iL)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public void a(C1519b c1519b) throws IOException {
            int i10 = this.f16719b;
            if (i10 != 86400) {
                c1519b.f(1, i10);
            }
        }

        public q b() {
            this.f16719b = DateTimeConstants.SECONDS_PER_DAY;
            this.f15981a = -1;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.kg$r */
    public static final class r extends AbstractC1594e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f16720b;

        public r() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public int a() {
            return C1519b.a(1, this.f16720b) + 0;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public AbstractC1594e a(C1494a c1494a) throws IOException {
            while (true) {
                int iL = c1494a.l();
                if (iL == 0) {
                    break;
                }
                if (iL == 8) {
                    this.f16720b = c1494a.i();
                } else if (!c1494a.f(iL)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public void a(C1519b c1519b) throws IOException {
            c1519b.c(1, this.f16720b);
        }

        public r b() {
            this.f16720b = 18000000L;
            this.f15981a = -1;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.kg$s */
    public static final class s extends AbstractC1594e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public t f16721b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public t f16722c;

        public s() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public int a() {
            t tVar = this.f16721b;
            int iA = tVar != null ? 0 + C1519b.a(1, tVar) : 0;
            t tVar2 = this.f16722c;
            return tVar2 != null ? iA + C1519b.a(2, tVar2) : iA;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public AbstractC1594e a(C1494a c1494a) throws IOException {
            t tVar;
            while (true) {
                int iL = c1494a.l();
                if (iL == 0) {
                    break;
                }
                if (iL == 10) {
                    if (this.f16721b == null) {
                        this.f16721b = new t();
                    }
                    tVar = this.f16721b;
                } else if (iL == 18) {
                    if (this.f16722c == null) {
                        this.f16722c = new t();
                    }
                    tVar = this.f16722c;
                } else if (!c1494a.f(iL)) {
                    break;
                }
                c1494a.a(tVar);
            }
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public void a(C1519b c1519b) throws IOException {
            t tVar = this.f16721b;
            if (tVar != null) {
                c1519b.b(1, tVar);
            }
            t tVar2 = this.f16722c;
            if (tVar2 != null) {
                c1519b.b(2, tVar2);
            }
        }

        public s b() {
            this.f16721b = null;
            this.f16722c = null;
            this.f15981a = -1;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.kg$t */
    public static final class t extends AbstractC1594e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f16723b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f16724c;

        public t() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public int a() {
            int i10 = this.f16723b;
            int iA = i10 != 100 ? 0 + C1519b.a(1, i10) : 0;
            long j10 = this.f16724c;
            return j10 != 60 ? iA + C1519b.a(2, j10) : iA;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public AbstractC1594e a(C1494a c1494a) throws IOException {
            while (true) {
                int iL = c1494a.l();
                if (iL == 0) {
                    break;
                }
                if (iL == 8) {
                    this.f16723b = c1494a.h();
                } else if (iL == 16) {
                    this.f16724c = c1494a.i();
                } else if (!c1494a.f(iL)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public void a(C1519b c1519b) throws IOException {
            int i10 = this.f16723b;
            if (i10 != 100) {
                c1519b.d(1, i10);
            }
            long j10 = this.f16724c;
            if (j10 != 60) {
                c1519b.c(2, j10);
            }
        }

        public t b() {
            this.f16723b = 100;
            this.f16724c = 60L;
            this.f15981a = -1;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.kg$u */
    public static final class u extends AbstractC1594e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f16725b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f16726c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f16727d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f16728e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f16729f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f16730g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f16731h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f16732i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f16733j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f16734k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f16735l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f16736m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public x[] f16737n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f16738o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f16739p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f16740q;

        public u() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public int a() {
            boolean z10 = this.f16725b;
            int i10 = 0;
            int iA = !z10 ? C1519b.a(1, z10) + 0 : 0;
            boolean z11 = this.f16726c;
            if (!z11) {
                iA += C1519b.a(2, z11);
            }
            boolean z12 = this.f16727d;
            if (!z12) {
                iA += C1519b.a(3, z12);
            }
            boolean z13 = this.f16728e;
            if (!z13) {
                iA += C1519b.a(4, z13);
            }
            int i11 = this.f16729f;
            if (i11 != 10000) {
                iA += C1519b.a(5, i11);
            }
            int i12 = this.f16730g;
            if (i12 != 1000) {
                iA += C1519b.a(6, i12);
            }
            int i13 = this.f16731h;
            if (i13 != 1000) {
                iA += C1519b.a(7, i13);
            }
            int i14 = this.f16732i;
            if (i14 != 200000) {
                iA += C1519b.a(8, i14);
            }
            boolean z14 = this.f16733j;
            if (z14) {
                iA += C1519b.a(9, z14);
            }
            boolean z15 = this.f16734k;
            if (z15) {
                iA += C1519b.a(10, z15);
            }
            boolean z16 = this.f16735l;
            if (z16) {
                iA += C1519b.a(11, z16);
            }
            boolean z17 = this.f16736m;
            if (z17) {
                iA += C1519b.a(12, z17);
            }
            x[] xVarArr = this.f16737n;
            if (xVarArr != null && xVarArr.length > 0) {
                while (true) {
                    x[] xVarArr2 = this.f16737n;
                    if (i10 >= xVarArr2.length) {
                        break;
                    }
                    x xVar = xVarArr2[i10];
                    if (xVar != null) {
                        iA += C1519b.a(13, xVar);
                    }
                    i10++;
                }
            }
            boolean z18 = this.f16738o;
            if (z18) {
                iA += C1519b.a(14, z18);
            }
            boolean z19 = this.f16739p;
            if (z19) {
                iA += C1519b.a(15, z19);
            }
            int i15 = this.f16740q;
            return i15 != 4000 ? iA + C1519b.a(16, i15) : iA;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public AbstractC1594e a(C1494a c1494a) throws IOException {
            while (true) {
                int iL = c1494a.l();
                switch (iL) {
                    case 0:
                        break;
                    case 8:
                        this.f16725b = c1494a.c();
                        break;
                    case 16:
                        this.f16726c = c1494a.c();
                        break;
                    case 24:
                        this.f16727d = c1494a.c();
                        break;
                    case 32:
                        this.f16728e = c1494a.c();
                        break;
                    case 40:
                        this.f16729f = c1494a.h();
                        break;
                    case 48:
                        this.f16730g = c1494a.h();
                        break;
                    case 56:
                        this.f16731h = c1494a.h();
                        break;
                    case 64:
                        this.f16732i = c1494a.h();
                        break;
                    case 72:
                        this.f16733j = c1494a.c();
                        break;
                    case 80:
                        this.f16734k = c1494a.c();
                        break;
                    case 88:
                        this.f16735l = c1494a.c();
                        break;
                    case 96:
                        this.f16736m = c1494a.c();
                        break;
                    case 106:
                        int iA = C1644g.a(c1494a, 106);
                        x[] xVarArr = this.f16737n;
                        int length = xVarArr == null ? 0 : xVarArr.length;
                        int i10 = iA + length;
                        x[] xVarArr2 = new x[i10];
                        if (length != 0) {
                            System.arraycopy(xVarArr, 0, xVarArr2, 0, length);
                        }
                        while (length < i10 - 1) {
                            xVarArr2[length] = new x();
                            c1494a.a(xVarArr2[length]);
                            c1494a.l();
                            length++;
                        }
                        xVarArr2[length] = new x();
                        c1494a.a(xVarArr2[length]);
                        this.f16737n = xVarArr2;
                        break;
                    case 112:
                        this.f16738o = c1494a.c();
                        break;
                    case 120:
                        this.f16739p = c1494a.c();
                        break;
                    case 128:
                        this.f16740q = c1494a.h();
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
            boolean z10 = this.f16725b;
            if (!z10) {
                c1519b.b(1, z10);
            }
            boolean z11 = this.f16726c;
            if (!z11) {
                c1519b.b(2, z11);
            }
            boolean z12 = this.f16727d;
            if (!z12) {
                c1519b.b(3, z12);
            }
            boolean z13 = this.f16728e;
            if (!z13) {
                c1519b.b(4, z13);
            }
            int i10 = this.f16729f;
            if (i10 != 10000) {
                c1519b.d(5, i10);
            }
            int i11 = this.f16730g;
            if (i11 != 1000) {
                c1519b.d(6, i11);
            }
            int i12 = this.f16731h;
            if (i12 != 1000) {
                c1519b.d(7, i12);
            }
            int i13 = this.f16732i;
            if (i13 != 200000) {
                c1519b.d(8, i13);
            }
            boolean z14 = this.f16733j;
            if (z14) {
                c1519b.b(9, z14);
            }
            boolean z15 = this.f16734k;
            if (z15) {
                c1519b.b(10, z15);
            }
            boolean z16 = this.f16735l;
            if (z16) {
                c1519b.b(11, z16);
            }
            boolean z17 = this.f16736m;
            if (z17) {
                c1519b.b(12, z17);
            }
            x[] xVarArr = this.f16737n;
            if (xVarArr != null && xVarArr.length > 0) {
                int i14 = 0;
                while (true) {
                    x[] xVarArr2 = this.f16737n;
                    if (i14 >= xVarArr2.length) {
                        break;
                    }
                    x xVar = xVarArr2[i14];
                    if (xVar != null) {
                        c1519b.b(13, xVar);
                    }
                    i14++;
                }
            }
            boolean z18 = this.f16738o;
            if (z18) {
                c1519b.b(14, z18);
            }
            boolean z19 = this.f16739p;
            if (z19) {
                c1519b.b(15, z19);
            }
            int i15 = this.f16740q;
            if (i15 != 4000) {
                c1519b.d(16, i15);
            }
        }

        public u b() {
            this.f16725b = true;
            this.f16726c = true;
            this.f16727d = true;
            this.f16728e = true;
            this.f16729f = 10000;
            this.f16730g = 1000;
            this.f16731h = 1000;
            this.f16732i = 200000;
            this.f16733j = false;
            this.f16734k = false;
            this.f16735l = false;
            this.f16736m = false;
            this.f16737n = x.c();
            this.f16738o = false;
            this.f16739p = false;
            this.f16740q = 4000;
            this.f15981a = -1;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.kg$v */
    public static final class v extends AbstractC1594e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f16741b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f16742c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f16743d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f16744e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f16745f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f16746g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f16747h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public x[] f16748i;

        public v() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public int a() {
            int i10 = 0;
            int iA = C1519b.a(7, this.f16747h) + C1519b.a(6, this.f16746g) + C1519b.a(5, this.f16745f) + C1519b.a(4, this.f16744e) + C1519b.a(3, this.f16743d) + C1519b.a(2, this.f16742c) + C1519b.a(1, this.f16741b) + 0;
            x[] xVarArr = this.f16748i;
            if (xVarArr != null && xVarArr.length > 0) {
                while (true) {
                    x[] xVarArr2 = this.f16748i;
                    if (i10 >= xVarArr2.length) {
                        break;
                    }
                    x xVar = xVarArr2[i10];
                    if (xVar != null) {
                        iA += C1519b.a(8, xVar);
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
                if (iL == 8) {
                    this.f16741b = c1494a.h();
                } else if (iL == 16) {
                    this.f16742c = c1494a.h();
                } else if (iL == 24) {
                    this.f16743d = c1494a.h();
                } else if (iL == 32) {
                    this.f16744e = c1494a.i();
                } else if (iL == 40) {
                    this.f16745f = c1494a.c();
                } else if (iL == 48) {
                    this.f16746g = c1494a.c();
                } else if (iL == 56) {
                    this.f16747h = c1494a.c();
                } else if (iL == 66) {
                    int iA = C1644g.a(c1494a, 66);
                    x[] xVarArr = this.f16748i;
                    int length = xVarArr == null ? 0 : xVarArr.length;
                    int i10 = iA + length;
                    x[] xVarArr2 = new x[i10];
                    if (length != 0) {
                        System.arraycopy(xVarArr, 0, xVarArr2, 0, length);
                    }
                    while (length < i10 - 1) {
                        xVarArr2[length] = new x();
                        c1494a.a(xVarArr2[length]);
                        c1494a.l();
                        length++;
                    }
                    xVarArr2[length] = new x();
                    c1494a.a(xVarArr2[length]);
                    this.f16748i = xVarArr2;
                } else if (!c1494a.f(iL)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public void a(C1519b c1519b) throws IOException {
            c1519b.d(1, this.f16741b);
            c1519b.d(2, this.f16742c);
            c1519b.d(3, this.f16743d);
            c1519b.c(4, this.f16744e);
            c1519b.b(5, this.f16745f);
            c1519b.b(6, this.f16746g);
            c1519b.b(7, this.f16747h);
            x[] xVarArr = this.f16748i;
            if (xVarArr == null || xVarArr.length <= 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                x[] xVarArr2 = this.f16748i;
                if (i10 >= xVarArr2.length) {
                    return;
                }
                x xVar = xVarArr2[i10];
                if (xVar != null) {
                    c1519b.b(8, xVar);
                }
                i10++;
            }
        }

        public v b() {
            this.f16741b = 10000;
            this.f16742c = 1000;
            this.f16743d = 100;
            this.f16744e = 5000L;
            this.f16745f = true;
            this.f16746g = false;
            this.f16747h = true;
            this.f16748i = x.c();
            this.f15981a = -1;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.kg$w */
    public static final class w extends AbstractC1594e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f16749b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f16750c;

        public w() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public int a() {
            return C1519b.a(2, this.f16750c) + C1519b.a(1, this.f16749b) + 0;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public AbstractC1594e a(C1494a c1494a) throws IOException {
            while (true) {
                int iL = c1494a.l();
                if (iL == 0) {
                    break;
                }
                if (iL == 8) {
                    this.f16749b = c1494a.c();
                } else if (iL == 16) {
                    this.f16750c = c1494a.c();
                } else if (!c1494a.f(iL)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public void a(C1519b c1519b) throws IOException {
            c1519b.b(1, this.f16749b);
            c1519b.b(2, this.f16750c);
        }

        public w b() {
            this.f16749b = true;
            this.f16750c = false;
            this.f15981a = -1;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.kg$x */
    public static final class x extends AbstractC1594e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static volatile x[] f16751d;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f16752b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f16753c;

        public x() {
            b();
        }

        public static x[] c() {
            if (f16751d == null) {
                synchronized (C1544c.f15862a) {
                    if (f16751d == null) {
                        f16751d = new x[0];
                    }
                }
            }
            return f16751d;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public int a() {
            return C1519b.a(2, this.f16753c) + C1519b.a(1, this.f16752b) + 0;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public AbstractC1594e a(C1494a c1494a) throws IOException {
            while (true) {
                int iL = c1494a.l();
                if (iL == 0) {
                    break;
                }
                if (iL == 8) {
                    int iH = c1494a.h();
                    if (iH == 0 || iH == 1 || iH == 2 || iH == 3) {
                        this.f16752b = iH;
                    }
                } else if (iL == 18) {
                    this.f16753c = c1494a.k();
                } else if (!c1494a.f(iL)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public void a(C1519b c1519b) throws IOException {
            c1519b.d(1, this.f16752b);
            c1519b.b(2, this.f16753c);
        }

        public x b() {
            this.f16752b = 0;
            this.f16753c = "";
            this.f15981a = -1;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.kg$y */
    public static final class y extends AbstractC1594e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f16754b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f16755c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public a[] f16756d;

        /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.kg$y$a */
        public static final class a extends AbstractC1594e {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static volatile a[] f16757d;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public long f16758b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public long f16759c;

            public a() {
                b();
            }

            public static a[] c() {
                if (f16757d == null) {
                    synchronized (C1544c.f15862a) {
                        if (f16757d == null) {
                            f16757d = new a[0];
                        }
                    }
                }
                return f16757d;
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC1594e
            public int a() {
                return C1519b.a(2, this.f16759c) + C1519b.a(1, this.f16758b) + 0;
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC1594e
            public AbstractC1594e a(C1494a c1494a) throws IOException {
                while (true) {
                    int iL = c1494a.l();
                    if (iL == 0) {
                        break;
                    }
                    if (iL == 8) {
                        this.f16758b = c1494a.i();
                    } else if (iL == 16) {
                        this.f16759c = c1494a.i();
                    } else if (!c1494a.f(iL)) {
                        break;
                    }
                }
                return this;
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC1594e
            public void a(C1519b c1519b) throws IOException {
                c1519b.c(1, this.f16758b);
                c1519b.c(2, this.f16759c);
            }

            public a b() {
                this.f16758b = 0L;
                this.f16759c = 0L;
                this.f15981a = -1;
                return this;
            }
        }

        public y() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public int a() {
            int i10 = 0;
            int iA = C1519b.a(2, this.f16755c) + C1519b.a(1, this.f16754b) + 0;
            a[] aVarArr = this.f16756d;
            if (aVarArr != null && aVarArr.length > 0) {
                while (true) {
                    a[] aVarArr2 = this.f16756d;
                    if (i10 >= aVarArr2.length) {
                        break;
                    }
                    a aVar = aVarArr2[i10];
                    if (aVar != null) {
                        iA += C1519b.a(5, aVar);
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
                if (iL == 8) {
                    this.f16754b = c1494a.i();
                } else if (iL == 16) {
                    this.f16755c = c1494a.c();
                } else if (iL == 42) {
                    int iA = C1644g.a(c1494a, 42);
                    a[] aVarArr = this.f16756d;
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
                    this.f16756d = aVarArr2;
                } else if (!c1494a.f(iL)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public void a(C1519b c1519b) throws IOException {
            c1519b.c(1, this.f16754b);
            c1519b.b(2, this.f16755c);
            a[] aVarArr = this.f16756d;
            if (aVarArr == null || aVarArr.length <= 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                a[] aVarArr2 = this.f16756d;
                if (i10 >= aVarArr2.length) {
                    return;
                }
                a aVar = aVarArr2[i10];
                if (aVar != null) {
                    c1519b.b(5, aVar);
                }
                i10++;
            }
        }

        public y b() {
            this.f16754b = 60000L;
            this.f16755c = false;
            this.f16756d = a.c();
            this.f15981a = -1;
            return this;
        }
    }

    public C1760kg() {
        b();
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
    public int a() {
        int i10 = 0;
        int iA = C1519b.a(3, this.f16582c) + (!this.f16581b.equals("") ? C1519b.a(1, this.f16581b) + 0 : 0);
        String[] strArr = this.f16583d;
        if (strArr != null && strArr.length > 0) {
            int i11 = 0;
            int iA2 = 0;
            int i12 = 0;
            while (true) {
                String[] strArr2 = this.f16583d;
                if (i11 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i11];
                if (str != null) {
                    i12++;
                    iA2 += C1519b.a(str);
                }
                i11++;
            }
            iA = iA + iA2 + (i12 * 1);
        }
        if (!this.f16584e.equals("")) {
            iA += C1519b.a(5, this.f16584e);
        }
        if (!this.f16585f.equals("")) {
            iA += C1519b.a(6, this.f16585f);
        }
        String[] strArr3 = this.f16586g;
        if (strArr3 != null && strArr3.length > 0) {
            int i13 = 0;
            int iA3 = 0;
            int i14 = 0;
            while (true) {
                String[] strArr4 = this.f16586g;
                if (i13 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i13];
                if (str2 != null) {
                    i14++;
                    iA3 += C1519b.a(str2);
                }
                i13++;
            }
            iA = iA + iA3 + (i14 * 1);
        }
        String[] strArr5 = this.f16587h;
        if (strArr5 != null && strArr5.length > 0) {
            int i15 = 0;
            int iA4 = 0;
            int i16 = 0;
            while (true) {
                String[] strArr6 = this.f16587h;
                if (i15 >= strArr6.length) {
                    break;
                }
                String str3 = strArr6[i15];
                if (str3 != null) {
                    i16++;
                    iA4 += C1519b.a(str3);
                }
                i15++;
            }
            iA = iA + iA4 + (i16 * 1);
        }
        String[] strArr7 = this.f16588i;
        if (strArr7 != null && strArr7.length > 0) {
            int i17 = 0;
            int iA5 = 0;
            int i18 = 0;
            while (true) {
                String[] strArr8 = this.f16588i;
                if (i17 >= strArr8.length) {
                    break;
                }
                String str4 = strArr8[i17];
                if (str4 != null) {
                    i18++;
                    iA5 += C1519b.a(str4);
                }
                i17++;
            }
            iA = iA + iA5 + (i18 * 1);
        }
        i iVar = this.f16591l;
        if (iVar != null) {
            iA += C1519b.a(10, iVar);
        }
        k[] kVarArr = this.f16592m;
        if (kVarArr != null && kVarArr.length > 0) {
            int i19 = 0;
            while (true) {
                k[] kVarArr2 = this.f16592m;
                if (i19 >= kVarArr2.length) {
                    break;
                }
                k kVar = kVarArr2[i19];
                if (kVar != null) {
                    iA += C1519b.a(11, kVar);
                }
                i19++;
            }
        }
        y yVar = this.f16593n;
        if (yVar != null) {
            iA += C1519b.a(12, yVar);
        }
        p pVar = this.f16594o;
        if (pVar != null) {
            iA += C1519b.a(13, pVar);
        }
        n[] nVarArr = this.f16595p;
        if (nVarArr != null && nVarArr.length > 0) {
            int i20 = 0;
            while (true) {
                n[] nVarArr2 = this.f16595p;
                if (i20 >= nVarArr2.length) {
                    break;
                }
                n nVar = nVarArr2[i20];
                if (nVar != null) {
                    iA += C1519b.a(14, nVar);
                }
                i20++;
            }
        }
        if (!this.f16596q.equals("")) {
            iA += C1519b.a(15, this.f16596q);
        }
        if (!this.f16597r.equals("")) {
            iA += C1519b.a(16, this.f16597r);
        }
        int iA6 = C1519b.a(17, this.f16599t) + iA;
        if (!this.f16600u.equals("")) {
            iA6 += C1519b.a(19, this.f16600u);
        }
        String[] strArr9 = this.f16601v;
        if (strArr9 != null && strArr9.length > 0) {
            int i21 = 0;
            int iA7 = 0;
            int i22 = 0;
            while (true) {
                String[] strArr10 = this.f16601v;
                if (i21 >= strArr10.length) {
                    break;
                }
                String str5 = strArr10[i21];
                if (str5 != null) {
                    i22++;
                    iA7 += C1519b.a(str5);
                }
                i21++;
            }
            iA6 = iA6 + iA7 + (i22 * 2);
        }
        r rVar = this.f16602w;
        if (rVar != null) {
            iA6 += C1519b.a(21, rVar);
        }
        boolean z10 = this.f16603x;
        if (z10) {
            iA6 += C1519b.a(22, z10);
        }
        l[] lVarArr = this.f16604y;
        if (lVarArr != null && lVarArr.length > 0) {
            int i23 = 0;
            while (true) {
                l[] lVarArr2 = this.f16604y;
                if (i23 >= lVarArr2.length) {
                    break;
                }
                l lVar = lVarArr2[i23];
                if (lVar != null) {
                    iA6 += C1519b.a(23, lVar);
                }
                i23++;
            }
        }
        o oVar = this.f16605z;
        if (oVar != null) {
            iA6 += C1519b.a(24, oVar);
        }
        if (!this.A.equals("")) {
            iA6 += C1519b.a(25, this.A);
        }
        if (!this.B.equals("")) {
            iA6 += C1519b.a(26, this.B);
        }
        if (!this.D.equals("")) {
            iA6 += C1519b.a(27, this.D);
        }
        int iA8 = C1519b.a(29, this.G) + C1519b.a(28, this.F) + iA6;
        boolean z11 = this.H;
        if (z11) {
            iA8 += C1519b.a(30, z11);
        }
        if (!this.C.equals("")) {
            iA8 += C1519b.a(31, this.C);
        }
        m mVar = this.I;
        if (mVar != null) {
            iA8 += C1519b.a(32, mVar);
        }
        j jVar = this.J;
        if (jVar != null) {
            iA8 += C1519b.a(33, jVar);
        }
        int iA9 = C1519b.a(36, this.L) + C1519b.a(35, this.K) + iA8;
        v vVar = this.M;
        if (vVar != null) {
            iA9 += C1519b.a(37, vVar);
        }
        u uVar = this.N;
        if (uVar != null) {
            iA9 += C1519b.a(38, uVar);
        }
        u uVar2 = this.O;
        if (uVar2 != null) {
            iA9 += C1519b.a(39, uVar2);
        }
        s sVar = this.Q;
        if (sVar != null) {
            iA9 += C1519b.a(41, sVar);
        }
        c cVar = this.R;
        if (cVar != null) {
            iA9 += C1519b.a(42, cVar);
        }
        u uVar3 = this.P;
        if (uVar3 != null) {
            iA9 += C1519b.a(43, uVar3);
        }
        if (!this.f16598s.equals("")) {
            iA9 += C1519b.a(44, this.f16598s);
        }
        f fVar = this.S;
        if (fVar != null) {
            iA9 += C1519b.a(45, fVar);
        }
        String[] strArr11 = this.f16589j;
        if (strArr11 != null && strArr11.length > 0) {
            int i24 = 0;
            int iA10 = 0;
            int i25 = 0;
            while (true) {
                String[] strArr12 = this.f16589j;
                if (i24 >= strArr12.length) {
                    break;
                }
                String str6 = strArr12[i24];
                if (str6 != null) {
                    i25++;
                    iA10 += C1519b.a(str6);
                }
                i24++;
            }
            iA9 = iA9 + iA10 + (i25 * 2);
        }
        String[] strArr13 = this.T;
        if (strArr13 != null && strArr13.length > 0) {
            int i26 = 0;
            int iA11 = 0;
            int i27 = 0;
            while (true) {
                String[] strArr14 = this.T;
                if (i26 >= strArr14.length) {
                    break;
                }
                String str7 = strArr14[i26];
                if (str7 != null) {
                    i27++;
                    iA11 += C1519b.a(str7);
                }
                i26++;
            }
            iA9 = iA9 + iA11 + (i27 * 2);
        }
        b bVar = this.U;
        if (bVar != null) {
            iA9 += C1519b.a(48, bVar);
        }
        if (!this.E.equals("")) {
            iA9 += C1519b.a(49, this.E);
        }
        a aVar = this.V;
        if (aVar != null) {
            iA9 += C1519b.a(51, aVar);
        }
        h hVar = this.W;
        if (hVar != null) {
            iA9 += C1519b.a(52, hVar);
        }
        g gVar = this.X;
        if (gVar != null) {
            iA9 += C1519b.a(53, gVar);
        }
        d[] dVarArr = this.f16590k;
        if (dVarArr != null && dVarArr.length > 0) {
            while (true) {
                d[] dVarArr2 = this.f16590k;
                if (i10 >= dVarArr2.length) {
                    break;
                }
                d dVar = dVarArr2[i10];
                if (dVar != null) {
                    iA9 += C1519b.a(54, dVar);
                }
                i10++;
            }
        }
        q qVar = this.Y;
        return qVar != null ? iA9 + C1519b.a(55, qVar) : iA9;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
    public AbstractC1594e a(C1494a c1494a) throws IOException {
        AbstractC1594e abstractC1594e;
        while (true) {
            int iL = c1494a.l();
            switch (iL) {
                case 0:
                    break;
                case 10:
                    this.f16581b = c1494a.k();
                    continue;
                case 24:
                    this.f16582c = c1494a.i();
                    continue;
                case 34:
                    int iA = C1644g.a(c1494a, 34);
                    String[] strArr = this.f16583d;
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
                    this.f16583d = strArr2;
                    continue;
                case 42:
                    this.f16584e = c1494a.k();
                    continue;
                case 50:
                    this.f16585f = c1494a.k();
                    continue;
                case 58:
                    int iA2 = C1644g.a(c1494a, 58);
                    String[] strArr3 = this.f16586g;
                    int length2 = strArr3 == null ? 0 : strArr3.length;
                    int i11 = iA2 + length2;
                    String[] strArr4 = new String[i11];
                    if (length2 != 0) {
                        System.arraycopy(strArr3, 0, strArr4, 0, length2);
                    }
                    while (length2 < i11 - 1) {
                        strArr4[length2] = c1494a.k();
                        c1494a.l();
                        length2++;
                    }
                    strArr4[length2] = c1494a.k();
                    this.f16586g = strArr4;
                    continue;
                case 66:
                    int iA3 = C1644g.a(c1494a, 66);
                    String[] strArr5 = this.f16587h;
                    int length3 = strArr5 == null ? 0 : strArr5.length;
                    int i12 = iA3 + length3;
                    String[] strArr6 = new String[i12];
                    if (length3 != 0) {
                        System.arraycopy(strArr5, 0, strArr6, 0, length3);
                    }
                    while (length3 < i12 - 1) {
                        strArr6[length3] = c1494a.k();
                        c1494a.l();
                        length3++;
                    }
                    strArr6[length3] = c1494a.k();
                    this.f16587h = strArr6;
                    continue;
                case 74:
                    int iA4 = C1644g.a(c1494a, 74);
                    String[] strArr7 = this.f16588i;
                    int length4 = strArr7 == null ? 0 : strArr7.length;
                    int i13 = iA4 + length4;
                    String[] strArr8 = new String[i13];
                    if (length4 != 0) {
                        System.arraycopy(strArr7, 0, strArr8, 0, length4);
                    }
                    while (length4 < i13 - 1) {
                        strArr8[length4] = c1494a.k();
                        c1494a.l();
                        length4++;
                    }
                    strArr8[length4] = c1494a.k();
                    this.f16588i = strArr8;
                    continue;
                case 82:
                    if (this.f16591l == null) {
                        this.f16591l = new i();
                    }
                    abstractC1594e = this.f16591l;
                    break;
                case 90:
                    int iA5 = C1644g.a(c1494a, 90);
                    k[] kVarArr = this.f16592m;
                    int length5 = kVarArr == null ? 0 : kVarArr.length;
                    int i14 = iA5 + length5;
                    k[] kVarArr2 = new k[i14];
                    if (length5 != 0) {
                        System.arraycopy(kVarArr, 0, kVarArr2, 0, length5);
                    }
                    while (length5 < i14 - 1) {
                        kVarArr2[length5] = new k();
                        c1494a.a(kVarArr2[length5]);
                        c1494a.l();
                        length5++;
                    }
                    kVarArr2[length5] = new k();
                    c1494a.a(kVarArr2[length5]);
                    this.f16592m = kVarArr2;
                    continue;
                case 98:
                    if (this.f16593n == null) {
                        this.f16593n = new y();
                    }
                    abstractC1594e = this.f16593n;
                    break;
                case 106:
                    if (this.f16594o == null) {
                        this.f16594o = new p();
                    }
                    abstractC1594e = this.f16594o;
                    break;
                case 114:
                    int iA6 = C1644g.a(c1494a, 114);
                    n[] nVarArr = this.f16595p;
                    int length6 = nVarArr == null ? 0 : nVarArr.length;
                    int i15 = iA6 + length6;
                    n[] nVarArr2 = new n[i15];
                    if (length6 != 0) {
                        System.arraycopy(nVarArr, 0, nVarArr2, 0, length6);
                    }
                    while (length6 < i15 - 1) {
                        nVarArr2[length6] = new n();
                        c1494a.a(nVarArr2[length6]);
                        c1494a.l();
                        length6++;
                    }
                    nVarArr2[length6] = new n();
                    c1494a.a(nVarArr2[length6]);
                    this.f16595p = nVarArr2;
                    continue;
                case 122:
                    this.f16596q = c1494a.k();
                    continue;
                case 130:
                    this.f16597r = c1494a.k();
                    continue;
                case SyslogConstants.LOG_LOCAL1 /* 136 */:
                    this.f16599t = c1494a.c();
                    continue;
                case 154:
                    this.f16600u = c1494a.k();
                    continue;
                case 162:
                    int iA7 = C1644g.a(c1494a, 162);
                    String[] strArr9 = this.f16601v;
                    int length7 = strArr9 == null ? 0 : strArr9.length;
                    int i16 = iA7 + length7;
                    String[] strArr10 = new String[i16];
                    if (length7 != 0) {
                        System.arraycopy(strArr9, 0, strArr10, 0, length7);
                    }
                    while (length7 < i16 - 1) {
                        strArr10[length7] = c1494a.k();
                        c1494a.l();
                        length7++;
                    }
                    strArr10[length7] = c1494a.k();
                    this.f16601v = strArr10;
                    continue;
                case 170:
                    if (this.f16602w == null) {
                        this.f16602w = new r();
                    }
                    abstractC1594e = this.f16602w;
                    break;
                case SyslogConstants.LOG_LOCAL6 /* 176 */:
                    this.f16603x = c1494a.c();
                    continue;
                case 186:
                    int iA8 = C1644g.a(c1494a, 186);
                    l[] lVarArr = this.f16604y;
                    int length8 = lVarArr == null ? 0 : lVarArr.length;
                    int i17 = iA8 + length8;
                    l[] lVarArr2 = new l[i17];
                    if (length8 != 0) {
                        System.arraycopy(lVarArr, 0, lVarArr2, 0, length8);
                    }
                    while (length8 < i17 - 1) {
                        lVarArr2[length8] = new l();
                        c1494a.a(lVarArr2[length8]);
                        c1494a.l();
                        length8++;
                    }
                    lVarArr2[length8] = new l();
                    c1494a.a(lVarArr2[length8]);
                    this.f16604y = lVarArr2;
                    continue;
                case 194:
                    if (this.f16605z == null) {
                        this.f16605z = new o();
                    }
                    abstractC1594e = this.f16605z;
                    break;
                case 202:
                    this.A = c1494a.k();
                    continue;
                case 210:
                    this.B = c1494a.k();
                    continue;
                case 218:
                    this.D = c1494a.k();
                    continue;
                case 224:
                    this.F = c1494a.i();
                    continue;
                case 232:
                    this.G = c1494a.i();
                    continue;
                case 240:
                    this.H = c1494a.c();
                    continue;
                case BaseTransientBottomBar.ANIMATION_DURATION /* 250 */:
                    this.C = c1494a.k();
                    continue;
                case 258:
                    if (this.I == null) {
                        this.I = new m();
                    }
                    abstractC1594e = this.I;
                    break;
                case 266:
                    if (this.J == null) {
                        this.J = new j();
                    }
                    abstractC1594e = this.J;
                    break;
                case 280:
                    this.K = c1494a.h();
                    continue;
                case 288:
                    this.L = c1494a.h();
                    continue;
                case 298:
                    if (this.M == null) {
                        this.M = new v();
                    }
                    abstractC1594e = this.M;
                    break;
                case 306:
                    if (this.N == null) {
                        this.N = new u();
                    }
                    abstractC1594e = this.N;
                    break;
                case 314:
                    if (this.O == null) {
                        this.O = new u();
                    }
                    abstractC1594e = this.O;
                    break;
                case 330:
                    if (this.Q == null) {
                        this.Q = new s();
                    }
                    abstractC1594e = this.Q;
                    break;
                case 338:
                    if (this.R == null) {
                        this.R = new c();
                    }
                    abstractC1594e = this.R;
                    break;
                case 346:
                    if (this.P == null) {
                        this.P = new u();
                    }
                    abstractC1594e = this.P;
                    break;
                case 354:
                    this.f16598s = c1494a.k();
                    continue;
                case 362:
                    if (this.S == null) {
                        this.S = new f();
                    }
                    abstractC1594e = this.S;
                    break;
                case 370:
                    int iA9 = C1644g.a(c1494a, 370);
                    String[] strArr11 = this.f16589j;
                    int length9 = strArr11 == null ? 0 : strArr11.length;
                    int i18 = iA9 + length9;
                    String[] strArr12 = new String[i18];
                    if (length9 != 0) {
                        System.arraycopy(strArr11, 0, strArr12, 0, length9);
                    }
                    while (length9 < i18 - 1) {
                        strArr12[length9] = c1494a.k();
                        c1494a.l();
                        length9++;
                    }
                    strArr12[length9] = c1494a.k();
                    this.f16589j = strArr12;
                    continue;
                case 378:
                    int iA10 = C1644g.a(c1494a, 378);
                    String[] strArr13 = this.T;
                    int length10 = strArr13 == null ? 0 : strArr13.length;
                    int i19 = iA10 + length10;
                    String[] strArr14 = new String[i19];
                    if (length10 != 0) {
                        System.arraycopy(strArr13, 0, strArr14, 0, length10);
                    }
                    while (length10 < i19 - 1) {
                        strArr14[length10] = c1494a.k();
                        c1494a.l();
                        length10++;
                    }
                    strArr14[length10] = c1494a.k();
                    this.T = strArr14;
                    continue;
                case 386:
                    if (this.U == null) {
                        this.U = new b();
                    }
                    abstractC1594e = this.U;
                    break;
                case 394:
                    this.E = c1494a.k();
                    continue;
                case 410:
                    if (this.V == null) {
                        this.V = new a();
                    }
                    abstractC1594e = this.V;
                    break;
                case 418:
                    if (this.W == null) {
                        this.W = new h();
                    }
                    abstractC1594e = this.W;
                    break;
                case 426:
                    if (this.X == null) {
                        this.X = new g();
                    }
                    abstractC1594e = this.X;
                    break;
                case 434:
                    int iA11 = C1644g.a(c1494a, 434);
                    d[] dVarArr = this.f16590k;
                    int length11 = dVarArr == null ? 0 : dVarArr.length;
                    int i20 = iA11 + length11;
                    d[] dVarArr2 = new d[i20];
                    if (length11 != 0) {
                        System.arraycopy(dVarArr, 0, dVarArr2, 0, length11);
                    }
                    while (length11 < i20 - 1) {
                        dVarArr2[length11] = new d();
                        c1494a.a(dVarArr2[length11]);
                        c1494a.l();
                        length11++;
                    }
                    dVarArr2[length11] = new d();
                    c1494a.a(dVarArr2[length11]);
                    this.f16590k = dVarArr2;
                    continue;
                case 442:
                    if (this.Y == null) {
                        this.Y = new q();
                    }
                    abstractC1594e = this.Y;
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
        if (!this.f16581b.equals("")) {
            c1519b.b(1, this.f16581b);
        }
        c1519b.c(3, this.f16582c);
        String[] strArr = this.f16583d;
        int i10 = 0;
        if (strArr != null && strArr.length > 0) {
            int i11 = 0;
            while (true) {
                String[] strArr2 = this.f16583d;
                if (i11 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i11];
                if (str != null) {
                    c1519b.b(4, str);
                }
                i11++;
            }
        }
        if (!this.f16584e.equals("")) {
            c1519b.b(5, this.f16584e);
        }
        if (!this.f16585f.equals("")) {
            c1519b.b(6, this.f16585f);
        }
        String[] strArr3 = this.f16586g;
        if (strArr3 != null && strArr3.length > 0) {
            int i12 = 0;
            while (true) {
                String[] strArr4 = this.f16586g;
                if (i12 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i12];
                if (str2 != null) {
                    c1519b.b(7, str2);
                }
                i12++;
            }
        }
        String[] strArr5 = this.f16587h;
        if (strArr5 != null && strArr5.length > 0) {
            int i13 = 0;
            while (true) {
                String[] strArr6 = this.f16587h;
                if (i13 >= strArr6.length) {
                    break;
                }
                String str3 = strArr6[i13];
                if (str3 != null) {
                    c1519b.b(8, str3);
                }
                i13++;
            }
        }
        String[] strArr7 = this.f16588i;
        if (strArr7 != null && strArr7.length > 0) {
            int i14 = 0;
            while (true) {
                String[] strArr8 = this.f16588i;
                if (i14 >= strArr8.length) {
                    break;
                }
                String str4 = strArr8[i14];
                if (str4 != null) {
                    c1519b.b(9, str4);
                }
                i14++;
            }
        }
        i iVar = this.f16591l;
        if (iVar != null) {
            c1519b.b(10, iVar);
        }
        k[] kVarArr = this.f16592m;
        if (kVarArr != null && kVarArr.length > 0) {
            int i15 = 0;
            while (true) {
                k[] kVarArr2 = this.f16592m;
                if (i15 >= kVarArr2.length) {
                    break;
                }
                k kVar = kVarArr2[i15];
                if (kVar != null) {
                    c1519b.b(11, kVar);
                }
                i15++;
            }
        }
        y yVar = this.f16593n;
        if (yVar != null) {
            c1519b.b(12, yVar);
        }
        p pVar = this.f16594o;
        if (pVar != null) {
            c1519b.b(13, pVar);
        }
        n[] nVarArr = this.f16595p;
        if (nVarArr != null && nVarArr.length > 0) {
            int i16 = 0;
            while (true) {
                n[] nVarArr2 = this.f16595p;
                if (i16 >= nVarArr2.length) {
                    break;
                }
                n nVar = nVarArr2[i16];
                if (nVar != null) {
                    c1519b.b(14, nVar);
                }
                i16++;
            }
        }
        if (!this.f16596q.equals("")) {
            c1519b.b(15, this.f16596q);
        }
        if (!this.f16597r.equals("")) {
            c1519b.b(16, this.f16597r);
        }
        c1519b.b(17, this.f16599t);
        if (!this.f16600u.equals("")) {
            c1519b.b(19, this.f16600u);
        }
        String[] strArr9 = this.f16601v;
        if (strArr9 != null && strArr9.length > 0) {
            int i17 = 0;
            while (true) {
                String[] strArr10 = this.f16601v;
                if (i17 >= strArr10.length) {
                    break;
                }
                String str5 = strArr10[i17];
                if (str5 != null) {
                    c1519b.b(20, str5);
                }
                i17++;
            }
        }
        r rVar = this.f16602w;
        if (rVar != null) {
            c1519b.b(21, rVar);
        }
        boolean z10 = this.f16603x;
        if (z10) {
            c1519b.b(22, z10);
        }
        l[] lVarArr = this.f16604y;
        if (lVarArr != null && lVarArr.length > 0) {
            int i18 = 0;
            while (true) {
                l[] lVarArr2 = this.f16604y;
                if (i18 >= lVarArr2.length) {
                    break;
                }
                l lVar = lVarArr2[i18];
                if (lVar != null) {
                    c1519b.b(23, lVar);
                }
                i18++;
            }
        }
        o oVar = this.f16605z;
        if (oVar != null) {
            c1519b.b(24, oVar);
        }
        if (!this.A.equals("")) {
            c1519b.b(25, this.A);
        }
        if (!this.B.equals("")) {
            c1519b.b(26, this.B);
        }
        if (!this.D.equals("")) {
            c1519b.b(27, this.D);
        }
        c1519b.c(28, this.F);
        c1519b.c(29, this.G);
        boolean z11 = this.H;
        if (z11) {
            c1519b.b(30, z11);
        }
        if (!this.C.equals("")) {
            c1519b.b(31, this.C);
        }
        m mVar = this.I;
        if (mVar != null) {
            c1519b.b(32, mVar);
        }
        j jVar = this.J;
        if (jVar != null) {
            c1519b.b(33, jVar);
        }
        c1519b.d(35, this.K);
        c1519b.d(36, this.L);
        v vVar = this.M;
        if (vVar != null) {
            c1519b.b(37, vVar);
        }
        u uVar = this.N;
        if (uVar != null) {
            c1519b.b(38, uVar);
        }
        u uVar2 = this.O;
        if (uVar2 != null) {
            c1519b.b(39, uVar2);
        }
        s sVar = this.Q;
        if (sVar != null) {
            c1519b.b(41, sVar);
        }
        c cVar = this.R;
        if (cVar != null) {
            c1519b.b(42, cVar);
        }
        u uVar3 = this.P;
        if (uVar3 != null) {
            c1519b.b(43, uVar3);
        }
        if (!this.f16598s.equals("")) {
            c1519b.b(44, this.f16598s);
        }
        f fVar = this.S;
        if (fVar != null) {
            c1519b.b(45, fVar);
        }
        String[] strArr11 = this.f16589j;
        if (strArr11 != null && strArr11.length > 0) {
            int i19 = 0;
            while (true) {
                String[] strArr12 = this.f16589j;
                if (i19 >= strArr12.length) {
                    break;
                }
                String str6 = strArr12[i19];
                if (str6 != null) {
                    c1519b.b(46, str6);
                }
                i19++;
            }
        }
        String[] strArr13 = this.T;
        if (strArr13 != null && strArr13.length > 0) {
            int i20 = 0;
            while (true) {
                String[] strArr14 = this.T;
                if (i20 >= strArr14.length) {
                    break;
                }
                String str7 = strArr14[i20];
                if (str7 != null) {
                    c1519b.b(47, str7);
                }
                i20++;
            }
        }
        b bVar = this.U;
        if (bVar != null) {
            c1519b.b(48, bVar);
        }
        if (!this.E.equals("")) {
            c1519b.b(49, this.E);
        }
        a aVar = this.V;
        if (aVar != null) {
            c1519b.b(51, aVar);
        }
        h hVar = this.W;
        if (hVar != null) {
            c1519b.b(52, hVar);
        }
        g gVar = this.X;
        if (gVar != null) {
            c1519b.b(53, gVar);
        }
        d[] dVarArr = this.f16590k;
        if (dVarArr != null && dVarArr.length > 0) {
            while (true) {
                d[] dVarArr2 = this.f16590k;
                if (i10 >= dVarArr2.length) {
                    break;
                }
                d dVar = dVarArr2[i10];
                if (dVar != null) {
                    c1519b.b(54, dVar);
                }
                i10++;
            }
        }
        q qVar = this.Y;
        if (qVar != null) {
            c1519b.b(55, qVar);
        }
    }

    public C1760kg b() {
        this.f16581b = "";
        this.f16582c = 0L;
        String[] strArr = C1644g.f16155b;
        this.f16583d = strArr;
        this.f16584e = "";
        this.f16585f = "";
        this.f16586g = strArr;
        this.f16587h = strArr;
        this.f16588i = strArr;
        this.f16589j = strArr;
        this.f16590k = d.c();
        this.f16591l = null;
        this.f16592m = k.c();
        this.f16593n = null;
        this.f16594o = null;
        this.f16595p = n.c();
        this.f16596q = "";
        this.f16597r = "";
        this.f16598s = "";
        this.f16599t = false;
        this.f16600u = "";
        this.f16601v = strArr;
        this.f16602w = null;
        this.f16603x = false;
        this.f16604y = l.c();
        this.f16605z = null;
        this.A = "";
        this.B = "";
        this.C = "";
        this.D = "";
        this.E = "";
        this.F = 0L;
        this.G = 0L;
        this.H = false;
        this.I = null;
        this.J = null;
        this.K = 600;
        this.L = 1;
        this.M = null;
        this.N = null;
        this.O = null;
        this.P = null;
        this.Q = null;
        this.R = null;
        this.S = null;
        this.T = strArr;
        this.U = null;
        this.V = null;
        this.W = null;
        this.X = null;
        this.Y = null;
        this.f15981a = -1;
        return this;
    }
}
