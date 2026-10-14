package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"NewApi"})
public final class b9 implements r31 {

    public static final class a {
        public static b9 a() {
            if (b()) {
                return new b9();
            }
            return null;
        }

        public static boolean b() {
            int i10 = qq0.f24561c;
            return qq0.a.c() && Build.VERSION.SDK_INT >= 29;
        }
    }

    @Override // com.yandex.mobile.ads.impl.r31
    @SuppressLint({"NewApi"})
    public final void a(SSLSocket sSLSocket, String str, List<? extends nt0> list) throws IOException {
        fd.j0.i(sSLSocket, "sslSocket");
        fd.j0.i(list, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            int i10 = qq0.f24561c;
            Object[] array = qq0.a.a(list).toArray(new String[0]);
            fd.j0.g(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            sSLParameters.setApplicationProtocols((String[]) array);
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e10) {
            throw new IOException("Android internal error", e10);
        }
    }

    @Override // com.yandex.mobile.ads.impl.r31
    public final boolean a() {
        return a.b();
    }

    @Override // com.yandex.mobile.ads.impl.r31
    public final boolean a(SSLSocket sSLSocket) {
        fd.j0.i(sSLSocket, "sslSocket");
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    @Override // com.yandex.mobile.ads.impl.r31
    @SuppressLint({"NewApi"})
    public final String b(SSLSocket sSLSocket) {
        fd.j0.i(sSLSocket, "sslSocket");
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null ? true : fd.j0.d(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }
}
