package com.yandex.metrica.impl.ob;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class If extends AbstractC1594e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Pf f14214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Pf[] f14215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f14216d;

    public If() {
        b();
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
    public int a() {
        Pf pf = this.f14214b;
        int i10 = 0;
        int iA = pf != null ? C1519b.a(1, pf) + 0 : 0;
        Pf[] pfArr = this.f14215c;
        if (pfArr != null && pfArr.length > 0) {
            while (true) {
                Pf[] pfArr2 = this.f14215c;
                if (i10 >= pfArr2.length) {
                    break;
                }
                Pf pf2 = pfArr2[i10];
                if (pf2 != null) {
                    iA += C1519b.a(2, pf2);
                }
                i10++;
            }
        }
        return !this.f14216d.equals("") ? iA + C1519b.a(3, this.f14216d) : iA;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
    public AbstractC1594e a(C1494a c1494a) throws IOException {
        while (true) {
            int iL = c1494a.l();
            if (iL == 0) {
                break;
            }
            if (iL == 10) {
                if (this.f14214b == null) {
                    this.f14214b = new Pf();
                }
                c1494a.a(this.f14214b);
            } else if (iL == 18) {
                int iA = C1644g.a(c1494a, 18);
                Pf[] pfArr = this.f14215c;
                int length = pfArr == null ? 0 : pfArr.length;
                int i10 = iA + length;
                Pf[] pfArr2 = new Pf[i10];
                if (length != 0) {
                    System.arraycopy(pfArr, 0, pfArr2, 0, length);
                }
                while (length < i10 - 1) {
                    pfArr2[length] = new Pf();
                    c1494a.a(pfArr2[length]);
                    c1494a.l();
                    length++;
                }
                pfArr2[length] = new Pf();
                c1494a.a(pfArr2[length]);
                this.f14215c = pfArr2;
            } else if (iL == 26) {
                this.f14216d = c1494a.k();
            } else if (!c1494a.f(iL)) {
                break;
            }
        }
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
    public void a(C1519b c1519b) throws IOException {
        Pf pf = this.f14214b;
        if (pf != null) {
            c1519b.b(1, pf);
        }
        Pf[] pfArr = this.f14215c;
        if (pfArr != null && pfArr.length > 0) {
            int i10 = 0;
            while (true) {
                Pf[] pfArr2 = this.f14215c;
                if (i10 >= pfArr2.length) {
                    break;
                }
                Pf pf2 = pfArr2[i10];
                if (pf2 != null) {
                    c1519b.b(2, pf2);
                }
                i10++;
            }
        }
        if (this.f14216d.equals("")) {
            return;
        }
        c1519b.b(3, this.f14216d);
    }

    public If b() {
        this.f14214b = null;
        this.f14215c = Pf.c();
        this.f14216d = "";
        this.f15981a = -1;
        return this;
    }
}
