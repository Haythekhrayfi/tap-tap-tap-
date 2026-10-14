package okhttp3.internal.http;

import com.google.android.gms.common.internal.ImagesContract;
import fd.j0;
import java.net.Proxy;
import okhttp3.HttpUrl;
import okhttp3.Request;

/* JADX INFO: loaded from: classes3.dex */
public final class RequestLine {
    public static final RequestLine INSTANCE = new RequestLine();

    private RequestLine() {
    }

    private final boolean includeAuthorityInRequestLine(Request request, Proxy.Type type) {
        return !request.isHttps() && type == Proxy.Type.HTTP;
    }

    public final String get(Request request, Proxy.Type type) {
        j0.i(request, "request");
        j0.i(type, "proxyType");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(request.method());
        sb2.append(' ');
        RequestLine requestLine = INSTANCE;
        boolean zIncludeAuthorityInRequestLine = requestLine.includeAuthorityInRequestLine(request, type);
        HttpUrl httpUrlUrl = request.url();
        if (zIncludeAuthorityInRequestLine) {
            sb2.append(httpUrlUrl);
        } else {
            sb2.append(requestLine.requestPath(httpUrlUrl));
        }
        sb2.append(" HTTP/1.1");
        String string = sb2.toString();
        j0.h(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String requestPath(HttpUrl httpUrl) {
        j0.i(httpUrl, ImagesContract.URL);
        String strEncodedPath = httpUrl.encodedPath();
        String strEncodedQuery = httpUrl.encodedQuery();
        if (strEncodedQuery == null) {
            return strEncodedPath;
        }
        return strEncodedPath + '?' + ((Object) strEncodedQuery);
    }
}
