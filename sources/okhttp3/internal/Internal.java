package okhttp3.internal;

import com.google.android.gms.common.internal.ImagesContract;
import fd.j0;
import javax.net.ssl.SSLSocket;
import okhttp3.Cache;
import okhttp3.ConnectionSpec;
import okhttp3.Cookie;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes3.dex */
public final class Internal {
    public static final Headers.Builder addHeaderLenient(Headers.Builder builder, String str) {
        j0.i(builder, "builder");
        j0.i(str, "line");
        return builder.addLenient$okhttp(str);
    }

    public static final Headers.Builder addHeaderLenient(Headers.Builder builder, String str, String str2) {
        j0.i(builder, "builder");
        j0.i(str, "name");
        j0.i(str2, "value");
        return builder.addLenient$okhttp(str, str2);
    }

    public static final void applyConnectionSpec(ConnectionSpec connectionSpec, SSLSocket sSLSocket, boolean z10) {
        j0.i(connectionSpec, "connectionSpec");
        j0.i(sSLSocket, "sslSocket");
        connectionSpec.apply$okhttp(sSLSocket, z10);
    }

    public static final Response cacheGet(Cache cache, Request request) {
        j0.i(cache, "cache");
        j0.i(request, "request");
        return cache.get$okhttp(request);
    }

    public static final String cookieToString(Cookie cookie, boolean z10) {
        j0.i(cookie, "cookie");
        return cookie.toString$okhttp(z10);
    }

    public static final Cookie parseCookie(long j10, HttpUrl httpUrl, String str) {
        j0.i(httpUrl, ImagesContract.URL);
        j0.i(str, "setCookie");
        return Cookie.Companion.parse$okhttp(j10, httpUrl, str);
    }
}
