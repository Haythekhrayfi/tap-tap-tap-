package com.yandex.mobile.ads.impl;

import ch.qos.logback.core.CoreConstants;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes3.dex */
public final class h9 implements uo.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f21340a = "com.google.android.gms.org.conscrypt";

    @Override // com.yandex.mobile.ads.impl.uo.a
    public final boolean a(SSLSocket sSLSocket) {
        fd.j0.i(sSLSocket, "sslSocket");
        return ed.q.u(sSLSocket.getClass().getName(), s.a.a(new StringBuilder(), this.f21340a, CoreConstants.DOT), false, 2);
    }

    @Override // com.yandex.mobile.ads.impl.uo.a
    public final i9 b(SSLSocket sSLSocket) {
        fd.j0.i(sSLSocket, "sslSocket");
        int i10 = i9.f21637g;
        return i9.a.a(sSLSocket.getClass());
    }
}
