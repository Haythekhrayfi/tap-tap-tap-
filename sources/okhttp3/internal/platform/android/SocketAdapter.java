package okhttp3.internal.platform.android;

import fd.j0;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;

/* JADX INFO: loaded from: classes3.dex */
public interface SocketAdapter {

    public static final class DefaultImpls {
        public static boolean matchesSocketFactory(SocketAdapter socketAdapter, SSLSocketFactory sSLSocketFactory) {
            j0.i(socketAdapter, "this");
            j0.i(sSLSocketFactory, "sslSocketFactory");
            return false;
        }

        public static X509TrustManager trustManager(SocketAdapter socketAdapter, SSLSocketFactory sSLSocketFactory) {
            j0.i(socketAdapter, "this");
            j0.i(sSLSocketFactory, "sslSocketFactory");
            return null;
        }
    }

    void configureTlsExtensions(SSLSocket sSLSocket, String str, List<? extends Protocol> list);

    String getSelectedProtocol(SSLSocket sSLSocket);

    boolean isSupported();

    boolean matchesSocket(SSLSocket sSLSocket);

    boolean matchesSocketFactory(SSLSocketFactory sSLSocketFactory);

    X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory);
}
