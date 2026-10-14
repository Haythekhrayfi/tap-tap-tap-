package okhttp3.internal.connection;

import defpackage.a;
import fd.j0;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import okhttp3.ConnectionSpec;

/* JADX INFO: loaded from: classes3.dex */
public final class ConnectionSpecSelector {
    private final List<ConnectionSpec> connectionSpecs;
    private boolean isFallback;
    private boolean isFallbackPossible;
    private int nextModeIndex;

    public ConnectionSpecSelector(List<ConnectionSpec> list) {
        j0.i(list, "connectionSpecs");
        this.connectionSpecs = list;
    }

    private final boolean isFallbackPossible(SSLSocket sSLSocket) {
        int i10 = this.nextModeIndex;
        int size = this.connectionSpecs.size();
        while (i10 < size) {
            int i11 = i10 + 1;
            if (this.connectionSpecs.get(i10).isCompatible(sSLSocket)) {
                return true;
            }
            i10 = i11;
        }
        return false;
    }

    public final ConnectionSpec configureSecureSocket(SSLSocket sSLSocket) throws IOException {
        ConnectionSpec connectionSpec;
        j0.i(sSLSocket, "sslSocket");
        int i10 = this.nextModeIndex;
        int size = this.connectionSpecs.size();
        while (true) {
            if (i10 >= size) {
                connectionSpec = null;
                break;
            }
            int i11 = i10 + 1;
            connectionSpec = this.connectionSpecs.get(i10);
            if (connectionSpec.isCompatible(sSLSocket)) {
                this.nextModeIndex = i11;
                break;
            }
            i10 = i11;
        }
        if (connectionSpec != null) {
            this.isFallbackPossible = isFallbackPossible(sSLSocket);
            connectionSpec.apply$okhttp(sSLSocket, this.isFallback);
            return connectionSpec;
        }
        StringBuilder sbA = a.a("Unable to find acceptable protocols. isFallback=");
        sbA.append(this.isFallback);
        sbA.append(", modes=");
        sbA.append(this.connectionSpecs);
        sbA.append(", supported protocols=");
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        j0.f(enabledProtocols);
        String string = Arrays.toString(enabledProtocols);
        j0.h(string, "toString(this)");
        sbA.append(string);
        throw new UnknownServiceException(sbA.toString());
    }

    public final boolean connectionFailed(IOException iOException) {
        j0.i(iOException, "e");
        this.isFallback = true;
        return (!this.isFallbackPossible || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException) || ((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException) || !(iOException instanceof SSLException)) ? false : true;
    }
}
