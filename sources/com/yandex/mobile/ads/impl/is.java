package com.yandex.mobile.ads.impl;

import com.google.android.gms.common.internal.ImagesContract;
import java.io.IOException;
import java.net.Socket;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class is {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bv0 f21803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e7 f21804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wu0 f21805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final cs f21806d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ry0.b f21807e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ry0 f21808f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f21809g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f21810h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f21811i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private oy0 f21812j;

    public is(bv0 bv0Var, e7 e7Var, wu0 wu0Var, cs csVar) {
        fd.j0.i(bv0Var, "connectionPool");
        fd.j0.i(e7Var, "address");
        fd.j0.i(wu0Var, "call");
        fd.j0.i(csVar, "eventListener");
        this.f21803a = bv0Var;
        this.f21804b = e7Var;
        this.f21805c = wu0Var;
        this.f21806d = csVar;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0076  */
    /* JADX WARN: Code duplicated, block: B:34:0x008d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0091  */
    /* JADX WARN: Code duplicated, block: B:38:0x0095  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:56:0x0123  */
    /* JADX WARN: Code duplicated, block: B:57:0x0142  */
    /* JADX WARN: Code duplicated, block: B:90:0x0143 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0193 A[SYNTHETIC] */
    private final xu0 a(int i10, int i11, int i12, boolean z10, boolean z11) throws IOException {
        oy0 oy0VarC;
        ry0.b bVar;
        ry0 ry0Var;
        ry0.b bVarB;
        List<oy0> listA;
        xu0 xu0Var;
        Socket socketL;
        while (!this.f21805c.j()) {
            xu0 xu0VarD = this.f21805c.d();
            if (xu0VarD != null) {
                synchronized (xu0VarD) {
                    socketL = (xu0VarD.d() || !a(xu0VarD.k().a().k())) ? this.f21805c.l() : null;
                }
                if (this.f21805c.d() != null) {
                    if (!(socketL == null)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else {
                    if (socketL != null) {
                        ea1.a(socketL);
                    }
                    cs csVar = this.f21806d;
                    wu0 wu0Var = this.f21805c;
                    Objects.requireNonNull(csVar);
                    cs.a((vg) wu0Var, xu0VarD);
                    this.f21809g = 0;
                    this.f21810h = 0;
                    this.f21811i = 0;
                    if (this.f21803a.a(this.f21804b, this.f21805c, null, false)) {
                        xu0VarD = this.f21805c.d();
                        fd.j0.f(xu0VarD);
                        cs csVar2 = this.f21806d;
                        wu0 wu0Var2 = this.f21805c;
                        Objects.requireNonNull(csVar2);
                        cs.a(wu0Var2, xu0VarD);
                    } else {
                        oy0VarC = this.f21812j;
                        try {
                            if (oy0VarC != null) {
                                this.f21812j = null;
                            } else {
                                bVar = this.f21807e;
                                if (bVar == null && bVar.b()) {
                                    ry0.b bVar2 = this.f21807e;
                                    fd.j0.f(bVar2);
                                    oy0VarC = bVar2.c();
                                } else {
                                    ry0Var = this.f21808f;
                                    if (ry0Var == null) {
                                        ry0Var = new ry0(this.f21804b, this.f21805c.c().n(), this.f21805c, this.f21806d);
                                        this.f21808f = ry0Var;
                                    }
                                    bVarB = ry0Var.b();
                                    this.f21807e = bVarB;
                                    listA = bVarB.a();
                                    if (!this.f21805c.j()) {
                                        throw new IOException("Canceled");
                                    }
                                    if (this.f21803a.a(this.f21804b, this.f21805c, listA, false)) {
                                        xu0VarD = this.f21805c.d();
                                        fd.j0.f(xu0VarD);
                                        cs csVar3 = this.f21806d;
                                        wu0 wu0Var3 = this.f21805c;
                                        Objects.requireNonNull(csVar3);
                                        cs.a(wu0Var3, xu0VarD);
                                    } else {
                                        oy0VarC = bVarB.c();
                                    }
                                }
                                xu0Var = new xu0(this.f21803a, oy0VarC);
                                this.f21805c.b(xu0Var);
                                xu0Var.a(i10, i11, i12, z10, this.f21805c, this.f21806d);
                                this.f21805c.b((xu0) null);
                                this.f21805c.c().n().a(xu0Var.k());
                                if (this.f21803a.a(this.f21804b, this.f21805c, listA, true)) {
                                    xu0 xu0VarD2 = this.f21805c.d();
                                    fd.j0.f(xu0VarD2);
                                    this.f21812j = oy0VarC;
                                    ea1.a(xu0Var.m());
                                    cs csVar4 = this.f21806d;
                                    wu0 wu0Var4 = this.f21805c;
                                    Objects.requireNonNull(csVar4);
                                    cs.a(wu0Var4, xu0VarD2);
                                    xu0VarD = xu0VarD2;
                                } else {
                                    synchronized (xu0Var) {
                                        this.f21803a.b(xu0Var);
                                        this.f21805c.a(xu0Var);
                                    }
                                    cs csVar5 = this.f21806d;
                                    wu0 wu0Var5 = this.f21805c;
                                    Objects.requireNonNull(csVar5);
                                    cs.a(wu0Var5, xu0Var);
                                    xu0VarD = xu0Var;
                                }
                            }
                            xu0Var.a(i10, i11, i12, z10, this.f21805c, this.f21806d);
                            this.f21805c.b((xu0) null);
                            this.f21805c.c().n().a(xu0Var.k());
                            if (this.f21803a.a(this.f21804b, this.f21805c, listA, true)) {
                                xu0 xu0VarD3 = this.f21805c.d();
                                fd.j0.f(xu0VarD3);
                                this.f21812j = oy0VarC;
                                ea1.a(xu0Var.m());
                                cs csVar6 = this.f21806d;
                                wu0 wu0Var6 = this.f21805c;
                                Objects.requireNonNull(csVar6);
                                cs.a(wu0Var6, xu0VarD3);
                                xu0VarD = xu0VarD3;
                            } else {
                                synchronized (xu0Var) {
                                    this.f21803a.b(xu0Var);
                                    this.f21805c.a(xu0Var);
                                    cs csVar7 = this.f21806d;
                                    wu0 wu0Var7 = this.f21805c;
                                    Objects.requireNonNull(csVar7);
                                    cs.a(wu0Var7, xu0Var);
                                    xu0VarD = xu0Var;
                                }
                            }
                        } catch (Throwable th) {
                            this.f21805c.b((xu0) null);
                            throw th;
                        }
                        listA = null;
                        xu0Var = new xu0(this.f21803a, oy0VarC);
                        this.f21805c.b(xu0Var);
                    }
                }
            } else {
                this.f21809g = 0;
                this.f21810h = 0;
                this.f21811i = 0;
                if (this.f21803a.a(this.f21804b, this.f21805c, null, false)) {
                    oy0VarC = this.f21812j;
                    if (oy0VarC != null) {
                        this.f21812j = null;
                    } else {
                        bVar = this.f21807e;
                        if (bVar == null) {
                        }
                        ry0Var = this.f21808f;
                        if (ry0Var == null) {
                            ry0Var = new ry0(this.f21804b, this.f21805c.c().n(), this.f21805c, this.f21806d);
                            this.f21808f = ry0Var;
                        }
                        bVarB = ry0Var.b();
                        this.f21807e = bVarB;
                        listA = bVarB.a();
                        if (!this.f21805c.j()) {
                            throw new IOException("Canceled");
                        }
                        if (this.f21803a.a(this.f21804b, this.f21805c, listA, false)) {
                            xu0VarD = this.f21805c.d();
                            fd.j0.f(xu0VarD);
                            cs csVar8 = this.f21806d;
                            wu0 wu0Var8 = this.f21805c;
                            Objects.requireNonNull(csVar8);
                            cs.a(wu0Var8, xu0VarD);
                        } else {
                            oy0VarC = bVarB.c();
                            xu0Var = new xu0(this.f21803a, oy0VarC);
                            this.f21805c.b(xu0Var);
                            xu0Var.a(i10, i11, i12, z10, this.f21805c, this.f21806d);
                            this.f21805c.b((xu0) null);
                            this.f21805c.c().n().a(xu0Var.k());
                            if (this.f21803a.a(this.f21804b, this.f21805c, listA, true)) {
                                xu0 xu0VarD4 = this.f21805c.d();
                                fd.j0.f(xu0VarD4);
                                this.f21812j = oy0VarC;
                                ea1.a(xu0Var.m());
                                cs csVar9 = this.f21806d;
                                wu0 wu0Var9 = this.f21805c;
                                Objects.requireNonNull(csVar9);
                                cs.a(wu0Var9, xu0VarD4);
                                xu0VarD = xu0VarD4;
                            } else {
                                synchronized (xu0Var) {
                                    this.f21803a.b(xu0Var);
                                    this.f21805c.a(xu0Var);
                                    cs csVar10 = this.f21806d;
                                    wu0 wu0Var10 = this.f21805c;
                                    Objects.requireNonNull(csVar10);
                                    cs.a(wu0Var10, xu0Var);
                                    xu0VarD = xu0Var;
                                }
                            }
                        }
                    }
                    listA = null;
                    xu0Var = new xu0(this.f21803a, oy0VarC);
                    this.f21805c.b(xu0Var);
                    xu0Var.a(i10, i11, i12, z10, this.f21805c, this.f21806d);
                    this.f21805c.b((xu0) null);
                    this.f21805c.c().n().a(xu0Var.k());
                    if (this.f21803a.a(this.f21804b, this.f21805c, listA, true)) {
                        xu0 xu0VarD5 = this.f21805c.d();
                        fd.j0.f(xu0VarD5);
                        this.f21812j = oy0VarC;
                        ea1.a(xu0Var.m());
                        cs csVar11 = this.f21806d;
                        wu0 wu0Var11 = this.f21805c;
                        Objects.requireNonNull(csVar11);
                        cs.a(wu0Var11, xu0VarD5);
                        xu0VarD = xu0VarD5;
                    } else {
                        synchronized (xu0Var) {
                            this.f21803a.b(xu0Var);
                            this.f21805c.a(xu0Var);
                            cs csVar12 = this.f21806d;
                            wu0 wu0Var12 = this.f21805c;
                            Objects.requireNonNull(csVar12);
                            cs.a(wu0Var12, xu0Var);
                            xu0VarD = xu0Var;
                        }
                    }
                } else {
                    xu0VarD = this.f21805c.d();
                    fd.j0.f(xu0VarD);
                    cs csVar13 = this.f21806d;
                    wu0 wu0Var13 = this.f21805c;
                    Objects.requireNonNull(csVar13);
                    cs.a(wu0Var13, xu0VarD);
                }
            }
            if (xu0VarD.a(z11)) {
                return xu0VarD;
            }
            xu0VarD.j();
            if (this.f21812j == null) {
                ry0.b bVar3 = this.f21807e;
                if (bVar3 != null ? bVar3.b() : true) {
                    continue;
                } else {
                    ry0 ry0Var2 = this.f21808f;
                    if (!(ry0Var2 != null ? ry0Var2.a() : true)) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
        }
        throw new IOException("Canceled");
    }

    public final e7 a() {
        return this.f21804b;
    }

    public final hs a(yn0 yn0Var, cv0 cv0Var) {
        fd.j0.i(yn0Var, "client");
        fd.j0.i(cv0Var, "chain");
        try {
            return a(cv0Var.c(), cv0Var.e(), cv0Var.g(), yn0Var.v(), !fd.j0.d(cv0Var.f().f(), "GET")).a(yn0Var, cv0Var);
        } catch (qy0 e10) {
            a(e10.b());
            throw e10;
        } catch (IOException e11) {
            a(e11);
            throw new qy0(e11);
        }
    }

    public final void a(IOException iOException) {
        fd.j0.i(iOException, "e");
        this.f21812j = null;
        if ((iOException instanceof t41) && ((t41) iOException).f25278a == as.f19050f) {
            this.f21809g++;
        } else if (iOException instanceof mk) {
            this.f21810h++;
        } else {
            this.f21811i++;
        }
    }

    public final boolean a(d10 d10Var) {
        fd.j0.i(d10Var, ImagesContract.URL);
        d10 d10VarK = this.f21804b.k();
        return d10Var.i() == d10VarK.i() && fd.j0.d(d10Var.g(), d10VarK.g());
    }

    public final boolean b() {
        ry0 ry0Var;
        xu0 xu0VarD;
        int i10 = this.f21809g;
        boolean z10 = false;
        if (i10 == 0 && this.f21810h == 0 && this.f21811i == 0) {
            return false;
        }
        if (this.f21812j != null) {
            return true;
        }
        oy0 oy0VarK = null;
        if (i10 <= 1 && this.f21810h <= 1 && this.f21811i <= 0 && (xu0VarD = this.f21805c.d()) != null) {
            synchronized (xu0VarD) {
                if (xu0VarD.e() == 0 && ea1.a(xu0VarD.k().a().k(), this.f21804b.k())) {
                    oy0VarK = xu0VarD.k();
                }
            }
        }
        if (oy0VarK != null) {
            this.f21812j = oy0VarK;
            return true;
        }
        ry0.b bVar = this.f21807e;
        if (bVar != null && bVar.b()) {
            z10 = true;
        }
        if (z10 || (ry0Var = this.f21808f) == null) {
            return true;
        }
        return ry0Var.a();
    }
}
