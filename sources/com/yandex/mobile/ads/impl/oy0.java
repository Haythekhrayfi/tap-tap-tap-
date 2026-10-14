package com.yandex.mobile.ads.impl;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: loaded from: classes3.dex */
public final class oy0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e7 f23931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Proxy f23932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InetSocketAddress f23933c;

    public oy0(e7 e7Var, Proxy proxy, InetSocketAddress inetSocketAddress) {
        fd.j0.i(e7Var, "address");
        fd.j0.i(proxy, "proxy");
        fd.j0.i(inetSocketAddress, "socketAddress");
        this.f23931a = e7Var;
        this.f23932b = proxy;
        this.f23933c = inetSocketAddress;
    }

    public final e7 a() {
        return this.f23931a;
    }

    public final Proxy b() {
        return this.f23932b;
    }

    public final boolean c() {
        return this.f23931a.j() != null && this.f23932b.type() == Proxy.Type.HTTP;
    }

    public final InetSocketAddress d() {
        return this.f23933c;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof oy0) {
            oy0 oy0Var = (oy0) obj;
            if (fd.j0.d(oy0Var.f23931a, this.f23931a) && fd.j0.d(oy0Var.f23932b, this.f23932b) && fd.j0.d(oy0Var.f23933c, this.f23933c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f23933c.hashCode() + ((this.f23932b.hashCode() + ((this.f23931a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbA = v60.a("Route{");
        sbA.append(this.f23933c);
        sbA.append('}');
        return sbA.toString();
    }
}
