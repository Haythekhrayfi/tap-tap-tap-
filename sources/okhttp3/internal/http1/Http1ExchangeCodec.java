package okhttp3.internal.http1;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.ImagesContract;
import ed.q;
import ed.u;
import fd.j0;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
import qd.a0;
import qd.b0;
import qd.c;
import qd.e;
import qd.f;
import qd.k;
import qd.y;
import vc.g;

/* JADX INFO: loaded from: classes3.dex */
public final class Http1ExchangeCodec implements ExchangeCodec {
    public static final Companion Companion = new Companion(null);
    private static final long NO_CHUNK_YET = -1;
    private static final int STATE_CLOSED = 6;
    private static final int STATE_IDLE = 0;
    private static final int STATE_OPEN_REQUEST_BODY = 1;
    private static final int STATE_OPEN_RESPONSE_BODY = 4;
    private static final int STATE_READING_RESPONSE_BODY = 5;
    private static final int STATE_READ_RESPONSE_HEADERS = 3;
    private static final int STATE_WRITING_REQUEST_BODY = 2;
    private final OkHttpClient client;
    private final RealConnection connection;
    private final HeadersReader headersReader;
    private final e sink;
    private final f source;
    private int state;
    private Headers trailers;

    public abstract class AbstractSource implements a0 {
        private boolean closed;
        public final /* synthetic */ Http1ExchangeCodec this$0;
        private final k timeout;

        public AbstractSource(Http1ExchangeCodec http1ExchangeCodec) {
            j0.i(http1ExchangeCodec, "this$0");
            this.this$0 = http1ExchangeCodec;
            this.timeout = new k(http1ExchangeCodec.source.timeout());
        }

        @Override // qd.a0, java.io.Closeable, java.lang.AutoCloseable
        public abstract /* synthetic */ void close() throws IOException;

        public final boolean getClosed() {
            return this.closed;
        }

        public final k getTimeout() {
            return this.timeout;
        }

        @Override // qd.a0
        public long read(c cVar, long j10) throws IOException {
            j0.i(cVar, "sink");
            try {
                return this.this$0.source.read(cVar, j10);
            } catch (IOException e10) {
                this.this$0.getConnection().noNewExchanges$okhttp();
                responseBodyComplete();
                throw e10;
            }
        }

        public final void responseBodyComplete() {
            if (this.this$0.state == 6) {
                return;
            }
            if (this.this$0.state != 5) {
                throw new IllegalStateException(j0.p("state: ", Integer.valueOf(this.this$0.state)));
            }
            this.this$0.detachTimeout(this.timeout);
            this.this$0.state = 6;
        }

        public final void setClosed(boolean z10) {
            this.closed = z10;
        }

        @Override // qd.a0
        public b0 timeout() {
            return this.timeout;
        }
    }

    public final class ChunkedSink implements y {
        private boolean closed;
        public final /* synthetic */ Http1ExchangeCodec this$0;
        private final k timeout;

        public ChunkedSink(Http1ExchangeCodec http1ExchangeCodec) {
            j0.i(http1ExchangeCodec, "this$0");
            this.this$0 = http1ExchangeCodec;
            this.timeout = new k(http1ExchangeCodec.sink.timeout());
        }

        @Override // qd.y, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            this.this$0.sink.E("0\r\n\r\n");
            this.this$0.detachTimeout(this.timeout);
            this.this$0.state = 3;
        }

        @Override // qd.y, java.io.Flushable
        public synchronized void flush() {
            if (this.closed) {
                return;
            }
            this.this$0.sink.flush();
        }

        @Override // qd.y
        public b0 timeout() {
            return this.timeout;
        }

