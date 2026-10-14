package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.http2.Header;

/* JADX INFO: loaded from: classes3.dex */
public final class k00 implements hs {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final List<String> f22212g = ea1.a("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", Header.TARGET_METHOD_UTF8, Header.TARGET_PATH_UTF8, Header.TARGET_SCHEME_UTF8, Header.TARGET_AUTHORITY_UTF8);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final List<String> f22213h = ea1.a("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final xu0 f22214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final cv0 f22215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f00 f22216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile m00 f22217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final nt0 f22218e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f22219f;

    public static final class a {
        public static ex0.a a(ry ryVar, nt0 nt0Var) throws IOException {
            fd.j0.i(ryVar, "headerBlock");
            fd.j0.i(nt0Var, "protocol");
            ry.a aVar = new ry.a();
            int size = ryVar.size();
            p41 p41VarA = null;
            for (int i10 = 0; i10 < size; i10++) {
                String strA = ryVar.a(i10);
                String strB = ryVar.b(i10);
                if (fd.j0.d(strA, Header.RESPONSE_STATUS_UTF8)) {
                    p41VarA = p41.a.a("HTTP/1.1 " + strB);
                } else if (!k00.f22213h.contains(strA)) {
                    aVar.b(strA, strB);
                }
            }
            if (p41VarA != null) {
                return new ex0.a().a(nt0Var).a(p41VarA.f23981b).b(p41VarA.f23982c).a(aVar.a());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }

        public static ArrayList a(nw0 nw0Var) {
            fd.j0.i(nw0Var, "request");
            ry ryVarD = nw0Var.d();
            ArrayList arrayList = new ArrayList(ryVarD.size() + 4);
            arrayList.add(new py(py.f24273f, nw0Var.f()));
            arrayList.add(new py(py.f24274g, tw0.a(nw0Var.h())));
            String strA = nw0Var.a("Host");
            if (strA != null) {
                arrayList.add(new py(py.f24276i, strA));
            }
            arrayList.add(new py(py.f24275h, nw0Var.h().l()));
            int size = ryVarD.size();
            for (int i10 = 0; i10 < size; i10++) {
                String strA2 = ryVarD.a(i10);
                Locale locale = Locale.US;
                fd.j0.h(locale, "US");
                String lowerCase = strA2.toLowerCase(locale);
                fd.j0.h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (!k00.f22212g.contains(lowerCase) || (fd.j0.d(lowerCase, "te") && fd.j0.d(ryVarD.b(i10), "trailers"))) {
                    arrayList.add(new py(lowerCase, ryVarD.b(i10)));
                }
            }
            return arrayList;
        }
    }

    public k00(yn0 yn0Var, xu0 xu0Var, cv0 cv0Var, f00 f00Var) {
        fd.j0.i(yn0Var, "client");
        fd.j0.i(xu0Var, "connection");
        fd.j0.i(cv0Var, "chain");
        fd.j0.i(f00Var, "http2Connection");
        this.f22214a = xu0Var;
        this.f22215b = cv0Var;
        this.f22216c = f00Var;
        List<nt0> listR = yn0Var.r();
        nt0 nt0Var = nt0.f23548f;
        this.f22218e = listR.contains(nt0Var) ? nt0Var : nt0.f23547e;
    }

    @Override // com.yandex.mobile.ads.impl.hs
    public final ex0.a a(boolean z10) throws IOException {
        m00 m00Var = this.f22217d;
        fd.j0.f(m00Var);
        ex0.a aVarA = a.a(m00Var.s(), this.f22218e);
        if (z10 && aVarA.b() == 100) {
            return null;
        }
        return aVarA;
    }

    @Override // com.yandex.mobile.ads.impl.hs
    public final qd.a0 a(ex0 ex0Var) {
        fd.j0.i(ex0Var, "response");
        m00 m00Var = this.f22217d;
        fd.j0.f(m00Var);
        return m00Var.l();
    }

    @Override // com.yandex.mobile.ads.impl.hs
    public final qd.y a(nw0 nw0Var, long j10) {
        fd.j0.i(nw0Var, "request");
        m00 m00Var = this.f22217d;
        fd.j0.f(m00Var);
        return m00Var.j();
    }

    @Override // com.yandex.mobile.ads.impl.hs
    public final void a() throws IOException {
        m00 m00Var = this.f22217d;
        fd.j0.f(m00Var);
        m00Var.j().close();
    }

    @Override // com.yandex.mobile.ads.impl.hs
    public final void a(nw0 nw0Var) throws IOException {
        fd.j0.i(nw0Var, "request");
        if (this.f22217d != null) {
            return;
        }
        this.f22217d = this.f22216c.a(a.a(nw0Var), nw0Var.a() != null);
        if (this.f22219f) {
            m00 m00Var = this.f22217d;
            fd.j0.f(m00Var);
            m00Var.a(as.f19051g);
            throw new IOException("Canceled");
        }
        m00 m00Var2 = this.f22217d;
        fd.j0.f(m00Var2);
        m00.c cVarR = m00Var2.r();
        long jE = this.f22215b.e();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        cVarR.timeout(jE, timeUnit);
        m00 m00Var3 = this.f22217d;
        fd.j0.f(m00Var3);
        m00Var3.u().timeout(this.f22215b.g(), timeUnit);
    }

    @Override // com.yandex.mobile.ads.impl.hs
    public final long b(ex0 ex0Var) {
        fd.j0.i(ex0Var, "response");
        if (w00.a(ex0Var)) {
            return ea1.a(ex0Var);
        }
        return 0L;
    }

    @Override // com.yandex.mobile.ads.impl.hs
    public final void b() throws IOException {
        this.f22216c.flush();
    }

    @Override // com.yandex.mobile.ads.impl.hs
    public final xu0 c() {
        return this.f22214a;
    }

    @Override // com.yandex.mobile.ads.impl.hs
    public final void cancel() {
        this.f22219f = true;
        m00 m00Var = this.f22217d;
        if (m00Var != null) {
            m00Var.a(as.f19051g);
        }
    }
}
