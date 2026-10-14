package com.yandex.metrica.impl.ob;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class Rf extends AbstractC1594e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q f14874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o f14875d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p f14876e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f14877f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public h f14878g;

    public static final class a extends AbstractC1594e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static volatile a[] f14879d;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[] f14880b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public e f14881c;

        public a() {
            b();
        }

        public static a[] c() {
            if (f14879d == null) {
                synchronized (C1544c.f15862a) {
                    if (f14879d == null) {
                        f14879d = new a[0];
                    }
                }
            }
            return f14879d;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public int a() {
            int iA = Arrays.equals(this.f14880b, C1644g.f16157d) ? 0 : 0 + C1519b.a(1, this.f14880b);
            e eVar = this.f14881c;
            return eVar != null ? iA + C1519b.a(2, eVar) : iA;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public AbstractC1594e a(C1494a c1494a) throws IOException {
            while (true) {
                int iL = c1494a.l();
                if (iL == 0) {
                    break;
                }
                if (iL == 10) {
                    this.f14880b = c1494a.d();
                } else if (iL == 18) {
                    if (this.f14881c == null) {
                        this.f14881c = new e();
                    }
                    c1494a.a(this.f14881c);
                } else if (!c1494a.f(iL)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public void a(C1519b c1519b) throws IOException {
            if (!Arrays.equals(this.f14880b, C1644g.f16157d)) {
                c1519b.b(1, this.f14880b);
            }
            e eVar = this.f14881c;
            if (eVar != null) {
                c1519b.b(2, eVar);
            }
        }

        public a b() {
            this.f14880b = C1644g.f16157d;
            this.f14881c = null;
            this.f15981a = -1;
            return this;
        }
    }

    public static final class b extends AbstractC1594e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c f14882b;

        public b() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public int a() {
            c cVar = this.f14882b;
            if (cVar != null) {
                return 0 + C1519b.a(1, cVar);
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
                if (iL == 10) {
                    if (this.f14882b == null) {
                        this.f14882b = new c();
                    }
                    c1494a.a(this.f14882b);
                } else if (!c1494a.f(iL)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public void a(C1519b c1519b) throws IOException {
            c cVar = this.f14882b;
            if (cVar != null) {
                c1519b.b(1, cVar);
            }
        }

        public b b() {
            this.f14882b = null;
            this.f15981a = -1;
            return this;
        }
    }

    public static final class c extends AbstractC1594e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public k f14883b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public m f14884c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public e f14885d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public j f14886e;

        public c() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public int a() {
            k kVar = this.f14883b;
            int iA = kVar != null ? 0 + C1519b.a(1, kVar) : 0;
            m mVar = this.f14884c;
            if (mVar != null) {
                iA += C1519b.a(2, mVar);
            }
            e eVar = this.f14885d;
            if (eVar != null) {
                iA += C1519b.a(3, eVar);
            }
            j jVar = this.f14886e;
            return jVar != null ? iA + C1519b.a(4, jVar) : iA;
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
                    if (this.f14883b == null) {
                        this.f14883b = new k();
                    }
                    abstractC1594e = this.f14883b;
                } else if (iL == 18) {
                    if (this.f14884c == null) {
                        this.f14884c = new m();
                    }
                    abstractC1594e = this.f14884c;
                } else if (iL == 26) {
                    if (this.f14885d == null) {
                        this.f14885d = new e();
                    }
                    abstractC1594e = this.f14885d;
                } else if (iL == 34) {
                    if (this.f14886e == null) {
                        this.f14886e = new j();
                    }
                    abstractC1594e = this.f14886e;
                } else if (!c1494a.f(iL)) {
                    break;
                }
                c1494a.a(abstractC1594e);
            }
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public void a(C1519b c1519b) throws IOException {
            k kVar = this.f14883b;
            if (kVar != null) {
                c1519b.b(1, kVar);
            }
            m mVar = this.f14884c;
            if (mVar != null) {
                c1519b.b(2, mVar);
            }
            e eVar = this.f14885d;
            if (eVar != null) {
                c1519b.b(3, eVar);
            }
            j jVar = this.f14886e;
            if (jVar != null) {
                c1519b.b(4, jVar);
            }
        }

        public c b() {
            this.f14883b = null;
            this.f14884c = null;
            this.f14885d = null;
            this.f14886e = null;
            this.f15981a = -1;
            return this;
        }
    }

    public static final class d extends AbstractC1594e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[][] f14887b;

        public d() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public int a() {
            byte[][] bArr = this.f14887b;
            if (bArr == null || bArr.length <= 0) {
                return 0;
            }
            int i10 = 0;
            int iB = 0;
            int i11 = 0;
            while (true) {
                byte[][] bArr2 = this.f14887b;
                if (i10 >= bArr2.length) {
                    return 0 + iB + (i11 * 1);
                }
                byte[] bArr3 = bArr2[i10];
                if (bArr3 != null) {
                    i11++;
                    iB += C1519b.b(bArr3.length) + bArr3.length;
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
                    byte[][] bArr = this.f14887b;
                    int length = bArr == null ? 0 : bArr.length;
                    int i10 = iA + length;
                    byte[][] bArr2 = new byte[i10][];
                    if (length != 0) {
                        System.arraycopy(bArr, 0, bArr2, 0, length);
                    }
                    while (length < i10 - 1) {
                        bArr2[length] = c1494a.d();
                        c1494a.l();
                        length++;
                    }
                    bArr2[length] = c1494a.d();
                    this.f14887b = bArr2;
                } else if (!c1494a.f(iL)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public void a(C1519b c1519b) throws IOException {
            byte[][] bArr = this.f14887b;
            if (bArr == null || bArr.length <= 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                byte[][] bArr2 = this.f14887b;
                if (i10 >= bArr2.length) {
                    return;
                }
                byte[] bArr3 = bArr2[i10];
                if (bArr3 != null) {
                    c1519b.b(1, bArr3);
                }
                i10++;
            }
        }

        public d b() {
            this.f14887b = C1644g.f16156c;
            this.f15981a = -1;
            return this;
        }
    }

    public static final class e extends AbstractC1594e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f14888b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f14889c;

        public e() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public int a() {
            long j10 = this.f14888b;
            int iA = j10 != 0 ? 0 + C1519b.a(1, j10) : 0;
            int i10 = this.f14889c;
            return i10 != 0 ? iA + C1519b.a(2, i10) : iA;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public AbstractC1594e a(C1494a c1494a) throws IOException {
            while (true) {
                int iL = c1494a.l();
                if (iL == 0) {
                    break;
                }
                if (iL == 8) {
                    this.f14888b = c1494a.i();
                } else if (iL == 16) {
                    this.f14889c = c1494a.h();
                } else if (!c1494a.f(iL)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public void a(C1519b c1519b) throws IOException {
            long j10 = this.f14888b;
            if (j10 != 0) {
                c1519b.c(1, j10);
            }
            int i10 = this.f14889c;
            if (i10 != 0) {
                c1519b.d(2, i10);
            }
        }

        public e b() {
            this.f14888b = 0L;
            this.f14889c = 0;
            this.f15981a = -1;
            return this;
        }
    }

    public static final class f extends AbstractC1594e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[] f14890b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public byte[] f14891c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public i f14892d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public g[] f14893e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f14894f;

        public f() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public int a() {
            byte[] bArr = this.f14890b;
            byte[] bArr2 = C1644g.f16157d;
            int i10 = 0;
            int iA = !Arrays.equals(bArr, bArr2) ? C1519b.a(1, this.f14890b) + 0 : 0;
            if (!Arrays.equals(this.f14891c, bArr2)) {
                iA += C1519b.a(2, this.f14891c);
            }
            i iVar = this.f14892d;
            if (iVar != null) {
                iA += C1519b.a(3, iVar);
            }
            g[] gVarArr = this.f14893e;
            if (gVarArr != null && gVarArr.length > 0) {
                while (true) {
                    g[] gVarArr2 = this.f14893e;
                    if (i10 >= gVarArr2.length) {
                        break;
                    }
                    g gVar = gVarArr2[i10];
                    if (gVar != null) {
                        iA += C1519b.a(4, gVar);
                    }
                    i10++;
                }
            }
            int i11 = this.f14894f;
            return i11 != 0 ? iA + C1519b.c(5, i11) : iA;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public AbstractC1594e a(C1494a c1494a) throws IOException {
            while (true) {
                int iL = c1494a.l();
                if (iL == 0) {
                    break;
                }
                if (iL == 10) {
                    this.f14890b = c1494a.d();
                } else if (iL == 18) {
                    this.f14891c = c1494a.d();
                } else if (iL == 26) {
                    if (this.f14892d == null) {
                        this.f14892d = new i();
                    }
                    c1494a.a(this.f14892d);
                } else if (iL == 34) {
                    int iA = C1644g.a(c1494a, 34);
                    g[] gVarArr = this.f14893e;
                    int length = gVarArr == null ? 0 : gVarArr.length;
                    int i10 = iA + length;
                    g[] gVarArr2 = new g[i10];
                    if (length != 0) {
                        System.arraycopy(gVarArr, 0, gVarArr2, 0, length);
                    }
                    while (length < i10 - 1) {
                        gVarArr2[length] = new g();
                        c1494a.a(gVarArr2[length]);
                        c1494a.l();
                        length++;
                    }
                    gVarArr2[length] = new g();
                    c1494a.a(gVarArr2[length]);
                    this.f14893e = gVarArr2;
                } else if (iL == 40) {
                    this.f14894f = c1494a.h();
                } else if (!c1494a.f(iL)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public void a(C1519b c1519b) throws IOException {
            byte[] bArr = this.f14890b;
            byte[] bArr2 = C1644g.f16157d;
            if (!Arrays.equals(bArr, bArr2)) {
                c1519b.b(1, this.f14890b);
            }
            if (!Arrays.equals(this.f14891c, bArr2)) {
                c1519b.b(2, this.f14891c);
            }
            i iVar = this.f14892d;
            if (iVar != null) {
                c1519b.b(3, iVar);
            }
            g[] gVarArr = this.f14893e;
            if (gVarArr != null && gVarArr.length > 0) {
                int i10 = 0;
                while (true) {
                    g[] gVarArr2 = this.f14893e;
                    if (i10 >= gVarArr2.length) {
                        break;
                    }
                    g gVar = gVarArr2[i10];
                    if (gVar != null) {
                        c1519b.b(4, gVar);
                    }
                    i10++;
                }
            }
            int i11 = this.f14894f;
            if (i11 != 0) {
                c1519b.f(5, i11);
            }
        }

        public f b() {
            byte[] bArr = C1644g.f16157d;
            this.f14890b = bArr;
            this.f14891c = bArr;
            this.f14892d = null;
            this.f14893e = g.c();
            this.f14894f = 0;
            this.f15981a = -1;
            return this;
        }
    }

    public static final class g extends AbstractC1594e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static volatile g[] f14895d;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f14896b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c f14897c;

        public g() {
            b();
        }

        public static g[] c() {
            if (f14895d == null) {
                synchronized (C1544c.f15862a) {
                    if (f14895d == null) {
                        f14895d = new g[0];
                    }
                }
            }
            return f14895d;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public int a() {
            int i10 = this.f14896b;
            int iC = i10 != 0 ? 0 + C1519b.c(1, i10) : 0;
            c cVar = this.f14897c;
            return cVar != null ? iC + C1519b.a(2, cVar) : iC;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public AbstractC1594e a(C1494a c1494a) throws IOException {
            while (true) {
                int iL = c1494a.l();
                if (iL == 0) {
                    break;
                }
                if (iL == 8) {
                    this.f14896b = c1494a.h();
                } else if (iL == 18) {
                    if (this.f14897c == null) {
                        this.f14897c = new c();
                    }
                    c1494a.a(this.f14897c);
                } else if (!c1494a.f(iL)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public void a(C1519b c1519b) throws IOException {
            int i10 = this.f14896b;
            if (i10 != 0) {
                c1519b.f(1, i10);
            }
            c cVar = this.f14897c;
            if (cVar != null) {
                c1519b.b(2, cVar);
            }
        }

        public g b() {
            this.f14896b = 0;
            this.f14897c = null;
            this.f15981a = -1;
            return this;
        }
    }

    public static final class h extends AbstractC1594e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public f f14898b;

        public h() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public int a() {
            f fVar = this.f14898b;
            if (fVar != null) {
                return 0 + C1519b.a(1, fVar);
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
                if (iL == 10) {
                    if (this.f14898b == null) {
                        this.f14898b = new f();
                    }
                    c1494a.a(this.f14898b);
                } else if (!c1494a.f(iL)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public void a(C1519b c1519b) throws IOException {
            f fVar = this.f14898b;
            if (fVar != null) {
                c1519b.b(1, fVar);
            }
        }

        public h b() {
            this.f14898b = null;
            this.f15981a = -1;
            return this;
        }
    }

    public static final class i extends AbstractC1594e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public a[] f14899b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f14900c;

        public static final class a extends AbstractC1594e {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static volatile a[] f14901d;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public byte[] f14902b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public byte[] f14903c;

            public a() {
                b();
            }

            public static a[] c() {
                if (f14901d == null) {
                    synchronized (C1544c.f15862a) {
                        if (f14901d == null) {
                            f14901d = new a[0];
                        }
                    }
                }
                return f14901d;
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC1594e
            public int a() {
                byte[] bArr = this.f14902b;
                byte[] bArr2 = C1644g.f16157d;
                int iA = Arrays.equals(bArr, bArr2) ? 0 : 0 + C1519b.a(1, this.f14902b);
                return !Arrays.equals(this.f14903c, bArr2) ? iA + C1519b.a(2, this.f14903c) : iA;
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC1594e
            public AbstractC1594e a(C1494a c1494a) throws IOException {
                while (true) {
                    int iL = c1494a.l();
                    if (iL == 0) {
                        break;
                    }
                    if (iL == 10) {
                        this.f14902b = c1494a.d();
                    } else if (iL == 18) {
                        this.f14903c = c1494a.d();
                    } else if (!c1494a.f(iL)) {
                        break;
                    }
                }
                return this;
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC1594e
            public void a(C1519b c1519b) throws IOException {
                byte[] bArr = this.f14902b;
                byte[] bArr2 = C1644g.f16157d;
                if (!Arrays.equals(bArr, bArr2)) {
                    c1519b.b(1, this.f14902b);
                }
                if (Arrays.equals(this.f14903c, bArr2)) {
                    return;
                }
                c1519b.b(2, this.f14903c);
            }

            public a b() {
                byte[] bArr = C1644g.f16157d;
                this.f14902b = bArr;
                this.f14903c = bArr;
                this.f15981a = -1;
                return this;
            }
        }

        public i() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public int a() {
            a[] aVarArr = this.f14899b;
            int i10 = 0;
            if (aVarArr != null && aVarArr.length > 0) {
                int iA = 0;
                while (true) {
                    a[] aVarArr2 = this.f14899b;
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
            int i11 = this.f14900c;
            return i11 != 0 ? i10 + C1519b.c(2, i11) : i10;
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
                    a[] aVarArr = this.f14899b;
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
                    this.f14899b = aVarArr2;
                } else if (iL == 16) {
                    this.f14900c = c1494a.h();
                } else if (!c1494a.f(iL)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public void a(C1519b c1519b) throws IOException {
            a[] aVarArr = this.f14899b;
            if (aVarArr != null && aVarArr.length > 0) {
                int i10 = 0;
                while (true) {
                    a[] aVarArr2 = this.f14899b;
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
            int i11 = this.f14900c;
            if (i11 != 0) {
                c1519b.f(2, i11);
            }
        }

        public i b() {
            this.f14899b = a.c();
            this.f14900c = 0;
            this.f15981a = -1;
            return this;
        }
    }

    public static final class j extends AbstractC1594e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public a f14904b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public a[] f14905c;

        public j() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public int a() {
            a aVar = this.f14904b;
            int i10 = 0;
            int iA = aVar != null ? C1519b.a(1, aVar) + 0 : 0;
            a[] aVarArr = this.f14905c;
            if (aVarArr != null && aVarArr.length > 0) {
                while (true) {
                    a[] aVarArr2 = this.f14905c;
                    if (i10 >= aVarArr2.length) {
                        break;
                    }
                    a aVar2 = aVarArr2[i10];
                    if (aVar2 != null) {
                        iA += C1519b.a(2, aVar2);
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
                    if (this.f14904b == null) {
                        this.f14904b = new a();
                    }
                    c1494a.a(this.f14904b);
                } else if (iL == 18) {
                    int iA = C1644g.a(c1494a, 18);
                    a[] aVarArr = this.f14905c;
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
                    this.f14905c = aVarArr2;
                } else if (!c1494a.f(iL)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public void a(C1519b c1519b) throws IOException {
            a aVar = this.f14904b;
            if (aVar != null) {
                c1519b.b(1, aVar);
            }
            a[] aVarArr = this.f14905c;
            if (aVarArr == null || aVarArr.length <= 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                a[] aVarArr2 = this.f14905c;
                if (i10 >= aVarArr2.length) {
                    return;
                }
                a aVar2 = aVarArr2[i10];
                if (aVar2 != null) {
                    c1519b.b(2, aVar2);
                }
                i10++;
            }
        }

        public j b() {
            this.f14904b = null;
            this.f14905c = a.c();
            this.f15981a = -1;
            return this;
        }
    }

    public static final class k extends AbstractC1594e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[] f14906b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public byte[] f14907c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public d f14908d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public i f14909e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public j f14910f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public j f14911g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public l[] f14912h;

        public k() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public int a() {
            byte[] bArr = this.f14906b;
            byte[] bArr2 = C1644g.f16157d;
            int i10 = 0;
            int iA = !Arrays.equals(bArr, bArr2) ? C1519b.a(1, this.f14906b) + 0 : 0;
            if (!Arrays.equals(this.f14907c, bArr2)) {
                iA += C1519b.a(2, this.f14907c);
            }
            d dVar = this.f14908d;
            if (dVar != null) {
                iA += C1519b.a(3, dVar);
            }
            i iVar = this.f14909e;
            if (iVar != null) {
                iA += C1519b.a(4, iVar);
            }
            j jVar = this.f14910f;
            if (jVar != null) {
                iA += C1519b.a(5, jVar);
            }
            j jVar2 = this.f14911g;
            if (jVar2 != null) {
                iA += C1519b.a(6, jVar2);
            }
            l[] lVarArr = this.f14912h;
            if (lVarArr != null && lVarArr.length > 0) {
                while (true) {
                    l[] lVarArr2 = this.f14912h;
                    if (i10 >= lVarArr2.length) {
                        break;
                    }
                    l lVar = lVarArr2[i10];
                    if (lVar != null) {
                        iA += C1519b.a(7, lVar);
                    }
                    i10++;
                }
            }
            return iA;
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
                    this.f14906b = c1494a.d();
                } else if (iL != 18) {
                    if (iL == 26) {
                        if (this.f14908d == null) {
                            this.f14908d = new d();
                        }
                        abstractC1594e = this.f14908d;
                    } else if (iL == 34) {
                        if (this.f14909e == null) {
                            this.f14909e = new i();
                        }
                        abstractC1594e = this.f14909e;
                    } else if (iL == 42) {
                        if (this.f14910f == null) {
                            this.f14910f = new j();
                        }
                        abstractC1594e = this.f14910f;
                    } else if (iL == 50) {
                        if (this.f14911g == null) {
                            this.f14911g = new j();
                        }
                        abstractC1594e = this.f14911g;
                    } else if (iL == 58) {
                        int iA = C1644g.a(c1494a, 58);
                        l[] lVarArr = this.f14912h;
                        int length = lVarArr == null ? 0 : lVarArr.length;
                        int i10 = iA + length;
                        l[] lVarArr2 = new l[i10];
                        if (length != 0) {
                            System.arraycopy(lVarArr, 0, lVarArr2, 0, length);
                        }
                        while (length < i10 - 1) {
                            lVarArr2[length] = new l();
                            c1494a.a(lVarArr2[length]);
                            c1494a.l();
                            length++;
                        }
                        lVarArr2[length] = new l();
                        c1494a.a(lVarArr2[length]);
                        this.f14912h = lVarArr2;
                    } else if (!c1494a.f(iL)) {
                        break;
                    }
                    c1494a.a(abstractC1594e);
                } else {
                    this.f14907c = c1494a.d();
                }
            }
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public void a(C1519b c1519b) throws IOException {
            byte[] bArr = this.f14906b;
            byte[] bArr2 = C1644g.f16157d;
            if (!Arrays.equals(bArr, bArr2)) {
                c1519b.b(1, this.f14906b);
            }
            if (!Arrays.equals(this.f14907c, bArr2)) {
                c1519b.b(2, this.f14907c);
            }
            d dVar = this.f14908d;
            if (dVar != null) {
                c1519b.b(3, dVar);
            }
            i iVar = this.f14909e;
            if (iVar != null) {
                c1519b.b(4, iVar);
            }
            j jVar = this.f14910f;
            if (jVar != null) {
                c1519b.b(5, jVar);
            }
            j jVar2 = this.f14911g;
            if (jVar2 != null) {
                c1519b.b(6, jVar2);
            }
            l[] lVarArr = this.f14912h;
            if (lVarArr == null || lVarArr.length <= 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                l[] lVarArr2 = this.f14912h;
                if (i10 >= lVarArr2.length) {
                    return;
                }
                l lVar = lVarArr2[i10];
                if (lVar != null) {
                    c1519b.b(7, lVar);
                }
                i10++;
            }
        }

        public k b() {
            byte[] bArr = C1644g.f16157d;
            this.f14906b = bArr;
            this.f14907c = bArr;
            this.f14908d = null;
            this.f14909e = null;
            this.f14910f = null;
            this.f14911g = null;
            this.f14912h = l.c();
            this.f15981a = -1;
            return this;
        }
    }

    public static final class l extends AbstractC1594e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static volatile l[] f14913c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[] f14914b;

        public l() {
            b();
        }

        public static l[] c() {
            if (f14913c == null) {
                synchronized (C1544c.f15862a) {
                    if (f14913c == null) {
                        f14913c = new l[0];
                    }
                }
            }
            return f14913c;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public int a() {
            if (Arrays.equals(this.f14914b, C1644g.f16157d)) {
                return 0;
            }
            return 0 + C1519b.a(1, this.f14914b);
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public AbstractC1594e a(C1494a c1494a) throws IOException {
            while (true) {
                int iL = c1494a.l();
                if (iL == 0) {
                    break;
                }
                if (iL == 10) {
                    this.f14914b = c1494a.d();
                } else if (!c1494a.f(iL)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public void a(C1519b c1519b) throws IOException {
            if (Arrays.equals(this.f14914b, C1644g.f16157d)) {
                return;
            }
            c1519b.b(1, this.f14914b);
        }

        public l b() {
            this.f14914b = C1644g.f16157d;
            this.f15981a = -1;
            return this;
        }
    }

    public static final class m extends AbstractC1594e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[] f14915b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public byte[] f14916c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public n f14917d;

        public m() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public int a() {
            byte[] bArr = this.f14915b;
            byte[] bArr2 = C1644g.f16157d;
            int iA = Arrays.equals(bArr, bArr2) ? 0 : 0 + C1519b.a(1, this.f14915b);
            if (!Arrays.equals(this.f14916c, bArr2)) {
                iA += C1519b.a(2, this.f14916c);
            }
            n nVar = this.f14917d;
            return nVar != null ? iA + C1519b.a(3, nVar) : iA;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public AbstractC1594e a(C1494a c1494a) throws IOException {
            while (true) {
                int iL = c1494a.l();
                if (iL == 0) {
                    break;
                }
                if (iL == 10) {
                    this.f14915b = c1494a.d();
                } else if (iL == 18) {
                    this.f14916c = c1494a.d();
                } else if (iL == 26) {
                    if (this.f14917d == null) {
                        this.f14917d = new n();
                    }
                    c1494a.a(this.f14917d);
                } else if (!c1494a.f(iL)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public void a(C1519b c1519b) throws IOException {
            byte[] bArr = this.f14915b;
            byte[] bArr2 = C1644g.f16157d;
            if (!Arrays.equals(bArr, bArr2)) {
                c1519b.b(1, this.f14915b);
            }
            if (!Arrays.equals(this.f14916c, bArr2)) {
                c1519b.b(2, this.f14916c);
            }
            n nVar = this.f14917d;
            if (nVar != null) {
                c1519b.b(3, nVar);
            }
        }

        public m b() {
            byte[] bArr = C1644g.f16157d;
            this.f14915b = bArr;
            this.f14916c = bArr;
            this.f14917d = null;
            this.f15981a = -1;
            return this;
        }
    }

    public static final class n extends AbstractC1594e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[] f14918b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public d f14919c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte[] f14920d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public i f14921e;

        public n() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public int a() {
            byte[] bArr = this.f14918b;
            byte[] bArr2 = C1644g.f16157d;
            int iA = Arrays.equals(bArr, bArr2) ? 0 : 0 + C1519b.a(1, this.f14918b);
            d dVar = this.f14919c;
            if (dVar != null) {
                iA += C1519b.a(2, dVar);
            }
            if (!Arrays.equals(this.f14920d, bArr2)) {
                iA += C1519b.a(3, this.f14920d);
            }
            i iVar = this.f14921e;
            return iVar != null ? iA + C1519b.a(4, iVar) : iA;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public AbstractC1594e a(C1494a c1494a) throws IOException {
            AbstractC1594e abstractC1594e;
            while (true) {
                int iL = c1494a.l();
                if (iL == 0) {
                    break;
                }
                if (iL != 10) {
                    if (iL == 18) {
                        if (this.f14919c == null) {
                            this.f14919c = new d();
                        }
                        abstractC1594e = this.f14919c;
                    } else if (iL == 26) {
                        this.f14920d = c1494a.d();
                    } else if (iL == 34) {
                        if (this.f14921e == null) {
                            this.f14921e = new i();
                        }
                        abstractC1594e = this.f14921e;
                    } else if (!c1494a.f(iL)) {
                        break;
                    }
                    c1494a.a(abstractC1594e);
                } else {
                    this.f14918b = c1494a.d();
                }
            }
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public void a(C1519b c1519b) throws IOException {
            byte[] bArr = this.f14918b;
            byte[] bArr2 = C1644g.f16157d;
            if (!Arrays.equals(bArr, bArr2)) {
                c1519b.b(1, this.f14918b);
            }
            d dVar = this.f14919c;
            if (dVar != null) {
                c1519b.b(2, dVar);
            }
            if (!Arrays.equals(this.f14920d, bArr2)) {
                c1519b.b(3, this.f14920d);
            }
            i iVar = this.f14921e;
            if (iVar != null) {
                c1519b.b(4, iVar);
            }
        }

        public n b() {
            byte[] bArr = C1644g.f16157d;
            this.f14918b = bArr;
            this.f14919c = null;
            this.f14920d = bArr;
            this.f14921e = null;
            this.f15981a = -1;
            return this;
        }
    }

    public static final class o extends AbstractC1594e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public k f14922b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public n f14923c;

        public o() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public int a() {
            k kVar = this.f14922b;
            int iA = kVar != null ? 0 + C1519b.a(1, kVar) : 0;
            n nVar = this.f14923c;
            return nVar != null ? iA + C1519b.a(2, nVar) : iA;
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
                    if (this.f14922b == null) {
                        this.f14922b = new k();
                    }
                    abstractC1594e = this.f14922b;
                } else if (iL == 18) {
                    if (this.f14923c == null) {
                        this.f14923c = new n();
                    }
                    abstractC1594e = this.f14923c;
                } else if (!c1494a.f(iL)) {
                    break;
                }
                c1494a.a(abstractC1594e);
            }
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public void a(C1519b c1519b) throws IOException {
            k kVar = this.f14922b;
            if (kVar != null) {
                c1519b.b(1, kVar);
            }
            n nVar = this.f14923c;
            if (nVar != null) {
                c1519b.b(2, nVar);
            }
        }

        public o b() {
            this.f14922b = null;
            this.f14923c = null;
            this.f15981a = -1;
            return this;
        }
    }

    public static final class p extends AbstractC1594e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public k f14924b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public m f14925c;

        public p() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public int a() {
            k kVar = this.f14924b;
            int iA = kVar != null ? 0 + C1519b.a(1, kVar) : 0;
            m mVar = this.f14925c;
            return mVar != null ? iA + C1519b.a(2, mVar) : iA;
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
                    if (this.f14924b == null) {
                        this.f14924b = new k();
                    }
                    abstractC1594e = this.f14924b;
                } else if (iL == 18) {
                    if (this.f14925c == null) {
                        this.f14925c = new m();
                    }
                    abstractC1594e = this.f14925c;
                } else if (!c1494a.f(iL)) {
                    break;
                }
                c1494a.a(abstractC1594e);
            }
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public void a(C1519b c1519b) throws IOException {
            k kVar = this.f14924b;
            if (kVar != null) {
                c1519b.b(1, kVar);
            }
            m mVar = this.f14925c;
            if (mVar != null) {
                c1519b.b(2, mVar);
            }
        }

        public p b() {
            this.f14924b = null;
            this.f14925c = null;
            this.f15981a = -1;
            return this;
        }
    }

    public static final class q extends AbstractC1594e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public n f14926b;

        public q() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public int a() {
            n nVar = this.f14926b;
            if (nVar != null) {
                return 0 + C1519b.a(1, nVar);
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
                if (iL == 10) {
                    if (this.f14926b == null) {
                        this.f14926b = new n();
                    }
                    c1494a.a(this.f14926b);
                } else if (!c1494a.f(iL)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public void a(C1519b c1519b) throws IOException {
            n nVar = this.f14926b;
            if (nVar != null) {
                c1519b.b(1, nVar);
            }
        }

        public q b() {
            this.f14926b = null;
            this.f15981a = -1;
            return this;
        }
    }

    public Rf() {
        b();
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
    public int a() {
        int i10 = this.f14873b;
        int iA = i10 != 0 ? 0 + C1519b.a(1, i10) : 0;
        q qVar = this.f14874c;
        if (qVar != null) {
            iA += C1519b.a(2, qVar);
        }
        o oVar = this.f14875d;
        if (oVar != null) {
            iA += C1519b.a(3, oVar);
        }
        p pVar = this.f14876e;
        if (pVar != null) {
            iA += C1519b.a(4, pVar);
        }
        b bVar = this.f14877f;
        if (bVar != null) {
            iA += C1519b.a(5, bVar);
        }
        h hVar = this.f14878g;
        return hVar != null ? iA + C1519b.a(6, hVar) : iA;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
    public AbstractC1594e a(C1494a c1494a) throws IOException {
        AbstractC1594e abstractC1594e;
        while (true) {
            int iL = c1494a.l();
            if (iL != 0) {
                if (iL == 8) {
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
                            this.f14873b = iH;
                            break;
                    }
                } else {
                    if (iL == 18) {
                        if (this.f14874c == null) {
                            this.f14874c = new q();
                        }
                        abstractC1594e = this.f14874c;
                    } else if (iL == 26) {
                        if (this.f14875d == null) {
                            this.f14875d = new o();
                        }
                        abstractC1594e = this.f14875d;
                    } else if (iL == 34) {
                        if (this.f14876e == null) {
                            this.f14876e = new p();
                        }
                        abstractC1594e = this.f14876e;
                    } else if (iL == 42) {
                        if (this.f14877f == null) {
                            this.f14877f = new b();
                        }
                        abstractC1594e = this.f14877f;
                    } else if (iL == 50) {
                        if (this.f14878g == null) {
                            this.f14878g = new h();
                        }
                        abstractC1594e = this.f14878g;
                    } else if (!c1494a.f(iL)) {
                    }
                    c1494a.a(abstractC1594e);
                }
            }
        }
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
    public void a(C1519b c1519b) throws IOException {
        int i10 = this.f14873b;
        if (i10 != 0) {
            c1519b.d(1, i10);
        }
        q qVar = this.f14874c;
        if (qVar != null) {
            c1519b.b(2, qVar);
        }
        o oVar = this.f14875d;
        if (oVar != null) {
            c1519b.b(3, oVar);
        }
        p pVar = this.f14876e;
        if (pVar != null) {
            c1519b.b(4, pVar);
        }
        b bVar = this.f14877f;
        if (bVar != null) {
            c1519b.b(5, bVar);
        }
        h hVar = this.f14878g;
        if (hVar != null) {
            c1519b.b(6, hVar);
        }
    }

    public Rf b() {
        this.f14873b = 0;
        this.f14874c = null;
        this.f14875d = null;
        this.f14876e = null;
        this.f14877f = null;
        this.f14878g = null;
        this.f15981a = -1;
        return this;
    }
}
