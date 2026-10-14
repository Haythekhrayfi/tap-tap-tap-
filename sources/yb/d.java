package yb;

import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends lb.l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g f44829e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g f44830f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f44833i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static boolean f44834j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f44835k;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ThreadFactory f44836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference<a> f44837d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final TimeUnit f44832h = TimeUnit.SECONDS;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f44831g = Long.getLong("rx2.io-keep-alive-time", 60).longValue();

    public static final class a implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f44838c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ConcurrentLinkedQueue<c> f44839d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final nb.a f44840e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final ScheduledExecutorService f44841f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Future<?> f44842g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ThreadFactory f44843h;

        public a(long j10, TimeUnit timeUnit, ThreadFactory threadFactory) {
            ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
            long nanos = timeUnit != null ? timeUnit.toNanos(j10) : 0L;
            this.f44838c = nanos;
            this.f44839d = new ConcurrentLinkedQueue<>();
            this.f44840e = new nb.a();
            this.f44843h = threadFactory;
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = null;
            if (timeUnit != null) {
                scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, d.f44830f);
                scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(this, nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
                scheduledFutureScheduleWithFixedDelay = null;
            }
            this.f44841f = scheduledExecutorServiceNewScheduledThreadPool;
            this.f44842g = scheduledFutureScheduleWithFixedDelay;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f44839d.isEmpty()) {
                return;
            }
            long jNanoTime = System.nanoTime();
            for (c cVar : this.f44839d) {
                if (cVar.f44848e > jNanoTime) {
                    return;
                }
                if (this.f44839d.remove(cVar) && this.f44840e.c(cVar)) {
                    cVar.dispose();
                }
            }
        }
    }

    public static final class b extends lb.l.c implements Runnable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final a f44845d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final c f44846e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final AtomicBoolean f44847f = new AtomicBoolean();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final nb.a f44844c = new nb.a();

        public b(a aVar) {
            c cVar;
            c cVar2;
            this.f44845d = aVar;
            if (aVar.f44840e.f33760d) {
                cVar2 = d.f44833i;
            } else {
                do {
                    if (aVar.f44839d.isEmpty()) {
                        cVar = new c(aVar.f44843h);
                        aVar.f44840e.a(cVar);
                        break;
                    }
                    cVar = aVar.f44839d.poll();
                } while (cVar == null);
                cVar2 = cVar;
            }
            this.f44846e = cVar2;
        }

        @Override // lb.l.c
        public nb.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
            return this.f44844c.f33760d ? qb.c.INSTANCE : this.f44846e.e(runnable, j10, timeUnit, this.f44844c);
        }

        @Override // nb.b
        public void dispose() {
            if (this.f44847f.compareAndSet(false, true)) {
                this.f44844c.dispose();
                if (d.f44834j) {
                    this.f44846e.e(this, 0L, TimeUnit.NANOSECONDS, null);
                    return;
                }
                a aVar = this.f44845d;
                c cVar = this.f44846e;
                Objects.requireNonNull(aVar);
                cVar.f44848e = System.nanoTime() + aVar.f44838c;
                aVar.f44839d.offer(cVar);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = this.f44845d;
            c cVar = this.f44846e;
            Objects.requireNonNull(aVar);
            cVar.f44848e = System.nanoTime() + aVar.f44838c;
            aVar.f44839d.offer(cVar);
        }
    }

    public static final class c extends f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f44848e;

        public c(ThreadFactory threadFactory) {
            super(threadFactory);
            this.f44848e = 0L;
        }
    }

    static {
        c cVar = new c(new g("RxCachedThreadSchedulerShutdown"));
        f44833i = cVar;
        cVar.dispose();
        int iMax = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        g gVar = new g("RxCachedThreadScheduler", iMax);
        f44829e = gVar;
        f44830f = new g("RxCachedWorkerPoolEvictor", iMax);
        f44834j = Boolean.getBoolean("rx2.io-scheduled-release");
        a aVar = new a(0L, null, gVar);
        f44835k = aVar;
        aVar.f44840e.dispose();
        Future<?> future = aVar.f44842g;
        if (future != null) {
            future.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = aVar.f44841f;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    public d() {
        this(f44829e);
    }

    public d(ThreadFactory threadFactory) {
        this.f44836c = threadFactory;
        a aVar = f44835k;
        AtomicReference<a> atomicReference = new AtomicReference<>(aVar);
        this.f44837d = atomicReference;
        a aVar2 = new a(f44831g, f44832h, threadFactory);
        if (atomicReference.compareAndSet(aVar, aVar2)) {
            return;
        }
        aVar2.f44840e.dispose();
        Future<?> future = aVar2.f44842g;
        if (future != null) {
            future.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = aVar2.f44841f;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    @Override // lb.l
    public lb.l.c a() {
        return new b(this.f44837d.get());
    }
}
