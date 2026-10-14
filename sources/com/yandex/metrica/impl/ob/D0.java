package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
public abstract class D0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Fm<E0, Integer> f13782a;

    public D0() {
        Fm<E0, Integer> fm = new Fm<>(0);
        fm.a(E0.UNDEFINED, 0);
        fm.a(E0.APP, 1);
        fm.a(E0.SATELLITE, 2);
        fm.a(E0.RETAIL, 3);
        this.f13782a = fm;
    }

    public final Fm<E0, Integer> a() {
        return this.f13782a;
    }

    public abstract boolean a(T t10, T t11);
}
