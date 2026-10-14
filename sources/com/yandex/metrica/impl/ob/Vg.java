package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
public class Vg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Lg f15315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Ug.a f15316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Jg f15317c;

    public Vg(Lg lg, Ug.a aVar, Jg jg) {
        this.f15315a = lg;
        this.f15316b = aVar;
        this.f15317c = jg;
    }

    public void a(Fg fg) {
        if (this.f15315a.a(fg)) {
            this.f15316b.a(fg);
            this.f15317c.a();
        }
    }
}
