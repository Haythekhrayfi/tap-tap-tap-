package yb;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class f extends lb.l.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f44851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f44852d;

    public f(ThreadFactory threadFactory) {
        this.f44851c = k.a(threadFactory);
    }

    @Override // lb.l.c
    public nb.b b(Runnable runnable) {
        return c(runnable, 0L, null);
    }

    @Override // lb.l.c
    public nb.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
        return this.f44852d ? qb.c.INSTANCE : e(runnable, j10, timeUnit, null);
    }

    @Override // nb.b
    public void dispose() {
        if (this.f44852d) {
            return;
        }
        this.f44852d = true;
        this.f44851c.shutdownNow();
    }

    public j e(Runnable runnable, long j10, TimeUnit timeUnit, qb.a aVar) {
        Objects.requireNonNull(runnable, "run is null");
        j jVar = new j(runnable, aVar);
        if (aVar != null && !aVar.a(jVar)) {
            return jVar;
        }
        try {
            jVar.a(j10 <= 0 ? this.f44851c.submit((Callable) jVar) : this.f44851c.schedule((Callable) jVar, j10, timeUnit));
        } catch (RejectedExecutionException e10) {
            if (aVar != null) {
                aVar.b(jVar);
            }
            dc.a.b(e10);
        }
        return jVar;
    }
}
