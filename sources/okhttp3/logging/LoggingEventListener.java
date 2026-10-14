package okhttp3.logging;

import com.google.android.gms.common.internal.ImagesContract;
import fd.j0;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import vc.g;

/* JADX INFO: loaded from: classes3.dex */
public final class LoggingEventListener extends EventListener {
    private final HttpLoggingInterceptor.Logger logger;
    private long startNs;

    public static class Factory implements EventListener.Factory {
        private final HttpLoggingInterceptor.Logger logger;

        /* JADX WARN: Multi-variable type inference failed */
        public Factory() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public Factory(HttpLoggingInterceptor.Logger logger) {
            j0.i(logger, "logger");
            this.logger = logger;
        }

        public /* synthetic */ Factory(HttpLoggingInterceptor.Logger logger, int i10, g gVar) {
            this((i10 & 1) != 0 ? HttpLoggingInterceptor.Logger.DEFAULT : logger);
        }

        @Override // okhttp3.EventListener.Factory
        public EventListener create(Call call) {
            j0.i(call, "call");
            return new LoggingEventListener(this.logger, null);
        }
    }

    private LoggingEventListener(HttpLoggingInterceptor.Logger logger) {
        this.logger = logger;
    }

    public /* synthetic */ LoggingEventListener(HttpLoggingInterceptor.Logger logger, g gVar) {
        this(logger);
    }

