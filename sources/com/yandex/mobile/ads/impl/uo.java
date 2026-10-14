package com.yandex.mobile.ads.impl;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes3.dex */
public final class uo implements r31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f25715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private r31 f25716b;

    public interface a {
        boolean a(SSLSocket sSLSocket);

        i9 b(SSLSocket sSLSocket);
    }

    public uo(h9 h9Var) {
        fd.j0.i(h9Var, "socketAdapterFactory");
        this.f25715a = h9Var;
    }

    @Override // com.yandex.mobile.ads.impl.r31
    public final void a(SSLSocket sSLSocket, String str, List<? extends nt0> list) {
        r31 r31Var;
        fd.j0.i(sSLSocket, "sslSocket");
        fd.j0.i(list, "protocols");
        synchronized (this) {
            if (this.f25716b == null && this.f25715a.a(sSLSocket)) {
                this.f25716b = this.f25715a.b(sSLSocket);
            }
            r31Var = this.f25716b;
        }
        if (r31Var != null) {
            r31Var.a(sSLSocket, str, list);
        }
    }

    @Override // com.yandex.mobile.ads.impl.r31
    public final boolean a() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.r31
    public final boolean a(SSLSocket sSLSocket) {
        fd.j0.i(sSLSocket, "sslSocket");
        return this.f25715a.a(sSLSocket);
    }

    @Override // com.yandex.mobile.ads.impl.r31
    public final String b(SSLSocket sSLSocket) {
        r31 r31Var;
        fd.j0.i(sSLSocket, "sslSocket");
        synchronized (this) {
            if (this.f25716b == null && this.f25715a.a(sSLSocket)) {
                this.f25716b = this.f25715a.b(sSLSocket);
            }
            r31Var = this.f25716b;
        }
        if (r31Var != null) {
            return r31Var.b(sSLSocket);
        }
        return null;
    }
}
