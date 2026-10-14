package com.yandex.metrica.impl.ob;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class Lf extends AbstractC1594e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static byte[] f14410l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static volatile boolean f14411m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Qf f14412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public If f14413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f14414d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14415e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Of[] f14416f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f14417g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a f14418h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte[] f14419i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte[] f14420j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Kf[] f14421k;

    public static final class a extends AbstractC1594e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[] f14422b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Nf f14423c;

        public a() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public int a() {
            int iA = Arrays.equals(this.f14422b, C1644g.f16157d) ? 0 : 0 + C1519b.a(1, this.f14422b);
            Nf nf = this.f14423c;
            return nf != null ? iA + C1519b.a(2, nf) : iA;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public AbstractC1594e a(C1494a c1494a) throws IOException {
            while (true) {
                int iL = c1494a.l();
                if (iL == 0) {
                    break;
                }
                if (iL == 10) {
                    this.f14422b = c1494a.d();
                } else if (iL == 18) {
                    if (this.f14423c == null) {
                        this.f14423c = new Nf();
                    }
                    c1494a.a(this.f14423c);
                } else if (!c1494a.f(iL)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public void a(C1519b c1519b) throws IOException {
            if (!Arrays.equals(this.f14422b, C1644g.f16157d)) {
                c1519b.b(1, this.f14422b);
            }
            Nf nf = this.f14423c;
            if (nf != null) {
                c1519b.b(2, nf);
            }
        }

        public a b() {
            this.f14422b = C1644g.f16157d;
            this.f14423c = null;
            this.f15981a = -1;
            return this;
        }
    }

    public Lf() {
        if (!f14411m) {
            synchronized (C1544c.f15862a) {
                if (!f14411m) {
                    f14410l = C1544c.a("JVM");
                    f14411m = true;
                }
            }
        }
        b();
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
    public int a() {
        Qf qf = this.f14412b;
        int i10 = 0;
        int iA = qf != null ? C1519b.a(1, qf) + 0 : 0;
        If r10 = this.f14413c;
        if (r10 != null) {
            iA += C1519b.a(2, r10);
        }
        if (!this.f14414d.equals("")) {
            iA += C1519b.a(3, this.f14414d);
        }
        int i11 = this.f14415e;
        if (i11 != -1) {
            iA += C1519b.a(4, i11);
        }
        Of[] ofArr = this.f14416f;
        if (ofArr != null && ofArr.length > 0) {
            int i12 = 0;
            while (true) {
                Of[] ofArr2 = this.f14416f;
                if (i12 >= ofArr2.length) {
                    break;
                }
                Of of = ofArr2[i12];
                if (of != null) {
                    iA += C1519b.a(5, of);
                }
                i12++;
            }
        }
        int i13 = this.f14417g;
        if (i13 != 0) {
            iA += C1519b.a(6, i13);
        }
        a aVar = this.f14418h;
        if (aVar != null) {
            iA += C1519b.a(7, aVar);
        }
        if (!Arrays.equals(this.f14419i, f14410l)) {
            iA += C1519b.a(8, this.f14419i);
        }
        if (!Arrays.equals(this.f14420j, C1644g.f16157d)) {
            iA += C1519b.a(9, this.f14420j);
        }
        Kf[] kfArr = this.f14421k;
        if (kfArr != null && kfArr.length > 0) {
            while (true) {
                Kf[] kfArr2 = this.f14421k;
                if (i10 >= kfArr2.length) {
                    break;
                }
                Kf kf = kfArr2[i10];
                if (kf != null) {
                    iA += C1519b.a(10, kf);
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
            switch (iL) {
                case 0:
                    break;
                case 10:
                    if (this.f14412b == null) {
                        this.f14412b = new Qf();
                    }
                    abstractC1594e = this.f14412b;
                    break;
                case 18:
                    if (this.f14413c == null) {
                        this.f14413c = new If();
                    }
                    abstractC1594e = this.f14413c;
                    break;
                case 26:
                    this.f14414d = c1494a.k();
                    continue;
                case 32:
                    int iH = c1494a.h();
                    if (iH == -1 || iH == 0 || iH == 1) {
                        this.f14415e = iH;
                    } else {
                        continue;
                    }
                    break;
                case 42:
                    int iA = C1644g.a(c1494a, 42);
                    Of[] ofArr = this.f14416f;
                    int length = ofArr == null ? 0 : ofArr.length;
                    int i10 = iA + length;
                    Of[] ofArr2 = new Of[i10];
                    if (length != 0) {
                        System.arraycopy(ofArr, 0, ofArr2, 0, length);
                    }
                    while (length < i10 - 1) {
                        ofArr2[length] = new Of();
                        c1494a.a(ofArr2[length]);
                        c1494a.l();
                        length++;
                    }
                    ofArr2[length] = new Of();
                    c1494a.a(ofArr2[length]);
                    this.f14416f = ofArr2;
                    continue;
                case 48:
                    int iH2 = c1494a.h();
                    if (iH2 == 0 || iH2 == 1) {
                        this.f14417g = iH2;
                    } else {
                        continue;
                    }
                    break;
                case 58:
                    if (this.f14418h == null) {
                        this.f14418h = new a();
                    }
                    abstractC1594e = this.f14418h;
                    break;
                case 66:
                    this.f14419i = c1494a.d();
                    continue;
                case 74:
                    this.f14420j = c1494a.d();
                    continue;
                case 82:
                    int iA2 = C1644g.a(c1494a, 82);
                    Kf[] kfArr = this.f14421k;
                    int length2 = kfArr == null ? 0 : kfArr.length;
                    int i11 = iA2 + length2;
                    Kf[] kfArr2 = new Kf[i11];
                    if (length2 != 0) {
                        System.arraycopy(kfArr, 0, kfArr2, 0, length2);
                    }
                    while (length2 < i11 - 1) {
                        kfArr2[length2] = new Kf();
                        c1494a.a(kfArr2[length2]);
                        c1494a.l();
                        length2++;
                    }
                    kfArr2[length2] = new Kf();
                    c1494a.a(kfArr2[length2]);
                    this.f14421k = kfArr2;
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
        Qf qf = this.f14412b;
        if (qf != null) {
            c1519b.b(1, qf);
        }
        If r10 = this.f14413c;
        if (r10 != null) {
            c1519b.b(2, r10);
        }
        if (!this.f14414d.equals("")) {
            c1519b.b(3, this.f14414d);
        }
        int i10 = this.f14415e;
        if (i10 != -1) {
            c1519b.d(4, i10);
        }
        Of[] ofArr = this.f14416f;
        int i11 = 0;
        if (ofArr != null && ofArr.length > 0) {
            int i12 = 0;
            while (true) {
                Of[] ofArr2 = this.f14416f;
                if (i12 >= ofArr2.length) {
                    break;
                }
                Of of = ofArr2[i12];
                if (of != null) {
                    c1519b.b(5, of);
                }
                i12++;
            }
        }
        int i13 = this.f14417g;
        if (i13 != 0) {
            c1519b.d(6, i13);
        }
        a aVar = this.f14418h;
        if (aVar != null) {
            c1519b.b(7, aVar);
        }
        if (!Arrays.equals(this.f14419i, f14410l)) {
            c1519b.b(8, this.f14419i);
        }
        if (!Arrays.equals(this.f14420j, C1644g.f16157d)) {
            c1519b.b(9, this.f14420j);
        }
        Kf[] kfArr = this.f14421k;
        if (kfArr == null || kfArr.length <= 0) {
            return;
        }
        while (true) {
            Kf[] kfArr2 = this.f14421k;
            if (i11 >= kfArr2.length) {
                return;
            }
            Kf kf = kfArr2[i11];
            if (kf != null) {
                c1519b.b(10, kf);
            }
            i11++;
        }
    }

    public Lf b() {
        this.f14412b = null;
        this.f14413c = null;
        this.f14414d = "";
        this.f14415e = -1;
        this.f14416f = Of.c();
        this.f14417g = 0;
        this.f14418h = null;
        this.f14419i = (byte[]) f14410l.clone();
        this.f14420j = C1644g.f16157d;
        this.f14421k = Kf.c();
        this.f15981a = -1;
        return this;
    }
}
