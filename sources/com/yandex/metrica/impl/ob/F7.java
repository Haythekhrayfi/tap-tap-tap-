package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class F7 implements InterfaceC1605ea<C1876p7, Lf> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final E7 f13967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1925r7 f13968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1975t7 f13969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final B7 f13970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C2105y7 f13971e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C2130z7 f13972f;

    public F7() {
        this(new E7(), new C1925r7(new D7()), new C1975t7(), new B7(), new C2105y7(), new C2130z7());
    }

    public F7(E7 e10, C1925r7 c1925r7, C1975t7 c1975t7, B7 b10, C2105y7 c2105y7, C2130z7 c2130z7) {
        this.f13968b = c1925r7;
        this.f13967a = e10;
        this.f13969c = c1975t7;
        this.f13970d = b10;
        this.f13971e = c2105y7;
        this.f13972f = c2130z7;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Lf b(C1876p7 c1876p7) {
        Lf lf = new Lf();
        C1826n7 c1826n7 = c1876p7.f17056a;
        if (c1826n7 != null) {
            lf.f14412b = this.f13967a.b(c1826n7);
        }
        C1602e7 c1602e7 = c1876p7.f17057b;
        if (c1602e7 != null) {
            lf.f14413c = this.f13968b.b(c1602e7);
        }
        List<C1776l7> list = c1876p7.f17058c;
        if (list != null) {
            lf.f14416f = this.f13970d.b(list);
        }
        String str = c1876p7.f17062g;
        if (str != null) {
            lf.f14414d = str;
        }
        lf.f14415e = this.f13969c.a(c1876p7.f17063h);
        if (!TextUtils.isEmpty(c1876p7.f17059d)) {
            lf.f14419i = this.f13971e.b(c1876p7.f17059d);
        }
        if (!TextUtils.isEmpty(c1876p7.f17060e)) {
            lf.f14420j = c1876p7.f17060e.getBytes();
        }
        if (!U2.b(c1876p7.f17061f)) {
            lf.f14421k = this.f13972f.a(c1876p7.f17061f);
        }
        return lf;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    public C1876p7 a(Lf lf) {
        throw new UnsupportedOperationException();
    }
}
