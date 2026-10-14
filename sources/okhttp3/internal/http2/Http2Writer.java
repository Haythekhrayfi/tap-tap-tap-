package okhttp3.internal.http2;

import defpackage.a;
import fd.j0;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.Util;
import qd.c;
import qd.e;
import vc.g;

/* JADX INFO: loaded from: classes3.dex */
public final class Http2Writer implements Closeable {
    public static final Companion Companion = new Companion(null);
    private static final Logger logger = Logger.getLogger(Http2.class.getName());
    private final boolean client;
    private boolean closed;
    private final c hpackBuffer;
    private final Hpack.Writer hpackWriter;
    private int maxFrameSize;
    private final e sink;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public Http2Writer(e eVar, boolean z10) {
        j0.i(eVar, "sink");
        this.sink = eVar;
        this.client = z10;
        c cVar = new c();
        this.hpackBuffer = cVar;
        this.maxFrameSize = Http2.INITIAL_MAX_FRAME_SIZE;
        this.hpackWriter = new Hpack.Writer(0, false, cVar, 3, null);
    }

    private final void writeContinuationFrames(int i10, long j10) throws IOException {
        while (j10 > 0) {
            long jMin = Math.min(this.maxFrameSize, j10);
            j10 -= jMin;
            frameHeader(i10, (int) jMin, 9, j10 == 0 ? 4 : 0);
            this.sink.write(this.hpackBuffer, jMin);
        }
    }

    public final synchronized void applyAndAckSettings(Settings settings) throws IOException {
        j0.i(settings, "peerSettings");
        if (this.closed) {
            throw new IOException("closed");
        }
        this.maxFrameSize = settings.getMaxFrameSize(this.maxFrameSize);
        if (settings.getHeaderTableSize() != -1) {
            this.hpackWriter.resizeHeaderTable(settings.getHeaderTableSize());
        }
        frameHeader(0, 0, 4, 1);
        this.sink.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.closed = true;
        this.sink.close();
    }

    public final synchronized void connectionPreface() throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        }
        if (this.client) {
            Logger logger2 = logger;
            if (logger2.isLoggable(Level.FINE)) {
                logger2.fine(Util.format(j0.p(">> CONNECTION ", Http2.CONNECTION_PREFACE.d()), new Object[0]));
            }
            this.sink.w(Http2.CONNECTION_PREFACE);
            this.sink.flush();
        }
    }

    public final synchronized void data(boolean z10, int i10, c cVar, int i11) throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        }
        dataFrame(i10, z10 ? 1 : 0, cVar, i11);
    }

    public final void dataFrame(int i10, int i11, c cVar, int i12) throws IOException {
        frameHeader(i10, i12, 0, i11);
        if (i12 > 0) {
            e eVar = this.sink;
            j0.f(cVar);
            eVar.write(cVar, i12);
        }
    }

    public final synchronized void flush() throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        }
        this.sink.flush();
    }

    public final void frameHeader(int i10, int i11, int i12, int i13) throws IOException {
        Logger logger2 = logger;
        if (logger2.isLoggable(Level.FINE)) {
            logger2.fine(Http2.INSTANCE.frameLog(false, i10, i11, i12, i13));
        }
        if (!(i11 <= this.maxFrameSize)) {
            StringBuilder sbA = a.a("FRAME_SIZE_ERROR length > ");
            sbA.append(this.maxFrameSize);
            sbA.append(": ");
            sbA.append(i11);
            throw new IllegalArgumentException(sbA.toString().toString());
        }
        if (!((Integer.MIN_VALUE & i10) == 0)) {
            throw new IllegalArgumentException(j0.p("reserved bit set: ", Integer.valueOf(i10)).toString());
        }
        Util.writeMedium(this.sink, i11);
        this.sink.z(i12 & 255);
        this.sink.z(i13 & 255);
        this.sink.u(i10 & Integer.MAX_VALUE);
    }

    public final Hpack.Writer getHpackWriter() {
        return this.hpackWriter;
    }

    public final synchronized void goAway(int i10, ErrorCode errorCode, byte[] bArr) throws IOException {
        j0.i(errorCode, "errorCode");
        j0.i(bArr, "debugData");
        if (this.closed) {
            throw new IOException("closed");
        }
        if (!(errorCode.getHttpCode() != -1)) {
            throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
        }
        frameHeader(0, bArr.length + 8, 7, 0);
        this.sink.u(i10);
        this.sink.u(errorCode.getHttpCode());
        if (!(bArr.length == 0)) {
            this.sink.Q(bArr);
        }
        this.sink.flush();
    }

    public final synchronized void headers(boolean z10, int i10, List<Header> list) throws IOException {
        j0.i(list, "headerBlock");
        if (this.closed) {
            throw new IOException("closed");
        }
        this.hpackWriter.writeHeaders(list);
        long j10 = this.hpackBuffer.f34879d;
        long jMin = Math.min(this.maxFrameSize, j10);
        int i11 = j10 == jMin ? 4 : 0;
        if (z10) {
            i11 |= 1;
        }
        frameHeader(i10, (int) jMin, 1, i11);
        this.sink.write(this.hpackBuffer, jMin);
        if (j10 > jMin) {
            writeContinuationFrames(i10, j10 - jMin);
        }
    }

    public final int maxDataLength() {
        return this.maxFrameSize;
    }

    public final synchronized void ping(boolean z10, int i10, int i11) throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        }
        frameHeader(0, 8, 6, z10 ? 1 : 0);
        this.sink.u(i10);
        this.sink.u(i11);
        this.sink.flush();
    }

    public final synchronized void pushPromise(int i10, int i11, List<Header> list) throws IOException {
        j0.i(list, "requestHeaders");
        if (this.closed) {
            throw new IOException("closed");
        }
        this.hpackWriter.writeHeaders(list);
        long j10 = this.hpackBuffer.f34879d;
        int iMin = (int) Math.min(((long) this.maxFrameSize) - 4, j10);
        long j11 = iMin;
        frameHeader(i10, iMin + 4, 5, j10 == j11 ? 4 : 0);
        this.sink.u(i11 & Integer.MAX_VALUE);
        this.sink.write(this.hpackBuffer, j11);
        if (j10 > j11) {
            writeContinuationFrames(i10, j10 - j11);
        }
    }

    public final synchronized void rstStream(int i10, ErrorCode errorCode) throws IOException {
        j0.i(errorCode, "errorCode");
        if (this.closed) {
            throw new IOException("closed");
        }
        if (!(errorCode.getHttpCode() != -1)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        frameHeader(i10, 4, 3, 0);
        this.sink.u(errorCode.getHttpCode());
        this.sink.flush();
    }

    public final synchronized void settings(Settings settings) throws IOException {
        int i10;
        j0.i(settings, "settings");
        if (this.closed) {
            throw new IOException("closed");
        }
        int i11 = 0;
        frameHeader(0, settings.size() * 6, 4, 0);
        while (i11 < 10) {
            int i12 = i11 + 1;
            if (settings.isSet(i11)) {
                if (i11 != 4) {
                    i10 = i11 != 7 ? i11 : 4;
                } else {
                    i10 = 3;
                }
                this.sink.t(i10);
                this.sink.u(settings.get(i11));
            }
            i11 = i12;
        }
        this.sink.flush();
    }

    public final synchronized void windowUpdate(int i10, long j10) throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        }
        if (!(j10 != 0 && j10 <= 2147483647L)) {
            throw new IllegalArgumentException(j0.p("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: ", Long.valueOf(j10)).toString());
        }
        frameHeader(i10, 4, 8, 0);
        this.sink.u((int) j10);
        this.sink.flush();
    }
}
