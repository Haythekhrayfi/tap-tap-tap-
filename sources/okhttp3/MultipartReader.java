package okhttp3;

import ch.qos.logback.classic.net.SyslogAppender;
import ch.qos.logback.core.FileAppender;
import fd.j0;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.http1.HeadersReader;
import qd.a0;
import qd.b0;
import qd.c;
import qd.f;
import qd.g;
import qd.o;
import qd.q;
import qd.v;
import rd.a;

/* JADX INFO: loaded from: classes3.dex */
public final class MultipartReader implements Closeable {
    public static final Companion Companion = new Companion(null);
    private static final q afterBoundaryOptions;
    private final String boundary;
    private boolean closed;
    private final g crlfDashDashBoundary;
    private PartSource currentPart;
    private final g dashDashBoundary;
    private boolean noMoreParts;
    private int partCount;
    private final f source;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(vc.g gVar) {
            this();
        }

        public final q getAfterBoundaryOptions() {
            return MultipartReader.afterBoundaryOptions;
        }
    }

    public static final class Part implements Closeable {
        private final f body;
        private final Headers headers;

        public Part(Headers headers, f fVar) {
            j0.i(headers, "headers");
            j0.i(fVar, "body");
            this.headers = headers;
            this.body = fVar;
        }

        public final f body() {
            return this.body;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.body.close();
        }

        public final Headers headers() {
            return this.headers;
        }
    }

    public final class PartSource implements a0 {
        public final /* synthetic */ MultipartReader this$0;
        private final b0 timeout;

        public PartSource(MultipartReader multipartReader) {
            j0.i(multipartReader, "this$0");
            this.this$0 = multipartReader;
            this.timeout = new b0();
        }

        @Override // qd.a0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (j0.d(this.this$0.currentPart, this)) {
                this.this$0.currentPart = null;
            }
        }

        @Override // qd.a0
        public long read(c cVar, long j10) {
            j0.i(cVar, "sink");
            if (!(j10 >= 0)) {
                throw new IllegalArgumentException(j0.p("byteCount < 0: ", Long.valueOf(j10)).toString());
            }
            if (!j0.d(this.this$0.currentPart, this)) {
                throw new IllegalStateException("closed".toString());
            }
            b0 b0VarTimeout = this.this$0.source.timeout();
            b0 b0Var = this.timeout;
            MultipartReader multipartReader = this.this$0;
            long jTimeoutNanos = b0VarTimeout.timeoutNanos();
            b0VarTimeout.timeout(b0.Companion.a(b0Var.timeoutNanos(), b0VarTimeout.timeoutNanos()), TimeUnit.NANOSECONDS);
            if (!b0VarTimeout.hasDeadline()) {
                if (b0Var.hasDeadline()) {
                    b0VarTimeout.deadlineNanoTime(b0Var.deadlineNanoTime());
                }
                try {
                    long jCurrentPartBytesRemaining = multipartReader.currentPartBytesRemaining(j10);
                    return jCurrentPartBytesRemaining == 0 ? -1L : multipartReader.source.read(cVar, jCurrentPartBytesRemaining);
                } finally {
                    b0VarTimeout.timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
                    if (b0Var.hasDeadline()) {
                        b0VarTimeout.clearDeadline();
                    }
                }
            }
            long jDeadlineNanoTime = b0VarTimeout.deadlineNanoTime();
            if (b0Var.hasDeadline()) {
                b0VarTimeout.deadlineNanoTime(Math.min(b0VarTimeout.deadlineNanoTime(), b0Var.deadlineNanoTime()));
            }
            try {
                long jCurrentPartBytesRemaining2 = multipartReader.currentPartBytesRemaining(j10);
                return jCurrentPartBytesRemaining2 == 0 ? -1L : multipartReader.source.read(cVar, jCurrentPartBytesRemaining2);
            } finally {
                b0VarTimeout.timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
                if (b0Var.hasDeadline()) {
                    b0VarTimeout.deadlineNanoTime(jDeadlineNanoTime);
                }
            }
        }

        @Override // qd.a0
        public b0 timeout() {
            return this.timeout;
        }
    }

    static {
        q.a aVar = q.f34913f;
        g.a aVar2 = g.f34892f;
        afterBoundaryOptions = aVar.c(aVar2.d("\r\n"), aVar2.d("--"), aVar2.d(" "), aVar2.d(SyslogAppender.DEFAULT_STACKTRACE_PATTERN));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MultipartReader(ResponseBody responseBody) throws IOException {
        j0.i(responseBody, "response");
        f fVarSource = responseBody.source();
        MediaType mediaTypeContentType = responseBody.contentType();
        String strParameter = mediaTypeContentType == null ? null : mediaTypeContentType.parameter("boundary");
        if (strParameter == null) {
            throw new ProtocolException("expected the Content-Type to have a boundary parameter");
        }
        this(fVarSource, strParameter);
    }

    public MultipartReader(f fVar, String str) throws IOException {
        j0.i(fVar, "source");
        j0.i(str, "boundary");
        this.source = fVar;
        this.boundary = str;
        c cVar = new c();
        cVar.e0("--");
        cVar.e0(str);
        this.dashDashBoundary = cVar.I();
        c cVar2 = new c();
        cVar2.e0("\r\n--");
        cVar2.e0(str);
        this.crlfDashDashBoundary = cVar2.I();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long currentPartBytesRemaining(long j10) throws IOException {
        long jC;
        byte[] bArr;
        byte[] bArr2;
        this.source.U(this.crlfDashDashBoundary.c());
        c cVarR = this.source.r();
        g gVar = this.crlfDashDashBoundary;
        Objects.requireNonNull(cVarR);
        j0.i(gVar, "bytes");
        j0.i(gVar, "bytes");
        if (!(gVar.c() > 0)) {
            throw new IllegalArgumentException("bytes is empty".toString());
        }
        v vVar = cVarR.f34878c;
        if (vVar != null) {
            long j11 = cVarR.f34879d;
            if (j11 - 0 >= 0) {
                long j12 = 0;
                while (true) {
                    long j13 = ((long) (vVar.f34933c - vVar.f34932b)) + j12;
                    if (j13 > 0) {
                        break;
                    }
                    vVar = vVar.f34936f;
                    j0.f(vVar);
                    j12 = j13;
                }
                byte[] bArrE = gVar.e();
                byte b10 = bArrE[0];
                int iC = gVar.c();
                long j14 = (cVarR.f34879d - ((long) iC)) + 1;
                long j15 = 0;
                loop4: while (true) {
                    if (j12 >= j14) {
                        jC = -1;
                        break;
                    }
                    byte[] bArr3 = vVar.f34931a;
                    byte[] bArr4 = bArrE;
                    int iMin = (int) Math.min(vVar.f34933c, (((long) vVar.f34932b) + j14) - j12);
                    int i10 = (int) ((((long) vVar.f34932b) + j15) - j12);
                    while (i10 < iMin) {
                        if (bArr3[i10] == b10) {
                            bArr = bArr4;
                            if (a.a(vVar, i10 + 1, bArr, 1, iC)) {
                                jC = ((long) (i10 - vVar.f34932b)) + j12;
                                break loop4;
                            }
                        } else {
                            bArr = bArr4;
                        }
                        i10++;
                        bArr4 = bArr;
                    }
                    j15 = ((long) (vVar.f34933c - vVar.f34932b)) + j12;
                    vVar = vVar.f34936f;
                    j0.f(vVar);
                    bArrE = bArr4;
                    j12 = j15;
                }
            } else {
                while (j11 > 0) {
                    vVar = vVar.f34937g;
                    j0.f(vVar);
                    j11 -= (long) (vVar.f34933c - vVar.f34932b);
                }
                byte[] bArrE2 = gVar.e();
                byte b11 = bArrE2[0];
                int iC2 = gVar.c();
                byte[] bArr5 = bArrE2;
                long j16 = (cVarR.f34879d - ((long) iC2)) + 1;
                long j17 = 0;
                loop1: while (true) {
                    if (j11 >= j16) {
                        jC = -1;
                        break;
                    }
                    byte[] bArr6 = vVar.f34931a;
                    int iMin2 = (int) Math.min(vVar.f34933c, (((long) vVar.f34932b) + j16) - j11);
                    int i11 = (int) ((((long) vVar.f34932b) + j17) - j11);
                    while (i11 < iMin2) {
                        if (bArr6[i11] == b11) {
                            bArr2 = bArr5;
                            if (a.a(vVar, i11 + 1, bArr2, 1, iC2)) {
                                jC = ((long) (i11 - vVar.f34932b)) + j11;
                                break loop1;
                            }
                        } else {
                            bArr2 = bArr5;
                        }
                        i11++;
                        bArr5 = bArr2;
                    }
                    j17 = j11 + ((long) (vVar.f34933c - vVar.f34932b));
                    vVar = vVar.f34936f;
                    j0.f(vVar);
                    j11 = j17;
                }
            }
        } else {
            jC = -1;
            break;
        }
        if (jC == -1) {
            jC = (this.source.r().f34879d - ((long) this.crlfDashDashBoundary.c())) + 1;
        }
        return Math.min(j10, jC);
    }

    public final String boundary() {
        return this.boundary;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.currentPart = null;
        this.source.close();
    }

    public final Part nextPart() throws IOException {
        f fVar;
        g gVar;
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        if (this.noMoreParts) {
            return null;
        }
        if (this.partCount == 0 && this.source.G(0L, this.dashDashBoundary)) {
            fVar = this.source;
            gVar = this.dashDashBoundary;
        } else {
            while (true) {
                long jCurrentPartBytesRemaining = currentPartBytesRemaining(FileAppender.DEFAULT_BUFFER_SIZE);
                if (jCurrentPartBytesRemaining == 0) {
                    break;
                }
                this.source.skip(jCurrentPartBytesRemaining);
            }
            fVar = this.source;
            gVar = this.crlfDashDashBoundary;
        }
        fVar.skip(gVar.c());
        boolean z10 = false;
        while (true) {
            int iW = this.source.W(afterBoundaryOptions);
            if (iW == -1) {
                throw new ProtocolException("unexpected characters after boundary");
            }
            if (iW == 0) {
                this.partCount++;
                Headers headers = new HeadersReader(this.source).readHeaders();
                PartSource partSource = new PartSource(this);
                this.currentPart = partSource;
                return new Part(headers, o.c(partSource));
            }
            if (iW == 1) {
                if (z10) {
                    throw new ProtocolException("unexpected characters after boundary");
                }
                if (this.partCount == 0) {
                    throw new ProtocolException("expected at least 1 part");
                }
                this.noMoreParts = true;
                return null;
            }
            if (iW == 2 || iW == 3) {
                z10 = true;
            }
        }
    }
}
