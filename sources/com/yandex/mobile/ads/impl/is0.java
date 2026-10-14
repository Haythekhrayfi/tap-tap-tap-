package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class is0 extends SSLSocketFactory {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f21813b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SSLSocketFactory f21814a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(int i10) {
            this();
        }

        public static is0 a() {
            try {
                SSLContext sSLContext = SSLContext.getInstance("TLSv1");
                try {
                    sSLContext.init(null, null, null);
                } catch (KeyManagementException e10) {
                    x60.c("Failed to init SSLContext: %s", e10.getMessage());
                }
                SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
                fd.j0.h(socketFactory, "context.socketFactory");
                return new is0(socketFactory);
            } catch (NoSuchAlgorithmException e11) {
                x60.c("Failed to create SSLContext for algorithm %s: %s", "TLSv1", e11.getMessage());
                return null;
            }
        }

        public static final String[] a(SSLSocketFactory sSLSocketFactory) {
            int i10 = is0.f21813b;
            String[] defaultCipherSuites = sSLSocketFactory.getDefaultCipherSuites();
            ArrayList arrayList = new ArrayList(Arrays.asList(Arrays.copyOf(defaultCipherSuites, defaultCipherSuites.length)));
            arrayList.remove("TLS_RSA_WITH_AES_128_CBC_SHA");
            arrayList.add(0, "TLS_RSA_WITH_AES_128_CBC_SHA");
            Object[] array = arrayList.toArray(new String[0]);
            fd.j0.g(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            return (String[]) array;
        }

        public static final String[] b(SSLSocketFactory sSLSocketFactory) {
            int i10 = is0.f21813b;
            String[] supportedCipherSuites = sSLSocketFactory.getSupportedCipherSuites();
            ArrayList arrayList = new ArrayList(Arrays.asList(Arrays.copyOf(supportedCipherSuites, supportedCipherSuites.length)));
            arrayList.remove("TLS_RSA_WITH_AES_128_CBC_SHA");
            arrayList.add(0, "TLS_RSA_WITH_AES_128_CBC_SHA");
            Object[] array = arrayList.toArray(new String[0]);
            fd.j0.g(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            return (String[]) array;
        }
    }

    static {
        new a(0);
    }

    public is0(SSLSocketFactory sSLSocketFactory) {
        fd.j0.i(sSLSocketFactory, "delegate");
        this.f21814a = sSLSocketFactory;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i10) throws IOException {
        fd.j0.i(str, "arg0");
        Socket socketCreateSocket = this.f21814a.createSocket(str, i10);
        String[] strArrA = a.a(this.f21814a);
        fd.j0.g(socketCreateSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
        ((SSLSocket) socketCreateSocket).setEnabledCipherSuites(strArrA);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i10, InetAddress inetAddress, int i11) throws IOException {
        fd.j0.i(str, "arg0");
        fd.j0.i(inetAddress, "arg2");
        Socket socketCreateSocket = this.f21814a.createSocket(str, i10, inetAddress, i11);
        String[] strArrA = a.a(this.f21814a);
        fd.j0.g(socketCreateSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
        ((SSLSocket) socketCreateSocket).setEnabledCipherSuites(strArrA);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i10) throws IOException {
        fd.j0.i(inetAddress, "arg0");
        Socket socketCreateSocket = this.f21814a.createSocket(inetAddress, i10);
        String[] strArrA = a.a(this.f21814a);
        fd.j0.g(socketCreateSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
        ((SSLSocket) socketCreateSocket).setEnabledCipherSuites(strArrA);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11) throws IOException {
        fd.j0.i(inetAddress, "arg0");
        fd.j0.i(inetAddress2, "arg2");
        Socket socketCreateSocket = this.f21814a.createSocket(inetAddress, i10, inetAddress2, i11);
        String[] strArrA = a.a(this.f21814a);
        fd.j0.g(socketCreateSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
        ((SSLSocket) socketCreateSocket).setEnabledCipherSuites(strArrA);
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i10, boolean z10) throws IOException {
        fd.j0.i(socket, "arg0");
        fd.j0.i(str, "arg1");
        Socket socketCreateSocket = this.f21814a.createSocket(socket, str, i10, z10);
        String[] strArrA = a.a(this.f21814a);
        fd.j0.g(socketCreateSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
        ((SSLSocket) socketCreateSocket).setEnabledCipherSuites(strArrA);
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return a.a(this.f21814a);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return a.b(this.f21814a);
    }
}
