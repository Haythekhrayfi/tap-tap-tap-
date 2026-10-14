package okhttp3.internal.http;

import fd.j0;

/* JADX INFO: loaded from: classes3.dex */
public final class HttpMethod {
    public static final HttpMethod INSTANCE = new HttpMethod();

    private HttpMethod() {
    }

    public static final boolean permitsRequestBody(String str) {
        j0.i(str, "method");
        return (j0.d(str, "GET") || j0.d(str, "HEAD")) ? false : true;
    }

    public static final boolean requiresRequestBody(String str) {
        j0.i(str, "method");
        return j0.d(str, "POST") || j0.d(str, "PUT") || j0.d(str, "PATCH") || j0.d(str, "PROPPATCH") || j0.d(str, "REPORT");
    }

    public final boolean invalidatesCache(String str) {
        j0.i(str, "method");
        return j0.d(str, "POST") || j0.d(str, "PATCH") || j0.d(str, "PUT") || j0.d(str, "DELETE") || j0.d(str, "MOVE");
    }

    public final boolean redirectsToGet(String str) {
        j0.i(str, "method");
        return !j0.d(str, "PROPFIND");
    }

    public final boolean redirectsWithBody(String str) {
        j0.i(str, "method");
        return j0.d(str, "PROPFIND");
    }
}
