package okhttp3.internal.cache;

import ed.q;
import fd.j0;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.RealResponseBody;
import qd.a0;
import qd.b0;
import qd.c;
import qd.e;
import qd.f;
import qd.o;
import qd.y;
import vc.g;

/* JADX INFO: loaded from: classes3.dex */
public final class CacheInterceptor implements Interceptor {
    public static final Companion Companion = new Companion(null);
    private final Cache cache;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Headers combine(Headers headers, Headers headers2) {
            Headers.Builder builder = new Headers.Builder();
            int size = headers.size();
            int i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                int i12 = i11 + 1;
                String strName = headers.name(i11);
                String strValue = headers.value(i11);
                if ((!q.i("Warning", strName, true) || !q.u(strValue, "1", false, 2)) && (isContentSpecificHeader(strName) || !isEndToEnd(strName) || headers2.get(strName) == null)) {
                    builder.addLenient$okhttp(strName, strValue);
                }
                i11 = i12;
            }
            int size2 = headers2.size();
            while (i10 < size2) {
                int i13 = i10 + 1;
                String strName2 = headers2.name(i10);
                if (!isContentSpecificHeader(strName2) && isEndToEnd(strName2)) {
                    builder.addLenient$okhttp(strName2, headers2.value(i10));
                }
                i10 = i13;
            }
            return builder.build();
        }

        private final boolean isContentSpecificHeader(String str) {
            return q.i("Content-Length", str, true) || q.i("Content-Encoding", str, true) || q.i("Content-Type", str, true);
        }

        private final boolean isEndToEnd(String str) {
            return (q.i("Connection", str, true) || q.i("Keep-Alive", str, true) || q.i("Proxy-Authenticate", str, true) || q.i("Proxy-Authorization", str, true) || q.i("TE", str, true) || q.i("Trailers", str, true) || q.i("Transfer-Encoding", str, true) || q.i("Upgrade", str, true)) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Response stripBody(Response response) {
            return (response == null ? null : response.body()) != null ? response.newBuilder().body(null).build() : response;
        }
    }

    public CacheInterceptor(Cache cache) {
        this.cache = cache;
    }

    private final Response cacheWritingResponse(final CacheRequest cacheRequest, Response response) throws IOException {
        if (cacheRequest == null) {
            return response;
        }
        y yVarBody = cacheRequest.body();
        ResponseBody responseBodyBody = response.body();
        j0.f(responseBodyBody);
        final f fVarSource = responseBodyBody.source();
        final e eVarB = o.b(yVarBody);
        a0 a0Var = new a0() { // from class: okhttp3.internal.cache.CacheInterceptor$cacheWritingResponse$cacheWritingSource$1
            private boolean cacheRequestClosed;

            @Override // qd.a0, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                if (!this.cacheRequestClosed && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                    this.cacheRequestClosed = true;
                    cacheRequest.abort();
                }
                fVarSource.close();
            }

            @Override // qd.a0
            public long read(c cVar, long j10) throws IOException {
                j0.i(cVar, "sink");
                try {
                    long j11 = fVarSource.read(cVar, j10);
                    if (j11 != -1) {
                        cVar.e(eVarB.r(), cVar.f34879d - j11, j11);
                        eVarB.A();
                        return j11;
                    }
                    if (!this.cacheRequestClosed) {
                        this.cacheRequestClosed = true;
                        eVarB.close();
                    }
                    return -1L;
                } catch (IOException e10) {
                    if (!this.cacheRequestClosed) {
                        this.cacheRequestClosed = true;
                        cacheRequest.abort();
                    }
                    throw e10;
                }
            }

            @Override // qd.a0
            public b0 timeout() {
                return fVarSource.timeout();
            }
        };
        return response.newBuilder().body(new RealResponseBody(Response.header$default(response, "Content-Type", null, 2, null), response.body().contentLength(), o.c(a0Var))).build();
    }

    public final Cache getCache$okhttp() {
        return this.cache;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        ResponseBody responseBodyBody;
        ResponseBody responseBodyBody2;
        ResponseBody responseBodyBody3;
        j0.i(chain, "chain");
        Call call = chain.call();
        Cache cache = this.cache;
        Response response = cache == null ? null : cache.get$okhttp(chain.request());
        CacheStrategy cacheStrategyCompute = new CacheStrategy.Factory(System.currentTimeMillis(), chain.request(), response).compute();
        Request networkRequest = cacheStrategyCompute.getNetworkRequest();
        Response cacheResponse = cacheStrategyCompute.getCacheResponse();
        Cache cache2 = this.cache;
        if (cache2 != null) {
            cache2.trackResponse$okhttp(cacheStrategyCompute);
        }
        RealCall realCall = call instanceof RealCall ? (RealCall) call : null;
        EventListener eventListener$okhttp = realCall != null ? realCall.getEventListener$okhttp() : null;
        if (eventListener$okhttp == null) {
            eventListener$okhttp = EventListener.NONE;
        }
        if (response != null && cacheResponse == null && (responseBodyBody3 = response.body()) != null) {
            Util.closeQuietly(responseBodyBody3);
        }
        if (networkRequest == null && cacheResponse == null) {
            Response responseBuild = new Response.Builder().request(chain.request()).protocol(Protocol.HTTP_1_1).code(504).message("Unsatisfiable Request (only-if-cached)").body(Util.EMPTY_RESPONSE).sentRequestAtMillis(-1L).receivedResponseAtMillis(System.currentTimeMillis()).build();
            eventListener$okhttp.satisfactionFailure(call, responseBuild);
            return responseBuild;
        }
        if (networkRequest == null) {
            j0.f(cacheResponse);
            Response responseBuild2 = cacheResponse.newBuilder().cacheResponse(Companion.stripBody(cacheResponse)).build();
            eventListener$okhttp.cacheHit(call, responseBuild2);
            return responseBuild2;
        }
        if (cacheResponse != null) {
            eventListener$okhttp.cacheConditionalHit(call, cacheResponse);
        } else if (this.cache != null) {
            eventListener$okhttp.cacheMiss(call);
        }
        try {
            Response responseProceed = chain.proceed(networkRequest);
            if (responseProceed == null && response != null && (responseBodyBody2 = response.body()) != null) {
                Util.closeQuietly(responseBodyBody2);
            }
            if (cacheResponse != null) {
                boolean z10 = false;
                if (responseProceed != null && responseProceed.code() == 304) {
                    z10 = true;
                }
                if (z10) {
                    Response.Builder builderNewBuilder = cacheResponse.newBuilder();
                    Companion companion = Companion;
                    Response responseBuild3 = builderNewBuilder.headers(companion.combine(cacheResponse.headers(), responseProceed.headers())).sentRequestAtMillis(responseProceed.sentRequestAtMillis()).receivedResponseAtMillis(responseProceed.receivedResponseAtMillis()).cacheResponse(companion.stripBody(cacheResponse)).networkResponse(companion.stripBody(responseProceed)).build();
                    ResponseBody responseBodyBody4 = responseProceed.body();
                    j0.f(responseBodyBody4);
                    responseBodyBody4.close();
                    Cache cache3 = this.cache;
                    j0.f(cache3);
                    cache3.trackConditionalCacheHit$okhttp();
                    this.cache.update$okhttp(cacheResponse, responseBuild3);
                    eventListener$okhttp.cacheHit(call, responseBuild3);
                    return responseBuild3;
                }
                ResponseBody responseBodyBody5 = cacheResponse.body();
                if (responseBodyBody5 != null) {
                    Util.closeQuietly(responseBodyBody5);
                }
            }
            j0.f(responseProceed);
            Response.Builder builderNewBuilder2 = responseProceed.newBuilder();
            Companion companion2 = Companion;
            Response responseBuild4 = builderNewBuilder2.cacheResponse(companion2.stripBody(cacheResponse)).networkResponse(companion2.stripBody(responseProceed)).build();
            if (this.cache != null) {
                if (HttpHeaders.promisesBody(responseBuild4) && CacheStrategy.Companion.isCacheable(responseBuild4, networkRequest)) {
                    Response responseCacheWritingResponse = cacheWritingResponse(this.cache.put$okhttp(responseBuild4), responseBuild4);
                    if (cacheResponse != null) {
                        eventListener$okhttp.cacheMiss(call);
                    }
                    return responseCacheWritingResponse;
                }
                if (HttpMethod.INSTANCE.invalidatesCache(networkRequest.method())) {
                    try {
                        this.cache.remove$okhttp(networkRequest);
                    } catch (IOException unused) {
                    }
                }
            }
            return responseBuild4;
        } catch (Throwable th) {
            if (response != null && (responseBodyBody = response.body()) != null) {
                Util.closeQuietly(responseBodyBody);
            }
            throw th;
        }
    }
}
