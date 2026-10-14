package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class qf implements t60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final jl f24466a;

    public qf(jl jlVar) {
        fd.j0.i(jlVar, "cookieJar");
        this.f24466a = jlVar;
    }

    @Override // com.yandex.mobile.ads.impl.t60
    public final ex0 a(cv0 cv0Var) throws IOException {
        boolean z10;
        ix0 ix0VarA;
        fd.j0.i(cv0Var, "chain");
        nw0 nw0VarI = cv0Var.i();
        nw0.a aVarG = nw0VarI.g();
        qw0 qw0VarA = nw0VarI.a();
        if (qw0VarA != null) {
            tc0 tc0VarB = qw0VarA.b();
            if (tc0VarB != null) {
                aVarG.b("Content-Type", tc0VarB.toString());
            }
            long jA = qw0VarA.a();
            if (jA != -1) {
                aVarG.b("Content-Length", String.valueOf(jA));
                aVarG.a("Transfer-Encoding");
            } else {
                aVarG.b("Transfer-Encoding", "chunked");
                aVarG.a("Content-Length");
            }
        }
        if (nw0VarI.a("Host") == null) {
            aVarG.b("Host", ea1.a(nw0VarI.h(), false));
        }
        if (nw0VarI.a("Connection") == null) {
            aVarG.b("Connection", "Keep-Alive");
        }
        int i10 = 0;
        if (nw0VarI.a("Accept-Encoding") == null && nw0VarI.a("Range") == null) {
            aVarG.b("Accept-Encoding", "gzip");
            z10 = true;
        } else {
            z10 = false;
        }
        List<hl> listA = this.f24466a.a(nw0VarI.h());
        if (!listA.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            for (Object obj : listA) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    kc.l.i();
                    throw null;
                }
                hl hlVar = (hl) obj;
                if (i10 > 0) {
                    sb2.append("; ");
                }
                sb2.append(hlVar.e());
                sb2.append('=');
                sb2.append(hlVar.f());
                i10 = i11;
            }
            String string = sb2.toString();
            fd.j0.h(string, "StringBuilder().apply(builderAction).toString()");
            aVarG.b("Cookie", string);
        }
        if (nw0VarI.a("User-Agent") == null) {
            aVarG.b("User-Agent", "okhttp/4.9.3");
        }
        ex0 ex0VarA = cv0Var.a(aVarG.a());
        w00.a(this.f24466a, nw0VarI.h(), ex0VarA.h());
        ex0.a aVarA = ex0VarA.l().a(nw0VarI);
        if (z10 && ed.q.i("gzip", ex0.a(ex0VarA, "Content-Encoding"), true) && w00.a(ex0VarA) && (ix0VarA = ex0VarA.a()) != null) {
            qd.l lVar = new qd.l(ix0VarA.d());
            aVarA.a(ex0VarA.h().b().b("Content-Encoding").b("Content-Length").a());
            aVarA.a(new dv0(ex0.a(ex0VarA, "Content-Type"), -1L, qd.o.c(lVar)));
        }
        return aVarA.a();
    }
}
