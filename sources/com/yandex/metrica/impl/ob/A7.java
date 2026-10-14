package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class A7 implements InterfaceC1605ea<C1726j7, Mf> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final E7 f13627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1925r7 f13628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1975t7 f13629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final B7 f13630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C2105y7 f13631e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C2130z7 f13632f;

    public A7() {
        this(new E7(), new C1925r7(new D7()), new C1975t7(), new B7(), new C2105y7(), new C2130z7());
    }

    public A7(E7 e10, C1925r7 c1925r7, C1975t7 c1975t7, B7 b10, C2105y7 c2105y7, C2130z7 c2130z7) {
        this.f13627a = e10;
        this.f13628b = c1925r7;
        this.f13629c = c1975t7;
        this.f13630d = b10;
        this.f13631e = c2105y7;
        this.f13632f = c2130z7;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Mf b(C1726j7 c1726j7) {
        Mf mf = new Mf();
        String str = c1726j7.f16397a;
        String str2 = mf.f14511g;
        if (str == null) {
            str = str2;
        }
        mf.f14511g = str;
        C1876p7 c1876p7 = c1726j7.f16398b;
        if (c1876p7 != null) {
            C1826n7 c1826n7 = c1876p7.f17056a;
            if (c1826n7 != null) {
                mf.f14506b = this.f13627a.b(c1826n7);
            }
            C1602e7 c1602e7 = c1876p7.f17057b;
            if (c1602e7 != null) {
                mf.f14507c = this.f13628b.b(c1602e7);
            }
            List<C1776l7> list = c1876p7.f17058c;
            if (list != null) {
                mf.f14510f = this.f13630d.b(list);
            }
            String str3 = c1876p7.f17062g;
            String str4 = mf.f14508d;
            if (str3 == null) {
                str3 = str4;
            }
            mf.f14508d = str3;
            mf.f14509e = this.f13629c.a(c1876p7.f17063h);
            if (!TextUtils.isEmpty(c1876p7.f17059d)) {
                mf.f14514j = this.f13631e.b(c1876p7.f17059d);
            }
            if (!TextUtils.isEmpty(c1876p7.f17060e)) {
                mf.f14515k = c1876p7.f17060e.getBytes();
            }
            if (!U2.b(c1876p7.f17061f)) {
                mf.f14516l = this.f13632f.a(c1876p7.f17061f);
            }
        }
        return mf;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    public C1726j7 a(Mf mf) {
        throw new UnsupportedOperationException();
    }
}
