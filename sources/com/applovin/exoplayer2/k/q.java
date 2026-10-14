package com.applovin.exoplayer2.k;

import android.net.Uri;
import com.applovin.exoplayer2.common.base.Predicate;
import com.applovin.exoplayer2.l.ai;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes.dex */
public class q extends e implements t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f7466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f7467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f7468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f7469e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final t.f f7470f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final t.f f7471g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f7472h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Predicate<String> f7473i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private l f7474j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private HttpURLConnection f7475k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private InputStream f7476l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f7477m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f7478n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f7479o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f7480p;

    public static final class a implements t.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private aa f7482b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Predicate<String> f7483c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f7484d;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f7487g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f7488h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final t.f f7481a = new t.f();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f7485e = 8000;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f7486f = 8000;

        public a a(String str) {
            this.f7484d = str;
            return this;
        }

        @Override // com.applovin.exoplayer2.k.t.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public q a() {
            q qVar = new q(this.f7484d, this.f7485e, this.f7486f, this.f7487g, this.f7481a, this.f7483c, this.f7488h);
            aa aaVar = this.f7482b;
            if (aaVar != null) {
                qVar.a(aaVar);
            }
            return qVar;
        }
    }

    @Deprecated
    public q() {
        this(null, 8000, 8000);
    }

    @Deprecated
    public q(String str, int i10, int i11) {
        this(str, i10, i11, false, null);
    }

    @Deprecated
    public q(String str, int i10, int i11, boolean z10, t.f fVar) {
        this(str, i10, i11, z10, fVar, null, false);
    }

    private q(String str, int i10, int i11, boolean z10, t.f fVar, Predicate<String> predicate, boolean z11) {
        super(true);
        this.f7469e = str;
        this.f7467c = i10;
        this.f7468d = i11;
        this.f7466b = z10;
        this.f7470f = fVar;
        this.f7473i = predicate;
        this.f7471g = new t.f();
        this.f7472h = z11;
    }

    private HttpURLConnection a(URL url, int i10, byte[] bArr, long j10, long j11, boolean z10, boolean z11, Map<String, String> map) throws IOException {
        HttpURLConnection httpURLConnectionA = a(url);
        httpURLConnectionA.setConnectTimeout(this.f7467c);
        httpURLConnectionA.setReadTimeout(this.f7468d);
        HashMap map2 = new HashMap();
        t.f fVar = this.f7470f;
        if (fVar != null) {
            map2.putAll(fVar.a());
        }
        map2.putAll(this.f7471g.a());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnectionA.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String strA = u.a(j10, j11);
        if (strA != null) {
            httpURLConnectionA.setRequestProperty("Range", strA);
        }
        String str = this.f7469e;
        if (str != null) {
            httpURLConnectionA.setRequestProperty("User-Agent", str);
        }
        httpURLConnectionA.setRequestProperty("Accept-Encoding", z10 ? "gzip" : "identity");
        httpURLConnectionA.setInstanceFollowRedirects(z11);
        httpURLConnectionA.setDoOutput(bArr != null);
        httpURLConnectionA.setRequestMethod(l.a(i10));
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

    private URL a(URL url, String str, l lVar) throws t.c {
        if (str == null) {
            throw new t.c("Null location redirect", lVar, AdError.INTERNAL_ERROR_CODE, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new t.c(i.f.a("Unsupported protocol redirect: ", protocol), lVar, AdError.INTERNAL_ERROR_CODE, 1);
            }
            if (this.f7466b || protocol.equals(url.getProtocol())) {
                return url2;
            }
            StringBuilder sbA = defpackage.a.a("Disallowed cross-protocol redirect (");
            sbA.append(url.getProtocol());
            sbA.append(" to ");
            sbA.append(protocol);
            sbA.append(")");
            throw new t.c(sbA.toString(), lVar, AdError.INTERNAL_ERROR_CODE, 1);
        } catch (MalformedURLException e10) {
            throw new t.c(e10, lVar, AdError.INTERNAL_ERROR_CODE, 1);
        }
    }

    private void a(long j10, l lVar) throws IOException {
        if (j10 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j10 > 0) {
            int i10 = ((InputStream) ai.a(this.f7476l)).read(bArr, 0, (int) Math.min(j10, 4096));
            if (Thread.currentThread().isInterrupted()) {
                throw new t.c(new InterruptedIOException(), lVar, 2000, 1);
            }
            if (i10 == -1) {
                throw new t.c(lVar, AdError.REMOTE_ADS_SERVICE_ERROR, 1);
            }
            j10 -= (long) i10;
            a(i10);
        }
    }

    private static void a(HttpURLConnection httpURLConnection, long j10) {
        int i10;
        if (httpURLConnection == null || (i10 = ai.f7595a) < 19 || i10 > 20) {
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
                Method declaredMethod = ((Class) com.applovin.exoplayer2.l.a.b(inputStream.getClass().getSuperclass())).getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, new Object[0]);
            }
        } catch (Exception unused) {
        }
    }

    private static boolean a(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    private int b(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f7479o;
        if (j10 != -1) {
            long j11 = j10 - this.f7480p;
            if (j11 == 0) {
                return -1;
            }
            i11 = (int) Math.min(i11, j11);
        }
        int i12 = ((InputStream) ai.a(this.f7476l)).read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        this.f7480p += (long) i12;
        a(i12);
        return i12;
    }

    private HttpURLConnection d(l lVar) throws IOException {
        URL url = new URL(lVar.f7392a.toString());
        int i10 = lVar.f7394c;
        byte[] bArr = lVar.f7395d;
        long j10 = lVar.f7398g;
        long j11 = lVar.f7399h;
        boolean zB = lVar.b(1);
        if (!this.f7466b && !this.f7472h) {
            return a(url, i10, bArr, j10, j11, zB, true, lVar.f7396e);
        }
        URL urlA = url;
        int i11 = i10;
        byte[] bArr2 = bArr;
        int i12 = 0;
        while (true) {
            int i13 = i12 + 1;
            if (i12 > 20) {
                throw new t.c(new NoRouteToHostException(android.support.v4.media.a.a("Too many redirects: ", i13)), lVar, AdError.INTERNAL_ERROR_CODE, 1);
            }
            long j12 = j10;
            long j13 = j10;
            int i14 = i11;
            URL url2 = urlA;
            long j14 = j11;
            HttpURLConnection httpURLConnectionA = a(urlA, i11, bArr2, j12, j11, zB, false, lVar.f7396e);
            int responseCode = httpURLConnectionA.getResponseCode();
            String headerField = httpURLConnectionA.getHeaderField("Location");
            if ((i14 == 1 || i14 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                httpURLConnectionA.disconnect();
                urlA = a(url2, headerField, lVar);
                i11 = i14;
            } else {
                if (i14 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    return httpURLConnectionA;
                }
                httpURLConnectionA.disconnect();
                if (this.f7472h && responseCode == 302) {
                    i11 = i14;
                } else {
                    bArr2 = null;
                    i11 = 1;
                }
                urlA = a(url2, headerField, lVar);
            }
            j10 = j13;
            i12 = i13;
            j11 = j14;
        }
    }

    private void e() {
        HttpURLConnection httpURLConnection = this.f7475k;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                com.applovin.exoplayer2.l.q.c("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
            this.f7475k = null;
        }
    }

    @Override // com.applovin.exoplayer2.k.g
    public int a(byte[] bArr, int i10, int i11) throws t.c {
        try {
            return b(bArr, i10, i11);
        } catch (IOException e10) {
            throw t.c.a(e10, (l) ai.a(this.f7474j), 2);
        }
    }

    @Override // com.applovin.exoplayer2.k.i
    public long a(l lVar) throws t.c {
        byte[] bArrA;
        this.f7474j = lVar;
        long j10 = 0;
        this.f7480p = 0L;
        this.f7479o = 0L;
        b(lVar);
        try {
            HttpURLConnection httpURLConnectionD = d(lVar);
            this.f7475k = httpURLConnectionD;
            this.f7478n = httpURLConnectionD.getResponseCode();
            String responseMessage = httpURLConnectionD.getResponseMessage();
            int i10 = this.f7478n;
            if (i10 < 200 || i10 > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionD.getHeaderFields();
                if (this.f7478n == 416) {
                    if (lVar.f7398g == u.a(httpURLConnectionD.getHeaderField("Content-Range"))) {
                        this.f7477m = true;
                        c(lVar);
                        long j11 = lVar.f7399h;
                        if (j11 != -1) {
                            return j11;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = httpURLConnectionD.getErrorStream();
                try {
                    bArrA = errorStream != null ? ai.a(errorStream) : ai.f7600f;
                } catch (IOException unused) {
                    bArrA = ai.f7600f;
                }
                byte[] bArr = bArrA;
                e();
                throw new t.e(this.f7478n, responseMessage, this.f7478n == 416 ? new j(AdError.REMOTE_ADS_SERVICE_ERROR) : null, headerFields, lVar, bArr);
            }
            String contentType = httpURLConnectionD.getContentType();
            Predicate<String> predicate = this.f7473i;
            if (predicate != null && !predicate.apply(contentType)) {
                e();
                throw new t.d(contentType, lVar);
            }
            if (this.f7478n == 200) {
                long j12 = lVar.f7398g;
                if (j12 != 0) {
                    j10 = j12;
                }
            }
            boolean zA = a(httpURLConnectionD);
            if (zA) {
                this.f7479o = lVar.f7399h;
            } else {
                long j13 = lVar.f7399h;
                if (j13 != -1) {
                    this.f7479o = j13;
                } else {
                    long jA = u.a(httpURLConnectionD.getHeaderField("Content-Length"), httpURLConnectionD.getHeaderField("Content-Range"));
                    this.f7479o = jA != -1 ? jA - j10 : -1L;
                }
            }
            try {
                this.f7476l = httpURLConnectionD.getInputStream();
                if (zA) {
                    this.f7476l = new GZIPInputStream(this.f7476l);
                }
                this.f7477m = true;
                c(lVar);
                try {
                    a(j10, lVar);
                    return this.f7479o;
                } catch (IOException e10) {
                    e();
                    if (e10 instanceof t.c) {
                        throw ((t.c) e10);
                    }
                    throw new t.c(e10, lVar, 2000, 1);
                }
            } catch (IOException e11) {
                e();
                throw new t.c(e11, lVar, 2000, 1);
            }
        } catch (IOException e12) {
            e();
            throw t.c.a(e12, lVar, 1);
        }
    }

    @Override // com.applovin.exoplayer2.k.i
    public Uri a() {
        HttpURLConnection httpURLConnection = this.f7475k;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public HttpURLConnection a(URL url) throws IOException {
        return (HttpURLConnection) url.openConnection();
    }

    @Override // com.applovin.exoplayer2.k.i
    public Map<String, List<String>> b() {
        HttpURLConnection httpURLConnection = this.f7475k;
        return httpURLConnection == null ? Collections.emptyMap() : httpURLConnection.getHeaderFields();
    }

    @Override // com.applovin.exoplayer2.k.i
    public void c() throws t.c {
        try {
            InputStream inputStream = this.f7476l;
            if (inputStream != null) {
                long j10 = this.f7479o;
                long j11 = -1;
                if (j10 != -1) {
                    j11 = j10 - this.f7480p;
                }
                a(this.f7475k, j11);
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    throw new t.c(e10, (l) ai.a(this.f7474j), 2000, 3);
                }
            }
            this.f7476l = null;
            e();
            if (this.f7477m) {
                this.f7477m = false;
                d();
            }
        } catch (Throwable th) {
            this.f7476l = null;
            e();
            if (this.f7477m) {
                this.f7477m = false;
                d();
            }
            throw th;
        }
    }
}
