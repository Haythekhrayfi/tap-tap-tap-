package com.yandex.metrica.impl.ob;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public abstract class A4 implements E4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1922r4 f13625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Dd f13626b;

    public A4(Context context, C1922r4 c1922r4) {
        this(context, c1922r4, new Dd(C1583dd.a(context), C1523b3.a(context), P0.i().u()));
    }

    public A4(Context context, C1922r4 c1922r4, Dd dd2) {
        context.getApplicationContext();
        this.f13625a = c1922r4;
        this.f13626b = dd2;
        c1922r4.a(this);
        dd2.a(this);
    }

    @Override // com.yandex.metrica.impl.ob.E4
    public void a() {
        this.f13625a.b(this);
        this.f13626b.b(this);
    }

    @Override // com.yandex.metrica.impl.ob.E4
    public void a(C1744k0 c1744k0, X3 x10) {
        b(c1744k0, x10);
    }

    public C1922r4 b() {
        return this.f13625a;
    }

    public abstract void b(C1744k0 c1744k0, X3 x10);

    public Dd c() {
        return this.f13626b;
    }
}
