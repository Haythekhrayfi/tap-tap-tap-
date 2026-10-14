package com.yandex.mobile.ads.impl;

import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes3.dex */
public final class n70 extends qq0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f23244d;

    static {
        String property = System.getProperty("java.specification.version");
        Integer numF = property != null ? ed.p.f(property) : null;
        boolean z10 = false;
        if (numF == null) {
            try {
                SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
                z10 = true;
            } catch (NoSuchMethodException unused) {
            }
        } else if (numF.intValue() >= 9) {
            z10 = true;
        }
        f23244d = z10;
    }

    @Override // com.yandex.mobile.ads.impl.qq0
    public final void a(SSLSocket sSLSocket, String str, List<nt0> list) {
        fd.j0.i(sSLSocket, "sslSocket");
        fd.j0.i(list, "protocols");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        Object[] array = qq0.a.a(list).toArray(new String[0]);
        fd.j0.g(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        sSLParameters.setApplicationProtocols((String[]) array);
        sSLSocket.setSSLParameters(sSLParameters);
    }

    @Override // com.yandex.mobile.ads.impl.qq0
    public final String b(SSLSocket sSLSocket) {
        fd.j0.i(sSLSocket, "sslSocket");
        try {
            String applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null ? true : fd.j0.d(applicationProtocol, "")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
