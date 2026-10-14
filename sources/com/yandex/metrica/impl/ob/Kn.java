package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
public class Kn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Nn f14375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Nn f14376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Gn f14377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Im f14378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f14379e;

    public Kn(int i10, int i11, int i12, String str, Im im) {
        this(new Gn(i10), new Nn(i11, i.f.a(str, "map key"), im), new Nn(i12, i.f.a(str, "map value"), im), str, im);
    }

    public Kn(Gn gn, Nn nn, Nn nn2, String str, Im im) {
        this.f14377c = gn;
        this.f14375a = nn;
        this.f14376b = nn2;
        this.f14379e = str;
        this.f14378d = im;
    }

    public Gn a() {
        return this.f14377c;
    }

    public void a(String str) {
        if (this.f14378d.c()) {
            this.f14378d.c("The %s has reached the limit of %d items. Item with key %s will be ignored", this.f14379e, Integer.valueOf(this.f14377c.a()), str);
        }
    }

    public Nn b() {
        return this.f14375a;
    }

    public Nn c() {
        return this.f14376b;
    }
}
