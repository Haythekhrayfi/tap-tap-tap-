package com.yandex.metrica.impl.ob;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class K2 extends X1<C1935rh, C2042vj> {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Si f14335o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private C2042vj f14336p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Hi f14337q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final C1761kh f14338r;

    public K2(Si si, C1761kh c1761kh) {
        this(si, c1761kh, new C1935rh(new C1711ih()), new J2());
    }

    public K2(Si si, C1761kh c1761kh, C1935rh c1935rh, J2 j10) {
        super(j10, c1935rh);
        this.f14335o = si;
        this.f14338r = c1761kh;
        a(c1761kh.J());
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public String a() {
        StringBuilder sbA = defpackage.a.a("Startup task for component: ");
        sbA.append(this.f14335o.a().toString());
        return sbA.toString();
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public void a(Uri.Builder builder) {
        ((C1935rh) this.f15044j).a(builder, this.f14338r);
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public T1.a b() {
        return T1.a.STARTUP;
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public void b(Throwable th) {
        this.f14337q = Hi.NETWORK;
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public Ci j() {
        return this.f14338r.r();
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public boolean o() {
        a("Accept-Encoding", "encrypted");
        return this.f14335o.d();
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public boolean r() {
        C2042vj c2042vjB = B();
        this.f14336p = c2042vjB;
        boolean z10 = c2042vjB != null;
        if (!z10) {
            this.f14337q = Hi.PARSE;
        }
        return z10;
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public void s() {
        super.s();
        this.f14337q = Hi.NETWORK;
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public void t() {
        Map<String, List<String>> map;
        C2042vj c2042vj = this.f14336p;
        if (c2042vj == null || (map = this.f15041g) == null) {
            return;
        }
        this.f14335o.a(c2042vj, this.f14338r, map);
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public void y() {
        if (this.f14337q == null) {
            this.f14337q = Hi.UNKNOWN;
        }
        this.f14335o.a(this.f14337q);
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public boolean z() {
        return true;
    }
}
