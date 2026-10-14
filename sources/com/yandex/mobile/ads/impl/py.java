package com.yandex.mobile.ads.impl;

import okhttp3.internal.http2.Header;

/* JADX INFO: loaded from: classes3.dex */
public final class py {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final qd.g f24271d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final qd.g f24272e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final qd.g f24273f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final qd.g f24274g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final qd.g f24275h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final qd.g f24276i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qd.g f24277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qd.g f24278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24279c;

    static {
        qd.g.a aVar = qd.g.f34892f;
        f24271d = aVar.d(":");
        f24272e = aVar.d(Header.RESPONSE_STATUS_UTF8);
        f24273f = aVar.d(Header.TARGET_METHOD_UTF8);
        f24274g = aVar.d(Header.TARGET_PATH_UTF8);
        f24275h = aVar.d(Header.TARGET_SCHEME_UTF8);
        f24276i = aVar.d(Header.TARGET_AUTHORITY_UTF8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public py(String str, String str2) {
        fd.j0.i(str, "name");
        fd.j0.i(str2, "value");
        qd.g.a aVar = qd.g.f34892f;
        this(aVar.d(str), aVar.d(str2));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public py(qd.g gVar, String str) {
        this(gVar, qd.g.f34892f.d(str));
        fd.j0.i(gVar, "name");
        fd.j0.i(str, "value");
    }

    public py(qd.g gVar, qd.g gVar2) {
        fd.j0.i(gVar, "name");
        fd.j0.i(gVar2, "value");
        this.f24277a = gVar;
        this.f24278b = gVar2;
        this.f24279c = gVar2.c() + gVar.c() + 32;
    }

    public final qd.g a() {
        return this.f24277a;
    }

    public final qd.g b() {
        return this.f24278b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof py)) {
            return false;
        }
        py pyVar = (py) obj;
        return fd.j0.d(this.f24277a, pyVar.f24277a) && fd.j0.d(this.f24278b, pyVar.f24278b);
    }

    public final int hashCode() {
        return this.f24278b.hashCode() + (this.f24277a.hashCode() * 31);
    }

    public final String toString() {
        return this.f24277a.l() + ": " + this.f24278b.l();
    }
}
