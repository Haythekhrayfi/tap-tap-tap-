package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class cv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wu0 f19629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<t60> f19630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f19631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final gs f19632d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final nw0 f19633e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f19634f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f19635g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f19636h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f19637i;

    /* JADX WARN: Multi-variable type inference failed */
    public cv0(wu0 wu0Var, List<? extends t60> list, int i10, gs gsVar, nw0 nw0Var, int i11, int i12, int i13) {
        fd.j0.i(wu0Var, "call");
        fd.j0.i(list, "interceptors");
        fd.j0.i(nw0Var, "request");
        this.f19629a = wu0Var;
        this.f19630b = list;
        this.f19631c = i10;
        this.f19632d = gsVar;
        this.f19633e = nw0Var;
        this.f19634f = i11;
        this.f19635g = i12;
        this.f19636h = i13;
    }

    public static cv0 a(cv0 cv0Var, int i10, gs gsVar, nw0 nw0Var, int i11) {
        if ((i11 & 1) != 0) {
            i10 = cv0Var.f19631c;
        }
        int i12 = i10;
        if ((i11 & 2) != 0) {
            gsVar = cv0Var.f19632d;
        }
        gs gsVar2 = gsVar;
        if ((i11 & 4) != 0) {
            nw0Var = cv0Var.f19633e;
        }
        nw0 nw0Var2 = nw0Var;
        int i13 = (i11 & 8) != 0 ? cv0Var.f19634f : 0;
        int i14 = (i11 & 16) != 0 ? cv0Var.f19635g : 0;
        int i15 = (i11 & 32) != 0 ? cv0Var.f19636h : 0;
        Objects.requireNonNull(cv0Var);
        fd.j0.i(nw0Var2, "request");
        return new cv0(cv0Var.f19629a, cv0Var.f19630b, i12, gsVar2, nw0Var2, i13, i14, i15);
    }

    public final ex0 a(nw0 nw0Var) throws IOException {
        fd.j0.i(nw0Var, "request");
        if (!(this.f19631c < this.f19630b.size())) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.f19637i++;
        gs gsVar = this.f19632d;
        if (gsVar != null) {
            if (!gsVar.h().a(nw0Var.h())) {
                StringBuilder sbA = v60.a("network interceptor ");
                sbA.append(this.f19630b.get(this.f19631c - 1));
                sbA.append(" must retain the same host and port");
                throw new IllegalStateException(sbA.toString().toString());
            }
            if (!(this.f19637i == 1)) {
                StringBuilder sbA2 = v60.a("network interceptor ");
                sbA2.append(this.f19630b.get(this.f19631c - 1));
                sbA2.append(" must call proceed() exactly once");
                throw new IllegalStateException(sbA2.toString().toString());
            }
        }
        cv0 cv0VarA = a(this, this.f19631c + 1, null, nw0Var, 58);
        t60 t60Var = this.f19630b.get(this.f19631c);
        ex0 ex0VarA = t60Var.a(cv0VarA);
        if (ex0VarA == null) {
            throw new NullPointerException("interceptor " + t60Var + " returned null");
        }
        if (this.f19632d != null) {
            if (!(this.f19631c + 1 >= this.f19630b.size() || cv0VarA.f19637i == 1)) {
                throw new IllegalStateException(("network interceptor " + t60Var + " must call proceed() exactly once").toString());
            }
        }
        if (ex0VarA.a() != null) {
            return ex0VarA;
        }
        throw new IllegalStateException(("interceptor " + t60Var + " returned a response with no body").toString());
    }

    public final wu0 a() {
        return this.f19629a;
    }

    public final wu0 b() {
        return this.f19629a;
    }

    public final int c() {
        return this.f19634f;
    }

    public final gs d() {
        return this.f19632d;
    }

    public final int e() {
        return this.f19635g;
    }

    public final nw0 f() {
        return this.f19633e;
    }

    public final int g() {
        return this.f19636h;
    }

    public final int h() {
        return this.f19635g;
    }

    public final nw0 i() {
        return this.f19633e;
    }
}
