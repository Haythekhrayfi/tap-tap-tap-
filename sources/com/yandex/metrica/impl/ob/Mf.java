package com.yandex.metrica.impl.ob;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class Mf extends AbstractC1594e {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static byte[] f14504m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static volatile boolean f14505n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Qf f14506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public If f14507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f14508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14509e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Of[] f14510f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f14511g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f14512h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f14513i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte[] f14514j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public byte[] f14515k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Kf[] f14516l;

    public static final class a extends AbstractC1594e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f14517b;

        public a() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public int a() {
            return C1519b.a(1, this.f14517b) + 0;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public AbstractC1594e a(C1494a c1494a) throws IOException {
            while (true) {
                int iL = c1494a.l();
                if (iL == 0) {
                    break;
                }
                if (iL == 10) {
                    this.f14517b = c1494a.k();
                } else if (!c1494a.f(iL)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public void a(C1519b c1519b) throws IOException {
            c1519b.b(1, this.f14517b);
        }

        public a b() {
            this.f14517b = "";
            this.f15981a = -1;
            return this;
        }
    }

    public Mf() {
        if (!f14505n) {
            synchronized (C1544c.f15862a) {
                if (!f14505n) {
                    f14504m = C1544c.a("JVM");
                    f14505n = true;
                }
            }
        }
        b();
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
    public int a() {
        Qf qf = this.f14506b;
        int i10 = 0;
        int iA = qf != null ? C1519b.a(1, qf) + 0 : 0;
        If r10 = this.f14507c;
        if (r10 != null) {
            iA += C1519b.a(2, r10);
        }
        if (!this.f14508d.equals("")) {
            iA += C1519b.a(3, this.f14508d);
        }
        int i11 = this.f14509e;
        if (i11 != -1) {
            iA += C1519b.a(4, i11);
        }
        Of[] ofArr = this.f14510f;
        if (ofArr != null && ofArr.length > 0) {
            int i12 = 0;
            while (true) {
                Of[] ofArr2 = this.f14510f;
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
        if (!this.f14511g.equals("")) {
            iA += C1519b.a(6, this.f14511g);
        }
        int i13 = this.f14512h;
        if (i13 != 0) {
            iA += C1519b.a(7, i13);
        }
        a aVar = this.f14513i;
        if (aVar != null) {
            iA += C1519b.a(8, aVar);
        }
        if (!Arrays.equals(this.f14514j, f14504m)) {
            iA += C1519b.a(9, this.f14514j);
        }
        if (!Arrays.equals(this.f14515k, C1644g.f16157d)) {
            iA += C1519b.a(10, this.f14515k);
        }
        Kf[] kfArr = this.f14516l;
        if (kfArr != null && kfArr.length > 0) {
            while (true) {
                Kf[] kfArr2 = this.f14516l;
                if (i10 >= kfArr2.length) {
                    break;
                }
                Kf kf = kfArr2[i10];
                if (kf != null) {
                    iA += C1519b.a(11, kf);
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
                    if (this.f14506b == null) {
                        this.f14506b = new Qf();
                    }
                    abstractC1594e = this.f14506b;
                    break;
                case 18:
                    if (this.f14507c == null) {
                        this.f14507c = new If();
                    }
                    abstractC1594e = this.f14507c;
                    break;
                case 26:
                    this.f14508d = c1494a.k();
                    continue;
                case 32:
                    int iH = c1494a.h();
                    if (iH == -1 || iH == 0 || iH == 1) {
                        this.f14509e = iH;
                    } else {
                        continue;
                    }
                    break;
                case 42:
                    int iA = C1644g.a(c1494a, 42);
                    Of[] ofArr = this.f14510f;
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
                    this.f14510f = ofArr2;
                    continue;
                case 50:
                    this.f14511g = c1494a.k();
                    continue;
                case 56:
                    int iH2 = c1494a.h();
                    if (iH2 == 0 || iH2 == 1) {
                        this.f14512h = iH2;
                    } else {
                        continue;
                    }
                    break;
                case 66:
                    if (this.f14513i == null) {
                        this.f14513i = new a();
                    }
                    abstractC1594e = this.f14513i;
                    break;
                case 74:
                    this.f14514j = c1494a.d();
                    continue;
                case 82:
                    this.f14515k = c1494a.d();
                    continue;
                case 90:
                    int iA2 = C1644g.a(c1494a, 90);
                    Kf[] kfArr = this.f14516l;
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
                    this.f14516l = kfArr2;
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
        Qf qf = this.f14506b;
        if (qf != null) {
            c1519b.b(1, qf);
        }
        If r10 = this.f14507c;
        if (r10 != null) {
            c1519b.b(2, r10);
        }
        if (!this.f14508d.equals("")) {
            c1519b.b(3, this.f14508d);
        }
        int i10 = this.f14509e;
        if (i10 != -1) {
            c1519b.d(4, i10);
        }
        Of[] ofArr = this.f14510f;
        int i11 = 0;
        if (ofArr != null && ofArr.length > 0) {
            int i12 = 0;
            while (true) {
                Of[] ofArr2 = this.f14510f;
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
        if (!this.f14511g.equals("")) {
            c1519b.b(6, this.f14511g);
        }
        int i13 = this.f14512h;
        if (i13 != 0) {
            c1519b.d(7, i13);
        }
        a aVar = this.f14513i;
        if (aVar != null) {
            c1519b.b(8, aVar);
        }
        if (!Arrays.equals(this.f14514j, f14504m)) {
            c1519b.b(9, this.f14514j);
        }
        if (!Arrays.equals(this.f14515k, C1644g.f16157d)) {
            c1519b.b(10, this.f14515k);
        }
        Kf[] kfArr = this.f14516l;
        if (kfArr == null || kfArr.length <= 0) {
            return;
        }
        while (true) {
            Kf[] kfArr2 = this.f14516l;
            if (i11 >= kfArr2.length) {
                return;
            }
            Kf kf = kfArr2[i11];
            if (kf != null) {
                c1519b.b(11, kf);
            }
            i11++;
        }
    }

    public Mf b() {
        this.f14506b = null;
        this.f14507c = null;
        this.f14508d = "";
        this.f14509e = -1;
        this.f14510f = Of.c();
        this.f14511g = "";
        this.f14512h = 0;
        this.f14513i = null;
        this.f14514j = (byte[]) f14504m.clone();
        this.f14515k = C1644g.f16157d;
        this.f14516l = Kf.c();
        this.f15981a = -1;
        return this;
    }
}
