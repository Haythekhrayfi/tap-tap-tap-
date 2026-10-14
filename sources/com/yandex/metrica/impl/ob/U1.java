package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.AbstractC1886ph;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class U1<T extends AbstractC1886ph> extends X1<T, C2018v0.a> {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final C1693hn f15129o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final C2045vm f15130p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Om f15131q;

    public U1(S1 s10, C1693hn c1693hn, C2045vm c2045vm, Om om, T t10) {
        super(s10, t10);
        this.f15129o = c1693hn;
        this.f15130p = c2045vm;
        this.f15131q = om;
        t10.a(c1693hn);
    }

    public U1(T t10) {
        this(new C1968t0(), new C1693hn(), new C2045vm(), new Nm(), t10);
    }

    public abstract void C();

    public abstract void D();

    @Override // com.yandex.metrica.impl.ob.T1
    public void a(byte[] bArr) {
        super.a(bArr);
    }

    public boolean c(byte[] bArr) throws Throwable {
        byte[] bArrA;
        try {
            Objects.requireNonNull(this.f15130p);
            byte[] bArrB = V0.b(bArr);
            if (bArrB == null || (bArrA = this.f15129o.a(bArrB)) == null) {
                return false;
            }
            super.a(bArrA);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public boolean p() {
        boolean zP = super.p();
        a(this.f15131q.a());
        return zP;
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public boolean r() {
        C2018v0.a aVarB = B();
        boolean z10 = aVarB != null && "accepted".equals(aVarB.f17589a);
        if (z10) {
            C();
        } else if (m()) {
            D();
        }
        return z10;
    }
}
