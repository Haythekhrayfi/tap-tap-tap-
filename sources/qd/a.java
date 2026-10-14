package qd;

import ch.qos.logback.core.CoreConstants;
import fd.j0;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class a extends b0 {
    public static final C0395a Companion = new C0395a(null);
    private static final long IDLE_TIMEOUT_MILLIS;
    private static final long IDLE_TIMEOUT_NANOS;
    private static final int TIMEOUT_WRITE_SIZE = 65536;
    private static a head;
    private boolean inQueue;
    private a next;
    private long timeoutAt;

    /* JADX INFO: renamed from: qd.a$a, reason: collision with other inner class name */
    public static final class C0395a {
        public C0395a() {
        }

        public C0395a(vc.g gVar) {
        }

        public final a a() throws InterruptedException {
            a aVar = a.head;
            j0.f(aVar);
            a aVar2 = aVar.next;
            long jNanoTime = System.nanoTime();
            if (aVar2 == null) {
                a.class.wait(a.IDLE_TIMEOUT_MILLIS);
                a aVar3 = a.head;
                j0.f(aVar3);
                if (aVar3.next != null || System.nanoTime() - jNanoTime < a.IDLE_TIMEOUT_NANOS) {
                    return null;
                }
                return a.head;
            }
            long jRemainingNanos = aVar2.remainingNanos(jNanoTime);
            if (jRemainingNanos > 0) {
                long j10 = jRemainingNanos / 1000000;
                a.class.wait(j10, (int) (jRemainingNanos - (1000000 * j10)));
                return null;
            }
            a aVar4 = a.head;
            j0.f(aVar4);
            aVar4.next = aVar2.next;
            aVar2.next = null;
            return aVar2;
        }
    }

    public static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            a aVarA;
            while (true) {
                try {
                    synchronized (a.class) {
                        aVarA = a.Companion.a();
                        if (aVarA == a.head) {
                            a.head = null;
                            return;
                        }
                    }
                    if (aVarA != null) {
                        aVarA.timedOut();
                    }
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    public static final class c implements y {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ y f34875d;

        public c(y yVar) {
            this.f34875d = yVar;
        }

        @Override // qd.y, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            a aVar = a.this;
            y yVar = this.f34875d;
            aVar.enter();
            try {
                try {
                    yVar.close();
                    if (aVar.exit()) {
                        throw aVar.access$newTimeoutException(null);
                    }
                } catch (IOException e10) {
                    if (!aVar.exit()) {
                        throw e10;
                    }
                    throw aVar.access$newTimeoutException(e10);
                }
            } catch (Throwable th) {
                aVar.exit();
                throw th;
            }
        }

        @Override // qd.y, java.io.Flushable
        public void flush() throws IOException {
            a aVar = a.this;
            y yVar = this.f34875d;
            aVar.enter();
            try {
                try {
                    yVar.flush();
                    if (aVar.exit()) {
                        throw aVar.access$newTimeoutException(null);
                    }
                } catch (IOException e10) {
                    if (!aVar.exit()) {
                        throw e10;
                    }
                    throw aVar.access$newTimeoutException(e10);
                }
            } catch (Throwable th) {
                aVar.exit();
                throw th;
            }
        }

        @Override // qd.y
        public b0 timeout() {
            return a.this;
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("AsyncTimeout.sink(");
            sbA.append(this.f34875d);
            sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            return sbA.toString();
        }

        @Override // qd.y
        public void write(qd.c cVar, long j10) throws IOException {
            j0.i(cVar, "source");
            d0.b(cVar.f34879d, 0L, j10);
            while (true) {
                long j11 = 0;
                if (j10 <= 0) {
                    return;
                }
                v vVar = cVar.f34878c;
                while (true) {
                    j0.f(vVar);
                    if (j11 >= 65536) {
                        break;
                    }
                    j11 += (long) (vVar.f34933c - vVar.f34932b);
                    if (j11 >= j10) {
                        j11 = j10;
                        break;
                    }
                    vVar = vVar.f34936f;
                }
                a aVar = a.this;
                y yVar = this.f34875d;
                aVar.enter();
                try {
                    try {
                        yVar.write(cVar, j11);
                        if (aVar.exit()) {
                            throw aVar.access$newTimeoutException(null);
                        }
                        j10 -= j11;
                    } catch (IOException e10) {
                        if (!aVar.exit()) {
                            throw e10;
                        }
                        throw aVar.access$newTimeoutException(e10);
                    }
                } catch (Throwable th) {
                    aVar.exit();
                    throw th;
                }
            }
        }
    }

    public static final class d implements a0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a0 f34877d;

        public d(a0 a0Var) {
            this.f34877d = a0Var;
        }

        @Override // qd.a0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            a aVar = a.this;
            a0 a0Var = this.f34877d;
            aVar.enter();
            try {
                try {
                    a0Var.close();
                    if (aVar.exit()) {
                        throw aVar.access$newTimeoutException(null);
                    }
                } catch (IOException e10) {
                    if (!aVar.exit()) {
                        throw e10;
                    }
                    throw aVar.access$newTimeoutException(e10);
                }
            } catch (Throwable th) {
                aVar.exit();
                throw th;
            }
        }

        @Override // qd.a0
        public long read(qd.c cVar, long j10) throws IOException {
            j0.i(cVar, "sink");
            a aVar = a.this;
            a0 a0Var = this.f34877d;
            aVar.enter();
            try {
                try {
                    long j11 = a0Var.read(cVar, j10);
                    if (aVar.exit()) {
                        throw aVar.access$newTimeoutException(null);
                    }
                    return j11;
                } catch (IOException e10) {
                    if (aVar.exit()) {
                        throw aVar.access$newTimeoutException(e10);
                    }
                    throw e10;
                }
            } catch (Throwable th) {
                aVar.exit();
                throw th;
            }
        }

        @Override // qd.a0
        public b0 timeout() {
            return a.this;
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("AsyncTimeout.source(");
            sbA.append(this.f34877d);
            sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            return sbA.toString();
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        IDLE_TIMEOUT_MILLIS = millis;
        IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long remainingNanos(long j10) {
        return this.timeoutAt - j10;
    }

    public final IOException access$newTimeoutException(IOException iOException) {
        return newTimeoutException(iOException);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006d A[Catch: all -> 0x00a9, TryCatch #0 {, blocks: (B:8:0x0019, B:10:0x0021, B:12:0x002a, B:13:0x003a, B:16:0x0042, B:18:0x004e, B:21:0x005c, B:22:0x0064, B:24:0x006d, B:27:0x007d, B:28:0x0082, B:30:0x0092, B:20:0x0055, B:33:0x0097, B:34:0x009c, B:35:0x009d, B:36:0x00a8), top: B:40:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x007d A[Catch: all -> 0x00a9, LOOP:0: B:22:0x0064->B:27:0x007d, LOOP_END, TryCatch #0 {, blocks: (B:8:0x0019, B:10:0x0021, B:12:0x002a, B:13:0x003a, B:16:0x0042, B:18:0x004e, B:21:0x005c, B:22:0x0064, B:24:0x006d, B:27:0x007d, B:28:0x0082, B:30:0x0092, B:20:0x0055, B:33:0x0097, B:34:0x009c, B:35:0x009d, B:36:0x00a8), top: B:40:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0092 A[Catch: all -> 0x00a9, TRY_LEAVE, TryCatch #0 {, blocks: (B:8:0x0019, B:10:0x0021, B:12:0x002a, B:13:0x003a, B:16:0x0042, B:18:0x004e, B:21:0x005c, B:22:0x0064, B:24:0x006d, B:27:0x007d, B:28:0x0082, B:30:0x0092, B:20:0x0055, B:33:0x0097, B:34:0x009c, B:35:0x009d, B:36:0x00a8), top: B:40:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0082 A[EDGE_INSN: B:41:0x0082->B:28:0x0082 BREAK  A[LOOP:0: B:22:0x0064->B:27:0x007d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x007c A[SYNTHETIC] */
    public final void enter() {
        long jRemainingNanos;
        a aVar;
        a aVar2;
        long jTimeoutNanos = timeoutNanos();
        boolean zHasDeadline = hasDeadline();
        if (jTimeoutNanos != 0 || zHasDeadline) {
            Objects.requireNonNull(Companion);
            synchronized (a.class) {
                if (!(!this.inQueue)) {
                    throw new IllegalStateException("Unbalanced enter/exit".toString());
                }
                this.inQueue = true;
                if (head == null) {
                    head = new a();
                    new b().start();
                }
                long jNanoTime = System.nanoTime();
                if (jTimeoutNanos == 0 || !zHasDeadline) {
                    if (jTimeoutNanos == 0) {
                        if (!zHasDeadline) {
                            throw new AssertionError();
                        }
                        this.timeoutAt = deadlineNanoTime();
                    }
                    jRemainingNanos = remainingNanos(jNanoTime);
                    aVar = head;
                    while (true) {
                        j0.f(aVar);
                        if (aVar.next != null) {
                            break;
                        }
                        aVar2 = aVar.next;
                        j0.f(aVar2);
                        if (jRemainingNanos < aVar2.remainingNanos(jNanoTime)) {
                            break;
                        } else {
                            aVar = aVar.next;
                        }
                    }
                    this.next = aVar.next;
                    aVar.next = this;
                    if (aVar == head) {
                        a.class.notify();
                    }
                } else {
                    jTimeoutNanos = Math.min(jTimeoutNanos, deadlineNanoTime() - jNanoTime);
                }
                this.timeoutAt = jTimeoutNanos + jNanoTime;
                jRemainingNanos = remainingNanos(jNanoTime);
                aVar = head;
                while (true) {
                    j0.f(aVar);
                    if (aVar.next != null) {
                        break;
                        break;
                    }
                    aVar2 = aVar.next;
                    j0.f(aVar2);
                    if (jRemainingNanos < aVar2.remainingNanos(jNanoTime)) {
                        break;
                        break;
                    }
                    aVar = aVar.next;
                }
                this.next = aVar.next;
                aVar.next = this;
                if (aVar == head) {
                    a.class.notify();
                }
            }
        }
    }

    public final boolean exit() {
        boolean z10;
        Objects.requireNonNull(Companion);
        synchronized (a.class) {
            z10 = false;
            if (this.inQueue) {
                this.inQueue = false;
                for (a aVar = head; aVar != null; aVar = aVar.next) {
                    if (aVar.next == this) {
                        aVar.next = this.next;
                        this.next = null;
                    }
                }
                z10 = true;
            }
        }
        return z10;
    }

    public IOException newTimeoutException(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final y sink(y yVar) {
        j0.i(yVar, "sink");
        return new c(yVar);
    }

    public final a0 source(a0 a0Var) {
        j0.i(a0Var, "source");
        return new d(a0Var);
    }

    public void timedOut() {
    }

    public final <T> T withTimeout(uc.a<? extends T> aVar) throws IOException {
        j0.i(aVar, "block");
        enter();
        try {
            try {
                T tInvoke = aVar.invoke();
                if (exit()) {
                    throw access$newTimeoutException(null);
                }
                return tInvoke;
            } catch (IOException e10) {
                if (exit()) {
                    throw access$newTimeoutException(e10);
                }
                throw e10;
            }
        } catch (Throwable th) {
            exit();
            throw th;
        }
    }
}
