package qd;

import fd.j0;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class k extends b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b0 f34900a;

    public k(b0 b0Var) {
        j0.i(b0Var, "delegate");
        this.f34900a = b0Var;
    }

    @Override // qd.b0
    public b0 clearDeadline() {
        return this.f34900a.clearDeadline();
    }

    @Override // qd.b0
    public b0 clearTimeout() {
        return this.f34900a.clearTimeout();
    }

    @Override // qd.b0
    public long deadlineNanoTime() {
        return this.f34900a.deadlineNanoTime();
    }

    @Override // qd.b0
    public b0 deadlineNanoTime(long j10) {
        return this.f34900a.deadlineNanoTime(j10);
    }

    @Override // qd.b0
    public boolean hasDeadline() {
        return this.f34900a.hasDeadline();
    }

    @Override // qd.b0
    public void throwIfReached() throws IOException {
        this.f34900a.throwIfReached();
    }

    @Override // qd.b0
    public b0 timeout(long j10, TimeUnit timeUnit) {
        j0.i(timeUnit, "unit");
        return this.f34900a.timeout(j10, timeUnit);
    }

    @Override // qd.b0
    public long timeoutNanos() {
        return this.f34900a.timeoutNanos();
    }
}
