package yb;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends lb.l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f44865d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference<ScheduledExecutorService> f44866c;

    public static final class a extends lb.l.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ScheduledExecutorService f44867c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final nb.a f44868d = new nb.a();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public volatile boolean f44869e;

        public a(ScheduledExecutorService scheduledExecutorService) {
            this.f44867c = scheduledExecutorService;
        }

        @Override // lb.l.c
        public nb.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
            if (this.f44869e) {
                return qb.c.INSTANCE;
            }
            Objects.requireNonNull(runnable, "run is null");
            j jVar = new j(runnable, this.f44868d);
            this.f44868d.a(jVar);
            try {
                jVar.a(j10 <= 0 ? this.f44867c.submit((Callable) jVar) : this.f44867c.schedule((Callable) jVar, j10, timeUnit));
                return jVar;
            } catch (RejectedExecutionException e10) {
                dispose();
                dc.a.b(e10);
                return qb.c.INSTANCE;
            }
        }

        @Override // nb.b
        public void dispose() {
            if (this.f44869e) {
                return;
            }
            this.f44869e = true;
            this.f44868d.dispose();
        }
    }

    static {
        Executors.newScheduledThreadPool(0).shutdown();
        f44865d = new g("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    }

    public l() {
        this(f44865d);
    }

    public l(ThreadFactory threadFactory) {
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.f44866c = atomicReference;
        atomicReference.lazySet(k.a(threadFactory));
    }

    @Override // lb.l
    public lb.l.c a() {
        return new a(this.f44866c.get());
    }

    @Override // lb.l
    public nb.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
        Objects.requireNonNull(runnable, "run is null");
        i iVar = new i(runnable);
        try {
            iVar.a(j10 <= 0 ? this.f44866c.get().submit(iVar) : this.f44866c.get().schedule(iVar, j10, timeUnit));
            return iVar;
        } catch (RejectedExecutionException e10) {
            dc.a.b(e10);
            return qb.c.INSTANCE;
        }
    }

    @Override // lb.l
    public nb.b d(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        try {
            if (j11 > 0) {
                h hVar = new h(runnable);
                hVar.a(this.f44866c.get().scheduleAtFixedRate(hVar, j10, j11, timeUnit));
                return hVar;
            }
            ScheduledExecutorService scheduledExecutorService = this.f44866c.get();
            c cVar = new c(runnable, scheduledExecutorService);
            cVar.a(j10 <= 0 ? scheduledExecutorService.submit(cVar) : scheduledExecutorService.schedule(cVar, j10, timeUnit));
            return cVar;
        } catch (RejectedExecutionException e10) {
            dc.a.b(e10);
            return qb.c.INSTANCE;
        }
    }
}
