package okhttp3;

import androidx.activity.j;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.ImagesContract;
import defpackage.a;
import ed.q;
import fd.j0;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jc.h;
import kc.f0;
import kc.l;
import l1.c;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpMethod;

/* JADX INFO: loaded from: classes3.dex */
public final class Request {
    private final RequestBody body;
    private final Headers headers;
    private CacheControl lazyCacheControl;
    private final String method;
    private final Map<Class<?>, Object> tags;
    private final HttpUrl url;

    public static class Builder {
        private RequestBody body;
        private Headers.Builder headers;
        private String method;
        private Map<Class<?>, Object> tags;
        private HttpUrl url;

        public Builder() {
            this.tags = new LinkedHashMap();
            this.method = "GET";
            this.headers = new Headers.Builder();
        }

        public Builder(Request request) {
            j0.i(request, "request");
            this.tags = new LinkedHashMap();
            this.url = request.url();
            this.method = request.method();
            this.body = request.body();
            this.tags = request.getTags$okhttp().isEmpty() ? new LinkedHashMap<>() : f0.l(request.getTags$okhttp());
            this.headers = request.headers().newBuilder();
        }

        public static /* synthetic */ Builder delete$default(Builder builder, RequestBody requestBody, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
            }
            if ((i10 & 1) != 0) {
                requestBody = Util.EMPTY_REQUEST;
            }
            return builder.delete(requestBody);
        }

        public Builder addHeader(String str, String str2) {
            j0.i(str, "name");
            j0.i(str2, "value");
            getHeaders$okhttp().add(str, str2);
            return this;
        }

        public Request build() {
            HttpUrl httpUrl = this.url;
            if (httpUrl != null) {
                return new Request(httpUrl, this.method, this.headers.build(), this.body, Util.toImmutableMap(this.tags));
            }
            throw new IllegalStateException("url == null".toString());
        }

        public Builder cacheControl(CacheControl cacheControl) {
            j0.i(cacheControl, "cacheControl");
            String string = cacheControl.toString();
            return string.length() == 0 ? removeHeader("Cache-Control") : header("Cache-Control", string);
        }

        public final Builder delete() {
            return delete$default(this, null, 1, null);
        }

        public Builder delete(RequestBody requestBody) {
            return method("DELETE", requestBody);
        }

        public Builder get() {
            return method("GET", null);
        }

        public final RequestBody getBody$okhttp() {
            return this.body;
        }

        public final Headers.Builder getHeaders$okhttp() {
            return this.headers;
        }

        public final String getMethod$okhttp() {
            return this.method;
        }

        public final Map<Class<?>, Object> getTags$okhttp() {
            return this.tags;
        }

        public final HttpUrl getUrl$okhttp() {
            return this.url;
        }

        public Builder head() {
            return method("HEAD", null);
        }

        public Builder header(String str, String str2) {
            j0.i(str, "name");
            j0.i(str2, "value");
            getHeaders$okhttp().set(str, str2);
            return this;
        }

        public Builder headers(Headers headers) {
            j0.i(headers, "headers");
            setHeaders$okhttp(headers.newBuilder());
            return this;
        }

        public Builder method(String str, RequestBody requestBody) {
            j0.i(str, "method");
            if (!(str.length() > 0)) {
                throw new IllegalArgumentException("method.isEmpty() == true".toString());
            }
            if (requestBody == null) {
                if (!(true ^ HttpMethod.requiresRequestBody(str))) {
                    throw new IllegalArgumentException(j.a("method ", str, " must have a request body.").toString());
                }
            } else if (!HttpMethod.permitsRequestBody(str)) {
                throw new IllegalArgumentException(j.a("method ", str, " must not have a request body.").toString());
            }
            setMethod$okhttp(str);
            setBody$okhttp(requestBody);
            return this;
        }

        public Builder patch(RequestBody requestBody) {
            j0.i(requestBody, "body");
            return method("PATCH", requestBody);
        }

        public Builder post(RequestBody requestBody) {
            j0.i(requestBody, "body");
            return method("POST", requestBody);
        }

        public Builder put(RequestBody requestBody) {
            j0.i(requestBody, "body");
            return method("PUT", requestBody);
        }

        public Builder removeHeader(String str) {
            j0.i(str, "name");
            getHeaders$okhttp().removeAll(str);
            return this;
        }

        public final void setBody$okhttp(RequestBody requestBody) {
            this.body = requestBody;
        }

        public final void setHeaders$okhttp(Headers.Builder builder) {
            j0.i(builder, "<set-?>");
            this.headers = builder;
        }

        public final void setMethod$okhttp(String str) {
            j0.i(str, "<set-?>");
            this.method = str;
        }

        public final void setTags$okhttp(Map<Class<?>, Object> map) {
            j0.i(map, "<set-?>");
            this.tags = map;
        }

        public final void setUrl$okhttp(HttpUrl httpUrl) {
            this.url = httpUrl;
        }

