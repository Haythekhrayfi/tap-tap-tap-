package com.yandex.metrica.impl.ob;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class Qf extends AbstractC1594e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static volatile Qf[] f14780g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f14781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f14782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Of[] f14783d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Qf f14784e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Qf[] f14785f;

    public Qf() {
        b();
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
    public int a() {
        int i10 = 0;
        int iA = C1519b.a(1, this.f14781b) + 0;
        if (!this.f14782c.equals("")) {
            iA += C1519b.a(2, this.f14782c);
        }
        Of[] ofArr = this.f14783d;
        if (ofArr != null && ofArr.length > 0) {
            int i11 = 0;
            while (true) {
                Of[] ofArr2 = this.f14783d;
                if (i11 >= ofArr2.length) {
                    break;
                }
                Of of = ofArr2[i11];
                if (of != null) {
                    iA += C1519b.a(3, of);
                }
                i11++;
            }
        }
        Qf qf = this.f14784e;
        if (qf != null) {
            iA += C1519b.a(4, qf);
        }
        Qf[] qfArr = this.f14785f;
        if (qfArr != null && qfArr.length > 0) {
            while (true) {
                Qf[] qfArr2 = this.f14785f;
                if (i10 >= qfArr2.length) {
                    break;
                }
                Qf qf2 = qfArr2[i10];
                if (qf2 != null) {
                    iA += C1519b.a(5, qf2);
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
                this.f14781b = c1494a.k();
            } else if (iL == 18) {
                this.f14782c = c1494a.k();
            } else if (iL == 26) {
                int iA = C1644g.a(c1494a, 26);
                Of[] ofArr = this.f14783d;
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
                this.f14783d = ofArr2;
            } else if (iL == 34) {
                if (this.f14784e == null) {
                    this.f14784e = new Qf();
                }
                c1494a.a(this.f14784e);
            } else if (iL == 42) {
                int iA2 = C1644g.a(c1494a, 42);
                Qf[] qfArr = this.f14785f;
                int length2 = qfArr == null ? 0 : qfArr.length;
                int i11 = iA2 + length2;
                Qf[] qfArr2 = new Qf[i11];
                if (length2 != 0) {
                    System.arraycopy(qfArr, 0, qfArr2, 0, length2);
                }
                while (length2 < i11 - 1) {
                    qfArr2[length2] = new Qf();
                    c1494a.a(qfArr2[length2]);
                    c1494a.l();
                    length2++;
                }
                qfArr2[length2] = new Qf();
                c1494a.a(qfArr2[length2]);
                this.f14785f = qfArr2;
            } else if (!c1494a.f(iL)) {
                break;
            }
        }
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
    public void a(C1519b c1519b) throws IOException {
        c1519b.b(1, this.f14781b);
        if (!this.f14782c.equals("")) {
            c1519b.b(2, this.f14782c);
        }
        Of[] ofArr = this.f14783d;
        int i10 = 0;
        if (ofArr != null && ofArr.length > 0) {
            int i11 = 0;
            while (true) {
                Of[] ofArr2 = this.f14783d;
                if (i11 >= ofArr2.length) {
                    break;
                }
                Of of = ofArr2[i11];
                if (of != null) {
                    c1519b.b(3, of);
                }
                i11++;
            }
        }
        Qf qf = this.f14784e;
        if (qf != null) {
            c1519b.b(4, qf);
        }
        Qf[] qfArr = this.f14785f;
        if (qfArr == null || qfArr.length <= 0) {
            return;
        }
        while (true) {
            Qf[] qfArr2 = this.f14785f;
            if (i10 >= qfArr2.length) {
                return;
            }
            Qf qf2 = qfArr2[i10];
            if (qf2 != null) {
                c1519b.b(5, qf2);
            }
            i10++;
        }
    }

    public Qf b() {
        this.f14781b = "";
        this.f14782c = "";
        this.f14783d = Of.c();
        this.f14784e = null;
        if (f14780g == null) {
            synchronized (C1544c.f15862a) {
                if (f14780g == null) {
                    f14780g = new Qf[0];
                }
            }
        }
        this.f14785f = f14780g;
        this.f15981a = -1;
        return this;
    }
}
