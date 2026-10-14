package com.yandex.metrica.impl.ob;

import java.util.List;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.z5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2128z5 extends AbstractC1948s5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1733je f18001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Q9<C1509ae> f18002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final I f18003d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final D f18004e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final F f18005f;

    public C2128z5(C1624f4 c1624f4, C1733je c1733je) {
        this(c1624f4, c1733je, Ma.b.a(C1509ae.class).a(c1624f4.g()), new I(c1624f4.g()), new D(), new F(c1624f4.g()));
    }

    public C2128z5(C1624f4 c1624f4, C1733je c1733je, Q9<C1509ae> q10, I i10, D d10, F f10) {
        super(c1624f4);
        this.f18001b = c1733je;
        this.f18002c = q10;
        this.f18003d = i10;
        this.f18004e = d10;
        this.f18005f = f10;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1824n5
    public boolean a(C1744k0 c1744k0) {
        C1509ae c1509ae;
        C1624f4 c1624f4A = a();
        c1624f4A.e().toString();
        if (!c1624f4A.w().m() || !c1624f4A.z()) {
            return false;
        }
        C1509ae c1509ae2 = (C1509ae) this.f18002c.b();
        List<C1709ie> list = c1509ae2.f15746a;
        H h10 = c1509ae2.f15747b;
        H hA = this.f18003d.a();
        List<String> list2 = c1509ae2.f15748c;
        List<String> listA = this.f18005f.a();
        List<C1709ie> listA2 = this.f18001b.a(a().g(), list);
        if (listA2 == null && U2.a(h10, hA) && C1694i.a(list2, listA)) {
            c1509ae = null;
        } else {
            if (listA2 != null) {
                list = listA2;
            }
            c1509ae = new C1509ae(list, hA, listA);
        }
        if (c1509ae != null) {
            c1624f4A.r().e(C1744k0.a(c1744k0, c1509ae.f15746a, c1509ae.f15747b, this.f18004e, c1509ae.f15748c));
            this.f18002c.a(c1509ae);
            return false;
        }
        if (!c1624f4A.D()) {
            return false;
        }
        c1624f4A.r().e(C1744k0.a(c1744k0, c1509ae2.f15746a, c1509ae2.f15747b, this.f18004e, c1509ae2.f15748c));
        return false;
    }
}
