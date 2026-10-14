package com.yandex.mobile.ads.impl;

import ch.qos.logback.core.CoreConstants;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class ao0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f19029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f19030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SSLSocketFactory f19031c;

    public ao0(int i10, int i11, SSLSocketFactory sSLSocketFactory) {
        this.f19029a = i10;
        this.f19030b = i11;
        this.f19031c = sSLSocketFactory;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ao0)) {
            return false;
        }
        ao0 ao0Var = (ao0) obj;
        return this.f19029a == ao0Var.f19029a && this.f19030b == ao0Var.f19030b && fd.j0.d(this.f19031c, ao0Var.f19031c);
    }

    public final int hashCode() {
        int iA = r6.a.a(this.f19030b, Integer.hashCode(this.f19029a) * 31, 31);
        SSLSocketFactory sSLSocketFactory = this.f19031c;
        return iA + (sSLSocketFactory == null ? 0 : sSLSocketFactory.hashCode());
    }

    public final String toString() {
        StringBuilder sbA = v60.a("OkHttpConfiguration(connectionTimeoutMs=");
        sbA.append(this.f19029a);
        sbA.append(", readTimeoutMs=");
        sbA.append(this.f19030b);
        sbA.append(", sslSocketFactory=");
        sbA.append(this.f19031c);
        sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sbA.toString();
    }
}
