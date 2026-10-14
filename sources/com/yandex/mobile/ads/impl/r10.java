package com.yandex.mobile.ads.impl;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class r10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w9 f24585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f24586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v10 f24587c;

    public r10(w9 w9Var, String str, v10 v10Var) {
        fd.j0.i(w9Var, "appMetricaIdentifiers");
        fd.j0.i(str, "mauid");
        fd.j0.i(v10Var, "identifiersType");
        this.f24585a = w9Var;
        this.f24586b = str;
        this.f24587c = v10Var;
    }

    public final w9 a() {
        return this.f24585a;
    }

    public final v10 b() {
        return this.f24587c;
    }

    public final String c() {
        return this.f24586b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r10)) {
            return false;
        }
        r10 r10Var = (r10) obj;
        return fd.j0.d(this.f24585a, r10Var.f24585a) && fd.j0.d(this.f24586b, r10Var.f24586b) && this.f24587c == r10Var.f24587c;
    }

    public final int hashCode() {
        return this.f24587c.hashCode() + z11.a(this.f24586b, this.f24585a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sbA = v60.a("Identifiers(appMetricaIdentifiers=");
        sbA.append(this.f24585a);
        sbA.append(", mauid=");
        sbA.append(this.f24586b);
        sbA.append(", identifiersType=");
        sbA.append(this.f24587c);
        sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sbA.toString();
    }
}
