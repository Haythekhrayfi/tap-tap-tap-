package qd;

import fd.j0;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class b0 {
    public static final b Companion = new b(null);
    public static final b0 NONE = new a();
    private long deadlineNanoTime;
    private boolean hasDeadline;
    private long timeoutNanos;

    public static final class a extends b0 {
        @Override // qd.b0
        public b0 deadlineNanoTime(long j10) {
            return this;
        }

        @Override // qd.b0
        public void throwIfReached() {
        }

        @Override // qd.b0
        public b0 timeout(long j10, TimeUnit timeUnit) {
            j0.i(timeUnit, "unit");
            return this;
        }
    }

    public static final class b {
        public b() {
        }

        public b(vc.g gVar) {
        }

        public final long a(long j10, long j11) {
            return (j10 != 0 && (j11 == 0 || j10 < j11)) ? j10 : j11;
        }
    }

    public b0 clearDeadline() {
        this.hasDeadline = false;
        return this;
    }

    public b0 clearTimeout() {
        this.timeoutNanos = 0L;
        return this;
    }

    public final b0 deadline(long j10, TimeUnit timeUnit) {
        j0.i(timeUnit, "unit");
        if (j10 > 0) {
            return deadlineNanoTime(timeUnit.toNanos(j10) + System.nanoTime());
        }
        throw new IllegalArgumentException(androidx.viewpager2.adapter.a.a("duration <= 0: ", j10).toString());
    }

    public long deadlineNanoTime() {
        if (this.hasDeadline) {
            return this.deadlineNanoTime;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public b0 deadlineNanoTime(long j10) {
        this.hasDeadline = true;
        this.deadlineNanoTime = j10;
        return this;
    }

    public boolean hasDeadline() {
        return this.hasDeadline;
    }

    public final <T> T intersectWith(b0 b0Var, uc.a<? extends T> aVar) {
        j0.i(b0Var, "other");
        j0.i(aVar, "block");
        long jTimeoutNanos = timeoutNanos();
        timeout(Companion.a(b0Var.timeoutNanos(), timeoutNanos()), TimeUnit.NANOSECONDS);
        if (!hasDeadline()) {
            if (b0Var.hasDeadline()) {
                deadlineNanoTime(b0Var.deadlineNanoTime());
            }
            try {
                return aVar.invoke();
            } finally {
                timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
                if (b0Var.hasDeadline()) {
                    clearDeadline();
                }
            }
        }
        long jDeadlineNanoTime = deadlineNanoTime();
        if (b0Var.hasDeadline()) {
            deadlineNanoTime(Math.min(deadlineNanoTime(), b0Var.deadlineNanoTime()));
        }
        try {
            return aVar.invoke();
        } finally {
            timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
            if (b0Var.hasDeadline()) {
                deadlineNanoTime(jDeadlineNanoTime);
            }
        }
    }

    public void throwIfReached() throws IOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.hasDeadline && this.deadlineNanoTime - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public b0 timeout(long j10, TimeUnit timeUnit) {
        j0.i(timeUnit, "unit");
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(androidx.viewpager2.adapter.a.a("timeout < 0: ", j10).toString());
        }
        this.timeoutNanos = timeUnit.toNanos(j10);
        return this;
    }

    public long timeoutNanos() {
        return this.timeoutNanos;
    }

    public final void waitUntilNotified(Object obj) throws InterruptedIOException {
        j0.i(obj, "monitor");
        try {
            boolean zHasDeadline = hasDeadline();
            long jTimeoutNanos = timeoutNanos();
            long jNanoTime = 0;
            if (!zHasDeadline && jTimeoutNanos == 0) {
                obj.wait();
                return;
            }
            long jNanoTime2 = System.nanoTime();
            if (zHasDeadline && jTimeoutNanos != 0) {
                jTimeoutNanos = Math.min(jTimeoutNanos, deadlineNanoTime() - jNanoTime2);
            } else if (zHasDeadline) {
                jTimeoutNanos = deadlineNanoTime() - jNanoTime2;
            }
            if (jTimeoutNanos > 0) {
                long j10 = jTimeoutNanos / 1000000;
                obj.wait(j10, (int) (jTimeoutNanos - (1000000 * j10)));
                jNanoTime = System.nanoTime() - jNanoTime2;
            }
            if (jNanoTime >= jTimeoutNanos) {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }
}
