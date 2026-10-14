package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class Ld extends U1<C1861oh> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Pd f14397r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final M2 f14398s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Uc f14399t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final H8 f14400u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Nd f14401v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final InterfaceC1832nd f14402w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f14403x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Md f14404y;

    public Ld(Context context, Pd pd2, M2 m10, InterfaceC1832nd interfaceC1832nd, H8 h10, C1861oh c1861oh, Nd nd2) {
        super(c1861oh);
        this.f14397r = pd2;
        this.f14398s = m10;
        this.f14402w = interfaceC1832nd;
        this.f14399t = pd2.A();
        this.f14400u = h10;
        this.f14401v = nd2;
        F();
        a(this.f14397r.B());
    }

    private boolean E() {
        Md mdA = this.f14401v.a(this.f14399t.f15140d);
        this.f14404y = mdA;
        Uf uf = mdA.f14502c;
        if (uf.f15155c.length == 0 && uf.f15154b.length == 0) {
            return false;
        }
        return c(AbstractC1594e.a(uf));
    }

    private void F() {
        long jF = this.f14400u.f() + 1;
        this.f14403x = jF;
        ((C1861oh) this.f15044j).a(jF);
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public boolean A() {
        return super.A() & (!m());
    }

    @Override // com.yandex.metrica.impl.ob.U1
    public void C() {
        this.f14401v.a(this.f14404y);
    }

    @Override // com.yandex.metrica.impl.ob.U1
    public void D() {
        this.f14401v.a(this.f14404y);
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public void a(Uri.Builder builder) {
        ((C1861oh) this.f15044j).a(builder, this.f14397r);
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public T1.a b() {
        return T1.a.LOCATION;
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public void b(Throwable th) {
        this.f14400u.a(this.f14403x);
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public Ci j() {
        return this.f14397r.r();
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public boolean o() {
        if (this.f14398s.d() || TextUtils.isEmpty(this.f14397r.g()) || TextUtils.isEmpty(this.f14397r.x()) || U2.b(c())) {
            return false;
        }
        return E();
    }

    @Override // com.yandex.metrica.impl.ob.U1, com.yandex.metrica.impl.ob.T1
    public boolean r() {
        boolean zR = super.r();
        this.f14400u.a(this.f14403x);
        return zR;
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public void t() {
        this.f14402w.a();
    }
}
