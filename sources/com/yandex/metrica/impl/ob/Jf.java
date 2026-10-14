package com.yandex.metrica.impl.ob;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class Jf extends AbstractC1594e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public If f14319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f14320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14321d;

    public Jf() {
        b();
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
    public int a() {
        If r10 = this.f14319b;
        int iA = r10 != null ? 0 + C1519b.a(1, r10) : 0;
        if (!this.f14320c.equals("")) {
            iA += C1519b.a(2, this.f14320c);
        }
        int i10 = this.f14321d;
        return i10 != -1 ? iA + C1519b.a(3, i10) : iA;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
    public AbstractC1594e a(C1494a c1494a) throws IOException {
        while (true) {
            int iL = c1494a.l();
            if (iL == 0) {
                break;
            }
            if (iL == 10) {
                if (this.f14319b == null) {
                    this.f14319b = new If();
                }
                c1494a.a(this.f14319b);
            } else if (iL == 18) {
                this.f14320c = c1494a.k();
            } else if (iL == 24) {
                int iH = c1494a.h();
                if (iH == -1 || iH == 0 || iH == 1) {
                    this.f14321d = iH;
                }
            } else if (!c1494a.f(iL)) {
                break;
            }
        }
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
    public void a(C1519b c1519b) throws IOException {
        If r10 = this.f14319b;
        if (r10 != null) {
            c1519b.b(1, r10);
        }
        if (!this.f14320c.equals("")) {
            c1519b.b(2, this.f14320c);
        }
        int i10 = this.f14321d;
        if (i10 != -1) {
            c1519b.d(3, i10);
        }
    }

    public Jf b() {
        this.f14319b = null;
        this.f14320c = "";
        this.f14321d = -1;
        this.f15981a = -1;
        return this;
    }
}
