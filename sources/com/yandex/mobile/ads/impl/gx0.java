package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class gx0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f21226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eg.a f21227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bi1 f21228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f21229d;

    public interface a {
        void a(bi1 bi1Var);
    }

    public interface b<T> {
        void a(T t10);
    }

    private gx0(bi1 bi1Var) {
        this.f21229d = false;
        this.f21226a = null;
        this.f21227b = null;
        this.f21228c = bi1Var;
    }

    private gx0(T t10, eg.a aVar) {
        this.f21229d = false;
        this.f21226a = t10;
        this.f21227b = aVar;
        this.f21228c = null;
    }

    public static <T> gx0<T> a(bi1 bi1Var) {
        return new gx0<>(bi1Var);
    }

    public static <T> gx0<T> a(T t10, eg.a aVar) {
        return new gx0<>(t10, aVar);
    }
}
