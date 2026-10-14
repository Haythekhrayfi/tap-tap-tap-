package okhttp3.internal.http;

import ed.q;
import fd.j0;
import java.io.IOException;
import java.net.ProtocolException;
import jc.a;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.http2.ConnectionShutdownException;
import qd.e;
import qd.o;
import qd.t;

/* JADX INFO: loaded from: classes3.dex */
public final class CallServerInterceptor implements Interceptor {
    private final boolean forWebSocket;

    public CallServerInterceptor(boolean z10) {
        this.forWebSocket = z10;
    }

    private final boolean shouldIgnoreAndWaitForRealResponse(int i10) {
        if (i10 != 100) {
            if (!(102 <= i10 && i10 < 200)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0094 A[Catch: IOException -> 0x0099, TRY_LEAVE, TryCatch #0 {IOException -> 0x0099, blocks: (B:15:0x0050, B:17:0x0056, B:26:0x008e, B:28:0x0094, B:18:0x0065, B:19:0x0076, B:21:0x0083), top: B:85:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22, types: [okhttp3.Response$Builder] */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, okhttp3.Response$Builder] */
    /* JADX WARN: Type inference failed for: r9v5, types: [okhttp3.Response$Builder] */
    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws Throwable {
        ?? PermitsRequestBody;
        boolean z10;
        ?? responseHeaders;
        ?? r10;
        j0.i(chain, "chain");
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Exchange exchange$okhttp = realInterceptorChain.getExchange$okhttp();
        j0.f(exchange$okhttp);
        Request request$okhttp = realInterceptorChain.getRequest$okhttp();
        RequestBody requestBodyBody = request$okhttp.body();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long lValueOf = null;
        try {
            exchange$okhttp.writeRequestHeaders(request$okhttp);
            PermitsRequestBody = HttpMethod.permitsRequestBody(request$okhttp.method());
            try {
                if (PermitsRequestBody == 0 || requestBodyBody == null) {
                    exchange$okhttp.noRequestBody();
                    PermitsRequestBody = 0;
                    z10 = true;
                } else {
                    if (q.i("100-continue", request$okhttp.header("Expect"), true)) {
                        exchange$okhttp.flushRequest();
                        PermitsRequestBody = exchange$okhttp.readResponseHeaders(true);
                        try {
                            exchange$okhttp.responseHeadersStart();
                            z10 = false;
                            r10 = PermitsRequestBody;
                        } catch (IOException e10) {
                            e = e10;
                            z10 = true;
                            if (!(e instanceof ConnectionShutdownException)) {
                                throw e;
                            }
                            if (!exchange$okhttp.getHasFailure$okhttp()) {
                                responseHeaders = PermitsRequestBody;
                                throw e;
                            }
                        }
                    } else {
                        r10 = 0;
                        z10 = true;
                    }
                    if (r10 != 0) {
                        exchange$okhttp.noRequestBody();
                        if (!exchange$okhttp.getConnection$okhttp().isMultiplexed$okhttp()) {
                            PermitsRequestBody = r10;
                            exchange$okhttp.noNewExchangesOnConnection();
                            PermitsRequestBody = r10;
                        }
                    } else if (requestBodyBody.isDuplex()) {
                        exchange$okhttp.flushRequest();
                        requestBodyBody.writeTo(o.b(exchange$okhttp.createRequestBody(request$okhttp, true)));
                    } else {
                        e eVarB = o.b(exchange$okhttp.createRequestBody(request$okhttp, false));
                        requestBodyBody.writeTo(eVarB);
                        ((t) eVarB).close();
                    }
                }
                if (requestBodyBody != null) {
                    PermitsRequestBody = r10;
                    if (!requestBodyBody.isDuplex()) {
                        PermitsRequestBody = r10;
                        PermitsRequestBody = r10;
                        PermitsRequestBody = r10;
                        exchange$okhttp.finishRequest();
                    }
                } else {
                    PermitsRequestBody = r10;
                    PermitsRequestBody = r10;
                    PermitsRequestBody = r10;
                    exchange$okhttp.finishRequest();
                }
                PermitsRequestBody = r10;
                e = null;
                responseHeaders = PermitsRequestBody;
            } catch (IOException e11) {
                e = e11;
                if (!(e instanceof ConnectionShutdownException)) {
                    throw e;
                }
                if (!exchange$okhttp.getHasFailure$okhttp()) {
                    responseHeaders = PermitsRequestBody;
                    throw e;
                }
            }
        } catch (IOException e12) {
            e = e12;
            PermitsRequestBody = 0;
        }
        if (responseHeaders == 0) {
            try {
                responseHeaders = exchange$okhttp.readResponseHeaders(false);
                j0.f(responseHeaders);
                if (z10) {
                    exchange$okhttp.responseHeadersStart();
                    z10 = false;
                }
            } catch (IOException e13) {
                if (e == null) {
                    throw e13;
                }
                a.a(e, e13);
                throw e;
            }
        }
        Response responseBuild = responseHeaders.request(request$okhttp).handshake(exchange$okhttp.getConnection$okhttp().handshake()).sentRequestAtMillis(jCurrentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
        int iCode = responseBuild.code();
        if (shouldIgnoreAndWaitForRealResponse(iCode)) {
            Response.Builder responseHeaders2 = exchange$okhttp.readResponseHeaders(false);
            j0.f(responseHeaders2);
            if (z10) {
                exchange$okhttp.responseHeadersStart();
            }
            responseBuild = responseHeaders2.request(request$okhttp).handshake(exchange$okhttp.getConnection$okhttp().handshake()).sentRequestAtMillis(jCurrentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
            iCode = responseBuild.code();
        }
        exchange$okhttp.responseHeadersEnd(responseBuild);
        Response responseBuild2 = ((this.forWebSocket && iCode == 101) ? responseBuild.newBuilder().body(Util.EMPTY_RESPONSE) : responseBuild.newBuilder().body(exchange$okhttp.openResponseBody(responseBuild))).build();
        if (q.i("close", responseBuild2.request().header("Connection"), true) || q.i("close", Response.header$default(responseBuild2, "Connection", null, 2, null), true)) {
            exchange$okhttp.noNewExchangesOnConnection();
        }
        if (iCode == 204 || iCode == 205) {
            ResponseBody responseBodyBody = responseBuild2.body();
            if ((responseBodyBody == null ? -1L : responseBodyBody.contentLength()) > 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("HTTP ");
                sb2.append(iCode);
                sb2.append(" had non-zero Content-Length: ");
                ResponseBody responseBodyBody2 = responseBuild2.body();
                if (responseBodyBody2 != null) {
                    lValueOf = Long.valueOf(responseBodyBody2.contentLength());
                }
                sb2.append(lValueOf);
                throw new ProtocolException(sb2.toString());
            }
        }
        return responseBuild2;
    }
}
