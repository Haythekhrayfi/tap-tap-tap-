package com.yandex.metrica.impl.ob;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class Nf extends AbstractC1594e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f14546c;

    public Nf() {
        b();
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
    public int a() {
        int i10 = this.f14545b;
        int iA = i10 != 0 ? 0 + C1519b.a(1, i10) : 0;
        return !this.f14546c.equals("") ? iA + C1519b.a(2, this.f14546c) : iA;
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
                    this.f14545b = iH;
                }
            } else if (iL == 18) {
                this.f14546c = c1494a.k();
            } else if (!c1494a.f(iL)) {
                break;
            }
        }
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
    public void a(C1519b c1519b) throws IOException {
        int i10 = this.f14545b;
        if (i10 != 0) {
            c1519b.d(1, i10);
        }
        if (this.f14546c.equals("")) {
            return;
        }
        c1519b.b(2, this.f14546c);
    }

    public Nf b() {
        this.f14545b = 0;
        this.f14546c = "";
        this.f15981a = -1;
        return this;
    }
}
