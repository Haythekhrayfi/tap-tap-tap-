package com.yandex.mobile.ads.impl;

import android.net.Uri;
import com.facebook.ads.AdError;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes3.dex */
public class ao extends ee {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f19010e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f19011f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f19012g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f19013h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final s00 f19014i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final s00 f19015j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f19016k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private gs0<String> f19017l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private HttpURLConnection f19018m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private InputStream f19019n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f19020o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f19021p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f19022q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f19023r;

    public static final class a implements lm.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f19025b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final s00 f19024a = new s00();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f19026c = 8000;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f19027d = 8000;

        @Override // com.yandex.mobile.ads.impl.lm.a
        public final lm a() {
            return new ao(this.f19025b, this.f19026c, this.f19027d, false, this.f19024a);
        }

        public final a b() {
            this.f19025b = null;
            return this;
        }
    }

    public static class b extends com.yandex.mobile.ads.embedded.guava.collect.k<String, List<String>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<String, List<String>> f19028a;

        public b(Map<String, List<String>> map) {
            this.f19028a = map;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean a(String str) {
            return str != null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean a(Map.Entry entry) {
            return entry.getKey() != null;
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.l
        public final Map a() {
            return this.f19028a;
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.k
        public final Map<String, List<String>> b() {
            return this.f19028a;
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.k, java.util.Map
        public final boolean containsKey(Object obj) {
            return obj != null && super.containsKey(obj);
        }

        @Override // java.util.Map
        public final boolean containsValue(Object obj) {
            return a(obj);
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.k, java.util.Map
        public final Set<Map.Entry<String, List<String>>> entrySet() {
            return com.yandex.mobile.ads.embedded.guava.collect.m0.a(super.entrySet(), (gs0) new gs0() { // from class: com.yandex.mobile.ads.impl.qn1
                @Override // com.yandex.mobile.ads.impl.gs0
                public final boolean apply(Object obj) {
                    return ao.b.a((Map.Entry) obj);
                }
            });
        }

        @Override // java.util.Map
        public final boolean equals(Object obj) {
            return obj != null && b(obj);
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.k, java.util.Map
        public final Object get(Object obj) {
            if (obj == null) {
                return null;
            }
            return (List) super.get(obj);
        }

        @Override // java.util.Map
        public final int hashCode() {
            return c();
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.k, java.util.Map
        public final boolean isEmpty() {
            if (super.isEmpty()) {
                return true;
            }
            return super.size() == 1 && super.containsKey(null);
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.k, java.util.Map
        public final Set<String> keySet() {
            return com.yandex.mobile.ads.embedded.guava.collect.m0.a(super.keySet(), (gs0) new gs0() { // from class: com.yandex.mobile.ads.impl.pn1
                @Override // com.yandex.mobile.ads.impl.gs0
                public final boolean apply(Object obj) {
                    return ao.b.a((String) obj);
                }
            });
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.k, java.util.Map
        public final int size() {
            return super.size() - (super.containsKey(null) ? 1 : 0);
        }
    }

    public ao(String str, int i10, int i11, boolean z10, s00 s00Var) {
        super(true);
        this.f19013h = str;
        this.f19011f = i10;
        this.f19012g = i11;
        this.f19010e = z10;
        this.f19014i = s00Var;
        this.f19017l = null;
        this.f19015j = new s00();
        this.f19016k = false;
    }

    private HttpURLConnection a(URL url, int i10, byte[] bArr, long j10, long j11, boolean z10, boolean z11, Map<String, String> map) throws IOException {
        String string;
        String str;
        HttpURLConnection httpURLConnectionA = a(url);
        httpURLConnectionA.setConnectTimeout(this.f19011f);
        httpURLConnectionA.setReadTimeout(this.f19012g);
        HashMap map2 = new HashMap();
        s00 s00Var = this.f19014i;
        if (s00Var != null) {
            map2.putAll(s00Var.a());
        }
        map2.putAll(this.f19015j.a());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnectionA.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        int i11 = e10.f20027c;
        if (j10 == 0 && j11 == -1) {
            string = null;
        } else {
            StringBuilder sbA = i2.a.a("bytes=", j10, "-");
            if (j11 != -1) {
                sbA.append((j10 + j11) - 1);
            }
            string = sbA.toString();
        }
        if (string != null) {
            httpURLConnectionA.setRequestProperty("Range", string);
        }
        String str2 = this.f19013h;
        if (str2 != null) {
            httpURLConnectionA.setRequestProperty("User-Agent", str2);
        }
        httpURLConnectionA.setRequestProperty("Accept-Encoding", z10 ? "gzip" : "identity");
        httpURLConnectionA.setInstanceFollowRedirects(z11);
        httpURLConnectionA.setDoOutput(bArr != null);
        int i12 = pm.f24100k;
        if (i10 == 1) {
            str = "GET";
        } else if (i10 == 2) {
            str = "POST";
        } else {
            if (i10 != 3) {
                throw new IllegalStateException();
            }
            str = "HEAD";
        }
        httpURLConnectionA.setRequestMethod(str);
        if (bArr != null) {
            httpURLConnectionA.setFixedLengthStreamingMode(bArr.length);
            httpURLConnectionA.connect();
            OutputStream outputStream = httpURLConnectionA.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnectionA.connect();
        }
        return httpURLConnectionA;
    }

    private URL a(URL url, String str) throws p00 {
        if (str == null) {
            throw new p00("Null location redirect", AdError.INTERNAL_ERROR_CODE);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new p00(fn1.a("Unsupported protocol redirect: ", protocol), AdError.INTERNAL_ERROR_CODE);
            }
            if (this.f19010e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            StringBuilder sbA = v60.a("Disallowed cross-protocol redirect (");
            sbA.append(url.getProtocol());
            sbA.append(" to ");
            sbA.append(protocol);
            sbA.append(")");
            throw new p00(sbA.toString(), AdError.INTERNAL_ERROR_CODE);
        } catch (MalformedURLException e10) {
            throw new p00(e10, AdError.INTERNAL_ERROR_CODE, 1);
        }
    }

    private void a(long j10) throws IOException {
        if (j10 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j10 > 0) {
            int iMin = (int) Math.min(j10, 4096);
            InputStream inputStream = this.f19019n;
            int i10 = da1.f19803a;
            int i11 = inputStream.read(bArr, 0, iMin);
            if (Thread.currentThread().isInterrupted()) {
                throw new p00(new InterruptedIOException(), 2000, 1);
            }
            if (i11 == -1) {
                throw new p00(AdError.REMOTE_ADS_SERVICE_ERROR);
            }
            j10 -= (long) i11;
            c(i11);
        }
    }

    private static void a(HttpURLConnection httpURLConnection, long j10) {
        int i10;
        if (httpURLConnection == null || (i10 = da1.f19803a) < 19 || i10 > 20) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (j10 == -1) {
                if (inputStream.read() == -1) {
                    return;
                }
            } else if (j10 <= 2048) {
                return;
            }
            String name = inputStream.getClass().getName();
            if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                Class<? super Object> superclass = inputStream.getClass().getSuperclass();
                Objects.requireNonNull(superclass);
                Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, new Object[0]);
            }
        } catch (Exception unused) {
        }
    }

    private HttpURLConnection d(pm pmVar) throws IOException {
        pm pmVar2 = pmVar;
        URL url = new URL(pmVar2.f24101a.toString());
        int i10 = pmVar2.f24103c;
        byte[] bArr = pmVar2.f24104d;
        long j10 = pmVar2.f24106f;
        long j11 = pmVar2.f24107g;
        boolean zA = pmVar2.a(1);
        if (!this.f19010e && !this.f19016k) {
            return a(url, i10, bArr, j10, j11, zA, true, pmVar2.f24105e);
        }
        URL urlA = url;
        int i11 = i10;
        byte[] bArr2 = bArr;
        int i12 = 0;
        while (true) {
            int i13 = i12 + 1;
            if (i12 > 20) {
                throw new p00(new NoRouteToHostException(u60.a("Too many redirects: ", i13)), AdError.INTERNAL_ERROR_CODE, 1);
            }
            Map<String, String> map = pmVar2.f24105e;
            int i14 = i11;
            i12 = i13;
            long j12 = j10;
            URL url2 = urlA;
            long j13 = j11;
            HttpURLConnection httpURLConnectionA = a(urlA, i11, bArr2, j10, j11, zA, false, map);
            int responseCode = httpURLConnectionA.getResponseCode();
            String headerField = httpURLConnectionA.getHeaderField("Location");
            if ((i14 == 1 || i14 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                httpURLConnectionA.disconnect();
                urlA = a(url2, headerField);
                i11 = i14;
            } else {
                if (i14 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    return httpURLConnectionA;
                }
                httpURLConnectionA.disconnect();
                if (this.f19016k && responseCode == 302) {
                    i11 = i14;
                } else {
                    bArr2 = null;
                    i11 = 1;
                }
                urlA = a(url2, headerField);
            }
            j10 = j12;
            j11 = j13;
            pmVar2 = pmVar;
        }
    }

    private void g() {
        HttpURLConnection httpURLConnection = this.f19018m;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                p90.a("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
            this.f19018m = null;
        }
    }

    @Override // com.yandex.mobile.ads.impl.lm
    public final long a(pm pmVar) throws p00 {
        long j10 = 0;
        this.f19023r = 0L;
        this.f19022q = 0L;
        b(pmVar);
        try {
            HttpURLConnection httpURLConnectionD = d(pmVar);
            this.f19018m = httpURLConnectionD;
            this.f19021p = httpURLConnectionD.getResponseCode();
            httpURLConnectionD.getResponseMessage();
            int i10 = this.f19021p;
            if (i10 < 200 || i10 > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionD.getHeaderFields();
                if (this.f19021p == 416) {
                    if (pmVar.f24106f == e10.a(httpURLConnectionD.getHeaderField("Content-Range"))) {
                        this.f19020o = true;
                        c(pmVar);
                        long j11 = pmVar.f24107g;
                        if (j11 != -1) {
                            return j11;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = httpURLConnectionD.getErrorStream();
                try {
                    if (errorStream != null) {
                        int i11 = da1.f19803a;
                        byte[] bArr = new byte[4096];
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        while (true) {
                            int i12 = errorStream.read(bArr);
                            if (i12 == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, i12);
                        }
                        byteArrayOutputStream.toByteArray();
                    } else {
                        int i13 = da1.f19803a;
                    }
                } catch (IOException unused) {
                    int i14 = da1.f19803a;
                }
                g();
                throw new r00(this.f19021p, this.f19021p == 416 ? new mm(AdError.REMOTE_ADS_SERVICE_ERROR) : null, headerFields);
            }
            String contentType = httpURLConnectionD.getContentType();
            gs0<String> gs0Var = this.f19017l;
            if (gs0Var != null && !gs0Var.apply(contentType)) {
                g();
                throw new q00(contentType);
            }
            if (this.f19021p == 200) {
                long j12 = pmVar.f24106f;
                if (j12 != 0) {
                    j10 = j12;
                }
            }
            boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnectionD.getHeaderField("Content-Encoding"));
            if (zEqualsIgnoreCase) {
                this.f19022q = pmVar.f24107g;
            } else {
                long j13 = pmVar.f24107g;
                if (j13 != -1) {
                    this.f19022q = j13;
                } else {
                    long jA = e10.a(httpURLConnectionD.getHeaderField("Content-Length"), httpURLConnectionD.getHeaderField("Content-Range"));
                    this.f19022q = jA != -1 ? jA - j10 : -1L;
                }
            }
            try {
                this.f19019n = httpURLConnectionD.getInputStream();
                if (zEqualsIgnoreCase) {
                    this.f19019n = new GZIPInputStream(this.f19019n);
                }
                this.f19020o = true;
                c(pmVar);
                try {
                    a(j10);
                    return this.f19022q;
                } catch (IOException e10) {
                    g();
                    if (e10 instanceof p00) {
                        throw ((p00) e10);
                    }
                    throw new p00(e10, 2000, 1);
                }
            } catch (IOException e11) {
                g();
                throw new p00(e11, 2000, 1);
            }
        } catch (IOException e12) {
            g();
            throw p00.a(e12, 1);
        }
    }

    public HttpURLConnection a(URL url) throws IOException {
        return (HttpURLConnection) url.openConnection();
    }

    @Override // com.yandex.mobile.ads.impl.lm
    public final Map<String, List<String>> b() {
        HttpURLConnection httpURLConnection = this.f19018m;
        return httpURLConnection == null ? com.yandex.mobile.ads.embedded.guava.collect.q.h() : new b(httpURLConnection.getHeaderFields());
    }

    @Override // com.yandex.mobile.ads.impl.lm
    public final void close() throws p00 {
        try {
            InputStream inputStream = this.f19019n;
            if (inputStream != null) {
                long j10 = this.f19022q;
                long j11 = -1;
                if (j10 != -1) {
                    j11 = j10 - this.f19023r;
                }
                a(this.f19018m, j11);
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    int i10 = da1.f19803a;
                    throw new p00(e10, 2000, 3);
                }
            }
            this.f19019n = null;
            g();
            if (this.f19020o) {
                this.f19020o = false;
                f();
            }
        } catch (Throwable th) {
            this.f19019n = null;
            g();
            if (this.f19020o) {
                this.f19020o = false;
                f();
            }
            throw th;
        }
    }

    @Override // com.yandex.mobile.ads.impl.lm
    public final Uri d() {
        HttpURLConnection httpURLConnection = this.f19018m;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.yandex.mobile.ads.impl.im
    public final int read(byte[] bArr, int i10, int i11) throws p00 {
        if (i11 == 0) {
            return 0;
        }
        try {
            long j10 = this.f19022q;
            if (j10 != -1) {
                long j11 = j10 - this.f19023r;
                if (j11 == 0) {
                    return -1;
                }
                i11 = (int) Math.min(i11, j11);
            }
            InputStream inputStream = this.f19019n;
            int i12 = da1.f19803a;
            int i13 = inputStream.read(bArr, i10, i11);
            if (i13 == -1) {
                return -1;
            }
            this.f19023r += (long) i13;
            c(i13);
            return i13;
        } catch (IOException e10) {
            int i14 = da1.f19803a;
            throw p00.a(e10, 2);
        }
    }
}
