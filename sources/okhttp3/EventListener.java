package okhttp3;

import com.google.android.gms.common.internal.ImagesContract;
import fd.j0;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import vc.g;

/* JADX INFO: loaded from: classes3.dex */
public abstract class EventListener {
    public static final Companion Companion = new Companion(null);
    public static final EventListener NONE = new EventListener() { // from class: okhttp3.EventListener$Companion$NONE$1
    };

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public interface Factory {
        EventListener create(Call call);
    }

    public void cacheConditionalHit(Call call, Response response) {
        j0.i(call, "call");
        j0.i(response, "cachedResponse");
    }

    public void cacheHit(Call call, Response response) {
        j0.i(call, "call");
        j0.i(response, "response");
    }

    public void cacheMiss(Call call) {
        j0.i(call, "call");
    }

    public void callEnd(Call call) {
        j0.i(call, "call");
    }

    public void callFailed(Call call, IOException iOException) {
        j0.i(call, "call");
        j0.i(iOException, "ioe");
    }

    public void callStart(Call call) {
        j0.i(call, "call");
    }

    public void canceled(Call call) {
        j0.i(call, "call");
    }

    public void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        j0.i(call, "call");
        j0.i(inetSocketAddress, "inetSocketAddress");
        j0.i(proxy, "proxy");
    }

    public void connectFailed(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
        j0.i(call, "call");
        j0.i(inetSocketAddress, "inetSocketAddress");
        j0.i(proxy, "proxy");
        j0.i(iOException, "ioe");
    }

    public void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        j0.i(call, "call");
        j0.i(inetSocketAddress, "inetSocketAddress");
        j0.i(proxy, "proxy");
    }

    public void connectionAcquired(Call call, Connection connection) {
        j0.i(call, "call");
        j0.i(connection, "connection");
    }

    public void connectionReleased(Call call, Connection connection) {
        j0.i(call, "call");
        j0.i(connection, "connection");
    }

    public void dnsEnd(Call call, String str, List<InetAddress> list) {
        j0.i(call, "call");
        j0.i(str, "domainName");
        j0.i(list, "inetAddressList");
    }

    public void dnsStart(Call call, String str) {
        j0.i(call, "call");
        j0.i(str, "domainName");
    }

    public void proxySelectEnd(Call call, HttpUrl httpUrl, List<Proxy> list) {
        j0.i(call, "call");
        j0.i(httpUrl, ImagesContract.URL);
        j0.i(list, "proxies");
    }

    public void proxySelectStart(Call call, HttpUrl httpUrl) {
        j0.i(call, "call");
        j0.i(httpUrl, ImagesContract.URL);
    }

    public void requestBodyEnd(Call call, long j10) {
        j0.i(call, "call");
    }

    public void requestBodyStart(Call call) {
        j0.i(call, "call");
    }

    public void requestFailed(Call call, IOException iOException) {
        j0.i(call, "call");
        j0.i(iOException, "ioe");
    }

    public void requestHeadersEnd(Call call, Request request) {
        j0.i(call, "call");
        j0.i(request, "request");
    }

    public void requestHeadersStart(Call call) {
        j0.i(call, "call");
    }

    public void responseBodyEnd(Call call, long j10) {
        j0.i(call, "call");
    }

    public void responseBodyStart(Call call) {
        j0.i(call, "call");
    }

    public void responseFailed(Call call, IOException iOException) {
        j0.i(call, "call");
        j0.i(iOException, "ioe");
    }

    public void responseHeadersEnd(Call call, Response response) {
        j0.i(call, "call");
        j0.i(response, "response");
    }

    public void responseHeadersStart(Call call) {
        j0.i(call, "call");
    }

    public void satisfactionFailure(Call call, Response response) {
        j0.i(call, "call");
        j0.i(response, "response");
    }

    public void secureConnectEnd(Call call, Handshake handshake) {
        j0.i(call, "call");
    }

    public void secureConnectStart(Call call) {
        j0.i(call, "call");
    }
}
