package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class og implements t60 {

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(int i10) {
            this();
        }

        public static final ex0 a(ex0 ex0Var) {
            if ((ex0Var != null ? ex0Var.a() : null) == null) {
                return ex0Var;
            }
            Objects.requireNonNull(ex0Var);
            return new ex0.a(ex0Var).a((ix0) null).a();
        }

        public static final ry a(ry ryVar, ry ryVar2) {
            ry.a aVar = new ry.a();
            int size = ryVar.size();
            int i10 = 0;
            while (true) {
                boolean z10 = true;
                if (i10 >= size) {
                    break;
                }
                String strA = ryVar.a(i10);
                String strB = ryVar.b(i10);
                if (!ed.q.i("Warning", strA, true) || !ed.q.u(strB, "1", false, 2)) {
                    if (!ed.q.i("Content-Length", strA, true) && !ed.q.i("Content-Encoding", strA, true) && !ed.q.i("Content-Type", strA, true)) {
                        z10 = false;
                    }
                    if (z10 || !a(strA) || ryVar2.a(strA) == null) {
                        aVar.b(strA, strB);
                    }
                }
                i10++;
            }
            int size2 = ryVar2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                String strA2 = ryVar2.a(i11);
                if (!(ed.q.i("Content-Length", strA2, true) || ed.q.i("Content-Encoding", strA2, true) || ed.q.i("Content-Type", strA2, true)) && a(strA2)) {
                    aVar.b(strA2, ryVar2.b(i11));
                }
            }
            return aVar.a();
        }

        private static boolean a(String str) {
            return (ed.q.i("Connection", str, true) || ed.q.i("Keep-Alive", str, true) || ed.q.i("Proxy-Authenticate", str, true) || ed.q.i("Proxy-Authorization", str, true) || ed.q.i("TE", str, true) || ed.q.i("Trailers", str, true) || ed.q.i("Transfer-Encoding", str, true) || ed.q.i("Upgrade", str, true)) ? false : true;
        }
    }

    static {
        new a(0);
    }

    @Override // com.yandex.mobile.ads.impl.t60
    public final ex0 a(cv0 cv0Var) throws IOException {
        cs csVarE;
        fd.j0.i(cv0Var, "chain");
        wu0 wu0VarA = cv0Var.a();
        rg rgVarA = new rg.b(System.currentTimeMillis(), cv0Var.i()).a();
        nw0 nw0VarB = rgVarA.b();
        ex0 ex0VarA = rgVarA.a();
        wu0 wu0Var = wu0VarA instanceof wu0 ? wu0VarA : null;
        if (wu0Var == null || (csVarE = wu0Var.e()) == null) {
            csVarE = cs.f19622a;
        }
        if (nw0VarB == null && ex0VarA == null) {
            ex0 ex0VarA2 = new ex0.a().a(cv0Var.i()).a(nt0.f23545c).a(504).b("Unsatisfiable Request (only-if-cached)").a(ea1.f20133c).b(-1L).a(System.currentTimeMillis()).a();
            Objects.requireNonNull(csVarE);
            cs.c(wu0VarA, ex0VarA2);
            return ex0VarA2;
        }
        if (nw0VarB == null) {
            fd.j0.f(ex0VarA);
            ex0 ex0VarA3 = ex0VarA.l().a(a.a(ex0VarA)).a();
            Objects.requireNonNull(csVarE);
            cs.b(wu0VarA, ex0VarA3);
            return ex0VarA3;
        }
        if (ex0VarA != null) {
            Objects.requireNonNull(csVarE);
            cs.a((vg) wu0VarA, ex0VarA);
        }
        ex0 ex0VarA4 = cv0Var.a(nw0VarB);
        if (ex0VarA != null) {
            if (ex0VarA4.e() == 304) {
                ex0VarA.l().a(a.a(ex0VarA.h(), ex0VarA4.h())).b(ex0VarA4.q()).a(ex0VarA4.o()).a(a.a(ex0VarA)).b(a.a(ex0VarA4)).a();
                ix0 ix0VarA = ex0VarA4.a();
                fd.j0.f(ix0VarA);
                ix0VarA.close();
                fd.j0.f(null);
                throw null;
            }
            ix0 ix0VarA2 = ex0VarA.a();
            if (ix0VarA2 != null) {
                ea1.a(ix0VarA2);
            }
        }
        fd.j0.f(ex0VarA4);
        return ex0VarA4.l().a(a.a(ex0VarA)).b(a.a(ex0VarA4)).a();
    }
}
