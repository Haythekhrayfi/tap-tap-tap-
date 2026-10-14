package yb;

import java.util.Objects;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends lb.l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m f44870c = new m();

    public static final class a implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Runnable f44871c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final c f44872d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f44873e;

        public a(Runnable runnable, c cVar, long j10) {
            this.f44871c = runnable;
            this.f44872d = cVar;
            this.f44873e = j10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f44872d.f44881f) {
                return;
            }
            long jA = this.f44872d.a(TimeUnit.MILLISECONDS);
            long j10 = this.f44873e;
            if (j10 > jA) {
                try {
                    Thread.sleep(j10 - jA);
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                    dc.a.b(e10);
                    return;
                }
            }
            if (this.f44872d.f44881f) {
                return;
            }
            this.f44871c.run();
        }
    }

    public static final class b implements Comparable<b> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Runnable f44874c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f44875d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f44876e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public volatile boolean f44877f;

        public b(Runnable runnable, Long l10, int i10) {
            this.f44874c = runnable;
            this.f44875d = l10.longValue();
            this.f44876e = i10;
        }

        @Override // java.lang.Comparable
        public int compareTo(b bVar) {
            int i10;
            b bVar2 = bVar;
            long j10 = this.f44875d;
            long j11 = bVar2.f44875d;
            int i11 = 1;
            if (j10 < j11) {
                i10 = -1;
            } else {
                i10 = j10 > j11 ? 1 : 0;
            }
            if (i10 != 0) {
                return i10;
            }
            int i12 = this.f44876e;
            int i13 = bVar2.f44876e;
            if (i12 < i13) {
                i11 = -1;
            } else if (i12 <= i13) {
                i11 = 0;
            }
            return i11;
        }
    }

    public static final class c extends lb.l.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final PriorityBlockingQueue<b> f44878c = new PriorityBlockingQueue<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicInteger f44879d = new AtomicInteger();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final AtomicInteger f44880e = new AtomicInteger();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public volatile boolean f44881f;

        public final class a implements Runnable {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final b f44882c;

            public a(b bVar) {
                this.f44882c = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f44882c.f44877f = true;
                c.this.f44878c.remove(this.f44882c);
            }
        }

        @Override // lb.l.c
        public nb.b b(Runnable runnable) {
            return e(runnable, a(TimeUnit.MILLISECONDS));
        }

        @Override // lb.l.c
        public nb.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
            long millis = timeUnit.toMillis(j10) + a(TimeUnit.MILLISECONDS);
            return e(new a(runnable, this, millis), millis);
        }

        @Override // nb.b
        public void dispose() {
            this.f44881f = true;
        }

        public nb.b e(Runnable runnable, long j10) {
            if (this.f44881f) {
                return qb.c.INSTANCE;
            }
            b bVar = new b(runnable, Long.valueOf(j10), this.f44880e.incrementAndGet());
            this.f44878c.add(bVar);
            if (this.f44879d.getAndIncrement() != 0) {
                return new nb.c(new a(bVar));
            }
            int iAddAndGet = 1;
            while (!this.f44881f) {
                b bVarPoll = this.f44878c.poll();
                if (bVarPoll == null) {
                    iAddAndGet = this.f44879d.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return qb.c.INSTANCE;
                    }
                } else if (!bVarPoll.f44877f) {
                    bVarPoll.f44874c.run();
                }
            }
            this.f44878c.clear();
            return qb.c.INSTANCE;
        }
    }

    @Override // lb.l
    public lb.l.c a() {
        return new c();
    }

    @Override // lb.l
    public nb.b b(Runnable runnable) {
        runnable.run();
        return qb.c.INSTANCE;
    }

    @Override // lb.l
    public nb.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j10);
            Objects.requireNonNull(runnable, "run is null");
            runnable.run();
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            dc.a.b(e10);
        }
        return qb.c.INSTANCE;
    }
}
