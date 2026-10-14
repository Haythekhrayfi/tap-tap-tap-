package okhttp3;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.ImagesContract;
import ed.q;
import ed.u;
import fd.j0;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import kc.w;
import kc.y;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.io.FileSystem;
import okhttp3.internal.platform.Platform;
import org.slf4j.Marker;
import qd.a0;
import qd.c;
import qd.c.b;
import qd.e;
import qd.f;
import qd.i;
import qd.j;
import qd.o;
import vc.e0;
import vc.g;
import wc.a;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class Cache implements Closeable, Flushable {
    public static final Companion Companion = new Companion(null);
    private static final int ENTRY_BODY = 1;
    private static final int ENTRY_COUNT = 2;
    private static final int ENTRY_METADATA = 0;
    private static final int VERSION = 201105;
    private final DiskLruCache cache;
    private int hitCount;
    private int networkCount;
    private int requestCount;
    private int writeAbortCount;
    private int writeSuccessCount;

    public static final class CacheResponseBody extends ResponseBody {
        private final f bodySource;
        private final String contentLength;
        private final String contentType;
        private final DiskLruCache.Snapshot snapshot;

        public CacheResponseBody(DiskLruCache.Snapshot snapshot, String str, String str2) {
            j0.i(snapshot, "snapshot");
            this.snapshot = snapshot;
            this.contentType = str;
            this.contentLength = str2;
            this.bodySource = o.c(new j(this) { // from class: okhttp3.Cache.CacheResponseBody.1
                public final /* synthetic */ CacheResponseBody this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(this.$source);
                    this.this$0 = this;
                }

                @Override // qd.j, qd.a0, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
                    this.this$0.getSnapshot().close();
                    super.close();
                }
            });
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
            String str = this.contentLength;
            if (str == null) {
                return -1L;
            }
            return Util.toLongOrDefault(str, -1L);
        }

        @Override // okhttp3.ResponseBody
        public MediaType contentType() {
            String str = this.contentType;
            if (str == null) {
                return null;
            }
            return MediaType.Companion.parse(str);
        }

        public final DiskLruCache.Snapshot getSnapshot() {
            return this.snapshot;
        }

        @Override // okhttp3.ResponseBody
        public f source() {
            return this.bodySource;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        private final Set<String> varyFields(Headers headers) {
            int size = headers.size();
            TreeSet treeSet = null;
            int i10 = 0;
            while (i10 < size) {
                int i11 = i10 + 1;
                if (q.i("Vary", headers.name(i10), true)) {
                    String strValue = headers.value(i10);
                    if (treeSet == null) {
                        q.j(e0.f37000a);
                        treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                    }
                    Iterator it = u.Q(strValue, new char[]{CoreConstants.COMMA_CHAR}, false, 0, 6).iterator();
                    while (it.hasNext()) {
                        treeSet.add(u.Y((String) it.next()).toString());
                    }
                }
                i10 = i11;
            }
            return treeSet == null ? y.f32011c : treeSet;
        }

        private final Headers varyHeaders(Headers headers, Headers headers2) {
            Set<String> setVaryFields = varyFields(headers2);
            if (setVaryFields.isEmpty()) {
                return Util.EMPTY_HEADERS;
            }
            Headers.Builder builder = new Headers.Builder();
            int i10 = 0;
            int size = headers.size();
            while (i10 < size) {
                int i11 = i10 + 1;
                String strName = headers.name(i10);
                if (setVaryFields.contains(strName)) {
                    builder.add(strName, headers.value(i10));
                }
                i10 = i11;
            }
            return builder.build();
        }

        public final boolean hasVaryAll(Response response) {
            j0.i(response, "<this>");
            return varyFields(response.headers()).contains(Marker.ANY_MARKER);
        }

        public final String key(HttpUrl httpUrl) {
            j0.i(httpUrl, ImagesContract.URL);
            return qd.g.f34892f.d(httpUrl.toString()).b("MD5").d();
        }

        public final int readInt$okhttp(f fVar) throws IOException {
            j0.i(fVar, "source");
            try {
                long jB = fVar.B();
                String strM = fVar.M();
                if (jB >= 0 && jB <= 2147483647L) {
                    if (!(strM.length() > 0)) {
                        return (int) jB;
                    }
                }
                throw new IOException("expected an int but was \"" + jB + strM + CoreConstants.DOUBLE_QUOTE_CHAR);
            } catch (NumberFormatException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        public final Headers varyHeaders(Response response) {
            j0.i(response, "<this>");
            Response responseNetworkResponse = response.networkResponse();
            j0.f(responseNetworkResponse);
            return varyHeaders(responseNetworkResponse.request().headers(), response.headers());
        }

        public final boolean varyMatches(Response response, Headers headers, Request request) {
            j0.i(response, "cachedResponse");
            j0.i(headers, "cachedRequest");
            j0.i(request, "newRequest");
            Set<String> setVaryFields = varyFields(response.headers());
            if ((setVaryFields instanceof Collection) && setVaryFields.isEmpty()) {
                return true;
            }
            for (String str : setVaryFields) {
                if (!j0.d(headers.values(str), request.headers(str))) {
                    return false;
                }
            }
            return true;
        }
    }

    public static final class Entry {
        public static final Companion Companion = new Companion(null);
        private static final String RECEIVED_MILLIS;
        private static final String SENT_MILLIS;
        private final int code;
        private final Handshake handshake;
        private final String message;
        private final Protocol protocol;
        private final long receivedResponseMillis;
        private final String requestMethod;
        private final Headers responseHeaders;
        private final long sentRequestMillis;
        private final HttpUrl url;
        private final Headers varyHeaders;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(g gVar) {
                this();
            }
        }

        static {
            Platform.Companion companion = Platform.Companion;
            SENT_MILLIS = j0.p(companion.get().getPrefix(), "-Sent-Millis");
            RECEIVED_MILLIS = j0.p(companion.get().getPrefix(), "-Received-Millis");
        }

        public Entry(Response response) {
            j0.i(response, "response");
            this.url = response.request().url();
            this.varyHeaders = Cache.Companion.varyHeaders(response);
            this.requestMethod = response.request().method();
            this.protocol = response.protocol();
            this.code = response.code();
            this.message = response.message();
            this.responseHeaders = response.headers();
            this.handshake = response.handshake();
            this.sentRequestMillis = response.sentRequestAtMillis();
            this.receivedResponseMillis = response.receivedResponseAtMillis();
        }

        public Entry(a0 a0Var) throws IOException {
            j0.i(a0Var, "rawSource");
            try {
                f fVarC = o.c(a0Var);
                qd.u uVar = (qd.u) fVarC;
                String strM = uVar.M();
                HttpUrl httpUrl = HttpUrl.Companion.parse(strM);
                if (httpUrl == null) {
                    IOException iOException = new IOException(j0.p("Cache corruption for ", strM));
                    Platform.Companion.get().log("cache corruption", 5, iOException);
                    throw iOException;
                }
                this.url = httpUrl;
                this.requestMethod = uVar.M();
                Headers.Builder builder = new Headers.Builder();
                int int$okhttp = Cache.Companion.readInt$okhttp(fVarC);
                int i10 = 0;
                while (i10 < int$okhttp) {
                    i10++;
                    builder.addLenient$okhttp(uVar.M());
                }
                this.varyHeaders = builder.build();
                StatusLine statusLine = StatusLine.Companion.parse(uVar.M());
                this.protocol = statusLine.protocol;
                this.code = statusLine.code;
                this.message = statusLine.message;
                Headers.Builder builder2 = new Headers.Builder();
                int int$okhttp2 = Cache.Companion.readInt$okhttp(fVarC);
                int i11 = 0;
                while (i11 < int$okhttp2) {
                    i11++;
                    builder2.addLenient$okhttp(uVar.M());
                }
                String str = SENT_MILLIS;
                String str2 = builder2.get(str);
                String str3 = RECEIVED_MILLIS;
                String str4 = builder2.get(str3);
                builder2.removeAll(str);
                builder2.removeAll(str3);
                long j10 = 0;
                this.sentRequestMillis = str2 == null ? 0L : Long.parseLong(str2);
                if (str4 != null) {
                    j10 = Long.parseLong(str4);
                }
                this.receivedResponseMillis = j10;
                this.responseHeaders = builder2.build();
                if (isHttps()) {
                    String strM2 = uVar.M();
                    if (strM2.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + strM2 + CoreConstants.DOUBLE_QUOTE_CHAR);
                    }
                    this.handshake = Handshake.Companion.get(!uVar.y() ? TlsVersion.Companion.forJavaName(uVar.M()) : TlsVersion.SSL_3_0, CipherSuite.Companion.forJavaName(uVar.M()), readCertificateList(fVarC), readCertificateList(fVarC));
                } else {
                    this.handshake = null;
                }
                c0.g(a0Var, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    c0.g(a0Var, th);
                    throw th2;
                }
            }
        }

        private final boolean isHttps() {
            return j0.d(this.url.scheme(), "https");
        }

        private final List<Certificate> readCertificateList(f fVar) throws IOException {
            int int$okhttp = Cache.Companion.readInt$okhttp(fVar);
            if (int$okhttp == -1) {
                return w.f32009c;
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(int$okhttp);
                int i10 = 0;
                while (i10 < int$okhttp) {
                    i10++;
                    String strM = fVar.M();
                    c cVar = new c();
                    qd.g gVarA = qd.g.f34892f.a(strM);
                    j0.f(gVarA);
                    cVar.K(gVarA);
                    arrayList.add(certificateFactory.generateCertificate(cVar.new b()));
                }
                return arrayList;
            } catch (CertificateException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        private final void writeCertList(e eVar, List<? extends Certificate> list) throws IOException {
            try {
                eVar.X(list.size()).z(10);
                Iterator<? extends Certificate> it = list.iterator();
                while (it.hasNext()) {
                    byte[] encoded = it.next().getEncoded();
                    qd.g.a aVar = qd.g.f34892f;
                    j0.h(encoded, "bytes");
                    eVar.E(qd.g.a.e(aVar, encoded, 0, 0, 3).a()).z(10);
                }
            } catch (CertificateEncodingException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        public final boolean matches(Request request, Response response) {
            j0.i(request, "request");
            j0.i(response, "response");
            return j0.d(this.url, request.url()) && j0.d(this.requestMethod, request.method()) && Cache.Companion.varyMatches(response, this.varyHeaders, request);
        }

        public final Response response(DiskLruCache.Snapshot snapshot) {
            j0.i(snapshot, "snapshot");
            String str = this.responseHeaders.get("Content-Type");
            String str2 = this.responseHeaders.get("Content-Length");
            return new Response.Builder().request(new Request.Builder().url(this.url).method(this.requestMethod, null).headers(this.varyHeaders).build()).protocol(this.protocol).code(this.code).message(this.message).headers(this.responseHeaders).body(new CacheResponseBody(snapshot, str, str2)).handshake(this.handshake).sentRequestAtMillis(this.sentRequestMillis).receivedResponseAtMillis(this.receivedResponseMillis).build();
        }

        public final void writeTo(DiskLruCache.Editor editor) throws IOException {
            j0.i(editor, "editor");
            e eVarB = o.b(editor.newSink(0));
            try {
                eVarB.E(this.url.toString());
                eVarB.z(10);
                eVarB.E(this.requestMethod);
                eVarB.z(10);
                eVarB.X(this.varyHeaders.size());
                eVarB.z(10);
                int size = this.varyHeaders.size();
                int i10 = 0;
                while (i10 < size) {
                    int i11 = i10 + 1;
                    eVarB.E(this.varyHeaders.name(i10));
                    eVarB.E(": ");
                    eVarB.E(this.varyHeaders.value(i10));
                    eVarB.z(10);
                    i10 = i11;
                }
                eVarB.E(new StatusLine(this.protocol, this.code, this.message).toString());
                eVarB.z(10);
                eVarB.X(this.responseHeaders.size() + 2);
                eVarB.z(10);
                int size2 = this.responseHeaders.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    eVarB.E(this.responseHeaders.name(i12));
                    eVarB.E(": ");
                    eVarB.E(this.responseHeaders.value(i12));
                    eVarB.z(10);
                }
                eVarB.E(SENT_MILLIS);
                eVarB.E(": ");
                eVarB.X(this.sentRequestMillis);
                eVarB.z(10);
                eVarB.E(RECEIVED_MILLIS);
                eVarB.E(": ");
                eVarB.X(this.receivedResponseMillis);
                eVarB.z(10);
                if (isHttps()) {
                    eVarB.z(10);
                    Handshake handshake = this.handshake;
                    j0.f(handshake);
                    eVarB.E(handshake.cipherSuite().javaName());
                    eVarB.z(10);
                    writeCertList(eVarB, this.handshake.peerCertificates());
                    writeCertList(eVarB, this.handshake.localCertificates());
                    eVarB.E(this.handshake.tlsVersion().javaName());
                    eVarB.z(10);
                }
                c0.g(eVarB, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    c0.g(eVarB, th);
                    throw th2;
                }
            }
        }
    }

    public final class RealCacheRequest implements CacheRequest {
        private final qd.y body;
        private final qd.y cacheOut;
        private boolean done;
        private final DiskLruCache.Editor editor;
        public final /* synthetic */ Cache this$0;

        public RealCacheRequest(final Cache cache, DiskLruCache.Editor editor) {
            j0.i(cache, "this$0");
            j0.i(editor, "editor");
            this.this$0 = cache;
            this.editor = editor;
            qd.y yVarNewSink = editor.newSink(1);
            this.cacheOut = yVarNewSink;
            this.body = new i(yVarNewSink) { // from class: okhttp3.Cache.RealCacheRequest.1
                @Override // qd.i, qd.y, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
                    Cache cache2 = cache;
                    RealCacheRequest realCacheRequest = this;
                    synchronized (cache2) {
                        if (realCacheRequest.getDone()) {
                            return;
                        }
                        realCacheRequest.setDone(true);
                        cache2.setWriteSuccessCount$okhttp(cache2.getWriteSuccessCount$okhttp() + 1);
                        super.close();
                        this.editor.commit();
                    }
                }
            };
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public void abort() {
            Cache cache = this.this$0;
            synchronized (cache) {
                if (getDone()) {
                    return;
                }
                setDone(true);
                cache.setWriteAbortCount$okhttp(cache.getWriteAbortCount$okhttp() + 1);
                Util.closeQuietly(this.cacheOut);
                try {
                    this.editor.abort();
                } catch (IOException unused) {
                }
            }
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public qd.y body() {
            return this.body;
        }

        public final boolean getDone() {
            return this.done;
        }

        public final void setDone(boolean z10) {
            this.done = z10;
        }
    }

    /* JADX INFO: renamed from: okhttp3.Cache$urls$1, reason: invalid class name */
    public static final class AnonymousClass1 implements Iterator<String>, a {
        private boolean canRemove;
        private final Iterator<DiskLruCache.Snapshot> delegate;
        private String nextUrl;

        public AnonymousClass1() {
            this.delegate = Cache.this.getCache$okhttp().snapshots();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.nextUrl != null) {
                return true;
            }
            this.canRemove = false;
            while (this.delegate.hasNext()) {
                try {
                    DiskLruCache.Snapshot next = this.delegate.next();
                    try {
                        continue;
                        this.nextUrl = ((qd.u) o.c(next.getSource(0))).M();
                        c0.g(next, null);
                        return true;
                    } catch (Throwable th) {
                        try {
                            continue;
                            throw th;
                        } catch (Throwable th2) {
                            c0.g(next, th);
                            throw th2;
                        }
                    }
                } catch (IOException unused) {
                }
            }
            return false;
        }

        @Override // java.util.Iterator
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.nextUrl;
            j0.f(str);
            this.nextUrl = null;
            this.canRemove = true;
            return str;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.canRemove) {
                throw new IllegalStateException("remove() before next()".toString());
            }
            this.delegate.remove();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Cache(File file, long j10) {
        this(file, j10, FileSystem.SYSTEM);
        j0.i(file, "directory");
    }

    public Cache(File file, long j10, FileSystem fileSystem) {
        j0.i(file, "directory");
        j0.i(fileSystem, "fileSystem");
        this.cache = new DiskLruCache(fileSystem, file, VERSION, 2, j10, TaskRunner.INSTANCE);
    }

    private final void abortQuietly(DiskLruCache.Editor editor) {
        if (editor == null) {
            return;
        }
        try {
            editor.abort();
        } catch (IOException unused) {
        }
    }

    public static final String key(HttpUrl httpUrl) {
        return Companion.key(httpUrl);
    }

    /* JADX INFO: renamed from: -deprecated_directory, reason: not valid java name */
    public final File m15deprecated_directory() {
        return this.cache.getDirectory();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.cache.close();
    }

    public final void delete() throws IOException {
        this.cache.delete();
    }

    public final File directory() {
        return this.cache.getDirectory();
    }

    public final void evictAll() throws IOException {
        this.cache.evictAll();
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        this.cache.flush();
    }

    public final Response get$okhttp(Request request) {
        j0.i(request, "request");
        try {
            DiskLruCache.Snapshot snapshot = this.cache.get(Companion.key(request.url()));
            if (snapshot == null) {
                return null;
            }
            try {
                Entry entry = new Entry(snapshot.getSource(0));
                Response response = entry.response(snapshot);
                if (entry.matches(request, response)) {
                    return response;
                }
                ResponseBody responseBodyBody = response.body();
                if (responseBodyBody != null) {
                    Util.closeQuietly(responseBodyBody);
                }
                return null;
            } catch (IOException unused) {
                Util.closeQuietly(snapshot);
                return null;
            }
        } catch (IOException unused2) {
        }
    }

    public final DiskLruCache getCache$okhttp() {
        return this.cache;
    }

    public final int getWriteAbortCount$okhttp() {
        return this.writeAbortCount;
    }

    public final int getWriteSuccessCount$okhttp() {
        return this.writeSuccessCount;
    }

    public final synchronized int hitCount() {
        return this.hitCount;
    }

    public final void initialize() throws IOException {
        this.cache.initialize();
    }

    public final boolean isClosed() {
        return this.cache.isClosed();
    }

    public final long maxSize() {
        return this.cache.getMaxSize();
    }

    public final synchronized int networkCount() {
        return this.networkCount;
    }

    public final CacheRequest put$okhttp(Response response) {
        DiskLruCache.Editor editorEdit$default;
        j0.i(response, "response");
        String strMethod = response.request().method();
        if (HttpMethod.INSTANCE.invalidatesCache(response.request().method())) {
            try {
                remove$okhttp(response.request());
            } catch (IOException unused) {
            }
            return null;
        }
        if (!j0.d(strMethod, "GET")) {
            return null;
        }
        Companion companion = Companion;
        if (companion.hasVaryAll(response)) {
            return null;
        }
        Entry entry = new Entry(response);
        try {
            editorEdit$default = DiskLruCache.edit$default(this.cache, companion.key(response.request().url()), 0L, 2, null);
            if (editorEdit$default == null) {
                return null;
            }
            try {
                entry.writeTo(editorEdit$default);
                return new RealCacheRequest(this, editorEdit$default);
            } catch (IOException unused2) {
                abortQuietly(editorEdit$default);
                return null;
            }
        } catch (IOException unused3) {
            editorEdit$default = null;
        }
    }

    public final void remove$okhttp(Request request) throws IOException {
        j0.i(request, "request");
        this.cache.remove(Companion.key(request.url()));
    }

    public final synchronized int requestCount() {
        return this.requestCount;
    }

    public final void setWriteAbortCount$okhttp(int i10) {
        this.writeAbortCount = i10;
    }

    public final void setWriteSuccessCount$okhttp(int i10) {
        this.writeSuccessCount = i10;
    }

    public final long size() throws IOException {
        return this.cache.size();
    }

    public final synchronized void trackConditionalCacheHit$okhttp() {
        this.hitCount++;
    }

    public final synchronized void trackResponse$okhttp(CacheStrategy cacheStrategy) {
        j0.i(cacheStrategy, "cacheStrategy");
        this.requestCount++;
        if (cacheStrategy.getNetworkRequest() != null) {
            this.networkCount++;
        } else if (cacheStrategy.getCacheResponse() != null) {
            this.hitCount++;
        }
    }

    public final void update$okhttp(Response response, Response response2) {
        j0.i(response, "cached");
        j0.i(response2, "network");
        Entry entry = new Entry(response2);
        ResponseBody responseBodyBody = response.body();
        Objects.requireNonNull(responseBodyBody, "null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
        DiskLruCache.Editor editorEdit = null;
        try {
            editorEdit = ((CacheResponseBody) responseBodyBody).getSnapshot().edit();
            if (editorEdit == null) {
                return;
            }
            entry.writeTo(editorEdit);
            editorEdit.commit();
        } catch (IOException unused) {
            abortQuietly(editorEdit);
        }
    }

    public final Iterator<String> urls() throws IOException {
        return new AnonymousClass1();
    }

    public final synchronized int writeAbortCount() {
        return this.writeAbortCount;
    }

    public final synchronized int writeSuccessCount() {
        return this.writeSuccessCount;
    }
}
