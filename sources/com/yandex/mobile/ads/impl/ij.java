package com.yandex.mobile.ads.impl;

import ch.qos.logback.core.joran.action.Action;

/* JADX INFO: loaded from: classes3.dex */
public final class ij implements gj, b90.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    private static final Object f21722i = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h81 f21723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h81 f21724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f21725d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f21726e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f21727f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f21728g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f21729h;

    public ij(jj jjVar, kj kjVar, b90 b90Var) {
        fd.j0.i(jjVar, "cmpV1");
        fd.j0.i(kjVar, "cmpV2");
        fd.j0.i(b90Var, "preferences");
        this.f21723b = jjVar;
        this.f21724c = kjVar;
        for (ej ejVar : ej.values()) {
            a(b90Var, ejVar);
        }
        b90Var.a(this);
    }

    private final void a(b90 b90Var, ej ejVar) {
        lj ljVarA = this.f21724c.a(b90Var, ejVar);
        if (ljVarA == null) {
            ljVarA = this.f21723b.a(b90Var, ejVar);
        }
        a(ljVarA);
    }

    private final void a(lj ljVar) {
        if (ljVar instanceof lj.a) {
            this.f21727f = ((lj.a) ljVar).a();
            return;
        }
        if (ljVar instanceof lj.b) {
            this.f21725d = ((lj.b) ljVar).a();
            return;
        }
        if (ljVar instanceof lj.c) {
            this.f21726e = ((lj.c) ljVar).a();
        } else if (ljVar instanceof lj.d) {
            this.f21728g = ((lj.d) ljVar).a();
        } else if (ljVar instanceof lj.e) {
            this.f21729h = ((lj.e) ljVar).a();
        }
    }

    @Override // com.yandex.mobile.ads.impl.b90.a
    public final void a(b90 b90Var, String str) {
        fd.j0.i(b90Var, "localStorage");
        fd.j0.i(str, Action.KEY_ATTRIBUTE);
        synchronized (f21722i) {
            lj ljVarA = this.f21724c.a(b90Var, str);
            if (ljVarA == null) {
                ljVarA = this.f21723b.a(b90Var, str);
            }
            if (ljVarA != null) {
                a(ljVarA);
            }
        }
    }

    public final boolean a() {
        boolean z10;
        synchronized (f21722i) {
            z10 = this.f21727f;
        }
        return z10;
    }

    public final String b() {
        String str;
        synchronized (f21722i) {
            str = this.f21725d;
        }
        return str;
    }

    public final String c() {
        String str;
        synchronized (f21722i) {
            str = this.f21726e;
        }
        return str;
    }

    public final String d() {
        String str;
        synchronized (f21722i) {
            str = this.f21728g;
        }
        return str;
    }

    public final String e() {
        String str;
        synchronized (f21722i) {
            str = this.f21729h;
        }
        return str;
    }
}