        @Override // qd.y
        public void write(c cVar, long j10) throws IOException {
            j0.i(cVar, "source");
            if (!(!this.closed)) {
                throw new IllegalStateException("closed".toString());
            }
            if (j10 == 0) {
                return;
            }
            this.this$0.sink.H(j10);
            this.this$0.sink.E("\r\n");
            this.this$0.sink.write(cVar, j10);
            this.this$0.sink.E("\r\n");
        }
    }

    public final class ChunkedSource extends AbstractSource {
        private long bytesRemainingInChunk;
        private boolean hasMoreChunks;
        public final /* synthetic */ Http1ExchangeCodec this$0;
        private final HttpUrl url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChunkedSource(Http1ExchangeCodec http1ExchangeCodec, HttpUrl httpUrl) {
            super(http1ExchangeCodec);
            j0.i(http1ExchangeCodec, "this$0");
            j0.i(httpUrl, ImagesContract.URL);
            this.this$0 = http1ExchangeCodec;
            this.url = httpUrl;
            this.bytesRemainingInChunk = -1L;
            this.hasMoreChunks = true;
        }

        private final void readChunkSize() throws IOException {
            if (this.bytesRemainingInChunk != -1) {
                this.this$0.source.M();
            }
            try {
                this.bytesRemainingInChunk = this.this$0.source.Z();
                String string = u.Y(this.this$0.source.M()).toString();
                if (this.bytesRemainingInChunk >= 0) {
                    if (!(string.length() > 0) || q.u(string, ";", false, 2)) {
                        if (this.bytesRemainingInChunk == 0) {
                            this.hasMoreChunks = false;
                            Http1ExchangeCodec http1ExchangeCodec = this.this$0;
                            http1ExchangeCodec.trailers = http1ExchangeCodec.headersReader.readHeaders();
                            OkHttpClient okHttpClient = this.this$0.client;
                            j0.f(okHttpClient);
                            CookieJar cookieJar = okHttpClient.cookieJar();
                            HttpUrl httpUrl = this.url;
                            Headers headers = this.this$0.trailers;
                            j0.f(headers);
                            HttpHeaders.receiveHeaders(cookieJar, httpUrl, headers);
                            responseBodyComplete();
                            return;
                        }
                        return;
                    }
                }
                throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.bytesRemainingInChunk + string + CoreConstants.DOUBLE_QUOTE_CHAR);
            } catch (NumberFormatException e10) {
                throw new ProtocolException(e10.getMessage());
            }
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, qd.a0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (this.hasMoreChunks && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                this.this$0.getConnection().noNewExchanges$okhttp();
                responseBodyComplete();
            }
            setClosed(true);
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, qd.a0
        public long read(c cVar, long j10) throws IOException {
            j0.i(cVar, "sink");
            if (!(j10 >= 0)) {
                throw new IllegalArgumentException(j0.p("byteCount < 0: ", Long.valueOf(j10)).toString());
            }
            if (!(!getClosed())) {
                throw new IllegalStateException("closed".toString());
            }
            if (!this.hasMoreChunks) {
                return -1L;
            }
            long j11 = this.bytesRemainingInChunk;
            if (j11 == 0 || j11 == -1) {
                readChunkSize();
                if (!this.hasMoreChunks) {
                    return -1L;
                }
            }
            long j12 = super.read(cVar, Math.min(j10, this.bytesRemainingInChunk));
            if (j12 != -1) {
                this.bytesRemainingInChunk -= j12;
                return j12;
            }
            this.this$0.getConnection().noNewExchanges$okhttp();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            responseBodyComplete();
            throw protocolException;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public final class FixedLengthSource extends AbstractSource {
        private long bytesRemaining;
        public final /* synthetic */ Http1ExchangeCodec this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FixedLengthSource(Http1ExchangeCodec http1ExchangeCodec, long j10) {
            super(http1ExchangeCodec);
            j0.i(http1ExchangeCodec, "this$0");
            this.this$0 = http1ExchangeCodec;
            this.bytesRemaining = j10;
            if (j10 == 0) {
                responseBodyComplete();
            }
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, qd.a0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (this.bytesRemaining != 0 && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                this.this$0.getConnection().noNewExchanges$okhttp();
                responseBodyComplete();
            }
            setClosed(true);
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, qd.a0
        public long read(c cVar, long j10) throws IOException {
            j0.i(cVar, "sink");
            if (!(j10 >= 0)) {
                throw new IllegalArgumentException(j0.p("byteCount < 0: ", Long.valueOf(j10)).toString());
            }
            if (!(!getClosed())) {
                throw new IllegalStateException("closed".toString());
            }
            long j11 = this.bytesRemaining;
            if (j11 == 0) {
                return -1L;
            }
            long j12 = super.read(cVar, Math.min(j11, j10));
            if (j12 == -1) {
                this.this$0.getConnection().noNewExchanges$okhttp();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                responseBodyComplete();
                throw protocolException;
            }
            long j13 = this.bytesRemaining - j12;
            this.bytesRemaining = j13;
            if (j13 == 0) {
                responseBodyComplete();
            }
            return j12;
        }
    }

    public final class KnownLengthSink implements y {
        private boolean closed;
        public final /* synthetic */ Http1ExchangeCodec this$0;
        private final k timeout;

        public KnownLengthSink(Http1ExchangeCodec http1ExchangeCodec) {
            j0.i(http1ExchangeCodec, "this$0");
            this.this$0 = http1ExchangeCodec;
            this.timeout = new k(http1ExchangeCodec.sink.timeout());
        }

        @Override // qd.y, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            this.this$0.detachTimeout(this.timeout);
            this.this$0.state = 3;
        }

        @Override // qd.y, java.io.Flushable
        public void flush() throws IOException {
            if (this.closed) {
                return;
            }
            this.this$0.sink.flush();
        }

        @Override // qd.y
        public b0 timeout() {
            return this.timeout;
        }

        @Override // qd.y
        public void write(c cVar, long j10) throws IOException {
            j0.i(cVar, "source");
            if (!(!this.closed)) {
                throw new IllegalStateException("closed".toString());
            }
            Util.checkOffsetAndCount(cVar.f34879d, 0L, j10);
            this.this$0.sink.write(cVar, j10);
        }
    }

    public final class UnknownLengthSource extends AbstractSource {
        private boolean inputExhausted;
        public final /* synthetic */ Http1ExchangeCodec this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnknownLengthSource(Http1ExchangeCodec http1ExchangeCodec) {
            super(http1ExchangeCodec);
            j0.i(http1ExchangeCodec, "this$0");
            this.this$0 = http1ExchangeCodec;
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, qd.a0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (!this.inputExhausted) {
                responseBodyComplete();
            }
            setClosed(true);
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, qd.a0
        public long read(c cVar, long j10) throws IOException {
            j0.i(cVar, "sink");
            if (!(j10 >= 0)) {
                throw new IllegalArgumentException(j0.p("byteCount < 0: ", Long.valueOf(j10)).toString());
            }
            if (!(!getClosed())) {
                throw new IllegalStateException("closed".toString());
            }
            if (this.inputExhausted) {
                return -1L;
            }
            long j11 = super.read(cVar, j10);
            if (j11 != -1) {
                return j11;
            }
            this.inputExhausted = true;
            responseBodyComplete();
            return -1L;
        }
    }

    public Http1ExchangeCodec(OkHttpClient okHttpClient, RealConnection realConnection, f fVar, e eVar) {
        j0.i(realConnection, "connection");
        j0.i(fVar, "source");
        j0.i(eVar, "sink");
        this.client = okHttpClient;
        this.connection = realConnection;
        this.source = fVar;
        this.sink = eVar;
        this.headersReader = new HeadersReader(fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void detachTimeout(k kVar) {
        b0 b0Var = kVar.f34900a;
        b0 b0Var2 = b0.NONE;
        j0.i(b0Var2, "delegate");
        kVar.f34900a = b0Var2;
        b0Var.clearDeadline();
        b0Var.clearTimeout();
    }

    private final boolean isChunked(Request request) {
        return q.i("chunked", request.header("Transfer-Encoding"), true);
    }

    private final boolean isChunked(Response response) {
        return q.i("chunked", Response.header$default(response, "Transfer-Encoding", null, 2, null), true);
    }

    private final y newChunkedSink() {
        int i10 = this.state;
        if (!(i10 == 1)) {
            throw new IllegalStateException(j0.p("state: ", Integer.valueOf(i10)).toString());
        }
        this.state = 2;
        return new ChunkedSink(this);
    }

    private final a0 newChunkedSource(HttpUrl httpUrl) {
        int i10 = this.state;
        if (!(i10 == 4)) {
            throw new IllegalStateException(j0.p("state: ", Integer.valueOf(i10)).toString());
        }
        this.state = 5;
        return new ChunkedSource(this, httpUrl);
    }

    private final a0 newFixedLengthSource(long j10) {
        int i10 = this.state;
        if (!(i10 == 4)) {
            throw new IllegalStateException(j0.p("state: ", Integer.valueOf(i10)).toString());
        }
        this.state = 5;
        return new FixedLengthSource(this, j10);
    }

    private final y newKnownLengthSink() {
        int i10 = this.state;
        if (!(i10 == 1)) {
            throw new IllegalStateException(j0.p("state: ", Integer.valueOf(i10)).toString());
        }
        this.state = 2;
        return new KnownLengthSink(this);
    }

    private final a0 newUnknownLengthSource() {
        int i10 = this.state;
        if (!(i10 == 4)) {
            throw new IllegalStateException(j0.p("state: ", Integer.valueOf(i10)).toString());
        }
        this.state = 5;
        getConnection().noNewExchanges$okhttp();
        return new UnknownLengthSource(this);
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void cancel() {
        getConnection().cancel();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public y createRequestBody(Request request, long j10) throws ProtocolException {
        j0.i(request, "request");
        if (request.body() != null && request.body().isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (isChunked(request)) {
            return newChunkedSink();
        }
        if (j10 != -1) {
            return newKnownLengthSink();
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void finishRequest() {
        this.sink.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void flushRequest() throws IOException {
        this.sink.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public RealConnection getConnection() {
        return this.connection;
    }

    public final boolean isClosed() {
        return this.state == 6;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public a0 openResponseBodySource(Response response) {
        long jHeadersContentLength;
        j0.i(response, "response");
        if (!HttpHeaders.promisesBody(response)) {
            jHeadersContentLength = 0;
        } else {
            if (isChunked(response)) {
                return newChunkedSource(response.request().url());
            }
            jHeadersContentLength = Util.headersContentLength(response);
            if (jHeadersContentLength == -1) {
                return newUnknownLengthSource();
            }
        }
        return newFixedLengthSource(jHeadersContentLength);
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public Response.Builder readResponseHeaders(boolean z10) {
        int i10 = this.state;
        boolean z11 = false;
        if (!(i10 == 1 || i10 == 2 || i10 == 3)) {
            throw new IllegalStateException(j0.p("state: ", Integer.valueOf(i10)).toString());
        }
        try {
            StatusLine statusLine = StatusLine.Companion.parse(this.headersReader.readLine());
            Response.Builder builderHeaders = new Response.Builder().protocol(statusLine.protocol).code(statusLine.code).message(statusLine.message).headers(this.headersReader.readHeaders());
            if (z10 && statusLine.code == 100) {
                return null;
            }
            int i11 = statusLine.code;
            if (i11 != 100) {
                if (102 <= i11 && i11 < 200) {
                    z11 = true;
                }
                if (!z11) {
                    this.state = 4;
                    return builderHeaders;
                }
            }
            this.state = 3;
            return builderHeaders;
        } catch (EOFException e10) {
            throw new IOException(j0.p("unexpected end of stream on ", getConnection().route().address().url().redact()), e10);
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public long reportedContentLength(Response response) {
        j0.i(response, "response");
        if (!HttpHeaders.promisesBody(response)) {
            return 0L;
        }
        if (isChunked(response)) {
            return -1L;
        }
        return Util.headersContentLength(response);
    }

    public final void skipConnectBody(Response response) {
        j0.i(response, "response");
        long jHeadersContentLength = Util.headersContentLength(response);
        if (jHeadersContentLength == -1) {
            return;
        }
        a0 a0VarNewFixedLengthSource = newFixedLengthSource(jHeadersContentLength);
        Util.skipAll(a0VarNewFixedLengthSource, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        a0VarNewFixedLengthSource.close();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public Headers trailers() {
        if (!(this.state == 6)) {
            throw new IllegalStateException("too early; can't read the trailers yet".toString());
        }
        Headers headers = this.trailers;
        return headers == null ? Util.EMPTY_HEADERS : headers;
    }

    public final void writeRequest(Headers headers, String str) {
        j0.i(headers, "headers");
        j0.i(str, "requestLine");
        int i10 = this.state;
        if (!(i10 == 0)) {
            throw new IllegalStateException(j0.p("state: ", Integer.valueOf(i10)).toString());
        }
        this.sink.E(str).E("\r\n");
        int size = headers.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.sink.E(headers.name(i11)).E(": ").E(headers.value(i11)).E("\r\n");
        }
        this.sink.E("\r\n");
        this.state = 1;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void writeRequestHeaders(Request request) {
        j0.i(request, "request");
        RequestLine requestLine = RequestLine.INSTANCE;
        Proxy.Type type = getConnection().route().proxy().type();
        j0.h(type, "connection.route().proxy.type()");
        writeRequest(request.headers(), requestLine.get(request, type));
    }
}
