package ch.qos.logback.core.net.ssl;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes.dex */
public class ConfigurableSSLSocketFactory extends SocketFactory {
    private final SSLSocketFactory delegate;
    private final SSLParametersConfiguration parameters;

    public ConfigurableSSLSocketFactory(SSLParametersConfiguration sSLParametersConfiguration, SSLSocketFactory sSLSocketFactory) {
        this.parameters = sSLParametersConfiguration;
        this.delegate = sSLSocketFactory;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i10) throws IOException {
        SSLSocket sSLSocket = (SSLSocket) this.delegate.createSocket(str, i10);
        this.parameters.configure(new SSLConfigurableSocket(sSLSocket));
        return sSLSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i10, InetAddress inetAddress, int i11) throws IOException {
        SSLSocket sSLSocket = (SSLSocket) this.delegate.createSocket(str, i10, inetAddress, i11);
        this.parameters.configure(new SSLConfigurableSocket(sSLSocket));
        return sSLSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i10) throws IOException {
        SSLSocket sSLSocket = (SSLSocket) this.delegate.createSocket(inetAddress, i10);
        this.parameters.configure(new SSLConfigurableSocket(sSLSocket));
        return sSLSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11) throws IOException {
        SSLSocket sSLSocket = (SSLSocket) this.delegate.createSocket(inetAddress, i10, inetAddress2, i11);
        this.parameters.configure(new SSLConfigurableSocket(sSLSocket));
        return sSLSocket;
    }
}
