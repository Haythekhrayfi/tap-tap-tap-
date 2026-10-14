package com.yandex.mobile.ads.impl;

import java.net.ProtocolException;

/* JADX INFO: loaded from: classes3.dex */
public final class wg implements t60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f26273a;

    public wg(boolean z10) {
        this.f26273a = z10;
    }

    @Override // com.yandex.mobile.ads.impl.t60
    public final ex0 a(cv0 cv0Var) throws Throwable {
        ex0.a aVarA;
        boolean z10;
        ex0.a aVarL;
        ix0 ix0VarA;
        fd.j0.i(cv0Var, "chain");
        gs gsVarD = cv0Var.d();
        fd.j0.f(gsVarD);
        nw0 nw0VarF = cv0Var.f();
        qw0 qw0VarA = nw0VarF.a();
        long jCurrentTimeMillis = System.currentTimeMillis();
        gsVarD.b(nw0VarF);
        if (!x00.a(nw0VarF.f()) || qw0VarA == null) {
            gsVarD.l();
            aVarA = null;
            z10 = true;
        } else {
            if (ed.q.i("100-continue", nw0VarF.a("Expect"), true)) {
                gsVarD.d();
                aVarA = gsVarD.a(true);
                gsVarD.m();
                z10 = false;
            } else {
                aVarA = null;
                z10 = true;
            }
            if (aVarA == null) {
                qd.e eVarB = qd.o.b(gsVarD.a(nw0VarF));
                qw0VarA.a(eVarB);
                ((qd.t) eVarB).close();
            } else {
                gsVarD.l();
                if (!gsVarD.f().h()) {
                    gsVarD.k();
                }
            }
        }
        gsVarD.c();
        if (aVarA == null) {
            aVarA = gsVarD.a(false);
            fd.j0.f(aVarA);
            if (z10) {
                gsVarD.m();
                z10 = false;
            }
        }
        ex0 ex0VarA = aVarA.a(nw0VarF).a(gsVarD.f().f()).b(jCurrentTimeMillis).a(System.currentTimeMillis()).a();
        int iE = ex0VarA.e();
        if (iE == 100) {
            ex0.a aVarA2 = gsVarD.a(false);
            fd.j0.f(aVarA2);
            if (z10) {
                gsVarD.m();
            }
            ex0VarA = aVarA2.a(nw0VarF).a(gsVarD.f().f()).b(jCurrentTimeMillis).a(System.currentTimeMillis()).a();
            iE = ex0VarA.e();
        }
        gsVarD.b(ex0VarA);
        if (this.f26273a && iE == 101) {
            aVarL = ex0VarA.l();
            ix0VarA = ea1.f20133c;
        } else {
            aVarL = ex0VarA.l();
            ix0VarA = gsVarD.a(ex0VarA);
        }
        ex0 ex0VarA2 = aVarL.a(ix0VarA).a();
        if (ed.q.i("close", ex0VarA2.p().a("Connection"), true) || ed.q.i("close", ex0.a(ex0VarA2, "Connection"), true)) {
            gsVarD.k();
        }
        if (iE == 204 || iE == 205) {
            ix0 ix0VarA2 = ex0VarA2.a();
            if ((ix0VarA2 != null ? ix0VarA2.b() : -1L) > 0) {
                StringBuilder sbA = androidx.appcompat.widget.r0.a("HTTP ", iE, " had non-zero Content-Length: ");
                ix0 ix0VarA3 = ex0VarA2.a();
                sbA.append(ix0VarA3 != null ? Long.valueOf(ix0VarA3.b()) : null);
                throw new ProtocolException(sbA.toString());
            }
        }
        return ex0VarA2;
    }
}
