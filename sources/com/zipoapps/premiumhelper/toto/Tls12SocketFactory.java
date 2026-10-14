package com.zipoapps.premiumhelper.toto;

import fd.j0;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class Tls12SocketFactory extends SSLSocketFactory {
    private final String[] TLS_V12_ONLY;
    private final SSLSocketFactory delegate;

    public Tls12SocketFactory(SSLSocketFactory sSLSocketFactory) {
        j0.i(sSLSocketFactory, "delegate");
        this.delegate = sSLSocketFactory;
        this.TLS_V12_ONLY = new String[]{"TLSv1.2"};
    }

    private final Socket patch(Socket socket) {
        if (socket instanceof SSLSocket) {
            ((SSLSocket) socket).setEnabledProtocols(this.TLS_V12_ONLY);
        }
        return socket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i10) {
        Socket socketCreateSocket = this.delegate.createSocket(str, i10);
        j0.h(socketCreateSocket, "delegate.createSocket(host, port)");
        return patch(socketCreateSocket);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i10, InetAddress inetAddress, int i11) {
        Socket socketCreateSocket = this.delegate.createSocket(str, i10, inetAddress, i11);
        j0.h(socketCreateSocket, "delegate.createSocket(ho…rt, localHost, localPort)");
        return patch(socketCreateSocket);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i10) {
        Socket socketCreateSocket = this.delegate.createSocket(inetAddress, i10);
        j0.h(socketCreateSocket, "delegate.createSocket(host, port)");
        return patch(socketCreateSocket);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11) {
        Socket socketCreateSocket = this.delegate.createSocket(inetAddress, i10, inetAddress2, i11);
        j0.h(socketCreateSocket, "delegate.createSocket(ad… localAddress, localPort)");
        return patch(socketCreateSocket);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i10, boolean z10) throws IOException {
        Socket socketCreateSocket = this.delegate.createSocket(socket, str, i10, z10);
        j0.h(socketCreateSocket, "delegate.createSocket(s, host, port, autoClose)");
        return patch(socketCreateSocket);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        String[] defaultCipherSuites = this.delegate.getDefaultCipherSuites();
        j0.h(defaultCipherSuites, "delegate.defaultCipherSuites");
        return defaultCipherSuites;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        String[] supportedCipherSuites = this.delegate.getSupportedCipherSuites();
        j0.h(supportedCipherSuites, "delegate.supportedCipherSuites");
        return supportedCipherSuites;
    }
}