    private final void logWithTime(String str) {
        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.startNs);
        this.logger.log('[' + millis + " ms] " + str);
    }

    @Override // okhttp3.EventListener
    public void cacheConditionalHit(Call call, Response response) {
        j0.i(call, "call");
        j0.i(response, "cachedResponse");
        logWithTime(j0.p("cacheConditionalHit: ", response));
    }

    @Override // okhttp3.EventListener
    public void cacheHit(Call call, Response response) {
        j0.i(call, "call");
        j0.i(response, "response");
        logWithTime(j0.p("cacheHit: ", response));
    }

    @Override // okhttp3.EventListener
    public void cacheMiss(Call call) {
        j0.i(call, "call");
        logWithTime("cacheMiss");
    }

    @Override // okhttp3.EventListener
    public void callEnd(Call call) {
        j0.i(call, "call");
        logWithTime("callEnd");
    }

    @Override // okhttp3.EventListener
    public void callFailed(Call call, IOException iOException) {
        j0.i(call, "call");
        j0.i(iOException, "ioe");
        logWithTime(j0.p("callFailed: ", iOException));
    }

    @Override // okhttp3.EventListener
    public void callStart(Call call) {
        j0.i(call, "call");
        this.startNs = System.nanoTime();
        logWithTime(j0.p("callStart: ", call.request()));
    }

    @Override // okhttp3.EventListener
    public void canceled(Call call) {
        j0.i(call, "call");
        logWithTime("canceled");
    }

    @Override // okhttp3.EventListener
    public void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        j0.i(call, "call");
        j0.i(inetSocketAddress, "inetSocketAddress");
        j0.i(proxy, "proxy");
        logWithTime(j0.p("connectEnd: ", protocol));
    }

    @Override // okhttp3.EventListener
    public void connectFailed(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
        j0.i(call, "call");
        j0.i(inetSocketAddress, "inetSocketAddress");
        j0.i(proxy, "proxy");
        j0.i(iOException, "ioe");
        logWithTime("connectFailed: " + protocol + ' ' + iOException);
    }

    @Override // okhttp3.EventListener
    public void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        j0.i(call, "call");
        j0.i(inetSocketAddress, "inetSocketAddress");
        j0.i(proxy, "proxy");
        logWithTime("connectStart: " + inetSocketAddress + ' ' + proxy);
    }

    @Override // okhttp3.EventListener
    public void connectionAcquired(Call call, Connection connection) {
        j0.i(call, "call");
        j0.i(connection, "connection");
        logWithTime(j0.p("connectionAcquired: ", connection));
    }

    @Override // okhttp3.EventListener
    public void connectionReleased(Call call, Connection connection) {
        j0.i(call, "call");
        j0.i(connection, "connection");
        logWithTime("connectionReleased");
    }

    @Override // okhttp3.EventListener
    public void dnsEnd(Call call, String str, List<? extends InetAddress> list) {
        j0.i(call, "call");
        j0.i(str, "domainName");
        j0.i(list, "inetAddressList");
        logWithTime(j0.p("dnsEnd: ", list));
    }

    @Override // okhttp3.EventListener
    public void dnsStart(Call call, String str) {
        j0.i(call, "call");
        j0.i(str, "domainName");
        logWithTime(j0.p("dnsStart: ", str));
    }

    @Override // okhttp3.EventListener
    public void proxySelectEnd(Call call, HttpUrl httpUrl, List<? extends Proxy> list) {
        j0.i(call, "call");
        j0.i(httpUrl, ImagesContract.URL);
        j0.i(list, "proxies");
        logWithTime(j0.p("proxySelectEnd: ", list));
    }

    @Override // okhttp3.EventListener
    public void proxySelectStart(Call call, HttpUrl httpUrl) {
        j0.i(call, "call");
        j0.i(httpUrl, ImagesContract.URL);
        logWithTime(j0.p("proxySelectStart: ", httpUrl));
    }

    @Override // okhttp3.EventListener
    public void requestBodyEnd(Call call, long j10) {
        j0.i(call, "call");
        logWithTime(j0.p("requestBodyEnd: byteCount=", Long.valueOf(j10)));
    }

    @Override // okhttp3.EventListener
    public void requestBodyStart(Call call) {
        j0.i(call, "call");
        logWithTime("requestBodyStart");
    }

    @Override // okhttp3.EventListener
    public void requestFailed(Call call, IOException iOException) {
        j0.i(call, "call");
        j0.i(iOException, "ioe");
        logWithTime(j0.p("requestFailed: ", iOException));
    }

    @Override // okhttp3.EventListener
    public void requestHeadersEnd(Call call, Request request) {
        j0.i(call, "call");
        j0.i(request, "request");
        logWithTime("requestHeadersEnd");
    }

    @Override // okhttp3.EventListener
    public void requestHeadersStart(Call call) {
        j0.i(call, "call");
        logWithTime("requestHeadersStart");
    }

    @Override // okhttp3.EventListener
    public void responseBodyEnd(Call call, long j10) {
        j0.i(call, "call");
        logWithTime(j0.p("responseBodyEnd: byteCount=", Long.valueOf(j10)));
    }

    @Override // okhttp3.EventListener
    public void responseBodyStart(Call call) {
        j0.i(call, "call");
        logWithTime("responseBodyStart");
    }

    @Override // okhttp3.EventListener
    public void responseFailed(Call call, IOException iOException) {
        j0.i(call, "call");
        j0.i(iOException, "ioe");
        logWithTime(j0.p("responseFailed: ", iOException));
    }

    @Override // okhttp3.EventListener
    public void responseHeadersEnd(Call call, Response response) {
        j0.i(call, "call");
        j0.i(response, "response");
        logWithTime(j0.p("responseHeadersEnd: ", response));
    }

    @Override // okhttp3.EventListener
    public void responseHeadersStart(Call call) {
        j0.i(call, "call");
        logWithTime("responseHeadersStart");
    }

    @Override // okhttp3.EventListener
    public void satisfactionFailure(Call call, Response response) {
        j0.i(call, "call");
        j0.i(response, "response");
        logWithTime(j0.p("satisfactionFailure: ", response));
    }

    @Override // okhttp3.EventListener
    public void secureConnectEnd(Call call, Handshake handshake) {
        j0.i(call, "call");
        logWithTime(j0.p("secureConnectEnd: ", handshake));
    }

    @Override // okhttp3.EventListener
    public void secureConnectStart(Call call) {
        j0.i(call, "call");
        logWithTime("secureConnectStart");
    }
}
