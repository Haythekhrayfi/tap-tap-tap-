package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
abstract class Cn<T> implements Pn<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f13779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f13780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Im f13781c;

    public Cn(int i10, String str, Im im) {
        this.f13779a = i10;
        this.f13780b = str;
        this.f13781c = im;
    }

    public String a() {
        return this.f13780b;
    }

    public int b() {
        return this.f13779a;
    }
}