        public <T> Builder tag(Class<? super T> cls, T t10) {
            j0.i(cls, "type");
            if (t10 == null) {
                getTags$okhttp().remove(cls);
            } else {
                if (getTags$okhttp().isEmpty()) {
                    setTags$okhttp(new LinkedHashMap());
                }
                Map<Class<?>, Object> tags$okhttp = getTags$okhttp();
                T tCast = cls.cast(t10);
                j0.f(tCast);
                tags$okhttp.put(cls, tCast);
            }
            return this;
        }

        public Builder tag(Object obj) {
            return tag(Object.class, obj);
        }

        public Builder url(String str) {
            String strSubstring;
            String str2;
            j0.i(str, ImagesContract.URL);
            if (!q.s(str, "ws:", true)) {
                if (q.s(str, "wss:", true)) {
                    strSubstring = str.substring(4);
                    j0.h(strSubstring, "this as java.lang.String).substring(startIndex)");
                    str2 = "https:";
                }
                return url(HttpUrl.Companion.get(str));
            }
            strSubstring = str.substring(3);
            j0.h(strSubstring, "this as java.lang.String).substring(startIndex)");
            str2 = "http:";
            str = j0.p(str2, strSubstring);
            return url(HttpUrl.Companion.get(str));
        }

        public Builder url(URL url) {
            j0.i(url, ImagesContract.URL);
            HttpUrl.Companion companion = HttpUrl.Companion;
            String string = url.toString();
            j0.h(string, "url.toString()");
            return url(companion.get(string));
        }

        public Builder url(HttpUrl httpUrl) {
            j0.i(httpUrl, ImagesContract.URL);
            setUrl$okhttp(httpUrl);
            return this;
        }
    }

    public Request(HttpUrl httpUrl, String str, Headers headers, RequestBody requestBody, Map<Class<?>, ? extends Object> map) {
        j0.i(httpUrl, ImagesContract.URL);
        j0.i(str, "method");
        j0.i(headers, "headers");
        j0.i(map, "tags");
        this.url = httpUrl;
        this.method = str;
        this.headers = headers;
        this.body = requestBody;
        this.tags = map;
    }

    /* JADX INFO: renamed from: -deprecated_body, reason: not valid java name */
    public final RequestBody m116deprecated_body() {
        return this.body;
    }

    /* JADX INFO: renamed from: -deprecated_cacheControl, reason: not valid java name */
    public final CacheControl m117deprecated_cacheControl() {
        return cacheControl();
    }

    /* JADX INFO: renamed from: -deprecated_headers, reason: not valid java name */
    public final Headers m118deprecated_headers() {
        return this.headers;
    }

    /* JADX INFO: renamed from: -deprecated_method, reason: not valid java name */
    public final String m119deprecated_method() {
        return this.method;
    }

    /* JADX INFO: renamed from: -deprecated_url, reason: not valid java name */
    public final HttpUrl m120deprecated_url() {
        return this.url;
    }

    public final RequestBody body() {
        return this.body;
    }

    public final CacheControl cacheControl() {
        CacheControl cacheControl = this.lazyCacheControl;
        if (cacheControl != null) {
            return cacheControl;
        }
        CacheControl cacheControl2 = CacheControl.Companion.parse(this.headers);
        this.lazyCacheControl = cacheControl2;
        return cacheControl2;
    }

    public final Map<Class<?>, Object> getTags$okhttp() {
        return this.tags;
    }

    public final String header(String str) {
        j0.i(str, "name");
        return this.headers.get(str);
    }

    public final List<String> headers(String str) {
        j0.i(str, "name");
        return this.headers.values(str);
    }

    public final Headers headers() {
        return this.headers;
    }

    public final boolean isHttps() {
        return this.url.isHttps();
    }

    public final String method() {
        return this.method;
    }

    public final Builder newBuilder() {
        return new Builder(this);
    }

    public final Object tag() {
        return tag(Object.class);
    }

    public final <T> T tag(Class<? extends T> cls) {
        j0.i(cls, "type");
        return cls.cast(this.tags.get(cls));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String toString() {
        StringBuilder sbA = a.a("Request{method=");
        sbA.append(method());
        sbA.append(", url=");
        sbA.append(url());
        if (headers().size() != 0) {
            sbA.append(", headers=[");
            int i10 = 0;
            for (h<? extends String, ? extends String> hVar : headers()) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    l.i();
                    throw null;
                }
                h<? extends String, ? extends String> hVar2 = hVar;
                String str = (String) hVar2.f31811c;
                String str2 = (String) hVar2.f31812d;
                if (i10 > 0) {
                    sbA.append(", ");
                }
                c.a(sbA, str, CoreConstants.COLON_CHAR, str2);
                i10 = i11;
            }
            sbA.append(']');
        }
        if (!getTags$okhttp().isEmpty()) {
            sbA.append(", tags=");
            sbA.append(getTags$okhttp());
        }
        sbA.append('}');
        String string = sbA.toString();
        j0.h(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final HttpUrl url() {
        return this.url;
    }
}
