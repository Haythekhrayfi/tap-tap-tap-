package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class qa<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f24373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f24374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f24375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final m80 f24376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f24377e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f24378f;

    public qa(String str, String str2, T t10, m80 m80Var, boolean z10, boolean z11) {
        this.f24374b = str;
        this.f24375c = str2;
        this.f24373a = t10;
        this.f24376d = m80Var;
        this.f24378f = z10;
        this.f24377e = z11;
    }

    public final m80 a() {
        return this.f24376d;
    }

    public final String b() {
        return this.f24374b;
    }

    public final String c() {
        return this.f24375c;
    }

    public final T d() {
        return this.f24373a;
    }

    public final boolean e() {
        return this.f24378f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qa.class != obj.getClass()) {
            return false;
        }
        qa qaVar = (qa) obj;
        if (this.f24377e != qaVar.f24377e || this.f24378f != qaVar.f24378f || !this.f24373a.equals(qaVar.f24373a) || !this.f24374b.equals(qaVar.f24374b) || !this.f24375c.equals(qaVar.f24375c)) {
            return false;
        }
        m80 m80Var = this.f24376d;
        m80 m80Var2 = qaVar.f24376d;
        if (m80Var != null) {
            return m80Var.equals(m80Var2);
        }
        return m80Var2 == null;
    }

    public final boolean f() {
        return this.f24377e;
    }

    public final int hashCode() {
        int iA = z11.a(this.f24375c, z11.a(this.f24374b, this.f24373a.hashCode() * 31, 31), 31);
        m80 m80Var = this.f24376d;
        return ((((iA + (m80Var != null ? m80Var.hashCode() : 0)) * 31) + (this.f24377e ? 1 : 0)) * 31) + (this.f24378f ? 1 : 0);
    }
}
