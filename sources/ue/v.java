package ue;

import java.io.IOException;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes3.dex */
public final class v {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final char[] f36492l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Pattern f36493m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HttpUrl f36495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public String f36496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public HttpUrl.Builder f36497d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Request.Builder f36498e = new Request.Builder();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Headers.Builder f36499f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public MediaType f36500g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f36501h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public MultipartBody.Builder f36502i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public FormBody.Builder f36503j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public RequestBody f36504k;

    public static class a extends RequestBody {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RequestBody f36505a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MediaType f36506b;

        public a(RequestBody requestBody, MediaType mediaType) {
            this.f36505a = requestBody;
            this.f36506b = mediaType;
        }

        @Override // okhttp3.RequestBody
        public long contentLength() throws IOException {
            return this.f36505a.contentLength();
        }

        @Override // okhttp3.RequestBody
        public MediaType contentType() {
            return this.f36506b;
        }

        @Override // okhttp3.RequestBody
        public void writeTo(qd.e eVar) throws IOException {
            this.f36505a.writeTo(eVar);
        }
    }

    public v(String str, HttpUrl httpUrl, @Nullable String str2, @Nullable Headers headers, @Nullable MediaType mediaType, boolean z10, boolean z11, boolean z12) {
        this.f36494a = str;
        this.f36495b = httpUrl;
        this.f36496c = str2;
        this.f36500g = mediaType;
        this.f36501h = z10;
        this.f36499f = headers != null ? headers.newBuilder() : new Headers.Builder();
        if (z11) {
            this.f36503j = new FormBody.Builder();
        } else if (z12) {
            MultipartBody.Builder builder = new MultipartBody.Builder();
            this.f36502i = builder;
            builder.setType(MultipartBody.FORM);
        }
    }

    public void a(String str, String str2) {
        if (!"Content-Type".equalsIgnoreCase(str)) {
            this.f36499f.add(str, str2);
            return;
        }
        try {
            this.f36500g = MediaType.get(str2);
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException(i.f.a("Malformed content type: ", str2), e10);
        }
    }

    public void b(String str, @Nullable String str2, boolean z10) {
        String str3 = this.f36496c;
        if (str3 != null) {
            HttpUrl.Builder builderNewBuilder = this.f36495b.newBuilder(str3);
            this.f36497d = builderNewBuilder;
            if (builderNewBuilder == null) {
                StringBuilder sbA = defpackage.a.a("Malformed URL. Base: ");
                sbA.append(this.f36495b);
                sbA.append(", Relative: ");
                sbA.append(this.f36496c);
                throw new IllegalArgumentException(sbA.toString());
            }
            this.f36496c = null;
        }
        if (z10) {
            this.f36497d.addEncodedQueryParameter(str, str2);
        } else {
            this.f36497d.addQueryParameter(str, str2);
        }
    }
}
