package com.yandex.mobile.ads.impl;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.ImagesContract;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class nw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d10 f23563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f23564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ry f23565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final qw0 f23566d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<Class<?>, Object> f23567e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private fg f23568f;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private d10 f23569a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f23570b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ry.a f23571c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private qw0 f23572d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Map<Class<?>, Object> f23573e;

        public a() {
            this.f23573e = new LinkedHashMap();
            this.f23570b = "GET";
            this.f23571c = new ry.a();
        }

        public a(nw0 nw0Var) {
            fd.j0.i(nw0Var, "request");
            this.f23573e = new LinkedHashMap();
            this.f23569a = nw0Var.h();
            this.f23570b = nw0Var.f();
            this.f23572d = nw0Var.a();
            this.f23573e = nw0Var.c().isEmpty() ? new LinkedHashMap<>() : kc.f0.l(nw0Var.c());
            this.f23571c = nw0Var.d().b();
        }

        public final a a(d10 d10Var) {
            fd.j0.i(d10Var, ImagesContract.URL);
            this.f23569a = d10Var;
            return this;
        }

        public final a a(ry ryVar) {
            fd.j0.i(ryVar, "headers");
            this.f23571c = ryVar.b();
            return this;
        }

        public final a a(String str, qw0 qw0Var) {
            fd.j0.i(str, "method");
            if (!(str.length() > 0)) {
                throw new IllegalArgumentException("method.isEmpty() == true".toString());
            }
            if (qw0Var == null) {
                if (!(true ^ x00.d(str))) {
                    throw new IllegalArgumentException(androidx.activity.j.a("method ", str, " must have a request body.").toString());
                }
            } else if (!x00.a(str)) {
                throw new IllegalArgumentException(androidx.activity.j.a("method ", str, " must not have a request body.").toString());
            }
            this.f23570b = str;
            this.f23572d = qw0Var;
            return this;
        }

        public final a a(URL url) {
            fd.j0.i(url, ImagesContract.URL);
            String string = url.toString();
            fd.j0.h(string, "url.toString()");
            d10 d10VarB = d10.b.b(string);
            fd.j0.i(d10VarB, ImagesContract.URL);
            this.f23569a = d10VarB;
            return this;
        }

        public final nw0 a() {
            d10 d10Var = this.f23569a;
            if (d10Var != null) {
                return new nw0(d10Var, this.f23570b, this.f23571c.a(), this.f23572d, ea1.a(this.f23573e));
            }
            throw new IllegalStateException("url == null".toString());
        }

        public final void a(fg fgVar) {
            fd.j0.i(fgVar, "cacheControl");
            String string = fgVar.toString();
            if (string.length() == 0) {
                this.f23571c.b("Cache-Control");
            } else {
                this.f23571c.c("Cache-Control", string);
            }
        }

        public final void a(String str) {
            fd.j0.i(str, "name");
            this.f23571c.b(str);
        }

        public final void a(String str, String str2) {
            fd.j0.i(str, "name");
            fd.j0.i(str2, "value");
            this.f23571c.a(str, str2);
        }

        public final a b(String str, String str2) {
            fd.j0.i(str, "name");
            fd.j0.i(str2, "value");
            this.f23571c.c(str, str2);
            return this;
        }
    }

    public nw0(d10 d10Var, String str, ry ryVar, qw0 qw0Var, Map<Class<?>, ? extends Object> map) {
        fd.j0.i(d10Var, ImagesContract.URL);
        fd.j0.i(str, "method");
        fd.j0.i(ryVar, "headers");
        fd.j0.i(map, "tags");
        this.f23563a = d10Var;
        this.f23564b = str;
        this.f23565c = ryVar;
        this.f23566d = qw0Var;
        this.f23567e = map;
    }

    public final qw0 a() {
        return this.f23566d;
    }

    public final String a(String str) {
        fd.j0.i(str, "name");
        return this.f23565c.a(str);
    }

    public final fg b() {
        fg fgVar = this.f23568f;
        if (fgVar != null) {
            return fgVar;
        }
        int i10 = fg.f20689n;
        fg fgVarA = fg.b.a(this.f23565c);
        this.f23568f = fgVarA;
        return fgVarA;
    }

    public final Map<Class<?>, Object> c() {
        return this.f23567e;
    }

    public final ry d() {
        return this.f23565c;
    }

    public final boolean e() {
        return this.f23563a.h();
    }

    public final String f() {
        return this.f23564b;
    }

    public final a g() {
        return new a(this);
    }

    public final d10 h() {
        return this.f23563a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        StringBuilder sbA = defpackage.a.a("Request{method=");
        sbA.append(this.f23564b);
        sbA.append(", url=");
        sbA.append(this.f23563a);
        if (this.f23565c.size() != 0) {
            sbA.append(", headers=[");
            int i10 = 0;
            for (jc.h<? extends String, ? extends String> hVar : this.f23565c) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    kc.l.i();
                    throw null;
                }
                jc.h<? extends String, ? extends String> hVar2 = hVar;
                String str = (String) hVar2.f31811c;
                String str2 = (String) hVar2.f31812d;
                if (i10 > 0) {
                    sbA.append(", ");
                }
                l1.c.a(sbA, str, CoreConstants.COLON_CHAR, str2);
                i10 = i11;
            }
            sbA.append(']');
        }
        if (!this.f23567e.isEmpty()) {
            sbA.append(", tags=");
            sbA.append(this.f23567e);
        }
        sbA.append('}');
        String string = sbA.toString();
        fd.j0.h(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
