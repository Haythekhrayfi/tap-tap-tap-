package okhttp3.internal.http2;

import defpackage.a;
import fd.j0;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import okhttp3.Headers;
import okhttp3.internal.Util;
import qd.a0;
import qd.b0;
import qd.c;
import qd.f;
import qd.y;
import vc.g;

/* JADX INFO: loaded from: classes3.dex */
public final class Http2Stream {
    public static final Companion Companion = new Companion(null);
    public static final long EMIT_BUFFER_SIZE = 16384;
    private final Http2Connection connection;
    private ErrorCode errorCode;
    private IOException errorException;
    private boolean hasResponseHeaders;
    private final ArrayDeque<Headers> headersQueue;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f34296id;
    private long readBytesAcknowledged;
    private long readBytesTotal;
    private final StreamTimeout readTimeout;
    private final FramingSink sink;
    private final FramingSource source;
    private long writeBytesMaximum;
    private long writeBytesTotal;
    private final StreamTimeout writeTimeout;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public final class FramingSink implements y {
        private boolean closed;
        private boolean finished;
        private final c sendBuffer;
        private Headers trailers;

        public FramingSink(Http2Stream http2Stream, boolean z10) {
            j0.i(http2Stream, "this$0");
            Http2Stream.this = http2Stream;
            this.finished = z10;
            this.sendBuffer = new c();
        }

        public /* synthetic */ FramingSink(boolean z10, int i10, g gVar) {
            this(Http2Stream.this, (i10 & 1) != 0 ? false : z10);
        }

        private final void emitFrame(boolean z10) throws IOException {
            long jMin;
            boolean z11;
            Http2Stream http2Stream = Http2Stream.this;
            synchronized (http2Stream) {
                http2Stream.getWriteTimeout$okhttp().enter();
                while (http2Stream.getWriteBytesTotal() >= http2Stream.getWriteBytesMaximum() && !getFinished() && !getClosed() && http2Stream.getErrorCode$okhttp() == null) {
                    try {
                        http2Stream.waitForIo$okhttp();
                    } catch (Throwable th) {
                        http2Stream.getWriteTimeout$okhttp().exitAndThrowIfTimedOut();
                        throw th;
                    }
                }
                http2Stream.getWriteTimeout$okhttp().exitAndThrowIfTimedOut();
                http2Stream.checkOutNotClosed$okhttp();
                jMin = Math.min(http2Stream.getWriteBytesMaximum() - http2Stream.getWriteBytesTotal(), this.sendBuffer.f34879d);
                http2Stream.setWriteBytesTotal$okhttp(http2Stream.getWriteBytesTotal() + jMin);
                z11 = z10 && jMin == this.sendBuffer.f34879d;
            }
            Http2Stream.this.getWriteTimeout$okhttp().enter();
            try {
                Http2Stream.this.getConnection().writeData(Http2Stream.this.getId(), z11, this.sendBuffer, jMin);
            } finally {
                Http2Stream.this.getWriteTimeout$okhttp().exitAndThrowIfTimedOut();
            }
        }

        @Override // qd.y, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            Http2Stream http2Stream = Http2Stream.this;
            if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                StringBuilder sbA = a.a("Thread ");
                sbA.append((Object) Thread.currentThread().getName());
                sbA.append(" MUST NOT hold lock on ");
                sbA.append(http2Stream);
                throw new AssertionError(sbA.toString());
            }
            Http2Stream http2Stream2 = Http2Stream.this;
            synchronized (http2Stream2) {
                if (getClosed()) {
                    return;
                }
                boolean z10 = http2Stream2.getErrorCode$okhttp() == null;
                if (!Http2Stream.this.getSink$okhttp().finished) {
                    boolean z11 = this.sendBuffer.f34879d > 0;
                    if (this.trailers != null) {
                        while (this.sendBuffer.f34879d > 0) {
                            emitFrame(false);
                        }
                        Http2Connection connection = Http2Stream.this.getConnection();
                        int id2 = Http2Stream.this.getId();
                        Headers headers = this.trailers;
                        j0.f(headers);
                        connection.writeHeaders$okhttp(id2, z10, Util.toHeaderList(headers));
                    } else if (z11) {
                        while (this.sendBuffer.f34879d > 0) {
                            emitFrame(true);
                        }
                    } else if (z10) {
                        Http2Stream.this.getConnection().writeData(Http2Stream.this.getId(), true, null, 0L);
                    }
                }
                synchronized (Http2Stream.this) {
                    setClosed(true);
                }
                Http2Stream.this.getConnection().flush();
                Http2Stream.this.cancelStreamIfNecessary$okhttp();
            }
        }

        @Override // qd.y, java.io.Flushable
        public void flush() throws IOException {
            Http2Stream http2Stream = Http2Stream.this;
            if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                StringBuilder sbA = a.a("Thread ");
                sbA.append((Object) Thread.currentThread().getName());
                sbA.append(" MUST NOT hold lock on ");
                sbA.append(http2Stream);
                throw new AssertionError(sbA.toString());
            }
            Http2Stream http2Stream2 = Http2Stream.this;
            synchronized (http2Stream2) {
                http2Stream2.checkOutNotClosed$okhttp();
            }
            while (this.sendBuffer.f34879d > 0) {
                emitFrame(false);
                Http2Stream.this.getConnection().flush();
            }
        }

        public final boolean getClosed() {
            return this.closed;
        }

        public final boolean getFinished() {
            return this.finished;
        }

        public final Headers getTrailers() {
            return this.trailers;
        }

        public final void setClosed(boolean z10) {
            this.closed = z10;
        }

        public final void setFinished(boolean z10) {
            this.finished = z10;
        }

        public final void setTrailers(Headers headers) {
            this.trailers = headers;
        }

        @Override // qd.y
        public b0 timeout() {
            return Http2Stream.this.getWriteTimeout$okhttp();
        }

        @Override // qd.y
        public void write(c cVar, long j10) throws IOException {
            j0.i(cVar, "source");
            Http2Stream http2Stream = Http2Stream.this;
            if (!Util.assertionsEnabled || !Thread.holdsLock(http2Stream)) {
                this.sendBuffer.write(cVar, j10);
                while (this.sendBuffer.f34879d >= Http2Stream.EMIT_BUFFER_SIZE) {
                    emitFrame(false);
                }
            } else {
                StringBuilder sbA = a.a("Thread ");
                sbA.append((Object) Thread.currentThread().getName());
                sbA.append(" MUST NOT hold lock on ");
                sbA.append(http2Stream);
                throw new AssertionError(sbA.toString());
            }
        }
    }

    public final class FramingSource implements a0 {
        private boolean closed;
        private boolean finished;
        private final long maxByteCount;
        private final c readBuffer;
        private final c receiveBuffer;
        public final /* synthetic */ Http2Stream this$0;
        private Headers trailers;

        public FramingSource(Http2Stream http2Stream, long j10, boolean z10) {
            j0.i(http2Stream, "this$0");
            this.this$0 = http2Stream;
            this.maxByteCount = j10;
            this.finished = z10;
            this.receiveBuffer = new c();
            this.readBuffer = new c();
        }

        private final void updateConnectionFlowControl(long j10) {
            Http2Stream http2Stream = this.this$0;
            if (!Util.assertionsEnabled || !Thread.holdsLock(http2Stream)) {
                this.this$0.getConnection().updateConnectionFlowControl$okhttp(j10);
                return;
            }
            StringBuilder sbA = a.a("Thread ");
            sbA.append((Object) Thread.currentThread().getName());
            sbA.append(" MUST NOT hold lock on ");
            sbA.append(http2Stream);
            throw new AssertionError(sbA.toString());
        }

        @Override // qd.a0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            long j10;
            Http2Stream http2Stream = this.this$0;
            synchronized (http2Stream) {
                setClosed$okhttp(true);
                j10 = getReadBuffer().f34879d;
                c readBuffer = getReadBuffer();
                readBuffer.skip(readBuffer.f34879d);
                http2Stream.notifyAll();
            }
            if (j10 > 0) {
                updateConnectionFlowControl(j10);
            }
            this.this$0.cancelStreamIfNecessary$okhttp();
        }

        public final boolean getClosed$okhttp() {
            return this.closed;
        }

        public final boolean getFinished$okhttp() {
            return this.finished;
        }

        public final c getReadBuffer() {
            return this.readBuffer;
        }

        public final c getReceiveBuffer() {
            return this.receiveBuffer;
        }

        public final Headers getTrailers() {
            return this.trailers;
        }

        @Override // qd.a0
        public long read(c cVar, long j10) throws IOException {
            long j11;
            boolean z10;
            j0.i(cVar, "sink");
            long j12 = 0;
            if (!(j10 >= 0)) {
                throw new IllegalArgumentException(j0.p("byteCount < 0: ", Long.valueOf(j10)).toString());
            }
            while (true) {
                IOException errorException$okhttp = null;
                Http2Stream http2Stream = this.this$0;
                synchronized (http2Stream) {
                    http2Stream.getReadTimeout$okhttp().enter();
                    try {
                        if (http2Stream.getErrorCode$okhttp() != null && !getFinished$okhttp() && (errorException$okhttp = http2Stream.getErrorException$okhttp()) == null) {
                            ErrorCode errorCode$okhttp = http2Stream.getErrorCode$okhttp();
                            j0.f(errorCode$okhttp);
                            errorException$okhttp = new StreamResetException(errorCode$okhttp);
                        }
                        if (getClosed$okhttp()) {
                            throw new IOException("stream closed");
                        }
                        if (getReadBuffer().f34879d > j12) {
                            j11 = getReadBuffer().read(cVar, Math.min(j10, getReadBuffer().f34879d));
                            http2Stream.setReadBytesTotal$okhttp(http2Stream.getReadBytesTotal() + j11);
                            long readBytesTotal = http2Stream.getReadBytesTotal() - http2Stream.getReadBytesAcknowledged();
                            if (errorException$okhttp == null && readBytesTotal >= http2Stream.getConnection().getOkHttpSettings().getInitialWindowSize() / 2) {
                                http2Stream.getConnection().writeWindowUpdateLater$okhttp(http2Stream.getId(), readBytesTotal);
                                http2Stream.setReadBytesAcknowledged$okhttp(http2Stream.getReadBytesTotal());
                            }
                        } else {
                            if (getFinished$okhttp() || errorException$okhttp != null) {
                                j11 = -1;
                            } else {
                                http2Stream.waitForIo$okhttp();
                                j11 = -1;
                                z10 = true;
                            }
                            http2Stream.getReadTimeout$okhttp().exitAndThrowIfTimedOut();
                        }
                        z10 = false;
                        http2Stream.getReadTimeout$okhttp().exitAndThrowIfTimedOut();
                    } catch (Throwable th) {
                        http2Stream.getReadTimeout$okhttp().exitAndThrowIfTimedOut();
                        throw th;
                    }
                }
                if (!z10) {
                    if (j11 != -1) {
                        updateConnectionFlowControl(j11);
                        return j11;
                    }
                    if (errorException$okhttp == null) {
                        return -1L;
                    }
                    throw errorException$okhttp;
                }
                j12 = 0;
            }
        }

        public final void receive$okhttp(f fVar, long j10) throws IOException {
            boolean finished$okhttp;
            boolean z10;
            boolean z11;
            long j11;
            j0.i(fVar, "source");
            Http2Stream http2Stream = this.this$0;
            if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                StringBuilder sbA = a.a("Thread ");
                sbA.append((Object) Thread.currentThread().getName());
                sbA.append(" MUST NOT hold lock on ");
                sbA.append(http2Stream);
                throw new AssertionError(sbA.toString());
            }
            while (j10 > 0) {
                synchronized (this.this$0) {
                    finished$okhttp = getFinished$okhttp();
                    z10 = true;
                    z11 = getReadBuffer().f34879d + j10 > this.maxByteCount;
                }
                if (z11) {
                    fVar.skip(j10);
                    this.this$0.closeLater(ErrorCode.FLOW_CONTROL_ERROR);
                    return;
                }
                if (finished$okhttp) {
                    fVar.skip(j10);
                    return;
                }
                long j12 = fVar.read(this.receiveBuffer, j10);
                if (j12 == -1) {
                    throw new EOFException();
                }
                j10 -= j12;
                Http2Stream http2Stream2 = this.this$0;
                synchronized (http2Stream2) {
                    if (getClosed$okhttp()) {
                        j11 = getReceiveBuffer().f34879d;
                        c receiveBuffer = getReceiveBuffer();
                        receiveBuffer.skip(receiveBuffer.f34879d);
                    } else {
                        if (getReadBuffer().f34879d != 0) {
                            z10 = false;
                        }
                        getReadBuffer().v(getReceiveBuffer());
                        if (z10) {
                            http2Stream2.notifyAll();
                        }
                        j11 = 0;
                    }
                }
                if (j11 > 0) {
                    updateConnectionFlowControl(j11);
                }
            }
        }

        public final void setClosed$okhttp(boolean z10) {
            this.closed = z10;
        }

        public final void setFinished$okhttp(boolean z10) {
            this.finished = z10;
        }

        public final void setTrailers(Headers headers) {
            this.trailers = headers;
        }

        @Override // qd.a0
        public b0 timeout() {
            return this.this$0.getReadTimeout$okhttp();
        }
    }

    public final class StreamTimeout extends qd.a {
        public final /* synthetic */ Http2Stream this$0;

        public StreamTimeout(Http2Stream http2Stream) {
            j0.i(http2Stream, "this$0");
            this.this$0 = http2Stream;
        }

        public final void exitAndThrowIfTimedOut() throws IOException {
            if (exit()) {
                throw newTimeoutException(null);
            }
        }

        @Override // qd.a
        public IOException newTimeoutException(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // qd.a
        public void timedOut() {
            this.this$0.closeLater(ErrorCode.CANCEL);
            this.this$0.getConnection().sendDegradedPingLater$okhttp();
        }
    }

    public Http2Stream(int i10, Http2Connection http2Connection, boolean z10, boolean z11, Headers headers) {
        j0.i(http2Connection, "connection");
        this.f34296id = i10;
        this.connection = http2Connection;
        this.writeBytesMaximum = http2Connection.getPeerSettings().getInitialWindowSize();
        ArrayDeque<Headers> arrayDeque = new ArrayDeque<>();
        this.headersQueue = arrayDeque;
        this.source = new FramingSource(this, http2Connection.getOkHttpSettings().getInitialWindowSize(), z11);
        this.sink = new FramingSink(this, z10);
        this.readTimeout = new StreamTimeout(this);
        this.writeTimeout = new StreamTimeout(this);
        if (headers == null) {
            if (!isLocallyInitiated()) {
                throw new IllegalStateException("remotely-initiated streams should have headers".toString());
            }
        } else {
            if (!(!isLocallyInitiated())) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
            }
            arrayDeque.add(headers);
        }
    }

    private final boolean closeInternal(ErrorCode errorCode, IOException iOException) {
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            StringBuilder sbA = a.a("Thread ");
            sbA.append((Object) Thread.currentThread().getName());
            sbA.append(" MUST NOT hold lock on ");
            sbA.append(this);
            throw new AssertionError(sbA.toString());
        }
        synchronized (this) {
            if (getErrorCode$okhttp() != null) {
                return false;
            }
            if (getSource$okhttp().getFinished$okhttp() && getSink$okhttp().getFinished()) {
                return false;
            }
            setErrorCode$okhttp(errorCode);
            setErrorException$okhttp(iOException);
            notifyAll();
            this.connection.removeStream$okhttp(this.f34296id);
            return true;
        }
    }

    public final void addBytesToWriteWindow(long j10) {
        this.writeBytesMaximum += j10;
        if (j10 > 0) {
            notifyAll();
        }
    }

    public final void cancelStreamIfNecessary$okhttp() throws IOException {
        boolean z10;
        boolean zIsOpen;
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            StringBuilder sbA = a.a("Thread ");
            sbA.append((Object) Thread.currentThread().getName());
            sbA.append(" MUST NOT hold lock on ");
            sbA.append(this);
            throw new AssertionError(sbA.toString());
        }
        synchronized (this) {
            z10 = !getSource$okhttp().getFinished$okhttp() && getSource$okhttp().getClosed$okhttp() && (getSink$okhttp().getFinished() || getSink$okhttp().getClosed());
            zIsOpen = isOpen();
        }
        if (z10) {
            close(ErrorCode.CANCEL, null);
        } else {
            if (zIsOpen) {
                return;
            }
            this.connection.removeStream$okhttp(this.f34296id);
        }
    }

    public final void checkOutNotClosed$okhttp() throws IOException {
        if (this.sink.getClosed()) {
            throw new IOException("stream closed");
        }
        if (this.sink.getFinished()) {
            throw new IOException("stream finished");
        }
        if (this.errorCode != null) {
            IOException iOException = this.errorException;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode errorCode = this.errorCode;
            j0.f(errorCode);
            throw new StreamResetException(errorCode);
        }
    }

    public final void close(ErrorCode errorCode, IOException iOException) throws IOException {
        j0.i(errorCode, "rstStatusCode");
        if (closeInternal(errorCode, iOException)) {
            this.connection.writeSynReset$okhttp(this.f34296id, errorCode);
        }
    }

    public final void closeLater(ErrorCode errorCode) {
        j0.i(errorCode, "errorCode");
        if (closeInternal(errorCode, null)) {
            this.connection.writeSynResetLater$okhttp(this.f34296id, errorCode);
        }
    }

    public final void enqueueTrailers(Headers headers) {
        j0.i(headers, "trailers");
        synchronized (this) {
            boolean z10 = true;
            if (!(!getSink$okhttp().getFinished())) {
                throw new IllegalStateException("already finished".toString());
            }
            if (headers.size() == 0) {
                z10 = false;
            }
            if (!z10) {
                throw new IllegalArgumentException("trailers.size() == 0".toString());
            }
            getSink$okhttp().setTrailers(headers);
        }
    }

    public final Http2Connection getConnection() {
        return this.connection;
    }

    public final synchronized ErrorCode getErrorCode$okhttp() {
        return this.errorCode;
    }

    public final IOException getErrorException$okhttp() {
        return this.errorException;
    }

    public final int getId() {
        return this.f34296id;
    }

    public final long getReadBytesAcknowledged() {
        return this.readBytesAcknowledged;
    }

    public final long getReadBytesTotal() {
        return this.readBytesTotal;
    }

    public final StreamTimeout getReadTimeout$okhttp() {
        return this.readTimeout;
    }

    public final y getSink() {
        synchronized (this) {
            if (!(this.hasResponseHeaders || isLocallyInitiated())) {
                throw new IllegalStateException("reply before requesting the sink".toString());
            }
        }
        return this.sink;
    }

    public final FramingSink getSink$okhttp() {
        return this.sink;
    }

    public final a0 getSource() {
        return this.source;
    }

    public final FramingSource getSource$okhttp() {
        return this.source;
    }

    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    public final StreamTimeout getWriteTimeout$okhttp() {
        return this.writeTimeout;
    }

    public final boolean isLocallyInitiated() {
        return this.connection.getClient$okhttp() == ((this.f34296id & 1) == 1);
    }

    public final synchronized boolean isOpen() {
        if (this.errorCode != null) {
            return false;
        }
        return ((this.source.getFinished$okhttp() || this.source.getClosed$okhttp()) && (this.sink.getFinished() || this.sink.getClosed()) && this.hasResponseHeaders) ? false : true;
    }

    public final b0 readTimeout() {
        return this.readTimeout;
    }

    public final void receiveData(f fVar, int i10) throws IOException {
        j0.i(fVar, "source");
        if (!Util.assertionsEnabled || !Thread.holdsLock(this)) {
            this.source.receive$okhttp(fVar, i10);
            return;
        }
        StringBuilder sbA = a.a("Thread ");
        sbA.append((Object) Thread.currentThread().getName());
        sbA.append(" MUST NOT hold lock on ");
        sbA.append(this);
        throw new AssertionError(sbA.toString());
    }

    public final void receiveHeaders(Headers headers, boolean z10) {
        boolean zIsOpen;
        j0.i(headers, "headers");
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            StringBuilder sbA = a.a("Thread ");
            sbA.append((Object) Thread.currentThread().getName());
            sbA.append(" MUST NOT hold lock on ");
            sbA.append(this);
            throw new AssertionError(sbA.toString());
        }
        synchronized (this) {
            if (this.hasResponseHeaders && z10) {
                getSource$okhttp().setTrailers(headers);
            } else {
                this.hasResponseHeaders = true;
                this.headersQueue.add(headers);
            }
            if (z10) {
                getSource$okhttp().setFinished$okhttp(true);
            }
            zIsOpen = isOpen();
            notifyAll();
        }
        if (zIsOpen) {
            return;
        }
        this.connection.removeStream$okhttp(this.f34296id);
    }

    public final synchronized void receiveRstStream(ErrorCode errorCode) {
        j0.i(errorCode, "errorCode");
        if (this.errorCode == null) {
            this.errorCode = errorCode;
            notifyAll();
        }
    }

    public final void setErrorCode$okhttp(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    public final void setErrorException$okhttp(IOException iOException) {
        this.errorException = iOException;
    }

    public final void setReadBytesAcknowledged$okhttp(long j10) {
        this.readBytesAcknowledged = j10;
    }

    public final void setReadBytesTotal$okhttp(long j10) {
        this.readBytesTotal = j10;
    }

    public final void setWriteBytesMaximum$okhttp(long j10) {
        this.writeBytesMaximum = j10;
    }

    public final void setWriteBytesTotal$okhttp(long j10) {
        this.writeBytesTotal = j10;
    }

    public final synchronized Headers takeHeaders() throws IOException {
        Headers headersRemoveFirst;
        this.readTimeout.enter();
        while (this.headersQueue.isEmpty() && this.errorCode == null) {
            try {
                waitForIo$okhttp();
            } catch (Throwable th) {
                this.readTimeout.exitAndThrowIfTimedOut();
                throw th;
            }
        }
        this.readTimeout.exitAndThrowIfTimedOut();
        if (!(!this.headersQueue.isEmpty())) {
            IOException iOException = this.errorException;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode errorCode = this.errorCode;
            j0.f(errorCode);
            throw new StreamResetException(errorCode);
        }
        headersRemoveFirst = this.headersQueue.removeFirst();
        j0.h(headersRemoveFirst, "headersQueue.removeFirst()");
        return headersRemoveFirst;
    }

    public final synchronized Headers trailers() throws IOException {
        Headers trailers;
        if (!this.source.getFinished$okhttp() || !this.source.getReceiveBuffer().y() || !this.source.getReadBuffer().y()) {
            if (this.errorCode == null) {
                throw new IllegalStateException("too early; can't read the trailers yet");
            }
            IOException iOException = this.errorException;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode errorCode = this.errorCode;
            j0.f(errorCode);
            throw new StreamResetException(errorCode);
        }
        trailers = this.source.getTrailers();
        if (trailers == null) {
            trailers = Util.EMPTY_HEADERS;
        }
        return trailers;
    }

    public final void waitForIo$okhttp() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final void writeHeaders(List<Header> list, boolean z10, boolean z11) throws IOException {
        boolean z12;
        j0.i(list, "responseHeaders");
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            StringBuilder sbA = a.a("Thread ");
            sbA.append((Object) Thread.currentThread().getName());
            sbA.append(" MUST NOT hold lock on ");
            sbA.append(this);
            throw new AssertionError(sbA.toString());
        }
        synchronized (this) {
            this.hasResponseHeaders = true;
            if (z10) {
                getSink$okhttp().setFinished(true);
            }
        }
        if (!z11) {
            synchronized (this.connection) {
                z12 = getConnection().getWriteBytesTotal() >= getConnection().getWriteBytesMaximum();
            }
            z11 = z12;
        }
        this.connection.writeHeaders$okhttp(this.f34296id, z10, list);
        if (z11) {
            this.connection.flush();
        }
    }

    public final b0 writeTimeout() {
        return this.writeTimeout;
    }
}
