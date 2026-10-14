package lb;

import java.util.Objects;
import java.util.concurrent.TimeUnit;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f33054a = Boolean.getBoolean("rx2.scheduler.use-nanotime");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f33055b = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    public static final class a implements nb.b, Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Runnable f33056c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final c f33057d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Thread f33058e;

        public a(Runnable runnable, c cVar) {
            this.f33056c = runnable;
            this.f33057d = cVar;
        }

        @Override // nb.b
        public void dispose() {
            if (this.f33058e == Thread.currentThread()) {
                c cVar = this.f33057d;
                if (cVar instanceof yb.f) {
                    yb.f fVar = (yb.f) cVar;
                    if (fVar.f44852d) {
                        return;
                    }
                    fVar.f44852d = true;
                    fVar.f44851c.shutdown();
                    return;
                }
            }
            this.f33057d.dispose();
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f33058e = Thread.currentThread();
            try {
                this.f33056c.run();
            } finally {
                dispose();
                this.f33058e = null;
            }
        }
    }

    public static final class b implements nb.b, Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Runnable f33059c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final c f33060d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public volatile boolean f33061e;

        public b(Runnable runnable, c cVar) {
            this.f33059c = runnable;
            this.f33060d = cVar;
        }

        @Override // nb.b
        public void dispose() {
            this.f33061e = true;
            this.f33060d.dispose();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f33061e) {
                return;
            }
            try {
                this.f33059c.run();
            } catch (Throwable th) {
                c0.Q(th);
                this.f33060d.dispose();
                throw bc.e.d(th);
            }
        }
    }

    public static abstract class c implements nb.b {

        public final class a implements Runnable {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Runnable f33062c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final qb.e f33063d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final long f33064e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public long f33065f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public long f33066g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public long f33067h;

            public a(long j10, Runnable runnable, long j11, qb.e eVar, long j12) {
                this.f33062c = runnable;
                this.f33063d = eVar;
                this.f33064e = j12;
                this.f33066g = j11;
                this.f33067h = j10;
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0034  */
            @Override // java.lang.Runnable
            public void run() {
                long j10;
                this.f33062c.run();
                if (this.f33063d.a()) {
                    return;
                }
                c cVar = c.this;
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                long jA = cVar.a(timeUnit);
                long j11 = l.f33055b;
                long j12 = jA + j11;
                long j13 = this.f33066g;
                if (j12 >= j13) {
                    long j14 = this.f33064e;
                    if (jA >= j13 + j14 + j11) {
                        long j15 = this.f33064e;
                        j10 = jA + j15;
                        long j16 = this.f33065f + 1;
                        this.f33065f = j16;
                        this.f33067h = j10 - (j15 * j16);
                    } else {
                        long j17 = this.f33067h;
                        long j18 = this.f33065f + 1;
                        this.f33065f = j18;
                        j10 = (j18 * j14) + j17;
                    }
                } else {
                    long j19 = this.f33064e;
                    j10 = jA + j19;
                    long j110 = this.f33065f + 1;
                    this.f33065f = j110;
                    this.f33067h = j10 - (j19 * j110);
                }
                this.f33066g = jA;
                qb.e eVar = this.f33063d;
                nb.b bVarC = c.this.c(this, j10 - jA, timeUnit);
                Objects.requireNonNull(eVar);
                qb.b.replace(eVar, bVarC);
            }
        }

        public long a(TimeUnit timeUnit) {
            long jNanoTime;
            TimeUnit timeUnit2;
            if (l.f33054a) {
                jNanoTime = System.nanoTime();
                timeUnit2 = TimeUnit.NANOSECONDS;
            } else {
                jNanoTime = System.currentTimeMillis();
                timeUnit2 = TimeUnit.MILLISECONDS;
            }
            return timeUnit.convert(jNanoTime, timeUnit2);
        }

        public nb.b b(Runnable runnable) {
            return c(runnable, 0L, TimeUnit.NANOSECONDS);
        }

        public abstract nb.b c(Runnable runnable, long j10, TimeUnit timeUnit);

        public nb.b d(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
            qb.e eVar = new qb.e();
            qb.e eVar2 = new qb.e(eVar);
            long nanos = timeUnit.toNanos(j11);
            long jA = a(TimeUnit.NANOSECONDS);
            nb.b bVarC = c(new a(timeUnit.toNanos(j10) + jA, runnable, jA, eVar2, nanos), j10, timeUnit);
            if (bVarC == qb.c.INSTANCE) {
                return bVarC;
            }
            qb.b.replace(eVar, bVarC);
            return eVar2;
        }
    }

    public abstract c a();

    public nb.b b(Runnable runnable) {
        return c(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public nb.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
        c cVarA = a();
        Objects.requireNonNull(runnable, "run is null");
        a aVar = new a(runnable, cVarA);
        cVarA.c(aVar, j10, timeUnit);
        return aVar;
    }

    public nb.b d(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        c cVarA = a();
        b bVar = new b(runnable, cVarA);
        nb.b bVarD = cVarA.d(bVar, j10, j11, timeUnit);
        return bVarD == qb.c.INSTANCE ? bVarD : bVar;
    }
}
