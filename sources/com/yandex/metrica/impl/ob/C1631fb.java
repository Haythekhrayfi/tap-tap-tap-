package com.yandex.metrica.impl.ob;

import android.content.Context;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.fb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1631fb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Q9<P3> f16127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Q9<Be> f16128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Za<Be> f16129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Za<P3> f16130d;

    public C1631fb(Context context) {
        this(context, Ma.b.a(P3.class).a(context), Ma.b.a(Be.class).a(context), new C1506ab());
    }

    public C1631fb(Context context, Q9<P3> q10, Q9<Be> q11, C1506ab c1506ab) {
        this.f16127a = q10;
        this.f16128b = q11;
        this.f16129c = c1506ab.c(context, Lm.c());
        this.f16130d = c1506ab.b(context, Lm.c());
    }

    public void a(Qi qi) {
        this.f16129c.a((Be) this.f16128b.b(), qi.m());
        this.f16130d.a((P3) this.f16127a.b(), qi.m());
    }
}
