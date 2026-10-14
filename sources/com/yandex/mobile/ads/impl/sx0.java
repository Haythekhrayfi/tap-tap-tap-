package com.yandex.mobile.ads.impl;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: loaded from: classes3.dex */
public final class sx0 implements t60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final yn0 f25207a;

    public sx0(yn0 yn0Var) {
        fd.j0.i(yn0Var, "client");
        this.f25207a = yn0Var;
    }

    private final nw0 a(ex0 ex0Var, gs gsVar) throws IOException {
        String strA;
        d10 d10VarB;
        xu0 xu0VarF;
        oy0 oy0VarK = (gsVar == null || (xu0VarF = gsVar.f()) == null) ? null : xu0VarF.k();
        int iE = ex0Var.e();
        String strF = ex0Var.p().f();
        int iIntValue = 0;
        if (iE != 307 && iE != 308) {
            if (iE == 401) {
                return this.f25207a.c().a(oy0VarK, ex0Var);
            }
            if (iE == 421) {
                Objects.requireNonNull(ex0Var.p());
                if (gsVar == null || !gsVar.i()) {
                    return null;
                }
                gsVar.f().i();
                return ex0Var.p();
            }
            int iIntValue2 = Integer.MAX_VALUE;
            if (iE == 503) {
                ex0 ex0VarM = ex0Var.m();
                if (ex0VarM != null && ex0VarM.e() == 503) {
                    return null;
                }
                String strA2 = ex0.a(ex0Var, "Retry-After");
                if (strA2 != null && new ed.f("\\d+").a(strA2)) {
                    Integer numValueOf = Integer.valueOf(strA2);
                    fd.j0.h(numValueOf, "valueOf(header)");
                    iIntValue2 = numValueOf.intValue();
                }
                if (iIntValue2 == 0) {
                    return ex0Var.p();
                }
                return null;
            }
            if (iE == 407) {
                fd.j0.f(oy0VarK);
                if (oy0VarK.b().type() == Proxy.Type.HTTP) {
                    return this.f25207a.s().a(oy0VarK, ex0Var);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (iE == 408) {
                if (!this.f25207a.v()) {
                    return null;
                }
                Objects.requireNonNull(ex0Var.p());
                ex0 ex0VarM2 = ex0Var.m();
                if (ex0VarM2 != null && ex0VarM2.e() == 408) {
                    return null;
                }
                String strA3 = ex0.a(ex0Var, "Retry-After");
                if (strA3 != null) {
                    if (new ed.f("\\d+").a(strA3)) {
                        Integer numValueOf2 = Integer.valueOf(strA3);
                        fd.j0.h(numValueOf2, "valueOf(header)");
                        iIntValue = numValueOf2.intValue();
                    } else {
                        iIntValue = Integer.MAX_VALUE;
                    }
                }
                if (iIntValue > 0) {
                    return null;
                }
                return ex0Var.p();
            }
            switch (iE) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        if (!this.f25207a.l() || (strA = ex0.a(ex0Var, "Location")) == null || (d10VarB = ex0Var.p().h().b(strA)) == null) {
            return null;
        }
        if (!fd.j0.d(d10VarB.l(), ex0Var.p().h().l()) && !this.f25207a.m()) {
            return null;
        }
        nw0.a aVarG = ex0Var.p().g();
        if (x00.a(strF)) {
            int iE2 = ex0Var.e();
            iIntValue = (x00.c(strF) || iE2 == 308 || iE2 == 307) ? 1 : 0;
            if (!x00.b(strF) || iE2 == 308 || iE2 == 307) {
                aVarG.a(strF, iIntValue != 0 ? ex0Var.p().a() : null);
            } else {
                aVarG.a("GET", (qw0) null);
            }
            if (iIntValue == 0) {
                aVarG.a("Transfer-Encoding");
                aVarG.a("Content-Length");
                aVarG.a("Content-Type");
            }
        }
        if (!ea1.a(ex0Var.p().h(), d10VarB)) {
            aVarG.a("Authorization");
        }
        return aVarG.a(d10VarB).a();
    }

    private final boolean a(IOException iOException, wu0 wu0Var, nw0 nw0Var, boolean z10) {
        if (!this.f25207a.v()) {
            return false;
        }
        if (z10 && (iOException instanceof FileNotFoundException)) {
            return false;
        }
        return (!(iOException instanceof ProtocolException) && (!(iOException instanceof InterruptedIOException) ? (!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException) : (iOException instanceof SocketTimeoutException) && !z10)) && wu0Var.m();
    }

    @Override // com.yandex.mobile.ads.impl.t60
    public final ex0 a(cv0 cv0Var) throws IOException {
        ex0 ex0VarA;
        fd.j0.i(cv0Var, "chain");
        nw0 nw0VarF = cv0Var.f();
        wu0 wu0VarB = cv0Var.b();
        List listA = kc.w.f32009c;
        ex0 ex0Var = null;
        int i10 = 0;
        while (true) {
            boolean z10 = true;
            while (true) {
                wu0VarB.a(nw0VarF, z10);
                try {
                    if (wu0VarB.j()) {
                        throw new IOException("Canceled");
                    }
                    try {
                        ex0VarA = cv0Var.a(nw0VarF);
                    } catch (qy0 e10) {
                        if (!a(e10.b(), wu0VarB, nw0VarF, false)) {
                            throw ea1.a(e10.a(), listA);
                        }
                        e = e10.a();
                        listA = kc.t.A(listA, e);
                        wu0VarB.a(true);
                        z10 = false;
                    } catch (IOException e11) {
                        e = e11;
                        if (!a(e, wu0VarB, nw0VarF, !(e instanceof mk))) {
                            throw ea1.a(e, listA);
                        }
                        listA = kc.t.A(listA, e);
                        wu0VarB.a(true);
                        z10 = false;
                    }
                    wu0VarB.a(true);
                    z10 = false;
                } catch (Throwable th) {
                    wu0VarB.a(true);
                    throw th;
                }
            }
            if (ex0Var != null) {
                ex0VarA = ex0VarA.l().c(ex0Var.l().a((ix0) null).a()).a();
            }
            ex0Var = ex0VarA;
            gs gsVarG = wu0VarB.g();
            nw0 nw0VarA = a(ex0Var, gsVarG);
            if (nw0VarA == null) {
                if (gsVarG != null && gsVarG.j()) {
                    wu0VarB.n();
                }
                wu0VarB.a(false);
                return ex0Var;
            }
            ix0 ix0VarA = ex0Var.a();
            if (ix0VarA != null) {
                ea1.a(ix0VarA);
            }
            i10++;
            if (i10 > 20) {
                throw new ProtocolException("Too many follow-up requests: " + i10);
            }
            wu0VarB.a(true);
            nw0VarF = nw0VarA;
        }
    }
}
