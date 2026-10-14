package com.yandex.mobile.ads.impl;

import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class i80 {
    public static final SSLSocketFactory a(xk1 xk1Var) {
        fd.j0.i(xk1Var, "customCertificatesProvider");
        zl1 zl1VarB = b(xk1Var);
        fd.j0.i(zl1VarB, "trustManager");
        SSLSocketFactory socketFactory = new vy0(zl1VarB).a().getSocketFactory();
        fd.j0.h(socketFactory, "SSLContextBuilder(trustM…er).build().socketFactory");
        return socketFactory;
    }

    public static final zl1 b(xk1 xk1Var) {
        fd.j0.i(xk1Var, "customCertificatesProvider");
        return m9.a(xk1Var);
    }
}
